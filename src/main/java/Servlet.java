import com.sun.org.apache.xml.internal.dtm.ref.sax2dtm.SAX2DTM2;

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
@WebServlet("/servlet")
public class Servlet extends HttpServlet {
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
                "</style>\n"+
                "<body>\n" +
                "    <div class=\"center\"><h2>MicroService for Grid and Cloud created by Mikhail Makarov</h2>\n" +
                "    <form action = \"add\" method = \"GET\">\n" +
                "        To add value into list, enter value and push Add value<br>\n" +
                "        <input type = \"text\" name = \"value\"><br>\n" +
                "        <input type = \"submit\" value = \"Add value\"/>\n" +
                "    </form>\n" +
                "    <form action = \"get\" method = \"GET\">\n" +
                "        To make linear-regression and get value, push Get value<br>\n" +
                "        <input type = \"submit\" value = \"Get value\"/>\n" +
                "    </form>\n" +
                "    <form action = \"view\" method = \"GET\">\n" +
                "        To view list of values, push View values<br>\n" +
                "        <input type = \"submit\" value = \"View values\"/>\n" +
                "    </form></div>\n" +
                "</body>\n" +
                "</html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
