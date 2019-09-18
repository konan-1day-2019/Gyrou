package com.example.gyrou;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

// ゲーム中の結果表示クラス
public class StatusPreviewActivity extends AppCompatActivity {

    int loopCount = 0; // プレイヤーの行動のカウント数

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status_preview);

        // 生存者の数だけ本人確認シーンへ移行する
        // if(loopCount <= surviveList )
        /*
        Button identificationButton = (Button)findViewById(R.id.identificationButton);

        identificationButton.setOnClickListener(new View.OnClickListener()
        {
            public  void onClick(View v)
            {
                Intent intent = new Intent(StatusPreviewActivity.this, IdentificationActivity.class);
                startActivity(intent);
            }
        });
          */

    }
}
