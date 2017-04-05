import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class ServletOne extends HttpServlet
 {

  public void doPost(HttpServletRequest req, HttpServletResponse res)
  {
    try{

    res.setContentType("text/html");
    PrintWriter out = res.getWriter();

    String name=req.getParameter("name");
    out.print("Hi "+name);

    Cookie ck=new Cookie("uname",name);//creating cookie object
    res.addCookie(ck);//adding cookie in the response

    //creating submit button
    out.print("<form action='servlettwo' method='post'>");
    out.print("<input type='submit' value='go'>");
    out.print("</form>");

    out.close();

        }catch(Exception e){System.out.println(e);}
  }
}
