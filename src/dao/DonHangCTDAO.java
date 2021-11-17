/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import phuongtien.JDBCHelper;
import thucthe.DonHangCT;
import java.sql.ResultSet;
/**
 *
 * @author ACER
 */
public class DonHangCTDAO extends DAO<DonHangCT, String>{

    final String INSERT_SQL = "INSERT INTO DonHangChiTiet (MaDH, MaS, Soluong, Sotien, Ghichu) VALUES (?, ?, ?, ?, ?)";
    final String UPDATE_SQL = "UPDATE DonHangChiTiet SET MaS=? , Soluong=? , Sotien=?, Ghichu=? WHERE MaDH=?";
    final String DELETE_SQL = "DELETE FROM DonHangChiTiet WHERE MaDH=?";
    final String SELECT_ALL_SQL = "SELECT * FROM DonHangChiTiet";
    final String SELECT_BY_ID_SQL = "SELECT * FROM DonHangChiTiet WHERE MaDH = ?";
    
    @Override
    public void insert(DonHangCT entity) {
        JDBCHelper.update(INSERT_SQL, entity.getMaDHCT(),entity.getMaS(),entity.getSoLuong(),entity.getGiaBan(),entity.getGhiChu());
    }

    @Override
    public void update(DonHangCT entity) {
        JDBCHelper.update(UPDATE_SQL, entity.getMaS(),entity.getSoLuong(),entity.getGiaBan(),entity.getGhiChu(), entity.getMaDHCT());
    }

    @Override
    public void delete(String id) {
       JDBCHelper.update(DELETE_SQL, id);
    }

    @Override
    public List<DonHangCT> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public DonHangCT selectById(String id) {
       List<DonHangCT> list = selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<DonHangCT> selectBySql(String sql, Object... args) {
             List<DonHangCT> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                DonHangCT entity = new DonHangCT();
                //entity.setMaDHCT(rs.getString("MaDH"));
                entity.setMaS(rs.getInt("MaS"));
                entity.setSoLuong(rs.getInt("Soluong"));
                entity.setGiaBan(rs.getDouble("Sotien"));
                entity.setGhiChu(rs.getString("Ghichu"));
                list.add(entity);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return list;
    }
    
    public List<DonHangCT> selectByMaS(String madh){
        String sql = "select ls.TenLS,s.TenS,s.Tacgia,a.MaS,a.Soluong,a.Sotien,a.Ghichu,d.*\n" +
"from DonHang d join DonHangChiTiet a on d.MaDH = a.MaDH\n" +
"join Sach s on a.MaS = s.MaS\n" +
"join LoaiSach ls on ls.MaLS=s.MaLS \n" +
"where a.MaDH = ?";
        return this.selectBySql(sql, madh);
    }
}
