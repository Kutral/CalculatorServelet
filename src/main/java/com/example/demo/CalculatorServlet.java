package com.example.demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "CalculatorServlet", value = "/calc")
public class CalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.getRequestDispatcher("/Calculator.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String aStr = req.getParameter("a");
        String bStr = req.getParameter("b");
        String op   = req.getParameter("op");

        Double result = null;
        String error = null;

          double a = 0;
          double b = 0;

            a = Double.parseDouble(aStr);
            b = Double.parseDouble(bStr);

        if (error == null) {
            switch (op) {
                case "add":
                    result = a + b;
                    break;
                case "sub":
                    result = a - b;
                    break;
                case "mul":
                    result = a * b;
                    break;
                case "div":
                        result = a / b;
                    break;
                default:
                    error = "Unknown operation.";
            }
        }

        req.setAttribute("result", result);
        req.setAttribute("error", error);

        req.setAttribute("a", aStr);
        req.setAttribute("b", bStr);

        req.getRequestDispatcher("/Calculator.jsp").forward(req, resp);
    }
}
