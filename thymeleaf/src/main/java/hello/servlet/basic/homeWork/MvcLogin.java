package hello.servlet.basic.homeWork;

import hello.servlet.domain.member.Member;
import hello.servlet.domain.member.MemberRepository;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

@WebServlet(name = "mvcLogin", urlPatterns = "/homework/login")
public class MvcLogin extends HttpServlet {

    private MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username");
        int age = Integer.parseInt(request.getParameter("age"));
        boolean check = false;

        List<Member> members = memberRepository.findAll();

        for (Member member : members) {
            if (Objects.equals(username, member.getUsername())){
                if (age == member.getAge()) {
                    check = true;
                    break;
                }
            }
        }

        if (check) {
            request.setAttribute("username", username);

            String viewPath = "/WEB-INF/views/login-success.jsp";
            RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);
            dispatcher.forward(request,response);
        }else{
            String viewPath = "/WEB-INF/views/login-fail.jsp";
            RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);
            dispatcher.forward(request,response);
        }

    }
}
