package com.example.guessthenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    public static final int MAX_NUMBER = 100;
    public static final Random RANDOM = new Random();
    private TextView textMessage;
    private EditText txtNumberInput;
    private Button btnPlay;
    private int noToFind,noOfTries;
    TextView click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        textMessage = findViewById(R.id.textMessage);
        click=findViewById(R.id.clicks);
        txtNumberInput = findViewById(R.id.txtNumberinput);
        btnPlay = findViewById(R.id.btnplay);

        btnPlay.setOnClickListener(this);
        newGame();
    }

        public void onClick(View view){

            if (view==btnPlay){
                validatePlay();
            }

        }//end of onclick

    private void validatePlay(){
        int num = Integer.parseInt(txtNumberInput.getText().toString());//Convert input to integer
        noOfTries++;
        click.setText(String.valueOf(noOfTries));

        if (num==noToFind){
            Toast.makeText(this, "Congratulations !!! You Got The Number " + noToFind + " in " + noOfTries  + "  tries" , Toast.LENGTH_LONG).show();
            textMessage.setText("Congratulations !!!");
            newGame();
        }else  if (num > noToFind+5){
            textMessage.setText("Too High....");
        }
        else if (num < noToFind-5){
            textMessage.setText("Too Low....");
        }
        else{
            textMessage.setText("Close");
        }
    }

    private  void newGame(){
        noToFind = RANDOM.nextInt(MAX_NUMBER)+1;
        textMessage.setText("New Guess ");
        txtNumberInput.setText("");
        noOfTries=0;
        click.setText(String.valueOf(noOfTries));

    }



}