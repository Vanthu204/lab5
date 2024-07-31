package com.example.lab5_ph36537.update;


import com.example.lab5_ph36537.SvrResponseSanPham;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface InterfaceUpdate {
    @FormUrlEncoded
    @POST("update.php")
    Call<SvrResponseSanPham> updateSanPham(
            @Field("MaSP") String Masp,
            @Field("TenSP") String Tensp,
            @Field("MoSP") String Mota
    );
}