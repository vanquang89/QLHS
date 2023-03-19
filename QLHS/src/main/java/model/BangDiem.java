/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author PC
 */
public class BangDiem {
    private String MaHS;
    private float Toan,Van,Anh,Ly,Hoa,Sinh,Su,Dia,GDCD;
    private int ma;

    public BangDiem() {
    }

    public BangDiem(String MaHS, float Toan, float Van, float Anh, float Ly, float Hoa, float Sinh, float Su, float GDCD, int ma) {
        this.MaHS = MaHS;
        this.Toan = Toan;
        this.Van = Van;
        this.Anh = Anh;
        this.Ly = Ly;
        this.Hoa = Hoa;
        this.Sinh = Sinh;
        this.Su = Su;
        this.GDCD = GDCD;
        this.ma = ma;
    }

    public String getMaHS() {
        return MaHS;
    }

    public void setMaHS(String maHS) {
        this.MaHS = maHS;
    }

    public float getToan() {
        return Toan;
    }

    public void setToan(float Toan) {
        this.Toan = Toan;
    }

    public float getVan() {
        return Van;
    }

    public void setVan(float Van) {
        this.Van = Van;
    }

    public float getAnh() {
        return Anh;
    }

    public void setAnh(float Anh) {
        this.Anh = Anh;
    }

    public float getLy() {
        return Ly;
    }

    public void setLy(float Ly) {
        this.Ly = Ly;
    }

    public float getHoa() {
        return Hoa;
    }

    public void setHoa(float Hoa) {
        this.Hoa = Hoa;
    }

    public float getSinh() {
        return Sinh;
    }

    public void setSinh(float Sinh) {
        this.Sinh = Sinh;
    }

    public float getSu() {
        return Su;
    }

    public void setSu(float Su) {
        this.Su = Su;
    }

    public float getDia() {
        return Dia;
    }

    public void setDia(float Dia) {
        this.Dia = Dia;
    }

    public float getGDCD() {
        return GDCD;
    }

    public void setGDCD(float GDCD) {
        this.GDCD = GDCD;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    
}
