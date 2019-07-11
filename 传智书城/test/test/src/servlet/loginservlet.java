package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import object.user;
import service.loginservice;

/**
 * Servlet implementation class loginservlet
 */
@WebServlet("/loginservlet")
public class loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String usr = request.getParameter("username");
		String pwd = request.getParameter("password");
		user u = new user(usr,pwd);
		loginservice l = new loginservice();
		user u1 = l.login(u);
		if(u1 == null) {
			request.setAttribute("msg","登录失败,请检查用户名或密码");
			//response.sendRedirect("login.jsp");
		}else {
			request.setAttribute("msg","登录成功");
			response.sendRedirect("admin/index.jsp");

		}
	}

}
