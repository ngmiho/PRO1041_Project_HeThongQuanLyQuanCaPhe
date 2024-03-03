/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.coffeesys.entity;

/**
 *
 * @author Admin
 */
public class NguyenLieu {
    
    private int maNL;
    private String tenNL;
    private int donGia;
    private String donViTinh;
    private int soLuong;

    public NguyenLieu() {
    }

    public NguyenLieu(int maNL, String tenNL, int donGia, String donViTinh, int soLuong) {
        this.maNL = maNL;
        this.tenNL = tenNL;
        this.donGia = donGia;
        this.donViTinh = donViTinh;
        this.soLuong = soLuong;
    }
    
    public NguyenLieu(String tenNL, int donGia, String donViTinh, int soLuong) {
        this.tenNL = tenNL;
        this.donGia = donGia;
        this.donViTinh = donViTinh;
        this.soLuong = soLuong;
    }

    public int getMaNL() {
        return maNL;
    }

    public void setMaNL(int maNL) {
        this.maNL = maNL;
    }

    public String getTenNL() {
        return tenNL;
    }

    public void setTenNL(String tenNL) {
        this.tenNL = tenNL;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    public void setDonViTinh(String donViTinh) {
        this.donViTinh = donViTinh;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return "NguyenLieu{" + "maNL=" + maNL + ", tenNL=" + tenNL + ", donGia=" + donGia + ", donViTinh=" + donViTinh + ", soLuong=" + soLuong + '}';
    }
    
    
}
