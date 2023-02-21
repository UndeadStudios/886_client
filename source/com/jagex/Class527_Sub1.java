/* Class527_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Random;

public class Class527_Sub1 extends Class527
{
    int[] anIntArray10821 = new int[512];
    static float[][] aFloatArrayArray10822
	= { { -0.333333F, -0.333333F, -0.333333F },
	    { 0.333333F, -0.333333F, -0.333333F },
	    { -0.333333F, 0.333333F, -0.333333F },
	    { 0.333333F, 0.333333F, -0.333333F },
	    { -0.333333F, -0.333333F, 0.333333F },
	    { 0.333333F, -0.333333F, 0.333333F },
	    { -0.333333F, 0.333333F, 0.333333F },
	    { 0.333333F, 0.333333F, 0.333333F } };
    
    static final float method16589(float f, float f_0_, float f_1_) {
	return f + (f_0_ - f) * f_1_;
    }
    
    void method8782(int i, int i_2_, int i_3_, int i_4_, float f, float f_5_,
		    float f_6_, float f_7_, float[] fs, int i_8_) {
	int i_9_ = (int) ((float) i_2_ * f - 1.0F);
	i_9_ &= 0xff;
	int i_10_ = (int) ((float) i_3_ * f_5_ - 1.0F);
	i_10_ &= 0xff;
	int i_11_ = (int) ((float) i_4_ * f_6_ - 1.0F);
	i_11_ &= 0xff;
	float f_12_ = (float) i * f_6_;
	int i_13_ = (int) f_12_;
	int i_14_ = i_13_ + 1;
	float f_15_ = f_12_ - (float) i_13_;
	float f_16_ = 1.0F - f_15_;
	float f_17_ = method16592(f_15_);
	i_13_ &= i_11_;
	i_14_ &= i_11_;
	int i_18_ = anIntArray10821[i_13_];
	int i_19_ = anIntArray10821[i_14_];
	for (int i_20_ = 0; i_20_ < i_3_; i_20_++) {
	    float f_21_ = (float) i_20_ * f_5_;
	    int i_22_ = (int) f_21_;
	    int i_23_ = i_22_ + 1;
	    float f_24_ = f_21_ - (float) i_22_;
	    float f_25_ = 1.0F - f_24_;
	    float f_26_ = method16592(f_24_);
	    i_22_ &= i_10_;
	    i_23_ &= i_10_;
	    int i_27_ = anIntArray10821[i_22_ + i_18_];
	    int i_28_ = anIntArray10821[i_23_ + i_18_];
	    int i_29_ = anIntArray10821[i_22_ + i_19_];
	    int i_30_ = anIntArray10821[i_23_ + i_19_];
	    for (int i_31_ = 0; i_31_ < i_2_; i_31_++) {
		float f_32_ = (float) i_31_ * f;
		int i_33_ = (int) f_32_;
		int i_34_ = i_33_ + 1;
		float f_35_ = f_32_ - (float) i_33_;
		float f_36_ = 1.0F - f_35_;
		float f_37_ = method16592(f_35_);
		i_33_ &= i_9_;
		i_34_ &= i_9_;
		fs[i_8_++]
		    = (f_7_
		       * (method16589
			  ((method16589
			    (method16589(method16590((anIntArray10821
						      [i_33_ + i_27_]) & 0x7,
						     f_36_, f_25_, f_16_),
					 method16590((anIntArray10821
						      [i_34_ + i_27_]) & 0x7,
						     f_35_, f_25_, f_16_),
					 f_37_),
			     method16589(method16590((anIntArray10821
						      [i_33_ + i_28_]) & 0x7,
						     f_36_, f_24_, f_16_),
					 method16590((anIntArray10821
						      [i_34_ + i_28_]) & 0x7,
						     f_35_, f_24_, f_16_),
					 f_37_),
			     f_26_)),
			   (method16589
			    (method16589(method16590((anIntArray10821
						      [i_33_ + i_29_]) & 0x7,
						     f_36_, f_25_, f_15_),
					 method16590((anIntArray10821
						      [i_34_ + i_29_]) & 0x7,
						     f_35_, f_25_, f_15_),
					 f_37_),
			     method16589(method16590((anIntArray10821
						      [i_33_ + i_30_]) & 0x7,
						     f_36_, f_24_, f_15_),
					 method16590((anIntArray10821
						      [i_34_ + i_30_]) & 0x7,
						     f_35_, f_24_, f_15_),
					 f_37_),
			     f_26_)),
			   f_17_)));
	    }
	}
    }
    
    static final float method16590(int i, float f, float f_38_, float f_39_) {
	float[] fs = aFloatArrayArray10822[i];
	return fs[0] * f + fs[1] * f_38_ + fs[2] * f_39_;
    }
    
    public Class527_Sub1(int i) {
	Random random = new Random((long) i);
	for (int i_40_ = 0; i_40_ < 256; i_40_++)
	    anIntArray10821[i_40_] = anIntArray10821[i_40_ + 256] = i_40_;
	for (int i_41_ = 0; i_41_ < 256; i_41_++) {
	    int i_42_ = random.nextInt() & 0xff;
	    int i_43_ = anIntArray10821[i_42_];
	    anIntArray10821[i_42_] = anIntArray10821[i_42_ + 256]
		= anIntArray10821[i_41_];
	    anIntArray10821[i_41_] = anIntArray10821[i_41_ + 256] = i_43_;
	}
    }
    
    void method8783(int i, int i_44_, int i_45_, int i_46_, float f,
		    float f_47_, float f_48_, float f_49_, float[] fs,
		    int i_50_) {
	int i_51_ = (int) ((float) i_44_ * f - 1.0F);
	i_51_ &= 0xff;
	int i_52_ = (int) ((float) i_45_ * f_47_ - 1.0F);
	i_52_ &= 0xff;
	int i_53_ = (int) ((float) i_46_ * f_48_ - 1.0F);
	i_53_ &= 0xff;
	float f_54_ = (float) i * f_48_;
	int i_55_ = (int) f_54_;
	int i_56_ = i_55_ + 1;
	float f_57_ = f_54_ - (float) i_55_;
	float f_58_ = 1.0F - f_57_;
	float f_59_ = method16592(f_57_);
	i_55_ &= i_53_;
	i_56_ &= i_53_;
	int i_60_ = anIntArray10821[i_55_];
	int i_61_ = anIntArray10821[i_56_];
	for (int i_62_ = 0; i_62_ < i_45_; i_62_++) {
	    float f_63_ = (float) i_62_ * f_47_;
	    int i_64_ = (int) f_63_;
	    int i_65_ = i_64_ + 1;
	    float f_66_ = f_63_ - (float) i_64_;
	    float f_67_ = 1.0F - f_66_;
	    float f_68_ = method16592(f_66_);
	    i_64_ &= i_52_;
	    i_65_ &= i_52_;
	    int i_69_ = anIntArray10821[i_64_ + i_60_];
	    int i_70_ = anIntArray10821[i_65_ + i_60_];
	    int i_71_ = anIntArray10821[i_64_ + i_61_];
	    int i_72_ = anIntArray10821[i_65_ + i_61_];
	    for (int i_73_ = 0; i_73_ < i_44_; i_73_++) {
		float f_74_ = (float) i_73_ * f;
		int i_75_ = (int) f_74_;
		int i_76_ = i_75_ + 1;
		float f_77_ = f_74_ - (float) i_75_;
		float f_78_ = 1.0F - f_77_;
		float f_79_ = method16592(f_77_);
		i_75_ &= i_51_;
		i_76_ &= i_51_;
		fs[i_50_++]
		    = (f_49_
		       * (method16589
			  ((method16589
			    (method16589(method16590((anIntArray10821
						      [i_75_ + i_69_]) & 0x7,
						     f_78_, f_67_, f_58_),
					 method16590((anIntArray10821
						      [i_76_ + i_69_]) & 0x7,
						     f_77_, f_67_, f_58_),
					 f_79_),
			     method16589(method16590((anIntArray10821
						      [i_75_ + i_70_]) & 0x7,
						     f_78_, f_66_, f_58_),
					 method16590((anIntArray10821
						      [i_76_ + i_70_]) & 0x7,
						     f_77_, f_66_, f_58_),
					 f_79_),
			     f_68_)),
			   (method16589
			    (method16589(method16590((anIntArray10821
						      [i_75_ + i_71_]) & 0x7,
						     f_78_, f_67_, f_57_),
					 method16590((anIntArray10821
						      [i_76_ + i_71_]) & 0x7,
						     f_77_, f_67_, f_57_),
					 f_79_),
			     method16589(method16590((anIntArray10821
						      [i_75_ + i_72_]) & 0x7,
						     f_78_, f_66_, f_57_),
					 method16590((anIntArray10821
						      [i_76_ + i_72_]) & 0x7,
						     f_77_, f_66_, f_57_),
					 f_79_),
			     f_68_)),
			   f_59_)));
	    }
	}
    }
    
    static final float method16591(float f) {
	return f * f * f * (10.0F + (f * 6.0F - 15.0F) * f);
    }
    
    static final float method16592(float f) {
	return f * f * f * (10.0F + (f * 6.0F - 15.0F) * f);
    }
    
    static final float method16593(float f) {
	return f * f * f * (10.0F + (f * 6.0F - 15.0F) * f);
    }
    
    static final float method16594(int i, float f, float f_80_, float f_81_) {
	float[] fs = aFloatArrayArray10822[i];
	return fs[0] * f + fs[1] * f_80_ + fs[2] * f_81_;
    }
    
    static final float method16595(float f) {
	return f * f * f * (10.0F + (f * 6.0F - 15.0F) * f);
    }
    
    static final float method16596(int i, float f, float f_82_, float f_83_) {
	float[] fs = aFloatArrayArray10822[i];
	return fs[0] * f + fs[1] * f_82_ + fs[2] * f_83_;
    }
    
    void method8785(int i, int i_84_, int i_85_, int i_86_, float f,
		    float f_87_, float f_88_, float f_89_, float[] fs,
		    int i_90_) {
	int i_91_ = (int) ((float) i_84_ * f - 1.0F);
	i_91_ &= 0xff;
	int i_92_ = (int) ((float) i_85_ * f_87_ - 1.0F);
	i_92_ &= 0xff;
	int i_93_ = (int) ((float) i_86_ * f_88_ - 1.0F);
	i_93_ &= 0xff;
	float f_94_ = (float) i * f_88_;
	int i_95_ = (int) f_94_;
	int i_96_ = i_95_ + 1;
	float f_97_ = f_94_ - (float) i_95_;
	float f_98_ = 1.0F - f_97_;
	float f_99_ = method16592(f_97_);
	i_95_ &= i_93_;
	i_96_ &= i_93_;
	int i_100_ = anIntArray10821[i_95_];
	int i_101_ = anIntArray10821[i_96_];
	for (int i_102_ = 0; i_102_ < i_85_; i_102_++) {
	    float f_103_ = (float) i_102_ * f_87_;
	    int i_104_ = (int) f_103_;
	    int i_105_ = i_104_ + 1;
	    float f_106_ = f_103_ - (float) i_104_;
	    float f_107_ = 1.0F - f_106_;
	    float f_108_ = method16592(f_106_);
	    i_104_ &= i_92_;
	    i_105_ &= i_92_;
	    int i_109_ = anIntArray10821[i_104_ + i_100_];
	    int i_110_ = anIntArray10821[i_105_ + i_100_];
	    int i_111_ = anIntArray10821[i_104_ + i_101_];
	    int i_112_ = anIntArray10821[i_105_ + i_101_];
	    for (int i_113_ = 0; i_113_ < i_84_; i_113_++) {
		float f_114_ = (float) i_113_ * f;
		int i_115_ = (int) f_114_;
		int i_116_ = i_115_ + 1;
		float f_117_ = f_114_ - (float) i_115_;
		float f_118_ = 1.0F - f_117_;
		float f_119_ = method16592(f_117_);
		i_115_ &= i_91_;
		i_116_ &= i_91_;
		fs[i_90_++]
		    = (f_89_
		       * (method16589
			  ((method16589
			    (method16589(method16590((anIntArray10821
						      [i_115_ + i_109_]) & 0x7,
						     f_118_, f_107_, f_98_),
					 method16590((anIntArray10821
						      [i_116_ + i_109_]) & 0x7,
						     f_117_, f_107_, f_98_),
					 f_119_),
			     method16589(method16590((anIntArray10821
						      [i_115_ + i_110_]) & 0x7,
						     f_118_, f_106_, f_98_),
					 method16590((anIntArray10821
						      [i_116_ + i_110_]) & 0x7,
						     f_117_, f_106_, f_98_),
					 f_119_),
			     f_108_)),
			   (method16589
			    (method16589(method16590((anIntArray10821
						      [i_115_ + i_111_]) & 0x7,
						     f_118_, f_107_, f_97_),
					 method16590((anIntArray10821
						      [i_116_ + i_111_]) & 0x7,
						     f_117_, f_107_, f_97_),
					 f_119_),
			     method16589(method16590((anIntArray10821
						      [i_115_ + i_112_]) & 0x7,
						     f_118_, f_106_, f_97_),
					 method16590((anIntArray10821
						      [i_116_ + i_112_]) & 0x7,
						     f_117_, f_106_, f_97_),
					 f_119_),
			     f_108_)),
			   f_99_)));
	    }
	}
    }
    
    static final float method16597(int i, float f, float f_120_,
				   float f_121_) {
	float[] fs = aFloatArrayArray10822[i];
	return fs[0] * f + fs[1] * f_120_ + fs[2] * f_121_;
    }
    
    void method8784(int i, int i_122_, int i_123_, int i_124_, float f,
		    float f_125_, float f_126_, float f_127_, float[] fs,
		    int i_128_) {
	int i_129_ = (int) ((float) i_122_ * f - 1.0F);
	i_129_ &= 0xff;
	int i_130_ = (int) ((float) i_123_ * f_125_ - 1.0F);
	i_130_ &= 0xff;
	int i_131_ = (int) ((float) i_124_ * f_126_ - 1.0F);
	i_131_ &= 0xff;
	float f_132_ = (float) i * f_126_;
	int i_133_ = (int) f_132_;
	int i_134_ = i_133_ + 1;
	float f_135_ = f_132_ - (float) i_133_;
	float f_136_ = 1.0F - f_135_;
	float f_137_ = method16592(f_135_);
	i_133_ &= i_131_;
	i_134_ &= i_131_;
	int i_138_ = anIntArray10821[i_133_];
	int i_139_ = anIntArray10821[i_134_];
	for (int i_140_ = 0; i_140_ < i_123_; i_140_++) {
	    float f_141_ = (float) i_140_ * f_125_;
	    int i_142_ = (int) f_141_;
	    int i_143_ = i_142_ + 1;
	    float f_144_ = f_141_ - (float) i_142_;
	    float f_145_ = 1.0F - f_144_;
	    float f_146_ = method16592(f_144_);
	    i_142_ &= i_130_;
	    i_143_ &= i_130_;
	    int i_147_ = anIntArray10821[i_142_ + i_138_];
	    int i_148_ = anIntArray10821[i_143_ + i_138_];
	    int i_149_ = anIntArray10821[i_142_ + i_139_];
	    int i_150_ = anIntArray10821[i_143_ + i_139_];
	    for (int i_151_ = 0; i_151_ < i_122_; i_151_++) {
		float f_152_ = (float) i_151_ * f;
		int i_153_ = (int) f_152_;
		int i_154_ = i_153_ + 1;
		float f_155_ = f_152_ - (float) i_153_;
		float f_156_ = 1.0F - f_155_;
		float f_157_ = method16592(f_155_);
		i_153_ &= i_129_;
		i_154_ &= i_129_;
		fs[i_128_++]
		    = (f_127_
		       * (method16589
			  ((method16589
			    (method16589(method16590((anIntArray10821
						      [i_153_ + i_147_]) & 0x7,
						     f_156_, f_145_, f_136_),
					 method16590((anIntArray10821
						      [i_154_ + i_147_]) & 0x7,
						     f_155_, f_145_, f_136_),
					 f_157_),
			     method16589(method16590((anIntArray10821
						      [i_153_ + i_148_]) & 0x7,
						     f_156_, f_144_, f_136_),
					 method16590((anIntArray10821
						      [i_154_ + i_148_]) & 0x7,
						     f_155_, f_144_, f_136_),
					 f_157_),
			     f_146_)),
			   (method16589
			    (method16589(method16590((anIntArray10821
						      [i_153_ + i_149_]) & 0x7,
						     f_156_, f_145_, f_135_),
					 method16590((anIntArray10821
						      [i_154_ + i_149_]) & 0x7,
						     f_155_, f_145_, f_135_),
					 f_157_),
			     method16589(method16590((anIntArray10821
						      [i_153_ + i_150_]) & 0x7,
						     f_156_, f_144_, f_135_),
					 method16590((anIntArray10821
						      [i_154_ + i_150_]) & 0x7,
						     f_155_, f_144_, f_135_),
					 f_157_),
			     f_146_)),
			   f_137_)));
	    }
	}
    }
}
