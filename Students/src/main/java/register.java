

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class register
 */
@WebServlet("/register")
public class register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public register() {
        super();
        // TODO Auto-generated constructor stub
    }


	
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String date= request.getParameter("date");
        String email = request.getParameter("email");
        String pnumber = request.getParameter("pnumber");
        String gender = request.getParameter("gender");
        String nationality = request.getParameter("nationality");
        String fname = request.getParameter("fname");
        String fnumber = request.getParameter("fnumber");
        String foccu = request.getParameter("foccu");
        String mname = request.getParameter("mname");
        String mnumber = request.getParameter("mnumber");
        String moccu = request.getParameter("moccu");
        String country = request.getParameter("country");
        String state = request.getParameter("state");
        String district = request.getParameter("district");
        String are = request.getParameter("are"); 
        String door= request.getParameter("door");
        String pin = request.getParameter("pin");
        String school= request.getParameter("school");
        String major = request.getParameter("major");
        String mark= request.getParameter("mark");
        String option1 = request.getParameter("option1");
        String option2 = request.getParameter("option2");
        String option3 = request.getParameter("option3");

      
        Members members = new Members(name, date, email,pnumber,gender,
    			nationality,fname,fnumber,foccu,
    			mname,mnumber,moccu,country, state,
    			district,are,door,pin,school,
    		    major,mark,option1,option2,option3);

      
        RegisterDeo rdao = new RegisterDeo();
        String result = rdao.insert(members); 
        response.getWriter().print(result);
    }

}
