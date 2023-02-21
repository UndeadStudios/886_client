/* Class360 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.nio.ByteBuffer;

import sun.misc.Unsafe;

public class Class360
{
    Class182_Sub1 aClass182_Sub1_3811;
    Class348 aClass348_3812 = Class348.aClass348_3734;
    int anInt3813;
    int anInt3814 = 128;
    int anInt3815 = 0;
    float[] aFloatArray3816 = new float[anInt3814 * 16];
    Interface38[] anInterface38Array3817 = new Interface38[anInt3814];
    int[] anIntArray3818 = new int[anInt3814];
    int[] anIntArray3819 = new int[4];
    Interface35 anInterface35_3820;
    Class337 aClass337_3821;
    Interface44 anInterface44_3822;
    Class348 aClass348_3823;
    
    void method6271() {
	if (aClass348_3823 != null) {
	    aClass348_3812 = aClass348_3823;
	    aClass348_3823 = null;
	}
    }
    
    void method6272() {
	if (aClass348_3823 != null) {
	    aClass348_3812 = aClass348_3823;
	    aClass348_3823 = null;
	}
    }
    
    void method6273() {
	if (anInt3815 != 0) {
	    aClass182_Sub1_3811.method14774();
	    aClass182_Sub1_3811.method14779(1);
	    aClass182_Sub1_3811.method14765(anInterface44_3822);
	    aClass182_Sub1_3811.method14764(0, anInterface35_3820);
	    aClass182_Sub1_3811.method14763(aClass337_3821);
	    Class314 class314 = aClass182_Sub1_3811.aClass314_9213;
	    Unsafe unsafe = aClass182_Sub1_3811.anUnsafe9234;
	    ByteBuffer bytebuffer = aClass182_Sub1_3811.aByteBuffer9271;
	    bytebuffer.clear();
	    aClass182_Sub1_3811.method14740()
		.method6947(Class435.aClass435_4829);
	    aClass182_Sub1_3811.method14741(Class368.aClass368_3868);
	    int i = (anInt3815 + anInt3813 - 1) / anInt3813;
	    int i_0_ = 0;
	    int i_1_ = 0;
	    for (int i_2_ = 0; i_2_ < i; i_2_++) {
		int i_3_ = Math.min(anInt3813, anInt3815 - i_0_);
		long l = anInterface35_3820.method219(0, i_3_ * 96);
		int i_4_ = i_2_ * anInt3813 + i_3_;
		for (int i_5_ = i_0_; i_5_ < i_4_; i_5_++) {
		    for (int i_6_ = 0; i_6_ < 4; i_6_++) {
			unsafe.putFloat(l, aFloatArray3816[i_1_++]);
			l += 4L;
			unsafe.putFloat(l, aFloatArray3816[i_1_++]);
			l += 4L;
			unsafe.putFloat(l, 0.0F);
			l += 4L;
			unsafe.putFloat(l, aFloatArray3816[i_1_++]);
			l += 4L;
			unsafe.putFloat(l, aFloatArray3816[i_1_++]);
			l += 4L;
			unsafe.putInt(l, anIntArray3818[i_5_]);
			l += 4L;
		    }
		}
		anInterface35_3820.method220();
		Interface38 interface38 = anInterface38Array3817[i_0_];
		int i_7_ = 1;
		int i_8_ = 0;
		for (int i_9_ = i_0_ + 1; i_9_ < i_4_; i_9_++) {
		    if (interface38 == anInterface38Array3817[i_9_])
			i_7_++;
		    else {
			class314.anInterface38_3484 = interface38;
			class314.method5647();
			aClass182_Sub1_3811.method14773(anInterface44_3822,
							(Class373
							 .aClass373_3885),
							i_8_ * 4, i_7_ * 4,
							i_8_ * 6, i_7_ * 2);
			interface38 = anInterface38Array3817[i_9_];
			i_7_ = 1;
			i_8_ = i_9_ - i_0_;
		    }
		}
		class314.anInterface38_3484 = interface38;
		class314.method5647();
		aClass182_Sub1_3811.method14773(anInterface44_3822,
						Class373.aClass373_3885,
						i_8_ * 4, i_7_ * 4, i_8_ * 6,
						i_7_ * 2);
		i_0_ += anInt3813;
	    }
	    anInt3815 = 0;
	}
    }
    
    void method6274(float f, float f_10_, float f_11_, float f_12_,
		    float f_13_, float f_14_, float f_15_, float f_16_,
		    Interface38 interface38, int i) {
	if ((i & ~0xffffff) != 0) {
	    aClass182_Sub1_3811.method3187(anIntArray3819);
	    int i_17_ = anIntArray3819[0];
	    int i_18_ = anIntArray3819[1];
	    int i_19_ = anIntArray3819[2];
	    int i_20_ = anIntArray3819[3];
	    if (!(f > (float) i_19_) && !(f_10_ > (float) i_20_)
		&& !(f_11_ < (float) i_17_) && !(f_12_ < (float) i_18_)) {
		float f_21_ = f_11_ - f;
		float f_22_ = f_12_ - f_10_;
		float f_23_ = f_15_ - f_13_;
		float f_24_ = f_16_ - f_14_;
		if (f < (float) i_17_) {
		    f_13_ += ((float) i_17_ - f) / f_21_ * f_23_;
		    f = (float) i_17_;
		}
		if (f_10_ < (float) i_18_) {
		    f_14_ += ((float) i_18_ - f_10_) / f_22_ * f_24_;
		    f_10_ = (float) i_18_;
		}
		if (f_11_ > (float) i_19_) {
		    f_15_ -= (f_11_ - (float) i_19_) / f_21_ * f_23_;
		    f_11_ = (float) i_19_;
		}
		if (f_12_ > (float) i_20_) {
		    f_16_ -= (f_12_ - (float) i_20_) / f_22_ * f_24_;
		    f_12_ = (float) i_20_;
		}
		method6293();
		f = method6298(f);
		f_10_ = method6276(f_10_);
		f_11_ = method6298(f_11_);
		f_12_ = method6276(f_12_);
		aFloatArray3816[anInt3815 * 16 + 0] = f;
		aFloatArray3816[anInt3815 * 16 + 1] = f_10_;
		aFloatArray3816[anInt3815 * 16 + 2] = f_13_;
		aFloatArray3816[anInt3815 * 16 + 3] = f_14_;
		aFloatArray3816[anInt3815 * 16 + 4] = f_11_;
		aFloatArray3816[anInt3815 * 16 + 5] = f_10_;
		aFloatArray3816[anInt3815 * 16 + 6] = f_15_;
		aFloatArray3816[anInt3815 * 16 + 7] = f_14_;
		aFloatArray3816[anInt3815 * 16 + 8] = f;
		aFloatArray3816[anInt3815 * 16 + 9] = f_12_;
		aFloatArray3816[anInt3815 * 16 + 10] = f_13_;
		aFloatArray3816[anInt3815 * 16 + 11] = f_16_;
		aFloatArray3816[anInt3815 * 16 + 12] = f_11_;
		aFloatArray3816[anInt3815 * 16 + 13] = f_12_;
		aFloatArray3816[anInt3815 * 16 + 14] = f_15_;
		aFloatArray3816[anInt3815 * 16 + 15] = f_16_;
		anInterface38Array3817[anInt3815] = interface38;
		if (aClass182_Sub1_3811.anInt9212 == 1)
		    anIntArray3818[anInt3815]
			= ~0xff00ff & i | (i & 0xff) << 16 | i >> 16 & 0xff;
		else
		    anIntArray3818[anInt3815] = i;
		anInt3815++;
		if (aClass348_3812 == Class348.aClass348_3733)
		    method6273();
	    }
	}
    }
    
    void method6275() {
	anInterface35_3820.method127();
	anInterface44_3822.method127();
	anInterface35_3820 = null;
	anInterface44_3822 = null;
	aClass337_3821 = null;
	anInt3815 = 0;
    }
    
    float method6276(float f) {
	int i = aClass182_Sub1_3811.method3566(-1461612470).method2711();
	float f_25_
	    = (((1.0F - (f + aClass182_Sub1_3811.method14674()) / (float) i)
		* 2.0F)
	       - 1.0F);
	return f_25_;
    }
    
    float method6277(float f) {
	int i = aClass182_Sub1_3811.method3566(412528807).method2711();
	float f_26_
	    = (((1.0F - (f + aClass182_Sub1_3811.method14674()) / (float) i)
		* 2.0F)
	       - 1.0F);
	return f_26_;
    }
    
    float method6278(float f) {
	int i = aClass182_Sub1_3811.method3566(-617540842).method2711();
	float f_27_
	    = (((1.0F - (f + aClass182_Sub1_3811.method14674()) / (float) i)
		* 2.0F)
	       - 1.0F);
	return f_27_;
    }
    
    void method6279() {
	aClass348_3823 = aClass348_3812;
	aClass348_3812 = Class348.aClass348_3732;
    }
    
    void method6280() {
	if (anInt3815 != 0) {
	    aClass182_Sub1_3811.method14774();
	    aClass182_Sub1_3811.method14779(1);
	    aClass182_Sub1_3811.method14765(anInterface44_3822);
	    aClass182_Sub1_3811.method14764(0, anInterface35_3820);
	    aClass182_Sub1_3811.method14763(aClass337_3821);
	    Class314 class314 = aClass182_Sub1_3811.aClass314_9213;
	    Unsafe unsafe = aClass182_Sub1_3811.anUnsafe9234;
	    ByteBuffer bytebuffer = aClass182_Sub1_3811.aByteBuffer9271;
	    bytebuffer.clear();
	    aClass182_Sub1_3811.method14740()
		.method6947(Class435.aClass435_4829);
	    aClass182_Sub1_3811.method14741(Class368.aClass368_3868);
	    int i = (anInt3815 + anInt3813 - 1) / anInt3813;
	    int i_28_ = 0;
	    int i_29_ = 0;
	    for (int i_30_ = 0; i_30_ < i; i_30_++) {
		int i_31_ = Math.min(anInt3813, anInt3815 - i_28_);
		long l = anInterface35_3820.method219(0, i_31_ * 96);
		int i_32_ = i_30_ * anInt3813 + i_31_;
		for (int i_33_ = i_28_; i_33_ < i_32_; i_33_++) {
		    for (int i_34_ = 0; i_34_ < 4; i_34_++) {
			unsafe.putFloat(l, aFloatArray3816[i_29_++]);
			l += 4L;
			unsafe.putFloat(l, aFloatArray3816[i_29_++]);
			l += 4L;
			unsafe.putFloat(l, 0.0F);
			l += 4L;
			unsafe.putFloat(l, aFloatArray3816[i_29_++]);
			l += 4L;
			unsafe.putFloat(l, aFloatArray3816[i_29_++]);
			l += 4L;
			unsafe.putInt(l, anIntArray3818[i_33_]);
			l += 4L;
		    }
		}
		anInterface35_3820.method220();
		Interface38 interface38 = anInterface38Array3817[i_28_];
		int i_35_ = 1;
		int i_36_ = 0;
		for (int i_37_ = i_28_ + 1; i_37_ < i_32_; i_37_++) {
		    if (interface38 == anInterface38Array3817[i_37_])
			i_35_++;
		    else {
			class314.anInterface38_3484 = interface38;
			class314.method5647();
			aClass182_Sub1_3811.method14773(anInterface44_3822,
							(Class373
							 .aClass373_3885),
							i_36_ * 4, i_35_ * 4,
							i_36_ * 6, i_35_ * 2);
			interface38 = anInterface38Array3817[i_37_];
			i_35_ = 1;
			i_36_ = i_37_ - i_28_;
		    }
		}
		class314.anInterface38_3484 = interface38;
		class314.method5647();
		aClass182_Sub1_3811.method14773(anInterface44_3822,
						Class373.aClass373_3885,
						i_36_ * 4, i_35_ * 4,
						i_36_ * 6, i_35_ * 2);
		i_28_ += anInt3813;
	    }
	    anInt3815 = 0;
	}
    }
    
    Class348 method6281() {
	return aClass348_3812;
    }
    
    void method6282() {
	anInterface35_3820.method127();
	anInterface44_3822.method127();
	anInterface35_3820 = null;
	anInterface44_3822 = null;
	aClass337_3821 = null;
	anInt3815 = 0;
    }
    
    void method6283() {
	if (anInt3815 != 0) {
	    aClass182_Sub1_3811.method14774();
	    aClass182_Sub1_3811.method14779(1);
	    aClass182_Sub1_3811.method14765(anInterface44_3822);
	    aClass182_Sub1_3811.method14764(0, anInterface35_3820);
	    aClass182_Sub1_3811.method14763(aClass337_3821);
	    Class314 class314 = aClass182_Sub1_3811.aClass314_9213;
	    Unsafe unsafe = aClass182_Sub1_3811.anUnsafe9234;
	    ByteBuffer bytebuffer = aClass182_Sub1_3811.aByteBuffer9271;
	    bytebuffer.clear();
	    aClass182_Sub1_3811.method14740()
		.method6947(Class435.aClass435_4829);
	    aClass182_Sub1_3811.method14741(Class368.aClass368_3868);
	    int i = (anInt3815 + anInt3813 - 1) / anInt3813;
	    int i_38_ = 0;
	    int i_39_ = 0;
	    for (int i_40_ = 0; i_40_ < i; i_40_++) {
		int i_41_ = Math.min(anInt3813, anInt3815 - i_38_);
		long l = anInterface35_3820.method219(0, i_41_ * 96);
		int i_42_ = i_40_ * anInt3813 + i_41_;
		for (int i_43_ = i_38_; i_43_ < i_42_; i_43_++) {
		    for (int i_44_ = 0; i_44_ < 4; i_44_++) {
			unsafe.putFloat(l, aFloatArray3816[i_39_++]);
			l += 4L;
			unsafe.putFloat(l, aFloatArray3816[i_39_++]);
			l += 4L;
			unsafe.putFloat(l, 0.0F);
			l += 4L;
			unsafe.putFloat(l, aFloatArray3816[i_39_++]);
			l += 4L;
			unsafe.putFloat(l, aFloatArray3816[i_39_++]);
			l += 4L;
			unsafe.putInt(l, anIntArray3818[i_43_]);
			l += 4L;
		    }
		}
		anInterface35_3820.method220();
		Interface38 interface38 = anInterface38Array3817[i_38_];
		int i_45_ = 1;
		int i_46_ = 0;
		for (int i_47_ = i_38_ + 1; i_47_ < i_42_; i_47_++) {
		    if (interface38 == anInterface38Array3817[i_47_])
			i_45_++;
		    else {
			class314.anInterface38_3484 = interface38;
			class314.method5647();
			aClass182_Sub1_3811.method14773(anInterface44_3822,
							(Class373
							 .aClass373_3885),
							i_46_ * 4, i_45_ * 4,
							i_46_ * 6, i_45_ * 2);
			interface38 = anInterface38Array3817[i_47_];
			i_45_ = 1;
			i_46_ = i_47_ - i_38_;
		    }
		}
		class314.anInterface38_3484 = interface38;
		class314.method5647();
		aClass182_Sub1_3811.method14773(anInterface44_3822,
						Class373.aClass373_3885,
						i_46_ * 4, i_45_ * 4,
						i_46_ * 6, i_45_ * 2);
		i_38_ += anInt3813;
	    }
	    anInt3815 = 0;
	}
    }
    
    void method6284() {
	if (anInt3815 != 0) {
	    aClass182_Sub1_3811.method14774();
	    aClass182_Sub1_3811.method14779(1);
	    aClass182_Sub1_3811.method14765(anInterface44_3822);
	    aClass182_Sub1_3811.method14764(0, anInterface35_3820);
	    aClass182_Sub1_3811.method14763(aClass337_3821);
	    Class314 class314 = aClass182_Sub1_3811.aClass314_9213;
	    Unsafe unsafe = aClass182_Sub1_3811.anUnsafe9234;
	    ByteBuffer bytebuffer = aClass182_Sub1_3811.aByteBuffer9271;
	    bytebuffer.clear();
	    aClass182_Sub1_3811.method14740()
		.method6947(Class435.aClass435_4829);
	    aClass182_Sub1_3811.method14741(Class368.aClass368_3868);
	    int i = (anInt3815 + anInt3813 - 1) / anInt3813;
	    int i_48_ = 0;
	    int i_49_ = 0;
	    for (int i_50_ = 0; i_50_ < i; i_50_++) {
		int i_51_ = Math.min(anInt3813, anInt3815 - i_48_);
		long l = anInterface35_3820.method219(0, i_51_ * 96);
		int i_52_ = i_50_ * anInt3813 + i_51_;
		for (int i_53_ = i_48_; i_53_ < i_52_; i_53_++) {
		    for (int i_54_ = 0; i_54_ < 4; i_54_++) {
			unsafe.putFloat(l, aFloatArray3816[i_49_++]);
			l += 4L;
			unsafe.putFloat(l, aFloatArray3816[i_49_++]);
			l += 4L;
			unsafe.putFloat(l, 0.0F);
			l += 4L;
			unsafe.putFloat(l, aFloatArray3816[i_49_++]);
			l += 4L;
			unsafe.putFloat(l, aFloatArray3816[i_49_++]);
			l += 4L;
			unsafe.putInt(l, anIntArray3818[i_53_]);
			l += 4L;
		    }
		}
		anInterface35_3820.method220();
		Interface38 interface38 = anInterface38Array3817[i_48_];
		int i_55_ = 1;
		int i_56_ = 0;
		for (int i_57_ = i_48_ + 1; i_57_ < i_52_; i_57_++) {
		    if (interface38 == anInterface38Array3817[i_57_])
			i_55_++;
		    else {
			class314.anInterface38_3484 = interface38;
			class314.method5647();
			aClass182_Sub1_3811.method14773(anInterface44_3822,
							(Class373
							 .aClass373_3885),
							i_56_ * 4, i_55_ * 4,
							i_56_ * 6, i_55_ * 2);
			interface38 = anInterface38Array3817[i_57_];
			i_55_ = 1;
			i_56_ = i_57_ - i_48_;
		    }
		}
		class314.anInterface38_3484 = interface38;
		class314.method5647();
		aClass182_Sub1_3811.method14773(anInterface44_3822,
						Class373.aClass373_3885,
						i_56_ * 4, i_55_ * 4,
						i_56_ * 6, i_55_ * 2);
		i_48_ += anInt3813;
	    }
	    anInt3815 = 0;
	}
    }
    
    void method6285(float f, float f_58_, float f_59_, float f_60_,
		    float f_61_, float f_62_, float f_63_, float f_64_,
		    float f_65_, float f_66_, float f_67_, float f_68_,
		    float f_69_, float f_70_, float f_71_, float f_72_,
		    Interface38 interface38, int i) {
	if ((i & ~0xffffff) != 0) {
	    aClass182_Sub1_3811.method3187(anIntArray3819);
	    int i_73_ = anIntArray3819[0];
	    int i_74_ = anIntArray3819[1];
	    int i_75_ = anIntArray3819[2];
	    int i_76_ = anIntArray3819[3];
	    int i_77_ = 0;
	    int i_78_ = ((f < (float) i_73_ ? 1 : 0)
			 + (f_59_ < (float) i_73_ ? 1 : 0)
			 + (f_61_ < (float) i_73_ ? 1 : 0)
			 + (f_63_ < (float) i_73_ ? 1 : 0));
	    if (i_78_ != 4) {
		i_77_ |= i_78_;
		i_78_ = ((f > (float) i_75_ ? 1 : 0)
			 + (f_59_ > (float) i_75_ ? 1 : 0)
			 + (f_61_ > (float) i_75_ ? 1 : 0)
			 + (f_63_ > (float) i_75_ ? 1 : 0));
		if (i_78_ != 4) {
		    i_77_ |= i_78_;
		    i_78_ = ((f_58_ < (float) i_74_ ? 1 : 0)
			     + (f_60_ < (float) i_74_ ? 1 : 0)
			     + (f_62_ < (float) i_74_ ? 1 : 0)
			     + (f_64_ < (float) i_74_ ? 1 : 0));
		    if (i_78_ != 4) {
			i_77_ |= i_78_;
			i_78_ = ((f_58_ > (float) i_76_ ? 1 : 0)
				 + (f_60_ > (float) i_76_ ? 1 : 0)
				 + (f_62_ > (float) i_76_ ? 1 : 0)
				 + (f_64_ > (float) i_76_ ? 1 : 0));
			if (i_78_ != 4) {
			    i_77_ |= i_78_;
			    if (i_77_ != 0) {
				method6273();
				aClass182_Sub1_3811.method3186(true);
				aClass182_Sub1_3811.method3184(i_73_, i_74_,
							       i_75_, i_76_);
			    }
			    method6293();
			    f = method6298(f);
			    f_58_ = method6276(f_58_);
			    f_59_ = method6298(f_59_);
			    f_60_ = method6276(f_60_);
			    f_61_ = method6298(f_61_);
			    f_62_ = method6276(f_62_);
			    f_63_ = method6298(f_63_);
			    f_64_ = method6276(f_64_);
			    aFloatArray3816[anInt3815 * 16 + 0] = f;
			    aFloatArray3816[anInt3815 * 16 + 1] = f_58_;
			    aFloatArray3816[anInt3815 * 16 + 2] = f_65_;
			    aFloatArray3816[anInt3815 * 16 + 3] = f_66_;
			    aFloatArray3816[anInt3815 * 16 + 4] = f_59_;
			    aFloatArray3816[anInt3815 * 16 + 5] = f_60_;
			    aFloatArray3816[anInt3815 * 16 + 6] = f_67_;
			    aFloatArray3816[anInt3815 * 16 + 7] = f_68_;
			    aFloatArray3816[anInt3815 * 16 + 8] = f_61_;
			    aFloatArray3816[anInt3815 * 16 + 9] = f_62_;
			    aFloatArray3816[anInt3815 * 16 + 10] = f_69_;
			    aFloatArray3816[anInt3815 * 16 + 11] = f_70_;
			    aFloatArray3816[anInt3815 * 16 + 12] = f_63_;
			    aFloatArray3816[anInt3815 * 16 + 13] = f_64_;
			    aFloatArray3816[anInt3815 * 16 + 14] = f_71_;
			    aFloatArray3816[anInt3815 * 16 + 15] = f_72_;
			    anInterface38Array3817[anInt3815] = interface38;
			    if (aClass182_Sub1_3811.anInt9212 == 1)
				anIntArray3818[anInt3815]
				    = (~0xff00ff & i | (i & 0xff) << 16
				       | i >> 16 & 0xff);
			    else
				anIntArray3818[anInt3815] = i;
			    anInt3815++;
			    if (aClass348_3812 == Class348.aClass348_3733
				|| i_77_ > 0)
				method6273();
			    if (i_77_ != 0) {
				aClass182_Sub1_3811.method3186(false);
				aClass182_Sub1_3811.method3480();
				aClass182_Sub1_3811.method3184(i_73_, i_74_,
							       i_75_, i_76_);
			    }
			}
		    }
		}
	    }
	}
    }
    
    void method6286(float f, float f_79_, float f_80_, float f_81_,
		    float f_82_, float f_83_, float f_84_, float f_85_,
		    Interface38 interface38, int i) {
	if ((i & ~0xffffff) != 0) {
	    aClass182_Sub1_3811.method3187(anIntArray3819);
	    int i_86_ = anIntArray3819[0];
	    int i_87_ = anIntArray3819[1];
	    int i_88_ = anIntArray3819[2];
	    int i_89_ = anIntArray3819[3];
	    if (!(f > (float) i_88_) && !(f_79_ > (float) i_89_)
		&& !(f_80_ < (float) i_86_) && !(f_81_ < (float) i_87_)) {
		float f_90_ = f_80_ - f;
		float f_91_ = f_81_ - f_79_;
		float f_92_ = f_84_ - f_82_;
		float f_93_ = f_85_ - f_83_;
		if (f < (float) i_86_) {
		    f_82_ += ((float) i_86_ - f) / f_90_ * f_92_;
		    f = (float) i_86_;
		}
		if (f_79_ < (float) i_87_) {
		    f_83_ += ((float) i_87_ - f_79_) / f_91_ * f_93_;
		    f_79_ = (float) i_87_;
		}
		if (f_80_ > (float) i_88_) {
		    f_84_ -= (f_80_ - (float) i_88_) / f_90_ * f_92_;
		    f_80_ = (float) i_88_;
		}
		if (f_81_ > (float) i_89_) {
		    f_85_ -= (f_81_ - (float) i_89_) / f_91_ * f_93_;
		    f_81_ = (float) i_89_;
		}
		method6293();
		f = method6298(f);
		f_79_ = method6276(f_79_);
		f_80_ = method6298(f_80_);
		f_81_ = method6276(f_81_);
		aFloatArray3816[anInt3815 * 16 + 0] = f;
		aFloatArray3816[anInt3815 * 16 + 1] = f_79_;
		aFloatArray3816[anInt3815 * 16 + 2] = f_82_;
		aFloatArray3816[anInt3815 * 16 + 3] = f_83_;
		aFloatArray3816[anInt3815 * 16 + 4] = f_80_;
		aFloatArray3816[anInt3815 * 16 + 5] = f_79_;
		aFloatArray3816[anInt3815 * 16 + 6] = f_84_;
		aFloatArray3816[anInt3815 * 16 + 7] = f_83_;
		aFloatArray3816[anInt3815 * 16 + 8] = f;
		aFloatArray3816[anInt3815 * 16 + 9] = f_81_;
		aFloatArray3816[anInt3815 * 16 + 10] = f_82_;
		aFloatArray3816[anInt3815 * 16 + 11] = f_85_;
		aFloatArray3816[anInt3815 * 16 + 12] = f_80_;
		aFloatArray3816[anInt3815 * 16 + 13] = f_81_;
		aFloatArray3816[anInt3815 * 16 + 14] = f_84_;
		aFloatArray3816[anInt3815 * 16 + 15] = f_85_;
		anInterface38Array3817[anInt3815] = interface38;
		if (aClass182_Sub1_3811.anInt9212 == 1)
		    anIntArray3818[anInt3815]
			= ~0xff00ff & i | (i & 0xff) << 16 | i >> 16 & 0xff;
		else
		    anIntArray3818[anInt3815] = i;
		anInt3815++;
		if (aClass348_3812 == Class348.aClass348_3733)
		    method6273();
	    }
	}
    }
    
    void method6287(float f, float f_94_, float f_95_, float f_96_,
		    float f_97_, float f_98_, float f_99_, float f_100_,
		    Interface38 interface38, int i) {
	if ((i & ~0xffffff) != 0) {
	    aClass182_Sub1_3811.method3187(anIntArray3819);
	    int i_101_ = anIntArray3819[0];
	    int i_102_ = anIntArray3819[1];
	    int i_103_ = anIntArray3819[2];
	    int i_104_ = anIntArray3819[3];
	    if (!(f > (float) i_103_) && !(f_94_ > (float) i_104_)
		&& !(f_95_ < (float) i_101_) && !(f_96_ < (float) i_102_)) {
		float f_105_ = f_95_ - f;
		float f_106_ = f_96_ - f_94_;
		float f_107_ = f_99_ - f_97_;
		float f_108_ = f_100_ - f_98_;
		if (f < (float) i_101_) {
		    f_97_ += ((float) i_101_ - f) / f_105_ * f_107_;
		    f = (float) i_101_;
		}
		if (f_94_ < (float) i_102_) {
		    f_98_ += ((float) i_102_ - f_94_) / f_106_ * f_108_;
		    f_94_ = (float) i_102_;
		}
		if (f_95_ > (float) i_103_) {
		    f_99_ -= (f_95_ - (float) i_103_) / f_105_ * f_107_;
		    f_95_ = (float) i_103_;
		}
		if (f_96_ > (float) i_104_) {
		    f_100_ -= (f_96_ - (float) i_104_) / f_106_ * f_108_;
		    f_96_ = (float) i_104_;
		}
		method6293();
		f = method6298(f);
		f_94_ = method6276(f_94_);
		f_95_ = method6298(f_95_);
		f_96_ = method6276(f_96_);
		aFloatArray3816[anInt3815 * 16 + 0] = f;
		aFloatArray3816[anInt3815 * 16 + 1] = f_94_;
		aFloatArray3816[anInt3815 * 16 + 2] = f_97_;
		aFloatArray3816[anInt3815 * 16 + 3] = f_98_;
		aFloatArray3816[anInt3815 * 16 + 4] = f_95_;
		aFloatArray3816[anInt3815 * 16 + 5] = f_94_;
		aFloatArray3816[anInt3815 * 16 + 6] = f_99_;
		aFloatArray3816[anInt3815 * 16 + 7] = f_98_;
		aFloatArray3816[anInt3815 * 16 + 8] = f;
		aFloatArray3816[anInt3815 * 16 + 9] = f_96_;
		aFloatArray3816[anInt3815 * 16 + 10] = f_97_;
		aFloatArray3816[anInt3815 * 16 + 11] = f_100_;
		aFloatArray3816[anInt3815 * 16 + 12] = f_95_;
		aFloatArray3816[anInt3815 * 16 + 13] = f_96_;
		aFloatArray3816[anInt3815 * 16 + 14] = f_99_;
		aFloatArray3816[anInt3815 * 16 + 15] = f_100_;
		anInterface38Array3817[anInt3815] = interface38;
		if (aClass182_Sub1_3811.anInt9212 == 1)
		    anIntArray3818[anInt3815]
			= ~0xff00ff & i | (i & 0xff) << 16 | i >> 16 & 0xff;
		else
		    anIntArray3818[anInt3815] = i;
		anInt3815++;
		if (aClass348_3812 == Class348.aClass348_3733)
		    method6273();
	    }
	}
    }
    
    void method6288(float f, float f_109_, float f_110_, float f_111_,
		    float f_112_, float f_113_, float f_114_, float f_115_,
		    float f_116_, float f_117_, float f_118_, float f_119_,
		    float f_120_, float f_121_, float f_122_, float f_123_,
		    Interface38 interface38, int i) {
	if ((i & ~0xffffff) != 0) {
	    aClass182_Sub1_3811.method3187(anIntArray3819);
	    int i_124_ = anIntArray3819[0];
	    int i_125_ = anIntArray3819[1];
	    int i_126_ = anIntArray3819[2];
	    int i_127_ = anIntArray3819[3];
	    int i_128_ = 0;
	    int i_129_ = ((f < (float) i_124_ ? 1 : 0)
			  + (f_110_ < (float) i_124_ ? 1 : 0)
			  + (f_112_ < (float) i_124_ ? 1 : 0)
			  + (f_114_ < (float) i_124_ ? 1 : 0));
	    if (i_129_ != 4) {
		i_128_ |= i_129_;
		i_129_ = ((f > (float) i_126_ ? 1 : 0)
			  + (f_110_ > (float) i_126_ ? 1 : 0)
			  + (f_112_ > (float) i_126_ ? 1 : 0)
			  + (f_114_ > (float) i_126_ ? 1 : 0));
		if (i_129_ != 4) {
		    i_128_ |= i_129_;
		    i_129_ = ((f_109_ < (float) i_125_ ? 1 : 0)
			      + (f_111_ < (float) i_125_ ? 1 : 0)
			      + (f_113_ < (float) i_125_ ? 1 : 0)
			      + (f_115_ < (float) i_125_ ? 1 : 0));
		    if (i_129_ != 4) {
			i_128_ |= i_129_;
			i_129_ = ((f_109_ > (float) i_127_ ? 1 : 0)
				  + (f_111_ > (float) i_127_ ? 1 : 0)
				  + (f_113_ > (float) i_127_ ? 1 : 0)
				  + (f_115_ > (float) i_127_ ? 1 : 0));
			if (i_129_ != 4) {
			    i_128_ |= i_129_;
			    if (i_128_ != 0) {
				method6273();
				aClass182_Sub1_3811.method3186(true);
				aClass182_Sub1_3811.method3184(i_124_, i_125_,
							       i_126_, i_127_);
			    }
			    method6293();
			    f = method6298(f);
			    f_109_ = method6276(f_109_);
			    f_110_ = method6298(f_110_);
			    f_111_ = method6276(f_111_);
			    f_112_ = method6298(f_112_);
			    f_113_ = method6276(f_113_);
			    f_114_ = method6298(f_114_);
			    f_115_ = method6276(f_115_);
			    aFloatArray3816[anInt3815 * 16 + 0] = f;
			    aFloatArray3816[anInt3815 * 16 + 1] = f_109_;
			    aFloatArray3816[anInt3815 * 16 + 2] = f_116_;
			    aFloatArray3816[anInt3815 * 16 + 3] = f_117_;
			    aFloatArray3816[anInt3815 * 16 + 4] = f_110_;
			    aFloatArray3816[anInt3815 * 16 + 5] = f_111_;
			    aFloatArray3816[anInt3815 * 16 + 6] = f_118_;
			    aFloatArray3816[anInt3815 * 16 + 7] = f_119_;
			    aFloatArray3816[anInt3815 * 16 + 8] = f_112_;
			    aFloatArray3816[anInt3815 * 16 + 9] = f_113_;
			    aFloatArray3816[anInt3815 * 16 + 10] = f_120_;
			    aFloatArray3816[anInt3815 * 16 + 11] = f_121_;
			    aFloatArray3816[anInt3815 * 16 + 12] = f_114_;
			    aFloatArray3816[anInt3815 * 16 + 13] = f_115_;
			    aFloatArray3816[anInt3815 * 16 + 14] = f_122_;
			    aFloatArray3816[anInt3815 * 16 + 15] = f_123_;
			    anInterface38Array3817[anInt3815] = interface38;
			    if (aClass182_Sub1_3811.anInt9212 == 1)
				anIntArray3818[anInt3815]
				    = (~0xff00ff & i | (i & 0xff) << 16
				       | i >> 16 & 0xff);
			    else
				anIntArray3818[anInt3815] = i;
			    anInt3815++;
			    if (aClass348_3812 == Class348.aClass348_3733
				|| i_128_ > 0)
				method6273();
			    if (i_128_ != 0) {
				aClass182_Sub1_3811.method3186(false);
				aClass182_Sub1_3811.method3480();
				aClass182_Sub1_3811.method3184(i_124_, i_125_,
							       i_126_, i_127_);
			    }
			}
		    }
		}
	    }
	}
    }
    
    void method6289(float f, float f_130_, float f_131_, float f_132_,
		    float f_133_, float f_134_, float f_135_, float f_136_,
		    float f_137_, float f_138_, float f_139_, float f_140_,
		    float f_141_, float f_142_, float f_143_, float f_144_,
		    Interface38 interface38, int i) {
	if ((i & ~0xffffff) != 0) {
	    aClass182_Sub1_3811.method3187(anIntArray3819);
	    int i_145_ = anIntArray3819[0];
	    int i_146_ = anIntArray3819[1];
	    int i_147_ = anIntArray3819[2];
	    int i_148_ = anIntArray3819[3];
	    int i_149_ = 0;
	    int i_150_ = ((f < (float) i_145_ ? 1 : 0)
			  + (f_131_ < (float) i_145_ ? 1 : 0)
			  + (f_133_ < (float) i_145_ ? 1 : 0)
			  + (f_135_ < (float) i_145_ ? 1 : 0));
	    if (i_150_ != 4) {
		i_149_ |= i_150_;
		i_150_ = ((f > (float) i_147_ ? 1 : 0)
			  + (f_131_ > (float) i_147_ ? 1 : 0)
			  + (f_133_ > (float) i_147_ ? 1 : 0)
			  + (f_135_ > (float) i_147_ ? 1 : 0));
		if (i_150_ != 4) {
		    i_149_ |= i_150_;
		    i_150_ = ((f_130_ < (float) i_146_ ? 1 : 0)
			      + (f_132_ < (float) i_146_ ? 1 : 0)
			      + (f_134_ < (float) i_146_ ? 1 : 0)
			      + (f_136_ < (float) i_146_ ? 1 : 0));
		    if (i_150_ != 4) {
			i_149_ |= i_150_;
			i_150_ = ((f_130_ > (float) i_148_ ? 1 : 0)
				  + (f_132_ > (float) i_148_ ? 1 : 0)
				  + (f_134_ > (float) i_148_ ? 1 : 0)
				  + (f_136_ > (float) i_148_ ? 1 : 0));
			if (i_150_ != 4) {
			    i_149_ |= i_150_;
			    if (i_149_ != 0) {
				method6273();
				aClass182_Sub1_3811.method3186(true);
				aClass182_Sub1_3811.method3184(i_145_, i_146_,
							       i_147_, i_148_);
			    }
			    method6293();
			    f = method6298(f);
			    f_130_ = method6276(f_130_);
			    f_131_ = method6298(f_131_);
			    f_132_ = method6276(f_132_);
			    f_133_ = method6298(f_133_);
			    f_134_ = method6276(f_134_);
			    f_135_ = method6298(f_135_);
			    f_136_ = method6276(f_136_);
			    aFloatArray3816[anInt3815 * 16 + 0] = f;
			    aFloatArray3816[anInt3815 * 16 + 1] = f_130_;
			    aFloatArray3816[anInt3815 * 16 + 2] = f_137_;
			    aFloatArray3816[anInt3815 * 16 + 3] = f_138_;
			    aFloatArray3816[anInt3815 * 16 + 4] = f_131_;
			    aFloatArray3816[anInt3815 * 16 + 5] = f_132_;
			    aFloatArray3816[anInt3815 * 16 + 6] = f_139_;
			    aFloatArray3816[anInt3815 * 16 + 7] = f_140_;
			    aFloatArray3816[anInt3815 * 16 + 8] = f_133_;
			    aFloatArray3816[anInt3815 * 16 + 9] = f_134_;
			    aFloatArray3816[anInt3815 * 16 + 10] = f_141_;
			    aFloatArray3816[anInt3815 * 16 + 11] = f_142_;
			    aFloatArray3816[anInt3815 * 16 + 12] = f_135_;
			    aFloatArray3816[anInt3815 * 16 + 13] = f_136_;
			    aFloatArray3816[anInt3815 * 16 + 14] = f_143_;
			    aFloatArray3816[anInt3815 * 16 + 15] = f_144_;
			    anInterface38Array3817[anInt3815] = interface38;
			    if (aClass182_Sub1_3811.anInt9212 == 1)
				anIntArray3818[anInt3815]
				    = (~0xff00ff & i | (i & 0xff) << 16
				       | i >> 16 & 0xff);
			    else
				anIntArray3818[anInt3815] = i;
			    anInt3815++;
			    if (aClass348_3812 == Class348.aClass348_3733
				|| i_149_ > 0)
				method6273();
			    if (i_149_ != 0) {
				aClass182_Sub1_3811.method3186(false);
				aClass182_Sub1_3811.method3480();
				aClass182_Sub1_3811.method3184(i_145_, i_146_,
							       i_147_, i_148_);
			    }
			}
		    }
		}
	    }
	}
    }
    
    void method6290() {
	if (anInt3815 == anInt3814) {
	    anInt3814 *= 2;
	    float[] fs = new float[anInt3814 * 16];
	    for (int i = 0; i < anInt3815 * 16; i++)
		fs[i] = aFloatArray3816[i];
	    aFloatArray3816 = fs;
	    Interface38[] interface38s = new Interface38[anInt3814];
	    int[] is = new int[anInt3814];
	    for (int i = 0; i < anInt3815; i++) {
		interface38s[i] = anInterface38Array3817[i];
		is[i] = anIntArray3818[i];
	    }
	    anInterface38Array3817 = interface38s;
	    anIntArray3818 = is;
	}
    }
    
    void method6291() {
	if (anInt3815 == anInt3814) {
	    anInt3814 *= 2;
	    float[] fs = new float[anInt3814 * 16];
	    for (int i = 0; i < anInt3815 * 16; i++)
		fs[i] = aFloatArray3816[i];
	    aFloatArray3816 = fs;
	    Interface38[] interface38s = new Interface38[anInt3814];
	    int[] is = new int[anInt3814];
	    for (int i = 0; i < anInt3815; i++) {
		interface38s[i] = anInterface38Array3817[i];
		is[i] = anIntArray3818[i];
	    }
	    anInterface38Array3817 = interface38s;
	    anIntArray3818 = is;
	}
    }
    
    void method6292() {
	if (anInt3815 == anInt3814) {
	    anInt3814 *= 2;
	    float[] fs = new float[anInt3814 * 16];
	    for (int i = 0; i < anInt3815 * 16; i++)
		fs[i] = aFloatArray3816[i];
	    aFloatArray3816 = fs;
	    Interface38[] interface38s = new Interface38[anInt3814];
	    int[] is = new int[anInt3814];
	    for (int i = 0; i < anInt3815; i++) {
		interface38s[i] = anInterface38Array3817[i];
		is[i] = anIntArray3818[i];
	    }
	    anInterface38Array3817 = interface38s;
	    anIntArray3818 = is;
	}
    }
    
    void method6293() {
	if (anInt3815 == anInt3814) {
	    anInt3814 *= 2;
	    float[] fs = new float[anInt3814 * 16];
	    for (int i = 0; i < anInt3815 * 16; i++)
		fs[i] = aFloatArray3816[i];
	    aFloatArray3816 = fs;
	    Interface38[] interface38s = new Interface38[anInt3814];
	    int[] is = new int[anInt3814];
	    for (int i = 0; i < anInt3815; i++) {
		interface38s[i] = anInterface38Array3817[i];
		is[i] = anIntArray3818[i];
	    }
	    anInterface38Array3817 = interface38s;
	    anIntArray3818 = is;
	}
    }
    
    float method6294(float f) {
	int i = aClass182_Sub1_3811.method3566(-885631896).method2711();
	float f_151_
	    = (((1.0F - (f + aClass182_Sub1_3811.method14674()) / (float) i)
		* 2.0F)
	       - 1.0F);
	return f_151_;
    }
    
    float method6295(float f) {
	int i = aClass182_Sub1_3811.method3566(386547368).method2711();
	float f_152_
	    = (((1.0F - (f + aClass182_Sub1_3811.method14674()) / (float) i)
		* 2.0F)
	       - 1.0F);
	return f_152_;
    }
    
    float method6296(float f) {
	int i = aClass182_Sub1_3811.method3566(-1837591445).method2710();
	float f_153_
	    = ((f + aClass182_Sub1_3811.method14674()) / (float) i * 2.0F
	       - 1.0F);
	return f_153_;
    }
    
    void method6297() {
	aClass348_3823 = aClass348_3812;
	aClass348_3812 = Class348.aClass348_3732;
    }
    
    Class360(Class182_Sub1 class182_sub1, int i) {
	aClass182_Sub1_3811 = class182_sub1;
	anInterface35_3820 = aClass182_Sub1_3811.method14761(true);
	anInterface35_3820.method225(i * 96, 24);
	aClass337_3821
	    = (aClass182_Sub1_3811.method14762
	       (new Class378[]
		{ new Class378(new Class342[] { Class342.aClass342_3673,
						Class342.aClass342_3659,
						Class342.aClass342_3657 }) }));
	anInterface44_3822 = aClass182_Sub1_3811.method14701(false);
	int i_154_ = i * 6;
	anInterface44_3822.method29(i_154_);
	int i_155_
	    = i_154_ * (anInterface44_3822.method326().anInt1915 * -103623665);
	ByteBuffer bytebuffer = aClass182_Sub1_3811.aByteBuffer9271;
	aClass182_Sub1_3811.method14790(i_155_);
	bytebuffer.clear();
	for (int i_156_ = 0; i_156_ < i; i_156_++) {
	    bytebuffer.putShort((short) (i_156_ * 4));
	    bytebuffer.putShort((short) (i_156_ * 4 + 2));
	    bytebuffer.putShort((short) (i_156_ * 4 + 1));
	    bytebuffer.putShort((short) (i_156_ * 4 + 2));
	    bytebuffer.putShort((short) (i_156_ * 4 + 3));
	    bytebuffer.putShort((short) (i_156_ * 4 + 1));
	}
	anInterface44_3822.method215(0,
				     i_154_ * ((anInterface44_3822.method326()
						.anInt1915)
					       * -103623665),
				     aClass182_Sub1_3811.aLong9160);
	anInt3813 = i;
	anInt3815 = 0;
    }
    
    float method6298(float f) {
	int i = aClass182_Sub1_3811.method3566(-1116446054).method2710();
	float f_157_
	    = ((f + aClass182_Sub1_3811.method14674()) / (float) i * 2.0F
	       - 1.0F);
	return f_157_;
    }
    
    void method6299() {
	aClass348_3823 = aClass348_3812;
	aClass348_3812 = Class348.aClass348_3732;
    }
    
    void method6300() {
	if (aClass348_3823 != null) {
	    aClass348_3812 = aClass348_3823;
	    aClass348_3823 = null;
	}
    }
    
    void method6301() {
	if (aClass348_3823 != null) {
	    aClass348_3812 = aClass348_3823;
	    aClass348_3823 = null;
	}
    }
    
    Class348 method6302() {
	return aClass348_3812;
    }
    
    Class348 method6303() {
	return aClass348_3812;
    }
}
