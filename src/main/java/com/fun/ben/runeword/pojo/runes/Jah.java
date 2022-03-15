package com.fun.ben.runeword.pojo.runes;

import com.fun.ben.runeword.pojo.Rune;

public class Jah {
	
	private  static Rune jah = new Rune();
    static{
    	jah.setContainedRuneword(null);
    	jah.setCubed_into_count(2);
    	jah.setCubed_into_material("Chipped Topaz");
    	jah.setDescription("high rune");
    	jah.setEffect_armor("+5% of total Hit Points");
    	jah.setEffect_helmet("+5% of total Hit Points");
    	jah.setEffect_shield("+50 Hit Points");
    	jah.setEffect_weapon("Ignores Target Defense");
    	jah.setId(31);
    	jah.setImg("jah.gif");
    	jah.setLevel(65);
    	jah.setName("Jah");
    	jah.setNext(Cham.getRune());
    	jah.setPrevious(Ber.getRune());
    }

    static public Rune getRune()
    {
        return jah;
    }

}
