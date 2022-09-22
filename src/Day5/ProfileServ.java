package Day5;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/profile")
public class ProfileServ extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		
		Cookie c[]=request.getCookies();
		if(c!=null){
			request.getRequestDispatcher("NavFile.html").include(request, response);

		out.print("Welcome to Profile"+c[0].getValue());
		}
		else{
			request.getRequestDispatcher("loginserv").include(request, response);
			out.print("<p style='color:red'> Please Login frist before Visiting Profile page!</p>");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
