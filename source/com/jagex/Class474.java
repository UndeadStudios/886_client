/* Class474 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class474
{
    public static Class474 aClass474_5162;
    public static Class474 aClass474_5163 = new Class474(0);
    public static Class474 aClass474_5164;
    public static Class474 aClass474_5165 = new Class474(1);
    static Class474 aClass474_5166;
    static Class474 aClass474_5167;
    public static Class474 aClass474_5168 = new Class474(2);
    static Class474 aClass474_5169;
    static Class474 aClass474_5170;
    public int anInt5171;
    
    Class474(int i) {
	anInt5171 = -475036395 * i;
    }
    
    static {
	aClass474_5162 = new Class474(3);
	aClass474_5164 = new Class474(4);
	aClass474_5167 = new Class474(5);
	aClass474_5166 = new Class474(6);
	aClass474_5169 = new Class474(7);
	aClass474_5170 = new Class474(8);
    }
    
    public static void method7755
	(float f, Class446 class446, Class429 class429, Class446 class446_0_,
	 Class446 class446_1_, Class446 class446_2_, Class446 class446_3_,
	 float f_4_, float f_5_, float f_6_, float f_7_, int i) {
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
    
    public static int method7756(byte i) {
	return Class285.aTwitchTV3143.GetChatState();
    }
    
    static final void method7757(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub45_10702
		  .method17416(1551622480);
    }
    
    static final void method7758(Class683 class683, byte i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = 0;
    }
    
    public static int method7759(int i, int i_21_, byte i_22_) {
	int i_23_ = 1;
	for (/**/; i_21_ > 1; i_21_ >>= 1) {
	    if ((i_21_ & 0x1) != 0)
		i_23_ *= i;
	    i *= i;
	}
	if (1 == i_21_)
	    return i * i_23_;
	return i_23_;
    }
    
    static final void method7760(Class683 class683, byte i) {
	class683.anInt8662 -= -1189665054;
	int i_24_ = class683.anIntArray8661[class683.anInt8662 * 501271953];
	int i_25_
	    = class683.anIntArray8661[1 + 501271953 * class683.anInt8662];
	Class631.method10317(i_24_, new Class525_Sub33(i_25_, 3), null, true,
			     -797683781);
    }
}
