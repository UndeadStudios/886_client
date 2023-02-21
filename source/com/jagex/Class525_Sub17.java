/* Class525_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class525_Sub17 extends Class525
{
    int anInt10555;
    int anInt10556;
    static int[] anIntArray10557;
    boolean aBool10558;
    int[] anIntArray10559;
    int anInt10560;
    
    void method16270(int i, int i_0_) {
	if (i != 0 || i_0_ != 0) {
	    if (anIntArray10557 == null
		|| anIntArray10557.length != anIntArray10559.length)
		anIntArray10557 = new int[anIntArray10559.length];
	    int i_1_ = anIntArray10559.length;
	    int i_2_ = i;
	    int i_3_ = anInt10556 - 1;
	    int i_4_ = anInt10556 * i_0_;
	    int i_5_ = i_1_ - 1;
	    for (int i_6_ = 0; i_6_ < i_1_; i_6_ += anInt10556) {
		int i_7_ = i_6_ + i_4_ & i_5_;
		for (int i_8_ = 0; i_8_ < anInt10556; i_8_++) {
		    int i_9_ = i_6_ + i_8_;
		    int i_10_ = i_7_ + (i_8_ + i_2_ & i_3_);
		    anIntArray10557[i_9_] = anIntArray10559[i_10_];
		}
	    }
	    int[] is = anIntArray10559;
	    anIntArray10559 = anIntArray10557;
	    anIntArray10557 = is;
	}
    }
    
    int[] method16271() {
	return anIntArray10559;
    }
    
    void method16272(int i, int i_11_) {
	if (i != 0 || i_11_ != 0) {
	    if (anIntArray10557 == null
		|| anIntArray10557.length != anIntArray10559.length)
		anIntArray10557 = new int[anIntArray10559.length];
	    int i_12_ = anIntArray10559.length;
	    int i_13_ = i;
	    int i_14_ = anInt10556 - 1;
	    int i_15_ = anInt10556 * i_11_;
	    int i_16_ = i_12_ - 1;
	    for (int i_17_ = 0; i_17_ < i_12_; i_17_ += anInt10556) {
		int i_18_ = i_17_ + i_15_ & i_16_;
		for (int i_19_ = 0; i_19_ < anInt10556; i_19_++) {
		    int i_20_ = i_17_ + i_19_;
		    int i_21_ = i_18_ + (i_19_ + i_13_ & i_14_);
		    anIntArray10557[i_20_] = anIntArray10559[i_21_];
		}
	    }
	    int[] is = anIntArray10559;
	    anIntArray10559 = anIntArray10557;
	    anIntArray10557 = is;
	}
    }
    
    int[] method16273() {
	return anIntArray10559;
    }
    
    void method16274(int i, int i_22_) {
	if (i != 0 || i_22_ != 0) {
	    if (anIntArray10557 == null
		|| anIntArray10557.length != anIntArray10559.length)
		anIntArray10557 = new int[anIntArray10559.length];
	    int i_23_ = anIntArray10559.length;
	    int i_24_ = i;
	    int i_25_ = anInt10556 - 1;
	    int i_26_ = anInt10556 * i_22_;
	    int i_27_ = i_23_ - 1;
	    for (int i_28_ = 0; i_28_ < i_23_; i_28_ += anInt10556) {
		int i_29_ = i_28_ + i_26_ & i_27_;
		for (int i_30_ = 0; i_30_ < anInt10556; i_30_++) {
		    int i_31_ = i_28_ + i_30_;
		    int i_32_ = i_29_ + (i_30_ + i_24_ & i_25_);
		    anIntArray10557[i_31_] = anIntArray10559[i_32_];
		}
	    }
	    int[] is = anIntArray10559;
	    anIntArray10559 = anIntArray10557;
	    anIntArray10557 = is;
	}
    }
    
    Class525_Sub17(int i, int i_33_, int[] is, boolean bool) {
	anInt10560 = i;
	anInt10556 = i_33_;
	anIntArray10559 = is;
	if (bool) {
	    int[] is_34_ = new int[anInt10556];
	    int[] is_35_ = new int[anInt10556];
	    int[] is_36_ = new int[anInt10556];
	    int[] is_37_ = new int[anInt10556];
	    if (anIntArray10557 == null
		|| anIntArray10557.length != anIntArray10559.length)
		anIntArray10557 = new int[anIntArray10559.length];
	    int i_38_ = anInt10556;
	    int i_39_ = anInt10556;
	    int i_40_ = i_38_ - 1;
	    int i_41_ = i_39_ - 1;
	    int i_42_ = i_38_ * i_39_;
	    int i_44_;
	    int i_43_ = i_44_ = 1 * i_38_;
	    for (int i_45_ = 2; i_45_ >= 0; i_45_--) {
		for (int i_46_ = i_40_; i_46_ >= 0; i_46_--) {
		    int i_47_ = anIntArray10559[--i_44_];
		    is_34_[i_46_] += i_47_ >> 24 & 0xff;
		    is_35_[i_46_] += i_47_ >> 16 & 0xff;
		    is_36_[i_46_] += i_47_ >> 8 & 0xff;
		    is_37_[i_46_] += i_47_ & 0xff;
		}
		if (i_44_ == 0)
		    i_44_ = i_42_;
	    }
	    int i_48_ = i_42_;
	    for (int i_49_ = i_41_; i_49_ >= 0; i_49_--) {
		int i_50_ = 1;
		int i_51_ = 1;
		int i_52_ = 0;
		int i_53_ = 0;
		int i_54_ = 0;
		int i_55_ = 0;
		for (int i_56_ = 2; i_56_ >= 0; i_56_--) {
		    i_51_--;
		    i_55_ += is_34_[i_51_];
		    i_54_ += is_35_[i_51_];
		    i_52_ += is_36_[i_51_];
		    i_53_ += is_37_[i_51_];
		    if (i_51_ == 0)
			i_51_ = i_38_;
		}
		for (int i_57_ = i_40_; i_57_ >= 0; i_57_--) {
		    i_51_--;
		    i_50_--;
		    int i_58_ = i_55_ / 9;
		    int i_59_ = i_54_ / 9;
		    int i_60_ = i_52_ / 9;
		    int i_61_ = i_53_ / 9;
		    anIntArray10557[--i_48_]
			= i_58_ << 24 | i_59_ << 16 | i_60_ << 8 | i_61_;
		    i_55_ += is_34_[i_51_] - is_34_[i_50_];
		    i_54_ += is_35_[i_51_] - is_35_[i_50_];
		    i_53_ += is_37_[i_51_] - is_37_[i_50_];
		    i_52_ += is_36_[i_51_] - is_36_[i_50_];
		    if (i_51_ == 0)
			i_51_ = i_38_;
		    if (i_50_ == 0)
			i_50_ = i_38_;
		}
		for (int i_62_ = i_40_; i_62_ >= 0; i_62_--) {
		    int i_63_ = anIntArray10559[--i_44_];
		    int i_64_ = anIntArray10559[--i_43_];
		    is_34_[i_62_]
			+= (i_63_ >> 24 & 0xff) - (i_64_ >> 24 & 0xff);
		    is_35_[i_62_]
			+= (i_63_ >> 16 & 0xff) - (i_64_ >> 16 & 0xff);
		    is_36_[i_62_] += (i_63_ >> 8 & 0xff) - (i_64_ >> 8 & 0xff);
		    is_37_[i_62_] += (i_63_ & 0xff) - (i_64_ & 0xff);
		}
		if (i_44_ == 0)
		    i_44_ = i_42_;
		if (i_43_ == 0)
		    i_43_ = i_42_;
	    }
	    int[] is_65_ = anIntArray10559;
	    anIntArray10559 = anIntArray10557;
	    anIntArray10557 = is_65_;
	}
    }
    
    void method16275(int i, int i_66_) {
	if (i != 0 || i_66_ != 0) {
	    if (anIntArray10557 == null
		|| anIntArray10557.length != anIntArray10559.length)
		anIntArray10557 = new int[anIntArray10559.length];
	    int i_67_ = anIntArray10559.length;
	    int i_68_ = i;
	    int i_69_ = anInt10556 - 1;
	    int i_70_ = anInt10556 * i_66_;
	    int i_71_ = i_67_ - 1;
	    for (int i_72_ = 0; i_72_ < i_67_; i_72_ += anInt10556) {
		int i_73_ = i_72_ + i_70_ & i_71_;
		for (int i_74_ = 0; i_74_ < anInt10556; i_74_++) {
		    int i_75_ = i_72_ + i_74_;
		    int i_76_ = i_73_ + (i_74_ + i_68_ & i_69_);
		    anIntArray10557[i_75_] = anIntArray10559[i_76_];
		}
	    }
	    int[] is = anIntArray10559;
	    anIntArray10559 = anIntArray10557;
	    anIntArray10557 = is;
	}
    }
}
