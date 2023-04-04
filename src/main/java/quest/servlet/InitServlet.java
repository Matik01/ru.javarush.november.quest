package quest.servlet;

import quest.model.generator.AnswerGenerator;
import quest.model.generator.ScenarioGenerator;
import quest.model.UFOQuestOrigin;
import quest.model.Story;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "InitServlet", value = "/init")
public class InitServlet extends HttpServlet {
    SessionData sessionData;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        sessionDataInit(session);
        String init = req.getParameter("init");



        UFOQuestOrigin ufoQuestOrigin = new UFOQuestOrigin(new AnswerGenerator(), new ScenarioGenerator());
        ufoQuestOrigin.buildQuest();
        List<Story> scenario = ufoQuestOrigin.getStoryList();

        Story story = null;

        if (init.equals("start")) {
            story = scenario.get(0);
            session.setAttribute("scenario", scenario);
            session.setAttribute("story", story);

            for (int i = 0; i < 2; i++) {
                scenario.remove(0);
            }

        } else {
            story = scenario.get(1);
            session.setAttribute("story", story);
        }

        session.setAttribute("data", sessionData);

        session.getServletContext().getRequestDispatcher("/main.jsp").forward(req, resp);
    }

    private void sessionDataInit(HttpSession session){
        if (sessionData == null){
            sessionData = new SessionData(session.getId());
        }
        sessionData.increaseRound();
    }
}
