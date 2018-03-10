package com.example.admin.practicas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainAutoCompleteActivity extends AppCompatActivity {

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_auto_complete);



        String[] data = {"Cat", "Dog", "Mouse"};
       AutoCompleteTextView autoCompleteTextView =
                (AutoCompleteTextView) findViewById(R.id.IDAuto);
        autoCompleteTextView.setAdapter(
               new ArrayAdapter<>(this, android.R.layout.select_dialog_item, data));
//// Number of Chars to Trigger Lookup
        autoCompleteTextView.setThreshold(1);

        Intent receivedIntent = getIntent();
        String value = receivedIntent.getStringExtra("stringVal");
        Bundle bundle = receivedIntent.getBundleExtra("bundleVal");
        autoCompleteTextView.setHint(bundle.getString("name"));
            }
        }





