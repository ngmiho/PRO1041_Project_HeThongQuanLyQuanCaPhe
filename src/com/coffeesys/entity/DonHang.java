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
public class DonHang {
    
    private long maDH;
    private String maNV;
    private int maKH;
    private Date ngayTao;
    private int tongTien;
    private int tienKhachDua;
    private int tienThua;

    public DonHang() {
    }

    public DonHang(long maDH, String maNV, int maKH, Date ngayTao, int tongTien, int tienKhachDua, int tienThua) {
        this.maDH = maDH;
        this.maNV = maNV;
        this.maKH = maKH;
        this.ngayTao = ngayTao;
        this.tongTien = tongTien;
        this.tienKhachDua = tienKhachDua;
        this.tienThua = tienThua;
    }

    public DonHang(long maDH, String maNV, Date ngayTao, int tongTien, int tienKhachDua, int tienThua) {
        this.maDH = maDH;
        this.maNV = maNV;
        this.ngayTao = ngayTao;
        this.tongTien = tongTien;
        this.tienKhachDua = tienKhachDua;
        this.tienThua = tienThua;
    }

    public long getMaDH() {
        return maDH;
    }

    public void setMaDH(long maDH) {
        this.maDH = maDH;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public int getTongTien() {
        return tongTien;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }

    public int getTienKhachDua() {
        return tienKhachDua;
    }

    public void setTienKhachDua(int tienKhachDua) {
        this.tienKhachDua = tienKhachDua;
    }

    public int getTienThua() {
        return tienThua;
    }

    public void setTienThua(int tienThua) {
        this.tienThua = tienThua;
    }

    @Override
    public String toString() {
        return "DonHang{" + "maDH=" + maDH + ", maNV=" + maNV + ", maKH=" + maKH + ", ngayTao=" + ngayTao + ", tongTien=" + tongTien + ", tienKhachDua=" + tienKhachDua + ", tienThua=" + tienThua + '}';
    }

    
}
