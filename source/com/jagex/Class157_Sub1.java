/* Class157_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class157_Sub1 extends Class157
{
    static int anInt8999;
    int anInt9000;
    int anInt9001;
    int anInt9002;
    int anInt9003;
    int anInt9004;
    int anInt9005;
    static int anInt9006;
    static int anInt9007 = 0;
    static final int anInt9008 = 8;
    static final int anInt9009 = 12;
    static int anInt9010;
    static int anInt9011;
    static int anInt9012;
    int[] anIntArray9013;
    static int anInt9014;
    static int anInt9015;
    static final int anInt9016 = 4;
    static int anInt9017;
    static int anInt9018;
    static int anInt9019;
    static int anInt9020;
    static int anInt9021;
    static int anInt9022;
    static int anInt9023;
    static int anInt9024;
    static int anInt9025;
    static int anInt9026;
    static int anInt9027;
    static int anInt9028 = 0;
    static int anInt9029;
    static int anInt9030;
    static int anInt9031 = 0;
    static int anInt9032;
    Class182_Sub2 aClass182_Sub2_9033;
    static int anInt9034;
    
    abstract void method2470(int i, int i_0_, int i_1_, int i_2_, int i_3_,
			     int i_4_, int i_5_, int i_6_);
    
    public void method2468(int i, int i_7_, int i_8_, int i_9_) {
	anInt9002 = i;
	anInt9003 = i_7_;
	anInt9004 = i_8_;
	anInt9005 = i_9_;
    }
    
    abstract void method14536(int i, int i_10_);
    
    void method2495(float f, float f_11_, float f_12_, float f_13_,
		    float f_14_, float f_15_, int i, Class152 class152,
		    int i_16_, int i_17_) {
	if (aClass182_Sub2_9033.method15226())
	    throw new IllegalStateException();
	if (method14538(f, f_11_, f_12_, f_13_, f_14_, f_15_)) {
	    Class152_Sub1 class152_sub1 = (Class152_Sub1) class152;
	    method14539(class152_sub1.anIntArray8998,
			class152_sub1.anIntArray8997, anInt9029 - i_16_,
			-i_17_ - (anInt9023 - anInt9012));
	}
    }
    
    public int method2471() {
	return anInt9001;
    }
    
    public int method12() {
	return anInt9002 + anInt9000 + anInt9004;
    }
    
    public int method2472() {
	return anInt9003 + anInt9001 + anInt9005;
    }
    
    public abstract void method2474(int i, int i_18_, int i_19_, int i_20_,
				    int[] is, int i_21_, int i_22_);
    
    public abstract void method2479(int i, int i_23_, int i_24_, int i_25_,
				    int i_26_);
    
    public abstract void method2480(int i, int i_27_, Class152 class152,
				    int i_28_, int i_29_);
    
    void method2524(float f, float f_30_, float f_31_, float f_32_,
		    float f_33_, float f_34_, int i, int i_35_, int i_36_,
		    int i_37_) {
	if (aClass182_Sub2_9033.method15226())
	    throw new IllegalStateException();
	if (method14538(f, f_30_, f_31_, f_32_, f_33_, f_34_)) {
	    anInt9026 = i_35_;
	    if (i != 1) {
		anInt9007 = i_35_ >>> 24;
		anInt9028 = 256 - anInt9007;
		if (i == 0) {
		    anInt9031 = (i_35_ & 0xff0000) >> 16;
		    anInt9030 = (i_35_ & 0xff00) >> 8;
		    anInt9027 = i_35_ & 0xff;
		} else if (i == 2) {
		    anInt9032 = i_35_ >>> 24;
		    anInt9019 = 256 - anInt9032;
		    int i_38_ = (i_35_ & 0xff00ff) * anInt9019 & ~0xff00ff;
		    int i_39_ = (i_35_ & 0xff00) * anInt9019 & 0xff0000;
		    anInt9034 = (i_38_ | i_39_) >>> 8;
		}
	    }
	    method14536(i, i_36_);
	}
    }
    
    abstract void method14537(boolean bool, boolean bool_40_, boolean bool_41_,
			      int i, int i_42_, float f, int i_43_, int i_44_,
			      int i_45_, int i_46_, int i_47_, int i_48_,
			      boolean bool_49_);
    
    void method2528(float f, float f_50_, float f_51_, float f_52_,
		    float f_53_, float f_54_, int i, Class152 class152,
		    int i_55_, int i_56_) {
	if (aClass182_Sub2_9033.method15226())
	    throw new IllegalStateException();
	if (method14538(f, f_50_, f_51_, f_52_, f_53_, f_54_)) {
	    Class152_Sub1 class152_sub1 = (Class152_Sub1) class152;
	    method14539(class152_sub1.anIntArray8998,
			class152_sub1.anIntArray8997, anInt9029 - i_55_,
			-i_56_ - (anInt9023 - anInt9012));
	}
    }
    
    boolean method14538(float f, float f_57_, float f_58_, float f_59_,
			float f_60_, float f_61_) {
	int i = anInt9002 + anInt9000 + anInt9004;
	int i_62_ = anInt9003 + anInt9001 + anInt9005;
	if (i != anInt9000 || i_62_ != anInt9001) {
	    float f_63_ = (f_58_ - f) / (float) i;
	    float f_64_ = (f_59_ - f_57_) / (float) i;
	    float f_65_ = (f_60_ - f) / (float) i_62_;
	    float f_66_ = (f_61_ - f_57_) / (float) i_62_;
	    float f_67_ = f_65_ * (float) anInt9003;
	    float f_68_ = f_66_ * (float) anInt9003;
	    float f_69_ = f_63_ * (float) anInt9002;
	    float f_70_ = f_64_ * (float) anInt9002;
	    float f_71_ = -f_63_ * (float) anInt9004;
	    float f_72_ = -f_64_ * (float) anInt9004;
	    float f_73_ = -f_65_ * (float) anInt9005;
	    float f_74_ = -f_66_ * (float) anInt9005;
	    f += f_69_ + f_67_;
	    f_57_ += f_70_ + f_68_;
	    f_58_ += f_71_ + f_67_;
	    f_59_ += f_72_ + f_68_;
	    f_60_ += f_69_ + f_73_;
	    f_61_ += f_70_ + f_74_;
	}
	float f_75_ = f_60_ + (f_58_ - f);
	float f_76_ = f_59_ + (f_61_ - f_57_);
	float f_77_;
	float f_78_;
	if (f < f_58_) {
	    f_77_ = f;
	    f_78_ = f_58_;
	} else {
	    f_77_ = f_58_;
	    f_78_ = f;
	}
	if (f_60_ < f_77_)
	    f_77_ = f_60_;
	if (f_75_ < f_77_)
	    f_77_ = f_75_;
	if (f_60_ > f_78_)
	    f_78_ = f_60_;
	if (f_75_ > f_78_)
	    f_78_ = f_75_;
	float f_79_;
	float f_80_;
	if (f_57_ < f_59_) {
	    f_79_ = f_57_;
	    f_80_ = f_59_;
	} else {
	    f_79_ = f_59_;
	    f_80_ = f_57_;
	}
	if (f_61_ < f_79_)
	    f_79_ = f_61_;
	if (f_76_ < f_79_)
	    f_79_ = f_76_;
	if (f_61_ > f_80_)
	    f_80_ = f_61_;
	if (f_76_ > f_80_)
	    f_80_ = f_76_;
	if (f_77_ < (float) (aClass182_Sub2_9033.anInt9470 * 1988019027))
	    f_77_ = (float) (aClass182_Sub2_9033.anInt9470 * 1988019027);
	if (f_78_ > (float) (aClass182_Sub2_9033.anInt9499 * -466178451))
	    f_78_ = (float) (aClass182_Sub2_9033.anInt9499 * -466178451);
	if (f_79_ < (float) (aClass182_Sub2_9033.anInt9472 * 1722112305))
	    f_79_ = (float) (aClass182_Sub2_9033.anInt9472 * 1722112305);
	if (f_80_ > (float) (aClass182_Sub2_9033.anInt9473 * 1920901985))
	    f_80_ = (float) (aClass182_Sub2_9033.anInt9473 * 1920901985);
	f_78_ = f_77_ - f_78_;
	if (f_78_ >= 0.0F)
	    return false;
	f_80_ = f_79_ - f_80_;
	if (f_80_ >= 0.0F)
	    return false;
	anInt9014 = aClass182_Sub2_9033.anInt9494 * -476035351;
	anInt9015 = (int) ((float) ((int) f_79_ * anInt9014) + f_77_);
	float f_81_
	    = (f_58_ - f) * (f_61_ - f_57_) - (f_59_ - f_57_) * (f_60_ - f);
	float f_82_
	    = (f_60_ - f) * (f_59_ - f_57_) - (f_61_ - f_57_) * (f_58_ - f);
	anInt9006
	    = (int) ((f_61_ - f_57_) * 4096.0F * (float) anInt9000 / f_81_);
	anInt9017
	    = (int) ((f_59_ - f_57_) * 4096.0F * (float) anInt9001 / f_82_);
	anInt9018 = (int) ((f_60_ - f) * 4096.0F * (float) anInt9000 / f_82_);
	anInt9010 = (int) ((f_58_ - f) * 4096.0F * (float) anInt9001 / f_81_);
	anInt9020 = (int) (f_77_ * 16.0F + 8.0F
			   - (f + f_58_ + f_60_ + f_75_) / 4.0F * 16.0F);
	anInt9021 = (int) (f_79_ * 16.0F + 8.0F
			   - (f_57_ + f_59_ + f_61_ + f_76_) / 4.0F * 16.0F);
	anInt9022 = (anInt9000 >> 1 << 12) + (anInt9021 * anInt9018 >> 4);
	anInt8999 = (anInt9001 >> 1 << 12) + (anInt9021 * anInt9010 >> 4);
	anInt9024 = anInt9020 * anInt9006 >> 4;
	anInt9025 = anInt9020 * anInt9017 >> 4;
	anInt9029 = (int) f_77_;
	anInt9011 = (int) f_78_;
	anInt9012 = (int) f_79_;
	anInt9023 = (int) f_80_;
	return true;
    }
    
    void method2493(float f, float f_83_, float f_84_, float f_85_,
		    float f_86_, float f_87_, int i, int i_88_, int i_89_,
		    int i_90_) {
	if (aClass182_Sub2_9033.method15226())
	    throw new IllegalStateException();
	if (method14538(f, f_83_, f_84_, f_85_, f_86_, f_87_)) {
	    anInt9026 = i_88_;
	    if (i != 1) {
		anInt9007 = i_88_ >>> 24;
		anInt9028 = 256 - anInt9007;
		if (i == 0) {
		    anInt9031 = (i_88_ & 0xff0000) >> 16;
		    anInt9030 = (i_88_ & 0xff00) >> 8;
		    anInt9027 = i_88_ & 0xff;
		} else if (i == 2) {
		    anInt9032 = i_88_ >>> 24;
		    anInt9019 = 256 - anInt9032;
		    int i_91_ = (i_88_ & 0xff00ff) * anInt9019 & ~0xff00ff;
		    int i_92_ = (i_88_ & 0xff00) * anInt9019 & 0xff0000;
		    anInt9034 = (i_91_ | i_92_) >>> 8;
		}
	    }
	    method14536(i, i_89_);
	}
    }
    
    public void method2469(int[] is) {
	is[0] = anInt9002;
	is[1] = anInt9003;
	is[2] = anInt9004;
	is[3] = anInt9005;
    }
    
    public void method2541(int[] is) {
	is[0] = anInt9002;
	is[1] = anInt9003;
	is[2] = anInt9004;
	is[3] = anInt9005;
    }
    
    abstract void method14539(int[] is, int[] is_93_, int i, int i_94_);
    
    static {
	anInt9030 = 0;
	anInt9027 = 0;
	anInt9032 = 0;
	anInt9019 = 0;
	anInt9034 = 0;
    }
    
    public void method2517(int i, int i_95_, int i_96_, int i_97_) {
	anInt9002 = i;
	anInt9003 = i_95_;
	anInt9004 = i_96_;
	anInt9005 = i_97_;
    }
    
    public abstract void method2467(int i, int i_98_, int i_99_, int i_100_,
				    int i_101_);
    
    abstract void method2483(int i, int i_102_, int i_103_, int i_104_,
			     int i_105_, int i_106_, int i_107_, int i_108_);
    
    public abstract void method2505(int i, int i_109_, int i_110_, int i_111_,
				    int i_112_);
    
    public int method2531() {
	return anInt9003 + anInt9001 + anInt9005;
    }
    
    abstract void method2508(int i, int i_113_, int i_114_, int i_115_,
			     int i_116_, int i_117_, int i_118_, int i_119_);
    
    abstract void method2509(int i, int i_120_, int i_121_, int i_122_,
			     int i_123_, int i_124_, int i_125_, int i_126_);
    
    abstract void method14540(boolean bool, boolean bool_127_,
			      boolean bool_128_, int i, int i_129_, float f,
			      int i_130_, int i_131_, int i_132_, int i_133_,
			      int i_134_, int i_135_, boolean bool_136_);
    
    abstract void method14541(boolean bool, boolean bool_137_,
			      boolean bool_138_, int i, int i_139_, float f,
			      int i_140_, int i_141_, int i_142_, int i_143_,
			      int i_144_, int i_145_, boolean bool_146_);
    
    abstract void method14542(int[] is, int[] is_147_, int i, int i_148_);
    
    public void method2485(int i, int i_149_, int i_150_, int i_151_,
			   int i_152_, int i_153_, int i_154_) {
	if (aClass182_Sub2_9033.method15226())
	    throw new IllegalStateException();
	if (anIntArray9013 == null)
	    anIntArray9013 = new int[4];
	aClass182_Sub2_9033.method3187(anIntArray9013);
	aClass182_Sub2_9033.method3185((aClass182_Sub2_9033.anInt9470
					* 1988019027),
				       (aClass182_Sub2_9033.anInt9472
					* 1722112305),
				       i + i_150_, i_149_ + i_151_);
	int i_155_ = method12();
	int i_156_ = method2472();
	int i_157_ = (i_150_ + i_155_ - 1) / i_155_;
	int i_158_ = (i_151_ + i_156_ - 1) / i_156_;
	for (int i_159_ = 0; i_159_ < i_158_; i_159_++) {
	    int i_160_ = i_159_ * i_156_;
	    for (int i_161_ = 0; i_161_ < i_157_; i_161_++)
		method2479(i + i_161_ * i_155_, i_149_ + i_160_, i_152_,
			   i_153_, i_154_);
	}
	aClass182_Sub2_9033.method3184(anIntArray9013[0], anIntArray9013[1],
				       anIntArray9013[2], anIntArray9013[3]);
    }
    
    public abstract void method2549(int i, int i_162_, Class152 class152,
				    int i_163_, int i_164_);
    
    public int method2503() {
	return anInt9000;
    }
    
    public void method2516(int i, int i_165_, int i_166_, int i_167_) {
	anInt9002 = i;
	anInt9003 = i_165_;
	anInt9004 = i_166_;
	anInt9005 = i_167_;
    }
    
    public void method2515(int i, int i_168_, int i_169_, int i_170_) {
	anInt9002 = i;
	anInt9003 = i_168_;
	anInt9004 = i_169_;
	anInt9005 = i_170_;
    }
    
    Class157_Sub1(Class182_Sub2 class182_sub2, int i, int i_171_) {
	aClass182_Sub2_9033 = class182_sub2;
	anInt9000 = i;
	anInt9001 = i_171_;
    }
    
    public abstract void method2513(int i, int i_172_, Class152 class152,
				    int i_173_, int i_174_);
    
    public int method2520() {
	return anInt9000;
    }
    
    public int method11() {
	return anInt9002 + anInt9000 + anInt9004;
    }
    
    public void method2544(int i, int i_175_, int i_176_, int i_177_,
			   int i_178_, int i_179_, int i_180_) {
	if (aClass182_Sub2_9033.method15226())
	    throw new IllegalStateException();
	if (anIntArray9013 == null)
	    anIntArray9013 = new int[4];
	aClass182_Sub2_9033.method3187(anIntArray9013);
	aClass182_Sub2_9033.method3185((aClass182_Sub2_9033.anInt9470
					* 1988019027),
				       (aClass182_Sub2_9033.anInt9472
					* 1722112305),
				       i + i_176_, i_175_ + i_177_);
	int i_181_ = method12();
	int i_182_ = method2472();
	int i_183_ = (i_176_ + i_181_ - 1) / i_181_;
	int i_184_ = (i_177_ + i_182_ - 1) / i_182_;
	for (int i_185_ = 0; i_185_ < i_184_; i_185_++) {
	    int i_186_ = i_185_ * i_182_;
	    for (int i_187_ = 0; i_187_ < i_183_; i_187_++)
		method2479(i + i_187_ * i_181_, i_175_ + i_186_, i_178_,
			   i_179_, i_180_);
	}
	aClass182_Sub2_9033.method3184(anIntArray9013[0], anIntArray9013[1],
				       anIntArray9013[2], anIntArray9013[3]);
    }
    
    void method2550(float f, float f_188_, float f_189_, float f_190_,
		    float f_191_, float f_192_, int i, int i_193_, int i_194_,
		    int i_195_) {
	if (aClass182_Sub2_9033.method15226())
	    throw new IllegalStateException();
	if (method14538(f, f_188_, f_189_, f_190_, f_191_, f_192_)) {
	    anInt9026 = i_193_;
	    if (i != 1) {
		anInt9007 = i_193_ >>> 24;
		anInt9028 = 256 - anInt9007;
		if (i == 0) {
		    anInt9031 = (i_193_ & 0xff0000) >> 16;
		    anInt9030 = (i_193_ & 0xff00) >> 8;
		    anInt9027 = i_193_ & 0xff;
		} else if (i == 2) {
		    anInt9032 = i_193_ >>> 24;
		    anInt9019 = 256 - anInt9032;
		    int i_196_ = (i_193_ & 0xff00ff) * anInt9019 & ~0xff00ff;
		    int i_197_ = (i_193_ & 0xff00) * anInt9019 & 0xff0000;
		    anInt9034 = (i_196_ | i_197_) >>> 8;
		}
	    }
	    method14536(i, i_194_);
	}
    }
    
    boolean method14543(float f, float f_198_, float f_199_, float f_200_,
			float f_201_, float f_202_) {
	int i = anInt9002 + anInt9000 + anInt9004;
	int i_203_ = anInt9003 + anInt9001 + anInt9005;
	if (i != anInt9000 || i_203_ != anInt9001) {
	    float f_204_ = (f_199_ - f) / (float) i;
	    float f_205_ = (f_200_ - f_198_) / (float) i;
	    float f_206_ = (f_201_ - f) / (float) i_203_;
	    float f_207_ = (f_202_ - f_198_) / (float) i_203_;
	    float f_208_ = f_206_ * (float) anInt9003;
	    float f_209_ = f_207_ * (float) anInt9003;
	    float f_210_ = f_204_ * (float) anInt9002;
	    float f_211_ = f_205_ * (float) anInt9002;
	    float f_212_ = -f_204_ * (float) anInt9004;
	    float f_213_ = -f_205_ * (float) anInt9004;
	    float f_214_ = -f_206_ * (float) anInt9005;
	    float f_215_ = -f_207_ * (float) anInt9005;
	    f += f_210_ + f_208_;
	    f_198_ += f_211_ + f_209_;
	    f_199_ += f_212_ + f_208_;
	    f_200_ += f_213_ + f_209_;
	    f_201_ += f_210_ + f_214_;
	    f_202_ += f_211_ + f_215_;
	}
	float f_216_ = f_201_ + (f_199_ - f);
	float f_217_ = f_200_ + (f_202_ - f_198_);
	float f_218_;
	float f_219_;
	if (f < f_199_) {
	    f_218_ = f;
	    f_219_ = f_199_;
	} else {
	    f_218_ = f_199_;
	    f_219_ = f;
	}
	if (f_201_ < f_218_)
	    f_218_ = f_201_;
	if (f_216_ < f_218_)
	    f_218_ = f_216_;
	if (f_201_ > f_219_)
	    f_219_ = f_201_;
	if (f_216_ > f_219_)
	    f_219_ = f_216_;
	float f_220_;
	float f_221_;
	if (f_198_ < f_200_) {
	    f_220_ = f_198_;
	    f_221_ = f_200_;
	} else {
	    f_220_ = f_200_;
	    f_221_ = f_198_;
	}
	if (f_202_ < f_220_)
	    f_220_ = f_202_;
	if (f_217_ < f_220_)
	    f_220_ = f_217_;
	if (f_202_ > f_221_)
	    f_221_ = f_202_;
	if (f_217_ > f_221_)
	    f_221_ = f_217_;
	if (f_218_ < (float) (aClass182_Sub2_9033.anInt9470 * 1988019027))
	    f_218_ = (float) (aClass182_Sub2_9033.anInt9470 * 1988019027);
	if (f_219_ > (float) (aClass182_Sub2_9033.anInt9499 * -466178451))
	    f_219_ = (float) (aClass182_Sub2_9033.anInt9499 * -466178451);
	if (f_220_ < (float) (aClass182_Sub2_9033.anInt9472 * 1722112305))
	    f_220_ = (float) (aClass182_Sub2_9033.anInt9472 * 1722112305);
	if (f_221_ > (float) (aClass182_Sub2_9033.anInt9473 * 1920901985))
	    f_221_ = (float) (aClass182_Sub2_9033.anInt9473 * 1920901985);
	f_219_ = f_218_ - f_219_;
	if (f_219_ >= 0.0F)
	    return false;
	f_221_ = f_220_ - f_221_;
	if (f_221_ >= 0.0F)
	    return false;
	anInt9014 = aClass182_Sub2_9033.anInt9494 * -476035351;
	anInt9015 = (int) ((float) ((int) f_220_ * anInt9014) + f_218_);
	float f_222_ = ((f_199_ - f) * (f_202_ - f_198_)
			- (f_200_ - f_198_) * (f_201_ - f));
	float f_223_ = ((f_201_ - f) * (f_200_ - f_198_)
			- (f_202_ - f_198_) * (f_199_ - f));
	anInt9006
	    = (int) ((f_202_ - f_198_) * 4096.0F * (float) anInt9000 / f_222_);
	anInt9017
	    = (int) ((f_200_ - f_198_) * 4096.0F * (float) anInt9001 / f_223_);
	anInt9018
	    = (int) ((f_201_ - f) * 4096.0F * (float) anInt9000 / f_223_);
	anInt9010
	    = (int) ((f_199_ - f) * 4096.0F * (float) anInt9001 / f_222_);
	anInt9020 = (int) (f_218_ * 16.0F + 8.0F
			   - (f + f_199_ + f_201_ + f_216_) / 4.0F * 16.0F);
	anInt9021
	    = (int) (f_220_ * 16.0F + 8.0F
		     - (f_198_ + f_200_ + f_202_ + f_217_) / 4.0F * 16.0F);
	anInt9022 = (anInt9000 >> 1 << 12) + (anInt9021 * anInt9018 >> 4);
	anInt8999 = (anInt9001 >> 1 << 12) + (anInt9021 * anInt9010 >> 4);
	anInt9024 = anInt9020 * anInt9006 >> 4;
	anInt9025 = anInt9020 * anInt9017 >> 4;
	anInt9029 = (int) f_218_;
	anInt9011 = (int) f_219_;
	anInt9012 = (int) f_220_;
	anInt9023 = (int) f_221_;
	return true;
    }
    
    boolean method14544(float f, float f_224_, float f_225_, float f_226_,
			float f_227_, float f_228_) {
	int i = anInt9002 + anInt9000 + anInt9004;
	int i_229_ = anInt9003 + anInt9001 + anInt9005;
	if (i != anInt9000 || i_229_ != anInt9001) {
	    float f_230_ = (f_225_ - f) / (float) i;
	    float f_231_ = (f_226_ - f_224_) / (float) i;
	    float f_232_ = (f_227_ - f) / (float) i_229_;
	    float f_233_ = (f_228_ - f_224_) / (float) i_229_;
	    float f_234_ = f_232_ * (float) anInt9003;
	    float f_235_ = f_233_ * (float) anInt9003;
	    float f_236_ = f_230_ * (float) anInt9002;
	    float f_237_ = f_231_ * (float) anInt9002;
	    float f_238_ = -f_230_ * (float) anInt9004;
	    float f_239_ = -f_231_ * (float) anInt9004;
	    float f_240_ = -f_232_ * (float) anInt9005;
	    float f_241_ = -f_233_ * (float) anInt9005;
	    f += f_236_ + f_234_;
	    f_224_ += f_237_ + f_235_;
	    f_225_ += f_238_ + f_234_;
	    f_226_ += f_239_ + f_235_;
	    f_227_ += f_236_ + f_240_;
	    f_228_ += f_237_ + f_241_;
	}
	float f_242_ = f_227_ + (f_225_ - f);
	float f_243_ = f_226_ + (f_228_ - f_224_);
	float f_244_;
	float f_245_;
	if (f < f_225_) {
	    f_244_ = f;
	    f_245_ = f_225_;
	} else {
	    f_244_ = f_225_;
	    f_245_ = f;
	}
	if (f_227_ < f_244_)
	    f_244_ = f_227_;
	if (f_242_ < f_244_)
	    f_244_ = f_242_;
	if (f_227_ > f_245_)
	    f_245_ = f_227_;
	if (f_242_ > f_245_)
	    f_245_ = f_242_;
	float f_246_;
	float f_247_;
	if (f_224_ < f_226_) {
	    f_246_ = f_224_;
	    f_247_ = f_226_;
	} else {
	    f_246_ = f_226_;
	    f_247_ = f_224_;
	}
	if (f_228_ < f_246_)
	    f_246_ = f_228_;
	if (f_243_ < f_246_)
	    f_246_ = f_243_;
	if (f_228_ > f_247_)
	    f_247_ = f_228_;
	if (f_243_ > f_247_)
	    f_247_ = f_243_;
	if (f_244_ < (float) (aClass182_Sub2_9033.anInt9470 * 1988019027))
	    f_244_ = (float) (aClass182_Sub2_9033.anInt9470 * 1988019027);
	if (f_245_ > (float) (aClass182_Sub2_9033.anInt9499 * -466178451))
	    f_245_ = (float) (aClass182_Sub2_9033.anInt9499 * -466178451);
	if (f_246_ < (float) (aClass182_Sub2_9033.anInt9472 * 1722112305))
	    f_246_ = (float) (aClass182_Sub2_9033.anInt9472 * 1722112305);
	if (f_247_ > (float) (aClass182_Sub2_9033.anInt9473 * 1920901985))
	    f_247_ = (float) (aClass182_Sub2_9033.anInt9473 * 1920901985);
	f_245_ = f_244_ - f_245_;
	if (f_245_ >= 0.0F)
	    return false;
	f_247_ = f_246_ - f_247_;
	if (f_247_ >= 0.0F)
	    return false;
	anInt9014 = aClass182_Sub2_9033.anInt9494 * -476035351;
	anInt9015 = (int) ((float) ((int) f_246_ * anInt9014) + f_244_);
	float f_248_ = ((f_225_ - f) * (f_228_ - f_224_)
			- (f_226_ - f_224_) * (f_227_ - f));
	float f_249_ = ((f_227_ - f) * (f_226_ - f_224_)
			- (f_228_ - f_224_) * (f_225_ - f));
	anInt9006
	    = (int) ((f_228_ - f_224_) * 4096.0F * (float) anInt9000 / f_248_);
	anInt9017
	    = (int) ((f_226_ - f_224_) * 4096.0F * (float) anInt9001 / f_249_);
	anInt9018
	    = (int) ((f_227_ - f) * 4096.0F * (float) anInt9000 / f_249_);
	anInt9010
	    = (int) ((f_225_ - f) * 4096.0F * (float) anInt9001 / f_248_);
	anInt9020 = (int) (f_244_ * 16.0F + 8.0F
			   - (f + f_225_ + f_227_ + f_242_) / 4.0F * 16.0F);
	anInt9021
	    = (int) (f_246_ * 16.0F + 8.0F
		     - (f_224_ + f_226_ + f_228_ + f_243_) / 4.0F * 16.0F);
	anInt9022 = (anInt9000 >> 1 << 12) + (anInt9021 * anInt9018 >> 4);
	anInt8999 = (anInt9001 >> 1 << 12) + (anInt9021 * anInt9010 >> 4);
	anInt9024 = anInt9020 * anInt9006 >> 4;
	anInt9025 = anInt9020 * anInt9017 >> 4;
	anInt9029 = (int) f_244_;
	anInt9011 = (int) f_245_;
	anInt9012 = (int) f_246_;
	anInt9023 = (int) f_247_;
	return true;
    }
    
    boolean method14545(float f, float f_250_, float f_251_, float f_252_,
			float f_253_, float f_254_) {
	int i = anInt9002 + anInt9000 + anInt9004;
	int i_255_ = anInt9003 + anInt9001 + anInt9005;
	if (i != anInt9000 || i_255_ != anInt9001) {
	    float f_256_ = (f_251_ - f) / (float) i;
	    float f_257_ = (f_252_ - f_250_) / (float) i;
	    float f_258_ = (f_253_ - f) / (float) i_255_;
	    float f_259_ = (f_254_ - f_250_) / (float) i_255_;
	    float f_260_ = f_258_ * (float) anInt9003;
	    float f_261_ = f_259_ * (float) anInt9003;
	    float f_262_ = f_256_ * (float) anInt9002;
	    float f_263_ = f_257_ * (float) anInt9002;
	    float f_264_ = -f_256_ * (float) anInt9004;
	    float f_265_ = -f_257_ * (float) anInt9004;
	    float f_266_ = -f_258_ * (float) anInt9005;
	    float f_267_ = -f_259_ * (float) anInt9005;
	    f += f_262_ + f_260_;
	    f_250_ += f_263_ + f_261_;
	    f_251_ += f_264_ + f_260_;
	    f_252_ += f_265_ + f_261_;
	    f_253_ += f_262_ + f_266_;
	    f_254_ += f_263_ + f_267_;
	}
	float f_268_ = f_253_ + (f_251_ - f);
	float f_269_ = f_252_ + (f_254_ - f_250_);
	float f_270_;
	float f_271_;
	if (f < f_251_) {
	    f_270_ = f;
	    f_271_ = f_251_;
	} else {
	    f_270_ = f_251_;
	    f_271_ = f;
	}
	if (f_253_ < f_270_)
	    f_270_ = f_253_;
	if (f_268_ < f_270_)
	    f_270_ = f_268_;
	if (f_253_ > f_271_)
	    f_271_ = f_253_;
	if (f_268_ > f_271_)
	    f_271_ = f_268_;
	float f_272_;
	float f_273_;
	if (f_250_ < f_252_) {
	    f_272_ = f_250_;
	    f_273_ = f_252_;
	} else {
	    f_272_ = f_252_;
	    f_273_ = f_250_;
	}
	if (f_254_ < f_272_)
	    f_272_ = f_254_;
	if (f_269_ < f_272_)
	    f_272_ = f_269_;
	if (f_254_ > f_273_)
	    f_273_ = f_254_;
	if (f_269_ > f_273_)
	    f_273_ = f_269_;
	if (f_270_ < (float) (aClass182_Sub2_9033.anInt9470 * 1988019027))
	    f_270_ = (float) (aClass182_Sub2_9033.anInt9470 * 1988019027);
	if (f_271_ > (float) (aClass182_Sub2_9033.anInt9499 * -466178451))
	    f_271_ = (float) (aClass182_Sub2_9033.anInt9499 * -466178451);
	if (f_272_ < (float) (aClass182_Sub2_9033.anInt9472 * 1722112305))
	    f_272_ = (float) (aClass182_Sub2_9033.anInt9472 * 1722112305);
	if (f_273_ > (float) (aClass182_Sub2_9033.anInt9473 * 1920901985))
	    f_273_ = (float) (aClass182_Sub2_9033.anInt9473 * 1920901985);
	f_271_ = f_270_ - f_271_;
	if (f_271_ >= 0.0F)
	    return false;
	f_273_ = f_272_ - f_273_;
	if (f_273_ >= 0.0F)
	    return false;
	anInt9014 = aClass182_Sub2_9033.anInt9494 * -476035351;
	anInt9015 = (int) ((float) ((int) f_272_ * anInt9014) + f_270_);
	float f_274_ = ((f_251_ - f) * (f_254_ - f_250_)
			- (f_252_ - f_250_) * (f_253_ - f));
	float f_275_ = ((f_253_ - f) * (f_252_ - f_250_)
			- (f_254_ - f_250_) * (f_251_ - f));
	anInt9006
	    = (int) ((f_254_ - f_250_) * 4096.0F * (float) anInt9000 / f_274_);
	anInt9017
	    = (int) ((f_252_ - f_250_) * 4096.0F * (float) anInt9001 / f_275_);
	anInt9018
	    = (int) ((f_253_ - f) * 4096.0F * (float) anInt9000 / f_275_);
	anInt9010
	    = (int) ((f_251_ - f) * 4096.0F * (float) anInt9001 / f_274_);
	anInt9020 = (int) (f_270_ * 16.0F + 8.0F
			   - (f + f_251_ + f_253_ + f_268_) / 4.0F * 16.0F);
	anInt9021
	    = (int) (f_272_ * 16.0F + 8.0F
		     - (f_250_ + f_252_ + f_254_ + f_269_) / 4.0F * 16.0F);
	anInt9022 = (anInt9000 >> 1 << 12) + (anInt9021 * anInt9018 >> 4);
	anInt8999 = (anInt9001 >> 1 << 12) + (anInt9021 * anInt9010 >> 4);
	anInt9024 = anInt9020 * anInt9006 >> 4;
	anInt9025 = anInt9020 * anInt9017 >> 4;
	anInt9029 = (int) f_270_;
	anInt9011 = (int) f_271_;
	anInt9012 = (int) f_272_;
	anInt9023 = (int) f_273_;
	return true;
    }
    
    public int method2529() {
	return anInt9001;
    }
    
    void method2504(float f, float f_276_, float f_277_, float f_278_,
		    float f_279_, float f_280_, int i, int i_281_, int i_282_,
		    int i_283_) {
	if (aClass182_Sub2_9033.method15226())
	    throw new IllegalStateException();
	if (method14538(f, f_276_, f_277_, f_278_, f_279_, f_280_)) {
	    anInt9026 = i_281_;
	    if (i != 1) {
		anInt9007 = i_281_ >>> 24;
		anInt9028 = 256 - anInt9007;
		if (i == 0) {
		    anInt9031 = (i_281_ & 0xff0000) >> 16;
		    anInt9030 = (i_281_ & 0xff00) >> 8;
		    anInt9027 = i_281_ & 0xff;
		} else if (i == 2) {
		    anInt9032 = i_281_ >>> 24;
		    anInt9019 = 256 - anInt9032;
		    int i_284_ = (i_281_ & 0xff00ff) * anInt9019 & ~0xff00ff;
		    int i_285_ = (i_281_ & 0xff00) * anInt9019 & 0xff0000;
		    anInt9034 = (i_284_ | i_285_) >>> 8;
		}
	    }
	    method14536(i, i_282_);
	}
    }
    
    boolean method14546(float f, float f_286_, float f_287_, float f_288_,
			float f_289_, float f_290_) {
	int i = anInt9002 + anInt9000 + anInt9004;
	int i_291_ = anInt9003 + anInt9001 + anInt9005;
	if (i != anInt9000 || i_291_ != anInt9001) {
	    float f_292_ = (f_287_ - f) / (float) i;
	    float f_293_ = (f_288_ - f_286_) / (float) i;
	    float f_294_ = (f_289_ - f) / (float) i_291_;
	    float f_295_ = (f_290_ - f_286_) / (float) i_291_;
	    float f_296_ = f_294_ * (float) anInt9003;
	    float f_297_ = f_295_ * (float) anInt9003;
	    float f_298_ = f_292_ * (float) anInt9002;
	    float f_299_ = f_293_ * (float) anInt9002;
	    float f_300_ = -f_292_ * (float) anInt9004;
	    float f_301_ = -f_293_ * (float) anInt9004;
	    float f_302_ = -f_294_ * (float) anInt9005;
	    float f_303_ = -f_295_ * (float) anInt9005;
	    f += f_298_ + f_296_;
	    f_286_ += f_299_ + f_297_;
	    f_287_ += f_300_ + f_296_;
	    f_288_ += f_301_ + f_297_;
	    f_289_ += f_298_ + f_302_;
	    f_290_ += f_299_ + f_303_;
	}
	float f_304_ = f_289_ + (f_287_ - f);
	float f_305_ = f_288_ + (f_290_ - f_286_);
	float f_306_;
	float f_307_;
	if (f < f_287_) {
	    f_306_ = f;
	    f_307_ = f_287_;
	} else {
	    f_306_ = f_287_;
	    f_307_ = f;
	}
	if (f_289_ < f_306_)
	    f_306_ = f_289_;
	if (f_304_ < f_306_)
	    f_306_ = f_304_;
	if (f_289_ > f_307_)
	    f_307_ = f_289_;
	if (f_304_ > f_307_)
	    f_307_ = f_304_;
	float f_308_;
	float f_309_;
	if (f_286_ < f_288_) {
	    f_308_ = f_286_;
	    f_309_ = f_288_;
	} else {
	    f_308_ = f_288_;
	    f_309_ = f_286_;
	}
	if (f_290_ < f_308_)
	    f_308_ = f_290_;
	if (f_305_ < f_308_)
	    f_308_ = f_305_;
	if (f_290_ > f_309_)
	    f_309_ = f_290_;
	if (f_305_ > f_309_)
	    f_309_ = f_305_;
	if (f_306_ < (float) (aClass182_Sub2_9033.anInt9470 * 1988019027))
	    f_306_ = (float) (aClass182_Sub2_9033.anInt9470 * 1988019027);
	if (f_307_ > (float) (aClass182_Sub2_9033.anInt9499 * -466178451))
	    f_307_ = (float) (aClass182_Sub2_9033.anInt9499 * -466178451);
	if (f_308_ < (float) (aClass182_Sub2_9033.anInt9472 * 1722112305))
	    f_308_ = (float) (aClass182_Sub2_9033.anInt9472 * 1722112305);
	if (f_309_ > (float) (aClass182_Sub2_9033.anInt9473 * 1920901985))
	    f_309_ = (float) (aClass182_Sub2_9033.anInt9473 * 1920901985);
	f_307_ = f_306_ - f_307_;
	if (f_307_ >= 0.0F)
	    return false;
	f_309_ = f_308_ - f_309_;
	if (f_309_ >= 0.0F)
	    return false;
	anInt9014 = aClass182_Sub2_9033.anInt9494 * -476035351;
	anInt9015 = (int) ((float) ((int) f_308_ * anInt9014) + f_306_);
	float f_310_ = ((f_287_ - f) * (f_290_ - f_286_)
			- (f_288_ - f_286_) * (f_289_ - f));
	float f_311_ = ((f_289_ - f) * (f_288_ - f_286_)
			- (f_290_ - f_286_) * (f_287_ - f));
	anInt9006
	    = (int) ((f_290_ - f_286_) * 4096.0F * (float) anInt9000 / f_310_);
	anInt9017
	    = (int) ((f_288_ - f_286_) * 4096.0F * (float) anInt9001 / f_311_);
	anInt9018
	    = (int) ((f_289_ - f) * 4096.0F * (float) anInt9000 / f_311_);
	anInt9010
	    = (int) ((f_287_ - f) * 4096.0F * (float) anInt9001 / f_310_);
	anInt9020 = (int) (f_306_ * 16.0F + 8.0F
			   - (f + f_287_ + f_289_ + f_304_) / 4.0F * 16.0F);
	anInt9021
	    = (int) (f_308_ * 16.0F + 8.0F
		     - (f_286_ + f_288_ + f_290_ + f_305_) / 4.0F * 16.0F);
	anInt9022 = (anInt9000 >> 1 << 12) + (anInt9021 * anInt9018 >> 4);
	anInt8999 = (anInt9001 >> 1 << 12) + (anInt9021 * anInt9010 >> 4);
	anInt9024 = anInt9020 * anInt9006 >> 4;
	anInt9025 = anInt9020 * anInt9017 >> 4;
	anInt9029 = (int) f_306_;
	anInt9011 = (int) f_307_;
	anInt9012 = (int) f_308_;
	anInt9023 = (int) f_309_;
	return true;
    }
    
    public int method2530() {
	return anInt9003 + anInt9001 + anInt9005;
    }
    
    void method2476(float f, float f_312_, float f_313_, float f_314_,
		    float f_315_, float f_316_, int i, int i_317_, int i_318_,
		    int i_319_) {
	if (aClass182_Sub2_9033.method15226())
	    throw new IllegalStateException();
	if (method14538(f, f_312_, f_313_, f_314_, f_315_, f_316_)) {
	    anInt9026 = i_317_;
	    if (i != 1) {
		anInt9007 = i_317_ >>> 24;
		anInt9028 = 256 - anInt9007;
		if (i == 0) {
		    anInt9031 = (i_317_ & 0xff0000) >> 16;
		    anInt9030 = (i_317_ & 0xff00) >> 8;
		    anInt9027 = i_317_ & 0xff;
		} else if (i == 2) {
		    anInt9032 = i_317_ >>> 24;
		    anInt9019 = 256 - anInt9032;
		    int i_320_ = (i_317_ & 0xff00ff) * anInt9019 & ~0xff00ff;
		    int i_321_ = (i_317_ & 0xff00) * anInt9019 & 0xff0000;
		    anInt9034 = (i_320_ | i_321_) >>> 8;
		}
	    }
	    method14536(i, i_318_);
	}
    }
    
    abstract void method14547(int i, int i_322_);
    
    abstract void method14548(int i, int i_323_);
    
    void method2484(float f, float f_324_, float f_325_, float f_326_,
		    float f_327_, float f_328_, int i, Class152 class152,
		    int i_329_, int i_330_) {
	if (aClass182_Sub2_9033.method15226())
	    throw new IllegalStateException();
	if (method14538(f, f_324_, f_325_, f_326_, f_327_, f_328_)) {
	    Class152_Sub1 class152_sub1 = (Class152_Sub1) class152;
	    method14539(class152_sub1.anIntArray8998,
			class152_sub1.anIntArray8997, anInt9029 - i_329_,
			-i_330_ - (anInt9023 - anInt9012));
	}
    }
    
    public int method2519() {
	return anInt9000;
    }
    
    public abstract void method2527(int i, int i_331_, int i_332_, int i_333_,
				    int[] is, int i_334_, int i_335_);
    
    public abstract void method2545(int i, int i_336_, int i_337_, int i_338_,
				    int i_339_);
    
    public void method2511(int i, int i_340_, int i_341_, int i_342_,
			   int i_343_, int i_344_, int i_345_) {
	if (aClass182_Sub2_9033.method15226())
	    throw new IllegalStateException();
	if (anIntArray9013 == null)
	    anIntArray9013 = new int[4];
	aClass182_Sub2_9033.method3187(anIntArray9013);
	aClass182_Sub2_9033.method3185((aClass182_Sub2_9033.anInt9470
					* 1988019027),
				       (aClass182_Sub2_9033.anInt9472
					* 1722112305),
				       i + i_341_, i_340_ + i_342_);
	int i_346_ = method12();
	int i_347_ = method2472();
	int i_348_ = (i_341_ + i_346_ - 1) / i_346_;
	int i_349_ = (i_342_ + i_347_ - 1) / i_347_;
	for (int i_350_ = 0; i_350_ < i_349_; i_350_++) {
	    int i_351_ = i_350_ * i_347_;
	    for (int i_352_ = 0; i_352_ < i_348_; i_352_++)
		method2479(i + i_352_ * i_346_, i_340_ + i_351_, i_343_,
			   i_344_, i_345_);
	}
	aClass182_Sub2_9033.method3184(anIntArray9013[0], anIntArray9013[1],
				       anIntArray9013[2], anIntArray9013[3]);
    }
}
