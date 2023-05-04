package com.example.guessthenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ProgressBar;

import java.util.Timer;
import java.util.TimerTask;

public class splashActivity extends AppCompatActivity {
    ProgressBar pb;
    int counter=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();

        Thread thread = new Thread(){
            public void run(){
                try {
                    sleep(3000);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                finally {
                   Intent intent = new Intent(splashActivity.this,rulesActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        };thread.start();

    }

}