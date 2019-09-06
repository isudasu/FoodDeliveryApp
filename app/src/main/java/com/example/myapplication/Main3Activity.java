package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Main3Activity extends AppCompatActivity {

    private Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        b1 =(Button) findViewById(R.id.btn1);
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                openactivity4();
            }
        });
    }

    public void openactivity4(){
        Intent intent = new Intent(Main3Activity.this,Main4Activity.class);
        startActivity(intent);
    }
    }

