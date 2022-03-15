package com.fun.ben.runeword.pojo.runes;

import com.fun.ben.runeword.pojo.Rune;

public class Ith {
    
    public static Rune ith = new Rune();
    static{
    	ith.setContainedRuneword(null);
    	ith.setCubed_into_count(3);
    	ith.setCubed_into_material(null);
    	ith.setDescription("low rune");
    	ith.setEffect_armor("15% Damage Taken Goes to Mana");
    	ith.setEffect_helmet("15% Damage Taken Goes to Mana");
    	ith.setEffect_shield("15% Damage Taken Goes to Mana");
    	ith.setEffect_weapon("+9 to Maximum Damage");
    	ith.setId(6);
    	ith.setImg("eth.gif");
    	ith.setLevel(15);
        ith.setName("Ith");
    	ith.setNext(Tal.getRune());
    	ith.setPrevious(Eth.getRune());
    }

    static public Rune getRune()
    {
        return ith;
    }

}
