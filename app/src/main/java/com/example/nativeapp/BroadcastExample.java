package com.example.nativeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class BroadcastExample extends AppCompatActivity {


    private BroadcastReceiver broad = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            int level = intent.getIntExtra("level", 0);
            ProgressBar pb = (ProgressBar) findViewById(R.id.pbar);
            pb.setProgress(level);
            TextView tv = (TextView) findViewById(R.id.textField);
            tv.setText("Battery Level: " + Integer.toString(level) + "%" );
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broadcast_example);
        registerReceiver(broad, new IntentFilter(Intent.ACTION_BATTERY_CHANGED));
        Button toFilestorage = (Button) findViewById(R.id.toFilestorage);
        toFilestorage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(BroadcastExample.this, FileStoragePage.class);
                startActivity(it);
            }
        });
    }


}
