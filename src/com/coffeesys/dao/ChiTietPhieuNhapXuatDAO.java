/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.coffeesys.dao;

import com.coffeesys.entity.ChiTietPhieuNhapXuat;
import com.coffeesys.utils.JDBCHelper;
import java.util.List;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class ChiTietPhieuNhapXuatDAO extends CoffeeSysDAO<ChiTietPhieuNhapXuat, Integer> {

    final String INSERT_SQL = "INSERT INTO ChiTietPhieuNhapXuat(MaPNX, MaNL, SoLuong, GhiChu) VALUES(?,?,?,?)";
    final String UPDATE_SQL = "UPDATE ChiTietPhieuNhapXuat SET MaPNX=?, MaNL=?, SoLuong=?, GhiChu=? WHERE MaCTPNX=?";
    final String DELETE_SQL = "DELETE FROM ChiTietPhieuNhapXuat WHERE MaCTPNX=?";
    final String SELECT_ALL_SQL = "SELECT * FROM ChiTietPhieuNhapXuat";
    final String SELECT_BY_ID_SQL = "SELECT * FROM ChiTietPhieuNhapXuat WHERE MaCTPNX=?";
    final String SELECT_BY_MAPNX_SQL = "SELECT * FROM ChiTietPhieuNhapXuat WHERE MaPNX=?";

    @Override
    public void insert(ChiTietPhieuNhapXuat entity) {
        JDBCHelper.update(INSERT_SQL,
                entity.getMaPNX(),
                entity.getMaNL(),
                entity.getSoLuong(),
                entity.getGhiChu()
        );
    }

    @Override
    public void update(ChiTietPhieuNhapXuat entity) {
        JDBCHelper.update(UPDATE_SQL,
                entity.getMaPNX(),
                entity.getMaNL(),
                entity.getSoLuong(),
                entity.getGhiChu(),
                entity.getMaCTPNX()
        );
    }

    @Override
    public void delete(Integer id) {
        JDBCHelper.update(DELETE_SQL, id);
    }

    @Override
    public List<ChiTietPhieuNhapXuat> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }
    
    public List<ChiTietPhieuNhapXuat> selectByMaPNX(long maPNX) {
        return selectBySql(SELECT_BY_MAPNX_SQL, maPNX);
    }

    @Override
    public ChiTietPhieuNhapXuat selectById(Integer id) {
        List<ChiTietPhieuNhapXuat> list = selectBySql(SELECT_BY_ID_SQL, id);

        if (list.isEmpty()) {
            return null;
        }

        return list.get(0);
    }

    @Override
    public List<ChiTietPhieuNhapXuat> selectBySql(String sql, Object... args) {
        List<ChiTietPhieuNhapXuat> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                ChiTietPhieuNhapXuat entity = new ChiTietPhieuNhapXuat();
                entity.setMaCTPNX(rs.getInt("MaCTPNX"));
                entity.setMaPNX(rs.getLong("MaPNX"));
                entity.setMaNL(rs.getInt("MaNL"));
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
