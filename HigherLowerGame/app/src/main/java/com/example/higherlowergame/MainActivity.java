package com.example.higherlowergame;

import androidx.appcompat.app.AppCompatActivity;

import java.util.*;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int int_random;
    public void check(View view) {
        Log.i("key", String.valueOf(int_random));
        EditText text = findViewById(R.id.editTextNumber);
        int guessednumber = Integer.parseInt(text.getText().toString());
        if (int_random < guessednumber)
            Toast.makeText(this, "higher than guessed number", Toast.LENGTH_LONG).show();
        else if (int_random > guessednumber)
            Toast.makeText(this, "lower than guessed number", Toast.LENGTH_LONG).show();
        else if (int_random == guessednumber) {
            Toast.makeText(this, "right number", Toast.LENGTH_LONG).show();
            Random rand = new Random(); //instance of random class
            int upperbound = 20;
            //generate random values from 0-24
            int_random = rand.nextInt(upperbound) + 1;

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random rand = new Random(); //instance of random class
        int upperbound = 20;
        //generate random values from 0-20
        int_random = rand.nextInt(upperbound) + 1;
    }
}