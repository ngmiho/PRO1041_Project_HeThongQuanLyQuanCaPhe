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
public class NhanVien {
    
    private String maNV;
    private String hoTen;
    private boolean gioiTinh;
    private Date ngaySinh;
    private String soDienThoai;
    private String email;
    private String chucVu;
    private int luong;
    private String hinhAnh;
    private String matKhau;
    private boolean trangThai;

    public NhanVien() {
    }

    public NhanVien(String maNV, String hoTen, boolean gioiTinh, Date ngaySinh, String soDienThoai, String email, String chucVu, int luong, String hinhAnh, String matKhau) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.chucVu = chucVu;
        this.luong = luong;
        this.hinhAnh = hinhAnh;
        this.matKhau = matKhau;
    }

    public NhanVien(String maNV, String hoTen, boolean gioiTinh, Date ngaySinh, String soDienThoai, String email, String chucVu, int luong, String hinhAnh, String matKhau, boolean trangThai) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.chucVu = chucVu;
        this.luong = luong;
        this.hinhAnh = hinhAnh;
        this.matKhau = matKhau;
        this.trangThai = trangThai;
    }
    
    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "maNV=" + maNV + ", hoTen=" + hoTen + ", gioiTinh=" + gioiTinh + ", ngaySinh=" + ngaySinh + ", soDienThoai=" + soDienThoai + ", email=" + email + ", chucVu=" + chucVu + ", luong=" + luong + ", hinhAnh=" + hinhAnh + ", matKhau=" + matKhau + '}';
    }
    
    
}
