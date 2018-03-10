package com.example.admin.practicas;


import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.widget.ProgressBar;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_spinner); {

        }
    }

    protected void onResume() {
             super.onResume();
             new LoadTask().execute();
        }

        class LoadTask extends AsyncTask<Void,Void,Void > {

            @Override
            protected void onPostExecute( Void aVoid ) {
                super.onPostExecute(aVoid);
            }

            @Override
            protected Void doInBackground( Void... voids ) {
                ProgressBar pgBar =  findViewById(R.id.my_progress_bar_ind);
                for (int i=0; i<10; i++)
                {
                    pgBar.setProgress(i);
                    try{
                        Thread.sleep(1000);

                    }
                    catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                return null;
            }
        }
}





