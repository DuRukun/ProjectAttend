package com.example.granger.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class attendanceChecking extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendance_checking);
    }

    public void enterNameList(View view){
        Intent i = new Intent(this, nameList.class);
        startActivity(i);
    }

}
