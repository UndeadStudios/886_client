/* Class173_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class173_Sub2 extends Class173
{
    int anInt9618;
    int anInt9619;
    public int anInt9620;
    public int anInt9621;
    public byte[] aByteArray9622;
    int anInt9623;
    public int[] anIntArray9624;
    int anInt9625;
    public byte[] aByteArray9626;
    
    public int method2787() {
	return anInt9618;
    }
    
    public boolean method2762() {
	return true;
    }
    
    public boolean method2763() {
	return aByteArray9626 != null;
    }
    
    public int method2772() {
	return anInt9625;
    }
    
    public int method2765() {
	return anInt9618;
    }
    
    public void method2820() {
	byte[] is = new byte[anInt9625 * anInt9618];
	int i = 0;
	if (aByteArray9626 == null) {
	    for (int i_0_ = 0; i_0_ < anInt9625; i_0_++) {
		for (int i_1_ = anInt9618 - 1; i_1_ >= 0; i_1_--)
		    is[i++] = aByteArray9622[i_0_ + i_1_ * anInt9625];
	    }
	    aByteArray9622 = is;
	} else {
	    byte[] is_2_ = new byte[anInt9625 * anInt9618];
	    for (int i_3_ = 0; i_3_ < anInt9625; i_3_++) {
		for (int i_4_ = anInt9618 - 1; i_4_ >= 0; i_4_--) {
		    is[i] = aByteArray9622[i_3_ + i_4_ * anInt9625];
		    is_2_[i++] = aByteArray9626[i_3_ + i_4_ * anInt9625];
		}
	    }
	    aByteArray9622 = is;
	    aByteArray9626 = is_2_;
	}
	int i_5_ = anInt9621;
	anInt9621 = anInt9620;
	anInt9620 = anInt9619;
	anInt9619 = anInt9623;
	anInt9623 = i_5_;
	i_5_ = anInt9618;
	anInt9618 = anInt9625;
	anInt9625 = i_5_;
    }
    
    public int method2804() {
	return anInt9625;
    }
    
    public int method2766() {
	return anInt9620;
    }
    
    public int method2767() {
	return anInt9623;
    }
    
    public int method2768() {
	return anInt9621;
    }
    
    public void method2810(int i) {
	int i_6_ = method2771();
	int i_7_ = method2819();
	if (anInt9625 != i_6_ || anInt9618 != i_7_) {
	    int i_8_ = i;
	    if (i_8_ > anInt9620)
		i_8_ = anInt9620;
	    int i_9_ = i;
	    if (i_9_ + anInt9620 + anInt9625 > i_6_)
		i_9_ = i_6_ - anInt9620 - anInt9625;
	    int i_10_ = i;
	    if (i_10_ > anInt9621)
		i_10_ = anInt9621;
	    int i_11_ = i;
	    if (i_11_ + anInt9621 + anInt9618 > i_7_)
		i_11_ = i_7_ - anInt9621 - anInt9618;
	    int i_12_ = anInt9625 + i_8_ + i_9_;
	    int i_13_ = anInt9618 + i_10_ + i_11_;
	    byte[] is = new byte[i_12_ * i_13_];
	    if (aByteArray9626 == null) {
		for (int i_14_ = 0; i_14_ < anInt9618; i_14_++) {
		    int i_15_ = i_14_ * anInt9625;
		    int i_16_ = (i_14_ + i_10_) * i_12_ + i_8_;
		    for (int i_17_ = 0; i_17_ < anInt9625; i_17_++)
			is[i_16_++] = aByteArray9622[i_15_++];
		}
	    } else {
		byte[] is_18_ = new byte[i_12_ * i_13_];
		for (int i_19_ = 0; i_19_ < anInt9618; i_19_++) {
		    int i_20_ = i_19_ * anInt9625;
		    int i_21_ = (i_19_ + i_10_) * i_12_ + i_8_;
		    for (int i_22_ = 0; i_22_ < anInt9625; i_22_++) {
			is_18_[i_21_] = aByteArray9626[i_20_];
			is[i_21_++] = aByteArray9622[i_20_++];
		    }
		}
		aByteArray9626 = is_18_;
	    }
	    anInt9620 -= i_8_;
	    anInt9621 -= i_10_;
	    anInt9623 -= i_9_;
	    anInt9619 -= i_11_;
	    anInt9625 = i_12_;
	    anInt9618 = i_13_;
	    aByteArray9622 = is;
	}
    }
    
    public void method2770() {
	anInt9619 = 0;
	anInt9621 = 0;
	anInt9623 = 0;
	anInt9620 = 0;
    }
    
    public void method2775(int i) {
	int i_23_ = method2771();
	int i_24_ = method2819();
	if (anInt9625 != i_23_ || anInt9618 != i_24_) {
	    int i_25_ = i;
	    if (i_25_ > anInt9620)
		i_25_ = anInt9620;
	    int i_26_ = i;
	    if (i_26_ + anInt9620 + anInt9625 > i_23_)
		i_26_ = i_23_ - anInt9620 - anInt9625;
	    int i_27_ = i;
	    if (i_27_ > anInt9621)
		i_27_ = anInt9621;
	    int i_28_ = i;
	    if (i_28_ + anInt9621 + anInt9618 > i_24_)
		i_28_ = i_24_ - anInt9621 - anInt9618;
	    int i_29_ = anInt9625 + i_25_ + i_26_;
	    int i_30_ = anInt9618 + i_27_ + i_28_;
	    byte[] is = new byte[i_29_ * i_30_];
	    if (aByteArray9626 == null) {
		for (int i_31_ = 0; i_31_ < anInt9618; i_31_++) {
		    int i_32_ = i_31_ * anInt9625;
		    int i_33_ = (i_31_ + i_27_) * i_29_ + i_25_;
		    for (int i_34_ = 0; i_34_ < anInt9625; i_34_++)
			is[i_33_++] = aByteArray9622[i_32_++];
		}
	    } else {
		byte[] is_35_ = new byte[i_29_ * i_30_];
		for (int i_36_ = 0; i_36_ < anInt9618; i_36_++) {
		    int i_37_ = i_36_ * anInt9625;
		    int i_38_ = (i_36_ + i_27_) * i_29_ + i_25_;
		    for (int i_39_ = 0; i_39_ < anInt9625; i_39_++) {
			is_35_[i_38_] = aByteArray9626[i_37_];
			is[i_38_++] = aByteArray9622[i_37_++];
		    }
		}
		aByteArray9626 = is_35_;
	    }
	    anInt9620 -= i_25_;
	    anInt9621 -= i_27_;
	    anInt9623 -= i_26_;
	    anInt9619 -= i_28_;
	    anInt9625 = i_29_;
	    anInt9618 = i_30_;
	    aByteArray9622 = is;
	}
    }
    
    public void method2776() {
	byte[] is = aByteArray9622;
	if (aByteArray9626 == null) {
	    for (int i = (anInt9618 >> 1) - 1; i >= 0; i--) {
		int i_40_ = i * anInt9625;
		int i_41_ = (anInt9618 - i - 1) * anInt9625;
		for (int i_42_ = -anInt9625; i_42_ < 0; i_42_++) {
		    byte i_43_ = is[i_40_];
		    is[i_40_] = is[i_41_];
		    is[i_41_] = i_43_;
		    i_40_++;
		    i_41_++;
		}
	    }
	} else {
	    byte[] is_44_ = aByteArray9626;
	    for (int i = (anInt9618 >> 1) - 1; i >= 0; i--) {
		int i_45_ = i * anInt9625;
		int i_46_ = (anInt9618 - i - 1) * anInt9625;
		for (int i_47_ = -anInt9625; i_47_ < 0; i_47_++) {
		    byte i_48_ = is[i_45_];
		    is[i_45_] = is[i_46_];
		    is[i_46_] = i_48_;
		    i_48_ = is_44_[i_45_];
		    is_44_[i_45_] = is_44_[i_46_];
		    is_44_[i_46_] = i_48_;
		    i_45_++;
		    i_46_++;
		}
	    }
	}
	int i = anInt9621;
	anInt9621 = anInt9619;
	anInt9619 = i;
    }
    
    public int method2785() {
	return anInt9623;
    }
    
    public void method2773() {
	byte[] is = aByteArray9622;
	if (aByteArray9626 == null) {
	    for (int i = anInt9618 - 1; i >= 0; i--) {
		int i_49_ = i * anInt9625;
		for (int i_50_ = (i + 1) * anInt9625; i_49_ < i_50_; i_49_++) {
		    i_50_--;
		    byte i_51_ = is[i_49_];
		    is[i_49_] = is[i_50_];
		    is[i_50_] = i_51_;
		}
	    }
	} else {
	    byte[] is_52_ = aByteArray9626;
	    for (int i = anInt9618 - 1; i >= 0; i--) {
		int i_53_ = i * anInt9625;
		for (int i_54_ = (i + 1) * anInt9625; i_53_ < i_54_; i_53_++) {
		    i_54_--;
		    byte i_55_ = is[i_53_];
		    is[i_53_] = is[i_54_];
		    is[i_54_] = i_55_;
		    i_55_ = is_52_[i_53_];
		    is_52_[i_53_] = is_52_[i_54_];
		    is_52_[i_54_] = i_55_;
		}
	    }
	}
	int i = anInt9620;
	anInt9620 = anInt9623;
	anInt9623 = i;
    }
    
    public int method2803() {
	return anInt9621;
    }
    
    public void method2777() {
	byte[] is = new byte[anInt9625 * anInt9618];
	int i = 0;
	if (aByteArray9626 == null) {
	    for (int i_56_ = 0; i_56_ < anInt9625; i_56_++) {
		for (int i_57_ = anInt9618 - 1; i_57_ >= 0; i_57_--)
		    is[i++] = aByteArray9622[i_56_ + i_57_ * anInt9625];
	    }
	    aByteArray9622 = is;
	} else {
	    byte[] is_58_ = new byte[anInt9625 * anInt9618];
	    for (int i_59_ = 0; i_59_ < anInt9625; i_59_++) {
		for (int i_60_ = anInt9618 - 1; i_60_ >= 0; i_60_--) {
		    is[i] = aByteArray9622[i_59_ + i_60_ * anInt9625];
		    is_58_[i++] = aByteArray9626[i_59_ + i_60_ * anInt9625];
		}
	    }
	    aByteArray9622 = is;
	    aByteArray9626 = is_58_;
	}
	int i_61_ = anInt9621;
	anInt9621 = anInt9620;
	anInt9620 = anInt9619;
	anInt9619 = anInt9623;
	anInt9623 = i_61_;
	i_61_ = anInt9618;
	anInt9618 = anInt9625;
	anInt9625 = i_61_;
    }
    
    public int method2792() {
	return anInt9625 + anInt9620 + anInt9623;
    }
    
    public void method2779(int i, int i_62_, int i_63_) {
	for (int i_64_ = 1; i_64_ < anIntArray9624.length; i_64_++) {
	    if (anIntArray9624[i_64_] != 1
		&& anIntArray9624[i_64_] != 16711935) {
		int i_65_ = anIntArray9624[i_64_] >> 16 & 0xff;
		i_65_ += i;
		if (i_65_ < 0)
		    i_65_ = 0;
		else if (i_65_ > 255)
		    i_65_ = 255;
		int i_66_ = anIntArray9624[i_64_] >> 8 & 0xff;
		i_66_ += i_62_;
		if (i_66_ < 0)
		    i_66_ = 0;
		else if (i_66_ > 255)
		    i_66_ = 255;
		int i_67_ = anIntArray9624[i_64_] >> 0 & 0xff;
		i_67_ += i_63_;
		if (i_67_ < 0)
		    i_67_ = 0;
		else if (i_67_ > 255)
		    i_67_ = 255;
		anIntArray9624[i_64_] = i_65_ << 16 | i_66_ << 8 | i_67_;
	    }
	}
    }
    
    public int method2769() {
	return anInt9619;
    }
    
    public boolean method2826() {
	return aByteArray9626 != null;
    }
    
    public boolean method2794() {
	return true;
    }
    
    public boolean method2811() {
	return aByteArray9626 != null;
    }
    
    public int[] method2778(boolean bool) {
	int[] is;
	if (bool) {
	    int i = method2771();
	    is = new int[i * method2819()];
	    if (aByteArray9626 != null) {
		for (int i_68_ = 0; i_68_ < anInt9618; i_68_++) {
		    int i_69_ = i_68_ * anInt9625;
		    int i_70_ = anInt9620 + (i_68_ + anInt9621) * i;
		    for (int i_71_ = 0; i_71_ < anInt9625; i_71_++) {
			is[i_70_++]
			    = (aByteArray9626[i_69_] << 24
			       | anIntArray9624[aByteArray9622[i_69_] & 0xff]);
			i_69_++;
		    }
		}
	    } else {
		for (int i_72_ = 0; i_72_ < anInt9618; i_72_++) {
		    int i_73_ = i_72_ * anInt9625;
		    int i_74_ = anInt9620 + (i_72_ + anInt9621) * i;
		    for (int i_75_ = 0; i_75_ < anInt9625; i_75_++) {
			int i_76_
			    = anIntArray9624[aByteArray9622[i_73_++] & 0xff];
			if (i_76_ != 0)
			    is[i_74_++] = ~0xffffff | i_76_;
			else
			    is[i_74_++] = 0;
		    }
		}
	    }
	} else {
	    is = new int[anInt9625 * anInt9618];
	    int i = 0;
	    int i_77_ = 0;
	    if (aByteArray9626 != null) {
		for (int i_78_ = 0; i_78_ < anInt9618; i_78_++) {
		    for (int i_79_ = 0; i_79_ < anInt9625; i_79_++) {
			is[i_77_++]
			    = (aByteArray9626[i] << 24
			       | anIntArray9624[aByteArray9622[i] & 0xff]);
			i++;
		    }
		}
	    } else {
		for (int i_80_ = 0; i_80_ < anInt9618; i_80_++) {
		    for (int i_81_ = 0; i_81_ < anInt9625; i_81_++) {
			int i_82_ = anIntArray9624[aByteArray9622[i++] & 0xff];
			is[i_77_++] = i_82_ != 0 ? ~0xffffff | i_82_ : 0;
		    }
		}
	    }
	}
	return is;
    }
    
    public int method2780(int i, int i_83_) {
	return anIntArray9624[aByteArray9622[i + i_83_ * anInt9625] & 0xff];
    }
    
    public int method2764() {
	return anInt9625;
    }
    
    public void method2801(int i) {
	int i_84_ = -1;
	if (anIntArray9624.length < 255) {
	    for (int i_85_ = 0; i_85_ < anIntArray9624.length; i_85_++) {
		if (anIntArray9624[i_85_] == i) {
		    i_84_ = i_85_;
		    break;
		}
	    }
	    if (i_84_ == -1) {
		i_84_ = anIntArray9624.length;
		int[] is = new int[anIntArray9624.length + 1];
		System.arraycopy(anIntArray9624, 0, is, 0,
				 anIntArray9624.length);
		anIntArray9624 = is;
		is[i_84_] = i;
	    }
	} else {
	    int i_86_ = 2147483647;
	    int i_87_ = i >> 16 & 0xff;
	    int i_88_ = i >> 8 & 0xff;
	    int i_89_ = i & 0xff;
	    for (int i_90_ = 0; i_90_ < anIntArray9624.length; i_90_++) {
		int i_91_ = anIntArray9624[i_90_];
		int i_92_ = i_91_ >> 16 & 0xff;
		int i_93_ = i_91_ >> 8 & 0xff;
		int i_94_ = i_91_ & 0xff;
		int i_95_ = i_87_ - i_92_;
		if (i_95_ < 0)
		    i_95_ = -i_95_;
		int i_96_ = i_88_ - i_93_;
		if (i_96_ < 0)
		    i_96_ = -i_96_;
		int i_97_ = i_89_ - i_94_;
		if (i_97_ < 0)
		    i_97_ = -i_97_;
		int i_98_ = i_95_ + i_96_ + i_97_;
		if (i_98_ < i_86_) {
		    i_86_ = i_98_;
		    i_84_ = i_90_;
		}
	    }
	}
	int i_99_ = 0;
	byte[] is = new byte[anInt9625 * anInt9618];
	for (int i_100_ = 0; i_100_ < anInt9618; i_100_++) {
	    for (int i_101_ = 0; i_101_ < anInt9625; i_101_++) {
		int i_102_ = aByteArray9622[i_99_] & 0xff;
		if (anIntArray9624[i_102_] == 0) {
		    if (i_101_ > 0
			&& (anIntArray9624[aByteArray9622[i_99_ - 1] & 0xff]
			    != 0))
			i_102_ = i_84_;
		    else if (i_100_ > 0
			     && ((anIntArray9624
				  [aByteArray9622[i_99_ - anInt9625] & 0xff])
				 != 0))
			i_102_ = i_84_;
		    else if (i_101_ < anInt9625 - 1
			     && (anIntArray9624
				 [aByteArray9622[i_99_ + 1] & 0xff]) != 0)
			i_102_ = i_84_;
		    else if (i_100_ < anInt9618 - 1
			     && ((anIntArray9624
				  [aByteArray9622[i_99_ + anInt9625] & 0xff])
				 != 0))
			i_102_ = i_84_;
		}
		is[i_99_++] = (byte) i_102_;
	    }
	}
	aByteArray9622 = is;
    }
    
    public int method2788() {
	return anInt9618;
    }
    
    public int method2814() {
	return anInt9618;
    }
    
    public int method2782() {
	return anInt9625 + anInt9620 + anInt9623;
    }
    
    public int method2791() {
	return anInt9625 + anInt9620 + anInt9623;
    }
    
    public boolean method2786() {
	return aByteArray9626 != null;
    }
    
    public int method2793() {
	return anInt9625 + anInt9620 + anInt9623;
    }
    
    public int method2784() {
	return anInt9625 + anInt9620 + anInt9623;
    }
    
    public int method2795() {
	return anInt9625 + anInt9620 + anInt9623;
    }
    
    public void method2818() {
	byte[] is = aByteArray9622;
	if (aByteArray9626 == null) {
	    for (int i = (anInt9618 >> 1) - 1; i >= 0; i--) {
		int i_103_ = i * anInt9625;
		int i_104_ = (anInt9618 - i - 1) * anInt9625;
		for (int i_105_ = -anInt9625; i_105_ < 0; i_105_++) {
		    byte i_106_ = is[i_103_];
		    is[i_103_] = is[i_104_];
		    is[i_104_] = i_106_;
		    i_103_++;
		    i_104_++;
		}
	    }
	} else {
	    byte[] is_107_ = aByteArray9626;
	    for (int i = (anInt9618 >> 1) - 1; i >= 0; i--) {
		int i_108_ = i * anInt9625;
		int i_109_ = (anInt9618 - i - 1) * anInt9625;
		for (int i_110_ = -anInt9625; i_110_ < 0; i_110_++) {
		    byte i_111_ = is[i_108_];
		    is[i_108_] = is[i_109_];
		    is[i_109_] = i_111_;
		    i_111_ = is_107_[i_108_];
		    is_107_[i_108_] = is_107_[i_109_];
		    is_107_[i_109_] = i_111_;
		    i_108_++;
		    i_109_++;
		}
	    }
	}
	int i = anInt9621;
	anInt9621 = anInt9619;
	anInt9619 = i;
    }
    
    public int method2797() {
	return anInt9618 + anInt9621 + anInt9619;
    }
    
    public boolean method2781() {
	return true;
    }
    
    public int method2808() {
	return anInt9620;
    }
    
    public int method2829(int i, int i_112_) {
	return anIntArray9624[aByteArray9622[i + i_112_ * anInt9625] & 0xff];
    }
    
    Class173_Sub2() {
	/* empty */
    }
    
    public int method2802() {
	return anInt9621;
    }
    
    public int method2761() {
	return anInt9618 + anInt9621 + anInt9619;
    }
    
    public int method2828() {
	return anInt9621;
    }
    
    public int method2805() {
	return anInt9619;
    }
    
    public void method2806() {
	anInt9619 = 0;
	anInt9621 = 0;
	anInt9623 = 0;
	anInt9620 = 0;
    }
    
    public void method2807() {
	anInt9619 = 0;
	anInt9621 = 0;
	anInt9623 = 0;
	anInt9620 = 0;
    }
    
    public void method2783() {
	anInt9619 = 0;
	anInt9621 = 0;
	anInt9623 = 0;
	anInt9620 = 0;
    }
    
    public void method2809() {
	anInt9619 = 0;
	anInt9621 = 0;
	anInt9623 = 0;
	anInt9620 = 0;
    }
    
    public int method2771() {
	return anInt9625 + anInt9620 + anInt9623;
    }
    
    public int method2816(int i, int i_113_) {
	return anIntArray9624[aByteArray9622[i + i_113_ * anInt9625] & 0xff];
    }
    
    public void method2831(int i) {
	int i_114_ = -1;
	if (anIntArray9624.length < 255) {
	    for (int i_115_ = 0; i_115_ < anIntArray9624.length; i_115_++) {
		if (anIntArray9624[i_115_] == i) {
		    i_114_ = i_115_;
		    break;
		}
	    }
	    if (i_114_ == -1) {
		i_114_ = anIntArray9624.length;
		int[] is = new int[anIntArray9624.length + 1];
		System.arraycopy(anIntArray9624, 0, is, 0,
				 anIntArray9624.length);
		anIntArray9624 = is;
		is[i_114_] = i;
	    }
	} else {
	    int i_116_ = 2147483647;
	    int i_117_ = i >> 16 & 0xff;
	    int i_118_ = i >> 8 & 0xff;
	    int i_119_ = i & 0xff;
	    for (int i_120_ = 0; i_120_ < anIntArray9624.length; i_120_++) {
		int i_121_ = anIntArray9624[i_120_];
		int i_122_ = i_121_ >> 16 & 0xff;
		int i_123_ = i_121_ >> 8 & 0xff;
		int i_124_ = i_121_ & 0xff;
		int i_125_ = i_117_ - i_122_;
		if (i_125_ < 0)
		    i_125_ = -i_125_;
		int i_126_ = i_118_ - i_123_;
		if (i_126_ < 0)
		    i_126_ = -i_126_;
		int i_127_ = i_119_ - i_124_;
		if (i_127_ < 0)
		    i_127_ = -i_127_;
		int i_128_ = i_125_ + i_126_ + i_127_;
		if (i_128_ < i_116_) {
		    i_116_ = i_128_;
		    i_114_ = i_120_;
		}
	    }
	}
	int i_129_ = 0;
	byte[] is = new byte[anInt9625 * anInt9618];
	for (int i_130_ = 0; i_130_ < anInt9618; i_130_++) {
	    for (int i_131_ = 0; i_131_ < anInt9625; i_131_++) {
		int i_132_ = aByteArray9622[i_129_] & 0xff;
		if (anIntArray9624[i_132_] == 0) {
		    if (i_131_ > 0
			&& (anIntArray9624[aByteArray9622[i_129_ - 1] & 0xff]
			    != 0))
			i_132_ = i_114_;
		    else if (i_130_ > 0
			     && ((anIntArray9624
				  [aByteArray9622[i_129_ - anInt9625] & 0xff])
				 != 0))
			i_132_ = i_114_;
		    else if (i_131_ < anInt9625 - 1
			     && (anIntArray9624
				 [aByteArray9622[i_129_ + 1] & 0xff]) != 0)
			i_132_ = i_114_;
		    else if (i_130_ < anInt9618 - 1
			     && ((anIntArray9624
				  [aByteArray9622[i_129_ + anInt9625] & 0xff])
				 != 0))
			i_132_ = i_114_;
		}
		is[i_129_++] = (byte) i_132_;
	    }
	}
	aByteArray9622 = is;
    }
    
    public void method2813(int i) {
	int i_133_ = -1;
	if (anIntArray9624.length < 255) {
	    for (int i_134_ = 0; i_134_ < anIntArray9624.length; i_134_++) {
		if (anIntArray9624[i_134_] == i) {
		    i_133_ = i_134_;
		    break;
		}
	    }
	    if (i_133_ == -1) {
		i_133_ = anIntArray9624.length;
		int[] is = new int[anIntArray9624.length + 1];
		System.arraycopy(anIntArray9624, 0, is, 0,
				 anIntArray9624.length);
		anIntArray9624 = is;
		is[i_133_] = i;
	    }
	} else {
	    int i_135_ = 2147483647;
	    int i_136_ = i >> 16 & 0xff;
	    int i_137_ = i >> 8 & 0xff;
	    int i_138_ = i & 0xff;
	    for (int i_139_ = 0; i_139_ < anIntArray9624.length; i_139_++) {
		int i_140_ = anIntArray9624[i_139_];
		int i_141_ = i_140_ >> 16 & 0xff;
		int i_142_ = i_140_ >> 8 & 0xff;
		int i_143_ = i_140_ & 0xff;
		int i_144_ = i_136_ - i_141_;
		if (i_144_ < 0)
		    i_144_ = -i_144_;
		int i_145_ = i_137_ - i_142_;
		if (i_145_ < 0)
		    i_145_ = -i_145_;
		int i_146_ = i_138_ - i_143_;
		if (i_146_ < 0)
		    i_146_ = -i_146_;
		int i_147_ = i_144_ + i_145_ + i_146_;
		if (i_147_ < i_135_) {
		    i_135_ = i_147_;
		    i_133_ = i_139_;
		}
	    }
	}
	int i_148_ = 0;
	byte[] is = new byte[anInt9625 * anInt9618];
	for (int i_149_ = 0; i_149_ < anInt9618; i_149_++) {
	    for (int i_150_ = 0; i_150_ < anInt9625; i_150_++) {
		int i_151_ = aByteArray9622[i_148_] & 0xff;
		if (anIntArray9624[i_151_] == 0) {
		    if (i_150_ > 0
			&& (anIntArray9624[aByteArray9622[i_148_ - 1] & 0xff]
			    != 0))
			i_151_ = i_133_;
		    else if (i_149_ > 0
			     && ((anIntArray9624
				  [aByteArray9622[i_148_ - anInt9625] & 0xff])
				 != 0))
			i_151_ = i_133_;
		    else if (i_150_ < anInt9625 - 1
			     && (anIntArray9624
				 [aByteArray9622[i_148_ + 1] & 0xff]) != 0)
			i_151_ = i_133_;
		    else if (i_149_ < anInt9618 - 1
			     && ((anIntArray9624
				  [aByteArray9622[i_148_ + anInt9625] & 0xff])
				 != 0))
			i_151_ = i_133_;
		}
		is[i_148_++] = (byte) i_151_;
	    }
	}
	aByteArray9622 = is;
    }
    
    public void method2800(int i) {
	int i_152_ = -1;
	if (anIntArray9624.length < 255) {
	    for (int i_153_ = 0; i_153_ < anIntArray9624.length; i_153_++) {
		if (anIntArray9624[i_153_] == i) {
		    i_152_ = i_153_;
		    break;
		}
	    }
	    if (i_152_ == -1) {
		i_152_ = anIntArray9624.length;
		int[] is = new int[anIntArray9624.length + 1];
		System.arraycopy(anIntArray9624, 0, is, 0,
				 anIntArray9624.length);
		anIntArray9624 = is;
		is[i_152_] = i;
	    }
	} else {
	    int i_154_ = 2147483647;
	    int i_155_ = i >> 16 & 0xff;
	    int i_156_ = i >> 8 & 0xff;
	    int i_157_ = i & 0xff;
	    for (int i_158_ = 0; i_158_ < anIntArray9624.length; i_158_++) {
		int i_159_ = anIntArray9624[i_158_];
		int i_160_ = i_159_ >> 16 & 0xff;
		int i_161_ = i_159_ >> 8 & 0xff;
		int i_162_ = i_159_ & 0xff;
		int i_163_ = i_155_ - i_160_;
		if (i_163_ < 0)
		    i_163_ = -i_163_;
		int i_164_ = i_156_ - i_161_;
		if (i_164_ < 0)
		    i_164_ = -i_164_;
		int i_165_ = i_157_ - i_162_;
		if (i_165_ < 0)
		    i_165_ = -i_165_;
		int i_166_ = i_163_ + i_164_ + i_165_;
		if (i_166_ < i_154_) {
		    i_154_ = i_166_;
		    i_152_ = i_158_;
		}
	    }
	}
	for (int i_167_ = anInt9618 - 1; i_167_ > 0; i_167_--) {
	    int i_168_ = i_167_ * anInt9625;
	    for (int i_169_ = anInt9625 - 1; i_169_ > 0; i_169_--) {
		if (anIntArray9624[aByteArray9622[i_169_ + i_168_] & 0xff] == 0
		    && (anIntArray9624[aByteArray9622[(i_169_ + i_168_ - 1
						       - anInt9625)] & 0xff]
			!= 0))
		    aByteArray9622[i_169_ + i_168_] = (byte) i_152_;
	    }
	}
    }
    
    public void method2815(int i) {
	int i_170_ = -1;
	if (anIntArray9624.length < 255) {
	    for (int i_171_ = 0; i_171_ < anIntArray9624.length; i_171_++) {
		if (anIntArray9624[i_171_] == i) {
		    i_170_ = i_171_;
		    break;
		}
	    }
	    if (i_170_ == -1) {
		i_170_ = anIntArray9624.length;
		int[] is = new int[anIntArray9624.length + 1];
		System.arraycopy(anIntArray9624, 0, is, 0,
				 anIntArray9624.length);
		anIntArray9624 = is;
		is[i_170_] = i;
	    }
	} else {
	    int i_172_ = 2147483647;
	    int i_173_ = i >> 16 & 0xff;
	    int i_174_ = i >> 8 & 0xff;
	    int i_175_ = i & 0xff;
	    for (int i_176_ = 0; i_176_ < anIntArray9624.length; i_176_++) {
		int i_177_ = anIntArray9624[i_176_];
		int i_178_ = i_177_ >> 16 & 0xff;
		int i_179_ = i_177_ >> 8 & 0xff;
		int i_180_ = i_177_ & 0xff;
		int i_181_ = i_173_ - i_178_;
		if (i_181_ < 0)
		    i_181_ = -i_181_;
		int i_182_ = i_174_ - i_179_;
		if (i_182_ < 0)
		    i_182_ = -i_182_;
		int i_183_ = i_175_ - i_180_;
		if (i_183_ < 0)
		    i_183_ = -i_183_;
		int i_184_ = i_181_ + i_182_ + i_183_;
		if (i_184_ < i_172_) {
		    i_172_ = i_184_;
		    i_170_ = i_176_;
		}
	    }
	}
	for (int i_185_ = anInt9618 - 1; i_185_ > 0; i_185_--) {
	    int i_186_ = i_185_ * anInt9625;
	    for (int i_187_ = anInt9625 - 1; i_187_ > 0; i_187_--) {
		if (anIntArray9624[aByteArray9622[i_187_ + i_186_] & 0xff] == 0
		    && (anIntArray9624[aByteArray9622[(i_187_ + i_186_ - 1
						       - anInt9625)] & 0xff]
			!= 0))
		    aByteArray9622[i_187_ + i_186_] = (byte) i_170_;
	    }
	}
    }
    
    public void method2774() {
	byte[] is = aByteArray9622;
	if (aByteArray9626 == null) {
	    for (int i = anInt9618 - 1; i >= 0; i--) {
		int i_188_ = i * anInt9625;
		for (int i_189_ = (i + 1) * anInt9625; i_188_ < i_189_;
		     i_188_++) {
		    i_189_--;
		    byte i_190_ = is[i_188_];
		    is[i_188_] = is[i_189_];
		    is[i_189_] = i_190_;
		}
	    }
	} else {
	    byte[] is_191_ = aByteArray9626;
	    for (int i = anInt9618 - 1; i >= 0; i--) {
		int i_192_ = i * anInt9625;
		for (int i_193_ = (i + 1) * anInt9625; i_192_ < i_193_;
		     i_192_++) {
		    i_193_--;
		    byte i_194_ = is[i_192_];
		    is[i_192_] = is[i_193_];
		    is[i_193_] = i_194_;
		    i_194_ = is_191_[i_192_];
		    is_191_[i_192_] = is_191_[i_193_];
		    is_191_[i_193_] = i_194_;
		}
	    }
	}
	int i = anInt9620;
	anInt9620 = anInt9623;
	anInt9623 = i;
    }
    
    public void method2817() {
	byte[] is = aByteArray9622;
	if (aByteArray9626 == null) {
	    for (int i = (anInt9618 >> 1) - 1; i >= 0; i--) {
		int i_195_ = i * anInt9625;
		int i_196_ = (anInt9618 - i - 1) * anInt9625;
		for (int i_197_ = -anInt9625; i_197_ < 0; i_197_++) {
		    byte i_198_ = is[i_195_];
		    is[i_195_] = is[i_196_];
		    is[i_196_] = i_198_;
		    i_195_++;
		    i_196_++;
		}
	    }
	} else {
	    byte[] is_199_ = aByteArray9626;
	    for (int i = (anInt9618 >> 1) - 1; i >= 0; i--) {
		int i_200_ = i * anInt9625;
		int i_201_ = (anInt9618 - i - 1) * anInt9625;
		for (int i_202_ = -anInt9625; i_202_ < 0; i_202_++) {
		    byte i_203_ = is[i_200_];
		    is[i_200_] = is[i_201_];
		    is[i_201_] = i_203_;
		    i_203_ = is_199_[i_200_];
		    is_199_[i_200_] = is_199_[i_201_];
		    is_199_[i_201_] = i_203_;
		    i_200_++;
		    i_201_++;
		}
	    }
	}
	int i = anInt9621;
	anInt9621 = anInt9619;
	anInt9619 = i;
    }
    
    public void method2796(int i) {
	int i_204_ = -1;
	if (anIntArray9624.length < 255) {
	    for (int i_205_ = 0; i_205_ < anIntArray9624.length; i_205_++) {
		if (anIntArray9624[i_205_] == i) {
		    i_204_ = i_205_;
		    break;
		}
	    }
	    if (i_204_ == -1) {
		i_204_ = anIntArray9624.length;
		int[] is = new int[anIntArray9624.length + 1];
		System.arraycopy(anIntArray9624, 0, is, 0,
				 anIntArray9624.length);
		anIntArray9624 = is;
		is[i_204_] = i;
	    }
	} else {
	    int i_206_ = 2147483647;
	    int i_207_ = i >> 16 & 0xff;
	    int i_208_ = i >> 8 & 0xff;
	    int i_209_ = i & 0xff;
	    for (int i_210_ = 0; i_210_ < anIntArray9624.length; i_210_++) {
		int i_211_ = anIntArray9624[i_210_];
		int i_212_ = i_211_ >> 16 & 0xff;
		int i_213_ = i_211_ >> 8 & 0xff;
		int i_214_ = i_211_ & 0xff;
		int i_215_ = i_207_ - i_212_;
		if (i_215_ < 0)
		    i_215_ = -i_215_;
		int i_216_ = i_208_ - i_213_;
		if (i_216_ < 0)
		    i_216_ = -i_216_;
		int i_217_ = i_209_ - i_214_;
		if (i_217_ < 0)
		    i_217_ = -i_217_;
		int i_218_ = i_215_ + i_216_ + i_217_;
		if (i_218_ < i_206_) {
		    i_206_ = i_218_;
		    i_204_ = i_210_;
		}
	    }
	}
	int i_219_ = 0;
	byte[] is = new byte[anInt9625 * anInt9618];
	for (int i_220_ = 0; i_220_ < anInt9618; i_220_++) {
	    for (int i_221_ = 0; i_221_ < anInt9625; i_221_++) {
		int i_222_ = aByteArray9622[i_219_] & 0xff;
		if (anIntArray9624[i_222_] == 0) {
		    if (i_221_ > 0
			&& (anIntArray9624[aByteArray9622[i_219_ - 1] & 0xff]
			    != 0))
			i_222_ = i_204_;
		    else if (i_220_ > 0
			     && ((anIntArray9624
				  [aByteArray9622[i_219_ - anInt9625] & 0xff])
				 != 0))
			i_222_ = i_204_;
		    else if (i_221_ < anInt9625 - 1
			     && (anIntArray9624
				 [aByteArray9622[i_219_ + 1] & 0xff]) != 0)
			i_222_ = i_204_;
		    else if (i_220_ < anInt9618 - 1
			     && ((anIntArray9624
				  [aByteArray9622[i_219_ + anInt9625] & 0xff])
				 != 0))
			i_222_ = i_204_;
		}
		is[i_219_++] = (byte) i_222_;
	    }
	}
	aByteArray9622 = is;
    }
    
    public void method2812() {
	byte[] is = aByteArray9622;
	if (aByteArray9626 == null) {
	    for (int i = (anInt9618 >> 1) - 1; i >= 0; i--) {
		int i_223_ = i * anInt9625;
		int i_224_ = (anInt9618 - i - 1) * anInt9625;
		for (int i_225_ = -anInt9625; i_225_ < 0; i_225_++) {
		    byte i_226_ = is[i_223_];
		    is[i_223_] = is[i_224_];
		    is[i_224_] = i_226_;
		    i_223_++;
		    i_224_++;
		}
	    }
	} else {
	    byte[] is_227_ = aByteArray9626;
	    for (int i = (anInt9618 >> 1) - 1; i >= 0; i--) {
		int i_228_ = i * anInt9625;
		int i_229_ = (anInt9618 - i - 1) * anInt9625;
		for (int i_230_ = -anInt9625; i_230_ < 0; i_230_++) {
		    byte i_231_ = is[i_228_];
		    is[i_228_] = is[i_229_];
		    is[i_229_] = i_231_;
		    i_231_ = is_227_[i_228_];
		    is_227_[i_228_] = is_227_[i_229_];
		    is_227_[i_229_] = i_231_;
		    i_228_++;
		    i_229_++;
		}
	    }
	}
	int i = anInt9621;
	anInt9621 = anInt9619;
	anInt9619 = i;
    }
    
    public int method2798() {
	return anInt9620;
    }
    
    public void method2821() {
	byte[] is = new byte[anInt9625 * anInt9618];
	int i = 0;
	if (aByteArray9626 == null) {
	    for (int i_232_ = 0; i_232_ < anInt9625; i_232_++) {
		for (int i_233_ = anInt9618 - 1; i_233_ >= 0; i_233_--)
		    is[i++] = aByteArray9622[i_232_ + i_233_ * anInt9625];
	    }
	    aByteArray9622 = is;
	} else {
	    byte[] is_234_ = new byte[anInt9625 * anInt9618];
	    for (int i_235_ = 0; i_235_ < anInt9625; i_235_++) {
		for (int i_236_ = anInt9618 - 1; i_236_ >= 0; i_236_--) {
		    is[i] = aByteArray9622[i_235_ + i_236_ * anInt9625];
		    is_234_[i++] = aByteArray9626[i_235_ + i_236_ * anInt9625];
		}
	    }
	    aByteArray9622 = is;
	    aByteArray9626 = is_234_;
	}
	int i_237_ = anInt9621;
	anInt9621 = anInt9620;
	anInt9620 = anInt9619;
	anInt9619 = anInt9623;
	anInt9623 = i_237_;
	i_237_ = anInt9618;
	anInt9618 = anInt9625;
	anInt9625 = i_237_;
    }
    
    public void method2822() {
	byte[] is = new byte[anInt9625 * anInt9618];
	int i = 0;
	if (aByteArray9626 == null) {
	    for (int i_238_ = 0; i_238_ < anInt9625; i_238_++) {
		for (int i_239_ = anInt9618 - 1; i_239_ >= 0; i_239_--)
		    is[i++] = aByteArray9622[i_238_ + i_239_ * anInt9625];
	    }
	    aByteArray9622 = is;
	} else {
	    byte[] is_240_ = new byte[anInt9625 * anInt9618];
	    for (int i_241_ = 0; i_241_ < anInt9625; i_241_++) {
		for (int i_242_ = anInt9618 - 1; i_242_ >= 0; i_242_--) {
		    is[i] = aByteArray9622[i_241_ + i_242_ * anInt9625];
		    is_240_[i++] = aByteArray9626[i_241_ + i_242_ * anInt9625];
		}
	    }
	    aByteArray9622 = is;
	    aByteArray9626 = is_240_;
	}
	int i_243_ = anInt9621;
	anInt9621 = anInt9620;
	anInt9620 = anInt9619;
	anInt9619 = anInt9623;
	anInt9623 = i_243_;
	i_243_ = anInt9618;
	anInt9618 = anInt9625;
	anInt9625 = i_243_;
    }
    
    public int method2819() {
	return anInt9618 + anInt9621 + anInt9619;
    }
    
    public int[] method2824(boolean bool) {
	int[] is;
	if (bool) {
	    int i = method2771();
	    is = new int[i * method2819()];
	    if (aByteArray9626 != null) {
		for (int i_244_ = 0; i_244_ < anInt9618; i_244_++) {
		    int i_245_ = i_244_ * anInt9625;
		    int i_246_ = anInt9620 + (i_244_ + anInt9621) * i;
		    for (int i_247_ = 0; i_247_ < anInt9625; i_247_++) {
			is[i_246_++] = (aByteArray9626[i_245_] << 24
					| (anIntArray9624
					   [aByteArray9622[i_245_] & 0xff]));
			i_245_++;
		    }
		}
	    } else {
		for (int i_248_ = 0; i_248_ < anInt9618; i_248_++) {
		    int i_249_ = i_248_ * anInt9625;
		    int i_250_ = anInt9620 + (i_248_ + anInt9621) * i;
		    for (int i_251_ = 0; i_251_ < anInt9625; i_251_++) {
			int i_252_
			    = anIntArray9624[aByteArray9622[i_249_++] & 0xff];
			if (i_252_ != 0)
			    is[i_250_++] = ~0xffffff | i_252_;
			else
			    is[i_250_++] = 0;
		    }
		}
	    }
	} else {
	    is = new int[anInt9625 * anInt9618];
	    int i = 0;
	    int i_253_ = 0;
	    if (aByteArray9626 != null) {
		for (int i_254_ = 0; i_254_ < anInt9618; i_254_++) {
		    for (int i_255_ = 0; i_255_ < anInt9625; i_255_++) {
			is[i_253_++]
			    = (aByteArray9626[i] << 24
			       | anIntArray9624[aByteArray9622[i] & 0xff]);
			i++;
		    }
		}
	    } else {
		for (int i_256_ = 0; i_256_ < anInt9618; i_256_++) {
		    for (int i_257_ = 0; i_257_ < anInt9625; i_257_++) {
			int i_258_
			    = anIntArray9624[aByteArray9622[i++] & 0xff];
			is[i_253_++] = i_258_ != 0 ? ~0xffffff | i_258_ : 0;
		    }
		}
	    }
	}
	return is;
    }
    
    public void method2825(int i, int i_259_, int i_260_) {
	for (int i_261_ = 1; i_261_ < anIntArray9624.length; i_261_++) {
	    if (anIntArray9624[i_261_] != 1
		&& anIntArray9624[i_261_] != 16711935) {
		int i_262_ = anIntArray9624[i_261_] >> 16 & 0xff;
		i_262_ += i;
		if (i_262_ < 0)
		    i_262_ = 0;
		else if (i_262_ > 255)
		    i_262_ = 255;
		int i_263_ = anIntArray9624[i_261_] >> 8 & 0xff;
		i_263_ += i_259_;
		if (i_263_ < 0)
		    i_263_ = 0;
		else if (i_263_ > 255)
		    i_263_ = 255;
		int i_264_ = anIntArray9624[i_261_] >> 0 & 0xff;
		i_264_ += i_260_;
		if (i_264_ < 0)
		    i_264_ = 0;
		else if (i_264_ > 255)
		    i_264_ = 255;
		anIntArray9624[i_261_] = i_262_ << 16 | i_263_ << 8 | i_264_;
	    }
	}
    }
    
    public void method2830(int i, int i_265_, int i_266_) {
	for (int i_267_ = 1; i_267_ < anIntArray9624.length; i_267_++) {
	    if (anIntArray9624[i_267_] != 1
		&& anIntArray9624[i_267_] != 16711935) {
		int i_268_ = anIntArray9624[i_267_] >> 16 & 0xff;
		i_268_ += i;
		if (i_268_ < 0)
		    i_268_ = 0;
		else if (i_268_ > 255)
		    i_268_ = 255;
		int i_269_ = anIntArray9624[i_267_] >> 8 & 0xff;
		i_269_ += i_265_;
		if (i_269_ < 0)
		    i_269_ = 0;
		else if (i_269_ > 255)
		    i_269_ = 255;
		int i_270_ = anIntArray9624[i_267_] >> 0 & 0xff;
		i_270_ += i_266_;
		if (i_270_ < 0)
		    i_270_ = 0;
		else if (i_270_ > 255)
		    i_270_ = 255;
		anIntArray9624[i_267_] = i_268_ << 16 | i_269_ << 8 | i_270_;
	    }
	}
    }
    
    public void method2827(int i, int i_271_, int i_272_) {
	for (int i_273_ = 1; i_273_ < anIntArray9624.length; i_273_++) {
	    if (anIntArray9624[i_273_] != 1
		&& anIntArray9624[i_273_] != 16711935) {
		int i_274_ = anIntArray9624[i_273_] >> 16 & 0xff;
		i_274_ += i;
		if (i_274_ < 0)
		    i_274_ = 0;
		else if (i_274_ > 255)
		    i_274_ = 255;
		int i_275_ = anIntArray9624[i_273_] >> 8 & 0xff;
		i_275_ += i_271_;
		if (i_275_ < 0)
		    i_275_ = 0;
		else if (i_275_ > 255)
		    i_275_ = 255;
		int i_276_ = anIntArray9624[i_273_] >> 0 & 0xff;
		i_276_ += i_272_;
		if (i_276_ < 0)
		    i_276_ = 0;
		else if (i_276_ > 255)
		    i_276_ = 255;
		anIntArray9624[i_273_] = i_274_ << 16 | i_275_ << 8 | i_276_;
	    }
	}
    }
    
    public int method2799() {
	return anInt9621;
    }
    
    public void method2789() {
	byte[] is = new byte[anInt9625 * anInt9618];
	int i = 0;
	if (aByteArray9626 == null) {
	    for (int i_277_ = 0; i_277_ < anInt9625; i_277_++) {
		for (int i_278_ = anInt9618 - 1; i_278_ >= 0; i_278_--)
		    is[i++] = aByteArray9622[i_277_ + i_278_ * anInt9625];
	    }
	    aByteArray9622 = is;
	} else {
	    byte[] is_279_ = new byte[anInt9625 * anInt9618];
	    for (int i_280_ = 0; i_280_ < anInt9625; i_280_++) {
		for (int i_281_ = anInt9618 - 1; i_281_ >= 0; i_281_--) {
		    is[i] = aByteArray9622[i_280_ + i_281_ * anInt9625];
		    is_279_[i++] = aByteArray9626[i_280_ + i_281_ * anInt9625];
		}
	    }
	    aByteArray9622 = is;
	    aByteArray9626 = is_279_;
	}
	int i_282_ = anInt9621;
	anInt9621 = anInt9620;
	anInt9620 = anInt9619;
	anInt9619 = anInt9623;
	anInt9623 = i_282_;
	i_282_ = anInt9618;
	anInt9618 = anInt9625;
	anInt9625 = i_282_;
    }
    
    public boolean method2790() {
	return aByteArray9626 != null;
    }
    
    public void method2823(int i) {
	int i_283_ = -1;
	if (anIntArray9624.length < 255) {
	    for (int i_284_ = 0; i_284_ < anIntArray9624.length; i_284_++) {
		if (anIntArray9624[i_284_] == i) {
		    i_283_ = i_284_;
		    break;
		}
	    }
	    if (i_283_ == -1) {
		i_283_ = anIntArray9624.length;
		int[] is = new int[anIntArray9624.length + 1];
		System.arraycopy(anIntArray9624, 0, is, 0,
				 anIntArray9624.length);
		anIntArray9624 = is;
		is[i_283_] = i;
	    }
	} else {
	    int i_285_ = 2147483647;
	    int i_286_ = i >> 16 & 0xff;
	    int i_287_ = i >> 8 & 0xff;
	    int i_288_ = i & 0xff;
	    for (int i_289_ = 0; i_289_ < anIntArray9624.length; i_289_++) {
		int i_290_ = anIntArray9624[i_289_];
		int i_291_ = i_290_ >> 16 & 0xff;
		int i_292_ = i_290_ >> 8 & 0xff;
		int i_293_ = i_290_ & 0xff;
		int i_294_ = i_286_ - i_291_;
		if (i_294_ < 0)
		    i_294_ = -i_294_;
		int i_295_ = i_287_ - i_292_;
		if (i_295_ < 0)
		    i_295_ = -i_295_;
		int i_296_ = i_288_ - i_293_;
		if (i_296_ < 0)
		    i_296_ = -i_296_;
		int i_297_ = i_294_ + i_295_ + i_296_;
		if (i_297_ < i_285_) {
		    i_285_ = i_297_;
		    i_283_ = i_289_;
		}
	    }
	}
	for (int i_298_ = anInt9618 - 1; i_298_ > 0; i_298_--) {
	    int i_299_ = i_298_ * anInt9625;
	    for (int i_300_ = anInt9625 - 1; i_300_ > 0; i_300_--) {
		if (anIntArray9624[aByteArray9622[i_300_ + i_299_] & 0xff] == 0
		    && (anIntArray9624[aByteArray9622[(i_300_ + i_299_ - 1
						       - anInt9625)] & 0xff]
			!= 0))
		    aByteArray9622[i_300_ + i_299_] = (byte) i_283_;
	    }
	}
    }
}
