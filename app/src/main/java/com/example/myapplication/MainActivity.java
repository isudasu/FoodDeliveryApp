package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton ib;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ib =(ImageButton) findViewById(R.id.ib1);
        ib.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                openactivity3();
            }
        });
    }

    public void openactivity3(){
        Intent intent = new Intent(MainActivity.this,Main2Activity.class);
        startActivity(intent);
    }

}
