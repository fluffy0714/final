package org.finalproject.finalproject.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.finalproject.finalproject.db.texts;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "EndGame",value = "/endgame")
public class EndGame extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        if (req.getParameter("answer").equals("a1")){
            out.println("<html><body>");
            out.println("<head>");
            out.println("<meta charset=\"UTF-8\">");
            out.println("<title>Ваш заголовок</title>");
            out.println("</head>");
            out.println("<h1>" + "Тебя вернули домой.Победа" + "</h1>");
            out.println("<form method=\"get\" action=\"index.jsp\">");
            out.println("<button type=\"submit\">Начать Заного</button>");
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
            out.println("Счетчик игр:" + req.getSession().getAttribute("counter"));
            out.println("</body></html>");
        }
        else if (req.getParameter("answer").equals("a2")){
            out.println("<html><body>");
            out.println("<head>");
            out.println("<meta charset=\"UTF-8\">");
            out.println("<title>Ваш заголовок</title>");
            out.println("</head>");
            out.println("<h1>" + "Твою ложь разоблачили. Поражение " + "</h1>");
            out.println("<form action=\"index.jsp\" method=\"get\">");
            out.println("<button type=\"submit\">Начать Заного</button>");
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
            out.println("Счетчик игр:" + req.getSession().getAttribute("counter"));
            out.println("</body></html>");
        }
    }
}
