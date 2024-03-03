/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.coffeesys.dao;

import com.coffeesys.entity.LoaiSanPham;
import com.coffeesys.utils.JDBCHelper;
import java.util.List;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class LoaiSanPhamDAO extends CoffeeSysDAO<LoaiSanPham, Integer> {

    final String INSERT_SQL = "INSERT INTO LoaiSanPham(MaLSP, TenLSP) VALUES(?,?)";
    final String UPDATE_SQL = "UPDATE LoaiSanPham SET TenLSP  WHERE MaLSP=?";
    final String DELETE_SQL = "DELETE FROM LoaiSanPham WHERE MaLSP=?";
    final String SELECT_ALL_SQL = "SELECT * FROM LoaiSanPham";
    final String SELECT_BY_ID_SQL = "SELECT * FROM LoaiSanPham WHERE MaLSP=?";

    @Override
    public void insert(LoaiSanPham entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(LoaiSanPham entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<LoaiSanPham> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public LoaiSanPham selectById(Integer id) {
        List<LoaiSanPham> list = selectBySql(SELECT_BY_ID_SQL, id);

        if (list.isEmpty()) {
            return null;
        }

        return list.get(0);
    }

    @Override
    public List<LoaiSanPham> selectBySql(String sql, Object... args) {
        List<LoaiSanPham> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                LoaiSanPham entity = new LoaiSanPham();
                entity.setMaLSP(rs.getInt("MaLSP"));
                entity.setTenLSP(rs.getString("TenLSP"));

                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
