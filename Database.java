package mulesoft;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;

public class Database {

public static void main(String args[])
{
try
{
  Connection con = null;

  Driver d = new com.mysql.cj.jdbc.Driver();
  DriverManager.registerDriver(d);
  System.out.println("Driver Class Loading");


  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","Babi2002");
  
  Statement stmt = con.createStatement();
  String sql = "CREATE DATABASE Mulesoft";
    stmt.executeUpdate(sql);
    System.out.println("successfully Database created");
  con.close();



  con.close();



}
catch(Exception e)
{
System.out.println(e);
}
}
}