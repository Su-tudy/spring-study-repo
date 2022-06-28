package com.example.demo.response;

import com.example.demo.helloData;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "responseHtmlServlet", urlPatterns = "/response-json")
public class ResponseHtmlServlet extends HttpServlet {

    private ObjectMapper objectmapper = new ObjectMapper();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json");
        resp.setCharacterEncoding("utf-8");

        helloData hellodata = new helloData();
        hellodata.setUsername("kim");
        String result = objectmapper.writeValueAsString(hellodata);
        resp.getWriter().write(result);
    }
}
