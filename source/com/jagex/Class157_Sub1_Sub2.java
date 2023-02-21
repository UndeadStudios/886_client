/* Class157_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class157_Sub1_Sub2 extends Class157_Sub1
{
    int[] anIntArray11425;
    
    public Interface21 method2521() {
	return new Class97(anInt9000, anInt9001, anIntArray11425);
    }
    
    Class157_Sub1_Sub2(Class182_Sub2 class182_sub2, int[] is, int i, int i_0_,
		       int i_1_, int i_2_, boolean bool) {
	super(class182_sub2, i_1_, i_2_);
	if (bool)
	    anIntArray11425 = new int[i_1_ * i_2_];
	else
	    anIntArray11425 = is;
	i_0_ -= anInt9000;
	int i_3_ = 0;
	for (int i_4_ = 0; i_4_ < i_2_; i_4_++) {
	    for (int i_5_ = 0; i_5_ < i_1_; i_5_++) {
		int i_6_ = is[i++];
		if (i_6_ >>> 24 == 255)
		    anIntArray11425[i_3_++]
			= (i_6_ & 0xffffff) == 0 ? -16777215 : i_6_;
		else
		    anIntArray11425[i_3_++] = 0;
	    }
	    i += i_0_;
	}
    }
    
    Class157_Sub1_Sub2(Class182_Sub2 class182_sub2, int[] is, int i,
		       int i_7_) {
	super(class182_sub2, i, i_7_);
	anIntArray11425 = is;
    }
    
    public void method2474(int i, int i_8_, int i_9_, int i_10_, int[] is,
			   int i_11_, int i_12_) {
	i_12_ -= i_9_;
	for (int i_13_ = 0; i_13_ < i_10_; i_13_++) {
	    int i_14_ = (i_8_ + i_13_) * i_9_ + i;
	    for (int i_15_ = 0; i_15_ < i_9_; i_15_++)
		anIntArray11425[i_14_ + i_15_] = is[i_11_++];
	    i_11_ += i_12_;
	}
    }
    
    void method18018(int i, int i_16_, int i_17_, int i_18_, int[] is,
		     int i_19_, int i_20_) {
	i_20_ -= i_17_;
	for (int i_21_ = 0; i_21_ < i_18_; i_21_++) {
	    int i_22_ = (i_16_ + i_21_) * i_17_ + i;
	    for (int i_23_ = 0; i_23_ < i_17_; i_23_++)
		is[i_19_++] = anIntArray11425[i_22_ + i_23_];
	    i_19_ += i_20_;
	}
    }
    
    public void method2505(int i, int i_24_, int i_25_, int i_26_, int i_27_) {
	if (aClass182_Sub2_9033.method15226())
	    throw new IllegalStateException();
	int[] is = aClass182_Sub2_9033.anIntArray9466;
	if (is != null) {
	    int i_28_ = aClass182_Sub2_9033.anInt9494 * -476035351;
	    i += anInt9002;
	    i_24_ += anInt9003;
	    int i_29_ = i_24_ * i_28_ + i;
	    int i_30_ = 0;
	    int i_31_ = anInt9001;
	    int i_32_ = anInt9000;
	    int i_33_ = i_28_ - i_32_;
	    int i_34_ = 0;
	    if (i_24_ < aClass182_Sub2_9033.anInt9472 * 1722112305) {
		int i_35_ = aClass182_Sub2_9033.anInt9472 * 1722112305 - i_24_;
		i_31_ -= i_35_;
		i_24_ = aClass182_Sub2_9033.anInt9472 * 1722112305;
		i_30_ += i_35_ * i_32_;
		i_29_ += i_35_ * i_28_;
	    }
	    if (i_24_ + i_31_ > aClass182_Sub2_9033.anInt9473 * 1920901985)
		i_31_ -= (i_24_ + i_31_
			  - aClass182_Sub2_9033.anInt9473 * 1920901985);
	    if (i < aClass182_Sub2_9033.anInt9470 * 1988019027) {
		int i_36_ = aClass182_Sub2_9033.anInt9470 * 1988019027 - i;
		i_32_ -= i_36_;
		i = aClass182_Sub2_9033.anInt9470 * 1988019027;
		i_30_ += i_36_;
		i_29_ += i_36_;
		i_34_ += i_36_;
		i_33_ += i_36_;
	    }
	    if (i + i_32_ > aClass182_Sub2_9033.anInt9499 * -466178451) {
		int i_37_
		    = i + i_32_ - aClass182_Sub2_9033.anInt9499 * -466178451;
		i_32_ -= i_37_;
		i_34_ += i_37_;
		i_33_ += i_37_;
	    }
	    if (i_32_ > 0 && i_31_ > 0) {
		if (i_27_ == 0) {
		    if (i_25_ == 1) {
			for (int i_38_ = -i_31_; i_38_ < 0; i_38_++) {
			    int i_39_ = i_29_ + i_32_ - 3;
			    while (i_29_ < i_39_) {
				is[i_29_++] = anIntArray11425[i_30_++];
				is[i_29_++] = anIntArray11425[i_30_++];
				is[i_29_++] = anIntArray11425[i_30_++];
				is[i_29_++] = anIntArray11425[i_30_++];
			    }
			    i_39_ += 3;
			    while (i_29_ < i_39_)
				is[i_29_++] = anIntArray11425[i_30_++];
			    i_29_ += i_33_;
			    i_30_ += i_34_;
			}
		    } else if (i_25_ == 0) {
			int i_40_ = (i_26_ & 0xff0000) >> 16;
			int i_41_ = (i_26_ & 0xff00) >> 8;
			int i_42_ = i_26_ & 0xff;
			for (int i_43_ = -i_31_; i_43_ < 0; i_43_++) {
			    for (int i_44_ = -i_32_; i_44_ < 0; i_44_++) {
				int i_45_ = anIntArray11425[i_30_++];
				int i_46_
				    = (i_45_ & 0xff0000) * i_40_ & ~0xffffff;
				int i_47_
				    = (i_45_ & 0xff00) * i_41_ & 0xff0000;
				int i_48_ = (i_45_ & 0xff) * i_42_ & 0xff00;
				is[i_29_++] = (i_46_ | i_47_ | i_48_) >>> 8;
			    }
			    i_29_ += i_33_;
			    i_30_ += i_34_;
			}
		    } else if (i_25_ == 3) {
			for (int i_49_ = -i_31_; i_49_ < 0; i_49_++) {
			    for (int i_50_ = -i_32_; i_50_ < 0; i_50_++) {
				int i_51_ = anIntArray11425[i_30_++];
				int i_52_ = i_51_ + i_26_;
				int i_53_
				    = (i_51_ & 0xff00ff) + (i_26_ & 0xff00ff);
				int i_54_ = ((i_53_ & 0x1000100)
					     + (i_52_ - i_53_ & 0x10000));
				is[i_29_++]
				    = i_52_ - i_54_ | i_54_ - (i_54_ >>> 8);
			    }
			    i_29_ += i_33_;
			    i_30_ += i_34_;
			}
		    } else if (i_25_ == 2) {
			int i_55_ = i_26_ >>> 24;
			int i_56_ = 256 - i_55_;
			int i_57_ = (i_26_ & 0xff00ff) * i_56_ & ~0xff00ff;
			int i_58_ = (i_26_ & 0xff00) * i_56_ & 0xff0000;
			i_26_ = (i_57_ | i_58_) >>> 8;
			for (int i_59_ = -i_31_; i_59_ < 0; i_59_++) {
			    for (int i_60_ = -i_32_; i_60_ < 0; i_60_++) {
				int i_61_ = anIntArray11425[i_30_++];
				i_57_ = (i_61_ & 0xff00ff) * i_55_ & ~0xff00ff;
				i_58_ = (i_61_ & 0xff00) * i_55_ & 0xff0000;
				is[i_29_++] = ((i_57_ | i_58_) >>> 8) + i_26_;
			    }
			    i_29_ += i_33_;
			    i_30_ += i_34_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_27_ == 1) {
		    if (i_25_ == 1) {
			for (int i_62_ = -i_31_; i_62_ < 0; i_62_++) {
			    int i_63_ = i_29_ + i_32_ - 3;
			    while (i_29_ < i_63_) {
				int i_64_ = anIntArray11425[i_30_++];
				if (i_64_ != 0)
				    is[i_29_++] = i_64_;
				else
				    i_29_++;
				i_64_ = anIntArray11425[i_30_++];
				if (i_64_ != 0)
				    is[i_29_++] = i_64_;
				else
				    i_29_++;
				i_64_ = anIntArray11425[i_30_++];
				if (i_64_ != 0)
				    is[i_29_++] = i_64_;
				else
				    i_29_++;
				i_64_ = anIntArray11425[i_30_++];
				if (i_64_ != 0)
				    is[i_29_++] = i_64_;
				else
				    i_29_++;
			    }
			    i_63_ += 3;
			    while (i_29_ < i_63_) {
				int i_65_ = anIntArray11425[i_30_++];
				if (i_65_ != 0)
				    is[i_29_++] = i_65_;
				else
				    i_29_++;
			    }
			    i_29_ += i_33_;
			    i_30_ += i_34_;
			}
		    } else if (i_25_ == 0) {
			if ((i_26_ & 0xffffff) == 16777215) {
			    int i_66_ = i_26_ >>> 24;
			    int i_67_ = 256 - i_66_;
			    for (int i_68_ = -i_31_; i_68_ < 0; i_68_++) {
				for (int i_69_ = -i_32_; i_69_ < 0; i_69_++) {
				    int i_70_ = anIntArray11425[i_30_++];
				    if (i_70_ != 0) {
					int i_71_ = is[i_29_];
					is[i_29_++]
					    = ((((i_70_ & 0xff00ff) * i_66_
						 + (i_71_ & 0xff00ff) * i_67_)
						& ~0xff00ff)
					       + (((i_70_ & 0xff00) * i_66_
						   + (i_71_ & 0xff00) * i_67_)
						  & 0xff0000)) >> 8;
				    } else
					i_29_++;
				}
				i_29_ += i_33_;
				i_30_ += i_34_;
			    }
			} else {
			    int i_72_ = (i_26_ & 0xff0000) >> 16;
			    int i_73_ = (i_26_ & 0xff00) >> 8;
			    int i_74_ = i_26_ & 0xff;
			    int i_75_ = i_26_ >>> 24;
			    int i_76_ = 256 - i_75_;
			    for (int i_77_ = -i_31_; i_77_ < 0; i_77_++) {
				for (int i_78_ = -i_32_; i_78_ < 0; i_78_++) {
				    int i_79_ = anIntArray11425[i_30_++];
				    if (i_79_ != 0) {
					if (i_75_ != 255) {
					    int i_80_
						= ((i_79_ & 0xff0000) * i_72_
						   & ~0xffffff);
					    int i_81_
						= ((i_79_ & 0xff00) * i_73_
						   & 0xff0000);
					    int i_82_ = ((i_79_ & 0xff) * i_74_
							 & 0xff00);
					    i_79_ = ((i_80_ | i_81_ | i_82_)
						     >>> 8);
					    int i_83_ = is[i_29_];
					    is[i_29_++]
						= ((((i_79_ & 0xff00ff) * i_75_
						     + ((i_83_ & 0xff00ff)
							* i_76_))
						    & ~0xff00ff)
						   + (((i_79_ & 0xff00) * i_75_
						       + ((i_83_ & 0xff00)
							  * i_76_))
						      & 0xff0000)) >> 8;
					} else {
					    int i_84_
						= ((i_79_ & 0xff0000) * i_72_
						   & ~0xffffff);
					    int i_85_
						= ((i_79_ & 0xff00) * i_73_
						   & 0xff0000);
					    int i_86_ = ((i_79_ & 0xff) * i_74_
							 & 0xff00);
					    is[i_29_++] = (i_84_ | i_85_
							   | i_86_) >>> 8;
					}
				    } else
					i_29_++;
				}
				i_29_ += i_33_;
				i_30_ += i_34_;
			    }
			}
		    } else if (i_25_ == 3) {
			int i_87_ = i_26_ >>> 24;
			int i_88_ = 256 - i_87_;
			for (int i_89_ = -i_31_; i_89_ < 0; i_89_++) {
			    for (int i_90_ = -i_32_; i_90_ < 0; i_90_++) {
				int i_91_ = anIntArray11425[i_30_++];
				int i_92_ = i_91_ + i_26_;
				int i_93_
				    = (i_91_ & 0xff00ff) + (i_26_ & 0xff00ff);
				int i_94_ = ((i_93_ & 0x1000100)
					     + (i_92_ - i_93_ & 0x10000));
				i_94_ = i_92_ - i_94_ | i_94_ - (i_94_ >>> 8);
				if (i_91_ == 0 && i_87_ != 255) {
				    i_91_ = i_94_;
				    i_94_ = is[i_29_];
				    i_94_ = ((((i_91_ & 0xff00ff) * i_87_
					       + (i_94_ & 0xff00ff) * i_88_)
					      & ~0xff00ff)
					     + (((i_91_ & 0xff00) * i_87_
						 + (i_94_ & 0xff00) * i_88_)
						& 0xff0000)) >> 8;
				}
				is[i_29_++] = i_94_;
			    }
			    i_29_ += i_33_;
			    i_30_ += i_34_;
			}
		    } else if (i_25_ == 2) {
			int i_95_ = i_26_ >>> 24;
			int i_96_ = 256 - i_95_;
			int i_97_ = (i_26_ & 0xff00ff) * i_96_ & ~0xff00ff;
			int i_98_ = (i_26_ & 0xff00) * i_96_ & 0xff0000;
			i_26_ = (i_97_ | i_98_) >>> 8;
			for (int i_99_ = -i_31_; i_99_ < 0; i_99_++) {
			    for (int i_100_ = -i_32_; i_100_ < 0; i_100_++) {
				int i_101_ = anIntArray11425[i_30_++];
				if (i_101_ != 0) {
				    i_97_ = ((i_101_ & 0xff00ff) * i_95_
					     & ~0xff00ff);
				    i_98_
					= (i_101_ & 0xff00) * i_95_ & 0xff0000;
				    is[i_29_++]
					= ((i_97_ | i_98_) >>> 8) + i_26_;
				} else
				    i_29_++;
			    }
			    i_29_ += i_33_;
			    i_30_ += i_34_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_27_ == 2) {
		    if (i_25_ == 1) {
			for (int i_102_ = -i_31_; i_102_ < 0; i_102_++) {
			    for (int i_103_ = -i_32_; i_103_ < 0; i_103_++) {
				int i_104_ = anIntArray11425[i_30_++];
				if (i_104_ != 0) {
				    int i_105_ = is[i_29_];
				    int i_106_ = i_104_ + i_105_;
				    int i_107_ = ((i_104_ & 0xff00ff)
						  + (i_105_ & 0xff00ff));
				    i_105_ = ((i_107_ & 0x1000100)
					      + (i_106_ - i_107_ & 0x10000));
				    is[i_29_++]
					= i_106_ - i_105_ | i_105_ - (i_105_
								      >>> 8);
				} else
				    i_29_++;
			    }
			    i_29_ += i_33_;
			    i_30_ += i_34_;
			}
		    } else if (i_25_ == 0) {
			int i_108_ = (i_26_ & 0xff0000) >> 16;
			int i_109_ = (i_26_ & 0xff00) >> 8;
			int i_110_ = i_26_ & 0xff;
			for (int i_111_ = -i_31_; i_111_ < 0; i_111_++) {
			    for (int i_112_ = -i_32_; i_112_ < 0; i_112_++) {
				int i_113_ = anIntArray11425[i_30_++];
				if (i_113_ != 0) {
				    int i_114_ = ((i_113_ & 0xff0000) * i_108_
						  & ~0xffffff);
				    int i_115_ = ((i_113_ & 0xff00) * i_109_
						  & 0xff0000);
				    int i_116_
					= (i_113_ & 0xff) * i_110_ & 0xff00;
				    i_113_ = (i_114_ | i_115_ | i_116_) >>> 8;
				    int i_117_ = is[i_29_];
				    int i_118_ = i_113_ + i_117_;
				    int i_119_ = ((i_113_ & 0xff00ff)
						  + (i_117_ & 0xff00ff));
				    i_117_ = ((i_119_ & 0x1000100)
					      + (i_118_ - i_119_ & 0x10000));
				    is[i_29_++]
					= i_118_ - i_117_ | i_117_ - (i_117_
								      >>> 8);
				} else
				    i_29_++;
			    }
			    i_29_ += i_33_;
			    i_30_ += i_34_;
			}
		    } else if (i_25_ == 3) {
			for (int i_120_ = -i_31_; i_120_ < 0; i_120_++) {
			    for (int i_121_ = -i_32_; i_121_ < 0; i_121_++) {
				int i_122_ = anIntArray11425[i_30_++];
				int i_123_ = i_122_ + i_26_;
				int i_124_
				    = (i_122_ & 0xff00ff) + (i_26_ & 0xff00ff);
				int i_125_ = ((i_124_ & 0x1000100)
					      + (i_123_ - i_124_ & 0x10000));
				i_122_ = i_123_ - i_125_ | i_125_ - (i_125_
								     >>> 8);
				i_125_ = is[i_29_];
				i_123_ = i_122_ + i_125_;
				i_124_ = (i_122_ & 0xff00ff) + (i_125_
								& 0xff00ff);
				i_125_
				    = (i_124_ & 0x1000100) + (i_123_ - i_124_
							      & 0x10000);
				is[i_29_++]
				    = i_123_ - i_125_ | i_125_ - (i_125_
								  >>> 8);
			    }
			    i_29_ += i_33_;
			    i_30_ += i_34_;
			}
		    } else if (i_25_ == 2) {
			int i_126_ = i_26_ >>> 24;
			int i_127_ = 256 - i_126_;
			int i_128_ = (i_26_ & 0xff00ff) * i_127_ & ~0xff00ff;
			int i_129_ = (i_26_ & 0xff00) * i_127_ & 0xff0000;
			i_26_ = (i_128_ | i_129_) >>> 8;
			for (int i_130_ = -i_31_; i_130_ < 0; i_130_++) {
			    for (int i_131_ = -i_32_; i_131_ < 0; i_131_++) {
				int i_132_ = anIntArray11425[i_30_++];
				if (i_132_ != 0) {
				    i_128_ = ((i_132_ & 0xff00ff) * i_126_
					      & ~0xff00ff);
				    i_129_ = ((i_132_ & 0xff00) * i_126_
					      & 0xff0000);
				    i_132_ = ((i_128_ | i_129_) >>> 8) + i_26_;
				    int i_133_ = is[i_29_];
				    int i_134_ = i_132_ + i_133_;
				    int i_135_ = ((i_132_ & 0xff00ff)
						  + (i_133_ & 0xff00ff));
				    i_133_ = ((i_135_ & 0x1000100)
					      + (i_134_ - i_135_ & 0x10000));
				    is[i_29_++]
					= i_134_ - i_133_ | i_133_ - (i_133_
								      >>> 8);
				} else
				    i_29_++;
			    }
			    i_29_ += i_33_;
			    i_30_ += i_34_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    public void method2549(int i, int i_136_, Class152 class152, int i_137_,
			   int i_138_) {
	if (aClass182_Sub2_9033.method15226())
	    throw new IllegalStateException();
	int[] is = aClass182_Sub2_9033.anIntArray9466;
	if (is != null) {
	    i += anInt9002;
	    i_136_ += anInt9003;
	    int i_139_ = 0;
	    int i_140_ = aClass182_Sub2_9033.anInt9494 * -476035351;
	    int i_141_ = anInt9000;
	    int i_142_ = anInt9001;
	    int i_143_ = i_140_ - i_141_;
	    int i_144_ = 0;
	    int i_145_ = i + i_136_ * i_140_;
	    if (i_136_ < aClass182_Sub2_9033.anInt9472 * 1722112305) {
		int i_146_
		    = aClass182_Sub2_9033.anInt9472 * 1722112305 - i_136_;
		i_142_ -= i_146_;
		i_136_ = aClass182_Sub2_9033.anInt9472 * 1722112305;
		i_139_ += i_146_ * i_141_;
		i_145_ += i_146_ * i_140_;
	    }
	    if (i_136_ + i_142_ > aClass182_Sub2_9033.anInt9473 * 1920901985)
		i_142_ -= (i_136_ + i_142_
			   - aClass182_Sub2_9033.anInt9473 * 1920901985);
	    if (i < aClass182_Sub2_9033.anInt9470 * 1988019027) {
		int i_147_ = aClass182_Sub2_9033.anInt9470 * 1988019027 - i;
		i_141_ -= i_147_;
		i = aClass182_Sub2_9033.anInt9470 * 1988019027;
		i_139_ += i_147_;
		i_145_ += i_147_;
		i_144_ += i_147_;
		i_143_ += i_147_;
	    }
	    if (i + i_141_ > aClass182_Sub2_9033.anInt9499 * -466178451) {
		int i_148_
		    = i + i_141_ - aClass182_Sub2_9033.anInt9499 * -466178451;
		i_141_ -= i_148_;
		i_144_ += i_148_;
		i_143_ += i_148_;
	    }
	    if (i_141_ > 0 && i_142_ > 0) {
		Class152_Sub1 class152_sub1 = (Class152_Sub1) class152;
		int[] is_149_ = class152_sub1.anIntArray8998;
		int[] is_150_ = class152_sub1.anIntArray8997;
		int i_151_ = i_136_;
		if (i_138_ > i_151_) {
		    i_151_ = i_138_;
		    i_145_ += (i_138_ - i_136_) * i_140_;
		    i_139_ += (i_138_ - i_136_) * anInt9000;
		}
		int i_152_ = (i_138_ + is_149_.length < i_136_ + i_142_
			      ? i_138_ + is_149_.length : i_136_ + i_142_);
		for (int i_153_ = i_151_; i_153_ < i_152_; i_153_++) {
		    int i_154_ = is_149_[i_153_ - i_138_] + i_137_;
		    int i_155_ = is_150_[i_153_ - i_138_];
		    int i_156_ = i_141_;
		    if (i > i_154_) {
			int i_157_ = i - i_154_;
			if (i_157_ >= i_155_) {
			    i_139_ += i_141_ + i_144_;
			    i_145_ += i_141_ + i_143_;
			    continue;
			}
			i_155_ -= i_157_;
		    } else {
			int i_158_ = i_154_ - i;
			if (i_158_ >= i_141_) {
			    i_139_ += i_141_ + i_144_;
			    i_145_ += i_141_ + i_143_;
			    continue;
			}
			i_139_ += i_158_;
			i_156_ -= i_158_;
			i_145_ += i_158_;
		    }
		    int i_159_ = 0;
		    if (i_156_ < i_155_)
			i_155_ = i_156_;
		    else
			i_159_ = i_156_ - i_155_;
		    for (int i_160_ = -i_155_; i_160_ < 0; i_160_++) {
			int i_161_ = anIntArray11425[i_139_++];
			if (i_161_ != 0)
			    is[i_145_++] = i_161_;
			else
			    i_145_++;
		    }
		    i_139_ += i_159_ + i_144_;
		    i_145_ += i_159_ + i_143_;
		}
	    }
	}
    }
    
    public void method2477(int i, int i_162_, int i_163_) {
	throw new IllegalStateException("");
    }
    
    public void method2498(int i, int i_164_, int i_165_, int i_166_,
			   int i_167_, int i_168_) {
	int[] is = aClass182_Sub2_9033.anIntArray9466;
	if (is == null)
	    throw new IllegalStateException("");
	for (int i_169_ = 0; i_169_ < i_166_; i_169_++) {
	    int i_170_ = (i_164_ + i_169_) * anInt9000 + i;
	    int i_171_ = ((i_168_ + i_169_) * (aClass182_Sub2_9033.anInt9494
					       * -476035351)
			  + i_167_);
	    for (int i_172_ = 0; i_172_ < i_165_; i_172_++)
		anIntArray11425[i_170_ + i_172_] = is[i_171_ + i_172_];
	}
    }
    
    public void method2479(int i, int i_173_, int i_174_, int i_175_,
			   int i_176_) {
	if (aClass182_Sub2_9033.method15226())
	    throw new IllegalStateException();
	int[] is = aClass182_Sub2_9033.anIntArray9466;
	if (is != null) {
	    int i_177_ = aClass182_Sub2_9033.anInt9494 * -476035351;
	    i += anInt9002;
	    i_173_ += anInt9003;
	    int i_178_ = i_173_ * i_177_ + i;
	    int i_179_ = 0;
	    int i_180_ = anInt9001;
	    int i_181_ = anInt9000;
	    int i_182_ = i_177_ - i_181_;
	    int i_183_ = 0;
	    if (i_173_ < aClass182_Sub2_9033.anInt9472 * 1722112305) {
		int i_184_
		    = aClass182_Sub2_9033.anInt9472 * 1722112305 - i_173_;
		i_180_ -= i_184_;
		i_173_ = aClass182_Sub2_9033.anInt9472 * 1722112305;
		i_179_ += i_184_ * i_181_;
		i_178_ += i_184_ * i_177_;
	    }
	    if (i_173_ + i_180_ > aClass182_Sub2_9033.anInt9473 * 1920901985)
		i_180_ -= (i_173_ + i_180_
			   - aClass182_Sub2_9033.anInt9473 * 1920901985);
	    if (i < aClass182_Sub2_9033.anInt9470 * 1988019027) {
		int i_185_ = aClass182_Sub2_9033.anInt9470 * 1988019027 - i;
		i_181_ -= i_185_;
		i = aClass182_Sub2_9033.anInt9470 * 1988019027;
		i_179_ += i_185_;
		i_178_ += i_185_;
		i_183_ += i_185_;
		i_182_ += i_185_;
	    }
	    if (i + i_181_ > aClass182_Sub2_9033.anInt9499 * -466178451) {
		int i_186_
		    = i + i_181_ - aClass182_Sub2_9033.anInt9499 * -466178451;
		i_181_ -= i_186_;
		i_183_ += i_186_;
		i_182_ += i_186_;
	    }
	    if (i_181_ > 0 && i_180_ > 0) {
		if (i_176_ == 0) {
		    if (i_174_ == 1) {
			for (int i_187_ = -i_180_; i_187_ < 0; i_187_++) {
			    int i_188_ = i_178_ + i_181_ - 3;
			    while (i_178_ < i_188_) {
				is[i_178_++] = anIntArray11425[i_179_++];
				is[i_178_++] = anIntArray11425[i_179_++];
				is[i_178_++] = anIntArray11425[i_179_++];
				is[i_178_++] = anIntArray11425[i_179_++];
			    }
			    i_188_ += 3;
			    while (i_178_ < i_188_)
				is[i_178_++] = anIntArray11425[i_179_++];
			    i_178_ += i_182_;
			    i_179_ += i_183_;
			}
		    } else if (i_174_ == 0) {
			int i_189_ = (i_175_ & 0xff0000) >> 16;
			int i_190_ = (i_175_ & 0xff00) >> 8;
			int i_191_ = i_175_ & 0xff;
			for (int i_192_ = -i_180_; i_192_ < 0; i_192_++) {
			    for (int i_193_ = -i_181_; i_193_ < 0; i_193_++) {
				int i_194_ = anIntArray11425[i_179_++];
				int i_195_
				    = (i_194_ & 0xff0000) * i_189_ & ~0xffffff;
				int i_196_
				    = (i_194_ & 0xff00) * i_190_ & 0xff0000;
				int i_197_ = (i_194_ & 0xff) * i_191_ & 0xff00;
				is[i_178_++]
				    = (i_195_ | i_196_ | i_197_) >>> 8;
			    }
			    i_178_ += i_182_;
			    i_179_ += i_183_;
			}
		    } else if (i_174_ == 3) {
			for (int i_198_ = -i_180_; i_198_ < 0; i_198_++) {
			    for (int i_199_ = -i_181_; i_199_ < 0; i_199_++) {
				int i_200_ = anIntArray11425[i_179_++];
				int i_201_ = i_200_ + i_175_;
				int i_202_ = ((i_200_ & 0xff00ff)
					      + (i_175_ & 0xff00ff));
				int i_203_ = ((i_202_ & 0x1000100)
					      + (i_201_ - i_202_ & 0x10000));
				is[i_178_++]
				    = i_201_ - i_203_ | i_203_ - (i_203_
								  >>> 8);
			    }
			    i_178_ += i_182_;
			    i_179_ += i_183_;
			}
		    } else if (i_174_ == 2) {
			int i_204_ = i_175_ >>> 24;
			int i_205_ = 256 - i_204_;
			int i_206_ = (i_175_ & 0xff00ff) * i_205_ & ~0xff00ff;
			int i_207_ = (i_175_ & 0xff00) * i_205_ & 0xff0000;
			i_175_ = (i_206_ | i_207_) >>> 8;
			for (int i_208_ = -i_180_; i_208_ < 0; i_208_++) {
			    for (int i_209_ = -i_181_; i_209_ < 0; i_209_++) {
				int i_210_ = anIntArray11425[i_179_++];
				i_206_
				    = (i_210_ & 0xff00ff) * i_204_ & ~0xff00ff;
				i_207_ = (i_210_ & 0xff00) * i_204_ & 0xff0000;
				is[i_178_++]
				    = ((i_206_ | i_207_) >>> 8) + i_175_;
			    }
			    i_178_ += i_182_;
			    i_179_ += i_183_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_176_ == 1) {
		    if (i_174_ == 1) {
			for (int i_211_ = -i_180_; i_211_ < 0; i_211_++) {
			    int i_212_ = i_178_ + i_181_ - 3;
			    while (i_178_ < i_212_) {
				int i_213_ = anIntArray11425[i_179_++];
				if (i_213_ != 0)
				    is[i_178_++] = i_213_;
				else
				    i_178_++;
				i_213_ = anIntArray11425[i_179_++];
				if (i_213_ != 0)
				    is[i_178_++] = i_213_;
				else
				    i_178_++;
				i_213_ = anIntArray11425[i_179_++];
				if (i_213_ != 0)
				    is[i_178_++] = i_213_;
				else
				    i_178_++;
				i_213_ = anIntArray11425[i_179_++];
				if (i_213_ != 0)
				    is[i_178_++] = i_213_;
				else
				    i_178_++;
			    }
			    i_212_ += 3;
			    while (i_178_ < i_212_) {
				int i_214_ = anIntArray11425[i_179_++];
				if (i_214_ != 0)
				    is[i_178_++] = i_214_;
				else
				    i_178_++;
			    }
			    i_178_ += i_182_;
			    i_179_ += i_183_;
			}
		    } else if (i_174_ == 0) {
			if ((i_175_ & 0xffffff) == 16777215) {
			    int i_215_ = i_175_ >>> 24;
			    int i_216_ = 256 - i_215_;
			    for (int i_217_ = -i_180_; i_217_ < 0; i_217_++) {
				for (int i_218_ = -i_181_; i_218_ < 0;
				     i_218_++) {
				    int i_219_ = anIntArray11425[i_179_++];
				    if (i_219_ != 0) {
					int i_220_ = is[i_178_];
					is[i_178_++]
					    = ((((i_219_ & 0xff00ff) * i_215_
						 + ((i_220_ & 0xff00ff)
						    * i_216_))
						& ~0xff00ff)
					       + (((i_219_ & 0xff00) * i_215_
						   + ((i_220_ & 0xff00)
						      * i_216_))
						  & 0xff0000)) >> 8;
				    } else
					i_178_++;
				}
				i_178_ += i_182_;
				i_179_ += i_183_;
			    }
			} else {
			    int i_221_ = (i_175_ & 0xff0000) >> 16;
			    int i_222_ = (i_175_ & 0xff00) >> 8;
			    int i_223_ = i_175_ & 0xff;
			    int i_224_ = i_175_ >>> 24;
			    int i_225_ = 256 - i_224_;
			    for (int i_226_ = -i_180_; i_226_ < 0; i_226_++) {
				for (int i_227_ = -i_181_; i_227_ < 0;
				     i_227_++) {
				    int i_228_ = anIntArray11425[i_179_++];
				    if (i_228_ != 0) {
					if (i_224_ != 255) {
					    int i_229_
						= ((i_228_ & 0xff0000) * i_221_
						   & ~0xffffff);
					    int i_230_
						= ((i_228_ & 0xff00) * i_222_
						   & 0xff0000);
					    int i_231_
						= ((i_228_ & 0xff) * i_223_
						   & 0xff00);
					    i_228_ = (i_229_ | i_230_
						      | i_231_) >>> 8;
					    int i_232_ = is[i_178_];
					    is[i_178_++]
						= (((((i_228_ & 0xff00ff)
						      * i_224_)
						     + ((i_232_ & 0xff00ff)
							* i_225_))
						    & ~0xff00ff)
						   + ((((i_228_ & 0xff00)
							* i_224_)
						       + ((i_232_ & 0xff00)
							  * i_225_))
						      & 0xff0000)) >> 8;
					} else {
					    int i_233_
						= ((i_228_ & 0xff0000) * i_221_
						   & ~0xffffff);
					    int i_234_
						= ((i_228_ & 0xff00) * i_222_
						   & 0xff0000);
					    int i_235_
						= ((i_228_ & 0xff) * i_223_
						   & 0xff00);
					    is[i_178_++] = (i_233_ | i_234_
							    | i_235_) >>> 8;
					}
				    } else
					i_178_++;
				}
				i_178_ += i_182_;
				i_179_ += i_183_;
			    }
			}
		    } else if (i_174_ == 3) {
			int i_236_ = i_175_ >>> 24;
			int i_237_ = 256 - i_236_;
			for (int i_238_ = -i_180_; i_238_ < 0; i_238_++) {
			    for (int i_239_ = -i_181_; i_239_ < 0; i_239_++) {
				int i_240_ = anIntArray11425[i_179_++];
				int i_241_ = i_240_ + i_175_;
				int i_242_ = ((i_240_ & 0xff00ff)
					      + (i_175_ & 0xff00ff));
				int i_243_ = ((i_242_ & 0x1000100)
					      + (i_241_ - i_242_ & 0x10000));
				i_243_ = i_241_ - i_243_ | i_243_ - (i_243_
								     >>> 8);
				if (i_240_ == 0 && i_236_ != 255) {
				    i_240_ = i_243_;
				    i_243_ = is[i_178_];
				    i_243_ = ((((i_240_ & 0xff00ff) * i_236_
						+ (i_243_ & 0xff00ff) * i_237_)
					       & ~0xff00ff)
					      + (((i_240_ & 0xff00) * i_236_
						  + (i_243_ & 0xff00) * i_237_)
						 & 0xff0000)) >> 8;
				}
				is[i_178_++] = i_243_;
			    }
			    i_178_ += i_182_;
			    i_179_ += i_183_;
			}
		    } else if (i_174_ == 2) {
			int i_244_ = i_175_ >>> 24;
			int i_245_ = 256 - i_244_;
			int i_246_ = (i_175_ & 0xff00ff) * i_245_ & ~0xff00ff;
			int i_247_ = (i_175_ & 0xff00) * i_245_ & 0xff0000;
			i_175_ = (i_246_ | i_247_) >>> 8;
			for (int i_248_ = -i_180_; i_248_ < 0; i_248_++) {
			    for (int i_249_ = -i_181_; i_249_ < 0; i_249_++) {
				int i_250_ = anIntArray11425[i_179_++];
				if (i_250_ != 0) {
				    i_246_ = ((i_250_ & 0xff00ff) * i_244_
					      & ~0xff00ff);
				    i_247_ = ((i_250_ & 0xff00) * i_244_
					      & 0xff0000);
				    is[i_178_++]
					= ((i_246_ | i_247_) >>> 8) + i_175_;
				} else
				    i_178_++;
			    }
			    i_178_ += i_182_;
			    i_179_ += i_183_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_176_ == 2) {
		    if (i_174_ == 1) {
			for (int i_251_ = -i_180_; i_251_ < 0; i_251_++) {
			    for (int i_252_ = -i_181_; i_252_ < 0; i_252_++) {
				int i_253_ = anIntArray11425[i_179_++];
				if (i_253_ != 0) {
				    int i_254_ = is[i_178_];
				    int i_255_ = i_253_ + i_254_;
				    int i_256_ = ((i_253_ & 0xff00ff)
						  + (i_254_ & 0xff00ff));
				    i_254_ = ((i_256_ & 0x1000100)
					      + (i_255_ - i_256_ & 0x10000));
				    is[i_178_++]
					= i_255_ - i_254_ | i_254_ - (i_254_
								      >>> 8);
				} else
				    i_178_++;
			    }
			    i_178_ += i_182_;
			    i_179_ += i_183_;
			}
		    } else if (i_174_ == 0) {
			int i_257_ = (i_175_ & 0xff0000) >> 16;
			int i_258_ = (i_175_ & 0xff00) >> 8;
			int i_259_ = i_175_ & 0xff;
			for (int i_260_ = -i_180_; i_260_ < 0; i_260_++) {
			    for (int i_261_ = -i_181_; i_261_ < 0; i_261_++) {
				int i_262_ = anIntArray11425[i_179_++];
				if (i_262_ != 0) {
				    int i_263_ = ((i_262_ & 0xff0000) * i_257_
						  & ~0xffffff);
				    int i_264_ = ((i_262_ & 0xff00) * i_258_
						  & 0xff0000);
				    int i_265_
					= (i_262_ & 0xff) * i_259_ & 0xff00;
				    i_262_ = (i_263_ | i_264_ | i_265_) >>> 8;
				    int i_266_ = is[i_178_];
				    int i_267_ = i_262_ + i_266_;
				    int i_268_ = ((i_262_ & 0xff00ff)
						  + (i_266_ & 0xff00ff));
				    i_266_ = ((i_268_ & 0x1000100)
					      + (i_267_ - i_268_ & 0x10000));
				    is[i_178_++]
					= i_267_ - i_266_ | i_266_ - (i_266_
								      >>> 8);
				} else
				    i_178_++;
			    }
			    i_178_ += i_182_;
			    i_179_ += i_183_;
			}
		    } else if (i_174_ == 3) {
			for (int i_269_ = -i_180_; i_269_ < 0; i_269_++) {
			    for (int i_270_ = -i_181_; i_270_ < 0; i_270_++) {
				int i_271_ = anIntArray11425[i_179_++];
				int i_272_ = i_271_ + i_175_;
				int i_273_ = ((i_271_ & 0xff00ff)
					      + (i_175_ & 0xff00ff));
				int i_274_ = ((i_273_ & 0x1000100)
					      + (i_272_ - i_273_ & 0x10000));
				i_271_ = i_272_ - i_274_ | i_274_ - (i_274_
								     >>> 8);
				i_274_ = is[i_178_];
				i_272_ = i_271_ + i_274_;
				i_273_ = (i_271_ & 0xff00ff) + (i_274_
								& 0xff00ff);
				i_274_
				    = (i_273_ & 0x1000100) + (i_272_ - i_273_
							      & 0x10000);
				is[i_178_++]
				    = i_272_ - i_274_ | i_274_ - (i_274_
								  >>> 8);
			    }
			    i_178_ += i_182_;
			    i_179_ += i_183_;
			}
		    } else if (i_174_ == 2) {
			int i_275_ = i_175_ >>> 24;
			int i_276_ = 256 - i_275_;
			int i_277_ = (i_175_ & 0xff00ff) * i_276_ & ~0xff00ff;
			int i_278_ = (i_175_ & 0xff00) * i_276_ & 0xff0000;
			i_175_ = (i_277_ | i_278_) >>> 8;
			for (int i_279_ = -i_180_; i_279_ < 0; i_279_++) {
			    for (int i_280_ = -i_181_; i_280_ < 0; i_280_++) {
				int i_281_ = anIntArray11425[i_179_++];
				if (i_281_ != 0) {
				    i_277_ = ((i_281_ & 0xff00ff) * i_275_
					      & ~0xff00ff);
				    i_278_ = ((i_281_ & 0xff00) * i_275_
					      & 0xff0000);
				    i_281_
					= ((i_277_ | i_278_) >>> 8) + i_175_;
				    int i_282_ = is[i_178_];
				    int i_283_ = i_281_ + i_282_;
				    int i_284_ = ((i_281_ & 0xff00ff)
						  + (i_282_ & 0xff00ff));
				    i_282_ = ((i_284_ & 0x1000100)
					      + (i_283_ - i_284_ & 0x10000));
				    is[i_178_++]
					= i_283_ - i_282_ | i_282_ - (i_282_
								      >>> 8);
				} else
				    i_178_++;
			    }
			    i_178_ += i_182_;
			    i_179_ += i_183_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    void method14547(int i, int i_285_) {
	int[] is = aClass182_Sub2_9033.anIntArray9466;
	if (is != null) {
	    if (anInt9006 == 0) {
		if (anInt9017 == 0) {
		    int i_286_ = anInt9023;
		    while (i_286_ < 0) {
			int i_287_ = anInt9015;
			int i_288_ = anInt9022;
			int i_289_ = anInt8999;
			int i_290_ = anInt9011;
			if (i_288_ >= 0 && i_289_ >= 0
			    && i_288_ - (anInt9000 << 12) < 0
			    && i_289_ - (anInt9001 << 12) < 0) {
			    for (/**/; i_290_ < 0; i_290_++)
				method18021(((i_289_ >> 12) * anInt9000
					     + (i_288_ >> 12)),
					    i_287_++, is, i, i_285_);
			}
			i_286_++;
			anInt9015 += anInt9014;
		    }
		} else if (anInt9017 < 0) {
		    int i_291_ = anInt9023;
		    while (i_291_ < 0) {
			int i_292_ = anInt9015;
			int i_293_ = anInt9022;
			int i_294_ = anInt8999 + anInt9025;
			int i_295_ = anInt9011;
			if (i_293_ >= 0 && i_293_ - (anInt9000 << 12) < 0) {
			    int i_296_;
			    if ((i_296_ = i_294_ - (anInt9001 << 12)) >= 0) {
				i_296_ = (anInt9017 - i_296_) / anInt9017;
				i_295_ += i_296_;
				i_294_ += anInt9017 * i_296_;
				i_292_ += i_296_;
			    }
			    if ((i_296_ = (i_294_ - anInt9017) / anInt9017)
				> i_295_)
				i_295_ = i_296_;
			    for (/**/; i_295_ < 0; i_295_++) {
				method18021(((i_294_ >> 12) * anInt9000
					     + (i_293_ >> 12)),
					    i_292_++, is, i, i_285_);
				i_294_ += anInt9017;
			    }
			}
			i_291_++;
			anInt9022 += anInt9018;
			anInt9015 += anInt9014;
		    }
		} else {
		    int i_297_ = anInt9023;
		    while (i_297_ < 0) {
			int i_298_ = anInt9015;
			int i_299_ = anInt9022;
			int i_300_ = anInt8999 + anInt9025;
			int i_301_ = anInt9011;
			if (i_299_ >= 0 && i_299_ - (anInt9000 << 12) < 0) {
			    if (i_300_ < 0) {
				int i_302_
				    = (anInt9017 - 1 - i_300_) / anInt9017;
				i_301_ += i_302_;
				i_300_ += anInt9017 * i_302_;
				i_298_ += i_302_;
			    }
			    int i_303_;
			    if ((i_303_ = (1 + i_300_ - (anInt9001 << 12)
					   - anInt9017) / anInt9017)
				> i_301_)
				i_301_ = i_303_;
			    for (/**/; i_301_ < 0; i_301_++) {
				method18021(((i_300_ >> 12) * anInt9000
					     + (i_299_ >> 12)),
					    i_298_++, is, i, i_285_);
				i_300_ += anInt9017;
			    }
			}
			i_297_++;
			anInt9022 += anInt9018;
			anInt9015 += anInt9014;
		    }
		}
	    } else if (anInt9006 < 0) {
		if (anInt9017 == 0) {
		    int i_304_ = anInt9023;
		    while (i_304_ < 0) {
			int i_305_ = anInt9015;
			int i_306_ = anInt9022 + anInt9024;
			int i_307_ = anInt8999;
			int i_308_ = anInt9011;
			if (i_307_ >= 0 && i_307_ - (anInt9001 << 12) < 0) {
			    int i_309_;
			    if ((i_309_ = i_306_ - (anInt9000 << 12)) >= 0) {
				i_309_ = (anInt9006 - i_309_) / anInt9006;
				i_308_ += i_309_;
				i_306_ += anInt9006 * i_309_;
				i_305_ += i_309_;
			    }
			    if ((i_309_ = (i_306_ - anInt9006) / anInt9006)
				> i_308_)
				i_308_ = i_309_;
			    for (/**/; i_308_ < 0; i_308_++) {
				method18021(((i_307_ >> 12) * anInt9000
					     + (i_306_ >> 12)),
					    i_305_++, is, i, i_285_);
				i_306_ += anInt9006;
			    }
			}
			i_304_++;
			anInt8999 += anInt9010;
			anInt9015 += anInt9014;
		    }
		} else if (anInt9017 < 0) {
		    int i_310_ = anInt9023;
		    while (i_310_ < 0) {
			int i_311_ = anInt9015;
			int i_312_ = anInt9022 + anInt9024;
			int i_313_ = anInt8999 + anInt9025;
			int i_314_ = anInt9011;
			int i_315_;
			if ((i_315_ = i_312_ - (anInt9000 << 12)) >= 0) {
			    i_315_ = (anInt9006 - i_315_) / anInt9006;
			    i_314_ += i_315_;
			    i_312_ += anInt9006 * i_315_;
			    i_313_ += anInt9017 * i_315_;
			    i_311_ += i_315_;
			}
			if ((i_315_ = (i_312_ - anInt9006) / anInt9006)
			    > i_314_)
			    i_314_ = i_315_;
			if ((i_315_ = i_313_ - (anInt9001 << 12)) >= 0) {
			    i_315_ = (anInt9017 - i_315_) / anInt9017;
			    i_314_ += i_315_;
			    i_312_ += anInt9006 * i_315_;
			    i_313_ += anInt9017 * i_315_;
			    i_311_ += i_315_;
			}
			if ((i_315_ = (i_313_ - anInt9017) / anInt9017)
			    > i_314_)
			    i_314_ = i_315_;
			for (/**/; i_314_ < 0; i_314_++) {
			    method18021((i_313_ >> 12) * anInt9000 + (i_312_
								      >> 12),
					i_311_++, is, i, i_285_);
			    i_312_ += anInt9006;
			    i_313_ += anInt9017;
			}
			i_310_++;
			anInt9022 += anInt9018;
			anInt8999 += anInt9010;
			anInt9015 += anInt9014;
		    }
		} else {
		    int i_316_ = anInt9023;
		    while (i_316_ < 0) {
			int i_317_ = anInt9015;
			int i_318_ = anInt9022 + anInt9024;
			int i_319_ = anInt8999 + anInt9025;
			int i_320_ = anInt9011;
			int i_321_;
			if ((i_321_ = i_318_ - (anInt9000 << 12)) >= 0) {
			    i_321_ = (anInt9006 - i_321_) / anInt9006;
			    i_320_ += i_321_;
			    i_318_ += anInt9006 * i_321_;
			    i_319_ += anInt9017 * i_321_;
			    i_317_ += i_321_;
			}
			if ((i_321_ = (i_318_ - anInt9006) / anInt9006)
			    > i_320_)
			    i_320_ = i_321_;
			if (i_319_ < 0) {
			    i_321_ = (anInt9017 - 1 - i_319_) / anInt9017;
			    i_320_ += i_321_;
			    i_318_ += anInt9006 * i_321_;
			    i_319_ += anInt9017 * i_321_;
			    i_317_ += i_321_;
			}
			if ((i_321_ = (1 + i_319_ - (anInt9001 << 12)
				       - anInt9017) / anInt9017)
			    > i_320_)
			    i_320_ = i_321_;
			for (/**/; i_320_ < 0; i_320_++) {
			    method18021((i_319_ >> 12) * anInt9000 + (i_318_
								      >> 12),
					i_317_++, is, i, i_285_);
			    i_318_ += anInt9006;
			    i_319_ += anInt9017;
			}
			i_316_++;
			anInt9022 += anInt9018;
			anInt8999 += anInt9010;
			anInt9015 += anInt9014;
		    }
		}
	    } else if (anInt9017 == 0) {
		int i_322_ = anInt9023;
		while (i_322_ < 0) {
		    int i_323_ = anInt9015;
		    int i_324_ = anInt9022 + anInt9024;
		    int i_325_ = anInt8999;
		    int i_326_ = anInt9011;
		    if (i_325_ >= 0 && i_325_ - (anInt9001 << 12) < 0) {
			if (i_324_ < 0) {
			    int i_327_ = (anInt9006 - 1 - i_324_) / anInt9006;
			    i_326_ += i_327_;
			    i_324_ += anInt9006 * i_327_;
			    i_323_ += i_327_;
			}
			int i_328_;
			if ((i_328_ = (1 + i_324_ - (anInt9000 << 12)
				       - anInt9006) / anInt9006)
			    > i_326_)
			    i_326_ = i_328_;
			for (/**/; i_326_ < 0; i_326_++) {
			    method18021((i_325_ >> 12) * anInt9000 + (i_324_
								      >> 12),
					i_323_++, is, i, i_285_);
			    i_324_ += anInt9006;
			}
		    }
		    i_322_++;
		    anInt9022 += anInt9018;
		    anInt8999 += anInt9010;
		    anInt9015 += anInt9014;
		}
	    } else if (anInt9017 < 0) {
		for (int i_329_ = anInt9023; i_329_ < 0; i_329_++) {
		    int i_330_ = anInt9015;
		    int i_331_ = anInt9022 + anInt9024;
		    int i_332_ = anInt8999 + anInt9025;
		    int i_333_ = anInt9011;
		    if (i_331_ < 0) {
			int i_334_ = (anInt9006 - 1 - i_331_) / anInt9006;
			i_333_ += i_334_;
			i_331_ += anInt9006 * i_334_;
			i_332_ += anInt9017 * i_334_;
			i_330_ += i_334_;
		    }
		    int i_335_;
		    if ((i_335_ = ((1 + i_331_ - (anInt9000 << 12) - anInt9006)
				   / anInt9006))
			> i_333_)
			i_333_ = i_335_;
		    if ((i_335_ = i_332_ - (anInt9001 << 12)) >= 0) {
			i_335_ = (anInt9017 - i_335_) / anInt9017;
			i_333_ += i_335_;
			i_331_ += anInt9006 * i_335_;
			i_332_ += anInt9017 * i_335_;
			i_330_ += i_335_;
		    }
		    if ((i_335_ = (i_332_ - anInt9017) / anInt9017) > i_333_)
			i_333_ = i_335_;
		    for (/**/; i_333_ < 0; i_333_++) {
			method18021((i_332_ >> 12) * anInt9000 + (i_331_
								  >> 12),
				    i_330_++, is, i, i_285_);
			i_331_ += anInt9006;
			i_332_ += anInt9017;
		    }
		    anInt9022 += anInt9018;
		    anInt8999 += anInt9010;
		    anInt9015 += anInt9014;
		}
	    } else {
		for (int i_336_ = anInt9023; i_336_ < 0; i_336_++) {
		    int i_337_ = anInt9015;
		    int i_338_ = anInt9022 + anInt9024;
		    int i_339_ = anInt8999 + anInt9025;
		    int i_340_ = anInt9011;
		    if (i_338_ < 0) {
			int i_341_ = (anInt9006 - 1 - i_338_) / anInt9006;
			i_340_ += i_341_;
			i_338_ += anInt9006 * i_341_;
			i_339_ += anInt9017 * i_341_;
			i_337_ += i_341_;
		    }
		    int i_342_;
		    if ((i_342_ = ((1 + i_338_ - (anInt9000 << 12) - anInt9006)
				   / anInt9006))
			> i_340_)
			i_340_ = i_342_;
		    if (i_339_ < 0) {
			i_342_ = (anInt9017 - 1 - i_339_) / anInt9017;
			i_340_ += i_342_;
			i_338_ += anInt9006 * i_342_;
			i_339_ += anInt9017 * i_342_;
			i_337_ += i_342_;
		    }
		    if ((i_342_ = ((1 + i_339_ - (anInt9001 << 12) - anInt9017)
				   / anInt9017))
			> i_340_)
			i_340_ = i_342_;
		    for (/**/; i_340_ < 0; i_340_++) {
			method18021((i_339_ >> 12) * anInt9000 + (i_338_
								  >> 12),
				    i_337_++, is, i, i_285_);
			i_338_ += anInt9006;
			i_339_ += anInt9017;
		    }
		    anInt9022 += anInt9018;
		    anInt8999 += anInt9010;
		    anInt9015 += anInt9014;
		}
	    }
	}
    }
    
    void method2483(int i, int i_343_, int i_344_, int i_345_, int i_346_,
		    int i_347_, int i_348_, int i_349_) {
	if (aClass182_Sub2_9033.method15226())
	    throw new IllegalStateException();
	if (i_344_ > 0 && i_345_ > 0) {
	    int[] is = aClass182_Sub2_9033.anIntArray9466;
	    if (is != null) {
		int i_350_ = 0;
		int i_351_ = 0;
		int i_352_ = aClass182_Sub2_9033.anInt9494 * -476035351;
		int i_353_ = anInt9002 + anInt9000 + anInt9004;
		int i_354_ = anInt9003 + anInt9001 + anInt9005;
		int i_355_ = (i_353_ << 16) / i_344_;
		int i_356_ = (i_354_ << 16) / i_345_;
		if (anInt9002 > 0) {
		    int i_357_ = ((anInt9002 << 16) + i_355_ - 1) / i_355_;
		    i += i_357_;
		    i_350_ += i_357_ * i_355_ - (anInt9002 << 16);
		}
		if (anInt9003 > 0) {
		    int i_358_ = ((anInt9003 << 16) + i_356_ - 1) / i_356_;
		    i_343_ += i_358_;
		    i_351_ += i_358_ * i_356_ - (anInt9003 << 16);
		}
		if (anInt9000 < i_353_)
		    i_344_
			= ((anInt9000 << 16) - i_350_ + i_355_ - 1) / i_355_;
		if (anInt9001 < i_354_)
		    i_345_
			= ((anInt9001 << 16) - i_351_ + i_356_ - 1) / i_356_;
		int i_359_ = i + i_343_ * i_352_;
		int i_360_ = i_352_ - i_344_;
		if (i_343_ + i_345_
		    > aClass182_Sub2_9033.anInt9473 * 1920901985)
		    i_345_ -= (i_343_ + i_345_
			       - aClass182_Sub2_9033.anInt9473 * 1920901985);
		if (i_343_ < aClass182_Sub2_9033.anInt9472 * 1722112305) {
		    int i_361_
			= aClass182_Sub2_9033.anInt9472 * 1722112305 - i_343_;
		    i_345_ -= i_361_;
		    i_359_ += i_361_ * i_352_;
		    i_351_ += i_356_ * i_361_;
		}
		if (i + i_344_ > aClass182_Sub2_9033.anInt9499 * -466178451) {
		    int i_362_
			= (i + i_344_
			   - aClass182_Sub2_9033.anInt9499 * -466178451);
		    i_344_ -= i_362_;
		    i_360_ += i_362_;
		}
		if (i < aClass182_Sub2_9033.anInt9470 * 1988019027) {
		    int i_363_
			= aClass182_Sub2_9033.anInt9470 * 1988019027 - i;
		    i_344_ -= i_363_;
		    i_359_ += i_363_;
		    i_350_ += i_355_ * i_363_;
		    i_360_ += i_363_;
		}
		if (i_348_ == 0) {
		    if (i_346_ == 1) {
			int i_364_ = i_350_;
			for (int i_365_ = -i_345_; i_365_ < 0; i_365_++) {
			    int i_366_ = (i_351_ >> 16) * anInt9000;
			    for (int i_367_ = -i_344_; i_367_ < 0; i_367_++) {
				is[i_359_++]
				    = anIntArray11425[(i_350_ >> 16) + i_366_];
				i_350_ += i_355_;
			    }
			    i_351_ += i_356_;
			    i_350_ = i_364_;
			    i_359_ += i_360_;
			}
		    } else if (i_346_ == 0) {
			int i_368_ = (i_347_ & 0xff0000) >> 16;
			int i_369_ = (i_347_ & 0xff00) >> 8;
			int i_370_ = i_347_ & 0xff;
			int i_371_ = i_350_;
			for (int i_372_ = -i_345_; i_372_ < 0; i_372_++) {
			    int i_373_ = (i_351_ >> 16) * anInt9000;
			    for (int i_374_ = -i_344_; i_374_ < 0; i_374_++) {
				int i_375_
				    = anIntArray11425[(i_350_ >> 16) + i_373_];
				int i_376_
				    = (i_375_ & 0xff0000) * i_368_ & ~0xffffff;
				int i_377_
				    = (i_375_ & 0xff00) * i_369_ & 0xff0000;
				int i_378_ = (i_375_ & 0xff) * i_370_ & 0xff00;
				is[i_359_++]
				    = (i_376_ | i_377_ | i_378_) >>> 8;
				i_350_ += i_355_;
			    }
			    i_351_ += i_356_;
			    i_350_ = i_371_;
			    i_359_ += i_360_;
			}
		    } else if (i_346_ == 3) {
			int i_379_ = i_350_;
			for (int i_380_ = -i_345_; i_380_ < 0; i_380_++) {
			    int i_381_ = (i_351_ >> 16) * anInt9000;
			    for (int i_382_ = -i_344_; i_382_ < 0; i_382_++) {
				int i_383_
				    = anIntArray11425[(i_350_ >> 16) + i_381_];
				int i_384_ = i_383_ + i_347_;
				int i_385_ = ((i_383_ & 0xff00ff)
					      + (i_347_ & 0xff00ff));
				int i_386_ = ((i_385_ & 0x1000100)
					      + (i_384_ - i_385_ & 0x10000));
				is[i_359_++]
				    = i_384_ - i_386_ | i_386_ - (i_386_
								  >>> 8);
				i_350_ += i_355_;
			    }
			    i_351_ += i_356_;
			    i_350_ = i_379_;
			    i_359_ += i_360_;
			}
		    } else if (i_346_ == 2) {
			int i_387_ = i_347_ >>> 24;
			int i_388_ = 256 - i_387_;
			int i_389_ = (i_347_ & 0xff00ff) * i_388_ & ~0xff00ff;
			int i_390_ = (i_347_ & 0xff00) * i_388_ & 0xff0000;
			i_347_ = (i_389_ | i_390_) >>> 8;
			int i_391_ = i_350_;
			for (int i_392_ = -i_345_; i_392_ < 0; i_392_++) {
			    int i_393_ = (i_351_ >> 16) * anInt9000;
			    for (int i_394_ = -i_344_; i_394_ < 0; i_394_++) {
				int i_395_
				    = anIntArray11425[(i_350_ >> 16) + i_393_];
				i_389_
				    = (i_395_ & 0xff00ff) * i_387_ & ~0xff00ff;
				i_390_ = (i_395_ & 0xff00) * i_387_ & 0xff0000;
				is[i_359_++]
				    = ((i_389_ | i_390_) >>> 8) + i_347_;
				i_350_ += i_355_;
			    }
			    i_351_ += i_356_;
			    i_350_ = i_391_;
			    i_359_ += i_360_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_348_ == 1) {
		    if (i_346_ == 1) {
			int i_396_ = i_350_;
			for (int i_397_ = -i_345_; i_397_ < 0; i_397_++) {
			    int i_398_ = (i_351_ >> 16) * anInt9000;
			    for (int i_399_ = -i_344_; i_399_ < 0; i_399_++) {
				int i_400_
				    = anIntArray11425[(i_350_ >> 16) + i_398_];
				if (i_400_ != 0)
				    is[i_359_++] = i_400_;
				else
				    i_359_++;
				i_350_ += i_355_;
			    }
			    i_351_ += i_356_;
			    i_350_ = i_396_;
			    i_359_ += i_360_;
			}
		    } else if (i_346_ == 0) {
			int i_401_ = i_350_;
			if ((i_347_ & 0xffffff) == 16777215) {
			    int i_402_ = i_347_ >>> 24;
			    int i_403_ = 256 - i_402_;
			    for (int i_404_ = -i_345_; i_404_ < 0; i_404_++) {
				int i_405_ = (i_351_ >> 16) * anInt9000;
				for (int i_406_ = -i_344_; i_406_ < 0;
				     i_406_++) {
				    int i_407_ = (anIntArray11425
						  [(i_350_ >> 16) + i_405_]);
				    if (i_407_ != 0) {
					int i_408_ = is[i_359_];
					is[i_359_++]
					    = ((((i_407_ & 0xff00ff) * i_402_
						 + ((i_408_ & 0xff00ff)
						    * i_403_))
						& ~0xff00ff)
					       + (((i_407_ & 0xff00) * i_402_
						   + ((i_408_ & 0xff00)
						      * i_403_))
						  & 0xff0000)) >> 8;
				    } else
					i_359_++;
				    i_350_ += i_355_;
				}
				i_351_ += i_356_;
				i_350_ = i_401_;
				i_359_ += i_360_;
			    }
			} else {
			    int i_409_ = (i_347_ & 0xff0000) >> 16;
			    int i_410_ = (i_347_ & 0xff00) >> 8;
			    int i_411_ = i_347_ & 0xff;
			    int i_412_ = i_347_ >>> 24;
			    int i_413_ = 256 - i_412_;
			    for (int i_414_ = -i_345_; i_414_ < 0; i_414_++) {
				int i_415_ = (i_351_ >> 16) * anInt9000;
				for (int i_416_ = -i_344_; i_416_ < 0;
				     i_416_++) {
				    int i_417_ = (anIntArray11425
						  [(i_350_ >> 16) + i_415_]);
				    if (i_417_ != 0) {
					if (i_412_ != 255) {
					    int i_418_
						= ((i_417_ & 0xff0000) * i_409_
						   & ~0xffffff);
					    int i_419_
						= ((i_417_ & 0xff00) * i_410_
						   & 0xff0000);
					    int i_420_
						= ((i_417_ & 0xff) * i_411_
						   & 0xff00);
					    i_417_ = (i_418_ | i_419_
						      | i_420_) >>> 8;
					    int i_421_ = is[i_359_];
					    is[i_359_++]
						= (((((i_417_ & 0xff00ff)
						      * i_412_)
						     + ((i_421_ & 0xff00ff)
							* i_413_))
						    & ~0xff00ff)
						   + ((((i_417_ & 0xff00)
							* i_412_)
						       + ((i_421_ & 0xff00)
							  * i_413_))
						      & 0xff0000)) >> 8;
					} else {
					    int i_422_
						= ((i_417_ & 0xff0000) * i_409_
						   & ~0xffffff);
					    int i_423_
						= ((i_417_ & 0xff00) * i_410_
						   & 0xff0000);
					    int i_424_
						= ((i_417_ & 0xff) * i_411_
						   & 0xff00);
					    is[i_359_++] = (i_422_ | i_423_
							    | i_424_) >>> 8;
					}
				    } else
					i_359_++;
				    i_350_ += i_355_;
				}
				i_351_ += i_356_;
				i_350_ = i_401_;
				i_359_ += i_360_;
			    }
			}
		    } else if (i_346_ == 3) {
			int i_425_ = i_350_;
			int i_426_ = i_347_ >>> 24;
			int i_427_ = 256 - i_426_;
			for (int i_428_ = -i_345_; i_428_ < 0; i_428_++) {
			    int i_429_ = (i_351_ >> 16) * anInt9000;
			    for (int i_430_ = -i_344_; i_430_ < 0; i_430_++) {
				int i_431_
				    = anIntArray11425[(i_350_ >> 16) + i_429_];
				int i_432_ = i_431_ + i_347_;
				int i_433_ = ((i_431_ & 0xff00ff)
					      + (i_347_ & 0xff00ff));
				int i_434_ = ((i_433_ & 0x1000100)
					      + (i_432_ - i_433_ & 0x10000));
				i_434_ = i_432_ - i_434_ | i_434_ - (i_434_
								     >>> 8);
				if (i_431_ == 0 && i_426_ != 255) {
				    i_431_ = i_434_;
				    i_434_ = is[i_359_];
				    i_434_ = ((((i_431_ & 0xff00ff) * i_426_
						+ (i_434_ & 0xff00ff) * i_427_)
					       & ~0xff00ff)
					      + (((i_431_ & 0xff00) * i_426_
						  + (i_434_ & 0xff00) * i_427_)
						 & 0xff0000)) >> 8;
				}
				is[i_359_++] = i_434_;
				i_350_ += i_355_;
			    }
			    i_351_ += i_356_;
			    i_350_ = i_425_;
			    i_359_ += i_360_;
			}
		    } else if (i_346_ == 2) {
			int i_435_ = i_347_ >>> 24;
			int i_436_ = 256 - i_435_;
			int i_437_ = (i_347_ & 0xff00ff) * i_436_ & ~0xff00ff;
			int i_438_ = (i_347_ & 0xff00) * i_436_ & 0xff0000;
			i_347_ = (i_437_ | i_438_) >>> 8;
			int i_439_ = i_350_;
			for (int i_440_ = -i_345_; i_440_ < 0; i_440_++) {
			    int i_441_ = (i_351_ >> 16) * anInt9000;
			    for (int i_442_ = -i_344_; i_442_ < 0; i_442_++) {
				int i_443_
				    = anIntArray11425[(i_350_ >> 16) + i_441_];
				if (i_443_ != 0) {
				    i_437_ = ((i_443_ & 0xff00ff) * i_435_
					      & ~0xff00ff);
				    i_438_ = ((i_443_ & 0xff00) * i_435_
					      & 0xff0000);
				    is[i_359_++]
					= ((i_437_ | i_438_) >>> 8) + i_347_;
				} else
				    i_359_++;
				i_350_ += i_355_;
			    }
			    i_351_ += i_356_;
			    i_350_ = i_439_;
			    i_359_ += i_360_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_348_ == 2) {
		    if (i_346_ == 1) {
			int i_444_ = i_350_;
			for (int i_445_ = -i_345_; i_445_ < 0; i_445_++) {
			    int i_446_ = (i_351_ >> 16) * anInt9000;
			    for (int i_447_ = -i_344_; i_447_ < 0; i_447_++) {
				int i_448_
				    = anIntArray11425[(i_350_ >> 16) + i_446_];
				if (i_448_ != 0) {
				    int i_449_ = is[i_359_];
				    int i_450_ = i_448_ + i_449_;
				    int i_451_ = ((i_448_ & 0xff00ff)
						  + (i_449_ & 0xff00ff));
				    i_449_ = ((i_451_ & 0x1000100)
					      + (i_450_ - i_451_ & 0x10000));
				    is[i_359_++]
					= i_450_ - i_449_ | i_449_ - (i_449_
								      >>> 8);
				} else
				    i_359_++;
				i_350_ += i_355_;
			    }
			    i_351_ += i_356_;
			    i_350_ = i_444_;
			    i_359_ += i_360_;
			}
		    } else if (i_346_ == 0) {
			int i_452_ = i_350_;
			int i_453_ = (i_347_ & 0xff0000) >> 16;
			int i_454_ = (i_347_ & 0xff00) >> 8;
			int i_455_ = i_347_ & 0xff;
			for (int i_456_ = -i_345_; i_456_ < 0; i_456_++) {
			    int i_457_ = (i_351_ >> 16) * anInt9000;
			    for (int i_458_ = -i_344_; i_458_ < 0; i_458_++) {
				int i_459_
				    = anIntArray11425[(i_350_ >> 16) + i_457_];
				if (i_459_ != 0) {
				    int i_460_ = ((i_459_ & 0xff0000) * i_453_
						  & ~0xffffff);
				    int i_461_ = ((i_459_ & 0xff00) * i_454_
						  & 0xff0000);
				    int i_462_
					= (i_459_ & 0xff) * i_455_ & 0xff00;
				    i_459_ = (i_460_ | i_461_ | i_462_) >>> 8;
				    int i_463_ = is[i_359_];
				    int i_464_ = i_459_ + i_463_;
				    int i_465_ = ((i_459_ & 0xff00ff)
						  + (i_463_ & 0xff00ff));
				    i_463_ = ((i_465_ & 0x1000100)
					      + (i_464_ - i_465_ & 0x10000));
				    is[i_359_++]
					= i_464_ - i_463_ | i_463_ - (i_463_
								      >>> 8);
				} else
				    i_359_++;
				i_350_ += i_355_;
			    }
			    i_351_ += i_356_;
			    i_350_ = i_452_;
			    i_359_ += i_360_;
			}
		    } else if (i_346_ == 3) {
			int i_466_ = i_350_;
			for (int i_467_ = -i_345_; i_467_ < 0; i_467_++) {
			    int i_468_ = (i_351_ >> 16) * anInt9000;
			    for (int i_469_ = -i_344_; i_469_ < 0; i_469_++) {
				int i_470_
				    = anIntArray11425[(i_350_ >> 16) + i_468_];
				int i_471_ = i_470_ + i_347_;
				int i_472_ = ((i_470_ & 0xff00ff)
					      + (i_347_ & 0xff00ff));
				int i_473_ = ((i_472_ & 0x1000100)
					      + (i_471_ - i_472_ & 0x10000));
				i_470_ = i_471_ - i_473_ | i_473_ - (i_473_
								     >>> 8);
				i_473_ = is[i_359_];
				i_471_ = i_470_ + i_473_;
				i_472_ = (i_470_ & 0xff00ff) + (i_473_
								& 0xff00ff);
				i_473_
				    = (i_472_ & 0x1000100) + (i_471_ - i_472_
							      & 0x10000);
				is[i_359_++]
				    = i_471_ - i_473_ | i_473_ - (i_473_
								  >>> 8);
				i_350_ += i_355_;
			    }
			    i_351_ += i_356_;
			    i_350_ = i_466_;
			    i_359_ += i_360_;
			}
		    } else if (i_346_ == 2) {
			int i_474_ = i_347_ >>> 24;
			int i_475_ = 256 - i_474_;
			int i_476_ = (i_347_ & 0xff00ff) * i_475_ & ~0xff00ff;
			int i_477_ = (i_347_ & 0xff00) * i_475_ & 0xff0000;
			i_347_ = (i_476_ | i_477_) >>> 8;
			int i_478_ = i_350_;
			for (int i_479_ = -i_345_; i_479_ < 0; i_479_++) {
			    int i_480_ = (i_351_ >> 16) * anInt9000;
			    for (int i_481_ = -i_344_; i_481_ < 0; i_481_++) {
				int i_482_
				    = anIntArray11425[(i_350_ >> 16) + i_480_];
				if (i_482_ != 0) {
				    i_476_ = ((i_482_ & 0xff00ff) * i_474_
					      & ~0xff00ff);
				    i_477_ = ((i_482_ & 0xff00) * i_474_
					      & 0xff0000);
				    i_482_
					= ((i_476_ | i_477_) >>> 8) + i_347_;
				    int i_483_ = is[i_359_];
				    int i_484_ = i_482_ + i_483_;
				    int i_485_ = ((i_482_ & 0xff00ff)
						  + (i_483_ & 0xff00ff));
				    i_483_ = ((i_485_ & 0x1000100)
					      + (i_484_ - i_485_ & 0x10000));
				    is[i_359_++]
					= i_484_ - i_483_ | i_483_ - (i_483_
								      >>> 8);
				} else
				    i_359_++;
				i_350_ += i_355_;
			    }
			    i_351_ += i_356_;
			    i_350_ = i_478_;
			    i_359_ += i_360_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    void method14537(boolean bool, boolean bool_486_, boolean bool_487_, int i,
		     int i_488_, float f, int i_489_, int i_490_, int i_491_,
		     int i_492_, int i_493_, int i_494_, boolean bool_495_) {
	if (i_489_ > 0 && i_490_ > 0 && (bool || bool_486_)) {
	    int i_496_ = 0;
	    int i_497_ = 0;
	    int i_498_ = anInt9002 + anInt9000 + anInt9004;
	    int i_499_ = anInt9003 + anInt9001 + anInt9005;
	    int i_500_ = (i_498_ << 16) / i_489_;
	    int i_501_ = (i_499_ << 16) / i_490_;
	    if (anInt9002 > 0) {
		int i_502_ = ((anInt9002 << 16) + i_500_ - 1) / i_500_;
		i += i_502_;
		i_496_ += i_502_ * i_500_ - (anInt9002 << 16);
	    }
	    if (anInt9003 > 0) {
		int i_503_ = ((anInt9003 << 16) + i_501_ - 1) / i_501_;
		i_488_ += i_503_;
		i_497_ += i_503_ * i_501_ - (anInt9003 << 16);
	    }
	    if (anInt9000 < i_498_)
		i_489_ = ((anInt9000 << 16) - i_496_ + i_500_ - 1) / i_500_;
	    if (anInt9001 < i_499_)
		i_490_ = ((anInt9001 << 16) - i_497_ + i_501_ - 1) / i_501_;
	    int i_504_
		= i + i_488_ * (aClass182_Sub2_9033.anInt9494 * -476035351);
	    int i_505_ = aClass182_Sub2_9033.anInt9494 * -476035351 - i_489_;
	    if (i_488_ + i_490_ > aClass182_Sub2_9033.anInt9473 * 1920901985)
		i_490_ -= (i_488_ + i_490_
			   - aClass182_Sub2_9033.anInt9473 * 1920901985);
	    if (i_488_ < aClass182_Sub2_9033.anInt9472 * 1722112305) {
		int i_506_
		    = aClass182_Sub2_9033.anInt9472 * 1722112305 - i_488_;
		i_490_ -= i_506_;
		i_504_
		    += i_506_ * (aClass182_Sub2_9033.anInt9494 * -476035351);
		i_497_ += i_501_ * i_506_;
	    }
	    if (i + i_489_ > aClass182_Sub2_9033.anInt9499 * -466178451) {
		int i_507_
		    = i + i_489_ - aClass182_Sub2_9033.anInt9499 * -466178451;
		i_489_ -= i_507_;
		i_505_ += i_507_;
	    }
	    if (i < aClass182_Sub2_9033.anInt9470 * 1988019027) {
		int i_508_ = aClass182_Sub2_9033.anInt9470 * 1988019027 - i;
		i_489_ -= i_508_;
		i_504_ += i_508_;
		i_496_ += i_500_ * i_508_;
		i_505_ += i_508_;
	    }
	    float[] fs = aClass182_Sub2_9033.aFloatArray9469;
	    int[] is = aClass182_Sub2_9033.anIntArray9466;
	    if (i_493_ == 0) {
		if (i_491_ == 1) {
		    int i_509_ = i_496_;
		    for (int i_510_ = -i_490_; i_510_ < 0; i_510_++) {
			int i_511_ = (i_497_ >> 16) * anInt9000;
			for (int i_512_ = -i_489_; i_512_ < 0; i_512_++) {
			    if (!bool_486_ || f < fs[i_504_]) {
				if (bool)
				    is[i_504_] = (anIntArray11425
						  [(i_496_ >> 16) + i_511_]);
				if (bool_486_ && bool_495_)
				    fs[i_504_] = f;
			    }
			    i_496_ += i_500_;
			    i_504_++;
			}
			i_497_ += i_501_;
			i_496_ = i_509_;
			i_504_ += i_505_;
		    }
		} else if (i_491_ == 0) {
		    int i_513_ = (i_492_ & 0xff0000) >> 16;
		    int i_514_ = (i_492_ & 0xff00) >> 8;
		    int i_515_ = i_492_ & 0xff;
		    int i_516_ = i_496_;
		    for (int i_517_ = -i_490_; i_517_ < 0; i_517_++) {
			int i_518_ = (i_497_ >> 16) * anInt9000;
			for (int i_519_ = -i_489_; i_519_ < 0; i_519_++) {
			    if (!bool_486_ || f < fs[i_504_]) {
				if (bool) {
				    int i_520_ = (anIntArray11425
						  [(i_496_ >> 16) + i_518_]);
				    int i_521_ = ((i_520_ & 0xff0000) * i_513_
						  & ~0xffffff);
				    int i_522_ = ((i_520_ & 0xff00) * i_514_
						  & 0xff0000);
				    int i_523_
					= (i_520_ & 0xff) * i_515_ & 0xff00;
				    is[i_504_]
					= (i_521_ | i_522_ | i_523_) >>> 8;
				}
				if (bool_486_ && bool_495_)
				    fs[i_504_] = f;
			    }
			    i_496_ += i_500_;
			    i_504_++;
			}
			i_497_ += i_501_;
			i_496_ = i_516_;
			i_504_ += i_505_;
		    }
		} else if (i_491_ == 3) {
		    int i_524_ = i_496_;
		    for (int i_525_ = -i_490_; i_525_ < 0; i_525_++) {
			int i_526_ = (i_497_ >> 16) * anInt9000;
			for (int i_527_ = -i_489_; i_527_ < 0; i_527_++) {
			    if (!bool_486_ || f < fs[i_504_]) {
				if (bool) {
				    int i_528_ = (anIntArray11425
						  [(i_496_ >> 16) + i_526_]);
				    int i_529_ = i_528_ + i_492_;
				    int i_530_ = ((i_528_ & 0xff00ff)
						  + (i_492_ & 0xff00ff));
				    int i_531_
					= ((i_530_ & 0x1000100)
					   + (i_529_ - i_530_ & 0x10000));
				    is[i_504_]
					= i_529_ - i_531_ | i_531_ - (i_531_
								      >>> 8);
				}
				if (bool_486_ && bool_495_)
				    fs[i_504_] = f;
			    }
			    i_496_ += i_500_;
			    i_504_++;
			}
			i_497_ += i_501_;
			i_496_ = i_524_;
			i_504_ += i_505_;
		    }
		} else if (i_491_ == 2) {
		    int i_532_ = i_492_ >>> 24;
		    int i_533_ = 256 - i_532_;
		    int i_534_ = (i_492_ & 0xff00ff) * i_533_ & ~0xff00ff;
		    int i_535_ = (i_492_ & 0xff00) * i_533_ & 0xff0000;
		    i_492_ = (i_534_ | i_535_) >>> 8;
		    int i_536_ = i_496_;
		    for (int i_537_ = -i_490_; i_537_ < 0; i_537_++) {
			int i_538_ = (i_497_ >> 16) * anInt9000;
			for (int i_539_ = -i_489_; i_539_ < 0; i_539_++) {
			    if (!bool_486_ || f < fs[i_504_]) {
				if (bool) {
				    int i_540_ = (anIntArray11425
						  [(i_496_ >> 16) + i_538_]);
				    i_534_ = ((i_540_ & 0xff00ff) * i_532_
					      & ~0xff00ff);
				    i_535_ = ((i_540_ & 0xff00) * i_532_
					      & 0xff0000);
				    is[i_504_]
					= ((i_534_ | i_535_) >>> 8) + i_492_;
				}
				if (bool_486_ && bool_495_)
				    fs[i_504_] = f;
			    }
			    i_496_ += i_500_;
			    i_504_++;
			}
			i_497_ += i_501_;
			i_496_ = i_536_;
			i_504_ += i_505_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_493_ == 1) {
		if (i_491_ == 1) {
		    int i_541_ = i_496_;
		    for (int i_542_ = -i_490_; i_542_ < 0; i_542_++) {
			int i_543_ = (i_497_ >> 16) * anInt9000;
			for (int i_544_ = -i_489_; i_544_ < 0; i_544_++) {
			    if (!bool_486_ || f < fs[i_504_]) {
				int i_545_
				    = anIntArray11425[(i_496_ >> 16) + i_543_];
				if (i_545_ != 0) {
				    if (bool)
					is[i_504_] = i_545_;
				    if (bool_486_ && bool_495_)
					fs[i_504_] = f;
				}
			    }
			    i_496_ += i_500_;
			    i_504_++;
			}
			i_497_ += i_501_;
			i_496_ = i_541_;
			i_504_ += i_505_;
		    }
		} else if (i_491_ == 0) {
		    int i_546_ = i_496_;
		    if ((i_492_ & 0xffffff) == 16777215) {
			int i_547_ = i_492_ >>> 24;
			int i_548_ = 256 - i_547_;
			for (int i_549_ = -i_490_; i_549_ < 0; i_549_++) {
			    int i_550_ = (i_497_ >> 16) * anInt9000;
			    for (int i_551_ = -i_489_; i_551_ < 0; i_551_++) {
				if (!bool_486_ || f < fs[i_504_]) {
				    int i_552_ = (anIntArray11425
						  [(i_496_ >> 16) + i_550_]);
				    if (i_552_ != 0) {
					if (bool) {
					    int i_553_ = is[i_504_];
					    is[i_504_]
						= (((((i_552_ & 0xff00ff)
						      * i_547_)
						     + ((i_553_ & 0xff00ff)
							* i_548_))
						    & ~0xff00ff)
						   + ((((i_552_ & 0xff00)
							* i_547_)
						       + ((i_553_ & 0xff00)
							  * i_548_))
						      & 0xff0000)) >> 8;
					}
					if (bool_486_ && bool_495_)
					    fs[i_504_] = f;
				    }
				}
				i_496_ += i_500_;
				i_504_++;
			    }
			    i_497_ += i_501_;
			    i_496_ = i_546_;
			    i_504_ += i_505_;
			}
		    } else {
			int i_554_ = (i_492_ & 0xff0000) >> 16;
			int i_555_ = (i_492_ & 0xff00) >> 8;
			int i_556_ = i_492_ & 0xff;
			int i_557_ = i_492_ >>> 24;
			int i_558_ = 256 - i_557_;
			for (int i_559_ = -i_490_; i_559_ < 0; i_559_++) {
			    int i_560_ = (i_497_ >> 16) * anInt9000;
			    for (int i_561_ = -i_489_; i_561_ < 0; i_561_++) {
				if (!bool_486_ || f < fs[i_504_]) {
				    int i_562_ = (anIntArray11425
						  [(i_496_ >> 16) + i_560_]);
				    if (i_562_ != 0) {
					if (i_557_ != 255) {
					    if (bool) {
						int i_563_
						    = (((i_562_ & 0xff0000)
							* i_554_)
						       & ~0xffffff);
						int i_564_
						    = (((i_562_ & 0xff00)
							* i_555_)
						       & 0xff0000);
						int i_565_
						    = ((i_562_ & 0xff) * i_556_
						       & 0xff00);
						i_562_ = (i_563_ | i_564_
							  | i_565_) >>> 8;
						int i_566_ = is[i_504_];
						is[i_504_]
						    = (((((i_562_ & 0xff00ff)
							  * i_557_)
							 + ((i_566_ & 0xff00ff)
							    * i_558_))
							& ~0xff00ff)
						       + ((((i_562_ & 0xff00)
							    * i_557_)
							   + ((i_566_ & 0xff00)
							      * i_558_))
							  & 0xff0000)) >> 8;
					    }
					    if (bool_486_ && bool_495_)
						fs[i_504_] = f;
					} else {
					    if (bool) {
						int i_567_
						    = (((i_562_ & 0xff0000)
							* i_554_)
						       & ~0xffffff);
						int i_568_
						    = (((i_562_ & 0xff00)
							* i_555_)
						       & 0xff0000);
						int i_569_
						    = ((i_562_ & 0xff) * i_556_
						       & 0xff00);
						is[i_504_] = (i_567_ | i_568_
							      | i_569_) >>> 8;
					    }
					    if (bool_486_ && bool_495_)
						fs[i_504_] = f;
					}
				    }
				}
				i_496_ += i_500_;
				i_504_++;
			    }
			    i_497_ += i_501_;
			    i_496_ = i_546_;
			    i_504_ += i_505_;
			}
		    }
		} else if (i_491_ == 3) {
		    int i_570_ = i_496_;
		    int i_571_ = i_492_ >>> 24;
		    int i_572_ = 256 - i_571_;
		    for (int i_573_ = -i_490_; i_573_ < 0; i_573_++) {
			int i_574_ = (i_497_ >> 16) * anInt9000;
			for (int i_575_ = -i_489_; i_575_ < 0; i_575_++) {
			    if (!bool_486_ || f < fs[i_504_]) {
				if (bool) {
				    int i_576_ = (anIntArray11425
						  [(i_496_ >> 16) + i_574_]);
				    int i_577_ = i_576_ + i_492_;
				    int i_578_ = ((i_576_ & 0xff00ff)
						  + (i_492_ & 0xff00ff));
				    int i_579_
					= ((i_578_ & 0x1000100)
					   + (i_577_ - i_578_ & 0x10000));
				    i_579_
					= i_577_ - i_579_ | i_579_ - (i_579_
								      >>> 8);
				    if (i_576_ == 0 && i_571_ != 255) {
					i_576_ = i_579_;
					i_579_ = is[i_504_];
					i_579_
					    = ((((i_576_ & 0xff00ff) * i_571_
						 + ((i_579_ & 0xff00ff)
						    * i_572_))
						& ~0xff00ff)
					       + (((i_576_ & 0xff00) * i_571_
						   + ((i_579_ & 0xff00)
						      * i_572_))
						  & 0xff0000)) >> 8;
				    }
				    is[i_504_] = i_579_;
				}
				if (bool_486_ && bool_495_)
				    fs[i_504_] = f;
			    }
			    i_496_ += i_500_;
			    i_504_++;
			}
			i_497_ += i_501_;
			i_496_ = i_570_;
			i_504_ += i_505_;
		    }
		} else if (i_491_ == 2) {
		    int i_580_ = i_492_ >>> 24;
		    int i_581_ = 256 - i_580_;
		    int i_582_ = (i_492_ & 0xff00ff) * i_581_ & ~0xff00ff;
		    int i_583_ = (i_492_ & 0xff00) * i_581_ & 0xff0000;
		    i_492_ = (i_582_ | i_583_) >>> 8;
		    int i_584_ = i_496_;
		    for (int i_585_ = -i_490_; i_585_ < 0; i_585_++) {
			int i_586_ = (i_497_ >> 16) * anInt9000;
			for (int i_587_ = -i_489_; i_587_ < 0; i_587_++) {
			    if (!bool_486_ || f < fs[i_504_]) {
				int i_588_
				    = anIntArray11425[(i_496_ >> 16) + i_586_];
				if (i_588_ != 0) {
				    if (bool) {
					i_582_ = ((i_588_ & 0xff00ff) * i_580_
						  & ~0xff00ff);
					i_583_ = ((i_588_ & 0xff00) * i_580_
						  & 0xff0000);
					is[i_504_] = (((i_582_ | i_583_) >>> 8)
						      + i_492_);
				    }
				    if (bool_486_ && bool_495_)
					fs[i_504_] = f;
				}
			    }
			    i_496_ += i_500_;
			    i_504_++;
			}
			i_497_ += i_501_;
			i_496_ = i_584_;
			i_504_ += i_505_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_493_ == 2) {
		if (i_491_ == 1) {
		    int i_589_ = i_496_;
		    for (int i_590_ = -i_490_; i_590_ < 0; i_590_++) {
			int i_591_ = (i_497_ >> 16) * anInt9000;
			for (int i_592_ = -i_489_; i_592_ < 0; i_592_++) {
			    if (!bool_486_ || f < fs[i_504_]) {
				int i_593_
				    = anIntArray11425[(i_496_ >> 16) + i_591_];
				if (i_593_ != 0) {
				    if (bool) {
					int i_594_ = is[i_504_];
					int i_595_ = i_593_ + i_594_;
					int i_596_ = ((i_593_ & 0xff00ff)
						      + (i_594_ & 0xff00ff));
					i_594_
					    = ((i_596_ & 0x1000100)
					       + (i_595_ - i_596_ & 0x10000));
					is[i_504_]
					    = (i_595_ - i_594_
					       | i_594_ - (i_594_ >>> 8));
				    }
				    if (bool_486_ && bool_495_)
					fs[i_504_] = f;
				}
			    }
			    i_496_ += i_500_;
			    i_504_++;
			}
			i_497_ += i_501_;
			i_496_ = i_589_;
			i_504_ += i_505_;
		    }
		} else if (i_491_ == 0) {
		    int i_597_ = i_496_;
		    int i_598_ = (i_492_ & 0xff0000) >> 16;
		    int i_599_ = (i_492_ & 0xff00) >> 8;
		    int i_600_ = i_492_ & 0xff;
		    for (int i_601_ = -i_490_; i_601_ < 0; i_601_++) {
			int i_602_ = (i_497_ >> 16) * anInt9000;
			for (int i_603_ = -i_489_; i_603_ < 0; i_603_++) {
			    if (!bool_486_ || f < fs[i_504_]) {
				int i_604_
				    = anIntArray11425[(i_496_ >> 16) + i_602_];
				if (i_604_ != 0) {
				    if (bool) {
					int i_605_
					    = ((i_604_ & 0xff0000) * i_598_
					       & ~0xffffff);
					int i_606_
					    = ((i_604_ & 0xff00) * i_599_
					       & 0xff0000);
					int i_607_ = ((i_604_ & 0xff) * i_600_
						      & 0xff00);
					i_604_
					    = (i_605_ | i_606_ | i_607_) >>> 8;
					int i_608_ = is[i_504_];
					int i_609_ = i_604_ + i_608_;
					int i_610_ = ((i_604_ & 0xff00ff)
						      + (i_608_ & 0xff00ff));
					i_608_
					    = ((i_610_ & 0x1000100)
					       + (i_609_ - i_610_ & 0x10000));
					is[i_504_]
					    = (i_609_ - i_608_
					       | i_608_ - (i_608_ >>> 8));
				    }
				    if (bool_486_ && bool_495_)
					fs[i_504_] = f;
				}
			    }
			    i_496_ += i_500_;
			    i_504_++;
			}
			i_497_ += i_501_;
			i_496_ = i_597_;
			i_504_ += i_505_;
		    }
		} else if (i_491_ == 3) {
		    int i_611_ = i_496_;
		    for (int i_612_ = -i_490_; i_612_ < 0; i_612_++) {
			int i_613_ = (i_497_ >> 16) * anInt9000;
			for (int i_614_ = -i_489_; i_614_ < 0; i_614_++) {
			    if (!bool_486_ || f < fs[i_504_]) {
				if (bool) {
				    int i_615_ = (anIntArray11425
						  [(i_496_ >> 16) + i_613_]);
				    int i_616_ = i_615_ + i_492_;
				    int i_617_ = ((i_615_ & 0xff00ff)
						  + (i_492_ & 0xff00ff));
				    int i_618_
					= ((i_617_ & 0x1000100)
					   + (i_616_ - i_617_ & 0x10000));
				    i_615_
					= i_616_ - i_618_ | i_618_ - (i_618_
								      >>> 8);
				    i_618_ = is[i_504_];
				    i_616_ = i_615_ + i_618_;
				    i_617_
					= (i_615_ & 0xff00ff) + (i_618_
								 & 0xff00ff);
				    i_618_ = ((i_617_ & 0x1000100)
					      + (i_616_ - i_617_ & 0x10000));
				    is[i_504_]
					= i_616_ - i_618_ | i_618_ - (i_618_
								      >>> 8);
				}
				if (bool_486_ && bool_495_)
				    fs[i_504_] = f;
			    }
			    i_496_ += i_500_;
			    i_504_++;
			}
			i_497_ += i_501_;
			i_496_ = i_611_;
			i_504_ += i_505_;
		    }
		} else if (i_491_ == 2) {
		    int i_619_ = i_492_ >>> 24;
		    int i_620_ = 256 - i_619_;
		    int i_621_ = (i_492_ & 0xff00ff) * i_620_ & ~0xff00ff;
		    int i_622_ = (i_492_ & 0xff00) * i_620_ & 0xff0000;
		    i_492_ = (i_621_ | i_622_) >>> 8;
		    int i_623_ = i_496_;
		    for (int i_624_ = -i_490_; i_624_ < 0; i_624_++) {
			int i_625_ = (i_497_ >> 16) * anInt9000;
			for (int i_626_ = -i_489_; i_626_ < 0; i_626_++) {
			    if (!bool_486_ || f < fs[i_504_]) {
				int i_627_
				    = anIntArray11425[(i_496_ >> 16) + i_625_];
				if (i_627_ != 0) {
				    if (bool) {
					i_621_ = ((i_627_ & 0xff00ff) * i_619_
						  & ~0xff00ff);
					i_622_ = ((i_627_ & 0xff00) * i_619_
						  & 0xff0000);
					i_627_ = (((i_621_ | i_622_) >>> 8)
						  + i_492_);
					int i_628_ = is[i_504_];
					int i_629_ = i_627_ + i_628_;
					int i_630_ = ((i_627_ & 0xff00ff)
						      + (i_628_ & 0xff00ff));
					i_628_
					    = ((i_630_ & 0x1000100)
					       + (i_629_ - i_630_ & 0x10000));
					is[i_504_]
					    = (i_629_ - i_628_
					       | i_628_ - (i_628_ >>> 8));
				    }
				    if (bool_486_ && bool_495_)
					fs[i_504_] = f;
				}
			    }
			    i_496_ += i_500_;
			    i_504_++;
			}
			i_497_ += i_501_;
			i_496_ = i_623_;
			i_504_ += i_505_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    void method14536(int i, int i_631_) {
	int[] is = aClass182_Sub2_9033.anIntArray9466;
	if (is != null) {
	    if (anInt9006 == 0) {
		if (anInt9017 == 0) {
		    int i_632_ = anInt9023;
		    while (i_632_ < 0) {
			int i_633_ = anInt9015;
			int i_634_ = anInt9022;
			int i_635_ = anInt8999;
			int i_636_ = anInt9011;
			if (i_634_ >= 0 && i_635_ >= 0
			    && i_634_ - (anInt9000 << 12) < 0
			    && i_635_ - (anInt9001 << 12) < 0) {
			    for (/**/; i_636_ < 0; i_636_++)
				method18021(((i_635_ >> 12) * anInt9000
					     + (i_634_ >> 12)),
					    i_633_++, is, i, i_631_);
			}
			i_632_++;
			anInt9015 += anInt9014;
		    }
		} else if (anInt9017 < 0) {
		    int i_637_ = anInt9023;
		    while (i_637_ < 0) {
			int i_638_ = anInt9015;
			int i_639_ = anInt9022;
			int i_640_ = anInt8999 + anInt9025;
			int i_641_ = anInt9011;
			if (i_639_ >= 0 && i_639_ - (anInt9000 << 12) < 0) {
			    int i_642_;
			    if ((i_642_ = i_640_ - (anInt9001 << 12)) >= 0) {
				i_642_ = (anInt9017 - i_642_) / anInt9017;
				i_641_ += i_642_;
				i_640_ += anInt9017 * i_642_;
				i_638_ += i_642_;
			    }
			    if ((i_642_ = (i_640_ - anInt9017) / anInt9017)
				> i_641_)
				i_641_ = i_642_;
			    for (/**/; i_641_ < 0; i_641_++) {
				method18021(((i_640_ >> 12) * anInt9000
					     + (i_639_ >> 12)),
					    i_638_++, is, i, i_631_);
				i_640_ += anInt9017;
			    }
			}
			i_637_++;
			anInt9022 += anInt9018;
			anInt9015 += anInt9014;
		    }
		} else {
		    int i_643_ = anInt9023;
		    while (i_643_ < 0) {
			int i_644_ = anInt9015;
			int i_645_ = anInt9022;
			int i_646_ = anInt8999 + anInt9025;
			int i_647_ = anInt9011;
			if (i_645_ >= 0 && i_645_ - (anInt9000 << 12) < 0) {
			    if (i_646_ < 0) {
				int i_648_
				    = (anInt9017 - 1 - i_646_) / anInt9017;
				i_647_ += i_648_;
				i_646_ += anInt9017 * i_648_;
				i_644_ += i_648_;
			    }
			    int i_649_;
			    if ((i_649_ = (1 + i_646_ - (anInt9001 << 12)
					   - anInt9017) / anInt9017)
				> i_647_)
				i_647_ = i_649_;
			    for (/**/; i_647_ < 0; i_647_++) {
				method18021(((i_646_ >> 12) * anInt9000
					     + (i_645_ >> 12)),
					    i_644_++, is, i, i_631_);
				i_646_ += anInt9017;
			    }
			}
			i_643_++;
			anInt9022 += anInt9018;
			anInt9015 += anInt9014;
		    }
		}
	    } else if (anInt9006 < 0) {
		if (anInt9017 == 0) {
		    int i_650_ = anInt9023;
		    while (i_650_ < 0) {
			int i_651_ = anInt9015;
			int i_652_ = anInt9022 + anInt9024;
			int i_653_ = anInt8999;
			int i_654_ = anInt9011;
			if (i_653_ >= 0 && i_653_ - (anInt9001 << 12) < 0) {
			    int i_655_;
			    if ((i_655_ = i_652_ - (anInt9000 << 12)) >= 0) {
				i_655_ = (anInt9006 - i_655_) / anInt9006;
				i_654_ += i_655_;
				i_652_ += anInt9006 * i_655_;
				i_651_ += i_655_;
			    }
			    if ((i_655_ = (i_652_ - anInt9006) / anInt9006)
				> i_654_)
				i_654_ = i_655_;
			    for (/**/; i_654_ < 0; i_654_++) {
				method18021(((i_653_ >> 12) * anInt9000
					     + (i_652_ >> 12)),
					    i_651_++, is, i, i_631_);
				i_652_ += anInt9006;
			    }
			}
			i_650_++;
			anInt8999 += anInt9010;
			anInt9015 += anInt9014;
		    }
		} else if (anInt9017 < 0) {
		    int i_656_ = anInt9023;
		    while (i_656_ < 0) {
			int i_657_ = anInt9015;
			int i_658_ = anInt9022 + anInt9024;
			int i_659_ = anInt8999 + anInt9025;
			int i_660_ = anInt9011;
			int i_661_;
			if ((i_661_ = i_658_ - (anInt9000 << 12)) >= 0) {
			    i_661_ = (anInt9006 - i_661_) / anInt9006;
			    i_660_ += i_661_;
			    i_658_ += anInt9006 * i_661_;
			    i_659_ += anInt9017 * i_661_;
			    i_657_ += i_661_;
			}
			if ((i_661_ = (i_658_ - anInt9006) / anInt9006)
			    > i_660_)
			    i_660_ = i_661_;
			if ((i_661_ = i_659_ - (anInt9001 << 12)) >= 0) {
			    i_661_ = (anInt9017 - i_661_) / anInt9017;
			    i_660_ += i_661_;
			    i_658_ += anInt9006 * i_661_;
			    i_659_ += anInt9017 * i_661_;
			    i_657_ += i_661_;
			}
			if ((i_661_ = (i_659_ - anInt9017) / anInt9017)
			    > i_660_)
			    i_660_ = i_661_;
			for (/**/; i_660_ < 0; i_660_++) {
			    method18021((i_659_ >> 12) * anInt9000 + (i_658_
								      >> 12),
					i_657_++, is, i, i_631_);
			    i_658_ += anInt9006;
			    i_659_ += anInt9017;
			}
			i_656_++;
			anInt9022 += anInt9018;
			anInt8999 += anInt9010;
			anInt9015 += anInt9014;
		    }
		} else {
		    int i_662_ = anInt9023;
		    while (i_662_ < 0) {
			int i_663_ = anInt9015;
			int i_664_ = anInt9022 + anInt9024;
			int i_665_ = anInt8999 + anInt9025;
			int i_666_ = anInt9011;
			int i_667_;
			if ((i_667_ = i_664_ - (anInt9000 << 12)) >= 0) {
			    i_667_ = (anInt9006 - i_667_) / anInt9006;
			    i_666_ += i_667_;
			    i_664_ += anInt9006 * i_667_;
			    i_665_ += anInt9017 * i_667_;
			    i_663_ += i_667_;
			}
			if ((i_667_ = (i_664_ - anInt9006) / anInt9006)
			    > i_666_)
			    i_666_ = i_667_;
			if (i_665_ < 0) {
			    i_667_ = (anInt9017 - 1 - i_665_) / anInt9017;
			    i_666_ += i_667_;
			    i_664_ += anInt9006 * i_667_;
			    i_665_ += anInt9017 * i_667_;
			    i_663_ += i_667_;
			}
			if ((i_667_ = (1 + i_665_ - (anInt9001 << 12)
				       - anInt9017) / anInt9017)
			    > i_666_)
			    i_666_ = i_667_;
			for (/**/; i_666_ < 0; i_666_++) {
			    method18021((i_665_ >> 12) * anInt9000 + (i_664_
								      >> 12),
					i_663_++, is, i, i_631_);
			    i_664_ += anInt9006;
			    i_665_ += anInt9017;
			}
			i_662_++;
			anInt9022 += anInt9018;
			anInt8999 += anInt9010;
			anInt9015 += anInt9014;
		    }
		}
	    } else if (anInt9017 == 0) {
		int i_668_ = anInt9023;
		while (i_668_ < 0) {
		    int i_669_ = anInt9015;
		    int i_670_ = anInt9022 + anInt9024;
		    int i_671_ = anInt8999;
		    int i_672_ = anInt9011;
		    if (i_671_ >= 0 && i_671_ - (anInt9001 << 12) < 0) {
			if (i_670_ < 0) {
			    int i_673_ = (anInt9006 - 1 - i_670_) / anInt9006;
			    i_672_ += i_673_;
			    i_670_ += anInt9006 * i_673_;
			    i_669_ += i_673_;
			}
			int i_674_;
			if ((i_674_ = (1 + i_670_ - (anInt9000 << 12)
				       - anInt9006) / anInt9006)
			    > i_672_)
			    i_672_ = i_674_;
			for (/**/; i_672_ < 0; i_672_++) {
			    method18021((i_671_ >> 12) * anInt9000 + (i_670_
								      >> 12),
					i_669_++, is, i, i_631_);
			    i_670_ += anInt9006;
			}
		    }
		    i_668_++;
		    anInt9022 += anInt9018;
		    anInt8999 += anInt9010;
		    anInt9015 += anInt9014;
		}
	    } else if (anInt9017 < 0) {
		for (int i_675_ = anInt9023; i_675_ < 0; i_675_++) {
		    int i_676_ = anInt9015;
		    int i_677_ = anInt9022 + anInt9024;
		    int i_678_ = anInt8999 + anInt9025;
		    int i_679_ = anInt9011;
		    if (i_677_ < 0) {
			int i_680_ = (anInt9006 - 1 - i_677_) / anInt9006;
			i_679_ += i_680_;
			i_677_ += anInt9006 * i_680_;
			i_678_ += anInt9017 * i_680_;
			i_676_ += i_680_;
		    }
		    int i_681_;
		    if ((i_681_ = ((1 + i_677_ - (anInt9000 << 12) - anInt9006)
				   / anInt9006))
			> i_679_)
			i_679_ = i_681_;
		    if ((i_681_ = i_678_ - (anInt9001 << 12)) >= 0) {
			i_681_ = (anInt9017 - i_681_) / anInt9017;
			i_679_ += i_681_;
			i_677_ += anInt9006 * i_681_;
			i_678_ += anInt9017 * i_681_;
			i_676_ += i_681_;
		    }
		    if ((i_681_ = (i_678_ - anInt9017) / anInt9017) > i_679_)
			i_679_ = i_681_;
		    for (/**/; i_679_ < 0; i_679_++) {
			method18021((i_678_ >> 12) * anInt9000 + (i_677_
								  >> 12),
				    i_676_++, is, i, i_631_);
			i_677_ += anInt9006;
			i_678_ += anInt9017;
		    }
		    anInt9022 += anInt9018;
		    anInt8999 += anInt9010;
		    anInt9015 += anInt9014;
		}
	    } else {
		for (int i_682_ = anInt9023; i_682_ < 0; i_682_++) {
		    int i_683_ = anInt9015;
		    int i_684_ = anInt9022 + anInt9024;
		    int i_685_ = anInt8999 + anInt9025;
		    int i_686_ = anInt9011;
		    if (i_684_ < 0) {
			int i_687_ = (anInt9006 - 1 - i_684_) / anInt9006;
			i_686_ += i_687_;
			i_684_ += anInt9006 * i_687_;
			i_685_ += anInt9017 * i_687_;
			i_683_ += i_687_;
		    }
		    int i_688_;
		    if ((i_688_ = ((1 + i_684_ - (anInt9000 << 12) - anInt9006)
				   / anInt9006))
			> i_686_)
			i_686_ = i_688_;
		    if (i_685_ < 0) {
			i_688_ = (anInt9017 - 1 - i_685_) / anInt9017;
			i_686_ += i_688_;
			i_684_ += anInt9006 * i_688_;
			i_685_ += anInt9017 * i_688_;
			i_683_ += i_688_;
		    }
		    if ((i_688_ = ((1 + i_685_ - (anInt9001 << 12) - anInt9017)
				   / anInt9017))
			> i_686_)
			i_686_ = i_688_;
		    for (/**/; i_686_ < 0; i_686_++) {
			method18021((i_685_ >> 12) * anInt9000 + (i_684_
								  >> 12),
				    i_683_++, is, i, i_631_);
			i_684_ += anInt9006;
			i_685_ += anInt9017;
		    }
		    anInt9022 += anInt9018;
		    anInt8999 += anInt9010;
		    anInt9015 += anInt9014;
		}
	    }
	}
    }
    
    void method14539(int[] is, int[] is_689_, int i, int i_690_) {
	int[] is_691_ = aClass182_Sub2_9033.anIntArray9466;
	if (is_691_ != null) {
	    if (anInt9006 == 0) {
		if (anInt9017 == 0) {
		    int i_692_ = anInt9023;
		    while (i_692_ < 0) {
			int i_693_ = i_692_ + i_690_;
			if (i_693_ >= 0) {
			    if (i_693_ >= is.length)
				break;
			    int i_694_ = anInt9015;
			    int i_695_ = anInt9022;
			    int i_696_ = anInt8999;
			    int i_697_ = anInt9011;
			    if (i_695_ >= 0 && i_696_ >= 0
				&& i_695_ - (anInt9000 << 12) < 0
				&& i_696_ - (anInt9001 << 12) < 0) {
				int i_698_ = is[i_693_] - i;
				int i_699_ = -is_689_[i_693_];
				int i_700_ = i_698_ - (i_694_ - anInt9015);
				if (i_700_ > 0) {
				    i_694_ += i_700_;
				    i_697_ += i_700_;
				    i_695_ += anInt9006 * i_700_;
				    i_696_ += anInt9017 * i_700_;
				} else
				    i_699_ -= i_700_;
				if (i_697_ < i_699_)
				    i_697_ = i_699_;
				for (/**/; i_697_ < 0; i_697_++) {
				    int i_701_ = (anIntArray11425
						  [((i_696_ >> 12) * anInt9000
						    + (i_695_ >> 12))]);
				    if (i_701_ != 0)
					is_691_[i_694_++] = i_701_;
				    else
					i_694_++;
				}
			    }
			}
			i_692_++;
			anInt9015 += anInt9014;
		    }
		} else if (anInt9017 < 0) {
		    int i_702_ = anInt9023;
		    while (i_702_ < 0) {
			int i_703_ = i_702_ + i_690_;
			if (i_703_ >= 0) {
			    if (i_703_ >= is.length)
				break;
			    int i_704_ = anInt9015;
			    int i_705_ = anInt9022;
			    int i_706_ = anInt8999 + anInt9025;
			    int i_707_ = anInt9011;
			    if (i_705_ >= 0
				&& i_705_ - (anInt9000 << 12) < 0) {
				int i_708_;
				if ((i_708_ = i_706_ - (anInt9001 << 12))
				    >= 0) {
				    i_708_ = (anInt9017 - i_708_) / anInt9017;
				    i_707_ += i_708_;
				    i_706_ += anInt9017 * i_708_;
				    i_704_ += i_708_;
				}
				if ((i_708_ = (i_706_ - anInt9017) / anInt9017)
				    > i_707_)
				    i_707_ = i_708_;
				int i_709_ = is[i_703_] - i;
				int i_710_ = -is_689_[i_703_];
				int i_711_ = i_709_ - (i_704_ - anInt9015);
				if (i_711_ > 0) {
				    i_704_ += i_711_;
				    i_707_ += i_711_;
				    i_705_ += anInt9006 * i_711_;
				    i_706_ += anInt9017 * i_711_;
				} else
				    i_710_ -= i_711_;
				if (i_707_ < i_710_)
				    i_707_ = i_710_;
				for (/**/; i_707_ < 0; i_707_++) {
				    int i_712_ = (anIntArray11425
						  [((i_706_ >> 12) * anInt9000
						    + (i_705_ >> 12))]);
				    if (i_712_ != 0)
					is_691_[i_704_++] = i_712_;
				    else
					i_704_++;
				    i_706_ += anInt9017;
				}
			    }
			}
			i_702_++;
			anInt9022 += anInt9018;
			anInt9015 += anInt9014;
		    }
		} else {
		    int i_713_ = anInt9023;
		    while (i_713_ < 0) {
			int i_714_ = i_713_ + i_690_;
			if (i_714_ >= 0) {
			    if (i_714_ >= is.length)
				break;
			    int i_715_ = anInt9015;
			    int i_716_ = anInt9022;
			    int i_717_ = anInt8999 + anInt9025;
			    int i_718_ = anInt9011;
			    if (i_716_ >= 0
				&& i_716_ - (anInt9000 << 12) < 0) {
				if (i_717_ < 0) {
				    int i_719_
					= (anInt9017 - 1 - i_717_) / anInt9017;
				    i_718_ += i_719_;
				    i_717_ += anInt9017 * i_719_;
				    i_715_ += i_719_;
				}
				int i_720_;
				if ((i_720_ = (1 + i_717_ - (anInt9001 << 12)
					       - anInt9017) / anInt9017)
				    > i_718_)
				    i_718_ = i_720_;
				int i_721_ = is[i_714_] - i;
				int i_722_ = -is_689_[i_714_];
				int i_723_ = i_721_ - (i_715_ - anInt9015);
				if (i_723_ > 0) {
				    i_715_ += i_723_;
				    i_718_ += i_723_;
				    i_716_ += anInt9006 * i_723_;
				    i_717_ += anInt9017 * i_723_;
				} else
				    i_722_ -= i_723_;
				if (i_718_ < i_722_)
				    i_718_ = i_722_;
				for (/**/; i_718_ < 0; i_718_++) {
				    int i_724_ = (anIntArray11425
						  [((i_717_ >> 12) * anInt9000
						    + (i_716_ >> 12))]);
				    if (i_724_ != 0)
					is_691_[i_715_++] = i_724_;
				    else
					i_715_++;
				    i_717_ += anInt9017;
				}
			    }
			}
			i_713_++;
			anInt9022 += anInt9018;
			anInt9015 += anInt9014;
		    }
		}
	    } else if (anInt9006 < 0) {
		if (anInt9017 == 0) {
		    int i_725_ = anInt9023;
		    while (i_725_ < 0) {
			int i_726_ = i_725_ + i_690_;
			if (i_726_ >= 0) {
			    if (i_726_ >= is.length)
				break;
			    int i_727_ = anInt9015;
			    int i_728_ = anInt9022 + anInt9024;
			    int i_729_ = anInt8999;
			    int i_730_ = anInt9011;
			    if (i_729_ >= 0
				&& i_729_ - (anInt9001 << 12) < 0) {
				int i_731_;
				if ((i_731_ = i_728_ - (anInt9000 << 12))
				    >= 0) {
				    i_731_ = (anInt9006 - i_731_) / anInt9006;
				    i_730_ += i_731_;
				    i_728_ += anInt9006 * i_731_;
				    i_727_ += i_731_;
				}
				if ((i_731_ = (i_728_ - anInt9006) / anInt9006)
				    > i_730_)
				    i_730_ = i_731_;
				int i_732_ = is[i_726_] - i;
				int i_733_ = -is_689_[i_726_];
				int i_734_ = i_732_ - (i_727_ - anInt9015);
				if (i_734_ > 0) {
				    i_727_ += i_734_;
				    i_730_ += i_734_;
				    i_728_ += anInt9006 * i_734_;
				    i_729_ += anInt9017 * i_734_;
				} else
				    i_733_ -= i_734_;
				if (i_730_ < i_733_)
				    i_730_ = i_733_;
				for (/**/; i_730_ < 0; i_730_++) {
				    int i_735_ = (anIntArray11425
						  [((i_729_ >> 12) * anInt9000
						    + (i_728_ >> 12))]);
				    if (i_735_ != 0)
					is_691_[i_727_++] = i_735_;
				    else
					i_727_++;
				    i_728_ += anInt9006;
				}
			    }
			}
			i_725_++;
			anInt8999 += anInt9010;
			anInt9015 += anInt9014;
		    }
		} else if (anInt9017 < 0) {
		    int i_736_ = anInt9023;
		    while (i_736_ < 0) {
			int i_737_ = i_736_ + i_690_;
			if (i_737_ >= 0) {
			    if (i_737_ >= is.length)
				break;
			    int i_738_ = anInt9015;
			    int i_739_ = anInt9022 + anInt9024;
			    int i_740_ = anInt8999 + anInt9025;
			    int i_741_ = anInt9011;
			    int i_742_;
			    if ((i_742_ = i_739_ - (anInt9000 << 12)) >= 0) {
				i_742_ = (anInt9006 - i_742_) / anInt9006;
				i_741_ += i_742_;
				i_739_ += anInt9006 * i_742_;
				i_740_ += anInt9017 * i_742_;
				i_738_ += i_742_;
			    }
			    if ((i_742_ = (i_739_ - anInt9006) / anInt9006)
				> i_741_)
				i_741_ = i_742_;
			    if ((i_742_ = i_740_ - (anInt9001 << 12)) >= 0) {
				i_742_ = (anInt9017 - i_742_) / anInt9017;
				i_741_ += i_742_;
				i_739_ += anInt9006 * i_742_;
				i_740_ += anInt9017 * i_742_;
				i_738_ += i_742_;
			    }
			    if ((i_742_ = (i_740_ - anInt9017) / anInt9017)
				> i_741_)
				i_741_ = i_742_;
			    int i_743_ = is[i_737_] - i;
			    int i_744_ = -is_689_[i_737_];
			    int i_745_ = i_743_ - (i_738_ - anInt9015);
			    if (i_745_ > 0) {
				i_738_ += i_745_;
				i_741_ += i_745_;
				i_739_ += anInt9006 * i_745_;
				i_740_ += anInt9017 * i_745_;
			    } else
				i_744_ -= i_745_;
			    if (i_741_ < i_744_)
				i_741_ = i_744_;
			    for (/**/; i_741_ < 0; i_741_++) {
				int i_746_
				    = (anIntArray11425
				       [(i_740_ >> 12) * anInt9000 + (i_739_
								      >> 12)]);
				if (i_746_ != 0)
				    is_691_[i_738_++] = i_746_;
				else
				    i_738_++;
				i_739_ += anInt9006;
				i_740_ += anInt9017;
			    }
			}
			i_736_++;
			anInt9022 += anInt9018;
			anInt8999 += anInt9010;
			anInt9015 += anInt9014;
		    }
		} else {
		    int i_747_ = anInt9023;
		    while (i_747_ < 0) {
			int i_748_ = i_747_ + i_690_;
			if (i_748_ >= 0) {
			    if (i_748_ >= is.length)
				break;
			    int i_749_ = anInt9015;
			    int i_750_ = anInt9022 + anInt9024;
			    int i_751_ = anInt8999 + anInt9025;
			    int i_752_ = anInt9011;
			    int i_753_;
			    if ((i_753_ = i_750_ - (anInt9000 << 12)) >= 0) {
				i_753_ = (anInt9006 - i_753_) / anInt9006;
				i_752_ += i_753_;
				i_750_ += anInt9006 * i_753_;
				i_751_ += anInt9017 * i_753_;
				i_749_ += i_753_;
			    }
			    if ((i_753_ = (i_750_ - anInt9006) / anInt9006)
				> i_752_)
				i_752_ = i_753_;
			    if (i_751_ < 0) {
				i_753_ = (anInt9017 - 1 - i_751_) / anInt9017;
				i_752_ += i_753_;
				i_750_ += anInt9006 * i_753_;
				i_751_ += anInt9017 * i_753_;
				i_749_ += i_753_;
			    }
			    if ((i_753_ = (1 + i_751_ - (anInt9001 << 12)
					   - anInt9017) / anInt9017)
				> i_752_)
				i_752_ = i_753_;
			    int i_754_ = is[i_748_] - i;
			    int i_755_ = -is_689_[i_748_];
			    int i_756_ = i_754_ - (i_749_ - anInt9015);
			    if (i_756_ > 0) {
				i_749_ += i_756_;
				i_752_ += i_756_;
				i_750_ += anInt9006 * i_756_;
				i_751_ += anInt9017 * i_756_;
			    } else
				i_755_ -= i_756_;
			    if (i_752_ < i_755_)
				i_752_ = i_755_;
			    for (/**/; i_752_ < 0; i_752_++) {
				int i_757_
				    = (anIntArray11425
				       [(i_751_ >> 12) * anInt9000 + (i_750_
								      >> 12)]);
				if (i_757_ != 0)
				    is_691_[i_749_++] = i_757_;
				else
				    i_749_++;
				i_750_ += anInt9006;
				i_751_ += anInt9017;
			    }
			}
			i_747_++;
			anInt9022 += anInt9018;
			anInt8999 += anInt9010;
			anInt9015 += anInt9014;
		    }
		}
	    } else if (anInt9017 == 0) {
		int i_758_ = anInt9023;
		while (i_758_ < 0) {
		    int i_759_ = i_758_ + i_690_;
		    if (i_759_ >= 0) {
			if (i_759_ >= is.length)
			    break;
			int i_760_ = anInt9015;
			int i_761_ = anInt9022 + anInt9024;
			int i_762_ = anInt8999;
			int i_763_ = anInt9011;
			if (i_762_ >= 0 && i_762_ - (anInt9001 << 12) < 0) {
			    if (i_761_ < 0) {
				int i_764_
				    = (anInt9006 - 1 - i_761_) / anInt9006;
				i_763_ += i_764_;
				i_761_ += anInt9006 * i_764_;
				i_760_ += i_764_;
			    }
			    int i_765_;
			    if ((i_765_ = (1 + i_761_ - (anInt9000 << 12)
					   - anInt9006) / anInt9006)
				> i_763_)
				i_763_ = i_765_;
			    int i_766_ = is[i_759_] - i;
			    int i_767_ = -is_689_[i_759_];
			    int i_768_ = i_766_ - (i_760_ - anInt9015);
			    if (i_768_ > 0) {
				i_760_ += i_768_;
				i_763_ += i_768_;
				i_761_ += anInt9006 * i_768_;
				i_762_ += anInt9017 * i_768_;
			    } else
				i_767_ -= i_768_;
			    if (i_763_ < i_767_)
				i_763_ = i_767_;
			    for (/**/; i_763_ < 0; i_763_++) {
				int i_769_
				    = (anIntArray11425
				       [(i_762_ >> 12) * anInt9000 + (i_761_
								      >> 12)]);
				if (i_769_ != 0)
				    is_691_[i_760_++] = i_769_;
				else
				    i_760_++;
				i_761_ += anInt9006;
			    }
			}
		    }
		    i_758_++;
		    anInt9022 += anInt9018;
		    anInt8999 += anInt9010;
		    anInt9015 += anInt9014;
		}
	    } else if (anInt9017 < 0) {
		int i_770_ = anInt9023;
		while (i_770_ < 0) {
		    int i_771_ = i_770_ + i_690_;
		    if (i_771_ >= 0) {
			if (i_771_ >= is.length)
			    break;
			int i_772_ = anInt9015;
			int i_773_ = anInt9022 + anInt9024;
			int i_774_ = anInt8999 + anInt9025;
			int i_775_ = anInt9011;
			if (i_773_ < 0) {
			    int i_776_ = (anInt9006 - 1 - i_773_) / anInt9006;
			    i_775_ += i_776_;
			    i_773_ += anInt9006 * i_776_;
			    i_774_ += anInt9017 * i_776_;
			    i_772_ += i_776_;
			}
			int i_777_;
			if ((i_777_ = (1 + i_773_ - (anInt9000 << 12)
				       - anInt9006) / anInt9006)
			    > i_775_)
			    i_775_ = i_777_;
			if ((i_777_ = i_774_ - (anInt9001 << 12)) >= 0) {
			    i_777_ = (anInt9017 - i_777_) / anInt9017;
			    i_775_ += i_777_;
			    i_773_ += anInt9006 * i_777_;
			    i_774_ += anInt9017 * i_777_;
			    i_772_ += i_777_;
			}
			if ((i_777_ = (i_774_ - anInt9017) / anInt9017)
			    > i_775_)
			    i_775_ = i_777_;
			int i_778_ = is[i_771_] - i;
			int i_779_ = -is_689_[i_771_];
			int i_780_ = i_778_ - (i_772_ - anInt9015);
			if (i_780_ > 0) {
			    i_772_ += i_780_;
			    i_775_ += i_780_;
			    i_773_ += anInt9006 * i_780_;
			    i_774_ += anInt9017 * i_780_;
			} else
			    i_779_ -= i_780_;
			if (i_775_ < i_779_)
			    i_775_ = i_779_;
			for (/**/; i_775_ < 0; i_775_++) {
			    int i_781_
				= (anIntArray11425
				   [(i_774_ >> 12) * anInt9000 + (i_773_
								  >> 12)]);
			    if (i_781_ != 0)
				is_691_[i_772_++] = i_781_;
			    else
				i_772_++;
			    i_773_ += anInt9006;
			    i_774_ += anInt9017;
			}
		    }
		    i_770_++;
		    anInt9022 += anInt9018;
		    anInt8999 += anInt9010;
		    anInt9015 += anInt9014;
		}
	    } else {
		int i_782_ = anInt9023;
		while (i_782_ < 0) {
		    int i_783_ = i_782_ + i_690_;
		    if (i_783_ >= 0) {
			if (i_783_ >= is.length)
			    break;
			int i_784_ = anInt9015;
			int i_785_ = anInt9022 + anInt9024;
			int i_786_ = anInt8999 + anInt9025;
			int i_787_ = anInt9011;
			if (i_785_ < 0) {
			    int i_788_ = (anInt9006 - 1 - i_785_) / anInt9006;
			    i_787_ += i_788_;
			    i_785_ += anInt9006 * i_788_;
			    i_786_ += anInt9017 * i_788_;
			    i_784_ += i_788_;
			}
			int i_789_;
			if ((i_789_ = (1 + i_785_ - (anInt9000 << 12)
				       - anInt9006) / anInt9006)
			    > i_787_)
			    i_787_ = i_789_;
			if (i_786_ < 0) {
			    i_789_ = (anInt9017 - 1 - i_786_) / anInt9017;
			    i_787_ += i_789_;
			    i_785_ += anInt9006 * i_789_;
			    i_786_ += anInt9017 * i_789_;
			    i_784_ += i_789_;
			}
			if ((i_789_ = (1 + i_786_ - (anInt9001 << 12)
				       - anInt9017) / anInt9017)
			    > i_787_)
			    i_787_ = i_789_;
			int i_790_ = is[i_783_] - i;
			int i_791_ = -is_689_[i_783_];
			int i_792_ = i_790_ - (i_784_ - anInt9015);
			if (i_792_ > 0) {
			    i_784_ += i_792_;
			    i_787_ += i_792_;
			    i_785_ += anInt9006 * i_792_;
			    i_786_ += anInt9017 * i_792_;
			} else
			    i_791_ -= i_792_;
			if (i_787_ < i_791_)
			    i_787_ = i_791_;
			for (/**/; i_787_ < 0; i_787_++) {
			    int i_793_
				= (anIntArray11425
				   [(i_786_ >> 12) * anInt9000 + (i_785_
								  >> 12)]);
			    if (i_793_ != 0)
				is_691_[i_784_++] = i_793_;
			    else
				i_784_++;
			    i_785_ += anInt9006;
			    i_786_ += anInt9017;
			}
		    }
		    i_782_++;
		    anInt9022 += anInt9018;
		    anInt8999 += anInt9010;
		    anInt9015 += anInt9014;
		}
	    }
	}
    }
    
    void method18019(int i, int i_794_, int[] is, int i_795_, int i_796_) {
	if (i_796_ == 0) {
	    if (i_795_ == 1)
		is[i_794_] = anIntArray11425[i];
	    else if (i_795_ == 0) {
		int i_797_ = anIntArray11425[i++];
		int i_798_ = (i_797_ & 0xff0000) * anInt9031 & ~0xffffff;
		int i_799_ = (i_797_ & 0xff00) * anInt9030 & 0xff0000;
		int i_800_ = (i_797_ & 0xff) * anInt9027 & 0xff00;
		is[i_794_] = (i_798_ | i_799_ | i_800_) >>> 8;
	    } else if (i_795_ == 3) {
		int i_801_ = anIntArray11425[i++];
		int i_802_ = anInt9026;
		int i_803_ = i_801_ + i_802_;
		int i_804_ = (i_801_ & 0xff00ff) + (i_802_ & 0xff00ff);
		int i_805_
		    = (i_804_ & 0x1000100) + (i_803_ - i_804_ & 0x10000);
		is[i_794_] = i_803_ - i_805_ | i_805_ - (i_805_ >>> 8);
	    } else if (i_795_ == 2) {
		int i_806_ = anIntArray11425[i];
		int i_807_ = (i_806_ & 0xff00ff) * anInt9007 & ~0xff00ff;
		int i_808_ = (i_806_ & 0xff00) * anInt9007 & 0xff0000;
		is[i_794_] = ((i_807_ | i_808_) >>> 8) + anInt9034;
	    } else
		throw new IllegalArgumentException();
	} else if (i_796_ == 1) {
	    if (i_795_ == 1) {
		int i_809_ = anIntArray11425[i];
		if (i_809_ != 0)
		    is[i_794_] = i_809_;
	    } else if (i_795_ == 0) {
		int i_810_ = anIntArray11425[i];
		if (i_810_ != 0) {
		    if ((anInt9026 & 0xffffff) == 16777215) {
			int i_811_ = anInt9026 >>> 24;
			int i_812_ = 256 - i_811_;
			int i_813_ = is[i_794_];
			is[i_794_] = ((((i_810_ & 0xff00ff) * i_811_
					+ (i_813_ & 0xff00ff) * i_812_)
				       & ~0xff00ff)
				      + (((i_810_ & 0xff00) * i_811_
					  + (i_813_ & 0xff00) * i_812_)
					 & 0xff0000)) >> 8;
		    } else if (anInt9007 != 255) {
			int i_814_
			    = (i_810_ & 0xff0000) * anInt9031 & ~0xffffff;
			int i_815_ = (i_810_ & 0xff00) * anInt9030 & 0xff0000;
			int i_816_ = (i_810_ & 0xff) * anInt9027 & 0xff00;
			i_810_ = (i_814_ | i_815_ | i_816_) >>> 8;
			int i_817_ = is[i_794_];
			is[i_794_] = ((((i_810_ & 0xff00ff) * anInt9007
					+ (i_817_ & 0xff00ff) * anInt9028)
				       & ~0xff00ff)
				      + (((i_810_ & 0xff00) * anInt9007
					  + (i_817_ & 0xff00) * anInt9028)
					 & 0xff0000)) >> 8;
		    } else {
			int i_818_
			    = (i_810_ & 0xff0000) * anInt9031 & ~0xffffff;
			int i_819_ = (i_810_ & 0xff00) * anInt9030 & 0xff0000;
			int i_820_ = (i_810_ & 0xff) * anInt9027 & 0xff00;
			is[i_794_] = (i_818_ | i_819_ | i_820_) >>> 8;
		    }
		}
	    } else if (i_795_ == 3) {
		int i_821_ = anIntArray11425[i];
		int i_822_ = anInt9026;
		int i_823_ = i_821_ + i_822_;
		int i_824_ = (i_821_ & 0xff00ff) + (i_822_ & 0xff00ff);
		int i_825_
		    = (i_824_ & 0x1000100) + (i_823_ - i_824_ & 0x10000);
		i_825_ = i_823_ - i_825_ | i_825_ - (i_825_ >>> 8);
		if (i_821_ == 0 && anInt9007 != 255) {
		    i_821_ = i_825_;
		    i_825_ = is[i_794_];
		    i_825_ = ((((i_821_ & 0xff00ff) * anInt9007
				+ (i_825_ & 0xff00ff) * anInt9028)
			       & ~0xff00ff)
			      + (((i_821_ & 0xff00) * anInt9007
				  + (i_825_ & 0xff00) * anInt9028)
				 & 0xff0000)) >> 8;
		}
		is[i_794_] = i_825_;
	    } else if (i_795_ == 2) {
		int i_826_ = anIntArray11425[i];
		if (i_826_ != 0) {
		    int i_827_ = (i_826_ & 0xff00ff) * anInt9007 & ~0xff00ff;
		    int i_828_ = (i_826_ & 0xff00) * anInt9007 & 0xff0000;
		    is[i_794_++] = ((i_827_ | i_828_) >>> 8) + anInt9034;
		}
	    } else
		throw new IllegalArgumentException();
	} else if (i_796_ == 2) {
	    if (i_795_ == 1) {
		int i_829_ = anIntArray11425[i];
		if (i_829_ != 0) {
		    int i_830_ = is[i_794_];
		    int i_831_ = i_829_ + i_830_;
		    int i_832_ = (i_829_ & 0xff00ff) + (i_830_ & 0xff00ff);
		    i_830_
			= (i_832_ & 0x1000100) + (i_831_ - i_832_ & 0x10000);
		    is[i_794_] = i_831_ - i_830_ | i_830_ - (i_830_ >>> 8);
		}
	    } else if (i_795_ == 0) {
		int i_833_ = anIntArray11425[i];
		if (i_833_ != 0) {
		    int i_834_ = (i_833_ & 0xff0000) * anInt9031 & ~0xffffff;
		    int i_835_ = (i_833_ & 0xff00) * anInt9030 & 0xff0000;
		    int i_836_ = (i_833_ & 0xff) * anInt9027 & 0xff00;
		    i_833_ = (i_834_ | i_835_ | i_836_) >>> 8;
		    int i_837_ = is[i_794_];
		    int i_838_ = i_833_ + i_837_;
		    int i_839_ = (i_833_ & 0xff00ff) + (i_837_ & 0xff00ff);
		    i_837_
			= (i_839_ & 0x1000100) + (i_838_ - i_839_ & 0x10000);
		    is[i_794_] = i_838_ - i_837_ | i_837_ - (i_837_ >>> 8);
		}
	    } else if (i_795_ == 3) {
		int i_840_ = anIntArray11425[i];
		int i_841_ = anInt9026;
		int i_842_ = i_840_ + i_841_;
		int i_843_ = (i_840_ & 0xff00ff) + (i_841_ & 0xff00ff);
		int i_844_
		    = (i_843_ & 0x1000100) + (i_842_ - i_843_ & 0x10000);
		i_840_ = i_842_ - i_844_ | i_844_ - (i_844_ >>> 8);
		i_844_ = is[i_794_];
		i_842_ = i_840_ + i_844_;
		i_843_ = (i_840_ & 0xff00ff) + (i_844_ & 0xff00ff);
		i_844_ = (i_843_ & 0x1000100) + (i_842_ - i_843_ & 0x10000);
		is[i_794_] = i_842_ - i_844_ | i_844_ - (i_844_ >>> 8);
	    } else if (i_795_ == 2) {
		int i_845_ = anIntArray11425[i];
		if (i_845_ != 0) {
		    int i_846_ = (i_845_ & 0xff00ff) * anInt9007 & ~0xff00ff;
		    int i_847_ = (i_845_ & 0xff00) * anInt9007 & 0xff0000;
		    i_845_ = ((i_846_ | i_847_) >>> 8) + anInt9034;
		    int i_848_ = is[i_794_];
		    int i_849_ = i_845_ + i_848_;
		    int i_850_ = (i_845_ & 0xff00ff) + (i_848_ & 0xff00ff);
		    i_848_
			= (i_850_ & 0x1000100) + (i_849_ - i_850_ & 0x10000);
		    is[i_794_] = i_849_ - i_848_ | i_848_ - (i_848_ >>> 8);
		}
	    }
	} else
	    throw new IllegalArgumentException();
    }
    
    public void method2527(int i, int i_851_, int i_852_, int i_853_, int[] is,
			   int i_854_, int i_855_) {
	i_855_ -= i_852_;
	for (int i_856_ = 0; i_856_ < i_853_; i_856_++) {
	    int i_857_ = (i_851_ + i_856_) * i_852_ + i;
	    for (int i_858_ = 0; i_858_ < i_852_; i_858_++)
		anIntArray11425[i_857_ + i_858_] = is[i_854_++];
	    i_854_ += i_855_;
	}
    }
    
    void method18020(int i, int i_859_, int i_860_, int i_861_, int[] is,
		     int i_862_, int i_863_) {
	i_863_ -= i_860_;
	for (int i_864_ = 0; i_864_ < i_861_; i_864_++) {
	    int i_865_ = (i_859_ + i_864_) * i_860_ + i;
	    for (int i_866_ = 0; i_866_ < i_860_; i_866_++)
		is[i_862_++] = anIntArray11425[i_865_ + i_866_];
	    i_862_ += i_863_;
	}
    }
    
    public void method2497(int i, int i_867_, int i_868_, int i_869_,
			   int i_870_, int i_871_) {
	int[] is = aClass182_Sub2_9033.anIntArray9466;
	if (is == null)
	    throw new IllegalStateException("");
	for (int i_872_ = 0; i_872_ < i_869_; i_872_++) {
	    int i_873_ = (i_867_ + i_872_) * anInt9000 + i;
	    int i_874_ = ((i_871_ + i_872_) * (aClass182_Sub2_9033.anInt9494
					       * -476035351)
			  + i_870_);
	    for (int i_875_ = 0; i_875_ < i_868_; i_875_++)
		anIntArray11425[i_873_ + i_875_] = is[i_874_ + i_875_];
	}
    }
    
    public void method2540(int i, int i_876_, int i_877_, int i_878_,
			   int i_879_, int i_880_) {
	int[] is = aClass182_Sub2_9033.anIntArray9466;
	if (is == null)
	    throw new IllegalStateException("");
	for (int i_881_ = 0; i_881_ < i_878_; i_881_++) {
	    int i_882_ = (i_876_ + i_881_) * anInt9000 + i;
	    int i_883_ = ((i_880_ + i_881_) * (aClass182_Sub2_9033.anInt9494
					       * -476035351)
			  + i_879_);
	    for (int i_884_ = 0; i_884_ < i_877_; i_884_++)
		anIntArray11425[i_882_ + i_884_] = is[i_883_ + i_884_];
	}
    }
    
    public void method2499(int i, int i_885_, int i_886_, int i_887_,
			   int i_888_, int i_889_) {
	int[] is = aClass182_Sub2_9033.anIntArray9466;
	if (is == null)
	    throw new IllegalStateException("");
	for (int i_890_ = 0; i_890_ < i_887_; i_890_++) {
	    int i_891_ = (i_885_ + i_890_) * anInt9000 + i;
	    int i_892_ = ((i_889_ + i_890_) * (aClass182_Sub2_9033.anInt9494
					       * -476035351)
			  + i_888_);
	    for (int i_893_ = 0; i_893_ < i_886_; i_893_++)
		anIntArray11425[i_891_ + i_893_] = is[i_892_ + i_893_];
	}
    }
    
    public void method2486(int i, int i_894_, int i_895_) {
	throw new IllegalStateException("");
    }
    
    public Interface21 method2501() {
	return new Class97(anInt9000, anInt9001, anIntArray11425);
    }
    
    public void method2475(int i, int i_896_, int i_897_, int i_898_, int[] is,
			   int[] is_899_, int i_900_, int i_901_) {
	method18018(i, i_896_, i_897_, i_898_, is, i_900_, i_901_);
    }
    
    public Interface21 method2507() {
	return new Class97(anInt9000, anInt9001, anIntArray11425);
    }
    
    public void method2467(int i, int i_902_, int i_903_, int i_904_,
			   int i_905_) {
	if (aClass182_Sub2_9033.method15226())
	    throw new IllegalStateException();
	int[] is = aClass182_Sub2_9033.anIntArray9466;
	if (is != null) {
	    int i_906_ = aClass182_Sub2_9033.anInt9494 * -476035351;
	    i += anInt9002;
	    i_902_ += anInt9003;
	    int i_907_ = i_902_ * i_906_ + i;
	    int i_908_ = 0;
	    int i_909_ = anInt9001;
	    int i_910_ = anInt9000;
	    int i_911_ = i_906_ - i_910_;
	    int i_912_ = 0;
	    if (i_902_ < aClass182_Sub2_9033.anInt9472 * 1722112305) {
		int i_913_
		    = aClass182_Sub2_9033.anInt9472 * 1722112305 - i_902_;
		i_909_ -= i_913_;
		i_902_ = aClass182_Sub2_9033.anInt9472 * 1722112305;
		i_908_ += i_913_ * i_910_;
		i_907_ += i_913_ * i_906_;
	    }
	    if (i_902_ + i_909_ > aClass182_Sub2_9033.anInt9473 * 1920901985)
		i_909_ -= (i_902_ + i_909_
			   - aClass182_Sub2_9033.anInt9473 * 1920901985);
	    if (i < aClass182_Sub2_9033.anInt9470 * 1988019027) {
		int i_914_ = aClass182_Sub2_9033.anInt9470 * 1988019027 - i;
		i_910_ -= i_914_;
		i = aClass182_Sub2_9033.anInt9470 * 1988019027;
		i_908_ += i_914_;
		i_907_ += i_914_;
		i_912_ += i_914_;
		i_911_ += i_914_;
	    }
	    if (i + i_910_ > aClass182_Sub2_9033.anInt9499 * -466178451) {
		int i_915_
		    = i + i_910_ - aClass182_Sub2_9033.anInt9499 * -466178451;
		i_910_ -= i_915_;
		i_912_ += i_915_;
		i_911_ += i_915_;
	    }
	    if (i_910_ > 0 && i_909_ > 0) {
		if (i_905_ == 0) {
		    if (i_903_ == 1) {
			for (int i_916_ = -i_909_; i_916_ < 0; i_916_++) {
			    int i_917_ = i_907_ + i_910_ - 3;
			    while (i_907_ < i_917_) {
				is[i_907_++] = anIntArray11425[i_908_++];
				is[i_907_++] = anIntArray11425[i_908_++];
				is[i_907_++] = anIntArray11425[i_908_++];
				is[i_907_++] = anIntArray11425[i_908_++];
			    }
			    i_917_ += 3;
			    while (i_907_ < i_917_)
				is[i_907_++] = anIntArray11425[i_908_++];
			    i_907_ += i_911_;
			    i_908_ += i_912_;
			}
		    } else if (i_903_ == 0) {
			int i_918_ = (i_904_ & 0xff0000) >> 16;
			int i_919_ = (i_904_ & 0xff00) >> 8;
			int i_920_ = i_904_ & 0xff;
			for (int i_921_ = -i_909_; i_921_ < 0; i_921_++) {
			    for (int i_922_ = -i_910_; i_922_ < 0; i_922_++) {
				int i_923_ = anIntArray11425[i_908_++];
				int i_924_
				    = (i_923_ & 0xff0000) * i_918_ & ~0xffffff;
				int i_925_
				    = (i_923_ & 0xff00) * i_919_ & 0xff0000;
				int i_926_ = (i_923_ & 0xff) * i_920_ & 0xff00;
				is[i_907_++]
				    = (i_924_ | i_925_ | i_926_) >>> 8;
			    }
			    i_907_ += i_911_;
			    i_908_ += i_912_;
			}
		    } else if (i_903_ == 3) {
			for (int i_927_ = -i_909_; i_927_ < 0; i_927_++) {
			    for (int i_928_ = -i_910_; i_928_ < 0; i_928_++) {
				int i_929_ = anIntArray11425[i_908_++];
				int i_930_ = i_929_ + i_904_;
				int i_931_ = ((i_929_ & 0xff00ff)
					      + (i_904_ & 0xff00ff));
				int i_932_ = ((i_931_ & 0x1000100)
					      + (i_930_ - i_931_ & 0x10000));
				is[i_907_++]
				    = i_930_ - i_932_ | i_932_ - (i_932_
								  >>> 8);
			    }
			    i_907_ += i_911_;
			    i_908_ += i_912_;
			}
		    } else if (i_903_ == 2) {
			int i_933_ = i_904_ >>> 24;
			int i_934_ = 256 - i_933_;
			int i_935_ = (i_904_ & 0xff00ff) * i_934_ & ~0xff00ff;
			int i_936_ = (i_904_ & 0xff00) * i_934_ & 0xff0000;
			i_904_ = (i_935_ | i_936_) >>> 8;
			for (int i_937_ = -i_909_; i_937_ < 0; i_937_++) {
			    for (int i_938_ = -i_910_; i_938_ < 0; i_938_++) {
				int i_939_ = anIntArray11425[i_908_++];
				i_935_
				    = (i_939_ & 0xff00ff) * i_933_ & ~0xff00ff;
				i_936_ = (i_939_ & 0xff00) * i_933_ & 0xff0000;
				is[i_907_++]
				    = ((i_935_ | i_936_) >>> 8) + i_904_;
			    }
			    i_907_ += i_911_;
			    i_908_ += i_912_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_905_ == 1) {
		    if (i_903_ == 1) {
			for (int i_940_ = -i_909_; i_940_ < 0; i_940_++) {
			    int i_941_ = i_907_ + i_910_ - 3;
			    while (i_907_ < i_941_) {
				int i_942_ = anIntArray11425[i_908_++];
				if (i_942_ != 0)
				    is[i_907_++] = i_942_;
				else
				    i_907_++;
				i_942_ = anIntArray11425[i_908_++];
				if (i_942_ != 0)
				    is[i_907_++] = i_942_;
				else
				    i_907_++;
				i_942_ = anIntArray11425[i_908_++];
				if (i_942_ != 0)
				    is[i_907_++] = i_942_;
				else
				    i_907_++;
				i_942_ = anIntArray11425[i_908_++];
				if (i_942_ != 0)
				    is[i_907_++] = i_942_;
				else
				    i_907_++;
			    }
			    i_941_ += 3;
			    while (i_907_ < i_941_) {
				int i_943_ = anIntArray11425[i_908_++];
				if (i_943_ != 0)
				    is[i_907_++] = i_943_;
				else
				    i_907_++;
			    }
			    i_907_ += i_911_;
			    i_908_ += i_912_;
			}
		    } else if (i_903_ == 0) {
			if ((i_904_ & 0xffffff) == 16777215) {
			    int i_944_ = i_904_ >>> 24;
			    int i_945_ = 256 - i_944_;
			    for (int i_946_ = -i_909_; i_946_ < 0; i_946_++) {
				for (int i_947_ = -i_910_; i_947_ < 0;
				     i_947_++) {
				    int i_948_ = anIntArray11425[i_908_++];
				    if (i_948_ != 0) {
					int i_949_ = is[i_907_];
					is[i_907_++]
					    = ((((i_948_ & 0xff00ff) * i_944_
						 + ((i_949_ & 0xff00ff)
						    * i_945_))
						& ~0xff00ff)
					       + (((i_948_ & 0xff00) * i_944_
						   + ((i_949_ & 0xff00)
						      * i_945_))
						  & 0xff0000)) >> 8;
				    } else
					i_907_++;
				}
				i_907_ += i_911_;
				i_908_ += i_912_;
			    }
			} else {
			    int i_950_ = (i_904_ & 0xff0000) >> 16;
			    int i_951_ = (i_904_ & 0xff00) >> 8;
			    int i_952_ = i_904_ & 0xff;
			    int i_953_ = i_904_ >>> 24;
			    int i_954_ = 256 - i_953_;
			    for (int i_955_ = -i_909_; i_955_ < 0; i_955_++) {
				for (int i_956_ = -i_910_; i_956_ < 0;
				     i_956_++) {
				    int i_957_ = anIntArray11425[i_908_++];
				    if (i_957_ != 0) {
					if (i_953_ != 255) {
					    int i_958_
						= ((i_957_ & 0xff0000) * i_950_
						   & ~0xffffff);
					    int i_959_
						= ((i_957_ & 0xff00) * i_951_
						   & 0xff0000);
					    int i_960_
						= ((i_957_ & 0xff) * i_952_
						   & 0xff00);
					    i_957_ = (i_958_ | i_959_
						      | i_960_) >>> 8;
					    int i_961_ = is[i_907_];
					    is[i_907_++]
						= (((((i_957_ & 0xff00ff)
						      * i_953_)
						     + ((i_961_ & 0xff00ff)
							* i_954_))
						    & ~0xff00ff)
						   + ((((i_957_ & 0xff00)
							* i_953_)
						       + ((i_961_ & 0xff00)
							  * i_954_))
						      & 0xff0000)) >> 8;
					} else {
					    int i_962_
						= ((i_957_ & 0xff0000) * i_950_
						   & ~0xffffff);
					    int i_963_
						= ((i_957_ & 0xff00) * i_951_
						   & 0xff0000);
					    int i_964_
						= ((i_957_ & 0xff) * i_952_
						   & 0xff00);
					    is[i_907_++] = (i_962_ | i_963_
							    | i_964_) >>> 8;
					}
				    } else
					i_907_++;
				}
				i_907_ += i_911_;
				i_908_ += i_912_;
			    }
			}
		    } else if (i_903_ == 3) {
			int i_965_ = i_904_ >>> 24;
			int i_966_ = 256 - i_965_;
			for (int i_967_ = -i_909_; i_967_ < 0; i_967_++) {
			    for (int i_968_ = -i_910_; i_968_ < 0; i_968_++) {
				int i_969_ = anIntArray11425[i_908_++];
				int i_970_ = i_969_ + i_904_;
				int i_971_ = ((i_969_ & 0xff00ff)
					      + (i_904_ & 0xff00ff));
				int i_972_ = ((i_971_ & 0x1000100)
					      + (i_970_ - i_971_ & 0x10000));
				i_972_ = i_970_ - i_972_ | i_972_ - (i_972_
								     >>> 8);
				if (i_969_ == 0 && i_965_ != 255) {
				    i_969_ = i_972_;
				    i_972_ = is[i_907_];
				    i_972_ = ((((i_969_ & 0xff00ff) * i_965_
						+ (i_972_ & 0xff00ff) * i_966_)
					       & ~0xff00ff)
					      + (((i_969_ & 0xff00) * i_965_
						  + (i_972_ & 0xff00) * i_966_)
						 & 0xff0000)) >> 8;
				}
				is[i_907_++] = i_972_;
			    }
			    i_907_ += i_911_;
			    i_908_ += i_912_;
			}
		    } else if (i_903_ == 2) {
			int i_973_ = i_904_ >>> 24;
			int i_974_ = 256 - i_973_;
			int i_975_ = (i_904_ & 0xff00ff) * i_974_ & ~0xff00ff;
			int i_976_ = (i_904_ & 0xff00) * i_974_ & 0xff0000;
			i_904_ = (i_975_ | i_976_) >>> 8;
			for (int i_977_ = -i_909_; i_977_ < 0; i_977_++) {
			    for (int i_978_ = -i_910_; i_978_ < 0; i_978_++) {
				int i_979_ = anIntArray11425[i_908_++];
				if (i_979_ != 0) {
				    i_975_ = ((i_979_ & 0xff00ff) * i_973_
					      & ~0xff00ff);
				    i_976_ = ((i_979_ & 0xff00) * i_973_
					      & 0xff0000);
				    is[i_907_++]
					= ((i_975_ | i_976_) >>> 8) + i_904_;
				} else
				    i_907_++;
			    }
			    i_907_ += i_911_;
			    i_908_ += i_912_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_905_ == 2) {
		    if (i_903_ == 1) {
			for (int i_980_ = -i_909_; i_980_ < 0; i_980_++) {
			    for (int i_981_ = -i_910_; i_981_ < 0; i_981_++) {
				int i_982_ = anIntArray11425[i_908_++];
				if (i_982_ != 0) {
				    int i_983_ = is[i_907_];
				    int i_984_ = i_982_ + i_983_;
				    int i_985_ = ((i_982_ & 0xff00ff)
						  + (i_983_ & 0xff00ff));
				    i_983_ = ((i_985_ & 0x1000100)
					      + (i_984_ - i_985_ & 0x10000));
				    is[i_907_++]
					= i_984_ - i_983_ | i_983_ - (i_983_
								      >>> 8);
				} else
				    i_907_++;
			    }
			    i_907_ += i_911_;
			    i_908_ += i_912_;
			}
		    } else if (i_903_ == 0) {
			int i_986_ = (i_904_ & 0xff0000) >> 16;
			int i_987_ = (i_904_ & 0xff00) >> 8;
			int i_988_ = i_904_ & 0xff;
			for (int i_989_ = -i_909_; i_989_ < 0; i_989_++) {
			    for (int i_990_ = -i_910_; i_990_ < 0; i_990_++) {
				int i_991_ = anIntArray11425[i_908_++];
				if (i_991_ != 0) {
				    int i_992_ = ((i_991_ & 0xff0000) * i_986_
						  & ~0xffffff);
				    int i_993_ = ((i_991_ & 0xff00) * i_987_
						  & 0xff0000);
				    int i_994_
					= (i_991_ & 0xff) * i_988_ & 0xff00;
				    i_991_ = (i_992_ | i_993_ | i_994_) >>> 8;
				    int i_995_ = is[i_907_];
				    int i_996_ = i_991_ + i_995_;
				    int i_997_ = ((i_991_ & 0xff00ff)
						  + (i_995_ & 0xff00ff));
				    i_995_ = ((i_997_ & 0x1000100)
					      + (i_996_ - i_997_ & 0x10000));
				    is[i_907_++]
					= i_996_ - i_995_ | i_995_ - (i_995_
								      >>> 8);
				} else
				    i_907_++;
			    }
			    i_907_ += i_911_;
			    i_908_ += i_912_;
			}
		    } else if (i_903_ == 3) {
			for (int i_998_ = -i_909_; i_998_ < 0; i_998_++) {
			    for (int i_999_ = -i_910_; i_999_ < 0; i_999_++) {
				int i_1000_ = anIntArray11425[i_908_++];
				int i_1001_ = i_1000_ + i_904_;
				int i_1002_ = ((i_1000_ & 0xff00ff)
					       + (i_904_ & 0xff00ff));
				int i_1003_
				    = ((i_1002_ & 0x1000100)
				       + (i_1001_ - i_1002_ & 0x10000));
				i_1000_
				    = i_1001_ - i_1003_ | i_1003_ - (i_1003_
								     >>> 8);
				i_1003_ = is[i_907_];
				i_1001_ = i_1000_ + i_1003_;
				i_1002_ = (i_1000_ & 0xff00ff) + (i_1003_
								  & 0xff00ff);
				i_1003_ = ((i_1002_ & 0x1000100)
					   + (i_1001_ - i_1002_ & 0x10000));
				is[i_907_++]
				    = i_1001_ - i_1003_ | i_1003_ - (i_1003_
								     >>> 8);
			    }
			    i_907_ += i_911_;
			    i_908_ += i_912_;
			}
		    } else if (i_903_ == 2) {
			int i_1004_ = i_904_ >>> 24;
			int i_1005_ = 256 - i_1004_;
			int i_1006_
			    = (i_904_ & 0xff00ff) * i_1005_ & ~0xff00ff;
			int i_1007_ = (i_904_ & 0xff00) * i_1005_ & 0xff0000;
			i_904_ = (i_1006_ | i_1007_) >>> 8;
			for (int i_1008_ = -i_909_; i_1008_ < 0; i_1008_++) {
			    for (int i_1009_ = -i_910_; i_1009_ < 0;
				 i_1009_++) {
				int i_1010_ = anIntArray11425[i_908_++];
				if (i_1010_ != 0) {
				    i_1006_ = ((i_1010_ & 0xff00ff) * i_1004_
					       & ~0xff00ff);
				    i_1007_ = ((i_1010_ & 0xff00) * i_1004_
					       & 0xff0000);
				    i_1010_
					= ((i_1006_ | i_1007_) >>> 8) + i_904_;
				    int i_1011_ = is[i_907_];
				    int i_1012_ = i_1010_ + i_1011_;
				    int i_1013_ = ((i_1010_ & 0xff00ff)
						   + (i_1011_ & 0xff00ff));
				    i_1011_
					= ((i_1013_ & 0x1000100)
					   + (i_1012_ - i_1013_ & 0x10000));
				    is[i_907_++]
					= (i_1012_ - i_1011_
					   | i_1011_ - (i_1011_ >>> 8));
				} else
				    i_907_++;
			    }
			    i_907_ += i_911_;
			    i_908_ += i_912_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    public void method2480(int i, int i_1014_, Class152 class152, int i_1015_,
			   int i_1016_) {
	if (aClass182_Sub2_9033.method15226())
	    throw new IllegalStateException();
	int[] is = aClass182_Sub2_9033.anIntArray9466;
	if (is != null) {
	    i += anInt9002;
	    i_1014_ += anInt9003;
	    int i_1017_ = 0;
	    int i_1018_ = aClass182_Sub2_9033.anInt9494 * -476035351;
	    int i_1019_ = anInt9000;
	    int i_1020_ = anInt9001;
	    int i_1021_ = i_1018_ - i_1019_;
	    int i_1022_ = 0;
	    int i_1023_ = i + i_1014_ * i_1018_;
	    if (i_1014_ < aClass182_Sub2_9033.anInt9472 * 1722112305) {
		int i_1024_
		    = aClass182_Sub2_9033.anInt9472 * 1722112305 - i_1014_;
		i_1020_ -= i_1024_;
		i_1014_ = aClass182_Sub2_9033.anInt9472 * 1722112305;
		i_1017_ += i_1024_ * i_1019_;
		i_1023_ += i_1024_ * i_1018_;
	    }
	    if (i_1014_ + i_1020_ > aClass182_Sub2_9033.anInt9473 * 1920901985)
		i_1020_ -= (i_1014_ + i_1020_
			    - aClass182_Sub2_9033.anInt9473 * 1920901985);
	    if (i < aClass182_Sub2_9033.anInt9470 * 1988019027) {
		int i_1025_ = aClass182_Sub2_9033.anInt9470 * 1988019027 - i;
		i_1019_ -= i_1025_;
		i = aClass182_Sub2_9033.anInt9470 * 1988019027;
		i_1017_ += i_1025_;
		i_1023_ += i_1025_;
		i_1022_ += i_1025_;
		i_1021_ += i_1025_;
	    }
	    if (i + i_1019_ > aClass182_Sub2_9033.anInt9499 * -466178451) {
		int i_1026_
		    = i + i_1019_ - aClass182_Sub2_9033.anInt9499 * -466178451;
		i_1019_ -= i_1026_;
		i_1022_ += i_1026_;
		i_1021_ += i_1026_;
	    }
	    if (i_1019_ > 0 && i_1020_ > 0) {
		Class152_Sub1 class152_sub1 = (Class152_Sub1) class152;
		int[] is_1027_ = class152_sub1.anIntArray8998;
		int[] is_1028_ = class152_sub1.anIntArray8997;
		int i_1029_ = i_1014_;
		if (i_1016_ > i_1029_) {
		    i_1029_ = i_1016_;
		    i_1023_ += (i_1016_ - i_1014_) * i_1018_;
		    i_1017_ += (i_1016_ - i_1014_) * anInt9000;
		}
		int i_1030_
		    = (i_1016_ + is_1027_.length < i_1014_ + i_1020_
		       ? i_1016_ + is_1027_.length : i_1014_ + i_1020_);
		for (int i_1031_ = i_1029_; i_1031_ < i_1030_; i_1031_++) {
		    int i_1032_ = is_1027_[i_1031_ - i_1016_] + i_1015_;
		    int i_1033_ = is_1028_[i_1031_ - i_1016_];
		    int i_1034_ = i_1019_;
		    if (i > i_1032_) {
			int i_1035_ = i - i_1032_;
			if (i_1035_ >= i_1033_) {
			    i_1017_ += i_1019_ + i_1022_;
			    i_1023_ += i_1019_ + i_1021_;
			    continue;
			}
			i_1033_ -= i_1035_;
		    } else {
			int i_1036_ = i_1032_ - i;
			if (i_1036_ >= i_1019_) {
			    i_1017_ += i_1019_ + i_1022_;
			    i_1023_ += i_1019_ + i_1021_;
			    continue;
			}
			i_1017_ += i_1036_;
			i_1034_ -= i_1036_;
			i_1023_ += i_1036_;
		    }
		    int i_1037_ = 0;
		    if (i_1034_ < i_1033_)
			i_1033_ = i_1034_;
		    else
			i_1037_ = i_1034_ - i_1033_;
		    for (int i_1038_ = -i_1033_; i_1038_ < 0; i_1038_++) {
			int i_1039_ = anIntArray11425[i_1017_++];
			if (i_1039_ != 0)
			    is[i_1023_++] = i_1039_;
			else
			    i_1023_++;
		    }
		    i_1017_ += i_1037_ + i_1022_;
		    i_1023_ += i_1037_ + i_1021_;
		}
	    }
	}
    }
    
    public void method2545(int i, int i_1040_, int i_1041_, int i_1042_,
			   int i_1043_) {
	if (aClass182_Sub2_9033.method15226())
	    throw new IllegalStateException();
	int[] is = aClass182_Sub2_9033.anIntArray9466;
	if (is != null) {
	    int i_1044_ = aClass182_Sub2_9033.anInt9494 * -476035351;
	    i += anInt9002;
	    i_1040_ += anInt9003;
	    int i_1045_ = i_1040_ * i_1044_ + i;
	    int i_1046_ = 0;
	    int i_1047_ = anInt9001;
	    int i_1048_ = anInt9000;
	    int i_1049_ = i_1044_ - i_1048_;
	    int i_1050_ = 0;
	    if (i_1040_ < aClass182_Sub2_9033.anInt9472 * 1722112305) {
		int i_1051_
		    = aClass182_Sub2_9033.anInt9472 * 1722112305 - i_1040_;
		i_1047_ -= i_1051_;
		i_1040_ = aClass182_Sub2_9033.anInt9472 * 1722112305;
		i_1046_ += i_1051_ * i_1048_;
		i_1045_ += i_1051_ * i_1044_;
	    }
	    if (i_1040_ + i_1047_ > aClass182_Sub2_9033.anInt9473 * 1920901985)
		i_1047_ -= (i_1040_ + i_1047_
			    - aClass182_Sub2_9033.anInt9473 * 1920901985);
	    if (i < aClass182_Sub2_9033.anInt9470 * 1988019027) {
		int i_1052_ = aClass182_Sub2_9033.anInt9470 * 1988019027 - i;
		i_1048_ -= i_1052_;
		i = aClass182_Sub2_9033.anInt9470 * 1988019027;
		i_1046_ += i_1052_;
		i_1045_ += i_1052_;
		i_1050_ += i_1052_;
		i_1049_ += i_1052_;
	    }
	    if (i + i_1048_ > aClass182_Sub2_9033.anInt9499 * -466178451) {
		int i_1053_
		    = i + i_1048_ - aClass182_Sub2_9033.anInt9499 * -466178451;
		i_1048_ -= i_1053_;
		i_1050_ += i_1053_;
		i_1049_ += i_1053_;
	    }
	    if (i_1048_ > 0 && i_1047_ > 0) {
		if (i_1043_ == 0) {
		    if (i_1041_ == 1) {
			for (int i_1054_ = -i_1047_; i_1054_ < 0; i_1054_++) {
			    int i_1055_ = i_1045_ + i_1048_ - 3;
			    while (i_1045_ < i_1055_) {
				is[i_1045_++] = anIntArray11425[i_1046_++];
				is[i_1045_++] = anIntArray11425[i_1046_++];
				is[i_1045_++] = anIntArray11425[i_1046_++];
				is[i_1045_++] = anIntArray11425[i_1046_++];
			    }
			    i_1055_ += 3;
			    while (i_1045_ < i_1055_)
				is[i_1045_++] = anIntArray11425[i_1046_++];
			    i_1045_ += i_1049_;
			    i_1046_ += i_1050_;
			}
		    } else if (i_1041_ == 0) {
			int i_1056_ = (i_1042_ & 0xff0000) >> 16;
			int i_1057_ = (i_1042_ & 0xff00) >> 8;
			int i_1058_ = i_1042_ & 0xff;
			for (int i_1059_ = -i_1047_; i_1059_ < 0; i_1059_++) {
			    for (int i_1060_ = -i_1048_; i_1060_ < 0;
				 i_1060_++) {
				int i_1061_ = anIntArray11425[i_1046_++];
				int i_1062_ = ((i_1061_ & 0xff0000) * i_1056_
					       & ~0xffffff);
				int i_1063_
				    = (i_1061_ & 0xff00) * i_1057_ & 0xff0000;
				int i_1064_
				    = (i_1061_ & 0xff) * i_1058_ & 0xff00;
				is[i_1045_++]
				    = (i_1062_ | i_1063_ | i_1064_) >>> 8;
			    }
			    i_1045_ += i_1049_;
			    i_1046_ += i_1050_;
			}
		    } else if (i_1041_ == 3) {
			for (int i_1065_ = -i_1047_; i_1065_ < 0; i_1065_++) {
			    for (int i_1066_ = -i_1048_; i_1066_ < 0;
				 i_1066_++) {
				int i_1067_ = anIntArray11425[i_1046_++];
				int i_1068_ = i_1067_ + i_1042_;
				int i_1069_ = ((i_1067_ & 0xff00ff)
					       + (i_1042_ & 0xff00ff));
				int i_1070_
				    = ((i_1069_ & 0x1000100)
				       + (i_1068_ - i_1069_ & 0x10000));
				is[i_1045_++]
				    = i_1068_ - i_1070_ | i_1070_ - (i_1070_
								     >>> 8);
			    }
			    i_1045_ += i_1049_;
			    i_1046_ += i_1050_;
			}
		    } else if (i_1041_ == 2) {
			int i_1071_ = i_1042_ >>> 24;
			int i_1072_ = 256 - i_1071_;
			int i_1073_
			    = (i_1042_ & 0xff00ff) * i_1072_ & ~0xff00ff;
			int i_1074_ = (i_1042_ & 0xff00) * i_1072_ & 0xff0000;
			i_1042_ = (i_1073_ | i_1074_) >>> 8;
			for (int i_1075_ = -i_1047_; i_1075_ < 0; i_1075_++) {
			    for (int i_1076_ = -i_1048_; i_1076_ < 0;
				 i_1076_++) {
				int i_1077_ = anIntArray11425[i_1046_++];
				i_1073_ = ((i_1077_ & 0xff00ff) * i_1071_
					   & ~0xff00ff);
				i_1074_
				    = (i_1077_ & 0xff00) * i_1071_ & 0xff0000;
				is[i_1045_++]
				    = ((i_1073_ | i_1074_) >>> 8) + i_1042_;
			    }
			    i_1045_ += i_1049_;
			    i_1046_ += i_1050_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1043_ == 1) {
		    if (i_1041_ == 1) {
			for (int i_1078_ = -i_1047_; i_1078_ < 0; i_1078_++) {
			    int i_1079_ = i_1045_ + i_1048_ - 3;
			    while (i_1045_ < i_1079_) {
				int i_1080_ = anIntArray11425[i_1046_++];
				if (i_1080_ != 0)
				    is[i_1045_++] = i_1080_;
				else
				    i_1045_++;
				i_1080_ = anIntArray11425[i_1046_++];
				if (i_1080_ != 0)
				    is[i_1045_++] = i_1080_;
				else
				    i_1045_++;
				i_1080_ = anIntArray11425[i_1046_++];
				if (i_1080_ != 0)
				    is[i_1045_++] = i_1080_;
				else
				    i_1045_++;
				i_1080_ = anIntArray11425[i_1046_++];
				if (i_1080_ != 0)
				    is[i_1045_++] = i_1080_;
				else
				    i_1045_++;
			    }
			    i_1079_ += 3;
			    while (i_1045_ < i_1079_) {
				int i_1081_ = anIntArray11425[i_1046_++];
				if (i_1081_ != 0)
				    is[i_1045_++] = i_1081_;
				else
				    i_1045_++;
			    }
			    i_1045_ += i_1049_;
			    i_1046_ += i_1050_;
			}
		    } else if (i_1041_ == 0) {
			if ((i_1042_ & 0xffffff) == 16777215) {
			    int i_1082_ = i_1042_ >>> 24;
			    int i_1083_ = 256 - i_1082_;
			    for (int i_1084_ = -i_1047_; i_1084_ < 0;
				 i_1084_++) {
				for (int i_1085_ = -i_1048_; i_1085_ < 0;
				     i_1085_++) {
				    int i_1086_ = anIntArray11425[i_1046_++];
				    if (i_1086_ != 0) {
					int i_1087_ = is[i_1045_];
					is[i_1045_++]
					    = ((((i_1086_ & 0xff00ff) * i_1082_
						 + ((i_1087_ & 0xff00ff)
						    * i_1083_))
						& ~0xff00ff)
					       + (((i_1086_ & 0xff00) * i_1082_
						   + ((i_1087_ & 0xff00)
						      * i_1083_))
						  & 0xff0000)) >> 8;
				    } else
					i_1045_++;
				}
				i_1045_ += i_1049_;
				i_1046_ += i_1050_;
			    }
			} else {
			    int i_1088_ = (i_1042_ & 0xff0000) >> 16;
			    int i_1089_ = (i_1042_ & 0xff00) >> 8;
			    int i_1090_ = i_1042_ & 0xff;
			    int i_1091_ = i_1042_ >>> 24;
			    int i_1092_ = 256 - i_1091_;
			    for (int i_1093_ = -i_1047_; i_1093_ < 0;
				 i_1093_++) {
				for (int i_1094_ = -i_1048_; i_1094_ < 0;
				     i_1094_++) {
				    int i_1095_ = anIntArray11425[i_1046_++];
				    if (i_1095_ != 0) {
					if (i_1091_ != 255) {
					    int i_1096_
						= (((i_1095_ & 0xff0000)
						    * i_1088_)
						   & ~0xffffff);
					    int i_1097_
						= ((i_1095_ & 0xff00) * i_1089_
						   & 0xff0000);
					    int i_1098_
						= ((i_1095_ & 0xff) * i_1090_
						   & 0xff00);
					    i_1095_ = (i_1096_ | i_1097_
						       | i_1098_) >>> 8;
					    int i_1099_ = is[i_1045_];
					    is[i_1045_++]
						= (((((i_1095_ & 0xff00ff)
						      * i_1091_)
						     + ((i_1099_ & 0xff00ff)
							* i_1092_))
						    & ~0xff00ff)
						   + ((((i_1095_ & 0xff00)
							* i_1091_)
						       + ((i_1099_ & 0xff00)
							  * i_1092_))
						      & 0xff0000)) >> 8;
					} else {
					    int i_1100_
						= (((i_1095_ & 0xff0000)
						    * i_1088_)
						   & ~0xffffff);
					    int i_1101_
						= ((i_1095_ & 0xff00) * i_1089_
						   & 0xff0000);
					    int i_1102_
						= ((i_1095_ & 0xff) * i_1090_
						   & 0xff00);
					    is[i_1045_++] = (i_1100_ | i_1101_
							     | i_1102_) >>> 8;
					}
				    } else
					i_1045_++;
				}
				i_1045_ += i_1049_;
				i_1046_ += i_1050_;
			    }
			}
		    } else if (i_1041_ == 3) {
			int i_1103_ = i_1042_ >>> 24;
			int i_1104_ = 256 - i_1103_;
			for (int i_1105_ = -i_1047_; i_1105_ < 0; i_1105_++) {
			    for (int i_1106_ = -i_1048_; i_1106_ < 0;
				 i_1106_++) {
				int i_1107_ = anIntArray11425[i_1046_++];
				int i_1108_ = i_1107_ + i_1042_;
				int i_1109_ = ((i_1107_ & 0xff00ff)
					       + (i_1042_ & 0xff00ff));
				int i_1110_
				    = ((i_1109_ & 0x1000100)
				       + (i_1108_ - i_1109_ & 0x10000));
				i_1110_
				    = i_1108_ - i_1110_ | i_1110_ - (i_1110_
								     >>> 8);
				if (i_1107_ == 0 && i_1103_ != 255) {
				    i_1107_ = i_1110_;
				    i_1110_ = is[i_1045_];
				    i_1110_
					= ((((i_1107_ & 0xff00ff) * i_1103_
					     + (i_1110_ & 0xff00ff) * i_1104_)
					    & ~0xff00ff)
					   + (((i_1107_ & 0xff00) * i_1103_
					       + (i_1110_ & 0xff00) * i_1104_)
					      & 0xff0000)) >> 8;
				}
				is[i_1045_++] = i_1110_;
			    }
			    i_1045_ += i_1049_;
			    i_1046_ += i_1050_;
			}
		    } else if (i_1041_ == 2) {
			int i_1111_ = i_1042_ >>> 24;
			int i_1112_ = 256 - i_1111_;
			int i_1113_
			    = (i_1042_ & 0xff00ff) * i_1112_ & ~0xff00ff;
			int i_1114_ = (i_1042_ & 0xff00) * i_1112_ & 0xff0000;
			i_1042_ = (i_1113_ | i_1114_) >>> 8;
			for (int i_1115_ = -i_1047_; i_1115_ < 0; i_1115_++) {
			    for (int i_1116_ = -i_1048_; i_1116_ < 0;
				 i_1116_++) {
				int i_1117_ = anIntArray11425[i_1046_++];
				if (i_1117_ != 0) {
				    i_1113_ = ((i_1117_ & 0xff00ff) * i_1111_
					       & ~0xff00ff);
				    i_1114_ = ((i_1117_ & 0xff00) * i_1111_
					       & 0xff0000);
				    is[i_1045_++] = ((i_1113_ | i_1114_)
						     >>> 8) + i_1042_;
				} else
				    i_1045_++;
			    }
			    i_1045_ += i_1049_;
			    i_1046_ += i_1050_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1043_ == 2) {
		    if (i_1041_ == 1) {
			for (int i_1118_ = -i_1047_; i_1118_ < 0; i_1118_++) {
			    for (int i_1119_ = -i_1048_; i_1119_ < 0;
				 i_1119_++) {
				int i_1120_ = anIntArray11425[i_1046_++];
				if (i_1120_ != 0) {
				    int i_1121_ = is[i_1045_];
				    int i_1122_ = i_1120_ + i_1121_;
				    int i_1123_ = ((i_1120_ & 0xff00ff)
						   + (i_1121_ & 0xff00ff));
				    i_1121_
					= ((i_1123_ & 0x1000100)
					   + (i_1122_ - i_1123_ & 0x10000));
				    is[i_1045_++]
					= (i_1122_ - i_1121_
					   | i_1121_ - (i_1121_ >>> 8));
				} else
				    i_1045_++;
			    }
			    i_1045_ += i_1049_;
			    i_1046_ += i_1050_;
			}
		    } else if (i_1041_ == 0) {
			int i_1124_ = (i_1042_ & 0xff0000) >> 16;
			int i_1125_ = (i_1042_ & 0xff00) >> 8;
			int i_1126_ = i_1042_ & 0xff;
			for (int i_1127_ = -i_1047_; i_1127_ < 0; i_1127_++) {
			    for (int i_1128_ = -i_1048_; i_1128_ < 0;
				 i_1128_++) {
				int i_1129_ = anIntArray11425[i_1046_++];
				if (i_1129_ != 0) {
				    int i_1130_
					= ((i_1129_ & 0xff0000) * i_1124_
					   & ~0xffffff);
				    int i_1131_ = ((i_1129_ & 0xff00) * i_1125_
						   & 0xff0000);
				    int i_1132_
					= (i_1129_ & 0xff) * i_1126_ & 0xff00;
				    i_1129_
					= (i_1130_ | i_1131_ | i_1132_) >>> 8;
				    int i_1133_ = is[i_1045_];
				    int i_1134_ = i_1129_ + i_1133_;
				    int i_1135_ = ((i_1129_ & 0xff00ff)
						   + (i_1133_ & 0xff00ff));
				    i_1133_
					= ((i_1135_ & 0x1000100)
					   + (i_1134_ - i_1135_ & 0x10000));
				    is[i_1045_++]
					= (i_1134_ - i_1133_
					   | i_1133_ - (i_1133_ >>> 8));
				} else
				    i_1045_++;
			    }
			    i_1045_ += i_1049_;
			    i_1046_ += i_1050_;
			}
		    } else if (i_1041_ == 3) {
			for (int i_1136_ = -i_1047_; i_1136_ < 0; i_1136_++) {
			    for (int i_1137_ = -i_1048_; i_1137_ < 0;
				 i_1137_++) {
				int i_1138_ = anIntArray11425[i_1046_++];
				int i_1139_ = i_1138_ + i_1042_;
				int i_1140_ = ((i_1138_ & 0xff00ff)
					       + (i_1042_ & 0xff00ff));
				int i_1141_
				    = ((i_1140_ & 0x1000100)
				       + (i_1139_ - i_1140_ & 0x10000));
				i_1138_
				    = i_1139_ - i_1141_ | i_1141_ - (i_1141_
								     >>> 8);
				i_1141_ = is[i_1045_];
				i_1139_ = i_1138_ + i_1141_;
				i_1140_ = (i_1138_ & 0xff00ff) + (i_1141_
								  & 0xff00ff);
				i_1141_ = ((i_1140_ & 0x1000100)
					   + (i_1139_ - i_1140_ & 0x10000));
				is[i_1045_++]
				    = i_1139_ - i_1141_ | i_1141_ - (i_1141_
								     >>> 8);
			    }
			    i_1045_ += i_1049_;
			    i_1046_ += i_1050_;
			}
		    } else if (i_1041_ == 2) {
			int i_1142_ = i_1042_ >>> 24;
			int i_1143_ = 256 - i_1142_;
			int i_1144_
			    = (i_1042_ & 0xff00ff) * i_1143_ & ~0xff00ff;
			int i_1145_ = (i_1042_ & 0xff00) * i_1143_ & 0xff0000;
			i_1042_ = (i_1144_ | i_1145_) >>> 8;
			for (int i_1146_ = -i_1047_; i_1146_ < 0; i_1146_++) {
			    for (int i_1147_ = -i_1048_; i_1147_ < 0;
				 i_1147_++) {
				int i_1148_ = anIntArray11425[i_1046_++];
				if (i_1148_ != 0) {
				    i_1144_ = ((i_1148_ & 0xff00ff) * i_1142_
					       & ~0xff00ff);
				    i_1145_ = ((i_1148_ & 0xff00) * i_1142_
					       & 0xff0000);
				    i_1148_ = (((i_1144_ | i_1145_) >>> 8)
					       + i_1042_);
				    int i_1149_ = is[i_1045_];
				    int i_1150_ = i_1148_ + i_1149_;
				    int i_1151_ = ((i_1148_ & 0xff00ff)
						   + (i_1149_ & 0xff00ff));
				    i_1149_
					= ((i_1151_ & 0x1000100)
					   + (i_1150_ - i_1151_ & 0x10000));
				    is[i_1045_++]
					= (i_1150_ - i_1149_
					   | i_1149_ - (i_1149_ >>> 8));
				} else
				    i_1045_++;
			    }
			    i_1045_ += i_1049_;
			    i_1046_ += i_1050_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    void method2470(int i, int i_1152_, int i_1153_, int i_1154_, int i_1155_,
		    int i_1156_, int i_1157_, int i_1158_) {
	if (aClass182_Sub2_9033.method15226())
	    throw new IllegalStateException();
	if (i_1153_ > 0 && i_1154_ > 0) {
	    int[] is = aClass182_Sub2_9033.anIntArray9466;
	    if (is != null) {
		int i_1159_ = 0;
		int i_1160_ = 0;
		int i_1161_ = aClass182_Sub2_9033.anInt9494 * -476035351;
		int i_1162_ = anInt9002 + anInt9000 + anInt9004;
		int i_1163_ = anInt9003 + anInt9001 + anInt9005;
		int i_1164_ = (i_1162_ << 16) / i_1153_;
		int i_1165_ = (i_1163_ << 16) / i_1154_;
		if (anInt9002 > 0) {
		    int i_1166_ = ((anInt9002 << 16) + i_1164_ - 1) / i_1164_;
		    i += i_1166_;
		    i_1159_ += i_1166_ * i_1164_ - (anInt9002 << 16);
		}
		if (anInt9003 > 0) {
		    int i_1167_ = ((anInt9003 << 16) + i_1165_ - 1) / i_1165_;
		    i_1152_ += i_1167_;
		    i_1160_ += i_1167_ * i_1165_ - (anInt9003 << 16);
		}
		if (anInt9000 < i_1162_)
		    i_1153_ = (((anInt9000 << 16) - i_1159_ + i_1164_ - 1)
			       / i_1164_);
		if (anInt9001 < i_1163_)
		    i_1154_ = (((anInt9001 << 16) - i_1160_ + i_1165_ - 1)
			       / i_1165_);
		int i_1168_ = i + i_1152_ * i_1161_;
		int i_1169_ = i_1161_ - i_1153_;
		if (i_1152_ + i_1154_
		    > aClass182_Sub2_9033.anInt9473 * 1920901985)
		    i_1154_ -= (i_1152_ + i_1154_
				- aClass182_Sub2_9033.anInt9473 * 1920901985);
		if (i_1152_ < aClass182_Sub2_9033.anInt9472 * 1722112305) {
		    int i_1170_
			= aClass182_Sub2_9033.anInt9472 * 1722112305 - i_1152_;
		    i_1154_ -= i_1170_;
		    i_1168_ += i_1170_ * i_1161_;
		    i_1160_ += i_1165_ * i_1170_;
		}
		if (i + i_1153_ > aClass182_Sub2_9033.anInt9499 * -466178451) {
		    int i_1171_
			= (i + i_1153_
			   - aClass182_Sub2_9033.anInt9499 * -466178451);
		    i_1153_ -= i_1171_;
		    i_1169_ += i_1171_;
		}
		if (i < aClass182_Sub2_9033.anInt9470 * 1988019027) {
		    int i_1172_
			= aClass182_Sub2_9033.anInt9470 * 1988019027 - i;
		    i_1153_ -= i_1172_;
		    i_1168_ += i_1172_;
		    i_1159_ += i_1164_ * i_1172_;
		    i_1169_ += i_1172_;
		}
		if (i_1157_ == 0) {
		    if (i_1155_ == 1) {
			int i_1173_ = i_1159_;
			for (int i_1174_ = -i_1154_; i_1174_ < 0; i_1174_++) {
			    int i_1175_ = (i_1160_ >> 16) * anInt9000;
			    for (int i_1176_ = -i_1153_; i_1176_ < 0;
				 i_1176_++) {
				is[i_1168_++] = (anIntArray11425
						 [(i_1159_ >> 16) + i_1175_]);
				i_1159_ += i_1164_;
			    }
			    i_1160_ += i_1165_;
			    i_1159_ = i_1173_;
			    i_1168_ += i_1169_;
			}
		    } else if (i_1155_ == 0) {
			int i_1177_ = (i_1156_ & 0xff0000) >> 16;
			int i_1178_ = (i_1156_ & 0xff00) >> 8;
			int i_1179_ = i_1156_ & 0xff;
			int i_1180_ = i_1159_;
			for (int i_1181_ = -i_1154_; i_1181_ < 0; i_1181_++) {
			    int i_1182_ = (i_1160_ >> 16) * anInt9000;
			    for (int i_1183_ = -i_1153_; i_1183_ < 0;
				 i_1183_++) {
				int i_1184_ = (anIntArray11425
					       [(i_1159_ >> 16) + i_1182_]);
				int i_1185_ = ((i_1184_ & 0xff0000) * i_1177_
					       & ~0xffffff);
				int i_1186_
				    = (i_1184_ & 0xff00) * i_1178_ & 0xff0000;
				int i_1187_
				    = (i_1184_ & 0xff) * i_1179_ & 0xff00;
				is[i_1168_++]
				    = (i_1185_ | i_1186_ | i_1187_) >>> 8;
				i_1159_ += i_1164_;
			    }
			    i_1160_ += i_1165_;
			    i_1159_ = i_1180_;
			    i_1168_ += i_1169_;
			}
		    } else if (i_1155_ == 3) {
			int i_1188_ = i_1159_;
			for (int i_1189_ = -i_1154_; i_1189_ < 0; i_1189_++) {
			    int i_1190_ = (i_1160_ >> 16) * anInt9000;
			    for (int i_1191_ = -i_1153_; i_1191_ < 0;
				 i_1191_++) {
				int i_1192_ = (anIntArray11425
					       [(i_1159_ >> 16) + i_1190_]);
				int i_1193_ = i_1192_ + i_1156_;
				int i_1194_ = ((i_1192_ & 0xff00ff)
					       + (i_1156_ & 0xff00ff));
				int i_1195_
				    = ((i_1194_ & 0x1000100)
				       + (i_1193_ - i_1194_ & 0x10000));
				is[i_1168_++]
				    = i_1193_ - i_1195_ | i_1195_ - (i_1195_
								     >>> 8);
				i_1159_ += i_1164_;
			    }
			    i_1160_ += i_1165_;
			    i_1159_ = i_1188_;
			    i_1168_ += i_1169_;
			}
		    } else if (i_1155_ == 2) {
			int i_1196_ = i_1156_ >>> 24;
			int i_1197_ = 256 - i_1196_;
			int i_1198_
			    = (i_1156_ & 0xff00ff) * i_1197_ & ~0xff00ff;
			int i_1199_ = (i_1156_ & 0xff00) * i_1197_ & 0xff0000;
			i_1156_ = (i_1198_ | i_1199_) >>> 8;
			int i_1200_ = i_1159_;
			for (int i_1201_ = -i_1154_; i_1201_ < 0; i_1201_++) {
			    int i_1202_ = (i_1160_ >> 16) * anInt9000;
			    for (int i_1203_ = -i_1153_; i_1203_ < 0;
				 i_1203_++) {
				int i_1204_ = (anIntArray11425
					       [(i_1159_ >> 16) + i_1202_]);
				i_1198_ = ((i_1204_ & 0xff00ff) * i_1196_
					   & ~0xff00ff);
				i_1199_
				    = (i_1204_ & 0xff00) * i_1196_ & 0xff0000;
				is[i_1168_++]
				    = ((i_1198_ | i_1199_) >>> 8) + i_1156_;
				i_1159_ += i_1164_;
			    }
			    i_1160_ += i_1165_;
			    i_1159_ = i_1200_;
			    i_1168_ += i_1169_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1157_ == 1) {
		    if (i_1155_ == 1) {
			int i_1205_ = i_1159_;
			for (int i_1206_ = -i_1154_; i_1206_ < 0; i_1206_++) {
			    int i_1207_ = (i_1160_ >> 16) * anInt9000;
			    for (int i_1208_ = -i_1153_; i_1208_ < 0;
				 i_1208_++) {
				int i_1209_ = (anIntArray11425
					       [(i_1159_ >> 16) + i_1207_]);
				if (i_1209_ != 0)
				    is[i_1168_++] = i_1209_;
				else
				    i_1168_++;
				i_1159_ += i_1164_;
			    }
			    i_1160_ += i_1165_;
			    i_1159_ = i_1205_;
			    i_1168_ += i_1169_;
			}
		    } else if (i_1155_ == 0) {
			int i_1210_ = i_1159_;
			if ((i_1156_ & 0xffffff) == 16777215) {
			    int i_1211_ = i_1156_ >>> 24;
			    int i_1212_ = 256 - i_1211_;
			    for (int i_1213_ = -i_1154_; i_1213_ < 0;
				 i_1213_++) {
				int i_1214_ = (i_1160_ >> 16) * anInt9000;
				for (int i_1215_ = -i_1153_; i_1215_ < 0;
				     i_1215_++) {
				    int i_1216_
					= (anIntArray11425
					   [(i_1159_ >> 16) + i_1214_]);
				    if (i_1216_ != 0) {
					int i_1217_ = is[i_1168_];
					is[i_1168_++]
					    = ((((i_1216_ & 0xff00ff) * i_1211_
						 + ((i_1217_ & 0xff00ff)
						    * i_1212_))
						& ~0xff00ff)
					       + (((i_1216_ & 0xff00) * i_1211_
						   + ((i_1217_ & 0xff00)
						      * i_1212_))
						  & 0xff0000)) >> 8;
				    } else
					i_1168_++;
				    i_1159_ += i_1164_;
				}
				i_1160_ += i_1165_;
				i_1159_ = i_1210_;
				i_1168_ += i_1169_;
			    }
			} else {
			    int i_1218_ = (i_1156_ & 0xff0000) >> 16;
			    int i_1219_ = (i_1156_ & 0xff00) >> 8;
			    int i_1220_ = i_1156_ & 0xff;
			    int i_1221_ = i_1156_ >>> 24;
			    int i_1222_ = 256 - i_1221_;
			    for (int i_1223_ = -i_1154_; i_1223_ < 0;
				 i_1223_++) {
				int i_1224_ = (i_1160_ >> 16) * anInt9000;
				for (int i_1225_ = -i_1153_; i_1225_ < 0;
				     i_1225_++) {
				    int i_1226_
					= (anIntArray11425
					   [(i_1159_ >> 16) + i_1224_]);
				    if (i_1226_ != 0) {
					if (i_1221_ != 255) {
					    int i_1227_
						= (((i_1226_ & 0xff0000)
						    * i_1218_)
						   & ~0xffffff);
					    int i_1228_
						= ((i_1226_ & 0xff00) * i_1219_
						   & 0xff0000);
					    int i_1229_
						= ((i_1226_ & 0xff) * i_1220_
						   & 0xff00);
					    i_1226_ = (i_1227_ | i_1228_
						       | i_1229_) >>> 8;
					    int i_1230_ = is[i_1168_];
					    is[i_1168_++]
						= (((((i_1226_ & 0xff00ff)
						      * i_1221_)
						     + ((i_1230_ & 0xff00ff)
							* i_1222_))
						    & ~0xff00ff)
						   + ((((i_1226_ & 0xff00)
							* i_1221_)
						       + ((i_1230_ & 0xff00)
							  * i_1222_))
						      & 0xff0000)) >> 8;
					} else {
					    int i_1231_
						= (((i_1226_ & 0xff0000)
						    * i_1218_)
						   & ~0xffffff);
					    int i_1232_
						= ((i_1226_ & 0xff00) * i_1219_
						   & 0xff0000);
					    int i_1233_
						= ((i_1226_ & 0xff) * i_1220_
						   & 0xff00);
					    is[i_1168_++] = (i_1231_ | i_1232_
							     | i_1233_) >>> 8;
					}
				    } else
					i_1168_++;
				    i_1159_ += i_1164_;
				}
				i_1160_ += i_1165_;
				i_1159_ = i_1210_;
				i_1168_ += i_1169_;
			    }
			}
		    } else if (i_1155_ == 3) {
			int i_1234_ = i_1159_;
			int i_1235_ = i_1156_ >>> 24;
			int i_1236_ = 256 - i_1235_;
			for (int i_1237_ = -i_1154_; i_1237_ < 0; i_1237_++) {
			    int i_1238_ = (i_1160_ >> 16) * anInt9000;
			    for (int i_1239_ = -i_1153_; i_1239_ < 0;
				 i_1239_++) {
				int i_1240_ = (anIntArray11425
					       [(i_1159_ >> 16) + i_1238_]);
				int i_1241_ = i_1240_ + i_1156_;
				int i_1242_ = ((i_1240_ & 0xff00ff)
					       + (i_1156_ & 0xff00ff));
				int i_1243_
				    = ((i_1242_ & 0x1000100)
				       + (i_1241_ - i_1242_ & 0x10000));
				i_1243_
				    = i_1241_ - i_1243_ | i_1243_ - (i_1243_
								     >>> 8);
				if (i_1240_ == 0 && i_1235_ != 255) {
				    i_1240_ = i_1243_;
				    i_1243_ = is[i_1168_];
				    i_1243_
					= ((((i_1240_ & 0xff00ff) * i_1235_
					     + (i_1243_ & 0xff00ff) * i_1236_)
					    & ~0xff00ff)
					   + (((i_1240_ & 0xff00) * i_1235_
					       + (i_1243_ & 0xff00) * i_1236_)
					      & 0xff0000)) >> 8;
				}
				is[i_1168_++] = i_1243_;
				i_1159_ += i_1164_;
			    }
			    i_1160_ += i_1165_;
			    i_1159_ = i_1234_;
			    i_1168_ += i_1169_;
			}
		    } else if (i_1155_ == 2) {
			int i_1244_ = i_1156_ >>> 24;
			int i_1245_ = 256 - i_1244_;
			int i_1246_
			    = (i_1156_ & 0xff00ff) * i_1245_ & ~0xff00ff;
			int i_1247_ = (i_1156_ & 0xff00) * i_1245_ & 0xff0000;
			i_1156_ = (i_1246_ | i_1247_) >>> 8;
			int i_1248_ = i_1159_;
			for (int i_1249_ = -i_1154_; i_1249_ < 0; i_1249_++) {
			    int i_1250_ = (i_1160_ >> 16) * anInt9000;
			    for (int i_1251_ = -i_1153_; i_1251_ < 0;
				 i_1251_++) {
				int i_1252_ = (anIntArray11425
					       [(i_1159_ >> 16) + i_1250_]);
				if (i_1252_ != 0) {
				    i_1246_ = ((i_1252_ & 0xff00ff) * i_1244_
					       & ~0xff00ff);
				    i_1247_ = ((i_1252_ & 0xff00) * i_1244_
					       & 0xff0000);
				    is[i_1168_++] = ((i_1246_ | i_1247_)
						     >>> 8) + i_1156_;
				} else
				    i_1168_++;
				i_1159_ += i_1164_;
			    }
			    i_1160_ += i_1165_;
			    i_1159_ = i_1248_;
			    i_1168_ += i_1169_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1157_ == 2) {
		    if (i_1155_ == 1) {
			int i_1253_ = i_1159_;
			for (int i_1254_ = -i_1154_; i_1254_ < 0; i_1254_++) {
			    int i_1255_ = (i_1160_ >> 16) * anInt9000;
			    for (int i_1256_ = -i_1153_; i_1256_ < 0;
				 i_1256_++) {
				int i_1257_ = (anIntArray11425
					       [(i_1159_ >> 16) + i_1255_]);
				if (i_1257_ != 0) {
				    int i_1258_ = is[i_1168_];
				    int i_1259_ = i_1257_ + i_1258_;
				    int i_1260_ = ((i_1257_ & 0xff00ff)
						   + (i_1258_ & 0xff00ff));
				    i_1258_
					= ((i_1260_ & 0x1000100)
					   + (i_1259_ - i_1260_ & 0x10000));
				    is[i_1168_++]
					= (i_1259_ - i_1258_
					   | i_1258_ - (i_1258_ >>> 8));
				} else
				    i_1168_++;
				i_1159_ += i_1164_;
			    }
			    i_1160_ += i_1165_;
			    i_1159_ = i_1253_;
			    i_1168_ += i_1169_;
			}
		    } else if (i_1155_ == 0) {
			int i_1261_ = i_1159_;
			int i_1262_ = (i_1156_ & 0xff0000) >> 16;
			int i_1263_ = (i_1156_ & 0xff00) >> 8;
			int i_1264_ = i_1156_ & 0xff;
			for (int i_1265_ = -i_1154_; i_1265_ < 0; i_1265_++) {
			    int i_1266_ = (i_1160_ >> 16) * anInt9000;
			    for (int i_1267_ = -i_1153_; i_1267_ < 0;
				 i_1267_++) {
				int i_1268_ = (anIntArray11425
					       [(i_1159_ >> 16) + i_1266_]);
				if (i_1268_ != 0) {
				    int i_1269_
					= ((i_1268_ & 0xff0000) * i_1262_
					   & ~0xffffff);
				    int i_1270_ = ((i_1268_ & 0xff00) * i_1263_
						   & 0xff0000);
				    int i_1271_
					= (i_1268_ & 0xff) * i_1264_ & 0xff00;
				    i_1268_
					= (i_1269_ | i_1270_ | i_1271_) >>> 8;
				    int i_1272_ = is[i_1168_];
				    int i_1273_ = i_1268_ + i_1272_;
				    int i_1274_ = ((i_1268_ & 0xff00ff)
						   + (i_1272_ & 0xff00ff));
				    i_1272_
					= ((i_1274_ & 0x1000100)
					   + (i_1273_ - i_1274_ & 0x10000));
				    is[i_1168_++]
					= (i_1273_ - i_1272_
					   | i_1272_ - (i_1272_ >>> 8));
				} else
				    i_1168_++;
				i_1159_ += i_1164_;
			    }
			    i_1160_ += i_1165_;
			    i_1159_ = i_1261_;
			    i_1168_ += i_1169_;
			}
		    } else if (i_1155_ == 3) {
			int i_1275_ = i_1159_;
			for (int i_1276_ = -i_1154_; i_1276_ < 0; i_1276_++) {
			    int i_1277_ = (i_1160_ >> 16) * anInt9000;
			    for (int i_1278_ = -i_1153_; i_1278_ < 0;
				 i_1278_++) {
				int i_1279_ = (anIntArray11425
					       [(i_1159_ >> 16) + i_1277_]);
				int i_1280_ = i_1279_ + i_1156_;
				int i_1281_ = ((i_1279_ & 0xff00ff)
					       + (i_1156_ & 0xff00ff));
				int i_1282_
				    = ((i_1281_ & 0x1000100)
				       + (i_1280_ - i_1281_ & 0x10000));
				i_1279_
				    = i_1280_ - i_1282_ | i_1282_ - (i_1282_
								     >>> 8);
				i_1282_ = is[i_1168_];
				i_1280_ = i_1279_ + i_1282_;
				i_1281_ = (i_1279_ & 0xff00ff) + (i_1282_
								  & 0xff00ff);
				i_1282_ = ((i_1281_ & 0x1000100)
					   + (i_1280_ - i_1281_ & 0x10000));
				is[i_1168_++]
				    = i_1280_ - i_1282_ | i_1282_ - (i_1282_
								     >>> 8);
				i_1159_ += i_1164_;
			    }
			    i_1160_ += i_1165_;
			    i_1159_ = i_1275_;
			    i_1168_ += i_1169_;
			}
		    } else if (i_1155_ == 2) {
			int i_1283_ = i_1156_ >>> 24;
			int i_1284_ = 256 - i_1283_;
			int i_1285_
			    = (i_1156_ & 0xff00ff) * i_1284_ & ~0xff00ff;
			int i_1286_ = (i_1156_ & 0xff00) * i_1284_ & 0xff0000;
			i_1156_ = (i_1285_ | i_1286_) >>> 8;
			int i_1287_ = i_1159_;
			for (int i_1288_ = -i_1154_; i_1288_ < 0; i_1288_++) {
			    int i_1289_ = (i_1160_ >> 16) * anInt9000;
			    for (int i_1290_ = -i_1153_; i_1290_ < 0;
				 i_1290_++) {
				int i_1291_ = (anIntArray11425
					       [(i_1159_ >> 16) + i_1289_]);
				if (i_1291_ != 0) {
				    i_1285_ = ((i_1291_ & 0xff00ff) * i_1283_
					       & ~0xff00ff);
				    i_1286_ = ((i_1291_ & 0xff00) * i_1283_
					       & 0xff0000);
				    i_1291_ = (((i_1285_ | i_1286_) >>> 8)
					       + i_1156_);
				    int i_1292_ = is[i_1168_];
				    int i_1293_ = i_1291_ + i_1292_;
				    int i_1294_ = ((i_1291_ & 0xff00ff)
						   + (i_1292_ & 0xff00ff));
				    i_1292_
					= ((i_1294_ & 0x1000100)
					   + (i_1293_ - i_1294_ & 0x10000));
				    is[i_1168_++]
					= (i_1293_ - i_1292_
					   | i_1292_ - (i_1292_ >>> 8));
				} else
				    i_1168_++;
				i_1159_ += i_1164_;
			    }
			    i_1160_ += i_1165_;
			    i_1159_ = i_1287_;
			    i_1168_ += i_1169_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    void method2508(int i, int i_1295_, int i_1296_, int i_1297_, int i_1298_,
		    int i_1299_, int i_1300_, int i_1301_) {
	if (aClass182_Sub2_9033.method15226())
	    throw new IllegalStateException();
	if (i_1296_ > 0 && i_1297_ > 0) {
	    int[] is = aClass182_Sub2_9033.anIntArray9466;
	    if (is != null) {
		int i_1302_ = 0;
		int i_1303_ = 0;
		int i_1304_ = aClass182_Sub2_9033.anInt9494 * -476035351;
		int i_1305_ = anInt9002 + anInt9000 + anInt9004;
		int i_1306_ = anInt9003 + anInt9001 + anInt9005;
		int i_1307_ = (i_1305_ << 16) / i_1296_;
		int i_1308_ = (i_1306_ << 16) / i_1297_;
		if (anInt9002 > 0) {
		    int i_1309_ = ((anInt9002 << 16) + i_1307_ - 1) / i_1307_;
		    i += i_1309_;
		    i_1302_ += i_1309_ * i_1307_ - (anInt9002 << 16);
		}
		if (anInt9003 > 0) {
		    int i_1310_ = ((anInt9003 << 16) + i_1308_ - 1) / i_1308_;
		    i_1295_ += i_1310_;
		    i_1303_ += i_1310_ * i_1308_ - (anInt9003 << 16);
		}
		if (anInt9000 < i_1305_)
		    i_1296_ = (((anInt9000 << 16) - i_1302_ + i_1307_ - 1)
			       / i_1307_);
		if (anInt9001 < i_1306_)
		    i_1297_ = (((anInt9001 << 16) - i_1303_ + i_1308_ - 1)
			       / i_1308_);
		int i_1311_ = i + i_1295_ * i_1304_;
		int i_1312_ = i_1304_ - i_1296_;
		if (i_1295_ + i_1297_
		    > aClass182_Sub2_9033.anInt9473 * 1920901985)
		    i_1297_ -= (i_1295_ + i_1297_
				- aClass182_Sub2_9033.anInt9473 * 1920901985);
		if (i_1295_ < aClass182_Sub2_9033.anInt9472 * 1722112305) {
		    int i_1313_
			= aClass182_Sub2_9033.anInt9472 * 1722112305 - i_1295_;
		    i_1297_ -= i_1313_;
		    i_1311_ += i_1313_ * i_1304_;
		    i_1303_ += i_1308_ * i_1313_;
		}
		if (i + i_1296_ > aClass182_Sub2_9033.anInt9499 * -466178451) {
		    int i_1314_
			= (i + i_1296_
			   - aClass182_Sub2_9033.anInt9499 * -466178451);
		    i_1296_ -= i_1314_;
		    i_1312_ += i_1314_;
		}
		if (i < aClass182_Sub2_9033.anInt9470 * 1988019027) {
		    int i_1315_
			= aClass182_Sub2_9033.anInt9470 * 1988019027 - i;
		    i_1296_ -= i_1315_;
		    i_1311_ += i_1315_;
		    i_1302_ += i_1307_ * i_1315_;
		    i_1312_ += i_1315_;
		}
		if (i_1300_ == 0) {
		    if (i_1298_ == 1) {
			int i_1316_ = i_1302_;
			for (int i_1317_ = -i_1297_; i_1317_ < 0; i_1317_++) {
			    int i_1318_ = (i_1303_ >> 16) * anInt9000;
			    for (int i_1319_ = -i_1296_; i_1319_ < 0;
				 i_1319_++) {
				is[i_1311_++] = (anIntArray11425
						 [(i_1302_ >> 16) + i_1318_]);
				i_1302_ += i_1307_;
			    }
			    i_1303_ += i_1308_;
			    i_1302_ = i_1316_;
			    i_1311_ += i_1312_;
			}
		    } else if (i_1298_ == 0) {
			int i_1320_ = (i_1299_ & 0xff0000) >> 16;
			int i_1321_ = (i_1299_ & 0xff00) >> 8;
			int i_1322_ = i_1299_ & 0xff;
			int i_1323_ = i_1302_;
			for (int i_1324_ = -i_1297_; i_1324_ < 0; i_1324_++) {
			    int i_1325_ = (i_1303_ >> 16) * anInt9000;
			    for (int i_1326_ = -i_1296_; i_1326_ < 0;
				 i_1326_++) {
				int i_1327_ = (anIntArray11425
					       [(i_1302_ >> 16) + i_1325_]);
				int i_1328_ = ((i_1327_ & 0xff0000) * i_1320_
					       & ~0xffffff);
				int i_1329_
				    = (i_1327_ & 0xff00) * i_1321_ & 0xff0000;
				int i_1330_
				    = (i_1327_ & 0xff) * i_1322_ & 0xff00;
				is[i_1311_++]
				    = (i_1328_ | i_1329_ | i_1330_) >>> 8;
				i_1302_ += i_1307_;
			    }
			    i_1303_ += i_1308_;
			    i_1302_ = i_1323_;
			    i_1311_ += i_1312_;
			}
		    } else if (i_1298_ == 3) {
			int i_1331_ = i_1302_;
			for (int i_1332_ = -i_1297_; i_1332_ < 0; i_1332_++) {
			    int i_1333_ = (i_1303_ >> 16) * anInt9000;
			    for (int i_1334_ = -i_1296_; i_1334_ < 0;
				 i_1334_++) {
				int i_1335_ = (anIntArray11425
					       [(i_1302_ >> 16) + i_1333_]);
				int i_1336_ = i_1335_ + i_1299_;
				int i_1337_ = ((i_1335_ & 0xff00ff)
					       + (i_1299_ & 0xff00ff));
				int i_1338_
				    = ((i_1337_ & 0x1000100)
				       + (i_1336_ - i_1337_ & 0x10000));
				is[i_1311_++]
				    = i_1336_ - i_1338_ | i_1338_ - (i_1338_
								     >>> 8);
				i_1302_ += i_1307_;
			    }
			    i_1303_ += i_1308_;
			    i_1302_ = i_1331_;
			    i_1311_ += i_1312_;
			}
		    } else if (i_1298_ == 2) {
			int i_1339_ = i_1299_ >>> 24;
			int i_1340_ = 256 - i_1339_;
			int i_1341_
			    = (i_1299_ & 0xff00ff) * i_1340_ & ~0xff00ff;
			int i_1342_ = (i_1299_ & 0xff00) * i_1340_ & 0xff0000;
			i_1299_ = (i_1341_ | i_1342_) >>> 8;
			int i_1343_ = i_1302_;
			for (int i_1344_ = -i_1297_; i_1344_ < 0; i_1344_++) {
			    int i_1345_ = (i_1303_ >> 16) * anInt9000;
			    for (int i_1346_ = -i_1296_; i_1346_ < 0;
				 i_1346_++) {
				int i_1347_ = (anIntArray11425
					       [(i_1302_ >> 16) + i_1345_]);
				i_1341_ = ((i_1347_ & 0xff00ff) * i_1339_
					   & ~0xff00ff);
				i_1342_
				    = (i_1347_ & 0xff00) * i_1339_ & 0xff0000;
				is[i_1311_++]
				    = ((i_1341_ | i_1342_) >>> 8) + i_1299_;
				i_1302_ += i_1307_;
			    }
			    i_1303_ += i_1308_;
			    i_1302_ = i_1343_;
			    i_1311_ += i_1312_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1300_ == 1) {
		    if (i_1298_ == 1) {
			int i_1348_ = i_1302_;
			for (int i_1349_ = -i_1297_; i_1349_ < 0; i_1349_++) {
			    int i_1350_ = (i_1303_ >> 16) * anInt9000;
			    for (int i_1351_ = -i_1296_; i_1351_ < 0;
				 i_1351_++) {
				int i_1352_ = (anIntArray11425
					       [(i_1302_ >> 16) + i_1350_]);
				if (i_1352_ != 0)
				    is[i_1311_++] = i_1352_;
				else
				    i_1311_++;
				i_1302_ += i_1307_;
			    }
			    i_1303_ += i_1308_;
			    i_1302_ = i_1348_;
			    i_1311_ += i_1312_;
			}
		    } else if (i_1298_ == 0) {
			int i_1353_ = i_1302_;
			if ((i_1299_ & 0xffffff) == 16777215) {
			    int i_1354_ = i_1299_ >>> 24;
			    int i_1355_ = 256 - i_1354_;
			    for (int i_1356_ = -i_1297_; i_1356_ < 0;
				 i_1356_++) {
				int i_1357_ = (i_1303_ >> 16) * anInt9000;
				for (int i_1358_ = -i_1296_; i_1358_ < 0;
				     i_1358_++) {
				    int i_1359_
					= (anIntArray11425
					   [(i_1302_ >> 16) + i_1357_]);
				    if (i_1359_ != 0) {
					int i_1360_ = is[i_1311_];
					is[i_1311_++]
					    = ((((i_1359_ & 0xff00ff) * i_1354_
						 + ((i_1360_ & 0xff00ff)
						    * i_1355_))
						& ~0xff00ff)
					       + (((i_1359_ & 0xff00) * i_1354_
						   + ((i_1360_ & 0xff00)
						      * i_1355_))
						  & 0xff0000)) >> 8;
				    } else
					i_1311_++;
				    i_1302_ += i_1307_;
				}
				i_1303_ += i_1308_;
				i_1302_ = i_1353_;
				i_1311_ += i_1312_;
			    }
			} else {
			    int i_1361_ = (i_1299_ & 0xff0000) >> 16;
			    int i_1362_ = (i_1299_ & 0xff00) >> 8;
			    int i_1363_ = i_1299_ & 0xff;
			    int i_1364_ = i_1299_ >>> 24;
			    int i_1365_ = 256 - i_1364_;
			    for (int i_1366_ = -i_1297_; i_1366_ < 0;
				 i_1366_++) {
				int i_1367_ = (i_1303_ >> 16) * anInt9000;
				for (int i_1368_ = -i_1296_; i_1368_ < 0;
				     i_1368_++) {
				    int i_1369_
					= (anIntArray11425
					   [(i_1302_ >> 16) + i_1367_]);
				    if (i_1369_ != 0) {
					if (i_1364_ != 255) {
					    int i_1370_
						= (((i_1369_ & 0xff0000)
						    * i_1361_)
						   & ~0xffffff);
					    int i_1371_
						= ((i_1369_ & 0xff00) * i_1362_
						   & 0xff0000);
					    int i_1372_
						= ((i_1369_ & 0xff) * i_1363_
						   & 0xff00);
					    i_1369_ = (i_1370_ | i_1371_
						       | i_1372_) >>> 8;
					    int i_1373_ = is[i_1311_];
					    is[i_1311_++]
						= (((((i_1369_ & 0xff00ff)
						      * i_1364_)
						     + ((i_1373_ & 0xff00ff)
							* i_1365_))
						    & ~0xff00ff)
						   + ((((i_1369_ & 0xff00)
							* i_1364_)
						       + ((i_1373_ & 0xff00)
							  * i_1365_))
						      & 0xff0000)) >> 8;
					} else {
					    int i_1374_
						= (((i_1369_ & 0xff0000)
						    * i_1361_)
						   & ~0xffffff);
					    int i_1375_
						= ((i_1369_ & 0xff00) * i_1362_
						   & 0xff0000);
					    int i_1376_
						= ((i_1369_ & 0xff) * i_1363_
						   & 0xff00);
					    is[i_1311_++] = (i_1374_ | i_1375_
							     | i_1376_) >>> 8;
					}
				    } else
					i_1311_++;
				    i_1302_ += i_1307_;
				}
				i_1303_ += i_1308_;
				i_1302_ = i_1353_;
				i_1311_ += i_1312_;
			    }
			}
		    } else if (i_1298_ == 3) {
			int i_1377_ = i_1302_;
			int i_1378_ = i_1299_ >>> 24;
			int i_1379_ = 256 - i_1378_;
			for (int i_1380_ = -i_1297_; i_1380_ < 0; i_1380_++) {
			    int i_1381_ = (i_1303_ >> 16) * anInt9000;
			    for (int i_1382_ = -i_1296_; i_1382_ < 0;
				 i_1382_++) {
				int i_1383_ = (anIntArray11425
					       [(i_1302_ >> 16) + i_1381_]);
				int i_1384_ = i_1383_ + i_1299_;
				int i_1385_ = ((i_1383_ & 0xff00ff)
					       + (i_1299_ & 0xff00ff));
				int i_1386_
				    = ((i_1385_ & 0x1000100)
				       + (i_1384_ - i_1385_ & 0x10000));
				i_1386_
				    = i_1384_ - i_1386_ | i_1386_ - (i_1386_
								     >>> 8);
				if (i_1383_ == 0 && i_1378_ != 255) {
				    i_1383_ = i_1386_;
				    i_1386_ = is[i_1311_];
				    i_1386_
					= ((((i_1383_ & 0xff00ff) * i_1378_
					     + (i_1386_ & 0xff00ff) * i_1379_)
					    & ~0xff00ff)
					   + (((i_1383_ & 0xff00) * i_1378_
					       + (i_1386_ & 0xff00) * i_1379_)
					      & 0xff0000)) >> 8;
				}
				is[i_1311_++] = i_1386_;
				i_1302_ += i_1307_;
			    }
			    i_1303_ += i_1308_;
			    i_1302_ = i_1377_;
			    i_1311_ += i_1312_;
			}
		    } else if (i_1298_ == 2) {
			int i_1387_ = i_1299_ >>> 24;
			int i_1388_ = 256 - i_1387_;
			int i_1389_
			    = (i_1299_ & 0xff00ff) * i_1388_ & ~0xff00ff;
			int i_1390_ = (i_1299_ & 0xff00) * i_1388_ & 0xff0000;
			i_1299_ = (i_1389_ | i_1390_) >>> 8;
			int i_1391_ = i_1302_;
			for (int i_1392_ = -i_1297_; i_1392_ < 0; i_1392_++) {
			    int i_1393_ = (i_1303_ >> 16) * anInt9000;
			    for (int i_1394_ = -i_1296_; i_1394_ < 0;
				 i_1394_++) {
				int i_1395_ = (anIntArray11425
					       [(i_1302_ >> 16) + i_1393_]);
				if (i_1395_ != 0) {
				    i_1389_ = ((i_1395_ & 0xff00ff) * i_1387_
					       & ~0xff00ff);
				    i_1390_ = ((i_1395_ & 0xff00) * i_1387_
					       & 0xff0000);
				    is[i_1311_++] = ((i_1389_ | i_1390_)
						     >>> 8) + i_1299_;
				} else
				    i_1311_++;
				i_1302_ += i_1307_;
			    }
			    i_1303_ += i_1308_;
			    i_1302_ = i_1391_;
			    i_1311_ += i_1312_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1300_ == 2) {
		    if (i_1298_ == 1) {
			int i_1396_ = i_1302_;
			for (int i_1397_ = -i_1297_; i_1397_ < 0; i_1397_++) {
			    int i_1398_ = (i_1303_ >> 16) * anInt9000;
			    for (int i_1399_ = -i_1296_; i_1399_ < 0;
				 i_1399_++) {
				int i_1400_ = (anIntArray11425
					       [(i_1302_ >> 16) + i_1398_]);
				if (i_1400_ != 0) {
				    int i_1401_ = is[i_1311_];
				    int i_1402_ = i_1400_ + i_1401_;
				    int i_1403_ = ((i_1400_ & 0xff00ff)
						   + (i_1401_ & 0xff00ff));
				    i_1401_
					= ((i_1403_ & 0x1000100)
					   + (i_1402_ - i_1403_ & 0x10000));
				    is[i_1311_++]
					= (i_1402_ - i_1401_
					   | i_1401_ - (i_1401_ >>> 8));
				} else
				    i_1311_++;
				i_1302_ += i_1307_;
			    }
			    i_1303_ += i_1308_;
			    i_1302_ = i_1396_;
			    i_1311_ += i_1312_;
			}
		    } else if (i_1298_ == 0) {
			int i_1404_ = i_1302_;
			int i_1405_ = (i_1299_ & 0xff0000) >> 16;
			int i_1406_ = (i_1299_ & 0xff00) >> 8;
			int i_1407_ = i_1299_ & 0xff;
			for (int i_1408_ = -i_1297_; i_1408_ < 0; i_1408_++) {
			    int i_1409_ = (i_1303_ >> 16) * anInt9000;
			    for (int i_1410_ = -i_1296_; i_1410_ < 0;
				 i_1410_++) {
				int i_1411_ = (anIntArray11425
					       [(i_1302_ >> 16) + i_1409_]);
				if (i_1411_ != 0) {
				    int i_1412_
					= ((i_1411_ & 0xff0000) * i_1405_
					   & ~0xffffff);
				    int i_1413_ = ((i_1411_ & 0xff00) * i_1406_
						   & 0xff0000);
				    int i_1414_
					= (i_1411_ & 0xff) * i_1407_ & 0xff00;
				    i_1411_
					= (i_1412_ | i_1413_ | i_1414_) >>> 8;
				    int i_1415_ = is[i_1311_];
				    int i_1416_ = i_1411_ + i_1415_;
				    int i_1417_ = ((i_1411_ & 0xff00ff)
						   + (i_1415_ & 0xff00ff));
				    i_1415_
					= ((i_1417_ & 0x1000100)
					   + (i_1416_ - i_1417_ & 0x10000));
				    is[i_1311_++]
					= (i_1416_ - i_1415_
					   | i_1415_ - (i_1415_ >>> 8));
				} else
				    i_1311_++;
				i_1302_ += i_1307_;
			    }
			    i_1303_ += i_1308_;
			    i_1302_ = i_1404_;
			    i_1311_ += i_1312_;
			}
		    } else if (i_1298_ == 3) {
			int i_1418_ = i_1302_;
			for (int i_1419_ = -i_1297_; i_1419_ < 0; i_1419_++) {
			    int i_1420_ = (i_1303_ >> 16) * anInt9000;
			    for (int i_1421_ = -i_1296_; i_1421_ < 0;
				 i_1421_++) {
				int i_1422_ = (anIntArray11425
					       [(i_1302_ >> 16) + i_1420_]);
				int i_1423_ = i_1422_ + i_1299_;
				int i_1424_ = ((i_1422_ & 0xff00ff)
					       + (i_1299_ & 0xff00ff));
				int i_1425_
				    = ((i_1424_ & 0x1000100)
				       + (i_1423_ - i_1424_ & 0x10000));
				i_1422_
				    = i_1423_ - i_1425_ | i_1425_ - (i_1425_
								     >>> 8);
				i_1425_ = is[i_1311_];
				i_1423_ = i_1422_ + i_1425_;
				i_1424_ = (i_1422_ & 0xff00ff) + (i_1425_
								  & 0xff00ff);
				i_1425_ = ((i_1424_ & 0x1000100)
					   + (i_1423_ - i_1424_ & 0x10000));
				is[i_1311_++]
				    = i_1423_ - i_1425_ | i_1425_ - (i_1425_
								     >>> 8);
				i_1302_ += i_1307_;
			    }
			    i_1303_ += i_1308_;
			    i_1302_ = i_1418_;
			    i_1311_ += i_1312_;
			}
		    } else if (i_1298_ == 2) {
			int i_1426_ = i_1299_ >>> 24;
			int i_1427_ = 256 - i_1426_;
			int i_1428_
			    = (i_1299_ & 0xff00ff) * i_1427_ & ~0xff00ff;
			int i_1429_ = (i_1299_ & 0xff00) * i_1427_ & 0xff0000;
			i_1299_ = (i_1428_ | i_1429_) >>> 8;
			int i_1430_ = i_1302_;
			for (int i_1431_ = -i_1297_; i_1431_ < 0; i_1431_++) {
			    int i_1432_ = (i_1303_ >> 16) * anInt9000;
			    for (int i_1433_ = -i_1296_; i_1433_ < 0;
				 i_1433_++) {
				int i_1434_ = (anIntArray11425
					       [(i_1302_ >> 16) + i_1432_]);
				if (i_1434_ != 0) {
				    i_1428_ = ((i_1434_ & 0xff00ff) * i_1426_
					       & ~0xff00ff);
				    i_1429_ = ((i_1434_ & 0xff00) * i_1426_
					       & 0xff0000);
				    i_1434_ = (((i_1428_ | i_1429_) >>> 8)
					       + i_1299_);
				    int i_1435_ = is[i_1311_];
				    int i_1436_ = i_1434_ + i_1435_;
				    int i_1437_ = ((i_1434_ & 0xff00ff)
						   + (i_1435_ & 0xff00ff));
				    i_1435_
					= ((i_1437_ & 0x1000100)
					   + (i_1436_ - i_1437_ & 0x10000));
				    is[i_1311_++]
					= (i_1436_ - i_1435_
					   | i_1435_ - (i_1435_ >>> 8));
				} else
				    i_1311_++;
				i_1302_ += i_1307_;
			    }
			    i_1303_ += i_1308_;
			    i_1302_ = i_1430_;
			    i_1311_ += i_1312_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    void method2509(int i, int i_1438_, int i_1439_, int i_1440_, int i_1441_,
		    int i_1442_, int i_1443_, int i_1444_) {
	if (aClass182_Sub2_9033.method15226())
	    throw new IllegalStateException();
	if (i_1439_ > 0 && i_1440_ > 0) {
	    int[] is = aClass182_Sub2_9033.anIntArray9466;
	    if (is != null) {
		int i_1445_ = 0;
		int i_1446_ = 0;
		int i_1447_ = aClass182_Sub2_9033.anInt9494 * -476035351;
		int i_1448_ = anInt9002 + anInt9000 + anInt9004;
		int i_1449_ = anInt9003 + anInt9001 + anInt9005;
		int i_1450_ = (i_1448_ << 16) / i_1439_;
		int i_1451_ = (i_1449_ << 16) / i_1440_;
		if (anInt9002 > 0) {
		    int i_1452_ = ((anInt9002 << 16) + i_1450_ - 1) / i_1450_;
		    i += i_1452_;
		    i_1445_ += i_1452_ * i_1450_ - (anInt9002 << 16);
		}
		if (anInt9003 > 0) {
		    int i_1453_ = ((anInt9003 << 16) + i_1451_ - 1) / i_1451_;
		    i_1438_ += i_1453_;
		    i_1446_ += i_1453_ * i_1451_ - (anInt9003 << 16);
		}
		if (anInt9000 < i_1448_)
		    i_1439_ = (((anInt9000 << 16) - i_1445_ + i_1450_ - 1)
			       / i_1450_);
		if (anInt9001 < i_1449_)
		    i_1440_ = (((anInt9001 << 16) - i_1446_ + i_1451_ - 1)
			       / i_1451_);
		int i_1454_ = i + i_1438_ * i_1447_;
		int i_1455_ = i_1447_ - i_1439_;
		if (i_1438_ + i_1440_
		    > aClass182_Sub2_9033.anInt9473 * 1920901985)
		    i_1440_ -= (i_1438_ + i_1440_
				- aClass182_Sub2_9033.anInt9473 * 1920901985);
		if (i_1438_ < aClass182_Sub2_9033.anInt9472 * 1722112305) {
		    int i_1456_
			= aClass182_Sub2_9033.anInt9472 * 1722112305 - i_1438_;
		    i_1440_ -= i_1456_;
		    i_1454_ += i_1456_ * i_1447_;
		    i_1446_ += i_1451_ * i_1456_;
		}
		if (i + i_1439_ > aClass182_Sub2_9033.anInt9499 * -466178451) {
		    int i_1457_
			= (i + i_1439_
			   - aClass182_Sub2_9033.anInt9499 * -466178451);
		    i_1439_ -= i_1457_;
		    i_1455_ += i_1457_;
		}
		if (i < aClass182_Sub2_9033.anInt9470 * 1988019027) {
		    int i_1458_
			= aClass182_Sub2_9033.anInt9470 * 1988019027 - i;
		    i_1439_ -= i_1458_;
		    i_1454_ += i_1458_;
		    i_1445_ += i_1450_ * i_1458_;
		    i_1455_ += i_1458_;
		}
		if (i_1443_ == 0) {
		    if (i_1441_ == 1) {
			int i_1459_ = i_1445_;
			for (int i_1460_ = -i_1440_; i_1460_ < 0; i_1460_++) {
			    int i_1461_ = (i_1446_ >> 16) * anInt9000;
			    for (int i_1462_ = -i_1439_; i_1462_ < 0;
				 i_1462_++) {
				is[i_1454_++] = (anIntArray11425
						 [(i_1445_ >> 16) + i_1461_]);
				i_1445_ += i_1450_;
			    }
			    i_1446_ += i_1451_;
			    i_1445_ = i_1459_;
			    i_1454_ += i_1455_;
			}
		    } else if (i_1441_ == 0) {
			int i_1463_ = (i_1442_ & 0xff0000) >> 16;
			int i_1464_ = (i_1442_ & 0xff00) >> 8;
			int i_1465_ = i_1442_ & 0xff;
			int i_1466_ = i_1445_;
			for (int i_1467_ = -i_1440_; i_1467_ < 0; i_1467_++) {
			    int i_1468_ = (i_1446_ >> 16) * anInt9000;
			    for (int i_1469_ = -i_1439_; i_1469_ < 0;
				 i_1469_++) {
				int i_1470_ = (anIntArray11425
					       [(i_1445_ >> 16) + i_1468_]);
				int i_1471_ = ((i_1470_ & 0xff0000) * i_1463_
					       & ~0xffffff);
				int i_1472_
				    = (i_1470_ & 0xff00) * i_1464_ & 0xff0000;
				int i_1473_
				    = (i_1470_ & 0xff) * i_1465_ & 0xff00;
				is[i_1454_++]
				    = (i_1471_ | i_1472_ | i_1473_) >>> 8;
				i_1445_ += i_1450_;
			    }
			    i_1446_ += i_1451_;
			    i_1445_ = i_1466_;
			    i_1454_ += i_1455_;
			}
		    } else if (i_1441_ == 3) {
			int i_1474_ = i_1445_;
			for (int i_1475_ = -i_1440_; i_1475_ < 0; i_1475_++) {
			    int i_1476_ = (i_1446_ >> 16) * anInt9000;
			    for (int i_1477_ = -i_1439_; i_1477_ < 0;
				 i_1477_++) {
				int i_1478_ = (anIntArray11425
					       [(i_1445_ >> 16) + i_1476_]);
				int i_1479_ = i_1478_ + i_1442_;
				int i_1480_ = ((i_1478_ & 0xff00ff)
					       + (i_1442_ & 0xff00ff));
				int i_1481_
				    = ((i_1480_ & 0x1000100)
				       + (i_1479_ - i_1480_ & 0x10000));
				is[i_1454_++]
				    = i_1479_ - i_1481_ | i_1481_ - (i_1481_
								     >>> 8);
				i_1445_ += i_1450_;
			    }
			    i_1446_ += i_1451_;
			    i_1445_ = i_1474_;
			    i_1454_ += i_1455_;
			}
		    } else if (i_1441_ == 2) {
			int i_1482_ = i_1442_ >>> 24;
			int i_1483_ = 256 - i_1482_;
			int i_1484_
			    = (i_1442_ & 0xff00ff) * i_1483_ & ~0xff00ff;
			int i_1485_ = (i_1442_ & 0xff00) * i_1483_ & 0xff0000;
			i_1442_ = (i_1484_ | i_1485_) >>> 8;
			int i_1486_ = i_1445_;
			for (int i_1487_ = -i_1440_; i_1487_ < 0; i_1487_++) {
			    int i_1488_ = (i_1446_ >> 16) * anInt9000;
			    for (int i_1489_ = -i_1439_; i_1489_ < 0;
				 i_1489_++) {
				int i_1490_ = (anIntArray11425
					       [(i_1445_ >> 16) + i_1488_]);
				i_1484_ = ((i_1490_ & 0xff00ff) * i_1482_
					   & ~0xff00ff);
				i_1485_
				    = (i_1490_ & 0xff00) * i_1482_ & 0xff0000;
				is[i_1454_++]
				    = ((i_1484_ | i_1485_) >>> 8) + i_1442_;
				i_1445_ += i_1450_;
			    }
			    i_1446_ += i_1451_;
			    i_1445_ = i_1486_;
			    i_1454_ += i_1455_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1443_ == 1) {
		    if (i_1441_ == 1) {
			int i_1491_ = i_1445_;
			for (int i_1492_ = -i_1440_; i_1492_ < 0; i_1492_++) {
			    int i_1493_ = (i_1446_ >> 16) * anInt9000;
			    for (int i_1494_ = -i_1439_; i_1494_ < 0;
				 i_1494_++) {
				int i_1495_ = (anIntArray11425
					       [(i_1445_ >> 16) + i_1493_]);
				if (i_1495_ != 0)
				    is[i_1454_++] = i_1495_;
				else
				    i_1454_++;
				i_1445_ += i_1450_;
			    }
			    i_1446_ += i_1451_;
			    i_1445_ = i_1491_;
			    i_1454_ += i_1455_;
			}
		    } else if (i_1441_ == 0) {
			int i_1496_ = i_1445_;
			if ((i_1442_ & 0xffffff) == 16777215) {
			    int i_1497_ = i_1442_ >>> 24;
			    int i_1498_ = 256 - i_1497_;
			    for (int i_1499_ = -i_1440_; i_1499_ < 0;
				 i_1499_++) {
				int i_1500_ = (i_1446_ >> 16) * anInt9000;
				for (int i_1501_ = -i_1439_; i_1501_ < 0;
				     i_1501_++) {
				    int i_1502_
					= (anIntArray11425
					   [(i_1445_ >> 16) + i_1500_]);
				    if (i_1502_ != 0) {
					int i_1503_ = is[i_1454_];
					is[i_1454_++]
					    = ((((i_1502_ & 0xff00ff) * i_1497_
						 + ((i_1503_ & 0xff00ff)
						    * i_1498_))
						& ~0xff00ff)
					       + (((i_1502_ & 0xff00) * i_1497_
						   + ((i_1503_ & 0xff00)
						      * i_1498_))
						  & 0xff0000)) >> 8;
				    } else
					i_1454_++;
				    i_1445_ += i_1450_;
				}
				i_1446_ += i_1451_;
				i_1445_ = i_1496_;
				i_1454_ += i_1455_;
			    }
			} else {
			    int i_1504_ = (i_1442_ & 0xff0000) >> 16;
			    int i_1505_ = (i_1442_ & 0xff00) >> 8;
			    int i_1506_ = i_1442_ & 0xff;
			    int i_1507_ = i_1442_ >>> 24;
			    int i_1508_ = 256 - i_1507_;
			    for (int i_1509_ = -i_1440_; i_1509_ < 0;
				 i_1509_++) {
				int i_1510_ = (i_1446_ >> 16) * anInt9000;
				for (int i_1511_ = -i_1439_; i_1511_ < 0;
				     i_1511_++) {
				    int i_1512_
					= (anIntArray11425
					   [(i_1445_ >> 16) + i_1510_]);
				    if (i_1512_ != 0) {
					if (i_1507_ != 255) {
					    int i_1513_
						= (((i_1512_ & 0xff0000)
						    * i_1504_)
						   & ~0xffffff);
					    int i_1514_
						= ((i_1512_ & 0xff00) * i_1505_
						   & 0xff0000);
					    int i_1515_
						= ((i_1512_ & 0xff) * i_1506_
						   & 0xff00);
					    i_1512_ = (i_1513_ | i_1514_
						       | i_1515_) >>> 8;
					    int i_1516_ = is[i_1454_];
					    is[i_1454_++]
						= (((((i_1512_ & 0xff00ff)
						      * i_1507_)
						     + ((i_1516_ & 0xff00ff)
							* i_1508_))
						    & ~0xff00ff)
						   + ((((i_1512_ & 0xff00)
							* i_1507_)
						       + ((i_1516_ & 0xff00)
							  * i_1508_))
						      & 0xff0000)) >> 8;
					} else {
					    int i_1517_
						= (((i_1512_ & 0xff0000)
						    * i_1504_)
						   & ~0xffffff);
					    int i_1518_
						= ((i_1512_ & 0xff00) * i_1505_
						   & 0xff0000);
					    int i_1519_
						= ((i_1512_ & 0xff) * i_1506_
						   & 0xff00);
					    is[i_1454_++] = (i_1517_ | i_1518_
							     | i_1519_) >>> 8;
					}
				    } else
					i_1454_++;
				    i_1445_ += i_1450_;
				}
				i_1446_ += i_1451_;
				i_1445_ = i_1496_;
				i_1454_ += i_1455_;
			    }
			}
		    } else if (i_1441_ == 3) {
			int i_1520_ = i_1445_;
			int i_1521_ = i_1442_ >>> 24;
			int i_1522_ = 256 - i_1521_;
			for (int i_1523_ = -i_1440_; i_1523_ < 0; i_1523_++) {
			    int i_1524_ = (i_1446_ >> 16) * anInt9000;
			    for (int i_1525_ = -i_1439_; i_1525_ < 0;
				 i_1525_++) {
				int i_1526_ = (anIntArray11425
					       [(i_1445_ >> 16) + i_1524_]);
				int i_1527_ = i_1526_ + i_1442_;
				int i_1528_ = ((i_1526_ & 0xff00ff)
					       + (i_1442_ & 0xff00ff));
				int i_1529_
				    = ((i_1528_ & 0x1000100)
				       + (i_1527_ - i_1528_ & 0x10000));
				i_1529_
				    = i_1527_ - i_1529_ | i_1529_ - (i_1529_
								     >>> 8);
				if (i_1526_ == 0 && i_1521_ != 255) {
				    i_1526_ = i_1529_;
				    i_1529_ = is[i_1454_];
				    i_1529_
					= ((((i_1526_ & 0xff00ff) * i_1521_
					     + (i_1529_ & 0xff00ff) * i_1522_)
					    & ~0xff00ff)
					   + (((i_1526_ & 0xff00) * i_1521_
					       + (i_1529_ & 0xff00) * i_1522_)
					      & 0xff0000)) >> 8;
				}
				is[i_1454_++] = i_1529_;
				i_1445_ += i_1450_;
			    }
			    i_1446_ += i_1451_;
			    i_1445_ = i_1520_;
			    i_1454_ += i_1455_;
			}
		    } else if (i_1441_ == 2) {
			int i_1530_ = i_1442_ >>> 24;
			int i_1531_ = 256 - i_1530_;
			int i_1532_
			    = (i_1442_ & 0xff00ff) * i_1531_ & ~0xff00ff;
			int i_1533_ = (i_1442_ & 0xff00) * i_1531_ & 0xff0000;
			i_1442_ = (i_1532_ | i_1533_) >>> 8;
			int i_1534_ = i_1445_;
			for (int i_1535_ = -i_1440_; i_1535_ < 0; i_1535_++) {
			    int i_1536_ = (i_1446_ >> 16) * anInt9000;
			    for (int i_1537_ = -i_1439_; i_1537_ < 0;
				 i_1537_++) {
				int i_1538_ = (anIntArray11425
					       [(i_1445_ >> 16) + i_1536_]);
				if (i_1538_ != 0) {
				    i_1532_ = ((i_1538_ & 0xff00ff) * i_1530_
					       & ~0xff00ff);
				    i_1533_ = ((i_1538_ & 0xff00) * i_1530_
					       & 0xff0000);
				    is[i_1454_++] = ((i_1532_ | i_1533_)
						     >>> 8) + i_1442_;
				} else
				    i_1454_++;
				i_1445_ += i_1450_;
			    }
			    i_1446_ += i_1451_;
			    i_1445_ = i_1534_;
			    i_1454_ += i_1455_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1443_ == 2) {
		    if (i_1441_ == 1) {
			int i_1539_ = i_1445_;
			for (int i_1540_ = -i_1440_; i_1540_ < 0; i_1540_++) {
			    int i_1541_ = (i_1446_ >> 16) * anInt9000;
			    for (int i_1542_ = -i_1439_; i_1542_ < 0;
				 i_1542_++) {
				int i_1543_ = (anIntArray11425
					       [(i_1445_ >> 16) + i_1541_]);
				if (i_1543_ != 0) {
				    int i_1544_ = is[i_1454_];
				    int i_1545_ = i_1543_ + i_1544_;
				    int i_1546_ = ((i_1543_ & 0xff00ff)
						   + (i_1544_ & 0xff00ff));
				    i_1544_
					= ((i_1546_ & 0x1000100)
					   + (i_1545_ - i_1546_ & 0x10000));
				    is[i_1454_++]
					= (i_1545_ - i_1544_
					   | i_1544_ - (i_1544_ >>> 8));
				} else
				    i_1454_++;
				i_1445_ += i_1450_;
			    }
			    i_1446_ += i_1451_;
			    i_1445_ = i_1539_;
			    i_1454_ += i_1455_;
			}
		    } else if (i_1441_ == 0) {
			int i_1547_ = i_1445_;
			int i_1548_ = (i_1442_ & 0xff0000) >> 16;
			int i_1549_ = (i_1442_ & 0xff00) >> 8;
			int i_1550_ = i_1442_ & 0xff;
			for (int i_1551_ = -i_1440_; i_1551_ < 0; i_1551_++) {
			    int i_1552_ = (i_1446_ >> 16) * anInt9000;
			    for (int i_1553_ = -i_1439_; i_1553_ < 0;
				 i_1553_++) {
				int i_1554_ = (anIntArray11425
					       [(i_1445_ >> 16) + i_1552_]);
				if (i_1554_ != 0) {
				    int i_1555_
					= ((i_1554_ & 0xff0000) * i_1548_
					   & ~0xffffff);
				    int i_1556_ = ((i_1554_ & 0xff00) * i_1549_
						   & 0xff0000);
				    int i_1557_
					= (i_1554_ & 0xff) * i_1550_ & 0xff00;
				    i_1554_
					= (i_1555_ | i_1556_ | i_1557_) >>> 8;
				    int i_1558_ = is[i_1454_];
				    int i_1559_ = i_1554_ + i_1558_;
				    int i_1560_ = ((i_1554_ & 0xff00ff)
						   + (i_1558_ & 0xff00ff));
				    i_1558_
					= ((i_1560_ & 0x1000100)
					   + (i_1559_ - i_1560_ & 0x10000));
				    is[i_1454_++]
					= (i_1559_ - i_1558_
					   | i_1558_ - (i_1558_ >>> 8));
				} else
				    i_1454_++;
				i_1445_ += i_1450_;
			    }
			    i_1446_ += i_1451_;
			    i_1445_ = i_1547_;
			    i_1454_ += i_1455_;
			}
		    } else if (i_1441_ == 3) {
			int i_1561_ = i_1445_;
			for (int i_1562_ = -i_1440_; i_1562_ < 0; i_1562_++) {
			    int i_1563_ = (i_1446_ >> 16) * anInt9000;
			    for (int i_1564_ = -i_1439_; i_1564_ < 0;
				 i_1564_++) {
				int i_1565_ = (anIntArray11425
					       [(i_1445_ >> 16) + i_1563_]);
				int i_1566_ = i_1565_ + i_1442_;
				int i_1567_ = ((i_1565_ & 0xff00ff)
					       + (i_1442_ & 0xff00ff));
				int i_1568_
				    = ((i_1567_ & 0x1000100)
				       + (i_1566_ - i_1567_ & 0x10000));
				i_1565_
				    = i_1566_ - i_1568_ | i_1568_ - (i_1568_
								     >>> 8);
				i_1568_ = is[i_1454_];
				i_1566_ = i_1565_ + i_1568_;
				i_1567_ = (i_1565_ & 0xff00ff) + (i_1568_
								  & 0xff00ff);
				i_1568_ = ((i_1567_ & 0x1000100)
					   + (i_1566_ - i_1567_ & 0x10000));
				is[i_1454_++]
				    = i_1566_ - i_1568_ | i_1568_ - (i_1568_
								     >>> 8);
				i_1445_ += i_1450_;
			    }
			    i_1446_ += i_1451_;
			    i_1445_ = i_1561_;
			    i_1454_ += i_1455_;
			}
		    } else if (i_1441_ == 2) {
			int i_1569_ = i_1442_ >>> 24;
			int i_1570_ = 256 - i_1569_;
			int i_1571_
			    = (i_1442_ & 0xff00ff) * i_1570_ & ~0xff00ff;
			int i_1572_ = (i_1442_ & 0xff00) * i_1570_ & 0xff0000;
			i_1442_ = (i_1571_ | i_1572_) >>> 8;
			int i_1573_ = i_1445_;
			for (int i_1574_ = -i_1440_; i_1574_ < 0; i_1574_++) {
			    int i_1575_ = (i_1446_ >> 16) * anInt9000;
			    for (int i_1576_ = -i_1439_; i_1576_ < 0;
				 i_1576_++) {
				int i_1577_ = (anIntArray11425
					       [(i_1445_ >> 16) + i_1575_]);
				if (i_1577_ != 0) {
				    i_1571_ = ((i_1577_ & 0xff00ff) * i_1569_
					       & ~0xff00ff);
				    i_1572_ = ((i_1577_ & 0xff00) * i_1569_
					       & 0xff0000);
				    i_1577_ = (((i_1571_ | i_1572_) >>> 8)
					       + i_1442_);
				    int i_1578_ = is[i_1454_];
				    int i_1579_ = i_1577_ + i_1578_;
				    int i_1580_ = ((i_1577_ & 0xff00ff)
						   + (i_1578_ & 0xff00ff));
				    i_1578_
					= ((i_1580_ & 0x1000100)
					   + (i_1579_ - i_1580_ & 0x10000));
				    is[i_1454_++]
					= (i_1579_ - i_1578_
					   | i_1578_ - (i_1578_ >>> 8));
				} else
				    i_1454_++;
				i_1445_ += i_1450_;
			    }
			    i_1446_ += i_1451_;
			    i_1445_ = i_1573_;
			    i_1454_ += i_1455_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    void method14540(boolean bool, boolean bool_1581_, boolean bool_1582_,
		     int i, int i_1583_, float f, int i_1584_, int i_1585_,
		     int i_1586_, int i_1587_, int i_1588_, int i_1589_,
		     boolean bool_1590_) {
	if (i_1584_ > 0 && i_1585_ > 0 && (bool || bool_1581_)) {
	    int i_1591_ = 0;
	    int i_1592_ = 0;
	    int i_1593_ = anInt9002 + anInt9000 + anInt9004;
	    int i_1594_ = anInt9003 + anInt9001 + anInt9005;
	    int i_1595_ = (i_1593_ << 16) / i_1584_;
	    int i_1596_ = (i_1594_ << 16) / i_1585_;
	    if (anInt9002 > 0) {
		int i_1597_ = ((anInt9002 << 16) + i_1595_ - 1) / i_1595_;
		i += i_1597_;
		i_1591_ += i_1597_ * i_1595_ - (anInt9002 << 16);
	    }
	    if (anInt9003 > 0) {
		int i_1598_ = ((anInt9003 << 16) + i_1596_ - 1) / i_1596_;
		i_1583_ += i_1598_;
		i_1592_ += i_1598_ * i_1596_ - (anInt9003 << 16);
	    }
	    if (anInt9000 < i_1593_)
		i_1584_
		    = ((anInt9000 << 16) - i_1591_ + i_1595_ - 1) / i_1595_;
	    if (anInt9001 < i_1594_)
		i_1585_
		    = ((anInt9001 << 16) - i_1592_ + i_1596_ - 1) / i_1596_;
	    int i_1599_
		= i + i_1583_ * (aClass182_Sub2_9033.anInt9494 * -476035351);
	    int i_1600_ = aClass182_Sub2_9033.anInt9494 * -476035351 - i_1584_;
	    if (i_1583_ + i_1585_ > aClass182_Sub2_9033.anInt9473 * 1920901985)
		i_1585_ -= (i_1583_ + i_1585_
			    - aClass182_Sub2_9033.anInt9473 * 1920901985);
	    if (i_1583_ < aClass182_Sub2_9033.anInt9472 * 1722112305) {
		int i_1601_
		    = aClass182_Sub2_9033.anInt9472 * 1722112305 - i_1583_;
		i_1585_ -= i_1601_;
		i_1599_
		    += i_1601_ * (aClass182_Sub2_9033.anInt9494 * -476035351);
		i_1592_ += i_1596_ * i_1601_;
	    }
	    if (i + i_1584_ > aClass182_Sub2_9033.anInt9499 * -466178451) {
		int i_1602_
		    = i + i_1584_ - aClass182_Sub2_9033.anInt9499 * -466178451;
		i_1584_ -= i_1602_;
		i_1600_ += i_1602_;
	    }
	    if (i < aClass182_Sub2_9033.anInt9470 * 1988019027) {
		int i_1603_ = aClass182_Sub2_9033.anInt9470 * 1988019027 - i;
		i_1584_ -= i_1603_;
		i_1599_ += i_1603_;
		i_1591_ += i_1595_ * i_1603_;
		i_1600_ += i_1603_;
	    }
	    float[] fs = aClass182_Sub2_9033.aFloatArray9469;
	    int[] is = aClass182_Sub2_9033.anIntArray9466;
	    if (i_1588_ == 0) {
		if (i_1586_ == 1) {
		    int i_1604_ = i_1591_;
		    for (int i_1605_ = -i_1585_; i_1605_ < 0; i_1605_++) {
			int i_1606_ = (i_1592_ >> 16) * anInt9000;
			for (int i_1607_ = -i_1584_; i_1607_ < 0; i_1607_++) {
			    if (!bool_1581_ || f < fs[i_1599_]) {
				if (bool)
				    is[i_1599_]
					= (anIntArray11425
					   [(i_1591_ >> 16) + i_1606_]);
				if (bool_1581_ && bool_1590_)
				    fs[i_1599_] = f;
			    }
			    i_1591_ += i_1595_;
			    i_1599_++;
			}
			i_1592_ += i_1596_;
			i_1591_ = i_1604_;
			i_1599_ += i_1600_;
		    }
		} else if (i_1586_ == 0) {
		    int i_1608_ = (i_1587_ & 0xff0000) >> 16;
		    int i_1609_ = (i_1587_ & 0xff00) >> 8;
		    int i_1610_ = i_1587_ & 0xff;
		    int i_1611_ = i_1591_;
		    for (int i_1612_ = -i_1585_; i_1612_ < 0; i_1612_++) {
			int i_1613_ = (i_1592_ >> 16) * anInt9000;
			for (int i_1614_ = -i_1584_; i_1614_ < 0; i_1614_++) {
			    if (!bool_1581_ || f < fs[i_1599_]) {
				if (bool) {
				    int i_1615_
					= (anIntArray11425
					   [(i_1591_ >> 16) + i_1613_]);
				    int i_1616_
					= ((i_1615_ & 0xff0000) * i_1608_
					   & ~0xffffff);
				    int i_1617_ = ((i_1615_ & 0xff00) * i_1609_
						   & 0xff0000);
				    int i_1618_
					= (i_1615_ & 0xff) * i_1610_ & 0xff00;
				    is[i_1599_]
					= (i_1616_ | i_1617_ | i_1618_) >>> 8;
				}
				if (bool_1581_ && bool_1590_)
				    fs[i_1599_] = f;
			    }
			    i_1591_ += i_1595_;
			    i_1599_++;
			}
			i_1592_ += i_1596_;
			i_1591_ = i_1611_;
			i_1599_ += i_1600_;
		    }
		} else if (i_1586_ == 3) {
		    int i_1619_ = i_1591_;
		    for (int i_1620_ = -i_1585_; i_1620_ < 0; i_1620_++) {
			int i_1621_ = (i_1592_ >> 16) * anInt9000;
			for (int i_1622_ = -i_1584_; i_1622_ < 0; i_1622_++) {
			    if (!bool_1581_ || f < fs[i_1599_]) {
				if (bool) {
				    int i_1623_
					= (anIntArray11425
					   [(i_1591_ >> 16) + i_1621_]);
				    int i_1624_ = i_1623_ + i_1587_;
				    int i_1625_ = ((i_1623_ & 0xff00ff)
						   + (i_1587_ & 0xff00ff));
				    int i_1626_
					= ((i_1625_ & 0x1000100)
					   + (i_1624_ - i_1625_ & 0x10000));
				    is[i_1599_]
					= (i_1624_ - i_1626_
					   | i_1626_ - (i_1626_ >>> 8));
				}
				if (bool_1581_ && bool_1590_)
				    fs[i_1599_] = f;
			    }
			    i_1591_ += i_1595_;
			    i_1599_++;
			}
			i_1592_ += i_1596_;
			i_1591_ = i_1619_;
			i_1599_ += i_1600_;
		    }
		} else if (i_1586_ == 2) {
		    int i_1627_ = i_1587_ >>> 24;
		    int i_1628_ = 256 - i_1627_;
		    int i_1629_ = (i_1587_ & 0xff00ff) * i_1628_ & ~0xff00ff;
		    int i_1630_ = (i_1587_ & 0xff00) * i_1628_ & 0xff0000;
		    i_1587_ = (i_1629_ | i_1630_) >>> 8;
		    int i_1631_ = i_1591_;
		    for (int i_1632_ = -i_1585_; i_1632_ < 0; i_1632_++) {
			int i_1633_ = (i_1592_ >> 16) * anInt9000;
			for (int i_1634_ = -i_1584_; i_1634_ < 0; i_1634_++) {
			    if (!bool_1581_ || f < fs[i_1599_]) {
				if (bool) {
				    int i_1635_
					= (anIntArray11425
					   [(i_1591_ >> 16) + i_1633_]);
				    i_1629_ = ((i_1635_ & 0xff00ff) * i_1627_
					       & ~0xff00ff);
				    i_1630_ = ((i_1635_ & 0xff00) * i_1627_
					       & 0xff0000);
				    is[i_1599_] = (((i_1629_ | i_1630_) >>> 8)
						   + i_1587_);
				}
				if (bool_1581_ && bool_1590_)
				    fs[i_1599_] = f;
			    }
			    i_1591_ += i_1595_;
			    i_1599_++;
			}
			i_1592_ += i_1596_;
			i_1591_ = i_1631_;
			i_1599_ += i_1600_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_1588_ == 1) {
		if (i_1586_ == 1) {
		    int i_1636_ = i_1591_;
		    for (int i_1637_ = -i_1585_; i_1637_ < 0; i_1637_++) {
			int i_1638_ = (i_1592_ >> 16) * anInt9000;
			for (int i_1639_ = -i_1584_; i_1639_ < 0; i_1639_++) {
			    if (!bool_1581_ || f < fs[i_1599_]) {
				int i_1640_ = (anIntArray11425
					       [(i_1591_ >> 16) + i_1638_]);
				if (i_1640_ != 0) {
				    if (bool)
					is[i_1599_] = i_1640_;
				    if (bool_1581_ && bool_1590_)
					fs[i_1599_] = f;
				}
			    }
			    i_1591_ += i_1595_;
			    i_1599_++;
			}
			i_1592_ += i_1596_;
			i_1591_ = i_1636_;
			i_1599_ += i_1600_;
		    }
		} else if (i_1586_ == 0) {
		    int i_1641_ = i_1591_;
		    if ((i_1587_ & 0xffffff) == 16777215) {
			int i_1642_ = i_1587_ >>> 24;
			int i_1643_ = 256 - i_1642_;
			for (int i_1644_ = -i_1585_; i_1644_ < 0; i_1644_++) {
			    int i_1645_ = (i_1592_ >> 16) * anInt9000;
			    for (int i_1646_ = -i_1584_; i_1646_ < 0;
				 i_1646_++) {
				if (!bool_1581_ || f < fs[i_1599_]) {
				    int i_1647_
					= (anIntArray11425
					   [(i_1591_ >> 16) + i_1645_]);
				    if (i_1647_ != 0) {
					if (bool) {
					    int i_1648_ = is[i_1599_];
					    is[i_1599_]
						= (((((i_1647_ & 0xff00ff)
						      * i_1642_)
						     + ((i_1648_ & 0xff00ff)
							* i_1643_))
						    & ~0xff00ff)
						   + ((((i_1647_ & 0xff00)
							* i_1642_)
						       + ((i_1648_ & 0xff00)
							  * i_1643_))
						      & 0xff0000)) >> 8;
					}
					if (bool_1581_ && bool_1590_)
					    fs[i_1599_] = f;
				    }
				}
				i_1591_ += i_1595_;
				i_1599_++;
			    }
			    i_1592_ += i_1596_;
			    i_1591_ = i_1641_;
			    i_1599_ += i_1600_;
			}
		    } else {
			int i_1649_ = (i_1587_ & 0xff0000) >> 16;
			int i_1650_ = (i_1587_ & 0xff00) >> 8;
			int i_1651_ = i_1587_ & 0xff;
			int i_1652_ = i_1587_ >>> 24;
			int i_1653_ = 256 - i_1652_;
			for (int i_1654_ = -i_1585_; i_1654_ < 0; i_1654_++) {
			    int i_1655_ = (i_1592_ >> 16) * anInt9000;
			    for (int i_1656_ = -i_1584_; i_1656_ < 0;
				 i_1656_++) {
				if (!bool_1581_ || f < fs[i_1599_]) {
				    int i_1657_
					= (anIntArray11425
					   [(i_1591_ >> 16) + i_1655_]);
				    if (i_1657_ != 0) {
					if (i_1652_ != 255) {
					    if (bool) {
						int i_1658_
						    = (((i_1657_ & 0xff0000)
							* i_1649_)
						       & ~0xffffff);
						int i_1659_
						    = (((i_1657_ & 0xff00)
							* i_1650_)
						       & 0xff0000);
						int i_1660_
						    = (((i_1657_ & 0xff)
							* i_1651_)
						       & 0xff00);
						i_1657_ = (i_1658_ | i_1659_
							   | i_1660_) >>> 8;
						int i_1661_ = is[i_1599_];
						is[i_1599_]
						    = (((((i_1657_ & 0xff00ff)
							  * i_1652_)
							 + ((i_1661_
							     & 0xff00ff)
							    * i_1653_))
							& ~0xff00ff)
						       + ((((i_1657_ & 0xff00)
							    * i_1652_)
							   + ((i_1661_
							       & 0xff00)
							      * i_1653_))
							  & 0xff0000)) >> 8;
					    }
					    if (bool_1581_ && bool_1590_)
						fs[i_1599_] = f;
					} else {
					    if (bool) {
						int i_1662_
						    = (((i_1657_ & 0xff0000)
							* i_1649_)
						       & ~0xffffff);
						int i_1663_
						    = (((i_1657_ & 0xff00)
							* i_1650_)
						       & 0xff0000);
						int i_1664_
						    = (((i_1657_ & 0xff)
							* i_1651_)
						       & 0xff00);
						is[i_1599_]
						    = (i_1662_ | i_1663_
						       | i_1664_) >>> 8;
					    }
					    if (bool_1581_ && bool_1590_)
						fs[i_1599_] = f;
					}
				    }
				}
				i_1591_ += i_1595_;
				i_1599_++;
			    }
			    i_1592_ += i_1596_;
			    i_1591_ = i_1641_;
			    i_1599_ += i_1600_;
			}
		    }
		} else if (i_1586_ == 3) {
		    int i_1665_ = i_1591_;
		    int i_1666_ = i_1587_ >>> 24;
		    int i_1667_ = 256 - i_1666_;
		    for (int i_1668_ = -i_1585_; i_1668_ < 0; i_1668_++) {
			int i_1669_ = (i_1592_ >> 16) * anInt9000;
			for (int i_1670_ = -i_1584_; i_1670_ < 0; i_1670_++) {
			    if (!bool_1581_ || f < fs[i_1599_]) {
				if (bool) {
				    int i_1671_
					= (anIntArray11425
					   [(i_1591_ >> 16) + i_1669_]);
				    int i_1672_ = i_1671_ + i_1587_;
				    int i_1673_ = ((i_1671_ & 0xff00ff)
						   + (i_1587_ & 0xff00ff));
				    int i_1674_
					= ((i_1673_ & 0x1000100)
					   + (i_1672_ - i_1673_ & 0x10000));
				    i_1674_ = (i_1672_ - i_1674_
					       | i_1674_ - (i_1674_ >>> 8));
				    if (i_1671_ == 0 && i_1666_ != 255) {
					i_1671_ = i_1674_;
					i_1674_ = is[i_1599_];
					i_1674_
					    = ((((i_1671_ & 0xff00ff) * i_1666_
						 + ((i_1674_ & 0xff00ff)
						    * i_1667_))
						& ~0xff00ff)
					       + (((i_1671_ & 0xff00) * i_1666_
						   + ((i_1674_ & 0xff00)
						      * i_1667_))
						  & 0xff0000)) >> 8;
				    }
				    is[i_1599_] = i_1674_;
				}
				if (bool_1581_ && bool_1590_)
				    fs[i_1599_] = f;
			    }
			    i_1591_ += i_1595_;
			    i_1599_++;
			}
			i_1592_ += i_1596_;
			i_1591_ = i_1665_;
			i_1599_ += i_1600_;
		    }
		} else if (i_1586_ == 2) {
		    int i_1675_ = i_1587_ >>> 24;
		    int i_1676_ = 256 - i_1675_;
		    int i_1677_ = (i_1587_ & 0xff00ff) * i_1676_ & ~0xff00ff;
		    int i_1678_ = (i_1587_ & 0xff00) * i_1676_ & 0xff0000;
		    i_1587_ = (i_1677_ | i_1678_) >>> 8;
		    int i_1679_ = i_1591_;
		    for (int i_1680_ = -i_1585_; i_1680_ < 0; i_1680_++) {
			int i_1681_ = (i_1592_ >> 16) * anInt9000;
			for (int i_1682_ = -i_1584_; i_1682_ < 0; i_1682_++) {
			    if (!bool_1581_ || f < fs[i_1599_]) {
				int i_1683_ = (anIntArray11425
					       [(i_1591_ >> 16) + i_1681_]);
				if (i_1683_ != 0) {
				    if (bool) {
					i_1677_
					    = ((i_1683_ & 0xff00ff) * i_1675_
					       & ~0xff00ff);
					i_1678_ = ((i_1683_ & 0xff00) * i_1675_
						   & 0xff0000);
					is[i_1599_] = ((i_1677_ | i_1678_)
						       >>> 8) + i_1587_;
				    }
				    if (bool_1581_ && bool_1590_)
					fs[i_1599_] = f;
				}
			    }
			    i_1591_ += i_1595_;
			    i_1599_++;
			}
			i_1592_ += i_1596_;
			i_1591_ = i_1679_;
			i_1599_ += i_1600_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_1588_ == 2) {
		if (i_1586_ == 1) {
		    int i_1684_ = i_1591_;
		    for (int i_1685_ = -i_1585_; i_1685_ < 0; i_1685_++) {
			int i_1686_ = (i_1592_ >> 16) * anInt9000;
			for (int i_1687_ = -i_1584_; i_1687_ < 0; i_1687_++) {
			    if (!bool_1581_ || f < fs[i_1599_]) {
				int i_1688_ = (anIntArray11425
					       [(i_1591_ >> 16) + i_1686_]);
				if (i_1688_ != 0) {
				    if (bool) {
					int i_1689_ = is[i_1599_];
					int i_1690_ = i_1688_ + i_1689_;
					int i_1691_ = ((i_1688_ & 0xff00ff)
						       + (i_1689_ & 0xff00ff));
					i_1689_ = ((i_1691_ & 0x1000100)
						   + (i_1690_ - i_1691_
						      & 0x10000));
					is[i_1599_]
					    = (i_1690_ - i_1689_
					       | i_1689_ - (i_1689_ >>> 8));
				    }
				    if (bool_1581_ && bool_1590_)
					fs[i_1599_] = f;
				}
			    }
			    i_1591_ += i_1595_;
			    i_1599_++;
			}
			i_1592_ += i_1596_;
			i_1591_ = i_1684_;
			i_1599_ += i_1600_;
		    }
		} else if (i_1586_ == 0) {
		    int i_1692_ = i_1591_;
		    int i_1693_ = (i_1587_ & 0xff0000) >> 16;
		    int i_1694_ = (i_1587_ & 0xff00) >> 8;
		    int i_1695_ = i_1587_ & 0xff;
		    for (int i_1696_ = -i_1585_; i_1696_ < 0; i_1696_++) {
			int i_1697_ = (i_1592_ >> 16) * anInt9000;
			for (int i_1698_ = -i_1584_; i_1698_ < 0; i_1698_++) {
			    if (!bool_1581_ || f < fs[i_1599_]) {
				int i_1699_ = (anIntArray11425
					       [(i_1591_ >> 16) + i_1697_]);
				if (i_1699_ != 0) {
				    if (bool) {
					int i_1700_
					    = ((i_1699_ & 0xff0000) * i_1693_
					       & ~0xffffff);
					int i_1701_
					    = ((i_1699_ & 0xff00) * i_1694_
					       & 0xff0000);
					int i_1702_
					    = ((i_1699_ & 0xff) * i_1695_
					       & 0xff00);
					i_1699_ = (i_1700_ | i_1701_
						   | i_1702_) >>> 8;
					int i_1703_ = is[i_1599_];
					int i_1704_ = i_1699_ + i_1703_;
					int i_1705_ = ((i_1699_ & 0xff00ff)
						       + (i_1703_ & 0xff00ff));
					i_1703_ = ((i_1705_ & 0x1000100)
						   + (i_1704_ - i_1705_
						      & 0x10000));
					is[i_1599_]
					    = (i_1704_ - i_1703_
					       | i_1703_ - (i_1703_ >>> 8));
				    }
				    if (bool_1581_ && bool_1590_)
					fs[i_1599_] = f;
				}
			    }
			    i_1591_ += i_1595_;
			    i_1599_++;
			}
			i_1592_ += i_1596_;
			i_1591_ = i_1692_;
			i_1599_ += i_1600_;
		    }
		} else if (i_1586_ == 3) {
		    int i_1706_ = i_1591_;
		    for (int i_1707_ = -i_1585_; i_1707_ < 0; i_1707_++) {
			int i_1708_ = (i_1592_ >> 16) * anInt9000;
			for (int i_1709_ = -i_1584_; i_1709_ < 0; i_1709_++) {
			    if (!bool_1581_ || f < fs[i_1599_]) {
				if (bool) {
				    int i_1710_
					= (anIntArray11425
					   [(i_1591_ >> 16) + i_1708_]);
				    int i_1711_ = i_1710_ + i_1587_;
				    int i_1712_ = ((i_1710_ & 0xff00ff)
						   + (i_1587_ & 0xff00ff));
				    int i_1713_
					= ((i_1712_ & 0x1000100)
					   + (i_1711_ - i_1712_ & 0x10000));
				    i_1710_ = (i_1711_ - i_1713_
					       | i_1713_ - (i_1713_ >>> 8));
				    i_1713_ = is[i_1599_];
				    i_1711_ = i_1710_ + i_1713_;
				    i_1712_
					= (i_1710_ & 0xff00ff) + (i_1713_
								  & 0xff00ff);
				    i_1713_
					= ((i_1712_ & 0x1000100)
					   + (i_1711_ - i_1712_ & 0x10000));
				    is[i_1599_]
					= (i_1711_ - i_1713_
					   | i_1713_ - (i_1713_ >>> 8));
				}
				if (bool_1581_ && bool_1590_)
				    fs[i_1599_] = f;
			    }
			    i_1591_ += i_1595_;
			    i_1599_++;
			}
			i_1592_ += i_1596_;
			i_1591_ = i_1706_;
			i_1599_ += i_1600_;
		    }
		} else if (i_1586_ == 2) {
		    int i_1714_ = i_1587_ >>> 24;
		    int i_1715_ = 256 - i_1714_;
		    int i_1716_ = (i_1587_ & 0xff00ff) * i_1715_ & ~0xff00ff;
		    int i_1717_ = (i_1587_ & 0xff00) * i_1715_ & 0xff0000;
		    i_1587_ = (i_1716_ | i_1717_) >>> 8;
		    int i_1718_ = i_1591_;
		    for (int i_1719_ = -i_1585_; i_1719_ < 0; i_1719_++) {
			int i_1720_ = (i_1592_ >> 16) * anInt9000;
			for (int i_1721_ = -i_1584_; i_1721_ < 0; i_1721_++) {
			    if (!bool_1581_ || f < fs[i_1599_]) {
				int i_1722_ = (anIntArray11425
					       [(i_1591_ >> 16) + i_1720_]);
				if (i_1722_ != 0) {
				    if (bool) {
					i_1716_
					    = ((i_1722_ & 0xff00ff) * i_1714_
					       & ~0xff00ff);
					i_1717_ = ((i_1722_ & 0xff00) * i_1714_
						   & 0xff0000);
					i_1722_ = (((i_1716_ | i_1717_) >>> 8)
						   + i_1587_);
					int i_1723_ = is[i_1599_];
					int i_1724_ = i_1722_ + i_1723_;
					int i_1725_ = ((i_1722_ & 0xff00ff)
						       + (i_1723_ & 0xff00ff));
					i_1723_ = ((i_1725_ & 0x1000100)
						   + (i_1724_ - i_1725_
						      & 0x10000));
					is[i_1599_]
					    = (i_1724_ - i_1723_
					       | i_1723_ - (i_1723_ >>> 8));
				    }
				    if (bool_1581_ && bool_1590_)
					fs[i_1599_] = f;
				}
			    }
			    i_1591_ += i_1595_;
			    i_1599_++;
			}
			i_1592_ += i_1596_;
			i_1591_ = i_1718_;
			i_1599_ += i_1600_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    void method18021(int i, int i_1726_, int[] is, int i_1727_, int i_1728_) {
	if (i_1728_ == 0) {
	    if (i_1727_ == 1)
		is[i_1726_] = anIntArray11425[i];
	    else if (i_1727_ == 0) {
		int i_1729_ = anIntArray11425[i++];
		int i_1730_ = (i_1729_ & 0xff0000) * anInt9031 & ~0xffffff;
		int i_1731_ = (i_1729_ & 0xff00) * anInt9030 & 0xff0000;
		int i_1732_ = (i_1729_ & 0xff) * anInt9027 & 0xff00;
		is[i_1726_] = (i_1730_ | i_1731_ | i_1732_) >>> 8;
	    } else if (i_1727_ == 3) {
		int i_1733_ = anIntArray11425[i++];
		int i_1734_ = anInt9026;
		int i_1735_ = i_1733_ + i_1734_;
		int i_1736_ = (i_1733_ & 0xff00ff) + (i_1734_ & 0xff00ff);
		int i_1737_
		    = (i_1736_ & 0x1000100) + (i_1735_ - i_1736_ & 0x10000);
		is[i_1726_] = i_1735_ - i_1737_ | i_1737_ - (i_1737_ >>> 8);
	    } else if (i_1727_ == 2) {
		int i_1738_ = anIntArray11425[i];
		int i_1739_ = (i_1738_ & 0xff00ff) * anInt9007 & ~0xff00ff;
		int i_1740_ = (i_1738_ & 0xff00) * anInt9007 & 0xff0000;
		is[i_1726_] = ((i_1739_ | i_1740_) >>> 8) + anInt9034;
	    } else
		throw new IllegalArgumentException();
	} else if (i_1728_ == 1) {
	    if (i_1727_ == 1) {
		int i_1741_ = anIntArray11425[i];
		if (i_1741_ != 0)
		    is[i_1726_] = i_1741_;
	    } else if (i_1727_ == 0) {
		int i_1742_ = anIntArray11425[i];
		if (i_1742_ != 0) {
		    if ((anInt9026 & 0xffffff) == 16777215) {
			int i_1743_ = anInt9026 >>> 24;
			int i_1744_ = 256 - i_1743_;
			int i_1745_ = is[i_1726_];
			is[i_1726_] = ((((i_1742_ & 0xff00ff) * i_1743_
					 + (i_1745_ & 0xff00ff) * i_1744_)
					& ~0xff00ff)
				       + (((i_1742_ & 0xff00) * i_1743_
					   + (i_1745_ & 0xff00) * i_1744_)
					  & 0xff0000)) >> 8;
		    } else if (anInt9007 != 255) {
			int i_1746_
			    = (i_1742_ & 0xff0000) * anInt9031 & ~0xffffff;
			int i_1747_
			    = (i_1742_ & 0xff00) * anInt9030 & 0xff0000;
			int i_1748_ = (i_1742_ & 0xff) * anInt9027 & 0xff00;
			i_1742_ = (i_1746_ | i_1747_ | i_1748_) >>> 8;
			int i_1749_ = is[i_1726_];
			is[i_1726_] = ((((i_1742_ & 0xff00ff) * anInt9007
					 + (i_1749_ & 0xff00ff) * anInt9028)
					& ~0xff00ff)
				       + (((i_1742_ & 0xff00) * anInt9007
					   + (i_1749_ & 0xff00) * anInt9028)
					  & 0xff0000)) >> 8;
		    } else {
			int i_1750_
			    = (i_1742_ & 0xff0000) * anInt9031 & ~0xffffff;
			int i_1751_
			    = (i_1742_ & 0xff00) * anInt9030 & 0xff0000;
			int i_1752_ = (i_1742_ & 0xff) * anInt9027 & 0xff00;
			is[i_1726_] = (i_1750_ | i_1751_ | i_1752_) >>> 8;
		    }
		}
	    } else if (i_1727_ == 3) {
		int i_1753_ = anIntArray11425[i];
		int i_1754_ = anInt9026;
		int i_1755_ = i_1753_ + i_1754_;
		int i_1756_ = (i_1753_ & 0xff00ff) + (i_1754_ & 0xff00ff);
		int i_1757_
		    = (i_1756_ & 0x1000100) + (i_1755_ - i_1756_ & 0x10000);
		i_1757_ = i_1755_ - i_1757_ | i_1757_ - (i_1757_ >>> 8);
		if (i_1753_ == 0 && anInt9007 != 255) {
		    i_1753_ = i_1757_;
		    i_1757_ = is[i_1726_];
		    i_1757_ = ((((i_1753_ & 0xff00ff) * anInt9007
				 + (i_1757_ & 0xff00ff) * anInt9028)
				& ~0xff00ff)
			       + (((i_1753_ & 0xff00) * anInt9007
				   + (i_1757_ & 0xff00) * anInt9028)
				  & 0xff0000)) >> 8;
		}
		is[i_1726_] = i_1757_;
	    } else if (i_1727_ == 2) {
		int i_1758_ = anIntArray11425[i];
		if (i_1758_ != 0) {
		    int i_1759_ = (i_1758_ & 0xff00ff) * anInt9007 & ~0xff00ff;
		    int i_1760_ = (i_1758_ & 0xff00) * anInt9007 & 0xff0000;
		    is[i_1726_++] = ((i_1759_ | i_1760_) >>> 8) + anInt9034;
		}
	    } else
		throw new IllegalArgumentException();
	} else if (i_1728_ == 2) {
	    if (i_1727_ == 1) {
		int i_1761_ = anIntArray11425[i];
		if (i_1761_ != 0) {
		    int i_1762_ = is[i_1726_];
		    int i_1763_ = i_1761_ + i_1762_;
		    int i_1764_ = (i_1761_ & 0xff00ff) + (i_1762_ & 0xff00ff);
		    i_1762_ = (i_1764_ & 0x1000100) + (i_1763_ - i_1764_
						       & 0x10000);
		    is[i_1726_]
			= i_1763_ - i_1762_ | i_1762_ - (i_1762_ >>> 8);
		}
	    } else if (i_1727_ == 0) {
		int i_1765_ = anIntArray11425[i];
		if (i_1765_ != 0) {
		    int i_1766_ = (i_1765_ & 0xff0000) * anInt9031 & ~0xffffff;
		    int i_1767_ = (i_1765_ & 0xff00) * anInt9030 & 0xff0000;
		    int i_1768_ = (i_1765_ & 0xff) * anInt9027 & 0xff00;
		    i_1765_ = (i_1766_ | i_1767_ | i_1768_) >>> 8;
		    int i_1769_ = is[i_1726_];
		    int i_1770_ = i_1765_ + i_1769_;
		    int i_1771_ = (i_1765_ & 0xff00ff) + (i_1769_ & 0xff00ff);
		    i_1769_ = (i_1771_ & 0x1000100) + (i_1770_ - i_1771_
						       & 0x10000);
		    is[i_1726_]
			= i_1770_ - i_1769_ | i_1769_ - (i_1769_ >>> 8);
		}
	    } else if (i_1727_ == 3) {
		int i_1772_ = anIntArray11425[i];
		int i_1773_ = anInt9026;
		int i_1774_ = i_1772_ + i_1773_;
		int i_1775_ = (i_1772_ & 0xff00ff) + (i_1773_ & 0xff00ff);
		int i_1776_
		    = (i_1775_ & 0x1000100) + (i_1774_ - i_1775_ & 0x10000);
		i_1772_ = i_1774_ - i_1776_ | i_1776_ - (i_1776_ >>> 8);
		i_1776_ = is[i_1726_];
		i_1774_ = i_1772_ + i_1776_;
		i_1775_ = (i_1772_ & 0xff00ff) + (i_1776_ & 0xff00ff);
		i_1776_
		    = (i_1775_ & 0x1000100) + (i_1774_ - i_1775_ & 0x10000);
		is[i_1726_] = i_1774_ - i_1776_ | i_1776_ - (i_1776_ >>> 8);
	    } else if (i_1727_ == 2) {
		int i_1777_ = anIntArray11425[i];
		if (i_1777_ != 0) {
		    int i_1778_ = (i_1777_ & 0xff00ff) * anInt9007 & ~0xff00ff;
		    int i_1779_ = (i_1777_ & 0xff00) * anInt9007 & 0xff0000;
		    i_1777_ = ((i_1778_ | i_1779_) >>> 8) + anInt9034;
		    int i_1780_ = is[i_1726_];
		    int i_1781_ = i_1777_ + i_1780_;
		    int i_1782_ = (i_1777_ & 0xff00ff) + (i_1780_ & 0xff00ff);
		    i_1780_ = (i_1782_ & 0x1000100) + (i_1781_ - i_1782_
						       & 0x10000);
		    is[i_1726_]
			= i_1781_ - i_1780_ | i_1780_ - (i_1780_ >>> 8);
		}
	    }
	} else
	    throw new IllegalArgumentException();
    }
    
    void method14541(boolean bool, boolean bool_1783_, boolean bool_1784_,
		     int i, int i_1785_, float f, int i_1786_, int i_1787_,
		     int i_1788_, int i_1789_, int i_1790_, int i_1791_,
		     boolean bool_1792_) {
	if (i_1786_ > 0 && i_1787_ > 0 && (bool || bool_1783_)) {
	    int i_1793_ = 0;
	    int i_1794_ = 0;
	    int i_1795_ = anInt9002 + anInt9000 + anInt9004;
	    int i_1796_ = anInt9003 + anInt9001 + anInt9005;
	    int i_1797_ = (i_1795_ << 16) / i_1786_;
	    int i_1798_ = (i_1796_ << 16) / i_1787_;
	    if (anInt9002 > 0) {
		int i_1799_ = ((anInt9002 << 16) + i_1797_ - 1) / i_1797_;
		i += i_1799_;
		i_1793_ += i_1799_ * i_1797_ - (anInt9002 << 16);
	    }
	    if (anInt9003 > 0) {
		int i_1800_ = ((anInt9003 << 16) + i_1798_ - 1) / i_1798_;
		i_1785_ += i_1800_;
		i_1794_ += i_1800_ * i_1798_ - (anInt9003 << 16);
	    }
	    if (anInt9000 < i_1795_)
		i_1786_
		    = ((anInt9000 << 16) - i_1793_ + i_1797_ - 1) / i_1797_;
	    if (anInt9001 < i_1796_)
		i_1787_
		    = ((anInt9001 << 16) - i_1794_ + i_1798_ - 1) / i_1798_;
	    int i_1801_
		= i + i_1785_ * (aClass182_Sub2_9033.anInt9494 * -476035351);
	    int i_1802_ = aClass182_Sub2_9033.anInt9494 * -476035351 - i_1786_;
	    if (i_1785_ + i_1787_ > aClass182_Sub2_9033.anInt9473 * 1920901985)
		i_1787_ -= (i_1785_ + i_1787_
			    - aClass182_Sub2_9033.anInt9473 * 1920901985);
	    if (i_1785_ < aClass182_Sub2_9033.anInt9472 * 1722112305) {
		int i_1803_
		    = aClass182_Sub2_9033.anInt9472 * 1722112305 - i_1785_;
		i_1787_ -= i_1803_;
		i_1801_
		    += i_1803_ * (aClass182_Sub2_9033.anInt9494 * -476035351);
		i_1794_ += i_1798_ * i_1803_;
	    }
	    if (i + i_1786_ > aClass182_Sub2_9033.anInt9499 * -466178451) {
		int i_1804_
		    = i + i_1786_ - aClass182_Sub2_9033.anInt9499 * -466178451;
		i_1786_ -= i_1804_;
		i_1802_ += i_1804_;
	    }
	    if (i < aClass182_Sub2_9033.anInt9470 * 1988019027) {
		int i_1805_ = aClass182_Sub2_9033.anInt9470 * 1988019027 - i;
		i_1786_ -= i_1805_;
		i_1801_ += i_1805_;
		i_1793_ += i_1797_ * i_1805_;
		i_1802_ += i_1805_;
	    }
	    float[] fs = aClass182_Sub2_9033.aFloatArray9469;
	    int[] is = aClass182_Sub2_9033.anIntArray9466;
	    if (i_1790_ == 0) {
		if (i_1788_ == 1) {
		    int i_1806_ = i_1793_;
		    for (int i_1807_ = -i_1787_; i_1807_ < 0; i_1807_++) {
			int i_1808_ = (i_1794_ >> 16) * anInt9000;
			for (int i_1809_ = -i_1786_; i_1809_ < 0; i_1809_++) {
			    if (!bool_1783_ || f < fs[i_1801_]) {
				if (bool)
				    is[i_1801_]
					= (anIntArray11425
					   [(i_1793_ >> 16) + i_1808_]);
				if (bool_1783_ && bool_1792_)
				    fs[i_1801_] = f;
			    }
			    i_1793_ += i_1797_;
			    i_1801_++;
			}
			i_1794_ += i_1798_;
			i_1793_ = i_1806_;
			i_1801_ += i_1802_;
		    }
		} else if (i_1788_ == 0) {
		    int i_1810_ = (i_1789_ & 0xff0000) >> 16;
		    int i_1811_ = (i_1789_ & 0xff00) >> 8;
		    int i_1812_ = i_1789_ & 0xff;
		    int i_1813_ = i_1793_;
		    for (int i_1814_ = -i_1787_; i_1814_ < 0; i_1814_++) {
			int i_1815_ = (i_1794_ >> 16) * anInt9000;
			for (int i_1816_ = -i_1786_; i_1816_ < 0; i_1816_++) {
			    if (!bool_1783_ || f < fs[i_1801_]) {
				if (bool) {
				    int i_1817_
					= (anIntArray11425
					   [(i_1793_ >> 16) + i_1815_]);
				    int i_1818_
					= ((i_1817_ & 0xff0000) * i_1810_
					   & ~0xffffff);
				    int i_1819_ = ((i_1817_ & 0xff00) * i_1811_
						   & 0xff0000);
				    int i_1820_
					= (i_1817_ & 0xff) * i_1812_ & 0xff00;
				    is[i_1801_]
					= (i_1818_ | i_1819_ | i_1820_) >>> 8;
				}
				if (bool_1783_ && bool_1792_)
				    fs[i_1801_] = f;
			    }
			    i_1793_ += i_1797_;
			    i_1801_++;
			}
			i_1794_ += i_1798_;
			i_1793_ = i_1813_;
			i_1801_ += i_1802_;
		    }
		} else if (i_1788_ == 3) {
		    int i_1821_ = i_1793_;
		    for (int i_1822_ = -i_1787_; i_1822_ < 0; i_1822_++) {
			int i_1823_ = (i_1794_ >> 16) * anInt9000;
			for (int i_1824_ = -i_1786_; i_1824_ < 0; i_1824_++) {
			    if (!bool_1783_ || f < fs[i_1801_]) {
				if (bool) {
				    int i_1825_
					= (anIntArray11425
					   [(i_1793_ >> 16) + i_1823_]);
				    int i_1826_ = i_1825_ + i_1789_;
				    int i_1827_ = ((i_1825_ & 0xff00ff)
						   + (i_1789_ & 0xff00ff));
				    int i_1828_
					= ((i_1827_ & 0x1000100)
					   + (i_1826_ - i_1827_ & 0x10000));
				    is[i_1801_]
					= (i_1826_ - i_1828_
					   | i_1828_ - (i_1828_ >>> 8));
				}
				if (bool_1783_ && bool_1792_)
				    fs[i_1801_] = f;
			    }
			    i_1793_ += i_1797_;
			    i_1801_++;
			}
			i_1794_ += i_1798_;
			i_1793_ = i_1821_;
			i_1801_ += i_1802_;
		    }
		} else if (i_1788_ == 2) {
		    int i_1829_ = i_1789_ >>> 24;
		    int i_1830_ = 256 - i_1829_;
		    int i_1831_ = (i_1789_ & 0xff00ff) * i_1830_ & ~0xff00ff;
		    int i_1832_ = (i_1789_ & 0xff00) * i_1830_ & 0xff0000;
		    i_1789_ = (i_1831_ | i_1832_) >>> 8;
		    int i_1833_ = i_1793_;
		    for (int i_1834_ = -i_1787_; i_1834_ < 0; i_1834_++) {
			int i_1835_ = (i_1794_ >> 16) * anInt9000;
			for (int i_1836_ = -i_1786_; i_1836_ < 0; i_1836_++) {
			    if (!bool_1783_ || f < fs[i_1801_]) {
				if (bool) {
				    int i_1837_
					= (anIntArray11425
					   [(i_1793_ >> 16) + i_1835_]);
				    i_1831_ = ((i_1837_ & 0xff00ff) * i_1829_
					       & ~0xff00ff);
				    i_1832_ = ((i_1837_ & 0xff00) * i_1829_
					       & 0xff0000);
				    is[i_1801_] = (((i_1831_ | i_1832_) >>> 8)
						   + i_1789_);
				}
				if (bool_1783_ && bool_1792_)
				    fs[i_1801_] = f;
			    }
			    i_1793_ += i_1797_;
			    i_1801_++;
			}
			i_1794_ += i_1798_;
			i_1793_ = i_1833_;
			i_1801_ += i_1802_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_1790_ == 1) {
		if (i_1788_ == 1) {
		    int i_1838_ = i_1793_;
		    for (int i_1839_ = -i_1787_; i_1839_ < 0; i_1839_++) {
			int i_1840_ = (i_1794_ >> 16) * anInt9000;
			for (int i_1841_ = -i_1786_; i_1841_ < 0; i_1841_++) {
			    if (!bool_1783_ || f < fs[i_1801_]) {
				int i_1842_ = (anIntArray11425
					       [(i_1793_ >> 16) + i_1840_]);
				if (i_1842_ != 0) {
				    if (bool)
					is[i_1801_] = i_1842_;
				    if (bool_1783_ && bool_1792_)
					fs[i_1801_] = f;
				}
			    }
			    i_1793_ += i_1797_;
			    i_1801_++;
			}
			i_1794_ += i_1798_;
			i_1793_ = i_1838_;
			i_1801_ += i_1802_;
		    }
		} else if (i_1788_ == 0) {
		    int i_1843_ = i_1793_;
		    if ((i_1789_ & 0xffffff) == 16777215) {
			int i_1844_ = i_1789_ >>> 24;
			int i_1845_ = 256 - i_1844_;
			for (int i_1846_ = -i_1787_; i_1846_ < 0; i_1846_++) {
			    int i_1847_ = (i_1794_ >> 16) * anInt9000;
			    for (int i_1848_ = -i_1786_; i_1848_ < 0;
				 i_1848_++) {
				if (!bool_1783_ || f < fs[i_1801_]) {
				    int i_1849_
					= (anIntArray11425
					   [(i_1793_ >> 16) + i_1847_]);
				    if (i_1849_ != 0) {
					if (bool) {
					    int i_1850_ = is[i_1801_];
					    is[i_1801_]
						= (((((i_1849_ & 0xff00ff)
						      * i_1844_)
						     + ((i_1850_ & 0xff00ff)
							* i_1845_))
						    & ~0xff00ff)
						   + ((((i_1849_ & 0xff00)
							* i_1844_)
						       + ((i_1850_ & 0xff00)
							  * i_1845_))
						      & 0xff0000)) >> 8;
					}
					if (bool_1783_ && bool_1792_)
					    fs[i_1801_] = f;
				    }
				}
				i_1793_ += i_1797_;
				i_1801_++;
			    }
			    i_1794_ += i_1798_;
			    i_1793_ = i_1843_;
			    i_1801_ += i_1802_;
			}
		    } else {
			int i_1851_ = (i_1789_ & 0xff0000) >> 16;
			int i_1852_ = (i_1789_ & 0xff00) >> 8;
			int i_1853_ = i_1789_ & 0xff;
			int i_1854_ = i_1789_ >>> 24;
			int i_1855_ = 256 - i_1854_;
			for (int i_1856_ = -i_1787_; i_1856_ < 0; i_1856_++) {
			    int i_1857_ = (i_1794_ >> 16) * anInt9000;
			    for (int i_1858_ = -i_1786_; i_1858_ < 0;
				 i_1858_++) {
				if (!bool_1783_ || f < fs[i_1801_]) {
				    int i_1859_
					= (anIntArray11425
					   [(i_1793_ >> 16) + i_1857_]);
				    if (i_1859_ != 0) {
					if (i_1854_ != 255) {
					    if (bool) {
						int i_1860_
						    = (((i_1859_ & 0xff0000)
							* i_1851_)
						       & ~0xffffff);
						int i_1861_
						    = (((i_1859_ & 0xff00)
							* i_1852_)
						       & 0xff0000);
						int i_1862_
						    = (((i_1859_ & 0xff)
							* i_1853_)
						       & 0xff00);
						i_1859_ = (i_1860_ | i_1861_
							   | i_1862_) >>> 8;
						int i_1863_ = is[i_1801_];
						is[i_1801_]
						    = (((((i_1859_ & 0xff00ff)
							  * i_1854_)
							 + ((i_1863_
							     & 0xff00ff)
							    * i_1855_))
							& ~0xff00ff)
						       + ((((i_1859_ & 0xff00)
							    * i_1854_)
							   + ((i_1863_
							       & 0xff00)
							      * i_1855_))
							  & 0xff0000)) >> 8;
					    }
					    if (bool_1783_ && bool_1792_)
						fs[i_1801_] = f;
					} else {
					    if (bool) {
						int i_1864_
						    = (((i_1859_ & 0xff0000)
							* i_1851_)
						       & ~0xffffff);
						int i_1865_
						    = (((i_1859_ & 0xff00)
							* i_1852_)
						       & 0xff0000);
						int i_1866_
						    = (((i_1859_ & 0xff)
							* i_1853_)
						       & 0xff00);
						is[i_1801_]
						    = (i_1864_ | i_1865_
						       | i_1866_) >>> 8;
					    }
					    if (bool_1783_ && bool_1792_)
						fs[i_1801_] = f;
					}
				    }
				}
				i_1793_ += i_1797_;
				i_1801_++;
			    }
			    i_1794_ += i_1798_;
			    i_1793_ = i_1843_;
			    i_1801_ += i_1802_;
			}
		    }
		} else if (i_1788_ == 3) {
		    int i_1867_ = i_1793_;
		    int i_1868_ = i_1789_ >>> 24;
		    int i_1869_ = 256 - i_1868_;
		    for (int i_1870_ = -i_1787_; i_1870_ < 0; i_1870_++) {
			int i_1871_ = (i_1794_ >> 16) * anInt9000;
			for (int i_1872_ = -i_1786_; i_1872_ < 0; i_1872_++) {
			    if (!bool_1783_ || f < fs[i_1801_]) {
				if (bool) {
				    int i_1873_
					= (anIntArray11425
					   [(i_1793_ >> 16) + i_1871_]);
				    int i_1874_ = i_1873_ + i_1789_;
				    int i_1875_ = ((i_1873_ & 0xff00ff)
						   + (i_1789_ & 0xff00ff));
				    int i_1876_
					= ((i_1875_ & 0x1000100)
					   + (i_1874_ - i_1875_ & 0x10000));
				    i_1876_ = (i_1874_ - i_1876_
					       | i_1876_ - (i_1876_ >>> 8));
				    if (i_1873_ == 0 && i_1868_ != 255) {
					i_1873_ = i_1876_;
					i_1876_ = is[i_1801_];
					i_1876_
					    = ((((i_1873_ & 0xff00ff) * i_1868_
						 + ((i_1876_ & 0xff00ff)
						    * i_1869_))
						& ~0xff00ff)
					       + (((i_1873_ & 0xff00) * i_1868_
						   + ((i_1876_ & 0xff00)
						      * i_1869_))
						  & 0xff0000)) >> 8;
				    }
				    is[i_1801_] = i_1876_;
				}
				if (bool_1783_ && bool_1792_)
				    fs[i_1801_] = f;
			    }
			    i_1793_ += i_1797_;
			    i_1801_++;
			}
			i_1794_ += i_1798_;
			i_1793_ = i_1867_;
			i_1801_ += i_1802_;
		    }
		} else if (i_1788_ == 2) {
		    int i_1877_ = i_1789_ >>> 24;
		    int i_1878_ = 256 - i_1877_;
		    int i_1879_ = (i_1789_ & 0xff00ff) * i_1878_ & ~0xff00ff;
		    int i_1880_ = (i_1789_ & 0xff00) * i_1878_ & 0xff0000;
		    i_1789_ = (i_1879_ | i_1880_) >>> 8;
		    int i_1881_ = i_1793_;
		    for (int i_1882_ = -i_1787_; i_1882_ < 0; i_1882_++) {
			int i_1883_ = (i_1794_ >> 16) * anInt9000;
			for (int i_1884_ = -i_1786_; i_1884_ < 0; i_1884_++) {
			    if (!bool_1783_ || f < fs[i_1801_]) {
				int i_1885_ = (anIntArray11425
					       [(i_1793_ >> 16) + i_1883_]);
				if (i_1885_ != 0) {
				    if (bool) {
					i_1879_
					    = ((i_1885_ & 0xff00ff) * i_1877_
					       & ~0xff00ff);
					i_1880_ = ((i_1885_ & 0xff00) * i_1877_
						   & 0xff0000);
					is[i_1801_] = ((i_1879_ | i_1880_)
						       >>> 8) + i_1789_;
				    }
				    if (bool_1783_ && bool_1792_)
					fs[i_1801_] = f;
				}
			    }
			    i_1793_ += i_1797_;
			    i_1801_++;
			}
			i_1794_ += i_1798_;
			i_1793_ = i_1881_;
			i_1801_ += i_1802_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_1790_ == 2) {
		if (i_1788_ == 1) {
		    int i_1886_ = i_1793_;
		    for (int i_1887_ = -i_1787_; i_1887_ < 0; i_1887_++) {
			int i_1888_ = (i_1794_ >> 16) * anInt9000;
			for (int i_1889_ = -i_1786_; i_1889_ < 0; i_1889_++) {
			    if (!bool_1783_ || f < fs[i_1801_]) {
				int i_1890_ = (anIntArray11425
					       [(i_1793_ >> 16) + i_1888_]);
				if (i_1890_ != 0) {
				    if (bool) {
					int i_1891_ = is[i_1801_];
					int i_1892_ = i_1890_ + i_1891_;
					int i_1893_ = ((i_1890_ & 0xff00ff)
						       + (i_1891_ & 0xff00ff));
					i_1891_ = ((i_1893_ & 0x1000100)
						   + (i_1892_ - i_1893_
						      & 0x10000));
					is[i_1801_]
					    = (i_1892_ - i_1891_
					       | i_1891_ - (i_1891_ >>> 8));
				    }
				    if (bool_1783_ && bool_1792_)
					fs[i_1801_] = f;
				}
			    }
			    i_1793_ += i_1797_;
			    i_1801_++;
			}
			i_1794_ += i_1798_;
			i_1793_ = i_1886_;
			i_1801_ += i_1802_;
		    }
		} else if (i_1788_ == 0) {
		    int i_1894_ = i_1793_;
		    int i_1895_ = (i_1789_ & 0xff0000) >> 16;
		    int i_1896_ = (i_1789_ & 0xff00) >> 8;
		    int i_1897_ = i_1789_ & 0xff;
		    for (int i_1898_ = -i_1787_; i_1898_ < 0; i_1898_++) {
			int i_1899_ = (i_1794_ >> 16) * anInt9000;
			for (int i_1900_ = -i_1786_; i_1900_ < 0; i_1900_++) {
			    if (!bool_1783_ || f < fs[i_1801_]) {
				int i_1901_ = (anIntArray11425
					       [(i_1793_ >> 16) + i_1899_]);
				if (i_1901_ != 0) {
				    if (bool) {
					int i_1902_
					    = ((i_1901_ & 0xff0000) * i_1895_
					       & ~0xffffff);
					int i_1903_
					    = ((i_1901_ & 0xff00) * i_1896_
					       & 0xff0000);
					int i_1904_
					    = ((i_1901_ & 0xff) * i_1897_
					       & 0xff00);
					i_1901_ = (i_1902_ | i_1903_
						   | i_1904_) >>> 8;
					int i_1905_ = is[i_1801_];
					int i_1906_ = i_1901_ + i_1905_;
					int i_1907_ = ((i_1901_ & 0xff00ff)
						       + (i_1905_ & 0xff00ff));
					i_1905_ = ((i_1907_ & 0x1000100)
						   + (i_1906_ - i_1907_
						      & 0x10000));
					is[i_1801_]
					    = (i_1906_ - i_1905_
					       | i_1905_ - (i_1905_ >>> 8));
				    }
				    if (bool_1783_ && bool_1792_)
					fs[i_1801_] = f;
				}
			    }
			    i_1793_ += i_1797_;
			    i_1801_++;
			}
			i_1794_ += i_1798_;
			i_1793_ = i_1894_;
			i_1801_ += i_1802_;
		    }
		} else if (i_1788_ == 3) {
		    int i_1908_ = i_1793_;
		    for (int i_1909_ = -i_1787_; i_1909_ < 0; i_1909_++) {
			int i_1910_ = (i_1794_ >> 16) * anInt9000;
			for (int i_1911_ = -i_1786_; i_1911_ < 0; i_1911_++) {
			    if (!bool_1783_ || f < fs[i_1801_]) {
				if (bool) {
				    int i_1912_
					= (anIntArray11425
					   [(i_1793_ >> 16) + i_1910_]);
				    int i_1913_ = i_1912_ + i_1789_;
				    int i_1914_ = ((i_1912_ & 0xff00ff)
						   + (i_1789_ & 0xff00ff));
				    int i_1915_
					= ((i_1914_ & 0x1000100)
					   + (i_1913_ - i_1914_ & 0x10000));
				    i_1912_ = (i_1913_ - i_1915_
					       | i_1915_ - (i_1915_ >>> 8));
				    i_1915_ = is[i_1801_];
				    i_1913_ = i_1912_ + i_1915_;
				    i_1914_
					= (i_1912_ & 0xff00ff) + (i_1915_
								  & 0xff00ff);
				    i_1915_
					= ((i_1914_ & 0x1000100)
					   + (i_1913_ - i_1914_ & 0x10000));
				    is[i_1801_]
					= (i_1913_ - i_1915_
					   | i_1915_ - (i_1915_ >>> 8));
				}
				if (bool_1783_ && bool_1792_)
				    fs[i_1801_] = f;
			    }
			    i_1793_ += i_1797_;
			    i_1801_++;
			}
			i_1794_ += i_1798_;
			i_1793_ = i_1908_;
			i_1801_ += i_1802_;
		    }
		} else if (i_1788_ == 2) {
		    int i_1916_ = i_1789_ >>> 24;
		    int i_1917_ = 256 - i_1916_;
		    int i_1918_ = (i_1789_ & 0xff00ff) * i_1917_ & ~0xff00ff;
		    int i_1919_ = (i_1789_ & 0xff00) * i_1917_ & 0xff0000;
		    i_1789_ = (i_1918_ | i_1919_) >>> 8;
		    int i_1920_ = i_1793_;
		    for (int i_1921_ = -i_1787_; i_1921_ < 0; i_1921_++) {
			int i_1922_ = (i_1794_ >> 16) * anInt9000;
			for (int i_1923_ = -i_1786_; i_1923_ < 0; i_1923_++) {
			    if (!bool_1783_ || f < fs[i_1801_]) {
				int i_1924_ = (anIntArray11425
					       [(i_1793_ >> 16) + i_1922_]);
				if (i_1924_ != 0) {
				    if (bool) {
					i_1918_
					    = ((i_1924_ & 0xff00ff) * i_1916_
					       & ~0xff00ff);
					i_1919_ = ((i_1924_ & 0xff00) * i_1916_
						   & 0xff0000);
					i_1924_ = (((i_1918_ | i_1919_) >>> 8)
						   + i_1789_);
					int i_1925_ = is[i_1801_];
					int i_1926_ = i_1924_ + i_1925_;
					int i_1927_ = ((i_1924_ & 0xff00ff)
						       + (i_1925_ & 0xff00ff));
					i_1925_ = ((i_1927_ & 0x1000100)
						   + (i_1926_ - i_1927_
						      & 0x10000));
					is[i_1801_]
					    = (i_1926_ - i_1925_
					       | i_1925_ - (i_1925_ >>> 8));
				    }
				    if (bool_1783_ && bool_1792_)
					fs[i_1801_] = f;
				}
			    }
			    i_1793_ += i_1797_;
			    i_1801_++;
			}
			i_1794_ += i_1798_;
			i_1793_ = i_1920_;
			i_1801_ += i_1802_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    Class157_Sub1_Sub2(Class182_Sub2 class182_sub2, int i, int i_1928_) {
	super(class182_sub2, i, i_1928_);
	anIntArray11425 = new int[i * i_1928_];
    }
    
    void method18022(int i, int i_1929_, int[] is, int i_1930_, int i_1931_) {
	if (i_1931_ == 0) {
	    if (i_1930_ == 1)
		is[i_1929_] = anIntArray11425[i];
	    else if (i_1930_ == 0) {
		int i_1932_ = anIntArray11425[i++];
		int i_1933_ = (i_1932_ & 0xff0000) * anInt9031 & ~0xffffff;
		int i_1934_ = (i_1932_ & 0xff00) * anInt9030 & 0xff0000;
		int i_1935_ = (i_1932_ & 0xff) * anInt9027 & 0xff00;
		is[i_1929_] = (i_1933_ | i_1934_ | i_1935_) >>> 8;
	    } else if (i_1930_ == 3) {
		int i_1936_ = anIntArray11425[i++];
		int i_1937_ = anInt9026;
		int i_1938_ = i_1936_ + i_1937_;
		int i_1939_ = (i_1936_ & 0xff00ff) + (i_1937_ & 0xff00ff);
		int i_1940_
		    = (i_1939_ & 0x1000100) + (i_1938_ - i_1939_ & 0x10000);
		is[i_1929_] = i_1938_ - i_1940_ | i_1940_ - (i_1940_ >>> 8);
	    } else if (i_1930_ == 2) {
		int i_1941_ = anIntArray11425[i];
		int i_1942_ = (i_1941_ & 0xff00ff) * anInt9007 & ~0xff00ff;
		int i_1943_ = (i_1941_ & 0xff00) * anInt9007 & 0xff0000;
		is[i_1929_] = ((i_1942_ | i_1943_) >>> 8) + anInt9034;
	    } else
		throw new IllegalArgumentException();
	} else if (i_1931_ == 1) {
	    if (i_1930_ == 1) {
		int i_1944_ = anIntArray11425[i];
		if (i_1944_ != 0)
		    is[i_1929_] = i_1944_;
	    } else if (i_1930_ == 0) {
		int i_1945_ = anIntArray11425[i];
		if (i_1945_ != 0) {
		    if ((anInt9026 & 0xffffff) == 16777215) {
			int i_1946_ = anInt9026 >>> 24;
			int i_1947_ = 256 - i_1946_;
			int i_1948_ = is[i_1929_];
			is[i_1929_] = ((((i_1945_ & 0xff00ff) * i_1946_
					 + (i_1948_ & 0xff00ff) * i_1947_)
					& ~0xff00ff)
				       + (((i_1945_ & 0xff00) * i_1946_
					   + (i_1948_ & 0xff00) * i_1947_)
					  & 0xff0000)) >> 8;
		    } else if (anInt9007 != 255) {
			int i_1949_
			    = (i_1945_ & 0xff0000) * anInt9031 & ~0xffffff;
			int i_1950_
			    = (i_1945_ & 0xff00) * anInt9030 & 0xff0000;
			int i_1951_ = (i_1945_ & 0xff) * anInt9027 & 0xff00;
			i_1945_ = (i_1949_ | i_1950_ | i_1951_) >>> 8;
			int i_1952_ = is[i_1929_];
			is[i_1929_] = ((((i_1945_ & 0xff00ff) * anInt9007
					 + (i_1952_ & 0xff00ff) * anInt9028)
					& ~0xff00ff)
				       + (((i_1945_ & 0xff00) * anInt9007
					   + (i_1952_ & 0xff00) * anInt9028)
					  & 0xff0000)) >> 8;
		    } else {
			int i_1953_
			    = (i_1945_ & 0xff0000) * anInt9031 & ~0xffffff;
			int i_1954_
			    = (i_1945_ & 0xff00) * anInt9030 & 0xff0000;
			int i_1955_ = (i_1945_ & 0xff) * anInt9027 & 0xff00;
			is[i_1929_] = (i_1953_ | i_1954_ | i_1955_) >>> 8;
		    }
		}
	    } else if (i_1930_ == 3) {
		int i_1956_ = anIntArray11425[i];
		int i_1957_ = anInt9026;
		int i_1958_ = i_1956_ + i_1957_;
		int i_1959_ = (i_1956_ & 0xff00ff) + (i_1957_ & 0xff00ff);
		int i_1960_
		    = (i_1959_ & 0x1000100) + (i_1958_ - i_1959_ & 0x10000);
		i_1960_ = i_1958_ - i_1960_ | i_1960_ - (i_1960_ >>> 8);
		if (i_1956_ == 0 && anInt9007 != 255) {
		    i_1956_ = i_1960_;
		    i_1960_ = is[i_1929_];
		    i_1960_ = ((((i_1956_ & 0xff00ff) * anInt9007
				 + (i_1960_ & 0xff00ff) * anInt9028)
				& ~0xff00ff)
			       + (((i_1956_ & 0xff00) * anInt9007
				   + (i_1960_ & 0xff00) * anInt9028)
				  & 0xff0000)) >> 8;
		}
		is[i_1929_] = i_1960_;
	    } else if (i_1930_ == 2) {
		int i_1961_ = anIntArray11425[i];
		if (i_1961_ != 0) {
		    int i_1962_ = (i_1961_ & 0xff00ff) * anInt9007 & ~0xff00ff;
		    int i_1963_ = (i_1961_ & 0xff00) * anInt9007 & 0xff0000;
		    is[i_1929_++] = ((i_1962_ | i_1963_) >>> 8) + anInt9034;
		}
	    } else
		throw new IllegalArgumentException();
	} else if (i_1931_ == 2) {
	    if (i_1930_ == 1) {
		int i_1964_ = anIntArray11425[i];
		if (i_1964_ != 0) {
		    int i_1965_ = is[i_1929_];
		    int i_1966_ = i_1964_ + i_1965_;
		    int i_1967_ = (i_1964_ & 0xff00ff) + (i_1965_ & 0xff00ff);
		    i_1965_ = (i_1967_ & 0x1000100) + (i_1966_ - i_1967_
						       & 0x10000);
		    is[i_1929_]
			= i_1966_ - i_1965_ | i_1965_ - (i_1965_ >>> 8);
		}
	    } else if (i_1930_ == 0) {
		int i_1968_ = anIntArray11425[i];
		if (i_1968_ != 0) {
		    int i_1969_ = (i_1968_ & 0xff0000) * anInt9031 & ~0xffffff;
		    int i_1970_ = (i_1968_ & 0xff00) * anInt9030 & 0xff0000;
		    int i_1971_ = (i_1968_ & 0xff) * anInt9027 & 0xff00;
		    i_1968_ = (i_1969_ | i_1970_ | i_1971_) >>> 8;
		    int i_1972_ = is[i_1929_];
		    int i_1973_ = i_1968_ + i_1972_;
		    int i_1974_ = (i_1968_ & 0xff00ff) + (i_1972_ & 0xff00ff);
		    i_1972_ = (i_1974_ & 0x1000100) + (i_1973_ - i_1974_
						       & 0x10000);
		    is[i_1929_]
			= i_1973_ - i_1972_ | i_1972_ - (i_1972_ >>> 8);
		}
	    } else if (i_1930_ == 3) {
		int i_1975_ = anIntArray11425[i];
		int i_1976_ = anInt9026;
		int i_1977_ = i_1975_ + i_1976_;
		int i_1978_ = (i_1975_ & 0xff00ff) + (i_1976_ & 0xff00ff);
		int i_1979_
		    = (i_1978_ & 0x1000100) + (i_1977_ - i_1978_ & 0x10000);
		i_1975_ = i_1977_ - i_1979_ | i_1979_ - (i_1979_ >>> 8);
		i_1979_ = is[i_1929_];
		i_1977_ = i_1975_ + i_1979_;
		i_1978_ = (i_1975_ & 0xff00ff) + (i_1979_ & 0xff00ff);
		i_1979_
		    = (i_1978_ & 0x1000100) + (i_1977_ - i_1978_ & 0x10000);
		is[i_1929_] = i_1977_ - i_1979_ | i_1979_ - (i_1979_ >>> 8);
	    } else if (i_1930_ == 2) {
		int i_1980_ = anIntArray11425[i];
		if (i_1980_ != 0) {
		    int i_1981_ = (i_1980_ & 0xff00ff) * anInt9007 & ~0xff00ff;
		    int i_1982_ = (i_1980_ & 0xff00) * anInt9007 & 0xff0000;
		    i_1980_ = ((i_1981_ | i_1982_) >>> 8) + anInt9034;
		    int i_1983_ = is[i_1929_];
		    int i_1984_ = i_1980_ + i_1983_;
		    int i_1985_ = (i_1980_ & 0xff00ff) + (i_1983_ & 0xff00ff);
		    i_1983_ = (i_1985_ & 0x1000100) + (i_1984_ - i_1985_
						       & 0x10000);
		    is[i_1929_]
			= i_1984_ - i_1983_ | i_1983_ - (i_1983_ >>> 8);
		}
	    }
	} else
	    throw new IllegalArgumentException();
    }
    
    void method18023(int i, int i_1986_, int[] is, int i_1987_, int i_1988_) {
	if (i_1988_ == 0) {
	    if (i_1987_ == 1)
		is[i_1986_] = anIntArray11425[i];
	    else if (i_1987_ == 0) {
		int i_1989_ = anIntArray11425[i++];
		int i_1990_ = (i_1989_ & 0xff0000) * anInt9031 & ~0xffffff;
		int i_1991_ = (i_1989_ & 0xff00) * anInt9030 & 0xff0000;
		int i_1992_ = (i_1989_ & 0xff) * anInt9027 & 0xff00;
		is[i_1986_] = (i_1990_ | i_1991_ | i_1992_) >>> 8;
	    } else if (i_1987_ == 3) {
		int i_1993_ = anIntArray11425[i++];
		int i_1994_ = anInt9026;
		int i_1995_ = i_1993_ + i_1994_;
		int i_1996_ = (i_1993_ & 0xff00ff) + (i_1994_ & 0xff00ff);
		int i_1997_
		    = (i_1996_ & 0x1000100) + (i_1995_ - i_1996_ & 0x10000);
		is[i_1986_] = i_1995_ - i_1997_ | i_1997_ - (i_1997_ >>> 8);
	    } else if (i_1987_ == 2) {
		int i_1998_ = anIntArray11425[i];
		int i_1999_ = (i_1998_ & 0xff00ff) * anInt9007 & ~0xff00ff;
		int i_2000_ = (i_1998_ & 0xff00) * anInt9007 & 0xff0000;
		is[i_1986_] = ((i_1999_ | i_2000_) >>> 8) + anInt9034;
	    } else
		throw new IllegalArgumentException();
	} else if (i_1988_ == 1) {
	    if (i_1987_ == 1) {
		int i_2001_ = anIntArray11425[i];
		if (i_2001_ != 0)
		    is[i_1986_] = i_2001_;
	    } else if (i_1987_ == 0) {
		int i_2002_ = anIntArray11425[i];
		if (i_2002_ != 0) {
		    if ((anInt9026 & 0xffffff) == 16777215) {
			int i_2003_ = anInt9026 >>> 24;
			int i_2004_ = 256 - i_2003_;
			int i_2005_ = is[i_1986_];
			is[i_1986_] = ((((i_2002_ & 0xff00ff) * i_2003_
					 + (i_2005_ & 0xff00ff) * i_2004_)
					& ~0xff00ff)
				       + (((i_2002_ & 0xff00) * i_2003_
					   + (i_2005_ & 0xff00) * i_2004_)
					  & 0xff0000)) >> 8;
		    } else if (anInt9007 != 255) {
			int i_2006_
			    = (i_2002_ & 0xff0000) * anInt9031 & ~0xffffff;
			int i_2007_
			    = (i_2002_ & 0xff00) * anInt9030 & 0xff0000;
			int i_2008_ = (i_2002_ & 0xff) * anInt9027 & 0xff00;
			i_2002_ = (i_2006_ | i_2007_ | i_2008_) >>> 8;
			int i_2009_ = is[i_1986_];
			is[i_1986_] = ((((i_2002_ & 0xff00ff) * anInt9007
					 + (i_2009_ & 0xff00ff) * anInt9028)
					& ~0xff00ff)
				       + (((i_2002_ & 0xff00) * anInt9007
					   + (i_2009_ & 0xff00) * anInt9028)
					  & 0xff0000)) >> 8;
		    } else {
			int i_2010_
			    = (i_2002_ & 0xff0000) * anInt9031 & ~0xffffff;
			int i_2011_
			    = (i_2002_ & 0xff00) * anInt9030 & 0xff0000;
			int i_2012_ = (i_2002_ & 0xff) * anInt9027 & 0xff00;
			is[i_1986_] = (i_2010_ | i_2011_ | i_2012_) >>> 8;
		    }
		}
	    } else if (i_1987_ == 3) {
		int i_2013_ = anIntArray11425[i];
		int i_2014_ = anInt9026;
		int i_2015_ = i_2013_ + i_2014_;
		int i_2016_ = (i_2013_ & 0xff00ff) + (i_2014_ & 0xff00ff);
		int i_2017_
		    = (i_2016_ & 0x1000100) + (i_2015_ - i_2016_ & 0x10000);
		i_2017_ = i_2015_ - i_2017_ | i_2017_ - (i_2017_ >>> 8);
		if (i_2013_ == 0 && anInt9007 != 255) {
		    i_2013_ = i_2017_;
		    i_2017_ = is[i_1986_];
		    i_2017_ = ((((i_2013_ & 0xff00ff) * anInt9007
				 + (i_2017_ & 0xff00ff) * anInt9028)
				& ~0xff00ff)
			       + (((i_2013_ & 0xff00) * anInt9007
				   + (i_2017_ & 0xff00) * anInt9028)
				  & 0xff0000)) >> 8;
		}
		is[i_1986_] = i_2017_;
	    } else if (i_1987_ == 2) {
		int i_2018_ = anIntArray11425[i];
		if (i_2018_ != 0) {
		    int i_2019_ = (i_2018_ & 0xff00ff) * anInt9007 & ~0xff00ff;
		    int i_2020_ = (i_2018_ & 0xff00) * anInt9007 & 0xff0000;
		    is[i_1986_++] = ((i_2019_ | i_2020_) >>> 8) + anInt9034;
		}
	    } else
		throw new IllegalArgumentException();
	} else if (i_1988_ == 2) {
	    if (i_1987_ == 1) {
		int i_2021_ = anIntArray11425[i];
		if (i_2021_ != 0) {
		    int i_2022_ = is[i_1986_];
		    int i_2023_ = i_2021_ + i_2022_;
		    int i_2024_ = (i_2021_ & 0xff00ff) + (i_2022_ & 0xff00ff);
		    i_2022_ = (i_2024_ & 0x1000100) + (i_2023_ - i_2024_
						       & 0x10000);
		    is[i_1986_]
			= i_2023_ - i_2022_ | i_2022_ - (i_2022_ >>> 8);
		}
	    } else if (i_1987_ == 0) {
		int i_2025_ = anIntArray11425[i];
		if (i_2025_ != 0) {
		    int i_2026_ = (i_2025_ & 0xff0000) * anInt9031 & ~0xffffff;
		    int i_2027_ = (i_2025_ & 0xff00) * anInt9030 & 0xff0000;
		    int i_2028_ = (i_2025_ & 0xff) * anInt9027 & 0xff00;
		    i_2025_ = (i_2026_ | i_2027_ | i_2028_) >>> 8;
		    int i_2029_ = is[i_1986_];
		    int i_2030_ = i_2025_ + i_2029_;
		    int i_2031_ = (i_2025_ & 0xff00ff) + (i_2029_ & 0xff00ff);
		    i_2029_ = (i_2031_ & 0x1000100) + (i_2030_ - i_2031_
						       & 0x10000);
		    is[i_1986_]
			= i_2030_ - i_2029_ | i_2029_ - (i_2029_ >>> 8);
		}
	    } else if (i_1987_ == 3) {
		int i_2032_ = anIntArray11425[i];
		int i_2033_ = anInt9026;
		int i_2034_ = i_2032_ + i_2033_;
		int i_2035_ = (i_2032_ & 0xff00ff) + (i_2033_ & 0xff00ff);
		int i_2036_
		    = (i_2035_ & 0x1000100) + (i_2034_ - i_2035_ & 0x10000);
		i_2032_ = i_2034_ - i_2036_ | i_2036_ - (i_2036_ >>> 8);
		i_2036_ = is[i_1986_];
		i_2034_ = i_2032_ + i_2036_;
		i_2035_ = (i_2032_ & 0xff00ff) + (i_2036_ & 0xff00ff);
		i_2036_
		    = (i_2035_ & 0x1000100) + (i_2034_ - i_2035_ & 0x10000);
		is[i_1986_] = i_2034_ - i_2036_ | i_2036_ - (i_2036_ >>> 8);
	    } else if (i_1987_ == 2) {
		int i_2037_ = anIntArray11425[i];
		if (i_2037_ != 0) {
		    int i_2038_ = (i_2037_ & 0xff00ff) * anInt9007 & ~0xff00ff;
		    int i_2039_ = (i_2037_ & 0xff00) * anInt9007 & 0xff0000;
		    i_2037_ = ((i_2038_ | i_2039_) >>> 8) + anInt9034;
		    int i_2040_ = is[i_1986_];
		    int i_2041_ = i_2037_ + i_2040_;
		    int i_2042_ = (i_2037_ & 0xff00ff) + (i_2040_ & 0xff00ff);
		    i_2040_ = (i_2042_ & 0x1000100) + (i_2041_ - i_2042_
						       & 0x10000);
		    is[i_1986_]
			= i_2041_ - i_2040_ | i_2040_ - (i_2040_ >>> 8);
		}
	    }
	} else
	    throw new IllegalArgumentException();
    }
    
    public Interface21 method2502() {
	return new Class97(anInt9000, anInt9001, anIntArray11425);
    }
    
    public void method2514(int i, int i_2043_, int i_2044_, int i_2045_,
			   int[] is, int[] is_2046_, int i_2047_,
			   int i_2048_) {
	method18018(i, i_2043_, i_2044_, i_2045_, is, i_2047_, i_2048_);
    }
    
    public void method2500(int i, int i_2049_, int i_2050_, int i_2051_,
			   int[] is, int[] is_2052_, int i_2053_,
			   int i_2054_) {
	method18018(i, i_2049_, i_2050_, i_2051_, is, i_2053_, i_2054_);
    }
    
    public void method2513(int i, int i_2055_, Class152 class152, int i_2056_,
			   int i_2057_) {
	if (aClass182_Sub2_9033.method15226())
	    throw new IllegalStateException();
	int[] is = aClass182_Sub2_9033.anIntArray9466;
	if (is != null) {
	    i += anInt9002;
	    i_2055_ += anInt9003;
	    int i_2058_ = 0;
	    int i_2059_ = aClass182_Sub2_9033.anInt9494 * -476035351;
	    int i_2060_ = anInt9000;
	    int i_2061_ = anInt9001;
	    int i_2062_ = i_2059_ - i_2060_;
	    int i_2063_ = 0;
	    int i_2064_ = i + i_2055_ * i_2059_;
	    if (i_2055_ < aClass182_Sub2_9033.anInt9472 * 1722112305) {
		int i_2065_
		    = aClass182_Sub2_9033.anInt9472 * 1722112305 - i_2055_;
		i_2061_ -= i_2065_;
		i_2055_ = aClass182_Sub2_9033.anInt9472 * 1722112305;
		i_2058_ += i_2065_ * i_2060_;
		i_2064_ += i_2065_ * i_2059_;
	    }
	    if (i_2055_ + i_2061_ > aClass182_Sub2_9033.anInt9473 * 1920901985)
		i_2061_ -= (i_2055_ + i_2061_
			    - aClass182_Sub2_9033.anInt9473 * 1920901985);
	    if (i < aClass182_Sub2_9033.anInt9470 * 1988019027) {
		int i_2066_ = aClass182_Sub2_9033.anInt9470 * 1988019027 - i;
		i_2060_ -= i_2066_;
		i = aClass182_Sub2_9033.anInt9470 * 1988019027;
		i_2058_ += i_2066_;
		i_2064_ += i_2066_;
		i_2063_ += i_2066_;
		i_2062_ += i_2066_;
	    }
	    if (i + i_2060_ > aClass182_Sub2_9033.anInt9499 * -466178451) {
		int i_2067_
		    = i + i_2060_ - aClass182_Sub2_9033.anInt9499 * -466178451;
		i_2060_ -= i_2067_;
		i_2063_ += i_2067_;
		i_2062_ += i_2067_;
	    }
	    if (i_2060_ > 0 && i_2061_ > 0) {
		Class152_Sub1 class152_sub1 = (Class152_Sub1) class152;
		int[] is_2068_ = class152_sub1.anIntArray8998;
		int[] is_2069_ = class152_sub1.anIntArray8997;
		int i_2070_ = i_2055_;
		if (i_2057_ > i_2070_) {
		    i_2070_ = i_2057_;
		    i_2064_ += (i_2057_ - i_2055_) * i_2059_;
		    i_2058_ += (i_2057_ - i_2055_) * anInt9000;
		}
		int i_2071_
		    = (i_2057_ + is_2068_.length < i_2055_ + i_2061_
		       ? i_2057_ + is_2068_.length : i_2055_ + i_2061_);
		for (int i_2072_ = i_2070_; i_2072_ < i_2071_; i_2072_++) {
		    int i_2073_ = is_2068_[i_2072_ - i_2057_] + i_2056_;
		    int i_2074_ = is_2069_[i_2072_ - i_2057_];
		    int i_2075_ = i_2060_;
		    if (i > i_2073_) {
			int i_2076_ = i - i_2073_;
			if (i_2076_ >= i_2074_) {
			    i_2058_ += i_2060_ + i_2063_;
			    i_2064_ += i_2060_ + i_2062_;
			    continue;
			}
			i_2074_ -= i_2076_;
		    } else {
			int i_2077_ = i_2073_ - i;
			if (i_2077_ >= i_2060_) {
			    i_2058_ += i_2060_ + i_2063_;
			    i_2064_ += i_2060_ + i_2062_;
			    continue;
			}
			i_2058_ += i_2077_;
			i_2075_ -= i_2077_;
			i_2064_ += i_2077_;
		    }
		    int i_2078_ = 0;
		    if (i_2075_ < i_2074_)
			i_2074_ = i_2075_;
		    else
			i_2078_ = i_2075_ - i_2074_;
		    for (int i_2079_ = -i_2074_; i_2079_ < 0; i_2079_++) {
			int i_2080_ = anIntArray11425[i_2058_++];
			if (i_2080_ != 0)
			    is[i_2064_++] = i_2080_;
			else
			    i_2064_++;
		    }
		    i_2058_ += i_2078_ + i_2063_;
		    i_2064_ += i_2078_ + i_2062_;
		}
	    }
	}
    }
    
    void method14542(int[] is, int[] is_2081_, int i, int i_2082_) {
	int[] is_2083_ = aClass182_Sub2_9033.anIntArray9466;
	if (is_2083_ != null) {
	    if (anInt9006 == 0) {
		if (anInt9017 == 0) {
		    int i_2084_ = anInt9023;
		    while (i_2084_ < 0) {
			int i_2085_ = i_2084_ + i_2082_;
			if (i_2085_ >= 0) {
			    if (i_2085_ >= is.length)
				break;
			    int i_2086_ = anInt9015;
			    int i_2087_ = anInt9022;
			    int i_2088_ = anInt8999;
			    int i_2089_ = anInt9011;
			    if (i_2087_ >= 0 && i_2088_ >= 0
				&& i_2087_ - (anInt9000 << 12) < 0
				&& i_2088_ - (anInt9001 << 12) < 0) {
				int i_2090_ = is[i_2085_] - i;
				int i_2091_ = -is_2081_[i_2085_];
				int i_2092_ = i_2090_ - (i_2086_ - anInt9015);
				if (i_2092_ > 0) {
				    i_2086_ += i_2092_;
				    i_2089_ += i_2092_;
				    i_2087_ += anInt9006 * i_2092_;
				    i_2088_ += anInt9017 * i_2092_;
				} else
				    i_2091_ -= i_2092_;
				if (i_2089_ < i_2091_)
				    i_2089_ = i_2091_;
				for (/**/; i_2089_ < 0; i_2089_++) {
				    int i_2093_
					= (anIntArray11425
					   [((i_2088_ >> 12) * anInt9000
					     + (i_2087_ >> 12))]);
				    if (i_2093_ != 0)
					is_2083_[i_2086_++] = i_2093_;
				    else
					i_2086_++;
				}
			    }
			}
			i_2084_++;
			anInt9015 += anInt9014;
		    }
		} else if (anInt9017 < 0) {
		    int i_2094_ = anInt9023;
		    while (i_2094_ < 0) {
			int i_2095_ = i_2094_ + i_2082_;
			if (i_2095_ >= 0) {
			    if (i_2095_ >= is.length)
				break;
			    int i_2096_ = anInt9015;
			    int i_2097_ = anInt9022;
			    int i_2098_ = anInt8999 + anInt9025;
			    int i_2099_ = anInt9011;
			    if (i_2097_ >= 0
				&& i_2097_ - (anInt9000 << 12) < 0) {
				int i_2100_;
				if ((i_2100_ = i_2098_ - (anInt9001 << 12))
				    >= 0) {
				    i_2100_
					= (anInt9017 - i_2100_) / anInt9017;
				    i_2099_ += i_2100_;
				    i_2098_ += anInt9017 * i_2100_;
				    i_2096_ += i_2100_;
				}
				if ((i_2100_
				     = (i_2098_ - anInt9017) / anInt9017)
				    > i_2099_)
				    i_2099_ = i_2100_;
				int i_2101_ = is[i_2095_] - i;
				int i_2102_ = -is_2081_[i_2095_];
				int i_2103_ = i_2101_ - (i_2096_ - anInt9015);
				if (i_2103_ > 0) {
				    i_2096_ += i_2103_;
				    i_2099_ += i_2103_;
				    i_2097_ += anInt9006 * i_2103_;
				    i_2098_ += anInt9017 * i_2103_;
				} else
				    i_2102_ -= i_2103_;
				if (i_2099_ < i_2102_)
				    i_2099_ = i_2102_;
				for (/**/; i_2099_ < 0; i_2099_++) {
				    int i_2104_
					= (anIntArray11425
					   [((i_2098_ >> 12) * anInt9000
					     + (i_2097_ >> 12))]);
				    if (i_2104_ != 0)
					is_2083_[i_2096_++] = i_2104_;
				    else
					i_2096_++;
				    i_2098_ += anInt9017;
				}
			    }
			}
			i_2094_++;
			anInt9022 += anInt9018;
			anInt9015 += anInt9014;
		    }
		} else {
		    int i_2105_ = anInt9023;
		    while (i_2105_ < 0) {
			int i_2106_ = i_2105_ + i_2082_;
			if (i_2106_ >= 0) {
			    if (i_2106_ >= is.length)
				break;
			    int i_2107_ = anInt9015;
			    int i_2108_ = anInt9022;
			    int i_2109_ = anInt8999 + anInt9025;
			    int i_2110_ = anInt9011;
			    if (i_2108_ >= 0
				&& i_2108_ - (anInt9000 << 12) < 0) {
				if (i_2109_ < 0) {
				    int i_2111_ = ((anInt9017 - 1 - i_2109_)
						   / anInt9017);
				    i_2110_ += i_2111_;
				    i_2109_ += anInt9017 * i_2111_;
				    i_2107_ += i_2111_;
				}
				int i_2112_;
				if ((i_2112_ = (1 + i_2109_ - (anInt9001 << 12)
						- anInt9017) / anInt9017)
				    > i_2110_)
				    i_2110_ = i_2112_;
				int i_2113_ = is[i_2106_] - i;
				int i_2114_ = -is_2081_[i_2106_];
				int i_2115_ = i_2113_ - (i_2107_ - anInt9015);
				if (i_2115_ > 0) {
				    i_2107_ += i_2115_;
				    i_2110_ += i_2115_;
				    i_2108_ += anInt9006 * i_2115_;
				    i_2109_ += anInt9017 * i_2115_;
				} else
				    i_2114_ -= i_2115_;
				if (i_2110_ < i_2114_)
				    i_2110_ = i_2114_;
				for (/**/; i_2110_ < 0; i_2110_++) {
				    int i_2116_
					= (anIntArray11425
					   [((i_2109_ >> 12) * anInt9000
					     + (i_2108_ >> 12))]);
				    if (i_2116_ != 0)
					is_2083_[i_2107_++] = i_2116_;
				    else
					i_2107_++;
				    i_2109_ += anInt9017;
				}
			    }
			}
			i_2105_++;
			anInt9022 += anInt9018;
			anInt9015 += anInt9014;
		    }
		}
	    } else if (anInt9006 < 0) {
		if (anInt9017 == 0) {
		    int i_2117_ = anInt9023;
		    while (i_2117_ < 0) {
			int i_2118_ = i_2117_ + i_2082_;
			if (i_2118_ >= 0) {
			    if (i_2118_ >= is.length)
				break;
			    int i_2119_ = anInt9015;
			    int i_2120_ = anInt9022 + anInt9024;
			    int i_2121_ = anInt8999;
			    int i_2122_ = anInt9011;
			    if (i_2121_ >= 0
				&& i_2121_ - (anInt9001 << 12) < 0) {
				int i_2123_;
				if ((i_2123_ = i_2120_ - (anInt9000 << 12))
				    >= 0) {
				    i_2123_
					= (anInt9006 - i_2123_) / anInt9006;
				    i_2122_ += i_2123_;
				    i_2120_ += anInt9006 * i_2123_;
				    i_2119_ += i_2123_;
				}
				if ((i_2123_
				     = (i_2120_ - anInt9006) / anInt9006)
				    > i_2122_)
				    i_2122_ = i_2123_;
				int i_2124_ = is[i_2118_] - i;
				int i_2125_ = -is_2081_[i_2118_];
				int i_2126_ = i_2124_ - (i_2119_ - anInt9015);
				if (i_2126_ > 0) {
				    i_2119_ += i_2126_;
				    i_2122_ += i_2126_;
				    i_2120_ += anInt9006 * i_2126_;
				    i_2121_ += anInt9017 * i_2126_;
				} else
				    i_2125_ -= i_2126_;
				if (i_2122_ < i_2125_)
				    i_2122_ = i_2125_;
				for (/**/; i_2122_ < 0; i_2122_++) {
				    int i_2127_
					= (anIntArray11425
					   [((i_2121_ >> 12) * anInt9000
					     + (i_2120_ >> 12))]);
				    if (i_2127_ != 0)
					is_2083_[i_2119_++] = i_2127_;
				    else
					i_2119_++;
				    i_2120_ += anInt9006;
				}
			    }
			}
			i_2117_++;
			anInt8999 += anInt9010;
			anInt9015 += anInt9014;
		    }
		} else if (anInt9017 < 0) {
		    int i_2128_ = anInt9023;
		    while (i_2128_ < 0) {
			int i_2129_ = i_2128_ + i_2082_;
			if (i_2129_ >= 0) {
			    if (i_2129_ >= is.length)
				break;
			    int i_2130_ = anInt9015;
			    int i_2131_ = anInt9022 + anInt9024;
			    int i_2132_ = anInt8999 + anInt9025;
			    int i_2133_ = anInt9011;
			    int i_2134_;
			    if ((i_2134_ = i_2131_ - (anInt9000 << 12)) >= 0) {
				i_2134_ = (anInt9006 - i_2134_) / anInt9006;
				i_2133_ += i_2134_;
				i_2131_ += anInt9006 * i_2134_;
				i_2132_ += anInt9017 * i_2134_;
				i_2130_ += i_2134_;
			    }
			    if ((i_2134_ = (i_2131_ - anInt9006) / anInt9006)
				> i_2133_)
				i_2133_ = i_2134_;
			    if ((i_2134_ = i_2132_ - (anInt9001 << 12)) >= 0) {
				i_2134_ = (anInt9017 - i_2134_) / anInt9017;
				i_2133_ += i_2134_;
				i_2131_ += anInt9006 * i_2134_;
				i_2132_ += anInt9017 * i_2134_;
				i_2130_ += i_2134_;
			    }
			    if ((i_2134_ = (i_2132_ - anInt9017) / anInt9017)
				> i_2133_)
				i_2133_ = i_2134_;
			    int i_2135_ = is[i_2129_] - i;
			    int i_2136_ = -is_2081_[i_2129_];
			    int i_2137_ = i_2135_ - (i_2130_ - anInt9015);
			    if (i_2137_ > 0) {
				i_2130_ += i_2137_;
				i_2133_ += i_2137_;
				i_2131_ += anInt9006 * i_2137_;
				i_2132_ += anInt9017 * i_2137_;
			    } else
				i_2136_ -= i_2137_;
			    if (i_2133_ < i_2136_)
				i_2133_ = i_2136_;
			    for (/**/; i_2133_ < 0; i_2133_++) {
				int i_2138_ = (anIntArray11425
					       [((i_2132_ >> 12) * anInt9000
						 + (i_2131_ >> 12))]);
				if (i_2138_ != 0)
				    is_2083_[i_2130_++] = i_2138_;
				else
				    i_2130_++;
				i_2131_ += anInt9006;
				i_2132_ += anInt9017;
			    }
			}
			i_2128_++;
			anInt9022 += anInt9018;
			anInt8999 += anInt9010;
			anInt9015 += anInt9014;
		    }
		} else {
		    int i_2139_ = anInt9023;
		    while (i_2139_ < 0) {
			int i_2140_ = i_2139_ + i_2082_;
			if (i_2140_ >= 0) {
			    if (i_2140_ >= is.length)
				break;
			    int i_2141_ = anInt9015;
			    int i_2142_ = anInt9022 + anInt9024;
			    int i_2143_ = anInt8999 + anInt9025;
			    int i_2144_ = anInt9011;
			    int i_2145_;
			    if ((i_2145_ = i_2142_ - (anInt9000 << 12)) >= 0) {
				i_2145_ = (anInt9006 - i_2145_) / anInt9006;
				i_2144_ += i_2145_;
				i_2142_ += anInt9006 * i_2145_;
				i_2143_ += anInt9017 * i_2145_;
				i_2141_ += i_2145_;
			    }
			    if ((i_2145_ = (i_2142_ - anInt9006) / anInt9006)
				> i_2144_)
				i_2144_ = i_2145_;
			    if (i_2143_ < 0) {
				i_2145_
				    = (anInt9017 - 1 - i_2143_) / anInt9017;
				i_2144_ += i_2145_;
				i_2142_ += anInt9006 * i_2145_;
				i_2143_ += anInt9017 * i_2145_;
				i_2141_ += i_2145_;
			    }
			    if ((i_2145_ = (1 + i_2143_ - (anInt9001 << 12)
					    - anInt9017) / anInt9017)
				> i_2144_)
				i_2144_ = i_2145_;
			    int i_2146_ = is[i_2140_] - i;
			    int i_2147_ = -is_2081_[i_2140_];
			    int i_2148_ = i_2146_ - (i_2141_ - anInt9015);
			    if (i_2148_ > 0) {
				i_2141_ += i_2148_;
				i_2144_ += i_2148_;
				i_2142_ += anInt9006 * i_2148_;
				i_2143_ += anInt9017 * i_2148_;
			    } else
				i_2147_ -= i_2148_;
			    if (i_2144_ < i_2147_)
				i_2144_ = i_2147_;
			    for (/**/; i_2144_ < 0; i_2144_++) {
				int i_2149_ = (anIntArray11425
					       [((i_2143_ >> 12) * anInt9000
						 + (i_2142_ >> 12))]);
				if (i_2149_ != 0)
				    is_2083_[i_2141_++] = i_2149_;
				else
				    i_2141_++;
				i_2142_ += anInt9006;
				i_2143_ += anInt9017;
			    }
			}
			i_2139_++;
			anInt9022 += anInt9018;
			anInt8999 += anInt9010;
			anInt9015 += anInt9014;
		    }
		}
	    } else if (anInt9017 == 0) {
		int i_2150_ = anInt9023;
		while (i_2150_ < 0) {
		    int i_2151_ = i_2150_ + i_2082_;
		    if (i_2151_ >= 0) {
			if (i_2151_ >= is.length)
			    break;
			int i_2152_ = anInt9015;
			int i_2153_ = anInt9022 + anInt9024;
			int i_2154_ = anInt8999;
			int i_2155_ = anInt9011;
			if (i_2154_ >= 0 && i_2154_ - (anInt9001 << 12) < 0) {
			    if (i_2153_ < 0) {
				int i_2156_
				    = (anInt9006 - 1 - i_2153_) / anInt9006;
				i_2155_ += i_2156_;
				i_2153_ += anInt9006 * i_2156_;
				i_2152_ += i_2156_;
			    }
			    int i_2157_;
			    if ((i_2157_ = (1 + i_2153_ - (anInt9000 << 12)
					    - anInt9006) / anInt9006)
				> i_2155_)
				i_2155_ = i_2157_;
			    int i_2158_ = is[i_2151_] - i;
			    int i_2159_ = -is_2081_[i_2151_];
			    int i_2160_ = i_2158_ - (i_2152_ - anInt9015);
			    if (i_2160_ > 0) {
				i_2152_ += i_2160_;
				i_2155_ += i_2160_;
				i_2153_ += anInt9006 * i_2160_;
				i_2154_ += anInt9017 * i_2160_;
			    } else
				i_2159_ -= i_2160_;
			    if (i_2155_ < i_2159_)
				i_2155_ = i_2159_;
			    for (/**/; i_2155_ < 0; i_2155_++) {
				int i_2161_ = (anIntArray11425
					       [((i_2154_ >> 12) * anInt9000
						 + (i_2153_ >> 12))]);
				if (i_2161_ != 0)
				    is_2083_[i_2152_++] = i_2161_;
				else
				    i_2152_++;
				i_2153_ += anInt9006;
			    }
			}
		    }
		    i_2150_++;
		    anInt9022 += anInt9018;
		    anInt8999 += anInt9010;
		    anInt9015 += anInt9014;
		}
	    } else if (anInt9017 < 0) {
		int i_2162_ = anInt9023;
		while (i_2162_ < 0) {
		    int i_2163_ = i_2162_ + i_2082_;
		    if (i_2163_ >= 0) {
			if (i_2163_ >= is.length)
			    break;
			int i_2164_ = anInt9015;
			int i_2165_ = anInt9022 + anInt9024;
			int i_2166_ = anInt8999 + anInt9025;
			int i_2167_ = anInt9011;
			if (i_2165_ < 0) {
			    int i_2168_
				= (anInt9006 - 1 - i_2165_) / anInt9006;
			    i_2167_ += i_2168_;
			    i_2165_ += anInt9006 * i_2168_;
			    i_2166_ += anInt9017 * i_2168_;
			    i_2164_ += i_2168_;
			}
			int i_2169_;
			if ((i_2169_ = (1 + i_2165_ - (anInt9000 << 12)
					- anInt9006) / anInt9006)
			    > i_2167_)
			    i_2167_ = i_2169_;
			if ((i_2169_ = i_2166_ - (anInt9001 << 12)) >= 0) {
			    i_2169_ = (anInt9017 - i_2169_) / anInt9017;
			    i_2167_ += i_2169_;
			    i_2165_ += anInt9006 * i_2169_;
			    i_2166_ += anInt9017 * i_2169_;
			    i_2164_ += i_2169_;
			}
			if ((i_2169_ = (i_2166_ - anInt9017) / anInt9017)
			    > i_2167_)
			    i_2167_ = i_2169_;
			int i_2170_ = is[i_2163_] - i;
			int i_2171_ = -is_2081_[i_2163_];
			int i_2172_ = i_2170_ - (i_2164_ - anInt9015);
			if (i_2172_ > 0) {
			    i_2164_ += i_2172_;
			    i_2167_ += i_2172_;
			    i_2165_ += anInt9006 * i_2172_;
			    i_2166_ += anInt9017 * i_2172_;
			} else
			    i_2171_ -= i_2172_;
			if (i_2167_ < i_2171_)
			    i_2167_ = i_2171_;
			for (/**/; i_2167_ < 0; i_2167_++) {
			    int i_2173_
				= (anIntArray11425
				   [(i_2166_ >> 12) * anInt9000 + (i_2165_
								   >> 12)]);
			    if (i_2173_ != 0)
				is_2083_[i_2164_++] = i_2173_;
			    else
				i_2164_++;
			    i_2165_ += anInt9006;
			    i_2166_ += anInt9017;
			}
		    }
		    i_2162_++;
		    anInt9022 += anInt9018;
		    anInt8999 += anInt9010;
		    anInt9015 += anInt9014;
		}
	    } else {
		int i_2174_ = anInt9023;
		while (i_2174_ < 0) {
		    int i_2175_ = i_2174_ + i_2082_;
		    if (i_2175_ >= 0) {
			if (i_2175_ >= is.length)
			    break;
			int i_2176_ = anInt9015;
			int i_2177_ = anInt9022 + anInt9024;
			int i_2178_ = anInt8999 + anInt9025;
			int i_2179_ = anInt9011;
			if (i_2177_ < 0) {
			    int i_2180_
				= (anInt9006 - 1 - i_2177_) / anInt9006;
			    i_2179_ += i_2180_;
			    i_2177_ += anInt9006 * i_2180_;
			    i_2178_ += anInt9017 * i_2180_;
			    i_2176_ += i_2180_;
			}
			int i_2181_;
			if ((i_2181_ = (1 + i_2177_ - (anInt9000 << 12)
					- anInt9006) / anInt9006)
			    > i_2179_)
			    i_2179_ = i_2181_;
			if (i_2178_ < 0) {
			    i_2181_ = (anInt9017 - 1 - i_2178_) / anInt9017;
			    i_2179_ += i_2181_;
			    i_2177_ += anInt9006 * i_2181_;
			    i_2178_ += anInt9017 * i_2181_;
			    i_2176_ += i_2181_;
			}
			if ((i_2181_ = (1 + i_2178_ - (anInt9001 << 12)
					- anInt9017) / anInt9017)
			    > i_2179_)
			    i_2179_ = i_2181_;
			int i_2182_ = is[i_2175_] - i;
			int i_2183_ = -is_2081_[i_2175_];
			int i_2184_ = i_2182_ - (i_2176_ - anInt9015);
			if (i_2184_ > 0) {
			    i_2176_ += i_2184_;
			    i_2179_ += i_2184_;
			    i_2177_ += anInt9006 * i_2184_;
			    i_2178_ += anInt9017 * i_2184_;
			} else
			    i_2183_ -= i_2184_;
			if (i_2179_ < i_2183_)
			    i_2179_ = i_2183_;
			for (/**/; i_2179_ < 0; i_2179_++) {
			    int i_2185_
				= (anIntArray11425
				   [(i_2178_ >> 12) * anInt9000 + (i_2177_
								   >> 12)]);
			    if (i_2185_ != 0)
				is_2083_[i_2176_++] = i_2185_;
			    else
				i_2176_++;
			    i_2177_ += anInt9006;
			    i_2178_ += anInt9017;
			}
		    }
		    i_2174_++;
		    anInt9022 += anInt9018;
		    anInt8999 += anInt9010;
		    anInt9015 += anInt9014;
		}
	    }
	}
    }
    
    public void method2510(int i, int i_2186_, int i_2187_, int i_2188_,
			   int[] is, int[] is_2189_, int i_2190_,
			   int i_2191_) {
	method18018(i, i_2186_, i_2187_, i_2188_, is, i_2190_, i_2191_);
    }
    
    void method14548(int i, int i_2192_) {
	int[] is = aClass182_Sub2_9033.anIntArray9466;
	if (is != null) {
	    if (anInt9006 == 0) {
		if (anInt9017 == 0) {
		    int i_2193_ = anInt9023;
		    while (i_2193_ < 0) {
			int i_2194_ = anInt9015;
			int i_2195_ = anInt9022;
			int i_2196_ = anInt8999;
			int i_2197_ = anInt9011;
			if (i_2195_ >= 0 && i_2196_ >= 0
			    && i_2195_ - (anInt9000 << 12) < 0
			    && i_2196_ - (anInt9001 << 12) < 0) {
			    for (/**/; i_2197_ < 0; i_2197_++)
				method18021(((i_2196_ >> 12) * anInt9000
					     + (i_2195_ >> 12)),
					    i_2194_++, is, i, i_2192_);
			}
			i_2193_++;
			anInt9015 += anInt9014;
		    }
		} else if (anInt9017 < 0) {
		    int i_2198_ = anInt9023;
		    while (i_2198_ < 0) {
			int i_2199_ = anInt9015;
			int i_2200_ = anInt9022;
			int i_2201_ = anInt8999 + anInt9025;
			int i_2202_ = anInt9011;
			if (i_2200_ >= 0 && i_2200_ - (anInt9000 << 12) < 0) {
			    int i_2203_;
			    if ((i_2203_ = i_2201_ - (anInt9001 << 12)) >= 0) {
				i_2203_ = (anInt9017 - i_2203_) / anInt9017;
				i_2202_ += i_2203_;
				i_2201_ += anInt9017 * i_2203_;
				i_2199_ += i_2203_;
			    }
			    if ((i_2203_ = (i_2201_ - anInt9017) / anInt9017)
				> i_2202_)
				i_2202_ = i_2203_;
			    for (/**/; i_2202_ < 0; i_2202_++) {
				method18021(((i_2201_ >> 12) * anInt9000
					     + (i_2200_ >> 12)),
					    i_2199_++, is, i, i_2192_);
				i_2201_ += anInt9017;
			    }
			}
			i_2198_++;
			anInt9022 += anInt9018;
			anInt9015 += anInt9014;
		    }
		} else {
		    int i_2204_ = anInt9023;
		    while (i_2204_ < 0) {
			int i_2205_ = anInt9015;
			int i_2206_ = anInt9022;
			int i_2207_ = anInt8999 + anInt9025;
			int i_2208_ = anInt9011;
			if (i_2206_ >= 0 && i_2206_ - (anInt9000 << 12) < 0) {
			    if (i_2207_ < 0) {
				int i_2209_
				    = (anInt9017 - 1 - i_2207_) / anInt9017;
				i_2208_ += i_2209_;
				i_2207_ += anInt9017 * i_2209_;
				i_2205_ += i_2209_;
			    }
			    int i_2210_;
			    if ((i_2210_ = (1 + i_2207_ - (anInt9001 << 12)
					    - anInt9017) / anInt9017)
				> i_2208_)
				i_2208_ = i_2210_;
			    for (/**/; i_2208_ < 0; i_2208_++) {
				method18021(((i_2207_ >> 12) * anInt9000
					     + (i_2206_ >> 12)),
					    i_2205_++, is, i, i_2192_);
				i_2207_ += anInt9017;
			    }
			}
			i_2204_++;
			anInt9022 += anInt9018;
			anInt9015 += anInt9014;
		    }
		}
	    } else if (anInt9006 < 0) {
		if (anInt9017 == 0) {
		    int i_2211_ = anInt9023;
		    while (i_2211_ < 0) {
			int i_2212_ = anInt9015;
			int i_2213_ = anInt9022 + anInt9024;
			int i_2214_ = anInt8999;
			int i_2215_ = anInt9011;
			if (i_2214_ >= 0 && i_2214_ - (anInt9001 << 12) < 0) {
			    int i_2216_;
			    if ((i_2216_ = i_2213_ - (anInt9000 << 12)) >= 0) {
				i_2216_ = (anInt9006 - i_2216_) / anInt9006;
				i_2215_ += i_2216_;
				i_2213_ += anInt9006 * i_2216_;
				i_2212_ += i_2216_;
			    }
			    if ((i_2216_ = (i_2213_ - anInt9006) / anInt9006)
				> i_2215_)
				i_2215_ = i_2216_;
			    for (/**/; i_2215_ < 0; i_2215_++) {
				method18021(((i_2214_ >> 12) * anInt9000
					     + (i_2213_ >> 12)),
					    i_2212_++, is, i, i_2192_);
				i_2213_ += anInt9006;
			    }
			}
			i_2211_++;
			anInt8999 += anInt9010;
			anInt9015 += anInt9014;
		    }
		} else if (anInt9017 < 0) {
		    int i_2217_ = anInt9023;
		    while (i_2217_ < 0) {
			int i_2218_ = anInt9015;
			int i_2219_ = anInt9022 + anInt9024;
			int i_2220_ = anInt8999 + anInt9025;
			int i_2221_ = anInt9011;
			int i_2222_;
			if ((i_2222_ = i_2219_ - (anInt9000 << 12)) >= 0) {
			    i_2222_ = (anInt9006 - i_2222_) / anInt9006;
			    i_2221_ += i_2222_;
			    i_2219_ += anInt9006 * i_2222_;
			    i_2220_ += anInt9017 * i_2222_;
			    i_2218_ += i_2222_;
			}
			if ((i_2222_ = (i_2219_ - anInt9006) / anInt9006)
			    > i_2221_)
			    i_2221_ = i_2222_;
			if ((i_2222_ = i_2220_ - (anInt9001 << 12)) >= 0) {
			    i_2222_ = (anInt9017 - i_2222_) / anInt9017;
			    i_2221_ += i_2222_;
			    i_2219_ += anInt9006 * i_2222_;
			    i_2220_ += anInt9017 * i_2222_;
			    i_2218_ += i_2222_;
			}
			if ((i_2222_ = (i_2220_ - anInt9017) / anInt9017)
			    > i_2221_)
			    i_2221_ = i_2222_;
			for (/**/; i_2221_ < 0; i_2221_++) {
			    method18021((i_2220_ >> 12) * anInt9000 + (i_2219_
								       >> 12),
					i_2218_++, is, i, i_2192_);
			    i_2219_ += anInt9006;
			    i_2220_ += anInt9017;
			}
			i_2217_++;
			anInt9022 += anInt9018;
			anInt8999 += anInt9010;
			anInt9015 += anInt9014;
		    }
		} else {
		    int i_2223_ = anInt9023;
		    while (i_2223_ < 0) {
			int i_2224_ = anInt9015;
			int i_2225_ = anInt9022 + anInt9024;
			int i_2226_ = anInt8999 + anInt9025;
			int i_2227_ = anInt9011;
			int i_2228_;
			if ((i_2228_ = i_2225_ - (anInt9000 << 12)) >= 0) {
			    i_2228_ = (anInt9006 - i_2228_) / anInt9006;
			    i_2227_ += i_2228_;
			    i_2225_ += anInt9006 * i_2228_;
			    i_2226_ += anInt9017 * i_2228_;
			    i_2224_ += i_2228_;
			}
			if ((i_2228_ = (i_2225_ - anInt9006) / anInt9006)
			    > i_2227_)
			    i_2227_ = i_2228_;
			if (i_2226_ < 0) {
			    i_2228_ = (anInt9017 - 1 - i_2226_) / anInt9017;
			    i_2227_ += i_2228_;
			    i_2225_ += anInt9006 * i_2228_;
			    i_2226_ += anInt9017 * i_2228_;
			    i_2224_ += i_2228_;
			}
			if ((i_2228_ = (1 + i_2226_ - (anInt9001 << 12)
					- anInt9017) / anInt9017)
			    > i_2227_)
			    i_2227_ = i_2228_;
			for (/**/; i_2227_ < 0; i_2227_++) {
			    method18021((i_2226_ >> 12) * anInt9000 + (i_2225_
								       >> 12),
					i_2224_++, is, i, i_2192_);
			    i_2225_ += anInt9006;
			    i_2226_ += anInt9017;
			}
			i_2223_++;
			anInt9022 += anInt9018;
			anInt8999 += anInt9010;
			anInt9015 += anInt9014;
		    }
		}
	    } else if (anInt9017 == 0) {
		int i_2229_ = anInt9023;
		while (i_2229_ < 0) {
		    int i_2230_ = anInt9015;
		    int i_2231_ = anInt9022 + anInt9024;
		    int i_2232_ = anInt8999;
		    int i_2233_ = anInt9011;
		    if (i_2232_ >= 0 && i_2232_ - (anInt9001 << 12) < 0) {
			if (i_2231_ < 0) {
			    int i_2234_
				= (anInt9006 - 1 - i_2231_) / anInt9006;
			    i_2233_ += i_2234_;
			    i_2231_ += anInt9006 * i_2234_;
			    i_2230_ += i_2234_;
			}
			int i_2235_;
			if ((i_2235_ = (1 + i_2231_ - (anInt9000 << 12)
					- anInt9006) / anInt9006)
			    > i_2233_)
			    i_2233_ = i_2235_;
			for (/**/; i_2233_ < 0; i_2233_++) {
			    method18021((i_2232_ >> 12) * anInt9000 + (i_2231_
								       >> 12),
					i_2230_++, is, i, i_2192_);
			    i_2231_ += anInt9006;
			}
		    }
		    i_2229_++;
		    anInt9022 += anInt9018;
		    anInt8999 += anInt9010;
		    anInt9015 += anInt9014;
		}
	    } else if (anInt9017 < 0) {
		for (int i_2236_ = anInt9023; i_2236_ < 0; i_2236_++) {
		    int i_2237_ = anInt9015;
		    int i_2238_ = anInt9022 + anInt9024;
		    int i_2239_ = anInt8999 + anInt9025;
		    int i_2240_ = anInt9011;
		    if (i_2238_ < 0) {
			int i_2241_ = (anInt9006 - 1 - i_2238_) / anInt9006;
			i_2240_ += i_2241_;
			i_2238_ += anInt9006 * i_2241_;
			i_2239_ += anInt9017 * i_2241_;
			i_2237_ += i_2241_;
		    }
		    int i_2242_;
		    if ((i_2242_ = (1 + i_2238_ - (anInt9000 << 12)
				    - anInt9006) / anInt9006)
			> i_2240_)
			i_2240_ = i_2242_;
		    if ((i_2242_ = i_2239_ - (anInt9001 << 12)) >= 0) {
			i_2242_ = (anInt9017 - i_2242_) / anInt9017;
			i_2240_ += i_2242_;
			i_2238_ += anInt9006 * i_2242_;
			i_2239_ += anInt9017 * i_2242_;
			i_2237_ += i_2242_;
		    }
		    if ((i_2242_ = (i_2239_ - anInt9017) / anInt9017)
			> i_2240_)
			i_2240_ = i_2242_;
		    for (/**/; i_2240_ < 0; i_2240_++) {
			method18021((i_2239_ >> 12) * anInt9000 + (i_2238_
								   >> 12),
				    i_2237_++, is, i, i_2192_);
			i_2238_ += anInt9006;
			i_2239_ += anInt9017;
		    }
		    anInt9022 += anInt9018;
		    anInt8999 += anInt9010;
		    anInt9015 += anInt9014;
		}
	    } else {
		for (int i_2243_ = anInt9023; i_2243_ < 0; i_2243_++) {
		    int i_2244_ = anInt9015;
		    int i_2245_ = anInt9022 + anInt9024;
		    int i_2246_ = anInt8999 + anInt9025;
		    int i_2247_ = anInt9011;
		    if (i_2245_ < 0) {
			int i_2248_ = (anInt9006 - 1 - i_2245_) / anInt9006;
			i_2247_ += i_2248_;
			i_2245_ += anInt9006 * i_2248_;
			i_2246_ += anInt9017 * i_2248_;
			i_2244_ += i_2248_;
		    }
		    int i_2249_;
		    if ((i_2249_ = (1 + i_2245_ - (anInt9000 << 12)
				    - anInt9006) / anInt9006)
			> i_2247_)
			i_2247_ = i_2249_;
		    if (i_2246_ < 0) {
			i_2249_ = (anInt9017 - 1 - i_2246_) / anInt9017;
			i_2247_ += i_2249_;
			i_2245_ += anInt9006 * i_2249_;
			i_2246_ += anInt9017 * i_2249_;
			i_2244_ += i_2249_;
		    }
		    if ((i_2249_ = (1 + i_2246_ - (anInt9001 << 12)
				    - anInt9017) / anInt9017)
			> i_2247_)
			i_2247_ = i_2249_;
		    for (/**/; i_2247_ < 0; i_2247_++) {
			method18021((i_2246_ >> 12) * anInt9000 + (i_2245_
								   >> 12),
				    i_2244_++, is, i, i_2192_);
			i_2245_ += anInt9006;
			i_2246_ += anInt9017;
		    }
		    anInt9022 += anInt9018;
		    anInt8999 += anInt9010;
		    anInt9015 += anInt9014;
		}
	    }
	}
    }
}
