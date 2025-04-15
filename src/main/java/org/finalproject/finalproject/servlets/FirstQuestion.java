package org.finalproject.finalproject.servlets;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.finalproject.finalproject.db.texts;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class FirstQuestion extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        texts.Name = request.getParameter("name");
        HttpSession session = request.getSession();
        Integer counter = (Integer)session.getAttribute("counter");
        if (counter == null) {
            session.setAttribute("counter", 0);
            counter = 0;
        }
        else {
            session.setAttribute("counter", counter + 1);
        }

        PrintWriter out = response.getWriter();
        if (request.getParameter("answer").equals("a1")) {
            out.println();
            out.println("<html><body>");
            out.println("<h1> Выбран ответ А1 </h1>");
            out.println("<br>");
            out.println("<br>");
            out.println("<br>");
            out.println("<br>");
            out.println(texts.Name);
            out.println("</body></html>");
            response.sendRedirect("/secondquestion");

        }
        if (request.getParameter("answer").equals("a2")) {
            out.println("<html><body>");
            out.println("<h1>" + "Ты отклонил вызов.Поражение" + "</h1>");
            out.println("<form action=\"index.jsp\" method=\"get\">");
            out.println("<button type=\"submit\">Начать Заного</button>");
            out.println("</form>");
            out.println("<br>");
            out.println("<br>");
            out.println("<br>");
            out.println("<br>");
            out.println("Статистика:");
            out.println("<br>");
            out.println("Ваше имя:" + texts.Name);
            out.println("<br>");
            out.println("Ваш IP:");
            out.println("<br>");
            out.println("Счетчик игр:" + counter);
            out.println("</body></html>");

        }
        out.close();
    }



    public void destroy() {
    }

}