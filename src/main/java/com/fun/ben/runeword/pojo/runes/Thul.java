package com.fun.ben.runeword.pojo.runes;

import com.fun.ben.runeword.pojo.Rune;

public class Thul {
    
    private  static Rune thul = new Rune();
    static{
        thul.setContainedRuneword(null);
        thul.setCubed_into_count(3);
        thul.setCubed_into_material(null);
        thul.setDescription("low rune");
        thul.setEffect_armor("+35% Cold Resistance");
        thul.setEffect_helmet("+35% Cold Resistance");
        thul.setEffect_shield("+35% Cold Resistance");
        thul.setEffect_weapon("+3-14 Cold Damage (Cold Length 3 seconds)");
        thul.setId(2);
        thul.setImg("thul.gif");
        thul.setLevel(23);
        thul.setNext(Amn.getRune());
        thul.setPrevious(Thul.getRune());
    }

    static public Rune getRune()
    {
        return Thul.thul;
    }

}
