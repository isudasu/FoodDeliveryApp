package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class foodCart extends AppCompatActivity {

    TextView cartList,priceView;
    String list_food;
    double price1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_cart);

        cartList = findViewById(R.id.cartList);
        priceView = findViewById(R.id.priceView);

        Bundle bundle = getIntent().getExtras();
        list_food = bundle.getString("food");
        price1 = bundle.getDouble("price");


         cartList.setText(list_food);
        priceView.setText(String.valueOf(price1));
    }
}
