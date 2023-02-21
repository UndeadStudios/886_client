/* Class588 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class588
{
    public static void method9694
	(float f, Class446 class446, Class446 class446_0_,
	 Class446 class446_1_, Class446 class446_2_, Class446 class446_3_,
	 float f_4_, float f_5_, float f_6_, float f_7_) {
	if (!class446_0_.method7218(class446)) {
	    Class446 class446_8_ = Class446.method7225(class446_0_, class446);
	    float f_9_ = class446_8_.method7230();
	    if (f_4_ > 0.0F) {
		class446_2_ = Class446.method7209(class446_2_);
		class446_2_.method7281(f_5_ * (f_9_ / f_4_));
	    }
	    if (class446_2_.aFloat4895 == Float.POSITIVE_INFINITY
		|| Float.isNaN(class446.aFloat4895) || f_9_ > f_6_) {
		class446.method7216(class446_0_);
		class446_1_.method7217();
	    } else {
		Class446 class446_10_ = Class446.method7209(class446_1_);
		class446_10_.method7231();
		Class446 class446_11_
		    = Class446.method7236(class446_10_, class446_2_);
		Class446 class446_12_
		    = Class446.method7233(class446_10_, class446_11_);
		class446_12_.method7281(0.5F);
		Class446 class446_13_ = Class446.method7209(class446_1_);
		Class446 class446_14_ = Class446.method7209(class446_8_);
		class446_14_.method7231();
		if (class446_12_.aFloat4895 > class446_14_.aFloat4895) {
		    if (class446_8_.aFloat4895 < 0.0F) {
			class446_13_.aFloat4895 += f * class446_2_.aFloat4895;
			if (class446_13_.aFloat4895 > 0.0F)
			    class446_13_.aFloat4895 = 0.0F;
		    } else {
			class446_13_.aFloat4895 -= f * class446_2_.aFloat4895;
			if (class446_13_.aFloat4895 < 0.0F)
			    class446_13_.aFloat4895 = 0.0F;
		    }
		} else if (class446_10_.aFloat4895 < class446_3_.aFloat4895) {
		    if (class446_8_.aFloat4895 < 0.0F) {
			class446_13_.aFloat4895 -= f * class446_2_.aFloat4895;
			if (class446_13_.aFloat4895 < -class446_3_.aFloat4895)
			    class446_13_.aFloat4895 = -class446_3_.aFloat4895;
		    } else {
			class446_13_.aFloat4895 += f * class446_2_.aFloat4895;
			if (class446_13_.aFloat4895 > class446_3_.aFloat4895)
			    class446_13_.aFloat4895 = class446_3_.aFloat4895;
		    }
		}
		if (class446_12_.aFloat4896 > class446_14_.aFloat4896) {
		    if (class446_8_.aFloat4896 < 0.0F) {
			class446_13_.aFloat4896 += class446_2_.aFloat4896 * f;
			if (class446_13_.aFloat4896 > 0.0F)
			    class446_13_.aFloat4896 = 0.0F;
		    } else {
			class446_13_.aFloat4896 -= class446_2_.aFloat4896 * f;
			if (class446_13_.aFloat4896 < 0.0F)
			    class446_13_.aFloat4896 = 0.0F;
		    }
		} else if (class446_10_.aFloat4896 < class446_3_.aFloat4896) {
		    if (class446_8_.aFloat4896 < 0.0F) {
			class446_13_.aFloat4896 -= f * class446_2_.aFloat4896;
			if (class446_13_.aFloat4896 < -class446_3_.aFloat4896)
			    class446_13_.aFloat4896 = -class446_3_.aFloat4896;
		    } else {
			class446_13_.aFloat4896 += class446_2_.aFloat4896 * f;
			if (class446_13_.aFloat4896 > class446_3_.aFloat4896)
			    class446_13_.aFloat4896 = class446_3_.aFloat4896;
		    }
		}
		if (class446_12_.aFloat4897 > class446_14_.aFloat4897) {
		    if (class446_8_.aFloat4897 < 0.0F) {
			class446_13_.aFloat4897 += class446_2_.aFloat4897 * f;
			if (class446_13_.aFloat4897 > 0.0F)
			    class446_13_.aFloat4897 = 0.0F;
		    } else {
			class446_13_.aFloat4897 -= f * class446_2_.aFloat4897;
			if (class446_13_.aFloat4897 < 0.0F)
			    class446_13_.aFloat4897 = 0.0F;
		    }
		} else if (class446_10_.aFloat4897 < class446_3_.aFloat4897) {
		    if (class446_8_.aFloat4897 < 0.0F) {
			class446_13_.aFloat4897 -= f * class446_2_.aFloat4897;
			if (class446_13_.aFloat4897 < -class446_3_.aFloat4897)
			    class446_13_.aFloat4897 = -class446_3_.aFloat4897;
		    } else {
			class446_13_.aFloat4897 += class446_2_.aFloat4897 * f;
			if (class446_13_.aFloat4897 > class446_3_.aFloat4897)
			    class446_13_.aFloat4897 = class446_3_.aFloat4897;
		    }
		}
		class446_1_.method7242(class446_13_, 0.8F);
		if (f_9_ < f_7_ && class446_1_.method7230() < f_7_) {
		    class446.method7216(class446_0_);
		    class446_1_.method7217();
		} else
		    class446.method7221(Class446.method7238(class446_1_, f));
		class446_10_.method7260();
		class446_13_.method7260();
		class446_14_.method7260();
	    }
	}
    }
    
    Class588() throws Throwable {
	throw new Error();
    }
    
    static void method9695(Class683 class683, int i) {
	class683.anIntArray8661[501271953 * class683.anInt8662 - 2]
	    = (((Class269)
		Class249.aClass47_Sub1_2445.method76((class683.anIntArray8661
						      [(class683.anInt8662
							* 501271953) - 2]),
						     635290713))
	       .anIntArrayArray2839
	       [class683.anIntArray8661[class683.anInt8662 * 501271953 - 1]]
	       [0]);
	class683.anInt8662 -= 1552651121;
    }
    
    static final void method9696(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class696_Sub38.method17316(class259, class245, class683, -2094793875);
    }
}
