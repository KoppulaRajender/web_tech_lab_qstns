import java.sql.*;  
class Insert{  
public static void main(String args[]){  
try{  
//step1 load the driver class  
Class.forName("oracle.jdbc.driver.OracleDriver");  
  
//step2 create  the connection object  
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","cse096","cse096");  
  
//step3 create the statement object  
Statement stmt=con.createStatement();  
  
//step4 execute query  
int r=stmt.executeUpdate("insert into persons values(00001,'kALYAN')");  
  
//step5 close the connection object  
con.close();  
  
}catch(Exception e){ System.out.println(e);}  
  
}  
}  