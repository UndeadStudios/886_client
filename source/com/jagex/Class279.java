/* Class279 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class279
{
    int[] anIntArray2991;
    byte[] aByteArray2992;
    int[] anIntArray2993;
    static Class157 aClass157_2994;
    static int anInt2995;
    
    int method5149(byte[] is, int i, byte[] is_0_, int i_1_, int i_2_,
		   int i_3_) {
	if (i_2_ == 0)
	    return 0;
	int i_4_ = 0;
	i_2_ += i_1_;
	int i_5_ = i;
	for (;;) {
	    byte i_6_ = is[i_5_];
	    if (i_6_ < 0)
		i_4_ = anIntArray2993[i_4_];
	    else
		i_4_++;
	    int i_7_;
	    if ((i_7_ = anIntArray2993[i_4_]) < 0) {
		is_0_[i_1_++] = (byte) (i_7_ ^ 0xffffffff);
		if (i_1_ >= i_2_)
		    break;
		i_4_ = 0;
	    }
	    if (0 != (i_6_ & 0x40))
		i_4_ = anIntArray2993[i_4_];
	    else
		i_4_++;
	    if ((i_7_ = anIntArray2993[i_4_]) < 0) {
		is_0_[i_1_++] = (byte) (i_7_ ^ 0xffffffff);
		if (i_1_ >= i_2_)
		    break;
		i_4_ = 0;
	    }
	    if ((i_6_ & 0x20) != 0)
		i_4_ = anIntArray2993[i_4_];
	    else
		i_4_++;
	    if ((i_7_ = anIntArray2993[i_4_]) < 0) {
		is_0_[i_1_++] = (byte) (i_7_ ^ 0xffffffff);
		if (i_1_ >= i_2_)
		    break;
		i_4_ = 0;
	    }
	    if ((i_6_ & 0x10) != 0)
		i_4_ = anIntArray2993[i_4_];
	    else
		i_4_++;
	    if ((i_7_ = anIntArray2993[i_4_]) < 0) {
		is_0_[i_1_++] = (byte) (i_7_ ^ 0xffffffff);
		if (i_1_ >= i_2_)
		    break;
		i_4_ = 0;
	    }
	    if (0 != (i_6_ & 0x8))
		i_4_ = anIntArray2993[i_4_];
	    else
		i_4_++;
	    if ((i_7_ = anIntArray2993[i_4_]) < 0) {
		is_0_[i_1_++] = (byte) (i_7_ ^ 0xffffffff);
		if (i_1_ >= i_2_)
		    break;
		i_4_ = 0;
	    }
	    if (0 != (i_6_ & 0x4))
		i_4_ = anIntArray2993[i_4_];
	    else
		i_4_++;
	    if ((i_7_ = anIntArray2993[i_4_]) < 0) {
		is_0_[i_1_++] = (byte) (i_7_ ^ 0xffffffff);
		if (i_1_ >= i_2_)
		    break;
		i_4_ = 0;
	    }
	    if ((i_6_ & 0x2) != 0)
		i_4_ = anIntArray2993[i_4_];
	    else
		i_4_++;
	    if ((i_7_ = anIntArray2993[i_4_]) < 0) {
		is_0_[i_1_++] = (byte) (i_7_ ^ 0xffffffff);
		if (i_1_ >= i_2_)
		    break;
		i_4_ = 0;
	    }
	    if (0 != (i_6_ & 0x1))
		i_4_ = anIntArray2993[i_4_];
	    else
		i_4_++;
	    if ((i_7_ = anIntArray2993[i_4_]) < 0) {
		is_0_[i_1_++] = (byte) (i_7_ ^ 0xffffffff);
		if (i_1_ >= i_2_)
		    break;
		i_4_ = 0;
	    }
	    i_5_++;
	}
	return i_5_ + 1 - i;
    }
    
    int method5150(byte[] is, int i, int i_8_, byte[] is_9_, int i_10_,
		   int i_11_) {
	int i_12_ = 0;
	int i_13_ = i_10_ << 3;
	for (i_8_ += i; i < i_8_; i++) {
	    int i_14_ = is[i] & 0xff;
	    int i_15_ = anIntArray2991[i_14_];
	    int i_16_ = aByteArray2992[i_14_];
	    if (0 == i_16_)
		throw new RuntimeException(new StringBuilder().append("")
					       .append
					       (i_14_).toString());
	    int i_17_ = i_13_ >> 3;
	    int i_18_ = i_13_ & 0x7;
	    i_12_ &= -i_18_ >> 31;
	    int i_19_ = (i_18_ + i_16_ - 1 >> 3) + i_17_;
	    i_18_ += 24;
	    is_9_[i_17_] = (byte) (i_12_ |= i_15_ >>> i_18_);
	    if (i_17_ < i_19_) {
		i_17_++;
		i_18_ -= 8;
		is_9_[i_17_] = (byte) (i_12_ = i_15_ >>> i_18_);
		if (i_17_ < i_19_) {
		    i_17_++;
		    i_18_ -= 8;
		    is_9_[i_17_] = (byte) (i_12_ = i_15_ >>> i_18_);
		    if (i_17_ < i_19_) {
			i_17_++;
			i_18_ -= 8;
			is_9_[i_17_] = (byte) (i_12_ = i_15_ >>> i_18_);
			if (i_17_ < i_19_) {
			    i_17_++;
			    i_18_ -= 8;
			    is_9_[i_17_] = (byte) (i_12_ = i_15_ << -i_18_);
			}
		    }
		}
	    }
	    i_13_ += i_16_;
	}
	return (7 + i_13_ >> 3) - i_10_;
    }
    
    int method5151(byte[] is, int i, byte[] is_20_, int i_21_, int i_22_) {
	if (i_22_ == 0)
	    return 0;
	int i_23_ = 0;
	i_22_ += i_21_;
	int i_24_ = i;
	for (;;) {
	    byte i_25_ = is[i_24_];
	    if (i_25_ < 0)
		i_23_ = anIntArray2993[i_23_];
	    else
		i_23_++;
	    int i_26_;
	    if ((i_26_ = anIntArray2993[i_23_]) < 0) {
		is_20_[i_21_++] = (byte) (i_26_ ^ 0xffffffff);
		if (i_21_ >= i_22_)
		    break;
		i_23_ = 0;
	    }
	    if (0 != (i_25_ & 0x40))
		i_23_ = anIntArray2993[i_23_];
	    else
		i_23_++;
	    if ((i_26_ = anIntArray2993[i_23_]) < 0) {
		is_20_[i_21_++] = (byte) (i_26_ ^ 0xffffffff);
		if (i_21_ >= i_22_)
		    break;
		i_23_ = 0;
	    }
	    if ((i_25_ & 0x20) != 0)
		i_23_ = anIntArray2993[i_23_];
	    else
		i_23_++;
	    if ((i_26_ = anIntArray2993[i_23_]) < 0) {
		is_20_[i_21_++] = (byte) (i_26_ ^ 0xffffffff);
		if (i_21_ >= i_22_)
		    break;
		i_23_ = 0;
	    }
	    if ((i_25_ & 0x10) != 0)
		i_23_ = anIntArray2993[i_23_];
	    else
		i_23_++;
	    if ((i_26_ = anIntArray2993[i_23_]) < 0) {
		is_20_[i_21_++] = (byte) (i_26_ ^ 0xffffffff);
		if (i_21_ >= i_22_)
		    break;
		i_23_ = 0;
	    }
	    if (0 != (i_25_ & 0x8))
		i_23_ = anIntArray2993[i_23_];
	    else
		i_23_++;
	    if ((i_26_ = anIntArray2993[i_23_]) < 0) {
		is_20_[i_21_++] = (byte) (i_26_ ^ 0xffffffff);
		if (i_21_ >= i_22_)
		    break;
		i_23_ = 0;
	    }
	    if (0 != (i_25_ & 0x4))
		i_23_ = anIntArray2993[i_23_];
	    else
		i_23_++;
	    if ((i_26_ = anIntArray2993[i_23_]) < 0) {
		is_20_[i_21_++] = (byte) (i_26_ ^ 0xffffffff);
		if (i_21_ >= i_22_)
		    break;
		i_23_ = 0;
	    }
	    if ((i_25_ & 0x2) != 0)
		i_23_ = anIntArray2993[i_23_];
	    else
		i_23_++;
	    if ((i_26_ = anIntArray2993[i_23_]) < 0) {
		is_20_[i_21_++] = (byte) (i_26_ ^ 0xffffffff);
		if (i_21_ >= i_22_)
		    break;
		i_23_ = 0;
	    }
	    if (0 != (i_25_ & 0x1))
		i_23_ = anIntArray2993[i_23_];
	    else
		i_23_++;
	    if ((i_26_ = anIntArray2993[i_23_]) < 0) {
		is_20_[i_21_++] = (byte) (i_26_ ^ 0xffffffff);
		if (i_21_ >= i_22_)
		    break;
		i_23_ = 0;
	    }
	    i_24_++;
	}
	return i_24_ + 1 - i;
    }
    
    int method5152(byte[] is, int i, byte[] is_27_, int i_28_, int i_29_) {
	if (i_29_ == 0)
	    return 0;
	int i_30_ = 0;
	i_29_ += i_28_;
	int i_31_ = i;
	for (;;) {
	    byte i_32_ = is[i_31_];
	    if (i_32_ < 0)
		i_30_ = anIntArray2993[i_30_];
	    else
		i_30_++;
	    int i_33_;
	    if ((i_33_ = anIntArray2993[i_30_]) < 0) {
		is_27_[i_28_++] = (byte) (i_33_ ^ 0xffffffff);
		if (i_28_ >= i_29_)
		    break;
		i_30_ = 0;
	    }
	    if (0 != (i_32_ & 0x40))
		i_30_ = anIntArray2993[i_30_];
	    else
		i_30_++;
	    if ((i_33_ = anIntArray2993[i_30_]) < 0) {
		is_27_[i_28_++] = (byte) (i_33_ ^ 0xffffffff);
		if (i_28_ >= i_29_)
		    break;
		i_30_ = 0;
	    }
	    if ((i_32_ & 0x20) != 0)
		i_30_ = anIntArray2993[i_30_];
	    else
		i_30_++;
	    if ((i_33_ = anIntArray2993[i_30_]) < 0) {
		is_27_[i_28_++] = (byte) (i_33_ ^ 0xffffffff);
		if (i_28_ >= i_29_)
		    break;
		i_30_ = 0;
	    }
	    if ((i_32_ & 0x10) != 0)
		i_30_ = anIntArray2993[i_30_];
	    else
		i_30_++;
	    if ((i_33_ = anIntArray2993[i_30_]) < 0) {
		is_27_[i_28_++] = (byte) (i_33_ ^ 0xffffffff);
		if (i_28_ >= i_29_)
		    break;
		i_30_ = 0;
	    }
	    if (0 != (i_32_ & 0x8))
		i_30_ = anIntArray2993[i_30_];
	    else
		i_30_++;
	    if ((i_33_ = anIntArray2993[i_30_]) < 0) {
		is_27_[i_28_++] = (byte) (i_33_ ^ 0xffffffff);
		if (i_28_ >= i_29_)
		    break;
		i_30_ = 0;
	    }
	    if (0 != (i_32_ & 0x4))
		i_30_ = anIntArray2993[i_30_];
	    else
		i_30_++;
	    if ((i_33_ = anIntArray2993[i_30_]) < 0) {
		is_27_[i_28_++] = (byte) (i_33_ ^ 0xffffffff);
		if (i_28_ >= i_29_)
		    break;
		i_30_ = 0;
	    }
	    if ((i_32_ & 0x2) != 0)
		i_30_ = anIntArray2993[i_30_];
	    else
		i_30_++;
	    if ((i_33_ = anIntArray2993[i_30_]) < 0) {
		is_27_[i_28_++] = (byte) (i_33_ ^ 0xffffffff);
		if (i_28_ >= i_29_)
		    break;
		i_30_ = 0;
	    }
	    if (0 != (i_32_ & 0x1))
		i_30_ = anIntArray2993[i_30_];
	    else
		i_30_++;
	    if ((i_33_ = anIntArray2993[i_30_]) < 0) {
		is_27_[i_28_++] = (byte) (i_33_ ^ 0xffffffff);
		if (i_28_ >= i_29_)
		    break;
		i_30_ = 0;
	    }
	    i_31_++;
	}
	return i_31_ + 1 - i;
    }
    
    int method5153(byte[] is, int i, int i_34_, byte[] is_35_, int i_36_) {
	int i_37_ = 0;
	int i_38_ = i_36_ << 3;
	for (i_34_ += i; i < i_34_; i++) {
	    int i_39_ = is[i] & 0xff;
	    int i_40_ = anIntArray2991[i_39_];
	    int i_41_ = aByteArray2992[i_39_];
	    if (0 == i_41_)
		throw new RuntimeException(new StringBuilder().append("")
					       .append
					       (i_39_).toString());
	    int i_42_ = i_38_ >> 3;
	    int i_43_ = i_38_ & 0x7;
	    i_37_ &= -i_43_ >> 31;
	    int i_44_ = (i_43_ + i_41_ - 1 >> 3) + i_42_;
	    i_43_ += 24;
	    is_35_[i_42_] = (byte) (i_37_ |= i_40_ >>> i_43_);
	    if (i_42_ < i_44_) {
		i_42_++;
		i_43_ -= 8;
		is_35_[i_42_] = (byte) (i_37_ = i_40_ >>> i_43_);
		if (i_42_ < i_44_) {
		    i_42_++;
		    i_43_ -= 8;
		    is_35_[i_42_] = (byte) (i_37_ = i_40_ >>> i_43_);
		    if (i_42_ < i_44_) {
			i_42_++;
			i_43_ -= 8;
			is_35_[i_42_] = (byte) (i_37_ = i_40_ >>> i_43_);
			if (i_42_ < i_44_) {
			    i_42_++;
			    i_43_ -= 8;
			    is_35_[i_42_] = (byte) (i_37_ = i_40_ << -i_43_);
			}
		    }
		}
	    }
	    i_38_ += i_41_;
	}
	return (7 + i_38_ >> 3) - i_36_;
    }
    
    public Class279(byte[] is) {
	int i = is.length;
	anIntArray2991 = new int[i];
	aByteArray2992 = is;
	int[] is_45_ = new int[33];
	anIntArray2993 = new int[8];
	int i_46_ = 0;
	for (int i_47_ = 0; i_47_ < i; i_47_++) {
	    int i_48_ = is[i_47_];
	    if (i_48_ != 0) {
		int i_49_ = 1 << 32 - i_48_;
		int i_50_ = is_45_[i_48_];
		anIntArray2991[i_47_] = i_50_;
		int i_51_;
		if (0 != (i_50_ & i_49_))
		    i_51_ = is_45_[i_48_ - 1];
		else {
		    i_51_ = i_50_ | i_49_;
		    for (int i_52_ = i_48_ - 1; i_52_ >= 1; i_52_--) {
			int i_53_ = is_45_[i_52_];
			if (i_53_ != i_50_)
			    break;
			int i_54_ = 1 << 32 - i_52_;
			if ((i_53_ & i_54_) != 0) {
			    is_45_[i_52_] = is_45_[i_52_ - 1];
			    break;
			}
			is_45_[i_52_] = i_53_ | i_54_;
		    }
		}
		is_45_[i_48_] = i_51_;
		for (int i_55_ = i_48_ + 1; i_55_ <= 32; i_55_++) {
		    if (i_50_ == is_45_[i_55_])
			is_45_[i_55_] = i_51_;
		}
		int i_56_ = 0;
		for (int i_57_ = 0; i_57_ < i_48_; i_57_++) {
		    int i_58_ = -2147483648 >>> i_57_;
		    if ((i_50_ & i_58_) != 0) {
			if (anIntArray2993[i_56_] == 0)
			    anIntArray2993[i_56_] = i_46_;
			i_56_ = anIntArray2993[i_56_];
		    } else
			i_56_++;
		    if (i_56_ >= anIntArray2993.length) {
			int[] is_59_ = new int[2 * anIntArray2993.length];
			for (int i_60_ = 0; i_60_ < anIntArray2993.length;
			     i_60_++)
			    is_59_[i_60_] = anIntArray2993[i_60_];
			anIntArray2993 = is_59_;
		    }
		    i_58_ >>>= 1;
		}
		anIntArray2993[i_56_] = i_47_ ^ 0xffffffff;
		if (i_56_ >= i_46_)
		    i_46_ = 1 + i_56_;
	    }
	}
    }
    
    static final void method5154(Class259 class259, Class245 class245,
				 Class683 class683, byte i) {
	int i_61_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	class259.aBool2671 = 1 == i_61_;
	Class649.method10708(class259, (byte) 0);
    }
    
    static final void method5155
	(Class656_Sub1_Sub3_Sub1 class656_sub1_sub3_sub1, int i) {
	int i_62_ = (class656_sub1_sub3_sub1.anInt11995 * 1739204983
		     - client.anInt11083);
	int i_63_ = (class656_sub1_sub3_sub1.anInt11989 * 2003466752
		     + class656_sub1_sub3_sub1.method18608((byte) 28) * 256);
	int i_64_ = (class656_sub1_sub3_sub1.anInt11991 * -1828101632
		     + class656_sub1_sub3_sub1.method18608((byte) 32) * 256);
	int i_65_ = Class335.method5855(i_63_, i_64_,
					(class656_sub1_sub3_sub1.anInt11993
					 * 1369914933),
					2020563229);
	Class446 class446
	    = class656_sub1_sub3_sub1.method10818().aClass446_4807;
	class656_sub1_sub3_sub1.method10824
	    ((float) ((i_63_ - (int) class446.aFloat4895) / i_62_
		      + (int) class446.aFloat4895),
	     (float) ((i_65_ - (int) class446.aFloat4896) / i_62_
		      + (int) class446.aFloat4896),
	     (float) ((i_64_ - (int) class446.aFloat4897) / i_62_
		      + (int) class446.aFloat4897));
	class656_sub1_sub3_sub1.anInt12019 = 0;
	class656_sub1_sub3_sub1.method18625((1491619207
					     * (class656_sub1_sub3_sub1
						.anInt11997)),
					    (byte) 1);
    }
}
