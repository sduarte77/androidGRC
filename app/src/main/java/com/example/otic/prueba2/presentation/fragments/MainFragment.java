package com.example.otic.prueba2.presentation.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.otic.prueba2.R;

/**
 * Created by sduarte on 28/11/2016.
 */

public class MainFragment extends Fragment {
    //declaracion de variables

    private Button btn_login;
    private EditText et_username;
    private EditText et_password;



    public MainFragment(){

    }

    public static MainFragment newInstance(){
        return new MainFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_layout_login,container,false);

        return root;
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        //instanciando variables

        super.onViewCreated(view, savedInstanceState);
        et_password= (EditText) getActivity().findViewById(R.id.et_password);
        et_username= (EditText) getActivity().findViewById(R.id.et_username);
        btn_login= (Button) getActivity().findViewById(R.id.btn_login);

       btn_login.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Toast.makeText(getContext(), "Hola  "+et_username.getText().toString(),Toast.LENGTH_SHORT).show();
           }
       });

    }
}
