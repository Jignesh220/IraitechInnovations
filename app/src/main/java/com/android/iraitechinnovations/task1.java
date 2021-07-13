package com.android.iraitechinnovations;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ListView;
import android.widget.PopupMenu;

import java.util.ArrayList;

public class task1 extends AppCompatActivity {
    String cName1;
    ArrayList<lecture> lectures = new ArrayList<>();
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task1);

        listView = findViewById(R.id.couse);

        cName1 = getIntent().getStringExtra("lecture");

        lecture v1 = new lecture(cName1);

        lectures.add(v1);
        ArrayList<lecture> dispLecInfo = lectures;
        lectureAdapter lecInfoAdapter=new lectureAdapter(task1.this, dispLecInfo);
        listView.setAdapter(lecInfoAdapter);

    }
    public void pluse(View view){
        Intent intent =new Intent(task1.this,addLecture.class);
        startActivity(intent);
    }

}