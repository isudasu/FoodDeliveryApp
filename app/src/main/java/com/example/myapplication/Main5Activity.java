package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Main5Activity extends AppCompatActivity {
    private ImageButton btt1;
    private ImageButton btt3;
    private Button btt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);


        btt1 = (ImageButton) findViewById(R.id.btt1);
        btt1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openactivity1();
            }
        });
        btt3= (ImageButton) findViewById(R.id.log);
        btt3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openactivity();
            }
        });



    btt2 = (Button) findViewById(R.id.btt2);
        btt2.setOnClickListener(new View.OnClickListener()

    {
        public void onClick (View v){
        openactivity6();
    }
    });
}
    public void openactivity1(){
        Intent intent = new Intent(Main5Activity.this,MainActivity.class);
        startActivity(intent);
    }

    public void openactivity6(){
        Intent intent = new Intent(Main5Activity.this,Main6Activity.class);
        startActivity(intent);
    }

    public void openactivity(){
        Intent intent = new Intent(Main5Activity.this,Main9Activity.class);
        startActivity(intent);
    }
    }

