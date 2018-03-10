package com.example.admin.practicas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class Main2ActivityEditText extends AppCompatActivity
        implements View.OnClickListener {
    private EditText mEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_edit_text);
        mEditText = (EditText) findViewById(R.id.EditID);
        findViewById(R.id.MyButton).setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        Toast.makeText(this, mEditText.getText(), Toast.LENGTH_SHORT).show();
    }
}

