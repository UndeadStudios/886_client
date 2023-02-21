/* Class157_Sub1_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class157_Sub1_Sub3 extends Class157_Sub1
{
    int[] anIntArray11426;
    
    public void method2549(int i, int i_0_, Class152 class152, int i_1_,
			   int i_2_) {
	if (aClass182_Sub2_9033.method15226())
	    throw new IllegalStateException();
	int[] is = aClass182_Sub2_9033.anIntArray9466;
	if (is != null) {
	    i += anInt9002;
	    i_0_ += anInt9003;
	    int i_3_ = 0;
	    int i_4_ = aClass182_Sub2_9033.anInt9494 * -476035351;
	    int i_5_ = anInt9000;
	    int i_6_ = anInt9001;
	    int i_7_ = i_4_ - i_5_;
	    int i_8_ = 0;
	    int i_9_ = i + i_0_ * i_4_;
	    if (i_0_ < aClass182_Sub2_9033.anInt9472 * 1722112305) {
		int i_10_ = aClass182_Sub2_9033.anInt9472 * 1722112305 - i_0_;
		i_6_ -= i_10_;
		i_0_ = aClass182_Sub2_9033.anInt9472 * 1722112305;
		i_3_ += i_10_ * i_5_;
		i_9_ += i_10_ * i_4_;
	    }
	    if (i_0_ + i_6_ > aClass182_Sub2_9033.anInt9473 * 1920901985)
		i_6_ -= (i_0_ + i_6_
			 - aClass182_Sub2_9033.anInt9473 * 1920901985);
	    if (i < aClass182_Sub2_9033.anInt9470 * 1988019027) {
		int i_11_ = aClass182_Sub2_9033.anInt9470 * 1988019027 - i;
		i_5_ -= i_11_;
		i = aClass182_Sub2_9033.anInt9470 * 1988019027;
		i_3_ += i_11_;
		i_9_ += i_11_;
		i_8_ += i_11_;
		i_7_ += i_11_;
	    }
	    if (i + i_5_ > aClass182_Sub2_9033.anInt9499 * -466178451) {
		int i_12_
		    = i + i_5_ - aClass182_Sub2_9033.anInt9499 * -466178451;
		i_5_ -= i_12_;
		i_8_ += i_12_;
		i_7_ += i_12_;
	    }
	    if (i_5_ > 0 && i_6_ > 0) {
		Class152_Sub1 class152_sub1 = (Class152_Sub1) class152;
		int[] is_13_ = class152_sub1.anIntArray8998;
		int[] is_14_ = class152_sub1.anIntArray8997;
		int i_15_ = i_0_;
		if (i_2_ > i_15_) {
		    i_15_ = i_2_;
		    i_9_ += (i_2_ - i_0_) * i_4_;
		    i_3_ += (i_2_ - i_0_) * anInt9000;
		}
		int i_16_ = (i_2_ + is_13_.length < i_0_ + i_6_
			     ? i_2_ + is_13_.length : i_0_ + i_6_);
		for (int i_17_ = i_15_; i_17_ < i_16_; i_17_++) {
		    int i_18_ = is_13_[i_17_ - i_2_] + i_1_;
		    int i_19_ = is_14_[i_17_ - i_2_];
		    int i_20_ = i_5_;
		    if (i > i_18_) {
			int i_21_ = i - i_18_;
			if (i_21_ >= i_19_) {
			    i_3_ += i_5_ + i_8_;
			    i_9_ += i_5_ + i_7_;
			    continue;
			}
			i_19_ -= i_21_;
		    } else {
			int i_22_ = i_18_ - i;
			if (i_22_ >= i_5_) {
			    i_3_ += i_5_ + i_8_;
			    i_9_ += i_5_ + i_7_;
			    continue;
			}
			i_3_ += i_22_;
			i_20_ -= i_22_;
			i_9_ += i_22_;
		    }
		    int i_23_ = 0;
		    if (i_20_ < i_19_)
			i_19_ = i_20_;
		    else
			i_23_ = i_20_ - i_19_;
		    for (int i_24_ = -i_19_; i_24_ < 0; i_24_++) {
			int i_25_ = anIntArray11426[i_3_++];
			int i_26_ = i_25_ >>> 24;
			int i_27_ = 256 - i_26_;
			int i_28_ = is[i_9_];
			is[i_9_++] = ((((i_25_ & 0xff00ff) * i_26_
					+ (i_28_ & 0xff00ff) * i_27_)
				       & ~0xff00ff)
				      + (((i_25_ & 0xff00) * i_26_
					  + (i_28_ & 0xff00) * i_27_)
					 & 0xff0000)) >> 8;
		    }
		    i_3_ += i_23_ + i_8_;
		    i_9_ += i_23_ + i_7_;
		}
	    }
	}
    }
    
    Class157_Sub1_Sub3(Class182_Sub2 class182_sub2, int[] is, int i, int i_29_,
		       int i_30_, int i_31_, boolean bool) {
	super(class182_sub2, i_30_, i_31_);
	if (bool)
	    anIntArray11426 = new int[i_30_ * i_31_];
	else
	    anIntArray11426 = is;
	i_29_ -= anInt9000;
	int i_32_ = 0;
	for (int i_33_ = 0; i_33_ < i_31_; i_33_++) {
	    for (int i_34_ = 0; i_34_ < i_30_; i_34_++)
		anIntArray11426[i_32_++] = is[i++];
	    i += i_29_;
	}
    }
    
    Class157_Sub1_Sub3(Class182_Sub2 class182_sub2, int[] is, int i,
		       int i_35_) {
	super(class182_sub2, i, i_35_);
	anIntArray11426 = is;
    }
    
    public void method2474(int i, int i_36_, int i_37_, int i_38_, int[] is,
			   int i_39_, int i_40_) {
	i_40_ -= i_37_;
	for (int i_41_ = 0; i_41_ < i_38_; i_41_++) {
	    int i_42_ = (i_36_ + i_41_) * i_37_ + i;
	    for (int i_43_ = 0; i_43_ < i_37_; i_43_++)
		anIntArray11426[i_42_ + i_43_] = is[i_39_++];
	    i_39_ += i_40_;
	}
    }
    
    void method18024(int i, int i_44_, int i_45_, int i_46_, int[] is,
		     int i_47_, int i_48_) {
	i_48_ -= i_45_;
	for (int i_49_ = 0; i_49_ < i_46_; i_49_++) {
	    int i_50_ = (i_44_ + i_49_) * i_45_ + i;
	    for (int i_51_ = 0; i_51_ < i_45_; i_51_++)
		is[i_47_++] = anIntArray11426[i_50_ + i_51_];
	    i_47_ += i_48_;
	}
    }
    
    public void method2475(int i, int i_52_, int i_53_, int i_54_, int[] is,
			   int[] is_55_, int i_56_, int i_57_) {
	method18024(i, i_52_, i_53_, i_54_, is, i_56_, i_57_);
    }
    
    public void method2500(int i, int i_58_, int i_59_, int i_60_, int[] is,
			   int[] is_61_, int i_62_, int i_63_) {
	method18024(i, i_58_, i_59_, i_60_, is, i_62_, i_63_);
    }
    
    public void method2477(int i, int i_64_, int i_65_) {
	int[] is = aClass182_Sub2_9033.anIntArray9466;
	if (is == null)
	    throw new IllegalStateException("");
	if (i_65_ == 0) {
	    for (int i_66_ = 0; i_66_ < anInt9001; i_66_++) {
		int i_67_ = i_66_ * anInt9000;
		int i_68_ = ((i_64_ + i_66_) * (aClass182_Sub2_9033.anInt9494
						* -476035351)
			     + i);
		for (int i_69_ = 0; i_69_ < anInt9000; i_69_++)
		    anIntArray11426[i_67_ + i_69_]
			= (anIntArray11426[i_67_ + i_69_] & 0xffffff
			   | is[i_68_ + i_69_] << 8 & ~0xffffff);
	    }
	} else if (i_65_ == 1) {
	    for (int i_70_ = 0; i_70_ < anInt9001; i_70_++) {
		int i_71_ = i_70_ * anInt9000;
		int i_72_ = ((i_64_ + i_70_) * (aClass182_Sub2_9033.anInt9494
						* -476035351)
			     + i);
		for (int i_73_ = 0; i_73_ < anInt9000; i_73_++)
		    anIntArray11426[i_71_ + i_73_]
			= (anIntArray11426[i_71_ + i_73_] & 0xffffff
			   | is[i_72_ + i_73_] << 16 & ~0xffffff);
	    }
	} else if (i_65_ == 2) {
	    for (int i_74_ = 0; i_74_ < anInt9001; i_74_++) {
		int i_75_ = i_74_ * anInt9000;
		int i_76_ = ((i_64_ + i_74_) * (aClass182_Sub2_9033.anInt9494
						* -476035351)
			     + i);
		for (int i_77_ = 0; i_77_ < anInt9000; i_77_++)
		    anIntArray11426[i_75_ + i_77_]
			= (anIntArray11426[i_75_ + i_77_] & 0xffffff
			   | is[i_76_ + i_77_] << 24 & ~0xffffff);
	    }
	} else if (i_65_ == 3) {
	    for (int i_78_ = 0; i_78_ < anInt9001; i_78_++) {
		int i_79_ = i_78_ * anInt9000;
		int i_80_ = ((i_64_ + i_78_) * (aClass182_Sub2_9033.anInt9494
						* -476035351)
			     + i);
		for (int i_81_ = 0; i_81_ < anInt9000; i_81_++)
		    anIntArray11426[i_79_ + i_81_]
			= (anIntArray11426[i_79_ + i_81_] & 0xffffff
			   | (is[i_80_ + i_81_] != 0 ? -16777216 : 0));
	    }
	}
    }
    
    public Interface21 method2521() {
	return new Class97(anInt9000, anInt9001, anIntArray11426);
    }
    
    public void method2479(int i, int i_82_, int i_83_, int i_84_, int i_85_) {
	if (aClass182_Sub2_9033.method15226())
	    throw new IllegalStateException();
	int[] is = aClass182_Sub2_9033.anIntArray9466;
	if (is != null) {
	    int i_86_ = aClass182_Sub2_9033.anInt9494 * -476035351;
	    i += anInt9002;
	    i_82_ += anInt9003;
	    int i_87_ = i_82_ * i_86_ + i;
	    int i_88_ = 0;
	    int i_89_ = anInt9001;
	    int i_90_ = anInt9000;
	    int i_91_ = i_86_ - i_90_;
	    int i_92_ = 0;
	    if (i_82_ < aClass182_Sub2_9033.anInt9472 * 1722112305) {
		int i_93_ = aClass182_Sub2_9033.anInt9472 * 1722112305 - i_82_;
		i_89_ -= i_93_;
		i_82_ = aClass182_Sub2_9033.anInt9472 * 1722112305;
		i_88_ += i_93_ * i_90_;
		i_87_ += i_93_ * i_86_;
	    }
	    if (i_82_ + i_89_ > aClass182_Sub2_9033.anInt9473 * 1920901985)
		i_89_ -= (i_82_ + i_89_
			  - aClass182_Sub2_9033.anInt9473 * 1920901985);
	    if (i < aClass182_Sub2_9033.anInt9470 * 1988019027) {
		int i_94_ = aClass182_Sub2_9033.anInt9470 * 1988019027 - i;
		i_90_ -= i_94_;
		i = aClass182_Sub2_9033.anInt9470 * 1988019027;
		i_88_ += i_94_;
		i_87_ += i_94_;
		i_92_ += i_94_;
		i_91_ += i_94_;
	    }
	    if (i + i_90_ > aClass182_Sub2_9033.anInt9499 * -466178451) {
		int i_95_
		    = i + i_90_ - aClass182_Sub2_9033.anInt9499 * -466178451;
		i_90_ -= i_95_;
		i_92_ += i_95_;
		i_91_ += i_95_;
	    }
	    if (i_90_ > 0 && i_89_ > 0) {
		if (i_85_ == 0) {
		    if (i_83_ == 1) {
			for (int i_96_ = -i_89_; i_96_ < 0; i_96_++) {
			    int i_97_ = i_87_ + i_90_ - 3;
			    while (i_87_ < i_97_) {
				is[i_87_++] = anIntArray11426[i_88_++];
				is[i_87_++] = anIntArray11426[i_88_++];
				is[i_87_++] = anIntArray11426[i_88_++];
				is[i_87_++] = anIntArray11426[i_88_++];
			    }
			    i_97_ += 3;
			    while (i_87_ < i_97_)
				is[i_87_++] = anIntArray11426[i_88_++];
			    i_87_ += i_91_;
			    i_88_ += i_92_;
			}
		    } else if (i_83_ == 0) {
			int i_98_ = (i_84_ & 0xff0000) >> 16;
			int i_99_ = (i_84_ & 0xff00) >> 8;
			int i_100_ = i_84_ & 0xff;
			for (int i_101_ = -i_89_; i_101_ < 0; i_101_++) {
			    for (int i_102_ = -i_90_; i_102_ < 0; i_102_++) {
				int i_103_ = anIntArray11426[i_88_++];
				int i_104_
				    = (i_103_ & 0xff0000) * i_98_ & ~0xffffff;
				int i_105_
				    = (i_103_ & 0xff00) * i_99_ & 0xff0000;
				int i_106_ = (i_103_ & 0xff) * i_100_ & 0xff00;
				is[i_87_++] = (i_104_ | i_105_ | i_106_) >>> 8;
			    }
			    i_87_ += i_91_;
			    i_88_ += i_92_;
			}
		    } else if (i_83_ == 3) {
			for (int i_107_ = -i_89_; i_107_ < 0; i_107_++) {
			    for (int i_108_ = -i_90_; i_108_ < 0; i_108_++) {
				int i_109_ = anIntArray11426[i_88_++];
				int i_110_ = i_109_ + i_84_;
				int i_111_
				    = (i_109_ & 0xff00ff) + (i_84_ & 0xff00ff);
				int i_112_ = ((i_111_ & 0x1000100)
					      + (i_110_ - i_111_ & 0x10000));
				is[i_87_++]
				    = i_110_ - i_112_ | i_112_ - (i_112_
								  >>> 8);
			    }
			    i_87_ += i_91_;
			    i_88_ += i_92_;
			}
		    } else if (i_83_ == 2) {
			int i_113_ = i_84_ >>> 24;
			int i_114_ = 256 - i_113_;
			int i_115_ = (i_84_ & 0xff00ff) * i_114_ & ~0xff00ff;
			int i_116_ = (i_84_ & 0xff00) * i_114_ & 0xff0000;
			i_84_ = (i_115_ | i_116_) >>> 8;
			for (int i_117_ = -i_89_; i_117_ < 0; i_117_++) {
			    for (int i_118_ = -i_90_; i_118_ < 0; i_118_++) {
				int i_119_ = anIntArray11426[i_88_++];
				i_115_
				    = (i_119_ & 0xff00ff) * i_113_ & ~0xff00ff;
				i_116_ = (i_119_ & 0xff00) * i_113_ & 0xff0000;
				is[i_87_++]
				    = ((i_115_ | i_116_) >>> 8) + i_84_;
			    }
			    i_87_ += i_91_;
			    i_88_ += i_92_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_85_ == 1) {
		    if (i_83_ == 1) {
			for (int i_120_ = -i_89_; i_120_ < 0; i_120_++) {
			    for (int i_121_ = -i_90_; i_121_ < 0; i_121_++) {
				int i_122_ = anIntArray11426[i_88_++];
				int i_123_ = i_122_ >>> 24;
				int i_124_ = 256 - i_123_;
				int i_125_ = is[i_87_];
				is[i_87_++]
				    = (((((i_122_ & 0xff00ff) * i_123_
					  + (i_125_ & 0xff00ff) * i_124_)
					 & ~0xff00ff)
					>> 8)
				       + (((((i_122_ & ~0xff00ff) >>> 8)
					    * i_123_)
					   + (((i_125_ & ~0xff00ff) >>> 8)
					      * i_124_))
					  & ~0xff00ff));
			    }
			    i_87_ += i_91_;
			    i_88_ += i_92_;
			}
		    } else if (i_83_ == 0) {
			if ((i_84_ & 0xffffff) == 16777215) {
			    for (int i_126_ = -i_89_; i_126_ < 0; i_126_++) {
				for (int i_127_ = -i_90_; i_127_ < 0;
				     i_127_++) {
				    int i_128_ = anIntArray11426[i_88_++];
				    int i_129_
					= ((i_128_ >>> 24) * (i_84_ >>> 24)
					   >> 8);
				    int i_130_ = 256 - i_129_;
				    int i_131_ = is[i_87_];
				    is[i_87_++]
					= ((((i_128_ & 0xff00ff) * i_129_
					     + (i_131_ & 0xff00ff) * i_130_)
					    & ~0xff00ff)
					   + (((i_128_ & 0xff00) * i_129_
					       + (i_131_ & 0xff00) * i_130_)
					      & 0xff0000)) >> 8;
				}
				i_87_ += i_91_;
				i_88_ += i_92_;
			    }
			} else {
			    int i_132_ = (i_84_ & 0xff0000) >> 16;
			    int i_133_ = (i_84_ & 0xff00) >> 8;
			    int i_134_ = i_84_ & 0xff;
			    for (int i_135_ = -i_89_; i_135_ < 0; i_135_++) {
				for (int i_136_ = -i_90_; i_136_ < 0;
				     i_136_++) {
				    int i_137_ = anIntArray11426[i_88_++];
				    int i_138_
					= ((i_137_ >>> 24) * (i_84_ >>> 24)
					   >> 8);
				    int i_139_ = 256 - i_138_;
				    if (i_138_ != 255) {
					int i_140_
					    = ((i_137_ & 0xff0000) * i_132_
					       & ~0xffffff);
					int i_141_
					    = ((i_137_ & 0xff00) * i_133_
					       & 0xff0000);
					int i_142_ = ((i_137_ & 0xff) * i_134_
						      & 0xff00);
					i_137_
					    = (i_140_ | i_141_ | i_142_) >>> 8;
					int i_143_ = is[i_87_];
					is[i_87_++]
					    = ((((i_137_ & 0xff00ff) * i_138_
						 + ((i_143_ & 0xff00ff)
						    * i_139_))
						& ~0xff00ff)
					       + (((i_137_ & 0xff00) * i_138_
						   + ((i_143_ & 0xff00)
						      * i_139_))
						  & 0xff0000)) >> 8;
				    } else {
					int i_144_
					    = ((i_137_ & 0xff0000) * i_132_
					       & ~0xffffff);
					int i_145_
					    = ((i_137_ & 0xff00) * i_133_
					       & 0xff0000);
					int i_146_ = ((i_137_ & 0xff) * i_134_
						      & 0xff00);
					is[i_87_++]
					    = (i_144_ | i_145_ | i_146_) >>> 8;
				    }
				}
				i_87_ += i_91_;
				i_88_ += i_92_;
			    }
			}
		    } else if (i_83_ == 3) {
			for (int i_147_ = -i_89_; i_147_ < 0; i_147_++) {
			    for (int i_148_ = -i_90_; i_148_ < 0; i_148_++) {
				int i_149_ = anIntArray11426[i_88_++];
				int i_150_ = i_149_ + i_84_;
				int i_151_
				    = (i_149_ & 0xff00ff) + (i_84_ & 0xff00ff);
				int i_152_ = ((i_151_ & 0x1000100)
					      + (i_150_ - i_151_ & 0x10000));
				i_152_ = i_150_ - i_152_ | i_152_ - (i_152_
								     >>> 8);
				int i_153_
				    = (i_152_ >>> 24) * (i_84_ >>> 24) >> 8;
				int i_154_ = 256 - i_153_;
				if (i_153_ != 255) {
				    i_149_ = i_152_;
				    i_152_ = is[i_87_];
				    i_152_ = ((((i_149_ & 0xff00ff) * i_153_
						+ (i_152_ & 0xff00ff) * i_154_)
					       & ~0xff00ff)
					      + (((i_149_ & 0xff00) * i_153_
						  + (i_152_ & 0xff00) * i_154_)
						 & 0xff0000)) >> 8;
				}
				is[i_87_++] = i_152_;
			    }
			    i_87_ += i_91_;
			    i_88_ += i_92_;
			}
		    } else if (i_83_ == 2) {
			int i_155_ = i_84_ >>> 24;
			int i_156_ = 256 - i_155_;
			int i_157_ = (i_84_ & 0xff00ff) * i_156_ & ~0xff00ff;
			int i_158_ = (i_84_ & 0xff00) * i_156_ & 0xff0000;
			i_84_ = (i_157_ | i_158_) >>> 8;
			for (int i_159_ = -i_89_; i_159_ < 0; i_159_++) {
			    for (int i_160_ = -i_90_; i_160_ < 0; i_160_++) {
				int i_161_ = anIntArray11426[i_88_++];
				int i_162_ = i_161_ >>> 24;
				int i_163_ = 256 - i_162_;
				i_157_
				    = (i_161_ & 0xff00ff) * i_155_ & ~0xff00ff;
				i_158_ = (i_161_ & 0xff00) * i_155_ & 0xff0000;
				i_161_ = ((i_157_ | i_158_) >>> 8) + i_84_;
				int i_164_ = is[i_87_];
				is[i_87_++]
				    = ((((i_161_ & 0xff00ff) * i_162_
					 + (i_164_ & 0xff00ff) * i_163_)
					& ~0xff00ff)
				       + (((i_161_ & 0xff00) * i_162_
					   + (i_164_ & 0xff00) * i_163_)
					  & 0xff0000)) >> 8;
			    }
			    i_87_ += i_91_;
			    i_88_ += i_92_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_85_ == 2) {
		    if (i_83_ == 1) {
			for (int i_165_ = -i_89_; i_165_ < 0; i_165_++) {
			    for (int i_166_ = -i_90_; i_166_ < 0; i_166_++) {
				int i_167_ = anIntArray11426[i_88_++];
				if (i_167_ != 0) {
				    int i_168_ = is[i_87_];
				    int i_169_ = i_167_ + i_168_;
				    int i_170_ = ((i_167_ & 0xff00ff)
						  + (i_168_ & 0xff00ff));
				    i_168_ = ((i_170_ & 0x1000100)
					      + (i_169_ - i_170_ & 0x10000));
				    is[i_87_++]
					= i_169_ - i_168_ | i_168_ - (i_168_
								      >>> 8);
				} else
				    i_87_++;
			    }
			    i_87_ += i_91_;
			    i_88_ += i_92_;
			}
		    } else if (i_83_ == 0) {
			int i_171_ = (i_84_ & 0xff0000) >> 16;
			int i_172_ = (i_84_ & 0xff00) >> 8;
			int i_173_ = i_84_ & 0xff;
			for (int i_174_ = -i_89_; i_174_ < 0; i_174_++) {
			    for (int i_175_ = -i_90_; i_175_ < 0; i_175_++) {
				int i_176_ = anIntArray11426[i_88_++];
				if (i_176_ != 0) {
				    int i_177_ = ((i_176_ & 0xff0000) * i_171_
						  & ~0xffffff);
				    int i_178_ = ((i_176_ & 0xff00) * i_172_
						  & 0xff0000);
				    int i_179_
					= (i_176_ & 0xff) * i_173_ & 0xff00;
				    i_176_ = (i_177_ | i_178_ | i_179_) >>> 8;
				    int i_180_ = is[i_87_];
				    int i_181_ = i_176_ + i_180_;
				    int i_182_ = ((i_176_ & 0xff00ff)
						  + (i_180_ & 0xff00ff));
				    i_180_ = ((i_182_ & 0x1000100)
					      + (i_181_ - i_182_ & 0x10000));
				    is[i_87_++]
					= i_181_ - i_180_ | i_180_ - (i_180_
								      >>> 8);
				} else
				    i_87_++;
			    }
			    i_87_ += i_91_;
			    i_88_ += i_92_;
			}
		    } else if (i_83_ == 3) {
			for (int i_183_ = -i_89_; i_183_ < 0; i_183_++) {
			    for (int i_184_ = -i_90_; i_184_ < 0; i_184_++) {
				int i_185_ = anIntArray11426[i_88_++];
				int i_186_ = i_185_ + i_84_;
				int i_187_
				    = (i_185_ & 0xff00ff) + (i_84_ & 0xff00ff);
				int i_188_ = ((i_187_ & 0x1000100)
					      + (i_186_ - i_187_ & 0x10000));
				i_185_ = i_186_ - i_188_ | i_188_ - (i_188_
								     >>> 8);
				i_188_ = is[i_87_];
				i_186_ = i_185_ + i_188_;
				i_187_ = (i_185_ & 0xff00ff) + (i_188_
								& 0xff00ff);
				i_188_
				    = (i_187_ & 0x1000100) + (i_186_ - i_187_
							      & 0x10000);
				is[i_87_++]
				    = i_186_ - i_188_ | i_188_ - (i_188_
								  >>> 8);
			    }
			    i_87_ += i_91_;
			    i_88_ += i_92_;
			}
		    } else if (i_83_ == 2) {
			int i_189_ = i_84_ >>> 24;
			int i_190_ = 256 - i_189_;
			int i_191_ = (i_84_ & 0xff00ff) * i_190_ & ~0xff00ff;
			int i_192_ = (i_84_ & 0xff00) * i_190_ & 0xff0000;
			i_84_ = (i_191_ | i_192_) >>> 8;
			for (int i_193_ = -i_89_; i_193_ < 0; i_193_++) {
			    for (int i_194_ = -i_90_; i_194_ < 0; i_194_++) {
				int i_195_ = anIntArray11426[i_88_++];
				if (i_195_ != 0) {
				    i_191_ = ((i_195_ & 0xff00ff) * i_189_
					      & ~0xff00ff);
				    i_192_ = ((i_195_ & 0xff00) * i_189_
					      & 0xff0000);
				    i_195_ = ((i_191_ | i_192_) >>> 8) + i_84_;
				    int i_196_ = is[i_87_];
				    int i_197_ = i_195_ + i_196_;
				    int i_198_ = ((i_195_ & 0xff00ff)
						  + (i_196_ & 0xff00ff));
				    i_196_ = ((i_198_ & 0x1000100)
					      + (i_197_ - i_198_ & 0x10000));
				    is[i_87_++]
					= i_197_ - i_196_ | i_196_ - (i_196_
								      >>> 8);
				} else
				    i_87_++;
			    }
			    i_87_ += i_91_;
			    i_88_ += i_92_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    public void method2480(int i, int i_199_, Class152 class152, int i_200_,
			   int i_201_) {
	if (aClass182_Sub2_9033.method15226())
	    throw new IllegalStateException();
	int[] is = aClass182_Sub2_9033.anIntArray9466;
	if (is != null) {
	    i += anInt9002;
	    i_199_ += anInt9003;
	    int i_202_ = 0;
	    int i_203_ = aClass182_Sub2_9033.anInt9494 * -476035351;
	    int i_204_ = anInt9000;
	    int i_205_ = anInt9001;
	    int i_206_ = i_203_ - i_204_;
	    int i_207_ = 0;
	    int i_208_ = i + i_199_ * i_203_;
	    if (i_199_ < aClass182_Sub2_9033.anInt9472 * 1722112305) {
		int i_209_
		    = aClass182_Sub2_9033.anInt9472 * 1722112305 - i_199_;
		i_205_ -= i_209_;
		i_199_ = aClass182_Sub2_9033.anInt9472 * 1722112305;
		i_202_ += i_209_ * i_204_;
		i_208_ += i_209_ * i_203_;
	    }
	    if (i_199_ + i_205_ > aClass182_Sub2_9033.anInt9473 * 1920901985)
		i_205_ -= (i_199_ + i_205_
			   - aClass182_Sub2_9033.anInt9473 * 1920901985);
	    if (i < aClass182_Sub2_9033.anInt9470 * 1988019027) {
		int i_210_ = aClass182_Sub2_9033.anInt9470 * 1988019027 - i;
		i_204_ -= i_210_;
		i = aClass182_Sub2_9033.anInt9470 * 1988019027;
		i_202_ += i_210_;
		i_208_ += i_210_;
		i_207_ += i_210_;
		i_206_ += i_210_;
	    }
	    if (i + i_204_ > aClass182_Sub2_9033.anInt9499 * -466178451) {
		int i_211_
		    = i + i_204_ - aClass182_Sub2_9033.anInt9499 * -466178451;
		i_204_ -= i_211_;
		i_207_ += i_211_;
		i_206_ += i_211_;
	    }
	    if (i_204_ > 0 && i_205_ > 0) {
		Class152_Sub1 class152_sub1 = (Class152_Sub1) class152;
		int[] is_212_ = class152_sub1.anIntArray8998;
		int[] is_213_ = class152_sub1.anIntArray8997;
		int i_214_ = i_199_;
		if (i_201_ > i_214_) {
		    i_214_ = i_201_;
		    i_208_ += (i_201_ - i_199_) * i_203_;
		    i_202_ += (i_201_ - i_199_) * anInt9000;
		}
		int i_215_ = (i_201_ + is_212_.length < i_199_ + i_205_
			      ? i_201_ + is_212_.length : i_199_ + i_205_);
		for (int i_216_ = i_214_; i_216_ < i_215_; i_216_++) {
		    int i_217_ = is_212_[i_216_ - i_201_] + i_200_;
		    int i_218_ = is_213_[i_216_ - i_201_];
		    int i_219_ = i_204_;
		    if (i > i_217_) {
			int i_220_ = i - i_217_;
			if (i_220_ >= i_218_) {
			    i_202_ += i_204_ + i_207_;
			    i_208_ += i_204_ + i_206_;
			    continue;
			}
			i_218_ -= i_220_;
		    } else {
			int i_221_ = i_217_ - i;
			if (i_221_ >= i_204_) {
			    i_202_ += i_204_ + i_207_;
			    i_208_ += i_204_ + i_206_;
			    continue;
			}
			i_202_ += i_221_;
			i_219_ -= i_221_;
			i_208_ += i_221_;
		    }
		    int i_222_ = 0;
		    if (i_219_ < i_218_)
			i_218_ = i_219_;
		    else
			i_222_ = i_219_ - i_218_;
		    for (int i_223_ = -i_218_; i_223_ < 0; i_223_++) {
			int i_224_ = anIntArray11426[i_202_++];
			int i_225_ = i_224_ >>> 24;
			int i_226_ = 256 - i_225_;
			int i_227_ = is[i_208_];
			is[i_208_++] = ((((i_224_ & 0xff00ff) * i_225_
					  + (i_227_ & 0xff00ff) * i_226_)
					 & ~0xff00ff)
					+ (((i_224_ & 0xff00) * i_225_
					    + (i_227_ & 0xff00) * i_226_)
					   & 0xff0000)) >> 8;
		    }
		    i_202_ += i_222_ + i_207_;
		    i_208_ += i_222_ + i_206_;
		}
	    }
	}
    }
    
    void method2483(int i, int i_228_, int i_229_, int i_230_, int i_231_,
		    int i_232_, int i_233_, int i_234_) {
	if (aClass182_Sub2_9033.method15226())
	    throw new IllegalStateException();
	if (i_229_ > 0 && i_230_ > 0) {
	    int[] is = aClass182_Sub2_9033.anIntArray9466;
	    if (is != null) {
		int i_235_ = 0;
		int i_236_ = 0;
		int i_237_ = aClass182_Sub2_9033.anInt9494 * -476035351;
		int i_238_ = anInt9002 + anInt9000 + anInt9004;
		int i_239_ = anInt9003 + anInt9001 + anInt9005;
		int i_240_ = (i_238_ << 16) / i_229_;
		int i_241_ = (i_239_ << 16) / i_230_;
		if (anInt9002 > 0) {
		    int i_242_ = ((anInt9002 << 16) + i_240_ - 1) / i_240_;
		    i += i_242_;
		    i_235_ += i_242_ * i_240_ - (anInt9002 << 16);
		}
		if (anInt9003 > 0) {
		    int i_243_ = ((anInt9003 << 16) + i_241_ - 1) / i_241_;
		    i_228_ += i_243_;
		    i_236_ += i_243_ * i_241_ - (anInt9003 << 16);
		}
		if (anInt9000 < i_238_)
		    i_229_
			= ((anInt9000 << 16) - i_235_ + i_240_ - 1) / i_240_;
		if (anInt9001 < i_239_)
		    i_230_
			= ((anInt9001 << 16) - i_236_ + i_241_ - 1) / i_241_;
		int i_244_ = i + i_228_ * i_237_;
		int i_245_ = i_237_ - i_229_;
		if (i_228_ + i_230_
		    > aClass182_Sub2_9033.anInt9473 * 1920901985)
		    i_230_ -= (i_228_ + i_230_
			       - aClass182_Sub2_9033.anInt9473 * 1920901985);
		if (i_228_ < aClass182_Sub2_9033.anInt9472 * 1722112305) {
		    int i_246_
			= aClass182_Sub2_9033.anInt9472 * 1722112305 - i_228_;
		    i_230_ -= i_246_;
		    i_244_ += i_246_ * i_237_;
		    i_236_ += i_241_ * i_246_;
		}
		if (i + i_229_ > aClass182_Sub2_9033.anInt9499 * -466178451) {
		    int i_247_
			= (i + i_229_
			   - aClass182_Sub2_9033.anInt9499 * -466178451);
		    i_229_ -= i_247_;
		    i_245_ += i_247_;
		}
		if (i < aClass182_Sub2_9033.anInt9470 * 1988019027) {
		    int i_248_
			= aClass182_Sub2_9033.anInt9470 * 1988019027 - i;
		    i_229_ -= i_248_;
		    i_244_ += i_248_;
		    i_235_ += i_240_ * i_248_;
		    i_245_ += i_248_;
		}
		if (i_233_ == 0) {
		    if (i_231_ == 1) {
			int i_249_ = i_235_;
			for (int i_250_ = -i_230_; i_250_ < 0; i_250_++) {
			    int i_251_ = (i_236_ >> 16) * anInt9000;
			    for (int i_252_ = -i_229_; i_252_ < 0; i_252_++) {
				is[i_244_++]
				    = anIntArray11426[(i_235_ >> 16) + i_251_];
				i_235_ += i_240_;
			    }
			    i_236_ += i_241_;
			    i_235_ = i_249_;
			    i_244_ += i_245_;
			}
		    } else if (i_231_ == 0) {
			int i_253_ = (i_232_ & 0xff0000) >> 16;
			int i_254_ = (i_232_ & 0xff00) >> 8;
			int i_255_ = i_232_ & 0xff;
			int i_256_ = i_235_;
			for (int i_257_ = -i_230_; i_257_ < 0; i_257_++) {
			    int i_258_ = (i_236_ >> 16) * anInt9000;
			    for (int i_259_ = -i_229_; i_259_ < 0; i_259_++) {
				int i_260_
				    = anIntArray11426[(i_235_ >> 16) + i_258_];
				int i_261_
				    = (i_260_ & 0xff0000) * i_253_ & ~0xffffff;
				int i_262_
				    = (i_260_ & 0xff00) * i_254_ & 0xff0000;
				int i_263_ = (i_260_ & 0xff) * i_255_ & 0xff00;
				is[i_244_++]
				    = (i_261_ | i_262_ | i_263_) >>> 8;
				i_235_ += i_240_;
			    }
			    i_236_ += i_241_;
			    i_235_ = i_256_;
			    i_244_ += i_245_;
			}
		    } else if (i_231_ == 3) {
			int i_264_ = i_235_;
			for (int i_265_ = -i_230_; i_265_ < 0; i_265_++) {
			    int i_266_ = (i_236_ >> 16) * anInt9000;
			    for (int i_267_ = -i_229_; i_267_ < 0; i_267_++) {
				int i_268_
				    = anIntArray11426[(i_235_ >> 16) + i_266_];
				int i_269_ = i_268_ + i_232_;
				int i_270_ = ((i_268_ & 0xff00ff)
					      + (i_232_ & 0xff00ff));
				int i_271_ = ((i_270_ & 0x1000100)
					      + (i_269_ - i_270_ & 0x10000));
				is[i_244_++]
				    = i_269_ - i_271_ | i_271_ - (i_271_
								  >>> 8);
				i_235_ += i_240_;
			    }
			    i_236_ += i_241_;
			    i_235_ = i_264_;
			    i_244_ += i_245_;
			}
		    } else if (i_231_ == 2) {
			int i_272_ = i_232_ >>> 24;
			int i_273_ = 256 - i_272_;
			int i_274_ = (i_232_ & 0xff00ff) * i_273_ & ~0xff00ff;
			int i_275_ = (i_232_ & 0xff00) * i_273_ & 0xff0000;
			i_232_ = (i_274_ | i_275_) >>> 8;
			int i_276_ = i_235_;
			for (int i_277_ = -i_230_; i_277_ < 0; i_277_++) {
			    int i_278_ = (i_236_ >> 16) * anInt9000;
			    for (int i_279_ = -i_229_; i_279_ < 0; i_279_++) {
				int i_280_
				    = anIntArray11426[(i_235_ >> 16) + i_278_];
				i_274_
				    = (i_280_ & 0xff00ff) * i_272_ & ~0xff00ff;
				i_275_ = (i_280_ & 0xff00) * i_272_ & 0xff0000;
				is[i_244_++]
				    = ((i_274_ | i_275_) >>> 8) + i_232_;
				i_235_ += i_240_;
			    }
			    i_236_ += i_241_;
			    i_235_ = i_276_;
			    i_244_ += i_245_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_233_ == 1) {
		    if (i_231_ == 1) {
			int i_281_ = i_235_;
			for (int i_282_ = -i_230_; i_282_ < 0; i_282_++) {
			    int i_283_ = (i_236_ >> 16) * anInt9000;
			    for (int i_284_ = -i_229_; i_284_ < 0; i_284_++) {
				int i_285_
				    = anIntArray11426[(i_235_ >> 16) + i_283_];
				int i_286_ = i_285_ >>> 24;
				int i_287_ = 256 - i_286_;
				int i_288_ = is[i_244_];
				is[i_244_++]
				    = (((((i_285_ & 0xff00ff) * i_286_
					  + (i_288_ & 0xff00ff) * i_287_)
					 & ~0xff00ff)
					>> 8)
				       + (((((i_285_ & ~0xff00ff) >>> 8)
					    * i_286_)
					   + (((i_288_ & ~0xff00ff) >>> 8)
					      * i_287_))
					  & ~0xff00ff));
				i_235_ += i_240_;
			    }
			    i_236_ += i_241_;
			    i_235_ = i_281_;
			    i_244_ += i_245_;
			}
		    } else if (i_231_ == 0) {
			int i_289_ = i_235_;
			if ((i_232_ & 0xffffff) == 16777215) {
			    for (int i_290_ = -i_230_; i_290_ < 0; i_290_++) {
				int i_291_ = (i_236_ >> 16) * anInt9000;
				for (int i_292_ = -i_229_; i_292_ < 0;
				     i_292_++) {
				    int i_293_ = (anIntArray11426
						  [(i_235_ >> 16) + i_291_]);
				    int i_294_
					= ((i_293_ >>> 24) * (i_232_ >>> 24)
					   >> 8);
				    int i_295_ = 256 - i_294_;
				    int i_296_ = is[i_244_];
				    is[i_244_++]
					= ((((i_293_ & 0xff00ff) * i_294_
					     + (i_296_ & 0xff00ff) * i_295_)
					    & ~0xff00ff)
					   + (((i_293_ & 0xff00) * i_294_
					       + (i_296_ & 0xff00) * i_295_)
					      & 0xff0000)) >> 8;
				    i_235_ += i_240_;
				}
				i_236_ += i_241_;
				i_235_ = i_289_;
				i_244_ += i_245_;
			    }
			} else {
			    int i_297_ = (i_232_ & 0xff0000) >> 16;
			    int i_298_ = (i_232_ & 0xff00) >> 8;
			    int i_299_ = i_232_ & 0xff;
			    for (int i_300_ = -i_230_; i_300_ < 0; i_300_++) {
				int i_301_ = (i_236_ >> 16) * anInt9000;
				for (int i_302_ = -i_229_; i_302_ < 0;
				     i_302_++) {
				    int i_303_ = (anIntArray11426
						  [(i_235_ >> 16) + i_301_]);
				    int i_304_
					= ((i_303_ >>> 24) * (i_232_ >>> 24)
					   >> 8);
				    int i_305_ = 256 - i_304_;
				    if (i_304_ != 255) {
					int i_306_
					    = ((i_303_ & 0xff0000) * i_297_
					       & ~0xffffff);
					int i_307_
					    = ((i_303_ & 0xff00) * i_298_
					       & 0xff0000);
					int i_308_ = ((i_303_ & 0xff) * i_299_
						      & 0xff00);
					i_303_
					    = (i_306_ | i_307_ | i_308_) >>> 8;
					int i_309_ = is[i_244_];
					is[i_244_++]
					    = ((((i_303_ & 0xff00ff) * i_304_
						 + ((i_309_ & 0xff00ff)
						    * i_305_))
						& ~0xff00ff)
					       + (((i_303_ & 0xff00) * i_304_
						   + ((i_309_ & 0xff00)
						      * i_305_))
						  & 0xff0000)) >> 8;
				    } else {
					int i_310_
					    = ((i_303_ & 0xff0000) * i_297_
					       & ~0xffffff);
					int i_311_
					    = ((i_303_ & 0xff00) * i_298_
					       & 0xff0000);
					int i_312_ = ((i_303_ & 0xff) * i_299_
						      & 0xff00);
					is[i_244_++]
					    = (i_310_ | i_311_ | i_312_) >>> 8;
				    }
				    i_235_ += i_240_;
				}
				i_236_ += i_241_;
				i_235_ = i_289_;
				i_244_ += i_245_;
			    }
			}
		    } else if (i_231_ == 3) {
			int i_313_ = i_235_;
			for (int i_314_ = -i_230_; i_314_ < 0; i_314_++) {
			    int i_315_ = (i_236_ >> 16) * anInt9000;
			    for (int i_316_ = -i_229_; i_316_ < 0; i_316_++) {
				int i_317_
				    = anIntArray11426[(i_235_ >> 16) + i_315_];
				int i_318_ = i_317_ + i_232_;
				int i_319_ = ((i_317_ & 0xff00ff)
					      + (i_232_ & 0xff00ff));
				int i_320_ = ((i_319_ & 0x1000100)
					      + (i_318_ - i_319_ & 0x10000));
				i_320_ = i_318_ - i_320_ | i_320_ - (i_320_
								     >>> 8);
				int i_321_
				    = (i_320_ >>> 24) * (i_232_ >>> 24) >> 8;
				int i_322_ = 256 - i_321_;
				if (i_321_ != 255) {
				    i_317_ = i_320_;
				    i_320_ = is[i_244_];
				    i_320_ = ((((i_317_ & 0xff00ff) * i_321_
						+ (i_320_ & 0xff00ff) * i_322_)
					       & ~0xff00ff)
					      + (((i_317_ & 0xff00) * i_321_
						  + (i_320_ & 0xff00) * i_322_)
						 & 0xff0000)) >> 8;
				}
				is[i_244_++] = i_320_;
				i_235_ += i_240_;
			    }
			    i_236_ += i_241_;
			    i_235_ = i_313_;
			    i_244_ += i_245_;
			}
		    } else if (i_231_ == 2) {
			int i_323_ = i_232_ >>> 24;
			int i_324_ = 256 - i_323_;
			int i_325_ = (i_232_ & 0xff00ff) * i_324_ & ~0xff00ff;
			int i_326_ = (i_232_ & 0xff00) * i_324_ & 0xff0000;
			i_232_ = (i_325_ | i_326_) >>> 8;
			int i_327_ = i_235_;
			for (int i_328_ = -i_230_; i_328_ < 0; i_328_++) {
			    int i_329_ = (i_236_ >> 16) * anInt9000;
			    for (int i_330_ = -i_229_; i_330_ < 0; i_330_++) {
				int i_331_
				    = anIntArray11426[(i_235_ >> 16) + i_329_];
				int i_332_ = i_331_ >>> 24;
				int i_333_ = 256 - i_332_;
				i_325_
				    = (i_331_ & 0xff00ff) * i_323_ & ~0xff00ff;
				i_326_ = (i_331_ & 0xff00) * i_323_ & 0xff0000;
				i_331_ = ((i_325_ | i_326_) >>> 8) + i_232_;
				int i_334_ = is[i_244_];
				is[i_244_++]
				    = ((((i_331_ & 0xff00ff) * i_332_
					 + (i_334_ & 0xff00ff) * i_333_)
					& ~0xff00ff)
				       + (((i_331_ & 0xff00) * i_332_
					   + (i_334_ & 0xff00) * i_333_)
					  & 0xff0000)) >> 8;
				i_235_ += i_240_;
			    }
			    i_236_ += i_241_;
			    i_235_ = i_327_;
			    i_244_ += i_245_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_233_ == 2) {
		    if (i_231_ == 1) {
			int i_335_ = i_235_;
			for (int i_336_ = -i_230_; i_336_ < 0; i_336_++) {
			    int i_337_ = (i_236_ >> 16) * anInt9000;
			    for (int i_338_ = -i_229_; i_338_ < 0; i_338_++) {
				int i_339_
				    = anIntArray11426[(i_235_ >> 16) + i_337_];
				if (i_339_ != 0) {
				    int i_340_ = is[i_244_];
				    int i_341_ = i_339_ + i_340_;
				    int i_342_ = ((i_339_ & 0xff00ff)
						  + (i_340_ & 0xff00ff));
				    i_340_ = ((i_342_ & 0x1000100)
					      + (i_341_ - i_342_ & 0x10000));
				    is[i_244_++]
					= i_341_ - i_340_ | i_340_ - (i_340_
								      >>> 8);
				} else
				    i_244_++;
				i_235_ += i_240_;
			    }
			    i_236_ += i_241_;
			    i_235_ = i_335_;
			    i_244_ += i_245_;
			}
		    } else if (i_231_ == 0) {
			int i_343_ = i_235_;
			int i_344_ = (i_232_ & 0xff0000) >> 16;
			int i_345_ = (i_232_ & 0xff00) >> 8;
			int i_346_ = i_232_ & 0xff;
			for (int i_347_ = -i_230_; i_347_ < 0; i_347_++) {
			    int i_348_ = (i_236_ >> 16) * anInt9000;
			    for (int i_349_ = -i_229_; i_349_ < 0; i_349_++) {
				int i_350_
				    = anIntArray11426[(i_235_ >> 16) + i_348_];
				if (i_350_ != 0) {
				    int i_351_ = ((i_350_ & 0xff0000) * i_344_
						  & ~0xffffff);
				    int i_352_ = ((i_350_ & 0xff00) * i_345_
						  & 0xff0000);
				    int i_353_
					= (i_350_ & 0xff) * i_346_ & 0xff00;
				    i_350_ = (i_351_ | i_352_ | i_353_) >>> 8;
				    int i_354_ = is[i_244_];
				    int i_355_ = i_350_ + i_354_;
				    int i_356_ = ((i_350_ & 0xff00ff)
						  + (i_354_ & 0xff00ff));
				    i_354_ = ((i_356_ & 0x1000100)
					      + (i_355_ - i_356_ & 0x10000));
				    is[i_244_++]
					= i_355_ - i_354_ | i_354_ - (i_354_
								      >>> 8);
				} else
				    i_244_++;
				i_235_ += i_240_;
			    }
			    i_236_ += i_241_;
			    i_235_ = i_343_;
			    i_244_ += i_245_;
			}
		    } else if (i_231_ == 3) {
			int i_357_ = i_235_;
			for (int i_358_ = -i_230_; i_358_ < 0; i_358_++) {
			    int i_359_ = (i_236_ >> 16) * anInt9000;
			    for (int i_360_ = -i_229_; i_360_ < 0; i_360_++) {
				int i_361_
				    = anIntArray11426[(i_235_ >> 16) + i_359_];
				int i_362_ = i_361_ + i_232_;
				int i_363_ = ((i_361_ & 0xff00ff)
					      + (i_232_ & 0xff00ff));
				int i_364_ = ((i_363_ & 0x1000100)
					      + (i_362_ - i_363_ & 0x10000));
				i_361_ = i_362_ - i_364_ | i_364_ - (i_364_
								     >>> 8);
				i_364_ = is[i_244_];
				i_362_ = i_361_ + i_364_;
				i_363_ = (i_361_ & 0xff00ff) + (i_364_
								& 0xff00ff);
				i_364_
				    = (i_363_ & 0x1000100) + (i_362_ - i_363_
							      & 0x10000);
				is[i_244_++]
				    = i_362_ - i_364_ | i_364_ - (i_364_
								  >>> 8);
				i_235_ += i_240_;
			    }
			    i_236_ += i_241_;
			    i_235_ = i_357_;
			    i_244_ += i_245_;
			}
		    } else if (i_231_ == 2) {
			int i_365_ = i_232_ >>> 24;
			int i_366_ = 256 - i_365_;
			int i_367_ = (i_232_ & 0xff00ff) * i_366_ & ~0xff00ff;
			int i_368_ = (i_232_ & 0xff00) * i_366_ & 0xff0000;
			i_232_ = (i_367_ | i_368_) >>> 8;
			int i_369_ = i_235_;
			for (int i_370_ = -i_230_; i_370_ < 0; i_370_++) {
			    int i_371_ = (i_236_ >> 16) * anInt9000;
			    for (int i_372_ = -i_229_; i_372_ < 0; i_372_++) {
				int i_373_
				    = anIntArray11426[(i_235_ >> 16) + i_371_];
				if (i_373_ != 0) {
				    i_367_ = ((i_373_ & 0xff00ff) * i_365_
					      & ~0xff00ff);
				    i_368_ = ((i_373_ & 0xff00) * i_365_
					      & 0xff0000);
				    i_373_
					= ((i_367_ | i_368_) >>> 8) + i_232_;
				    int i_374_ = is[i_244_];
				    int i_375_ = i_373_ + i_374_;
				    int i_376_ = ((i_373_ & 0xff00ff)
						  + (i_374_ & 0xff00ff));
				    i_374_ = ((i_376_ & 0x1000100)
					      + (i_375_ - i_376_ & 0x10000));
				    is[i_244_++]
					= i_375_ - i_374_ | i_374_ - (i_374_
								      >>> 8);
				} else
				    i_244_++;
				i_235_ += i_240_;
			    }
			    i_236_ += i_241_;
			    i_235_ = i_369_;
			    i_244_ += i_245_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    void method14548(int i, int i_377_) {
	int[] is = aClass182_Sub2_9033.anIntArray9466;
	if (is != null) {
	    if (anInt9006 == 0) {
		if (anInt9017 == 0) {
		    int i_378_ = anInt9023;
		    while (i_378_ < 0) {
			int i_379_ = anInt9015;
			int i_380_ = anInt9022;
			int i_381_ = anInt8999;
			int i_382_ = anInt9011;
			if (i_380_ >= 0 && i_381_ >= 0
			    && i_380_ - (anInt9000 << 12) < 0
			    && i_381_ - (anInt9001 << 12) < 0) {
			    for (/**/; i_382_ < 0; i_382_++)
				method18025(((i_381_ >> 12) * anInt9000
					     + (i_380_ >> 12)),
					    i_379_++, is, i, i_377_);
			}
			i_378_++;
			anInt9015 += anInt9014;
		    }
		} else if (anInt9017 < 0) {
		    int i_383_ = anInt9023;
		    while (i_383_ < 0) {
			int i_384_ = anInt9015;
			int i_385_ = anInt9022;
			int i_386_ = anInt8999 + anInt9025;
			int i_387_ = anInt9011;
			if (i_385_ >= 0 && i_385_ - (anInt9000 << 12) < 0) {
			    int i_388_;
			    if ((i_388_ = i_386_ - (anInt9001 << 12)) >= 0) {
				i_388_ = (anInt9017 - i_388_) / anInt9017;
				i_387_ += i_388_;
				i_386_ += anInt9017 * i_388_;
				i_384_ += i_388_;
			    }
			    if ((i_388_ = (i_386_ - anInt9017) / anInt9017)
				> i_387_)
				i_387_ = i_388_;
			    for (/**/; i_387_ < 0; i_387_++) {
				method18025(((i_386_ >> 12) * anInt9000
					     + (i_385_ >> 12)),
					    i_384_++, is, i, i_377_);
				i_386_ += anInt9017;
			    }
			}
			i_383_++;
			anInt9022 += anInt9018;
			anInt9015 += anInt9014;
		    }
		} else {
		    int i_389_ = anInt9023;
		    while (i_389_ < 0) {
			int i_390_ = anInt9015;
			int i_391_ = anInt9022;
			int i_392_ = anInt8999 + anInt9025;
			int i_393_ = anInt9011;
			if (i_391_ >= 0 && i_391_ - (anInt9000 << 12) < 0) {
			    if (i_392_ < 0) {
				int i_394_
				    = (anInt9017 - 1 - i_392_) / anInt9017;
				i_393_ += i_394_;
				i_392_ += anInt9017 * i_394_;
				i_390_ += i_394_;
			    }
			    int i_395_;
			    if ((i_395_ = (1 + i_392_ - (anInt9001 << 12)
					   - anInt9017) / anInt9017)
				> i_393_)
				i_393_ = i_395_;
			    for (/**/; i_393_ < 0; i_393_++) {
				method18025(((i_392_ >> 12) * anInt9000
					     + (i_391_ >> 12)),
					    i_390_++, is, i, i_377_);
				i_392_ += anInt9017;
			    }
			}
			i_389_++;
			anInt9022 += anInt9018;
			anInt9015 += anInt9014;
		    }
		}
	    } else if (anInt9006 < 0) {
		if (anInt9017 == 0) {
		    int i_396_ = anInt9023;
		    while (i_396_ < 0) {
			int i_397_ = anInt9015;
			int i_398_ = anInt9022 + anInt9024;
			int i_399_ = anInt8999;
			int i_400_ = anInt9011;
			if (i_399_ >= 0 && i_399_ - (anInt9001 << 12) < 0) {
			    int i_401_;
			    if ((i_401_ = i_398_ - (anInt9000 << 12)) >= 0) {
				i_401_ = (anInt9006 - i_401_) / anInt9006;
				i_400_ += i_401_;
				i_398_ += anInt9006 * i_401_;
				i_397_ += i_401_;
			    }
			    if ((i_401_ = (i_398_ - anInt9006) / anInt9006)
				> i_400_)
				i_400_ = i_401_;
			    for (/**/; i_400_ < 0; i_400_++) {
				method18025(((i_399_ >> 12) * anInt9000
					     + (i_398_ >> 12)),
					    i_397_++, is, i, i_377_);
				i_398_ += anInt9006;
			    }
			}
			i_396_++;
			anInt8999 += anInt9010;
			anInt9015 += anInt9014;
		    }
		} else if (anInt9017 < 0) {
		    int i_402_ = anInt9023;
		    while (i_402_ < 0) {
			int i_403_ = anInt9015;
			int i_404_ = anInt9022 + anInt9024;
			int i_405_ = anInt8999 + anInt9025;
			int i_406_ = anInt9011;
			int i_407_;
			if ((i_407_ = i_404_ - (anInt9000 << 12)) >= 0) {
			    i_407_ = (anInt9006 - i_407_) / anInt9006;
			    i_406_ += i_407_;
			    i_404_ += anInt9006 * i_407_;
			    i_405_ += anInt9017 * i_407_;
			    i_403_ += i_407_;
			}
			if ((i_407_ = (i_404_ - anInt9006) / anInt9006)
			    > i_406_)
			    i_406_ = i_407_;
			if ((i_407_ = i_405_ - (anInt9001 << 12)) >= 0) {
			    i_407_ = (anInt9017 - i_407_) / anInt9017;
			    i_406_ += i_407_;
			    i_404_ += anInt9006 * i_407_;
			    i_405_ += anInt9017 * i_407_;
			    i_403_ += i_407_;
			}
			if ((i_407_ = (i_405_ - anInt9017) / anInt9017)
			    > i_406_)
			    i_406_ = i_407_;
			for (/**/; i_406_ < 0; i_406_++) {
			    method18025((i_405_ >> 12) * anInt9000 + (i_404_
								      >> 12),
					i_403_++, is, i, i_377_);
			    i_404_ += anInt9006;
			    i_405_ += anInt9017;
			}
			i_402_++;
			anInt9022 += anInt9018;
			anInt8999 += anInt9010;
			anInt9015 += anInt9014;
		    }
		} else {
		    int i_408_ = anInt9023;
		    while (i_408_ < 0) {
			int i_409_ = anInt9015;
			int i_410_ = anInt9022 + anInt9024;
			int i_411_ = anInt8999 + anInt9025;
			int i_412_ = anInt9011;
			int i_413_;
			if ((i_413_ = i_410_ - (anInt9000 << 12)) >= 0) {
			    i_413_ = (anInt9006 - i_413_) / anInt9006;
			    i_412_ += i_413_;
			    i_410_ += anInt9006 * i_413_;
			    i_411_ += anInt9017 * i_413_;
			    i_409_ += i_413_;
			}
			if ((i_413_ = (i_410_ - anInt9006) / anInt9006)
			    > i_412_)
			    i_412_ = i_413_;
			if (i_411_ < 0) {
			    i_413_ = (anInt9017 - 1 - i_411_) / anInt9017;
			    i_412_ += i_413_;
			    i_410_ += anInt9006 * i_413_;
			    i_411_ += anInt9017 * i_413_;
			    i_409_ += i_413_;
			}
			if ((i_413_ = (1 + i_411_ - (anInt9001 << 12)
				       - anInt9017) / anInt9017)
			    > i_412_)
			    i_412_ = i_413_;
			for (/**/; i_412_ < 0; i_412_++) {
			    method18025((i_411_ >> 12) * anInt9000 + (i_410_
								      >> 12),
					i_409_++, is, i, i_377_);
			    i_410_ += anInt9006;
			    i_411_ += anInt9017;
			}
			i_408_++;
			anInt9022 += anInt9018;
			anInt8999 += anInt9010;
			anInt9015 += anInt9014;
		    }
		}
	    } else if (anInt9017 == 0) {
		int i_414_ = anInt9023;
		while (i_414_ < 0) {
		    int i_415_ = anInt9015;
		    int i_416_ = anInt9022 + anInt9024;
		    int i_417_ = anInt8999;
		    int i_418_ = anInt9011;
		    if (i_417_ >= 0 && i_417_ - (anInt9001 << 12) < 0) {
			if (i_416_ < 0) {
			    int i_419_ = (anInt9006 - 1 - i_416_) / anInt9006;
			    i_418_ += i_419_;
			    i_416_ += anInt9006 * i_419_;
			    i_415_ += i_419_;
			}
			int i_420_;
			if ((i_420_ = (1 + i_416_ - (anInt9000 << 12)
				       - anInt9006) / anInt9006)
			    > i_418_)
			    i_418_ = i_420_;
			for (/**/; i_418_ < 0; i_418_++) {
			    method18025((i_417_ >> 12) * anInt9000 + (i_416_
								      >> 12),
					i_415_++, is, i, i_377_);
			    i_416_ += anInt9006;
			}
		    }
		    i_414_++;
		    anInt9022 += anInt9018;
		    anInt8999 += anInt9010;
		    anInt9015 += anInt9014;
		}
	    } else if (anInt9017 < 0) {
		for (int i_421_ = anInt9023; i_421_ < 0; i_421_++) {
		    int i_422_ = anInt9015;
		    int i_423_ = anInt9022 + anInt9024;
		    int i_424_ = anInt8999 + anInt9025;
		    int i_425_ = anInt9011;
		    if (i_423_ < 0) {
			int i_426_ = (anInt9006 - 1 - i_423_) / anInt9006;
			i_425_ += i_426_;
			i_423_ += anInt9006 * i_426_;
			i_424_ += anInt9017 * i_426_;
			i_422_ += i_426_;
		    }
		    int i_427_;
		    if ((i_427_ = ((1 + i_423_ - (anInt9000 << 12) - anInt9006)
				   / anInt9006))
			> i_425_)
			i_425_ = i_427_;
		    if ((i_427_ = i_424_ - (anInt9001 << 12)) >= 0) {
			i_427_ = (anInt9017 - i_427_) / anInt9017;
			i_425_ += i_427_;
			i_423_ += anInt9006 * i_427_;
			i_424_ += anInt9017 * i_427_;
			i_422_ += i_427_;
		    }
		    if ((i_427_ = (i_424_ - anInt9017) / anInt9017) > i_425_)
			i_425_ = i_427_;
		    for (/**/; i_425_ < 0; i_425_++) {
			method18025((i_424_ >> 12) * anInt9000 + (i_423_
								  >> 12),
				    i_422_++, is, i, i_377_);
			i_423_ += anInt9006;
			i_424_ += anInt9017;
		    }
		    anInt9022 += anInt9018;
		    anInt8999 += anInt9010;
		    anInt9015 += anInt9014;
		}
	    } else {
		for (int i_428_ = anInt9023; i_428_ < 0; i_428_++) {
		    int i_429_ = anInt9015;
		    int i_430_ = anInt9022 + anInt9024;
		    int i_431_ = anInt8999 + anInt9025;
		    int i_432_ = anInt9011;
		    if (i_430_ < 0) {
			int i_433_ = (anInt9006 - 1 - i_430_) / anInt9006;
			i_432_ += i_433_;
			i_430_ += anInt9006 * i_433_;
			i_431_ += anInt9017 * i_433_;
			i_429_ += i_433_;
		    }
		    int i_434_;
		    if ((i_434_ = ((1 + i_430_ - (anInt9000 << 12) - anInt9006)
				   / anInt9006))
			> i_432_)
			i_432_ = i_434_;
		    if (i_431_ < 0) {
			i_434_ = (anInt9017 - 1 - i_431_) / anInt9017;
			i_432_ += i_434_;
			i_430_ += anInt9006 * i_434_;
			i_431_ += anInt9017 * i_434_;
			i_429_ += i_434_;
		    }
		    if ((i_434_ = ((1 + i_431_ - (anInt9001 << 12) - anInt9017)
				   / anInt9017))
			> i_432_)
			i_432_ = i_434_;
		    for (/**/; i_432_ < 0; i_432_++) {
			method18025((i_431_ >> 12) * anInt9000 + (i_430_
								  >> 12),
				    i_429_++, is, i, i_377_);
			i_430_ += anInt9006;
			i_431_ += anInt9017;
		    }
		    anInt9022 += anInt9018;
		    anInt8999 += anInt9010;
		    anInt9015 += anInt9014;
		}
	    }
	}
    }
    
    void method14541(boolean bool, boolean bool_435_, boolean bool_436_, int i,
		     int i_437_, float f, int i_438_, int i_439_, int i_440_,
		     int i_441_, int i_442_, int i_443_, boolean bool_444_) {
	if (i_438_ > 0 && i_439_ > 0 && (bool || bool_435_)) {
	    int i_445_ = 0;
	    int i_446_ = 0;
	    int i_447_ = anInt9002 + anInt9000 + anInt9004;
	    int i_448_ = anInt9003 + anInt9001 + anInt9005;
	    int i_449_ = (i_447_ << 16) / i_438_;
	    int i_450_ = (i_448_ << 16) / i_439_;
	    if (anInt9002 > 0) {
		int i_451_ = ((anInt9002 << 16) + i_449_ - 1) / i_449_;
		i += i_451_;
		i_445_ += i_451_ * i_449_ - (anInt9002 << 16);
	    }
	    if (anInt9003 > 0) {
		int i_452_ = ((anInt9003 << 16) + i_450_ - 1) / i_450_;
		i_437_ += i_452_;
		i_446_ += i_452_ * i_450_ - (anInt9003 << 16);
	    }
	    if (anInt9000 < i_447_)
		i_438_ = ((anInt9000 << 16) - i_445_ + i_449_ - 1) / i_449_;
	    if (anInt9001 < i_448_)
		i_439_ = ((anInt9001 << 16) - i_446_ + i_450_ - 1) / i_450_;
	    int i_453_
		= i + i_437_ * (aClass182_Sub2_9033.anInt9494 * -476035351);
	    int i_454_ = aClass182_Sub2_9033.anInt9494 * -476035351 - i_438_;
	    if (i_437_ + i_439_ > aClass182_Sub2_9033.anInt9473 * 1920901985)
		i_439_ -= (i_437_ + i_439_
			   - aClass182_Sub2_9033.anInt9473 * 1920901985);
	    if (i_437_ < aClass182_Sub2_9033.anInt9472 * 1722112305) {
		int i_455_
		    = aClass182_Sub2_9033.anInt9472 * 1722112305 - i_437_;
		i_439_ -= i_455_;
		i_453_
		    += i_455_ * (aClass182_Sub2_9033.anInt9494 * -476035351);
		i_446_ += i_450_ * i_455_;
	    }
	    if (i + i_438_ > aClass182_Sub2_9033.anInt9499 * -466178451) {
		int i_456_
		    = i + i_438_ - aClass182_Sub2_9033.anInt9499 * -466178451;
		i_438_ -= i_456_;
		i_454_ += i_456_;
	    }
	    if (i < aClass182_Sub2_9033.anInt9470 * 1988019027) {
		int i_457_ = aClass182_Sub2_9033.anInt9470 * 1988019027 - i;
		i_438_ -= i_457_;
		i_453_ += i_457_;
		i_445_ += i_449_ * i_457_;
		i_454_ += i_457_;
	    }
	    float[] fs = aClass182_Sub2_9033.aFloatArray9469;
	    int[] is = aClass182_Sub2_9033.anIntArray9466;
	    if (i_442_ == 0) {
		if (i_440_ == 1) {
		    int i_458_ = i_445_;
		    for (int i_459_ = -i_439_; i_459_ < 0; i_459_++) {
			int i_460_ = (i_446_ >> 16) * anInt9000;
			for (int i_461_ = -i_438_; i_461_ < 0; i_461_++) {
			    if (!bool_435_ || f < fs[i_453_]) {
				if (bool)
				    is[i_453_] = (anIntArray11426
						  [(i_445_ >> 16) + i_460_]);
				if (bool_435_ && bool_444_)
				    fs[i_453_] = f;
			    }
			    i_445_ += i_449_;
			    i_453_++;
			}
			i_446_ += i_450_;
			i_445_ = i_458_;
			i_453_ += i_454_;
		    }
		} else if (i_440_ == 0) {
		    int i_462_ = (i_441_ & 0xff0000) >> 16;
		    int i_463_ = (i_441_ & 0xff00) >> 8;
		    int i_464_ = i_441_ & 0xff;
		    int i_465_ = i_445_;
		    for (int i_466_ = -i_439_; i_466_ < 0; i_466_++) {
			int i_467_ = (i_446_ >> 16) * anInt9000;
			for (int i_468_ = -i_438_; i_468_ < 0; i_468_++) {
			    if (!bool_435_ || f < fs[i_453_]) {
				if (bool) {
				    int i_469_ = (anIntArray11426
						  [(i_445_ >> 16) + i_467_]);
				    int i_470_ = ((i_469_ & 0xff0000) * i_462_
						  & ~0xffffff);
				    int i_471_ = ((i_469_ & 0xff00) * i_463_
						  & 0xff0000);
				    int i_472_
					= (i_469_ & 0xff) * i_464_ & 0xff00;
				    is[i_453_]
					= (i_470_ | i_471_ | i_472_) >>> 8;
				}
				if (bool_435_ && bool_444_)
				    fs[i_453_] = f;
			    }
			    i_445_ += i_449_;
			    i_453_++;
			}
			i_446_ += i_450_;
			i_445_ = i_465_;
			i_453_ += i_454_;
		    }
		} else if (i_440_ == 3) {
		    int i_473_ = i_445_;
		    for (int i_474_ = -i_439_; i_474_ < 0; i_474_++) {
			int i_475_ = (i_446_ >> 16) * anInt9000;
			for (int i_476_ = -i_438_; i_476_ < 0; i_476_++) {
			    if (!bool_435_ || f < fs[i_453_]) {
				if (bool) {
				    int i_477_ = (anIntArray11426
						  [(i_445_ >> 16) + i_475_]);
				    int i_478_ = i_477_ + i_441_;
				    int i_479_ = ((i_477_ & 0xff00ff)
						  + (i_441_ & 0xff00ff));
				    int i_480_
					= ((i_479_ & 0x1000100)
					   + (i_478_ - i_479_ & 0x10000));
				    is[i_453_]
					= i_478_ - i_480_ | i_480_ - (i_480_
								      >>> 8);
				}
				if (bool_435_ && bool_444_)
				    fs[i_453_] = f;
			    }
			    i_445_ += i_449_;
			    i_453_++;
			}
			i_446_ += i_450_;
			i_445_ = i_473_;
			i_453_ += i_454_;
		    }
		} else if (i_440_ == 2) {
		    int i_481_ = i_441_ >>> 24;
		    int i_482_ = 256 - i_481_;
		    int i_483_ = (i_441_ & 0xff00ff) * i_482_ & ~0xff00ff;
		    int i_484_ = (i_441_ & 0xff00) * i_482_ & 0xff0000;
		    i_441_ = (i_483_ | i_484_) >>> 8;
		    int i_485_ = i_445_;
		    for (int i_486_ = -i_439_; i_486_ < 0; i_486_++) {
			int i_487_ = (i_446_ >> 16) * anInt9000;
			for (int i_488_ = -i_438_; i_488_ < 0; i_488_++) {
			    if (!bool_435_ || f < fs[i_453_]) {
				if (bool) {
				    int i_489_ = (anIntArray11426
						  [(i_445_ >> 16) + i_487_]);
				    i_483_ = ((i_489_ & 0xff00ff) * i_481_
					      & ~0xff00ff);
				    i_484_ = ((i_489_ & 0xff00) * i_481_
					      & 0xff0000);
				    is[i_453_]
					= ((i_483_ | i_484_) >>> 8) + i_441_;
				}
				if (bool_435_ && bool_444_)
				    fs[i_453_] = f;
			    }
			    i_445_ += i_449_;
			    i_453_++;
			}
			i_446_ += i_450_;
			i_445_ = i_485_;
			i_453_ += i_454_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_442_ == 1) {
		if (i_440_ == 1) {
		    int i_490_ = i_445_;
		    for (int i_491_ = -i_439_; i_491_ < 0; i_491_++) {
			int i_492_ = (i_446_ >> 16) * anInt9000;
			for (int i_493_ = -i_438_; i_493_ < 0; i_493_++) {
			    if (!bool_435_ || f < fs[i_453_]) {
				if (bool) {
				    int i_494_ = (anIntArray11426
						  [(i_445_ >> 16) + i_492_]);
				    int i_495_ = i_494_ >>> 24;
				    int i_496_ = 256 - i_495_;
				    int i_497_ = is[i_453_];
				    is[i_453_]
					= (((((i_494_ & 0xff00ff) * i_495_
					      + (i_497_ & 0xff00ff) * i_496_)
					     & ~0xff00ff)
					    >> 8)
					   + (((((i_494_ & ~0xff00ff) >>> 8)
						* i_495_)
					       + (((i_497_ & ~0xff00ff) >>> 8)
						  * i_496_))
					      & ~0xff00ff));
				}
				if (bool_435_ && bool_444_)
				    fs[i_453_] = f;
			    }
			    i_445_ += i_449_;
			    i_453_++;
			}
			i_446_ += i_450_;
			i_445_ = i_490_;
			i_453_ += i_454_;
		    }
		} else if (i_440_ == 0) {
		    int i_498_ = i_445_;
		    if ((i_441_ & 0xffffff) == 16777215) {
			for (int i_499_ = -i_439_; i_499_ < 0; i_499_++) {
			    int i_500_ = (i_446_ >> 16) * anInt9000;
			    for (int i_501_ = -i_438_; i_501_ < 0; i_501_++) {
				if (!bool_435_ || f < fs[i_453_]) {
				    if (bool) {
					int i_502_
					    = (anIntArray11426
					       [(i_445_ >> 16) + i_500_]);
					int i_503_
					    = ((i_502_ >>> 24) * (i_441_
								  >>> 24)
					       >> 8);
					int i_504_ = 256 - i_503_;
					int i_505_ = is[i_453_];
					is[i_453_]
					    = ((((i_502_ & 0xff00ff) * i_503_
						 + ((i_505_ & 0xff00ff)
						    * i_504_))
						& ~0xff00ff)
					       + (((i_502_ & 0xff00) * i_503_
						   + ((i_505_ & 0xff00)
						      * i_504_))
						  & 0xff0000)) >> 8;
				    }
				    if (bool_435_ && bool_444_)
					fs[i_453_] = f;
				}
				i_445_ += i_449_;
				i_453_++;
			    }
			    i_446_ += i_450_;
			    i_445_ = i_498_;
			    i_453_ += i_454_;
			}
		    } else {
			int i_506_ = (i_441_ & 0xff0000) >> 16;
			int i_507_ = (i_441_ & 0xff00) >> 8;
			int i_508_ = i_441_ & 0xff;
			for (int i_509_ = -i_439_; i_509_ < 0; i_509_++) {
			    int i_510_ = (i_446_ >> 16) * anInt9000;
			    for (int i_511_ = -i_438_; i_511_ < 0; i_511_++) {
				if (!bool_435_ || f < fs[i_453_]) {
				    int i_512_ = (anIntArray11426
						  [(i_445_ >> 16) + i_510_]);
				    int i_513_
					= ((i_512_ >>> 24) * (i_441_ >>> 24)
					   >> 8);
				    int i_514_ = 256 - i_513_;
				    if (i_513_ != 255) {
					if (bool) {
					    int i_515_
						= ((i_512_ & 0xff0000) * i_506_
						   & ~0xffffff);
					    int i_516_
						= ((i_512_ & 0xff00) * i_507_
						   & 0xff0000);
					    int i_517_
						= ((i_512_ & 0xff) * i_508_
						   & 0xff00);
					    i_512_ = (i_515_ | i_516_
						      | i_517_) >>> 8;
					    int i_518_ = is[i_453_];
					    is[i_453_]
						= (((((i_512_ & 0xff00ff)
						      * i_513_)
						     + ((i_518_ & 0xff00ff)
							* i_514_))
						    & ~0xff00ff)
						   + ((((i_512_ & 0xff00)
							* i_513_)
						       + ((i_518_ & 0xff00)
							  * i_514_))
						      & 0xff0000)) >> 8;
					    if (bool_436_) {
						int i_519_
						    = (i_518_ >>> 24) + i_513_;
						if (i_519_ > 255)
						    i_519_ = 255;
						is[i_453_] |= i_519_ << 24;
					    }
					}
					if (bool_435_ && bool_444_)
					    fs[i_453_] = f;
				    } else {
					if (bool) {
					    int i_520_
						= ((i_512_ & 0xff0000) * i_506_
						   & ~0xffffff);
					    int i_521_
						= ((i_512_ & 0xff00) * i_507_
						   & 0xff0000);
					    int i_522_
						= ((i_512_ & 0xff) * i_508_
						   & 0xff00);
					    is[i_453_] = (i_520_ | i_521_
							  | i_522_) >>> 8;
					}
					if (bool_435_ && bool_444_)
					    fs[i_453_] = f;
				    }
				}
				i_445_ += i_449_;
				i_453_++;
			    }
			    i_446_ += i_450_;
			    i_445_ = i_498_;
			    i_453_ += i_454_;
			}
		    }
		} else if (i_440_ == 3) {
		    int i_523_ = i_445_;
		    for (int i_524_ = -i_439_; i_524_ < 0; i_524_++) {
			int i_525_ = (i_446_ >> 16) * anInt9000;
			for (int i_526_ = -i_438_; i_526_ < 0; i_526_++) {
			    if (!bool_435_ || f < fs[i_453_]) {
				if (bool) {
				    int i_527_ = (anIntArray11426
						  [(i_445_ >> 16) + i_525_]);
				    int i_528_ = i_527_ + i_441_;
				    int i_529_ = ((i_527_ & 0xff00ff)
						  + (i_441_ & 0xff00ff));
				    int i_530_
					= ((i_529_ & 0x1000100)
					   + (i_528_ - i_529_ & 0x10000));
				    i_530_
					= i_528_ - i_530_ | i_530_ - (i_530_
								      >>> 8);
				    int i_531_
					= ((i_530_ >>> 24) * (i_441_ >>> 24)
					   >> 8);
				    int i_532_ = 256 - i_531_;
				    if (i_531_ != 255) {
					i_527_ = i_530_;
					i_530_ = is[i_453_];
					i_530_
					    = ((((i_527_ & 0xff00ff) * i_531_
						 + ((i_530_ & 0xff00ff)
						    * i_532_))
						& ~0xff00ff)
					       + (((i_527_ & 0xff00) * i_531_
						   + ((i_530_ & 0xff00)
						      * i_532_))
						  & 0xff0000)) >> 8;
				    }
				    is[i_453_] = i_530_;
				}
				if (bool_435_ && bool_444_)
				    fs[i_453_] = f;
			    }
			    i_445_ += i_449_;
			    i_453_++;
			}
			i_446_ += i_450_;
			i_445_ = i_523_;
			i_453_ += i_454_;
		    }
		} else if (i_440_ == 2) {
		    int i_533_ = i_441_ >>> 24;
		    int i_534_ = 256 - i_533_;
		    int i_535_ = (i_441_ & 0xff00ff) * i_534_ & ~0xff00ff;
		    int i_536_ = (i_441_ & 0xff00) * i_534_ & 0xff0000;
		    i_441_ = (i_535_ | i_536_) >>> 8;
		    int i_537_ = i_445_;
		    for (int i_538_ = -i_439_; i_538_ < 0; i_538_++) {
			int i_539_ = (i_446_ >> 16) * anInt9000;
			for (int i_540_ = -i_438_; i_540_ < 0; i_540_++) {
			    if (!bool_435_ || f < fs[i_453_]) {
				if (bool) {
				    int i_541_ = (anIntArray11426
						  [(i_445_ >> 16) + i_539_]);
				    int i_542_ = i_541_ >>> 24;
				    int i_543_ = 256 - i_542_;
				    i_535_ = ((i_541_ & 0xff00ff) * i_533_
					      & ~0xff00ff);
				    i_536_ = ((i_541_ & 0xff00) * i_533_
					      & 0xff0000);
				    i_541_
					= ((i_535_ | i_536_) >>> 8) + i_441_;
				    int i_544_ = is[i_453_];
				    is[i_453_]
					= ((((i_541_ & 0xff00ff) * i_542_
					     + (i_544_ & 0xff00ff) * i_543_)
					    & ~0xff00ff)
					   + (((i_541_ & 0xff00) * i_542_
					       + (i_544_ & 0xff00) * i_543_)
					      & 0xff0000)) >> 8;
				}
				if (bool_435_ && bool_444_)
				    fs[i_453_] = f;
			    }
			    i_445_ += i_449_;
			    i_453_++;
			}
			i_446_ += i_450_;
			i_445_ = i_537_;
			i_453_ += i_454_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_442_ == 2) {
		if (i_440_ == 1) {
		    int i_545_ = i_445_;
		    for (int i_546_ = -i_439_; i_546_ < 0; i_546_++) {
			int i_547_ = (i_446_ >> 16) * anInt9000;
			for (int i_548_ = -i_438_; i_548_ < 0; i_548_++) {
			    if (!bool_435_ || f < fs[i_453_]) {
				int i_549_
				    = anIntArray11426[(i_445_ >> 16) + i_547_];
				if (i_549_ != 0) {
				    if (bool) {
					int i_550_ = is[i_453_];
					int i_551_ = i_549_ + i_550_;
					int i_552_ = ((i_549_ & 0xff00ff)
						      + (i_550_ & 0xff00ff));
					i_550_
					    = ((i_552_ & 0x1000100)
					       + (i_551_ - i_552_ & 0x10000));
					is[i_453_]
					    = (i_551_ - i_550_
					       | i_550_ - (i_550_ >>> 8));
				    }
				    if (bool_435_ && bool_444_)
					fs[i_453_] = f;
				}
			    }
			    i_445_ += i_449_;
			    i_453_++;
			}
			i_446_ += i_450_;
			i_445_ = i_545_;
			i_453_ += i_454_;
		    }
		} else if (i_440_ == 0) {
		    int i_553_ = i_445_;
		    int i_554_ = (i_441_ & 0xff0000) >> 16;
		    int i_555_ = (i_441_ & 0xff00) >> 8;
		    int i_556_ = i_441_ & 0xff;
		    for (int i_557_ = -i_439_; i_557_ < 0; i_557_++) {
			int i_558_ = (i_446_ >> 16) * anInt9000;
			for (int i_559_ = -i_438_; i_559_ < 0; i_559_++) {
			    if (!bool_435_ || f < fs[i_453_]) {
				int i_560_
				    = anIntArray11426[(i_445_ >> 16) + i_558_];
				if (i_560_ != 0) {
				    if (bool) {
					int i_561_
					    = ((i_560_ & 0xff0000) * i_554_
					       & ~0xffffff);
					int i_562_
					    = ((i_560_ & 0xff00) * i_555_
					       & 0xff0000);
					int i_563_ = ((i_560_ & 0xff) * i_556_
						      & 0xff00);
					i_560_
					    = (i_561_ | i_562_ | i_563_) >>> 8;
					int i_564_ = is[i_453_];
					int i_565_ = i_560_ + i_564_;
					int i_566_ = ((i_560_ & 0xff00ff)
						      + (i_564_ & 0xff00ff));
					i_564_
					    = ((i_566_ & 0x1000100)
					       + (i_565_ - i_566_ & 0x10000));
					is[i_453_]
					    = (i_565_ - i_564_
					       | i_564_ - (i_564_ >>> 8));
				    }
				    if (bool_435_ && bool_444_)
					fs[i_453_] = f;
				}
			    }
			    i_445_ += i_449_;
			    i_453_++;
			}
			i_446_ += i_450_;
			i_445_ = i_553_;
			i_453_ += i_454_;
		    }
		} else if (i_440_ == 3) {
		    int i_567_ = i_445_;
		    for (int i_568_ = -i_439_; i_568_ < 0; i_568_++) {
			int i_569_ = (i_446_ >> 16) * anInt9000;
			for (int i_570_ = -i_438_; i_570_ < 0; i_570_++) {
			    if (!bool_435_ || f < fs[i_453_]) {
				if (bool) {
				    int i_571_ = (anIntArray11426
						  [(i_445_ >> 16) + i_569_]);
				    int i_572_ = i_571_ + i_441_;
				    int i_573_ = ((i_571_ & 0xff00ff)
						  + (i_441_ & 0xff00ff));
				    int i_574_
					= ((i_573_ & 0x1000100)
					   + (i_572_ - i_573_ & 0x10000));
				    i_571_
					= i_572_ - i_574_ | i_574_ - (i_574_
								      >>> 8);
				    i_574_ = is[i_453_];
				    i_572_ = i_571_ + i_574_;
				    i_573_
					= (i_571_ & 0xff00ff) + (i_574_
								 & 0xff00ff);
				    i_574_ = ((i_573_ & 0x1000100)
					      + (i_572_ - i_573_ & 0x10000));
				    is[i_453_]
					= i_572_ - i_574_ | i_574_ - (i_574_
								      >>> 8);
				}
				if (bool_435_ && bool_444_)
				    fs[i_453_] = f;
			    }
			    i_445_ += i_449_;
			    i_453_++;
			}
			i_446_ += i_450_;
			i_445_ = i_567_;
			i_453_ += i_454_;
		    }
		} else if (i_440_ == 2) {
		    int i_575_ = i_441_ >>> 24;
		    int i_576_ = 256 - i_575_;
		    int i_577_ = (i_441_ & 0xff00ff) * i_576_ & ~0xff00ff;
		    int i_578_ = (i_441_ & 0xff00) * i_576_ & 0xff0000;
		    i_441_ = (i_577_ | i_578_) >>> 8;
		    int i_579_ = i_445_;
		    for (int i_580_ = -i_439_; i_580_ < 0; i_580_++) {
			int i_581_ = (i_446_ >> 16) * anInt9000;
			for (int i_582_ = -i_438_; i_582_ < 0; i_582_++) {
			    if (!bool_435_ || f < fs[i_453_]) {
				int i_583_
				    = anIntArray11426[(i_445_ >> 16) + i_581_];
				if (i_583_ != 0) {
				    if (bool) {
					i_577_ = ((i_583_ & 0xff00ff) * i_575_
						  & ~0xff00ff);
					i_578_ = ((i_583_ & 0xff00) * i_575_
						  & 0xff0000);
					i_583_ = (((i_577_ | i_578_) >>> 8)
						  + i_441_);
					int i_584_ = is[i_453_];
					int i_585_ = i_583_ + i_584_;
					int i_586_ = ((i_583_ & 0xff00ff)
						      + (i_584_ & 0xff00ff));
					i_584_
					    = ((i_586_ & 0x1000100)
					       + (i_585_ - i_586_ & 0x10000));
					is[i_453_]
					    = (i_585_ - i_584_
					       | i_584_ - (i_584_ >>> 8));
				    }
				    if (bool_435_ && bool_444_)
					fs[i_453_] = f;
				}
			    }
			    i_445_ += i_449_;
			    i_453_++;
			}
			i_446_ += i_450_;
			i_445_ = i_579_;
			i_453_ += i_454_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    void method14539(int[] is, int[] is_587_, int i, int i_588_) {
	int[] is_589_ = aClass182_Sub2_9033.anIntArray9466;
	if (is_589_ != null) {
	    if (anInt9006 == 0) {
		if (anInt9017 == 0) {
		    int i_590_ = anInt9023;
		    while (i_590_ < 0) {
			int i_591_ = i_590_ + i_588_;
			if (i_591_ >= 0) {
			    if (i_591_ >= is.length)
				break;
			    int i_592_ = anInt9015;
			    int i_593_ = anInt9022;
			    int i_594_ = anInt8999;
			    int i_595_ = anInt9011;
			    if (i_593_ >= 0 && i_594_ >= 0
				&& i_593_ - (anInt9000 << 12) < 0
				&& i_594_ - (anInt9001 << 12) < 0) {
				int i_596_ = is[i_591_] - i;
				int i_597_ = -is_587_[i_591_];
				int i_598_ = i_596_ - (i_592_ - anInt9015);
				if (i_598_ > 0) {
				    i_592_ += i_598_;
				    i_595_ += i_598_;
				    i_593_ += anInt9006 * i_598_;
				    i_594_ += anInt9017 * i_598_;
				} else
				    i_597_ -= i_598_;
				if (i_595_ < i_597_)
				    i_595_ = i_597_;
				for (/**/; i_595_ < 0; i_595_++) {
				    int i_599_ = (anIntArray11426
						  [((i_594_ >> 12) * anInt9000
						    + (i_593_ >> 12))]);
				    int i_600_ = i_599_ >>> 24;
				    int i_601_ = 256 - i_600_;
				    int i_602_ = is_589_[i_592_];
				    is_589_[i_592_++]
					= ((((i_599_ & 0xff00ff) * i_600_
					     + (i_602_ & 0xff00ff) * i_601_)
					    & ~0xff00ff)
					   + (((i_599_ & 0xff00) * i_600_
					       + (i_602_ & 0xff00) * i_601_)
					      & 0xff0000)) >> 8;
				}
			    }
			}
			i_590_++;
			anInt9015 += anInt9014;
		    }
		} else if (anInt9017 < 0) {
		    int i_603_ = anInt9023;
		    while (i_603_ < 0) {
			int i_604_ = i_603_ + i_588_;
			if (i_604_ >= 0) {
			    if (i_604_ >= is.length)
				break;
			    int i_605_ = anInt9015;
			    int i_606_ = anInt9022;
			    int i_607_ = anInt8999 + anInt9025;
			    int i_608_ = anInt9011;
			    if (i_606_ >= 0
				&& i_606_ - (anInt9000 << 12) < 0) {
				int i_609_;
				if ((i_609_ = i_607_ - (anInt9001 << 12))
				    >= 0) {
				    i_609_ = (anInt9017 - i_609_) / anInt9017;
				    i_608_ += i_609_;
				    i_607_ += anInt9017 * i_609_;
				    i_605_ += i_609_;
				}
				if ((i_609_ = (i_607_ - anInt9017) / anInt9017)
				    > i_608_)
				    i_608_ = i_609_;
				int i_610_ = is[i_604_] - i;
				int i_611_ = -is_587_[i_604_];
				int i_612_ = i_610_ - (i_605_ - anInt9015);
				if (i_612_ > 0) {
				    i_605_ += i_612_;
				    i_608_ += i_612_;
				    i_606_ += anInt9006 * i_612_;
				    i_607_ += anInt9017 * i_612_;
				} else
				    i_611_ -= i_612_;
				if (i_608_ < i_611_)
				    i_608_ = i_611_;
				for (/**/; i_608_ < 0; i_608_++) {
				    int i_613_ = (anIntArray11426
						  [((i_607_ >> 12) * anInt9000
						    + (i_606_ >> 12))]);
				    int i_614_ = i_613_ >>> 24;
				    int i_615_ = 256 - i_614_;
				    int i_616_ = is_589_[i_605_];
				    is_589_[i_605_++]
					= ((((i_613_ & 0xff00ff) * i_614_
					     + (i_616_ & 0xff00ff) * i_615_)
					    & ~0xff00ff)
					   + (((i_613_ & 0xff00) * i_614_
					       + (i_616_ & 0xff00) * i_615_)
					      & 0xff0000)) >> 8;
				    i_607_ += anInt9017;
				}
			    }
			}
			i_603_++;
			anInt9022 += anInt9018;
			anInt9015 += anInt9014;
		    }
		} else {
		    int i_617_ = anInt9023;
		    while (i_617_ < 0) {
			int i_618_ = i_617_ + i_588_;
			if (i_618_ >= 0) {
			    if (i_618_ >= is.length)
				break;
			    int i_619_ = anInt9015;
			    int i_620_ = anInt9022;
			    int i_621_ = anInt8999 + anInt9025;
			    int i_622_ = anInt9011;
			    if (i_620_ >= 0
				&& i_620_ - (anInt9000 << 12) < 0) {
				if (i_621_ < 0) {
				    int i_623_
					= (anInt9017 - 1 - i_621_) / anInt9017;
				    i_622_ += i_623_;
				    i_621_ += anInt9017 * i_623_;
				    i_619_ += i_623_;
				}
				int i_624_;
				if ((i_624_ = (1 + i_621_ - (anInt9001 << 12)
					       - anInt9017) / anInt9017)
				    > i_622_)
				    i_622_ = i_624_;
				int i_625_ = is[i_618_] - i;
				int i_626_ = -is_587_[i_618_];
				int i_627_ = i_625_ - (i_619_ - anInt9015);
				if (i_627_ > 0) {
				    i_619_ += i_627_;
				    i_622_ += i_627_;
				    i_620_ += anInt9006 * i_627_;
				    i_621_ += anInt9017 * i_627_;
				} else
				    i_626_ -= i_627_;
				if (i_622_ < i_626_)
				    i_622_ = i_626_;
				for (/**/; i_622_ < 0; i_622_++) {
				    int i_628_ = (anIntArray11426
						  [((i_621_ >> 12) * anInt9000
						    + (i_620_ >> 12))]);
				    int i_629_ = i_628_ >>> 24;
				    int i_630_ = 256 - i_629_;
				    int i_631_ = is_589_[i_619_];
				    is_589_[i_619_++]
					= ((((i_628_ & 0xff00ff) * i_629_
					     + (i_631_ & 0xff00ff) * i_630_)
					    & ~0xff00ff)
					   + (((i_628_ & 0xff00) * i_629_
					       + (i_631_ & 0xff00) * i_630_)
					      & 0xff0000)) >> 8;
				    i_621_ += anInt9017;
				}
			    }
			}
			i_617_++;
			anInt9022 += anInt9018;
			anInt9015 += anInt9014;
		    }
		}
	    } else if (anInt9006 < 0) {
		if (anInt9017 == 0) {
		    int i_632_ = anInt9023;
		    while (i_632_ < 0) {
			int i_633_ = i_632_ + i_588_;
			if (i_633_ >= 0) {
			    if (i_633_ >= is.length)
				break;
			    int i_634_ = anInt9015;
			    int i_635_ = anInt9022 + anInt9024;
			    int i_636_ = anInt8999;
			    int i_637_ = anInt9011;
			    if (i_636_ >= 0
				&& i_636_ - (anInt9001 << 12) < 0) {
				int i_638_;
				if ((i_638_ = i_635_ - (anInt9000 << 12))
				    >= 0) {
				    i_638_ = (anInt9006 - i_638_) / anInt9006;
				    i_637_ += i_638_;
				    i_635_ += anInt9006 * i_638_;
				    i_634_ += i_638_;
				}
				if ((i_638_ = (i_635_ - anInt9006) / anInt9006)
				    > i_637_)
				    i_637_ = i_638_;
				int i_639_ = is[i_633_] - i;
				int i_640_ = -is_587_[i_633_];
				int i_641_ = i_639_ - (i_634_ - anInt9015);
				if (i_641_ > 0) {
				    i_634_ += i_641_;
				    i_637_ += i_641_;
				    i_635_ += anInt9006 * i_641_;
				    i_636_ += anInt9017 * i_641_;
				} else
				    i_640_ -= i_641_;
				if (i_637_ < i_640_)
				    i_637_ = i_640_;
				for (/**/; i_637_ < 0; i_637_++) {
				    int i_642_ = (anIntArray11426
						  [((i_636_ >> 12) * anInt9000
						    + (i_635_ >> 12))]);
				    int i_643_ = i_642_ >>> 24;
				    int i_644_ = 256 - i_643_;
				    int i_645_ = is_589_[i_634_];
				    is_589_[i_634_++]
					= ((((i_642_ & 0xff00ff) * i_643_
					     + (i_645_ & 0xff00ff) * i_644_)
					    & ~0xff00ff)
					   + (((i_642_ & 0xff00) * i_643_
					       + (i_645_ & 0xff00) * i_644_)
					      & 0xff0000)) >> 8;
				    i_635_ += anInt9006;
				}
			    }
			}
			i_632_++;
			anInt8999 += anInt9010;
			anInt9015 += anInt9014;
		    }
		} else if (anInt9017 < 0) {
		    int i_646_ = anInt9023;
		    while (i_646_ < 0) {
			int i_647_ = i_646_ + i_588_;
			if (i_647_ >= 0) {
			    if (i_647_ >= is.length)
				break;
			    int i_648_ = anInt9015;
			    int i_649_ = anInt9022 + anInt9024;
			    int i_650_ = anInt8999 + anInt9025;
			    int i_651_ = anInt9011;
			    int i_652_;
			    if ((i_652_ = i_649_ - (anInt9000 << 12)) >= 0) {
				i_652_ = (anInt9006 - i_652_) / anInt9006;
				i_651_ += i_652_;
				i_649_ += anInt9006 * i_652_;
				i_650_ += anInt9017 * i_652_;
				i_648_ += i_652_;
			    }
			    if ((i_652_ = (i_649_ - anInt9006) / anInt9006)
				> i_651_)
				i_651_ = i_652_;
			    if ((i_652_ = i_650_ - (anInt9001 << 12)) >= 0) {
				i_652_ = (anInt9017 - i_652_) / anInt9017;
				i_651_ += i_652_;
				i_649_ += anInt9006 * i_652_;
				i_650_ += anInt9017 * i_652_;
				i_648_ += i_652_;
			    }
			    if ((i_652_ = (i_650_ - anInt9017) / anInt9017)
				> i_651_)
				i_651_ = i_652_;
			    int i_653_ = is[i_647_] - i;
			    int i_654_ = -is_587_[i_647_];
			    int i_655_ = i_653_ - (i_648_ - anInt9015);
			    if (i_655_ > 0) {
				i_648_ += i_655_;
				i_651_ += i_655_;
				i_649_ += anInt9006 * i_655_;
				i_650_ += anInt9017 * i_655_;
			    } else
				i_654_ -= i_655_;
			    if (i_651_ < i_654_)
				i_651_ = i_654_;
			    for (/**/; i_651_ < 0; i_651_++) {
				int i_656_
				    = (anIntArray11426
				       [(i_650_ >> 12) * anInt9000 + (i_649_
								      >> 12)]);
				int i_657_ = i_656_ >>> 24;
				int i_658_ = 256 - i_657_;
				int i_659_ = is_589_[i_648_];
				is_589_[i_648_++]
				    = ((((i_656_ & 0xff00ff) * i_657_
					 + (i_659_ & 0xff00ff) * i_658_)
					& ~0xff00ff)
				       + (((i_656_ & 0xff00) * i_657_
					   + (i_659_ & 0xff00) * i_658_)
					  & 0xff0000)) >> 8;
				i_649_ += anInt9006;
				i_650_ += anInt9017;
			    }
			}
			i_646_++;
			anInt9022 += anInt9018;
			anInt8999 += anInt9010;
			anInt9015 += anInt9014;
		    }
		} else {
		    int i_660_ = anInt9023;
		    while (i_660_ < 0) {
			int i_661_ = i_660_ + i_588_;
			if (i_661_ >= 0) {
			    if (i_661_ >= is.length)
				break;
			    int i_662_ = anInt9015;
			    int i_663_ = anInt9022 + anInt9024;
			    int i_664_ = anInt8999 + anInt9025;
			    int i_665_ = anInt9011;
			    int i_666_;
			    if ((i_666_ = i_663_ - (anInt9000 << 12)) >= 0) {
				i_666_ = (anInt9006 - i_666_) / anInt9006;
				i_665_ += i_666_;
				i_663_ += anInt9006 * i_666_;
				i_664_ += anInt9017 * i_666_;
				i_662_ += i_666_;
			    }
			    if ((i_666_ = (i_663_ - anInt9006) / anInt9006)
				> i_665_)
				i_665_ = i_666_;
			    if (i_664_ < 0) {
				i_666_ = (anInt9017 - 1 - i_664_) / anInt9017;
				i_665_ += i_666_;
				i_663_ += anInt9006 * i_666_;
				i_664_ += anInt9017 * i_666_;
				i_662_ += i_666_;
			    }
			    if ((i_666_ = (1 + i_664_ - (anInt9001 << 12)
					   - anInt9017) / anInt9017)
				> i_665_)
				i_665_ = i_666_;
			    int i_667_ = is[i_661_] - i;
			    int i_668_ = -is_587_[i_661_];
			    int i_669_ = i_667_ - (i_662_ - anInt9015);
			    if (i_669_ > 0) {
				i_662_ += i_669_;
				i_665_ += i_669_;
				i_663_ += anInt9006 * i_669_;
				i_664_ += anInt9017 * i_669_;
			    } else
				i_668_ -= i_669_;
			    if (i_665_ < i_668_)
				i_665_ = i_668_;
			    for (/**/; i_665_ < 0; i_665_++) {
				int i_670_
				    = (anIntArray11426
				       [(i_664_ >> 12) * anInt9000 + (i_663_
								      >> 12)]);
				int i_671_ = i_670_ >>> 24;
				int i_672_ = 256 - i_671_;
				int i_673_ = is_589_[i_662_];
				is_589_[i_662_++]
				    = ((((i_670_ & 0xff00ff) * i_671_
					 + (i_673_ & 0xff00ff) * i_672_)
					& ~0xff00ff)
				       + (((i_670_ & 0xff00) * i_671_
					   + (i_673_ & 0xff00) * i_672_)
					  & 0xff0000)) >> 8;
				i_663_ += anInt9006;
				i_664_ += anInt9017;
			    }
			}
			i_660_++;
			anInt9022 += anInt9018;
			anInt8999 += anInt9010;
			anInt9015 += anInt9014;
		    }
		}
	    } else if (anInt9017 == 0) {
		int i_674_ = anInt9023;
		while (i_674_ < 0) {
		    int i_675_ = i_674_ + i_588_;
		    if (i_675_ >= 0) {
			if (i_675_ >= is.length)
			    break;
			int i_676_ = anInt9015;
			int i_677_ = anInt9022 + anInt9024;
			int i_678_ = anInt8999;
			int i_679_ = anInt9011;
			if (i_678_ >= 0 && i_678_ - (anInt9001 << 12) < 0) {
			    if (i_677_ < 0) {
				int i_680_
				    = (anInt9006 - 1 - i_677_) / anInt9006;
				i_679_ += i_680_;
				i_677_ += anInt9006 * i_680_;
				i_676_ += i_680_;
			    }
			    int i_681_;
			    if ((i_681_ = (1 + i_677_ - (anInt9000 << 12)
					   - anInt9006) / anInt9006)
				> i_679_)
				i_679_ = i_681_;
			    int i_682_ = is[i_675_] - i;
			    int i_683_ = -is_587_[i_675_];
			    int i_684_ = i_682_ - (i_676_ - anInt9015);
			    if (i_684_ > 0) {
				i_676_ += i_684_;
				i_679_ += i_684_;
				i_677_ += anInt9006 * i_684_;
				i_678_ += anInt9017 * i_684_;
			    } else
				i_683_ -= i_684_;
			    if (i_679_ < i_683_)
				i_679_ = i_683_;
			    for (/**/; i_679_ < 0; i_679_++) {
				int i_685_
				    = (anIntArray11426
				       [(i_678_ >> 12) * anInt9000 + (i_677_
								      >> 12)]);
				int i_686_ = i_685_ >>> 24;
				int i_687_ = 256 - i_686_;
				int i_688_ = is_589_[i_676_];
				is_589_[i_676_++]
				    = ((((i_685_ & 0xff00ff) * i_686_
					 + (i_688_ & 0xff00ff) * i_687_)
					& ~0xff00ff)
				       + (((i_685_ & 0xff00) * i_686_
					   + (i_688_ & 0xff00) * i_687_)
					  & 0xff0000)) >> 8;
				i_677_ += anInt9006;
			    }
			}
		    }
		    i_674_++;
		    anInt9022 += anInt9018;
		    anInt8999 += anInt9010;
		    anInt9015 += anInt9014;
		}
	    } else if (anInt9017 < 0) {
		int i_689_ = anInt9023;
		while (i_689_ < 0) {
		    int i_690_ = i_689_ + i_588_;
		    if (i_690_ >= 0) {
			if (i_690_ >= is.length)
			    break;
			int i_691_ = anInt9015;
			int i_692_ = anInt9022 + anInt9024;
			int i_693_ = anInt8999 + anInt9025;
			int i_694_ = anInt9011;
			if (i_692_ < 0) {
			    int i_695_ = (anInt9006 - 1 - i_692_) / anInt9006;
			    i_694_ += i_695_;
			    i_692_ += anInt9006 * i_695_;
			    i_693_ += anInt9017 * i_695_;
			    i_691_ += i_695_;
			}
			int i_696_;
			if ((i_696_ = (1 + i_692_ - (anInt9000 << 12)
				       - anInt9006) / anInt9006)
			    > i_694_)
			    i_694_ = i_696_;
			if ((i_696_ = i_693_ - (anInt9001 << 12)) >= 0) {
			    i_696_ = (anInt9017 - i_696_) / anInt9017;
			    i_694_ += i_696_;
			    i_692_ += anInt9006 * i_696_;
			    i_693_ += anInt9017 * i_696_;
			    i_691_ += i_696_;
			}
			if ((i_696_ = (i_693_ - anInt9017) / anInt9017)
			    > i_694_)
			    i_694_ = i_696_;
			int i_697_ = is[i_690_] - i;
			int i_698_ = -is_587_[i_690_];
			int i_699_ = i_697_ - (i_691_ - anInt9015);
			if (i_699_ > 0) {
			    i_691_ += i_699_;
			    i_694_ += i_699_;
			    i_692_ += anInt9006 * i_699_;
			    i_693_ += anInt9017 * i_699_;
			} else
			    i_698_ -= i_699_;
			if (i_694_ < i_698_)
			    i_694_ = i_698_;
			for (/**/; i_694_ < 0; i_694_++) {
			    int i_700_
				= (anIntArray11426
				   [(i_693_ >> 12) * anInt9000 + (i_692_
								  >> 12)]);
			    int i_701_ = i_700_ >>> 24;
			    int i_702_ = 256 - i_701_;
			    int i_703_ = is_589_[i_691_];
			    is_589_[i_691_++]
				= ((((i_700_ & 0xff00ff) * i_701_
				     + (i_703_ & 0xff00ff) * i_702_)
				    & ~0xff00ff)
				   + (((i_700_ & 0xff00) * i_701_
				       + (i_703_ & 0xff00) * i_702_)
				      & 0xff0000)) >> 8;
			    i_692_ += anInt9006;
			    i_693_ += anInt9017;
			}
		    }
		    i_689_++;
		    anInt9022 += anInt9018;
		    anInt8999 += anInt9010;
		    anInt9015 += anInt9014;
		}
	    } else {
		int i_704_ = anInt9023;
		while (i_704_ < 0) {
		    int i_705_ = i_704_ + i_588_;
		    if (i_705_ >= 0) {
			if (i_705_ >= is.length)
			    break;
			int i_706_ = anInt9015;
			int i_707_ = anInt9022 + anInt9024;
			int i_708_ = anInt8999 + anInt9025;
			int i_709_ = anInt9011;
			if (i_707_ < 0) {
			    int i_710_ = (anInt9006 - 1 - i_707_) / anInt9006;
			    i_709_ += i_710_;
			    i_707_ += anInt9006 * i_710_;
			    i_708_ += anInt9017 * i_710_;
			    i_706_ += i_710_;
			}
			int i_711_;
			if ((i_711_ = (1 + i_707_ - (anInt9000 << 12)
				       - anInt9006) / anInt9006)
			    > i_709_)
			    i_709_ = i_711_;
			if (i_708_ < 0) {
			    i_711_ = (anInt9017 - 1 - i_708_) / anInt9017;
			    i_709_ += i_711_;
			    i_707_ += anInt9006 * i_711_;
			    i_708_ += anInt9017 * i_711_;
			    i_706_ += i_711_;
			}
			if ((i_711_ = (1 + i_708_ - (anInt9001 << 12)
				       - anInt9017) / anInt9017)
			    > i_709_)
			    i_709_ = i_711_;
			int i_712_ = is[i_705_] - i;
			int i_713_ = -is_587_[i_705_];
			int i_714_ = i_712_ - (i_706_ - anInt9015);
			if (i_714_ > 0) {
			    i_706_ += i_714_;
			    i_709_ += i_714_;
			    i_707_ += anInt9006 * i_714_;
			    i_708_ += anInt9017 * i_714_;
			} else
			    i_713_ -= i_714_;
			if (i_709_ < i_713_)
			    i_709_ = i_713_;
			for (/**/; i_709_ < 0; i_709_++) {
			    int i_715_
				= (anIntArray11426
				   [(i_708_ >> 12) * anInt9000 + (i_707_
								  >> 12)]);
			    int i_716_ = i_715_ >>> 24;
			    int i_717_ = 256 - i_716_;
			    int i_718_ = is_589_[i_706_];
			    is_589_[i_706_++]
				= ((((i_715_ & 0xff00ff) * i_716_
				     + (i_718_ & 0xff00ff) * i_717_)
				    & ~0xff00ff)
				   + (((i_715_ & 0xff00) * i_716_
				       + (i_718_ & 0xff00) * i_717_)
				      & 0xff0000)) >> 8;
			    i_707_ += anInt9006;
			    i_708_ += anInt9017;
			}
		    }
		    i_704_++;
		    anInt9022 += anInt9018;
		    anInt8999 += anInt9010;
		    anInt9015 += anInt9014;
		}
	    }
	}
    }
    
    void method18025(int i, int i_719_, int[] is, int i_720_, int i_721_) {
	if (i_721_ == 0) {
	    if (i_720_ == 1)
		is[i_719_] = anIntArray11426[i];
	    else if (i_720_ == 0) {
		int i_722_ = anIntArray11426[i++];
		int i_723_ = (i_722_ & 0xff0000) * anInt9031 & ~0xffffff;
		int i_724_ = (i_722_ & 0xff00) * anInt9030 & 0xff0000;
		int i_725_ = (i_722_ & 0xff) * anInt9027 & 0xff00;
		is[i_719_] = (i_723_ | i_724_ | i_725_) >>> 8;
	    } else if (i_720_ == 3) {
		int i_726_ = anIntArray11426[i++];
		int i_727_ = anInt9026;
		int i_728_ = i_726_ + i_727_;
		int i_729_ = (i_726_ & 0xff00ff) + (i_727_ & 0xff00ff);
		int i_730_
		    = (i_729_ & 0x1000100) + (i_728_ - i_729_ & 0x10000);
		is[i_719_] = i_728_ - i_730_ | i_730_ - (i_730_ >>> 8);
	    } else if (i_720_ == 2) {
		int i_731_ = anIntArray11426[i];
		int i_732_ = (i_731_ & 0xff00ff) * anInt9007 & ~0xff00ff;
		int i_733_ = (i_731_ & 0xff00) * anInt9007 & 0xff0000;
		is[i_719_] = ((i_732_ | i_733_) >>> 8) + anInt9034;
	    } else
		throw new IllegalArgumentException();
	} else if (i_721_ == 1) {
	    if (i_720_ == 1) {
		int i_734_ = anIntArray11426[i];
		int i_735_ = i_734_ >>> 24;
		int i_736_ = 256 - i_735_;
		int i_737_ = is[i_719_];
		is[i_719_] = ((((i_734_ & 0xff00ff) * i_735_
				+ (i_737_ & 0xff00ff) * i_736_)
			       & ~0xff00ff)
			      + (((i_734_ & 0xff00) * i_735_
				  + (i_737_ & 0xff00) * i_736_)
				 & 0xff0000)) >> 8;
	    } else if (i_720_ == 0) {
		int i_738_ = anIntArray11426[i];
		int i_739_ = (i_738_ >>> 24) * anInt9007 >> 8;
		int i_740_ = 256 - i_739_;
		if ((anInt9026 & 0xffffff) == 16777215) {
		    int i_741_ = is[i_719_];
		    is[i_719_] = ((((i_738_ & 0xff00ff) * i_739_
				    + (i_741_ & 0xff00ff) * i_740_)
				   & ~0xff00ff)
				  + (((i_738_ & 0xff00) * i_739_
				      + (i_741_ & 0xff00) * i_740_)
				     & 0xff0000)) >> 8;
		} else if (i_739_ != 255) {
		    int i_742_ = (i_738_ & 0xff0000) * anInt9031 & ~0xffffff;
		    int i_743_ = (i_738_ & 0xff00) * anInt9030 & 0xff0000;
		    int i_744_ = (i_738_ & 0xff) * anInt9027 & 0xff00;
		    i_738_ = (i_742_ | i_743_ | i_744_) >>> 8;
		    int i_745_ = is[i_719_];
		    is[i_719_] = ((((i_738_ & 0xff00ff) * i_739_
				    + (i_745_ & 0xff00ff) * i_740_)
				   & ~0xff00ff)
				  + (((i_738_ & 0xff00) * i_739_
				      + (i_745_ & 0xff00) * i_740_)
				     & 0xff0000)) >> 8;
		} else {
		    int i_746_ = (i_738_ & 0xff0000) * anInt9031 & ~0xffffff;
		    int i_747_ = (i_738_ & 0xff00) * anInt9030 & 0xff0000;
		    int i_748_ = (i_738_ & 0xff) * anInt9027 & 0xff00;
		    is[i_719_] = (i_746_ | i_747_ | i_748_) >>> 8;
		}
	    } else if (i_720_ == 3) {
		int i_749_ = anIntArray11426[i];
		int i_750_ = anInt9026;
		int i_751_ = i_749_ + i_750_;
		int i_752_ = (i_749_ & 0xff00ff) + (i_750_ & 0xff00ff);
		int i_753_
		    = (i_752_ & 0x1000100) + (i_751_ - i_752_ & 0x10000);
		i_753_ = i_751_ - i_753_ | i_753_ - (i_753_ >>> 8);
		int i_754_ = (i_749_ >>> 24) * anInt9007 >> 8;
		int i_755_ = 256 - i_754_;
		if (i_754_ != 255) {
		    i_749_ = i_753_;
		    i_753_ = is[i_719_];
		    i_753_ = ((((i_749_ & 0xff00ff) * i_754_
				+ (i_753_ & 0xff00ff) * i_755_)
			       & ~0xff00ff)
			      + (((i_749_ & 0xff00) * i_754_
				  + (i_753_ & 0xff00) * i_755_)
				 & 0xff0000)) >> 8;
		}
		is[i_719_] = i_753_;
	    } else if (i_720_ == 2) {
		int i_756_ = anIntArray11426[i];
		int i_757_ = i_756_ >>> 24;
		int i_758_ = 256 - i_757_;
		int i_759_ = (i_756_ & 0xff00ff) * anInt9007 & ~0xff00ff;
		int i_760_ = (i_756_ & 0xff00) * anInt9007 & 0xff0000;
		i_756_ = ((i_759_ | i_760_) >>> 8) + anInt9034;
		int i_761_ = is[i_719_];
		is[i_719_] = ((((i_756_ & 0xff00ff) * i_757_
				+ (i_761_ & 0xff00ff) * i_758_)
			       & ~0xff00ff)
			      + (((i_756_ & 0xff00) * i_757_
				  + (i_761_ & 0xff00) * i_758_)
				 & 0xff0000)) >> 8;
	    } else
		throw new IllegalArgumentException();
	} else if (i_721_ == 2) {
	    if (i_720_ == 1) {
		int i_762_ = anIntArray11426[i];
		int i_763_ = is[i_719_];
		int i_764_ = i_762_ + i_763_;
		int i_765_ = (i_762_ & 0xff00ff) + (i_763_ & 0xff00ff);
		i_763_ = (i_765_ & 0x1000100) + (i_764_ - i_765_ & 0x10000);
		is[i_719_] = i_764_ - i_763_ | i_763_ - (i_763_ >>> 8);
	    } else if (i_720_ == 0) {
		int i_766_ = anIntArray11426[i];
		int i_767_ = (i_766_ & 0xff0000) * anInt9031 & ~0xffffff;
		int i_768_ = (i_766_ & 0xff00) * anInt9030 & 0xff0000;
		int i_769_ = (i_766_ & 0xff) * anInt9027 & 0xff00;
		i_766_ = (i_767_ | i_768_ | i_769_) >>> 8;
		int i_770_ = is[i_719_];
		int i_771_ = i_766_ + i_770_;
		int i_772_ = (i_766_ & 0xff00ff) + (i_770_ & 0xff00ff);
		i_770_ = (i_772_ & 0x1000100) + (i_771_ - i_772_ & 0x10000);
		is[i_719_] = i_771_ - i_770_ | i_770_ - (i_770_ >>> 8);
	    } else if (i_720_ == 3) {
		int i_773_ = anIntArray11426[i];
		int i_774_ = anInt9026;
		int i_775_ = i_773_ + i_774_;
		int i_776_ = (i_773_ & 0xff00ff) + (i_774_ & 0xff00ff);
		int i_777_
		    = (i_776_ & 0x1000100) + (i_775_ - i_776_ & 0x10000);
		i_773_ = i_775_ - i_777_ | i_777_ - (i_777_ >>> 8);
		i_777_ = is[i_719_];
		i_775_ = i_773_ + i_777_;
		i_776_ = (i_773_ & 0xff00ff) + (i_777_ & 0xff00ff);
		i_777_ = (i_776_ & 0x1000100) + (i_775_ - i_776_ & 0x10000);
		is[i_719_] = i_775_ - i_777_ | i_777_ - (i_777_ >>> 8);
	    } else if (i_720_ == 2) {
		int i_778_ = anIntArray11426[i];
		int i_779_ = (i_778_ & 0xff00ff) * anInt9007 & ~0xff00ff;
		int i_780_ = (i_778_ & 0xff00) * anInt9007 & 0xff0000;
		i_778_ = ((i_779_ | i_780_) >>> 8) + anInt9034;
		int i_781_ = is[i_719_];
		int i_782_ = i_778_ + i_781_;
		int i_783_ = (i_778_ & 0xff00ff) + (i_781_ & 0xff00ff);
		i_781_ = (i_783_ & 0x1000100) + (i_782_ - i_783_ & 0x10000);
		is[i_719_] = i_782_ - i_781_ | i_781_ - (i_781_ >>> 8);
	    }
	} else
	    throw new IllegalArgumentException();
    }
    
    public void method2527(int i, int i_784_, int i_785_, int i_786_, int[] is,
			   int i_787_, int i_788_) {
	i_788_ -= i_785_;
	for (int i_789_ = 0; i_789_ < i_786_; i_789_++) {
	    int i_790_ = (i_784_ + i_789_) * i_785_ + i;
	    for (int i_791_ = 0; i_791_ < i_785_; i_791_++)
		anIntArray11426[i_790_ + i_791_] = is[i_787_++];
	    i_787_ += i_788_;
	}
    }
    
    void method14536(int i, int i_792_) {
	int[] is = aClass182_Sub2_9033.anIntArray9466;
	if (is != null) {
	    if (anInt9006 == 0) {
		if (anInt9017 == 0) {
		    int i_793_ = anInt9023;
		    while (i_793_ < 0) {
			int i_794_ = anInt9015;
			int i_795_ = anInt9022;
			int i_796_ = anInt8999;
			int i_797_ = anInt9011;
			if (i_795_ >= 0 && i_796_ >= 0
			    && i_795_ - (anInt9000 << 12) < 0
			    && i_796_ - (anInt9001 << 12) < 0) {
			    for (/**/; i_797_ < 0; i_797_++)
				method18025(((i_796_ >> 12) * anInt9000
					     + (i_795_ >> 12)),
					    i_794_++, is, i, i_792_);
			}
			i_793_++;
			anInt9015 += anInt9014;
		    }
		} else if (anInt9017 < 0) {
		    int i_798_ = anInt9023;
		    while (i_798_ < 0) {
			int i_799_ = anInt9015;
			int i_800_ = anInt9022;
			int i_801_ = anInt8999 + anInt9025;
			int i_802_ = anInt9011;
			if (i_800_ >= 0 && i_800_ - (anInt9000 << 12) < 0) {
			    int i_803_;
			    if ((i_803_ = i_801_ - (anInt9001 << 12)) >= 0) {
				i_803_ = (anInt9017 - i_803_) / anInt9017;
				i_802_ += i_803_;
				i_801_ += anInt9017 * i_803_;
				i_799_ += i_803_;
			    }
			    if ((i_803_ = (i_801_ - anInt9017) / anInt9017)
				> i_802_)
				i_802_ = i_803_;
			    for (/**/; i_802_ < 0; i_802_++) {
				method18025(((i_801_ >> 12) * anInt9000
					     + (i_800_ >> 12)),
					    i_799_++, is, i, i_792_);
				i_801_ += anInt9017;
			    }
			}
			i_798_++;
			anInt9022 += anInt9018;
			anInt9015 += anInt9014;
		    }
		} else {
		    int i_804_ = anInt9023;
		    while (i_804_ < 0) {
			int i_805_ = anInt9015;
			int i_806_ = anInt9022;
			int i_807_ = anInt8999 + anInt9025;
			int i_808_ = anInt9011;
			if (i_806_ >= 0 && i_806_ - (anInt9000 << 12) < 0) {
			    if (i_807_ < 0) {
				int i_809_
				    = (anInt9017 - 1 - i_807_) / anInt9017;
				i_808_ += i_809_;
				i_807_ += anInt9017 * i_809_;
				i_805_ += i_809_;
			    }
			    int i_810_;
			    if ((i_810_ = (1 + i_807_ - (anInt9001 << 12)
					   - anInt9017) / anInt9017)
				> i_808_)
				i_808_ = i_810_;
			    for (/**/; i_808_ < 0; i_808_++) {
				method18025(((i_807_ >> 12) * anInt9000
					     + (i_806_ >> 12)),
					    i_805_++, is, i, i_792_);
				i_807_ += anInt9017;
			    }
			}
			i_804_++;
			anInt9022 += anInt9018;
			anInt9015 += anInt9014;
		    }
		}
	    } else if (anInt9006 < 0) {
		if (anInt9017 == 0) {
		    int i_811_ = anInt9023;
		    while (i_811_ < 0) {
			int i_812_ = anInt9015;
			int i_813_ = anInt9022 + anInt9024;
			int i_814_ = anInt8999;
			int i_815_ = anInt9011;
			if (i_814_ >= 0 && i_814_ - (anInt9001 << 12) < 0) {
			    int i_816_;
			    if ((i_816_ = i_813_ - (anInt9000 << 12)) >= 0) {
				i_816_ = (anInt9006 - i_816_) / anInt9006;
				i_815_ += i_816_;
				i_813_ += anInt9006 * i_816_;
				i_812_ += i_816_;
			    }
			    if ((i_816_ = (i_813_ - anInt9006) / anInt9006)
				> i_815_)
				i_815_ = i_816_;
			    for (/**/; i_815_ < 0; i_815_++) {
				method18025(((i_814_ >> 12) * anInt9000
					     + (i_813_ >> 12)),
					    i_812_++, is, i, i_792_);
				i_813_ += anInt9006;
			    }
			}
			i_811_++;
			anInt8999 += anInt9010;
			anInt9015 += anInt9014;
		    }
		} else if (anInt9017 < 0) {
		    int i_817_ = anInt9023;
		    while (i_817_ < 0) {
			int i_818_ = anInt9015;
			int i_819_ = anInt9022 + anInt9024;
			int i_820_ = anInt8999 + anInt9025;
			int i_821_ = anInt9011;
			int i_822_;
			if ((i_822_ = i_819_ - (anInt9000 << 12)) >= 0) {
			    i_822_ = (anInt9006 - i_822_) / anInt9006;
			    i_821_ += i_822_;
			    i_819_ += anInt9006 * i_822_;
			    i_820_ += anInt9017 * i_822_;
			    i_818_ += i_822_;
			}
			if ((i_822_ = (i_819_ - anInt9006) / anInt9006)
			    > i_821_)
			    i_821_ = i_822_;
			if ((i_822_ = i_820_ - (anInt9001 << 12)) >= 0) {
			    i_822_ = (anInt9017 - i_822_) / anInt9017;
			    i_821_ += i_822_;
			    i_819_ += anInt9006 * i_822_;
			    i_820_ += anInt9017 * i_822_;
			    i_818_ += i_822_;
			}
			if ((i_822_ = (i_820_ - anInt9017) / anInt9017)
			    > i_821_)
			    i_821_ = i_822_;
			for (/**/; i_821_ < 0; i_821_++) {
			    method18025((i_820_ >> 12) * anInt9000 + (i_819_
								      >> 12),
					i_818_++, is, i, i_792_);
			    i_819_ += anInt9006;
			    i_820_ += anInt9017;
			}
			i_817_++;
			anInt9022 += anInt9018;
			anInt8999 += anInt9010;
			anInt9015 += anInt9014;
		    }
		} else {
		    int i_823_ = anInt9023;
		    while (i_823_ < 0) {
			int i_824_ = anInt9015;
			int i_825_ = anInt9022 + anInt9024;
			int i_826_ = anInt8999 + anInt9025;
			int i_827_ = anInt9011;
			int i_828_;
			if ((i_828_ = i_825_ - (anInt9000 << 12)) >= 0) {
			    i_828_ = (anInt9006 - i_828_) / anInt9006;
			    i_827_ += i_828_;
			    i_825_ += anInt9006 * i_828_;
			    i_826_ += anInt9017 * i_828_;
			    i_824_ += i_828_;
			}
			if ((i_828_ = (i_825_ - anInt9006) / anInt9006)
			    > i_827_)
			    i_827_ = i_828_;
			if (i_826_ < 0) {
			    i_828_ = (anInt9017 - 1 - i_826_) / anInt9017;
			    i_827_ += i_828_;
			    i_825_ += anInt9006 * i_828_;
			    i_826_ += anInt9017 * i_828_;
			    i_824_ += i_828_;
			}
			if ((i_828_ = (1 + i_826_ - (anInt9001 << 12)
				       - anInt9017) / anInt9017)
			    > i_827_)
			    i_827_ = i_828_;
			for (/**/; i_827_ < 0; i_827_++) {
			    method18025((i_826_ >> 12) * anInt9000 + (i_825_
								      >> 12),
					i_824_++, is, i, i_792_);
			    i_825_ += anInt9006;
			    i_826_ += anInt9017;
			}
			i_823_++;
			anInt9022 += anInt9018;
			anInt8999 += anInt9010;
			anInt9015 += anInt9014;
		    }
		}
	    } else if (anInt9017 == 0) {
		int i_829_ = anInt9023;
		while (i_829_ < 0) {
		    int i_830_ = anInt9015;
		    int i_831_ = anInt9022 + anInt9024;
		    int i_832_ = anInt8999;
		    int i_833_ = anInt9011;
		    if (i_832_ >= 0 && i_832_ - (anInt9001 << 12) < 0) {
			if (i_831_ < 0) {
			    int i_834_ = (anInt9006 - 1 - i_831_) / anInt9006;
			    i_833_ += i_834_;
			    i_831_ += anInt9006 * i_834_;
			    i_830_ += i_834_;
			}
			int i_835_;
			if ((i_835_ = (1 + i_831_ - (anInt9000 << 12)
				       - anInt9006) / anInt9006)
			    > i_833_)
			    i_833_ = i_835_;
			for (/**/; i_833_ < 0; i_833_++) {
			    method18025((i_832_ >> 12) * anInt9000 + (i_831_
								      >> 12),
					i_830_++, is, i, i_792_);
			    i_831_ += anInt9006;
			}
		    }
		    i_829_++;
		    anInt9022 += anInt9018;
		    anInt8999 += anInt9010;
		    anInt9015 += anInt9014;
		}
	    } else if (anInt9017 < 0) {
		for (int i_836_ = anInt9023; i_836_ < 0; i_836_++) {
		    int i_837_ = anInt9015;
		    int i_838_ = anInt9022 + anInt9024;
		    int i_839_ = anInt8999 + anInt9025;
		    int i_840_ = anInt9011;
		    if (i_838_ < 0) {
			int i_841_ = (anInt9006 - 1 - i_838_) / anInt9006;
			i_840_ += i_841_;
			i_838_ += anInt9006 * i_841_;
			i_839_ += anInt9017 * i_841_;
			i_837_ += i_841_;
		    }
		    int i_842_;
		    if ((i_842_ = ((1 + i_838_ - (anInt9000 << 12) - anInt9006)
				   / anInt9006))
			> i_840_)
			i_840_ = i_842_;
		    if ((i_842_ = i_839_ - (anInt9001 << 12)) >= 0) {
			i_842_ = (anInt9017 - i_842_) / anInt9017;
			i_840_ += i_842_;
			i_838_ += anInt9006 * i_842_;
			i_839_ += anInt9017 * i_842_;
			i_837_ += i_842_;
		    }
		    if ((i_842_ = (i_839_ - anInt9017) / anInt9017) > i_840_)
			i_840_ = i_842_;
		    for (/**/; i_840_ < 0; i_840_++) {
			method18025((i_839_ >> 12) * anInt9000 + (i_838_
								  >> 12),
				    i_837_++, is, i, i_792_);
			i_838_ += anInt9006;
			i_839_ += anInt9017;
		    }
		    anInt9022 += anInt9018;
		    anInt8999 += anInt9010;
		    anInt9015 += anInt9014;
		}
	    } else {
		for (int i_843_ = anInt9023; i_843_ < 0; i_843_++) {
		    int i_844_ = anInt9015;
		    int i_845_ = anInt9022 + anInt9024;
		    int i_846_ = anInt8999 + anInt9025;
		    int i_847_ = anInt9011;
		    if (i_845_ < 0) {
			int i_848_ = (anInt9006 - 1 - i_845_) / anInt9006;
			i_847_ += i_848_;
			i_845_ += anInt9006 * i_848_;
			i_846_ += anInt9017 * i_848_;
			i_844_ += i_848_;
		    }
		    int i_849_;
		    if ((i_849_ = ((1 + i_845_ - (anInt9000 << 12) - anInt9006)
				   / anInt9006))
			> i_847_)
			i_847_ = i_849_;
		    if (i_846_ < 0) {
			i_849_ = (anInt9017 - 1 - i_846_) / anInt9017;
			i_847_ += i_849_;
			i_845_ += anInt9006 * i_849_;
			i_846_ += anInt9017 * i_849_;
			i_844_ += i_849_;
		    }
		    if ((i_849_ = ((1 + i_846_ - (anInt9001 << 12) - anInt9017)
				   / anInt9017))
			> i_847_)
			i_847_ = i_849_;
		    for (/**/; i_847_ < 0; i_847_++) {
			method18025((i_846_ >> 12) * anInt9000 + (i_845_
								  >> 12),
				    i_844_++, is, i, i_792_);
			i_845_ += anInt9006;
			i_846_ += anInt9017;
		    }
		    anInt9022 += anInt9018;
		    anInt8999 += anInt9010;
		    anInt9015 += anInt9014;
		}
	    }
	}
    }
    
    public Interface21 method2502() {
	return new Class97(anInt9000, anInt9001, anIntArray11426);
    }
    
    public void method2499(int i, int i_850_, int i_851_, int i_852_,
			   int i_853_, int i_854_) {
	int[] is = aClass182_Sub2_9033.anIntArray9466;
	if (is == null)
	    throw new IllegalStateException("");
	for (int i_855_ = 0; i_855_ < i_852_; i_855_++) {
	    int i_856_ = (i_850_ + i_855_) * i_851_ + i;
	    int i_857_ = (i_854_ + i_855_) * i_851_ + i_853_;
	    for (int i_858_ = 0; i_858_ < i_851_; i_858_++)
		anIntArray11426[i_856_ + i_858_]
		    = is[i_857_ + i_858_] & 0xffffff;
	}
    }
    
    public void method2486(int i, int i_859_, int i_860_) {
	int[] is = aClass182_Sub2_9033.anIntArray9466;
	if (is == null)
	    throw new IllegalStateException("");
	if (i_860_ == 0) {
	    for (int i_861_ = 0; i_861_ < anInt9001; i_861_++) {
		int i_862_ = i_861_ * anInt9000;
		int i_863_ = (i_859_ + i_861_) * (aClass182_Sub2_9033.anInt9494
						  * -476035351) + i;
		for (int i_864_ = 0; i_864_ < anInt9000; i_864_++)
		    anIntArray11426[i_862_ + i_864_]
			= (anIntArray11426[i_862_ + i_864_] & 0xffffff
			   | is[i_863_ + i_864_] << 8 & ~0xffffff);
	    }
	} else if (i_860_ == 1) {
	    for (int i_865_ = 0; i_865_ < anInt9001; i_865_++) {
		int i_866_ = i_865_ * anInt9000;
		int i_867_ = (i_859_ + i_865_) * (aClass182_Sub2_9033.anInt9494
						  * -476035351) + i;
		for (int i_868_ = 0; i_868_ < anInt9000; i_868_++)
		    anIntArray11426[i_866_ + i_868_]
			= (anIntArray11426[i_866_ + i_868_] & 0xffffff
			   | is[i_867_ + i_868_] << 16 & ~0xffffff);
	    }
	} else if (i_860_ == 2) {
	    for (int i_869_ = 0; i_869_ < anInt9001; i_869_++) {
		int i_870_ = i_869_ * anInt9000;
		int i_871_ = (i_859_ + i_869_) * (aClass182_Sub2_9033.anInt9494
						  * -476035351) + i;
		for (int i_872_ = 0; i_872_ < anInt9000; i_872_++)
		    anIntArray11426[i_870_ + i_872_]
			= (anIntArray11426[i_870_ + i_872_] & 0xffffff
			   | is[i_871_ + i_872_] << 24 & ~0xffffff);
	    }
	} else if (i_860_ == 3) {
	    for (int i_873_ = 0; i_873_ < anInt9001; i_873_++) {
		int i_874_ = i_873_ * anInt9000;
		int i_875_ = (i_859_ + i_873_) * (aClass182_Sub2_9033.anInt9494
						  * -476035351) + i;
		for (int i_876_ = 0; i_876_ < anInt9000; i_876_++)
		    anIntArray11426[i_874_ + i_876_]
			= (anIntArray11426[i_874_ + i_876_] & 0xffffff
			   | (is[i_875_ + i_876_] != 0 ? -16777216 : 0));
	    }
	}
    }
    
    public Interface21 method2501() {
	return new Class97(anInt9000, anInt9001, anIntArray11426);
    }
    
    void method18026(int i, int i_877_, int i_878_, int i_879_, int[] is,
		     int i_880_, int i_881_) {
	i_881_ -= i_878_;
	for (int i_882_ = 0; i_882_ < i_879_; i_882_++) {
	    int i_883_ = (i_877_ + i_882_) * i_878_ + i;
	    for (int i_884_ = 0; i_884_ < i_878_; i_884_++)
		is[i_880_++] = anIntArray11426[i_883_ + i_884_];
	    i_880_ += i_881_;
	}
    }
    
    public Interface21 method2507() {
	return new Class97(anInt9000, anInt9001, anIntArray11426);
    }
    
    public void method2467(int i, int i_885_, int i_886_, int i_887_,
			   int i_888_) {
	if (aClass182_Sub2_9033.method15226())
	    throw new IllegalStateException();
	int[] is = aClass182_Sub2_9033.anIntArray9466;
	if (is != null) {
	    int i_889_ = aClass182_Sub2_9033.anInt9494 * -476035351;
	    i += anInt9002;
	    i_885_ += anInt9003;
	    int i_890_ = i_885_ * i_889_ + i;
	    int i_891_ = 0;
	    int i_892_ = anInt9001;
	    int i_893_ = anInt9000;
	    int i_894_ = i_889_ - i_893_;
	    int i_895_ = 0;
	    if (i_885_ < aClass182_Sub2_9033.anInt9472 * 1722112305) {
		int i_896_
		    = aClass182_Sub2_9033.anInt9472 * 1722112305 - i_885_;
		i_892_ -= i_896_;
		i_885_ = aClass182_Sub2_9033.anInt9472 * 1722112305;
		i_891_ += i_896_ * i_893_;
		i_890_ += i_896_ * i_889_;
	    }
	    if (i_885_ + i_892_ > aClass182_Sub2_9033.anInt9473 * 1920901985)
		i_892_ -= (i_885_ + i_892_
			   - aClass182_Sub2_9033.anInt9473 * 1920901985);
	    if (i < aClass182_Sub2_9033.anInt9470 * 1988019027) {
		int i_897_ = aClass182_Sub2_9033.anInt9470 * 1988019027 - i;
		i_893_ -= i_897_;
		i = aClass182_Sub2_9033.anInt9470 * 1988019027;
		i_891_ += i_897_;
		i_890_ += i_897_;
		i_895_ += i_897_;
		i_894_ += i_897_;
	    }
	    if (i + i_893_ > aClass182_Sub2_9033.anInt9499 * -466178451) {
		int i_898_
		    = i + i_893_ - aClass182_Sub2_9033.anInt9499 * -466178451;
		i_893_ -= i_898_;
		i_895_ += i_898_;
		i_894_ += i_898_;
	    }
	    if (i_893_ > 0 && i_892_ > 0) {
		if (i_888_ == 0) {
		    if (i_886_ == 1) {
			for (int i_899_ = -i_892_; i_899_ < 0; i_899_++) {
			    int i_900_ = i_890_ + i_893_ - 3;
			    while (i_890_ < i_900_) {
				is[i_890_++] = anIntArray11426[i_891_++];
				is[i_890_++] = anIntArray11426[i_891_++];
				is[i_890_++] = anIntArray11426[i_891_++];
				is[i_890_++] = anIntArray11426[i_891_++];
			    }
			    i_900_ += 3;
			    while (i_890_ < i_900_)
				is[i_890_++] = anIntArray11426[i_891_++];
			    i_890_ += i_894_;
			    i_891_ += i_895_;
			}
		    } else if (i_886_ == 0) {
			int i_901_ = (i_887_ & 0xff0000) >> 16;
			int i_902_ = (i_887_ & 0xff00) >> 8;
			int i_903_ = i_887_ & 0xff;
			for (int i_904_ = -i_892_; i_904_ < 0; i_904_++) {
			    for (int i_905_ = -i_893_; i_905_ < 0; i_905_++) {
				int i_906_ = anIntArray11426[i_891_++];
				int i_907_
				    = (i_906_ & 0xff0000) * i_901_ & ~0xffffff;
				int i_908_
				    = (i_906_ & 0xff00) * i_902_ & 0xff0000;
				int i_909_ = (i_906_ & 0xff) * i_903_ & 0xff00;
				is[i_890_++]
				    = (i_907_ | i_908_ | i_909_) >>> 8;
			    }
			    i_890_ += i_894_;
			    i_891_ += i_895_;
			}
		    } else if (i_886_ == 3) {
			for (int i_910_ = -i_892_; i_910_ < 0; i_910_++) {
			    for (int i_911_ = -i_893_; i_911_ < 0; i_911_++) {
				int i_912_ = anIntArray11426[i_891_++];
				int i_913_ = i_912_ + i_887_;
				int i_914_ = ((i_912_ & 0xff00ff)
					      + (i_887_ & 0xff00ff));
				int i_915_ = ((i_914_ & 0x1000100)
					      + (i_913_ - i_914_ & 0x10000));
				is[i_890_++]
				    = i_913_ - i_915_ | i_915_ - (i_915_
								  >>> 8);
			    }
			    i_890_ += i_894_;
			    i_891_ += i_895_;
			}
		    } else if (i_886_ == 2) {
			int i_916_ = i_887_ >>> 24;
			int i_917_ = 256 - i_916_;
			int i_918_ = (i_887_ & 0xff00ff) * i_917_ & ~0xff00ff;
			int i_919_ = (i_887_ & 0xff00) * i_917_ & 0xff0000;
			i_887_ = (i_918_ | i_919_) >>> 8;
			for (int i_920_ = -i_892_; i_920_ < 0; i_920_++) {
			    for (int i_921_ = -i_893_; i_921_ < 0; i_921_++) {
				int i_922_ = anIntArray11426[i_891_++];
				i_918_
				    = (i_922_ & 0xff00ff) * i_916_ & ~0xff00ff;
				i_919_ = (i_922_ & 0xff00) * i_916_ & 0xff0000;
				is[i_890_++]
				    = ((i_918_ | i_919_) >>> 8) + i_887_;
			    }
			    i_890_ += i_894_;
			    i_891_ += i_895_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_888_ == 1) {
		    if (i_886_ == 1) {
			for (int i_923_ = -i_892_; i_923_ < 0; i_923_++) {
			    for (int i_924_ = -i_893_; i_924_ < 0; i_924_++) {
				int i_925_ = anIntArray11426[i_891_++];
				int i_926_ = i_925_ >>> 24;
				int i_927_ = 256 - i_926_;
				int i_928_ = is[i_890_];
				is[i_890_++]
				    = (((((i_925_ & 0xff00ff) * i_926_
					  + (i_928_ & 0xff00ff) * i_927_)
					 & ~0xff00ff)
					>> 8)
				       + (((((i_925_ & ~0xff00ff) >>> 8)
					    * i_926_)
					   + (((i_928_ & ~0xff00ff) >>> 8)
					      * i_927_))
					  & ~0xff00ff));
			    }
			    i_890_ += i_894_;
			    i_891_ += i_895_;
			}
		    } else if (i_886_ == 0) {
			if ((i_887_ & 0xffffff) == 16777215) {
			    for (int i_929_ = -i_892_; i_929_ < 0; i_929_++) {
				for (int i_930_ = -i_893_; i_930_ < 0;
				     i_930_++) {
				    int i_931_ = anIntArray11426[i_891_++];
				    int i_932_
					= ((i_931_ >>> 24) * (i_887_ >>> 24)
					   >> 8);
				    int i_933_ = 256 - i_932_;
				    int i_934_ = is[i_890_];
				    is[i_890_++]
					= ((((i_931_ & 0xff00ff) * i_932_
					     + (i_934_ & 0xff00ff) * i_933_)
					    & ~0xff00ff)
					   + (((i_931_ & 0xff00) * i_932_
					       + (i_934_ & 0xff00) * i_933_)
					      & 0xff0000)) >> 8;
				}
				i_890_ += i_894_;
				i_891_ += i_895_;
			    }
			} else {
			    int i_935_ = (i_887_ & 0xff0000) >> 16;
			    int i_936_ = (i_887_ & 0xff00) >> 8;
			    int i_937_ = i_887_ & 0xff;
			    for (int i_938_ = -i_892_; i_938_ < 0; i_938_++) {
				for (int i_939_ = -i_893_; i_939_ < 0;
				     i_939_++) {
				    int i_940_ = anIntArray11426[i_891_++];
				    int i_941_
					= ((i_940_ >>> 24) * (i_887_ >>> 24)
					   >> 8);
				    int i_942_ = 256 - i_941_;
				    if (i_941_ != 255) {
					int i_943_
					    = ((i_940_ & 0xff0000) * i_935_
					       & ~0xffffff);
					int i_944_
					    = ((i_940_ & 0xff00) * i_936_
					       & 0xff0000);
					int i_945_ = ((i_940_ & 0xff) * i_937_
						      & 0xff00);
					i_940_
					    = (i_943_ | i_944_ | i_945_) >>> 8;
					int i_946_ = is[i_890_];
					is[i_890_++]
					    = ((((i_940_ & 0xff00ff) * i_941_
						 + ((i_946_ & 0xff00ff)
						    * i_942_))
						& ~0xff00ff)
					       + (((i_940_ & 0xff00) * i_941_
						   + ((i_946_ & 0xff00)
						      * i_942_))
						  & 0xff0000)) >> 8;
				    } else {
					int i_947_
					    = ((i_940_ & 0xff0000) * i_935_
					       & ~0xffffff);
					int i_948_
					    = ((i_940_ & 0xff00) * i_936_
					       & 0xff0000);
					int i_949_ = ((i_940_ & 0xff) * i_937_
						      & 0xff00);
					is[i_890_++]
					    = (i_947_ | i_948_ | i_949_) >>> 8;
				    }
				}
				i_890_ += i_894_;
				i_891_ += i_895_;
			    }
			}
		    } else if (i_886_ == 3) {
			for (int i_950_ = -i_892_; i_950_ < 0; i_950_++) {
			    for (int i_951_ = -i_893_; i_951_ < 0; i_951_++) {
				int i_952_ = anIntArray11426[i_891_++];
				int i_953_ = i_952_ + i_887_;
				int i_954_ = ((i_952_ & 0xff00ff)
					      + (i_887_ & 0xff00ff));
				int i_955_ = ((i_954_ & 0x1000100)
					      + (i_953_ - i_954_ & 0x10000));
				i_955_ = i_953_ - i_955_ | i_955_ - (i_955_
								     >>> 8);
				int i_956_
				    = (i_955_ >>> 24) * (i_887_ >>> 24) >> 8;
				int i_957_ = 256 - i_956_;
				if (i_956_ != 255) {
				    i_952_ = i_955_;
				    i_955_ = is[i_890_];
				    i_955_ = ((((i_952_ & 0xff00ff) * i_956_
						+ (i_955_ & 0xff00ff) * i_957_)
					       & ~0xff00ff)
					      + (((i_952_ & 0xff00) * i_956_
						  + (i_955_ & 0xff00) * i_957_)
						 & 0xff0000)) >> 8;
				}
				is[i_890_++] = i_955_;
			    }
			    i_890_ += i_894_;
			    i_891_ += i_895_;
			}
		    } else if (i_886_ == 2) {
			int i_958_ = i_887_ >>> 24;
			int i_959_ = 256 - i_958_;
			int i_960_ = (i_887_ & 0xff00ff) * i_959_ & ~0xff00ff;
			int i_961_ = (i_887_ & 0xff00) * i_959_ & 0xff0000;
			i_887_ = (i_960_ | i_961_) >>> 8;
			for (int i_962_ = -i_892_; i_962_ < 0; i_962_++) {
			    for (int i_963_ = -i_893_; i_963_ < 0; i_963_++) {
				int i_964_ = anIntArray11426[i_891_++];
				int i_965_ = i_964_ >>> 24;
				int i_966_ = 256 - i_965_;
				i_960_
				    = (i_964_ & 0xff00ff) * i_958_ & ~0xff00ff;
				i_961_ = (i_964_ & 0xff00) * i_958_ & 0xff0000;
				i_964_ = ((i_960_ | i_961_) >>> 8) + i_887_;
				int i_967_ = is[i_890_];
				is[i_890_++]
				    = ((((i_964_ & 0xff00ff) * i_965_
					 + (i_967_ & 0xff00ff) * i_966_)
					& ~0xff00ff)
				       + (((i_964_ & 0xff00) * i_965_
					   + (i_967_ & 0xff00) * i_966_)
					  & 0xff0000)) >> 8;
			    }
			    i_890_ += i_894_;
			    i_891_ += i_895_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_888_ == 2) {
		    if (i_886_ == 1) {
			for (int i_968_ = -i_892_; i_968_ < 0; i_968_++) {
			    for (int i_969_ = -i_893_; i_969_ < 0; i_969_++) {
				int i_970_ = anIntArray11426[i_891_++];
				if (i_970_ != 0) {
				    int i_971_ = is[i_890_];
				    int i_972_ = i_970_ + i_971_;
				    int i_973_ = ((i_970_ & 0xff00ff)
						  + (i_971_ & 0xff00ff));
				    i_971_ = ((i_973_ & 0x1000100)
					      + (i_972_ - i_973_ & 0x10000));
				    is[i_890_++]
					= i_972_ - i_971_ | i_971_ - (i_971_
								      >>> 8);
				} else
				    i_890_++;
			    }
			    i_890_ += i_894_;
			    i_891_ += i_895_;
			}
		    } else if (i_886_ == 0) {
			int i_974_ = (i_887_ & 0xff0000) >> 16;
			int i_975_ = (i_887_ & 0xff00) >> 8;
			int i_976_ = i_887_ & 0xff;
			for (int i_977_ = -i_892_; i_977_ < 0; i_977_++) {
			    for (int i_978_ = -i_893_; i_978_ < 0; i_978_++) {
				int i_979_ = anIntArray11426[i_891_++];
				if (i_979_ != 0) {
				    int i_980_ = ((i_979_ & 0xff0000) * i_974_
						  & ~0xffffff);
				    int i_981_ = ((i_979_ & 0xff00) * i_975_
						  & 0xff0000);
				    int i_982_
					= (i_979_ & 0xff) * i_976_ & 0xff00;
				    i_979_ = (i_980_ | i_981_ | i_982_) >>> 8;
				    int i_983_ = is[i_890_];
				    int i_984_ = i_979_ + i_983_;
				    int i_985_ = ((i_979_ & 0xff00ff)
						  + (i_983_ & 0xff00ff));
				    i_983_ = ((i_985_ & 0x1000100)
					      + (i_984_ - i_985_ & 0x10000));
				    is[i_890_++]
					= i_984_ - i_983_ | i_983_ - (i_983_
								      >>> 8);
				} else
				    i_890_++;
			    }
			    i_890_ += i_894_;
			    i_891_ += i_895_;
			}
		    } else if (i_886_ == 3) {
			for (int i_986_ = -i_892_; i_986_ < 0; i_986_++) {
			    for (int i_987_ = -i_893_; i_987_ < 0; i_987_++) {
				int i_988_ = anIntArray11426[i_891_++];
				int i_989_ = i_988_ + i_887_;
				int i_990_ = ((i_988_ & 0xff00ff)
					      + (i_887_ & 0xff00ff));
				int i_991_ = ((i_990_ & 0x1000100)
					      + (i_989_ - i_990_ & 0x10000));
				i_988_ = i_989_ - i_991_ | i_991_ - (i_991_
								     >>> 8);
				i_991_ = is[i_890_];
				i_989_ = i_988_ + i_991_;
				i_990_ = (i_988_ & 0xff00ff) + (i_991_
								& 0xff00ff);
				i_991_
				    = (i_990_ & 0x1000100) + (i_989_ - i_990_
							      & 0x10000);
				is[i_890_++]
				    = i_989_ - i_991_ | i_991_ - (i_991_
								  >>> 8);
			    }
			    i_890_ += i_894_;
			    i_891_ += i_895_;
			}
		    } else if (i_886_ == 2) {
			int i_992_ = i_887_ >>> 24;
			int i_993_ = 256 - i_992_;
			int i_994_ = (i_887_ & 0xff00ff) * i_993_ & ~0xff00ff;
			int i_995_ = (i_887_ & 0xff00) * i_993_ & 0xff0000;
			i_887_ = (i_994_ | i_995_) >>> 8;
			for (int i_996_ = -i_892_; i_996_ < 0; i_996_++) {
			    for (int i_997_ = -i_893_; i_997_ < 0; i_997_++) {
				int i_998_ = anIntArray11426[i_891_++];
				if (i_998_ != 0) {
				    i_994_ = ((i_998_ & 0xff00ff) * i_992_
					      & ~0xff00ff);
				    i_995_ = ((i_998_ & 0xff00) * i_992_
					      & 0xff0000);
				    i_998_
					= ((i_994_ | i_995_) >>> 8) + i_887_;
				    int i_999_ = is[i_890_];
				    int i_1000_ = i_998_ + i_999_;
				    int i_1001_ = ((i_998_ & 0xff00ff)
						   + (i_999_ & 0xff00ff));
				    i_999_ = ((i_1001_ & 0x1000100)
					      + (i_1000_ - i_1001_ & 0x10000));
				    is[i_890_++]
					= i_1000_ - i_999_ | i_999_ - (i_999_
								       >>> 8);
				} else
				    i_890_++;
			    }
			    i_890_ += i_894_;
			    i_891_ += i_895_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    public void method2505(int i, int i_1002_, int i_1003_, int i_1004_,
			   int i_1005_) {
	if (aClass182_Sub2_9033.method15226())
	    throw new IllegalStateException();
	int[] is = aClass182_Sub2_9033.anIntArray9466;
	if (is != null) {
	    int i_1006_ = aClass182_Sub2_9033.anInt9494 * -476035351;
	    i += anInt9002;
	    i_1002_ += anInt9003;
	    int i_1007_ = i_1002_ * i_1006_ + i;
	    int i_1008_ = 0;
	    int i_1009_ = anInt9001;
	    int i_1010_ = anInt9000;
	    int i_1011_ = i_1006_ - i_1010_;
	    int i_1012_ = 0;
	    if (i_1002_ < aClass182_Sub2_9033.anInt9472 * 1722112305) {
		int i_1013_
		    = aClass182_Sub2_9033.anInt9472 * 1722112305 - i_1002_;
		i_1009_ -= i_1013_;
		i_1002_ = aClass182_Sub2_9033.anInt9472 * 1722112305;
		i_1008_ += i_1013_ * i_1010_;
		i_1007_ += i_1013_ * i_1006_;
	    }
	    if (i_1002_ + i_1009_ > aClass182_Sub2_9033.anInt9473 * 1920901985)
		i_1009_ -= (i_1002_ + i_1009_
			    - aClass182_Sub2_9033.anInt9473 * 1920901985);
	    if (i < aClass182_Sub2_9033.anInt9470 * 1988019027) {
		int i_1014_ = aClass182_Sub2_9033.anInt9470 * 1988019027 - i;
		i_1010_ -= i_1014_;
		i = aClass182_Sub2_9033.anInt9470 * 1988019027;
		i_1008_ += i_1014_;
		i_1007_ += i_1014_;
		i_1012_ += i_1014_;
		i_1011_ += i_1014_;
	    }
	    if (i + i_1010_ > aClass182_Sub2_9033.anInt9499 * -466178451) {
		int i_1015_
		    = i + i_1010_ - aClass182_Sub2_9033.anInt9499 * -466178451;
		i_1010_ -= i_1015_;
		i_1012_ += i_1015_;
		i_1011_ += i_1015_;
	    }
	    if (i_1010_ > 0 && i_1009_ > 0) {
		if (i_1005_ == 0) {
		    if (i_1003_ == 1) {
			for (int i_1016_ = -i_1009_; i_1016_ < 0; i_1016_++) {
			    int i_1017_ = i_1007_ + i_1010_ - 3;
			    while (i_1007_ < i_1017_) {
				is[i_1007_++] = anIntArray11426[i_1008_++];
				is[i_1007_++] = anIntArray11426[i_1008_++];
				is[i_1007_++] = anIntArray11426[i_1008_++];
				is[i_1007_++] = anIntArray11426[i_1008_++];
			    }
			    i_1017_ += 3;
			    while (i_1007_ < i_1017_)
				is[i_1007_++] = anIntArray11426[i_1008_++];
			    i_1007_ += i_1011_;
			    i_1008_ += i_1012_;
			}
		    } else if (i_1003_ == 0) {
			int i_1018_ = (i_1004_ & 0xff0000) >> 16;
			int i_1019_ = (i_1004_ & 0xff00) >> 8;
			int i_1020_ = i_1004_ & 0xff;
			for (int i_1021_ = -i_1009_; i_1021_ < 0; i_1021_++) {
			    for (int i_1022_ = -i_1010_; i_1022_ < 0;
				 i_1022_++) {
				int i_1023_ = anIntArray11426[i_1008_++];
				int i_1024_ = ((i_1023_ & 0xff0000) * i_1018_
					       & ~0xffffff);
				int i_1025_
				    = (i_1023_ & 0xff00) * i_1019_ & 0xff0000;
				int i_1026_
				    = (i_1023_ & 0xff) * i_1020_ & 0xff00;
				is[i_1007_++]
				    = (i_1024_ | i_1025_ | i_1026_) >>> 8;
			    }
			    i_1007_ += i_1011_;
			    i_1008_ += i_1012_;
			}
		    } else if (i_1003_ == 3) {
			for (int i_1027_ = -i_1009_; i_1027_ < 0; i_1027_++) {
			    for (int i_1028_ = -i_1010_; i_1028_ < 0;
				 i_1028_++) {
				int i_1029_ = anIntArray11426[i_1008_++];
				int i_1030_ = i_1029_ + i_1004_;
				int i_1031_ = ((i_1029_ & 0xff00ff)
					       + (i_1004_ & 0xff00ff));
				int i_1032_
				    = ((i_1031_ & 0x1000100)
				       + (i_1030_ - i_1031_ & 0x10000));
				is[i_1007_++]
				    = i_1030_ - i_1032_ | i_1032_ - (i_1032_
								     >>> 8);
			    }
			    i_1007_ += i_1011_;
			    i_1008_ += i_1012_;
			}
		    } else if (i_1003_ == 2) {
			int i_1033_ = i_1004_ >>> 24;
			int i_1034_ = 256 - i_1033_;
			int i_1035_
			    = (i_1004_ & 0xff00ff) * i_1034_ & ~0xff00ff;
			int i_1036_ = (i_1004_ & 0xff00) * i_1034_ & 0xff0000;
			i_1004_ = (i_1035_ | i_1036_) >>> 8;
			for (int i_1037_ = -i_1009_; i_1037_ < 0; i_1037_++) {
			    for (int i_1038_ = -i_1010_; i_1038_ < 0;
				 i_1038_++) {
				int i_1039_ = anIntArray11426[i_1008_++];
				i_1035_ = ((i_1039_ & 0xff00ff) * i_1033_
					   & ~0xff00ff);
				i_1036_
				    = (i_1039_ & 0xff00) * i_1033_ & 0xff0000;
				is[i_1007_++]
				    = ((i_1035_ | i_1036_) >>> 8) + i_1004_;
			    }
			    i_1007_ += i_1011_;
			    i_1008_ += i_1012_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1005_ == 1) {
		    if (i_1003_ == 1) {
			for (int i_1040_ = -i_1009_; i_1040_ < 0; i_1040_++) {
			    for (int i_1041_ = -i_1010_; i_1041_ < 0;
				 i_1041_++) {
				int i_1042_ = anIntArray11426[i_1008_++];
				int i_1043_ = i_1042_ >>> 24;
				int i_1044_ = 256 - i_1043_;
				int i_1045_ = is[i_1007_];
				is[i_1007_++]
				    = (((((i_1042_ & 0xff00ff) * i_1043_
					  + (i_1045_ & 0xff00ff) * i_1044_)
					 & ~0xff00ff)
					>> 8)
				       + (((((i_1042_ & ~0xff00ff) >>> 8)
					    * i_1043_)
					   + (((i_1045_ & ~0xff00ff) >>> 8)
					      * i_1044_))
					  & ~0xff00ff));
			    }
			    i_1007_ += i_1011_;
			    i_1008_ += i_1012_;
			}
		    } else if (i_1003_ == 0) {
			if ((i_1004_ & 0xffffff) == 16777215) {
			    for (int i_1046_ = -i_1009_; i_1046_ < 0;
				 i_1046_++) {
				for (int i_1047_ = -i_1010_; i_1047_ < 0;
				     i_1047_++) {
				    int i_1048_ = anIntArray11426[i_1008_++];
				    int i_1049_
					= ((i_1048_ >>> 24) * (i_1004_ >>> 24)
					   >> 8);
				    int i_1050_ = 256 - i_1049_;
				    int i_1051_ = is[i_1007_];
				    is[i_1007_++]
					= ((((i_1048_ & 0xff00ff) * i_1049_
					     + (i_1051_ & 0xff00ff) * i_1050_)
					    & ~0xff00ff)
					   + (((i_1048_ & 0xff00) * i_1049_
					       + (i_1051_ & 0xff00) * i_1050_)
					      & 0xff0000)) >> 8;
				}
				i_1007_ += i_1011_;
				i_1008_ += i_1012_;
			    }
			} else {
			    int i_1052_ = (i_1004_ & 0xff0000) >> 16;
			    int i_1053_ = (i_1004_ & 0xff00) >> 8;
			    int i_1054_ = i_1004_ & 0xff;
			    for (int i_1055_ = -i_1009_; i_1055_ < 0;
				 i_1055_++) {
				for (int i_1056_ = -i_1010_; i_1056_ < 0;
				     i_1056_++) {
				    int i_1057_ = anIntArray11426[i_1008_++];
				    int i_1058_
					= ((i_1057_ >>> 24) * (i_1004_ >>> 24)
					   >> 8);
				    int i_1059_ = 256 - i_1058_;
				    if (i_1058_ != 255) {
					int i_1060_
					    = ((i_1057_ & 0xff0000) * i_1052_
					       & ~0xffffff);
					int i_1061_
					    = ((i_1057_ & 0xff00) * i_1053_
					       & 0xff0000);
					int i_1062_
					    = ((i_1057_ & 0xff) * i_1054_
					       & 0xff00);
					i_1057_ = (i_1060_ | i_1061_
						   | i_1062_) >>> 8;
					int i_1063_ = is[i_1007_];
					is[i_1007_++]
					    = ((((i_1057_ & 0xff00ff) * i_1058_
						 + ((i_1063_ & 0xff00ff)
						    * i_1059_))
						& ~0xff00ff)
					       + (((i_1057_ & 0xff00) * i_1058_
						   + ((i_1063_ & 0xff00)
						      * i_1059_))
						  & 0xff0000)) >> 8;
				    } else {
					int i_1064_
					    = ((i_1057_ & 0xff0000) * i_1052_
					       & ~0xffffff);
					int i_1065_
					    = ((i_1057_ & 0xff00) * i_1053_
					       & 0xff0000);
					int i_1066_
					    = ((i_1057_ & 0xff) * i_1054_
					       & 0xff00);
					is[i_1007_++] = (i_1064_ | i_1065_
							 | i_1066_) >>> 8;
				    }
				}
				i_1007_ += i_1011_;
				i_1008_ += i_1012_;
			    }
			}
		    } else if (i_1003_ == 3) {
			for (int i_1067_ = -i_1009_; i_1067_ < 0; i_1067_++) {
			    for (int i_1068_ = -i_1010_; i_1068_ < 0;
				 i_1068_++) {
				int i_1069_ = anIntArray11426[i_1008_++];
				int i_1070_ = i_1069_ + i_1004_;
				int i_1071_ = ((i_1069_ & 0xff00ff)
					       + (i_1004_ & 0xff00ff));
				int i_1072_
				    = ((i_1071_ & 0x1000100)
				       + (i_1070_ - i_1071_ & 0x10000));
				i_1072_
				    = i_1070_ - i_1072_ | i_1072_ - (i_1072_
								     >>> 8);
				int i_1073_
				    = (i_1072_ >>> 24) * (i_1004_ >>> 24) >> 8;
				int i_1074_ = 256 - i_1073_;
				if (i_1073_ != 255) {
				    i_1069_ = i_1072_;
				    i_1072_ = is[i_1007_];
				    i_1072_
					= ((((i_1069_ & 0xff00ff) * i_1073_
					     + (i_1072_ & 0xff00ff) * i_1074_)
					    & ~0xff00ff)
					   + (((i_1069_ & 0xff00) * i_1073_
					       + (i_1072_ & 0xff00) * i_1074_)
					      & 0xff0000)) >> 8;
				}
				is[i_1007_++] = i_1072_;
			    }
			    i_1007_ += i_1011_;
			    i_1008_ += i_1012_;
			}
		    } else if (i_1003_ == 2) {
			int i_1075_ = i_1004_ >>> 24;
			int i_1076_ = 256 - i_1075_;
			int i_1077_
			    = (i_1004_ & 0xff00ff) * i_1076_ & ~0xff00ff;
			int i_1078_ = (i_1004_ & 0xff00) * i_1076_ & 0xff0000;
			i_1004_ = (i_1077_ | i_1078_) >>> 8;
			for (int i_1079_ = -i_1009_; i_1079_ < 0; i_1079_++) {
			    for (int i_1080_ = -i_1010_; i_1080_ < 0;
				 i_1080_++) {
				int i_1081_ = anIntArray11426[i_1008_++];
				int i_1082_ = i_1081_ >>> 24;
				int i_1083_ = 256 - i_1082_;
				i_1077_ = ((i_1081_ & 0xff00ff) * i_1075_
					   & ~0xff00ff);
				i_1078_
				    = (i_1081_ & 0xff00) * i_1075_ & 0xff0000;
				i_1081_
				    = ((i_1077_ | i_1078_) >>> 8) + i_1004_;
				int i_1084_ = is[i_1007_];
				is[i_1007_++]
				    = ((((i_1081_ & 0xff00ff) * i_1082_
					 + (i_1084_ & 0xff00ff) * i_1083_)
					& ~0xff00ff)
				       + (((i_1081_ & 0xff00) * i_1082_
					   + (i_1084_ & 0xff00) * i_1083_)
					  & 0xff0000)) >> 8;
			    }
			    i_1007_ += i_1011_;
			    i_1008_ += i_1012_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1005_ == 2) {
		    if (i_1003_ == 1) {
			for (int i_1085_ = -i_1009_; i_1085_ < 0; i_1085_++) {
			    for (int i_1086_ = -i_1010_; i_1086_ < 0;
				 i_1086_++) {
				int i_1087_ = anIntArray11426[i_1008_++];
				if (i_1087_ != 0) {
				    int i_1088_ = is[i_1007_];
				    int i_1089_ = i_1087_ + i_1088_;
				    int i_1090_ = ((i_1087_ & 0xff00ff)
						   + (i_1088_ & 0xff00ff));
				    i_1088_
					= ((i_1090_ & 0x1000100)
					   + (i_1089_ - i_1090_ & 0x10000));
				    is[i_1007_++]
					= (i_1089_ - i_1088_
					   | i_1088_ - (i_1088_ >>> 8));
				} else
				    i_1007_++;
			    }
			    i_1007_ += i_1011_;
			    i_1008_ += i_1012_;
			}
		    } else if (i_1003_ == 0) {
			int i_1091_ = (i_1004_ & 0xff0000) >> 16;
			int i_1092_ = (i_1004_ & 0xff00) >> 8;
			int i_1093_ = i_1004_ & 0xff;
			for (int i_1094_ = -i_1009_; i_1094_ < 0; i_1094_++) {
			    for (int i_1095_ = -i_1010_; i_1095_ < 0;
				 i_1095_++) {
				int i_1096_ = anIntArray11426[i_1008_++];
				if (i_1096_ != 0) {
				    int i_1097_
					= ((i_1096_ & 0xff0000) * i_1091_
					   & ~0xffffff);
				    int i_1098_ = ((i_1096_ & 0xff00) * i_1092_
						   & 0xff0000);
				    int i_1099_
					= (i_1096_ & 0xff) * i_1093_ & 0xff00;
				    i_1096_
					= (i_1097_ | i_1098_ | i_1099_) >>> 8;
				    int i_1100_ = is[i_1007_];
				    int i_1101_ = i_1096_ + i_1100_;
				    int i_1102_ = ((i_1096_ & 0xff00ff)
						   + (i_1100_ & 0xff00ff));
				    i_1100_
					= ((i_1102_ & 0x1000100)
					   + (i_1101_ - i_1102_ & 0x10000));
				    is[i_1007_++]
					= (i_1101_ - i_1100_
					   | i_1100_ - (i_1100_ >>> 8));
				} else
				    i_1007_++;
			    }
			    i_1007_ += i_1011_;
			    i_1008_ += i_1012_;
			}
		    } else if (i_1003_ == 3) {
			for (int i_1103_ = -i_1009_; i_1103_ < 0; i_1103_++) {
			    for (int i_1104_ = -i_1010_; i_1104_ < 0;
				 i_1104_++) {
				int i_1105_ = anIntArray11426[i_1008_++];
				int i_1106_ = i_1105_ + i_1004_;
				int i_1107_ = ((i_1105_ & 0xff00ff)
					       + (i_1004_ & 0xff00ff));
				int i_1108_
				    = ((i_1107_ & 0x1000100)
				       + (i_1106_ - i_1107_ & 0x10000));
				i_1105_
				    = i_1106_ - i_1108_ | i_1108_ - (i_1108_
								     >>> 8);
				i_1108_ = is[i_1007_];
				i_1106_ = i_1105_ + i_1108_;
				i_1107_ = (i_1105_ & 0xff00ff) + (i_1108_
								  & 0xff00ff);
				i_1108_ = ((i_1107_ & 0x1000100)
					   + (i_1106_ - i_1107_ & 0x10000));
				is[i_1007_++]
				    = i_1106_ - i_1108_ | i_1108_ - (i_1108_
								     >>> 8);
			    }
			    i_1007_ += i_1011_;
			    i_1008_ += i_1012_;
			}
		    } else if (i_1003_ == 2) {
			int i_1109_ = i_1004_ >>> 24;
			int i_1110_ = 256 - i_1109_;
			int i_1111_
			    = (i_1004_ & 0xff00ff) * i_1110_ & ~0xff00ff;
			int i_1112_ = (i_1004_ & 0xff00) * i_1110_ & 0xff0000;
			i_1004_ = (i_1111_ | i_1112_) >>> 8;
			for (int i_1113_ = -i_1009_; i_1113_ < 0; i_1113_++) {
			    for (int i_1114_ = -i_1010_; i_1114_ < 0;
				 i_1114_++) {
				int i_1115_ = anIntArray11426[i_1008_++];
				if (i_1115_ != 0) {
				    i_1111_ = ((i_1115_ & 0xff00ff) * i_1109_
					       & ~0xff00ff);
				    i_1112_ = ((i_1115_ & 0xff00) * i_1109_
					       & 0xff0000);
				    i_1115_ = (((i_1111_ | i_1112_) >>> 8)
					       + i_1004_);
				    int i_1116_ = is[i_1007_];
				    int i_1117_ = i_1115_ + i_1116_;
				    int i_1118_ = ((i_1115_ & 0xff00ff)
						   + (i_1116_ & 0xff00ff));
				    i_1116_
					= ((i_1118_ & 0x1000100)
					   + (i_1117_ - i_1118_ & 0x10000));
				    is[i_1007_++]
					= (i_1117_ - i_1116_
					   | i_1116_ - (i_1116_ >>> 8));
				} else
				    i_1007_++;
			    }
			    i_1007_ += i_1011_;
			    i_1008_ += i_1012_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    void method18027(int i, int i_1119_, int[] is, int i_1120_, int i_1121_) {
	if (i_1121_ == 0) {
	    if (i_1120_ == 1)
		is[i_1119_] = anIntArray11426[i];
	    else if (i_1120_ == 0) {
		int i_1122_ = anIntArray11426[i++];
		int i_1123_ = (i_1122_ & 0xff0000) * anInt9031 & ~0xffffff;
		int i_1124_ = (i_1122_ & 0xff00) * anInt9030 & 0xff0000;
		int i_1125_ = (i_1122_ & 0xff) * anInt9027 & 0xff00;
		is[i_1119_] = (i_1123_ | i_1124_ | i_1125_) >>> 8;
	    } else if (i_1120_ == 3) {
		int i_1126_ = anIntArray11426[i++];
		int i_1127_ = anInt9026;
		int i_1128_ = i_1126_ + i_1127_;
		int i_1129_ = (i_1126_ & 0xff00ff) + (i_1127_ & 0xff00ff);
		int i_1130_
		    = (i_1129_ & 0x1000100) + (i_1128_ - i_1129_ & 0x10000);
		is[i_1119_] = i_1128_ - i_1130_ | i_1130_ - (i_1130_ >>> 8);
	    } else if (i_1120_ == 2) {
		int i_1131_ = anIntArray11426[i];
		int i_1132_ = (i_1131_ & 0xff00ff) * anInt9007 & ~0xff00ff;
		int i_1133_ = (i_1131_ & 0xff00) * anInt9007 & 0xff0000;
		is[i_1119_] = ((i_1132_ | i_1133_) >>> 8) + anInt9034;
	    } else
		throw new IllegalArgumentException();
	} else if (i_1121_ == 1) {
	    if (i_1120_ == 1) {
		int i_1134_ = anIntArray11426[i];
		int i_1135_ = i_1134_ >>> 24;
		int i_1136_ = 256 - i_1135_;
		int i_1137_ = is[i_1119_];
		is[i_1119_] = ((((i_1134_ & 0xff00ff) * i_1135_
				 + (i_1137_ & 0xff00ff) * i_1136_)
				& ~0xff00ff)
			       + (((i_1134_ & 0xff00) * i_1135_
				   + (i_1137_ & 0xff00) * i_1136_)
				  & 0xff0000)) >> 8;
	    } else if (i_1120_ == 0) {
		int i_1138_ = anIntArray11426[i];
		int i_1139_ = (i_1138_ >>> 24) * anInt9007 >> 8;
		int i_1140_ = 256 - i_1139_;
		if ((anInt9026 & 0xffffff) == 16777215) {
		    int i_1141_ = is[i_1119_];
		    is[i_1119_] = ((((i_1138_ & 0xff00ff) * i_1139_
				     + (i_1141_ & 0xff00ff) * i_1140_)
				    & ~0xff00ff)
				   + (((i_1138_ & 0xff00) * i_1139_
				       + (i_1141_ & 0xff00) * i_1140_)
				      & 0xff0000)) >> 8;
		} else if (i_1139_ != 255) {
		    int i_1142_ = (i_1138_ & 0xff0000) * anInt9031 & ~0xffffff;
		    int i_1143_ = (i_1138_ & 0xff00) * anInt9030 & 0xff0000;
		    int i_1144_ = (i_1138_ & 0xff) * anInt9027 & 0xff00;
		    i_1138_ = (i_1142_ | i_1143_ | i_1144_) >>> 8;
		    int i_1145_ = is[i_1119_];
		    is[i_1119_] = ((((i_1138_ & 0xff00ff) * i_1139_
				     + (i_1145_ & 0xff00ff) * i_1140_)
				    & ~0xff00ff)
				   + (((i_1138_ & 0xff00) * i_1139_
				       + (i_1145_ & 0xff00) * i_1140_)
				      & 0xff0000)) >> 8;
		} else {
		    int i_1146_ = (i_1138_ & 0xff0000) * anInt9031 & ~0xffffff;
		    int i_1147_ = (i_1138_ & 0xff00) * anInt9030 & 0xff0000;
		    int i_1148_ = (i_1138_ & 0xff) * anInt9027 & 0xff00;
		    is[i_1119_] = (i_1146_ | i_1147_ | i_1148_) >>> 8;
		}
	    } else if (i_1120_ == 3) {
		int i_1149_ = anIntArray11426[i];
		int i_1150_ = anInt9026;
		int i_1151_ = i_1149_ + i_1150_;
		int i_1152_ = (i_1149_ & 0xff00ff) + (i_1150_ & 0xff00ff);
		int i_1153_
		    = (i_1152_ & 0x1000100) + (i_1151_ - i_1152_ & 0x10000);
		i_1153_ = i_1151_ - i_1153_ | i_1153_ - (i_1153_ >>> 8);
		int i_1154_ = (i_1149_ >>> 24) * anInt9007 >> 8;
		int i_1155_ = 256 - i_1154_;
		if (i_1154_ != 255) {
		    i_1149_ = i_1153_;
		    i_1153_ = is[i_1119_];
		    i_1153_ = ((((i_1149_ & 0xff00ff) * i_1154_
				 + (i_1153_ & 0xff00ff) * i_1155_)
				& ~0xff00ff)
			       + (((i_1149_ & 0xff00) * i_1154_
				   + (i_1153_ & 0xff00) * i_1155_)
				  & 0xff0000)) >> 8;
		}
		is[i_1119_] = i_1153_;
	    } else if (i_1120_ == 2) {
		int i_1156_ = anIntArray11426[i];
		int i_1157_ = i_1156_ >>> 24;
		int i_1158_ = 256 - i_1157_;
		int i_1159_ = (i_1156_ & 0xff00ff) * anInt9007 & ~0xff00ff;
		int i_1160_ = (i_1156_ & 0xff00) * anInt9007 & 0xff0000;
		i_1156_ = ((i_1159_ | i_1160_) >>> 8) + anInt9034;
		int i_1161_ = is[i_1119_];
		is[i_1119_] = ((((i_1156_ & 0xff00ff) * i_1157_
				 + (i_1161_ & 0xff00ff) * i_1158_)
				& ~0xff00ff)
			       + (((i_1156_ & 0xff00) * i_1157_
				   + (i_1161_ & 0xff00) * i_1158_)
				  & 0xff0000)) >> 8;
	    } else
		throw new IllegalArgumentException();
	} else if (i_1121_ == 2) {
	    if (i_1120_ == 1) {
		int i_1162_ = anIntArray11426[i];
		int i_1163_ = is[i_1119_];
		int i_1164_ = i_1162_ + i_1163_;
		int i_1165_ = (i_1162_ & 0xff00ff) + (i_1163_ & 0xff00ff);
		i_1163_
		    = (i_1165_ & 0x1000100) + (i_1164_ - i_1165_ & 0x10000);
		is[i_1119_] = i_1164_ - i_1163_ | i_1163_ - (i_1163_ >>> 8);
	    } else if (i_1120_ == 0) {
		int i_1166_ = anIntArray11426[i];
		int i_1167_ = (i_1166_ & 0xff0000) * anInt9031 & ~0xffffff;
		int i_1168_ = (i_1166_ & 0xff00) * anInt9030 & 0xff0000;
		int i_1169_ = (i_1166_ & 0xff) * anInt9027 & 0xff00;
		i_1166_ = (i_1167_ | i_1168_ | i_1169_) >>> 8;
		int i_1170_ = is[i_1119_];
		int i_1171_ = i_1166_ + i_1170_;
		int i_1172_ = (i_1166_ & 0xff00ff) + (i_1170_ & 0xff00ff);
		i_1170_
		    = (i_1172_ & 0x1000100) + (i_1171_ - i_1172_ & 0x10000);
		is[i_1119_] = i_1171_ - i_1170_ | i_1170_ - (i_1170_ >>> 8);
	    } else if (i_1120_ == 3) {
		int i_1173_ = anIntArray11426[i];
		int i_1174_ = anInt9026;
		int i_1175_ = i_1173_ + i_1174_;
		int i_1176_ = (i_1173_ & 0xff00ff) + (i_1174_ & 0xff00ff);
		int i_1177_
		    = (i_1176_ & 0x1000100) + (i_1175_ - i_1176_ & 0x10000);
		i_1173_ = i_1175_ - i_1177_ | i_1177_ - (i_1177_ >>> 8);
		i_1177_ = is[i_1119_];
		i_1175_ = i_1173_ + i_1177_;
		i_1176_ = (i_1173_ & 0xff00ff) + (i_1177_ & 0xff00ff);
		i_1177_
		    = (i_1176_ & 0x1000100) + (i_1175_ - i_1176_ & 0x10000);
		is[i_1119_] = i_1175_ - i_1177_ | i_1177_ - (i_1177_ >>> 8);
	    } else if (i_1120_ == 2) {
		int i_1178_ = anIntArray11426[i];
		int i_1179_ = (i_1178_ & 0xff00ff) * anInt9007 & ~0xff00ff;
		int i_1180_ = (i_1178_ & 0xff00) * anInt9007 & 0xff0000;
		i_1178_ = ((i_1179_ | i_1180_) >>> 8) + anInt9034;
		int i_1181_ = is[i_1119_];
		int i_1182_ = i_1178_ + i_1181_;
		int i_1183_ = (i_1178_ & 0xff00ff) + (i_1181_ & 0xff00ff);
		i_1181_
		    = (i_1183_ & 0x1000100) + (i_1182_ - i_1183_ & 0x10000);
		is[i_1119_] = i_1182_ - i_1181_ | i_1181_ - (i_1181_ >>> 8);
	    }
	} else
	    throw new IllegalArgumentException();
    }
    
    void method2470(int i, int i_1184_, int i_1185_, int i_1186_, int i_1187_,
		    int i_1188_, int i_1189_, int i_1190_) {
	if (aClass182_Sub2_9033.method15226())
	    throw new IllegalStateException();
	if (i_1185_ > 0 && i_1186_ > 0) {
	    int[] is = aClass182_Sub2_9033.anIntArray9466;
	    if (is != null) {
		int i_1191_ = 0;
		int i_1192_ = 0;
		int i_1193_ = aClass182_Sub2_9033.anInt9494 * -476035351;
		int i_1194_ = anInt9002 + anInt9000 + anInt9004;
		int i_1195_ = anInt9003 + anInt9001 + anInt9005;
		int i_1196_ = (i_1194_ << 16) / i_1185_;
		int i_1197_ = (i_1195_ << 16) / i_1186_;
		if (anInt9002 > 0) {
		    int i_1198_ = ((anInt9002 << 16) + i_1196_ - 1) / i_1196_;
		    i += i_1198_;
		    i_1191_ += i_1198_ * i_1196_ - (anInt9002 << 16);
		}
		if (anInt9003 > 0) {
		    int i_1199_ = ((anInt9003 << 16) + i_1197_ - 1) / i_1197_;
		    i_1184_ += i_1199_;
		    i_1192_ += i_1199_ * i_1197_ - (anInt9003 << 16);
		}
		if (anInt9000 < i_1194_)
		    i_1185_ = (((anInt9000 << 16) - i_1191_ + i_1196_ - 1)
			       / i_1196_);
		if (anInt9001 < i_1195_)
		    i_1186_ = (((anInt9001 << 16) - i_1192_ + i_1197_ - 1)
			       / i_1197_);
		int i_1200_ = i + i_1184_ * i_1193_;
		int i_1201_ = i_1193_ - i_1185_;
		if (i_1184_ + i_1186_
		    > aClass182_Sub2_9033.anInt9473 * 1920901985)
		    i_1186_ -= (i_1184_ + i_1186_
				- aClass182_Sub2_9033.anInt9473 * 1920901985);
		if (i_1184_ < aClass182_Sub2_9033.anInt9472 * 1722112305) {
		    int i_1202_
			= aClass182_Sub2_9033.anInt9472 * 1722112305 - i_1184_;
		    i_1186_ -= i_1202_;
		    i_1200_ += i_1202_ * i_1193_;
		    i_1192_ += i_1197_ * i_1202_;
		}
		if (i + i_1185_ > aClass182_Sub2_9033.anInt9499 * -466178451) {
		    int i_1203_
			= (i + i_1185_
			   - aClass182_Sub2_9033.anInt9499 * -466178451);
		    i_1185_ -= i_1203_;
		    i_1201_ += i_1203_;
		}
		if (i < aClass182_Sub2_9033.anInt9470 * 1988019027) {
		    int i_1204_
			= aClass182_Sub2_9033.anInt9470 * 1988019027 - i;
		    i_1185_ -= i_1204_;
		    i_1200_ += i_1204_;
		    i_1191_ += i_1196_ * i_1204_;
		    i_1201_ += i_1204_;
		}
		if (i_1189_ == 0) {
		    if (i_1187_ == 1) {
			int i_1205_ = i_1191_;
			for (int i_1206_ = -i_1186_; i_1206_ < 0; i_1206_++) {
			    int i_1207_ = (i_1192_ >> 16) * anInt9000;
			    for (int i_1208_ = -i_1185_; i_1208_ < 0;
				 i_1208_++) {
				is[i_1200_++] = (anIntArray11426
						 [(i_1191_ >> 16) + i_1207_]);
				i_1191_ += i_1196_;
			    }
			    i_1192_ += i_1197_;
			    i_1191_ = i_1205_;
			    i_1200_ += i_1201_;
			}
		    } else if (i_1187_ == 0) {
			int i_1209_ = (i_1188_ & 0xff0000) >> 16;
			int i_1210_ = (i_1188_ & 0xff00) >> 8;
			int i_1211_ = i_1188_ & 0xff;
			int i_1212_ = i_1191_;
			for (int i_1213_ = -i_1186_; i_1213_ < 0; i_1213_++) {
			    int i_1214_ = (i_1192_ >> 16) * anInt9000;
			    for (int i_1215_ = -i_1185_; i_1215_ < 0;
				 i_1215_++) {
				int i_1216_ = (anIntArray11426
					       [(i_1191_ >> 16) + i_1214_]);
				int i_1217_ = ((i_1216_ & 0xff0000) * i_1209_
					       & ~0xffffff);
				int i_1218_
				    = (i_1216_ & 0xff00) * i_1210_ & 0xff0000;
				int i_1219_
				    = (i_1216_ & 0xff) * i_1211_ & 0xff00;
				is[i_1200_++]
				    = (i_1217_ | i_1218_ | i_1219_) >>> 8;
				i_1191_ += i_1196_;
			    }
			    i_1192_ += i_1197_;
			    i_1191_ = i_1212_;
			    i_1200_ += i_1201_;
			}
		    } else if (i_1187_ == 3) {
			int i_1220_ = i_1191_;
			for (int i_1221_ = -i_1186_; i_1221_ < 0; i_1221_++) {
			    int i_1222_ = (i_1192_ >> 16) * anInt9000;
			    for (int i_1223_ = -i_1185_; i_1223_ < 0;
				 i_1223_++) {
				int i_1224_ = (anIntArray11426
					       [(i_1191_ >> 16) + i_1222_]);
				int i_1225_ = i_1224_ + i_1188_;
				int i_1226_ = ((i_1224_ & 0xff00ff)
					       + (i_1188_ & 0xff00ff));
				int i_1227_
				    = ((i_1226_ & 0x1000100)
				       + (i_1225_ - i_1226_ & 0x10000));
				is[i_1200_++]
				    = i_1225_ - i_1227_ | i_1227_ - (i_1227_
								     >>> 8);
				i_1191_ += i_1196_;
			    }
			    i_1192_ += i_1197_;
			    i_1191_ = i_1220_;
			    i_1200_ += i_1201_;
			}
		    } else if (i_1187_ == 2) {
			int i_1228_ = i_1188_ >>> 24;
			int i_1229_ = 256 - i_1228_;
			int i_1230_
			    = (i_1188_ & 0xff00ff) * i_1229_ & ~0xff00ff;
			int i_1231_ = (i_1188_ & 0xff00) * i_1229_ & 0xff0000;
			i_1188_ = (i_1230_ | i_1231_) >>> 8;
			int i_1232_ = i_1191_;
			for (int i_1233_ = -i_1186_; i_1233_ < 0; i_1233_++) {
			    int i_1234_ = (i_1192_ >> 16) * anInt9000;
			    for (int i_1235_ = -i_1185_; i_1235_ < 0;
				 i_1235_++) {
				int i_1236_ = (anIntArray11426
					       [(i_1191_ >> 16) + i_1234_]);
				i_1230_ = ((i_1236_ & 0xff00ff) * i_1228_
					   & ~0xff00ff);
				i_1231_
				    = (i_1236_ & 0xff00) * i_1228_ & 0xff0000;
				is[i_1200_++]
				    = ((i_1230_ | i_1231_) >>> 8) + i_1188_;
				i_1191_ += i_1196_;
			    }
			    i_1192_ += i_1197_;
			    i_1191_ = i_1232_;
			    i_1200_ += i_1201_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1189_ == 1) {
		    if (i_1187_ == 1) {
			int i_1237_ = i_1191_;
			for (int i_1238_ = -i_1186_; i_1238_ < 0; i_1238_++) {
			    int i_1239_ = (i_1192_ >> 16) * anInt9000;
			    for (int i_1240_ = -i_1185_; i_1240_ < 0;
				 i_1240_++) {
				int i_1241_ = (anIntArray11426
					       [(i_1191_ >> 16) + i_1239_]);
				int i_1242_ = i_1241_ >>> 24;
				int i_1243_ = 256 - i_1242_;
				int i_1244_ = is[i_1200_];
				is[i_1200_++]
				    = (((((i_1241_ & 0xff00ff) * i_1242_
					  + (i_1244_ & 0xff00ff) * i_1243_)
					 & ~0xff00ff)
					>> 8)
				       + (((((i_1241_ & ~0xff00ff) >>> 8)
					    * i_1242_)
					   + (((i_1244_ & ~0xff00ff) >>> 8)
					      * i_1243_))
					  & ~0xff00ff));
				i_1191_ += i_1196_;
			    }
			    i_1192_ += i_1197_;
			    i_1191_ = i_1237_;
			    i_1200_ += i_1201_;
			}
		    } else if (i_1187_ == 0) {
			int i_1245_ = i_1191_;
			if ((i_1188_ & 0xffffff) == 16777215) {
			    for (int i_1246_ = -i_1186_; i_1246_ < 0;
				 i_1246_++) {
				int i_1247_ = (i_1192_ >> 16) * anInt9000;
				for (int i_1248_ = -i_1185_; i_1248_ < 0;
				     i_1248_++) {
				    int i_1249_
					= (anIntArray11426
					   [(i_1191_ >> 16) + i_1247_]);
				    int i_1250_
					= ((i_1249_ >>> 24) * (i_1188_ >>> 24)
					   >> 8);
				    int i_1251_ = 256 - i_1250_;
				    int i_1252_ = is[i_1200_];
				    is[i_1200_++]
					= ((((i_1249_ & 0xff00ff) * i_1250_
					     + (i_1252_ & 0xff00ff) * i_1251_)
					    & ~0xff00ff)
					   + (((i_1249_ & 0xff00) * i_1250_
					       + (i_1252_ & 0xff00) * i_1251_)
					      & 0xff0000)) >> 8;
				    i_1191_ += i_1196_;
				}
				i_1192_ += i_1197_;
				i_1191_ = i_1245_;
				i_1200_ += i_1201_;
			    }
			} else {
			    int i_1253_ = (i_1188_ & 0xff0000) >> 16;
			    int i_1254_ = (i_1188_ & 0xff00) >> 8;
			    int i_1255_ = i_1188_ & 0xff;
			    for (int i_1256_ = -i_1186_; i_1256_ < 0;
				 i_1256_++) {
				int i_1257_ = (i_1192_ >> 16) * anInt9000;
				for (int i_1258_ = -i_1185_; i_1258_ < 0;
				     i_1258_++) {
				    int i_1259_
					= (anIntArray11426
					   [(i_1191_ >> 16) + i_1257_]);
				    int i_1260_
					= ((i_1259_ >>> 24) * (i_1188_ >>> 24)
					   >> 8);
				    int i_1261_ = 256 - i_1260_;
				    if (i_1260_ != 255) {
					int i_1262_
					    = ((i_1259_ & 0xff0000) * i_1253_
					       & ~0xffffff);
					int i_1263_
					    = ((i_1259_ & 0xff00) * i_1254_
					       & 0xff0000);
					int i_1264_
					    = ((i_1259_ & 0xff) * i_1255_
					       & 0xff00);
					i_1259_ = (i_1262_ | i_1263_
						   | i_1264_) >>> 8;
					int i_1265_ = is[i_1200_];
					is[i_1200_++]
					    = ((((i_1259_ & 0xff00ff) * i_1260_
						 + ((i_1265_ & 0xff00ff)
						    * i_1261_))
						& ~0xff00ff)
					       + (((i_1259_ & 0xff00) * i_1260_
						   + ((i_1265_ & 0xff00)
						      * i_1261_))
						  & 0xff0000)) >> 8;
				    } else {
					int i_1266_
					    = ((i_1259_ & 0xff0000) * i_1253_
					       & ~0xffffff);
					int i_1267_
					    = ((i_1259_ & 0xff00) * i_1254_
					       & 0xff0000);
					int i_1268_
					    = ((i_1259_ & 0xff) * i_1255_
					       & 0xff00);
					is[i_1200_++] = (i_1266_ | i_1267_
							 | i_1268_) >>> 8;
				    }
				    i_1191_ += i_1196_;
				}
				i_1192_ += i_1197_;
				i_1191_ = i_1245_;
				i_1200_ += i_1201_;
			    }
			}
		    } else if (i_1187_ == 3) {
			int i_1269_ = i_1191_;
			for (int i_1270_ = -i_1186_; i_1270_ < 0; i_1270_++) {
			    int i_1271_ = (i_1192_ >> 16) * anInt9000;
			    for (int i_1272_ = -i_1185_; i_1272_ < 0;
				 i_1272_++) {
				int i_1273_ = (anIntArray11426
					       [(i_1191_ >> 16) + i_1271_]);
				int i_1274_ = i_1273_ + i_1188_;
				int i_1275_ = ((i_1273_ & 0xff00ff)
					       + (i_1188_ & 0xff00ff));
				int i_1276_
				    = ((i_1275_ & 0x1000100)
				       + (i_1274_ - i_1275_ & 0x10000));
				i_1276_
				    = i_1274_ - i_1276_ | i_1276_ - (i_1276_
								     >>> 8);
				int i_1277_
				    = (i_1276_ >>> 24) * (i_1188_ >>> 24) >> 8;
				int i_1278_ = 256 - i_1277_;
				if (i_1277_ != 255) {
				    i_1273_ = i_1276_;
				    i_1276_ = is[i_1200_];
				    i_1276_
					= ((((i_1273_ & 0xff00ff) * i_1277_
					     + (i_1276_ & 0xff00ff) * i_1278_)
					    & ~0xff00ff)
					   + (((i_1273_ & 0xff00) * i_1277_
					       + (i_1276_ & 0xff00) * i_1278_)
					      & 0xff0000)) >> 8;
				}
				is[i_1200_++] = i_1276_;
				i_1191_ += i_1196_;
			    }
			    i_1192_ += i_1197_;
			    i_1191_ = i_1269_;
			    i_1200_ += i_1201_;
			}
		    } else if (i_1187_ == 2) {
			int i_1279_ = i_1188_ >>> 24;
			int i_1280_ = 256 - i_1279_;
			int i_1281_
			    = (i_1188_ & 0xff00ff) * i_1280_ & ~0xff00ff;
			int i_1282_ = (i_1188_ & 0xff00) * i_1280_ & 0xff0000;
			i_1188_ = (i_1281_ | i_1282_) >>> 8;
			int i_1283_ = i_1191_;
			for (int i_1284_ = -i_1186_; i_1284_ < 0; i_1284_++) {
			    int i_1285_ = (i_1192_ >> 16) * anInt9000;
			    for (int i_1286_ = -i_1185_; i_1286_ < 0;
				 i_1286_++) {
				int i_1287_ = (anIntArray11426
					       [(i_1191_ >> 16) + i_1285_]);
				int i_1288_ = i_1287_ >>> 24;
				int i_1289_ = 256 - i_1288_;
				i_1281_ = ((i_1287_ & 0xff00ff) * i_1279_
					   & ~0xff00ff);
				i_1282_
				    = (i_1287_ & 0xff00) * i_1279_ & 0xff0000;
				i_1287_
				    = ((i_1281_ | i_1282_) >>> 8) + i_1188_;
				int i_1290_ = is[i_1200_];
				is[i_1200_++]
				    = ((((i_1287_ & 0xff00ff) * i_1288_
					 + (i_1290_ & 0xff00ff) * i_1289_)
					& ~0xff00ff)
				       + (((i_1287_ & 0xff00) * i_1288_
					   + (i_1290_ & 0xff00) * i_1289_)
					  & 0xff0000)) >> 8;
				i_1191_ += i_1196_;
			    }
			    i_1192_ += i_1197_;
			    i_1191_ = i_1283_;
			    i_1200_ += i_1201_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1189_ == 2) {
		    if (i_1187_ == 1) {
			int i_1291_ = i_1191_;
			for (int i_1292_ = -i_1186_; i_1292_ < 0; i_1292_++) {
			    int i_1293_ = (i_1192_ >> 16) * anInt9000;
			    for (int i_1294_ = -i_1185_; i_1294_ < 0;
				 i_1294_++) {
				int i_1295_ = (anIntArray11426
					       [(i_1191_ >> 16) + i_1293_]);
				if (i_1295_ != 0) {
				    int i_1296_ = is[i_1200_];
				    int i_1297_ = i_1295_ + i_1296_;
				    int i_1298_ = ((i_1295_ & 0xff00ff)
						   + (i_1296_ & 0xff00ff));
				    i_1296_
					= ((i_1298_ & 0x1000100)
					   + (i_1297_ - i_1298_ & 0x10000));
				    is[i_1200_++]
					= (i_1297_ - i_1296_
					   | i_1296_ - (i_1296_ >>> 8));
				} else
				    i_1200_++;
				i_1191_ += i_1196_;
			    }
			    i_1192_ += i_1197_;
			    i_1191_ = i_1291_;
			    i_1200_ += i_1201_;
			}
		    } else if (i_1187_ == 0) {
			int i_1299_ = i_1191_;
			int i_1300_ = (i_1188_ & 0xff0000) >> 16;
			int i_1301_ = (i_1188_ & 0xff00) >> 8;
			int i_1302_ = i_1188_ & 0xff;
			for (int i_1303_ = -i_1186_; i_1303_ < 0; i_1303_++) {
			    int i_1304_ = (i_1192_ >> 16) * anInt9000;
			    for (int i_1305_ = -i_1185_; i_1305_ < 0;
				 i_1305_++) {
				int i_1306_ = (anIntArray11426
					       [(i_1191_ >> 16) + i_1304_]);
				if (i_1306_ != 0) {
				    int i_1307_
					= ((i_1306_ & 0xff0000) * i_1300_
					   & ~0xffffff);
				    int i_1308_ = ((i_1306_ & 0xff00) * i_1301_
						   & 0xff0000);
				    int i_1309_
					= (i_1306_ & 0xff) * i_1302_ & 0xff00;
				    i_1306_
					= (i_1307_ | i_1308_ | i_1309_) >>> 8;
				    int i_1310_ = is[i_1200_];
				    int i_1311_ = i_1306_ + i_1310_;
				    int i_1312_ = ((i_1306_ & 0xff00ff)
						   + (i_1310_ & 0xff00ff));
				    i_1310_
					= ((i_1312_ & 0x1000100)
					   + (i_1311_ - i_1312_ & 0x10000));
				    is[i_1200_++]
					= (i_1311_ - i_1310_
					   | i_1310_ - (i_1310_ >>> 8));
				} else
				    i_1200_++;
				i_1191_ += i_1196_;
			    }
			    i_1192_ += i_1197_;
			    i_1191_ = i_1299_;
			    i_1200_ += i_1201_;
			}
		    } else if (i_1187_ == 3) {
			int i_1313_ = i_1191_;
			for (int i_1314_ = -i_1186_; i_1314_ < 0; i_1314_++) {
			    int i_1315_ = (i_1192_ >> 16) * anInt9000;
			    for (int i_1316_ = -i_1185_; i_1316_ < 0;
				 i_1316_++) {
				int i_1317_ = (anIntArray11426
					       [(i_1191_ >> 16) + i_1315_]);
				int i_1318_ = i_1317_ + i_1188_;
				int i_1319_ = ((i_1317_ & 0xff00ff)
					       + (i_1188_ & 0xff00ff));
				int i_1320_
				    = ((i_1319_ & 0x1000100)
				       + (i_1318_ - i_1319_ & 0x10000));
				i_1317_
				    = i_1318_ - i_1320_ | i_1320_ - (i_1320_
								     >>> 8);
				i_1320_ = is[i_1200_];
				i_1318_ = i_1317_ + i_1320_;
				i_1319_ = (i_1317_ & 0xff00ff) + (i_1320_
								  & 0xff00ff);
				i_1320_ = ((i_1319_ & 0x1000100)
					   + (i_1318_ - i_1319_ & 0x10000));
				is[i_1200_++]
				    = i_1318_ - i_1320_ | i_1320_ - (i_1320_
								     >>> 8);
				i_1191_ += i_1196_;
			    }
			    i_1192_ += i_1197_;
			    i_1191_ = i_1313_;
			    i_1200_ += i_1201_;
			}
		    } else if (i_1187_ == 2) {
			int i_1321_ = i_1188_ >>> 24;
			int i_1322_ = 256 - i_1321_;
			int i_1323_
			    = (i_1188_ & 0xff00ff) * i_1322_ & ~0xff00ff;
			int i_1324_ = (i_1188_ & 0xff00) * i_1322_ & 0xff0000;
			i_1188_ = (i_1323_ | i_1324_) >>> 8;
			int i_1325_ = i_1191_;
			for (int i_1326_ = -i_1186_; i_1326_ < 0; i_1326_++) {
			    int i_1327_ = (i_1192_ >> 16) * anInt9000;
			    for (int i_1328_ = -i_1185_; i_1328_ < 0;
				 i_1328_++) {
				int i_1329_ = (anIntArray11426
					       [(i_1191_ >> 16) + i_1327_]);
				if (i_1329_ != 0) {
				    i_1323_ = ((i_1329_ & 0xff00ff) * i_1321_
					       & ~0xff00ff);
				    i_1324_ = ((i_1329_ & 0xff00) * i_1321_
					       & 0xff0000);
				    i_1329_ = (((i_1323_ | i_1324_) >>> 8)
					       + i_1188_);
				    int i_1330_ = is[i_1200_];
				    int i_1331_ = i_1329_ + i_1330_;
				    int i_1332_ = ((i_1329_ & 0xff00ff)
						   + (i_1330_ & 0xff00ff));
				    i_1330_
					= ((i_1332_ & 0x1000100)
					   + (i_1331_ - i_1332_ & 0x10000));
				    is[i_1200_++]
					= (i_1331_ - i_1330_
					   | i_1330_ - (i_1330_ >>> 8));
				} else
				    i_1200_++;
				i_1191_ += i_1196_;
			    }
			    i_1192_ += i_1197_;
			    i_1191_ = i_1325_;
			    i_1200_ += i_1201_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    void method2508(int i, int i_1333_, int i_1334_, int i_1335_, int i_1336_,
		    int i_1337_, int i_1338_, int i_1339_) {
	if (aClass182_Sub2_9033.method15226())
	    throw new IllegalStateException();
	if (i_1334_ > 0 && i_1335_ > 0) {
	    int[] is = aClass182_Sub2_9033.anIntArray9466;
	    if (is != null) {
		int i_1340_ = 0;
		int i_1341_ = 0;
		int i_1342_ = aClass182_Sub2_9033.anInt9494 * -476035351;
		int i_1343_ = anInt9002 + anInt9000 + anInt9004;
		int i_1344_ = anInt9003 + anInt9001 + anInt9005;
		int i_1345_ = (i_1343_ << 16) / i_1334_;
		int i_1346_ = (i_1344_ << 16) / i_1335_;
		if (anInt9002 > 0) {
		    int i_1347_ = ((anInt9002 << 16) + i_1345_ - 1) / i_1345_;
		    i += i_1347_;
		    i_1340_ += i_1347_ * i_1345_ - (anInt9002 << 16);
		}
		if (anInt9003 > 0) {
		    int i_1348_ = ((anInt9003 << 16) + i_1346_ - 1) / i_1346_;
		    i_1333_ += i_1348_;
		    i_1341_ += i_1348_ * i_1346_ - (anInt9003 << 16);
		}
		if (anInt9000 < i_1343_)
		    i_1334_ = (((anInt9000 << 16) - i_1340_ + i_1345_ - 1)
			       / i_1345_);
		if (anInt9001 < i_1344_)
		    i_1335_ = (((anInt9001 << 16) - i_1341_ + i_1346_ - 1)
			       / i_1346_);
		int i_1349_ = i + i_1333_ * i_1342_;
		int i_1350_ = i_1342_ - i_1334_;
		if (i_1333_ + i_1335_
		    > aClass182_Sub2_9033.anInt9473 * 1920901985)
		    i_1335_ -= (i_1333_ + i_1335_
				- aClass182_Sub2_9033.anInt9473 * 1920901985);
		if (i_1333_ < aClass182_Sub2_9033.anInt9472 * 1722112305) {
		    int i_1351_
			= aClass182_Sub2_9033.anInt9472 * 1722112305 - i_1333_;
		    i_1335_ -= i_1351_;
		    i_1349_ += i_1351_ * i_1342_;
		    i_1341_ += i_1346_ * i_1351_;
		}
		if (i + i_1334_ > aClass182_Sub2_9033.anInt9499 * -466178451) {
		    int i_1352_
			= (i + i_1334_
			   - aClass182_Sub2_9033.anInt9499 * -466178451);
		    i_1334_ -= i_1352_;
		    i_1350_ += i_1352_;
		}
		if (i < aClass182_Sub2_9033.anInt9470 * 1988019027) {
		    int i_1353_
			= aClass182_Sub2_9033.anInt9470 * 1988019027 - i;
		    i_1334_ -= i_1353_;
		    i_1349_ += i_1353_;
		    i_1340_ += i_1345_ * i_1353_;
		    i_1350_ += i_1353_;
		}
		if (i_1338_ == 0) {
		    if (i_1336_ == 1) {
			int i_1354_ = i_1340_;
			for (int i_1355_ = -i_1335_; i_1355_ < 0; i_1355_++) {
			    int i_1356_ = (i_1341_ >> 16) * anInt9000;
			    for (int i_1357_ = -i_1334_; i_1357_ < 0;
				 i_1357_++) {
				is[i_1349_++] = (anIntArray11426
						 [(i_1340_ >> 16) + i_1356_]);
				i_1340_ += i_1345_;
			    }
			    i_1341_ += i_1346_;
			    i_1340_ = i_1354_;
			    i_1349_ += i_1350_;
			}
		    } else if (i_1336_ == 0) {
			int i_1358_ = (i_1337_ & 0xff0000) >> 16;
			int i_1359_ = (i_1337_ & 0xff00) >> 8;
			int i_1360_ = i_1337_ & 0xff;
			int i_1361_ = i_1340_;
			for (int i_1362_ = -i_1335_; i_1362_ < 0; i_1362_++) {
			    int i_1363_ = (i_1341_ >> 16) * anInt9000;
			    for (int i_1364_ = -i_1334_; i_1364_ < 0;
				 i_1364_++) {
				int i_1365_ = (anIntArray11426
					       [(i_1340_ >> 16) + i_1363_]);
				int i_1366_ = ((i_1365_ & 0xff0000) * i_1358_
					       & ~0xffffff);
				int i_1367_
				    = (i_1365_ & 0xff00) * i_1359_ & 0xff0000;
				int i_1368_
				    = (i_1365_ & 0xff) * i_1360_ & 0xff00;
				is[i_1349_++]
				    = (i_1366_ | i_1367_ | i_1368_) >>> 8;
				i_1340_ += i_1345_;
			    }
			    i_1341_ += i_1346_;
			    i_1340_ = i_1361_;
			    i_1349_ += i_1350_;
			}
		    } else if (i_1336_ == 3) {
			int i_1369_ = i_1340_;
			for (int i_1370_ = -i_1335_; i_1370_ < 0; i_1370_++) {
			    int i_1371_ = (i_1341_ >> 16) * anInt9000;
			    for (int i_1372_ = -i_1334_; i_1372_ < 0;
				 i_1372_++) {
				int i_1373_ = (anIntArray11426
					       [(i_1340_ >> 16) + i_1371_]);
				int i_1374_ = i_1373_ + i_1337_;
				int i_1375_ = ((i_1373_ & 0xff00ff)
					       + (i_1337_ & 0xff00ff));
				int i_1376_
				    = ((i_1375_ & 0x1000100)
				       + (i_1374_ - i_1375_ & 0x10000));
				is[i_1349_++]
				    = i_1374_ - i_1376_ | i_1376_ - (i_1376_
								     >>> 8);
				i_1340_ += i_1345_;
			    }
			    i_1341_ += i_1346_;
			    i_1340_ = i_1369_;
			    i_1349_ += i_1350_;
			}
		    } else if (i_1336_ == 2) {
			int i_1377_ = i_1337_ >>> 24;
			int i_1378_ = 256 - i_1377_;
			int i_1379_
			    = (i_1337_ & 0xff00ff) * i_1378_ & ~0xff00ff;
			int i_1380_ = (i_1337_ & 0xff00) * i_1378_ & 0xff0000;
			i_1337_ = (i_1379_ | i_1380_) >>> 8;
			int i_1381_ = i_1340_;
			for (int i_1382_ = -i_1335_; i_1382_ < 0; i_1382_++) {
			    int i_1383_ = (i_1341_ >> 16) * anInt9000;
			    for (int i_1384_ = -i_1334_; i_1384_ < 0;
				 i_1384_++) {
				int i_1385_ = (anIntArray11426
					       [(i_1340_ >> 16) + i_1383_]);
				i_1379_ = ((i_1385_ & 0xff00ff) * i_1377_
					   & ~0xff00ff);
				i_1380_
				    = (i_1385_ & 0xff00) * i_1377_ & 0xff0000;
				is[i_1349_++]
				    = ((i_1379_ | i_1380_) >>> 8) + i_1337_;
				i_1340_ += i_1345_;
			    }
			    i_1341_ += i_1346_;
			    i_1340_ = i_1381_;
			    i_1349_ += i_1350_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1338_ == 1) {
		    if (i_1336_ == 1) {
			int i_1386_ = i_1340_;
			for (int i_1387_ = -i_1335_; i_1387_ < 0; i_1387_++) {
			    int i_1388_ = (i_1341_ >> 16) * anInt9000;
			    for (int i_1389_ = -i_1334_; i_1389_ < 0;
				 i_1389_++) {
				int i_1390_ = (anIntArray11426
					       [(i_1340_ >> 16) + i_1388_]);
				int i_1391_ = i_1390_ >>> 24;
				int i_1392_ = 256 - i_1391_;
				int i_1393_ = is[i_1349_];
				is[i_1349_++]
				    = (((((i_1390_ & 0xff00ff) * i_1391_
					  + (i_1393_ & 0xff00ff) * i_1392_)
					 & ~0xff00ff)
					>> 8)
				       + (((((i_1390_ & ~0xff00ff) >>> 8)
					    * i_1391_)
					   + (((i_1393_ & ~0xff00ff) >>> 8)
					      * i_1392_))
					  & ~0xff00ff));
				i_1340_ += i_1345_;
			    }
			    i_1341_ += i_1346_;
			    i_1340_ = i_1386_;
			    i_1349_ += i_1350_;
			}
		    } else if (i_1336_ == 0) {
			int i_1394_ = i_1340_;
			if ((i_1337_ & 0xffffff) == 16777215) {
			    for (int i_1395_ = -i_1335_; i_1395_ < 0;
				 i_1395_++) {
				int i_1396_ = (i_1341_ >> 16) * anInt9000;
				for (int i_1397_ = -i_1334_; i_1397_ < 0;
				     i_1397_++) {
				    int i_1398_
					= (anIntArray11426
					   [(i_1340_ >> 16) + i_1396_]);
				    int i_1399_
					= ((i_1398_ >>> 24) * (i_1337_ >>> 24)
					   >> 8);
				    int i_1400_ = 256 - i_1399_;
				    int i_1401_ = is[i_1349_];
				    is[i_1349_++]
					= ((((i_1398_ & 0xff00ff) * i_1399_
					     + (i_1401_ & 0xff00ff) * i_1400_)
					    & ~0xff00ff)
					   + (((i_1398_ & 0xff00) * i_1399_
					       + (i_1401_ & 0xff00) * i_1400_)
					      & 0xff0000)) >> 8;
				    i_1340_ += i_1345_;
				}
				i_1341_ += i_1346_;
				i_1340_ = i_1394_;
				i_1349_ += i_1350_;
			    }
			} else {
			    int i_1402_ = (i_1337_ & 0xff0000) >> 16;
			    int i_1403_ = (i_1337_ & 0xff00) >> 8;
			    int i_1404_ = i_1337_ & 0xff;
			    for (int i_1405_ = -i_1335_; i_1405_ < 0;
				 i_1405_++) {
				int i_1406_ = (i_1341_ >> 16) * anInt9000;
				for (int i_1407_ = -i_1334_; i_1407_ < 0;
				     i_1407_++) {
				    int i_1408_
					= (anIntArray11426
					   [(i_1340_ >> 16) + i_1406_]);
				    int i_1409_
					= ((i_1408_ >>> 24) * (i_1337_ >>> 24)
					   >> 8);
				    int i_1410_ = 256 - i_1409_;
				    if (i_1409_ != 255) {
					int i_1411_
					    = ((i_1408_ & 0xff0000) * i_1402_
					       & ~0xffffff);
					int i_1412_
					    = ((i_1408_ & 0xff00) * i_1403_
					       & 0xff0000);
					int i_1413_
					    = ((i_1408_ & 0xff) * i_1404_
					       & 0xff00);
					i_1408_ = (i_1411_ | i_1412_
						   | i_1413_) >>> 8;
					int i_1414_ = is[i_1349_];
					is[i_1349_++]
					    = ((((i_1408_ & 0xff00ff) * i_1409_
						 + ((i_1414_ & 0xff00ff)
						    * i_1410_))
						& ~0xff00ff)
					       + (((i_1408_ & 0xff00) * i_1409_
						   + ((i_1414_ & 0xff00)
						      * i_1410_))
						  & 0xff0000)) >> 8;
				    } else {
					int i_1415_
					    = ((i_1408_ & 0xff0000) * i_1402_
					       & ~0xffffff);
					int i_1416_
					    = ((i_1408_ & 0xff00) * i_1403_
					       & 0xff0000);
					int i_1417_
					    = ((i_1408_ & 0xff) * i_1404_
					       & 0xff00);
					is[i_1349_++] = (i_1415_ | i_1416_
							 | i_1417_) >>> 8;
				    }
				    i_1340_ += i_1345_;
				}
				i_1341_ += i_1346_;
				i_1340_ = i_1394_;
				i_1349_ += i_1350_;
			    }
			}
		    } else if (i_1336_ == 3) {
			int i_1418_ = i_1340_;
			for (int i_1419_ = -i_1335_; i_1419_ < 0; i_1419_++) {
			    int i_1420_ = (i_1341_ >> 16) * anInt9000;
			    for (int i_1421_ = -i_1334_; i_1421_ < 0;
				 i_1421_++) {
				int i_1422_ = (anIntArray11426
					       [(i_1340_ >> 16) + i_1420_]);
				int i_1423_ = i_1422_ + i_1337_;
				int i_1424_ = ((i_1422_ & 0xff00ff)
					       + (i_1337_ & 0xff00ff));
				int i_1425_
				    = ((i_1424_ & 0x1000100)
				       + (i_1423_ - i_1424_ & 0x10000));
				i_1425_
				    = i_1423_ - i_1425_ | i_1425_ - (i_1425_
								     >>> 8);
				int i_1426_
				    = (i_1425_ >>> 24) * (i_1337_ >>> 24) >> 8;
				int i_1427_ = 256 - i_1426_;
				if (i_1426_ != 255) {
				    i_1422_ = i_1425_;
				    i_1425_ = is[i_1349_];
				    i_1425_
					= ((((i_1422_ & 0xff00ff) * i_1426_
					     + (i_1425_ & 0xff00ff) * i_1427_)
					    & ~0xff00ff)
					   + (((i_1422_ & 0xff00) * i_1426_
					       + (i_1425_ & 0xff00) * i_1427_)
					      & 0xff0000)) >> 8;
				}
				is[i_1349_++] = i_1425_;
				i_1340_ += i_1345_;
			    }
			    i_1341_ += i_1346_;
			    i_1340_ = i_1418_;
			    i_1349_ += i_1350_;
			}
		    } else if (i_1336_ == 2) {
			int i_1428_ = i_1337_ >>> 24;
			int i_1429_ = 256 - i_1428_;
			int i_1430_
			    = (i_1337_ & 0xff00ff) * i_1429_ & ~0xff00ff;
			int i_1431_ = (i_1337_ & 0xff00) * i_1429_ & 0xff0000;
			i_1337_ = (i_1430_ | i_1431_) >>> 8;
			int i_1432_ = i_1340_;
			for (int i_1433_ = -i_1335_; i_1433_ < 0; i_1433_++) {
			    int i_1434_ = (i_1341_ >> 16) * anInt9000;
			    for (int i_1435_ = -i_1334_; i_1435_ < 0;
				 i_1435_++) {
				int i_1436_ = (anIntArray11426
					       [(i_1340_ >> 16) + i_1434_]);
				int i_1437_ = i_1436_ >>> 24;
				int i_1438_ = 256 - i_1437_;
				i_1430_ = ((i_1436_ & 0xff00ff) * i_1428_
					   & ~0xff00ff);
				i_1431_
				    = (i_1436_ & 0xff00) * i_1428_ & 0xff0000;
				i_1436_
				    = ((i_1430_ | i_1431_) >>> 8) + i_1337_;
				int i_1439_ = is[i_1349_];
				is[i_1349_++]
				    = ((((i_1436_ & 0xff00ff) * i_1437_
					 + (i_1439_ & 0xff00ff) * i_1438_)
					& ~0xff00ff)
				       + (((i_1436_ & 0xff00) * i_1437_
					   + (i_1439_ & 0xff00) * i_1438_)
					  & 0xff0000)) >> 8;
				i_1340_ += i_1345_;
			    }
			    i_1341_ += i_1346_;
			    i_1340_ = i_1432_;
			    i_1349_ += i_1350_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1338_ == 2) {
		    if (i_1336_ == 1) {
			int i_1440_ = i_1340_;
			for (int i_1441_ = -i_1335_; i_1441_ < 0; i_1441_++) {
			    int i_1442_ = (i_1341_ >> 16) * anInt9000;
			    for (int i_1443_ = -i_1334_; i_1443_ < 0;
				 i_1443_++) {
				int i_1444_ = (anIntArray11426
					       [(i_1340_ >> 16) + i_1442_]);
				if (i_1444_ != 0) {
				    int i_1445_ = is[i_1349_];
				    int i_1446_ = i_1444_ + i_1445_;
				    int i_1447_ = ((i_1444_ & 0xff00ff)
						   + (i_1445_ & 0xff00ff));
				    i_1445_
					= ((i_1447_ & 0x1000100)
					   + (i_1446_ - i_1447_ & 0x10000));
				    is[i_1349_++]
					= (i_1446_ - i_1445_
					   | i_1445_ - (i_1445_ >>> 8));
				} else
				    i_1349_++;
				i_1340_ += i_1345_;
			    }
			    i_1341_ += i_1346_;
			    i_1340_ = i_1440_;
			    i_1349_ += i_1350_;
			}
		    } else if (i_1336_ == 0) {
			int i_1448_ = i_1340_;
			int i_1449_ = (i_1337_ & 0xff0000) >> 16;
			int i_1450_ = (i_1337_ & 0xff00) >> 8;
			int i_1451_ = i_1337_ & 0xff;
			for (int i_1452_ = -i_1335_; i_1452_ < 0; i_1452_++) {
			    int i_1453_ = (i_1341_ >> 16) * anInt9000;
			    for (int i_1454_ = -i_1334_; i_1454_ < 0;
				 i_1454_++) {
				int i_1455_ = (anIntArray11426
					       [(i_1340_ >> 16) + i_1453_]);
				if (i_1455_ != 0) {
				    int i_1456_
					= ((i_1455_ & 0xff0000) * i_1449_
					   & ~0xffffff);
				    int i_1457_ = ((i_1455_ & 0xff00) * i_1450_
						   & 0xff0000);
				    int i_1458_
					= (i_1455_ & 0xff) * i_1451_ & 0xff00;
				    i_1455_
					= (i_1456_ | i_1457_ | i_1458_) >>> 8;
				    int i_1459_ = is[i_1349_];
				    int i_1460_ = i_1455_ + i_1459_;
				    int i_1461_ = ((i_1455_ & 0xff00ff)
						   + (i_1459_ & 0xff00ff));
				    i_1459_
					= ((i_1461_ & 0x1000100)
					   + (i_1460_ - i_1461_ & 0x10000));
				    is[i_1349_++]
					= (i_1460_ - i_1459_
					   | i_1459_ - (i_1459_ >>> 8));
				} else
				    i_1349_++;
				i_1340_ += i_1345_;
			    }
			    i_1341_ += i_1346_;
			    i_1340_ = i_1448_;
			    i_1349_ += i_1350_;
			}
		    } else if (i_1336_ == 3) {
			int i_1462_ = i_1340_;
			for (int i_1463_ = -i_1335_; i_1463_ < 0; i_1463_++) {
			    int i_1464_ = (i_1341_ >> 16) * anInt9000;
			    for (int i_1465_ = -i_1334_; i_1465_ < 0;
				 i_1465_++) {
				int i_1466_ = (anIntArray11426
					       [(i_1340_ >> 16) + i_1464_]);
				int i_1467_ = i_1466_ + i_1337_;
				int i_1468_ = ((i_1466_ & 0xff00ff)
					       + (i_1337_ & 0xff00ff));
				int i_1469_
				    = ((i_1468_ & 0x1000100)
				       + (i_1467_ - i_1468_ & 0x10000));
				i_1466_
				    = i_1467_ - i_1469_ | i_1469_ - (i_1469_
								     >>> 8);
				i_1469_ = is[i_1349_];
				i_1467_ = i_1466_ + i_1469_;
				i_1468_ = (i_1466_ & 0xff00ff) + (i_1469_
								  & 0xff00ff);
				i_1469_ = ((i_1468_ & 0x1000100)
					   + (i_1467_ - i_1468_ & 0x10000));
				is[i_1349_++]
				    = i_1467_ - i_1469_ | i_1469_ - (i_1469_
								     >>> 8);
				i_1340_ += i_1345_;
			    }
			    i_1341_ += i_1346_;
			    i_1340_ = i_1462_;
			    i_1349_ += i_1350_;
			}
		    } else if (i_1336_ == 2) {
			int i_1470_ = i_1337_ >>> 24;
			int i_1471_ = 256 - i_1470_;
			int i_1472_
			    = (i_1337_ & 0xff00ff) * i_1471_ & ~0xff00ff;
			int i_1473_ = (i_1337_ & 0xff00) * i_1471_ & 0xff0000;
			i_1337_ = (i_1472_ | i_1473_) >>> 8;
			int i_1474_ = i_1340_;
			for (int i_1475_ = -i_1335_; i_1475_ < 0; i_1475_++) {
			    int i_1476_ = (i_1341_ >> 16) * anInt9000;
			    for (int i_1477_ = -i_1334_; i_1477_ < 0;
				 i_1477_++) {
				int i_1478_ = (anIntArray11426
					       [(i_1340_ >> 16) + i_1476_]);
				if (i_1478_ != 0) {
				    i_1472_ = ((i_1478_ & 0xff00ff) * i_1470_
					       & ~0xff00ff);
				    i_1473_ = ((i_1478_ & 0xff00) * i_1470_
					       & 0xff0000);
				    i_1478_ = (((i_1472_ | i_1473_) >>> 8)
					       + i_1337_);
				    int i_1479_ = is[i_1349_];
				    int i_1480_ = i_1478_ + i_1479_;
				    int i_1481_ = ((i_1478_ & 0xff00ff)
						   + (i_1479_ & 0xff00ff));
				    i_1479_
					= ((i_1481_ & 0x1000100)
					   + (i_1480_ - i_1481_ & 0x10000));
				    is[i_1349_++]
					= (i_1480_ - i_1479_
					   | i_1479_ - (i_1479_ >>> 8));
				} else
				    i_1349_++;
				i_1340_ += i_1345_;
			    }
			    i_1341_ += i_1346_;
			    i_1340_ = i_1474_;
			    i_1349_ += i_1350_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    void method14542(int[] is, int[] is_1482_, int i, int i_1483_) {
	int[] is_1484_ = aClass182_Sub2_9033.anIntArray9466;
	if (is_1484_ != null) {
	    if (anInt9006 == 0) {
		if (anInt9017 == 0) {
		    int i_1485_ = anInt9023;
		    while (i_1485_ < 0) {
			int i_1486_ = i_1485_ + i_1483_;
			if (i_1486_ >= 0) {
			    if (i_1486_ >= is.length)
				break;
			    int i_1487_ = anInt9015;
			    int i_1488_ = anInt9022;
			    int i_1489_ = anInt8999;
			    int i_1490_ = anInt9011;
			    if (i_1488_ >= 0 && i_1489_ >= 0
				&& i_1488_ - (anInt9000 << 12) < 0
				&& i_1489_ - (anInt9001 << 12) < 0) {
				int i_1491_ = is[i_1486_] - i;
				int i_1492_ = -is_1482_[i_1486_];
				int i_1493_ = i_1491_ - (i_1487_ - anInt9015);
				if (i_1493_ > 0) {
				    i_1487_ += i_1493_;
				    i_1490_ += i_1493_;
				    i_1488_ += anInt9006 * i_1493_;
				    i_1489_ += anInt9017 * i_1493_;
				} else
				    i_1492_ -= i_1493_;
				if (i_1490_ < i_1492_)
				    i_1490_ = i_1492_;
				for (/**/; i_1490_ < 0; i_1490_++) {
				    int i_1494_
					= (anIntArray11426
					   [((i_1489_ >> 12) * anInt9000
					     + (i_1488_ >> 12))]);
				    int i_1495_ = i_1494_ >>> 24;
				    int i_1496_ = 256 - i_1495_;
				    int i_1497_ = is_1484_[i_1487_];
				    is_1484_[i_1487_++]
					= ((((i_1494_ & 0xff00ff) * i_1495_
					     + (i_1497_ & 0xff00ff) * i_1496_)
					    & ~0xff00ff)
					   + (((i_1494_ & 0xff00) * i_1495_
					       + (i_1497_ & 0xff00) * i_1496_)
					      & 0xff0000)) >> 8;
				}
			    }
			}
			i_1485_++;
			anInt9015 += anInt9014;
		    }
		} else if (anInt9017 < 0) {
		    int i_1498_ = anInt9023;
		    while (i_1498_ < 0) {
			int i_1499_ = i_1498_ + i_1483_;
			if (i_1499_ >= 0) {
			    if (i_1499_ >= is.length)
				break;
			    int i_1500_ = anInt9015;
			    int i_1501_ = anInt9022;
			    int i_1502_ = anInt8999 + anInt9025;
			    int i_1503_ = anInt9011;
			    if (i_1501_ >= 0
				&& i_1501_ - (anInt9000 << 12) < 0) {
				int i_1504_;
				if ((i_1504_ = i_1502_ - (anInt9001 << 12))
				    >= 0) {
				    i_1504_
					= (anInt9017 - i_1504_) / anInt9017;
				    i_1503_ += i_1504_;
				    i_1502_ += anInt9017 * i_1504_;
				    i_1500_ += i_1504_;
				}
				if ((i_1504_
				     = (i_1502_ - anInt9017) / anInt9017)
				    > i_1503_)
				    i_1503_ = i_1504_;
				int i_1505_ = is[i_1499_] - i;
				int i_1506_ = -is_1482_[i_1499_];
				int i_1507_ = i_1505_ - (i_1500_ - anInt9015);
				if (i_1507_ > 0) {
				    i_1500_ += i_1507_;
				    i_1503_ += i_1507_;
				    i_1501_ += anInt9006 * i_1507_;
				    i_1502_ += anInt9017 * i_1507_;
				} else
				    i_1506_ -= i_1507_;
				if (i_1503_ < i_1506_)
				    i_1503_ = i_1506_;
				for (/**/; i_1503_ < 0; i_1503_++) {
				    int i_1508_
					= (anIntArray11426
					   [((i_1502_ >> 12) * anInt9000
					     + (i_1501_ >> 12))]);
				    int i_1509_ = i_1508_ >>> 24;
				    int i_1510_ = 256 - i_1509_;
				    int i_1511_ = is_1484_[i_1500_];
				    is_1484_[i_1500_++]
					= ((((i_1508_ & 0xff00ff) * i_1509_
					     + (i_1511_ & 0xff00ff) * i_1510_)
					    & ~0xff00ff)
					   + (((i_1508_ & 0xff00) * i_1509_
					       + (i_1511_ & 0xff00) * i_1510_)
					      & 0xff0000)) >> 8;
				    i_1502_ += anInt9017;
				}
			    }
			}
			i_1498_++;
			anInt9022 += anInt9018;
			anInt9015 += anInt9014;
		    }
		} else {
		    int i_1512_ = anInt9023;
		    while (i_1512_ < 0) {
			int i_1513_ = i_1512_ + i_1483_;
			if (i_1513_ >= 0) {
			    if (i_1513_ >= is.length)
				break;
			    int i_1514_ = anInt9015;
			    int i_1515_ = anInt9022;
			    int i_1516_ = anInt8999 + anInt9025;
			    int i_1517_ = anInt9011;
			    if (i_1515_ >= 0
				&& i_1515_ - (anInt9000 << 12) < 0) {
				if (i_1516_ < 0) {
				    int i_1518_ = ((anInt9017 - 1 - i_1516_)
						   / anInt9017);
				    i_1517_ += i_1518_;
				    i_1516_ += anInt9017 * i_1518_;
				    i_1514_ += i_1518_;
				}
				int i_1519_;
				if ((i_1519_ = (1 + i_1516_ - (anInt9001 << 12)
						- anInt9017) / anInt9017)
				    > i_1517_)
				    i_1517_ = i_1519_;
				int i_1520_ = is[i_1513_] - i;
				int i_1521_ = -is_1482_[i_1513_];
				int i_1522_ = i_1520_ - (i_1514_ - anInt9015);
				if (i_1522_ > 0) {
				    i_1514_ += i_1522_;
				    i_1517_ += i_1522_;
				    i_1515_ += anInt9006 * i_1522_;
				    i_1516_ += anInt9017 * i_1522_;
				} else
				    i_1521_ -= i_1522_;
				if (i_1517_ < i_1521_)
				    i_1517_ = i_1521_;
				for (/**/; i_1517_ < 0; i_1517_++) {
				    int i_1523_
					= (anIntArray11426
					   [((i_1516_ >> 12) * anInt9000
					     + (i_1515_ >> 12))]);
				    int i_1524_ = i_1523_ >>> 24;
				    int i_1525_ = 256 - i_1524_;
				    int i_1526_ = is_1484_[i_1514_];
				    is_1484_[i_1514_++]
					= ((((i_1523_ & 0xff00ff) * i_1524_
					     + (i_1526_ & 0xff00ff) * i_1525_)
					    & ~0xff00ff)
					   + (((i_1523_ & 0xff00) * i_1524_
					       + (i_1526_ & 0xff00) * i_1525_)
					      & 0xff0000)) >> 8;
				    i_1516_ += anInt9017;
				}
			    }
			}
			i_1512_++;
			anInt9022 += anInt9018;
			anInt9015 += anInt9014;
		    }
		}
	    } else if (anInt9006 < 0) {
		if (anInt9017 == 0) {
		    int i_1527_ = anInt9023;
		    while (i_1527_ < 0) {
			int i_1528_ = i_1527_ + i_1483_;
			if (i_1528_ >= 0) {
			    if (i_1528_ >= is.length)
				break;
			    int i_1529_ = anInt9015;
			    int i_1530_ = anInt9022 + anInt9024;
			    int i_1531_ = anInt8999;
			    int i_1532_ = anInt9011;
			    if (i_1531_ >= 0
				&& i_1531_ - (anInt9001 << 12) < 0) {
				int i_1533_;
				if ((i_1533_ = i_1530_ - (anInt9000 << 12))
				    >= 0) {
				    i_1533_
					= (anInt9006 - i_1533_) / anInt9006;
				    i_1532_ += i_1533_;
				    i_1530_ += anInt9006 * i_1533_;
				    i_1529_ += i_1533_;
				}
				if ((i_1533_
				     = (i_1530_ - anInt9006) / anInt9006)
				    > i_1532_)
				    i_1532_ = i_1533_;
				int i_1534_ = is[i_1528_] - i;
				int i_1535_ = -is_1482_[i_1528_];
				int i_1536_ = i_1534_ - (i_1529_ - anInt9015);
				if (i_1536_ > 0) {
				    i_1529_ += i_1536_;
				    i_1532_ += i_1536_;
				    i_1530_ += anInt9006 * i_1536_;
				    i_1531_ += anInt9017 * i_1536_;
				} else
				    i_1535_ -= i_1536_;
				if (i_1532_ < i_1535_)
				    i_1532_ = i_1535_;
				for (/**/; i_1532_ < 0; i_1532_++) {
				    int i_1537_
					= (anIntArray11426
					   [((i_1531_ >> 12) * anInt9000
					     + (i_1530_ >> 12))]);
				    int i_1538_ = i_1537_ >>> 24;
				    int i_1539_ = 256 - i_1538_;
				    int i_1540_ = is_1484_[i_1529_];
				    is_1484_[i_1529_++]
					= ((((i_1537_ & 0xff00ff) * i_1538_
					     + (i_1540_ & 0xff00ff) * i_1539_)
					    & ~0xff00ff)
					   + (((i_1537_ & 0xff00) * i_1538_
					       + (i_1540_ & 0xff00) * i_1539_)
					      & 0xff0000)) >> 8;
				    i_1530_ += anInt9006;
				}
			    }
			}
			i_1527_++;
			anInt8999 += anInt9010;
			anInt9015 += anInt9014;
		    }
		} else if (anInt9017 < 0) {
		    int i_1541_ = anInt9023;
		    while (i_1541_ < 0) {
			int i_1542_ = i_1541_ + i_1483_;
			if (i_1542_ >= 0) {
			    if (i_1542_ >= is.length)
				break;
			    int i_1543_ = anInt9015;
			    int i_1544_ = anInt9022 + anInt9024;
			    int i_1545_ = anInt8999 + anInt9025;
			    int i_1546_ = anInt9011;
			    int i_1547_;
			    if ((i_1547_ = i_1544_ - (anInt9000 << 12)) >= 0) {
				i_1547_ = (anInt9006 - i_1547_) / anInt9006;
				i_1546_ += i_1547_;
				i_1544_ += anInt9006 * i_1547_;
				i_1545_ += anInt9017 * i_1547_;
				i_1543_ += i_1547_;
			    }
			    if ((i_1547_ = (i_1544_ - anInt9006) / anInt9006)
				> i_1546_)
				i_1546_ = i_1547_;
			    if ((i_1547_ = i_1545_ - (anInt9001 << 12)) >= 0) {
				i_1547_ = (anInt9017 - i_1547_) / anInt9017;
				i_1546_ += i_1547_;
				i_1544_ += anInt9006 * i_1547_;
				i_1545_ += anInt9017 * i_1547_;
				i_1543_ += i_1547_;
			    }
			    if ((i_1547_ = (i_1545_ - anInt9017) / anInt9017)
				> i_1546_)
				i_1546_ = i_1547_;
			    int i_1548_ = is[i_1542_] - i;
			    int i_1549_ = -is_1482_[i_1542_];
			    int i_1550_ = i_1548_ - (i_1543_ - anInt9015);
			    if (i_1550_ > 0) {
				i_1543_ += i_1550_;
				i_1546_ += i_1550_;
				i_1544_ += anInt9006 * i_1550_;
				i_1545_ += anInt9017 * i_1550_;
			    } else
				i_1549_ -= i_1550_;
			    if (i_1546_ < i_1549_)
				i_1546_ = i_1549_;
			    for (/**/; i_1546_ < 0; i_1546_++) {
				int i_1551_ = (anIntArray11426
					       [((i_1545_ >> 12) * anInt9000
						 + (i_1544_ >> 12))]);
				int i_1552_ = i_1551_ >>> 24;
				int i_1553_ = 256 - i_1552_;
				int i_1554_ = is_1484_[i_1543_];
				is_1484_[i_1543_++]
				    = ((((i_1551_ & 0xff00ff) * i_1552_
					 + (i_1554_ & 0xff00ff) * i_1553_)
					& ~0xff00ff)
				       + (((i_1551_ & 0xff00) * i_1552_
					   + (i_1554_ & 0xff00) * i_1553_)
					  & 0xff0000)) >> 8;
				i_1544_ += anInt9006;
				i_1545_ += anInt9017;
			    }
			}
			i_1541_++;
			anInt9022 += anInt9018;
			anInt8999 += anInt9010;
			anInt9015 += anInt9014;
		    }
		} else {
		    int i_1555_ = anInt9023;
		    while (i_1555_ < 0) {
			int i_1556_ = i_1555_ + i_1483_;
			if (i_1556_ >= 0) {
			    if (i_1556_ >= is.length)
				break;
			    int i_1557_ = anInt9015;
			    int i_1558_ = anInt9022 + anInt9024;
			    int i_1559_ = anInt8999 + anInt9025;
			    int i_1560_ = anInt9011;
			    int i_1561_;
			    if ((i_1561_ = i_1558_ - (anInt9000 << 12)) >= 0) {
				i_1561_ = (anInt9006 - i_1561_) / anInt9006;
				i_1560_ += i_1561_;
				i_1558_ += anInt9006 * i_1561_;
				i_1559_ += anInt9017 * i_1561_;
				i_1557_ += i_1561_;
			    }
			    if ((i_1561_ = (i_1558_ - anInt9006) / anInt9006)
				> i_1560_)
				i_1560_ = i_1561_;
			    if (i_1559_ < 0) {
				i_1561_
				    = (anInt9017 - 1 - i_1559_) / anInt9017;
				i_1560_ += i_1561_;
				i_1558_ += anInt9006 * i_1561_;
				i_1559_ += anInt9017 * i_1561_;
				i_1557_ += i_1561_;
			    }
			    if ((i_1561_ = (1 + i_1559_ - (anInt9001 << 12)
					    - anInt9017) / anInt9017)
				> i_1560_)
				i_1560_ = i_1561_;
			    int i_1562_ = is[i_1556_] - i;
			    int i_1563_ = -is_1482_[i_1556_];
			    int i_1564_ = i_1562_ - (i_1557_ - anInt9015);
			    if (i_1564_ > 0) {
				i_1557_ += i_1564_;
				i_1560_ += i_1564_;
				i_1558_ += anInt9006 * i_1564_;
				i_1559_ += anInt9017 * i_1564_;
			    } else
				i_1563_ -= i_1564_;
			    if (i_1560_ < i_1563_)
				i_1560_ = i_1563_;
			    for (/**/; i_1560_ < 0; i_1560_++) {
				int i_1565_ = (anIntArray11426
					       [((i_1559_ >> 12) * anInt9000
						 + (i_1558_ >> 12))]);
				int i_1566_ = i_1565_ >>> 24;
				int i_1567_ = 256 - i_1566_;
				int i_1568_ = is_1484_[i_1557_];
				is_1484_[i_1557_++]
				    = ((((i_1565_ & 0xff00ff) * i_1566_
					 + (i_1568_ & 0xff00ff) * i_1567_)
					& ~0xff00ff)
				       + (((i_1565_ & 0xff00) * i_1566_
					   + (i_1568_ & 0xff00) * i_1567_)
					  & 0xff0000)) >> 8;
				i_1558_ += anInt9006;
				i_1559_ += anInt9017;
			    }
			}
			i_1555_++;
			anInt9022 += anInt9018;
			anInt8999 += anInt9010;
			anInt9015 += anInt9014;
		    }
		}
	    } else if (anInt9017 == 0) {
		int i_1569_ = anInt9023;
		while (i_1569_ < 0) {
		    int i_1570_ = i_1569_ + i_1483_;
		    if (i_1570_ >= 0) {
			if (i_1570_ >= is.length)
			    break;
			int i_1571_ = anInt9015;
			int i_1572_ = anInt9022 + anInt9024;
			int i_1573_ = anInt8999;
			int i_1574_ = anInt9011;
			if (i_1573_ >= 0 && i_1573_ - (anInt9001 << 12) < 0) {
			    if (i_1572_ < 0) {
				int i_1575_
				    = (anInt9006 - 1 - i_1572_) / anInt9006;
				i_1574_ += i_1575_;
				i_1572_ += anInt9006 * i_1575_;
				i_1571_ += i_1575_;
			    }
			    int i_1576_;
			    if ((i_1576_ = (1 + i_1572_ - (anInt9000 << 12)
					    - anInt9006) / anInt9006)
				> i_1574_)
				i_1574_ = i_1576_;
			    int i_1577_ = is[i_1570_] - i;
			    int i_1578_ = -is_1482_[i_1570_];
			    int i_1579_ = i_1577_ - (i_1571_ - anInt9015);
			    if (i_1579_ > 0) {
				i_1571_ += i_1579_;
				i_1574_ += i_1579_;
				i_1572_ += anInt9006 * i_1579_;
				i_1573_ += anInt9017 * i_1579_;
			    } else
				i_1578_ -= i_1579_;
			    if (i_1574_ < i_1578_)
				i_1574_ = i_1578_;
			    for (/**/; i_1574_ < 0; i_1574_++) {
				int i_1580_ = (anIntArray11426
					       [((i_1573_ >> 12) * anInt9000
						 + (i_1572_ >> 12))]);
				int i_1581_ = i_1580_ >>> 24;
				int i_1582_ = 256 - i_1581_;
				int i_1583_ = is_1484_[i_1571_];
				is_1484_[i_1571_++]
				    = ((((i_1580_ & 0xff00ff) * i_1581_
					 + (i_1583_ & 0xff00ff) * i_1582_)
					& ~0xff00ff)
				       + (((i_1580_ & 0xff00) * i_1581_
					   + (i_1583_ & 0xff00) * i_1582_)
					  & 0xff0000)) >> 8;
				i_1572_ += anInt9006;
			    }
			}
		    }
		    i_1569_++;
		    anInt9022 += anInt9018;
		    anInt8999 += anInt9010;
		    anInt9015 += anInt9014;
		}
	    } else if (anInt9017 < 0) {
		int i_1584_ = anInt9023;
		while (i_1584_ < 0) {
		    int i_1585_ = i_1584_ + i_1483_;
		    if (i_1585_ >= 0) {
			if (i_1585_ >= is.length)
			    break;
			int i_1586_ = anInt9015;
			int i_1587_ = anInt9022 + anInt9024;
			int i_1588_ = anInt8999 + anInt9025;
			int i_1589_ = anInt9011;
			if (i_1587_ < 0) {
			    int i_1590_
				= (anInt9006 - 1 - i_1587_) / anInt9006;
			    i_1589_ += i_1590_;
			    i_1587_ += anInt9006 * i_1590_;
			    i_1588_ += anInt9017 * i_1590_;
			    i_1586_ += i_1590_;
			}
			int i_1591_;
			if ((i_1591_ = (1 + i_1587_ - (anInt9000 << 12)
					- anInt9006) / anInt9006)
			    > i_1589_)
			    i_1589_ = i_1591_;
			if ((i_1591_ = i_1588_ - (anInt9001 << 12)) >= 0) {
			    i_1591_ = (anInt9017 - i_1591_) / anInt9017;
			    i_1589_ += i_1591_;
			    i_1587_ += anInt9006 * i_1591_;
			    i_1588_ += anInt9017 * i_1591_;
			    i_1586_ += i_1591_;
			}
			if ((i_1591_ = (i_1588_ - anInt9017) / anInt9017)
			    > i_1589_)
			    i_1589_ = i_1591_;
			int i_1592_ = is[i_1585_] - i;
			int i_1593_ = -is_1482_[i_1585_];
			int i_1594_ = i_1592_ - (i_1586_ - anInt9015);
			if (i_1594_ > 0) {
			    i_1586_ += i_1594_;
			    i_1589_ += i_1594_;
			    i_1587_ += anInt9006 * i_1594_;
			    i_1588_ += anInt9017 * i_1594_;
			} else
			    i_1593_ -= i_1594_;
			if (i_1589_ < i_1593_)
			    i_1589_ = i_1593_;
			for (/**/; i_1589_ < 0; i_1589_++) {
			    int i_1595_
				= (anIntArray11426
				   [(i_1588_ >> 12) * anInt9000 + (i_1587_
								   >> 12)]);
			    int i_1596_ = i_1595_ >>> 24;
			    int i_1597_ = 256 - i_1596_;
			    int i_1598_ = is_1484_[i_1586_];
			    is_1484_[i_1586_++]
				= ((((i_1595_ & 0xff00ff) * i_1596_
				     + (i_1598_ & 0xff00ff) * i_1597_)
				    & ~0xff00ff)
				   + (((i_1595_ & 0xff00) * i_1596_
				       + (i_1598_ & 0xff00) * i_1597_)
				      & 0xff0000)) >> 8;
			    i_1587_ += anInt9006;
			    i_1588_ += anInt9017;
			}
		    }
		    i_1584_++;
		    anInt9022 += anInt9018;
		    anInt8999 += anInt9010;
		    anInt9015 += anInt9014;
		}
	    } else {
		int i_1599_ = anInt9023;
		while (i_1599_ < 0) {
		    int i_1600_ = i_1599_ + i_1483_;
		    if (i_1600_ >= 0) {
			if (i_1600_ >= is.length)
			    break;
			int i_1601_ = anInt9015;
			int i_1602_ = anInt9022 + anInt9024;
			int i_1603_ = anInt8999 + anInt9025;
			int i_1604_ = anInt9011;
			if (i_1602_ < 0) {
			    int i_1605_
				= (anInt9006 - 1 - i_1602_) / anInt9006;
			    i_1604_ += i_1605_;
			    i_1602_ += anInt9006 * i_1605_;
			    i_1603_ += anInt9017 * i_1605_;
			    i_1601_ += i_1605_;
			}
			int i_1606_;
			if ((i_1606_ = (1 + i_1602_ - (anInt9000 << 12)
					- anInt9006) / anInt9006)
			    > i_1604_)
			    i_1604_ = i_1606_;
			if (i_1603_ < 0) {
			    i_1606_ = (anInt9017 - 1 - i_1603_) / anInt9017;
			    i_1604_ += i_1606_;
			    i_1602_ += anInt9006 * i_1606_;
			    i_1603_ += anInt9017 * i_1606_;
			    i_1601_ += i_1606_;
			}
			if ((i_1606_ = (1 + i_1603_ - (anInt9001 << 12)
					- anInt9017) / anInt9017)
			    > i_1604_)
			    i_1604_ = i_1606_;
			int i_1607_ = is[i_1600_] - i;
			int i_1608_ = -is_1482_[i_1600_];
			int i_1609_ = i_1607_ - (i_1601_ - anInt9015);
			if (i_1609_ > 0) {
			    i_1601_ += i_1609_;
			    i_1604_ += i_1609_;
			    i_1602_ += anInt9006 * i_1609_;
			    i_1603_ += anInt9017 * i_1609_;
			} else
			    i_1608_ -= i_1609_;
			if (i_1604_ < i_1608_)
			    i_1604_ = i_1608_;
			for (/**/; i_1604_ < 0; i_1604_++) {
			    int i_1610_
				= (anIntArray11426
				   [(i_1603_ >> 12) * anInt9000 + (i_1602_
								   >> 12)]);
			    int i_1611_ = i_1610_ >>> 24;
			    int i_1612_ = 256 - i_1611_;
			    int i_1613_ = is_1484_[i_1601_];
			    is_1484_[i_1601_++]
				= ((((i_1610_ & 0xff00ff) * i_1611_
				     + (i_1613_ & 0xff00ff) * i_1612_)
				    & ~0xff00ff)
				   + (((i_1610_ & 0xff00) * i_1611_
				       + (i_1613_ & 0xff00) * i_1612_)
				      & 0xff0000)) >> 8;
			    i_1602_ += anInt9006;
			    i_1603_ += anInt9017;
			}
		    }
		    i_1599_++;
		    anInt9022 += anInt9018;
		    anInt8999 += anInt9010;
		    anInt9015 += anInt9014;
		}
	    }
	}
    }
    
    void method2509(int i, int i_1614_, int i_1615_, int i_1616_, int i_1617_,
		    int i_1618_, int i_1619_, int i_1620_) {
	if (aClass182_Sub2_9033.method15226())
	    throw new IllegalStateException();
	if (i_1615_ > 0 && i_1616_ > 0) {
	    int[] is = aClass182_Sub2_9033.anIntArray9466;
	    if (is != null) {
		int i_1621_ = 0;
		int i_1622_ = 0;
		int i_1623_ = aClass182_Sub2_9033.anInt9494 * -476035351;
		int i_1624_ = anInt9002 + anInt9000 + anInt9004;
		int i_1625_ = anInt9003 + anInt9001 + anInt9005;
		int i_1626_ = (i_1624_ << 16) / i_1615_;
		int i_1627_ = (i_1625_ << 16) / i_1616_;
		if (anInt9002 > 0) {
		    int i_1628_ = ((anInt9002 << 16) + i_1626_ - 1) / i_1626_;
		    i += i_1628_;
		    i_1621_ += i_1628_ * i_1626_ - (anInt9002 << 16);
		}
		if (anInt9003 > 0) {
		    int i_1629_ = ((anInt9003 << 16) + i_1627_ - 1) / i_1627_;
		    i_1614_ += i_1629_;
		    i_1622_ += i_1629_ * i_1627_ - (anInt9003 << 16);
		}
		if (anInt9000 < i_1624_)
		    i_1615_ = (((anInt9000 << 16) - i_1621_ + i_1626_ - 1)
			       / i_1626_);
		if (anInt9001 < i_1625_)
		    i_1616_ = (((anInt9001 << 16) - i_1622_ + i_1627_ - 1)
			       / i_1627_);
		int i_1630_ = i + i_1614_ * i_1623_;
		int i_1631_ = i_1623_ - i_1615_;
		if (i_1614_ + i_1616_
		    > aClass182_Sub2_9033.anInt9473 * 1920901985)
		    i_1616_ -= (i_1614_ + i_1616_
				- aClass182_Sub2_9033.anInt9473 * 1920901985);
		if (i_1614_ < aClass182_Sub2_9033.anInt9472 * 1722112305) {
		    int i_1632_
			= aClass182_Sub2_9033.anInt9472 * 1722112305 - i_1614_;
		    i_1616_ -= i_1632_;
		    i_1630_ += i_1632_ * i_1623_;
		    i_1622_ += i_1627_ * i_1632_;
		}
		if (i + i_1615_ > aClass182_Sub2_9033.anInt9499 * -466178451) {
		    int i_1633_
			= (i + i_1615_
			   - aClass182_Sub2_9033.anInt9499 * -466178451);
		    i_1615_ -= i_1633_;
		    i_1631_ += i_1633_;
		}
		if (i < aClass182_Sub2_9033.anInt9470 * 1988019027) {
		    int i_1634_
			= aClass182_Sub2_9033.anInt9470 * 1988019027 - i;
		    i_1615_ -= i_1634_;
		    i_1630_ += i_1634_;
		    i_1621_ += i_1626_ * i_1634_;
		    i_1631_ += i_1634_;
		}
		if (i_1619_ == 0) {
		    if (i_1617_ == 1) {
			int i_1635_ = i_1621_;
			for (int i_1636_ = -i_1616_; i_1636_ < 0; i_1636_++) {
			    int i_1637_ = (i_1622_ >> 16) * anInt9000;
			    for (int i_1638_ = -i_1615_; i_1638_ < 0;
				 i_1638_++) {
				is[i_1630_++] = (anIntArray11426
						 [(i_1621_ >> 16) + i_1637_]);
				i_1621_ += i_1626_;
			    }
			    i_1622_ += i_1627_;
			    i_1621_ = i_1635_;
			    i_1630_ += i_1631_;
			}
		    } else if (i_1617_ == 0) {
			int i_1639_ = (i_1618_ & 0xff0000) >> 16;
			int i_1640_ = (i_1618_ & 0xff00) >> 8;
			int i_1641_ = i_1618_ & 0xff;
			int i_1642_ = i_1621_;
			for (int i_1643_ = -i_1616_; i_1643_ < 0; i_1643_++) {
			    int i_1644_ = (i_1622_ >> 16) * anInt9000;
			    for (int i_1645_ = -i_1615_; i_1645_ < 0;
				 i_1645_++) {
				int i_1646_ = (anIntArray11426
					       [(i_1621_ >> 16) + i_1644_]);
				int i_1647_ = ((i_1646_ & 0xff0000) * i_1639_
					       & ~0xffffff);
				int i_1648_
				    = (i_1646_ & 0xff00) * i_1640_ & 0xff0000;
				int i_1649_
				    = (i_1646_ & 0xff) * i_1641_ & 0xff00;
				is[i_1630_++]
				    = (i_1647_ | i_1648_ | i_1649_) >>> 8;
				i_1621_ += i_1626_;
			    }
			    i_1622_ += i_1627_;
			    i_1621_ = i_1642_;
			    i_1630_ += i_1631_;
			}
		    } else if (i_1617_ == 3) {
			int i_1650_ = i_1621_;
			for (int i_1651_ = -i_1616_; i_1651_ < 0; i_1651_++) {
			    int i_1652_ = (i_1622_ >> 16) * anInt9000;
			    for (int i_1653_ = -i_1615_; i_1653_ < 0;
				 i_1653_++) {
				int i_1654_ = (anIntArray11426
					       [(i_1621_ >> 16) + i_1652_]);
				int i_1655_ = i_1654_ + i_1618_;
				int i_1656_ = ((i_1654_ & 0xff00ff)
					       + (i_1618_ & 0xff00ff));
				int i_1657_
				    = ((i_1656_ & 0x1000100)
				       + (i_1655_ - i_1656_ & 0x10000));
				is[i_1630_++]
				    = i_1655_ - i_1657_ | i_1657_ - (i_1657_
								     >>> 8);
				i_1621_ += i_1626_;
			    }
			    i_1622_ += i_1627_;
			    i_1621_ = i_1650_;
			    i_1630_ += i_1631_;
			}
		    } else if (i_1617_ == 2) {
			int i_1658_ = i_1618_ >>> 24;
			int i_1659_ = 256 - i_1658_;
			int i_1660_
			    = (i_1618_ & 0xff00ff) * i_1659_ & ~0xff00ff;
			int i_1661_ = (i_1618_ & 0xff00) * i_1659_ & 0xff0000;
			i_1618_ = (i_1660_ | i_1661_) >>> 8;
			int i_1662_ = i_1621_;
			for (int i_1663_ = -i_1616_; i_1663_ < 0; i_1663_++) {
			    int i_1664_ = (i_1622_ >> 16) * anInt9000;
			    for (int i_1665_ = -i_1615_; i_1665_ < 0;
				 i_1665_++) {
				int i_1666_ = (anIntArray11426
					       [(i_1621_ >> 16) + i_1664_]);
				i_1660_ = ((i_1666_ & 0xff00ff) * i_1658_
					   & ~0xff00ff);
				i_1661_
				    = (i_1666_ & 0xff00) * i_1658_ & 0xff0000;
				is[i_1630_++]
				    = ((i_1660_ | i_1661_) >>> 8) + i_1618_;
				i_1621_ += i_1626_;
			    }
			    i_1622_ += i_1627_;
			    i_1621_ = i_1662_;
			    i_1630_ += i_1631_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1619_ == 1) {
		    if (i_1617_ == 1) {
			int i_1667_ = i_1621_;
			for (int i_1668_ = -i_1616_; i_1668_ < 0; i_1668_++) {
			    int i_1669_ = (i_1622_ >> 16) * anInt9000;
			    for (int i_1670_ = -i_1615_; i_1670_ < 0;
				 i_1670_++) {
				int i_1671_ = (anIntArray11426
					       [(i_1621_ >> 16) + i_1669_]);
				int i_1672_ = i_1671_ >>> 24;
				int i_1673_ = 256 - i_1672_;
				int i_1674_ = is[i_1630_];
				is[i_1630_++]
				    = (((((i_1671_ & 0xff00ff) * i_1672_
					  + (i_1674_ & 0xff00ff) * i_1673_)
					 & ~0xff00ff)
					>> 8)
				       + (((((i_1671_ & ~0xff00ff) >>> 8)
					    * i_1672_)
					   + (((i_1674_ & ~0xff00ff) >>> 8)
					      * i_1673_))
					  & ~0xff00ff));
				i_1621_ += i_1626_;
			    }
			    i_1622_ += i_1627_;
			    i_1621_ = i_1667_;
			    i_1630_ += i_1631_;
			}
		    } else if (i_1617_ == 0) {
			int i_1675_ = i_1621_;
			if ((i_1618_ & 0xffffff) == 16777215) {
			    for (int i_1676_ = -i_1616_; i_1676_ < 0;
				 i_1676_++) {
				int i_1677_ = (i_1622_ >> 16) * anInt9000;
				for (int i_1678_ = -i_1615_; i_1678_ < 0;
				     i_1678_++) {
				    int i_1679_
					= (anIntArray11426
					   [(i_1621_ >> 16) + i_1677_]);
				    int i_1680_
					= ((i_1679_ >>> 24) * (i_1618_ >>> 24)
					   >> 8);
				    int i_1681_ = 256 - i_1680_;
				    int i_1682_ = is[i_1630_];
				    is[i_1630_++]
					= ((((i_1679_ & 0xff00ff) * i_1680_
					     + (i_1682_ & 0xff00ff) * i_1681_)
					    & ~0xff00ff)
					   + (((i_1679_ & 0xff00) * i_1680_
					       + (i_1682_ & 0xff00) * i_1681_)
					      & 0xff0000)) >> 8;
				    i_1621_ += i_1626_;
				}
				i_1622_ += i_1627_;
				i_1621_ = i_1675_;
				i_1630_ += i_1631_;
			    }
			} else {
			    int i_1683_ = (i_1618_ & 0xff0000) >> 16;
			    int i_1684_ = (i_1618_ & 0xff00) >> 8;
			    int i_1685_ = i_1618_ & 0xff;
			    for (int i_1686_ = -i_1616_; i_1686_ < 0;
				 i_1686_++) {
				int i_1687_ = (i_1622_ >> 16) * anInt9000;
				for (int i_1688_ = -i_1615_; i_1688_ < 0;
				     i_1688_++) {
				    int i_1689_
					= (anIntArray11426
					   [(i_1621_ >> 16) + i_1687_]);
				    int i_1690_
					= ((i_1689_ >>> 24) * (i_1618_ >>> 24)
					   >> 8);
				    int i_1691_ = 256 - i_1690_;
				    if (i_1690_ != 255) {
					int i_1692_
					    = ((i_1689_ & 0xff0000) * i_1683_
					       & ~0xffffff);
					int i_1693_
					    = ((i_1689_ & 0xff00) * i_1684_
					       & 0xff0000);
					int i_1694_
					    = ((i_1689_ & 0xff) * i_1685_
					       & 0xff00);
					i_1689_ = (i_1692_ | i_1693_
						   | i_1694_) >>> 8;
					int i_1695_ = is[i_1630_];
					is[i_1630_++]
					    = ((((i_1689_ & 0xff00ff) * i_1690_
						 + ((i_1695_ & 0xff00ff)
						    * i_1691_))
						& ~0xff00ff)
					       + (((i_1689_ & 0xff00) * i_1690_
						   + ((i_1695_ & 0xff00)
						      * i_1691_))
						  & 0xff0000)) >> 8;
				    } else {
					int i_1696_
					    = ((i_1689_ & 0xff0000) * i_1683_
					       & ~0xffffff);
					int i_1697_
					    = ((i_1689_ & 0xff00) * i_1684_
					       & 0xff0000);
					int i_1698_
					    = ((i_1689_ & 0xff) * i_1685_
					       & 0xff00);
					is[i_1630_++] = (i_1696_ | i_1697_
							 | i_1698_) >>> 8;
				    }
				    i_1621_ += i_1626_;
				}
				i_1622_ += i_1627_;
				i_1621_ = i_1675_;
				i_1630_ += i_1631_;
			    }
			}
		    } else if (i_1617_ == 3) {
			int i_1699_ = i_1621_;
			for (int i_1700_ = -i_1616_; i_1700_ < 0; i_1700_++) {
			    int i_1701_ = (i_1622_ >> 16) * anInt9000;
			    for (int i_1702_ = -i_1615_; i_1702_ < 0;
				 i_1702_++) {
				int i_1703_ = (anIntArray11426
					       [(i_1621_ >> 16) + i_1701_]);
				int i_1704_ = i_1703_ + i_1618_;
				int i_1705_ = ((i_1703_ & 0xff00ff)
					       + (i_1618_ & 0xff00ff));
				int i_1706_
				    = ((i_1705_ & 0x1000100)
				       + (i_1704_ - i_1705_ & 0x10000));
				i_1706_
				    = i_1704_ - i_1706_ | i_1706_ - (i_1706_
								     >>> 8);
				int i_1707_
				    = (i_1706_ >>> 24) * (i_1618_ >>> 24) >> 8;
				int i_1708_ = 256 - i_1707_;
				if (i_1707_ != 255) {
				    i_1703_ = i_1706_;
				    i_1706_ = is[i_1630_];
				    i_1706_
					= ((((i_1703_ & 0xff00ff) * i_1707_
					     + (i_1706_ & 0xff00ff) * i_1708_)
					    & ~0xff00ff)
					   + (((i_1703_ & 0xff00) * i_1707_
					       + (i_1706_ & 0xff00) * i_1708_)
					      & 0xff0000)) >> 8;
				}
				is[i_1630_++] = i_1706_;
				i_1621_ += i_1626_;
			    }
			    i_1622_ += i_1627_;
			    i_1621_ = i_1699_;
			    i_1630_ += i_1631_;
			}
		    } else if (i_1617_ == 2) {
			int i_1709_ = i_1618_ >>> 24;
			int i_1710_ = 256 - i_1709_;
			int i_1711_
			    = (i_1618_ & 0xff00ff) * i_1710_ & ~0xff00ff;
			int i_1712_ = (i_1618_ & 0xff00) * i_1710_ & 0xff0000;
			i_1618_ = (i_1711_ | i_1712_) >>> 8;
			int i_1713_ = i_1621_;
			for (int i_1714_ = -i_1616_; i_1714_ < 0; i_1714_++) {
			    int i_1715_ = (i_1622_ >> 16) * anInt9000;
			    for (int i_1716_ = -i_1615_; i_1716_ < 0;
				 i_1716_++) {
				int i_1717_ = (anIntArray11426
					       [(i_1621_ >> 16) + i_1715_]);
				int i_1718_ = i_1717_ >>> 24;
				int i_1719_ = 256 - i_1718_;
				i_1711_ = ((i_1717_ & 0xff00ff) * i_1709_
					   & ~0xff00ff);
				i_1712_
				    = (i_1717_ & 0xff00) * i_1709_ & 0xff0000;
				i_1717_
				    = ((i_1711_ | i_1712_) >>> 8) + i_1618_;
				int i_1720_ = is[i_1630_];
				is[i_1630_++]
				    = ((((i_1717_ & 0xff00ff) * i_1718_
					 + (i_1720_ & 0xff00ff) * i_1719_)
					& ~0xff00ff)
				       + (((i_1717_ & 0xff00) * i_1718_
					   + (i_1720_ & 0xff00) * i_1719_)
					  & 0xff0000)) >> 8;
				i_1621_ += i_1626_;
			    }
			    i_1622_ += i_1627_;
			    i_1621_ = i_1713_;
			    i_1630_ += i_1631_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1619_ == 2) {
		    if (i_1617_ == 1) {
			int i_1721_ = i_1621_;
			for (int i_1722_ = -i_1616_; i_1722_ < 0; i_1722_++) {
			    int i_1723_ = (i_1622_ >> 16) * anInt9000;
			    for (int i_1724_ = -i_1615_; i_1724_ < 0;
				 i_1724_++) {
				int i_1725_ = (anIntArray11426
					       [(i_1621_ >> 16) + i_1723_]);
				if (i_1725_ != 0) {
				    int i_1726_ = is[i_1630_];
				    int i_1727_ = i_1725_ + i_1726_;
				    int i_1728_ = ((i_1725_ & 0xff00ff)
						   + (i_1726_ & 0xff00ff));
				    i_1726_
					= ((i_1728_ & 0x1000100)
					   + (i_1727_ - i_1728_ & 0x10000));
				    is[i_1630_++]
					= (i_1727_ - i_1726_
					   | i_1726_ - (i_1726_ >>> 8));
				} else
				    i_1630_++;
				i_1621_ += i_1626_;
			    }
			    i_1622_ += i_1627_;
			    i_1621_ = i_1721_;
			    i_1630_ += i_1631_;
			}
		    } else if (i_1617_ == 0) {
			int i_1729_ = i_1621_;
			int i_1730_ = (i_1618_ & 0xff0000) >> 16;
			int i_1731_ = (i_1618_ & 0xff00) >> 8;
			int i_1732_ = i_1618_ & 0xff;
			for (int i_1733_ = -i_1616_; i_1733_ < 0; i_1733_++) {
			    int i_1734_ = (i_1622_ >> 16) * anInt9000;
			    for (int i_1735_ = -i_1615_; i_1735_ < 0;
				 i_1735_++) {
				int i_1736_ = (anIntArray11426
					       [(i_1621_ >> 16) + i_1734_]);
				if (i_1736_ != 0) {
				    int i_1737_
					= ((i_1736_ & 0xff0000) * i_1730_
					   & ~0xffffff);
				    int i_1738_ = ((i_1736_ & 0xff00) * i_1731_
						   & 0xff0000);
				    int i_1739_
					= (i_1736_ & 0xff) * i_1732_ & 0xff00;
				    i_1736_
					= (i_1737_ | i_1738_ | i_1739_) >>> 8;
				    int i_1740_ = is[i_1630_];
				    int i_1741_ = i_1736_ + i_1740_;
				    int i_1742_ = ((i_1736_ & 0xff00ff)
						   + (i_1740_ & 0xff00ff));
				    i_1740_
					= ((i_1742_ & 0x1000100)
					   + (i_1741_ - i_1742_ & 0x10000));
				    is[i_1630_++]
					= (i_1741_ - i_1740_
					   | i_1740_ - (i_1740_ >>> 8));
				} else
				    i_1630_++;
				i_1621_ += i_1626_;
			    }
			    i_1622_ += i_1627_;
			    i_1621_ = i_1729_;
			    i_1630_ += i_1631_;
			}
		    } else if (i_1617_ == 3) {
			int i_1743_ = i_1621_;
			for (int i_1744_ = -i_1616_; i_1744_ < 0; i_1744_++) {
			    int i_1745_ = (i_1622_ >> 16) * anInt9000;
			    for (int i_1746_ = -i_1615_; i_1746_ < 0;
				 i_1746_++) {
				int i_1747_ = (anIntArray11426
					       [(i_1621_ >> 16) + i_1745_]);
				int i_1748_ = i_1747_ + i_1618_;
				int i_1749_ = ((i_1747_ & 0xff00ff)
					       + (i_1618_ & 0xff00ff));
				int i_1750_
				    = ((i_1749_ & 0x1000100)
				       + (i_1748_ - i_1749_ & 0x10000));
				i_1747_
				    = i_1748_ - i_1750_ | i_1750_ - (i_1750_
								     >>> 8);
				i_1750_ = is[i_1630_];
				i_1748_ = i_1747_ + i_1750_;
				i_1749_ = (i_1747_ & 0xff00ff) + (i_1750_
								  & 0xff00ff);
				i_1750_ = ((i_1749_ & 0x1000100)
					   + (i_1748_ - i_1749_ & 0x10000));
				is[i_1630_++]
				    = i_1748_ - i_1750_ | i_1750_ - (i_1750_
								     >>> 8);
				i_1621_ += i_1626_;
			    }
			    i_1622_ += i_1627_;
			    i_1621_ = i_1743_;
			    i_1630_ += i_1631_;
			}
		    } else if (i_1617_ == 2) {
			int i_1751_ = i_1618_ >>> 24;
			int i_1752_ = 256 - i_1751_;
			int i_1753_
			    = (i_1618_ & 0xff00ff) * i_1752_ & ~0xff00ff;
			int i_1754_ = (i_1618_ & 0xff00) * i_1752_ & 0xff0000;
			i_1618_ = (i_1753_ | i_1754_) >>> 8;
			int i_1755_ = i_1621_;
			for (int i_1756_ = -i_1616_; i_1756_ < 0; i_1756_++) {
			    int i_1757_ = (i_1622_ >> 16) * anInt9000;
			    for (int i_1758_ = -i_1615_; i_1758_ < 0;
				 i_1758_++) {
				int i_1759_ = (anIntArray11426
					       [(i_1621_ >> 16) + i_1757_]);
				if (i_1759_ != 0) {
				    i_1753_ = ((i_1759_ & 0xff00ff) * i_1751_
					       & ~0xff00ff);
				    i_1754_ = ((i_1759_ & 0xff00) * i_1751_
					       & 0xff0000);
				    i_1759_ = (((i_1753_ | i_1754_) >>> 8)
					       + i_1618_);
				    int i_1760_ = is[i_1630_];
				    int i_1761_ = i_1759_ + i_1760_;
				    int i_1762_ = ((i_1759_ & 0xff00ff)
						   + (i_1760_ & 0xff00ff));
				    i_1760_
					= ((i_1762_ & 0x1000100)
					   + (i_1761_ - i_1762_ & 0x10000));
				    is[i_1630_++]
					= (i_1761_ - i_1760_
					   | i_1760_ - (i_1760_ >>> 8));
				} else
				    i_1630_++;
				i_1621_ += i_1626_;
			    }
			    i_1622_ += i_1627_;
			    i_1621_ = i_1755_;
			    i_1630_ += i_1631_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    public void method2540(int i, int i_1763_, int i_1764_, int i_1765_,
			   int i_1766_, int i_1767_) {
	int[] is = aClass182_Sub2_9033.anIntArray9466;
	if (is == null)
	    throw new IllegalStateException("");
	for (int i_1768_ = 0; i_1768_ < i_1765_; i_1768_++) {
	    int i_1769_ = (i_1763_ + i_1768_) * i_1764_ + i;
	    int i_1770_ = (i_1767_ + i_1768_) * i_1764_ + i_1766_;
	    for (int i_1771_ = 0; i_1771_ < i_1764_; i_1771_++)
		anIntArray11426[i_1769_ + i_1771_]
		    = is[i_1770_ + i_1771_] & 0xffffff;
	}
    }
    
    public void method2498(int i, int i_1772_, int i_1773_, int i_1774_,
			   int i_1775_, int i_1776_) {
	int[] is = aClass182_Sub2_9033.anIntArray9466;
	if (is == null)
	    throw new IllegalStateException("");
	for (int i_1777_ = 0; i_1777_ < i_1774_; i_1777_++) {
	    int i_1778_ = (i_1772_ + i_1777_) * i_1773_ + i;
	    int i_1779_ = (i_1776_ + i_1777_) * i_1773_ + i_1775_;
	    for (int i_1780_ = 0; i_1780_ < i_1773_; i_1780_++)
		anIntArray11426[i_1778_ + i_1780_]
		    = is[i_1779_ + i_1780_] & 0xffffff;
	}
    }
    
    public void method2513(int i, int i_1781_, Class152 class152, int i_1782_,
			   int i_1783_) {
	if (aClass182_Sub2_9033.method15226())
	    throw new IllegalStateException();
	int[] is = aClass182_Sub2_9033.anIntArray9466;
	if (is != null) {
	    i += anInt9002;
	    i_1781_ += anInt9003;
	    int i_1784_ = 0;
	    int i_1785_ = aClass182_Sub2_9033.anInt9494 * -476035351;
	    int i_1786_ = anInt9000;
	    int i_1787_ = anInt9001;
	    int i_1788_ = i_1785_ - i_1786_;
	    int i_1789_ = 0;
	    int i_1790_ = i + i_1781_ * i_1785_;
	    if (i_1781_ < aClass182_Sub2_9033.anInt9472 * 1722112305) {
		int i_1791_
		    = aClass182_Sub2_9033.anInt9472 * 1722112305 - i_1781_;
		i_1787_ -= i_1791_;
		i_1781_ = aClass182_Sub2_9033.anInt9472 * 1722112305;
		i_1784_ += i_1791_ * i_1786_;
		i_1790_ += i_1791_ * i_1785_;
	    }
	    if (i_1781_ + i_1787_ > aClass182_Sub2_9033.anInt9473 * 1920901985)
		i_1787_ -= (i_1781_ + i_1787_
			    - aClass182_Sub2_9033.anInt9473 * 1920901985);
	    if (i < aClass182_Sub2_9033.anInt9470 * 1988019027) {
		int i_1792_ = aClass182_Sub2_9033.anInt9470 * 1988019027 - i;
		i_1786_ -= i_1792_;
		i = aClass182_Sub2_9033.anInt9470 * 1988019027;
		i_1784_ += i_1792_;
		i_1790_ += i_1792_;
		i_1789_ += i_1792_;
		i_1788_ += i_1792_;
	    }
	    if (i + i_1786_ > aClass182_Sub2_9033.anInt9499 * -466178451) {
		int i_1793_
		    = i + i_1786_ - aClass182_Sub2_9033.anInt9499 * -466178451;
		i_1786_ -= i_1793_;
		i_1789_ += i_1793_;
		i_1788_ += i_1793_;
	    }
	    if (i_1786_ > 0 && i_1787_ > 0) {
		Class152_Sub1 class152_sub1 = (Class152_Sub1) class152;
		int[] is_1794_ = class152_sub1.anIntArray8998;
		int[] is_1795_ = class152_sub1.anIntArray8997;
		int i_1796_ = i_1781_;
		if (i_1783_ > i_1796_) {
		    i_1796_ = i_1783_;
		    i_1790_ += (i_1783_ - i_1781_) * i_1785_;
		    i_1784_ += (i_1783_ - i_1781_) * anInt9000;
		}
		int i_1797_
		    = (i_1783_ + is_1794_.length < i_1781_ + i_1787_
		       ? i_1783_ + is_1794_.length : i_1781_ + i_1787_);
		for (int i_1798_ = i_1796_; i_1798_ < i_1797_; i_1798_++) {
		    int i_1799_ = is_1794_[i_1798_ - i_1783_] + i_1782_;
		    int i_1800_ = is_1795_[i_1798_ - i_1783_];
		    int i_1801_ = i_1786_;
		    if (i > i_1799_) {
			int i_1802_ = i - i_1799_;
			if (i_1802_ >= i_1800_) {
			    i_1784_ += i_1786_ + i_1789_;
			    i_1790_ += i_1786_ + i_1788_;
			    continue;
			}
			i_1800_ -= i_1802_;
		    } else {
			int i_1803_ = i_1799_ - i;
			if (i_1803_ >= i_1786_) {
			    i_1784_ += i_1786_ + i_1789_;
			    i_1790_ += i_1786_ + i_1788_;
			    continue;
			}
			i_1784_ += i_1803_;
			i_1801_ -= i_1803_;
			i_1790_ += i_1803_;
		    }
		    int i_1804_ = 0;
		    if (i_1801_ < i_1800_)
			i_1800_ = i_1801_;
		    else
			i_1804_ = i_1801_ - i_1800_;
		    for (int i_1805_ = -i_1800_; i_1805_ < 0; i_1805_++) {
			int i_1806_ = anIntArray11426[i_1784_++];
			int i_1807_ = i_1806_ >>> 24;
			int i_1808_ = 256 - i_1807_;
			int i_1809_ = is[i_1790_];
			is[i_1790_++] = ((((i_1806_ & 0xff00ff) * i_1807_
					   + (i_1809_ & 0xff00ff) * i_1808_)
					  & ~0xff00ff)
					 + (((i_1806_ & 0xff00) * i_1807_
					     + (i_1809_ & 0xff00) * i_1808_)
					    & 0xff0000)) >> 8;
		    }
		    i_1784_ += i_1804_ + i_1789_;
		    i_1790_ += i_1804_ + i_1788_;
		}
	    }
	}
    }
    
    void method18028(int i, int i_1810_, int i_1811_, int i_1812_, int[] is,
		     int i_1813_, int i_1814_) {
	i_1814_ -= i_1811_;
	for (int i_1815_ = 0; i_1815_ < i_1812_; i_1815_++) {
	    int i_1816_ = (i_1810_ + i_1815_) * i_1811_ + i;
	    for (int i_1817_ = 0; i_1817_ < i_1811_; i_1817_++)
		is[i_1813_++] = anIntArray11426[i_1816_ + i_1817_];
	    i_1813_ += i_1814_;
	}
    }
    
    public void method2510(int i, int i_1818_, int i_1819_, int i_1820_,
			   int[] is, int[] is_1821_, int i_1822_,
			   int i_1823_) {
	method18024(i, i_1818_, i_1819_, i_1820_, is, i_1822_, i_1823_);
    }
    
    public void method2514(int i, int i_1824_, int i_1825_, int i_1826_,
			   int[] is, int[] is_1827_, int i_1828_,
			   int i_1829_) {
	method18024(i, i_1824_, i_1825_, i_1826_, is, i_1828_, i_1829_);
    }
    
    void method14540(boolean bool, boolean bool_1830_, boolean bool_1831_,
		     int i, int i_1832_, float f, int i_1833_, int i_1834_,
		     int i_1835_, int i_1836_, int i_1837_, int i_1838_,
		     boolean bool_1839_) {
	if (i_1833_ > 0 && i_1834_ > 0 && (bool || bool_1830_)) {
	    int i_1840_ = 0;
	    int i_1841_ = 0;
	    int i_1842_ = anInt9002 + anInt9000 + anInt9004;
	    int i_1843_ = anInt9003 + anInt9001 + anInt9005;
	    int i_1844_ = (i_1842_ << 16) / i_1833_;
	    int i_1845_ = (i_1843_ << 16) / i_1834_;
	    if (anInt9002 > 0) {
		int i_1846_ = ((anInt9002 << 16) + i_1844_ - 1) / i_1844_;
		i += i_1846_;
		i_1840_ += i_1846_ * i_1844_ - (anInt9002 << 16);
	    }
	    if (anInt9003 > 0) {
		int i_1847_ = ((anInt9003 << 16) + i_1845_ - 1) / i_1845_;
		i_1832_ += i_1847_;
		i_1841_ += i_1847_ * i_1845_ - (anInt9003 << 16);
	    }
	    if (anInt9000 < i_1842_)
		i_1833_
		    = ((anInt9000 << 16) - i_1840_ + i_1844_ - 1) / i_1844_;
	    if (anInt9001 < i_1843_)
		i_1834_
		    = ((anInt9001 << 16) - i_1841_ + i_1845_ - 1) / i_1845_;
	    int i_1848_
		= i + i_1832_ * (aClass182_Sub2_9033.anInt9494 * -476035351);
	    int i_1849_ = aClass182_Sub2_9033.anInt9494 * -476035351 - i_1833_;
	    if (i_1832_ + i_1834_ > aClass182_Sub2_9033.anInt9473 * 1920901985)
		i_1834_ -= (i_1832_ + i_1834_
			    - aClass182_Sub2_9033.anInt9473 * 1920901985);
	    if (i_1832_ < aClass182_Sub2_9033.anInt9472 * 1722112305) {
		int i_1850_
		    = aClass182_Sub2_9033.anInt9472 * 1722112305 - i_1832_;
		i_1834_ -= i_1850_;
		i_1848_
		    += i_1850_ * (aClass182_Sub2_9033.anInt9494 * -476035351);
		i_1841_ += i_1845_ * i_1850_;
	    }
	    if (i + i_1833_ > aClass182_Sub2_9033.anInt9499 * -466178451) {
		int i_1851_
		    = i + i_1833_ - aClass182_Sub2_9033.anInt9499 * -466178451;
		i_1833_ -= i_1851_;
		i_1849_ += i_1851_;
	    }
	    if (i < aClass182_Sub2_9033.anInt9470 * 1988019027) {
		int i_1852_ = aClass182_Sub2_9033.anInt9470 * 1988019027 - i;
		i_1833_ -= i_1852_;
		i_1848_ += i_1852_;
		i_1840_ += i_1844_ * i_1852_;
		i_1849_ += i_1852_;
	    }
	    float[] fs = aClass182_Sub2_9033.aFloatArray9469;
	    int[] is = aClass182_Sub2_9033.anIntArray9466;
	    if (i_1837_ == 0) {
		if (i_1835_ == 1) {
		    int i_1853_ = i_1840_;
		    for (int i_1854_ = -i_1834_; i_1854_ < 0; i_1854_++) {
			int i_1855_ = (i_1841_ >> 16) * anInt9000;
			for (int i_1856_ = -i_1833_; i_1856_ < 0; i_1856_++) {
			    if (!bool_1830_ || f < fs[i_1848_]) {
				if (bool)
				    is[i_1848_]
					= (anIntArray11426
					   [(i_1840_ >> 16) + i_1855_]);
				if (bool_1830_ && bool_1839_)
				    fs[i_1848_] = f;
			    }
			    i_1840_ += i_1844_;
			    i_1848_++;
			}
			i_1841_ += i_1845_;
			i_1840_ = i_1853_;
			i_1848_ += i_1849_;
		    }
		} else if (i_1835_ == 0) {
		    int i_1857_ = (i_1836_ & 0xff0000) >> 16;
		    int i_1858_ = (i_1836_ & 0xff00) >> 8;
		    int i_1859_ = i_1836_ & 0xff;
		    int i_1860_ = i_1840_;
		    for (int i_1861_ = -i_1834_; i_1861_ < 0; i_1861_++) {
			int i_1862_ = (i_1841_ >> 16) * anInt9000;
			for (int i_1863_ = -i_1833_; i_1863_ < 0; i_1863_++) {
			    if (!bool_1830_ || f < fs[i_1848_]) {
				if (bool) {
				    int i_1864_
					= (anIntArray11426
					   [(i_1840_ >> 16) + i_1862_]);
				    int i_1865_
					= ((i_1864_ & 0xff0000) * i_1857_
					   & ~0xffffff);
				    int i_1866_ = ((i_1864_ & 0xff00) * i_1858_
						   & 0xff0000);
				    int i_1867_
					= (i_1864_ & 0xff) * i_1859_ & 0xff00;
				    is[i_1848_]
					= (i_1865_ | i_1866_ | i_1867_) >>> 8;
				}
				if (bool_1830_ && bool_1839_)
				    fs[i_1848_] = f;
			    }
			    i_1840_ += i_1844_;
			    i_1848_++;
			}
			i_1841_ += i_1845_;
			i_1840_ = i_1860_;
			i_1848_ += i_1849_;
		    }
		} else if (i_1835_ == 3) {
		    int i_1868_ = i_1840_;
		    for (int i_1869_ = -i_1834_; i_1869_ < 0; i_1869_++) {
			int i_1870_ = (i_1841_ >> 16) * anInt9000;
			for (int i_1871_ = -i_1833_; i_1871_ < 0; i_1871_++) {
			    if (!bool_1830_ || f < fs[i_1848_]) {
				if (bool) {
				    int i_1872_
					= (anIntArray11426
					   [(i_1840_ >> 16) + i_1870_]);
				    int i_1873_ = i_1872_ + i_1836_;
				    int i_1874_ = ((i_1872_ & 0xff00ff)
						   + (i_1836_ & 0xff00ff));
				    int i_1875_
					= ((i_1874_ & 0x1000100)
					   + (i_1873_ - i_1874_ & 0x10000));
				    is[i_1848_]
					= (i_1873_ - i_1875_
					   | i_1875_ - (i_1875_ >>> 8));
				}
				if (bool_1830_ && bool_1839_)
				    fs[i_1848_] = f;
			    }
			    i_1840_ += i_1844_;
			    i_1848_++;
			}
			i_1841_ += i_1845_;
			i_1840_ = i_1868_;
			i_1848_ += i_1849_;
		    }
		} else if (i_1835_ == 2) {
		    int i_1876_ = i_1836_ >>> 24;
		    int i_1877_ = 256 - i_1876_;
		    int i_1878_ = (i_1836_ & 0xff00ff) * i_1877_ & ~0xff00ff;
		    int i_1879_ = (i_1836_ & 0xff00) * i_1877_ & 0xff0000;
		    i_1836_ = (i_1878_ | i_1879_) >>> 8;
		    int i_1880_ = i_1840_;
		    for (int i_1881_ = -i_1834_; i_1881_ < 0; i_1881_++) {
			int i_1882_ = (i_1841_ >> 16) * anInt9000;
			for (int i_1883_ = -i_1833_; i_1883_ < 0; i_1883_++) {
			    if (!bool_1830_ || f < fs[i_1848_]) {
				if (bool) {
				    int i_1884_
					= (anIntArray11426
					   [(i_1840_ >> 16) + i_1882_]);
				    i_1878_ = ((i_1884_ & 0xff00ff) * i_1876_
					       & ~0xff00ff);
				    i_1879_ = ((i_1884_ & 0xff00) * i_1876_
					       & 0xff0000);
				    is[i_1848_] = (((i_1878_ | i_1879_) >>> 8)
						   + i_1836_);
				}
				if (bool_1830_ && bool_1839_)
				    fs[i_1848_] = f;
			    }
			    i_1840_ += i_1844_;
			    i_1848_++;
			}
			i_1841_ += i_1845_;
			i_1840_ = i_1880_;
			i_1848_ += i_1849_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_1837_ == 1) {
		if (i_1835_ == 1) {
		    int i_1885_ = i_1840_;
		    for (int i_1886_ = -i_1834_; i_1886_ < 0; i_1886_++) {
			int i_1887_ = (i_1841_ >> 16) * anInt9000;
			for (int i_1888_ = -i_1833_; i_1888_ < 0; i_1888_++) {
			    if (!bool_1830_ || f < fs[i_1848_]) {
				if (bool) {
				    int i_1889_
					= (anIntArray11426
					   [(i_1840_ >> 16) + i_1887_]);
				    int i_1890_ = i_1889_ >>> 24;
				    int i_1891_ = 256 - i_1890_;
				    int i_1892_ = is[i_1848_];
				    is[i_1848_]
					= (((((i_1889_ & 0xff00ff) * i_1890_
					      + (i_1892_ & 0xff00ff) * i_1891_)
					     & ~0xff00ff)
					    >> 8)
					   + (((((i_1889_ & ~0xff00ff) >>> 8)
						* i_1890_)
					       + (((i_1892_ & ~0xff00ff) >>> 8)
						  * i_1891_))
					      & ~0xff00ff));
				}
				if (bool_1830_ && bool_1839_)
				    fs[i_1848_] = f;
			    }
			    i_1840_ += i_1844_;
			    i_1848_++;
			}
			i_1841_ += i_1845_;
			i_1840_ = i_1885_;
			i_1848_ += i_1849_;
		    }
		} else if (i_1835_ == 0) {
		    int i_1893_ = i_1840_;
		    if ((i_1836_ & 0xffffff) == 16777215) {
			for (int i_1894_ = -i_1834_; i_1894_ < 0; i_1894_++) {
			    int i_1895_ = (i_1841_ >> 16) * anInt9000;
			    for (int i_1896_ = -i_1833_; i_1896_ < 0;
				 i_1896_++) {
				if (!bool_1830_ || f < fs[i_1848_]) {
				    if (bool) {
					int i_1897_
					    = (anIntArray11426
					       [(i_1840_ >> 16) + i_1895_]);
					int i_1898_
					    = ((i_1897_ >>> 24) * (i_1836_
								   >>> 24)
					       >> 8);
					int i_1899_ = 256 - i_1898_;
					int i_1900_ = is[i_1848_];
					is[i_1848_]
					    = ((((i_1897_ & 0xff00ff) * i_1898_
						 + ((i_1900_ & 0xff00ff)
						    * i_1899_))
						& ~0xff00ff)
					       + (((i_1897_ & 0xff00) * i_1898_
						   + ((i_1900_ & 0xff00)
						      * i_1899_))
						  & 0xff0000)) >> 8;
				    }
				    if (bool_1830_ && bool_1839_)
					fs[i_1848_] = f;
				}
				i_1840_ += i_1844_;
				i_1848_++;
			    }
			    i_1841_ += i_1845_;
			    i_1840_ = i_1893_;
			    i_1848_ += i_1849_;
			}
		    } else {
			int i_1901_ = (i_1836_ & 0xff0000) >> 16;
			int i_1902_ = (i_1836_ & 0xff00) >> 8;
			int i_1903_ = i_1836_ & 0xff;
			for (int i_1904_ = -i_1834_; i_1904_ < 0; i_1904_++) {
			    int i_1905_ = (i_1841_ >> 16) * anInt9000;
			    for (int i_1906_ = -i_1833_; i_1906_ < 0;
				 i_1906_++) {
				if (!bool_1830_ || f < fs[i_1848_]) {
				    int i_1907_
					= (anIntArray11426
					   [(i_1840_ >> 16) + i_1905_]);
				    int i_1908_
					= ((i_1907_ >>> 24) * (i_1836_ >>> 24)
					   >> 8);
				    int i_1909_ = 256 - i_1908_;
				    if (i_1908_ != 255) {
					if (bool) {
					    int i_1910_
						= (((i_1907_ & 0xff0000)
						    * i_1901_)
						   & ~0xffffff);
					    int i_1911_
						= ((i_1907_ & 0xff00) * i_1902_
						   & 0xff0000);
					    int i_1912_
						= ((i_1907_ & 0xff) * i_1903_
						   & 0xff00);
					    i_1907_ = (i_1910_ | i_1911_
						       | i_1912_) >>> 8;
					    int i_1913_ = is[i_1848_];
					    is[i_1848_]
						= (((((i_1907_ & 0xff00ff)
						      * i_1908_)
						     + ((i_1913_ & 0xff00ff)
							* i_1909_))
						    & ~0xff00ff)
						   + ((((i_1907_ & 0xff00)
							* i_1908_)
						       + ((i_1913_ & 0xff00)
							  * i_1909_))
						      & 0xff0000)) >> 8;
					    if (bool_1831_) {
						int i_1914_ = ((i_1913_ >>> 24)
							       + i_1908_);
						if (i_1914_ > 255)
						    i_1914_ = 255;
						is[i_1848_] |= i_1914_ << 24;
					    }
					}
					if (bool_1830_ && bool_1839_)
					    fs[i_1848_] = f;
				    } else {
					if (bool) {
					    int i_1915_
						= (((i_1907_ & 0xff0000)
						    * i_1901_)
						   & ~0xffffff);
					    int i_1916_
						= ((i_1907_ & 0xff00) * i_1902_
						   & 0xff0000);
					    int i_1917_
						= ((i_1907_ & 0xff) * i_1903_
						   & 0xff00);
					    is[i_1848_] = (i_1915_ | i_1916_
							   | i_1917_) >>> 8;
					}
					if (bool_1830_ && bool_1839_)
					    fs[i_1848_] = f;
				    }
				}
				i_1840_ += i_1844_;
				i_1848_++;
			    }
			    i_1841_ += i_1845_;
			    i_1840_ = i_1893_;
			    i_1848_ += i_1849_;
			}
		    }
		} else if (i_1835_ == 3) {
		    int i_1918_ = i_1840_;
		    for (int i_1919_ = -i_1834_; i_1919_ < 0; i_1919_++) {
			int i_1920_ = (i_1841_ >> 16) * anInt9000;
			for (int i_1921_ = -i_1833_; i_1921_ < 0; i_1921_++) {
			    if (!bool_1830_ || f < fs[i_1848_]) {
				if (bool) {
				    int i_1922_
					= (anIntArray11426
					   [(i_1840_ >> 16) + i_1920_]);
				    int i_1923_ = i_1922_ + i_1836_;
				    int i_1924_ = ((i_1922_ & 0xff00ff)
						   + (i_1836_ & 0xff00ff));
				    int i_1925_
					= ((i_1924_ & 0x1000100)
					   + (i_1923_ - i_1924_ & 0x10000));
				    i_1925_ = (i_1923_ - i_1925_
					       | i_1925_ - (i_1925_ >>> 8));
				    int i_1926_
					= ((i_1925_ >>> 24) * (i_1836_ >>> 24)
					   >> 8);
				    int i_1927_ = 256 - i_1926_;
				    if (i_1926_ != 255) {
					i_1922_ = i_1925_;
					i_1925_ = is[i_1848_];
					i_1925_
					    = ((((i_1922_ & 0xff00ff) * i_1926_
						 + ((i_1925_ & 0xff00ff)
						    * i_1927_))
						& ~0xff00ff)
					       + (((i_1922_ & 0xff00) * i_1926_
						   + ((i_1925_ & 0xff00)
						      * i_1927_))
						  & 0xff0000)) >> 8;
				    }
				    is[i_1848_] = i_1925_;
				}
				if (bool_1830_ && bool_1839_)
				    fs[i_1848_] = f;
			    }
			    i_1840_ += i_1844_;
			    i_1848_++;
			}
			i_1841_ += i_1845_;
			i_1840_ = i_1918_;
			i_1848_ += i_1849_;
		    }
		} else if (i_1835_ == 2) {
		    int i_1928_ = i_1836_ >>> 24;
		    int i_1929_ = 256 - i_1928_;
		    int i_1930_ = (i_1836_ & 0xff00ff) * i_1929_ & ~0xff00ff;
		    int i_1931_ = (i_1836_ & 0xff00) * i_1929_ & 0xff0000;
		    i_1836_ = (i_1930_ | i_1931_) >>> 8;
		    int i_1932_ = i_1840_;
		    for (int i_1933_ = -i_1834_; i_1933_ < 0; i_1933_++) {
			int i_1934_ = (i_1841_ >> 16) * anInt9000;
			for (int i_1935_ = -i_1833_; i_1935_ < 0; i_1935_++) {
			    if (!bool_1830_ || f < fs[i_1848_]) {
				if (bool) {
				    int i_1936_
					= (anIntArray11426
					   [(i_1840_ >> 16) + i_1934_]);
				    int i_1937_ = i_1936_ >>> 24;
				    int i_1938_ = 256 - i_1937_;
				    i_1930_ = ((i_1936_ & 0xff00ff) * i_1928_
					       & ~0xff00ff);
				    i_1931_ = ((i_1936_ & 0xff00) * i_1928_
					       & 0xff0000);
				    i_1936_ = (((i_1930_ | i_1931_) >>> 8)
					       + i_1836_);
				    int i_1939_ = is[i_1848_];
				    is[i_1848_]
					= ((((i_1936_ & 0xff00ff) * i_1937_
					     + (i_1939_ & 0xff00ff) * i_1938_)
					    & ~0xff00ff)
					   + (((i_1936_ & 0xff00) * i_1937_
					       + (i_1939_ & 0xff00) * i_1938_)
					      & 0xff0000)) >> 8;
				}
				if (bool_1830_ && bool_1839_)
				    fs[i_1848_] = f;
			    }
			    i_1840_ += i_1844_;
			    i_1848_++;
			}
			i_1841_ += i_1845_;
			i_1840_ = i_1932_;
			i_1848_ += i_1849_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_1837_ == 2) {
		if (i_1835_ == 1) {
		    int i_1940_ = i_1840_;
		    for (int i_1941_ = -i_1834_; i_1941_ < 0; i_1941_++) {
			int i_1942_ = (i_1841_ >> 16) * anInt9000;
			for (int i_1943_ = -i_1833_; i_1943_ < 0; i_1943_++) {
			    if (!bool_1830_ || f < fs[i_1848_]) {
				int i_1944_ = (anIntArray11426
					       [(i_1840_ >> 16) + i_1942_]);
				if (i_1944_ != 0) {
				    if (bool) {
					int i_1945_ = is[i_1848_];
					int i_1946_ = i_1944_ + i_1945_;
					int i_1947_ = ((i_1944_ & 0xff00ff)
						       + (i_1945_ & 0xff00ff));
					i_1945_ = ((i_1947_ & 0x1000100)
						   + (i_1946_ - i_1947_
						      & 0x10000));
					is[i_1848_]
					    = (i_1946_ - i_1945_
					       | i_1945_ - (i_1945_ >>> 8));
				    }
				    if (bool_1830_ && bool_1839_)
					fs[i_1848_] = f;
				}
			    }
			    i_1840_ += i_1844_;
			    i_1848_++;
			}
			i_1841_ += i_1845_;
			i_1840_ = i_1940_;
			i_1848_ += i_1849_;
		    }
		} else if (i_1835_ == 0) {
		    int i_1948_ = i_1840_;
		    int i_1949_ = (i_1836_ & 0xff0000) >> 16;
		    int i_1950_ = (i_1836_ & 0xff00) >> 8;
		    int i_1951_ = i_1836_ & 0xff;
		    for (int i_1952_ = -i_1834_; i_1952_ < 0; i_1952_++) {
			int i_1953_ = (i_1841_ >> 16) * anInt9000;
			for (int i_1954_ = -i_1833_; i_1954_ < 0; i_1954_++) {
			    if (!bool_1830_ || f < fs[i_1848_]) {
				int i_1955_ = (anIntArray11426
					       [(i_1840_ >> 16) + i_1953_]);
				if (i_1955_ != 0) {
				    if (bool) {
					int i_1956_
					    = ((i_1955_ & 0xff0000) * i_1949_
					       & ~0xffffff);
					int i_1957_
					    = ((i_1955_ & 0xff00) * i_1950_
					       & 0xff0000);
					int i_1958_
					    = ((i_1955_ & 0xff) * i_1951_
					       & 0xff00);
					i_1955_ = (i_1956_ | i_1957_
						   | i_1958_) >>> 8;
					int i_1959_ = is[i_1848_];
					int i_1960_ = i_1955_ + i_1959_;
					int i_1961_ = ((i_1955_ & 0xff00ff)
						       + (i_1959_ & 0xff00ff));
					i_1959_ = ((i_1961_ & 0x1000100)
						   + (i_1960_ - i_1961_
						      & 0x10000));
					is[i_1848_]
					    = (i_1960_ - i_1959_
					       | i_1959_ - (i_1959_ >>> 8));
				    }
				    if (bool_1830_ && bool_1839_)
					fs[i_1848_] = f;
				}
			    }
			    i_1840_ += i_1844_;
			    i_1848_++;
			}
			i_1841_ += i_1845_;
			i_1840_ = i_1948_;
			i_1848_ += i_1849_;
		    }
		} else if (i_1835_ == 3) {
		    int i_1962_ = i_1840_;
		    for (int i_1963_ = -i_1834_; i_1963_ < 0; i_1963_++) {
			int i_1964_ = (i_1841_ >> 16) * anInt9000;
			for (int i_1965_ = -i_1833_; i_1965_ < 0; i_1965_++) {
			    if (!bool_1830_ || f < fs[i_1848_]) {
				if (bool) {
				    int i_1966_
					= (anIntArray11426
					   [(i_1840_ >> 16) + i_1964_]);
				    int i_1967_ = i_1966_ + i_1836_;
				    int i_1968_ = ((i_1966_ & 0xff00ff)
						   + (i_1836_ & 0xff00ff));
				    int i_1969_
					= ((i_1968_ & 0x1000100)
					   + (i_1967_ - i_1968_ & 0x10000));
				    i_1966_ = (i_1967_ - i_1969_
					       | i_1969_ - (i_1969_ >>> 8));
				    i_1969_ = is[i_1848_];
				    i_1967_ = i_1966_ + i_1969_;
				    i_1968_
					= (i_1966_ & 0xff00ff) + (i_1969_
								  & 0xff00ff);
				    i_1969_
					= ((i_1968_ & 0x1000100)
					   + (i_1967_ - i_1968_ & 0x10000));
				    is[i_1848_]
					= (i_1967_ - i_1969_
					   | i_1969_ - (i_1969_ >>> 8));
				}
				if (bool_1830_ && bool_1839_)
				    fs[i_1848_] = f;
			    }
			    i_1840_ += i_1844_;
			    i_1848_++;
			}
			i_1841_ += i_1845_;
			i_1840_ = i_1962_;
			i_1848_ += i_1849_;
		    }
		} else if (i_1835_ == 2) {
		    int i_1970_ = i_1836_ >>> 24;
		    int i_1971_ = 256 - i_1970_;
		    int i_1972_ = (i_1836_ & 0xff00ff) * i_1971_ & ~0xff00ff;
		    int i_1973_ = (i_1836_ & 0xff00) * i_1971_ & 0xff0000;
		    i_1836_ = (i_1972_ | i_1973_) >>> 8;
		    int i_1974_ = i_1840_;
		    for (int i_1975_ = -i_1834_; i_1975_ < 0; i_1975_++) {
			int i_1976_ = (i_1841_ >> 16) * anInt9000;
			for (int i_1977_ = -i_1833_; i_1977_ < 0; i_1977_++) {
			    if (!bool_1830_ || f < fs[i_1848_]) {
				int i_1978_ = (anIntArray11426
					       [(i_1840_ >> 16) + i_1976_]);
				if (i_1978_ != 0) {
				    if (bool) {
					i_1972_
					    = ((i_1978_ & 0xff00ff) * i_1970_
					       & ~0xff00ff);
					i_1973_ = ((i_1978_ & 0xff00) * i_1970_
						   & 0xff0000);
					i_1978_ = (((i_1972_ | i_1973_) >>> 8)
						   + i_1836_);
					int i_1979_ = is[i_1848_];
					int i_1980_ = i_1978_ + i_1979_;
					int i_1981_ = ((i_1978_ & 0xff00ff)
						       + (i_1979_ & 0xff00ff));
					i_1979_ = ((i_1981_ & 0x1000100)
						   + (i_1980_ - i_1981_
						      & 0x10000));
					is[i_1848_]
					    = (i_1980_ - i_1979_
					       | i_1979_ - (i_1979_ >>> 8));
				    }
				    if (bool_1830_ && bool_1839_)
					fs[i_1848_] = f;
				}
			    }
			    i_1840_ += i_1844_;
			    i_1848_++;
			}
			i_1841_ += i_1845_;
			i_1840_ = i_1974_;
			i_1848_ += i_1849_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    public void method2545(int i, int i_1982_, int i_1983_, int i_1984_,
			   int i_1985_) {
	if (aClass182_Sub2_9033.method15226())
	    throw new IllegalStateException();
	int[] is = aClass182_Sub2_9033.anIntArray9466;
	if (is != null) {
	    int i_1986_ = aClass182_Sub2_9033.anInt9494 * -476035351;
	    i += anInt9002;
	    i_1982_ += anInt9003;
	    int i_1987_ = i_1982_ * i_1986_ + i;
	    int i_1988_ = 0;
	    int i_1989_ = anInt9001;
	    int i_1990_ = anInt9000;
	    int i_1991_ = i_1986_ - i_1990_;
	    int i_1992_ = 0;
	    if (i_1982_ < aClass182_Sub2_9033.anInt9472 * 1722112305) {
		int i_1993_
		    = aClass182_Sub2_9033.anInt9472 * 1722112305 - i_1982_;
		i_1989_ -= i_1993_;
		i_1982_ = aClass182_Sub2_9033.anInt9472 * 1722112305;
		i_1988_ += i_1993_ * i_1990_;
		i_1987_ += i_1993_ * i_1986_;
	    }
	    if (i_1982_ + i_1989_ > aClass182_Sub2_9033.anInt9473 * 1920901985)
		i_1989_ -= (i_1982_ + i_1989_
			    - aClass182_Sub2_9033.anInt9473 * 1920901985);
	    if (i < aClass182_Sub2_9033.anInt9470 * 1988019027) {
		int i_1994_ = aClass182_Sub2_9033.anInt9470 * 1988019027 - i;
		i_1990_ -= i_1994_;
		i = aClass182_Sub2_9033.anInt9470 * 1988019027;
		i_1988_ += i_1994_;
		i_1987_ += i_1994_;
		i_1992_ += i_1994_;
		i_1991_ += i_1994_;
	    }
	    if (i + i_1990_ > aClass182_Sub2_9033.anInt9499 * -466178451) {
		int i_1995_
		    = i + i_1990_ - aClass182_Sub2_9033.anInt9499 * -466178451;
		i_1990_ -= i_1995_;
		i_1992_ += i_1995_;
		i_1991_ += i_1995_;
	    }
	    if (i_1990_ > 0 && i_1989_ > 0) {
		if (i_1985_ == 0) {
		    if (i_1983_ == 1) {
			for (int i_1996_ = -i_1989_; i_1996_ < 0; i_1996_++) {
			    int i_1997_ = i_1987_ + i_1990_ - 3;
			    while (i_1987_ < i_1997_) {
				is[i_1987_++] = anIntArray11426[i_1988_++];
				is[i_1987_++] = anIntArray11426[i_1988_++];
				is[i_1987_++] = anIntArray11426[i_1988_++];
				is[i_1987_++] = anIntArray11426[i_1988_++];
			    }
			    i_1997_ += 3;
			    while (i_1987_ < i_1997_)
				is[i_1987_++] = anIntArray11426[i_1988_++];
			    i_1987_ += i_1991_;
			    i_1988_ += i_1992_;
			}
		    } else if (i_1983_ == 0) {
			int i_1998_ = (i_1984_ & 0xff0000) >> 16;
			int i_1999_ = (i_1984_ & 0xff00) >> 8;
			int i_2000_ = i_1984_ & 0xff;
			for (int i_2001_ = -i_1989_; i_2001_ < 0; i_2001_++) {
			    for (int i_2002_ = -i_1990_; i_2002_ < 0;
				 i_2002_++) {
				int i_2003_ = anIntArray11426[i_1988_++];
				int i_2004_ = ((i_2003_ & 0xff0000) * i_1998_
					       & ~0xffffff);
				int i_2005_
				    = (i_2003_ & 0xff00) * i_1999_ & 0xff0000;
				int i_2006_
				    = (i_2003_ & 0xff) * i_2000_ & 0xff00;
				is[i_1987_++]
				    = (i_2004_ | i_2005_ | i_2006_) >>> 8;
			    }
			    i_1987_ += i_1991_;
			    i_1988_ += i_1992_;
			}
		    } else if (i_1983_ == 3) {
			for (int i_2007_ = -i_1989_; i_2007_ < 0; i_2007_++) {
			    for (int i_2008_ = -i_1990_; i_2008_ < 0;
				 i_2008_++) {
				int i_2009_ = anIntArray11426[i_1988_++];
				int i_2010_ = i_2009_ + i_1984_;
				int i_2011_ = ((i_2009_ & 0xff00ff)
					       + (i_1984_ & 0xff00ff));
				int i_2012_
				    = ((i_2011_ & 0x1000100)
				       + (i_2010_ - i_2011_ & 0x10000));
				is[i_1987_++]
				    = i_2010_ - i_2012_ | i_2012_ - (i_2012_
								     >>> 8);
			    }
			    i_1987_ += i_1991_;
			    i_1988_ += i_1992_;
			}
		    } else if (i_1983_ == 2) {
			int i_2013_ = i_1984_ >>> 24;
			int i_2014_ = 256 - i_2013_;
			int i_2015_
			    = (i_1984_ & 0xff00ff) * i_2014_ & ~0xff00ff;
			int i_2016_ = (i_1984_ & 0xff00) * i_2014_ & 0xff0000;
			i_1984_ = (i_2015_ | i_2016_) >>> 8;
			for (int i_2017_ = -i_1989_; i_2017_ < 0; i_2017_++) {
			    for (int i_2018_ = -i_1990_; i_2018_ < 0;
				 i_2018_++) {
				int i_2019_ = anIntArray11426[i_1988_++];
				i_2015_ = ((i_2019_ & 0xff00ff) * i_2013_
					   & ~0xff00ff);
				i_2016_
				    = (i_2019_ & 0xff00) * i_2013_ & 0xff0000;
				is[i_1987_++]
				    = ((i_2015_ | i_2016_) >>> 8) + i_1984_;
			    }
			    i_1987_ += i_1991_;
			    i_1988_ += i_1992_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1985_ == 1) {
		    if (i_1983_ == 1) {
			for (int i_2020_ = -i_1989_; i_2020_ < 0; i_2020_++) {
			    for (int i_2021_ = -i_1990_; i_2021_ < 0;
				 i_2021_++) {
				int i_2022_ = anIntArray11426[i_1988_++];
				int i_2023_ = i_2022_ >>> 24;
				int i_2024_ = 256 - i_2023_;
				int i_2025_ = is[i_1987_];
				is[i_1987_++]
				    = (((((i_2022_ & 0xff00ff) * i_2023_
					  + (i_2025_ & 0xff00ff) * i_2024_)
					 & ~0xff00ff)
					>> 8)
				       + (((((i_2022_ & ~0xff00ff) >>> 8)
					    * i_2023_)
					   + (((i_2025_ & ~0xff00ff) >>> 8)
					      * i_2024_))
					  & ~0xff00ff));
			    }
			    i_1987_ += i_1991_;
			    i_1988_ += i_1992_;
			}
		    } else if (i_1983_ == 0) {
			if ((i_1984_ & 0xffffff) == 16777215) {
			    for (int i_2026_ = -i_1989_; i_2026_ < 0;
				 i_2026_++) {
				for (int i_2027_ = -i_1990_; i_2027_ < 0;
				     i_2027_++) {
				    int i_2028_ = anIntArray11426[i_1988_++];
				    int i_2029_
					= ((i_2028_ >>> 24) * (i_1984_ >>> 24)
					   >> 8);
				    int i_2030_ = 256 - i_2029_;
				    int i_2031_ = is[i_1987_];
				    is[i_1987_++]
					= ((((i_2028_ & 0xff00ff) * i_2029_
					     + (i_2031_ & 0xff00ff) * i_2030_)
					    & ~0xff00ff)
					   + (((i_2028_ & 0xff00) * i_2029_
					       + (i_2031_ & 0xff00) * i_2030_)
					      & 0xff0000)) >> 8;
				}
				i_1987_ += i_1991_;
				i_1988_ += i_1992_;
			    }
			} else {
			    int i_2032_ = (i_1984_ & 0xff0000) >> 16;
			    int i_2033_ = (i_1984_ & 0xff00) >> 8;
			    int i_2034_ = i_1984_ & 0xff;
			    for (int i_2035_ = -i_1989_; i_2035_ < 0;
				 i_2035_++) {
				for (int i_2036_ = -i_1990_; i_2036_ < 0;
				     i_2036_++) {
				    int i_2037_ = anIntArray11426[i_1988_++];
				    int i_2038_
					= ((i_2037_ >>> 24) * (i_1984_ >>> 24)
					   >> 8);
				    int i_2039_ = 256 - i_2038_;
				    if (i_2038_ != 255) {
					int i_2040_
					    = ((i_2037_ & 0xff0000) * i_2032_
					       & ~0xffffff);
					int i_2041_
					    = ((i_2037_ & 0xff00) * i_2033_
					       & 0xff0000);
					int i_2042_
					    = ((i_2037_ & 0xff) * i_2034_
					       & 0xff00);
					i_2037_ = (i_2040_ | i_2041_
						   | i_2042_) >>> 8;
					int i_2043_ = is[i_1987_];
					is[i_1987_++]
					    = ((((i_2037_ & 0xff00ff) * i_2038_
						 + ((i_2043_ & 0xff00ff)
						    * i_2039_))
						& ~0xff00ff)
					       + (((i_2037_ & 0xff00) * i_2038_
						   + ((i_2043_ & 0xff00)
						      * i_2039_))
						  & 0xff0000)) >> 8;
				    } else {
					int i_2044_
					    = ((i_2037_ & 0xff0000) * i_2032_
					       & ~0xffffff);
					int i_2045_
					    = ((i_2037_ & 0xff00) * i_2033_
					       & 0xff0000);
					int i_2046_
					    = ((i_2037_ & 0xff) * i_2034_
					       & 0xff00);
					is[i_1987_++] = (i_2044_ | i_2045_
							 | i_2046_) >>> 8;
				    }
				}
				i_1987_ += i_1991_;
				i_1988_ += i_1992_;
			    }
			}
		    } else if (i_1983_ == 3) {
			for (int i_2047_ = -i_1989_; i_2047_ < 0; i_2047_++) {
			    for (int i_2048_ = -i_1990_; i_2048_ < 0;
				 i_2048_++) {
				int i_2049_ = anIntArray11426[i_1988_++];
				int i_2050_ = i_2049_ + i_1984_;
				int i_2051_ = ((i_2049_ & 0xff00ff)
					       + (i_1984_ & 0xff00ff));
				int i_2052_
				    = ((i_2051_ & 0x1000100)
				       + (i_2050_ - i_2051_ & 0x10000));
				i_2052_
				    = i_2050_ - i_2052_ | i_2052_ - (i_2052_
								     >>> 8);
				int i_2053_
				    = (i_2052_ >>> 24) * (i_1984_ >>> 24) >> 8;
				int i_2054_ = 256 - i_2053_;
				if (i_2053_ != 255) {
				    i_2049_ = i_2052_;
				    i_2052_ = is[i_1987_];
				    i_2052_
					= ((((i_2049_ & 0xff00ff) * i_2053_
					     + (i_2052_ & 0xff00ff) * i_2054_)
					    & ~0xff00ff)
					   + (((i_2049_ & 0xff00) * i_2053_
					       + (i_2052_ & 0xff00) * i_2054_)
					      & 0xff0000)) >> 8;
				}
				is[i_1987_++] = i_2052_;
			    }
			    i_1987_ += i_1991_;
			    i_1988_ += i_1992_;
			}
		    } else if (i_1983_ == 2) {
			int i_2055_ = i_1984_ >>> 24;
			int i_2056_ = 256 - i_2055_;
			int i_2057_
			    = (i_1984_ & 0xff00ff) * i_2056_ & ~0xff00ff;
			int i_2058_ = (i_1984_ & 0xff00) * i_2056_ & 0xff0000;
			i_1984_ = (i_2057_ | i_2058_) >>> 8;
			for (int i_2059_ = -i_1989_; i_2059_ < 0; i_2059_++) {
			    for (int i_2060_ = -i_1990_; i_2060_ < 0;
				 i_2060_++) {
				int i_2061_ = anIntArray11426[i_1988_++];
				int i_2062_ = i_2061_ >>> 24;
				int i_2063_ = 256 - i_2062_;
				i_2057_ = ((i_2061_ & 0xff00ff) * i_2055_
					   & ~0xff00ff);
				i_2058_
				    = (i_2061_ & 0xff00) * i_2055_ & 0xff0000;
				i_2061_
				    = ((i_2057_ | i_2058_) >>> 8) + i_1984_;
				int i_2064_ = is[i_1987_];
				is[i_1987_++]
				    = ((((i_2061_ & 0xff00ff) * i_2062_
					 + (i_2064_ & 0xff00ff) * i_2063_)
					& ~0xff00ff)
				       + (((i_2061_ & 0xff00) * i_2062_
					   + (i_2064_ & 0xff00) * i_2063_)
					  & 0xff0000)) >> 8;
			    }
			    i_1987_ += i_1991_;
			    i_1988_ += i_1992_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1985_ == 2) {
		    if (i_1983_ == 1) {
			for (int i_2065_ = -i_1989_; i_2065_ < 0; i_2065_++) {
			    for (int i_2066_ = -i_1990_; i_2066_ < 0;
				 i_2066_++) {
				int i_2067_ = anIntArray11426[i_1988_++];
				if (i_2067_ != 0) {
				    int i_2068_ = is[i_1987_];
				    int i_2069_ = i_2067_ + i_2068_;
				    int i_2070_ = ((i_2067_ & 0xff00ff)
						   + (i_2068_ & 0xff00ff));
				    i_2068_
					= ((i_2070_ & 0x1000100)
					   + (i_2069_ - i_2070_ & 0x10000));
				    is[i_1987_++]
					= (i_2069_ - i_2068_
					   | i_2068_ - (i_2068_ >>> 8));
				} else
				    i_1987_++;
			    }
			    i_1987_ += i_1991_;
			    i_1988_ += i_1992_;
			}
		    } else if (i_1983_ == 0) {
			int i_2071_ = (i_1984_ & 0xff0000) >> 16;
			int i_2072_ = (i_1984_ & 0xff00) >> 8;
			int i_2073_ = i_1984_ & 0xff;
			for (int i_2074_ = -i_1989_; i_2074_ < 0; i_2074_++) {
			    for (int i_2075_ = -i_1990_; i_2075_ < 0;
				 i_2075_++) {
				int i_2076_ = anIntArray11426[i_1988_++];
				if (i_2076_ != 0) {
				    int i_2077_
					= ((i_2076_ & 0xff0000) * i_2071_
					   & ~0xffffff);
				    int i_2078_ = ((i_2076_ & 0xff00) * i_2072_
						   & 0xff0000);
				    int i_2079_
					= (i_2076_ & 0xff) * i_2073_ & 0xff00;
				    i_2076_
					= (i_2077_ | i_2078_ | i_2079_) >>> 8;
				    int i_2080_ = is[i_1987_];
				    int i_2081_ = i_2076_ + i_2080_;
				    int i_2082_ = ((i_2076_ & 0xff00ff)
						   + (i_2080_ & 0xff00ff));
				    i_2080_
					= ((i_2082_ & 0x1000100)
					   + (i_2081_ - i_2082_ & 0x10000));
				    is[i_1987_++]
					= (i_2081_ - i_2080_
					   | i_2080_ - (i_2080_ >>> 8));
				} else
				    i_1987_++;
			    }
			    i_1987_ += i_1991_;
			    i_1988_ += i_1992_;
			}
		    } else if (i_1983_ == 3) {
			for (int i_2083_ = -i_1989_; i_2083_ < 0; i_2083_++) {
			    for (int i_2084_ = -i_1990_; i_2084_ < 0;
				 i_2084_++) {
				int i_2085_ = anIntArray11426[i_1988_++];
				int i_2086_ = i_2085_ + i_1984_;
				int i_2087_ = ((i_2085_ & 0xff00ff)
					       + (i_1984_ & 0xff00ff));
				int i_2088_
				    = ((i_2087_ & 0x1000100)
				       + (i_2086_ - i_2087_ & 0x10000));
				i_2085_
				    = i_2086_ - i_2088_ | i_2088_ - (i_2088_
								     >>> 8);
				i_2088_ = is[i_1987_];
				i_2086_ = i_2085_ + i_2088_;
				i_2087_ = (i_2085_ & 0xff00ff) + (i_2088_
								  & 0xff00ff);
				i_2088_ = ((i_2087_ & 0x1000100)
					   + (i_2086_ - i_2087_ & 0x10000));
				is[i_1987_++]
				    = i_2086_ - i_2088_ | i_2088_ - (i_2088_
								     >>> 8);
			    }
			    i_1987_ += i_1991_;
			    i_1988_ += i_1992_;
			}
		    } else if (i_1983_ == 2) {
			int i_2089_ = i_1984_ >>> 24;
			int i_2090_ = 256 - i_2089_;
			int i_2091_
			    = (i_1984_ & 0xff00ff) * i_2090_ & ~0xff00ff;
			int i_2092_ = (i_1984_ & 0xff00) * i_2090_ & 0xff0000;
			i_1984_ = (i_2091_ | i_2092_) >>> 8;
			for (int i_2093_ = -i_1989_; i_2093_ < 0; i_2093_++) {
			    for (int i_2094_ = -i_1990_; i_2094_ < 0;
				 i_2094_++) {
				int i_2095_ = anIntArray11426[i_1988_++];
				if (i_2095_ != 0) {
				    i_2091_ = ((i_2095_ & 0xff00ff) * i_2089_
					       & ~0xff00ff);
				    i_2092_ = ((i_2095_ & 0xff00) * i_2089_
					       & 0xff0000);
				    i_2095_ = (((i_2091_ | i_2092_) >>> 8)
					       + i_1984_);
				    int i_2096_ = is[i_1987_];
				    int i_2097_ = i_2095_ + i_2096_;
				    int i_2098_ = ((i_2095_ & 0xff00ff)
						   + (i_2096_ & 0xff00ff));
				    i_2096_
					= ((i_2098_ & 0x1000100)
					   + (i_2097_ - i_2098_ & 0x10000));
				    is[i_1987_++]
					= (i_2097_ - i_2096_
					   | i_2096_ - (i_2096_ >>> 8));
				} else
				    i_1987_++;
			    }
			    i_1987_ += i_1991_;
			    i_1988_ += i_1992_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    public void method2497(int i, int i_2099_, int i_2100_, int i_2101_,
			   int i_2102_, int i_2103_) {
	int[] is = aClass182_Sub2_9033.anIntArray9466;
	if (is == null)
	    throw new IllegalStateException("");
	for (int i_2104_ = 0; i_2104_ < i_2101_; i_2104_++) {
	    int i_2105_ = (i_2099_ + i_2104_) * i_2100_ + i;
	    int i_2106_ = (i_2103_ + i_2104_) * i_2100_ + i_2102_;
	    for (int i_2107_ = 0; i_2107_ < i_2100_; i_2107_++)
		anIntArray11426[i_2105_ + i_2107_]
		    = is[i_2106_ + i_2107_] & 0xffffff;
	}
    }
    
    void method14537(boolean bool, boolean bool_2108_, boolean bool_2109_,
		     int i, int i_2110_, float f, int i_2111_, int i_2112_,
		     int i_2113_, int i_2114_, int i_2115_, int i_2116_,
		     boolean bool_2117_) {
	if (i_2111_ > 0 && i_2112_ > 0 && (bool || bool_2108_)) {
	    int i_2118_ = 0;
	    int i_2119_ = 0;
	    int i_2120_ = anInt9002 + anInt9000 + anInt9004;
	    int i_2121_ = anInt9003 + anInt9001 + anInt9005;
	    int i_2122_ = (i_2120_ << 16) / i_2111_;
	    int i_2123_ = (i_2121_ << 16) / i_2112_;
	    if (anInt9002 > 0) {
		int i_2124_ = ((anInt9002 << 16) + i_2122_ - 1) / i_2122_;
		i += i_2124_;
		i_2118_ += i_2124_ * i_2122_ - (anInt9002 << 16);
	    }
	    if (anInt9003 > 0) {
		int i_2125_ = ((anInt9003 << 16) + i_2123_ - 1) / i_2123_;
		i_2110_ += i_2125_;
		i_2119_ += i_2125_ * i_2123_ - (anInt9003 << 16);
	    }
	    if (anInt9000 < i_2120_)
		i_2111_
		    = ((anInt9000 << 16) - i_2118_ + i_2122_ - 1) / i_2122_;
	    if (anInt9001 < i_2121_)
		i_2112_
		    = ((anInt9001 << 16) - i_2119_ + i_2123_ - 1) / i_2123_;
	    int i_2126_
		= i + i_2110_ * (aClass182_Sub2_9033.anInt9494 * -476035351);
	    int i_2127_ = aClass182_Sub2_9033.anInt9494 * -476035351 - i_2111_;
	    if (i_2110_ + i_2112_ > aClass182_Sub2_9033.anInt9473 * 1920901985)
		i_2112_ -= (i_2110_ + i_2112_
			    - aClass182_Sub2_9033.anInt9473 * 1920901985);
	    if (i_2110_ < aClass182_Sub2_9033.anInt9472 * 1722112305) {
		int i_2128_
		    = aClass182_Sub2_9033.anInt9472 * 1722112305 - i_2110_;
		i_2112_ -= i_2128_;
		i_2126_
		    += i_2128_ * (aClass182_Sub2_9033.anInt9494 * -476035351);
		i_2119_ += i_2123_ * i_2128_;
	    }
	    if (i + i_2111_ > aClass182_Sub2_9033.anInt9499 * -466178451) {
		int i_2129_
		    = i + i_2111_ - aClass182_Sub2_9033.anInt9499 * -466178451;
		i_2111_ -= i_2129_;
		i_2127_ += i_2129_;
	    }
	    if (i < aClass182_Sub2_9033.anInt9470 * 1988019027) {
		int i_2130_ = aClass182_Sub2_9033.anInt9470 * 1988019027 - i;
		i_2111_ -= i_2130_;
		i_2126_ += i_2130_;
		i_2118_ += i_2122_ * i_2130_;
		i_2127_ += i_2130_;
	    }
	    float[] fs = aClass182_Sub2_9033.aFloatArray9469;
	    int[] is = aClass182_Sub2_9033.anIntArray9466;
	    if (i_2115_ == 0) {
		if (i_2113_ == 1) {
		    int i_2131_ = i_2118_;
		    for (int i_2132_ = -i_2112_; i_2132_ < 0; i_2132_++) {
			int i_2133_ = (i_2119_ >> 16) * anInt9000;
			for (int i_2134_ = -i_2111_; i_2134_ < 0; i_2134_++) {
			    if (!bool_2108_ || f < fs[i_2126_]) {
				if (bool)
				    is[i_2126_]
					= (anIntArray11426
					   [(i_2118_ >> 16) + i_2133_]);
				if (bool_2108_ && bool_2117_)
				    fs[i_2126_] = f;
			    }
			    i_2118_ += i_2122_;
			    i_2126_++;
			}
			i_2119_ += i_2123_;
			i_2118_ = i_2131_;
			i_2126_ += i_2127_;
		    }
		} else if (i_2113_ == 0) {
		    int i_2135_ = (i_2114_ & 0xff0000) >> 16;
		    int i_2136_ = (i_2114_ & 0xff00) >> 8;
		    int i_2137_ = i_2114_ & 0xff;
		    int i_2138_ = i_2118_;
		    for (int i_2139_ = -i_2112_; i_2139_ < 0; i_2139_++) {
			int i_2140_ = (i_2119_ >> 16) * anInt9000;
			for (int i_2141_ = -i_2111_; i_2141_ < 0; i_2141_++) {
			    if (!bool_2108_ || f < fs[i_2126_]) {
				if (bool) {
				    int i_2142_
					= (anIntArray11426
					   [(i_2118_ >> 16) + i_2140_]);
				    int i_2143_
					= ((i_2142_ & 0xff0000) * i_2135_
					   & ~0xffffff);
				    int i_2144_ = ((i_2142_ & 0xff00) * i_2136_
						   & 0xff0000);
				    int i_2145_
					= (i_2142_ & 0xff) * i_2137_ & 0xff00;
				    is[i_2126_]
					= (i_2143_ | i_2144_ | i_2145_) >>> 8;
				}
				if (bool_2108_ && bool_2117_)
				    fs[i_2126_] = f;
			    }
			    i_2118_ += i_2122_;
			    i_2126_++;
			}
			i_2119_ += i_2123_;
			i_2118_ = i_2138_;
			i_2126_ += i_2127_;
		    }
		} else if (i_2113_ == 3) {
		    int i_2146_ = i_2118_;
		    for (int i_2147_ = -i_2112_; i_2147_ < 0; i_2147_++) {
			int i_2148_ = (i_2119_ >> 16) * anInt9000;
			for (int i_2149_ = -i_2111_; i_2149_ < 0; i_2149_++) {
			    if (!bool_2108_ || f < fs[i_2126_]) {
				if (bool) {
				    int i_2150_
					= (anIntArray11426
					   [(i_2118_ >> 16) + i_2148_]);
				    int i_2151_ = i_2150_ + i_2114_;
				    int i_2152_ = ((i_2150_ & 0xff00ff)
						   + (i_2114_ & 0xff00ff));
				    int i_2153_
					= ((i_2152_ & 0x1000100)
					   + (i_2151_ - i_2152_ & 0x10000));
				    is[i_2126_]
					= (i_2151_ - i_2153_
					   | i_2153_ - (i_2153_ >>> 8));
				}
				if (bool_2108_ && bool_2117_)
				    fs[i_2126_] = f;
			    }
			    i_2118_ += i_2122_;
			    i_2126_++;
			}
			i_2119_ += i_2123_;
			i_2118_ = i_2146_;
			i_2126_ += i_2127_;
		    }
		} else if (i_2113_ == 2) {
		    int i_2154_ = i_2114_ >>> 24;
		    int i_2155_ = 256 - i_2154_;
		    int i_2156_ = (i_2114_ & 0xff00ff) * i_2155_ & ~0xff00ff;
		    int i_2157_ = (i_2114_ & 0xff00) * i_2155_ & 0xff0000;
		    i_2114_ = (i_2156_ | i_2157_) >>> 8;
		    int i_2158_ = i_2118_;
		    for (int i_2159_ = -i_2112_; i_2159_ < 0; i_2159_++) {
			int i_2160_ = (i_2119_ >> 16) * anInt9000;
			for (int i_2161_ = -i_2111_; i_2161_ < 0; i_2161_++) {
			    if (!bool_2108_ || f < fs[i_2126_]) {
				if (bool) {
				    int i_2162_
					= (anIntArray11426
					   [(i_2118_ >> 16) + i_2160_]);
				    i_2156_ = ((i_2162_ & 0xff00ff) * i_2154_
					       & ~0xff00ff);
				    i_2157_ = ((i_2162_ & 0xff00) * i_2154_
					       & 0xff0000);
				    is[i_2126_] = (((i_2156_ | i_2157_) >>> 8)
						   + i_2114_);
				}
				if (bool_2108_ && bool_2117_)
				    fs[i_2126_] = f;
			    }
			    i_2118_ += i_2122_;
			    i_2126_++;
			}
			i_2119_ += i_2123_;
			i_2118_ = i_2158_;
			i_2126_ += i_2127_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_2115_ == 1) {
		if (i_2113_ == 1) {
		    int i_2163_ = i_2118_;
		    for (int i_2164_ = -i_2112_; i_2164_ < 0; i_2164_++) {
			int i_2165_ = (i_2119_ >> 16) * anInt9000;
			for (int i_2166_ = -i_2111_; i_2166_ < 0; i_2166_++) {
			    if (!bool_2108_ || f < fs[i_2126_]) {
				if (bool) {
				    int i_2167_
					= (anIntArray11426
					   [(i_2118_ >> 16) + i_2165_]);
				    int i_2168_ = i_2167_ >>> 24;
				    int i_2169_ = 256 - i_2168_;
				    int i_2170_ = is[i_2126_];
				    is[i_2126_]
					= (((((i_2167_ & 0xff00ff) * i_2168_
					      + (i_2170_ & 0xff00ff) * i_2169_)
					     & ~0xff00ff)
					    >> 8)
					   + (((((i_2167_ & ~0xff00ff) >>> 8)
						* i_2168_)
					       + (((i_2170_ & ~0xff00ff) >>> 8)
						  * i_2169_))
					      & ~0xff00ff));
				}
				if (bool_2108_ && bool_2117_)
				    fs[i_2126_] = f;
			    }
			    i_2118_ += i_2122_;
			    i_2126_++;
			}
			i_2119_ += i_2123_;
			i_2118_ = i_2163_;
			i_2126_ += i_2127_;
		    }
		} else if (i_2113_ == 0) {
		    int i_2171_ = i_2118_;
		    if ((i_2114_ & 0xffffff) == 16777215) {
			for (int i_2172_ = -i_2112_; i_2172_ < 0; i_2172_++) {
			    int i_2173_ = (i_2119_ >> 16) * anInt9000;
			    for (int i_2174_ = -i_2111_; i_2174_ < 0;
				 i_2174_++) {
				if (!bool_2108_ || f < fs[i_2126_]) {
				    if (bool) {
					int i_2175_
					    = (anIntArray11426
					       [(i_2118_ >> 16) + i_2173_]);
					int i_2176_
					    = ((i_2175_ >>> 24) * (i_2114_
								   >>> 24)
					       >> 8);
					int i_2177_ = 256 - i_2176_;
					int i_2178_ = is[i_2126_];
					is[i_2126_]
					    = ((((i_2175_ & 0xff00ff) * i_2176_
						 + ((i_2178_ & 0xff00ff)
						    * i_2177_))
						& ~0xff00ff)
					       + (((i_2175_ & 0xff00) * i_2176_
						   + ((i_2178_ & 0xff00)
						      * i_2177_))
						  & 0xff0000)) >> 8;
				    }
				    if (bool_2108_ && bool_2117_)
					fs[i_2126_] = f;
				}
				i_2118_ += i_2122_;
				i_2126_++;
			    }
			    i_2119_ += i_2123_;
			    i_2118_ = i_2171_;
			    i_2126_ += i_2127_;
			}
		    } else {
			int i_2179_ = (i_2114_ & 0xff0000) >> 16;
			int i_2180_ = (i_2114_ & 0xff00) >> 8;
			int i_2181_ = i_2114_ & 0xff;
			for (int i_2182_ = -i_2112_; i_2182_ < 0; i_2182_++) {
			    int i_2183_ = (i_2119_ >> 16) * anInt9000;
			    for (int i_2184_ = -i_2111_; i_2184_ < 0;
				 i_2184_++) {
				if (!bool_2108_ || f < fs[i_2126_]) {
				    int i_2185_
					= (anIntArray11426
					   [(i_2118_ >> 16) + i_2183_]);
				    int i_2186_
					= ((i_2185_ >>> 24) * (i_2114_ >>> 24)
					   >> 8);
				    int i_2187_ = 256 - i_2186_;
				    if (i_2186_ != 255) {
					if (bool) {
					    int i_2188_
						= (((i_2185_ & 0xff0000)
						    * i_2179_)
						   & ~0xffffff);
					    int i_2189_
						= ((i_2185_ & 0xff00) * i_2180_
						   & 0xff0000);
					    int i_2190_
						= ((i_2185_ & 0xff) * i_2181_
						   & 0xff00);
					    i_2185_ = (i_2188_ | i_2189_
						       | i_2190_) >>> 8;
					    int i_2191_ = is[i_2126_];
					    is[i_2126_]
						= (((((i_2185_ & 0xff00ff)
						      * i_2186_)
						     + ((i_2191_ & 0xff00ff)
							* i_2187_))
						    & ~0xff00ff)
						   + ((((i_2185_ & 0xff00)
							* i_2186_)
						       + ((i_2191_ & 0xff00)
							  * i_2187_))
						      & 0xff0000)) >> 8;
					    if (bool_2109_) {
						int i_2192_ = ((i_2191_ >>> 24)
							       + i_2186_);
						if (i_2192_ > 255)
						    i_2192_ = 255;
						is[i_2126_] |= i_2192_ << 24;
					    }
					}
					if (bool_2108_ && bool_2117_)
					    fs[i_2126_] = f;
				    } else {
					if (bool) {
					    int i_2193_
						= (((i_2185_ & 0xff0000)
						    * i_2179_)
						   & ~0xffffff);
					    int i_2194_
						= ((i_2185_ & 0xff00) * i_2180_
						   & 0xff0000);
					    int i_2195_
						= ((i_2185_ & 0xff) * i_2181_
						   & 0xff00);
					    is[i_2126_] = (i_2193_ | i_2194_
							   | i_2195_) >>> 8;
					}
					if (bool_2108_ && bool_2117_)
					    fs[i_2126_] = f;
				    }
				}
				i_2118_ += i_2122_;
				i_2126_++;
			    }
			    i_2119_ += i_2123_;
			    i_2118_ = i_2171_;
			    i_2126_ += i_2127_;
			}
		    }
		} else if (i_2113_ == 3) {
		    int i_2196_ = i_2118_;
		    for (int i_2197_ = -i_2112_; i_2197_ < 0; i_2197_++) {
			int i_2198_ = (i_2119_ >> 16) * anInt9000;
			for (int i_2199_ = -i_2111_; i_2199_ < 0; i_2199_++) {
			    if (!bool_2108_ || f < fs[i_2126_]) {
				if (bool) {
				    int i_2200_
					= (anIntArray11426
					   [(i_2118_ >> 16) + i_2198_]);
				    int i_2201_ = i_2200_ + i_2114_;
				    int i_2202_ = ((i_2200_ & 0xff00ff)
						   + (i_2114_ & 0xff00ff));
				    int i_2203_
					= ((i_2202_ & 0x1000100)
					   + (i_2201_ - i_2202_ & 0x10000));
				    i_2203_ = (i_2201_ - i_2203_
					       | i_2203_ - (i_2203_ >>> 8));
				    int i_2204_
					= ((i_2203_ >>> 24) * (i_2114_ >>> 24)
					   >> 8);
				    int i_2205_ = 256 - i_2204_;
				    if (i_2204_ != 255) {
					i_2200_ = i_2203_;
					i_2203_ = is[i_2126_];
					i_2203_
					    = ((((i_2200_ & 0xff00ff) * i_2204_
						 + ((i_2203_ & 0xff00ff)
						    * i_2205_))
						& ~0xff00ff)
					       + (((i_2200_ & 0xff00) * i_2204_
						   + ((i_2203_ & 0xff00)
						      * i_2205_))
						  & 0xff0000)) >> 8;
				    }
				    is[i_2126_] = i_2203_;
				}
				if (bool_2108_ && bool_2117_)
				    fs[i_2126_] = f;
			    }
			    i_2118_ += i_2122_;
			    i_2126_++;
			}
			i_2119_ += i_2123_;
			i_2118_ = i_2196_;
			i_2126_ += i_2127_;
		    }
		} else if (i_2113_ == 2) {
		    int i_2206_ = i_2114_ >>> 24;
		    int i_2207_ = 256 - i_2206_;
		    int i_2208_ = (i_2114_ & 0xff00ff) * i_2207_ & ~0xff00ff;
		    int i_2209_ = (i_2114_ & 0xff00) * i_2207_ & 0xff0000;
		    i_2114_ = (i_2208_ | i_2209_) >>> 8;
		    int i_2210_ = i_2118_;
		    for (int i_2211_ = -i_2112_; i_2211_ < 0; i_2211_++) {
			int i_2212_ = (i_2119_ >> 16) * anInt9000;
			for (int i_2213_ = -i_2111_; i_2213_ < 0; i_2213_++) {
			    if (!bool_2108_ || f < fs[i_2126_]) {
				if (bool) {
				    int i_2214_
					= (anIntArray11426
					   [(i_2118_ >> 16) + i_2212_]);
				    int i_2215_ = i_2214_ >>> 24;
				    int i_2216_ = 256 - i_2215_;
				    i_2208_ = ((i_2214_ & 0xff00ff) * i_2206_
					       & ~0xff00ff);
				    i_2209_ = ((i_2214_ & 0xff00) * i_2206_
					       & 0xff0000);
				    i_2214_ = (((i_2208_ | i_2209_) >>> 8)
					       + i_2114_);
				    int i_2217_ = is[i_2126_];
				    is[i_2126_]
					= ((((i_2214_ & 0xff00ff) * i_2215_
					     + (i_2217_ & 0xff00ff) * i_2216_)
					    & ~0xff00ff)
					   + (((i_2214_ & 0xff00) * i_2215_
					       + (i_2217_ & 0xff00) * i_2216_)
					      & 0xff0000)) >> 8;
				}
				if (bool_2108_ && bool_2117_)
				    fs[i_2126_] = f;
			    }
			    i_2118_ += i_2122_;
			    i_2126_++;
			}
			i_2119_ += i_2123_;
			i_2118_ = i_2210_;
			i_2126_ += i_2127_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_2115_ == 2) {
		if (i_2113_ == 1) {
		    int i_2218_ = i_2118_;
		    for (int i_2219_ = -i_2112_; i_2219_ < 0; i_2219_++) {
			int i_2220_ = (i_2119_ >> 16) * anInt9000;
			for (int i_2221_ = -i_2111_; i_2221_ < 0; i_2221_++) {
			    if (!bool_2108_ || f < fs[i_2126_]) {
				int i_2222_ = (anIntArray11426
					       [(i_2118_ >> 16) + i_2220_]);
				if (i_2222_ != 0) {
				    if (bool) {
					int i_2223_ = is[i_2126_];
					int i_2224_ = i_2222_ + i_2223_;
					int i_2225_ = ((i_2222_ & 0xff00ff)
						       + (i_2223_ & 0xff00ff));
					i_2223_ = ((i_2225_ & 0x1000100)
						   + (i_2224_ - i_2225_
						      & 0x10000));
					is[i_2126_]
					    = (i_2224_ - i_2223_
					       | i_2223_ - (i_2223_ >>> 8));
				    }
				    if (bool_2108_ && bool_2117_)
					fs[i_2126_] = f;
				}
			    }
			    i_2118_ += i_2122_;
			    i_2126_++;
			}
			i_2119_ += i_2123_;
			i_2118_ = i_2218_;
			i_2126_ += i_2127_;
		    }
		} else if (i_2113_ == 0) {
		    int i_2226_ = i_2118_;
		    int i_2227_ = (i_2114_ & 0xff0000) >> 16;
		    int i_2228_ = (i_2114_ & 0xff00) >> 8;
		    int i_2229_ = i_2114_ & 0xff;
		    for (int i_2230_ = -i_2112_; i_2230_ < 0; i_2230_++) {
			int i_2231_ = (i_2119_ >> 16) * anInt9000;
			for (int i_2232_ = -i_2111_; i_2232_ < 0; i_2232_++) {
			    if (!bool_2108_ || f < fs[i_2126_]) {
				int i_2233_ = (anIntArray11426
					       [(i_2118_ >> 16) + i_2231_]);
				if (i_2233_ != 0) {
				    if (bool) {
					int i_2234_
					    = ((i_2233_ & 0xff0000) * i_2227_
					       & ~0xffffff);
					int i_2235_
					    = ((i_2233_ & 0xff00) * i_2228_
					       & 0xff0000);
					int i_2236_
					    = ((i_2233_ & 0xff) * i_2229_
					       & 0xff00);
					i_2233_ = (i_2234_ | i_2235_
						   | i_2236_) >>> 8;
					int i_2237_ = is[i_2126_];
					int i_2238_ = i_2233_ + i_2237_;
					int i_2239_ = ((i_2233_ & 0xff00ff)
						       + (i_2237_ & 0xff00ff));
					i_2237_ = ((i_2239_ & 0x1000100)
						   + (i_2238_ - i_2239_
						      & 0x10000));
					is[i_2126_]
					    = (i_2238_ - i_2237_
					       | i_2237_ - (i_2237_ >>> 8));
				    }
				    if (bool_2108_ && bool_2117_)
					fs[i_2126_] = f;
				}
			    }
			    i_2118_ += i_2122_;
			    i_2126_++;
			}
			i_2119_ += i_2123_;
			i_2118_ = i_2226_;
			i_2126_ += i_2127_;
		    }
		} else if (i_2113_ == 3) {
		    int i_2240_ = i_2118_;
		    for (int i_2241_ = -i_2112_; i_2241_ < 0; i_2241_++) {
			int i_2242_ = (i_2119_ >> 16) * anInt9000;
			for (int i_2243_ = -i_2111_; i_2243_ < 0; i_2243_++) {
			    if (!bool_2108_ || f < fs[i_2126_]) {
				if (bool) {
				    int i_2244_
					= (anIntArray11426
					   [(i_2118_ >> 16) + i_2242_]);
				    int i_2245_ = i_2244_ + i_2114_;
				    int i_2246_ = ((i_2244_ & 0xff00ff)
						   + (i_2114_ & 0xff00ff));
				    int i_2247_
					= ((i_2246_ & 0x1000100)
					   + (i_2245_ - i_2246_ & 0x10000));
				    i_2244_ = (i_2245_ - i_2247_
					       | i_2247_ - (i_2247_ >>> 8));
				    i_2247_ = is[i_2126_];
				    i_2245_ = i_2244_ + i_2247_;
				    i_2246_
					= (i_2244_ & 0xff00ff) + (i_2247_
								  & 0xff00ff);
				    i_2247_
					= ((i_2246_ & 0x1000100)
					   + (i_2245_ - i_2246_ & 0x10000));
				    is[i_2126_]
					= (i_2245_ - i_2247_
					   | i_2247_ - (i_2247_ >>> 8));
				}
				if (bool_2108_ && bool_2117_)
				    fs[i_2126_] = f;
			    }
			    i_2118_ += i_2122_;
			    i_2126_++;
			}
			i_2119_ += i_2123_;
			i_2118_ = i_2240_;
			i_2126_ += i_2127_;
		    }
		} else if (i_2113_ == 2) {
		    int i_2248_ = i_2114_ >>> 24;
		    int i_2249_ = 256 - i_2248_;
		    int i_2250_ = (i_2114_ & 0xff00ff) * i_2249_ & ~0xff00ff;
		    int i_2251_ = (i_2114_ & 0xff00) * i_2249_ & 0xff0000;
		    i_2114_ = (i_2250_ | i_2251_) >>> 8;
		    int i_2252_ = i_2118_;
		    for (int i_2253_ = -i_2112_; i_2253_ < 0; i_2253_++) {
			int i_2254_ = (i_2119_ >> 16) * anInt9000;
			for (int i_2255_ = -i_2111_; i_2255_ < 0; i_2255_++) {
			    if (!bool_2108_ || f < fs[i_2126_]) {
				int i_2256_ = (anIntArray11426
					       [(i_2118_ >> 16) + i_2254_]);
				if (i_2256_ != 0) {
				    if (bool) {
					i_2250_
					    = ((i_2256_ & 0xff00ff) * i_2248_
					       & ~0xff00ff);
					i_2251_ = ((i_2256_ & 0xff00) * i_2248_
						   & 0xff0000);
					i_2256_ = (((i_2250_ | i_2251_) >>> 8)
						   + i_2114_);
					int i_2257_ = is[i_2126_];
					int i_2258_ = i_2256_ + i_2257_;
					int i_2259_ = ((i_2256_ & 0xff00ff)
						       + (i_2257_ & 0xff00ff));
					i_2257_ = ((i_2259_ & 0x1000100)
						   + (i_2258_ - i_2259_
						      & 0x10000));
					is[i_2126_]
					    = (i_2258_ - i_2257_
					       | i_2257_ - (i_2257_ >>> 8));
				    }
				    if (bool_2108_ && bool_2117_)
					fs[i_2126_] = f;
				}
			    }
			    i_2118_ += i_2122_;
			    i_2126_++;
			}
			i_2119_ += i_2123_;
			i_2118_ = i_2252_;
			i_2126_ += i_2127_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    void method18029(int i, int i_2260_, int[] is, int i_2261_, int i_2262_) {
	if (i_2262_ == 0) {
	    if (i_2261_ == 1)
		is[i_2260_] = anIntArray11426[i];
	    else if (i_2261_ == 0) {
		int i_2263_ = anIntArray11426[i++];
		int i_2264_ = (i_2263_ & 0xff0000) * anInt9031 & ~0xffffff;
		int i_2265_ = (i_2263_ & 0xff00) * anInt9030 & 0xff0000;
		int i_2266_ = (i_2263_ & 0xff) * anInt9027 & 0xff00;
		is[i_2260_] = (i_2264_ | i_2265_ | i_2266_) >>> 8;
	    } else if (i_2261_ == 3) {
		int i_2267_ = anIntArray11426[i++];
		int i_2268_ = anInt9026;
		int i_2269_ = i_2267_ + i_2268_;
		int i_2270_ = (i_2267_ & 0xff00ff) + (i_2268_ & 0xff00ff);
		int i_2271_
		    = (i_2270_ & 0x1000100) + (i_2269_ - i_2270_ & 0x10000);
		is[i_2260_] = i_2269_ - i_2271_ | i_2271_ - (i_2271_ >>> 8);
	    } else if (i_2261_ == 2) {
		int i_2272_ = anIntArray11426[i];
		int i_2273_ = (i_2272_ & 0xff00ff) * anInt9007 & ~0xff00ff;
		int i_2274_ = (i_2272_ & 0xff00) * anInt9007 & 0xff0000;
		is[i_2260_] = ((i_2273_ | i_2274_) >>> 8) + anInt9034;
	    } else
		throw new IllegalArgumentException();
	} else if (i_2262_ == 1) {
	    if (i_2261_ == 1) {
		int i_2275_ = anIntArray11426[i];
		int i_2276_ = i_2275_ >>> 24;
		int i_2277_ = 256 - i_2276_;
		int i_2278_ = is[i_2260_];
		is[i_2260_] = ((((i_2275_ & 0xff00ff) * i_2276_
				 + (i_2278_ & 0xff00ff) * i_2277_)
				& ~0xff00ff)
			       + (((i_2275_ & 0xff00) * i_2276_
				   + (i_2278_ & 0xff00) * i_2277_)
				  & 0xff0000)) >> 8;
	    } else if (i_2261_ == 0) {
		int i_2279_ = anIntArray11426[i];
		int i_2280_ = (i_2279_ >>> 24) * anInt9007 >> 8;
		int i_2281_ = 256 - i_2280_;
		if ((anInt9026 & 0xffffff) == 16777215) {
		    int i_2282_ = is[i_2260_];
		    is[i_2260_] = ((((i_2279_ & 0xff00ff) * i_2280_
				     + (i_2282_ & 0xff00ff) * i_2281_)
				    & ~0xff00ff)
				   + (((i_2279_ & 0xff00) * i_2280_
				       + (i_2282_ & 0xff00) * i_2281_)
				      & 0xff0000)) >> 8;
		} else if (i_2280_ != 255) {
		    int i_2283_ = (i_2279_ & 0xff0000) * anInt9031 & ~0xffffff;
		    int i_2284_ = (i_2279_ & 0xff00) * anInt9030 & 0xff0000;
		    int i_2285_ = (i_2279_ & 0xff) * anInt9027 & 0xff00;
		    i_2279_ = (i_2283_ | i_2284_ | i_2285_) >>> 8;
		    int i_2286_ = is[i_2260_];
		    is[i_2260_] = ((((i_2279_ & 0xff00ff) * i_2280_
				     + (i_2286_ & 0xff00ff) * i_2281_)
				    & ~0xff00ff)
				   + (((i_2279_ & 0xff00) * i_2280_
				       + (i_2286_ & 0xff00) * i_2281_)
				      & 0xff0000)) >> 8;
		} else {
		    int i_2287_ = (i_2279_ & 0xff0000) * anInt9031 & ~0xffffff;
		    int i_2288_ = (i_2279_ & 0xff00) * anInt9030 & 0xff0000;
		    int i_2289_ = (i_2279_ & 0xff) * anInt9027 & 0xff00;
		    is[i_2260_] = (i_2287_ | i_2288_ | i_2289_) >>> 8;
		}
	    } else if (i_2261_ == 3) {
		int i_2290_ = anIntArray11426[i];
		int i_2291_ = anInt9026;
		int i_2292_ = i_2290_ + i_2291_;
		int i_2293_ = (i_2290_ & 0xff00ff) + (i_2291_ & 0xff00ff);
		int i_2294_
		    = (i_2293_ & 0x1000100) + (i_2292_ - i_2293_ & 0x10000);
		i_2294_ = i_2292_ - i_2294_ | i_2294_ - (i_2294_ >>> 8);
		int i_2295_ = (i_2290_ >>> 24) * anInt9007 >> 8;
		int i_2296_ = 256 - i_2295_;
		if (i_2295_ != 255) {
		    i_2290_ = i_2294_;
		    i_2294_ = is[i_2260_];
		    i_2294_ = ((((i_2290_ & 0xff00ff) * i_2295_
				 + (i_2294_ & 0xff00ff) * i_2296_)
				& ~0xff00ff)
			       + (((i_2290_ & 0xff00) * i_2295_
				   + (i_2294_ & 0xff00) * i_2296_)
				  & 0xff0000)) >> 8;
		}
		is[i_2260_] = i_2294_;
	    } else if (i_2261_ == 2) {
		int i_2297_ = anIntArray11426[i];
		int i_2298_ = i_2297_ >>> 24;
		int i_2299_ = 256 - i_2298_;
		int i_2300_ = (i_2297_ & 0xff00ff) * anInt9007 & ~0xff00ff;
		int i_2301_ = (i_2297_ & 0xff00) * anInt9007 & 0xff0000;
		i_2297_ = ((i_2300_ | i_2301_) >>> 8) + anInt9034;
		int i_2302_ = is[i_2260_];
		is[i_2260_] = ((((i_2297_ & 0xff00ff) * i_2298_
				 + (i_2302_ & 0xff00ff) * i_2299_)
				& ~0xff00ff)
			       + (((i_2297_ & 0xff00) * i_2298_
				   + (i_2302_ & 0xff00) * i_2299_)
				  & 0xff0000)) >> 8;
	    } else
		throw new IllegalArgumentException();
	} else if (i_2262_ == 2) {
	    if (i_2261_ == 1) {
		int i_2303_ = anIntArray11426[i];
		int i_2304_ = is[i_2260_];
		int i_2305_ = i_2303_ + i_2304_;
		int i_2306_ = (i_2303_ & 0xff00ff) + (i_2304_ & 0xff00ff);
		i_2304_
		    = (i_2306_ & 0x1000100) + (i_2305_ - i_2306_ & 0x10000);
		is[i_2260_] = i_2305_ - i_2304_ | i_2304_ - (i_2304_ >>> 8);
	    } else if (i_2261_ == 0) {
		int i_2307_ = anIntArray11426[i];
		int i_2308_ = (i_2307_ & 0xff0000) * anInt9031 & ~0xffffff;
		int i_2309_ = (i_2307_ & 0xff00) * anInt9030 & 0xff0000;
		int i_2310_ = (i_2307_ & 0xff) * anInt9027 & 0xff00;
		i_2307_ = (i_2308_ | i_2309_ | i_2310_) >>> 8;
		int i_2311_ = is[i_2260_];
		int i_2312_ = i_2307_ + i_2311_;
		int i_2313_ = (i_2307_ & 0xff00ff) + (i_2311_ & 0xff00ff);
		i_2311_
		    = (i_2313_ & 0x1000100) + (i_2312_ - i_2313_ & 0x10000);
		is[i_2260_] = i_2312_ - i_2311_ | i_2311_ - (i_2311_ >>> 8);
	    } else if (i_2261_ == 3) {
		int i_2314_ = anIntArray11426[i];
		int i_2315_ = anInt9026;
		int i_2316_ = i_2314_ + i_2315_;
		int i_2317_ = (i_2314_ & 0xff00ff) + (i_2315_ & 0xff00ff);
		int i_2318_
		    = (i_2317_ & 0x1000100) + (i_2316_ - i_2317_ & 0x10000);
		i_2314_ = i_2316_ - i_2318_ | i_2318_ - (i_2318_ >>> 8);
		i_2318_ = is[i_2260_];
		i_2316_ = i_2314_ + i_2318_;
		i_2317_ = (i_2314_ & 0xff00ff) + (i_2318_ & 0xff00ff);
		i_2318_
		    = (i_2317_ & 0x1000100) + (i_2316_ - i_2317_ & 0x10000);
		is[i_2260_] = i_2316_ - i_2318_ | i_2318_ - (i_2318_ >>> 8);
	    } else if (i_2261_ == 2) {
		int i_2319_ = anIntArray11426[i];
		int i_2320_ = (i_2319_ & 0xff00ff) * anInt9007 & ~0xff00ff;
		int i_2321_ = (i_2319_ & 0xff00) * anInt9007 & 0xff0000;
		i_2319_ = ((i_2320_ | i_2321_) >>> 8) + anInt9034;
		int i_2322_ = is[i_2260_];
		int i_2323_ = i_2319_ + i_2322_;
		int i_2324_ = (i_2319_ & 0xff00ff) + (i_2322_ & 0xff00ff);
		i_2322_
		    = (i_2324_ & 0x1000100) + (i_2323_ - i_2324_ & 0x10000);
		is[i_2260_] = i_2323_ - i_2322_ | i_2322_ - (i_2322_ >>> 8);
	    }
	} else
	    throw new IllegalArgumentException();
    }
    
    void method14547(int i, int i_2325_) {
	int[] is = aClass182_Sub2_9033.anIntArray9466;
	if (is != null) {
	    if (anInt9006 == 0) {
		if (anInt9017 == 0) {
		    int i_2326_ = anInt9023;
		    while (i_2326_ < 0) {
			int i_2327_ = anInt9015;
			int i_2328_ = anInt9022;
			int i_2329_ = anInt8999;
			int i_2330_ = anInt9011;
			if (i_2328_ >= 0 && i_2329_ >= 0
			    && i_2328_ - (anInt9000 << 12) < 0
			    && i_2329_ - (anInt9001 << 12) < 0) {
			    for (/**/; i_2330_ < 0; i_2330_++)
				method18025(((i_2329_ >> 12) * anInt9000
					     + (i_2328_ >> 12)),
					    i_2327_++, is, i, i_2325_);
			}
			i_2326_++;
			anInt9015 += anInt9014;
		    }
		} else if (anInt9017 < 0) {
		    int i_2331_ = anInt9023;
		    while (i_2331_ < 0) {
			int i_2332_ = anInt9015;
			int i_2333_ = anInt9022;
			int i_2334_ = anInt8999 + anInt9025;
			int i_2335_ = anInt9011;
			if (i_2333_ >= 0 && i_2333_ - (anInt9000 << 12) < 0) {
			    int i_2336_;
			    if ((i_2336_ = i_2334_ - (anInt9001 << 12)) >= 0) {
				i_2336_ = (anInt9017 - i_2336_) / anInt9017;
				i_2335_ += i_2336_;
				i_2334_ += anInt9017 * i_2336_;
				i_2332_ += i_2336_;
			    }
			    if ((i_2336_ = (i_2334_ - anInt9017) / anInt9017)
				> i_2335_)
				i_2335_ = i_2336_;
			    for (/**/; i_2335_ < 0; i_2335_++) {
				method18025(((i_2334_ >> 12) * anInt9000
					     + (i_2333_ >> 12)),
					    i_2332_++, is, i, i_2325_);
				i_2334_ += anInt9017;
			    }
			}
			i_2331_++;
			anInt9022 += anInt9018;
			anInt9015 += anInt9014;
		    }
		} else {
		    int i_2337_ = anInt9023;
		    while (i_2337_ < 0) {
			int i_2338_ = anInt9015;
			int i_2339_ = anInt9022;
			int i_2340_ = anInt8999 + anInt9025;
			int i_2341_ = anInt9011;
			if (i_2339_ >= 0 && i_2339_ - (anInt9000 << 12) < 0) {
			    if (i_2340_ < 0) {
				int i_2342_
				    = (anInt9017 - 1 - i_2340_) / anInt9017;
				i_2341_ += i_2342_;
				i_2340_ += anInt9017 * i_2342_;
				i_2338_ += i_2342_;
			    }
			    int i_2343_;
			    if ((i_2343_ = (1 + i_2340_ - (anInt9001 << 12)
					    - anInt9017) / anInt9017)
				> i_2341_)
				i_2341_ = i_2343_;
			    for (/**/; i_2341_ < 0; i_2341_++) {
				method18025(((i_2340_ >> 12) * anInt9000
					     + (i_2339_ >> 12)),
					    i_2338_++, is, i, i_2325_);
				i_2340_ += anInt9017;
			    }
			}
			i_2337_++;
			anInt9022 += anInt9018;
			anInt9015 += anInt9014;
		    }
		}
	    } else if (anInt9006 < 0) {
		if (anInt9017 == 0) {
		    int i_2344_ = anInt9023;
		    while (i_2344_ < 0) {
			int i_2345_ = anInt9015;
			int i_2346_ = anInt9022 + anInt9024;
			int i_2347_ = anInt8999;
			int i_2348_ = anInt9011;
			if (i_2347_ >= 0 && i_2347_ - (anInt9001 << 12) < 0) {
			    int i_2349_;
			    if ((i_2349_ = i_2346_ - (anInt9000 << 12)) >= 0) {
				i_2349_ = (anInt9006 - i_2349_) / anInt9006;
				i_2348_ += i_2349_;
				i_2346_ += anInt9006 * i_2349_;
				i_2345_ += i_2349_;
			    }
			    if ((i_2349_ = (i_2346_ - anInt9006) / anInt9006)
				> i_2348_)
				i_2348_ = i_2349_;
			    for (/**/; i_2348_ < 0; i_2348_++) {
				method18025(((i_2347_ >> 12) * anInt9000
					     + (i_2346_ >> 12)),
					    i_2345_++, is, i, i_2325_);
				i_2346_ += anInt9006;
			    }
			}
			i_2344_++;
			anInt8999 += anInt9010;
			anInt9015 += anInt9014;
		    }
		} else if (anInt9017 < 0) {
		    int i_2350_ = anInt9023;
		    while (i_2350_ < 0) {
			int i_2351_ = anInt9015;
			int i_2352_ = anInt9022 + anInt9024;
			int i_2353_ = anInt8999 + anInt9025;
			int i_2354_ = anInt9011;
			int i_2355_;
			if ((i_2355_ = i_2352_ - (anInt9000 << 12)) >= 0) {
			    i_2355_ = (anInt9006 - i_2355_) / anInt9006;
			    i_2354_ += i_2355_;
			    i_2352_ += anInt9006 * i_2355_;
			    i_2353_ += anInt9017 * i_2355_;
			    i_2351_ += i_2355_;
			}
			if ((i_2355_ = (i_2352_ - anInt9006) / anInt9006)
			    > i_2354_)
			    i_2354_ = i_2355_;
			if ((i_2355_ = i_2353_ - (anInt9001 << 12)) >= 0) {
			    i_2355_ = (anInt9017 - i_2355_) / anInt9017;
			    i_2354_ += i_2355_;
			    i_2352_ += anInt9006 * i_2355_;
			    i_2353_ += anInt9017 * i_2355_;
			    i_2351_ += i_2355_;
			}
			if ((i_2355_ = (i_2353_ - anInt9017) / anInt9017)
			    > i_2354_)
			    i_2354_ = i_2355_;
			for (/**/; i_2354_ < 0; i_2354_++) {
			    method18025((i_2353_ >> 12) * anInt9000 + (i_2352_
								       >> 12),
					i_2351_++, is, i, i_2325_);
			    i_2352_ += anInt9006;
			    i_2353_ += anInt9017;
			}
			i_2350_++;
			anInt9022 += anInt9018;
			anInt8999 += anInt9010;
			anInt9015 += anInt9014;
		    }
		} else {
		    int i_2356_ = anInt9023;
		    while (i_2356_ < 0) {
			int i_2357_ = anInt9015;
			int i_2358_ = anInt9022 + anInt9024;
			int i_2359_ = anInt8999 + anInt9025;
			int i_2360_ = anInt9011;
			int i_2361_;
			if ((i_2361_ = i_2358_ - (anInt9000 << 12)) >= 0) {
			    i_2361_ = (anInt9006 - i_2361_) / anInt9006;
			    i_2360_ += i_2361_;
			    i_2358_ += anInt9006 * i_2361_;
			    i_2359_ += anInt9017 * i_2361_;
			    i_2357_ += i_2361_;
			}
			if ((i_2361_ = (i_2358_ - anInt9006) / anInt9006)
			    > i_2360_)
			    i_2360_ = i_2361_;
			if (i_2359_ < 0) {
			    i_2361_ = (anInt9017 - 1 - i_2359_) / anInt9017;
			    i_2360_ += i_2361_;
			    i_2358_ += anInt9006 * i_2361_;
			    i_2359_ += anInt9017 * i_2361_;
			    i_2357_ += i_2361_;
			}
			if ((i_2361_ = (1 + i_2359_ - (anInt9001 << 12)
					- anInt9017) / anInt9017)
			    > i_2360_)
			    i_2360_ = i_2361_;
			for (/**/; i_2360_ < 0; i_2360_++) {
			    method18025((i_2359_ >> 12) * anInt9000 + (i_2358_
								       >> 12),
					i_2357_++, is, i, i_2325_);
			    i_2358_ += anInt9006;
			    i_2359_ += anInt9017;
			}
			i_2356_++;
			anInt9022 += anInt9018;
			anInt8999 += anInt9010;
			anInt9015 += anInt9014;
		    }
		}
	    } else if (anInt9017 == 0) {
		int i_2362_ = anInt9023;
		while (i_2362_ < 0) {
		    int i_2363_ = anInt9015;
		    int i_2364_ = anInt9022 + anInt9024;
		    int i_2365_ = anInt8999;
		    int i_2366_ = anInt9011;
		    if (i_2365_ >= 0 && i_2365_ - (anInt9001 << 12) < 0) {
			if (i_2364_ < 0) {
			    int i_2367_
				= (anInt9006 - 1 - i_2364_) / anInt9006;
			    i_2366_ += i_2367_;
			    i_2364_ += anInt9006 * i_2367_;
			    i_2363_ += i_2367_;
			}
			int i_2368_;
			if ((i_2368_ = (1 + i_2364_ - (anInt9000 << 12)
					- anInt9006) / anInt9006)
			    > i_2366_)
			    i_2366_ = i_2368_;
			for (/**/; i_2366_ < 0; i_2366_++) {
			    method18025((i_2365_ >> 12) * anInt9000 + (i_2364_
								       >> 12),
					i_2363_++, is, i, i_2325_);
			    i_2364_ += anInt9006;
			}
		    }
		    i_2362_++;
		    anInt9022 += anInt9018;
		    anInt8999 += anInt9010;
		    anInt9015 += anInt9014;
		}
	    } else if (anInt9017 < 0) {
		for (int i_2369_ = anInt9023; i_2369_ < 0; i_2369_++) {
		    int i_2370_ = anInt9015;
		    int i_2371_ = anInt9022 + anInt9024;
		    int i_2372_ = anInt8999 + anInt9025;
		    int i_2373_ = anInt9011;
		    if (i_2371_ < 0) {
			int i_2374_ = (anInt9006 - 1 - i_2371_) / anInt9006;
			i_2373_ += i_2374_;
			i_2371_ += anInt9006 * i_2374_;
			i_2372_ += anInt9017 * i_2374_;
			i_2370_ += i_2374_;
		    }
		    int i_2375_;
		    if ((i_2375_ = (1 + i_2371_ - (anInt9000 << 12)
				    - anInt9006) / anInt9006)
			> i_2373_)
			i_2373_ = i_2375_;
		    if ((i_2375_ = i_2372_ - (anInt9001 << 12)) >= 0) {
			i_2375_ = (anInt9017 - i_2375_) / anInt9017;
			i_2373_ += i_2375_;
			i_2371_ += anInt9006 * i_2375_;
			i_2372_ += anInt9017 * i_2375_;
			i_2370_ += i_2375_;
		    }
		    if ((i_2375_ = (i_2372_ - anInt9017) / anInt9017)
			> i_2373_)
			i_2373_ = i_2375_;
		    for (/**/; i_2373_ < 0; i_2373_++) {
			method18025((i_2372_ >> 12) * anInt9000 + (i_2371_
								   >> 12),
				    i_2370_++, is, i, i_2325_);
			i_2371_ += anInt9006;
			i_2372_ += anInt9017;
		    }
		    anInt9022 += anInt9018;
		    anInt8999 += anInt9010;
		    anInt9015 += anInt9014;
		}
	    } else {
		for (int i_2376_ = anInt9023; i_2376_ < 0; i_2376_++) {
		    int i_2377_ = anInt9015;
		    int i_2378_ = anInt9022 + anInt9024;
		    int i_2379_ = anInt8999 + anInt9025;
		    int i_2380_ = anInt9011;
		    if (i_2378_ < 0) {
			int i_2381_ = (anInt9006 - 1 - i_2378_) / anInt9006;
			i_2380_ += i_2381_;
			i_2378_ += anInt9006 * i_2381_;
			i_2379_ += anInt9017 * i_2381_;
			i_2377_ += i_2381_;
		    }
		    int i_2382_;
		    if ((i_2382_ = (1 + i_2378_ - (anInt9000 << 12)
				    - anInt9006) / anInt9006)
			> i_2380_)
			i_2380_ = i_2382_;
		    if (i_2379_ < 0) {
			i_2382_ = (anInt9017 - 1 - i_2379_) / anInt9017;
			i_2380_ += i_2382_;
			i_2378_ += anInt9006 * i_2382_;
			i_2379_ += anInt9017 * i_2382_;
			i_2377_ += i_2382_;
		    }
		    if ((i_2382_ = (1 + i_2379_ - (anInt9001 << 12)
				    - anInt9017) / anInt9017)
			> i_2380_)
			i_2380_ = i_2382_;
		    for (/**/; i_2380_ < 0; i_2380_++) {
			method18025((i_2379_ >> 12) * anInt9000 + (i_2378_
								   >> 12),
				    i_2377_++, is, i, i_2325_);
			i_2378_ += anInt9006;
			i_2379_ += anInt9017;
		    }
		    anInt9022 += anInt9018;
		    anInt8999 += anInt9010;
		    anInt9015 += anInt9014;
		}
	    }
	}
    }
    
    Class157_Sub1_Sub3(Class182_Sub2 class182_sub2, int i, int i_2383_) {
	super(class182_sub2, i, i_2383_);
	anIntArray11426 = new int[i * i_2383_];
    }
}
