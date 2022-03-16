package com.fun.ben.runeword.pojo.runes;

import com.fun.ben.runeword.pojo.Rune;

public class Amn{
	
	private static Rune amn = new Rune();
	
    static
    {
        amn.setContainedRuneword(null);
        amn.setCubed_into_count(3);
        amn.setCubed_into_material(null);
        amn.setDescription("mid rune");
        amn.setEffect_armor("Attacker takes 14 damage");
        amn.setEffect_helmet("Attacker takes 14 damage");
        amn.setEffect_shield("Attacker takes 14 damage");
        amn.setEffect_weapon("7% Life Stolen Per Hit");
        amn.setId(11);
        amn.setImg("amn.gif");
        amn.setLevel(25);
        amn.setName("Amn");
        amn.setNext(Sol.getRune());
        amn.setPrevious(Thul.getRune());
    }
    
    public static Rune getRune()
    {
    	return amn;
    }

}
