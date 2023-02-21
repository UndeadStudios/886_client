/* Class152_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class152_Sub3 extends Class152
{
    Interface38 anInterface38_9884;
    
    Class152_Sub3(Class182_Sub1 class182_sub1, int i, int i_0_, int[] is) {
	anInterface38_9884 = class182_sub1.method14723(i, i_0_, false, is);
	anInterface38_9884.method231(false, false);
    }
    
    static Class152_Sub3 method15580(Class182_Sub1 class182_sub1, int i,
				     int i_1_, int[] is, int[] is_2_) {
	if (class182_sub1.method14705(Class165.aClass165_1772,
				      Class178.aClass178_1905)) {
	    byte[] is_3_ = new byte[i * i_1_];
	    for (int i_4_ = 0; i_4_ < i_1_; i_4_++) {
		int i_5_ = i_4_ * i + is[i_4_];
		for (int i_6_ = 0; i_6_ < is_2_[i_4_]; i_6_++)
		    is_3_[i_5_++] = (byte) -1;
	    }
	    return new Class152_Sub3(class182_sub1, i, i_1_, is_3_);
	}
	int[] is_7_ = new int[i * i_1_];
	for (int i_8_ = 0; i_8_ < i_1_; i_8_++) {
	    int i_9_ = i_8_ * i + is[i_8_];
	    for (int i_10_ = 0; i_10_ < is_2_[i_8_]; i_10_++)
		is_7_[i_9_++] = -16777216;
	}
	return new Class152_Sub3(class182_sub1, i, i_1_, is_7_);
    }
    
    static Class152_Sub3 method15581(Class182_Sub1 class182_sub1, int i,
				     int i_11_, int[] is, int[] is_12_) {
	if (class182_sub1.method14705(Class165.aClass165_1772,
				      Class178.aClass178_1905)) {
	    byte[] is_13_ = new byte[i * i_11_];
	    for (int i_14_ = 0; i_14_ < i_11_; i_14_++) {
		int i_15_ = i_14_ * i + is[i_14_];
		for (int i_16_ = 0; i_16_ < is_12_[i_14_]; i_16_++)
		    is_13_[i_15_++] = (byte) -1;
	    }
	    return new Class152_Sub3(class182_sub1, i, i_11_, is_13_);
	}
	int[] is_17_ = new int[i * i_11_];
	for (int i_18_ = 0; i_18_ < i_11_; i_18_++) {
	    int i_19_ = i_18_ * i + is[i_18_];
	    for (int i_20_ = 0; i_20_ < is_12_[i_18_]; i_20_++)
		is_17_[i_19_++] = -16777216;
	}
	return new Class152_Sub3(class182_sub1, i, i_11_, is_17_);
    }
    
    static Class152_Sub3 method15582(Class182_Sub1 class182_sub1, int i,
				     int i_21_, int[] is, int[] is_22_) {
	if (class182_sub1.method14705(Class165.aClass165_1772,
				      Class178.aClass178_1905)) {
	    byte[] is_23_ = new byte[i * i_21_];
	    for (int i_24_ = 0; i_24_ < i_21_; i_24_++) {
		int i_25_ = i_24_ * i + is[i_24_];
		for (int i_26_ = 0; i_26_ < is_22_[i_24_]; i_26_++)
		    is_23_[i_25_++] = (byte) -1;
	    }
	    return new Class152_Sub3(class182_sub1, i, i_21_, is_23_);
	}
	int[] is_27_ = new int[i * i_21_];
	for (int i_28_ = 0; i_28_ < i_21_; i_28_++) {
	    int i_29_ = i_28_ * i + is[i_28_];
	    for (int i_30_ = 0; i_30_ < is_22_[i_28_]; i_30_++)
		is_27_[i_29_++] = -16777216;
	}
	return new Class152_Sub3(class182_sub1, i, i_21_, is_27_);
    }
    
    Class152_Sub3(Class182_Sub1 class182_sub1, int i, int i_31_, byte[] is) {
	anInterface38_9884 = class182_sub1.method14724(Class165.aClass165_1772,
						       i, i_31_, false, is);
	anInterface38_9884.method231(false, false);
    }
    
    static Class152_Sub3 method15583(Class182_Sub1 class182_sub1, int i,
				     int i_32_, int[] is, int[] is_33_) {
	if (class182_sub1.method14705(Class165.aClass165_1772,
				      Class178.aClass178_1905)) {
	    byte[] is_34_ = new byte[i * i_32_];
	    for (int i_35_ = 0; i_35_ < i_32_; i_35_++) {
		int i_36_ = i_35_ * i + is[i_35_];
		for (int i_37_ = 0; i_37_ < is_33_[i_35_]; i_37_++)
		    is_34_[i_36_++] = (byte) -1;
	    }
	    return new Class152_Sub3(class182_sub1, i, i_32_, is_34_);
	}
	int[] is_38_ = new int[i * i_32_];
	for (int i_39_ = 0; i_39_ < i_32_; i_39_++) {
	    int i_40_ = i_39_ * i + is[i_39_];
	    for (int i_41_ = 0; i_41_ < is_33_[i_39_]; i_41_++)
		is_38_[i_40_++] = -16777216;
	}
	return new Class152_Sub3(class182_sub1, i, i_32_, is_38_);
    }
}
