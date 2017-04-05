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

	
     String n=req.getParameter("name");  
    String p=req.getParameter("pass");  
          
    if(p.equals("sekhar")){  
        RequestDispatcher rd=req.getRequestDispatcher("servlettwo");  
        rd.forward(req, res);  
    }  
    else{  
        out.print("Sorry UserName or Password Error!");  
        RequestDispatcher rd=req.getRequestDispatcher("/index.html");  
        rd.include(req, res);  
                      
        }  

        }catch(Exception e){System.out.println(e);}
  }
}
