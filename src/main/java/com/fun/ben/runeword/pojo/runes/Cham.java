package com.fun.ben.runeword.pojo.runes;

import com.fun.ben.runeword.pojo.Rune;

public class Cham {
	
	private  static Rune cham = new Rune();
    static{
    	cham.setContainedRuneword(null);
    	cham.setCubed_into_count(2);
    	cham.setCubed_into_material("Chipped Topaz");
    	cham.setDescription("high rune");
    	cham.setEffect_armor("Cannot be Frozen");
    	cham.setEffect_helmet("Cannot be Frozen");
    	cham.setEffect_shield("Cannot be Frozen");
    	cham.setEffect_weapon("32% Chance of Hit Freezing Target for 3 seconds");
    	cham.setId(32);
    	cham.setImg("cham.gif");
    	cham.setLevel(67);
    	cham.setName("cham");
    	cham.setNext(Zod.getRune());
    	cham.setPrevious(Jah.getRune());
    }

    static public Rune getRune()
    {
        return cham;
    }

}
