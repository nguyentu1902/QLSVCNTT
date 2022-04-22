/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ASUS RG
 */
public class ConnectDB {

    public Connection conn = null;

    public ConnectDB() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/qlsv", "root", "admin12345");
            System.out.println("Ket noi thanh cong");
        } catch (SQLException e) {
            System.out.println("Ket noi that bai");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ConnectDB a = new ConnectDB();
    }
}
