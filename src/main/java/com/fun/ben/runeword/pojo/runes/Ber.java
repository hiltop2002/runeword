package com.fun.ben.runeword.pojo.runes;

import com.fun.ben.runeword.pojo.Rune;

public class Ber {
	
	
	private  static Rune ber = new Rune();
    static{
    	ber.setContainedRuneword(null);
    	ber.setCubed_into_count(2);
    	ber.setCubed_into_material("Chipped Topaz");
    	ber.setDescription("high rune");
    	ber.setEffect_armor("Damage Reduced by 8%");
    	ber.setEffect_helmet("Damage Reduced by 8%");
    	ber.setEffect_shield("Damage Reduced by 8%");
    	ber.setEffect_weapon("20% Chance of Crushing Blow");
    	ber.setId(30);
    	ber.setImg("ber.gif");
    	ber.setLevel(63);
    	ber.setName("Ber");
    	ber.setNext(Jah.getRune());
    	ber.setPrevious(Sur.getRune());
    }

    static public Rune getRune()
    {
        return ber;
    }

}
