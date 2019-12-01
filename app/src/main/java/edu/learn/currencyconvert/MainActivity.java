package edu.learn.currencyconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertCurrency(View view){

        EditText text = (EditText) findViewById(R.id.editText);
        String amountindollar = text.getText().toString();
        double amtindollar = Double.parseDouble(amountindollar);
        double amountinrupee = amtindollar*71.94;
        String amountInRupeeString = String.format("%.2f", amountinrupee);

        Toast.makeText(this, "$" + amountindollar + " is ₹" + amountInRupeeString, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
