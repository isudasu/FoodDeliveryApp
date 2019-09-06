package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main4Activity extends AppCompatActivity {
private Button bb1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);


        bb1 =(Button) findViewById(R.id.button7);
        bb1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                openactivityhome();
            }
        });
    }

    public void openactivityhome(){
        Intent intent = new Intent(Main4Activity.this,Main5Activity.class);
        startActivity(intent);
    }
    }

