package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/return")
public class ReturnServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res)
	throws ServletException, IOException
	{
		HttpSession hs = req.getSession(false);
		if(hs==null)
		{
			req.setAttribute("msg", "Session Expired..<br>");
			req.getRequestDispatcher("Home.jsp").forward(req, res);
		}
		else
		{
			String code = req.getParameter("code");
			String rollNum = req.getParameter("rollno");
			StudentBean sb = new StudentBean();
			sb.setRollNo(rollNum);
			BookBean bb = (BookBean)hs.getAttribute("bookbean");
			if(code.equals(bb.getCode()))
			{
				new ReturnDAO().returnb(bb, sb);
				req.getRequestDispatcher("Return.jsp").forward(req, res);
			}
		}
	}
}
