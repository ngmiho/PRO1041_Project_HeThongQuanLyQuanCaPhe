/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.coffeesys.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class JDBCHelper {

    private static final String connectionUrl = "jdbc:sqlserver://localhost;databaseName=DB_PRO1041_QUANLYQUANCAPHE_V2;username=sa;password=123;"
            + "encrypt=true;trustServerCertificate=true;";
    private static final String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    
    //private static String url = "jdbc:sqlserver://localhost;databaseName=EduSys";
    //private static String username = "sa";
    //private static String password = "123";

    // Nap Driver
    // Khối khởi tạo tĩnh Statici = một khối mã được thực thi duy nhất một lần khi lớp được tải vào bộ nhớ. 
    static {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    // getConnection()
    public static Connection getDBConnect() {
        Connection con = null;
        
        try {
            con = DriverManager.getConnection(connectionUrl);
            return con;
        } catch (Exception e) {
            System.out.println("Lỗi Connect: " + e.toString());
        }
        
        return null;
    }

    // PreparedStatement
    public static PreparedStatement getPreparedStatement(String sql, Object... args) throws SQLException {
        Connection connection = DriverManager.getConnection(connectionUrl);
        //Connection connection = DriverManager.getConnection(url, username, password);
        
        PreparedStatement ps = null;

        if (sql.trim().startsWith("{")) {
            ps = connection.prepareCall(sql);
        } else {
            ps = connection.prepareStatement(sql);
        }

        for (int i = 0; i < args.length; i++) {
            ps.setObject(i + 1, args[i]);
        }

        return ps;
    }

    // Update thực hiện truy vấn UPDATE
    public static int update(String sql, Object... args) {
        try {
            PreparedStatement ps = getPreparedStatement(sql, args);

            try {
                return ps.executeUpdate();
            } finally {
                ps.getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }

    }

    // ResultSet Query thực hiện truy vấn SELECT và thủ tục lưu trữ SP
    public static ResultSet query(String sql, Object... args) {
        try {
            PreparedStatement ps = getPreparedStatement(sql, args);
            return ps.executeQuery();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    // Trả về một đối tượng Object bất kỳ
    public static Object value(String sql, Object... args) {
        try {
            ResultSet rs = query(sql, args);
            if (rs.next()) {
                return rs.getObject(0);
            }
            rs.getStatement().getConnection().close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return null;
    }
}
