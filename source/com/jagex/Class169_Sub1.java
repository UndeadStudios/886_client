/* Class169_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class169_Sub1 extends Class169
{
    Class182_Sub1 aClass182_Sub1_9142;
    Interface39 anInterface39_9143;
    
    byte[] method14647(int[] is) {
	byte[] is_0_ = new byte[16384];
	for (int i = 0; i < 16; i++) {
	    for (int i_1_ = 0; i_1_ < 16; i_1_++) {
		for (int i_2_ = 0; i_2_ < 16; i_2_++) {
		    int i_3_ = is[256 * i_1_ + 16 * i_2_ + i];
		    int i_4_ = (i_2_ * 256 + i_1_ * 16 + i) * 4;
		    if (aClass182_Sub1_9142.anInt9212 == 0) {
			is_0_[i_4_ + 0] = (byte) (i_3_ & 0xff);
			is_0_[i_4_ + 1] = (byte) (i_3_ >> 8 & 0xff);
			is_0_[i_4_ + 2] = (byte) (i_3_ >> 16 & 0xff);
			is_0_[i_4_ + 3] = (byte) -1;
		    } else {
			is_0_[i_4_ + 0] = (byte) (i_3_ >> 16 & 0xff);
			is_0_[i_4_ + 1] = (byte) (i_3_ >> 8 & 0xff);
			is_0_[i_4_ + 2] = (byte) (i_3_ & 0xff);
			is_0_[i_4_ + 3] = (byte) -1;
		    }
		}
	    }
	}
	return is_0_;
    }
    
    Class169_Sub1(Class182_Sub1 class182_sub1, int[] is) {
	aClass182_Sub1_9142 = class182_sub1;
	if (aClass182_Sub1_9142.aBool9307) {
	    byte[] is_5_ = method14648(is);
	    anInterface39_9143
		= aClass182_Sub1_9142.method14886(Class165.aClass165_1771, 16,
						  16, 16, false, is_5_);
	} else
	    anInterface39_9143
		= aClass182_Sub1_9142.method14723(256, 16, false, is);
    }
    
    byte[] method14648(int[] is) {
	byte[] is_6_ = new byte[16384];
	for (int i = 0; i < 16; i++) {
	    for (int i_7_ = 0; i_7_ < 16; i_7_++) {
		for (int i_8_ = 0; i_8_ < 16; i_8_++) {
		    int i_9_ = is[256 * i_7_ + 16 * i_8_ + i];
		    int i_10_ = (i_8_ * 256 + i_7_ * 16 + i) * 4;
		    if (aClass182_Sub1_9142.anInt9212 == 0) {
			is_6_[i_10_ + 0] = (byte) (i_9_ & 0xff);
			is_6_[i_10_ + 1] = (byte) (i_9_ >> 8 & 0xff);
			is_6_[i_10_ + 2] = (byte) (i_9_ >> 16 & 0xff);
			is_6_[i_10_ + 3] = (byte) -1;
		    } else {
			is_6_[i_10_ + 0] = (byte) (i_9_ >> 16 & 0xff);
			is_6_[i_10_ + 1] = (byte) (i_9_ >> 8 & 0xff);
			is_6_[i_10_ + 2] = (byte) (i_9_ & 0xff);
			is_6_[i_10_ + 3] = (byte) -1;
		    }
		}
	    }
	}
	return is_6_;
    }
    
    public Interface39 method14649() {
	return anInterface39_9143;
    }
    
    byte[] method14650(int[] is) {
	byte[] is_11_ = new byte[16384];
	for (int i = 0; i < 16; i++) {
	    for (int i_12_ = 0; i_12_ < 16; i_12_++) {
		for (int i_13_ = 0; i_13_ < 16; i_13_++) {
		    int i_14_ = is[256 * i_12_ + 16 * i_13_ + i];
		    int i_15_ = (i_13_ * 256 + i_12_ * 16 + i) * 4;
		    if (aClass182_Sub1_9142.anInt9212 == 0) {
			is_11_[i_15_ + 0] = (byte) (i_14_ & 0xff);
			is_11_[i_15_ + 1] = (byte) (i_14_ >> 8 & 0xff);
			is_11_[i_15_ + 2] = (byte) (i_14_ >> 16 & 0xff);
			is_11_[i_15_ + 3] = (byte) -1;
		    } else {
			is_11_[i_15_ + 0] = (byte) (i_14_ >> 16 & 0xff);
			is_11_[i_15_ + 1] = (byte) (i_14_ >> 8 & 0xff);
			is_11_[i_15_ + 2] = (byte) (i_14_ & 0xff);
			is_11_[i_15_ + 3] = (byte) -1;
		    }
		}
	    }
	}
	return is_11_;
    }
    
    public Interface39 method14651() {
	return anInterface39_9143;
    }
}
