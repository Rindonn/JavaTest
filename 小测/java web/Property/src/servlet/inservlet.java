package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.userservice;

/**
 * Servlet implementation class inservlet
 */
@WebServlet("/inservlet")
public class inservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       userservice u = new userservice();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public inservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = req.getParameter("name");
		String tel = req.getParameter("tel");
		String bno1=req.getParameter("bno");
		int bno = Integer.parseInt(bno1);
		String unit1 = req.getParameter("unit");
		int unit = Integer.parseInt(unit1);
		String roomno = req.getParameter("roomno");
		boolean flag = u.insert(name,tel,bno,unit,roomno);
		if(flag == false) {
			//执行出错
		}
		else {
			//执行完成
			req.getRequestDispatcher("index.jsp").forward(req, res);
		}
	}

}
