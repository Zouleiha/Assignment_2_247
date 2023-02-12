import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CartController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //to parse the values to the variables
        int Donut = Integer.parseInt(request.getParameter("priceDonut"));
        int Cupcake = Integer.parseInt(request.getParameter("priceCupcake"));

        int singlePriceDonut = 90;
        int singlePriceCupcake = 150;

        int totalPriceDonut= singlePriceDonut * Donut;
        int totalPriceCupcake= singlePriceCupcake * Cupcake;

        int totalPriceDonutAndCupcake = totalPriceDonut + totalPriceCupcake;

        PrintWriter out = response.getWriter();
        response.setContentType("text/html");

        out.println("<HTML>");
        out.println("<HEAD>");
        out.println("<TITLE>Cake'x Cart</TITLE>");
        out.println("</HEAD>");
        out.println("<BODY>");
        out.println(" Donut ");
        out.println("Donut Selected: " + Donut );
        out.println("<br>");
        out.println("Total price of Donut: " + totalPriceDonut+"$" );
        out.println("<br>");
        out.println("Cupcake Selected: " + Cupcake );
        out.println("<br>");
        out.println("Total price of Cupcake: " + totalPriceCupcake+"$" );
        out.println("<br>");
        out.println("<br>");
        out.println("Total price: " + totalPriceDonutAndCupcake+"$" );
        out.println("<br>");
        out.println("<br>");
        out.println("<form method=\"post\" action=\"ProductPage\"> ");
        out.println("<input type=\"submit\" value=\"Update Cart\">");
        out.println("</form>");
        out.println("<br>");
        out.println("<br>");
        out.println("<form method=\"post\" action=\"CheckOut\"> ");
        out.println("<input type=\"submit\" value=\"Check Out\">");
        out.println("</BODY>");


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
