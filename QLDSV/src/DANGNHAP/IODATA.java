/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DANGNHAP;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author linhm
 */
public class IODATA {
    static String USER_NAME = "";
    static String PASS_WORD = "";
   static ArrayList<User> list = new ArrayList<>();
    public static int xacThucKetNoi(String taiKhoan, String matKhau){
        USER_NAME = taiKhoan;
        PASS_WORD = matKhau;
        list.clear();
        try {
            Connection conn = ConnectToDB.getConnection( USER_NAME, PASS_WORD );
             try {
            CallableStatement ps = conn.prepareCall("{call SP_DANGNHAP (?)}");
            ps.setString(1, taiKhoan); 
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
              
              User user = new User(rs.getString(1), rs.getString(2), rs.getString(3));
              list.add(user);
              if(user.getNhomQuyen().equals("PGV")){
                  return 1;
              }
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Loi xac thuc tai khoan " + ex);
            return 2;
        }
        }catch (Exception e){
             
        }
       
       
      return 0;
    }
}
