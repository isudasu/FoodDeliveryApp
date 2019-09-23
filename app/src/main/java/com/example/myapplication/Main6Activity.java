package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main6Activity extends AppCompatActivity {
    DeliveryDbHelper myDb;
    EditText edName, edSurname, edMarks, txtStreet, txtArea, txtVehicles, txtDelivery, txtSpecial;
    Button btnSave;
    Button btnNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        myDb = new DeliveryDbHelper(this);

        edName = (EditText)findViewById(R.id.etName);
        edSurname = (EditText)findViewById(R.id.etSurname);
        edMarks = (EditText)findViewById(R.id.etMarks);
        txtStreet =(EditText)findViewById(R.id.txtStreet);
        txtArea =(EditText)findViewById(R.id.txtArea);
        txtVehicles = (EditText)findViewById(R.id.txtVehicle);
        txtDelivery = (EditText)findViewById(R.id.txtDelivery);
        txtSpecial = (EditText)findViewById(R.id.txtSpecial);
        btnSave = (Button) findViewById(R.id.btnSave);
        btnNext = (Button)findViewById(R.id.btnNext);
        AddData();

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
    }

    public void AddData(){
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isInserted = myDb.insertData(edName.getText().toString(), edSurname.getText().toString(), edMarks.getText().toString(),
                        txtStreet.getText().toString(), txtArea.getText().toString(), txtVehicles.getText().toString(),
                        txtDelivery.getText().toString(),txtSpecial.getText().toString());
                if (isInserted == true)
                    if (edName.getText().toString().equals("") || edSurname.getText().toString().equals("") || edMarks.getText().toString().equals("") || txtStreet.getText().toString().equals("") || txtArea.getText().toString().equals("") || txtVehicles.getText().toString().equals("") ||
                            txtDelivery.getText().toString().equals("") || txtSpecial.getText().toString().equals("")) {

                        AlertDialog.Builder builder = new AlertDialog.Builder(Main6Activity.this);
                        builder.setTitle("Error");
                        builder.setMessage("Some Details are Empty.!").
                                setCancelable(false);

                        builder.setPositiveButton("Close", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                        builder.create().show();

                    }else
                        Toast.makeText(Main6Activity.this,"Data Inserted", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(Main6Activity.this,"Data not Inserted", Toast.LENGTH_LONG).show();

            }
        });
    }



    public void openActivity2(){
        Intent intent = new Intent(this, Buttons.class);
        startActivity(intent);
    }

}
