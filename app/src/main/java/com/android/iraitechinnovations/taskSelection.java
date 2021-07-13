package com.android.iraitechinnovations;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class taskSelection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_selection);
    }
    public void task1(View view){
        Intent intent =new Intent(taskSelection.this, task1.class);
        startActivity(intent);
    }
    public void task2(View view){
        Intent intent =new Intent(taskSelection.this,task2.class);
        startActivity(intent);
    }
}