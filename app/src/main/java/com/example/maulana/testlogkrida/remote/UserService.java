package com.example.maulana.testlogkrida.remote;

import com.example.maulana.testlogkrida.models.ResponseLogin;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface UserService {


    @GET("Krida-Dev/lovs/isotorise/{username}/{password}")
    Call <ResponseLogin> getLogin(
    @Path("username") String username,
    @Path("password") String password);
}
// Itu ce' lu jangan masukin semua url nya langsung, makanya di MainAtivity lu jadi eror
