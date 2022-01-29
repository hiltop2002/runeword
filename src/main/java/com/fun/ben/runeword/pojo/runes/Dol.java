package com.fun.ben.runeword.pojo.runes;

import com.fun.ben.runeword.pojo.Rune;

public class Dol {
    
    private  static Rune dol = new Rune();
    static{
        dol.setContainedRuneword(null);
        dol.setCubed_into_count(3);
        dol.setCubed_into_material("Chipped Emerald");
        dol.setDescription("mid rune");
        dol.setEffect_armor("+7 Replenish Life");
        dol.setEffect_helmet("+7 Replenish Life");
        dol.setEffect_shield("+7 Replenish Life");
        dol.setEffect_weapon("25% Chance that Hit Causes Monster to Flee");
        dol.setId(2);
        dol.setImg("dol.gif");
        dol.setLevel(31);
        dol.setNext(Hel.getRune());
        dol.setPrevious(Shael.getRune());
    }

    static public Rune getRune()
    {
        return Dol.dol;
    }

}
