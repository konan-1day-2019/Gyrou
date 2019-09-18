package com.example.gyrou;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class peopleActivity extends AppCompatActivity {

    int n = 4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_people);
        TextView num = (TextView)findViewById(R.id.num);
        num.setText(String.valueOf(n));

        Button plus = (Button)findViewById(R.id.plusButton);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView num = (TextView)findViewById(R.id.num);
                if(n >= 4 && n < 8) n++;
                num.setText(String.valueOf(n));
            }
        });


        Button minus = (Button)findViewById(R.id.minusButton);
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView num = (TextView)findViewById(R.id.num);
                if(n > 4 && n <= 8) n--;
                num.setText(String.valueOf(n));
            }
        });

        Button button = (Button)findViewById(R.id.ok_Button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (peopleActivity.this,IdentificationActivity.class);
                startActivity(intent);
            }
        });



    }
}
