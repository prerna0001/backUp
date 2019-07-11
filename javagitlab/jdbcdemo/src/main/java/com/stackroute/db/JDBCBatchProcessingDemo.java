package com.stackroute.db;

import java.sql.*;
import java.util.Arrays;

public class JDBCBatchProcessingDemo
{
    //private Connection con;
    private Statement stmt;
    public void jDBCBatchProcessing()
    {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/customerdb", "root", "Root@123");)
        {
            con.setAutoCommit(false);

            try (PreparedStatement pstmt = con.prepareStatement("Insert into customer (id,name,age,gender) values (?,?,?,?)");)
            {
                pstmt.setInt(1, 7);
                pstmt.setString(2, "pillai");
                pstmt.setInt(3, 56);
                pstmt.setString(4, "f");
                pstmt.addBatch();

                pstmt.setInt(1, 9);
                pstmt.setString(2, "mon");
                pstmt.setInt(3, 15);
                pstmt.setString(4, "m");
                pstmt.addBatch();

                int[] arr = pstmt.executeBatch();
                System.out.println(Arrays.toString(arr));

                con.commit();
            }
            catch (SQLException e)
            {
                e.printStackTrace();
                con.rollback();
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}