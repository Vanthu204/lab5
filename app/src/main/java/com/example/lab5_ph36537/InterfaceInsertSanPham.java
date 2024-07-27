package com.example.lab5_ph36537;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface InterfaceInsertSanPham {
    @FormUrlEncoded
    @POST("insert1.php")
    Call<SvrResponseSanPham> insertSanPham(
            @Field("Masp") String MaSP,
            @Field("Tensp") String TenSP,
            @Field("Mota") String MoTa
    );
}
