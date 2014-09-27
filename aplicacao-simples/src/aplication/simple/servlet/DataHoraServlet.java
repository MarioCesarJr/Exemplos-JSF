package aplication.simple.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DataHoraServlet")
public class DataHoraServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      
		 PrintWriter out = response.getWriter();
		 out.print("<html>");
		 out.print("<body>");
		 out.print("Data : "+new SimpleDateFormat("dd/MM/yyyy").format(new Date()));
		 out.print("<br/>");
		 out.print("Hora : "+new SimpleDateFormat("hh:mm:ss").format(new Date()));
		 out.print("</body>");
		 out.print("</html>");

	}

}
