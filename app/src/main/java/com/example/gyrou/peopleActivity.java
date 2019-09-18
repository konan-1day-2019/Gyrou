package com.example.gyrou;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class peopleActivity extends AppCompatActivity {

    int x = 4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peple);
        TextView num = (TextView)findViewById(R.id.num);
        num.setText(String.valueOf(x));

        Button plus = (Button)findViewById(R.id.plusButton);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView num = (TextView)findViewById(R.id.num);
                if(x >= 4 && x < 8) x++;
                num.setText(String.valueOf(x));
            }
        });


        Button minus = (Button)findViewById(R.id.minusButton);
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView num = (TextView)findViewById(R.id.num);
                if(x > 4 && x <= 8) x--;
                num.setText(String.valueOf(x));
            }
        });



    }
}
