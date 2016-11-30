package com.example.otic.prueba2.presentation.contracts;

import com.example.otic.prueba2.core.BasePresenter;
import com.example.otic.prueba2.core.BaseView;

/**
 * Created by sduarte on 30/11/2016.
 */

//maneja la peticion

public interface LoginContract {

    interface View extends BaseView<Presenter> {
        //respuesta recibe
        void showMessage(String msg);
        void loadingIndicator(boolean active); // metodo de carga q se muestra en el fragment por eso va el view


    }

    interface Presenter  extends BasePresenter {
        //envia
        void basicLogin(String username, String password);

    }

}
