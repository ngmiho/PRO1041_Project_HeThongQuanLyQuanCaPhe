/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.coffeesys.dao;

import com.coffeesys.dao.CoffeeSysDAO;
import com.coffeesys.entity.NguyenLieu;
import com.coffeesys.utils.JDBCHelper;
import java.util.List;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class NguyenLieuDAO extends CoffeeSysDAO<NguyenLieu, Integer> {

    final String INSERT_SQL = "INSERT INTO NguyenLieu(TenNL, DonGia, DonViTinh, SoLuong) VALUES(?,?,?,?)";
    final String UPDATE_SQL = "UPDATE NguyenLieu SET TenNL=?, DonGia=?, DonViTinh=?, SoLuong=? WHERE MaNL=?";
    final String DELETE_SQL = "DELETE FROM NguyenLieu WHERE MaNL=?";
    final String SELECT_ALL_SQL = "SELECT * FROM NguyenLieu";
    final String SELECT_BY_ID_SQL = "SELECT * FROM NguyenLieu WHERE MaNL=?";
    final String SELECT_BY_DON_VI_TINH_SQL = "SELECT DISTINCT DonViTinh FROM NguyenLieu";

    @Override
    public void insert(NguyenLieu entity) {
        JDBCHelper.update(INSERT_SQL,
                entity.getTenNL(),
                entity.getDonGia(),
                entity.getDonViTinh(),
                entity.getSoLuong()
        );
    }

    @Override
    public void update(NguyenLieu entity) {
        JDBCHelper.update(UPDATE_SQL,
                entity.getTenNL(),
                entity.getDonGia(),
                entity.getDonViTinh(),
                entity.getSoLuong(),
                entity.getMaNL()
        );
    }

    @Override
    public void delete(Integer id) {
        JDBCHelper.update(DELETE_SQL, id);

    }

    @Override
    public List<NguyenLieu> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public NguyenLieu selectById(Integer id) {
        List<NguyenLieu> list = selectBySql(SELECT_BY_ID_SQL, id);

        if (list.isEmpty()) {
            return null;
        }

        return list.get(0);
    }
    
    public List<String> selectDonViTinh() {
        
        List<String> arrString = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(SELECT_BY_DON_VI_TINH_SQL);
            while (rs.next()) {
                arrString.add(rs.getString(1));
            }
            return arrString;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<NguyenLieu> selectBySql(String sql, Object... args) {
        List<NguyenLieu> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                NguyenLieu entity = new NguyenLieu();
                entity.setMaNL(rs.getInt("MaNL"));
                entity.setTenNL(rs.getString("TenNL"));
                entity.setDonGia(rs.getInt("DonGia"));
                entity.setDonViTinh(rs.getString("DonViTinh"));
                entity.setSoLuong(rs.getInt("SoLuong"));

                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
