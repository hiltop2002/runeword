package com.fun.ben.runeword.pojo.runes;

import com.fun.ben.runeword.pojo.Rune;

public class Mal {
	
	private  static Rune mal = new Rune();
    static{
    	mal.setContainedRuneword(null);
    	mal.setCubed_into_count(2);
    	mal.setCubed_into_material("Chipped Topaz");
    	mal.setDescription("high rune");
    	mal.setEffect_armor("Reduce Magic Damage by 7");
    	mal.setEffect_helmet("Reduce Magic Damage by 7");
    	mal.setEffect_shield("Reduce Magic Damage by 7");
    	mal.setEffect_weapon("Prevent Monster Healing");
    	mal.setId(23);
    	mal.setImg("mal.gif");
    	mal.setLevel(49);
    	mal.setName("Mal");
    	mal.setNext(Ist.getRune());
    	mal.setPrevious(Um.getRune());
    }

    static public Rune getRune()
    {
        return mal;
    }

}
