package gdsc.syu.study.thymeleaf.servlet;

import gdsc.syu.study.thymeleaf.domain.member.Member;
import gdsc.syu.study.thymeleaf.domain.member.MemberRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "mvcMemberLoginServlet", urlPatterns = "/homework")
public class MvcMemberLoginServlet extends HttpServlet {

    private final MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        int age = Integer.parseInt(request.getParameter("age"));

        PrintWriter w = response.getWriter();
        if (isLoginSuccess(username, age)) {
            w.write("<html>");
            w.write("<head>");
            w.write("    <meta charset=\"UTF-8\">");
            w.write("    <title>Title</title>");
            w.write("</head>");
            w.write("<body>");
            w.write("<p>환영합니다 " + username + "님!</p>");
            w.write("<a href src=\"/WEB-INF/views/login-form.jsp\">");
            w.write("메인");
            w.write("</a>");
            w.write("</body>");
            w.write("</html>");
        } else {
            w.write("<html>");
            w.write("<head>");
            w.write("    <meta charset=\"UTF-8\">");
            w.write("    <title>Title</title>");
            w.write("</head>");
            w.write("<body>");
            w.write("<p>로그인에 실패했습니다.</p>");
            w.write("<a href src=\"/WEB-INF/views/login-form.jsp\">");
            w.write("메인");
            w.write("</a>");
            w.write("</body>");
            w.write("</html>");
        }
    }

    private boolean isLoginSuccess(String username, int age) {
        Member member = memberRepository.findByUsername(username);
        if (member == null) {
            return false;
        }

        if (member.getAge() == age) {
            return true;
        }

        return false;
    }
}
