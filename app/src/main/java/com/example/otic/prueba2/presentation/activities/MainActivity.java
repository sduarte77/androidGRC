package com.example.otic.prueba2.presentation.activities;

import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.Toast;

import com.example.otic.prueba2.R;
import com.example.otic.prueba2.presentation.fragments.MainFragment;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back);  // ojo alt enter para reconocer el R libreria


        toolbar =(Toolbar) findViewById(R.id.toolbar);

        toolbar.setTitle("Otro Activity");


        //NUEVA OPCION
       // toolbar.setTitle("Activity 3");

        setSupportActionBar(toolbar);
        ActionBar ab=getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);
        ab.setDisplayShowHomeEnabled(true);
//


        MainFragment fragment= (MainFragment) getSupportFragmentManager().findFragmentById(R.id.body);

        if (fragment==null){
            fragment=MainFragment.newInstance();
            ActivityUtils.addFragmentToActivity(getSupportFragmentManager(),fragment,R.id.body);
        }


    }



    @Override
    public boolean onSupportNavigateUp(){
        onBackPressed();
           return true;
    }


}
