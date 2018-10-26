package ru.dmitriyace.servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getServletContext().getRequestDispatcher("/jsp/home.jsp");
        dispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String color = req.getParameter("color");

        Cookie colorCookie = new Cookie("colorCookName", color);

        resp.addCookie(colorCookie);

//        if (resp.isCommitted()) {
//
//            resp.sendRedirect(req.getContextPath() + "/home");
//        } else {
            req.getServletContext().getRequestDispatcher("/home").forward(req,resp);
//        }
        /* для того, чтобы сразу на странице отрабатывала кука */
//        RequestDispatcher dispatcher = req.getServletContext().getRequestDispatcher("/jsp/home.jsp");
//        dispatcher.forward(req,resp);
    }
}
