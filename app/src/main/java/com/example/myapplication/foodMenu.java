package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class foodMenu extends AppCompatActivity {

    Button Mb1,Mb2,Mb3,Mb4,Mb5;
    //declare a string to take my food item
    String food ="";
    double price = 0.00;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_menu);

        Mb1 = (Button)findViewById(R.id.Mb1);
        Mb2 = (Button)findViewById(R.id.Mb2);
        Mb3 = (Button)findViewById(R.id.Mb3);
        Mb4 = (Button)findViewById(R.id.Mb4);
        Mb5 = (Button)findViewById(R.id.Mb5);


    }

    public void add(View view){

        if (view == findViewById(R.id.Mb1))
        {
            food = food+"Veggie Burger"+"\n";
            price = price+420.00;
        }
        else if (view == findViewById(R.id.Mb2))
        {
            food = food+"Chicken Burger"+"\n";
            price = price+400.00;
        }
        else if (view == findViewById(R.id.Mb3))
        {
            food = food+"Grilled Chicken Burger"+"\n";
            price = price+550.00;
        }
        else if (view == findViewById(R.id.Mb4))
        {
            food = food+"Chicken Fried Rice"+"\n";
            price = price+300.00;
        }
        else if (view == findViewById(R.id.Mb5))
        {
            food = food+"Chicken Wings"+"\n";
            price = price+270.00;
        }

    }


}
