package com.fun.ben.runeword.pojo.runes;

import com.fun.ben.runeword.pojo.Rune;

public class El extends Rune {

    public static Rune el = new Rune();
    static{
         el.setContainedRuneword(null);
         el.setCubed_into_count(3);
         el.setCubed_into_material(null);
         el.setDescription("low rune");
         el.setEffect_armor("+1 Light Radius, +15 Defense");
         el.setEffect_helmet("+1 Light Radius, +15 Defense");
         el.setEffect_shield("+1 Light Radius, +15 Defense");
         el.setEffect_weapon("+50 AR, +1 Light Radius");
         el.setId(1);
         el.setImg("el.gif");
         el.setLevel(11);
         el.setName("El");
         el.setNext(Eld.getRune());
         el.setPrevious(null);
    }

    public static Rune getRune()
    {
        return El.el;
    }
}
