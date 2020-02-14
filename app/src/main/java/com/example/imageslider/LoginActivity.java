package com.example.imageslider;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import android.widget.EditText;
import android.widget.Toast;

import com.example.imageslider.Model.Users;
import com.example.imageslider.Prevalent.Prevalent;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


import static com.example.imageslider.Prevalent.Prevalent.UserPasswordKey;
import static com.example.imageslider.Prevalent.Prevalent.UserPhoneKey;

public class LoginActivity extends AppCompatActivity {
   private Button login_btn;
    private EditText InputNumber,InputPassword;
    private ProgressDialog lodingBar;
    private  String parentDbName="Users";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login_btn=(Button)findViewById(R.id.login_btn);
        InputNumber=(EditText)findViewById(R.id.login_phone_number_input);
        InputPassword=(EditText)findViewById(R.id.login_password_input);




        lodingBar=new ProgressDialog(LoginActivity.this);

        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                loginUser();

            }
        });


    }

    private void loginUser() {

        String phone=InputNumber.getText().toString();
        String password=InputPassword.getText().toString();

        if(TextUtils.isEmpty(phone)) {
            Toast.makeText(LoginActivity.this , "Please provide Phone number..." , Toast.LENGTH_SHORT).show();

        } else if (TextUtils.isEmpty(password)) {
            Toast.makeText(LoginActivity.this , "Please provide a strong password..." , Toast.LENGTH_SHORT).show();

        }
        else
        {
            lodingBar.setTitle("Login Account");
            lodingBar.setMessage("Please wait while we are checking the credential.");
            lodingBar.setCanceledOnTouchOutside(false);   ///
            lodingBar.show();

            allowAccessToAccount(phone,password);

        }


    }

    private void allowAccessToAccount(final String phone , final String password)
    {

        final DatabaseReference rootRef;
        rootRef= FirebaseDatabase.getInstance().getReference();

        rootRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot)
            {
                if(dataSnapshot.child(parentDbName).child(phone).exists())
                {
                    Users userData;
                    userData = dataSnapshot.child(parentDbName).child(phone).getValue(Users.class);

                    if(userData.getPhone().equals(phone))
                    {

                        if(userData.getPassword().equals(password))
                        {

                            if(parentDbName.equals("Admins"))
                            {
                                Toast.makeText(LoginActivity.this,"Admin ,You are logged in successfully...",Toast.LENGTH_SHORT).show();
                                lodingBar.dismiss();
                                Intent intent=new Intent(LoginActivity.this, MainActivity.class);
                                startActivity(intent);

                            }
                            else if (parentDbName.equals("Users"))
                            {
                                Toast.makeText(LoginActivity.this,"Logged in successfully...",Toast.LENGTH_SHORT).show();
                                lodingBar.dismiss();

                                Intent intent=new Intent(LoginActivity.this, MainActivity.class);
                                Prevalent.currentOnlineUser=userData;
                                startActivity(intent);
                                Log.i("see","reach");


                            }

                        }
                    }


                }
                else
                {
                    Toast.makeText(LoginActivity.this,"Your Phone or Password is not correct.Please check it and try again.",Toast.LENGTH_SHORT).show();
                    lodingBar.dismiss();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });




    }
}
