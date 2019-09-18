package com.example.gyrou;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

public class SelectTargetActivity extends AppCompatActivity implements  SensorEventListener
{

        SensorManager sensorManager;

        float t = 0;

        float sumZ = 0; // z軸の回転速度の合計値
        float timeLimit = 60 * 5; // シェイクタイム

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_select_target);

            sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);

            changeScene();
    }

    // 本人確認から対象選択画面へ移行
    private void changeScene()
    {
        Button identificationButton = (Button) findViewById(R.id.identificationButton);

        identificationButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(SelectTargetActivity.this, SelectTargetActivity.class);
                startActivity(intent);
            }
        });
    }

    // シェイクするかしないか
    private void selectShake()
    {
        //Button permitButton = (Button) findViewById(R.id.permitButton);
    }
    @Override
    protected void onResume() {
        super.onResume();
        Sensor gyro = sensorManager.getDefaultSensor(Sensor.TYPE_GYROSCOPE);

        if (null != gyro)
            sensorManager.registerListener(this, gyro, SensorManager.SENSOR_DELAY_UI);
    }

    @Override
    public void onSensorChanged(SensorEvent event)
    {
        if(event.sensor.getType() == Sensor.TYPE_GYROSCOPE)
           sumZ += event.values[1];

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy)
    {

    }



}