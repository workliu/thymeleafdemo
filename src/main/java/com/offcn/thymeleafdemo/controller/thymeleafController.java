package com.offcn.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class thymeleafController {
        @GetMapping("index")
        public String indexPage(Model model){
            model.addAttribute("msg","八嘎呀路");
            return "index.html";
        }
}
