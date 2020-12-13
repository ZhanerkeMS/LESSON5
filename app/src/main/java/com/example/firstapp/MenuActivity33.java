package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.menu.R;

class MenuActivity3 extends AppCompatActivity implements View.OnClickListener {
    Button btn_Back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu1);
        btn_Back = findViewById(R.id.btnBack);
        btn_Back.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btnBack) {
            Intent main = new Intent(this, MenuActivity.class);
            startActivity(main);
        }
    }
}
