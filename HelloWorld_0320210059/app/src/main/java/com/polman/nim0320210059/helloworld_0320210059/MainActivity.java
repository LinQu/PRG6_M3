package com.polman.nim0320210059.helloworld_0320210059;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    private Button mNimButton;
    private Button mNamaButton;
    private Button mDateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //get date current device and format to yyyy-mm-dd
        Date datenow = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String date = formatter.format(datenow);



        mNimButton = (Button) findViewById(R.id.btnNim);
        mNimButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hello My Nim is "+getString(R.string.NIM), Toast.LENGTH_LONG).show();
            }
        });

        mNamaButton = (Button) findViewById(R.id.btnNama);
        mNamaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hello My Name is "+getString( R.string.Nama), Toast.LENGTH_LONG).show();
            }
        });
        mDateButton = (Button) findViewById(R.id.btnDate);
        mDateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hello the Date is "+date, Toast.LENGTH_LONG).show();
            }
        });




    }
}