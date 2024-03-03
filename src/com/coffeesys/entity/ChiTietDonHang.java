/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.coffeesys.entity;

/**
 *
 * @author Admin
 */
public class ChiTietDonHang {
    
    private int maCTDH;
    private long maDH;
    private String maSP;
    private int soLuong;
    private String ghiChu;

    public ChiTietDonHang() {
    }

    public ChiTietDonHang(int maCTDH, long maDH, String maSP, int soLuong, String ghiChu) {
        this.maCTDH = maCTDH;
        this.maDH = maDH;
        this.maSP = maSP;
        this.soLuong = soLuong;
        this.ghiChu = ghiChu;
    }

    public ChiTietDonHang(long maDH, String maSP, int soLuong, String ghiChu) {
        this.maDH = maDH;
        this.maSP = maSP;
        this.soLuong = soLuong;
        this.ghiChu = ghiChu;
    }

    public int getMaCTDH() {
        return maCTDH;
    }

    public void setMaCTDH(int maCTDH) {
        this.maCTDH = maCTDH;
    }

    public long getMaDH() {
        return maDH;
    }

    public void setMaDH(long maDH) {
        this.maDH = maDH;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    @Override
    public String toString() {
        return "ChiTietDonHang{" + "maCTDH=" + maCTDH + ", maDH=" + maDH + ", maSP=" + maSP + ", soLuong=" + soLuong + ", ghiChu=" + ghiChu + '}';
    }
    
    
}
