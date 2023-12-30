package test;
import java.sql.*;
public class ReturnBookDAO 
{
	public BookBean bb ;
	public BookBean returnbook(String code)
	{
		try
		{
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("select * from libbookdetails where code=?");
			ps.setString(1, code);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				bb = new BookBean();
				bb.setCode(rs.getString(1));
				bb.setName(rs.getString(2));
				bb.setAuthor(rs.getString(3));
				bb.setQty(rs.getInt(4));
			}
		}//end of try
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return bb;
	}
}

