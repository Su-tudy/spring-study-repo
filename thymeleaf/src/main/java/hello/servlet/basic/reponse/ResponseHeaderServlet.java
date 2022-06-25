package hello.servlet.basic.reponse;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
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
//        response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        //HttpServletResponse 인터페이스에 응답 코드가 정의 되어있음.

        //[response-header]
        response.setHeader("Content-Type", "text/plain;charset=utf-8");
        //캐시 관련 헤더↓
        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
        response.setHeader("Pragma", "no-cache");
        //임의의 헤더 만들기↓
        response.setHeader("my-header", "hello");

        //[Header 편의 메소드]
        content(response);
        //쿠키 관련 편의 메소드
        cookie(response);
        //redirect 관련 편의 메소드
        redirect(response);

        //message body
        PrintWriter writer = response.getWriter();
        writer.println("ok");
    }

    private void content(HttpServletResponse response) {
        //Content-Type: text/plain;charset=utf-8
        //Content-Length: 2
        //response.setHeader("Content-Type", "text/plain;charset=utf-8");
        response.setContentType("text/plain");
        response.setCharacterEncoding("utf-8");
        //response.setContentLength(2); //(생략시 자동 생성)
    }

    private void cookie(HttpServletResponse response) {
        //Set-Cookie: myCookie=good; Max-Age=600;
        //response.setHeader("Set-Cookie", "myCookie=good; Max-Age=600");
        Cookie cookie = new Cookie("myCookie", "good");
        cookie.setMaxAge(600); //600초
        response.addCookie(cookie);
    }

    /**
     * redirect :
     * 서버가 최초로 요청받은 url에서 Location이 있는 위치로 다시 지시(direct)함.
     * 그럼, 클러이언트가 서버로부터 redirect한 위치로 다시 요청보냄.
     * 이때, 최초로 요청받은 url에서 Location을 찾으면 302(FOUND) 응답코드를 출력하고
     * Location 위치로 요청과 응답이 성공하면 Location 위치에 200(OK) 응답코드 출력
     */
    private void redirect(HttpServletResponse response) throws IOException {
        //Status Code 302
        //Location: /basic/hello-form.html
        //response.setStatus(HttpServletResponse.SC_FOUND); //302
        //response.setHeader("Location", "/basic/hello-form.html");
        response.sendRedirect("/basic/hello-form.html");
    }
}
