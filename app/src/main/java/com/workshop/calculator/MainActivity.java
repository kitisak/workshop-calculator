package com.workshop.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText etText1;
    EditText etText2;

    Button buttonOk;
    Button operatorPlus;
    Button operatorMinus;
    Button operatorMultiply;
    Button operatorDivide;
    String currentOperator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initInstance();
    }

    private void initInstance() {
        etText1 = (EditText) findViewById(R.id.edittext_number1);
        etText2 = (EditText) findViewById(R.id.edittext_number2);
        buttonOk = (Button) findViewById(R.id.button_ok);
        operatorPlus = (Button) findViewById(R.id.operator_plus);
        operatorMinus = (Button) findViewById(R.id.operator_minus);
        operatorMultiply = (Button) findViewById(R.id.operator_multiply);
        operatorDivide = (Button) findViewById(R.id.operator_divide);

        buttonOk.setOnClickListener(this);
        operatorPlus.setOnClickListener(this);
        operatorMinus.setOnClickListener(this);
        operatorMultiply.setOnClickListener(this);
        operatorDivide.setOnClickListener(this);
    }


    private void setCurrentOperator(String operator) {
        currentOperator = operator;
    }

    public String getCurrentOperator() {
        return currentOperator;
    }

    @Override
    public void onClick(View v) {
        if (v == buttonOk) {

        } else if (v == operatorPlus) {
            setCurrentOperator("+");

        } else if (v == operatorMinus) {
            setCurrentOperator("-");

        } else if (v == operatorMultiply) {
            setCurrentOperator("*");

        } else if (v == operatorDivide) {
            setCurrentOperator("/");
        }

    }
}
