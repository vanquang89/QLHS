/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author PC
 */
public class NguoiDung {
    private String tenDangNhap,matkhau,vaitro;
    
    public NguoiDung(String tenDangNhap, String matkhau, String vaitro) {
        this.tenDangNhap = tenDangNhap;
        this.matkhau = matkhau;
        this.vaitro = vaitro;
    }

    public NguoiDung(){
        
    }


    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public String getVaitro() {
        return vaitro;
    }

    public void setVaitro(String vaitro) {
        this.vaitro = vaitro;
    }
    
    
  



    
}
