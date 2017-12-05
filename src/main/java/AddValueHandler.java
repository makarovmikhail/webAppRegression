import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Mikhail on 05.12.2017.
 */

@WebServlet("/add")
public class AddValueHandler extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{
            Main.value = Double.valueOf(req.getParameter("value"));
            Main.add(Main.value);
        }catch (NumberFormatException e){
            Main.value = 0;
        }
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html>\n" +
                "<style>\n" +
                ".center {\n" +
                "    margin: auto;\n" +
                "    width: 60%;\n" +
                "    border: 3px solid #73AD21;\n" +
                "    padding: 10px;\n" +
                "}\n" +
                "</style>" +
                "<body>\n" +
                "<div class=\"center\"><p>"+Main.value+ " is added</p></div>"+
                "</body>\n" +
                "</html>");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
