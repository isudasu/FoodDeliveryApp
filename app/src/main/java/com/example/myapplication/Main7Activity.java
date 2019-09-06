package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main7Activity extends AppCompatActivity {
    private Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);


        next =(Button) findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                openactivityhome();
            }
        });
    }

    public void openactivityhome(){
        Intent intent = new Intent(Main7Activity.this,Main8Activity.class);
        startActivity(intent);
    }
}
