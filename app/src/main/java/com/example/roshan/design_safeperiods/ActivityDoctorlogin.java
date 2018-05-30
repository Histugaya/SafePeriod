package com.example.roshan.design_safeperiods;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityDoctorlogin extends AppCompatActivity {

    Button logindoctor, registerdoctor;
    EditText usernamedoctor, passworddoctor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctorlogin);

        logindoctor = (Button) findViewById(R.id.bttn_login_doctor);
        registerdoctor = (Button) findViewById(R.id.bttn_register_doctor);
        usernamedoctor = (EditText) findViewById(R.id.edtxt_username_doctor);
        passworddoctor = (EditText) findViewById(R.id.edtxt_password_doctor);

        logindoctor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityDoctorlogin.this, Activity_BlogDashboard_Doctor.class);
                startActivity(intent);
            }
        });

        registerdoctor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityDoctorlogin.this, ActivityDoctorRegistration.class);
                startActivity(intent);
            }
        });

    }
}
