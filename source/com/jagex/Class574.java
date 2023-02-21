/* Class574 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class574
{
    public static Class40_Sub20 aClass40_Sub20_7645;
    
    public static void method9543
	(float f, Class446 class446, Class429 class429, Class446 class446_0_,
	 Class446 class446_1_, Class446 class446_2_, Class446 class446_3_,
	 float f_4_, float f_5_, float f_6_, float f_7_) {
	if (!class446_0_.method7218(class446)) {
	    Class446 class446_8_ = Class446.method7208(0.0F, 0.0F, 0.0F);
	    Class446 class446_9_
		= Class446.method7209(Class446.method7225(class446_0_,
							  class446));
	    class446_9_.method7239(class429);
	    Class446 class446_10_
		= Class446.method7225(class446_9_, class446_8_);
	    float f_11_ = class446_10_.method7230();
	    if (f_4_ > 0.0F) {
		class446_2_ = Class446.method7209(class446_2_);
		class446_2_.method7281(f_11_ / f_4_ * f_5_);
	    }
	    if (class446_2_.aFloat4895 == Float.POSITIVE_INFINITY
		|| Float.isNaN(class446.aFloat4895) || f_11_ > f_6_
		|| f_11_ < f_7_) {
		class446.method7216(class446_0_);
		class446_1_.method7217();
	    } else {
		class429.method6815();
		Class446 class446_12_ = Class446.method7208(1.0F, 0.0F, 0.0F);
		Class446 class446_13_ = Class446.method7208(0.0F, 1.0F, 0.0F);
		Class446 class446_14_ = Class446.method7208(0.0F, 0.0F, 1.0F);
		class446_12_.method7239(class429);
		class446_13_.method7239(class429);
		class446_14_.method7239(class429);
		Class446 class446_15_
		    = Class446.method7208(Class446.method7234(class446_12_,
							      class446_1_),
					  Class446.method7234(class446_13_,
							      class446_1_),
					  Class446.method7234(class446_14_,
							      class446_1_));
		Class446 class446_16_ = Class446.method7209(class446_15_);
		class446_16_.method7231();
		Class446 class446_17_
		    = Class446.method7236(Class446.method7233(class446_16_,
							      class446_16_),
					  Class446.method7238(class446_2_,
							      2.0F));
		Class446 class446_18_ = Class446.method7209(class446_10_);
		class446_18_.method7231();
		Class446 class446_19_ = Class446.method7209(class446_15_);
		if (class446_17_.aFloat4895 > class446_18_.aFloat4895) {
		    if (class446_10_.aFloat4895 < 0.0F) {
			class446_19_.aFloat4895 += f * class446_2_.aFloat4895;
			if (class446_19_.aFloat4895 > 0.0F)
			    class446_19_.aFloat4895 = 0.0F;
		    } else {
			class446_19_.aFloat4895 -= class446_2_.aFloat4895 * f;
			if (class446_19_.aFloat4895 < 0.0F)
			    class446_19_.aFloat4895 = 0.0F;
		    }
		} else if (class446_16_.aFloat4895 < class446_3_.aFloat4895) {
		    if (class446_10_.aFloat4895 < 0.0F) {
			class446_19_.aFloat4895 -= f * class446_2_.aFloat4895;
			if (class446_19_.aFloat4895 < -class446_3_.aFloat4895)
			    class446_19_.aFloat4895 = -class446_3_.aFloat4895;
		    } else {
			class446_19_.aFloat4895 += f * class446_2_.aFloat4895;
			if (class446_19_.aFloat4895 > class446_3_.aFloat4895)
			    class446_19_.aFloat4895 = class446_3_.aFloat4895;
		    }
		}
		if (class446_17_.aFloat4896 > class446_18_.aFloat4896) {
		    if (class446_10_.aFloat4896 < 0.0F) {
			class446_19_.aFloat4896 += class446_2_.aFloat4896 * f;
			if (class446_19_.aFloat4896 > 0.0F)
			    class446_19_.aFloat4896 = 0.0F;
		    } else {
			class446_19_.aFloat4896 -= f * class446_2_.aFloat4896;
			if (class446_19_.aFloat4896 < 0.0F)
			    class446_19_.aFloat4896 = 0.0F;
		    }
		} else if (class446_16_.aFloat4896 < class446_3_.aFloat4896) {
		    if (class446_10_.aFloat4896 < 0.0F) {
			class446_19_.aFloat4896 -= f * class446_2_.aFloat4896;
			if (class446_19_.aFloat4896 < -class446_3_.aFloat4896)
			    class446_19_.aFloat4896 = -class446_3_.aFloat4896;
		    } else {
			class446_19_.aFloat4896 += f * class446_2_.aFloat4896;
			if (class446_19_.aFloat4896 > class446_3_.aFloat4896)
			    class446_19_.aFloat4896 = class446_3_.aFloat4896;
		    }
		}
		if (class446_17_.aFloat4897 > class446_18_.aFloat4897) {
		    if (class446_10_.aFloat4897 < 0.0F) {
			class446_19_.aFloat4897 += class446_2_.aFloat4897 * f;
			if (class446_19_.aFloat4897 > 0.0F)
			    class446_19_.aFloat4897 = 0.0F;
		    } else {
			class446_19_.aFloat4897 -= class446_2_.aFloat4897 * f;
			if (class446_19_.aFloat4897 < 0.0F)
			    class446_19_.aFloat4897 = 0.0F;
		    }
		} else if (class446_16_.aFloat4897 < class446_3_.aFloat4897) {
		    if (class446_10_.aFloat4897 < 0.0F) {
			class446_19_.aFloat4897 -= f * class446_2_.aFloat4897;
			if (class446_19_.aFloat4897 < -class446_3_.aFloat4897)
			    class446_19_.aFloat4897 = -class446_3_.aFloat4897;
		    } else {
			class446_19_.aFloat4897 += f * class446_2_.aFloat4897;
			if (class446_19_.aFloat4897 > class446_3_.aFloat4897)
			    class446_19_.aFloat4897 = class446_3_.aFloat4897;
		    }
		}
		Class446 class446_20_
		    = Class446.method7238(class446_12_,
					  class446_19_.aFloat4895);
		class446_20_.method7222(class446_13_, class446_19_.aFloat4896);
		class446_20_.method7222(class446_14_, class446_19_.aFloat4897);
		class446_1_.method7242(class446_20_, 0.8F);
		class446.method7221(Class446.method7238(class446_1_, f));
		class446_16_.method7260();
		class446_19_.method7260();
		class446_18_.method7260();
	    }
	}
    }
    
    Class574() throws Throwable {
	throw new Error();
    }
    
    static final void method9544(Class683 class683, byte i) {
	int i_21_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_21_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_21_ >> 16];
	Class183.method3600(class259, class245, false, 0, class683, 961420422);
    }
    
    static final void method9545(Class683 class683, int i) {
	int i_22_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	if (client.aString11337 != null
	    && i_22_ < -218000115 * Class110.anInt1371)
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= Class699.aClass99Array8774[i_22_].aString1207;
	else
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= "";
    }
    
    static final void method9546(Class683 class683, byte i) {
	long l = Class251.method4508((byte) 8);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = (int) (l / 86400000L) - 11745;
    }
    
    static final void method9547(Class683 class683, int i) {
	int i_23_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_23_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_23_ >> 16];
	Class579.method9586(class259, class245, class683, 1532028052);
    }
}
