/* Class173_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class173_Sub1 extends Class173
{
    int anInt9123;
    int anInt9124;
    boolean aBool9125 = false;
    int anInt9126;
    int anInt9127;
    int anInt9128;
    int[] anIntArray9129;
    int anInt9130;
    
    public void method2825(int i, int i_0_, int i_1_) {
	for (int i_2_ = 1; i_2_ < anIntArray9129.length; i_2_++) {
	    int i_3_ = anIntArray9129[i_2_] >> 16 & 0xff;
	    i_3_ += i;
	    if (i_3_ < 0)
		i_3_ = 0;
	    else if (i_3_ > 255)
		i_3_ = 255;
	    int i_4_ = anIntArray9129[i_2_] >> 8 & 0xff;
	    i_4_ += i_0_;
	    if (i_4_ < 0)
		i_4_ = 0;
	    else if (i_4_ > 255)
		i_4_ = 255;
	    int i_5_ = anIntArray9129[i_2_] >> 0 & 0xff;
	    i_5_ += i_1_;
	    if (i_5_ < 0)
		i_5_ = 0;
	    else if (i_5_ > 255)
		i_5_ = 255;
	    anIntArray9129[i_2_] = (anIntArray9129[i_2_] & ~0xffffff
				    | i_3_ << 16 | i_4_ << 8 | i_5_);
	}
    }
    
    public boolean method2762() {
	return false;
    }
    
    public boolean method2763() {
	return aBool9125;
    }
    
    public int method2772() {
	return anInt9123;
    }
    
    public int method2765() {
	return anInt9130;
    }
    
    public void method2831(int i) {
	int i_6_ = 0;
	aBool9125 = false;
	int[] is = new int[anInt9123 * anInt9130];
	for (int i_7_ = 0; i_7_ < anInt9130; i_7_++) {
	    for (int i_8_ = 0; i_8_ < anInt9123; i_8_++) {
		int i_9_ = anIntArray9129[i_6_];
		if ((i_9_ & ~0xffffff) == 0) {
		    if (i_8_ > 0
			&& (anIntArray9129[i_6_ - 1] & ~0xffffff) != 0)
			i_9_ = i;
		    else if (i_7_ > 0 && (anIntArray9129[i_6_ - anInt9123]
					  & ~0xffffff) != 0)
			i_9_ = i;
		    else if (i_8_ < anInt9123 - 1
			     && (anIntArray9129[i_6_ + 1] & ~0xffffff) != 0)
			i_9_ = i;
		    else if (i_7_ < anInt9130 - 1
			     && ((anIntArray9129[i_6_ + anInt9123] & ~0xffffff)
				 != 0))
			i_9_ = i;
		}
		if ((i_9_ & ~0xffffff) != -16777216)
		    aBool9125 = true;
		is[i_6_++] = i_9_;
	    }
	}
	anIntArray9129 = is;
    }
    
    public void method2796(int i) {
	int i_10_ = 0;
	aBool9125 = false;
	int[] is = new int[anInt9123 * anInt9130];
	for (int i_11_ = 0; i_11_ < anInt9130; i_11_++) {
	    for (int i_12_ = 0; i_12_ < anInt9123; i_12_++) {
		int i_13_ = anIntArray9129[i_10_];
		if ((i_13_ & ~0xffffff) == 0) {
		    if (i_12_ > 0
			&& (anIntArray9129[i_10_ - 1] & ~0xffffff) != 0)
			i_13_ = i;
		    else if (i_11_ > 0 && (anIntArray9129[i_10_ - anInt9123]
					   & ~0xffffff) != 0)
			i_13_ = i;
		    else if (i_12_ < anInt9123 - 1
			     && (anIntArray9129[i_10_ + 1] & ~0xffffff) != 0)
			i_13_ = i;
		    else if (i_11_ < anInt9130 - 1
			     && (anIntArray9129[i_10_ + anInt9123]
				 & ~0xffffff) != 0)
			i_13_ = i;
		}
		if ((i_13_ & ~0xffffff) != -16777216)
		    aBool9125 = true;
		is[i_10_++] = i_13_;
	    }
	}
	anIntArray9129 = is;
    }
    
    public int method2766() {
	return anInt9124;
    }
    
    public int method2767() {
	return anInt9126;
    }
    
    public int method2780(int i, int i_14_) {
	return anIntArray9129[i + i_14_ * anInt9123];
    }
    
    public int method2769() {
	return anInt9128;
    }
    
    public void method2770() {
	anInt9128 = 0;
	anInt9127 = 0;
	anInt9126 = 0;
	anInt9124 = 0;
    }
    
    public void method2775(int i) {
	int i_15_ = method2771();
	int i_16_ = method2819();
	if (anInt9123 != i_15_ || anInt9130 != i_16_) {
	    int i_17_ = i;
	    if (i_17_ > anInt9124)
		i_17_ = anInt9124;
	    int i_18_ = i;
	    if (i_18_ + anInt9124 + anInt9123 > i_15_)
		i_18_ = i_15_ - anInt9124 - anInt9123;
	    int i_19_ = i;
	    if (i_19_ > anInt9127)
		i_19_ = anInt9127;
	    int i_20_ = i;
	    if (i_20_ + anInt9127 + anInt9130 > i_16_)
		i_20_ = i_16_ - anInt9127 - anInt9130;
	    int i_21_ = anInt9123 + i_17_ + i_18_;
	    int i_22_ = anInt9130 + i_19_ + i_20_;
	    int[] is = new int[i_21_ * i_22_];
	    aBool9125 = false;
	    for (int i_23_ = 0; i_23_ < anInt9130; i_23_++) {
		int i_24_ = i_23_ * anInt9123;
		int i_25_ = (i_23_ + i_19_) * i_21_ + i_17_;
		for (int i_26_ = 0; i_26_ < anInt9123; i_26_++) {
		    if ((anIntArray9129[i_24_] & ~0xffffff) != -16777216)
			aBool9125 = true;
		    is[i_25_++] = anIntArray9129[i_24_++];
		}
	    }
	    anInt9124 -= i_17_;
	    anInt9127 -= i_19_;
	    anInt9126 -= i_18_;
	    anInt9128 -= i_20_;
	    anInt9123 = i_21_;
	    anInt9130 = i_22_;
	    anIntArray9129 = is;
	}
    }
    
    public boolean method2786() {
	return aBool9125;
    }
    
    public void method2823(int i) {
	for (int i_27_ = anInt9130 - 1; i_27_ > 0; i_27_--) {
	    int i_28_ = i_27_ * anInt9123;
	    for (int i_29_ = anInt9123 - 1; i_29_ > 0; i_29_--) {
		if ((anIntArray9129[i_29_ + i_28_] & ~0xffffff) == 0
		    && (anIntArray9129[i_29_ + i_28_ - 1 - anInt9123]
			& ~0xffffff) != 0)
		    anIntArray9129[i_29_ + i_28_] = i;
	    }
	}
    }
    
    public int method2768() {
	return anInt9127;
    }
    
    public void method2776() {
	int[] is = anIntArray9129;
	for (int i = (anInt9130 >> 1) - 1; i >= 0; i--) {
	    int i_30_ = i * anInt9123;
	    int i_31_ = (anInt9130 - i - 1) * anInt9123;
	    for (int i_32_ = -anInt9123; i_32_ < 0; i_32_++) {
		int i_33_ = is[i_30_];
		is[i_30_] = is[i_31_];
		is[i_31_] = i_33_;
		i_30_++;
		i_31_++;
	    }
	}
	int i = anInt9127;
	anInt9127 = anInt9128;
	anInt9128 = i;
    }
    
    public void method2777() {
	int[] is = new int[anInt9123 * anInt9130];
	int i = 0;
	for (int i_34_ = 0; i_34_ < anInt9123; i_34_++) {
	    for (int i_35_ = anInt9130 - 1; i_35_ >= 0; i_35_--)
		is[i++] = anIntArray9129[i_34_ + i_35_ * anInt9123];
	}
	anIntArray9129 = is;
	int i_36_ = anInt9127;
	anInt9127 = anInt9124;
	anInt9124 = anInt9128;
	anInt9128 = anInt9126;
	anInt9126 = i_36_;
	i_36_ = anInt9130;
	anInt9130 = anInt9123;
	anInt9123 = i_36_;
    }
    
    public int[] method2778(boolean bool) {
	if (bool && (method2771() != anInt9123 || method2819() != anInt9130)) {
	    int i = method2771();
	    int[] is = new int[i * method2819()];
	    for (int i_37_ = 0; i_37_ < anInt9130; i_37_++) {
		int i_38_ = i_37_ * anInt9123;
		int i_39_ = anInt9124 + (i_37_ + anInt9127) * i;
		for (int i_40_ = 0; i_40_ < anInt9123; i_40_++) {
		    is[i_39_++] = anIntArray9129[i_38_];
		    i_38_++;
		}
	    }
	    return is;
	}
	return anIntArray9129;
    }
    
    public void method2779(int i, int i_41_, int i_42_) {
	for (int i_43_ = 1; i_43_ < anIntArray9129.length; i_43_++) {
	    int i_44_ = anIntArray9129[i_43_] >> 16 & 0xff;
	    i_44_ += i;
	    if (i_44_ < 0)
		i_44_ = 0;
	    else if (i_44_ > 255)
		i_44_ = 255;
	    int i_45_ = anIntArray9129[i_43_] >> 8 & 0xff;
	    i_45_ += i_41_;
	    if (i_45_ < 0)
		i_45_ = 0;
	    else if (i_45_ > 255)
		i_45_ = 255;
	    int i_46_ = anIntArray9129[i_43_] >> 0 & 0xff;
	    i_46_ += i_42_;
	    if (i_46_ < 0)
		i_46_ = 0;
	    else if (i_46_ > 255)
		i_46_ = 255;
	    anIntArray9129[i_43_] = (anIntArray9129[i_43_] & ~0xffffff
				     | i_44_ << 16 | i_45_ << 8 | i_46_);
	}
    }
    
    public int method2785() {
	return anInt9126;
    }
    
    public int method2798() {
	return anInt9124;
    }
    
    public boolean method2811() {
	return aBool9125;
    }
    
    public int method2782() {
	return anInt9123 + anInt9124 + anInt9126;
    }
    
    Class173_Sub1(int i, int i_47_, int[] is) {
	anInt9123 = i;
	anInt9130 = i_47_;
	anIntArray9129 = is;
	for (int i_48_ = 0; i_48_ < anIntArray9129.length; i_48_++) {
	    if ((anIntArray9129[i_48_] & ~0xffffff) != -16777216) {
		aBool9125 = true;
		break;
	    }
	}
    }
    
    public boolean method2790() {
	return aBool9125;
    }
    
    public void method2773() {
	int[] is = anIntArray9129;
	for (int i = anInt9130 - 1; i >= 0; i--) {
	    int i_49_ = i * anInt9123;
	    for (int i_50_ = (i + 1) * anInt9123; i_49_ < i_50_; i_49_++) {
		i_50_--;
		int i_51_ = is[i_49_];
		is[i_49_] = is[i_50_];
		is[i_50_] = i_51_;
	    }
	}
	int i = anInt9124;
	anInt9124 = anInt9126;
	anInt9126 = i;
    }
    
    public int method2787() {
	return anInt9130;
    }
    
    public int method2788() {
	return anInt9130;
    }
    
    public int method2814() {
	return anInt9130;
    }
    
    public void method2821() {
	int[] is = new int[anInt9123 * anInt9130];
	int i = 0;
	for (int i_52_ = 0; i_52_ < anInt9123; i_52_++) {
	    for (int i_53_ = anInt9130 - 1; i_53_ >= 0; i_53_--)
		is[i++] = anIntArray9129[i_52_ + i_53_ * anInt9123];
	}
	anIntArray9129 = is;
	int i_54_ = anInt9127;
	anInt9127 = anInt9124;
	anInt9124 = anInt9128;
	anInt9128 = anInt9126;
	anInt9126 = i_54_;
	i_54_ = anInt9130;
	anInt9130 = anInt9123;
	anInt9123 = i_54_;
    }
    
    public int method2792() {
	return anInt9123 + anInt9124 + anInt9126;
    }
    
    public void method2806() {
	anInt9128 = 0;
	anInt9127 = 0;
	anInt9126 = 0;
	anInt9124 = 0;
    }
    
    public int method2793() {
	return anInt9123 + anInt9124 + anInt9126;
    }
    
    public int method2784() {
	return anInt9123 + anInt9124 + anInt9126;
    }
    
    public int method2795() {
	return anInt9123 + anInt9124 + anInt9126;
    }
    
    public int method2761() {
	return anInt9130 + anInt9127 + anInt9128;
    }
    
    public void method2822() {
	int[] is = new int[anInt9123 * anInt9130];
	int i = 0;
	for (int i_55_ = 0; i_55_ < anInt9123; i_55_++) {
	    for (int i_56_ = anInt9130 - 1; i_56_ >= 0; i_56_--)
		is[i++] = anIntArray9129[i_55_ + i_56_ * anInt9123];
	}
	anIntArray9129 = is;
	int i_57_ = anInt9127;
	anInt9127 = anInt9124;
	anInt9124 = anInt9128;
	anInt9128 = anInt9126;
	anInt9126 = i_57_;
	i_57_ = anInt9130;
	anInt9130 = anInt9123;
	anInt9123 = i_57_;
    }
    
    public int method2829(int i, int i_58_) {
	return anIntArray9129[i + i_58_ * anInt9123];
    }
    
    public int method2808() {
	return anInt9124;
    }
    
    public int method2797() {
	return anInt9130 + anInt9127 + anInt9128;
    }
    
    public int method2799() {
	return anInt9127;
    }
    
    public int method2802() {
	return anInt9127;
    }
    
    public int method2803() {
	return anInt9127;
    }
    
    public int method2828() {
	return anInt9127;
    }
    
    public int method2805() {
	return anInt9128;
    }
    
    public int method2791() {
	return anInt9123 + anInt9124 + anInt9126;
    }
    
    public void method2807() {
	anInt9128 = 0;
	anInt9127 = 0;
	anInt9126 = 0;
	anInt9124 = 0;
    }
    
    public void method2783() {
	anInt9128 = 0;
	anInt9127 = 0;
	anInt9126 = 0;
	anInt9124 = 0;
    }
    
    public void method2809() {
	anInt9128 = 0;
	anInt9127 = 0;
	anInt9126 = 0;
	anInt9124 = 0;
    }
    
    public void method2810(int i) {
	int i_59_ = method2771();
	int i_60_ = method2819();
	if (anInt9123 != i_59_ || anInt9130 != i_60_) {
	    int i_61_ = i;
	    if (i_61_ > anInt9124)
		i_61_ = anInt9124;
	    int i_62_ = i;
	    if (i_62_ + anInt9124 + anInt9123 > i_59_)
		i_62_ = i_59_ - anInt9124 - anInt9123;
	    int i_63_ = i;
	    if (i_63_ > anInt9127)
		i_63_ = anInt9127;
	    int i_64_ = i;
	    if (i_64_ + anInt9127 + anInt9130 > i_60_)
		i_64_ = i_60_ - anInt9127 - anInt9130;
	    int i_65_ = anInt9123 + i_61_ + i_62_;
	    int i_66_ = anInt9130 + i_63_ + i_64_;
	    int[] is = new int[i_65_ * i_66_];
	    aBool9125 = false;
	    for (int i_67_ = 0; i_67_ < anInt9130; i_67_++) {
		int i_68_ = i_67_ * anInt9123;
		int i_69_ = (i_67_ + i_63_) * i_65_ + i_61_;
		for (int i_70_ = 0; i_70_ < anInt9123; i_70_++) {
		    if ((anIntArray9129[i_68_] & ~0xffffff) != -16777216)
			aBool9125 = true;
		    is[i_69_++] = anIntArray9129[i_68_++];
		}
	    }
	    anInt9124 -= i_61_;
	    anInt9127 -= i_63_;
	    anInt9126 -= i_62_;
	    anInt9128 -= i_64_;
	    anInt9123 = i_65_;
	    anInt9130 = i_66_;
	    anIntArray9129 = is;
	}
    }
    
    public void method2801(int i) {
	int i_71_ = 0;
	aBool9125 = false;
	int[] is = new int[anInt9123 * anInt9130];
	for (int i_72_ = 0; i_72_ < anInt9130; i_72_++) {
	    for (int i_73_ = 0; i_73_ < anInt9123; i_73_++) {
		int i_74_ = anIntArray9129[i_71_];
		if ((i_74_ & ~0xffffff) == 0) {
		    if (i_73_ > 0
			&& (anIntArray9129[i_71_ - 1] & ~0xffffff) != 0)
			i_74_ = i;
		    else if (i_72_ > 0 && (anIntArray9129[i_71_ - anInt9123]
					   & ~0xffffff) != 0)
			i_74_ = i;
		    else if (i_73_ < anInt9123 - 1
			     && (anIntArray9129[i_71_ + 1] & ~0xffffff) != 0)
			i_74_ = i;
		    else if (i_72_ < anInt9130 - 1
			     && (anIntArray9129[i_71_ + anInt9123]
				 & ~0xffffff) != 0)
			i_74_ = i;
		}
		if ((i_74_ & ~0xffffff) != -16777216)
		    aBool9125 = true;
		is[i_71_++] = i_74_;
	    }
	}
	anIntArray9129 = is;
    }
    
    public boolean method2781() {
	return false;
    }
    
    public void method2813(int i) {
	int i_75_ = 0;
	aBool9125 = false;
	int[] is = new int[anInt9123 * anInt9130];
	for (int i_76_ = 0; i_76_ < anInt9130; i_76_++) {
	    for (int i_77_ = 0; i_77_ < anInt9123; i_77_++) {
		int i_78_ = anIntArray9129[i_75_];
		if ((i_78_ & ~0xffffff) == 0) {
		    if (i_77_ > 0
			&& (anIntArray9129[i_75_ - 1] & ~0xffffff) != 0)
			i_78_ = i;
		    else if (i_76_ > 0 && (anIntArray9129[i_75_ - anInt9123]
					   & ~0xffffff) != 0)
			i_78_ = i;
		    else if (i_77_ < anInt9123 - 1
			     && (anIntArray9129[i_75_ + 1] & ~0xffffff) != 0)
			i_78_ = i;
		    else if (i_76_ < anInt9130 - 1
			     && (anIntArray9129[i_75_ + anInt9123]
				 & ~0xffffff) != 0)
			i_78_ = i;
		}
		if ((i_78_ & ~0xffffff) != -16777216)
		    aBool9125 = true;
		is[i_75_++] = i_78_;
	    }
	}
	anIntArray9129 = is;
    }
    
    public int method2771() {
	return anInt9123 + anInt9124 + anInt9126;
    }
    
    public void method2815(int i) {
	for (int i_79_ = anInt9130 - 1; i_79_ > 0; i_79_--) {
	    int i_80_ = i_79_ * anInt9123;
	    for (int i_81_ = anInt9123 - 1; i_81_ > 0; i_81_--) {
		if ((anIntArray9129[i_81_ + i_80_] & ~0xffffff) == 0
		    && (anIntArray9129[i_81_ + i_80_ - 1 - anInt9123]
			& ~0xffffff) != 0)
		    anIntArray9129[i_81_ + i_80_] = i;
	    }
	}
    }
    
    public void method2774() {
	int[] is = anIntArray9129;
	for (int i = anInt9130 - 1; i >= 0; i--) {
	    int i_82_ = i * anInt9123;
	    for (int i_83_ = (i + 1) * anInt9123; i_82_ < i_83_; i_82_++) {
		i_83_--;
		int i_84_ = is[i_82_];
		is[i_82_] = is[i_83_];
		is[i_83_] = i_84_;
	    }
	}
	int i = anInt9124;
	anInt9124 = anInt9126;
	anInt9126 = i;
    }
    
    public boolean method2794() {
	return false;
    }
    
    public void method2818() {
	int[] is = anIntArray9129;
	for (int i = (anInt9130 >> 1) - 1; i >= 0; i--) {
	    int i_85_ = i * anInt9123;
	    int i_86_ = (anInt9130 - i - 1) * anInt9123;
	    for (int i_87_ = -anInt9123; i_87_ < 0; i_87_++) {
		int i_88_ = is[i_85_];
		is[i_85_] = is[i_86_];
		is[i_86_] = i_88_;
		i_85_++;
		i_86_++;
	    }
	}
	int i = anInt9127;
	anInt9127 = anInt9128;
	anInt9128 = i;
    }
    
    public void method2812() {
	int[] is = anIntArray9129;
	for (int i = (anInt9130 >> 1) - 1; i >= 0; i--) {
	    int i_89_ = i * anInt9123;
	    int i_90_ = (anInt9130 - i - 1) * anInt9123;
	    for (int i_91_ = -anInt9123; i_91_ < 0; i_91_++) {
		int i_92_ = is[i_89_];
		is[i_89_] = is[i_90_];
		is[i_90_] = i_92_;
		i_89_++;
		i_90_++;
	    }
	}
	int i = anInt9127;
	anInt9127 = anInt9128;
	anInt9128 = i;
    }
    
    public void method2820() {
	int[] is = new int[anInt9123 * anInt9130];
	int i = 0;
	for (int i_93_ = 0; i_93_ < anInt9123; i_93_++) {
	    for (int i_94_ = anInt9130 - 1; i_94_ >= 0; i_94_--)
		is[i++] = anIntArray9129[i_93_ + i_94_ * anInt9123];
	}
	anIntArray9129 = is;
	int i_95_ = anInt9127;
	anInt9127 = anInt9124;
	anInt9124 = anInt9128;
	anInt9128 = anInt9126;
	anInt9126 = i_95_;
	i_95_ = anInt9130;
	anInt9130 = anInt9123;
	anInt9123 = i_95_;
    }
    
    public int method2819() {
	return anInt9130 + anInt9127 + anInt9128;
    }
    
    public void method2827(int i, int i_96_, int i_97_) {
	for (int i_98_ = 1; i_98_ < anIntArray9129.length; i_98_++) {
	    int i_99_ = anIntArray9129[i_98_] >> 16 & 0xff;
	    i_99_ += i;
	    if (i_99_ < 0)
		i_99_ = 0;
	    else if (i_99_ > 255)
		i_99_ = 255;
	    int i_100_ = anIntArray9129[i_98_] >> 8 & 0xff;
	    i_100_ += i_96_;
	    if (i_100_ < 0)
		i_100_ = 0;
	    else if (i_100_ > 255)
		i_100_ = 255;
	    int i_101_ = anIntArray9129[i_98_] >> 0 & 0xff;
	    i_101_ += i_97_;
	    if (i_101_ < 0)
		i_101_ = 0;
	    else if (i_101_ > 255)
		i_101_ = 255;
	    anIntArray9129[i_98_] = (anIntArray9129[i_98_] & ~0xffffff
				     | i_99_ << 16 | i_100_ << 8 | i_101_);
	}
    }
    
    public void method2789() {
	int[] is = new int[anInt9123 * anInt9130];
	int i = 0;
	for (int i_102_ = 0; i_102_ < anInt9123; i_102_++) {
	    for (int i_103_ = anInt9130 - 1; i_103_ >= 0; i_103_--)
		is[i++] = anIntArray9129[i_102_ + i_103_ * anInt9123];
	}
	anIntArray9129 = is;
	int i_104_ = anInt9127;
	anInt9127 = anInt9124;
	anInt9124 = anInt9128;
	anInt9128 = anInt9126;
	anInt9126 = i_104_;
	i_104_ = anInt9130;
	anInt9130 = anInt9123;
	anInt9123 = i_104_;
    }
    
    public int[] method2824(boolean bool) {
	if (bool && (method2771() != anInt9123 || method2819() != anInt9130)) {
	    int i = method2771();
	    int[] is = new int[i * method2819()];
	    for (int i_105_ = 0; i_105_ < anInt9130; i_105_++) {
		int i_106_ = i_105_ * anInt9123;
		int i_107_ = anInt9124 + (i_105_ + anInt9127) * i;
		for (int i_108_ = 0; i_108_ < anInt9123; i_108_++) {
		    is[i_107_++] = anIntArray9129[i_106_];
		    i_106_++;
		}
	    }
	    return is;
	}
	return anIntArray9129;
    }
    
    public boolean method2826() {
	return aBool9125;
    }
    
    public void method2830(int i, int i_109_, int i_110_) {
	for (int i_111_ = 1; i_111_ < anIntArray9129.length; i_111_++) {
	    int i_112_ = anIntArray9129[i_111_] >> 16 & 0xff;
	    i_112_ += i;
	    if (i_112_ < 0)
		i_112_ = 0;
	    else if (i_112_ > 255)
		i_112_ = 255;
	    int i_113_ = anIntArray9129[i_111_] >> 8 & 0xff;
	    i_113_ += i_109_;
	    if (i_113_ < 0)
		i_113_ = 0;
	    else if (i_113_ > 255)
		i_113_ = 255;
	    int i_114_ = anIntArray9129[i_111_] >> 0 & 0xff;
	    i_114_ += i_110_;
	    if (i_114_ < 0)
		i_114_ = 0;
	    else if (i_114_ > 255)
		i_114_ = 255;
	    anIntArray9129[i_111_] = (anIntArray9129[i_111_] & ~0xffffff
				      | i_112_ << 16 | i_113_ << 8 | i_114_);
	}
    }
    
    public void method2817() {
	int[] is = anIntArray9129;
	for (int i = (anInt9130 >> 1) - 1; i >= 0; i--) {
	    int i_115_ = i * anInt9123;
	    int i_116_ = (anInt9130 - i - 1) * anInt9123;
	    for (int i_117_ = -anInt9123; i_117_ < 0; i_117_++) {
		int i_118_ = is[i_115_];
		is[i_115_] = is[i_116_];
		is[i_116_] = i_118_;
		i_115_++;
		i_116_++;
	    }
	}
	int i = anInt9127;
	anInt9127 = anInt9128;
	anInt9128 = i;
    }
    
    public int method2816(int i, int i_119_) {
	return anIntArray9129[i + i_119_ * anInt9123];
    }
    
    public void method2800(int i) {
	for (int i_120_ = anInt9130 - 1; i_120_ > 0; i_120_--) {
	    int i_121_ = i_120_ * anInt9123;
	    for (int i_122_ = anInt9123 - 1; i_122_ > 0; i_122_--) {
		if ((anIntArray9129[i_122_ + i_121_] & ~0xffffff) == 0
		    && (anIntArray9129[i_122_ + i_121_ - 1 - anInt9123]
			& ~0xffffff) != 0)
		    anIntArray9129[i_122_ + i_121_] = i;
	    }
	}
    }
    
    public int method2804() {
	return anInt9123;
    }
    
    public int method2764() {
	return anInt9123;
    }
}
