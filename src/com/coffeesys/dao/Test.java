/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.coffeesys.dao;

import com.coffeesys.entity.ChiTietDonHang;
import com.coffeesys.entity.DonHang;
import com.coffeesys.entity.KhachHang;
import com.coffeesys.entity.LoaiSanPham;
import com.coffeesys.entity.NguyenLieu;
import com.coffeesys.entity.NhanVien;
import com.coffeesys.entity.PhieuNhapXuat;
import com.coffeesys.entity.SanPham;
import com.coffeesys.utils.XDate;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import javax.swing.Timer;

/**
 *
 * @author Admin
 */
public class Test {

    public static void main(String[] args) {

        /*
        NhanVienDAO dao = new NhanVienDAO();

        //dao.insert(new NhanVien("NV008", "Nguyễn Văn A", true, XDate.toDate("2000-01-01", "yyyy-MM-dd"), "0123456789", "ps26890@fpt.edu.vn", "Nhân Viên", 20000, "nam6.png", "123456"));
        //dao.update(new NhanVien("NV008", "Nguyễn Văn A", true, XDate.toDate("2000-01-01", "yyyy-MM-dd"), "0123456789", "PS26890@fpt.edu.vn", "Nhân Viên", 20000, "nam6.png", "123456"));
        //dao.delete("NV008");
        
        List<NhanVien> list = dao.selectAll();
        for (NhanVien nv : list) {
            System.out.println(nv.toString());
        }
        
        KhachHangDAO khDAO = new KhachHangDAO();
        List<KhachHang> listKH = khDAO.selectAll();
        for (KhachHang kh : listKH) {
            System.out.println(kh.toString());
        }
         
        LoaiSanPhamDAO lspDAO = new LoaiSanPhamDAO();
        List<LoaiSanPham> listLSP = lspDAO.selectAll();
        for (LoaiSanPham lsp : listLSP) {
            System.out.println(lsp.toString());
        }

        SanPhamDAO spDAO = new SanPhamDAO();
        List<SanPham> listSP = spDAO.selectAll();
        for (SanPham sp : listSP) {
            System.out.println(sp.toString());
        }
        
        NguyenLieuDAO nlDAO = new NguyenLieuDAO();
        List<NguyenLieu> listNL = nlDAO.selectAll();
        for (NguyenLieu nl : listNL) {
            System.out.println(nl.toString());
        }
        NguyenLieu nguyenLieu1 = nlDAO.selectById(2);
        System.out.println(nguyenLieu1.toString());
        
        PhieuNhapXuatDAO pnxDAO = new PhieuNhapXuatDAO();
        List<PhieuNhapXuat> listPNX = pnxDAO.selectAll();
        for (PhieuNhapXuat pnx : listPNX) {
            System.out.println(pnx.toString());
        }
        PhieuNhapXuat pnx1 = pnxDAO.selectById(1);
        System.out.println(pnx1.toString());
        
        
        
        DonHangDAO dhDAO = new DonHangDAO();
        List<DonHang> listDH = dhDAO.selectAll();
        for (DonHang dh : listDH) {
            System.out.println(dh.toString());
        }
        DonHang dh1 = dhDAO.selectById(1173685751);
        System.out.println(dh1.toString());
        
        
        ChiTietDonHangDAO ctdhDAO = new ChiTietDonHangDAO();
        List<ChiTietDonHang> listCTDH = ctdhDAO.selectAll();
        for (ChiTietDonHang ctdh : listCTDH) {
            System.out.println(ctdh.toString());
        }
        ChiTietDonHang ctdh1 = ctdhDAO.selectById(10);
        System.out.println(ctdh1.toString());
        
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        Date date = new Date();
        long id = timestamp.getTime();
        System.out.println("ID: " + id);
        System.out.println("Datetime: " + XDate.toString(date, "yyyy-MM-dd hh:mm:ss"));
        
       
        ThongKeDAO tkDAO = new ThongKeDAO();

        try {
            List<Object[]> list = tkDAO.getDoanhThuTheoNgay(2023,7,26);

            for (Object[] row : list) {
                System.out.println("Ngay\t\tThang\t\tNam\t\tSoLuongDonHang\t\tDoanhThu");
                System.out.println(row[0] + "\t\t" + row[1] + "\t\t" + row[2] + "\t\t" + row[3] + "\t\t\t" + row[4]);
            }
        } catch (Exception e) {
            System.out.println(e);
        }*/
        
        DonHangDAO dhDAO = new DonHangDAO();
        List<DonHang> listDH = dhDAO.selectAllByToday();
        
        for (DonHang item : listDH) {
            Date ngayTao = item.getNgayTao();
            System.out.println(XDate.toString(ngayTao, "dd-MM-yyyy hh:mm:ss"));
        }
        
        System.out.println(XDate.toString(new Date(), "dd-MM-yyyy hh:mm:ss"));
    }
}
