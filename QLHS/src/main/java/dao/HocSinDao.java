/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import helpers.DatabaseHelper;
import model.HocSinh;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class HocSinDao {
    public boolean insert(HocSinh hs)throws Exception{
        String sql = "INSERT INTO [dbo].[HocSinh]([maHS],[tenHS],[Lop],[Email],[ngaysinh],[gioitinh],[Diachi])"+ "values(?,?,?,?,?,?,?)";
    try(
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ){
        pstmt.setString(1, hs.getMaHS());
        pstmt.setString(2, hs.getTenHS());
        pstmt.setString(3, hs.getLop());
        pstmt.setString(4, hs.getEmail());
        pstmt.setString(5, hs.getNgaysinh());
        pstmt.setInt(6, hs.getGioitinh());
        pstmt.setString(7, hs.getDiachi());
        
        return pstmt.executeUpdate()>0;
        }
    }
    
    public boolean update(HocSinh hs)throws Exception{
        String sql = " UPDATE [dbo].[HocSinh]"+ "SET tenHS=?, Lop =?,Email= ?,ngaysinh=?,gioitinh=?,Diachi=?"+ " where maHS = ?";
    try(
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ){
        pstmt.setString(7, hs.getMaHS());
        pstmt.setString(1, hs.getTenHS());
        pstmt.setString(2, hs.getLop());
        pstmt.setString(3, hs.getEmail());
        pstmt.setString(4, hs.getNgaysinh());
        pstmt.setInt(5, hs.getGioitinh());
        pstmt.setString(6, hs.getDiachi());
        
        return pstmt.executeUpdate()>0;
        }
    }
    
    public boolean delete(String maHS) throws Exception{
        String sql = "delete from HocSinh"+ " where maHS = ?";
    try(
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ){
        pstmt.setString(1, maHS);
        
        return pstmt.executeUpdate()>0;
        }
    }
    
    public HocSinh findmaHS(String maHS) throws Exception{
        String sql = "select * from HocSinh where maHS = ?";
    try(
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ){
        pstmt.setString(1, maHS);
        try(ResultSet rs = pstmt.executeQuery();) {
            if(rs.next()){
            HocSinh hs = createHocSinh(rs);
            
            return hs;
            }
        }
    }
        return null;
}

    private HocSinh createHocSinh(final ResultSet rs) throws SQLException {
        HocSinh hs = new HocSinh();
        hs.setMaHS(rs.getString("maHS"));
        hs.setTenHS(rs.getString("tenHS"));
        hs.setLop(rs.getString("Lop"));
        hs.setEmail(rs.getString("Email"));
        hs.setNgaysinh(rs.getString("ngaysinh"));
        hs.setGioitinh(rs.getInt("gioitinh"));
        hs.setDiachi(rs.getString("Diachi"));
        return hs;
    }
    
    public List < HocSinh> findAll() throws Exception{
        String sql = "select * from HocSinh";
    try(
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ){
        try(ResultSet rs = pstmt.executeQuery()) {
            List<HocSinh> list = new ArrayList<>(); 
            while(rs.next()){
            HocSinh hs = createHocSinh(rs);
            
            list.add(hs);
            }return list;
        }
    }
        
}

    public HocSinh findAll(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
