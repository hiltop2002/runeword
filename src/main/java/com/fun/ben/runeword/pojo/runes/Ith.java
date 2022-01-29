package com.fun.ben.runeword.pojo.runes;

import com.fun.ben.runeword.pojo.Rune;

public class Ith {
    
    public static Rune eth = new Rune();
    static{
        eth.setContainedRuneword(null);
        eth.setCubed_into_count(3);
        eth.setCubed_into_material(null);
        eth.setDescription("low rune");
        eth.setEffect_armor("15% Damage Taken Goes to Mana");
        eth.setEffect_helmet("15% Damage Taken Goes to Mana");
        eth.setEffect_shield("15% Damage Taken Goes to Mana");
        eth.setEffect_weapon("+9 to Maximum Damage");
        eth.setId(2);
        eth.setImg("eth.gif");
        eth.setLevel(15);
        eth.setNext(Tal.getRune());
        eth.setPrevious(Eth.getRune());
    }

    static public Rune getRune()
    {
        return Eld.eld;
    }

}
