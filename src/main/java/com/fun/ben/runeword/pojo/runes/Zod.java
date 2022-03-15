package com.fun.ben.runeword.pojo.runes;

import com.fun.ben.runeword.pojo.Rune;

public class Zod {
	
	private  static Rune zod = new Rune();
    static{
    	zod.setContainedRuneword(null);
    	zod.setCubed_into_count(0);
    	zod.setCubed_into_material(null);
    	zod.setDescription("high rune");
    	zod.setEffect_armor("Indestructible");
    	zod.setEffect_helmet("Indestructible");
    	zod.setEffect_shield("Indestructible");
    	zod.setEffect_weapon("Indestructible");
    	zod.setId(33);
    	zod.setImg("zod.gif");
    	zod.setLevel(69);
    	zod.setName("zod");
    	zod.setNext(null);
    	zod.setPrevious(Cham.getRune());
    }

    static public Rune getRune()
    {
        return zod;
    }

}
