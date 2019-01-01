package com.example.vuejslegacy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
public class TestApiController {

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

    @PostMapping("/api/session/{name}")
    public void putSession(HttpServletRequest request, @PathVariable String name) {
        request.getSession().setAttribute("name", name);
    }
}
