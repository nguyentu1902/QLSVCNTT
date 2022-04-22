/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ASUS RG
 */
public class Admin {

    private int idAdmin;
    private String userName;
    private String passWord;
    private String hoTenAdmin;

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getHoTenAdmin() {
        return hoTenAdmin;
    }

    public void setHoTenAdmin(String hoTenAdmin) {
        this.hoTenAdmin = hoTenAdmin;
    }

    public Admin() {
    }

    public Admin(int idAdmin, String userName, String passWord, String hoTenAdmin) {
        this.idAdmin = idAdmin;
        this.userName = userName;
        this.passWord = passWord;
        this.hoTenAdmin = hoTenAdmin;
    }

}
