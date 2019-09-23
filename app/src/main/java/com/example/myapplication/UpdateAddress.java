package com.example.myapplication;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class UpdateAddress extends AppCompatActivity {
    DeliveryDbHelper myDb;
    EditText txtId, edName, edSurname, edMarks, txtStreet, txtArea, txtVehicles, txtDelivery, txtSpecial;
    Button btnEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_address);
        myDb = new DeliveryDbHelper(this);

        txtId = (EditText)findViewById(R.id.txtId);
        edName = (EditText)findViewById(R.id.etName);
        edSurname = (EditText)findViewById(R.id.etSurname);
        edMarks = (EditText)findViewById(R.id.etMarks);
        txtStreet =(EditText)findViewById(R.id.txtStreet);
        txtArea =(EditText)findViewById(R.id.txtArea);
        txtVehicles = (EditText)findViewById(R.id.txtVehicle);
        txtDelivery = (EditText)findViewById(R.id.txtDelivery);
        txtSpecial = (EditText)findViewById(R.id.txtSpecial);
        btnEdit = (Button)findViewById(R.id.btnEdit);
        UpdateData();
    }

    public void UpdateData(){
        btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isUpdate = myDb.updateData(txtId.getText().toString(),edName.getText().toString(), edSurname.getText().toString(),
                        edMarks.getText().toString(), txtStreet.getText().toString(), txtArea.getText().toString(),
                        txtVehicles.getText().toString(), txtDelivery.getText().toString(),txtSpecial.getText().toString());
                if (isUpdate == true)
                    if (edName.getText().toString().equals("") || edSurname.getText().toString().equals("") || edMarks.getText().toString().equals("") || txtStreet.getText().toString().equals("") || txtArea.getText().toString().equals("") || txtVehicles.getText().toString().equals("") ||
                            txtDelivery.getText().toString().equals("") || txtSpecial.getText().toString().equals("")) {

                        AlertDialog.Builder builder = new AlertDialog.Builder(UpdateAddress.this);
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

                        Toast.makeText(UpdateAddress.this,"Data Updated", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(UpdateAddress.this,"Data not Updated", Toast.LENGTH_LONG).show();

            }
        });
    }
}
