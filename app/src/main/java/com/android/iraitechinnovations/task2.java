package com.android.iraitechinnovations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class task2 extends AppCompatActivity {
    TextView textView;
    EditText editText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task2);

        textView = findViewById(R.id.dNumber);
        editText = findViewById(R.id.indexNumber);
        button = findViewById(R.id.getNumber);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = editText.getText().toString();
                if (TextUtils.isEmpty(number)){
                    Toast.makeText(task2.this,"please enter index number!!",Toast.LENGTH_LONG).show();
                    return;
                }
                int number2 = Integer.parseInt(number);
                if (number2>8){
                    Toast.makeText(task2.this,"please index between 0 to 8 only!!",Toast.LENGTH_LONG).show();
                    return;
                }
                String result;
                switch (number2) {
                    case 0:
                        result = "2";
                        break;
                    case 1:
                        result = "3";
                        break;
                    case 2:
                        result = "10";
                        break;
                    case 3:
                        result = "15";
                        break;
                    case 4:
                        result = "26";
                        break;
                    case 5:
                        result = "35";
                        break;
                    case 6:
                        result = "50";
                        break;
                    case 7:
                        result = "63";
                        break;
                    case 8:
                        result = "82";
                        break;
                    default:
                        result = "0";
                }
                textView.setText(result);
                Toast.makeText(task2.this,"your number is "+ result,Toast.LENGTH_SHORT).show();
            }
        });
    }
}