package com.example.granger.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class initial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_initial);
    }

    public void enterStudentInterface(View view){
        Intent i = new Intent(this, studentLogIn.class);
        startActivity(i);
    }

    public void enterLecturerInterface(View view){
        Intent i = new Intent(this, lecturerLogIn.class);
        startActivity(i);
    }
}
