/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.coffeesys.dao;

import com.coffeesys.entity.KhachHang;
import com.coffeesys.utils.JDBCHelper;
import java.util.List;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class KhachHangDAO extends CoffeeSysDAO<KhachHang, Integer> {

    final String INSERT_SQL = "INSERT INTO KhachHang(HoTen, SoDienThoai, DiaChi, DiemTichLuy) VALUES(?,?,?,?)";
    final String UPDATE_SQL = "UPDATE KhachHang SET HoTen=?, SoDienThoai=?, DiaChi=?, DiemTichLuy=? WHERE MaKH=?";
    final String DELETE_SQL = "DELETE FROM KhachHang WHERE MaKH=?";
    final String SELECT_ALL_SQL = "SELECT * FROM KhachHang";
    final String SELECT_BY_ID_SQL = "SELECT * FROM KhachHang WHERE MaKH=?";

    @Override
    public void insert(KhachHang entity) {
        JDBCHelper.update(INSERT_SQL,
                entity.getTenKH(),
                entity.getSoDienThoai(),
                entity.getDiaChi(),
                entity.getDiemTichLuy()
        );
    }

    @Override
    public void update(KhachHang entity) {
        JDBCHelper.update(UPDATE_SQL, entity.getTenKH(),
                entity.getSoDienThoai(),
                entity.getDiaChi(),
                entity.getDiemTichLuy(),
                entity.getMaKH()
        );
    }

    @Override
    public void delete(Integer id) {
        JDBCHelper.update(DELETE_SQL, id);
    }

    @Override
    public List<KhachHang> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public KhachHang selectById(Integer id) {
        List<KhachHang> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<KhachHang> selectBySql(String sql, Object... args) {
        List<KhachHang> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                KhachHang entity = new KhachHang();
                entity.setMaKH(rs.getInt("MaKH"));
                entity.setTenKH(rs.getString("HoTen"));
                entity.setSoDienThoai(rs.getString("SoDienThoai"));
                entity.setDiaChi(rs.getString("DiaChi"));
                entity.setDiemTichLuy(rs.getInt("DiemTichLuy"));

                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<KhachHang> selectByKeyword(String keyword) {
        String SQL = "SELECT * FROM KhachHang WHERE SoDienThoai LIKE ? OR HoTen LIKE ? OR DiaChi LIKE ?";
        return this.selectBySql(SQL, "%" + keyword + "%", "%" + keyword + "%", "%" + keyword + "%");
    }
}
