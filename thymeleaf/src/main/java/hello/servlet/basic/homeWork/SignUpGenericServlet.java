package hello.servlet.basic.homeWork;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * http://localhost:8080/sign-up-generic?username=Dongyeol%20Kim&age=25
 */

@WebServlet(name = "signUpGenericServlet", urlPatterns = "/sign-up-generic")
public class SignUpGenericServlet extends GenericServlet {

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {

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