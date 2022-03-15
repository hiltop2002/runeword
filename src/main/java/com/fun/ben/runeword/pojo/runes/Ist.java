package com.fun.ben.runeword.pojo.runes;

import com.fun.ben.runeword.pojo.Rune;

public class Ist {
	
	
	private  static Rune ist = new Rune();
    static{
    	ist.setContainedRuneword(null);
    	ist.setCubed_into_count(2);
    	ist.setCubed_into_material("Chipped Topaz");
    	ist.setDescription("high rune");
    	ist.setEffect_armor("+25% Better Chance of Finding Magical Items");
    	ist.setEffect_helmet("+25% Better Chance of Finding Magical Items");
    	ist.setEffect_shield("+25% Better Chance of Finding Magical Items");
    	ist.setEffect_weapon("+30% Better Chance of Finding Magical Items");
    	ist.setId(24);
    	ist.setImg("ist.gif");
    	ist.setLevel(51);
    	ist.setName("Ist");
    	ist.setNext(Gul.getRune());
    	ist.setPrevious(Mal.getRune());
    }

    static public Rune getRune()
    {
        return ist;
    }
}
