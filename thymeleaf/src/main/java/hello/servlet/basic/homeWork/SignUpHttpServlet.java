package hello.servlet.basic.homeWork;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * http://localhost:8080/sign-up-http?username=Dongyeol%20Kim&age=25
 */

@WebServlet(name = "signUpServlet4thHomeWork", urlPatterns = "/sign-up-http")
public class SignUpHttpServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username");
        String age = request.getParameter("age");

        if (username == null || age == null){
            System.out.println("회원 정보를 확인해주세요.");
        }else{
            System.out.println("회원 가입이 되었습니다.");
            System.out.println("회원 이름 : " + username);
            System.out.println("회원 나이 : " + age);
        }

        response.getWriter().write("Confirm console.");
    }
}
