package com.example.admin.practicas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;

public class MainActivity_PASAITEM extends AppCompatActivity {

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_auto_complete);}


        public void passImportantData(View view) {
            Intent newIntent = new Intent(this, AutoCompleteTextView.class);
            newIntent.putExtra("boolVal", false);
            newIntent.putExtra("stringVal", "este es el nuevo hint");
            Bundle b = new Bundle();
            b.putString("name", "texto");
            b.putString("surname", "Nombre");
            b.putString("hintReal", "Este deberia ser el hint");
            newIntent.putExtra("bundleVal", b);
            startActivity(newIntent);
        }
    }

