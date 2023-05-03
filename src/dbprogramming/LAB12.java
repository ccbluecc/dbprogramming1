/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dbprogramming;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
/**
 *
 * @author nitro5
 */
public class LAB12 {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/mydb1";
        String username = "root";
        String password = "9199762338aA";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(URL, username, password);
            String sql = "INSERT INTO student(studentID,firstName,lastName,email,deptID)"
                    + "VALUES(?,?,?,?,?)";
            PreparedStatement preparedstament = connection.prepareStatement(sql);
            preparedstament.setString(1, "111111");
            preparedstament.setString(2, "aaaa");
            preparedstament.setString(3, "bbbb");
            preparedstament.setString(4, "aaaa@kmutt.ac.th");
            preparedstament.setString(5, "IT");
            preparedstament.executeUpdate();
    }   catch (ClassNotFoundException ex) {
            Logger.getLogger(LAB12.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LAB12.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
