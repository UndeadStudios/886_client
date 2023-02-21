/* Class542 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class542
{
    static void method8902(int i, int i_0_, int i_1_, int i_2_,
			   Class527 class527, float f, float f_3_, float f_4_,
			   float f_5_, float f_6_, byte[] is, int i_7_) {
	for (int i_8_ = 0; i_8_ < i_1_; i_8_++) {
	    method8903(i_8_, i, i_0_, i_1_, i_2_, class527, f, f_3_, f_4_,
		       f_5_, f_6_, is, i_7_);
	    i_7_ += i * i_0_;
	}
    }
    
    static void method8903(int i, int i_9_, int i_10_, int i_11_, int i_12_,
			   Class527 class527, float f, float f_13_,
			   float f_14_, float f_15_, float f_16_, byte[] is,
			   int i_17_) {
	int i_18_ = i_9_ * i_10_;
	float[] fs = new float[i_18_];
	for (int i_19_ = 0; i_19_ < i_12_; i_19_++) {
	    int i_20_ = i_17_;
	    class527.method8783(i, i_9_, i_10_, i_11_, f / (float) i_9_,
				f_13_ / (float) i_10_, f_14_ / (float) i_11_,
				f_15_ * 127.0F, fs, 0);
	    for (int i_21_ = 0; i_21_ < i_18_; i_21_++) {
		is[i_20_] += fs[i_21_];
		i_20_++;
	    }
	    f *= 2.0F;
	    f_13_ *= 2.0F;
	    f_14_ *= 2.0F;
	    f_15_ *= f_16_;
	}
	int i_22_ = i_17_;
	for (int i_23_ = 0; i_23_ < i_18_; i_23_++) {
	    is[i_22_] = (byte) (is[i_22_] + 127);
	    i_22_++;
	}
    }
    
    static void method8904(int i, int i_24_, int i_25_, int i_26_,
			   Class527 class527, float f, float f_27_,
			   float f_28_, float f_29_, float f_30_, byte[] is,
			   int i_31_) {
	for (int i_32_ = 0; i_32_ < i_25_; i_32_++) {
	    method8903(i_32_, i, i_24_, i_25_, i_26_, class527, f, f_27_,
		       f_28_, f_29_, f_30_, is, i_31_);
	    i_31_ += i * i_24_;
	}
    }
    
    static void method8905(int i, int i_33_, int i_34_, int i_35_,
			   Class527 class527, float f, float f_36_,
			   float f_37_, float f_38_, float f_39_, byte[] is,
			   int i_40_) {
	for (int i_41_ = 0; i_41_ < i_34_; i_41_++) {
	    method8903(i_41_, i, i_33_, i_34_, i_35_, class527, f, f_36_,
		       f_37_, f_38_, f_39_, is, i_40_);
	    i_40_ += i * i_33_;
	}
    }
    
    public static byte[] method8906(int i, int i_42_, int i_43_, int i_44_,
				    Class527 class527, float f, float f_45_,
				    float f_46_, float f_47_, float f_48_) {
	byte[] is = new byte[i * i_42_ * i_43_];
	method8905(i, i_42_, i_43_, i_44_, class527, f, f_45_, f_46_, f_47_,
		   f_48_, is, 0);
	return is;
    }
    
    public static byte[] method8907(int i, int i_49_, int i_50_, int i_51_,
				    Class527 class527, float f, float f_52_,
				    float f_53_, float f_54_, float f_55_) {
	byte[] is = new byte[i * i_49_ * i_50_];
	method8905(i, i_49_, i_50_, i_51_, class527, f, f_52_, f_53_, f_54_,
		   f_55_, is, 0);
	return is;
    }
    
    public static byte[] method8908(int i, int i_56_, int i_57_, int i_58_,
				    Class527 class527, float f, float f_59_,
				    float f_60_, float f_61_, float f_62_) {
	byte[] is = new byte[i * i_56_ * i_57_];
	method8905(i, i_56_, i_57_, i_58_, class527, f, f_59_, f_60_, f_61_,
		   f_62_, is, 0);
	return is;
    }
    
    public static byte[] method8909(int i, int i_63_, int i_64_, int i_65_,
				    Class527 class527, float f, float f_66_,
				    float f_67_, float f_68_, float f_69_) {
	byte[] is = new byte[i * i_63_ * i_64_];
	method8905(i, i_63_, i_64_, i_65_, class527, f, f_66_, f_67_, f_68_,
		   f_69_, is, 0);
	return is;
    }
    
    static void method8910(int i, int i_70_, int i_71_, int i_72_,
			   Class527 class527, float f, float f_73_,
			   float f_74_, float f_75_, float f_76_, byte[] is,
			   int i_77_) {
	for (int i_78_ = 0; i_78_ < i_71_; i_78_++) {
	    method8903(i_78_, i, i_70_, i_71_, i_72_, class527, f, f_73_,
		       f_74_, f_75_, f_76_, is, i_77_);
	    i_77_ += i * i_70_;
	}
    }
    
    Class542() throws Throwable {
	throw new Error();
    }
    
    static void method8911(int i, int i_79_, int i_80_, int i_81_, int i_82_,
			   Class527 class527, float f, float f_83_,
			   float f_84_, float f_85_, float f_86_, byte[] is,
			   int i_87_) {
	int i_88_ = i_79_ * i_80_;
	float[] fs = new float[i_88_];
	for (int i_89_ = 0; i_89_ < i_82_; i_89_++) {
	    int i_90_ = i_87_;
	    class527.method8783(i, i_79_, i_80_, i_81_, f / (float) i_79_,
				f_83_ / (float) i_80_, f_84_ / (float) i_81_,
				f_85_ * 127.0F, fs, 0);
	    for (int i_91_ = 0; i_91_ < i_88_; i_91_++) {
		is[i_90_] += fs[i_91_];
		i_90_++;
	    }
	    f *= 2.0F;
	    f_83_ *= 2.0F;
	    f_84_ *= 2.0F;
	    f_85_ *= f_86_;
	}
	int i_92_ = i_87_;
	for (int i_93_ = 0; i_93_ < i_88_; i_93_++) {
	    is[i_92_] = (byte) (is[i_92_] + 127);
	    i_92_++;
	}
    }
    
    static void method8912(int i, int i_94_, int i_95_, int i_96_,
			   Class527 class527, float f, float f_97_,
			   float f_98_, float f_99_, float f_100_, byte[] is,
			   int i_101_) {
	for (int i_102_ = 0; i_102_ < i_95_; i_102_++) {
	    method8903(i_102_, i, i_94_, i_95_, i_96_, class527, f, f_97_,
		       f_98_, f_99_, f_100_, is, i_101_);
	    i_101_ += i * i_94_;
	}
    }
}
