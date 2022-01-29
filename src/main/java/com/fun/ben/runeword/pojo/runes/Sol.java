package com.fun.ben.runeword.pojo.runes;

import com.fun.ben.runeword.pojo.Rune;

public class Sol {
    
    private  static Rune sol = new Rune();
    static{
        sol.setContainedRuneword(null);
        sol.setCubed_into_count(3);
        sol.setCubed_into_material(null);
        sol.setDescription("mid rune");
        sol.setEffect_armor("-7 Damage Taken");
        sol.setEffect_helmet("-7 Damage Taken");
        sol.setEffect_shield("-7 Damage Taken");
        sol.setEffect_weapon("+9 to Minimum Damage");
        sol.setId(2);
        sol.setImg("sol.gif");
        sol.setLevel(27);
        sol.setNext(Shael.getRune());
        sol.setPrevious(Amn.getRune());
    }

    static public Rune getRune()
    {
        return Sol.sol;
    }

}
