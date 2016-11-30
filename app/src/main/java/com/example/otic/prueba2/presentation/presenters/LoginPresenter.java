package com.example.otic.prueba2.presentation.presenters;

import android.content.Context;

import com.example.otic.prueba2.data.AccesToken;
import com.example.otic.prueba2.data.remote.ServiceFactory;
import com.example.otic.prueba2.data.remote.request.LoginRequest;
import com.example.otic.prueba2.presentation.contracts.LoginContract;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by sduarte on 30/11/2016.
 */

public class LoginPresenter implements LoginContract.Presenter {

    //declarar metodos
    private LoginContract.View mView;
    private Context context;

    public LoginPresenter(LoginContract.View mView, Context context) {
        this.mView=mView;
        this.context=context;
        this.mView.setPresenter(this);
    }

    /*
    * metodo q permite hacer las peticiones al servidor para ingresar al logueo
    * @param username nombre de usuario
    * @param pàssword contraseña de usuario
    * */
    @Override
    public void basicLogin(String username, String password) {

    //se solicita accesos del name y clave
        mView.loadingIndicator(true); //carga la espera loading con true para q aparezca

        LoginRequest loginRequest= ServiceFactory.createService(LoginRequest.class); //aqui se creo la conexion del post   loginRequest
        //ojo el call q llama es del retrofit2 prq hay otros

        Call<AccesToken> call= loginRequest.loginUser(username,password);
        call.enqueue(new Callback<AccesToken>() {
            @Override

            public void onResponse(Call<AccesToken> call, Response<AccesToken> response) {
                //entran codigo de respuesta de la serie del servidor 200y400
                if(response.isSuccessful()){
                    //200
                    mView.loadingIndicator(false);
                    mView.showMessage("Hola Usuario con el id:"+response.body().getId());

                }else {
                //400
                mView.loadingIndicator(false);
                mView.showMessage("Credenciales Invalidas");

            }
        }

            @Override
            public void onFailure(Call<AccesToken> call, Throwable t) {
                //entran los errores del servidor tipo 500 (servidor off)
                mView.loadingIndicator(false);
                mView.showMessage("El login ha fallado");

            }
        });





    }

    @Override
    public void star() {

    }
    //se implementa elñ presente


}
