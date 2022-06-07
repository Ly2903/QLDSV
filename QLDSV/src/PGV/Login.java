/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PGV;

/**
 *
 * @author linhm
 */
public class Login {
    private String tenLogin;
    private String hoTen;

    public Login() {
    }

    public Login(String tenLogin, String hoTen) {
        this.tenLogin = tenLogin;
        this.hoTen = hoTen;
    }

    public String getTenLogin() {
        return tenLogin;
    }

    public void setTenLogin(String tenLogin) {
        this.tenLogin = tenLogin;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    
}
