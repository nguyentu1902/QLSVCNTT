/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Admin;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author ASUS RG
 */
public class AdminDAO extends ConnectDB{
    public Admin dangNhap(String userName, String passWord)
    {
        Admin adm = null;
        try {
            String sql = "select * from admin where userName=? and passWord=?";
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(1, userName);
            pre.setString(2, passWord);
            ResultSet rs = pre.executeQuery();
            
            if(rs.next())
            {
                adm = new Admin();
                adm.setIdAdmin(rs.getInt(1));
                adm.setUserName(rs.getString(2));
                adm.setPassWord(rs.getString(3));
                adm.setHoTenAdmin(rs.getString(4));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return adm;
    }
    
}
