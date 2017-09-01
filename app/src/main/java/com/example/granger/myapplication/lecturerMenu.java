package com.example.granger.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class lecturerMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lecturer_menu);
    }

    public void enterAttendanceChecking(View view){
        Intent i = new Intent(this, attendanceChecking.class);
        startActivity(i);
    }

    public void enterTimetableManagement(View view){
        Intent i =  new Intent(this, timetableManagement.class);
        startActivity(i);
    }
}
