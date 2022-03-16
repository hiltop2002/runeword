package com.fun.ben.runeword.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.fun.ben.runeword.pojo.Rune;
import com.fun.ben.runeword.pojo.RuneSet;

@RestController
public class HelloController {

    private static final Logger w = LoggerFactory.getLogger(HelloController.class);
    
    @Autowired
    RuneSet rs;
    
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

    @GetMapping("/api/getrunetext/{rune}")
    @ResponseBody
    public String getRuneText(@PathVariable("rune") String rune)
    {
        Rune t = rs.getRuneByName(rune);
        return t.display_h();
    }
    
    @GetMapping("/api/getrune/{rune}")
    @ResponseBody
    public EntityModel<Rune> getRune(@PathVariable("rune") String rune)
    {
    	Rune t = rs.getRuneByName(rune);
    	t.removeLinks(); //hey, this is useful
    	
    	if(t.getNext() != null)
    	{
    		Link nextlink = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(HelloController.class).getRune(t.getNext().getName())).withRel("next");
    		t.add(nextlink);
    	}
    	
    	if(t.getPrevious() != null)
    	{
    		Link previouslink = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(HelloController.class).getRune(t.getPrevious().getName())).withRel("previous");
            
            t.add(previouslink);
    	}
    	
    	return EntityModel.of(t);
    }
    
    @GetMapping("/api/gettier/{tier}")
    @ResponseBody
    public ResponseEntity<Object> getTier(@PathVariable("tier") String tier)
    {
    	List<Rune> tierlist = rs.getRuneByTier(tier);
    	
    	if(!rs.isTierValid(tier))
    	{
    		return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
    	}
    	
    	for(Rune t: tierlist)
    	{
    		t.removeLinks(); //hey, this is useful
        	
        	if(t.getNext() != null)
        	{
        		Link nextlink = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(HelloController.class).getRune(t.getNext().getName())).withRel("next");
        		t.add(nextlink);
        	}
        	
        	if(t.getPrevious() != null)
        	{
        		Link previouslink = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(HelloController.class).getRune(t.getPrevious().getName())).withRel("previous");
                
                t.add(previouslink);
        	}
    	}
    	
    	if(tierlist.size() > 1)
    	{
    		return new ResponseEntity<>(tierlist, HttpStatus.OK);
    	}
    	else
    	{
    		return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    	}
    	
    }
    
}
