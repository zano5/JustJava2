package com.example.projava.justjava2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    private TextView tvCount, tvThank, tvAmnt;
    private Button btnadd, btnSub,btnOrder;
    private TextView views;
    private int quantity=0;
    private static final int price = 5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvCount = (TextView) findViewById(R.id.tvCount);
        tvThank = (TextView) findViewById(R.id.tvThank);
        btnadd  = (Button) findViewById(R.id.btnAdd);
        btnSub = (Button) findViewById(R.id.btnSubtract);
        btnOrder = (Button) findViewById(R.id.btnOrder);
        tvAmnt = (TextView) findViewById(R.id.tvAmnt);

    }


    public void add()
    {
        quantity+=1;
        tvCount.setText("" +quantity);
    }

    public void sub()
    {
        quantity-=1;
        tvCount.setText("" +quantity);

    }



    public void onOrder(View view)
    {

        int id = view.getId();

        switch (id)
        {

            case R.id.btnAdd:
                add();
                break;
            case R.id.btnSubtract:
                sub();
                break;
        }
    }


    public void order(View view)
    {
        int amnt = quantity * price;


        tvAmnt.setText(NumberFormat.getCurrencyInstance().format(amnt));
        tvThank.setVisibility(View.VISIBLE);


    }
}
