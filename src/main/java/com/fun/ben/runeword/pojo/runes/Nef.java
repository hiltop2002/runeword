package com.fun.ben.runeword.pojo.runes;
import com.fun.ben.runeword.pojo.Rune;

public class Nef {
    
    public static Rune nef = new Rune();

    static
    {
        nef.setContainedRuneword(null);
        nef.setCubed_into_count(3);
        nef.setCubed_into_material(null);
        nef.setDescription("low rune");
        nef.setEffect_armor("+30 Defense vs. Missile");
        nef.setEffect_helmet("+30 Defense vs. Missile");
        nef.setEffect_shield("+30 Defense vs. Missile");
        nef.setEffect_weapon("Knockback");
        nef.setId(4);
        nef.setImg("nef.gif");
        nef.setLevel(13);
        nef.setName("Nef");
        nef.setNext(Eth.getRune());
        nef.setPrevious(Tir.getRune());
    }

    static public Rune getRune()
    {
        return nef;
    }

}
