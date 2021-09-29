package com.amg.retrofit_api;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import static java.sql.DriverManager.println;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        println("this is the change for the 2nd commit");
        println("this is the change for the 3nd commit");
        println("local changes");
        println("Experimental commit");
        println("change 1");
    }
}