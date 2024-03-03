/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.coffeesys.stage;

import com.coffeesys.ui.DangNhapJDialog;
import com.coffeesys.ui.MainJFrame;  
import com.coffeesys.ui.ThongTinCaNhanJDialog;
import com.coffeesys.utils.Auth;

/**
 *
 * @author TinDev
 */
public class CoffeeSys {
    public static void main(String[] args) {
        new DangNhapJDialog(null, true).setVisible(true);
        if (Auth.user != null) {
            new MainJFrame().setVisible(true);
        }
    }
}
