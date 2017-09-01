package com.example.granger.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class lecturerLogIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lecturer_log_in);
    }

    public void enterLecturerRegister(View view){
        Intent i = new Intent(this, lecturerRegister.class);
        startActivity(i);
    }

    public void enterLecturerMenu(View view){
        Intent i = new Intent(this, lecturerMenu.class);
        startActivity(i);
    }
}
