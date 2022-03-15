package com.fun.ben.runeword.pojo.runes;

import com.fun.ben.runeword.pojo.Rune;

public class Io {
    
    private  static Rune io = new Rune();
    static{
        io.setContainedRuneword(null);
        io.setCubed_into_count(3);
        io.setCubed_into_material("Chipped Topaz");
        io.setDescription("mid rune");
        io.setEffect_armor("+10 Vitality");
        io.setEffect_helmet("+10 Vitality");
        io.setEffect_shield("+10 Vitality");
        io.setEffect_weapon("+10 Vitality");
        io.setId(16);
        io.setImg("io.gif");
        io.setLevel(35);
        io.setName("Io");
        io.setNext(Lum.getRune());
        io.setPrevious(Hel.getRune());
    }

    static public Rune getRune()
    {
        return Io.io;
    }

}
