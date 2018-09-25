package edu.matc.controller;

import edu.matc.entity.Greeting;

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
        Greeting greeting = new Greeting();

        //retrieve time
        LocalTime currentTime = LocalTime.now();

            if (currentTime.isAfter(LocalTime.of(12, 0, 0))) {
                greeting.setGreeting("EveningGreeting");
            } else {
                greeting.setGreeting("MorningGreeting");
            }

        //retrieve date
        MonthDay today = MonthDay.now();
        if (today.equals(MonthDay.of(9, 25))) {
            greeting.setAdditionalGreeting("HalloweenGreeting");
        } else if (today.equals(MonthDay.of(12, 25))) {
            greeting.setAdditionalGreeting("HolidayGreeting");
        }

        //Set attributes
        req.setAttribute("greeting", greeting);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/welcomePage.jsp");
        dispatcher.forward(req, resp);

    }
}