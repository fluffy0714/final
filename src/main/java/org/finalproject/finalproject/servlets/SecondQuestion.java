package org.finalproject.finalproject.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.finalproject.finalproject.db.texts;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "secondquestion",value = "/secondquestion")
public class SecondQuestion extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<head>");
        out.println("<meta charset=\"UTF-8\">");
        out.println("<title>Ваш заголовок</title>");
        out.println("</head>");
        out.println("<form method=\"get\" action=\"thirdquestion\">");
        out.println("<p><b>Ты принял вызов.Поднимаешься на мостик к капитану?</b></p>");
        out.println("<p><input type=\"radio\" name=\"answer\" value=\"a1\">Подняться на мостик<Br>");
        out.println("<input type=\"radio\" name=\"answer\" value=\"a2\">Отказаться подняться на мостик<Br>");
        out.println("<p><input type=\"submit\"></p>");
        out.println("</form>");
        out.println("<br>");
        out.println("<br>");
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
        out.println("Счетчик игр:"+req.getSession().getAttribute("counter") );
        out.println("</html></body>");
    }
}
