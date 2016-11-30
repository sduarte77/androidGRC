package com.example.otic.prueba2.core;

/**
 * Created by sduarte on 30/11/2016.
 */

/* significa clases genericas <> q puede recibir un objeto de cualquier tipo* /

 */
public interface BaseView<T> {
    void setPresenter(T presenter);

}
