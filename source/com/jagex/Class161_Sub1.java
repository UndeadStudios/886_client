/* Class161_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;

import jaggl.OpenGL;

public class Class161_Sub1 extends Class161
{
    Class137 aClass137_9326;
    int anInt9327;
    Class182_Sub3 aClass182_Sub3_9328;
    int anInt9329;
    int anInt9330;
    int anInt9331;
    int anInt9332;
    Class137 aClass137_9333;
    Class525[] aClass525Array9334;
    short[][] aShortArrayArray9335;
    Class525_Sub18[][][] aClass525_Sub18ArrayArrayArray9336;
    int[][][] anIntArrayArrayArray9337;
    int[][][] anIntArrayArrayArray9338;
    int[][][] anIntArrayArrayArray9339;
    static final int anInt9340 = 74;
    int anInt9341;
    int[][][] anIntArrayArrayArray9342;
    byte[][] aByteArrayArray9343;
    Class146 aClass146_9344;
    Class709 aClass709_9345 = new Class709();
    int[][][] anIntArrayArrayArray9346;
    Interface15 anInterface15_9347;
    float[][] aFloatArrayArray9348;
    Class137 aClass137_9349;
    Class137 aClass137_9350;
    static final int anInt9351 = 1;
    int[][][] anIntArrayArrayArray9352;
    int anInt9353;
    float[][] aFloatArrayArray9354;
    byte[][] aByteArrayArray9355;
    int anInt9356;
    float[][] aFloatArrayArray9357;
    Class10 aClass10_9358;
    static float[] aFloatArray9359 = new float[16];
    
    public void method2590(int i, int i_0_, int[] is, int[] is_1_, int[] is_2_,
			   int[] is_3_, int[] is_4_, int[] is_5_, int[] is_6_,
			   int[] is_7_, int[] is_8_, int[] is_9_, int[] is_10_,
			   Class176 class176, boolean bool) {
	int i_11_ = is_7_.length;
	int[] is_12_ = new int[i_11_ * 3];
	int[] is_13_ = new int[i_11_ * 3];
	int[] is_14_ = new int[i_11_ * 3];
	int[] is_15_ = is_8_ != null ? new int[i_11_ * 3] : null;
	int[] is_16_ = new int[i_11_ * 3];
	int[] is_17_ = new int[i_11_ * 3];
	int[] is_18_ = is_1_ != null ? new int[i_11_ * 3] : null;
	int[] is_19_ = is_3_ != null ? new int[i_11_ * 3] : null;
	int i_20_ = 0;
	for (int i_21_ = 0; i_21_ < i_11_; i_21_++) {
	    int i_22_ = is_4_[i_21_];
	    int i_23_ = is_5_[i_21_];
	    int i_24_ = is_6_[i_21_];
	    is_12_[i_20_] = is[i_22_];
	    is_13_[i_20_] = is_2_[i_22_];
	    is_14_[i_20_] = is_7_[i_21_];
	    is_16_[i_20_] = is_9_[i_21_];
	    is_17_[i_20_] = is_10_[i_21_];
	    if (is_8_ != null)
		is_15_[i_20_] = is_8_[i_21_];
	    if (is_1_ != null)
		is_18_[i_20_] = is_1_[i_22_];
	    if (is_3_ != null)
		is_19_[i_20_] = is_3_[i_22_];
	    i_20_++;
	    is_12_[i_20_] = is[i_23_];
	    is_13_[i_20_] = is_2_[i_23_];
	    is_14_[i_20_] = is_7_[i_21_];
	    is_16_[i_20_] = is_9_[i_21_];
	    is_17_[i_20_] = is_10_[i_21_];
	    if (is_8_ != null)
		is_15_[i_20_] = is_8_[i_21_];
	    if (is_1_ != null)
		is_18_[i_20_] = is_1_[i_23_];
	    if (is_3_ != null)
		is_19_[i_20_] = is_3_[i_23_];
	    i_20_++;
	    is_12_[i_20_] = is[i_24_];
	    is_13_[i_20_] = is_2_[i_24_];
	    is_14_[i_20_] = is_7_[i_21_];
	    is_16_[i_20_] = is_9_[i_21_];
	    is_17_[i_20_] = is_10_[i_21_];
	    if (is_8_ != null)
		is_15_[i_20_] = is_8_[i_21_];
	    if (is_1_ != null)
		is_18_[i_20_] = is_1_[i_24_];
	    if (is_3_ != null)
		is_19_[i_20_] = is_3_[i_24_];
	    i_20_++;
	}
	method2576(i, i_0_, is_12_, is_18_, is_13_, is_19_, is_14_, is_15_,
		   is_16_, is_17_, class176, bool);
    }
    
    public void method2609(int i, int i_25_, int i_26_) {
	i = Math.min(aByteArrayArray9355.length - 1, Math.max(0, i));
	i_25_
	    = Math.min(aByteArrayArray9355[i].length - 1, Math.max(0, i_25_));
	if ((aByteArrayArray9355[i][i_25_] & 0xff) < i_26_)
	    aByteArrayArray9355[i][i_25_] = (byte) i_26_;
    }
    
    public void method2576(int i, int i_27_, int[] is, int[] is_28_,
			   int[] is_29_, int[] is_30_, int[] is_31_,
			   int[] is_32_, int[] is_33_, int[] is_34_,
			   Class176 class176, boolean bool) {
	Textures class180 = aClass182_Sub3_9328.aClass180_1944;
	if (is_30_ != null && anIntArrayArrayArray9346 == null)
	    anIntArrayArrayArray9346
		= new int[anInt1759 * 363736815][anInt1760 * -1152334393][];
	if (is_28_ != null && anIntArrayArrayArray9342 == null)
	    anIntArrayArrayArray9342
		= new int[anInt1759 * 363736815][anInt1760 * -1152334393][];
	anIntArrayArrayArray9339[i][i_27_] = is;
	anIntArrayArrayArray9352[i][i_27_] = is_29_;
	anIntArrayArrayArray9337[i][i_27_] = is_31_;
	anIntArrayArrayArray9338[i][i_27_] = is_32_;
	if (anIntArrayArrayArray9346 != null)
	    anIntArrayArrayArray9346[i][i_27_] = is_30_;
	if (anIntArrayArrayArray9342 != null)
	    anIntArrayArrayArray9342[i][i_27_] = is_28_;
	Class525_Sub18[] class525_sub18s
	    = (aClass525_Sub18ArrayArrayArray9336[i][i_27_]
	       = new Class525_Sub18[is_31_.length]);
	for (int i_35_ = 0; i_35_ < is_31_.length; i_35_++) {
	    int i_36_ = is_33_[i_35_];
	    int i_37_ = is_34_[i_35_];
	    if ((anInt9332 & 0x20) != 0 && i_36_ != -1
		&& class180.method3116(i_36_, -1431554601).aBool1819) {
		i_37_ = 128;
		i_36_ = -1;
	    }
	    long l = ((long) (class176.anInt1883 * -2134548585) << 48
		      | (long) (class176.anInt1879 * -734182087) << 42
		      | (long) (class176.anInt1877 * 2141545647) << 28
		      | (long) (i_37_ << 14) | (long) i_36_);
	    Class525 class525;
	    for (class525 = aClass10_9358.method684(l); class525 != null;
		 class525 = aClass10_9358.method696(-2057538770)) {
		Class525_Sub18 class525_sub18 = (Class525_Sub18) class525;
		if (class525_sub18.anInt10569 == i_36_
		    && class525_sub18.aFloat10563 == (float) i_37_
		    && class525_sub18.aClass176_10565.method2902(class176,
								 (short) 1023))
		    break;
	    }
	    if (class525 == null) {
		class525_sub18s[i_35_]
		    = new Class525_Sub18(this, i_36_, i_37_, class176);
		aClass10_9358.method695(class525_sub18s[i_35_], l);
	    } else
		class525_sub18s[i_35_] = (Class525_Sub18) class525;
	}
	if (bool)
	    aByteArrayArray9343[i][i_27_] |= 0x1;
	if (is_31_.length > anInt9353)
	    anInt9353 = is_31_.length;
	anInt9341 += is_31_.length;
    }
    
    Class161_Sub1(Class182_Sub3 class182_sub3, int i, int i_38_, int i_39_,
		  int i_40_, int[][] is, int[][] is_41_, int i_42_) {
	super(i_39_, i_40_, i_42_, is);
	aClass182_Sub3_9328 = class182_sub3;
	anInt9329 = anInt1763 * -2063427645 - 2;
	anInt9327 = 1 << anInt9329;
	anInt9331 = i;
	anInt9332 = i_38_;
	anIntArrayArrayArray9342 = new int[i_39_][i_40_][];
	aClass525_Sub18ArrayArrayArray9336
	    = new Class525_Sub18[i_39_][i_40_][];
	anIntArrayArrayArray9339 = new int[i_39_][i_40_][];
	anIntArrayArrayArray9352 = new int[i_39_][i_40_][];
	anIntArrayArrayArray9337 = new int[i_39_][i_40_][];
	anIntArrayArrayArray9338 = new int[i_39_][i_40_][];
	aShortArrayArray9335 = new short[i_39_ * i_40_][];
	aByteArrayArray9343 = new byte[i_39_][i_40_];
	aByteArrayArray9355 = new byte[i_39_ + 1][i_40_ + 1];
	aFloatArrayArray9348 = (new float[anInt1759 * 363736815 + 1]
				[anInt1760 * -1152334393 + 1]);
	aFloatArrayArray9354 = (new float[anInt1759 * 363736815 + 1]
				[anInt1760 * -1152334393 + 1]);
	aFloatArrayArray9357 = (new float[anInt1759 * 363736815 + 1]
				[anInt1760 * -1152334393 + 1]);
	for (int i_43_ = 1; i_43_ < anInt1760 * -1152334393; i_43_++) {
	    for (int i_44_ = 1; i_44_ < anInt1759 * 363736815; i_44_++) {
		int i_45_
		    = is_41_[i_44_ + 1][i_43_] - is_41_[i_44_ - 1][i_43_];
		int i_46_
		    = is_41_[i_44_][i_43_ + 1] - is_41_[i_44_][i_43_ - 1];
		float f
		    = (float) (1.0 / Math.sqrt((double) (i_45_ * i_45_
							 + 4 * i_42_ * i_42_
							 + i_46_ * i_46_)));
		aFloatArrayArray9348[i_44_][i_43_] = (float) i_45_ * f;
		aFloatArrayArray9354[i_44_][i_43_] = (float) (-i_42_ * 2) * f;
		aFloatArrayArray9357[i_44_][i_43_] = (float) i_46_ * f;
	    }
	}
	aClass10_9358 = new Class10(128);
	if ((anInt9332 & 0x10) != 0)
	    aClass146_9344 = new Class146(aClass182_Sub3_9328, this);
    }
    
    public void method2578() {
	if (anInt9341 > 0) {
	    byte[][] is = (new byte[anInt1759 * 363736815 + 1]
			   [anInt1760 * -1152334393 + 1]);
	    for (int i = 1; i < anInt1759 * 363736815; i++) {
		for (int i_47_ = 1; i_47_ < anInt1760 * -1152334393; i_47_++)
		    is[i][i_47_]
			= (byte) ((aByteArrayArray9355[i - 1][i_47_] >> 2)
				  + (aByteArrayArray9355[i + 1][i_47_] >> 3)
				  + (aByteArrayArray9355[i][i_47_ - 1] >> 2)
				  + (aByteArrayArray9355[i][i_47_ + 1] >> 3)
				  + (aByteArrayArray9355[i][i_47_] >> 1));
	    }
	    aClass525Array9334
		= new Class525[aClass10_9358.method687(-821608347)];
	    aClass10_9358.method686(aClass525Array9334, -864789227);
	    for (int i = 0; i < aClass525Array9334.length; i++)
		((Class525_Sub18) aClass525Array9334[i])
		    .method16291(anInt9341);
	    int i = 24;
	    if (anIntArrayArrayArray9346 != null)
		i += 4;
	    if ((anInt9332 & 0x7) != 0)
		i += 12;
	    NativeHeapBuffer nativeheapbuffer
		= aClass182_Sub3_9328.aNativeHeap9766.method1982(anInt9341 * i,
								 false);
	    Stream stream = new Stream(nativeheapbuffer);
	    Class525_Sub18[] class525_sub18s = new Class525_Sub18[anInt9341];
	    int i_48_ = Class696_Sub18.method17142(anInt9341 / 4, (byte) 117);
	    if (i_48_ < 1)
		i_48_ = 1;
	    Class10 class10 = new Class10(i_48_);
	    Class525_Sub18[] class525_sub18s_49_
		= new Class525_Sub18[anInt9353];
	    for (int i_50_ = 0; i_50_ < anInt1759 * 363736815; i_50_++) {
		for (int i_51_ = 0; i_51_ < anInt1760 * -1152334393; i_51_++) {
		    if (anIntArrayArrayArray9337[i_50_][i_51_] != null) {
			Class525_Sub18[] class525_sub18s_52_
			    = aClass525_Sub18ArrayArrayArray9336[i_50_][i_51_];
			int[] is_53_ = anIntArrayArrayArray9339[i_50_][i_51_];
			int[] is_54_ = anIntArrayArrayArray9352[i_50_][i_51_];
			int[] is_55_ = anIntArrayArrayArray9338[i_50_][i_51_];
			int[] is_56_ = anIntArrayArrayArray9337[i_50_][i_51_];
			int[] is_57_
			    = (anIntArrayArrayArray9342 != null
			       ? anIntArrayArrayArray9342[i_50_][i_51_]
			       : null);
			int[] is_58_
			    = (anIntArrayArrayArray9346 != null
			       ? anIntArrayArrayArray9346[i_50_][i_51_]
			       : null);
			if (is_55_ == null)
			    is_55_ = is_56_;
			float f = aFloatArrayArray9348[i_50_][i_51_];
			float f_59_ = aFloatArrayArray9354[i_50_][i_51_];
			float f_60_ = aFloatArrayArray9357[i_50_][i_51_];
			float f_61_ = aFloatArrayArray9348[i_50_][i_51_ + 1];
			float f_62_ = aFloatArrayArray9354[i_50_][i_51_ + 1];
			float f_63_ = aFloatArrayArray9357[i_50_][i_51_ + 1];
			float f_64_
			    = aFloatArrayArray9348[i_50_ + 1][i_51_ + 1];
			float f_65_
			    = aFloatArrayArray9354[i_50_ + 1][i_51_ + 1];
			float f_66_
			    = aFloatArrayArray9357[i_50_ + 1][i_51_ + 1];
			float f_67_ = aFloatArrayArray9348[i_50_ + 1][i_51_];
			float f_68_ = aFloatArrayArray9354[i_50_ + 1][i_51_];
			float f_69_ = aFloatArrayArray9357[i_50_ + 1][i_51_];
			int i_70_ = is[i_50_][i_51_] & 0xff;
			int i_71_ = is[i_50_][i_51_ + 1] & 0xff;
			int i_72_ = is[i_50_ + 1][i_51_ + 1] & 0xff;
			int i_73_ = is[i_50_ + 1][i_51_] & 0xff;
			int i_74_ = 0;
		    while_80_:
			for (int i_75_ = 0; i_75_ < is_56_.length; i_75_++) {
			    Class525_Sub18 class525_sub18
				= class525_sub18s_52_[i_75_];
			    for (int i_76_ = 0; i_76_ < i_74_; i_76_++) {
				if (class525_sub18s_49_[i_76_]
				    == class525_sub18)
				    continue while_80_;
			    }
			    class525_sub18s_49_[i_74_++] = class525_sub18;
			}
			short[] is_77_
			    = (aShortArrayArray9335
				   [i_51_ * (anInt1759 * 363736815) + i_50_]
			       = new short[is_56_.length]);
			for (int i_78_ = 0; i_78_ < is_56_.length; i_78_++) {
			    int i_79_ = ((i_50_ << anInt1763 * -2063427645)
					 + is_53_[i_78_]);
			    int i_80_ = ((i_51_ << anInt1763 * -2063427645)
					 + is_54_[i_78_]);
			    int i_81_ = i_79_ >> anInt9329;
			    int i_82_ = i_80_ >> anInt9329;
			    int i_83_ = is_56_[i_78_];
			    int i_84_ = is_55_[i_78_];
			    int i_85_ = is_57_ != null ? is_57_[i_78_] : 0;
			    long l = ((long) i_84_ << 48 | (long) i_83_ << 32
				      | (long) (i_81_ << 16) | (long) i_82_);
			    int i_86_ = is_53_[i_78_];
			    int i_87_ = is_54_[i_78_];
			    int i_88_ = 74;
			    int i_89_ = 0;
			    float f_90_ = 1.0F;
			    float f_91_;
			    float f_92_;
			    float f_93_;
			    if (i_86_ == 0 && i_87_ == 0) {
				f_91_ = f;
				f_92_ = f_59_;
				f_93_ = f_60_;
				i_88_ -= i_70_;
			    } else if (i_86_ == 0
				       && i_87_ == anInt1761 * 435863595) {
				f_91_ = f_61_;
				f_92_ = f_62_;
				f_93_ = f_63_;
				i_88_ -= i_71_;
			    } else if (i_86_ == anInt1761 * 435863595
				       && i_87_ == anInt1761 * 435863595) {
				f_91_ = f_64_;
				f_92_ = f_65_;
				f_93_ = f_66_;
				i_88_ -= i_72_;
			    } else if (i_86_ == anInt1761 * 435863595
				       && i_87_ == 0) {
				f_91_ = f_67_;
				f_92_ = f_68_;
				f_93_ = f_69_;
				i_88_ -= i_73_;
			    } else {
				float f_94_
				    = ((float) i_86_
				       / (float) (anInt1761 * 435863595));
				float f_95_
				    = ((float) i_87_
				       / (float) (anInt1761 * 435863595));
				float f_96_ = f + (f_67_ - f) * f_94_;
				float f_97_ = f_59_ + (f_68_ - f_59_) * f_94_;
				float f_98_ = f_60_ + (f_69_ - f_60_) * f_94_;
				float f_99_ = f_61_ + (f_64_ - f_61_) * f_94_;
				float f_100_ = f_62_ + (f_65_ - f_62_) * f_94_;
				float f_101_ = f_63_ + (f_66_ - f_63_) * f_94_;
				f_91_ = f_96_ + (f_99_ - f_96_) * f_95_;
				f_92_ = f_97_ + (f_100_ - f_97_) * f_95_;
				f_93_ = f_98_ + (f_101_ - f_98_) * f_95_;
				int i_102_
				    = i_70_ + ((i_73_ - i_70_) * i_86_
					       >> anInt1763 * -2063427645);
				int i_103_
				    = i_71_ + ((i_72_ - i_71_) * i_86_
					       >> anInt1763 * -2063427645);
				i_88_ -= i_102_ + ((i_103_ - i_102_) * i_87_
						   >> anInt1763 * -2063427645);
			    }
			    if (i_83_ != -1) {
				int i_104_ = (i_83_ & 0x7f) * i_88_ >> 7;
				if (i_104_ < 2)
				    i_104_ = 2;
				else if (i_104_ > 126)
				    i_104_ = 126;
				i_89_ = (Class642.anIntArray8324
					 [i_83_ & 0xff80 | i_104_]);
				if ((anInt9332 & 0x7) == 0) {
				    f_90_ = ((aClass182_Sub3_9328
					      .aFloatArray9660[0]) * f_91_
					     + (aClass182_Sub3_9328
						.aFloatArray9660[1]) * f_92_
					     + (aClass182_Sub3_9328
						.aFloatArray9660[2]) * f_93_);
				    f_90_ = (aClass182_Sub3_9328.aFloat9834
					     + f_90_ * (f_90_ > 0.0F
							? (aClass182_Sub3_9328
							   .aFloat9759)
							: (aClass182_Sub3_9328
							   .aFloat9631)));
				}
			    }
			    Class525 class525 = null;
			    if ((i_79_ & anInt9327 - 1) == 0
				&& (i_80_ & anInt9327 - 1) == 0)
				class525 = class10.method684(l);
			    int i_105_;
			    if (class525 == null) {
				int i_106_;
				if (i_84_ != i_83_) {
				    int i_107_ = (i_84_ & 0x7f) * i_88_ >> 7;
				    if (i_107_ < 2)
					i_107_ = 2;
				    else if (i_107_ > 126)
					i_107_ = 126;
				    i_106_ = (Class642.anIntArray8324
					      [i_84_ & 0xff80 | i_107_]);
				    if ((anInt9332 & 0x7) == 0) {
					float f_108_
					    = ((aClass182_Sub3_9328
						.aFloatArray9660[0]) * f_91_
					       + (aClass182_Sub3_9328
						  .aFloatArray9660[1]) * f_92_
					       + ((aClass182_Sub3_9328
						   .aFloatArray9660[2])
						  * f_93_));
					f_108_
					    = (aClass182_Sub3_9328.aFloat9834
					       + (f_90_
						  * (f_90_ > 0.0F
						     ? (aClass182_Sub3_9328
							.aFloat9759)
						     : (aClass182_Sub3_9328
							.aFloat9631))));
					int i_109_ = i_106_ >> 16 & 0xff;
					int i_110_ = i_106_ >> 8 & 0xff;
					int i_111_ = i_106_ & 0xff;
					i_109_ *= f_108_;
					if (i_109_ < 0)
					    i_109_ = 0;
					else if (i_109_ > 255)
					    i_109_ = 255;
					i_110_ *= f_108_;
					if (i_110_ < 0)
					    i_110_ = 0;
					else if (i_110_ > 255)
					    i_110_ = 255;
					i_111_ *= f_108_;
					if (i_111_ < 0)
					    i_111_ = 0;
					else if (i_111_ > 255)
					    i_111_ = 255;
					i_106_ = (i_109_ << 16 | i_110_ << 8
						  | i_111_);
				    }
				} else
				    i_106_ = i_89_;
				if (aClass182_Sub3_9328.aBool9792) {
				    stream.method1766((float) i_79_);
				    stream.method1766
					((float) (method2619(i_79_, i_80_,
							     -2121184901)
						  + i_85_));
				    stream.method1766((float) i_80_);
				    stream.method1765((byte) (i_106_ >> 16));
				    stream.method1765((byte) (i_106_ >> 8));
				    stream.method1765((byte) i_106_);
				    stream.method1765(-1);
				    stream.method1766((float) i_79_);
				    stream.method1766((float) i_80_);
				    if (anIntArrayArrayArray9346 != null)
					stream.method1766(is_58_ != null
							  ? (float) ((is_58_
								      [i_78_])
								     - 1)
							  : 0.0F);
				    if ((anInt9332 & 0x7) != 0) {
					stream.method1766(f_91_);
					stream.method1766(f_92_);
					stream.method1766(f_93_);
				    }
				} else {
				    stream.method1767((float) i_79_);
				    stream.method1767
					((float) (method2619(i_79_, i_80_,
							     -319078748)
						  + i_85_));
				    stream.method1767((float) i_80_);
				    stream.method1765((byte) (i_106_ >> 16));
				    stream.method1765((byte) (i_106_ >> 8));
				    stream.method1765((byte) i_106_);
				    stream.method1765(-1);
				    stream.method1767((float) i_79_);
				    stream.method1767((float) i_80_);
				    if (anIntArrayArrayArray9346 != null)
					stream.method1767(is_58_ != null
							  ? (float) ((is_58_
								      [i_78_])
								     - 1)
							  : 0.0F);
				    if ((anInt9332 & 0x7) != 0) {
					stream.method1767(f_91_);
					stream.method1767(f_92_);
					stream.method1767(f_93_);
				    }
				}
				i_105_ = anInt9356++;
				is_77_[i_78_] = (short) i_105_;
				if (i_83_ != -1)
				    class525_sub18s[i_105_]
					= class525_sub18s_52_[i_78_];
				class10.method695(new Class525_Sub20(is_77_
								     [i_78_]),
						  l);
			    } else {
				is_77_[i_78_]
				    = ((Class525_Sub20) class525).aShort10573;
				i_105_ = is_77_[i_78_] & 0xffff;
				if (i_83_ != -1
				    && ((class525_sub18s_52_[i_78_].aLong7113
					 * -5126207504388691097L)
					< (class525_sub18s[i_105_].aLong7113
					   * -5126207504388691097L)))
				    class525_sub18s[i_105_]
					= class525_sub18s_52_[i_78_];
			    }
			    for (int i_112_ = 0; i_112_ < i_74_; i_112_++)
				class525_sub18s_49_[i_112_]
				    .method16280(i_105_, i_89_, i_88_, f_90_);
			    anInt9330++;
			}
		    }
		}
	    }
	    for (int i_113_ = 0; i_113_ < anInt9356; i_113_++) {
		Class525_Sub18 class525_sub18 = class525_sub18s[i_113_];
		if (class525_sub18 != null)
		    class525_sub18.method16276(i_113_);
	    }
	    for (int i_114_ = 0; i_114_ < anInt1759 * 363736815; i_114_++) {
		for (int i_115_ = 0; i_115_ < anInt1760 * -1152334393;
		     i_115_++) {
		    short[] is_116_
			= (aShortArrayArray9335
			   [i_115_ * (anInt1759 * 363736815) + i_114_]);
		    if (is_116_ != null) {
			int i_117_ = 0;
			int i_118_ = 0;
			while (i_118_ < is_116_.length) {
			    int i_119_ = is_116_[i_118_++] & 0xffff;
			    int i_120_ = is_116_[i_118_++] & 0xffff;
			    int i_121_ = is_116_[i_118_++] & 0xffff;
			    Class525_Sub18 class525_sub18
				= class525_sub18s[i_119_];
			    Class525_Sub18 class525_sub18_122_
				= class525_sub18s[i_120_];
			    Class525_Sub18 class525_sub18_123_
				= class525_sub18s[i_121_];
			    Class525_Sub18 class525_sub18_124_ = null;
			    if (class525_sub18 != null) {
				class525_sub18.method16279(i_114_, i_115_,
							   i_117_);
				class525_sub18_124_ = class525_sub18;
			    }
			    if (class525_sub18_122_ != null) {
				class525_sub18_122_.method16279(i_114_, i_115_,
								i_117_);
				if (class525_sub18_124_ == null
				    || ((class525_sub18_122_.aLong7113
					 * -5126207504388691097L)
					< (class525_sub18_124_.aLong7113
					   * -5126207504388691097L)))
				    class525_sub18_124_ = class525_sub18_122_;
			    }
			    if (class525_sub18_123_ != null) {
				class525_sub18_123_.method16279(i_114_, i_115_,
								i_117_);
				if (class525_sub18_124_ == null
				    || ((class525_sub18_123_.aLong7113
					 * -5126207504388691097L)
					< (class525_sub18_124_.aLong7113
					   * -5126207504388691097L)))
				    class525_sub18_124_ = class525_sub18_123_;
			    }
			    if (class525_sub18_124_ != null) {
				if (class525_sub18 != null)
				    class525_sub18_124_.method16276(i_119_);
				if (class525_sub18_122_ != null)
				    class525_sub18_124_.method16276(i_120_);
				if (class525_sub18_123_ != null)
				    class525_sub18_124_.method16276(i_121_);
				class525_sub18_124_.method16279(i_114_, i_115_,
								i_117_);
			    }
			    i_117_++;
			}
		    }
		}
	    }
	    stream.method1768();
	    anInterface15_9347
		= aClass182_Sub3_9328.method15381(i, nativeheapbuffer,
						  stream.method1763(), false);
	    if (anInterface15_9347 instanceof Class133_Sub1)
		nativeheapbuffer.method1742();
	    aClass137_9333 = new Class137(anInterface15_9347, 5126, 3, 0);
	    aClass137_9349 = new Class137(anInterface15_9347, 5121, 4, 12);
	    int i_125_;
	    if (anIntArrayArrayArray9346 != null) {
		aClass137_9326 = new Class137(anInterface15_9347, 5126, 3, 16);
		i_125_ = 28;
	    } else {
		aClass137_9326 = new Class137(anInterface15_9347, 5126, 2, 16);
		i_125_ = 24;
	    }
	    if ((anInt9332 & 0x7) != 0)
		aClass137_9350
		    = new Class137(anInterface15_9347, 5126, 3, i_125_);
	    long[] ls = new long[aClass525Array9334.length];
	    for (int i_126_ = 0; i_126_ < aClass525Array9334.length;
		 i_126_++) {
		Class525_Sub18 class525_sub18
		    = (Class525_Sub18) aClass525Array9334[i_126_];
		ls[i_126_] = class525_sub18.aLong7113 * -5126207504388691097L;
		class525_sub18.method16290(anInt9356);
	    }
	    Class305.method5424(ls, aClass525Array9334, -1698367069);
	    if (aClass146_9344 != null)
		aClass146_9344.method2361();
	} else
	    aClass146_9344 = null;
	if ((anInt9331 & 0x2) == 0) {
	    anIntArrayArrayArray9352 = null;
	    anIntArrayArrayArray9339 = null;
	    anIntArrayArrayArray9337 = null;
	}
	anIntArrayArrayArray9346 = null;
	anIntArrayArrayArray9338 = null;
	anIntArrayArrayArray9342 = null;
	aClass525_Sub18ArrayArrayArray9336 = null;
	aByteArrayArray9355 = null;
	aClass10_9358 = null;
	aFloatArrayArray9357 = null;
	aFloatArrayArray9354 = null;
	aFloatArrayArray9348 = null;
    }
    
    public void method2579(int i, int i_127_, int i_128_, boolean[][] bools,
			   boolean bool, int i_129_) {
	method15059(i, i_127_, i_128_, bools, bool, i_129_);
    }
    
    void method15056(Class525_Sub16_Sub17_Sub1 class525_sub16_sub17_sub1,
		     int i, int i_130_) {
	int[] is = anIntArrayArrayArray9339[i][i_130_];
	int[] is_131_ = anIntArrayArrayArray9352[i][i_130_];
	int i_132_ = is.length;
	if (aClass182_Sub3_9328.anIntArray9829.length < i_132_) {
	    aClass182_Sub3_9328.anIntArray9829 = new int[i_132_];
	    aClass182_Sub3_9328.anIntArray9830 = new int[i_132_];
	}
	int[] is_133_ = aClass182_Sub3_9328.anIntArray9829;
	int[] is_134_ = aClass182_Sub3_9328.anIntArray9830;
	for (int i_135_ = 0; i_135_ < i_132_; i_135_++) {
	    is_133_[i_135_] = is[i_135_] >> aClass182_Sub3_9328.anInt9800;
	    is_134_[i_135_] = is_131_[i_135_] >> aClass182_Sub3_9328.anInt9800;
	}
	int i_136_ = 0;
	while (i_136_ < i_132_) {
	    int i_137_ = is_133_[i_136_];
	    int i_138_ = is_134_[i_136_++];
	    int i_139_ = is_133_[i_136_];
	    int i_140_ = is_134_[i_136_++];
	    int i_141_ = is_133_[i_136_];
	    int i_142_ = is_134_[i_136_++];
	    if (((i_137_ - i_139_) * (i_140_ - i_142_)
		 - (i_140_ - i_138_) * (i_141_ - i_139_))
		> 0)
		class525_sub16_sub17_sub1.method18765(i_138_, i_140_, i_142_,
						      i_137_, i_139_, i_141_);
	}
    }
    
    public void method2574(int i, int i_143_, int i_144_, int i_145_,
			   int i_146_, int i_147_, int i_148_,
			   boolean[][] bools) {
	Class168 class168 = aClass182_Sub3_9328.method3566(-996794094);
	if (anInt9341 > 0 && class168 != null) {
	    aClass182_Sub3_9328.method15361();
	    aClass182_Sub3_9328.method15549(false);
	    aClass182_Sub3_9328.method15404(false);
	    aClass182_Sub3_9328.method15406(false);
	    aClass182_Sub3_9328.method15512(false);
	    aClass182_Sub3_9328.method15409(0);
	    aClass182_Sub3_9328.method15455(-2);
	    aClass182_Sub3_9328.method15395(null);
	    aFloatArray9359[0]
		= (float) i_144_ / (128.0F * (float) (anInt1761 * 435863595)
				    * (float) class168.method2710());
	    aFloatArray9359[1] = 0.0F;
	    aFloatArray9359[2] = 0.0F;
	    aFloatArray9359[3] = 0.0F;
	    aFloatArray9359[4] = 0.0F;
	    aFloatArray9359[5]
		= (float) i_144_ / (128.0F * (float) (anInt1761 * 435863595)
				    * (float) class168.method2711());
	    aFloatArray9359[6] = 0.0F;
	    aFloatArray9359[7] = 0.0F;
	    aFloatArray9359[8] = 0.0F;
	    aFloatArray9359[9] = 0.0F;
	    aFloatArray9359[10] = 0.0F;
	    aFloatArray9359[11] = 0.0F;
	    aFloatArray9359[12]
		= -1.0F - ((float) (i_145_ * i_144_) / 128.0F
			   - (float) (i * 2)) / (float) class168.method2710();
	    aFloatArray9359[13]
		= 1.0F - (((float) (2 * i_143_)
			   + (float) (i_148_ * i_144_) / 128.0F)
			  / (float) class168.method2711());
	    aFloatArray9359[14] = 0.0F;
	    aFloatArray9359[15] = 1.0F;
	    OpenGL.glMatrixMode(5889);
	    OpenGL.glLoadMatrixf(aFloatArray9359, 0);
	    aFloatArray9359[0] = 1.0F;
	    aFloatArray9359[1] = 0.0F;
	    aFloatArray9359[2] = 0.0F;
	    aFloatArray9359[3] = 0.0F;
	    aFloatArray9359[4] = 0.0F;
	    aFloatArray9359[5] = 0.0F;
	    aFloatArray9359[6] = 1.0F;
	    aFloatArray9359[7] = 0.0F;
	    aFloatArray9359[8] = 0.0F;
	    aFloatArray9359[9] = 1.0F;
	    aFloatArray9359[10] = 0.0F;
	    aFloatArray9359[11] = 0.0F;
	    aFloatArray9359[12] = 0.0F;
	    aFloatArray9359[13] = 0.0F;
	    aFloatArray9359[14] = 0.0F;
	    aFloatArray9359[15] = 1.0F;
	    OpenGL.glMatrixMode(5888);
	    OpenGL.glLoadMatrixf(aFloatArray9359, 0);
	    if ((anInt9332 & 0x7) != 0) {
		aClass182_Sub3_9328.method15404(true);
		aClass182_Sub3_9328.method15371();
	    } else
		aClass182_Sub3_9328.method15404(false);
	    aClass182_Sub3_9328.method15384(aClass137_9333, aClass137_9350,
					    aClass137_9349, aClass137_9326);
	    if ((aClass182_Sub3_9328.aClass525_Sub38_Sub1_9828
		 .buffer).length
		< anInt9330 * 2)
		aClass182_Sub3_9328.aClass525_Sub38_Sub1_9828
		    = new Class525_Sub38_Sub1(anInt9330 * 2);
	    else
		aClass182_Sub3_9328.aClass525_Sub38_Sub1_9828.index = 0;
	    int i_149_ = 0;
	    Class525_Sub38_Sub1 class525_sub38_sub1
		= aClass182_Sub3_9328.aClass525_Sub38_Sub1_9828;
	    if (aClass182_Sub3_9328.aBool9792) {
		for (int i_150_ = i_146_; i_150_ < i_148_; i_150_++) {
		    int i_151_ = i_150_ * (anInt1759 * 363736815) + i_145_;
		    for (int i_152_ = i_145_; i_152_ < i_147_; i_152_++) {
			if (bools[i_152_ - i_145_][i_150_ - i_146_]) {
			    short[] is = aShortArrayArray9335[i_151_];
			    if (is != null) {
				for (int i_153_ = 0; i_153_ < is.length;
				     i_153_++) {
				    class525_sub38_sub1.method16602((is[i_153_]
								     & 0xffff),
								    929337009);
				    i_149_++;
				}
			    }
			}
			i_151_++;
		    }
		}
	    } else {
		for (int i_154_ = i_146_; i_154_ < i_148_; i_154_++) {
		    int i_155_ = i_154_ * (anInt1759 * 363736815) + i_145_;
		    for (int i_156_ = i_145_; i_156_ < i_147_; i_156_++) {
			if (bools[i_156_ - i_145_][i_154_ - i_146_]) {
			    short[] is = aShortArrayArray9335[i_155_];
			    if (is != null) {
				for (int i_157_ = 0; i_157_ < is.length;
				     i_157_++) {
				    class525_sub38_sub1.method16840((is[i_157_]
								     & 0xffff),
								    241387851);
				    i_149_++;
				}
			    }
			}
			i_155_++;
		    }
		}
	    }
	    if (i_149_ > 0) {
		Class121_Sub2 class121_sub2
		    = new Class121_Sub2(aClass182_Sub3_9328, 5123,
					class525_sub38_sub1.buffer,
					(class525_sub38_sub1.index
					 * -1133521593));
		aClass182_Sub3_9328.method15427(class121_sub2, 4, 0, i_149_);
	    }
	}
    }
    
    public Class525_Sub16_Sub17 method2597
	(int i, int i_158_, Class525_Sub16_Sub17 class525_sub16_sub17) {
	if ((aByteArrayArray9343[i][i_158_] & 0x1) == 0)
	    return null;
	int i_159_ = anInt1761 * 435863595 >> aClass182_Sub3_9328.anInt9800;
	Class525_Sub16_Sub17_Sub1 class525_sub16_sub17_sub1
	    = (Class525_Sub16_Sub17_Sub1) class525_sub16_sub17;
	Class525_Sub16_Sub17_Sub1 class525_sub16_sub17_sub1_160_;
	if (class525_sub16_sub17_sub1 != null
	    && class525_sub16_sub17_sub1.method18760(i_159_, i_159_)) {
	    class525_sub16_sub17_sub1_160_ = class525_sub16_sub17_sub1;
	    class525_sub16_sub17_sub1_160_.method18761();
	} else
	    class525_sub16_sub17_sub1_160_
		= new Class525_Sub16_Sub17_Sub1(aClass182_Sub3_9328, i_159_,
						i_159_);
	class525_sub16_sub17_sub1_160_.method18770(0, 0, i_159_, i_159_);
	method15056(class525_sub16_sub17_sub1_160_, i, i_158_);
	return class525_sub16_sub17_sub1_160_;
    }
    
    void method15057(int i, int i_161_, int i_162_, boolean[][] bools,
		     boolean bool, int i_163_) {
	if (aClass525Array9334 != null) {
	    int i_164_ = i_162_ + i_162_ + 1;
	    i_164_ *= i_164_;
	    if (aClass182_Sub3_9328.anIntArray9831.length < i_164_)
		aClass182_Sub3_9328.anIntArray9831 = new int[i_164_];
	    if ((aClass182_Sub3_9328.aClass525_Sub38_Sub1_9828
		 .buffer).length
		< anInt9330 * 2)
		aClass182_Sub3_9328.aClass525_Sub38_Sub1_9828
		    = new Class525_Sub38_Sub1(anInt9330 * 2);
	    int i_165_ = i - i_162_;
	    int i_166_ = i_165_;
	    if (i_165_ < 0)
		i_165_ = 0;
	    int i_167_ = i_161_ - i_162_;
	    int i_168_ = i_167_;
	    if (i_167_ < 0)
		i_167_ = 0;
	    int i_169_ = i + i_162_;
	    if (i_169_ > anInt1759 * 363736815 - 1)
		i_169_ = anInt1759 * 363736815 - 1;
	    int i_170_ = i_161_ + i_162_;
	    if (i_170_ > anInt1760 * -1152334393 - 1)
		i_170_ = anInt1760 * -1152334393 - 1;
	    int i_171_ = 0;
	    int[] is = aClass182_Sub3_9328.anIntArray9831;
	    for (int i_172_ = i_165_; i_172_ <= i_169_; i_172_++) {
		boolean[] bools_173_ = bools[i_172_ - i_166_];
		for (int i_174_ = i_167_; i_174_ <= i_170_; i_174_++) {
		    if (bools_173_[i_174_ - i_168_])
			is[i_171_++]
			    = i_174_ * (anInt1759 * 363736815) + i_172_;
		}
	    }
	    aClass182_Sub3_9328.method15390();
	    aClass182_Sub3_9328.method15404((anInt9332 & 0x7) != 0);
	    for (int i_175_ = 0; i_175_ < aClass525Array9334.length - 0;
		 i_175_++)
		((Class525_Sub18) aClass525Array9334[i_175_])
		    .method16282(is, i_171_);
	    if (!aClass709_9345.method14363(965382774)) {
		int i_176_ = aClass182_Sub3_9328.anInt9767;
		int i_177_ = aClass182_Sub3_9328.anInt9768;
		aClass182_Sub3_9328.method3140(0, i_177_,
					       aClass182_Sub3_9328.anInt9769);
		aClass182_Sub3_9328.method15404(false);
		aClass182_Sub3_9328.method15512(false);
		aClass182_Sub3_9328.method15409(128);
		aClass182_Sub3_9328.method15455(-2);
		aClass182_Sub3_9328
		    .method15395(aClass182_Sub3_9328.aClass136_Sub2_9786);
		aClass182_Sub3_9328.method15398(8448, 7681);
		aClass182_Sub3_9328.method15431(0, 34166, 770);
		aClass182_Sub3_9328.method15399(0, 34167, 770);
		for (Class525 class525
			 = aClass709_9345.method14372((short) -2581);
		     class525 != null;
		     class525 = aClass709_9345.method14353(-1213104755)) {
		    Class525_Sub4 class525_sub4 = (Class525_Sub4) class525;
		    class525_sub4.method16108(i, i_161_, i_162_, bools);
		}
		aClass182_Sub3_9328.method15431(0, 5890, 768);
		aClass182_Sub3_9328.method15399(0, 5890, 770);
		aClass182_Sub3_9328.method15395(null);
		aClass182_Sub3_9328.method3140(i_176_, i_177_,
					       aClass182_Sub3_9328.anInt9769);
	    }
	    if (aClass146_9344 != null) {
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
		aClass182_Sub3_9328.method15384(aClass137_9333, null, null,
						aClass137_9326);
		aClass146_9344.method2362(i, i_161_, i_162_, bools, bool);
		OpenGL.glPopMatrix();
	    }
	}
    }
    
    public void method2613(int i, int i_178_, int[] is, int[] is_179_,
			   int[] is_180_, int[] is_181_, int[] is_182_,
			   int[] is_183_, int[] is_184_, int[] is_185_,
			   int[] is_186_, int[] is_187_, int[] is_188_,
			   Class176 class176, boolean bool) {
	int i_189_ = is_185_.length;
	int[] is_190_ = new int[i_189_ * 3];
	int[] is_191_ = new int[i_189_ * 3];
	int[] is_192_ = new int[i_189_ * 3];
	int[] is_193_ = is_186_ != null ? new int[i_189_ * 3] : null;
	int[] is_194_ = new int[i_189_ * 3];
	int[] is_195_ = new int[i_189_ * 3];
	int[] is_196_ = is_179_ != null ? new int[i_189_ * 3] : null;
	int[] is_197_ = is_181_ != null ? new int[i_189_ * 3] : null;
	int i_198_ = 0;
	for (int i_199_ = 0; i_199_ < i_189_; i_199_++) {
	    int i_200_ = is_182_[i_199_];
	    int i_201_ = is_183_[i_199_];
	    int i_202_ = is_184_[i_199_];
	    is_190_[i_198_] = is[i_200_];
	    is_191_[i_198_] = is_180_[i_200_];
	    is_192_[i_198_] = is_185_[i_199_];
	    is_194_[i_198_] = is_187_[i_199_];
	    is_195_[i_198_] = is_188_[i_199_];
	    if (is_186_ != null)
		is_193_[i_198_] = is_186_[i_199_];
	    if (is_179_ != null)
		is_196_[i_198_] = is_179_[i_200_];
	    if (is_181_ != null)
		is_197_[i_198_] = is_181_[i_200_];
	    i_198_++;
	    is_190_[i_198_] = is[i_201_];
	    is_191_[i_198_] = is_180_[i_201_];
	    is_192_[i_198_] = is_185_[i_199_];
	    is_194_[i_198_] = is_187_[i_199_];
	    is_195_[i_198_] = is_188_[i_199_];
	    if (is_186_ != null)
		is_193_[i_198_] = is_186_[i_199_];
	    if (is_179_ != null)
		is_196_[i_198_] = is_179_[i_201_];
	    if (is_181_ != null)
		is_197_[i_198_] = is_181_[i_201_];
	    i_198_++;
	    is_190_[i_198_] = is[i_202_];
	    is_191_[i_198_] = is_180_[i_202_];
	    is_192_[i_198_] = is_185_[i_199_];
	    is_194_[i_198_] = is_187_[i_199_];
	    is_195_[i_198_] = is_188_[i_199_];
	    if (is_186_ != null)
		is_193_[i_198_] = is_186_[i_199_];
	    if (is_179_ != null)
		is_196_[i_198_] = is_179_[i_202_];
	    if (is_181_ != null)
		is_197_[i_198_] = is_181_[i_202_];
	    i_198_++;
	}
	method2576(i, i_178_, is_190_, is_196_, is_191_, is_197_, is_192_,
		   is_193_, is_194_, is_195_, class176, bool);
    }
    
    public void method2586(Class525_Sub16_Sub17 class525_sub16_sub17, int i,
			   int i_203_, int i_204_, int i_205_, boolean bool) {
	if (aClass146_9344 != null && class525_sub16_sub17 != null) {
	    int i_206_ = (i - (i_203_ * aClass182_Sub3_9328.anInt9697 >> 8)
			  >> aClass182_Sub3_9328.anInt9800);
	    int i_207_
		= (i_204_ - (i_203_ * aClass182_Sub3_9328.anInt9765 >> 8)
		   >> aClass182_Sub3_9328.anInt9800);
	    aClass146_9344.method2377(class525_sub16_sub17, i_206_, i_207_);
	}
    }
    
    public void method2575(Class525_Sub16_Sub17 class525_sub16_sub17, int i,
			   int i_208_, int i_209_, int i_210_, boolean bool) {
	if (aClass146_9344 != null && class525_sub16_sub17 != null) {
	    int i_211_ = (i - (i_208_ * aClass182_Sub3_9328.anInt9697 >> 8)
			  >> aClass182_Sub3_9328.anInt9800);
	    int i_212_
		= (i_209_ - (i_208_ * aClass182_Sub3_9328.anInt9765 >> 8)
		   >> aClass182_Sub3_9328.anInt9800);
	    aClass146_9344.method2363(class525_sub16_sub17, i_211_, i_212_);
	}
    }
    
    public void method2589(Class525_Sub21 class525_sub21, int[] is) {
	aClass709_9345.method14345(new Class525_Sub4(aClass182_Sub3_9328, this,
						     class525_sub21, is),
				   (byte) 0);
    }
    
    public void method2602(int i, int i_213_, int i_214_) {
	i = Math.min(aByteArrayArray9355.length - 1, Math.max(0, i));
	i_213_
	    = Math.min(aByteArrayArray9355[i].length - 1, Math.max(0, i_213_));
	if ((aByteArrayArray9355[i][i_213_] & 0xff) < i_214_)
	    aByteArrayArray9355[i][i_213_] = (byte) i_214_;
    }
    
    public void method2587(int i, int i_215_, int i_216_) {
	i = Math.min(aByteArrayArray9355.length - 1, Math.max(0, i));
	i_215_
	    = Math.min(aByteArrayArray9355[i].length - 1, Math.max(0, i_215_));
	if ((aByteArrayArray9355[i][i_215_] & 0xff) < i_216_)
	    aByteArrayArray9355[i][i_215_] = (byte) i_216_;
    }
    
    void method15058(int i, int i_217_, int i_218_, boolean[][] bools,
		     boolean bool, int i_219_) {
	if (aClass525Array9334 != null) {
	    int i_220_ = i_218_ + i_218_ + 1;
	    i_220_ *= i_220_;
	    if (aClass182_Sub3_9328.anIntArray9831.length < i_220_)
		aClass182_Sub3_9328.anIntArray9831 = new int[i_220_];
	    if ((aClass182_Sub3_9328.aClass525_Sub38_Sub1_9828
		 .buffer).length
		< anInt9330 * 2)
		aClass182_Sub3_9328.aClass525_Sub38_Sub1_9828
		    = new Class525_Sub38_Sub1(anInt9330 * 2);
	    int i_221_ = i - i_218_;
	    int i_222_ = i_221_;
	    if (i_221_ < 0)
		i_221_ = 0;
	    int i_223_ = i_217_ - i_218_;
	    int i_224_ = i_223_;
	    if (i_223_ < 0)
		i_223_ = 0;
	    int i_225_ = i + i_218_;
	    if (i_225_ > anInt1759 * 363736815 - 1)
		i_225_ = anInt1759 * 363736815 - 1;
	    int i_226_ = i_217_ + i_218_;
	    if (i_226_ > anInt1760 * -1152334393 - 1)
		i_226_ = anInt1760 * -1152334393 - 1;
	    int i_227_ = 0;
	    int[] is = aClass182_Sub3_9328.anIntArray9831;
	    for (int i_228_ = i_221_; i_228_ <= i_225_; i_228_++) {
		boolean[] bools_229_ = bools[i_228_ - i_222_];
		for (int i_230_ = i_223_; i_230_ <= i_226_; i_230_++) {
		    if (bools_229_[i_230_ - i_224_])
			is[i_227_++]
			    = i_230_ * (anInt1759 * 363736815) + i_228_;
		}
	    }
	    aClass182_Sub3_9328.method15390();
	    aClass182_Sub3_9328.method15404((anInt9332 & 0x7) != 0);
	    for (int i_231_ = 0; i_231_ < aClass525Array9334.length - 0;
		 i_231_++)
		((Class525_Sub18) aClass525Array9334[i_231_])
		    .method16282(is, i_227_);
	    if (!aClass709_9345.method14363(2066922594)) {
		int i_232_ = aClass182_Sub3_9328.anInt9767;
		int i_233_ = aClass182_Sub3_9328.anInt9768;
		aClass182_Sub3_9328.method3140(0, i_233_,
					       aClass182_Sub3_9328.anInt9769);
		aClass182_Sub3_9328.method15404(false);
		aClass182_Sub3_9328.method15512(false);
		aClass182_Sub3_9328.method15409(128);
		aClass182_Sub3_9328.method15455(-2);
		aClass182_Sub3_9328
		    .method15395(aClass182_Sub3_9328.aClass136_Sub2_9786);
		aClass182_Sub3_9328.method15398(8448, 7681);
		aClass182_Sub3_9328.method15431(0, 34166, 770);
		aClass182_Sub3_9328.method15399(0, 34167, 770);
		for (Class525 class525
			 = aClass709_9345.method14372((short) -8254);
		     class525 != null;
		     class525 = aClass709_9345.method14353(-1820891376)) {
		    Class525_Sub4 class525_sub4 = (Class525_Sub4) class525;
		    class525_sub4.method16108(i, i_217_, i_218_, bools);
		}
		aClass182_Sub3_9328.method15431(0, 5890, 768);
		aClass182_Sub3_9328.method15399(0, 5890, 770);
		aClass182_Sub3_9328.method15395(null);
		aClass182_Sub3_9328.method3140(i_232_, i_233_,
					       aClass182_Sub3_9328.anInt9769);
	    }
	    if (aClass146_9344 != null) {
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
		aClass182_Sub3_9328.method15384(aClass137_9333, null, null,
						aClass137_9326);
		aClass146_9344.method2362(i, i_217_, i_218_, bools, bool);
		OpenGL.glPopMatrix();
	    }
	}
    }
    
    public void method2592(int i, int i_234_, int[] is, int[] is_235_,
			   int[] is_236_, int[] is_237_, int[] is_238_,
			   int[] is_239_, int[] is_240_, int[] is_241_,
			   int[] is_242_, int[] is_243_, int[] is_244_,
			   Class176 class176, boolean bool) {
	int i_245_ = is_241_.length;
	int[] is_246_ = new int[i_245_ * 3];
	int[] is_247_ = new int[i_245_ * 3];
	int[] is_248_ = new int[i_245_ * 3];
	int[] is_249_ = is_242_ != null ? new int[i_245_ * 3] : null;
	int[] is_250_ = new int[i_245_ * 3];
	int[] is_251_ = new int[i_245_ * 3];
	int[] is_252_ = is_235_ != null ? new int[i_245_ * 3] : null;
	int[] is_253_ = is_237_ != null ? new int[i_245_ * 3] : null;
	int i_254_ = 0;
	for (int i_255_ = 0; i_255_ < i_245_; i_255_++) {
	    int i_256_ = is_238_[i_255_];
	    int i_257_ = is_239_[i_255_];
	    int i_258_ = is_240_[i_255_];
	    is_246_[i_254_] = is[i_256_];
	    is_247_[i_254_] = is_236_[i_256_];
	    is_248_[i_254_] = is_241_[i_255_];
	    is_250_[i_254_] = is_243_[i_255_];
	    is_251_[i_254_] = is_244_[i_255_];
	    if (is_242_ != null)
		is_249_[i_254_] = is_242_[i_255_];
	    if (is_235_ != null)
		is_252_[i_254_] = is_235_[i_256_];
	    if (is_237_ != null)
		is_253_[i_254_] = is_237_[i_256_];
	    i_254_++;
	    is_246_[i_254_] = is[i_257_];
	    is_247_[i_254_] = is_236_[i_257_];
	    is_248_[i_254_] = is_241_[i_255_];
	    is_250_[i_254_] = is_243_[i_255_];
	    is_251_[i_254_] = is_244_[i_255_];
	    if (is_242_ != null)
		is_249_[i_254_] = is_242_[i_255_];
	    if (is_235_ != null)
		is_252_[i_254_] = is_235_[i_257_];
	    if (is_237_ != null)
		is_253_[i_254_] = is_237_[i_257_];
	    i_254_++;
	    is_246_[i_254_] = is[i_258_];
	    is_247_[i_254_] = is_236_[i_258_];
	    is_248_[i_254_] = is_241_[i_255_];
	    is_250_[i_254_] = is_243_[i_255_];
	    is_251_[i_254_] = is_244_[i_255_];
	    if (is_242_ != null)
		is_249_[i_254_] = is_242_[i_255_];
	    if (is_235_ != null)
		is_252_[i_254_] = is_235_[i_258_];
	    if (is_237_ != null)
		is_253_[i_254_] = is_237_[i_258_];
	    i_254_++;
	}
	method2576(i, i_234_, is_246_, is_252_, is_247_, is_253_, is_248_,
		   is_249_, is_250_, is_251_, class176, bool);
    }
    
    public boolean method2605(Class525_Sub16_Sub17 class525_sub16_sub17, int i,
			      int i_259_, int i_260_, int i_261_,
			      boolean bool) {
	if (aClass146_9344 == null || class525_sub16_sub17 == null)
	    return false;
	int i_262_ = (i - (i_259_ * aClass182_Sub3_9328.anInt9697 >> 8)
		      >> aClass182_Sub3_9328.anInt9800);
	int i_263_ = (i_260_ - (i_259_ * aClass182_Sub3_9328.anInt9765 >> 8)
		      >> aClass182_Sub3_9328.anInt9800);
	return aClass146_9344.method2380(class525_sub16_sub17, i_262_, i_263_);
    }
    
    public void method2594() {
	if (anInt9341 > 0) {
	    byte[][] is = (new byte[anInt1759 * 363736815 + 1]
			   [anInt1760 * -1152334393 + 1]);
	    for (int i = 1; i < anInt1759 * 363736815; i++) {
		for (int i_264_ = 1; i_264_ < anInt1760 * -1152334393;
		     i_264_++)
		    is[i][i_264_]
			= (byte) ((aByteArrayArray9355[i - 1][i_264_] >> 2)
				  + (aByteArrayArray9355[i + 1][i_264_] >> 3)
				  + (aByteArrayArray9355[i][i_264_ - 1] >> 2)
				  + (aByteArrayArray9355[i][i_264_ + 1] >> 3)
				  + (aByteArrayArray9355[i][i_264_] >> 1));
	    }
	    aClass525Array9334
		= new Class525[aClass10_9358.method687(1939278566)];
	    aClass10_9358.method686(aClass525Array9334, -810123547);
	    for (int i = 0; i < aClass525Array9334.length; i++)
		((Class525_Sub18) aClass525Array9334[i])
		    .method16291(anInt9341);
	    int i = 24;
	    if (anIntArrayArrayArray9346 != null)
		i += 4;
	    if ((anInt9332 & 0x7) != 0)
		i += 12;
	    NativeHeapBuffer nativeheapbuffer
		= aClass182_Sub3_9328.aNativeHeap9766.method1982(anInt9341 * i,
								 false);
	    Stream stream = new Stream(nativeheapbuffer);
	    Class525_Sub18[] class525_sub18s = new Class525_Sub18[anInt9341];
	    int i_265_ = Class696_Sub18.method17142(anInt9341 / 4, (byte) 101);
	    if (i_265_ < 1)
		i_265_ = 1;
	    Class10 class10 = new Class10(i_265_);
	    Class525_Sub18[] class525_sub18s_266_
		= new Class525_Sub18[anInt9353];
	    for (int i_267_ = 0; i_267_ < anInt1759 * 363736815; i_267_++) {
		for (int i_268_ = 0; i_268_ < anInt1760 * -1152334393;
		     i_268_++) {
		    if (anIntArrayArrayArray9337[i_267_][i_268_] != null) {
			Class525_Sub18[] class525_sub18s_269_
			    = (aClass525_Sub18ArrayArrayArray9336[i_267_]
			       [i_268_]);
			int[] is_270_
			    = anIntArrayArrayArray9339[i_267_][i_268_];
			int[] is_271_
			    = anIntArrayArrayArray9352[i_267_][i_268_];
			int[] is_272_
			    = anIntArrayArrayArray9338[i_267_][i_268_];
			int[] is_273_
			    = anIntArrayArrayArray9337[i_267_][i_268_];
			int[] is_274_
			    = (anIntArrayArrayArray9342 != null
			       ? anIntArrayArrayArray9342[i_267_][i_268_]
			       : null);
			int[] is_275_
			    = (anIntArrayArrayArray9346 != null
			       ? anIntArrayArrayArray9346[i_267_][i_268_]
			       : null);
			if (is_272_ == null)
			    is_272_ = is_273_;
			float f = aFloatArrayArray9348[i_267_][i_268_];
			float f_276_ = aFloatArrayArray9354[i_267_][i_268_];
			float f_277_ = aFloatArrayArray9357[i_267_][i_268_];
			float f_278_
			    = aFloatArrayArray9348[i_267_][i_268_ + 1];
			float f_279_
			    = aFloatArrayArray9354[i_267_][i_268_ + 1];
			float f_280_
			    = aFloatArrayArray9357[i_267_][i_268_ + 1];
			float f_281_
			    = aFloatArrayArray9348[i_267_ + 1][i_268_ + 1];
			float f_282_
			    = aFloatArrayArray9354[i_267_ + 1][i_268_ + 1];
			float f_283_
			    = aFloatArrayArray9357[i_267_ + 1][i_268_ + 1];
			float f_284_
			    = aFloatArrayArray9348[i_267_ + 1][i_268_];
			float f_285_
			    = aFloatArrayArray9354[i_267_ + 1][i_268_];
			float f_286_
			    = aFloatArrayArray9357[i_267_ + 1][i_268_];
			int i_287_ = is[i_267_][i_268_] & 0xff;
			int i_288_ = is[i_267_][i_268_ + 1] & 0xff;
			int i_289_ = is[i_267_ + 1][i_268_ + 1] & 0xff;
			int i_290_ = is[i_267_ + 1][i_268_] & 0xff;
			int i_291_ = 0;
		    while_82_:
			for (int i_292_ = 0; i_292_ < is_273_.length;
			     i_292_++) {
			    Class525_Sub18 class525_sub18
				= class525_sub18s_269_[i_292_];
			    for (int i_293_ = 0; i_293_ < i_291_; i_293_++) {
				if (class525_sub18s_266_[i_293_]
				    == class525_sub18)
				    continue while_82_;
			    }
			    class525_sub18s_266_[i_291_++] = class525_sub18;
			}
			short[] is_294_
			    = (aShortArrayArray9335
				   [i_268_ * (anInt1759 * 363736815) + i_267_]
			       = new short[is_273_.length]);
			for (int i_295_ = 0; i_295_ < is_273_.length;
			     i_295_++) {
			    int i_296_ = ((i_267_ << anInt1763 * -2063427645)
					  + is_270_[i_295_]);
			    int i_297_ = ((i_268_ << anInt1763 * -2063427645)
					  + is_271_[i_295_]);
			    int i_298_ = i_296_ >> anInt9329;
			    int i_299_ = i_297_ >> anInt9329;
			    int i_300_ = is_273_[i_295_];
			    int i_301_ = is_272_[i_295_];
			    int i_302_ = is_274_ != null ? is_274_[i_295_] : 0;
			    long l = ((long) i_301_ << 48 | (long) i_300_ << 32
				      | (long) (i_298_ << 16) | (long) i_299_);
			    int i_303_ = is_270_[i_295_];
			    int i_304_ = is_271_[i_295_];
			    int i_305_ = 74;
			    int i_306_ = 0;
			    float f_307_ = 1.0F;
			    float f_308_;
			    float f_309_;
			    float f_310_;
			    if (i_303_ == 0 && i_304_ == 0) {
				f_308_ = f;
				f_309_ = f_276_;
				f_310_ = f_277_;
				i_305_ -= i_287_;
			    } else if (i_303_ == 0
				       && i_304_ == anInt1761 * 435863595) {
				f_308_ = f_278_;
				f_309_ = f_279_;
				f_310_ = f_280_;
				i_305_ -= i_288_;
			    } else if (i_303_ == anInt1761 * 435863595
				       && i_304_ == anInt1761 * 435863595) {
				f_308_ = f_281_;
				f_309_ = f_282_;
				f_310_ = f_283_;
				i_305_ -= i_289_;
			    } else if (i_303_ == anInt1761 * 435863595
				       && i_304_ == 0) {
				f_308_ = f_284_;
				f_309_ = f_285_;
				f_310_ = f_286_;
				i_305_ -= i_290_;
			    } else {
				float f_311_
				    = ((float) i_303_
				       / (float) (anInt1761 * 435863595));
				float f_312_
				    = ((float) i_304_
				       / (float) (anInt1761 * 435863595));
				float f_313_ = f + (f_284_ - f) * f_311_;
				float f_314_
				    = f_276_ + (f_285_ - f_276_) * f_311_;
				float f_315_
				    = f_277_ + (f_286_ - f_277_) * f_311_;
				float f_316_
				    = f_278_ + (f_281_ - f_278_) * f_311_;
				float f_317_
				    = f_279_ + (f_282_ - f_279_) * f_311_;
				float f_318_
				    = f_280_ + (f_283_ - f_280_) * f_311_;
				f_308_ = f_313_ + (f_316_ - f_313_) * f_312_;
				f_309_ = f_314_ + (f_317_ - f_314_) * f_312_;
				f_310_ = f_315_ + (f_318_ - f_315_) * f_312_;
				int i_319_
				    = i_287_ + ((i_290_ - i_287_) * i_303_
						>> anInt1763 * -2063427645);
				int i_320_
				    = i_288_ + ((i_289_ - i_288_) * i_303_
						>> anInt1763 * -2063427645);
				i_305_
				    -= i_319_ + ((i_320_ - i_319_) * i_304_
						 >> anInt1763 * -2063427645);
			    }
			    if (i_300_ != -1) {
				int i_321_ = (i_300_ & 0x7f) * i_305_ >> 7;
				if (i_321_ < 2)
				    i_321_ = 2;
				else if (i_321_ > 126)
				    i_321_ = 126;
				i_306_ = (Class642.anIntArray8324
					  [i_300_ & 0xff80 | i_321_]);
				if ((anInt9332 & 0x7) == 0) {
				    f_307_
					= ((aClass182_Sub3_9328.aFloatArray9660
					    [0]) * f_308_
					   + (aClass182_Sub3_9328
					      .aFloatArray9660[1]) * f_309_
					   + (aClass182_Sub3_9328
					      .aFloatArray9660[2]) * f_310_);
				    f_307_
					= (aClass182_Sub3_9328.aFloat9834
					   + f_307_ * (f_307_ > 0.0F
						       ? (aClass182_Sub3_9328
							  .aFloat9759)
						       : (aClass182_Sub3_9328
							  .aFloat9631)));
				}
			    }
			    Class525 class525 = null;
			    if ((i_296_ & anInt9327 - 1) == 0
				&& (i_297_ & anInt9327 - 1) == 0)
				class525 = class10.method684(l);
			    int i_322_;
			    if (class525 == null) {
				int i_323_;
				if (i_301_ != i_300_) {
				    int i_324_ = (i_301_ & 0x7f) * i_305_ >> 7;
				    if (i_324_ < 2)
					i_324_ = 2;
				    else if (i_324_ > 126)
					i_324_ = 126;
				    i_323_ = (Class642.anIntArray8324
					      [i_301_ & 0xff80 | i_324_]);
				    if ((anInt9332 & 0x7) == 0) {
					float f_325_
					    = ((aClass182_Sub3_9328
						.aFloatArray9660[0]) * f_308_
					       + (aClass182_Sub3_9328
						  .aFloatArray9660[1]) * f_309_
					       + ((aClass182_Sub3_9328
						   .aFloatArray9660[2])
						  * f_310_));
					f_325_
					    = (aClass182_Sub3_9328.aFloat9834
					       + (f_307_
						  * (f_307_ > 0.0F
						     ? (aClass182_Sub3_9328
							.aFloat9759)
						     : (aClass182_Sub3_9328
							.aFloat9631))));
					int i_326_ = i_323_ >> 16 & 0xff;
					int i_327_ = i_323_ >> 8 & 0xff;
					int i_328_ = i_323_ & 0xff;
					i_326_ *= f_325_;
					if (i_326_ < 0)
					    i_326_ = 0;
					else if (i_326_ > 255)
					    i_326_ = 255;
					i_327_ *= f_325_;
					if (i_327_ < 0)
					    i_327_ = 0;
					else if (i_327_ > 255)
					    i_327_ = 255;
					i_328_ *= f_325_;
					if (i_328_ < 0)
					    i_328_ = 0;
					else if (i_328_ > 255)
					    i_328_ = 255;
					i_323_ = (i_326_ << 16 | i_327_ << 8
						  | i_328_);
				    }
				} else
				    i_323_ = i_306_;
				if (aClass182_Sub3_9328.aBool9792) {
				    stream.method1766((float) i_296_);
				    stream.method1766
					((float) (method2619(i_296_, i_297_,
							     -1507377188)
						  + i_302_));
				    stream.method1766((float) i_297_);
				    stream.method1765((byte) (i_323_ >> 16));
				    stream.method1765((byte) (i_323_ >> 8));
				    stream.method1765((byte) i_323_);
				    stream.method1765(-1);
				    stream.method1766((float) i_296_);
				    stream.method1766((float) i_297_);
				    if (anIntArrayArrayArray9346 != null)
					stream.method1766(is_275_ != null
							  ? (float) ((is_275_
								      [i_295_])
								     - 1)
							  : 0.0F);
				    if ((anInt9332 & 0x7) != 0) {
					stream.method1766(f_308_);
					stream.method1766(f_309_);
					stream.method1766(f_310_);
				    }
				} else {
				    stream.method1767((float) i_296_);
				    stream.method1767
					((float) (method2619(i_296_, i_297_,
							     -1169588107)
						  + i_302_));
				    stream.method1767((float) i_297_);
				    stream.method1765((byte) (i_323_ >> 16));
				    stream.method1765((byte) (i_323_ >> 8));
				    stream.method1765((byte) i_323_);
				    stream.method1765(-1);
				    stream.method1767((float) i_296_);
				    stream.method1767((float) i_297_);
				    if (anIntArrayArrayArray9346 != null)
					stream.method1767(is_275_ != null
							  ? (float) ((is_275_
								      [i_295_])
								     - 1)
							  : 0.0F);
				    if ((anInt9332 & 0x7) != 0) {
					stream.method1767(f_308_);
					stream.method1767(f_309_);
					stream.method1767(f_310_);
				    }
				}
				i_322_ = anInt9356++;
				is_294_[i_295_] = (short) i_322_;
				if (i_300_ != -1)
				    class525_sub18s[i_322_]
					= class525_sub18s_269_[i_295_];
				class10.method695(new Class525_Sub20(is_294_
								     [i_295_]),
						  l);
			    } else {
				is_294_[i_295_]
				    = ((Class525_Sub20) class525).aShort10573;
				i_322_ = is_294_[i_295_] & 0xffff;
				if (i_300_ != -1
				    && ((class525_sub18s_269_[i_295_].aLong7113
					 * -5126207504388691097L)
					< (class525_sub18s[i_322_].aLong7113
					   * -5126207504388691097L)))
				    class525_sub18s[i_322_]
					= class525_sub18s_269_[i_295_];
			    }
			    for (int i_329_ = 0; i_329_ < i_291_; i_329_++)
				class525_sub18s_266_[i_329_].method16280
				    (i_322_, i_306_, i_305_, f_307_);
			    anInt9330++;
			}
		    }
		}
	    }
	    for (int i_330_ = 0; i_330_ < anInt9356; i_330_++) {
		Class525_Sub18 class525_sub18 = class525_sub18s[i_330_];
		if (class525_sub18 != null)
		    class525_sub18.method16276(i_330_);
	    }
	    for (int i_331_ = 0; i_331_ < anInt1759 * 363736815; i_331_++) {
		for (int i_332_ = 0; i_332_ < anInt1760 * -1152334393;
		     i_332_++) {
		    short[] is_333_
			= (aShortArrayArray9335
			   [i_332_ * (anInt1759 * 363736815) + i_331_]);
		    if (is_333_ != null) {
			int i_334_ = 0;
			int i_335_ = 0;
			while (i_335_ < is_333_.length) {
			    int i_336_ = is_333_[i_335_++] & 0xffff;
			    int i_337_ = is_333_[i_335_++] & 0xffff;
			    int i_338_ = is_333_[i_335_++] & 0xffff;
			    Class525_Sub18 class525_sub18
				= class525_sub18s[i_336_];
			    Class525_Sub18 class525_sub18_339_
				= class525_sub18s[i_337_];
			    Class525_Sub18 class525_sub18_340_
				= class525_sub18s[i_338_];
			    Class525_Sub18 class525_sub18_341_ = null;
			    if (class525_sub18 != null) {
				class525_sub18.method16279(i_331_, i_332_,
							   i_334_);
				class525_sub18_341_ = class525_sub18;
			    }
			    if (class525_sub18_339_ != null) {
				class525_sub18_339_.method16279(i_331_, i_332_,
								i_334_);
				if (class525_sub18_341_ == null
				    || ((class525_sub18_339_.aLong7113
					 * -5126207504388691097L)
					< (class525_sub18_341_.aLong7113
					   * -5126207504388691097L)))
				    class525_sub18_341_ = class525_sub18_339_;
			    }
			    if (class525_sub18_340_ != null) {
				class525_sub18_340_.method16279(i_331_, i_332_,
								i_334_);
				if (class525_sub18_341_ == null
				    || ((class525_sub18_340_.aLong7113
					 * -5126207504388691097L)
					< (class525_sub18_341_.aLong7113
					   * -5126207504388691097L)))
				    class525_sub18_341_ = class525_sub18_340_;
			    }
			    if (class525_sub18_341_ != null) {
				if (class525_sub18 != null)
				    class525_sub18_341_.method16276(i_336_);
				if (class525_sub18_339_ != null)
				    class525_sub18_341_.method16276(i_337_);
				if (class525_sub18_340_ != null)
				    class525_sub18_341_.method16276(i_338_);
				class525_sub18_341_.method16279(i_331_, i_332_,
								i_334_);
			    }
			    i_334_++;
			}
		    }
		}
	    }
	    stream.method1768();
	    anInterface15_9347
		= aClass182_Sub3_9328.method15381(i, nativeheapbuffer,
						  stream.method1763(), false);
	    if (anInterface15_9347 instanceof Class133_Sub1)
		nativeheapbuffer.method1742();
	    aClass137_9333 = new Class137(anInterface15_9347, 5126, 3, 0);
	    aClass137_9349 = new Class137(anInterface15_9347, 5121, 4, 12);
	    int i_342_;
	    if (anIntArrayArrayArray9346 != null) {
		aClass137_9326 = new Class137(anInterface15_9347, 5126, 3, 16);
		i_342_ = 28;
	    } else {
		aClass137_9326 = new Class137(anInterface15_9347, 5126, 2, 16);
		i_342_ = 24;
	    }
	    if ((anInt9332 & 0x7) != 0)
		aClass137_9350
		    = new Class137(anInterface15_9347, 5126, 3, i_342_);
	    long[] ls = new long[aClass525Array9334.length];
	    for (int i_343_ = 0; i_343_ < aClass525Array9334.length;
		 i_343_++) {
		Class525_Sub18 class525_sub18
		    = (Class525_Sub18) aClass525Array9334[i_343_];
		ls[i_343_] = class525_sub18.aLong7113 * -5126207504388691097L;
		class525_sub18.method16290(anInt9356);
	    }
	    Class305.method5424(ls, aClass525Array9334, -521570706);
	    if (aClass146_9344 != null)
		aClass146_9344.method2361();
	} else
	    aClass146_9344 = null;
	if ((anInt9331 & 0x2) == 0) {
	    anIntArrayArrayArray9352 = null;
	    anIntArrayArrayArray9339 = null;
	    anIntArrayArrayArray9337 = null;
	}
	anIntArrayArrayArray9346 = null;
	anIntArrayArrayArray9338 = null;
	anIntArrayArrayArray9342 = null;
	aClass525_Sub18ArrayArrayArray9336 = null;
	aByteArrayArray9355 = null;
	aClass10_9358 = null;
	aFloatArrayArray9357 = null;
	aFloatArrayArray9354 = null;
	aFloatArrayArray9348 = null;
    }
    
    public void method2600() {
	if (anInt9341 > 0) {
	    byte[][] is = (new byte[anInt1759 * 363736815 + 1]
			   [anInt1760 * -1152334393 + 1]);
	    for (int i = 1; i < anInt1759 * 363736815; i++) {
		for (int i_344_ = 1; i_344_ < anInt1760 * -1152334393;
		     i_344_++)
		    is[i][i_344_]
			= (byte) ((aByteArrayArray9355[i - 1][i_344_] >> 2)
				  + (aByteArrayArray9355[i + 1][i_344_] >> 3)
				  + (aByteArrayArray9355[i][i_344_ - 1] >> 2)
				  + (aByteArrayArray9355[i][i_344_ + 1] >> 3)
				  + (aByteArrayArray9355[i][i_344_] >> 1));
	    }
	    aClass525Array9334
		= new Class525[aClass10_9358.method687(-946237895)];
	    aClass10_9358.method686(aClass525Array9334, -674843726);
	    for (int i = 0; i < aClass525Array9334.length; i++)
		((Class525_Sub18) aClass525Array9334[i])
		    .method16291(anInt9341);
	    int i = 24;
	    if (anIntArrayArrayArray9346 != null)
		i += 4;
	    if ((anInt9332 & 0x7) != 0)
		i += 12;
	    NativeHeapBuffer nativeheapbuffer
		= aClass182_Sub3_9328.aNativeHeap9766.method1982(anInt9341 * i,
								 false);
	    Stream stream = new Stream(nativeheapbuffer);
	    Class525_Sub18[] class525_sub18s = new Class525_Sub18[anInt9341];
	    int i_345_ = Class696_Sub18.method17142(anInt9341 / 4, (byte) 12);
	    if (i_345_ < 1)
		i_345_ = 1;
	    Class10 class10 = new Class10(i_345_);
	    Class525_Sub18[] class525_sub18s_346_
		= new Class525_Sub18[anInt9353];
	    for (int i_347_ = 0; i_347_ < anInt1759 * 363736815; i_347_++) {
		for (int i_348_ = 0; i_348_ < anInt1760 * -1152334393;
		     i_348_++) {
		    if (anIntArrayArrayArray9337[i_347_][i_348_] != null) {
			Class525_Sub18[] class525_sub18s_349_
			    = (aClass525_Sub18ArrayArrayArray9336[i_347_]
			       [i_348_]);
			int[] is_350_
			    = anIntArrayArrayArray9339[i_347_][i_348_];
			int[] is_351_
			    = anIntArrayArrayArray9352[i_347_][i_348_];
			int[] is_352_
			    = anIntArrayArrayArray9338[i_347_][i_348_];
			int[] is_353_
			    = anIntArrayArrayArray9337[i_347_][i_348_];
			int[] is_354_
			    = (anIntArrayArrayArray9342 != null
			       ? anIntArrayArrayArray9342[i_347_][i_348_]
			       : null);
			int[] is_355_
			    = (anIntArrayArrayArray9346 != null
			       ? anIntArrayArrayArray9346[i_347_][i_348_]
			       : null);
			if (is_352_ == null)
			    is_352_ = is_353_;
			float f = aFloatArrayArray9348[i_347_][i_348_];
			float f_356_ = aFloatArrayArray9354[i_347_][i_348_];
			float f_357_ = aFloatArrayArray9357[i_347_][i_348_];
			float f_358_
			    = aFloatArrayArray9348[i_347_][i_348_ + 1];
			float f_359_
			    = aFloatArrayArray9354[i_347_][i_348_ + 1];
			float f_360_
			    = aFloatArrayArray9357[i_347_][i_348_ + 1];
			float f_361_
			    = aFloatArrayArray9348[i_347_ + 1][i_348_ + 1];
			float f_362_
			    = aFloatArrayArray9354[i_347_ + 1][i_348_ + 1];
			float f_363_
			    = aFloatArrayArray9357[i_347_ + 1][i_348_ + 1];
			float f_364_
			    = aFloatArrayArray9348[i_347_ + 1][i_348_];
			float f_365_
			    = aFloatArrayArray9354[i_347_ + 1][i_348_];
			float f_366_
			    = aFloatArrayArray9357[i_347_ + 1][i_348_];
			int i_367_ = is[i_347_][i_348_] & 0xff;
			int i_368_ = is[i_347_][i_348_ + 1] & 0xff;
			int i_369_ = is[i_347_ + 1][i_348_ + 1] & 0xff;
			int i_370_ = is[i_347_ + 1][i_348_] & 0xff;
			int i_371_ = 0;
		    while_84_:
			for (int i_372_ = 0; i_372_ < is_353_.length;
			     i_372_++) {
			    Class525_Sub18 class525_sub18
				= class525_sub18s_349_[i_372_];
			    for (int i_373_ = 0; i_373_ < i_371_; i_373_++) {
				if (class525_sub18s_346_[i_373_]
				    == class525_sub18)
				    continue while_84_;
			    }
			    class525_sub18s_346_[i_371_++] = class525_sub18;
			}
			short[] is_374_
			    = (aShortArrayArray9335
				   [i_348_ * (anInt1759 * 363736815) + i_347_]
			       = new short[is_353_.length]);
			for (int i_375_ = 0; i_375_ < is_353_.length;
			     i_375_++) {
			    int i_376_ = ((i_347_ << anInt1763 * -2063427645)
					  + is_350_[i_375_]);
			    int i_377_ = ((i_348_ << anInt1763 * -2063427645)
					  + is_351_[i_375_]);
			    int i_378_ = i_376_ >> anInt9329;
			    int i_379_ = i_377_ >> anInt9329;
			    int i_380_ = is_353_[i_375_];
			    int i_381_ = is_352_[i_375_];
			    int i_382_ = is_354_ != null ? is_354_[i_375_] : 0;
			    long l = ((long) i_381_ << 48 | (long) i_380_ << 32
				      | (long) (i_378_ << 16) | (long) i_379_);
			    int i_383_ = is_350_[i_375_];
			    int i_384_ = is_351_[i_375_];
			    int i_385_ = 74;
			    int i_386_ = 0;
			    float f_387_ = 1.0F;
			    float f_388_;
			    float f_389_;
			    float f_390_;
			    if (i_383_ == 0 && i_384_ == 0) {
				f_388_ = f;
				f_389_ = f_356_;
				f_390_ = f_357_;
				i_385_ -= i_367_;
			    } else if (i_383_ == 0
				       && i_384_ == anInt1761 * 435863595) {
				f_388_ = f_358_;
				f_389_ = f_359_;
				f_390_ = f_360_;
				i_385_ -= i_368_;
			    } else if (i_383_ == anInt1761 * 435863595
				       && i_384_ == anInt1761 * 435863595) {
				f_388_ = f_361_;
				f_389_ = f_362_;
				f_390_ = f_363_;
				i_385_ -= i_369_;
			    } else if (i_383_ == anInt1761 * 435863595
				       && i_384_ == 0) {
				f_388_ = f_364_;
				f_389_ = f_365_;
				f_390_ = f_366_;
				i_385_ -= i_370_;
			    } else {
				float f_391_
				    = ((float) i_383_
				       / (float) (anInt1761 * 435863595));
				float f_392_
				    = ((float) i_384_
				       / (float) (anInt1761 * 435863595));
				float f_393_ = f + (f_364_ - f) * f_391_;
				float f_394_
				    = f_356_ + (f_365_ - f_356_) * f_391_;
				float f_395_
				    = f_357_ + (f_366_ - f_357_) * f_391_;
				float f_396_
				    = f_358_ + (f_361_ - f_358_) * f_391_;
				float f_397_
				    = f_359_ + (f_362_ - f_359_) * f_391_;
				float f_398_
				    = f_360_ + (f_363_ - f_360_) * f_391_;
				f_388_ = f_393_ + (f_396_ - f_393_) * f_392_;
				f_389_ = f_394_ + (f_397_ - f_394_) * f_392_;
				f_390_ = f_395_ + (f_398_ - f_395_) * f_392_;
				int i_399_
				    = i_367_ + ((i_370_ - i_367_) * i_383_
						>> anInt1763 * -2063427645);
				int i_400_
				    = i_368_ + ((i_369_ - i_368_) * i_383_
						>> anInt1763 * -2063427645);
				i_385_
				    -= i_399_ + ((i_400_ - i_399_) * i_384_
						 >> anInt1763 * -2063427645);
			    }
			    if (i_380_ != -1) {
				int i_401_ = (i_380_ & 0x7f) * i_385_ >> 7;
				if (i_401_ < 2)
				    i_401_ = 2;
				else if (i_401_ > 126)
				    i_401_ = 126;
				i_386_ = (Class642.anIntArray8324
					  [i_380_ & 0xff80 | i_401_]);
				if ((anInt9332 & 0x7) == 0) {
				    f_387_
					= ((aClass182_Sub3_9328.aFloatArray9660
					    [0]) * f_388_
					   + (aClass182_Sub3_9328
					      .aFloatArray9660[1]) * f_389_
					   + (aClass182_Sub3_9328
					      .aFloatArray9660[2]) * f_390_);
				    f_387_
					= (aClass182_Sub3_9328.aFloat9834
					   + f_387_ * (f_387_ > 0.0F
						       ? (aClass182_Sub3_9328
							  .aFloat9759)
						       : (aClass182_Sub3_9328
							  .aFloat9631)));
				}
			    }
			    Class525 class525 = null;
			    if ((i_376_ & anInt9327 - 1) == 0
				&& (i_377_ & anInt9327 - 1) == 0)
				class525 = class10.method684(l);
			    int i_402_;
			    if (class525 == null) {
				int i_403_;
				if (i_381_ != i_380_) {
				    int i_404_ = (i_381_ & 0x7f) * i_385_ >> 7;
				    if (i_404_ < 2)
					i_404_ = 2;
				    else if (i_404_ > 126)
					i_404_ = 126;
				    i_403_ = (Class642.anIntArray8324
					      [i_381_ & 0xff80 | i_404_]);
				    if ((anInt9332 & 0x7) == 0) {
					float f_405_
					    = ((aClass182_Sub3_9328
						.aFloatArray9660[0]) * f_388_
					       + (aClass182_Sub3_9328
						  .aFloatArray9660[1]) * f_389_
					       + ((aClass182_Sub3_9328
						   .aFloatArray9660[2])
						  * f_390_));
					f_405_
					    = (aClass182_Sub3_9328.aFloat9834
					       + (f_387_
						  * (f_387_ > 0.0F
						     ? (aClass182_Sub3_9328
							.aFloat9759)
						     : (aClass182_Sub3_9328
							.aFloat9631))));
					int i_406_ = i_403_ >> 16 & 0xff;
					int i_407_ = i_403_ >> 8 & 0xff;
					int i_408_ = i_403_ & 0xff;
					i_406_ *= f_405_;
					if (i_406_ < 0)
					    i_406_ = 0;
					else if (i_406_ > 255)
					    i_406_ = 255;
					i_407_ *= f_405_;
					if (i_407_ < 0)
					    i_407_ = 0;
					else if (i_407_ > 255)
					    i_407_ = 255;
					i_408_ *= f_405_;
					if (i_408_ < 0)
					    i_408_ = 0;
					else if (i_408_ > 255)
					    i_408_ = 255;
					i_403_ = (i_406_ << 16 | i_407_ << 8
						  | i_408_);
				    }
				} else
				    i_403_ = i_386_;
				if (aClass182_Sub3_9328.aBool9792) {
				    stream.method1766((float) i_376_);
				    stream.method1766
					((float) (method2619(i_376_, i_377_,
							     1745106646)
						  + i_382_));
				    stream.method1766((float) i_377_);
				    stream.method1765((byte) (i_403_ >> 16));
				    stream.method1765((byte) (i_403_ >> 8));
				    stream.method1765((byte) i_403_);
				    stream.method1765(-1);
				    stream.method1766((float) i_376_);
				    stream.method1766((float) i_377_);
				    if (anIntArrayArrayArray9346 != null)
					stream.method1766(is_355_ != null
							  ? (float) ((is_355_
								      [i_375_])
								     - 1)
							  : 0.0F);
				    if ((anInt9332 & 0x7) != 0) {
					stream.method1766(f_388_);
					stream.method1766(f_389_);
					stream.method1766(f_390_);
				    }
				} else {
				    stream.method1767((float) i_376_);
				    stream.method1767
					((float) (method2619(i_376_, i_377_,
							     -732079010)
						  + i_382_));
				    stream.method1767((float) i_377_);
				    stream.method1765((byte) (i_403_ >> 16));
				    stream.method1765((byte) (i_403_ >> 8));
				    stream.method1765((byte) i_403_);
				    stream.method1765(-1);
				    stream.method1767((float) i_376_);
				    stream.method1767((float) i_377_);
				    if (anIntArrayArrayArray9346 != null)
					stream.method1767(is_355_ != null
							  ? (float) ((is_355_
								      [i_375_])
								     - 1)
							  : 0.0F);
				    if ((anInt9332 & 0x7) != 0) {
					stream.method1767(f_388_);
					stream.method1767(f_389_);
					stream.method1767(f_390_);
				    }
				}
				i_402_ = anInt9356++;
				is_374_[i_375_] = (short) i_402_;
				if (i_380_ != -1)
				    class525_sub18s[i_402_]
					= class525_sub18s_349_[i_375_];
				class10.method695(new Class525_Sub20(is_374_
								     [i_375_]),
						  l);
			    } else {
				is_374_[i_375_]
				    = ((Class525_Sub20) class525).aShort10573;
				i_402_ = is_374_[i_375_] & 0xffff;
				if (i_380_ != -1
				    && ((class525_sub18s_349_[i_375_].aLong7113
					 * -5126207504388691097L)
					< (class525_sub18s[i_402_].aLong7113
					   * -5126207504388691097L)))
				    class525_sub18s[i_402_]
					= class525_sub18s_349_[i_375_];
			    }
			    for (int i_409_ = 0; i_409_ < i_371_; i_409_++)
				class525_sub18s_346_[i_409_].method16280
				    (i_402_, i_386_, i_385_, f_387_);
			    anInt9330++;
			}
		    }
		}
	    }
	    for (int i_410_ = 0; i_410_ < anInt9356; i_410_++) {
		Class525_Sub18 class525_sub18 = class525_sub18s[i_410_];
		if (class525_sub18 != null)
		    class525_sub18.method16276(i_410_);
	    }
	    for (int i_411_ = 0; i_411_ < anInt1759 * 363736815; i_411_++) {
		for (int i_412_ = 0; i_412_ < anInt1760 * -1152334393;
		     i_412_++) {
		    short[] is_413_
			= (aShortArrayArray9335
			   [i_412_ * (anInt1759 * 363736815) + i_411_]);
		    if (is_413_ != null) {
			int i_414_ = 0;
			int i_415_ = 0;
			while (i_415_ < is_413_.length) {
			    int i_416_ = is_413_[i_415_++] & 0xffff;
			    int i_417_ = is_413_[i_415_++] & 0xffff;
			    int i_418_ = is_413_[i_415_++] & 0xffff;
			    Class525_Sub18 class525_sub18
				= class525_sub18s[i_416_];
			    Class525_Sub18 class525_sub18_419_
				= class525_sub18s[i_417_];
			    Class525_Sub18 class525_sub18_420_
				= class525_sub18s[i_418_];
			    Class525_Sub18 class525_sub18_421_ = null;
			    if (class525_sub18 != null) {
				class525_sub18.method16279(i_411_, i_412_,
							   i_414_);
				class525_sub18_421_ = class525_sub18;
			    }
			    if (class525_sub18_419_ != null) {
				class525_sub18_419_.method16279(i_411_, i_412_,
								i_414_);
				if (class525_sub18_421_ == null
				    || ((class525_sub18_419_.aLong7113
					 * -5126207504388691097L)
					< (class525_sub18_421_.aLong7113
					   * -5126207504388691097L)))
				    class525_sub18_421_ = class525_sub18_419_;
			    }
			    if (class525_sub18_420_ != null) {
				class525_sub18_420_.method16279(i_411_, i_412_,
								i_414_);
				if (class525_sub18_421_ == null
				    || ((class525_sub18_420_.aLong7113
					 * -5126207504388691097L)
					< (class525_sub18_421_.aLong7113
					   * -5126207504388691097L)))
				    class525_sub18_421_ = class525_sub18_420_;
			    }
			    if (class525_sub18_421_ != null) {
				if (class525_sub18 != null)
				    class525_sub18_421_.method16276(i_416_);
				if (class525_sub18_419_ != null)
				    class525_sub18_421_.method16276(i_417_);
				if (class525_sub18_420_ != null)
				    class525_sub18_421_.method16276(i_418_);
				class525_sub18_421_.method16279(i_411_, i_412_,
								i_414_);
			    }
			    i_414_++;
			}
		    }
		}
	    }
	    stream.method1768();
	    anInterface15_9347
		= aClass182_Sub3_9328.method15381(i, nativeheapbuffer,
						  stream.method1763(), false);
	    if (anInterface15_9347 instanceof Class133_Sub1)
		nativeheapbuffer.method1742();
	    aClass137_9333 = new Class137(anInterface15_9347, 5126, 3, 0);
	    aClass137_9349 = new Class137(anInterface15_9347, 5121, 4, 12);
	    int i_422_;
	    if (anIntArrayArrayArray9346 != null) {
		aClass137_9326 = new Class137(anInterface15_9347, 5126, 3, 16);
		i_422_ = 28;
	    } else {
		aClass137_9326 = new Class137(anInterface15_9347, 5126, 2, 16);
		i_422_ = 24;
	    }
	    if ((anInt9332 & 0x7) != 0)
		aClass137_9350
		    = new Class137(anInterface15_9347, 5126, 3, i_422_);
	    long[] ls = new long[aClass525Array9334.length];
	    for (int i_423_ = 0; i_423_ < aClass525Array9334.length;
		 i_423_++) {
		Class525_Sub18 class525_sub18
		    = (Class525_Sub18) aClass525Array9334[i_423_];
		ls[i_423_] = class525_sub18.aLong7113 * -5126207504388691097L;
		class525_sub18.method16290(anInt9356);
	    }
	    Class305.method5424(ls, aClass525Array9334, -961267217);
	    if (aClass146_9344 != null)
		aClass146_9344.method2361();
	} else
	    aClass146_9344 = null;
	if ((anInt9331 & 0x2) == 0) {
	    anIntArrayArrayArray9352 = null;
	    anIntArrayArrayArray9339 = null;
	    anIntArrayArrayArray9337 = null;
	}
	anIntArrayArrayArray9346 = null;
	anIntArrayArrayArray9338 = null;
	anIntArrayArrayArray9342 = null;
	aClass525_Sub18ArrayArrayArray9336 = null;
	aByteArrayArray9355 = null;
	aClass10_9358 = null;
	aFloatArrayArray9357 = null;
	aFloatArrayArray9354 = null;
	aFloatArrayArray9348 = null;
    }
    
    public void method2599(int i, int i_424_, int i_425_, int i_426_,
			   int i_427_, int i_428_, int i_429_,
			   boolean[][] bools) {
	Class168 class168 = aClass182_Sub3_9328.method3566(-1825366826);
	if (anInt9341 > 0 && class168 != null) {
	    aClass182_Sub3_9328.method15361();
	    aClass182_Sub3_9328.method15549(false);
	    aClass182_Sub3_9328.method15404(false);
	    aClass182_Sub3_9328.method15406(false);
	    aClass182_Sub3_9328.method15512(false);
	    aClass182_Sub3_9328.method15409(0);
	    aClass182_Sub3_9328.method15455(-2);
	    aClass182_Sub3_9328.method15395(null);
	    aFloatArray9359[0]
		= (float) i_425_ / (128.0F * (float) (anInt1761 * 435863595)
				    * (float) class168.method2710());
	    aFloatArray9359[1] = 0.0F;
	    aFloatArray9359[2] = 0.0F;
	    aFloatArray9359[3] = 0.0F;
	    aFloatArray9359[4] = 0.0F;
	    aFloatArray9359[5]
		= (float) i_425_ / (128.0F * (float) (anInt1761 * 435863595)
				    * (float) class168.method2711());
	    aFloatArray9359[6] = 0.0F;
	    aFloatArray9359[7] = 0.0F;
	    aFloatArray9359[8] = 0.0F;
	    aFloatArray9359[9] = 0.0F;
	    aFloatArray9359[10] = 0.0F;
	    aFloatArray9359[11] = 0.0F;
	    aFloatArray9359[12]
		= -1.0F - ((float) (i_426_ * i_425_) / 128.0F
			   - (float) (i * 2)) / (float) class168.method2710();
	    aFloatArray9359[13]
		= 1.0F - (((float) (2 * i_424_)
			   + (float) (i_429_ * i_425_) / 128.0F)
			  / (float) class168.method2711());
	    aFloatArray9359[14] = 0.0F;
	    aFloatArray9359[15] = 1.0F;
	    OpenGL.glMatrixMode(5889);
	    OpenGL.glLoadMatrixf(aFloatArray9359, 0);
	    aFloatArray9359[0] = 1.0F;
	    aFloatArray9359[1] = 0.0F;
	    aFloatArray9359[2] = 0.0F;
	    aFloatArray9359[3] = 0.0F;
	    aFloatArray9359[4] = 0.0F;
	    aFloatArray9359[5] = 0.0F;
	    aFloatArray9359[6] = 1.0F;
	    aFloatArray9359[7] = 0.0F;
	    aFloatArray9359[8] = 0.0F;
	    aFloatArray9359[9] = 1.0F;
	    aFloatArray9359[10] = 0.0F;
	    aFloatArray9359[11] = 0.0F;
	    aFloatArray9359[12] = 0.0F;
	    aFloatArray9359[13] = 0.0F;
	    aFloatArray9359[14] = 0.0F;
	    aFloatArray9359[15] = 1.0F;
	    OpenGL.glMatrixMode(5888);
	    OpenGL.glLoadMatrixf(aFloatArray9359, 0);
	    if ((anInt9332 & 0x7) != 0) {
		aClass182_Sub3_9328.method15404(true);
		aClass182_Sub3_9328.method15371();
	    } else
		aClass182_Sub3_9328.method15404(false);
	    aClass182_Sub3_9328.method15384(aClass137_9333, aClass137_9350,
					    aClass137_9349, aClass137_9326);
	    if ((aClass182_Sub3_9328.aClass525_Sub38_Sub1_9828
		 .buffer).length
		< anInt9330 * 2)
		aClass182_Sub3_9328.aClass525_Sub38_Sub1_9828
		    = new Class525_Sub38_Sub1(anInt9330 * 2);
	    else
		aClass182_Sub3_9328.aClass525_Sub38_Sub1_9828.index = 0;
	    int i_430_ = 0;
	    Class525_Sub38_Sub1 class525_sub38_sub1
		= aClass182_Sub3_9328.aClass525_Sub38_Sub1_9828;
	    if (aClass182_Sub3_9328.aBool9792) {
		for (int i_431_ = i_427_; i_431_ < i_429_; i_431_++) {
		    int i_432_ = i_431_ * (anInt1759 * 363736815) + i_426_;
		    for (int i_433_ = i_426_; i_433_ < i_428_; i_433_++) {
			if (bools[i_433_ - i_426_][i_431_ - i_427_]) {
			    short[] is = aShortArrayArray9335[i_432_];
			    if (is != null) {
				for (int i_434_ = 0; i_434_ < is.length;
				     i_434_++) {
				    class525_sub38_sub1.method16602((is[i_434_]
								     & 0xffff),
								    632497090);
				    i_430_++;
				}
			    }
			}
			i_432_++;
		    }
		}
	    } else {
		for (int i_435_ = i_427_; i_435_ < i_429_; i_435_++) {
		    int i_436_ = i_435_ * (anInt1759 * 363736815) + i_426_;
		    for (int i_437_ = i_426_; i_437_ < i_428_; i_437_++) {
			if (bools[i_437_ - i_426_][i_435_ - i_427_]) {
			    short[] is = aShortArrayArray9335[i_436_];
			    if (is != null) {
				for (int i_438_ = 0; i_438_ < is.length;
				     i_438_++) {
				    class525_sub38_sub1.method16840((is[i_438_]
								     & 0xffff),
								    241387851);
				    i_430_++;
				}
			    }
			}
			i_436_++;
		    }
		}
	    }
	    if (i_430_ > 0) {
		Class121_Sub2 class121_sub2
		    = new Class121_Sub2(aClass182_Sub3_9328, 5123,
					class525_sub38_sub1.buffer,
					(class525_sub38_sub1.index
					 * -1133521593));
		aClass182_Sub3_9328.method15427(class121_sub2, 4, 0, i_430_);
	    }
	}
    }
    
    public void method2612(int i, int i_439_, int i_440_, boolean[][] bools,
			   boolean bool, int i_441_) {
	method15059(i, i_439_, i_440_, bools, bool, i_441_);
    }
    
    public void method2583() {
	if (anInt9341 > 0) {
	    byte[][] is = (new byte[anInt1759 * 363736815 + 1]
			   [anInt1760 * -1152334393 + 1]);
	    for (int i = 1; i < anInt1759 * 363736815; i++) {
		for (int i_442_ = 1; i_442_ < anInt1760 * -1152334393;
		     i_442_++)
		    is[i][i_442_]
			= (byte) ((aByteArrayArray9355[i - 1][i_442_] >> 2)
				  + (aByteArrayArray9355[i + 1][i_442_] >> 3)
				  + (aByteArrayArray9355[i][i_442_ - 1] >> 2)
				  + (aByteArrayArray9355[i][i_442_ + 1] >> 3)
				  + (aByteArrayArray9355[i][i_442_] >> 1));
	    }
	    aClass525Array9334
		= new Class525[aClass10_9358.method687(-883516189)];
	    aClass10_9358.method686(aClass525Array9334, -1387292240);
	    for (int i = 0; i < aClass525Array9334.length; i++)
		((Class525_Sub18) aClass525Array9334[i])
		    .method16291(anInt9341);
	    int i = 24;
	    if (anIntArrayArrayArray9346 != null)
		i += 4;
	    if ((anInt9332 & 0x7) != 0)
		i += 12;
	    NativeHeapBuffer nativeheapbuffer
		= aClass182_Sub3_9328.aNativeHeap9766.method1982(anInt9341 * i,
								 false);
	    Stream stream = new Stream(nativeheapbuffer);
	    Class525_Sub18[] class525_sub18s = new Class525_Sub18[anInt9341];
	    int i_443_ = Class696_Sub18.method17142(anInt9341 / 4, (byte) 33);
	    if (i_443_ < 1)
		i_443_ = 1;
	    Class10 class10 = new Class10(i_443_);
	    Class525_Sub18[] class525_sub18s_444_
		= new Class525_Sub18[anInt9353];
	    for (int i_445_ = 0; i_445_ < anInt1759 * 363736815; i_445_++) {
		for (int i_446_ = 0; i_446_ < anInt1760 * -1152334393;
		     i_446_++) {
		    if (anIntArrayArrayArray9337[i_445_][i_446_] != null) {
			Class525_Sub18[] class525_sub18s_447_
			    = (aClass525_Sub18ArrayArrayArray9336[i_445_]
			       [i_446_]);
			int[] is_448_
			    = anIntArrayArrayArray9339[i_445_][i_446_];
			int[] is_449_
			    = anIntArrayArrayArray9352[i_445_][i_446_];
			int[] is_450_
			    = anIntArrayArrayArray9338[i_445_][i_446_];
			int[] is_451_
			    = anIntArrayArrayArray9337[i_445_][i_446_];
			int[] is_452_
			    = (anIntArrayArrayArray9342 != null
			       ? anIntArrayArrayArray9342[i_445_][i_446_]
			       : null);
			int[] is_453_
			    = (anIntArrayArrayArray9346 != null
			       ? anIntArrayArrayArray9346[i_445_][i_446_]
			       : null);
			if (is_450_ == null)
			    is_450_ = is_451_;
			float f = aFloatArrayArray9348[i_445_][i_446_];
			float f_454_ = aFloatArrayArray9354[i_445_][i_446_];
			float f_455_ = aFloatArrayArray9357[i_445_][i_446_];
			float f_456_
			    = aFloatArrayArray9348[i_445_][i_446_ + 1];
			float f_457_
			    = aFloatArrayArray9354[i_445_][i_446_ + 1];
			float f_458_
			    = aFloatArrayArray9357[i_445_][i_446_ + 1];
			float f_459_
			    = aFloatArrayArray9348[i_445_ + 1][i_446_ + 1];
			float f_460_
			    = aFloatArrayArray9354[i_445_ + 1][i_446_ + 1];
			float f_461_
			    = aFloatArrayArray9357[i_445_ + 1][i_446_ + 1];
			float f_462_
			    = aFloatArrayArray9348[i_445_ + 1][i_446_];
			float f_463_
			    = aFloatArrayArray9354[i_445_ + 1][i_446_];
			float f_464_
			    = aFloatArrayArray9357[i_445_ + 1][i_446_];
			int i_465_ = is[i_445_][i_446_] & 0xff;
			int i_466_ = is[i_445_][i_446_ + 1] & 0xff;
			int i_467_ = is[i_445_ + 1][i_446_ + 1] & 0xff;
			int i_468_ = is[i_445_ + 1][i_446_] & 0xff;
			int i_469_ = 0;
		    while_86_:
			for (int i_470_ = 0; i_470_ < is_451_.length;
			     i_470_++) {
			    Class525_Sub18 class525_sub18
				= class525_sub18s_447_[i_470_];
			    for (int i_471_ = 0; i_471_ < i_469_; i_471_++) {
				if (class525_sub18s_444_[i_471_]
				    == class525_sub18)
				    continue while_86_;
			    }
			    class525_sub18s_444_[i_469_++] = class525_sub18;
			}
			short[] is_472_
			    = (aShortArrayArray9335
				   [i_446_ * (anInt1759 * 363736815) + i_445_]
			       = new short[is_451_.length]);
			for (int i_473_ = 0; i_473_ < is_451_.length;
			     i_473_++) {
			    int i_474_ = ((i_445_ << anInt1763 * -2063427645)
					  + is_448_[i_473_]);
			    int i_475_ = ((i_446_ << anInt1763 * -2063427645)
					  + is_449_[i_473_]);
			    int i_476_ = i_474_ >> anInt9329;
			    int i_477_ = i_475_ >> anInt9329;
			    int i_478_ = is_451_[i_473_];
			    int i_479_ = is_450_[i_473_];
			    int i_480_ = is_452_ != null ? is_452_[i_473_] : 0;
			    long l = ((long) i_479_ << 48 | (long) i_478_ << 32
				      | (long) (i_476_ << 16) | (long) i_477_);
			    int i_481_ = is_448_[i_473_];
			    int i_482_ = is_449_[i_473_];
			    int i_483_ = 74;
			    int i_484_ = 0;
			    float f_485_ = 1.0F;
			    float f_486_;
			    float f_487_;
			    float f_488_;
			    if (i_481_ == 0 && i_482_ == 0) {
				f_486_ = f;
				f_487_ = f_454_;
				f_488_ = f_455_;
				i_483_ -= i_465_;
			    } else if (i_481_ == 0
				       && i_482_ == anInt1761 * 435863595) {
				f_486_ = f_456_;
				f_487_ = f_457_;
				f_488_ = f_458_;
				i_483_ -= i_466_;
			    } else if (i_481_ == anInt1761 * 435863595
				       && i_482_ == anInt1761 * 435863595) {
				f_486_ = f_459_;
				f_487_ = f_460_;
				f_488_ = f_461_;
				i_483_ -= i_467_;
			    } else if (i_481_ == anInt1761 * 435863595
				       && i_482_ == 0) {
				f_486_ = f_462_;
				f_487_ = f_463_;
				f_488_ = f_464_;
				i_483_ -= i_468_;
			    } else {
				float f_489_
				    = ((float) i_481_
				       / (float) (anInt1761 * 435863595));
				float f_490_
				    = ((float) i_482_
				       / (float) (anInt1761 * 435863595));
				float f_491_ = f + (f_462_ - f) * f_489_;
				float f_492_
				    = f_454_ + (f_463_ - f_454_) * f_489_;
				float f_493_
				    = f_455_ + (f_464_ - f_455_) * f_489_;
				float f_494_
				    = f_456_ + (f_459_ - f_456_) * f_489_;
				float f_495_
				    = f_457_ + (f_460_ - f_457_) * f_489_;
				float f_496_
				    = f_458_ + (f_461_ - f_458_) * f_489_;
				f_486_ = f_491_ + (f_494_ - f_491_) * f_490_;
				f_487_ = f_492_ + (f_495_ - f_492_) * f_490_;
				f_488_ = f_493_ + (f_496_ - f_493_) * f_490_;
				int i_497_
				    = i_465_ + ((i_468_ - i_465_) * i_481_
						>> anInt1763 * -2063427645);
				int i_498_
				    = i_466_ + ((i_467_ - i_466_) * i_481_
						>> anInt1763 * -2063427645);
				i_483_
				    -= i_497_ + ((i_498_ - i_497_) * i_482_
						 >> anInt1763 * -2063427645);
			    }
			    if (i_478_ != -1) {
				int i_499_ = (i_478_ & 0x7f) * i_483_ >> 7;
				if (i_499_ < 2)
				    i_499_ = 2;
				else if (i_499_ > 126)
				    i_499_ = 126;
				i_484_ = (Class642.anIntArray8324
					  [i_478_ & 0xff80 | i_499_]);
				if ((anInt9332 & 0x7) == 0) {
				    f_485_
					= ((aClass182_Sub3_9328.aFloatArray9660
					    [0]) * f_486_
					   + (aClass182_Sub3_9328
					      .aFloatArray9660[1]) * f_487_
					   + (aClass182_Sub3_9328
					      .aFloatArray9660[2]) * f_488_);
				    f_485_
					= (aClass182_Sub3_9328.aFloat9834
					   + f_485_ * (f_485_ > 0.0F
						       ? (aClass182_Sub3_9328
							  .aFloat9759)
						       : (aClass182_Sub3_9328
							  .aFloat9631)));
				}
			    }
			    Class525 class525 = null;
			    if ((i_474_ & anInt9327 - 1) == 0
				&& (i_475_ & anInt9327 - 1) == 0)
				class525 = class10.method684(l);
			    int i_500_;
			    if (class525 == null) {
				int i_501_;
				if (i_479_ != i_478_) {
				    int i_502_ = (i_479_ & 0x7f) * i_483_ >> 7;
				    if (i_502_ < 2)
					i_502_ = 2;
				    else if (i_502_ > 126)
					i_502_ = 126;
				    i_501_ = (Class642.anIntArray8324
					      [i_479_ & 0xff80 | i_502_]);
				    if ((anInt9332 & 0x7) == 0) {
					float f_503_
					    = ((aClass182_Sub3_9328
						.aFloatArray9660[0]) * f_486_
					       + (aClass182_Sub3_9328
						  .aFloatArray9660[1]) * f_487_
					       + ((aClass182_Sub3_9328
						   .aFloatArray9660[2])
						  * f_488_));
					f_503_
					    = (aClass182_Sub3_9328.aFloat9834
					       + (f_485_
						  * (f_485_ > 0.0F
						     ? (aClass182_Sub3_9328
							.aFloat9759)
						     : (aClass182_Sub3_9328
							.aFloat9631))));
					int i_504_ = i_501_ >> 16 & 0xff;
					int i_505_ = i_501_ >> 8 & 0xff;
					int i_506_ = i_501_ & 0xff;
					i_504_ *= f_503_;
					if (i_504_ < 0)
					    i_504_ = 0;
					else if (i_504_ > 255)
					    i_504_ = 255;
					i_505_ *= f_503_;
					if (i_505_ < 0)
					    i_505_ = 0;
					else if (i_505_ > 255)
					    i_505_ = 255;
					i_506_ *= f_503_;
					if (i_506_ < 0)
					    i_506_ = 0;
					else if (i_506_ > 255)
					    i_506_ = 255;
					i_501_ = (i_504_ << 16 | i_505_ << 8
						  | i_506_);
				    }
				} else
				    i_501_ = i_484_;
				if (aClass182_Sub3_9328.aBool9792) {
				    stream.method1766((float) i_474_);
				    stream.method1766
					((float) (method2619(i_474_, i_475_,
							     -2005289157)
						  + i_480_));
				    stream.method1766((float) i_475_);
				    stream.method1765((byte) (i_501_ >> 16));
				    stream.method1765((byte) (i_501_ >> 8));
				    stream.method1765((byte) i_501_);
				    stream.method1765(-1);
				    stream.method1766((float) i_474_);
				    stream.method1766((float) i_475_);
				    if (anIntArrayArrayArray9346 != null)
					stream.method1766(is_453_ != null
							  ? (float) ((is_453_
								      [i_473_])
								     - 1)
							  : 0.0F);
				    if ((anInt9332 & 0x7) != 0) {
					stream.method1766(f_486_);
					stream.method1766(f_487_);
					stream.method1766(f_488_);
				    }
				} else {
				    stream.method1767((float) i_474_);
				    stream.method1767
					((float) (method2619(i_474_, i_475_,
							     44440255)
						  + i_480_));
				    stream.method1767((float) i_475_);
				    stream.method1765((byte) (i_501_ >> 16));
				    stream.method1765((byte) (i_501_ >> 8));
				    stream.method1765((byte) i_501_);
				    stream.method1765(-1);
				    stream.method1767((float) i_474_);
				    stream.method1767((float) i_475_);
				    if (anIntArrayArrayArray9346 != null)
					stream.method1767(is_453_ != null
							  ? (float) ((is_453_
								      [i_473_])
								     - 1)
							  : 0.0F);
				    if ((anInt9332 & 0x7) != 0) {
					stream.method1767(f_486_);
					stream.method1767(f_487_);
					stream.method1767(f_488_);
				    }
				}
				i_500_ = anInt9356++;
				is_472_[i_473_] = (short) i_500_;
				if (i_478_ != -1)
				    class525_sub18s[i_500_]
					= class525_sub18s_447_[i_473_];
				class10.method695(new Class525_Sub20(is_472_
								     [i_473_]),
						  l);
			    } else {
				is_472_[i_473_]
				    = ((Class525_Sub20) class525).aShort10573;
				i_500_ = is_472_[i_473_] & 0xffff;
				if (i_478_ != -1
				    && ((class525_sub18s_447_[i_473_].aLong7113
					 * -5126207504388691097L)
					< (class525_sub18s[i_500_].aLong7113
					   * -5126207504388691097L)))
				    class525_sub18s[i_500_]
					= class525_sub18s_447_[i_473_];
			    }
			    for (int i_507_ = 0; i_507_ < i_469_; i_507_++)
				class525_sub18s_444_[i_507_].method16280
				    (i_500_, i_484_, i_483_, f_485_);
			    anInt9330++;
			}
		    }
		}
	    }
	    for (int i_508_ = 0; i_508_ < anInt9356; i_508_++) {
		Class525_Sub18 class525_sub18 = class525_sub18s[i_508_];
		if (class525_sub18 != null)
		    class525_sub18.method16276(i_508_);
	    }
	    for (int i_509_ = 0; i_509_ < anInt1759 * 363736815; i_509_++) {
		for (int i_510_ = 0; i_510_ < anInt1760 * -1152334393;
		     i_510_++) {
		    short[] is_511_
			= (aShortArrayArray9335
			   [i_510_ * (anInt1759 * 363736815) + i_509_]);
		    if (is_511_ != null) {
			int i_512_ = 0;
			int i_513_ = 0;
			while (i_513_ < is_511_.length) {
			    int i_514_ = is_511_[i_513_++] & 0xffff;
			    int i_515_ = is_511_[i_513_++] & 0xffff;
			    int i_516_ = is_511_[i_513_++] & 0xffff;
			    Class525_Sub18 class525_sub18
				= class525_sub18s[i_514_];
			    Class525_Sub18 class525_sub18_517_
				= class525_sub18s[i_515_];
			    Class525_Sub18 class525_sub18_518_
				= class525_sub18s[i_516_];
			    Class525_Sub18 class525_sub18_519_ = null;
			    if (class525_sub18 != null) {
				class525_sub18.method16279(i_509_, i_510_,
							   i_512_);
				class525_sub18_519_ = class525_sub18;
			    }
			    if (class525_sub18_517_ != null) {
				class525_sub18_517_.method16279(i_509_, i_510_,
								i_512_);
				if (class525_sub18_519_ == null
				    || ((class525_sub18_517_.aLong7113
					 * -5126207504388691097L)
					< (class525_sub18_519_.aLong7113
					   * -5126207504388691097L)))
				    class525_sub18_519_ = class525_sub18_517_;
			    }
			    if (class525_sub18_518_ != null) {
				class525_sub18_518_.method16279(i_509_, i_510_,
								i_512_);
				if (class525_sub18_519_ == null
				    || ((class525_sub18_518_.aLong7113
					 * -5126207504388691097L)
					< (class525_sub18_519_.aLong7113
					   * -5126207504388691097L)))
				    class525_sub18_519_ = class525_sub18_518_;
			    }
			    if (class525_sub18_519_ != null) {
				if (class525_sub18 != null)
				    class525_sub18_519_.method16276(i_514_);
				if (class525_sub18_517_ != null)
				    class525_sub18_519_.method16276(i_515_);
				if (class525_sub18_518_ != null)
				    class525_sub18_519_.method16276(i_516_);
				class525_sub18_519_.method16279(i_509_, i_510_,
								i_512_);
			    }
			    i_512_++;
			}
		    }
		}
	    }
	    stream.method1768();
	    anInterface15_9347
		= aClass182_Sub3_9328.method15381(i, nativeheapbuffer,
						  stream.method1763(), false);
	    if (anInterface15_9347 instanceof Class133_Sub1)
		nativeheapbuffer.method1742();
	    aClass137_9333 = new Class137(anInterface15_9347, 5126, 3, 0);
	    aClass137_9349 = new Class137(anInterface15_9347, 5121, 4, 12);
	    int i_520_;
	    if (anIntArrayArrayArray9346 != null) {
		aClass137_9326 = new Class137(anInterface15_9347, 5126, 3, 16);
		i_520_ = 28;
	    } else {
		aClass137_9326 = new Class137(anInterface15_9347, 5126, 2, 16);
		i_520_ = 24;
	    }
	    if ((anInt9332 & 0x7) != 0)
		aClass137_9350
		    = new Class137(anInterface15_9347, 5126, 3, i_520_);
	    long[] ls = new long[aClass525Array9334.length];
	    for (int i_521_ = 0; i_521_ < aClass525Array9334.length;
		 i_521_++) {
		Class525_Sub18 class525_sub18
		    = (Class525_Sub18) aClass525Array9334[i_521_];
		ls[i_521_] = class525_sub18.aLong7113 * -5126207504388691097L;
		class525_sub18.method16290(anInt9356);
	    }
	    Class305.method5424(ls, aClass525Array9334, -871690472);
	    if (aClass146_9344 != null)
		aClass146_9344.method2361();
	} else
	    aClass146_9344 = null;
	if ((anInt9331 & 0x2) == 0) {
	    anIntArrayArrayArray9352 = null;
	    anIntArrayArrayArray9339 = null;
	    anIntArrayArrayArray9337 = null;
	}
	anIntArrayArrayArray9346 = null;
	anIntArrayArrayArray9338 = null;
	anIntArrayArrayArray9342 = null;
	aClass525_Sub18ArrayArrayArray9336 = null;
	aByteArrayArray9355 = null;
	aClass10_9358 = null;
	aFloatArrayArray9357 = null;
	aFloatArrayArray9354 = null;
	aFloatArrayArray9348 = null;
    }
    
    public void method2598(int i, int i_522_, int i_523_, boolean[][] bools,
			   boolean bool, int i_524_) {
	method15059(i, i_522_, i_523_, bools, bool, i_524_);
    }
    
    public Class525_Sub16_Sub17 method2581
	(int i, int i_525_, Class525_Sub16_Sub17 class525_sub16_sub17) {
	if ((aByteArrayArray9343[i][i_525_] & 0x1) == 0)
	    return null;
	int i_526_ = anInt1761 * 435863595 >> aClass182_Sub3_9328.anInt9800;
	Class525_Sub16_Sub17_Sub1 class525_sub16_sub17_sub1
	    = (Class525_Sub16_Sub17_Sub1) class525_sub16_sub17;
	Class525_Sub16_Sub17_Sub1 class525_sub16_sub17_sub1_527_;
	if (class525_sub16_sub17_sub1 != null
	    && class525_sub16_sub17_sub1.method18760(i_526_, i_526_)) {
	    class525_sub16_sub17_sub1_527_ = class525_sub16_sub17_sub1;
	    class525_sub16_sub17_sub1_527_.method18761();
	} else
	    class525_sub16_sub17_sub1_527_
		= new Class525_Sub16_Sub17_Sub1(aClass182_Sub3_9328, i_526_,
						i_526_);
	class525_sub16_sub17_sub1_527_.method18770(0, 0, i_526_, i_526_);
	method15056(class525_sub16_sub17_sub1_527_, i, i_525_);
	return class525_sub16_sub17_sub1_527_;
    }
    
    public void method2614(Class525_Sub21 class525_sub21, int[] is) {
	aClass709_9345.method14345(new Class525_Sub4(aClass182_Sub3_9328, this,
						     class525_sub21, is),
				   (byte) 0);
    }
    
    public void method2595(Class525_Sub16_Sub17 class525_sub16_sub17, int i,
			   int i_528_, int i_529_, int i_530_, boolean bool) {
	if (aClass146_9344 != null && class525_sub16_sub17 != null) {
	    int i_531_ = (i - (i_528_ * aClass182_Sub3_9328.anInt9697 >> 8)
			  >> aClass182_Sub3_9328.anInt9800);
	    int i_532_
		= (i_529_ - (i_528_ * aClass182_Sub3_9328.anInt9765 >> 8)
		   >> aClass182_Sub3_9328.anInt9800);
	    aClass146_9344.method2377(class525_sub16_sub17, i_531_, i_532_);
	}
    }
    
    public void method2616(int i, int i_533_, int[] is, int[] is_534_,
			   int[] is_535_, int[] is_536_, int[] is_537_,
			   int[] is_538_, int[] is_539_, int[] is_540_,
			   Class176 class176, boolean bool) {
	Textures class180 = aClass182_Sub3_9328.aClass180_1944;
	if (is_536_ != null && anIntArrayArrayArray9346 == null)
	    anIntArrayArrayArray9346
		= new int[anInt1759 * 363736815][anInt1760 * -1152334393][];
	if (is_534_ != null && anIntArrayArrayArray9342 == null)
	    anIntArrayArrayArray9342
		= new int[anInt1759 * 363736815][anInt1760 * -1152334393][];
	anIntArrayArrayArray9339[i][i_533_] = is;
	anIntArrayArrayArray9352[i][i_533_] = is_535_;
	anIntArrayArrayArray9337[i][i_533_] = is_537_;
	anIntArrayArrayArray9338[i][i_533_] = is_538_;
	if (anIntArrayArrayArray9346 != null)
	    anIntArrayArrayArray9346[i][i_533_] = is_536_;
	if (anIntArrayArrayArray9342 != null)
	    anIntArrayArrayArray9342[i][i_533_] = is_534_;
	Class525_Sub18[] class525_sub18s
	    = (aClass525_Sub18ArrayArrayArray9336[i][i_533_]
	       = new Class525_Sub18[is_537_.length]);
	for (int i_541_ = 0; i_541_ < is_537_.length; i_541_++) {
	    int i_542_ = is_539_[i_541_];
	    int i_543_ = is_540_[i_541_];
	    if ((anInt9332 & 0x20) != 0 && i_542_ != -1
		&& class180.method3116(i_542_, -1431554601).aBool1819) {
		i_543_ = 128;
		i_542_ = -1;
	    }
	    long l = ((long) (class176.anInt1883 * -2134548585) << 48
		      | (long) (class176.anInt1879 * -734182087) << 42
		      | (long) (class176.anInt1877 * 2141545647) << 28
		      | (long) (i_543_ << 14) | (long) i_542_);
	    Class525 class525;
	    for (class525 = aClass10_9358.method684(l); class525 != null;
		 class525 = aClass10_9358.method696(-2057538770)) {
		Class525_Sub18 class525_sub18 = (Class525_Sub18) class525;
		if (class525_sub18.anInt10569 == i_542_
		    && class525_sub18.aFloat10563 == (float) i_543_
		    && class525_sub18.aClass176_10565.method2902(class176,
								 (short) 1023))
		    break;
	    }
	    if (class525 == null) {
		class525_sub18s[i_541_]
		    = new Class525_Sub18(this, i_542_, i_543_, class176);
		aClass10_9358.method695(class525_sub18s[i_541_], l);
	    } else
		class525_sub18s[i_541_] = (Class525_Sub18) class525;
	}
	if (bool)
	    aByteArrayArray9343[i][i_533_] |= 0x1;
	if (is_537_.length > anInt9353)
	    anInt9353 = is_537_.length;
	anInt9341 += is_537_.length;
    }
    
    public void method2604(Class525_Sub16_Sub17 class525_sub16_sub17, int i,
			   int i_544_, int i_545_, int i_546_, boolean bool) {
	if (aClass146_9344 != null && class525_sub16_sub17 != null) {
	    int i_547_ = (i - (i_544_ * aClass182_Sub3_9328.anInt9697 >> 8)
			  >> aClass182_Sub3_9328.anInt9800);
	    int i_548_
		= (i_545_ - (i_544_ * aClass182_Sub3_9328.anInt9765 >> 8)
		   >> aClass182_Sub3_9328.anInt9800);
	    aClass146_9344.method2377(class525_sub16_sub17, i_547_, i_548_);
	}
    }
    
    public boolean method2615(Class525_Sub16_Sub17 class525_sub16_sub17, int i,
			      int i_549_, int i_550_, int i_551_,
			      boolean bool) {
	if (aClass146_9344 == null || class525_sub16_sub17 == null)
	    return false;
	int i_552_ = (i - (i_549_ * aClass182_Sub3_9328.anInt9697 >> 8)
		      >> aClass182_Sub3_9328.anInt9800);
	int i_553_ = (i_550_ - (i_549_ * aClass182_Sub3_9328.anInt9765 >> 8)
		      >> aClass182_Sub3_9328.anInt9800);
	return aClass146_9344.method2380(class525_sub16_sub17, i_552_, i_553_);
    }
    
    public boolean method2606(Class525_Sub16_Sub17 class525_sub16_sub17, int i,
			      int i_554_, int i_555_, int i_556_,
			      boolean bool) {
	if (aClass146_9344 == null || class525_sub16_sub17 == null)
	    return false;
	int i_557_ = (i - (i_554_ * aClass182_Sub3_9328.anInt9697 >> 8)
		      >> aClass182_Sub3_9328.anInt9800);
	int i_558_ = (i_555_ - (i_554_ * aClass182_Sub3_9328.anInt9765 >> 8)
		      >> aClass182_Sub3_9328.anInt9800);
	return aClass146_9344.method2380(class525_sub16_sub17, i_557_, i_558_);
    }
    
    public Class525_Sub16_Sub17 method2601
	(int i, int i_559_, Class525_Sub16_Sub17 class525_sub16_sub17) {
	if ((aByteArrayArray9343[i][i_559_] & 0x1) == 0)
	    return null;
	int i_560_ = anInt1761 * 435863595 >> aClass182_Sub3_9328.anInt9800;
	Class525_Sub16_Sub17_Sub1 class525_sub16_sub17_sub1
	    = (Class525_Sub16_Sub17_Sub1) class525_sub16_sub17;
	Class525_Sub16_Sub17_Sub1 class525_sub16_sub17_sub1_561_;
	if (class525_sub16_sub17_sub1 != null
	    && class525_sub16_sub17_sub1.method18760(i_560_, i_560_)) {
	    class525_sub16_sub17_sub1_561_ = class525_sub16_sub17_sub1;
	    class525_sub16_sub17_sub1_561_.method18761();
	} else
	    class525_sub16_sub17_sub1_561_
		= new Class525_Sub16_Sub17_Sub1(aClass182_Sub3_9328, i_560_,
						i_560_);
	class525_sub16_sub17_sub1_561_.method18770(0, 0, i_560_, i_560_);
	method15056(class525_sub16_sub17_sub1_561_, i, i_559_);
	return class525_sub16_sub17_sub1_561_;
    }
    
    public void method2608(Class525_Sub16_Sub17 class525_sub16_sub17, int i,
			   int i_562_, int i_563_, int i_564_, boolean bool) {
	if (aClass146_9344 != null && class525_sub16_sub17 != null) {
	    int i_565_ = (i - (i_562_ * aClass182_Sub3_9328.anInt9697 >> 8)
			  >> aClass182_Sub3_9328.anInt9800);
	    int i_566_
		= (i_563_ - (i_562_ * aClass182_Sub3_9328.anInt9765 >> 8)
		   >> aClass182_Sub3_9328.anInt9800);
	    aClass146_9344.method2363(class525_sub16_sub17, i_565_, i_566_);
	}
    }
    
    public void method2585(Class525_Sub16_Sub17 class525_sub16_sub17, int i,
			   int i_567_, int i_568_, int i_569_, boolean bool) {
	if (aClass146_9344 != null && class525_sub16_sub17 != null) {
	    int i_570_ = (i - (i_567_ * aClass182_Sub3_9328.anInt9697 >> 8)
			  >> aClass182_Sub3_9328.anInt9800);
	    int i_571_
		= (i_568_ - (i_567_ * aClass182_Sub3_9328.anInt9765 >> 8)
		   >> aClass182_Sub3_9328.anInt9800);
	    aClass146_9344.method2363(class525_sub16_sub17, i_570_, i_571_);
	}
    }
    
    public void method2610(Class525_Sub16_Sub17 class525_sub16_sub17, int i,
			   int i_572_, int i_573_, int i_574_, boolean bool) {
	if (aClass146_9344 != null && class525_sub16_sub17 != null) {
	    int i_575_ = (i - (i_572_ * aClass182_Sub3_9328.anInt9697 >> 8)
			  >> aClass182_Sub3_9328.anInt9800);
	    int i_576_
		= (i_573_ - (i_572_ * aClass182_Sub3_9328.anInt9765 >> 8)
		   >> aClass182_Sub3_9328.anInt9800);
	    aClass146_9344.method2363(class525_sub16_sub17, i_575_, i_576_);
	}
    }
    
    public void method2611(Class525_Sub21 class525_sub21, int[] is) {
	aClass709_9345.method14345(new Class525_Sub4(aClass182_Sub3_9328, this,
						     class525_sub21, is),
				   (byte) 0);
    }
    
    public void method2584(Class525_Sub21 class525_sub21, int[] is) {
	aClass709_9345.method14345(new Class525_Sub4(aClass182_Sub3_9328, this,
						     class525_sub21, is),
				   (byte) 0);
    }
    
    public void method2625(Class525_Sub21 class525_sub21, int[] is) {
	aClass709_9345.method14345(new Class525_Sub4(aClass182_Sub3_9328, this,
						     class525_sub21, is),
				   (byte) 0);
    }
    
    public void method2591(int i, int i_577_, int[] is, int[] is_578_,
			   int[] is_579_, int[] is_580_, int[] is_581_,
			   int[] is_582_, int[] is_583_, int[] is_584_,
			   int[] is_585_, int[] is_586_, int[] is_587_,
			   Class176 class176, boolean bool) {
	int i_588_ = is_584_.length;
	int[] is_589_ = new int[i_588_ * 3];
	int[] is_590_ = new int[i_588_ * 3];
	int[] is_591_ = new int[i_588_ * 3];
	int[] is_592_ = is_585_ != null ? new int[i_588_ * 3] : null;
	int[] is_593_ = new int[i_588_ * 3];
	int[] is_594_ = new int[i_588_ * 3];
	int[] is_595_ = is_578_ != null ? new int[i_588_ * 3] : null;
	int[] is_596_ = is_580_ != null ? new int[i_588_ * 3] : null;
	int i_597_ = 0;
	for (int i_598_ = 0; i_598_ < i_588_; i_598_++) {
	    int i_599_ = is_581_[i_598_];
	    int i_600_ = is_582_[i_598_];
	    int i_601_ = is_583_[i_598_];
	    is_589_[i_597_] = is[i_599_];
	    is_590_[i_597_] = is_579_[i_599_];
	    is_591_[i_597_] = is_584_[i_598_];
	    is_593_[i_597_] = is_586_[i_598_];
	    is_594_[i_597_] = is_587_[i_598_];
	    if (is_585_ != null)
		is_592_[i_597_] = is_585_[i_598_];
	    if (is_578_ != null)
		is_595_[i_597_] = is_578_[i_599_];
	    if (is_580_ != null)
		is_596_[i_597_] = is_580_[i_599_];
	    i_597_++;
	    is_589_[i_597_] = is[i_600_];
	    is_590_[i_597_] = is_579_[i_600_];
	    is_591_[i_597_] = is_584_[i_598_];
	    is_593_[i_597_] = is_586_[i_598_];
	    is_594_[i_597_] = is_587_[i_598_];
	    if (is_585_ != null)
		is_592_[i_597_] = is_585_[i_598_];
	    if (is_578_ != null)
		is_595_[i_597_] = is_578_[i_600_];
	    if (is_580_ != null)
		is_596_[i_597_] = is_580_[i_600_];
	    i_597_++;
	    is_589_[i_597_] = is[i_601_];
	    is_590_[i_597_] = is_579_[i_601_];
	    is_591_[i_597_] = is_584_[i_598_];
	    is_593_[i_597_] = is_586_[i_598_];
	    is_594_[i_597_] = is_587_[i_598_];
	    if (is_585_ != null)
		is_592_[i_597_] = is_585_[i_598_];
	    if (is_578_ != null)
		is_595_[i_597_] = is_578_[i_601_];
	    if (is_580_ != null)
		is_596_[i_597_] = is_580_[i_601_];
	    i_597_++;
	}
	method2576(i, i_577_, is_589_, is_595_, is_590_, is_596_, is_591_,
		   is_592_, is_593_, is_594_, class176, bool);
    }
    
    public void method2593(int i, int i_602_, int[] is, int[] is_603_,
			   int[] is_604_, int[] is_605_, int[] is_606_,
			   int[] is_607_, int[] is_608_, int[] is_609_,
			   Class176 class176, boolean bool) {
	Textures class180 = aClass182_Sub3_9328.aClass180_1944;
	if (is_605_ != null && anIntArrayArrayArray9346 == null)
	    anIntArrayArrayArray9346
		= new int[anInt1759 * 363736815][anInt1760 * -1152334393][];
	if (is_603_ != null && anIntArrayArrayArray9342 == null)
	    anIntArrayArrayArray9342
		= new int[anInt1759 * 363736815][anInt1760 * -1152334393][];
	anIntArrayArrayArray9339[i][i_602_] = is;
	anIntArrayArrayArray9352[i][i_602_] = is_604_;
	anIntArrayArrayArray9337[i][i_602_] = is_606_;
	anIntArrayArrayArray9338[i][i_602_] = is_607_;
	if (anIntArrayArrayArray9346 != null)
	    anIntArrayArrayArray9346[i][i_602_] = is_605_;
	if (anIntArrayArrayArray9342 != null)
	    anIntArrayArrayArray9342[i][i_602_] = is_603_;
	Class525_Sub18[] class525_sub18s
	    = (aClass525_Sub18ArrayArrayArray9336[i][i_602_]
	       = new Class525_Sub18[is_606_.length]);
	for (int i_610_ = 0; i_610_ < is_606_.length; i_610_++) {
	    int i_611_ = is_608_[i_610_];
	    int i_612_ = is_609_[i_610_];
	    if ((anInt9332 & 0x20) != 0 && i_611_ != -1
		&& class180.method3116(i_611_, -1431554601).aBool1819) {
		i_612_ = 128;
		i_611_ = -1;
	    }
	    long l = ((long) (class176.anInt1883 * -2134548585) << 48
		      | (long) (class176.anInt1879 * -734182087) << 42
		      | (long) (class176.anInt1877 * 2141545647) << 28
		      | (long) (i_612_ << 14) | (long) i_611_);
	    Class525 class525;
	    for (class525 = aClass10_9358.method684(l); class525 != null;
		 class525 = aClass10_9358.method696(-2057538770)) {
		Class525_Sub18 class525_sub18 = (Class525_Sub18) class525;
		if (class525_sub18.anInt10569 == i_611_
		    && class525_sub18.aFloat10563 == (float) i_612_
		    && class525_sub18.aClass176_10565.method2902(class176,
								 (short) 1023))
		    break;
	    }
	    if (class525 == null) {
		class525_sub18s[i_610_]
		    = new Class525_Sub18(this, i_611_, i_612_, class176);
		aClass10_9358.method695(class525_sub18s[i_610_], l);
	    } else
		class525_sub18s[i_610_] = (Class525_Sub18) class525;
	}
	if (bool)
	    aByteArrayArray9343[i][i_602_] |= 0x1;
	if (is_606_.length > anInt9353)
	    anInt9353 = is_606_.length;
	anInt9341 += is_606_.length;
    }
    
    void method15059(int i, int i_613_, int i_614_, boolean[][] bools,
		     boolean bool, int i_615_) {
	if (aClass525Array9334 != null) {
	    int i_616_ = i_614_ + i_614_ + 1;
	    i_616_ *= i_616_;
	    if (aClass182_Sub3_9328.anIntArray9831.length < i_616_)
		aClass182_Sub3_9328.anIntArray9831 = new int[i_616_];
	    if ((aClass182_Sub3_9328.aClass525_Sub38_Sub1_9828
		 .buffer).length
		< anInt9330 * 2)
		aClass182_Sub3_9328.aClass525_Sub38_Sub1_9828
		    = new Class525_Sub38_Sub1(anInt9330 * 2);
	    int i_617_ = i - i_614_;
	    int i_618_ = i_617_;
	    if (i_617_ < 0)
		i_617_ = 0;
	    int i_619_ = i_613_ - i_614_;
	    int i_620_ = i_619_;
	    if (i_619_ < 0)
		i_619_ = 0;
	    int i_621_ = i + i_614_;
	    if (i_621_ > anInt1759 * 363736815 - 1)
		i_621_ = anInt1759 * 363736815 - 1;
	    int i_622_ = i_613_ + i_614_;
	    if (i_622_ > anInt1760 * -1152334393 - 1)
		i_622_ = anInt1760 * -1152334393 - 1;
	    int i_623_ = 0;
	    int[] is = aClass182_Sub3_9328.anIntArray9831;
	    for (int i_624_ = i_617_; i_624_ <= i_621_; i_624_++) {
		boolean[] bools_625_ = bools[i_624_ - i_618_];
		for (int i_626_ = i_619_; i_626_ <= i_622_; i_626_++) {
		    if (bools_625_[i_626_ - i_620_])
			is[i_623_++]
			    = i_626_ * (anInt1759 * 363736815) + i_624_;
		}
	    }
	    aClass182_Sub3_9328.method15390();
	    aClass182_Sub3_9328.method15404((anInt9332 & 0x7) != 0);
	    for (int i_627_ = 0; i_627_ < aClass525Array9334.length - 0;
		 i_627_++)
		((Class525_Sub18) aClass525Array9334[i_627_])
		    .method16282(is, i_623_);
	    if (!aClass709_9345.method14363(-1546942012)) {
		int i_628_ = aClass182_Sub3_9328.anInt9767;
		int i_629_ = aClass182_Sub3_9328.anInt9768;
		aClass182_Sub3_9328.method3140(0, i_629_,
					       aClass182_Sub3_9328.anInt9769);
		aClass182_Sub3_9328.method15404(false);
		aClass182_Sub3_9328.method15512(false);
		aClass182_Sub3_9328.method15409(128);
		aClass182_Sub3_9328.method15455(-2);
		aClass182_Sub3_9328
		    .method15395(aClass182_Sub3_9328.aClass136_Sub2_9786);
		aClass182_Sub3_9328.method15398(8448, 7681);
		aClass182_Sub3_9328.method15431(0, 34166, 770);
		aClass182_Sub3_9328.method15399(0, 34167, 770);
		for (Class525 class525
			 = aClass709_9345.method14372((short) -24311);
		     class525 != null;
		     class525 = aClass709_9345.method14353(-1271550388)) {
		    Class525_Sub4 class525_sub4 = (Class525_Sub4) class525;
		    class525_sub4.method16108(i, i_613_, i_614_, bools);
		}
		aClass182_Sub3_9328.method15431(0, 5890, 768);
		aClass182_Sub3_9328.method15399(0, 5890, 770);
		aClass182_Sub3_9328.method15395(null);
		aClass182_Sub3_9328.method3140(i_628_, i_629_,
					       aClass182_Sub3_9328.anInt9769);
	    }
	    if (aClass146_9344 != null) {
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
		aClass182_Sub3_9328.method15384(aClass137_9333, null, null,
						aClass137_9326);
		aClass146_9344.method2362(i, i_613_, i_614_, bools, bool);
		OpenGL.glPopMatrix();
	    }
	}
    }
    
    public void method2582(int i, int i_630_, int[] is, int[] is_631_,
			   int[] is_632_, int[] is_633_, int[] is_634_,
			   int[] is_635_, int[] is_636_, int[] is_637_,
			   Class176 class176, boolean bool) {
	Textures class180 = aClass182_Sub3_9328.aClass180_1944;
	if (is_633_ != null && anIntArrayArrayArray9346 == null)
	    anIntArrayArrayArray9346
		= new int[anInt1759 * 363736815][anInt1760 * -1152334393][];
	if (is_631_ != null && anIntArrayArrayArray9342 == null)
	    anIntArrayArrayArray9342
		= new int[anInt1759 * 363736815][anInt1760 * -1152334393][];
	anIntArrayArrayArray9339[i][i_630_] = is;
	anIntArrayArrayArray9352[i][i_630_] = is_632_;
	anIntArrayArrayArray9337[i][i_630_] = is_634_;
	anIntArrayArrayArray9338[i][i_630_] = is_635_;
	if (anIntArrayArrayArray9346 != null)
	    anIntArrayArrayArray9346[i][i_630_] = is_633_;
	if (anIntArrayArrayArray9342 != null)
	    anIntArrayArrayArray9342[i][i_630_] = is_631_;
	Class525_Sub18[] class525_sub18s
	    = (aClass525_Sub18ArrayArrayArray9336[i][i_630_]
	       = new Class525_Sub18[is_634_.length]);
	for (int i_638_ = 0; i_638_ < is_634_.length; i_638_++) {
	    int i_639_ = is_636_[i_638_];
	    int i_640_ = is_637_[i_638_];
	    if ((anInt9332 & 0x20) != 0 && i_639_ != -1
		&& class180.method3116(i_639_, -1431554601).aBool1819) {
		i_640_ = 128;
		i_639_ = -1;
	    }
	    long l = ((long) (class176.anInt1883 * -2134548585) << 48
		      | (long) (class176.anInt1879 * -734182087) << 42
		      | (long) (class176.anInt1877 * 2141545647) << 28
		      | (long) (i_640_ << 14) | (long) i_639_);
	    Class525 class525;
	    for (class525 = aClass10_9358.method684(l); class525 != null;
		 class525 = aClass10_9358.method696(-2057538770)) {
		Class525_Sub18 class525_sub18 = (Class525_Sub18) class525;
		if (class525_sub18.anInt10569 == i_639_
		    && class525_sub18.aFloat10563 == (float) i_640_
		    && class525_sub18.aClass176_10565.method2902(class176,
								 (short) 1023))
		    break;
	    }
	    if (class525 == null) {
		class525_sub18s[i_638_]
		    = new Class525_Sub18(this, i_639_, i_640_, class176);
		aClass10_9358.method695(class525_sub18s[i_638_], l);
	    } else
		class525_sub18s[i_638_] = (Class525_Sub18) class525;
	}
	if (bool)
	    aByteArrayArray9343[i][i_630_] |= 0x1;
	if (is_634_.length > anInt9353)
	    anInt9353 = is_634_.length;
	anInt9341 += is_634_.length;
    }
    
    public void method2618(int i, int i_641_, int[] is, int[] is_642_,
			   int[] is_643_, int[] is_644_, int[] is_645_,
			   int[] is_646_, int[] is_647_, int[] is_648_,
			   Class176 class176, boolean bool) {
	Textures class180 = aClass182_Sub3_9328.aClass180_1944;
	if (is_644_ != null && anIntArrayArrayArray9346 == null)
	    anIntArrayArrayArray9346
		= new int[anInt1759 * 363736815][anInt1760 * -1152334393][];
	if (is_642_ != null && anIntArrayArrayArray9342 == null)
	    anIntArrayArrayArray9342
		= new int[anInt1759 * 363736815][anInt1760 * -1152334393][];
	anIntArrayArrayArray9339[i][i_641_] = is;
	anIntArrayArrayArray9352[i][i_641_] = is_643_;
	anIntArrayArrayArray9337[i][i_641_] = is_645_;
	anIntArrayArrayArray9338[i][i_641_] = is_646_;
	if (anIntArrayArrayArray9346 != null)
	    anIntArrayArrayArray9346[i][i_641_] = is_644_;
	if (anIntArrayArrayArray9342 != null)
	    anIntArrayArrayArray9342[i][i_641_] = is_642_;
	Class525_Sub18[] class525_sub18s
	    = (aClass525_Sub18ArrayArrayArray9336[i][i_641_]
	       = new Class525_Sub18[is_645_.length]);
	for (int i_649_ = 0; i_649_ < is_645_.length; i_649_++) {
	    int i_650_ = is_647_[i_649_];
	    int i_651_ = is_648_[i_649_];
	    if ((anInt9332 & 0x20) != 0 && i_650_ != -1
		&& class180.method3116(i_650_, -1431554601).aBool1819) {
		i_651_ = 128;
		i_650_ = -1;
	    }
	    long l = ((long) (class176.anInt1883 * -2134548585) << 48
		      | (long) (class176.anInt1879 * -734182087) << 42
		      | (long) (class176.anInt1877 * 2141545647) << 28
		      | (long) (i_651_ << 14) | (long) i_650_);
	    Class525 class525;
	    for (class525 = aClass10_9358.method684(l); class525 != null;
		 class525 = aClass10_9358.method696(-2057538770)) {
		Class525_Sub18 class525_sub18 = (Class525_Sub18) class525;
		if (class525_sub18.anInt10569 == i_650_
		    && class525_sub18.aFloat10563 == (float) i_651_
		    && class525_sub18.aClass176_10565.method2902(class176,
								 (short) 1023))
		    break;
	    }
	    if (class525 == null) {
		class525_sub18s[i_649_]
		    = new Class525_Sub18(this, i_650_, i_651_, class176);
		aClass10_9358.method695(class525_sub18s[i_649_], l);
	    } else
		class525_sub18s[i_649_] = (Class525_Sub18) class525;
	}
	if (bool)
	    aByteArrayArray9343[i][i_641_] |= 0x1;
	if (is_645_.length > anInt9353)
	    anInt9353 = is_645_.length;
	anInt9341 += is_645_.length;
    }
    
    void method15060(int i, int i_652_, int i_653_, boolean[][] bools,
		     boolean bool, int i_654_) {
	if (aClass525Array9334 != null) {
	    int i_655_ = i_653_ + i_653_ + 1;
	    i_655_ *= i_655_;
	    if (aClass182_Sub3_9328.anIntArray9831.length < i_655_)
		aClass182_Sub3_9328.anIntArray9831 = new int[i_655_];
	    if ((aClass182_Sub3_9328.aClass525_Sub38_Sub1_9828
		 .buffer).length
		< anInt9330 * 2)
		aClass182_Sub3_9328.aClass525_Sub38_Sub1_9828
		    = new Class525_Sub38_Sub1(anInt9330 * 2);
	    int i_656_ = i - i_653_;
	    int i_657_ = i_656_;
	    if (i_656_ < 0)
		i_656_ = 0;
	    int i_658_ = i_652_ - i_653_;
	    int i_659_ = i_658_;
	    if (i_658_ < 0)
		i_658_ = 0;
	    int i_660_ = i + i_653_;
	    if (i_660_ > anInt1759 * 363736815 - 1)
		i_660_ = anInt1759 * 363736815 - 1;
	    int i_661_ = i_652_ + i_653_;
	    if (i_661_ > anInt1760 * -1152334393 - 1)
		i_661_ = anInt1760 * -1152334393 - 1;
	    int i_662_ = 0;
	    int[] is = aClass182_Sub3_9328.anIntArray9831;
	    for (int i_663_ = i_656_; i_663_ <= i_660_; i_663_++) {
		boolean[] bools_664_ = bools[i_663_ - i_657_];
		for (int i_665_ = i_658_; i_665_ <= i_661_; i_665_++) {
		    if (bools_664_[i_665_ - i_659_])
			is[i_662_++]
			    = i_665_ * (anInt1759 * 363736815) + i_663_;
		}
	    }
	    aClass182_Sub3_9328.method15390();
	    aClass182_Sub3_9328.method15404((anInt9332 & 0x7) != 0);
	    for (int i_666_ = 0; i_666_ < aClass525Array9334.length - 0;
		 i_666_++)
		((Class525_Sub18) aClass525Array9334[i_666_])
		    .method16282(is, i_662_);
	    if (!aClass709_9345.method14363(522558221)) {
		int i_667_ = aClass182_Sub3_9328.anInt9767;
		int i_668_ = aClass182_Sub3_9328.anInt9768;
		aClass182_Sub3_9328.method3140(0, i_668_,
					       aClass182_Sub3_9328.anInt9769);
		aClass182_Sub3_9328.method15404(false);
		aClass182_Sub3_9328.method15512(false);
		aClass182_Sub3_9328.method15409(128);
		aClass182_Sub3_9328.method15455(-2);
		aClass182_Sub3_9328
		    .method15395(aClass182_Sub3_9328.aClass136_Sub2_9786);
		aClass182_Sub3_9328.method15398(8448, 7681);
		aClass182_Sub3_9328.method15431(0, 34166, 770);
		aClass182_Sub3_9328.method15399(0, 34167, 770);
		for (Class525 class525
			 = aClass709_9345.method14372((short) -21605);
		     class525 != null;
		     class525 = aClass709_9345.method14353(-1265291996)) {
		    Class525_Sub4 class525_sub4 = (Class525_Sub4) class525;
		    class525_sub4.method16108(i, i_652_, i_653_, bools);
		}
		aClass182_Sub3_9328.method15431(0, 5890, 768);
		aClass182_Sub3_9328.method15399(0, 5890, 770);
		aClass182_Sub3_9328.method15395(null);
		aClass182_Sub3_9328.method3140(i_667_, i_668_,
					       aClass182_Sub3_9328.anInt9769);
	    }
	    if (aClass146_9344 != null) {
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
		aClass182_Sub3_9328.method15384(aClass137_9333, null, null,
						aClass137_9326);
		aClass146_9344.method2362(i, i_652_, i_653_, bools, bool);
		OpenGL.glPopMatrix();
	    }
	}
    }
    
    public void method2607(Class525_Sub16_Sub17 class525_sub16_sub17, int i,
			   int i_669_, int i_670_, int i_671_, boolean bool) {
	if (aClass146_9344 != null && class525_sub16_sub17 != null) {
	    int i_672_ = (i - (i_669_ * aClass182_Sub3_9328.anInt9697 >> 8)
			  >> aClass182_Sub3_9328.anInt9800);
	    int i_673_
		= (i_670_ - (i_669_ * aClass182_Sub3_9328.anInt9765 >> 8)
		   >> aClass182_Sub3_9328.anInt9800);
	    aClass146_9344.method2363(class525_sub16_sub17, i_672_, i_673_);
	}
    }
    
    public void method2603(Class525_Sub16_Sub17 class525_sub16_sub17, int i,
			   int i_674_, int i_675_, int i_676_, boolean bool) {
	if (aClass146_9344 != null && class525_sub16_sub17 != null) {
	    int i_677_ = (i - (i_674_ * aClass182_Sub3_9328.anInt9697 >> 8)
			  >> aClass182_Sub3_9328.anInt9800);
	    int i_678_
		= (i_675_ - (i_674_ * aClass182_Sub3_9328.anInt9765 >> 8)
		   >> aClass182_Sub3_9328.anInt9800);
	    aClass146_9344.method2377(class525_sub16_sub17, i_677_, i_678_);
	}
    }
    
    void method15061(int i, int i_679_, int i_680_, boolean[][] bools,
		     boolean bool, int i_681_) {
	if (aClass525Array9334 != null) {
	    int i_682_ = i_680_ + i_680_ + 1;
	    i_682_ *= i_682_;
	    if (aClass182_Sub3_9328.anIntArray9831.length < i_682_)
		aClass182_Sub3_9328.anIntArray9831 = new int[i_682_];
	    if ((aClass182_Sub3_9328.aClass525_Sub38_Sub1_9828
		 .buffer).length
		< anInt9330 * 2)
		aClass182_Sub3_9328.aClass525_Sub38_Sub1_9828
		    = new Class525_Sub38_Sub1(anInt9330 * 2);
	    int i_683_ = i - i_680_;
	    int i_684_ = i_683_;
	    if (i_683_ < 0)
		i_683_ = 0;
	    int i_685_ = i_679_ - i_680_;
	    int i_686_ = i_685_;
	    if (i_685_ < 0)
		i_685_ = 0;
	    int i_687_ = i + i_680_;
	    if (i_687_ > anInt1759 * 363736815 - 1)
		i_687_ = anInt1759 * 363736815 - 1;
	    int i_688_ = i_679_ + i_680_;
	    if (i_688_ > anInt1760 * -1152334393 - 1)
		i_688_ = anInt1760 * -1152334393 - 1;
	    int i_689_ = 0;
	    int[] is = aClass182_Sub3_9328.anIntArray9831;
	    for (int i_690_ = i_683_; i_690_ <= i_687_; i_690_++) {
		boolean[] bools_691_ = bools[i_690_ - i_684_];
		for (int i_692_ = i_685_; i_692_ <= i_688_; i_692_++) {
		    if (bools_691_[i_692_ - i_686_])
			is[i_689_++]
			    = i_692_ * (anInt1759 * 363736815) + i_690_;
		}
	    }
	    aClass182_Sub3_9328.method15390();
	    aClass182_Sub3_9328.method15404((anInt9332 & 0x7) != 0);
	    for (int i_693_ = 0; i_693_ < aClass525Array9334.length - 0;
		 i_693_++)
		((Class525_Sub18) aClass525Array9334[i_693_])
		    .method16282(is, i_689_);
	    if (!aClass709_9345.method14363(-2119755059)) {
		int i_694_ = aClass182_Sub3_9328.anInt9767;
		int i_695_ = aClass182_Sub3_9328.anInt9768;
		aClass182_Sub3_9328.method3140(0, i_695_,
					       aClass182_Sub3_9328.anInt9769);
		aClass182_Sub3_9328.method15404(false);
		aClass182_Sub3_9328.method15512(false);
		aClass182_Sub3_9328.method15409(128);
		aClass182_Sub3_9328.method15455(-2);
		aClass182_Sub3_9328
		    .method15395(aClass182_Sub3_9328.aClass136_Sub2_9786);
		aClass182_Sub3_9328.method15398(8448, 7681);
		aClass182_Sub3_9328.method15431(0, 34166, 770);
		aClass182_Sub3_9328.method15399(0, 34167, 770);
		for (Class525 class525
			 = aClass709_9345.method14372((short) -25750);
		     class525 != null;
		     class525 = aClass709_9345.method14353(-1134147133)) {
		    Class525_Sub4 class525_sub4 = (Class525_Sub4) class525;
		    class525_sub4.method16108(i, i_679_, i_680_, bools);
		}
		aClass182_Sub3_9328.method15431(0, 5890, 768);
		aClass182_Sub3_9328.method15399(0, 5890, 770);
		aClass182_Sub3_9328.method15395(null);
		aClass182_Sub3_9328.method3140(i_694_, i_695_,
					       aClass182_Sub3_9328.anInt9769);
	    }
	    if (aClass146_9344 != null) {
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
		aClass182_Sub3_9328.method15384(aClass137_9333, null, null,
						aClass137_9326);
		aClass146_9344.method2362(i, i_679_, i_680_, bools, bool);
		OpenGL.glPopMatrix();
	    }
	}
    }
    
    void method15062(int i, int i_696_, int i_697_, boolean[][] bools,
		     boolean bool, int i_698_) {
	if (aClass525Array9334 != null) {
	    int i_699_ = i_697_ + i_697_ + 1;
	    i_699_ *= i_699_;
	    if (aClass182_Sub3_9328.anIntArray9831.length < i_699_)
		aClass182_Sub3_9328.anIntArray9831 = new int[i_699_];
	    if ((aClass182_Sub3_9328.aClass525_Sub38_Sub1_9828
		 .buffer).length
		< anInt9330 * 2)
		aClass182_Sub3_9328.aClass525_Sub38_Sub1_9828
		    = new Class525_Sub38_Sub1(anInt9330 * 2);
	    int i_700_ = i - i_697_;
	    int i_701_ = i_700_;
	    if (i_700_ < 0)
		i_700_ = 0;
	    int i_702_ = i_696_ - i_697_;
	    int i_703_ = i_702_;
	    if (i_702_ < 0)
		i_702_ = 0;
	    int i_704_ = i + i_697_;
	    if (i_704_ > anInt1759 * 363736815 - 1)
		i_704_ = anInt1759 * 363736815 - 1;
	    int i_705_ = i_696_ + i_697_;
	    if (i_705_ > anInt1760 * -1152334393 - 1)
		i_705_ = anInt1760 * -1152334393 - 1;
	    int i_706_ = 0;
	    int[] is = aClass182_Sub3_9328.anIntArray9831;
	    for (int i_707_ = i_700_; i_707_ <= i_704_; i_707_++) {
		boolean[] bools_708_ = bools[i_707_ - i_701_];
		for (int i_709_ = i_702_; i_709_ <= i_705_; i_709_++) {
		    if (bools_708_[i_709_ - i_703_])
			is[i_706_++]
			    = i_709_ * (anInt1759 * 363736815) + i_707_;
		}
	    }
	    aClass182_Sub3_9328.method15390();
	    aClass182_Sub3_9328.method15404((anInt9332 & 0x7) != 0);
	    for (int i_710_ = 0; i_710_ < aClass525Array9334.length - 0;
		 i_710_++)
		((Class525_Sub18) aClass525Array9334[i_710_])
		    .method16282(is, i_706_);
	    if (!aClass709_9345.method14363(284754343)) {
		int i_711_ = aClass182_Sub3_9328.anInt9767;
		int i_712_ = aClass182_Sub3_9328.anInt9768;
		aClass182_Sub3_9328.method3140(0, i_712_,
					       aClass182_Sub3_9328.anInt9769);
		aClass182_Sub3_9328.method15404(false);
		aClass182_Sub3_9328.method15512(false);
		aClass182_Sub3_9328.method15409(128);
		aClass182_Sub3_9328.method15455(-2);
		aClass182_Sub3_9328
		    .method15395(aClass182_Sub3_9328.aClass136_Sub2_9786);
		aClass182_Sub3_9328.method15398(8448, 7681);
		aClass182_Sub3_9328.method15431(0, 34166, 770);
		aClass182_Sub3_9328.method15399(0, 34167, 770);
		for (Class525 class525
			 = aClass709_9345.method14372((short) -4448);
		     class525 != null;
		     class525 = aClass709_9345.method14353(-1314514369)) {
		    Class525_Sub4 class525_sub4 = (Class525_Sub4) class525;
		    class525_sub4.method16108(i, i_696_, i_697_, bools);
		}
		aClass182_Sub3_9328.method15431(0, 5890, 768);
		aClass182_Sub3_9328.method15399(0, 5890, 770);
		aClass182_Sub3_9328.method15395(null);
		aClass182_Sub3_9328.method3140(i_711_, i_712_,
					       aClass182_Sub3_9328.anInt9769);
	    }
	    if (aClass146_9344 != null) {
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
		aClass182_Sub3_9328.method15384(aClass137_9333, null, null,
						aClass137_9326);
		aClass146_9344.method2362(i, i_696_, i_697_, bools, bool);
		OpenGL.glPopMatrix();
	    }
	}
    }
    
    void method15063(Class525_Sub16_Sub17_Sub1 class525_sub16_sub17_sub1,
		     int i, int i_713_) {
	int[] is = anIntArrayArrayArray9339[i][i_713_];
	int[] is_714_ = anIntArrayArrayArray9352[i][i_713_];
	int i_715_ = is.length;
	if (aClass182_Sub3_9328.anIntArray9829.length < i_715_) {
	    aClass182_Sub3_9328.anIntArray9829 = new int[i_715_];
	    aClass182_Sub3_9328.anIntArray9830 = new int[i_715_];
	}
	int[] is_716_ = aClass182_Sub3_9328.anIntArray9829;
	int[] is_717_ = aClass182_Sub3_9328.anIntArray9830;
	for (int i_718_ = 0; i_718_ < i_715_; i_718_++) {
	    is_716_[i_718_] = is[i_718_] >> aClass182_Sub3_9328.anInt9800;
	    is_717_[i_718_] = is_714_[i_718_] >> aClass182_Sub3_9328.anInt9800;
	}
	int i_719_ = 0;
	while (i_719_ < i_715_) {
	    int i_720_ = is_716_[i_719_];
	    int i_721_ = is_717_[i_719_++];
	    int i_722_ = is_716_[i_719_];
	    int i_723_ = is_717_[i_719_++];
	    int i_724_ = is_716_[i_719_];
	    int i_725_ = is_717_[i_719_++];
	    if (((i_720_ - i_722_) * (i_723_ - i_725_)
		 - (i_723_ - i_721_) * (i_724_ - i_722_))
		> 0)
		class525_sub16_sub17_sub1.method18765(i_721_, i_723_, i_725_,
						      i_720_, i_722_, i_724_);
	}
    }
}
