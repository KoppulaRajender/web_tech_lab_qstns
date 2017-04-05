import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class SecondFilter implements Filter
{static String testParam;
  public void  init(FilterConfig config) throws ServletException
  {
     testParam = config.getInitParameter("testpara2");
     System.out.println("Test Param2: " + testParam);
   }
   public void doFilter(ServletRequest req,ServletResponse res,FilterChain chain) throws IOException,ServletException
   {
     res.setContentType("text/html");
     PrintWriter out=res.getWriter();
     out.write("<center><h1>filter second first</h1></center>");
    // String testParam = config.getInitParameter("testpara2");
     out.write("<center><h1>"+testParam+"</h1></center>");
   }
   public void destroy()
   {

   }
}
