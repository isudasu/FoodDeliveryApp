package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main6Activity extends AppCompatActivity {
    public static final String EXTRA_TEXT ="com.example.application.example.EXTRA_TEXT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        Button button = (Button) findViewById(R.id.btnSave);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                save();
            }
        });
    }

    public void save(){
        EditText editText1 = (EditText) findViewById(R.id.txtAddress);
        String txt2 = editText1.getText().toString();

        EditText editText2 = (EditText) findViewById(R.id.txtFloor);
        String txt3 = editText2.getText().toString();

        EditText editText3 = (EditText) findViewById(R.id.txtName);
        String txt4 = editText3.getText().toString();

        EditText editText4 = (EditText) findViewById(R.id.txtStreet);
        String txt5 = editText4.getText().toString();

        EditText editText5 = (EditText) findViewById(R.id.txtArea);
        String txt6 = editText5.getText().toString();

        EditText editText6 = (EditText) findViewById(R.id.txtLandmark);
        String txt7 = editText6.getText().toString();

        EditText editText7 = (EditText) findViewById(R.id.txtDelivery);
        String txt8 = editText7.getText().toString();

        EditText editText8 = (EditText) findViewById(R.id.txtLabel);
        String txt9 = editText8.getText().toString();

        EditText editText9 = (EditText) findViewById(R.id.editText8);
        String txt10 = editText9.getText().toString();

        Intent intent = new Intent(this, Display.class);
        intent.putExtra(EXTRA_TEXT, txt2);
        intent.putExtra(EXTRA_TEXT, txt3);
        intent.putExtra(EXTRA_TEXT, txt4);
        intent.putExtra(EXTRA_TEXT, txt5);
        intent.putExtra(EXTRA_TEXT, txt6);
        intent.putExtra(EXTRA_TEXT, txt7);
        intent.putExtra(EXTRA_TEXT, txt8);
        intent.putExtra(EXTRA_TEXT, txt9);
        intent.putExtra(EXTRA_TEXT, txt10);
        startActivity(intent);
    }
}


