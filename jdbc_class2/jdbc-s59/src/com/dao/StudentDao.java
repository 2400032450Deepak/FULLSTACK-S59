package com.dao;

import java.sql.*;
import com.connection.DBConnection;
import com.entity.Student;

public class StudentDao {

    // INSERT
    public void insert(Student s) throws Exception {
        Connection con = DBConnection.getConnection();
        PreparedStatement ps = con.prepareStatement("INSERT INTO student VALUES(?,?,?)");
        ps.setInt(1, s.sid);
        ps.setString(2, s.sname);
        ps.setInt(3, s.smarks);
        ps.executeUpdate();
        con.close();
        System.out.println("Inserted Successfully");
    }

    // DISPLAY ALL
    public void display() throws Exception {
        Connection con = DBConnection.getConnection();
        PreparedStatement ps = con.prepareStatement("SELECT * FROM student");
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            System.out.println(
                rs.getInt(1) + "  " +
                rs.getString(2) + "  " +
                rs.getInt(3)
            );
        }

        con.close();
    }
}
