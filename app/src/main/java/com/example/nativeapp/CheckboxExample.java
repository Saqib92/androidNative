package com.example.nativeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class CheckboxExample extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox_example);

        final CheckBox cb1 = (CheckBox) findViewById(R.id.firstCheck);
        Button toListView = (Button) findViewById(R.id.toListview);
        cb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cb1.isChecked()){
                    Toast.makeText(getApplicationContext(), "First Check", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(getApplicationContext(), "First UnCheck", Toast.LENGTH_LONG).show();
                }
            }
        });
        toListView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(CheckboxExample.this, ListviewExample.class);
                startActivity(it);
            }
        });
    }
}
