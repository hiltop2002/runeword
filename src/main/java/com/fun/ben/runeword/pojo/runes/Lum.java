package com.fun.ben.runeword.pojo.runes;

import com.fun.ben.runeword.pojo.Rune;

public class Lum {
    
    private  static Rune lum = new Rune();
    static{
        lum.setContainedRuneword(null);
        lum.setCubed_into_count(3);
        lum.setCubed_into_material("Chipped Topaz");
        lum.setDescription("mid rune");
        lum.setEffect_armor("+10 Energy");
        lum.setEffect_helmet("+10 Energy");
        lum.setEffect_shield("+10 Energys");
        lum.setEffect_weapon("+10 Energy");
        lum.setId(17);
        lum.setImg("lum.gif");
        lum.setLevel(37);
        lum.setName("Lum");
        lum.setNext(Ko.getRune());
        lum.setPrevious(Hel.getRune());
    }

    static public Rune getRune()
    {
        return Lum.lum;
    }

}
