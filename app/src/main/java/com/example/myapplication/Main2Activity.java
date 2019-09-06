package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    private Button button2;
    private Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button2 = (Button) findViewById(R.id.order);

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                openactivity3();
            }
        });
        button3 = (Button) findViewById(R.id.next);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                openactivity1();
            }
        });
    }

public void openactivity3(){
        Intent intent = new Intent(Main2Activity.this,Main3Activity.class);
        startActivity(intent);
}
    public void openactivity1(){
        Intent intent = new Intent(Main2Activity.this,MainActivity.class);
        startActivity(intent);
    }


}

