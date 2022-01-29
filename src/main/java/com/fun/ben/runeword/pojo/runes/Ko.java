package com.fun.ben.runeword.pojo.runes;

import com.fun.ben.runeword.pojo.Rune;

public class Ko {
    
    private  static Rune ko = new Rune();
    static{
        ko.setContainedRuneword(null);
        ko.setCubed_into_count(3);
        ko.setCubed_into_material("Chipped Topaz");
        ko.setDescription("mid rune");
        ko.setEffect_armor("+10 Dexterity");
        ko.setEffect_helmet("+10 Dexterity");
        ko.setEffect_shield("+10 Dexterity");
        ko.setEffect_weapon("+10 Dexterity");
        ko.setId(15);
        ko.setImg("ko.gif");
        ko.setLevel(39);
        ko.setNext(Fal.getRune());
        ko.setPrevious(Lum.getRune());
    }

    static public Rune getRune()
    {
        return Ko.ko;
    }

}
