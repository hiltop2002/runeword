package com.fun.ben.runeword.pojo.runes;

import com.fun.ben.runeword.pojo.Rune;

public class Lem {
    
    private  static Rune lem = new Rune();
    static{
        lem.setContainedRuneword(null);
        lem.setCubed_into_count(3);
        lem.setCubed_into_material("Chipped Topaz");
        lem.setDescription("mid rune");
        lem.setEffect_armor("+50% Extra Gold from Monsters");
        lem.setEffect_helmet("+50% Extra Gold from Monsters");
        lem.setEffect_shield("+50% Extra Gold from Monsters");
        lem.setEffect_weapon("+75% Extra Gold from Monsters");
        lem.setId(15);
        lem.setImg("lem.gif");
        lem.setLevel(43);
        lem.setNext(Pul.getRune());
        lem.setPrevious(Fal.getRune());
    }

    static public Rune getRune()
    {
        return Lem.lem;
    }

}
