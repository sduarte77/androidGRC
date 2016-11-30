package com.example.otic.prueba2.presentation.activities;
//import android.support.v4.app.Fragment;

//AUMENT ESTE PARA EL EJERCICIO

import android.support.annotation.NonNull;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.example.otic.prueba2.Fragment_Layout_main;

/**
 * Created by sduarte on 28/11/2016.
 */

public class ActivityUtils {


    public static void addFragmentToActivity(FragmentManager fragmentManager,
                                             Fragment fragment, int frameID){
        FragmentTransaction transaction=fragmentManager.beginTransaction();
        transaction.add(frameID,fragment);
        transaction.commit();


    }



}
