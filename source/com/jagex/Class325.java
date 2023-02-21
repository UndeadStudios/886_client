/* Class325 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class325
{
    static final int anInt3552 = 6;
    static int[] anIntArray3553 = new int[512];
    static final int anInt3554 = 2;
    static final int anInt3555 = 2048;
    static final int anInt3556 = 11;
    static int anInt3557;
    
    static {
	int i = 9;
	for (int i_0_ = i - 1; i_0_ >= 0; i_0_--) {
	    int i_1_ = 1 << i - i_0_ - 1;
	    int i_2_ = 1 << i - i_0_;
	    for (int i_3_ = i_1_; i_3_ < i_2_; i_3_++)
		anIntArray3553[i_3_]
		    = (i_0_ << 6) + (i_2_ - i_3_ << 6 >>> i - i_0_ - 1);
	}
    }
    
    static final void method5739(Class683 class683, int i) {
	class683.anInt8662 -= -1189665054;
	int i_4_ = class683.anIntArray8661[class683.anInt8662 * 501271953];
	int i_5_ = class683.anIntArray8661[501271953 * class683.anInt8662 + 1];
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = i_4_ > i_5_ ? i_4_ : i_5_;
    }
    
    public static Class515 method5740(int i, int i_6_, int i_7_, int i_8_,
				      Interface13 interface13,
				      Interface13 interface13_9_, int i_10_) {
	Class516[] class516s = null;
	Class570 class570 = (Class570) interface13.method76(i, 472923134);
	if (class570.anIntArray7632 != null) {
	    class516s = new Class516[class570.anIntArray7632.length];
	    for (int i_11_ = 0; i_11_ < class516s.length; i_11_++) {
		Class301 class301
		    = ((Class301)
		       interface13_9_.method76(class570.anIntArray7632[i_11_],
					       -1031909937));
		class516s[i_11_]
		    = new Class516(1365067015 * class301.anInt3365,
				   -656593719 * class301.anInt3371,
				   -1431780545 * class301.anInt3370,
				   class301.anInt3364 * -1962950279,
				   class301.anInt3368 * 1527047925,
				   class301.anInt3367 * 1039613203,
				   class301.anInt3374 * 1047375391,
				   class301.aBool3369,
				   class301.anInt3372 * -1084072075,
				   class301.anInt3373 * 534734717,
				   -241571799 * class301.anInt3366);
	    }
	}
	return new Class515(class570.anInt7629 * 1655762147, class516s,
			    class570.anInt7630 * -1742279951, i_6_, i_7_, i_8_,
			    class570.aClass590_7631,
			    class570.anInt7633 * -424004791);
    }
}
