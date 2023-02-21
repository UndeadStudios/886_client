/* Class486 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class486
{
    public int anInt5234;
    byte aByte5235;
    public int anInt5236;
    public int anInt5237;
    public int anInt5238;
    public int anInt5239;
    public static Class40 aClass40_5240;
    
    static Class9 method7844(RSBuffer class525_sub38,
							 Class106_Sub1 class106_sub1) {
	Class9 class9 = new Class9(class106_sub1);
	for (;;) {
	    int i = class525_sub38.readUnsignedByte(1444034519);
	    if (255 == i)
		break;
	    Class480 class480
		= (Class480) Class239.method4424(com.jagex.Class480.class, i,
						 (byte) -68);
	    for (;;) {
		int i_0_ = class525_sub38.readUnsignedByte(410949163);
		if (255 == i_0_)
		    break;
		class525_sub38.pos -= 339428471;
		Class447 class447
		    = class106_sub1.method14522(class525_sub38, class480,
						1005577089);
		if (class447 != null)
		    class9.method18(class447.anInt4898 * -316828413,
				    class447.anObject4899, (byte) -46);
	    }
	}
	return class9;
    }
    
    public Class486(RSBuffer class525_sub38,
					Class106_Sub1 class106_sub1) {
	aByte5235 = class525_sub38.readByte(-1150098071);
	anInt5238 = class525_sub38.readUnsignedShort((byte) 92) * -2051903829;
	anInt5234 = class525_sub38.readInt(1586145952) * 1183526859;
	anInt5237 = class525_sub38.readInt(1551586138) * 582266005;
	anInt5239 = class525_sub38.readInt(2040479981) * 1787843863;
	anInt5236 = class525_sub38.readInt(1326543498) * 1150195353;
	if (null != class106_sub1)
	    Class410.method6663(class525_sub38, class106_sub1, -183063052);
    }
    
    public int method7845(int i) {
	return aByte5235 & 0x7;
    }
    
    public int method7846(byte i) {
	return (aByte5235 & 0x8) == 8 ? 1 : 0;
    }
    
    static Class9 method7847(RSBuffer class525_sub38,
							 Class106_Sub1 class106_sub1) {
	Class9 class9 = new Class9(class106_sub1);
	for (;;) {
	    int i = class525_sub38.readUnsignedByte(1507180015);
	    if (255 == i)
		break;
	    Class480 class480
		= (Class480) Class239.method4424(com.jagex.Class480.class, i,
						 (byte) -7);
	    for (;;) {
		int i_1_ = class525_sub38.readUnsignedByte(1452032226);
		if (255 == i_1_)
		    break;
		class525_sub38.pos -= 339428471;
		Class447 class447
		    = class106_sub1.method14522(class525_sub38, class480,
						1005577089);
		if (class447 != null)
		    class9.method18(class447.anInt4898 * -316828413,
				    class447.anObject4899, (byte) -97);
	    }
	}
	return class9;
    }
    
    public int method7848() {
	return aByte5235 & 0x7;
    }
    
    public Class486() {
	/* empty */
    }
    
    public int method7849() {
	return (aByte5235 & 0x8) == 8 ? 1 : 0;
    }
    
    static void method7850(Class683 class683, int i) {
	class683.anObjectArray8636
	    [(class683.anInt8644 += 1285561025) * 1373599041 - 1]
	    = ((Class269)
	       Class249.aClass47_Sub1_2445.method76((class683.anIntArray8661
						     [((class683.anInt8662
							-= 1552651121)
						       * 501271953)]),
						    -333673875)).aString2820;
    }
    
    static final void method7851(Class259 class259, Class245 class245,
				 Class683 class683, int i) {
	class259.anInt2768
	    = (class683.anIntArray8661
	       [(class683.anInt8662 -= 1552651121) * 501271953]) * -747933499;
    }
    
    static final void method7852(Class683 class683, int i) {
	String string
	    = (String) (class683.anObjectArray8636
			[(class683.anInt8644 -= 1285561025) * 1373599041]);
	StringBuilder stringbuilder = new StringBuilder(string.length());
	boolean bool = false;
	for (int i_2_ = 0; i_2_ < string.length(); i_2_++) {
	    char c = string.charAt(i_2_);
	    if (c == '<')
		bool = true;
	    else if ('>' == c)
		bool = false;
	    else if (!bool)
		stringbuilder.append(c);
	}
	class683.anObjectArray8636
	    [(class683.anInt8644 += 1285561025) * 1373599041 - 1]
	    = stringbuilder.toString();
    }
    
    static final void method7853(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub28_10720
		  .method17232(-1939177198);
    }
    
    public static boolean method7854(char c, int i) {
	if (c >= ' ' && c <= '~')
	    return true;
	if (c >= '\u00a0' && c <= '\u00ff')
	    return true;
	if (c == '\u20ac' || '\u0152' == c || c == '\u2014' || c == '\u0153'
	    || '\u0178' == c)
	    return true;
	return false;
    }
    
    static final void method7855(Class683 class683, int i) {
	Class591.method9795(-1721680832);
	Class61.aBool645 = false;
    }
    
    static final void method7856(int i) {
	client.anInt11280 = 1550521413;
	client.anInt11145 = -356132065;
	Class569.aClass525_Sub38_7628 = null;
	Class555.method9241(-2007319410);
    }
    
    static Class668[] method7857(byte i) {
	return (new Class668[]
		{ Class668.aClass668_8580, Class668.aClass668_8582,
		  Class668.aClass668_8578, Class668.aClass668_8576,
		  Class668.aClass668_8577, Class668.aClass668_8581 });
    }
}
