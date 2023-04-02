package quest.servlet;

import quest.model.Story;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "LogicServlet", value = "/logic")
public class LogicServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        String action = req.getParameter("action");
        List<Story> scenario = extractScenario(session);

        if (action.equals("first")) {
            Story story = pollStory(scenario, 0);
            session.setAttribute("story", story);
        } else if (action.equals("second")) {
            Story story = pollStory(scenario, 1);
            session.setAttribute("story", story);
        }
        session.getServletContext().getRequestDispatcher("/main.jsp").forward(req, resp);
    }

    private List<Story> extractScenario(HttpSession session) {
        Object scenario = session.getAttribute("scenario");
        return (List<Story>) scenario;
    }

    private Story pollStory(List<Story> scenario, int idx) {
        Story storyToReturn = scenario.get(idx);
        for (int i = 0; i < 2; i++) {
            scenario.remove(0);
        }

        return storyToReturn;
    }
}
