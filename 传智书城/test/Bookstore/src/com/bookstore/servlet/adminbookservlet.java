package com.bookstore.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookstore.po.Book;
import com.bookstore.po.Category;
import com.bookstore.service.adminbookservice;
import com.bookstore.service.admincategoryservice;
import com.bookstore.util.PageBean;

/**
 * Servlet implementation class adminbookservlet
 */
@WebServlet("/adminbookservlet")
public class adminbookservlet extends BaseServlet {
	private int getPc(HttpServletRequest req) {
		int pc=1;
		String param =req.getParameter("pc");
		if(param != null && !param.trim().isEmpty()) {
			pc = Integer.parseInt(param);
		}
		return pc;
	}
	public String getUrl(HttpServletRequest req) {
		String url = req.getRequestURI()+"?"+req.getQueryString();
		int index = url.lastIndexOf("&pc=");
		if(index != -1 ) {
			url= url.substring(0,index);
		}
		return url;
	}
	admincategoryservice c = new admincategoryservice();
	adminbookservice b = new adminbookservice();
	public String findbycombination(HttpServletRequest req,HttpServletResponse res) 
		throws ServletException,IOException{
			int pc=getPc(req);
			String url = getUrl(req);
			String pid = req.getParameter("pid");
			String cid = req.getParameter("cid");
			//String bname = req.getParameter("bname");
			//String bname = "";
			//if(req.getParameter("bname") != null) {
	    	String bname = req.getParameter("bname");
	    	//bname = new String(ddesc.getBytes("ISO-8859-1"),"UTF-8");
	    	//System.out.print("++++++++++"+bname);
			//}
			//String bname = new String(name.getBytes("ISO-8859-1"),"UTF-8");
			Book book = new Book();
			book.setPid(pid);
			book.setCid(cid);
			book.setBname(bname);
			List<Category> list = c.findall();
			req.setAttribute("parents", list);
			PageBean<Book> bp = b.findbycombination(book, pc);
			bp.setUrl(url);
			req.setAttribute("pb", bp);
			return "f:/adminjsps/admin/book/list.jsp";
	}
	public void ajaxfindchildren(HttpServletRequest req,HttpServletResponse res) 
			throws ServletException,IOException{
		String pid = req.getParameter("pid");
		List<Category> list = c.findbyparent(pid);
		String json = tojson(list);
		//System.out.print(json);
		res.getWriter().print(json);
	}
	private String tojson(Category ca) {
		StringBuilder sb = new StringBuilder("{");
		sb.append("\"cid\"").append(":").append("\""+ca.getCid()+"\"");
		sb.append(",");
		sb.append("\"cname\"").append(":").append("\""+ca.getCname()+"\"");
		sb.append("}");
		return sb.toString();
	}
	private String tojson(List<Category> list) {
		StringBuilder sb = new StringBuilder("[");
		for(int i=0;i<list.size();i++) {
			sb.append(tojson(list.get(i)));
			if(i<list.size()-1) {
				sb.append(",");
			}
		}
		sb.append("]");
		return sb.toString();
	}
}
