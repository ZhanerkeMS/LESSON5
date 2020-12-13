package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.menu.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn_Menu1, btn_Menu2, btn_Menu3, btn_Menu4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_Menu1 = findViewById(R.id.btnMenu1);
        btn_Menu2 = findViewById(R.id.btnMenu2);
        btn_Menu3 = findViewById(R.id.btnMenu3);
        btn_Menu4 = findViewById(R.id.btnMenu4);
        btn_Menu1.setOnClickListener(this);
        btn_Menu2.setOnClickListener(this);
        btn_Menu3.setOnClickListener(this);
        btn_Menu4.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btnMenu1) {
            Intent menu1 = new Intent(this, MenuActivity1.class);
            startActivity(menu1);
        } else if (view.getId() == R.id.btnMenu2) {
            Intent menu2 = new Intent(this, MenuActivity2.class);
            startActivity(menu2);
        } else if (view.getId() == R.id.btnMenu3) {
            Intent menu3 = new Intent(this, MenuActivity3.class);
            startActivity(menu3);
        } else if (view.getId() == R.id.btnMenu4) {
            Intent menu4 = new Intent(this, MenuActivity4.class);
            startActivity(menu4);
        }
    }
}