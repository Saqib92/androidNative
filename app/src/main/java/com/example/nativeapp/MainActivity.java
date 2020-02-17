package com.example.nativeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText firstNumber, secondNumber;
    Button plusBtn, minusBtn, multiplyBtn, divideBtn, toRadio;
    TextView answer;
    float first, second, result;

    private boolean isEmpty(EditText etText) {
        return etText.getText().toString().trim().length() == 0;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNumber = (EditText) findViewById(R.id.firstNumber);
        secondNumber = (EditText) findViewById(R.id.secondNumber);

        plusBtn = (Button) findViewById(R.id.plusBtn);
        minusBtn = (Button) findViewById(R.id.minusBtn);
        multiplyBtn = (Button) findViewById(R.id.multiplyBtn);
        divideBtn = (Button) findViewById(R.id.divideBtn);
        answer = (TextView) findViewById(R.id.result);
        toRadio = (Button) findViewById(R.id.toRadio);



        plusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isEmpty(firstNumber)){
                    Toast.makeText(getApplicationContext(), "Please Enter First number", Toast.LENGTH_LONG).show();
                    return;
                };
                if(isEmpty(secondNumber)){
                    Toast.makeText(getApplicationContext(), "Please Enter Second number", Toast.LENGTH_LONG).show();
                    return;
                };
                first = Float.valueOf(firstNumber.getText().toString());
                second = Float.valueOf(secondNumber.getText().toString());
                result =  first + second;
                answer.setText("Answer is: " + result);
            }
        });

        minusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isEmpty(firstNumber)){
                    Toast.makeText(getApplicationContext(), "Please Enter First number", Toast.LENGTH_LONG).show();
                    return;
                };
                if(isEmpty(secondNumber)){
                    Toast.makeText(getApplicationContext(), "Please Enter Second number", Toast.LENGTH_LONG).show();
                    return;
                };
                first = Float.valueOf(firstNumber.getText().toString());
                second = Float.valueOf(secondNumber.getText().toString());
                result =  first - second;
                answer.setText("Answer is: " + result);
            }
        });

        multiplyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isEmpty(firstNumber)){
                    Toast.makeText(getApplicationContext(), "Please Enter First number", Toast.LENGTH_LONG).show();
                    return;
                };
                if(isEmpty(secondNumber)){
                    Toast.makeText(getApplicationContext(), "Please Enter Second number", Toast.LENGTH_LONG).show();
                    return;
                };
                first = Float.valueOf(firstNumber.getText().toString());
                second = Float.valueOf(secondNumber.getText().toString());
                result =  first * second;
                answer.setText("Answer is: " + result);
            }
        });

        divideBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isEmpty(firstNumber)){
                    Toast.makeText(getApplicationContext(), "Please Enter First number", Toast.LENGTH_LONG).show();
                    return;
                };
                if(isEmpty(secondNumber)){
                    Toast.makeText(getApplicationContext(), "Please Enter Second number", Toast.LENGTH_LONG).show();
                    return;
                };
                first = Float.valueOf(firstNumber.getText().toString());
                second = Float.valueOf(secondNumber.getText().toString());
                result =  first / second;
                answer.setText("Answer is: " + result);
            }
        });
        toRadio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, RadioExample.class);
                startActivity(it);
            }
        });
    }
}
