/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Admin;
import Model.SinhVien;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author ASUS RG
 */
public class SinhVienDAO extends ConnectDB {

    public ArrayList<SinhVien> DanhSachSinhVien() {
        ArrayList<SinhVien> arrSinhVien = new ArrayList<SinhVien>();
        try {
            String sql = "SELECT idsinhvien, tensinhvien, gioitinh, date_format(sinhvien.ngaysinh, \"%d/%m/%Y\") as ngaysinh, sdt, diachi, email, lop.idlop\n"
                    + "                         FROM sinhvien INNER JOIN lop ON sinhvien.idlop = lop.idlop";
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                SinhVien sv = new SinhVien();
                sv.setIdSinhVien(rs.getString(1));
                sv.setHoTen(rs.getString(2));
                sv.setGioiTinh(rs.getString(3));
                sv.setNgaySinh(rs.getString(4));
                sv.setSdt(rs.getInt(5));
                sv.setDiaChi(rs.getString(6));
                sv.setEmail(rs.getString(7));
                sv.setIdLop(rs.getString(8));
                arrSinhVien.add(sv);

            }
        } catch (Exception e) {
            e.printStackTrace();;
        }

        return arrSinhVien;
    }

    public ArrayList<SinhVien> DanhSachSinhVienTheoLop(String idLop) {
        ArrayList<SinhVien> arrSinhVienLop = new ArrayList<SinhVien>();
        try {
            String sql = "SELECT idsinhvien, tensinhvien, gioitinh, date_format(sinhvien.ngaysinh, \"%d/%m/%Y\") as ngaysinh, sdt, diachi, email, idlop\n"
                    + "                         FROM sinhvien where idlop = ?";
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(1, idLop);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                SinhVien sv = new SinhVien();
                sv.setIdSinhVien(rs.getString(1));
                sv.setHoTen(rs.getString(2));
                sv.setGioiTinh(rs.getString(3));
                sv.setNgaySinh(rs.getString(4));
                sv.setSdt(rs.getInt(5));
                sv.setDiaChi(rs.getString(6));
                sv.setEmail(rs.getString(7));
                sv.setIdLop(rs.getString(8));
                arrSinhVienLop.add(sv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arrSinhVienLop;
    }

    public int ThemSinhVien(SinhVien sv) {
        try {
            String sql;
            sql = """
                  INSERT INTO `qlsv`.`sinhvien` (`idsinhvien`, `tensinhvien`, `gioitinh`, `ngaysinh`, `sdt`, `diachi`, `email`, `idlop`) 
                  VALUES (?, ?, ?, ?, ?, ?, ?, ?)""";
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(1, sv.getIdSinhVien());
            pre.setString(2, sv.getHoTen());
            pre.setString(3, sv.getGioiTinh());
            pre.setString(4, sv.getNgaySinh());
            pre.setInt(5, sv.getSdt());
            pre.setString(6, sv.getDiaChi());
            pre.setString(7, sv.getEmail());
            pre.setString(8, sv.getIdLop());
            return pre.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    public int XoaSinhVien(SinhVien sv) {
        try {
            String sql;
            sql = "DELETE FROM `qlsv`.`sinhvien` WHERE (`idsinhvien` = ?)";
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(1, sv.getIdSinhVien());
            return pre.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    public int CapNhatSinhVien(SinhVien sv) {
        try {
            String sql;
            sql = """
                  UPDATE `qlsv`.`sinhvien` SET `idsinhvien` = ?, 
                  `tensinhvien` = ?, `gioitinh` = ?, 
                  `ngaysinh` = ?, `sdt` = ?, `diachi` = ?, 
                  `email` = ?, `idlop` = ? WHERE (`idsinhvien` = ?)""";
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(1, sv.getIdSinhVien());
            pre.setString(2, sv.getHoTen());
            pre.setString(3, sv.getGioiTinh());
            pre.setString(4, sv.getNgaySinh());
            pre.setInt(5, sv.getSdt());
            pre.setString(6, sv.getDiaChi());
            pre.setString(7, sv.getEmail());
            pre.setString(8, sv.getIdLop());
            pre.setString(9, sv.getIdSinhVien());
            return pre.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    public ArrayList<SinhVien> TimKiemSinhVien(int id) {
        ArrayList<SinhVien> dssv = new ArrayList<SinhVien>();
        try {
            String sql;
//            sql = "SELECT sinhvien.ID, sinhvien.Name, sinhvien.Gender, sinhvien.Email, date_format(sinhvien.DateOfBirth, \"%d/%m/%Y\") as DateOfBirth, lophoc.ID \n"
//                    + " FROM sinhvien INNER JOIN lophoc ON sinhvien.IDClass = lophoc.ID WHERE sinhvien.ID like N'%" + id + "%'";
            sql = "SELECT idsinhvien, tensinhvien, gioitinh, date_format(sinhvien.ngaysinh, \"%d/%m/%Y\") as ngaysinh, sdt, diachi, email, lop.idlop\n" +
                    "FROM sinhvien INNER JOIN lop ON sinhvien.idlop = lop.idlop WHERE sinhvien.idsinhvien like N'%" + id + "%'";
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                SinhVien sv = new SinhVien();
                sv.setIdSinhVien(rs.getString(1));
                sv.setHoTen(rs.getString(2));
                sv.setGioiTinh(rs.getString(3));
                sv.setNgaySinh(rs.getString(4));
                sv.setSdt(rs.getInt(5));
                sv.setDiaChi(rs.getString(6));
                sv.setEmail(rs.getString(7));
                sv.setIdLop(rs.getString(8));
                dssv.add(sv);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return dssv;
    }

}
