package com.fun.ben.runeword.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HelloController {

    private static final Logger w = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/")
    ModelAndView helloMain(HttpServletRequest request, HttpServletResponse response)
    {
        String ip = request.getRemoteAddr();
        ModelAndView mav = new ModelAndView();
        w.info("ok");
        mav.addObject("ip", ip);
        mav.setViewName("index");
        return mav;
    }

    @GetMapping("/api/getrunes/{rune}")
    @ResponseBody
    public String getRune(@PathVariable("rune") String rune)
    {
        w.info(rune);
        return rune;
    }
    
}
