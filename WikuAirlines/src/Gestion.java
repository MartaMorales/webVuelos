import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Gestion")
public class Gestion extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String accion = request.getParameter("action");
        RequestDispatcher rd = null;
        switch (accion){
            case "Inicio":
                rd = request.getRequestDispatcher("/index.jsp");
                break;
            case "Destinos":
                rd = request.getRequestDispatcher("/destinos.jsp");
                break;
            case "Mis_Viajes":
                rd = request.getRequestDispatcher("/misViajes.jsp");
                break;
            case "Contacto":
                rd = request.getRequestDispatcher("/contacto.jsp");
                break;
        }
        rd.forward(request, response);
    }
}
