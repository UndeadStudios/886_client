/* Class152_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class152_Sub2 extends Class152
{
    Class136_Sub2_Sub1 aClass136_Sub2_Sub1_9505;
    
    static Class152_Sub2 method15236(Class182_Sub3 class182_sub3, int i,
				     int i_0_, int[] is, int[] is_1_) {
	byte[] is_2_ = new byte[i * i_0_];
	for (int i_3_ = 0; i_3_ < i_0_; i_3_++) {
	    int i_4_ = i_3_ * i + is[i_3_];
	    for (int i_5_ = 0; i_5_ < is_1_[i_3_]; i_5_++)
		is_2_[i_4_++] = (byte) -1;
	}
	return new Class152_Sub2(class182_sub3, i, i_0_, is_2_);
    }
    
    Class152_Sub2(Class182_Sub3 class182_sub3, int i, int i_6_, byte[] is) {
	aClass136_Sub2_Sub1_9505
	    = Class136_Sub2_Sub1.method18033(class182_sub3,
					     Class165.aClass165_1772,
					     Class178.aClass178_1905, i, i_6_,
					     false, is,
					     Class165.aClass165_1772);
	aClass136_Sub2_Sub1_9505.method14474(false, false);
    }
    
    static Class152_Sub2 method15237(Class182_Sub3 class182_sub3, int i,
				     int i_7_, int[] is, int[] is_8_) {
	byte[] is_9_ = new byte[i * i_7_];
	for (int i_10_ = 0; i_10_ < i_7_; i_10_++) {
	    int i_11_ = i_10_ * i + is[i_10_];
	    for (int i_12_ = 0; i_12_ < is_8_[i_10_]; i_12_++)
		is_9_[i_11_++] = (byte) -1;
	}
	return new Class152_Sub2(class182_sub3, i, i_7_, is_9_);
    }
    
    static Class152_Sub2 method15238(Class182_Sub3 class182_sub3, int i,
				     int i_13_, int[] is, int[] is_14_) {
	byte[] is_15_ = new byte[i * i_13_];
	for (int i_16_ = 0; i_16_ < i_13_; i_16_++) {
	    int i_17_ = i_16_ * i + is[i_16_];
	    for (int i_18_ = 0; i_18_ < is_14_[i_16_]; i_18_++)
		is_15_[i_17_++] = (byte) -1;
	}
	return new Class152_Sub2(class182_sub3, i, i_13_, is_15_);
    }
}
