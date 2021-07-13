package com.android.iraitechinnovations;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class addLecture extends AppCompatActivity {

    EditText editText2;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_lecture);

        button2 = findViewById(R.id.getlecture);
        editText2 = findViewById(R.id.lecturename);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String l = editText2.getText().toString();
                Intent intent =new Intent(addLecture.this,task1.class);
                Bundle mBundle = new Bundle();
                mBundle.putString("lecture",l);
                intent.putExtras(mBundle);
                startActivity(intent);
            }
        });
    }
}