package Web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ControlerServelt extends HttpServlet{
@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException {
	String name =request.getParameter("name");
	request.setAttribute("model", name);
	request.getRequestDispatcher("vue.jsp").forward(request,response);
	
  }

}
