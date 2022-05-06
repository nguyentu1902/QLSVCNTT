/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Admin;
import Model.ChiTietMonHoc;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
/**
 *
 * @author ASUS RG
 */
public class ChiTietMonHocDAO extends ConnectDB {

    public ArrayList<ChiTietMonHoc> DanhSachCTHM() {
        ArrayList<ChiTietMonHoc> arrCTMH = new ArrayList<ChiTietMonHoc>();
        try {
            String sql = "SELECT * FROM qlsv.ctmh";
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                ChiTietMonHoc ctmh = new ChiTietMonHoc();
                ctmh.setNgayBatDau(rs.getString(2));
                ctmh.setNgayKetThuc(rs.getString(3));
                ctmh.setDiemQT(rs.getFloat(4));
                ctmh.setDiemCK(rs.getFloat(5));
                ctmh.setDiemTLH4(rs.getFloat(6));
                ctmh.setIdMonHoc(rs.getString(7));
                ctmh.setIdSinhVien(rs.getString(8));
                arrCTMH.add(ctmh);

            }
        } catch (Exception e) {
            e.printStackTrace();;
        }

        return arrCTMH;
    }

    public int ThemCTMH(ChiTietMonHoc ctmh) {
        try {
            String sql;
            sql = "INSERT INTO `qlsv`.`ctmh` (`ngaybatdau`, `ngayketthuc`, `diemqt`, `diemck`, `idmh`, `idsinhvien`) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(1, ctmh.getNgayBatDau());
            pre.setString(2, ctmh.getNgayKetThuc());
            pre.setFloat(3, ctmh.getDiemQT());
            pre.setFloat(4, ctmh.getDiemCK());
            pre.setString(5, ctmh.getIdMonHoc());
            pre.setString(6, ctmh.getIdSinhVien());
            return pre.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    public int XoaCTMH(ChiTietMonHoc ctmh) {
        try {
            String sql;
            sql = "DELETE FROM `qlsv`.`ctmh` WHERE (`idsinhvien` = ?) and (`idmh`= ?)";
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(1, ctmh.getIdSinhVien());
            pre.setString(2, ctmh.getIdMonHoc());
            return pre.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
    
        public int CapNhatCTMH(ChiTietMonHoc ctmh) {
        try {
            String sql;
            sql = "UPDATE `qlsv`.`ctmh` SET `ngaybatdau` = ?, `ngayketthuc` = ?, `diemqt` = ?, `diemck` = ? WHERE (`idmh` = ?) and (`idsinhvien` = ?)";
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(1, ctmh.getNgayBatDau());
            pre.setString(2, ctmh.getNgayKetThuc());
            pre.setFloat(3, ctmh.getDiemQT());
            pre.setFloat(4, ctmh.getDiemCK());
            pre.setString(5, ctmh.getIdMonHoc());
            pre.setString(6, ctmh.getIdSinhVien());
            return pre.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
        
        public ArrayList<ChiTietMonHoc> TimKiemCTMH(int id) {
        ArrayList<ChiTietMonHoc> dsCTMH = new ArrayList<ChiTietMonHoc>();
        try {
            String sql;
            sql = "SELECT * FROM qlsv.ctmh WHERE idsinhvien like '%" + id +"%'";
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                ChiTietMonHoc ctmh = new ChiTietMonHoc();
                ctmh.setNgayBatDau(rs.getString(2));
                ctmh.setNgayKetThuc(rs.getString(3));
                ctmh.setDiemQT(rs.getFloat(4));
                ctmh.setDiemCK(rs.getFloat(5));
                ctmh.setDiemTLH4(rs.getFloat(6));
                ctmh.setIdMonHoc(rs.getString(7));
                ctmh.setIdSinhVien(rs.getString(8));
                dsCTMH.add(ctmh);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsCTMH;
    }
    
}
