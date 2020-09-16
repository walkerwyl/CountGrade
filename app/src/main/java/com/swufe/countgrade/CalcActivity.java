package com.swufe.countgrade;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class CalcActivity extends AppCompatActivity {
    private static final String TAG = "CalcActivity";

    TextView textView;
    EditText editText;
    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;
    Button seven;
    Button eight;
    Button nine;
    Button zero;
    Button add;
    Button subtraction;
    Button multiply;
    Button divide;
    Button equal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calc_layout);

        textView = findViewById(R.id.Result);
        editText = findViewById(R.id.equation);

    }

    public void AddString(View v) {
        String str = editText.getText().toString();
        if (str.equals("0")) str = "";
        switch (v.getId()) {
            case R.id.zero:
                if (!str.endsWith("/")) str += "0";
                else {}//不允许输入0
                break;
            case R.id.one:
                str += "1";
                break;
            case R.id.two:
                str += "2";
                break;
            case R.id.three:
                str += "3";
                break;
            case R.id.four:
                str += "4";
                break;
            case R.id.five:
                str += "5";
                break;
            case R.id.six:
                str += "6";
                break;
            case R.id.seven:
                str += "7";
                break;
            case R.id.eight:
                str += "8";
                break;
            case R.id.nine:
                str += "1";
                break;
            case R.id.add:
                if (!str.endsWith("+") && !str.endsWith("-") && !str.endsWith("*") && !str.endsWith("/") && !str.endsWith(".")) str += "+";
                break;
            case R.id.subtraction:
                if (!str.endsWith("+") && !str.endsWith("-") && !str.endsWith("*") && !str.endsWith("/") && !str.endsWith(".")) str += "-";
                break;
            case R.id.multiply:
                if (!str.endsWith("+") && !str.endsWith("-") && !str.endsWith("*") && !str.endsWith("/") && !str.endsWith(".")) str += "*";
                break;
            case R.id.devide:
                if (str.equals("")) str += "0/";
                else if (!str.endsWith("+") && !str.endsWith("-") && !str.endsWith("*") && !str.endsWith("/") && !str.endsWith(".")) str += "/";
                break;
            case R.id.point:
                if (str.endsWith("")) str += "0.";
                if (!str.endsWith("+") && !str.endsWith("-") && !str.endsWith("*") && !str.endsWith("/") && !str.endsWith("."))
                        str += ".";
                break;
            default:
                break;
        }
        editText.setText(str);
    }

    public void Calc(View v) {
        String str = editText.getText().toString();
        if (str.equals("")) str = "0";
        //0除问题,0,0.0,0.00
        if (!str.endsWith("+") && !str.endsWith("-") && !str.endsWith("*") && !str.endsWith("/") && !str.endsWith(".")) {
            CalcString me = new CalcString(str);
            String resultStr = me.caculate();
            textView.setText(resultStr);
            editText.setText("");
        }
    }

    public void Reset(View v) {
        textView.setText("");
        editText.setText("0");
    }

    public void Back(View v) {
        String str = editText.getText().toString();
        if (!str.equals(""))
            editText.setText(str.substring(0, str.length()-1));
    }

}