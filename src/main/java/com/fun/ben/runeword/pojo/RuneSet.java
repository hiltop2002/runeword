package com.fun.ben.runeword.pojo;

import org.springframework.stereotype.Component;

import com.fun.ben.runeword.pojo.runes.El;
import com.fun.ben.runeword.pojo.runes.Zod;

@Component
public class RuneSet {

    private static final Rune el = El.getRune();
    private static final Rune zod = Zod.getRune();
    
    
    private Rune walker;
    
    public Rune getRuneByName(String runename)
    {
    	walker = el;
    	
    	while(!walker.getName().equalsIgnoreCase(runename))
    	{
    		walker = walker.getNext();
    	} 
    	
    	return walker;
    }
    
}
