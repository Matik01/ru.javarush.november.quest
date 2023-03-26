package quest.servlet;

import quest.database.Answer;
import quest.database.UFOQuestOrigin;
import quest.database.Story;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

@WebServlet(name = "InitServlet", value = "/init")
public class InitServlet extends HttpServlet {
    private UFOQuestOrigin UFOQuestOrigin;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        String init = req.getParameter("init");

        if (UFOQuestOrigin == null) {
            UFOQuestOrigin = new UFOQuestOrigin();
            UFOQuestOrigin.scenarioGenerator();
            UFOQuestOrigin.answersGenerator();
            UFOQuestOrigin.buildQuest();
        }
        List<Story> scenario = UFOQuestOrigin.getStoryList();

        if (init.equals("start")) {
            Story story = scenario.get(0);
            session.setAttribute("scenario", scenario);
            session.setAttribute("story", story);

            for (int i = 0; i < 2; i++) {
                scenario.remove(0);
            }

            session.getServletContext().getRequestDispatcher("/main.jsp").forward(req, resp);

        } else {
            Story story = scenario.get(1);
            session.setAttribute("story", story);

            session.getServletContext().getRequestDispatcher("/restart.jsp").forward(req, resp);
        }


    }
}
