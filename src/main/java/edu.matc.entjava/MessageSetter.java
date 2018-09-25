package edu.matc.controller;

import java.time.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.*;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 */

@WebServlet(
        urlPatterns = {"/welcome"}
)

public class MessageSetter extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String greetingTag = "";
        String additionalGreetingTag = "";

        //retrieve time
        LocalTime currentTime = LocalTime.now();

            if (currentTime.isAfter(LocalTime.of(12, 0, 0))) {
                greetingTag = "EveningGreeting";
            } else {
                greetingTag = "MorningGreeting";
            }

        //retrieve date
        MonthDay today = MonthDay.now();
        if (today.equals(MonthDay.of(9, 25))) {
            additionalGreetingTag = "HalloweenGreeting";
        } else if (today.equals(MonthDay.of(12, 25))) {
            additionalGreetingTag = "HolidayGreeting";
        }

        //Set attributes
        req.setAttribute("greetingTag", greetingTag);
        req.setAttribute("additionialGreetingTag", additionalGreetingTag);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/index.jsp");
        dispatcher.forward(req, resp);

    }
}