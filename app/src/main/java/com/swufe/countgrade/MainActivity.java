package com.swufe.countgrade;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button button;
    Button button2;
    Button button3;
    Button button4;

    String count;
    int grade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.Count);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);

        count = editText.getText().toString();
        grade = Integer.parseInt(count);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                grade = grade + 3;
                editText.setText(""+grade);
            }
        });//button

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                grade = grade + 2;
                editText.setText(""+grade);
            }
        });//button2

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                grade = grade + 1;
                editText.setText(""+grade);
            }
        });//button3

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                grade = 0;
                editText.setText(""+grade);
            }
        });//button4
    }
}