/* Class397 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class397
{
    public int anInt4107;
    public static Class397 aClass397_4108;
    public static Class397 aClass397_4109;
    static Class397 aClass397_4110;
    public static Class397 aClass397_4111 = new Class397(8);
    public static Class397 aClass397_4112;
    public static Class47_Sub2 aClass47_Sub2_4113;
    
    static {
	aClass397_4108 = new Class397(16);
	aClass397_4109 = new Class397(8);
	aClass397_4112 = new Class397(16);
	aClass397_4110 = new Class397(32);
    }
    
    Class397(int i) {
	anInt4107 = -1994352651 * i;
    }
    
    static final void method6538(Class683 class683, byte i) {
	int i_0_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_0_, -695254952);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = class259.anInt2665 * -1020682347;
    }
    
    static void method6539(Class683 class683, int i) {
	class683.anIntArray8661[class683.anInt8662 * 501271953 - 2]
	    = (((Class269)
		Class249.aClass47_Sub1_2445.method76((class683.anIntArray8661
						      [(class683.anInt8662
							* 501271953) - 2]),
						     -526471387))
		   .method4969
	       (Class532.aClass111_7170,
		class683.anIntArray8661[class683.anInt8662 * 501271953 - 1],
		-1163637627)) ? 1 : 0;
	class683.anInt8662 -= 1552651121;
    }
}
