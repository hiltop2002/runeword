package com.fun.ben.runeword.pojo.runes;

import com.fun.ben.runeword.pojo.Rune;

public class Eth {
    
    public static Rune eth = new Rune();
    static{
        eth.setContainedRuneword(null);
        eth.setCubed_into_count(3);
        eth.setCubed_into_material(null);
        eth.setDescription("low rune");
        eth.setEffect_armor("-25% Target Defense");
        eth.setEffect_helmet("Regenerate Mana 15%");
        eth.setEffect_shield("Regenerate Mana 15%");
        eth.setEffect_weapon("Regenerate Mana 15%");
        eth.setId(2);
        eth.setImg("eth.gif");
        eth.setLevel(15);
        eth.setNext(Ith.getRune());
        eth.setPrevious(Nef.getRune());
    }

    static public Rune getRune()
    {
        return Eld.eld;
    }

}
