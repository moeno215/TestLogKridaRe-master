package com.example.maulana.testlogkrida.remote;

public class ApiUtils {

    public static final String BASE_URL = "http://app.krida.id/";

    public static UserService getUserService(){
        return RetrofitClient.getClient(BASE_URL).create(UserService.class);
    }
}
