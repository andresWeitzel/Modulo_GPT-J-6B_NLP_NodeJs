package mypackages.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ValidacionFormularioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public ValidacionFormularioServlet() {
        super();
    }

	


	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String genero = request.getParameter("genero");
		String mayorEdad = request.getParameter("mayorEdad");
		
		//Traemos la seccion del usuario y mostramos todo lo traido
		//por el servlet en todos los jsp
		
		request.getSession().setAttribute("nombre",nombre);
		request.getSession().setAttribute("apellido",apellido);
		request.getSession().setAttribute("genero",genero);
		request.getSession().setAttribute("mayorEdad",mayorEdad);
		
		//Mandamos todos los atributos al jsp, la vista
		response.sendRedirect("mostrarValidacionFormulario.jsp");
	}

}
