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
    
    final String INSERT_SQL = "INSERT INTO DonHang (MaDH, Ngaymua, MaNV, Trangthai) VALUES (?, ?, ?, ?)";
    final String UPDATE_SQL = "UPDATE DonHang SET Ngaymua=?, MaNV=?, Trangthai=? WHERE MaDH=?";
    final String DELETE_SQL = "DELETE FROM DonHang WHERE MaDH=?";
    final String SELECT_ALL_SQL = "SELECT * FROM DonHang";
    final String SELECT_BY_ID_SQL = "SELECT * FROM DonHang WHERE MaDH = ?";
    @Override
    public void insert(DonHang entity) {
       JDBCHelper.update(INSERT_SQL, entity.getMaDH(),entity.getNgayMua(),entity.getMaNV(),entity.getTrangThai());
    }

    @Override
    public void update(DonHang entity) {
       JDBCHelper.update(UPDATE_SQL, entity.getNgayMua(), entity.getMaNV(), entity.getTrangThai(), entity.getMaDH());
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
                entity.setNgayMua(rs.getDate("Ngaymua"));
                entity.setMaNV(rs.getString("MaNV"));
                entity.setTrangThai(rs.getString("Trangthai"));
                list.add(entity);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return list;
    }
       
    
     private List<Object[]> getListOfArray(String sql, String[] cols, Object... agrs) {
        try {
            List<Object[]> list = new ArrayList<>();
            ResultSet rs = JDBCHelper.query(sql, agrs);
            
            while (rs.next()) {
                Object[] vals = new Object[cols.length];
                for(int i=0; i<cols.length;i++){
                    vals[i]= rs.getObject(cols[i]);
                }
                list.add(vals);
            } 
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public List<Object[]> getThongTin(String tenS) {
        String sql = "{CALL sp_DonHang(?)}";
        String[] cols = {"ls.TenLS","s.TenS","s.Tacgia","a.MaS","a.Soluong","a.Sotien","a.Ghichu","d.*"};
        return this.getListOfArray(sql, cols, tenS);
    }
    
}
