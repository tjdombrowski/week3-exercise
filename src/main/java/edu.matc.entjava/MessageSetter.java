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
        urlPatterns = {"/"}
)

public class MessageSetter extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String greetingTag;
        String additionalGreetingTag;

        //retrieve time
        LocalTime currentTime = LocalTime.now();

            if (currentTime >= new LocalTime("12:00:00")) {
                greetingTag = "EveningGreeting";
            } else {
                greetingTag = "MorningGreeting";
            }

        //retrieve date
        MonthDay today = MonthDay.now();
        switch (currentDate)
            case: MonthDay halloween = new MonthDay("09-24");
                additionalGreetingTag = "HalloweenGreeting";
                break;
            case: MonthDay christmas = new MonthDay("12-25");
                additionalGreetingTag = "HolidayGreeting";
                break;
            default
                additionalGreetingTag = "";
                break;


        //Set attributes
        req.setAttribute("greetingTag", greetingTag);
        req.setAttribute("additionialGreetingTag", additionalGreetingTag);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/");
        dispatcher.forward(req, resp);

    }
}