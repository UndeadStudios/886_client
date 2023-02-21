/* Class203 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Container;

class Class203 implements Interface57
{
    Class217 this$0;
    static Class458 aClass458_2223;
    
    public void method359(Object object, float[] fs, Object[] objects) {
	Class488 class488 = (Class488) object;
	Class446 class446 = class488.method7931(65280);
	float f = class488.method7919((byte) 17);
	float f_0_ = class488.method7924(2072151430);
	Class446 class446_1_
	    = Class446.method7225(class446, this$0.method4030(2062441853));
	float f_2_ = 0.0F;
	float f_3_ = class446_1_.method7230();
	if (f_3_ >= f_0_)
	    f_2_ = 0.0F;
	if (f_3_ <= f)
	    f_2_ = 1.0F;
	else {
	    float f_4_ = 1.0F - (f_3_ - f) * (1.0F / (f_0_ - f));
	    if ((double) f_4_ < 0.0 || (double) f_4_ > 1.0)
		f_4_ = Math.min(Math.max(f_4_, 0.0F), 1.0F);
	    f_2_ = f_4_;
	}
	int i = 8192;
	float f_5_ = 0.0F;
	if (5 == Class700.anInt8779 * -174799205) {
	    float f_6_
		= Class453_Sub3.aClass309_Sub1_10316.method5491((byte) 0);
	    if (0.0F != class446_1_.aFloat4895
		|| class446_1_.aFloat4897 != 0.0F) {
		int i_7_
		    = (((int) (2607.5945876176133 * (double) (-1.0F * f_6_))
			- (int) (Math.atan2((double) class446_1_.aFloat4895,
					    (double) class446_1_.aFloat4897)
				 * 2607.5945876176133)
			- 4096)
		       & 0x3fff);
		if (i_7_ > 8192)
		    i_7_ = 16384 - i_7_;
		int i_8_;
		if (f_3_ <= 0.0F)
		    i_8_ = 8192;
		else if (f_3_ >= 4096.0F)
		    i_8_ = 16384;
		else
		    i_8_ = (int) (8192.0F + 8192.0F * f_3_ / 4096.0F);
		i = i_7_ * i_8_ / 8192 + (16384 - i_8_ >> 1);
	    }
	    f_5_ = (float) i * 6.1035156E-5F;
	} else {
	    if (0.0F != class446_1_.aFloat4895
		|| class446_1_.aFloat4897 != 0.0F) {
		int i_9_
		    = ((-(-684522141 * Class64.anInt695)
			- (int) (Math.atan2((double) class446_1_.aFloat4895,
					    (double) class446_1_.aFloat4897)
				 * 2607.5945876176133)
			- 4096)
		       & 0x3fff);
		if (i_9_ > 8192)
		    i_9_ = 16384 - i_9_;
		int i_10_;
		if (f_3_ <= 0.0F)
		    i_10_ = 8192;
		else if (f_3_ >= 4096.0F)
		    i_10_ = 16384;
		else
		    i_10_ = (int) (8192.0F + 8192.0F * f_3_ / 4096.0F);
		i = i_9_ * i_10_ / 8192 + (16384 - i_10_ >> 1);
	    }
	    f_5_ = 6.1035156E-5F * (float) i;
	}
	fs[0] = (float) (i < 0 ? (double) f_2_
			 : (double) f_2_ * Math.sqrt((double) ((1.0F - f_5_)
							       * 2.0F)));
	fs[1] = (float) (i < 0 ? (double) -f_2_
			 : (double) f_2_ * Math.sqrt((double) (2.0F * f_5_)));
    }
    
    Class203(Class217 class217) {
	this$0 = class217;
    }
    
    public void method357(Object object, float[] fs, Object[] objects, int i) {
	Class488 class488 = (Class488) object;
	Class446 class446 = class488.method7931(65280);
	float f = class488.method7919((byte) -58);
	float f_11_ = class488.method7924(519479642);
	Class446 class446_12_
	    = Class446.method7225(class446, this$0.method4030(420233256));
	float f_13_ = 0.0F;
	float f_14_ = class446_12_.method7230();
	if (f_14_ >= f_11_)
	    f_13_ = 0.0F;
	if (f_14_ <= f)
	    f_13_ = 1.0F;
	else {
	    float f_15_ = 1.0F - (f_14_ - f) * (1.0F / (f_11_ - f));
	    if ((double) f_15_ < 0.0 || (double) f_15_ > 1.0)
		f_15_ = Math.min(Math.max(f_15_, 0.0F), 1.0F);
	    f_13_ = f_15_;
	}
	int i_16_ = 8192;
	float f_17_ = 0.0F;
	if (5 == Class700.anInt8779 * -174799205) {
	    float f_18_
		= Class453_Sub3.aClass309_Sub1_10316.method5491((byte) 0);
	    if (0.0F != class446_12_.aFloat4895
		|| class446_12_.aFloat4897 != 0.0F) {
		int i_19_
		    = (((int) (2607.5945876176133 * (double) (-1.0F * f_18_))
			- (int) (Math.atan2((double) class446_12_.aFloat4895,
					    (double) class446_12_.aFloat4897)
				 * 2607.5945876176133)
			- 4096)
		       & 0x3fff);
		if (i_19_ > 8192)
		    i_19_ = 16384 - i_19_;
		int i_20_;
		if (f_14_ <= 0.0F)
		    i_20_ = 8192;
		else if (f_14_ >= 4096.0F)
		    i_20_ = 16384;
		else
		    i_20_ = (int) (8192.0F + 8192.0F * f_14_ / 4096.0F);
		i_16_ = i_19_ * i_20_ / 8192 + (16384 - i_20_ >> 1);
	    }
	    f_17_ = (float) i_16_ * 6.1035156E-5F;
	} else {
	    if (0.0F != class446_12_.aFloat4895
		|| class446_12_.aFloat4897 != 0.0F) {
		int i_21_
		    = ((-(-684522141 * Class64.anInt695)
			- (int) (Math.atan2((double) class446_12_.aFloat4895,
					    (double) class446_12_.aFloat4897)
				 * 2607.5945876176133)
			- 4096)
		       & 0x3fff);
		if (i_21_ > 8192)
		    i_21_ = 16384 - i_21_;
		int i_22_;
		if (f_14_ <= 0.0F)
		    i_22_ = 8192;
		else if (f_14_ >= 4096.0F)
		    i_22_ = 16384;
		else
		    i_22_ = (int) (8192.0F + 8192.0F * f_14_ / 4096.0F);
		i_16_ = i_21_ * i_22_ / 8192 + (16384 - i_22_ >> 1);
	    }
	    f_17_ = 6.1035156E-5F * (float) i_16_;
	}
	fs[0] = (float) (i_16_ < 0 ? (double) f_13_
			 : (double) f_13_ * Math.sqrt((double) ((1.0F - f_17_)
								* 2.0F)));
	fs[1]
	    = (float) (i_16_ < 0 ? (double) -f_13_
		       : (double) f_13_ * Math.sqrt((double) (2.0F * f_17_)));
    }
    
    public void method358(Object object, float[] fs, Object[] objects) {
	Class488 class488 = (Class488) object;
	Class446 class446 = class488.method7931(65280);
	float f = class488.method7919((byte) -45);
	float f_23_ = class488.method7924(283217468);
	Class446 class446_24_
	    = Class446.method7225(class446, this$0.method4030(-741138068));
	float f_25_ = 0.0F;
	float f_26_ = class446_24_.method7230();
	if (f_26_ >= f_23_)
	    f_25_ = 0.0F;
	if (f_26_ <= f)
	    f_25_ = 1.0F;
	else {
	    float f_27_ = 1.0F - (f_26_ - f) * (1.0F / (f_23_ - f));
	    if ((double) f_27_ < 0.0 || (double) f_27_ > 1.0)
		f_27_ = Math.min(Math.max(f_27_, 0.0F), 1.0F);
	    f_25_ = f_27_;
	}
	int i = 8192;
	float f_28_ = 0.0F;
	if (5 == Class700.anInt8779 * -174799205) {
	    float f_29_
		= Class453_Sub3.aClass309_Sub1_10316.method5491((byte) 0);
	    if (0.0F != class446_24_.aFloat4895
		|| class446_24_.aFloat4897 != 0.0F) {
		int i_30_
		    = (((int) (2607.5945876176133 * (double) (-1.0F * f_29_))
			- (int) (Math.atan2((double) class446_24_.aFloat4895,
					    (double) class446_24_.aFloat4897)
				 * 2607.5945876176133)
			- 4096)
		       & 0x3fff);
		if (i_30_ > 8192)
		    i_30_ = 16384 - i_30_;
		int i_31_;
		if (f_26_ <= 0.0F)
		    i_31_ = 8192;
		else if (f_26_ >= 4096.0F)
		    i_31_ = 16384;
		else
		    i_31_ = (int) (8192.0F + 8192.0F * f_26_ / 4096.0F);
		i = i_30_ * i_31_ / 8192 + (16384 - i_31_ >> 1);
	    }
	    f_28_ = (float) i * 6.1035156E-5F;
	} else {
	    if (0.0F != class446_24_.aFloat4895
		|| class446_24_.aFloat4897 != 0.0F) {
		int i_32_
		    = ((-(-684522141 * Class64.anInt695)
			- (int) (Math.atan2((double) class446_24_.aFloat4895,
					    (double) class446_24_.aFloat4897)
				 * 2607.5945876176133)
			- 4096)
		       & 0x3fff);
		if (i_32_ > 8192)
		    i_32_ = 16384 - i_32_;
		int i_33_;
		if (f_26_ <= 0.0F)
		    i_33_ = 8192;
		else if (f_26_ >= 4096.0F)
		    i_33_ = 16384;
		else
		    i_33_ = (int) (8192.0F + 8192.0F * f_26_ / 4096.0F);
		i = i_32_ * i_33_ / 8192 + (16384 - i_33_ >> 1);
	    }
	    f_28_ = 6.1035156E-5F * (float) i;
	}
	fs[0] = (float) (i < 0 ? (double) f_25_
			 : (double) f_25_ * Math.sqrt((double) ((1.0F - f_28_)
								* 2.0F)));
	fs[1]
	    = (float) (i < 0 ? (double) -f_25_
		       : (double) f_25_ * Math.sqrt((double) (2.0F * f_28_)));
    }
    
    public void method360(Object object, float[] fs, Object[] objects) {
	Class488 class488 = (Class488) object;
	Class446 class446 = class488.method7931(65280);
	float f = class488.method7919((byte) 56);
	float f_34_ = class488.method7924(-732611990);
	Class446 class446_35_
	    = Class446.method7225(class446, this$0.method4030(1978140913));
	float f_36_ = 0.0F;
	float f_37_ = class446_35_.method7230();
	if (f_37_ >= f_34_)
	    f_36_ = 0.0F;
	if (f_37_ <= f)
	    f_36_ = 1.0F;
	else {
	    float f_38_ = 1.0F - (f_37_ - f) * (1.0F / (f_34_ - f));
	    if ((double) f_38_ < 0.0 || (double) f_38_ > 1.0)
		f_38_ = Math.min(Math.max(f_38_, 0.0F), 1.0F);
	    f_36_ = f_38_;
	}
	int i = 8192;
	float f_39_ = 0.0F;
	if (5 == Class700.anInt8779 * -174799205) {
	    float f_40_
		= Class453_Sub3.aClass309_Sub1_10316.method5491((byte) 0);
	    if (0.0F != class446_35_.aFloat4895
		|| class446_35_.aFloat4897 != 0.0F) {
		int i_41_
		    = (((int) (2607.5945876176133 * (double) (-1.0F * f_40_))
			- (int) (Math.atan2((double) class446_35_.aFloat4895,
					    (double) class446_35_.aFloat4897)
				 * 2607.5945876176133)
			- 4096)
		       & 0x3fff);
		if (i_41_ > 8192)
		    i_41_ = 16384 - i_41_;
		int i_42_;
		if (f_37_ <= 0.0F)
		    i_42_ = 8192;
		else if (f_37_ >= 4096.0F)
		    i_42_ = 16384;
		else
		    i_42_ = (int) (8192.0F + 8192.0F * f_37_ / 4096.0F);
		i = i_41_ * i_42_ / 8192 + (16384 - i_42_ >> 1);
	    }
	    f_39_ = (float) i * 6.1035156E-5F;
	} else {
	    if (0.0F != class446_35_.aFloat4895
		|| class446_35_.aFloat4897 != 0.0F) {
		int i_43_
		    = ((-(-684522141 * Class64.anInt695)
			- (int) (Math.atan2((double) class446_35_.aFloat4895,
					    (double) class446_35_.aFloat4897)
				 * 2607.5945876176133)
			- 4096)
		       & 0x3fff);
		if (i_43_ > 8192)
		    i_43_ = 16384 - i_43_;
		int i_44_;
		if (f_37_ <= 0.0F)
		    i_44_ = 8192;
		else if (f_37_ >= 4096.0F)
		    i_44_ = 16384;
		else
		    i_44_ = (int) (8192.0F + 8192.0F * f_37_ / 4096.0F);
		i = i_43_ * i_44_ / 8192 + (16384 - i_44_ >> 1);
	    }
	    f_39_ = 6.1035156E-5F * (float) i;
	}
	fs[0] = (float) (i < 0 ? (double) f_36_
			 : (double) f_36_ * Math.sqrt((double) ((1.0F - f_39_)
								* 2.0F)));
	fs[1]
	    = (float) (i < 0 ? (double) -f_36_
		       : (double) f_36_ * Math.sqrt((double) (2.0F * f_39_)));
    }
    
    public static Container method3854(int i) {
	if (null != Class96.aFrame1186)
	    return Class96.aFrame1186;
	if (Class198_Sub7.aFrame9932 != null)
	    return Class198_Sub7.aFrame9932;
	return Class281.anApplet3006;
    }
    
    public static boolean method3855(byte[] is, int i) {
	RSBuffer class525_sub38 = new RSBuffer(is);
	int i_45_ = class525_sub38.readUnsignedByte(462710746);
	if (2 != i_45_)
	    return false;
	boolean bool = class525_sub38.readUnsignedByte(1425265344) == 1;
	if (bool)
	    Class305.method5425(class525_sub38, -1387191796);
	Class597.method9843(class525_sub38, (byte) 0);
	return true;
    }
    
    static final void method3856(Class683 class683, int i) {
	Class18.method794((class683.anIntArray8661
			   [(class683.anInt8662 -= 1552651121) * 501271953]),
			  -1673441641);
    }
    
    public static Class33 method3857(String string, int i, int i_46_) {
	Class33_Sub1 class33_sub1 = new Class33_Sub1();
	class33_sub1.aString307 = string;
	class33_sub1.anInt306 = -1225306375 * i;
	return class33_sub1;
    }
    
    public static int method3858(int i, int i_47_) {
	return i & 0xff;
    }
}
