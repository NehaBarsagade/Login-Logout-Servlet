package Day5;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/loginserv")
public class LoginServ extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		Cookie c[]=request.getCookies();
		if(c==null){
		request.getRequestDispatcher("NavFile.html").include(request, response);
		
		out.print("<form action='logincontoller'>");
		out.print("<input type='text' name='uname'><br/><br/>");
        out.println("<input type='text' name='upass'><br/><br/>");
        out.println("<input type='submit' name='login'>");
        out.println("");
        out.println("<input type='reset'>");
		}
		else{
			response.sendRedirect("profile");
		}
// M V C
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
