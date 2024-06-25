import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Viewdetails")
public class Viewdetails extends HttpServlet {
    private static final long serialVersionUID = 1L;
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Replace with your actual authentication logic
        if ("karthik".equals(username) && "1234".equals(password)) {
            // Login successful
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            response.sendRedirect("Viewdetails.jsp"); // Redirect to a welcome page
        } else {
            // Login failed
            PrintWriter out = response.getWriter();
            out.println("<html><body><p>Login failed. Invalid username or password.</p></body></html>");
        }
    }
   
}


