package com.example.gyrou;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IdentificateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identificate);


        // 夜
        // 本人確認から対象選択画面へ移行
        Button identificationButton = (Button) findViewById(R.id.identificateButton);

        identificationButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(IdentificateActivity.this, SelectTarget.class);
                startActivity(intent);
            }
        });
    }
}
