/* Class693 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class693
{
    public static Class693 aClass693_8749;
    public static Class693 aClass693_8750 = new Class693("LIVE", 0);
    public static Class693 aClass693_8751;
    public static Class693 aClass693_8752;
    static Class693 aClass693_8753;
    public int anInt8754;
    public String aString8755;
    
    public static Class693 method14144(int i) {
	Class693[] class693s = Class60.method1234(1169746293);
	for (int i_0_ = 0; i_0_ < class693s.length; i_0_++) {
	    Class693 class693 = class693s[i_0_];
	    if (class693.anInt8754 * -677912137 == i)
		return class693;
	}
	return null;
    }
    
    Class693(String string, int i) {
	aString8755 = string;
	anInt8754 = -1998730233 * i;
    }
    
    static {
	aClass693_8749 = new Class693("BUILDLIVE", 3);
	aClass693_8751 = new Class693("RC", 1);
	aClass693_8752 = new Class693("WIP", 2);
	aClass693_8753 = new Class693("INTBETA", 4);
    }
    
    static final void method14145(Class683 class683, short i) {
	class683.anInt8662 -= 362986067;
	if (Class453_Sub3.aClass309_Sub1_10316.method5484(-2139570207)
	    != Class298.aClass298_3275)
	    throw new RuntimeException();
	((Class704_Sub5)
	 Class453_Sub3.aClass309_Sub1_10316.method5482(1843168940))
	    .method17464
	    (class683.anIntArray8661[501271953 * class683.anInt8662],
	     class683.anIntArray8661[1 + class683.anInt8662 * 501271953],
	     class683.anIntArray8661[2 + class683.anInt8662 * 501271953],
	     (byte) -125);
    }
    
    static final void method14146(Class683 class683, byte i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class470.method7733(class259, class245, class683, (byte) 0);
    }
}
