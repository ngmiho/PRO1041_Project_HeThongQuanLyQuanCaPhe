/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.coffeesys.dao;

import com.coffeesys.entity.PhieuNhapXuat;
import com.coffeesys.utils.JDBCHelper;
import java.util.List;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class PhieuNhapXuatDAO extends CoffeeSysDAO<PhieuNhapXuat, Long> {

    final String INSERT_SQL = "INSERT INTO PhieuNhapXuat(MaPNX, MaNV, NgayNX, TrangThai) VALUES(?,?,?,?)";
    final String UPDATE_SQL = "UPDATE PhieuNhapXuat SET MaNV=?, NgayNX=?, TrangThai=? WHERE MaPNX=?";
    final String DELETE_SQL = "DELETE FROM PhieuNhapXuat WHERE MaPNX=?";
    final String SELECT_ALL_SQL = "SELECT * FROM PhieuNhapXuat ORDER BY MaPNX DESC";
    final String SELECT_BY_ID_SQL = "SELECT * FROM PhieuNhapXuat WHERE MaPNX=?";

    @Override
    public void insert(PhieuNhapXuat entity) {
        JDBCHelper.update(INSERT_SQL,
                entity.getMaPNX(),
                entity.getMaNV(),
                entity.getNgayNX(),
                entity.isTrangThai()
        );
    }

    @Override
    public void update(PhieuNhapXuat entity) {
        JDBCHelper.update(UPDATE_SQL,
                entity.getMaNV(),
                entity.getNgayNX(),
                entity.isTrangThai(),
                entity.getMaPNX()
        );
    }

    @Override
    public void delete(Long id) {
        JDBCHelper.update(DELETE_SQL, id);

    }

    @Override
    public List<PhieuNhapXuat> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public PhieuNhapXuat selectById(Long id) {
        List<PhieuNhapXuat> list = selectBySql(SELECT_BY_ID_SQL, id);

        if (list.isEmpty()) {
            return null;
        }

        return list.get(0);
    }

    @Override
    public List<PhieuNhapXuat> selectBySql(String sql, Object... args) {
        List<PhieuNhapXuat> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                PhieuNhapXuat entity = new PhieuNhapXuat();
                entity.setMaPNX(rs.getLong("MaPNX"));
                entity.setMaNV(rs.getString("MaNV"));
                entity.setNgayNX(rs.getTimestamp("NgayNX"));
                entity.setTrangThai(rs.getBoolean("TrangThai"));

                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
