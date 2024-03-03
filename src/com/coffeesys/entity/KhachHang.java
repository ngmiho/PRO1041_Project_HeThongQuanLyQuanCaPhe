/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.coffeesys.entity;

/**
 *
 * @author Admin
 */
public class KhachHang {
    
    private int maKH;
    private String tenKH;
    private String soDienThoai;
    private String diaChi;
    private int diemTichLuy;

    public KhachHang() {
    }

    public KhachHang(int maKH, String tenKH, String soDienThoai, String diaChi, int diemTichLuy) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.soDienThoai = soDienThoai;
        this.diaChi = diaChi;
        this.diemTichLuy = diemTichLuy;
    }

    public KhachHang(String tenKH, String soDienThoai, String diaChi, int diemTichLuy) {
        this.tenKH = tenKH;
        this.soDienThoai = soDienThoai;
        this.diaChi = diaChi;
        this.diemTichLuy = diemTichLuy;
    }
    
    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getDiemTichLuy() {
        return diemTichLuy;
    }

    public void setDiemTichLuy(int diemTichLuy) {
        this.diemTichLuy = diemTichLuy;
    }

    @Override
    public String toString() {
        return "KhachHang{" + "maKH=" + maKH + ", tenKH=" + tenKH + ", soDienThoai=" + soDienThoai + ", diaChi=" + diaChi + ", diemTichLuy=" + diemTichLuy + '}';
    }
    
    
}
