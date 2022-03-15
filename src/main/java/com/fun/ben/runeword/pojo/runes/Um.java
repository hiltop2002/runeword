package com.fun.ben.runeword.pojo.runes;

import com.fun.ben.runeword.pojo.Rune;

public class Um {
    
    private  static Rune um = new Rune();
    static{
        um.setContainedRuneword(null);
        um.setCubed_into_count(2);
        um.setCubed_into_material("Chipped Topaz");
        um.setDescription("high rune");
        um.setEffect_armor("+15% Resist All");
        um.setEffect_helmet("+15% Resist All");
        um.setEffect_shield("+22% Resist All");
        um.setEffect_weapon("25% Chance of Open Wounds");
        um.setId(22);
        um.setImg("um.gif");
        um.setLevel(49);
        um.setName("Um");
        um.setNext(Mal.getRune());
        um.setPrevious(Pul.getRune());
    }

    static public Rune getRune()
    {
        return Um.um;
    }

}
