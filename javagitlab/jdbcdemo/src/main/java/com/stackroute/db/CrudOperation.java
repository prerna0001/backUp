package com.stackroute.db;

import java.sql.*;

public class CrudOperation {
private Connection con;
private Statement stmt;
    public void displayData() {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/customerdb","root","Root@123");
             Statement stmt = con.createStatement();
             ResultSet rs=stmt.executeQuery("select * from customer");)
        {
            //Resister Driver with driver manager service
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded");//create connection
            //here db1 is database name, root is username and root123 is password
//            con= DriverManager.getConnection(
//                    "jdbc:mysql://localhost:3306/customerdb","root","Root@123"); //customerdb database name
            //create statement object
            System.out.println("got connected");

           // Statement stmt=con.createStatement();


            //execute query
            //ResultSet rs=stmt.executeQuery("select * from customer");
            //process result
            //rs.afterLast();
            //rs.absolute(1);
           // rs.first();//cursor at first row
            while(rs.next())//returns bool if there is next row and cursor comes down---previous it will start from previous

                System.out.println(rs.getInt("id")+"  "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));

        }catch(Exception e){ System.out.println(e);}
//        finally {
//            try {
//                con.close();
//                stmt.close();
//            }
//            catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
    }

    public void displayCustomrerByName(String name,String gender) {

        try{
            //Resister Driver with driver manager service
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded");//create connection

            con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/customerdb","root","Root@123");
            //create statement object
            System.out.println("got connected");

            PreparedStatement stmt=con.prepareStatement("Select * from customer where name = ? and gender=?" );
            //stmt.setInt(1,3);

            stmt.setString(1,name);
            stmt.setString(2,gender);
            ResultSet rs = stmt.executeQuery();
            //execute query
          //  ResultSet rs=stmt.executeQuery("select * from customers");
            //process result
            while(rs.next())
                System.out.println("ID "+rs.getInt(1)+"  "+rs.getString(2)+" "+rs.getString(4));
            con.close();
        }catch(Exception e){ System.out.println(e);}
        finally {
            try {
                con.close();
                stmt.close();
            }
            catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void insertCustomer() {

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded");//create connection

            con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/customerdb","root","Root@123");

            System.out.println("got connected");

            PreparedStatement stmt=con.prepareStatement("Insert into customer(name,age,gender) values(?,?,?)");

            stmt.setString(2,"ponna");
            stmt.setInt(3,26);
            stmt.setString(4,"F");

            int rs = stmt.executeUpdate();
            displayData();


           // System.out.println("ID "+rs.getInt(1)+"  "+rs.getString(2)+" "+rs.getString(4));

        }catch(Exception e){ System.out.println(e);}
        finally {
            try {
                con.close();
               stmt.close();
            }
            catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void deleteCustomer(int id)
    {
        try{
            //Resister Driver with driver manager service
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded");//create connection

            con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/customerdb","root","Root@123");

            System.out.println("got connected");

            PreparedStatement stmt=con.prepareStatement("Delete from customer where id=?" );

            stmt.setInt(1,id);
            boolean rs = stmt.execute();
            displayData();

//            while(rs.next())
//                System.out.println("ID "+rs.getInt(1)+"  "+rs.getString(2)+" "+rs.getString(4));

        }
        catch(Exception e){ System.out.println(e);}

        finally {
            try {
                con.close();
                stmt.close();
            }
            catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
    public void updateCustomer()
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded");//create connection

            con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/customerdb","root","Root@123");

            System.out.println("got connected");

            PreparedStatement stmt=con.prepareStatement("Update customer set name=?,age=?,gender=? where id=? ");


            stmt.setInt(4,4);
            stmt.setString(1,"peddase p");
            stmt.setInt(2,267);
            stmt.setString(3,"FM");

            int rs = stmt.executeUpdate();
            displayData();
            System.out.println("your upadte operation done!!");


            // System.out.println("ID "+rs.getInt(1)+"  "+rs.getString(2)+" "+rs.getString(4));

        }catch(Exception e){ System.out.println(e);}
        finally {
            try {
                con.close();
                stmt.close();
            }
            catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}
