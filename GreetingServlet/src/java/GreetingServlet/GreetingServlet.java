package GreetingServlet;
import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/GreetingServlet")
public class GreetingServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // parameter name
        String name = request.getParameter("name");

        // Guest
        if (name == null || name.isEmpty()) {
            name = "iffah";
        }

        // JSP
        request.setAttribute("name", name);
        request.getRequestDispatcher("greeting.jsp").forward(request, response);
    }
}