package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button btnClicked;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button_on_click);

        textView = findViewById(R.id.tvText);
        btnClicked = findViewById(R.id.btn);
    }

    public void btn(View view) {
        textView.setText("Button Is Clicked");
    }
}