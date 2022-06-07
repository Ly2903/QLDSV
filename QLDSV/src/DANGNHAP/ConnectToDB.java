/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DANGNHAP;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author linhm
 */
public class ConnectToDB {
    
    public static Connection getConnection(String userName,String password ) {
        Connection ketNoi = null;
        try {
            
            String uRL = "jdbc:sqlserver://localhost;databaseName=QLDSV";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            ketNoi = DriverManager.getConnection(uRL, userName, password);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Khong ket noi duoc voi CSDL");
            
        }
        return ketNoi;
    }
}
