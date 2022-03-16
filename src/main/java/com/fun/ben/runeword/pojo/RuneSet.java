package com.fun.ben.runeword.pojo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.stereotype.Component;

import com.fun.ben.runeword.controller.HelloController;
import com.fun.ben.runeword.pojo.runes.El;
import com.fun.ben.runeword.pojo.runes.Zod;

@Component
public class RuneSet {

    private static final Rune el = El.getRune();
    private static final Rune zod = Zod.getRune();
    
    
    private Rune walker;
    private String[] tiers =
    {
    	"low",
    	"mid",
    	"high"
    };
    
    public boolean isTierValid(String tier)
    {
    	return Arrays.stream(tiers).anyMatch(tier::equals);
    }
    
    public Rune getRuneByName(String runename)
    {
    	walker = el;
    	
    	while(walker!=null && !walker.getName().equalsIgnoreCase(runename))
    	{
    		walker = walker.getNext();
    	} 
    	
    	return walker;
    }
    
    public List<Rune> getRuneByTier(String tier)
    {
    	List<Rune> thistier = new ArrayList<Rune>();
    	
    	walker = el;
    	while(walker != null)
    	{
    		if(walker.getDescription().toLowerCase().contains(tier.toLowerCase()))
    		{
    			thistier.add(walker);
    		}
    	
    		
    		walker = walker.getNext();
    	}
    	
    	return thistier;
    }
    
}
