package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/addbook")
public class AddBookServlet extends HttpServlet 
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
			BookBean bb = new BookBean();
			bb.setCode(req.getParameter("code"));
			bb.setName(req.getParameter("name"));
			bb.setAuthor(req.getParameter("author"));
			bb.setQty(Integer.parseInt(req.getParameter("qty")));
			int k = new AddBookDAO().addBook(bb);
			if(k>0)
			{
				req.setAttribute("bookbean", bb);
				req.setAttribute("msg", "Book Added Successfully..<br>");
				req.getRequestDispatcher("AddBook.jsp").forward(req, res);
			}
		}//end of if-else
	}
}
