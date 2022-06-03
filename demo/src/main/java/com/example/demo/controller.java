package com.example.demo;


import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller

public class controller {

    @GetMapping("fragment")
    public String template(Model model){

        addPosts(model);

        return "main";
    }

    @RequestMapping("/postlist")
    public String List(Model model){

        addPosts(model);

        return "/postlist";
    }

    @Data
    static class postList   {

        private String username;

        private String title;

        private String content;

        public postList(String username, String title, String content){

        this.username = username;
        this.title = title;
        this.content = content;
        }
    }

    private void addPosts(Model model){
        List<postList> list = new ArrayList<>();
        list.add(new postList("스프링유저1", "안녕하세요1", "스프링하는사람1입니다."));
        list.add(new postList("스프링유저2", "안녕하세요2", "스프링하는사람2입니다."));
        list.add(new postList("스프링유저3", "안녕하세요3", "스프링하는사람3입니다."));

        model.addAttribute("postlist",list);
    }

}
