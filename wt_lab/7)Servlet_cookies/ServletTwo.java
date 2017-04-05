import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class ServletTwo extends HttpServlet
{
public void doPost(HttpServletRequest req, HttpServletResponse res){
    try{
    res.setContentType("text/html");
    PrintWriter out = res.getWriter();

    Cookie ck[]=req.getCookies();
    out.print("Hello "+ck[0].getValue());
    out.close();

         }catch(Exception e){System.out.println(e);}
    }


}
