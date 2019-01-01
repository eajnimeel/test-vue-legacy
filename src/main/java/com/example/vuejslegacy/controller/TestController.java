package com.example.vuejslegacy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

    @GetMapping("/test0")
    public ModelAndView view0(ModelAndView mav) {
        mav.setViewName("test0");
        mav.addObject("title", "테스트0");
        return mav;
    }

    @GetMapping("/test1")
    public ModelAndView view1(ModelAndView mav) {
        mav.setViewName("test1");
        mav.addObject("title", "테스트1");
        return mav;
    }


}
