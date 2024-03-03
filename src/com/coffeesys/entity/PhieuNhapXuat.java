/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.coffeesys.entity;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class PhieuNhapXuat {
    
    private long maPNX;
    private String maNV;
    private Date ngayNX;
    private boolean trangThai;

    public PhieuNhapXuat() {
    }

    public PhieuNhapXuat(long maPNX, String maNV, Date ngayNX, boolean trangThai) {
        this.maPNX = maPNX;
        this.maNV = maNV;
        this.ngayNX = ngayNX;
        this.trangThai = trangThai;
    }

    public PhieuNhapXuat(String maNV, Date ngayNX, boolean trangThai) {
        this.maNV = maNV;
        this.ngayNX = ngayNX;
        this.trangThai = trangThai;
    }

    public long getMaPNX() {
        return maPNX;
    }

    public void setMaPNX(long maPNX) {
        this.maPNX = maPNX;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public Date getNgayNX() {
        return ngayNX;
    }

    public void setNgayNX(Date ngayNX) {
        this.ngayNX = ngayNX;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "PhieuNhapXuat{" + "maPNX=" + maPNX + ", maNV=" + maNV + ", ngayNX=" + ngayNX + ", trangThai=" + trangThai + '}';
    }

    
    
}
