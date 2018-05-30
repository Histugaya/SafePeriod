package com.example.roshan.design_safeperiods;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityUserlogin extends AppCompatActivity {
Button loginuser, registeruser;
EditText usernameuser, passworduser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userlogin);

        loginuser = (Button) findViewById(R.id.bttn_login_user);
        registeruser = (Button) findViewById(R.id.bttn_register_user);
        usernameuser = (EditText) findViewById(R.id.edtxt_username_user);
        passworduser = (EditText) findViewById(R.id.edtxt_password_user);

        loginuser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityUserlogin.this, Activity_BlogDashboard_User.class);
                startActivity(intent);
            }
        });

        registeruser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityUserlogin.this, ActivityUserRegistration.class);
                startActivity(intent);
            }
        });


    }
}
