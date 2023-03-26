package quest.servlet;

import quest.database.Story;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "LogicServlet", value = "/logic")
public class LogicServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        String action = req.getParameter("action");
        List<Story> scenario = extractScenario(session);

        if (action.equals("first")){
            Story story = scenario.get(0);
            session.setAttribute("story", story);
        } else if (action.equals("second")) {
            Story story = scenario.get(1);
            session.setAttribute("story", story);
        }
        for (int i = 0; i < 2; i++) {
            scenario.remove(0);
        }

        session.getServletContext().getRequestDispatcher("/main.jsp").forward(req, resp);
//        resp.sendRedirect("/main.jsp");
    }

    private List<Story> extractScenario(HttpSession session){
        Object scenario = session.getAttribute("scenario");
        return (List<Story>) scenario;
    }
}
