package com.example.hello_world;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button mybutton;
    TextView mytextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mybutton = findViewById(R.id.mybutton);
        mybutton.setBackgroundColor(Color.MAGENTA);
        mybutton.setTextColor(Color.BLACK);


    }
}