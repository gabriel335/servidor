package ar.incluit.fintech.anses.servidor.web.servlet;

import org.springframework.beans.factory.annotation.Value;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "/init-auth")
public class InitAuth extends HttpServlet {

    @Value("${backoffice.url}")
    private String BACKOFFICE_URL = "localhost:4200/#/auth/login/check";



    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String token = req.getParameter("token");
        String sign = req.getParameter("sign");
        String action = req.getParameter("action");

        res.setContentType("text/html");
        res.setCharacterEncoding("UTF-8");

        // create HTML response
        PrintWriter writer = res.getWriter();
        writer.append("<!DOCTYPE html>")
                .append("<html>")
                .append("<head>")
                .append("<title>Welcome message</title>")
                .append("</head>")
                .append("<body>");
        if (!(token == null && sign == null) && !token.trim().isEmpty() && !sign.trim().isEmpty()) {
            writer.append("<a href='http://"+ BACKOFFICE_URL + "?token=" + token+ "&sign="+ sign +"' style='display: flex;flex-direction: column; justify-content: center; align-items: center;text-align: center;min-height: 100vh;font-size: 25px'>Ir a al back-office</a>");
        } else {
            writer.append("<div style='display: flex;flex-direction: column; justify-content: center; align-items: center;text-align: center;min-height: 100vh'>");
            writer.append("<p style='font-size: 25px';'text-align: center;'>Error, intente de nuevo o contacte con el administrador.</p>\r\n");
            writer.append("</div>");
        }
        writer.append("</body>")
                .append("</html>");
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {


        // set response headers
        res.setContentType("text/html");
        res.setCharacterEncoding("UTF-8");

        // create HTML form
        PrintWriter writer = res.getWriter();
        writer.append("<!DOCTYPE html>\r\n")
                .append("<html>\r\n")
                .append("<head>\r\n")
                .append("<title>Form input</title>\r\n")
                .append("</head>\r\n")
                .append("<body>\r\n")
                .append("<form action=\"welcome\" method=\"POST\">\r\n")
                .append("<input type=\"text\" name=\"token\" value=\"token\"/>\r\n")
                .append("<input type=\"text\" name=\"sign\" value=\"sign\"/>\r\n")
                .append("<input type=\"text\" name=\"action\" value=\"AUTH\"/>\r\n")
                .append("<input type=\"submit\" value=\"Submit\" />\r\n")
                .append("</form>\r\n")
                .append("</body>\r\n")
                .append("</html>\r\n");

    }

}
