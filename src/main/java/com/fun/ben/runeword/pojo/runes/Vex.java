package com.fun.ben.runeword.pojo.runes;

import com.fun.ben.runeword.pojo.Rune;

public class Vex {
	
	private  static Rune vex = new Rune();
    static{
    	vex.setContainedRuneword(null);
    	vex.setCubed_into_count(2);
    	vex.setCubed_into_material("Chipped Topaz");
    	vex.setDescription("high rune");
    	vex.setEffect_armor("+5 to Max Fire Resist");
    	vex.setEffect_helmet("+5 to Max Fire Resist");
    	vex.setEffect_shield("+5 to Max Fire Resist");
    	vex.setEffect_weapon("7% Mana Leech");
    	vex.setId(26);
    	vex.setImg("vex.gif");
    	vex.setLevel(55);
    	vex.setName("Vex");
    	vex.setNext(Ohm.getRune());
    	vex.setPrevious(Gul.getRune());
    }

    static public Rune getRune()
    {
        return vex;
    }

}
