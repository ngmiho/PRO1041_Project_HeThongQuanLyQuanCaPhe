/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.coffeesys.dao;

import com.coffeesys.entity.CongThuc;
import com.coffeesys.utils.JDBCHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TinDev
 */
public class CongThucDAO {
    
    private final String INSERT_SQL = "INSERT INTO CongThuc [MaSP],[MaNL],[SoLuong],[GhiChu] VALUES (?,?,?,?)";
    private final String UPDATE_SQL = "UPDATE CongThuc SET SoLuong = ?, GhiChu = ? WHERE MaSP = ? AND MaNL = ?";
    private final String DELETE_SQL = "DELETE CongThuc Where MaSP = ? AND MaNL = ?";
    private final String SELECT_ALL_SQL = "SELECT * FROM CongThuc";
    private final String SELECT_BY_MASP_SQL = "SELECT * FROM CongThuc WHERE MaSP = ?";

    public void insert(CongThuc ct) {
        JDBCHelper.update(INSERT_SQL, ct.getMaSP(), ct.getMaNL(),
                                            ct.getSoLuong(), ct.getGhiChu());
    }

    public void update(CongThuc ct) {
        JDBCHelper.update(INSERT_SQL, ct.getSoLuong(), ct.getGhiChu(),
                                        ct.getMaSP(), ct.getMaNL());
    }

    public void delete(String MaSP, int MaNL) {
        JDBCHelper.update(DELETE_SQL, MaSP, MaNL);
    }

    public List<CongThuc> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    public List<CongThuc> selectByMaSP(String MaSP) {
        return selectBySql(SELECT_BY_MASP_SQL, MaSP);
    }

    public List<CongThuc> selectBySql(String sql, Object... args) {
        List<CongThuc> arrCT = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                CongThuc ct = new CongThuc();
                ct.setMaSP(rs.getString(1));
                ct.setMaNL(rs.getInt(2));
                ct.setSoLuong(rs.getInt(3));
                ct.setGhiChu(rs.getString(4));
                arrCT.add(ct);
            }
            rs.getStatement().getConnection().close();
            return arrCT;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }  
}
