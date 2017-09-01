package servletContext;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ShareHome
 */
@WebServlet("/ShareHome")
public class ShareHome extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServletContext context = null;

	
	public void init(ServletConfig config) throws ServletException {
		//Configure context
		context = config.getServletContext();
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Get the attribute and convert it to string
		String inter =(String) context.getAttribute("KeyWord");
		//Print inter;
		PrintWriter out = response.getWriter();
		out.print(inter);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
