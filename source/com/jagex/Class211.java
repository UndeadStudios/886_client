/* Class211 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class211
{
    public int anInt2263;
    public int anInt2264;
    public boolean aBool2265 = false;
    public int anInt2266;
    public int anInt2267;
    public int anInt2268;
    
    public boolean method3927(int i, int i_0_) {
	if (!aBool2265)
	    return false;
	int i_1_ = anInt2263 - anInt2264;
	int i_2_ = anInt2267 - anInt2266;
	int i_3_ = i_1_ * i_1_ + i_2_ * i_2_;
	int i_4_
	    = i * i_1_ + i_0_ * i_2_ - (anInt2264 * i_1_ + anInt2266 * i_2_);
	if (i_4_ <= 0) {
	    int i_5_ = anInt2264 - i;
	    int i_6_ = anInt2266 - i_0_;
	    return i_5_ * i_5_ + i_6_ * i_6_ < anInt2268 * anInt2268;
	}
	if (i_4_ > i_3_) {
	    int i_7_ = anInt2263 - i;
	    int i_8_ = anInt2267 - i_0_;
	    return i_7_ * i_7_ + i_8_ * i_8_ < anInt2268 * anInt2268;
	}
	int i_9_ = 10;
	if (i_4_ != (i_4_ & 0x1fffff))
	    i_9_ = 5;
	i_4_ = (i_4_ << i_9_) / i_3_;
	int i_10_ = anInt2264 + (i_1_ * i_4_ >> i_9_) - i;
	int i_11_ = anInt2266 + (i_2_ * i_4_ >> i_9_) - i_0_;
	return i_10_ * i_10_ + i_11_ * i_11_ < anInt2268 * anInt2268;
    }
    
    public void method3928(Class443 class443, Class435 class435,
			   Class435 class435_12_, float f, float f_13_,
			   float f_14_, float f_15_) {
	boolean bool = false;
	aBool2265 = true;
	int i = (int) (class443.aFloat4877 + class443.aFloat4875) >> 1;
	int i_16_ = (int) (class443.aFloat4871 + class443.aFloat4874) >> 1;
	int i_17_ = i;
	int i_18_ = (int) class443.aFloat4873;
	int i_19_ = i_16_;
	float f_20_ = (class435_12_.aFloatArray4830[0] * (float) i_17_
		       + class435_12_.aFloatArray4830[4] * (float) i_18_
		       + class435_12_.aFloatArray4830[8] * (float) i_19_
		       + class435_12_.aFloatArray4830[12]);
	float f_21_ = (class435_12_.aFloatArray4830[1] * (float) i_17_
		       + class435_12_.aFloatArray4830[5] * (float) i_18_
		       + class435_12_.aFloatArray4830[9] * (float) i_19_
		       + class435_12_.aFloatArray4830[13]);
	float f_22_ = (class435_12_.aFloatArray4830[2] * (float) i_17_
		       + class435_12_.aFloatArray4830[6] * (float) i_18_
		       + class435_12_.aFloatArray4830[10] * (float) i_19_
		       + class435_12_.aFloatArray4830[14]);
	float f_23_ = (class435_12_.aFloatArray4830[3] * (float) i_17_
		       + class435_12_.aFloatArray4830[7] * (float) i_18_
		       + class435_12_.aFloatArray4830[11] * (float) i_19_
		       + class435_12_.aFloatArray4830[15]);
	if (f_22_ >= -f_23_) {
	    anInt2264 = (int) (f + f_14_ * f_20_ / f_23_);
	    anInt2266 = (int) (f_13_ + f_15_ * f_21_ / f_23_);
	} else
	    bool = true;
	i_17_ = i;
	i_18_ = (int) class443.aFloat4869;
	i_19_ = i_16_;
	float f_24_ = (class435_12_.aFloatArray4830[0] * (float) i_17_
		       + class435_12_.aFloatArray4830[4] * (float) i_18_
		       + class435_12_.aFloatArray4830[8] * (float) i_19_
		       + class435_12_.aFloatArray4830[12]);
	float f_25_ = (class435_12_.aFloatArray4830[1] * (float) i_17_
		       + class435_12_.aFloatArray4830[5] * (float) i_18_
		       + class435_12_.aFloatArray4830[9] * (float) i_19_
		       + class435_12_.aFloatArray4830[13]);
	float f_26_ = (class435_12_.aFloatArray4830[2] * (float) i_17_
		       + class435_12_.aFloatArray4830[6] * (float) i_18_
		       + class435_12_.aFloatArray4830[10] * (float) i_19_
		       + class435_12_.aFloatArray4830[14]);
	float f_27_ = (class435_12_.aFloatArray4830[3] * (float) i_17_
		       + class435_12_.aFloatArray4830[7] * (float) i_18_
		       + class435_12_.aFloatArray4830[11] * (float) i_19_
		       + class435_12_.aFloatArray4830[15]);
	if (f_26_ >= -f_27_) {
	    anInt2263 = (int) (f + f_14_ * f_24_ / f_27_);
	    anInt2267 = (int) (f_13_ + f_15_ * f_25_ / f_27_);
	} else
	    bool = true;
	if (bool) {
	    if (f_22_ < -f_23_ && f_26_ < -f_27_)
		aBool2265 = false;
	    else if (f_22_ < -f_23_) {
		float f_28_ = (f_22_ + f_23_) / (f_26_ + f_27_) - 1.0F;
		float f_29_ = f_20_ + f_28_ * (f_24_ - f_20_);
		float f_30_ = f_21_ + f_28_ * (f_25_ - f_21_);
		float f_31_ = f_23_ + f_28_ * (f_27_ - f_23_);
		anInt2264 = (int) (f + f_14_ * f_29_ / f_31_);
		anInt2266 = (int) (f_13_ + f_15_ * f_30_ / f_31_);
	    } else if (f_26_ < -f_27_) {
		float f_32_ = (f_26_ + f_27_) / (f_22_ + f_23_) - 1.0F;
		float f_33_ = f_24_ + f_32_ * (f_20_ - f_24_);
		float f_34_ = f_25_ + f_32_ * (f_21_ - f_25_);
		float f_35_ = f_27_ + f_32_ * (f_23_ - f_27_);
		anInt2263 = (int) (f + f_14_ * f_33_ / f_35_);
		anInt2267 = (int) (f_13_ + f_15_ * f_34_ / f_35_);
	    }
	}
	if (aBool2265) {
	    float f_36_
		= ((float) Math.sqrt(Math.pow((double) (class443.aFloat4875
							- class443.aFloat4877),
					      2.0)
				     + Math.pow((double) (class443.aFloat4874
							  - (class443
							     .aFloat4871)),
						2.0))
		   / 2.0F);
	    if (f_22_ / f_23_ > f_26_ / f_27_) {
		float f_37_ = (f_20_ + class435.aFloatArray4830[0] * f_36_
			       + class435.aFloatArray4830[12]);
		float f_38_ = (f_23_ + class435.aFloatArray4830[3] * f_36_
			       + class435.aFloatArray4830[15]);
		anInt2268
		    = (int) (f - (float) anInt2264 + f_14_ * f_37_ / f_38_);
	    } else {
		float f_39_ = (f_24_ + class435.aFloatArray4830[0] * f_36_
			       + class435.aFloatArray4830[12]);
		float f_40_ = (f_27_ + class435.aFloatArray4830[3] * f_36_
			       + class435.aFloatArray4830[15]);
		anInt2268
		    = (int) (f - (float) anInt2263 + f_14_ * f_39_ / f_40_);
	    }
	    aBool2265 = true;
	}
    }
    
    public void method3929(Class443 class443, Class435 class435,
			   Class435 class435_41_, float f, float f_42_,
			   float f_43_, float f_44_) {
	boolean bool = false;
	aBool2265 = true;
	int i = (int) (class443.aFloat4877 + class443.aFloat4875) >> 1;
	int i_45_ = (int) (class443.aFloat4871 + class443.aFloat4874) >> 1;
	int i_46_ = i;
	int i_47_ = (int) class443.aFloat4873;
	int i_48_ = i_45_;
	float f_49_ = (class435_41_.aFloatArray4830[0] * (float) i_46_
		       + class435_41_.aFloatArray4830[4] * (float) i_47_
		       + class435_41_.aFloatArray4830[8] * (float) i_48_
		       + class435_41_.aFloatArray4830[12]);
	float f_50_ = (class435_41_.aFloatArray4830[1] * (float) i_46_
		       + class435_41_.aFloatArray4830[5] * (float) i_47_
		       + class435_41_.aFloatArray4830[9] * (float) i_48_
		       + class435_41_.aFloatArray4830[13]);
	float f_51_ = (class435_41_.aFloatArray4830[2] * (float) i_46_
		       + class435_41_.aFloatArray4830[6] * (float) i_47_
		       + class435_41_.aFloatArray4830[10] * (float) i_48_
		       + class435_41_.aFloatArray4830[14]);
	float f_52_ = (class435_41_.aFloatArray4830[3] * (float) i_46_
		       + class435_41_.aFloatArray4830[7] * (float) i_47_
		       + class435_41_.aFloatArray4830[11] * (float) i_48_
		       + class435_41_.aFloatArray4830[15]);
	if (f_51_ >= -f_52_) {
	    anInt2264 = (int) (f + f_43_ * f_49_ / f_52_);
	    anInt2266 = (int) (f_42_ + f_44_ * f_50_ / f_52_);
	} else
	    bool = true;
	i_46_ = i;
	i_47_ = (int) class443.aFloat4869;
	i_48_ = i_45_;
	float f_53_ = (class435_41_.aFloatArray4830[0] * (float) i_46_
		       + class435_41_.aFloatArray4830[4] * (float) i_47_
		       + class435_41_.aFloatArray4830[8] * (float) i_48_
		       + class435_41_.aFloatArray4830[12]);
	float f_54_ = (class435_41_.aFloatArray4830[1] * (float) i_46_
		       + class435_41_.aFloatArray4830[5] * (float) i_47_
		       + class435_41_.aFloatArray4830[9] * (float) i_48_
		       + class435_41_.aFloatArray4830[13]);
	float f_55_ = (class435_41_.aFloatArray4830[2] * (float) i_46_
		       + class435_41_.aFloatArray4830[6] * (float) i_47_
		       + class435_41_.aFloatArray4830[10] * (float) i_48_
		       + class435_41_.aFloatArray4830[14]);
	float f_56_ = (class435_41_.aFloatArray4830[3] * (float) i_46_
		       + class435_41_.aFloatArray4830[7] * (float) i_47_
		       + class435_41_.aFloatArray4830[11] * (float) i_48_
		       + class435_41_.aFloatArray4830[15]);
	if (f_55_ >= -f_56_) {
	    anInt2263 = (int) (f + f_43_ * f_53_ / f_56_);
	    anInt2267 = (int) (f_42_ + f_44_ * f_54_ / f_56_);
	} else
	    bool = true;
	if (bool) {
	    if (f_51_ < -f_52_ && f_55_ < -f_56_)
		aBool2265 = false;
	    else if (f_51_ < -f_52_) {
		float f_57_ = (f_51_ + f_52_) / (f_55_ + f_56_) - 1.0F;
		float f_58_ = f_49_ + f_57_ * (f_53_ - f_49_);
		float f_59_ = f_50_ + f_57_ * (f_54_ - f_50_);
		float f_60_ = f_52_ + f_57_ * (f_56_ - f_52_);
		anInt2264 = (int) (f + f_43_ * f_58_ / f_60_);
		anInt2266 = (int) (f_42_ + f_44_ * f_59_ / f_60_);
	    } else if (f_55_ < -f_56_) {
		float f_61_ = (f_55_ + f_56_) / (f_51_ + f_52_) - 1.0F;
		float f_62_ = f_53_ + f_61_ * (f_49_ - f_53_);
		float f_63_ = f_54_ + f_61_ * (f_50_ - f_54_);
		float f_64_ = f_56_ + f_61_ * (f_52_ - f_56_);
		anInt2263 = (int) (f + f_43_ * f_62_ / f_64_);
		anInt2267 = (int) (f_42_ + f_44_ * f_63_ / f_64_);
	    }
	}
	if (aBool2265) {
	    float f_65_
		= ((float) Math.sqrt(Math.pow((double) (class443.aFloat4875
							- class443.aFloat4877),
					      2.0)
				     + Math.pow((double) (class443.aFloat4874
							  - (class443
							     .aFloat4871)),
						2.0))
		   / 2.0F);
	    if (f_51_ / f_52_ > f_55_ / f_56_) {
		float f_66_ = (f_49_ + class435.aFloatArray4830[0] * f_65_
			       + class435.aFloatArray4830[12]);
		float f_67_ = (f_52_ + class435.aFloatArray4830[3] * f_65_
			       + class435.aFloatArray4830[15]);
		anInt2268
		    = (int) (f - (float) anInt2264 + f_43_ * f_66_ / f_67_);
	    } else {
		float f_68_ = (f_53_ + class435.aFloatArray4830[0] * f_65_
			       + class435.aFloatArray4830[12]);
		float f_69_ = (f_56_ + class435.aFloatArray4830[3] * f_65_
			       + class435.aFloatArray4830[15]);
		anInt2268
		    = (int) (f - (float) anInt2263 + f_43_ * f_68_ / f_69_);
	    }
	    aBool2265 = true;
	}
    }
    
    public boolean method3930(int i, int i_70_) {
	if (!aBool2265)
	    return false;
	int i_71_ = anInt2263 - anInt2264;
	int i_72_ = anInt2267 - anInt2266;
	int i_73_ = i_71_ * i_71_ + i_72_ * i_72_;
	int i_74_ = (i * i_71_ + i_70_ * i_72_
		     - (anInt2264 * i_71_ + anInt2266 * i_72_));
	if (i_74_ <= 0) {
	    int i_75_ = anInt2264 - i;
	    int i_76_ = anInt2266 - i_70_;
	    return i_75_ * i_75_ + i_76_ * i_76_ < anInt2268 * anInt2268;
	}
	if (i_74_ > i_73_) {
	    int i_77_ = anInt2263 - i;
	    int i_78_ = anInt2267 - i_70_;
	    return i_77_ * i_77_ + i_78_ * i_78_ < anInt2268 * anInt2268;
	}
	int i_79_ = 10;
	if (i_74_ != (i_74_ & 0x1fffff))
	    i_79_ = 5;
	i_74_ = (i_74_ << i_79_) / i_73_;
	int i_80_ = anInt2264 + (i_71_ * i_74_ >> i_79_) - i;
	int i_81_ = anInt2266 + (i_72_ * i_74_ >> i_79_) - i_70_;
	return i_80_ * i_80_ + i_81_ * i_81_ < anInt2268 * anInt2268;
    }
    
    public boolean method3931(int i, int i_82_) {
	if (!aBool2265)
	    return false;
	int i_83_ = anInt2263 - anInt2264;
	int i_84_ = anInt2267 - anInt2266;
	int i_85_ = i_83_ * i_83_ + i_84_ * i_84_;
	int i_86_ = (i * i_83_ + i_82_ * i_84_
		     - (anInt2264 * i_83_ + anInt2266 * i_84_));
	if (i_86_ <= 0) {
	    int i_87_ = anInt2264 - i;
	    int i_88_ = anInt2266 - i_82_;
	    return i_87_ * i_87_ + i_88_ * i_88_ < anInt2268 * anInt2268;
	}
	if (i_86_ > i_85_) {
	    int i_89_ = anInt2263 - i;
	    int i_90_ = anInt2267 - i_82_;
	    return i_89_ * i_89_ + i_90_ * i_90_ < anInt2268 * anInt2268;
	}
	int i_91_ = 10;
	if (i_86_ != (i_86_ & 0x1fffff))
	    i_91_ = 5;
	i_86_ = (i_86_ << i_91_) / i_85_;
	int i_92_ = anInt2264 + (i_83_ * i_86_ >> i_91_) - i;
	int i_93_ = anInt2266 + (i_84_ * i_86_ >> i_91_) - i_82_;
	return i_92_ * i_92_ + i_93_ * i_93_ < anInt2268 * anInt2268;
    }
    
    public boolean method3932(int i, int i_94_) {
	if (!aBool2265)
	    return false;
	int i_95_ = anInt2263 - anInt2264;
	int i_96_ = anInt2267 - anInt2266;
	int i_97_ = i_95_ * i_95_ + i_96_ * i_96_;
	int i_98_ = (i * i_95_ + i_94_ * i_96_
		     - (anInt2264 * i_95_ + anInt2266 * i_96_));
	if (i_98_ <= 0) {
	    int i_99_ = anInt2264 - i;
	    int i_100_ = anInt2266 - i_94_;
	    return i_99_ * i_99_ + i_100_ * i_100_ < anInt2268 * anInt2268;
	}
	if (i_98_ > i_97_) {
	    int i_101_ = anInt2263 - i;
	    int i_102_ = anInt2267 - i_94_;
	    return i_101_ * i_101_ + i_102_ * i_102_ < anInt2268 * anInt2268;
	}
	int i_103_ = 10;
	if (i_98_ != (i_98_ & 0x1fffff))
	    i_103_ = 5;
	i_98_ = (i_98_ << i_103_) / i_97_;
	int i_104_ = anInt2264 + (i_95_ * i_98_ >> i_103_) - i;
	int i_105_ = anInt2266 + (i_96_ * i_98_ >> i_103_) - i_94_;
	return i_104_ * i_104_ + i_105_ * i_105_ < anInt2268 * anInt2268;
    }
}
