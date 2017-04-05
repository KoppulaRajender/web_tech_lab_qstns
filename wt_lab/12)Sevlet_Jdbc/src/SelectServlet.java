import java.sql.*;
import javax.sql.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

public class SelectServlet extends HttpServlet
{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException 
	{
	try {
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String jdbcUrl = "jdbc:oracle:thin:@localhost:xe";
	        String username = "cse096";
	        String password = "cse096"; 
	    	Connection connection = null; 
			ResultSet rs = null; 
            connection = DriverManager.getConnection(jdbcUrl, username, password);
			Statement statement = connection.createStatement();
			String sql = "select * from persons";
	        rs = statement.executeQuery(sql);
			while(rs.next())
			{
				out.println("<br>"+rs.getInt(1) +" " +rs.getString(2));
			}
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

