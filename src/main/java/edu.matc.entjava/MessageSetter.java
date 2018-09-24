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
        String greetingTag;
        String additionalGreetingTag;

        //retrieve date
        MonthDay today = MonthDay.now();

        //retrieve time
        LocalTime currentTime = LocalTime.now();

        switch (currentDate)
            case: MonthDay halloween = new MonthDay("09-24");
                greetingTag = "HalloweenGreeting";
                break;
            case: MonthDay christmas = new MonthDay("12-25");
                greetingTag = "HolidayGreeting";
                break;
            default
                greetingTag = "";
                break;

    }
}