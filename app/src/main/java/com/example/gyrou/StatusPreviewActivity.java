package com.example.gyrou;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StatusPreviewActivity extends AppCompatActivity {

    int loopCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status_preview);

        loopCount++; // ループ回数をカウント

        // 夜
        // 生存者の数だけシーンをループする
        //if(loopCount < suvivorList.size())
        {
            Button statusPreviewButton = (Button) findViewById(R.id.statusPreviewButton);

            statusPreviewButton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent intent = new Intent(StatusPreviewActivity.this, IdentificationActivity.class);
                    startActivity(intent);
                }
            });
        }
        //else
        {
            switch (IdentificationActivity.state)
            {
                case MORNING:
                    IdentificationActivity.state = STATE.DAYTIME;
                    break;

                case DAYTIME:
                    IdentificationActivity.state = STATE.NIGHT;
                    break;
                case NIGHT:
                    IdentificationActivity.state = STATE.MORNING;
                    break;
            }

            loopCount = 0;
        }

        // 昼
        // 生存者の数だけシーンをループする
        // if(loopCount < suvivorList.size() * 2)
        {
            Button identificationButton = (Button) findViewById(R.id.statusPreviewButton);

            identificationButton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent intent = new Intent(StatusPreviewActivity.this, IdentificationActivity.class);
                    startActivity(intent);
                }
            });
        }
    }
}
