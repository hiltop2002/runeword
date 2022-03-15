package com.fun.ben.runeword.pojo.runes;

import com.fun.ben.runeword.pojo.Rune;

public class Dol extends Rune{
    
    private static Rune dol = new Rune();
    static{
        dol.setContainedRuneword(null);
        dol.setCubed_into_count(3);
        dol.setCubed_into_material("Chipped Emerald");
        dol.setDescription("mid rune");
        dol.setEffect_armor("+7 Replenish Life");
        dol.setEffect_helmet("+7 Replenish Life");
        dol.setEffect_shield("+7 Replenish Life");
        dol.setEffect_weapon("25% Chance that Hit Causes Monster to Flee");
        dol.setId(14);
        dol.setImg("dol.gif");
        dol.setLevel(31);
        dol.setName("Dol");
        dol.setNext(Hel.getRune());
        dol.setPrevious(Shael.getRune());
    }

    public static Rune getRune()
    {
    	return dol;
    	
    }

}
