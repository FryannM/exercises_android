package com.example.admin.practicas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.Toast;

public class MainActivityDatetime extends AppCompatActivity implements View.OnClickListener {
    private DatePicker mDatePicker;
    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_datetime);
        getSupportActionBar().setTitle(getIntent().getStringExtra(Intent.EXTRA_TITLE));
        mDatePicker = (DatePicker) findViewById(R.id.my_date_picker);
        findViewById(R.id.my_button).setOnClickListener(this);

    }

    @Override
    public void onClick( View view ) {

        StringBuilder sb = new StringBuilder();
        sb.append(mDatePicker.getDayOfMonth());
        sb.append("/");
        sb.append(mDatePicker.getMonth());
        sb.append("/");
        sb.append(mDatePicker.getYear());
        Toast.makeText(this, sb.toString(), Toast.LENGTH_SHORT).show();

    }
}
