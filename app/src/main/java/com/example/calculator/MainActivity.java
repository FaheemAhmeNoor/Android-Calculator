package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editTxt01, editTxt02;
    TextView textView;
    Button btnPlus, btnMinus, btnMul,btnDiv, btnPercentage, btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTxt01 = findViewById(R.id.editTxt01);
        editTxt02 = findViewById(R.id.editTxt02);

        textView = findViewById(R.id.textView);

        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);
        btnPercentage = findViewById(R.id.btnPercentage);
        btnClear = findViewById(R.id.btnClear);

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstValue, secondValue, ans;
                firstValue = Integer.parseInt(editTxt01.getText().toString());
                secondValue = Integer.parseInt(editTxt02.getText().toString());

                ans = firstValue + secondValue;

                textView.setText("Answer is " + ans);
            }
        });


        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float firstValue, secondValue, ans;
                firstValue = Integer.parseInt(editTxt01.getText().toString());
                secondValue = Integer.parseInt(editTxt02.getText().toString());

                ans = firstValue - secondValue;

                textView.setText("" + ans);
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float firstValue, secondValue, ans;
                firstValue = Integer.parseInt(editTxt01.getText().toString());
                secondValue = Integer.parseInt(editTxt02.getText().toString());

                ans = firstValue * secondValue;

                textView.setText("" + ans);
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float firstValue, secondValue, ans;
                firstValue = Integer.parseInt(editTxt01.getText().toString());
                secondValue = Integer.parseInt(editTxt02.getText().toString());

                ans = firstValue / secondValue;

                textView.setText("" + ans);
            }
        });

        btnPercentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float firstValue, secondVal ,ans;
                firstValue = Integer.parseInt(editTxt01.getText().toString());
                secondVal = 100;
                ans = firstValue / secondVal;

                textView.setText("" + ans);
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTxt01.setText("");
                editTxt02.setText("");
            }
        });


    }
}