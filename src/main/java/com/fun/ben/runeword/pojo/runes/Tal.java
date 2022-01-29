package com.fun.ben.runeword.pojo.runes;

import com.fun.ben.runeword.pojo.Rune;

public class Tal {
    
    private  static Rune tal = new Rune();
    static{
        tal.setContainedRuneword(null);
        tal.setCubed_into_count(3);
        tal.setCubed_into_material(null);
        tal.setDescription("low rune");
        tal.setEffect_armor("+35% Poison Resistance");
        tal.setEffect_helmet("+35% Poison Resistance");
        tal.setEffect_shield("+35% Poison Resistance");
        tal.setEffect_weapon("75 Poison damage over 5 seconds");
        tal.setId(2);
        tal.setImg("tal.gif");
        tal.setLevel(17);
        tal.setNext(Ral.getRune());
        tal.setPrevious(Ith.getRune());
    }

    static public Rune getRune()
    {
        return Tal.tal;
    }

}
