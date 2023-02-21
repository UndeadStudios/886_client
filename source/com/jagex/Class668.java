/* Class668 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class668
{
    public static Class668 aClass668_8576
	= new Class668("runescape", "RuneScape", 0, Class76.aClass76_828);
    public static Class668 aClass668_8577
	= new Class668("stellardawn", "Stellar Dawn", 1, Class76.aClass76_827);
    static Class668 aClass668_8578
	= new Class668("game3", "Game 3", 2, Class76.aClass76_828);
    public String aString8579;
    static Class668 aClass668_8580;
    static Class668 aClass668_8581
	= new Class668("game4", "Game 4", 3, Class76.aClass76_832);
    static Class668 aClass668_8582;
    public String aString8583;
    public int anInt8584;
    
    public static Class668 method11027(int i) {
	Class668[] class668s = Class486.method7857((byte) 11);
	for (int i_0_ = 0; i_0_ < class668s.length; i_0_++) {
	    Class668 class668 = class668s[i_0_];
	    if (i == -1420999111 * class668.anInt8584)
		return class668;
	}
	return null;
    }
    
    static {
	aClass668_8580
	    = new Class668("game5", "Game 5", 4, Class76.aClass76_830);
	aClass668_8582 = new Class668("oldscape", "RuneScape 2007", 5,
				      Class76.aClass76_828);
    }
    
    static Class668[] method11028() {
	return (new Class668[]
		{ aClass668_8580, aClass668_8582, aClass668_8578,
		  aClass668_8576, aClass668_8577, aClass668_8581 });
    }
    
    Class668(String string, String string_1_, int i, Class76 class76) {
	aString8579 = string;
	aString8583 = string_1_;
	anInt8584 = i * -691222519;
    }
    
    static final void method11029(Class259 class259, Class245 class245,
				  Class683 class683, int i) {
	class259.aBool2690
	    = (class683.anIntArray8661
	       [(class683.anInt8662 -= 1552651121) * 501271953]) == 1;
    }
}
