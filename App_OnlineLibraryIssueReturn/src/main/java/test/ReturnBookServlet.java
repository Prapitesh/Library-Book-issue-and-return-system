package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/returnbook")
public class ReturnBookServlet extends HttpServlet
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
			BookBean bb = new ReturnBookDAO().returnbook(req.getParameter("code"));
			if(bb==null)
			{
				req.setAttribute("msg", "No Book is Available..<br>");
				req.getRequestDispatcher("Home.jsp").forward(req, res);
			}//end of if
			else
			{
				hs.setAttribute("bookbean", bb);
				req.getRequestDispatcher("ReturnBook.jsp").forward(req, res);
			}//end of else
		}
	}
}

