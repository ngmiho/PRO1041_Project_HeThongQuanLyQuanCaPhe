/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.coffeesys.dao;

import com.coffeesys.entity.SanPham;
import com.coffeesys.utils.JDBCHelper;
import java.util.List;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class SanPhamDAO extends CoffeeSysDAO<SanPham, String> {

    final String INSERT_SQL = "INSERT INTO SanPham(MaSP, MaLSP, TenSP, DonGia, TrangThai, Size, Mota, HinhAnh) VALUES(?,?,?,?,?,?,?,?)";
    final String UPDATE_SQL = "UPDATE SanPham SET MaLSP=?, TenSP=?, DonGia=?, TrangThai=?, Size=?, Mota=?, HinhAnh=?  WHERE MaSP=?";
    final String DELETE_SQL = "DELETE FROM SanPham WHERE MaSP=?";
    final String SELECT_ALL_SQL = "SELECT * FROM SanPham";
    final String SELECT_BY_ID_SQL = "SELECT * FROM SanPham WHERE MaSP=?";
    final String SELECT_BY_MALSP_SQL = "SELECT * FROM SanPham WHERE MaLSP=?";
    final String SELECT_BY_MALSP_AND_TRANGTHAI_SQL = "SELECT * FROM SanPham WHERE MaLSP=? AND TrangThai = 1";

    @Override
    public void insert(SanPham entity) {
        JDBCHelper.update(INSERT_SQL,
                entity.getMaSP(),
                entity.getMaLSP(),
                entity.getTenSP(),
                entity.getDonGia(),
                entity.isTrangThai(),
                entity.getSize(),
                entity.getMoTa(),
                entity.getHinhAnh()
        );
    }

    @Override
    public void update(SanPham entity) {
        JDBCHelper.update(UPDATE_SQL,
                entity.getMaLSP(),
                entity.getTenSP(),
                entity.getDonGia(),
                entity.isTrangThai(),
                entity.getSize(),
                entity.getMoTa(),
                entity.getHinhAnh(),
                entity.getMaSP()
        );
    }

    @Override
    public void delete(String id) {
        JDBCHelper.update(DELETE_SQL, id);
    }

    @Override
    public List<SanPham> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public SanPham selectById(String id) {
        List<SanPham> list = selectBySql(SELECT_BY_ID_SQL, id);

        if (list.isEmpty()) {
            return null;
        }

        return list.get(0);
    }

    @Override
    public List<SanPham> selectBySql(String sql, Object... args) {
        List<SanPham> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                SanPham entity = new SanPham();
                entity.setMaSP(rs.getString("MaSP"));
                entity.setMaLSP(rs.getInt("MaLSP"));
                entity.setTenSP(rs.getString("TenSP"));
                entity.setDonGia(rs.getDouble("DonGia"));
                entity.setTrangThai(rs.getBoolean("TrangThai"));
                entity.setSize(rs.getString("Size"));
                entity.setMoTa(rs.getString("MoTa"));
                entity.setHinhAnh(rs.getString("HinhAnh"));

                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public List<SanPham> selectByMaLSP(int maLSP) {
        return selectBySql(SELECT_BY_MALSP_SQL, maLSP);
    }
    
    public List<SanPham> selectByMaLSPAndTrangThai(int maLSP) {
        return selectBySql(SELECT_BY_MALSP_AND_TRANGTHAI_SQL, maLSP);
    }

}
