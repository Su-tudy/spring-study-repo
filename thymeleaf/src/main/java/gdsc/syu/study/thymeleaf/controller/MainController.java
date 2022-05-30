package gdsc.syu.study.thymeleaf.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    @AllArgsConstructor
    @Getter
    private class User {
        private String username;
        private int age;
        private String id;
        private String password;
    }

    @AllArgsConstructor
    @Getter
    private class Post {
        private String username;
        private String title;
        private String content;

    }

    private void init() {
        user = new User("스프링하는사람", 200, "hello1234", "1234");
        Post userPost1 = new Post(user.getUsername(), "안녕하세요1", "안녕하세요1 제 이름은 스프링하는 사람 입니다.");
        Post userPost2 = new Post(user.getUsername(), "안녕하세요2", "안녕하세요2 제 이름은 스프링하는 사람 입니다.");
        Post userPost3 = new Post(user.getUsername(), "안녕하세요3", "안녕하세요3 제 이름은 스프링하는 사람 입니다.");

        postList.add(userPost1);
        postList.add(userPost2);
        postList.add(userPost3);
    }
    private User user;
    private List<Post> postList = new ArrayList<>();

    @GetMapping("/")
    public String main(Model model) {
        init();
        model.addAttribute(user);
        model.addAttribute(postList);

        return "template/main";
    }

}

