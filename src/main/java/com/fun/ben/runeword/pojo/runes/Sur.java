package com.fun.ben.runeword.pojo.runes;

import com.fun.ben.runeword.pojo.Rune;

public class Sur {
	
	private  static Rune sur = new Rune();
    static{
    	sur.setContainedRuneword(null);
    	sur.setCubed_into_count(2);
    	sur.setCubed_into_material("Chipped Topaz");
    	sur.setDescription("high rune");
    	sur.setEffect_armor("+5% total Mana");
    	sur.setEffect_helmet("+5% total Mana");
    	sur.setEffect_shield("+50 Mana");
    	sur.setEffect_weapon("20% Chance of Hit Blinds Target");
    	sur.setId(29);
    	sur.setImg("sur.gif");
    	sur.setLevel(61);
    	sur.setName("Sur");
    	sur.setNext(Ber.getRune());
    	sur.setPrevious(Lo.getRune());
    }

    static public Rune getRune()
    {
        return sur;
    }

}
