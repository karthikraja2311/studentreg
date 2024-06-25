import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Membersdetails
 */
@WebServlet("/Membersdetails")
public class Membersdetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
          
            response.setContentType("text/html");
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/reg", "root", "karthik");
            PreparedStatement ps = con.prepareStatement("SELECT * FROM reg.members");
            ResultSet rs = ps.executeQuery();

            PrintWriter out = response.getWriter();
            out.println("<html><body><table border='1'>");
            out.println("<tr><th>Name</th><th>Date of Birth</th><th>Email</th><th>Phone Number</th><th>Gender</th><th>Nationality</th><th>Father's Name</th><th>Father's Phone Number</th><th>Father's Occupation</th><th>Mother's Name</th><th>Mother's Phone Number</th><th>Mother's Occupation</th><th>Country</th><th>State</th><th>District</th><th>Area</th><th>Door No</th><th>Pin Code</th><th>School Name</th><th>Major Subject</th><th>Marks</th><th>Option 1</th><th>Option 2</th><th>Option 3</th></tr>");

            while (rs.next()) {
                out.println("<tr>");
                out.println("<td>" + rs.getString("name") + "</td>");
                out.println("<td>" + rs.getString("dateofbirth") + "</td>");
                out.println("<td>" + rs.getString("email") + "</td>");
                out.println("<td>" + rs.getString("phoneNumber") + "</td>");
                out.println("<td>" + rs.getString("gender") + "</td>");
                out.println("<td>" + rs.getString("nationality") + "</td>");
                out.println("<td>" + rs.getString("fatherName") + "</td>");
                out.println("<td>" + rs.getString("fatherPhoneNumber") + "</td>");
                out.println("<td>" + rs.getString("fatherOccupation") + "</td>");
                out.println("<td>" + rs.getString("motherName") + "</td>");
                out.println("<td>" + rs.getString("motherPhoneNumber") + "</td>");
                out.println("<td>" + rs.getString("motherOccupation") + "</td>");
                out.println("<td>" + rs.getString("country") + "</td>");
                out.println("<td>" + rs.getString("state") + "</td>");
                out.println("<td>" + rs.getString("district") + "</td>");
                out.println("<td>" + rs.getString("area") + "</td>");
                out.println("<td>" + rs.getString("doorNo") + "</td>");
                out.println("<td>" + rs.getString("pinCode") + "</td>");
                out.println("<td>" + rs.getString("schoolName") + "</td>");
                out.println("<td>" + rs.getString("majorSubject") + "</td>");
                out.println("<td>" + rs.getString("marks") + "</td>");
                out.println("<td>" + rs.getString("option1") + "</td>");
                out.println("<td>" + rs.getString("option2") + "</td>");
                out.println("<td>" + rs.getString("option3") + "</td>");
                out.println("</tr>");
            }

            out.println("</table></body></html>");

            // Close resources
            rs.close();
            ps.close();
            con.close();

        } catch (ClassNotFoundException | SQLException e) {
        	throw new ServletException("Error processing SQL or JDBC operation", e);
        }
    }

}


