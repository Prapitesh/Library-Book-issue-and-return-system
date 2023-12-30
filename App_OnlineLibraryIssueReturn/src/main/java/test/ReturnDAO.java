package test;
import java.sql.*;
public class ReturnDAO 
{
	public int k;
	public int returnb(BookBean bb, StudentBean sb)
	{
		try
		{
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("update libbookdetails set qty=qty+? where code=?");
			ps.setInt(1, 1);
			ps.setString(2, bb.getCode());
			ps.executeUpdate();
			PreparedStatement ps1 = con.prepareStatement("update libstudent set lbook=? where rollno=?");
			ps1.setString(1, sb.getlBook());
			ps1.setString(2, sb.getRollNo());
			ps1.executeUpdate();
		}//end of try
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return k;
	}
}
