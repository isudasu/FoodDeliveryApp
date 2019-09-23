package com.example.myapplication;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class Buttons extends AppCompatActivity {
    DeliveryDbHelper myDb;
    Button btnNxtUpdate;
    Button btnView;
    Button btnDelete;
    Button btnNextPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons);
        myDb = new DeliveryDbHelper(this);

        btnNxtUpdate = (Button) findViewById(R.id.btnNxtUpdate);
        btnView = (Button) findViewById(R.id.btnView);
        btnDelete = (Button)findViewById(R.id.btnDelete);
        btnNextPage = (Button)findViewById(R.id.btnNextPage);
        ViewAll();
    }

    public void ViewAll() {
        btnView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor res = myDb.getAllData();
                if (res.getCount() == 0) {
                    showMessage("Error", "Nothing found");
                    return;
                }
                StringBuffer buffer = new StringBuffer();
                while (res.moveToNext()) {
                    buffer.append("Id : " + res.getString(0) + "\n");
                    buffer.append("Address : " + res.getString(1) + "\n");
                    buffer.append("Building : " + res.getString(2) + "\n");
                    buffer.append("Special : " + res.getString(8) + "\n\n");
                }

                showMessage("Data", buffer.toString());
            }

        });
    }



        public void showMessage(String title, String message){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setCancelable(true);
            builder.setTitle(title);
            builder.setMessage(message);
            builder.show();
        }
}
