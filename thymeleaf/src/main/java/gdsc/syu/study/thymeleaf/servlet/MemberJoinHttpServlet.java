package gdsc.syu.study.thymeleaf.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// urlPatterns = "/memberjoinhttpservlet"
// urlPatterns = "/memberjoinhttpservlet"
@WebServlet(name = "memberJoinHttpServlet", urlPatterns = "/memberjoinhttpservlet")
public class MemberJoinHttpServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String age = req.getParameter("age");

        if(username.length() > 0 && username !="" && age.length() >0 && age !="") {
            System.out.println("회원가입이 되었습니다.");
            System.out.println("username : " + username);
            System.out.println("age : " + age);
        }else {
            resp.getWriter().write(400);
        }
    }
}
