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

@WebServlet("/view")
public class ViewValuesHandler extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
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
                "<div class=\"center\"><p>Values: "+Main.list.toString()+ "</p></div>"+
                "</body>\n" +
                "</html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
