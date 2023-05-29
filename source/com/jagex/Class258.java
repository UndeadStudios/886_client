/* Class258 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class258
{
    int[] anIntArray2553;
    int[] anIntArray2554;
    float[][] aFloatArrayArray2555;
    int anInt2556;
    int[] anIntArray2557;
    int anInt2558 = 0;
    int anInt2559 = 0;
    int anInt2560;
    
    float[] method4663(Class255 class255) {
	return aFloatArrayArray2555[method4671(class255)];
    }
    
    int method4664(Class255 class255) {
	int i;
	for (i = 0; anIntArray2553[i] >= 0;
	     i = class255.method4570() != 0 ? anIntArray2553[i] : i + 1) {
	    /* empty */
	}
	return ~anIntArray2553[i];
    }
    
    void method4665(Class255 class255) {
	class255.method4550(anInt2558 * 8 + anInt2559);
    }
    
    int method4666(Class255 class255) {
	int i;
	for (i = 0; anIntArray2553[i] >= 0;
	     i = class255.method4570() != 0 ? anIntArray2553[i] : i + 1) {
	    /* empty */
	}
	return ~anIntArray2553[i];
    }
    
    void method4667() {
	int[] is = new int[anInt2560];
	int[] is_0_ = new int[33];
	for (int i = 0; i < anInt2560; i++) {
	    int i_1_ = anIntArray2554[i];
	    if (i_1_ != 0) {
		int i_2_ = 1 << 32 - i_1_;
		int i_3_ = is_0_[i_1_];
		is[i] = i_3_;
		int i_4_;
		if ((i_3_ & i_2_) != 0)
		    i_4_ = is_0_[i_1_ - 1];
		else {
		    i_4_ = i_3_ | i_2_;
		    for (int i_5_ = i_1_ - 1; i_5_ >= 1; i_5_--) {
			int i_6_ = is_0_[i_5_];
			if (i_6_ != i_3_)
			    break;
			int i_7_ = 1 << 32 - i_5_;
			if ((i_6_ & i_7_) != 0) {
			    is_0_[i_5_] = is_0_[i_5_ - 1];
			    break;
			}
			is_0_[i_5_] = i_6_ | i_7_;
		    }
		}
		is_0_[i_1_] = i_4_;
		for (int i_8_ = i_1_ + 1; i_8_ <= 32; i_8_++) {
		    int i_9_ = is_0_[i_8_];
		    if (i_9_ == i_3_)
			is_0_[i_8_] = i_4_;
		}
	    }
	}
	anIntArray2553 = new int[8];
	int i = 0;
	for (int i_10_ = 0; i_10_ < anInt2560; i_10_++) {
	    int i_11_ = anIntArray2554[i_10_];
	    if (i_11_ != 0) {
		int i_12_ = is[i_10_];
		int i_13_ = 0;
		for (int i_14_ = 0; i_14_ < i_11_; i_14_++) {
		    int i_15_ = -2147483648 >>> i_14_;
		    if ((i_12_ & i_15_) != 0) {
			if (anIntArray2553[i_13_] == 0)
			    anIntArray2553[i_13_] = i;
			i_13_ = anIntArray2553[i_13_];
		    } else
			i_13_++;
		    if (i_13_ >= anIntArray2553.length) {
			int[] is_16_ = new int[anIntArray2553.length * 2];
			for (int i_17_ = 0; i_17_ < anIntArray2553.length;
			     i_17_++)
			    is_16_[i_17_] = anIntArray2553[i_17_];
			anIntArray2553 = is_16_;
		    }
		    i_15_ >>>= 1;
		}
		anIntArray2553[i_13_] = ~i_10_;
		if (i_13_ >= i)
		    i = i_13_ + 1;
	    }
	}
    }
    
    static int method4668(int i, int i_18_) {
	int i_19_;
	for (i_19_ = (int) Math.pow((double) i, 1.0 / (double) i_18_) + 1;
	     Class474.method7759(i_19_, i_18_, (byte) 1) > i; i_19_--) {
	    /* empty */
	}
	return i_19_;
    }
    
    float[] method4669(Class255 class255) {
	return aFloatArrayArray2555[method4671(class255)];
    }
    
    void method4670(Class255 class255) {
	class255.method4550(anInt2558 * 8 + anInt2559);
    }
    
    int method4671(Class255 class255) {
	int i;
	for (i = 0; anIntArray2553[i] >= 0;
	     i = class255.method4570() != 0 ? anIntArray2553[i] : i + 1) {
	    /* empty */
	}
	return ~anIntArray2553[i];
    }
    
    int method4672(Class255 class255) {
	int i;
	for (i = 0; anIntArray2553[i] >= 0;
	     i = class255.method4570() != 0 ? anIntArray2553[i] : i + 1) {
	    /* empty */
	}
	return ~anIntArray2553[i];
    }
    
    int method4673(Class255 class255) {
	int i;
	for (i = 0; anIntArray2553[i] >= 0;
	     i = class255.method4570() != 0 ? anIntArray2553[i] : i + 1) {
	    /* empty */
	}
	return ~anIntArray2553[i];
    }
    
    Class258() {
	/* empty */
    }
    
    void method4674() {
	int[] is = new int[anInt2560];
	int[] is_20_ = new int[33];
	for (int i = 0; i < anInt2560; i++) {
	    int i_21_ = anIntArray2554[i];
	    if (i_21_ != 0) {
		int i_22_ = 1 << 32 - i_21_;
		int i_23_ = is_20_[i_21_];
		is[i] = i_23_;
		int i_24_;
		if ((i_23_ & i_22_) != 0)
		    i_24_ = is_20_[i_21_ - 1];
		else {
		    i_24_ = i_23_ | i_22_;
		    for (int i_25_ = i_21_ - 1; i_25_ >= 1; i_25_--) {
			int i_26_ = is_20_[i_25_];
			if (i_26_ != i_23_)
			    break;
			int i_27_ = 1 << 32 - i_25_;
			if ((i_26_ & i_27_) != 0) {
			    is_20_[i_25_] = is_20_[i_25_ - 1];
			    break;
			}
			is_20_[i_25_] = i_26_ | i_27_;
		    }
		}
		is_20_[i_21_] = i_24_;
		for (int i_28_ = i_21_ + 1; i_28_ <= 32; i_28_++) {
		    int i_29_ = is_20_[i_28_];
		    if (i_29_ == i_23_)
			is_20_[i_28_] = i_24_;
		}
	    }
	}
	anIntArray2553 = new int[8];
	int i = 0;
	for (int i_30_ = 0; i_30_ < anInt2560; i_30_++) {
	    int i_31_ = anIntArray2554[i_30_];
	    if (i_31_ != 0) {
		int i_32_ = is[i_30_];
		int i_33_ = 0;
		for (int i_34_ = 0; i_34_ < i_31_; i_34_++) {
		    int i_35_ = -2147483648 >>> i_34_;
		    if ((i_32_ & i_35_) != 0) {
			if (anIntArray2553[i_33_] == 0)
			    anIntArray2553[i_33_] = i;
			i_33_ = anIntArray2553[i_33_];
		    } else
			i_33_++;
		    if (i_33_ >= anIntArray2553.length) {
			int[] is_36_ = new int[anIntArray2553.length * 2];
			for (int i_37_ = 0; i_37_ < anIntArray2553.length;
			     i_37_++)
			    is_36_[i_37_] = anIntArray2553[i_37_];
			anIntArray2553 = is_36_;
		    }
		    i_35_ >>>= 1;
		}
		anIntArray2553[i_33_] = ~i_30_;
		if (i_33_ >= i)
		    i = i_33_ + 1;
	    }
	}
    }
    
    void method4675(Class255 class255) {
	int i = class255.method4568();
	int i_38_ = class255.method4567();
	class255.method4550(24);
	anInt2556 = class255.method4550(16);
	anInt2560 = class255.method4550(24);
	if (anIntArray2554 == null || anIntArray2554.length != anInt2560)
	    anIntArray2554 = new int[anInt2560];
	boolean bool = class255.method4570() != 0;
	if (bool) {
	    int i_39_ = 0;
	    int i_40_ = class255.method4550(5) + 1;
	    while (i_39_ < anInt2560) {
		int i_41_
		    = class255.method4550(Textures.method3120((anInt2560
							       - i_39_),
							      (byte) -42));
		for (int i_42_ = 0; i_42_ < i_41_; i_42_++)
		    anIntArray2554[i_39_++] = i_40_;
		i_40_++;
	    }
	} else {
	    boolean bool_43_ = class255.method4570() != 0;
	    for (int i_44_ = 0; i_44_ < anInt2560; i_44_++) {
		if (bool_43_ && class255.method4570() == 0)
		    anIntArray2554[i_44_] = 0;
		else
		    anIntArray2554[i_44_] = class255.method4550(5) + 1;
	    }
	}
	method4667();
	int i_45_ = class255.method4550(4);
	if (i_45_ > 0) {
	    float f = class255.method4633(class255.method4550(32));
	    float f_46_ = class255.method4633(class255.method4550(32));
	    int i_47_ = class255.method4550(4) + 1;
	    boolean bool_48_ = class255.method4570() != 0;
	    int i_49_;
	    if (i_45_ == 1)
		i_49_ = method4668(anInt2560, anInt2556);
	    else
		i_49_ = anInt2560 * anInt2556;
	    anIntArray2557 = new int[i_49_];
	    for (int i_50_ = 0; i_50_ < i_49_; i_50_++)
		anIntArray2557[i_50_] = class255.method4550(i_47_);
	    aFloatArrayArray2555 = new float[anInt2560][anInt2556];
	    if (i_45_ == 1) {
		for (int i_51_ = 0; i_51_ < anInt2560; i_51_++) {
		    float f_52_ = 0.0F;
		    int i_53_ = 1;
		    for (int i_54_ = 0; i_54_ < anInt2556; i_54_++) {
			int i_55_ = i_51_ / i_53_ % i_49_;
			float f_56_ = ((float) anIntArray2557[i_55_] * f_46_
				       + f + f_52_);
			aFloatArrayArray2555[i_51_][i_54_] = f_56_;
			if (bool_48_)
			    f_52_ = f_56_;
			i_53_ *= i_49_;
		    }
		}
	    } else {
		for (int i_57_ = 0; i_57_ < anInt2560; i_57_++) {
		    float f_58_ = 0.0F;
		    int i_59_ = i_57_ * anInt2556;
		    for (int i_60_ = 0; i_60_ < anInt2556; i_60_++) {
			float f_61_ = ((float) anIntArray2557[i_59_] * f_46_
				       + f + f_58_);
			aFloatArrayArray2555[i_57_][i_60_] = f_61_;
			if (bool_48_)
			    f_58_ = f_61_;
			i_59_++;
		    }
		}
	    }
	}
	anInt2559 = class255.method4568() - i;
	anInt2558 = class255.method4567() - i_38_;
    }
    
    float[] method4676(Class255 class255) {
	return aFloatArrayArray2555[method4671(class255)];
    }
}
