/* Class179 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class179
{
    protected boolean aBool1916 = false;
    public boolean aBool1917 = true;
    static final float aFloat1918 = 3.1415927F;
    
    abstract boolean method2919();
    
    public abstract boolean method2920(int i, int i_0_, Class444 class444,
				       boolean bool, int i_1_);
    
    static void method2921(int i, int i_2_, int i_3_, int i_4_, int i_5_,
			   int i_6_, float[] fs, float f, int i_7_, float f_8_,
			   float[] fs_9_) {
	i -= i_4_;
	i_2_ -= i_5_;
	i_3_ -= i_6_;
	float f_10_
	    = (float) i * fs[0] + (float) i_2_ * fs[1] + (float) i_3_ * fs[2];
	float f_11_
	    = (float) i * fs[3] + (float) i_2_ * fs[4] + (float) i_3_ * fs[5];
	float f_12_
	    = (float) i * fs[6] + (float) i_2_ * fs[7] + (float) i_3_ * fs[8];
	float f_13_
	    = ((float) Math.atan2((double) f_10_, (double) f_12_) / 6.2831855F
	       + 0.5F);
	if (f != 1.0F)
	    f_13_ *= f;
	float f_14_ = f_11_ + 0.5F + f_8_;
	if (i_7_ == 1) {
	    float f_15_ = f_13_;
	    f_13_ = -f_14_;
	    f_14_ = f_15_;
	} else if (i_7_ == 2) {
	    f_13_ = -f_13_;
	    f_14_ = -f_14_;
	} else if (i_7_ == 3) {
	    float f_16_ = f_13_;
	    f_13_ = f_14_;
	    f_14_ = -f_16_;
	}
	fs_9_[0] = f_13_;
	fs_9_[1] = f_14_;
    }
    
    static int method2922(float f, float f_17_, float f_18_) {
	float f_19_ = f < 0.0F ? -f : f;
	float f_20_ = f_17_ < 0.0F ? -f_17_ : f_17_;
	float f_21_ = f_18_ < 0.0F ? -f_18_ : f_18_;
	if (f_20_ > f_19_ && f_20_ > f_21_) {
	    if (f_17_ > 0.0F)
		return 0;
	    return 1;
	}
	if (f_21_ > f_19_ && f_21_ > f_20_) {
	    if (f_18_ > 0.0F)
		return 2;
	    return 3;
	}
	if (f > 0.0F)
	    return 4;
	return 5;
    }
    
    public abstract int method2923();
    
    public abstract boolean method2924();
    
    static float[] method2925(int i, int i_22_, int i_23_, int i_24_, float f,
			      float f_25_, float f_26_) {
	float[] fs = new float[9];
	float[] fs_27_ = new float[9];
	float f_28_
	    = (float) Math.cos((double) ((float) i_24_ * 0.024543693F));
	float f_29_
	    = (float) Math.sin((double) ((float) i_24_ * 0.024543693F));
	float f_30_ = 1.0F - f_28_;
	fs[0] = f_28_;
	fs[1] = 0.0F;
	fs[2] = f_29_;
	fs[3] = 0.0F;
	fs[4] = 1.0F;
	fs[5] = 0.0F;
	fs[6] = -f_29_;
	fs[7] = 0.0F;
	fs[8] = f_28_;
	float[] fs_31_ = new float[9];
	float f_32_ = 1.0F;
	float f_33_ = 0.0F;
	f_28_ = (float) i_22_ / 32767.0F;
	f_29_ = -(float) Math.sqrt((double) (1.0F - f_28_ * f_28_));
	f_30_ = 1.0F - f_28_;
	float f_34_ = (float) Math.sqrt((double) (i * i + i_23_ * i_23_));
	if (f_34_ == 0.0F && f_28_ == 0.0F)
	    fs_27_ = fs;
	else {
	    if (f_34_ != 0.0F) {
		f_32_ = (float) -i_23_ / f_34_;
		f_33_ = (float) i / f_34_;
	    }
	    fs_31_[0] = f_28_ + f_32_ * f_32_ * f_30_;
	    fs_31_[1] = f_33_ * f_29_;
	    fs_31_[2] = f_33_ * f_32_ * f_30_;
	    fs_31_[3] = -f_33_ * f_29_;
	    fs_31_[4] = f_28_;
	    fs_31_[5] = f_32_ * f_29_;
	    fs_31_[6] = f_32_ * f_33_ * f_30_;
	    fs_31_[7] = -f_32_ * f_29_;
	    fs_31_[8] = f_28_ + f_33_ * f_33_ * f_30_;
	    fs_27_[0]
		= fs[0] * fs_31_[0] + fs[1] * fs_31_[3] + fs[2] * fs_31_[6];
	    fs_27_[1]
		= fs[0] * fs_31_[1] + fs[1] * fs_31_[4] + fs[2] * fs_31_[7];
	    fs_27_[2]
		= fs[0] * fs_31_[2] + fs[1] * fs_31_[5] + fs[2] * fs_31_[8];
	    fs_27_[3]
		= fs[3] * fs_31_[0] + fs[4] * fs_31_[3] + fs[5] * fs_31_[6];
	    fs_27_[4]
		= fs[3] * fs_31_[1] + fs[4] * fs_31_[4] + fs[5] * fs_31_[7];
	    fs_27_[5]
		= fs[3] * fs_31_[2] + fs[4] * fs_31_[5] + fs[5] * fs_31_[8];
	    fs_27_[6]
		= fs[6] * fs_31_[0] + fs[7] * fs_31_[3] + fs[8] * fs_31_[6];
	    fs_27_[7]
		= fs[6] * fs_31_[1] + fs[7] * fs_31_[4] + fs[8] * fs_31_[7];
	    fs_27_[8]
		= fs[6] * fs_31_[2] + fs[7] * fs_31_[5] + fs[8] * fs_31_[8];
	}
	fs_27_[0] *= f;
	fs_27_[1] *= f;
	fs_27_[2] *= f;
	fs_27_[3] *= f_25_;
	fs_27_[4] *= f_25_;
	fs_27_[5] *= f_25_;
	fs_27_[6] *= f_26_;
	fs_27_[7] *= f_26_;
	fs_27_[8] *= f_26_;
	return fs_27_;
    }
    
    public abstract Class179 method2926(byte i, int i_35_, boolean bool);
    
    static float[] method2927(int i, int i_36_, int i_37_, int i_38_, float f,
			      float f_39_, float f_40_) {
	float[] fs = new float[9];
	float[] fs_41_ = new float[9];
	float f_42_
	    = (float) Math.cos((double) ((float) i_38_ * 0.024543693F));
	float f_43_
	    = (float) Math.sin((double) ((float) i_38_ * 0.024543693F));
	float f_44_ = 1.0F - f_42_;
	fs[0] = f_42_;
	fs[1] = 0.0F;
	fs[2] = f_43_;
	fs[3] = 0.0F;
	fs[4] = 1.0F;
	fs[5] = 0.0F;
	fs[6] = -f_43_;
	fs[7] = 0.0F;
	fs[8] = f_42_;
	float[] fs_45_ = new float[9];
	float f_46_ = 1.0F;
	float f_47_ = 0.0F;
	f_42_ = (float) i_36_ / 32767.0F;
	f_43_ = -(float) Math.sqrt((double) (1.0F - f_42_ * f_42_));
	f_44_ = 1.0F - f_42_;
	float f_48_ = (float) Math.sqrt((double) (i * i + i_37_ * i_37_));
	if (f_48_ == 0.0F && f_42_ == 0.0F)
	    fs_41_ = fs;
	else {
	    if (f_48_ != 0.0F) {
		f_46_ = (float) -i_37_ / f_48_;
		f_47_ = (float) i / f_48_;
	    }
	    fs_45_[0] = f_42_ + f_46_ * f_46_ * f_44_;
	    fs_45_[1] = f_47_ * f_43_;
	    fs_45_[2] = f_47_ * f_46_ * f_44_;
	    fs_45_[3] = -f_47_ * f_43_;
	    fs_45_[4] = f_42_;
	    fs_45_[5] = f_46_ * f_43_;
	    fs_45_[6] = f_46_ * f_47_ * f_44_;
	    fs_45_[7] = -f_46_ * f_43_;
	    fs_45_[8] = f_42_ + f_47_ * f_47_ * f_44_;
	    fs_41_[0]
		= fs[0] * fs_45_[0] + fs[1] * fs_45_[3] + fs[2] * fs_45_[6];
	    fs_41_[1]
		= fs[0] * fs_45_[1] + fs[1] * fs_45_[4] + fs[2] * fs_45_[7];
	    fs_41_[2]
		= fs[0] * fs_45_[2] + fs[1] * fs_45_[5] + fs[2] * fs_45_[8];
	    fs_41_[3]
		= fs[3] * fs_45_[0] + fs[4] * fs_45_[3] + fs[5] * fs_45_[6];
	    fs_41_[4]
		= fs[3] * fs_45_[1] + fs[4] * fs_45_[4] + fs[5] * fs_45_[7];
	    fs_41_[5]
		= fs[3] * fs_45_[2] + fs[4] * fs_45_[5] + fs[5] * fs_45_[8];
	    fs_41_[6]
		= fs[6] * fs_45_[0] + fs[7] * fs_45_[3] + fs[8] * fs_45_[6];
	    fs_41_[7]
		= fs[6] * fs_45_[1] + fs[7] * fs_45_[4] + fs[8] * fs_45_[7];
	    fs_41_[8]
		= fs[6] * fs_45_[2] + fs[7] * fs_45_[5] + fs[8] * fs_45_[8];
	}
	fs_41_[0] *= f;
	fs_41_[1] *= f;
	fs_41_[2] *= f;
	fs_41_[3] *= f_39_;
	fs_41_[4] *= f_39_;
	fs_41_[5] *= f_39_;
	fs_41_[6] *= f_40_;
	fs_41_[7] *= f_40_;
	fs_41_[8] *= f_40_;
	return fs_41_;
    }
    
    public abstract int method2928();
    
    public abstract void method2929();
    
    public abstract void method2930(int i);
    
    public abstract void method2931(int i);
    
    public abstract void method2932(int i);
    
    public abstract void method2933(int i);
    
    public abstract void method2934(int i, int i_49_, int i_50_);
    
    public abstract void method2935(int i);
    
    public abstract void method2936(int i, int i_51_, int i_52_);
    
    public abstract void method2937(int i, int i_53_, Class161 class161,
				    Class161 class161_54_, int i_55_,
				    int i_56_, int i_57_);
    
    void method2938(Class161 class161, int i, int i_58_, int i_59_, int i_60_,
		    int i_61_, int i_62_, int i_63_) {
	boolean bool = false;
	boolean bool_64_ = false;
	boolean bool_65_ = false;
	int i_66_ = -i_60_ / 2;
	int i_67_ = -i_61_ / 2;
	int i_68_ = class161.method2588(i + i_66_, i_59_ + i_67_, -965296538);
	int i_69_ = i_60_ / 2;
	int i_70_ = -i_61_ / 2;
	int i_71_ = class161.method2588(i + i_69_, i_59_ + i_70_, -595130970);
	int i_72_ = -i_60_ / 2;
	int i_73_ = i_61_ / 2;
	int i_74_ = class161.method2588(i + i_72_, i_59_ + i_73_, -598701787);
	int i_75_ = i_60_ / 2;
	int i_76_ = i_61_ / 2;
	int i_77_ = class161.method2588(i + i_75_, i_59_ + i_76_, -275717016);
	int i_78_ = i_68_ < i_71_ ? i_68_ : i_71_;
	int i_79_ = i_74_ < i_77_ ? i_74_ : i_77_;
	int i_80_ = i_71_ < i_77_ ? i_71_ : i_77_;
	int i_81_ = i_68_ < i_74_ ? i_68_ : i_74_;
	if (i_61_ != 0) {
	    int i_82_
		= ((int) (Math.atan2((double) (i_78_ - i_79_), (double) i_61_)
			  * 2607.5945876176133)
		   & 0x3fff);
	    if (i_82_ != 0) {
		if (i_62_ != 0) {
		    if (i_82_ > 8192) {
			int i_83_ = 16384 - i_62_;
			if (i_82_ < i_83_)
			    i_82_ = i_83_;
		    } else if (i_82_ > i_62_)
			i_82_ = i_62_;
		}
		method2932(i_82_);
	    }
	}
	if (i_60_ != 0) {
	    int i_84_
		= ((int) (Math.atan2((double) (i_81_ - i_80_), (double) i_60_)
			  * 2607.5945876176133)
		   & 0x3fff);
	    if (i_84_ != 0) {
		if (i_63_ != 0) {
		    if (i_84_ > 8192) {
			int i_85_ = 16384 - i_63_;
			if (i_84_ < i_85_)
			    i_84_ = i_85_;
		    } else if (i_84_ > i_63_)
			i_84_ = i_63_;
		}
		method2933(i_84_);
	    }
	}
	int i_86_ = i_68_ + i_77_;
	if (i_71_ + i_74_ < i_86_)
	    i_86_ = i_71_ + i_74_;
	i_86_ = (i_86_ >> 1) - i_58_;
	if (i_86_ != 0)
	    method2934(0, i_86_, 0);
    }
    
    abstract void method2939();
    
    abstract void method2940();
    
    public final void method2941
	(Class525_Sub16_Sub18 class525_sub16_sub18, int i,
	 Class525_Sub16_Sub18 class525_sub16_sub18_87_, int i_88_, int i_89_,
	 int i_90_, int i_91_, boolean bool) {
	if (i != -1) {
	    method2939();
	    if (!method2947())
		method2940();
	    else {
		AnimationFrame class177
		    = class525_sub16_sub18.aClass177Array11874[i];
		AnimationFrameBase class525_sub14 = class177.base;
		AnimationFrame class177_92_ = null;
		if (class525_sub16_sub18_87_ != null) {
		    class177_92_
			= class525_sub16_sub18_87_.aClass177Array11874[i_88_];
		    if (class177_92_.base != class525_sub14)
			class177_92_ = null;
		}
		method2945(class525_sub14, class177, class177_92_, i_89_,
			   i_90_, i_91_, null, false, bool, 65535, null);
		method2942();
		method2940();
	    }
	}
    }
    
    abstract void method2942();
    
    public abstract void method2943(Class444 class444, int i, boolean bool);
    
    public final void method2944(Class525_Sub16_Sub18 class525_sub16_sub18,
				 int i) {
	if (i != -1) {
	    method2939();
	    if (!method2947())
		method2940();
	    else {
		AnimationFrame class177
		    = class525_sub16_sub18.aClass177Array11874[i];
		AnimationFrameBase class525_sub14 = class177.base;
		for (int i_93_ = 0; i_93_ < class177.transformationCount; i_93_++) {
		    short i_94_ = class177.transformationIndices[i_93_];
		    if (class525_sub14.aBoolArray10539[i_94_]) {
			if (class177.skippedRefrences[i_93_] != -1)
			    method2950(0, 0, 0, 0);
			method2950(class525_sub14.transformationTypes[i_94_],
				   class177.transformationX[i_93_],
				   class177.transformationY[i_93_],
				   class177.transformationZ[i_93_]);
		    }
		}
		method2942();
		method2940();
	    }
	}
    }
    
    void method2945(AnimationFrameBase class525_sub14, AnimationFrame class177,
					AnimationFrame class177_95_, int i, int i_96_, int i_97_,
					boolean[] bools, boolean bool, boolean bool_98_, int i_99_,
					int[] is) {
	if (class177_95_ == null || i == 0) {
	    for (int i_100_ = 0; i_100_ < class177.transformationCount; i_100_++) {
		short i_101_ = class177.transformationIndices[i_100_];
		if (bools == null || bools[i_101_] == bool
		    || class525_sub14.transformationTypes[i_101_] == 0) {
		    short i_102_ = class177.skippedRefrences[i_100_];
		    if (i_102_ != -1)
			method2987(0,
				   class525_sub14.labels[i_102_],
				   0, 0, 0, i_97_, bool_98_,
				   (i_99_
				    & class525_sub14.anIntArray10545[i_102_]),
				   is);
		    method2987(class525_sub14.transformationTypes[i_101_],
			       class525_sub14.labels[i_101_],
			       class177.transformationX[i_100_],
			       class177.transformationY[i_100_],
			       class177.transformationZ[i_100_], i_97_,
			       bool_98_,
			       i_99_ & class525_sub14.anIntArray10545[i_101_],
			       is);
		}
	    }
	} else {
	    int i_103_ = 0;
	    int i_104_ = 0;
	    for (int i_105_ = 0;
			 i_105_ < class525_sub14.count * -92709391; i_105_++) {
		boolean bool_106_ = false;
		if (i_103_ < class177.transformationCount
		    && class177.transformationIndices[i_103_] == i_105_)
		    bool_106_ = true;
		boolean bool_107_ = false;
		if (i_104_ < class177_95_.transformationCount
		    && class177_95_.transformationIndices[i_104_] == i_105_)
		    bool_107_ = true;
		if (bool_106_ || bool_107_) {
		    if (bools != null && bools[i_105_] != bool
			&& class525_sub14.transformationTypes[i_105_] != 0) {
			if (bool_106_)
			    i_103_++;
			if (bool_107_)
			    i_104_++;
		    } else {
			int i_108_ = 0;
			int i_109_ = class525_sub14.transformationTypes[i_105_];
			if (i_109_ == 3 || i_109_ == 10)
			    i_108_ = 128;
			int i_110_;
			int i_111_;
			int i_112_;
			short i_113_;
			byte i_114_;
			if (bool_106_) {
			    i_110_ = class177.transformationX[i_103_];
			    i_111_ = class177.transformationY[i_103_];
			    i_112_ = class177.transformationZ[i_103_];
			    i_113_ = class177.skippedRefrences[i_103_];
			    i_114_ = class177.transformationFlags[i_103_];
			    i_103_++;
			} else {
			    i_110_ = i_108_;
			    i_111_ = i_108_;
			    i_112_ = i_108_;
			    i_113_ = (short) -1;
			    i_114_ = (byte) 0;
			}
			int i_115_;
			int i_116_;
			int i_117_;
			short i_118_;
			byte i_119_;
			if (bool_107_) {
			    i_115_ = class177_95_.transformationX[i_104_];
			    i_116_ = class177_95_.transformationY[i_104_];
			    i_117_ = class177_95_.transformationZ[i_104_];
			    i_118_ = class177_95_.skippedRefrences[i_104_];
			    i_119_ = class177_95_.transformationFlags[i_104_];
			    i_104_++;
			} else {
			    i_115_ = i_108_;
			    i_116_ = i_108_;
			    i_117_ = i_108_;
			    i_118_ = (short) -1;
			    i_119_ = (byte) 0;
			}
			int i_120_;
			int i_121_;
			int i_122_;
			if ((i_114_ & 0x2) != 0 || (i_119_ & 0x1) != 0) {
			    i_120_ = i_110_;
			    i_121_ = i_111_;
			    i_122_ = i_112_;
			} else if (i_109_ == 2) {
			    int i_123_ = i_115_ - i_110_ & 0x3fff;
			    int i_124_ = i_116_ - i_111_ & 0x3fff;
			    int i_125_ = i_117_ - i_112_ & 0x3fff;
			    if (i_123_ >= 8192)
				i_123_ -= 16384;
			    if (i_124_ >= 8192)
				i_124_ -= 16384;
			    if (i_125_ >= 8192)
				i_125_ -= 16384;
			    i_120_ = i_110_ + i_123_ * i / i_96_ & 0x3fff;
			    i_121_ = i_111_ + i_124_ * i / i_96_ & 0x3fff;
			    i_122_ = i_112_ + i_125_ * i / i_96_ & 0x3fff;
			} else if (i_109_ == 9) {
			    int i_126_ = i_115_ - i_110_ & 0x3fff;
			    if (i_126_ >= 8192)
				i_126_ -= 16384;
			    i_120_ = i_110_ + i_126_ * i / i_96_ & 0x3fff;
			    i_122_ = 0;
			    i_121_ = 0;
			} else if (i_109_ == 7) {
			    int i_127_ = i_115_ - i_110_ & 0x3f;
			    if (i_127_ >= 32)
				i_127_ -= 64;
			    i_120_ = i_110_ + i_127_ * i / i_96_ & 0x3f;
			    i_121_ = i_111_ + (i_116_ - i_111_) * i / i_96_;
			    i_122_ = i_112_ + (i_117_ - i_112_) * i / i_96_;
			} else {
			    i_120_ = i_110_ + (i_115_ - i_110_) * i / i_96_;
			    i_121_ = i_111_ + (i_116_ - i_111_) * i / i_96_;
			    i_122_ = i_112_ + (i_117_ - i_112_) * i / i_96_;
			}
			if (i_113_ != -1)
			    method2987(0,
				       (class525_sub14.labels
					[i_113_]),
				       0, 0, 0, i_97_, bool_98_,
				       i_99_ & (class525_sub14.anIntArray10545
						[i_113_]),
				       is);
			else if (i_118_ != -1)
			    method2987(0,
				       (class525_sub14.labels
					[i_118_]),
				       0, 0, 0, i_97_, bool_98_,
				       i_99_ & (class525_sub14.anIntArray10545
						[i_118_]),
				       is);
			method2987(i_109_,
				   class525_sub14.labels[i_105_],
				   i_120_, i_121_, i_122_, i_97_, bool_98_,
				   (i_99_
				    & class525_sub14.anIntArray10545[i_105_]),
				   is);
		    }
		}
	    }
	}
    }
    
    public abstract MagnetConfig[] method2946();
    
    abstract boolean method2947();
    
    abstract void method2948(int i, int[] is, int i_128_, int i_129_,
			     int i_130_, int i_131_, boolean bool);
    
    abstract void method2949(int i, int[] is, int i_132_, int i_133_,
			     int i_134_, boolean bool, int i_135_,
			     int[] is_136_);
    
    abstract void method2950(int i, int i_137_, int i_138_, int i_139_);
    
    public final void method2951
	(Class525_Sub16_Sub18 class525_sub16_sub18, int i,
	 Class525_Sub16_Sub18 class525_sub16_sub18_140_, int i_141_,
	 int i_142_, int i_143_,
	 Class525_Sub16_Sub18 class525_sub16_sub18_144_, int i_145_,
	 Class525_Sub16_Sub18 class525_sub16_sub18_146_, int i_147_,
	 int i_148_, int i_149_, boolean[] bools, boolean bool) {
	if (i != -1) {
	    if (bools == null || i_145_ == -1)
		method2941(class525_sub16_sub18, i, class525_sub16_sub18_140_,
			   i_141_, i_142_, i_143_, 0, bool);
	    else {
		method2939();
		if (!method2947())
		    method2940();
		else {
		    AnimationFrame class177
			= class525_sub16_sub18.aClass177Array11874[i];
		    AnimationFrameBase class525_sub14
			= class177.base;
		    AnimationFrame class177_150_ = null;
		    if (class525_sub16_sub18_140_ != null) {
			class177_150_ = (class525_sub16_sub18_140_
					 .aClass177Array11874[i_141_]);
			if (class177_150_.base
			    != class525_sub14)
			    class177_150_ = null;
		    }
		    method2945(class525_sub14, class177, class177_150_, i_142_,
			       i_143_, 0, bools, false, bool, 65535, null);
		    AnimationFrame class177_151_ = (class525_sub16_sub18_144_
					      .aClass177Array11874[i_145_]);
		    AnimationFrame class177_152_ = null;
		    if (class525_sub16_sub18_146_ != null) {
			class177_152_ = (class525_sub16_sub18_146_
					 .aClass177Array11874[i_147_]);
			if (class177_152_.base
			    != class525_sub14)
			    class177_152_ = null;
		    }
		    method2948(0, new int[0], 0, 0, 0, 0, bool);
		    method2945(class177_151_.base,
			       class177_151_, class177_152_, i_148_, i_149_, 0,
			       bools, true, bool, 65535, null);
		    method2942();
		    method2940();
		}
	    }
	}
    }
    
    public abstract void method2952(int i);
    
    public abstract void method2953(Class444 class444, Class211 class211,
				    int i);
    
    public abstract boolean method2954(int i, int i_153_, Class444 class444,
				       boolean bool, int i_154_);
    
    public abstract Class525_Sub16_Sub17 method2955
	(Class525_Sub16_Sub17 class525_sub16_sub17);
    
    public abstract int method2956();
    
    public abstract int method2957();
    
    public abstract byte[] method2958();
    
    public abstract int method2959();
    
    public abstract int method2960();
    
    public abstract int method2961();
    
    public abstract int method2962();
    
    public abstract int method2963();
    
    public abstract int method2964();
    
    public abstract void method2965(int i, int i_155_, int i_156_);
    
    public abstract void method2966(int i);
    
    public final void method2967(Class525_Sub16_Sub18 class525_sub16_sub18,
				 int i) {
	if (i != -1) {
	    method2939();
	    if (!method2947())
		method2940();
	    else {
		AnimationFrame class177
		    = class525_sub16_sub18.aClass177Array11874[i];
		AnimationFrameBase class525_sub14 = class177.base;
		for (int i_157_ = 0; i_157_ < class177.transformationCount; i_157_++) {
		    short i_158_ = class177.transformationIndices[i_157_];
		    if (class525_sub14.aBoolArray10539[i_158_]) {
			if (class177.skippedRefrences[i_157_] != -1)
			    method2950(0, 0, 0, 0);
			method2950(class525_sub14.transformationTypes[i_158_],
				   class177.transformationX[i_157_],
				   class177.transformationY[i_157_],
				   class177.transformationZ[i_157_]);
		    }
		}
		method2942();
		method2940();
	    }
	}
    }
    
    public abstract void method2968(Class444 class444, int i, boolean bool);
    
    public abstract void method2969(short i, short i_159_);
    
    public abstract byte[] method2970();
    
    public abstract void method2971(short i, short i_160_);
    
    public abstract void method2972(byte i, byte[] is);
    
    public abstract void method2973(short i, short i_161_);
    
    public abstract void method2974(int i, int i_162_, int i_163_, int i_164_);
    
    public final void method2975
	(Class525_Sub16_Sub18 class525_sub16_sub18, int i,
	 Class525_Sub16_Sub18 class525_sub16_sub18_165_, int i_166_,
	 int i_167_, int i_168_, int i_169_, boolean bool) {
	if (i != -1) {
	    method2939();
	    if (!method2947())
		method2940();
	    else {
		AnimationFrame class177
		    = class525_sub16_sub18.aClass177Array11874[i];
		AnimationFrameBase class525_sub14 = class177.base;
		AnimationFrame class177_170_ = null;
		if (class525_sub16_sub18_165_ != null) {
		    class177_170_ = (class525_sub16_sub18_165_
				     .aClass177Array11874[i_166_]);
		    if (class177_170_.base != class525_sub14)
			class177_170_ = null;
		}
		method2945(class525_sub14, class177, class177_170_, i_167_,
			   i_168_, i_169_, null, false, bool, 65535, null);
		method2942();
		method2940();
	    }
	}
    }
    
    Class207 method2976(ModelDecoder class186, int[] is, int i) {
	int[] is_171_ = null;
	int[] is_172_ = null;
	int[] is_173_ = null;
	float[][] fs = null;
	if (class186.aShortArray2122 != null) {
	    int i_174_ = class186.texturedFaceCount;
	    int[] is_175_ = new int[i_174_];
	    int[] is_176_ = new int[i_174_];
	    int[] is_177_ = new int[i_174_];
	    int[] is_178_ = new int[i_174_];
	    int[] is_179_ = new int[i_174_];
	    int[] is_180_ = new int[i_174_];
	    for (int i_181_ = 0; i_181_ < i_174_; i_181_++) {
		is_175_[i_181_] = 2147483647;
		is_176_[i_181_] = -2147483647;
		is_177_[i_181_] = 2147483647;
		is_178_[i_181_] = -2147483647;
		is_179_[i_181_] = 2147483647;
		is_180_[i_181_] = -2147483647;
	    }
	    for (int i_182_ = 0; i_182_ < i; i_182_++) {
		int i_183_ = is[i_182_];
		short i_184_ = class186.aShortArray2122[i_183_];
		if (i_184_ > -1 && i_184_ < 32766) {
		    for (int i_185_ = 0; i_185_ < 3; i_185_++) {
			short i_186_;
			if (i_185_ == 0)
			    i_186_ = class186.faceA[i_183_];
			else if (i_185_ == 1)
			    i_186_ = class186.faceB[i_183_];
			else
			    i_186_ = class186.faceC[i_183_];
			int i_187_ = class186.vertexX[i_186_];
			int i_188_ = class186.vertexY[i_186_];
			int i_189_ = class186.vertexZ[i_186_];
			if (i_187_ < is_175_[i_184_])
			    is_175_[i_184_] = i_187_;
			if (i_187_ > is_176_[i_184_])
			    is_176_[i_184_] = i_187_;
			if (i_188_ < is_177_[i_184_])
			    is_177_[i_184_] = i_188_;
			if (i_188_ > is_178_[i_184_])
			    is_178_[i_184_] = i_188_;
			if (i_189_ < is_179_[i_184_])
			    is_179_[i_184_] = i_189_;
			if (i_189_ > is_180_[i_184_])
			    is_180_[i_184_] = i_189_;
		    }
		}
	    }
	    is_171_ = new int[i_174_];
	    is_172_ = new int[i_174_];
	    is_173_ = new int[i_174_];
	    fs = new float[i_174_][];
	    for (int i_190_ = 0; i_190_ < i_174_; i_190_++) {
		byte i_191_ = class186.textureRenderTypes[i_190_];
		if (i_191_ > 0) {
		    is_171_[i_190_] = (is_175_[i_190_] + is_176_[i_190_]) / 2;
		    is_172_[i_190_] = (is_177_[i_190_] + is_178_[i_190_]) / 2;
		    is_173_[i_190_] = (is_179_[i_190_] + is_180_[i_190_]) / 2;
		    float f;
		    float f_192_;
		    float f_193_;
		    if (i_191_ == 1) {
			int i_194_ = class186.anIntArray2121[i_190_];
			if (i_194_ == 0) {
			    f = 1.0F;
			    f_193_ = 1.0F;
			} else if (i_194_ > 0) {
			    f = 1.0F;
			    f_193_ = (float) i_194_ / 1024.0F;
			} else {
			    f_193_ = 1.0F;
			    f = (float) -i_194_ / 1024.0F;
			}
			f_192_
			    = 64.0F / (float) class186.anIntArray2114[i_190_];
		    } else if (i_191_ == 2) {
			f = 64.0F / (float) class186.anIntArray2121[i_190_];
			f_192_
			    = 64.0F / (float) class186.anIntArray2114[i_190_];
			f_193_
			    = 64.0F / (float) class186.anIntArray2123[i_190_];
		    } else {
			f = (float) class186.anIntArray2121[i_190_] / 1024.0F;
			f_192_ = ((float) class186.anIntArray2114[i_190_]
				  / 1024.0F);
			f_193_ = ((float) class186.anIntArray2123[i_190_]
				  / 1024.0F);
		    }
		    fs[i_190_]
			= method2925(class186.aShortArray2118[i_190_],
				     class186.aShortArray2119[i_190_],
				     class186.aShortArray2120[i_190_],
				     class186.aByteArray2127[i_190_] & 0xff, f,
				     f_192_, f_193_);
		}
	    }
	}
	return new Class207(this, is_171_, is_172_, is_173_, fs);
    }
    
    public abstract boolean method2977();
    
    public abstract void method2978(Class444 class444);
    
    public abstract Class184[] method2979();
    
    public abstract MagnetConfig[] method2980();
    
    public abstract boolean method2981();
    
    public final void method2982
	(Class525_Sub16_Sub18 class525_sub16_sub18, int i,
	 Class525_Sub16_Sub18 class525_sub16_sub18_195_, int i_196_,
	 int i_197_, int i_198_, int i_199_, int i_200_, boolean bool,
	 int[] is) {
	if (i != -1) {
	    method2939();
	    if (!method2947())
		method2940();
	    else {
		AnimationFrame class177
		    = class525_sub16_sub18.aClass177Array11874[i];
		AnimationFrameBase class525_sub14 = class177.base;
		AnimationFrame class177_201_ = null;
		if (class525_sub16_sub18_195_ != null) {
		    class177_201_ = (class525_sub16_sub18_195_
				     .aClass177Array11874[i_196_]);
		    if (class177_201_.base != class525_sub14)
			class177_201_ = null;
		}
		method2945(class525_sub14, class177, class177_201_, i_197_,
			   i_198_, i_199_, null, false, bool, i_200_, is);
		method2942();
		method2940();
	    }
	}
    }
    
    public abstract void method2983(Class179 class179_202_, int i, int i_203_,
				    int i_204_, boolean bool);
    
    public abstract Class179 method2984(byte i, int i_205_, boolean bool);
    
    public abstract Class179 method2985(byte i, int i_206_, boolean bool);
    
    public abstract int method2986();
    
    void method2987(int i, int[] is, int i_207_, int i_208_, int i_209_,
		    int i_210_, boolean bool, int i_211_, int[] is_212_) {
	if (i_210_ == 1) {
	    if (i == 0 || i == 1) {
		int i_213_ = -i_207_;
		i_207_ = i_209_;
		i_209_ = i_213_;
	    } else if (i == 3) {
		int i_214_ = i_207_;
		i_207_ = i_209_;
		i_209_ = i_214_;
	    } else if (i == 2) {
		int i_215_ = i_207_;
		i_207_ = -i_209_ & 0x3fff;
		i_209_ = i_215_ & 0x3fff;
	    }
	} else if (i_210_ == 2) {
	    if (i == 0 || i == 1) {
		i_207_ = -i_207_;
		i_209_ = -i_209_;
	    } else if (i == 2) {
		i_207_ = -i_207_ & 0x3fff;
		i_209_ = -i_209_ & 0x3fff;
	    }
	} else if (i_210_ == 3) {
	    if (i == 0 || i == 1) {
		int i_216_ = i_207_;
		i_207_ = -i_209_;
		i_209_ = i_216_;
	    } else if (i == 3) {
		int i_217_ = i_207_;
		i_207_ = i_209_;
		i_209_ = i_217_;
	    } else if (i == 2) {
		int i_218_ = i_207_;
		i_207_ = i_209_ & 0x3fff;
		i_209_ = -i_218_ & 0x3fff;
	    }
	}
	if (i_211_ != 65535)
	    method2949(i, is, i_207_, i_208_, i_209_, bool, i_211_, is_212_);
	else
	    method2948(i, is, i_207_, i_208_, i_209_, i_210_, bool);
    }
    
    public abstract int method2988();
    
    public abstract int method2989();
    
    public abstract void method2990(int i);
    
    public abstract void method2991();
    
    public abstract void method2992();
    
    public abstract void method2993(int i);
    
    public abstract void method2994(int i);
    
    public abstract void method2995(int i);
    
    static int method2996(float f, float f_219_, float f_220_) {
	float f_221_ = f < 0.0F ? -f : f;
	float f_222_ = f_219_ < 0.0F ? -f_219_ : f_219_;
	float f_223_ = f_220_ < 0.0F ? -f_220_ : f_220_;
	if (f_222_ > f_221_ && f_222_ > f_223_) {
	    if (f_219_ > 0.0F)
		return 0;
	    return 1;
	}
	if (f_223_ > f_221_ && f_223_ > f_222_) {
	    if (f_220_ > 0.0F)
		return 2;
	    return 3;
	}
	if (f > 0.0F)
	    return 4;
	return 5;
    }
    
    public abstract void method2997(Class444 class444, int i, boolean bool);
    
    public abstract void method2998(int i);
    
    public abstract void method2999(int i);
    
    abstract void method3000(int i, int i_224_, int i_225_, int i_226_);
    
    public abstract int method3001();
    
    public abstract int method3002();
    
    public abstract void method3003();
    
    public abstract void method3004(int i);
    
    public abstract void method3005(int i, int i_227_, int i_228_);
    
    abstract void method3006();
    
    abstract void method3007();
    
    abstract void method3008();
    
    static void method3009(int i, int i_229_, int i_230_, int i_231_,
			   int i_232_, int i_233_, int i_234_, float[] fs,
			   int i_235_, float f, float f_236_, float f_237_,
			   float[] fs_238_) {
	i -= i_231_;
	i_229_ -= i_232_;
	i_230_ -= i_233_;
	float f_239_ = ((float) i * fs[0] + (float) i_229_ * fs[1]
			+ (float) i_230_ * fs[2]);
	float f_240_ = ((float) i * fs[3] + (float) i_229_ * fs[4]
			+ (float) i_230_ * fs[5]);
	float f_241_ = ((float) i * fs[6] + (float) i_229_ * fs[7]
			+ (float) i_230_ * fs[8]);
	float f_242_;
	float f_243_;
	if (i_234_ == 0) {
	    f_242_ = f_239_ + f + 0.5F;
	    f_243_ = -f_241_ + f_237_ + 0.5F;
	} else if (i_234_ == 1) {
	    f_242_ = f_239_ + f + 0.5F;
	    f_243_ = f_241_ + f_237_ + 0.5F;
	} else if (i_234_ == 2) {
	    f_242_ = -f_239_ + f + 0.5F;
	    f_243_ = -f_240_ + f_236_ + 0.5F;
	} else if (i_234_ == 3) {
	    f_242_ = f_239_ + f + 0.5F;
	    f_243_ = -f_240_ + f_236_ + 0.5F;
	} else if (i_234_ == 4) {
	    f_242_ = f_241_ + f_237_ + 0.5F;
	    f_243_ = -f_240_ + f_236_ + 0.5F;
	} else {
	    f_242_ = -f_241_ + f_237_ + 0.5F;
	    f_243_ = -f_240_ + f_236_ + 0.5F;
	}
	if (i_235_ == 1) {
	    float f_244_ = f_242_;
	    f_242_ = -f_243_;
	    f_243_ = f_244_;
	} else if (i_235_ == 2) {
	    f_242_ = -f_242_;
	    f_243_ = -f_243_;
	} else if (i_235_ == 3) {
	    float f_245_ = f_242_;
	    f_242_ = f_243_;
	    f_243_ = -f_245_;
	}
	fs_238_[0] = f_242_;
	fs_238_[1] = f_243_;
    }
    
    public abstract void method3010(int i);
    
    public abstract void method3011(int i);
    
    abstract void method3012(int i, int[] is, int i_246_, int i_247_,
			     int i_248_, int i_249_, boolean bool);
    
    abstract void method3013(int i, int[] is, int i_250_, int i_251_,
			     int i_252_, boolean bool, int i_253_,
			     int[] is_254_);
    
    public abstract void method3014(int i, int i_255_, int i_256_, int i_257_);
    
    abstract void method3015(int i, int i_258_, int i_259_, int i_260_);
    
    public abstract void method3016(Class444 class444, Class211 class211,
				    int i);
    
    public abstract boolean method3017();
    
    public abstract int method3018();
    
    public abstract void method3019(Class179 class179_261_, int i, int i_262_,
				    int i_263_, boolean bool);
    
    public abstract void method3020(Class444 class444);
    
    public abstract void method3021(Class444 class444);
    
    public abstract Class525_Sub16_Sub17 method3022
	(Class525_Sub16_Sub17 class525_sub16_sub17);
    
    public abstract Class525_Sub16_Sub17 method3023
	(Class525_Sub16_Sub17 class525_sub16_sub17);
    
    public abstract Class525_Sub16_Sub17 method3024
	(Class525_Sub16_Sub17 class525_sub16_sub17);
    
    public abstract void method3025();
    
    public abstract int method3026();
    
    abstract void method3027();
    
    public abstract int method3028();
    
    public abstract void method3029(int i, int i_264_, Class161 class161,
				    Class161 class161_265_, int i_266_,
				    int i_267_, int i_268_);
    
    public abstract int method3030();
    
    Class207 method3031(ModelDecoder class186, int[] is, int i) {
	int[] is_269_ = null;
	int[] is_270_ = null;
	int[] is_271_ = null;
	float[][] fs = null;
	if (class186.aShortArray2122 != null) {
	    int i_272_ = class186.texturedFaceCount;
	    int[] is_273_ = new int[i_272_];
	    int[] is_274_ = new int[i_272_];
	    int[] is_275_ = new int[i_272_];
	    int[] is_276_ = new int[i_272_];
	    int[] is_277_ = new int[i_272_];
	    int[] is_278_ = new int[i_272_];
	    for (int i_279_ = 0; i_279_ < i_272_; i_279_++) {
		is_273_[i_279_] = 2147483647;
		is_274_[i_279_] = -2147483647;
		is_275_[i_279_] = 2147483647;
		is_276_[i_279_] = -2147483647;
		is_277_[i_279_] = 2147483647;
		is_278_[i_279_] = -2147483647;
	    }
	    for (int i_280_ = 0; i_280_ < i; i_280_++) {
		int i_281_ = is[i_280_];
		short i_282_ = class186.aShortArray2122[i_281_];
		if (i_282_ > -1 && i_282_ < 32766) {
		    for (int i_283_ = 0; i_283_ < 3; i_283_++) {
			short i_284_;
			if (i_283_ == 0)
			    i_284_ = class186.faceA[i_281_];
			else if (i_283_ == 1)
			    i_284_ = class186.faceB[i_281_];
			else
			    i_284_ = class186.faceC[i_281_];
			int i_285_ = class186.vertexX[i_284_];
			int i_286_ = class186.vertexY[i_284_];
			int i_287_ = class186.vertexZ[i_284_];
			if (i_285_ < is_273_[i_282_])
			    is_273_[i_282_] = i_285_;
			if (i_285_ > is_274_[i_282_])
			    is_274_[i_282_] = i_285_;
			if (i_286_ < is_275_[i_282_])
			    is_275_[i_282_] = i_286_;
			if (i_286_ > is_276_[i_282_])
			    is_276_[i_282_] = i_286_;
			if (i_287_ < is_277_[i_282_])
			    is_277_[i_282_] = i_287_;
			if (i_287_ > is_278_[i_282_])
			    is_278_[i_282_] = i_287_;
		    }
		}
	    }
	    is_269_ = new int[i_272_];
	    is_270_ = new int[i_272_];
	    is_271_ = new int[i_272_];
	    fs = new float[i_272_][];
	    for (int i_288_ = 0; i_288_ < i_272_; i_288_++) {
		byte i_289_ = class186.textureRenderTypes[i_288_];
		if (i_289_ > 0) {
		    is_269_[i_288_] = (is_273_[i_288_] + is_274_[i_288_]) / 2;
		    is_270_[i_288_] = (is_275_[i_288_] + is_276_[i_288_]) / 2;
		    is_271_[i_288_] = (is_277_[i_288_] + is_278_[i_288_]) / 2;
		    float f;
		    float f_290_;
		    float f_291_;
		    if (i_289_ == 1) {
			int i_292_ = class186.anIntArray2121[i_288_];
			if (i_292_ == 0) {
			    f = 1.0F;
			    f_291_ = 1.0F;
			} else if (i_292_ > 0) {
			    f = 1.0F;
			    f_291_ = (float) i_292_ / 1024.0F;
			} else {
			    f_291_ = 1.0F;
			    f = (float) -i_292_ / 1024.0F;
			}
			f_290_
			    = 64.0F / (float) class186.anIntArray2114[i_288_];
		    } else if (i_289_ == 2) {
			f = 64.0F / (float) class186.anIntArray2121[i_288_];
			f_290_
			    = 64.0F / (float) class186.anIntArray2114[i_288_];
			f_291_
			    = 64.0F / (float) class186.anIntArray2123[i_288_];
		    } else {
			f = (float) class186.anIntArray2121[i_288_] / 1024.0F;
			f_290_ = ((float) class186.anIntArray2114[i_288_]
				  / 1024.0F);
			f_291_ = ((float) class186.anIntArray2123[i_288_]
				  / 1024.0F);
		    }
		    fs[i_288_]
			= method2925(class186.aShortArray2118[i_288_],
				     class186.aShortArray2119[i_288_],
				     class186.aShortArray2120[i_288_],
				     class186.aByteArray2127[i_288_] & 0xff, f,
				     f_290_, f_291_);
		}
	    }
	}
	return new Class207(this, is_269_, is_270_, is_271_, fs);
    }
    
    public abstract boolean method3032();
    
    static void method3033(int i, int i_293_, int i_294_, int i_295_,
			   int i_296_, int i_297_, float[] fs, int i_298_,
			   float f, float[] fs_299_) {
	i -= i_295_;
	i_293_ -= i_296_;
	i_294_ -= i_297_;
	float f_300_ = ((float) i * fs[0] + (float) i_293_ * fs[1]
			+ (float) i_294_ * fs[2]);
	float f_301_ = ((float) i * fs[3] + (float) i_293_ * fs[4]
			+ (float) i_294_ * fs[5]);
	float f_302_ = ((float) i * fs[6] + (float) i_293_ * fs[7]
			+ (float) i_294_ * fs[8]);
	float f_303_
	    = (float) Math.sqrt((double) (f_300_ * f_300_ + f_301_ * f_301_
					  + f_302_ * f_302_));
	float f_304_ = (((float) Math.atan2((double) f_300_, (double) f_302_)
			 / 6.2831855F)
			+ 0.5F);
	float f_305_
	    = ((float) Math.asin((double) (f_301_ / f_303_)) / 3.1415927F
	       + 0.5F + f);
	if (i_298_ == 1) {
	    float f_306_ = f_304_;
	    f_304_ = -f_305_;
	    f_305_ = f_306_;
	} else if (i_298_ == 2) {
	    f_304_ = -f_304_;
	    f_305_ = -f_305_;
	} else if (i_298_ == 3) {
	    float f_307_ = f_304_;
	    f_304_ = f_305_;
	    f_305_ = -f_307_;
	}
	fs_299_[0] = f_304_;
	fs_299_[1] = f_305_;
    }
    
    public abstract int method3034();
    
    public abstract int method3035();
    
    public abstract void method3036(int i);
    
    public abstract int method3037();
    
    public abstract int method3038();
    
    public abstract int method3039();
    
    public abstract int method3040();
    
    public final void method3041
	(Class525_Sub16_Sub18 class525_sub16_sub18, int i,
	 Class525_Sub16_Sub18 class525_sub16_sub18_308_, int i_309_,
	 int i_310_, int i_311_, int i_312_, int i_313_, boolean bool,
	 int[] is) {
	if (i != -1) {
	    method2939();
	    if (!method2947())
		method2940();
	    else {
		AnimationFrame class177
		    = class525_sub16_sub18.aClass177Array11874[i];
		AnimationFrameBase class525_sub14 = class177.base;
		AnimationFrame class177_314_ = null;
		if (class525_sub16_sub18_308_ != null) {
		    class177_314_ = (class525_sub16_sub18_308_
				     .aClass177Array11874[i_309_]);
		    if (class177_314_.base != class525_sub14)
			class177_314_ = null;
		}
		method2945(class525_sub14, class177, class177_314_, i_310_,
			   i_311_, i_312_, null, false, bool, i_313_, is);
		method2942();
		method2940();
	    }
	}
    }
    
    public abstract void method3042(int i);
    
    public abstract void method3043(int i);
    
    public abstract void method3044(int i);
    
    public abstract int method3045();
    
    public abstract int method3046();
    
    public abstract void method3047();
    
    static float[] method3048(int i, int i_315_, int i_316_, int i_317_,
			      float f, float f_318_, float f_319_) {
	float[] fs = new float[9];
	float[] fs_320_ = new float[9];
	float f_321_
	    = (float) Math.cos((double) ((float) i_317_ * 0.024543693F));
	float f_322_
	    = (float) Math.sin((double) ((float) i_317_ * 0.024543693F));
	float f_323_ = 1.0F - f_321_;
	fs[0] = f_321_;
	fs[1] = 0.0F;
	fs[2] = f_322_;
	fs[3] = 0.0F;
	fs[4] = 1.0F;
	fs[5] = 0.0F;
	fs[6] = -f_322_;
	fs[7] = 0.0F;
	fs[8] = f_321_;
	float[] fs_324_ = new float[9];
	float f_325_ = 1.0F;
	float f_326_ = 0.0F;
	f_321_ = (float) i_315_ / 32767.0F;
	f_322_ = -(float) Math.sqrt((double) (1.0F - f_321_ * f_321_));
	f_323_ = 1.0F - f_321_;
	float f_327_ = (float) Math.sqrt((double) (i * i + i_316_ * i_316_));
	if (f_327_ == 0.0F && f_321_ == 0.0F)
	    fs_320_ = fs;
	else {
	    if (f_327_ != 0.0F) {
		f_325_ = (float) -i_316_ / f_327_;
		f_326_ = (float) i / f_327_;
	    }
	    fs_324_[0] = f_321_ + f_325_ * f_325_ * f_323_;
	    fs_324_[1] = f_326_ * f_322_;
	    fs_324_[2] = f_326_ * f_325_ * f_323_;
	    fs_324_[3] = -f_326_ * f_322_;
	    fs_324_[4] = f_321_;
	    fs_324_[5] = f_325_ * f_322_;
	    fs_324_[6] = f_325_ * f_326_ * f_323_;
	    fs_324_[7] = -f_325_ * f_322_;
	    fs_324_[8] = f_321_ + f_326_ * f_326_ * f_323_;
	    fs_320_[0]
		= fs[0] * fs_324_[0] + fs[1] * fs_324_[3] + fs[2] * fs_324_[6];
	    fs_320_[1]
		= fs[0] * fs_324_[1] + fs[1] * fs_324_[4] + fs[2] * fs_324_[7];
	    fs_320_[2]
		= fs[0] * fs_324_[2] + fs[1] * fs_324_[5] + fs[2] * fs_324_[8];
	    fs_320_[3]
		= fs[3] * fs_324_[0] + fs[4] * fs_324_[3] + fs[5] * fs_324_[6];
	    fs_320_[4]
		= fs[3] * fs_324_[1] + fs[4] * fs_324_[4] + fs[5] * fs_324_[7];
	    fs_320_[5]
		= fs[3] * fs_324_[2] + fs[4] * fs_324_[5] + fs[5] * fs_324_[8];
	    fs_320_[6]
		= fs[6] * fs_324_[0] + fs[7] * fs_324_[3] + fs[8] * fs_324_[6];
	    fs_320_[7]
		= fs[6] * fs_324_[1] + fs[7] * fs_324_[4] + fs[8] * fs_324_[7];
	    fs_320_[8]
		= fs[6] * fs_324_[2] + fs[7] * fs_324_[5] + fs[8] * fs_324_[8];
	}
	fs_320_[0] *= f;
	fs_320_[1] *= f;
	fs_320_[2] *= f;
	fs_320_[3] *= f_318_;
	fs_320_[4] *= f_318_;
	fs_320_[5] *= f_318_;
	fs_320_[6] *= f_319_;
	fs_320_[7] *= f_319_;
	fs_320_[8] *= f_319_;
	return fs_320_;
    }
    
    public abstract int method3049();
    
    public abstract byte[] method3050();
    
    public abstract int method3051();
    
    public abstract void method3052(short i, short i_328_);
    
    public abstract int method3053();
    
    public abstract void method3054(short i, short i_329_);
    
    public abstract void method3055(byte i, byte[] is);
    
    public abstract void method3056(byte i, byte[] is);
    
    void method3057(AnimationFrameBase class525_sub14, AnimationFrame class177,
					AnimationFrame class177_330_, int i, int i_331_, int i_332_,
					boolean[] bools, boolean bool, boolean bool_333_,
					int i_334_, int[] is) {
	if (class177_330_ == null || i == 0) {
	    for (int i_335_ = 0; i_335_ < class177.transformationCount; i_335_++) {
		short i_336_ = class177.transformationIndices[i_335_];
		if (bools == null || bools[i_336_] == bool
		    || class525_sub14.transformationTypes[i_336_] == 0) {
		    short i_337_ = class177.skippedRefrences[i_335_];
		    if (i_337_ != -1)
			method2987(0,
				   class525_sub14.labels[i_337_],
				   0, 0, 0, i_332_, bool_333_,
				   (i_334_
				    & class525_sub14.anIntArray10545[i_337_]),
				   is);
		    method2987(class525_sub14.transformationTypes[i_336_],
			       class525_sub14.labels[i_336_],
			       class177.transformationX[i_335_],
			       class177.transformationY[i_335_],
			       class177.transformationZ[i_335_], i_332_,
			       bool_333_,
			       i_334_ & class525_sub14.anIntArray10545[i_336_],
			       is);
		}
	    }
	} else {
	    int i_338_ = 0;
	    int i_339_ = 0;
	    for (int i_340_ = 0;
			 i_340_ < class525_sub14.count * -92709391; i_340_++) {
		boolean bool_341_ = false;
		if (i_338_ < class177.transformationCount
		    && class177.transformationIndices[i_338_] == i_340_)
		    bool_341_ = true;
		boolean bool_342_ = false;
		if (i_339_ < class177_330_.transformationCount
		    && class177_330_.transformationIndices[i_339_] == i_340_)
		    bool_342_ = true;
		if (bool_341_ || bool_342_) {
		    if (bools != null && bools[i_340_] != bool
			&& class525_sub14.transformationTypes[i_340_] != 0) {
			if (bool_341_)
			    i_338_++;
			if (bool_342_)
			    i_339_++;
		    } else {
			int i_343_ = 0;
			int i_344_ = class525_sub14.transformationTypes[i_340_];
			if (i_344_ == 3 || i_344_ == 10)
			    i_343_ = 128;
			int i_345_;
			int i_346_;
			int i_347_;
			short i_348_;
			byte i_349_;
			if (bool_341_) {
			    i_345_ = class177.transformationX[i_338_];
			    i_346_ = class177.transformationY[i_338_];
			    i_347_ = class177.transformationZ[i_338_];
			    i_348_ = class177.skippedRefrences[i_338_];
			    i_349_ = class177.transformationFlags[i_338_];
			    i_338_++;
			} else {
			    i_345_ = i_343_;
			    i_346_ = i_343_;
			    i_347_ = i_343_;
			    i_348_ = (short) -1;
			    i_349_ = (byte) 0;
			}
			int i_350_;
			int i_351_;
			int i_352_;
			short i_353_;
			byte i_354_;
			if (bool_342_) {
			    i_350_ = class177_330_.transformationX[i_339_];
			    i_351_ = class177_330_.transformationY[i_339_];
			    i_352_ = class177_330_.transformationZ[i_339_];
			    i_353_ = class177_330_.skippedRefrences[i_339_];
			    i_354_ = class177_330_.transformationFlags[i_339_];
			    i_339_++;
			} else {
			    i_350_ = i_343_;
			    i_351_ = i_343_;
			    i_352_ = i_343_;
			    i_353_ = (short) -1;
			    i_354_ = (byte) 0;
			}
			int i_355_;
			int i_356_;
			int i_357_;
			if ((i_349_ & 0x2) != 0 || (i_354_ & 0x1) != 0) {
			    i_355_ = i_345_;
			    i_356_ = i_346_;
			    i_357_ = i_347_;
			} else if (i_344_ == 2) {
			    int i_358_ = i_350_ - i_345_ & 0x3fff;
			    int i_359_ = i_351_ - i_346_ & 0x3fff;
			    int i_360_ = i_352_ - i_347_ & 0x3fff;
			    if (i_358_ >= 8192)
				i_358_ -= 16384;
			    if (i_359_ >= 8192)
				i_359_ -= 16384;
			    if (i_360_ >= 8192)
				i_360_ -= 16384;
			    i_355_ = i_345_ + i_358_ * i / i_331_ & 0x3fff;
			    i_356_ = i_346_ + i_359_ * i / i_331_ & 0x3fff;
			    i_357_ = i_347_ + i_360_ * i / i_331_ & 0x3fff;
			} else if (i_344_ == 9) {
			    int i_361_ = i_350_ - i_345_ & 0x3fff;
			    if (i_361_ >= 8192)
				i_361_ -= 16384;
			    i_355_ = i_345_ + i_361_ * i / i_331_ & 0x3fff;
			    i_357_ = 0;
			    i_356_ = 0;
			} else if (i_344_ == 7) {
			    int i_362_ = i_350_ - i_345_ & 0x3f;
			    if (i_362_ >= 32)
				i_362_ -= 64;
			    i_355_ = i_345_ + i_362_ * i / i_331_ & 0x3f;
			    i_356_ = i_346_ + (i_351_ - i_346_) * i / i_331_;
			    i_357_ = i_347_ + (i_352_ - i_347_) * i / i_331_;
			} else {
			    i_355_ = i_345_ + (i_350_ - i_345_) * i / i_331_;
			    i_356_ = i_346_ + (i_351_ - i_346_) * i / i_331_;
			    i_357_ = i_347_ + (i_352_ - i_347_) * i / i_331_;
			}
			if (i_348_ != -1)
			    method2987(0,
				       (class525_sub14.labels
					[i_348_]),
				       0, 0, 0, i_332_, bool_333_,
				       i_334_ & (class525_sub14.anIntArray10545
						 [i_348_]),
				       is);
			else if (i_353_ != -1)
			    method2987(0,
				       (class525_sub14.labels
					[i_353_]),
				       0, 0, 0, i_332_, bool_333_,
				       i_334_ & (class525_sub14.anIntArray10545
						 [i_353_]),
				       is);
			method2987(i_344_,
				   class525_sub14.labels[i_340_],
				   i_355_, i_356_, i_357_, i_332_, bool_333_,
				   (i_334_
				    & class525_sub14.anIntArray10545[i_340_]),
				   is);
		    }
		}
	    }
	}
    }
    
    public abstract void method3058(short i, short i_363_);
    
    public abstract void method3059(short i, short i_364_);
    
    public abstract Class184[] method3060();
    
    public abstract void method3061(Class444 class444, Class211 class211,
				    int i);
    
    public abstract void method3062(int i);
    
    public abstract MagnetConfig[] method3063();
    
    public abstract MagnetConfig[] method3064();
    
    public abstract int method3065();
    
    public abstract boolean method3066();
    
    public abstract boolean method3067();
    
    public abstract void method3068(Class179 class179_365_, int i, int i_366_,
				    int i_367_, boolean bool);
    
    public abstract boolean method3069(int i, int i_368_, Class444 class444,
				       boolean bool, int i_369_);
    
    public abstract void method3070(int i, int i_370_, int i_371_);
    
    static void method3071(int i, int i_372_, int i_373_, int i_374_,
			   int i_375_, int i_376_, float[] fs, float f,
			   int i_377_, float f_378_, float[] fs_379_) {
	i -= i_374_;
	i_372_ -= i_375_;
	i_373_ -= i_376_;
	float f_380_ = ((float) i * fs[0] + (float) i_372_ * fs[1]
			+ (float) i_373_ * fs[2]);
	float f_381_ = ((float) i * fs[3] + (float) i_372_ * fs[4]
			+ (float) i_373_ * fs[5]);
	float f_382_ = ((float) i * fs[6] + (float) i_372_ * fs[7]
			+ (float) i_373_ * fs[8]);
	float f_383_ = (((float) Math.atan2((double) f_380_, (double) f_382_)
			 / 6.2831855F)
			+ 0.5F);
	if (f != 1.0F)
	    f_383_ *= f;
	float f_384_ = f_381_ + 0.5F + f_378_;
	if (i_377_ == 1) {
	    float f_385_ = f_383_;
	    f_383_ = -f_384_;
	    f_384_ = f_385_;
	} else if (i_377_ == 2) {
	    f_383_ = -f_383_;
	    f_384_ = -f_384_;
	} else if (i_377_ == 3) {
	    float f_386_ = f_383_;
	    f_383_ = f_384_;
	    f_384_ = -f_386_;
	}
	fs_379_[0] = f_383_;
	fs_379_[1] = f_384_;
    }
    
    public abstract void method3072();
    
    public abstract void method3073(int i, int i_387_, Class161 class161,
				    Class161 class161_388_, int i_389_,
				    int i_390_, int i_391_);
    
    public abstract void method3074();
    
    public abstract int method3075();
    
    public abstract int method3076();
    
    public abstract int method3077();
    
    public abstract int method3078();
    
    public abstract boolean method3079();
    
    public abstract int method3080();
    
    public abstract int method3081();
    
    public abstract int method3082();
    
    public abstract void method3083(Class444 class444, int i, boolean bool);
    
    public abstract void method3084(int i);
    
    public abstract MagnetConfig[] method3085();
    
    static void method3086(int i, int i_392_, int i_393_, int i_394_,
			   int i_395_, int i_396_, float[] fs, int i_397_,
			   float f, float[] fs_398_) {
	i -= i_394_;
	i_392_ -= i_395_;
	i_393_ -= i_396_;
	float f_399_ = ((float) i * fs[0] + (float) i_392_ * fs[1]
			+ (float) i_393_ * fs[2]);
	float f_400_ = ((float) i * fs[3] + (float) i_392_ * fs[4]
			+ (float) i_393_ * fs[5]);
	float f_401_ = ((float) i * fs[6] + (float) i_392_ * fs[7]
			+ (float) i_393_ * fs[8]);
	float f_402_
	    = (float) Math.sqrt((double) (f_399_ * f_399_ + f_400_ * f_400_
					  + f_401_ * f_401_));
	float f_403_ = (((float) Math.atan2((double) f_399_, (double) f_401_)
			 / 6.2831855F)
			+ 0.5F);
	float f_404_
	    = ((float) Math.asin((double) (f_400_ / f_402_)) / 3.1415927F
	       + 0.5F + f);
	if (i_397_ == 1) {
	    float f_405_ = f_403_;
	    f_403_ = -f_404_;
	    f_404_ = f_405_;
	} else if (i_397_ == 2) {
	    f_403_ = -f_403_;
	    f_404_ = -f_404_;
	} else if (i_397_ == 3) {
	    float f_406_ = f_403_;
	    f_403_ = f_404_;
	    f_404_ = -f_406_;
	}
	fs_398_[0] = f_403_;
	fs_398_[1] = f_404_;
    }
    
    static void method3087(int i, int i_407_, int i_408_, int i_409_,
			   int i_410_, int i_411_, float[] fs, int i_412_,
			   float f, float[] fs_413_) {
	i -= i_409_;
	i_407_ -= i_410_;
	i_408_ -= i_411_;
	float f_414_ = ((float) i * fs[0] + (float) i_407_ * fs[1]
			+ (float) i_408_ * fs[2]);
	float f_415_ = ((float) i * fs[3] + (float) i_407_ * fs[4]
			+ (float) i_408_ * fs[5]);
	float f_416_ = ((float) i * fs[6] + (float) i_407_ * fs[7]
			+ (float) i_408_ * fs[8]);
	float f_417_
	    = (float) Math.sqrt((double) (f_414_ * f_414_ + f_415_ * f_415_
					  + f_416_ * f_416_));
	float f_418_ = (((float) Math.atan2((double) f_414_, (double) f_416_)
			 / 6.2831855F)
			+ 0.5F);
	float f_419_
	    = ((float) Math.asin((double) (f_415_ / f_417_)) / 3.1415927F
	       + 0.5F + f);
	if (i_412_ == 1) {
	    float f_420_ = f_418_;
	    f_418_ = -f_419_;
	    f_419_ = f_420_;
	} else if (i_412_ == 2) {
	    f_418_ = -f_418_;
	    f_419_ = -f_419_;
	} else if (i_412_ == 3) {
	    float f_421_ = f_418_;
	    f_418_ = f_419_;
	    f_419_ = -f_421_;
	}
	fs_413_[0] = f_418_;
	fs_413_[1] = f_419_;
    }
    
    static void method3088(int i, int i_422_, int i_423_, int i_424_,
			   int i_425_, int i_426_, float[] fs, int i_427_,
			   float f, float[] fs_428_) {
	i -= i_424_;
	i_422_ -= i_425_;
	i_423_ -= i_426_;
	float f_429_ = ((float) i * fs[0] + (float) i_422_ * fs[1]
			+ (float) i_423_ * fs[2]);
	float f_430_ = ((float) i * fs[3] + (float) i_422_ * fs[4]
			+ (float) i_423_ * fs[5]);
	float f_431_ = ((float) i * fs[6] + (float) i_422_ * fs[7]
			+ (float) i_423_ * fs[8]);
	float f_432_
	    = (float) Math.sqrt((double) (f_429_ * f_429_ + f_430_ * f_430_
					  + f_431_ * f_431_));
	float f_433_ = (((float) Math.atan2((double) f_429_, (double) f_431_)
			 / 6.2831855F)
			+ 0.5F);
	float f_434_
	    = ((float) Math.asin((double) (f_430_ / f_432_)) / 3.1415927F
	       + 0.5F + f);
	if (i_427_ == 1) {
	    float f_435_ = f_433_;
	    f_433_ = -f_434_;
	    f_434_ = f_435_;
	} else if (i_427_ == 2) {
	    f_433_ = -f_433_;
	    f_434_ = -f_434_;
	} else if (i_427_ == 3) {
	    float f_436_ = f_433_;
	    f_433_ = f_434_;
	    f_434_ = -f_436_;
	}
	fs_428_[0] = f_433_;
	fs_428_[1] = f_434_;
    }
    
    static void method3089(int i, int i_437_, int i_438_, int i_439_,
			   int i_440_, int i_441_, float[] fs, int i_442_,
			   float f, float[] fs_443_) {
	i -= i_439_;
	i_437_ -= i_440_;
	i_438_ -= i_441_;
	float f_444_ = ((float) i * fs[0] + (float) i_437_ * fs[1]
			+ (float) i_438_ * fs[2]);
	float f_445_ = ((float) i * fs[3] + (float) i_437_ * fs[4]
			+ (float) i_438_ * fs[5]);
	float f_446_ = ((float) i * fs[6] + (float) i_437_ * fs[7]
			+ (float) i_438_ * fs[8]);
	float f_447_
	    = (float) Math.sqrt((double) (f_444_ * f_444_ + f_445_ * f_445_
					  + f_446_ * f_446_));
	float f_448_ = (((float) Math.atan2((double) f_444_, (double) f_446_)
			 / 6.2831855F)
			+ 0.5F);
	float f_449_
	    = ((float) Math.asin((double) (f_445_ / f_447_)) / 3.1415927F
	       + 0.5F + f);
	if (i_442_ == 1) {
	    float f_450_ = f_448_;
	    f_448_ = -f_449_;
	    f_449_ = f_450_;
	} else if (i_442_ == 2) {
	    f_448_ = -f_448_;
	    f_449_ = -f_449_;
	} else if (i_442_ == 3) {
	    float f_451_ = f_448_;
	    f_448_ = f_449_;
	    f_449_ = -f_451_;
	}
	fs_443_[0] = f_448_;
	fs_443_[1] = f_449_;
    }
    
    static void method3090(int i, int i_452_, int i_453_, int i_454_,
			   int i_455_, int i_456_, float[] fs, int i_457_,
			   float f, float[] fs_458_) {
	i -= i_454_;
	i_452_ -= i_455_;
	i_453_ -= i_456_;
	float f_459_ = ((float) i * fs[0] + (float) i_452_ * fs[1]
			+ (float) i_453_ * fs[2]);
	float f_460_ = ((float) i * fs[3] + (float) i_452_ * fs[4]
			+ (float) i_453_ * fs[5]);
	float f_461_ = ((float) i * fs[6] + (float) i_452_ * fs[7]
			+ (float) i_453_ * fs[8]);
	float f_462_
	    = (float) Math.sqrt((double) (f_459_ * f_459_ + f_460_ * f_460_
					  + f_461_ * f_461_));
	float f_463_ = (((float) Math.atan2((double) f_459_, (double) f_461_)
			 / 6.2831855F)
			+ 0.5F);
	float f_464_
	    = ((float) Math.asin((double) (f_460_ / f_462_)) / 3.1415927F
	       + 0.5F + f);
	if (i_457_ == 1) {
	    float f_465_ = f_463_;
	    f_463_ = -f_464_;
	    f_464_ = f_465_;
	} else if (i_457_ == 2) {
	    f_463_ = -f_463_;
	    f_464_ = -f_464_;
	} else if (i_457_ == 3) {
	    float f_466_ = f_463_;
	    f_463_ = f_464_;
	    f_464_ = -f_466_;
	}
	fs_458_[0] = f_463_;
	fs_458_[1] = f_464_;
    }
    
    public abstract int method3091();
    
    public abstract void method3092();
    
    public abstract int method3093();
    
    static void method3094(int i, int i_467_, int i_468_, int i_469_,
			   int i_470_, int i_471_, int i_472_, float[] fs,
			   int i_473_, float f, float f_474_, float f_475_,
			   float[] fs_476_) {
	i -= i_469_;
	i_467_ -= i_470_;
	i_468_ -= i_471_;
	float f_477_ = ((float) i * fs[0] + (float) i_467_ * fs[1]
			+ (float) i_468_ * fs[2]);
	float f_478_ = ((float) i * fs[3] + (float) i_467_ * fs[4]
			+ (float) i_468_ * fs[5]);
	float f_479_ = ((float) i * fs[6] + (float) i_467_ * fs[7]
			+ (float) i_468_ * fs[8]);
	float f_480_;
	float f_481_;
	if (i_472_ == 0) {
	    f_480_ = f_477_ + f + 0.5F;
	    f_481_ = -f_479_ + f_475_ + 0.5F;
	} else if (i_472_ == 1) {
	    f_480_ = f_477_ + f + 0.5F;
	    f_481_ = f_479_ + f_475_ + 0.5F;
	} else if (i_472_ == 2) {
	    f_480_ = -f_477_ + f + 0.5F;
	    f_481_ = -f_478_ + f_474_ + 0.5F;
	} else if (i_472_ == 3) {
	    f_480_ = f_477_ + f + 0.5F;
	    f_481_ = -f_478_ + f_474_ + 0.5F;
	} else if (i_472_ == 4) {
	    f_480_ = f_479_ + f_475_ + 0.5F;
	    f_481_ = -f_478_ + f_474_ + 0.5F;
	} else {
	    f_480_ = -f_479_ + f_475_ + 0.5F;
	    f_481_ = -f_478_ + f_474_ + 0.5F;
	}
	if (i_473_ == 1) {
	    float f_482_ = f_480_;
	    f_480_ = -f_481_;
	    f_481_ = f_482_;
	} else if (i_473_ == 2) {
	    f_480_ = -f_480_;
	    f_481_ = -f_481_;
	} else if (i_473_ == 3) {
	    float f_483_ = f_480_;
	    f_480_ = f_481_;
	    f_481_ = -f_483_;
	}
	fs_476_[0] = f_480_;
	fs_476_[1] = f_481_;
    }
    
    public abstract void method3095(int i);
    
    Class207 method3096(ModelDecoder class186, int[] is, int i) {
	int[] is_484_ = null;
	int[] is_485_ = null;
	int[] is_486_ = null;
	float[][] fs = null;
	if (class186.aShortArray2122 != null) {
	    int i_487_ = class186.texturedFaceCount;
	    int[] is_488_ = new int[i_487_];
	    int[] is_489_ = new int[i_487_];
	    int[] is_490_ = new int[i_487_];
	    int[] is_491_ = new int[i_487_];
	    int[] is_492_ = new int[i_487_];
	    int[] is_493_ = new int[i_487_];
	    for (int i_494_ = 0; i_494_ < i_487_; i_494_++) {
		is_488_[i_494_] = 2147483647;
		is_489_[i_494_] = -2147483647;
		is_490_[i_494_] = 2147483647;
		is_491_[i_494_] = -2147483647;
		is_492_[i_494_] = 2147483647;
		is_493_[i_494_] = -2147483647;
	    }
	    for (int i_495_ = 0; i_495_ < i; i_495_++) {
		int i_496_ = is[i_495_];
		short i_497_ = class186.aShortArray2122[i_496_];
		if (i_497_ > -1 && i_497_ < 32766) {
		    for (int i_498_ = 0; i_498_ < 3; i_498_++) {
			short i_499_;
			if (i_498_ == 0)
			    i_499_ = class186.faceA[i_496_];
			else if (i_498_ == 1)
			    i_499_ = class186.faceB[i_496_];
			else
			    i_499_ = class186.faceC[i_496_];
			int i_500_ = class186.vertexX[i_499_];
			int i_501_ = class186.vertexY[i_499_];
			int i_502_ = class186.vertexZ[i_499_];
			if (i_500_ < is_488_[i_497_])
			    is_488_[i_497_] = i_500_;
			if (i_500_ > is_489_[i_497_])
			    is_489_[i_497_] = i_500_;
			if (i_501_ < is_490_[i_497_])
			    is_490_[i_497_] = i_501_;
			if (i_501_ > is_491_[i_497_])
			    is_491_[i_497_] = i_501_;
			if (i_502_ < is_492_[i_497_])
			    is_492_[i_497_] = i_502_;
			if (i_502_ > is_493_[i_497_])
			    is_493_[i_497_] = i_502_;
		    }
		}
	    }
	    is_484_ = new int[i_487_];
	    is_485_ = new int[i_487_];
	    is_486_ = new int[i_487_];
	    fs = new float[i_487_][];
	    for (int i_503_ = 0; i_503_ < i_487_; i_503_++) {
		byte i_504_ = class186.textureRenderTypes[i_503_];
		if (i_504_ > 0) {
		    is_484_[i_503_] = (is_488_[i_503_] + is_489_[i_503_]) / 2;
		    is_485_[i_503_] = (is_490_[i_503_] + is_491_[i_503_]) / 2;
		    is_486_[i_503_] = (is_492_[i_503_] + is_493_[i_503_]) / 2;
		    float f;
		    float f_505_;
		    float f_506_;
		    if (i_504_ == 1) {
			int i_507_ = class186.anIntArray2121[i_503_];
			if (i_507_ == 0) {
			    f = 1.0F;
			    f_506_ = 1.0F;
			} else if (i_507_ > 0) {
			    f = 1.0F;
			    f_506_ = (float) i_507_ / 1024.0F;
			} else {
			    f_506_ = 1.0F;
			    f = (float) -i_507_ / 1024.0F;
			}
			f_505_
			    = 64.0F / (float) class186.anIntArray2114[i_503_];
		    } else if (i_504_ == 2) {
			f = 64.0F / (float) class186.anIntArray2121[i_503_];
			f_505_
			    = 64.0F / (float) class186.anIntArray2114[i_503_];
			f_506_
			    = 64.0F / (float) class186.anIntArray2123[i_503_];
		    } else {
			f = (float) class186.anIntArray2121[i_503_] / 1024.0F;
			f_505_ = ((float) class186.anIntArray2114[i_503_]
				  / 1024.0F);
			f_506_ = ((float) class186.anIntArray2123[i_503_]
				  / 1024.0F);
		    }
		    fs[i_503_]
			= method2925(class186.aShortArray2118[i_503_],
				     class186.aShortArray2119[i_503_],
				     class186.aShortArray2120[i_503_],
				     class186.aByteArray2127[i_503_] & 0xff, f,
				     f_505_, f_506_);
		}
	    }
	}
	return new Class207(this, is_484_, is_485_, is_486_, fs);
    }
    
    public abstract void method3097(byte i, byte[] is);
    
    Class207 method3098(ModelDecoder class186, int[] is, int i) {
	int[] is_508_ = null;
	int[] is_509_ = null;
	int[] is_510_ = null;
	float[][] fs = null;
	if (class186.aShortArray2122 != null) {
	    int i_511_ = class186.texturedFaceCount;
	    int[] is_512_ = new int[i_511_];
	    int[] is_513_ = new int[i_511_];
	    int[] is_514_ = new int[i_511_];
	    int[] is_515_ = new int[i_511_];
	    int[] is_516_ = new int[i_511_];
	    int[] is_517_ = new int[i_511_];
	    for (int i_518_ = 0; i_518_ < i_511_; i_518_++) {
		is_512_[i_518_] = 2147483647;
		is_513_[i_518_] = -2147483647;
		is_514_[i_518_] = 2147483647;
		is_515_[i_518_] = -2147483647;
		is_516_[i_518_] = 2147483647;
		is_517_[i_518_] = -2147483647;
	    }
	    for (int i_519_ = 0; i_519_ < i; i_519_++) {
		int i_520_ = is[i_519_];
		short i_521_ = class186.aShortArray2122[i_520_];
		if (i_521_ > -1 && i_521_ < 32766) {
		    for (int i_522_ = 0; i_522_ < 3; i_522_++) {
			short i_523_;
			if (i_522_ == 0)
			    i_523_ = class186.faceA[i_520_];
			else if (i_522_ == 1)
			    i_523_ = class186.faceB[i_520_];
			else
			    i_523_ = class186.faceC[i_520_];
			int i_524_ = class186.vertexX[i_523_];
			int i_525_ = class186.vertexY[i_523_];
			int i_526_ = class186.vertexZ[i_523_];
			if (i_524_ < is_512_[i_521_])
			    is_512_[i_521_] = i_524_;
			if (i_524_ > is_513_[i_521_])
			    is_513_[i_521_] = i_524_;
			if (i_525_ < is_514_[i_521_])
			    is_514_[i_521_] = i_525_;
			if (i_525_ > is_515_[i_521_])
			    is_515_[i_521_] = i_525_;
			if (i_526_ < is_516_[i_521_])
			    is_516_[i_521_] = i_526_;
			if (i_526_ > is_517_[i_521_])
			    is_517_[i_521_] = i_526_;
		    }
		}
	    }
	    is_508_ = new int[i_511_];
	    is_509_ = new int[i_511_];
	    is_510_ = new int[i_511_];
	    fs = new float[i_511_][];
	    for (int i_527_ = 0; i_527_ < i_511_; i_527_++) {
		byte i_528_ = class186.textureRenderTypes[i_527_];
		if (i_528_ > 0) {
		    is_508_[i_527_] = (is_512_[i_527_] + is_513_[i_527_]) / 2;
		    is_509_[i_527_] = (is_514_[i_527_] + is_515_[i_527_]) / 2;
		    is_510_[i_527_] = (is_516_[i_527_] + is_517_[i_527_]) / 2;
		    float f;
		    float f_529_;
		    float f_530_;
		    if (i_528_ == 1) {
			int i_531_ = class186.anIntArray2121[i_527_];
			if (i_531_ == 0) {
			    f = 1.0F;
			    f_530_ = 1.0F;
			} else if (i_531_ > 0) {
			    f = 1.0F;
			    f_530_ = (float) i_531_ / 1024.0F;
			} else {
			    f_530_ = 1.0F;
			    f = (float) -i_531_ / 1024.0F;
			}
			f_529_
			    = 64.0F / (float) class186.anIntArray2114[i_527_];
		    } else if (i_528_ == 2) {
			f = 64.0F / (float) class186.anIntArray2121[i_527_];
			f_529_
			    = 64.0F / (float) class186.anIntArray2114[i_527_];
			f_530_
			    = 64.0F / (float) class186.anIntArray2123[i_527_];
		    } else {
			f = (float) class186.anIntArray2121[i_527_] / 1024.0F;
			f_529_ = ((float) class186.anIntArray2114[i_527_]
				  / 1024.0F);
			f_530_ = ((float) class186.anIntArray2123[i_527_]
				  / 1024.0F);
		    }
		    fs[i_527_]
			= method2925(class186.aShortArray2118[i_527_],
				     class186.aShortArray2119[i_527_],
				     class186.aShortArray2120[i_527_],
				     class186.aByteArray2127[i_527_] & 0xff, f,
				     f_529_, f_530_);
		}
	    }
	}
	return new Class207(this, is_508_, is_509_, is_510_, fs);
    }
    
    Class207 method3099(ModelDecoder class186, int[] is, int i) {
	int[] is_532_ = null;
	int[] is_533_ = null;
	int[] is_534_ = null;
	float[][] fs = null;
	if (class186.aShortArray2122 != null) {
	    int i_535_ = class186.texturedFaceCount;
	    int[] is_536_ = new int[i_535_];
	    int[] is_537_ = new int[i_535_];
	    int[] is_538_ = new int[i_535_];
	    int[] is_539_ = new int[i_535_];
	    int[] is_540_ = new int[i_535_];
	    int[] is_541_ = new int[i_535_];
	    for (int i_542_ = 0; i_542_ < i_535_; i_542_++) {
		is_536_[i_542_] = 2147483647;
		is_537_[i_542_] = -2147483647;
		is_538_[i_542_] = 2147483647;
		is_539_[i_542_] = -2147483647;
		is_540_[i_542_] = 2147483647;
		is_541_[i_542_] = -2147483647;
	    }
	    for (int i_543_ = 0; i_543_ < i; i_543_++) {
		int i_544_ = is[i_543_];
		short i_545_ = class186.aShortArray2122[i_544_];
		if (i_545_ > -1 && i_545_ < 32766) {
		    for (int i_546_ = 0; i_546_ < 3; i_546_++) {
			short i_547_;
			if (i_546_ == 0)
			    i_547_ = class186.faceA[i_544_];
			else if (i_546_ == 1)
			    i_547_ = class186.faceB[i_544_];
			else
			    i_547_ = class186.faceC[i_544_];
			int i_548_ = class186.vertexX[i_547_];
			int i_549_ = class186.vertexY[i_547_];
			int i_550_ = class186.vertexZ[i_547_];
			if (i_548_ < is_536_[i_545_])
			    is_536_[i_545_] = i_548_;
			if (i_548_ > is_537_[i_545_])
			    is_537_[i_545_] = i_548_;
			if (i_549_ < is_538_[i_545_])
			    is_538_[i_545_] = i_549_;
			if (i_549_ > is_539_[i_545_])
			    is_539_[i_545_] = i_549_;
			if (i_550_ < is_540_[i_545_])
			    is_540_[i_545_] = i_550_;
			if (i_550_ > is_541_[i_545_])
			    is_541_[i_545_] = i_550_;
		    }
		}
	    }
	    is_532_ = new int[i_535_];
	    is_533_ = new int[i_535_];
	    is_534_ = new int[i_535_];
	    fs = new float[i_535_][];
	    for (int i_551_ = 0; i_551_ < i_535_; i_551_++) {
		byte i_552_ = class186.textureRenderTypes[i_551_];
		if (i_552_ > 0) {
		    is_532_[i_551_] = (is_536_[i_551_] + is_537_[i_551_]) / 2;
		    is_533_[i_551_] = (is_538_[i_551_] + is_539_[i_551_]) / 2;
		    is_534_[i_551_] = (is_540_[i_551_] + is_541_[i_551_]) / 2;
		    float f;
		    float f_553_;
		    float f_554_;
		    if (i_552_ == 1) {
			int i_555_ = class186.anIntArray2121[i_551_];
			if (i_555_ == 0) {
			    f = 1.0F;
			    f_554_ = 1.0F;
			} else if (i_555_ > 0) {
			    f = 1.0F;
			    f_554_ = (float) i_555_ / 1024.0F;
			} else {
			    f_554_ = 1.0F;
			    f = (float) -i_555_ / 1024.0F;
			}
			f_553_
			    = 64.0F / (float) class186.anIntArray2114[i_551_];
		    } else if (i_552_ == 2) {
			f = 64.0F / (float) class186.anIntArray2121[i_551_];
			f_553_
			    = 64.0F / (float) class186.anIntArray2114[i_551_];
			f_554_
			    = 64.0F / (float) class186.anIntArray2123[i_551_];
		    } else {
			f = (float) class186.anIntArray2121[i_551_] / 1024.0F;
			f_553_ = ((float) class186.anIntArray2114[i_551_]
				  / 1024.0F);
			f_554_ = ((float) class186.anIntArray2123[i_551_]
				  / 1024.0F);
		    }
		    fs[i_551_]
			= method2925(class186.aShortArray2118[i_551_],
				     class186.aShortArray2119[i_551_],
				     class186.aShortArray2120[i_551_],
				     class186.aByteArray2127[i_551_] & 0xff, f,
				     f_553_, f_554_);
		}
	    }
	}
	return new Class207(this, is_532_, is_533_, is_534_, fs);
    }
    
    static float[] method3100(int i, int i_556_, int i_557_, int i_558_,
			      float f, float f_559_, float f_560_) {
	float[] fs = new float[9];
	float[] fs_561_ = new float[9];
	float f_562_
	    = (float) Math.cos((double) ((float) i_558_ * 0.024543693F));
	float f_563_
	    = (float) Math.sin((double) ((float) i_558_ * 0.024543693F));
	float f_564_ = 1.0F - f_562_;
	fs[0] = f_562_;
	fs[1] = 0.0F;
	fs[2] = f_563_;
	fs[3] = 0.0F;
	fs[4] = 1.0F;
	fs[5] = 0.0F;
	fs[6] = -f_563_;
	fs[7] = 0.0F;
	fs[8] = f_562_;
	float[] fs_565_ = new float[9];
	float f_566_ = 1.0F;
	float f_567_ = 0.0F;
	f_562_ = (float) i_556_ / 32767.0F;
	f_563_ = -(float) Math.sqrt((double) (1.0F - f_562_ * f_562_));
	f_564_ = 1.0F - f_562_;
	float f_568_ = (float) Math.sqrt((double) (i * i + i_557_ * i_557_));
	if (f_568_ == 0.0F && f_562_ == 0.0F)
	    fs_561_ = fs;
	else {
	    if (f_568_ != 0.0F) {
		f_566_ = (float) -i_557_ / f_568_;
		f_567_ = (float) i / f_568_;
	    }
	    fs_565_[0] = f_562_ + f_566_ * f_566_ * f_564_;
	    fs_565_[1] = f_567_ * f_563_;
	    fs_565_[2] = f_567_ * f_566_ * f_564_;
	    fs_565_[3] = -f_567_ * f_563_;
	    fs_565_[4] = f_562_;
	    fs_565_[5] = f_566_ * f_563_;
	    fs_565_[6] = f_566_ * f_567_ * f_564_;
	    fs_565_[7] = -f_566_ * f_563_;
	    fs_565_[8] = f_562_ + f_567_ * f_567_ * f_564_;
	    fs_561_[0]
		= fs[0] * fs_565_[0] + fs[1] * fs_565_[3] + fs[2] * fs_565_[6];
	    fs_561_[1]
		= fs[0] * fs_565_[1] + fs[1] * fs_565_[4] + fs[2] * fs_565_[7];
	    fs_561_[2]
		= fs[0] * fs_565_[2] + fs[1] * fs_565_[5] + fs[2] * fs_565_[8];
	    fs_561_[3]
		= fs[3] * fs_565_[0] + fs[4] * fs_565_[3] + fs[5] * fs_565_[6];
	    fs_561_[4]
		= fs[3] * fs_565_[1] + fs[4] * fs_565_[4] + fs[5] * fs_565_[7];
	    fs_561_[5]
		= fs[3] * fs_565_[2] + fs[4] * fs_565_[5] + fs[5] * fs_565_[8];
	    fs_561_[6]
		= fs[6] * fs_565_[0] + fs[7] * fs_565_[3] + fs[8] * fs_565_[6];
	    fs_561_[7]
		= fs[6] * fs_565_[1] + fs[7] * fs_565_[4] + fs[8] * fs_565_[7];
	    fs_561_[8]
		= fs[6] * fs_565_[2] + fs[7] * fs_565_[5] + fs[8] * fs_565_[8];
	}
	fs_561_[0] *= f;
	fs_561_[1] *= f;
	fs_561_[2] *= f;
	fs_561_[3] *= f_559_;
	fs_561_[4] *= f_559_;
	fs_561_[5] *= f_559_;
	fs_561_[6] *= f_560_;
	fs_561_[7] *= f_560_;
	fs_561_[8] *= f_560_;
	return fs_561_;
    }
    
    public abstract void method3101(int i);
    
    public abstract void method3102(int i, int i_569_, int i_570_);
    
    void method3103(Class161 class161, int i, int i_571_, int i_572_,
		    int i_573_, int i_574_, int i_575_, int i_576_) {
	boolean bool = false;
	boolean bool_577_ = false;
	boolean bool_578_ = false;
	int i_579_ = -i_573_ / 2;
	int i_580_ = -i_574_ / 2;
	int i_581_
	    = class161.method2588(i + i_579_, i_572_ + i_580_, -589514983);
	int i_582_ = i_573_ / 2;
	int i_583_ = -i_574_ / 2;
	int i_584_
	    = class161.method2588(i + i_582_, i_572_ + i_583_, -1522338412);
	int i_585_ = -i_573_ / 2;
	int i_586_ = i_574_ / 2;
	int i_587_
	    = class161.method2588(i + i_585_, i_572_ + i_586_, -422766075);
	int i_588_ = i_573_ / 2;
	int i_589_ = i_574_ / 2;
	int i_590_
	    = class161.method2588(i + i_588_, i_572_ + i_589_, 1218154149);
	int i_591_ = i_581_ < i_584_ ? i_581_ : i_584_;
	int i_592_ = i_587_ < i_590_ ? i_587_ : i_590_;
	int i_593_ = i_584_ < i_590_ ? i_584_ : i_590_;
	int i_594_ = i_581_ < i_587_ ? i_581_ : i_587_;
	if (i_574_ != 0) {
	    int i_595_ = ((int) (Math.atan2((double) (i_591_ - i_592_),
					    (double) i_574_)
				 * 2607.5945876176133)
			  & 0x3fff);
	    if (i_595_ != 0) {
		if (i_575_ != 0) {
		    if (i_595_ > 8192) {
			int i_596_ = 16384 - i_575_;
			if (i_595_ < i_596_)
			    i_595_ = i_596_;
		    } else if (i_595_ > i_575_)
			i_595_ = i_575_;
		}
		method2932(i_595_);
	    }
	}
	if (i_573_ != 0) {
	    int i_597_ = ((int) (Math.atan2((double) (i_594_ - i_593_),
					    (double) i_573_)
				 * 2607.5945876176133)
			  & 0x3fff);
	    if (i_597_ != 0) {
		if (i_576_ != 0) {
		    if (i_597_ > 8192) {
			int i_598_ = 16384 - i_576_;
			if (i_597_ < i_598_)
			    i_597_ = i_598_;
		    } else if (i_597_ > i_576_)
			i_597_ = i_576_;
		}
		method2933(i_597_);
	    }
	}
	int i_599_ = i_581_ + i_590_;
	if (i_584_ + i_587_ < i_599_)
	    i_599_ = i_584_ + i_587_;
	i_599_ = (i_599_ >> 1) - i_571_;
	if (i_599_ != 0)
	    method2934(0, i_599_, 0);
    }
    
    void method3104(Class161 class161, int i, int i_600_, int i_601_,
		    int i_602_, int i_603_, int i_604_, int i_605_) {
	boolean bool = false;
	boolean bool_606_ = false;
	boolean bool_607_ = false;
	int i_608_ = -i_602_ / 2;
	int i_609_ = -i_603_ / 2;
	int i_610_
	    = class161.method2588(i + i_608_, i_601_ + i_609_, 1256628376);
	int i_611_ = i_602_ / 2;
	int i_612_ = -i_603_ / 2;
	int i_613_
	    = class161.method2588(i + i_611_, i_601_ + i_612_, -2011464973);
	int i_614_ = -i_602_ / 2;
	int i_615_ = i_603_ / 2;
	int i_616_
	    = class161.method2588(i + i_614_, i_601_ + i_615_, 1100801980);
	int i_617_ = i_602_ / 2;
	int i_618_ = i_603_ / 2;
	int i_619_
	    = class161.method2588(i + i_617_, i_601_ + i_618_, -1288875168);
	int i_620_ = i_610_ < i_613_ ? i_610_ : i_613_;
	int i_621_ = i_616_ < i_619_ ? i_616_ : i_619_;
	int i_622_ = i_613_ < i_619_ ? i_613_ : i_619_;
	int i_623_ = i_610_ < i_616_ ? i_610_ : i_616_;
	if (i_603_ != 0) {
	    int i_624_ = ((int) (Math.atan2((double) (i_620_ - i_621_),
					    (double) i_603_)
				 * 2607.5945876176133)
			  & 0x3fff);
	    if (i_624_ != 0) {
		if (i_604_ != 0) {
		    if (i_624_ > 8192) {
			int i_625_ = 16384 - i_604_;
			if (i_624_ < i_625_)
			    i_624_ = i_625_;
		    } else if (i_624_ > i_604_)
			i_624_ = i_604_;
		}
		method2932(i_624_);
	    }
	}
	if (i_602_ != 0) {
	    int i_626_ = ((int) (Math.atan2((double) (i_623_ - i_622_),
					    (double) i_602_)
				 * 2607.5945876176133)
			  & 0x3fff);
	    if (i_626_ != 0) {
		if (i_605_ != 0) {
		    if (i_626_ > 8192) {
			int i_627_ = 16384 - i_605_;
			if (i_626_ < i_627_)
			    i_626_ = i_627_;
		    } else if (i_626_ > i_605_)
			i_626_ = i_605_;
		}
		method2933(i_626_);
	    }
	}
	int i_628_ = i_610_ + i_619_;
	if (i_613_ + i_616_ < i_628_)
	    i_628_ = i_613_ + i_616_;
	i_628_ = (i_628_ >> 1) - i_600_;
	if (i_628_ != 0)
	    method2934(0, i_628_, 0);
    }
    
    static void method3105(int i, int i_629_, int i_630_, int i_631_,
			   int i_632_, int i_633_, int i_634_, float[] fs,
			   int i_635_, float f, float f_636_, float f_637_,
			   float[] fs_638_) {
	i -= i_631_;
	i_629_ -= i_632_;
	i_630_ -= i_633_;
	float f_639_ = ((float) i * fs[0] + (float) i_629_ * fs[1]
			+ (float) i_630_ * fs[2]);
	float f_640_ = ((float) i * fs[3] + (float) i_629_ * fs[4]
			+ (float) i_630_ * fs[5]);
	float f_641_ = ((float) i * fs[6] + (float) i_629_ * fs[7]
			+ (float) i_630_ * fs[8]);
	float f_642_;
	float f_643_;
	if (i_634_ == 0) {
	    f_642_ = f_639_ + f + 0.5F;
	    f_643_ = -f_641_ + f_637_ + 0.5F;
	} else if (i_634_ == 1) {
	    f_642_ = f_639_ + f + 0.5F;
	    f_643_ = f_641_ + f_637_ + 0.5F;
	} else if (i_634_ == 2) {
	    f_642_ = -f_639_ + f + 0.5F;
	    f_643_ = -f_640_ + f_636_ + 0.5F;
	} else if (i_634_ == 3) {
	    f_642_ = f_639_ + f + 0.5F;
	    f_643_ = -f_640_ + f_636_ + 0.5F;
	} else if (i_634_ == 4) {
	    f_642_ = f_641_ + f_637_ + 0.5F;
	    f_643_ = -f_640_ + f_636_ + 0.5F;
	} else {
	    f_642_ = -f_641_ + f_637_ + 0.5F;
	    f_643_ = -f_640_ + f_636_ + 0.5F;
	}
	if (i_635_ == 1) {
	    float f_644_ = f_642_;
	    f_642_ = -f_643_;
	    f_643_ = f_644_;
	} else if (i_635_ == 2) {
	    f_642_ = -f_642_;
	    f_643_ = -f_643_;
	} else if (i_635_ == 3) {
	    float f_645_ = f_642_;
	    f_642_ = f_643_;
	    f_643_ = -f_645_;
	}
	fs_638_[0] = f_642_;
	fs_638_[1] = f_643_;
    }
    
    public abstract int method3106();
    
    public final void method3107
	(Class525_Sub16_Sub18 class525_sub16_sub18, int i,
	 Class525_Sub16_Sub18 class525_sub16_sub18_646_, int i_647_,
	 int i_648_, int i_649_,
	 Class525_Sub16_Sub18 class525_sub16_sub18_650_, int i_651_,
	 Class525_Sub16_Sub18 class525_sub16_sub18_652_, int i_653_,
	 int i_654_, int i_655_, boolean[] bools, boolean bool) {
	if (i != -1) {
	    if (bools == null || i_651_ == -1)
		method2941(class525_sub16_sub18, i, class525_sub16_sub18_646_,
			   i_647_, i_648_, i_649_, 0, bool);
	    else {
		method2939();
		if (!method2947())
		    method2940();
		else {
		    AnimationFrame class177
			= class525_sub16_sub18.aClass177Array11874[i];
		    AnimationFrameBase class525_sub14
			= class177.base;
		    AnimationFrame class177_656_ = null;
		    if (class525_sub16_sub18_646_ != null) {
			class177_656_ = (class525_sub16_sub18_646_
					 .aClass177Array11874[i_647_]);
			if (class177_656_.base
			    != class525_sub14)
			    class177_656_ = null;
		    }
		    method2945(class525_sub14, class177, class177_656_, i_648_,
			       i_649_, 0, bools, false, bool, 65535, null);
		    AnimationFrame class177_657_ = (class525_sub16_sub18_650_
					      .aClass177Array11874[i_651_]);
		    AnimationFrame class177_658_ = null;
		    if (class525_sub16_sub18_652_ != null) {
			class177_658_ = (class525_sub16_sub18_652_
					 .aClass177Array11874[i_653_]);
			if (class177_658_.base
			    != class525_sub14)
			    class177_658_ = null;
		    }
		    method2948(0, new int[0], 0, 0, 0, 0, bool);
		    method2945(class177_657_.base,
			       class177_657_, class177_658_, i_654_, i_655_, 0,
			       bools, true, bool, 65535, null);
		    method2942();
		    method2940();
		}
	    }
	}
    }
    
    abstract void method3108();
    
    Class207 method3109(ModelDecoder class186, int[] is, int i) {
	int[] is_659_ = null;
	int[] is_660_ = null;
	int[] is_661_ = null;
	float[][] fs = null;
	if (class186.aShortArray2122 != null) {
	    int i_662_ = class186.texturedFaceCount;
	    int[] is_663_ = new int[i_662_];
	    int[] is_664_ = new int[i_662_];
	    int[] is_665_ = new int[i_662_];
	    int[] is_666_ = new int[i_662_];
	    int[] is_667_ = new int[i_662_];
	    int[] is_668_ = new int[i_662_];
	    for (int i_669_ = 0; i_669_ < i_662_; i_669_++) {
		is_663_[i_669_] = 2147483647;
		is_664_[i_669_] = -2147483647;
		is_665_[i_669_] = 2147483647;
		is_666_[i_669_] = -2147483647;
		is_667_[i_669_] = 2147483647;
		is_668_[i_669_] = -2147483647;
	    }
	    for (int i_670_ = 0; i_670_ < i; i_670_++) {
		int i_671_ = is[i_670_];
		short i_672_ = class186.aShortArray2122[i_671_];
		if (i_672_ > -1 && i_672_ < 32766) {
		    for (int i_673_ = 0; i_673_ < 3; i_673_++) {
			short i_674_;
			if (i_673_ == 0)
			    i_674_ = class186.faceA[i_671_];
			else if (i_673_ == 1)
			    i_674_ = class186.faceB[i_671_];
			else
			    i_674_ = class186.faceC[i_671_];
			int i_675_ = class186.vertexX[i_674_];
			int i_676_ = class186.vertexY[i_674_];
			int i_677_ = class186.vertexZ[i_674_];
			if (i_675_ < is_663_[i_672_])
			    is_663_[i_672_] = i_675_;
			if (i_675_ > is_664_[i_672_])
			    is_664_[i_672_] = i_675_;
			if (i_676_ < is_665_[i_672_])
			    is_665_[i_672_] = i_676_;
			if (i_676_ > is_666_[i_672_])
			    is_666_[i_672_] = i_676_;
			if (i_677_ < is_667_[i_672_])
			    is_667_[i_672_] = i_677_;
			if (i_677_ > is_668_[i_672_])
			    is_668_[i_672_] = i_677_;
		    }
		}
	    }
	    is_659_ = new int[i_662_];
	    is_660_ = new int[i_662_];
	    is_661_ = new int[i_662_];
	    fs = new float[i_662_][];
	    for (int i_678_ = 0; i_678_ < i_662_; i_678_++) {
		byte i_679_ = class186.textureRenderTypes[i_678_];
		if (i_679_ > 0) {
		    is_659_[i_678_] = (is_663_[i_678_] + is_664_[i_678_]) / 2;
		    is_660_[i_678_] = (is_665_[i_678_] + is_666_[i_678_]) / 2;
		    is_661_[i_678_] = (is_667_[i_678_] + is_668_[i_678_]) / 2;
		    float f;
		    float f_680_;
		    float f_681_;
		    if (i_679_ == 1) {
			int i_682_ = class186.anIntArray2121[i_678_];
			if (i_682_ == 0) {
			    f = 1.0F;
			    f_681_ = 1.0F;
			} else if (i_682_ > 0) {
			    f = 1.0F;
			    f_681_ = (float) i_682_ / 1024.0F;
			} else {
			    f_681_ = 1.0F;
			    f = (float) -i_682_ / 1024.0F;
			}
			f_680_
			    = 64.0F / (float) class186.anIntArray2114[i_678_];
		    } else if (i_679_ == 2) {
			f = 64.0F / (float) class186.anIntArray2121[i_678_];
			f_680_
			    = 64.0F / (float) class186.anIntArray2114[i_678_];
			f_681_
			    = 64.0F / (float) class186.anIntArray2123[i_678_];
		    } else {
			f = (float) class186.anIntArray2121[i_678_] / 1024.0F;
			f_680_ = ((float) class186.anIntArray2114[i_678_]
				  / 1024.0F);
			f_681_ = ((float) class186.anIntArray2123[i_678_]
				  / 1024.0F);
		    }
		    fs[i_678_]
			= method2925(class186.aShortArray2118[i_678_],
				     class186.aShortArray2119[i_678_],
				     class186.aShortArray2120[i_678_],
				     class186.aByteArray2127[i_678_] & 0xff, f,
				     f_680_, f_681_);
		}
	    }
	}
	return new Class207(this, is_659_, is_660_, is_661_, fs);
    }
    
    void method3110(AnimationFrameBase class525_sub14, AnimationFrame class177,
					AnimationFrame class177_683_, int i, int i_684_, int i_685_,
					boolean[] bools, boolean bool, boolean bool_686_,
					int i_687_, int[] is) {
	if (class177_683_ == null || i == 0) {
	    for (int i_688_ = 0; i_688_ < class177.transformationCount; i_688_++) {
		short i_689_ = class177.transformationIndices[i_688_];
		if (bools == null || bools[i_689_] == bool
		    || class525_sub14.transformationTypes[i_689_] == 0) {
		    short i_690_ = class177.skippedRefrences[i_688_];
		    if (i_690_ != -1)
			method2987(0,
				   class525_sub14.labels[i_690_],
				   0, 0, 0, i_685_, bool_686_,
				   (i_687_
				    & class525_sub14.anIntArray10545[i_690_]),
				   is);
		    method2987(class525_sub14.transformationTypes[i_689_],
			       class525_sub14.labels[i_689_],
			       class177.transformationX[i_688_],
			       class177.transformationY[i_688_],
			       class177.transformationZ[i_688_], i_685_,
			       bool_686_,
			       i_687_ & class525_sub14.anIntArray10545[i_689_],
			       is);
		}
	    }
	} else {
	    int i_691_ = 0;
	    int i_692_ = 0;
	    for (int i_693_ = 0;
			 i_693_ < class525_sub14.count * -92709391; i_693_++) {
		boolean bool_694_ = false;
		if (i_691_ < class177.transformationCount
		    && class177.transformationIndices[i_691_] == i_693_)
		    bool_694_ = true;
		boolean bool_695_ = false;
		if (i_692_ < class177_683_.transformationCount
		    && class177_683_.transformationIndices[i_692_] == i_693_)
		    bool_695_ = true;
		if (bool_694_ || bool_695_) {
		    if (bools != null && bools[i_693_] != bool
			&& class525_sub14.transformationTypes[i_693_] != 0) {
			if (bool_694_)
			    i_691_++;
			if (bool_695_)
			    i_692_++;
		    } else {
			int i_696_ = 0;
			int i_697_ = class525_sub14.transformationTypes[i_693_];
			if (i_697_ == 3 || i_697_ == 10)
			    i_696_ = 128;
			int i_698_;
			int i_699_;
			int i_700_;
			short i_701_;
			byte i_702_;
			if (bool_694_) {
			    i_698_ = class177.transformationX[i_691_];
			    i_699_ = class177.transformationY[i_691_];
			    i_700_ = class177.transformationZ[i_691_];
			    i_701_ = class177.skippedRefrences[i_691_];
			    i_702_ = class177.transformationFlags[i_691_];
			    i_691_++;
			} else {
			    i_698_ = i_696_;
			    i_699_ = i_696_;
			    i_700_ = i_696_;
			    i_701_ = (short) -1;
			    i_702_ = (byte) 0;
			}
			int i_703_;
			int i_704_;
			int i_705_;
			short i_706_;
			byte i_707_;
			if (bool_695_) {
			    i_703_ = class177_683_.transformationX[i_692_];
			    i_704_ = class177_683_.transformationY[i_692_];
			    i_705_ = class177_683_.transformationZ[i_692_];
			    i_706_ = class177_683_.skippedRefrences[i_692_];
			    i_707_ = class177_683_.transformationFlags[i_692_];
			    i_692_++;
			} else {
			    i_703_ = i_696_;
			    i_704_ = i_696_;
			    i_705_ = i_696_;
			    i_706_ = (short) -1;
			    i_707_ = (byte) 0;
			}
			int i_708_;
			int i_709_;
			int i_710_;
			if ((i_702_ & 0x2) != 0 || (i_707_ & 0x1) != 0) {
			    i_708_ = i_698_;
			    i_709_ = i_699_;
			    i_710_ = i_700_;
			} else if (i_697_ == 2) {
			    int i_711_ = i_703_ - i_698_ & 0x3fff;
			    int i_712_ = i_704_ - i_699_ & 0x3fff;
			    int i_713_ = i_705_ - i_700_ & 0x3fff;
			    if (i_711_ >= 8192)
				i_711_ -= 16384;
			    if (i_712_ >= 8192)
				i_712_ -= 16384;
			    if (i_713_ >= 8192)
				i_713_ -= 16384;
			    i_708_ = i_698_ + i_711_ * i / i_684_ & 0x3fff;
			    i_709_ = i_699_ + i_712_ * i / i_684_ & 0x3fff;
			    i_710_ = i_700_ + i_713_ * i / i_684_ & 0x3fff;
			} else if (i_697_ == 9) {
			    int i_714_ = i_703_ - i_698_ & 0x3fff;
			    if (i_714_ >= 8192)
				i_714_ -= 16384;
			    i_708_ = i_698_ + i_714_ * i / i_684_ & 0x3fff;
			    i_710_ = 0;
			    i_709_ = 0;
			} else if (i_697_ == 7) {
			    int i_715_ = i_703_ - i_698_ & 0x3f;
			    if (i_715_ >= 32)
				i_715_ -= 64;
			    i_708_ = i_698_ + i_715_ * i / i_684_ & 0x3f;
			    i_709_ = i_699_ + (i_704_ - i_699_) * i / i_684_;
			    i_710_ = i_700_ + (i_705_ - i_700_) * i / i_684_;
			} else {
			    i_708_ = i_698_ + (i_703_ - i_698_) * i / i_684_;
			    i_709_ = i_699_ + (i_704_ - i_699_) * i / i_684_;
			    i_710_ = i_700_ + (i_705_ - i_700_) * i / i_684_;
			}
			if (i_701_ != -1)
			    method2987(0,
				       (class525_sub14.labels
					[i_701_]),
				       0, 0, 0, i_685_, bool_686_,
				       i_687_ & (class525_sub14.anIntArray10545
						 [i_701_]),
				       is);
			else if (i_706_ != -1)
			    method2987(0,
				       (class525_sub14.labels
					[i_706_]),
				       0, 0, 0, i_685_, bool_686_,
				       i_687_ & (class525_sub14.anIntArray10545
						 [i_706_]),
				       is);
			method2987(i_697_,
				   class525_sub14.labels[i_693_],
				   i_708_, i_709_, i_710_, i_685_, bool_686_,
				   (i_687_
				    & class525_sub14.anIntArray10545[i_693_]),
				   is);
		    }
		}
	    }
	}
    }
    
    void method3111(AnimationFrameBase class525_sub14, AnimationFrame class177,
					AnimationFrame class177_716_, int i, int i_717_, int i_718_,
					boolean[] bools, boolean bool, boolean bool_719_,
					int i_720_, int[] is) {
	if (class177_716_ == null || i == 0) {
	    for (int i_721_ = 0; i_721_ < class177.transformationCount; i_721_++) {
		short i_722_ = class177.transformationIndices[i_721_];
		if (bools == null || bools[i_722_] == bool
		    || class525_sub14.transformationTypes[i_722_] == 0) {
		    short i_723_ = class177.skippedRefrences[i_721_];
		    if (i_723_ != -1)
			method2987(0,
				   class525_sub14.labels[i_723_],
				   0, 0, 0, i_718_, bool_719_,
				   (i_720_
				    & class525_sub14.anIntArray10545[i_723_]),
				   is);
		    method2987(class525_sub14.transformationTypes[i_722_],
			       class525_sub14.labels[i_722_],
			       class177.transformationX[i_721_],
			       class177.transformationY[i_721_],
			       class177.transformationZ[i_721_], i_718_,
			       bool_719_,
			       i_720_ & class525_sub14.anIntArray10545[i_722_],
			       is);
		}
	    }
	} else {
	    int i_724_ = 0;
	    int i_725_ = 0;
	    for (int i_726_ = 0;
			 i_726_ < class525_sub14.count * -92709391; i_726_++) {
		boolean bool_727_ = false;
		if (i_724_ < class177.transformationCount
		    && class177.transformationIndices[i_724_] == i_726_)
		    bool_727_ = true;
		boolean bool_728_ = false;
		if (i_725_ < class177_716_.transformationCount
		    && class177_716_.transformationIndices[i_725_] == i_726_)
		    bool_728_ = true;
		if (bool_727_ || bool_728_) {
		    if (bools != null && bools[i_726_] != bool
			&& class525_sub14.transformationTypes[i_726_] != 0) {
			if (bool_727_)
			    i_724_++;
			if (bool_728_)
			    i_725_++;
		    } else {
			int i_729_ = 0;
			int i_730_ = class525_sub14.transformationTypes[i_726_];
			if (i_730_ == 3 || i_730_ == 10)
			    i_729_ = 128;
			int i_731_;
			int i_732_;
			int i_733_;
			short i_734_;
			byte i_735_;
			if (bool_727_) {
			    i_731_ = class177.transformationX[i_724_];
			    i_732_ = class177.transformationY[i_724_];
			    i_733_ = class177.transformationZ[i_724_];
			    i_734_ = class177.skippedRefrences[i_724_];
			    i_735_ = class177.transformationFlags[i_724_];
			    i_724_++;
			} else {
			    i_731_ = i_729_;
			    i_732_ = i_729_;
			    i_733_ = i_729_;
			    i_734_ = (short) -1;
			    i_735_ = (byte) 0;
			}
			int i_736_;
			int i_737_;
			int i_738_;
			short i_739_;
			byte i_740_;
			if (bool_728_) {
			    i_736_ = class177_716_.transformationX[i_725_];
			    i_737_ = class177_716_.transformationY[i_725_];
			    i_738_ = class177_716_.transformationZ[i_725_];
			    i_739_ = class177_716_.skippedRefrences[i_725_];
			    i_740_ = class177_716_.transformationFlags[i_725_];
			    i_725_++;
			} else {
			    i_736_ = i_729_;
			    i_737_ = i_729_;
			    i_738_ = i_729_;
			    i_739_ = (short) -1;
			    i_740_ = (byte) 0;
			}
			int i_741_;
			int i_742_;
			int i_743_;
			if ((i_735_ & 0x2) != 0 || (i_740_ & 0x1) != 0) {
			    i_741_ = i_731_;
			    i_742_ = i_732_;
			    i_743_ = i_733_;
			} else if (i_730_ == 2) {
			    int i_744_ = i_736_ - i_731_ & 0x3fff;
			    int i_745_ = i_737_ - i_732_ & 0x3fff;
			    int i_746_ = i_738_ - i_733_ & 0x3fff;
			    if (i_744_ >= 8192)
				i_744_ -= 16384;
			    if (i_745_ >= 8192)
				i_745_ -= 16384;
			    if (i_746_ >= 8192)
				i_746_ -= 16384;
			    i_741_ = i_731_ + i_744_ * i / i_717_ & 0x3fff;
			    i_742_ = i_732_ + i_745_ * i / i_717_ & 0x3fff;
			    i_743_ = i_733_ + i_746_ * i / i_717_ & 0x3fff;
			} else if (i_730_ == 9) {
			    int i_747_ = i_736_ - i_731_ & 0x3fff;
			    if (i_747_ >= 8192)
				i_747_ -= 16384;
			    i_741_ = i_731_ + i_747_ * i / i_717_ & 0x3fff;
			    i_743_ = 0;
			    i_742_ = 0;
			} else if (i_730_ == 7) {
			    int i_748_ = i_736_ - i_731_ & 0x3f;
			    if (i_748_ >= 32)
				i_748_ -= 64;
			    i_741_ = i_731_ + i_748_ * i / i_717_ & 0x3f;
			    i_742_ = i_732_ + (i_737_ - i_732_) * i / i_717_;
			    i_743_ = i_733_ + (i_738_ - i_733_) * i / i_717_;
			} else {
			    i_741_ = i_731_ + (i_736_ - i_731_) * i / i_717_;
			    i_742_ = i_732_ + (i_737_ - i_732_) * i / i_717_;
			    i_743_ = i_733_ + (i_738_ - i_733_) * i / i_717_;
			}
			if (i_734_ != -1)
			    method2987(0,
				       (class525_sub14.labels
					[i_734_]),
				       0, 0, 0, i_718_, bool_719_,
				       i_720_ & (class525_sub14.anIntArray10545
						 [i_734_]),
				       is);
			else if (i_739_ != -1)
			    method2987(0,
				       (class525_sub14.labels
					[i_739_]),
				       0, 0, 0, i_718_, bool_719_,
				       i_720_ & (class525_sub14.anIntArray10545
						 [i_739_]),
				       is);
			method2987(i_730_,
				   class525_sub14.labels[i_726_],
				   i_741_, i_742_, i_743_, i_718_, bool_719_,
				   (i_720_
				    & class525_sub14.anIntArray10545[i_726_]),
				   is);
		    }
		}
	    }
	}
    }
    
    void method3112(int i, int[] is, int i_749_, int i_750_, int i_751_,
		    int i_752_, boolean bool, int i_753_, int[] is_754_) {
	if (i_752_ == 1) {
	    if (i == 0 || i == 1) {
		int i_755_ = -i_749_;
		i_749_ = i_751_;
		i_751_ = i_755_;
	    } else if (i == 3) {
		int i_756_ = i_749_;
		i_749_ = i_751_;
		i_751_ = i_756_;
	    } else if (i == 2) {
		int i_757_ = i_749_;
		i_749_ = -i_751_ & 0x3fff;
		i_751_ = i_757_ & 0x3fff;
	    }
	} else if (i_752_ == 2) {
	    if (i == 0 || i == 1) {
		i_749_ = -i_749_;
		i_751_ = -i_751_;
	    } else if (i == 2) {
		i_749_ = -i_749_ & 0x3fff;
		i_751_ = -i_751_ & 0x3fff;
	    }
	} else if (i_752_ == 3) {
	    if (i == 0 || i == 1) {
		int i_758_ = i_749_;
		i_749_ = -i_751_;
		i_751_ = i_758_;
	    } else if (i == 3) {
		int i_759_ = i_749_;
		i_749_ = i_751_;
		i_751_ = i_759_;
	    } else if (i == 2) {
		int i_760_ = i_749_;
		i_749_ = i_751_ & 0x3fff;
		i_751_ = -i_760_ & 0x3fff;
	    }
	}
	if (i_753_ != 65535)
	    method2949(i, is, i_749_, i_750_, i_751_, bool, i_753_, is_754_);
	else
	    method2948(i, is, i_749_, i_750_, i_751_, i_752_, bool);
    }
    
    void method3113(int i, int[] is, int i_761_, int i_762_, int i_763_,
		    int i_764_, boolean bool, int i_765_, int[] is_766_) {
	if (i_764_ == 1) {
	    if (i == 0 || i == 1) {
		int i_767_ = -i_761_;
		i_761_ = i_763_;
		i_763_ = i_767_;
	    } else if (i == 3) {
		int i_768_ = i_761_;
		i_761_ = i_763_;
		i_763_ = i_768_;
	    } else if (i == 2) {
		int i_769_ = i_761_;
		i_761_ = -i_763_ & 0x3fff;
		i_763_ = i_769_ & 0x3fff;
	    }
	} else if (i_764_ == 2) {
	    if (i == 0 || i == 1) {
		i_761_ = -i_761_;
		i_763_ = -i_763_;
	    } else if (i == 2) {
		i_761_ = -i_761_ & 0x3fff;
		i_763_ = -i_763_ & 0x3fff;
	    }
	} else if (i_764_ == 3) {
	    if (i == 0 || i == 1) {
		int i_770_ = i_761_;
		i_761_ = -i_763_;
		i_763_ = i_770_;
	    } else if (i == 3) {
		int i_771_ = i_761_;
		i_761_ = i_763_;
		i_763_ = i_771_;
	    } else if (i == 2) {
		int i_772_ = i_761_;
		i_761_ = i_763_ & 0x3fff;
		i_763_ = -i_772_ & 0x3fff;
	    }
	}
	if (i_765_ != 65535)
	    method2949(i, is, i_761_, i_762_, i_763_, bool, i_765_, is_766_);
	else
	    method2948(i, is, i_761_, i_762_, i_763_, i_764_, bool);
    }
    
    public abstract void method3114(int i, int i_773_, int i_774_, int i_775_);
    
    Class179() {
	/* empty */
    }
}
