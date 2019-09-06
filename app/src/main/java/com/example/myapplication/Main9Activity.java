package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main9Activity extends AppCompatActivity {
private Button edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);


        edit =(Button) findViewById(R.id.edit);
        edit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                openactivityhome();
            }
        });
    }

    public void openactivityhome(){
        Intent intent = new Intent(Main9Activity.this,Main10Activity.class);
        startActivity(intent);
    }

}
