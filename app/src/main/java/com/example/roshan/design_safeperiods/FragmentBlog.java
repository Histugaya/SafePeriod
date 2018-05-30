package com.example.roshan.design_safeperiods;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class FragmentBlog extends Fragment {
    Button doctor_textview, user_textview;
    View view;





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_blog, container, false);

        doctor_textview = (Button) view.findViewById(R.id.icon_doctor);
        doctor_textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(view.getContext(), ActivityDoctorlogin.class);
                startActivity(intent);
            }
        });

        user_textview = (Button) view.findViewById(R.id.icon_user);
        user_textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(view.getContext(),ActivityUserlogin.class);
                startActivity(intent);
            }
        });

        return view;
    }


}
