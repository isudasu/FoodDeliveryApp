package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main6Activity extends AppCompatActivity {
private Button add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);


        add =(Button) findViewById(R.id.add);
        add.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                openactivityhome();
            }
        });
    }

    public void openactivityhome(){
        Intent intent = new Intent(Main6Activity.this,Main7Activity.class);
        startActivity(intent);
    }
}
