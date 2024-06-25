import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDeo {
	private String dbUrl = "jdbc:mysql://localhost:3306/reg";
    private String dbUname = "root";
    private String dbPassword = "karthik";
    private String dbDriver = "com.mysql.cj.jdbc.Driver";

    public void loadDriver(String dbDriver) {
        try {
           
            Class.forName(dbDriver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        Connection con = null;
        try {
            
            con = DriverManager.getConnection(dbUrl, dbUname, dbPassword);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    public String insert(Members members) {
       loadDriver(dbDriver);
        Connection con = getConnection();
        String result = "Data Entered Successfully";
        String sql = "INSERT INTO reg.members(name, dateofbirth, email, phoneNumber, gender, nationality, fatherName, fatherPhoneNumber,  fatherOccupation, motherName, motherPhoneNumber, motherOccupation, country, state, district, area, doorNo, pinCode, schoolName, majorSubject, marks, option1, option2, option3)  values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
         
        try {
        	
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, members.getName());
			ps.setString(2, members.getDate());
			ps.setString(3, members.getEmail());
			ps.setString(4, members.getPnumber());
			ps.setString(5, members.getGender());
			ps.setString(6, members.getNationality());
			ps.setString(7, members.getFname());
			ps.setString(8, members.getFnumber());
			ps.setString(9, members.getFoccu());
			ps.setString(10, members.getMname());
			ps.setString(11, members.getMnumber());
			ps.setString(12, members.getMoccu());
			ps.setString(13, members.getCountry());
			ps.setString(14, members.getState());
			ps.setString(15, members.getDistrict());
			ps.setString(16, members.getAre());
			ps.setString(17, members.getDoor());
			ps.setString(18, members.getPin());
			ps.setString(19, members.getSchool());
			ps.setString(20, members.getMajor());
			ps.setString(21, members.getMark());
			ps.setString(22, members.getOption1());
			ps.setString(23, members.getOption2());
			ps.setString(24, members.getOption3());
			ps.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
			result="Data Not Entered";
		}  finally {
            try {
            	 if (con != null) {
                     con.close();
                 }
            } catch (SQLException e) {
                e.printStackTrace();
            }
		}
        
		return result; 
        
      
       
       
    
    }
}

