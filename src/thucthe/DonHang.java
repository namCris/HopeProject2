/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thucthe;

import java.util.Date;

/**
 *
 * @author ACER
 */
public class DonHang {
    String maDH,maNV;
    Date ngayMua;
    double tongTien;

    public DonHang(String maDH, String maNV, Date ngayMua, double tongTien) {
        this.maDH = maDH;
        this.maNV = maNV;
        this.ngayMua = ngayMua;
        this.tongTien = tongTien;
    }

    public DonHang() {
    }

    public String getMaDH() {
        return maDH;
    }

    public void setMaDH(String maDH) {
        this.maDH = maDH;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public Date getNgayMua() {
        return ngayMua;
    }

    public void setNgayMua(Date ngayMua) {
        this.ngayMua = ngayMua;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }
    
}
