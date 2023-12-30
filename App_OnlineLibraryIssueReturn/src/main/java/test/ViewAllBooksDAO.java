package test;
import java.sql.*;
import java.util.*;
public class ViewAllBooksDAO 
{
	public ArrayList<BookBean> al = new ArrayList<BookBean>();
	public ArrayList<BookBean> view()
	{
		try
		{
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("select * from libbookdetails");
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				BookBean bb = new BookBean();
				bb.setCode(rs.getString(1));
				bb.setName(rs.getString(2));
				bb.setAuthor(rs.getString(3));
				bb.setQty(rs.getInt(4));
				al.add(bb);
			}
		}//end of try
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return al;
	}

}
