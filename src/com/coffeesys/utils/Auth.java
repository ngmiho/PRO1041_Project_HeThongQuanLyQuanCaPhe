/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.coffeesys.utils;

import com.coffeesys.entity.NhanVien;

/**
 *
 * @author Admin
 */
public class Auth {

    // Đối tượng chứa thông tin nhân viên sau khi đăng nhập
    public static NhanVien user = null;

    //Xóa thông tin người dùng sau khi đăng xuất
    public static void clear() {
        Auth.user = null;
    }

    // Kiểm tra người dùng đã đăng nhập
    public static boolean isLogin() {
        return Auth.user != null;
    }

    // Kiểm tra vai trò của người dùng
    public static boolean isManager() {
        return Auth.isLogin() && user.getChucVu().equalsIgnoreCase("Quản lý");
    }
}
