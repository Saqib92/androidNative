package com.example.nativeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStoragePage<Buttion> extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_file_storage_page);
        final EditText fileName = (EditText) findViewById(R.id.fileName);
        final EditText content = (EditText) findViewById(R.id.content);
        Button saveBtn = (Button) findViewById(R.id.saveBtn);

        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fName = fileName.getText().toString();
                String contents = content.getText().toString();
                FileOutputStream fos;
                try{
                    fos = openFileOutput(fName, Context.MODE_PRIVATE);
                    fos.write(contents.getBytes());
                    fos.close();
                    Toast.makeText(FileStoragePage.this, fName + "Saved", Toast.LENGTH_SHORT).show();
                }catch(FileNotFoundException e){
                    e.printStackTrace();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        });

    }
}
