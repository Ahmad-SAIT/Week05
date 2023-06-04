package servlets;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 *
 * @author aalmasri
 */
public class HomeServlet extends HttpServlet {
  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        
        String action = request.getParameter("action");
        if(action!=null && action.equals("reset")){
            session.invalidate();
            session = request.getSession(); // 
        }
        // ab
        String prevText = (String) session.getAttribute("newText");
        if(prevText == null)
            prevText = "";
        
        // c
        String txt = request.getParameter("txt");
        if(txt != null)
            session.setAttribute("newText", prevText + txt);
                                            // ab + c = abc
                                            
        getServletContext().getRequestDispatcher("/WEB-INF/first.jsp")
                .forward(request, response);
    } 

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    }


}
