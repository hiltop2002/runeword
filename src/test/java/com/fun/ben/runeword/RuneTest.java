package com.fun.ben.runeword;

import com.fun.ben.runeword.pojo.Rune;
import com.fun.ben.runeword.pojo.runes.Amn;
import com.fun.ben.runeword.pojo.runes.El;

public class RuneTest {
	
	public static void main(String[] args)
	{
		Rune newguy = El.getRune();
		
		
		while(newguy!=null)
		{
			System.out.println(newguy.display());
			System.out.println("-");
			newguy = newguy.getNext();
		}
	}

}
