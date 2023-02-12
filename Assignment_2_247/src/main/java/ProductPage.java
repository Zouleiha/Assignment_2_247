import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ProductPage extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Cookie[] cookies = request.getCookies();
        String user = null;

        if (cookies==null)
        {
            response.sendRedirect("login.html");
        }
        else
        {
            for (Cookie cookie:cookies)
            {
                if (cookie.getName().equals("currentUser"))
                {
                    user = cookie.getValue();
                }
            }
        }

        PrintWriter out = response.getWriter();
        response.setContentType("text/html");

        out.println("<HTML>");
        out.println("<HEAD>");
        out.println("<TITLE>Cake'x Cart</TITLE>");
        out.println("</HEAD>");
        out.println("<BODY>");
        out.println("<h3> Please enter the desired quantity for your items </h3>");
        out.println("<br>");
        out.println("<h2>Welcome, " + user + "</h2>");
        out.println(" Donut ");
        out.println("<br>");
        out.println(" Serial Number : ATV40 ");
        out.println("<form method=\"post\" action=\"CartController\"> ");
        out.println(" Quantity : <input type=\"number\" name=\"priceDonut\">");
        out.println("<br>");
        out.println("Price: 90$");
        out.println("<br>");
        out.println("<br>");
        out.println("<input type=\"submit\" value=\"Add to Cart\">");
        out.println("<br>");
        out.println("<br>");
        out.println(" Cupcake ");
        out.println("<br>");
        out.println(" Serial Number : FT353 ");
        out.println("<br>");
        out.println(" Quantity : <input type=\"number\" name=\"priceCupcake\">");
        out.println("<br>");
        out.println("Price: 150$");
        out.println("<br>");
        out.println("<br>");
        out.println("<input type=\"submit\" value=\"Add to Cart\">");
        out.println("</form>");
        out.println("<form method = \"post\" action=\"Logout\"> <input type=\"submit\" value = \"Log Out\"> </form>");
        out.println("</BODY>");
        out.println("</HTML>");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
