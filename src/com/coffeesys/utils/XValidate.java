/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.coffeesys.utils;

/**
 *
 * @author Admin
 */
public class XValidate {
    //kiểm tra nếu là chuỗi trả về true
    public static boolean checkString(String txt) {
        if (txt.matches("^\\w+$") == false)
            return false;
        return true;
    }
    
    //kiểm tra nếu là số nguyên trả về true
    public static boolean checkDecimal(String txt) {
        if (txt.matches("^\\d+$")	== false)
            return false;
        return true;
    }
    
    //kiểm tra nếu là số thực trả về true
    public static boolean checkFloat(String txt) {
        if (txt.matches("^[-+]?\\d*\\.\\d+$") == false)
            return false;
        return true;
    }
    
    //kiểm tra nếu là email trả về true
    public static boolean checkEmail(String txt) {
        if (txt.matches(".*@.*") == false)
            return false;
        return true;
    }
    
    //kiểm tra nếu là tên có kí tự unicode trả về true
    public static boolean checkNameInlucdeUnicode(String txt) {
        if (txt.matches("^[\\p{L}\\s]+$") == false)
            return false;
        return true;
    }
}
