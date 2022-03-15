package com.fun.ben.runeword.pojo.runes;

import com.fun.ben.runeword.pojo.Rune;

public class Ohm {
	
	private  static Rune ohm = new Rune();
    static{
    	ohm.setContainedRuneword(null);
    	ohm.setCubed_into_count(2);
    	ohm.setCubed_into_material("Chipped Topaz");
    	ohm.setDescription("high rune");
    	ohm.setEffect_armor("+5 to Max. Resist Cold");
    	ohm.setEffect_helmet("+5 to Max. Resist Cold");
    	ohm.setEffect_shield("+5 to Max. Resist Cold");
    	ohm.setEffect_weapon("+50% Damage");
    	ohm.setId(27);
    	ohm.setImg("ohm.gif");
    	ohm.setLevel(57);
    	ohm.setName("Ohm");
    	ohm.setNext(Lo.getRune());
    	ohm.setPrevious(Vex.getRune());
    }

    static public Rune getRune()
    {
        return ohm;
    }

}
