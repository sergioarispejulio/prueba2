package fizzbuzz;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FizzBuzzServl extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String hasta = request.getParameter("hasta");
		FizzBuzz objeto = new FizzBuzz();
		int cant = Integer.parseInt(hasta);
		hasta="";
		for(int i = 0; i <= cant; i++)
		{
			if(i == 1)
			{
				hasta = objeto.resultado(i)+"\n";
			}
			else
			{
				hasta = hasta+objeto.resultado(i)+"\n";
			}
		}
		response.getWriter().println("Resultado: " + hasta);
	}
	
	

}
