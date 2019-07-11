//package com.stackroute.db;
//
//import javax.sql.RowSet;
//import javax.sql.rowset.JdbcRowSet;
//import javax.sql.rowset.RowSetProvider;
//import java.sql.*;
//
//public class RowSetDemo {
//    private Connection con;
//
//    //demo of connected rowset
//    public void rowSetDemo() {
//        try {
//            //Resister Driver with driver manager service
//            Class.forName("com.mysql.cj.jdbc.Driver");
//
//            //Creating and Executing RowSet
//            JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
//
//            rowSet.setUrl("jdbc:mysql://localhost:3306/customerdb");
//            rowSet.setUsername("root");
//            rowSet.setPassword("Root@123");
//
//            //create statement object
//            System.out.println("got connected!");
//
//            Statement stmt = con.createStatement();
//           // RowSet rs=stmt.executeQuery("select * from customer");
//            System.out.println("In Rowset");
//
//
//            while (rowSet.next()) {
//                // Generating cursor Moved event
////                System.out.println("Id: " + rs.getInt(1));
////                System.out.println("Name: " + rs.getString(2));
////                System.out.println("Age: " + rs.getString(3));
////                System.out.println("Gender: " + rs.getString(4));
//            }
//
//        } catch (Exception e) {
//            e.getMessage();
//        } finally {
//            try {
//                con.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//
//
//        //demo of disconnect rowset
//    }
//}
