package test;
import java.sql.*;
public class AdminLoginDAO 
{
	public AdminLoginBean alb;
	public AdminLoginBean login(String uName, String pWord)
	{
		try
		{
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement
					("select * from libadmin where uname=? and pword=?");
			ps.setString(1, uName);
			ps.setString(2, pWord);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				alb = new AdminLoginBean();
				alb.setuName(rs.getString(1));
				alb.setpWord(rs.getString(2));
			}
		}//end  of try
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return alb;
	}
}
