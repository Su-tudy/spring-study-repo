package hello.servlet.basic.request;

import antlr.StringUtils;
import org.springframework.util.StreamUtils;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

@WebServlet(name = "requestBodyStringServlet", urlPatterns = "/request-body-string")
public class RequestBodyStringServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletInputStream inputStream = request.getInputStream(); //http 바디의 내용을 byte형태(stream)로 가져옴.
        String messageBody = StreamUtils.copyToString(inputStream, StandardCharsets.UTF_8);//stream을 문자열로 변환

        System.out.println("messageBody = " + messageBody);

        response.getWriter().write("ok");

    }
}
