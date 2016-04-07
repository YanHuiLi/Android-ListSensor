package com.example.archer.listsensor;
/**
 * function:获取android设备上的传感器list。
 */
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvSensor = (TextView) findViewById(R.id.SensorList);
        SensorManager sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);

        List<Sensor>sensors= sensorManager.getSensorList(Sensor.TYPE_ALL);
        //遍历出来
        for(Sensor sensor:sensors){
            assert tvSensor != null;
            tvSensor.append(sensor.getName() + "\n");

        }

    }
}
