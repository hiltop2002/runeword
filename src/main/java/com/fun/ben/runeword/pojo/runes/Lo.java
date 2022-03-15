package com.fun.ben.runeword.pojo.runes;

import com.fun.ben.runeword.pojo.Rune;

public class Lo {
	
	private  static Rune lo = new Rune();
    static{
    	lo.setContainedRuneword(null);
    	lo.setCubed_into_count(2);
    	lo.setCubed_into_material("Chipped Topaz");
    	lo.setDescription("high rune");
    	lo.setEffect_armor("+5 to Max. Resist Lightning");
    	lo.setEffect_helmet("+5 to Max. Resist Lightning");
    	lo.setEffect_shield("+5 to Max. Resist Lightning");
    	lo.setEffect_weapon("20% Chance of Deadly Strike");
    	lo.setId(28);
    	lo.setImg("lo.gif");
    	lo.setLevel(59);
    	lo.setName("Lo");
    	lo.setNext(Sur.getRune());
    	lo.setPrevious(Ohm.getRune());
    }

    static public Rune getRune()
    {
        return lo;
    }

}
