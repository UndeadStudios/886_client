/* Class146 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaggl.OpenGL;

public class Class146
{
    int anInt1673;
    Class161_Sub1 aClass161_Sub1_1674;
    int anInt1675;
    int anInt1676;
    byte[] aByteArray1677;
    int anInt1678;
    Class124[][] aClass124ArrayArray1679;
    int anInt1680;
    Class182_Sub3 aClass182_Sub3_1681;
    
    static final void method2360(byte[] is, byte[] is_0_, int i, int i_1_,
				 int i_2_, int i_3_, int i_4_, int i_5_) {
	int i_6_ = -(i_2_ >> 2);
	i_2_ = -(i_2_ & 0x3);
	for (int i_7_ = -i_3_; i_7_ < 0; i_7_++) {
	    for (int i_8_ = i_6_; i_8_ < 0; i_8_++) {
		is[i_1_++] += is_0_[i++];
		is[i_1_++] += is_0_[i++];
		is[i_1_++] += is_0_[i++];
		is[i_1_++] += is_0_[i++];
	    }
	    for (int i_9_ = i_2_; i_9_ < 0; i_9_++)
		is[i_1_++] += is_0_[i++];
	    i_1_ += i_4_;
	    i += i_5_;
	}
    }
    
    void method2361() {
	aClass124ArrayArray1679 = new Class124[anInt1680][anInt1673];
	for (int i = 0; i < anInt1673; i++) {
	    for (int i_10_ = 0; i_10_ < anInt1680; i_10_++)
		aClass124ArrayArray1679[i_10_][i]
		    = new Class124(aClass182_Sub3_1681, this,
				   aClass161_Sub1_1674, i_10_, i, anInt1678,
				   i_10_ * 128 + 1, i * 128 + 1);
	}
    }
    
    void method2362(int i, int i_11_, int i_12_, boolean[][] bools,
		    boolean bool) {
	aClass182_Sub3_1681.method15404(false);
	aClass182_Sub3_1681.method15512(false);
	aClass182_Sub3_1681.method15455(-2);
	aClass182_Sub3_1681.method15396(1);
	aClass182_Sub3_1681.method15409(1);
	float f = 1.0F / (float) (aClass182_Sub3_1681.anInt9685 * 128);
	if (bool) {
	    for (int i_13_ = 0; i_13_ < anInt1673; i_13_++) {
		int i_14_ = i_13_ << anInt1678;
		int i_15_ = i_13_ + 1 << anInt1678;
		for (int i_16_ = 0; i_16_ < anInt1680; i_16_++) {
		    int i_17_ = i_16_ << anInt1678;
		    int i_18_ = i_16_ + 1 << anInt1678;
		while_88_:
		    for (int i_19_ = i_17_; i_19_ < i_18_; i_19_++) {
			if (i_19_ - i >= -i_12_ && i_19_ - i <= i_12_) {
			    for (int i_20_ = i_14_; i_20_ < i_15_; i_20_++) {
				if (i_20_ - i_11_ >= -i_12_
				    && i_20_ - i_11_ <= i_12_
				    && (bools[i_19_ - i + i_12_]
					[i_20_ - i_11_ + i_12_])) {
				    OpenGL.glMatrixMode(5890);
				    OpenGL.glLoadIdentity();
				    OpenGL.glScalef(f, f, 1.0F);
				    OpenGL.glTranslatef((float) -i_16_ / f,
							(float) -i_13_ / f,
							1.0F);
				    OpenGL.glMatrixMode(5888);
				    aClass124ArrayArray1679[i_16_][i_13_]
					.method2124();
				    break while_88_;
				}
			    }
			}
		    }
		}
	    }
	} else {
	    for (int i_21_ = 0; i_21_ < anInt1673; i_21_++) {
		int i_22_ = i_21_ << anInt1678;
		int i_23_ = i_21_ + 1 << anInt1678;
		for (int i_24_ = 0; i_24_ < anInt1680; i_24_++) {
		    int i_25_ = 0;
		    int i_26_ = i_24_ << anInt1678;
		    int i_27_ = i_24_ + 1 << anInt1678;
		    Class525_Sub38_Sub1 class525_sub38_sub1
			= aClass182_Sub3_1681.aClass525_Sub38_Sub1_9828;
		    class525_sub38_sub1.pos = 0;
		    for (int i_28_ = i_22_; i_28_ < i_23_; i_28_++) {
			if (i_28_ - i_11_ >= -i_12_
			    && i_28_ - i_11_ <= i_12_) {
			    int i_29_ = (i_28_ * (aClass161_Sub1_1674.anInt1759
						  * 363736815)
					 + i_26_);
			    for (int i_30_ = i_26_; i_30_ < i_27_; i_30_++) {
				if (i_30_ - i >= -i_12_ && i_30_ - i <= i_12_
				    && (bools[i_30_ - i + i_12_]
					[i_28_ - i_11_ + i_12_])) {
				    short[] is
					= (aClass161_Sub1_1674
					   .aShortArrayArray9335[i_29_]);
				    if (is != null) {
					if (aClass182_Sub3_1681.aBool9792) {
					    for (int i_31_ = 0;
						 i_31_ < is.length; i_31_++) {
						class525_sub38_sub1.method16602
						    (is[i_31_] & 0xffff,
						     1130137398);
						i_25_++;
					    }
					} else {
					    for (int i_32_ = 0;
						 i_32_ < is.length; i_32_++) {
						class525_sub38_sub1.method16840
						    (is[i_32_] & 0xffff,
						     241387851);
						i_25_++;
					    }
					}
				    }
				}
				i_29_++;
			    }
			}
		    }
		    if (i_25_ > 0) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glScalef(f, f, 1.0F);
			OpenGL.glTranslatef((float) -i_24_ / f,
					    (float) -i_21_ / f, 1.0F);
			OpenGL.glMatrixMode(5888);
			aClass124ArrayArray1679[i_24_][i_21_].method2120
			    (class525_sub38_sub1.buffer, i_25_);
		    }
		}
	    }
	}
	OpenGL.glMatrixMode(5890);
	OpenGL.glLoadIdentity();
	OpenGL.glMatrixMode(5888);
    }
    
    Class146(Class182_Sub3 class182_sub3, Class161_Sub1 class161_sub1) {
	aClass182_Sub3_1681 = class182_sub3;
	aClass161_Sub1_1674 = class161_sub1;
	anInt1675 = 2 + ((aClass161_Sub1_1674.anInt1759 * 363736815
			  * (aClass161_Sub1_1674.anInt1761 * 435863595))
			 >> aClass182_Sub3_1681.anInt9800);
	anInt1676 = 2 + ((aClass161_Sub1_1674.anInt1760 * -1152334393
			  * (aClass161_Sub1_1674.anInt1761 * 435863595))
			 >> aClass182_Sub3_1681.anInt9800);
	aByteArray1677 = new byte[anInt1675 * anInt1676];
	anInt1678 = (7 + aClass182_Sub3_1681.anInt9800
		     - aClass161_Sub1_1674.anInt1763 * -2063427645);
	anInt1680 = aClass161_Sub1_1674.anInt1759 * 363736815 >> anInt1678;
	anInt1673 = aClass161_Sub1_1674.anInt1760 * -1152334393 >> anInt1678;
    }
    
    void method2363(Class525_Sub16_Sub17 class525_sub16_sub17, int i,
		    int i_33_) {
	Class525_Sub16_Sub17_Sub1 class525_sub16_sub17_sub1
	    = (Class525_Sub16_Sub17_Sub1) class525_sub16_sub17;
	i += class525_sub16_sub17_sub1.anInt12109 + 1;
	i_33_ += class525_sub16_sub17_sub1.anInt12111 + 1;
	int i_34_ = i + i_33_ * anInt1675;
	int i_35_ = 0;
	int i_36_ = class525_sub16_sub17_sub1.anInt12108;
	int i_37_ = class525_sub16_sub17_sub1.anInt12106;
	int i_38_ = anInt1675 - i_37_;
	int i_39_ = 0;
	if (i_33_ <= 0) {
	    int i_40_ = 1 - i_33_;
	    i_36_ -= i_40_;
	    i_35_ += i_40_ * i_37_;
	    i_34_ += i_40_ * anInt1675;
	    i_33_ = 1;
	}
	if (i_33_ + i_36_ >= anInt1676) {
	    int i_41_ = i_33_ + i_36_ + 1 - anInt1676;
	    i_36_ -= i_41_;
	}
	if (i <= 0) {
	    int i_42_ = 1 - i;
	    i_37_ -= i_42_;
	    i_35_ += i_42_;
	    i_34_ += i_42_;
	    i_39_ += i_42_;
	    i_38_ += i_42_;
	    i = 1;
	}
	if (i + i_37_ >= anInt1675) {
	    int i_43_ = i + i_37_ + 1 - anInt1675;
	    i_37_ -= i_43_;
	    i_39_ += i_43_;
	    i_38_ += i_43_;
	}
	if (i_37_ > 0 && i_36_ > 0) {
	    method2367(aByteArray1677,
		       class525_sub16_sub17_sub1.aByteArray12110, i_35_, i_34_,
		       i_37_, i_36_, i_38_, i_39_);
	    method2381(i, i_33_, i_37_, i_36_);
	}
    }
    
    void method2364(Class525_Sub16_Sub17 class525_sub16_sub17, int i,
		    int i_44_) {
	Class525_Sub16_Sub17_Sub1 class525_sub16_sub17_sub1
	    = (Class525_Sub16_Sub17_Sub1) class525_sub16_sub17;
	i += class525_sub16_sub17_sub1.anInt12109 + 1;
	i_44_ += class525_sub16_sub17_sub1.anInt12111 + 1;
	int i_45_ = i + i_44_ * anInt1675;
	int i_46_ = 0;
	int i_47_ = class525_sub16_sub17_sub1.anInt12108;
	int i_48_ = class525_sub16_sub17_sub1.anInt12106;
	int i_49_ = anInt1675 - i_48_;
	int i_50_ = 0;
	if (i_44_ <= 0) {
	    int i_51_ = 1 - i_44_;
	    i_47_ -= i_51_;
	    i_46_ += i_51_ * i_48_;
	    i_45_ += i_51_ * anInt1675;
	    i_44_ = 1;
	}
	if (i_44_ + i_47_ >= anInt1676) {
	    int i_52_ = i_44_ + i_47_ + 1 - anInt1676;
	    i_47_ -= i_52_;
	}
	if (i <= 0) {
	    int i_53_ = 1 - i;
	    i_48_ -= i_53_;
	    i_46_ += i_53_;
	    i_45_ += i_53_;
	    i_50_ += i_53_;
	    i_49_ += i_53_;
	    i = 1;
	}
	if (i + i_48_ >= anInt1675) {
	    int i_54_ = i + i_48_ + 1 - anInt1675;
	    i_48_ -= i_54_;
	    i_50_ += i_54_;
	    i_49_ += i_54_;
	}
	if (i_48_ > 0 && i_47_ > 0) {
	    method2382(aByteArray1677,
		       class525_sub16_sub17_sub1.aByteArray12110, i_46_, i_45_,
		       i_48_, i_47_, i_49_, i_50_);
	    method2381(i, i_44_, i_48_, i_47_);
	}
    }
    
    void method2365(Class525_Sub16_Sub17 class525_sub16_sub17, int i,
		    int i_55_) {
	Class525_Sub16_Sub17_Sub1 class525_sub16_sub17_sub1
	    = (Class525_Sub16_Sub17_Sub1) class525_sub16_sub17;
	i += class525_sub16_sub17_sub1.anInt12109 + 1;
	i_55_ += class525_sub16_sub17_sub1.anInt12111 + 1;
	int i_56_ = i + i_55_ * anInt1675;
	int i_57_ = 0;
	int i_58_ = class525_sub16_sub17_sub1.anInt12108;
	int i_59_ = class525_sub16_sub17_sub1.anInt12106;
	int i_60_ = anInt1675 - i_59_;
	int i_61_ = 0;
	if (i_55_ <= 0) {
	    int i_62_ = 1 - i_55_;
	    i_58_ -= i_62_;
	    i_57_ += i_62_ * i_59_;
	    i_56_ += i_62_ * anInt1675;
	    i_55_ = 1;
	}
	if (i_55_ + i_58_ >= anInt1676) {
	    int i_63_ = i_55_ + i_58_ + 1 - anInt1676;
	    i_58_ -= i_63_;
	}
	if (i <= 0) {
	    int i_64_ = 1 - i;
	    i_59_ -= i_64_;
	    i_57_ += i_64_;
	    i_56_ += i_64_;
	    i_61_ += i_64_;
	    i_60_ += i_64_;
	    i = 1;
	}
	if (i + i_59_ >= anInt1675) {
	    int i_65_ = i + i_59_ + 1 - anInt1675;
	    i_59_ -= i_65_;
	    i_61_ += i_65_;
	    i_60_ += i_65_;
	}
	if (i_59_ > 0 && i_58_ > 0) {
	    method2367(aByteArray1677,
		       class525_sub16_sub17_sub1.aByteArray12110, i_57_, i_56_,
		       i_59_, i_58_, i_60_, i_61_);
	    method2381(i, i_55_, i_59_, i_58_);
	}
    }
    
    void method2366(int i, int i_66_, int i_67_, int i_68_) {
	if (aClass124ArrayArray1679 != null) {
	    int i_69_ = i - 1 >> 7;
	    int i_70_ = i - 1 + i_67_ - 1 >> 7;
	    int i_71_ = i_66_ - 1 >> 7;
	    int i_72_ = i_66_ - 1 + i_68_ - 1 >> 7;
	    for (int i_73_ = i_69_; i_73_ <= i_70_; i_73_++) {
		Class124[] class124s = aClass124ArrayArray1679[i_73_];
		for (int i_74_ = i_71_; i_74_ <= i_72_; i_74_++)
		    class124s[i_74_].aBool1463 = true;
	    }
	}
    }
    
    static final void method2367(byte[] is, byte[] is_75_, int i, int i_76_,
				 int i_77_, int i_78_, int i_79_, int i_80_) {
	int i_81_ = -(i_77_ >> 2);
	i_77_ = -(i_77_ & 0x3);
	for (int i_82_ = -i_78_; i_82_ < 0; i_82_++) {
	    for (int i_83_ = i_81_; i_83_ < 0; i_83_++) {
		is[i_76_++] -= is_75_[i++];
		is[i_76_++] -= is_75_[i++];
		is[i_76_++] -= is_75_[i++];
		is[i_76_++] -= is_75_[i++];
	    }
	    for (int i_84_ = i_77_; i_84_ < 0; i_84_++)
		is[i_76_++] -= is_75_[i++];
	    i_76_ += i_79_;
	    i += i_80_;
	}
    }
    
    static final boolean method2368(byte[] is, int i, int i_85_, int i_86_,
				    int i_87_, int i_88_) {
	int i_89_ = i_85_ % i_88_;
	int i_90_;
	if (i_89_ != 0)
	    i_90_ = i_88_ - i_89_;
	else
	    i_90_ = 0;
	int i_91_ = -((i_86_ + i_88_ - 1) / i_88_);
	int i_92_ = -((i_85_ + i_88_ - 1) / i_88_);
	for (int i_93_ = i_91_; i_93_ < 0; i_93_++) {
	    for (int i_94_ = i_92_; i_94_ < 0; i_94_++) {
		if (is[i] == 0)
		    return true;
		i += i_88_;
	    }
	    i -= i_90_;
	    if (is[i - 1] == 0)
		return true;
	    i += i_87_;
	}
	return false;
    }
    
    void method2369() {
	aClass124ArrayArray1679 = new Class124[anInt1680][anInt1673];
	for (int i = 0; i < anInt1673; i++) {
	    for (int i_95_ = 0; i_95_ < anInt1680; i_95_++)
		aClass124ArrayArray1679[i_95_][i]
		    = new Class124(aClass182_Sub3_1681, this,
				   aClass161_Sub1_1674, i_95_, i, anInt1678,
				   i_95_ * 128 + 1, i * 128 + 1);
	}
    }
    
    void method2370(int i, int i_96_, int i_97_, boolean[][] bools,
		    boolean bool) {
	aClass182_Sub3_1681.method15404(false);
	aClass182_Sub3_1681.method15512(false);
	aClass182_Sub3_1681.method15455(-2);
	aClass182_Sub3_1681.method15396(1);
	aClass182_Sub3_1681.method15409(1);
	float f = 1.0F / (float) (aClass182_Sub3_1681.anInt9685 * 128);
	if (bool) {
	    for (int i_98_ = 0; i_98_ < anInt1673; i_98_++) {
		int i_99_ = i_98_ << anInt1678;
		int i_100_ = i_98_ + 1 << anInt1678;
		for (int i_101_ = 0; i_101_ < anInt1680; i_101_++) {
		    int i_102_ = i_101_ << anInt1678;
		    int i_103_ = i_101_ + 1 << anInt1678;
		while_89_:
		    for (int i_104_ = i_102_; i_104_ < i_103_; i_104_++) {
			if (i_104_ - i >= -i_97_ && i_104_ - i <= i_97_) {
			    for (int i_105_ = i_99_; i_105_ < i_100_;
				 i_105_++) {
				if (i_105_ - i_96_ >= -i_97_
				    && i_105_ - i_96_ <= i_97_
				    && (bools[i_104_ - i + i_97_]
					[i_105_ - i_96_ + i_97_])) {
				    OpenGL.glMatrixMode(5890);
				    OpenGL.glLoadIdentity();
				    OpenGL.glScalef(f, f, 1.0F);
				    OpenGL.glTranslatef((float) -i_101_ / f,
							(float) -i_98_ / f,
							1.0F);
				    OpenGL.glMatrixMode(5888);
				    aClass124ArrayArray1679[i_101_][i_98_]
					.method2124();
				    break while_89_;
				}
			    }
			}
		    }
		}
	    }
	} else {
	    for (int i_106_ = 0; i_106_ < anInt1673; i_106_++) {
		int i_107_ = i_106_ << anInt1678;
		int i_108_ = i_106_ + 1 << anInt1678;
		for (int i_109_ = 0; i_109_ < anInt1680; i_109_++) {
		    int i_110_ = 0;
		    int i_111_ = i_109_ << anInt1678;
		    int i_112_ = i_109_ + 1 << anInt1678;
		    Class525_Sub38_Sub1 class525_sub38_sub1
			= aClass182_Sub3_1681.aClass525_Sub38_Sub1_9828;
		    class525_sub38_sub1.pos = 0;
		    for (int i_113_ = i_107_; i_113_ < i_108_; i_113_++) {
			if (i_113_ - i_96_ >= -i_97_
			    && i_113_ - i_96_ <= i_97_) {
			    int i_114_
				= (i_113_ * (aClass161_Sub1_1674.anInt1759
					     * 363736815)
				   + i_111_);
			    for (int i_115_ = i_111_; i_115_ < i_112_;
				 i_115_++) {
				if (i_115_ - i >= -i_97_ && i_115_ - i <= i_97_
				    && (bools[i_115_ - i + i_97_]
					[i_113_ - i_96_ + i_97_])) {
				    short[] is
					= (aClass161_Sub1_1674
					   .aShortArrayArray9335[i_114_]);
				    if (is != null) {
					if (aClass182_Sub3_1681.aBool9792) {
					    for (int i_116_ = 0;
						 i_116_ < is.length;
						 i_116_++) {
						class525_sub38_sub1.method16602
						    (is[i_116_] & 0xffff,
						     563749170);
						i_110_++;
					    }
					} else {
					    for (int i_117_ = 0;
						 i_117_ < is.length;
						 i_117_++) {
						class525_sub38_sub1.method16840
						    (is[i_117_] & 0xffff,
						     241387851);
						i_110_++;
					    }
					}
				    }
				}
				i_114_++;
			    }
			}
		    }
		    if (i_110_ > 0) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glScalef(f, f, 1.0F);
			OpenGL.glTranslatef((float) -i_109_ / f,
					    (float) -i_106_ / f, 1.0F);
			OpenGL.glMatrixMode(5888);
			aClass124ArrayArray1679[i_109_][i_106_].method2120
			    (class525_sub38_sub1.buffer, i_110_);
		    }
		}
	    }
	}
	OpenGL.glMatrixMode(5890);
	OpenGL.glLoadIdentity();
	OpenGL.glMatrixMode(5888);
    }
    
    void method2371(int i, int i_118_, int i_119_, boolean[][] bools,
		    boolean bool) {
	aClass182_Sub3_1681.method15404(false);
	aClass182_Sub3_1681.method15512(false);
	aClass182_Sub3_1681.method15455(-2);
	aClass182_Sub3_1681.method15396(1);
	aClass182_Sub3_1681.method15409(1);
	float f = 1.0F / (float) (aClass182_Sub3_1681.anInt9685 * 128);
	if (bool) {
	    for (int i_120_ = 0; i_120_ < anInt1673; i_120_++) {
		int i_121_ = i_120_ << anInt1678;
		int i_122_ = i_120_ + 1 << anInt1678;
		for (int i_123_ = 0; i_123_ < anInt1680; i_123_++) {
		    int i_124_ = i_123_ << anInt1678;
		    int i_125_ = i_123_ + 1 << anInt1678;
		while_90_:
		    for (int i_126_ = i_124_; i_126_ < i_125_; i_126_++) {
			if (i_126_ - i >= -i_119_ && i_126_ - i <= i_119_) {
			    for (int i_127_ = i_121_; i_127_ < i_122_;
				 i_127_++) {
				if (i_127_ - i_118_ >= -i_119_
				    && i_127_ - i_118_ <= i_119_
				    && (bools[i_126_ - i + i_119_]
					[i_127_ - i_118_ + i_119_])) {
				    OpenGL.glMatrixMode(5890);
				    OpenGL.glLoadIdentity();
				    OpenGL.glScalef(f, f, 1.0F);
				    OpenGL.glTranslatef((float) -i_123_ / f,
							(float) -i_120_ / f,
							1.0F);
				    OpenGL.glMatrixMode(5888);
				    aClass124ArrayArray1679[i_123_][i_120_]
					.method2124();
				    break while_90_;
				}
			    }
			}
		    }
		}
	    }
	} else {
	    for (int i_128_ = 0; i_128_ < anInt1673; i_128_++) {
		int i_129_ = i_128_ << anInt1678;
		int i_130_ = i_128_ + 1 << anInt1678;
		for (int i_131_ = 0; i_131_ < anInt1680; i_131_++) {
		    int i_132_ = 0;
		    int i_133_ = i_131_ << anInt1678;
		    int i_134_ = i_131_ + 1 << anInt1678;
		    Class525_Sub38_Sub1 class525_sub38_sub1
			= aClass182_Sub3_1681.aClass525_Sub38_Sub1_9828;
		    class525_sub38_sub1.pos = 0;
		    for (int i_135_ = i_129_; i_135_ < i_130_; i_135_++) {
			if (i_135_ - i_118_ >= -i_119_
			    && i_135_ - i_118_ <= i_119_) {
			    int i_136_
				= (i_135_ * (aClass161_Sub1_1674.anInt1759
					     * 363736815)
				   + i_133_);
			    for (int i_137_ = i_133_; i_137_ < i_134_;
				 i_137_++) {
				if (i_137_ - i >= -i_119_
				    && i_137_ - i <= i_119_
				    && (bools[i_137_ - i + i_119_]
					[i_135_ - i_118_ + i_119_])) {
				    short[] is
					= (aClass161_Sub1_1674
					   .aShortArrayArray9335[i_136_]);
				    if (is != null) {
					if (aClass182_Sub3_1681.aBool9792) {
					    for (int i_138_ = 0;
						 i_138_ < is.length;
						 i_138_++) {
						class525_sub38_sub1.method16602
						    (is[i_138_] & 0xffff,
						     927371341);
						i_132_++;
					    }
					} else {
					    for (int i_139_ = 0;
						 i_139_ < is.length;
						 i_139_++) {
						class525_sub38_sub1.method16840
						    (is[i_139_] & 0xffff,
						     241387851);
						i_132_++;
					    }
					}
				    }
				}
				i_136_++;
			    }
			}
		    }
		    if (i_132_ > 0) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glScalef(f, f, 1.0F);
			OpenGL.glTranslatef((float) -i_131_ / f,
					    (float) -i_128_ / f, 1.0F);
			OpenGL.glMatrixMode(5888);
			aClass124ArrayArray1679[i_131_][i_128_].method2120
			    (class525_sub38_sub1.buffer, i_132_);
		    }
		}
	    }
	}
	OpenGL.glMatrixMode(5890);
	OpenGL.glLoadIdentity();
	OpenGL.glMatrixMode(5888);
    }
    
    void method2372(int i, int i_140_, int i_141_, boolean[][] bools,
		    boolean bool) {
	aClass182_Sub3_1681.method15404(false);
	aClass182_Sub3_1681.method15512(false);
	aClass182_Sub3_1681.method15455(-2);
	aClass182_Sub3_1681.method15396(1);
	aClass182_Sub3_1681.method15409(1);
	float f = 1.0F / (float) (aClass182_Sub3_1681.anInt9685 * 128);
	if (bool) {
	    for (int i_142_ = 0; i_142_ < anInt1673; i_142_++) {
		int i_143_ = i_142_ << anInt1678;
		int i_144_ = i_142_ + 1 << anInt1678;
		for (int i_145_ = 0; i_145_ < anInt1680; i_145_++) {
		    int i_146_ = i_145_ << anInt1678;
		    int i_147_ = i_145_ + 1 << anInt1678;
		while_91_:
		    for (int i_148_ = i_146_; i_148_ < i_147_; i_148_++) {
			if (i_148_ - i >= -i_141_ && i_148_ - i <= i_141_) {
			    for (int i_149_ = i_143_; i_149_ < i_144_;
				 i_149_++) {
				if (i_149_ - i_140_ >= -i_141_
				    && i_149_ - i_140_ <= i_141_
				    && (bools[i_148_ - i + i_141_]
					[i_149_ - i_140_ + i_141_])) {
				    OpenGL.glMatrixMode(5890);
				    OpenGL.glLoadIdentity();
				    OpenGL.glScalef(f, f, 1.0F);
				    OpenGL.glTranslatef((float) -i_145_ / f,
							(float) -i_142_ / f,
							1.0F);
				    OpenGL.glMatrixMode(5888);
				    aClass124ArrayArray1679[i_145_][i_142_]
					.method2124();
				    break while_91_;
				}
			    }
			}
		    }
		}
	    }
	} else {
	    for (int i_150_ = 0; i_150_ < anInt1673; i_150_++) {
		int i_151_ = i_150_ << anInt1678;
		int i_152_ = i_150_ + 1 << anInt1678;
		for (int i_153_ = 0; i_153_ < anInt1680; i_153_++) {
		    int i_154_ = 0;
		    int i_155_ = i_153_ << anInt1678;
		    int i_156_ = i_153_ + 1 << anInt1678;
		    Class525_Sub38_Sub1 class525_sub38_sub1
			= aClass182_Sub3_1681.aClass525_Sub38_Sub1_9828;
		    class525_sub38_sub1.pos = 0;
		    for (int i_157_ = i_151_; i_157_ < i_152_; i_157_++) {
			if (i_157_ - i_140_ >= -i_141_
			    && i_157_ - i_140_ <= i_141_) {
			    int i_158_
				= (i_157_ * (aClass161_Sub1_1674.anInt1759
					     * 363736815)
				   + i_155_);
			    for (int i_159_ = i_155_; i_159_ < i_156_;
				 i_159_++) {
				if (i_159_ - i >= -i_141_
				    && i_159_ - i <= i_141_
				    && (bools[i_159_ - i + i_141_]
					[i_157_ - i_140_ + i_141_])) {
				    short[] is
					= (aClass161_Sub1_1674
					   .aShortArrayArray9335[i_158_]);
				    if (is != null) {
					if (aClass182_Sub3_1681.aBool9792) {
					    for (int i_160_ = 0;
						 i_160_ < is.length;
						 i_160_++) {
						class525_sub38_sub1.method16602
						    (is[i_160_] & 0xffff,
						     2094111425);
						i_154_++;
					    }
					} else {
					    for (int i_161_ = 0;
						 i_161_ < is.length;
						 i_161_++) {
						class525_sub38_sub1.method16840
						    (is[i_161_] & 0xffff,
						     241387851);
						i_154_++;
					    }
					}
				    }
				}
				i_158_++;
			    }
			}
		    }
		    if (i_154_ > 0) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glScalef(f, f, 1.0F);
			OpenGL.glTranslatef((float) -i_153_ / f,
					    (float) -i_150_ / f, 1.0F);
			OpenGL.glMatrixMode(5888);
			aClass124ArrayArray1679[i_153_][i_150_].method2120
			    (class525_sub38_sub1.buffer, i_154_);
		    }
		}
	    }
	}
	OpenGL.glMatrixMode(5890);
	OpenGL.glLoadIdentity();
	OpenGL.glMatrixMode(5888);
    }
    
    void method2373(Class525_Sub16_Sub17 class525_sub16_sub17, int i,
		    int i_162_) {
	Class525_Sub16_Sub17_Sub1 class525_sub16_sub17_sub1
	    = (Class525_Sub16_Sub17_Sub1) class525_sub16_sub17;
	i += class525_sub16_sub17_sub1.anInt12109 + 1;
	i_162_ += class525_sub16_sub17_sub1.anInt12111 + 1;
	int i_163_ = i + i_162_ * anInt1675;
	int i_164_ = 0;
	int i_165_ = class525_sub16_sub17_sub1.anInt12108;
	int i_166_ = class525_sub16_sub17_sub1.anInt12106;
	int i_167_ = anInt1675 - i_166_;
	int i_168_ = 0;
	if (i_162_ <= 0) {
	    int i_169_ = 1 - i_162_;
	    i_165_ -= i_169_;
	    i_164_ += i_169_ * i_166_;
	    i_163_ += i_169_ * anInt1675;
	    i_162_ = 1;
	}
	if (i_162_ + i_165_ >= anInt1676) {
	    int i_170_ = i_162_ + i_165_ + 1 - anInt1676;
	    i_165_ -= i_170_;
	}
	if (i <= 0) {
	    int i_171_ = 1 - i;
	    i_166_ -= i_171_;
	    i_164_ += i_171_;
	    i_163_ += i_171_;
	    i_168_ += i_171_;
	    i_167_ += i_171_;
	    i = 1;
	}
	if (i + i_166_ >= anInt1675) {
	    int i_172_ = i + i_166_ + 1 - anInt1675;
	    i_166_ -= i_172_;
	    i_168_ += i_172_;
	    i_167_ += i_172_;
	}
	if (i_166_ > 0 && i_165_ > 0) {
	    method2382(aByteArray1677,
		       class525_sub16_sub17_sub1.aByteArray12110, i_164_,
		       i_163_, i_166_, i_165_, i_167_, i_168_);
	    method2381(i, i_162_, i_166_, i_165_);
	}
    }
    
    boolean method2374(Class525_Sub16_Sub17 class525_sub16_sub17, int i,
		       int i_173_) {
	Class525_Sub16_Sub17_Sub1 class525_sub16_sub17_sub1
	    = (Class525_Sub16_Sub17_Sub1) class525_sub16_sub17;
	i += class525_sub16_sub17_sub1.anInt12109 + 1;
	i_173_ += class525_sub16_sub17_sub1.anInt12111 + 1;
	int i_174_ = i + i_173_ * anInt1675;
	int i_175_ = class525_sub16_sub17_sub1.anInt12108;
	int i_176_ = class525_sub16_sub17_sub1.anInt12106;
	int i_177_ = anInt1675 - i_176_;
	if (i_173_ <= 0) {
	    int i_178_ = 1 - i_173_;
	    i_175_ -= i_178_;
	    i_174_ += i_178_ * anInt1675;
	    i_173_ = 1;
	}
	if (i_173_ + i_175_ >= anInt1676) {
	    int i_179_ = i_173_ + i_175_ + 1 - anInt1676;
	    i_175_ -= i_179_;
	}
	if (i <= 0) {
	    int i_180_ = 1 - i;
	    i_176_ -= i_180_;
	    i_174_ += i_180_;
	    i_177_ += i_180_;
	    i = 1;
	}
	if (i + i_176_ >= anInt1675) {
	    int i_181_ = i + i_176_ + 1 - anInt1675;
	    i_176_ -= i_181_;
	    i_177_ += i_181_;
	}
	if (i_176_ <= 0 || i_175_ <= 0)
	    return false;
	int i_182_ = 8;
	i_177_ += (i_182_ - 1) * anInt1675;
	return method2368(aByteArray1677, i_174_, i_176_, i_175_, i_177_,
			  i_182_);
    }
    
    void method2375(Class525_Sub16_Sub17 class525_sub16_sub17, int i,
		    int i_183_) {
	Class525_Sub16_Sub17_Sub1 class525_sub16_sub17_sub1
	    = (Class525_Sub16_Sub17_Sub1) class525_sub16_sub17;
	i += class525_sub16_sub17_sub1.anInt12109 + 1;
	i_183_ += class525_sub16_sub17_sub1.anInt12111 + 1;
	int i_184_ = i + i_183_ * anInt1675;
	int i_185_ = 0;
	int i_186_ = class525_sub16_sub17_sub1.anInt12108;
	int i_187_ = class525_sub16_sub17_sub1.anInt12106;
	int i_188_ = anInt1675 - i_187_;
	int i_189_ = 0;
	if (i_183_ <= 0) {
	    int i_190_ = 1 - i_183_;
	    i_186_ -= i_190_;
	    i_185_ += i_190_ * i_187_;
	    i_184_ += i_190_ * anInt1675;
	    i_183_ = 1;
	}
	if (i_183_ + i_186_ >= anInt1676) {
	    int i_191_ = i_183_ + i_186_ + 1 - anInt1676;
	    i_186_ -= i_191_;
	}
	if (i <= 0) {
	    int i_192_ = 1 - i;
	    i_187_ -= i_192_;
	    i_185_ += i_192_;
	    i_184_ += i_192_;
	    i_189_ += i_192_;
	    i_188_ += i_192_;
	    i = 1;
	}
	if (i + i_187_ >= anInt1675) {
	    int i_193_ = i + i_187_ + 1 - anInt1675;
	    i_187_ -= i_193_;
	    i_189_ += i_193_;
	    i_188_ += i_193_;
	}
	if (i_187_ > 0 && i_186_ > 0) {
	    method2367(aByteArray1677,
		       class525_sub16_sub17_sub1.aByteArray12110, i_185_,
		       i_184_, i_187_, i_186_, i_188_, i_189_);
	    method2381(i, i_183_, i_187_, i_186_);
	}
    }
    
    void method2376(Class525_Sub16_Sub17 class525_sub16_sub17, int i,
		    int i_194_) {
	Class525_Sub16_Sub17_Sub1 class525_sub16_sub17_sub1
	    = (Class525_Sub16_Sub17_Sub1) class525_sub16_sub17;
	i += class525_sub16_sub17_sub1.anInt12109 + 1;
	i_194_ += class525_sub16_sub17_sub1.anInt12111 + 1;
	int i_195_ = i + i_194_ * anInt1675;
	int i_196_ = 0;
	int i_197_ = class525_sub16_sub17_sub1.anInt12108;
	int i_198_ = class525_sub16_sub17_sub1.anInt12106;
	int i_199_ = anInt1675 - i_198_;
	int i_200_ = 0;
	if (i_194_ <= 0) {
	    int i_201_ = 1 - i_194_;
	    i_197_ -= i_201_;
	    i_196_ += i_201_ * i_198_;
	    i_195_ += i_201_ * anInt1675;
	    i_194_ = 1;
	}
	if (i_194_ + i_197_ >= anInt1676) {
	    int i_202_ = i_194_ + i_197_ + 1 - anInt1676;
	    i_197_ -= i_202_;
	}
	if (i <= 0) {
	    int i_203_ = 1 - i;
	    i_198_ -= i_203_;
	    i_196_ += i_203_;
	    i_195_ += i_203_;
	    i_200_ += i_203_;
	    i_199_ += i_203_;
	    i = 1;
	}
	if (i + i_198_ >= anInt1675) {
	    int i_204_ = i + i_198_ + 1 - anInt1675;
	    i_198_ -= i_204_;
	    i_200_ += i_204_;
	    i_199_ += i_204_;
	}
	if (i_198_ > 0 && i_197_ > 0) {
	    method2367(aByteArray1677,
		       class525_sub16_sub17_sub1.aByteArray12110, i_196_,
		       i_195_, i_198_, i_197_, i_199_, i_200_);
	    method2381(i, i_194_, i_198_, i_197_);
	}
    }
    
    void method2377(Class525_Sub16_Sub17 class525_sub16_sub17, int i,
		    int i_205_) {
	Class525_Sub16_Sub17_Sub1 class525_sub16_sub17_sub1
	    = (Class525_Sub16_Sub17_Sub1) class525_sub16_sub17;
	i += class525_sub16_sub17_sub1.anInt12109 + 1;
	i_205_ += class525_sub16_sub17_sub1.anInt12111 + 1;
	int i_206_ = i + i_205_ * anInt1675;
	int i_207_ = 0;
	int i_208_ = class525_sub16_sub17_sub1.anInt12108;
	int i_209_ = class525_sub16_sub17_sub1.anInt12106;
	int i_210_ = anInt1675 - i_209_;
	int i_211_ = 0;
	if (i_205_ <= 0) {
	    int i_212_ = 1 - i_205_;
	    i_208_ -= i_212_;
	    i_207_ += i_212_ * i_209_;
	    i_206_ += i_212_ * anInt1675;
	    i_205_ = 1;
	}
	if (i_205_ + i_208_ >= anInt1676) {
	    int i_213_ = i_205_ + i_208_ + 1 - anInt1676;
	    i_208_ -= i_213_;
	}
	if (i <= 0) {
	    int i_214_ = 1 - i;
	    i_209_ -= i_214_;
	    i_207_ += i_214_;
	    i_206_ += i_214_;
	    i_211_ += i_214_;
	    i_210_ += i_214_;
	    i = 1;
	}
	if (i + i_209_ >= anInt1675) {
	    int i_215_ = i + i_209_ + 1 - anInt1675;
	    i_209_ -= i_215_;
	    i_211_ += i_215_;
	    i_210_ += i_215_;
	}
	if (i_209_ > 0 && i_208_ > 0) {
	    method2382(aByteArray1677,
		       class525_sub16_sub17_sub1.aByteArray12110, i_207_,
		       i_206_, i_209_, i_208_, i_210_, i_211_);
	    method2381(i, i_205_, i_209_, i_208_);
	}
    }
    
    boolean method2378(Class525_Sub16_Sub17 class525_sub16_sub17, int i,
		       int i_216_) {
	Class525_Sub16_Sub17_Sub1 class525_sub16_sub17_sub1
	    = (Class525_Sub16_Sub17_Sub1) class525_sub16_sub17;
	i += class525_sub16_sub17_sub1.anInt12109 + 1;
	i_216_ += class525_sub16_sub17_sub1.anInt12111 + 1;
	int i_217_ = i + i_216_ * anInt1675;
	int i_218_ = class525_sub16_sub17_sub1.anInt12108;
	int i_219_ = class525_sub16_sub17_sub1.anInt12106;
	int i_220_ = anInt1675 - i_219_;
	if (i_216_ <= 0) {
	    int i_221_ = 1 - i_216_;
	    i_218_ -= i_221_;
	    i_217_ += i_221_ * anInt1675;
	    i_216_ = 1;
	}
	if (i_216_ + i_218_ >= anInt1676) {
	    int i_222_ = i_216_ + i_218_ + 1 - anInt1676;
	    i_218_ -= i_222_;
	}
	if (i <= 0) {
	    int i_223_ = 1 - i;
	    i_219_ -= i_223_;
	    i_217_ += i_223_;
	    i_220_ += i_223_;
	    i = 1;
	}
	if (i + i_219_ >= anInt1675) {
	    int i_224_ = i + i_219_ + 1 - anInt1675;
	    i_219_ -= i_224_;
	    i_220_ += i_224_;
	}
	if (i_219_ <= 0 || i_218_ <= 0)
	    return false;
	int i_225_ = 8;
	i_220_ += (i_225_ - 1) * anInt1675;
	return method2368(aByteArray1677, i_217_, i_219_, i_218_, i_220_,
			  i_225_);
    }
    
    boolean method2379(Class525_Sub16_Sub17 class525_sub16_sub17, int i,
		       int i_226_) {
	Class525_Sub16_Sub17_Sub1 class525_sub16_sub17_sub1
	    = (Class525_Sub16_Sub17_Sub1) class525_sub16_sub17;
	i += class525_sub16_sub17_sub1.anInt12109 + 1;
	i_226_ += class525_sub16_sub17_sub1.anInt12111 + 1;
	int i_227_ = i + i_226_ * anInt1675;
	int i_228_ = class525_sub16_sub17_sub1.anInt12108;
	int i_229_ = class525_sub16_sub17_sub1.anInt12106;
	int i_230_ = anInt1675 - i_229_;
	if (i_226_ <= 0) {
	    int i_231_ = 1 - i_226_;
	    i_228_ -= i_231_;
	    i_227_ += i_231_ * anInt1675;
	    i_226_ = 1;
	}
	if (i_226_ + i_228_ >= anInt1676) {
	    int i_232_ = i_226_ + i_228_ + 1 - anInt1676;
	    i_228_ -= i_232_;
	}
	if (i <= 0) {
	    int i_233_ = 1 - i;
	    i_229_ -= i_233_;
	    i_227_ += i_233_;
	    i_230_ += i_233_;
	    i = 1;
	}
	if (i + i_229_ >= anInt1675) {
	    int i_234_ = i + i_229_ + 1 - anInt1675;
	    i_229_ -= i_234_;
	    i_230_ += i_234_;
	}
	if (i_229_ <= 0 || i_228_ <= 0)
	    return false;
	int i_235_ = 8;
	i_230_ += (i_235_ - 1) * anInt1675;
	return method2368(aByteArray1677, i_227_, i_229_, i_228_, i_230_,
			  i_235_);
    }
    
    boolean method2380(Class525_Sub16_Sub17 class525_sub16_sub17, int i,
		       int i_236_) {
	Class525_Sub16_Sub17_Sub1 class525_sub16_sub17_sub1
	    = (Class525_Sub16_Sub17_Sub1) class525_sub16_sub17;
	i += class525_sub16_sub17_sub1.anInt12109 + 1;
	i_236_ += class525_sub16_sub17_sub1.anInt12111 + 1;
	int i_237_ = i + i_236_ * anInt1675;
	int i_238_ = class525_sub16_sub17_sub1.anInt12108;
	int i_239_ = class525_sub16_sub17_sub1.anInt12106;
	int i_240_ = anInt1675 - i_239_;
	if (i_236_ <= 0) {
	    int i_241_ = 1 - i_236_;
	    i_238_ -= i_241_;
	    i_237_ += i_241_ * anInt1675;
	    i_236_ = 1;
	}
	if (i_236_ + i_238_ >= anInt1676) {
	    int i_242_ = i_236_ + i_238_ + 1 - anInt1676;
	    i_238_ -= i_242_;
	}
	if (i <= 0) {
	    int i_243_ = 1 - i;
	    i_239_ -= i_243_;
	    i_237_ += i_243_;
	    i_240_ += i_243_;
	    i = 1;
	}
	if (i + i_239_ >= anInt1675) {
	    int i_244_ = i + i_239_ + 1 - anInt1675;
	    i_239_ -= i_244_;
	    i_240_ += i_244_;
	}
	if (i_239_ <= 0 || i_238_ <= 0)
	    return false;
	int i_245_ = 8;
	i_240_ += (i_245_ - 1) * anInt1675;
	return method2368(aByteArray1677, i_237_, i_239_, i_238_, i_240_,
			  i_245_);
    }
    
    void method2381(int i, int i_246_, int i_247_, int i_248_) {
	if (aClass124ArrayArray1679 != null) {
	    int i_249_ = i - 1 >> 7;
	    int i_250_ = i - 1 + i_247_ - 1 >> 7;
	    int i_251_ = i_246_ - 1 >> 7;
	    int i_252_ = i_246_ - 1 + i_248_ - 1 >> 7;
	    for (int i_253_ = i_249_; i_253_ <= i_250_; i_253_++) {
		Class124[] class124s = aClass124ArrayArray1679[i_253_];
		for (int i_254_ = i_251_; i_254_ <= i_252_; i_254_++)
		    class124s[i_254_].aBool1463 = true;
	    }
	}
    }
    
    static final void method2382(byte[] is, byte[] is_255_, int i, int i_256_,
				 int i_257_, int i_258_, int i_259_,
				 int i_260_) {
	int i_261_ = -(i_257_ >> 2);
	i_257_ = -(i_257_ & 0x3);
	for (int i_262_ = -i_258_; i_262_ < 0; i_262_++) {
	    for (int i_263_ = i_261_; i_263_ < 0; i_263_++) {
		is[i_256_++] += is_255_[i++];
		is[i_256_++] += is_255_[i++];
		is[i_256_++] += is_255_[i++];
		is[i_256_++] += is_255_[i++];
	    }
	    for (int i_264_ = i_257_; i_264_ < 0; i_264_++)
		is[i_256_++] += is_255_[i++];
	    i_256_ += i_259_;
	    i += i_260_;
	}
    }
    
    static final void method2383(byte[] is, byte[] is_265_, int i, int i_266_,
				 int i_267_, int i_268_, int i_269_,
				 int i_270_) {
	int i_271_ = -(i_267_ >> 2);
	i_267_ = -(i_267_ & 0x3);
	for (int i_272_ = -i_268_; i_272_ < 0; i_272_++) {
	    for (int i_273_ = i_271_; i_273_ < 0; i_273_++) {
		is[i_266_++] += is_265_[i++];
		is[i_266_++] += is_265_[i++];
		is[i_266_++] += is_265_[i++];
		is[i_266_++] += is_265_[i++];
	    }
	    for (int i_274_ = i_267_; i_274_ < 0; i_274_++)
		is[i_266_++] += is_265_[i++];
	    i_266_ += i_269_;
	    i += i_270_;
	}
    }
    
    static final void method2384(byte[] is, byte[] is_275_, int i, int i_276_,
				 int i_277_, int i_278_, int i_279_,
				 int i_280_) {
	int i_281_ = -(i_277_ >> 2);
	i_277_ = -(i_277_ & 0x3);
	for (int i_282_ = -i_278_; i_282_ < 0; i_282_++) {
	    for (int i_283_ = i_281_; i_283_ < 0; i_283_++) {
		is[i_276_++] -= is_275_[i++];
		is[i_276_++] -= is_275_[i++];
		is[i_276_++] -= is_275_[i++];
		is[i_276_++] -= is_275_[i++];
	    }
	    for (int i_284_ = i_277_; i_284_ < 0; i_284_++)
		is[i_276_++] -= is_275_[i++];
	    i_276_ += i_279_;
	    i += i_280_;
	}
    }
    
    static final void method2385(byte[] is, byte[] is_285_, int i, int i_286_,
				 int i_287_, int i_288_, int i_289_,
				 int i_290_) {
	int i_291_ = -(i_287_ >> 2);
	i_287_ = -(i_287_ & 0x3);
	for (int i_292_ = -i_288_; i_292_ < 0; i_292_++) {
	    for (int i_293_ = i_291_; i_293_ < 0; i_293_++) {
		is[i_286_++] -= is_285_[i++];
		is[i_286_++] -= is_285_[i++];
		is[i_286_++] -= is_285_[i++];
		is[i_286_++] -= is_285_[i++];
	    }
	    for (int i_294_ = i_287_; i_294_ < 0; i_294_++)
		is[i_286_++] -= is_285_[i++];
	    i_286_ += i_289_;
	    i += i_290_;
	}
    }
    
    static final void method2386(byte[] is, byte[] is_295_, int i, int i_296_,
				 int i_297_, int i_298_, int i_299_,
				 int i_300_) {
	int i_301_ = -(i_297_ >> 2);
	i_297_ = -(i_297_ & 0x3);
	for (int i_302_ = -i_298_; i_302_ < 0; i_302_++) {
	    for (int i_303_ = i_301_; i_303_ < 0; i_303_++) {
		is[i_296_++] -= is_295_[i++];
		is[i_296_++] -= is_295_[i++];
		is[i_296_++] -= is_295_[i++];
		is[i_296_++] -= is_295_[i++];
	    }
	    for (int i_304_ = i_297_; i_304_ < 0; i_304_++)
		is[i_296_++] -= is_295_[i++];
	    i_296_ += i_299_;
	    i += i_300_;
	}
    }
}
