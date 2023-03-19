/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import helpers.DatabaseHelper;
import model.NguoiDung;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author PC
 */
public class NguoiDungDao {
    public NguoiDung checkLogin(String tenDangNhap, String matkhau)throws Exception{
        String sql = "select tenDangNhap, matkhau, Vaitro from NguoiDung "
               + " where tendangnhap =? and matkhau=?";
        try(
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            pstmt.setString(1, tenDangNhap);
            pstmt.setString(2, matkhau);
            try(ResultSet rs = pstmt.executeQuery();){
                if(rs.next()){
                    NguoiDung nd = new NguoiDung();
                    nd.setTenDangNhap(tenDangNhap);
                    nd.setVaitro(rs.getString("Vaitro"));
                    
                    return nd;
                }
            }
        }return null;
    }
}
