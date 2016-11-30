package com.example.otic.prueba2.presentation.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.otic.prueba2.R;
import com.example.otic.prueba2.presentation.fragments.LoginFragment;

/**
 * Created by sduarte on 28/11/2016.
 */

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clear);  // ojo alt enter para reconocer el R libreria
        LoginFragment fragment= (LoginFragment) getSupportFragmentManager().findFragmentById(R.id.body);

        if (fragment==null){
            fragment=LoginFragment.newInstance();
            ActivityUtils.addFragmentToActivity(getSupportFragmentManager(),fragment,R.id.body);
        }


    }


}
