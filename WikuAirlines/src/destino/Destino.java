package destino;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/Destino")
public class Destino extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String origen = request.getParameter("origen");

        String destino = request.getParameter("destino");


        PrintWriter out = response.getWriter();
        out.println("<h3>Aquí tienes los siguientes vuelos a"+destino+"</h3>");
        out.println("<div class='row target'>");
        out.println("<div class='col l1'></div>");
        out.println("<div class='col l10 border'>");
        out.println("<div class='row'>");
        out.println("<div class='col l10'>");
        out.println("<div class='row'>");
        out.println("<div class='col l1'></div>");
        out.println("<div class='col l1'>");
        out.println("<i class='material-icons icons prefix'>flight_takeoff</i>");
        out.println("</div>");
        out.println("<div class='col l3'>");
        out.println("<p>21:20-22:35</p>");
        out.println("</div>");
        out.println("<div class='col l3'>");
        out.println("<p>directo</p>");
        out.println("</div>");
        out.println("<div class='col l3'>");
        out.println("<p>1h 15m</p>");
        out.println("</div>");
        out.println("<div class='col l1'></div>");
        out.println("</div>");
        out.println("<div class='row'>");
        out.println("<div class='col l1'></div>");
        out.println("<div class='col l1'>");
        out.println("<i class='material-icons icons prefix'>flight_land</i>");
        out.println("</div>");
        out.println("<div class='col l3'>");
        out.println("<p>21:20-22:35</p>");
        out.println("</div>");
        out.println("<div class='col l3'>");
        out.println("<p>directo</p>");
        out.println("</div>");
        out.println("<div class='col l3'>");
        out.println("<p>1h 15m</p>");
        out.println("</div>");
        out.println("<div class='col l1'></div>");
        out.println("</div>");
        out.println("</div>");
        out.println("<div class='col l2 boton'><input type='button' value='Seleccionar' class='wiku-button btn waves-effect waves-light boton'></div>");
        out.println("</div>");
        out.println("</div>");
        out.println("<div class='col l1'></div>");
        out.println("</div>");
        out.println("<div class='row target'>");
        out.println("<div class='col l1'></div>");
        out.println("<div class='col l10 border'>");
        out.println("<div class='row'>");
        out.println("<div class='col l10'>");
        out.println("<div class='row'>");
        out.println("<div class='col l1'></div>");
        out.println("<div class='col l1'>");
        out.println("<i class='material-icons icons prefix'>flight_takeoff</i>");
        out.println("</div>");
        out.println("<div class='col l3'>");
        out.println("<p>21:20-22:35</p>");
        out.println("</div>");
        out.println("<div class='col l3'>");
        out.println("<p>directo</p>");
        out.println("</div>");
        out.println("<div class='col l3'>");
        out.println("<p>1h 15m</p>");
        out.println("</div>");
        out.println("<div class='col l1'></div>");
        out.println("</div>");
        out.println("<div class='row'>");
        out.println("<div class='col l1'></div>");
        out.println("<div class='col l1'>");
        out.println("<i class='material-icons icons prefix'>flight_land</i>");
        out.println("</div>");
        out.println("<div class='col l3'>");
        out.println("<p>21:20-22:35</p>");
        out.println("</div>");
        out.println("<div class='col l3'>");
        out.println("<p>directo</p>");
        out.println("</div>");
        out.println("<div class='col l3'>");
        out.println("<p>1h 15m</p>");
        out.println("</div>");
        out.println("<div class='col l1'></div>");
        out.println("</div>");
        out.println("</div>");
        out.println("<div class='col l2 boton'><input type='button' value = 'Seleccionar' class='wiku-button btn waves-effect waves-light boton '></div>");
        out.println("</div>");
        out.println("</div>");
        out.println("<div class='col l1'></div>");
        out.println("</div>");


    }


    public static Date createDateFromStringWithFormat(String dateString, String format) {
        SimpleDateFormat formatter = new SimpleDateFormat(format);
        Date date = null;
        try {
            date = formatter.parse(dateString);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }
        return date;
    }
}
