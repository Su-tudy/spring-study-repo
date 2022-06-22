package gdsc.syu.study.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {

    @GetMapping("/hello-form")
    public String memberJoinServletPage() {
        return "template/hello-form";
    }
}
