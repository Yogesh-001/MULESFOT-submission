package mulesoft;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;
public class records {
public static void main(String args[])
{
try
{
  Connection con = null;

  Driver d = new com.mysql.cj.jdbc.Driver();
  DriverManager.registerDriver(d);
  System.out.println("Driver Class Loaded");


  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Mulesoft","root","Babi2002");
  
  Statement stmt1 = con.createStatement();
  Statement stmt2 = con.createStatement();
  Statement stmt3 = con.createStatement();
  String sql1 = "insert into Mulesoft_table values('IRONMAN 3','RobertDowney Jr','1.2billion','Jonathan Kolia',2013)";
  String sql2 = "insert into Mulesoft_table values('Black Panther','Chadwick Boseman','1.3billion','Ryan Coogler',2018)";
  String sql3 = "insert into Mulesoft_table values('Captain America Civil War','Chris Evans','1.1billion','Russo Brothers',2016)";
    stmt1.executeUpdate(sql1);
    stmt2.executeUpdate(sql2);
    stmt3.executeUpdate(sql3);
    System.out.println("Records inserted successfully!");
  con.close();



  con.close();



}
catch(Exception e)
{
System.out.println(e);
}
}
}