package com.fun.ben.runeword.pojo.runes;

import com.fun.ben.runeword.pojo.Rune;

public class Tir {
    
    public static Rune tir = new Rune();
    static{
        tir.setContainedRuneword(null);
        tir.setCubed_into_count(3);
        tir.setCubed_into_material(null);
        tir.setDescription("low rune");
        tir.setEffect_armor("+2 Mana Per Kill");
        tir.setEffect_helmet("+2 Mana Per Kill");
        tir.setEffect_shield("+2 Mana Per Kill");
        tir.setEffect_weapon("+2 Mana Per Kill");
        tir.setId(3);
        tir.setImg("tir.gif");
        tir.setLevel(13);
        tir.setName("Tir");
        tir.setNext(Nef.getRune());
        tir.setPrevious(Eld.getRune());
    }

    static public Rune getRune()
    {
        return Tir.tir;
    }

}
