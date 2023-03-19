/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import helpers.DatabaseHelper;
import model.BangDiem;
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
public class BangDiemDao {
     public boolean insert(BangDiem bd)throws Exception{
        String sql = "INSERT INTO [dbo].[BangDiem]([maHS],[Toan],[Van],[Anh],[Ly],[Hoa],[Sinh],[Su],[Dia],[GDCD])"+ "values(?,?,?,?,?,?,?,?,?,?)";
    try(
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ){
        pstmt.setString(1, bd.getMaHS());
        pstmt.setFloat(2, bd.getToan());
        pstmt.setFloat(3, bd.getVan());
        pstmt.setFloat(4, bd.getAnh());
        pstmt.setFloat(5, bd.getLy());
        pstmt.setFloat(6, bd.getHoa());
        pstmt.setFloat(7, bd.getSinh());
        pstmt.setFloat(8, bd.getSu());
        pstmt.setFloat(9, bd.getDia());
        pstmt.setFloat(10, bd.getGDCD());
        
        return pstmt.executeUpdate()>0;
        }
    }
     public boolean update(BangDiem bd)throws Exception{
        String sql = " UPDATE [dbo].[BangDiem]"+ "SET Toan=?, Van =?,Anh= ?,Ly=?,Hoa=?,Sinh=?,Su=?,Dia=?,GDCD=?"+ " where maHS = ?";
    try(
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ){

        pstmt.setFloat(1, bd.getToan());
        pstmt.setFloat(2, bd.getVan());
        pstmt.setFloat(3, bd.getAnh());
        pstmt.setFloat(4, bd.getLy());
        pstmt.setFloat(5, bd.getHoa());
        pstmt.setFloat(6, bd.getSinh());
        pstmt.setFloat(7, bd.getSu());
        pstmt.setFloat(8, bd.getDia());
        pstmt.setFloat(9, bd.getGDCD());
        pstmt.setString(10, bd.getMaHS());
        return pstmt.executeUpdate()>0;
        }
    }
    
    public boolean deletebyMaHS(String maHS) throws Exception{
        String sql = "delete from BangDiem"+ " where maHS = ?";
    try(
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ){
        pstmt.setString(1, maHS);
        
        return pstmt.executeUpdate()>0;
        }
    }
    
    public BangDiem findbyMaHS(String maHS) throws Exception{
        String sql = "select * from BangDiem where [maHS] = ?";
    try(
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ){
        pstmt.setString(1, maHS);
        try(ResultSet rs = pstmt.executeQuery();) {
            if(rs.next()){
                BangDiem bd = new BangDiem();
                    createBangDiem(bd, rs);
            return bd;
            }
        }
    }
         return null;
    }

    private void createBangDiem(BangDiem bd, final ResultSet rs) throws SQLException {
        bd.setMa(rs.getInt("Ma"));
        bd.setMaHS(rs.getString("maHS"));
        bd.setToan(rs.getFloat("Toan"));
        bd.setVan(rs.getFloat("Van"));
        bd.setAnh(rs.getFloat("Anh"));
        bd.setLy(rs.getFloat("Ly"));
        bd.setHoa(rs.getFloat("Hoa"));
        bd.setSinh(rs.getFloat("Sinh"));
        bd.setSu(rs.getFloat("Su"));
        bd.setDia(rs.getFloat("Dia"));
        bd.setGDCD(rs.getFloat("GDCD"));
    }
    
    public List<BangDiem> findAll() throws Exception{
        String sql = "select * from BangDiem";
    try(
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ){
        
        try(ResultSet rs = pstmt.executeQuery();) {
            List<BangDiem> list = new ArrayList<>();
            while(rs.next()){
                BangDiem bd = new BangDiem();
                    createBangDiem(bd, rs);
                list.add(bd);
            }return list;
        }
    }
        
    }
}
