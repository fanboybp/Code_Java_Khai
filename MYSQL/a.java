/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc;

import com.mysql.cj.conf.PropertyKey;
import static com.mysql.cj.conf.PropertyKey.PASSWORD;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
 

public class sqlsever {
    private static String id = "jdbc:mysql://localhost:3306/dulieuhocsinh";
    private static String USER_NAME = "root";
    private static String gioitinh="";
    private static String ADDRES = "";
    private static String dantoc="";
    private static String ngaysinh="";
    public static void main(String args[]) { 
        try {
            Connection conn = getConnection(id, USER_NAME,gioitinh,ADDRES,dantoc,ngaysinh);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from sinhvien");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) 
                        + "  " + rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getString(5)+"  "+rs.getString(6));
            }
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static Connection getConnection(String DB_URL, String USER_NAME,String gioitinh, String ADDRES,String dantoc,String ngaysinh) {
         Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL,USER_NAME,ADDRES);
            System.out.println("connect successfully!");
        } catch (Exception ex) {
            System.out.println("connect failure!");
            ex.printStackTrace();
        }
        return conn;
    }

    private static Connection getConnection(String DB_URL, String USER_NAME, PropertyKey propertyKey) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}