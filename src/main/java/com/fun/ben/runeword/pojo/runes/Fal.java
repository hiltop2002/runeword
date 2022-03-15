package com.fun.ben.runeword.pojo.runes;

import com.fun.ben.runeword.pojo.Rune;

public class Fal {
    
    private  static Rune fal = new Rune();
    static{
        fal.setContainedRuneword(null);
        fal.setCubed_into_count(3);
        fal.setCubed_into_material("Chipped Topaz");
        fal.setDescription("mid rune");
        fal.setEffect_armor("+10 Strength");
        fal.setEffect_helmet("+10 Strength");
        fal.setEffect_shield("+10 Strength");
        fal.setEffect_weapon("+10 Strength");
        fal.setId(19);
        fal.setImg("fal.gif");
        fal.setLevel(41);
        fal.setName("Fal");
        fal.setNext(Lem.getRune());
        fal.setPrevious(Ko.getRune());
    }

    static public Rune getRune()
    {
        return Fal.fal;
    }

}
