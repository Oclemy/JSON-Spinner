package com.tutorials.hp.jsonspinner;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Spinner;

import com.tutorials.hp.jsonspinner.m_JSON.JSONDownloader;

public class MainActivity extends AppCompatActivity {

    String jsonURL="http://jsonplaceholder.typicode.com/users";
    Spinner sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       sp= (Spinner) findViewById(R.id.sp);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             new JSONDownloader(MainActivity.this,jsonURL,sp).execute();
            }
        });
    }


}
