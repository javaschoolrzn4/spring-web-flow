package ru.springtimes.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
public class IndexController {
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(Map<String, Object> sayModel) {
        sayModel.put("data", "Тестовая строка данных!");
        return "index";
    }
}
