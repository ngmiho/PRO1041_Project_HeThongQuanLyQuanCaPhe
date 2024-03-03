/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.coffeesys.dao;

import com.coffeesys.entity.ChiTietDonHang;
import com.coffeesys.utils.JDBCHelper;
import java.util.List;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class ChiTietDonHangDAO extends CoffeeSysDAO<ChiTietDonHang, Integer> {

    final String INSERT_SQL = "INSERT INTO ChiTietDonHang(MaDH, MaSP, SoLuong, GhiChu) VALUES(?,?,?,?)";
    final String UPDATE_SQL = "UPDATE ChiTietDonHang SET MaDH=?, MaSP=?, SoLuong=?, GhiChu=? WHERE MaCTDH=?";
    final String DELETE_SQL = "DELETE FROM ChiTietDonHang WHERE MaCTDH=?";
    final String SELECT_ALL_SQL = "SELECT * FROM ChiTietDonHang";
    final String SELECT_BY_ID_SQL = "SELECT * FROM ChiTietDonHang WHERE MaCTDH=?";
    final String SELECT_BY_MaDH_SQL = "SELECT * FROM ChiTietDonHang WHERE MaDH=?";

    @Override
    public void insert(ChiTietDonHang entity) {
        JDBCHelper.update(INSERT_SQL,
                entity.getMaDH(),
                entity.getMaSP(),
                entity.getSoLuong(),
                entity.getGhiChu()
        );
    }

    @Override
    public void update(ChiTietDonHang entity) {
        JDBCHelper.update(UPDATE_SQL,
                entity.getMaDH(),
                entity.getMaSP(),
                entity.getSoLuong(),
                entity.getGhiChu(),
                entity.getMaCTDH()
        );
    }

    @Override
    public void delete(Integer id) {
        JDBCHelper.update(DELETE_SQL, id);
    }

    @Override
    public List<ChiTietDonHang> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public ChiTietDonHang selectById(Integer id) {
        List<ChiTietDonHang> list = selectBySql(SELECT_BY_ID_SQL, id);

        if (list.isEmpty()) {
            return null;
        }

        return list.get(0);
    }

    public List<ChiTietDonHang> selectByMaDH(Long maDH) {
        return selectBySql(SELECT_BY_MaDH_SQL, maDH);
    }
    
    @Override
    public List<ChiTietDonHang> selectBySql(String sql, Object... args) {
        List<ChiTietDonHang> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                ChiTietDonHang entity = new ChiTietDonHang();
                entity.setMaCTDH(rs.getInt("MaCTDH"));
                entity.setMaDH(rs.getLong("MaDH"));
                entity.setMaSP(rs.getString("MaSP"));
                entity.setSoLuong(rs.getInt("SoLuong"));
                entity.setGhiChu(rs.getString("GhiChu"));

                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
