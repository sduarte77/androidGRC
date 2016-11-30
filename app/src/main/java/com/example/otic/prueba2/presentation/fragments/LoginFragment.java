package com.example.otic.prueba2.presentation.fragments;

import android.app.ProgressDialog;
import android.content.Intent;
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
import com.example.otic.prueba2.presentation.activities.MainActivity;
import com.example.otic.prueba2.presentation.contracts.LoginContract;
import com.example.otic.prueba2.presentation.presenters.LoginPresenter;

/**
 * Created by sduarte on 28/11/2016.
 */

public class LoginFragment extends Fragment implements LoginContract.View {
    //declaracion de variables

    private Button btn_login;
    private EditText et_username;
    private EditText et_password;

    private  LoginContract.Presenter mPresenter;
    private ProgressDialog mProgressDialog;

    public LoginFragment(){

    }

    public static  LoginFragment newInstance(){
        return new LoginFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter=new LoginPresenter(this,getContext());
        mProgressDialog =new ProgressDialog(getContext());

        mProgressDialog.setTitle("validando datos...");
        mProgressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
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


               //Intent intent=new Intent(getContext(),MainActivity.class);  //SOLICITUD DE OTRA PANTALLA MEDIANTE EL INTENT
               //startActivity(intent);
               mPresenter.basicLogin(et_username.getText().toString(),et_password.getText().toString());

               //Toast.makeText(getContext(), "Hola  "+et_username.getText().toString(),Toast.LENGTH_SHORT).show();
           }
       });

    }

    @Override
    public void showMessage(String msg) {
        //va a mostrar el msje
        Toast.makeText(getContext(),msg,Toast.LENGTH_SHORT).show();

    }

    @Override
    public void loadingIndicator(boolean active) {
        if(active) {
            mProgressDialog.show();
        }

        else{
            if(mProgressDialog.isShowing())
                mProgressDialog.dismiss();

        }
    }

    @Override
    public void setPresenter(LoginContract.Presenter presenter) {
            this.mPresenter=presenter;

    }
}
