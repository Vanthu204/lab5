package com.example.lab5_ph36537.select;


import com.example.lab5_ph36537.SanPham;

public class SvrResponseSelect {//get
    private SanPham[] products;
    private String message;

    public SanPham[] getProducts() {
        return products;
    }

    public String getMessage() {
        return message;
    }
}
