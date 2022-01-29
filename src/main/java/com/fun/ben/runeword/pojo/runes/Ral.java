package com.fun.ben.runeword.pojo.runes;

import com.fun.ben.runeword.pojo.Rune;

public class Ral {
    
    private  static Rune ral = new Rune();
    static{
        ral.setContainedRuneword(null);
        ral.setCubed_into_count(3);
        ral.setCubed_into_material(null);
        ral.setDescription("low rune");
        ral.setEffect_armor("+35% Fire Resistance");
        ral.setEffect_helmet("+35% Fire Resistance");
        ral.setEffect_shield("+35% Fire Resistance");
        ral.setEffect_weapon("5-30 Fire Damage");
        ral.setId(2);
        ral.setImg("tal.gif");
        ral.setLevel(19);
        ral.setNext(Ort.getRune());
        ral.setPrevious(Tal.getRune());
    }

    static public Rune getRune()
    {
        return Ral.ral;
    }

}
