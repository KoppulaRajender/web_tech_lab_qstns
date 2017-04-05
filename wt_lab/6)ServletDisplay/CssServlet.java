import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class CssServlet extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		String name,user,pass,choice;
name=req.getParameter("name");	
user=req.getParameter("user");	
pass=req.getParameter("pass");	
choice=req.getParameter("option");	
		out.println("<html>");
		out.println("<head>");
		out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"serv.css\"/>");
		out.println("<body>");
		out.println("<h1>SEKHAR KAREDLA</h1>");
		out.println("<h2>");
		out.println("name:"+name);
		out.println("<br/>");
		out.println("choice:"+choice);
		out.println("<br/>");
		out.println("user:"+user);
		out.println("<br/>");
		out.println("pass:"+pass);
		out.println("</h2>");
		out.println("</body>");
		out.println("</html>");
		
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
	{
		doGet(req,res);
	}
}