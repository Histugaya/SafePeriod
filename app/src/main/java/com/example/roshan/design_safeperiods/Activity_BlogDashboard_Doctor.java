package com.example.roshan.design_safeperiods;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class Activity_BlogDashboard_Doctor extends AppCompatActivity {

    private RecyclerView recyclerView1;
    private Blog_Doctor_PostCustomAdapter blog_doctor_postCustomAdapter;  //blog_doctor_postItemsList
    private List<Blog_Doctor_PostItems> blog_doctor_postItemsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__blog_dashboard__doctor);
        blog_doctor_postItemsList = new ArrayList<>();

        recyclerView1 = findViewById(R.id.recyclerView_doctor_dash);

        blog_doctor_postCustomAdapter = new Blog_Doctor_PostCustomAdapter(blog_doctor_postItemsList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(Activity_BlogDashboard_Doctor.this);
        recyclerView1.setLayoutManager(layoutManager);
        recyclerView1.setItemAnimator(new DefaultItemAnimator());
        recyclerView1.setAdapter(blog_doctor_postCustomAdapter);
        setData();


    }

    private void setData() {

        Blog_Doctor_PostItems blog_doctor_postItems = new Blog_Doctor_PostItems("DoctorRam", "10/10/2014", "Safe Title", "Description", "comment by doctor edittext", "comment by doctor shown");
        blog_doctor_postItemsList.add(blog_doctor_postItems);

        blog_doctor_postItems = new Blog_Doctor_PostItems("DoctorRita", "12/10/2015", "Safety First", "You must be aware about women diseases", "asdfasdfasd", "adfdasdfsda");
        blog_doctor_postItemsList.add(blog_doctor_postItems);

        blog_doctor_postItems = new Blog_Doctor_PostItems("DoctorRita", "12/10/2015", "Safety First", "You must be aware about women diseases", "asdfasdfasd", "adfdasdfsda");
        blog_doctor_postItemsList.add(blog_doctor_postItems);

        blog_doctor_postItems = new Blog_Doctor_PostItems("DoctorRita", "12/10/2015", "Safety First", "You must be aware about women diseases", "asdfasdfasd", "adfdasdfsda");
        blog_doctor_postItemsList.add(blog_doctor_postItems);

        blog_doctor_postItems = new Blog_Doctor_PostItems("DoctorRita", "12/10/2015", "Safety First", "You must be aware about women diseases", "asdfasdfasd", "adfdasdfsda");
        blog_doctor_postItemsList.add(blog_doctor_postItems);

        blog_doctor_postItems = new Blog_Doctor_PostItems("DoctorRita", "12/10/2015", "Safety First", "You must be aware about women diseases", "asdfasdfasd", "adfdasdfsda");
        blog_doctor_postItemsList.add(blog_doctor_postItems);

        blog_doctor_postCustomAdapter.notifyDataSetChanged();


    }
}
