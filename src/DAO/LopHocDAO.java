/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Admin;
import Model.LopHoc;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
/**
 *
 * @author ASUS RG
 */
public class LopHocDAO extends ConnectDB{
        public Vector<LopHoc> DanhSachLop() {
        Vector<LopHoc> vec = new Vector<LopHoc>();
        try {
            String sql = "SELECT * FROM qlsv.lop;";
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                LopHoc lh = new LopHoc();
                lh.setIdLop(rs.getString(1));
                lh.setTenLop(rs.getString("tenlop"));
                vec.add(lh);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return vec;
    }
    
}
