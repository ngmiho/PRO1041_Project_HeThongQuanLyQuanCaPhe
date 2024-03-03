/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.coffeesys.dao;

import com.coffeesys.entity.NhanVien;
import com.coffeesys.utils.JDBCHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class NhanVienDAO extends CoffeeSysDAO<NhanVien, String> {

    final String INSERT_SQL = "INSERT INTO NhanVien([MaNV],[HoTen],[GioiTinh],[NgaySinh],[SoDienThoai],[Email],[ChucVu],[Luong],[HinhAnh],[MatKhau],[TrangThai]) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
    final String UPDATE_SQL = "UPDATE NhanVien SET [HoTen] = ?, [GioiTinh] = ?, [NgaySinh] = ?, [SoDienThoai] = ?, [Email] = ?, [ChucVu] = ?, [Luong] = ?, [HinhAnh] = ?, [MatKhau] = ?, [TrangThai] = ? WHERE MaNV = ?";
    final String UPDATE_TRANGTHAI_SQL = "UPDATE NhanVien SET [TrangThai] = ? WHERE MaNV = ?";
    final String DELETE_SQL = "DELETE FROM NhanVien WHERE MaNV = ?";
    final String SELECT_ALL_SQL = "SELECT * FROM NhanVien";
    final String SELECT_ALL_TRANGTHAI_DANGLAM_SQL = "SELECT * FROM NhanVien WHERE TrangThai = 1";
    final String SELECT_BY_ID_SQL = "SELECT * FROM NhanVien WHERE MaNV = ?";

    @Override
    public void insert(NhanVien entity) {
        JDBCHelper.update(INSERT_SQL, 
                entity.getMaNV(), 
                entity.getHoTen(), 
                entity.isGioiTinh(), 
                entity.getNgaySinh(), 
                entity.getSoDienThoai(), 
                entity.getEmail(), 
                entity.getChucVu(), 
                entity.getLuong(), 
                entity.getHinhAnh(), 
                entity.getMatKhau(),
                entity.isTrangThai()
        );
    }

    @Override
    public void update(NhanVien entity) {
        JDBCHelper.update(UPDATE_SQL, 
                entity.getHoTen(), 
                entity.isGioiTinh(), 
                entity.getNgaySinh(), 
                entity.getSoDienThoai(), 
                entity.getEmail(), 
                entity.getChucVu(), 
                entity.getLuong(), 
                entity.getHinhAnh(), 
                entity.getMatKhau(),
                entity.isTrangThai(),
                entity.getMaNV());
    }

    public void updateTrangThai(NhanVien entity) {
        JDBCHelper.update(UPDATE_TRANGTHAI_SQL,
                entity.isTrangThai(),
                entity.getMaNV());
    }
    
    @Override
    public void delete(String id) {
        JDBCHelper.update(DELETE_SQL, id);
    }

    @Override
    public List<NhanVien> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }
    
    public List<NhanVien> selectAllTrangThaiDangLam() {
        return selectBySql(SELECT_ALL_TRANGTHAI_DANGLAM_SQL);
    }

    @Override
    public NhanVien selectById(String id) {
        List<NhanVien> list = selectBySql(SELECT_BY_ID_SQL, id);

        if (list.isEmpty()) {
            return null;
        }

        return list.get(0);
    }

    @Override
    public List<NhanVien> selectBySql(String sql, Object... args) {
        List<NhanVien> list = new ArrayList<>();
        
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            
            while (rs.next()) {
                NhanVien entity = new NhanVien();
                
                entity.setMaNV(rs.getString(1));
                entity.setHoTen(rs.getString(2));
                entity.setGioiTinh(rs.getBoolean(3));
                entity.setNgaySinh(rs.getDate(4));
                entity.setSoDienThoai(rs.getString(5));
                entity.setEmail(rs.getString(6));
                entity.setChucVu(rs.getString(7));
                entity.setLuong(rs.getInt(8));
                entity.setHinhAnh(rs.getString(9));
                entity.setMatKhau(rs.getString(10));
                entity.setTrangThai(rs.getBoolean(11));
                
                list.add(entity);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        
        return list;
    }

}
