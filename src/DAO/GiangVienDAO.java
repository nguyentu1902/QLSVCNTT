/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Admin;
import Model.GiangVien;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Statement;

/**
 *
 * @author ASUS RG
 */
public class GiangVienDAO extends ConnectDB{

    public ArrayList<GiangVien> DanhSachGiangVien() {
        ArrayList<GiangVien> arrGiangVien = new ArrayList<GiangVien>();
        try {
            String sql = "SELECT * FROM qlsv.giangvien";
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                GiangVien gv = new GiangVien();
                gv.setIdGiangVien(rs.getString(1));
                gv.setTenGiangVien(rs.getString(2));
                gv.setHocVi(rs.getString(3));
                arrGiangVien.add(gv);

            }
        } catch (Exception e) {
            e.printStackTrace();;
        }

        return arrGiangVien;
    }

    public int ThemGiangVien(GiangVien gv) {
        try {
            String sql;
            sql = "INSERT INTO `qlsv`.`giangvien` (`idgiangvien`, `tengiangvien`, `hocvi`) VALUES (?, ?, ?)";
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(1, gv.getIdGiangVien());
            pre.setString(2, gv.getTenGiangVien());
            pre.setString(3, gv.getHocVi());
            return pre.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    public int XoaGiangVien(GiangVien gv) {
        try {
            String sql;
            sql = "DELETE FROM `qlsv`.`giangvien` WHERE (`idgiangvien` = ?);";
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(1, gv.getIdGiangVien());
            return pre.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    public int CapNhatGiangVien(GiangVien gv) {
        try {
            String sql;
            sql = "UPDATE `qlsv`.`giangvien` SET `idgiangvien` = ?, `tengiangvien` = ?, `hocvi` = ? WHERE (`idgiangvien` = ?)";
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(1, gv.getIdGiangVien());
            pre.setString(2, gv.getTenGiangVien());
            pre.setString(3, gv.getHocVi());
            pre.setString(4, gv.getIdGiangVien());
            return pre.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    public ArrayList<GiangVien> TimKiemGiangVien(String id) {
        ArrayList<GiangVien> dsgv = new ArrayList<GiangVien>();
        try {
            String sql;
            sql = "SELECT * FROM qlsv.giangvien where idgiangvien like N'%" + id + "%'";
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                GiangVien gv = new GiangVien();
                gv.setIdGiangVien(rs.getString(1));
                gv.setTenGiangVien(rs.getString(2));
                gv.setHocVi(rs.getString(3));
                dsgv.add(gv);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsgv;
    }

}
