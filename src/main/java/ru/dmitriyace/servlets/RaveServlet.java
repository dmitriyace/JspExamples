package ru.dmitriyace.servlets;

import ru.dmitriyace.models.Act;
import ru.dmitriyace.repos.ActsRepo;
import ru.dmitriyace.repos.ActsRepoMemoryImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/кмс")
public class RaveServlet extends HttpServlet {
    private ActsRepo actsRepo;

    @Override
    public void init() throws ServletException {
        this.actsRepo = new ActsRepoMemoryImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Act>acts = actsRepo.checkoutAllActs();
        req.setAttribute("actsFromServer", acts);
        RequestDispatcher dispatcher = req.getServletContext().getRequestDispatcher("/jsp/кмс.jsp");
        dispatcher.forward(req,resp);
    }
}
