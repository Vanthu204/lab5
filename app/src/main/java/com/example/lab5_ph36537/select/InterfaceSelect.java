package com.example.lab5_ph36537.select;

import retrofit2.Call;
import retrofit2.http.GET;
public interface InterfaceSelect {
    @GET("select.php")
    Call<SvrResponseSelect> selectSanPham();
}
