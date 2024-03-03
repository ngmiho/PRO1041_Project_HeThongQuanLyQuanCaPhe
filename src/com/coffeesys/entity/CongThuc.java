/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.coffeesys.entity;

/**
 *
 * @author TinDev
 */
public class CongThuc {
    private String maSP;
    private int maNL;
    private int soLuong;
    private String ghiChu;

    public CongThuc() {
    }

    public CongThuc(String maSP, int maNL, int soLuong, String ghiChu) {
        this.maSP = maSP;
        this.maNL = maNL;
        this.soLuong = soLuong;
        this.ghiChu = ghiChu;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public int getMaNL() {
        return maNL;
    }

    public void setMaNL(int maNL) {
        this.maNL = maNL;
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
        return "CongThuc{" + "maSP=" + maSP + ", maNL=" + maNL + ", soLuong=" + soLuong + ", ghiChu=" + ghiChu + '}';
    }
}
