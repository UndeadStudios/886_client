/* Class169_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class169_Sub2 extends Class169
{
    Class136 aClass136_9447;
    Class182_Sub3 aClass182_Sub3_9448;
    
    byte[] method15154(int[] is) {
	byte[] is_0_ = new byte[16384];
	for (int i = 0; i < 16; i++) {
	    for (int i_1_ = 0; i_1_ < 16; i_1_++) {
		for (int i_2_ = 0; i_2_ < 16; i_2_++) {
		    int i_3_ = is[256 * i_1_ + 16 * i_2_ + i];
		    int i_4_ = (i_2_ * 256 + i_1_ * 16 + i) * 4;
		    is_0_[i_4_ + 0] = (byte) (i_3_ >> 16 & 0xff);
		    is_0_[i_4_ + 1] = (byte) (i_3_ >> 8 & 0xff);
		    is_0_[i_4_ + 2] = (byte) (i_3_ & 0xff);
		    is_0_[i_4_ + 3] = (byte) -1;
		}
	    }
	}
	return is_0_;
    }
    
    Class136 method15155() {
	return aClass136_9447;
    }
    
    Class169_Sub2(Class182_Sub3 class182_sub3, int[] is) {
	aClass182_Sub3_9448 = class182_sub3;
	if (aClass182_Sub3_9448.aBool9805) {
	    byte[] is_5_ = method15159(is);
	    aClass136_9447
		= new Class136_Sub1(aClass182_Sub3_9448,
				    Class165.aClass165_1771,
				    Class178.aClass178_1905, 16, 16, 16, is_5_,
				    Class165.aClass165_1771);
	} else
	    aClass136_9447 = new Class136_Sub2(aClass182_Sub3_9448, 3553, 256,
					       16, false, is, 256, 0, false);
    }
    
    Class136 method15156() {
	return aClass136_9447;
    }
    
    Class136 method15157() {
	return aClass136_9447;
    }
    
    byte[] method15158(int[] is) {
	byte[] is_6_ = new byte[16384];
	for (int i = 0; i < 16; i++) {
	    for (int i_7_ = 0; i_7_ < 16; i_7_++) {
		for (int i_8_ = 0; i_8_ < 16; i_8_++) {
		    int i_9_ = is[256 * i_7_ + 16 * i_8_ + i];
		    int i_10_ = (i_8_ * 256 + i_7_ * 16 + i) * 4;
		    is_6_[i_10_ + 0] = (byte) (i_9_ >> 16 & 0xff);
		    is_6_[i_10_ + 1] = (byte) (i_9_ >> 8 & 0xff);
		    is_6_[i_10_ + 2] = (byte) (i_9_ & 0xff);
		    is_6_[i_10_ + 3] = (byte) -1;
		}
	    }
	}
	return is_6_;
    }
    
    byte[] method15159(int[] is) {
	byte[] is_11_ = new byte[16384];
	for (int i = 0; i < 16; i++) {
	    for (int i_12_ = 0; i_12_ < 16; i_12_++) {
		for (int i_13_ = 0; i_13_ < 16; i_13_++) {
		    int i_14_ = is[256 * i_12_ + 16 * i_13_ + i];
		    int i_15_ = (i_13_ * 256 + i_12_ * 16 + i) * 4;
		    is_11_[i_15_ + 0] = (byte) (i_14_ >> 16 & 0xff);
		    is_11_[i_15_ + 1] = (byte) (i_14_ >> 8 & 0xff);
		    is_11_[i_15_ + 2] = (byte) (i_14_ & 0xff);
		    is_11_[i_15_ + 3] = (byte) -1;
		}
	    }
	}
	return is_11_;
    }
}
