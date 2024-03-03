/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.coffeesys.dao;

import com.coffeesys.entity.DonHang;
import com.coffeesys.utils.JDBCHelper;
import java.util.List;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class DonHangDAO extends CoffeeSysDAO<DonHang, Long> {

    final String INSERT_SQL = "INSERT INTO DonHang(MaDH, MaNV, MaKH, NgayTao, TongTien, TienKhachDua, TienThua) VALUES(?,?,?,?,?,?,?)";
    final String INSERT_KHONG_KH_SQL = "INSERT INTO DonHang(MaDH, MaNV, NgayTao, TongTien, TienKhachDua, TienThua) VALUES(?,?,?,?,?,?)";
    final String UPDATE_SQL = "UPDATE DonHang SET MaNV=?, MaKH=?, NgayTao=?, TongTien=?, TienKhachDua=?, TienThua=? WHERE MaDH=?";
    final String UPDATE_KHONG_KH_SQL = "UPDATE DonHang SET MaNV=?, NgayTao=?, TongTien=?, TienKhachDua=?, TienThua=? WHERE MaDH=?";
    final String DELETE_SQL = "DELETE FROM DonHang WHERE MaDH=?";
    final String SELECT_ALL_SQL = "SELECT * FROM DonHang";
    final String SELECT_BY_ID_SQL = "SELECT * FROM DonHang WHERE MaDH=?";
    final String SELECT_ALL_BY_TODAY_SQL = "SELECT * FROM DonHang WHERE CONVERT(DATE, NgayTao) = CONVERT(DATE, GETDATE()) ORDER BY MaDH DESC";

    @Override
    public void insert(DonHang entity) {
        JDBCHelper.update(INSERT_SQL,
                entity.getMaDH(),
                entity.getMaNV(),
                entity.getMaKH(),
                entity.getNgayTao(),
                entity.getTongTien(),
                entity.getTienKhachDua(),
                entity.getTienThua()
        );
    }
    
    public void insertKhongKhachHang(DonHang entity) {
        JDBCHelper.update(INSERT_KHONG_KH_SQL,
                entity.getMaDH(),
                entity.getMaNV(),
                entity.getNgayTao(),
                entity.getTongTien(),
                entity.getTienKhachDua(),
                entity.getTienThua()
        );
    }

    @Override
    public void update(DonHang entity) {
        JDBCHelper.update(UPDATE_SQL,
                entity.getMaNV(),
                entity.getMaKH(),
                entity.getNgayTao(),
                entity.getTongTien(),
                entity.getTienKhachDua(),
                entity.getTienThua(),
                entity.getMaDH()
        );
    }
    
    public void updateKhongKhachHang(DonHang entity) {
        JDBCHelper.update(UPDATE_KHONG_KH_SQL,
                entity.getMaNV(),
                entity.getNgayTao(),
                entity.getTongTien(),
                entity.getTienKhachDua(),
                entity.getTienThua(),
                entity.getMaDH()
        );
    }

    @Override
    public void delete(Long id) {
        JDBCHelper.update(DELETE_SQL, id);

    }

    @Override
    public List<DonHang> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    public List<DonHang> selectAllByToday() {
        return selectBySql(SELECT_ALL_BY_TODAY_SQL);
    }
    
    @Override
    public DonHang selectById(Long id) {
        List<DonHang> list = selectBySql(SELECT_BY_ID_SQL, id);

        if (list.isEmpty()) {
            return null;
        }

        return list.get(0);
    }

    @Override
    public List<DonHang> selectBySql(String sql, Object... args) {
        List<DonHang> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                DonHang entity = new DonHang();
                entity.setMaDH(rs.getLong("MaDH"));
                entity.setMaNV(rs.getString("MaNV"));
                entity.setMaKH(rs.getInt("MaKH"));
                entity.setNgayTao(rs.getTimestamp("NgayTao"));
                entity.setTongTien(rs.getInt("TongTien"));
                entity.setTienKhachDua(rs.getInt("TienKhachDua"));
                entity.setTienThua(rs.getInt("TienThua"));

                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<Integer> SelectYears() {
        String sql = "SELECT DISTINCT YEAR(NgayTao) Year FROM DonHang ORDER BY Year DESC";
        List<Integer> list = new ArrayList<>();

        try {
            ResultSet rs = JDBCHelper.query(sql);

            while (rs.next()) {
                list.add(rs.getInt(1));
            }

            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public List<Integer> SelectMonths() {
        String sql = "SELECT DISTINCT MONTH(NgayTao) Month FROM DonHang ORDER BY Month";
        List<Integer> list = new ArrayList<>();

        try {
            ResultSet rs = JDBCHelper.query(sql);

            while (rs.next()) {
                list.add(rs.getInt(1));
            }

            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public List<Integer> SelectDays() {
        String sql = "SELECT DISTINCT DAY(NgayTao) Day FROM DonHang ORDER BY Day";
        List<Integer> list = new ArrayList<>();

        try {
            ResultSet rs = JDBCHelper.query(sql);

            while (rs.next()) {
                list.add(rs.getInt(1));
            }

            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
