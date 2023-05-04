package com.example.guessthenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import java.util.Timer;
import java.util.TimerTask;

public class rulesActivity extends AppCompatActivity {
    Button play;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rules);
        getSupportActionBar().hide();
        play=findViewById(R.id.btnPlay1);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(rulesActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}