package com.fun.ben.runeword.pojo.runes;

import com.fun.ben.runeword.pojo.Rune;

public class Hel {
    
    private  static Rune hel = new Rune();
    static{
        hel.setContainedRuneword(null);
        hel.setCubed_into_count(3);
        hel.setCubed_into_material("Chipped Diamond");
        hel.setDescription("mid rune");
        hel.setEffect_armor("-15% Requirements");
        hel.setEffect_helmet("-15% Requirements");
        hel.setEffect_shield("-15% Requirements");
        hel.setEffect_weapon("-20% Requirements");
        hel.setId(15);
        hel.setImg("hel.gif");
        hel.setLevel(0);
        hel.setNext(Hel.getRune());
        hel.setPrevious(Dol.getRune());
    }

    static public Rune getRune()
    {
        return Hel.hel;
    }

}
