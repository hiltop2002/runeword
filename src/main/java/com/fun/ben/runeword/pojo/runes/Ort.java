package com.fun.ben.runeword.pojo.runes;

import com.fun.ben.runeword.pojo.Rune;

public class Ort {
    
    private  static Rune ort = new Rune();
    static{
        ort.setContainedRuneword(null);
        ort.setCubed_into_count(3);
        ort.setCubed_into_material(null);
        ort.setDescription("low rune");
        ort.setEffect_armor("+35% Lightning Resistance");
        ort.setEffect_helmet("+35% Lightning Resistance");
        ort.setEffect_shield("+35% Lightning Resistance");
        ort.setEffect_weapon("+1-50 Lightning Damage");
        ort.setId(2);
        ort.setImg("ort.gif");
        ort.setLevel(21);
        ort.setNext(Thul.getRune());
        ort.setPrevious(Ral.getRune());
    }

    static public Rune getRune()
    {
        return Ort.ort;
    }

}
