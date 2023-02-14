package com.deelaka.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button zero;
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button add;
    private Button sub;
    private Button mul;
    private Button div;
    private Button equal;
    private Button clear;
    private TextView info;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUpUIViews();

//        zero.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
    }

    void setUpUIViews(){
        zero = (Button) findViewById(R.id.btnNo0);
        one = (Button) findViewById(R.id.btnNo1);
        two = (Button) findViewById(R.id.btnNo2);
        three = (Button) findViewById(R.id.btnNo3);
        four = (Button) findViewById(R.id.btnNo4);
        five = (Button) findViewById(R.id.btnNo5);
        six = (Button) findViewById(R.id.btnNo6);
        seven = (Button) findViewById(R.id.btnNo7);
        eight = (Button) findViewById(R.id.btnNo8);
        nine = (Button) findViewById(R.id.btnNo9);
        add = (Button) findViewById(R.id.btnAdd);
        sub = (Button) findViewById(R.id.btnSub);
        mul = (Button) findViewById(R.id.btnMul);
        div = (Button) findViewById(R.id.btnDiv);
        equal = (Button) findViewById(R.id.btnEql);
        clear = (Button) findViewById(R.id.btnClear);
        info = (TextView) findViewById(R.id.tvControl);
        result = (TextView) findViewById(R.id.tvResult);
    }
}