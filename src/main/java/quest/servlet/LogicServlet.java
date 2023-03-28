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
        boolean isRestartable = false;

        HttpSession session = req.getSession();
        String action = req.getParameter("action");
        String remove = req.getParameter("remove");
        List<Story> scenario = extractScenario(session);

        if (action.equals("first")) {
            Story story = scenario.get(0);
            isRestartable = story.isRestartable();
            session.setAttribute("story", story);
        } else if (action.equals("second")) {
            Story story = scenario.get(1);
            isRestartable = story.isRestartable();
            session.setAttribute("story", story);
        }

        if (remove.equals("two")) {
            removeStory(scenario, 2);
        } else {
            removeStory(scenario, 1);
        }

        if (!isRestartable) {
            session.getServletContext().getRequestDispatcher("/main.jsp").forward(req, resp);
        } else {
            session.getServletContext().getRequestDispatcher("/restart.jsp").forward(req, resp);
        }
    }

    private List<Story> extractScenario(HttpSession session) {
        Object scenario = session.getAttribute("scenario");
        return (List<Story>) scenario;
    }

    private void removeStory(List<Story> scenario, int sizeToRemove) {
        for (int i = 0; i < sizeToRemove; i++) {
            scenario.remove(i);
            i--;
        }
    }
}
