package hello.servlet.basic.reponse;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "responseHeaderServlet", urlPatterns = "/response-header")
public class ResponseHeaderServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //Http 응답 코드 설정
        //[status-line]
        response.setStatus(HttpServletResponse.SC_OK); //응답 코드: 200 (성공)
        //HttpServletResponse 인터페이스에 응답 코드가 정의 되어있음.

        //[response-header]
        response.setHeader("Content-Type", "text/plain;charset=utf-8");
        //캐시 관련 헤더↓
        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
        response.setHeader("Pragma", "no-cache");
        //임의의 헤더 만들기↓
        response.setHeader("my-header", "hello");

        PrintWriter writer = response.getWriter();
        writer.println("ok");
    }
}
