/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import helpers.DatabaseHelper;
import model.Phuhuynh;
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
public class PhuHuynhDao {
    public boolean insert(Phuhuynh ph)throws Exception{
        String sql = "INSERT INTO [dbo].[PhuHuynh]([maHS] ,[tencha],[sdtcha],[nncha],[tenme],[sdtme],[nnme])"+ "values(?,?,?,?,?,?,?)";
    try(
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ){
        pstmt.setString(1, ph.getMaHS());
        pstmt.setString(2, ph.getTencha());
        pstmt.setString(3, ph.getSdtcha());
        pstmt.setString(4, ph.getNncha());
        pstmt.setString(5, ph.getTenme());
        pstmt.setString(6, ph.getSdtme());
        pstmt.setString(7, ph.getNnme());

        return pstmt.executeUpdate()>0;
        }
        
    }
    
    public boolean update(Phuhuynh ph)throws Exception{
        String sql = " UPDATE [dbo].[PhuHuynh]"+ "SET tencha=?, sdtcha =?,nncha= ?,tenme=?,sdtme=?,nnme=?"+ " where maHS = ?";
    try(
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ){
        pstmt.setString(7, ph.getMaHS());
        pstmt.setString(1, ph.getTencha());
        pstmt.setString(2, ph.getSdtcha());
        pstmt.setString(3, ph.getNncha());
        pstmt.setString(4, ph.getTenme());
        pstmt.setString(5, ph.getSdtme());
        pstmt.setString(6, ph.getNnme());
        
        return pstmt.executeUpdate()>0;
        }
    }
    
    public boolean delete(String maHS) throws Exception{
        String sql = "delete from PhuHuynh"+ " where maHS = ?";
    try(
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ){
        pstmt.setString(1, maHS);
        
        return pstmt.executeUpdate()>0;
        }
    }
    
    public Phuhuynh findmaHS(String maHS) throws Exception{
        String sql = "select * from PhuHuynh where maHS = ?";
    try(
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ){
        pstmt.setString(1, maHS);
        try(ResultSet rs = pstmt.executeQuery();) {
            if(rs.next()){
            Phuhuynh ph = createPhuhuynh(rs);
            
            return ph;
            }
        }
    }
        return null;
}

    private Phuhuynh createPhuhuynh(final ResultSet rs) throws SQLException {
        Phuhuynh ph = new Phuhuynh();
        ph.setMaHS(rs.getString("maHS"));
        ph.setTencha(rs.getString("tencha"));
        ph.setSdtcha(rs.getString("sdtcha"));
        ph.setNncha(rs.getString("nncha"));
        ph.setTenme(rs.getString("tenme"));
        ph.setSdtme(rs.getString("sdtme"));
        ph.setNnme(rs.getString("nnme"));
        
        return ph;
    }
    
    public List < Phuhuynh> findAll() throws Exception{
        String sql = "select * from Phuhuynh";
    try(
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ){
        try(ResultSet rs = pstmt.executeQuery()) {
            List<Phuhuynh> list = new ArrayList<>(); 
            while(rs.next()){
            Phuhuynh ph = createPhuhuynh(rs);
            
            list.add(ph);
            }return list;
        }
    }
        
}

}
