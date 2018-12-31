package com.example.vuejslegacy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
public class MainController {

    @GetMapping("/main")
    public ModelAndView main(ModelAndView mav) {
        mav.setViewName("main");
        mav.addObject("title", "MAIN");
        return mav;
    }

    @GetMapping("/api/user/{name}")
    public @ResponseBody Map getUser(@PathVariable String name) {
        Map<String, Object> map = new HashMap<>();
        map.put("name", name);

        return map;
    }

    @GetMapping("/api/session/{name}")
    public @ResponseBody String getSession(HttpServletRequest request, @PathVariable String name) {
        String result = (String) request.getSession().getAttribute("name");

        return result;
    }

    @PutMapping("/api/session/{name}")
    public void putSession(HttpServletRequest request, @PathVariable String name) {
        request.getSession().setAttribute("name", name);
    }
}
