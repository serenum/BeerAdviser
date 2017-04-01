package com.serenum.android.beeradviser;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getAdvice(View view){
        TextView recommendations = (TextView) findViewById(R.id.recommendation_textView);
        Spinner beerColor = (Spinner) findViewById(R.id.beer_color_spinner);
        if((String.valueOf(beerColor.getSelectedItem()).equals("Light")))
            recommendations.setText("Great choice!!");
        else
            recommendations.setText("FUUUU!!!");
    }
}
