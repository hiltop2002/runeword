package com.fun.ben.runeword.pojo.runes;

import com.fun.ben.runeword.pojo.Rune;

public class Shael {
    
    private  static Rune shael = new Rune();
    static{
        shael.setContainedRuneword(null);
        shael.setCubed_into_count(3);
        shael.setCubed_into_material("Chipped Ruby");
        shael.setDescription("mid rune");
        shael.setEffect_armor("Faster Hit Recovery (+20)");
        shael.setEffect_helmet("Faster Hit Recovery (+20)");
        shael.setEffect_shield("Faster Block Rate (+20)");
        shael.setEffect_weapon("Faster Attack Rate (+20)");
        shael.setId(2);
        shael.setImg("shael.gif");
        shael.setLevel(29);
        shael.setNext(Dol.getRune());
        shael.setPrevious(Sol.getRune());
    }

    static public Rune getRune()
    {
        return Shael.shael;
    }

}
