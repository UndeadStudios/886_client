/* Class175_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class175_Sub5 extends Class175
{
    int[] anIntArray9942;
    byte[][] aByteArrayArray9943;
    Class182_Sub2 aClass182_Sub2_9944;
    int[] anIntArray9945;
    int[] anIntArray9946;
    int[] anIntArray9947;
    
    void method15632(byte[] is, int[] is_0_, int i, int i_1_, int i_2_,
		     int i_3_, int i_4_, int i_5_, int i_6_) {
	int i_7_ = i >>> 24;
	int i_8_ = 255 - i_7_;
	for (int i_9_ = -i_4_; i_9_ < 0; i_9_++) {
	    for (int i_10_ = -i_3_; i_10_ < 0; i_10_++) {
		if (is[i_1_++] != 0) {
		    int i_11_ = ((((i & 0xff00) * i_7_ & 0xff0000)
				  + ((i & 0xff00ff) * i_7_ & ~0xff00ff))
				 >> 8);
		    int i_12_ = is_0_[i_2_];
		    is_0_[i_2_++] = ((((i_12_ & 0xff00ff) * i_8_ & ~0xff00ff)
				      + (i_8_ * (i_12_ & 0xff00) & 0xff0000))
				     >> 8) + i_11_;
		} else
		    i_2_++;
	    }
	    i_2_ += i_5_;
	    i_1_ += i_6_;
	}
    }
    
    void method15633(byte[] is, int[] is_13_, int i, int i_14_, int i_15_,
		     int i_16_, int i_17_, int i_18_, int i_19_, int i_20_,
		     int i_21_, int i_22_, Class152 class152, int i_23_,
		     int i_24_) {
	Class152_Sub1 class152_sub1 = (Class152_Sub1) class152;
	int[] is_25_ = class152_sub1.anIntArray8998;
	int[] is_26_ = class152_sub1.anIntArray8997;
	int i_27_ = i_20_ - 1988019027 * aClass182_Sub2_9944.anInt9470;
	int i_28_ = i_21_;
	if (i_24_ > i_28_) {
	    i_28_ = i_24_;
	    i_15_ += (i_24_ - i_21_) * (aClass182_Sub2_9944.anInt9494
					* -476035351);
	    i_14_ += (i_24_ - i_21_) * i_22_;
	}
	int i_29_ = (is_25_.length + i_24_ < i_21_ + i_17_
		     ? i_24_ + is_25_.length : i_17_ + i_21_);
	int i_30_ = i >>> 24;
	int i_31_ = 255 - i_30_;
	for (int i_32_ = i_28_; i_32_ < i_29_; i_32_++) {
	    int i_33_ = i_23_ + is_25_[i_32_ - i_24_];
	    int i_34_ = is_26_[i_32_ - i_24_];
	    int i_35_ = i_16_;
	    if (i_27_ > i_33_) {
		int i_36_ = i_27_ - i_33_;
		if (i_36_ >= i_34_) {
		    i_14_ += i_19_ + i_16_;
		    i_15_ += i_18_ + i_16_;
		    continue;
		}
		i_34_ -= i_36_;
	    } else {
		int i_37_ = i_33_ - i_27_;
		if (i_37_ >= i_16_) {
		    i_14_ += i_16_ + i_19_;
		    i_15_ += i_16_ + i_18_;
		    continue;
		}
		i_14_ += i_37_;
		i_35_ -= i_37_;
		i_15_ += i_37_;
	    }
	    int i_38_ = 0;
	    if (i_35_ < i_34_)
		i_34_ = i_35_;
	    else
		i_38_ = i_35_ - i_34_;
	    for (int i_39_ = -i_34_; i_39_ < 0; i_39_++) {
		if (is[i_14_++] != 0) {
		    int i_40_ = ((((i & 0xff00ff) * i_30_ & ~0xff00ff)
				  + ((i & 0xff00) * i_30_ & 0xff0000))
				 >> 8);
		    int i_41_ = is_13_[i_15_];
		    is_13_[i_15_++]
			= i_40_ + (((i_31_ * (i_41_ & 0xff00ff) & ~0xff00ff)
				    + ((i_41_ & 0xff00) * i_31_ & 0xff0000))
				   >> 8);
		} else
		    i_15_++;
	    }
	    i_14_ += i_38_ + i_19_;
	    i_15_ += i_38_ + i_18_;
	}
    }
    
    void method2860(char c, int i, int i_42_, int i_43_, boolean bool,
		    Class152 class152, int i_44_, int i_45_) {
	if (null != aClass182_Sub2_9944.anIntArray9466) {
	    if (class152 == null)
		method2874(c, i, i_42_, i_43_, bool);
	    else {
		i += anIntArray9942[c];
		i_42_ += anIntArray9946[c];
		int i_46_ = anIntArray9947[c];
		int i_47_ = anIntArray9945[c];
		int i_48_ = aClass182_Sub2_9944.anInt9494 * -476035351;
		int i_49_ = i_42_ * i_48_ + i;
		int i_50_ = i_48_ - i_46_;
		int i_51_ = 0;
		int i_52_ = 0;
		if (i_42_ < aClass182_Sub2_9944.anInt9472 * 1722112305) {
		    int i_53_
			= 1722112305 * aClass182_Sub2_9944.anInt9472 - i_42_;
		    i_47_ -= i_53_;
		    i_42_ = aClass182_Sub2_9944.anInt9472 * 1722112305;
		    i_52_ += i_53_ * i_46_;
		    i_49_ += i_53_ * i_48_;
		}
		if (i_47_ + i_42_ > 1920901985 * aClass182_Sub2_9944.anInt9473)
		    i_47_ -= (i_42_ + i_47_
			      - 1920901985 * aClass182_Sub2_9944.anInt9473);
		if (i < aClass182_Sub2_9944.anInt9470 * 1988019027) {
		    int i_54_ = 1988019027 * aClass182_Sub2_9944.anInt9470 - i;
		    i_46_ -= i_54_;
		    i = aClass182_Sub2_9944.anInt9470 * 1988019027;
		    i_52_ += i_54_;
		    i_49_ += i_54_;
		    i_51_ += i_54_;
		    i_50_ += i_54_;
		}
		if (i + i_46_ > aClass182_Sub2_9944.anInt9499 * -466178451) {
		    int i_55_ = (i_46_ + i
				 - -466178451 * aClass182_Sub2_9944.anInt9499);
		    i_46_ -= i_55_;
		    i_51_ += i_55_;
		    i_50_ += i_55_;
		}
		if (i_46_ > 0 && i_47_ > 0) {
		    if (-16777216 == (i_43_ & ~0xffffff))
			method15635(aByteArrayArray9943[c],
				    aClass182_Sub2_9944.anIntArray9466, i_43_,
				    i_52_, i_49_, i_46_, i_47_, i_50_, i_51_,
				    i, i_42_, anIntArray9947[c], class152,
				    i_44_, i_45_);
		    else
			method15636(aByteArrayArray9943[c],
				    aClass182_Sub2_9944.anIntArray9466, i_43_,
				    i_52_, i_49_, i_46_, i_47_, i_50_, i_51_,
				    i, i_42_, anIntArray9947[c], class152,
				    i_44_, i_45_);
		}
	    }
	}
    }
    
    void method15634(byte[] is, int[] is_56_, int i, int i_57_, int i_58_,
		     int i_59_, int i_60_, int i_61_, int i_62_) {
	int i_63_ = -(i_59_ >> 2);
	i_59_ = -(i_59_ & 0x3);
	for (int i_64_ = -i_60_; i_64_ < 0; i_64_++) {
	    for (int i_65_ = i_63_; i_65_ < 0; i_65_++) {
		if (is[i_57_++] != 0)
		    is_56_[i_58_++] = i;
		else
		    i_58_++;
		if (is[i_57_++] != 0)
		    is_56_[i_58_++] = i;
		else
		    i_58_++;
		if (is[i_57_++] != 0)
		    is_56_[i_58_++] = i;
		else
		    i_58_++;
		if (is[i_57_++] != 0)
		    is_56_[i_58_++] = i;
		else
		    i_58_++;
	    }
	    for (int i_66_ = i_59_; i_66_ < 0; i_66_++) {
		if (is[i_57_++] != 0)
		    is_56_[i_58_++] = i;
		else
		    i_58_++;
	    }
	    i_58_ += i_61_;
	    i_57_ += i_62_;
	}
    }
    
    void method2874(char c, int i, int i_67_, int i_68_, boolean bool) {
	if (aClass182_Sub2_9944.anIntArray9466 != null) {
	    i += anIntArray9942[c];
	    i_67_ += anIntArray9946[c];
	    int i_69_ = anIntArray9947[c];
	    int i_70_ = anIntArray9945[c];
	    int i_71_ = -476035351 * aClass182_Sub2_9944.anInt9494;
	    int i_72_ = i_71_ * i_67_ + i;
	    int i_73_ = i_71_ - i_69_;
	    int i_74_ = 0;
	    int i_75_ = 0;
	    if (i_67_ < 1722112305 * aClass182_Sub2_9944.anInt9472) {
		int i_76_ = aClass182_Sub2_9944.anInt9472 * 1722112305 - i_67_;
		i_70_ -= i_76_;
		i_67_ = aClass182_Sub2_9944.anInt9472 * 1722112305;
		i_75_ += i_76_ * i_69_;
		i_72_ += i_76_ * i_71_;
	    }
	    if (i_70_ + i_67_ > aClass182_Sub2_9944.anInt9473 * 1920901985)
		i_70_ -= (i_67_ + i_70_
			  - 1920901985 * aClass182_Sub2_9944.anInt9473);
	    if (i < 1988019027 * aClass182_Sub2_9944.anInt9470) {
		int i_77_ = 1988019027 * aClass182_Sub2_9944.anInt9470 - i;
		i_69_ -= i_77_;
		i = 1988019027 * aClass182_Sub2_9944.anInt9470;
		i_75_ += i_77_;
		i_72_ += i_77_;
		i_74_ += i_77_;
		i_73_ += i_77_;
	    }
	    if (i + i_69_ > -466178451 * aClass182_Sub2_9944.anInt9499) {
		int i_78_
		    = i + i_69_ - -466178451 * aClass182_Sub2_9944.anInt9499;
		i_69_ -= i_78_;
		i_74_ += i_78_;
		i_73_ += i_78_;
	    }
	    if (i_69_ > 0 && i_70_ > 0) {
		if ((i_68_ & ~0xffffff) == -16777216)
		    method15634(aByteArrayArray9943[c],
				aClass182_Sub2_9944.anIntArray9466, i_68_,
				i_75_, i_72_, i_69_, i_70_, i_73_, i_74_);
		else if ((i_68_ & ~0xffffff) != 0)
		    method15632(aByteArrayArray9943[c],
				aClass182_Sub2_9944.anIntArray9466, i_68_,
				i_75_, i_72_, i_69_, i_70_, i_73_, i_74_);
	    }
	}
    }
    
    void method2868(char c, int i, int i_79_, int i_80_, boolean bool,
		    Class152 class152, int i_81_, int i_82_) {
	if (null != aClass182_Sub2_9944.anIntArray9466) {
	    if (class152 == null)
		method2874(c, i, i_79_, i_80_, bool);
	    else {
		i += anIntArray9942[c];
		i_79_ += anIntArray9946[c];
		int i_83_ = anIntArray9947[c];
		int i_84_ = anIntArray9945[c];
		int i_85_ = aClass182_Sub2_9944.anInt9494 * -476035351;
		int i_86_ = i_79_ * i_85_ + i;
		int i_87_ = i_85_ - i_83_;
		int i_88_ = 0;
		int i_89_ = 0;
		if (i_79_ < aClass182_Sub2_9944.anInt9472 * 1722112305) {
		    int i_90_
			= 1722112305 * aClass182_Sub2_9944.anInt9472 - i_79_;
		    i_84_ -= i_90_;
		    i_79_ = aClass182_Sub2_9944.anInt9472 * 1722112305;
		    i_89_ += i_90_ * i_83_;
		    i_86_ += i_90_ * i_85_;
		}
		if (i_84_ + i_79_ > 1920901985 * aClass182_Sub2_9944.anInt9473)
		    i_84_ -= (i_79_ + i_84_
			      - 1920901985 * aClass182_Sub2_9944.anInt9473);
		if (i < aClass182_Sub2_9944.anInt9470 * 1988019027) {
		    int i_91_ = 1988019027 * aClass182_Sub2_9944.anInt9470 - i;
		    i_83_ -= i_91_;
		    i = aClass182_Sub2_9944.anInt9470 * 1988019027;
		    i_89_ += i_91_;
		    i_86_ += i_91_;
		    i_88_ += i_91_;
		    i_87_ += i_91_;
		}
		if (i + i_83_ > aClass182_Sub2_9944.anInt9499 * -466178451) {
		    int i_92_ = (i_83_ + i
				 - -466178451 * aClass182_Sub2_9944.anInt9499);
		    i_83_ -= i_92_;
		    i_88_ += i_92_;
		    i_87_ += i_92_;
		}
		if (i_83_ > 0 && i_84_ > 0) {
		    if (-16777216 == (i_80_ & ~0xffffff))
			method15635(aByteArrayArray9943[c],
				    aClass182_Sub2_9944.anIntArray9466, i_80_,
				    i_89_, i_86_, i_83_, i_84_, i_87_, i_88_,
				    i, i_79_, anIntArray9947[c], class152,
				    i_81_, i_82_);
		    else
			method15636(aByteArrayArray9943[c],
				    aClass182_Sub2_9944.anIntArray9466, i_80_,
				    i_89_, i_86_, i_83_, i_84_, i_87_, i_88_,
				    i, i_79_, anIntArray9947[c], class152,
				    i_81_, i_82_);
		}
	    }
	}
    }
    
    void method15635(byte[] is, int[] is_93_, int i, int i_94_, int i_95_,
		     int i_96_, int i_97_, int i_98_, int i_99_, int i_100_,
		     int i_101_, int i_102_, Class152 class152, int i_103_,
		     int i_104_) {
	Class152_Sub1 class152_sub1 = (Class152_Sub1) class152;
	int[] is_105_ = class152_sub1.anIntArray8998;
	int[] is_106_ = class152_sub1.anIntArray8997;
	int i_107_ = i_101_;
	if (i_104_ > i_107_) {
	    i_107_ = i_104_;
	    i_95_ += -476035351 * aClass182_Sub2_9944.anInt9494 * (i_104_
								   - i_101_);
	    i_94_ += i_102_ * (i_104_ - i_101_);
	}
	int i_108_ = (is_105_.length + i_104_ < i_97_ + i_101_
		      ? i_104_ + is_105_.length : i_101_ + i_97_);
	for (int i_109_ = i_107_; i_109_ < i_108_; i_109_++) {
	    int i_110_ = is_105_[i_109_ - i_104_] + i_103_;
	    int i_111_ = is_106_[i_109_ - i_104_];
	    int i_112_ = i_96_;
	    if (i_100_ > i_110_) {
		int i_113_ = i_100_ - i_110_;
		if (i_113_ >= i_111_) {
		    i_94_ += i_99_ + i_96_;
		    i_95_ += i_96_ + i_98_;
		    continue;
		}
		i_111_ -= i_113_;
	    } else {
		int i_114_ = i_110_ - i_100_;
		if (i_114_ >= i_96_) {
		    i_94_ += i_96_ + i_99_;
		    i_95_ += i_96_ + i_98_;
		    continue;
		}
		i_94_ += i_114_;
		i_112_ -= i_114_;
		i_95_ += i_114_;
	    }
	    int i_115_ = 0;
	    if (i_112_ < i_111_)
		i_111_ = i_112_;
	    else
		i_115_ = i_112_ - i_111_;
	    for (int i_116_ = 0; i_116_ < i_111_; i_116_++) {
		if (is[i_94_++] != 0)
		    is_93_[i_95_++] = i;
		else
		    i_95_++;
	    }
	    i_94_ += i_115_ + i_99_;
	    i_95_ += i_98_ + i_115_;
	}
    }
    
    void method15636(byte[] is, int[] is_117_, int i, int i_118_, int i_119_,
		     int i_120_, int i_121_, int i_122_, int i_123_,
		     int i_124_, int i_125_, int i_126_, Class152 class152,
		     int i_127_, int i_128_) {
	Class152_Sub1 class152_sub1 = (Class152_Sub1) class152;
	int[] is_129_ = class152_sub1.anIntArray8998;
	int[] is_130_ = class152_sub1.anIntArray8997;
	int i_131_ = i_124_ - 1988019027 * aClass182_Sub2_9944.anInt9470;
	int i_132_ = i_125_;
	if (i_128_ > i_132_) {
	    i_132_ = i_128_;
	    i_119_ += (i_128_ - i_125_) * (aClass182_Sub2_9944.anInt9494
					   * -476035351);
	    i_118_ += (i_128_ - i_125_) * i_126_;
	}
	int i_133_ = (is_129_.length + i_128_ < i_125_ + i_121_
		      ? i_128_ + is_129_.length : i_121_ + i_125_);
	int i_134_ = i >>> 24;
	int i_135_ = 255 - i_134_;
	for (int i_136_ = i_132_; i_136_ < i_133_; i_136_++) {
	    int i_137_ = i_127_ + is_129_[i_136_ - i_128_];
	    int i_138_ = is_130_[i_136_ - i_128_];
	    int i_139_ = i_120_;
	    if (i_131_ > i_137_) {
		int i_140_ = i_131_ - i_137_;
		if (i_140_ >= i_138_) {
		    i_118_ += i_123_ + i_120_;
		    i_119_ += i_122_ + i_120_;
		    continue;
		}
		i_138_ -= i_140_;
	    } else {
		int i_141_ = i_137_ - i_131_;
		if (i_141_ >= i_120_) {
		    i_118_ += i_120_ + i_123_;
		    i_119_ += i_120_ + i_122_;
		    continue;
		}
		i_118_ += i_141_;
		i_139_ -= i_141_;
		i_119_ += i_141_;
	    }
	    int i_142_ = 0;
	    if (i_139_ < i_138_)
		i_138_ = i_139_;
	    else
		i_142_ = i_139_ - i_138_;
	    for (int i_143_ = -i_138_; i_143_ < 0; i_143_++) {
		if (is[i_118_++] != 0) {
		    int i_144_ = ((((i & 0xff00ff) * i_134_ & ~0xff00ff)
				   + ((i & 0xff00) * i_134_ & 0xff0000))
				  >> 8);
		    int i_145_ = is_117_[i_119_];
		    is_117_[i_119_++]
			= i_144_ + (((i_135_ * (i_145_ & 0xff00ff) & ~0xff00ff)
				     + ((i_145_ & 0xff00) * i_135_ & 0xff0000))
				    >> 8);
		} else
		    i_119_++;
	    }
	    i_118_ += i_142_ + i_123_;
	    i_119_ += i_142_ + i_122_;
	}
    }
    
    void method2854(char c, int i, int i_146_, int i_147_, boolean bool) {
	if (aClass182_Sub2_9944.anIntArray9466 != null) {
	    i += anIntArray9942[c];
	    i_146_ += anIntArray9946[c];
	    int i_148_ = anIntArray9947[c];
	    int i_149_ = anIntArray9945[c];
	    int i_150_ = -476035351 * aClass182_Sub2_9944.anInt9494;
	    int i_151_ = i_150_ * i_146_ + i;
	    int i_152_ = i_150_ - i_148_;
	    int i_153_ = 0;
	    int i_154_ = 0;
	    if (i_146_ < 1722112305 * aClass182_Sub2_9944.anInt9472) {
		int i_155_
		    = aClass182_Sub2_9944.anInt9472 * 1722112305 - i_146_;
		i_149_ -= i_155_;
		i_146_ = aClass182_Sub2_9944.anInt9472 * 1722112305;
		i_154_ += i_155_ * i_148_;
		i_151_ += i_155_ * i_150_;
	    }
	    if (i_149_ + i_146_ > aClass182_Sub2_9944.anInt9473 * 1920901985)
		i_149_ -= (i_146_ + i_149_
			   - 1920901985 * aClass182_Sub2_9944.anInt9473);
	    if (i < 1988019027 * aClass182_Sub2_9944.anInt9470) {
		int i_156_ = 1988019027 * aClass182_Sub2_9944.anInt9470 - i;
		i_148_ -= i_156_;
		i = 1988019027 * aClass182_Sub2_9944.anInt9470;
		i_154_ += i_156_;
		i_151_ += i_156_;
		i_153_ += i_156_;
		i_152_ += i_156_;
	    }
	    if (i + i_148_ > -466178451 * aClass182_Sub2_9944.anInt9499) {
		int i_157_
		    = i + i_148_ - -466178451 * aClass182_Sub2_9944.anInt9499;
		i_148_ -= i_157_;
		i_153_ += i_157_;
		i_152_ += i_157_;
	    }
	    if (i_148_ > 0 && i_149_ > 0) {
		if ((i_147_ & ~0xffffff) == -16777216)
		    method15634(aByteArrayArray9943[c],
				aClass182_Sub2_9944.anIntArray9466, i_147_,
				i_154_, i_151_, i_148_, i_149_, i_152_,
				i_153_);
		else if ((i_147_ & ~0xffffff) != 0)
		    method15632(aByteArrayArray9943[c],
				aClass182_Sub2_9944.anIntArray9466, i_147_,
				i_154_, i_151_, i_148_, i_149_, i_152_,
				i_153_);
	    }
	}
    }
    
    void method2853(char c, int i, int i_158_, int i_159_, boolean bool) {
	if (aClass182_Sub2_9944.anIntArray9466 != null) {
	    i += anIntArray9942[c];
	    i_158_ += anIntArray9946[c];
	    int i_160_ = anIntArray9947[c];
	    int i_161_ = anIntArray9945[c];
	    int i_162_ = -476035351 * aClass182_Sub2_9944.anInt9494;
	    int i_163_ = i_162_ * i_158_ + i;
	    int i_164_ = i_162_ - i_160_;
	    int i_165_ = 0;
	    int i_166_ = 0;
	    if (i_158_ < 1722112305 * aClass182_Sub2_9944.anInt9472) {
		int i_167_
		    = aClass182_Sub2_9944.anInt9472 * 1722112305 - i_158_;
		i_161_ -= i_167_;
		i_158_ = aClass182_Sub2_9944.anInt9472 * 1722112305;
		i_166_ += i_167_ * i_160_;
		i_163_ += i_167_ * i_162_;
	    }
	    if (i_161_ + i_158_ > aClass182_Sub2_9944.anInt9473 * 1920901985)
		i_161_ -= (i_158_ + i_161_
			   - 1920901985 * aClass182_Sub2_9944.anInt9473);
	    if (i < 1988019027 * aClass182_Sub2_9944.anInt9470) {
		int i_168_ = 1988019027 * aClass182_Sub2_9944.anInt9470 - i;
		i_160_ -= i_168_;
		i = 1988019027 * aClass182_Sub2_9944.anInt9470;
		i_166_ += i_168_;
		i_163_ += i_168_;
		i_165_ += i_168_;
		i_164_ += i_168_;
	    }
	    if (i + i_160_ > -466178451 * aClass182_Sub2_9944.anInt9499) {
		int i_169_
		    = i + i_160_ - -466178451 * aClass182_Sub2_9944.anInt9499;
		i_160_ -= i_169_;
		i_165_ += i_169_;
		i_164_ += i_169_;
	    }
	    if (i_160_ > 0 && i_161_ > 0) {
		if ((i_159_ & ~0xffffff) == -16777216)
		    method15634(aByteArrayArray9943[c],
				aClass182_Sub2_9944.anIntArray9466, i_159_,
				i_166_, i_163_, i_160_, i_161_, i_164_,
				i_165_);
		else if ((i_159_ & ~0xffffff) != 0)
		    method15632(aByteArrayArray9943[c],
				aClass182_Sub2_9944.anIntArray9466, i_159_,
				i_166_, i_163_, i_160_, i_161_, i_164_,
				i_165_);
	    }
	}
    }
    
    void method2856(char c, int i, int i_170_, int i_171_, boolean bool) {
	if (aClass182_Sub2_9944.anIntArray9466 != null) {
	    i += anIntArray9942[c];
	    i_170_ += anIntArray9946[c];
	    int i_172_ = anIntArray9947[c];
	    int i_173_ = anIntArray9945[c];
	    int i_174_ = -476035351 * aClass182_Sub2_9944.anInt9494;
	    int i_175_ = i_174_ * i_170_ + i;
	    int i_176_ = i_174_ - i_172_;
	    int i_177_ = 0;
	    int i_178_ = 0;
	    if (i_170_ < 1722112305 * aClass182_Sub2_9944.anInt9472) {
		int i_179_
		    = aClass182_Sub2_9944.anInt9472 * 1722112305 - i_170_;
		i_173_ -= i_179_;
		i_170_ = aClass182_Sub2_9944.anInt9472 * 1722112305;
		i_178_ += i_179_ * i_172_;
		i_175_ += i_179_ * i_174_;
	    }
	    if (i_173_ + i_170_ > aClass182_Sub2_9944.anInt9473 * 1920901985)
		i_173_ -= (i_170_ + i_173_
			   - 1920901985 * aClass182_Sub2_9944.anInt9473);
	    if (i < 1988019027 * aClass182_Sub2_9944.anInt9470) {
		int i_180_ = 1988019027 * aClass182_Sub2_9944.anInt9470 - i;
		i_172_ -= i_180_;
		i = 1988019027 * aClass182_Sub2_9944.anInt9470;
		i_178_ += i_180_;
		i_175_ += i_180_;
		i_177_ += i_180_;
		i_176_ += i_180_;
	    }
	    if (i + i_172_ > -466178451 * aClass182_Sub2_9944.anInt9499) {
		int i_181_
		    = i + i_172_ - -466178451 * aClass182_Sub2_9944.anInt9499;
		i_172_ -= i_181_;
		i_177_ += i_181_;
		i_176_ += i_181_;
	    }
	    if (i_172_ > 0 && i_173_ > 0) {
		if ((i_171_ & ~0xffffff) == -16777216)
		    method15634(aByteArrayArray9943[c],
				aClass182_Sub2_9944.anIntArray9466, i_171_,
				i_178_, i_175_, i_172_, i_173_, i_176_,
				i_177_);
		else if ((i_171_ & ~0xffffff) != 0)
		    method15632(aByteArrayArray9943[c],
				aClass182_Sub2_9944.anIntArray9466, i_171_,
				i_178_, i_175_, i_172_, i_173_, i_176_,
				i_177_);
	    }
	}
    }
    
    Class175_Sub5(Class182_Sub2 class182_sub2, Class7 class7,
		  Class173_Sub1[] class173_sub1s, int[] is, int[] is_182_) {
	super(class182_sub2, class7);
	aClass182_Sub2_9944 = class182_sub2;
	anIntArray9947 = is;
	anIntArray9945 = is_182_;
	aByteArrayArray9943 = new byte[class173_sub1s.length][];
	anIntArray9946 = new int[class173_sub1s.length];
	anIntArray9942 = new int[class173_sub1s.length];
	for (int i = 0; i < class173_sub1s.length; i++) {
	    int[] is_183_ = class173_sub1s[i].method2778(false);
	    byte[] is_184_ = aByteArrayArray9943[i] = new byte[is_183_.length];
	    for (int i_185_ = 0; i_185_ < is_183_.length; i_185_++) {
		int i_186_ = is_183_[i_185_];
		byte i_187_
		    = (byte) ((i_186_ & 0xff) + ((i_186_ >> 8 & 0xff) * 4
						 + (i_186_ >> 16 & 0xff) * 3)
			      >> 3);
		is_184_[i_185_] = i_187_;
	    }
	    anIntArray9946[i] = class173_sub1s[i].method2768();
	    anIntArray9942[i] = class173_sub1s[i].method2766();
	}
    }
    
    void method2858(char c, int i, int i_188_, int i_189_, boolean bool,
		    Class152 class152, int i_190_, int i_191_) {
	if (null != aClass182_Sub2_9944.anIntArray9466) {
	    if (class152 == null)
		method2874(c, i, i_188_, i_189_, bool);
	    else {
		i += anIntArray9942[c];
		i_188_ += anIntArray9946[c];
		int i_192_ = anIntArray9947[c];
		int i_193_ = anIntArray9945[c];
		int i_194_ = aClass182_Sub2_9944.anInt9494 * -476035351;
		int i_195_ = i_188_ * i_194_ + i;
		int i_196_ = i_194_ - i_192_;
		int i_197_ = 0;
		int i_198_ = 0;
		if (i_188_ < aClass182_Sub2_9944.anInt9472 * 1722112305) {
		    int i_199_
			= 1722112305 * aClass182_Sub2_9944.anInt9472 - i_188_;
		    i_193_ -= i_199_;
		    i_188_ = aClass182_Sub2_9944.anInt9472 * 1722112305;
		    i_198_ += i_199_ * i_192_;
		    i_195_ += i_199_ * i_194_;
		}
		if (i_193_ + i_188_
		    > 1920901985 * aClass182_Sub2_9944.anInt9473)
		    i_193_ -= (i_188_ + i_193_
			       - 1920901985 * aClass182_Sub2_9944.anInt9473);
		if (i < aClass182_Sub2_9944.anInt9470 * 1988019027) {
		    int i_200_
			= 1988019027 * aClass182_Sub2_9944.anInt9470 - i;
		    i_192_ -= i_200_;
		    i = aClass182_Sub2_9944.anInt9470 * 1988019027;
		    i_198_ += i_200_;
		    i_195_ += i_200_;
		    i_197_ += i_200_;
		    i_196_ += i_200_;
		}
		if (i + i_192_ > aClass182_Sub2_9944.anInt9499 * -466178451) {
		    int i_201_
			= (i_192_ + i
			   - -466178451 * aClass182_Sub2_9944.anInt9499);
		    i_192_ -= i_201_;
		    i_197_ += i_201_;
		    i_196_ += i_201_;
		}
		if (i_192_ > 0 && i_193_ > 0) {
		    if (-16777216 == (i_189_ & ~0xffffff))
			method15635(aByteArrayArray9943[c],
				    aClass182_Sub2_9944.anIntArray9466, i_189_,
				    i_198_, i_195_, i_192_, i_193_, i_196_,
				    i_197_, i, i_188_, anIntArray9947[c],
				    class152, i_190_, i_191_);
		    else
			method15636(aByteArrayArray9943[c],
				    aClass182_Sub2_9944.anIntArray9466, i_189_,
				    i_198_, i_195_, i_192_, i_193_, i_196_,
				    i_197_, i, i_188_, anIntArray9947[c],
				    class152, i_190_, i_191_);
		}
	    }
	}
    }
    
    Class175_Sub5(Class182_Sub2 class182_sub2, Class7 class7,
		  Class173_Sub2[] class173_sub2s, int[] is, int[] is_202_) {
	super(class182_sub2, class7);
	aClass182_Sub2_9944 = class182_sub2;
	anIntArray9947 = is;
	anIntArray9945 = is_202_;
	aByteArrayArray9943 = new byte[class173_sub2s.length][];
	anIntArray9946 = new int[class173_sub2s.length];
	anIntArray9942 = new int[class173_sub2s.length];
	for (int i = 0; i < class173_sub2s.length; i++) {
	    aByteArrayArray9943[i] = class173_sub2s[i].aByteArray9622;
	    anIntArray9946[i] = class173_sub2s[i].anInt9621;
	    anIntArray9942[i] = class173_sub2s[i].anInt9620;
	}
    }
    
    void method2857(char c, int i, int i_203_, int i_204_, boolean bool,
		    Class152 class152, int i_205_, int i_206_) {
	if (null != aClass182_Sub2_9944.anIntArray9466) {
	    if (class152 == null)
		method2874(c, i, i_203_, i_204_, bool);
	    else {
		i += anIntArray9942[c];
		i_203_ += anIntArray9946[c];
		int i_207_ = anIntArray9947[c];
		int i_208_ = anIntArray9945[c];
		int i_209_ = aClass182_Sub2_9944.anInt9494 * -476035351;
		int i_210_ = i_203_ * i_209_ + i;
		int i_211_ = i_209_ - i_207_;
		int i_212_ = 0;
		int i_213_ = 0;
		if (i_203_ < aClass182_Sub2_9944.anInt9472 * 1722112305) {
		    int i_214_
			= 1722112305 * aClass182_Sub2_9944.anInt9472 - i_203_;
		    i_208_ -= i_214_;
		    i_203_ = aClass182_Sub2_9944.anInt9472 * 1722112305;
		    i_213_ += i_214_ * i_207_;
		    i_210_ += i_214_ * i_209_;
		}
		if (i_208_ + i_203_
		    > 1920901985 * aClass182_Sub2_9944.anInt9473)
		    i_208_ -= (i_203_ + i_208_
			       - 1920901985 * aClass182_Sub2_9944.anInt9473);
		if (i < aClass182_Sub2_9944.anInt9470 * 1988019027) {
		    int i_215_
			= 1988019027 * aClass182_Sub2_9944.anInt9470 - i;
		    i_207_ -= i_215_;
		    i = aClass182_Sub2_9944.anInt9470 * 1988019027;
		    i_213_ += i_215_;
		    i_210_ += i_215_;
		    i_212_ += i_215_;
		    i_211_ += i_215_;
		}
		if (i + i_207_ > aClass182_Sub2_9944.anInt9499 * -466178451) {
		    int i_216_
			= (i_207_ + i
			   - -466178451 * aClass182_Sub2_9944.anInt9499);
		    i_207_ -= i_216_;
		    i_212_ += i_216_;
		    i_211_ += i_216_;
		}
		if (i_207_ > 0 && i_208_ > 0) {
		    if (-16777216 == (i_204_ & ~0xffffff))
			method15635(aByteArrayArray9943[c],
				    aClass182_Sub2_9944.anIntArray9466, i_204_,
				    i_213_, i_210_, i_207_, i_208_, i_211_,
				    i_212_, i, i_203_, anIntArray9947[c],
				    class152, i_205_, i_206_);
		    else
			method15636(aByteArrayArray9943[c],
				    aClass182_Sub2_9944.anIntArray9466, i_204_,
				    i_213_, i_210_, i_207_, i_208_, i_211_,
				    i_212_, i, i_203_, anIntArray9947[c],
				    class152, i_205_, i_206_);
		}
	    }
	}
    }
    
    void method15637(byte[] is, int[] is_217_, int i, int i_218_, int i_219_,
		     int i_220_, int i_221_, int i_222_, int i_223_) {
	int i_224_ = -(i_220_ >> 2);
	i_220_ = -(i_220_ & 0x3);
	for (int i_225_ = -i_221_; i_225_ < 0; i_225_++) {
	    for (int i_226_ = i_224_; i_226_ < 0; i_226_++) {
		if (is[i_218_++] != 0)
		    is_217_[i_219_++] = i;
		else
		    i_219_++;
		if (is[i_218_++] != 0)
		    is_217_[i_219_++] = i;
		else
		    i_219_++;
		if (is[i_218_++] != 0)
		    is_217_[i_219_++] = i;
		else
		    i_219_++;
		if (is[i_218_++] != 0)
		    is_217_[i_219_++] = i;
		else
		    i_219_++;
	    }
	    for (int i_227_ = i_220_; i_227_ < 0; i_227_++) {
		if (is[i_218_++] != 0)
		    is_217_[i_219_++] = i;
		else
		    i_219_++;
	    }
	    i_219_ += i_222_;
	    i_218_ += i_223_;
	}
    }
    
    void method15638(byte[] is, int[] is_228_, int i, int i_229_, int i_230_,
		     int i_231_, int i_232_, int i_233_, int i_234_,
		     int i_235_, int i_236_, int i_237_, Class152 class152,
		     int i_238_, int i_239_) {
	Class152_Sub1 class152_sub1 = (Class152_Sub1) class152;
	int[] is_240_ = class152_sub1.anIntArray8998;
	int[] is_241_ = class152_sub1.anIntArray8997;
	int i_242_ = i_235_ - 1988019027 * aClass182_Sub2_9944.anInt9470;
	int i_243_ = i_236_;
	if (i_239_ > i_243_) {
	    i_243_ = i_239_;
	    i_230_ += (i_239_ - i_236_) * (aClass182_Sub2_9944.anInt9494
					   * -476035351);
	    i_229_ += (i_239_ - i_236_) * i_237_;
	}
	int i_244_ = (is_240_.length + i_239_ < i_236_ + i_232_
		      ? i_239_ + is_240_.length : i_232_ + i_236_);
	int i_245_ = i >>> 24;
	int i_246_ = 255 - i_245_;
	for (int i_247_ = i_243_; i_247_ < i_244_; i_247_++) {
	    int i_248_ = i_238_ + is_240_[i_247_ - i_239_];
	    int i_249_ = is_241_[i_247_ - i_239_];
	    int i_250_ = i_231_;
	    if (i_242_ > i_248_) {
		int i_251_ = i_242_ - i_248_;
		if (i_251_ >= i_249_) {
		    i_229_ += i_234_ + i_231_;
		    i_230_ += i_233_ + i_231_;
		    continue;
		}
		i_249_ -= i_251_;
	    } else {
		int i_252_ = i_248_ - i_242_;
		if (i_252_ >= i_231_) {
		    i_229_ += i_231_ + i_234_;
		    i_230_ += i_231_ + i_233_;
		    continue;
		}
		i_229_ += i_252_;
		i_250_ -= i_252_;
		i_230_ += i_252_;
	    }
	    int i_253_ = 0;
	    if (i_250_ < i_249_)
		i_249_ = i_250_;
	    else
		i_253_ = i_250_ - i_249_;
	    for (int i_254_ = -i_249_; i_254_ < 0; i_254_++) {
		if (is[i_229_++] != 0) {
		    int i_255_ = ((((i & 0xff00ff) * i_245_ & ~0xff00ff)
				   + ((i & 0xff00) * i_245_ & 0xff0000))
				  >> 8);
		    int i_256_ = is_228_[i_230_];
		    is_228_[i_230_++]
			= i_255_ + (((i_246_ * (i_256_ & 0xff00ff) & ~0xff00ff)
				     + ((i_256_ & 0xff00) * i_246_ & 0xff0000))
				    >> 8);
		} else
		    i_230_++;
	    }
	    i_229_ += i_253_ + i_234_;
	    i_230_ += i_253_ + i_233_;
	}
    }
    
    void method2835(char c, int i, int i_257_, int i_258_, boolean bool,
		    Class152 class152, int i_259_, int i_260_) {
	if (null != aClass182_Sub2_9944.anIntArray9466) {
	    if (class152 == null)
		method2874(c, i, i_257_, i_258_, bool);
	    else {
		i += anIntArray9942[c];
		i_257_ += anIntArray9946[c];
		int i_261_ = anIntArray9947[c];
		int i_262_ = anIntArray9945[c];
		int i_263_ = aClass182_Sub2_9944.anInt9494 * -476035351;
		int i_264_ = i_257_ * i_263_ + i;
		int i_265_ = i_263_ - i_261_;
		int i_266_ = 0;
		int i_267_ = 0;
		if (i_257_ < aClass182_Sub2_9944.anInt9472 * 1722112305) {
		    int i_268_
			= 1722112305 * aClass182_Sub2_9944.anInt9472 - i_257_;
		    i_262_ -= i_268_;
		    i_257_ = aClass182_Sub2_9944.anInt9472 * 1722112305;
		    i_267_ += i_268_ * i_261_;
		    i_264_ += i_268_ * i_263_;
		}
		if (i_262_ + i_257_
		    > 1920901985 * aClass182_Sub2_9944.anInt9473)
		    i_262_ -= (i_257_ + i_262_
			       - 1920901985 * aClass182_Sub2_9944.anInt9473);
		if (i < aClass182_Sub2_9944.anInt9470 * 1988019027) {
		    int i_269_
			= 1988019027 * aClass182_Sub2_9944.anInt9470 - i;
		    i_261_ -= i_269_;
		    i = aClass182_Sub2_9944.anInt9470 * 1988019027;
		    i_267_ += i_269_;
		    i_264_ += i_269_;
		    i_266_ += i_269_;
		    i_265_ += i_269_;
		}
		if (i + i_261_ > aClass182_Sub2_9944.anInt9499 * -466178451) {
		    int i_270_
			= (i_261_ + i
			   - -466178451 * aClass182_Sub2_9944.anInt9499);
		    i_261_ -= i_270_;
		    i_266_ += i_270_;
		    i_265_ += i_270_;
		}
		if (i_261_ > 0 && i_262_ > 0) {
		    if (-16777216 == (i_258_ & ~0xffffff))
			method15635(aByteArrayArray9943[c],
				    aClass182_Sub2_9944.anIntArray9466, i_258_,
				    i_267_, i_264_, i_261_, i_262_, i_265_,
				    i_266_, i, i_257_, anIntArray9947[c],
				    class152, i_259_, i_260_);
		    else
			method15636(aByteArrayArray9943[c],
				    aClass182_Sub2_9944.anIntArray9466, i_258_,
				    i_267_, i_264_, i_261_, i_262_, i_265_,
				    i_266_, i, i_257_, anIntArray9947[c],
				    class152, i_259_, i_260_);
		}
	    }
	}
    }
    
    static Class525_Sub15 method15639(int i) {
	if (0 == Class525_Sub15.anInt10551 * -217012171)
	    return new Class525_Sub15();
	return (Class525_Sub15.aClass525_Sub15Array10550
		[(Class525_Sub15.anInt10551 -= -1065653731) * -217012171]);
    }
    
    static final void method15640(Class683 class683, int i) {
	int i_271_ = (class683.anIntArray8661
		      [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_271_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_271_ >> 16];
	Class396.method6537(class259, class245, class683, (short) 566);
    }
    
    static final void method15641(Class683 class683, byte i) {
	class683.anInt8644 -= -1723845246;
	String string
	    = ((String)
	       class683.anObjectArray8636[1373599041 * class683.anInt8644]);
	String string_272_ = (String) (class683.anObjectArray8636
				       [1373599041 * class683.anInt8644 + 1]);
	class683.anObjectArray8636
	    [(class683.anInt8644 += 1285561025) * 1373599041 - 1]
	    = new StringBuilder().append(string).append(string_272_)
		  .toString();
    }
    
    static final void method15642(Class683 class683, int i) {
	int i_273_ = (class683.anIntArray8661
		      [(class683.anInt8662 -= 1552651121) * 501271953]);
	class683.anObjectArray8636
	    [(class683.anInt8644 += 1285561025) * 1373599041 - 1]
	    = ((Class230)
	       Class182_Sub2.aClass228_9503.method4332((byte) 12).get(i_273_))
		  .method4383((byte) 1);
    }
}
