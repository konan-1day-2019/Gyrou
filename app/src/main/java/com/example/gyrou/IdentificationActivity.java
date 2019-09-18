package com.example.gyrou;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IdentificationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identification);

        Button identificationButton = (Button)findViewById(R.id.button);

        identificationButton.setOnClickListener(new View.OnClickListener()
        {
            public  void onClick(View v)
            {
                Intent intent = new Intent(IdentificationActivity.this, SelectTargetActivity.class);
                startActivity(intent);
            }
        });
    }
}