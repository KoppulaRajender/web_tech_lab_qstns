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
	<head>Sample JDBC insert using JSP</head>
	<body>
		<h2>Sample JDBC insert using JSP</h2>
		<%try{
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection connection=null;
					connection =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","cse096","cse096");
					Statement statement = connection.createStatement();
					String sql="insert into persons values(00002,'Jiten')";
					ResultSet rs = statement.executeQuery(sql);
					out.println("successfully updated a record !!");
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
		%>
	</body>
</html>