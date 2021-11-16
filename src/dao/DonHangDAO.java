/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import phuongtien.JDBCHelper;
import thucthe.DonHang;
import java.sql.ResultSet;

/**
 *
 * @author ACER
 */
public class DonHangDAO extends DAO<DonHang, String> {
    
    final String INSERT_SQL = "INSERT INTO DonHang (MaDH, Tongtien, Ngaymua, MaNV) VALUES (?, ?, ?, ?)";
    final String UPDATE_SQL = "UPDATE DonHang SET Tongtien=? , Ngaymua=? , MaNV=?  WHERE MaDH=?";
    final String DELETE_SQL = "DELETE FROM DonHang WHERE MaDH=?";
    final String SELECT_ALL_SQL = "SELECT * FROM DonHang";
    final String SELECT_BY_ID_SQL = "SELECT * FROM DonHang WHERE MaDH = ?";
    @Override
    public void insert(DonHang entity) {
       JDBCHelper.update(INSERT_SQL, entity.getMaDH(),entity.getTongTien(),entity.getNgayMua(),entity.getMaNV());
    }

    @Override
    public void update(DonHang entity) {
       JDBCHelper.update(UPDATE_SQL, entity.getTongTien(),entity.getNgayMua(),entity.getMaNV(), entity.getMaDH());
    }

    @Override
    public void delete(String id) {
        JDBCHelper.update(DELETE_SQL, id);
    }

    @Override
    public List<DonHang> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public DonHang selectById(String id) {
       List<DonHang> list = selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<DonHang> selectBySql(String sql, Object... args) {
            List<DonHang> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                DonHang entity = new DonHang();
                entity.setMaDH(rs.getString("MaDH"));
                entity.setTongTien(rs.getDouble("Tongtien"));
                entity.setNgayMua(rs.getDate("Ngaymua"));
                entity.setMaNV(rs.getString("MaNV"));
                list.add(entity);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return list;
    }
       public List<DonHang> selectByDHCT(){
        String sql = "select distinct a.MaDH,b.MaS,b.Soluong,b.Sotien,a.Tongtien,a.Ngaymua,a.MaNV,b.Ghichu from DonHang a,DonHangChiTiet b where a.MaDH = b.MaDH";
        return this.selectBySql(sql);
    }
}
