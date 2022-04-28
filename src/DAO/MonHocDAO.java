/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Admin;
import Model.MonHoc;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author ASUS RG
 */
public class MonHocDAO extends ConnectDB {

    public ArrayList<MonHoc> DanhSachMonHoc() {
        ArrayList<MonHoc> arrMonHoc = new ArrayList<MonHoc>();
        try {
            String sql = "SELECT * FROM qlsv.monhoc";
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                MonHoc mh = new MonHoc();
                mh.setIdMonHoc(rs.getString(1));
                mh.setTenMonHoc(rs.getString(2));
                mh.setSoTinChi(rs.getInt(3));
                mh.setIdGiangVien(rs.getString(4));
                arrMonHoc.add(mh);

            }
        } catch (Exception e) {
            e.printStackTrace();;
        }

        return arrMonHoc;
    }

    public int ThemMonHoc(MonHoc mh) {
        try {
            String sql;
            sql = "INSERT INTO `qlsv`.`monhoc` (`idmh`, `tenmh`, `sotinchi`, `idgiangvien`) VALUES (?, ?, ?, ?);";
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(1, mh.getIdMonHoc());
            pre.setString(2, mh.getTenMonHoc());
            pre.setInt(3, mh.getSoTinChi());
            pre.setString(4, mh.getIdGiangVien());
            return pre.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    public int XoaMonHoc(MonHoc mh) {
        try {
            String sql;
            sql = "DELETE FROM `qlsv`.`monhoc` WHERE (`idmh` = ?)";
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(1, mh.getIdMonHoc());
            return pre.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    public int CapNhatMonHoc(MonHoc mh) {
        try {
            String sql;
            sql = "UPDATE `qlsv`.`monhoc` SET `idmh` = ?, `tenmh` = ?, `sotinchi` = ?, `idgiangvien` = ? WHERE (`idmh` = ?);";
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(1, mh.getIdMonHoc());
            pre.setString(2, mh.getTenMonHoc());
            pre.setInt(3, mh.getSoTinChi());
            pre.setString(4, mh.getIdGiangVien());
            pre.setString(5, mh.getIdMonHoc());
            return pre.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
    
        public ArrayList<MonHoc> TimKiemMonHoc(String tenmh) {
        ArrayList<MonHoc> dsmh = new ArrayList<MonHoc>();
        try {
            String sql;
            sql = "select * from qlsv.monhoc where tenmh like N'%" + tenmh + "%'";
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                MonHoc mh = new MonHoc();
                mh.setIdMonHoc(rs.getString(1));
                mh.setTenMonHoc(rs.getString(2));
                mh.setSoTinChi(rs.getInt(3));
                mh.setIdGiangVien(rs.getString(4));
                dsmh.add(mh);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsmh;
    }

}
