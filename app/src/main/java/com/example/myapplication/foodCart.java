package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class foodCart extends AppCompatActivity {

    Button placeOrder;
    TextView cartList,priceView;
    String list_food;
    double price1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_cart);

        cartList = findViewById(R.id.cartList);
        priceView = findViewById(R.id.priceView);
        placeOrder = (Button) findViewById(R.id.placeOrder);

        placeOrder.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                openactivity3();
            }
        });

        Bundle bundle = getIntent().getExtras();
        list_food = bundle.getString("food");
        price1 = bundle.getDouble("price");


         cartList.setText(list_food);
        priceView.setText(String.valueOf(price1));
    }

    public void openactivity3(){
        Intent intent = new Intent(foodCart.this,Main3Activity.class);
        startActivity(intent);
    }
}
