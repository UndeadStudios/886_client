/* Class289 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class289
{
    public static Class289 aClass289_3202;
    static Class289 aClass289_3203;
    public static Class289 aClass289_3204 = new Class289(0, false);
    static Class289 aClass289_3205;
    static Class289 aClass289_3206;
    public int anInt3207;
    boolean aBool3208;
    static int anInt3209;
    
    public static Class289 method5264(int i) {
	if (1668502049 * aClass289_3204.anInt3207 == i)
	    return aClass289_3204;
	if (i == aClass289_3202.anInt3207 * 1668502049)
	    return aClass289_3202;
	if (aClass289_3203.anInt3207 * 1668502049 == i)
	    return aClass289_3203;
	if (1668502049 * aClass289_3205.anInt3207 == i)
	    return aClass289_3205;
	if (aClass289_3206.anInt3207 * 1668502049 == i)
	    return aClass289_3206;
	return null;
    }
    
    public boolean method5265(byte i) {
	return aBool3208;
    }
    
    static {
	aClass289_3202 = new Class289(1, false);
	aClass289_3203 = new Class289(2, true);
	aClass289_3205 = new Class289(3, true);
	aClass289_3206 = new Class289(4, true);
    }
    
    public static Class289 method5266(int i) {
	if (1668502049 * aClass289_3204.anInt3207 == i)
	    return aClass289_3204;
	if (i == aClass289_3202.anInt3207 * 1668502049)
	    return aClass289_3202;
	if (aClass289_3203.anInt3207 * 1668502049 == i)
	    return aClass289_3203;
	if (1668502049 * aClass289_3205.anInt3207 == i)
	    return aClass289_3205;
	if (aClass289_3206.anInt3207 * 1668502049 == i)
	    return aClass289_3206;
	return null;
    }
    
    Class289(int i, boolean bool) {
	anInt3207 = 1482469857 * i;
	aBool3208 = bool;
    }
    
    static final void method5267(Class259 class259, Class245 class245,
				 Class683 class683, int i) {
	String string
	    = (String) (class683.anObjectArray8636
			[(class683.anInt8644 -= 1285561025) * 1373599041]);
	if (Class558.method9375(string, class683, (byte) 3) != null)
	    string = string.substring(0, string.length() - 1);
	class259.anObjectArray2730
	    = Class656_Sub1_Sub5_Sub1.method18727(string, class683,
						  -1092485169);
	class259.aBool2695 = true;
    }
    
    static final void method5268(Class683 class683, byte i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub26_10682
		  .method17219((byte) 2);
    }
}
