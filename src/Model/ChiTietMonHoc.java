/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ASUS RG
 */
public class ChiTietMonHoc {

    int idChiTietMonHoc;
    String ngayBatDau;
    String ngayKetThuc;
    Float diemQT;
    Float diemCK;
    Float diemTLH4;
    String idMonHoc;
    String idSinhVien;

    public ChiTietMonHoc() {
    }

    public ChiTietMonHoc(int idChiTietMonHoc, String ngayBatDau, String ngayKetThuc, Float diemQT, Float diemCK, Float diemTLH4, String idMonHoc, String idSinhVien) {
        this.idChiTietMonHoc = idChiTietMonHoc;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.diemQT = diemQT;
        this.diemCK = diemCK;
        this.diemTLH4 = diemTLH4;
        this.idMonHoc = idMonHoc;
        this.idSinhVien = idSinhVien;
    }

    public int getIdChiTietMonHoc() {
        return idChiTietMonHoc;
    }

    public void setIdChiTietMonHoc(int idChiTietMonHoc) {
        this.idChiTietMonHoc = idChiTietMonHoc;
    }

    public String getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(String ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public String getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(String ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public Float getDiemQT() {
        return diemQT;
    }

    public void setDiemQT(Float diemQT) {
        this.diemQT = diemQT;
    }

    public Float getDiemCK() {
        return diemCK;
    }

    public void setDiemCK(Float diemCK) {
        this.diemCK = diemCK;
    }

    public Float getDiemTLH4() {
        return diemTLH4;
    }

    public void setDiemTLH4(Float diemTLH4) {
        this.diemTLH4 = diemTLH4;
    }

    public String getIdMonHoc() {
        return idMonHoc;
    }

    public void setIdMonHoc(String idMonHoc) {
        this.idMonHoc = idMonHoc;
    }

    public String getIdSinhVien() {
        return idSinhVien;
    }

    public void setIdSinhVien(String idSinhVien) {
        this.idSinhVien = idSinhVien;
    }

}
