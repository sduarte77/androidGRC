package com.example.otic.prueba2.data.remote.request;

import com.example.otic.prueba2.data.AccesToken;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by sduarte on 30/11/2016.
 */

public interface LoginRequest {

    @FormUrlEncoded
    @POST("users/login")
    //llamada
    Call<AccesToken> loginUser(@Field("email") String email,
                               @Field("password") String password );


}
