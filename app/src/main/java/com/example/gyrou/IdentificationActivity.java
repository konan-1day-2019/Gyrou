package com.example.gyrou;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

enum STATE
{
   NIGHT, DAYTIME ,MORNING;
}
// 本人確認
public class IdentificationActivity extends AppCompatActivity {

   public static STATE state = STATE.NIGHT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identification);

        // 夜
        // 本人確認から対象選択画面へ移行
        if(state == STATE.NIGHT) {
            Button identificationButton = (Button) findViewById(R.id.identificationButton);

            identificationButton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent intent = new Intent(IdentificationActivity.this, SelectTargetActivity.class);
                    startActivity(intent);
                }
            });
        }

        
        // 朝の状態
        if(state == STATE.MORNING) {
            // if()
        }

    }
}
