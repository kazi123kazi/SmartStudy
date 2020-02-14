package com.example.imageslider;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;

public class RegisterActivity extends AppCompatActivity {
    private Button sign_btn;
    private ProgressDialog lodingBar;
    private EditText InputName,InputPhoneNumber,InputPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        sign_btn=(Button)findViewById(R.id.sign_btn);
        InputName=(EditText)findViewById(R.id.register_username_input);
        InputPhoneNumber=(EditText)findViewById(R.id.register_phone_number_input);
        InputPassword=(EditText)findViewById(R.id.register_password_input);

        lodingBar=new ProgressDialog(RegisterActivity.this);


        sign_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createAccount();
            }
        });



    }

    private void createAccount() {

        String name=InputName.getText().toString();
        String phone=InputPhoneNumber.getText().toString();
        String password=InputPassword.getText().toString();

        if(TextUtils.isEmpty(name))
        {
            Toast.makeText(RegisterActivity.this,"Please provide name...",Toast.LENGTH_SHORT).show();

        }
        else  if(TextUtils.isEmpty(phone))
        {
            Toast.makeText(RegisterActivity.this,"Please provide Phone number...",Toast.LENGTH_SHORT).show();

        }
        else if(TextUtils.isEmpty(password))
        {
            Toast.makeText(RegisterActivity.this,"Please provide a strong password...",Toast.LENGTH_SHORT).show();

        }
        else
        {
            lodingBar.setTitle("Create Account");
            lodingBar.setMessage("Please wait while we are checking the credential.");
            lodingBar.setCanceledOnTouchOutside(false);   /// what it do
            lodingBar.show();

            validatePhoneNumber(name,phone,password);//to check if phone number is already exist

        }






    }

    private void validatePhoneNumber(final String name , final String phone , final String password) {
        final DatabaseReference rootRef;
        rootRef= FirebaseDatabase.getInstance().getReference();
        rootRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot)
            {
                if (!( dataSnapshot.child("Users").child(phone).exists()))
                {
                    HashMap<String, Object> userDataMap = new HashMap<>();
                    userDataMap.put("phone",phone);
                    userDataMap.put("password",password);
                    userDataMap.put("name",name);

                    rootRef.child("Users").child(phone).updateChildren(userDataMap)
                            .addOnCompleteListener(new OnCompleteListener<Void>() {
                                @Override
                                public void onComplete(Task<Void> task)
                                {
                                    if (task.isSuccessful())
                                    {
                                        Toast.makeText(RegisterActivity.this,"Congratulations! Your account has been created successfully.",Toast.LENGTH_SHORT).show();
                                        lodingBar.dismiss();
                                        Intent intent=new Intent(RegisterActivity.this,LoginActivity.class);
                                        startActivity(intent);
                                    }
                                    else
                                    {   lodingBar.dismiss();
                                        Toast.makeText(RegisterActivity.this, "Failed! Check your Internet Connection and try again.", Toast.LENGTH_SHORT).show();
                                    }
                                }
                            });
                }
                else
                {
                    Toast.makeText(RegisterActivity.this,"This "+ phone +"already exist.",Toast.LENGTH_SHORT).show();
                    lodingBar.dismiss();
                    Toast.makeText(RegisterActivity.this,"Please try with a new number",Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(RegisterActivity.this,MainActivity.class);

                    startActivity(intent);

                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError)
            {
                // Toast.makeText(RegisterActivity.this."Database error!!",Toast.LENGTH_SHORT).show();

            }
        });



    }
}
