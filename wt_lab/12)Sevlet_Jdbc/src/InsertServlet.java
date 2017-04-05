import java.sql.*;
import javax.sql.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;


public class InsertServlet extends HttpServlet
{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		try
		{
			res.setContentType("text/html");
			PrintWriter out=res.getWriter();
		try	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
        String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
        String username = "cse096";
        String password = "cse096"; 
    	Connection connection = null;  
		connection = DriverManager.getConnection(jdbcUrl, username, password);
		Statement statement = connection.createStatement();
		String rollno=req.getParameter("Id");
		String name=req.getParameter("Name");
		String sql = "insert into persons values ("+rollno+",'"+name+"')";
		statement.executeUpdate(sql);
		out.println("successfully inserted");
		}
		catch (ClassNotFoundException cnfe) 
		{
			out.println("class not found ");
		}
		}
		catch (SQLException e) 
		{
			throw new RuntimeException("Cannot connect the database!", e);
		} 
	}
}

