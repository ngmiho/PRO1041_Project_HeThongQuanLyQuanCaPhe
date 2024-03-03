/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.coffeesys.entity;

/**
 *
 * @author Admin
 */
public class SanPham {

    private String maSP;
    private int maLSP;
    private String tenSP;
    private double donGia;
    private String size;
    private String moTa;
    private boolean trangThai;
    private String hinhAnh;

    public SanPham() {
    }

    public SanPham(String maSP, int maLSP, String tenSP, double donGia, String size, String moTa, boolean trangThai, String hinhAnh) {
        this.maSP = maSP;
        this.maLSP = maLSP;
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.size = size;
        this.moTa = moTa;
        this.trangThai = trangThai;
        this.hinhAnh = hinhAnh;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public int getMaLSP() {
        return maLSP;
    }

    public void setMaLSP(int maLSP) {
        this.maLSP = maLSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    @Override
    public String toString() {
        return "SanPham{" + "maSP=" + maSP + ", maLSP=" + maLSP + ", tenSP=" + tenSP + ", donGia=" + donGia + ", size=" + size + ", moTa=" + moTa + ", trangThai=" + trangThai + ", hinhAnh=" + hinhAnh + '}';
    }
}
