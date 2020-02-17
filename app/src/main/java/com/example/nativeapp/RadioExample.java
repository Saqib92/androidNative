package com.example.nativeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioExample extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_example);

        Button toCheck = (Button) findViewById(R.id.toCheckbox);

        RadioGroup  rGroup = (RadioGroup) findViewById(R.id.rdb);

        rGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton rdb1 = (RadioButton) findViewById(R.id.rdb1);
                RadioButton rdb2 = (RadioButton) findViewById(R.id.rdb2);

                if(rdb1.isChecked()){
                    Toast.makeText(getApplicationContext(), "Male", Toast.LENGTH_SHORT).show();
                }else if(rdb2.isChecked()){
                    Toast.makeText(getApplicationContext(), "Female", Toast.LENGTH_SHORT).show();
                }
            }
        });

        toCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(RadioExample.this, CheckboxExample.class);
                startActivity(it);
            }
        });
    }
}
