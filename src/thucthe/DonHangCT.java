/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thucthe;

/**
 *
 * @author ACER
 */
public class DonHangCT {
    String maDHCT,ghiChu;
    int maS,soLuong;
    double giaBan;

    public DonHangCT(String maDHCT, String ghiChu, int maS, int soLuong, double giaBan) {
        this.maDHCT = maDHCT;
        this.ghiChu = ghiChu;
        this.maS = maS;
        this.soLuong = soLuong;
        this.giaBan = giaBan;
    }

    public DonHangCT() {
    }

    public String getMaDHCT() {
        return maDHCT;
    }

    public void setMaDHCT(String maDHCT) {
        this.maDHCT = maDHCT;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public int getMaS() {
        return maS;
    }

    public void setMaS(int maS) {
        this.maS = maS;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }
    
}
