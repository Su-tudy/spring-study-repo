package gdsc.syu.study.thymeleaf.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

// urlPatterns = "/memberjoingenericservlet"
@WebServlet(name = "memberjoingenericservlet" , urlPatterns = "/memberjoingenericservlet")
public class MemberJoinGenericServlet extends GenericServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        String username = req.getParameter("username");
        String age = req.getParameter("age");

        if(username.length() > 0 && username !="" && age.length() >0 && age !="") {
            System.out.println("회원가입이 되었습니다.");
            System.out.println("username : " + username);
            System.out.println("age : " + age);
        }else {
            res.getWriter().write(400);
        }

    }
}