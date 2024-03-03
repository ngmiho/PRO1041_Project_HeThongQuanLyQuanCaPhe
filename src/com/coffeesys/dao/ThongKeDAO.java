/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.coffeesys.dao;

import com.coffeesys.utils.JDBCHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ThongKeDAO {
    
    private List<Object[]> getListOfArray(String sql, String[] cols, Object... args) {
        try {
            List<Object[]> list = new ArrayList<>();
            ResultSet rs = JDBCHelper.query(sql, args);
            
            while (rs.next()) {
                Object[] vals = new Object[cols.length];
                
                for (int i = 0; i < cols.length; i++) {
                    vals[i] = rs.getObject(cols[i]);
                }
                
                list.add(vals);
            }
            
            rs.getStatement().getConnection().close();
            
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public List<Object[]> getDoanhThuTheoNgay(Integer nam, Integer thang, Integer ngay) {
        String sql = "{CALL SP_DoanhThuTheoNgay(?,?,?)}";
        String cols[] = {"Ngay", "Thang", "Nam", "SoLuongDonHang", "DoanhThu"};
        return getListOfArray(sql, cols, nam, thang, ngay);
    }
    
    public List<Object[]> getDoanhThuTheoThang(Integer nam, Integer thang) {
        String sql = "{CALL SP_DoanhThuTheoThang(?,?)}";
        String cols[] = {"Ngay", "Thang", "Nam", "SoLuongDonHang", "DoanhThu"};
        return getListOfArray(sql, cols, nam, thang);
    }
    
    public List<Object[]> getDoanhThuTheoNam(Integer nam) {
        String sql = "{CALL SP_DoanhThuTheoNam(?)}";
        String cols[] = {"Thang", "Nam", "SoLuongDonHang", "DoanhThu"};
        return getListOfArray(sql, cols, nam);
    }
    
    public List<Object[]> getSanPhamBanChay() {
        String sql = "{CALL SP_SanPhamBanChay}";
        String cols[] = {"MaSP", "TenSP", "SoLuong"};
        return getListOfArray(sql, cols);
    }
    
    public List<Object[]> getSanPhamBanChayTheoNgay(Integer nam, Integer thang, Integer ngay) {
        String sql = "{CALL SP_SanPhamBanChayTheoNgay(?,?,?)}";
        String cols[] = {"MaSP", "TenSP", "SoLuong"};
        return getListOfArray(sql, cols, nam, thang, ngay);
    }
    
    public List<Object[]> getSanPhamBanChayTheoThang(Integer nam, Integer thang) {
        String sql = "{CALL SP_SanPhamBanChayTheoThang(?,?)}";
        String cols[] = {"MaSP", "TenSP", "SoLuong"};
        return getListOfArray(sql, cols, nam, thang);
    }
    
    public List<Object[]> getSanPhamBanChayTheoNam(Integer nam) {
        String sql = "{CALL SP_SanPhamBanChayTheoNam(?)}";
        String cols[] = {"MaSP", "TenSP", "SoLuong"};
        return getListOfArray(sql, cols, nam);
    }
    
    public List<Object[]> getSanPhamBanCham() {
        String sql = "{CALL SP_SanPhamBanCham}";
        String cols[] = {"MaSP", "TenSP", "SoLuong"};
        return getListOfArray(sql, cols);
    }
    
    public List<Object[]> getSanPhamBanChamTheoNgay(Integer nam, Integer thang, Integer ngay) {
        String sql = "{CALL SP_SanPhamBanChamTheoNgay(?,?,?)}";
        String cols[] = {"MaSP", "TenSP", "SoLuong"};
        return getListOfArray(sql, cols, nam, thang, ngay);
    }
    
    public List<Object[]> getSanPhamBanChamTheoThang(Integer nam, Integer thang) {
        String sql = "{CALL SP_SanPhamBanChamTheoThang(?,?)}";
        String cols[] = {"MaSP", "TenSP", "SoLuong"};
        return getListOfArray(sql, cols, nam, thang);
    }
    
    public List<Object[]> getSanPhamBanChamTheoNam(Integer nam) {
        String sql = "{CALL SP_SanPhamBanChamTheoNam(?)}";
        String cols[] = {"MaSP", "TenSP", "SoLuong"};
        return getListOfArray(sql, cols, nam);
    }
}
