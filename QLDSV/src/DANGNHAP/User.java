/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DANGNHAP;

/**
 *
 * @author linhm
 */
public class User {
    private String userName;
    private String hoTen;
    private String nhomQuyen;

    public User() {
    }

    public User(String userName, String hoTen, String nhomQuyen) {
        this.userName = userName;
        this.hoTen = hoTen;
        this.nhomQuyen = nhomQuyen;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNhomQuyen() {
        return nhomQuyen;
    }

    public void setNhomQuyen(String nhomQuyen) {
        this.nhomQuyen = nhomQuyen;
    }
    
    
}
