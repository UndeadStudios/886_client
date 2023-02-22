/* Class175_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class175_Sub4 extends Class175
{
    byte[][] aByteArrayArray9933;
    int[] anIntArray9934;
    int[] anIntArray9935;
    int[] anIntArray9936;
    Class182_Sub2 aClass182_Sub2_9937;
    int[] anIntArray9938;
    int[] anIntArray9939;
    public static JS5 aClass458_9940;
    public static int anInt9941;
    
    void method15619(byte[] is, int[] is_0_, int[] is_1_, int i, int i_2_,
		     int i_3_, int i_4_, int i_5_, int i_6_, int i_7_,
		     int i_8_, int i_9_, int i_10_, Class152 class152,
		     int i_11_, int i_12_) {
	Class152_Sub1 class152_sub1 = (Class152_Sub1) class152;
	int[] is_13_ = class152_sub1.anIntArray8998;
	int[] is_14_ = class152_sub1.anIntArray8997;
	int i_15_ = i_8_ - 1988019027 * aClass182_Sub2_9937.anInt9470;
	int i_16_ = i_9_;
	if (i_12_ > i_16_) {
	    i_16_ = i_12_;
	    i_3_ += (i_12_ - i_9_) * (-476035351
				      * aClass182_Sub2_9937.anInt9494);
	    i_2_ += i_10_ * (i_12_ - i_9_);
	}
	int i_17_ = (i_12_ + is_13_.length < i_9_ + i_5_
		     ? i_12_ + is_13_.length : i_5_ + i_9_);
	boolean bool = false;
	for (int i_18_ = i_16_; i_18_ < i_17_; i_18_++) {
	    int i_19_ = is_13_[i_18_ - i_12_] + i_11_;
	    int i_20_ = is_14_[i_18_ - i_12_];
	    int i_21_ = i_4_;
	    if (i_15_ > i_19_) {
		int i_22_ = i_15_ - i_19_;
		if (i_22_ >= i_20_) {
		    i_2_ += i_7_ + i_4_;
		    i_3_ += i_6_ + i_4_;
		    continue;
		}
		i_20_ -= i_22_;
	    } else {
		int i_23_ = i_19_ - i_15_;
		if (i_23_ >= i_4_) {
		    i_2_ += i_4_ + i_7_;
		    i_3_ += i_6_ + i_4_;
		    continue;
		}
		i_2_ += i_23_;
		i_21_ -= i_23_;
		i_3_ += i_23_;
	    }
	    int i_24_ = 0;
	    if (i_21_ < i_20_)
		i_20_ = i_21_;
	    else
		i_24_ = i_21_ - i_20_;
	    for (int i_25_ = -i_20_; i_25_ < 0; i_25_++) {
		int i_26_;
		if ((i_26_ = is[i_2_++]) != 0)
		    is_0_[i_3_++] = is_1_[i_26_ & 0xff];
		else
		    i_3_++;
	    }
	    i_2_ += i_24_ + i_7_;
	    i_3_ += i_6_ + i_24_;
	}
    }
    
    void method15620(byte[] is, int[] is_27_, int i, int i_28_, int i_29_,
		     int i_30_, int i_31_, int i_32_, int i_33_) {
	int i_34_ = -(i_30_ >> 2);
	i_30_ = -(i_30_ & 0x3);
	for (int i_35_ = -i_31_; i_35_ < 0; i_35_++) {
	    for (int i_36_ = i_34_; i_36_ < 0; i_36_++) {
		if (is[i_28_++] != 0)
		    is_27_[i_29_++] = i;
		else
		    i_29_++;
		if (is[i_28_++] != 0)
		    is_27_[i_29_++] = i;
		else
		    i_29_++;
		if (is[i_28_++] != 0)
		    is_27_[i_29_++] = i;
		else
		    i_29_++;
		if (is[i_28_++] != 0)
		    is_27_[i_29_++] = i;
		else
		    i_29_++;
	    }
	    for (int i_37_ = i_30_; i_37_ < 0; i_37_++) {
		if (is[i_28_++] != 0)
		    is_27_[i_29_++] = i;
		else
		    i_29_++;
	    }
	    i_29_ += i_32_;
	    i_28_ += i_33_;
	}
    }
    
    void method15621(byte[] is, int[] is_38_, int[] is_39_, int i, int i_40_,
		     int i_41_, int i_42_, int i_43_, int i_44_) {
	int i_45_ = -(i_41_ >> 2);
	i_41_ = -(i_41_ & 0x3);
	boolean bool = false;
	for (int i_46_ = -i_42_; i_46_ < 0; i_46_++) {
	    for (int i_47_ = i_45_; i_47_ < 0; i_47_++) {
		int i_48_;
		if ((i_48_ = is[i++]) != 0)
		    is_38_[i_40_++] = is_39_[i_48_ & 0xff];
		else
		    i_40_++;
		if ((i_48_ = is[i++]) != 0)
		    is_38_[i_40_++] = is_39_[i_48_ & 0xff];
		else
		    i_40_++;
		if ((i_48_ = is[i++]) != 0)
		    is_38_[i_40_++] = is_39_[i_48_ & 0xff];
		else
		    i_40_++;
		if ((i_48_ = is[i++]) != 0)
		    is_38_[i_40_++] = is_39_[i_48_ & 0xff];
		else
		    i_40_++;
	    }
	    for (int i_49_ = i_41_; i_49_ < 0; i_49_++) {
		int i_50_;
		if ((i_50_ = is[i++]) != 0)
		    is_38_[i_40_++] = is_39_[i_50_ & 0xff];
		else
		    i_40_++;
	    }
	    i_40_ += i_43_;
	    i += i_44_;
	}
    }
    
    void method15622(byte[] is, int[] is_51_, int i, int i_52_, int i_53_,
		     int i_54_, int i_55_, int i_56_, int i_57_) {
	int i_58_ = -(i_54_ >> 2);
	i_54_ = -(i_54_ & 0x3);
	for (int i_59_ = -i_55_; i_59_ < 0; i_59_++) {
	    for (int i_60_ = i_58_; i_60_ < 0; i_60_++) {
		if (is[i_52_++] != 0)
		    is_51_[i_53_++] = i;
		else
		    i_53_++;
		if (is[i_52_++] != 0)
		    is_51_[i_53_++] = i;
		else
		    i_53_++;
		if (is[i_52_++] != 0)
		    is_51_[i_53_++] = i;
		else
		    i_53_++;
		if (is[i_52_++] != 0)
		    is_51_[i_53_++] = i;
		else
		    i_53_++;
	    }
	    for (int i_61_ = i_54_; i_61_ < 0; i_61_++) {
		if (is[i_52_++] != 0)
		    is_51_[i_53_++] = i;
		else
		    i_53_++;
	    }
	    i_53_ += i_56_;
	    i_52_ += i_57_;
	}
    }
    
    void method2868(char c, int i, int i_62_, int i_63_, boolean bool,
		    Class152 class152, int i_64_, int i_65_) {
	if (aClass182_Sub2_9937.anIntArray9466 != null) {
	    if (null == class152)
		method2874(c, i, i_62_, i_63_, bool);
	    else {
		i += anIntArray9939[c];
		i_62_ += anIntArray9938[c];
		int i_66_ = anIntArray9936[c];
		int i_67_ = anIntArray9934[c];
		int i_68_ = aClass182_Sub2_9937.anInt9494 * -476035351;
		int i_69_ = i + i_62_ * i_68_;
		int i_70_ = i_68_ - i_66_;
		int i_71_ = 0;
		int i_72_ = 0;
		if (i_62_ < 1722112305 * aClass182_Sub2_9937.anInt9472) {
		    int i_73_
			= aClass182_Sub2_9937.anInt9472 * 1722112305 - i_62_;
		    i_67_ -= i_73_;
		    i_62_ = aClass182_Sub2_9937.anInt9472 * 1722112305;
		    i_72_ += i_66_ * i_73_;
		    i_69_ += i_73_ * i_68_;
		}
		if (i_67_ + i_62_ > aClass182_Sub2_9937.anInt9473 * 1920901985)
		    i_67_ -= (i_62_ + i_67_
			      - aClass182_Sub2_9937.anInt9473 * 1920901985);
		if (i < aClass182_Sub2_9937.anInt9470 * 1988019027) {
		    int i_74_ = aClass182_Sub2_9937.anInt9470 * 1988019027 - i;
		    i_66_ -= i_74_;
		    i = 1988019027 * aClass182_Sub2_9937.anInt9470;
		    i_72_ += i_74_;
		    i_69_ += i_74_;
		    i_71_ += i_74_;
		    i_70_ += i_74_;
		}
		if (i_66_ + i > -466178451 * aClass182_Sub2_9937.anInt9499) {
		    int i_75_ = (i + i_66_
				 - -466178451 * aClass182_Sub2_9937.anInt9499);
		    i_66_ -= i_75_;
		    i_71_ += i_75_;
		    i_70_ += i_75_;
		}
		if (i_66_ > 0 && i_67_ > 0) {
		    if (bool)
			method15624(aByteArrayArray9933[c],
				    aClass182_Sub2_9937.anIntArray9466, i_63_,
				    i_72_, i_69_, i_66_, i_67_, i_70_, i_71_,
				    i, i_62_, anIntArray9936[c], class152,
				    i_64_, i_65_);
		    else
			method15619(aByteArrayArray9933[c],
				    aClass182_Sub2_9937.anIntArray9466,
				    anIntArray9935, i_63_, i_72_, i_69_, i_66_,
				    i_67_, i_70_, i_71_, i, i_62_,
				    anIntArray9936[c], class152, i_64_, i_65_);
		}
	    }
	}
    }
    
    void method2874(char c, int i, int i_76_, int i_77_, boolean bool) {
	if (aClass182_Sub2_9937.anIntArray9466 != null) {
	    i += anIntArray9939[c];
	    i_76_ += anIntArray9938[c];
	    int i_78_ = anIntArray9936[c];
	    int i_79_ = anIntArray9934[c];
	    int i_80_ = -476035351 * aClass182_Sub2_9937.anInt9494;
	    int i_81_ = i + i_76_ * i_80_;
	    int i_82_ = i_80_ - i_78_;
	    int i_83_ = 0;
	    int i_84_ = 0;
	    if (i_76_ < 1722112305 * aClass182_Sub2_9937.anInt9472) {
		int i_85_ = 1722112305 * aClass182_Sub2_9937.anInt9472 - i_76_;
		i_79_ -= i_85_;
		i_76_ = 1722112305 * aClass182_Sub2_9937.anInt9472;
		i_84_ += i_78_ * i_85_;
		i_81_ += i_80_ * i_85_;
	    }
	    if (i_79_ + i_76_ > 1920901985 * aClass182_Sub2_9937.anInt9473)
		i_79_ -= (i_76_ + i_79_
			  - aClass182_Sub2_9937.anInt9473 * 1920901985);
	    if (i < 1988019027 * aClass182_Sub2_9937.anInt9470) {
		int i_86_ = aClass182_Sub2_9937.anInt9470 * 1988019027 - i;
		i_78_ -= i_86_;
		i = 1988019027 * aClass182_Sub2_9937.anInt9470;
		i_84_ += i_86_;
		i_81_ += i_86_;
		i_83_ += i_86_;
		i_82_ += i_86_;
	    }
	    if (i + i_78_ > -466178451 * aClass182_Sub2_9937.anInt9499) {
		int i_87_
		    = i + i_78_ - aClass182_Sub2_9937.anInt9499 * -466178451;
		i_78_ -= i_87_;
		i_83_ += i_87_;
		i_82_ += i_87_;
	    }
	    if (i_78_ > 0 && i_79_ > 0) {
		if (bool)
		    method15622(aByteArrayArray9933[c],
				aClass182_Sub2_9937.anIntArray9466, i_77_,
				i_84_, i_81_, i_78_, i_79_, i_82_, i_83_);
		else
		    method15621(aByteArrayArray9933[c],
				aClass182_Sub2_9937.anIntArray9466,
				anIntArray9935, i_84_, i_81_, i_78_, i_79_,
				i_82_, i_83_);
	    }
	}
    }
    
    void method2858(char c, int i, int i_88_, int i_89_, boolean bool,
		    Class152 class152, int i_90_, int i_91_) {
	if (aClass182_Sub2_9937.anIntArray9466 != null) {
	    if (null == class152)
		method2874(c, i, i_88_, i_89_, bool);
	    else {
		i += anIntArray9939[c];
		i_88_ += anIntArray9938[c];
		int i_92_ = anIntArray9936[c];
		int i_93_ = anIntArray9934[c];
		int i_94_ = aClass182_Sub2_9937.anInt9494 * -476035351;
		int i_95_ = i + i_88_ * i_94_;
		int i_96_ = i_94_ - i_92_;
		int i_97_ = 0;
		int i_98_ = 0;
		if (i_88_ < 1722112305 * aClass182_Sub2_9937.anInt9472) {
		    int i_99_
			= aClass182_Sub2_9937.anInt9472 * 1722112305 - i_88_;
		    i_93_ -= i_99_;
		    i_88_ = aClass182_Sub2_9937.anInt9472 * 1722112305;
		    i_98_ += i_92_ * i_99_;
		    i_95_ += i_99_ * i_94_;
		}
		if (i_93_ + i_88_ > aClass182_Sub2_9937.anInt9473 * 1920901985)
		    i_93_ -= (i_88_ + i_93_
			      - aClass182_Sub2_9937.anInt9473 * 1920901985);
		if (i < aClass182_Sub2_9937.anInt9470 * 1988019027) {
		    int i_100_
			= aClass182_Sub2_9937.anInt9470 * 1988019027 - i;
		    i_92_ -= i_100_;
		    i = 1988019027 * aClass182_Sub2_9937.anInt9470;
		    i_98_ += i_100_;
		    i_95_ += i_100_;
		    i_97_ += i_100_;
		    i_96_ += i_100_;
		}
		if (i_92_ + i > -466178451 * aClass182_Sub2_9937.anInt9499) {
		    int i_101_
			= (i + i_92_
			   - -466178451 * aClass182_Sub2_9937.anInt9499);
		    i_92_ -= i_101_;
		    i_97_ += i_101_;
		    i_96_ += i_101_;
		}
		if (i_92_ > 0 && i_93_ > 0) {
		    if (bool)
			method15624(aByteArrayArray9933[c],
				    aClass182_Sub2_9937.anIntArray9466, i_89_,
				    i_98_, i_95_, i_92_, i_93_, i_96_, i_97_,
				    i, i_88_, anIntArray9936[c], class152,
				    i_90_, i_91_);
		    else
			method15619(aByteArrayArray9933[c],
				    aClass182_Sub2_9937.anIntArray9466,
				    anIntArray9935, i_89_, i_98_, i_95_, i_92_,
				    i_93_, i_96_, i_97_, i, i_88_,
				    anIntArray9936[c], class152, i_90_, i_91_);
		}
	    }
	}
    }
    
    void method2854(char c, int i, int i_102_, int i_103_, boolean bool) {
	if (aClass182_Sub2_9937.anIntArray9466 != null) {
	    i += anIntArray9939[c];
	    i_102_ += anIntArray9938[c];
	    int i_104_ = anIntArray9936[c];
	    int i_105_ = anIntArray9934[c];
	    int i_106_ = -476035351 * aClass182_Sub2_9937.anInt9494;
	    int i_107_ = i + i_102_ * i_106_;
	    int i_108_ = i_106_ - i_104_;
	    int i_109_ = 0;
	    int i_110_ = 0;
	    if (i_102_ < 1722112305 * aClass182_Sub2_9937.anInt9472) {
		int i_111_
		    = 1722112305 * aClass182_Sub2_9937.anInt9472 - i_102_;
		i_105_ -= i_111_;
		i_102_ = 1722112305 * aClass182_Sub2_9937.anInt9472;
		i_110_ += i_104_ * i_111_;
		i_107_ += i_106_ * i_111_;
	    }
	    if (i_105_ + i_102_ > 1920901985 * aClass182_Sub2_9937.anInt9473)
		i_105_ -= (i_102_ + i_105_
			   - aClass182_Sub2_9937.anInt9473 * 1920901985);
	    if (i < 1988019027 * aClass182_Sub2_9937.anInt9470) {
		int i_112_ = aClass182_Sub2_9937.anInt9470 * 1988019027 - i;
		i_104_ -= i_112_;
		i = 1988019027 * aClass182_Sub2_9937.anInt9470;
		i_110_ += i_112_;
		i_107_ += i_112_;
		i_109_ += i_112_;
		i_108_ += i_112_;
	    }
	    if (i + i_104_ > -466178451 * aClass182_Sub2_9937.anInt9499) {
		int i_113_
		    = i + i_104_ - aClass182_Sub2_9937.anInt9499 * -466178451;
		i_104_ -= i_113_;
		i_109_ += i_113_;
		i_108_ += i_113_;
	    }
	    if (i_104_ > 0 && i_105_ > 0) {
		if (bool)
		    method15622(aByteArrayArray9933[c],
				aClass182_Sub2_9937.anIntArray9466, i_103_,
				i_110_, i_107_, i_104_, i_105_, i_108_,
				i_109_);
		else
		    method15621(aByteArrayArray9933[c],
				aClass182_Sub2_9937.anIntArray9466,
				anIntArray9935, i_110_, i_107_, i_104_, i_105_,
				i_108_, i_109_);
	    }
	}
    }
    
    void method2853(char c, int i, int i_114_, int i_115_, boolean bool) {
	if (aClass182_Sub2_9937.anIntArray9466 != null) {
	    i += anIntArray9939[c];
	    i_114_ += anIntArray9938[c];
	    int i_116_ = anIntArray9936[c];
	    int i_117_ = anIntArray9934[c];
	    int i_118_ = -476035351 * aClass182_Sub2_9937.anInt9494;
	    int i_119_ = i + i_114_ * i_118_;
	    int i_120_ = i_118_ - i_116_;
	    int i_121_ = 0;
	    int i_122_ = 0;
	    if (i_114_ < 1722112305 * aClass182_Sub2_9937.anInt9472) {
		int i_123_
		    = 1722112305 * aClass182_Sub2_9937.anInt9472 - i_114_;
		i_117_ -= i_123_;
		i_114_ = 1722112305 * aClass182_Sub2_9937.anInt9472;
		i_122_ += i_116_ * i_123_;
		i_119_ += i_118_ * i_123_;
	    }
	    if (i_117_ + i_114_ > 1920901985 * aClass182_Sub2_9937.anInt9473)
		i_117_ -= (i_114_ + i_117_
			   - aClass182_Sub2_9937.anInt9473 * 1920901985);
	    if (i < 1988019027 * aClass182_Sub2_9937.anInt9470) {
		int i_124_ = aClass182_Sub2_9937.anInt9470 * 1988019027 - i;
		i_116_ -= i_124_;
		i = 1988019027 * aClass182_Sub2_9937.anInt9470;
		i_122_ += i_124_;
		i_119_ += i_124_;
		i_121_ += i_124_;
		i_120_ += i_124_;
	    }
	    if (i + i_116_ > -466178451 * aClass182_Sub2_9937.anInt9499) {
		int i_125_
		    = i + i_116_ - aClass182_Sub2_9937.anInt9499 * -466178451;
		i_116_ -= i_125_;
		i_121_ += i_125_;
		i_120_ += i_125_;
	    }
	    if (i_116_ > 0 && i_117_ > 0) {
		if (bool)
		    method15622(aByteArrayArray9933[c],
				aClass182_Sub2_9937.anIntArray9466, i_115_,
				i_122_, i_119_, i_116_, i_117_, i_120_,
				i_121_);
		else
		    method15621(aByteArrayArray9933[c],
				aClass182_Sub2_9937.anIntArray9466,
				anIntArray9935, i_122_, i_119_, i_116_, i_117_,
				i_120_, i_121_);
	    }
	}
    }
    
    void method2856(char c, int i, int i_126_, int i_127_, boolean bool) {
	if (aClass182_Sub2_9937.anIntArray9466 != null) {
	    i += anIntArray9939[c];
	    i_126_ += anIntArray9938[c];
	    int i_128_ = anIntArray9936[c];
	    int i_129_ = anIntArray9934[c];
	    int i_130_ = -476035351 * aClass182_Sub2_9937.anInt9494;
	    int i_131_ = i + i_126_ * i_130_;
	    int i_132_ = i_130_ - i_128_;
	    int i_133_ = 0;
	    int i_134_ = 0;
	    if (i_126_ < 1722112305 * aClass182_Sub2_9937.anInt9472) {
		int i_135_
		    = 1722112305 * aClass182_Sub2_9937.anInt9472 - i_126_;
		i_129_ -= i_135_;
		i_126_ = 1722112305 * aClass182_Sub2_9937.anInt9472;
		i_134_ += i_128_ * i_135_;
		i_131_ += i_130_ * i_135_;
	    }
	    if (i_129_ + i_126_ > 1920901985 * aClass182_Sub2_9937.anInt9473)
		i_129_ -= (i_126_ + i_129_
			   - aClass182_Sub2_9937.anInt9473 * 1920901985);
	    if (i < 1988019027 * aClass182_Sub2_9937.anInt9470) {
		int i_136_ = aClass182_Sub2_9937.anInt9470 * 1988019027 - i;
		i_128_ -= i_136_;
		i = 1988019027 * aClass182_Sub2_9937.anInt9470;
		i_134_ += i_136_;
		i_131_ += i_136_;
		i_133_ += i_136_;
		i_132_ += i_136_;
	    }
	    if (i + i_128_ > -466178451 * aClass182_Sub2_9937.anInt9499) {
		int i_137_
		    = i + i_128_ - aClass182_Sub2_9937.anInt9499 * -466178451;
		i_128_ -= i_137_;
		i_133_ += i_137_;
		i_132_ += i_137_;
	    }
	    if (i_128_ > 0 && i_129_ > 0) {
		if (bool)
		    method15622(aByteArrayArray9933[c],
				aClass182_Sub2_9937.anIntArray9466, i_127_,
				i_134_, i_131_, i_128_, i_129_, i_132_,
				i_133_);
		else
		    method15621(aByteArrayArray9933[c],
				aClass182_Sub2_9937.anIntArray9466,
				anIntArray9935, i_134_, i_131_, i_128_, i_129_,
				i_132_, i_133_);
	    }
	}
    }
    
    void method2857(char c, int i, int i_138_, int i_139_, boolean bool,
		    Class152 class152, int i_140_, int i_141_) {
	if (aClass182_Sub2_9937.anIntArray9466 != null) {
	    if (null == class152)
		method2874(c, i, i_138_, i_139_, bool);
	    else {
		i += anIntArray9939[c];
		i_138_ += anIntArray9938[c];
		int i_142_ = anIntArray9936[c];
		int i_143_ = anIntArray9934[c];
		int i_144_ = aClass182_Sub2_9937.anInt9494 * -476035351;
		int i_145_ = i + i_138_ * i_144_;
		int i_146_ = i_144_ - i_142_;
		int i_147_ = 0;
		int i_148_ = 0;
		if (i_138_ < 1722112305 * aClass182_Sub2_9937.anInt9472) {
		    int i_149_
			= aClass182_Sub2_9937.anInt9472 * 1722112305 - i_138_;
		    i_143_ -= i_149_;
		    i_138_ = aClass182_Sub2_9937.anInt9472 * 1722112305;
		    i_148_ += i_142_ * i_149_;
		    i_145_ += i_149_ * i_144_;
		}
		if (i_143_ + i_138_
		    > aClass182_Sub2_9937.anInt9473 * 1920901985)
		    i_143_ -= (i_138_ + i_143_
			       - aClass182_Sub2_9937.anInt9473 * 1920901985);
		if (i < aClass182_Sub2_9937.anInt9470 * 1988019027) {
		    int i_150_
			= aClass182_Sub2_9937.anInt9470 * 1988019027 - i;
		    i_142_ -= i_150_;
		    i = 1988019027 * aClass182_Sub2_9937.anInt9470;
		    i_148_ += i_150_;
		    i_145_ += i_150_;
		    i_147_ += i_150_;
		    i_146_ += i_150_;
		}
		if (i_142_ + i > -466178451 * aClass182_Sub2_9937.anInt9499) {
		    int i_151_
			= (i + i_142_
			   - -466178451 * aClass182_Sub2_9937.anInt9499);
		    i_142_ -= i_151_;
		    i_147_ += i_151_;
		    i_146_ += i_151_;
		}
		if (i_142_ > 0 && i_143_ > 0) {
		    if (bool)
			method15624(aByteArrayArray9933[c],
				    aClass182_Sub2_9937.anIntArray9466, i_139_,
				    i_148_, i_145_, i_142_, i_143_, i_146_,
				    i_147_, i, i_138_, anIntArray9936[c],
				    class152, i_140_, i_141_);
		    else
			method15619(aByteArrayArray9933[c],
				    aClass182_Sub2_9937.anIntArray9466,
				    anIntArray9935, i_139_, i_148_, i_145_,
				    i_142_, i_143_, i_146_, i_147_, i, i_138_,
				    anIntArray9936[c], class152, i_140_,
				    i_141_);
		}
	    }
	}
    }
    
    void method15623(byte[] is, int[] is_152_, int[] is_153_, int i,
		     int i_154_, int i_155_, int i_156_, int i_157_,
		     int i_158_) {
	int i_159_ = -(i_155_ >> 2);
	i_155_ = -(i_155_ & 0x3);
	boolean bool = false;
	for (int i_160_ = -i_156_; i_160_ < 0; i_160_++) {
	    for (int i_161_ = i_159_; i_161_ < 0; i_161_++) {
		int i_162_;
		if ((i_162_ = is[i++]) != 0)
		    is_152_[i_154_++] = is_153_[i_162_ & 0xff];
		else
		    i_154_++;
		if ((i_162_ = is[i++]) != 0)
		    is_152_[i_154_++] = is_153_[i_162_ & 0xff];
		else
		    i_154_++;
		if ((i_162_ = is[i++]) != 0)
		    is_152_[i_154_++] = is_153_[i_162_ & 0xff];
		else
		    i_154_++;
		if ((i_162_ = is[i++]) != 0)
		    is_152_[i_154_++] = is_153_[i_162_ & 0xff];
		else
		    i_154_++;
	    }
	    for (int i_163_ = i_155_; i_163_ < 0; i_163_++) {
		int i_164_;
		if ((i_164_ = is[i++]) != 0)
		    is_152_[i_154_++] = is_153_[i_164_ & 0xff];
		else
		    i_154_++;
	    }
	    i_154_ += i_157_;
	    i += i_158_;
	}
    }
    
    Class175_Sub4(Class182_Sub2 class182_sub2, Class7 class7,
		  Class173_Sub2[] class173_sub2s, int[] is, int[] is_165_) {
	super(class182_sub2, class7);
	aClass182_Sub2_9937 = class182_sub2;
	aClass182_Sub2_9937 = class182_sub2;
	anIntArray9936 = is;
	anIntArray9934 = is_165_;
	aByteArrayArray9933 = new byte[class173_sub2s.length][];
	anIntArray9938 = new int[class173_sub2s.length];
	anIntArray9939 = new int[class173_sub2s.length];
	for (int i = 0; i < class173_sub2s.length; i++) {
	    aByteArrayArray9933[i] = class173_sub2s[i].aByteArray9622;
	    anIntArray9938[i] = class173_sub2s[i].anInt9621;
	    anIntArray9939[i] = class173_sub2s[i].anInt9620;
	}
	anIntArray9935 = class173_sub2s[0].anIntArray9624;
    }
    
    void method15624(byte[] is, int[] is_166_, int i, int i_167_, int i_168_,
		     int i_169_, int i_170_, int i_171_, int i_172_,
		     int i_173_, int i_174_, int i_175_, Class152 class152,
		     int i_176_, int i_177_) {
	Class152_Sub1 class152_sub1 = (Class152_Sub1) class152;
	int[] is_178_ = class152_sub1.anIntArray8998;
	int[] is_179_ = class152_sub1.anIntArray8997;
	int i_180_ = i_173_ - 1988019027 * aClass182_Sub2_9937.anInt9470;
	int i_181_ = i_174_;
	if (i_177_ > i_181_) {
	    i_181_ = i_177_;
	    i_168_ += aClass182_Sub2_9937.anInt9494 * -476035351 * (i_177_
								    - i_174_);
	    i_167_ += (i_177_ - i_174_) * i_175_;
	}
	int i_182_ = (i_177_ + is_178_.length < i_170_ + i_174_
		      ? is_178_.length + i_177_ : i_170_ + i_174_);
	for (int i_183_ = i_181_; i_183_ < i_182_; i_183_++) {
	    int i_184_ = i_176_ + is_178_[i_183_ - i_177_];
	    int i_185_ = is_179_[i_183_ - i_177_];
	    int i_186_ = i_169_;
	    if (i_180_ > i_184_) {
		int i_187_ = i_180_ - i_184_;
		if (i_187_ >= i_185_) {
		    i_167_ += i_172_ + i_169_;
		    i_168_ += i_171_ + i_169_;
		    continue;
		}
		i_185_ -= i_187_;
	    } else {
		int i_188_ = i_184_ - i_180_;
		if (i_188_ >= i_169_) {
		    i_167_ += i_172_ + i_169_;
		    i_168_ += i_169_ + i_171_;
		    continue;
		}
		i_167_ += i_188_;
		i_186_ -= i_188_;
		i_168_ += i_188_;
	    }
	    int i_189_ = 0;
	    if (i_186_ < i_185_)
		i_185_ = i_186_;
	    else
		i_189_ = i_186_ - i_185_;
	    for (int i_190_ = -i_185_; i_190_ < 0; i_190_++) {
		if (is[i_167_++] != 0)
		    is_166_[i_168_++] = i;
		else
		    i_168_++;
	    }
	    i_167_ += i_167_ + i_189_;
	    i_168_ += i_189_ + i_171_;
	}
    }
    
    void method15625(byte[] is, int[] is_191_, int[] is_192_, int i,
		     int i_193_, int i_194_, int i_195_, int i_196_,
		     int i_197_) {
	int i_198_ = -(i_194_ >> 2);
	i_194_ = -(i_194_ & 0x3);
	boolean bool = false;
	for (int i_199_ = -i_195_; i_199_ < 0; i_199_++) {
	    for (int i_200_ = i_198_; i_200_ < 0; i_200_++) {
		int i_201_;
		if ((i_201_ = is[i++]) != 0)
		    is_191_[i_193_++] = is_192_[i_201_ & 0xff];
		else
		    i_193_++;
		if ((i_201_ = is[i++]) != 0)
		    is_191_[i_193_++] = is_192_[i_201_ & 0xff];
		else
		    i_193_++;
		if ((i_201_ = is[i++]) != 0)
		    is_191_[i_193_++] = is_192_[i_201_ & 0xff];
		else
		    i_193_++;
		if ((i_201_ = is[i++]) != 0)
		    is_191_[i_193_++] = is_192_[i_201_ & 0xff];
		else
		    i_193_++;
	    }
	    for (int i_202_ = i_194_; i_202_ < 0; i_202_++) {
		int i_203_;
		if ((i_203_ = is[i++]) != 0)
		    is_191_[i_193_++] = is_192_[i_203_ & 0xff];
		else
		    i_193_++;
	    }
	    i_193_ += i_196_;
	    i += i_197_;
	}
    }
    
    void method15626(byte[] is, int[] is_204_, int i, int i_205_, int i_206_,
		     int i_207_, int i_208_, int i_209_, int i_210_,
		     int i_211_, int i_212_, int i_213_, Class152 class152,
		     int i_214_, int i_215_) {
	Class152_Sub1 class152_sub1 = (Class152_Sub1) class152;
	int[] is_216_ = class152_sub1.anIntArray8998;
	int[] is_217_ = class152_sub1.anIntArray8997;
	int i_218_ = i_211_ - 1988019027 * aClass182_Sub2_9937.anInt9470;
	int i_219_ = i_212_;
	if (i_215_ > i_219_) {
	    i_219_ = i_215_;
	    i_206_ += aClass182_Sub2_9937.anInt9494 * -476035351 * (i_215_
								    - i_212_);
	    i_205_ += (i_215_ - i_212_) * i_213_;
	}
	int i_220_ = (i_215_ + is_216_.length < i_208_ + i_212_
		      ? is_216_.length + i_215_ : i_208_ + i_212_);
	for (int i_221_ = i_219_; i_221_ < i_220_; i_221_++) {
	    int i_222_ = i_214_ + is_216_[i_221_ - i_215_];
	    int i_223_ = is_217_[i_221_ - i_215_];
	    int i_224_ = i_207_;
	    if (i_218_ > i_222_) {
		int i_225_ = i_218_ - i_222_;
		if (i_225_ >= i_223_) {
		    i_205_ += i_210_ + i_207_;
		    i_206_ += i_209_ + i_207_;
		    continue;
		}
		i_223_ -= i_225_;
	    } else {
		int i_226_ = i_222_ - i_218_;
		if (i_226_ >= i_207_) {
		    i_205_ += i_210_ + i_207_;
		    i_206_ += i_207_ + i_209_;
		    continue;
		}
		i_205_ += i_226_;
		i_224_ -= i_226_;
		i_206_ += i_226_;
	    }
	    int i_227_ = 0;
	    if (i_224_ < i_223_)
		i_223_ = i_224_;
	    else
		i_227_ = i_224_ - i_223_;
	    for (int i_228_ = -i_223_; i_228_ < 0; i_228_++) {
		if (is[i_205_++] != 0)
		    is_204_[i_206_++] = i;
		else
		    i_206_++;
	    }
	    i_205_ += i_205_ + i_227_;
	    i_206_ += i_227_ + i_209_;
	}
    }
    
    void method15627(byte[] is, int[] is_229_, int[] is_230_, int i,
		     int i_231_, int i_232_, int i_233_, int i_234_,
		     int i_235_) {
	int i_236_ = -(i_232_ >> 2);
	i_232_ = -(i_232_ & 0x3);
	boolean bool = false;
	for (int i_237_ = -i_233_; i_237_ < 0; i_237_++) {
	    for (int i_238_ = i_236_; i_238_ < 0; i_238_++) {
		int i_239_;
		if ((i_239_ = is[i++]) != 0)
		    is_229_[i_231_++] = is_230_[i_239_ & 0xff];
		else
		    i_231_++;
		if ((i_239_ = is[i++]) != 0)
		    is_229_[i_231_++] = is_230_[i_239_ & 0xff];
		else
		    i_231_++;
		if ((i_239_ = is[i++]) != 0)
		    is_229_[i_231_++] = is_230_[i_239_ & 0xff];
		else
		    i_231_++;
		if ((i_239_ = is[i++]) != 0)
		    is_229_[i_231_++] = is_230_[i_239_ & 0xff];
		else
		    i_231_++;
	    }
	    for (int i_240_ = i_232_; i_240_ < 0; i_240_++) {
		int i_241_;
		if ((i_241_ = is[i++]) != 0)
		    is_229_[i_231_++] = is_230_[i_241_ & 0xff];
		else
		    i_231_++;
	    }
	    i_231_ += i_234_;
	    i += i_235_;
	}
    }
    
    void method15628(byte[] is, int[] is_242_, int i, int i_243_, int i_244_,
		     int i_245_, int i_246_, int i_247_, int i_248_) {
	int i_249_ = -(i_245_ >> 2);
	i_245_ = -(i_245_ & 0x3);
	for (int i_250_ = -i_246_; i_250_ < 0; i_250_++) {
	    for (int i_251_ = i_249_; i_251_ < 0; i_251_++) {
		if (is[i_243_++] != 0)
		    is_242_[i_244_++] = i;
		else
		    i_244_++;
		if (is[i_243_++] != 0)
		    is_242_[i_244_++] = i;
		else
		    i_244_++;
		if (is[i_243_++] != 0)
		    is_242_[i_244_++] = i;
		else
		    i_244_++;
		if (is[i_243_++] != 0)
		    is_242_[i_244_++] = i;
		else
		    i_244_++;
	    }
	    for (int i_252_ = i_245_; i_252_ < 0; i_252_++) {
		if (is[i_243_++] != 0)
		    is_242_[i_244_++] = i;
		else
		    i_244_++;
	    }
	    i_244_ += i_247_;
	    i_243_ += i_248_;
	}
    }
    
    void method2860(char c, int i, int i_253_, int i_254_, boolean bool,
		    Class152 class152, int i_255_, int i_256_) {
	if (aClass182_Sub2_9937.anIntArray9466 != null) {
	    if (null == class152)
		method2874(c, i, i_253_, i_254_, bool);
	    else {
		i += anIntArray9939[c];
		i_253_ += anIntArray9938[c];
		int i_257_ = anIntArray9936[c];
		int i_258_ = anIntArray9934[c];
		int i_259_ = aClass182_Sub2_9937.anInt9494 * -476035351;
		int i_260_ = i + i_253_ * i_259_;
		int i_261_ = i_259_ - i_257_;
		int i_262_ = 0;
		int i_263_ = 0;
		if (i_253_ < 1722112305 * aClass182_Sub2_9937.anInt9472) {
		    int i_264_
			= aClass182_Sub2_9937.anInt9472 * 1722112305 - i_253_;
		    i_258_ -= i_264_;
		    i_253_ = aClass182_Sub2_9937.anInt9472 * 1722112305;
		    i_263_ += i_257_ * i_264_;
		    i_260_ += i_264_ * i_259_;
		}
		if (i_258_ + i_253_
		    > aClass182_Sub2_9937.anInt9473 * 1920901985)
		    i_258_ -= (i_253_ + i_258_
			       - aClass182_Sub2_9937.anInt9473 * 1920901985);
		if (i < aClass182_Sub2_9937.anInt9470 * 1988019027) {
		    int i_265_
			= aClass182_Sub2_9937.anInt9470 * 1988019027 - i;
		    i_257_ -= i_265_;
		    i = 1988019027 * aClass182_Sub2_9937.anInt9470;
		    i_263_ += i_265_;
		    i_260_ += i_265_;
		    i_262_ += i_265_;
		    i_261_ += i_265_;
		}
		if (i_257_ + i > -466178451 * aClass182_Sub2_9937.anInt9499) {
		    int i_266_
			= (i + i_257_
			   - -466178451 * aClass182_Sub2_9937.anInt9499);
		    i_257_ -= i_266_;
		    i_262_ += i_266_;
		    i_261_ += i_266_;
		}
		if (i_257_ > 0 && i_258_ > 0) {
		    if (bool)
			method15624(aByteArrayArray9933[c],
				    aClass182_Sub2_9937.anIntArray9466, i_254_,
				    i_263_, i_260_, i_257_, i_258_, i_261_,
				    i_262_, i, i_253_, anIntArray9936[c],
				    class152, i_255_, i_256_);
		    else
			method15619(aByteArrayArray9933[c],
				    aClass182_Sub2_9937.anIntArray9466,
				    anIntArray9935, i_254_, i_263_, i_260_,
				    i_257_, i_258_, i_261_, i_262_, i, i_253_,
				    anIntArray9936[c], class152, i_255_,
				    i_256_);
		}
	    }
	}
    }
    
    void method15629(byte[] is, int[] is_267_, int i, int i_268_, int i_269_,
		     int i_270_, int i_271_, int i_272_, int i_273_) {
	int i_274_ = -(i_270_ >> 2);
	i_270_ = -(i_270_ & 0x3);
	for (int i_275_ = -i_271_; i_275_ < 0; i_275_++) {
	    for (int i_276_ = i_274_; i_276_ < 0; i_276_++) {
		if (is[i_268_++] != 0)
		    is_267_[i_269_++] = i;
		else
		    i_269_++;
		if (is[i_268_++] != 0)
		    is_267_[i_269_++] = i;
		else
		    i_269_++;
		if (is[i_268_++] != 0)
		    is_267_[i_269_++] = i;
		else
		    i_269_++;
		if (is[i_268_++] != 0)
		    is_267_[i_269_++] = i;
		else
		    i_269_++;
	    }
	    for (int i_277_ = i_270_; i_277_ < 0; i_277_++) {
		if (is[i_268_++] != 0)
		    is_267_[i_269_++] = i;
		else
		    i_269_++;
	    }
	    i_269_ += i_272_;
	    i_268_ += i_273_;
	}
    }
    
    void method2835(char c, int i, int i_278_, int i_279_, boolean bool,
		    Class152 class152, int i_280_, int i_281_) {
	if (aClass182_Sub2_9937.anIntArray9466 != null) {
	    if (null == class152)
		method2874(c, i, i_278_, i_279_, bool);
	    else {
		i += anIntArray9939[c];
		i_278_ += anIntArray9938[c];
		int i_282_ = anIntArray9936[c];
		int i_283_ = anIntArray9934[c];
		int i_284_ = aClass182_Sub2_9937.anInt9494 * -476035351;
		int i_285_ = i + i_278_ * i_284_;
		int i_286_ = i_284_ - i_282_;
		int i_287_ = 0;
		int i_288_ = 0;
		if (i_278_ < 1722112305 * aClass182_Sub2_9937.anInt9472) {
		    int i_289_
			= aClass182_Sub2_9937.anInt9472 * 1722112305 - i_278_;
		    i_283_ -= i_289_;
		    i_278_ = aClass182_Sub2_9937.anInt9472 * 1722112305;
		    i_288_ += i_282_ * i_289_;
		    i_285_ += i_289_ * i_284_;
		}
		if (i_283_ + i_278_
		    > aClass182_Sub2_9937.anInt9473 * 1920901985)
		    i_283_ -= (i_278_ + i_283_
			       - aClass182_Sub2_9937.anInt9473 * 1920901985);
		if (i < aClass182_Sub2_9937.anInt9470 * 1988019027) {
		    int i_290_
			= aClass182_Sub2_9937.anInt9470 * 1988019027 - i;
		    i_282_ -= i_290_;
		    i = 1988019027 * aClass182_Sub2_9937.anInt9470;
		    i_288_ += i_290_;
		    i_285_ += i_290_;
		    i_287_ += i_290_;
		    i_286_ += i_290_;
		}
		if (i_282_ + i > -466178451 * aClass182_Sub2_9937.anInt9499) {
		    int i_291_
			= (i + i_282_
			   - -466178451 * aClass182_Sub2_9937.anInt9499);
		    i_282_ -= i_291_;
		    i_287_ += i_291_;
		    i_286_ += i_291_;
		}
		if (i_282_ > 0 && i_283_ > 0) {
		    if (bool)
			method15624(aByteArrayArray9933[c],
				    aClass182_Sub2_9937.anIntArray9466, i_279_,
				    i_288_, i_285_, i_282_, i_283_, i_286_,
				    i_287_, i, i_278_, anIntArray9936[c],
				    class152, i_280_, i_281_);
		    else
			method15619(aByteArrayArray9933[c],
				    aClass182_Sub2_9937.anIntArray9466,
				    anIntArray9935, i_279_, i_288_, i_285_,
				    i_282_, i_283_, i_286_, i_287_, i, i_278_,
				    anIntArray9936[c], class152, i_280_,
				    i_281_);
		}
	    }
	}
    }
    
    void method15630(byte[] is, int[] is_292_, int i, int i_293_, int i_294_,
		     int i_295_, int i_296_, int i_297_, int i_298_,
		     int i_299_, int i_300_, int i_301_, Class152 class152,
		     int i_302_, int i_303_) {
	Class152_Sub1 class152_sub1 = (Class152_Sub1) class152;
	int[] is_304_ = class152_sub1.anIntArray8998;
	int[] is_305_ = class152_sub1.anIntArray8997;
	int i_306_ = i_299_ - 1988019027 * aClass182_Sub2_9937.anInt9470;
	int i_307_ = i_300_;
	if (i_303_ > i_307_) {
	    i_307_ = i_303_;
	    i_294_ += aClass182_Sub2_9937.anInt9494 * -476035351 * (i_303_
								    - i_300_);
	    i_293_ += (i_303_ - i_300_) * i_301_;
	}
	int i_308_ = (i_303_ + is_304_.length < i_296_ + i_300_
		      ? is_304_.length + i_303_ : i_296_ + i_300_);
	for (int i_309_ = i_307_; i_309_ < i_308_; i_309_++) {
	    int i_310_ = i_302_ + is_304_[i_309_ - i_303_];
	    int i_311_ = is_305_[i_309_ - i_303_];
	    int i_312_ = i_295_;
	    if (i_306_ > i_310_) {
		int i_313_ = i_306_ - i_310_;
		if (i_313_ >= i_311_) {
		    i_293_ += i_298_ + i_295_;
		    i_294_ += i_297_ + i_295_;
		    continue;
		}
		i_311_ -= i_313_;
	    } else {
		int i_314_ = i_310_ - i_306_;
		if (i_314_ >= i_295_) {
		    i_293_ += i_298_ + i_295_;
		    i_294_ += i_295_ + i_297_;
		    continue;
		}
		i_293_ += i_314_;
		i_312_ -= i_314_;
		i_294_ += i_314_;
	    }
	    int i_315_ = 0;
	    if (i_312_ < i_311_)
		i_311_ = i_312_;
	    else
		i_315_ = i_312_ - i_311_;
	    for (int i_316_ = -i_311_; i_316_ < 0; i_316_++) {
		if (is[i_293_++] != 0)
		    is_292_[i_294_++] = i;
		else
		    i_294_++;
	    }
	    i_293_ += i_293_ + i_315_;
	    i_294_ += i_315_ + i_297_;
	}
    }
    
    void method15631(byte[] is, int[] is_317_, int i, int i_318_, int i_319_,
		     int i_320_, int i_321_, int i_322_, int i_323_,
		     int i_324_, int i_325_, int i_326_, Class152 class152,
		     int i_327_, int i_328_) {
	Class152_Sub1 class152_sub1 = (Class152_Sub1) class152;
	int[] is_329_ = class152_sub1.anIntArray8998;
	int[] is_330_ = class152_sub1.anIntArray8997;
	int i_331_ = i_324_ - 1988019027 * aClass182_Sub2_9937.anInt9470;
	int i_332_ = i_325_;
	if (i_328_ > i_332_) {
	    i_332_ = i_328_;
	    i_319_ += aClass182_Sub2_9937.anInt9494 * -476035351 * (i_328_
								    - i_325_);
	    i_318_ += (i_328_ - i_325_) * i_326_;
	}
	int i_333_ = (i_328_ + is_329_.length < i_321_ + i_325_
		      ? is_329_.length + i_328_ : i_321_ + i_325_);
	for (int i_334_ = i_332_; i_334_ < i_333_; i_334_++) {
	    int i_335_ = i_327_ + is_329_[i_334_ - i_328_];
	    int i_336_ = is_330_[i_334_ - i_328_];
	    int i_337_ = i_320_;
	    if (i_331_ > i_335_) {
		int i_338_ = i_331_ - i_335_;
		if (i_338_ >= i_336_) {
		    i_318_ += i_323_ + i_320_;
		    i_319_ += i_322_ + i_320_;
		    continue;
		}
		i_336_ -= i_338_;
	    } else {
		int i_339_ = i_335_ - i_331_;
		if (i_339_ >= i_320_) {
		    i_318_ += i_323_ + i_320_;
		    i_319_ += i_320_ + i_322_;
		    continue;
		}
		i_318_ += i_339_;
		i_337_ -= i_339_;
		i_319_ += i_339_;
	    }
	    int i_340_ = 0;
	    if (i_337_ < i_336_)
		i_336_ = i_337_;
	    else
		i_340_ = i_337_ - i_336_;
	    for (int i_341_ = -i_336_; i_341_ < 0; i_341_++) {
		if (is[i_318_++] != 0)
		    is_317_[i_319_++] = i;
		else
		    i_319_++;
	    }
	    i_318_ += i_318_ + i_340_;
	    i_319_ += i_340_ + i_322_;
	}
    }
}
