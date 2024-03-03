/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.coffeesys.utils;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class MsgBox {

    /**
     * Hiển thị thông báo cho người dùng
     *
     * @param parent = cửa số hiện thông báo
     * @param message = nội dung thông báo
     */
    public static void alert(Component parent, String message) {
        JOptionPane.showMessageDialog(parent, message,
                "Hệ thống quản lý quán cà phê", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Hiển thị thông báo và yêu cầu xác nhận
     *
     * @param parent = cửa sổ hiện thông báo
     * @param message = câu hỏi --> trả lời yes or no
     * @return = kết quả nhận được true or false
     */
    public static boolean confirm(Component parent, String message) {
        int result = JOptionPane.showConfirmDialog(parent, message,
                "Hệ thống quản lý quán cà phê",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        return result == JOptionPane.YES_OPTION;
    }

    /**
     * Hiển thị thông báo yêu cầu người dùng nhập dữ liệu input
     *
     * @param parent = cửa sổ hiện thông báo
     * @param message = nội dung thông báo yêu cầu nhập dữ liệu
     * @return = dữ liệu người dùng nhập vào
     */
    public static String prompt(Component parent, String message) {
        return JOptionPane.showInputDialog(parent, message,
                "Hệ thống quản lý quán cà phê",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
