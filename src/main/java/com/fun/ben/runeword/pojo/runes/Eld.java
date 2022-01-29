package com.fun.ben.runeword.pojo.runes;

import com.fun.ben.runeword.pojo.Rune;

public class Eld extends Rune {

    public static Rune eld = new Rune();
    static{
         eld.setContainedRuneword(null);
         eld.setCubed_into_count(3);
         eld.setCubed_into_material(null);
         eld.setDescription("low rune");
         eld.setEffect_armor("Lowers Stamina drain by 15%");
         eld.setEffect_helmet("Lowers Stamina drain by 15%");
         eld.setEffect_shield("+7% Blocking");
         eld.setEffect_weapon("+75% Damage vs. Undead, +50 Attack Rating vs. Undead");
         eld.setId(2);
         eld.setImg("eld.gif");
         eld.setLevel(11);
         eld.setName("Eld");
         eld.setNext(Tir.getRune());
         eld.setPrevious(El.getRune());
    }

    static public Rune getRune()
    {
        return Eld.eld;
    }
}
