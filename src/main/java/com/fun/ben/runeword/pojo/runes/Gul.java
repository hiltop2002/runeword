package com.fun.ben.runeword.pojo.runes;

import com.fun.ben.runeword.pojo.Rune;

public class Gul {
	
	private  static Rune gul = new Rune();
    static{
    	gul.setContainedRuneword(null);
    	gul.setCubed_into_count(2);
    	gul.setCubed_into_material("Chipped Topaz");
    	gul.setDescription("high rune");
    	gul.setEffect_armor("+5 to Max Resist Poison");
    	gul.setEffect_helmet("+5 to Max Resist Poison");
    	gul.setEffect_shield("+5 to Max Resist Poison");
    	gul.setEffect_weapon("+20% AR");
    	gul.setId(25);
    	gul.setImg("gul.gif");
    	gul.setLevel(53);
    	gul.setName("Gul");
    	gul.setNext(Vex.getRune());
    	gul.setPrevious(Ist.getRune());
    }

    static public Rune getRune()
    {
        return gul;
    }

}
