package spirng_study1.thymeleaf.basic;

import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;

@Controller
    @RequestMapping ("/template")
    public class TemplateController {

    @GetMapping("/fragment")
    public String template() {
        return "template/fragment/fragmentMain";
    }

    @RequestMapping("/PostList")
    public String List(Model model) {
        addPost(model);
        return "/PostList";
    }

    private void addPost(Model model) {
        List<PostList> list = new ArrayList<>();
        list.add(new PostList("스프링유저1", "안녕하세요1", "안녕하세요1 제 이름은 스프링하는 사람입니다"));
        list.add(new PostList("스프링유저2", "안녕하세요2", "안녕하세요2 제 이름은 스프링하는 사람입니다"));
        list.add(new PostList("스프링유저3", "안녕하세요3", "안녕하세요3 제 이름은 스프링하는 사람입니다"));

        model.addAttribute("PostList", list);
    }

    @Data
    class PostList {
        private String username;
        private String title;
        private String content;

        public PostList(String username, String title, String content) {
            this.username = username;
            this.title = title;
            this.content = content;
        }


    }
}
