<%@page import="java.sql.*"%>
<%@page import="oracle.jdbc.driver.*" %>
<%@page import="oracle.sql.*" %>
<%@page import="javax.servlet.http.*" %>
<%@page import="javax.servlet.*" %>
<%@page import="java.io.*" %>
<%@page import="java.util.*" %>
<%@page import="javax.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
	<head>Sample JDBC select using JSP</head>
	<body>
		<h2>Sample JDBC select using JSP</h2>
		<table>
			<tr>
				<td>emp id</td>
				<td>name</td>
				<td>some stuf</td>
			</tr>
		<%try{
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection connection=null;
					connection =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","cse096","cse096");
					Statement statement = connection.createStatement();
					String sql="Select * from EMP";
					ResultSet rs = statement.executeQuery(sql);
					while(rs.next())
					{
						out.println("<tr>");
						out.println("<td>"+rs.getString(1)+"</td>");
						out.println("<td>"+rs.getString(2)+"</td>");
						out.println("<td>"+rs.getString(3)+"</td>");
						out.println("</tr>");
					}
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
		%>
		</table>
	</body>
</html>