package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.userservice;

/**
 * Servlet implementation class selservlet
 */
@WebServlet("/selservlet")
public class selservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	userservice u = new userservice();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public selservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name1 = request.getParameter("value");
		//System.out.print(name);
    	String name = new String(name1.getBytes("ISO-8859-1"),"UTF-8");
    	//System.out.print(name1);
    	List list = u.finduser(name1);
    	request.setAttribute("list", list);
    	request.getRequestDispatcher("index.jsp").forward(request, response);  
	}

}
