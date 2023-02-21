/* Class344 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.nio.ByteBuffer;

public class Class344
{
    int[] anIntArray3697;
    int anInt3698;
    Class182_Sub1 aClass182_Sub1_3699;
    Class352 aClass352_3700;
    int anInt3701;
    boolean aBool3702 = true;
    byte[] aByteArray3703;
    static final int anInt3704 = 128;
    int anInt3705;
    Interface44 anInterface44_3706;
    Interface38 anInterface38_3707;
    int anInt3708;
    int anInt3709;
    int anInt3710 = -1;
    static final int anInt3711 = 7;
    
    void method6035(Class319 class319, Interface44 interface44, int i,
		    int i_0_) {
	if (i_0_ > 0) {
	    method6043();
	    aClass182_Sub1_3699.method14765(interface44);
	    class319.anInterface38_3512 = anInterface38_3707;
	    class319.anInt3527 = anInt3708;
	    class319.anInt3528 = anInt3709 - anInt3708 + 1;
	    class319.anInt3526 = i;
	    class319.anInt3530 = i_0_;
	    class319.method5696(false);
	}
    }
    
    void method6036(Class319 class319, Interface44 interface44, int i,
		    int i_1_) {
	if (i_1_ > 0) {
	    method6043();
	    aClass182_Sub1_3699.method14765(interface44);
	    class319.anInterface38_3512 = anInterface38_3707;
	    class319.anInt3527 = anInt3708;
	    class319.anInt3528 = anInt3709 - anInt3708 + 1;
	    class319.anInt3526 = i;
	    class319.anInt3530 = i_1_;
	    class319.method5696(false);
	}
    }
    
    void method6037(Class319 class319, Interface44 interface44, int i,
		    int i_2_) {
	if (i_2_ > 0) {
	    method6043();
	    aClass182_Sub1_3699.method14765(interface44);
	    class319.anInterface38_3512 = anInterface38_3707;
	    class319.anInt3527 = anInt3708;
	    class319.anInt3528 = anInt3709 - anInt3708 + 1;
	    class319.anInt3526 = i;
	    class319.anInt3530 = i_2_;
	    class319.method5696(false);
	}
    }
    
    Class344(Class182_Sub1 class182_sub1, Class352 class352,
	     Class161_Sub3 class161_sub3, int i, int i_3_, int i_4_, int i_5_,
	     int i_6_) {
	aClass182_Sub1_3699 = class182_sub1;
	aClass352_3700 = class352;
	anInt3701 = i_5_;
	anInt3698 = i_6_;
	int i_7_ = 1 << i_4_;
	int i_8_ = 0;
	int i_9_ = i << i_4_;
	int i_10_ = i_3_ << i_4_;
	for (int i_11_ = 0; i_11_ < i_7_; i_11_++) {
	    int i_12_
		= ((i_10_ + i_11_) * (class161_sub3.anInt1759 * 363736815)
		   + i_9_);
	    for (int i_13_ = 0; i_13_ < i_7_; i_13_++) {
		short[] is = class161_sub3.aShortArrayArray9851[i_12_++];
		if (is != null)
		    i_8_ += is.length;
	    }
	}
	if (i_8_ > 0) {
	    anInt3709 = -2147483648;
	    anInt3708 = 2147483647;
	    anInterface44_3706 = aClass182_Sub1_3699.method14701(false);
	    anInterface44_3706.method29(i_8_);
	    ByteBuffer bytebuffer = aClass182_Sub1_3699.aByteBuffer9271;
	    bytebuffer.clear();
	    for (int i_14_ = 0; i_14_ < i_7_; i_14_++) {
		int i_15_
		    = ((i_10_ + i_14_) * (class161_sub3.anInt1759 * 363736815)
		       + i_9_);
		for (int i_16_ = 0; i_16_ < i_7_; i_16_++) {
		    short[] is = class161_sub3.aShortArrayArray9851[i_15_++];
		    if (is != null) {
			for (int i_17_ = 0; i_17_ < is.length; i_17_++) {
			    int i_18_ = is[i_17_] & 0xffff;
			    if (i_18_ < anInt3708)
				anInt3708 = i_18_;
			    if (i_18_ > anInt3709)
				anInt3709 = i_18_;
			    bytebuffer.putShort((short) i_18_);
			}
		    }
		}
	    }
	    anInterface44_3706.method215(0, bytebuffer.position(),
					 aClass182_Sub1_3699.aLong9160);
	    anInt3705 = i_8_ / 3;
	} else {
	    anInt3705 = 0;
	    anInterface38_3707 = null;
	}
    }
    
    void method6038(Class319 class319) {
	method6037(class319, anInterface44_3706, 0, anInt3705);
    }
    
    void method6039(Class319 class319, Interface44 interface44, int i,
		    int i_19_) {
	if (i_19_ > 0) {
	    method6043();
	    aClass182_Sub1_3699.method14765(interface44);
	    class319.anInterface38_3512 = anInterface38_3707;
	    class319.anInt3527 = anInt3708;
	    class319.anInt3528 = anInt3709 - anInt3708 + 1;
	    class319.anInt3526 = i;
	    class319.anInt3530 = i_19_;
	    class319.method5696(false);
	}
    }
    
    void method6040(Class319 class319, Interface44 interface44, int i,
		    int i_20_) {
	if (i_20_ > 0) {
	    method6043();
	    aClass182_Sub1_3699.method14765(interface44);
	    class319.anInterface38_3512 = anInterface38_3707;
	    class319.anInt3527 = anInt3708;
	    class319.anInt3528 = anInt3709 - anInt3708 + 1;
	    class319.anInt3526 = i;
	    class319.anInt3530 = i_20_;
	    class319.method5696(false);
	}
    }
    
    void method6041(Class319 class319) {
	method6037(class319, anInterface44_3706, 0, anInt3705);
    }
    
    void method6042(Class319 class319, Interface44 interface44, int i,
		    int i_21_) {
	if (i_21_ > 0) {
	    method6043();
	    aClass182_Sub1_3699.method14765(interface44);
	    class319.anInterface38_3512 = anInterface38_3707;
	    class319.anInt3527 = anInt3708;
	    class319.anInt3528 = anInt3709 - anInt3708 + 1;
	    class319.anInt3526 = i;
	    class319.anInt3530 = i_21_;
	    class319.method5696(false);
	}
    }
    
    void method6043() {
	if (aBool3702) {
	    aBool3702 = false;
	    byte[] is = aClass352_3700.aByteArray3745;
	    int i = 0;
	    int i_22_ = aClass352_3700.anInt3747;
	    int i_23_ = anInt3701 + anInt3698 * aClass352_3700.anInt3747;
	    for (int i_24_ = -128; i_24_ < 0; i_24_++) {
		i = (i << 8) - i;
		for (int i_25_ = -128; i_25_ < 0; i_25_++) {
		    if (is[i_23_++] != 0)
			i++;
		}
		i_23_ += i_22_ - 128;
	    }
	    if (anInterface38_3707 != null && anInt3710 == i)
		aBool3702 = false;
	    else {
		anInt3710 = i;
		int i_26_ = 0;
		i_23_ = anInt3701 + anInt3698 * i_22_;
		if (aClass182_Sub1_3699.method14705(Class165.aClass165_1772,
						    Class178.aClass178_1905)) {
		    if (aByteArray3703 == null)
			aByteArray3703 = new byte[16384];
		    byte[] is_27_ = aByteArray3703;
		    for (int i_28_ = -128; i_28_ < 0; i_28_++) {
			for (int i_29_ = -128; i_29_ < 0; i_29_++) {
			    if (is[i_23_] != 0)
				is_27_[i_26_++] = (byte) 68;
			    else {
				int i_30_ = 0;
				if (is[i_23_ - 1] != 0)
				    i_30_++;
				if (is[i_23_ + 1] != 0)
				    i_30_++;
				if (is[i_23_ - i_22_] != 0)
				    i_30_++;
				if (is[i_23_ + i_22_] != 0)
				    i_30_++;
				is_27_[i_26_++] = (byte) (17 * i_30_);
			    }
			    i_23_++;
			}
			i_23_ += aClass352_3700.anInt3747 - 128;
		    }
		    if (anInterface38_3707 == null) {
			anInterface38_3707 = (aClass182_Sub1_3699.method14724
					      (Class165.aClass165_1772, 128,
					       128, false, aByteArray3703));
			anInterface38_3707.method231(false, false);
		    } else
			anInterface38_3707.method238(0, 0, 128, 128,
						     aByteArray3703,
						     Class165.aClass165_1772,
						     0, 128);
		} else {
		    if (anIntArray3697 == null)
			anIntArray3697 = new int[16384];
		    int[] is_31_ = anIntArray3697;
		    for (int i_32_ = -128; i_32_ < 0; i_32_++) {
			for (int i_33_ = -128; i_33_ < 0; i_33_++) {
			    if (is[i_23_] != 0)
				is_31_[i_26_++] = 1140850688;
			    else {
				int i_34_ = 0;
				if (is[i_23_ - 1] != 0)
				    i_34_++;
				if (is[i_23_ + 1] != 0)
				    i_34_++;
				if (is[i_23_ - i_22_] != 0)
				    i_34_++;
				if (is[i_23_ + i_22_] != 0)
				    i_34_++;
				is_31_[i_26_++] = 17 * i_34_ << 24;
			    }
			    i_23_++;
			}
			i_23_ += aClass352_3700.anInt3747 - 128;
		    }
		    if (anInterface38_3707 == null) {
			anInterface38_3707
			    = aClass182_Sub1_3699.method14723(128, 128, false,
							      anIntArray3697);
			anInterface38_3707.method231(false, false);
		    } else
			anInterface38_3707.method232(0, 0, 128, 128,
						     anIntArray3697, 0, 128);
		}
	    }
	}
    }
}
