package login;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Login")
public class Login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("usuario");
        String password = request.getParameter("password");


        String nomb = "Marta";
        String contras = "Fayrah";

        if (name.equalsIgnoreCase(nomb) && password.equals(contras)) {
            String nombre = "Marta";
            String contrasena = "Fayrah";

            if (name.equalsIgnoreCase(nombre) && password.equals(contrasena)) {
                response.sendRedirect("index.jsp");
            }
        }

    }
}
