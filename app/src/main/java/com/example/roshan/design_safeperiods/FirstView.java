package com.example.roshan.design_safeperiods;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import static android.widget.ArrayAdapter.createFromResource;

public class FirstView extends AppCompatActivity {
    //   public boolean firstData;
//    public SharedPreferences sharedPreferences_firstData;
    public Button submit_bttn;
    private PrefManager prefManager;
    public Calendar myCalendar;
    public EditText editText;
    Spinner spinner1, spinner2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_view);

        //for calendar
        myCalendar = Calendar.getInstance();
        editText = (EditText) findViewById(R.id.starting_date_id);
        final DatePickerDialog.OnDateSetListener date = new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear,
                                  int dayOfMonth) {
                myCalendar.set(Calendar.YEAR, year);
                myCalendar.set(Calendar.MONTH, monthOfYear);
                myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                updateLabel();
            }

            private void updateLabel() {
                String myFormat = "dd/MM/yyyy";
                SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.getDefault());
                editText.setText(sdf.getDateInstance(DateFormat.FULL).format(myCalendar.getTime()));
            }
        };

        editText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new DatePickerDialog(FirstView.this, date,
                        myCalendar.get(Calendar.YEAR),
                        myCalendar.get(Calendar.MONTH),
                        myCalendar.get(Calendar.DAY_OF_MONTH))
                        .show();

            }
        });

        //for spinner
        //duration period
        spinner1 = (Spinner) findViewById(R.id.duration_period_id);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(FirstView.this, R.array.durationOfPeriod, R.layout.spnr_drpdn_durationdays);
        adapter1.setDropDownViewResource(R.layout.spnr_drpdn_durationdays);
        spinner1.setAdapter(adapter1);

        //duration period cycle
        spinner2 = (Spinner) findViewById(R.id.duration_periodcycle_id);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(FirstView.this, R.array.durationOfPeriodCycle, R.layout.spnr_durationdayscycle);
        adapter2.setDropDownViewResource(R.layout.spnr_drpdn_durationdayscycle);
        spinner2.setAdapter(adapter2);


//for sharedpreference
        // Checking for first time launch - before calling setContentView()
        prefManager = new PrefManager(this);
        if (!prefManager.isFirstTimeLaunch()) {
            launchHomeScreen();
            finish();
        }

        submit_bttn = findViewById(R.id.submit_bttn_id);
        submit_bttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchHomeScreen();
            }
        });
//
//        sharedPreferences_firstData = getSharedPreferences("firstDataKey", MODE_PRIVATE);  //creating
//        SharedPreferences.Editor editor = sharedPreferences_firstData.edit();
//        firstData = sharedPreferences_firstData.getBoolean("firstData", false);  //extracting data

//        editor.putBoolean("firstDataKey", false);   //storing value
//        firstData = sharedPreferences_firstData.getBoolean("firstData", false);  //extracting data
//
//        if (firstData==true) {
//            Intent intent = new Intent(FirstView.this, MainActivity.class);
//            startActivity(intent);
//            finish();
//
//
//
//
//        } else {
////        SharedPreferences.Editor editor = sharedPreferences_firstData.edit();  //putting data
//
//            firstData = true;
//            editor.putBoolean("firstDataKey", firstData);
//            setContentView(R.layout.activity_first_view);
//            submit_bttn = (Button) findViewById(R.id.submit_bttn_id);
//            submit_bttn.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    Intent intent = new Intent(FirstView.this, MainActivity.class);
//                    startActivity(intent);
//                    finish();
//
//                }
//            });


//
//
//        }

//        }
    }

    private void launchHomeScreen() {
        prefManager.setFirstTimeLaunch(false);
        startActivity(new Intent(FirstView.this, MainActivity.class));
        finish();
    }


}
