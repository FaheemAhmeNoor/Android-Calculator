package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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



    }
}