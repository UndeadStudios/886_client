/* Class175_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class175_Sub2 extends Class175
{
    byte[][] aByteArrayArray9887;
    Class182_Sub2 aClass182_Sub2_9888;
    int[] anIntArray9889;
    int[] anIntArray9890;
    int[] anIntArray9891;
    int[] anIntArray9892;
    static boolean aBool9893;
    
    void method2853(char c, int i, int i_0_, int i_1_, boolean bool) {
	if (null != aClass182_Sub2_9888.anIntArray9466) {
	    i += anIntArray9892[c];
	    i_0_ += anIntArray9891[c];
	    int i_2_ = anIntArray9889[c];
	    int i_3_ = anIntArray9890[c];
	    int i_4_ = aClass182_Sub2_9888.anInt9494 * -476035351;
	    int i_5_ = i_4_ * i_0_ + i;
	    int i_6_ = i_4_ - i_2_;
	    int i_7_ = 0;
	    int i_8_ = 0;
	    if (i_0_ < 1722112305 * aClass182_Sub2_9888.anInt9472) {
		int i_9_ = aClass182_Sub2_9888.anInt9472 * 1722112305 - i_0_;
		i_3_ -= i_9_;
		i_0_ = 1722112305 * aClass182_Sub2_9888.anInt9472;
		i_8_ += i_2_ * i_9_;
		i_5_ += i_4_ * i_9_;
	    }
	    if (i_0_ + i_3_ > aClass182_Sub2_9888.anInt9473 * 1920901985)
		i_3_ -= (i_0_ + i_3_
			 - 1920901985 * aClass182_Sub2_9888.anInt9473);
	    if (i < aClass182_Sub2_9888.anInt9470 * 1988019027) {
		int i_10_ = aClass182_Sub2_9888.anInt9470 * 1988019027 - i;
		i_2_ -= i_10_;
		i = aClass182_Sub2_9888.anInt9470 * 1988019027;
		i_8_ += i_10_;
		i_5_ += i_10_;
		i_7_ += i_10_;
		i_6_ += i_10_;
	    }
	    if (i_2_ + i > aClass182_Sub2_9888.anInt9499 * -466178451) {
		int i_11_
		    = i_2_ + i - aClass182_Sub2_9888.anInt9499 * -466178451;
		i_2_ -= i_11_;
		i_7_ += i_11_;
		i_6_ += i_11_;
	    }
	    if (i_2_ > 0 && i_3_ > 0)
		method15599(aByteArrayArray9887[c],
			    aClass182_Sub2_9888.anIntArray9466, i_1_, i_8_,
			    i_5_, i_2_, i_3_, i_6_, i_7_);
	}
    }
    
    void method2854(char c, int i, int i_12_, int i_13_, boolean bool) {
	if (null != aClass182_Sub2_9888.anIntArray9466) {
	    i += anIntArray9892[c];
	    i_12_ += anIntArray9891[c];
	    int i_14_ = anIntArray9889[c];
	    int i_15_ = anIntArray9890[c];
	    int i_16_ = aClass182_Sub2_9888.anInt9494 * -476035351;
	    int i_17_ = i_16_ * i_12_ + i;
	    int i_18_ = i_16_ - i_14_;
	    int i_19_ = 0;
	    int i_20_ = 0;
	    if (i_12_ < 1722112305 * aClass182_Sub2_9888.anInt9472) {
		int i_21_ = aClass182_Sub2_9888.anInt9472 * 1722112305 - i_12_;
		i_15_ -= i_21_;
		i_12_ = 1722112305 * aClass182_Sub2_9888.anInt9472;
		i_20_ += i_14_ * i_21_;
		i_17_ += i_16_ * i_21_;
	    }
	    if (i_12_ + i_15_ > aClass182_Sub2_9888.anInt9473 * 1920901985)
		i_15_ -= (i_12_ + i_15_
			  - 1920901985 * aClass182_Sub2_9888.anInt9473);
	    if (i < aClass182_Sub2_9888.anInt9470 * 1988019027) {
		int i_22_ = aClass182_Sub2_9888.anInt9470 * 1988019027 - i;
		i_14_ -= i_22_;
		i = aClass182_Sub2_9888.anInt9470 * 1988019027;
		i_20_ += i_22_;
		i_17_ += i_22_;
		i_19_ += i_22_;
		i_18_ += i_22_;
	    }
	    if (i_14_ + i > aClass182_Sub2_9888.anInt9499 * -466178451) {
		int i_23_
		    = i_14_ + i - aClass182_Sub2_9888.anInt9499 * -466178451;
		i_14_ -= i_23_;
		i_19_ += i_23_;
		i_18_ += i_23_;
	    }
	    if (i_14_ > 0 && i_15_ > 0)
		method15599(aByteArrayArray9887[c],
			    aClass182_Sub2_9888.anIntArray9466, i_13_, i_20_,
			    i_17_, i_14_, i_15_, i_18_, i_19_);
	}
    }
    
    void method2868(char c, int i, int i_24_, int i_25_, boolean bool,
		    Class152 class152, int i_26_, int i_27_) {
	if (null != aClass182_Sub2_9888.anIntArray9466) {
	    if (class152 == null)
		method2874(c, i, i_24_, i_25_, bool);
	    else {
		i += anIntArray9892[c];
		i_24_ += anIntArray9891[c];
		int i_28_ = anIntArray9889[c];
		int i_29_ = anIntArray9890[c];
		int i_30_ = aClass182_Sub2_9888.anInt9494 * -476035351;
		int i_31_ = i + i_24_ * i_30_;
		int i_32_ = i_30_ - i_28_;
		int i_33_ = 0;
		int i_34_ = 0;
		if (i_24_ < aClass182_Sub2_9888.anInt9472 * 1722112305) {
		    int i_35_
			= aClass182_Sub2_9888.anInt9472 * 1722112305 - i_24_;
		    i_29_ -= i_35_;
		    i_24_ = 1722112305 * aClass182_Sub2_9888.anInt9472;
		    i_34_ += i_35_ * i_28_;
		    i_31_ += i_30_ * i_35_;
		}
		if (i_29_ + i_24_ > 1920901985 * aClass182_Sub2_9888.anInt9473)
		    i_29_ -= (i_29_ + i_24_
			      - 1920901985 * aClass182_Sub2_9888.anInt9473);
		if (i < aClass182_Sub2_9888.anInt9470 * 1988019027) {
		    int i_36_ = aClass182_Sub2_9888.anInt9470 * 1988019027 - i;
		    i_28_ -= i_36_;
		    i = aClass182_Sub2_9888.anInt9470 * 1988019027;
		    i_34_ += i_36_;
		    i_31_ += i_36_;
		    i_33_ += i_36_;
		    i_32_ += i_36_;
		}
		if (i_28_ + i > aClass182_Sub2_9888.anInt9499 * -466178451) {
		    int i_37_ = (i + i_28_
				 - -466178451 * aClass182_Sub2_9888.anInt9499);
		    i_28_ -= i_37_;
		    i_33_ += i_37_;
		    i_32_ += i_37_;
		}
		if (i_28_ > 0 && i_29_ > 0)
		    method15600(aByteArrayArray9887[c],
				aClass182_Sub2_9888.anIntArray9466, i_25_,
				i_34_, i_31_, i_28_, i_29_, i_32_, i_33_, i,
				i_24_, anIntArray9889[c], class152, i_26_,
				i_27_);
	    }
	}
    }
    
    void method15599(byte[] is, int[] is_38_, int i, int i_39_, int i_40_,
		     int i_41_, int i_42_, int i_43_, int i_44_) {
	for (int i_45_ = -i_42_; i_45_ < 0; i_45_++) {
	    for (int i_46_ = -i_41_; i_46_ < 0; i_46_++) {
		int i_47_ = is[i_39_++] & 0xff;
		if (0 != i_47_) {
		    int i_48_ = (((i_47_ * (i & 0xff00) & 0xff0000)
				  + ((i & 0xff00ff) * i_47_ & ~0xff00ff))
				 >> 8);
		    i_47_ = 256 - i_47_;
		    int i_49_ = is_38_[i_40_];
		    is_38_[i_40_++]
			= (((i_47_ * (i_49_ & 0xff00) & 0xff0000)
			    + (i_47_ * (i_49_ & 0xff00ff) & ~0xff00ff))
			   >> 8) + i_48_;
		} else
		    i_40_++;
	    }
	    i_40_ += i_43_;
	    i_39_ += i_44_;
	}
    }
    
    void method2860(char c, int i, int i_50_, int i_51_, boolean bool,
		    Class152 class152, int i_52_, int i_53_) {
	if (null != aClass182_Sub2_9888.anIntArray9466) {
	    if (class152 == null)
		method2874(c, i, i_50_, i_51_, bool);
	    else {
		i += anIntArray9892[c];
		i_50_ += anIntArray9891[c];
		int i_54_ = anIntArray9889[c];
		int i_55_ = anIntArray9890[c];
		int i_56_ = aClass182_Sub2_9888.anInt9494 * -476035351;
		int i_57_ = i + i_50_ * i_56_;
		int i_58_ = i_56_ - i_54_;
		int i_59_ = 0;
		int i_60_ = 0;
		if (i_50_ < aClass182_Sub2_9888.anInt9472 * 1722112305) {
		    int i_61_
			= aClass182_Sub2_9888.anInt9472 * 1722112305 - i_50_;
		    i_55_ -= i_61_;
		    i_50_ = 1722112305 * aClass182_Sub2_9888.anInt9472;
		    i_60_ += i_61_ * i_54_;
		    i_57_ += i_56_ * i_61_;
		}
		if (i_55_ + i_50_ > 1920901985 * aClass182_Sub2_9888.anInt9473)
		    i_55_ -= (i_55_ + i_50_
			      - 1920901985 * aClass182_Sub2_9888.anInt9473);
		if (i < aClass182_Sub2_9888.anInt9470 * 1988019027) {
		    int i_62_ = aClass182_Sub2_9888.anInt9470 * 1988019027 - i;
		    i_54_ -= i_62_;
		    i = aClass182_Sub2_9888.anInt9470 * 1988019027;
		    i_60_ += i_62_;
		    i_57_ += i_62_;
		    i_59_ += i_62_;
		    i_58_ += i_62_;
		}
		if (i_54_ + i > aClass182_Sub2_9888.anInt9499 * -466178451) {
		    int i_63_ = (i + i_54_
				 - -466178451 * aClass182_Sub2_9888.anInt9499);
		    i_54_ -= i_63_;
		    i_59_ += i_63_;
		    i_58_ += i_63_;
		}
		if (i_54_ > 0 && i_55_ > 0)
		    method15600(aByteArrayArray9887[c],
				aClass182_Sub2_9888.anIntArray9466, i_51_,
				i_60_, i_57_, i_54_, i_55_, i_58_, i_59_, i,
				i_50_, anIntArray9889[c], class152, i_52_,
				i_53_);
	    }
	}
    }
    
    void method15600(byte[] is, int[] is_64_, int i, int i_65_, int i_66_,
		     int i_67_, int i_68_, int i_69_, int i_70_, int i_71_,
		     int i_72_, int i_73_, Class152 class152, int i_74_,
		     int i_75_) {
	Class152_Sub1 class152_sub1 = (Class152_Sub1) class152;
	int[] is_76_ = class152_sub1.anIntArray8998;
	int[] is_77_ = class152_sub1.anIntArray8997;
	int i_78_ = i_71_ - 1988019027 * aClass182_Sub2_9888.anInt9470;
	int i_79_ = i_72_;
	if (i_75_ > i_79_) {
	    i_79_ = i_75_;
	    i_66_ += (i_75_ - i_72_) * (-476035351
					* aClass182_Sub2_9888.anInt9494);
	    i_65_ += i_73_ * (i_75_ - i_72_);
	}
	int i_80_ = (is_76_.length + i_75_ < i_68_ + i_72_
		     ? i_75_ + is_76_.length : i_68_ + i_72_);
	for (int i_81_ = i_79_; i_81_ < i_80_; i_81_++) {
	    int i_82_ = i_74_ + is_76_[i_81_ - i_75_];
	    int i_83_ = is_77_[i_81_ - i_75_];
	    int i_84_ = i_67_;
	    if (i_78_ > i_82_) {
		int i_85_ = i_78_ - i_82_;
		if (i_85_ >= i_83_) {
		    i_65_ += i_67_ + i_70_;
		    i_66_ += i_67_ + i_69_;
		    continue;
		}
		i_83_ -= i_85_;
	    } else {
		int i_86_ = i_82_ - i_78_;
		if (i_86_ >= i_67_) {
		    i_65_ += i_67_ + i_70_;
		    i_66_ += i_67_ + i_69_;
		    continue;
		}
		i_65_ += i_86_;
		i_84_ -= i_86_;
		i_66_ += i_86_;
	    }
	    int i_87_ = 0;
	    if (i_84_ < i_83_)
		i_83_ = i_84_;
	    else
		i_87_ = i_84_ - i_83_;
	    for (int i_88_ = -i_83_; i_88_ < 0; i_88_++) {
		int i_89_ = is[i_65_++] & 0xff;
		if (0 != i_89_) {
		    int i_90_ = (((i_89_ * (i & 0xff00) & 0xff0000)
				  + ((i & 0xff00ff) * i_89_ & ~0xff00ff))
				 >> 8);
		    i_89_ = 256 - i_89_;
		    int i_91_ = is_64_[i_66_];
		    is_64_[i_66_++]
			= (((i_89_ * (i_91_ & 0xff00) & 0xff0000)
			    + (i_89_ * (i_91_ & 0xff00ff) & ~0xff00ff))
			   >> 8) + i_90_;
		} else
		    i_66_++;
	    }
	    i_65_ += i_70_ + i_87_;
	    i_66_ += i_87_ + i_69_;
	}
    }
    
    Class175_Sub2(Class182_Sub2 class182_sub2, Class7 class7,
		  Class173_Sub1[] class173_sub1s, int[] is, int[] is_92_) {
	super(class182_sub2, class7);
	aClass182_Sub2_9888 = class182_sub2;
	aClass182_Sub2_9888 = class182_sub2;
	anIntArray9889 = is;
	anIntArray9890 = is_92_;
	aByteArrayArray9887 = new byte[class173_sub1s.length][];
	anIntArray9891 = new int[class173_sub1s.length];
	anIntArray9892 = new int[class173_sub1s.length];
	for (int i = 0; i < class173_sub1s.length; i++) {
	    Class173_Sub1 class173_sub1 = class173_sub1s[i];
	    int[] is_93_ = class173_sub1.method2778(false);
	    byte[] is_94_ = aByteArrayArray9887[i] = new byte[is_93_.length];
	    for (int i_95_ = 0; i_95_ < is_93_.length; i_95_++)
		is_94_[i_95_] = (byte) (is_93_[i_95_] >> 24 & 0xff);
	    anIntArray9891[i] = class173_sub1.method2768();
	    anIntArray9892[i] = class173_sub1.method2766();
	}
    }
    
    void method2874(char c, int i, int i_96_, int i_97_, boolean bool) {
	if (null != aClass182_Sub2_9888.anIntArray9466) {
	    i += anIntArray9892[c];
	    i_96_ += anIntArray9891[c];
	    int i_98_ = anIntArray9889[c];
	    int i_99_ = anIntArray9890[c];
	    int i_100_ = aClass182_Sub2_9888.anInt9494 * -476035351;
	    int i_101_ = i_100_ * i_96_ + i;
	    int i_102_ = i_100_ - i_98_;
	    int i_103_ = 0;
	    int i_104_ = 0;
	    if (i_96_ < 1722112305 * aClass182_Sub2_9888.anInt9472) {
		int i_105_
		    = aClass182_Sub2_9888.anInt9472 * 1722112305 - i_96_;
		i_99_ -= i_105_;
		i_96_ = 1722112305 * aClass182_Sub2_9888.anInt9472;
		i_104_ += i_98_ * i_105_;
		i_101_ += i_100_ * i_105_;
	    }
	    if (i_96_ + i_99_ > aClass182_Sub2_9888.anInt9473 * 1920901985)
		i_99_ -= (i_96_ + i_99_
			  - 1920901985 * aClass182_Sub2_9888.anInt9473);
	    if (i < aClass182_Sub2_9888.anInt9470 * 1988019027) {
		int i_106_ = aClass182_Sub2_9888.anInt9470 * 1988019027 - i;
		i_98_ -= i_106_;
		i = aClass182_Sub2_9888.anInt9470 * 1988019027;
		i_104_ += i_106_;
		i_101_ += i_106_;
		i_103_ += i_106_;
		i_102_ += i_106_;
	    }
	    if (i_98_ + i > aClass182_Sub2_9888.anInt9499 * -466178451) {
		int i_107_
		    = i_98_ + i - aClass182_Sub2_9888.anInt9499 * -466178451;
		i_98_ -= i_107_;
		i_103_ += i_107_;
		i_102_ += i_107_;
	    }
	    if (i_98_ > 0 && i_99_ > 0)
		method15599(aByteArrayArray9887[c],
			    aClass182_Sub2_9888.anIntArray9466, i_97_, i_104_,
			    i_101_, i_98_, i_99_, i_102_, i_103_);
	}
    }
    
    void method2856(char c, int i, int i_108_, int i_109_, boolean bool) {
	if (null != aClass182_Sub2_9888.anIntArray9466) {
	    i += anIntArray9892[c];
	    i_108_ += anIntArray9891[c];
	    int i_110_ = anIntArray9889[c];
	    int i_111_ = anIntArray9890[c];
	    int i_112_ = aClass182_Sub2_9888.anInt9494 * -476035351;
	    int i_113_ = i_112_ * i_108_ + i;
	    int i_114_ = i_112_ - i_110_;
	    int i_115_ = 0;
	    int i_116_ = 0;
	    if (i_108_ < 1722112305 * aClass182_Sub2_9888.anInt9472) {
		int i_117_
		    = aClass182_Sub2_9888.anInt9472 * 1722112305 - i_108_;
		i_111_ -= i_117_;
		i_108_ = 1722112305 * aClass182_Sub2_9888.anInt9472;
		i_116_ += i_110_ * i_117_;
		i_113_ += i_112_ * i_117_;
	    }
	    if (i_108_ + i_111_ > aClass182_Sub2_9888.anInt9473 * 1920901985)
		i_111_ -= (i_108_ + i_111_
			   - 1920901985 * aClass182_Sub2_9888.anInt9473);
	    if (i < aClass182_Sub2_9888.anInt9470 * 1988019027) {
		int i_118_ = aClass182_Sub2_9888.anInt9470 * 1988019027 - i;
		i_110_ -= i_118_;
		i = aClass182_Sub2_9888.anInt9470 * 1988019027;
		i_116_ += i_118_;
		i_113_ += i_118_;
		i_115_ += i_118_;
		i_114_ += i_118_;
	    }
	    if (i_110_ + i > aClass182_Sub2_9888.anInt9499 * -466178451) {
		int i_119_
		    = i_110_ + i - aClass182_Sub2_9888.anInt9499 * -466178451;
		i_110_ -= i_119_;
		i_115_ += i_119_;
		i_114_ += i_119_;
	    }
	    if (i_110_ > 0 && i_111_ > 0)
		method15599(aByteArrayArray9887[c],
			    aClass182_Sub2_9888.anIntArray9466, i_109_, i_116_,
			    i_113_, i_110_, i_111_, i_114_, i_115_);
	}
    }
    
    void method2857(char c, int i, int i_120_, int i_121_, boolean bool,
		    Class152 class152, int i_122_, int i_123_) {
	if (null != aClass182_Sub2_9888.anIntArray9466) {
	    if (class152 == null)
		method2874(c, i, i_120_, i_121_, bool);
	    else {
		i += anIntArray9892[c];
		i_120_ += anIntArray9891[c];
		int i_124_ = anIntArray9889[c];
		int i_125_ = anIntArray9890[c];
		int i_126_ = aClass182_Sub2_9888.anInt9494 * -476035351;
		int i_127_ = i + i_120_ * i_126_;
		int i_128_ = i_126_ - i_124_;
		int i_129_ = 0;
		int i_130_ = 0;
		if (i_120_ < aClass182_Sub2_9888.anInt9472 * 1722112305) {
		    int i_131_
			= aClass182_Sub2_9888.anInt9472 * 1722112305 - i_120_;
		    i_125_ -= i_131_;
		    i_120_ = 1722112305 * aClass182_Sub2_9888.anInt9472;
		    i_130_ += i_131_ * i_124_;
		    i_127_ += i_126_ * i_131_;
		}
		if (i_125_ + i_120_
		    > 1920901985 * aClass182_Sub2_9888.anInt9473)
		    i_125_ -= (i_125_ + i_120_
			       - 1920901985 * aClass182_Sub2_9888.anInt9473);
		if (i < aClass182_Sub2_9888.anInt9470 * 1988019027) {
		    int i_132_
			= aClass182_Sub2_9888.anInt9470 * 1988019027 - i;
		    i_124_ -= i_132_;
		    i = aClass182_Sub2_9888.anInt9470 * 1988019027;
		    i_130_ += i_132_;
		    i_127_ += i_132_;
		    i_129_ += i_132_;
		    i_128_ += i_132_;
		}
		if (i_124_ + i > aClass182_Sub2_9888.anInt9499 * -466178451) {
		    int i_133_
			= (i + i_124_
			   - -466178451 * aClass182_Sub2_9888.anInt9499);
		    i_124_ -= i_133_;
		    i_129_ += i_133_;
		    i_128_ += i_133_;
		}
		if (i_124_ > 0 && i_125_ > 0)
		    method15600(aByteArrayArray9887[c],
				aClass182_Sub2_9888.anIntArray9466, i_121_,
				i_130_, i_127_, i_124_, i_125_, i_128_, i_129_,
				i, i_120_, anIntArray9889[c], class152, i_122_,
				i_123_);
	    }
	}
    }
    
    void method2858(char c, int i, int i_134_, int i_135_, boolean bool,
		    Class152 class152, int i_136_, int i_137_) {
	if (null != aClass182_Sub2_9888.anIntArray9466) {
	    if (class152 == null)
		method2874(c, i, i_134_, i_135_, bool);
	    else {
		i += anIntArray9892[c];
		i_134_ += anIntArray9891[c];
		int i_138_ = anIntArray9889[c];
		int i_139_ = anIntArray9890[c];
		int i_140_ = aClass182_Sub2_9888.anInt9494 * -476035351;
		int i_141_ = i + i_134_ * i_140_;
		int i_142_ = i_140_ - i_138_;
		int i_143_ = 0;
		int i_144_ = 0;
		if (i_134_ < aClass182_Sub2_9888.anInt9472 * 1722112305) {
		    int i_145_
			= aClass182_Sub2_9888.anInt9472 * 1722112305 - i_134_;
		    i_139_ -= i_145_;
		    i_134_ = 1722112305 * aClass182_Sub2_9888.anInt9472;
		    i_144_ += i_145_ * i_138_;
		    i_141_ += i_140_ * i_145_;
		}
		if (i_139_ + i_134_
		    > 1920901985 * aClass182_Sub2_9888.anInt9473)
		    i_139_ -= (i_139_ + i_134_
			       - 1920901985 * aClass182_Sub2_9888.anInt9473);
		if (i < aClass182_Sub2_9888.anInt9470 * 1988019027) {
		    int i_146_
			= aClass182_Sub2_9888.anInt9470 * 1988019027 - i;
		    i_138_ -= i_146_;
		    i = aClass182_Sub2_9888.anInt9470 * 1988019027;
		    i_144_ += i_146_;
		    i_141_ += i_146_;
		    i_143_ += i_146_;
		    i_142_ += i_146_;
		}
		if (i_138_ + i > aClass182_Sub2_9888.anInt9499 * -466178451) {
		    int i_147_
			= (i + i_138_
			   - -466178451 * aClass182_Sub2_9888.anInt9499);
		    i_138_ -= i_147_;
		    i_143_ += i_147_;
		    i_142_ += i_147_;
		}
		if (i_138_ > 0 && i_139_ > 0)
		    method15600(aByteArrayArray9887[c],
				aClass182_Sub2_9888.anIntArray9466, i_135_,
				i_144_, i_141_, i_138_, i_139_, i_142_, i_143_,
				i, i_134_, anIntArray9889[c], class152, i_136_,
				i_137_);
	    }
	}
    }
    
    void method2835(char c, int i, int i_148_, int i_149_, boolean bool,
		    Class152 class152, int i_150_, int i_151_) {
	if (null != aClass182_Sub2_9888.anIntArray9466) {
	    if (class152 == null)
		method2874(c, i, i_148_, i_149_, bool);
	    else {
		i += anIntArray9892[c];
		i_148_ += anIntArray9891[c];
		int i_152_ = anIntArray9889[c];
		int i_153_ = anIntArray9890[c];
		int i_154_ = aClass182_Sub2_9888.anInt9494 * -476035351;
		int i_155_ = i + i_148_ * i_154_;
		int i_156_ = i_154_ - i_152_;
		int i_157_ = 0;
		int i_158_ = 0;
		if (i_148_ < aClass182_Sub2_9888.anInt9472 * 1722112305) {
		    int i_159_
			= aClass182_Sub2_9888.anInt9472 * 1722112305 - i_148_;
		    i_153_ -= i_159_;
		    i_148_ = 1722112305 * aClass182_Sub2_9888.anInt9472;
		    i_158_ += i_159_ * i_152_;
		    i_155_ += i_154_ * i_159_;
		}
		if (i_153_ + i_148_
		    > 1920901985 * aClass182_Sub2_9888.anInt9473)
		    i_153_ -= (i_153_ + i_148_
			       - 1920901985 * aClass182_Sub2_9888.anInt9473);
		if (i < aClass182_Sub2_9888.anInt9470 * 1988019027) {
		    int i_160_
			= aClass182_Sub2_9888.anInt9470 * 1988019027 - i;
		    i_152_ -= i_160_;
		    i = aClass182_Sub2_9888.anInt9470 * 1988019027;
		    i_158_ += i_160_;
		    i_155_ += i_160_;
		    i_157_ += i_160_;
		    i_156_ += i_160_;
		}
		if (i_152_ + i > aClass182_Sub2_9888.anInt9499 * -466178451) {
		    int i_161_
			= (i + i_152_
			   - -466178451 * aClass182_Sub2_9888.anInt9499);
		    i_152_ -= i_161_;
		    i_157_ += i_161_;
		    i_156_ += i_161_;
		}
		if (i_152_ > 0 && i_153_ > 0)
		    method15600(aByteArrayArray9887[c],
				aClass182_Sub2_9888.anIntArray9466, i_149_,
				i_158_, i_155_, i_152_, i_153_, i_156_, i_157_,
				i, i_148_, anIntArray9889[c], class152, i_150_,
				i_151_);
	    }
	}
    }
    
    Class175_Sub2(Class182_Sub2 class182_sub2, Class7 class7,
		  Class173_Sub2[] class173_sub2s, int[] is, int[] is_162_) {
	super(class182_sub2, class7);
	aClass182_Sub2_9888 = class182_sub2;
	aClass182_Sub2_9888 = class182_sub2;
	anIntArray9889 = is;
	anIntArray9890 = is_162_;
	aByteArrayArray9887 = new byte[class173_sub2s.length][];
	anIntArray9891 = new int[class173_sub2s.length];
	anIntArray9892 = new int[class173_sub2s.length];
	for (int i = 0; i < class173_sub2s.length; i++) {
	    Class173_Sub2 class173_sub2 = class173_sub2s[i];
	    if (null != class173_sub2.aByteArray9626)
		aByteArrayArray9887[i] = class173_sub2.aByteArray9626;
	    else {
		byte[] is_163_ = class173_sub2.aByteArray9622;
		byte[] is_164_
		    = aByteArrayArray9887[i] = new byte[is_163_.length];
		for (int i_165_ = 0; i_165_ < is_163_.length; i_165_++)
		    is_164_[i_165_] = (byte) (is_163_[i_165_] == 0 ? 0 : -1);
	    }
	    anIntArray9891[i] = class173_sub2.anInt9621;
	    anIntArray9892[i] = class173_sub2.anInt9620;
	}
    }
    
    void method15601(byte[] is, int[] is_166_, int i, int i_167_, int i_168_,
		     int i_169_, int i_170_, int i_171_, int i_172_) {
	for (int i_173_ = -i_170_; i_173_ < 0; i_173_++) {
	    for (int i_174_ = -i_169_; i_174_ < 0; i_174_++) {
		int i_175_ = is[i_167_++] & 0xff;
		if (0 != i_175_) {
		    int i_176_ = (((i_175_ * (i & 0xff00) & 0xff0000)
				   + ((i & 0xff00ff) * i_175_ & ~0xff00ff))
				  >> 8);
		    i_175_ = 256 - i_175_;
		    int i_177_ = is_166_[i_168_];
		    is_166_[i_168_++]
			= (((i_175_ * (i_177_ & 0xff00) & 0xff0000)
			    + (i_175_ * (i_177_ & 0xff00ff) & ~0xff00ff))
			   >> 8) + i_176_;
		} else
		    i_168_++;
	    }
	    i_168_ += i_171_;
	    i_167_ += i_172_;
	}
    }
    
    void method15602(byte[] is, int[] is_178_, int i, int i_179_, int i_180_,
		     int i_181_, int i_182_, int i_183_, int i_184_,
		     int i_185_, int i_186_, int i_187_, Class152 class152,
		     int i_188_, int i_189_) {
	Class152_Sub1 class152_sub1 = (Class152_Sub1) class152;
	int[] is_190_ = class152_sub1.anIntArray8998;
	int[] is_191_ = class152_sub1.anIntArray8997;
	int i_192_ = i_185_ - 1988019027 * aClass182_Sub2_9888.anInt9470;
	int i_193_ = i_186_;
	if (i_189_ > i_193_) {
	    i_193_ = i_189_;
	    i_180_ += (i_189_ - i_186_) * (-476035351
					   * aClass182_Sub2_9888.anInt9494);
	    i_179_ += i_187_ * (i_189_ - i_186_);
	}
	int i_194_ = (is_190_.length + i_189_ < i_182_ + i_186_
		      ? i_189_ + is_190_.length : i_182_ + i_186_);
	for (int i_195_ = i_193_; i_195_ < i_194_; i_195_++) {
	    int i_196_ = i_188_ + is_190_[i_195_ - i_189_];
	    int i_197_ = is_191_[i_195_ - i_189_];
	    int i_198_ = i_181_;
	    if (i_192_ > i_196_) {
		int i_199_ = i_192_ - i_196_;
		if (i_199_ >= i_197_) {
		    i_179_ += i_181_ + i_184_;
		    i_180_ += i_181_ + i_183_;
		    continue;
		}
		i_197_ -= i_199_;
	    } else {
		int i_200_ = i_196_ - i_192_;
		if (i_200_ >= i_181_) {
		    i_179_ += i_181_ + i_184_;
		    i_180_ += i_181_ + i_183_;
		    continue;
		}
		i_179_ += i_200_;
		i_198_ -= i_200_;
		i_180_ += i_200_;
	    }
	    int i_201_ = 0;
	    if (i_198_ < i_197_)
		i_197_ = i_198_;
	    else
		i_201_ = i_198_ - i_197_;
	    for (int i_202_ = -i_197_; i_202_ < 0; i_202_++) {
		int i_203_ = is[i_179_++] & 0xff;
		if (0 != i_203_) {
		    int i_204_ = (((i_203_ * (i & 0xff00) & 0xff0000)
				   + ((i & 0xff00ff) * i_203_ & ~0xff00ff))
				  >> 8);
		    i_203_ = 256 - i_203_;
		    int i_205_ = is_178_[i_180_];
		    is_178_[i_180_++]
			= (((i_203_ * (i_205_ & 0xff00) & 0xff0000)
			    + (i_203_ * (i_205_ & 0xff00ff) & ~0xff00ff))
			   >> 8) + i_204_;
		} else
		    i_180_++;
	    }
	    i_179_ += i_184_ + i_201_;
	    i_180_ += i_201_ + i_183_;
	}
    }
    
    static Class2 method15603(Class8 class8, RSBuffer class525_sub38,
			      int i, int i_206_) {
	Class2 class2 = new Class2(class8);
	int i_207_ = class525_sub38.readUnsignedByte(216456986);
	boolean bool = (i_207_ & 0x1) != 0;
	boolean bool_208_ = (i_207_ & 0x2) != 0;
	boolean bool_209_ = 0 != (i_207_ & 0x4);
	boolean bool_210_ = (i_207_ & 0x8) != 0;
	if (bool) {
	    if (i <= 1) {
		class2.anIntArray22[0] = class525_sub38.readUnsignedShort((byte) 30);
		class2.anIntArray16[0]
		    = class525_sub38.readUnsignedShort((byte) 121);
	    } else {
		class2.anIntArray22[0]
		    = class525_sub38.readBigSmart(-2043778683);
		class2.anIntArray16[0]
		    = class525_sub38.readBigSmart(-2043778683);
	    }
	    if (-1 != class8.anInt91 * -1343555447
		|| -1 != 49799703 * class8.anInt94) {
		if (i <= 1) {
		    class2.anIntArray22[1]
			= class525_sub38.readUnsignedShort((byte) 117);
		    class2.anIntArray16[1]
			= class525_sub38.readUnsignedShort((byte) 29);
		} else {
		    class2.anIntArray22[1]
			= class525_sub38.readBigSmart(-2043778683);
		    class2.anIntArray16[1]
			= class525_sub38.readBigSmart(-2043778683);
		}
	    }
	    if (-1 != class8.anInt82 * 74846191
		|| class8.anInt62 * -2096722129 != -1) {
		if (i <= 1) {
		    class2.anIntArray22[2]
			= class525_sub38.readUnsignedShort((byte) 23);
		    class2.anIntArray16[2]
			= class525_sub38.readUnsignedShort((byte) 48);
		} else {
		    class2.anIntArray22[2]
			= class525_sub38.readBigSmart(-2043778683);
		    class2.anIntArray16[2]
			= class525_sub38.readBigSmart(-2043778683);
		}
	    }
	}
	if (bool_208_) {
	    if (i <= 1) {
		class2.anIntArray15[0]
		    = class525_sub38.readUnsignedShort((byte) 103);
		class2.anIntArray23[0] = class525_sub38.readUnsignedShort((byte) 6);
	    } else {
		class2.anIntArray15[0]
		    = class525_sub38.readBigSmart(-2043778683);
		class2.anIntArray23[0]
		    = class525_sub38.readBigSmart(-2043778683);
	    }
	    if (-252626025 * class8.anInt104 != -1
		|| -1 != class8.anInt106 * -769283651) {
		if (i <= 1) {
		    class2.anIntArray15[1]
			= class525_sub38.readUnsignedShort((byte) 115);
		    class2.anIntArray23[1]
			= class525_sub38.readUnsignedShort((byte) 107);
		} else {
		    class2.anIntArray15[1]
			= class525_sub38.readBigSmart(-2043778683);
		    class2.anIntArray23[1]
			= class525_sub38.readBigSmart(-2043778683);
		}
	    }
	}
	if (bool_209_) {
	    int i_211_ = class525_sub38.readUnsignedShort((byte) 8);
	    int[] is = new int[4];
	    is[0] = i_211_ & 0xf;
	    is[1] = i_211_ >> 4 & 0xf;
	    is[2] = i_211_ >> 8 & 0xf;
	    is[3] = i_211_ >> 12 & 0xf;
	    for (int i_212_ = 0; i_212_ < 4; i_212_++) {
		if (is[i_212_] != 15)
		    class2.aShortArray24[is[i_212_]]
			= (short) class525_sub38.readUnsignedShort((byte) 115);
	    }
	}
	if (bool_210_) {
	    int i_213_ = class525_sub38.readUnsignedByte(2136921699);
	    int[] is = new int[2];
	    is[0] = i_213_ & 0xf;
	    is[1] = i_213_ >> 4 & 0xf;
	    for (int i_214_ = 0; i_214_ < 2; i_214_++) {
		if (is[i_214_] != 15)
		    class2.aShortArray21[is[i_214_]]
			= (short) class525_sub38.readUnsignedShort((byte) 38);
	    }
	}
	return class2;
    }
    
    static void method15604(RSBuffer class525_sub38, int i, int i_215_) {
	if (null != Class503.aClass37_5568) {
	    try {
		Class503.aClass37_5568.method986(0L);
		Class503.aClass37_5568.method987((class525_sub38
						  .buffer),
						 i, 24, (byte) 1);
	    } catch (Exception exception) {
		/* empty */
	    }
	}
    }
    
    static final void method15605(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class638.method10519(class259, class245, class683, 1312333393);
    }
}
