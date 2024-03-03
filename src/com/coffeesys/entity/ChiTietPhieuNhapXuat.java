/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.coffeesys.entity;

/**
 *
 * @author Admin
 */
public class ChiTietPhieuNhapXuat {
    
    private int maCTPNX;
    private long maPNX;
    private int maNL;
    private int soLuong;
    private String ghiChu;

    public ChiTietPhieuNhapXuat() {
    }

    public ChiTietPhieuNhapXuat(int maCTPNX, long maPNX, int maNL, int soLuong, String ghiChu) {
        this.maCTPNX = maCTPNX;
        this.maPNX = maPNX;
        this.maNL = maNL;
        this.soLuong = soLuong;
        this.ghiChu = ghiChu;
    }

    public ChiTietPhieuNhapXuat(long maPNX, int maNL, int soLuong, String ghiChu) {
        this.maPNX = maPNX;
        this.maNL = maNL;
        this.soLuong = soLuong;
        this.ghiChu = ghiChu;
    }
    
    public int getMaCTPNX() {
        return maCTPNX;
    }

    public void setMaCTPNX(int maCTPNX) {
        this.maCTPNX = maCTPNX;
    }

    public long getMaPNX() {
        return maPNX;
    }

    public void setMaPNX(long maPNX) {
        this.maPNX = maPNX;
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
        return "ChiTietPhieuNhapXuat{" + "maCTPNX=" + maCTPNX + ", maPNX=" + maPNX + ", maNL=" + maNL + ", soLuong=" + soLuong + ", ghiChu=" + ghiChu + '}';
    }
    
    
}
