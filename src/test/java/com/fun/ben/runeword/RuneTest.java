package com.fun.ben.runeword;

import com.fun.ben.runeword.pojo.Rune;
import com.fun.ben.runeword.pojo.runes.Amn;
import com.fun.ben.runeword.pojo.runes.El;
import com.fun.ben.runeword.pojo.runes.Zod;

public class RuneTest {
	
	public static void main(String[] args)
	{
		Rune newguy = Zod.getRune();
		
		
		while(newguy!=null)
		{
			System.out.println(newguy.display());
			System.out.println("-");
			newguy = newguy.getPrevious();
		}
	}

}
