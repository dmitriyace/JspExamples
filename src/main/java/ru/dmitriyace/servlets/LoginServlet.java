package ru.dmitriyace.servlets;

import ru.dmitriyace.repos.UsersRepository;
import ru.dmitriyace.repos.UsersRepositoryMemoryImplementation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private UsersRepository usersRepository;

    @Override
    public void init() throws ServletException {
        this.usersRepository = new UsersRepositoryMemoryImplementation();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getServletContext().getRequestDispatcher("/jsp/login.jsp").forward(req,resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String password = req.getParameter("password");
        System.out.println(name+":"+password);

        if (usersRepository.isExist(name,password)){

            HttpSession session = req.getSession();

            session.setAttribute("user", name);

//            req.getServletContext().getRequestDispatcher("/jsp/home.jsp").forward(req,resp);  /* тогда он просто
//              отобразит работу home.jsp сначала на странице с login, а потом, если мы уже как-то редиректнемся
//              на home.jsp, то он уже в зависимости от сервлета будет что-то менять по url'e (в нашем случае
//              у нас в форме перенаправление на /home, поэтому url'a поменяется и обрабатывать будет servlet,
//              прописанный уже для /home)*/
            req.getServletContext().getRequestDispatcher("/home").forward(req,resp);

        } else {
            System.out.println("sosat");
            resp.sendRedirect( req.getContextPath()+"/login");
//            req.getServletContext().getRequestDispatcher("/login").forward(req,resp);
        }
    }
}
