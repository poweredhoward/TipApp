package com.example.matth.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity{

    EditText numBillTotal;
    EditText numBillTaxRate;
    EditText numBillTipRate;
    TextView txtTotalBill;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numBillTotal = (EditText)findViewById(R.id.numBillTotal);
        numBillTaxRate = (EditText)findViewById(R.id.numBillTaxRate);
        numBillTipRate = (EditText)findViewById(R.id.numBilllTipRate);
        txtTotalBill = (TextView)findViewById(R.id.txtTotalBill);

    }

    public void btnCalculate_OnClick (View v){
        double bill = Double.parseDouble(numBillTotal.getText().toString());
        double tax = Double.parseDouble(numBillTaxRate.getText().toString());
        double tip = Double.parseDouble(numBillTipRate.getText().toString());

        double FinalBill = (bill + (bill * (tax / 100))) * (1 + (tip / 100));


        txtTotalBill.setText(String.valueOf(FinalBill));
    }

}
