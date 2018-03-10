package com.example.admin.practicas;

import android.annotation.SuppressLint;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TimePicker;
import android.widget.Toast;

import static com.example.admin.practicas.R.id.my_date_picker;

public class MainActivityTime_picker extends AppCompatActivity implements View.OnClickListener {
    private TimePicker mTimePicker;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_time_picker);
        mTimePicker = (TimePicker) findViewById(my_date_picker  );
        findViewById(R.id.my_button).setOnClickListener(this);



    }

    @Override
    public void onClick( View view ) {
        StringBuilder sb = new StringBuilder();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            sb.append(mTimePicker.getHour());
        } else {
//noinspection deprecation
            sb.append(mTimePicker.getCurrentHour());
        }
        sb.append(":");
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            sb.append(mTimePicker.getMinute());
        } else {
//noinspection deprecation
            sb.append(mTimePicker.getCurrentMinute());
        }
        Toast.makeText(this, sb.toString(), Toast.LENGTH_SHORT).show();
    }
}
