package com.fun.ben.runeword.pojo.runes;

import com.fun.ben.runeword.pojo.Rune;

public class Pul {
    
    private  static Rune pul = new Rune();
    static{
        pul.setContainedRuneword(null);
        pul.setCubed_into_count(2);
        pul.setCubed_into_material("Chipped Topaz");
        pul.setDescription("high rune");
        pul.setEffect_armor("+30% Defense");
        pul.setEffect_helmet("+30% Defense");
        pul.setEffect_shield("+30% Defense");
        pul.setEffect_weapon("+75% Damage to Demons, +100 AR against Demons");
        pul.setId(21);
        pul.setImg("pul.gif");
        pul.setLevel(45);
        pul.setName("Pul");
        pul.setNext(Um.getRune());
        pul.setPrevious(Lem.getRune());
    }

    static public Rune getRune()
    {
        return Pul.pul;
    }

}
