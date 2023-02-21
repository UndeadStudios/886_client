/* Class157_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class157_Sub1_Sub1 extends Class157_Sub1
{
    byte[] aByteArray11422;
    int[] anIntArray11423;
    
    public Interface21 method2507() {
	throw new IllegalStateException();
    }
    
    public void method2474(int i, int i_0_, int i_1_, int i_2_, int[] is,
			   int i_3_, int i_4_) {
	throw new IllegalStateException();
    }
    
    public void method2513(int i, int i_5_, Class152 class152, int i_6_,
			   int i_7_) {
	if (aClass182_Sub2_9033.method15226())
	    throw new IllegalStateException();
	int[] is = aClass182_Sub2_9033.anIntArray9466;
	if (is != null) {
	    i += anInt9002;
	    i_5_ += anInt9003;
	    int i_8_ = 0;
	    int i_9_ = aClass182_Sub2_9033.anInt9494 * -476035351;
	    int i_10_ = anInt9000;
	    int i_11_ = anInt9001;
	    int i_12_ = i_9_ - i_10_;
	    int i_13_ = 0;
	    int i_14_ = i + i_5_ * i_9_;
	    if (i_5_ < aClass182_Sub2_9033.anInt9472 * 1722112305) {
		int i_15_ = aClass182_Sub2_9033.anInt9472 * 1722112305 - i_5_;
		i_11_ -= i_15_;
		i_5_ = aClass182_Sub2_9033.anInt9472 * 1722112305;
		i_8_ += i_15_ * i_10_;
		i_14_ += i_15_ * i_9_;
	    }
	    if (i_5_ + i_11_ > aClass182_Sub2_9033.anInt9473 * 1920901985)
		i_11_ -= (i_5_ + i_11_
			  - aClass182_Sub2_9033.anInt9473 * 1920901985);
	    if (i < aClass182_Sub2_9033.anInt9470 * 1988019027) {
		int i_16_ = aClass182_Sub2_9033.anInt9470 * 1988019027 - i;
		i_10_ -= i_16_;
		i = aClass182_Sub2_9033.anInt9470 * 1988019027;
		i_8_ += i_16_;
		i_14_ += i_16_;
		i_13_ += i_16_;
		i_12_ += i_16_;
	    }
	    if (i + i_10_ > aClass182_Sub2_9033.anInt9499 * -466178451) {
		int i_17_
		    = i + i_10_ - aClass182_Sub2_9033.anInt9499 * -466178451;
		i_10_ -= i_17_;
		i_13_ += i_17_;
		i_12_ += i_17_;
	    }
	    if (i_10_ > 0 && i_11_ > 0) {
		Class152_Sub1 class152_sub1 = (Class152_Sub1) class152;
		int[] is_18_ = class152_sub1.anIntArray8998;
		int[] is_19_ = class152_sub1.anIntArray8997;
		int i_20_ = i_5_;
		if (i_7_ > i_20_) {
		    i_20_ = i_7_;
		    i_14_ += (i_7_ - i_5_) * i_9_;
		    i_8_ += (i_7_ - i_5_) * anInt9000;
		}
		int i_21_ = (i_7_ + is_18_.length < i_5_ + i_11_
			     ? i_7_ + is_18_.length : i_5_ + i_11_);
		for (int i_22_ = i_20_; i_22_ < i_21_; i_22_++) {
		    int i_23_ = is_18_[i_22_ - i_7_] + i_6_;
		    int i_24_ = is_19_[i_22_ - i_7_];
		    int i_25_ = i_10_;
		    if (i > i_23_) {
			int i_26_ = i - i_23_;
			if (i_26_ >= i_24_) {
			    i_8_ += i_10_ + i_13_;
			    i_14_ += i_10_ + i_12_;
			    continue;
			}
			i_24_ -= i_26_;
		    } else {
			int i_27_ = i_23_ - i;
			if (i_27_ >= i_10_) {
			    i_8_ += i_10_ + i_13_;
			    i_14_ += i_10_ + i_12_;
			    continue;
			}
			i_8_ += i_27_;
			i_25_ -= i_27_;
			i_14_ += i_27_;
		    }
		    int i_28_ = 0;
		    if (i_25_ < i_24_)
			i_24_ = i_25_;
		    else
			i_28_ = i_25_ - i_24_;
		    for (int i_29_ = -i_24_; i_29_ < 0; i_29_++) {
			int i_30_ = aByteArray11422[i_8_++];
			if (i_30_ != 0)
			    is[i_14_++] = anIntArray11423[i_30_ & 0xff];
			else
			    i_14_++;
		    }
		    i_8_ += i_28_ + i_13_;
		    i_14_ += i_28_ + i_12_;
		}
	    }
	}
    }
    
    public void method2540(int i, int i_31_, int i_32_, int i_33_, int i_34_,
			   int i_35_) {
	throw new IllegalStateException();
    }
    
    void method14542(int[] is, int[] is_36_, int i, int i_37_) {
	int[] is_38_ = aClass182_Sub2_9033.anIntArray9466;
	if (is_38_ != null) {
	    if (anInt9006 == 0) {
		if (anInt9017 == 0) {
		    int i_39_ = anInt9023;
		    while (i_39_ < 0) {
			int i_40_ = i_39_ + i_37_;
			if (i_40_ >= 0) {
			    if (i_40_ >= is.length)
				break;
			    int i_41_ = anInt9015;
			    int i_42_ = anInt9022;
			    int i_43_ = anInt8999;
			    int i_44_ = anInt9011;
			    if (i_42_ >= 0 && i_43_ >= 0
				&& i_42_ - (anInt9000 << 12) < 0
				&& i_43_ - (anInt9001 << 12) < 0) {
				int i_45_ = is[i_40_] - i;
				int i_46_ = -is_36_[i_40_];
				int i_47_ = i_45_ - (i_41_ - anInt9015);
				if (i_47_ > 0) {
				    i_41_ += i_47_;
				    i_44_ += i_47_;
				    i_42_ += anInt9006 * i_47_;
				    i_43_ += anInt9017 * i_47_;
				} else
				    i_46_ -= i_47_;
				if (i_44_ < i_46_)
				    i_44_ = i_46_;
				for (/**/; i_44_ < 0; i_44_++) {
				    int i_48_ = (aByteArray11422
						 [((i_43_ >> 12) * anInt9000
						   + (i_42_ >> 12))]);
				    if (i_48_ != 0)
					is_38_[i_41_++]
					    = anIntArray11423[i_48_ & 0xff];
				    else
					i_41_++;
				}
			    }
			}
			i_39_++;
			anInt9015 += anInt9014;
		    }
		} else if (anInt9017 < 0) {
		    int i_49_ = anInt9023;
		    while (i_49_ < 0) {
			int i_50_ = i_49_ + i_37_;
			if (i_50_ >= 0) {
			    if (i_50_ >= is.length)
				break;
			    int i_51_ = anInt9015;
			    int i_52_ = anInt9022;
			    int i_53_ = anInt8999 + anInt9025;
			    int i_54_ = anInt9011;
			    if (i_52_ >= 0 && i_52_ - (anInt9000 << 12) < 0) {
				int i_55_;
				if ((i_55_ = i_53_ - (anInt9001 << 12)) >= 0) {
				    i_55_ = (anInt9017 - i_55_) / anInt9017;
				    i_54_ += i_55_;
				    i_53_ += anInt9017 * i_55_;
				    i_51_ += i_55_;
				}
				if ((i_55_ = (i_53_ - anInt9017) / anInt9017)
				    > i_54_)
				    i_54_ = i_55_;
				int i_56_ = is[i_50_] - i;
				int i_57_ = -is_36_[i_50_];
				int i_58_ = i_56_ - (i_51_ - anInt9015);
				if (i_58_ > 0) {
				    i_51_ += i_58_;
				    i_54_ += i_58_;
				    i_52_ += anInt9006 * i_58_;
				    i_53_ += anInt9017 * i_58_;
				} else
				    i_57_ -= i_58_;
				if (i_54_ < i_57_)
				    i_54_ = i_57_;
				for (/**/; i_54_ < 0; i_54_++) {
				    int i_59_ = (aByteArray11422
						 [((i_53_ >> 12) * anInt9000
						   + (i_52_ >> 12))]);
				    if (i_59_ != 0)
					is_38_[i_51_++]
					    = anIntArray11423[i_59_ & 0xff];
				    else
					i_51_++;
				    i_53_ += anInt9017;
				}
			    }
			}
			i_49_++;
			anInt9022 += anInt9018;
			anInt9015 += anInt9014;
		    }
		} else {
		    int i_60_ = anInt9023;
		    while (i_60_ < 0) {
			int i_61_ = i_60_ + i_37_;
			if (i_61_ >= 0) {
			    if (i_61_ >= is.length)
				break;
			    int i_62_ = anInt9015;
			    int i_63_ = anInt9022;
			    int i_64_ = anInt8999 + anInt9025;
			    int i_65_ = anInt9011;
			    if (i_63_ >= 0 && i_63_ - (anInt9000 << 12) < 0) {
				if (i_64_ < 0) {
				    int i_66_
					= (anInt9017 - 1 - i_64_) / anInt9017;
				    i_65_ += i_66_;
				    i_64_ += anInt9017 * i_66_;
				    i_62_ += i_66_;
				}
				int i_67_;
				if ((i_67_ = (1 + i_64_ - (anInt9001 << 12)
					      - anInt9017) / anInt9017)
				    > i_65_)
				    i_65_ = i_67_;
				int i_68_ = is[i_61_] - i;
				int i_69_ = -is_36_[i_61_];
				int i_70_ = i_68_ - (i_62_ - anInt9015);
				if (i_70_ > 0) {
				    i_62_ += i_70_;
				    i_65_ += i_70_;
				    i_63_ += anInt9006 * i_70_;
				    i_64_ += anInt9017 * i_70_;
				} else
				    i_69_ -= i_70_;
				if (i_65_ < i_69_)
				    i_65_ = i_69_;
				for (/**/; i_65_ < 0; i_65_++) {
				    int i_71_ = (aByteArray11422
						 [((i_64_ >> 12) * anInt9000
						   + (i_63_ >> 12))]);
				    if (i_71_ != 0)
					is_38_[i_62_++]
					    = anIntArray11423[i_71_ & 0xff];
				    else
					i_62_++;
				    i_64_ += anInt9017;
				}
			    }
			}
			i_60_++;
			anInt9022 += anInt9018;
			anInt9015 += anInt9014;
		    }
		}
	    } else if (anInt9006 < 0) {
		if (anInt9017 == 0) {
		    int i_72_ = anInt9023;
		    while (i_72_ < 0) {
			int i_73_ = i_72_ + i_37_;
			if (i_73_ >= 0) {
			    if (i_73_ >= is.length)
				break;
			    int i_74_ = anInt9015;
			    int i_75_ = anInt9022 + anInt9024;
			    int i_76_ = anInt8999;
			    int i_77_ = anInt9011;
			    if (i_76_ >= 0 && i_76_ - (anInt9001 << 12) < 0) {
				int i_78_;
				if ((i_78_ = i_75_ - (anInt9000 << 12)) >= 0) {
				    i_78_ = (anInt9006 - i_78_) / anInt9006;
				    i_77_ += i_78_;
				    i_75_ += anInt9006 * i_78_;
				    i_74_ += i_78_;
				}
				if ((i_78_ = (i_75_ - anInt9006) / anInt9006)
				    > i_77_)
				    i_77_ = i_78_;
				int i_79_ = is[i_73_] - i;
				int i_80_ = -is_36_[i_73_];
				int i_81_ = i_79_ - (i_74_ - anInt9015);
				if (i_81_ > 0) {
				    i_74_ += i_81_;
				    i_77_ += i_81_;
				    i_75_ += anInt9006 * i_81_;
				    i_76_ += anInt9017 * i_81_;
				} else
				    i_80_ -= i_81_;
				if (i_77_ < i_80_)
				    i_77_ = i_80_;
				for (/**/; i_77_ < 0; i_77_++) {
				    int i_82_ = (aByteArray11422
						 [((i_76_ >> 12) * anInt9000
						   + (i_75_ >> 12))]);
				    if (i_82_ != 0)
					is_38_[i_74_++]
					    = anIntArray11423[i_82_ & 0xff];
				    else
					i_74_++;
				    i_75_ += anInt9006;
				}
			    }
			}
			i_72_++;
			anInt8999 += anInt9010;
			anInt9015 += anInt9014;
		    }
		} else if (anInt9017 < 0) {
		    int i_83_ = anInt9023;
		    while (i_83_ < 0) {
			int i_84_ = i_83_ + i_37_;
			if (i_84_ >= 0) {
			    if (i_84_ >= is.length)
				break;
			    int i_85_ = anInt9015;
			    int i_86_ = anInt9022 + anInt9024;
			    int i_87_ = anInt8999 + anInt9025;
			    int i_88_ = anInt9011;
			    int i_89_;
			    if ((i_89_ = i_86_ - (anInt9000 << 12)) >= 0) {
				i_89_ = (anInt9006 - i_89_) / anInt9006;
				i_88_ += i_89_;
				i_86_ += anInt9006 * i_89_;
				i_87_ += anInt9017 * i_89_;
				i_85_ += i_89_;
			    }
			    if ((i_89_ = (i_86_ - anInt9006) / anInt9006)
				> i_88_)
				i_88_ = i_89_;
			    if ((i_89_ = i_87_ - (anInt9001 << 12)) >= 0) {
				i_89_ = (anInt9017 - i_89_) / anInt9017;
				i_88_ += i_89_;
				i_86_ += anInt9006 * i_89_;
				i_87_ += anInt9017 * i_89_;
				i_85_ += i_89_;
			    }
			    if ((i_89_ = (i_87_ - anInt9017) / anInt9017)
				> i_88_)
				i_88_ = i_89_;
			    int i_90_ = is[i_84_] - i;
			    int i_91_ = -is_36_[i_84_];
			    int i_92_ = i_90_ - (i_85_ - anInt9015);
			    if (i_92_ > 0) {
				i_85_ += i_92_;
				i_88_ += i_92_;
				i_86_ += anInt9006 * i_92_;
				i_87_ += anInt9017 * i_92_;
			    } else
				i_91_ -= i_92_;
			    if (i_88_ < i_91_)
				i_88_ = i_91_;
			    for (/**/; i_88_ < 0; i_88_++) {
				int i_93_
				    = (aByteArray11422
				       [(i_87_ >> 12) * anInt9000 + (i_86_
								     >> 12)]);
				if (i_93_ != 0)
				    is_38_[i_85_++]
					= anIntArray11423[i_93_ & 0xff];
				else
				    i_85_++;
				i_86_ += anInt9006;
				i_87_ += anInt9017;
			    }
			}
			i_83_++;
			anInt9022 += anInt9018;
			anInt8999 += anInt9010;
			anInt9015 += anInt9014;
		    }
		} else {
		    int i_94_ = anInt9023;
		    while (i_94_ < 0) {
			int i_95_ = i_94_ + i_37_;
			if (i_95_ >= 0) {
			    if (i_95_ >= is.length)
				break;
			    int i_96_ = anInt9015;
			    int i_97_ = anInt9022 + anInt9024;
			    int i_98_ = anInt8999 + anInt9025;
			    int i_99_ = anInt9011;
			    int i_100_;
			    if ((i_100_ = i_97_ - (anInt9000 << 12)) >= 0) {
				i_100_ = (anInt9006 - i_100_) / anInt9006;
				i_99_ += i_100_;
				i_97_ += anInt9006 * i_100_;
				i_98_ += anInt9017 * i_100_;
				i_96_ += i_100_;
			    }
			    if ((i_100_ = (i_97_ - anInt9006) / anInt9006)
				> i_99_)
				i_99_ = i_100_;
			    if (i_98_ < 0) {
				i_100_ = (anInt9017 - 1 - i_98_) / anInt9017;
				i_99_ += i_100_;
				i_97_ += anInt9006 * i_100_;
				i_98_ += anInt9017 * i_100_;
				i_96_ += i_100_;
			    }
			    if ((i_100_ = (1 + i_98_ - (anInt9001 << 12)
					   - anInt9017) / anInt9017)
				> i_99_)
				i_99_ = i_100_;
			    int i_101_ = is[i_95_] - i;
			    int i_102_ = -is_36_[i_95_];
			    int i_103_ = i_101_ - (i_96_ - anInt9015);
			    if (i_103_ > 0) {
				i_96_ += i_103_;
				i_99_ += i_103_;
				i_97_ += anInt9006 * i_103_;
				i_98_ += anInt9017 * i_103_;
			    } else
				i_102_ -= i_103_;
			    if (i_99_ < i_102_)
				i_99_ = i_102_;
			    for (/**/; i_99_ < 0; i_99_++) {
				int i_104_
				    = (aByteArray11422
				       [(i_98_ >> 12) * anInt9000 + (i_97_
								     >> 12)]);
				if (i_104_ != 0)
				    is_38_[i_96_++]
					= anIntArray11423[i_104_ & 0xff];
				else
				    i_96_++;
				i_97_ += anInt9006;
				i_98_ += anInt9017;
			    }
			}
			i_94_++;
			anInt9022 += anInt9018;
			anInt8999 += anInt9010;
			anInt9015 += anInt9014;
		    }
		}
	    } else if (anInt9017 == 0) {
		int i_105_ = anInt9023;
		while (i_105_ < 0) {
		    int i_106_ = i_105_ + i_37_;
		    if (i_106_ >= 0) {
			if (i_106_ >= is.length)
			    break;
			int i_107_ = anInt9015;
			int i_108_ = anInt9022 + anInt9024;
			int i_109_ = anInt8999;
			int i_110_ = anInt9011;
			if (i_109_ >= 0 && i_109_ - (anInt9001 << 12) < 0) {
			    if (i_108_ < 0) {
				int i_111_
				    = (anInt9006 - 1 - i_108_) / anInt9006;
				i_110_ += i_111_;
				i_108_ += anInt9006 * i_111_;
				i_107_ += i_111_;
			    }
			    int i_112_;
			    if ((i_112_ = (1 + i_108_ - (anInt9000 << 12)
					   - anInt9006) / anInt9006)
				> i_110_)
				i_110_ = i_112_;
			    int i_113_ = is[i_106_] - i;
			    int i_114_ = -is_36_[i_106_];
			    int i_115_ = i_113_ - (i_107_ - anInt9015);
			    if (i_115_ > 0) {
				i_107_ += i_115_;
				i_110_ += i_115_;
				i_108_ += anInt9006 * i_115_;
				i_109_ += anInt9017 * i_115_;
			    } else
				i_114_ -= i_115_;
			    if (i_110_ < i_114_)
				i_110_ = i_114_;
			    for (/**/; i_110_ < 0; i_110_++) {
				int i_116_
				    = (aByteArray11422
				       [(i_109_ >> 12) * anInt9000 + (i_108_
								      >> 12)]);
				if (i_116_ != 0)
				    is_38_[i_107_++]
					= anIntArray11423[i_116_ & 0xff];
				else
				    i_107_++;
				i_108_ += anInt9006;
			    }
			}
		    }
		    i_105_++;
		    anInt9022 += anInt9018;
		    anInt8999 += anInt9010;
		    anInt9015 += anInt9014;
		}
	    } else if (anInt9017 < 0) {
		int i_117_ = anInt9023;
		while (i_117_ < 0) {
		    int i_118_ = i_117_ + i_37_;
		    if (i_118_ >= 0) {
			if (i_118_ >= is.length)
			    break;
			int i_119_ = anInt9015;
			int i_120_ = anInt9022 + anInt9024;
			int i_121_ = anInt8999 + anInt9025;
			int i_122_ = anInt9011;
			if (i_120_ < 0) {
			    int i_123_ = (anInt9006 - 1 - i_120_) / anInt9006;
			    i_122_ += i_123_;
			    i_120_ += anInt9006 * i_123_;
			    i_121_ += anInt9017 * i_123_;
			    i_119_ += i_123_;
			}
			int i_124_;
			if ((i_124_ = (1 + i_120_ - (anInt9000 << 12)
				       - anInt9006) / anInt9006)
			    > i_122_)
			    i_122_ = i_124_;
			if ((i_124_ = i_121_ - (anInt9001 << 12)) >= 0) {
			    i_124_ = (anInt9017 - i_124_) / anInt9017;
			    i_122_ += i_124_;
			    i_120_ += anInt9006 * i_124_;
			    i_121_ += anInt9017 * i_124_;
			    i_119_ += i_124_;
			}
			if ((i_124_ = (i_121_ - anInt9017) / anInt9017)
			    > i_122_)
			    i_122_ = i_124_;
			int i_125_ = is[i_118_] - i;
			int i_126_ = -is_36_[i_118_];
			int i_127_ = i_125_ - (i_119_ - anInt9015);
			if (i_127_ > 0) {
			    i_119_ += i_127_;
			    i_122_ += i_127_;
			    i_120_ += anInt9006 * i_127_;
			    i_121_ += anInt9017 * i_127_;
			} else
			    i_126_ -= i_127_;
			if (i_122_ < i_126_)
			    i_122_ = i_126_;
			for (/**/; i_122_ < 0; i_122_++) {
			    int i_128_
				= (aByteArray11422
				   [(i_121_ >> 12) * anInt9000 + (i_120_
								  >> 12)]);
			    if (i_128_ != 0)
				is_38_[i_119_++]
				    = anIntArray11423[i_128_ & 0xff];
			    else
				i_119_++;
			    i_120_ += anInt9006;
			    i_121_ += anInt9017;
			}
		    }
		    i_117_++;
		    anInt9022 += anInt9018;
		    anInt8999 += anInt9010;
		    anInt9015 += anInt9014;
		}
	    } else {
		int i_129_ = anInt9023;
		while (i_129_ < 0) {
		    int i_130_ = i_129_ + i_37_;
		    if (i_130_ >= 0) {
			if (i_130_ >= is.length)
			    break;
			int i_131_ = anInt9015;
			int i_132_ = anInt9022 + anInt9024;
			int i_133_ = anInt8999 + anInt9025;
			int i_134_ = anInt9011;
			if (i_132_ < 0) {
			    int i_135_ = (anInt9006 - 1 - i_132_) / anInt9006;
			    i_134_ += i_135_;
			    i_132_ += anInt9006 * i_135_;
			    i_133_ += anInt9017 * i_135_;
			    i_131_ += i_135_;
			}
			int i_136_;
			if ((i_136_ = (1 + i_132_ - (anInt9000 << 12)
				       - anInt9006) / anInt9006)
			    > i_134_)
			    i_134_ = i_136_;
			if (i_133_ < 0) {
			    i_136_ = (anInt9017 - 1 - i_133_) / anInt9017;
			    i_134_ += i_136_;
			    i_132_ += anInt9006 * i_136_;
			    i_133_ += anInt9017 * i_136_;
			    i_131_ += i_136_;
			}
			if ((i_136_ = (1 + i_133_ - (anInt9001 << 12)
				       - anInt9017) / anInt9017)
			    > i_134_)
			    i_134_ = i_136_;
			int i_137_ = is[i_130_] - i;
			int i_138_ = -is_36_[i_130_];
			int i_139_ = i_137_ - (i_131_ - anInt9015);
			if (i_139_ > 0) {
			    i_131_ += i_139_;
			    i_134_ += i_139_;
			    i_132_ += anInt9006 * i_139_;
			    i_133_ += anInt9017 * i_139_;
			} else
			    i_138_ -= i_139_;
			if (i_134_ < i_138_)
			    i_134_ = i_138_;
			for (/**/; i_134_ < 0; i_134_++) {
			    int i_140_
				= (aByteArray11422
				   [(i_133_ >> 12) * anInt9000 + (i_132_
								  >> 12)]);
			    if (i_140_ != 0)
				is_38_[i_131_++]
				    = anIntArray11423[i_140_ & 0xff];
			    else
				i_131_++;
			    i_132_ += anInt9006;
			    i_133_ += anInt9017;
			}
		    }
		    i_129_++;
		    anInt9022 += anInt9018;
		    anInt8999 += anInt9010;
		    anInt9015 += anInt9014;
		}
	    }
	}
    }
    
    public Interface21 method2521() {
	throw new IllegalStateException();
    }
    
    public void method2549(int i, int i_141_, Class152 class152, int i_142_,
			   int i_143_) {
	if (aClass182_Sub2_9033.method15226())
	    throw new IllegalStateException();
	int[] is = aClass182_Sub2_9033.anIntArray9466;
	if (is != null) {
	    i += anInt9002;
	    i_141_ += anInt9003;
	    int i_144_ = 0;
	    int i_145_ = aClass182_Sub2_9033.anInt9494 * -476035351;
	    int i_146_ = anInt9000;
	    int i_147_ = anInt9001;
	    int i_148_ = i_145_ - i_146_;
	    int i_149_ = 0;
	    int i_150_ = i + i_141_ * i_145_;
	    if (i_141_ < aClass182_Sub2_9033.anInt9472 * 1722112305) {
		int i_151_
		    = aClass182_Sub2_9033.anInt9472 * 1722112305 - i_141_;
		i_147_ -= i_151_;
		i_141_ = aClass182_Sub2_9033.anInt9472 * 1722112305;
		i_144_ += i_151_ * i_146_;
		i_150_ += i_151_ * i_145_;
	    }
	    if (i_141_ + i_147_ > aClass182_Sub2_9033.anInt9473 * 1920901985)
		i_147_ -= (i_141_ + i_147_
			   - aClass182_Sub2_9033.anInt9473 * 1920901985);
	    if (i < aClass182_Sub2_9033.anInt9470 * 1988019027) {
		int i_152_ = aClass182_Sub2_9033.anInt9470 * 1988019027 - i;
		i_146_ -= i_152_;
		i = aClass182_Sub2_9033.anInt9470 * 1988019027;
		i_144_ += i_152_;
		i_150_ += i_152_;
		i_149_ += i_152_;
		i_148_ += i_152_;
	    }
	    if (i + i_146_ > aClass182_Sub2_9033.anInt9499 * -466178451) {
		int i_153_
		    = i + i_146_ - aClass182_Sub2_9033.anInt9499 * -466178451;
		i_146_ -= i_153_;
		i_149_ += i_153_;
		i_148_ += i_153_;
	    }
	    if (i_146_ > 0 && i_147_ > 0) {
		Class152_Sub1 class152_sub1 = (Class152_Sub1) class152;
		int[] is_154_ = class152_sub1.anIntArray8998;
		int[] is_155_ = class152_sub1.anIntArray8997;
		int i_156_ = i_141_;
		if (i_143_ > i_156_) {
		    i_156_ = i_143_;
		    i_150_ += (i_143_ - i_141_) * i_145_;
		    i_144_ += (i_143_ - i_141_) * anInt9000;
		}
		int i_157_ = (i_143_ + is_154_.length < i_141_ + i_147_
			      ? i_143_ + is_154_.length : i_141_ + i_147_);
		for (int i_158_ = i_156_; i_158_ < i_157_; i_158_++) {
		    int i_159_ = is_154_[i_158_ - i_143_] + i_142_;
		    int i_160_ = is_155_[i_158_ - i_143_];
		    int i_161_ = i_146_;
		    if (i > i_159_) {
			int i_162_ = i - i_159_;
			if (i_162_ >= i_160_) {
			    i_144_ += i_146_ + i_149_;
			    i_150_ += i_146_ + i_148_;
			    continue;
			}
			i_160_ -= i_162_;
		    } else {
			int i_163_ = i_159_ - i;
			if (i_163_ >= i_146_) {
			    i_144_ += i_146_ + i_149_;
			    i_150_ += i_146_ + i_148_;
			    continue;
			}
			i_144_ += i_163_;
			i_161_ -= i_163_;
			i_150_ += i_163_;
		    }
		    int i_164_ = 0;
		    if (i_161_ < i_160_)
			i_160_ = i_161_;
		    else
			i_164_ = i_161_ - i_160_;
		    for (int i_165_ = -i_160_; i_165_ < 0; i_165_++) {
			int i_166_ = aByteArray11422[i_144_++];
			if (i_166_ != 0)
			    is[i_150_++] = anIntArray11423[i_166_ & 0xff];
			else
			    i_150_++;
		    }
		    i_144_ += i_164_ + i_149_;
		    i_150_ += i_164_ + i_148_;
		}
	    }
	}
    }
    
    public void method2480(int i, int i_167_, Class152 class152, int i_168_,
			   int i_169_) {
	if (aClass182_Sub2_9033.method15226())
	    throw new IllegalStateException();
	int[] is = aClass182_Sub2_9033.anIntArray9466;
	if (is != null) {
	    i += anInt9002;
	    i_167_ += anInt9003;
	    int i_170_ = 0;
	    int i_171_ = aClass182_Sub2_9033.anInt9494 * -476035351;
	    int i_172_ = anInt9000;
	    int i_173_ = anInt9001;
	    int i_174_ = i_171_ - i_172_;
	    int i_175_ = 0;
	    int i_176_ = i + i_167_ * i_171_;
	    if (i_167_ < aClass182_Sub2_9033.anInt9472 * 1722112305) {
		int i_177_
		    = aClass182_Sub2_9033.anInt9472 * 1722112305 - i_167_;
		i_173_ -= i_177_;
		i_167_ = aClass182_Sub2_9033.anInt9472 * 1722112305;
		i_170_ += i_177_ * i_172_;
		i_176_ += i_177_ * i_171_;
	    }
	    if (i_167_ + i_173_ > aClass182_Sub2_9033.anInt9473 * 1920901985)
		i_173_ -= (i_167_ + i_173_
			   - aClass182_Sub2_9033.anInt9473 * 1920901985);
	    if (i < aClass182_Sub2_9033.anInt9470 * 1988019027) {
		int i_178_ = aClass182_Sub2_9033.anInt9470 * 1988019027 - i;
		i_172_ -= i_178_;
		i = aClass182_Sub2_9033.anInt9470 * 1988019027;
		i_170_ += i_178_;
		i_176_ += i_178_;
		i_175_ += i_178_;
		i_174_ += i_178_;
	    }
	    if (i + i_172_ > aClass182_Sub2_9033.anInt9499 * -466178451) {
		int i_179_
		    = i + i_172_ - aClass182_Sub2_9033.anInt9499 * -466178451;
		i_172_ -= i_179_;
		i_175_ += i_179_;
		i_174_ += i_179_;
	    }
	    if (i_172_ > 0 && i_173_ > 0) {
		Class152_Sub1 class152_sub1 = (Class152_Sub1) class152;
		int[] is_180_ = class152_sub1.anIntArray8998;
		int[] is_181_ = class152_sub1.anIntArray8997;
		int i_182_ = i_167_;
		if (i_169_ > i_182_) {
		    i_182_ = i_169_;
		    i_176_ += (i_169_ - i_167_) * i_171_;
		    i_170_ += (i_169_ - i_167_) * anInt9000;
		}
		int i_183_ = (i_169_ + is_180_.length < i_167_ + i_173_
			      ? i_169_ + is_180_.length : i_167_ + i_173_);
		for (int i_184_ = i_182_; i_184_ < i_183_; i_184_++) {
		    int i_185_ = is_180_[i_184_ - i_169_] + i_168_;
		    int i_186_ = is_181_[i_184_ - i_169_];
		    int i_187_ = i_172_;
		    if (i > i_185_) {
			int i_188_ = i - i_185_;
			if (i_188_ >= i_186_) {
			    i_170_ += i_172_ + i_175_;
			    i_176_ += i_172_ + i_174_;
			    continue;
			}
			i_186_ -= i_188_;
		    } else {
			int i_189_ = i_185_ - i;
			if (i_189_ >= i_172_) {
			    i_170_ += i_172_ + i_175_;
			    i_176_ += i_172_ + i_174_;
			    continue;
			}
			i_170_ += i_189_;
			i_187_ -= i_189_;
			i_176_ += i_189_;
		    }
		    int i_190_ = 0;
		    if (i_187_ < i_186_)
			i_186_ = i_187_;
		    else
			i_190_ = i_187_ - i_186_;
		    for (int i_191_ = -i_186_; i_191_ < 0; i_191_++) {
			int i_192_ = aByteArray11422[i_170_++];
			if (i_192_ != 0)
			    is[i_176_++] = anIntArray11423[i_192_ & 0xff];
			else
			    i_176_++;
		    }
		    i_170_ += i_190_ + i_175_;
		    i_176_ += i_190_ + i_174_;
		}
	    }
	}
    }
    
    void method14537(boolean bool, boolean bool_193_, boolean bool_194_, int i,
		     int i_195_, float f, int i_196_, int i_197_, int i_198_,
		     int i_199_, int i_200_, int i_201_, boolean bool_202_) {
	if (i_196_ > 0 && i_197_ > 0 && (bool || bool_193_)) {
	    int i_203_ = 0;
	    int i_204_ = 0;
	    int i_205_ = anInt9002 + anInt9000 + anInt9004;
	    int i_206_ = anInt9003 + anInt9001 + anInt9005;
	    int i_207_ = (i_205_ << 16) / i_196_;
	    int i_208_ = (i_206_ << 16) / i_197_;
	    if (anInt9002 > 0) {
		int i_209_ = ((anInt9002 << 16) + i_207_ - 1) / i_207_;
		i += i_209_;
		i_203_ += i_209_ * i_207_ - (anInt9002 << 16);
	    }
	    if (anInt9003 > 0) {
		int i_210_ = ((anInt9003 << 16) + i_208_ - 1) / i_208_;
		i_195_ += i_210_;
		i_204_ += i_210_ * i_208_ - (anInt9003 << 16);
	    }
	    if (anInt9000 < i_205_)
		i_196_ = ((anInt9000 << 16) - i_203_ + i_207_ - 1) / i_207_;
	    if (anInt9001 < i_206_)
		i_197_ = ((anInt9001 << 16) - i_204_ + i_208_ - 1) / i_208_;
	    int i_211_
		= i + i_195_ * (aClass182_Sub2_9033.anInt9494 * -476035351);
	    int i_212_ = aClass182_Sub2_9033.anInt9494 * -476035351 - i_196_;
	    if (i_195_ + i_197_ > aClass182_Sub2_9033.anInt9473 * 1920901985)
		i_197_ -= (i_195_ + i_197_
			   - aClass182_Sub2_9033.anInt9473 * 1920901985);
	    if (i_195_ < aClass182_Sub2_9033.anInt9472 * 1722112305) {
		int i_213_
		    = aClass182_Sub2_9033.anInt9472 * 1722112305 - i_195_;
		i_197_ -= i_213_;
		i_211_
		    += i_213_ * (aClass182_Sub2_9033.anInt9494 * -476035351);
		i_204_ += i_208_ * i_213_;
	    }
	    if (i + i_196_ > aClass182_Sub2_9033.anInt9499 * -466178451) {
		int i_214_
		    = i + i_196_ - aClass182_Sub2_9033.anInt9499 * -466178451;
		i_196_ -= i_214_;
		i_212_ += i_214_;
	    }
	    if (i < aClass182_Sub2_9033.anInt9470 * 1988019027) {
		int i_215_ = aClass182_Sub2_9033.anInt9470 * 1988019027 - i;
		i_196_ -= i_215_;
		i_211_ += i_215_;
		i_203_ += i_207_ * i_215_;
		i_212_ += i_215_;
	    }
	    float[] fs = aClass182_Sub2_9033.aFloatArray9469;
	    int[] is = aClass182_Sub2_9033.anIntArray9466;
	    if (i_200_ == 0) {
		if (i_198_ == 1) {
		    int i_216_ = i_203_;
		    for (int i_217_ = -i_197_; i_217_ < 0; i_217_++) {
			int i_218_ = (i_204_ >> 16) * anInt9000;
			for (int i_219_ = -i_196_; i_219_ < 0; i_219_++) {
			    if (!bool_193_ || f < fs[i_211_]) {
				if (bool)
				    is[i_211_] = (anIntArray11423
						  [((aByteArray11422
						     [(i_203_ >> 16) + i_218_])
						    & 0xff)]);
				if (bool_193_ && bool_202_)
				    fs[i_211_] = f;
			    }
			    i_203_ += i_207_;
			    i_211_++;
			}
			i_204_ += i_208_;
			i_203_ = i_216_;
			i_211_ += i_212_;
		    }
		} else if (i_198_ == 0) {
		    int i_220_ = (i_199_ & 0xff0000) >> 16;
		    int i_221_ = (i_199_ & 0xff00) >> 8;
		    int i_222_ = i_199_ & 0xff;
		    int i_223_ = i_203_;
		    for (int i_224_ = -i_197_; i_224_ < 0; i_224_++) {
			int i_225_ = (i_204_ >> 16) * anInt9000;
			for (int i_226_ = -i_196_; i_226_ < 0; i_226_++) {
			    if (!bool_193_ || f < fs[i_211_]) {
				if (bool) {
				    int i_227_ = (anIntArray11423
						  [((aByteArray11422
						     [(i_203_ >> 16) + i_225_])
						    & 0xff)]);
				    int i_228_ = ((i_227_ & 0xff0000) * i_220_
						  & ~0xffffff);
				    int i_229_ = ((i_227_ & 0xff00) * i_221_
						  & 0xff0000);
				    int i_230_
					= (i_227_ & 0xff) * i_222_ & 0xff00;
				    is[i_211_]
					= (i_228_ | i_229_ | i_230_) >>> 8;
				}
				if (bool_193_ && bool_202_)
				    fs[i_211_] = f;
			    }
			    i_203_ += i_207_;
			    i_211_++;
			}
			i_204_ += i_208_;
			i_203_ = i_223_;
			i_211_ += i_212_;
		    }
		} else if (i_198_ == 3) {
		    int i_231_ = i_203_;
		    for (int i_232_ = -i_197_; i_232_ < 0; i_232_++) {
			int i_233_ = (i_204_ >> 16) * anInt9000;
			for (int i_234_ = -i_196_; i_234_ < 0; i_234_++) {
			    if (!bool_193_ || f < fs[i_211_]) {
				if (bool) {
				    byte i_235_ = (aByteArray11422
						   [(i_203_ >> 16) + i_233_]);
				    int i_236_
					= (i_235_ > 0 ? anIntArray11423[i_235_]
					   : 0);
				    int i_237_ = i_236_ + i_199_;
				    int i_238_ = ((i_236_ & 0xff00ff)
						  + (i_199_ & 0xff00ff));
				    int i_239_
					= ((i_238_ & 0x1000100)
					   + (i_237_ - i_238_ & 0x10000));
				    is[i_211_]
					= i_237_ - i_239_ | i_239_ - (i_239_
								      >>> 8);
				}
				if (bool_193_ && bool_202_)
				    fs[i_211_] = f;
			    }
			    i_203_ += i_207_;
			    i_211_++;
			}
			i_204_ += i_208_;
			i_203_ = i_231_;
			i_211_ += i_212_;
		    }
		} else if (i_198_ == 2) {
		    int i_240_ = i_199_ >>> 24;
		    int i_241_ = 256 - i_240_;
		    int i_242_ = (i_199_ & 0xff00ff) * i_241_ & ~0xff00ff;
		    int i_243_ = (i_199_ & 0xff00) * i_241_ & 0xff0000;
		    i_199_ = (i_242_ | i_243_) >>> 8;
		    int i_244_ = i_203_;
		    for (int i_245_ = -i_197_; i_245_ < 0; i_245_++) {
			int i_246_ = (i_204_ >> 16) * anInt9000;
			for (int i_247_ = -i_196_; i_247_ < 0; i_247_++) {
			    if (!bool_193_ || f < fs[i_211_]) {
				if (bool) {
				    int i_248_ = (anIntArray11423
						  [((aByteArray11422
						     [(i_203_ >> 16) + i_246_])
						    & 0xff)]);
				    i_242_ = ((i_248_ & 0xff00ff) * i_240_
					      & ~0xff00ff);
				    i_243_ = ((i_248_ & 0xff00) * i_240_
					      & 0xff0000);
				    is[i_211_]
					= ((i_242_ | i_243_) >>> 8) + i_199_;
				}
				if (bool_193_ && bool_202_)
				    fs[i_211_] = f;
			    }
			    i_203_ += i_207_;
			    i_211_++;
			}
			i_204_ += i_208_;
			i_203_ = i_244_;
			i_211_ += i_212_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_200_ == 1) {
		if (i_198_ == 1) {
		    int i_249_ = i_203_;
		    for (int i_250_ = -i_197_; i_250_ < 0; i_250_++) {
			int i_251_ = (i_204_ >> 16) * anInt9000;
			for (int i_252_ = -i_196_; i_252_ < 0; i_252_++) {
			    if (!bool_193_ || f < fs[i_211_]) {
				int i_253_
				    = aByteArray11422[(i_203_ >> 16) + i_251_];
				if (i_253_ != 0) {
				    if (bool)
					is[i_211_]
					    = anIntArray11423[i_253_ & 0xff];
				    if (bool_193_ && bool_202_)
					fs[i_211_] = f;
				}
			    }
			    i_203_ += i_207_;
			    i_211_++;
			}
			i_204_ += i_208_;
			i_203_ = i_249_;
			i_211_ += i_212_;
		    }
		} else if (i_198_ == 0) {
		    int i_254_ = i_203_;
		    if ((i_199_ & 0xffffff) == 16777215) {
			int i_255_ = i_199_ >>> 24;
			int i_256_ = 256 - i_255_;
			for (int i_257_ = -i_197_; i_257_ < 0; i_257_++) {
			    int i_258_ = (i_204_ >> 16) * anInt9000;
			    for (int i_259_ = -i_196_; i_259_ < 0; i_259_++) {
				if (!bool_193_ || f < fs[i_211_]) {
				    int i_260_ = (aByteArray11422
						  [(i_203_ >> 16) + i_258_]);
				    if (i_260_ != 0) {
					if (bool) {
					    int i_261_ = (anIntArray11423
							  [i_260_ & 0xff]);
					    int i_262_ = is[i_211_];
					    is[i_211_]
						= (((((i_261_ & 0xff00ff)
						      * i_255_)
						     + ((i_262_ & 0xff00ff)
							* i_256_))
						    & ~0xff00ff)
						   + ((((i_261_ & 0xff00)
							* i_255_)
						       + ((i_262_ & 0xff00)
							  * i_256_))
						      & 0xff0000)) >> 8;
					}
					if (bool_193_ && bool_202_)
					    fs[i_211_] = f;
				    }
				}
				i_203_ += i_207_;
				i_211_++;
			    }
			    i_204_ += i_208_;
			    i_203_ = i_254_;
			    i_211_ += i_212_;
			}
		    } else {
			int i_263_ = (i_199_ & 0xff0000) >> 16;
			int i_264_ = (i_199_ & 0xff00) >> 8;
			int i_265_ = i_199_ & 0xff;
			int i_266_ = i_199_ >>> 24;
			int i_267_ = 256 - i_266_;
			for (int i_268_ = -i_197_; i_268_ < 0; i_268_++) {
			    int i_269_ = (i_204_ >> 16) * anInt9000;
			    for (int i_270_ = -i_196_; i_270_ < 0; i_270_++) {
				if (!bool_193_ || f < fs[i_211_]) {
				    int i_271_ = (aByteArray11422
						  [(i_203_ >> 16) + i_269_]);
				    if (i_271_ != 0) {
					int i_272_
					    = anIntArray11423[i_271_ & 0xff];
					if (i_266_ != 255) {
					    if (bool) {
						int i_273_
						    = (((i_272_ & 0xff0000)
							* i_263_)
						       & ~0xffffff);
						int i_274_
						    = (((i_272_ & 0xff00)
							* i_264_)
						       & 0xff0000);
						int i_275_
						    = ((i_272_ & 0xff) * i_265_
						       & 0xff00);
						i_272_ = (i_273_ | i_274_
							  | i_275_) >>> 8;
						int i_276_ = is[i_211_];
						is[i_211_]
						    = (((((i_272_ & 0xff00ff)
							  * i_266_)
							 + ((i_276_ & 0xff00ff)
							    * i_267_))
							& ~0xff00ff)
						       + ((((i_272_ & 0xff00)
							    * i_266_)
							   + ((i_276_ & 0xff00)
							      * i_267_))
							  & 0xff0000)) >> 8;
					    }
					    if (bool_193_ && bool_202_)
						fs[i_211_] = f;
					} else {
					    if (bool) {
						int i_277_
						    = (((i_272_ & 0xff0000)
							* i_263_)
						       & ~0xffffff);
						int i_278_
						    = (((i_272_ & 0xff00)
							* i_264_)
						       & 0xff0000);
						int i_279_
						    = ((i_272_ & 0xff) * i_265_
						       & 0xff00);
						is[i_211_] = (i_277_ | i_278_
							      | i_279_) >>> 8;
					    }
					    if (bool_193_ && bool_202_)
						fs[i_211_] = f;
					}
				    }
				}
				i_203_ += i_207_;
				i_211_++;
			    }
			    i_204_ += i_208_;
			    i_203_ = i_254_;
			    i_211_ += i_212_;
			}
		    }
		} else if (i_198_ == 3) {
		    int i_280_ = i_203_;
		    int i_281_ = i_199_ >>> 24;
		    int i_282_ = 256 - i_281_;
		    for (int i_283_ = -i_197_; i_283_ < 0; i_283_++) {
			int i_284_ = (i_204_ >> 16) * anInt9000;
			for (int i_285_ = -i_196_; i_285_ < 0; i_285_++) {
			    if (!bool_193_ || f < fs[i_211_]) {
				if (bool) {
				    byte i_286_ = (aByteArray11422
						   [(i_203_ >> 16) + i_284_]);
				    int i_287_
					= (i_286_ > 0 ? anIntArray11423[i_286_]
					   : 0);
				    int i_288_ = i_287_ + i_199_;
				    int i_289_ = ((i_287_ & 0xff00ff)
						  + (i_199_ & 0xff00ff));
				    int i_290_
					= ((i_289_ & 0x1000100)
					   + (i_288_ - i_289_ & 0x10000));
				    i_290_
					= i_288_ - i_290_ | i_290_ - (i_290_
								      >>> 8);
				    if (i_287_ == 0 && i_281_ != 255) {
					i_287_ = i_290_;
					i_290_ = is[i_211_];
					i_290_
					    = ((((i_287_ & 0xff00ff) * i_281_
						 + ((i_290_ & 0xff00ff)
						    * i_282_))
						& ~0xff00ff)
					       + (((i_287_ & 0xff00) * i_281_
						   + ((i_290_ & 0xff00)
						      * i_282_))
						  & 0xff0000)) >> 8;
				    }
				    is[i_211_] = i_290_;
				}
				if (bool_193_ && bool_202_)
				    fs[i_211_] = f;
			    }
			    i_203_ += i_207_;
			    i_211_++;
			}
			i_204_ += i_208_;
			i_203_ = i_280_;
			i_211_ += i_212_;
		    }
		} else if (i_198_ == 2) {
		    int i_291_ = i_199_ >>> 24;
		    int i_292_ = 256 - i_291_;
		    int i_293_ = (i_199_ & 0xff00ff) * i_292_ & ~0xff00ff;
		    int i_294_ = (i_199_ & 0xff00) * i_292_ & 0xff0000;
		    i_199_ = (i_293_ | i_294_) >>> 8;
		    int i_295_ = i_203_;
		    for (int i_296_ = -i_197_; i_296_ < 0; i_296_++) {
			int i_297_ = (i_204_ >> 16) * anInt9000;
			for (int i_298_ = -i_196_; i_298_ < 0; i_298_++) {
			    if (!bool_193_ || f < fs[i_211_]) {
				int i_299_
				    = aByteArray11422[(i_203_ >> 16) + i_297_];
				if (i_299_ != 0) {
				    if (bool) {
					int i_300_
					    = anIntArray11423[i_299_ & 0xff];
					i_293_ = ((i_300_ & 0xff00ff) * i_291_
						  & ~0xff00ff);
					i_294_ = ((i_300_ & 0xff00) * i_291_
						  & 0xff0000);
					is[i_211_] = (((i_293_ | i_294_) >>> 8)
						      + i_199_);
				    }
				    if (bool_193_ && bool_202_)
					fs[i_211_] = f;
				}
			    }
			    i_203_ += i_207_;
			    i_211_++;
			}
			i_204_ += i_208_;
			i_203_ = i_295_;
			i_211_ += i_212_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_200_ == 2) {
		if (i_198_ == 1) {
		    int i_301_ = i_203_;
		    for (int i_302_ = -i_197_; i_302_ < 0; i_302_++) {
			int i_303_ = (i_204_ >> 16) * anInt9000;
			for (int i_304_ = -i_196_; i_304_ < 0; i_304_++) {
			    if (!bool_193_ || f < fs[i_211_]) {
				int i_305_
				    = aByteArray11422[(i_203_ >> 16) + i_303_];
				if (i_305_ != 0) {
				    if (bool) {
					int i_306_
					    = anIntArray11423[i_305_ & 0xff];
					int i_307_ = is[i_211_];
					int i_308_ = i_306_ + i_307_;
					int i_309_ = ((i_306_ & 0xff00ff)
						      + (i_307_ & 0xff00ff));
					i_307_
					    = ((i_309_ & 0x1000100)
					       + (i_308_ - i_309_ & 0x10000));
					is[i_211_]
					    = (i_308_ - i_307_
					       | i_307_ - (i_307_ >>> 8));
				    }
				    if (bool_193_ && bool_202_)
					fs[i_211_] = f;
				}
			    }
			    i_203_ += i_207_;
			    i_211_++;
			}
			i_204_ += i_208_;
			i_203_ = i_301_;
			i_211_ += i_212_;
		    }
		} else if (i_198_ == 0) {
		    int i_310_ = i_203_;
		    int i_311_ = (i_199_ & 0xff0000) >> 16;
		    int i_312_ = (i_199_ & 0xff00) >> 8;
		    int i_313_ = i_199_ & 0xff;
		    for (int i_314_ = -i_197_; i_314_ < 0; i_314_++) {
			int i_315_ = (i_204_ >> 16) * anInt9000;
			for (int i_316_ = -i_196_; i_316_ < 0; i_316_++) {
			    if (!bool_193_ || f < fs[i_211_]) {
				int i_317_
				    = aByteArray11422[(i_203_ >> 16) + i_315_];
				if (i_317_ != 0) {
				    if (bool) {
					int i_318_
					    = anIntArray11423[i_317_ & 0xff];
					int i_319_
					    = ((i_318_ & 0xff0000) * i_311_
					       & ~0xffffff);
					int i_320_
					    = ((i_318_ & 0xff00) * i_312_
					       & 0xff0000);
					int i_321_ = ((i_318_ & 0xff) * i_313_
						      & 0xff00);
					i_318_
					    = (i_319_ | i_320_ | i_321_) >>> 8;
					int i_322_ = is[i_211_];
					int i_323_ = i_318_ + i_322_;
					int i_324_ = ((i_318_ & 0xff00ff)
						      + (i_322_ & 0xff00ff));
					i_322_
					    = ((i_324_ & 0x1000100)
					       + (i_323_ - i_324_ & 0x10000));
					is[i_211_]
					    = (i_323_ - i_322_
					       | i_322_ - (i_322_ >>> 8));
				    }
				    if (bool_193_ && bool_202_)
					fs[i_211_] = f;
				}
			    }
			    i_203_ += i_207_;
			    i_211_++;
			}
			i_204_ += i_208_;
			i_203_ = i_310_;
			i_211_ += i_212_;
		    }
		} else if (i_198_ == 3) {
		    int i_325_ = i_203_;
		    for (int i_326_ = -i_197_; i_326_ < 0; i_326_++) {
			int i_327_ = (i_204_ >> 16) * anInt9000;
			for (int i_328_ = -i_196_; i_328_ < 0; i_328_++) {
			    if (!bool_193_ || f < fs[i_211_]) {
				if (bool) {
				    byte i_329_ = (aByteArray11422
						   [(i_203_ >> 16) + i_327_]);
				    int i_330_
					= (i_329_ > 0 ? anIntArray11423[i_329_]
					   : 0);
				    int i_331_ = i_330_ + i_199_;
				    int i_332_ = ((i_330_ & 0xff00ff)
						  + (i_199_ & 0xff00ff));
				    int i_333_
					= ((i_332_ & 0x1000100)
					   + (i_331_ - i_332_ & 0x10000));
				    i_330_
					= i_331_ - i_333_ | i_333_ - (i_333_
								      >>> 8);
				    i_333_ = is[i_211_];
				    i_331_ = i_330_ + i_333_;
				    i_332_
					= (i_330_ & 0xff00ff) + (i_333_
								 & 0xff00ff);
				    i_333_ = ((i_332_ & 0x1000100)
					      + (i_331_ - i_332_ & 0x10000));
				    is[i_211_]
					= i_331_ - i_333_ | i_333_ - (i_333_
								      >>> 8);
				}
				if (bool_193_ && bool_202_)
				    fs[i_211_] = f;
			    }
			    i_203_ += i_207_;
			    i_211_++;
			}
			i_204_ += i_208_;
			i_203_ = i_325_;
			i_211_ += i_212_;
		    }
		} else if (i_198_ == 2) {
		    int i_334_ = i_199_ >>> 24;
		    int i_335_ = 256 - i_334_;
		    int i_336_ = (i_199_ & 0xff00ff) * i_335_ & ~0xff00ff;
		    int i_337_ = (i_199_ & 0xff00) * i_335_ & 0xff0000;
		    i_199_ = (i_336_ | i_337_) >>> 8;
		    int i_338_ = i_203_;
		    for (int i_339_ = -i_197_; i_339_ < 0; i_339_++) {
			int i_340_ = (i_204_ >> 16) * anInt9000;
			for (int i_341_ = -i_196_; i_341_ < 0; i_341_++) {
			    if (!bool_193_ || f < fs[i_211_]) {
				int i_342_
				    = aByteArray11422[(i_203_ >> 16) + i_340_];
				if (i_342_ != 0) {
				    if (bool) {
					int i_343_
					    = anIntArray11423[i_342_ & 0xff];
					i_336_ = ((i_343_ & 0xff00ff) * i_334_
						  & ~0xff00ff);
					i_337_ = ((i_343_ & 0xff00) * i_334_
						  & 0xff0000);
					i_343_ = (((i_336_ | i_337_) >>> 8)
						  + i_199_);
					int i_344_ = is[i_211_];
					int i_345_ = i_343_ + i_344_;
					int i_346_ = ((i_343_ & 0xff00ff)
						      + (i_344_ & 0xff00ff));
					i_344_
					    = ((i_346_ & 0x1000100)
					       + (i_345_ - i_346_ & 0x10000));
					is[i_211_]
					    = (i_345_ - i_344_
					       | i_344_ - (i_344_ >>> 8));
				    }
				    if (bool_193_ && bool_202_)
					fs[i_211_] = f;
				}
			    }
			    i_203_ += i_207_;
			    i_211_++;
			}
			i_204_ += i_208_;
			i_203_ = i_338_;
			i_211_ += i_212_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    void method2483(int i, int i_347_, int i_348_, int i_349_, int i_350_,
		    int i_351_, int i_352_, int i_353_) {
	if (aClass182_Sub2_9033.method15226())
	    throw new IllegalStateException();
	if (i_348_ > 0 && i_349_ > 0) {
	    int[] is = aClass182_Sub2_9033.anIntArray9466;
	    if (is != null) {
		int i_354_ = 0;
		int i_355_ = 0;
		int i_356_ = aClass182_Sub2_9033.anInt9494 * -476035351;
		int i_357_ = anInt9002 + anInt9000 + anInt9004;
		int i_358_ = anInt9003 + anInt9001 + anInt9005;
		int i_359_ = (i_357_ << 16) / i_348_;
		int i_360_ = (i_358_ << 16) / i_349_;
		if (anInt9002 > 0) {
		    int i_361_ = ((anInt9002 << 16) + i_359_ - 1) / i_359_;
		    i += i_361_;
		    i_354_ += i_361_ * i_359_ - (anInt9002 << 16);
		}
		if (anInt9003 > 0) {
		    int i_362_ = ((anInt9003 << 16) + i_360_ - 1) / i_360_;
		    i_347_ += i_362_;
		    i_355_ += i_362_ * i_360_ - (anInt9003 << 16);
		}
		if (anInt9000 < i_357_)
		    i_348_
			= ((anInt9000 << 16) - i_354_ + i_359_ - 1) / i_359_;
		if (anInt9001 < i_358_)
		    i_349_
			= ((anInt9001 << 16) - i_355_ + i_360_ - 1) / i_360_;
		int i_363_ = i + i_347_ * i_356_;
		int i_364_ = i_356_ - i_348_;
		if (i_347_ + i_349_
		    > aClass182_Sub2_9033.anInt9473 * 1920901985)
		    i_349_ -= (i_347_ + i_349_
			       - aClass182_Sub2_9033.anInt9473 * 1920901985);
		if (i_347_ < aClass182_Sub2_9033.anInt9472 * 1722112305) {
		    int i_365_
			= aClass182_Sub2_9033.anInt9472 * 1722112305 - i_347_;
		    i_349_ -= i_365_;
		    i_363_ += i_365_ * i_356_;
		    i_355_ += i_360_ * i_365_;
		}
		if (i + i_348_ > aClass182_Sub2_9033.anInt9499 * -466178451) {
		    int i_366_
			= (i + i_348_
			   - aClass182_Sub2_9033.anInt9499 * -466178451);
		    i_348_ -= i_366_;
		    i_364_ += i_366_;
		}
		if (i < aClass182_Sub2_9033.anInt9470 * 1988019027) {
		    int i_367_
			= aClass182_Sub2_9033.anInt9470 * 1988019027 - i;
		    i_348_ -= i_367_;
		    i_363_ += i_367_;
		    i_354_ += i_359_ * i_367_;
		    i_364_ += i_367_;
		}
		if (i_352_ == 0) {
		    if (i_350_ == 1) {
			int i_368_ = i_354_;
			for (int i_369_ = -i_349_; i_369_ < 0; i_369_++) {
			    int i_370_ = (i_355_ >> 16) * anInt9000;
			    for (int i_371_ = -i_348_; i_371_ < 0; i_371_++) {
				is[i_363_++]
				    = (anIntArray11423
				       [(aByteArray11422
					 [(i_354_ >> 16) + i_370_]) & 0xff]);
				i_354_ += i_359_;
			    }
			    i_355_ += i_360_;
			    i_354_ = i_368_;
			    i_363_ += i_364_;
			}
		    } else if (i_350_ == 0) {
			int i_372_ = (i_351_ & 0xff0000) >> 16;
			int i_373_ = (i_351_ & 0xff00) >> 8;
			int i_374_ = i_351_ & 0xff;
			int i_375_ = i_354_;
			for (int i_376_ = -i_349_; i_376_ < 0; i_376_++) {
			    int i_377_ = (i_355_ >> 16) * anInt9000;
			    for (int i_378_ = -i_348_; i_378_ < 0; i_378_++) {
				int i_379_
				    = (anIntArray11423
				       [(aByteArray11422
					 [(i_354_ >> 16) + i_377_]) & 0xff]);
				int i_380_
				    = (i_379_ & 0xff0000) * i_372_ & ~0xffffff;
				int i_381_
				    = (i_379_ & 0xff00) * i_373_ & 0xff0000;
				int i_382_ = (i_379_ & 0xff) * i_374_ & 0xff00;
				is[i_363_++]
				    = (i_380_ | i_381_ | i_382_) >>> 8;
				i_354_ += i_359_;
			    }
			    i_355_ += i_360_;
			    i_354_ = i_375_;
			    i_363_ += i_364_;
			}
		    } else if (i_350_ == 3) {
			int i_383_ = i_354_;
			for (int i_384_ = -i_349_; i_384_ < 0; i_384_++) {
			    int i_385_ = (i_355_ >> 16) * anInt9000;
			    for (int i_386_ = -i_348_; i_386_ < 0; i_386_++) {
				byte i_387_
				    = aByteArray11422[(i_354_ >> 16) + i_385_];
				int i_388_
				    = i_387_ > 0 ? anIntArray11423[i_387_] : 0;
				int i_389_ = i_388_ + i_351_;
				int i_390_ = ((i_388_ & 0xff00ff)
					      + (i_351_ & 0xff00ff));
				int i_391_ = ((i_390_ & 0x1000100)
					      + (i_389_ - i_390_ & 0x10000));
				is[i_363_++]
				    = i_389_ - i_391_ | i_391_ - (i_391_
								  >>> 8);
				i_354_ += i_359_;
			    }
			    i_355_ += i_360_;
			    i_354_ = i_383_;
			    i_363_ += i_364_;
			}
		    } else if (i_350_ == 2) {
			int i_392_ = i_351_ >>> 24;
			int i_393_ = 256 - i_392_;
			int i_394_ = (i_351_ & 0xff00ff) * i_393_ & ~0xff00ff;
			int i_395_ = (i_351_ & 0xff00) * i_393_ & 0xff0000;
			i_351_ = (i_394_ | i_395_) >>> 8;
			int i_396_ = i_354_;
			for (int i_397_ = -i_349_; i_397_ < 0; i_397_++) {
			    int i_398_ = (i_355_ >> 16) * anInt9000;
			    for (int i_399_ = -i_348_; i_399_ < 0; i_399_++) {
				int i_400_
				    = (anIntArray11423
				       [(aByteArray11422
					 [(i_354_ >> 16) + i_398_]) & 0xff]);
				i_394_
				    = (i_400_ & 0xff00ff) * i_392_ & ~0xff00ff;
				i_395_ = (i_400_ & 0xff00) * i_392_ & 0xff0000;
				is[i_363_++]
				    = ((i_394_ | i_395_) >>> 8) + i_351_;
				i_354_ += i_359_;
			    }
			    i_355_ += i_360_;
			    i_354_ = i_396_;
			    i_363_ += i_364_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_352_ == 1) {
		    if (i_350_ == 1) {
			int i_401_ = i_354_;
			for (int i_402_ = -i_349_; i_402_ < 0; i_402_++) {
			    int i_403_ = (i_355_ >> 16) * anInt9000;
			    for (int i_404_ = -i_348_; i_404_ < 0; i_404_++) {
				int i_405_
				    = aByteArray11422[(i_354_ >> 16) + i_403_];
				if (i_405_ != 0)
				    is[i_363_++]
					= anIntArray11423[i_405_ & 0xff];
				else
				    i_363_++;
				i_354_ += i_359_;
			    }
			    i_355_ += i_360_;
			    i_354_ = i_401_;
			    i_363_ += i_364_;
			}
		    } else if (i_350_ == 0) {
			int i_406_ = i_354_;
			if ((i_351_ & 0xffffff) == 16777215) {
			    int i_407_ = i_351_ >>> 24;
			    int i_408_ = 256 - i_407_;
			    for (int i_409_ = -i_349_; i_409_ < 0; i_409_++) {
				int i_410_ = (i_355_ >> 16) * anInt9000;
				for (int i_411_ = -i_348_; i_411_ < 0;
				     i_411_++) {
				    int i_412_ = (aByteArray11422
						  [(i_354_ >> 16) + i_410_]);
				    if (i_412_ != 0) {
					int i_413_
					    = anIntArray11423[i_412_ & 0xff];
					int i_414_ = is[i_363_];
					is[i_363_++]
					    = ((((i_413_ & 0xff00ff) * i_407_
						 + ((i_414_ & 0xff00ff)
						    * i_408_))
						& ~0xff00ff)
					       + (((i_413_ & 0xff00) * i_407_
						   + ((i_414_ & 0xff00)
						      * i_408_))
						  & 0xff0000)) >> 8;
				    } else
					i_363_++;
				    i_354_ += i_359_;
				}
				i_355_ += i_360_;
				i_354_ = i_406_;
				i_363_ += i_364_;
			    }
			} else {
			    int i_415_ = (i_351_ & 0xff0000) >> 16;
			    int i_416_ = (i_351_ & 0xff00) >> 8;
			    int i_417_ = i_351_ & 0xff;
			    int i_418_ = i_351_ >>> 24;
			    int i_419_ = 256 - i_418_;
			    for (int i_420_ = -i_349_; i_420_ < 0; i_420_++) {
				int i_421_ = (i_355_ >> 16) * anInt9000;
				for (int i_422_ = -i_348_; i_422_ < 0;
				     i_422_++) {
				    int i_423_ = (aByteArray11422
						  [(i_354_ >> 16) + i_421_]);
				    if (i_423_ != 0) {
					int i_424_
					    = anIntArray11423[i_423_ & 0xff];
					if (i_418_ != 255) {
					    int i_425_
						= ((i_424_ & 0xff0000) * i_415_
						   & ~0xffffff);
					    int i_426_
						= ((i_424_ & 0xff00) * i_416_
						   & 0xff0000);
					    int i_427_
						= ((i_424_ & 0xff) * i_417_
						   & 0xff00);
					    i_424_ = (i_425_ | i_426_
						      | i_427_) >>> 8;
					    int i_428_ = is[i_363_];
					    is[i_363_++]
						= (((((i_424_ & 0xff00ff)
						      * i_418_)
						     + ((i_428_ & 0xff00ff)
							* i_419_))
						    & ~0xff00ff)
						   + ((((i_424_ & 0xff00)
							* i_418_)
						       + ((i_428_ & 0xff00)
							  * i_419_))
						      & 0xff0000)) >> 8;
					} else {
					    int i_429_
						= ((i_424_ & 0xff0000) * i_415_
						   & ~0xffffff);
					    int i_430_
						= ((i_424_ & 0xff00) * i_416_
						   & 0xff0000);
					    int i_431_
						= ((i_424_ & 0xff) * i_417_
						   & 0xff00);
					    is[i_363_++] = (i_429_ | i_430_
							    | i_431_) >>> 8;
					}
				    } else
					i_363_++;
				    i_354_ += i_359_;
				}
				i_355_ += i_360_;
				i_354_ = i_406_;
				i_363_ += i_364_;
			    }
			}
		    } else if (i_350_ == 3) {
			int i_432_ = i_354_;
			int i_433_ = i_351_ >>> 24;
			int i_434_ = 256 - i_433_;
			for (int i_435_ = -i_349_; i_435_ < 0; i_435_++) {
			    int i_436_ = (i_355_ >> 16) * anInt9000;
			    for (int i_437_ = -i_348_; i_437_ < 0; i_437_++) {
				byte i_438_
				    = aByteArray11422[(i_354_ >> 16) + i_436_];
				int i_439_
				    = i_438_ > 0 ? anIntArray11423[i_438_] : 0;
				int i_440_ = i_439_ + i_351_;
				int i_441_ = ((i_439_ & 0xff00ff)
					      + (i_351_ & 0xff00ff));
				int i_442_ = ((i_441_ & 0x1000100)
					      + (i_440_ - i_441_ & 0x10000));
				i_442_ = i_440_ - i_442_ | i_442_ - (i_442_
								     >>> 8);
				if (i_439_ == 0 && i_433_ != 255) {
				    i_439_ = i_442_;
				    i_442_ = is[i_363_];
				    i_442_ = ((((i_439_ & 0xff00ff) * i_433_
						+ (i_442_ & 0xff00ff) * i_434_)
					       & ~0xff00ff)
					      + (((i_439_ & 0xff00) * i_433_
						  + (i_442_ & 0xff00) * i_434_)
						 & 0xff0000)) >> 8;
				}
				is[i_363_++] = i_442_;
				i_354_ += i_359_;
			    }
			    i_355_ += i_360_;
			    i_354_ = i_432_;
			    i_363_ += i_364_;
			}
		    } else if (i_350_ == 2) {
			int i_443_ = i_351_ >>> 24;
			int i_444_ = 256 - i_443_;
			int i_445_ = (i_351_ & 0xff00ff) * i_444_ & ~0xff00ff;
			int i_446_ = (i_351_ & 0xff00) * i_444_ & 0xff0000;
			i_351_ = (i_445_ | i_446_) >>> 8;
			int i_447_ = i_354_;
			for (int i_448_ = -i_349_; i_448_ < 0; i_448_++) {
			    int i_449_ = (i_355_ >> 16) * anInt9000;
			    for (int i_450_ = -i_348_; i_450_ < 0; i_450_++) {
				int i_451_
				    = aByteArray11422[(i_354_ >> 16) + i_449_];
				if (i_451_ != 0) {
				    int i_452_
					= anIntArray11423[i_451_ & 0xff];
				    i_445_ = ((i_452_ & 0xff00ff) * i_443_
					      & ~0xff00ff);
				    i_446_ = ((i_452_ & 0xff00) * i_443_
					      & 0xff0000);
				    is[i_363_++]
					= ((i_445_ | i_446_) >>> 8) + i_351_;
				} else
				    i_363_++;
				i_354_ += i_359_;
			    }
			    i_355_ += i_360_;
			    i_354_ = i_447_;
			    i_363_ += i_364_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_352_ == 2) {
		    if (i_350_ == 1) {
			int i_453_ = i_354_;
			for (int i_454_ = -i_349_; i_454_ < 0; i_454_++) {
			    int i_455_ = (i_355_ >> 16) * anInt9000;
			    for (int i_456_ = -i_348_; i_456_ < 0; i_456_++) {
				int i_457_
				    = aByteArray11422[(i_354_ >> 16) + i_455_];
				if (i_457_ != 0) {
				    int i_458_
					= anIntArray11423[i_457_ & 0xff];
				    int i_459_ = is[i_363_];
				    int i_460_ = i_458_ + i_459_;
				    int i_461_ = ((i_458_ & 0xff00ff)
						  + (i_459_ & 0xff00ff));
				    i_459_ = ((i_461_ & 0x1000100)
					      + (i_460_ - i_461_ & 0x10000));
				    is[i_363_++]
					= i_460_ - i_459_ | i_459_ - (i_459_
								      >>> 8);
				} else
				    i_363_++;
				i_354_ += i_359_;
			    }
			    i_355_ += i_360_;
			    i_354_ = i_453_;
			    i_363_ += i_364_;
			}
		    } else if (i_350_ == 0) {
			int i_462_ = i_354_;
			int i_463_ = (i_351_ & 0xff0000) >> 16;
			int i_464_ = (i_351_ & 0xff00) >> 8;
			int i_465_ = i_351_ & 0xff;
			for (int i_466_ = -i_349_; i_466_ < 0; i_466_++) {
			    int i_467_ = (i_355_ >> 16) * anInt9000;
			    for (int i_468_ = -i_348_; i_468_ < 0; i_468_++) {
				int i_469_
				    = aByteArray11422[(i_354_ >> 16) + i_467_];
				if (i_469_ != 0) {
				    int i_470_
					= anIntArray11423[i_469_ & 0xff];
				    int i_471_ = ((i_470_ & 0xff0000) * i_463_
						  & ~0xffffff);
				    int i_472_ = ((i_470_ & 0xff00) * i_464_
						  & 0xff0000);
				    int i_473_
					= (i_470_ & 0xff) * i_465_ & 0xff00;
				    i_470_ = (i_471_ | i_472_ | i_473_) >>> 8;
				    int i_474_ = is[i_363_];
				    int i_475_ = i_470_ + i_474_;
				    int i_476_ = ((i_470_ & 0xff00ff)
						  + (i_474_ & 0xff00ff));
				    i_474_ = ((i_476_ & 0x1000100)
					      + (i_475_ - i_476_ & 0x10000));
				    is[i_363_++]
					= i_475_ - i_474_ | i_474_ - (i_474_
								      >>> 8);
				} else
				    i_363_++;
				i_354_ += i_359_;
			    }
			    i_355_ += i_360_;
			    i_354_ = i_462_;
			    i_363_ += i_364_;
			}
		    } else if (i_350_ == 3) {
			int i_477_ = i_354_;
			for (int i_478_ = -i_349_; i_478_ < 0; i_478_++) {
			    int i_479_ = (i_355_ >> 16) * anInt9000;
			    for (int i_480_ = -i_348_; i_480_ < 0; i_480_++) {
				byte i_481_
				    = aByteArray11422[(i_354_ >> 16) + i_479_];
				int i_482_
				    = i_481_ > 0 ? anIntArray11423[i_481_] : 0;
				int i_483_ = i_482_ + i_351_;
				int i_484_ = ((i_482_ & 0xff00ff)
					      + (i_351_ & 0xff00ff));
				int i_485_ = ((i_484_ & 0x1000100)
					      + (i_483_ - i_484_ & 0x10000));
				i_482_ = i_483_ - i_485_ | i_485_ - (i_485_
								     >>> 8);
				i_485_ = is[i_363_];
				i_483_ = i_482_ + i_485_;
				i_484_ = (i_482_ & 0xff00ff) + (i_485_
								& 0xff00ff);
				i_485_
				    = (i_484_ & 0x1000100) + (i_483_ - i_484_
							      & 0x10000);
				is[i_363_++]
				    = i_483_ - i_485_ | i_485_ - (i_485_
								  >>> 8);
				i_354_ += i_359_;
			    }
			    i_355_ += i_360_;
			    i_354_ = i_477_;
			    i_363_ += i_364_;
			}
		    } else if (i_350_ == 2) {
			int i_486_ = i_351_ >>> 24;
			int i_487_ = 256 - i_486_;
			int i_488_ = (i_351_ & 0xff00ff) * i_487_ & ~0xff00ff;
			int i_489_ = (i_351_ & 0xff00) * i_487_ & 0xff0000;
			i_351_ = (i_488_ | i_489_) >>> 8;
			int i_490_ = i_354_;
			for (int i_491_ = -i_349_; i_491_ < 0; i_491_++) {
			    int i_492_ = (i_355_ >> 16) * anInt9000;
			    for (int i_493_ = -i_348_; i_493_ < 0; i_493_++) {
				int i_494_
				    = aByteArray11422[(i_354_ >> 16) + i_492_];
				if (i_494_ != 0) {
				    int i_495_
					= anIntArray11423[i_494_ & 0xff];
				    i_488_ = ((i_495_ & 0xff00ff) * i_486_
					      & ~0xff00ff);
				    i_489_ = ((i_495_ & 0xff00) * i_486_
					      & 0xff0000);
				    i_495_
					= ((i_488_ | i_489_) >>> 8) + i_351_;
				    int i_496_ = is[i_363_];
				    int i_497_ = i_495_ + i_496_;
				    int i_498_ = ((i_495_ & 0xff00ff)
						  + (i_496_ & 0xff00ff));
				    i_496_ = ((i_498_ & 0x1000100)
					      + (i_497_ - i_498_ & 0x10000));
				    is[i_363_++]
					= i_497_ - i_496_ | i_496_ - (i_496_
								      >>> 8);
				} else
				    i_363_++;
				i_354_ += i_359_;
			    }
			    i_355_ += i_360_;
			    i_354_ = i_490_;
			    i_363_ += i_364_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    public void method2505(int i, int i_499_, int i_500_, int i_501_,
			   int i_502_) {
	if (aClass182_Sub2_9033.method15226())
	    throw new IllegalStateException();
	int[] is = aClass182_Sub2_9033.anIntArray9466;
	if (is != null) {
	    int i_503_ = aClass182_Sub2_9033.anInt9494 * -476035351;
	    i += anInt9002;
	    i_499_ += anInt9003;
	    int i_504_ = i_499_ * i_503_ + i;
	    int i_505_ = 0;
	    int i_506_ = anInt9001;
	    int i_507_ = anInt9000;
	    int i_508_ = i_503_ - i_507_;
	    int i_509_ = 0;
	    if (i_499_ < aClass182_Sub2_9033.anInt9472 * 1722112305) {
		int i_510_
		    = aClass182_Sub2_9033.anInt9472 * 1722112305 - i_499_;
		i_506_ -= i_510_;
		i_499_ = aClass182_Sub2_9033.anInt9472 * 1722112305;
		i_505_ += i_510_ * i_507_;
		i_504_ += i_510_ * i_503_;
	    }
	    if (i_499_ + i_506_ > aClass182_Sub2_9033.anInt9473 * 1920901985)
		i_506_ -= (i_499_ + i_506_
			   - aClass182_Sub2_9033.anInt9473 * 1920901985);
	    if (i < aClass182_Sub2_9033.anInt9470 * 1988019027) {
		int i_511_ = aClass182_Sub2_9033.anInt9470 * 1988019027 - i;
		i_507_ -= i_511_;
		i = aClass182_Sub2_9033.anInt9470 * 1988019027;
		i_505_ += i_511_;
		i_504_ += i_511_;
		i_509_ += i_511_;
		i_508_ += i_511_;
	    }
	    if (i + i_507_ > aClass182_Sub2_9033.anInt9499 * -466178451) {
		int i_512_
		    = i + i_507_ - aClass182_Sub2_9033.anInt9499 * -466178451;
		i_507_ -= i_512_;
		i_509_ += i_512_;
		i_508_ += i_512_;
	    }
	    if (i_507_ > 0 && i_506_ > 0) {
		if (i_502_ == 0) {
		    if (i_500_ == 1) {
			for (int i_513_ = -i_506_; i_513_ < 0; i_513_++) {
			    int i_514_ = i_504_ + i_507_ - 3;
			    while (i_504_ < i_514_) {
				is[i_504_++]
				    = (anIntArray11423
				       [aByteArray11422[i_505_++] & 0xff]);
				is[i_504_++]
				    = (anIntArray11423
				       [aByteArray11422[i_505_++] & 0xff]);
				is[i_504_++]
				    = (anIntArray11423
				       [aByteArray11422[i_505_++] & 0xff]);
				is[i_504_++]
				    = (anIntArray11423
				       [aByteArray11422[i_505_++] & 0xff]);
			    }
			    i_514_ += 3;
			    while (i_504_ < i_514_)
				is[i_504_++]
				    = (anIntArray11423
				       [aByteArray11422[i_505_++] & 0xff]);
			    i_504_ += i_508_;
			    i_505_ += i_509_;
			}
		    } else if (i_500_ == 0) {
			int i_515_ = (i_501_ & 0xff0000) >> 16;
			int i_516_ = (i_501_ & 0xff00) >> 8;
			int i_517_ = i_501_ & 0xff;
			for (int i_518_ = -i_506_; i_518_ < 0; i_518_++) {
			    for (int i_519_ = -i_507_; i_519_ < 0; i_519_++) {
				int i_520_
				    = (anIntArray11423
				       [aByteArray11422[i_505_++] & 0xff]);
				int i_521_
				    = (i_520_ & 0xff0000) * i_515_ & ~0xffffff;
				int i_522_
				    = (i_520_ & 0xff00) * i_516_ & 0xff0000;
				int i_523_ = (i_520_ & 0xff) * i_517_ & 0xff00;
				is[i_504_++]
				    = (i_521_ | i_522_ | i_523_) >>> 8;
			    }
			    i_504_ += i_508_;
			    i_505_ += i_509_;
			}
		    } else if (i_500_ == 3) {
			for (int i_524_ = -i_506_; i_524_ < 0; i_524_++) {
			    for (int i_525_ = -i_507_; i_525_ < 0; i_525_++) {
				int i_526_
				    = (anIntArray11423
				       [aByteArray11422[i_505_++] & 0xff]);
				int i_527_ = i_526_ + i_501_;
				int i_528_ = ((i_526_ & 0xff00ff)
					      + (i_501_ & 0xff00ff));
				int i_529_ = ((i_528_ & 0x1000100)
					      + (i_527_ - i_528_ & 0x10000));
				is[i_504_++]
				    = i_527_ - i_529_ | i_529_ - (i_529_
								  >>> 8);
			    }
			    i_504_ += i_508_;
			    i_505_ += i_509_;
			}
		    } else if (i_500_ == 2) {
			int i_530_ = i_501_ >>> 24;
			int i_531_ = 256 - i_530_;
			int i_532_ = (i_501_ & 0xff00ff) * i_531_ & ~0xff00ff;
			int i_533_ = (i_501_ & 0xff00) * i_531_ & 0xff0000;
			i_501_ = (i_532_ | i_533_) >>> 8;
			for (int i_534_ = -i_506_; i_534_ < 0; i_534_++) {
			    for (int i_535_ = -i_507_; i_535_ < 0; i_535_++) {
				int i_536_
				    = (anIntArray11423
				       [aByteArray11422[i_505_++] & 0xff]);
				i_532_
				    = (i_536_ & 0xff00ff) * i_530_ & ~0xff00ff;
				i_533_ = (i_536_ & 0xff00) * i_530_ & 0xff0000;
				is[i_504_++]
				    = ((i_532_ | i_533_) >>> 8) + i_501_;
			    }
			    i_504_ += i_508_;
			    i_505_ += i_509_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_502_ == 1) {
		    if (i_500_ == 1) {
			for (int i_537_ = -i_506_; i_537_ < 0; i_537_++) {
			    for (int i_538_ = -i_507_; i_538_ < 0; i_538_++) {
				int i_539_ = aByteArray11422[i_505_++];
				if (i_539_ != 0) {
				    int i_540_
					= (anIntArray11423[i_539_ & 0xff]
					   | ~0xffffff);
				    int i_541_ = 255;
				    int i_542_ = 0;
				    int i_543_ = is[i_504_];
				    is[i_504_++]
					= (((((i_540_ & 0xff00ff) * i_541_
					      + (i_543_ & 0xff00ff) * i_542_)
					     & ~0xff00ff)
					    >> 8)
					   + (((((i_540_ & ~0xff00ff) >>> 8)
						* i_541_)
					       + (((i_543_ & ~0xff00ff) >>> 8)
						  * i_542_))
					      & ~0xff00ff));
				} else
				    i_504_++;
			    }
			    i_504_ += i_508_;
			    i_505_ += i_509_;
			}
		    } else if (i_500_ == 0) {
			if ((i_501_ & 0xffffff) == 16777215) {
			    int i_544_ = i_501_ >>> 24;
			    int i_545_ = 256 - i_544_;
			    for (int i_546_ = -i_506_; i_546_ < 0; i_546_++) {
				for (int i_547_ = -i_507_; i_547_ < 0;
				     i_547_++) {
				    int i_548_ = aByteArray11422[i_505_++];
				    if (i_548_ != 0) {
					int i_549_
					    = anIntArray11423[i_548_ & 0xff];
					int i_550_ = is[i_504_];
					is[i_504_++]
					    = ((((i_549_ & 0xff00ff) * i_544_
						 + ((i_550_ & 0xff00ff)
						    * i_545_))
						& ~0xff00ff)
					       + (((i_549_ & 0xff00) * i_544_
						   + ((i_550_ & 0xff00)
						      * i_545_))
						  & 0xff0000)) >> 8;
				    } else
					i_504_++;
				}
				i_504_ += i_508_;
				i_505_ += i_509_;
			    }
			} else {
			    int i_551_ = (i_501_ & 0xff0000) >> 16;
			    int i_552_ = (i_501_ & 0xff00) >> 8;
			    int i_553_ = i_501_ & 0xff;
			    int i_554_ = i_501_ >>> 24;
			    int i_555_ = 256 - i_554_;
			    for (int i_556_ = -i_506_; i_556_ < 0; i_556_++) {
				for (int i_557_ = -i_507_; i_557_ < 0;
				     i_557_++) {
				    int i_558_ = aByteArray11422[i_505_++];
				    if (i_558_ != 0) {
					int i_559_
					    = anIntArray11423[i_558_ & 0xff];
					if (i_554_ != 255) {
					    int i_560_
						= ((i_559_ & 0xff0000) * i_551_
						   & ~0xffffff);
					    int i_561_
						= ((i_559_ & 0xff00) * i_552_
						   & 0xff0000);
					    int i_562_
						= ((i_559_ & 0xff) * i_553_
						   & 0xff00);
					    i_559_ = (i_560_ | i_561_
						      | i_562_) >>> 8;
					    int i_563_ = is[i_504_];
					    is[i_504_++]
						= (((((i_559_ & 0xff00ff)
						      * i_554_)
						     + ((i_563_ & 0xff00ff)
							* i_555_))
						    & ~0xff00ff)
						   + ((((i_559_ & 0xff00)
							* i_554_)
						       + ((i_563_ & 0xff00)
							  * i_555_))
						      & 0xff0000)) >> 8;
					} else {
					    int i_564_
						= ((i_559_ & 0xff0000) * i_551_
						   & ~0xffffff);
					    int i_565_
						= ((i_559_ & 0xff00) * i_552_
						   & 0xff0000);
					    int i_566_
						= ((i_559_ & 0xff) * i_553_
						   & 0xff00);
					    is[i_504_++] = (i_564_ | i_565_
							    | i_566_) >>> 8;
					}
				    } else
					i_504_++;
				}
				i_504_ += i_508_;
				i_505_ += i_509_;
			    }
			}
		    } else if (i_500_ == 3) {
			int i_567_ = i_501_ >>> 24;
			int i_568_ = 256 - i_567_;
			for (int i_569_ = -i_506_; i_569_ < 0; i_569_++) {
			    for (int i_570_ = -i_507_; i_570_ < 0; i_570_++) {
				byte i_571_ = aByteArray11422[i_505_++];
				int i_572_
				    = i_571_ > 0 ? anIntArray11423[i_571_] : 0;
				int i_573_ = i_572_ + i_501_;
				int i_574_ = ((i_572_ & 0xff00ff)
					      + (i_501_ & 0xff00ff));
				int i_575_ = ((i_574_ & 0x1000100)
					      + (i_573_ - i_574_ & 0x10000));
				i_575_ = i_573_ - i_575_ | i_575_ - (i_575_
								     >>> 8);
				if (i_572_ == 0 && i_567_ != 255) {
				    i_572_ = i_575_;
				    i_575_ = is[i_504_];
				    i_575_ = ((((i_572_ & 0xff00ff) * i_567_
						+ (i_575_ & 0xff00ff) * i_568_)
					       & ~0xff00ff)
					      + (((i_572_ & 0xff00) * i_567_
						  + (i_575_ & 0xff00) * i_568_)
						 & 0xff0000)) >> 8;
				}
				is[i_504_++] = i_575_;
			    }
			    i_504_ += i_508_;
			    i_505_ += i_509_;
			}
		    } else if (i_500_ == 2) {
			int i_576_ = i_501_ >>> 24;
			int i_577_ = 256 - i_576_;
			int i_578_ = (i_501_ & 0xff00ff) * i_577_ & ~0xff00ff;
			int i_579_ = (i_501_ & 0xff00) * i_577_ & 0xff0000;
			i_501_ = (i_578_ | i_579_) >>> 8;
			for (int i_580_ = -i_506_; i_580_ < 0; i_580_++) {
			    for (int i_581_ = -i_507_; i_581_ < 0; i_581_++) {
				int i_582_ = aByteArray11422[i_505_++];
				if (i_582_ != 0) {
				    int i_583_
					= anIntArray11423[i_582_ & 0xff];
				    i_578_ = ((i_583_ & 0xff00ff) * i_576_
					      & ~0xff00ff);
				    i_579_ = ((i_583_ & 0xff00) * i_576_
					      & 0xff0000);
				    is[i_504_++]
					= ((i_578_ | i_579_) >>> 8) + i_501_;
				} else
				    i_504_++;
			    }
			    i_504_ += i_508_;
			    i_505_ += i_509_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_502_ == 2) {
		    if (i_500_ == 1) {
			for (int i_584_ = -i_506_; i_584_ < 0; i_584_++) {
			    for (int i_585_ = -i_507_; i_585_ < 0; i_585_++) {
				int i_586_ = aByteArray11422[i_505_++];
				if (i_586_ != 0) {
				    int i_587_
					= anIntArray11423[i_586_ & 0xff];
				    int i_588_ = is[i_504_];
				    int i_589_ = i_587_ + i_588_;
				    int i_590_ = ((i_587_ & 0xff00ff)
						  + (i_588_ & 0xff00ff));
				    i_588_ = ((i_590_ & 0x1000100)
					      + (i_589_ - i_590_ & 0x10000));
				    is[i_504_++]
					= i_589_ - i_588_ | i_588_ - (i_588_
								      >>> 8);
				} else
				    i_504_++;
			    }
			    i_504_ += i_508_;
			    i_505_ += i_509_;
			}
		    } else if (i_500_ == 0) {
			int i_591_ = (i_501_ & 0xff0000) >> 16;
			int i_592_ = (i_501_ & 0xff00) >> 8;
			int i_593_ = i_501_ & 0xff;
			for (int i_594_ = -i_506_; i_594_ < 0; i_594_++) {
			    for (int i_595_ = -i_507_; i_595_ < 0; i_595_++) {
				int i_596_ = aByteArray11422[i_505_++];
				if (i_596_ != 0) {
				    int i_597_
					= anIntArray11423[i_596_ & 0xff];
				    int i_598_ = ((i_597_ & 0xff0000) * i_591_
						  & ~0xffffff);
				    int i_599_ = ((i_597_ & 0xff00) * i_592_
						  & 0xff0000);
				    int i_600_
					= (i_597_ & 0xff) * i_593_ & 0xff00;
				    i_597_ = (i_598_ | i_599_ | i_600_) >>> 8;
				    int i_601_ = is[i_504_];
				    int i_602_ = i_597_ + i_601_;
				    int i_603_ = ((i_597_ & 0xff00ff)
						  + (i_601_ & 0xff00ff));
				    i_601_ = ((i_603_ & 0x1000100)
					      + (i_602_ - i_603_ & 0x10000));
				    is[i_504_++]
					= i_602_ - i_601_ | i_601_ - (i_601_
								      >>> 8);
				} else
				    i_504_++;
			    }
			    i_504_ += i_508_;
			    i_505_ += i_509_;
			}
		    } else if (i_500_ == 3) {
			for (int i_604_ = -i_506_; i_604_ < 0; i_604_++) {
			    for (int i_605_ = -i_507_; i_605_ < 0; i_605_++) {
				byte i_606_ = aByteArray11422[i_505_++];
				int i_607_
				    = i_606_ > 0 ? anIntArray11423[i_606_] : 0;
				int i_608_ = i_607_ + i_501_;
				int i_609_ = ((i_607_ & 0xff00ff)
					      + (i_501_ & 0xff00ff));
				int i_610_ = ((i_609_ & 0x1000100)
					      + (i_608_ - i_609_ & 0x10000));
				i_607_ = i_608_ - i_610_ | i_610_ - (i_610_
								     >>> 8);
				i_610_ = is[i_504_];
				i_608_ = i_607_ + i_610_;
				i_609_ = (i_607_ & 0xff00ff) + (i_610_
								& 0xff00ff);
				i_610_
				    = (i_609_ & 0x1000100) + (i_608_ - i_609_
							      & 0x10000);
				is[i_504_++]
				    = i_608_ - i_610_ | i_610_ - (i_610_
								  >>> 8);
			    }
			    i_504_ += i_508_;
			    i_505_ += i_509_;
			}
		    } else if (i_500_ == 2) {
			int i_611_ = i_501_ >>> 24;
			int i_612_ = 256 - i_611_;
			int i_613_ = (i_501_ & 0xff00ff) * i_612_ & ~0xff00ff;
			int i_614_ = (i_501_ & 0xff00) * i_612_ & 0xff0000;
			i_501_ = (i_613_ | i_614_) >>> 8;
			for (int i_615_ = -i_506_; i_615_ < 0; i_615_++) {
			    for (int i_616_ = -i_507_; i_616_ < 0; i_616_++) {
				int i_617_ = aByteArray11422[i_505_++];
				if (i_617_ != 0) {
				    int i_618_
					= anIntArray11423[i_617_ & 0xff];
				    i_613_ = ((i_618_ & 0xff00ff) * i_611_
					      & ~0xff00ff);
				    i_614_ = ((i_618_ & 0xff00) * i_611_
					      & 0xff0000);
				    i_618_
					= ((i_613_ | i_614_) >>> 8) + i_501_;
				    int i_619_ = is[i_504_];
				    int i_620_ = i_618_ + i_619_;
				    int i_621_ = ((i_618_ & 0xff00ff)
						  + (i_619_ & 0xff00ff));
				    i_619_ = ((i_621_ & 0x1000100)
					      + (i_620_ - i_621_ & 0x10000));
				    is[i_504_++]
					= i_620_ - i_619_ | i_619_ - (i_619_
								      >>> 8);
				} else
				    i_504_++;
			    }
			    i_504_ += i_508_;
			    i_505_ += i_509_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    void method14539(int[] is, int[] is_622_, int i, int i_623_) {
	int[] is_624_ = aClass182_Sub2_9033.anIntArray9466;
	if (is_624_ != null) {
	    if (anInt9006 == 0) {
		if (anInt9017 == 0) {
		    int i_625_ = anInt9023;
		    while (i_625_ < 0) {
			int i_626_ = i_625_ + i_623_;
			if (i_626_ >= 0) {
			    if (i_626_ >= is.length)
				break;
			    int i_627_ = anInt9015;
			    int i_628_ = anInt9022;
			    int i_629_ = anInt8999;
			    int i_630_ = anInt9011;
			    if (i_628_ >= 0 && i_629_ >= 0
				&& i_628_ - (anInt9000 << 12) < 0
				&& i_629_ - (anInt9001 << 12) < 0) {
				int i_631_ = is[i_626_] - i;
				int i_632_ = -is_622_[i_626_];
				int i_633_ = i_631_ - (i_627_ - anInt9015);
				if (i_633_ > 0) {
				    i_627_ += i_633_;
				    i_630_ += i_633_;
				    i_628_ += anInt9006 * i_633_;
				    i_629_ += anInt9017 * i_633_;
				} else
				    i_632_ -= i_633_;
				if (i_630_ < i_632_)
				    i_630_ = i_632_;
				for (/**/; i_630_ < 0; i_630_++) {
				    int i_634_ = (aByteArray11422
						  [((i_629_ >> 12) * anInt9000
						    + (i_628_ >> 12))]);
				    if (i_634_ != 0)
					is_624_[i_627_++]
					    = anIntArray11423[i_634_ & 0xff];
				    else
					i_627_++;
				}
			    }
			}
			i_625_++;
			anInt9015 += anInt9014;
		    }
		} else if (anInt9017 < 0) {
		    int i_635_ = anInt9023;
		    while (i_635_ < 0) {
			int i_636_ = i_635_ + i_623_;
			if (i_636_ >= 0) {
			    if (i_636_ >= is.length)
				break;
			    int i_637_ = anInt9015;
			    int i_638_ = anInt9022;
			    int i_639_ = anInt8999 + anInt9025;
			    int i_640_ = anInt9011;
			    if (i_638_ >= 0
				&& i_638_ - (anInt9000 << 12) < 0) {
				int i_641_;
				if ((i_641_ = i_639_ - (anInt9001 << 12))
				    >= 0) {
				    i_641_ = (anInt9017 - i_641_) / anInt9017;
				    i_640_ += i_641_;
				    i_639_ += anInt9017 * i_641_;
				    i_637_ += i_641_;
				}
				if ((i_641_ = (i_639_ - anInt9017) / anInt9017)
				    > i_640_)
				    i_640_ = i_641_;
				int i_642_ = is[i_636_] - i;
				int i_643_ = -is_622_[i_636_];
				int i_644_ = i_642_ - (i_637_ - anInt9015);
				if (i_644_ > 0) {
				    i_637_ += i_644_;
				    i_640_ += i_644_;
				    i_638_ += anInt9006 * i_644_;
				    i_639_ += anInt9017 * i_644_;
				} else
				    i_643_ -= i_644_;
				if (i_640_ < i_643_)
				    i_640_ = i_643_;
				for (/**/; i_640_ < 0; i_640_++) {
				    int i_645_ = (aByteArray11422
						  [((i_639_ >> 12) * anInt9000
						    + (i_638_ >> 12))]);
				    if (i_645_ != 0)
					is_624_[i_637_++]
					    = anIntArray11423[i_645_ & 0xff];
				    else
					i_637_++;
				    i_639_ += anInt9017;
				}
			    }
			}
			i_635_++;
			anInt9022 += anInt9018;
			anInt9015 += anInt9014;
		    }
		} else {
		    int i_646_ = anInt9023;
		    while (i_646_ < 0) {
			int i_647_ = i_646_ + i_623_;
			if (i_647_ >= 0) {
			    if (i_647_ >= is.length)
				break;
			    int i_648_ = anInt9015;
			    int i_649_ = anInt9022;
			    int i_650_ = anInt8999 + anInt9025;
			    int i_651_ = anInt9011;
			    if (i_649_ >= 0
				&& i_649_ - (anInt9000 << 12) < 0) {
				if (i_650_ < 0) {
				    int i_652_
					= (anInt9017 - 1 - i_650_) / anInt9017;
				    i_651_ += i_652_;
				    i_650_ += anInt9017 * i_652_;
				    i_648_ += i_652_;
				}
				int i_653_;
				if ((i_653_ = (1 + i_650_ - (anInt9001 << 12)
					       - anInt9017) / anInt9017)
				    > i_651_)
				    i_651_ = i_653_;
				int i_654_ = is[i_647_] - i;
				int i_655_ = -is_622_[i_647_];
				int i_656_ = i_654_ - (i_648_ - anInt9015);
				if (i_656_ > 0) {
				    i_648_ += i_656_;
				    i_651_ += i_656_;
				    i_649_ += anInt9006 * i_656_;
				    i_650_ += anInt9017 * i_656_;
				} else
				    i_655_ -= i_656_;
				if (i_651_ < i_655_)
				    i_651_ = i_655_;
				for (/**/; i_651_ < 0; i_651_++) {
				    int i_657_ = (aByteArray11422
						  [((i_650_ >> 12) * anInt9000
						    + (i_649_ >> 12))]);
				    if (i_657_ != 0)
					is_624_[i_648_++]
					    = anIntArray11423[i_657_ & 0xff];
				    else
					i_648_++;
				    i_650_ += anInt9017;
				}
			    }
			}
			i_646_++;
			anInt9022 += anInt9018;
			anInt9015 += anInt9014;
		    }
		}
	    } else if (anInt9006 < 0) {
		if (anInt9017 == 0) {
		    int i_658_ = anInt9023;
		    while (i_658_ < 0) {
			int i_659_ = i_658_ + i_623_;
			if (i_659_ >= 0) {
			    if (i_659_ >= is.length)
				break;
			    int i_660_ = anInt9015;
			    int i_661_ = anInt9022 + anInt9024;
			    int i_662_ = anInt8999;
			    int i_663_ = anInt9011;
			    if (i_662_ >= 0
				&& i_662_ - (anInt9001 << 12) < 0) {
				int i_664_;
				if ((i_664_ = i_661_ - (anInt9000 << 12))
				    >= 0) {
				    i_664_ = (anInt9006 - i_664_) / anInt9006;
				    i_663_ += i_664_;
				    i_661_ += anInt9006 * i_664_;
				    i_660_ += i_664_;
				}
				if ((i_664_ = (i_661_ - anInt9006) / anInt9006)
				    > i_663_)
				    i_663_ = i_664_;
				int i_665_ = is[i_659_] - i;
				int i_666_ = -is_622_[i_659_];
				int i_667_ = i_665_ - (i_660_ - anInt9015);
				if (i_667_ > 0) {
				    i_660_ += i_667_;
				    i_663_ += i_667_;
				    i_661_ += anInt9006 * i_667_;
				    i_662_ += anInt9017 * i_667_;
				} else
				    i_666_ -= i_667_;
				if (i_663_ < i_666_)
				    i_663_ = i_666_;
				for (/**/; i_663_ < 0; i_663_++) {
				    int i_668_ = (aByteArray11422
						  [((i_662_ >> 12) * anInt9000
						    + (i_661_ >> 12))]);
				    if (i_668_ != 0)
					is_624_[i_660_++]
					    = anIntArray11423[i_668_ & 0xff];
				    else
					i_660_++;
				    i_661_ += anInt9006;
				}
			    }
			}
			i_658_++;
			anInt8999 += anInt9010;
			anInt9015 += anInt9014;
		    }
		} else if (anInt9017 < 0) {
		    int i_669_ = anInt9023;
		    while (i_669_ < 0) {
			int i_670_ = i_669_ + i_623_;
			if (i_670_ >= 0) {
			    if (i_670_ >= is.length)
				break;
			    int i_671_ = anInt9015;
			    int i_672_ = anInt9022 + anInt9024;
			    int i_673_ = anInt8999 + anInt9025;
			    int i_674_ = anInt9011;
			    int i_675_;
			    if ((i_675_ = i_672_ - (anInt9000 << 12)) >= 0) {
				i_675_ = (anInt9006 - i_675_) / anInt9006;
				i_674_ += i_675_;
				i_672_ += anInt9006 * i_675_;
				i_673_ += anInt9017 * i_675_;
				i_671_ += i_675_;
			    }
			    if ((i_675_ = (i_672_ - anInt9006) / anInt9006)
				> i_674_)
				i_674_ = i_675_;
			    if ((i_675_ = i_673_ - (anInt9001 << 12)) >= 0) {
				i_675_ = (anInt9017 - i_675_) / anInt9017;
				i_674_ += i_675_;
				i_672_ += anInt9006 * i_675_;
				i_673_ += anInt9017 * i_675_;
				i_671_ += i_675_;
			    }
			    if ((i_675_ = (i_673_ - anInt9017) / anInt9017)
				> i_674_)
				i_674_ = i_675_;
			    int i_676_ = is[i_670_] - i;
			    int i_677_ = -is_622_[i_670_];
			    int i_678_ = i_676_ - (i_671_ - anInt9015);
			    if (i_678_ > 0) {
				i_671_ += i_678_;
				i_674_ += i_678_;
				i_672_ += anInt9006 * i_678_;
				i_673_ += anInt9017 * i_678_;
			    } else
				i_677_ -= i_678_;
			    if (i_674_ < i_677_)
				i_674_ = i_677_;
			    for (/**/; i_674_ < 0; i_674_++) {
				int i_679_
				    = (aByteArray11422
				       [(i_673_ >> 12) * anInt9000 + (i_672_
								      >> 12)]);
				if (i_679_ != 0)
				    is_624_[i_671_++]
					= anIntArray11423[i_679_ & 0xff];
				else
				    i_671_++;
				i_672_ += anInt9006;
				i_673_ += anInt9017;
			    }
			}
			i_669_++;
			anInt9022 += anInt9018;
			anInt8999 += anInt9010;
			anInt9015 += anInt9014;
		    }
		} else {
		    int i_680_ = anInt9023;
		    while (i_680_ < 0) {
			int i_681_ = i_680_ + i_623_;
			if (i_681_ >= 0) {
			    if (i_681_ >= is.length)
				break;
			    int i_682_ = anInt9015;
			    int i_683_ = anInt9022 + anInt9024;
			    int i_684_ = anInt8999 + anInt9025;
			    int i_685_ = anInt9011;
			    int i_686_;
			    if ((i_686_ = i_683_ - (anInt9000 << 12)) >= 0) {
				i_686_ = (anInt9006 - i_686_) / anInt9006;
				i_685_ += i_686_;
				i_683_ += anInt9006 * i_686_;
				i_684_ += anInt9017 * i_686_;
				i_682_ += i_686_;
			    }
			    if ((i_686_ = (i_683_ - anInt9006) / anInt9006)
				> i_685_)
				i_685_ = i_686_;
			    if (i_684_ < 0) {
				i_686_ = (anInt9017 - 1 - i_684_) / anInt9017;
				i_685_ += i_686_;
				i_683_ += anInt9006 * i_686_;
				i_684_ += anInt9017 * i_686_;
				i_682_ += i_686_;
			    }
			    if ((i_686_ = (1 + i_684_ - (anInt9001 << 12)
					   - anInt9017) / anInt9017)
				> i_685_)
				i_685_ = i_686_;
			    int i_687_ = is[i_681_] - i;
			    int i_688_ = -is_622_[i_681_];
			    int i_689_ = i_687_ - (i_682_ - anInt9015);
			    if (i_689_ > 0) {
				i_682_ += i_689_;
				i_685_ += i_689_;
				i_683_ += anInt9006 * i_689_;
				i_684_ += anInt9017 * i_689_;
			    } else
				i_688_ -= i_689_;
			    if (i_685_ < i_688_)
				i_685_ = i_688_;
			    for (/**/; i_685_ < 0; i_685_++) {
				int i_690_
				    = (aByteArray11422
				       [(i_684_ >> 12) * anInt9000 + (i_683_
								      >> 12)]);
				if (i_690_ != 0)
				    is_624_[i_682_++]
					= anIntArray11423[i_690_ & 0xff];
				else
				    i_682_++;
				i_683_ += anInt9006;
				i_684_ += anInt9017;
			    }
			}
			i_680_++;
			anInt9022 += anInt9018;
			anInt8999 += anInt9010;
			anInt9015 += anInt9014;
		    }
		}
	    } else if (anInt9017 == 0) {
		int i_691_ = anInt9023;
		while (i_691_ < 0) {
		    int i_692_ = i_691_ + i_623_;
		    if (i_692_ >= 0) {
			if (i_692_ >= is.length)
			    break;
			int i_693_ = anInt9015;
			int i_694_ = anInt9022 + anInt9024;
			int i_695_ = anInt8999;
			int i_696_ = anInt9011;
			if (i_695_ >= 0 && i_695_ - (anInt9001 << 12) < 0) {
			    if (i_694_ < 0) {
				int i_697_
				    = (anInt9006 - 1 - i_694_) / anInt9006;
				i_696_ += i_697_;
				i_694_ += anInt9006 * i_697_;
				i_693_ += i_697_;
			    }
			    int i_698_;
			    if ((i_698_ = (1 + i_694_ - (anInt9000 << 12)
					   - anInt9006) / anInt9006)
				> i_696_)
				i_696_ = i_698_;
			    int i_699_ = is[i_692_] - i;
			    int i_700_ = -is_622_[i_692_];
			    int i_701_ = i_699_ - (i_693_ - anInt9015);
			    if (i_701_ > 0) {
				i_693_ += i_701_;
				i_696_ += i_701_;
				i_694_ += anInt9006 * i_701_;
				i_695_ += anInt9017 * i_701_;
			    } else
				i_700_ -= i_701_;
			    if (i_696_ < i_700_)
				i_696_ = i_700_;
			    for (/**/; i_696_ < 0; i_696_++) {
				int i_702_
				    = (aByteArray11422
				       [(i_695_ >> 12) * anInt9000 + (i_694_
								      >> 12)]);
				if (i_702_ != 0)
				    is_624_[i_693_++]
					= anIntArray11423[i_702_ & 0xff];
				else
				    i_693_++;
				i_694_ += anInt9006;
			    }
			}
		    }
		    i_691_++;
		    anInt9022 += anInt9018;
		    anInt8999 += anInt9010;
		    anInt9015 += anInt9014;
		}
	    } else if (anInt9017 < 0) {
		int i_703_ = anInt9023;
		while (i_703_ < 0) {
		    int i_704_ = i_703_ + i_623_;
		    if (i_704_ >= 0) {
			if (i_704_ >= is.length)
			    break;
			int i_705_ = anInt9015;
			int i_706_ = anInt9022 + anInt9024;
			int i_707_ = anInt8999 + anInt9025;
			int i_708_ = anInt9011;
			if (i_706_ < 0) {
			    int i_709_ = (anInt9006 - 1 - i_706_) / anInt9006;
			    i_708_ += i_709_;
			    i_706_ += anInt9006 * i_709_;
			    i_707_ += anInt9017 * i_709_;
			    i_705_ += i_709_;
			}
			int i_710_;
			if ((i_710_ = (1 + i_706_ - (anInt9000 << 12)
				       - anInt9006) / anInt9006)
			    > i_708_)
			    i_708_ = i_710_;
			if ((i_710_ = i_707_ - (anInt9001 << 12)) >= 0) {
			    i_710_ = (anInt9017 - i_710_) / anInt9017;
			    i_708_ += i_710_;
			    i_706_ += anInt9006 * i_710_;
			    i_707_ += anInt9017 * i_710_;
			    i_705_ += i_710_;
			}
			if ((i_710_ = (i_707_ - anInt9017) / anInt9017)
			    > i_708_)
			    i_708_ = i_710_;
			int i_711_ = is[i_704_] - i;
			int i_712_ = -is_622_[i_704_];
			int i_713_ = i_711_ - (i_705_ - anInt9015);
			if (i_713_ > 0) {
			    i_705_ += i_713_;
			    i_708_ += i_713_;
			    i_706_ += anInt9006 * i_713_;
			    i_707_ += anInt9017 * i_713_;
			} else
			    i_712_ -= i_713_;
			if (i_708_ < i_712_)
			    i_708_ = i_712_;
			for (/**/; i_708_ < 0; i_708_++) {
			    int i_714_
				= (aByteArray11422
				   [(i_707_ >> 12) * anInt9000 + (i_706_
								  >> 12)]);
			    if (i_714_ != 0)
				is_624_[i_705_++]
				    = anIntArray11423[i_714_ & 0xff];
			    else
				i_705_++;
			    i_706_ += anInt9006;
			    i_707_ += anInt9017;
			}
		    }
		    i_703_++;
		    anInt9022 += anInt9018;
		    anInt8999 += anInt9010;
		    anInt9015 += anInt9014;
		}
	    } else {
		int i_715_ = anInt9023;
		while (i_715_ < 0) {
		    int i_716_ = i_715_ + i_623_;
		    if (i_716_ >= 0) {
			if (i_716_ >= is.length)
			    break;
			int i_717_ = anInt9015;
			int i_718_ = anInt9022 + anInt9024;
			int i_719_ = anInt8999 + anInt9025;
			int i_720_ = anInt9011;
			if (i_718_ < 0) {
			    int i_721_ = (anInt9006 - 1 - i_718_) / anInt9006;
			    i_720_ += i_721_;
			    i_718_ += anInt9006 * i_721_;
			    i_719_ += anInt9017 * i_721_;
			    i_717_ += i_721_;
			}
			int i_722_;
			if ((i_722_ = (1 + i_718_ - (anInt9000 << 12)
				       - anInt9006) / anInt9006)
			    > i_720_)
			    i_720_ = i_722_;
			if (i_719_ < 0) {
			    i_722_ = (anInt9017 - 1 - i_719_) / anInt9017;
			    i_720_ += i_722_;
			    i_718_ += anInt9006 * i_722_;
			    i_719_ += anInt9017 * i_722_;
			    i_717_ += i_722_;
			}
			if ((i_722_ = (1 + i_719_ - (anInt9001 << 12)
				       - anInt9017) / anInt9017)
			    > i_720_)
			    i_720_ = i_722_;
			int i_723_ = is[i_716_] - i;
			int i_724_ = -is_622_[i_716_];
			int i_725_ = i_723_ - (i_717_ - anInt9015);
			if (i_725_ > 0) {
			    i_717_ += i_725_;
			    i_720_ += i_725_;
			    i_718_ += anInt9006 * i_725_;
			    i_719_ += anInt9017 * i_725_;
			} else
			    i_724_ -= i_725_;
			if (i_720_ < i_724_)
			    i_720_ = i_724_;
			for (/**/; i_720_ < 0; i_720_++) {
			    int i_726_
				= (aByteArray11422
				   [(i_719_ >> 12) * anInt9000 + (i_718_
								  >> 12)]);
			    if (i_726_ != 0)
				is_624_[i_717_++]
				    = anIntArray11423[i_726_ & 0xff];
			    else
				i_717_++;
			    i_718_ += anInt9006;
			    i_719_ += anInt9017;
			}
		    }
		    i_715_++;
		    anInt9022 += anInt9018;
		    anInt8999 += anInt9010;
		    anInt9015 += anInt9014;
		}
	    }
	}
    }
    
    public void method2527(int i, int i_727_, int i_728_, int i_729_, int[] is,
			   int i_730_, int i_731_) {
	throw new IllegalStateException();
    }
    
    public void method2497(int i, int i_732_, int i_733_, int i_734_,
			   int i_735_, int i_736_) {
	throw new IllegalStateException();
    }
    
    public void method2498(int i, int i_737_, int i_738_, int i_739_,
			   int i_740_, int i_741_) {
	throw new IllegalStateException();
    }
    
    void method2470(int i, int i_742_, int i_743_, int i_744_, int i_745_,
		    int i_746_, int i_747_, int i_748_) {
	if (aClass182_Sub2_9033.method15226())
	    throw new IllegalStateException();
	if (i_743_ > 0 && i_744_ > 0) {
	    int[] is = aClass182_Sub2_9033.anIntArray9466;
	    if (is != null) {
		int i_749_ = 0;
		int i_750_ = 0;
		int i_751_ = aClass182_Sub2_9033.anInt9494 * -476035351;
		int i_752_ = anInt9002 + anInt9000 + anInt9004;
		int i_753_ = anInt9003 + anInt9001 + anInt9005;
		int i_754_ = (i_752_ << 16) / i_743_;
		int i_755_ = (i_753_ << 16) / i_744_;
		if (anInt9002 > 0) {
		    int i_756_ = ((anInt9002 << 16) + i_754_ - 1) / i_754_;
		    i += i_756_;
		    i_749_ += i_756_ * i_754_ - (anInt9002 << 16);
		}
		if (anInt9003 > 0) {
		    int i_757_ = ((anInt9003 << 16) + i_755_ - 1) / i_755_;
		    i_742_ += i_757_;
		    i_750_ += i_757_ * i_755_ - (anInt9003 << 16);
		}
		if (anInt9000 < i_752_)
		    i_743_
			= ((anInt9000 << 16) - i_749_ + i_754_ - 1) / i_754_;
		if (anInt9001 < i_753_)
		    i_744_
			= ((anInt9001 << 16) - i_750_ + i_755_ - 1) / i_755_;
		int i_758_ = i + i_742_ * i_751_;
		int i_759_ = i_751_ - i_743_;
		if (i_742_ + i_744_
		    > aClass182_Sub2_9033.anInt9473 * 1920901985)
		    i_744_ -= (i_742_ + i_744_
			       - aClass182_Sub2_9033.anInt9473 * 1920901985);
		if (i_742_ < aClass182_Sub2_9033.anInt9472 * 1722112305) {
		    int i_760_
			= aClass182_Sub2_9033.anInt9472 * 1722112305 - i_742_;
		    i_744_ -= i_760_;
		    i_758_ += i_760_ * i_751_;
		    i_750_ += i_755_ * i_760_;
		}
		if (i + i_743_ > aClass182_Sub2_9033.anInt9499 * -466178451) {
		    int i_761_
			= (i + i_743_
			   - aClass182_Sub2_9033.anInt9499 * -466178451);
		    i_743_ -= i_761_;
		    i_759_ += i_761_;
		}
		if (i < aClass182_Sub2_9033.anInt9470 * 1988019027) {
		    int i_762_
			= aClass182_Sub2_9033.anInt9470 * 1988019027 - i;
		    i_743_ -= i_762_;
		    i_758_ += i_762_;
		    i_749_ += i_754_ * i_762_;
		    i_759_ += i_762_;
		}
		if (i_747_ == 0) {
		    if (i_745_ == 1) {
			int i_763_ = i_749_;
			for (int i_764_ = -i_744_; i_764_ < 0; i_764_++) {
			    int i_765_ = (i_750_ >> 16) * anInt9000;
			    for (int i_766_ = -i_743_; i_766_ < 0; i_766_++) {
				is[i_758_++]
				    = (anIntArray11423
				       [(aByteArray11422
					 [(i_749_ >> 16) + i_765_]) & 0xff]);
				i_749_ += i_754_;
			    }
			    i_750_ += i_755_;
			    i_749_ = i_763_;
			    i_758_ += i_759_;
			}
		    } else if (i_745_ == 0) {
			int i_767_ = (i_746_ & 0xff0000) >> 16;
			int i_768_ = (i_746_ & 0xff00) >> 8;
			int i_769_ = i_746_ & 0xff;
			int i_770_ = i_749_;
			for (int i_771_ = -i_744_; i_771_ < 0; i_771_++) {
			    int i_772_ = (i_750_ >> 16) * anInt9000;
			    for (int i_773_ = -i_743_; i_773_ < 0; i_773_++) {
				int i_774_
				    = (anIntArray11423
				       [(aByteArray11422
					 [(i_749_ >> 16) + i_772_]) & 0xff]);
				int i_775_
				    = (i_774_ & 0xff0000) * i_767_ & ~0xffffff;
				int i_776_
				    = (i_774_ & 0xff00) * i_768_ & 0xff0000;
				int i_777_ = (i_774_ & 0xff) * i_769_ & 0xff00;
				is[i_758_++]
				    = (i_775_ | i_776_ | i_777_) >>> 8;
				i_749_ += i_754_;
			    }
			    i_750_ += i_755_;
			    i_749_ = i_770_;
			    i_758_ += i_759_;
			}
		    } else if (i_745_ == 3) {
			int i_778_ = i_749_;
			for (int i_779_ = -i_744_; i_779_ < 0; i_779_++) {
			    int i_780_ = (i_750_ >> 16) * anInt9000;
			    for (int i_781_ = -i_743_; i_781_ < 0; i_781_++) {
				byte i_782_
				    = aByteArray11422[(i_749_ >> 16) + i_780_];
				int i_783_
				    = i_782_ > 0 ? anIntArray11423[i_782_] : 0;
				int i_784_ = i_783_ + i_746_;
				int i_785_ = ((i_783_ & 0xff00ff)
					      + (i_746_ & 0xff00ff));
				int i_786_ = ((i_785_ & 0x1000100)
					      + (i_784_ - i_785_ & 0x10000));
				is[i_758_++]
				    = i_784_ - i_786_ | i_786_ - (i_786_
								  >>> 8);
				i_749_ += i_754_;
			    }
			    i_750_ += i_755_;
			    i_749_ = i_778_;
			    i_758_ += i_759_;
			}
		    } else if (i_745_ == 2) {
			int i_787_ = i_746_ >>> 24;
			int i_788_ = 256 - i_787_;
			int i_789_ = (i_746_ & 0xff00ff) * i_788_ & ~0xff00ff;
			int i_790_ = (i_746_ & 0xff00) * i_788_ & 0xff0000;
			i_746_ = (i_789_ | i_790_) >>> 8;
			int i_791_ = i_749_;
			for (int i_792_ = -i_744_; i_792_ < 0; i_792_++) {
			    int i_793_ = (i_750_ >> 16) * anInt9000;
			    for (int i_794_ = -i_743_; i_794_ < 0; i_794_++) {
				int i_795_
				    = (anIntArray11423
				       [(aByteArray11422
					 [(i_749_ >> 16) + i_793_]) & 0xff]);
				i_789_
				    = (i_795_ & 0xff00ff) * i_787_ & ~0xff00ff;
				i_790_ = (i_795_ & 0xff00) * i_787_ & 0xff0000;
				is[i_758_++]
				    = ((i_789_ | i_790_) >>> 8) + i_746_;
				i_749_ += i_754_;
			    }
			    i_750_ += i_755_;
			    i_749_ = i_791_;
			    i_758_ += i_759_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_747_ == 1) {
		    if (i_745_ == 1) {
			int i_796_ = i_749_;
			for (int i_797_ = -i_744_; i_797_ < 0; i_797_++) {
			    int i_798_ = (i_750_ >> 16) * anInt9000;
			    for (int i_799_ = -i_743_; i_799_ < 0; i_799_++) {
				int i_800_
				    = aByteArray11422[(i_749_ >> 16) + i_798_];
				if (i_800_ != 0)
				    is[i_758_++]
					= anIntArray11423[i_800_ & 0xff];
				else
				    i_758_++;
				i_749_ += i_754_;
			    }
			    i_750_ += i_755_;
			    i_749_ = i_796_;
			    i_758_ += i_759_;
			}
		    } else if (i_745_ == 0) {
			int i_801_ = i_749_;
			if ((i_746_ & 0xffffff) == 16777215) {
			    int i_802_ = i_746_ >>> 24;
			    int i_803_ = 256 - i_802_;
			    for (int i_804_ = -i_744_; i_804_ < 0; i_804_++) {
				int i_805_ = (i_750_ >> 16) * anInt9000;
				for (int i_806_ = -i_743_; i_806_ < 0;
				     i_806_++) {
				    int i_807_ = (aByteArray11422
						  [(i_749_ >> 16) + i_805_]);
				    if (i_807_ != 0) {
					int i_808_
					    = anIntArray11423[i_807_ & 0xff];
					int i_809_ = is[i_758_];
					is[i_758_++]
					    = ((((i_808_ & 0xff00ff) * i_802_
						 + ((i_809_ & 0xff00ff)
						    * i_803_))
						& ~0xff00ff)
					       + (((i_808_ & 0xff00) * i_802_
						   + ((i_809_ & 0xff00)
						      * i_803_))
						  & 0xff0000)) >> 8;
				    } else
					i_758_++;
				    i_749_ += i_754_;
				}
				i_750_ += i_755_;
				i_749_ = i_801_;
				i_758_ += i_759_;
			    }
			} else {
			    int i_810_ = (i_746_ & 0xff0000) >> 16;
			    int i_811_ = (i_746_ & 0xff00) >> 8;
			    int i_812_ = i_746_ & 0xff;
			    int i_813_ = i_746_ >>> 24;
			    int i_814_ = 256 - i_813_;
			    for (int i_815_ = -i_744_; i_815_ < 0; i_815_++) {
				int i_816_ = (i_750_ >> 16) * anInt9000;
				for (int i_817_ = -i_743_; i_817_ < 0;
				     i_817_++) {
				    int i_818_ = (aByteArray11422
						  [(i_749_ >> 16) + i_816_]);
				    if (i_818_ != 0) {
					int i_819_
					    = anIntArray11423[i_818_ & 0xff];
					if (i_813_ != 255) {
					    int i_820_
						= ((i_819_ & 0xff0000) * i_810_
						   & ~0xffffff);
					    int i_821_
						= ((i_819_ & 0xff00) * i_811_
						   & 0xff0000);
					    int i_822_
						= ((i_819_ & 0xff) * i_812_
						   & 0xff00);
					    i_819_ = (i_820_ | i_821_
						      | i_822_) >>> 8;
					    int i_823_ = is[i_758_];
					    is[i_758_++]
						= (((((i_819_ & 0xff00ff)
						      * i_813_)
						     + ((i_823_ & 0xff00ff)
							* i_814_))
						    & ~0xff00ff)
						   + ((((i_819_ & 0xff00)
							* i_813_)
						       + ((i_823_ & 0xff00)
							  * i_814_))
						      & 0xff0000)) >> 8;
					} else {
					    int i_824_
						= ((i_819_ & 0xff0000) * i_810_
						   & ~0xffffff);
					    int i_825_
						= ((i_819_ & 0xff00) * i_811_
						   & 0xff0000);
					    int i_826_
						= ((i_819_ & 0xff) * i_812_
						   & 0xff00);
					    is[i_758_++] = (i_824_ | i_825_
							    | i_826_) >>> 8;
					}
				    } else
					i_758_++;
				    i_749_ += i_754_;
				}
				i_750_ += i_755_;
				i_749_ = i_801_;
				i_758_ += i_759_;
			    }
			}
		    } else if (i_745_ == 3) {
			int i_827_ = i_749_;
			int i_828_ = i_746_ >>> 24;
			int i_829_ = 256 - i_828_;
			for (int i_830_ = -i_744_; i_830_ < 0; i_830_++) {
			    int i_831_ = (i_750_ >> 16) * anInt9000;
			    for (int i_832_ = -i_743_; i_832_ < 0; i_832_++) {
				byte i_833_
				    = aByteArray11422[(i_749_ >> 16) + i_831_];
				int i_834_
				    = i_833_ > 0 ? anIntArray11423[i_833_] : 0;
				int i_835_ = i_834_ + i_746_;
				int i_836_ = ((i_834_ & 0xff00ff)
					      + (i_746_ & 0xff00ff));
				int i_837_ = ((i_836_ & 0x1000100)
					      + (i_835_ - i_836_ & 0x10000));
				i_837_ = i_835_ - i_837_ | i_837_ - (i_837_
								     >>> 8);
				if (i_834_ == 0 && i_828_ != 255) {
				    i_834_ = i_837_;
				    i_837_ = is[i_758_];
				    i_837_ = ((((i_834_ & 0xff00ff) * i_828_
						+ (i_837_ & 0xff00ff) * i_829_)
					       & ~0xff00ff)
					      + (((i_834_ & 0xff00) * i_828_
						  + (i_837_ & 0xff00) * i_829_)
						 & 0xff0000)) >> 8;
				}
				is[i_758_++] = i_837_;
				i_749_ += i_754_;
			    }
			    i_750_ += i_755_;
			    i_749_ = i_827_;
			    i_758_ += i_759_;
			}
		    } else if (i_745_ == 2) {
			int i_838_ = i_746_ >>> 24;
			int i_839_ = 256 - i_838_;
			int i_840_ = (i_746_ & 0xff00ff) * i_839_ & ~0xff00ff;
			int i_841_ = (i_746_ & 0xff00) * i_839_ & 0xff0000;
			i_746_ = (i_840_ | i_841_) >>> 8;
			int i_842_ = i_749_;
			for (int i_843_ = -i_744_; i_843_ < 0; i_843_++) {
			    int i_844_ = (i_750_ >> 16) * anInt9000;
			    for (int i_845_ = -i_743_; i_845_ < 0; i_845_++) {
				int i_846_
				    = aByteArray11422[(i_749_ >> 16) + i_844_];
				if (i_846_ != 0) {
				    int i_847_
					= anIntArray11423[i_846_ & 0xff];
				    i_840_ = ((i_847_ & 0xff00ff) * i_838_
					      & ~0xff00ff);
				    i_841_ = ((i_847_ & 0xff00) * i_838_
					      & 0xff0000);
				    is[i_758_++]
					= ((i_840_ | i_841_) >>> 8) + i_746_;
				} else
				    i_758_++;
				i_749_ += i_754_;
			    }
			    i_750_ += i_755_;
			    i_749_ = i_842_;
			    i_758_ += i_759_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_747_ == 2) {
		    if (i_745_ == 1) {
			int i_848_ = i_749_;
			for (int i_849_ = -i_744_; i_849_ < 0; i_849_++) {
			    int i_850_ = (i_750_ >> 16) * anInt9000;
			    for (int i_851_ = -i_743_; i_851_ < 0; i_851_++) {
				int i_852_
				    = aByteArray11422[(i_749_ >> 16) + i_850_];
				if (i_852_ != 0) {
				    int i_853_
					= anIntArray11423[i_852_ & 0xff];
				    int i_854_ = is[i_758_];
				    int i_855_ = i_853_ + i_854_;
				    int i_856_ = ((i_853_ & 0xff00ff)
						  + (i_854_ & 0xff00ff));
				    i_854_ = ((i_856_ & 0x1000100)
					      + (i_855_ - i_856_ & 0x10000));
				    is[i_758_++]
					= i_855_ - i_854_ | i_854_ - (i_854_
								      >>> 8);
				} else
				    i_758_++;
				i_749_ += i_754_;
			    }
			    i_750_ += i_755_;
			    i_749_ = i_848_;
			    i_758_ += i_759_;
			}
		    } else if (i_745_ == 0) {
			int i_857_ = i_749_;
			int i_858_ = (i_746_ & 0xff0000) >> 16;
			int i_859_ = (i_746_ & 0xff00) >> 8;
			int i_860_ = i_746_ & 0xff;
			for (int i_861_ = -i_744_; i_861_ < 0; i_861_++) {
			    int i_862_ = (i_750_ >> 16) * anInt9000;
			    for (int i_863_ = -i_743_; i_863_ < 0; i_863_++) {
				int i_864_
				    = aByteArray11422[(i_749_ >> 16) + i_862_];
				if (i_864_ != 0) {
				    int i_865_
					= anIntArray11423[i_864_ & 0xff];
				    int i_866_ = ((i_865_ & 0xff0000) * i_858_
						  & ~0xffffff);
				    int i_867_ = ((i_865_ & 0xff00) * i_859_
						  & 0xff0000);
				    int i_868_
					= (i_865_ & 0xff) * i_860_ & 0xff00;
				    i_865_ = (i_866_ | i_867_ | i_868_) >>> 8;
				    int i_869_ = is[i_758_];
				    int i_870_ = i_865_ + i_869_;
				    int i_871_ = ((i_865_ & 0xff00ff)
						  + (i_869_ & 0xff00ff));
				    i_869_ = ((i_871_ & 0x1000100)
					      + (i_870_ - i_871_ & 0x10000));
				    is[i_758_++]
					= i_870_ - i_869_ | i_869_ - (i_869_
								      >>> 8);
				} else
				    i_758_++;
				i_749_ += i_754_;
			    }
			    i_750_ += i_755_;
			    i_749_ = i_857_;
			    i_758_ += i_759_;
			}
		    } else if (i_745_ == 3) {
			int i_872_ = i_749_;
			for (int i_873_ = -i_744_; i_873_ < 0; i_873_++) {
			    int i_874_ = (i_750_ >> 16) * anInt9000;
			    for (int i_875_ = -i_743_; i_875_ < 0; i_875_++) {
				byte i_876_
				    = aByteArray11422[(i_749_ >> 16) + i_874_];
				int i_877_
				    = i_876_ > 0 ? anIntArray11423[i_876_] : 0;
				int i_878_ = i_877_ + i_746_;
				int i_879_ = ((i_877_ & 0xff00ff)
					      + (i_746_ & 0xff00ff));
				int i_880_ = ((i_879_ & 0x1000100)
					      + (i_878_ - i_879_ & 0x10000));
				i_877_ = i_878_ - i_880_ | i_880_ - (i_880_
								     >>> 8);
				i_880_ = is[i_758_];
				i_878_ = i_877_ + i_880_;
				i_879_ = (i_877_ & 0xff00ff) + (i_880_
								& 0xff00ff);
				i_880_
				    = (i_879_ & 0x1000100) + (i_878_ - i_879_
							      & 0x10000);
				is[i_758_++]
				    = i_878_ - i_880_ | i_880_ - (i_880_
								  >>> 8);
				i_749_ += i_754_;
			    }
			    i_750_ += i_755_;
			    i_749_ = i_872_;
			    i_758_ += i_759_;
			}
		    } else if (i_745_ == 2) {
			int i_881_ = i_746_ >>> 24;
			int i_882_ = 256 - i_881_;
			int i_883_ = (i_746_ & 0xff00ff) * i_882_ & ~0xff00ff;
			int i_884_ = (i_746_ & 0xff00) * i_882_ & 0xff0000;
			i_746_ = (i_883_ | i_884_) >>> 8;
			int i_885_ = i_749_;
			for (int i_886_ = -i_744_; i_886_ < 0; i_886_++) {
			    int i_887_ = (i_750_ >> 16) * anInt9000;
			    for (int i_888_ = -i_743_; i_888_ < 0; i_888_++) {
				int i_889_
				    = aByteArray11422[(i_749_ >> 16) + i_887_];
				if (i_889_ != 0) {
				    int i_890_
					= anIntArray11423[i_889_ & 0xff];
				    i_883_ = ((i_890_ & 0xff00ff) * i_881_
					      & ~0xff00ff);
				    i_884_ = ((i_890_ & 0xff00) * i_881_
					      & 0xff0000);
				    i_890_
					= ((i_883_ | i_884_) >>> 8) + i_746_;
				    int i_891_ = is[i_758_];
				    int i_892_ = i_890_ + i_891_;
				    int i_893_ = ((i_890_ & 0xff00ff)
						  + (i_891_ & 0xff00ff));
				    i_891_ = ((i_893_ & 0x1000100)
					      + (i_892_ - i_893_ & 0x10000));
				    is[i_758_++]
					= i_892_ - i_891_ | i_891_ - (i_891_
								      >>> 8);
				} else
				    i_758_++;
				i_749_ += i_754_;
			    }
			    i_750_ += i_755_;
			    i_749_ = i_885_;
			    i_758_ += i_759_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    public void method2486(int i, int i_894_, int i_895_) {
	throw new IllegalStateException();
    }
    
    public Interface21 method2501() {
	throw new IllegalStateException();
    }
    
    void method14536(int i, int i_896_) {
	int[] is = aClass182_Sub2_9033.anIntArray9466;
	if (is != null) {
	    if (anInt9006 == 0) {
		if (anInt9017 == 0) {
		    int i_897_ = anInt9023;
		    while (i_897_ < 0) {
			int i_898_ = anInt9015;
			int i_899_ = anInt9022;
			int i_900_ = anInt8999;
			int i_901_ = anInt9011;
			if (i_899_ >= 0 && i_900_ >= 0
			    && i_899_ - (anInt9000 << 12) < 0
			    && i_900_ - (anInt9001 << 12) < 0) {
			    for (/**/; i_901_ < 0; i_901_++) {
				int i_902_ = ((i_900_ >> 12) * anInt9000
					      + (i_899_ >> 12));
				int i_903_ = i_898_++;
				if (i_896_ == 0) {
				    if (i == 1)
					is[i_903_] = (anIntArray11423
						      [(aByteArray11422[i_902_]
							& 0xff)]);
				    else if (i == 0) {
					int i_904_ = (anIntArray11423
						      [(aByteArray11422[i_902_]
							& 0xff)]);
					int i_905_
					    = ((i_904_ & 0xff0000) * anInt9031
					       & ~0xffffff);
					int i_906_
					    = ((i_904_ & 0xff00) * anInt9030
					       & 0xff0000);
					int i_907_
					    = ((i_904_ & 0xff) * anInt9027
					       & 0xff00);
					is[i_903_]
					    = (i_905_ | i_906_ | i_907_) >>> 8;
				    } else if (i == 3) {
					int i_908_ = (anIntArray11423
						      [(aByteArray11422[i_902_]
							& 0xff)]);
					int i_909_ = anInt9026;
					int i_910_ = i_908_ + i_909_;
					int i_911_ = ((i_908_ & 0xff00ff)
						      + (i_909_ & 0xff00ff));
					int i_912_
					    = ((i_911_ & 0x1000100)
					       + (i_910_ - i_911_ & 0x10000));
					is[i_903_]
					    = (i_910_ - i_912_
					       | i_912_ - (i_912_ >>> 8));
				    } else if (i == 2) {
					int i_913_ = (anIntArray11423
						      [(aByteArray11422[i_902_]
							& 0xff)]);
					int i_914_
					    = ((i_913_ & 0xff00ff) * anInt9007
					       & ~0xff00ff);
					int i_915_
					    = ((i_913_ & 0xff00) * anInt9007
					       & 0xff0000);
					is[i_903_] = (((i_914_ | i_915_) >>> 8)
						      + anInt9034);
				    } else
					throw new IllegalArgumentException();
				} else if (i_896_ == 1) {
				    if (i == 1) {
					int i_916_ = aByteArray11422[i_902_];
					if (i_916_ != 0)
					    is[i_903_] = (anIntArray11423
							  [i_916_ & 0xff]);
				    } else if (i == 0) {
					int i_917_ = aByteArray11422[i_902_];
					if (i_917_ != 0) {
					    int i_918_ = (anIntArray11423
							  [i_917_ & 0xff]);
					    if ((anInt9026 & 0xffffff)
						== 16777215) {
						int i_919_ = anInt9026 >>> 24;
						int i_920_ = 256 - i_919_;
						int i_921_ = is[i_903_];
						is[i_903_]
						    = (((((i_918_ & 0xff00ff)
							  * i_919_)
							 + ((i_921_ & 0xff00ff)
							    * i_920_))
							& ~0xff00ff)
						       + ((((i_918_ & 0xff00)
							    * i_919_)
							   + ((i_921_ & 0xff00)
							      * i_920_))
							  & 0xff0000)) >> 8;
					    } else if (anInt9007 != 255) {
						int i_922_
						    = (((i_918_ & 0xff0000)
							* anInt9031)
						       & ~0xffffff);
						int i_923_
						    = (((i_918_ & 0xff00)
							* anInt9030)
						       & 0xff0000);
						int i_924_ = (((i_918_ & 0xff)
							       * anInt9027)
							      & 0xff00);
						i_918_ = (i_922_ | i_923_
							  | i_924_) >>> 8;
						int i_925_ = is[i_903_];
						is[i_903_]
						    = (((((i_918_ & 0xff00ff)
							  * anInt9007)
							 + ((i_925_ & 0xff00ff)
							    * anInt9028))
							& ~0xff00ff)
						       + ((((i_918_ & 0xff00)
							    * anInt9007)
							   + ((i_925_ & 0xff00)
							      * anInt9028))
							  & 0xff0000)) >> 8;
					    } else {
						int i_926_
						    = (((i_918_ & 0xff0000)
							* anInt9031)
						       & ~0xffffff);
						int i_927_
						    = (((i_918_ & 0xff00)
							* anInt9030)
						       & 0xff0000);
						int i_928_ = (((i_918_ & 0xff)
							       * anInt9027)
							      & 0xff00);
						is[i_903_] = (i_926_ | i_927_
							      | i_928_) >>> 8;
					    }
					}
				    } else if (i == 3) {
					byte i_929_ = aByteArray11422[i_902_];
					int i_930_
					    = (i_929_ > 0
					       ? anIntArray11423[i_929_] : 0);
					int i_931_ = anInt9026;
					int i_932_ = i_930_ + i_931_;
					int i_933_ = ((i_930_ & 0xff00ff)
						      + (i_931_ & 0xff00ff));
					int i_934_
					    = ((i_933_ & 0x1000100)
					       + (i_932_ - i_933_ & 0x10000));
					i_934_ = (i_932_ - i_934_
						  | i_934_ - (i_934_ >>> 8));
					if (i_930_ == 0 && anInt9007 != 255) {
					    i_930_ = i_934_;
					    i_934_ = is[i_903_];
					    i_934_ = (((((i_930_ & 0xff00ff)
							 * anInt9007)
							+ ((i_934_ & 0xff00ff)
							   * anInt9028))
						       & ~0xff00ff)
						      + ((((i_930_ & 0xff00)
							   * anInt9007)
							  + ((i_934_ & 0xff00)
							     * anInt9028))
							 & 0xff0000)) >> 8;
					}
					is[i_903_] = i_934_;
				    } else if (i == 2) {
					int i_935_ = aByteArray11422[i_902_];
					if (i_935_ != 0) {
					    int i_936_ = (anIntArray11423
							  [i_935_ & 0xff]);
					    int i_937_ = (((i_936_ & 0xff00ff)
							   * anInt9007)
							  & ~0xff00ff);
					    int i_938_ = (((i_936_ & 0xff00)
							   * anInt9007)
							  & 0xff0000);
					    is[i_903_++] = ((i_937_ | i_938_)
							    >>> 8) + anInt9034;
					}
				    } else
					throw new IllegalArgumentException();
				} else if (i_896_ == 2) {
				    if (i == 1) {
					int i_939_ = aByteArray11422[i_902_];
					if (i_939_ != 0) {
					    int i_940_ = (anIntArray11423
							  [i_939_ & 0xff]);
					    int i_941_ = is[i_903_];
					    int i_942_ = i_940_ + i_941_;
					    int i_943_
						= ((i_940_ & 0xff00ff)
						   + (i_941_ & 0xff00ff));
					    i_941_ = ((i_943_ & 0x1000100)
						      + (i_942_ - i_943_
							 & 0x10000));
					    is[i_903_]
						= (i_942_ - i_941_
						   | i_941_ - (i_941_ >>> 8));
					}
				    } else if (i == 0) {
					int i_944_ = aByteArray11422[i_902_];
					if (i_944_ != 0) {
					    int i_945_ = (anIntArray11423
							  [i_944_ & 0xff]);
					    int i_946_ = (((i_945_ & 0xff0000)
							   * anInt9031)
							  & ~0xffffff);
					    int i_947_ = (((i_945_ & 0xff00)
							   * anInt9030)
							  & 0xff0000);
					    int i_948_
						= ((i_945_ & 0xff) * anInt9027
						   & 0xff00);
					    i_945_ = (i_946_ | i_947_
						      | i_948_) >>> 8;
					    int i_949_ = is[i_903_];
					    int i_950_ = i_945_ + i_949_;
					    int i_951_
						= ((i_945_ & 0xff00ff)
						   + (i_949_ & 0xff00ff));
					    i_949_ = ((i_951_ & 0x1000100)
						      + (i_950_ - i_951_
							 & 0x10000));
					    is[i_903_]
						= (i_950_ - i_949_
						   | i_949_ - (i_949_ >>> 8));
					}
				    } else if (i == 3) {
					byte i_952_ = aByteArray11422[i_902_];
					int i_953_
					    = (i_952_ > 0
					       ? anIntArray11423[i_952_] : 0);
					int i_954_ = anInt9026;
					int i_955_ = i_953_ + i_954_;
					int i_956_ = ((i_953_ & 0xff00ff)
						      + (i_954_ & 0xff00ff));
					int i_957_
					    = ((i_956_ & 0x1000100)
					       + (i_955_ - i_956_ & 0x10000));
					i_957_ = (i_955_ - i_957_
						  | i_957_ - (i_957_ >>> 8));
					if (i_953_ == 0 && anInt9007 != 255) {
					    i_953_ = i_957_;
					    i_957_ = is[i_903_];
					    i_957_ = (((((i_953_ & 0xff00ff)
							 * anInt9007)
							+ ((i_957_ & 0xff00ff)
							   * anInt9028))
						       & ~0xff00ff)
						      + ((((i_953_ & 0xff00)
							   * anInt9007)
							  + ((i_957_ & 0xff00)
							     * anInt9028))
							 & 0xff0000)) >> 8;
					}
					is[i_903_] = i_957_;
				    } else if (i == 2) {
					int i_958_ = aByteArray11422[i_902_];
					if (i_958_ != 0) {
					    int i_959_ = (anIntArray11423
							  [i_958_ & 0xff]);
					    int i_960_ = (((i_959_ & 0xff00ff)
							   * anInt9007)
							  & ~0xff00ff);
					    int i_961_ = (((i_959_ & 0xff00)
							   * anInt9007)
							  & 0xff0000);
					    i_959_ = (((i_960_ | i_961_) >>> 8)
						      + anInt9034);
					    int i_962_ = is[i_903_];
					    int i_963_ = i_959_ + i_962_;
					    int i_964_
						= ((i_959_ & 0xff00ff)
						   + (i_962_ & 0xff00ff));
					    i_962_ = ((i_964_ & 0x1000100)
						      + (i_963_ - i_964_
							 & 0x10000));
					    is[i_903_]
						= (i_963_ - i_962_
						   | i_962_ - (i_962_ >>> 8));
					}
				    }
				} else
				    throw new IllegalArgumentException();
			    }
			}
			i_897_++;
			anInt9015 += anInt9014;
		    }
		} else if (anInt9017 < 0) {
		    int i_965_ = anInt9023;
		    while (i_965_ < 0) {
			int i_966_ = anInt9015;
			int i_967_ = anInt9022;
			int i_968_ = anInt8999 + anInt9025;
			int i_969_ = anInt9011;
			if (i_967_ >= 0 && i_967_ - (anInt9000 << 12) < 0) {
			    int i_970_;
			    if ((i_970_ = i_968_ - (anInt9001 << 12)) >= 0) {
				i_970_ = (anInt9017 - i_970_) / anInt9017;
				i_969_ += i_970_;
				i_968_ += anInt9017 * i_970_;
				i_966_ += i_970_;
			    }
			    if ((i_970_ = (i_968_ - anInt9017) / anInt9017)
				> i_969_)
				i_969_ = i_970_;
			    for (/**/; i_969_ < 0; i_969_++) {
				int i_971_ = ((i_968_ >> 12) * anInt9000
					      + (i_967_ >> 12));
				int i_972_ = i_966_++;
				if (i_896_ == 0) {
				    if (i == 1)
					is[i_972_] = (anIntArray11423
						      [(aByteArray11422[i_971_]
							& 0xff)]);
				    else if (i == 0) {
					int i_973_ = (anIntArray11423
						      [(aByteArray11422[i_971_]
							& 0xff)]);
					int i_974_
					    = ((i_973_ & 0xff0000) * anInt9031
					       & ~0xffffff);
					int i_975_
					    = ((i_973_ & 0xff00) * anInt9030
					       & 0xff0000);
					int i_976_
					    = ((i_973_ & 0xff) * anInt9027
					       & 0xff00);
					is[i_972_]
					    = (i_974_ | i_975_ | i_976_) >>> 8;
				    } else if (i == 3) {
					int i_977_ = (anIntArray11423
						      [(aByteArray11422[i_971_]
							& 0xff)]);
					int i_978_ = anInt9026;
					int i_979_ = i_977_ + i_978_;
					int i_980_ = ((i_977_ & 0xff00ff)
						      + (i_978_ & 0xff00ff));
					int i_981_
					    = ((i_980_ & 0x1000100)
					       + (i_979_ - i_980_ & 0x10000));
					is[i_972_]
					    = (i_979_ - i_981_
					       | i_981_ - (i_981_ >>> 8));
				    } else if (i == 2) {
					int i_982_ = (anIntArray11423
						      [(aByteArray11422[i_971_]
							& 0xff)]);
					int i_983_
					    = ((i_982_ & 0xff00ff) * anInt9007
					       & ~0xff00ff);
					int i_984_
					    = ((i_982_ & 0xff00) * anInt9007
					       & 0xff0000);
					is[i_972_] = (((i_983_ | i_984_) >>> 8)
						      + anInt9034);
				    } else
					throw new IllegalArgumentException();
				} else if (i_896_ == 1) {
				    if (i == 1) {
					int i_985_ = aByteArray11422[i_971_];
					if (i_985_ != 0)
					    is[i_972_] = (anIntArray11423
							  [i_985_ & 0xff]);
				    } else if (i == 0) {
					int i_986_ = aByteArray11422[i_971_];
					if (i_986_ != 0) {
					    int i_987_ = (anIntArray11423
							  [i_986_ & 0xff]);
					    if ((anInt9026 & 0xffffff)
						== 16777215) {
						int i_988_ = anInt9026 >>> 24;
						int i_989_ = 256 - i_988_;
						int i_990_ = is[i_972_];
						is[i_972_]
						    = (((((i_987_ & 0xff00ff)
							  * i_988_)
							 + ((i_990_ & 0xff00ff)
							    * i_989_))
							& ~0xff00ff)
						       + ((((i_987_ & 0xff00)
							    * i_988_)
							   + ((i_990_ & 0xff00)
							      * i_989_))
							  & 0xff0000)) >> 8;
					    } else if (anInt9007 != 255) {
						int i_991_
						    = (((i_987_ & 0xff0000)
							* anInt9031)
						       & ~0xffffff);
						int i_992_
						    = (((i_987_ & 0xff00)
							* anInt9030)
						       & 0xff0000);
						int i_993_ = (((i_987_ & 0xff)
							       * anInt9027)
							      & 0xff00);
						i_987_ = (i_991_ | i_992_
							  | i_993_) >>> 8;
						int i_994_ = is[i_972_];
						is[i_972_]
						    = (((((i_987_ & 0xff00ff)
							  * anInt9007)
							 + ((i_994_ & 0xff00ff)
							    * anInt9028))
							& ~0xff00ff)
						       + ((((i_987_ & 0xff00)
							    * anInt9007)
							   + ((i_994_ & 0xff00)
							      * anInt9028))
							  & 0xff0000)) >> 8;
					    } else {
						int i_995_
						    = (((i_987_ & 0xff0000)
							* anInt9031)
						       & ~0xffffff);
						int i_996_
						    = (((i_987_ & 0xff00)
							* anInt9030)
						       & 0xff0000);
						int i_997_ = (((i_987_ & 0xff)
							       * anInt9027)
							      & 0xff00);
						is[i_972_] = (i_995_ | i_996_
							      | i_997_) >>> 8;
					    }
					}
				    } else if (i == 3) {
					byte i_998_ = aByteArray11422[i_971_];
					int i_999_
					    = (i_998_ > 0
					       ? anIntArray11423[i_998_] : 0);
					int i_1000_ = anInt9026;
					int i_1001_ = i_999_ + i_1000_;
					int i_1002_ = ((i_999_ & 0xff00ff)
						       + (i_1000_ & 0xff00ff));
					int i_1003_ = ((i_1002_ & 0x1000100)
						       + (i_1001_ - i_1002_
							  & 0x10000));
					i_1003_
					    = (i_1001_ - i_1003_
					       | i_1003_ - (i_1003_ >>> 8));
					if (i_999_ == 0 && anInt9007 != 255) {
					    i_999_ = i_1003_;
					    i_1003_ = is[i_972_];
					    i_1003_
						= (((((i_999_ & 0xff00ff)
						      * anInt9007)
						     + ((i_1003_ & 0xff00ff)
							* anInt9028))
						    & ~0xff00ff)
						   + ((((i_999_ & 0xff00)
							* anInt9007)
						       + ((i_1003_ & 0xff00)
							  * anInt9028))
						      & 0xff0000)) >> 8;
					}
					is[i_972_] = i_1003_;
				    } else if (i == 2) {
					int i_1004_ = aByteArray11422[i_971_];
					if (i_1004_ != 0) {
					    int i_1005_ = (anIntArray11423
							   [i_1004_ & 0xff]);
					    int i_1006_
						= (((i_1005_ & 0xff00ff)
						    * anInt9007)
						   & ~0xff00ff);
					    int i_1007_ = (((i_1005_ & 0xff00)
							    * anInt9007)
							   & 0xff0000);
					    is[i_972_++] = ((i_1006_ | i_1007_)
							    >>> 8) + anInt9034;
					}
				    } else
					throw new IllegalArgumentException();
				} else if (i_896_ == 2) {
				    if (i == 1) {
					int i_1008_ = aByteArray11422[i_971_];
					if (i_1008_ != 0) {
					    int i_1009_ = (anIntArray11423
							   [i_1008_ & 0xff]);
					    int i_1010_ = is[i_972_];
					    int i_1011_ = i_1009_ + i_1010_;
					    int i_1012_
						= ((i_1009_ & 0xff00ff)
						   + (i_1010_ & 0xff00ff));
					    i_1010_ = ((i_1012_ & 0x1000100)
						       + (i_1011_ - i_1012_
							  & 0x10000));
					    is[i_972_] = (i_1011_ - i_1010_
							  | i_1010_ - (i_1010_
								       >>> 8));
					}
				    } else if (i == 0) {
					int i_1013_ = aByteArray11422[i_971_];
					if (i_1013_ != 0) {
					    int i_1014_ = (anIntArray11423
							   [i_1013_ & 0xff]);
					    int i_1015_
						= (((i_1014_ & 0xff0000)
						    * anInt9031)
						   & ~0xffffff);
					    int i_1016_ = (((i_1014_ & 0xff00)
							    * anInt9030)
							   & 0xff0000);
					    int i_1017_
						= ((i_1014_ & 0xff) * anInt9027
						   & 0xff00);
					    i_1014_ = (i_1015_ | i_1016_
						       | i_1017_) >>> 8;
					    int i_1018_ = is[i_972_];
					    int i_1019_ = i_1014_ + i_1018_;
					    int i_1020_
						= ((i_1014_ & 0xff00ff)
						   + (i_1018_ & 0xff00ff));
					    i_1018_ = ((i_1020_ & 0x1000100)
						       + (i_1019_ - i_1020_
							  & 0x10000));
					    is[i_972_] = (i_1019_ - i_1018_
							  | i_1018_ - (i_1018_
								       >>> 8));
					}
				    } else if (i == 3) {
					byte i_1021_ = aByteArray11422[i_971_];
					int i_1022_
					    = (i_1021_ > 0
					       ? anIntArray11423[i_1021_] : 0);
					int i_1023_ = anInt9026;
					int i_1024_ = i_1022_ + i_1023_;
					int i_1025_ = ((i_1022_ & 0xff00ff)
						       + (i_1023_ & 0xff00ff));
					int i_1026_ = ((i_1025_ & 0x1000100)
						       + (i_1024_ - i_1025_
							  & 0x10000));
					i_1026_
					    = (i_1024_ - i_1026_
					       | i_1026_ - (i_1026_ >>> 8));
					if (i_1022_ == 0 && anInt9007 != 255) {
					    i_1022_ = i_1026_;
					    i_1026_ = is[i_972_];
					    i_1026_
						= (((((i_1022_ & 0xff00ff)
						      * anInt9007)
						     + ((i_1026_ & 0xff00ff)
							* anInt9028))
						    & ~0xff00ff)
						   + ((((i_1022_ & 0xff00)
							* anInt9007)
						       + ((i_1026_ & 0xff00)
							  * anInt9028))
						      & 0xff0000)) >> 8;
					}
					is[i_972_] = i_1026_;
				    } else if (i == 2) {
					int i_1027_ = aByteArray11422[i_971_];
					if (i_1027_ != 0) {
					    int i_1028_ = (anIntArray11423
							   [i_1027_ & 0xff]);
					    int i_1029_
						= (((i_1028_ & 0xff00ff)
						    * anInt9007)
						   & ~0xff00ff);
					    int i_1030_ = (((i_1028_ & 0xff00)
							    * anInt9007)
							   & 0xff0000);
					    i_1028_ = ((i_1029_ | i_1030_)
						       >>> 8) + anInt9034;
					    int i_1031_ = is[i_972_];
					    int i_1032_ = i_1028_ + i_1031_;
					    int i_1033_
						= ((i_1028_ & 0xff00ff)
						   + (i_1031_ & 0xff00ff));
					    i_1031_ = ((i_1033_ & 0x1000100)
						       + (i_1032_ - i_1033_
							  & 0x10000));
					    is[i_972_] = (i_1032_ - i_1031_
							  | i_1031_ - (i_1031_
								       >>> 8));
					}
				    }
				} else
				    throw new IllegalArgumentException();
				i_968_ += anInt9017;
			    }
			}
			i_965_++;
			anInt9022 += anInt9018;
			anInt9015 += anInt9014;
		    }
		} else {
		    int i_1034_ = anInt9023;
		    while (i_1034_ < 0) {
			int i_1035_ = anInt9015;
			int i_1036_ = anInt9022;
			int i_1037_ = anInt8999 + anInt9025;
			int i_1038_ = anInt9011;
			if (i_1036_ >= 0 && i_1036_ - (anInt9000 << 12) < 0) {
			    if (i_1037_ < 0) {
				int i_1039_
				    = (anInt9017 - 1 - i_1037_) / anInt9017;
				i_1038_ += i_1039_;
				i_1037_ += anInt9017 * i_1039_;
				i_1035_ += i_1039_;
			    }
			    int i_1040_;
			    if ((i_1040_ = (1 + i_1037_ - (anInt9001 << 12)
					    - anInt9017) / anInt9017)
				> i_1038_)
				i_1038_ = i_1040_;
			    for (/**/; i_1038_ < 0; i_1038_++) {
				int i_1041_ = ((i_1037_ >> 12) * anInt9000
					       + (i_1036_ >> 12));
				int i_1042_ = i_1035_++;
				if (i_896_ == 0) {
				    if (i == 1)
					is[i_1042_]
					    = (anIntArray11423
					       [(aByteArray11422[i_1041_]
						 & 0xff)]);
				    else if (i == 0) {
					int i_1043_
					    = (anIntArray11423
					       [(aByteArray11422[i_1041_]
						 & 0xff)]);
					int i_1044_
					    = ((i_1043_ & 0xff0000) * anInt9031
					       & ~0xffffff);
					int i_1045_
					    = ((i_1043_ & 0xff00) * anInt9030
					       & 0xff0000);
					int i_1046_
					    = ((i_1043_ & 0xff) * anInt9027
					       & 0xff00);
					is[i_1042_] = (i_1044_ | i_1045_
						       | i_1046_) >>> 8;
				    } else if (i == 3) {
					int i_1047_
					    = (anIntArray11423
					       [(aByteArray11422[i_1041_]
						 & 0xff)]);
					int i_1048_ = anInt9026;
					int i_1049_ = i_1047_ + i_1048_;
					int i_1050_ = ((i_1047_ & 0xff00ff)
						       + (i_1048_ & 0xff00ff));
					int i_1051_ = ((i_1050_ & 0x1000100)
						       + (i_1049_ - i_1050_
							  & 0x10000));
					is[i_1042_]
					    = (i_1049_ - i_1051_
					       | i_1051_ - (i_1051_ >>> 8));
				    } else if (i == 2) {
					int i_1052_
					    = (anIntArray11423
					       [(aByteArray11422[i_1041_]
						 & 0xff)]);
					int i_1053_
					    = ((i_1052_ & 0xff00ff) * anInt9007
					       & ~0xff00ff);
					int i_1054_
					    = ((i_1052_ & 0xff00) * anInt9007
					       & 0xff0000);
					is[i_1042_] = ((i_1053_ | i_1054_)
						       >>> 8) + anInt9034;
				    } else
					throw new IllegalArgumentException();
				} else if (i_896_ == 1) {
				    if (i == 1) {
					int i_1055_ = aByteArray11422[i_1041_];
					if (i_1055_ != 0)
					    is[i_1042_] = (anIntArray11423
							   [i_1055_ & 0xff]);
				    } else if (i == 0) {
					int i_1056_ = aByteArray11422[i_1041_];
					if (i_1056_ != 0) {
					    int i_1057_ = (anIntArray11423
							   [i_1056_ & 0xff]);
					    if ((anInt9026 & 0xffffff)
						== 16777215) {
						int i_1058_ = anInt9026 >>> 24;
						int i_1059_ = 256 - i_1058_;
						int i_1060_ = is[i_1042_];
						is[i_1042_]
						    = (((((i_1057_ & 0xff00ff)
							  * i_1058_)
							 + ((i_1060_
							     & 0xff00ff)
							    * i_1059_))
							& ~0xff00ff)
						       + ((((i_1057_ & 0xff00)
							    * i_1058_)
							   + ((i_1060_
							       & 0xff00)
							      * i_1059_))
							  & 0xff0000)) >> 8;
					    } else if (anInt9007 != 255) {
						int i_1061_
						    = (((i_1057_ & 0xff0000)
							* anInt9031)
						       & ~0xffffff);
						int i_1062_
						    = (((i_1057_ & 0xff00)
							* anInt9030)
						       & 0xff0000);
						int i_1063_
						    = (((i_1057_ & 0xff)
							* anInt9027)
						       & 0xff00);
						i_1057_ = (i_1061_ | i_1062_
							   | i_1063_) >>> 8;
						int i_1064_ = is[i_1042_];
						is[i_1042_]
						    = (((((i_1057_ & 0xff00ff)
							  * anInt9007)
							 + ((i_1064_
							     & 0xff00ff)
							    * anInt9028))
							& ~0xff00ff)
						       + ((((i_1057_ & 0xff00)
							    * anInt9007)
							   + ((i_1064_
							       & 0xff00)
							      * anInt9028))
							  & 0xff0000)) >> 8;
					    } else {
						int i_1065_
						    = (((i_1057_ & 0xff0000)
							* anInt9031)
						       & ~0xffffff);
						int i_1066_
						    = (((i_1057_ & 0xff00)
							* anInt9030)
						       & 0xff0000);
						int i_1067_
						    = (((i_1057_ & 0xff)
							* anInt9027)
						       & 0xff00);
						is[i_1042_]
						    = (i_1065_ | i_1066_
						       | i_1067_) >>> 8;
					    }
					}
				    } else if (i == 3) {
					byte i_1068_
					    = aByteArray11422[i_1041_];
					int i_1069_
					    = (i_1068_ > 0
					       ? anIntArray11423[i_1068_] : 0);
					int i_1070_ = anInt9026;
					int i_1071_ = i_1069_ + i_1070_;
					int i_1072_ = ((i_1069_ & 0xff00ff)
						       + (i_1070_ & 0xff00ff));
					int i_1073_ = ((i_1072_ & 0x1000100)
						       + (i_1071_ - i_1072_
							  & 0x10000));
					i_1073_
					    = (i_1071_ - i_1073_
					       | i_1073_ - (i_1073_ >>> 8));
					if (i_1069_ == 0 && anInt9007 != 255) {
					    i_1069_ = i_1073_;
					    i_1073_ = is[i_1042_];
					    i_1073_
						= (((((i_1069_ & 0xff00ff)
						      * anInt9007)
						     + ((i_1073_ & 0xff00ff)
							* anInt9028))
						    & ~0xff00ff)
						   + ((((i_1069_ & 0xff00)
							* anInt9007)
						       + ((i_1073_ & 0xff00)
							  * anInt9028))
						      & 0xff0000)) >> 8;
					}
					is[i_1042_] = i_1073_;
				    } else if (i == 2) {
					int i_1074_ = aByteArray11422[i_1041_];
					if (i_1074_ != 0) {
					    int i_1075_ = (anIntArray11423
							   [i_1074_ & 0xff]);
					    int i_1076_
						= (((i_1075_ & 0xff00ff)
						    * anInt9007)
						   & ~0xff00ff);
					    int i_1077_ = (((i_1075_ & 0xff00)
							    * anInt9007)
							   & 0xff0000);
					    is[i_1042_++]
						= (((i_1076_ | i_1077_) >>> 8)
						   + anInt9034);
					}
				    } else
					throw new IllegalArgumentException();
				} else if (i_896_ == 2) {
				    if (i == 1) {
					int i_1078_ = aByteArray11422[i_1041_];
					if (i_1078_ != 0) {
					    int i_1079_ = (anIntArray11423
							   [i_1078_ & 0xff]);
					    int i_1080_ = is[i_1042_];
					    int i_1081_ = i_1079_ + i_1080_;
					    int i_1082_
						= ((i_1079_ & 0xff00ff)
						   + (i_1080_ & 0xff00ff));
					    i_1080_ = ((i_1082_ & 0x1000100)
						       + (i_1081_ - i_1082_
							  & 0x10000));
					    is[i_1042_]
						= (i_1081_ - i_1080_
						   | i_1080_ - (i_1080_
								>>> 8));
					}
				    } else if (i == 0) {
					int i_1083_ = aByteArray11422[i_1041_];
					if (i_1083_ != 0) {
					    int i_1084_ = (anIntArray11423
							   [i_1083_ & 0xff]);
					    int i_1085_
						= (((i_1084_ & 0xff0000)
						    * anInt9031)
						   & ~0xffffff);
					    int i_1086_ = (((i_1084_ & 0xff00)
							    * anInt9030)
							   & 0xff0000);
					    int i_1087_
						= ((i_1084_ & 0xff) * anInt9027
						   & 0xff00);
					    i_1084_ = (i_1085_ | i_1086_
						       | i_1087_) >>> 8;
					    int i_1088_ = is[i_1042_];
					    int i_1089_ = i_1084_ + i_1088_;
					    int i_1090_
						= ((i_1084_ & 0xff00ff)
						   + (i_1088_ & 0xff00ff));
					    i_1088_ = ((i_1090_ & 0x1000100)
						       + (i_1089_ - i_1090_
							  & 0x10000));
					    is[i_1042_]
						= (i_1089_ - i_1088_
						   | i_1088_ - (i_1088_
								>>> 8));
					}
				    } else if (i == 3) {
					byte i_1091_
					    = aByteArray11422[i_1041_];
					int i_1092_
					    = (i_1091_ > 0
					       ? anIntArray11423[i_1091_] : 0);
					int i_1093_ = anInt9026;
					int i_1094_ = i_1092_ + i_1093_;
					int i_1095_ = ((i_1092_ & 0xff00ff)
						       + (i_1093_ & 0xff00ff));
					int i_1096_ = ((i_1095_ & 0x1000100)
						       + (i_1094_ - i_1095_
							  & 0x10000));
					i_1096_
					    = (i_1094_ - i_1096_
					       | i_1096_ - (i_1096_ >>> 8));
					if (i_1092_ == 0 && anInt9007 != 255) {
					    i_1092_ = i_1096_;
					    i_1096_ = is[i_1042_];
					    i_1096_
						= (((((i_1092_ & 0xff00ff)
						      * anInt9007)
						     + ((i_1096_ & 0xff00ff)
							* anInt9028))
						    & ~0xff00ff)
						   + ((((i_1092_ & 0xff00)
							* anInt9007)
						       + ((i_1096_ & 0xff00)
							  * anInt9028))
						      & 0xff0000)) >> 8;
					}
					is[i_1042_] = i_1096_;
				    } else if (i == 2) {
					int i_1097_ = aByteArray11422[i_1041_];
					if (i_1097_ != 0) {
					    int i_1098_ = (anIntArray11423
							   [i_1097_ & 0xff]);
					    int i_1099_
						= (((i_1098_ & 0xff00ff)
						    * anInt9007)
						   & ~0xff00ff);
					    int i_1100_ = (((i_1098_ & 0xff00)
							    * anInt9007)
							   & 0xff0000);
					    i_1098_ = ((i_1099_ | i_1100_)
						       >>> 8) + anInt9034;
					    int i_1101_ = is[i_1042_];
					    int i_1102_ = i_1098_ + i_1101_;
					    int i_1103_
						= ((i_1098_ & 0xff00ff)
						   + (i_1101_ & 0xff00ff));
					    i_1101_ = ((i_1103_ & 0x1000100)
						       + (i_1102_ - i_1103_
							  & 0x10000));
					    is[i_1042_]
						= (i_1102_ - i_1101_
						   | i_1101_ - (i_1101_
								>>> 8));
					}
				    }
				} else
				    throw new IllegalArgumentException();
				i_1037_ += anInt9017;
			    }
			}
			i_1034_++;
			anInt9022 += anInt9018;
			anInt9015 += anInt9014;
		    }
		}
	    } else if (anInt9006 < 0) {
		if (anInt9017 == 0) {
		    int i_1104_ = anInt9023;
		    while (i_1104_ < 0) {
			int i_1105_ = anInt9015;
			int i_1106_ = anInt9022 + anInt9024;
			int i_1107_ = anInt8999;
			int i_1108_ = anInt9011;
			if (i_1107_ >= 0 && i_1107_ - (anInt9001 << 12) < 0) {
			    int i_1109_;
			    if ((i_1109_ = i_1106_ - (anInt9000 << 12)) >= 0) {
				i_1109_ = (anInt9006 - i_1109_) / anInt9006;
				i_1108_ += i_1109_;
				i_1106_ += anInt9006 * i_1109_;
				i_1105_ += i_1109_;
			    }
			    if ((i_1109_ = (i_1106_ - anInt9006) / anInt9006)
				> i_1108_)
				i_1108_ = i_1109_;
			    for (/**/; i_1108_ < 0; i_1108_++) {
				int i_1110_ = ((i_1107_ >> 12) * anInt9000
					       + (i_1106_ >> 12));
				int i_1111_ = i_1105_++;
				if (i_896_ == 0) {
				    if (i == 1)
					is[i_1111_]
					    = (anIntArray11423
					       [(aByteArray11422[i_1110_]
						 & 0xff)]);
				    else if (i == 0) {
					int i_1112_
					    = (anIntArray11423
					       [(aByteArray11422[i_1110_]
						 & 0xff)]);
					int i_1113_
					    = ((i_1112_ & 0xff0000) * anInt9031
					       & ~0xffffff);
					int i_1114_
					    = ((i_1112_ & 0xff00) * anInt9030
					       & 0xff0000);
					int i_1115_
					    = ((i_1112_ & 0xff) * anInt9027
					       & 0xff00);
					is[i_1111_] = (i_1113_ | i_1114_
						       | i_1115_) >>> 8;
				    } else if (i == 3) {
					int i_1116_
					    = (anIntArray11423
					       [(aByteArray11422[i_1110_]
						 & 0xff)]);
					int i_1117_ = anInt9026;
					int i_1118_ = i_1116_ + i_1117_;
					int i_1119_ = ((i_1116_ & 0xff00ff)
						       + (i_1117_ & 0xff00ff));
					int i_1120_ = ((i_1119_ & 0x1000100)
						       + (i_1118_ - i_1119_
							  & 0x10000));
					is[i_1111_]
					    = (i_1118_ - i_1120_
					       | i_1120_ - (i_1120_ >>> 8));
				    } else if (i == 2) {
					int i_1121_
					    = (anIntArray11423
					       [(aByteArray11422[i_1110_]
						 & 0xff)]);
					int i_1122_
					    = ((i_1121_ & 0xff00ff) * anInt9007
					       & ~0xff00ff);
					int i_1123_
					    = ((i_1121_ & 0xff00) * anInt9007
					       & 0xff0000);
					is[i_1111_] = ((i_1122_ | i_1123_)
						       >>> 8) + anInt9034;
				    } else
					throw new IllegalArgumentException();
				} else if (i_896_ == 1) {
				    if (i == 1) {
					int i_1124_ = aByteArray11422[i_1110_];
					if (i_1124_ != 0)
					    is[i_1111_] = (anIntArray11423
							   [i_1124_ & 0xff]);
				    } else if (i == 0) {
					int i_1125_ = aByteArray11422[i_1110_];
					if (i_1125_ != 0) {
					    int i_1126_ = (anIntArray11423
							   [i_1125_ & 0xff]);
					    if ((anInt9026 & 0xffffff)
						== 16777215) {
						int i_1127_ = anInt9026 >>> 24;
						int i_1128_ = 256 - i_1127_;
						int i_1129_ = is[i_1111_];
						is[i_1111_]
						    = (((((i_1126_ & 0xff00ff)
							  * i_1127_)
							 + ((i_1129_
							     & 0xff00ff)
							    * i_1128_))
							& ~0xff00ff)
						       + ((((i_1126_ & 0xff00)
							    * i_1127_)
							   + ((i_1129_
							       & 0xff00)
							      * i_1128_))
							  & 0xff0000)) >> 8;
					    } else if (anInt9007 != 255) {
						int i_1130_
						    = (((i_1126_ & 0xff0000)
							* anInt9031)
						       & ~0xffffff);
						int i_1131_
						    = (((i_1126_ & 0xff00)
							* anInt9030)
						       & 0xff0000);
						int i_1132_
						    = (((i_1126_ & 0xff)
							* anInt9027)
						       & 0xff00);
						i_1126_ = (i_1130_ | i_1131_
							   | i_1132_) >>> 8;
						int i_1133_ = is[i_1111_];
						is[i_1111_]
						    = (((((i_1126_ & 0xff00ff)
							  * anInt9007)
							 + ((i_1133_
							     & 0xff00ff)
							    * anInt9028))
							& ~0xff00ff)
						       + ((((i_1126_ & 0xff00)
							    * anInt9007)
							   + ((i_1133_
							       & 0xff00)
							      * anInt9028))
							  & 0xff0000)) >> 8;
					    } else {
						int i_1134_
						    = (((i_1126_ & 0xff0000)
							* anInt9031)
						       & ~0xffffff);
						int i_1135_
						    = (((i_1126_ & 0xff00)
							* anInt9030)
						       & 0xff0000);
						int i_1136_
						    = (((i_1126_ & 0xff)
							* anInt9027)
						       & 0xff00);
						is[i_1111_]
						    = (i_1134_ | i_1135_
						       | i_1136_) >>> 8;
					    }
					}
				    } else if (i == 3) {
					byte i_1137_
					    = aByteArray11422[i_1110_];
					int i_1138_
					    = (i_1137_ > 0
					       ? anIntArray11423[i_1137_] : 0);
					int i_1139_ = anInt9026;
					int i_1140_ = i_1138_ + i_1139_;
					int i_1141_ = ((i_1138_ & 0xff00ff)
						       + (i_1139_ & 0xff00ff));
					int i_1142_ = ((i_1141_ & 0x1000100)
						       + (i_1140_ - i_1141_
							  & 0x10000));
					i_1142_
					    = (i_1140_ - i_1142_
					       | i_1142_ - (i_1142_ >>> 8));
					if (i_1138_ == 0 && anInt9007 != 255) {
					    i_1138_ = i_1142_;
					    i_1142_ = is[i_1111_];
					    i_1142_
						= (((((i_1138_ & 0xff00ff)
						      * anInt9007)
						     + ((i_1142_ & 0xff00ff)
							* anInt9028))
						    & ~0xff00ff)
						   + ((((i_1138_ & 0xff00)
							* anInt9007)
						       + ((i_1142_ & 0xff00)
							  * anInt9028))
						      & 0xff0000)) >> 8;
					}
					is[i_1111_] = i_1142_;
				    } else if (i == 2) {
					int i_1143_ = aByteArray11422[i_1110_];
					if (i_1143_ != 0) {
					    int i_1144_ = (anIntArray11423
							   [i_1143_ & 0xff]);
					    int i_1145_
						= (((i_1144_ & 0xff00ff)
						    * anInt9007)
						   & ~0xff00ff);
					    int i_1146_ = (((i_1144_ & 0xff00)
							    * anInt9007)
							   & 0xff0000);
					    is[i_1111_++]
						= (((i_1145_ | i_1146_) >>> 8)
						   + anInt9034);
					}
				    } else
					throw new IllegalArgumentException();
				} else if (i_896_ == 2) {
				    if (i == 1) {
					int i_1147_ = aByteArray11422[i_1110_];
					if (i_1147_ != 0) {
					    int i_1148_ = (anIntArray11423
							   [i_1147_ & 0xff]);
					    int i_1149_ = is[i_1111_];
					    int i_1150_ = i_1148_ + i_1149_;
					    int i_1151_
						= ((i_1148_ & 0xff00ff)
						   + (i_1149_ & 0xff00ff));
					    i_1149_ = ((i_1151_ & 0x1000100)
						       + (i_1150_ - i_1151_
							  & 0x10000));
					    is[i_1111_]
						= (i_1150_ - i_1149_
						   | i_1149_ - (i_1149_
								>>> 8));
					}
				    } else if (i == 0) {
					int i_1152_ = aByteArray11422[i_1110_];
					if (i_1152_ != 0) {
					    int i_1153_ = (anIntArray11423
							   [i_1152_ & 0xff]);
					    int i_1154_
						= (((i_1153_ & 0xff0000)
						    * anInt9031)
						   & ~0xffffff);
					    int i_1155_ = (((i_1153_ & 0xff00)
							    * anInt9030)
							   & 0xff0000);
					    int i_1156_
						= ((i_1153_ & 0xff) * anInt9027
						   & 0xff00);
					    i_1153_ = (i_1154_ | i_1155_
						       | i_1156_) >>> 8;
					    int i_1157_ = is[i_1111_];
					    int i_1158_ = i_1153_ + i_1157_;
					    int i_1159_
						= ((i_1153_ & 0xff00ff)
						   + (i_1157_ & 0xff00ff));
					    i_1157_ = ((i_1159_ & 0x1000100)
						       + (i_1158_ - i_1159_
							  & 0x10000));
					    is[i_1111_]
						= (i_1158_ - i_1157_
						   | i_1157_ - (i_1157_
								>>> 8));
					}
				    } else if (i == 3) {
					byte i_1160_
					    = aByteArray11422[i_1110_];
					int i_1161_
					    = (i_1160_ > 0
					       ? anIntArray11423[i_1160_] : 0);
					int i_1162_ = anInt9026;
					int i_1163_ = i_1161_ + i_1162_;
					int i_1164_ = ((i_1161_ & 0xff00ff)
						       + (i_1162_ & 0xff00ff));
					int i_1165_ = ((i_1164_ & 0x1000100)
						       + (i_1163_ - i_1164_
							  & 0x10000));
					i_1165_
					    = (i_1163_ - i_1165_
					       | i_1165_ - (i_1165_ >>> 8));
					if (i_1161_ == 0 && anInt9007 != 255) {
					    i_1161_ = i_1165_;
					    i_1165_ = is[i_1111_];
					    i_1165_
						= (((((i_1161_ & 0xff00ff)
						      * anInt9007)
						     + ((i_1165_ & 0xff00ff)
							* anInt9028))
						    & ~0xff00ff)
						   + ((((i_1161_ & 0xff00)
							* anInt9007)
						       + ((i_1165_ & 0xff00)
							  * anInt9028))
						      & 0xff0000)) >> 8;
					}
					is[i_1111_] = i_1165_;
				    } else if (i == 2) {
					int i_1166_ = aByteArray11422[i_1110_];
					if (i_1166_ != 0) {
					    int i_1167_ = (anIntArray11423
							   [i_1166_ & 0xff]);
					    int i_1168_
						= (((i_1167_ & 0xff00ff)
						    * anInt9007)
						   & ~0xff00ff);
					    int i_1169_ = (((i_1167_ & 0xff00)
							    * anInt9007)
							   & 0xff0000);
					    i_1167_ = ((i_1168_ | i_1169_)
						       >>> 8) + anInt9034;
					    int i_1170_ = is[i_1111_];
					    int i_1171_ = i_1167_ + i_1170_;
					    int i_1172_
						= ((i_1167_ & 0xff00ff)
						   + (i_1170_ & 0xff00ff));
					    i_1170_ = ((i_1172_ & 0x1000100)
						       + (i_1171_ - i_1172_
							  & 0x10000));
					    is[i_1111_]
						= (i_1171_ - i_1170_
						   | i_1170_ - (i_1170_
								>>> 8));
					}
				    }
				} else
				    throw new IllegalArgumentException();
				i_1106_ += anInt9006;
			    }
			}
			i_1104_++;
			anInt8999 += anInt9010;
			anInt9015 += anInt9014;
		    }
		} else if (anInt9017 < 0) {
		    int i_1173_ = anInt9023;
		    while (i_1173_ < 0) {
			int i_1174_ = anInt9015;
			int i_1175_ = anInt9022 + anInt9024;
			int i_1176_ = anInt8999 + anInt9025;
			int i_1177_ = anInt9011;
			int i_1178_;
			if ((i_1178_ = i_1175_ - (anInt9000 << 12)) >= 0) {
			    i_1178_ = (anInt9006 - i_1178_) / anInt9006;
			    i_1177_ += i_1178_;
			    i_1175_ += anInt9006 * i_1178_;
			    i_1176_ += anInt9017 * i_1178_;
			    i_1174_ += i_1178_;
			}
			if ((i_1178_ = (i_1175_ - anInt9006) / anInt9006)
			    > i_1177_)
			    i_1177_ = i_1178_;
			if ((i_1178_ = i_1176_ - (anInt9001 << 12)) >= 0) {
			    i_1178_ = (anInt9017 - i_1178_) / anInt9017;
			    i_1177_ += i_1178_;
			    i_1175_ += anInt9006 * i_1178_;
			    i_1176_ += anInt9017 * i_1178_;
			    i_1174_ += i_1178_;
			}
			if ((i_1178_ = (i_1176_ - anInt9017) / anInt9017)
			    > i_1177_)
			    i_1177_ = i_1178_;
			for (/**/; i_1177_ < 0; i_1177_++) {
			    int i_1179_ = ((i_1176_ >> 12) * anInt9000
					   + (i_1175_ >> 12));
			    int i_1180_ = i_1174_++;
			    if (i_896_ == 0) {
				if (i == 1)
				    is[i_1180_]
					= (anIntArray11423
					   [aByteArray11422[i_1179_] & 0xff]);
				else if (i == 0) {
				    int i_1181_
					= (anIntArray11423
					   [aByteArray11422[i_1179_] & 0xff]);
				    int i_1182_
					= ((i_1181_ & 0xff0000) * anInt9031
					   & ~0xffffff);
				    int i_1183_
					= ((i_1181_ & 0xff00) * anInt9030
					   & 0xff0000);
				    int i_1184_ = ((i_1181_ & 0xff) * anInt9027
						   & 0xff00);
				    is[i_1180_]
					= (i_1182_ | i_1183_ | i_1184_) >>> 8;
				} else if (i == 3) {
				    int i_1185_
					= (anIntArray11423
					   [aByteArray11422[i_1179_] & 0xff]);
				    int i_1186_ = anInt9026;
				    int i_1187_ = i_1185_ + i_1186_;
				    int i_1188_ = ((i_1185_ & 0xff00ff)
						   + (i_1186_ & 0xff00ff));
				    int i_1189_
					= ((i_1188_ & 0x1000100)
					   + (i_1187_ - i_1188_ & 0x10000));
				    is[i_1180_]
					= (i_1187_ - i_1189_
					   | i_1189_ - (i_1189_ >>> 8));
				} else if (i == 2) {
				    int i_1190_
					= (anIntArray11423
					   [aByteArray11422[i_1179_] & 0xff]);
				    int i_1191_
					= ((i_1190_ & 0xff00ff) * anInt9007
					   & ~0xff00ff);
				    int i_1192_
					= ((i_1190_ & 0xff00) * anInt9007
					   & 0xff0000);
				    is[i_1180_] = (((i_1191_ | i_1192_) >>> 8)
						   + anInt9034);
				} else
				    throw new IllegalArgumentException();
			    } else if (i_896_ == 1) {
				if (i == 1) {
				    int i_1193_ = aByteArray11422[i_1179_];
				    if (i_1193_ != 0)
					is[i_1180_]
					    = anIntArray11423[i_1193_ & 0xff];
				} else if (i == 0) {
				    int i_1194_ = aByteArray11422[i_1179_];
				    if (i_1194_ != 0) {
					int i_1195_
					    = anIntArray11423[i_1194_ & 0xff];
					if ((anInt9026 & 0xffffff)
					    == 16777215) {
					    int i_1196_ = anInt9026 >>> 24;
					    int i_1197_ = 256 - i_1196_;
					    int i_1198_ = is[i_1180_];
					    is[i_1180_]
						= (((((i_1195_ & 0xff00ff)
						      * i_1196_)
						     + ((i_1198_ & 0xff00ff)
							* i_1197_))
						    & ~0xff00ff)
						   + ((((i_1195_ & 0xff00)
							* i_1196_)
						       + ((i_1198_ & 0xff00)
							  * i_1197_))
						      & 0xff0000)) >> 8;
					} else if (anInt9007 != 255) {
					    int i_1199_
						= (((i_1195_ & 0xff0000)
						    * anInt9031)
						   & ~0xffffff);
					    int i_1200_ = (((i_1195_ & 0xff00)
							    * anInt9030)
							   & 0xff0000);
					    int i_1201_
						= ((i_1195_ & 0xff) * anInt9027
						   & 0xff00);
					    i_1195_ = (i_1199_ | i_1200_
						       | i_1201_) >>> 8;
					    int i_1202_ = is[i_1180_];
					    is[i_1180_]
						= (((((i_1195_ & 0xff00ff)
						      * anInt9007)
						     + ((i_1202_ & 0xff00ff)
							* anInt9028))
						    & ~0xff00ff)
						   + ((((i_1195_ & 0xff00)
							* anInt9007)
						       + ((i_1202_ & 0xff00)
							  * anInt9028))
						      & 0xff0000)) >> 8;
					} else {
					    int i_1203_
						= (((i_1195_ & 0xff0000)
						    * anInt9031)
						   & ~0xffffff);
					    int i_1204_ = (((i_1195_ & 0xff00)
							    * anInt9030)
							   & 0xff0000);
					    int i_1205_
						= ((i_1195_ & 0xff) * anInt9027
						   & 0xff00);
					    is[i_1180_] = (i_1203_ | i_1204_
							   | i_1205_) >>> 8;
					}
				    }
				} else if (i == 3) {
				    byte i_1206_ = aByteArray11422[i_1179_];
				    int i_1207_
					= (i_1206_ > 0
					   ? anIntArray11423[i_1206_] : 0);
				    int i_1208_ = anInt9026;
				    int i_1209_ = i_1207_ + i_1208_;
				    int i_1210_ = ((i_1207_ & 0xff00ff)
						   + (i_1208_ & 0xff00ff));
				    int i_1211_
					= ((i_1210_ & 0x1000100)
					   + (i_1209_ - i_1210_ & 0x10000));
				    i_1211_ = (i_1209_ - i_1211_
					       | i_1211_ - (i_1211_ >>> 8));
				    if (i_1207_ == 0 && anInt9007 != 255) {
					i_1207_ = i_1211_;
					i_1211_ = is[i_1180_];
					i_1211_ = (((((i_1207_ & 0xff00ff)
						      * anInt9007)
						     + ((i_1211_ & 0xff00ff)
							* anInt9028))
						    & ~0xff00ff)
						   + ((((i_1207_ & 0xff00)
							* anInt9007)
						       + ((i_1211_ & 0xff00)
							  * anInt9028))
						      & 0xff0000)) >> 8;
				    }
				    is[i_1180_] = i_1211_;
				} else if (i == 2) {
				    int i_1212_ = aByteArray11422[i_1179_];
				    if (i_1212_ != 0) {
					int i_1213_
					    = anIntArray11423[i_1212_ & 0xff];
					int i_1214_
					    = ((i_1213_ & 0xff00ff) * anInt9007
					       & ~0xff00ff);
					int i_1215_
					    = ((i_1213_ & 0xff00) * anInt9007
					       & 0xff0000);
					is[i_1180_++] = ((i_1214_ | i_1215_)
							 >>> 8) + anInt9034;
				    }
				} else
				    throw new IllegalArgumentException();
			    } else if (i_896_ == 2) {
				if (i == 1) {
				    int i_1216_ = aByteArray11422[i_1179_];
				    if (i_1216_ != 0) {
					int i_1217_
					    = anIntArray11423[i_1216_ & 0xff];
					int i_1218_ = is[i_1180_];
					int i_1219_ = i_1217_ + i_1218_;
					int i_1220_ = ((i_1217_ & 0xff00ff)
						       + (i_1218_ & 0xff00ff));
					i_1218_ = ((i_1220_ & 0x1000100)
						   + (i_1219_ - i_1220_
						      & 0x10000));
					is[i_1180_]
					    = (i_1219_ - i_1218_
					       | i_1218_ - (i_1218_ >>> 8));
				    }
				} else if (i == 0) {
				    int i_1221_ = aByteArray11422[i_1179_];
				    if (i_1221_ != 0) {
					int i_1222_
					    = anIntArray11423[i_1221_ & 0xff];
					int i_1223_
					    = ((i_1222_ & 0xff0000) * anInt9031
					       & ~0xffffff);
					int i_1224_
					    = ((i_1222_ & 0xff00) * anInt9030
					       & 0xff0000);
					int i_1225_
					    = ((i_1222_ & 0xff) * anInt9027
					       & 0xff00);
					i_1222_ = (i_1223_ | i_1224_
						   | i_1225_) >>> 8;
					int i_1226_ = is[i_1180_];
					int i_1227_ = i_1222_ + i_1226_;
					int i_1228_ = ((i_1222_ & 0xff00ff)
						       + (i_1226_ & 0xff00ff));
					i_1226_ = ((i_1228_ & 0x1000100)
						   + (i_1227_ - i_1228_
						      & 0x10000));
					is[i_1180_]
					    = (i_1227_ - i_1226_
					       | i_1226_ - (i_1226_ >>> 8));
				    }
				} else if (i == 3) {
				    byte i_1229_ = aByteArray11422[i_1179_];
				    int i_1230_
					= (i_1229_ > 0
					   ? anIntArray11423[i_1229_] : 0);
				    int i_1231_ = anInt9026;
				    int i_1232_ = i_1230_ + i_1231_;
				    int i_1233_ = ((i_1230_ & 0xff00ff)
						   + (i_1231_ & 0xff00ff));
				    int i_1234_
					= ((i_1233_ & 0x1000100)
					   + (i_1232_ - i_1233_ & 0x10000));
				    i_1234_ = (i_1232_ - i_1234_
					       | i_1234_ - (i_1234_ >>> 8));
				    if (i_1230_ == 0 && anInt9007 != 255) {
					i_1230_ = i_1234_;
					i_1234_ = is[i_1180_];
					i_1234_ = (((((i_1230_ & 0xff00ff)
						      * anInt9007)
						     + ((i_1234_ & 0xff00ff)
							* anInt9028))
						    & ~0xff00ff)
						   + ((((i_1230_ & 0xff00)
							* anInt9007)
						       + ((i_1234_ & 0xff00)
							  * anInt9028))
						      & 0xff0000)) >> 8;
				    }
				    is[i_1180_] = i_1234_;
				} else if (i == 2) {
				    int i_1235_ = aByteArray11422[i_1179_];
				    if (i_1235_ != 0) {
					int i_1236_
					    = anIntArray11423[i_1235_ & 0xff];
					int i_1237_
					    = ((i_1236_ & 0xff00ff) * anInt9007
					       & ~0xff00ff);
					int i_1238_
					    = ((i_1236_ & 0xff00) * anInt9007
					       & 0xff0000);
					i_1236_ = (((i_1237_ | i_1238_) >>> 8)
						   + anInt9034);
					int i_1239_ = is[i_1180_];
					int i_1240_ = i_1236_ + i_1239_;
					int i_1241_ = ((i_1236_ & 0xff00ff)
						       + (i_1239_ & 0xff00ff));
					i_1239_ = ((i_1241_ & 0x1000100)
						   + (i_1240_ - i_1241_
						      & 0x10000));
					is[i_1180_]
					    = (i_1240_ - i_1239_
					       | i_1239_ - (i_1239_ >>> 8));
				    }
				}
			    } else
				throw new IllegalArgumentException();
			    i_1175_ += anInt9006;
			    i_1176_ += anInt9017;
			}
			i_1173_++;
			anInt9022 += anInt9018;
			anInt8999 += anInt9010;
			anInt9015 += anInt9014;
		    }
		} else {
		    int i_1242_ = anInt9023;
		    while (i_1242_ < 0) {
			int i_1243_ = anInt9015;
			int i_1244_ = anInt9022 + anInt9024;
			int i_1245_ = anInt8999 + anInt9025;
			int i_1246_ = anInt9011;
			int i_1247_;
			if ((i_1247_ = i_1244_ - (anInt9000 << 12)) >= 0) {
			    i_1247_ = (anInt9006 - i_1247_) / anInt9006;
			    i_1246_ += i_1247_;
			    i_1244_ += anInt9006 * i_1247_;
			    i_1245_ += anInt9017 * i_1247_;
			    i_1243_ += i_1247_;
			}
			if ((i_1247_ = (i_1244_ - anInt9006) / anInt9006)
			    > i_1246_)
			    i_1246_ = i_1247_;
			if (i_1245_ < 0) {
			    i_1247_ = (anInt9017 - 1 - i_1245_) / anInt9017;
			    i_1246_ += i_1247_;
			    i_1244_ += anInt9006 * i_1247_;
			    i_1245_ += anInt9017 * i_1247_;
			    i_1243_ += i_1247_;
			}
			if ((i_1247_ = (1 + i_1245_ - (anInt9001 << 12)
					- anInt9017) / anInt9017)
			    > i_1246_)
			    i_1246_ = i_1247_;
			for (/**/; i_1246_ < 0; i_1246_++) {
			    int i_1248_ = ((i_1245_ >> 12) * anInt9000
					   + (i_1244_ >> 12));
			    int i_1249_ = i_1243_++;
			    if (i_896_ == 0) {
				if (i == 1)
				    is[i_1249_]
					= (anIntArray11423
					   [aByteArray11422[i_1248_] & 0xff]);
				else if (i == 0) {
				    int i_1250_
					= (anIntArray11423
					   [aByteArray11422[i_1248_] & 0xff]);
				    int i_1251_
					= ((i_1250_ & 0xff0000) * anInt9031
					   & ~0xffffff);
				    int i_1252_
					= ((i_1250_ & 0xff00) * anInt9030
					   & 0xff0000);
				    int i_1253_ = ((i_1250_ & 0xff) * anInt9027
						   & 0xff00);
				    is[i_1249_]
					= (i_1251_ | i_1252_ | i_1253_) >>> 8;
				} else if (i == 3) {
				    int i_1254_
					= (anIntArray11423
					   [aByteArray11422[i_1248_] & 0xff]);
				    int i_1255_ = anInt9026;
				    int i_1256_ = i_1254_ + i_1255_;
				    int i_1257_ = ((i_1254_ & 0xff00ff)
						   + (i_1255_ & 0xff00ff));
				    int i_1258_
					= ((i_1257_ & 0x1000100)
					   + (i_1256_ - i_1257_ & 0x10000));
				    is[i_1249_]
					= (i_1256_ - i_1258_
					   | i_1258_ - (i_1258_ >>> 8));
				} else if (i == 2) {
				    int i_1259_
					= (anIntArray11423
					   [aByteArray11422[i_1248_] & 0xff]);
				    int i_1260_
					= ((i_1259_ & 0xff00ff) * anInt9007
					   & ~0xff00ff);
				    int i_1261_
					= ((i_1259_ & 0xff00) * anInt9007
					   & 0xff0000);
				    is[i_1249_] = (((i_1260_ | i_1261_) >>> 8)
						   + anInt9034);
				} else
				    throw new IllegalArgumentException();
			    } else if (i_896_ == 1) {
				if (i == 1) {
				    int i_1262_ = aByteArray11422[i_1248_];
				    if (i_1262_ != 0)
					is[i_1249_]
					    = anIntArray11423[i_1262_ & 0xff];
				} else if (i == 0) {
				    int i_1263_ = aByteArray11422[i_1248_];
				    if (i_1263_ != 0) {
					int i_1264_
					    = anIntArray11423[i_1263_ & 0xff];
					if ((anInt9026 & 0xffffff)
					    == 16777215) {
					    int i_1265_ = anInt9026 >>> 24;
					    int i_1266_ = 256 - i_1265_;
					    int i_1267_ = is[i_1249_];
					    is[i_1249_]
						= (((((i_1264_ & 0xff00ff)
						      * i_1265_)
						     + ((i_1267_ & 0xff00ff)
							* i_1266_))
						    & ~0xff00ff)
						   + ((((i_1264_ & 0xff00)
							* i_1265_)
						       + ((i_1267_ & 0xff00)
							  * i_1266_))
						      & 0xff0000)) >> 8;
					} else if (anInt9007 != 255) {
					    int i_1268_
						= (((i_1264_ & 0xff0000)
						    * anInt9031)
						   & ~0xffffff);
					    int i_1269_ = (((i_1264_ & 0xff00)
							    * anInt9030)
							   & 0xff0000);
					    int i_1270_
						= ((i_1264_ & 0xff) * anInt9027
						   & 0xff00);
					    i_1264_ = (i_1268_ | i_1269_
						       | i_1270_) >>> 8;
					    int i_1271_ = is[i_1249_];
					    is[i_1249_]
						= (((((i_1264_ & 0xff00ff)
						      * anInt9007)
						     + ((i_1271_ & 0xff00ff)
							* anInt9028))
						    & ~0xff00ff)
						   + ((((i_1264_ & 0xff00)
							* anInt9007)
						       + ((i_1271_ & 0xff00)
							  * anInt9028))
						      & 0xff0000)) >> 8;
					} else {
					    int i_1272_
						= (((i_1264_ & 0xff0000)
						    * anInt9031)
						   & ~0xffffff);
					    int i_1273_ = (((i_1264_ & 0xff00)
							    * anInt9030)
							   & 0xff0000);
					    int i_1274_
						= ((i_1264_ & 0xff) * anInt9027
						   & 0xff00);
					    is[i_1249_] = (i_1272_ | i_1273_
							   | i_1274_) >>> 8;
					}
				    }
				} else if (i == 3) {
				    byte i_1275_ = aByteArray11422[i_1248_];
				    int i_1276_
					= (i_1275_ > 0
					   ? anIntArray11423[i_1275_] : 0);
				    int i_1277_ = anInt9026;
				    int i_1278_ = i_1276_ + i_1277_;
				    int i_1279_ = ((i_1276_ & 0xff00ff)
						   + (i_1277_ & 0xff00ff));
				    int i_1280_
					= ((i_1279_ & 0x1000100)
					   + (i_1278_ - i_1279_ & 0x10000));
				    i_1280_ = (i_1278_ - i_1280_
					       | i_1280_ - (i_1280_ >>> 8));
				    if (i_1276_ == 0 && anInt9007 != 255) {
					i_1276_ = i_1280_;
					i_1280_ = is[i_1249_];
					i_1280_ = (((((i_1276_ & 0xff00ff)
						      * anInt9007)
						     + ((i_1280_ & 0xff00ff)
							* anInt9028))
						    & ~0xff00ff)
						   + ((((i_1276_ & 0xff00)
							* anInt9007)
						       + ((i_1280_ & 0xff00)
							  * anInt9028))
						      & 0xff0000)) >> 8;
				    }
				    is[i_1249_] = i_1280_;
				} else if (i == 2) {
				    int i_1281_ = aByteArray11422[i_1248_];
				    if (i_1281_ != 0) {
					int i_1282_
					    = anIntArray11423[i_1281_ & 0xff];
					int i_1283_
					    = ((i_1282_ & 0xff00ff) * anInt9007
					       & ~0xff00ff);
					int i_1284_
					    = ((i_1282_ & 0xff00) * anInt9007
					       & 0xff0000);
					is[i_1249_++] = ((i_1283_ | i_1284_)
							 >>> 8) + anInt9034;
				    }
				} else
				    throw new IllegalArgumentException();
			    } else if (i_896_ == 2) {
				if (i == 1) {
				    int i_1285_ = aByteArray11422[i_1248_];
				    if (i_1285_ != 0) {
					int i_1286_
					    = anIntArray11423[i_1285_ & 0xff];
					int i_1287_ = is[i_1249_];
					int i_1288_ = i_1286_ + i_1287_;
					int i_1289_ = ((i_1286_ & 0xff00ff)
						       + (i_1287_ & 0xff00ff));
					i_1287_ = ((i_1289_ & 0x1000100)
						   + (i_1288_ - i_1289_
						      & 0x10000));
					is[i_1249_]
					    = (i_1288_ - i_1287_
					       | i_1287_ - (i_1287_ >>> 8));
				    }
				} else if (i == 0) {
				    int i_1290_ = aByteArray11422[i_1248_];
				    if (i_1290_ != 0) {
					int i_1291_
					    = anIntArray11423[i_1290_ & 0xff];
					int i_1292_
					    = ((i_1291_ & 0xff0000) * anInt9031
					       & ~0xffffff);
					int i_1293_
					    = ((i_1291_ & 0xff00) * anInt9030
					       & 0xff0000);
					int i_1294_
					    = ((i_1291_ & 0xff) * anInt9027
					       & 0xff00);
					i_1291_ = (i_1292_ | i_1293_
						   | i_1294_) >>> 8;
					int i_1295_ = is[i_1249_];
					int i_1296_ = i_1291_ + i_1295_;
					int i_1297_ = ((i_1291_ & 0xff00ff)
						       + (i_1295_ & 0xff00ff));
					i_1295_ = ((i_1297_ & 0x1000100)
						   + (i_1296_ - i_1297_
						      & 0x10000));
					is[i_1249_]
					    = (i_1296_ - i_1295_
					       | i_1295_ - (i_1295_ >>> 8));
				    }
				} else if (i == 3) {
				    byte i_1298_ = aByteArray11422[i_1248_];
				    int i_1299_
					= (i_1298_ > 0
					   ? anIntArray11423[i_1298_] : 0);
				    int i_1300_ = anInt9026;
				    int i_1301_ = i_1299_ + i_1300_;
				    int i_1302_ = ((i_1299_ & 0xff00ff)
						   + (i_1300_ & 0xff00ff));
				    int i_1303_
					= ((i_1302_ & 0x1000100)
					   + (i_1301_ - i_1302_ & 0x10000));
				    i_1303_ = (i_1301_ - i_1303_
					       | i_1303_ - (i_1303_ >>> 8));
				    if (i_1299_ == 0 && anInt9007 != 255) {
					i_1299_ = i_1303_;
					i_1303_ = is[i_1249_];
					i_1303_ = (((((i_1299_ & 0xff00ff)
						      * anInt9007)
						     + ((i_1303_ & 0xff00ff)
							* anInt9028))
						    & ~0xff00ff)
						   + ((((i_1299_ & 0xff00)
							* anInt9007)
						       + ((i_1303_ & 0xff00)
							  * anInt9028))
						      & 0xff0000)) >> 8;
				    }
				    is[i_1249_] = i_1303_;
				} else if (i == 2) {
				    int i_1304_ = aByteArray11422[i_1248_];
				    if (i_1304_ != 0) {
					int i_1305_
					    = anIntArray11423[i_1304_ & 0xff];
					int i_1306_
					    = ((i_1305_ & 0xff00ff) * anInt9007
					       & ~0xff00ff);
					int i_1307_
					    = ((i_1305_ & 0xff00) * anInt9007
					       & 0xff0000);
					i_1305_ = (((i_1306_ | i_1307_) >>> 8)
						   + anInt9034);
					int i_1308_ = is[i_1249_];
					int i_1309_ = i_1305_ + i_1308_;
					int i_1310_ = ((i_1305_ & 0xff00ff)
						       + (i_1308_ & 0xff00ff));
					i_1308_ = ((i_1310_ & 0x1000100)
						   + (i_1309_ - i_1310_
						      & 0x10000));
					is[i_1249_]
					    = (i_1309_ - i_1308_
					       | i_1308_ - (i_1308_ >>> 8));
				    }
				}
			    } else
				throw new IllegalArgumentException();
			    i_1244_ += anInt9006;
			    i_1245_ += anInt9017;
			}
			i_1242_++;
			anInt9022 += anInt9018;
			anInt8999 += anInt9010;
			anInt9015 += anInt9014;
		    }
		}
	    } else if (anInt9017 == 0) {
		int i_1311_ = anInt9023;
		while (i_1311_ < 0) {
		    int i_1312_ = anInt9015;
		    int i_1313_ = anInt9022 + anInt9024;
		    int i_1314_ = anInt8999;
		    int i_1315_ = anInt9011;
		    if (i_1314_ >= 0 && i_1314_ - (anInt9001 << 12) < 0) {
			if (i_1313_ < 0) {
			    int i_1316_
				= (anInt9006 - 1 - i_1313_) / anInt9006;
			    i_1315_ += i_1316_;
			    i_1313_ += anInt9006 * i_1316_;
			    i_1312_ += i_1316_;
			}
			int i_1317_;
			if ((i_1317_ = (1 + i_1313_ - (anInt9000 << 12)
					- anInt9006) / anInt9006)
			    > i_1315_)
			    i_1315_ = i_1317_;
			for (/**/; i_1315_ < 0; i_1315_++) {
			    int i_1318_ = ((i_1314_ >> 12) * anInt9000
					   + (i_1313_ >> 12));
			    int i_1319_ = i_1312_++;
			    if (i_896_ == 0) {
				if (i == 1)
				    is[i_1319_]
					= (anIntArray11423
					   [aByteArray11422[i_1318_] & 0xff]);
				else if (i == 0) {
				    int i_1320_
					= (anIntArray11423
					   [aByteArray11422[i_1318_] & 0xff]);
				    int i_1321_
					= ((i_1320_ & 0xff0000) * anInt9031
					   & ~0xffffff);
				    int i_1322_
					= ((i_1320_ & 0xff00) * anInt9030
					   & 0xff0000);
				    int i_1323_ = ((i_1320_ & 0xff) * anInt9027
						   & 0xff00);
				    is[i_1319_]
					= (i_1321_ | i_1322_ | i_1323_) >>> 8;
				} else if (i == 3) {
				    int i_1324_
					= (anIntArray11423
					   [aByteArray11422[i_1318_] & 0xff]);
				    int i_1325_ = anInt9026;
				    int i_1326_ = i_1324_ + i_1325_;
				    int i_1327_ = ((i_1324_ & 0xff00ff)
						   + (i_1325_ & 0xff00ff));
				    int i_1328_
					= ((i_1327_ & 0x1000100)
					   + (i_1326_ - i_1327_ & 0x10000));
				    is[i_1319_]
					= (i_1326_ - i_1328_
					   | i_1328_ - (i_1328_ >>> 8));
				} else if (i == 2) {
				    int i_1329_
					= (anIntArray11423
					   [aByteArray11422[i_1318_] & 0xff]);
				    int i_1330_
					= ((i_1329_ & 0xff00ff) * anInt9007
					   & ~0xff00ff);
				    int i_1331_
					= ((i_1329_ & 0xff00) * anInt9007
					   & 0xff0000);
				    is[i_1319_] = (((i_1330_ | i_1331_) >>> 8)
						   + anInt9034);
				} else
				    throw new IllegalArgumentException();
			    } else if (i_896_ == 1) {
				if (i == 1) {
				    int i_1332_ = aByteArray11422[i_1318_];
				    if (i_1332_ != 0)
					is[i_1319_]
					    = anIntArray11423[i_1332_ & 0xff];
				} else if (i == 0) {
				    int i_1333_ = aByteArray11422[i_1318_];
				    if (i_1333_ != 0) {
					int i_1334_
					    = anIntArray11423[i_1333_ & 0xff];
					if ((anInt9026 & 0xffffff)
					    == 16777215) {
					    int i_1335_ = anInt9026 >>> 24;
					    int i_1336_ = 256 - i_1335_;
					    int i_1337_ = is[i_1319_];
					    is[i_1319_]
						= (((((i_1334_ & 0xff00ff)
						      * i_1335_)
						     + ((i_1337_ & 0xff00ff)
							* i_1336_))
						    & ~0xff00ff)
						   + ((((i_1334_ & 0xff00)
							* i_1335_)
						       + ((i_1337_ & 0xff00)
							  * i_1336_))
						      & 0xff0000)) >> 8;
					} else if (anInt9007 != 255) {
					    int i_1338_
						= (((i_1334_ & 0xff0000)
						    * anInt9031)
						   & ~0xffffff);
					    int i_1339_ = (((i_1334_ & 0xff00)
							    * anInt9030)
							   & 0xff0000);
					    int i_1340_
						= ((i_1334_ & 0xff) * anInt9027
						   & 0xff00);
					    i_1334_ = (i_1338_ | i_1339_
						       | i_1340_) >>> 8;
					    int i_1341_ = is[i_1319_];
					    is[i_1319_]
						= (((((i_1334_ & 0xff00ff)
						      * anInt9007)
						     + ((i_1341_ & 0xff00ff)
							* anInt9028))
						    & ~0xff00ff)
						   + ((((i_1334_ & 0xff00)
							* anInt9007)
						       + ((i_1341_ & 0xff00)
							  * anInt9028))
						      & 0xff0000)) >> 8;
					} else {
					    int i_1342_
						= (((i_1334_ & 0xff0000)
						    * anInt9031)
						   & ~0xffffff);
					    int i_1343_ = (((i_1334_ & 0xff00)
							    * anInt9030)
							   & 0xff0000);
					    int i_1344_
						= ((i_1334_ & 0xff) * anInt9027
						   & 0xff00);
					    is[i_1319_] = (i_1342_ | i_1343_
							   | i_1344_) >>> 8;
					}
				    }
				} else if (i == 3) {
				    byte i_1345_ = aByteArray11422[i_1318_];
				    int i_1346_
					= (i_1345_ > 0
					   ? anIntArray11423[i_1345_] : 0);
				    int i_1347_ = anInt9026;
				    int i_1348_ = i_1346_ + i_1347_;
				    int i_1349_ = ((i_1346_ & 0xff00ff)
						   + (i_1347_ & 0xff00ff));
				    int i_1350_
					= ((i_1349_ & 0x1000100)
					   + (i_1348_ - i_1349_ & 0x10000));
				    i_1350_ = (i_1348_ - i_1350_
					       | i_1350_ - (i_1350_ >>> 8));
				    if (i_1346_ == 0 && anInt9007 != 255) {
					i_1346_ = i_1350_;
					i_1350_ = is[i_1319_];
					i_1350_ = (((((i_1346_ & 0xff00ff)
						      * anInt9007)
						     + ((i_1350_ & 0xff00ff)
							* anInt9028))
						    & ~0xff00ff)
						   + ((((i_1346_ & 0xff00)
							* anInt9007)
						       + ((i_1350_ & 0xff00)
							  * anInt9028))
						      & 0xff0000)) >> 8;
				    }
				    is[i_1319_] = i_1350_;
				} else if (i == 2) {
				    int i_1351_ = aByteArray11422[i_1318_];
				    if (i_1351_ != 0) {
					int i_1352_
					    = anIntArray11423[i_1351_ & 0xff];
					int i_1353_
					    = ((i_1352_ & 0xff00ff) * anInt9007
					       & ~0xff00ff);
					int i_1354_
					    = ((i_1352_ & 0xff00) * anInt9007
					       & 0xff0000);
					is[i_1319_++] = ((i_1353_ | i_1354_)
							 >>> 8) + anInt9034;
				    }
				} else
				    throw new IllegalArgumentException();
			    } else if (i_896_ == 2) {
				if (i == 1) {
				    int i_1355_ = aByteArray11422[i_1318_];
				    if (i_1355_ != 0) {
					int i_1356_
					    = anIntArray11423[i_1355_ & 0xff];
					int i_1357_ = is[i_1319_];
					int i_1358_ = i_1356_ + i_1357_;
					int i_1359_ = ((i_1356_ & 0xff00ff)
						       + (i_1357_ & 0xff00ff));
					i_1357_ = ((i_1359_ & 0x1000100)
						   + (i_1358_ - i_1359_
						      & 0x10000));
					is[i_1319_]
					    = (i_1358_ - i_1357_
					       | i_1357_ - (i_1357_ >>> 8));
				    }
				} else if (i == 0) {
				    int i_1360_ = aByteArray11422[i_1318_];
				    if (i_1360_ != 0) {
					int i_1361_
					    = anIntArray11423[i_1360_ & 0xff];
					int i_1362_
					    = ((i_1361_ & 0xff0000) * anInt9031
					       & ~0xffffff);
					int i_1363_
					    = ((i_1361_ & 0xff00) * anInt9030
					       & 0xff0000);
					int i_1364_
					    = ((i_1361_ & 0xff) * anInt9027
					       & 0xff00);
					i_1361_ = (i_1362_ | i_1363_
						   | i_1364_) >>> 8;
					int i_1365_ = is[i_1319_];
					int i_1366_ = i_1361_ + i_1365_;
					int i_1367_ = ((i_1361_ & 0xff00ff)
						       + (i_1365_ & 0xff00ff));
					i_1365_ = ((i_1367_ & 0x1000100)
						   + (i_1366_ - i_1367_
						      & 0x10000));
					is[i_1319_]
					    = (i_1366_ - i_1365_
					       | i_1365_ - (i_1365_ >>> 8));
				    }
				} else if (i == 3) {
				    byte i_1368_ = aByteArray11422[i_1318_];
				    int i_1369_
					= (i_1368_ > 0
					   ? anIntArray11423[i_1368_] : 0);
				    int i_1370_ = anInt9026;
				    int i_1371_ = i_1369_ + i_1370_;
				    int i_1372_ = ((i_1369_ & 0xff00ff)
						   + (i_1370_ & 0xff00ff));
				    int i_1373_
					= ((i_1372_ & 0x1000100)
					   + (i_1371_ - i_1372_ & 0x10000));
				    i_1373_ = (i_1371_ - i_1373_
					       | i_1373_ - (i_1373_ >>> 8));
				    if (i_1369_ == 0 && anInt9007 != 255) {
					i_1369_ = i_1373_;
					i_1373_ = is[i_1319_];
					i_1373_ = (((((i_1369_ & 0xff00ff)
						      * anInt9007)
						     + ((i_1373_ & 0xff00ff)
							* anInt9028))
						    & ~0xff00ff)
						   + ((((i_1369_ & 0xff00)
							* anInt9007)
						       + ((i_1373_ & 0xff00)
							  * anInt9028))
						      & 0xff0000)) >> 8;
				    }
				    is[i_1319_] = i_1373_;
				} else if (i == 2) {
				    int i_1374_ = aByteArray11422[i_1318_];
				    if (i_1374_ != 0) {
					int i_1375_
					    = anIntArray11423[i_1374_ & 0xff];
					int i_1376_
					    = ((i_1375_ & 0xff00ff) * anInt9007
					       & ~0xff00ff);
					int i_1377_
					    = ((i_1375_ & 0xff00) * anInt9007
					       & 0xff0000);
					i_1375_ = (((i_1376_ | i_1377_) >>> 8)
						   + anInt9034);
					int i_1378_ = is[i_1319_];
					int i_1379_ = i_1375_ + i_1378_;
					int i_1380_ = ((i_1375_ & 0xff00ff)
						       + (i_1378_ & 0xff00ff));
					i_1378_ = ((i_1380_ & 0x1000100)
						   + (i_1379_ - i_1380_
						      & 0x10000));
					is[i_1319_]
					    = (i_1379_ - i_1378_
					       | i_1378_ - (i_1378_ >>> 8));
				    }
				}
			    } else
				throw new IllegalArgumentException();
			    i_1313_ += anInt9006;
			}
		    }
		    i_1311_++;
		    anInt9022 += anInt9018;
		    anInt8999 += anInt9010;
		    anInt9015 += anInt9014;
		}
	    } else if (anInt9017 < 0) {
		for (int i_1381_ = anInt9023; i_1381_ < 0; i_1381_++) {
		    int i_1382_ = anInt9015;
		    int i_1383_ = anInt9022 + anInt9024;
		    int i_1384_ = anInt8999 + anInt9025;
		    int i_1385_ = anInt9011;
		    if (i_1383_ < 0) {
			int i_1386_ = (anInt9006 - 1 - i_1383_) / anInt9006;
			i_1385_ += i_1386_;
			i_1383_ += anInt9006 * i_1386_;
			i_1384_ += anInt9017 * i_1386_;
			i_1382_ += i_1386_;
		    }
		    int i_1387_;
		    if ((i_1387_ = (1 + i_1383_ - (anInt9000 << 12)
				    - anInt9006) / anInt9006)
			> i_1385_)
			i_1385_ = i_1387_;
		    if ((i_1387_ = i_1384_ - (anInt9001 << 12)) >= 0) {
			i_1387_ = (anInt9017 - i_1387_) / anInt9017;
			i_1385_ += i_1387_;
			i_1383_ += anInt9006 * i_1387_;
			i_1384_ += anInt9017 * i_1387_;
			i_1382_ += i_1387_;
		    }
		    if ((i_1387_ = (i_1384_ - anInt9017) / anInt9017)
			> i_1385_)
			i_1385_ = i_1387_;
		    for (/**/; i_1385_ < 0; i_1385_++) {
			int i_1388_
			    = (i_1384_ >> 12) * anInt9000 + (i_1383_ >> 12);
			int i_1389_ = i_1382_++;
			if (i_896_ == 0) {
			    if (i == 1)
				is[i_1389_]
				    = (anIntArray11423
				       [aByteArray11422[i_1388_] & 0xff]);
			    else if (i == 0) {
				int i_1390_
				    = (anIntArray11423
				       [aByteArray11422[i_1388_] & 0xff]);
				int i_1391_ = ((i_1390_ & 0xff0000) * anInt9031
					       & ~0xffffff);
				int i_1392_ = ((i_1390_ & 0xff00) * anInt9030
					       & 0xff0000);
				int i_1393_
				    = (i_1390_ & 0xff) * anInt9027 & 0xff00;
				is[i_1389_]
				    = (i_1391_ | i_1392_ | i_1393_) >>> 8;
			    } else if (i == 3) {
				int i_1394_
				    = (anIntArray11423
				       [aByteArray11422[i_1388_] & 0xff]);
				int i_1395_ = anInt9026;
				int i_1396_ = i_1394_ + i_1395_;
				int i_1397_ = ((i_1394_ & 0xff00ff)
					       + (i_1395_ & 0xff00ff));
				int i_1398_
				    = ((i_1397_ & 0x1000100)
				       + (i_1396_ - i_1397_ & 0x10000));
				is[i_1389_]
				    = i_1396_ - i_1398_ | i_1398_ - (i_1398_
								     >>> 8);
			    } else if (i == 2) {
				int i_1399_
				    = (anIntArray11423
				       [aByteArray11422[i_1388_] & 0xff]);
				int i_1400_ = ((i_1399_ & 0xff00ff) * anInt9007
					       & ~0xff00ff);
				int i_1401_ = ((i_1399_ & 0xff00) * anInt9007
					       & 0xff0000);
				is[i_1389_]
				    = ((i_1400_ | i_1401_) >>> 8) + anInt9034;
			    } else
				throw new IllegalArgumentException();
			} else if (i_896_ == 1) {
			    if (i == 1) {
				int i_1402_ = aByteArray11422[i_1388_];
				if (i_1402_ != 0)
				    is[i_1389_]
					= anIntArray11423[i_1402_ & 0xff];
			    } else if (i == 0) {
				int i_1403_ = aByteArray11422[i_1388_];
				if (i_1403_ != 0) {
				    int i_1404_
					= anIntArray11423[i_1403_ & 0xff];
				    if ((anInt9026 & 0xffffff) == 16777215) {
					int i_1405_ = anInt9026 >>> 24;
					int i_1406_ = 256 - i_1405_;
					int i_1407_ = is[i_1389_];
					is[i_1389_]
					    = ((((i_1404_ & 0xff00ff) * i_1405_
						 + ((i_1407_ & 0xff00ff)
						    * i_1406_))
						& ~0xff00ff)
					       + (((i_1404_ & 0xff00) * i_1405_
						   + ((i_1407_ & 0xff00)
						      * i_1406_))
						  & 0xff0000)) >> 8;
				    } else if (anInt9007 != 255) {
					int i_1408_
					    = ((i_1404_ & 0xff0000) * anInt9031
					       & ~0xffffff);
					int i_1409_
					    = ((i_1404_ & 0xff00) * anInt9030
					       & 0xff0000);
					int i_1410_
					    = ((i_1404_ & 0xff) * anInt9027
					       & 0xff00);
					i_1404_ = (i_1408_ | i_1409_
						   | i_1410_) >>> 8;
					int i_1411_ = is[i_1389_];
					is[i_1389_]
					    = (((((i_1404_ & 0xff00ff)
						  * anInt9007)
						 + ((i_1411_ & 0xff00ff)
						    * anInt9028))
						& ~0xff00ff)
					       + ((((i_1404_ & 0xff00)
						    * anInt9007)
						   + ((i_1411_ & 0xff00)
						      * anInt9028))
						  & 0xff0000)) >> 8;
				    } else {
					int i_1412_
					    = ((i_1404_ & 0xff0000) * anInt9031
					       & ~0xffffff);
					int i_1413_
					    = ((i_1404_ & 0xff00) * anInt9030
					       & 0xff0000);
					int i_1414_
					    = ((i_1404_ & 0xff) * anInt9027
					       & 0xff00);
					is[i_1389_] = (i_1412_ | i_1413_
						       | i_1414_) >>> 8;
				    }
				}
			    } else if (i == 3) {
				byte i_1415_ = aByteArray11422[i_1388_];
				int i_1416_ = (i_1415_ > 0
					       ? anIntArray11423[i_1415_] : 0);
				int i_1417_ = anInt9026;
				int i_1418_ = i_1416_ + i_1417_;
				int i_1419_ = ((i_1416_ & 0xff00ff)
					       + (i_1417_ & 0xff00ff));
				int i_1420_
				    = ((i_1419_ & 0x1000100)
				       + (i_1418_ - i_1419_ & 0x10000));
				i_1420_
				    = i_1418_ - i_1420_ | i_1420_ - (i_1420_
								     >>> 8);
				if (i_1416_ == 0 && anInt9007 != 255) {
				    i_1416_ = i_1420_;
				    i_1420_ = is[i_1389_];
				    i_1420_
					= ((((i_1416_ & 0xff00ff) * anInt9007
					     + ((i_1420_ & 0xff00ff)
						* anInt9028))
					    & ~0xff00ff)
					   + (((i_1416_ & 0xff00) * anInt9007
					       + ((i_1420_ & 0xff00)
						  * anInt9028))
					      & 0xff0000)) >> 8;
				}
				is[i_1389_] = i_1420_;
			    } else if (i == 2) {
				int i_1421_ = aByteArray11422[i_1388_];
				if (i_1421_ != 0) {
				    int i_1422_
					= anIntArray11423[i_1421_ & 0xff];
				    int i_1423_
					= ((i_1422_ & 0xff00ff) * anInt9007
					   & ~0xff00ff);
				    int i_1424_
					= ((i_1422_ & 0xff00) * anInt9007
					   & 0xff0000);
				    is[i_1389_++] = ((i_1423_ | i_1424_)
						     >>> 8) + anInt9034;
				}
			    } else
				throw new IllegalArgumentException();
			} else if (i_896_ == 2) {
			    if (i == 1) {
				int i_1425_ = aByteArray11422[i_1388_];
				if (i_1425_ != 0) {
				    int i_1426_
					= anIntArray11423[i_1425_ & 0xff];
				    int i_1427_ = is[i_1389_];
				    int i_1428_ = i_1426_ + i_1427_;
				    int i_1429_ = ((i_1426_ & 0xff00ff)
						   + (i_1427_ & 0xff00ff));
				    i_1427_
					= ((i_1429_ & 0x1000100)
					   + (i_1428_ - i_1429_ & 0x10000));
				    is[i_1389_]
					= (i_1428_ - i_1427_
					   | i_1427_ - (i_1427_ >>> 8));
				}
			    } else if (i == 0) {
				int i_1430_ = aByteArray11422[i_1388_];
				if (i_1430_ != 0) {
				    int i_1431_
					= anIntArray11423[i_1430_ & 0xff];
				    int i_1432_
					= ((i_1431_ & 0xff0000) * anInt9031
					   & ~0xffffff);
				    int i_1433_
					= ((i_1431_ & 0xff00) * anInt9030
					   & 0xff0000);
				    int i_1434_ = ((i_1431_ & 0xff) * anInt9027
						   & 0xff00);
				    i_1431_
					= (i_1432_ | i_1433_ | i_1434_) >>> 8;
				    int i_1435_ = is[i_1389_];
				    int i_1436_ = i_1431_ + i_1435_;
				    int i_1437_ = ((i_1431_ & 0xff00ff)
						   + (i_1435_ & 0xff00ff));
				    i_1435_
					= ((i_1437_ & 0x1000100)
					   + (i_1436_ - i_1437_ & 0x10000));
				    is[i_1389_]
					= (i_1436_ - i_1435_
					   | i_1435_ - (i_1435_ >>> 8));
				}
			    } else if (i == 3) {
				byte i_1438_ = aByteArray11422[i_1388_];
				int i_1439_ = (i_1438_ > 0
					       ? anIntArray11423[i_1438_] : 0);
				int i_1440_ = anInt9026;
				int i_1441_ = i_1439_ + i_1440_;
				int i_1442_ = ((i_1439_ & 0xff00ff)
					       + (i_1440_ & 0xff00ff));
				int i_1443_
				    = ((i_1442_ & 0x1000100)
				       + (i_1441_ - i_1442_ & 0x10000));
				i_1443_
				    = i_1441_ - i_1443_ | i_1443_ - (i_1443_
								     >>> 8);
				if (i_1439_ == 0 && anInt9007 != 255) {
				    i_1439_ = i_1443_;
				    i_1443_ = is[i_1389_];
				    i_1443_
					= ((((i_1439_ & 0xff00ff) * anInt9007
					     + ((i_1443_ & 0xff00ff)
						* anInt9028))
					    & ~0xff00ff)
					   + (((i_1439_ & 0xff00) * anInt9007
					       + ((i_1443_ & 0xff00)
						  * anInt9028))
					      & 0xff0000)) >> 8;
				}
				is[i_1389_] = i_1443_;
			    } else if (i == 2) {
				int i_1444_ = aByteArray11422[i_1388_];
				if (i_1444_ != 0) {
				    int i_1445_
					= anIntArray11423[i_1444_ & 0xff];
				    int i_1446_
					= ((i_1445_ & 0xff00ff) * anInt9007
					   & ~0xff00ff);
				    int i_1447_
					= ((i_1445_ & 0xff00) * anInt9007
					   & 0xff0000);
				    i_1445_ = (((i_1446_ | i_1447_) >>> 8)
					       + anInt9034);
				    int i_1448_ = is[i_1389_];
				    int i_1449_ = i_1445_ + i_1448_;
				    int i_1450_ = ((i_1445_ & 0xff00ff)
						   + (i_1448_ & 0xff00ff));
				    i_1448_
					= ((i_1450_ & 0x1000100)
					   + (i_1449_ - i_1450_ & 0x10000));
				    is[i_1389_]
					= (i_1449_ - i_1448_
					   | i_1448_ - (i_1448_ >>> 8));
				}
			    }
			} else
			    throw new IllegalArgumentException();
			i_1383_ += anInt9006;
			i_1384_ += anInt9017;
		    }
		    anInt9022 += anInt9018;
		    anInt8999 += anInt9010;
		    anInt9015 += anInt9014;
		}
	    } else {
		for (int i_1451_ = anInt9023; i_1451_ < 0; i_1451_++) {
		    int i_1452_ = anInt9015;
		    int i_1453_ = anInt9022 + anInt9024;
		    int i_1454_ = anInt8999 + anInt9025;
		    int i_1455_ = anInt9011;
		    if (i_1453_ < 0) {
			int i_1456_ = (anInt9006 - 1 - i_1453_) / anInt9006;
			i_1455_ += i_1456_;
			i_1453_ += anInt9006 * i_1456_;
			i_1454_ += anInt9017 * i_1456_;
			i_1452_ += i_1456_;
		    }
		    int i_1457_;
		    if ((i_1457_ = (1 + i_1453_ - (anInt9000 << 12)
				    - anInt9006) / anInt9006)
			> i_1455_)
			i_1455_ = i_1457_;
		    if (i_1454_ < 0) {
			i_1457_ = (anInt9017 - 1 - i_1454_) / anInt9017;
			i_1455_ += i_1457_;
			i_1453_ += anInt9006 * i_1457_;
			i_1454_ += anInt9017 * i_1457_;
			i_1452_ += i_1457_;
		    }
		    if ((i_1457_ = (1 + i_1454_ - (anInt9001 << 12)
				    - anInt9017) / anInt9017)
			> i_1455_)
			i_1455_ = i_1457_;
		    for (/**/; i_1455_ < 0; i_1455_++) {
			int i_1458_
			    = (i_1454_ >> 12) * anInt9000 + (i_1453_ >> 12);
			int i_1459_ = i_1452_++;
			if (i_896_ == 0) {
			    if (i == 1)
				is[i_1459_]
				    = (anIntArray11423
				       [aByteArray11422[i_1458_] & 0xff]);
			    else if (i == 0) {
				int i_1460_
				    = (anIntArray11423
				       [aByteArray11422[i_1458_] & 0xff]);
				int i_1461_ = ((i_1460_ & 0xff0000) * anInt9031
					       & ~0xffffff);
				int i_1462_ = ((i_1460_ & 0xff00) * anInt9030
					       & 0xff0000);
				int i_1463_
				    = (i_1460_ & 0xff) * anInt9027 & 0xff00;
				is[i_1459_]
				    = (i_1461_ | i_1462_ | i_1463_) >>> 8;
			    } else if (i == 3) {
				int i_1464_
				    = (anIntArray11423
				       [aByteArray11422[i_1458_] & 0xff]);
				int i_1465_ = anInt9026;
				int i_1466_ = i_1464_ + i_1465_;
				int i_1467_ = ((i_1464_ & 0xff00ff)
					       + (i_1465_ & 0xff00ff));
				int i_1468_
				    = ((i_1467_ & 0x1000100)
				       + (i_1466_ - i_1467_ & 0x10000));
				is[i_1459_]
				    = i_1466_ - i_1468_ | i_1468_ - (i_1468_
								     >>> 8);
			    } else if (i == 2) {
				int i_1469_
				    = (anIntArray11423
				       [aByteArray11422[i_1458_] & 0xff]);
				int i_1470_ = ((i_1469_ & 0xff00ff) * anInt9007
					       & ~0xff00ff);
				int i_1471_ = ((i_1469_ & 0xff00) * anInt9007
					       & 0xff0000);
				is[i_1459_]
				    = ((i_1470_ | i_1471_) >>> 8) + anInt9034;
			    } else
				throw new IllegalArgumentException();
			} else if (i_896_ == 1) {
			    if (i == 1) {
				int i_1472_ = aByteArray11422[i_1458_];
				if (i_1472_ != 0)
				    is[i_1459_]
					= anIntArray11423[i_1472_ & 0xff];
			    } else if (i == 0) {
				int i_1473_ = aByteArray11422[i_1458_];
				if (i_1473_ != 0) {
				    int i_1474_
					= anIntArray11423[i_1473_ & 0xff];
				    if ((anInt9026 & 0xffffff) == 16777215) {
					int i_1475_ = anInt9026 >>> 24;
					int i_1476_ = 256 - i_1475_;
					int i_1477_ = is[i_1459_];
					is[i_1459_]
					    = ((((i_1474_ & 0xff00ff) * i_1475_
						 + ((i_1477_ & 0xff00ff)
						    * i_1476_))
						& ~0xff00ff)
					       + (((i_1474_ & 0xff00) * i_1475_
						   + ((i_1477_ & 0xff00)
						      * i_1476_))
						  & 0xff0000)) >> 8;
				    } else if (anInt9007 != 255) {
					int i_1478_
					    = ((i_1474_ & 0xff0000) * anInt9031
					       & ~0xffffff);
					int i_1479_
					    = ((i_1474_ & 0xff00) * anInt9030
					       & 0xff0000);
					int i_1480_
					    = ((i_1474_ & 0xff) * anInt9027
					       & 0xff00);
					i_1474_ = (i_1478_ | i_1479_
						   | i_1480_) >>> 8;
					int i_1481_ = is[i_1459_];
					is[i_1459_]
					    = (((((i_1474_ & 0xff00ff)
						  * anInt9007)
						 + ((i_1481_ & 0xff00ff)
						    * anInt9028))
						& ~0xff00ff)
					       + ((((i_1474_ & 0xff00)
						    * anInt9007)
						   + ((i_1481_ & 0xff00)
						      * anInt9028))
						  & 0xff0000)) >> 8;
				    } else {
					int i_1482_
					    = ((i_1474_ & 0xff0000) * anInt9031
					       & ~0xffffff);
					int i_1483_
					    = ((i_1474_ & 0xff00) * anInt9030
					       & 0xff0000);
					int i_1484_
					    = ((i_1474_ & 0xff) * anInt9027
					       & 0xff00);
					is[i_1459_] = (i_1482_ | i_1483_
						       | i_1484_) >>> 8;
				    }
				}
			    } else if (i == 3) {
				byte i_1485_ = aByteArray11422[i_1458_];
				int i_1486_ = (i_1485_ > 0
					       ? anIntArray11423[i_1485_] : 0);
				int i_1487_ = anInt9026;
				int i_1488_ = i_1486_ + i_1487_;
				int i_1489_ = ((i_1486_ & 0xff00ff)
					       + (i_1487_ & 0xff00ff));
				int i_1490_
				    = ((i_1489_ & 0x1000100)
				       + (i_1488_ - i_1489_ & 0x10000));
				i_1490_
				    = i_1488_ - i_1490_ | i_1490_ - (i_1490_
								     >>> 8);
				if (i_1486_ == 0 && anInt9007 != 255) {
				    i_1486_ = i_1490_;
				    i_1490_ = is[i_1459_];
				    i_1490_
					= ((((i_1486_ & 0xff00ff) * anInt9007
					     + ((i_1490_ & 0xff00ff)
						* anInt9028))
					    & ~0xff00ff)
					   + (((i_1486_ & 0xff00) * anInt9007
					       + ((i_1490_ & 0xff00)
						  * anInt9028))
					      & 0xff0000)) >> 8;
				}
				is[i_1459_] = i_1490_;
			    } else if (i == 2) {
				int i_1491_ = aByteArray11422[i_1458_];
				if (i_1491_ != 0) {
				    int i_1492_
					= anIntArray11423[i_1491_ & 0xff];
				    int i_1493_
					= ((i_1492_ & 0xff00ff) * anInt9007
					   & ~0xff00ff);
				    int i_1494_
					= ((i_1492_ & 0xff00) * anInt9007
					   & 0xff0000);
				    is[i_1459_++] = ((i_1493_ | i_1494_)
						     >>> 8) + anInt9034;
				}
			    } else
				throw new IllegalArgumentException();
			} else if (i_896_ == 2) {
			    if (i == 1) {
				int i_1495_ = aByteArray11422[i_1458_];
				if (i_1495_ != 0) {
				    int i_1496_
					= anIntArray11423[i_1495_ & 0xff];
				    int i_1497_ = is[i_1459_];
				    int i_1498_ = i_1496_ + i_1497_;
				    int i_1499_ = ((i_1496_ & 0xff00ff)
						   + (i_1497_ & 0xff00ff));
				    i_1497_
					= ((i_1499_ & 0x1000100)
					   + (i_1498_ - i_1499_ & 0x10000));
				    is[i_1459_]
					= (i_1498_ - i_1497_
					   | i_1497_ - (i_1497_ >>> 8));
				}
			    } else if (i == 0) {
				int i_1500_ = aByteArray11422[i_1458_];
				if (i_1500_ != 0) {
				    int i_1501_
					= anIntArray11423[i_1500_ & 0xff];
				    int i_1502_
					= ((i_1501_ & 0xff0000) * anInt9031
					   & ~0xffffff);
				    int i_1503_
					= ((i_1501_ & 0xff00) * anInt9030
					   & 0xff0000);
				    int i_1504_ = ((i_1501_ & 0xff) * anInt9027
						   & 0xff00);
				    i_1501_
					= (i_1502_ | i_1503_ | i_1504_) >>> 8;
				    int i_1505_ = is[i_1459_];
				    int i_1506_ = i_1501_ + i_1505_;
				    int i_1507_ = ((i_1501_ & 0xff00ff)
						   + (i_1505_ & 0xff00ff));
				    i_1505_
					= ((i_1507_ & 0x1000100)
					   + (i_1506_ - i_1507_ & 0x10000));
				    is[i_1459_]
					= (i_1506_ - i_1505_
					   | i_1505_ - (i_1505_ >>> 8));
				}
			    } else if (i == 3) {
				byte i_1508_ = aByteArray11422[i_1458_];
				int i_1509_ = (i_1508_ > 0
					       ? anIntArray11423[i_1508_] : 0);
				int i_1510_ = anInt9026;
				int i_1511_ = i_1509_ + i_1510_;
				int i_1512_ = ((i_1509_ & 0xff00ff)
					       + (i_1510_ & 0xff00ff));
				int i_1513_
				    = ((i_1512_ & 0x1000100)
				       + (i_1511_ - i_1512_ & 0x10000));
				i_1513_
				    = i_1511_ - i_1513_ | i_1513_ - (i_1513_
								     >>> 8);
				if (i_1509_ == 0 && anInt9007 != 255) {
				    i_1509_ = i_1513_;
				    i_1513_ = is[i_1459_];
				    i_1513_
					= ((((i_1509_ & 0xff00ff) * anInt9007
					     + ((i_1513_ & 0xff00ff)
						* anInt9028))
					    & ~0xff00ff)
					   + (((i_1509_ & 0xff00) * anInt9007
					       + ((i_1513_ & 0xff00)
						  * anInt9028))
					      & 0xff0000)) >> 8;
				}
				is[i_1459_] = i_1513_;
			    } else if (i == 2) {
				int i_1514_ = aByteArray11422[i_1458_];
				if (i_1514_ != 0) {
				    int i_1515_
					= anIntArray11423[i_1514_ & 0xff];
				    int i_1516_
					= ((i_1515_ & 0xff00ff) * anInt9007
					   & ~0xff00ff);
				    int i_1517_
					= ((i_1515_ & 0xff00) * anInt9007
					   & 0xff0000);
				    i_1515_ = (((i_1516_ | i_1517_) >>> 8)
					       + anInt9034);
				    int i_1518_ = is[i_1459_];
				    int i_1519_ = i_1515_ + i_1518_;
				    int i_1520_ = ((i_1515_ & 0xff00ff)
						   + (i_1518_ & 0xff00ff));
				    i_1518_
					= ((i_1520_ & 0x1000100)
					   + (i_1519_ - i_1520_ & 0x10000));
				    is[i_1459_]
					= (i_1519_ - i_1518_
					   | i_1518_ - (i_1518_ >>> 8));
				}
			    }
			} else
			    throw new IllegalArgumentException();
			i_1453_ += anInt9006;
			i_1454_ += anInt9017;
		    }
		    anInt9022 += anInt9018;
		    anInt8999 += anInt9010;
		    anInt9015 += anInt9014;
		}
	    }
	}
    }
    
    void method14541(boolean bool, boolean bool_1521_, boolean bool_1522_,
		     int i, int i_1523_, float f, int i_1524_, int i_1525_,
		     int i_1526_, int i_1527_, int i_1528_, int i_1529_,
		     boolean bool_1530_) {
	if (i_1524_ > 0 && i_1525_ > 0 && (bool || bool_1521_)) {
	    int i_1531_ = 0;
	    int i_1532_ = 0;
	    int i_1533_ = anInt9002 + anInt9000 + anInt9004;
	    int i_1534_ = anInt9003 + anInt9001 + anInt9005;
	    int i_1535_ = (i_1533_ << 16) / i_1524_;
	    int i_1536_ = (i_1534_ << 16) / i_1525_;
	    if (anInt9002 > 0) {
		int i_1537_ = ((anInt9002 << 16) + i_1535_ - 1) / i_1535_;
		i += i_1537_;
		i_1531_ += i_1537_ * i_1535_ - (anInt9002 << 16);
	    }
	    if (anInt9003 > 0) {
		int i_1538_ = ((anInt9003 << 16) + i_1536_ - 1) / i_1536_;
		i_1523_ += i_1538_;
		i_1532_ += i_1538_ * i_1536_ - (anInt9003 << 16);
	    }
	    if (anInt9000 < i_1533_)
		i_1524_
		    = ((anInt9000 << 16) - i_1531_ + i_1535_ - 1) / i_1535_;
	    if (anInt9001 < i_1534_)
		i_1525_
		    = ((anInt9001 << 16) - i_1532_ + i_1536_ - 1) / i_1536_;
	    int i_1539_
		= i + i_1523_ * (aClass182_Sub2_9033.anInt9494 * -476035351);
	    int i_1540_ = aClass182_Sub2_9033.anInt9494 * -476035351 - i_1524_;
	    if (i_1523_ + i_1525_ > aClass182_Sub2_9033.anInt9473 * 1920901985)
		i_1525_ -= (i_1523_ + i_1525_
			    - aClass182_Sub2_9033.anInt9473 * 1920901985);
	    if (i_1523_ < aClass182_Sub2_9033.anInt9472 * 1722112305) {
		int i_1541_
		    = aClass182_Sub2_9033.anInt9472 * 1722112305 - i_1523_;
		i_1525_ -= i_1541_;
		i_1539_
		    += i_1541_ * (aClass182_Sub2_9033.anInt9494 * -476035351);
		i_1532_ += i_1536_ * i_1541_;
	    }
	    if (i + i_1524_ > aClass182_Sub2_9033.anInt9499 * -466178451) {
		int i_1542_
		    = i + i_1524_ - aClass182_Sub2_9033.anInt9499 * -466178451;
		i_1524_ -= i_1542_;
		i_1540_ += i_1542_;
	    }
	    if (i < aClass182_Sub2_9033.anInt9470 * 1988019027) {
		int i_1543_ = aClass182_Sub2_9033.anInt9470 * 1988019027 - i;
		i_1524_ -= i_1543_;
		i_1539_ += i_1543_;
		i_1531_ += i_1535_ * i_1543_;
		i_1540_ += i_1543_;
	    }
	    float[] fs = aClass182_Sub2_9033.aFloatArray9469;
	    int[] is = aClass182_Sub2_9033.anIntArray9466;
	    if (i_1528_ == 0) {
		if (i_1526_ == 1) {
		    int i_1544_ = i_1531_;
		    for (int i_1545_ = -i_1525_; i_1545_ < 0; i_1545_++) {
			int i_1546_ = (i_1532_ >> 16) * anInt9000;
			for (int i_1547_ = -i_1524_; i_1547_ < 0; i_1547_++) {
			    if (!bool_1521_ || f < fs[i_1539_]) {
				if (bool)
				    is[i_1539_]
					= (anIntArray11423
					   [((aByteArray11422
					      [(i_1531_ >> 16) + i_1546_])
					     & 0xff)]);
				if (bool_1521_ && bool_1530_)
				    fs[i_1539_] = f;
			    }
			    i_1531_ += i_1535_;
			    i_1539_++;
			}
			i_1532_ += i_1536_;
			i_1531_ = i_1544_;
			i_1539_ += i_1540_;
		    }
		} else if (i_1526_ == 0) {
		    int i_1548_ = (i_1527_ & 0xff0000) >> 16;
		    int i_1549_ = (i_1527_ & 0xff00) >> 8;
		    int i_1550_ = i_1527_ & 0xff;
		    int i_1551_ = i_1531_;
		    for (int i_1552_ = -i_1525_; i_1552_ < 0; i_1552_++) {
			int i_1553_ = (i_1532_ >> 16) * anInt9000;
			for (int i_1554_ = -i_1524_; i_1554_ < 0; i_1554_++) {
			    if (!bool_1521_ || f < fs[i_1539_]) {
				if (bool) {
				    int i_1555_
					= (anIntArray11423
					   [((aByteArray11422
					      [(i_1531_ >> 16) + i_1553_])
					     & 0xff)]);
				    int i_1556_
					= ((i_1555_ & 0xff0000) * i_1548_
					   & ~0xffffff);
				    int i_1557_ = ((i_1555_ & 0xff00) * i_1549_
						   & 0xff0000);
				    int i_1558_
					= (i_1555_ & 0xff) * i_1550_ & 0xff00;
				    is[i_1539_]
					= (i_1556_ | i_1557_ | i_1558_) >>> 8;
				}
				if (bool_1521_ && bool_1530_)
				    fs[i_1539_] = f;
			    }
			    i_1531_ += i_1535_;
			    i_1539_++;
			}
			i_1532_ += i_1536_;
			i_1531_ = i_1551_;
			i_1539_ += i_1540_;
		    }
		} else if (i_1526_ == 3) {
		    int i_1559_ = i_1531_;
		    for (int i_1560_ = -i_1525_; i_1560_ < 0; i_1560_++) {
			int i_1561_ = (i_1532_ >> 16) * anInt9000;
			for (int i_1562_ = -i_1524_; i_1562_ < 0; i_1562_++) {
			    if (!bool_1521_ || f < fs[i_1539_]) {
				if (bool) {
				    byte i_1563_
					= (aByteArray11422
					   [(i_1531_ >> 16) + i_1561_]);
				    int i_1564_
					= (i_1563_ > 0
					   ? anIntArray11423[i_1563_] : 0);
				    int i_1565_ = i_1564_ + i_1527_;
				    int i_1566_ = ((i_1564_ & 0xff00ff)
						   + (i_1527_ & 0xff00ff));
				    int i_1567_
					= ((i_1566_ & 0x1000100)
					   + (i_1565_ - i_1566_ & 0x10000));
				    is[i_1539_]
					= (i_1565_ - i_1567_
					   | i_1567_ - (i_1567_ >>> 8));
				}
				if (bool_1521_ && bool_1530_)
				    fs[i_1539_] = f;
			    }
			    i_1531_ += i_1535_;
			    i_1539_++;
			}
			i_1532_ += i_1536_;
			i_1531_ = i_1559_;
			i_1539_ += i_1540_;
		    }
		} else if (i_1526_ == 2) {
		    int i_1568_ = i_1527_ >>> 24;
		    int i_1569_ = 256 - i_1568_;
		    int i_1570_ = (i_1527_ & 0xff00ff) * i_1569_ & ~0xff00ff;
		    int i_1571_ = (i_1527_ & 0xff00) * i_1569_ & 0xff0000;
		    i_1527_ = (i_1570_ | i_1571_) >>> 8;
		    int i_1572_ = i_1531_;
		    for (int i_1573_ = -i_1525_; i_1573_ < 0; i_1573_++) {
			int i_1574_ = (i_1532_ >> 16) * anInt9000;
			for (int i_1575_ = -i_1524_; i_1575_ < 0; i_1575_++) {
			    if (!bool_1521_ || f < fs[i_1539_]) {
				if (bool) {
				    int i_1576_
					= (anIntArray11423
					   [((aByteArray11422
					      [(i_1531_ >> 16) + i_1574_])
					     & 0xff)]);
				    i_1570_ = ((i_1576_ & 0xff00ff) * i_1568_
					       & ~0xff00ff);
				    i_1571_ = ((i_1576_ & 0xff00) * i_1568_
					       & 0xff0000);
				    is[i_1539_] = (((i_1570_ | i_1571_) >>> 8)
						   + i_1527_);
				}
				if (bool_1521_ && bool_1530_)
				    fs[i_1539_] = f;
			    }
			    i_1531_ += i_1535_;
			    i_1539_++;
			}
			i_1532_ += i_1536_;
			i_1531_ = i_1572_;
			i_1539_ += i_1540_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_1528_ == 1) {
		if (i_1526_ == 1) {
		    int i_1577_ = i_1531_;
		    for (int i_1578_ = -i_1525_; i_1578_ < 0; i_1578_++) {
			int i_1579_ = (i_1532_ >> 16) * anInt9000;
			for (int i_1580_ = -i_1524_; i_1580_ < 0; i_1580_++) {
			    if (!bool_1521_ || f < fs[i_1539_]) {
				int i_1581_ = (aByteArray11422
					       [(i_1531_ >> 16) + i_1579_]);
				if (i_1581_ != 0) {
				    if (bool)
					is[i_1539_]
					    = anIntArray11423[i_1581_ & 0xff];
				    if (bool_1521_ && bool_1530_)
					fs[i_1539_] = f;
				}
			    }
			    i_1531_ += i_1535_;
			    i_1539_++;
			}
			i_1532_ += i_1536_;
			i_1531_ = i_1577_;
			i_1539_ += i_1540_;
		    }
		} else if (i_1526_ == 0) {
		    int i_1582_ = i_1531_;
		    if ((i_1527_ & 0xffffff) == 16777215) {
			int i_1583_ = i_1527_ >>> 24;
			int i_1584_ = 256 - i_1583_;
			for (int i_1585_ = -i_1525_; i_1585_ < 0; i_1585_++) {
			    int i_1586_ = (i_1532_ >> 16) * anInt9000;
			    for (int i_1587_ = -i_1524_; i_1587_ < 0;
				 i_1587_++) {
				if (!bool_1521_ || f < fs[i_1539_]) {
				    int i_1588_
					= (aByteArray11422
					   [(i_1531_ >> 16) + i_1586_]);
				    if (i_1588_ != 0) {
					if (bool) {
					    int i_1589_ = (anIntArray11423
							   [i_1588_ & 0xff]);
					    int i_1590_ = is[i_1539_];
					    is[i_1539_]
						= (((((i_1589_ & 0xff00ff)
						      * i_1583_)
						     + ((i_1590_ & 0xff00ff)
							* i_1584_))
						    & ~0xff00ff)
						   + ((((i_1589_ & 0xff00)
							* i_1583_)
						       + ((i_1590_ & 0xff00)
							  * i_1584_))
						      & 0xff0000)) >> 8;
					}
					if (bool_1521_ && bool_1530_)
					    fs[i_1539_] = f;
				    }
				}
				i_1531_ += i_1535_;
				i_1539_++;
			    }
			    i_1532_ += i_1536_;
			    i_1531_ = i_1582_;
			    i_1539_ += i_1540_;
			}
		    } else {
			int i_1591_ = (i_1527_ & 0xff0000) >> 16;
			int i_1592_ = (i_1527_ & 0xff00) >> 8;
			int i_1593_ = i_1527_ & 0xff;
			int i_1594_ = i_1527_ >>> 24;
			int i_1595_ = 256 - i_1594_;
			for (int i_1596_ = -i_1525_; i_1596_ < 0; i_1596_++) {
			    int i_1597_ = (i_1532_ >> 16) * anInt9000;
			    for (int i_1598_ = -i_1524_; i_1598_ < 0;
				 i_1598_++) {
				if (!bool_1521_ || f < fs[i_1539_]) {
				    int i_1599_
					= (aByteArray11422
					   [(i_1531_ >> 16) + i_1597_]);
				    if (i_1599_ != 0) {
					int i_1600_
					    = anIntArray11423[i_1599_ & 0xff];
					if (i_1594_ != 255) {
					    if (bool) {
						int i_1601_
						    = (((i_1600_ & 0xff0000)
							* i_1591_)
						       & ~0xffffff);
						int i_1602_
						    = (((i_1600_ & 0xff00)
							* i_1592_)
						       & 0xff0000);
						int i_1603_
						    = (((i_1600_ & 0xff)
							* i_1593_)
						       & 0xff00);
						i_1600_ = (i_1601_ | i_1602_
							   | i_1603_) >>> 8;
						int i_1604_ = is[i_1539_];
						is[i_1539_]
						    = (((((i_1600_ & 0xff00ff)
							  * i_1594_)
							 + ((i_1604_
							     & 0xff00ff)
							    * i_1595_))
							& ~0xff00ff)
						       + ((((i_1600_ & 0xff00)
							    * i_1594_)
							   + ((i_1604_
							       & 0xff00)
							      * i_1595_))
							  & 0xff0000)) >> 8;
					    }
					    if (bool_1521_ && bool_1530_)
						fs[i_1539_] = f;
					} else {
					    if (bool) {
						int i_1605_
						    = (((i_1600_ & 0xff0000)
							* i_1591_)
						       & ~0xffffff);
						int i_1606_
						    = (((i_1600_ & 0xff00)
							* i_1592_)
						       & 0xff0000);
						int i_1607_
						    = (((i_1600_ & 0xff)
							* i_1593_)
						       & 0xff00);
						is[i_1539_]
						    = (i_1605_ | i_1606_
						       | i_1607_) >>> 8;
					    }
					    if (bool_1521_ && bool_1530_)
						fs[i_1539_] = f;
					}
				    }
				}
				i_1531_ += i_1535_;
				i_1539_++;
			    }
			    i_1532_ += i_1536_;
			    i_1531_ = i_1582_;
			    i_1539_ += i_1540_;
			}
		    }
		} else if (i_1526_ == 3) {
		    int i_1608_ = i_1531_;
		    int i_1609_ = i_1527_ >>> 24;
		    int i_1610_ = 256 - i_1609_;
		    for (int i_1611_ = -i_1525_; i_1611_ < 0; i_1611_++) {
			int i_1612_ = (i_1532_ >> 16) * anInt9000;
			for (int i_1613_ = -i_1524_; i_1613_ < 0; i_1613_++) {
			    if (!bool_1521_ || f < fs[i_1539_]) {
				if (bool) {
				    byte i_1614_
					= (aByteArray11422
					   [(i_1531_ >> 16) + i_1612_]);
				    int i_1615_
					= (i_1614_ > 0
					   ? anIntArray11423[i_1614_] : 0);
				    int i_1616_ = i_1615_ + i_1527_;
				    int i_1617_ = ((i_1615_ & 0xff00ff)
						   + (i_1527_ & 0xff00ff));
				    int i_1618_
					= ((i_1617_ & 0x1000100)
					   + (i_1616_ - i_1617_ & 0x10000));
				    i_1618_ = (i_1616_ - i_1618_
					       | i_1618_ - (i_1618_ >>> 8));
				    if (i_1615_ == 0 && i_1609_ != 255) {
					i_1615_ = i_1618_;
					i_1618_ = is[i_1539_];
					i_1618_
					    = ((((i_1615_ & 0xff00ff) * i_1609_
						 + ((i_1618_ & 0xff00ff)
						    * i_1610_))
						& ~0xff00ff)
					       + (((i_1615_ & 0xff00) * i_1609_
						   + ((i_1618_ & 0xff00)
						      * i_1610_))
						  & 0xff0000)) >> 8;
				    }
				    is[i_1539_] = i_1618_;
				}
				if (bool_1521_ && bool_1530_)
				    fs[i_1539_] = f;
			    }
			    i_1531_ += i_1535_;
			    i_1539_++;
			}
			i_1532_ += i_1536_;
			i_1531_ = i_1608_;
			i_1539_ += i_1540_;
		    }
		} else if (i_1526_ == 2) {
		    int i_1619_ = i_1527_ >>> 24;
		    int i_1620_ = 256 - i_1619_;
		    int i_1621_ = (i_1527_ & 0xff00ff) * i_1620_ & ~0xff00ff;
		    int i_1622_ = (i_1527_ & 0xff00) * i_1620_ & 0xff0000;
		    i_1527_ = (i_1621_ | i_1622_) >>> 8;
		    int i_1623_ = i_1531_;
		    for (int i_1624_ = -i_1525_; i_1624_ < 0; i_1624_++) {
			int i_1625_ = (i_1532_ >> 16) * anInt9000;
			for (int i_1626_ = -i_1524_; i_1626_ < 0; i_1626_++) {
			    if (!bool_1521_ || f < fs[i_1539_]) {
				int i_1627_ = (aByteArray11422
					       [(i_1531_ >> 16) + i_1625_]);
				if (i_1627_ != 0) {
				    if (bool) {
					int i_1628_
					    = anIntArray11423[i_1627_ & 0xff];
					i_1621_
					    = ((i_1628_ & 0xff00ff) * i_1619_
					       & ~0xff00ff);
					i_1622_ = ((i_1628_ & 0xff00) * i_1619_
						   & 0xff0000);
					is[i_1539_] = ((i_1621_ | i_1622_)
						       >>> 8) + i_1527_;
				    }
				    if (bool_1521_ && bool_1530_)
					fs[i_1539_] = f;
				}
			    }
			    i_1531_ += i_1535_;
			    i_1539_++;
			}
			i_1532_ += i_1536_;
			i_1531_ = i_1623_;
			i_1539_ += i_1540_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_1528_ == 2) {
		if (i_1526_ == 1) {
		    int i_1629_ = i_1531_;
		    for (int i_1630_ = -i_1525_; i_1630_ < 0; i_1630_++) {
			int i_1631_ = (i_1532_ >> 16) * anInt9000;
			for (int i_1632_ = -i_1524_; i_1632_ < 0; i_1632_++) {
			    if (!bool_1521_ || f < fs[i_1539_]) {
				int i_1633_ = (aByteArray11422
					       [(i_1531_ >> 16) + i_1631_]);
				if (i_1633_ != 0) {
				    if (bool) {
					int i_1634_
					    = anIntArray11423[i_1633_ & 0xff];
					int i_1635_ = is[i_1539_];
					int i_1636_ = i_1634_ + i_1635_;
					int i_1637_ = ((i_1634_ & 0xff00ff)
						       + (i_1635_ & 0xff00ff));
					i_1635_ = ((i_1637_ & 0x1000100)
						   + (i_1636_ - i_1637_
						      & 0x10000));
					is[i_1539_]
					    = (i_1636_ - i_1635_
					       | i_1635_ - (i_1635_ >>> 8));
				    }
				    if (bool_1521_ && bool_1530_)
					fs[i_1539_] = f;
				}
			    }
			    i_1531_ += i_1535_;
			    i_1539_++;
			}
			i_1532_ += i_1536_;
			i_1531_ = i_1629_;
			i_1539_ += i_1540_;
		    }
		} else if (i_1526_ == 0) {
		    int i_1638_ = i_1531_;
		    int i_1639_ = (i_1527_ & 0xff0000) >> 16;
		    int i_1640_ = (i_1527_ & 0xff00) >> 8;
		    int i_1641_ = i_1527_ & 0xff;
		    for (int i_1642_ = -i_1525_; i_1642_ < 0; i_1642_++) {
			int i_1643_ = (i_1532_ >> 16) * anInt9000;
			for (int i_1644_ = -i_1524_; i_1644_ < 0; i_1644_++) {
			    if (!bool_1521_ || f < fs[i_1539_]) {
				int i_1645_ = (aByteArray11422
					       [(i_1531_ >> 16) + i_1643_]);
				if (i_1645_ != 0) {
				    if (bool) {
					int i_1646_
					    = anIntArray11423[i_1645_ & 0xff];
					int i_1647_
					    = ((i_1646_ & 0xff0000) * i_1639_
					       & ~0xffffff);
					int i_1648_
					    = ((i_1646_ & 0xff00) * i_1640_
					       & 0xff0000);
					int i_1649_
					    = ((i_1646_ & 0xff) * i_1641_
					       & 0xff00);
					i_1646_ = (i_1647_ | i_1648_
						   | i_1649_) >>> 8;
					int i_1650_ = is[i_1539_];
					int i_1651_ = i_1646_ + i_1650_;
					int i_1652_ = ((i_1646_ & 0xff00ff)
						       + (i_1650_ & 0xff00ff));
					i_1650_ = ((i_1652_ & 0x1000100)
						   + (i_1651_ - i_1652_
						      & 0x10000));
					is[i_1539_]
					    = (i_1651_ - i_1650_
					       | i_1650_ - (i_1650_ >>> 8));
				    }
				    if (bool_1521_ && bool_1530_)
					fs[i_1539_] = f;
				}
			    }
			    i_1531_ += i_1535_;
			    i_1539_++;
			}
			i_1532_ += i_1536_;
			i_1531_ = i_1638_;
			i_1539_ += i_1540_;
		    }
		} else if (i_1526_ == 3) {
		    int i_1653_ = i_1531_;
		    for (int i_1654_ = -i_1525_; i_1654_ < 0; i_1654_++) {
			int i_1655_ = (i_1532_ >> 16) * anInt9000;
			for (int i_1656_ = -i_1524_; i_1656_ < 0; i_1656_++) {
			    if (!bool_1521_ || f < fs[i_1539_]) {
				if (bool) {
				    byte i_1657_
					= (aByteArray11422
					   [(i_1531_ >> 16) + i_1655_]);
				    int i_1658_
					= (i_1657_ > 0
					   ? anIntArray11423[i_1657_] : 0);
				    int i_1659_ = i_1658_ + i_1527_;
				    int i_1660_ = ((i_1658_ & 0xff00ff)
						   + (i_1527_ & 0xff00ff));
				    int i_1661_
					= ((i_1660_ & 0x1000100)
					   + (i_1659_ - i_1660_ & 0x10000));
				    i_1658_ = (i_1659_ - i_1661_
					       | i_1661_ - (i_1661_ >>> 8));
				    i_1661_ = is[i_1539_];
				    i_1659_ = i_1658_ + i_1661_;
				    i_1660_
					= (i_1658_ & 0xff00ff) + (i_1661_
								  & 0xff00ff);
				    i_1661_
					= ((i_1660_ & 0x1000100)
					   + (i_1659_ - i_1660_ & 0x10000));
				    is[i_1539_]
					= (i_1659_ - i_1661_
					   | i_1661_ - (i_1661_ >>> 8));
				}
				if (bool_1521_ && bool_1530_)
				    fs[i_1539_] = f;
			    }
			    i_1531_ += i_1535_;
			    i_1539_++;
			}
			i_1532_ += i_1536_;
			i_1531_ = i_1653_;
			i_1539_ += i_1540_;
		    }
		} else if (i_1526_ == 2) {
		    int i_1662_ = i_1527_ >>> 24;
		    int i_1663_ = 256 - i_1662_;
		    int i_1664_ = (i_1527_ & 0xff00ff) * i_1663_ & ~0xff00ff;
		    int i_1665_ = (i_1527_ & 0xff00) * i_1663_ & 0xff0000;
		    i_1527_ = (i_1664_ | i_1665_) >>> 8;
		    int i_1666_ = i_1531_;
		    for (int i_1667_ = -i_1525_; i_1667_ < 0; i_1667_++) {
			int i_1668_ = (i_1532_ >> 16) * anInt9000;
			for (int i_1669_ = -i_1524_; i_1669_ < 0; i_1669_++) {
			    if (!bool_1521_ || f < fs[i_1539_]) {
				int i_1670_ = (aByteArray11422
					       [(i_1531_ >> 16) + i_1668_]);
				if (i_1670_ != 0) {
				    if (bool) {
					int i_1671_
					    = anIntArray11423[i_1670_ & 0xff];
					i_1664_
					    = ((i_1671_ & 0xff00ff) * i_1662_
					       & ~0xff00ff);
					i_1665_ = ((i_1671_ & 0xff00) * i_1662_
						   & 0xff0000);
					i_1671_ = (((i_1664_ | i_1665_) >>> 8)
						   + i_1527_);
					int i_1672_ = is[i_1539_];
					int i_1673_ = i_1671_ + i_1672_;
					int i_1674_ = ((i_1671_ & 0xff00ff)
						       + (i_1672_ & 0xff00ff));
					i_1672_ = ((i_1674_ & 0x1000100)
						   + (i_1673_ - i_1674_
						      & 0x10000));
					is[i_1539_]
					    = (i_1673_ - i_1672_
					       | i_1672_ - (i_1672_ >>> 8));
				    }
				    if (bool_1521_ && bool_1530_)
					fs[i_1539_] = f;
				}
			    }
			    i_1531_ += i_1535_;
			    i_1539_++;
			}
			i_1532_ += i_1536_;
			i_1531_ = i_1666_;
			i_1539_ += i_1540_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    public void method2467(int i, int i_1675_, int i_1676_, int i_1677_,
			   int i_1678_) {
	if (aClass182_Sub2_9033.method15226())
	    throw new IllegalStateException();
	int[] is = aClass182_Sub2_9033.anIntArray9466;
	if (is != null) {
	    int i_1679_ = aClass182_Sub2_9033.anInt9494 * -476035351;
	    i += anInt9002;
	    i_1675_ += anInt9003;
	    int i_1680_ = i_1675_ * i_1679_ + i;
	    int i_1681_ = 0;
	    int i_1682_ = anInt9001;
	    int i_1683_ = anInt9000;
	    int i_1684_ = i_1679_ - i_1683_;
	    int i_1685_ = 0;
	    if (i_1675_ < aClass182_Sub2_9033.anInt9472 * 1722112305) {
		int i_1686_
		    = aClass182_Sub2_9033.anInt9472 * 1722112305 - i_1675_;
		i_1682_ -= i_1686_;
		i_1675_ = aClass182_Sub2_9033.anInt9472 * 1722112305;
		i_1681_ += i_1686_ * i_1683_;
		i_1680_ += i_1686_ * i_1679_;
	    }
	    if (i_1675_ + i_1682_ > aClass182_Sub2_9033.anInt9473 * 1920901985)
		i_1682_ -= (i_1675_ + i_1682_
			    - aClass182_Sub2_9033.anInt9473 * 1920901985);
	    if (i < aClass182_Sub2_9033.anInt9470 * 1988019027) {
		int i_1687_ = aClass182_Sub2_9033.anInt9470 * 1988019027 - i;
		i_1683_ -= i_1687_;
		i = aClass182_Sub2_9033.anInt9470 * 1988019027;
		i_1681_ += i_1687_;
		i_1680_ += i_1687_;
		i_1685_ += i_1687_;
		i_1684_ += i_1687_;
	    }
	    if (i + i_1683_ > aClass182_Sub2_9033.anInt9499 * -466178451) {
		int i_1688_
		    = i + i_1683_ - aClass182_Sub2_9033.anInt9499 * -466178451;
		i_1683_ -= i_1688_;
		i_1685_ += i_1688_;
		i_1684_ += i_1688_;
	    }
	    if (i_1683_ > 0 && i_1682_ > 0) {
		if (i_1678_ == 0) {
		    if (i_1676_ == 1) {
			for (int i_1689_ = -i_1682_; i_1689_ < 0; i_1689_++) {
			    int i_1690_ = i_1680_ + i_1683_ - 3;
			    while (i_1680_ < i_1690_) {
				is[i_1680_++]
				    = (anIntArray11423
				       [aByteArray11422[i_1681_++] & 0xff]);
				is[i_1680_++]
				    = (anIntArray11423
				       [aByteArray11422[i_1681_++] & 0xff]);
				is[i_1680_++]
				    = (anIntArray11423
				       [aByteArray11422[i_1681_++] & 0xff]);
				is[i_1680_++]
				    = (anIntArray11423
				       [aByteArray11422[i_1681_++] & 0xff]);
			    }
			    i_1690_ += 3;
			    while (i_1680_ < i_1690_)
				is[i_1680_++]
				    = (anIntArray11423
				       [aByteArray11422[i_1681_++] & 0xff]);
			    i_1680_ += i_1684_;
			    i_1681_ += i_1685_;
			}
		    } else if (i_1676_ == 0) {
			int i_1691_ = (i_1677_ & 0xff0000) >> 16;
			int i_1692_ = (i_1677_ & 0xff00) >> 8;
			int i_1693_ = i_1677_ & 0xff;
			for (int i_1694_ = -i_1682_; i_1694_ < 0; i_1694_++) {
			    for (int i_1695_ = -i_1683_; i_1695_ < 0;
				 i_1695_++) {
				int i_1696_
				    = (anIntArray11423
				       [aByteArray11422[i_1681_++] & 0xff]);
				int i_1697_ = ((i_1696_ & 0xff0000) * i_1691_
					       & ~0xffffff);
				int i_1698_
				    = (i_1696_ & 0xff00) * i_1692_ & 0xff0000;
				int i_1699_
				    = (i_1696_ & 0xff) * i_1693_ & 0xff00;
				is[i_1680_++]
				    = (i_1697_ | i_1698_ | i_1699_) >>> 8;
			    }
			    i_1680_ += i_1684_;
			    i_1681_ += i_1685_;
			}
		    } else if (i_1676_ == 3) {
			for (int i_1700_ = -i_1682_; i_1700_ < 0; i_1700_++) {
			    for (int i_1701_ = -i_1683_; i_1701_ < 0;
				 i_1701_++) {
				int i_1702_
				    = (anIntArray11423
				       [aByteArray11422[i_1681_++] & 0xff]);
				int i_1703_ = i_1702_ + i_1677_;
				int i_1704_ = ((i_1702_ & 0xff00ff)
					       + (i_1677_ & 0xff00ff));
				int i_1705_
				    = ((i_1704_ & 0x1000100)
				       + (i_1703_ - i_1704_ & 0x10000));
				is[i_1680_++]
				    = i_1703_ - i_1705_ | i_1705_ - (i_1705_
								     >>> 8);
			    }
			    i_1680_ += i_1684_;
			    i_1681_ += i_1685_;
			}
		    } else if (i_1676_ == 2) {
			int i_1706_ = i_1677_ >>> 24;
			int i_1707_ = 256 - i_1706_;
			int i_1708_
			    = (i_1677_ & 0xff00ff) * i_1707_ & ~0xff00ff;
			int i_1709_ = (i_1677_ & 0xff00) * i_1707_ & 0xff0000;
			i_1677_ = (i_1708_ | i_1709_) >>> 8;
			for (int i_1710_ = -i_1682_; i_1710_ < 0; i_1710_++) {
			    for (int i_1711_ = -i_1683_; i_1711_ < 0;
				 i_1711_++) {
				int i_1712_
				    = (anIntArray11423
				       [aByteArray11422[i_1681_++] & 0xff]);
				i_1708_ = ((i_1712_ & 0xff00ff) * i_1706_
					   & ~0xff00ff);
				i_1709_
				    = (i_1712_ & 0xff00) * i_1706_ & 0xff0000;
				is[i_1680_++]
				    = ((i_1708_ | i_1709_) >>> 8) + i_1677_;
			    }
			    i_1680_ += i_1684_;
			    i_1681_ += i_1685_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1678_ == 1) {
		    if (i_1676_ == 1) {
			for (int i_1713_ = -i_1682_; i_1713_ < 0; i_1713_++) {
			    for (int i_1714_ = -i_1683_; i_1714_ < 0;
				 i_1714_++) {
				int i_1715_ = aByteArray11422[i_1681_++];
				if (i_1715_ != 0) {
				    int i_1716_
					= (anIntArray11423[i_1715_ & 0xff]
					   | ~0xffffff);
				    int i_1717_ = 255;
				    int i_1718_ = 0;
				    int i_1719_ = is[i_1680_];
				    is[i_1680_++]
					= (((((i_1716_ & 0xff00ff) * i_1717_
					      + (i_1719_ & 0xff00ff) * i_1718_)
					     & ~0xff00ff)
					    >> 8)
					   + (((((i_1716_ & ~0xff00ff) >>> 8)
						* i_1717_)
					       + (((i_1719_ & ~0xff00ff) >>> 8)
						  * i_1718_))
					      & ~0xff00ff));
				} else
				    i_1680_++;
			    }
			    i_1680_ += i_1684_;
			    i_1681_ += i_1685_;
			}
		    } else if (i_1676_ == 0) {
			if ((i_1677_ & 0xffffff) == 16777215) {
			    int i_1720_ = i_1677_ >>> 24;
			    int i_1721_ = 256 - i_1720_;
			    for (int i_1722_ = -i_1682_; i_1722_ < 0;
				 i_1722_++) {
				for (int i_1723_ = -i_1683_; i_1723_ < 0;
				     i_1723_++) {
				    int i_1724_ = aByteArray11422[i_1681_++];
				    if (i_1724_ != 0) {
					int i_1725_
					    = anIntArray11423[i_1724_ & 0xff];
					int i_1726_ = is[i_1680_];
					is[i_1680_++]
					    = ((((i_1725_ & 0xff00ff) * i_1720_
						 + ((i_1726_ & 0xff00ff)
						    * i_1721_))
						& ~0xff00ff)
					       + (((i_1725_ & 0xff00) * i_1720_
						   + ((i_1726_ & 0xff00)
						      * i_1721_))
						  & 0xff0000)) >> 8;
				    } else
					i_1680_++;
				}
				i_1680_ += i_1684_;
				i_1681_ += i_1685_;
			    }
			} else {
			    int i_1727_ = (i_1677_ & 0xff0000) >> 16;
			    int i_1728_ = (i_1677_ & 0xff00) >> 8;
			    int i_1729_ = i_1677_ & 0xff;
			    int i_1730_ = i_1677_ >>> 24;
			    int i_1731_ = 256 - i_1730_;
			    for (int i_1732_ = -i_1682_; i_1732_ < 0;
				 i_1732_++) {
				for (int i_1733_ = -i_1683_; i_1733_ < 0;
				     i_1733_++) {
				    int i_1734_ = aByteArray11422[i_1681_++];
				    if (i_1734_ != 0) {
					int i_1735_
					    = anIntArray11423[i_1734_ & 0xff];
					if (i_1730_ != 255) {
					    int i_1736_
						= (((i_1735_ & 0xff0000)
						    * i_1727_)
						   & ~0xffffff);
					    int i_1737_
						= ((i_1735_ & 0xff00) * i_1728_
						   & 0xff0000);
					    int i_1738_
						= ((i_1735_ & 0xff) * i_1729_
						   & 0xff00);
					    i_1735_ = (i_1736_ | i_1737_
						       | i_1738_) >>> 8;
					    int i_1739_ = is[i_1680_];
					    is[i_1680_++]
						= (((((i_1735_ & 0xff00ff)
						      * i_1730_)
						     + ((i_1739_ & 0xff00ff)
							* i_1731_))
						    & ~0xff00ff)
						   + ((((i_1735_ & 0xff00)
							* i_1730_)
						       + ((i_1739_ & 0xff00)
							  * i_1731_))
						      & 0xff0000)) >> 8;
					} else {
					    int i_1740_
						= (((i_1735_ & 0xff0000)
						    * i_1727_)
						   & ~0xffffff);
					    int i_1741_
						= ((i_1735_ & 0xff00) * i_1728_
						   & 0xff0000);
					    int i_1742_
						= ((i_1735_ & 0xff) * i_1729_
						   & 0xff00);
					    is[i_1680_++] = (i_1740_ | i_1741_
							     | i_1742_) >>> 8;
					}
				    } else
					i_1680_++;
				}
				i_1680_ += i_1684_;
				i_1681_ += i_1685_;
			    }
			}
		    } else if (i_1676_ == 3) {
			int i_1743_ = i_1677_ >>> 24;
			int i_1744_ = 256 - i_1743_;
			for (int i_1745_ = -i_1682_; i_1745_ < 0; i_1745_++) {
			    for (int i_1746_ = -i_1683_; i_1746_ < 0;
				 i_1746_++) {
				byte i_1747_ = aByteArray11422[i_1681_++];
				int i_1748_ = (i_1747_ > 0
					       ? anIntArray11423[i_1747_] : 0);
				int i_1749_ = i_1748_ + i_1677_;
				int i_1750_ = ((i_1748_ & 0xff00ff)
					       + (i_1677_ & 0xff00ff));
				int i_1751_
				    = ((i_1750_ & 0x1000100)
				       + (i_1749_ - i_1750_ & 0x10000));
				i_1751_
				    = i_1749_ - i_1751_ | i_1751_ - (i_1751_
								     >>> 8);
				if (i_1748_ == 0 && i_1743_ != 255) {
				    i_1748_ = i_1751_;
				    i_1751_ = is[i_1680_];
				    i_1751_
					= ((((i_1748_ & 0xff00ff) * i_1743_
					     + (i_1751_ & 0xff00ff) * i_1744_)
					    & ~0xff00ff)
					   + (((i_1748_ & 0xff00) * i_1743_
					       + (i_1751_ & 0xff00) * i_1744_)
					      & 0xff0000)) >> 8;
				}
				is[i_1680_++] = i_1751_;
			    }
			    i_1680_ += i_1684_;
			    i_1681_ += i_1685_;
			}
		    } else if (i_1676_ == 2) {
			int i_1752_ = i_1677_ >>> 24;
			int i_1753_ = 256 - i_1752_;
			int i_1754_
			    = (i_1677_ & 0xff00ff) * i_1753_ & ~0xff00ff;
			int i_1755_ = (i_1677_ & 0xff00) * i_1753_ & 0xff0000;
			i_1677_ = (i_1754_ | i_1755_) >>> 8;
			for (int i_1756_ = -i_1682_; i_1756_ < 0; i_1756_++) {
			    for (int i_1757_ = -i_1683_; i_1757_ < 0;
				 i_1757_++) {
				int i_1758_ = aByteArray11422[i_1681_++];
				if (i_1758_ != 0) {
				    int i_1759_
					= anIntArray11423[i_1758_ & 0xff];
				    i_1754_ = ((i_1759_ & 0xff00ff) * i_1752_
					       & ~0xff00ff);
				    i_1755_ = ((i_1759_ & 0xff00) * i_1752_
					       & 0xff0000);
				    is[i_1680_++] = ((i_1754_ | i_1755_)
						     >>> 8) + i_1677_;
				} else
				    i_1680_++;
			    }
			    i_1680_ += i_1684_;
			    i_1681_ += i_1685_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1678_ == 2) {
		    if (i_1676_ == 1) {
			for (int i_1760_ = -i_1682_; i_1760_ < 0; i_1760_++) {
			    for (int i_1761_ = -i_1683_; i_1761_ < 0;
				 i_1761_++) {
				int i_1762_ = aByteArray11422[i_1681_++];
				if (i_1762_ != 0) {
				    int i_1763_
					= anIntArray11423[i_1762_ & 0xff];
				    int i_1764_ = is[i_1680_];
				    int i_1765_ = i_1763_ + i_1764_;
				    int i_1766_ = ((i_1763_ & 0xff00ff)
						   + (i_1764_ & 0xff00ff));
				    i_1764_
					= ((i_1766_ & 0x1000100)
					   + (i_1765_ - i_1766_ & 0x10000));
				    is[i_1680_++]
					= (i_1765_ - i_1764_
					   | i_1764_ - (i_1764_ >>> 8));
				} else
				    i_1680_++;
			    }
			    i_1680_ += i_1684_;
			    i_1681_ += i_1685_;
			}
		    } else if (i_1676_ == 0) {
			int i_1767_ = (i_1677_ & 0xff0000) >> 16;
			int i_1768_ = (i_1677_ & 0xff00) >> 8;
			int i_1769_ = i_1677_ & 0xff;
			for (int i_1770_ = -i_1682_; i_1770_ < 0; i_1770_++) {
			    for (int i_1771_ = -i_1683_; i_1771_ < 0;
				 i_1771_++) {
				int i_1772_ = aByteArray11422[i_1681_++];
				if (i_1772_ != 0) {
				    int i_1773_
					= anIntArray11423[i_1772_ & 0xff];
				    int i_1774_
					= ((i_1773_ & 0xff0000) * i_1767_
					   & ~0xffffff);
				    int i_1775_ = ((i_1773_ & 0xff00) * i_1768_
						   & 0xff0000);
				    int i_1776_
					= (i_1773_ & 0xff) * i_1769_ & 0xff00;
				    i_1773_
					= (i_1774_ | i_1775_ | i_1776_) >>> 8;
				    int i_1777_ = is[i_1680_];
				    int i_1778_ = i_1773_ + i_1777_;
				    int i_1779_ = ((i_1773_ & 0xff00ff)
						   + (i_1777_ & 0xff00ff));
				    i_1777_
					= ((i_1779_ & 0x1000100)
					   + (i_1778_ - i_1779_ & 0x10000));
				    is[i_1680_++]
					= (i_1778_ - i_1777_
					   | i_1777_ - (i_1777_ >>> 8));
				} else
				    i_1680_++;
			    }
			    i_1680_ += i_1684_;
			    i_1681_ += i_1685_;
			}
		    } else if (i_1676_ == 3) {
			for (int i_1780_ = -i_1682_; i_1780_ < 0; i_1780_++) {
			    for (int i_1781_ = -i_1683_; i_1781_ < 0;
				 i_1781_++) {
				byte i_1782_ = aByteArray11422[i_1681_++];
				int i_1783_ = (i_1782_ > 0
					       ? anIntArray11423[i_1782_] : 0);
				int i_1784_ = i_1783_ + i_1677_;
				int i_1785_ = ((i_1783_ & 0xff00ff)
					       + (i_1677_ & 0xff00ff));
				int i_1786_
				    = ((i_1785_ & 0x1000100)
				       + (i_1784_ - i_1785_ & 0x10000));
				i_1783_
				    = i_1784_ - i_1786_ | i_1786_ - (i_1786_
								     >>> 8);
				i_1786_ = is[i_1680_];
				i_1784_ = i_1783_ + i_1786_;
				i_1785_ = (i_1783_ & 0xff00ff) + (i_1786_
								  & 0xff00ff);
				i_1786_ = ((i_1785_ & 0x1000100)
					   + (i_1784_ - i_1785_ & 0x10000));
				is[i_1680_++]
				    = i_1784_ - i_1786_ | i_1786_ - (i_1786_
								     >>> 8);
			    }
			    i_1680_ += i_1684_;
			    i_1681_ += i_1685_;
			}
		    } else if (i_1676_ == 2) {
			int i_1787_ = i_1677_ >>> 24;
			int i_1788_ = 256 - i_1787_;
			int i_1789_
			    = (i_1677_ & 0xff00ff) * i_1788_ & ~0xff00ff;
			int i_1790_ = (i_1677_ & 0xff00) * i_1788_ & 0xff0000;
			i_1677_ = (i_1789_ | i_1790_) >>> 8;
			for (int i_1791_ = -i_1682_; i_1791_ < 0; i_1791_++) {
			    for (int i_1792_ = -i_1683_; i_1792_ < 0;
				 i_1792_++) {
				int i_1793_ = aByteArray11422[i_1681_++];
				if (i_1793_ != 0) {
				    int i_1794_
					= anIntArray11423[i_1793_ & 0xff];
				    i_1789_ = ((i_1794_ & 0xff00ff) * i_1787_
					       & ~0xff00ff);
				    i_1790_ = ((i_1794_ & 0xff00) * i_1787_
					       & 0xff0000);
				    i_1794_ = (((i_1789_ | i_1790_) >>> 8)
					       + i_1677_);
				    int i_1795_ = is[i_1680_];
				    int i_1796_ = i_1794_ + i_1795_;
				    int i_1797_ = ((i_1794_ & 0xff00ff)
						   + (i_1795_ & 0xff00ff));
				    i_1795_
					= ((i_1797_ & 0x1000100)
					   + (i_1796_ - i_1797_ & 0x10000));
				    is[i_1680_++]
					= (i_1796_ - i_1795_
					   | i_1795_ - (i_1795_ >>> 8));
				} else
				    i_1680_++;
			    }
			    i_1680_ += i_1684_;
			    i_1681_ += i_1685_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    public Interface21 method2502() {
	throw new IllegalStateException();
    }
    
    public void method2545(int i, int i_1798_, int i_1799_, int i_1800_,
			   int i_1801_) {
	if (aClass182_Sub2_9033.method15226())
	    throw new IllegalStateException();
	int[] is = aClass182_Sub2_9033.anIntArray9466;
	if (is != null) {
	    int i_1802_ = aClass182_Sub2_9033.anInt9494 * -476035351;
	    i += anInt9002;
	    i_1798_ += anInt9003;
	    int i_1803_ = i_1798_ * i_1802_ + i;
	    int i_1804_ = 0;
	    int i_1805_ = anInt9001;
	    int i_1806_ = anInt9000;
	    int i_1807_ = i_1802_ - i_1806_;
	    int i_1808_ = 0;
	    if (i_1798_ < aClass182_Sub2_9033.anInt9472 * 1722112305) {
		int i_1809_
		    = aClass182_Sub2_9033.anInt9472 * 1722112305 - i_1798_;
		i_1805_ -= i_1809_;
		i_1798_ = aClass182_Sub2_9033.anInt9472 * 1722112305;
		i_1804_ += i_1809_ * i_1806_;
		i_1803_ += i_1809_ * i_1802_;
	    }
	    if (i_1798_ + i_1805_ > aClass182_Sub2_9033.anInt9473 * 1920901985)
		i_1805_ -= (i_1798_ + i_1805_
			    - aClass182_Sub2_9033.anInt9473 * 1920901985);
	    if (i < aClass182_Sub2_9033.anInt9470 * 1988019027) {
		int i_1810_ = aClass182_Sub2_9033.anInt9470 * 1988019027 - i;
		i_1806_ -= i_1810_;
		i = aClass182_Sub2_9033.anInt9470 * 1988019027;
		i_1804_ += i_1810_;
		i_1803_ += i_1810_;
		i_1808_ += i_1810_;
		i_1807_ += i_1810_;
	    }
	    if (i + i_1806_ > aClass182_Sub2_9033.anInt9499 * -466178451) {
		int i_1811_
		    = i + i_1806_ - aClass182_Sub2_9033.anInt9499 * -466178451;
		i_1806_ -= i_1811_;
		i_1808_ += i_1811_;
		i_1807_ += i_1811_;
	    }
	    if (i_1806_ > 0 && i_1805_ > 0) {
		if (i_1801_ == 0) {
		    if (i_1799_ == 1) {
			for (int i_1812_ = -i_1805_; i_1812_ < 0; i_1812_++) {
			    int i_1813_ = i_1803_ + i_1806_ - 3;
			    while (i_1803_ < i_1813_) {
				is[i_1803_++]
				    = (anIntArray11423
				       [aByteArray11422[i_1804_++] & 0xff]);
				is[i_1803_++]
				    = (anIntArray11423
				       [aByteArray11422[i_1804_++] & 0xff]);
				is[i_1803_++]
				    = (anIntArray11423
				       [aByteArray11422[i_1804_++] & 0xff]);
				is[i_1803_++]
				    = (anIntArray11423
				       [aByteArray11422[i_1804_++] & 0xff]);
			    }
			    i_1813_ += 3;
			    while (i_1803_ < i_1813_)
				is[i_1803_++]
				    = (anIntArray11423
				       [aByteArray11422[i_1804_++] & 0xff]);
			    i_1803_ += i_1807_;
			    i_1804_ += i_1808_;
			}
		    } else if (i_1799_ == 0) {
			int i_1814_ = (i_1800_ & 0xff0000) >> 16;
			int i_1815_ = (i_1800_ & 0xff00) >> 8;
			int i_1816_ = i_1800_ & 0xff;
			for (int i_1817_ = -i_1805_; i_1817_ < 0; i_1817_++) {
			    for (int i_1818_ = -i_1806_; i_1818_ < 0;
				 i_1818_++) {
				int i_1819_
				    = (anIntArray11423
				       [aByteArray11422[i_1804_++] & 0xff]);
				int i_1820_ = ((i_1819_ & 0xff0000) * i_1814_
					       & ~0xffffff);
				int i_1821_
				    = (i_1819_ & 0xff00) * i_1815_ & 0xff0000;
				int i_1822_
				    = (i_1819_ & 0xff) * i_1816_ & 0xff00;
				is[i_1803_++]
				    = (i_1820_ | i_1821_ | i_1822_) >>> 8;
			    }
			    i_1803_ += i_1807_;
			    i_1804_ += i_1808_;
			}
		    } else if (i_1799_ == 3) {
			for (int i_1823_ = -i_1805_; i_1823_ < 0; i_1823_++) {
			    for (int i_1824_ = -i_1806_; i_1824_ < 0;
				 i_1824_++) {
				int i_1825_
				    = (anIntArray11423
				       [aByteArray11422[i_1804_++] & 0xff]);
				int i_1826_ = i_1825_ + i_1800_;
				int i_1827_ = ((i_1825_ & 0xff00ff)
					       + (i_1800_ & 0xff00ff));
				int i_1828_
				    = ((i_1827_ & 0x1000100)
				       + (i_1826_ - i_1827_ & 0x10000));
				is[i_1803_++]
				    = i_1826_ - i_1828_ | i_1828_ - (i_1828_
								     >>> 8);
			    }
			    i_1803_ += i_1807_;
			    i_1804_ += i_1808_;
			}
		    } else if (i_1799_ == 2) {
			int i_1829_ = i_1800_ >>> 24;
			int i_1830_ = 256 - i_1829_;
			int i_1831_
			    = (i_1800_ & 0xff00ff) * i_1830_ & ~0xff00ff;
			int i_1832_ = (i_1800_ & 0xff00) * i_1830_ & 0xff0000;
			i_1800_ = (i_1831_ | i_1832_) >>> 8;
			for (int i_1833_ = -i_1805_; i_1833_ < 0; i_1833_++) {
			    for (int i_1834_ = -i_1806_; i_1834_ < 0;
				 i_1834_++) {
				int i_1835_
				    = (anIntArray11423
				       [aByteArray11422[i_1804_++] & 0xff]);
				i_1831_ = ((i_1835_ & 0xff00ff) * i_1829_
					   & ~0xff00ff);
				i_1832_
				    = (i_1835_ & 0xff00) * i_1829_ & 0xff0000;
				is[i_1803_++]
				    = ((i_1831_ | i_1832_) >>> 8) + i_1800_;
			    }
			    i_1803_ += i_1807_;
			    i_1804_ += i_1808_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1801_ == 1) {
		    if (i_1799_ == 1) {
			for (int i_1836_ = -i_1805_; i_1836_ < 0; i_1836_++) {
			    for (int i_1837_ = -i_1806_; i_1837_ < 0;
				 i_1837_++) {
				int i_1838_ = aByteArray11422[i_1804_++];
				if (i_1838_ != 0) {
				    int i_1839_
					= (anIntArray11423[i_1838_ & 0xff]
					   | ~0xffffff);
				    int i_1840_ = 255;
				    int i_1841_ = 0;
				    int i_1842_ = is[i_1803_];
				    is[i_1803_++]
					= (((((i_1839_ & 0xff00ff) * i_1840_
					      + (i_1842_ & 0xff00ff) * i_1841_)
					     & ~0xff00ff)
					    >> 8)
					   + (((((i_1839_ & ~0xff00ff) >>> 8)
						* i_1840_)
					       + (((i_1842_ & ~0xff00ff) >>> 8)
						  * i_1841_))
					      & ~0xff00ff));
				} else
				    i_1803_++;
			    }
			    i_1803_ += i_1807_;
			    i_1804_ += i_1808_;
			}
		    } else if (i_1799_ == 0) {
			if ((i_1800_ & 0xffffff) == 16777215) {
			    int i_1843_ = i_1800_ >>> 24;
			    int i_1844_ = 256 - i_1843_;
			    for (int i_1845_ = -i_1805_; i_1845_ < 0;
				 i_1845_++) {
				for (int i_1846_ = -i_1806_; i_1846_ < 0;
				     i_1846_++) {
				    int i_1847_ = aByteArray11422[i_1804_++];
				    if (i_1847_ != 0) {
					int i_1848_
					    = anIntArray11423[i_1847_ & 0xff];
					int i_1849_ = is[i_1803_];
					is[i_1803_++]
					    = ((((i_1848_ & 0xff00ff) * i_1843_
						 + ((i_1849_ & 0xff00ff)
						    * i_1844_))
						& ~0xff00ff)
					       + (((i_1848_ & 0xff00) * i_1843_
						   + ((i_1849_ & 0xff00)
						      * i_1844_))
						  & 0xff0000)) >> 8;
				    } else
					i_1803_++;
				}
				i_1803_ += i_1807_;
				i_1804_ += i_1808_;
			    }
			} else {
			    int i_1850_ = (i_1800_ & 0xff0000) >> 16;
			    int i_1851_ = (i_1800_ & 0xff00) >> 8;
			    int i_1852_ = i_1800_ & 0xff;
			    int i_1853_ = i_1800_ >>> 24;
			    int i_1854_ = 256 - i_1853_;
			    for (int i_1855_ = -i_1805_; i_1855_ < 0;
				 i_1855_++) {
				for (int i_1856_ = -i_1806_; i_1856_ < 0;
				     i_1856_++) {
				    int i_1857_ = aByteArray11422[i_1804_++];
				    if (i_1857_ != 0) {
					int i_1858_
					    = anIntArray11423[i_1857_ & 0xff];
					if (i_1853_ != 255) {
					    int i_1859_
						= (((i_1858_ & 0xff0000)
						    * i_1850_)
						   & ~0xffffff);
					    int i_1860_
						= ((i_1858_ & 0xff00) * i_1851_
						   & 0xff0000);
					    int i_1861_
						= ((i_1858_ & 0xff) * i_1852_
						   & 0xff00);
					    i_1858_ = (i_1859_ | i_1860_
						       | i_1861_) >>> 8;
					    int i_1862_ = is[i_1803_];
					    is[i_1803_++]
						= (((((i_1858_ & 0xff00ff)
						      * i_1853_)
						     + ((i_1862_ & 0xff00ff)
							* i_1854_))
						    & ~0xff00ff)
						   + ((((i_1858_ & 0xff00)
							* i_1853_)
						       + ((i_1862_ & 0xff00)
							  * i_1854_))
						      & 0xff0000)) >> 8;
					} else {
					    int i_1863_
						= (((i_1858_ & 0xff0000)
						    * i_1850_)
						   & ~0xffffff);
					    int i_1864_
						= ((i_1858_ & 0xff00) * i_1851_
						   & 0xff0000);
					    int i_1865_
						= ((i_1858_ & 0xff) * i_1852_
						   & 0xff00);
					    is[i_1803_++] = (i_1863_ | i_1864_
							     | i_1865_) >>> 8;
					}
				    } else
					i_1803_++;
				}
				i_1803_ += i_1807_;
				i_1804_ += i_1808_;
			    }
			}
		    } else if (i_1799_ == 3) {
			int i_1866_ = i_1800_ >>> 24;
			int i_1867_ = 256 - i_1866_;
			for (int i_1868_ = -i_1805_; i_1868_ < 0; i_1868_++) {
			    for (int i_1869_ = -i_1806_; i_1869_ < 0;
				 i_1869_++) {
				byte i_1870_ = aByteArray11422[i_1804_++];
				int i_1871_ = (i_1870_ > 0
					       ? anIntArray11423[i_1870_] : 0);
				int i_1872_ = i_1871_ + i_1800_;
				int i_1873_ = ((i_1871_ & 0xff00ff)
					       + (i_1800_ & 0xff00ff));
				int i_1874_
				    = ((i_1873_ & 0x1000100)
				       + (i_1872_ - i_1873_ & 0x10000));
				i_1874_
				    = i_1872_ - i_1874_ | i_1874_ - (i_1874_
								     >>> 8);
				if (i_1871_ == 0 && i_1866_ != 255) {
				    i_1871_ = i_1874_;
				    i_1874_ = is[i_1803_];
				    i_1874_
					= ((((i_1871_ & 0xff00ff) * i_1866_
					     + (i_1874_ & 0xff00ff) * i_1867_)
					    & ~0xff00ff)
					   + (((i_1871_ & 0xff00) * i_1866_
					       + (i_1874_ & 0xff00) * i_1867_)
					      & 0xff0000)) >> 8;
				}
				is[i_1803_++] = i_1874_;
			    }
			    i_1803_ += i_1807_;
			    i_1804_ += i_1808_;
			}
		    } else if (i_1799_ == 2) {
			int i_1875_ = i_1800_ >>> 24;
			int i_1876_ = 256 - i_1875_;
			int i_1877_
			    = (i_1800_ & 0xff00ff) * i_1876_ & ~0xff00ff;
			int i_1878_ = (i_1800_ & 0xff00) * i_1876_ & 0xff0000;
			i_1800_ = (i_1877_ | i_1878_) >>> 8;
			for (int i_1879_ = -i_1805_; i_1879_ < 0; i_1879_++) {
			    for (int i_1880_ = -i_1806_; i_1880_ < 0;
				 i_1880_++) {
				int i_1881_ = aByteArray11422[i_1804_++];
				if (i_1881_ != 0) {
				    int i_1882_
					= anIntArray11423[i_1881_ & 0xff];
				    i_1877_ = ((i_1882_ & 0xff00ff) * i_1875_
					       & ~0xff00ff);
				    i_1878_ = ((i_1882_ & 0xff00) * i_1875_
					       & 0xff0000);
				    is[i_1803_++] = ((i_1877_ | i_1878_)
						     >>> 8) + i_1800_;
				} else
				    i_1803_++;
			    }
			    i_1803_ += i_1807_;
			    i_1804_ += i_1808_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1801_ == 2) {
		    if (i_1799_ == 1) {
			for (int i_1883_ = -i_1805_; i_1883_ < 0; i_1883_++) {
			    for (int i_1884_ = -i_1806_; i_1884_ < 0;
				 i_1884_++) {
				int i_1885_ = aByteArray11422[i_1804_++];
				if (i_1885_ != 0) {
				    int i_1886_
					= anIntArray11423[i_1885_ & 0xff];
				    int i_1887_ = is[i_1803_];
				    int i_1888_ = i_1886_ + i_1887_;
				    int i_1889_ = ((i_1886_ & 0xff00ff)
						   + (i_1887_ & 0xff00ff));
				    i_1887_
					= ((i_1889_ & 0x1000100)
					   + (i_1888_ - i_1889_ & 0x10000));
				    is[i_1803_++]
					= (i_1888_ - i_1887_
					   | i_1887_ - (i_1887_ >>> 8));
				} else
				    i_1803_++;
			    }
			    i_1803_ += i_1807_;
			    i_1804_ += i_1808_;
			}
		    } else if (i_1799_ == 0) {
			int i_1890_ = (i_1800_ & 0xff0000) >> 16;
			int i_1891_ = (i_1800_ & 0xff00) >> 8;
			int i_1892_ = i_1800_ & 0xff;
			for (int i_1893_ = -i_1805_; i_1893_ < 0; i_1893_++) {
			    for (int i_1894_ = -i_1806_; i_1894_ < 0;
				 i_1894_++) {
				int i_1895_ = aByteArray11422[i_1804_++];
				if (i_1895_ != 0) {
				    int i_1896_
					= anIntArray11423[i_1895_ & 0xff];
				    int i_1897_
					= ((i_1896_ & 0xff0000) * i_1890_
					   & ~0xffffff);
				    int i_1898_ = ((i_1896_ & 0xff00) * i_1891_
						   & 0xff0000);
				    int i_1899_
					= (i_1896_ & 0xff) * i_1892_ & 0xff00;
				    i_1896_
					= (i_1897_ | i_1898_ | i_1899_) >>> 8;
				    int i_1900_ = is[i_1803_];
				    int i_1901_ = i_1896_ + i_1900_;
				    int i_1902_ = ((i_1896_ & 0xff00ff)
						   + (i_1900_ & 0xff00ff));
				    i_1900_
					= ((i_1902_ & 0x1000100)
					   + (i_1901_ - i_1902_ & 0x10000));
				    is[i_1803_++]
					= (i_1901_ - i_1900_
					   | i_1900_ - (i_1900_ >>> 8));
				} else
				    i_1803_++;
			    }
			    i_1803_ += i_1807_;
			    i_1804_ += i_1808_;
			}
		    } else if (i_1799_ == 3) {
			for (int i_1903_ = -i_1805_; i_1903_ < 0; i_1903_++) {
			    for (int i_1904_ = -i_1806_; i_1904_ < 0;
				 i_1904_++) {
				byte i_1905_ = aByteArray11422[i_1804_++];
				int i_1906_ = (i_1905_ > 0
					       ? anIntArray11423[i_1905_] : 0);
				int i_1907_ = i_1906_ + i_1800_;
				int i_1908_ = ((i_1906_ & 0xff00ff)
					       + (i_1800_ & 0xff00ff));
				int i_1909_
				    = ((i_1908_ & 0x1000100)
				       + (i_1907_ - i_1908_ & 0x10000));
				i_1906_
				    = i_1907_ - i_1909_ | i_1909_ - (i_1909_
								     >>> 8);
				i_1909_ = is[i_1803_];
				i_1907_ = i_1906_ + i_1909_;
				i_1908_ = (i_1906_ & 0xff00ff) + (i_1909_
								  & 0xff00ff);
				i_1909_ = ((i_1908_ & 0x1000100)
					   + (i_1907_ - i_1908_ & 0x10000));
				is[i_1803_++]
				    = i_1907_ - i_1909_ | i_1909_ - (i_1909_
								     >>> 8);
			    }
			    i_1803_ += i_1807_;
			    i_1804_ += i_1808_;
			}
		    } else if (i_1799_ == 2) {
			int i_1910_ = i_1800_ >>> 24;
			int i_1911_ = 256 - i_1910_;
			int i_1912_
			    = (i_1800_ & 0xff00ff) * i_1911_ & ~0xff00ff;
			int i_1913_ = (i_1800_ & 0xff00) * i_1911_ & 0xff0000;
			i_1800_ = (i_1912_ | i_1913_) >>> 8;
			for (int i_1914_ = -i_1805_; i_1914_ < 0; i_1914_++) {
			    for (int i_1915_ = -i_1806_; i_1915_ < 0;
				 i_1915_++) {
				int i_1916_ = aByteArray11422[i_1804_++];
				if (i_1916_ != 0) {
				    int i_1917_
					= anIntArray11423[i_1916_ & 0xff];
				    i_1912_ = ((i_1917_ & 0xff00ff) * i_1910_
					       & ~0xff00ff);
				    i_1913_ = ((i_1917_ & 0xff00) * i_1910_
					       & 0xff0000);
				    i_1917_ = (((i_1912_ | i_1913_) >>> 8)
					       + i_1800_);
				    int i_1918_ = is[i_1803_];
				    int i_1919_ = i_1917_ + i_1918_;
				    int i_1920_ = ((i_1917_ & 0xff00ff)
						   + (i_1918_ & 0xff00ff));
				    i_1918_
					= ((i_1920_ & 0x1000100)
					   + (i_1919_ - i_1920_ & 0x10000));
				    is[i_1803_++]
					= (i_1919_ - i_1918_
					   | i_1918_ - (i_1918_ >>> 8));
				} else
				    i_1803_++;
			    }
			    i_1803_ += i_1807_;
			    i_1804_ += i_1808_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    public void method2477(int i, int i_1921_, int i_1922_) {
	throw new IllegalStateException();
    }
    
    public void method2475(int i, int i_1923_, int i_1924_, int i_1925_,
			   int[] is, int[] is_1926_, int i_1927_,
			   int i_1928_) {
	throw new IllegalStateException();
    }
    
    void method2509(int i, int i_1929_, int i_1930_, int i_1931_, int i_1932_,
		    int i_1933_, int i_1934_, int i_1935_) {
	if (aClass182_Sub2_9033.method15226())
	    throw new IllegalStateException();
	if (i_1930_ > 0 && i_1931_ > 0) {
	    int[] is = aClass182_Sub2_9033.anIntArray9466;
	    if (is != null) {
		int i_1936_ = 0;
		int i_1937_ = 0;
		int i_1938_ = aClass182_Sub2_9033.anInt9494 * -476035351;
		int i_1939_ = anInt9002 + anInt9000 + anInt9004;
		int i_1940_ = anInt9003 + anInt9001 + anInt9005;
		int i_1941_ = (i_1939_ << 16) / i_1930_;
		int i_1942_ = (i_1940_ << 16) / i_1931_;
		if (anInt9002 > 0) {
		    int i_1943_ = ((anInt9002 << 16) + i_1941_ - 1) / i_1941_;
		    i += i_1943_;
		    i_1936_ += i_1943_ * i_1941_ - (anInt9002 << 16);
		}
		if (anInt9003 > 0) {
		    int i_1944_ = ((anInt9003 << 16) + i_1942_ - 1) / i_1942_;
		    i_1929_ += i_1944_;
		    i_1937_ += i_1944_ * i_1942_ - (anInt9003 << 16);
		}
		if (anInt9000 < i_1939_)
		    i_1930_ = (((anInt9000 << 16) - i_1936_ + i_1941_ - 1)
			       / i_1941_);
		if (anInt9001 < i_1940_)
		    i_1931_ = (((anInt9001 << 16) - i_1937_ + i_1942_ - 1)
			       / i_1942_);
		int i_1945_ = i + i_1929_ * i_1938_;
		int i_1946_ = i_1938_ - i_1930_;
		if (i_1929_ + i_1931_
		    > aClass182_Sub2_9033.anInt9473 * 1920901985)
		    i_1931_ -= (i_1929_ + i_1931_
				- aClass182_Sub2_9033.anInt9473 * 1920901985);
		if (i_1929_ < aClass182_Sub2_9033.anInt9472 * 1722112305) {
		    int i_1947_
			= aClass182_Sub2_9033.anInt9472 * 1722112305 - i_1929_;
		    i_1931_ -= i_1947_;
		    i_1945_ += i_1947_ * i_1938_;
		    i_1937_ += i_1942_ * i_1947_;
		}
		if (i + i_1930_ > aClass182_Sub2_9033.anInt9499 * -466178451) {
		    int i_1948_
			= (i + i_1930_
			   - aClass182_Sub2_9033.anInt9499 * -466178451);
		    i_1930_ -= i_1948_;
		    i_1946_ += i_1948_;
		}
		if (i < aClass182_Sub2_9033.anInt9470 * 1988019027) {
		    int i_1949_
			= aClass182_Sub2_9033.anInt9470 * 1988019027 - i;
		    i_1930_ -= i_1949_;
		    i_1945_ += i_1949_;
		    i_1936_ += i_1941_ * i_1949_;
		    i_1946_ += i_1949_;
		}
		if (i_1934_ == 0) {
		    if (i_1932_ == 1) {
			int i_1950_ = i_1936_;
			for (int i_1951_ = -i_1931_; i_1951_ < 0; i_1951_++) {
			    int i_1952_ = (i_1937_ >> 16) * anInt9000;
			    for (int i_1953_ = -i_1930_; i_1953_ < 0;
				 i_1953_++) {
				is[i_1945_++]
				    = (anIntArray11423
				       [(aByteArray11422
					 [(i_1936_ >> 16) + i_1952_]) & 0xff]);
				i_1936_ += i_1941_;
			    }
			    i_1937_ += i_1942_;
			    i_1936_ = i_1950_;
			    i_1945_ += i_1946_;
			}
		    } else if (i_1932_ == 0) {
			int i_1954_ = (i_1933_ & 0xff0000) >> 16;
			int i_1955_ = (i_1933_ & 0xff00) >> 8;
			int i_1956_ = i_1933_ & 0xff;
			int i_1957_ = i_1936_;
			for (int i_1958_ = -i_1931_; i_1958_ < 0; i_1958_++) {
			    int i_1959_ = (i_1937_ >> 16) * anInt9000;
			    for (int i_1960_ = -i_1930_; i_1960_ < 0;
				 i_1960_++) {
				int i_1961_
				    = (anIntArray11423
				       [(aByteArray11422
					 [(i_1936_ >> 16) + i_1959_]) & 0xff]);
				int i_1962_ = ((i_1961_ & 0xff0000) * i_1954_
					       & ~0xffffff);
				int i_1963_
				    = (i_1961_ & 0xff00) * i_1955_ & 0xff0000;
				int i_1964_
				    = (i_1961_ & 0xff) * i_1956_ & 0xff00;
				is[i_1945_++]
				    = (i_1962_ | i_1963_ | i_1964_) >>> 8;
				i_1936_ += i_1941_;
			    }
			    i_1937_ += i_1942_;
			    i_1936_ = i_1957_;
			    i_1945_ += i_1946_;
			}
		    } else if (i_1932_ == 3) {
			int i_1965_ = i_1936_;
			for (int i_1966_ = -i_1931_; i_1966_ < 0; i_1966_++) {
			    int i_1967_ = (i_1937_ >> 16) * anInt9000;
			    for (int i_1968_ = -i_1930_; i_1968_ < 0;
				 i_1968_++) {
				byte i_1969_ = (aByteArray11422
						[(i_1936_ >> 16) + i_1967_]);
				int i_1970_ = (i_1969_ > 0
					       ? anIntArray11423[i_1969_] : 0);
				int i_1971_ = i_1970_ + i_1933_;
				int i_1972_ = ((i_1970_ & 0xff00ff)
					       + (i_1933_ & 0xff00ff));
				int i_1973_
				    = ((i_1972_ & 0x1000100)
				       + (i_1971_ - i_1972_ & 0x10000));
				is[i_1945_++]
				    = i_1971_ - i_1973_ | i_1973_ - (i_1973_
								     >>> 8);
				i_1936_ += i_1941_;
			    }
			    i_1937_ += i_1942_;
			    i_1936_ = i_1965_;
			    i_1945_ += i_1946_;
			}
		    } else if (i_1932_ == 2) {
			int i_1974_ = i_1933_ >>> 24;
			int i_1975_ = 256 - i_1974_;
			int i_1976_
			    = (i_1933_ & 0xff00ff) * i_1975_ & ~0xff00ff;
			int i_1977_ = (i_1933_ & 0xff00) * i_1975_ & 0xff0000;
			i_1933_ = (i_1976_ | i_1977_) >>> 8;
			int i_1978_ = i_1936_;
			for (int i_1979_ = -i_1931_; i_1979_ < 0; i_1979_++) {
			    int i_1980_ = (i_1937_ >> 16) * anInt9000;
			    for (int i_1981_ = -i_1930_; i_1981_ < 0;
				 i_1981_++) {
				int i_1982_
				    = (anIntArray11423
				       [(aByteArray11422
					 [(i_1936_ >> 16) + i_1980_]) & 0xff]);
				i_1976_ = ((i_1982_ & 0xff00ff) * i_1974_
					   & ~0xff00ff);
				i_1977_
				    = (i_1982_ & 0xff00) * i_1974_ & 0xff0000;
				is[i_1945_++]
				    = ((i_1976_ | i_1977_) >>> 8) + i_1933_;
				i_1936_ += i_1941_;
			    }
			    i_1937_ += i_1942_;
			    i_1936_ = i_1978_;
			    i_1945_ += i_1946_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1934_ == 1) {
		    if (i_1932_ == 1) {
			int i_1983_ = i_1936_;
			for (int i_1984_ = -i_1931_; i_1984_ < 0; i_1984_++) {
			    int i_1985_ = (i_1937_ >> 16) * anInt9000;
			    for (int i_1986_ = -i_1930_; i_1986_ < 0;
				 i_1986_++) {
				int i_1987_ = (aByteArray11422
					       [(i_1936_ >> 16) + i_1985_]);
				if (i_1987_ != 0)
				    is[i_1945_++]
					= anIntArray11423[i_1987_ & 0xff];
				else
				    i_1945_++;
				i_1936_ += i_1941_;
			    }
			    i_1937_ += i_1942_;
			    i_1936_ = i_1983_;
			    i_1945_ += i_1946_;
			}
		    } else if (i_1932_ == 0) {
			int i_1988_ = i_1936_;
			if ((i_1933_ & 0xffffff) == 16777215) {
			    int i_1989_ = i_1933_ >>> 24;
			    int i_1990_ = 256 - i_1989_;
			    for (int i_1991_ = -i_1931_; i_1991_ < 0;
				 i_1991_++) {
				int i_1992_ = (i_1937_ >> 16) * anInt9000;
				for (int i_1993_ = -i_1930_; i_1993_ < 0;
				     i_1993_++) {
				    int i_1994_
					= (aByteArray11422
					   [(i_1936_ >> 16) + i_1992_]);
				    if (i_1994_ != 0) {
					int i_1995_
					    = anIntArray11423[i_1994_ & 0xff];
					int i_1996_ = is[i_1945_];
					is[i_1945_++]
					    = ((((i_1995_ & 0xff00ff) * i_1989_
						 + ((i_1996_ & 0xff00ff)
						    * i_1990_))
						& ~0xff00ff)
					       + (((i_1995_ & 0xff00) * i_1989_
						   + ((i_1996_ & 0xff00)
						      * i_1990_))
						  & 0xff0000)) >> 8;
				    } else
					i_1945_++;
				    i_1936_ += i_1941_;
				}
				i_1937_ += i_1942_;
				i_1936_ = i_1988_;
				i_1945_ += i_1946_;
			    }
			} else {
			    int i_1997_ = (i_1933_ & 0xff0000) >> 16;
			    int i_1998_ = (i_1933_ & 0xff00) >> 8;
			    int i_1999_ = i_1933_ & 0xff;
			    int i_2000_ = i_1933_ >>> 24;
			    int i_2001_ = 256 - i_2000_;
			    for (int i_2002_ = -i_1931_; i_2002_ < 0;
				 i_2002_++) {
				int i_2003_ = (i_1937_ >> 16) * anInt9000;
				for (int i_2004_ = -i_1930_; i_2004_ < 0;
				     i_2004_++) {
				    int i_2005_
					= (aByteArray11422
					   [(i_1936_ >> 16) + i_2003_]);
				    if (i_2005_ != 0) {
					int i_2006_
					    = anIntArray11423[i_2005_ & 0xff];
					if (i_2000_ != 255) {
					    int i_2007_
						= (((i_2006_ & 0xff0000)
						    * i_1997_)
						   & ~0xffffff);
					    int i_2008_
						= ((i_2006_ & 0xff00) * i_1998_
						   & 0xff0000);
					    int i_2009_
						= ((i_2006_ & 0xff) * i_1999_
						   & 0xff00);
					    i_2006_ = (i_2007_ | i_2008_
						       | i_2009_) >>> 8;
					    int i_2010_ = is[i_1945_];
					    is[i_1945_++]
						= (((((i_2006_ & 0xff00ff)
						      * i_2000_)
						     + ((i_2010_ & 0xff00ff)
							* i_2001_))
						    & ~0xff00ff)
						   + ((((i_2006_ & 0xff00)
							* i_2000_)
						       + ((i_2010_ & 0xff00)
							  * i_2001_))
						      & 0xff0000)) >> 8;
					} else {
					    int i_2011_
						= (((i_2006_ & 0xff0000)
						    * i_1997_)
						   & ~0xffffff);
					    int i_2012_
						= ((i_2006_ & 0xff00) * i_1998_
						   & 0xff0000);
					    int i_2013_
						= ((i_2006_ & 0xff) * i_1999_
						   & 0xff00);
					    is[i_1945_++] = (i_2011_ | i_2012_
							     | i_2013_) >>> 8;
					}
				    } else
					i_1945_++;
				    i_1936_ += i_1941_;
				}
				i_1937_ += i_1942_;
				i_1936_ = i_1988_;
				i_1945_ += i_1946_;
			    }
			}
		    } else if (i_1932_ == 3) {
			int i_2014_ = i_1936_;
			int i_2015_ = i_1933_ >>> 24;
			int i_2016_ = 256 - i_2015_;
			for (int i_2017_ = -i_1931_; i_2017_ < 0; i_2017_++) {
			    int i_2018_ = (i_1937_ >> 16) * anInt9000;
			    for (int i_2019_ = -i_1930_; i_2019_ < 0;
				 i_2019_++) {
				byte i_2020_ = (aByteArray11422
						[(i_1936_ >> 16) + i_2018_]);
				int i_2021_ = (i_2020_ > 0
					       ? anIntArray11423[i_2020_] : 0);
				int i_2022_ = i_2021_ + i_1933_;
				int i_2023_ = ((i_2021_ & 0xff00ff)
					       + (i_1933_ & 0xff00ff));
				int i_2024_
				    = ((i_2023_ & 0x1000100)
				       + (i_2022_ - i_2023_ & 0x10000));
				i_2024_
				    = i_2022_ - i_2024_ | i_2024_ - (i_2024_
								     >>> 8);
				if (i_2021_ == 0 && i_2015_ != 255) {
				    i_2021_ = i_2024_;
				    i_2024_ = is[i_1945_];
				    i_2024_
					= ((((i_2021_ & 0xff00ff) * i_2015_
					     + (i_2024_ & 0xff00ff) * i_2016_)
					    & ~0xff00ff)
					   + (((i_2021_ & 0xff00) * i_2015_
					       + (i_2024_ & 0xff00) * i_2016_)
					      & 0xff0000)) >> 8;
				}
				is[i_1945_++] = i_2024_;
				i_1936_ += i_1941_;
			    }
			    i_1937_ += i_1942_;
			    i_1936_ = i_2014_;
			    i_1945_ += i_1946_;
			}
		    } else if (i_1932_ == 2) {
			int i_2025_ = i_1933_ >>> 24;
			int i_2026_ = 256 - i_2025_;
			int i_2027_
			    = (i_1933_ & 0xff00ff) * i_2026_ & ~0xff00ff;
			int i_2028_ = (i_1933_ & 0xff00) * i_2026_ & 0xff0000;
			i_1933_ = (i_2027_ | i_2028_) >>> 8;
			int i_2029_ = i_1936_;
			for (int i_2030_ = -i_1931_; i_2030_ < 0; i_2030_++) {
			    int i_2031_ = (i_1937_ >> 16) * anInt9000;
			    for (int i_2032_ = -i_1930_; i_2032_ < 0;
				 i_2032_++) {
				int i_2033_ = (aByteArray11422
					       [(i_1936_ >> 16) + i_2031_]);
				if (i_2033_ != 0) {
				    int i_2034_
					= anIntArray11423[i_2033_ & 0xff];
				    i_2027_ = ((i_2034_ & 0xff00ff) * i_2025_
					       & ~0xff00ff);
				    i_2028_ = ((i_2034_ & 0xff00) * i_2025_
					       & 0xff0000);
				    is[i_1945_++] = ((i_2027_ | i_2028_)
						     >>> 8) + i_1933_;
				} else
				    i_1945_++;
				i_1936_ += i_1941_;
			    }
			    i_1937_ += i_1942_;
			    i_1936_ = i_2029_;
			    i_1945_ += i_1946_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1934_ == 2) {
		    if (i_1932_ == 1) {
			int i_2035_ = i_1936_;
			for (int i_2036_ = -i_1931_; i_2036_ < 0; i_2036_++) {
			    int i_2037_ = (i_1937_ >> 16) * anInt9000;
			    for (int i_2038_ = -i_1930_; i_2038_ < 0;
				 i_2038_++) {
				int i_2039_ = (aByteArray11422
					       [(i_1936_ >> 16) + i_2037_]);
				if (i_2039_ != 0) {
				    int i_2040_
					= anIntArray11423[i_2039_ & 0xff];
				    int i_2041_ = is[i_1945_];
				    int i_2042_ = i_2040_ + i_2041_;
				    int i_2043_ = ((i_2040_ & 0xff00ff)
						   + (i_2041_ & 0xff00ff));
				    i_2041_
					= ((i_2043_ & 0x1000100)
					   + (i_2042_ - i_2043_ & 0x10000));
				    is[i_1945_++]
					= (i_2042_ - i_2041_
					   | i_2041_ - (i_2041_ >>> 8));
				} else
				    i_1945_++;
				i_1936_ += i_1941_;
			    }
			    i_1937_ += i_1942_;
			    i_1936_ = i_2035_;
			    i_1945_ += i_1946_;
			}
		    } else if (i_1932_ == 0) {
			int i_2044_ = i_1936_;
			int i_2045_ = (i_1933_ & 0xff0000) >> 16;
			int i_2046_ = (i_1933_ & 0xff00) >> 8;
			int i_2047_ = i_1933_ & 0xff;
			for (int i_2048_ = -i_1931_; i_2048_ < 0; i_2048_++) {
			    int i_2049_ = (i_1937_ >> 16) * anInt9000;
			    for (int i_2050_ = -i_1930_; i_2050_ < 0;
				 i_2050_++) {
				int i_2051_ = (aByteArray11422
					       [(i_1936_ >> 16) + i_2049_]);
				if (i_2051_ != 0) {
				    int i_2052_
					= anIntArray11423[i_2051_ & 0xff];
				    int i_2053_
					= ((i_2052_ & 0xff0000) * i_2045_
					   & ~0xffffff);
				    int i_2054_ = ((i_2052_ & 0xff00) * i_2046_
						   & 0xff0000);
				    int i_2055_
					= (i_2052_ & 0xff) * i_2047_ & 0xff00;
				    i_2052_
					= (i_2053_ | i_2054_ | i_2055_) >>> 8;
				    int i_2056_ = is[i_1945_];
				    int i_2057_ = i_2052_ + i_2056_;
				    int i_2058_ = ((i_2052_ & 0xff00ff)
						   + (i_2056_ & 0xff00ff));
				    i_2056_
					= ((i_2058_ & 0x1000100)
					   + (i_2057_ - i_2058_ & 0x10000));
				    is[i_1945_++]
					= (i_2057_ - i_2056_
					   | i_2056_ - (i_2056_ >>> 8));
				} else
				    i_1945_++;
				i_1936_ += i_1941_;
			    }
			    i_1937_ += i_1942_;
			    i_1936_ = i_2044_;
			    i_1945_ += i_1946_;
			}
		    } else if (i_1932_ == 3) {
			int i_2059_ = i_1936_;
			for (int i_2060_ = -i_1931_; i_2060_ < 0; i_2060_++) {
			    int i_2061_ = (i_1937_ >> 16) * anInt9000;
			    for (int i_2062_ = -i_1930_; i_2062_ < 0;
				 i_2062_++) {
				byte i_2063_ = (aByteArray11422
						[(i_1936_ >> 16) + i_2061_]);
				int i_2064_ = (i_2063_ > 0
					       ? anIntArray11423[i_2063_] : 0);
				int i_2065_ = i_2064_ + i_1933_;
				int i_2066_ = ((i_2064_ & 0xff00ff)
					       + (i_1933_ & 0xff00ff));
				int i_2067_
				    = ((i_2066_ & 0x1000100)
				       + (i_2065_ - i_2066_ & 0x10000));
				i_2064_
				    = i_2065_ - i_2067_ | i_2067_ - (i_2067_
								     >>> 8);
				i_2067_ = is[i_1945_];
				i_2065_ = i_2064_ + i_2067_;
				i_2066_ = (i_2064_ & 0xff00ff) + (i_2067_
								  & 0xff00ff);
				i_2067_ = ((i_2066_ & 0x1000100)
					   + (i_2065_ - i_2066_ & 0x10000));
				is[i_1945_++]
				    = i_2065_ - i_2067_ | i_2067_ - (i_2067_
								     >>> 8);
				i_1936_ += i_1941_;
			    }
			    i_1937_ += i_1942_;
			    i_1936_ = i_2059_;
			    i_1945_ += i_1946_;
			}
		    } else if (i_1932_ == 2) {
			int i_2068_ = i_1933_ >>> 24;
			int i_2069_ = 256 - i_2068_;
			int i_2070_
			    = (i_1933_ & 0xff00ff) * i_2069_ & ~0xff00ff;
			int i_2071_ = (i_1933_ & 0xff00) * i_2069_ & 0xff0000;
			i_1933_ = (i_2070_ | i_2071_) >>> 8;
			int i_2072_ = i_1936_;
			for (int i_2073_ = -i_1931_; i_2073_ < 0; i_2073_++) {
			    int i_2074_ = (i_1937_ >> 16) * anInt9000;
			    for (int i_2075_ = -i_1930_; i_2075_ < 0;
				 i_2075_++) {
				int i_2076_ = (aByteArray11422
					       [(i_1936_ >> 16) + i_2074_]);
				if (i_2076_ != 0) {
				    int i_2077_
					= anIntArray11423[i_2076_ & 0xff];
				    i_2070_ = ((i_2077_ & 0xff00ff) * i_2068_
					       & ~0xff00ff);
				    i_2071_ = ((i_2077_ & 0xff00) * i_2068_
					       & 0xff0000);
				    i_2077_ = (((i_2070_ | i_2071_) >>> 8)
					       + i_1933_);
				    int i_2078_ = is[i_1945_];
				    int i_2079_ = i_2077_ + i_2078_;
				    int i_2080_ = ((i_2077_ & 0xff00ff)
						   + (i_2078_ & 0xff00ff));
				    i_2078_
					= ((i_2080_ & 0x1000100)
					   + (i_2079_ - i_2080_ & 0x10000));
				    is[i_1945_++]
					= (i_2079_ - i_2078_
					   | i_2078_ - (i_2078_ >>> 8));
				} else
				    i_1945_++;
				i_1936_ += i_1941_;
			    }
			    i_1937_ += i_1942_;
			    i_1936_ = i_2072_;
			    i_1945_ += i_1946_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    void method14540(boolean bool, boolean bool_2081_, boolean bool_2082_,
		     int i, int i_2083_, float f, int i_2084_, int i_2085_,
		     int i_2086_, int i_2087_, int i_2088_, int i_2089_,
		     boolean bool_2090_) {
	if (i_2084_ > 0 && i_2085_ > 0 && (bool || bool_2081_)) {
	    int i_2091_ = 0;
	    int i_2092_ = 0;
	    int i_2093_ = anInt9002 + anInt9000 + anInt9004;
	    int i_2094_ = anInt9003 + anInt9001 + anInt9005;
	    int i_2095_ = (i_2093_ << 16) / i_2084_;
	    int i_2096_ = (i_2094_ << 16) / i_2085_;
	    if (anInt9002 > 0) {
		int i_2097_ = ((anInt9002 << 16) + i_2095_ - 1) / i_2095_;
		i += i_2097_;
		i_2091_ += i_2097_ * i_2095_ - (anInt9002 << 16);
	    }
	    if (anInt9003 > 0) {
		int i_2098_ = ((anInt9003 << 16) + i_2096_ - 1) / i_2096_;
		i_2083_ += i_2098_;
		i_2092_ += i_2098_ * i_2096_ - (anInt9003 << 16);
	    }
	    if (anInt9000 < i_2093_)
		i_2084_
		    = ((anInt9000 << 16) - i_2091_ + i_2095_ - 1) / i_2095_;
	    if (anInt9001 < i_2094_)
		i_2085_
		    = ((anInt9001 << 16) - i_2092_ + i_2096_ - 1) / i_2096_;
	    int i_2099_
		= i + i_2083_ * (aClass182_Sub2_9033.anInt9494 * -476035351);
	    int i_2100_ = aClass182_Sub2_9033.anInt9494 * -476035351 - i_2084_;
	    if (i_2083_ + i_2085_ > aClass182_Sub2_9033.anInt9473 * 1920901985)
		i_2085_ -= (i_2083_ + i_2085_
			    - aClass182_Sub2_9033.anInt9473 * 1920901985);
	    if (i_2083_ < aClass182_Sub2_9033.anInt9472 * 1722112305) {
		int i_2101_
		    = aClass182_Sub2_9033.anInt9472 * 1722112305 - i_2083_;
		i_2085_ -= i_2101_;
		i_2099_
		    += i_2101_ * (aClass182_Sub2_9033.anInt9494 * -476035351);
		i_2092_ += i_2096_ * i_2101_;
	    }
	    if (i + i_2084_ > aClass182_Sub2_9033.anInt9499 * -466178451) {
		int i_2102_
		    = i + i_2084_ - aClass182_Sub2_9033.anInt9499 * -466178451;
		i_2084_ -= i_2102_;
		i_2100_ += i_2102_;
	    }
	    if (i < aClass182_Sub2_9033.anInt9470 * 1988019027) {
		int i_2103_ = aClass182_Sub2_9033.anInt9470 * 1988019027 - i;
		i_2084_ -= i_2103_;
		i_2099_ += i_2103_;
		i_2091_ += i_2095_ * i_2103_;
		i_2100_ += i_2103_;
	    }
	    float[] fs = aClass182_Sub2_9033.aFloatArray9469;
	    int[] is = aClass182_Sub2_9033.anIntArray9466;
	    if (i_2088_ == 0) {
		if (i_2086_ == 1) {
		    int i_2104_ = i_2091_;
		    for (int i_2105_ = -i_2085_; i_2105_ < 0; i_2105_++) {
			int i_2106_ = (i_2092_ >> 16) * anInt9000;
			for (int i_2107_ = -i_2084_; i_2107_ < 0; i_2107_++) {
			    if (!bool_2081_ || f < fs[i_2099_]) {
				if (bool)
				    is[i_2099_]
					= (anIntArray11423
					   [((aByteArray11422
					      [(i_2091_ >> 16) + i_2106_])
					     & 0xff)]);
				if (bool_2081_ && bool_2090_)
				    fs[i_2099_] = f;
			    }
			    i_2091_ += i_2095_;
			    i_2099_++;
			}
			i_2092_ += i_2096_;
			i_2091_ = i_2104_;
			i_2099_ += i_2100_;
		    }
		} else if (i_2086_ == 0) {
		    int i_2108_ = (i_2087_ & 0xff0000) >> 16;
		    int i_2109_ = (i_2087_ & 0xff00) >> 8;
		    int i_2110_ = i_2087_ & 0xff;
		    int i_2111_ = i_2091_;
		    for (int i_2112_ = -i_2085_; i_2112_ < 0; i_2112_++) {
			int i_2113_ = (i_2092_ >> 16) * anInt9000;
			for (int i_2114_ = -i_2084_; i_2114_ < 0; i_2114_++) {
			    if (!bool_2081_ || f < fs[i_2099_]) {
				if (bool) {
				    int i_2115_
					= (anIntArray11423
					   [((aByteArray11422
					      [(i_2091_ >> 16) + i_2113_])
					     & 0xff)]);
				    int i_2116_
					= ((i_2115_ & 0xff0000) * i_2108_
					   & ~0xffffff);
				    int i_2117_ = ((i_2115_ & 0xff00) * i_2109_
						   & 0xff0000);
				    int i_2118_
					= (i_2115_ & 0xff) * i_2110_ & 0xff00;
				    is[i_2099_]
					= (i_2116_ | i_2117_ | i_2118_) >>> 8;
				}
				if (bool_2081_ && bool_2090_)
				    fs[i_2099_] = f;
			    }
			    i_2091_ += i_2095_;
			    i_2099_++;
			}
			i_2092_ += i_2096_;
			i_2091_ = i_2111_;
			i_2099_ += i_2100_;
		    }
		} else if (i_2086_ == 3) {
		    int i_2119_ = i_2091_;
		    for (int i_2120_ = -i_2085_; i_2120_ < 0; i_2120_++) {
			int i_2121_ = (i_2092_ >> 16) * anInt9000;
			for (int i_2122_ = -i_2084_; i_2122_ < 0; i_2122_++) {
			    if (!bool_2081_ || f < fs[i_2099_]) {
				if (bool) {
				    byte i_2123_
					= (aByteArray11422
					   [(i_2091_ >> 16) + i_2121_]);
				    int i_2124_
					= (i_2123_ > 0
					   ? anIntArray11423[i_2123_] : 0);
				    int i_2125_ = i_2124_ + i_2087_;
				    int i_2126_ = ((i_2124_ & 0xff00ff)
						   + (i_2087_ & 0xff00ff));
				    int i_2127_
					= ((i_2126_ & 0x1000100)
					   + (i_2125_ - i_2126_ & 0x10000));
				    is[i_2099_]
					= (i_2125_ - i_2127_
					   | i_2127_ - (i_2127_ >>> 8));
				}
				if (bool_2081_ && bool_2090_)
				    fs[i_2099_] = f;
			    }
			    i_2091_ += i_2095_;
			    i_2099_++;
			}
			i_2092_ += i_2096_;
			i_2091_ = i_2119_;
			i_2099_ += i_2100_;
		    }
		} else if (i_2086_ == 2) {
		    int i_2128_ = i_2087_ >>> 24;
		    int i_2129_ = 256 - i_2128_;
		    int i_2130_ = (i_2087_ & 0xff00ff) * i_2129_ & ~0xff00ff;
		    int i_2131_ = (i_2087_ & 0xff00) * i_2129_ & 0xff0000;
		    i_2087_ = (i_2130_ | i_2131_) >>> 8;
		    int i_2132_ = i_2091_;
		    for (int i_2133_ = -i_2085_; i_2133_ < 0; i_2133_++) {
			int i_2134_ = (i_2092_ >> 16) * anInt9000;
			for (int i_2135_ = -i_2084_; i_2135_ < 0; i_2135_++) {
			    if (!bool_2081_ || f < fs[i_2099_]) {
				if (bool) {
				    int i_2136_
					= (anIntArray11423
					   [((aByteArray11422
					      [(i_2091_ >> 16) + i_2134_])
					     & 0xff)]);
				    i_2130_ = ((i_2136_ & 0xff00ff) * i_2128_
					       & ~0xff00ff);
				    i_2131_ = ((i_2136_ & 0xff00) * i_2128_
					       & 0xff0000);
				    is[i_2099_] = (((i_2130_ | i_2131_) >>> 8)
						   + i_2087_);
				}
				if (bool_2081_ && bool_2090_)
				    fs[i_2099_] = f;
			    }
			    i_2091_ += i_2095_;
			    i_2099_++;
			}
			i_2092_ += i_2096_;
			i_2091_ = i_2132_;
			i_2099_ += i_2100_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_2088_ == 1) {
		if (i_2086_ == 1) {
		    int i_2137_ = i_2091_;
		    for (int i_2138_ = -i_2085_; i_2138_ < 0; i_2138_++) {
			int i_2139_ = (i_2092_ >> 16) * anInt9000;
			for (int i_2140_ = -i_2084_; i_2140_ < 0; i_2140_++) {
			    if (!bool_2081_ || f < fs[i_2099_]) {
				int i_2141_ = (aByteArray11422
					       [(i_2091_ >> 16) + i_2139_]);
				if (i_2141_ != 0) {
				    if (bool)
					is[i_2099_]
					    = anIntArray11423[i_2141_ & 0xff];
				    if (bool_2081_ && bool_2090_)
					fs[i_2099_] = f;
				}
			    }
			    i_2091_ += i_2095_;
			    i_2099_++;
			}
			i_2092_ += i_2096_;
			i_2091_ = i_2137_;
			i_2099_ += i_2100_;
		    }
		} else if (i_2086_ == 0) {
		    int i_2142_ = i_2091_;
		    if ((i_2087_ & 0xffffff) == 16777215) {
			int i_2143_ = i_2087_ >>> 24;
			int i_2144_ = 256 - i_2143_;
			for (int i_2145_ = -i_2085_; i_2145_ < 0; i_2145_++) {
			    int i_2146_ = (i_2092_ >> 16) * anInt9000;
			    for (int i_2147_ = -i_2084_; i_2147_ < 0;
				 i_2147_++) {
				if (!bool_2081_ || f < fs[i_2099_]) {
				    int i_2148_
					= (aByteArray11422
					   [(i_2091_ >> 16) + i_2146_]);
				    if (i_2148_ != 0) {
					if (bool) {
					    int i_2149_ = (anIntArray11423
							   [i_2148_ & 0xff]);
					    int i_2150_ = is[i_2099_];
					    is[i_2099_]
						= (((((i_2149_ & 0xff00ff)
						      * i_2143_)
						     + ((i_2150_ & 0xff00ff)
							* i_2144_))
						    & ~0xff00ff)
						   + ((((i_2149_ & 0xff00)
							* i_2143_)
						       + ((i_2150_ & 0xff00)
							  * i_2144_))
						      & 0xff0000)) >> 8;
					}
					if (bool_2081_ && bool_2090_)
					    fs[i_2099_] = f;
				    }
				}
				i_2091_ += i_2095_;
				i_2099_++;
			    }
			    i_2092_ += i_2096_;
			    i_2091_ = i_2142_;
			    i_2099_ += i_2100_;
			}
		    } else {
			int i_2151_ = (i_2087_ & 0xff0000) >> 16;
			int i_2152_ = (i_2087_ & 0xff00) >> 8;
			int i_2153_ = i_2087_ & 0xff;
			int i_2154_ = i_2087_ >>> 24;
			int i_2155_ = 256 - i_2154_;
			for (int i_2156_ = -i_2085_; i_2156_ < 0; i_2156_++) {
			    int i_2157_ = (i_2092_ >> 16) * anInt9000;
			    for (int i_2158_ = -i_2084_; i_2158_ < 0;
				 i_2158_++) {
				if (!bool_2081_ || f < fs[i_2099_]) {
				    int i_2159_
					= (aByteArray11422
					   [(i_2091_ >> 16) + i_2157_]);
				    if (i_2159_ != 0) {
					int i_2160_
					    = anIntArray11423[i_2159_ & 0xff];
					if (i_2154_ != 255) {
					    if (bool) {
						int i_2161_
						    = (((i_2160_ & 0xff0000)
							* i_2151_)
						       & ~0xffffff);
						int i_2162_
						    = (((i_2160_ & 0xff00)
							* i_2152_)
						       & 0xff0000);
						int i_2163_
						    = (((i_2160_ & 0xff)
							* i_2153_)
						       & 0xff00);
						i_2160_ = (i_2161_ | i_2162_
							   | i_2163_) >>> 8;
						int i_2164_ = is[i_2099_];
						is[i_2099_]
						    = (((((i_2160_ & 0xff00ff)
							  * i_2154_)
							 + ((i_2164_
							     & 0xff00ff)
							    * i_2155_))
							& ~0xff00ff)
						       + ((((i_2160_ & 0xff00)
							    * i_2154_)
							   + ((i_2164_
							       & 0xff00)
							      * i_2155_))
							  & 0xff0000)) >> 8;
					    }
					    if (bool_2081_ && bool_2090_)
						fs[i_2099_] = f;
					} else {
					    if (bool) {
						int i_2165_
						    = (((i_2160_ & 0xff0000)
							* i_2151_)
						       & ~0xffffff);
						int i_2166_
						    = (((i_2160_ & 0xff00)
							* i_2152_)
						       & 0xff0000);
						int i_2167_
						    = (((i_2160_ & 0xff)
							* i_2153_)
						       & 0xff00);
						is[i_2099_]
						    = (i_2165_ | i_2166_
						       | i_2167_) >>> 8;
					    }
					    if (bool_2081_ && bool_2090_)
						fs[i_2099_] = f;
					}
				    }
				}
				i_2091_ += i_2095_;
				i_2099_++;
			    }
			    i_2092_ += i_2096_;
			    i_2091_ = i_2142_;
			    i_2099_ += i_2100_;
			}
		    }
		} else if (i_2086_ == 3) {
		    int i_2168_ = i_2091_;
		    int i_2169_ = i_2087_ >>> 24;
		    int i_2170_ = 256 - i_2169_;
		    for (int i_2171_ = -i_2085_; i_2171_ < 0; i_2171_++) {
			int i_2172_ = (i_2092_ >> 16) * anInt9000;
			for (int i_2173_ = -i_2084_; i_2173_ < 0; i_2173_++) {
			    if (!bool_2081_ || f < fs[i_2099_]) {
				if (bool) {
				    byte i_2174_
					= (aByteArray11422
					   [(i_2091_ >> 16) + i_2172_]);
				    int i_2175_
					= (i_2174_ > 0
					   ? anIntArray11423[i_2174_] : 0);
				    int i_2176_ = i_2175_ + i_2087_;
				    int i_2177_ = ((i_2175_ & 0xff00ff)
						   + (i_2087_ & 0xff00ff));
				    int i_2178_
					= ((i_2177_ & 0x1000100)
					   + (i_2176_ - i_2177_ & 0x10000));
				    i_2178_ = (i_2176_ - i_2178_
					       | i_2178_ - (i_2178_ >>> 8));
				    if (i_2175_ == 0 && i_2169_ != 255) {
					i_2175_ = i_2178_;
					i_2178_ = is[i_2099_];
					i_2178_
					    = ((((i_2175_ & 0xff00ff) * i_2169_
						 + ((i_2178_ & 0xff00ff)
						    * i_2170_))
						& ~0xff00ff)
					       + (((i_2175_ & 0xff00) * i_2169_
						   + ((i_2178_ & 0xff00)
						      * i_2170_))
						  & 0xff0000)) >> 8;
				    }
				    is[i_2099_] = i_2178_;
				}
				if (bool_2081_ && bool_2090_)
				    fs[i_2099_] = f;
			    }
			    i_2091_ += i_2095_;
			    i_2099_++;
			}
			i_2092_ += i_2096_;
			i_2091_ = i_2168_;
			i_2099_ += i_2100_;
		    }
		} else if (i_2086_ == 2) {
		    int i_2179_ = i_2087_ >>> 24;
		    int i_2180_ = 256 - i_2179_;
		    int i_2181_ = (i_2087_ & 0xff00ff) * i_2180_ & ~0xff00ff;
		    int i_2182_ = (i_2087_ & 0xff00) * i_2180_ & 0xff0000;
		    i_2087_ = (i_2181_ | i_2182_) >>> 8;
		    int i_2183_ = i_2091_;
		    for (int i_2184_ = -i_2085_; i_2184_ < 0; i_2184_++) {
			int i_2185_ = (i_2092_ >> 16) * anInt9000;
			for (int i_2186_ = -i_2084_; i_2186_ < 0; i_2186_++) {
			    if (!bool_2081_ || f < fs[i_2099_]) {
				int i_2187_ = (aByteArray11422
					       [(i_2091_ >> 16) + i_2185_]);
				if (i_2187_ != 0) {
				    if (bool) {
					int i_2188_
					    = anIntArray11423[i_2187_ & 0xff];
					i_2181_
					    = ((i_2188_ & 0xff00ff) * i_2179_
					       & ~0xff00ff);
					i_2182_ = ((i_2188_ & 0xff00) * i_2179_
						   & 0xff0000);
					is[i_2099_] = ((i_2181_ | i_2182_)
						       >>> 8) + i_2087_;
				    }
				    if (bool_2081_ && bool_2090_)
					fs[i_2099_] = f;
				}
			    }
			    i_2091_ += i_2095_;
			    i_2099_++;
			}
			i_2092_ += i_2096_;
			i_2091_ = i_2183_;
			i_2099_ += i_2100_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_2088_ == 2) {
		if (i_2086_ == 1) {
		    int i_2189_ = i_2091_;
		    for (int i_2190_ = -i_2085_; i_2190_ < 0; i_2190_++) {
			int i_2191_ = (i_2092_ >> 16) * anInt9000;
			for (int i_2192_ = -i_2084_; i_2192_ < 0; i_2192_++) {
			    if (!bool_2081_ || f < fs[i_2099_]) {
				int i_2193_ = (aByteArray11422
					       [(i_2091_ >> 16) + i_2191_]);
				if (i_2193_ != 0) {
				    if (bool) {
					int i_2194_
					    = anIntArray11423[i_2193_ & 0xff];
					int i_2195_ = is[i_2099_];
					int i_2196_ = i_2194_ + i_2195_;
					int i_2197_ = ((i_2194_ & 0xff00ff)
						       + (i_2195_ & 0xff00ff));
					i_2195_ = ((i_2197_ & 0x1000100)
						   + (i_2196_ - i_2197_
						      & 0x10000));
					is[i_2099_]
					    = (i_2196_ - i_2195_
					       | i_2195_ - (i_2195_ >>> 8));
				    }
				    if (bool_2081_ && bool_2090_)
					fs[i_2099_] = f;
				}
			    }
			    i_2091_ += i_2095_;
			    i_2099_++;
			}
			i_2092_ += i_2096_;
			i_2091_ = i_2189_;
			i_2099_ += i_2100_;
		    }
		} else if (i_2086_ == 0) {
		    int i_2198_ = i_2091_;
		    int i_2199_ = (i_2087_ & 0xff0000) >> 16;
		    int i_2200_ = (i_2087_ & 0xff00) >> 8;
		    int i_2201_ = i_2087_ & 0xff;
		    for (int i_2202_ = -i_2085_; i_2202_ < 0; i_2202_++) {
			int i_2203_ = (i_2092_ >> 16) * anInt9000;
			for (int i_2204_ = -i_2084_; i_2204_ < 0; i_2204_++) {
			    if (!bool_2081_ || f < fs[i_2099_]) {
				int i_2205_ = (aByteArray11422
					       [(i_2091_ >> 16) + i_2203_]);
				if (i_2205_ != 0) {
				    if (bool) {
					int i_2206_
					    = anIntArray11423[i_2205_ & 0xff];
					int i_2207_
					    = ((i_2206_ & 0xff0000) * i_2199_
					       & ~0xffffff);
					int i_2208_
					    = ((i_2206_ & 0xff00) * i_2200_
					       & 0xff0000);
					int i_2209_
					    = ((i_2206_ & 0xff) * i_2201_
					       & 0xff00);
					i_2206_ = (i_2207_ | i_2208_
						   | i_2209_) >>> 8;
					int i_2210_ = is[i_2099_];
					int i_2211_ = i_2206_ + i_2210_;
					int i_2212_ = ((i_2206_ & 0xff00ff)
						       + (i_2210_ & 0xff00ff));
					i_2210_ = ((i_2212_ & 0x1000100)
						   + (i_2211_ - i_2212_
						      & 0x10000));
					is[i_2099_]
					    = (i_2211_ - i_2210_
					       | i_2210_ - (i_2210_ >>> 8));
				    }
				    if (bool_2081_ && bool_2090_)
					fs[i_2099_] = f;
				}
			    }
			    i_2091_ += i_2095_;
			    i_2099_++;
			}
			i_2092_ += i_2096_;
			i_2091_ = i_2198_;
			i_2099_ += i_2100_;
		    }
		} else if (i_2086_ == 3) {
		    int i_2213_ = i_2091_;
		    for (int i_2214_ = -i_2085_; i_2214_ < 0; i_2214_++) {
			int i_2215_ = (i_2092_ >> 16) * anInt9000;
			for (int i_2216_ = -i_2084_; i_2216_ < 0; i_2216_++) {
			    if (!bool_2081_ || f < fs[i_2099_]) {
				if (bool) {
				    byte i_2217_
					= (aByteArray11422
					   [(i_2091_ >> 16) + i_2215_]);
				    int i_2218_
					= (i_2217_ > 0
					   ? anIntArray11423[i_2217_] : 0);
				    int i_2219_ = i_2218_ + i_2087_;
				    int i_2220_ = ((i_2218_ & 0xff00ff)
						   + (i_2087_ & 0xff00ff));
				    int i_2221_
					= ((i_2220_ & 0x1000100)
					   + (i_2219_ - i_2220_ & 0x10000));
				    i_2218_ = (i_2219_ - i_2221_
					       | i_2221_ - (i_2221_ >>> 8));
				    i_2221_ = is[i_2099_];
				    i_2219_ = i_2218_ + i_2221_;
				    i_2220_
					= (i_2218_ & 0xff00ff) + (i_2221_
								  & 0xff00ff);
				    i_2221_
					= ((i_2220_ & 0x1000100)
					   + (i_2219_ - i_2220_ & 0x10000));
				    is[i_2099_]
					= (i_2219_ - i_2221_
					   | i_2221_ - (i_2221_ >>> 8));
				}
				if (bool_2081_ && bool_2090_)
				    fs[i_2099_] = f;
			    }
			    i_2091_ += i_2095_;
			    i_2099_++;
			}
			i_2092_ += i_2096_;
			i_2091_ = i_2213_;
			i_2099_ += i_2100_;
		    }
		} else if (i_2086_ == 2) {
		    int i_2222_ = i_2087_ >>> 24;
		    int i_2223_ = 256 - i_2222_;
		    int i_2224_ = (i_2087_ & 0xff00ff) * i_2223_ & ~0xff00ff;
		    int i_2225_ = (i_2087_ & 0xff00) * i_2223_ & 0xff0000;
		    i_2087_ = (i_2224_ | i_2225_) >>> 8;
		    int i_2226_ = i_2091_;
		    for (int i_2227_ = -i_2085_; i_2227_ < 0; i_2227_++) {
			int i_2228_ = (i_2092_ >> 16) * anInt9000;
			for (int i_2229_ = -i_2084_; i_2229_ < 0; i_2229_++) {
			    if (!bool_2081_ || f < fs[i_2099_]) {
				int i_2230_ = (aByteArray11422
					       [(i_2091_ >> 16) + i_2228_]);
				if (i_2230_ != 0) {
				    if (bool) {
					int i_2231_
					    = anIntArray11423[i_2230_ & 0xff];
					i_2224_
					    = ((i_2231_ & 0xff00ff) * i_2222_
					       & ~0xff00ff);
					i_2225_ = ((i_2231_ & 0xff00) * i_2222_
						   & 0xff0000);
					i_2231_ = (((i_2224_ | i_2225_) >>> 8)
						   + i_2087_);
					int i_2232_ = is[i_2099_];
					int i_2233_ = i_2231_ + i_2232_;
					int i_2234_ = ((i_2231_ & 0xff00ff)
						       + (i_2232_ & 0xff00ff));
					i_2232_ = ((i_2234_ & 0x1000100)
						   + (i_2233_ - i_2234_
						      & 0x10000));
					is[i_2099_]
					    = (i_2233_ - i_2232_
					       | i_2232_ - (i_2232_ >>> 8));
				    }
				    if (bool_2081_ && bool_2090_)
					fs[i_2099_] = f;
				}
			    }
			    i_2091_ += i_2095_;
			    i_2099_++;
			}
			i_2092_ += i_2096_;
			i_2091_ = i_2226_;
			i_2099_ += i_2100_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    public void method2479(int i, int i_2235_, int i_2236_, int i_2237_,
			   int i_2238_) {
	if (aClass182_Sub2_9033.method15226())
	    throw new IllegalStateException();
	int[] is = aClass182_Sub2_9033.anIntArray9466;
	if (is != null) {
	    int i_2239_ = aClass182_Sub2_9033.anInt9494 * -476035351;
	    i += anInt9002;
	    i_2235_ += anInt9003;
	    int i_2240_ = i_2235_ * i_2239_ + i;
	    int i_2241_ = 0;
	    int i_2242_ = anInt9001;
	    int i_2243_ = anInt9000;
	    int i_2244_ = i_2239_ - i_2243_;
	    int i_2245_ = 0;
	    if (i_2235_ < aClass182_Sub2_9033.anInt9472 * 1722112305) {
		int i_2246_
		    = aClass182_Sub2_9033.anInt9472 * 1722112305 - i_2235_;
		i_2242_ -= i_2246_;
		i_2235_ = aClass182_Sub2_9033.anInt9472 * 1722112305;
		i_2241_ += i_2246_ * i_2243_;
		i_2240_ += i_2246_ * i_2239_;
	    }
	    if (i_2235_ + i_2242_ > aClass182_Sub2_9033.anInt9473 * 1920901985)
		i_2242_ -= (i_2235_ + i_2242_
			    - aClass182_Sub2_9033.anInt9473 * 1920901985);
	    if (i < aClass182_Sub2_9033.anInt9470 * 1988019027) {
		int i_2247_ = aClass182_Sub2_9033.anInt9470 * 1988019027 - i;
		i_2243_ -= i_2247_;
		i = aClass182_Sub2_9033.anInt9470 * 1988019027;
		i_2241_ += i_2247_;
		i_2240_ += i_2247_;
		i_2245_ += i_2247_;
		i_2244_ += i_2247_;
	    }
	    if (i + i_2243_ > aClass182_Sub2_9033.anInt9499 * -466178451) {
		int i_2248_
		    = i + i_2243_ - aClass182_Sub2_9033.anInt9499 * -466178451;
		i_2243_ -= i_2248_;
		i_2245_ += i_2248_;
		i_2244_ += i_2248_;
	    }
	    if (i_2243_ > 0 && i_2242_ > 0) {
		if (i_2238_ == 0) {
		    if (i_2236_ == 1) {
			for (int i_2249_ = -i_2242_; i_2249_ < 0; i_2249_++) {
			    int i_2250_ = i_2240_ + i_2243_ - 3;
			    while (i_2240_ < i_2250_) {
				is[i_2240_++]
				    = (anIntArray11423
				       [aByteArray11422[i_2241_++] & 0xff]);
				is[i_2240_++]
				    = (anIntArray11423
				       [aByteArray11422[i_2241_++] & 0xff]);
				is[i_2240_++]
				    = (anIntArray11423
				       [aByteArray11422[i_2241_++] & 0xff]);
				is[i_2240_++]
				    = (anIntArray11423
				       [aByteArray11422[i_2241_++] & 0xff]);
			    }
			    i_2250_ += 3;
			    while (i_2240_ < i_2250_)
				is[i_2240_++]
				    = (anIntArray11423
				       [aByteArray11422[i_2241_++] & 0xff]);
			    i_2240_ += i_2244_;
			    i_2241_ += i_2245_;
			}
		    } else if (i_2236_ == 0) {
			int i_2251_ = (i_2237_ & 0xff0000) >> 16;
			int i_2252_ = (i_2237_ & 0xff00) >> 8;
			int i_2253_ = i_2237_ & 0xff;
			for (int i_2254_ = -i_2242_; i_2254_ < 0; i_2254_++) {
			    for (int i_2255_ = -i_2243_; i_2255_ < 0;
				 i_2255_++) {
				int i_2256_
				    = (anIntArray11423
				       [aByteArray11422[i_2241_++] & 0xff]);
				int i_2257_ = ((i_2256_ & 0xff0000) * i_2251_
					       & ~0xffffff);
				int i_2258_
				    = (i_2256_ & 0xff00) * i_2252_ & 0xff0000;
				int i_2259_
				    = (i_2256_ & 0xff) * i_2253_ & 0xff00;
				is[i_2240_++]
				    = (i_2257_ | i_2258_ | i_2259_) >>> 8;
			    }
			    i_2240_ += i_2244_;
			    i_2241_ += i_2245_;
			}
		    } else if (i_2236_ == 3) {
			for (int i_2260_ = -i_2242_; i_2260_ < 0; i_2260_++) {
			    for (int i_2261_ = -i_2243_; i_2261_ < 0;
				 i_2261_++) {
				int i_2262_
				    = (anIntArray11423
				       [aByteArray11422[i_2241_++] & 0xff]);
				int i_2263_ = i_2262_ + i_2237_;
				int i_2264_ = ((i_2262_ & 0xff00ff)
					       + (i_2237_ & 0xff00ff));
				int i_2265_
				    = ((i_2264_ & 0x1000100)
				       + (i_2263_ - i_2264_ & 0x10000));
				is[i_2240_++]
				    = i_2263_ - i_2265_ | i_2265_ - (i_2265_
								     >>> 8);
			    }
			    i_2240_ += i_2244_;
			    i_2241_ += i_2245_;
			}
		    } else if (i_2236_ == 2) {
			int i_2266_ = i_2237_ >>> 24;
			int i_2267_ = 256 - i_2266_;
			int i_2268_
			    = (i_2237_ & 0xff00ff) * i_2267_ & ~0xff00ff;
			int i_2269_ = (i_2237_ & 0xff00) * i_2267_ & 0xff0000;
			i_2237_ = (i_2268_ | i_2269_) >>> 8;
			for (int i_2270_ = -i_2242_; i_2270_ < 0; i_2270_++) {
			    for (int i_2271_ = -i_2243_; i_2271_ < 0;
				 i_2271_++) {
				int i_2272_
				    = (anIntArray11423
				       [aByteArray11422[i_2241_++] & 0xff]);
				i_2268_ = ((i_2272_ & 0xff00ff) * i_2266_
					   & ~0xff00ff);
				i_2269_
				    = (i_2272_ & 0xff00) * i_2266_ & 0xff0000;
				is[i_2240_++]
				    = ((i_2268_ | i_2269_) >>> 8) + i_2237_;
			    }
			    i_2240_ += i_2244_;
			    i_2241_ += i_2245_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_2238_ == 1) {
		    if (i_2236_ == 1) {
			for (int i_2273_ = -i_2242_; i_2273_ < 0; i_2273_++) {
			    for (int i_2274_ = -i_2243_; i_2274_ < 0;
				 i_2274_++) {
				int i_2275_ = aByteArray11422[i_2241_++];
				if (i_2275_ != 0) {
				    int i_2276_
					= (anIntArray11423[i_2275_ & 0xff]
					   | ~0xffffff);
				    int i_2277_ = 255;
				    int i_2278_ = 0;
				    int i_2279_ = is[i_2240_];
				    is[i_2240_++]
					= (((((i_2276_ & 0xff00ff) * i_2277_
					      + (i_2279_ & 0xff00ff) * i_2278_)
					     & ~0xff00ff)
					    >> 8)
					   + (((((i_2276_ & ~0xff00ff) >>> 8)
						* i_2277_)
					       + (((i_2279_ & ~0xff00ff) >>> 8)
						  * i_2278_))
					      & ~0xff00ff));
				} else
				    i_2240_++;
			    }
			    i_2240_ += i_2244_;
			    i_2241_ += i_2245_;
			}
		    } else if (i_2236_ == 0) {
			if ((i_2237_ & 0xffffff) == 16777215) {
			    int i_2280_ = i_2237_ >>> 24;
			    int i_2281_ = 256 - i_2280_;
			    for (int i_2282_ = -i_2242_; i_2282_ < 0;
				 i_2282_++) {
				for (int i_2283_ = -i_2243_; i_2283_ < 0;
				     i_2283_++) {
				    int i_2284_ = aByteArray11422[i_2241_++];
				    if (i_2284_ != 0) {
					int i_2285_
					    = anIntArray11423[i_2284_ & 0xff];
					int i_2286_ = is[i_2240_];
					is[i_2240_++]
					    = ((((i_2285_ & 0xff00ff) * i_2280_
						 + ((i_2286_ & 0xff00ff)
						    * i_2281_))
						& ~0xff00ff)
					       + (((i_2285_ & 0xff00) * i_2280_
						   + ((i_2286_ & 0xff00)
						      * i_2281_))
						  & 0xff0000)) >> 8;
				    } else
					i_2240_++;
				}
				i_2240_ += i_2244_;
				i_2241_ += i_2245_;
			    }
			} else {
			    int i_2287_ = (i_2237_ & 0xff0000) >> 16;
			    int i_2288_ = (i_2237_ & 0xff00) >> 8;
			    int i_2289_ = i_2237_ & 0xff;
			    int i_2290_ = i_2237_ >>> 24;
			    int i_2291_ = 256 - i_2290_;
			    for (int i_2292_ = -i_2242_; i_2292_ < 0;
				 i_2292_++) {
				for (int i_2293_ = -i_2243_; i_2293_ < 0;
				     i_2293_++) {
				    int i_2294_ = aByteArray11422[i_2241_++];
				    if (i_2294_ != 0) {
					int i_2295_
					    = anIntArray11423[i_2294_ & 0xff];
					if (i_2290_ != 255) {
					    int i_2296_
						= (((i_2295_ & 0xff0000)
						    * i_2287_)
						   & ~0xffffff);
					    int i_2297_
						= ((i_2295_ & 0xff00) * i_2288_
						   & 0xff0000);
					    int i_2298_
						= ((i_2295_ & 0xff) * i_2289_
						   & 0xff00);
					    i_2295_ = (i_2296_ | i_2297_
						       | i_2298_) >>> 8;
					    int i_2299_ = is[i_2240_];
					    is[i_2240_++]
						= (((((i_2295_ & 0xff00ff)
						      * i_2290_)
						     + ((i_2299_ & 0xff00ff)
							* i_2291_))
						    & ~0xff00ff)
						   + ((((i_2295_ & 0xff00)
							* i_2290_)
						       + ((i_2299_ & 0xff00)
							  * i_2291_))
						      & 0xff0000)) >> 8;
					} else {
					    int i_2300_
						= (((i_2295_ & 0xff0000)
						    * i_2287_)
						   & ~0xffffff);
					    int i_2301_
						= ((i_2295_ & 0xff00) * i_2288_
						   & 0xff0000);
					    int i_2302_
						= ((i_2295_ & 0xff) * i_2289_
						   & 0xff00);
					    is[i_2240_++] = (i_2300_ | i_2301_
							     | i_2302_) >>> 8;
					}
				    } else
					i_2240_++;
				}
				i_2240_ += i_2244_;
				i_2241_ += i_2245_;
			    }
			}
		    } else if (i_2236_ == 3) {
			int i_2303_ = i_2237_ >>> 24;
			int i_2304_ = 256 - i_2303_;
			for (int i_2305_ = -i_2242_; i_2305_ < 0; i_2305_++) {
			    for (int i_2306_ = -i_2243_; i_2306_ < 0;
				 i_2306_++) {
				byte i_2307_ = aByteArray11422[i_2241_++];
				int i_2308_ = (i_2307_ > 0
					       ? anIntArray11423[i_2307_] : 0);
				int i_2309_ = i_2308_ + i_2237_;
				int i_2310_ = ((i_2308_ & 0xff00ff)
					       + (i_2237_ & 0xff00ff));
				int i_2311_
				    = ((i_2310_ & 0x1000100)
				       + (i_2309_ - i_2310_ & 0x10000));
				i_2311_
				    = i_2309_ - i_2311_ | i_2311_ - (i_2311_
								     >>> 8);
				if (i_2308_ == 0 && i_2303_ != 255) {
				    i_2308_ = i_2311_;
				    i_2311_ = is[i_2240_];
				    i_2311_
					= ((((i_2308_ & 0xff00ff) * i_2303_
					     + (i_2311_ & 0xff00ff) * i_2304_)
					    & ~0xff00ff)
					   + (((i_2308_ & 0xff00) * i_2303_
					       + (i_2311_ & 0xff00) * i_2304_)
					      & 0xff0000)) >> 8;
				}
				is[i_2240_++] = i_2311_;
			    }
			    i_2240_ += i_2244_;
			    i_2241_ += i_2245_;
			}
		    } else if (i_2236_ == 2) {
			int i_2312_ = i_2237_ >>> 24;
			int i_2313_ = 256 - i_2312_;
			int i_2314_
			    = (i_2237_ & 0xff00ff) * i_2313_ & ~0xff00ff;
			int i_2315_ = (i_2237_ & 0xff00) * i_2313_ & 0xff0000;
			i_2237_ = (i_2314_ | i_2315_) >>> 8;
			for (int i_2316_ = -i_2242_; i_2316_ < 0; i_2316_++) {
			    for (int i_2317_ = -i_2243_; i_2317_ < 0;
				 i_2317_++) {
				int i_2318_ = aByteArray11422[i_2241_++];
				if (i_2318_ != 0) {
				    int i_2319_
					= anIntArray11423[i_2318_ & 0xff];
				    i_2314_ = ((i_2319_ & 0xff00ff) * i_2312_
					       & ~0xff00ff);
				    i_2315_ = ((i_2319_ & 0xff00) * i_2312_
					       & 0xff0000);
				    is[i_2240_++] = ((i_2314_ | i_2315_)
						     >>> 8) + i_2237_;
				} else
				    i_2240_++;
			    }
			    i_2240_ += i_2244_;
			    i_2241_ += i_2245_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_2238_ == 2) {
		    if (i_2236_ == 1) {
			for (int i_2320_ = -i_2242_; i_2320_ < 0; i_2320_++) {
			    for (int i_2321_ = -i_2243_; i_2321_ < 0;
				 i_2321_++) {
				int i_2322_ = aByteArray11422[i_2241_++];
				if (i_2322_ != 0) {
				    int i_2323_
					= anIntArray11423[i_2322_ & 0xff];
				    int i_2324_ = is[i_2240_];
				    int i_2325_ = i_2323_ + i_2324_;
				    int i_2326_ = ((i_2323_ & 0xff00ff)
						   + (i_2324_ & 0xff00ff));
				    i_2324_
					= ((i_2326_ & 0x1000100)
					   + (i_2325_ - i_2326_ & 0x10000));
				    is[i_2240_++]
					= (i_2325_ - i_2324_
					   | i_2324_ - (i_2324_ >>> 8));
				} else
				    i_2240_++;
			    }
			    i_2240_ += i_2244_;
			    i_2241_ += i_2245_;
			}
		    } else if (i_2236_ == 0) {
			int i_2327_ = (i_2237_ & 0xff0000) >> 16;
			int i_2328_ = (i_2237_ & 0xff00) >> 8;
			int i_2329_ = i_2237_ & 0xff;
			for (int i_2330_ = -i_2242_; i_2330_ < 0; i_2330_++) {
			    for (int i_2331_ = -i_2243_; i_2331_ < 0;
				 i_2331_++) {
				int i_2332_ = aByteArray11422[i_2241_++];
				if (i_2332_ != 0) {
				    int i_2333_
					= anIntArray11423[i_2332_ & 0xff];
				    int i_2334_
					= ((i_2333_ & 0xff0000) * i_2327_
					   & ~0xffffff);
				    int i_2335_ = ((i_2333_ & 0xff00) * i_2328_
						   & 0xff0000);
				    int i_2336_
					= (i_2333_ & 0xff) * i_2329_ & 0xff00;
				    i_2333_
					= (i_2334_ | i_2335_ | i_2336_) >>> 8;
				    int i_2337_ = is[i_2240_];
				    int i_2338_ = i_2333_ + i_2337_;
				    int i_2339_ = ((i_2333_ & 0xff00ff)
						   + (i_2337_ & 0xff00ff));
				    i_2337_
					= ((i_2339_ & 0x1000100)
					   + (i_2338_ - i_2339_ & 0x10000));
				    is[i_2240_++]
					= (i_2338_ - i_2337_
					   | i_2337_ - (i_2337_ >>> 8));
				} else
				    i_2240_++;
			    }
			    i_2240_ += i_2244_;
			    i_2241_ += i_2245_;
			}
		    } else if (i_2236_ == 3) {
			for (int i_2340_ = -i_2242_; i_2340_ < 0; i_2340_++) {
			    for (int i_2341_ = -i_2243_; i_2341_ < 0;
				 i_2341_++) {
				byte i_2342_ = aByteArray11422[i_2241_++];
				int i_2343_ = (i_2342_ > 0
					       ? anIntArray11423[i_2342_] : 0);
				int i_2344_ = i_2343_ + i_2237_;
				int i_2345_ = ((i_2343_ & 0xff00ff)
					       + (i_2237_ & 0xff00ff));
				int i_2346_
				    = ((i_2345_ & 0x1000100)
				       + (i_2344_ - i_2345_ & 0x10000));
				i_2343_
				    = i_2344_ - i_2346_ | i_2346_ - (i_2346_
								     >>> 8);
				i_2346_ = is[i_2240_];
				i_2344_ = i_2343_ + i_2346_;
				i_2345_ = (i_2343_ & 0xff00ff) + (i_2346_
								  & 0xff00ff);
				i_2346_ = ((i_2345_ & 0x1000100)
					   + (i_2344_ - i_2345_ & 0x10000));
				is[i_2240_++]
				    = i_2344_ - i_2346_ | i_2346_ - (i_2346_
								     >>> 8);
			    }
			    i_2240_ += i_2244_;
			    i_2241_ += i_2245_;
			}
		    } else if (i_2236_ == 2) {
			int i_2347_ = i_2237_ >>> 24;
			int i_2348_ = 256 - i_2347_;
			int i_2349_
			    = (i_2237_ & 0xff00ff) * i_2348_ & ~0xff00ff;
			int i_2350_ = (i_2237_ & 0xff00) * i_2348_ & 0xff0000;
			i_2237_ = (i_2349_ | i_2350_) >>> 8;
			for (int i_2351_ = -i_2242_; i_2351_ < 0; i_2351_++) {
			    for (int i_2352_ = -i_2243_; i_2352_ < 0;
				 i_2352_++) {
				int i_2353_ = aByteArray11422[i_2241_++];
				if (i_2353_ != 0) {
				    int i_2354_
					= anIntArray11423[i_2353_ & 0xff];
				    i_2349_ = ((i_2354_ & 0xff00ff) * i_2347_
					       & ~0xff00ff);
				    i_2350_ = ((i_2354_ & 0xff00) * i_2347_
					       & 0xff0000);
				    i_2354_ = (((i_2349_ | i_2350_) >>> 8)
					       + i_2237_);
				    int i_2355_ = is[i_2240_];
				    int i_2356_ = i_2354_ + i_2355_;
				    int i_2357_ = ((i_2354_ & 0xff00ff)
						   + (i_2355_ & 0xff00ff));
				    i_2355_
					= ((i_2357_ & 0x1000100)
					   + (i_2356_ - i_2357_ & 0x10000));
				    is[i_2240_++]
					= (i_2356_ - i_2355_
					   | i_2355_ - (i_2355_ >>> 8));
				} else
				    i_2240_++;
			    }
			    i_2240_ += i_2244_;
			    i_2241_ += i_2245_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    void method2508(int i, int i_2358_, int i_2359_, int i_2360_, int i_2361_,
		    int i_2362_, int i_2363_, int i_2364_) {
	if (aClass182_Sub2_9033.method15226())
	    throw new IllegalStateException();
	if (i_2359_ > 0 && i_2360_ > 0) {
	    int[] is = aClass182_Sub2_9033.anIntArray9466;
	    if (is != null) {
		int i_2365_ = 0;
		int i_2366_ = 0;
		int i_2367_ = aClass182_Sub2_9033.anInt9494 * -476035351;
		int i_2368_ = anInt9002 + anInt9000 + anInt9004;
		int i_2369_ = anInt9003 + anInt9001 + anInt9005;
		int i_2370_ = (i_2368_ << 16) / i_2359_;
		int i_2371_ = (i_2369_ << 16) / i_2360_;
		if (anInt9002 > 0) {
		    int i_2372_ = ((anInt9002 << 16) + i_2370_ - 1) / i_2370_;
		    i += i_2372_;
		    i_2365_ += i_2372_ * i_2370_ - (anInt9002 << 16);
		}
		if (anInt9003 > 0) {
		    int i_2373_ = ((anInt9003 << 16) + i_2371_ - 1) / i_2371_;
		    i_2358_ += i_2373_;
		    i_2366_ += i_2373_ * i_2371_ - (anInt9003 << 16);
		}
		if (anInt9000 < i_2368_)
		    i_2359_ = (((anInt9000 << 16) - i_2365_ + i_2370_ - 1)
			       / i_2370_);
		if (anInt9001 < i_2369_)
		    i_2360_ = (((anInt9001 << 16) - i_2366_ + i_2371_ - 1)
			       / i_2371_);
		int i_2374_ = i + i_2358_ * i_2367_;
		int i_2375_ = i_2367_ - i_2359_;
		if (i_2358_ + i_2360_
		    > aClass182_Sub2_9033.anInt9473 * 1920901985)
		    i_2360_ -= (i_2358_ + i_2360_
				- aClass182_Sub2_9033.anInt9473 * 1920901985);
		if (i_2358_ < aClass182_Sub2_9033.anInt9472 * 1722112305) {
		    int i_2376_
			= aClass182_Sub2_9033.anInt9472 * 1722112305 - i_2358_;
		    i_2360_ -= i_2376_;
		    i_2374_ += i_2376_ * i_2367_;
		    i_2366_ += i_2371_ * i_2376_;
		}
		if (i + i_2359_ > aClass182_Sub2_9033.anInt9499 * -466178451) {
		    int i_2377_
			= (i + i_2359_
			   - aClass182_Sub2_9033.anInt9499 * -466178451);
		    i_2359_ -= i_2377_;
		    i_2375_ += i_2377_;
		}
		if (i < aClass182_Sub2_9033.anInt9470 * 1988019027) {
		    int i_2378_
			= aClass182_Sub2_9033.anInt9470 * 1988019027 - i;
		    i_2359_ -= i_2378_;
		    i_2374_ += i_2378_;
		    i_2365_ += i_2370_ * i_2378_;
		    i_2375_ += i_2378_;
		}
		if (i_2363_ == 0) {
		    if (i_2361_ == 1) {
			int i_2379_ = i_2365_;
			for (int i_2380_ = -i_2360_; i_2380_ < 0; i_2380_++) {
			    int i_2381_ = (i_2366_ >> 16) * anInt9000;
			    for (int i_2382_ = -i_2359_; i_2382_ < 0;
				 i_2382_++) {
				is[i_2374_++]
				    = (anIntArray11423
				       [(aByteArray11422
					 [(i_2365_ >> 16) + i_2381_]) & 0xff]);
				i_2365_ += i_2370_;
			    }
			    i_2366_ += i_2371_;
			    i_2365_ = i_2379_;
			    i_2374_ += i_2375_;
			}
		    } else if (i_2361_ == 0) {
			int i_2383_ = (i_2362_ & 0xff0000) >> 16;
			int i_2384_ = (i_2362_ & 0xff00) >> 8;
			int i_2385_ = i_2362_ & 0xff;
			int i_2386_ = i_2365_;
			for (int i_2387_ = -i_2360_; i_2387_ < 0; i_2387_++) {
			    int i_2388_ = (i_2366_ >> 16) * anInt9000;
			    for (int i_2389_ = -i_2359_; i_2389_ < 0;
				 i_2389_++) {
				int i_2390_
				    = (anIntArray11423
				       [(aByteArray11422
					 [(i_2365_ >> 16) + i_2388_]) & 0xff]);
				int i_2391_ = ((i_2390_ & 0xff0000) * i_2383_
					       & ~0xffffff);
				int i_2392_
				    = (i_2390_ & 0xff00) * i_2384_ & 0xff0000;
				int i_2393_
				    = (i_2390_ & 0xff) * i_2385_ & 0xff00;
				is[i_2374_++]
				    = (i_2391_ | i_2392_ | i_2393_) >>> 8;
				i_2365_ += i_2370_;
			    }
			    i_2366_ += i_2371_;
			    i_2365_ = i_2386_;
			    i_2374_ += i_2375_;
			}
		    } else if (i_2361_ == 3) {
			int i_2394_ = i_2365_;
			for (int i_2395_ = -i_2360_; i_2395_ < 0; i_2395_++) {
			    int i_2396_ = (i_2366_ >> 16) * anInt9000;
			    for (int i_2397_ = -i_2359_; i_2397_ < 0;
				 i_2397_++) {
				byte i_2398_ = (aByteArray11422
						[(i_2365_ >> 16) + i_2396_]);
				int i_2399_ = (i_2398_ > 0
					       ? anIntArray11423[i_2398_] : 0);
				int i_2400_ = i_2399_ + i_2362_;
				int i_2401_ = ((i_2399_ & 0xff00ff)
					       + (i_2362_ & 0xff00ff));
				int i_2402_
				    = ((i_2401_ & 0x1000100)
				       + (i_2400_ - i_2401_ & 0x10000));
				is[i_2374_++]
				    = i_2400_ - i_2402_ | i_2402_ - (i_2402_
								     >>> 8);
				i_2365_ += i_2370_;
			    }
			    i_2366_ += i_2371_;
			    i_2365_ = i_2394_;
			    i_2374_ += i_2375_;
			}
		    } else if (i_2361_ == 2) {
			int i_2403_ = i_2362_ >>> 24;
			int i_2404_ = 256 - i_2403_;
			int i_2405_
			    = (i_2362_ & 0xff00ff) * i_2404_ & ~0xff00ff;
			int i_2406_ = (i_2362_ & 0xff00) * i_2404_ & 0xff0000;
			i_2362_ = (i_2405_ | i_2406_) >>> 8;
			int i_2407_ = i_2365_;
			for (int i_2408_ = -i_2360_; i_2408_ < 0; i_2408_++) {
			    int i_2409_ = (i_2366_ >> 16) * anInt9000;
			    for (int i_2410_ = -i_2359_; i_2410_ < 0;
				 i_2410_++) {
				int i_2411_
				    = (anIntArray11423
				       [(aByteArray11422
					 [(i_2365_ >> 16) + i_2409_]) & 0xff]);
				i_2405_ = ((i_2411_ & 0xff00ff) * i_2403_
					   & ~0xff00ff);
				i_2406_
				    = (i_2411_ & 0xff00) * i_2403_ & 0xff0000;
				is[i_2374_++]
				    = ((i_2405_ | i_2406_) >>> 8) + i_2362_;
				i_2365_ += i_2370_;
			    }
			    i_2366_ += i_2371_;
			    i_2365_ = i_2407_;
			    i_2374_ += i_2375_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_2363_ == 1) {
		    if (i_2361_ == 1) {
			int i_2412_ = i_2365_;
			for (int i_2413_ = -i_2360_; i_2413_ < 0; i_2413_++) {
			    int i_2414_ = (i_2366_ >> 16) * anInt9000;
			    for (int i_2415_ = -i_2359_; i_2415_ < 0;
				 i_2415_++) {
				int i_2416_ = (aByteArray11422
					       [(i_2365_ >> 16) + i_2414_]);
				if (i_2416_ != 0)
				    is[i_2374_++]
					= anIntArray11423[i_2416_ & 0xff];
				else
				    i_2374_++;
				i_2365_ += i_2370_;
			    }
			    i_2366_ += i_2371_;
			    i_2365_ = i_2412_;
			    i_2374_ += i_2375_;
			}
		    } else if (i_2361_ == 0) {
			int i_2417_ = i_2365_;
			if ((i_2362_ & 0xffffff) == 16777215) {
			    int i_2418_ = i_2362_ >>> 24;
			    int i_2419_ = 256 - i_2418_;
			    for (int i_2420_ = -i_2360_; i_2420_ < 0;
				 i_2420_++) {
				int i_2421_ = (i_2366_ >> 16) * anInt9000;
				for (int i_2422_ = -i_2359_; i_2422_ < 0;
				     i_2422_++) {
				    int i_2423_
					= (aByteArray11422
					   [(i_2365_ >> 16) + i_2421_]);
				    if (i_2423_ != 0) {
					int i_2424_
					    = anIntArray11423[i_2423_ & 0xff];
					int i_2425_ = is[i_2374_];
					is[i_2374_++]
					    = ((((i_2424_ & 0xff00ff) * i_2418_
						 + ((i_2425_ & 0xff00ff)
						    * i_2419_))
						& ~0xff00ff)
					       + (((i_2424_ & 0xff00) * i_2418_
						   + ((i_2425_ & 0xff00)
						      * i_2419_))
						  & 0xff0000)) >> 8;
				    } else
					i_2374_++;
				    i_2365_ += i_2370_;
				}
				i_2366_ += i_2371_;
				i_2365_ = i_2417_;
				i_2374_ += i_2375_;
			    }
			} else {
			    int i_2426_ = (i_2362_ & 0xff0000) >> 16;
			    int i_2427_ = (i_2362_ & 0xff00) >> 8;
			    int i_2428_ = i_2362_ & 0xff;
			    int i_2429_ = i_2362_ >>> 24;
			    int i_2430_ = 256 - i_2429_;
			    for (int i_2431_ = -i_2360_; i_2431_ < 0;
				 i_2431_++) {
				int i_2432_ = (i_2366_ >> 16) * anInt9000;
				for (int i_2433_ = -i_2359_; i_2433_ < 0;
				     i_2433_++) {
				    int i_2434_
					= (aByteArray11422
					   [(i_2365_ >> 16) + i_2432_]);
				    if (i_2434_ != 0) {
					int i_2435_
					    = anIntArray11423[i_2434_ & 0xff];
					if (i_2429_ != 255) {
					    int i_2436_
						= (((i_2435_ & 0xff0000)
						    * i_2426_)
						   & ~0xffffff);
					    int i_2437_
						= ((i_2435_ & 0xff00) * i_2427_
						   & 0xff0000);
					    int i_2438_
						= ((i_2435_ & 0xff) * i_2428_
						   & 0xff00);
					    i_2435_ = (i_2436_ | i_2437_
						       | i_2438_) >>> 8;
					    int i_2439_ = is[i_2374_];
					    is[i_2374_++]
						= (((((i_2435_ & 0xff00ff)
						      * i_2429_)
						     + ((i_2439_ & 0xff00ff)
							* i_2430_))
						    & ~0xff00ff)
						   + ((((i_2435_ & 0xff00)
							* i_2429_)
						       + ((i_2439_ & 0xff00)
							  * i_2430_))
						      & 0xff0000)) >> 8;
					} else {
					    int i_2440_
						= (((i_2435_ & 0xff0000)
						    * i_2426_)
						   & ~0xffffff);
					    int i_2441_
						= ((i_2435_ & 0xff00) * i_2427_
						   & 0xff0000);
					    int i_2442_
						= ((i_2435_ & 0xff) * i_2428_
						   & 0xff00);
					    is[i_2374_++] = (i_2440_ | i_2441_
							     | i_2442_) >>> 8;
					}
				    } else
					i_2374_++;
				    i_2365_ += i_2370_;
				}
				i_2366_ += i_2371_;
				i_2365_ = i_2417_;
				i_2374_ += i_2375_;
			    }
			}
		    } else if (i_2361_ == 3) {
			int i_2443_ = i_2365_;
			int i_2444_ = i_2362_ >>> 24;
			int i_2445_ = 256 - i_2444_;
			for (int i_2446_ = -i_2360_; i_2446_ < 0; i_2446_++) {
			    int i_2447_ = (i_2366_ >> 16) * anInt9000;
			    for (int i_2448_ = -i_2359_; i_2448_ < 0;
				 i_2448_++) {
				byte i_2449_ = (aByteArray11422
						[(i_2365_ >> 16) + i_2447_]);
				int i_2450_ = (i_2449_ > 0
					       ? anIntArray11423[i_2449_] : 0);
				int i_2451_ = i_2450_ + i_2362_;
				int i_2452_ = ((i_2450_ & 0xff00ff)
					       + (i_2362_ & 0xff00ff));
				int i_2453_
				    = ((i_2452_ & 0x1000100)
				       + (i_2451_ - i_2452_ & 0x10000));
				i_2453_
				    = i_2451_ - i_2453_ | i_2453_ - (i_2453_
								     >>> 8);
				if (i_2450_ == 0 && i_2444_ != 255) {
				    i_2450_ = i_2453_;
				    i_2453_ = is[i_2374_];
				    i_2453_
					= ((((i_2450_ & 0xff00ff) * i_2444_
					     + (i_2453_ & 0xff00ff) * i_2445_)
					    & ~0xff00ff)
					   + (((i_2450_ & 0xff00) * i_2444_
					       + (i_2453_ & 0xff00) * i_2445_)
					      & 0xff0000)) >> 8;
				}
				is[i_2374_++] = i_2453_;
				i_2365_ += i_2370_;
			    }
			    i_2366_ += i_2371_;
			    i_2365_ = i_2443_;
			    i_2374_ += i_2375_;
			}
		    } else if (i_2361_ == 2) {
			int i_2454_ = i_2362_ >>> 24;
			int i_2455_ = 256 - i_2454_;
			int i_2456_
			    = (i_2362_ & 0xff00ff) * i_2455_ & ~0xff00ff;
			int i_2457_ = (i_2362_ & 0xff00) * i_2455_ & 0xff0000;
			i_2362_ = (i_2456_ | i_2457_) >>> 8;
			int i_2458_ = i_2365_;
			for (int i_2459_ = -i_2360_; i_2459_ < 0; i_2459_++) {
			    int i_2460_ = (i_2366_ >> 16) * anInt9000;
			    for (int i_2461_ = -i_2359_; i_2461_ < 0;
				 i_2461_++) {
				int i_2462_ = (aByteArray11422
					       [(i_2365_ >> 16) + i_2460_]);
				if (i_2462_ != 0) {
				    int i_2463_
					= anIntArray11423[i_2462_ & 0xff];
				    i_2456_ = ((i_2463_ & 0xff00ff) * i_2454_
					       & ~0xff00ff);
				    i_2457_ = ((i_2463_ & 0xff00) * i_2454_
					       & 0xff0000);
				    is[i_2374_++] = ((i_2456_ | i_2457_)
						     >>> 8) + i_2362_;
				} else
				    i_2374_++;
				i_2365_ += i_2370_;
			    }
			    i_2366_ += i_2371_;
			    i_2365_ = i_2458_;
			    i_2374_ += i_2375_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_2363_ == 2) {
		    if (i_2361_ == 1) {
			int i_2464_ = i_2365_;
			for (int i_2465_ = -i_2360_; i_2465_ < 0; i_2465_++) {
			    int i_2466_ = (i_2366_ >> 16) * anInt9000;
			    for (int i_2467_ = -i_2359_; i_2467_ < 0;
				 i_2467_++) {
				int i_2468_ = (aByteArray11422
					       [(i_2365_ >> 16) + i_2466_]);
				if (i_2468_ != 0) {
				    int i_2469_
					= anIntArray11423[i_2468_ & 0xff];
				    int i_2470_ = is[i_2374_];
				    int i_2471_ = i_2469_ + i_2470_;
				    int i_2472_ = ((i_2469_ & 0xff00ff)
						   + (i_2470_ & 0xff00ff));
				    i_2470_
					= ((i_2472_ & 0x1000100)
					   + (i_2471_ - i_2472_ & 0x10000));
				    is[i_2374_++]
					= (i_2471_ - i_2470_
					   | i_2470_ - (i_2470_ >>> 8));
				} else
				    i_2374_++;
				i_2365_ += i_2370_;
			    }
			    i_2366_ += i_2371_;
			    i_2365_ = i_2464_;
			    i_2374_ += i_2375_;
			}
		    } else if (i_2361_ == 0) {
			int i_2473_ = i_2365_;
			int i_2474_ = (i_2362_ & 0xff0000) >> 16;
			int i_2475_ = (i_2362_ & 0xff00) >> 8;
			int i_2476_ = i_2362_ & 0xff;
			for (int i_2477_ = -i_2360_; i_2477_ < 0; i_2477_++) {
			    int i_2478_ = (i_2366_ >> 16) * anInt9000;
			    for (int i_2479_ = -i_2359_; i_2479_ < 0;
				 i_2479_++) {
				int i_2480_ = (aByteArray11422
					       [(i_2365_ >> 16) + i_2478_]);
				if (i_2480_ != 0) {
				    int i_2481_
					= anIntArray11423[i_2480_ & 0xff];
				    int i_2482_
					= ((i_2481_ & 0xff0000) * i_2474_
					   & ~0xffffff);
				    int i_2483_ = ((i_2481_ & 0xff00) * i_2475_
						   & 0xff0000);
				    int i_2484_
					= (i_2481_ & 0xff) * i_2476_ & 0xff00;
				    i_2481_
					= (i_2482_ | i_2483_ | i_2484_) >>> 8;
				    int i_2485_ = is[i_2374_];
				    int i_2486_ = i_2481_ + i_2485_;
				    int i_2487_ = ((i_2481_ & 0xff00ff)
						   + (i_2485_ & 0xff00ff));
				    i_2485_
					= ((i_2487_ & 0x1000100)
					   + (i_2486_ - i_2487_ & 0x10000));
				    is[i_2374_++]
					= (i_2486_ - i_2485_
					   | i_2485_ - (i_2485_ >>> 8));
				} else
				    i_2374_++;
				i_2365_ += i_2370_;
			    }
			    i_2366_ += i_2371_;
			    i_2365_ = i_2473_;
			    i_2374_ += i_2375_;
			}
		    } else if (i_2361_ == 3) {
			int i_2488_ = i_2365_;
			for (int i_2489_ = -i_2360_; i_2489_ < 0; i_2489_++) {
			    int i_2490_ = (i_2366_ >> 16) * anInt9000;
			    for (int i_2491_ = -i_2359_; i_2491_ < 0;
				 i_2491_++) {
				byte i_2492_ = (aByteArray11422
						[(i_2365_ >> 16) + i_2490_]);
				int i_2493_ = (i_2492_ > 0
					       ? anIntArray11423[i_2492_] : 0);
				int i_2494_ = i_2493_ + i_2362_;
				int i_2495_ = ((i_2493_ & 0xff00ff)
					       + (i_2362_ & 0xff00ff));
				int i_2496_
				    = ((i_2495_ & 0x1000100)
				       + (i_2494_ - i_2495_ & 0x10000));
				i_2493_
				    = i_2494_ - i_2496_ | i_2496_ - (i_2496_
								     >>> 8);
				i_2496_ = is[i_2374_];
				i_2494_ = i_2493_ + i_2496_;
				i_2495_ = (i_2493_ & 0xff00ff) + (i_2496_
								  & 0xff00ff);
				i_2496_ = ((i_2495_ & 0x1000100)
					   + (i_2494_ - i_2495_ & 0x10000));
				is[i_2374_++]
				    = i_2494_ - i_2496_ | i_2496_ - (i_2496_
								     >>> 8);
				i_2365_ += i_2370_;
			    }
			    i_2366_ += i_2371_;
			    i_2365_ = i_2488_;
			    i_2374_ += i_2375_;
			}
		    } else if (i_2361_ == 2) {
			int i_2497_ = i_2362_ >>> 24;
			int i_2498_ = 256 - i_2497_;
			int i_2499_
			    = (i_2362_ & 0xff00ff) * i_2498_ & ~0xff00ff;
			int i_2500_ = (i_2362_ & 0xff00) * i_2498_ & 0xff0000;
			i_2362_ = (i_2499_ | i_2500_) >>> 8;
			int i_2501_ = i_2365_;
			for (int i_2502_ = -i_2360_; i_2502_ < 0; i_2502_++) {
			    int i_2503_ = (i_2366_ >> 16) * anInt9000;
			    for (int i_2504_ = -i_2359_; i_2504_ < 0;
				 i_2504_++) {
				int i_2505_ = (aByteArray11422
					       [(i_2365_ >> 16) + i_2503_]);
				if (i_2505_ != 0) {
				    int i_2506_
					= anIntArray11423[i_2505_ & 0xff];
				    i_2499_ = ((i_2506_ & 0xff00ff) * i_2497_
					       & ~0xff00ff);
				    i_2500_ = ((i_2506_ & 0xff00) * i_2497_
					       & 0xff0000);
				    i_2506_ = (((i_2499_ | i_2500_) >>> 8)
					       + i_2362_);
				    int i_2507_ = is[i_2374_];
				    int i_2508_ = i_2506_ + i_2507_;
				    int i_2509_ = ((i_2506_ & 0xff00ff)
						   + (i_2507_ & 0xff00ff));
				    i_2507_
					= ((i_2509_ & 0x1000100)
					   + (i_2508_ - i_2509_ & 0x10000));
				    is[i_2374_++]
					= (i_2508_ - i_2507_
					   | i_2507_ - (i_2507_ >>> 8));
				} else
				    i_2374_++;
				i_2365_ += i_2370_;
			    }
			    i_2366_ += i_2371_;
			    i_2365_ = i_2501_;
			    i_2374_ += i_2375_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    public void method2510(int i, int i_2510_, int i_2511_, int i_2512_,
			   int[] is, int[] is_2513_, int i_2514_,
			   int i_2515_) {
	throw new IllegalStateException();
    }
    
    public void method2514(int i, int i_2516_, int i_2517_, int i_2518_,
			   int[] is, int[] is_2519_, int i_2520_,
			   int i_2521_) {
	throw new IllegalStateException();
    }
    
    public void method2500(int i, int i_2522_, int i_2523_, int i_2524_,
			   int[] is, int[] is_2525_, int i_2526_,
			   int i_2527_) {
	throw new IllegalStateException();
    }
    
    public void method2499(int i, int i_2528_, int i_2529_, int i_2530_,
			   int i_2531_, int i_2532_) {
	throw new IllegalStateException();
    }
    
    Class157_Sub1_Sub1(Class182_Sub2 class182_sub2, byte[] is, int[] is_2533_,
		       int i, int i_2534_) {
	super(class182_sub2, i, i_2534_);
	aByteArray11422 = is;
	anIntArray11423 = is_2533_;
    }
    
    void method14547(int i, int i_2535_) {
	int[] is = aClass182_Sub2_9033.anIntArray9466;
	if (is != null) {
	    if (anInt9006 == 0) {
		if (anInt9017 == 0) {
		    int i_2536_ = anInt9023;
		    while (i_2536_ < 0) {
			int i_2537_ = anInt9015;
			int i_2538_ = anInt9022;
			int i_2539_ = anInt8999;
			int i_2540_ = anInt9011;
			if (i_2538_ >= 0 && i_2539_ >= 0
			    && i_2538_ - (anInt9000 << 12) < 0
			    && i_2539_ - (anInt9001 << 12) < 0) {
			    for (/**/; i_2540_ < 0; i_2540_++) {
				int i_2541_ = ((i_2539_ >> 12) * anInt9000
					       + (i_2538_ >> 12));
				int i_2542_ = i_2537_++;
				if (i_2535_ == 0) {
				    if (i == 1)
					is[i_2542_]
					    = (anIntArray11423
					       [(aByteArray11422[i_2541_]
						 & 0xff)]);
				    else if (i == 0) {
					int i_2543_
					    = (anIntArray11423
					       [(aByteArray11422[i_2541_]
						 & 0xff)]);
					int i_2544_
					    = ((i_2543_ & 0xff0000) * anInt9031
					       & ~0xffffff);
					int i_2545_
					    = ((i_2543_ & 0xff00) * anInt9030
					       & 0xff0000);
					int i_2546_
					    = ((i_2543_ & 0xff) * anInt9027
					       & 0xff00);
					is[i_2542_] = (i_2544_ | i_2545_
						       | i_2546_) >>> 8;
				    } else if (i == 3) {
					int i_2547_
					    = (anIntArray11423
					       [(aByteArray11422[i_2541_]
						 & 0xff)]);
					int i_2548_ = anInt9026;
					int i_2549_ = i_2547_ + i_2548_;
					int i_2550_ = ((i_2547_ & 0xff00ff)
						       + (i_2548_ & 0xff00ff));
					int i_2551_ = ((i_2550_ & 0x1000100)
						       + (i_2549_ - i_2550_
							  & 0x10000));
					is[i_2542_]
					    = (i_2549_ - i_2551_
					       | i_2551_ - (i_2551_ >>> 8));
				    } else if (i == 2) {
					int i_2552_
					    = (anIntArray11423
					       [(aByteArray11422[i_2541_]
						 & 0xff)]);
					int i_2553_
					    = ((i_2552_ & 0xff00ff) * anInt9007
					       & ~0xff00ff);
					int i_2554_
					    = ((i_2552_ & 0xff00) * anInt9007
					       & 0xff0000);
					is[i_2542_] = ((i_2553_ | i_2554_)
						       >>> 8) + anInt9034;
				    } else
					throw new IllegalArgumentException();
				} else if (i_2535_ == 1) {
				    if (i == 1) {
					int i_2555_ = aByteArray11422[i_2541_];
					if (i_2555_ != 0)
					    is[i_2542_] = (anIntArray11423
							   [i_2555_ & 0xff]);
				    } else if (i == 0) {
					int i_2556_ = aByteArray11422[i_2541_];
					if (i_2556_ != 0) {
					    int i_2557_ = (anIntArray11423
							   [i_2556_ & 0xff]);
					    if ((anInt9026 & 0xffffff)
						== 16777215) {
						int i_2558_ = anInt9026 >>> 24;
						int i_2559_ = 256 - i_2558_;
						int i_2560_ = is[i_2542_];
						is[i_2542_]
						    = (((((i_2557_ & 0xff00ff)
							  * i_2558_)
							 + ((i_2560_
							     & 0xff00ff)
							    * i_2559_))
							& ~0xff00ff)
						       + ((((i_2557_ & 0xff00)
							    * i_2558_)
							   + ((i_2560_
							       & 0xff00)
							      * i_2559_))
							  & 0xff0000)) >> 8;
					    } else if (anInt9007 != 255) {
						int i_2561_
						    = (((i_2557_ & 0xff0000)
							* anInt9031)
						       & ~0xffffff);
						int i_2562_
						    = (((i_2557_ & 0xff00)
							* anInt9030)
						       & 0xff0000);
						int i_2563_
						    = (((i_2557_ & 0xff)
							* anInt9027)
						       & 0xff00);
						i_2557_ = (i_2561_ | i_2562_
							   | i_2563_) >>> 8;
						int i_2564_ = is[i_2542_];
						is[i_2542_]
						    = (((((i_2557_ & 0xff00ff)
							  * anInt9007)
							 + ((i_2564_
							     & 0xff00ff)
							    * anInt9028))
							& ~0xff00ff)
						       + ((((i_2557_ & 0xff00)
							    * anInt9007)
							   + ((i_2564_
							       & 0xff00)
							      * anInt9028))
							  & 0xff0000)) >> 8;
					    } else {
						int i_2565_
						    = (((i_2557_ & 0xff0000)
							* anInt9031)
						       & ~0xffffff);
						int i_2566_
						    = (((i_2557_ & 0xff00)
							* anInt9030)
						       & 0xff0000);
						int i_2567_
						    = (((i_2557_ & 0xff)
							* anInt9027)
						       & 0xff00);
						is[i_2542_]
						    = (i_2565_ | i_2566_
						       | i_2567_) >>> 8;
					    }
					}
				    } else if (i == 3) {
					byte i_2568_
					    = aByteArray11422[i_2541_];
					int i_2569_
					    = (i_2568_ > 0
					       ? anIntArray11423[i_2568_] : 0);
					int i_2570_ = anInt9026;
					int i_2571_ = i_2569_ + i_2570_;
					int i_2572_ = ((i_2569_ & 0xff00ff)
						       + (i_2570_ & 0xff00ff));
					int i_2573_ = ((i_2572_ & 0x1000100)
						       + (i_2571_ - i_2572_
							  & 0x10000));
					i_2573_
					    = (i_2571_ - i_2573_
					       | i_2573_ - (i_2573_ >>> 8));
					if (i_2569_ == 0 && anInt9007 != 255) {
					    i_2569_ = i_2573_;
					    i_2573_ = is[i_2542_];
					    i_2573_
						= (((((i_2569_ & 0xff00ff)
						      * anInt9007)
						     + ((i_2573_ & 0xff00ff)
							* anInt9028))
						    & ~0xff00ff)
						   + ((((i_2569_ & 0xff00)
							* anInt9007)
						       + ((i_2573_ & 0xff00)
							  * anInt9028))
						      & 0xff0000)) >> 8;
					}
					is[i_2542_] = i_2573_;
				    } else if (i == 2) {
					int i_2574_ = aByteArray11422[i_2541_];
					if (i_2574_ != 0) {
					    int i_2575_ = (anIntArray11423
							   [i_2574_ & 0xff]);
					    int i_2576_
						= (((i_2575_ & 0xff00ff)
						    * anInt9007)
						   & ~0xff00ff);
					    int i_2577_ = (((i_2575_ & 0xff00)
							    * anInt9007)
							   & 0xff0000);
					    is[i_2542_++]
						= (((i_2576_ | i_2577_) >>> 8)
						   + anInt9034);
					}
				    } else
					throw new IllegalArgumentException();
				} else if (i_2535_ == 2) {
				    if (i == 1) {
					int i_2578_ = aByteArray11422[i_2541_];
					if (i_2578_ != 0) {
					    int i_2579_ = (anIntArray11423
							   [i_2578_ & 0xff]);
					    int i_2580_ = is[i_2542_];
					    int i_2581_ = i_2579_ + i_2580_;
					    int i_2582_
						= ((i_2579_ & 0xff00ff)
						   + (i_2580_ & 0xff00ff));
					    i_2580_ = ((i_2582_ & 0x1000100)
						       + (i_2581_ - i_2582_
							  & 0x10000));
					    is[i_2542_]
						= (i_2581_ - i_2580_
						   | i_2580_ - (i_2580_
								>>> 8));
					}
				    } else if (i == 0) {
					int i_2583_ = aByteArray11422[i_2541_];
					if (i_2583_ != 0) {
					    int i_2584_ = (anIntArray11423
							   [i_2583_ & 0xff]);
					    int i_2585_
						= (((i_2584_ & 0xff0000)
						    * anInt9031)
						   & ~0xffffff);
					    int i_2586_ = (((i_2584_ & 0xff00)
							    * anInt9030)
							   & 0xff0000);
					    int i_2587_
						= ((i_2584_ & 0xff) * anInt9027
						   & 0xff00);
					    i_2584_ = (i_2585_ | i_2586_
						       | i_2587_) >>> 8;
					    int i_2588_ = is[i_2542_];
					    int i_2589_ = i_2584_ + i_2588_;
					    int i_2590_
						= ((i_2584_ & 0xff00ff)
						   + (i_2588_ & 0xff00ff));
					    i_2588_ = ((i_2590_ & 0x1000100)
						       + (i_2589_ - i_2590_
							  & 0x10000));
					    is[i_2542_]
						= (i_2589_ - i_2588_
						   | i_2588_ - (i_2588_
								>>> 8));
					}
				    } else if (i == 3) {
					byte i_2591_
					    = aByteArray11422[i_2541_];
					int i_2592_
					    = (i_2591_ > 0
					       ? anIntArray11423[i_2591_] : 0);
					int i_2593_ = anInt9026;
					int i_2594_ = i_2592_ + i_2593_;
					int i_2595_ = ((i_2592_ & 0xff00ff)
						       + (i_2593_ & 0xff00ff));
					int i_2596_ = ((i_2595_ & 0x1000100)
						       + (i_2594_ - i_2595_
							  & 0x10000));
					i_2596_
					    = (i_2594_ - i_2596_
					       | i_2596_ - (i_2596_ >>> 8));
					if (i_2592_ == 0 && anInt9007 != 255) {
					    i_2592_ = i_2596_;
					    i_2596_ = is[i_2542_];
					    i_2596_
						= (((((i_2592_ & 0xff00ff)
						      * anInt9007)
						     + ((i_2596_ & 0xff00ff)
							* anInt9028))
						    & ~0xff00ff)
						   + ((((i_2592_ & 0xff00)
							* anInt9007)
						       + ((i_2596_ & 0xff00)
							  * anInt9028))
						      & 0xff0000)) >> 8;
					}
					is[i_2542_] = i_2596_;
				    } else if (i == 2) {
					int i_2597_ = aByteArray11422[i_2541_];
					if (i_2597_ != 0) {
					    int i_2598_ = (anIntArray11423
							   [i_2597_ & 0xff]);
					    int i_2599_
						= (((i_2598_ & 0xff00ff)
						    * anInt9007)
						   & ~0xff00ff);
					    int i_2600_ = (((i_2598_ & 0xff00)
							    * anInt9007)
							   & 0xff0000);
					    i_2598_ = ((i_2599_ | i_2600_)
						       >>> 8) + anInt9034;
					    int i_2601_ = is[i_2542_];
					    int i_2602_ = i_2598_ + i_2601_;
					    int i_2603_
						= ((i_2598_ & 0xff00ff)
						   + (i_2601_ & 0xff00ff));
					    i_2601_ = ((i_2603_ & 0x1000100)
						       + (i_2602_ - i_2603_
							  & 0x10000));
					    is[i_2542_]
						= (i_2602_ - i_2601_
						   | i_2601_ - (i_2601_
								>>> 8));
					}
				    }
				} else
				    throw new IllegalArgumentException();
			    }
			}
			i_2536_++;
			anInt9015 += anInt9014;
		    }
		} else if (anInt9017 < 0) {
		    int i_2604_ = anInt9023;
		    while (i_2604_ < 0) {
			int i_2605_ = anInt9015;
			int i_2606_ = anInt9022;
			int i_2607_ = anInt8999 + anInt9025;
			int i_2608_ = anInt9011;
			if (i_2606_ >= 0 && i_2606_ - (anInt9000 << 12) < 0) {
			    int i_2609_;
			    if ((i_2609_ = i_2607_ - (anInt9001 << 12)) >= 0) {
				i_2609_ = (anInt9017 - i_2609_) / anInt9017;
				i_2608_ += i_2609_;
				i_2607_ += anInt9017 * i_2609_;
				i_2605_ += i_2609_;
			    }
			    if ((i_2609_ = (i_2607_ - anInt9017) / anInt9017)
				> i_2608_)
				i_2608_ = i_2609_;
			    for (/**/; i_2608_ < 0; i_2608_++) {
				int i_2610_ = ((i_2607_ >> 12) * anInt9000
					       + (i_2606_ >> 12));
				int i_2611_ = i_2605_++;
				if (i_2535_ == 0) {
				    if (i == 1)
					is[i_2611_]
					    = (anIntArray11423
					       [(aByteArray11422[i_2610_]
						 & 0xff)]);
				    else if (i == 0) {
					int i_2612_
					    = (anIntArray11423
					       [(aByteArray11422[i_2610_]
						 & 0xff)]);
					int i_2613_
					    = ((i_2612_ & 0xff0000) * anInt9031
					       & ~0xffffff);
					int i_2614_
					    = ((i_2612_ & 0xff00) * anInt9030
					       & 0xff0000);
					int i_2615_
					    = ((i_2612_ & 0xff) * anInt9027
					       & 0xff00);
					is[i_2611_] = (i_2613_ | i_2614_
						       | i_2615_) >>> 8;
				    } else if (i == 3) {
					int i_2616_
					    = (anIntArray11423
					       [(aByteArray11422[i_2610_]
						 & 0xff)]);
					int i_2617_ = anInt9026;
					int i_2618_ = i_2616_ + i_2617_;
					int i_2619_ = ((i_2616_ & 0xff00ff)
						       + (i_2617_ & 0xff00ff));
					int i_2620_ = ((i_2619_ & 0x1000100)
						       + (i_2618_ - i_2619_
							  & 0x10000));
					is[i_2611_]
					    = (i_2618_ - i_2620_
					       | i_2620_ - (i_2620_ >>> 8));
				    } else if (i == 2) {
					int i_2621_
					    = (anIntArray11423
					       [(aByteArray11422[i_2610_]
						 & 0xff)]);
					int i_2622_
					    = ((i_2621_ & 0xff00ff) * anInt9007
					       & ~0xff00ff);
					int i_2623_
					    = ((i_2621_ & 0xff00) * anInt9007
					       & 0xff0000);
					is[i_2611_] = ((i_2622_ | i_2623_)
						       >>> 8) + anInt9034;
				    } else
					throw new IllegalArgumentException();
				} else if (i_2535_ == 1) {
				    if (i == 1) {
					int i_2624_ = aByteArray11422[i_2610_];
					if (i_2624_ != 0)
					    is[i_2611_] = (anIntArray11423
							   [i_2624_ & 0xff]);
				    } else if (i == 0) {
					int i_2625_ = aByteArray11422[i_2610_];
					if (i_2625_ != 0) {
					    int i_2626_ = (anIntArray11423
							   [i_2625_ & 0xff]);
					    if ((anInt9026 & 0xffffff)
						== 16777215) {
						int i_2627_ = anInt9026 >>> 24;
						int i_2628_ = 256 - i_2627_;
						int i_2629_ = is[i_2611_];
						is[i_2611_]
						    = (((((i_2626_ & 0xff00ff)
							  * i_2627_)
							 + ((i_2629_
							     & 0xff00ff)
							    * i_2628_))
							& ~0xff00ff)
						       + ((((i_2626_ & 0xff00)
							    * i_2627_)
							   + ((i_2629_
							       & 0xff00)
							      * i_2628_))
							  & 0xff0000)) >> 8;
					    } else if (anInt9007 != 255) {
						int i_2630_
						    = (((i_2626_ & 0xff0000)
							* anInt9031)
						       & ~0xffffff);
						int i_2631_
						    = (((i_2626_ & 0xff00)
							* anInt9030)
						       & 0xff0000);
						int i_2632_
						    = (((i_2626_ & 0xff)
							* anInt9027)
						       & 0xff00);
						i_2626_ = (i_2630_ | i_2631_
							   | i_2632_) >>> 8;
						int i_2633_ = is[i_2611_];
						is[i_2611_]
						    = (((((i_2626_ & 0xff00ff)
							  * anInt9007)
							 + ((i_2633_
							     & 0xff00ff)
							    * anInt9028))
							& ~0xff00ff)
						       + ((((i_2626_ & 0xff00)
							    * anInt9007)
							   + ((i_2633_
							       & 0xff00)
							      * anInt9028))
							  & 0xff0000)) >> 8;
					    } else {
						int i_2634_
						    = (((i_2626_ & 0xff0000)
							* anInt9031)
						       & ~0xffffff);
						int i_2635_
						    = (((i_2626_ & 0xff00)
							* anInt9030)
						       & 0xff0000);
						int i_2636_
						    = (((i_2626_ & 0xff)
							* anInt9027)
						       & 0xff00);
						is[i_2611_]
						    = (i_2634_ | i_2635_
						       | i_2636_) >>> 8;
					    }
					}
				    } else if (i == 3) {
					byte i_2637_
					    = aByteArray11422[i_2610_];
					int i_2638_
					    = (i_2637_ > 0
					       ? anIntArray11423[i_2637_] : 0);
					int i_2639_ = anInt9026;
					int i_2640_ = i_2638_ + i_2639_;
					int i_2641_ = ((i_2638_ & 0xff00ff)
						       + (i_2639_ & 0xff00ff));
					int i_2642_ = ((i_2641_ & 0x1000100)
						       + (i_2640_ - i_2641_
							  & 0x10000));
					i_2642_
					    = (i_2640_ - i_2642_
					       | i_2642_ - (i_2642_ >>> 8));
					if (i_2638_ == 0 && anInt9007 != 255) {
					    i_2638_ = i_2642_;
					    i_2642_ = is[i_2611_];
					    i_2642_
						= (((((i_2638_ & 0xff00ff)
						      * anInt9007)
						     + ((i_2642_ & 0xff00ff)
							* anInt9028))
						    & ~0xff00ff)
						   + ((((i_2638_ & 0xff00)
							* anInt9007)
						       + ((i_2642_ & 0xff00)
							  * anInt9028))
						      & 0xff0000)) >> 8;
					}
					is[i_2611_] = i_2642_;
				    } else if (i == 2) {
					int i_2643_ = aByteArray11422[i_2610_];
					if (i_2643_ != 0) {
					    int i_2644_ = (anIntArray11423
							   [i_2643_ & 0xff]);
					    int i_2645_
						= (((i_2644_ & 0xff00ff)
						    * anInt9007)
						   & ~0xff00ff);
					    int i_2646_ = (((i_2644_ & 0xff00)
							    * anInt9007)
							   & 0xff0000);
					    is[i_2611_++]
						= (((i_2645_ | i_2646_) >>> 8)
						   + anInt9034);
					}
				    } else
					throw new IllegalArgumentException();
				} else if (i_2535_ == 2) {
				    if (i == 1) {
					int i_2647_ = aByteArray11422[i_2610_];
					if (i_2647_ != 0) {
					    int i_2648_ = (anIntArray11423
							   [i_2647_ & 0xff]);
					    int i_2649_ = is[i_2611_];
					    int i_2650_ = i_2648_ + i_2649_;
					    int i_2651_
						= ((i_2648_ & 0xff00ff)
						   + (i_2649_ & 0xff00ff));
					    i_2649_ = ((i_2651_ & 0x1000100)
						       + (i_2650_ - i_2651_
							  & 0x10000));
					    is[i_2611_]
						= (i_2650_ - i_2649_
						   | i_2649_ - (i_2649_
								>>> 8));
					}
				    } else if (i == 0) {
					int i_2652_ = aByteArray11422[i_2610_];
					if (i_2652_ != 0) {
					    int i_2653_ = (anIntArray11423
							   [i_2652_ & 0xff]);
					    int i_2654_
						= (((i_2653_ & 0xff0000)
						    * anInt9031)
						   & ~0xffffff);
					    int i_2655_ = (((i_2653_ & 0xff00)
							    * anInt9030)
							   & 0xff0000);
					    int i_2656_
						= ((i_2653_ & 0xff) * anInt9027
						   & 0xff00);
					    i_2653_ = (i_2654_ | i_2655_
						       | i_2656_) >>> 8;
					    int i_2657_ = is[i_2611_];
					    int i_2658_ = i_2653_ + i_2657_;
					    int i_2659_
						= ((i_2653_ & 0xff00ff)
						   + (i_2657_ & 0xff00ff));
					    i_2657_ = ((i_2659_ & 0x1000100)
						       + (i_2658_ - i_2659_
							  & 0x10000));
					    is[i_2611_]
						= (i_2658_ - i_2657_
						   | i_2657_ - (i_2657_
								>>> 8));
					}
				    } else if (i == 3) {
					byte i_2660_
					    = aByteArray11422[i_2610_];
					int i_2661_
					    = (i_2660_ > 0
					       ? anIntArray11423[i_2660_] : 0);
					int i_2662_ = anInt9026;
					int i_2663_ = i_2661_ + i_2662_;
					int i_2664_ = ((i_2661_ & 0xff00ff)
						       + (i_2662_ & 0xff00ff));
					int i_2665_ = ((i_2664_ & 0x1000100)
						       + (i_2663_ - i_2664_
							  & 0x10000));
					i_2665_
					    = (i_2663_ - i_2665_
					       | i_2665_ - (i_2665_ >>> 8));
					if (i_2661_ == 0 && anInt9007 != 255) {
					    i_2661_ = i_2665_;
					    i_2665_ = is[i_2611_];
					    i_2665_
						= (((((i_2661_ & 0xff00ff)
						      * anInt9007)
						     + ((i_2665_ & 0xff00ff)
							* anInt9028))
						    & ~0xff00ff)
						   + ((((i_2661_ & 0xff00)
							* anInt9007)
						       + ((i_2665_ & 0xff00)
							  * anInt9028))
						      & 0xff0000)) >> 8;
					}
					is[i_2611_] = i_2665_;
				    } else if (i == 2) {
					int i_2666_ = aByteArray11422[i_2610_];
					if (i_2666_ != 0) {
					    int i_2667_ = (anIntArray11423
							   [i_2666_ & 0xff]);
					    int i_2668_
						= (((i_2667_ & 0xff00ff)
						    * anInt9007)
						   & ~0xff00ff);
					    int i_2669_ = (((i_2667_ & 0xff00)
							    * anInt9007)
							   & 0xff0000);
					    i_2667_ = ((i_2668_ | i_2669_)
						       >>> 8) + anInt9034;
					    int i_2670_ = is[i_2611_];
					    int i_2671_ = i_2667_ + i_2670_;
					    int i_2672_
						= ((i_2667_ & 0xff00ff)
						   + (i_2670_ & 0xff00ff));
					    i_2670_ = ((i_2672_ & 0x1000100)
						       + (i_2671_ - i_2672_
							  & 0x10000));
					    is[i_2611_]
						= (i_2671_ - i_2670_
						   | i_2670_ - (i_2670_
								>>> 8));
					}
				    }
				} else
				    throw new IllegalArgumentException();
				i_2607_ += anInt9017;
			    }
			}
			i_2604_++;
			anInt9022 += anInt9018;
			anInt9015 += anInt9014;
		    }
		} else {
		    int i_2673_ = anInt9023;
		    while (i_2673_ < 0) {
			int i_2674_ = anInt9015;
			int i_2675_ = anInt9022;
			int i_2676_ = anInt8999 + anInt9025;
			int i_2677_ = anInt9011;
			if (i_2675_ >= 0 && i_2675_ - (anInt9000 << 12) < 0) {
			    if (i_2676_ < 0) {
				int i_2678_
				    = (anInt9017 - 1 - i_2676_) / anInt9017;
				i_2677_ += i_2678_;
				i_2676_ += anInt9017 * i_2678_;
				i_2674_ += i_2678_;
			    }
			    int i_2679_;
			    if ((i_2679_ = (1 + i_2676_ - (anInt9001 << 12)
					    - anInt9017) / anInt9017)
				> i_2677_)
				i_2677_ = i_2679_;
			    for (/**/; i_2677_ < 0; i_2677_++) {
				int i_2680_ = ((i_2676_ >> 12) * anInt9000
					       + (i_2675_ >> 12));
				int i_2681_ = i_2674_++;
				if (i_2535_ == 0) {
				    if (i == 1)
					is[i_2681_]
					    = (anIntArray11423
					       [(aByteArray11422[i_2680_]
						 & 0xff)]);
				    else if (i == 0) {
					int i_2682_
					    = (anIntArray11423
					       [(aByteArray11422[i_2680_]
						 & 0xff)]);
					int i_2683_
					    = ((i_2682_ & 0xff0000) * anInt9031
					       & ~0xffffff);
					int i_2684_
					    = ((i_2682_ & 0xff00) * anInt9030
					       & 0xff0000);
					int i_2685_
					    = ((i_2682_ & 0xff) * anInt9027
					       & 0xff00);
					is[i_2681_] = (i_2683_ | i_2684_
						       | i_2685_) >>> 8;
				    } else if (i == 3) {
					int i_2686_
					    = (anIntArray11423
					       [(aByteArray11422[i_2680_]
						 & 0xff)]);
					int i_2687_ = anInt9026;
					int i_2688_ = i_2686_ + i_2687_;
					int i_2689_ = ((i_2686_ & 0xff00ff)
						       + (i_2687_ & 0xff00ff));
					int i_2690_ = ((i_2689_ & 0x1000100)
						       + (i_2688_ - i_2689_
							  & 0x10000));
					is[i_2681_]
					    = (i_2688_ - i_2690_
					       | i_2690_ - (i_2690_ >>> 8));
				    } else if (i == 2) {
					int i_2691_
					    = (anIntArray11423
					       [(aByteArray11422[i_2680_]
						 & 0xff)]);
					int i_2692_
					    = ((i_2691_ & 0xff00ff) * anInt9007
					       & ~0xff00ff);
					int i_2693_
					    = ((i_2691_ & 0xff00) * anInt9007
					       & 0xff0000);
					is[i_2681_] = ((i_2692_ | i_2693_)
						       >>> 8) + anInt9034;
				    } else
					throw new IllegalArgumentException();
				} else if (i_2535_ == 1) {
				    if (i == 1) {
					int i_2694_ = aByteArray11422[i_2680_];
					if (i_2694_ != 0)
					    is[i_2681_] = (anIntArray11423
							   [i_2694_ & 0xff]);
				    } else if (i == 0) {
					int i_2695_ = aByteArray11422[i_2680_];
					if (i_2695_ != 0) {
					    int i_2696_ = (anIntArray11423
							   [i_2695_ & 0xff]);
					    if ((anInt9026 & 0xffffff)
						== 16777215) {
						int i_2697_ = anInt9026 >>> 24;
						int i_2698_ = 256 - i_2697_;
						int i_2699_ = is[i_2681_];
						is[i_2681_]
						    = (((((i_2696_ & 0xff00ff)
							  * i_2697_)
							 + ((i_2699_
							     & 0xff00ff)
							    * i_2698_))
							& ~0xff00ff)
						       + ((((i_2696_ & 0xff00)
							    * i_2697_)
							   + ((i_2699_
							       & 0xff00)
							      * i_2698_))
							  & 0xff0000)) >> 8;
					    } else if (anInt9007 != 255) {
						int i_2700_
						    = (((i_2696_ & 0xff0000)
							* anInt9031)
						       & ~0xffffff);
						int i_2701_
						    = (((i_2696_ & 0xff00)
							* anInt9030)
						       & 0xff0000);
						int i_2702_
						    = (((i_2696_ & 0xff)
							* anInt9027)
						       & 0xff00);
						i_2696_ = (i_2700_ | i_2701_
							   | i_2702_) >>> 8;
						int i_2703_ = is[i_2681_];
						is[i_2681_]
						    = (((((i_2696_ & 0xff00ff)
							  * anInt9007)
							 + ((i_2703_
							     & 0xff00ff)
							    * anInt9028))
							& ~0xff00ff)
						       + ((((i_2696_ & 0xff00)
							    * anInt9007)
							   + ((i_2703_
							       & 0xff00)
							      * anInt9028))
							  & 0xff0000)) >> 8;
					    } else {
						int i_2704_
						    = (((i_2696_ & 0xff0000)
							* anInt9031)
						       & ~0xffffff);
						int i_2705_
						    = (((i_2696_ & 0xff00)
							* anInt9030)
						       & 0xff0000);
						int i_2706_
						    = (((i_2696_ & 0xff)
							* anInt9027)
						       & 0xff00);
						is[i_2681_]
						    = (i_2704_ | i_2705_
						       | i_2706_) >>> 8;
					    }
					}
				    } else if (i == 3) {
					byte i_2707_
					    = aByteArray11422[i_2680_];
					int i_2708_
					    = (i_2707_ > 0
					       ? anIntArray11423[i_2707_] : 0);
					int i_2709_ = anInt9026;
					int i_2710_ = i_2708_ + i_2709_;
					int i_2711_ = ((i_2708_ & 0xff00ff)
						       + (i_2709_ & 0xff00ff));
					int i_2712_ = ((i_2711_ & 0x1000100)
						       + (i_2710_ - i_2711_
							  & 0x10000));
					i_2712_
					    = (i_2710_ - i_2712_
					       | i_2712_ - (i_2712_ >>> 8));
					if (i_2708_ == 0 && anInt9007 != 255) {
					    i_2708_ = i_2712_;
					    i_2712_ = is[i_2681_];
					    i_2712_
						= (((((i_2708_ & 0xff00ff)
						      * anInt9007)
						     + ((i_2712_ & 0xff00ff)
							* anInt9028))
						    & ~0xff00ff)
						   + ((((i_2708_ & 0xff00)
							* anInt9007)
						       + ((i_2712_ & 0xff00)
							  * anInt9028))
						      & 0xff0000)) >> 8;
					}
					is[i_2681_] = i_2712_;
				    } else if (i == 2) {
					int i_2713_ = aByteArray11422[i_2680_];
					if (i_2713_ != 0) {
					    int i_2714_ = (anIntArray11423
							   [i_2713_ & 0xff]);
					    int i_2715_
						= (((i_2714_ & 0xff00ff)
						    * anInt9007)
						   & ~0xff00ff);
					    int i_2716_ = (((i_2714_ & 0xff00)
							    * anInt9007)
							   & 0xff0000);
					    is[i_2681_++]
						= (((i_2715_ | i_2716_) >>> 8)
						   + anInt9034);
					}
				    } else
					throw new IllegalArgumentException();
				} else if (i_2535_ == 2) {
				    if (i == 1) {
					int i_2717_ = aByteArray11422[i_2680_];
					if (i_2717_ != 0) {
					    int i_2718_ = (anIntArray11423
							   [i_2717_ & 0xff]);
					    int i_2719_ = is[i_2681_];
					    int i_2720_ = i_2718_ + i_2719_;
					    int i_2721_
						= ((i_2718_ & 0xff00ff)
						   + (i_2719_ & 0xff00ff));
					    i_2719_ = ((i_2721_ & 0x1000100)
						       + (i_2720_ - i_2721_
							  & 0x10000));
					    is[i_2681_]
						= (i_2720_ - i_2719_
						   | i_2719_ - (i_2719_
								>>> 8));
					}
				    } else if (i == 0) {
					int i_2722_ = aByteArray11422[i_2680_];
					if (i_2722_ != 0) {
					    int i_2723_ = (anIntArray11423
							   [i_2722_ & 0xff]);
					    int i_2724_
						= (((i_2723_ & 0xff0000)
						    * anInt9031)
						   & ~0xffffff);
					    int i_2725_ = (((i_2723_ & 0xff00)
							    * anInt9030)
							   & 0xff0000);
					    int i_2726_
						= ((i_2723_ & 0xff) * anInt9027
						   & 0xff00);
					    i_2723_ = (i_2724_ | i_2725_
						       | i_2726_) >>> 8;
					    int i_2727_ = is[i_2681_];
					    int i_2728_ = i_2723_ + i_2727_;
					    int i_2729_
						= ((i_2723_ & 0xff00ff)
						   + (i_2727_ & 0xff00ff));
					    i_2727_ = ((i_2729_ & 0x1000100)
						       + (i_2728_ - i_2729_
							  & 0x10000));
					    is[i_2681_]
						= (i_2728_ - i_2727_
						   | i_2727_ - (i_2727_
								>>> 8));
					}
				    } else if (i == 3) {
					byte i_2730_
					    = aByteArray11422[i_2680_];
					int i_2731_
					    = (i_2730_ > 0
					       ? anIntArray11423[i_2730_] : 0);
					int i_2732_ = anInt9026;
					int i_2733_ = i_2731_ + i_2732_;
					int i_2734_ = ((i_2731_ & 0xff00ff)
						       + (i_2732_ & 0xff00ff));
					int i_2735_ = ((i_2734_ & 0x1000100)
						       + (i_2733_ - i_2734_
							  & 0x10000));
					i_2735_
					    = (i_2733_ - i_2735_
					       | i_2735_ - (i_2735_ >>> 8));
					if (i_2731_ == 0 && anInt9007 != 255) {
					    i_2731_ = i_2735_;
					    i_2735_ = is[i_2681_];
					    i_2735_
						= (((((i_2731_ & 0xff00ff)
						      * anInt9007)
						     + ((i_2735_ & 0xff00ff)
							* anInt9028))
						    & ~0xff00ff)
						   + ((((i_2731_ & 0xff00)
							* anInt9007)
						       + ((i_2735_ & 0xff00)
							  * anInt9028))
						      & 0xff0000)) >> 8;
					}
					is[i_2681_] = i_2735_;
				    } else if (i == 2) {
					int i_2736_ = aByteArray11422[i_2680_];
					if (i_2736_ != 0) {
					    int i_2737_ = (anIntArray11423
							   [i_2736_ & 0xff]);
					    int i_2738_
						= (((i_2737_ & 0xff00ff)
						    * anInt9007)
						   & ~0xff00ff);
					    int i_2739_ = (((i_2737_ & 0xff00)
							    * anInt9007)
							   & 0xff0000);
					    i_2737_ = ((i_2738_ | i_2739_)
						       >>> 8) + anInt9034;
					    int i_2740_ = is[i_2681_];
					    int i_2741_ = i_2737_ + i_2740_;
					    int i_2742_
						= ((i_2737_ & 0xff00ff)
						   + (i_2740_ & 0xff00ff));
					    i_2740_ = ((i_2742_ & 0x1000100)
						       + (i_2741_ - i_2742_
							  & 0x10000));
					    is[i_2681_]
						= (i_2741_ - i_2740_
						   | i_2740_ - (i_2740_
								>>> 8));
					}
				    }
				} else
				    throw new IllegalArgumentException();
				i_2676_ += anInt9017;
			    }
			}
			i_2673_++;
			anInt9022 += anInt9018;
			anInt9015 += anInt9014;
		    }
		}
	    } else if (anInt9006 < 0) {
		if (anInt9017 == 0) {
		    int i_2743_ = anInt9023;
		    while (i_2743_ < 0) {
			int i_2744_ = anInt9015;
			int i_2745_ = anInt9022 + anInt9024;
			int i_2746_ = anInt8999;
			int i_2747_ = anInt9011;
			if (i_2746_ >= 0 && i_2746_ - (anInt9001 << 12) < 0) {
			    int i_2748_;
			    if ((i_2748_ = i_2745_ - (anInt9000 << 12)) >= 0) {
				i_2748_ = (anInt9006 - i_2748_) / anInt9006;
				i_2747_ += i_2748_;
				i_2745_ += anInt9006 * i_2748_;
				i_2744_ += i_2748_;
			    }
			    if ((i_2748_ = (i_2745_ - anInt9006) / anInt9006)
				> i_2747_)
				i_2747_ = i_2748_;
			    for (/**/; i_2747_ < 0; i_2747_++) {
				int i_2749_ = ((i_2746_ >> 12) * anInt9000
					       + (i_2745_ >> 12));
				int i_2750_ = i_2744_++;
				if (i_2535_ == 0) {
				    if (i == 1)
					is[i_2750_]
					    = (anIntArray11423
					       [(aByteArray11422[i_2749_]
						 & 0xff)]);
				    else if (i == 0) {
					int i_2751_
					    = (anIntArray11423
					       [(aByteArray11422[i_2749_]
						 & 0xff)]);
					int i_2752_
					    = ((i_2751_ & 0xff0000) * anInt9031
					       & ~0xffffff);
					int i_2753_
					    = ((i_2751_ & 0xff00) * anInt9030
					       & 0xff0000);
					int i_2754_
					    = ((i_2751_ & 0xff) * anInt9027
					       & 0xff00);
					is[i_2750_] = (i_2752_ | i_2753_
						       | i_2754_) >>> 8;
				    } else if (i == 3) {
					int i_2755_
					    = (anIntArray11423
					       [(aByteArray11422[i_2749_]
						 & 0xff)]);
					int i_2756_ = anInt9026;
					int i_2757_ = i_2755_ + i_2756_;
					int i_2758_ = ((i_2755_ & 0xff00ff)
						       + (i_2756_ & 0xff00ff));
					int i_2759_ = ((i_2758_ & 0x1000100)
						       + (i_2757_ - i_2758_
							  & 0x10000));
					is[i_2750_]
					    = (i_2757_ - i_2759_
					       | i_2759_ - (i_2759_ >>> 8));
				    } else if (i == 2) {
					int i_2760_
					    = (anIntArray11423
					       [(aByteArray11422[i_2749_]
						 & 0xff)]);
					int i_2761_
					    = ((i_2760_ & 0xff00ff) * anInt9007
					       & ~0xff00ff);
					int i_2762_
					    = ((i_2760_ & 0xff00) * anInt9007
					       & 0xff0000);
					is[i_2750_] = ((i_2761_ | i_2762_)
						       >>> 8) + anInt9034;
				    } else
					throw new IllegalArgumentException();
				} else if (i_2535_ == 1) {
				    if (i == 1) {
					int i_2763_ = aByteArray11422[i_2749_];
					if (i_2763_ != 0)
					    is[i_2750_] = (anIntArray11423
							   [i_2763_ & 0xff]);
				    } else if (i == 0) {
					int i_2764_ = aByteArray11422[i_2749_];
					if (i_2764_ != 0) {
					    int i_2765_ = (anIntArray11423
							   [i_2764_ & 0xff]);
					    if ((anInt9026 & 0xffffff)
						== 16777215) {
						int i_2766_ = anInt9026 >>> 24;
						int i_2767_ = 256 - i_2766_;
						int i_2768_ = is[i_2750_];
						is[i_2750_]
						    = (((((i_2765_ & 0xff00ff)
							  * i_2766_)
							 + ((i_2768_
							     & 0xff00ff)
							    * i_2767_))
							& ~0xff00ff)
						       + ((((i_2765_ & 0xff00)
							    * i_2766_)
							   + ((i_2768_
							       & 0xff00)
							      * i_2767_))
							  & 0xff0000)) >> 8;
					    } else if (anInt9007 != 255) {
						int i_2769_
						    = (((i_2765_ & 0xff0000)
							* anInt9031)
						       & ~0xffffff);
						int i_2770_
						    = (((i_2765_ & 0xff00)
							* anInt9030)
						       & 0xff0000);
						int i_2771_
						    = (((i_2765_ & 0xff)
							* anInt9027)
						       & 0xff00);
						i_2765_ = (i_2769_ | i_2770_
							   | i_2771_) >>> 8;
						int i_2772_ = is[i_2750_];
						is[i_2750_]
						    = (((((i_2765_ & 0xff00ff)
							  * anInt9007)
							 + ((i_2772_
							     & 0xff00ff)
							    * anInt9028))
							& ~0xff00ff)
						       + ((((i_2765_ & 0xff00)
							    * anInt9007)
							   + ((i_2772_
							       & 0xff00)
							      * anInt9028))
							  & 0xff0000)) >> 8;
					    } else {
						int i_2773_
						    = (((i_2765_ & 0xff0000)
							* anInt9031)
						       & ~0xffffff);
						int i_2774_
						    = (((i_2765_ & 0xff00)
							* anInt9030)
						       & 0xff0000);
						int i_2775_
						    = (((i_2765_ & 0xff)
							* anInt9027)
						       & 0xff00);
						is[i_2750_]
						    = (i_2773_ | i_2774_
						       | i_2775_) >>> 8;
					    }
					}
				    } else if (i == 3) {
					byte i_2776_
					    = aByteArray11422[i_2749_];
					int i_2777_
					    = (i_2776_ > 0
					       ? anIntArray11423[i_2776_] : 0);
					int i_2778_ = anInt9026;
					int i_2779_ = i_2777_ + i_2778_;
					int i_2780_ = ((i_2777_ & 0xff00ff)
						       + (i_2778_ & 0xff00ff));
					int i_2781_ = ((i_2780_ & 0x1000100)
						       + (i_2779_ - i_2780_
							  & 0x10000));
					i_2781_
					    = (i_2779_ - i_2781_
					       | i_2781_ - (i_2781_ >>> 8));
					if (i_2777_ == 0 && anInt9007 != 255) {
					    i_2777_ = i_2781_;
					    i_2781_ = is[i_2750_];
					    i_2781_
						= (((((i_2777_ & 0xff00ff)
						      * anInt9007)
						     + ((i_2781_ & 0xff00ff)
							* anInt9028))
						    & ~0xff00ff)
						   + ((((i_2777_ & 0xff00)
							* anInt9007)
						       + ((i_2781_ & 0xff00)
							  * anInt9028))
						      & 0xff0000)) >> 8;
					}
					is[i_2750_] = i_2781_;
				    } else if (i == 2) {
					int i_2782_ = aByteArray11422[i_2749_];
					if (i_2782_ != 0) {
					    int i_2783_ = (anIntArray11423
							   [i_2782_ & 0xff]);
					    int i_2784_
						= (((i_2783_ & 0xff00ff)
						    * anInt9007)
						   & ~0xff00ff);
					    int i_2785_ = (((i_2783_ & 0xff00)
							    * anInt9007)
							   & 0xff0000);
					    is[i_2750_++]
						= (((i_2784_ | i_2785_) >>> 8)
						   + anInt9034);
					}
				    } else
					throw new IllegalArgumentException();
				} else if (i_2535_ == 2) {
				    if (i == 1) {
					int i_2786_ = aByteArray11422[i_2749_];
					if (i_2786_ != 0) {
					    int i_2787_ = (anIntArray11423
							   [i_2786_ & 0xff]);
					    int i_2788_ = is[i_2750_];
					    int i_2789_ = i_2787_ + i_2788_;
					    int i_2790_
						= ((i_2787_ & 0xff00ff)
						   + (i_2788_ & 0xff00ff));
					    i_2788_ = ((i_2790_ & 0x1000100)
						       + (i_2789_ - i_2790_
							  & 0x10000));
					    is[i_2750_]
						= (i_2789_ - i_2788_
						   | i_2788_ - (i_2788_
								>>> 8));
					}
				    } else if (i == 0) {
					int i_2791_ = aByteArray11422[i_2749_];
					if (i_2791_ != 0) {
					    int i_2792_ = (anIntArray11423
							   [i_2791_ & 0xff]);
					    int i_2793_
						= (((i_2792_ & 0xff0000)
						    * anInt9031)
						   & ~0xffffff);
					    int i_2794_ = (((i_2792_ & 0xff00)
							    * anInt9030)
							   & 0xff0000);
					    int i_2795_
						= ((i_2792_ & 0xff) * anInt9027
						   & 0xff00);
					    i_2792_ = (i_2793_ | i_2794_
						       | i_2795_) >>> 8;
					    int i_2796_ = is[i_2750_];
					    int i_2797_ = i_2792_ + i_2796_;
					    int i_2798_
						= ((i_2792_ & 0xff00ff)
						   + (i_2796_ & 0xff00ff));
					    i_2796_ = ((i_2798_ & 0x1000100)
						       + (i_2797_ - i_2798_
							  & 0x10000));
					    is[i_2750_]
						= (i_2797_ - i_2796_
						   | i_2796_ - (i_2796_
								>>> 8));
					}
				    } else if (i == 3) {
					byte i_2799_
					    = aByteArray11422[i_2749_];
					int i_2800_
					    = (i_2799_ > 0
					       ? anIntArray11423[i_2799_] : 0);
					int i_2801_ = anInt9026;
					int i_2802_ = i_2800_ + i_2801_;
					int i_2803_ = ((i_2800_ & 0xff00ff)
						       + (i_2801_ & 0xff00ff));
					int i_2804_ = ((i_2803_ & 0x1000100)
						       + (i_2802_ - i_2803_
							  & 0x10000));
					i_2804_
					    = (i_2802_ - i_2804_
					       | i_2804_ - (i_2804_ >>> 8));
					if (i_2800_ == 0 && anInt9007 != 255) {
					    i_2800_ = i_2804_;
					    i_2804_ = is[i_2750_];
					    i_2804_
						= (((((i_2800_ & 0xff00ff)
						      * anInt9007)
						     + ((i_2804_ & 0xff00ff)
							* anInt9028))
						    & ~0xff00ff)
						   + ((((i_2800_ & 0xff00)
							* anInt9007)
						       + ((i_2804_ & 0xff00)
							  * anInt9028))
						      & 0xff0000)) >> 8;
					}
					is[i_2750_] = i_2804_;
				    } else if (i == 2) {
					int i_2805_ = aByteArray11422[i_2749_];
					if (i_2805_ != 0) {
					    int i_2806_ = (anIntArray11423
							   [i_2805_ & 0xff]);
					    int i_2807_
						= (((i_2806_ & 0xff00ff)
						    * anInt9007)
						   & ~0xff00ff);
					    int i_2808_ = (((i_2806_ & 0xff00)
							    * anInt9007)
							   & 0xff0000);
					    i_2806_ = ((i_2807_ | i_2808_)
						       >>> 8) + anInt9034;
					    int i_2809_ = is[i_2750_];
					    int i_2810_ = i_2806_ + i_2809_;
					    int i_2811_
						= ((i_2806_ & 0xff00ff)
						   + (i_2809_ & 0xff00ff));
					    i_2809_ = ((i_2811_ & 0x1000100)
						       + (i_2810_ - i_2811_
							  & 0x10000));
					    is[i_2750_]
						= (i_2810_ - i_2809_
						   | i_2809_ - (i_2809_
								>>> 8));
					}
				    }
				} else
				    throw new IllegalArgumentException();
				i_2745_ += anInt9006;
			    }
			}
			i_2743_++;
			anInt8999 += anInt9010;
			anInt9015 += anInt9014;
		    }
		} else if (anInt9017 < 0) {
		    int i_2812_ = anInt9023;
		    while (i_2812_ < 0) {
			int i_2813_ = anInt9015;
			int i_2814_ = anInt9022 + anInt9024;
			int i_2815_ = anInt8999 + anInt9025;
			int i_2816_ = anInt9011;
			int i_2817_;
			if ((i_2817_ = i_2814_ - (anInt9000 << 12)) >= 0) {
			    i_2817_ = (anInt9006 - i_2817_) / anInt9006;
			    i_2816_ += i_2817_;
			    i_2814_ += anInt9006 * i_2817_;
			    i_2815_ += anInt9017 * i_2817_;
			    i_2813_ += i_2817_;
			}
			if ((i_2817_ = (i_2814_ - anInt9006) / anInt9006)
			    > i_2816_)
			    i_2816_ = i_2817_;
			if ((i_2817_ = i_2815_ - (anInt9001 << 12)) >= 0) {
			    i_2817_ = (anInt9017 - i_2817_) / anInt9017;
			    i_2816_ += i_2817_;
			    i_2814_ += anInt9006 * i_2817_;
			    i_2815_ += anInt9017 * i_2817_;
			    i_2813_ += i_2817_;
			}
			if ((i_2817_ = (i_2815_ - anInt9017) / anInt9017)
			    > i_2816_)
			    i_2816_ = i_2817_;
			for (/**/; i_2816_ < 0; i_2816_++) {
			    int i_2818_ = ((i_2815_ >> 12) * anInt9000
					   + (i_2814_ >> 12));
			    int i_2819_ = i_2813_++;
			    if (i_2535_ == 0) {
				if (i == 1)
				    is[i_2819_]
					= (anIntArray11423
					   [aByteArray11422[i_2818_] & 0xff]);
				else if (i == 0) {
				    int i_2820_
					= (anIntArray11423
					   [aByteArray11422[i_2818_] & 0xff]);
				    int i_2821_
					= ((i_2820_ & 0xff0000) * anInt9031
					   & ~0xffffff);
				    int i_2822_
					= ((i_2820_ & 0xff00) * anInt9030
					   & 0xff0000);
				    int i_2823_ = ((i_2820_ & 0xff) * anInt9027
						   & 0xff00);
				    is[i_2819_]
					= (i_2821_ | i_2822_ | i_2823_) >>> 8;
				} else if (i == 3) {
				    int i_2824_
					= (anIntArray11423
					   [aByteArray11422[i_2818_] & 0xff]);
				    int i_2825_ = anInt9026;
				    int i_2826_ = i_2824_ + i_2825_;
				    int i_2827_ = ((i_2824_ & 0xff00ff)
						   + (i_2825_ & 0xff00ff));
				    int i_2828_
					= ((i_2827_ & 0x1000100)
					   + (i_2826_ - i_2827_ & 0x10000));
				    is[i_2819_]
					= (i_2826_ - i_2828_
					   | i_2828_ - (i_2828_ >>> 8));
				} else if (i == 2) {
				    int i_2829_
					= (anIntArray11423
					   [aByteArray11422[i_2818_] & 0xff]);
				    int i_2830_
					= ((i_2829_ & 0xff00ff) * anInt9007
					   & ~0xff00ff);
				    int i_2831_
					= ((i_2829_ & 0xff00) * anInt9007
					   & 0xff0000);
				    is[i_2819_] = (((i_2830_ | i_2831_) >>> 8)
						   + anInt9034);
				} else
				    throw new IllegalArgumentException();
			    } else if (i_2535_ == 1) {
				if (i == 1) {
				    int i_2832_ = aByteArray11422[i_2818_];
				    if (i_2832_ != 0)
					is[i_2819_]
					    = anIntArray11423[i_2832_ & 0xff];
				} else if (i == 0) {
				    int i_2833_ = aByteArray11422[i_2818_];
				    if (i_2833_ != 0) {
					int i_2834_
					    = anIntArray11423[i_2833_ & 0xff];
					if ((anInt9026 & 0xffffff)
					    == 16777215) {
					    int i_2835_ = anInt9026 >>> 24;
					    int i_2836_ = 256 - i_2835_;
					    int i_2837_ = is[i_2819_];
					    is[i_2819_]
						= (((((i_2834_ & 0xff00ff)
						      * i_2835_)
						     + ((i_2837_ & 0xff00ff)
							* i_2836_))
						    & ~0xff00ff)
						   + ((((i_2834_ & 0xff00)
							* i_2835_)
						       + ((i_2837_ & 0xff00)
							  * i_2836_))
						      & 0xff0000)) >> 8;
					} else if (anInt9007 != 255) {
					    int i_2838_
						= (((i_2834_ & 0xff0000)
						    * anInt9031)
						   & ~0xffffff);
					    int i_2839_ = (((i_2834_ & 0xff00)
							    * anInt9030)
							   & 0xff0000);
					    int i_2840_
						= ((i_2834_ & 0xff) * anInt9027
						   & 0xff00);
					    i_2834_ = (i_2838_ | i_2839_
						       | i_2840_) >>> 8;
					    int i_2841_ = is[i_2819_];
					    is[i_2819_]
						= (((((i_2834_ & 0xff00ff)
						      * anInt9007)
						     + ((i_2841_ & 0xff00ff)
							* anInt9028))
						    & ~0xff00ff)
						   + ((((i_2834_ & 0xff00)
							* anInt9007)
						       + ((i_2841_ & 0xff00)
							  * anInt9028))
						      & 0xff0000)) >> 8;
					} else {
					    int i_2842_
						= (((i_2834_ & 0xff0000)
						    * anInt9031)
						   & ~0xffffff);
					    int i_2843_ = (((i_2834_ & 0xff00)
							    * anInt9030)
							   & 0xff0000);
					    int i_2844_
						= ((i_2834_ & 0xff) * anInt9027
						   & 0xff00);
					    is[i_2819_] = (i_2842_ | i_2843_
							   | i_2844_) >>> 8;
					}
				    }
				} else if (i == 3) {
				    byte i_2845_ = aByteArray11422[i_2818_];
				    int i_2846_
					= (i_2845_ > 0
					   ? anIntArray11423[i_2845_] : 0);
				    int i_2847_ = anInt9026;
				    int i_2848_ = i_2846_ + i_2847_;
				    int i_2849_ = ((i_2846_ & 0xff00ff)
						   + (i_2847_ & 0xff00ff));
				    int i_2850_
					= ((i_2849_ & 0x1000100)
					   + (i_2848_ - i_2849_ & 0x10000));
				    i_2850_ = (i_2848_ - i_2850_
					       | i_2850_ - (i_2850_ >>> 8));
				    if (i_2846_ == 0 && anInt9007 != 255) {
					i_2846_ = i_2850_;
					i_2850_ = is[i_2819_];
					i_2850_ = (((((i_2846_ & 0xff00ff)
						      * anInt9007)
						     + ((i_2850_ & 0xff00ff)
							* anInt9028))
						    & ~0xff00ff)
						   + ((((i_2846_ & 0xff00)
							* anInt9007)
						       + ((i_2850_ & 0xff00)
							  * anInt9028))
						      & 0xff0000)) >> 8;
				    }
				    is[i_2819_] = i_2850_;
				} else if (i == 2) {
				    int i_2851_ = aByteArray11422[i_2818_];
				    if (i_2851_ != 0) {
					int i_2852_
					    = anIntArray11423[i_2851_ & 0xff];
					int i_2853_
					    = ((i_2852_ & 0xff00ff) * anInt9007
					       & ~0xff00ff);
					int i_2854_
					    = ((i_2852_ & 0xff00) * anInt9007
					       & 0xff0000);
					is[i_2819_++] = ((i_2853_ | i_2854_)
							 >>> 8) + anInt9034;
				    }
				} else
				    throw new IllegalArgumentException();
			    } else if (i_2535_ == 2) {
				if (i == 1) {
				    int i_2855_ = aByteArray11422[i_2818_];
				    if (i_2855_ != 0) {
					int i_2856_
					    = anIntArray11423[i_2855_ & 0xff];
					int i_2857_ = is[i_2819_];
					int i_2858_ = i_2856_ + i_2857_;
					int i_2859_ = ((i_2856_ & 0xff00ff)
						       + (i_2857_ & 0xff00ff));
					i_2857_ = ((i_2859_ & 0x1000100)
						   + (i_2858_ - i_2859_
						      & 0x10000));
					is[i_2819_]
					    = (i_2858_ - i_2857_
					       | i_2857_ - (i_2857_ >>> 8));
				    }
				} else if (i == 0) {
				    int i_2860_ = aByteArray11422[i_2818_];
				    if (i_2860_ != 0) {
					int i_2861_
					    = anIntArray11423[i_2860_ & 0xff];
					int i_2862_
					    = ((i_2861_ & 0xff0000) * anInt9031
					       & ~0xffffff);
					int i_2863_
					    = ((i_2861_ & 0xff00) * anInt9030
					       & 0xff0000);
					int i_2864_
					    = ((i_2861_ & 0xff) * anInt9027
					       & 0xff00);
					i_2861_ = (i_2862_ | i_2863_
						   | i_2864_) >>> 8;
					int i_2865_ = is[i_2819_];
					int i_2866_ = i_2861_ + i_2865_;
					int i_2867_ = ((i_2861_ & 0xff00ff)
						       + (i_2865_ & 0xff00ff));
					i_2865_ = ((i_2867_ & 0x1000100)
						   + (i_2866_ - i_2867_
						      & 0x10000));
					is[i_2819_]
					    = (i_2866_ - i_2865_
					       | i_2865_ - (i_2865_ >>> 8));
				    }
				} else if (i == 3) {
				    byte i_2868_ = aByteArray11422[i_2818_];
				    int i_2869_
					= (i_2868_ > 0
					   ? anIntArray11423[i_2868_] : 0);
				    int i_2870_ = anInt9026;
				    int i_2871_ = i_2869_ + i_2870_;
				    int i_2872_ = ((i_2869_ & 0xff00ff)
						   + (i_2870_ & 0xff00ff));
				    int i_2873_
					= ((i_2872_ & 0x1000100)
					   + (i_2871_ - i_2872_ & 0x10000));
				    i_2873_ = (i_2871_ - i_2873_
					       | i_2873_ - (i_2873_ >>> 8));
				    if (i_2869_ == 0 && anInt9007 != 255) {
					i_2869_ = i_2873_;
					i_2873_ = is[i_2819_];
					i_2873_ = (((((i_2869_ & 0xff00ff)
						      * anInt9007)
						     + ((i_2873_ & 0xff00ff)
							* anInt9028))
						    & ~0xff00ff)
						   + ((((i_2869_ & 0xff00)
							* anInt9007)
						       + ((i_2873_ & 0xff00)
							  * anInt9028))
						      & 0xff0000)) >> 8;
				    }
				    is[i_2819_] = i_2873_;
				} else if (i == 2) {
				    int i_2874_ = aByteArray11422[i_2818_];
				    if (i_2874_ != 0) {
					int i_2875_
					    = anIntArray11423[i_2874_ & 0xff];
					int i_2876_
					    = ((i_2875_ & 0xff00ff) * anInt9007
					       & ~0xff00ff);
					int i_2877_
					    = ((i_2875_ & 0xff00) * anInt9007
					       & 0xff0000);
					i_2875_ = (((i_2876_ | i_2877_) >>> 8)
						   + anInt9034);
					int i_2878_ = is[i_2819_];
					int i_2879_ = i_2875_ + i_2878_;
					int i_2880_ = ((i_2875_ & 0xff00ff)
						       + (i_2878_ & 0xff00ff));
					i_2878_ = ((i_2880_ & 0x1000100)
						   + (i_2879_ - i_2880_
						      & 0x10000));
					is[i_2819_]
					    = (i_2879_ - i_2878_
					       | i_2878_ - (i_2878_ >>> 8));
				    }
				}
			    } else
				throw new IllegalArgumentException();
			    i_2814_ += anInt9006;
			    i_2815_ += anInt9017;
			}
			i_2812_++;
			anInt9022 += anInt9018;
			anInt8999 += anInt9010;
			anInt9015 += anInt9014;
		    }
		} else {
		    int i_2881_ = anInt9023;
		    while (i_2881_ < 0) {
			int i_2882_ = anInt9015;
			int i_2883_ = anInt9022 + anInt9024;
			int i_2884_ = anInt8999 + anInt9025;
			int i_2885_ = anInt9011;
			int i_2886_;
			if ((i_2886_ = i_2883_ - (anInt9000 << 12)) >= 0) {
			    i_2886_ = (anInt9006 - i_2886_) / anInt9006;
			    i_2885_ += i_2886_;
			    i_2883_ += anInt9006 * i_2886_;
			    i_2884_ += anInt9017 * i_2886_;
			    i_2882_ += i_2886_;
			}
			if ((i_2886_ = (i_2883_ - anInt9006) / anInt9006)
			    > i_2885_)
			    i_2885_ = i_2886_;
			if (i_2884_ < 0) {
			    i_2886_ = (anInt9017 - 1 - i_2884_) / anInt9017;
			    i_2885_ += i_2886_;
			    i_2883_ += anInt9006 * i_2886_;
			    i_2884_ += anInt9017 * i_2886_;
			    i_2882_ += i_2886_;
			}
			if ((i_2886_ = (1 + i_2884_ - (anInt9001 << 12)
					- anInt9017) / anInt9017)
			    > i_2885_)
			    i_2885_ = i_2886_;
			for (/**/; i_2885_ < 0; i_2885_++) {
			    int i_2887_ = ((i_2884_ >> 12) * anInt9000
					   + (i_2883_ >> 12));
			    int i_2888_ = i_2882_++;
			    if (i_2535_ == 0) {
				if (i == 1)
				    is[i_2888_]
					= (anIntArray11423
					   [aByteArray11422[i_2887_] & 0xff]);
				else if (i == 0) {
				    int i_2889_
					= (anIntArray11423
					   [aByteArray11422[i_2887_] & 0xff]);
				    int i_2890_
					= ((i_2889_ & 0xff0000) * anInt9031
					   & ~0xffffff);
				    int i_2891_
					= ((i_2889_ & 0xff00) * anInt9030
					   & 0xff0000);
				    int i_2892_ = ((i_2889_ & 0xff) * anInt9027
						   & 0xff00);
				    is[i_2888_]
					= (i_2890_ | i_2891_ | i_2892_) >>> 8;
				} else if (i == 3) {
				    int i_2893_
					= (anIntArray11423
					   [aByteArray11422[i_2887_] & 0xff]);
				    int i_2894_ = anInt9026;
				    int i_2895_ = i_2893_ + i_2894_;
				    int i_2896_ = ((i_2893_ & 0xff00ff)
						   + (i_2894_ & 0xff00ff));
				    int i_2897_
					= ((i_2896_ & 0x1000100)
					   + (i_2895_ - i_2896_ & 0x10000));
				    is[i_2888_]
					= (i_2895_ - i_2897_
					   | i_2897_ - (i_2897_ >>> 8));
				} else if (i == 2) {
				    int i_2898_
					= (anIntArray11423
					   [aByteArray11422[i_2887_] & 0xff]);
				    int i_2899_
					= ((i_2898_ & 0xff00ff) * anInt9007
					   & ~0xff00ff);
				    int i_2900_
					= ((i_2898_ & 0xff00) * anInt9007
					   & 0xff0000);
				    is[i_2888_] = (((i_2899_ | i_2900_) >>> 8)
						   + anInt9034);
				} else
				    throw new IllegalArgumentException();
			    } else if (i_2535_ == 1) {
				if (i == 1) {
				    int i_2901_ = aByteArray11422[i_2887_];
				    if (i_2901_ != 0)
					is[i_2888_]
					    = anIntArray11423[i_2901_ & 0xff];
				} else if (i == 0) {
				    int i_2902_ = aByteArray11422[i_2887_];
				    if (i_2902_ != 0) {
					int i_2903_
					    = anIntArray11423[i_2902_ & 0xff];
					if ((anInt9026 & 0xffffff)
					    == 16777215) {
					    int i_2904_ = anInt9026 >>> 24;
					    int i_2905_ = 256 - i_2904_;
					    int i_2906_ = is[i_2888_];
					    is[i_2888_]
						= (((((i_2903_ & 0xff00ff)
						      * i_2904_)
						     + ((i_2906_ & 0xff00ff)
							* i_2905_))
						    & ~0xff00ff)
						   + ((((i_2903_ & 0xff00)
							* i_2904_)
						       + ((i_2906_ & 0xff00)
							  * i_2905_))
						      & 0xff0000)) >> 8;
					} else if (anInt9007 != 255) {
					    int i_2907_
						= (((i_2903_ & 0xff0000)
						    * anInt9031)
						   & ~0xffffff);
					    int i_2908_ = (((i_2903_ & 0xff00)
							    * anInt9030)
							   & 0xff0000);
					    int i_2909_
						= ((i_2903_ & 0xff) * anInt9027
						   & 0xff00);
					    i_2903_ = (i_2907_ | i_2908_
						       | i_2909_) >>> 8;
					    int i_2910_ = is[i_2888_];
					    is[i_2888_]
						= (((((i_2903_ & 0xff00ff)
						      * anInt9007)
						     + ((i_2910_ & 0xff00ff)
							* anInt9028))
						    & ~0xff00ff)
						   + ((((i_2903_ & 0xff00)
							* anInt9007)
						       + ((i_2910_ & 0xff00)
							  * anInt9028))
						      & 0xff0000)) >> 8;
					} else {
					    int i_2911_
						= (((i_2903_ & 0xff0000)
						    * anInt9031)
						   & ~0xffffff);
					    int i_2912_ = (((i_2903_ & 0xff00)
							    * anInt9030)
							   & 0xff0000);
					    int i_2913_
						= ((i_2903_ & 0xff) * anInt9027
						   & 0xff00);
					    is[i_2888_] = (i_2911_ | i_2912_
							   | i_2913_) >>> 8;
					}
				    }
				} else if (i == 3) {
				    byte i_2914_ = aByteArray11422[i_2887_];
				    int i_2915_
					= (i_2914_ > 0
					   ? anIntArray11423[i_2914_] : 0);
				    int i_2916_ = anInt9026;
				    int i_2917_ = i_2915_ + i_2916_;
				    int i_2918_ = ((i_2915_ & 0xff00ff)
						   + (i_2916_ & 0xff00ff));
				    int i_2919_
					= ((i_2918_ & 0x1000100)
					   + (i_2917_ - i_2918_ & 0x10000));
				    i_2919_ = (i_2917_ - i_2919_
					       | i_2919_ - (i_2919_ >>> 8));
				    if (i_2915_ == 0 && anInt9007 != 255) {
					i_2915_ = i_2919_;
					i_2919_ = is[i_2888_];
					i_2919_ = (((((i_2915_ & 0xff00ff)
						      * anInt9007)
						     + ((i_2919_ & 0xff00ff)
							* anInt9028))
						    & ~0xff00ff)
						   + ((((i_2915_ & 0xff00)
							* anInt9007)
						       + ((i_2919_ & 0xff00)
							  * anInt9028))
						      & 0xff0000)) >> 8;
				    }
				    is[i_2888_] = i_2919_;
				} else if (i == 2) {
				    int i_2920_ = aByteArray11422[i_2887_];
				    if (i_2920_ != 0) {
					int i_2921_
					    = anIntArray11423[i_2920_ & 0xff];
					int i_2922_
					    = ((i_2921_ & 0xff00ff) * anInt9007
					       & ~0xff00ff);
					int i_2923_
					    = ((i_2921_ & 0xff00) * anInt9007
					       & 0xff0000);
					is[i_2888_++] = ((i_2922_ | i_2923_)
							 >>> 8) + anInt9034;
				    }
				} else
				    throw new IllegalArgumentException();
			    } else if (i_2535_ == 2) {
				if (i == 1) {
				    int i_2924_ = aByteArray11422[i_2887_];
				    if (i_2924_ != 0) {
					int i_2925_
					    = anIntArray11423[i_2924_ & 0xff];
					int i_2926_ = is[i_2888_];
					int i_2927_ = i_2925_ + i_2926_;
					int i_2928_ = ((i_2925_ & 0xff00ff)
						       + (i_2926_ & 0xff00ff));
					i_2926_ = ((i_2928_ & 0x1000100)
						   + (i_2927_ - i_2928_
						      & 0x10000));
					is[i_2888_]
					    = (i_2927_ - i_2926_
					       | i_2926_ - (i_2926_ >>> 8));
				    }
				} else if (i == 0) {
				    int i_2929_ = aByteArray11422[i_2887_];
				    if (i_2929_ != 0) {
					int i_2930_
					    = anIntArray11423[i_2929_ & 0xff];
					int i_2931_
					    = ((i_2930_ & 0xff0000) * anInt9031
					       & ~0xffffff);
					int i_2932_
					    = ((i_2930_ & 0xff00) * anInt9030
					       & 0xff0000);
					int i_2933_
					    = ((i_2930_ & 0xff) * anInt9027
					       & 0xff00);
					i_2930_ = (i_2931_ | i_2932_
						   | i_2933_) >>> 8;
					int i_2934_ = is[i_2888_];
					int i_2935_ = i_2930_ + i_2934_;
					int i_2936_ = ((i_2930_ & 0xff00ff)
						       + (i_2934_ & 0xff00ff));
					i_2934_ = ((i_2936_ & 0x1000100)
						   + (i_2935_ - i_2936_
						      & 0x10000));
					is[i_2888_]
					    = (i_2935_ - i_2934_
					       | i_2934_ - (i_2934_ >>> 8));
				    }
				} else if (i == 3) {
				    byte i_2937_ = aByteArray11422[i_2887_];
				    int i_2938_
					= (i_2937_ > 0
					   ? anIntArray11423[i_2937_] : 0);
				    int i_2939_ = anInt9026;
				    int i_2940_ = i_2938_ + i_2939_;
				    int i_2941_ = ((i_2938_ & 0xff00ff)
						   + (i_2939_ & 0xff00ff));
				    int i_2942_
					= ((i_2941_ & 0x1000100)
					   + (i_2940_ - i_2941_ & 0x10000));
				    i_2942_ = (i_2940_ - i_2942_
					       | i_2942_ - (i_2942_ >>> 8));
				    if (i_2938_ == 0 && anInt9007 != 255) {
					i_2938_ = i_2942_;
					i_2942_ = is[i_2888_];
					i_2942_ = (((((i_2938_ & 0xff00ff)
						      * anInt9007)
						     + ((i_2942_ & 0xff00ff)
							* anInt9028))
						    & ~0xff00ff)
						   + ((((i_2938_ & 0xff00)
							* anInt9007)
						       + ((i_2942_ & 0xff00)
							  * anInt9028))
						      & 0xff0000)) >> 8;
				    }
				    is[i_2888_] = i_2942_;
				} else if (i == 2) {
				    int i_2943_ = aByteArray11422[i_2887_];
				    if (i_2943_ != 0) {
					int i_2944_
					    = anIntArray11423[i_2943_ & 0xff];
					int i_2945_
					    = ((i_2944_ & 0xff00ff) * anInt9007
					       & ~0xff00ff);
					int i_2946_
					    = ((i_2944_ & 0xff00) * anInt9007
					       & 0xff0000);
					i_2944_ = (((i_2945_ | i_2946_) >>> 8)
						   + anInt9034);
					int i_2947_ = is[i_2888_];
					int i_2948_ = i_2944_ + i_2947_;
					int i_2949_ = ((i_2944_ & 0xff00ff)
						       + (i_2947_ & 0xff00ff));
					i_2947_ = ((i_2949_ & 0x1000100)
						   + (i_2948_ - i_2949_
						      & 0x10000));
					is[i_2888_]
					    = (i_2948_ - i_2947_
					       | i_2947_ - (i_2947_ >>> 8));
				    }
				}
			    } else
				throw new IllegalArgumentException();
			    i_2883_ += anInt9006;
			    i_2884_ += anInt9017;
			}
			i_2881_++;
			anInt9022 += anInt9018;
			anInt8999 += anInt9010;
			anInt9015 += anInt9014;
		    }
		}
	    } else if (anInt9017 == 0) {
		int i_2950_ = anInt9023;
		while (i_2950_ < 0) {
		    int i_2951_ = anInt9015;
		    int i_2952_ = anInt9022 + anInt9024;
		    int i_2953_ = anInt8999;
		    int i_2954_ = anInt9011;
		    if (i_2953_ >= 0 && i_2953_ - (anInt9001 << 12) < 0) {
			if (i_2952_ < 0) {
			    int i_2955_
				= (anInt9006 - 1 - i_2952_) / anInt9006;
			    i_2954_ += i_2955_;
			    i_2952_ += anInt9006 * i_2955_;
			    i_2951_ += i_2955_;
			}
			int i_2956_;
			if ((i_2956_ = (1 + i_2952_ - (anInt9000 << 12)
					- anInt9006) / anInt9006)
			    > i_2954_)
			    i_2954_ = i_2956_;
			for (/**/; i_2954_ < 0; i_2954_++) {
			    int i_2957_ = ((i_2953_ >> 12) * anInt9000
					   + (i_2952_ >> 12));
			    int i_2958_ = i_2951_++;
			    if (i_2535_ == 0) {
				if (i == 1)
				    is[i_2958_]
					= (anIntArray11423
					   [aByteArray11422[i_2957_] & 0xff]);
				else if (i == 0) {
				    int i_2959_
					= (anIntArray11423
					   [aByteArray11422[i_2957_] & 0xff]);
				    int i_2960_
					= ((i_2959_ & 0xff0000) * anInt9031
					   & ~0xffffff);
				    int i_2961_
					= ((i_2959_ & 0xff00) * anInt9030
					   & 0xff0000);
				    int i_2962_ = ((i_2959_ & 0xff) * anInt9027
						   & 0xff00);
				    is[i_2958_]
					= (i_2960_ | i_2961_ | i_2962_) >>> 8;
				} else if (i == 3) {
				    int i_2963_
					= (anIntArray11423
					   [aByteArray11422[i_2957_] & 0xff]);
				    int i_2964_ = anInt9026;
				    int i_2965_ = i_2963_ + i_2964_;
				    int i_2966_ = ((i_2963_ & 0xff00ff)
						   + (i_2964_ & 0xff00ff));
				    int i_2967_
					= ((i_2966_ & 0x1000100)
					   + (i_2965_ - i_2966_ & 0x10000));
				    is[i_2958_]
					= (i_2965_ - i_2967_
					   | i_2967_ - (i_2967_ >>> 8));
				} else if (i == 2) {
				    int i_2968_
					= (anIntArray11423
					   [aByteArray11422[i_2957_] & 0xff]);
				    int i_2969_
					= ((i_2968_ & 0xff00ff) * anInt9007
					   & ~0xff00ff);
				    int i_2970_
					= ((i_2968_ & 0xff00) * anInt9007
					   & 0xff0000);
				    is[i_2958_] = (((i_2969_ | i_2970_) >>> 8)
						   + anInt9034);
				} else
				    throw new IllegalArgumentException();
			    } else if (i_2535_ == 1) {
				if (i == 1) {
				    int i_2971_ = aByteArray11422[i_2957_];
				    if (i_2971_ != 0)
					is[i_2958_]
					    = anIntArray11423[i_2971_ & 0xff];
				} else if (i == 0) {
				    int i_2972_ = aByteArray11422[i_2957_];
				    if (i_2972_ != 0) {
					int i_2973_
					    = anIntArray11423[i_2972_ & 0xff];
					if ((anInt9026 & 0xffffff)
					    == 16777215) {
					    int i_2974_ = anInt9026 >>> 24;
					    int i_2975_ = 256 - i_2974_;
					    int i_2976_ = is[i_2958_];
					    is[i_2958_]
						= (((((i_2973_ & 0xff00ff)
						      * i_2974_)
						     + ((i_2976_ & 0xff00ff)
							* i_2975_))
						    & ~0xff00ff)
						   + ((((i_2973_ & 0xff00)
							* i_2974_)
						       + ((i_2976_ & 0xff00)
							  * i_2975_))
						      & 0xff0000)) >> 8;
					} else if (anInt9007 != 255) {
					    int i_2977_
						= (((i_2973_ & 0xff0000)
						    * anInt9031)
						   & ~0xffffff);
					    int i_2978_ = (((i_2973_ & 0xff00)
							    * anInt9030)
							   & 0xff0000);
					    int i_2979_
						= ((i_2973_ & 0xff) * anInt9027
						   & 0xff00);
					    i_2973_ = (i_2977_ | i_2978_
						       | i_2979_) >>> 8;
					    int i_2980_ = is[i_2958_];
					    is[i_2958_]
						= (((((i_2973_ & 0xff00ff)
						      * anInt9007)
						     + ((i_2980_ & 0xff00ff)
							* anInt9028))
						    & ~0xff00ff)
						   + ((((i_2973_ & 0xff00)
							* anInt9007)
						       + ((i_2980_ & 0xff00)
							  * anInt9028))
						      & 0xff0000)) >> 8;
					} else {
					    int i_2981_
						= (((i_2973_ & 0xff0000)
						    * anInt9031)
						   & ~0xffffff);
					    int i_2982_ = (((i_2973_ & 0xff00)
							    * anInt9030)
							   & 0xff0000);
					    int i_2983_
						= ((i_2973_ & 0xff) * anInt9027
						   & 0xff00);
					    is[i_2958_] = (i_2981_ | i_2982_
							   | i_2983_) >>> 8;
					}
				    }
				} else if (i == 3) {
				    byte i_2984_ = aByteArray11422[i_2957_];
				    int i_2985_
					= (i_2984_ > 0
					   ? anIntArray11423[i_2984_] : 0);
				    int i_2986_ = anInt9026;
				    int i_2987_ = i_2985_ + i_2986_;
				    int i_2988_ = ((i_2985_ & 0xff00ff)
						   + (i_2986_ & 0xff00ff));
				    int i_2989_
					= ((i_2988_ & 0x1000100)
					   + (i_2987_ - i_2988_ & 0x10000));
				    i_2989_ = (i_2987_ - i_2989_
					       | i_2989_ - (i_2989_ >>> 8));
				    if (i_2985_ == 0 && anInt9007 != 255) {
					i_2985_ = i_2989_;
					i_2989_ = is[i_2958_];
					i_2989_ = (((((i_2985_ & 0xff00ff)
						      * anInt9007)
						     + ((i_2989_ & 0xff00ff)
							* anInt9028))
						    & ~0xff00ff)
						   + ((((i_2985_ & 0xff00)
							* anInt9007)
						       + ((i_2989_ & 0xff00)
							  * anInt9028))
						      & 0xff0000)) >> 8;
				    }
				    is[i_2958_] = i_2989_;
				} else if (i == 2) {
				    int i_2990_ = aByteArray11422[i_2957_];
				    if (i_2990_ != 0) {
					int i_2991_
					    = anIntArray11423[i_2990_ & 0xff];
					int i_2992_
					    = ((i_2991_ & 0xff00ff) * anInt9007
					       & ~0xff00ff);
					int i_2993_
					    = ((i_2991_ & 0xff00) * anInt9007
					       & 0xff0000);
					is[i_2958_++] = ((i_2992_ | i_2993_)
							 >>> 8) + anInt9034;
				    }
				} else
				    throw new IllegalArgumentException();
			    } else if (i_2535_ == 2) {
				if (i == 1) {
				    int i_2994_ = aByteArray11422[i_2957_];
				    if (i_2994_ != 0) {
					int i_2995_
					    = anIntArray11423[i_2994_ & 0xff];
					int i_2996_ = is[i_2958_];
					int i_2997_ = i_2995_ + i_2996_;
					int i_2998_ = ((i_2995_ & 0xff00ff)
						       + (i_2996_ & 0xff00ff));
					i_2996_ = ((i_2998_ & 0x1000100)
						   + (i_2997_ - i_2998_
						      & 0x10000));
					is[i_2958_]
					    = (i_2997_ - i_2996_
					       | i_2996_ - (i_2996_ >>> 8));
				    }
				} else if (i == 0) {
				    int i_2999_ = aByteArray11422[i_2957_];
				    if (i_2999_ != 0) {
					int i_3000_
					    = anIntArray11423[i_2999_ & 0xff];
					int i_3001_
					    = ((i_3000_ & 0xff0000) * anInt9031
					       & ~0xffffff);
					int i_3002_
					    = ((i_3000_ & 0xff00) * anInt9030
					       & 0xff0000);
					int i_3003_
					    = ((i_3000_ & 0xff) * anInt9027
					       & 0xff00);
					i_3000_ = (i_3001_ | i_3002_
						   | i_3003_) >>> 8;
					int i_3004_ = is[i_2958_];
					int i_3005_ = i_3000_ + i_3004_;
					int i_3006_ = ((i_3000_ & 0xff00ff)
						       + (i_3004_ & 0xff00ff));
					i_3004_ = ((i_3006_ & 0x1000100)
						   + (i_3005_ - i_3006_
						      & 0x10000));
					is[i_2958_]
					    = (i_3005_ - i_3004_
					       | i_3004_ - (i_3004_ >>> 8));
				    }
				} else if (i == 3) {
				    byte i_3007_ = aByteArray11422[i_2957_];
				    int i_3008_
					= (i_3007_ > 0
					   ? anIntArray11423[i_3007_] : 0);
				    int i_3009_ = anInt9026;
				    int i_3010_ = i_3008_ + i_3009_;
				    int i_3011_ = ((i_3008_ & 0xff00ff)
						   + (i_3009_ & 0xff00ff));
				    int i_3012_
					= ((i_3011_ & 0x1000100)
					   + (i_3010_ - i_3011_ & 0x10000));
				    i_3012_ = (i_3010_ - i_3012_
					       | i_3012_ - (i_3012_ >>> 8));
				    if (i_3008_ == 0 && anInt9007 != 255) {
					i_3008_ = i_3012_;
					i_3012_ = is[i_2958_];
					i_3012_ = (((((i_3008_ & 0xff00ff)
						      * anInt9007)
						     + ((i_3012_ & 0xff00ff)
							* anInt9028))
						    & ~0xff00ff)
						   + ((((i_3008_ & 0xff00)
							* anInt9007)
						       + ((i_3012_ & 0xff00)
							  * anInt9028))
						      & 0xff0000)) >> 8;
				    }
				    is[i_2958_] = i_3012_;
				} else if (i == 2) {
				    int i_3013_ = aByteArray11422[i_2957_];
				    if (i_3013_ != 0) {
					int i_3014_
					    = anIntArray11423[i_3013_ & 0xff];
					int i_3015_
					    = ((i_3014_ & 0xff00ff) * anInt9007
					       & ~0xff00ff);
					int i_3016_
					    = ((i_3014_ & 0xff00) * anInt9007
					       & 0xff0000);
					i_3014_ = (((i_3015_ | i_3016_) >>> 8)
						   + anInt9034);
					int i_3017_ = is[i_2958_];
					int i_3018_ = i_3014_ + i_3017_;
					int i_3019_ = ((i_3014_ & 0xff00ff)
						       + (i_3017_ & 0xff00ff));
					i_3017_ = ((i_3019_ & 0x1000100)
						   + (i_3018_ - i_3019_
						      & 0x10000));
					is[i_2958_]
					    = (i_3018_ - i_3017_
					       | i_3017_ - (i_3017_ >>> 8));
				    }
				}
			    } else
				throw new IllegalArgumentException();
			    i_2952_ += anInt9006;
			}
		    }
		    i_2950_++;
		    anInt9022 += anInt9018;
		    anInt8999 += anInt9010;
		    anInt9015 += anInt9014;
		}
	    } else if (anInt9017 < 0) {
		for (int i_3020_ = anInt9023; i_3020_ < 0; i_3020_++) {
		    int i_3021_ = anInt9015;
		    int i_3022_ = anInt9022 + anInt9024;
		    int i_3023_ = anInt8999 + anInt9025;
		    int i_3024_ = anInt9011;
		    if (i_3022_ < 0) {
			int i_3025_ = (anInt9006 - 1 - i_3022_) / anInt9006;
			i_3024_ += i_3025_;
			i_3022_ += anInt9006 * i_3025_;
			i_3023_ += anInt9017 * i_3025_;
			i_3021_ += i_3025_;
		    }
		    int i_3026_;
		    if ((i_3026_ = (1 + i_3022_ - (anInt9000 << 12)
				    - anInt9006) / anInt9006)
			> i_3024_)
			i_3024_ = i_3026_;
		    if ((i_3026_ = i_3023_ - (anInt9001 << 12)) >= 0) {
			i_3026_ = (anInt9017 - i_3026_) / anInt9017;
			i_3024_ += i_3026_;
			i_3022_ += anInt9006 * i_3026_;
			i_3023_ += anInt9017 * i_3026_;
			i_3021_ += i_3026_;
		    }
		    if ((i_3026_ = (i_3023_ - anInt9017) / anInt9017)
			> i_3024_)
			i_3024_ = i_3026_;
		    for (/**/; i_3024_ < 0; i_3024_++) {
			int i_3027_
			    = (i_3023_ >> 12) * anInt9000 + (i_3022_ >> 12);
			int i_3028_ = i_3021_++;
			if (i_2535_ == 0) {
			    if (i == 1)
				is[i_3028_]
				    = (anIntArray11423
				       [aByteArray11422[i_3027_] & 0xff]);
			    else if (i == 0) {
				int i_3029_
				    = (anIntArray11423
				       [aByteArray11422[i_3027_] & 0xff]);
				int i_3030_ = ((i_3029_ & 0xff0000) * anInt9031
					       & ~0xffffff);
				int i_3031_ = ((i_3029_ & 0xff00) * anInt9030
					       & 0xff0000);
				int i_3032_
				    = (i_3029_ & 0xff) * anInt9027 & 0xff00;
				is[i_3028_]
				    = (i_3030_ | i_3031_ | i_3032_) >>> 8;
			    } else if (i == 3) {
				int i_3033_
				    = (anIntArray11423
				       [aByteArray11422[i_3027_] & 0xff]);
				int i_3034_ = anInt9026;
				int i_3035_ = i_3033_ + i_3034_;
				int i_3036_ = ((i_3033_ & 0xff00ff)
					       + (i_3034_ & 0xff00ff));
				int i_3037_
				    = ((i_3036_ & 0x1000100)
				       + (i_3035_ - i_3036_ & 0x10000));
				is[i_3028_]
				    = i_3035_ - i_3037_ | i_3037_ - (i_3037_
								     >>> 8);
			    } else if (i == 2) {
				int i_3038_
				    = (anIntArray11423
				       [aByteArray11422[i_3027_] & 0xff]);
				int i_3039_ = ((i_3038_ & 0xff00ff) * anInt9007
					       & ~0xff00ff);
				int i_3040_ = ((i_3038_ & 0xff00) * anInt9007
					       & 0xff0000);
				is[i_3028_]
				    = ((i_3039_ | i_3040_) >>> 8) + anInt9034;
			    } else
				throw new IllegalArgumentException();
			} else if (i_2535_ == 1) {
			    if (i == 1) {
				int i_3041_ = aByteArray11422[i_3027_];
				if (i_3041_ != 0)
				    is[i_3028_]
					= anIntArray11423[i_3041_ & 0xff];
			    } else if (i == 0) {
				int i_3042_ = aByteArray11422[i_3027_];
				if (i_3042_ != 0) {
				    int i_3043_
					= anIntArray11423[i_3042_ & 0xff];
				    if ((anInt9026 & 0xffffff) == 16777215) {
					int i_3044_ = anInt9026 >>> 24;
					int i_3045_ = 256 - i_3044_;
					int i_3046_ = is[i_3028_];
					is[i_3028_]
					    = ((((i_3043_ & 0xff00ff) * i_3044_
						 + ((i_3046_ & 0xff00ff)
						    * i_3045_))
						& ~0xff00ff)
					       + (((i_3043_ & 0xff00) * i_3044_
						   + ((i_3046_ & 0xff00)
						      * i_3045_))
						  & 0xff0000)) >> 8;
				    } else if (anInt9007 != 255) {
					int i_3047_
					    = ((i_3043_ & 0xff0000) * anInt9031
					       & ~0xffffff);
					int i_3048_
					    = ((i_3043_ & 0xff00) * anInt9030
					       & 0xff0000);
					int i_3049_
					    = ((i_3043_ & 0xff) * anInt9027
					       & 0xff00);
					i_3043_ = (i_3047_ | i_3048_
						   | i_3049_) >>> 8;
					int i_3050_ = is[i_3028_];
					is[i_3028_]
					    = (((((i_3043_ & 0xff00ff)
						  * anInt9007)
						 + ((i_3050_ & 0xff00ff)
						    * anInt9028))
						& ~0xff00ff)
					       + ((((i_3043_ & 0xff00)
						    * anInt9007)
						   + ((i_3050_ & 0xff00)
						      * anInt9028))
						  & 0xff0000)) >> 8;
				    } else {
					int i_3051_
					    = ((i_3043_ & 0xff0000) * anInt9031
					       & ~0xffffff);
					int i_3052_
					    = ((i_3043_ & 0xff00) * anInt9030
					       & 0xff0000);
					int i_3053_
					    = ((i_3043_ & 0xff) * anInt9027
					       & 0xff00);
					is[i_3028_] = (i_3051_ | i_3052_
						       | i_3053_) >>> 8;
				    }
				}
			    } else if (i == 3) {
				byte i_3054_ = aByteArray11422[i_3027_];
				int i_3055_ = (i_3054_ > 0
					       ? anIntArray11423[i_3054_] : 0);
				int i_3056_ = anInt9026;
				int i_3057_ = i_3055_ + i_3056_;
				int i_3058_ = ((i_3055_ & 0xff00ff)
					       + (i_3056_ & 0xff00ff));
				int i_3059_
				    = ((i_3058_ & 0x1000100)
				       + (i_3057_ - i_3058_ & 0x10000));
				i_3059_
				    = i_3057_ - i_3059_ | i_3059_ - (i_3059_
								     >>> 8);
				if (i_3055_ == 0 && anInt9007 != 255) {
				    i_3055_ = i_3059_;
				    i_3059_ = is[i_3028_];
				    i_3059_
					= ((((i_3055_ & 0xff00ff) * anInt9007
					     + ((i_3059_ & 0xff00ff)
						* anInt9028))
					    & ~0xff00ff)
					   + (((i_3055_ & 0xff00) * anInt9007
					       + ((i_3059_ & 0xff00)
						  * anInt9028))
					      & 0xff0000)) >> 8;
				}
				is[i_3028_] = i_3059_;
			    } else if (i == 2) {
				int i_3060_ = aByteArray11422[i_3027_];
				if (i_3060_ != 0) {
				    int i_3061_
					= anIntArray11423[i_3060_ & 0xff];
				    int i_3062_
					= ((i_3061_ & 0xff00ff) * anInt9007
					   & ~0xff00ff);
				    int i_3063_
					= ((i_3061_ & 0xff00) * anInt9007
					   & 0xff0000);
				    is[i_3028_++] = ((i_3062_ | i_3063_)
						     >>> 8) + anInt9034;
				}
			    } else
				throw new IllegalArgumentException();
			} else if (i_2535_ == 2) {
			    if (i == 1) {
				int i_3064_ = aByteArray11422[i_3027_];
				if (i_3064_ != 0) {
				    int i_3065_
					= anIntArray11423[i_3064_ & 0xff];
				    int i_3066_ = is[i_3028_];
				    int i_3067_ = i_3065_ + i_3066_;
				    int i_3068_ = ((i_3065_ & 0xff00ff)
						   + (i_3066_ & 0xff00ff));
				    i_3066_
					= ((i_3068_ & 0x1000100)
					   + (i_3067_ - i_3068_ & 0x10000));
				    is[i_3028_]
					= (i_3067_ - i_3066_
					   | i_3066_ - (i_3066_ >>> 8));
				}
			    } else if (i == 0) {
				int i_3069_ = aByteArray11422[i_3027_];
				if (i_3069_ != 0) {
				    int i_3070_
					= anIntArray11423[i_3069_ & 0xff];
				    int i_3071_
					= ((i_3070_ & 0xff0000) * anInt9031
					   & ~0xffffff);
				    int i_3072_
					= ((i_3070_ & 0xff00) * anInt9030
					   & 0xff0000);
				    int i_3073_ = ((i_3070_ & 0xff) * anInt9027
						   & 0xff00);
				    i_3070_
					= (i_3071_ | i_3072_ | i_3073_) >>> 8;
				    int i_3074_ = is[i_3028_];
				    int i_3075_ = i_3070_ + i_3074_;
				    int i_3076_ = ((i_3070_ & 0xff00ff)
						   + (i_3074_ & 0xff00ff));
				    i_3074_
					= ((i_3076_ & 0x1000100)
					   + (i_3075_ - i_3076_ & 0x10000));
				    is[i_3028_]
					= (i_3075_ - i_3074_
					   | i_3074_ - (i_3074_ >>> 8));
				}
			    } else if (i == 3) {
				byte i_3077_ = aByteArray11422[i_3027_];
				int i_3078_ = (i_3077_ > 0
					       ? anIntArray11423[i_3077_] : 0);
				int i_3079_ = anInt9026;
				int i_3080_ = i_3078_ + i_3079_;
				int i_3081_ = ((i_3078_ & 0xff00ff)
					       + (i_3079_ & 0xff00ff));
				int i_3082_
				    = ((i_3081_ & 0x1000100)
				       + (i_3080_ - i_3081_ & 0x10000));
				i_3082_
				    = i_3080_ - i_3082_ | i_3082_ - (i_3082_
								     >>> 8);
				if (i_3078_ == 0 && anInt9007 != 255) {
				    i_3078_ = i_3082_;
				    i_3082_ = is[i_3028_];
				    i_3082_
					= ((((i_3078_ & 0xff00ff) * anInt9007
					     + ((i_3082_ & 0xff00ff)
						* anInt9028))
					    & ~0xff00ff)
					   + (((i_3078_ & 0xff00) * anInt9007
					       + ((i_3082_ & 0xff00)
						  * anInt9028))
					      & 0xff0000)) >> 8;
				}
				is[i_3028_] = i_3082_;
			    } else if (i == 2) {
				int i_3083_ = aByteArray11422[i_3027_];
				if (i_3083_ != 0) {
				    int i_3084_
					= anIntArray11423[i_3083_ & 0xff];
				    int i_3085_
					= ((i_3084_ & 0xff00ff) * anInt9007
					   & ~0xff00ff);
				    int i_3086_
					= ((i_3084_ & 0xff00) * anInt9007
					   & 0xff0000);
				    i_3084_ = (((i_3085_ | i_3086_) >>> 8)
					       + anInt9034);
				    int i_3087_ = is[i_3028_];
				    int i_3088_ = i_3084_ + i_3087_;
				    int i_3089_ = ((i_3084_ & 0xff00ff)
						   + (i_3087_ & 0xff00ff));
				    i_3087_
					= ((i_3089_ & 0x1000100)
					   + (i_3088_ - i_3089_ & 0x10000));
				    is[i_3028_]
					= (i_3088_ - i_3087_
					   | i_3087_ - (i_3087_ >>> 8));
				}
			    }
			} else
			    throw new IllegalArgumentException();
			i_3022_ += anInt9006;
			i_3023_ += anInt9017;
		    }
		    anInt9022 += anInt9018;
		    anInt8999 += anInt9010;
		    anInt9015 += anInt9014;
		}
	    } else {
		for (int i_3090_ = anInt9023; i_3090_ < 0; i_3090_++) {
		    int i_3091_ = anInt9015;
		    int i_3092_ = anInt9022 + anInt9024;
		    int i_3093_ = anInt8999 + anInt9025;
		    int i_3094_ = anInt9011;
		    if (i_3092_ < 0) {
			int i_3095_ = (anInt9006 - 1 - i_3092_) / anInt9006;
			i_3094_ += i_3095_;
			i_3092_ += anInt9006 * i_3095_;
			i_3093_ += anInt9017 * i_3095_;
			i_3091_ += i_3095_;
		    }
		    int i_3096_;
		    if ((i_3096_ = (1 + i_3092_ - (anInt9000 << 12)
				    - anInt9006) / anInt9006)
			> i_3094_)
			i_3094_ = i_3096_;
		    if (i_3093_ < 0) {
			i_3096_ = (anInt9017 - 1 - i_3093_) / anInt9017;
			i_3094_ += i_3096_;
			i_3092_ += anInt9006 * i_3096_;
			i_3093_ += anInt9017 * i_3096_;
			i_3091_ += i_3096_;
		    }
		    if ((i_3096_ = (1 + i_3093_ - (anInt9001 << 12)
				    - anInt9017) / anInt9017)
			> i_3094_)
			i_3094_ = i_3096_;
		    for (/**/; i_3094_ < 0; i_3094_++) {
			int i_3097_
			    = (i_3093_ >> 12) * anInt9000 + (i_3092_ >> 12);
			int i_3098_ = i_3091_++;
			if (i_2535_ == 0) {
			    if (i == 1)
				is[i_3098_]
				    = (anIntArray11423
				       [aByteArray11422[i_3097_] & 0xff]);
			    else if (i == 0) {
				int i_3099_
				    = (anIntArray11423
				       [aByteArray11422[i_3097_] & 0xff]);
				int i_3100_ = ((i_3099_ & 0xff0000) * anInt9031
					       & ~0xffffff);
				int i_3101_ = ((i_3099_ & 0xff00) * anInt9030
					       & 0xff0000);
				int i_3102_
				    = (i_3099_ & 0xff) * anInt9027 & 0xff00;
				is[i_3098_]
				    = (i_3100_ | i_3101_ | i_3102_) >>> 8;
			    } else if (i == 3) {
				int i_3103_
				    = (anIntArray11423
				       [aByteArray11422[i_3097_] & 0xff]);
				int i_3104_ = anInt9026;
				int i_3105_ = i_3103_ + i_3104_;
				int i_3106_ = ((i_3103_ & 0xff00ff)
					       + (i_3104_ & 0xff00ff));
				int i_3107_
				    = ((i_3106_ & 0x1000100)
				       + (i_3105_ - i_3106_ & 0x10000));
				is[i_3098_]
				    = i_3105_ - i_3107_ | i_3107_ - (i_3107_
								     >>> 8);
			    } else if (i == 2) {
				int i_3108_
				    = (anIntArray11423
				       [aByteArray11422[i_3097_] & 0xff]);
				int i_3109_ = ((i_3108_ & 0xff00ff) * anInt9007
					       & ~0xff00ff);
				int i_3110_ = ((i_3108_ & 0xff00) * anInt9007
					       & 0xff0000);
				is[i_3098_]
				    = ((i_3109_ | i_3110_) >>> 8) + anInt9034;
			    } else
				throw new IllegalArgumentException();
			} else if (i_2535_ == 1) {
			    if (i == 1) {
				int i_3111_ = aByteArray11422[i_3097_];
				if (i_3111_ != 0)
				    is[i_3098_]
					= anIntArray11423[i_3111_ & 0xff];
			    } else if (i == 0) {
				int i_3112_ = aByteArray11422[i_3097_];
				if (i_3112_ != 0) {
				    int i_3113_
					= anIntArray11423[i_3112_ & 0xff];
				    if ((anInt9026 & 0xffffff) == 16777215) {
					int i_3114_ = anInt9026 >>> 24;
					int i_3115_ = 256 - i_3114_;
					int i_3116_ = is[i_3098_];
					is[i_3098_]
					    = ((((i_3113_ & 0xff00ff) * i_3114_
						 + ((i_3116_ & 0xff00ff)
						    * i_3115_))
						& ~0xff00ff)
					       + (((i_3113_ & 0xff00) * i_3114_
						   + ((i_3116_ & 0xff00)
						      * i_3115_))
						  & 0xff0000)) >> 8;
				    } else if (anInt9007 != 255) {
					int i_3117_
					    = ((i_3113_ & 0xff0000) * anInt9031
					       & ~0xffffff);
					int i_3118_
					    = ((i_3113_ & 0xff00) * anInt9030
					       & 0xff0000);
					int i_3119_
					    = ((i_3113_ & 0xff) * anInt9027
					       & 0xff00);
					i_3113_ = (i_3117_ | i_3118_
						   | i_3119_) >>> 8;
					int i_3120_ = is[i_3098_];
					is[i_3098_]
					    = (((((i_3113_ & 0xff00ff)
						  * anInt9007)
						 + ((i_3120_ & 0xff00ff)
						    * anInt9028))
						& ~0xff00ff)
					       + ((((i_3113_ & 0xff00)
						    * anInt9007)
						   + ((i_3120_ & 0xff00)
						      * anInt9028))
						  & 0xff0000)) >> 8;
				    } else {
					int i_3121_
					    = ((i_3113_ & 0xff0000) * anInt9031
					       & ~0xffffff);
					int i_3122_
					    = ((i_3113_ & 0xff00) * anInt9030
					       & 0xff0000);
					int i_3123_
					    = ((i_3113_ & 0xff) * anInt9027
					       & 0xff00);
					is[i_3098_] = (i_3121_ | i_3122_
						       | i_3123_) >>> 8;
				    }
				}
			    } else if (i == 3) {
				byte i_3124_ = aByteArray11422[i_3097_];
				int i_3125_ = (i_3124_ > 0
					       ? anIntArray11423[i_3124_] : 0);
				int i_3126_ = anInt9026;
				int i_3127_ = i_3125_ + i_3126_;
				int i_3128_ = ((i_3125_ & 0xff00ff)
					       + (i_3126_ & 0xff00ff));
				int i_3129_
				    = ((i_3128_ & 0x1000100)
				       + (i_3127_ - i_3128_ & 0x10000));
				i_3129_
				    = i_3127_ - i_3129_ | i_3129_ - (i_3129_
								     >>> 8);
				if (i_3125_ == 0 && anInt9007 != 255) {
				    i_3125_ = i_3129_;
				    i_3129_ = is[i_3098_];
				    i_3129_
					= ((((i_3125_ & 0xff00ff) * anInt9007
					     + ((i_3129_ & 0xff00ff)
						* anInt9028))
					    & ~0xff00ff)
					   + (((i_3125_ & 0xff00) * anInt9007
					       + ((i_3129_ & 0xff00)
						  * anInt9028))
					      & 0xff0000)) >> 8;
				}
				is[i_3098_] = i_3129_;
			    } else if (i == 2) {
				int i_3130_ = aByteArray11422[i_3097_];
				if (i_3130_ != 0) {
				    int i_3131_
					= anIntArray11423[i_3130_ & 0xff];
				    int i_3132_
					= ((i_3131_ & 0xff00ff) * anInt9007
					   & ~0xff00ff);
				    int i_3133_
					= ((i_3131_ & 0xff00) * anInt9007
					   & 0xff0000);
				    is[i_3098_++] = ((i_3132_ | i_3133_)
						     >>> 8) + anInt9034;
				}
			    } else
				throw new IllegalArgumentException();
			} else if (i_2535_ == 2) {
			    if (i == 1) {
				int i_3134_ = aByteArray11422[i_3097_];
				if (i_3134_ != 0) {
				    int i_3135_
					= anIntArray11423[i_3134_ & 0xff];
				    int i_3136_ = is[i_3098_];
				    int i_3137_ = i_3135_ + i_3136_;
				    int i_3138_ = ((i_3135_ & 0xff00ff)
						   + (i_3136_ & 0xff00ff));
				    i_3136_
					= ((i_3138_ & 0x1000100)
					   + (i_3137_ - i_3138_ & 0x10000));
				    is[i_3098_]
					= (i_3137_ - i_3136_
					   | i_3136_ - (i_3136_ >>> 8));
				}
			    } else if (i == 0) {
				int i_3139_ = aByteArray11422[i_3097_];
				if (i_3139_ != 0) {
				    int i_3140_
					= anIntArray11423[i_3139_ & 0xff];
				    int i_3141_
					= ((i_3140_ & 0xff0000) * anInt9031
					   & ~0xffffff);
				    int i_3142_
					= ((i_3140_ & 0xff00) * anInt9030
					   & 0xff0000);
				    int i_3143_ = ((i_3140_ & 0xff) * anInt9027
						   & 0xff00);
				    i_3140_
					= (i_3141_ | i_3142_ | i_3143_) >>> 8;
				    int i_3144_ = is[i_3098_];
				    int i_3145_ = i_3140_ + i_3144_;
				    int i_3146_ = ((i_3140_ & 0xff00ff)
						   + (i_3144_ & 0xff00ff));
				    i_3144_
					= ((i_3146_ & 0x1000100)
					   + (i_3145_ - i_3146_ & 0x10000));
				    is[i_3098_]
					= (i_3145_ - i_3144_
					   | i_3144_ - (i_3144_ >>> 8));
				}
			    } else if (i == 3) {
				byte i_3147_ = aByteArray11422[i_3097_];
				int i_3148_ = (i_3147_ > 0
					       ? anIntArray11423[i_3147_] : 0);
				int i_3149_ = anInt9026;
				int i_3150_ = i_3148_ + i_3149_;
				int i_3151_ = ((i_3148_ & 0xff00ff)
					       + (i_3149_ & 0xff00ff));
				int i_3152_
				    = ((i_3151_ & 0x1000100)
				       + (i_3150_ - i_3151_ & 0x10000));
				i_3152_
				    = i_3150_ - i_3152_ | i_3152_ - (i_3152_
								     >>> 8);
				if (i_3148_ == 0 && anInt9007 != 255) {
				    i_3148_ = i_3152_;
				    i_3152_ = is[i_3098_];
				    i_3152_
					= ((((i_3148_ & 0xff00ff) * anInt9007
					     + ((i_3152_ & 0xff00ff)
						* anInt9028))
					    & ~0xff00ff)
					   + (((i_3148_ & 0xff00) * anInt9007
					       + ((i_3152_ & 0xff00)
						  * anInt9028))
					      & 0xff0000)) >> 8;
				}
				is[i_3098_] = i_3152_;
			    } else if (i == 2) {
				int i_3153_ = aByteArray11422[i_3097_];
				if (i_3153_ != 0) {
				    int i_3154_
					= anIntArray11423[i_3153_ & 0xff];
				    int i_3155_
					= ((i_3154_ & 0xff00ff) * anInt9007
					   & ~0xff00ff);
				    int i_3156_
					= ((i_3154_ & 0xff00) * anInt9007
					   & 0xff0000);
				    i_3154_ = (((i_3155_ | i_3156_) >>> 8)
					       + anInt9034);
				    int i_3157_ = is[i_3098_];
				    int i_3158_ = i_3154_ + i_3157_;
				    int i_3159_ = ((i_3154_ & 0xff00ff)
						   + (i_3157_ & 0xff00ff));
				    i_3157_
					= ((i_3159_ & 0x1000100)
					   + (i_3158_ - i_3159_ & 0x10000));
				    is[i_3098_]
					= (i_3158_ - i_3157_
					   | i_3157_ - (i_3157_ >>> 8));
				}
			    }
			} else
			    throw new IllegalArgumentException();
			i_3092_ += anInt9006;
			i_3093_ += anInt9017;
		    }
		    anInt9022 += anInt9018;
		    anInt8999 += anInt9010;
		    anInt9015 += anInt9014;
		}
	    }
	}
    }
    
    void method14548(int i, int i_3160_) {
	int[] is = aClass182_Sub2_9033.anIntArray9466;
	if (is != null) {
	    if (anInt9006 == 0) {
		if (anInt9017 == 0) {
		    int i_3161_ = anInt9023;
		    while (i_3161_ < 0) {
			int i_3162_ = anInt9015;
			int i_3163_ = anInt9022;
			int i_3164_ = anInt8999;
			int i_3165_ = anInt9011;
			if (i_3163_ >= 0 && i_3164_ >= 0
			    && i_3163_ - (anInt9000 << 12) < 0
			    && i_3164_ - (anInt9001 << 12) < 0) {
			    for (/**/; i_3165_ < 0; i_3165_++) {
				int i_3166_ = ((i_3164_ >> 12) * anInt9000
					       + (i_3163_ >> 12));
				int i_3167_ = i_3162_++;
				if (i_3160_ == 0) {
				    if (i == 1)
					is[i_3167_]
					    = (anIntArray11423
					       [(aByteArray11422[i_3166_]
						 & 0xff)]);
				    else if (i == 0) {
					int i_3168_
					    = (anIntArray11423
					       [(aByteArray11422[i_3166_]
						 & 0xff)]);
					int i_3169_
					    = ((i_3168_ & 0xff0000) * anInt9031
					       & ~0xffffff);
					int i_3170_
					    = ((i_3168_ & 0xff00) * anInt9030
					       & 0xff0000);
					int i_3171_
					    = ((i_3168_ & 0xff) * anInt9027
					       & 0xff00);
					is[i_3167_] = (i_3169_ | i_3170_
						       | i_3171_) >>> 8;
				    } else if (i == 3) {
					int i_3172_
					    = (anIntArray11423
					       [(aByteArray11422[i_3166_]
						 & 0xff)]);
					int i_3173_ = anInt9026;
					int i_3174_ = i_3172_ + i_3173_;
					int i_3175_ = ((i_3172_ & 0xff00ff)
						       + (i_3173_ & 0xff00ff));
					int i_3176_ = ((i_3175_ & 0x1000100)
						       + (i_3174_ - i_3175_
							  & 0x10000));
					is[i_3167_]
					    = (i_3174_ - i_3176_
					       | i_3176_ - (i_3176_ >>> 8));
				    } else if (i == 2) {
					int i_3177_
					    = (anIntArray11423
					       [(aByteArray11422[i_3166_]
						 & 0xff)]);
					int i_3178_
					    = ((i_3177_ & 0xff00ff) * anInt9007
					       & ~0xff00ff);
					int i_3179_
					    = ((i_3177_ & 0xff00) * anInt9007
					       & 0xff0000);
					is[i_3167_] = ((i_3178_ | i_3179_)
						       >>> 8) + anInt9034;
				    } else
					throw new IllegalArgumentException();
				} else if (i_3160_ == 1) {
				    if (i == 1) {
					int i_3180_ = aByteArray11422[i_3166_];
					if (i_3180_ != 0)
					    is[i_3167_] = (anIntArray11423
							   [i_3180_ & 0xff]);
				    } else if (i == 0) {
					int i_3181_ = aByteArray11422[i_3166_];
					if (i_3181_ != 0) {
					    int i_3182_ = (anIntArray11423
							   [i_3181_ & 0xff]);
					    if ((anInt9026 & 0xffffff)
						== 16777215) {
						int i_3183_ = anInt9026 >>> 24;
						int i_3184_ = 256 - i_3183_;
						int i_3185_ = is[i_3167_];
						is[i_3167_]
						    = (((((i_3182_ & 0xff00ff)
							  * i_3183_)
							 + ((i_3185_
							     & 0xff00ff)
							    * i_3184_))
							& ~0xff00ff)
						       + ((((i_3182_ & 0xff00)
							    * i_3183_)
							   + ((i_3185_
							       & 0xff00)
							      * i_3184_))
							  & 0xff0000)) >> 8;
					    } else if (anInt9007 != 255) {
						int i_3186_
						    = (((i_3182_ & 0xff0000)
							* anInt9031)
						       & ~0xffffff);
						int i_3187_
						    = (((i_3182_ & 0xff00)
							* anInt9030)
						       & 0xff0000);
						int i_3188_
						    = (((i_3182_ & 0xff)
							* anInt9027)
						       & 0xff00);
						i_3182_ = (i_3186_ | i_3187_
							   | i_3188_) >>> 8;
						int i_3189_ = is[i_3167_];
						is[i_3167_]
						    = (((((i_3182_ & 0xff00ff)
							  * anInt9007)
							 + ((i_3189_
							     & 0xff00ff)
							    * anInt9028))
							& ~0xff00ff)
						       + ((((i_3182_ & 0xff00)
							    * anInt9007)
							   + ((i_3189_
							       & 0xff00)
							      * anInt9028))
							  & 0xff0000)) >> 8;
					    } else {
						int i_3190_
						    = (((i_3182_ & 0xff0000)
							* anInt9031)
						       & ~0xffffff);
						int i_3191_
						    = (((i_3182_ & 0xff00)
							* anInt9030)
						       & 0xff0000);
						int i_3192_
						    = (((i_3182_ & 0xff)
							* anInt9027)
						       & 0xff00);
						is[i_3167_]
						    = (i_3190_ | i_3191_
						       | i_3192_) >>> 8;
					    }
					}
				    } else if (i == 3) {
					byte i_3193_
					    = aByteArray11422[i_3166_];
					int i_3194_
					    = (i_3193_ > 0
					       ? anIntArray11423[i_3193_] : 0);
					int i_3195_ = anInt9026;
					int i_3196_ = i_3194_ + i_3195_;
					int i_3197_ = ((i_3194_ & 0xff00ff)
						       + (i_3195_ & 0xff00ff));
					int i_3198_ = ((i_3197_ & 0x1000100)
						       + (i_3196_ - i_3197_
							  & 0x10000));
					i_3198_
					    = (i_3196_ - i_3198_
					       | i_3198_ - (i_3198_ >>> 8));
					if (i_3194_ == 0 && anInt9007 != 255) {
					    i_3194_ = i_3198_;
					    i_3198_ = is[i_3167_];
					    i_3198_
						= (((((i_3194_ & 0xff00ff)
						      * anInt9007)
						     + ((i_3198_ & 0xff00ff)
							* anInt9028))
						    & ~0xff00ff)
						   + ((((i_3194_ & 0xff00)
							* anInt9007)
						       + ((i_3198_ & 0xff00)
							  * anInt9028))
						      & 0xff0000)) >> 8;
					}
					is[i_3167_] = i_3198_;
				    } else if (i == 2) {
					int i_3199_ = aByteArray11422[i_3166_];
					if (i_3199_ != 0) {
					    int i_3200_ = (anIntArray11423
							   [i_3199_ & 0xff]);
					    int i_3201_
						= (((i_3200_ & 0xff00ff)
						    * anInt9007)
						   & ~0xff00ff);
					    int i_3202_ = (((i_3200_ & 0xff00)
							    * anInt9007)
							   & 0xff0000);
					    is[i_3167_++]
						= (((i_3201_ | i_3202_) >>> 8)
						   + anInt9034);
					}
				    } else
					throw new IllegalArgumentException();
				} else if (i_3160_ == 2) {
				    if (i == 1) {
					int i_3203_ = aByteArray11422[i_3166_];
					if (i_3203_ != 0) {
					    int i_3204_ = (anIntArray11423
							   [i_3203_ & 0xff]);
					    int i_3205_ = is[i_3167_];
					    int i_3206_ = i_3204_ + i_3205_;
					    int i_3207_
						= ((i_3204_ & 0xff00ff)
						   + (i_3205_ & 0xff00ff));
					    i_3205_ = ((i_3207_ & 0x1000100)
						       + (i_3206_ - i_3207_
							  & 0x10000));
					    is[i_3167_]
						= (i_3206_ - i_3205_
						   | i_3205_ - (i_3205_
								>>> 8));
					}
				    } else if (i == 0) {
					int i_3208_ = aByteArray11422[i_3166_];
					if (i_3208_ != 0) {
					    int i_3209_ = (anIntArray11423
							   [i_3208_ & 0xff]);
					    int i_3210_
						= (((i_3209_ & 0xff0000)
						    * anInt9031)
						   & ~0xffffff);
					    int i_3211_ = (((i_3209_ & 0xff00)
							    * anInt9030)
							   & 0xff0000);
					    int i_3212_
						= ((i_3209_ & 0xff) * anInt9027
						   & 0xff00);
					    i_3209_ = (i_3210_ | i_3211_
						       | i_3212_) >>> 8;
					    int i_3213_ = is[i_3167_];
					    int i_3214_ = i_3209_ + i_3213_;
					    int i_3215_
						= ((i_3209_ & 0xff00ff)
						   + (i_3213_ & 0xff00ff));
					    i_3213_ = ((i_3215_ & 0x1000100)
						       + (i_3214_ - i_3215_
							  & 0x10000));
					    is[i_3167_]
						= (i_3214_ - i_3213_
						   | i_3213_ - (i_3213_
								>>> 8));
					}
				    } else if (i == 3) {
					byte i_3216_
					    = aByteArray11422[i_3166_];
					int i_3217_
					    = (i_3216_ > 0
					       ? anIntArray11423[i_3216_] : 0);
					int i_3218_ = anInt9026;
					int i_3219_ = i_3217_ + i_3218_;
					int i_3220_ = ((i_3217_ & 0xff00ff)
						       + (i_3218_ & 0xff00ff));
					int i_3221_ = ((i_3220_ & 0x1000100)
						       + (i_3219_ - i_3220_
							  & 0x10000));
					i_3221_
					    = (i_3219_ - i_3221_
					       | i_3221_ - (i_3221_ >>> 8));
					if (i_3217_ == 0 && anInt9007 != 255) {
					    i_3217_ = i_3221_;
					    i_3221_ = is[i_3167_];
					    i_3221_
						= (((((i_3217_ & 0xff00ff)
						      * anInt9007)
						     + ((i_3221_ & 0xff00ff)
							* anInt9028))
						    & ~0xff00ff)
						   + ((((i_3217_ & 0xff00)
							* anInt9007)
						       + ((i_3221_ & 0xff00)
							  * anInt9028))
						      & 0xff0000)) >> 8;
					}
					is[i_3167_] = i_3221_;
				    } else if (i == 2) {
					int i_3222_ = aByteArray11422[i_3166_];
					if (i_3222_ != 0) {
					    int i_3223_ = (anIntArray11423
							   [i_3222_ & 0xff]);
					    int i_3224_
						= (((i_3223_ & 0xff00ff)
						    * anInt9007)
						   & ~0xff00ff);
					    int i_3225_ = (((i_3223_ & 0xff00)
							    * anInt9007)
							   & 0xff0000);
					    i_3223_ = ((i_3224_ | i_3225_)
						       >>> 8) + anInt9034;
					    int i_3226_ = is[i_3167_];
					    int i_3227_ = i_3223_ + i_3226_;
					    int i_3228_
						= ((i_3223_ & 0xff00ff)
						   + (i_3226_ & 0xff00ff));
					    i_3226_ = ((i_3228_ & 0x1000100)
						       + (i_3227_ - i_3228_
							  & 0x10000));
					    is[i_3167_]
						= (i_3227_ - i_3226_
						   | i_3226_ - (i_3226_
								>>> 8));
					}
				    }
				} else
				    throw new IllegalArgumentException();
			    }
			}
			i_3161_++;
			anInt9015 += anInt9014;
		    }
		} else if (anInt9017 < 0) {
		    int i_3229_ = anInt9023;
		    while (i_3229_ < 0) {
			int i_3230_ = anInt9015;
			int i_3231_ = anInt9022;
			int i_3232_ = anInt8999 + anInt9025;
			int i_3233_ = anInt9011;
			if (i_3231_ >= 0 && i_3231_ - (anInt9000 << 12) < 0) {
			    int i_3234_;
			    if ((i_3234_ = i_3232_ - (anInt9001 << 12)) >= 0) {
				i_3234_ = (anInt9017 - i_3234_) / anInt9017;
				i_3233_ += i_3234_;
				i_3232_ += anInt9017 * i_3234_;
				i_3230_ += i_3234_;
			    }
			    if ((i_3234_ = (i_3232_ - anInt9017) / anInt9017)
				> i_3233_)
				i_3233_ = i_3234_;
			    for (/**/; i_3233_ < 0; i_3233_++) {
				int i_3235_ = ((i_3232_ >> 12) * anInt9000
					       + (i_3231_ >> 12));
				int i_3236_ = i_3230_++;
				if (i_3160_ == 0) {
				    if (i == 1)
					is[i_3236_]
					    = (anIntArray11423
					       [(aByteArray11422[i_3235_]
						 & 0xff)]);
				    else if (i == 0) {
					int i_3237_
					    = (anIntArray11423
					       [(aByteArray11422[i_3235_]
						 & 0xff)]);
					int i_3238_
					    = ((i_3237_ & 0xff0000) * anInt9031
					       & ~0xffffff);
					int i_3239_
					    = ((i_3237_ & 0xff00) * anInt9030
					       & 0xff0000);
					int i_3240_
					    = ((i_3237_ & 0xff) * anInt9027
					       & 0xff00);
					is[i_3236_] = (i_3238_ | i_3239_
						       | i_3240_) >>> 8;
				    } else if (i == 3) {
					int i_3241_
					    = (anIntArray11423
					       [(aByteArray11422[i_3235_]
						 & 0xff)]);
					int i_3242_ = anInt9026;
					int i_3243_ = i_3241_ + i_3242_;
					int i_3244_ = ((i_3241_ & 0xff00ff)
						       + (i_3242_ & 0xff00ff));
					int i_3245_ = ((i_3244_ & 0x1000100)
						       + (i_3243_ - i_3244_
							  & 0x10000));
					is[i_3236_]
					    = (i_3243_ - i_3245_
					       | i_3245_ - (i_3245_ >>> 8));
				    } else if (i == 2) {
					int i_3246_
					    = (anIntArray11423
					       [(aByteArray11422[i_3235_]
						 & 0xff)]);
					int i_3247_
					    = ((i_3246_ & 0xff00ff) * anInt9007
					       & ~0xff00ff);
					int i_3248_
					    = ((i_3246_ & 0xff00) * anInt9007
					       & 0xff0000);
					is[i_3236_] = ((i_3247_ | i_3248_)
						       >>> 8) + anInt9034;
				    } else
					throw new IllegalArgumentException();
				} else if (i_3160_ == 1) {
				    if (i == 1) {
					int i_3249_ = aByteArray11422[i_3235_];
					if (i_3249_ != 0)
					    is[i_3236_] = (anIntArray11423
							   [i_3249_ & 0xff]);
				    } else if (i == 0) {
					int i_3250_ = aByteArray11422[i_3235_];
					if (i_3250_ != 0) {
					    int i_3251_ = (anIntArray11423
							   [i_3250_ & 0xff]);
					    if ((anInt9026 & 0xffffff)
						== 16777215) {
						int i_3252_ = anInt9026 >>> 24;
						int i_3253_ = 256 - i_3252_;
						int i_3254_ = is[i_3236_];
						is[i_3236_]
						    = (((((i_3251_ & 0xff00ff)
							  * i_3252_)
							 + ((i_3254_
							     & 0xff00ff)
							    * i_3253_))
							& ~0xff00ff)
						       + ((((i_3251_ & 0xff00)
							    * i_3252_)
							   + ((i_3254_
							       & 0xff00)
							      * i_3253_))
							  & 0xff0000)) >> 8;
					    } else if (anInt9007 != 255) {
						int i_3255_
						    = (((i_3251_ & 0xff0000)
							* anInt9031)
						       & ~0xffffff);
						int i_3256_
						    = (((i_3251_ & 0xff00)
							* anInt9030)
						       & 0xff0000);
						int i_3257_
						    = (((i_3251_ & 0xff)
							* anInt9027)
						       & 0xff00);
						i_3251_ = (i_3255_ | i_3256_
							   | i_3257_) >>> 8;
						int i_3258_ = is[i_3236_];
						is[i_3236_]
						    = (((((i_3251_ & 0xff00ff)
							  * anInt9007)
							 + ((i_3258_
							     & 0xff00ff)
							    * anInt9028))
							& ~0xff00ff)
						       + ((((i_3251_ & 0xff00)
							    * anInt9007)
							   + ((i_3258_
							       & 0xff00)
							      * anInt9028))
							  & 0xff0000)) >> 8;
					    } else {
						int i_3259_
						    = (((i_3251_ & 0xff0000)
							* anInt9031)
						       & ~0xffffff);
						int i_3260_
						    = (((i_3251_ & 0xff00)
							* anInt9030)
						       & 0xff0000);
						int i_3261_
						    = (((i_3251_ & 0xff)
							* anInt9027)
						       & 0xff00);
						is[i_3236_]
						    = (i_3259_ | i_3260_
						       | i_3261_) >>> 8;
					    }
					}
				    } else if (i == 3) {
					byte i_3262_
					    = aByteArray11422[i_3235_];
					int i_3263_
					    = (i_3262_ > 0
					       ? anIntArray11423[i_3262_] : 0);
					int i_3264_ = anInt9026;
					int i_3265_ = i_3263_ + i_3264_;
					int i_3266_ = ((i_3263_ & 0xff00ff)
						       + (i_3264_ & 0xff00ff));
					int i_3267_ = ((i_3266_ & 0x1000100)
						       + (i_3265_ - i_3266_
							  & 0x10000));
					i_3267_
					    = (i_3265_ - i_3267_
					       | i_3267_ - (i_3267_ >>> 8));
					if (i_3263_ == 0 && anInt9007 != 255) {
					    i_3263_ = i_3267_;
					    i_3267_ = is[i_3236_];
					    i_3267_
						= (((((i_3263_ & 0xff00ff)
						      * anInt9007)
						     + ((i_3267_ & 0xff00ff)
							* anInt9028))
						    & ~0xff00ff)
						   + ((((i_3263_ & 0xff00)
							* anInt9007)
						       + ((i_3267_ & 0xff00)
							  * anInt9028))
						      & 0xff0000)) >> 8;
					}
					is[i_3236_] = i_3267_;
				    } else if (i == 2) {
					int i_3268_ = aByteArray11422[i_3235_];
					if (i_3268_ != 0) {
					    int i_3269_ = (anIntArray11423
							   [i_3268_ & 0xff]);
					    int i_3270_
						= (((i_3269_ & 0xff00ff)
						    * anInt9007)
						   & ~0xff00ff);
					    int i_3271_ = (((i_3269_ & 0xff00)
							    * anInt9007)
							   & 0xff0000);
					    is[i_3236_++]
						= (((i_3270_ | i_3271_) >>> 8)
						   + anInt9034);
					}
				    } else
					throw new IllegalArgumentException();
				} else if (i_3160_ == 2) {
				    if (i == 1) {
					int i_3272_ = aByteArray11422[i_3235_];
					if (i_3272_ != 0) {
					    int i_3273_ = (anIntArray11423
							   [i_3272_ & 0xff]);
					    int i_3274_ = is[i_3236_];
					    int i_3275_ = i_3273_ + i_3274_;
					    int i_3276_
						= ((i_3273_ & 0xff00ff)
						   + (i_3274_ & 0xff00ff));
					    i_3274_ = ((i_3276_ & 0x1000100)
						       + (i_3275_ - i_3276_
							  & 0x10000));
					    is[i_3236_]
						= (i_3275_ - i_3274_
						   | i_3274_ - (i_3274_
								>>> 8));
					}
				    } else if (i == 0) {
					int i_3277_ = aByteArray11422[i_3235_];
					if (i_3277_ != 0) {
					    int i_3278_ = (anIntArray11423
							   [i_3277_ & 0xff]);
					    int i_3279_
						= (((i_3278_ & 0xff0000)
						    * anInt9031)
						   & ~0xffffff);
					    int i_3280_ = (((i_3278_ & 0xff00)
							    * anInt9030)
							   & 0xff0000);
					    int i_3281_
						= ((i_3278_ & 0xff) * anInt9027
						   & 0xff00);
					    i_3278_ = (i_3279_ | i_3280_
						       | i_3281_) >>> 8;
					    int i_3282_ = is[i_3236_];
					    int i_3283_ = i_3278_ + i_3282_;
					    int i_3284_
						= ((i_3278_ & 0xff00ff)
						   + (i_3282_ & 0xff00ff));
					    i_3282_ = ((i_3284_ & 0x1000100)
						       + (i_3283_ - i_3284_
							  & 0x10000));
					    is[i_3236_]
						= (i_3283_ - i_3282_
						   | i_3282_ - (i_3282_
								>>> 8));
					}
				    } else if (i == 3) {
					byte i_3285_
					    = aByteArray11422[i_3235_];
					int i_3286_
					    = (i_3285_ > 0
					       ? anIntArray11423[i_3285_] : 0);
					int i_3287_ = anInt9026;
					int i_3288_ = i_3286_ + i_3287_;
					int i_3289_ = ((i_3286_ & 0xff00ff)
						       + (i_3287_ & 0xff00ff));
					int i_3290_ = ((i_3289_ & 0x1000100)
						       + (i_3288_ - i_3289_
							  & 0x10000));
					i_3290_
					    = (i_3288_ - i_3290_
					       | i_3290_ - (i_3290_ >>> 8));
					if (i_3286_ == 0 && anInt9007 != 255) {
					    i_3286_ = i_3290_;
					    i_3290_ = is[i_3236_];
					    i_3290_
						= (((((i_3286_ & 0xff00ff)
						      * anInt9007)
						     + ((i_3290_ & 0xff00ff)
							* anInt9028))
						    & ~0xff00ff)
						   + ((((i_3286_ & 0xff00)
							* anInt9007)
						       + ((i_3290_ & 0xff00)
							  * anInt9028))
						      & 0xff0000)) >> 8;
					}
					is[i_3236_] = i_3290_;
				    } else if (i == 2) {
					int i_3291_ = aByteArray11422[i_3235_];
					if (i_3291_ != 0) {
					    int i_3292_ = (anIntArray11423
							   [i_3291_ & 0xff]);
					    int i_3293_
						= (((i_3292_ & 0xff00ff)
						    * anInt9007)
						   & ~0xff00ff);
					    int i_3294_ = (((i_3292_ & 0xff00)
							    * anInt9007)
							   & 0xff0000);
					    i_3292_ = ((i_3293_ | i_3294_)
						       >>> 8) + anInt9034;
					    int i_3295_ = is[i_3236_];
					    int i_3296_ = i_3292_ + i_3295_;
					    int i_3297_
						= ((i_3292_ & 0xff00ff)
						   + (i_3295_ & 0xff00ff));
					    i_3295_ = ((i_3297_ & 0x1000100)
						       + (i_3296_ - i_3297_
							  & 0x10000));
					    is[i_3236_]
						= (i_3296_ - i_3295_
						   | i_3295_ - (i_3295_
								>>> 8));
					}
				    }
				} else
				    throw new IllegalArgumentException();
				i_3232_ += anInt9017;
			    }
			}
			i_3229_++;
			anInt9022 += anInt9018;
			anInt9015 += anInt9014;
		    }
		} else {
		    int i_3298_ = anInt9023;
		    while (i_3298_ < 0) {
			int i_3299_ = anInt9015;
			int i_3300_ = anInt9022;
			int i_3301_ = anInt8999 + anInt9025;
			int i_3302_ = anInt9011;
			if (i_3300_ >= 0 && i_3300_ - (anInt9000 << 12) < 0) {
			    if (i_3301_ < 0) {
				int i_3303_
				    = (anInt9017 - 1 - i_3301_) / anInt9017;
				i_3302_ += i_3303_;
				i_3301_ += anInt9017 * i_3303_;
				i_3299_ += i_3303_;
			    }
			    int i_3304_;
			    if ((i_3304_ = (1 + i_3301_ - (anInt9001 << 12)
					    - anInt9017) / anInt9017)
				> i_3302_)
				i_3302_ = i_3304_;
			    for (/**/; i_3302_ < 0; i_3302_++) {
				int i_3305_ = ((i_3301_ >> 12) * anInt9000
					       + (i_3300_ >> 12));
				int i_3306_ = i_3299_++;
				if (i_3160_ == 0) {
				    if (i == 1)
					is[i_3306_]
					    = (anIntArray11423
					       [(aByteArray11422[i_3305_]
						 & 0xff)]);
				    else if (i == 0) {
					int i_3307_
					    = (anIntArray11423
					       [(aByteArray11422[i_3305_]
						 & 0xff)]);
					int i_3308_
					    = ((i_3307_ & 0xff0000) * anInt9031
					       & ~0xffffff);
					int i_3309_
					    = ((i_3307_ & 0xff00) * anInt9030
					       & 0xff0000);
					int i_3310_
					    = ((i_3307_ & 0xff) * anInt9027
					       & 0xff00);
					is[i_3306_] = (i_3308_ | i_3309_
						       | i_3310_) >>> 8;
				    } else if (i == 3) {
					int i_3311_
					    = (anIntArray11423
					       [(aByteArray11422[i_3305_]
						 & 0xff)]);
					int i_3312_ = anInt9026;
					int i_3313_ = i_3311_ + i_3312_;
					int i_3314_ = ((i_3311_ & 0xff00ff)
						       + (i_3312_ & 0xff00ff));
					int i_3315_ = ((i_3314_ & 0x1000100)
						       + (i_3313_ - i_3314_
							  & 0x10000));
					is[i_3306_]
					    = (i_3313_ - i_3315_
					       | i_3315_ - (i_3315_ >>> 8));
				    } else if (i == 2) {
					int i_3316_
					    = (anIntArray11423
					       [(aByteArray11422[i_3305_]
						 & 0xff)]);
					int i_3317_
					    = ((i_3316_ & 0xff00ff) * anInt9007
					       & ~0xff00ff);
					int i_3318_
					    = ((i_3316_ & 0xff00) * anInt9007
					       & 0xff0000);
					is[i_3306_] = ((i_3317_ | i_3318_)
						       >>> 8) + anInt9034;
				    } else
					throw new IllegalArgumentException();
				} else if (i_3160_ == 1) {
				    if (i == 1) {
					int i_3319_ = aByteArray11422[i_3305_];
					if (i_3319_ != 0)
					    is[i_3306_] = (anIntArray11423
							   [i_3319_ & 0xff]);
				    } else if (i == 0) {
					int i_3320_ = aByteArray11422[i_3305_];
					if (i_3320_ != 0) {
					    int i_3321_ = (anIntArray11423
							   [i_3320_ & 0xff]);
					    if ((anInt9026 & 0xffffff)
						== 16777215) {
						int i_3322_ = anInt9026 >>> 24;
						int i_3323_ = 256 - i_3322_;
						int i_3324_ = is[i_3306_];
						is[i_3306_]
						    = (((((i_3321_ & 0xff00ff)
							  * i_3322_)
							 + ((i_3324_
							     & 0xff00ff)
							    * i_3323_))
							& ~0xff00ff)
						       + ((((i_3321_ & 0xff00)
							    * i_3322_)
							   + ((i_3324_
							       & 0xff00)
							      * i_3323_))
							  & 0xff0000)) >> 8;
					    } else if (anInt9007 != 255) {
						int i_3325_
						    = (((i_3321_ & 0xff0000)
							* anInt9031)
						       & ~0xffffff);
						int i_3326_
						    = (((i_3321_ & 0xff00)
							* anInt9030)
						       & 0xff0000);
						int i_3327_
						    = (((i_3321_ & 0xff)
							* anInt9027)
						       & 0xff00);
						i_3321_ = (i_3325_ | i_3326_
							   | i_3327_) >>> 8;
						int i_3328_ = is[i_3306_];
						is[i_3306_]
						    = (((((i_3321_ & 0xff00ff)
							  * anInt9007)
							 + ((i_3328_
							     & 0xff00ff)
							    * anInt9028))
							& ~0xff00ff)
						       + ((((i_3321_ & 0xff00)
							    * anInt9007)
							   + ((i_3328_
							       & 0xff00)
							      * anInt9028))
							  & 0xff0000)) >> 8;
					    } else {
						int i_3329_
						    = (((i_3321_ & 0xff0000)
							* anInt9031)
						       & ~0xffffff);
						int i_3330_
						    = (((i_3321_ & 0xff00)
							* anInt9030)
						       & 0xff0000);
						int i_3331_
						    = (((i_3321_ & 0xff)
							* anInt9027)
						       & 0xff00);
						is[i_3306_]
						    = (i_3329_ | i_3330_
						       | i_3331_) >>> 8;
					    }
					}
				    } else if (i == 3) {
					byte i_3332_
					    = aByteArray11422[i_3305_];
					int i_3333_
					    = (i_3332_ > 0
					       ? anIntArray11423[i_3332_] : 0);
					int i_3334_ = anInt9026;
					int i_3335_ = i_3333_ + i_3334_;
					int i_3336_ = ((i_3333_ & 0xff00ff)
						       + (i_3334_ & 0xff00ff));
					int i_3337_ = ((i_3336_ & 0x1000100)
						       + (i_3335_ - i_3336_
							  & 0x10000));
					i_3337_
					    = (i_3335_ - i_3337_
					       | i_3337_ - (i_3337_ >>> 8));
					if (i_3333_ == 0 && anInt9007 != 255) {
					    i_3333_ = i_3337_;
					    i_3337_ = is[i_3306_];
					    i_3337_
						= (((((i_3333_ & 0xff00ff)
						      * anInt9007)
						     + ((i_3337_ & 0xff00ff)
							* anInt9028))
						    & ~0xff00ff)
						   + ((((i_3333_ & 0xff00)
							* anInt9007)
						       + ((i_3337_ & 0xff00)
							  * anInt9028))
						      & 0xff0000)) >> 8;
					}
					is[i_3306_] = i_3337_;
				    } else if (i == 2) {
					int i_3338_ = aByteArray11422[i_3305_];
					if (i_3338_ != 0) {
					    int i_3339_ = (anIntArray11423
							   [i_3338_ & 0xff]);
					    int i_3340_
						= (((i_3339_ & 0xff00ff)
						    * anInt9007)
						   & ~0xff00ff);
					    int i_3341_ = (((i_3339_ & 0xff00)
							    * anInt9007)
							   & 0xff0000);
					    is[i_3306_++]
						= (((i_3340_ | i_3341_) >>> 8)
						   + anInt9034);
					}
				    } else
					throw new IllegalArgumentException();
				} else if (i_3160_ == 2) {
				    if (i == 1) {
					int i_3342_ = aByteArray11422[i_3305_];
					if (i_3342_ != 0) {
					    int i_3343_ = (anIntArray11423
							   [i_3342_ & 0xff]);
					    int i_3344_ = is[i_3306_];
					    int i_3345_ = i_3343_ + i_3344_;
					    int i_3346_
						= ((i_3343_ & 0xff00ff)
						   + (i_3344_ & 0xff00ff));
					    i_3344_ = ((i_3346_ & 0x1000100)
						       + (i_3345_ - i_3346_
							  & 0x10000));
					    is[i_3306_]
						= (i_3345_ - i_3344_
						   | i_3344_ - (i_3344_
								>>> 8));
					}
				    } else if (i == 0) {
					int i_3347_ = aByteArray11422[i_3305_];
					if (i_3347_ != 0) {
					    int i_3348_ = (anIntArray11423
							   [i_3347_ & 0xff]);
					    int i_3349_
						= (((i_3348_ & 0xff0000)
						    * anInt9031)
						   & ~0xffffff);
					    int i_3350_ = (((i_3348_ & 0xff00)
							    * anInt9030)
							   & 0xff0000);
					    int i_3351_
						= ((i_3348_ & 0xff) * anInt9027
						   & 0xff00);
					    i_3348_ = (i_3349_ | i_3350_
						       | i_3351_) >>> 8;
					    int i_3352_ = is[i_3306_];
					    int i_3353_ = i_3348_ + i_3352_;
					    int i_3354_
						= ((i_3348_ & 0xff00ff)
						   + (i_3352_ & 0xff00ff));
					    i_3352_ = ((i_3354_ & 0x1000100)
						       + (i_3353_ - i_3354_
							  & 0x10000));
					    is[i_3306_]
						= (i_3353_ - i_3352_
						   | i_3352_ - (i_3352_
								>>> 8));
					}
				    } else if (i == 3) {
					byte i_3355_
					    = aByteArray11422[i_3305_];
					int i_3356_
					    = (i_3355_ > 0
					       ? anIntArray11423[i_3355_] : 0);
					int i_3357_ = anInt9026;
					int i_3358_ = i_3356_ + i_3357_;
					int i_3359_ = ((i_3356_ & 0xff00ff)
						       + (i_3357_ & 0xff00ff));
					int i_3360_ = ((i_3359_ & 0x1000100)
						       + (i_3358_ - i_3359_
							  & 0x10000));
					i_3360_
					    = (i_3358_ - i_3360_
					       | i_3360_ - (i_3360_ >>> 8));
					if (i_3356_ == 0 && anInt9007 != 255) {
					    i_3356_ = i_3360_;
					    i_3360_ = is[i_3306_];
					    i_3360_
						= (((((i_3356_ & 0xff00ff)
						      * anInt9007)
						     + ((i_3360_ & 0xff00ff)
							* anInt9028))
						    & ~0xff00ff)
						   + ((((i_3356_ & 0xff00)
							* anInt9007)
						       + ((i_3360_ & 0xff00)
							  * anInt9028))
						      & 0xff0000)) >> 8;
					}
					is[i_3306_] = i_3360_;
				    } else if (i == 2) {
					int i_3361_ = aByteArray11422[i_3305_];
					if (i_3361_ != 0) {
					    int i_3362_ = (anIntArray11423
							   [i_3361_ & 0xff]);
					    int i_3363_
						= (((i_3362_ & 0xff00ff)
						    * anInt9007)
						   & ~0xff00ff);
					    int i_3364_ = (((i_3362_ & 0xff00)
							    * anInt9007)
							   & 0xff0000);
					    i_3362_ = ((i_3363_ | i_3364_)
						       >>> 8) + anInt9034;
					    int i_3365_ = is[i_3306_];
					    int i_3366_ = i_3362_ + i_3365_;
					    int i_3367_
						= ((i_3362_ & 0xff00ff)
						   + (i_3365_ & 0xff00ff));
					    i_3365_ = ((i_3367_ & 0x1000100)
						       + (i_3366_ - i_3367_
							  & 0x10000));
					    is[i_3306_]
						= (i_3366_ - i_3365_
						   | i_3365_ - (i_3365_
								>>> 8));
					}
				    }
				} else
				    throw new IllegalArgumentException();
				i_3301_ += anInt9017;
			    }
			}
			i_3298_++;
			anInt9022 += anInt9018;
			anInt9015 += anInt9014;
		    }
		}
	    } else if (anInt9006 < 0) {
		if (anInt9017 == 0) {
		    int i_3368_ = anInt9023;
		    while (i_3368_ < 0) {
			int i_3369_ = anInt9015;
			int i_3370_ = anInt9022 + anInt9024;
			int i_3371_ = anInt8999;
			int i_3372_ = anInt9011;
			if (i_3371_ >= 0 && i_3371_ - (anInt9001 << 12) < 0) {
			    int i_3373_;
			    if ((i_3373_ = i_3370_ - (anInt9000 << 12)) >= 0) {
				i_3373_ = (anInt9006 - i_3373_) / anInt9006;
				i_3372_ += i_3373_;
				i_3370_ += anInt9006 * i_3373_;
				i_3369_ += i_3373_;
			    }
			    if ((i_3373_ = (i_3370_ - anInt9006) / anInt9006)
				> i_3372_)
				i_3372_ = i_3373_;
			    for (/**/; i_3372_ < 0; i_3372_++) {
				int i_3374_ = ((i_3371_ >> 12) * anInt9000
					       + (i_3370_ >> 12));
				int i_3375_ = i_3369_++;
				if (i_3160_ == 0) {
				    if (i == 1)
					is[i_3375_]
					    = (anIntArray11423
					       [(aByteArray11422[i_3374_]
						 & 0xff)]);
				    else if (i == 0) {
					int i_3376_
					    = (anIntArray11423
					       [(aByteArray11422[i_3374_]
						 & 0xff)]);
					int i_3377_
					    = ((i_3376_ & 0xff0000) * anInt9031
					       & ~0xffffff);
					int i_3378_
					    = ((i_3376_ & 0xff00) * anInt9030
					       & 0xff0000);
					int i_3379_
					    = ((i_3376_ & 0xff) * anInt9027
					       & 0xff00);
					is[i_3375_] = (i_3377_ | i_3378_
						       | i_3379_) >>> 8;
				    } else if (i == 3) {
					int i_3380_
					    = (anIntArray11423
					       [(aByteArray11422[i_3374_]
						 & 0xff)]);
					int i_3381_ = anInt9026;
					int i_3382_ = i_3380_ + i_3381_;
					int i_3383_ = ((i_3380_ & 0xff00ff)
						       + (i_3381_ & 0xff00ff));
					int i_3384_ = ((i_3383_ & 0x1000100)
						       + (i_3382_ - i_3383_
							  & 0x10000));
					is[i_3375_]
					    = (i_3382_ - i_3384_
					       | i_3384_ - (i_3384_ >>> 8));
				    } else if (i == 2) {
					int i_3385_
					    = (anIntArray11423
					       [(aByteArray11422[i_3374_]
						 & 0xff)]);
					int i_3386_
					    = ((i_3385_ & 0xff00ff) * anInt9007
					       & ~0xff00ff);
					int i_3387_
					    = ((i_3385_ & 0xff00) * anInt9007
					       & 0xff0000);
					is[i_3375_] = ((i_3386_ | i_3387_)
						       >>> 8) + anInt9034;
				    } else
					throw new IllegalArgumentException();
				} else if (i_3160_ == 1) {
				    if (i == 1) {
					int i_3388_ = aByteArray11422[i_3374_];
					if (i_3388_ != 0)
					    is[i_3375_] = (anIntArray11423
							   [i_3388_ & 0xff]);
				    } else if (i == 0) {
					int i_3389_ = aByteArray11422[i_3374_];
					if (i_3389_ != 0) {
					    int i_3390_ = (anIntArray11423
							   [i_3389_ & 0xff]);
					    if ((anInt9026 & 0xffffff)
						== 16777215) {
						int i_3391_ = anInt9026 >>> 24;
						int i_3392_ = 256 - i_3391_;
						int i_3393_ = is[i_3375_];
						is[i_3375_]
						    = (((((i_3390_ & 0xff00ff)
							  * i_3391_)
							 + ((i_3393_
							     & 0xff00ff)
							    * i_3392_))
							& ~0xff00ff)
						       + ((((i_3390_ & 0xff00)
							    * i_3391_)
							   + ((i_3393_
							       & 0xff00)
							      * i_3392_))
							  & 0xff0000)) >> 8;
					    } else if (anInt9007 != 255) {
						int i_3394_
						    = (((i_3390_ & 0xff0000)
							* anInt9031)
						       & ~0xffffff);
						int i_3395_
						    = (((i_3390_ & 0xff00)
							* anInt9030)
						       & 0xff0000);
						int i_3396_
						    = (((i_3390_ & 0xff)
							* anInt9027)
						       & 0xff00);
						i_3390_ = (i_3394_ | i_3395_
							   | i_3396_) >>> 8;
						int i_3397_ = is[i_3375_];
						is[i_3375_]
						    = (((((i_3390_ & 0xff00ff)
							  * anInt9007)
							 + ((i_3397_
							     & 0xff00ff)
							    * anInt9028))
							& ~0xff00ff)
						       + ((((i_3390_ & 0xff00)
							    * anInt9007)
							   + ((i_3397_
							       & 0xff00)
							      * anInt9028))
							  & 0xff0000)) >> 8;
					    } else {
						int i_3398_
						    = (((i_3390_ & 0xff0000)
							* anInt9031)
						       & ~0xffffff);
						int i_3399_
						    = (((i_3390_ & 0xff00)
							* anInt9030)
						       & 0xff0000);
						int i_3400_
						    = (((i_3390_ & 0xff)
							* anInt9027)
						       & 0xff00);
						is[i_3375_]
						    = (i_3398_ | i_3399_
						       | i_3400_) >>> 8;
					    }
					}
				    } else if (i == 3) {
					byte i_3401_
					    = aByteArray11422[i_3374_];
					int i_3402_
					    = (i_3401_ > 0
					       ? anIntArray11423[i_3401_] : 0);
					int i_3403_ = anInt9026;
					int i_3404_ = i_3402_ + i_3403_;
					int i_3405_ = ((i_3402_ & 0xff00ff)
						       + (i_3403_ & 0xff00ff));
					int i_3406_ = ((i_3405_ & 0x1000100)
						       + (i_3404_ - i_3405_
							  & 0x10000));
					i_3406_
					    = (i_3404_ - i_3406_
					       | i_3406_ - (i_3406_ >>> 8));
					if (i_3402_ == 0 && anInt9007 != 255) {
					    i_3402_ = i_3406_;
					    i_3406_ = is[i_3375_];
					    i_3406_
						= (((((i_3402_ & 0xff00ff)
						      * anInt9007)
						     + ((i_3406_ & 0xff00ff)
							* anInt9028))
						    & ~0xff00ff)
						   + ((((i_3402_ & 0xff00)
							* anInt9007)
						       + ((i_3406_ & 0xff00)
							  * anInt9028))
						      & 0xff0000)) >> 8;
					}
					is[i_3375_] = i_3406_;
				    } else if (i == 2) {
					int i_3407_ = aByteArray11422[i_3374_];
					if (i_3407_ != 0) {
					    int i_3408_ = (anIntArray11423
							   [i_3407_ & 0xff]);
					    int i_3409_
						= (((i_3408_ & 0xff00ff)
						    * anInt9007)
						   & ~0xff00ff);
					    int i_3410_ = (((i_3408_ & 0xff00)
							    * anInt9007)
							   & 0xff0000);
					    is[i_3375_++]
						= (((i_3409_ | i_3410_) >>> 8)
						   + anInt9034);
					}
				    } else
					throw new IllegalArgumentException();
				} else if (i_3160_ == 2) {
				    if (i == 1) {
					int i_3411_ = aByteArray11422[i_3374_];
					if (i_3411_ != 0) {
					    int i_3412_ = (anIntArray11423
							   [i_3411_ & 0xff]);
					    int i_3413_ = is[i_3375_];
					    int i_3414_ = i_3412_ + i_3413_;
					    int i_3415_
						= ((i_3412_ & 0xff00ff)
						   + (i_3413_ & 0xff00ff));
					    i_3413_ = ((i_3415_ & 0x1000100)
						       + (i_3414_ - i_3415_
							  & 0x10000));
					    is[i_3375_]
						= (i_3414_ - i_3413_
						   | i_3413_ - (i_3413_
								>>> 8));
					}
				    } else if (i == 0) {
					int i_3416_ = aByteArray11422[i_3374_];
					if (i_3416_ != 0) {
					    int i_3417_ = (anIntArray11423
							   [i_3416_ & 0xff]);
					    int i_3418_
						= (((i_3417_ & 0xff0000)
						    * anInt9031)
						   & ~0xffffff);
					    int i_3419_ = (((i_3417_ & 0xff00)
							    * anInt9030)
							   & 0xff0000);
					    int i_3420_
						= ((i_3417_ & 0xff) * anInt9027
						   & 0xff00);
					    i_3417_ = (i_3418_ | i_3419_
						       | i_3420_) >>> 8;
					    int i_3421_ = is[i_3375_];
					    int i_3422_ = i_3417_ + i_3421_;
					    int i_3423_
						= ((i_3417_ & 0xff00ff)
						   + (i_3421_ & 0xff00ff));
					    i_3421_ = ((i_3423_ & 0x1000100)
						       + (i_3422_ - i_3423_
							  & 0x10000));
					    is[i_3375_]
						= (i_3422_ - i_3421_
						   | i_3421_ - (i_3421_
								>>> 8));
					}
				    } else if (i == 3) {
					byte i_3424_
					    = aByteArray11422[i_3374_];
					int i_3425_
					    = (i_3424_ > 0
					       ? anIntArray11423[i_3424_] : 0);
					int i_3426_ = anInt9026;
					int i_3427_ = i_3425_ + i_3426_;
					int i_3428_ = ((i_3425_ & 0xff00ff)
						       + (i_3426_ & 0xff00ff));
					int i_3429_ = ((i_3428_ & 0x1000100)
						       + (i_3427_ - i_3428_
							  & 0x10000));
					i_3429_
					    = (i_3427_ - i_3429_
					       | i_3429_ - (i_3429_ >>> 8));
					if (i_3425_ == 0 && anInt9007 != 255) {
					    i_3425_ = i_3429_;
					    i_3429_ = is[i_3375_];
					    i_3429_
						= (((((i_3425_ & 0xff00ff)
						      * anInt9007)
						     + ((i_3429_ & 0xff00ff)
							* anInt9028))
						    & ~0xff00ff)
						   + ((((i_3425_ & 0xff00)
							* anInt9007)
						       + ((i_3429_ & 0xff00)
							  * anInt9028))
						      & 0xff0000)) >> 8;
					}
					is[i_3375_] = i_3429_;
				    } else if (i == 2) {
					int i_3430_ = aByteArray11422[i_3374_];
					if (i_3430_ != 0) {
					    int i_3431_ = (anIntArray11423
							   [i_3430_ & 0xff]);
					    int i_3432_
						= (((i_3431_ & 0xff00ff)
						    * anInt9007)
						   & ~0xff00ff);
					    int i_3433_ = (((i_3431_ & 0xff00)
							    * anInt9007)
							   & 0xff0000);
					    i_3431_ = ((i_3432_ | i_3433_)
						       >>> 8) + anInt9034;
					    int i_3434_ = is[i_3375_];
					    int i_3435_ = i_3431_ + i_3434_;
					    int i_3436_
						= ((i_3431_ & 0xff00ff)
						   + (i_3434_ & 0xff00ff));
					    i_3434_ = ((i_3436_ & 0x1000100)
						       + (i_3435_ - i_3436_
							  & 0x10000));
					    is[i_3375_]
						= (i_3435_ - i_3434_
						   | i_3434_ - (i_3434_
								>>> 8));
					}
				    }
				} else
				    throw new IllegalArgumentException();
				i_3370_ += anInt9006;
			    }
			}
			i_3368_++;
			anInt8999 += anInt9010;
			anInt9015 += anInt9014;
		    }
		} else if (anInt9017 < 0) {
		    int i_3437_ = anInt9023;
		    while (i_3437_ < 0) {
			int i_3438_ = anInt9015;
			int i_3439_ = anInt9022 + anInt9024;
			int i_3440_ = anInt8999 + anInt9025;
			int i_3441_ = anInt9011;
			int i_3442_;
			if ((i_3442_ = i_3439_ - (anInt9000 << 12)) >= 0) {
			    i_3442_ = (anInt9006 - i_3442_) / anInt9006;
			    i_3441_ += i_3442_;
			    i_3439_ += anInt9006 * i_3442_;
			    i_3440_ += anInt9017 * i_3442_;
			    i_3438_ += i_3442_;
			}
			if ((i_3442_ = (i_3439_ - anInt9006) / anInt9006)
			    > i_3441_)
			    i_3441_ = i_3442_;
			if ((i_3442_ = i_3440_ - (anInt9001 << 12)) >= 0) {
			    i_3442_ = (anInt9017 - i_3442_) / anInt9017;
			    i_3441_ += i_3442_;
			    i_3439_ += anInt9006 * i_3442_;
			    i_3440_ += anInt9017 * i_3442_;
			    i_3438_ += i_3442_;
			}
			if ((i_3442_ = (i_3440_ - anInt9017) / anInt9017)
			    > i_3441_)
			    i_3441_ = i_3442_;
			for (/**/; i_3441_ < 0; i_3441_++) {
			    int i_3443_ = ((i_3440_ >> 12) * anInt9000
					   + (i_3439_ >> 12));
			    int i_3444_ = i_3438_++;
			    if (i_3160_ == 0) {
				if (i == 1)
				    is[i_3444_]
					= (anIntArray11423
					   [aByteArray11422[i_3443_] & 0xff]);
				else if (i == 0) {
				    int i_3445_
					= (anIntArray11423
					   [aByteArray11422[i_3443_] & 0xff]);
				    int i_3446_
					= ((i_3445_ & 0xff0000) * anInt9031
					   & ~0xffffff);
				    int i_3447_
					= ((i_3445_ & 0xff00) * anInt9030
					   & 0xff0000);
				    int i_3448_ = ((i_3445_ & 0xff) * anInt9027
						   & 0xff00);
				    is[i_3444_]
					= (i_3446_ | i_3447_ | i_3448_) >>> 8;
				} else if (i == 3) {
				    int i_3449_
					= (anIntArray11423
					   [aByteArray11422[i_3443_] & 0xff]);
				    int i_3450_ = anInt9026;
				    int i_3451_ = i_3449_ + i_3450_;
				    int i_3452_ = ((i_3449_ & 0xff00ff)
						   + (i_3450_ & 0xff00ff));
				    int i_3453_
					= ((i_3452_ & 0x1000100)
					   + (i_3451_ - i_3452_ & 0x10000));
				    is[i_3444_]
					= (i_3451_ - i_3453_
					   | i_3453_ - (i_3453_ >>> 8));
				} else if (i == 2) {
				    int i_3454_
					= (anIntArray11423
					   [aByteArray11422[i_3443_] & 0xff]);
				    int i_3455_
					= ((i_3454_ & 0xff00ff) * anInt9007
					   & ~0xff00ff);
				    int i_3456_
					= ((i_3454_ & 0xff00) * anInt9007
					   & 0xff0000);
				    is[i_3444_] = (((i_3455_ | i_3456_) >>> 8)
						   + anInt9034);
				} else
				    throw new IllegalArgumentException();
			    } else if (i_3160_ == 1) {
				if (i == 1) {
				    int i_3457_ = aByteArray11422[i_3443_];
				    if (i_3457_ != 0)
					is[i_3444_]
					    = anIntArray11423[i_3457_ & 0xff];
				} else if (i == 0) {
				    int i_3458_ = aByteArray11422[i_3443_];
				    if (i_3458_ != 0) {
					int i_3459_
					    = anIntArray11423[i_3458_ & 0xff];
					if ((anInt9026 & 0xffffff)
					    == 16777215) {
					    int i_3460_ = anInt9026 >>> 24;
					    int i_3461_ = 256 - i_3460_;
					    int i_3462_ = is[i_3444_];
					    is[i_3444_]
						= (((((i_3459_ & 0xff00ff)
						      * i_3460_)
						     + ((i_3462_ & 0xff00ff)
							* i_3461_))
						    & ~0xff00ff)
						   + ((((i_3459_ & 0xff00)
							* i_3460_)
						       + ((i_3462_ & 0xff00)
							  * i_3461_))
						      & 0xff0000)) >> 8;
					} else if (anInt9007 != 255) {
					    int i_3463_
						= (((i_3459_ & 0xff0000)
						    * anInt9031)
						   & ~0xffffff);
					    int i_3464_ = (((i_3459_ & 0xff00)
							    * anInt9030)
							   & 0xff0000);
					    int i_3465_
						= ((i_3459_ & 0xff) * anInt9027
						   & 0xff00);
					    i_3459_ = (i_3463_ | i_3464_
						       | i_3465_) >>> 8;
					    int i_3466_ = is[i_3444_];
					    is[i_3444_]
						= (((((i_3459_ & 0xff00ff)
						      * anInt9007)
						     + ((i_3466_ & 0xff00ff)
							* anInt9028))
						    & ~0xff00ff)
						   + ((((i_3459_ & 0xff00)
							* anInt9007)
						       + ((i_3466_ & 0xff00)
							  * anInt9028))
						      & 0xff0000)) >> 8;
					} else {
					    int i_3467_
						= (((i_3459_ & 0xff0000)
						    * anInt9031)
						   & ~0xffffff);
					    int i_3468_ = (((i_3459_ & 0xff00)
							    * anInt9030)
							   & 0xff0000);
					    int i_3469_
						= ((i_3459_ & 0xff) * anInt9027
						   & 0xff00);
					    is[i_3444_] = (i_3467_ | i_3468_
							   | i_3469_) >>> 8;
					}
				    }
				} else if (i == 3) {
				    byte i_3470_ = aByteArray11422[i_3443_];
				    int i_3471_
					= (i_3470_ > 0
					   ? anIntArray11423[i_3470_] : 0);
				    int i_3472_ = anInt9026;
				    int i_3473_ = i_3471_ + i_3472_;
				    int i_3474_ = ((i_3471_ & 0xff00ff)
						   + (i_3472_ & 0xff00ff));
				    int i_3475_
					= ((i_3474_ & 0x1000100)
					   + (i_3473_ - i_3474_ & 0x10000));
				    i_3475_ = (i_3473_ - i_3475_
					       | i_3475_ - (i_3475_ >>> 8));
				    if (i_3471_ == 0 && anInt9007 != 255) {
					i_3471_ = i_3475_;
					i_3475_ = is[i_3444_];
					i_3475_ = (((((i_3471_ & 0xff00ff)
						      * anInt9007)
						     + ((i_3475_ & 0xff00ff)
							* anInt9028))
						    & ~0xff00ff)
						   + ((((i_3471_ & 0xff00)
							* anInt9007)
						       + ((i_3475_ & 0xff00)
							  * anInt9028))
						      & 0xff0000)) >> 8;
				    }
				    is[i_3444_] = i_3475_;
				} else if (i == 2) {
				    int i_3476_ = aByteArray11422[i_3443_];
				    if (i_3476_ != 0) {
					int i_3477_
					    = anIntArray11423[i_3476_ & 0xff];
					int i_3478_
					    = ((i_3477_ & 0xff00ff) * anInt9007
					       & ~0xff00ff);
					int i_3479_
					    = ((i_3477_ & 0xff00) * anInt9007
					       & 0xff0000);
					is[i_3444_++] = ((i_3478_ | i_3479_)
							 >>> 8) + anInt9034;
				    }
				} else
				    throw new IllegalArgumentException();
			    } else if (i_3160_ == 2) {
				if (i == 1) {
				    int i_3480_ = aByteArray11422[i_3443_];
				    if (i_3480_ != 0) {
					int i_3481_
					    = anIntArray11423[i_3480_ & 0xff];
					int i_3482_ = is[i_3444_];
					int i_3483_ = i_3481_ + i_3482_;
					int i_3484_ = ((i_3481_ & 0xff00ff)
						       + (i_3482_ & 0xff00ff));
					i_3482_ = ((i_3484_ & 0x1000100)
						   + (i_3483_ - i_3484_
						      & 0x10000));
					is[i_3444_]
					    = (i_3483_ - i_3482_
					       | i_3482_ - (i_3482_ >>> 8));
				    }
				} else if (i == 0) {
				    int i_3485_ = aByteArray11422[i_3443_];
				    if (i_3485_ != 0) {
					int i_3486_
					    = anIntArray11423[i_3485_ & 0xff];
					int i_3487_
					    = ((i_3486_ & 0xff0000) * anInt9031
					       & ~0xffffff);
					int i_3488_
					    = ((i_3486_ & 0xff00) * anInt9030
					       & 0xff0000);
					int i_3489_
					    = ((i_3486_ & 0xff) * anInt9027
					       & 0xff00);
					i_3486_ = (i_3487_ | i_3488_
						   | i_3489_) >>> 8;
					int i_3490_ = is[i_3444_];
					int i_3491_ = i_3486_ + i_3490_;
					int i_3492_ = ((i_3486_ & 0xff00ff)
						       + (i_3490_ & 0xff00ff));
					i_3490_ = ((i_3492_ & 0x1000100)
						   + (i_3491_ - i_3492_
						      & 0x10000));
					is[i_3444_]
					    = (i_3491_ - i_3490_
					       | i_3490_ - (i_3490_ >>> 8));
				    }
				} else if (i == 3) {
				    byte i_3493_ = aByteArray11422[i_3443_];
				    int i_3494_
					= (i_3493_ > 0
					   ? anIntArray11423[i_3493_] : 0);
				    int i_3495_ = anInt9026;
				    int i_3496_ = i_3494_ + i_3495_;
				    int i_3497_ = ((i_3494_ & 0xff00ff)
						   + (i_3495_ & 0xff00ff));
				    int i_3498_
					= ((i_3497_ & 0x1000100)
					   + (i_3496_ - i_3497_ & 0x10000));
				    i_3498_ = (i_3496_ - i_3498_
					       | i_3498_ - (i_3498_ >>> 8));
				    if (i_3494_ == 0 && anInt9007 != 255) {
					i_3494_ = i_3498_;
					i_3498_ = is[i_3444_];
					i_3498_ = (((((i_3494_ & 0xff00ff)
						      * anInt9007)
						     + ((i_3498_ & 0xff00ff)
							* anInt9028))
						    & ~0xff00ff)
						   + ((((i_3494_ & 0xff00)
							* anInt9007)
						       + ((i_3498_ & 0xff00)
							  * anInt9028))
						      & 0xff0000)) >> 8;
				    }
				    is[i_3444_] = i_3498_;
				} else if (i == 2) {
				    int i_3499_ = aByteArray11422[i_3443_];
				    if (i_3499_ != 0) {
					int i_3500_
					    = anIntArray11423[i_3499_ & 0xff];
					int i_3501_
					    = ((i_3500_ & 0xff00ff) * anInt9007
					       & ~0xff00ff);
					int i_3502_
					    = ((i_3500_ & 0xff00) * anInt9007
					       & 0xff0000);
					i_3500_ = (((i_3501_ | i_3502_) >>> 8)
						   + anInt9034);
					int i_3503_ = is[i_3444_];
					int i_3504_ = i_3500_ + i_3503_;
					int i_3505_ = ((i_3500_ & 0xff00ff)
						       + (i_3503_ & 0xff00ff));
					i_3503_ = ((i_3505_ & 0x1000100)
						   + (i_3504_ - i_3505_
						      & 0x10000));
					is[i_3444_]
					    = (i_3504_ - i_3503_
					       | i_3503_ - (i_3503_ >>> 8));
				    }
				}
			    } else
				throw new IllegalArgumentException();
			    i_3439_ += anInt9006;
			    i_3440_ += anInt9017;
			}
			i_3437_++;
			anInt9022 += anInt9018;
			anInt8999 += anInt9010;
			anInt9015 += anInt9014;
		    }
		} else {
		    int i_3506_ = anInt9023;
		    while (i_3506_ < 0) {
			int i_3507_ = anInt9015;
			int i_3508_ = anInt9022 + anInt9024;
			int i_3509_ = anInt8999 + anInt9025;
			int i_3510_ = anInt9011;
			int i_3511_;
			if ((i_3511_ = i_3508_ - (anInt9000 << 12)) >= 0) {
			    i_3511_ = (anInt9006 - i_3511_) / anInt9006;
			    i_3510_ += i_3511_;
			    i_3508_ += anInt9006 * i_3511_;
			    i_3509_ += anInt9017 * i_3511_;
			    i_3507_ += i_3511_;
			}
			if ((i_3511_ = (i_3508_ - anInt9006) / anInt9006)
			    > i_3510_)
			    i_3510_ = i_3511_;
			if (i_3509_ < 0) {
			    i_3511_ = (anInt9017 - 1 - i_3509_) / anInt9017;
			    i_3510_ += i_3511_;
			    i_3508_ += anInt9006 * i_3511_;
			    i_3509_ += anInt9017 * i_3511_;
			    i_3507_ += i_3511_;
			}
			if ((i_3511_ = (1 + i_3509_ - (anInt9001 << 12)
					- anInt9017) / anInt9017)
			    > i_3510_)
			    i_3510_ = i_3511_;
			for (/**/; i_3510_ < 0; i_3510_++) {
			    int i_3512_ = ((i_3509_ >> 12) * anInt9000
					   + (i_3508_ >> 12));
			    int i_3513_ = i_3507_++;
			    if (i_3160_ == 0) {
				if (i == 1)
				    is[i_3513_]
					= (anIntArray11423
					   [aByteArray11422[i_3512_] & 0xff]);
				else if (i == 0) {
				    int i_3514_
					= (anIntArray11423
					   [aByteArray11422[i_3512_] & 0xff]);
				    int i_3515_
					= ((i_3514_ & 0xff0000) * anInt9031
					   & ~0xffffff);
				    int i_3516_
					= ((i_3514_ & 0xff00) * anInt9030
					   & 0xff0000);
				    int i_3517_ = ((i_3514_ & 0xff) * anInt9027
						   & 0xff00);
				    is[i_3513_]
					= (i_3515_ | i_3516_ | i_3517_) >>> 8;
				} else if (i == 3) {
				    int i_3518_
					= (anIntArray11423
					   [aByteArray11422[i_3512_] & 0xff]);
				    int i_3519_ = anInt9026;
				    int i_3520_ = i_3518_ + i_3519_;
				    int i_3521_ = ((i_3518_ & 0xff00ff)
						   + (i_3519_ & 0xff00ff));
				    int i_3522_
					= ((i_3521_ & 0x1000100)
					   + (i_3520_ - i_3521_ & 0x10000));
				    is[i_3513_]
					= (i_3520_ - i_3522_
					   | i_3522_ - (i_3522_ >>> 8));
				} else if (i == 2) {
				    int i_3523_
					= (anIntArray11423
					   [aByteArray11422[i_3512_] & 0xff]);
				    int i_3524_
					= ((i_3523_ & 0xff00ff) * anInt9007
					   & ~0xff00ff);
				    int i_3525_
					= ((i_3523_ & 0xff00) * anInt9007
					   & 0xff0000);
				    is[i_3513_] = (((i_3524_ | i_3525_) >>> 8)
						   + anInt9034);
				} else
				    throw new IllegalArgumentException();
			    } else if (i_3160_ == 1) {
				if (i == 1) {
				    int i_3526_ = aByteArray11422[i_3512_];
				    if (i_3526_ != 0)
					is[i_3513_]
					    = anIntArray11423[i_3526_ & 0xff];
				} else if (i == 0) {
				    int i_3527_ = aByteArray11422[i_3512_];
				    if (i_3527_ != 0) {
					int i_3528_
					    = anIntArray11423[i_3527_ & 0xff];
					if ((anInt9026 & 0xffffff)
					    == 16777215) {
					    int i_3529_ = anInt9026 >>> 24;
					    int i_3530_ = 256 - i_3529_;
					    int i_3531_ = is[i_3513_];
					    is[i_3513_]
						= (((((i_3528_ & 0xff00ff)
						      * i_3529_)
						     + ((i_3531_ & 0xff00ff)
							* i_3530_))
						    & ~0xff00ff)
						   + ((((i_3528_ & 0xff00)
							* i_3529_)
						       + ((i_3531_ & 0xff00)
							  * i_3530_))
						      & 0xff0000)) >> 8;
					} else if (anInt9007 != 255) {
					    int i_3532_
						= (((i_3528_ & 0xff0000)
						    * anInt9031)
						   & ~0xffffff);
					    int i_3533_ = (((i_3528_ & 0xff00)
							    * anInt9030)
							   & 0xff0000);
					    int i_3534_
						= ((i_3528_ & 0xff) * anInt9027
						   & 0xff00);
					    i_3528_ = (i_3532_ | i_3533_
						       | i_3534_) >>> 8;
					    int i_3535_ = is[i_3513_];
					    is[i_3513_]
						= (((((i_3528_ & 0xff00ff)
						      * anInt9007)
						     + ((i_3535_ & 0xff00ff)
							* anInt9028))
						    & ~0xff00ff)
						   + ((((i_3528_ & 0xff00)
							* anInt9007)
						       + ((i_3535_ & 0xff00)
							  * anInt9028))
						      & 0xff0000)) >> 8;
					} else {
					    int i_3536_
						= (((i_3528_ & 0xff0000)
						    * anInt9031)
						   & ~0xffffff);
					    int i_3537_ = (((i_3528_ & 0xff00)
							    * anInt9030)
							   & 0xff0000);
					    int i_3538_
						= ((i_3528_ & 0xff) * anInt9027
						   & 0xff00);
					    is[i_3513_] = (i_3536_ | i_3537_
							   | i_3538_) >>> 8;
					}
				    }
				} else if (i == 3) {
				    byte i_3539_ = aByteArray11422[i_3512_];
				    int i_3540_
					= (i_3539_ > 0
					   ? anIntArray11423[i_3539_] : 0);
				    int i_3541_ = anInt9026;
				    int i_3542_ = i_3540_ + i_3541_;
				    int i_3543_ = ((i_3540_ & 0xff00ff)
						   + (i_3541_ & 0xff00ff));
				    int i_3544_
					= ((i_3543_ & 0x1000100)
					   + (i_3542_ - i_3543_ & 0x10000));
				    i_3544_ = (i_3542_ - i_3544_
					       | i_3544_ - (i_3544_ >>> 8));
				    if (i_3540_ == 0 && anInt9007 != 255) {
					i_3540_ = i_3544_;
					i_3544_ = is[i_3513_];
					i_3544_ = (((((i_3540_ & 0xff00ff)
						      * anInt9007)
						     + ((i_3544_ & 0xff00ff)
							* anInt9028))
						    & ~0xff00ff)
						   + ((((i_3540_ & 0xff00)
							* anInt9007)
						       + ((i_3544_ & 0xff00)
							  * anInt9028))
						      & 0xff0000)) >> 8;
				    }
				    is[i_3513_] = i_3544_;
				} else if (i == 2) {
				    int i_3545_ = aByteArray11422[i_3512_];
				    if (i_3545_ != 0) {
					int i_3546_
					    = anIntArray11423[i_3545_ & 0xff];
					int i_3547_
					    = ((i_3546_ & 0xff00ff) * anInt9007
					       & ~0xff00ff);
					int i_3548_
					    = ((i_3546_ & 0xff00) * anInt9007
					       & 0xff0000);
					is[i_3513_++] = ((i_3547_ | i_3548_)
							 >>> 8) + anInt9034;
				    }
				} else
				    throw new IllegalArgumentException();
			    } else if (i_3160_ == 2) {
				if (i == 1) {
				    int i_3549_ = aByteArray11422[i_3512_];
				    if (i_3549_ != 0) {
					int i_3550_
					    = anIntArray11423[i_3549_ & 0xff];
					int i_3551_ = is[i_3513_];
					int i_3552_ = i_3550_ + i_3551_;
					int i_3553_ = ((i_3550_ & 0xff00ff)
						       + (i_3551_ & 0xff00ff));
					i_3551_ = ((i_3553_ & 0x1000100)
						   + (i_3552_ - i_3553_
						      & 0x10000));
					is[i_3513_]
					    = (i_3552_ - i_3551_
					       | i_3551_ - (i_3551_ >>> 8));
				    }
				} else if (i == 0) {
				    int i_3554_ = aByteArray11422[i_3512_];
				    if (i_3554_ != 0) {
					int i_3555_
					    = anIntArray11423[i_3554_ & 0xff];
					int i_3556_
					    = ((i_3555_ & 0xff0000) * anInt9031
					       & ~0xffffff);
					int i_3557_
					    = ((i_3555_ & 0xff00) * anInt9030
					       & 0xff0000);
					int i_3558_
					    = ((i_3555_ & 0xff) * anInt9027
					       & 0xff00);
					i_3555_ = (i_3556_ | i_3557_
						   | i_3558_) >>> 8;
					int i_3559_ = is[i_3513_];
					int i_3560_ = i_3555_ + i_3559_;
					int i_3561_ = ((i_3555_ & 0xff00ff)
						       + (i_3559_ & 0xff00ff));
					i_3559_ = ((i_3561_ & 0x1000100)
						   + (i_3560_ - i_3561_
						      & 0x10000));
					is[i_3513_]
					    = (i_3560_ - i_3559_
					       | i_3559_ - (i_3559_ >>> 8));
				    }
				} else if (i == 3) {
				    byte i_3562_ = aByteArray11422[i_3512_];
				    int i_3563_
					= (i_3562_ > 0
					   ? anIntArray11423[i_3562_] : 0);
				    int i_3564_ = anInt9026;
				    int i_3565_ = i_3563_ + i_3564_;
				    int i_3566_ = ((i_3563_ & 0xff00ff)
						   + (i_3564_ & 0xff00ff));
				    int i_3567_
					= ((i_3566_ & 0x1000100)
					   + (i_3565_ - i_3566_ & 0x10000));
				    i_3567_ = (i_3565_ - i_3567_
					       | i_3567_ - (i_3567_ >>> 8));
				    if (i_3563_ == 0 && anInt9007 != 255) {
					i_3563_ = i_3567_;
					i_3567_ = is[i_3513_];
					i_3567_ = (((((i_3563_ & 0xff00ff)
						      * anInt9007)
						     + ((i_3567_ & 0xff00ff)
							* anInt9028))
						    & ~0xff00ff)
						   + ((((i_3563_ & 0xff00)
							* anInt9007)
						       + ((i_3567_ & 0xff00)
							  * anInt9028))
						      & 0xff0000)) >> 8;
				    }
				    is[i_3513_] = i_3567_;
				} else if (i == 2) {
				    int i_3568_ = aByteArray11422[i_3512_];
				    if (i_3568_ != 0) {
					int i_3569_
					    = anIntArray11423[i_3568_ & 0xff];
					int i_3570_
					    = ((i_3569_ & 0xff00ff) * anInt9007
					       & ~0xff00ff);
					int i_3571_
					    = ((i_3569_ & 0xff00) * anInt9007
					       & 0xff0000);
					i_3569_ = (((i_3570_ | i_3571_) >>> 8)
						   + anInt9034);
					int i_3572_ = is[i_3513_];
					int i_3573_ = i_3569_ + i_3572_;
					int i_3574_ = ((i_3569_ & 0xff00ff)
						       + (i_3572_ & 0xff00ff));
					i_3572_ = ((i_3574_ & 0x1000100)
						   + (i_3573_ - i_3574_
						      & 0x10000));
					is[i_3513_]
					    = (i_3573_ - i_3572_
					       | i_3572_ - (i_3572_ >>> 8));
				    }
				}
			    } else
				throw new IllegalArgumentException();
			    i_3508_ += anInt9006;
			    i_3509_ += anInt9017;
			}
			i_3506_++;
			anInt9022 += anInt9018;
			anInt8999 += anInt9010;
			anInt9015 += anInt9014;
		    }
		}
	    } else if (anInt9017 == 0) {
		int i_3575_ = anInt9023;
		while (i_3575_ < 0) {
		    int i_3576_ = anInt9015;
		    int i_3577_ = anInt9022 + anInt9024;
		    int i_3578_ = anInt8999;
		    int i_3579_ = anInt9011;
		    if (i_3578_ >= 0 && i_3578_ - (anInt9001 << 12) < 0) {
			if (i_3577_ < 0) {
			    int i_3580_
				= (anInt9006 - 1 - i_3577_) / anInt9006;
			    i_3579_ += i_3580_;
			    i_3577_ += anInt9006 * i_3580_;
			    i_3576_ += i_3580_;
			}
			int i_3581_;
			if ((i_3581_ = (1 + i_3577_ - (anInt9000 << 12)
					- anInt9006) / anInt9006)
			    > i_3579_)
			    i_3579_ = i_3581_;
			for (/**/; i_3579_ < 0; i_3579_++) {
			    int i_3582_ = ((i_3578_ >> 12) * anInt9000
					   + (i_3577_ >> 12));
			    int i_3583_ = i_3576_++;
			    if (i_3160_ == 0) {
				if (i == 1)
				    is[i_3583_]
					= (anIntArray11423
					   [aByteArray11422[i_3582_] & 0xff]);
				else if (i == 0) {
				    int i_3584_
					= (anIntArray11423
					   [aByteArray11422[i_3582_] & 0xff]);
				    int i_3585_
					= ((i_3584_ & 0xff0000) * anInt9031
					   & ~0xffffff);
				    int i_3586_
					= ((i_3584_ & 0xff00) * anInt9030
					   & 0xff0000);
				    int i_3587_ = ((i_3584_ & 0xff) * anInt9027
						   & 0xff00);
				    is[i_3583_]
					= (i_3585_ | i_3586_ | i_3587_) >>> 8;
				} else if (i == 3) {
				    int i_3588_
					= (anIntArray11423
					   [aByteArray11422[i_3582_] & 0xff]);
				    int i_3589_ = anInt9026;
				    int i_3590_ = i_3588_ + i_3589_;
				    int i_3591_ = ((i_3588_ & 0xff00ff)
						   + (i_3589_ & 0xff00ff));
				    int i_3592_
					= ((i_3591_ & 0x1000100)
					   + (i_3590_ - i_3591_ & 0x10000));
				    is[i_3583_]
					= (i_3590_ - i_3592_
					   | i_3592_ - (i_3592_ >>> 8));
				} else if (i == 2) {
				    int i_3593_
					= (anIntArray11423
					   [aByteArray11422[i_3582_] & 0xff]);
				    int i_3594_
					= ((i_3593_ & 0xff00ff) * anInt9007
					   & ~0xff00ff);
				    int i_3595_
					= ((i_3593_ & 0xff00) * anInt9007
					   & 0xff0000);
				    is[i_3583_] = (((i_3594_ | i_3595_) >>> 8)
						   + anInt9034);
				} else
				    throw new IllegalArgumentException();
			    } else if (i_3160_ == 1) {
				if (i == 1) {
				    int i_3596_ = aByteArray11422[i_3582_];
				    if (i_3596_ != 0)
					is[i_3583_]
					    = anIntArray11423[i_3596_ & 0xff];
				} else if (i == 0) {
				    int i_3597_ = aByteArray11422[i_3582_];
				    if (i_3597_ != 0) {
					int i_3598_
					    = anIntArray11423[i_3597_ & 0xff];
					if ((anInt9026 & 0xffffff)
					    == 16777215) {
					    int i_3599_ = anInt9026 >>> 24;
					    int i_3600_ = 256 - i_3599_;
					    int i_3601_ = is[i_3583_];
					    is[i_3583_]
						= (((((i_3598_ & 0xff00ff)
						      * i_3599_)
						     + ((i_3601_ & 0xff00ff)
							* i_3600_))
						    & ~0xff00ff)
						   + ((((i_3598_ & 0xff00)
							* i_3599_)
						       + ((i_3601_ & 0xff00)
							  * i_3600_))
						      & 0xff0000)) >> 8;
					} else if (anInt9007 != 255) {
					    int i_3602_
						= (((i_3598_ & 0xff0000)
						    * anInt9031)
						   & ~0xffffff);
					    int i_3603_ = (((i_3598_ & 0xff00)
							    * anInt9030)
							   & 0xff0000);
					    int i_3604_
						= ((i_3598_ & 0xff) * anInt9027
						   & 0xff00);
					    i_3598_ = (i_3602_ | i_3603_
						       | i_3604_) >>> 8;
					    int i_3605_ = is[i_3583_];
					    is[i_3583_]
						= (((((i_3598_ & 0xff00ff)
						      * anInt9007)
						     + ((i_3605_ & 0xff00ff)
							* anInt9028))
						    & ~0xff00ff)
						   + ((((i_3598_ & 0xff00)
							* anInt9007)
						       + ((i_3605_ & 0xff00)
							  * anInt9028))
						      & 0xff0000)) >> 8;
					} else {
					    int i_3606_
						= (((i_3598_ & 0xff0000)
						    * anInt9031)
						   & ~0xffffff);
					    int i_3607_ = (((i_3598_ & 0xff00)
							    * anInt9030)
							   & 0xff0000);
					    int i_3608_
						= ((i_3598_ & 0xff) * anInt9027
						   & 0xff00);
					    is[i_3583_] = (i_3606_ | i_3607_
							   | i_3608_) >>> 8;
					}
				    }
				} else if (i == 3) {
				    byte i_3609_ = aByteArray11422[i_3582_];
				    int i_3610_
					= (i_3609_ > 0
					   ? anIntArray11423[i_3609_] : 0);
				    int i_3611_ = anInt9026;
				    int i_3612_ = i_3610_ + i_3611_;
				    int i_3613_ = ((i_3610_ & 0xff00ff)
						   + (i_3611_ & 0xff00ff));
				    int i_3614_
					= ((i_3613_ & 0x1000100)
					   + (i_3612_ - i_3613_ & 0x10000));
				    i_3614_ = (i_3612_ - i_3614_
					       | i_3614_ - (i_3614_ >>> 8));
				    if (i_3610_ == 0 && anInt9007 != 255) {
					i_3610_ = i_3614_;
					i_3614_ = is[i_3583_];
					i_3614_ = (((((i_3610_ & 0xff00ff)
						      * anInt9007)
						     + ((i_3614_ & 0xff00ff)
							* anInt9028))
						    & ~0xff00ff)
						   + ((((i_3610_ & 0xff00)
							* anInt9007)
						       + ((i_3614_ & 0xff00)
							  * anInt9028))
						      & 0xff0000)) >> 8;
				    }
				    is[i_3583_] = i_3614_;
				} else if (i == 2) {
				    int i_3615_ = aByteArray11422[i_3582_];
				    if (i_3615_ != 0) {
					int i_3616_
					    = anIntArray11423[i_3615_ & 0xff];
					int i_3617_
					    = ((i_3616_ & 0xff00ff) * anInt9007
					       & ~0xff00ff);
					int i_3618_
					    = ((i_3616_ & 0xff00) * anInt9007
					       & 0xff0000);
					is[i_3583_++] = ((i_3617_ | i_3618_)
							 >>> 8) + anInt9034;
				    }
				} else
				    throw new IllegalArgumentException();
			    } else if (i_3160_ == 2) {
				if (i == 1) {
				    int i_3619_ = aByteArray11422[i_3582_];
				    if (i_3619_ != 0) {
					int i_3620_
					    = anIntArray11423[i_3619_ & 0xff];
					int i_3621_ = is[i_3583_];
					int i_3622_ = i_3620_ + i_3621_;
					int i_3623_ = ((i_3620_ & 0xff00ff)
						       + (i_3621_ & 0xff00ff));
					i_3621_ = ((i_3623_ & 0x1000100)
						   + (i_3622_ - i_3623_
						      & 0x10000));
					is[i_3583_]
					    = (i_3622_ - i_3621_
					       | i_3621_ - (i_3621_ >>> 8));
				    }
				} else if (i == 0) {
				    int i_3624_ = aByteArray11422[i_3582_];
				    if (i_3624_ != 0) {
					int i_3625_
					    = anIntArray11423[i_3624_ & 0xff];
					int i_3626_
					    = ((i_3625_ & 0xff0000) * anInt9031
					       & ~0xffffff);
					int i_3627_
					    = ((i_3625_ & 0xff00) * anInt9030
					       & 0xff0000);
					int i_3628_
					    = ((i_3625_ & 0xff) * anInt9027
					       & 0xff00);
					i_3625_ = (i_3626_ | i_3627_
						   | i_3628_) >>> 8;
					int i_3629_ = is[i_3583_];
					int i_3630_ = i_3625_ + i_3629_;
					int i_3631_ = ((i_3625_ & 0xff00ff)
						       + (i_3629_ & 0xff00ff));
					i_3629_ = ((i_3631_ & 0x1000100)
						   + (i_3630_ - i_3631_
						      & 0x10000));
					is[i_3583_]
					    = (i_3630_ - i_3629_
					       | i_3629_ - (i_3629_ >>> 8));
				    }
				} else if (i == 3) {
				    byte i_3632_ = aByteArray11422[i_3582_];
				    int i_3633_
					= (i_3632_ > 0
					   ? anIntArray11423[i_3632_] : 0);
				    int i_3634_ = anInt9026;
				    int i_3635_ = i_3633_ + i_3634_;
				    int i_3636_ = ((i_3633_ & 0xff00ff)
						   + (i_3634_ & 0xff00ff));
				    int i_3637_
					= ((i_3636_ & 0x1000100)
					   + (i_3635_ - i_3636_ & 0x10000));
				    i_3637_ = (i_3635_ - i_3637_
					       | i_3637_ - (i_3637_ >>> 8));
				    if (i_3633_ == 0 && anInt9007 != 255) {
					i_3633_ = i_3637_;
					i_3637_ = is[i_3583_];
					i_3637_ = (((((i_3633_ & 0xff00ff)
						      * anInt9007)
						     + ((i_3637_ & 0xff00ff)
							* anInt9028))
						    & ~0xff00ff)
						   + ((((i_3633_ & 0xff00)
							* anInt9007)
						       + ((i_3637_ & 0xff00)
							  * anInt9028))
						      & 0xff0000)) >> 8;
				    }
				    is[i_3583_] = i_3637_;
				} else if (i == 2) {
				    int i_3638_ = aByteArray11422[i_3582_];
				    if (i_3638_ != 0) {
					int i_3639_
					    = anIntArray11423[i_3638_ & 0xff];
					int i_3640_
					    = ((i_3639_ & 0xff00ff) * anInt9007
					       & ~0xff00ff);
					int i_3641_
					    = ((i_3639_ & 0xff00) * anInt9007
					       & 0xff0000);
					i_3639_ = (((i_3640_ | i_3641_) >>> 8)
						   + anInt9034);
					int i_3642_ = is[i_3583_];
					int i_3643_ = i_3639_ + i_3642_;
					int i_3644_ = ((i_3639_ & 0xff00ff)
						       + (i_3642_ & 0xff00ff));
					i_3642_ = ((i_3644_ & 0x1000100)
						   + (i_3643_ - i_3644_
						      & 0x10000));
					is[i_3583_]
					    = (i_3643_ - i_3642_
					       | i_3642_ - (i_3642_ >>> 8));
				    }
				}
			    } else
				throw new IllegalArgumentException();
			    i_3577_ += anInt9006;
			}
		    }
		    i_3575_++;
		    anInt9022 += anInt9018;
		    anInt8999 += anInt9010;
		    anInt9015 += anInt9014;
		}
	    } else if (anInt9017 < 0) {
		for (int i_3645_ = anInt9023; i_3645_ < 0; i_3645_++) {
		    int i_3646_ = anInt9015;
		    int i_3647_ = anInt9022 + anInt9024;
		    int i_3648_ = anInt8999 + anInt9025;
		    int i_3649_ = anInt9011;
		    if (i_3647_ < 0) {
			int i_3650_ = (anInt9006 - 1 - i_3647_) / anInt9006;
			i_3649_ += i_3650_;
			i_3647_ += anInt9006 * i_3650_;
			i_3648_ += anInt9017 * i_3650_;
			i_3646_ += i_3650_;
		    }
		    int i_3651_;
		    if ((i_3651_ = (1 + i_3647_ - (anInt9000 << 12)
				    - anInt9006) / anInt9006)
			> i_3649_)
			i_3649_ = i_3651_;
		    if ((i_3651_ = i_3648_ - (anInt9001 << 12)) >= 0) {
			i_3651_ = (anInt9017 - i_3651_) / anInt9017;
			i_3649_ += i_3651_;
			i_3647_ += anInt9006 * i_3651_;
			i_3648_ += anInt9017 * i_3651_;
			i_3646_ += i_3651_;
		    }
		    if ((i_3651_ = (i_3648_ - anInt9017) / anInt9017)
			> i_3649_)
			i_3649_ = i_3651_;
		    for (/**/; i_3649_ < 0; i_3649_++) {
			int i_3652_
			    = (i_3648_ >> 12) * anInt9000 + (i_3647_ >> 12);
			int i_3653_ = i_3646_++;
			if (i_3160_ == 0) {
			    if (i == 1)
				is[i_3653_]
				    = (anIntArray11423
				       [aByteArray11422[i_3652_] & 0xff]);
			    else if (i == 0) {
				int i_3654_
				    = (anIntArray11423
				       [aByteArray11422[i_3652_] & 0xff]);
				int i_3655_ = ((i_3654_ & 0xff0000) * anInt9031
					       & ~0xffffff);
				int i_3656_ = ((i_3654_ & 0xff00) * anInt9030
					       & 0xff0000);
				int i_3657_
				    = (i_3654_ & 0xff) * anInt9027 & 0xff00;
				is[i_3653_]
				    = (i_3655_ | i_3656_ | i_3657_) >>> 8;
			    } else if (i == 3) {
				int i_3658_
				    = (anIntArray11423
				       [aByteArray11422[i_3652_] & 0xff]);
				int i_3659_ = anInt9026;
				int i_3660_ = i_3658_ + i_3659_;
				int i_3661_ = ((i_3658_ & 0xff00ff)
					       + (i_3659_ & 0xff00ff));
				int i_3662_
				    = ((i_3661_ & 0x1000100)
				       + (i_3660_ - i_3661_ & 0x10000));
				is[i_3653_]
				    = i_3660_ - i_3662_ | i_3662_ - (i_3662_
								     >>> 8);
			    } else if (i == 2) {
				int i_3663_
				    = (anIntArray11423
				       [aByteArray11422[i_3652_] & 0xff]);
				int i_3664_ = ((i_3663_ & 0xff00ff) * anInt9007
					       & ~0xff00ff);
				int i_3665_ = ((i_3663_ & 0xff00) * anInt9007
					       & 0xff0000);
				is[i_3653_]
				    = ((i_3664_ | i_3665_) >>> 8) + anInt9034;
			    } else
				throw new IllegalArgumentException();
			} else if (i_3160_ == 1) {
			    if (i == 1) {
				int i_3666_ = aByteArray11422[i_3652_];
				if (i_3666_ != 0)
				    is[i_3653_]
					= anIntArray11423[i_3666_ & 0xff];
			    } else if (i == 0) {
				int i_3667_ = aByteArray11422[i_3652_];
				if (i_3667_ != 0) {
				    int i_3668_
					= anIntArray11423[i_3667_ & 0xff];
				    if ((anInt9026 & 0xffffff) == 16777215) {
					int i_3669_ = anInt9026 >>> 24;
					int i_3670_ = 256 - i_3669_;
					int i_3671_ = is[i_3653_];
					is[i_3653_]
					    = ((((i_3668_ & 0xff00ff) * i_3669_
						 + ((i_3671_ & 0xff00ff)
						    * i_3670_))
						& ~0xff00ff)
					       + (((i_3668_ & 0xff00) * i_3669_
						   + ((i_3671_ & 0xff00)
						      * i_3670_))
						  & 0xff0000)) >> 8;
				    } else if (anInt9007 != 255) {
					int i_3672_
					    = ((i_3668_ & 0xff0000) * anInt9031
					       & ~0xffffff);
					int i_3673_
					    = ((i_3668_ & 0xff00) * anInt9030
					       & 0xff0000);
					int i_3674_
					    = ((i_3668_ & 0xff) * anInt9027
					       & 0xff00);
					i_3668_ = (i_3672_ | i_3673_
						   | i_3674_) >>> 8;
					int i_3675_ = is[i_3653_];
					is[i_3653_]
					    = (((((i_3668_ & 0xff00ff)
						  * anInt9007)
						 + ((i_3675_ & 0xff00ff)
						    * anInt9028))
						& ~0xff00ff)
					       + ((((i_3668_ & 0xff00)
						    * anInt9007)
						   + ((i_3675_ & 0xff00)
						      * anInt9028))
						  & 0xff0000)) >> 8;
				    } else {
					int i_3676_
					    = ((i_3668_ & 0xff0000) * anInt9031
					       & ~0xffffff);
					int i_3677_
					    = ((i_3668_ & 0xff00) * anInt9030
					       & 0xff0000);
					int i_3678_
					    = ((i_3668_ & 0xff) * anInt9027
					       & 0xff00);
					is[i_3653_] = (i_3676_ | i_3677_
						       | i_3678_) >>> 8;
				    }
				}
			    } else if (i == 3) {
				byte i_3679_ = aByteArray11422[i_3652_];
				int i_3680_ = (i_3679_ > 0
					       ? anIntArray11423[i_3679_] : 0);
				int i_3681_ = anInt9026;
				int i_3682_ = i_3680_ + i_3681_;
				int i_3683_ = ((i_3680_ & 0xff00ff)
					       + (i_3681_ & 0xff00ff));
				int i_3684_
				    = ((i_3683_ & 0x1000100)
				       + (i_3682_ - i_3683_ & 0x10000));
				i_3684_
				    = i_3682_ - i_3684_ | i_3684_ - (i_3684_
								     >>> 8);
				if (i_3680_ == 0 && anInt9007 != 255) {
				    i_3680_ = i_3684_;
				    i_3684_ = is[i_3653_];
				    i_3684_
					= ((((i_3680_ & 0xff00ff) * anInt9007
					     + ((i_3684_ & 0xff00ff)
						* anInt9028))
					    & ~0xff00ff)
					   + (((i_3680_ & 0xff00) * anInt9007
					       + ((i_3684_ & 0xff00)
						  * anInt9028))
					      & 0xff0000)) >> 8;
				}
				is[i_3653_] = i_3684_;
			    } else if (i == 2) {
				int i_3685_ = aByteArray11422[i_3652_];
				if (i_3685_ != 0) {
				    int i_3686_
					= anIntArray11423[i_3685_ & 0xff];
				    int i_3687_
					= ((i_3686_ & 0xff00ff) * anInt9007
					   & ~0xff00ff);
				    int i_3688_
					= ((i_3686_ & 0xff00) * anInt9007
					   & 0xff0000);
				    is[i_3653_++] = ((i_3687_ | i_3688_)
						     >>> 8) + anInt9034;
				}
			    } else
				throw new IllegalArgumentException();
			} else if (i_3160_ == 2) {
			    if (i == 1) {
				int i_3689_ = aByteArray11422[i_3652_];
				if (i_3689_ != 0) {
				    int i_3690_
					= anIntArray11423[i_3689_ & 0xff];
				    int i_3691_ = is[i_3653_];
				    int i_3692_ = i_3690_ + i_3691_;
				    int i_3693_ = ((i_3690_ & 0xff00ff)
						   + (i_3691_ & 0xff00ff));
				    i_3691_
					= ((i_3693_ & 0x1000100)
					   + (i_3692_ - i_3693_ & 0x10000));
				    is[i_3653_]
					= (i_3692_ - i_3691_
					   | i_3691_ - (i_3691_ >>> 8));
				}
			    } else if (i == 0) {
				int i_3694_ = aByteArray11422[i_3652_];
				if (i_3694_ != 0) {
				    int i_3695_
					= anIntArray11423[i_3694_ & 0xff];
				    int i_3696_
					= ((i_3695_ & 0xff0000) * anInt9031
					   & ~0xffffff);
				    int i_3697_
					= ((i_3695_ & 0xff00) * anInt9030
					   & 0xff0000);
				    int i_3698_ = ((i_3695_ & 0xff) * anInt9027
						   & 0xff00);
				    i_3695_
					= (i_3696_ | i_3697_ | i_3698_) >>> 8;
				    int i_3699_ = is[i_3653_];
				    int i_3700_ = i_3695_ + i_3699_;
				    int i_3701_ = ((i_3695_ & 0xff00ff)
						   + (i_3699_ & 0xff00ff));
				    i_3699_
					= ((i_3701_ & 0x1000100)
					   + (i_3700_ - i_3701_ & 0x10000));
				    is[i_3653_]
					= (i_3700_ - i_3699_
					   | i_3699_ - (i_3699_ >>> 8));
				}
			    } else if (i == 3) {
				byte i_3702_ = aByteArray11422[i_3652_];
				int i_3703_ = (i_3702_ > 0
					       ? anIntArray11423[i_3702_] : 0);
				int i_3704_ = anInt9026;
				int i_3705_ = i_3703_ + i_3704_;
				int i_3706_ = ((i_3703_ & 0xff00ff)
					       + (i_3704_ & 0xff00ff));
				int i_3707_
				    = ((i_3706_ & 0x1000100)
				       + (i_3705_ - i_3706_ & 0x10000));
				i_3707_
				    = i_3705_ - i_3707_ | i_3707_ - (i_3707_
								     >>> 8);
				if (i_3703_ == 0 && anInt9007 != 255) {
				    i_3703_ = i_3707_;
				    i_3707_ = is[i_3653_];
				    i_3707_
					= ((((i_3703_ & 0xff00ff) * anInt9007
					     + ((i_3707_ & 0xff00ff)
						* anInt9028))
					    & ~0xff00ff)
					   + (((i_3703_ & 0xff00) * anInt9007
					       + ((i_3707_ & 0xff00)
						  * anInt9028))
					      & 0xff0000)) >> 8;
				}
				is[i_3653_] = i_3707_;
			    } else if (i == 2) {
				int i_3708_ = aByteArray11422[i_3652_];
				if (i_3708_ != 0) {
				    int i_3709_
					= anIntArray11423[i_3708_ & 0xff];
				    int i_3710_
					= ((i_3709_ & 0xff00ff) * anInt9007
					   & ~0xff00ff);
				    int i_3711_
					= ((i_3709_ & 0xff00) * anInt9007
					   & 0xff0000);
				    i_3709_ = (((i_3710_ | i_3711_) >>> 8)
					       + anInt9034);
				    int i_3712_ = is[i_3653_];
				    int i_3713_ = i_3709_ + i_3712_;
				    int i_3714_ = ((i_3709_ & 0xff00ff)
						   + (i_3712_ & 0xff00ff));
				    i_3712_
					= ((i_3714_ & 0x1000100)
					   + (i_3713_ - i_3714_ & 0x10000));
				    is[i_3653_]
					= (i_3713_ - i_3712_
					   | i_3712_ - (i_3712_ >>> 8));
				}
			    }
			} else
			    throw new IllegalArgumentException();
			i_3647_ += anInt9006;
			i_3648_ += anInt9017;
		    }
		    anInt9022 += anInt9018;
		    anInt8999 += anInt9010;
		    anInt9015 += anInt9014;
		}
	    } else {
		for (int i_3715_ = anInt9023; i_3715_ < 0; i_3715_++) {
		    int i_3716_ = anInt9015;
		    int i_3717_ = anInt9022 + anInt9024;
		    int i_3718_ = anInt8999 + anInt9025;
		    int i_3719_ = anInt9011;
		    if (i_3717_ < 0) {
			int i_3720_ = (anInt9006 - 1 - i_3717_) / anInt9006;
			i_3719_ += i_3720_;
			i_3717_ += anInt9006 * i_3720_;
			i_3718_ += anInt9017 * i_3720_;
			i_3716_ += i_3720_;
		    }
		    int i_3721_;
		    if ((i_3721_ = (1 + i_3717_ - (anInt9000 << 12)
				    - anInt9006) / anInt9006)
			> i_3719_)
			i_3719_ = i_3721_;
		    if (i_3718_ < 0) {
			i_3721_ = (anInt9017 - 1 - i_3718_) / anInt9017;
			i_3719_ += i_3721_;
			i_3717_ += anInt9006 * i_3721_;
			i_3718_ += anInt9017 * i_3721_;
			i_3716_ += i_3721_;
		    }
		    if ((i_3721_ = (1 + i_3718_ - (anInt9001 << 12)
				    - anInt9017) / anInt9017)
			> i_3719_)
			i_3719_ = i_3721_;
		    for (/**/; i_3719_ < 0; i_3719_++) {
			int i_3722_
			    = (i_3718_ >> 12) * anInt9000 + (i_3717_ >> 12);
			int i_3723_ = i_3716_++;
			if (i_3160_ == 0) {
			    if (i == 1)
				is[i_3723_]
				    = (anIntArray11423
				       [aByteArray11422[i_3722_] & 0xff]);
			    else if (i == 0) {
				int i_3724_
				    = (anIntArray11423
				       [aByteArray11422[i_3722_] & 0xff]);
				int i_3725_ = ((i_3724_ & 0xff0000) * anInt9031
					       & ~0xffffff);
				int i_3726_ = ((i_3724_ & 0xff00) * anInt9030
					       & 0xff0000);
				int i_3727_
				    = (i_3724_ & 0xff) * anInt9027 & 0xff00;
				is[i_3723_]
				    = (i_3725_ | i_3726_ | i_3727_) >>> 8;
			    } else if (i == 3) {
				int i_3728_
				    = (anIntArray11423
				       [aByteArray11422[i_3722_] & 0xff]);
				int i_3729_ = anInt9026;
				int i_3730_ = i_3728_ + i_3729_;
				int i_3731_ = ((i_3728_ & 0xff00ff)
					       + (i_3729_ & 0xff00ff));
				int i_3732_
				    = ((i_3731_ & 0x1000100)
				       + (i_3730_ - i_3731_ & 0x10000));
				is[i_3723_]
				    = i_3730_ - i_3732_ | i_3732_ - (i_3732_
								     >>> 8);
			    } else if (i == 2) {
				int i_3733_
				    = (anIntArray11423
				       [aByteArray11422[i_3722_] & 0xff]);
				int i_3734_ = ((i_3733_ & 0xff00ff) * anInt9007
					       & ~0xff00ff);
				int i_3735_ = ((i_3733_ & 0xff00) * anInt9007
					       & 0xff0000);
				is[i_3723_]
				    = ((i_3734_ | i_3735_) >>> 8) + anInt9034;
			    } else
				throw new IllegalArgumentException();
			} else if (i_3160_ == 1) {
			    if (i == 1) {
				int i_3736_ = aByteArray11422[i_3722_];
				if (i_3736_ != 0)
				    is[i_3723_]
					= anIntArray11423[i_3736_ & 0xff];
			    } else if (i == 0) {
				int i_3737_ = aByteArray11422[i_3722_];
				if (i_3737_ != 0) {
				    int i_3738_
					= anIntArray11423[i_3737_ & 0xff];
				    if ((anInt9026 & 0xffffff) == 16777215) {
					int i_3739_ = anInt9026 >>> 24;
					int i_3740_ = 256 - i_3739_;
					int i_3741_ = is[i_3723_];
					is[i_3723_]
					    = ((((i_3738_ & 0xff00ff) * i_3739_
						 + ((i_3741_ & 0xff00ff)
						    * i_3740_))
						& ~0xff00ff)
					       + (((i_3738_ & 0xff00) * i_3739_
						   + ((i_3741_ & 0xff00)
						      * i_3740_))
						  & 0xff0000)) >> 8;
				    } else if (anInt9007 != 255) {
					int i_3742_
					    = ((i_3738_ & 0xff0000) * anInt9031
					       & ~0xffffff);
					int i_3743_
					    = ((i_3738_ & 0xff00) * anInt9030
					       & 0xff0000);
					int i_3744_
					    = ((i_3738_ & 0xff) * anInt9027
					       & 0xff00);
					i_3738_ = (i_3742_ | i_3743_
						   | i_3744_) >>> 8;
					int i_3745_ = is[i_3723_];
					is[i_3723_]
					    = (((((i_3738_ & 0xff00ff)
						  * anInt9007)
						 + ((i_3745_ & 0xff00ff)
						    * anInt9028))
						& ~0xff00ff)
					       + ((((i_3738_ & 0xff00)
						    * anInt9007)
						   + ((i_3745_ & 0xff00)
						      * anInt9028))
						  & 0xff0000)) >> 8;
				    } else {
					int i_3746_
					    = ((i_3738_ & 0xff0000) * anInt9031
					       & ~0xffffff);
					int i_3747_
					    = ((i_3738_ & 0xff00) * anInt9030
					       & 0xff0000);
					int i_3748_
					    = ((i_3738_ & 0xff) * anInt9027
					       & 0xff00);
					is[i_3723_] = (i_3746_ | i_3747_
						       | i_3748_) >>> 8;
				    }
				}
			    } else if (i == 3) {
				byte i_3749_ = aByteArray11422[i_3722_];
				int i_3750_ = (i_3749_ > 0
					       ? anIntArray11423[i_3749_] : 0);
				int i_3751_ = anInt9026;
				int i_3752_ = i_3750_ + i_3751_;
				int i_3753_ = ((i_3750_ & 0xff00ff)
					       + (i_3751_ & 0xff00ff));
				int i_3754_
				    = ((i_3753_ & 0x1000100)
				       + (i_3752_ - i_3753_ & 0x10000));
				i_3754_
				    = i_3752_ - i_3754_ | i_3754_ - (i_3754_
								     >>> 8);
				if (i_3750_ == 0 && anInt9007 != 255) {
				    i_3750_ = i_3754_;
				    i_3754_ = is[i_3723_];
				    i_3754_
					= ((((i_3750_ & 0xff00ff) * anInt9007
					     + ((i_3754_ & 0xff00ff)
						* anInt9028))
					    & ~0xff00ff)
					   + (((i_3750_ & 0xff00) * anInt9007
					       + ((i_3754_ & 0xff00)
						  * anInt9028))
					      & 0xff0000)) >> 8;
				}
				is[i_3723_] = i_3754_;
			    } else if (i == 2) {
				int i_3755_ = aByteArray11422[i_3722_];
				if (i_3755_ != 0) {
				    int i_3756_
					= anIntArray11423[i_3755_ & 0xff];
				    int i_3757_
					= ((i_3756_ & 0xff00ff) * anInt9007
					   & ~0xff00ff);
				    int i_3758_
					= ((i_3756_ & 0xff00) * anInt9007
					   & 0xff0000);
				    is[i_3723_++] = ((i_3757_ | i_3758_)
						     >>> 8) + anInt9034;
				}
			    } else
				throw new IllegalArgumentException();
			} else if (i_3160_ == 2) {
			    if (i == 1) {
				int i_3759_ = aByteArray11422[i_3722_];
				if (i_3759_ != 0) {
				    int i_3760_
					= anIntArray11423[i_3759_ & 0xff];
				    int i_3761_ = is[i_3723_];
				    int i_3762_ = i_3760_ + i_3761_;
				    int i_3763_ = ((i_3760_ & 0xff00ff)
						   + (i_3761_ & 0xff00ff));
				    i_3761_
					= ((i_3763_ & 0x1000100)
					   + (i_3762_ - i_3763_ & 0x10000));
				    is[i_3723_]
					= (i_3762_ - i_3761_
					   | i_3761_ - (i_3761_ >>> 8));
				}
			    } else if (i == 0) {
				int i_3764_ = aByteArray11422[i_3722_];
				if (i_3764_ != 0) {
				    int i_3765_
					= anIntArray11423[i_3764_ & 0xff];
				    int i_3766_
					= ((i_3765_ & 0xff0000) * anInt9031
					   & ~0xffffff);
				    int i_3767_
					= ((i_3765_ & 0xff00) * anInt9030
					   & 0xff0000);
				    int i_3768_ = ((i_3765_ & 0xff) * anInt9027
						   & 0xff00);
				    i_3765_
					= (i_3766_ | i_3767_ | i_3768_) >>> 8;
				    int i_3769_ = is[i_3723_];
				    int i_3770_ = i_3765_ + i_3769_;
				    int i_3771_ = ((i_3765_ & 0xff00ff)
						   + (i_3769_ & 0xff00ff));
				    i_3769_
					= ((i_3771_ & 0x1000100)
					   + (i_3770_ - i_3771_ & 0x10000));
				    is[i_3723_]
					= (i_3770_ - i_3769_
					   | i_3769_ - (i_3769_ >>> 8));
				}
			    } else if (i == 3) {
				byte i_3772_ = aByteArray11422[i_3722_];
				int i_3773_ = (i_3772_ > 0
					       ? anIntArray11423[i_3772_] : 0);
				int i_3774_ = anInt9026;
				int i_3775_ = i_3773_ + i_3774_;
				int i_3776_ = ((i_3773_ & 0xff00ff)
					       + (i_3774_ & 0xff00ff));
				int i_3777_
				    = ((i_3776_ & 0x1000100)
				       + (i_3775_ - i_3776_ & 0x10000));
				i_3777_
				    = i_3775_ - i_3777_ | i_3777_ - (i_3777_
								     >>> 8);
				if (i_3773_ == 0 && anInt9007 != 255) {
				    i_3773_ = i_3777_;
				    i_3777_ = is[i_3723_];
				    i_3777_
					= ((((i_3773_ & 0xff00ff) * anInt9007
					     + ((i_3777_ & 0xff00ff)
						* anInt9028))
					    & ~0xff00ff)
					   + (((i_3773_ & 0xff00) * anInt9007
					       + ((i_3777_ & 0xff00)
						  * anInt9028))
					      & 0xff0000)) >> 8;
				}
				is[i_3723_] = i_3777_;
			    } else if (i == 2) {
				int i_3778_ = aByteArray11422[i_3722_];
				if (i_3778_ != 0) {
				    int i_3779_
					= anIntArray11423[i_3778_ & 0xff];
				    int i_3780_
					= ((i_3779_ & 0xff00ff) * anInt9007
					   & ~0xff00ff);
				    int i_3781_
					= ((i_3779_ & 0xff00) * anInt9007
					   & 0xff0000);
				    i_3779_ = (((i_3780_ | i_3781_) >>> 8)
					       + anInt9034);
				    int i_3782_ = is[i_3723_];
				    int i_3783_ = i_3779_ + i_3782_;
				    int i_3784_ = ((i_3779_ & 0xff00ff)
						   + (i_3782_ & 0xff00ff));
				    i_3782_
					= ((i_3784_ & 0x1000100)
					   + (i_3783_ - i_3784_ & 0x10000));
				    is[i_3723_]
					= (i_3783_ - i_3782_
					   | i_3782_ - (i_3782_ >>> 8));
				}
			    }
			} else
			    throw new IllegalArgumentException();
			i_3717_ += anInt9006;
			i_3718_ += anInt9017;
		    }
		    anInt9022 += anInt9018;
		    anInt8999 += anInt9010;
		    anInt9015 += anInt9014;
		}
	    }
	}
    }
}
