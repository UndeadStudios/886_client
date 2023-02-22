/* Class455 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class455
{
    int[] anIntArray4952;
    public boolean aBool4953;
    Class40_Sub14 aClass40_Sub14_4954;
    int[] anIntArray4955;
    static final int anInt4956 = 0;
    public int anInt4957 = 0;
    static int[] anIntArray4958
	= { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };
    public boolean aBool4959;
    public boolean aBool4960;
    public boolean aBool4961;
    static int[][] anIntArrayArray4962;
    protected int anInt4963;
    protected int anInt4964;
    public boolean aBool4965;
    public int[][][] anIntArrayArrayArray4966;
    public byte[][][] aByteArrayArrayArray4967;
    protected boolean aBool4968;
    byte[][][] aByteArrayArrayArray4969;
    int[] anIntArray4970;
    short[][][] aShortArrayArrayArray4971;
    short[][][] aShortArrayArrayArray4972;
    protected byte[][][] aByteArrayArrayArray4973;
    int[] anIntArray4974;
    int[] anIntArray4975;
    int[] anIntArray4976;
    int[] anIntArray4977;
    static final int anInt4978 = 128;
    static int[][] anIntArrayArray4979;
    static final int anInt4980 = 1;
    static final int anInt4981 = 2;
    static final int anInt4982 = 3;
    int anInt4983;
    static final int anInt4984 = 2;
    static final int anInt4985 = 0;
    static int[] anIntArray4986;
    public int anInt4987;
    static final int anInt4988 = 32;
    static final int anInt4989 = 64;
    protected Class475 aClass475_4990;
    static final int anInt4991 = 256;
    static final int anInt4992 = 16;
    int[] anIntArray4993;
    static int[] anIntArray4994
	= { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };
    static int[][] anIntArrayArray4995;
    static int[] anIntArray4996;
    int[] anIntArray4997;
    static int[] anIntArray4998;
    static int[] anIntArray4999;
    static int[] anIntArray5000;
    static boolean[][] aBoolArrayArray5001;
    int[] anIntArray5002;
    static final int anInt5003 = 8;
    static final int anInt5004 = 1;
    static int[][] anIntArrayArray5005;
    static boolean[][] aBoolArrayArray5006;
    protected Class546 aClass546_5007;
    static boolean[][] aBoolArrayArray5008;
    static int[][] anIntArrayArray5009;
    static boolean[][] aBoolArrayArray5010;
    static int[] anIntArray5011;
    static final int anInt5012 = 512;
    static int[][] anIntArrayArray5013;
    static int[][] anIntArrayArray5014;
    static int[][] anIntArrayArray5015;
    int[] anIntArray5016;
    int anInt5017;
    int[] anIntArray5018;
    static int[][] anIntArrayArray5019;
    Class40_Sub18 aClass40_Sub18_5020;
    int[] anIntArray5021;
    boolean aBool5022;
    int anInt5023;
    byte[][][] aByteArrayArrayArray5024;
    int anInt5025;
    int anInt5026;
    int anInt5027;
    static final int anInt5028 = 4;
    int anInt5029;
    boolean aBool5030;
    boolean aBool5031;
    boolean aBool5032;
    static int[][] anIntArrayArray5033;
    int anInt5034;
    int anInt5035;
    static int[][] anIntArrayArray5036;
    int[] anIntArray5037;
    int[] anIntArray5038;
    int[] anIntArray5039;
    
    void method7374(Class161 class161, Class23 class23, Class658 class658,
		    int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_,
		    int i_5_) {
	int i_6_ = class161.method2577(i_0_, i_1_, (byte) 24);
	int i_7_ = class161.method2577(i_2_, i_1_, (byte) 4);
	int i_8_ = class161.method2577(i_2_, i_3_, (byte) -24);
	int i_9_ = class161.method2577(i_0_, i_3_, (byte) 25);
	boolean bool = aClass475_4990.method7774(i_0_, i_1_, 444032103);
	if (bool && i > 1 || !bool && i > 0) {
	    boolean bool_10_ = true;
	    if (class23 != null && !class23.aBool224)
		bool_10_ = false;
	    else if (i_4_ == 0 && anInt5023 * 1434602089 != 0)
		bool_10_ = false;
	    else if (i_5_ > 0 && class658 != null && !class658.aBool8445)
		bool_10_ = false;
	    if (bool_10_ && i_7_ == i_6_ && i_6_ == i_8_ && i_9_ == i_6_)
		aByteArrayArrayArray4973[i][i_0_][i_1_] |= 0x4;
	}
    }
    
    public final void method7375(RSBuffer class525_sub38, int i,
								 int i_11_, int i_12_, int i_13_) {
	int i_14_ = i + i_12_;
	int i_15_ = i_13_ + i_11_;
	for (int i_16_ = 0; i_16_ < anInt4987 * -155906383; i_16_++) {
	    for (int i_17_ = 0; i_17_ < 64; i_17_++) {
		for (int i_18_ = 0; i_18_ < 64; i_18_++)
		    method7447(class525_sub38, i_16_, i_17_ + i, i_11_ + i_18_,
			       0, 0, i_17_ + i_14_, i_18_ + i_15_, 0, false,
			       (byte) -75);
	    }
	}
    }
    
    public void method7376(int i) {
	anIntArray4974 = null;
	anIntArray4975 = null;
	anIntArray4976 = null;
	anIntArray4977 = null;
	anIntArray5021 = null;
	aBool4968 = false;
    }
    
    public final void method7377(int i, int i_19_, int i_20_, int i_21_,
				 int i_22_) {
	for (int i_23_ = 0; i_23_ < -155906383 * anInt4987; i_23_++)
	    method7378(i_23_, i, i_19_, i_20_, i_21_, -2142475935);
    }
    
    public final void method7378(int i, int i_24_, int i_25_, int i_26_,
				 int i_27_, int i_28_) {
	for (int i_29_ = i_25_; i_29_ < i_27_ + i_25_; i_29_++) {
	    for (int i_30_ = i_24_; i_30_ < i_24_ + i_26_; i_30_++) {
		if (i_30_ >= 0 && i_30_ < anInt4963 * -528942713 && i_29_ >= 0
		    && i_29_ < anInt4964 * -129082381)
		    anIntArrayArrayArray4966[i][i_30_][i_29_]
			= i > 0 ? (anIntArrayArrayArray4966[i - 1][i_30_]
				   [i_29_]) - 960 : 0;
	    }
	}
	if (i_24_ > 0 && i_24_ < -528942713 * anInt4963) {
	    for (int i_31_ = 1 + i_25_; i_31_ < i_27_ + i_25_; i_31_++) {
		if (i_31_ >= 0 && i_31_ < -129082381 * anInt4964)
		    anIntArrayArrayArray4966[i][i_24_][i_31_]
			= anIntArrayArrayArray4966[i][i_24_ - 1][i_31_];
	    }
	}
	if (i_25_ > 0 && i_25_ < -129082381 * anInt4964) {
	    for (int i_32_ = 1 + i_24_; i_32_ < i_24_ + i_26_; i_32_++) {
		if (i_32_ >= 0 && i_32_ < -528942713 * anInt4963)
		    anIntArrayArrayArray4966[i][i_32_][i_25_]
			= anIntArrayArrayArray4966[i][i_32_][i_25_ - 1];
	    }
	}
	if (i_24_ >= 0 && i_25_ >= 0 && i_24_ < anInt4963 * -528942713
	    && i_25_ < anInt4964 * -129082381) {
	    if (0 == i) {
		if (i_24_ > 0
		    && 0 != anIntArrayArrayArray4966[i][i_24_ - 1][i_25_])
		    anIntArrayArrayArray4966[i][i_24_][i_25_]
			= anIntArrayArrayArray4966[i][i_24_ - 1][i_25_];
		else if (i_25_ > 0
			 && 0 != anIntArrayArrayArray4966[i][i_24_][i_25_ - 1])
		    anIntArrayArrayArray4966[i][i_24_][i_25_]
			= anIntArrayArrayArray4966[i][i_24_][i_25_ - 1];
		else if (i_24_ > 0 && i_25_ > 0
			 && (anIntArrayArrayArray4966[i][i_24_ - 1][i_25_ - 1]
			     != 0))
		    anIntArrayArrayArray4966[i][i_24_][i_25_]
			= anIntArrayArrayArray4966[i][i_24_ - 1][i_25_ - 1];
	    } else if (i_24_ > 0
		       && (anIntArrayArrayArray4966[i][i_24_ - 1][i_25_]
			   != (anIntArrayArrayArray4966[i - 1][i_24_ - 1]
			       [i_25_])))
		anIntArrayArrayArray4966[i][i_24_][i_25_]
		    = anIntArrayArrayArray4966[i][i_24_ - 1][i_25_];
	    else if (i_25_ > 0
		     && (anIntArrayArrayArray4966[i - 1][i_24_][i_25_ - 1]
			 != anIntArrayArrayArray4966[i][i_24_][i_25_ - 1]))
		anIntArrayArrayArray4966[i][i_24_][i_25_]
		    = anIntArrayArrayArray4966[i][i_24_][i_25_ - 1];
	    else if (i_24_ > 0 && i_25_ > 0
		     && (anIntArrayArrayArray4966[i][i_24_ - 1][i_25_ - 1]
			 != (anIntArrayArrayArray4966[i - 1][i_24_ - 1]
			     [i_25_ - 1])))
		anIntArrayArrayArray4966[i][i_24_][i_25_]
		    = anIntArrayArrayArray4966[i][i_24_ - 1][i_25_ - 1];
	}
    }
    
    void method7379(Class658 class658, Class23 class23) {
	if (aBool5032) {
	    anIntArray4952 = anIntArrayArray5015[1434602089 * anInt5023];
	    anIntArray5037 = anIntArrayArray5019[1434602089 * anInt5023];
	    anIntArray5038 = anIntArrayArray5005[anInt5023 * 1434602089];
	    anInt5035
		= 1586883995 * (null != class658
				? anIntArray4958[1434602089 * anInt5023] : 0);
	    anInt5034
		= (null != class23 ? anIntArray4994[anInt5023 * 1434602089]
		   : 0) * 85932989;
	} else if (aBool5031) {
	    anIntArray4952 = anIntArrayArray5013[1434602089 * anInt5023];
	    anIntArray5037 = anIntArrayArray5014[1434602089 * anInt5023];
	    anIntArray5038 = anIntArrayArray4979[1434602089 * anInt5023];
	    anInt5035
		= (null != class658 ? anIntArray5011[anInt5023 * 1434602089]
		   : 0) * 1586883995;
	    anInt5034
		= 85932989 * (null != class23
			      ? anIntArray4998[anInt5023 * 1434602089] : 0);
	    anIntArray5039 = anIntArrayArray5033[1434602089 * anInt5023];
	} else {
	    anIntArray4952 = anIntArrayArray5036[anInt5023 * 1434602089];
	    anIntArray5037 = anIntArrayArray5009[anInt5023 * 1434602089];
	    anIntArray5038 = anIntArrayArray4995[anInt5023 * 1434602089];
	    anInt5035
		= (null != class658 ? anIntArray4986[anInt5023 * 1434602089]
		   : 0) * 1586883995;
	    anInt5034
		= (class23 != null ? anIntArray4996[anInt5023 * 1434602089]
		   : 0) * 85932989;
	    anIntArray5039 = anIntArrayArray4962[anInt5023 * 1434602089];
	}
    }
    
    static final int method7380(int i, int i_33_, int i_34_) {
	if (i_33_ == i)
	    return i;
	int i_35_ = 128 - i_34_;
	int i_36_ = i_35_ * (i & 0x7f) + i_34_ * (i_33_ & 0x7f) >> 7;
	int i_37_ = (i_33_ & 0x380) * i_34_ + (i & 0x380) * i_35_ >> 7;
	int i_38_ = i_34_ * (i_33_ & 0xfc00) + i_35_ * (i & 0xfc00) >> 7;
	return i_38_ & 0xfc00 | i_37_ & 0x380 | i_36_ & 0x7f;
    }
    
    public void method7381(int i) {
	aBool4968 = true;
    }
    
    public final void method7382(int i, int[][] is, int i_39_) {
	int[][] is_40_ = anIntArrayArrayArray4966[i];
	for (int i_41_ = 0; i_41_ < 1 + anInt4963 * -528942713; i_41_++) {
	    for (int i_42_ = 0; i_42_ < 1 + -129082381 * anInt4964; i_42_++)
		is_40_[i_41_][i_42_] += is[i_41_][i_42_];
	}
    }
    
    static final int method7383(int i, int i_43_, int i_44_) {
	int i_45_ = i / i_44_;
	int i_46_ = i & i_44_ - 1;
	int i_47_ = i_43_ / i_44_;
	int i_48_ = i_43_ & i_44_ - 1;
	int i_49_ = Class469.method7712(i_45_, i_47_, -387865103);
	int i_50_ = Class469.method7712(i_45_ + 1, i_47_, -387865103);
	int i_51_ = Class469.method7712(i_45_, i_47_ + 1, -387865103);
	int i_52_ = Class469.method7712(1 + i_45_, i_47_ + 1, -387865103);
	int i_53_
	    = Class451.method7337(i_49_, i_50_, i_46_, i_44_, (byte) -14);
	int i_54_
	    = Class451.method7337(i_51_, i_52_, i_46_, i_44_, (byte) -80);
	return Class451.method7337(i_53_, i_54_, i_48_, i_44_, (byte) -5);
    }
    
    public final void method7384(Class182 class182, Class161 class161,
				 Class161 class161_55_, byte i) {
	int[][] is = new int[anInt4963 * -528942713][-129082381 * anInt4964];
	if (null == anIntArray4974
	    || anInt4964 * -129082381 != anIntArray4974.length) {
	    anIntArray4974 = new int[anInt4964 * -129082381];
	    anIntArray4975 = new int[-129082381 * anInt4964];
	    anIntArray4976 = new int[anInt4964 * -129082381];
	    anIntArray4977 = new int[anInt4964 * -129082381];
	    anIntArray5021 = new int[anInt4964 * -129082381];
	}
	for (int i_56_ = 0; i_56_ < anInt4987 * -155906383; i_56_++) {
	    for (int i_57_ = 0; i_57_ < anInt4964 * -129082381; i_57_++) {
		anIntArray4974[i_57_] = 0;
		anIntArray4975[i_57_] = 0;
		anIntArray4976[i_57_] = 0;
		anIntArray4977[i_57_] = 0;
		anIntArray5021[i_57_] = 0;
	    }
	    for (int i_58_ = -5; i_58_ < anInt4963 * -528942713; i_58_++) {
		for (int i_59_ = 0; i_59_ < -129082381 * anInt4964; i_59_++) {
		    int i_60_ = i_58_ + 5;
		    if (i_60_ < anInt4963 * -528942713) {
			int i_61_
			    = (aShortArrayArrayArray4971[i_56_][i_60_][i_59_]
			       & 0x7fff);
			if (i_61_ > 0) {
			    Class23 class23
				= ((Class23)
				   aClass40_Sub14_4954.method76(i_61_ - 1,
								1589468894));
			    anIntArray4974[i_59_]
				+= -42935381 * class23.anInt222;
			    anIntArray4975[i_59_]
				+= class23.anInt218 * 337157395;
			    anIntArray4976[i_59_]
				+= 1486533035 * class23.anInt225;
			    anIntArray4977[i_59_]
				+= -1462290935 * class23.anInt226;
			    anIntArray5021[i_59_]++;
			}
		    }
		    int i_62_ = i_58_ - 5;
		    if (i_62_ >= 0) {
			int i_63_
			    = (aShortArrayArrayArray4971[i_56_][i_62_][i_59_]
			       & 0x7fff);
			if (i_63_ > 0) {
			    Class23 class23
				= ((Class23)
				   aClass40_Sub14_4954.method76(i_63_ - 1,
								-765011435));
			    anIntArray4974[i_59_]
				-= -42935381 * class23.anInt222;
			    anIntArray4975[i_59_]
				-= 337157395 * class23.anInt218;
			    anIntArray4976[i_59_]
				-= 1486533035 * class23.anInt225;
			    anIntArray4977[i_59_]
				-= class23.anInt226 * -1462290935;
			    anIntArray5021[i_59_]--;
			}
		    }
		}
		if (i_58_ >= 0) {
		    int i_64_ = 0;
		    int i_65_ = 0;
		    int i_66_ = 0;
		    int i_67_ = 0;
		    int i_68_ = 0;
		    for (int i_69_ = -5; i_69_ < -129082381 * anInt4964;
			 i_69_++) {
			int i_70_ = i_69_ + 5;
			if (i_70_ < anInt4964 * -129082381) {
			    i_64_ += anIntArray4974[i_70_];
			    i_65_ += anIntArray4975[i_70_];
			    i_66_ += anIntArray4976[i_70_];
			    i_67_ += anIntArray4977[i_70_];
			    i_68_ += anIntArray5021[i_70_];
			}
			int i_71_ = i_69_ - 5;
			if (i_71_ >= 0) {
			    i_64_ -= anIntArray4974[i_71_];
			    i_65_ -= anIntArray4975[i_71_];
			    i_66_ -= anIntArray4976[i_71_];
			    i_67_ -= anIntArray4977[i_71_];
			    i_68_ -= anIntArray5021[i_71_];
			}
			if (i_69_ >= 0 && i_67_ > 0 && i_68_ > 0)
			    is[i_58_][i_69_]
				= Class57.method1214(i_64_ * 256 / i_67_,
						     i_65_ / i_68_,
						     i_66_ / i_68_,
						     2092983139);
		    }
		}
	    }
	    if (aBool4960)
		method7416(class182, aClass546_5007.aClass161Array7226[i_56_],
			   i_56_, is, i_56_ == 0 ? class161 : null,
			   i_56_ == 0 ? class161_55_ : null, -1731322105);
	    else
		method7385(class182, aClass546_5007.aClass161Array7226[i_56_],
			   i_56_, is, i_56_ == 0 ? class161 : null,
			   0 == i_56_ ? class161_55_ : null, 32768);
	    aShortArrayArrayArray4971[i_56_] = null;
	    aShortArrayArrayArray4972[i_56_] = null;
	    aByteArrayArrayArray4969[i_56_] = null;
	    aByteArrayArrayArray5024[i_56_] = null;
	}
	if (!aBool4965) {
	    if (0 != 429883147 * anInt4957)
		aClass546_5007.method8996(-193486927);
	    if (aBool4959)
		aClass546_5007.method8990((byte) 1);
	}
	for (int i_72_ = 0; i_72_ < anInt4987 * -155906383; i_72_++)
	    aClass546_5007.aClass161Array7226[i_72_].method2578();
    }
    
    void method7385(Class182 class182, Class161 class161, int i, int[][] is,
		    Class161 class161_73_, Class161 class161_74_, int i_75_) {
	for (int i_76_ = 0; i_76_ < -528942713 * anInt4963; i_76_++) {
	    for (int i_77_ = 0; i_77_ < -129082381 * anInt4964; i_77_++) {
		byte i_78_ = aByteArrayArrayArray4969[i][i_76_][i_77_];
		byte i_79_ = aByteArrayArrayArray5024[i][i_76_][i_77_];
		int i_80_
		    = aShortArrayArrayArray4972[i][i_76_][i_77_] & 0x7fff;
		int i_81_
		    = aShortArrayArrayArray4971[i][i_76_][i_77_] & 0x7fff;
		Class658 class658
		    = ((Class658)
		       (0 != i_80_
			? aClass40_Sub18_5020.method76(i_80_ - 1, 1854538234)
			: null));
		Class23 class23
		    = ((Class23)
		       (i_81_ != 0
			? aClass40_Sub14_4954.method76(i_81_ - 1, 1413621178)
			: null));
		if (0 == i_78_ && null == class658)
		    i_78_ = (byte) 12;
		Class658 class658_82_ = class658;
		if (class658 != null && -1 == class658.anInt8446 * -1932204261
		    && 2040702555 * class658.anInt8452 == -1) {
		    class658_82_ = class658;
		    class658 = null;
		}
		if (null != class658 || null != class23) {
		    anInt5034 = 85932989 * anIntArray4994[i_78_];
		    anInt5035 = 1586883995 * anIntArray4958[i_78_];
		    int i_83_
			= ((class658 != null ? anInt5035 * -2054508397 : 0)
			   + (null != class23 ? anInt5034 * 1936283541 : 0));
		    int i_84_ = 0;
		    anInt5017 = 0;
		    anInt5027
			= (null != class658 ? -1899182957 * class658.anInt8453
			   : -1) * 1279630533;
		    int i_85_ = (null != class23
				 ? class23.anInt219 * -1990883919 : -1);
		    int[] is_86_ = new int[i_83_];
		    int[] is_87_ = new int[i_83_];
		    int[] is_88_ = new int[i_83_];
		    int[] is_89_ = new int[i_83_];
		    int[] is_90_ = new int[i_83_];
		    int[] is_91_ = new int[i_83_];
		    int[] is_92_ = ((class658 != null
				     && -1 != class658.anInt8452 * 2040702555)
				    ? new int[i_83_] : null);
		    if (class658 != null) {
			for (int i_93_ = 0; i_93_ < anInt5035 * -2054508397;
			     i_93_++) {
			    is_86_[i_84_] = (anIntArrayArray5015[i_78_]
					     [1583960485 * anInt5017]);
			    is_87_[i_84_] = (anIntArrayArray5019[i_78_]
					     [1583960485 * anInt5017]);
			    is_88_[i_84_] = (anIntArrayArray5005[i_78_]
					     [anInt5017 * 1583960485]);
			    is_90_[i_84_] = 1327464973 * anInt5027;
			    is_91_[i_84_] = class658.anInt8447 * 815197885;
			    is_89_[i_84_] = -1932204261 * class658.anInt8446;
			    if (null != is_92_)
				is_92_[i_84_]
				    = 2040702555 * class658.anInt8452;
			    i_84_++;
			    anInt5017 += 616377901;
			}
			if (!aBool4965 && i == 0)
			    aClass546_5007.method9097
				(i_76_, i_77_, class658.anInt8455 * 1229422759,
				 class658.anInt8443 * -1741170792,
				 class658.anInt8448 * 1393595585,
				 class658.anInt8454 * -1733705129,
				 -536318927 * class658.anInt8441,
				 class658.anInt8456 * 1298567265, -770029902);
		    } else
			anInt5017 += anInt5035 * 1839363031;
		    if (null != class23) {
			for (int i_94_ = 0; i_94_ < 1936283541 * anInt5034;
			     i_94_++) {
			    is_86_[i_84_] = (anIntArrayArray5015[i_78_]
					     [1583960485 * anInt5017]);
			    is_87_[i_84_] = (anIntArrayArray5019[i_78_]
					     [1583960485 * anInt5017]);
			    is_88_[i_84_] = (anIntArrayArray5005[i_78_]
					     [anInt5017 * 1583960485]);
			    is_90_[i_84_] = i_85_;
			    is_91_[i_84_] = -1908571849 * class23.anInt220;
			    is_89_[i_84_] = is[i_76_][i_77_];
			    if (null != is_92_)
				is_92_[i_84_] = is_89_[i_84_];
			    i_84_++;
			    anInt5017 += 616377901;
			}
		    }
		    int i_95_ = anIntArray4999.length;
		    int[] is_96_ = new int[i_95_];
		    int[] is_97_ = new int[i_95_];
		    int[] is_98_
			= class161_74_ != null ? new int[i_95_] : null;
		    int[] is_99_
			= (null != class161_74_ || null != class161_73_
			   ? new int[i_95_] : null);
		    for (int i_100_ = 0; i_100_ < i_95_; i_100_++) {
			int i_101_ = anIntArray4999[i_100_];
			int i_102_ = anIntArray5000[i_100_];
			if (i_79_ == 0) {
			    is_96_[i_100_] = i_101_;
			    is_97_[i_100_] = i_102_;
			} else if (1 == i_79_) {
			    int i_103_ = i_101_;
			    is_96_[i_100_] = i_102_;
			    is_97_[i_100_] = 512 - i_103_;
			} else if (i_79_ == 2) {
			    is_96_[i_100_] = 512 - i_101_;
			    is_97_[i_100_] = 512 - i_102_;
			} else if (i_79_ == 3) {
			    int i_104_ = i_101_;
			    is_96_[i_100_] = 512 - i_102_;
			    is_97_[i_100_] = i_104_;
			}
			if (is_98_ != null
			    && aBoolArrayArray5001[i_78_][i_100_]) {
			    int i_105_ = is_96_[i_100_] + (i_76_ << 9);
			    int i_106_ = (i_77_ << 9) + is_97_[i_100_];
			    is_98_[i_100_]
				= (class161_74_.method2619(i_105_, i_106_,
							   -325524414)
				   - class161.method2619(i_105_, i_106_,
							 1989597940));
			}
			if (is_99_ != null) {
			    if (null != class161_74_
				&& !aBoolArrayArray5001[i_78_][i_100_]) {
				int i_107_ = (i_76_ << 9) + is_96_[i_100_];
				int i_108_ = (i_77_ << 9) + is_97_[i_100_];
				is_99_[i_100_]
				    = (class161.method2619(i_107_, i_108_,
							   -1787087434)
				       - class161_74_.method2619(i_107_,
								 i_108_,
								 -391195603));
			    } else if (null != class161_73_
				       && !(aBoolArrayArray5008[i_78_]
					    [i_100_])) {
				int i_109_ = (i_76_ << 9) + is_96_[i_100_];
				int i_110_ = is_97_[i_100_] + (i_77_ << 9);
				is_99_[i_100_]
				    = (class161_73_.method2619(i_109_, i_110_,
							       -1124618958)
				       - class161.method2619(i_109_, i_110_,
							     -1459082608));
			    }
			}
		    }
		    int i_111_ = class161.method2577(i_76_, i_77_, (byte) 36);
		    int i_112_
			= class161.method2577(i_76_ + 1, i_77_, (byte) 64);
		    int i_113_ = class161.method2577(i_76_ + 1, i_77_ + 1,
						     (byte) -11);
		    int i_114_
			= class161.method2577(i_76_, 1 + i_77_, (byte) 62);
		    boolean bool
			= aClass475_4990.method7774(i_76_, i_77_, 2121151974);
		    if (bool && i > 1 || !bool && i > 0) {
			boolean bool_115_ = true;
			if (class23 != null && !class23.aBool224)
			    bool_115_ = false;
			else if (i_81_ == 0 && i_78_ != 0)
			    bool_115_ = false;
			else if (i_80_ > 0 && null != class658_82_
				 && !class658_82_.aBool8445)
			    bool_115_ = false;
			if (bool_115_ && i_111_ == i_112_ && i_113_ == i_111_
			    && i_111_ == i_114_)
			    aByteArrayArrayArray4973[i][i_76_][i_77_] |= 0x4;
		    }
		    Class176 class176 = new Class176();
		    if (aBool4965) {
			class176.anInt1877
			    = (aClass546_5007.method9035(i_76_, i_77_,
							 -1090854721)
			       * -455052721);
			class176.anInt1879
			    = aClass546_5007.method8945(i_76_, i_77_,
							889283761) * 616962313;
			class176.anInt1883
			    = (aClass546_5007.method8947(i_76_, i_77_,
							 -1891117424)
			       * 575868967);
			class176.anInt1881
			    = (aClass546_5007.method8948(i_76_, i_77_,
							 -1334640927)
			       * -1237930075);
			class176.anInt1882
			    = (aClass546_5007.method8949(i_76_, i_77_,
							 1792222708)
			       * 506197425);
			class176.anInt1878
			    = aClass546_5007.method8950(i_76_, i_77_,
							-932381380) * 86130037;
		    }
		    class161.method2590(i_76_, i_77_, is_96_, is_98_, is_97_,
					is_99_, is_86_, is_87_, is_88_, is_89_,
					is_92_, is_90_, is_91_, class176,
					false);
		    aClass546_5007.method9063(i, i_76_, i_77_, -1638648554);
		}
	    }
	}
    }
    
    void method7386(Class182 class182, int i, int i_116_, int i_117_,
		    int i_118_, int i_119_, Class23 class23, int i_120_,
		    int i_121_, int i_122_, int i_123_, boolean[] bools,
		    int[] is, int[] is_124_, int[] is_125_, int[] is_126_,
		    int[] is_127_, int[] is_128_, int[] is_129_, int[] is_130_,
		    int[][] is_131_, Class161 class161, Class161 class161_132_,
		    Class161 class161_133_, byte i_134_) {
	if (class23 != null) {
	    if (i_121_ == 0)
		i_121_ = i_120_;
	    if (0 == i_122_)
		i_122_ = i_120_;
	    if (0 == i_123_)
		i_123_ = i_120_;
	    Class23 class23_135_
		= ((Class23)
		   aClass40_Sub14_4954.method76(i_120_ - 1, -456300203));
	    Class23 class23_136_
		= ((Class23)
		   aClass40_Sub14_4954.method76(i_121_ - 1, 1962720351));
	    Class23 class23_137_
		= ((Class23)
		   aClass40_Sub14_4954.method76(i_122_ - 1, -32902048));
	    Class23 class23_138_
		= ((Class23)
		   aClass40_Sub14_4954.method76(i_123_ - 1, -399862591));
	    for (int i_139_ = 0; i_139_ < anInt5034 * 1936283541; i_139_++) {
		boolean bool = false;
		int i_140_;
		if (bools[0 - 1583960485 * anInt5017 & 0x3]
		    && anInt5025 * -1262762653 == anIntArray5039[0]) {
		    anIntArray5016[0]
			= anIntArray4952[anInt5025 * -1262762653];
		    anIntArray5016[1] = 1;
		    anIntArray5016[2]
			= anIntArray5038[-1262762653 * anInt5025];
		    anIntArray5016[3] = 1;
		    anIntArray5016[4]
			= anIntArray5037[-1262762653 * anInt5025];
		    anIntArray5016[5]
			= anIntArray5038[anInt5025 * -1262762653];
		    i_140_ = 6;
		} else if (bools[2 - anInt5017 * 1583960485 & 0x3]
			   && anIntArray5039[2] == -1262762653 * anInt5025) {
		    anIntArray5016[0]
			= anIntArray4952[anInt5025 * -1262762653];
		    anIntArray5016[1] = 5;
		    anIntArray5016[2]
			= anIntArray5038[-1262762653 * anInt5025];
		    anIntArray5016[3] = 5;
		    anIntArray5016[4]
			= anIntArray5037[-1262762653 * anInt5025];
		    anIntArray5016[5]
			= anIntArray5038[anInt5025 * -1262762653];
		    i_140_ = 6;
		} else if (bools[1 - 1583960485 * anInt5017 & 0x3]
			   && -1262762653 * anInt5025 == anIntArray5039[1]) {
		    anIntArray5016[0]
			= anIntArray4952[-1262762653 * anInt5025];
		    anIntArray5016[1] = 3;
		    anIntArray5016[2]
			= anIntArray5038[anInt5025 * -1262762653];
		    anIntArray5016[3] = 3;
		    anIntArray5016[4]
			= anIntArray5037[anInt5025 * -1262762653];
		    anIntArray5016[5]
			= anIntArray5038[-1262762653 * anInt5025];
		    i_140_ = 6;
		} else if (bools[3 - anInt5017 * 1583960485 & 0x3]
			   && -1262762653 * anInt5025 == anIntArray5039[3]) {
		    anIntArray5016[0]
			= anIntArray4952[-1262762653 * anInt5025];
		    anIntArray5016[1] = 7;
		    anIntArray5016[2]
			= anIntArray5038[-1262762653 * anInt5025];
		    anIntArray5016[3] = 7;
		    anIntArray5016[4]
			= anIntArray5037[anInt5025 * -1262762653];
		    anIntArray5016[5]
			= anIntArray5038[anInt5025 * -1262762653];
		    i_140_ = 6;
		} else {
		    anIntArray5016[0]
			= anIntArray4952[-1262762653 * anInt5025];
		    anIntArray5016[1]
			= anIntArray5037[anInt5025 * -1262762653];
		    anIntArray5016[2]
			= anIntArray5038[anInt5025 * -1262762653];
		    i_140_ = 3;
		}
		for (int i_141_ = 0; i_141_ < i_140_; i_141_++) {
		    int i_142_ = anIntArray5016[i_141_];
		    int i_143_ = i_142_ - -1127046326 * anInt5017 & 0x7;
		    int i_144_ = anIntArray4999[i_142_];
		    int i_145_ = anIntArray5000[i_142_];
		    int i_146_;
		    int i_147_;
		    if (1 == anInt5017 * 1583960485) {
			i_146_ = i_145_;
			i_147_ = 512 - i_144_;
		    } else if (1583960485 * anInt5017 == 2) {
			i_146_ = 512 - i_144_;
			i_147_ = 512 - i_145_;
		    } else if (1583960485 * anInt5017 == 3) {
			i_146_ = 512 - i_145_;
			i_147_ = i_144_;
		    } else {
			i_146_ = i_144_;
			i_147_ = i_145_;
		    }
		    is_124_[1122233837 * anInt5026] = i_146_;
		    is_125_[1122233837 * anInt5026] = i_147_;
		    if (null != is_129_
			&& (aBoolArrayArray5001[anInt5023 * 1434602089]
			    [i_142_])) {
			int i_148_ = (i_116_ << 9) + i_146_;
			int i_149_ = (i_117_ << 9) + i_147_;
			is_129_[1122233837 * anInt5026]
			    = (class161_132_.method2619(i_148_, i_149_,
							1857202782)
			       - class161.method2619(i_148_, i_149_,
						     -336768984));
		    }
		    if (null != is_130_) {
			if (class161_132_ != null
			    && !(aBoolArrayArray5001[anInt5023 * 1434602089]
				 [i_142_])) {
			    int i_150_ = i_146_ + (i_116_ << 9);
			    int i_151_ = i_147_ + (i_117_ << 9);
			    is_130_[anInt5026 * 1122233837]
				= (class161.method2619(i_150_, i_151_,
						       1339758195)
				   - class161_132_.method2619(i_150_, i_151_,
							      1990120238));
			} else if (null != class161_133_
				   && !(aBoolArrayArray5008
					[1434602089 * anInt5023][i_142_])) {
			    int i_152_ = (i_116_ << 9) + i_146_;
			    int i_153_ = (i_117_ << 9) + i_147_;
			    is_130_[anInt5026 * 1122233837]
				= (class161_133_.method2619(i_152_, i_153_,
							    -1496625637)
				   - class161.method2619(i_152_, i_153_,
							 1885727756));
			}
		    }
		    if (i_142_ < 8 && anIntArray4970[i_143_] >= 0) {
			if (is != null)
			    is[1122233837 * anInt5026]
				= anIntArray5018[i_143_];
			is_128_[anInt5026 * 1122233837]
			    = anIntArray5002[i_143_];
			is_127_[anInt5026 * 1122233837]
			    = anIntArray4993[i_143_];
			is_126_[1122233837 * anInt5026]
			    = anIntArray4955[i_143_];
		    } else {
			if (aBool5031 && (aBoolArrayArray5001
					  [anInt5023 * 1434602089][i_142_])) {
			    is_127_[anInt5026 * 1122233837]
				= 1327464973 * anInt5027;
			    is_128_[anInt5026 * 1122233837]
				= -1025563611 * anInt4983;
			    is_126_[1122233837 * anInt5026]
				= anInt5029 * -1146544487;
			} else if (0 == i_146_ && i_147_ == 0) {
			    is_126_[anInt5026 * 1122233837]
				= is_131_[i_116_][i_117_];
			    is_127_[1122233837 * anInt5026]
				= -1990883919 * class23_135_.anInt219;
			    is_128_[1122233837 * anInt5026]
				= -1908571849 * class23_135_.anInt220;
			} else if (i_146_ == 0 && 512 == i_147_) {
			    is_126_[anInt5026 * 1122233837]
				= is_131_[i_116_][i_119_];
			    is_127_[anInt5026 * 1122233837]
				= -1990883919 * class23_136_.anInt219;
			    is_128_[1122233837 * anInt5026]
				= class23_136_.anInt220 * -1908571849;
			} else if (i_146_ == 512 && 512 == i_147_) {
			    is_126_[anInt5026 * 1122233837]
				= is_131_[i_118_][i_119_];
			    is_127_[anInt5026 * 1122233837]
				= class23_137_.anInt219 * -1990883919;
			    is_128_[1122233837 * anInt5026]
				= -1908571849 * class23_137_.anInt220;
			} else if (512 == i_146_ && 0 == i_147_) {
			    is_126_[anInt5026 * 1122233837]
				= is_131_[i_118_][i_117_];
			    is_127_[anInt5026 * 1122233837]
				= -1990883919 * class23_138_.anInt219;
			    is_128_[1122233837 * anInt5026]
				= -1908571849 * class23_138_.anInt220;
			} else {
			    if (i_146_ < 256) {
				if (i_147_ < 256) {
				    is_127_[1122233837 * anInt5026]
					= -1990883919 * class23_135_.anInt219;
				    is_128_[1122233837 * anInt5026]
					= -1908571849 * class23_135_.anInt220;
				} else {
				    is_127_[anInt5026 * 1122233837]
					= class23_136_.anInt219 * -1990883919;
				    is_128_[anInt5026 * 1122233837]
					= class23_136_.anInt220 * -1908571849;
				}
			    } else if (i_147_ < 256) {
				is_127_[1122233837 * anInt5026]
				    = -1990883919 * class23_138_.anInt219;
				is_128_[anInt5026 * 1122233837]
				    = class23_138_.anInt220 * -1908571849;
			    } else {
				is_127_[1122233837 * anInt5026]
				    = class23_137_.anInt219 * -1990883919;
				is_128_[1122233837 * anInt5026]
				    = class23_137_.anInt220 * -1908571849;
			    }
			    int i_154_
				= Class239.method4426(is_131_[i_116_][i_117_],
						      is_131_[i_118_][i_117_],
						      i_146_ << 7 >> 9,
						      (byte) 17);
			    int i_155_
				= Class239.method4426(is_131_[i_116_][i_119_],
						      is_131_[i_118_][i_119_],
						      i_146_ << 7 >> 9,
						      (byte) 41);
			    is_126_[anInt5026 * 1122233837]
				= Class239.method4426(i_154_, i_155_,
						      i_147_ << 7 >> 9,
						      (byte) -46);
			}
			if (null != is)
			    is[anInt5026 * 1122233837]
				= is_126_[anInt5026 * 1122233837];
		    }
		    anInt5026 += -1473284123;
		}
		anInt5025 += -312744885;
	    }
	    if (1434602089 * anInt5023 != 0 && class23.aBool221)
		aBool5030 = true;
	}
    }
    
    static final int method7387(int i, int i_156_, int i_157_, int i_158_) {
	int i_159_
	    = 65536 - Class436.anIntArray4838[8192 * i_157_ / i_158_] >> 1;
	return ((65536 - i_159_) * i >> 16) + (i_159_ * i_156_ >> 16);
    }
    
    int method7388(int i, int i_160_, int i_161_, int i_162_, int i_163_,
		   Class161 class161, short[][] is, byte i_164_) {
	if ((1434602089 * anInt5023 == 0 || anInt5023 * 1434602089 == 12)
	    && i_160_ > 0 && i_161_ > 0 && i_160_ < -528942713 * anInt4963
	    && i_161_ < -129082381 * anInt4964) {
	    int i_165_ = 0;
	    int i_166_ = 0;
	    int i_167_ = 0;
	    int i_168_ = 0;
	    i_165_ = i_165_ + (i == is[i_160_ - 1][i_161_ - 1] ? 1 : -1);
	    i_166_ = i_166_ + (i == is[i_162_][i_161_ - 1] ? 1 : -1);
	    i_167_ = i_167_ + (is[i_162_][i_163_] == i ? 1 : -1);
	    i_168_ = i_168_ + (i == is[i_160_ - 1][i_163_] ? 1 : -1);
	    if (is[i_160_][i_161_ - 1] == i) {
		i_165_++;
		i_166_++;
	    } else {
		i_165_--;
		i_166_--;
	    }
	    if (i == is[i_162_][i_161_]) {
		i_166_++;
		i_167_++;
	    } else {
		i_166_--;
		i_167_--;
	    }
	    if (is[i_160_][i_163_] == i) {
		i_167_++;
		i_168_++;
	    } else {
		i_167_--;
		i_168_--;
	    }
	    if (i == is[i_160_ - 1][i_161_]) {
		i_168_++;
		i_165_++;
	    } else {
		i_168_--;
		i_165_--;
	    }
	    int i_169_ = i_165_ - i_167_;
	    if (i_169_ < 0)
		i_169_ = -i_169_;
	    int i_170_ = i_166_ - i_168_;
	    if (i_170_ < 0)
		i_170_ = -i_170_;
	    if (i_169_ == i_170_) {
		i_169_ = (class161.method2577(i_160_, i_161_, (byte) 19)
			  - class161.method2577(i_162_, i_163_, (byte) 53));
		if (i_169_ < 0)
		    i_169_ = -i_169_;
		i_170_ = (class161.method2577(i_162_, i_161_, (byte) -59)
			  - class161.method2577(i_160_, i_163_, (byte) 14));
		if (i_170_ < 0)
		    i_170_ = -i_170_;
	    }
	    return i_169_ < i_170_ ? 1 : 0;
	}
	return anInt5017 * 1583960485;
    }
    
    static final int method7389(int i, int i_171_, int i_172_) {
	if (i_171_ == i)
	    return i;
	int i_173_ = 128 - i_172_;
	int i_174_ = i_173_ * (i & 0x7f) + i_172_ * (i_171_ & 0x7f) >> 7;
	int i_175_ = (i_171_ & 0x380) * i_172_ + (i & 0x380) * i_173_ >> 7;
	int i_176_ = i_172_ * (i_171_ & 0xfc00) + i_173_ * (i & 0xfc00) >> 7;
	return i_176_ & 0xfc00 | i_175_ & 0x380 | i_174_ & 0x7f;
    }
    
    void method7390(Class182 class182, int i, int i_177_, int i_178_,
		    Class658 class658, boolean[] bools, int[] is,
		    int[] is_179_, int[] is_180_, int[] is_181_, int[] is_182_,
		    int[] is_183_, int[] is_184_, int[] is_185_,
		    Class161 class161, Class161 class161_186_,
		    Class161 class161_187_, byte i_188_) {
	anInt5029 = -553801129;
	anInt5027 = -1279630533;
	anInt4983 = 2086120704;
	if (null != class658) {
	    anInt5029 = class658.anInt8446 * -226588717;
	    anInt5027 = 1258019103 * class658.anInt8453;
	    anInt4983 = class658.anInt8447 * -55734087;
	    int i_189_ = Class197.method3750(class182, class658, -1804335532);
	    for (int i_190_ = 0; i_190_ < anInt5035 * -2054508397; i_190_++) {
		boolean bool = false;
		int i_191_;
		if (bools[0 - 1583960485 * anInt5017 & 0x3]
		    && anIntArray5039[0] == -1262762653 * anInt5025) {
		    anIntArray5016[0]
			= anIntArray4952[anInt5025 * -1262762653];
		    anIntArray5016[1] = 1;
		    anIntArray5016[2]
			= anIntArray5038[anInt5025 * -1262762653];
		    anIntArray5016[3] = 1;
		    anIntArray5016[4]
			= anIntArray5037[anInt5025 * -1262762653];
		    anIntArray5016[5]
			= anIntArray5038[-1262762653 * anInt5025];
		    i_191_ = 6;
		} else if (bools[2 - anInt5017 * 1583960485 & 0x3]
			   && -1262762653 * anInt5025 == anIntArray5039[2]) {
		    anIntArray5016[0]
			= anIntArray4952[anInt5025 * -1262762653];
		    anIntArray5016[1] = 5;
		    anIntArray5016[2]
			= anIntArray5038[anInt5025 * -1262762653];
		    anIntArray5016[3] = 5;
		    anIntArray5016[4]
			= anIntArray5037[-1262762653 * anInt5025];
		    anIntArray5016[5]
			= anIntArray5038[-1262762653 * anInt5025];
		    i_191_ = 6;
		} else if (bools[1 - anInt5017 * 1583960485 & 0x3]
			   && anInt5025 * -1262762653 == anIntArray5039[1]) {
		    anIntArray5016[0]
			= anIntArray4952[-1262762653 * anInt5025];
		    anIntArray5016[1] = 3;
		    anIntArray5016[2]
			= anIntArray5038[-1262762653 * anInt5025];
		    anIntArray5016[3] = 3;
		    anIntArray5016[4]
			= anIntArray5037[anInt5025 * -1262762653];
		    anIntArray5016[5]
			= anIntArray5038[anInt5025 * -1262762653];
		    i_191_ = 6;
		} else if (bools[3 - 1583960485 * anInt5017 & 0x3]
			   && anIntArray5039[3] == anInt5025 * -1262762653) {
		    anIntArray5016[0]
			= anIntArray4952[-1262762653 * anInt5025];
		    anIntArray5016[1] = 7;
		    anIntArray5016[2]
			= anIntArray5038[-1262762653 * anInt5025];
		    anIntArray5016[3] = 7;
		    anIntArray5016[4]
			= anIntArray5037[-1262762653 * anInt5025];
		    anIntArray5016[5]
			= anIntArray5038[anInt5025 * -1262762653];
		    i_191_ = 6;
		} else {
		    anIntArray5016[0]
			= anIntArray4952[-1262762653 * anInt5025];
		    anIntArray5016[1]
			= anIntArray5037[anInt5025 * -1262762653];
		    anIntArray5016[2]
			= anIntArray5038[-1262762653 * anInt5025];
		    i_191_ = 3;
		}
		for (int i_192_ = 0; i_192_ < i_191_; i_192_++) {
		    int i_193_ = anIntArray5016[i_192_];
		    int i_194_ = i_193_ - -1127046326 * anInt5017 & 0x7;
		    int i_195_ = anIntArray4999[i_193_];
		    int i_196_ = anIntArray5000[i_193_];
		    int i_197_;
		    int i_198_;
		    if (anInt5017 * 1583960485 == 1) {
			i_197_ = i_196_;
			i_198_ = 512 - i_195_;
		    } else if (anInt5017 * 1583960485 == 2) {
			i_197_ = 512 - i_195_;
			i_198_ = 512 - i_196_;
		    } else if (1583960485 * anInt5017 == 3) {
			i_197_ = 512 - i_196_;
			i_198_ = i_195_;
		    } else {
			i_197_ = i_195_;
			i_198_ = i_196_;
		    }
		    is_179_[anInt5026 * 1122233837] = i_197_;
		    is_180_[1122233837 * anInt5026] = i_198_;
		    if (null != is_184_
			&& (aBoolArrayArray5001[anInt5023 * 1434602089]
			    [i_193_])) {
			int i_199_ = i_197_ + (i_177_ << 9);
			int i_200_ = i_198_ + (i_178_ << 9);
			is_184_[anInt5026 * 1122233837]
			    = (class161_186_.method2619(i_199_, i_200_,
							-1999543090)
			       - class161.method2619(i_199_, i_200_,
						     -989632362));
		    }
		    if (null != is_185_) {
			if (class161_186_ != null
			    && !(aBoolArrayArray5001[1434602089 * anInt5023]
				 [i_193_])) {
			    int i_201_ = (i_177_ << 9) + i_197_;
			    int i_202_ = (i_178_ << 9) + i_198_;
			    is_185_[anInt5026 * 1122233837]
				= (class161.method2619(i_201_, i_202_,
						       -1823483800)
				   - class161_186_.method2619(i_201_, i_202_,
							      1065291304));
			} else if (class161_187_ != null
				   && !(aBoolArrayArray5008
					[1434602089 * anInt5023][i_193_])) {
			    int i_203_ = i_197_ + (i_177_ << 9);
			    int i_204_ = i_198_ + (i_178_ << 9);
			    is_185_[1122233837 * anInt5026]
				= (class161_187_.method2619(i_203_, i_204_,
							    -1856333512)
				   - class161.method2619(i_203_, i_204_,
							 -583543121));
			}
		    }
		    if (i_193_ < 8 && (anIntArray4970[i_194_]
				       > class658.anInt8449 * -59845159)) {
			if (is != null)
			    is[anInt5026 * 1122233837]
				= anIntArray5018[i_194_];
			is_183_[1122233837 * anInt5026]
			    = anIntArray5002[i_194_];
			is_182_[anInt5026 * 1122233837]
			    = anIntArray4993[i_194_];
			is_181_[1122233837 * anInt5026]
			    = anIntArray4955[i_194_];
		    } else {
			if (null != is)
			    is[1122233837 * anInt5026] = i_189_;
			is_182_[1122233837 * anInt5026]
			    = -1899182957 * class658.anInt8453;
			is_183_[1122233837 * anInt5026]
			    = 815197885 * class658.anInt8447;
			is_181_[anInt5026 * 1122233837]
			    = anInt5029 * -1146544487;
		    }
		    anInt5026 += -1473284123;
		}
		anInt5025 += -312744885;
	    }
	    if (!aBool4965 && 0 == i)
		aClass546_5007.method9097(i_177_, i_178_,
					  class658.anInt8455 * 1229422759,
					  -1741170792 * class658.anInt8443,
					  1393595585 * class658.anInt8448,
					  class658.anInt8454 * -1733705129,
					  class658.anInt8441 * -536318927,
					  1298567265 * class658.anInt8456,
					  -1864408245);
	    if (1434602089 * anInt5023 != 12
		&& class658.anInt8446 * -1932204261 != -1
		&& class658.aBool8451)
		aBool5030 = true;
	} else if (aBool5032)
	    anInt5025 += -312744885 * anIntArray4958[1434602089 * anInt5023];
	else if (aBool5031)
	    anInt5025 += -312744885 * anIntArray5011[1434602089 * anInt5023];
	else
	    anInt5025 += -312744885 * anIntArray4986[1434602089 * anInt5023];
    }
    
    public final void method7391(RSBuffer class525_sub38, int i,
								 int i_205_, int i_206_, int i_207_) {
	int i_208_ = i + i_206_;
	int i_209_ = i_207_ + i_205_;
	for (int i_210_ = 0; i_210_ < anInt4987 * -155906383; i_210_++) {
	    for (int i_211_ = 0; i_211_ < 64; i_211_++) {
		for (int i_212_ = 0; i_212_ < 64; i_212_++)
		    method7447(class525_sub38, i_210_, i_211_ + i,
			       i_205_ + i_212_, 0, 0, i_211_ + i_208_,
			       i_212_ + i_209_, 0, false, (byte) -96);
	    }
	}
    }
    
    public final void method7392
	(RSBuffer class525_sub38, int i, int i_213_, int i_214_,
	 int i_215_, int i_216_, int i_217_, int i_218_, byte i_219_) {
	int i_220_ = 8 * (i_216_ & 0x7);
	int i_221_ = (i_217_ & 0x7) * 8;
	int i_222_ = (i_216_ & ~0x7) << 3;
	int i_223_ = (i_217_ & ~0x7) << 3;
	int i_224_ = 0;
	int i_225_ = 0;
	if (i_218_ == 1)
	    i_225_ = 1;
	else if (2 == i_218_) {
	    i_224_ = 1;
	    i_225_ = 1;
	} else if (i_218_ == 3)
	    i_224_ = 1;
	for (int i_226_ = 0; i_226_ < anInt4987 * -155906383; i_226_++) {
	    for (int i_227_ = 0; i_227_ < 64; i_227_++) {
		for (int i_228_ = 0; i_228_ < 64; i_228_++) {
		    if (i_226_ == i_215_ && i_227_ >= i_220_
			&& i_227_ <= 8 + i_220_ && i_228_ >= i_221_
			&& i_228_ <= i_221_ + 8) {
			int i_229_;
			int i_230_;
			if (i_227_ == i_220_ + 8 || 8 + i_221_ == i_228_) {
			    if (i_218_ == 0) {
				i_229_ = i_213_ + (i_227_ - i_220_);
				i_230_ = i_214_ + (i_228_ - i_221_);
			    } else if (1 == i_218_) {
				i_229_ = i_228_ - i_221_ + i_213_;
				i_230_ = 8 + i_214_ - (i_227_ - i_220_);
			    } else if (i_218_ == 2) {
				i_229_ = 8 + i_213_ - (i_227_ - i_220_);
				i_230_ = i_214_ + 8 - (i_228_ - i_221_);
			    } else {
				i_229_ = 8 + i_213_ - (i_228_ - i_221_);
				i_230_ = i_227_ - i_220_ + i_214_;
			    }
			    method7447(class525_sub38, i, i_229_, i_230_, 0, 0,
				       i_227_ + i_222_, i_223_ + i_228_, 0,
				       true, (byte) -66);
			} else {
			    i_229_
				= i_213_ + Class382.method6427(i_227_ & 0x7,
							       i_228_ & 0x7,
							       i_218_,
							       (short) 1260);
			    i_230_ = i_214_ + Class512.method8536(i_227_ & 0x7,
								  i_228_ & 0x7,
								  i_218_,
								  -2146747069);
			    method7447(class525_sub38, i, i_229_, i_230_,
				       i_224_, i_225_, i_227_ + i_222_,
				       i_223_ + i_228_, i_218_, false,
				       (byte) -30);
			}
			if (i_227_ == 63 || 63 == i_228_) {
			    int i_231_ = 1;
			    if (i_227_ == 63 && 63 == i_228_)
				i_231_ = 3;
			    for (int i_232_ = 0; i_232_ < i_231_; i_232_++) {
				int i_233_ = i_227_;
				int i_234_ = i_228_;
				if (0 == i_232_) {
				    i_233_ = 63 == i_227_ ? 64 : i_227_;
				    i_234_ = i_228_ == 63 ? 64 : i_228_;
				} else if (i_232_ == 1)
				    i_233_ = 64;
				else if (2 == i_232_)
				    i_234_ = 64;
				int i_235_;
				int i_236_;
				if (i_218_ == 0) {
				    i_235_ = i_233_ - i_220_ + i_213_;
				    i_236_ = i_234_ - i_221_ + i_214_;
				} else if (i_218_ == 1) {
				    i_235_ = i_234_ - i_221_ + i_213_;
				    i_236_ = i_214_ + 8 - (i_233_ - i_220_);
				} else if (i_218_ == 2) {
				    i_235_ = i_213_ + 8 - (i_233_ - i_220_);
				    i_236_ = i_214_ + 8 - (i_234_ - i_221_);
				} else {
				    i_235_ = i_213_ + 8 - (i_234_ - i_221_);
				    i_236_ = i_214_ + (i_233_ - i_220_);
				}
				if (i_235_ >= 0
				    && i_235_ < anInt4963 * -528942713
				    && i_236_ >= 0
				    && i_236_ < -129082381 * anInt4964)
				    anIntArrayArrayArray4966[i][i_235_][i_236_]
					= (anIntArrayArrayArray4966[i]
					   [i_224_ + i_229_][i_225_ + i_230_]);
			    }
			}
		    } else
			method7447(class525_sub38, 0, -1, -1, 0, 0, 0, 0, 0,
				   false, (byte) -96);
		}
	    }
	}
    }
    
    final void method7393(Class182 class182, Class658 class658,
			  Class23 class23, int i, int i_237_, int i_238_,
			  int i_239_, short[][] is, byte[][] is_240_,
			  byte[][] is_241_, boolean[] bools, int i_242_) {
	boolean[] bools_243_ = (null != class658 && class658.aBool8450
				? aBoolArrayArray5010[anInt5023 * 1434602089]
				: aBoolArrayArray5006[1434602089 * anInt5023]);
	if (i_237_ > 0) {
	    if (i > 0) {
		int i_244_ = is[i - 1][i_237_ - 1] & 0x7fff;
		if (i_244_ > 0) {
		    Class658 class658_245_
			= (Class658) aClass40_Sub18_5020.method76(i_244_ - 1,
								  -2123669688);
		    if (class658_245_.anInt8446 * -1932204261 != -1
			&& class658_245_.aBool8450) {
			byte i_246_ = is_240_[i - 1][i_237_ - 1];
			int i_247_ = is_241_[i - 1][i_237_ - 1] * 2 + 4 & 0x7;
			int i_248_
			    = Class197.method3750(class182, class658_245_,
						  -432090579);
			if (aBoolArrayArray5001[i_246_][i_247_]) {
			    anIntArray4955[0]
				= -1932204261 * class658_245_.anInt8446;
			    anIntArray5018[0] = i_248_;
			    anIntArray4993[0]
				= -1899182957 * class658_245_.anInt8453;
			    anIntArray5002[0]
				= class658_245_.anInt8447 * 815197885;
			    anIntArray4970[0]
				= -59845159 * class658_245_.anInt8449;
			    anIntArray4997[0] = 256;
			}
		    }
		}
	    }
	    if (i < i_238_ - 1) {
		int i_249_ = is[i + 1][i_237_ - 1] & 0x7fff;
		if (i_249_ > 0) {
		    Class658 class658_250_
			= (Class658) aClass40_Sub18_5020.method76(i_249_ - 1,
								  -1749595000);
		    if (-1 != -1932204261 * class658_250_.anInt8446
			&& class658_250_.aBool8450) {
			byte i_251_ = is_240_[1 + i][i_237_ - 1];
			int i_252_ = is_241_[1 + i][i_237_ - 1] * 2 + 6 & 0x7;
			int i_253_
			    = Class197.method3750(class182, class658_250_,
						  -1514369103);
			if (aBoolArrayArray5001[i_251_][i_252_]) {
			    anIntArray4955[2]
				= class658_250_.anInt8446 * -1932204261;
			    anIntArray5018[2] = i_253_;
			    anIntArray4993[2]
				= -1899182957 * class658_250_.anInt8453;
			    anIntArray5002[2]
				= 815197885 * class658_250_.anInt8447;
			    anIntArray4970[2]
				= -59845159 * class658_250_.anInt8449;
			    anIntArray4997[2] = 512;
			}
		    }
		}
	    }
	}
	if (i_237_ < i_239_ - 1) {
	    if (i > 0) {
		int i_254_ = is[i - 1][1 + i_237_] & 0x7fff;
		if (i_254_ > 0) {
		    Class658 class658_255_
			= (Class658) aClass40_Sub18_5020.method76(i_254_ - 1,
								  -958938575);
		    if (-1 != class658_255_.anInt8446 * -1932204261
			&& class658_255_.aBool8450) {
			byte i_256_ = is_240_[i - 1][1 + i_237_];
			int i_257_ = 2 + is_241_[i - 1][i_237_ + 1] * 2 & 0x7;
			int i_258_
			    = Class197.method3750(class182, class658_255_,
						  -25238891);
			if (aBoolArrayArray5001[i_256_][i_257_]) {
			    anIntArray4955[6]
				= -1932204261 * class658_255_.anInt8446;
			    anIntArray5018[6] = i_258_;
			    anIntArray4993[6]
				= -1899182957 * class658_255_.anInt8453;
			    anIntArray5002[6]
				= class658_255_.anInt8447 * 815197885;
			    anIntArray4970[6]
				= class658_255_.anInt8449 * -59845159;
			    anIntArray4997[6] = 64;
			}
		    }
		}
	    }
	    if (i < i_238_ - 1) {
		int i_259_ = is[i + 1][1 + i_237_] & 0x7fff;
		if (i_259_ > 0) {
		    Class658 class658_260_
			= (Class658) aClass40_Sub18_5020.method76(i_259_ - 1,
								  -644213787);
		    if (-1 != class658_260_.anInt8446 * -1932204261
			&& class658_260_.aBool8450) {
			byte i_261_ = is_240_[i + 1][1 + i_237_];
			int i_262_ = 0 + is_241_[1 + i][1 + i_237_] * 2 & 0x7;
			int i_263_
			    = Class197.method3750(class182, class658_260_,
						  -942560745);
			if (aBoolArrayArray5001[i_261_][i_262_]) {
			    anIntArray4955[4]
				= -1932204261 * class658_260_.anInt8446;
			    anIntArray5018[4] = i_263_;
			    anIntArray4993[4]
				= class658_260_.anInt8453 * -1899182957;
			    anIntArray5002[4]
				= 815197885 * class658_260_.anInt8447;
			    anIntArray4970[4]
				= class658_260_.anInt8449 * -59845159;
			    anIntArray4997[4] = 128;
			}
		    }
		}
	    }
	}
	if (i_237_ > 0) {
	    int i_264_ = is[i][i_237_ - 1] & 0x7fff;
	    if (i_264_ > 0) {
		Class658 class658_265_
		    = ((Class658)
		       aClass40_Sub18_5020.method76(i_264_ - 1, 1000979514));
		if (class658_265_.anInt8446 * -1932204261 != -1) {
		    byte i_266_ = is_240_[i][i_237_ - 1];
		    int i_267_ = is_241_[i][i_237_ - 1];
		    if (class658_265_.aBool8450) {
			int i_268_ = 2;
			int i_269_ = 2 * i_267_ + 4;
			int i_270_
			    = Class197.method3750(class182, class658_265_,
						  -1953190622);
			for (int i_271_ = 0; i_271_ < 3; i_271_++) {
			    i_269_ &= 0x7;
			    i_268_ &= 0x7;
			    if (aBoolArrayArray5001[i_266_][i_269_]
				&& (anIntArray4970[i_268_]
				    <= -59845159 * class658_265_.anInt8449)) {
				anIntArray4955[i_268_]
				    = -1932204261 * class658_265_.anInt8446;
				anIntArray5018[i_268_] = i_270_;
				anIntArray4993[i_268_]
				    = -1899182957 * class658_265_.anInt8453;
				anIntArray5002[i_268_]
				    = class658_265_.anInt8447 * 815197885;
				if (-59845159 * class658_265_.anInt8449
				    == anIntArray4970[i_268_])
				    anIntArray4997[i_268_] |= 0x20;
				else
				    anIntArray4997[i_268_] = 32;
				anIntArray4970[i_268_]
				    = -59845159 * class658_265_.anInt8449;
			    }
			    i_269_++;
			    i_268_--;
			}
			if (!bools_243_[1583960485 * anInt5017 + 0 & 0x3])
			    bools[0] = (aBoolArrayArray5010[i_266_]
					[2 + i_267_ & 0x3]);
		    } else if (!bools_243_[0 + anInt5017 * 1583960485 & 0x3])
			bools[0]
			    = aBoolArrayArray5006[i_266_][i_267_ + 2 & 0x3];
		}
	    }
	}
	if (i_237_ < i_239_ - 1) {
	    int i_272_ = is[i][i_237_ + 1] & 0x7fff;
	    if (i_272_ > 0) {
		Class658 class658_273_
		    = ((Class658)
		       aClass40_Sub18_5020.method76(i_272_ - 1, -1304722321));
		if (class658_273_.anInt8446 * -1932204261 != -1) {
		    byte i_274_ = is_240_[i][i_237_ + 1];
		    int i_275_ = is_241_[i][1 + i_237_];
		    if (class658_273_.aBool8450) {
			int i_276_ = 4;
			int i_277_ = i_275_ * 2 + 2;
			int i_278_
			    = Class197.method3750(class182, class658_273_,
						  1013741734);
			for (int i_279_ = 0; i_279_ < 3; i_279_++) {
			    i_277_ &= 0x7;
			    i_276_ &= 0x7;
			    if (aBoolArrayArray5001[i_274_][i_277_]
				&& (anIntArray4970[i_276_]
				    <= class658_273_.anInt8449 * -59845159)) {
				anIntArray4955[i_276_]
				    = -1932204261 * class658_273_.anInt8446;
				anIntArray5018[i_276_] = i_278_;
				anIntArray4993[i_276_]
				    = -1899182957 * class658_273_.anInt8453;
				anIntArray5002[i_276_]
				    = 815197885 * class658_273_.anInt8447;
				if (-59845159 * class658_273_.anInt8449
				    == anIntArray4970[i_276_])
				    anIntArray4997[i_276_] |= 0x10;
				else
				    anIntArray4997[i_276_] = 16;
				anIntArray4970[i_276_]
				    = class658_273_.anInt8449 * -59845159;
			    }
			    i_277_--;
			    i_276_++;
			}
			if (!bools_243_[1583960485 * anInt5017 + 2 & 0x3])
			    bools[2] = (aBoolArrayArray5010[i_274_]
					[0 + i_275_ & 0x3]);
		    } else if (!bools_243_[1583960485 * anInt5017 + 2 & 0x3])
			bools[2]
			    = aBoolArrayArray5006[i_274_][0 + i_275_ & 0x3];
		}
	    }
	}
	if (i > 0) {
	    int i_280_ = is[i - 1][i_237_] & 0x7fff;
	    if (i_280_ > 0) {
		Class658 class658_281_
		    = ((Class658)
		       aClass40_Sub18_5020.method76(i_280_ - 1, -1556200809));
		if (-1932204261 * class658_281_.anInt8446 != -1) {
		    byte i_282_ = is_240_[i - 1][i_237_];
		    int i_283_ = is_241_[i - 1][i_237_];
		    if (class658_281_.aBool8450) {
			int i_284_ = 6;
			int i_285_ = 4 + i_283_ * 2;
			int i_286_
			    = Class197.method3750(class182, class658_281_,
						  -1574118088);
			for (int i_287_ = 0; i_287_ < 3; i_287_++) {
			    i_285_ &= 0x7;
			    i_284_ &= 0x7;
			    if (aBoolArrayArray5001[i_282_][i_285_]
				&& (anIntArray4970[i_284_]
				    <= class658_281_.anInt8449 * -59845159)) {
				anIntArray4955[i_284_]
				    = -1932204261 * class658_281_.anInt8446;
				anIntArray5018[i_284_] = i_286_;
				anIntArray4993[i_284_]
				    = -1899182957 * class658_281_.anInt8453;
				anIntArray5002[i_284_]
				    = class658_281_.anInt8447 * 815197885;
				if (class658_281_.anInt8449 * -59845159
				    == anIntArray4970[i_284_])
				    anIntArray4997[i_284_] |= 0x8;
				else
				    anIntArray4997[i_284_] = 8;
				anIntArray4970[i_284_]
				    = -59845159 * class658_281_.anInt8449;
			    }
			    i_285_--;
			    i_284_++;
			}
			if (!bools_243_[1583960485 * anInt5017 + 3 & 0x3])
			    bools[3] = (aBoolArrayArray5010[i_282_]
					[1 + i_283_ & 0x3]);
		    } else if (!bools_243_[1583960485 * anInt5017 + 3 & 0x3])
			bools[3]
			    = aBoolArrayArray5006[i_282_][1 + i_283_ & 0x3];
		}
	    }
	}
	if (i < i_238_ - 1) {
	    int i_288_ = is[i + 1][i_237_] & 0x7fff;
	    if (i_288_ > 0) {
		Class658 class658_289_
		    = ((Class658)
		       aClass40_Sub18_5020.method76(i_288_ - 1, -1095356743));
		if (-1932204261 * class658_289_.anInt8446 != -1) {
		    byte i_290_ = is_240_[1 + i][i_237_];
		    int i_291_ = is_241_[1 + i][i_237_];
		    if (class658_289_.aBool8450) {
			int i_292_ = 4;
			int i_293_ = 2 * i_291_ + 6;
			int i_294_
			    = Class197.method3750(class182, class658_289_,
						  -1818292684);
			for (int i_295_ = 0; i_295_ < 3; i_295_++) {
			    i_293_ &= 0x7;
			    i_292_ &= 0x7;
			    if (aBoolArrayArray5001[i_290_][i_293_]
				&& (anIntArray4970[i_292_]
				    <= -59845159 * class658_289_.anInt8449)) {
				anIntArray4955[i_292_]
				    = -1932204261 * class658_289_.anInt8446;
				anIntArray5018[i_292_] = i_294_;
				anIntArray4993[i_292_]
				    = -1899182957 * class658_289_.anInt8453;
				anIntArray5002[i_292_]
				    = 815197885 * class658_289_.anInt8447;
				if (class658_289_.anInt8449 * -59845159
				    == anIntArray4970[i_292_])
				    anIntArray4997[i_292_] |= 0x4;
				else
				    anIntArray4997[i_292_] = 4;
				anIntArray4970[i_292_]
				    = class658_289_.anInt8449 * -59845159;
			    }
			    i_293_++;
			    i_292_--;
			}
			if (!bools_243_[1 + anInt5017 * 1583960485 & 0x3])
			    bools[1] = (aBoolArrayArray5010[i_290_]
					[i_291_ + 3 & 0x3]);
		    } else if (!bools_243_[1 + 1583960485 * anInt5017 & 0x3])
			bools[1]
			    = aBoolArrayArray5006[i_290_][i_291_ + 3 & 0x3];
		}
	    }
	}
	if (class658 != null && class658.aBool8450) {
	    int i_296_ = Class197.method3750(class182, class658, 447447409);
	    for (int i_297_ = 0; i_297_ < 8; i_297_++) {
		int i_298_ = i_297_ - -1127046326 * anInt5017 & 0x7;
		if (aBoolArrayArray5001[anInt5023 * 1434602089][i_297_]
		    && (anIntArray4970[i_298_]
			<= class658.anInt8449 * -59845159)) {
		    anIntArray4955[i_298_] = class658.anInt8446 * -1932204261;
		    anIntArray5018[i_298_] = i_296_;
		    anIntArray4993[i_298_] = -1899182957 * class658.anInt8453;
		    anIntArray5002[i_298_] = class658.anInt8447 * 815197885;
		    if (anIntArray4970[i_298_]
			== -59845159 * class658.anInt8449)
			anIntArray4997[i_298_] |= 0x2;
		    else
			anIntArray4997[i_298_] = 2;
		    anIntArray4970[i_298_] = -59845159 * class658.anInt8449;
		}
	    }
	}
    }
    
    static {
	anIntArray4986 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };
	anIntArray4996 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };
	anIntArray5011 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };
	anIntArray4998 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };
	anIntArray4999 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128,
				     256, 128, 384, 256 };
	anIntArray5000 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256,
				     384, 128, 128, 256 };
	aBoolArrayArray5001
	    = (new boolean[][]
	       { { true, true, true, true, true, true, true, true, true, true,
		   true, true, true },
		 { true, true, true, false, false, false, true, true, false,
		   false, false, false, true },
		 { true, false, false, false, false, true, true, true, false,
		   false, false, false, false },
		 { false, false, true, true, true, true, false, false, false,
		   false, false, false, false },
		 { true, true, true, true, true, true, false, false, false,
		   false, false, false, false },
		 { true, true, true, false, false, true, true, true, false,
		   false, false, false, false },
		 { true, true, false, false, false, true, true, true, false,
		   false, false, false, true },
		 { true, true, false, false, false, false, false, true, false,
		   false, false, false, false },
		 { false, true, true, true, true, true, true, true, false,
		   false, false, false, false },
		 { true, false, false, false, true, true, true, true, true,
		   true, false, false, false },
		 { true, true, true, true, true, false, false, false, true,
		   true, false, false, false },
		 { true, true, true, false, false, false, false, false, false,
		   false, true, true, false },
		 { false, false, false, false, false, false, false, false,
		   false, false, false, false, false },
		 { true, true, true, true, true, true, true, true, true, true,
		   true, true, true },
		 { false, false, false, false, false, false, false, false,
		   false, false, false, false, false } });
	aBoolArrayArray5008
	    = (new boolean[][]
	       { { false, false, false, false, false, false, false, false,
		   false, false, false, false, false },
		 { false, false, true, true, true, true, true, false, false,
		   false, false, false, true },
		 { true, true, true, true, true, true, false, false, false,
		   false, false, false, false },
		 { true, true, true, false, false, true, true, true, false,
		   false, false, false, false },
		 { true, false, false, false, false, true, true, true, false,
		   false, false, false, false },
		 { false, false, true, true, true, true, false, false, false,
		   false, false, false, false },
		 { false, true, true, true, true, true, false, false, false,
		   false, false, false, true },
		 { false, true, true, true, true, true, true, true, false,
		   false, false, false, true },
		 { true, true, false, false, false, false, false, true, false,
		   false, false, false, false },
		 { true, true, true, true, true, false, false, false, true,
		   true, false, false, false },
		 { true, false, false, false, true, true, true, true, true,
		   true, false, false, false },
		 { true, false, true, true, true, true, true, true, false,
		   false, true, true, false },
		 { true, true, true, true, true, true, true, true, true, true,
		   true, true, true },
		 { false, false, false, false, false, false, false, false,
		   false, false, false, false, false },
		 { true, true, true, true, true, true, true, true, true, true,
		   true, true, true } });
	anIntArrayArray5015
	    = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 },
			    { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 },
			    { 0, 4, 4, 4 }, { 4, 4, 4, 0 },
			    { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 },
			    { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 },
			    { 0, 4, 4, 4 } };
	anIntArrayArray5019
	    = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 },
			    { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 },
			    { 1, 6, 7, 1 }, { 6, 7, 1, 1 },
			    { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 },
			    { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 },
			    { 1, 6, 7, 1 } };
	anIntArrayArray5005
	    = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 },
			    { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 },
			    { 7, 7, 1, 2 }, { 7, 1, 2, 7 },
			    { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 },
			    { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 },
			    { 7, 7, 1, 2 } };
	aBoolArrayArray5006
	    = (new boolean[][]
	       { { false, false, false, false },
		 { false, false, false, false }, { false, false, true, false },
		 { false, false, true, false }, { false, false, true, false },
		 { false, false, true, false }, { true, false, true, false },
		 { true, false, false, true }, { true, false, false, true },
		 { false, false, false, false },
		 { false, false, false, false },
		 { false, false, false, false },
		 { false, false, false, false } });
	anIntArrayArray4962
	    = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 },
			    { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 },
			    { -1, 4, -1, 1 }, { -1, 1, 3, -1 },
			    { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 },
			    { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };
	anIntArrayArray5036
	    = (new int[][]
	       { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 },
		 { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 },
		 { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 },
		 { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } });
	anIntArrayArray5009
	    = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 },
			    { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 },
			    { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 },
			    { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 },
			    { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 },
			    { 2, 4, 6, 0 } };
	anIntArrayArray4995
	    = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 },
			    { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 },
			    { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 },
			    { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 },
			    { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 },
			    { 12, 12, 12, 12 } };
	aBoolArrayArray5010
	    = (new boolean[][]
	       { { false, false, false, false }, { false, true, true, false },
		 { true, false, true, false }, { true, false, true, false },
		 { false, false, true, false }, { false, false, true, false },
		 { true, false, true, false }, { true, false, false, true },
		 { true, false, false, true }, { true, true, false, false },
		 { false, false, false, false }, { false, true, false, true },
		 { false, false, false, false } });
	anIntArrayArray5033
	    = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 },
			    { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 },
			    { -1, 4, -1, 1 }, { -1, 3, 4, -1 },
			    { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 },
			    { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };
	anIntArrayArray5013
	    = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 },
			    { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 },
			    { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 },
			    { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 },
			    { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 },
			    { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };
	anIntArrayArray5014
	    = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 },
			    { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 },
			    { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 },
			    { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 },
			    { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 },
			    { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };
	anIntArrayArray4979
	    = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 },
			    { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 },
			    { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 },
			    { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 },
			    { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 },
			    { 10, 10, 11, 11, 11, 7, 3, 7 },
			    { 12, 12, 12, 12 } };
    }
    
    public void method7394() {
	aBool4968 = true;
    }
    
    public void method7395() {
	aBool4968 = true;
    }
    
    void method7396(Class182 class182, Class161 class161, int i, int[][] is,
		    Class161 class161_299_, Class161 class161_300_) {
	byte[][] is_301_ = aByteArrayArrayArray4969[i];
	byte[][] is_302_ = aByteArrayArrayArray5024[i];
	short[][] is_303_ = aShortArrayArrayArray4971[i];
	short[][] is_304_ = aShortArrayArrayArray4972[i];
	boolean[] bools = new boolean[4];
	for (int i_305_ = 0; i_305_ < -528942713 * anInt4963; i_305_++) {
	    int i_306_
		= i_305_ < -528942713 * anInt4963 - 1 ? i_305_ + 1 : i_305_;
	    for (int i_307_ = 0; i_307_ < -129082381 * anInt4964; i_307_++) {
		int i_308_ = (i_307_ < -129082381 * anInt4964 - 1 ? 1 + i_307_
			      : i_307_);
		anInt5023 = is_301_[i_305_][i_307_] * 1378346457;
		anInt5017 = 616377901 * is_302_[i_305_][i_307_];
		int i_309_ = is_304_[i_305_][i_307_] & 0x7fff;
		int i_310_ = is_303_[i_305_][i_307_] & 0x7fff;
		if (i_309_ != 0 || i_310_ != 0) {
		    Class658 class658
			= ((Class658)
			   (i_309_ != 0
			    ? aClass40_Sub18_5020.method76(i_309_ - 1,
							   -706009634)
			    : null));
		    Class23 class23
			= (Class23) (i_310_ != 0
				     ? aClass40_Sub14_4954.method76(i_310_ - 1,
								    1607810874)
				     : null);
		    if (0 == anInt5023 * 1434602089 && null == class658)
			anInt5023 = -639711700;
		    aBool5030 = false;
		    aBool5031 = false;
		    boolean[] bools_311_ = bools;
		    boolean[] bools_312_ = bools;
		    boolean[] bools_313_ = bools;
		    bools[3] = false;
		    bools_313_[2] = false;
		    bools_312_[1] = false;
		    bools_311_[0] = false;
		    Class658 class658_314_ = class658;
		    if (null != class658) {
			if (class658.anInt8446 * -1932204261 == -1
			    && 2040702555 * class658.anInt8452 == -1) {
			    class658_314_ = class658;
			    class658 = null;
			} else if (class23 != null
				   && anInt5023 * 1434602089 != 0)
			    aBool5031 = class658.aBool8450;
		    }
		    anInt5017 = method7388(i_310_, i_305_, i_307_, i_306_,
					   i_308_, class161, is_303_,
					   (byte) -42) * 616377901;
		    for (int i_315_ = 0; i_315_ < 13; i_315_++) {
			anIntArray4970[i_315_] = -1;
			anIntArray4997[i_315_] = 1;
		    }
		    method7397(class182, class658, class23, i_305_, i_307_,
			       is_301_, is_302_, is_304_, bools, (byte) -84);
		    aBool5032 = (!aBool5031 && !bools[0] && !bools[2]
				 && !bools[1] && !bools[3]);
		    method7407(class658, class23, (byte) 102);
		    int i_316_
			= anInt5035 * -2054508397 + anInt5034 * 1936283541;
		    if (i_316_ <= 0)
			aClass546_5007.method9063(i, i_305_, i_307_,
						  -1024664083);
		    else {
			if (bools[0])
			    i_316_++;
			if (bools[2])
			    i_316_++;
			if (bools[1])
			    i_316_++;
			if (bools[3])
			    i_316_++;
			anInt5025 = 0;
			anInt5026 = 0;
			int i_317_ = 3 * i_316_;
			int[] is_318_ = aBool5022 ? new int[i_317_] : null;
			int[] is_319_ = new int[i_317_];
			int[] is_320_ = new int[i_317_];
			int[] is_321_ = new int[i_317_];
			int[] is_322_ = new int[i_317_];
			int[] is_323_ = new int[i_317_];
			int[] is_324_
			    = class161_300_ != null ? new int[i_317_] : null;
			int[] is_325_
			    = (null != class161_300_ || class161_299_ != null
			       ? new int[i_317_] : null);
			for (int i_326_ = 0; i_326_ < i_317_; i_326_++)
			    is_322_[i_326_] = -1;
			method7390(class182, i, i_305_, i_307_, class658,
				   bools, is_318_, is_319_, is_320_, is_321_,
				   is_322_, is_323_, is_324_, is_325_,
				   class161, class161_300_, class161_299_,
				   (byte) 85);
			int i_327_ = is_303_[i_305_][i_308_] & 0x7fff;
			int i_328_ = is_303_[i_306_][i_308_] & 0x7fff;
			int i_329_ = is_303_[i_306_][i_307_] & 0x7fff;
			method7386(class182, i, i_305_, i_307_, i_306_, i_308_,
				   class23, i_310_, i_327_, i_328_, i_329_,
				   bools, is_318_, is_319_, is_320_, is_321_,
				   is_322_, is_323_, is_324_, is_325_, is,
				   class161, class161_300_, class161_299_,
				   (byte) 36);
			method7426(class161, class23, class658_314_, i, i_305_,
				   i_307_, i_306_, i_308_, i_310_, i_309_,
				   1884912401);
			Class176 class176 = new Class176();
			if (aBool4965) {
			    class176.anInt1877
				= (aClass546_5007.method9035(i_305_, i_307_,
							     631039543)
				   * -455052721);
			    class176.anInt1879
				= (aClass546_5007.method8945(i_305_, i_307_,
							     889283761)
				   * 616962313);
			    class176.anInt1883
				= (aClass546_5007.method8947(i_305_, i_307_,
							     -2002722619)
				   * 575868967);
			    class176.anInt1881
				= (aClass546_5007.method8948(i_305_, i_307_,
							     -1334640927)
				   * -1237930075);
			    class176.anInt1882
				= (aClass546_5007.method8949(i_305_, i_307_,
							     988226562)
				   * 506197425);
			    class176.anInt1878
				= (aClass546_5007.method8950(i_305_, i_307_,
							     -932381380)
				   * 86130037);
			}
			class161.method2576(i_305_, i_307_, is_319_, is_324_,
					    is_320_, is_325_, is_321_, is_318_,
					    is_322_, is_323_, class176,
					    aBool5030);
			aClass546_5007.method9063(i, i_305_, i_307_,
						  -1008767012);
		    }
		}
	    }
	}
    }
    
    void method7397(Class182 class182, Class658 class658, Class23 class23,
		    int i, int i_330_, byte[][] is, byte[][] is_331_,
		    short[][] is_332_, boolean[] bools, byte i_333_) {
	boolean[] bools_334_ = (null != class658 && class658.aBool8450
				? aBoolArrayArray5010[1434602089 * anInt5023]
				: aBoolArrayArray5006[anInt5023 * 1434602089]);
	method7393(class182, class658, class23, i, i_330_,
		   anInt4963 * -528942713, -129082381 * anInt4964, is_332_, is,
		   is_331_, bools, 1576602190);
	aBool5022 = null != class658 && (-1932204261 * class658.anInt8446
					 != class658.anInt8452 * 2040702555);
	if (!aBool5022) {
	    for (int i_335_ = 0; i_335_ < 8; i_335_++) {
		if (anIntArray4970[i_335_] >= 0
		    && anIntArray4955[i_335_] != anIntArray5018[i_335_]) {
		    aBool5022 = true;
		    break;
		}
	    }
	}
	if (!bools_334_[1 + 1583960485 * anInt5017 & 0x3]) {
	    boolean[] bools_336_ = bools;
	    int i_337_ = 1;
	    bools_336_[i_337_]
		= bools_336_[i_337_] | 0 == (anIntArray4997[2]
					     & anIntArray4997[4]);
	}
	if (!bools_334_[3 + 1583960485 * anInt5017 & 0x3]) {
	    boolean[] bools_338_ = bools;
	    int i_339_ = 3;
	    bools_338_[i_339_]
		= bools_338_[i_339_] | 0 == (anIntArray4997[6]
					     & anIntArray4997[0]);
	}
	if (!bools_334_[0 + anInt5017 * 1583960485 & 0x3]) {
	    boolean[] bools_340_ = bools;
	    int i_341_ = 0;
	    bools_340_[i_341_]
		= bools_340_[i_341_] | 0 == (anIntArray4997[0]
					     & anIntArray4997[2]);
	}
	if (!bools_334_[2 + anInt5017 * 1583960485 & 0x3]) {
	    boolean[] bools_342_ = bools;
	    int i_343_ = 2;
	    bools_342_[i_343_]
		= bools_342_[i_343_] | 0 == (anIntArray4997[4]
					     & anIntArray4997[6]);
	}
	if (!aBool5031
	    && (1434602089 * anInt5023 == 0 || 12 == anInt5023 * 1434602089)) {
	    if (bools[0] && !bools[1] && !bools[2] && bools[3]) {
		boolean[] bools_344_ = bools;
		bools[3] = false;
		bools_344_[0] = false;
		anInt5023
		    = 1378346457 * (anInt5023 * 1434602089 == 0 ? 13 : 14);
		anInt5017 = 0;
	    } else if (bools[0] && bools[1] && !bools[2] && !bools[3]) {
		boolean[] bools_345_ = bools;
		bools[1] = false;
		bools_345_[0] = false;
		anInt5023
		    = (1434602089 * anInt5023 == 0 ? 13 : 14) * 1378346457;
		anInt5017 = 1849133703;
	    } else if (!bools[0] && bools[1] && bools[2] && !bools[3]) {
		boolean[] bools_346_ = bools;
		bools[2] = false;
		bools_346_[1] = false;
		anInt5023
		    = (0 == 1434602089 * anInt5023 ? 13 : 14) * 1378346457;
		anInt5017 = 1232755802;
	    } else if (!bools[0] && !bools[1] && bools[2] && bools[3]) {
		boolean[] bools_347_ = bools;
		bools[3] = false;
		bools_347_[2] = false;
		anInt5023
		    = (1434602089 * anInt5023 == 0 ? 13 : 14) * 1378346457;
		anInt5017 = 616377901;
	    }
	}
    }
    
    public final void method7398(int i, int i_348_, int i_349_, int i_350_) {
	for (int i_351_ = 0; i_351_ < -155906383 * anInt4987; i_351_++)
	    method7378(i_351_, i, i_348_, i_349_, i_350_, -2143043718);
    }
    
    public final void method7399(RSBuffer class525_sub38, int i,
								 int i_352_, int i_353_, int i_354_) {
	int i_355_ = i + i_353_;
	int i_356_ = i_354_ + i_352_;
	for (int i_357_ = 0; i_357_ < anInt4987 * -155906383; i_357_++) {
	    for (int i_358_ = 0; i_358_ < 64; i_358_++) {
		for (int i_359_ = 0; i_359_ < 64; i_359_++)
		    method7447(class525_sub38, i_357_, i_358_ + i,
			       i_352_ + i_359_, 0, 0, i_358_ + i_355_,
			       i_359_ + i_356_, 0, false, (byte) -124);
	    }
	}
    }
    
    static final int method7400(int i, int i_360_) {
	int i_361_
	    = (Class399_Sub1.method15873(i - 1, i_360_ - 1, 132101952)
	       + Class399_Sub1.method15873(i + 1, i_360_ - 1, 1544481022)
	       + Class399_Sub1.method15873(i - 1, 1 + i_360_, -828222042)
	       + Class399_Sub1.method15873(1 + i, i_360_ + 1, 1928753548));
	int i_362_ = (Class399_Sub1.method15873(i - 1, i_360_, -64252031)
		      + Class399_Sub1.method15873(1 + i, i_360_, -760800587)
		      + Class399_Sub1.method15873(i, i_360_ - 1, -470849221)
		      + Class399_Sub1.method15873(i, 1 + i_360_, 688552130));
	int i_363_ = Class399_Sub1.method15873(i, i_360_, 2014648463);
	return i_361_ / 16 + i_362_ / 8 + i_363_ / 4;
    }
    
    public final void method7401(int i, int i_364_, int i_365_, int i_366_,
				 int i_367_) {
	for (int i_368_ = i_365_; i_368_ < i_367_ + i_365_; i_368_++) {
	    for (int i_369_ = i_364_; i_369_ < i_364_ + i_366_; i_369_++) {
		if (i_369_ >= 0 && i_369_ < anInt4963 * -528942713
		    && i_368_ >= 0 && i_368_ < anInt4964 * -129082381)
		    anIntArrayArrayArray4966[i][i_369_][i_368_]
			= i > 0 ? (anIntArrayArrayArray4966[i - 1][i_369_]
				   [i_368_]) - 960 : 0;
	    }
	}
	if (i_364_ > 0 && i_364_ < -528942713 * anInt4963) {
	    for (int i_370_ = 1 + i_365_; i_370_ < i_367_ + i_365_; i_370_++) {
		if (i_370_ >= 0 && i_370_ < -129082381 * anInt4964)
		    anIntArrayArrayArray4966[i][i_364_][i_370_]
			= anIntArrayArrayArray4966[i][i_364_ - 1][i_370_];
	    }
	}
	if (i_365_ > 0 && i_365_ < -129082381 * anInt4964) {
	    for (int i_371_ = 1 + i_364_; i_371_ < i_364_ + i_366_; i_371_++) {
		if (i_371_ >= 0 && i_371_ < -528942713 * anInt4963)
		    anIntArrayArrayArray4966[i][i_371_][i_365_]
			= anIntArrayArrayArray4966[i][i_371_][i_365_ - 1];
	    }
	}
	if (i_364_ >= 0 && i_365_ >= 0 && i_364_ < anInt4963 * -528942713
	    && i_365_ < anInt4964 * -129082381) {
	    if (0 == i) {
		if (i_364_ > 0
		    && 0 != anIntArrayArrayArray4966[i][i_364_ - 1][i_365_])
		    anIntArrayArrayArray4966[i][i_364_][i_365_]
			= anIntArrayArrayArray4966[i][i_364_ - 1][i_365_];
		else if (i_365_ > 0 && 0 != (anIntArrayArrayArray4966[i]
					     [i_364_][i_365_ - 1]))
		    anIntArrayArrayArray4966[i][i_364_][i_365_]
			= anIntArrayArrayArray4966[i][i_364_][i_365_ - 1];
		else if (i_364_ > 0 && i_365_ > 0
			 && (anIntArrayArrayArray4966[i][i_364_ - 1]
			     [i_365_ - 1]) != 0)
		    anIntArrayArrayArray4966[i][i_364_][i_365_]
			= anIntArrayArrayArray4966[i][i_364_ - 1][i_365_ - 1];
	    } else if (i_364_ > 0
		       && (anIntArrayArrayArray4966[i][i_364_ - 1][i_365_]
			   != (anIntArrayArrayArray4966[i - 1][i_364_ - 1]
			       [i_365_])))
		anIntArrayArrayArray4966[i][i_364_][i_365_]
		    = anIntArrayArrayArray4966[i][i_364_ - 1][i_365_];
	    else if (i_365_ > 0
		     && (anIntArrayArrayArray4966[i - 1][i_364_][i_365_ - 1]
			 != anIntArrayArrayArray4966[i][i_364_][i_365_ - 1]))
		anIntArrayArrayArray4966[i][i_364_][i_365_]
		    = anIntArrayArrayArray4966[i][i_364_][i_365_ - 1];
	    else if (i_364_ > 0 && i_365_ > 0
		     && (anIntArrayArrayArray4966[i][i_364_ - 1][i_365_ - 1]
			 != (anIntArrayArrayArray4966[i - 1][i_364_ - 1]
			     [i_365_ - 1])))
		anIntArrayArrayArray4966[i][i_364_][i_365_]
		    = anIntArrayArrayArray4966[i][i_364_ - 1][i_365_ - 1];
	}
    }
    
    public final void method7402(RSBuffer class525_sub38, int i,
								 int i_372_, int i_373_, int i_374_) {
	int i_375_ = i + i_373_;
	int i_376_ = i_374_ + i_372_;
	for (int i_377_ = 0; i_377_ < anInt4987 * -155906383; i_377_++) {
	    for (int i_378_ = 0; i_378_ < 64; i_378_++) {
		for (int i_379_ = 0; i_379_ < 64; i_379_++)
		    method7447(class525_sub38, i_377_, i_378_ + i,
			       i_372_ + i_379_, 0, 0, i_378_ + i_375_,
			       i_379_ + i_376_, 0, false, (byte) -86);
	    }
	}
    }
    
    public final void method7403(int i, int[][] is) {
	int[][] is_380_ = anIntArrayArrayArray4966[i];
	for (int i_381_ = 0; i_381_ < 1 + anInt4963 * -528942713; i_381_++) {
	    for (int i_382_ = 0; i_382_ < 1 + -129082381 * anInt4964; i_382_++)
		is_380_[i_381_][i_382_] += is[i_381_][i_382_];
	}
    }
    
    public void method7404() {
	anIntArray4974 = null;
	anIntArray4975 = null;
	anIntArray4976 = null;
	anIntArray4977 = null;
	anIntArray5021 = null;
	aBool4968 = false;
    }
    
    static final int method7405(int i, int i_383_) {
	int i_384_ = i_383_ * 57 + i;
	i_384_ = i_384_ << 13 ^ i_384_;
	int i_385_ = (1376312589 + i_384_ * (789221 + i_384_ * i_384_ * 15731)
		      & 0x7fffffff);
	return i_385_ >> 19 & 0xff;
    }
    
    final void method7406(RSBuffer class525_sub38, int i, int i_386_,
						  int i_387_, int i_388_, int i_389_, int i_390_,
						  int i_391_, int i_392_, boolean bool) {
	if (1 == i_392_)
	    i_389_ = 1;
	else if (i_392_ == 2) {
	    i_388_ = 1;
	    i_389_ = 1;
	} else if (i_392_ == 3)
	    i_388_ = 1;
	if (i_386_ >= 0 && i_386_ < anInt4963 * -528942713 && i_387_ >= 0
	    && i_387_ < anInt4964 * -129082381) {
	    if (!aBool4965 && !bool)
		aClass475_4990.aByteArrayArrayArray5178[i][i_386_][i_387_]
		    = (byte) 0;
	    int i_393_ = class525_sub38.readUnsignedByte(381042091);
	    if (0 != (i_393_ & 0x1)) {
		if (bool) {
		    class525_sub38.readUnsignedByte(1736999777);
		    class525_sub38.readUnsignedSmart((byte) -40);
		} else {
		    int i_394_ = class525_sub38.readUnsignedByte(787233036);
		    aShortArrayArrayArray4972[i][i_386_][i_387_]
			= (short) class525_sub38.readUnsignedSmart((byte) -77);
		    aByteArrayArrayArray4969[i][i_386_][i_387_]
			= (byte) (i_394_ >> 2);
		    aByteArrayArrayArray5024[i][i_386_][i_387_]
			= (byte) (i_392_ + i_394_ & 0x3);
		}
	    }
	    if ((i_393_ & 0x2) != 0) {
		if (!aBool4965 && !bool)
		    aClass475_4990.aByteArrayArrayArray5178[i][i_386_][i_387_]
			= class525_sub38.readByte(-1150098071);
		else
		    class525_sub38.index += 339428471;
	    }
	    if ((i_393_ & 0x4) != 0) {
		if (bool)
		    class525_sub38.readUnsignedSmart((byte) -69);
		else
		    aShortArrayArrayArray4971[i][i_386_][i_387_]
			= (short) class525_sub38.readUnsignedSmart((byte) -81);
	    }
	    if ((i_393_ & 0x8) != 0) {
		int i_395_ = class525_sub38.readUnsignedByte(33276704);
		if (!aBool4965) {
		    if (1 == i_395_)
			i_395_ = 0;
		    if (0 == i)
			anIntArrayArrayArray4966[0][i_388_ + i_386_]
			    [i_389_ + i_387_]
			    = -i_395_ * 8 << 2;
		    else
			anIntArrayArrayArray4966[i][i_388_ + i_386_]
			    [i_387_ + i_389_]
			    = (anIntArrayArrayArray4966[i - 1][i_388_ + i_386_]
			       [i_387_ + i_389_]) - (8 * i_395_ << 2);
		} else
		    anIntArrayArrayArray4966[0][i_386_ + i_388_][(i_389_
								  + i_387_)]
			= 8 * i_395_ << 2;
	    } else if (aBool4965)
		anIntArrayArrayArray4966[0][i_386_ + i_388_][i_389_ + i_387_]
		    = 0;
	    else if (i == 0)
		anIntArrayArrayArray4966[0][i_388_ + i_386_][i_387_ + i_389_]
		    = -Class507.method8489(i_390_ + 932731, i_391_ + 556238,
					   501271953) * 8 << 2;
	    else
		anIntArrayArrayArray4966[i][i_386_ + i_388_][i_389_ + i_387_]
		    = (anIntArrayArrayArray4966[i - 1][i_386_ + i_388_]
		       [i_387_ + i_389_]) - 960;
	} else {
	    int i_396_ = class525_sub38.readUnsignedByte(594515995);
	    if (0 != (i_396_ & 0x1)) {
		class525_sub38.readUnsignedByte(158425876);
		class525_sub38.readUnsignedSmart((byte) -97);
	    }
	    if ((i_396_ & 0x2) != 0)
		class525_sub38.index += 339428471;
	    if ((i_396_ & 0x4) != 0)
		class525_sub38.readUnsignedSmart((byte) -124);
	    if (0 != (i_396_ & 0x8))
		class525_sub38.readUnsignedByte(1454559733);
	}
    }
    
    void method7407(Class658 class658, Class23 class23, byte i) {
	if (aBool5032) {
	    anIntArray4952 = anIntArrayArray5015[1434602089 * anInt5023];
	    anIntArray5037 = anIntArrayArray5019[1434602089 * anInt5023];
	    anIntArray5038 = anIntArrayArray5005[anInt5023 * 1434602089];
	    anInt5035
		= 1586883995 * (null != class658
				? anIntArray4958[1434602089 * anInt5023] : 0);
	    anInt5034
		= (null != class23 ? anIntArray4994[anInt5023 * 1434602089]
		   : 0) * 85932989;
	} else if (aBool5031) {
	    anIntArray4952 = anIntArrayArray5013[1434602089 * anInt5023];
	    anIntArray5037 = anIntArrayArray5014[1434602089 * anInt5023];
	    anIntArray5038 = anIntArrayArray4979[1434602089 * anInt5023];
	    anInt5035
		= (null != class658 ? anIntArray5011[anInt5023 * 1434602089]
		   : 0) * 1586883995;
	    anInt5034
		= 85932989 * (null != class23
			      ? anIntArray4998[anInt5023 * 1434602089] : 0);
	    anIntArray5039 = anIntArrayArray5033[1434602089 * anInt5023];
	} else {
	    anIntArray4952 = anIntArrayArray5036[anInt5023 * 1434602089];
	    anIntArray5037 = anIntArrayArray5009[anInt5023 * 1434602089];
	    anIntArray5038 = anIntArrayArray4995[anInt5023 * 1434602089];
	    anInt5035
		= (null != class658 ? anIntArray4986[anInt5023 * 1434602089]
		   : 0) * 1586883995;
	    anInt5034
		= (class23 != null ? anIntArray4996[anInt5023 * 1434602089]
		   : 0) * 85932989;
	    anIntArray5039 = anIntArrayArray4962[anInt5023 * 1434602089];
	}
    }
    
    final void method7408(RSBuffer class525_sub38, int i, int i_397_,
						  int i_398_, int i_399_, int i_400_, int i_401_,
						  int i_402_, int i_403_, boolean bool) {
	if (1 == i_403_)
	    i_400_ = 1;
	else if (i_403_ == 2) {
	    i_399_ = 1;
	    i_400_ = 1;
	} else if (i_403_ == 3)
	    i_399_ = 1;
	if (i_397_ >= 0 && i_397_ < anInt4963 * -528942713 && i_398_ >= 0
	    && i_398_ < anInt4964 * -129082381) {
	    if (!aBool4965 && !bool)
		aClass475_4990.aByteArrayArrayArray5178[i][i_397_][i_398_]
		    = (byte) 0;
	    int i_404_ = class525_sub38.readUnsignedByte(1277886602);
	    if (0 != (i_404_ & 0x1)) {
		if (bool) {
		    class525_sub38.readUnsignedByte(992130743);
		    class525_sub38.readUnsignedSmart((byte) -61);
		} else {
		    int i_405_ = class525_sub38.readUnsignedByte(1490269020);
		    aShortArrayArrayArray4972[i][i_397_][i_398_]
			= (short) class525_sub38.readUnsignedSmart((byte) -94);
		    aByteArrayArrayArray4969[i][i_397_][i_398_]
			= (byte) (i_405_ >> 2);
		    aByteArrayArrayArray5024[i][i_397_][i_398_]
			= (byte) (i_403_ + i_405_ & 0x3);
		}
	    }
	    if ((i_404_ & 0x2) != 0) {
		if (!aBool4965 && !bool)
		    aClass475_4990.aByteArrayArrayArray5178[i][i_397_][i_398_]
			= class525_sub38.readByte(-1150098071);
		else
		    class525_sub38.index += 339428471;
	    }
	    if ((i_404_ & 0x4) != 0) {
		if (bool)
		    class525_sub38.readUnsignedSmart((byte) -44);
		else
		    aShortArrayArrayArray4971[i][i_397_][i_398_]
			= (short) class525_sub38.readUnsignedSmart((byte) -55);
	    }
	    if ((i_404_ & 0x8) != 0) {
		int i_406_ = class525_sub38.readUnsignedByte(429770503);
		if (!aBool4965) {
		    if (1 == i_406_)
			i_406_ = 0;
		    if (0 == i)
			anIntArrayArrayArray4966[0][i_399_ + i_397_]
			    [i_400_ + i_398_]
			    = -i_406_ * 8 << 2;
		    else
			anIntArrayArrayArray4966[i][i_399_ + i_397_]
			    [i_398_ + i_400_]
			    = (anIntArrayArrayArray4966[i - 1][i_399_ + i_397_]
			       [i_398_ + i_400_]) - (8 * i_406_ << 2);
		} else
		    anIntArrayArrayArray4966[0][i_397_ + i_399_][(i_400_
								  + i_398_)]
			= 8 * i_406_ << 2;
	    } else if (aBool4965)
		anIntArrayArrayArray4966[0][i_397_ + i_399_][i_400_ + i_398_]
		    = 0;
	    else if (i == 0)
		anIntArrayArrayArray4966[0][i_399_ + i_397_][i_398_ + i_400_]
		    = -Class507.method8489(i_401_ + 932731, i_402_ + 556238,
					   501271953) * 8 << 2;
	    else
		anIntArrayArrayArray4966[i][i_397_ + i_399_][i_400_ + i_398_]
		    = (anIntArrayArrayArray4966[i - 1][i_397_ + i_399_]
		       [i_398_ + i_400_]) - 960;
	} else {
	    int i_407_ = class525_sub38.readUnsignedByte(1495293214);
	    if (0 != (i_407_ & 0x1)) {
		class525_sub38.readUnsignedByte(1381264724);
		class525_sub38.readUnsignedSmart((byte) -127);
	    }
	    if ((i_407_ & 0x2) != 0)
		class525_sub38.index += 339428471;
	    if ((i_407_ & 0x4) != 0)
		class525_sub38.readUnsignedSmart((byte) -7);
	    if (0 != (i_407_ & 0x8))
		class525_sub38.readUnsignedByte(1578038003);
	}
    }
    
    public void method7409(Class182 class182, int[][][] is) {
	for (int i = 0; i < -155906383 * anInt4987; i++) {
	    int i_408_ = 0;
	    int i_409_ = 0;
	    if (!aBool4965) {
		if (aBool4953)
		    i_409_ |= 0x8;
		if (aBool4959)
		    i_408_ |= 0x2;
		if (anInt4957 * 429883147 != 0) {
		    i_408_ |= 0x1;
		    i_409_ |= 0x10;
		}
	    }
	    if (aBool4959)
		i_409_ |= 0x7;
	    if (!aBool4961)
		i_409_ |= 0x20;
	    int[][] is_410_ = (null != is && i < is.length ? is[i]
			       : anIntArrayArrayArray4966[i]);
	    aClass546_5007.method9066
		(i, class182.method3581(anInt4963 * -528942713,
					-129082381 * anInt4964,
					anIntArrayArrayArray4966[i], is_410_,
					512, i_408_, i_409_), -722721115);
	}
    }
    
    public final void method7410(Class182 class182, Class161 class161,
				 Class161 class161_411_) {
	int[][] is = new int[anInt4963 * -528942713][-129082381 * anInt4964];
	if (null == anIntArray4974
	    || anInt4964 * -129082381 != anIntArray4974.length) {
	    anIntArray4974 = new int[anInt4964 * -129082381];
	    anIntArray4975 = new int[-129082381 * anInt4964];
	    anIntArray4976 = new int[anInt4964 * -129082381];
	    anIntArray4977 = new int[anInt4964 * -129082381];
	    anIntArray5021 = new int[anInt4964 * -129082381];
	}
	for (int i = 0; i < anInt4987 * -155906383; i++) {
	    for (int i_412_ = 0; i_412_ < anInt4964 * -129082381; i_412_++) {
		anIntArray4974[i_412_] = 0;
		anIntArray4975[i_412_] = 0;
		anIntArray4976[i_412_] = 0;
		anIntArray4977[i_412_] = 0;
		anIntArray5021[i_412_] = 0;
	    }
	    for (int i_413_ = -5; i_413_ < anInt4963 * -528942713; i_413_++) {
		for (int i_414_ = 0; i_414_ < -129082381 * anInt4964;
		     i_414_++) {
		    int i_415_ = i_413_ + 5;
		    if (i_415_ < anInt4963 * -528942713) {
			int i_416_
			    = (aShortArrayArrayArray4971[i][i_415_][i_414_]
			       & 0x7fff);
			if (i_416_ > 0) {
			    Class23 class23
				= ((Class23)
				   aClass40_Sub14_4954.method76(i_416_ - 1,
								116805790));
			    anIntArray4974[i_414_]
				+= -42935381 * class23.anInt222;
			    anIntArray4975[i_414_]
				+= class23.anInt218 * 337157395;
			    anIntArray4976[i_414_]
				+= 1486533035 * class23.anInt225;
			    anIntArray4977[i_414_]
				+= -1462290935 * class23.anInt226;
			    anIntArray5021[i_414_]++;
			}
		    }
		    int i_417_ = i_413_ - 5;
		    if (i_417_ >= 0) {
			int i_418_
			    = (aShortArrayArrayArray4971[i][i_417_][i_414_]
			       & 0x7fff);
			if (i_418_ > 0) {
			    Class23 class23
				= ((Class23)
				   aClass40_Sub14_4954.method76(i_418_ - 1,
								-60264228));
			    anIntArray4974[i_414_]
				-= -42935381 * class23.anInt222;
			    anIntArray4975[i_414_]
				-= 337157395 * class23.anInt218;
			    anIntArray4976[i_414_]
				-= 1486533035 * class23.anInt225;
			    anIntArray4977[i_414_]
				-= class23.anInt226 * -1462290935;
			    anIntArray5021[i_414_]--;
			}
		    }
		}
		if (i_413_ >= 0) {
		    int i_419_ = 0;
		    int i_420_ = 0;
		    int i_421_ = 0;
		    int i_422_ = 0;
		    int i_423_ = 0;
		    for (int i_424_ = -5; i_424_ < -129082381 * anInt4964;
			 i_424_++) {
			int i_425_ = i_424_ + 5;
			if (i_425_ < anInt4964 * -129082381) {
			    i_419_ += anIntArray4974[i_425_];
			    i_420_ += anIntArray4975[i_425_];
			    i_421_ += anIntArray4976[i_425_];
			    i_422_ += anIntArray4977[i_425_];
			    i_423_ += anIntArray5021[i_425_];
			}
			int i_426_ = i_424_ - 5;
			if (i_426_ >= 0) {
			    i_419_ -= anIntArray4974[i_426_];
			    i_420_ -= anIntArray4975[i_426_];
			    i_421_ -= anIntArray4976[i_426_];
			    i_422_ -= anIntArray4977[i_426_];
			    i_423_ -= anIntArray5021[i_426_];
			}
			if (i_424_ >= 0 && i_422_ > 0 && i_423_ > 0)
			    is[i_413_][i_424_]
				= Class57.method1214(i_419_ * 256 / i_422_,
						     i_420_ / i_423_,
						     i_421_ / i_423_,
						     2092983139);
		    }
		}
	    }
	    if (aBool4960)
		method7416(class182, aClass546_5007.aClass161Array7226[i], i,
			   is, i == 0 ? class161 : null,
			   i == 0 ? class161_411_ : null, 74770294);
	    else
		method7385(class182, aClass546_5007.aClass161Array7226[i], i,
			   is, i == 0 ? class161 : null,
			   0 == i ? class161_411_ : null, 32768);
	    aShortArrayArrayArray4971[i] = null;
	    aShortArrayArrayArray4972[i] = null;
	    aByteArrayArrayArray4969[i] = null;
	    aByteArrayArrayArray5024[i] = null;
	}
	if (!aBool4965) {
	    if (0 != 429883147 * anInt4957)
		aClass546_5007.method8996(-193486927);
	    if (aBool4959)
		aClass546_5007.method8990((byte) 1);
	}
	for (int i = 0; i < anInt4987 * -155906383; i++)
	    aClass546_5007.aClass161Array7226[i].method2578();
    }
    
    public final void method7411(Class182 class182, Class161 class161,
				 Class161 class161_427_) {
	int[][] is = new int[anInt4963 * -528942713][-129082381 * anInt4964];
	if (null == anIntArray4974
	    || anInt4964 * -129082381 != anIntArray4974.length) {
	    anIntArray4974 = new int[anInt4964 * -129082381];
	    anIntArray4975 = new int[-129082381 * anInt4964];
	    anIntArray4976 = new int[anInt4964 * -129082381];
	    anIntArray4977 = new int[anInt4964 * -129082381];
	    anIntArray5021 = new int[anInt4964 * -129082381];
	}
	for (int i = 0; i < anInt4987 * -155906383; i++) {
	    for (int i_428_ = 0; i_428_ < anInt4964 * -129082381; i_428_++) {
		anIntArray4974[i_428_] = 0;
		anIntArray4975[i_428_] = 0;
		anIntArray4976[i_428_] = 0;
		anIntArray4977[i_428_] = 0;
		anIntArray5021[i_428_] = 0;
	    }
	    for (int i_429_ = -5; i_429_ < anInt4963 * -528942713; i_429_++) {
		for (int i_430_ = 0; i_430_ < -129082381 * anInt4964;
		     i_430_++) {
		    int i_431_ = i_429_ + 5;
		    if (i_431_ < anInt4963 * -528942713) {
			int i_432_
			    = (aShortArrayArrayArray4971[i][i_431_][i_430_]
			       & 0x7fff);
			if (i_432_ > 0) {
			    Class23 class23
				= ((Class23)
				   aClass40_Sub14_4954.method76(i_432_ - 1,
								-110524208));
			    anIntArray4974[i_430_]
				+= -42935381 * class23.anInt222;
			    anIntArray4975[i_430_]
				+= class23.anInt218 * 337157395;
			    anIntArray4976[i_430_]
				+= 1486533035 * class23.anInt225;
			    anIntArray4977[i_430_]
				+= -1462290935 * class23.anInt226;
			    anIntArray5021[i_430_]++;
			}
		    }
		    int i_433_ = i_429_ - 5;
		    if (i_433_ >= 0) {
			int i_434_
			    = (aShortArrayArrayArray4971[i][i_433_][i_430_]
			       & 0x7fff);
			if (i_434_ > 0) {
			    Class23 class23
				= ((Class23)
				   aClass40_Sub14_4954.method76(i_434_ - 1,
								-117234163));
			    anIntArray4974[i_430_]
				-= -42935381 * class23.anInt222;
			    anIntArray4975[i_430_]
				-= 337157395 * class23.anInt218;
			    anIntArray4976[i_430_]
				-= 1486533035 * class23.anInt225;
			    anIntArray4977[i_430_]
				-= class23.anInt226 * -1462290935;
			    anIntArray5021[i_430_]--;
			}
		    }
		}
		if (i_429_ >= 0) {
		    int i_435_ = 0;
		    int i_436_ = 0;
		    int i_437_ = 0;
		    int i_438_ = 0;
		    int i_439_ = 0;
		    for (int i_440_ = -5; i_440_ < -129082381 * anInt4964;
			 i_440_++) {
			int i_441_ = i_440_ + 5;
			if (i_441_ < anInt4964 * -129082381) {
			    i_435_ += anIntArray4974[i_441_];
			    i_436_ += anIntArray4975[i_441_];
			    i_437_ += anIntArray4976[i_441_];
			    i_438_ += anIntArray4977[i_441_];
			    i_439_ += anIntArray5021[i_441_];
			}
			int i_442_ = i_440_ - 5;
			if (i_442_ >= 0) {
			    i_435_ -= anIntArray4974[i_442_];
			    i_436_ -= anIntArray4975[i_442_];
			    i_437_ -= anIntArray4976[i_442_];
			    i_438_ -= anIntArray4977[i_442_];
			    i_439_ -= anIntArray5021[i_442_];
			}
			if (i_440_ >= 0 && i_438_ > 0 && i_439_ > 0)
			    is[i_429_][i_440_]
				= Class57.method1214(i_435_ * 256 / i_438_,
						     i_436_ / i_439_,
						     i_437_ / i_439_,
						     2092983139);
		    }
		}
	    }
	    if (aBool4960)
		method7416(class182, aClass546_5007.aClass161Array7226[i], i,
			   is, i == 0 ? class161 : null,
			   i == 0 ? class161_427_ : null, 864284252);
	    else
		method7385(class182, aClass546_5007.aClass161Array7226[i], i,
			   is, i == 0 ? class161 : null,
			   0 == i ? class161_427_ : null, 32768);
	    aShortArrayArrayArray4971[i] = null;
	    aShortArrayArrayArray4972[i] = null;
	    aByteArrayArrayArray4969[i] = null;
	    aByteArrayArrayArray5024[i] = null;
	}
	if (!aBool4965) {
	    if (0 != 429883147 * anInt4957)
		aClass546_5007.method8996(-193486927);
	    if (aBool4959)
		aClass546_5007.method8990((byte) 1);
	}
	for (int i = 0; i < anInt4987 * -155906383; i++)
	    aClass546_5007.aClass161Array7226[i].method2578();
    }
    
    void method7412(Class182 class182, Class161 class161, int i, int[][] is,
		    Class161 class161_443_, Class161 class161_444_) {
	for (int i_445_ = 0; i_445_ < -528942713 * anInt4963; i_445_++) {
	    for (int i_446_ = 0; i_446_ < -129082381 * anInt4964; i_446_++) {
		byte i_447_ = aByteArrayArrayArray4969[i][i_445_][i_446_];
		byte i_448_ = aByteArrayArrayArray5024[i][i_445_][i_446_];
		int i_449_
		    = aShortArrayArrayArray4972[i][i_445_][i_446_] & 0x7fff;
		int i_450_
		    = aShortArrayArrayArray4971[i][i_445_][i_446_] & 0x7fff;
		Class658 class658
		    = ((Class658)
		       (0 != i_449_
			? aClass40_Sub18_5020.method76(i_449_ - 1, -179841289)
			: null));
		Class23 class23
		    = ((Class23)
		       (i_450_ != 0
			? aClass40_Sub14_4954.method76(i_450_ - 1, -1821786328)
			: null));
		if (0 == i_447_ && null == class658)
		    i_447_ = (byte) 12;
		Class658 class658_451_ = class658;
		if (class658 != null && -1 == class658.anInt8446 * -1932204261
		    && 2040702555 * class658.anInt8452 == -1) {
		    class658_451_ = class658;
		    class658 = null;
		}
		if (null != class658 || null != class23) {
		    anInt5034 = 85932989 * anIntArray4994[i_447_];
		    anInt5035 = 1586883995 * anIntArray4958[i_447_];
		    int i_452_
			= ((class658 != null ? anInt5035 * -2054508397 : 0)
			   + (null != class23 ? anInt5034 * 1936283541 : 0));
		    int i_453_ = 0;
		    anInt5017 = 0;
		    anInt5027
			= (null != class658 ? -1899182957 * class658.anInt8453
			   : -1) * 1279630533;
		    int i_454_ = (null != class23
				  ? class23.anInt219 * -1990883919 : -1);
		    int[] is_455_ = new int[i_452_];
		    int[] is_456_ = new int[i_452_];
		    int[] is_457_ = new int[i_452_];
		    int[] is_458_ = new int[i_452_];
		    int[] is_459_ = new int[i_452_];
		    int[] is_460_ = new int[i_452_];
		    int[] is_461_ = ((class658 != null
				      && -1 != class658.anInt8452 * 2040702555)
				     ? new int[i_452_] : null);
		    if (class658 != null) {
			for (int i_462_ = 0; i_462_ < anInt5035 * -2054508397;
			     i_462_++) {
			    is_455_[i_453_] = (anIntArrayArray5015[i_447_]
					       [1583960485 * anInt5017]);
			    is_456_[i_453_] = (anIntArrayArray5019[i_447_]
					       [1583960485 * anInt5017]);
			    is_457_[i_453_] = (anIntArrayArray5005[i_447_]
					       [anInt5017 * 1583960485]);
			    is_459_[i_453_] = 1327464973 * anInt5027;
			    is_460_[i_453_] = class658.anInt8447 * 815197885;
			    is_458_[i_453_] = -1932204261 * class658.anInt8446;
			    if (null != is_461_)
				is_461_[i_453_]
				    = 2040702555 * class658.anInt8452;
			    i_453_++;
			    anInt5017 += 616377901;
			}
			if (!aBool4965 && i == 0)
			    aClass546_5007.method9097
				(i_445_, i_446_,
				 class658.anInt8455 * 1229422759,
				 class658.anInt8443 * -1741170792,
				 class658.anInt8448 * 1393595585,
				 class658.anInt8454 * -1733705129,
				 -536318927 * class658.anInt8441,
				 class658.anInt8456 * 1298567265, -2079846145);
		    } else
			anInt5017 += anInt5035 * 1839363031;
		    if (null != class23) {
			for (int i_463_ = 0; i_463_ < 1936283541 * anInt5034;
			     i_463_++) {
			    is_455_[i_453_] = (anIntArrayArray5015[i_447_]
					       [1583960485 * anInt5017]);
			    is_456_[i_453_] = (anIntArrayArray5019[i_447_]
					       [1583960485 * anInt5017]);
			    is_457_[i_453_] = (anIntArrayArray5005[i_447_]
					       [anInt5017 * 1583960485]);
			    is_459_[i_453_] = i_454_;
			    is_460_[i_453_] = -1908571849 * class23.anInt220;
			    is_458_[i_453_] = is[i_445_][i_446_];
			    if (null != is_461_)
				is_461_[i_453_] = is_458_[i_453_];
			    i_453_++;
			    anInt5017 += 616377901;
			}
		    }
		    int i_464_ = anIntArray4999.length;
		    int[] is_465_ = new int[i_464_];
		    int[] is_466_ = new int[i_464_];
		    int[] is_467_
			= class161_444_ != null ? new int[i_464_] : null;
		    int[] is_468_
			= (null != class161_444_ || null != class161_443_
			   ? new int[i_464_] : null);
		    for (int i_469_ = 0; i_469_ < i_464_; i_469_++) {
			int i_470_ = anIntArray4999[i_469_];
			int i_471_ = anIntArray5000[i_469_];
			if (i_448_ == 0) {
			    is_465_[i_469_] = i_470_;
			    is_466_[i_469_] = i_471_;
			} else if (1 == i_448_) {
			    int i_472_ = i_470_;
			    is_465_[i_469_] = i_471_;
			    is_466_[i_469_] = 512 - i_472_;
			} else if (i_448_ == 2) {
			    is_465_[i_469_] = 512 - i_470_;
			    is_466_[i_469_] = 512 - i_471_;
			} else if (i_448_ == 3) {
			    int i_473_ = i_470_;
			    is_465_[i_469_] = 512 - i_471_;
			    is_466_[i_469_] = i_473_;
			}
			if (is_467_ != null
			    && aBoolArrayArray5001[i_447_][i_469_]) {
			    int i_474_ = is_465_[i_469_] + (i_445_ << 9);
			    int i_475_ = (i_446_ << 9) + is_466_[i_469_];
			    is_467_[i_469_]
				= (class161_444_.method2619(i_474_, i_475_,
							    -190914671)
				   - class161.method2619(i_474_, i_475_,
							 414467284));
			}
			if (is_468_ != null) {
			    if (null != class161_444_
				&& !aBoolArrayArray5001[i_447_][i_469_]) {
				int i_476_ = (i_445_ << 9) + is_465_[i_469_];
				int i_477_ = (i_446_ << 9) + is_466_[i_469_];
				is_468_[i_469_]
				    = (class161.method2619(i_476_, i_477_,
							   1478432569)
				       - class161_444_.method2619(i_476_,
								  i_477_,
								  1208754274));
			    } else if (null != class161_443_
				       && !(aBoolArrayArray5008[i_447_]
					    [i_469_])) {
				int i_478_ = (i_445_ << 9) + is_465_[i_469_];
				int i_479_ = is_466_[i_469_] + (i_446_ << 9);
				is_468_[i_469_]
				    = (class161_443_.method2619(i_478_, i_479_,
								-1606674126)
				       - class161.method2619(i_478_, i_479_,
							     -1800702345));
			    }
			}
		    }
		    int i_480_
			= class161.method2577(i_445_, i_446_, (byte) 25);
		    int i_481_
			= class161.method2577(i_445_ + 1, i_446_, (byte) -11);
		    int i_482_ = class161.method2577(i_445_ + 1, i_446_ + 1,
						     (byte) 41);
		    int i_483_
			= class161.method2577(i_445_, 1 + i_446_, (byte) 65);
		    boolean bool
			= aClass475_4990.method7774(i_445_, i_446_, 965952659);
		    if (bool && i > 1 || !bool && i > 0) {
			boolean bool_484_ = true;
			if (class23 != null && !class23.aBool224)
			    bool_484_ = false;
			else if (i_450_ == 0 && i_447_ != 0)
			    bool_484_ = false;
			else if (i_449_ > 0 && null != class658_451_
				 && !class658_451_.aBool8445)
			    bool_484_ = false;
			if (bool_484_ && i_480_ == i_481_ && i_482_ == i_480_
			    && i_480_ == i_483_)
			    aByteArrayArrayArray4973[i][i_445_][i_446_] |= 0x4;
		    }
		    Class176 class176 = new Class176();
		    if (aBool4965) {
			class176.anInt1877
			    = aClass546_5007.method9035(i_445_, i_446_,
							98929276) * -455052721;
			class176.anInt1879
			    = aClass546_5007.method8945(i_445_, i_446_,
							889283761) * 616962313;
			class176.anInt1883
			    = (aClass546_5007.method8947(i_445_, i_446_,
							 -2048544094)
			       * 575868967);
			class176.anInt1881
			    = (aClass546_5007.method8948(i_445_, i_446_,
							 -1334640927)
			       * -1237930075);
			class176.anInt1882
			    = (aClass546_5007.method8949(i_445_, i_446_,
							 1645853011)
			       * 506197425);
			class176.anInt1878
			    = aClass546_5007.method8950(i_445_, i_446_,
							-932381380) * 86130037;
		    }
		    class161.method2590(i_445_, i_446_, is_465_, is_467_,
					is_466_, is_468_, is_455_, is_456_,
					is_457_, is_458_, is_461_, is_459_,
					is_460_, class176, false);
		    aClass546_5007.method9063(i, i_445_, i_446_, -1474175535);
		}
	    }
	}
    }
    
    void method7413(Class182 class182, Class161 class161, int i, int[][] is,
		    Class161 class161_485_, Class161 class161_486_) {
	byte[][] is_487_ = aByteArrayArrayArray4969[i];
	byte[][] is_488_ = aByteArrayArrayArray5024[i];
	short[][] is_489_ = aShortArrayArrayArray4971[i];
	short[][] is_490_ = aShortArrayArrayArray4972[i];
	boolean[] bools = new boolean[4];
	for (int i_491_ = 0; i_491_ < -528942713 * anInt4963; i_491_++) {
	    int i_492_
		= i_491_ < -528942713 * anInt4963 - 1 ? i_491_ + 1 : i_491_;
	    for (int i_493_ = 0; i_493_ < -129082381 * anInt4964; i_493_++) {
		int i_494_ = (i_493_ < -129082381 * anInt4964 - 1 ? 1 + i_493_
			      : i_493_);
		anInt5023 = is_487_[i_491_][i_493_] * 1378346457;
		anInt5017 = 616377901 * is_488_[i_491_][i_493_];
		int i_495_ = is_490_[i_491_][i_493_] & 0x7fff;
		int i_496_ = is_489_[i_491_][i_493_] & 0x7fff;
		if (i_495_ != 0 || i_496_ != 0) {
		    Class658 class658
			= ((Class658)
			   (i_495_ != 0
			    ? aClass40_Sub18_5020.method76(i_495_ - 1,
							   -1338432727)
			    : null));
		    Class23 class23
			= (Class23) (i_496_ != 0
				     ? aClass40_Sub14_4954.method76(i_496_ - 1,
								    477189185)
				     : null);
		    if (0 == anInt5023 * 1434602089 && null == class658)
			anInt5023 = -639711700;
		    aBool5030 = false;
		    aBool5031 = false;
		    boolean[] bools_497_ = bools;
		    boolean[] bools_498_ = bools;
		    boolean[] bools_499_ = bools;
		    bools[3] = false;
		    bools_499_[2] = false;
		    bools_498_[1] = false;
		    bools_497_[0] = false;
		    Class658 class658_500_ = class658;
		    if (null != class658) {
			if (class658.anInt8446 * -1932204261 == -1
			    && 2040702555 * class658.anInt8452 == -1) {
			    class658_500_ = class658;
			    class658 = null;
			} else if (class23 != null
				   && anInt5023 * 1434602089 != 0)
			    aBool5031 = class658.aBool8450;
		    }
		    anInt5017 = method7388(i_496_, i_491_, i_493_, i_492_,
					   i_494_, class161, is_489_,
					   (byte) -55) * 616377901;
		    for (int i_501_ = 0; i_501_ < 13; i_501_++) {
			anIntArray4970[i_501_] = -1;
			anIntArray4997[i_501_] = 1;
		    }
		    method7397(class182, class658, class23, i_491_, i_493_,
			       is_487_, is_488_, is_490_, bools, (byte) -85);
		    aBool5032 = (!aBool5031 && !bools[0] && !bools[2]
				 && !bools[1] && !bools[3]);
		    method7407(class658, class23, (byte) 17);
		    int i_502_
			= anInt5035 * -2054508397 + anInt5034 * 1936283541;
		    if (i_502_ <= 0)
			aClass546_5007.method9063(i, i_491_, i_493_,
						  -852988471);
		    else {
			if (bools[0])
			    i_502_++;
			if (bools[2])
			    i_502_++;
			if (bools[1])
			    i_502_++;
			if (bools[3])
			    i_502_++;
			anInt5025 = 0;
			anInt5026 = 0;
			int i_503_ = 3 * i_502_;
			int[] is_504_ = aBool5022 ? new int[i_503_] : null;
			int[] is_505_ = new int[i_503_];
			int[] is_506_ = new int[i_503_];
			int[] is_507_ = new int[i_503_];
			int[] is_508_ = new int[i_503_];
			int[] is_509_ = new int[i_503_];
			int[] is_510_
			    = class161_486_ != null ? new int[i_503_] : null;
			int[] is_511_
			    = (null != class161_486_ || class161_485_ != null
			       ? new int[i_503_] : null);
			for (int i_512_ = 0; i_512_ < i_503_; i_512_++)
			    is_508_[i_512_] = -1;
			method7390(class182, i, i_491_, i_493_, class658,
				   bools, is_504_, is_505_, is_506_, is_507_,
				   is_508_, is_509_, is_510_, is_511_,
				   class161, class161_486_, class161_485_,
				   (byte) 10);
			int i_513_ = is_489_[i_491_][i_494_] & 0x7fff;
			int i_514_ = is_489_[i_492_][i_494_] & 0x7fff;
			int i_515_ = is_489_[i_492_][i_493_] & 0x7fff;
			method7386(class182, i, i_491_, i_493_, i_492_, i_494_,
				   class23, i_496_, i_513_, i_514_, i_515_,
				   bools, is_504_, is_505_, is_506_, is_507_,
				   is_508_, is_509_, is_510_, is_511_, is,
				   class161, class161_486_, class161_485_,
				   (byte) -18);
			method7426(class161, class23, class658_500_, i, i_491_,
				   i_493_, i_492_, i_494_, i_496_, i_495_,
				   1884912401);
			Class176 class176 = new Class176();
			if (aBool4965) {
			    class176.anInt1877
				= (aClass546_5007.method9035(i_491_, i_493_,
							     -179172947)
				   * -455052721);
			    class176.anInt1879
				= (aClass546_5007.method8945(i_491_, i_493_,
							     889283761)
				   * 616962313);
			    class176.anInt1883
				= (aClass546_5007.method8947(i_491_, i_493_,
							     -1990756762)
				   * 575868967);
			    class176.anInt1881
				= (aClass546_5007.method8948(i_491_, i_493_,
							     -1334640927)
				   * -1237930075);
			    class176.anInt1882
				= (aClass546_5007.method8949(i_491_, i_493_,
							     1730750759)
				   * 506197425);
			    class176.anInt1878
				= (aClass546_5007.method8950(i_491_, i_493_,
							     -932381380)
				   * 86130037);
			}
			class161.method2576(i_491_, i_493_, is_505_, is_510_,
					    is_506_, is_511_, is_507_, is_504_,
					    is_508_, is_509_, class176,
					    aBool5030);
			aClass546_5007.method9063(i, i_491_, i_493_,
						  -2118341275);
		    }
		}
	    }
	}
    }
    
    Class455(Class546 class546, int i, int i_516_, int i_517_, boolean bool,
	     Class40_Sub18 class40_sub18, Class40_Sub14 class40_sub14,
	     Class475 class475) {
	aBool4953 = false;
	aBool4959 = false;
	aBool4960 = false;
	aBool4961 = false;
	anIntArray5016 = new int[6];
	anIntArray4955 = new int[13];
	anIntArray5018 = new int[13];
	anIntArray4993 = new int[13];
	anIntArray5002 = new int[13];
	anIntArray4970 = new int[13];
	anIntArray4997 = new int[13];
	anInt5025 = 0;
	anInt5026 = 0;
	anIntArray5039 = null;
	aClass546_5007 = class546;
	anInt4987 = -862553519 * i;
	anInt4963 = i_516_ * -1628210121;
	anInt4964 = 651867451 * i_517_;
	aBool4965 = bool;
	aClass40_Sub18_5020 = class40_sub18;
	aClass40_Sub14_4954 = class40_sub14;
	aClass475_4990 = class475;
	aShortArrayArrayArray4971
	    = (new short[-155906383 * anInt4987][-528942713 * anInt4963]
	       [-129082381 * anInt4964]);
	aShortArrayArrayArray4972
	    = (new short[anInt4987 * -155906383][anInt4963 * -528942713]
	       [-129082381 * anInt4964]);
	aByteArrayArrayArray4969
	    = (new byte[anInt4987 * -155906383][anInt4963 * -528942713]
	       [anInt4964 * -129082381]);
	aByteArrayArrayArray5024
	    = (new byte[-155906383 * anInt4987][anInt4963 * -528942713]
	       [anInt4964 * -129082381]);
	anIntArrayArrayArray4966
	    = (new int[-155906383 * anInt4987][1 + -528942713 * anInt4963]
	       [anInt4964 * -129082381 + 1]);
	aByteArrayArrayArray4973
	    = (new byte[-155906383 * anInt4987][1 + -528942713 * anInt4963]
	       [1 + -129082381 * anInt4964]);
    }
    
    int method7414(int i, int i_518_, int i_519_, int i_520_, int i_521_,
		   Class161 class161, short[][] is) {
	if ((1434602089 * anInt5023 == 0 || anInt5023 * 1434602089 == 12)
	    && i_518_ > 0 && i_519_ > 0 && i_518_ < -528942713 * anInt4963
	    && i_519_ < -129082381 * anInt4964) {
	    int i_522_ = 0;
	    int i_523_ = 0;
	    int i_524_ = 0;
	    int i_525_ = 0;
	    i_522_ = i_522_ + (i == is[i_518_ - 1][i_519_ - 1] ? 1 : -1);
	    i_523_ = i_523_ + (i == is[i_520_][i_519_ - 1] ? 1 : -1);
	    i_524_ = i_524_ + (is[i_520_][i_521_] == i ? 1 : -1);
	    i_525_ = i_525_ + (i == is[i_518_ - 1][i_521_] ? 1 : -1);
	    if (is[i_518_][i_519_ - 1] == i) {
		i_522_++;
		i_523_++;
	    } else {
		i_522_--;
		i_523_--;
	    }
	    if (i == is[i_520_][i_519_]) {
		i_523_++;
		i_524_++;
	    } else {
		i_523_--;
		i_524_--;
	    }
	    if (is[i_518_][i_521_] == i) {
		i_524_++;
		i_525_++;
	    } else {
		i_524_--;
		i_525_--;
	    }
	    if (i == is[i_518_ - 1][i_519_]) {
		i_525_++;
		i_522_++;
	    } else {
		i_525_--;
		i_522_--;
	    }
	    int i_526_ = i_522_ - i_524_;
	    if (i_526_ < 0)
		i_526_ = -i_526_;
	    int i_527_ = i_523_ - i_525_;
	    if (i_527_ < 0)
		i_527_ = -i_527_;
	    if (i_526_ == i_527_) {
		i_526_ = (class161.method2577(i_518_, i_519_, (byte) -109)
			  - class161.method2577(i_520_, i_521_, (byte) -27));
		if (i_526_ < 0)
		    i_526_ = -i_526_;
		i_527_ = (class161.method2577(i_520_, i_519_, (byte) 11)
			  - class161.method2577(i_518_, i_521_, (byte) 96));
		if (i_527_ < 0)
		    i_527_ = -i_527_;
	    }
	    return i_526_ < i_527_ ? 1 : 0;
	}
	return anInt5017 * 1583960485;
    }
    
    public final void method7415(int i, int i_528_, int i_529_, int i_530_,
				 int i_531_) {
	for (int i_532_ = i_529_; i_532_ < i_531_ + i_529_; i_532_++) {
	    for (int i_533_ = i_528_; i_533_ < i_528_ + i_530_; i_533_++) {
		if (i_533_ >= 0 && i_533_ < anInt4963 * -528942713
		    && i_532_ >= 0 && i_532_ < anInt4964 * -129082381)
		    anIntArrayArrayArray4966[i][i_533_][i_532_]
			= i > 0 ? (anIntArrayArrayArray4966[i - 1][i_533_]
				   [i_532_]) - 960 : 0;
	    }
	}
	if (i_528_ > 0 && i_528_ < -528942713 * anInt4963) {
	    for (int i_534_ = 1 + i_529_; i_534_ < i_531_ + i_529_; i_534_++) {
		if (i_534_ >= 0 && i_534_ < -129082381 * anInt4964)
		    anIntArrayArrayArray4966[i][i_528_][i_534_]
			= anIntArrayArrayArray4966[i][i_528_ - 1][i_534_];
	    }
	}
	if (i_529_ > 0 && i_529_ < -129082381 * anInt4964) {
	    for (int i_535_ = 1 + i_528_; i_535_ < i_528_ + i_530_; i_535_++) {
		if (i_535_ >= 0 && i_535_ < -528942713 * anInt4963)
		    anIntArrayArrayArray4966[i][i_535_][i_529_]
			= anIntArrayArrayArray4966[i][i_535_][i_529_ - 1];
	    }
	}
	if (i_528_ >= 0 && i_529_ >= 0 && i_528_ < anInt4963 * -528942713
	    && i_529_ < anInt4964 * -129082381) {
	    if (0 == i) {
		if (i_528_ > 0
		    && 0 != anIntArrayArrayArray4966[i][i_528_ - 1][i_529_])
		    anIntArrayArrayArray4966[i][i_528_][i_529_]
			= anIntArrayArrayArray4966[i][i_528_ - 1][i_529_];
		else if (i_529_ > 0 && 0 != (anIntArrayArrayArray4966[i]
					     [i_528_][i_529_ - 1]))
		    anIntArrayArrayArray4966[i][i_528_][i_529_]
			= anIntArrayArrayArray4966[i][i_528_][i_529_ - 1];
		else if (i_528_ > 0 && i_529_ > 0
			 && (anIntArrayArrayArray4966[i][i_528_ - 1]
			     [i_529_ - 1]) != 0)
		    anIntArrayArrayArray4966[i][i_528_][i_529_]
			= anIntArrayArrayArray4966[i][i_528_ - 1][i_529_ - 1];
	    } else if (i_528_ > 0
		       && (anIntArrayArrayArray4966[i][i_528_ - 1][i_529_]
			   != (anIntArrayArrayArray4966[i - 1][i_528_ - 1]
			       [i_529_])))
		anIntArrayArrayArray4966[i][i_528_][i_529_]
		    = anIntArrayArrayArray4966[i][i_528_ - 1][i_529_];
	    else if (i_529_ > 0
		     && (anIntArrayArrayArray4966[i - 1][i_528_][i_529_ - 1]
			 != anIntArrayArrayArray4966[i][i_528_][i_529_ - 1]))
		anIntArrayArrayArray4966[i][i_528_][i_529_]
		    = anIntArrayArrayArray4966[i][i_528_][i_529_ - 1];
	    else if (i_528_ > 0 && i_529_ > 0
		     && (anIntArrayArrayArray4966[i][i_528_ - 1][i_529_ - 1]
			 != (anIntArrayArrayArray4966[i - 1][i_528_ - 1]
			     [i_529_ - 1])))
		anIntArrayArrayArray4966[i][i_528_][i_529_]
		    = anIntArrayArrayArray4966[i][i_528_ - 1][i_529_ - 1];
	}
    }
    
    void method7416(Class182 class182, Class161 class161, int i, int[][] is,
		    Class161 class161_536_, Class161 class161_537_,
		    int i_538_) {
	byte[][] is_539_ = aByteArrayArrayArray4969[i];
	byte[][] is_540_ = aByteArrayArrayArray5024[i];
	short[][] is_541_ = aShortArrayArrayArray4971[i];
	short[][] is_542_ = aShortArrayArrayArray4972[i];
	boolean[] bools = new boolean[4];
	for (int i_543_ = 0; i_543_ < -528942713 * anInt4963; i_543_++) {
	    int i_544_
		= i_543_ < -528942713 * anInt4963 - 1 ? i_543_ + 1 : i_543_;
	    for (int i_545_ = 0; i_545_ < -129082381 * anInt4964; i_545_++) {
		int i_546_ = (i_545_ < -129082381 * anInt4964 - 1 ? 1 + i_545_
			      : i_545_);
		anInt5023 = is_539_[i_543_][i_545_] * 1378346457;
		anInt5017 = 616377901 * is_540_[i_543_][i_545_];
		int i_547_ = is_542_[i_543_][i_545_] & 0x7fff;
		int i_548_ = is_541_[i_543_][i_545_] & 0x7fff;
		if (i_547_ != 0 || i_548_ != 0) {
		    Class658 class658
			= ((Class658)
			   (i_547_ != 0
			    ? aClass40_Sub18_5020.method76(i_547_ - 1,
							   -1994510600)
			    : null));
		    Class23 class23
			= (Class23) (i_548_ != 0
				     ? aClass40_Sub14_4954.method76(i_548_ - 1,
								    187049996)
				     : null);
		    if (0 == anInt5023 * 1434602089 && null == class658)
			anInt5023 = -639711700;
		    aBool5030 = false;
		    aBool5031 = false;
		    boolean[] bools_549_ = bools;
		    boolean[] bools_550_ = bools;
		    boolean[] bools_551_ = bools;
		    bools[3] = false;
		    bools_551_[2] = false;
		    bools_550_[1] = false;
		    bools_549_[0] = false;
		    Class658 class658_552_ = class658;
		    if (null != class658) {
			if (class658.anInt8446 * -1932204261 == -1
			    && 2040702555 * class658.anInt8452 == -1) {
			    class658_552_ = class658;
			    class658 = null;
			} else if (class23 != null
				   && anInt5023 * 1434602089 != 0)
			    aBool5031 = class658.aBool8450;
		    }
		    anInt5017
			= method7388(i_548_, i_543_, i_545_, i_544_, i_546_,
				     class161, is_541_, (byte) -7) * 616377901;
		    for (int i_553_ = 0; i_553_ < 13; i_553_++) {
			anIntArray4970[i_553_] = -1;
			anIntArray4997[i_553_] = 1;
		    }
		    method7397(class182, class658, class23, i_543_, i_545_,
			       is_539_, is_540_, is_542_, bools, (byte) -36);
		    aBool5032 = (!aBool5031 && !bools[0] && !bools[2]
				 && !bools[1] && !bools[3]);
		    method7407(class658, class23, (byte) 20);
		    int i_554_
			= anInt5035 * -2054508397 + anInt5034 * 1936283541;
		    if (i_554_ <= 0)
			aClass546_5007.method9063(i, i_543_, i_545_,
						  -1383899822);
		    else {
			if (bools[0])
			    i_554_++;
			if (bools[2])
			    i_554_++;
			if (bools[1])
			    i_554_++;
			if (bools[3])
			    i_554_++;
			anInt5025 = 0;
			anInt5026 = 0;
			int i_555_ = 3 * i_554_;
			int[] is_556_ = aBool5022 ? new int[i_555_] : null;
			int[] is_557_ = new int[i_555_];
			int[] is_558_ = new int[i_555_];
			int[] is_559_ = new int[i_555_];
			int[] is_560_ = new int[i_555_];
			int[] is_561_ = new int[i_555_];
			int[] is_562_
			    = class161_537_ != null ? new int[i_555_] : null;
			int[] is_563_
			    = (null != class161_537_ || class161_536_ != null
			       ? new int[i_555_] : null);
			for (int i_564_ = 0; i_564_ < i_555_; i_564_++)
			    is_560_[i_564_] = -1;
			method7390(class182, i, i_543_, i_545_, class658,
				   bools, is_556_, is_557_, is_558_, is_559_,
				   is_560_, is_561_, is_562_, is_563_,
				   class161, class161_537_, class161_536_,
				   (byte) 102);
			int i_565_ = is_541_[i_543_][i_546_] & 0x7fff;
			int i_566_ = is_541_[i_544_][i_546_] & 0x7fff;
			int i_567_ = is_541_[i_544_][i_545_] & 0x7fff;
			method7386(class182, i, i_543_, i_545_, i_544_, i_546_,
				   class23, i_548_, i_565_, i_566_, i_567_,
				   bools, is_556_, is_557_, is_558_, is_559_,
				   is_560_, is_561_, is_562_, is_563_, is,
				   class161, class161_537_, class161_536_,
				   (byte) 2);
			method7426(class161, class23, class658_552_, i, i_543_,
				   i_545_, i_544_, i_546_, i_548_, i_547_,
				   1884912401);
			Class176 class176 = new Class176();
			if (aBool4965) {
			    class176.anInt1877
				= (aClass546_5007.method9035(i_543_, i_545_,
							     -440291844)
				   * -455052721);
			    class176.anInt1879
				= (aClass546_5007.method8945(i_543_, i_545_,
							     889283761)
				   * 616962313);
			    class176.anInt1883
				= (aClass546_5007.method8947(i_543_, i_545_,
							     -1848108187)
				   * 575868967);
			    class176.anInt1881
				= (aClass546_5007.method8948(i_543_, i_545_,
							     -1334640927)
				   * -1237930075);
			    class176.anInt1882
				= (aClass546_5007.method8949(i_543_, i_545_,
							     1013014650)
				   * 506197425);
			    class176.anInt1878
				= (aClass546_5007.method8950(i_543_, i_545_,
							     -932381380)
				   * 86130037);
			}
			class161.method2576(i_543_, i_545_, is_557_, is_562_,
					    is_558_, is_563_, is_559_, is_556_,
					    is_560_, is_561_, class176,
					    aBool5030);
			aClass546_5007.method9063(i, i_543_, i_545_,
						  -1057338260);
		    }
		}
	    }
	}
    }
    
    void method7417(Class182 class182, Class658 class658, Class23 class23,
		    int i, int i_568_, byte[][] is, byte[][] is_569_,
		    short[][] is_570_, boolean[] bools) {
	boolean[] bools_571_ = (null != class658 && class658.aBool8450
				? aBoolArrayArray5010[1434602089 * anInt5023]
				: aBoolArrayArray5006[anInt5023 * 1434602089]);
	method7393(class182, class658, class23, i, i_568_,
		   anInt4963 * -528942713, -129082381 * anInt4964, is_570_, is,
		   is_569_, bools, -93915681);
	aBool5022 = null != class658 && (-1932204261 * class658.anInt8446
					 != class658.anInt8452 * 2040702555);
	if (!aBool5022) {
	    for (int i_572_ = 0; i_572_ < 8; i_572_++) {
		if (anIntArray4970[i_572_] >= 0
		    && anIntArray4955[i_572_] != anIntArray5018[i_572_]) {
		    aBool5022 = true;
		    break;
		}
	    }
	}
	if (!bools_571_[1 + 1583960485 * anInt5017 & 0x3]) {
	    boolean[] bools_573_ = bools;
	    int i_574_ = 1;
	    bools_573_[i_574_]
		= bools_573_[i_574_] | 0 == (anIntArray4997[2]
					     & anIntArray4997[4]);
	}
	if (!bools_571_[3 + 1583960485 * anInt5017 & 0x3]) {
	    boolean[] bools_575_ = bools;
	    int i_576_ = 3;
	    bools_575_[i_576_]
		= bools_575_[i_576_] | 0 == (anIntArray4997[6]
					     & anIntArray4997[0]);
	}
	if (!bools_571_[0 + anInt5017 * 1583960485 & 0x3]) {
	    boolean[] bools_577_ = bools;
	    int i_578_ = 0;
	    bools_577_[i_578_]
		= bools_577_[i_578_] | 0 == (anIntArray4997[0]
					     & anIntArray4997[2]);
	}
	if (!bools_571_[2 + anInt5017 * 1583960485 & 0x3]) {
	    boolean[] bools_579_ = bools;
	    int i_580_ = 2;
	    bools_579_[i_580_]
		= bools_579_[i_580_] | 0 == (anIntArray4997[4]
					     & anIntArray4997[6]);
	}
	if (!aBool5031
	    && (1434602089 * anInt5023 == 0 || 12 == anInt5023 * 1434602089)) {
	    if (bools[0] && !bools[1] && !bools[2] && bools[3]) {
		boolean[] bools_581_ = bools;
		bools[3] = false;
		bools_581_[0] = false;
		anInt5023
		    = 1378346457 * (anInt5023 * 1434602089 == 0 ? 13 : 14);
		anInt5017 = 0;
	    } else if (bools[0] && bools[1] && !bools[2] && !bools[3]) {
		boolean[] bools_582_ = bools;
		bools[1] = false;
		bools_582_[0] = false;
		anInt5023
		    = (1434602089 * anInt5023 == 0 ? 13 : 14) * 1378346457;
		anInt5017 = 1849133703;
	    } else if (!bools[0] && bools[1] && bools[2] && !bools[3]) {
		boolean[] bools_583_ = bools;
		bools[2] = false;
		bools_583_[1] = false;
		anInt5023
		    = (0 == 1434602089 * anInt5023 ? 13 : 14) * 1378346457;
		anInt5017 = 1232755802;
	    } else if (!bools[0] && !bools[1] && bools[2] && bools[3]) {
		boolean[] bools_584_ = bools;
		bools[3] = false;
		bools_584_[2] = false;
		anInt5023
		    = (1434602089 * anInt5023 == 0 ? 13 : 14) * 1378346457;
		anInt5017 = 616377901;
	    }
	}
    }
    
    void method7418(Class182 class182, Class658 class658, Class23 class23,
		    int i, int i_585_, byte[][] is, byte[][] is_586_,
		    short[][] is_587_, boolean[] bools) {
	boolean[] bools_588_ = (null != class658 && class658.aBool8450
				? aBoolArrayArray5010[1434602089 * anInt5023]
				: aBoolArrayArray5006[anInt5023 * 1434602089]);
	method7393(class182, class658, class23, i, i_585_,
		   anInt4963 * -528942713, -129082381 * anInt4964, is_587_, is,
		   is_586_, bools, 934143132);
	aBool5022 = null != class658 && (-1932204261 * class658.anInt8446
					 != class658.anInt8452 * 2040702555);
	if (!aBool5022) {
	    for (int i_589_ = 0; i_589_ < 8; i_589_++) {
		if (anIntArray4970[i_589_] >= 0
		    && anIntArray4955[i_589_] != anIntArray5018[i_589_]) {
		    aBool5022 = true;
		    break;
		}
	    }
	}
	if (!bools_588_[1 + 1583960485 * anInt5017 & 0x3]) {
	    boolean[] bools_590_ = bools;
	    int i_591_ = 1;
	    bools_590_[i_591_]
		= bools_590_[i_591_] | 0 == (anIntArray4997[2]
					     & anIntArray4997[4]);
	}
	if (!bools_588_[3 + 1583960485 * anInt5017 & 0x3]) {
	    boolean[] bools_592_ = bools;
	    int i_593_ = 3;
	    bools_592_[i_593_]
		= bools_592_[i_593_] | 0 == (anIntArray4997[6]
					     & anIntArray4997[0]);
	}
	if (!bools_588_[0 + anInt5017 * 1583960485 & 0x3]) {
	    boolean[] bools_594_ = bools;
	    int i_595_ = 0;
	    bools_594_[i_595_]
		= bools_594_[i_595_] | 0 == (anIntArray4997[0]
					     & anIntArray4997[2]);
	}
	if (!bools_588_[2 + anInt5017 * 1583960485 & 0x3]) {
	    boolean[] bools_596_ = bools;
	    int i_597_ = 2;
	    bools_596_[i_597_]
		= bools_596_[i_597_] | 0 == (anIntArray4997[4]
					     & anIntArray4997[6]);
	}
	if (!aBool5031
	    && (1434602089 * anInt5023 == 0 || 12 == anInt5023 * 1434602089)) {
	    if (bools[0] && !bools[1] && !bools[2] && bools[3]) {
		boolean[] bools_598_ = bools;
		bools[3] = false;
		bools_598_[0] = false;
		anInt5023
		    = 1378346457 * (anInt5023 * 1434602089 == 0 ? 13 : 14);
		anInt5017 = 0;
	    } else if (bools[0] && bools[1] && !bools[2] && !bools[3]) {
		boolean[] bools_599_ = bools;
		bools[1] = false;
		bools_599_[0] = false;
		anInt5023
		    = (1434602089 * anInt5023 == 0 ? 13 : 14) * 1378346457;
		anInt5017 = 1849133703;
	    } else if (!bools[0] && bools[1] && bools[2] && !bools[3]) {
		boolean[] bools_600_ = bools;
		bools[2] = false;
		bools_600_[1] = false;
		anInt5023
		    = (0 == 1434602089 * anInt5023 ? 13 : 14) * 1378346457;
		anInt5017 = 1232755802;
	    } else if (!bools[0] && !bools[1] && bools[2] && bools[3]) {
		boolean[] bools_601_ = bools;
		bools[3] = false;
		bools_601_[2] = false;
		anInt5023
		    = (1434602089 * anInt5023 == 0 ? 13 : 14) * 1378346457;
		anInt5017 = 616377901;
	    }
	}
    }
    
    void method7419(Class182 class182, Class658 class658, Class23 class23,
		    int i, int i_602_, byte[][] is, byte[][] is_603_,
		    short[][] is_604_, boolean[] bools) {
	boolean[] bools_605_ = (null != class658 && class658.aBool8450
				? aBoolArrayArray5010[1434602089 * anInt5023]
				: aBoolArrayArray5006[anInt5023 * 1434602089]);
	method7393(class182, class658, class23, i, i_602_,
		   anInt4963 * -528942713, -129082381 * anInt4964, is_604_, is,
		   is_603_, bools, 696478098);
	aBool5022 = null != class658 && (-1932204261 * class658.anInt8446
					 != class658.anInt8452 * 2040702555);
	if (!aBool5022) {
	    for (int i_606_ = 0; i_606_ < 8; i_606_++) {
		if (anIntArray4970[i_606_] >= 0
		    && anIntArray4955[i_606_] != anIntArray5018[i_606_]) {
		    aBool5022 = true;
		    break;
		}
	    }
	}
	if (!bools_605_[1 + 1583960485 * anInt5017 & 0x3]) {
	    boolean[] bools_607_ = bools;
	    int i_608_ = 1;
	    bools_607_[i_608_]
		= bools_607_[i_608_] | 0 == (anIntArray4997[2]
					     & anIntArray4997[4]);
	}
	if (!bools_605_[3 + 1583960485 * anInt5017 & 0x3]) {
	    boolean[] bools_609_ = bools;
	    int i_610_ = 3;
	    bools_609_[i_610_]
		= bools_609_[i_610_] | 0 == (anIntArray4997[6]
					     & anIntArray4997[0]);
	}
	if (!bools_605_[0 + anInt5017 * 1583960485 & 0x3]) {
	    boolean[] bools_611_ = bools;
	    int i_612_ = 0;
	    bools_611_[i_612_]
		= bools_611_[i_612_] | 0 == (anIntArray4997[0]
					     & anIntArray4997[2]);
	}
	if (!bools_605_[2 + anInt5017 * 1583960485 & 0x3]) {
	    boolean[] bools_613_ = bools;
	    int i_614_ = 2;
	    bools_613_[i_614_]
		= bools_613_[i_614_] | 0 == (anIntArray4997[4]
					     & anIntArray4997[6]);
	}
	if (!aBool5031
	    && (1434602089 * anInt5023 == 0 || 12 == anInt5023 * 1434602089)) {
	    if (bools[0] && !bools[1] && !bools[2] && bools[3]) {
		boolean[] bools_615_ = bools;
		bools[3] = false;
		bools_615_[0] = false;
		anInt5023
		    = 1378346457 * (anInt5023 * 1434602089 == 0 ? 13 : 14);
		anInt5017 = 0;
	    } else if (bools[0] && bools[1] && !bools[2] && !bools[3]) {
		boolean[] bools_616_ = bools;
		bools[1] = false;
		bools_616_[0] = false;
		anInt5023
		    = (1434602089 * anInt5023 == 0 ? 13 : 14) * 1378346457;
		anInt5017 = 1849133703;
	    } else if (!bools[0] && bools[1] && bools[2] && !bools[3]) {
		boolean[] bools_617_ = bools;
		bools[2] = false;
		bools_617_[1] = false;
		anInt5023
		    = (0 == 1434602089 * anInt5023 ? 13 : 14) * 1378346457;
		anInt5017 = 1232755802;
	    } else if (!bools[0] && !bools[1] && bools[2] && bools[3]) {
		boolean[] bools_618_ = bools;
		bools[3] = false;
		bools_618_[2] = false;
		anInt5023
		    = (1434602089 * anInt5023 == 0 ? 13 : 14) * 1378346457;
		anInt5017 = 616377901;
	    }
	}
    }
    
    public void method7420(Class182 class182, int[][][] is, int i) {
	for (int i_619_ = 0; i_619_ < -155906383 * anInt4987; i_619_++) {
	    int i_620_ = 0;
	    int i_621_ = 0;
	    if (!aBool4965) {
		if (aBool4953)
		    i_621_ |= 0x8;
		if (aBool4959)
		    i_620_ |= 0x2;
		if (anInt4957 * 429883147 != 0) {
		    i_620_ |= 0x1;
		    i_621_ |= 0x10;
		}
	    }
	    if (aBool4959)
		i_621_ |= 0x7;
	    if (!aBool4961)
		i_621_ |= 0x20;
	    int[][] is_622_ = (null != is && i_619_ < is.length ? is[i_619_]
			       : anIntArrayArrayArray4966[i_619_]);
	    aClass546_5007.method9066
		(i_619_,
		 class182.method3581(anInt4963 * -528942713,
				     -129082381 * anInt4964,
				     anIntArrayArrayArray4966[i_619_], is_622_,
				     512, i_620_, i_621_),
		 -722721115);
	}
    }
    
    void method7421(Class658 class658, Class23 class23) {
	if (aBool5032) {
	    anIntArray4952 = anIntArrayArray5015[1434602089 * anInt5023];
	    anIntArray5037 = anIntArrayArray5019[1434602089 * anInt5023];
	    anIntArray5038 = anIntArrayArray5005[anInt5023 * 1434602089];
	    anInt5035
		= 1586883995 * (null != class658
				? anIntArray4958[1434602089 * anInt5023] : 0);
	    anInt5034
		= (null != class23 ? anIntArray4994[anInt5023 * 1434602089]
		   : 0) * 85932989;
	} else if (aBool5031) {
	    anIntArray4952 = anIntArrayArray5013[1434602089 * anInt5023];
	    anIntArray5037 = anIntArrayArray5014[1434602089 * anInt5023];
	    anIntArray5038 = anIntArrayArray4979[1434602089 * anInt5023];
	    anInt5035
		= (null != class658 ? anIntArray5011[anInt5023 * 1434602089]
		   : 0) * 1586883995;
	    anInt5034
		= 85932989 * (null != class23
			      ? anIntArray4998[anInt5023 * 1434602089] : 0);
	    anIntArray5039 = anIntArrayArray5033[1434602089 * anInt5023];
	} else {
	    anIntArray4952 = anIntArrayArray5036[anInt5023 * 1434602089];
	    anIntArray5037 = anIntArrayArray5009[anInt5023 * 1434602089];
	    anIntArray5038 = anIntArrayArray4995[anInt5023 * 1434602089];
	    anInt5035
		= (null != class658 ? anIntArray4986[anInt5023 * 1434602089]
		   : 0) * 1586883995;
	    anInt5034
		= (class23 != null ? anIntArray4996[anInt5023 * 1434602089]
		   : 0) * 85932989;
	    anIntArray5039 = anIntArrayArray4962[anInt5023 * 1434602089];
	}
    }
    
    void method7422(Class182 class182, int i, int i_623_, int i_624_,
		    Class658 class658, boolean[] bools, int[] is,
		    int[] is_625_, int[] is_626_, int[] is_627_, int[] is_628_,
		    int[] is_629_, int[] is_630_, int[] is_631_,
		    Class161 class161, Class161 class161_632_,
		    Class161 class161_633_) {
	anInt5029 = -553801129;
	anInt5027 = -1279630533;
	anInt4983 = 2086120704;
	if (null != class658) {
	    anInt5029 = class658.anInt8446 * -226588717;
	    anInt5027 = 1258019103 * class658.anInt8453;
	    anInt4983 = class658.anInt8447 * -55734087;
	    int i_634_ = Class197.method3750(class182, class658, -395078756);
	    for (int i_635_ = 0; i_635_ < anInt5035 * -2054508397; i_635_++) {
		boolean bool = false;
		int i_636_;
		if (bools[0 - 1583960485 * anInt5017 & 0x3]
		    && anIntArray5039[0] == -1262762653 * anInt5025) {
		    anIntArray5016[0]
			= anIntArray4952[anInt5025 * -1262762653];
		    anIntArray5016[1] = 1;
		    anIntArray5016[2]
			= anIntArray5038[anInt5025 * -1262762653];
		    anIntArray5016[3] = 1;
		    anIntArray5016[4]
			= anIntArray5037[anInt5025 * -1262762653];
		    anIntArray5016[5]
			= anIntArray5038[-1262762653 * anInt5025];
		    i_636_ = 6;
		} else if (bools[2 - anInt5017 * 1583960485 & 0x3]
			   && -1262762653 * anInt5025 == anIntArray5039[2]) {
		    anIntArray5016[0]
			= anIntArray4952[anInt5025 * -1262762653];
		    anIntArray5016[1] = 5;
		    anIntArray5016[2]
			= anIntArray5038[anInt5025 * -1262762653];
		    anIntArray5016[3] = 5;
		    anIntArray5016[4]
			= anIntArray5037[-1262762653 * anInt5025];
		    anIntArray5016[5]
			= anIntArray5038[-1262762653 * anInt5025];
		    i_636_ = 6;
		} else if (bools[1 - anInt5017 * 1583960485 & 0x3]
			   && anInt5025 * -1262762653 == anIntArray5039[1]) {
		    anIntArray5016[0]
			= anIntArray4952[-1262762653 * anInt5025];
		    anIntArray5016[1] = 3;
		    anIntArray5016[2]
			= anIntArray5038[-1262762653 * anInt5025];
		    anIntArray5016[3] = 3;
		    anIntArray5016[4]
			= anIntArray5037[anInt5025 * -1262762653];
		    anIntArray5016[5]
			= anIntArray5038[anInt5025 * -1262762653];
		    i_636_ = 6;
		} else if (bools[3 - 1583960485 * anInt5017 & 0x3]
			   && anIntArray5039[3] == anInt5025 * -1262762653) {
		    anIntArray5016[0]
			= anIntArray4952[-1262762653 * anInt5025];
		    anIntArray5016[1] = 7;
		    anIntArray5016[2]
			= anIntArray5038[-1262762653 * anInt5025];
		    anIntArray5016[3] = 7;
		    anIntArray5016[4]
			= anIntArray5037[-1262762653 * anInt5025];
		    anIntArray5016[5]
			= anIntArray5038[anInt5025 * -1262762653];
		    i_636_ = 6;
		} else {
		    anIntArray5016[0]
			= anIntArray4952[-1262762653 * anInt5025];
		    anIntArray5016[1]
			= anIntArray5037[anInt5025 * -1262762653];
		    anIntArray5016[2]
			= anIntArray5038[-1262762653 * anInt5025];
		    i_636_ = 3;
		}
		for (int i_637_ = 0; i_637_ < i_636_; i_637_++) {
		    int i_638_ = anIntArray5016[i_637_];
		    int i_639_ = i_638_ - -1127046326 * anInt5017 & 0x7;
		    int i_640_ = anIntArray4999[i_638_];
		    int i_641_ = anIntArray5000[i_638_];
		    int i_642_;
		    int i_643_;
		    if (anInt5017 * 1583960485 == 1) {
			i_642_ = i_641_;
			i_643_ = 512 - i_640_;
		    } else if (anInt5017 * 1583960485 == 2) {
			i_642_ = 512 - i_640_;
			i_643_ = 512 - i_641_;
		    } else if (1583960485 * anInt5017 == 3) {
			i_642_ = 512 - i_641_;
			i_643_ = i_640_;
		    } else {
			i_642_ = i_640_;
			i_643_ = i_641_;
		    }
		    is_625_[anInt5026 * 1122233837] = i_642_;
		    is_626_[1122233837 * anInt5026] = i_643_;
		    if (null != is_630_
			&& (aBoolArrayArray5001[anInt5023 * 1434602089]
			    [i_638_])) {
			int i_644_ = i_642_ + (i_623_ << 9);
			int i_645_ = i_643_ + (i_624_ << 9);
			is_630_[anInt5026 * 1122233837]
			    = (class161_632_.method2619(i_644_, i_645_,
							-883686432)
			       - class161.method2619(i_644_, i_645_,
						     -2079145787));
		    }
		    if (null != is_631_) {
			if (class161_632_ != null
			    && !(aBoolArrayArray5001[1434602089 * anInt5023]
				 [i_638_])) {
			    int i_646_ = (i_623_ << 9) + i_642_;
			    int i_647_ = (i_624_ << 9) + i_643_;
			    is_631_[anInt5026 * 1122233837]
				= (class161.method2619(i_646_, i_647_,
						       -1048597628)
				   - class161_632_.method2619(i_646_, i_647_,
							      -1982756611));
			} else if (class161_633_ != null
				   && !(aBoolArrayArray5008
					[1434602089 * anInt5023][i_638_])) {
			    int i_648_ = i_642_ + (i_623_ << 9);
			    int i_649_ = i_643_ + (i_624_ << 9);
			    is_631_[1122233837 * anInt5026]
				= (class161_633_.method2619(i_648_, i_649_,
							    1510309576)
				   - class161.method2619(i_648_, i_649_,
							 -1231829022));
			}
		    }
		    if (i_638_ < 8 && (anIntArray4970[i_639_]
				       > class658.anInt8449 * -59845159)) {
			if (is != null)
			    is[anInt5026 * 1122233837]
				= anIntArray5018[i_639_];
			is_629_[1122233837 * anInt5026]
			    = anIntArray5002[i_639_];
			is_628_[anInt5026 * 1122233837]
			    = anIntArray4993[i_639_];
			is_627_[1122233837 * anInt5026]
			    = anIntArray4955[i_639_];
		    } else {
			if (null != is)
			    is[1122233837 * anInt5026] = i_634_;
			is_628_[1122233837 * anInt5026]
			    = -1899182957 * class658.anInt8453;
			is_629_[1122233837 * anInt5026]
			    = 815197885 * class658.anInt8447;
			is_627_[anInt5026 * 1122233837]
			    = anInt5029 * -1146544487;
		    }
		    anInt5026 += -1473284123;
		}
		anInt5025 += -312744885;
	    }
	    if (!aBool4965 && 0 == i)
		aClass546_5007.method9097(i_623_, i_624_,
					  class658.anInt8455 * 1229422759,
					  -1741170792 * class658.anInt8443,
					  1393595585 * class658.anInt8448,
					  class658.anInt8454 * -1733705129,
					  class658.anInt8441 * -536318927,
					  1298567265 * class658.anInt8456,
					  -1286696755);
	    if (1434602089 * anInt5023 != 12
		&& class658.anInt8446 * -1932204261 != -1
		&& class658.aBool8451)
		aBool5030 = true;
	} else if (aBool5032)
	    anInt5025 += -312744885 * anIntArray4958[1434602089 * anInt5023];
	else if (aBool5031)
	    anInt5025 += -312744885 * anIntArray5011[1434602089 * anInt5023];
	else
	    anInt5025 += -312744885 * anIntArray4986[1434602089 * anInt5023];
    }
    
    void method7423(Class182 class182, int i, int i_650_, int i_651_,
		    Class658 class658, boolean[] bools, int[] is,
		    int[] is_652_, int[] is_653_, int[] is_654_, int[] is_655_,
		    int[] is_656_, int[] is_657_, int[] is_658_,
		    Class161 class161, Class161 class161_659_,
		    Class161 class161_660_) {
	anInt5029 = -553801129;
	anInt5027 = -1279630533;
	anInt4983 = 2086120704;
	if (null != class658) {
	    anInt5029 = class658.anInt8446 * -226588717;
	    anInt5027 = 1258019103 * class658.anInt8453;
	    anInt4983 = class658.anInt8447 * -55734087;
	    int i_661_ = Class197.method3750(class182, class658, 1139925625);
	    for (int i_662_ = 0; i_662_ < anInt5035 * -2054508397; i_662_++) {
		boolean bool = false;
		int i_663_;
		if (bools[0 - 1583960485 * anInt5017 & 0x3]
		    && anIntArray5039[0] == -1262762653 * anInt5025) {
		    anIntArray5016[0]
			= anIntArray4952[anInt5025 * -1262762653];
		    anIntArray5016[1] = 1;
		    anIntArray5016[2]
			= anIntArray5038[anInt5025 * -1262762653];
		    anIntArray5016[3] = 1;
		    anIntArray5016[4]
			= anIntArray5037[anInt5025 * -1262762653];
		    anIntArray5016[5]
			= anIntArray5038[-1262762653 * anInt5025];
		    i_663_ = 6;
		} else if (bools[2 - anInt5017 * 1583960485 & 0x3]
			   && -1262762653 * anInt5025 == anIntArray5039[2]) {
		    anIntArray5016[0]
			= anIntArray4952[anInt5025 * -1262762653];
		    anIntArray5016[1] = 5;
		    anIntArray5016[2]
			= anIntArray5038[anInt5025 * -1262762653];
		    anIntArray5016[3] = 5;
		    anIntArray5016[4]
			= anIntArray5037[-1262762653 * anInt5025];
		    anIntArray5016[5]
			= anIntArray5038[-1262762653 * anInt5025];
		    i_663_ = 6;
		} else if (bools[1 - anInt5017 * 1583960485 & 0x3]
			   && anInt5025 * -1262762653 == anIntArray5039[1]) {
		    anIntArray5016[0]
			= anIntArray4952[-1262762653 * anInt5025];
		    anIntArray5016[1] = 3;
		    anIntArray5016[2]
			= anIntArray5038[-1262762653 * anInt5025];
		    anIntArray5016[3] = 3;
		    anIntArray5016[4]
			= anIntArray5037[anInt5025 * -1262762653];
		    anIntArray5016[5]
			= anIntArray5038[anInt5025 * -1262762653];
		    i_663_ = 6;
		} else if (bools[3 - 1583960485 * anInt5017 & 0x3]
			   && anIntArray5039[3] == anInt5025 * -1262762653) {
		    anIntArray5016[0]
			= anIntArray4952[-1262762653 * anInt5025];
		    anIntArray5016[1] = 7;
		    anIntArray5016[2]
			= anIntArray5038[-1262762653 * anInt5025];
		    anIntArray5016[3] = 7;
		    anIntArray5016[4]
			= anIntArray5037[-1262762653 * anInt5025];
		    anIntArray5016[5]
			= anIntArray5038[anInt5025 * -1262762653];
		    i_663_ = 6;
		} else {
		    anIntArray5016[0]
			= anIntArray4952[-1262762653 * anInt5025];
		    anIntArray5016[1]
			= anIntArray5037[anInt5025 * -1262762653];
		    anIntArray5016[2]
			= anIntArray5038[-1262762653 * anInt5025];
		    i_663_ = 3;
		}
		for (int i_664_ = 0; i_664_ < i_663_; i_664_++) {
		    int i_665_ = anIntArray5016[i_664_];
		    int i_666_ = i_665_ - -1127046326 * anInt5017 & 0x7;
		    int i_667_ = anIntArray4999[i_665_];
		    int i_668_ = anIntArray5000[i_665_];
		    int i_669_;
		    int i_670_;
		    if (anInt5017 * 1583960485 == 1) {
			i_669_ = i_668_;
			i_670_ = 512 - i_667_;
		    } else if (anInt5017 * 1583960485 == 2) {
			i_669_ = 512 - i_667_;
			i_670_ = 512 - i_668_;
		    } else if (1583960485 * anInt5017 == 3) {
			i_669_ = 512 - i_668_;
			i_670_ = i_667_;
		    } else {
			i_669_ = i_667_;
			i_670_ = i_668_;
		    }
		    is_652_[anInt5026 * 1122233837] = i_669_;
		    is_653_[1122233837 * anInt5026] = i_670_;
		    if (null != is_657_
			&& (aBoolArrayArray5001[anInt5023 * 1434602089]
			    [i_665_])) {
			int i_671_ = i_669_ + (i_650_ << 9);
			int i_672_ = i_670_ + (i_651_ << 9);
			is_657_[anInt5026 * 1122233837]
			    = (class161_659_.method2619(i_671_, i_672_,
							-1819532213)
			       - class161.method2619(i_671_, i_672_,
						     353117529));
		    }
		    if (null != is_658_) {
			if (class161_659_ != null
			    && !(aBoolArrayArray5001[1434602089 * anInt5023]
				 [i_665_])) {
			    int i_673_ = (i_650_ << 9) + i_669_;
			    int i_674_ = (i_651_ << 9) + i_670_;
			    is_658_[anInt5026 * 1122233837]
				= (class161.method2619(i_673_, i_674_,
						       481255738)
				   - class161_659_.method2619(i_673_, i_674_,
							      906504566));
			} else if (class161_660_ != null
				   && !(aBoolArrayArray5008
					[1434602089 * anInt5023][i_665_])) {
			    int i_675_ = i_669_ + (i_650_ << 9);
			    int i_676_ = i_670_ + (i_651_ << 9);
			    is_658_[1122233837 * anInt5026]
				= (class161_660_.method2619(i_675_, i_676_,
							    942856407)
				   - class161.method2619(i_675_, i_676_,
							 -625185137));
			}
		    }
		    if (i_665_ < 8 && (anIntArray4970[i_666_]
				       > class658.anInt8449 * -59845159)) {
			if (is != null)
			    is[anInt5026 * 1122233837]
				= anIntArray5018[i_666_];
			is_656_[1122233837 * anInt5026]
			    = anIntArray5002[i_666_];
			is_655_[anInt5026 * 1122233837]
			    = anIntArray4993[i_666_];
			is_654_[1122233837 * anInt5026]
			    = anIntArray4955[i_666_];
		    } else {
			if (null != is)
			    is[1122233837 * anInt5026] = i_661_;
			is_655_[1122233837 * anInt5026]
			    = -1899182957 * class658.anInt8453;
			is_656_[1122233837 * anInt5026]
			    = 815197885 * class658.anInt8447;
			is_654_[anInt5026 * 1122233837]
			    = anInt5029 * -1146544487;
		    }
		    anInt5026 += -1473284123;
		}
		anInt5025 += -312744885;
	    }
	    if (!aBool4965 && 0 == i)
		aClass546_5007.method9097(i_650_, i_651_,
					  class658.anInt8455 * 1229422759,
					  -1741170792 * class658.anInt8443,
					  1393595585 * class658.anInt8448,
					  class658.anInt8454 * -1733705129,
					  class658.anInt8441 * -536318927,
					  1298567265 * class658.anInt8456,
					  -1221683333);
	    if (1434602089 * anInt5023 != 12
		&& class658.anInt8446 * -1932204261 != -1
		&& class658.aBool8451)
		aBool5030 = true;
	} else if (aBool5032)
	    anInt5025 += -312744885 * anIntArray4958[1434602089 * anInt5023];
	else if (aBool5031)
	    anInt5025 += -312744885 * anIntArray5011[1434602089 * anInt5023];
	else
	    anInt5025 += -312744885 * anIntArray4986[1434602089 * anInt5023];
    }
    
    void method7424(Class182 class182, int i, int i_677_, int i_678_,
		    int i_679_, int i_680_, Class23 class23, int i_681_,
		    int i_682_, int i_683_, int i_684_, boolean[] bools,
		    int[] is, int[] is_685_, int[] is_686_, int[] is_687_,
		    int[] is_688_, int[] is_689_, int[] is_690_, int[] is_691_,
		    int[][] is_692_, Class161 class161, Class161 class161_693_,
		    Class161 class161_694_) {
	if (class23 != null) {
	    if (i_682_ == 0)
		i_682_ = i_681_;
	    if (0 == i_683_)
		i_683_ = i_681_;
	    if (0 == i_684_)
		i_684_ = i_681_;
	    Class23 class23_695_
		= ((Class23)
		   aClass40_Sub14_4954.method76(i_681_ - 1, 2020502781));
	    Class23 class23_696_
		= ((Class23)
		   aClass40_Sub14_4954.method76(i_682_ - 1, -2104438968));
	    Class23 class23_697_
		= ((Class23)
		   aClass40_Sub14_4954.method76(i_683_ - 1, 1510253043));
	    Class23 class23_698_
		= ((Class23)
		   aClass40_Sub14_4954.method76(i_684_ - 1, -583621236));
	    for (int i_699_ = 0; i_699_ < anInt5034 * 1936283541; i_699_++) {
		boolean bool = false;
		int i_700_;
		if (bools[0 - 1583960485 * anInt5017 & 0x3]
		    && anInt5025 * -1262762653 == anIntArray5039[0]) {
		    anIntArray5016[0]
			= anIntArray4952[anInt5025 * -1262762653];
		    anIntArray5016[1] = 1;
		    anIntArray5016[2]
			= anIntArray5038[-1262762653 * anInt5025];
		    anIntArray5016[3] = 1;
		    anIntArray5016[4]
			= anIntArray5037[-1262762653 * anInt5025];
		    anIntArray5016[5]
			= anIntArray5038[anInt5025 * -1262762653];
		    i_700_ = 6;
		} else if (bools[2 - anInt5017 * 1583960485 & 0x3]
			   && anIntArray5039[2] == -1262762653 * anInt5025) {
		    anIntArray5016[0]
			= anIntArray4952[anInt5025 * -1262762653];
		    anIntArray5016[1] = 5;
		    anIntArray5016[2]
			= anIntArray5038[-1262762653 * anInt5025];
		    anIntArray5016[3] = 5;
		    anIntArray5016[4]
			= anIntArray5037[-1262762653 * anInt5025];
		    anIntArray5016[5]
			= anIntArray5038[anInt5025 * -1262762653];
		    i_700_ = 6;
		} else if (bools[1 - 1583960485 * anInt5017 & 0x3]
			   && -1262762653 * anInt5025 == anIntArray5039[1]) {
		    anIntArray5016[0]
			= anIntArray4952[-1262762653 * anInt5025];
		    anIntArray5016[1] = 3;
		    anIntArray5016[2]
			= anIntArray5038[anInt5025 * -1262762653];
		    anIntArray5016[3] = 3;
		    anIntArray5016[4]
			= anIntArray5037[anInt5025 * -1262762653];
		    anIntArray5016[5]
			= anIntArray5038[-1262762653 * anInt5025];
		    i_700_ = 6;
		} else if (bools[3 - anInt5017 * 1583960485 & 0x3]
			   && -1262762653 * anInt5025 == anIntArray5039[3]) {
		    anIntArray5016[0]
			= anIntArray4952[-1262762653 * anInt5025];
		    anIntArray5016[1] = 7;
		    anIntArray5016[2]
			= anIntArray5038[-1262762653 * anInt5025];
		    anIntArray5016[3] = 7;
		    anIntArray5016[4]
			= anIntArray5037[anInt5025 * -1262762653];
		    anIntArray5016[5]
			= anIntArray5038[anInt5025 * -1262762653];
		    i_700_ = 6;
		} else {
		    anIntArray5016[0]
			= anIntArray4952[-1262762653 * anInt5025];
		    anIntArray5016[1]
			= anIntArray5037[anInt5025 * -1262762653];
		    anIntArray5016[2]
			= anIntArray5038[anInt5025 * -1262762653];
		    i_700_ = 3;
		}
		for (int i_701_ = 0; i_701_ < i_700_; i_701_++) {
		    int i_702_ = anIntArray5016[i_701_];
		    int i_703_ = i_702_ - -1127046326 * anInt5017 & 0x7;
		    int i_704_ = anIntArray4999[i_702_];
		    int i_705_ = anIntArray5000[i_702_];
		    int i_706_;
		    int i_707_;
		    if (1 == anInt5017 * 1583960485) {
			i_706_ = i_705_;
			i_707_ = 512 - i_704_;
		    } else if (1583960485 * anInt5017 == 2) {
			i_706_ = 512 - i_704_;
			i_707_ = 512 - i_705_;
		    } else if (1583960485 * anInt5017 == 3) {
			i_706_ = 512 - i_705_;
			i_707_ = i_704_;
		    } else {
			i_706_ = i_704_;
			i_707_ = i_705_;
		    }
		    is_685_[1122233837 * anInt5026] = i_706_;
		    is_686_[1122233837 * anInt5026] = i_707_;
		    if (null != is_690_
			&& (aBoolArrayArray5001[anInt5023 * 1434602089]
			    [i_702_])) {
			int i_708_ = (i_677_ << 9) + i_706_;
			int i_709_ = (i_678_ << 9) + i_707_;
			is_690_[1122233837 * anInt5026]
			    = (class161_693_.method2619(i_708_, i_709_,
							-1774766833)
			       - class161.method2619(i_708_, i_709_,
						     -1792547764));
		    }
		    if (null != is_691_) {
			if (class161_693_ != null
			    && !(aBoolArrayArray5001[anInt5023 * 1434602089]
				 [i_702_])) {
			    int i_710_ = i_706_ + (i_677_ << 9);
			    int i_711_ = i_707_ + (i_678_ << 9);
			    is_691_[anInt5026 * 1122233837]
				= (class161.method2619(i_710_, i_711_,
						       1670334471)
				   - class161_693_.method2619(i_710_, i_711_,
							      994980788));
			} else if (null != class161_694_
				   && !(aBoolArrayArray5008
					[1434602089 * anInt5023][i_702_])) {
			    int i_712_ = (i_677_ << 9) + i_706_;
			    int i_713_ = (i_678_ << 9) + i_707_;
			    is_691_[anInt5026 * 1122233837]
				= (class161_694_.method2619(i_712_, i_713_,
							    -1701071186)
				   - class161.method2619(i_712_, i_713_,
							 -604351422));
			}
		    }
		    if (i_702_ < 8 && anIntArray4970[i_703_] >= 0) {
			if (is != null)
			    is[1122233837 * anInt5026]
				= anIntArray5018[i_703_];
			is_689_[anInt5026 * 1122233837]
			    = anIntArray5002[i_703_];
			is_688_[anInt5026 * 1122233837]
			    = anIntArray4993[i_703_];
			is_687_[1122233837 * anInt5026]
			    = anIntArray4955[i_703_];
		    } else {
			if (aBool5031 && (aBoolArrayArray5001
					  [anInt5023 * 1434602089][i_702_])) {
			    is_688_[anInt5026 * 1122233837]
				= 1327464973 * anInt5027;
			    is_689_[anInt5026 * 1122233837]
				= -1025563611 * anInt4983;
			    is_687_[1122233837 * anInt5026]
				= anInt5029 * -1146544487;
			} else if (0 == i_706_ && i_707_ == 0) {
			    is_687_[anInt5026 * 1122233837]
				= is_692_[i_677_][i_678_];
			    is_688_[1122233837 * anInt5026]
				= -1990883919 * class23_695_.anInt219;
			    is_689_[1122233837 * anInt5026]
				= -1908571849 * class23_695_.anInt220;
			} else if (i_706_ == 0 && 512 == i_707_) {
			    is_687_[anInt5026 * 1122233837]
				= is_692_[i_677_][i_680_];
			    is_688_[anInt5026 * 1122233837]
				= -1990883919 * class23_696_.anInt219;
			    is_689_[1122233837 * anInt5026]
				= class23_696_.anInt220 * -1908571849;
			} else if (i_706_ == 512 && 512 == i_707_) {
			    is_687_[anInt5026 * 1122233837]
				= is_692_[i_679_][i_680_];
			    is_688_[anInt5026 * 1122233837]
				= class23_697_.anInt219 * -1990883919;
			    is_689_[1122233837 * anInt5026]
				= -1908571849 * class23_697_.anInt220;
			} else if (512 == i_706_ && 0 == i_707_) {
			    is_687_[anInt5026 * 1122233837]
				= is_692_[i_679_][i_678_];
			    is_688_[anInt5026 * 1122233837]
				= -1990883919 * class23_698_.anInt219;
			    is_689_[1122233837 * anInt5026]
				= -1908571849 * class23_698_.anInt220;
			} else {
			    if (i_706_ < 256) {
				if (i_707_ < 256) {
				    is_688_[1122233837 * anInt5026]
					= -1990883919 * class23_695_.anInt219;
				    is_689_[1122233837 * anInt5026]
					= -1908571849 * class23_695_.anInt220;
				} else {
				    is_688_[anInt5026 * 1122233837]
					= class23_696_.anInt219 * -1990883919;
				    is_689_[anInt5026 * 1122233837]
					= class23_696_.anInt220 * -1908571849;
				}
			    } else if (i_707_ < 256) {
				is_688_[1122233837 * anInt5026]
				    = -1990883919 * class23_698_.anInt219;
				is_689_[anInt5026 * 1122233837]
				    = class23_698_.anInt220 * -1908571849;
			    } else {
				is_688_[1122233837 * anInt5026]
				    = class23_697_.anInt219 * -1990883919;
				is_689_[1122233837 * anInt5026]
				    = class23_697_.anInt220 * -1908571849;
			    }
			    int i_714_
				= Class239.method4426(is_692_[i_677_][i_678_],
						      is_692_[i_679_][i_678_],
						      i_706_ << 7 >> 9,
						      (byte) -33);
			    int i_715_
				= Class239.method4426(is_692_[i_677_][i_680_],
						      is_692_[i_679_][i_680_],
						      i_706_ << 7 >> 9,
						      (byte) -36);
			    is_687_[anInt5026 * 1122233837]
				= Class239.method4426(i_714_, i_715_,
						      i_707_ << 7 >> 9,
						      (byte) -64);
			}
			if (null != is)
			    is[anInt5026 * 1122233837]
				= is_687_[anInt5026 * 1122233837];
		    }
		    anInt5026 += -1473284123;
		}
		anInt5025 += -312744885;
	    }
	    if (1434602089 * anInt5023 != 0 && class23.aBool221)
		aBool5030 = true;
	}
    }
    
    void method7425(Class182 class182, int i, int i_716_, int i_717_,
		    int i_718_, int i_719_, Class23 class23, int i_720_,
		    int i_721_, int i_722_, int i_723_, boolean[] bools,
		    int[] is, int[] is_724_, int[] is_725_, int[] is_726_,
		    int[] is_727_, int[] is_728_, int[] is_729_, int[] is_730_,
		    int[][] is_731_, Class161 class161, Class161 class161_732_,
		    Class161 class161_733_) {
	if (class23 != null) {
	    if (i_721_ == 0)
		i_721_ = i_720_;
	    if (0 == i_722_)
		i_722_ = i_720_;
	    if (0 == i_723_)
		i_723_ = i_720_;
	    Class23 class23_734_
		= ((Class23)
		   aClass40_Sub14_4954.method76(i_720_ - 1, -627892039));
	    Class23 class23_735_
		= ((Class23)
		   aClass40_Sub14_4954.method76(i_721_ - 1, -1076409696));
	    Class23 class23_736_
		= ((Class23)
		   aClass40_Sub14_4954.method76(i_722_ - 1, -1458704404));
	    Class23 class23_737_
		= ((Class23)
		   aClass40_Sub14_4954.method76(i_723_ - 1, -1433301723));
	    for (int i_738_ = 0; i_738_ < anInt5034 * 1936283541; i_738_++) {
		boolean bool = false;
		int i_739_;
		if (bools[0 - 1583960485 * anInt5017 & 0x3]
		    && anInt5025 * -1262762653 == anIntArray5039[0]) {
		    anIntArray5016[0]
			= anIntArray4952[anInt5025 * -1262762653];
		    anIntArray5016[1] = 1;
		    anIntArray5016[2]
			= anIntArray5038[-1262762653 * anInt5025];
		    anIntArray5016[3] = 1;
		    anIntArray5016[4]
			= anIntArray5037[-1262762653 * anInt5025];
		    anIntArray5016[5]
			= anIntArray5038[anInt5025 * -1262762653];
		    i_739_ = 6;
		} else if (bools[2 - anInt5017 * 1583960485 & 0x3]
			   && anIntArray5039[2] == -1262762653 * anInt5025) {
		    anIntArray5016[0]
			= anIntArray4952[anInt5025 * -1262762653];
		    anIntArray5016[1] = 5;
		    anIntArray5016[2]
			= anIntArray5038[-1262762653 * anInt5025];
		    anIntArray5016[3] = 5;
		    anIntArray5016[4]
			= anIntArray5037[-1262762653 * anInt5025];
		    anIntArray5016[5]
			= anIntArray5038[anInt5025 * -1262762653];
		    i_739_ = 6;
		} else if (bools[1 - 1583960485 * anInt5017 & 0x3]
			   && -1262762653 * anInt5025 == anIntArray5039[1]) {
		    anIntArray5016[0]
			= anIntArray4952[-1262762653 * anInt5025];
		    anIntArray5016[1] = 3;
		    anIntArray5016[2]
			= anIntArray5038[anInt5025 * -1262762653];
		    anIntArray5016[3] = 3;
		    anIntArray5016[4]
			= anIntArray5037[anInt5025 * -1262762653];
		    anIntArray5016[5]
			= anIntArray5038[-1262762653 * anInt5025];
		    i_739_ = 6;
		} else if (bools[3 - anInt5017 * 1583960485 & 0x3]
			   && -1262762653 * anInt5025 == anIntArray5039[3]) {
		    anIntArray5016[0]
			= anIntArray4952[-1262762653 * anInt5025];
		    anIntArray5016[1] = 7;
		    anIntArray5016[2]
			= anIntArray5038[-1262762653 * anInt5025];
		    anIntArray5016[3] = 7;
		    anIntArray5016[4]
			= anIntArray5037[anInt5025 * -1262762653];
		    anIntArray5016[5]
			= anIntArray5038[anInt5025 * -1262762653];
		    i_739_ = 6;
		} else {
		    anIntArray5016[0]
			= anIntArray4952[-1262762653 * anInt5025];
		    anIntArray5016[1]
			= anIntArray5037[anInt5025 * -1262762653];
		    anIntArray5016[2]
			= anIntArray5038[anInt5025 * -1262762653];
		    i_739_ = 3;
		}
		for (int i_740_ = 0; i_740_ < i_739_; i_740_++) {
		    int i_741_ = anIntArray5016[i_740_];
		    int i_742_ = i_741_ - -1127046326 * anInt5017 & 0x7;
		    int i_743_ = anIntArray4999[i_741_];
		    int i_744_ = anIntArray5000[i_741_];
		    int i_745_;
		    int i_746_;
		    if (1 == anInt5017 * 1583960485) {
			i_745_ = i_744_;
			i_746_ = 512 - i_743_;
		    } else if (1583960485 * anInt5017 == 2) {
			i_745_ = 512 - i_743_;
			i_746_ = 512 - i_744_;
		    } else if (1583960485 * anInt5017 == 3) {
			i_745_ = 512 - i_744_;
			i_746_ = i_743_;
		    } else {
			i_745_ = i_743_;
			i_746_ = i_744_;
		    }
		    is_724_[1122233837 * anInt5026] = i_745_;
		    is_725_[1122233837 * anInt5026] = i_746_;
		    if (null != is_729_
			&& (aBoolArrayArray5001[anInt5023 * 1434602089]
			    [i_741_])) {
			int i_747_ = (i_716_ << 9) + i_745_;
			int i_748_ = (i_717_ << 9) + i_746_;
			is_729_[1122233837 * anInt5026]
			    = (class161_732_.method2619(i_747_, i_748_,
							653048908)
			       - class161.method2619(i_747_, i_748_,
						     1136353774));
		    }
		    if (null != is_730_) {
			if (class161_732_ != null
			    && !(aBoolArrayArray5001[anInt5023 * 1434602089]
				 [i_741_])) {
			    int i_749_ = i_745_ + (i_716_ << 9);
			    int i_750_ = i_746_ + (i_717_ << 9);
			    is_730_[anInt5026 * 1122233837]
				= (class161.method2619(i_749_, i_750_,
						       -682453231)
				   - class161_732_.method2619(i_749_, i_750_,
							      -539048892));
			} else if (null != class161_733_
				   && !(aBoolArrayArray5008
					[1434602089 * anInt5023][i_741_])) {
			    int i_751_ = (i_716_ << 9) + i_745_;
			    int i_752_ = (i_717_ << 9) + i_746_;
			    is_730_[anInt5026 * 1122233837]
				= (class161_733_.method2619(i_751_, i_752_,
							    570305958)
				   - class161.method2619(i_751_, i_752_,
							 -867453329));
			}
		    }
		    if (i_741_ < 8 && anIntArray4970[i_742_] >= 0) {
			if (is != null)
			    is[1122233837 * anInt5026]
				= anIntArray5018[i_742_];
			is_728_[anInt5026 * 1122233837]
			    = anIntArray5002[i_742_];
			is_727_[anInt5026 * 1122233837]
			    = anIntArray4993[i_742_];
			is_726_[1122233837 * anInt5026]
			    = anIntArray4955[i_742_];
		    } else {
			if (aBool5031 && (aBoolArrayArray5001
					  [anInt5023 * 1434602089][i_741_])) {
			    is_727_[anInt5026 * 1122233837]
				= 1327464973 * anInt5027;
			    is_728_[anInt5026 * 1122233837]
				= -1025563611 * anInt4983;
			    is_726_[1122233837 * anInt5026]
				= anInt5029 * -1146544487;
			} else if (0 == i_745_ && i_746_ == 0) {
			    is_726_[anInt5026 * 1122233837]
				= is_731_[i_716_][i_717_];
			    is_727_[1122233837 * anInt5026]
				= -1990883919 * class23_734_.anInt219;
			    is_728_[1122233837 * anInt5026]
				= -1908571849 * class23_734_.anInt220;
			} else if (i_745_ == 0 && 512 == i_746_) {
			    is_726_[anInt5026 * 1122233837]
				= is_731_[i_716_][i_719_];
			    is_727_[anInt5026 * 1122233837]
				= -1990883919 * class23_735_.anInt219;
			    is_728_[1122233837 * anInt5026]
				= class23_735_.anInt220 * -1908571849;
			} else if (i_745_ == 512 && 512 == i_746_) {
			    is_726_[anInt5026 * 1122233837]
				= is_731_[i_718_][i_719_];
			    is_727_[anInt5026 * 1122233837]
				= class23_736_.anInt219 * -1990883919;
			    is_728_[1122233837 * anInt5026]
				= -1908571849 * class23_736_.anInt220;
			} else if (512 == i_745_ && 0 == i_746_) {
			    is_726_[anInt5026 * 1122233837]
				= is_731_[i_718_][i_717_];
			    is_727_[anInt5026 * 1122233837]
				= -1990883919 * class23_737_.anInt219;
			    is_728_[1122233837 * anInt5026]
				= -1908571849 * class23_737_.anInt220;
			} else {
			    if (i_745_ < 256) {
				if (i_746_ < 256) {
				    is_727_[1122233837 * anInt5026]
					= -1990883919 * class23_734_.anInt219;
				    is_728_[1122233837 * anInt5026]
					= -1908571849 * class23_734_.anInt220;
				} else {
				    is_727_[anInt5026 * 1122233837]
					= class23_735_.anInt219 * -1990883919;
				    is_728_[anInt5026 * 1122233837]
					= class23_735_.anInt220 * -1908571849;
				}
			    } else if (i_746_ < 256) {
				is_727_[1122233837 * anInt5026]
				    = -1990883919 * class23_737_.anInt219;
				is_728_[anInt5026 * 1122233837]
				    = class23_737_.anInt220 * -1908571849;
			    } else {
				is_727_[1122233837 * anInt5026]
				    = class23_736_.anInt219 * -1990883919;
				is_728_[1122233837 * anInt5026]
				    = class23_736_.anInt220 * -1908571849;
			    }
			    int i_753_
				= Class239.method4426(is_731_[i_716_][i_717_],
						      is_731_[i_718_][i_717_],
						      i_745_ << 7 >> 9,
						      (byte) 21);
			    int i_754_
				= Class239.method4426(is_731_[i_716_][i_719_],
						      is_731_[i_718_][i_719_],
						      i_745_ << 7 >> 9,
						      (byte) -23);
			    is_726_[anInt5026 * 1122233837]
				= Class239.method4426(i_753_, i_754_,
						      i_746_ << 7 >> 9,
						      (byte) -62);
			}
			if (null != is)
			    is[anInt5026 * 1122233837]
				= is_726_[anInt5026 * 1122233837];
		    }
		    anInt5026 += -1473284123;
		}
		anInt5025 += -312744885;
	    }
	    if (1434602089 * anInt5023 != 0 && class23.aBool221)
		aBool5030 = true;
	}
    }
    
    void method7426(Class161 class161, Class23 class23, Class658 class658,
		    int i, int i_755_, int i_756_, int i_757_, int i_758_,
		    int i_759_, int i_760_, int i_761_) {
	int i_762_ = class161.method2577(i_755_, i_756_, (byte) 35);
	int i_763_ = class161.method2577(i_757_, i_756_, (byte) -26);
	int i_764_ = class161.method2577(i_757_, i_758_, (byte) 2);
	int i_765_ = class161.method2577(i_755_, i_758_, (byte) 13);
	boolean bool = aClass475_4990.method7774(i_755_, i_756_, 692490802);
	if (bool && i > 1 || !bool && i > 0) {
	    boolean bool_766_ = true;
	    if (class23 != null && !class23.aBool224)
		bool_766_ = false;
	    else if (i_759_ == 0 && anInt5023 * 1434602089 != 0)
		bool_766_ = false;
	    else if (i_760_ > 0 && class658 != null && !class658.aBool8445)
		bool_766_ = false;
	    if (bool_766_ && i_763_ == i_762_ && i_762_ == i_764_
		&& i_765_ == i_762_)
		aByteArrayArrayArray4973[i][i_755_][i_756_] |= 0x4;
	}
    }
    
    void method7427(Class658 class658, Class23 class23) {
	if (aBool5032) {
	    anIntArray4952 = anIntArrayArray5015[1434602089 * anInt5023];
	    anIntArray5037 = anIntArrayArray5019[1434602089 * anInt5023];
	    anIntArray5038 = anIntArrayArray5005[anInt5023 * 1434602089];
	    anInt5035
		= 1586883995 * (null != class658
				? anIntArray4958[1434602089 * anInt5023] : 0);
	    anInt5034
		= (null != class23 ? anIntArray4994[anInt5023 * 1434602089]
		   : 0) * 85932989;
	} else if (aBool5031) {
	    anIntArray4952 = anIntArrayArray5013[1434602089 * anInt5023];
	    anIntArray5037 = anIntArrayArray5014[1434602089 * anInt5023];
	    anIntArray5038 = anIntArrayArray4979[1434602089 * anInt5023];
	    anInt5035
		= (null != class658 ? anIntArray5011[anInt5023 * 1434602089]
		   : 0) * 1586883995;
	    anInt5034
		= 85932989 * (null != class23
			      ? anIntArray4998[anInt5023 * 1434602089] : 0);
	    anIntArray5039 = anIntArrayArray5033[1434602089 * anInt5023];
	} else {
	    anIntArray4952 = anIntArrayArray5036[anInt5023 * 1434602089];
	    anIntArray5037 = anIntArrayArray5009[anInt5023 * 1434602089];
	    anIntArray5038 = anIntArrayArray4995[anInt5023 * 1434602089];
	    anInt5035
		= (null != class658 ? anIntArray4986[anInt5023 * 1434602089]
		   : 0) * 1586883995;
	    anInt5034
		= (class23 != null ? anIntArray4996[anInt5023 * 1434602089]
		   : 0) * 85932989;
	    anIntArray5039 = anIntArrayArray4962[anInt5023 * 1434602089];
	}
    }
    
    void method7428(Class161 class161, Class23 class23, Class658 class658,
		    int i, int i_767_, int i_768_, int i_769_, int i_770_,
		    int i_771_, int i_772_) {
	int i_773_ = class161.method2577(i_767_, i_768_, (byte) -17);
	int i_774_ = class161.method2577(i_769_, i_768_, (byte) -83);
	int i_775_ = class161.method2577(i_769_, i_770_, (byte) 59);
	int i_776_ = class161.method2577(i_767_, i_770_, (byte) 36);
	boolean bool = aClass475_4990.method7774(i_767_, i_768_, 1569609530);
	if (bool && i > 1 || !bool && i > 0) {
	    boolean bool_777_ = true;
	    if (class23 != null && !class23.aBool224)
		bool_777_ = false;
	    else if (i_771_ == 0 && anInt5023 * 1434602089 != 0)
		bool_777_ = false;
	    else if (i_772_ > 0 && class658 != null && !class658.aBool8445)
		bool_777_ = false;
	    if (bool_777_ && i_774_ == i_773_ && i_773_ == i_775_
		&& i_776_ == i_773_)
		aByteArrayArrayArray4973[i][i_767_][i_768_] |= 0x4;
	}
    }
    
    final void method7429(Class182 class182, Class658 class658,
			  Class23 class23, int i, int i_778_, int i_779_,
			  int i_780_, short[][] is, byte[][] is_781_,
			  byte[][] is_782_, boolean[] bools) {
	boolean[] bools_783_ = (null != class658 && class658.aBool8450
				? aBoolArrayArray5010[anInt5023 * 1434602089]
				: aBoolArrayArray5006[1434602089 * anInt5023]);
	if (i_778_ > 0) {
	    if (i > 0) {
		int i_784_ = is[i - 1][i_778_ - 1] & 0x7fff;
		if (i_784_ > 0) {
		    Class658 class658_785_
			= (Class658) aClass40_Sub18_5020.method76(i_784_ - 1,
								  -1049839894);
		    if (class658_785_.anInt8446 * -1932204261 != -1
			&& class658_785_.aBool8450) {
			byte i_786_ = is_781_[i - 1][i_778_ - 1];
			int i_787_ = is_782_[i - 1][i_778_ - 1] * 2 + 4 & 0x7;
			int i_788_
			    = Class197.method3750(class182, class658_785_,
						  -1133149428);
			if (aBoolArrayArray5001[i_786_][i_787_]) {
			    anIntArray4955[0]
				= -1932204261 * class658_785_.anInt8446;
			    anIntArray5018[0] = i_788_;
			    anIntArray4993[0]
				= -1899182957 * class658_785_.anInt8453;
			    anIntArray5002[0]
				= class658_785_.anInt8447 * 815197885;
			    anIntArray4970[0]
				= -59845159 * class658_785_.anInt8449;
			    anIntArray4997[0] = 256;
			}
		    }
		}
	    }
	    if (i < i_779_ - 1) {
		int i_789_ = is[i + 1][i_778_ - 1] & 0x7fff;
		if (i_789_ > 0) {
		    Class658 class658_790_
			= (Class658) aClass40_Sub18_5020.method76(i_789_ - 1,
								  -544264171);
		    if (-1 != -1932204261 * class658_790_.anInt8446
			&& class658_790_.aBool8450) {
			byte i_791_ = is_781_[1 + i][i_778_ - 1];
			int i_792_ = is_782_[1 + i][i_778_ - 1] * 2 + 6 & 0x7;
			int i_793_
			    = Class197.method3750(class182, class658_790_,
						  -923207976);
			if (aBoolArrayArray5001[i_791_][i_792_]) {
			    anIntArray4955[2]
				= class658_790_.anInt8446 * -1932204261;
			    anIntArray5018[2] = i_793_;
			    anIntArray4993[2]
				= -1899182957 * class658_790_.anInt8453;
			    anIntArray5002[2]
				= 815197885 * class658_790_.anInt8447;
			    anIntArray4970[2]
				= -59845159 * class658_790_.anInt8449;
			    anIntArray4997[2] = 512;
			}
		    }
		}
	    }
	}
	if (i_778_ < i_780_ - 1) {
	    if (i > 0) {
		int i_794_ = is[i - 1][1 + i_778_] & 0x7fff;
		if (i_794_ > 0) {
		    Class658 class658_795_
			= (Class658) aClass40_Sub18_5020.method76(i_794_ - 1,
								  -1684488018);
		    if (-1 != class658_795_.anInt8446 * -1932204261
			&& class658_795_.aBool8450) {
			byte i_796_ = is_781_[i - 1][1 + i_778_];
			int i_797_ = 2 + is_782_[i - 1][i_778_ + 1] * 2 & 0x7;
			int i_798_
			    = Class197.method3750(class182, class658_795_,
						  -628012967);
			if (aBoolArrayArray5001[i_796_][i_797_]) {
			    anIntArray4955[6]
				= -1932204261 * class658_795_.anInt8446;
			    anIntArray5018[6] = i_798_;
			    anIntArray4993[6]
				= -1899182957 * class658_795_.anInt8453;
			    anIntArray5002[6]
				= class658_795_.anInt8447 * 815197885;
			    anIntArray4970[6]
				= class658_795_.anInt8449 * -59845159;
			    anIntArray4997[6] = 64;
			}
		    }
		}
	    }
	    if (i < i_779_ - 1) {
		int i_799_ = is[i + 1][1 + i_778_] & 0x7fff;
		if (i_799_ > 0) {
		    Class658 class658_800_
			= (Class658) aClass40_Sub18_5020.method76(i_799_ - 1,
								  1369544994);
		    if (-1 != class658_800_.anInt8446 * -1932204261
			&& class658_800_.aBool8450) {
			byte i_801_ = is_781_[i + 1][1 + i_778_];
			int i_802_ = 0 + is_782_[1 + i][1 + i_778_] * 2 & 0x7;
			int i_803_
			    = Class197.method3750(class182, class658_800_,
						  -657636411);
			if (aBoolArrayArray5001[i_801_][i_802_]) {
			    anIntArray4955[4]
				= -1932204261 * class658_800_.anInt8446;
			    anIntArray5018[4] = i_803_;
			    anIntArray4993[4]
				= class658_800_.anInt8453 * -1899182957;
			    anIntArray5002[4]
				= 815197885 * class658_800_.anInt8447;
			    anIntArray4970[4]
				= class658_800_.anInt8449 * -59845159;
			    anIntArray4997[4] = 128;
			}
		    }
		}
	    }
	}
	if (i_778_ > 0) {
	    int i_804_ = is[i][i_778_ - 1] & 0x7fff;
	    if (i_804_ > 0) {
		Class658 class658_805_
		    = ((Class658)
		       aClass40_Sub18_5020.method76(i_804_ - 1, -336753782));
		if (class658_805_.anInt8446 * -1932204261 != -1) {
		    byte i_806_ = is_781_[i][i_778_ - 1];
		    int i_807_ = is_782_[i][i_778_ - 1];
		    if (class658_805_.aBool8450) {
			int i_808_ = 2;
			int i_809_ = 2 * i_807_ + 4;
			int i_810_
			    = Class197.method3750(class182, class658_805_,
						  573281868);
			for (int i_811_ = 0; i_811_ < 3; i_811_++) {
			    i_809_ &= 0x7;
			    i_808_ &= 0x7;
			    if (aBoolArrayArray5001[i_806_][i_809_]
				&& (anIntArray4970[i_808_]
				    <= -59845159 * class658_805_.anInt8449)) {
				anIntArray4955[i_808_]
				    = -1932204261 * class658_805_.anInt8446;
				anIntArray5018[i_808_] = i_810_;
				anIntArray4993[i_808_]
				    = -1899182957 * class658_805_.anInt8453;
				anIntArray5002[i_808_]
				    = class658_805_.anInt8447 * 815197885;
				if (-59845159 * class658_805_.anInt8449
				    == anIntArray4970[i_808_])
				    anIntArray4997[i_808_] |= 0x20;
				else
				    anIntArray4997[i_808_] = 32;
				anIntArray4970[i_808_]
				    = -59845159 * class658_805_.anInt8449;
			    }
			    i_809_++;
			    i_808_--;
			}
			if (!bools_783_[1583960485 * anInt5017 + 0 & 0x3])
			    bools[0] = (aBoolArrayArray5010[i_806_]
					[2 + i_807_ & 0x3]);
		    } else if (!bools_783_[0 + anInt5017 * 1583960485 & 0x3])
			bools[0]
			    = aBoolArrayArray5006[i_806_][i_807_ + 2 & 0x3];
		}
	    }
	}
	if (i_778_ < i_780_ - 1) {
	    int i_812_ = is[i][i_778_ + 1] & 0x7fff;
	    if (i_812_ > 0) {
		Class658 class658_813_
		    = ((Class658)
		       aClass40_Sub18_5020.method76(i_812_ - 1, 1568442117));
		if (class658_813_.anInt8446 * -1932204261 != -1) {
		    byte i_814_ = is_781_[i][i_778_ + 1];
		    int i_815_ = is_782_[i][1 + i_778_];
		    if (class658_813_.aBool8450) {
			int i_816_ = 4;
			int i_817_ = i_815_ * 2 + 2;
			int i_818_
			    = Class197.method3750(class182, class658_813_,
						  -1703544083);
			for (int i_819_ = 0; i_819_ < 3; i_819_++) {
			    i_817_ &= 0x7;
			    i_816_ &= 0x7;
			    if (aBoolArrayArray5001[i_814_][i_817_]
				&& (anIntArray4970[i_816_]
				    <= class658_813_.anInt8449 * -59845159)) {
				anIntArray4955[i_816_]
				    = -1932204261 * class658_813_.anInt8446;
				anIntArray5018[i_816_] = i_818_;
				anIntArray4993[i_816_]
				    = -1899182957 * class658_813_.anInt8453;
				anIntArray5002[i_816_]
				    = 815197885 * class658_813_.anInt8447;
				if (-59845159 * class658_813_.anInt8449
				    == anIntArray4970[i_816_])
				    anIntArray4997[i_816_] |= 0x10;
				else
				    anIntArray4997[i_816_] = 16;
				anIntArray4970[i_816_]
				    = class658_813_.anInt8449 * -59845159;
			    }
			    i_817_--;
			    i_816_++;
			}
			if (!bools_783_[1583960485 * anInt5017 + 2 & 0x3])
			    bools[2] = (aBoolArrayArray5010[i_814_]
					[0 + i_815_ & 0x3]);
		    } else if (!bools_783_[1583960485 * anInt5017 + 2 & 0x3])
			bools[2]
			    = aBoolArrayArray5006[i_814_][0 + i_815_ & 0x3];
		}
	    }
	}
	if (i > 0) {
	    int i_820_ = is[i - 1][i_778_] & 0x7fff;
	    if (i_820_ > 0) {
		Class658 class658_821_
		    = ((Class658)
		       aClass40_Sub18_5020.method76(i_820_ - 1, -1634824400));
		if (-1932204261 * class658_821_.anInt8446 != -1) {
		    byte i_822_ = is_781_[i - 1][i_778_];
		    int i_823_ = is_782_[i - 1][i_778_];
		    if (class658_821_.aBool8450) {
			int i_824_ = 6;
			int i_825_ = 4 + i_823_ * 2;
			int i_826_
			    = Class197.method3750(class182, class658_821_,
						  -2045329163);
			for (int i_827_ = 0; i_827_ < 3; i_827_++) {
			    i_825_ &= 0x7;
			    i_824_ &= 0x7;
			    if (aBoolArrayArray5001[i_822_][i_825_]
				&& (anIntArray4970[i_824_]
				    <= class658_821_.anInt8449 * -59845159)) {
				anIntArray4955[i_824_]
				    = -1932204261 * class658_821_.anInt8446;
				anIntArray5018[i_824_] = i_826_;
				anIntArray4993[i_824_]
				    = -1899182957 * class658_821_.anInt8453;
				anIntArray5002[i_824_]
				    = class658_821_.anInt8447 * 815197885;
				if (class658_821_.anInt8449 * -59845159
				    == anIntArray4970[i_824_])
				    anIntArray4997[i_824_] |= 0x8;
				else
				    anIntArray4997[i_824_] = 8;
				anIntArray4970[i_824_]
				    = -59845159 * class658_821_.anInt8449;
			    }
			    i_825_--;
			    i_824_++;
			}
			if (!bools_783_[1583960485 * anInt5017 + 3 & 0x3])
			    bools[3] = (aBoolArrayArray5010[i_822_]
					[1 + i_823_ & 0x3]);
		    } else if (!bools_783_[1583960485 * anInt5017 + 3 & 0x3])
			bools[3]
			    = aBoolArrayArray5006[i_822_][1 + i_823_ & 0x3];
		}
	    }
	}
	if (i < i_779_ - 1) {
	    int i_828_ = is[i + 1][i_778_] & 0x7fff;
	    if (i_828_ > 0) {
		Class658 class658_829_
		    = ((Class658)
		       aClass40_Sub18_5020.method76(i_828_ - 1, 1449068134));
		if (-1932204261 * class658_829_.anInt8446 != -1) {
		    byte i_830_ = is_781_[1 + i][i_778_];
		    int i_831_ = is_782_[1 + i][i_778_];
		    if (class658_829_.aBool8450) {
			int i_832_ = 4;
			int i_833_ = 2 * i_831_ + 6;
			int i_834_
			    = Class197.method3750(class182, class658_829_,
						  1931355475);
			for (int i_835_ = 0; i_835_ < 3; i_835_++) {
			    i_833_ &= 0x7;
			    i_832_ &= 0x7;
			    if (aBoolArrayArray5001[i_830_][i_833_]
				&& (anIntArray4970[i_832_]
				    <= -59845159 * class658_829_.anInt8449)) {
				anIntArray4955[i_832_]
				    = -1932204261 * class658_829_.anInt8446;
				anIntArray5018[i_832_] = i_834_;
				anIntArray4993[i_832_]
				    = -1899182957 * class658_829_.anInt8453;
				anIntArray5002[i_832_]
				    = 815197885 * class658_829_.anInt8447;
				if (class658_829_.anInt8449 * -59845159
				    == anIntArray4970[i_832_])
				    anIntArray4997[i_832_] |= 0x4;
				else
				    anIntArray4997[i_832_] = 4;
				anIntArray4970[i_832_]
				    = class658_829_.anInt8449 * -59845159;
			    }
			    i_833_++;
			    i_832_--;
			}
			if (!bools_783_[1 + anInt5017 * 1583960485 & 0x3])
			    bools[1] = (aBoolArrayArray5010[i_830_]
					[i_831_ + 3 & 0x3]);
		    } else if (!bools_783_[1 + 1583960485 * anInt5017 & 0x3])
			bools[1]
			    = aBoolArrayArray5006[i_830_][i_831_ + 3 & 0x3];
		}
	    }
	}
	if (class658 != null && class658.aBool8450) {
	    int i_836_ = Class197.method3750(class182, class658, -1121882893);
	    for (int i_837_ = 0; i_837_ < 8; i_837_++) {
		int i_838_ = i_837_ - -1127046326 * anInt5017 & 0x7;
		if (aBoolArrayArray5001[anInt5023 * 1434602089][i_837_]
		    && (anIntArray4970[i_838_]
			<= class658.anInt8449 * -59845159)) {
		    anIntArray4955[i_838_] = class658.anInt8446 * -1932204261;
		    anIntArray5018[i_838_] = i_836_;
		    anIntArray4993[i_838_] = -1899182957 * class658.anInt8453;
		    anIntArray5002[i_838_] = class658.anInt8447 * 815197885;
		    if (anIntArray4970[i_838_]
			== -59845159 * class658.anInt8449)
			anIntArray4997[i_838_] |= 0x2;
		    else
			anIntArray4997[i_838_] = 2;
		    anIntArray4970[i_838_] = -59845159 * class658.anInt8449;
		}
	    }
	}
    }
    
    final void method7430(Class182 class182, Class658 class658,
			  Class23 class23, int i, int i_839_, int i_840_,
			  int i_841_, short[][] is, byte[][] is_842_,
			  byte[][] is_843_, boolean[] bools) {
	boolean[] bools_844_ = (null != class658 && class658.aBool8450
				? aBoolArrayArray5010[anInt5023 * 1434602089]
				: aBoolArrayArray5006[1434602089 * anInt5023]);
	if (i_839_ > 0) {
	    if (i > 0) {
		int i_845_ = is[i - 1][i_839_ - 1] & 0x7fff;
		if (i_845_ > 0) {
		    Class658 class658_846_
			= (Class658) aClass40_Sub18_5020.method76(i_845_ - 1,
								  -1823698333);
		    if (class658_846_.anInt8446 * -1932204261 != -1
			&& class658_846_.aBool8450) {
			byte i_847_ = is_842_[i - 1][i_839_ - 1];
			int i_848_ = is_843_[i - 1][i_839_ - 1] * 2 + 4 & 0x7;
			int i_849_
			    = Class197.method3750(class182, class658_846_,
						  24357649);
			if (aBoolArrayArray5001[i_847_][i_848_]) {
			    anIntArray4955[0]
				= -1932204261 * class658_846_.anInt8446;
			    anIntArray5018[0] = i_849_;
			    anIntArray4993[0]
				= -1899182957 * class658_846_.anInt8453;
			    anIntArray5002[0]
				= class658_846_.anInt8447 * 815197885;
			    anIntArray4970[0]
				= -59845159 * class658_846_.anInt8449;
			    anIntArray4997[0] = 256;
			}
		    }
		}
	    }
	    if (i < i_840_ - 1) {
		int i_850_ = is[i + 1][i_839_ - 1] & 0x7fff;
		if (i_850_ > 0) {
		    Class658 class658_851_
			= (Class658) aClass40_Sub18_5020.method76(i_850_ - 1,
								  -518767640);
		    if (-1 != -1932204261 * class658_851_.anInt8446
			&& class658_851_.aBool8450) {
			byte i_852_ = is_842_[1 + i][i_839_ - 1];
			int i_853_ = is_843_[1 + i][i_839_ - 1] * 2 + 6 & 0x7;
			int i_854_
			    = Class197.method3750(class182, class658_851_,
						  1079960532);
			if (aBoolArrayArray5001[i_852_][i_853_]) {
			    anIntArray4955[2]
				= class658_851_.anInt8446 * -1932204261;
			    anIntArray5018[2] = i_854_;
			    anIntArray4993[2]
				= -1899182957 * class658_851_.anInt8453;
			    anIntArray5002[2]
				= 815197885 * class658_851_.anInt8447;
			    anIntArray4970[2]
				= -59845159 * class658_851_.anInt8449;
			    anIntArray4997[2] = 512;
			}
		    }
		}
	    }
	}
	if (i_839_ < i_841_ - 1) {
	    if (i > 0) {
		int i_855_ = is[i - 1][1 + i_839_] & 0x7fff;
		if (i_855_ > 0) {
		    Class658 class658_856_
			= (Class658) aClass40_Sub18_5020.method76(i_855_ - 1,
								  -1497502969);
		    if (-1 != class658_856_.anInt8446 * -1932204261
			&& class658_856_.aBool8450) {
			byte i_857_ = is_842_[i - 1][1 + i_839_];
			int i_858_ = 2 + is_843_[i - 1][i_839_ + 1] * 2 & 0x7;
			int i_859_
			    = Class197.method3750(class182, class658_856_,
						  446498865);
			if (aBoolArrayArray5001[i_857_][i_858_]) {
			    anIntArray4955[6]
				= -1932204261 * class658_856_.anInt8446;
			    anIntArray5018[6] = i_859_;
			    anIntArray4993[6]
				= -1899182957 * class658_856_.anInt8453;
			    anIntArray5002[6]
				= class658_856_.anInt8447 * 815197885;
			    anIntArray4970[6]
				= class658_856_.anInt8449 * -59845159;
			    anIntArray4997[6] = 64;
			}
		    }
		}
	    }
	    if (i < i_840_ - 1) {
		int i_860_ = is[i + 1][1 + i_839_] & 0x7fff;
		if (i_860_ > 0) {
		    Class658 class658_861_
			= (Class658) aClass40_Sub18_5020.method76(i_860_ - 1,
								  -412726603);
		    if (-1 != class658_861_.anInt8446 * -1932204261
			&& class658_861_.aBool8450) {
			byte i_862_ = is_842_[i + 1][1 + i_839_];
			int i_863_ = 0 + is_843_[1 + i][1 + i_839_] * 2 & 0x7;
			int i_864_
			    = Class197.method3750(class182, class658_861_,
						  -1291952816);
			if (aBoolArrayArray5001[i_862_][i_863_]) {
			    anIntArray4955[4]
				= -1932204261 * class658_861_.anInt8446;
			    anIntArray5018[4] = i_864_;
			    anIntArray4993[4]
				= class658_861_.anInt8453 * -1899182957;
			    anIntArray5002[4]
				= 815197885 * class658_861_.anInt8447;
			    anIntArray4970[4]
				= class658_861_.anInt8449 * -59845159;
			    anIntArray4997[4] = 128;
			}
		    }
		}
	    }
	}
	if (i_839_ > 0) {
	    int i_865_ = is[i][i_839_ - 1] & 0x7fff;
	    if (i_865_ > 0) {
		Class658 class658_866_
		    = ((Class658)
		       aClass40_Sub18_5020.method76(i_865_ - 1, -1084182733));
		if (class658_866_.anInt8446 * -1932204261 != -1) {
		    byte i_867_ = is_842_[i][i_839_ - 1];
		    int i_868_ = is_843_[i][i_839_ - 1];
		    if (class658_866_.aBool8450) {
			int i_869_ = 2;
			int i_870_ = 2 * i_868_ + 4;
			int i_871_
			    = Class197.method3750(class182, class658_866_,
						  -2006745480);
			for (int i_872_ = 0; i_872_ < 3; i_872_++) {
			    i_870_ &= 0x7;
			    i_869_ &= 0x7;
			    if (aBoolArrayArray5001[i_867_][i_870_]
				&& (anIntArray4970[i_869_]
				    <= -59845159 * class658_866_.anInt8449)) {
				anIntArray4955[i_869_]
				    = -1932204261 * class658_866_.anInt8446;
				anIntArray5018[i_869_] = i_871_;
				anIntArray4993[i_869_]
				    = -1899182957 * class658_866_.anInt8453;
				anIntArray5002[i_869_]
				    = class658_866_.anInt8447 * 815197885;
				if (-59845159 * class658_866_.anInt8449
				    == anIntArray4970[i_869_])
				    anIntArray4997[i_869_] |= 0x20;
				else
				    anIntArray4997[i_869_] = 32;
				anIntArray4970[i_869_]
				    = -59845159 * class658_866_.anInt8449;
			    }
			    i_870_++;
			    i_869_--;
			}
			if (!bools_844_[1583960485 * anInt5017 + 0 & 0x3])
			    bools[0] = (aBoolArrayArray5010[i_867_]
					[2 + i_868_ & 0x3]);
		    } else if (!bools_844_[0 + anInt5017 * 1583960485 & 0x3])
			bools[0]
			    = aBoolArrayArray5006[i_867_][i_868_ + 2 & 0x3];
		}
	    }
	}
	if (i_839_ < i_841_ - 1) {
	    int i_873_ = is[i][i_839_ + 1] & 0x7fff;
	    if (i_873_ > 0) {
		Class658 class658_874_
		    = ((Class658)
		       aClass40_Sub18_5020.method76(i_873_ - 1, -150006769));
		if (class658_874_.anInt8446 * -1932204261 != -1) {
		    byte i_875_ = is_842_[i][i_839_ + 1];
		    int i_876_ = is_843_[i][1 + i_839_];
		    if (class658_874_.aBool8450) {
			int i_877_ = 4;
			int i_878_ = i_876_ * 2 + 2;
			int i_879_
			    = Class197.method3750(class182, class658_874_,
						  1972080046);
			for (int i_880_ = 0; i_880_ < 3; i_880_++) {
			    i_878_ &= 0x7;
			    i_877_ &= 0x7;
			    if (aBoolArrayArray5001[i_875_][i_878_]
				&& (anIntArray4970[i_877_]
				    <= class658_874_.anInt8449 * -59845159)) {
				anIntArray4955[i_877_]
				    = -1932204261 * class658_874_.anInt8446;
				anIntArray5018[i_877_] = i_879_;
				anIntArray4993[i_877_]
				    = -1899182957 * class658_874_.anInt8453;
				anIntArray5002[i_877_]
				    = 815197885 * class658_874_.anInt8447;
				if (-59845159 * class658_874_.anInt8449
				    == anIntArray4970[i_877_])
				    anIntArray4997[i_877_] |= 0x10;
				else
				    anIntArray4997[i_877_] = 16;
				anIntArray4970[i_877_]
				    = class658_874_.anInt8449 * -59845159;
			    }
			    i_878_--;
			    i_877_++;
			}
			if (!bools_844_[1583960485 * anInt5017 + 2 & 0x3])
			    bools[2] = (aBoolArrayArray5010[i_875_]
					[0 + i_876_ & 0x3]);
		    } else if (!bools_844_[1583960485 * anInt5017 + 2 & 0x3])
			bools[2]
			    = aBoolArrayArray5006[i_875_][0 + i_876_ & 0x3];
		}
	    }
	}
	if (i > 0) {
	    int i_881_ = is[i - 1][i_839_] & 0x7fff;
	    if (i_881_ > 0) {
		Class658 class658_882_
		    = ((Class658)
		       aClass40_Sub18_5020.method76(i_881_ - 1, 1003808570));
		if (-1932204261 * class658_882_.anInt8446 != -1) {
		    byte i_883_ = is_842_[i - 1][i_839_];
		    int i_884_ = is_843_[i - 1][i_839_];
		    if (class658_882_.aBool8450) {
			int i_885_ = 6;
			int i_886_ = 4 + i_884_ * 2;
			int i_887_
			    = Class197.method3750(class182, class658_882_,
						  -1841523657);
			for (int i_888_ = 0; i_888_ < 3; i_888_++) {
			    i_886_ &= 0x7;
			    i_885_ &= 0x7;
			    if (aBoolArrayArray5001[i_883_][i_886_]
				&& (anIntArray4970[i_885_]
				    <= class658_882_.anInt8449 * -59845159)) {
				anIntArray4955[i_885_]
				    = -1932204261 * class658_882_.anInt8446;
				anIntArray5018[i_885_] = i_887_;
				anIntArray4993[i_885_]
				    = -1899182957 * class658_882_.anInt8453;
				anIntArray5002[i_885_]
				    = class658_882_.anInt8447 * 815197885;
				if (class658_882_.anInt8449 * -59845159
				    == anIntArray4970[i_885_])
				    anIntArray4997[i_885_] |= 0x8;
				else
				    anIntArray4997[i_885_] = 8;
				anIntArray4970[i_885_]
				    = -59845159 * class658_882_.anInt8449;
			    }
			    i_886_--;
			    i_885_++;
			}
			if (!bools_844_[1583960485 * anInt5017 + 3 & 0x3])
			    bools[3] = (aBoolArrayArray5010[i_883_]
					[1 + i_884_ & 0x3]);
		    } else if (!bools_844_[1583960485 * anInt5017 + 3 & 0x3])
			bools[3]
			    = aBoolArrayArray5006[i_883_][1 + i_884_ & 0x3];
		}
	    }
	}
	if (i < i_840_ - 1) {
	    int i_889_ = is[i + 1][i_839_] & 0x7fff;
	    if (i_889_ > 0) {
		Class658 class658_890_
		    = ((Class658)
		       aClass40_Sub18_5020.method76(i_889_ - 1, -1014276124));
		if (-1932204261 * class658_890_.anInt8446 != -1) {
		    byte i_891_ = is_842_[1 + i][i_839_];
		    int i_892_ = is_843_[1 + i][i_839_];
		    if (class658_890_.aBool8450) {
			int i_893_ = 4;
			int i_894_ = 2 * i_892_ + 6;
			int i_895_
			    = Class197.method3750(class182, class658_890_,
						  130533634);
			for (int i_896_ = 0; i_896_ < 3; i_896_++) {
			    i_894_ &= 0x7;
			    i_893_ &= 0x7;
			    if (aBoolArrayArray5001[i_891_][i_894_]
				&& (anIntArray4970[i_893_]
				    <= -59845159 * class658_890_.anInt8449)) {
				anIntArray4955[i_893_]
				    = -1932204261 * class658_890_.anInt8446;
				anIntArray5018[i_893_] = i_895_;
				anIntArray4993[i_893_]
				    = -1899182957 * class658_890_.anInt8453;
				anIntArray5002[i_893_]
				    = 815197885 * class658_890_.anInt8447;
				if (class658_890_.anInt8449 * -59845159
				    == anIntArray4970[i_893_])
				    anIntArray4997[i_893_] |= 0x4;
				else
				    anIntArray4997[i_893_] = 4;
				anIntArray4970[i_893_]
				    = class658_890_.anInt8449 * -59845159;
			    }
			    i_894_++;
			    i_893_--;
			}
			if (!bools_844_[1 + anInt5017 * 1583960485 & 0x3])
			    bools[1] = (aBoolArrayArray5010[i_891_]
					[i_892_ + 3 & 0x3]);
		    } else if (!bools_844_[1 + 1583960485 * anInt5017 & 0x3])
			bools[1]
			    = aBoolArrayArray5006[i_891_][i_892_ + 3 & 0x3];
		}
	    }
	}
	if (class658 != null && class658.aBool8450) {
	    int i_897_ = Class197.method3750(class182, class658, 414887969);
	    for (int i_898_ = 0; i_898_ < 8; i_898_++) {
		int i_899_ = i_898_ - -1127046326 * anInt5017 & 0x7;
		if (aBoolArrayArray5001[anInt5023 * 1434602089][i_898_]
		    && (anIntArray4970[i_899_]
			<= class658.anInt8449 * -59845159)) {
		    anIntArray4955[i_899_] = class658.anInt8446 * -1932204261;
		    anIntArray5018[i_899_] = i_897_;
		    anIntArray4993[i_899_] = -1899182957 * class658.anInt8453;
		    anIntArray5002[i_899_] = class658.anInt8447 * 815197885;
		    if (anIntArray4970[i_899_]
			== -59845159 * class658.anInt8449)
			anIntArray4997[i_899_] |= 0x2;
		    else
			anIntArray4997[i_899_] = 2;
		    anIntArray4970[i_899_] = -59845159 * class658.anInt8449;
		}
	    }
	}
    }
    
    final void method7431(Class182 class182, Class658 class658,
			  Class23 class23, int i, int i_900_, int i_901_,
			  int i_902_, short[][] is, byte[][] is_903_,
			  byte[][] is_904_, boolean[] bools) {
	boolean[] bools_905_ = (null != class658 && class658.aBool8450
				? aBoolArrayArray5010[anInt5023 * 1434602089]
				: aBoolArrayArray5006[1434602089 * anInt5023]);
	if (i_900_ > 0) {
	    if (i > 0) {
		int i_906_ = is[i - 1][i_900_ - 1] & 0x7fff;
		if (i_906_ > 0) {
		    Class658 class658_907_
			= (Class658) aClass40_Sub18_5020.method76(i_906_ - 1,
								  -401747771);
		    if (class658_907_.anInt8446 * -1932204261 != -1
			&& class658_907_.aBool8450) {
			byte i_908_ = is_903_[i - 1][i_900_ - 1];
			int i_909_ = is_904_[i - 1][i_900_ - 1] * 2 + 4 & 0x7;
			int i_910_
			    = Class197.method3750(class182, class658_907_,
						  1576012681);
			if (aBoolArrayArray5001[i_908_][i_909_]) {
			    anIntArray4955[0]
				= -1932204261 * class658_907_.anInt8446;
			    anIntArray5018[0] = i_910_;
			    anIntArray4993[0]
				= -1899182957 * class658_907_.anInt8453;
			    anIntArray5002[0]
				= class658_907_.anInt8447 * 815197885;
			    anIntArray4970[0]
				= -59845159 * class658_907_.anInt8449;
			    anIntArray4997[0] = 256;
			}
		    }
		}
	    }
	    if (i < i_901_ - 1) {
		int i_911_ = is[i + 1][i_900_ - 1] & 0x7fff;
		if (i_911_ > 0) {
		    Class658 class658_912_
			= (Class658) aClass40_Sub18_5020.method76(i_911_ - 1,
								  166592091);
		    if (-1 != -1932204261 * class658_912_.anInt8446
			&& class658_912_.aBool8450) {
			byte i_913_ = is_903_[1 + i][i_900_ - 1];
			int i_914_ = is_904_[1 + i][i_900_ - 1] * 2 + 6 & 0x7;
			int i_915_
			    = Class197.method3750(class182, class658_912_,
						  -1449549294);
			if (aBoolArrayArray5001[i_913_][i_914_]) {
			    anIntArray4955[2]
				= class658_912_.anInt8446 * -1932204261;
			    anIntArray5018[2] = i_915_;
			    anIntArray4993[2]
				= -1899182957 * class658_912_.anInt8453;
			    anIntArray5002[2]
				= 815197885 * class658_912_.anInt8447;
			    anIntArray4970[2]
				= -59845159 * class658_912_.anInt8449;
			    anIntArray4997[2] = 512;
			}
		    }
		}
	    }
	}
	if (i_900_ < i_902_ - 1) {
	    if (i > 0) {
		int i_916_ = is[i - 1][1 + i_900_] & 0x7fff;
		if (i_916_ > 0) {
		    Class658 class658_917_
			= (Class658) aClass40_Sub18_5020.method76(i_916_ - 1,
								  -2076556580);
		    if (-1 != class658_917_.anInt8446 * -1932204261
			&& class658_917_.aBool8450) {
			byte i_918_ = is_903_[i - 1][1 + i_900_];
			int i_919_ = 2 + is_904_[i - 1][i_900_ + 1] * 2 & 0x7;
			int i_920_
			    = Class197.method3750(class182, class658_917_,
						  624506614);
			if (aBoolArrayArray5001[i_918_][i_919_]) {
			    anIntArray4955[6]
				= -1932204261 * class658_917_.anInt8446;
			    anIntArray5018[6] = i_920_;
			    anIntArray4993[6]
				= -1899182957 * class658_917_.anInt8453;
			    anIntArray5002[6]
				= class658_917_.anInt8447 * 815197885;
			    anIntArray4970[6]
				= class658_917_.anInt8449 * -59845159;
			    anIntArray4997[6] = 64;
			}
		    }
		}
	    }
	    if (i < i_901_ - 1) {
		int i_921_ = is[i + 1][1 + i_900_] & 0x7fff;
		if (i_921_ > 0) {
		    Class658 class658_922_
			= (Class658) aClass40_Sub18_5020.method76(i_921_ - 1,
								  -1072074144);
		    if (-1 != class658_922_.anInt8446 * -1932204261
			&& class658_922_.aBool8450) {
			byte i_923_ = is_903_[i + 1][1 + i_900_];
			int i_924_ = 0 + is_904_[1 + i][1 + i_900_] * 2 & 0x7;
			int i_925_
			    = Class197.method3750(class182, class658_922_,
						  -1357322014);
			if (aBoolArrayArray5001[i_923_][i_924_]) {
			    anIntArray4955[4]
				= -1932204261 * class658_922_.anInt8446;
			    anIntArray5018[4] = i_925_;
			    anIntArray4993[4]
				= class658_922_.anInt8453 * -1899182957;
			    anIntArray5002[4]
				= 815197885 * class658_922_.anInt8447;
			    anIntArray4970[4]
				= class658_922_.anInt8449 * -59845159;
			    anIntArray4997[4] = 128;
			}
		    }
		}
	    }
	}
	if (i_900_ > 0) {
	    int i_926_ = is[i][i_900_ - 1] & 0x7fff;
	    if (i_926_ > 0) {
		Class658 class658_927_
		    = ((Class658)
		       aClass40_Sub18_5020.method76(i_926_ - 1, -1709882633));
		if (class658_927_.anInt8446 * -1932204261 != -1) {
		    byte i_928_ = is_903_[i][i_900_ - 1];
		    int i_929_ = is_904_[i][i_900_ - 1];
		    if (class658_927_.aBool8450) {
			int i_930_ = 2;
			int i_931_ = 2 * i_929_ + 4;
			int i_932_
			    = Class197.method3750(class182, class658_927_,
						  613471420);
			for (int i_933_ = 0; i_933_ < 3; i_933_++) {
			    i_931_ &= 0x7;
			    i_930_ &= 0x7;
			    if (aBoolArrayArray5001[i_928_][i_931_]
				&& (anIntArray4970[i_930_]
				    <= -59845159 * class658_927_.anInt8449)) {
				anIntArray4955[i_930_]
				    = -1932204261 * class658_927_.anInt8446;
				anIntArray5018[i_930_] = i_932_;
				anIntArray4993[i_930_]
				    = -1899182957 * class658_927_.anInt8453;
				anIntArray5002[i_930_]
				    = class658_927_.anInt8447 * 815197885;
				if (-59845159 * class658_927_.anInt8449
				    == anIntArray4970[i_930_])
				    anIntArray4997[i_930_] |= 0x20;
				else
				    anIntArray4997[i_930_] = 32;
				anIntArray4970[i_930_]
				    = -59845159 * class658_927_.anInt8449;
			    }
			    i_931_++;
			    i_930_--;
			}
			if (!bools_905_[1583960485 * anInt5017 + 0 & 0x3])
			    bools[0] = (aBoolArrayArray5010[i_928_]
					[2 + i_929_ & 0x3]);
		    } else if (!bools_905_[0 + anInt5017 * 1583960485 & 0x3])
			bools[0]
			    = aBoolArrayArray5006[i_928_][i_929_ + 2 & 0x3];
		}
	    }
	}
	if (i_900_ < i_902_ - 1) {
	    int i_934_ = is[i][i_900_ + 1] & 0x7fff;
	    if (i_934_ > 0) {
		Class658 class658_935_
		    = ((Class658)
		       aClass40_Sub18_5020.method76(i_934_ - 1, -559958724));
		if (class658_935_.anInt8446 * -1932204261 != -1) {
		    byte i_936_ = is_903_[i][i_900_ + 1];
		    int i_937_ = is_904_[i][1 + i_900_];
		    if (class658_935_.aBool8450) {
			int i_938_ = 4;
			int i_939_ = i_937_ * 2 + 2;
			int i_940_
			    = Class197.method3750(class182, class658_935_,
						  -995982023);
			for (int i_941_ = 0; i_941_ < 3; i_941_++) {
			    i_939_ &= 0x7;
			    i_938_ &= 0x7;
			    if (aBoolArrayArray5001[i_936_][i_939_]
				&& (anIntArray4970[i_938_]
				    <= class658_935_.anInt8449 * -59845159)) {
				anIntArray4955[i_938_]
				    = -1932204261 * class658_935_.anInt8446;
				anIntArray5018[i_938_] = i_940_;
				anIntArray4993[i_938_]
				    = -1899182957 * class658_935_.anInt8453;
				anIntArray5002[i_938_]
				    = 815197885 * class658_935_.anInt8447;
				if (-59845159 * class658_935_.anInt8449
				    == anIntArray4970[i_938_])
				    anIntArray4997[i_938_] |= 0x10;
				else
				    anIntArray4997[i_938_] = 16;
				anIntArray4970[i_938_]
				    = class658_935_.anInt8449 * -59845159;
			    }
			    i_939_--;
			    i_938_++;
			}
			if (!bools_905_[1583960485 * anInt5017 + 2 & 0x3])
			    bools[2] = (aBoolArrayArray5010[i_936_]
					[0 + i_937_ & 0x3]);
		    } else if (!bools_905_[1583960485 * anInt5017 + 2 & 0x3])
			bools[2]
			    = aBoolArrayArray5006[i_936_][0 + i_937_ & 0x3];
		}
	    }
	}
	if (i > 0) {
	    int i_942_ = is[i - 1][i_900_] & 0x7fff;
	    if (i_942_ > 0) {
		Class658 class658_943_
		    = ((Class658)
		       aClass40_Sub18_5020.method76(i_942_ - 1, -1655645423));
		if (-1932204261 * class658_943_.anInt8446 != -1) {
		    byte i_944_ = is_903_[i - 1][i_900_];
		    int i_945_ = is_904_[i - 1][i_900_];
		    if (class658_943_.aBool8450) {
			int i_946_ = 6;
			int i_947_ = 4 + i_945_ * 2;
			int i_948_
			    = Class197.method3750(class182, class658_943_,
						  -951734934);
			for (int i_949_ = 0; i_949_ < 3; i_949_++) {
			    i_947_ &= 0x7;
			    i_946_ &= 0x7;
			    if (aBoolArrayArray5001[i_944_][i_947_]
				&& (anIntArray4970[i_946_]
				    <= class658_943_.anInt8449 * -59845159)) {
				anIntArray4955[i_946_]
				    = -1932204261 * class658_943_.anInt8446;
				anIntArray5018[i_946_] = i_948_;
				anIntArray4993[i_946_]
				    = -1899182957 * class658_943_.anInt8453;
				anIntArray5002[i_946_]
				    = class658_943_.anInt8447 * 815197885;
				if (class658_943_.anInt8449 * -59845159
				    == anIntArray4970[i_946_])
				    anIntArray4997[i_946_] |= 0x8;
				else
				    anIntArray4997[i_946_] = 8;
				anIntArray4970[i_946_]
				    = -59845159 * class658_943_.anInt8449;
			    }
			    i_947_--;
			    i_946_++;
			}
			if (!bools_905_[1583960485 * anInt5017 + 3 & 0x3])
			    bools[3] = (aBoolArrayArray5010[i_944_]
					[1 + i_945_ & 0x3]);
		    } else if (!bools_905_[1583960485 * anInt5017 + 3 & 0x3])
			bools[3]
			    = aBoolArrayArray5006[i_944_][1 + i_945_ & 0x3];
		}
	    }
	}
	if (i < i_901_ - 1) {
	    int i_950_ = is[i + 1][i_900_] & 0x7fff;
	    if (i_950_ > 0) {
		Class658 class658_951_
		    = ((Class658)
		       aClass40_Sub18_5020.method76(i_950_ - 1, 1592828702));
		if (-1932204261 * class658_951_.anInt8446 != -1) {
		    byte i_952_ = is_903_[1 + i][i_900_];
		    int i_953_ = is_904_[1 + i][i_900_];
		    if (class658_951_.aBool8450) {
			int i_954_ = 4;
			int i_955_ = 2 * i_953_ + 6;
			int i_956_
			    = Class197.method3750(class182, class658_951_,
						  702163291);
			for (int i_957_ = 0; i_957_ < 3; i_957_++) {
			    i_955_ &= 0x7;
			    i_954_ &= 0x7;
			    if (aBoolArrayArray5001[i_952_][i_955_]
				&& (anIntArray4970[i_954_]
				    <= -59845159 * class658_951_.anInt8449)) {
				anIntArray4955[i_954_]
				    = -1932204261 * class658_951_.anInt8446;
				anIntArray5018[i_954_] = i_956_;
				anIntArray4993[i_954_]
				    = -1899182957 * class658_951_.anInt8453;
				anIntArray5002[i_954_]
				    = 815197885 * class658_951_.anInt8447;
				if (class658_951_.anInt8449 * -59845159
				    == anIntArray4970[i_954_])
				    anIntArray4997[i_954_] |= 0x4;
				else
				    anIntArray4997[i_954_] = 4;
				anIntArray4970[i_954_]
				    = class658_951_.anInt8449 * -59845159;
			    }
			    i_955_++;
			    i_954_--;
			}
			if (!bools_905_[1 + anInt5017 * 1583960485 & 0x3])
			    bools[1] = (aBoolArrayArray5010[i_952_]
					[i_953_ + 3 & 0x3]);
		    } else if (!bools_905_[1 + 1583960485 * anInt5017 & 0x3])
			bools[1]
			    = aBoolArrayArray5006[i_952_][i_953_ + 3 & 0x3];
		}
	    }
	}
	if (class658 != null && class658.aBool8450) {
	    int i_958_ = Class197.method3750(class182, class658, 337675502);
	    for (int i_959_ = 0; i_959_ < 8; i_959_++) {
		int i_960_ = i_959_ - -1127046326 * anInt5017 & 0x7;
		if (aBoolArrayArray5001[anInt5023 * 1434602089][i_959_]
		    && (anIntArray4970[i_960_]
			<= class658.anInt8449 * -59845159)) {
		    anIntArray4955[i_960_] = class658.anInt8446 * -1932204261;
		    anIntArray5018[i_960_] = i_958_;
		    anIntArray4993[i_960_] = -1899182957 * class658.anInt8453;
		    anIntArray5002[i_960_] = class658.anInt8447 * 815197885;
		    if (anIntArray4970[i_960_]
			== -59845159 * class658.anInt8449)
			anIntArray4997[i_960_] |= 0x2;
		    else
			anIntArray4997[i_960_] = 2;
		    anIntArray4970[i_960_] = -59845159 * class658.anInt8449;
		}
	    }
	}
    }
    
    final void method7432(Class182 class182, Class658 class658,
			  Class23 class23, int i, int i_961_, int i_962_,
			  int i_963_, short[][] is, byte[][] is_964_,
			  byte[][] is_965_, boolean[] bools) {
	boolean[] bools_966_ = (null != class658 && class658.aBool8450
				? aBoolArrayArray5010[anInt5023 * 1434602089]
				: aBoolArrayArray5006[1434602089 * anInt5023]);
	if (i_961_ > 0) {
	    if (i > 0) {
		int i_967_ = is[i - 1][i_961_ - 1] & 0x7fff;
		if (i_967_ > 0) {
		    Class658 class658_968_
			= (Class658) aClass40_Sub18_5020.method76(i_967_ - 1,
								  -220315467);
		    if (class658_968_.anInt8446 * -1932204261 != -1
			&& class658_968_.aBool8450) {
			byte i_969_ = is_964_[i - 1][i_961_ - 1];
			int i_970_ = is_965_[i - 1][i_961_ - 1] * 2 + 4 & 0x7;
			int i_971_
			    = Class197.method3750(class182, class658_968_,
						  -249719303);
			if (aBoolArrayArray5001[i_969_][i_970_]) {
			    anIntArray4955[0]
				= -1932204261 * class658_968_.anInt8446;
			    anIntArray5018[0] = i_971_;
			    anIntArray4993[0]
				= -1899182957 * class658_968_.anInt8453;
			    anIntArray5002[0]
				= class658_968_.anInt8447 * 815197885;
			    anIntArray4970[0]
				= -59845159 * class658_968_.anInt8449;
			    anIntArray4997[0] = 256;
			}
		    }
		}
	    }
	    if (i < i_962_ - 1) {
		int i_972_ = is[i + 1][i_961_ - 1] & 0x7fff;
		if (i_972_ > 0) {
		    Class658 class658_973_
			= (Class658) aClass40_Sub18_5020.method76(i_972_ - 1,
								  -277307213);
		    if (-1 != -1932204261 * class658_973_.anInt8446
			&& class658_973_.aBool8450) {
			byte i_974_ = is_964_[1 + i][i_961_ - 1];
			int i_975_ = is_965_[1 + i][i_961_ - 1] * 2 + 6 & 0x7;
			int i_976_
			    = Class197.method3750(class182, class658_973_,
						  -777368594);
			if (aBoolArrayArray5001[i_974_][i_975_]) {
			    anIntArray4955[2]
				= class658_973_.anInt8446 * -1932204261;
			    anIntArray5018[2] = i_976_;
			    anIntArray4993[2]
				= -1899182957 * class658_973_.anInt8453;
			    anIntArray5002[2]
				= 815197885 * class658_973_.anInt8447;
			    anIntArray4970[2]
				= -59845159 * class658_973_.anInt8449;
			    anIntArray4997[2] = 512;
			}
		    }
		}
	    }
	}
	if (i_961_ < i_963_ - 1) {
	    if (i > 0) {
		int i_977_ = is[i - 1][1 + i_961_] & 0x7fff;
		if (i_977_ > 0) {
		    Class658 class658_978_
			= (Class658) aClass40_Sub18_5020.method76(i_977_ - 1,
								  1509383439);
		    if (-1 != class658_978_.anInt8446 * -1932204261
			&& class658_978_.aBool8450) {
			byte i_979_ = is_964_[i - 1][1 + i_961_];
			int i_980_ = 2 + is_965_[i - 1][i_961_ + 1] * 2 & 0x7;
			int i_981_
			    = Class197.method3750(class182, class658_978_,
						  1547432961);
			if (aBoolArrayArray5001[i_979_][i_980_]) {
			    anIntArray4955[6]
				= -1932204261 * class658_978_.anInt8446;
			    anIntArray5018[6] = i_981_;
			    anIntArray4993[6]
				= -1899182957 * class658_978_.anInt8453;
			    anIntArray5002[6]
				= class658_978_.anInt8447 * 815197885;
			    anIntArray4970[6]
				= class658_978_.anInt8449 * -59845159;
			    anIntArray4997[6] = 64;
			}
		    }
		}
	    }
	    if (i < i_962_ - 1) {
		int i_982_ = is[i + 1][1 + i_961_] & 0x7fff;
		if (i_982_ > 0) {
		    Class658 class658_983_
			= (Class658) aClass40_Sub18_5020.method76(i_982_ - 1,
								  -1378219607);
		    if (-1 != class658_983_.anInt8446 * -1932204261
			&& class658_983_.aBool8450) {
			byte i_984_ = is_964_[i + 1][1 + i_961_];
			int i_985_ = 0 + is_965_[1 + i][1 + i_961_] * 2 & 0x7;
			int i_986_
			    = Class197.method3750(class182, class658_983_,
						  -1528687083);
			if (aBoolArrayArray5001[i_984_][i_985_]) {
			    anIntArray4955[4]
				= -1932204261 * class658_983_.anInt8446;
			    anIntArray5018[4] = i_986_;
			    anIntArray4993[4]
				= class658_983_.anInt8453 * -1899182957;
			    anIntArray5002[4]
				= 815197885 * class658_983_.anInt8447;
			    anIntArray4970[4]
				= class658_983_.anInt8449 * -59845159;
			    anIntArray4997[4] = 128;
			}
		    }
		}
	    }
	}
	if (i_961_ > 0) {
	    int i_987_ = is[i][i_961_ - 1] & 0x7fff;
	    if (i_987_ > 0) {
		Class658 class658_988_
		    = ((Class658)
		       aClass40_Sub18_5020.method76(i_987_ - 1, 1107215867));
		if (class658_988_.anInt8446 * -1932204261 != -1) {
		    byte i_989_ = is_964_[i][i_961_ - 1];
		    int i_990_ = is_965_[i][i_961_ - 1];
		    if (class658_988_.aBool8450) {
			int i_991_ = 2;
			int i_992_ = 2 * i_990_ + 4;
			int i_993_
			    = Class197.method3750(class182, class658_988_,
						  783743853);
			for (int i_994_ = 0; i_994_ < 3; i_994_++) {
			    i_992_ &= 0x7;
			    i_991_ &= 0x7;
			    if (aBoolArrayArray5001[i_989_][i_992_]
				&& (anIntArray4970[i_991_]
				    <= -59845159 * class658_988_.anInt8449)) {
				anIntArray4955[i_991_]
				    = -1932204261 * class658_988_.anInt8446;
				anIntArray5018[i_991_] = i_993_;
				anIntArray4993[i_991_]
				    = -1899182957 * class658_988_.anInt8453;
				anIntArray5002[i_991_]
				    = class658_988_.anInt8447 * 815197885;
				if (-59845159 * class658_988_.anInt8449
				    == anIntArray4970[i_991_])
				    anIntArray4997[i_991_] |= 0x20;
				else
				    anIntArray4997[i_991_] = 32;
				anIntArray4970[i_991_]
				    = -59845159 * class658_988_.anInt8449;
			    }
			    i_992_++;
			    i_991_--;
			}
			if (!bools_966_[1583960485 * anInt5017 + 0 & 0x3])
			    bools[0] = (aBoolArrayArray5010[i_989_]
					[2 + i_990_ & 0x3]);
		    } else if (!bools_966_[0 + anInt5017 * 1583960485 & 0x3])
			bools[0]
			    = aBoolArrayArray5006[i_989_][i_990_ + 2 & 0x3];
		}
	    }
	}
	if (i_961_ < i_963_ - 1) {
	    int i_995_ = is[i][i_961_ + 1] & 0x7fff;
	    if (i_995_ > 0) {
		Class658 class658_996_
		    = ((Class658)
		       aClass40_Sub18_5020.method76(i_995_ - 1, -981141425));
		if (class658_996_.anInt8446 * -1932204261 != -1) {
		    byte i_997_ = is_964_[i][i_961_ + 1];
		    int i_998_ = is_965_[i][1 + i_961_];
		    if (class658_996_.aBool8450) {
			int i_999_ = 4;
			int i_1000_ = i_998_ * 2 + 2;
			int i_1001_
			    = Class197.method3750(class182, class658_996_,
						  662316384);
			for (int i_1002_ = 0; i_1002_ < 3; i_1002_++) {
			    i_1000_ &= 0x7;
			    i_999_ &= 0x7;
			    if (aBoolArrayArray5001[i_997_][i_1000_]
				&& (anIntArray4970[i_999_]
				    <= class658_996_.anInt8449 * -59845159)) {
				anIntArray4955[i_999_]
				    = -1932204261 * class658_996_.anInt8446;
				anIntArray5018[i_999_] = i_1001_;
				anIntArray4993[i_999_]
				    = -1899182957 * class658_996_.anInt8453;
				anIntArray5002[i_999_]
				    = 815197885 * class658_996_.anInt8447;
				if (-59845159 * class658_996_.anInt8449
				    == anIntArray4970[i_999_])
				    anIntArray4997[i_999_] |= 0x10;
				else
				    anIntArray4997[i_999_] = 16;
				anIntArray4970[i_999_]
				    = class658_996_.anInt8449 * -59845159;
			    }
			    i_1000_--;
			    i_999_++;
			}
			if (!bools_966_[1583960485 * anInt5017 + 2 & 0x3])
			    bools[2] = (aBoolArrayArray5010[i_997_]
					[0 + i_998_ & 0x3]);
		    } else if (!bools_966_[1583960485 * anInt5017 + 2 & 0x3])
			bools[2]
			    = aBoolArrayArray5006[i_997_][0 + i_998_ & 0x3];
		}
	    }
	}
	if (i > 0) {
	    int i_1003_ = is[i - 1][i_961_] & 0x7fff;
	    if (i_1003_ > 0) {
		Class658 class658_1004_
		    = ((Class658)
		       aClass40_Sub18_5020.method76(i_1003_ - 1, -628344807));
		if (-1932204261 * class658_1004_.anInt8446 != -1) {
		    byte i_1005_ = is_964_[i - 1][i_961_];
		    int i_1006_ = is_965_[i - 1][i_961_];
		    if (class658_1004_.aBool8450) {
			int i_1007_ = 6;
			int i_1008_ = 4 + i_1006_ * 2;
			int i_1009_
			    = Class197.method3750(class182, class658_1004_,
						  -1388464363);
			for (int i_1010_ = 0; i_1010_ < 3; i_1010_++) {
			    i_1008_ &= 0x7;
			    i_1007_ &= 0x7;
			    if (aBoolArrayArray5001[i_1005_][i_1008_]
				&& (anIntArray4970[i_1007_]
				    <= class658_1004_.anInt8449 * -59845159)) {
				anIntArray4955[i_1007_]
				    = -1932204261 * class658_1004_.anInt8446;
				anIntArray5018[i_1007_] = i_1009_;
				anIntArray4993[i_1007_]
				    = -1899182957 * class658_1004_.anInt8453;
				anIntArray5002[i_1007_]
				    = class658_1004_.anInt8447 * 815197885;
				if (class658_1004_.anInt8449 * -59845159
				    == anIntArray4970[i_1007_])
				    anIntArray4997[i_1007_] |= 0x8;
				else
				    anIntArray4997[i_1007_] = 8;
				anIntArray4970[i_1007_]
				    = -59845159 * class658_1004_.anInt8449;
			    }
			    i_1008_--;
			    i_1007_++;
			}
			if (!bools_966_[1583960485 * anInt5017 + 3 & 0x3])
			    bools[3] = (aBoolArrayArray5010[i_1005_]
					[1 + i_1006_ & 0x3]);
		    } else if (!bools_966_[1583960485 * anInt5017 + 3 & 0x3])
			bools[3]
			    = aBoolArrayArray5006[i_1005_][1 + i_1006_ & 0x3];
		}
	    }
	}
	if (i < i_962_ - 1) {
	    int i_1011_ = is[i + 1][i_961_] & 0x7fff;
	    if (i_1011_ > 0) {
		Class658 class658_1012_
		    = ((Class658)
		       aClass40_Sub18_5020.method76(i_1011_ - 1, -2019953127));
		if (-1932204261 * class658_1012_.anInt8446 != -1) {
		    byte i_1013_ = is_964_[1 + i][i_961_];
		    int i_1014_ = is_965_[1 + i][i_961_];
		    if (class658_1012_.aBool8450) {
			int i_1015_ = 4;
			int i_1016_ = 2 * i_1014_ + 6;
			int i_1017_
			    = Class197.method3750(class182, class658_1012_,
						  718822006);
			for (int i_1018_ = 0; i_1018_ < 3; i_1018_++) {
			    i_1016_ &= 0x7;
			    i_1015_ &= 0x7;
			    if (aBoolArrayArray5001[i_1013_][i_1016_]
				&& (anIntArray4970[i_1015_]
				    <= -59845159 * class658_1012_.anInt8449)) {
				anIntArray4955[i_1015_]
				    = -1932204261 * class658_1012_.anInt8446;
				anIntArray5018[i_1015_] = i_1017_;
				anIntArray4993[i_1015_]
				    = -1899182957 * class658_1012_.anInt8453;
				anIntArray5002[i_1015_]
				    = 815197885 * class658_1012_.anInt8447;
				if (class658_1012_.anInt8449 * -59845159
				    == anIntArray4970[i_1015_])
				    anIntArray4997[i_1015_] |= 0x4;
				else
				    anIntArray4997[i_1015_] = 4;
				anIntArray4970[i_1015_]
				    = class658_1012_.anInt8449 * -59845159;
			    }
			    i_1016_++;
			    i_1015_--;
			}
			if (!bools_966_[1 + anInt5017 * 1583960485 & 0x3])
			    bools[1] = (aBoolArrayArray5010[i_1013_]
					[i_1014_ + 3 & 0x3]);
		    } else if (!bools_966_[1 + 1583960485 * anInt5017 & 0x3])
			bools[1]
			    = aBoolArrayArray5006[i_1013_][i_1014_ + 3 & 0x3];
		}
	    }
	}
	if (class658 != null && class658.aBool8450) {
	    int i_1019_ = Class197.method3750(class182, class658, 2067641726);
	    for (int i_1020_ = 0; i_1020_ < 8; i_1020_++) {
		int i_1021_ = i_1020_ - -1127046326 * anInt5017 & 0x7;
		if (aBoolArrayArray5001[anInt5023 * 1434602089][i_1020_]
		    && (anIntArray4970[i_1021_]
			<= class658.anInt8449 * -59845159)) {
		    anIntArray4955[i_1021_] = class658.anInt8446 * -1932204261;
		    anIntArray5018[i_1021_] = i_1019_;
		    anIntArray4993[i_1021_] = -1899182957 * class658.anInt8453;
		    anIntArray5002[i_1021_] = class658.anInt8447 * 815197885;
		    if (anIntArray4970[i_1021_]
			== -59845159 * class658.anInt8449)
			anIntArray4997[i_1021_] |= 0x2;
		    else
			anIntArray4997[i_1021_] = 2;
		    anIntArray4970[i_1021_] = -59845159 * class658.anInt8449;
		}
	    }
	}
    }
    
    static final int method7433(int i, int i_1022_, int i_1023_) {
	if (i_1022_ == i)
	    return i;
	int i_1024_ = 128 - i_1023_;
	int i_1025_ = i_1024_ * (i & 0x7f) + i_1023_ * (i_1022_ & 0x7f) >> 7;
	int i_1026_ = (i_1022_ & 0x380) * i_1023_ + (i & 0x380) * i_1024_ >> 7;
	int i_1027_
	    = i_1023_ * (i_1022_ & 0xfc00) + i_1024_ * (i & 0xfc00) >> 7;
	return i_1027_ & 0xfc00 | i_1026_ & 0x380 | i_1025_ & 0x7f;
    }
    
    public final void method7434(RSBuffer class525_sub38, int i,
								 int i_1028_, int i_1029_, int i_1030_,
								 int i_1031_) {
	int i_1032_ = i + i_1029_;
	int i_1033_ = i_1030_ + i_1028_;
	for (int i_1034_ = 0; i_1034_ < anInt4987 * -155906383; i_1034_++) {
	    for (int i_1035_ = 0; i_1035_ < 64; i_1035_++) {
		for (int i_1036_ = 0; i_1036_ < 64; i_1036_++)
		    method7447(class525_sub38, i_1034_, i_1035_ + i,
			       i_1028_ + i_1036_, 0, 0, i_1035_ + i_1032_,
			       i_1036_ + i_1033_, 0, false, (byte) -7);
	    }
	}
    }
    
    public final void method7435(int i, int i_1037_, int i_1038_,
				 int i_1039_) {
	for (int i_1040_ = 0; i_1040_ < -155906383 * anInt4987; i_1040_++)
	    method7378(i_1040_, i, i_1037_, i_1038_, i_1039_, -2146719611);
    }
    
    static final int method7436(int i, int i_1041_, int i_1042_) {
	if (i_1041_ == i)
	    return i;
	int i_1043_ = 128 - i_1042_;
	int i_1044_ = i_1043_ * (i & 0x7f) + i_1042_ * (i_1041_ & 0x7f) >> 7;
	int i_1045_ = (i_1041_ & 0x380) * i_1042_ + (i & 0x380) * i_1043_ >> 7;
	int i_1046_
	    = i_1042_ * (i_1041_ & 0xfc00) + i_1043_ * (i & 0xfc00) >> 7;
	return i_1046_ & 0xfc00 | i_1045_ & 0x380 | i_1044_ & 0x7f;
    }
    
    static final int method7437(int i, int i_1047_) {
	int i_1048_
	    = (Class514.method8553(i + 45365, 91923 + i_1047_, 4, -790950494)
	       - 128
	       + (Class514.method8553(10294 + i, 37821 + i_1047_, 2,
				      391098754) - 128
		  >> 1)
	       + (Class514.method8553(i, i_1047_, 1, 1675671403) - 128 >> 2));
	i_1048_ = 35 + (int) ((double) i_1048_ * 0.3);
	if (i_1048_ < 10)
	    i_1048_ = 10;
	else if (i_1048_ > 60)
	    i_1048_ = 60;
	return i_1048_;
    }
    
    static final int method7438(int i, int i_1049_) {
	int i_1050_
	    = (Class514.method8553(i + 45365, 91923 + i_1049_, 4, -1905783687)
	       - 128
	       + (Class514.method8553(10294 + i, 37821 + i_1049_, 2,
				      -1093812692) - 128
		  >> 1)
	       + (Class514.method8553(i, i_1049_, 1, -1767431393) - 128 >> 2));
	i_1050_ = 35 + (int) ((double) i_1050_ * 0.3);
	if (i_1050_ < 10)
	    i_1050_ = 10;
	else if (i_1050_ > 60)
	    i_1050_ = 60;
	return i_1050_;
    }
    
    static final int method7439(int i, int i_1051_) {
	int i_1052_
	    = (Class514.method8553(i + 45365, 91923 + i_1051_, 4, -683315102)
	       - 128
	       + (Class514.method8553(10294 + i, 37821 + i_1051_, 2,
				      -1086919491) - 128
		  >> 1)
	       + (Class514.method8553(i, i_1051_, 1, 1601513434) - 128 >> 2));
	i_1052_ = 35 + (int) ((double) i_1052_ * 0.3);
	if (i_1052_ < 10)
	    i_1052_ = 10;
	else if (i_1052_ > 60)
	    i_1052_ = 60;
	return i_1052_;
    }
    
    public final void method7440(int i, int i_1053_, int i_1054_,
				 int i_1055_) {
	for (int i_1056_ = 0; i_1056_ < -155906383 * anInt4987; i_1056_++)
	    method7378(i_1056_, i, i_1053_, i_1054_, i_1055_, -2145698691);
    }
    
    static final int method7441(int i, int i_1057_, int i_1058_) {
	int i_1059_ = i / i_1058_;
	int i_1060_ = i & i_1058_ - 1;
	int i_1061_ = i_1057_ / i_1058_;
	int i_1062_ = i_1057_ & i_1058_ - 1;
	int i_1063_ = Class469.method7712(i_1059_, i_1061_, -387865103);
	int i_1064_ = Class469.method7712(i_1059_ + 1, i_1061_, -387865103);
	int i_1065_ = Class469.method7712(i_1059_, i_1061_ + 1, -387865103);
	int i_1066_
	    = Class469.method7712(1 + i_1059_, i_1061_ + 1, -387865103);
	int i_1067_ = Class451.method7337(i_1063_, i_1064_, i_1060_, i_1058_,
					  (byte) -73);
	int i_1068_ = Class451.method7337(i_1065_, i_1066_, i_1060_, i_1058_,
					  (byte) -20);
	return Class451.method7337(i_1067_, i_1068_, i_1062_, i_1058_,
				   (byte) -91);
    }
    
    static final int method7442(int i, int i_1069_, int i_1070_) {
	int i_1071_ = i / i_1070_;
	int i_1072_ = i & i_1070_ - 1;
	int i_1073_ = i_1069_ / i_1070_;
	int i_1074_ = i_1069_ & i_1070_ - 1;
	int i_1075_ = Class469.method7712(i_1071_, i_1073_, -387865103);
	int i_1076_ = Class469.method7712(i_1071_ + 1, i_1073_, -387865103);
	int i_1077_ = Class469.method7712(i_1071_, i_1073_ + 1, -387865103);
	int i_1078_
	    = Class469.method7712(1 + i_1071_, i_1073_ + 1, -387865103);
	int i_1079_ = Class451.method7337(i_1075_, i_1076_, i_1072_, i_1070_,
					  (byte) -91);
	int i_1080_ = Class451.method7337(i_1077_, i_1078_, i_1072_, i_1070_,
					  (byte) -47);
	return Class451.method7337(i_1079_, i_1080_, i_1074_, i_1070_,
				   (byte) -1);
    }
    
    static final int method7443(int i, int i_1081_, int i_1082_) {
	int i_1083_ = i / i_1082_;
	int i_1084_ = i & i_1082_ - 1;
	int i_1085_ = i_1081_ / i_1082_;
	int i_1086_ = i_1081_ & i_1082_ - 1;
	int i_1087_ = Class469.method7712(i_1083_, i_1085_, -387865103);
	int i_1088_ = Class469.method7712(i_1083_ + 1, i_1085_, -387865103);
	int i_1089_ = Class469.method7712(i_1083_, i_1085_ + 1, -387865103);
	int i_1090_
	    = Class469.method7712(1 + i_1083_, i_1085_ + 1, -387865103);
	int i_1091_ = Class451.method7337(i_1087_, i_1088_, i_1084_, i_1082_,
					  (byte) -52);
	int i_1092_ = Class451.method7337(i_1089_, i_1090_, i_1084_, i_1082_,
					  (byte) -58);
	return Class451.method7337(i_1091_, i_1092_, i_1086_, i_1082_,
				   (byte) -126);
    }
    
    static final int method7444(int i, int i_1093_, int i_1094_, int i_1095_) {
	int i_1096_
	    = 65536 - Class436.anIntArray4838[8192 * i_1094_ / i_1095_] >> 1;
	return ((65536 - i_1096_) * i >> 16) + (i_1096_ * i_1093_ >> 16);
    }
    
    void method7445(Class182 class182, int i, int i_1097_, int i_1098_,
		    int i_1099_, int i_1100_, Class23 class23, int i_1101_,
		    int i_1102_, int i_1103_, int i_1104_, boolean[] bools,
		    int[] is, int[] is_1105_, int[] is_1106_, int[] is_1107_,
		    int[] is_1108_, int[] is_1109_, int[] is_1110_,
		    int[] is_1111_, int[][] is_1112_, Class161 class161,
		    Class161 class161_1113_, Class161 class161_1114_) {
	if (class23 != null) {
	    if (i_1102_ == 0)
		i_1102_ = i_1101_;
	    if (0 == i_1103_)
		i_1103_ = i_1101_;
	    if (0 == i_1104_)
		i_1104_ = i_1101_;
	    Class23 class23_1115_
		= ((Class23)
		   aClass40_Sub14_4954.method76(i_1101_ - 1, 1348479449));
	    Class23 class23_1116_
		= ((Class23)
		   aClass40_Sub14_4954.method76(i_1102_ - 1, -754960039));
	    Class23 class23_1117_
		= ((Class23)
		   aClass40_Sub14_4954.method76(i_1103_ - 1, 1352132238));
	    Class23 class23_1118_
		= ((Class23)
		   aClass40_Sub14_4954.method76(i_1104_ - 1, 878819743));
	    for (int i_1119_ = 0; i_1119_ < anInt5034 * 1936283541;
		 i_1119_++) {
		boolean bool = false;
		int i_1120_;
		if (bools[0 - 1583960485 * anInt5017 & 0x3]
		    && anInt5025 * -1262762653 == anIntArray5039[0]) {
		    anIntArray5016[0]
			= anIntArray4952[anInt5025 * -1262762653];
		    anIntArray5016[1] = 1;
		    anIntArray5016[2]
			= anIntArray5038[-1262762653 * anInt5025];
		    anIntArray5016[3] = 1;
		    anIntArray5016[4]
			= anIntArray5037[-1262762653 * anInt5025];
		    anIntArray5016[5]
			= anIntArray5038[anInt5025 * -1262762653];
		    i_1120_ = 6;
		} else if (bools[2 - anInt5017 * 1583960485 & 0x3]
			   && anIntArray5039[2] == -1262762653 * anInt5025) {
		    anIntArray5016[0]
			= anIntArray4952[anInt5025 * -1262762653];
		    anIntArray5016[1] = 5;
		    anIntArray5016[2]
			= anIntArray5038[-1262762653 * anInt5025];
		    anIntArray5016[3] = 5;
		    anIntArray5016[4]
			= anIntArray5037[-1262762653 * anInt5025];
		    anIntArray5016[5]
			= anIntArray5038[anInt5025 * -1262762653];
		    i_1120_ = 6;
		} else if (bools[1 - 1583960485 * anInt5017 & 0x3]
			   && -1262762653 * anInt5025 == anIntArray5039[1]) {
		    anIntArray5016[0]
			= anIntArray4952[-1262762653 * anInt5025];
		    anIntArray5016[1] = 3;
		    anIntArray5016[2]
			= anIntArray5038[anInt5025 * -1262762653];
		    anIntArray5016[3] = 3;
		    anIntArray5016[4]
			= anIntArray5037[anInt5025 * -1262762653];
		    anIntArray5016[5]
			= anIntArray5038[-1262762653 * anInt5025];
		    i_1120_ = 6;
		} else if (bools[3 - anInt5017 * 1583960485 & 0x3]
			   && -1262762653 * anInt5025 == anIntArray5039[3]) {
		    anIntArray5016[0]
			= anIntArray4952[-1262762653 * anInt5025];
		    anIntArray5016[1] = 7;
		    anIntArray5016[2]
			= anIntArray5038[-1262762653 * anInt5025];
		    anIntArray5016[3] = 7;
		    anIntArray5016[4]
			= anIntArray5037[anInt5025 * -1262762653];
		    anIntArray5016[5]
			= anIntArray5038[anInt5025 * -1262762653];
		    i_1120_ = 6;
		} else {
		    anIntArray5016[0]
			= anIntArray4952[-1262762653 * anInt5025];
		    anIntArray5016[1]
			= anIntArray5037[anInt5025 * -1262762653];
		    anIntArray5016[2]
			= anIntArray5038[anInt5025 * -1262762653];
		    i_1120_ = 3;
		}
		for (int i_1121_ = 0; i_1121_ < i_1120_; i_1121_++) {
		    int i_1122_ = anIntArray5016[i_1121_];
		    int i_1123_ = i_1122_ - -1127046326 * anInt5017 & 0x7;
		    int i_1124_ = anIntArray4999[i_1122_];
		    int i_1125_ = anIntArray5000[i_1122_];
		    int i_1126_;
		    int i_1127_;
		    if (1 == anInt5017 * 1583960485) {
			i_1126_ = i_1125_;
			i_1127_ = 512 - i_1124_;
		    } else if (1583960485 * anInt5017 == 2) {
			i_1126_ = 512 - i_1124_;
			i_1127_ = 512 - i_1125_;
		    } else if (1583960485 * anInt5017 == 3) {
			i_1126_ = 512 - i_1125_;
			i_1127_ = i_1124_;
		    } else {
			i_1126_ = i_1124_;
			i_1127_ = i_1125_;
		    }
		    is_1105_[1122233837 * anInt5026] = i_1126_;
		    is_1106_[1122233837 * anInt5026] = i_1127_;
		    if (null != is_1110_
			&& (aBoolArrayArray5001[anInt5023 * 1434602089]
			    [i_1122_])) {
			int i_1128_ = (i_1097_ << 9) + i_1126_;
			int i_1129_ = (i_1098_ << 9) + i_1127_;
			is_1110_[1122233837 * anInt5026]
			    = (class161_1113_.method2619(i_1128_, i_1129_,
							 -1394836033)
			       - class161.method2619(i_1128_, i_1129_,
						     156581966));
		    }
		    if (null != is_1111_) {
			if (class161_1113_ != null
			    && !(aBoolArrayArray5001[anInt5023 * 1434602089]
				 [i_1122_])) {
			    int i_1130_ = i_1126_ + (i_1097_ << 9);
			    int i_1131_ = i_1127_ + (i_1098_ << 9);
			    is_1111_[anInt5026 * 1122233837]
				= (class161.method2619(i_1130_, i_1131_,
						       980444071)
				   - class161_1113_.method2619(i_1130_,
							       i_1131_,
							       953725054));
			} else if (null != class161_1114_
				   && !(aBoolArrayArray5008
					[1434602089 * anInt5023][i_1122_])) {
			    int i_1132_ = (i_1097_ << 9) + i_1126_;
			    int i_1133_ = (i_1098_ << 9) + i_1127_;
			    is_1111_[anInt5026 * 1122233837]
				= (class161_1114_.method2619(i_1132_, i_1133_,
							     1914129107)
				   - class161.method2619(i_1132_, i_1133_,
							 -414210194));
			}
		    }
		    if (i_1122_ < 8 && anIntArray4970[i_1123_] >= 0) {
			if (is != null)
			    is[1122233837 * anInt5026]
				= anIntArray5018[i_1123_];
			is_1109_[anInt5026 * 1122233837]
			    = anIntArray5002[i_1123_];
			is_1108_[anInt5026 * 1122233837]
			    = anIntArray4993[i_1123_];
			is_1107_[1122233837 * anInt5026]
			    = anIntArray4955[i_1123_];
		    } else {
			if (aBool5031 && (aBoolArrayArray5001
					  [anInt5023 * 1434602089][i_1122_])) {
			    is_1108_[anInt5026 * 1122233837]
				= 1327464973 * anInt5027;
			    is_1109_[anInt5026 * 1122233837]
				= -1025563611 * anInt4983;
			    is_1107_[1122233837 * anInt5026]
				= anInt5029 * -1146544487;
			} else if (0 == i_1126_ && i_1127_ == 0) {
			    is_1107_[anInt5026 * 1122233837]
				= is_1112_[i_1097_][i_1098_];
			    is_1108_[1122233837 * anInt5026]
				= -1990883919 * class23_1115_.anInt219;
			    is_1109_[1122233837 * anInt5026]
				= -1908571849 * class23_1115_.anInt220;
			} else if (i_1126_ == 0 && 512 == i_1127_) {
			    is_1107_[anInt5026 * 1122233837]
				= is_1112_[i_1097_][i_1100_];
			    is_1108_[anInt5026 * 1122233837]
				= -1990883919 * class23_1116_.anInt219;
			    is_1109_[1122233837 * anInt5026]
				= class23_1116_.anInt220 * -1908571849;
			} else if (i_1126_ == 512 && 512 == i_1127_) {
			    is_1107_[anInt5026 * 1122233837]
				= is_1112_[i_1099_][i_1100_];
			    is_1108_[anInt5026 * 1122233837]
				= class23_1117_.anInt219 * -1990883919;
			    is_1109_[1122233837 * anInt5026]
				= -1908571849 * class23_1117_.anInt220;
			} else if (512 == i_1126_ && 0 == i_1127_) {
			    is_1107_[anInt5026 * 1122233837]
				= is_1112_[i_1099_][i_1098_];
			    is_1108_[anInt5026 * 1122233837]
				= -1990883919 * class23_1118_.anInt219;
			    is_1109_[1122233837 * anInt5026]
				= -1908571849 * class23_1118_.anInt220;
			} else {
			    if (i_1126_ < 256) {
				if (i_1127_ < 256) {
				    is_1108_[1122233837 * anInt5026]
					= -1990883919 * class23_1115_.anInt219;
				    is_1109_[1122233837 * anInt5026]
					= -1908571849 * class23_1115_.anInt220;
				} else {
				    is_1108_[anInt5026 * 1122233837]
					= class23_1116_.anInt219 * -1990883919;
				    is_1109_[anInt5026 * 1122233837]
					= class23_1116_.anInt220 * -1908571849;
				}
			    } else if (i_1127_ < 256) {
				is_1108_[1122233837 * anInt5026]
				    = -1990883919 * class23_1118_.anInt219;
				is_1109_[anInt5026 * 1122233837]
				    = class23_1118_.anInt220 * -1908571849;
			    } else {
				is_1108_[1122233837 * anInt5026]
				    = class23_1117_.anInt219 * -1990883919;
				is_1109_[1122233837 * anInt5026]
				    = class23_1117_.anInt220 * -1908571849;
			    }
			    int i_1134_
				= Class239.method4426((is_1112_[i_1097_]
						       [i_1098_]),
						      (is_1112_[i_1099_]
						       [i_1098_]),
						      i_1126_ << 7 >> 9,
						      (byte) 17);
			    int i_1135_
				= Class239.method4426((is_1112_[i_1097_]
						       [i_1100_]),
						      (is_1112_[i_1099_]
						       [i_1100_]),
						      i_1126_ << 7 >> 9,
						      (byte) -23);
			    is_1107_[anInt5026 * 1122233837]
				= Class239.method4426(i_1134_, i_1135_,
						      i_1127_ << 7 >> 9,
						      (byte) -28);
			}
			if (null != is)
			    is[anInt5026 * 1122233837]
				= is_1107_[anInt5026 * 1122233837];
		    }
		    anInt5026 += -1473284123;
		}
		anInt5025 += -312744885;
	    }
	    if (1434602089 * anInt5023 != 0 && class23.aBool221)
		aBool5030 = true;
	}
    }
    
    static final int method7446(int i, int i_1136_) {
	int i_1137_
	    = (Class399_Sub1.method15873(i - 1, i_1136_ - 1, 916274852)
	       + Class399_Sub1.method15873(i + 1, i_1136_ - 1, 1286833949)
	       + Class399_Sub1.method15873(i - 1, 1 + i_1136_, 1677436867)
	       + Class399_Sub1.method15873(1 + i, i_1136_ + 1, -468564789));
	int i_1138_ = (Class399_Sub1.method15873(i - 1, i_1136_, -335209693)
		       + Class399_Sub1.method15873(1 + i, i_1136_, 1841950339)
		       + Class399_Sub1.method15873(i, i_1136_ - 1, 1107389187)
		       + Class399_Sub1.method15873(i, 1 + i_1136_, 343901945));
	int i_1139_ = Class399_Sub1.method15873(i, i_1136_, 863787071);
	return i_1137_ / 16 + i_1138_ / 8 + i_1139_ / 4;
    }
    
    final void method7447(RSBuffer class525_sub38, int i, int i_1140_,
						  int i_1141_, int i_1142_, int i_1143_, int i_1144_,
						  int i_1145_, int i_1146_, boolean bool,
						  byte i_1147_) {
	if (1 == i_1146_)
	    i_1143_ = 1;
	else if (i_1146_ == 2) {
	    i_1142_ = 1;
	    i_1143_ = 1;
	} else if (i_1146_ == 3)
	    i_1142_ = 1;
	if (i_1140_ >= 0 && i_1140_ < anInt4963 * -528942713 && i_1141_ >= 0
	    && i_1141_ < anInt4964 * -129082381) {
	    if (!aBool4965 && !bool)
		aClass475_4990.aByteArrayArrayArray5178[i][i_1140_][i_1141_]
		    = (byte) 0;
	    int i_1148_ = class525_sub38.readUnsignedByte(1985623351);
	    if (0 != (i_1148_ & 0x1)) {
		if (bool) {
		    class525_sub38.readUnsignedByte(1490637789);
		    class525_sub38.readUnsignedSmart((byte) -33);
		} else {
		    int i_1149_ = class525_sub38.readUnsignedByte(981483320);
		    aShortArrayArrayArray4972[i][i_1140_][i_1141_]
			= (short) class525_sub38.readUnsignedSmart((byte) -79);
		    aByteArrayArrayArray4969[i][i_1140_][i_1141_]
			= (byte) (i_1149_ >> 2);
		    aByteArrayArrayArray5024[i][i_1140_][i_1141_]
			= (byte) (i_1146_ + i_1149_ & 0x3);
		}
	    }
	    if ((i_1148_ & 0x2) != 0) {
		if (!aBool4965 && !bool)
		    aClass475_4990.aByteArrayArrayArray5178[i][i_1140_]
			[i_1141_]
			= class525_sub38.readByte(-1150098071);
		else
		    class525_sub38.index += 339428471;
	    }
	    if ((i_1148_ & 0x4) != 0) {
		if (bool)
		    class525_sub38.readUnsignedSmart((byte) -77);
		else
		    aShortArrayArrayArray4971[i][i_1140_][i_1141_]
			= (short) class525_sub38.readUnsignedSmart((byte) -38);
	    }
	    if ((i_1148_ & 0x8) != 0) {
		int i_1150_ = class525_sub38.readUnsignedByte(1876817654);
		if (!aBool4965) {
		    if (1 == i_1150_)
			i_1150_ = 0;
		    if (0 == i)
			anIntArrayArrayArray4966[0][i_1142_ + i_1140_]
			    [i_1143_ + i_1141_]
			    = -i_1150_ * 8 << 2;
		    else
			anIntArrayArrayArray4966[i][i_1142_ + i_1140_]
			    [i_1141_ + i_1143_]
			    = ((anIntArrayArrayArray4966[i - 1]
				[i_1142_ + i_1140_][i_1141_ + i_1143_])
			       - (8 * i_1150_ << 2));
		} else
		    anIntArrayArrayArray4966[0][i_1140_ + i_1142_][(i_1143_
								    + i_1141_)]
			= 8 * i_1150_ << 2;
	    } else if (aBool4965)
		anIntArrayArrayArray4966[0][i_1140_ + i_1142_][(i_1143_
								+ i_1141_)]
		    = 0;
	    else if (i == 0)
		anIntArrayArrayArray4966[0][i_1142_ + i_1140_][(i_1141_
								+ i_1143_)]
		    = -Class507.method8489(i_1144_ + 932731, i_1145_ + 556238,
					   501271953) * 8 << 2;
	    else
		anIntArrayArrayArray4966[i][i_1140_ + i_1142_][(i_1143_
								+ i_1141_)]
		    = (anIntArrayArrayArray4966[i - 1][i_1140_ + i_1142_]
		       [i_1141_ + i_1143_]) - 960;
	} else {
	    int i_1151_ = class525_sub38.readUnsignedByte(120953319);
	    if (0 != (i_1151_ & 0x1)) {
		class525_sub38.readUnsignedByte(1757243205);
		class525_sub38.readUnsignedSmart((byte) -3);
	    }
	    if ((i_1151_ & 0x2) != 0)
		class525_sub38.index += 339428471;
	    if ((i_1151_ & 0x4) != 0)
		class525_sub38.readUnsignedSmart((byte) -23);
	    if (0 != (i_1151_ & 0x8))
		class525_sub38.readUnsignedByte(1777911173);
	}
    }
    
    static final int method7448(int i, int i_1152_) {
	int i_1153_ = i_1152_ * 57 + i;
	i_1153_ = i_1153_ << 13 ^ i_1153_;
	int i_1154_
	    = (1376312589 + i_1153_ * (789221 + i_1153_ * i_1153_ * 15731)
	       & 0x7fffffff);
	return i_1154_ >> 19 & 0xff;
    }
    
    void method7449(Class182 class182, Class658 class658, Class23 class23,
		    int i, int i_1155_, byte[][] is, byte[][] is_1156_,
		    short[][] is_1157_, boolean[] bools) {
	boolean[] bools_1158_
	    = (null != class658 && class658.aBool8450
	       ? aBoolArrayArray5010[1434602089 * anInt5023]
	       : aBoolArrayArray5006[anInt5023 * 1434602089]);
	method7393(class182, class658, class23, i, i_1155_,
		   anInt4963 * -528942713, -129082381 * anInt4964, is_1157_,
		   is, is_1156_, bools, 739402815);
	aBool5022 = null != class658 && (-1932204261 * class658.anInt8446
					 != class658.anInt8452 * 2040702555);
	if (!aBool5022) {
	    for (int i_1159_ = 0; i_1159_ < 8; i_1159_++) {
		if (anIntArray4970[i_1159_] >= 0
		    && anIntArray4955[i_1159_] != anIntArray5018[i_1159_]) {
		    aBool5022 = true;
		    break;
		}
	    }
	}
	if (!bools_1158_[1 + 1583960485 * anInt5017 & 0x3]) {
	    boolean[] bools_1160_ = bools;
	    int i_1161_ = 1;
	    bools_1160_[i_1161_]
		= bools_1160_[i_1161_] | 0 == (anIntArray4997[2]
					       & anIntArray4997[4]);
	}
	if (!bools_1158_[3 + 1583960485 * anInt5017 & 0x3]) {
	    boolean[] bools_1162_ = bools;
	    int i_1163_ = 3;
	    bools_1162_[i_1163_]
		= bools_1162_[i_1163_] | 0 == (anIntArray4997[6]
					       & anIntArray4997[0]);
	}
	if (!bools_1158_[0 + anInt5017 * 1583960485 & 0x3]) {
	    boolean[] bools_1164_ = bools;
	    int i_1165_ = 0;
	    bools_1164_[i_1165_]
		= bools_1164_[i_1165_] | 0 == (anIntArray4997[0]
					       & anIntArray4997[2]);
	}
	if (!bools_1158_[2 + anInt5017 * 1583960485 & 0x3]) {
	    boolean[] bools_1166_ = bools;
	    int i_1167_ = 2;
	    bools_1166_[i_1167_]
		= bools_1166_[i_1167_] | 0 == (anIntArray4997[4]
					       & anIntArray4997[6]);
	}
	if (!aBool5031
	    && (1434602089 * anInt5023 == 0 || 12 == anInt5023 * 1434602089)) {
	    if (bools[0] && !bools[1] && !bools[2] && bools[3]) {
		boolean[] bools_1168_ = bools;
		bools[3] = false;
		bools_1168_[0] = false;
		anInt5023
		    = 1378346457 * (anInt5023 * 1434602089 == 0 ? 13 : 14);
		anInt5017 = 0;
	    } else if (bools[0] && bools[1] && !bools[2] && !bools[3]) {
		boolean[] bools_1169_ = bools;
		bools[1] = false;
		bools_1169_[0] = false;
		anInt5023
		    = (1434602089 * anInt5023 == 0 ? 13 : 14) * 1378346457;
		anInt5017 = 1849133703;
	    } else if (!bools[0] && bools[1] && bools[2] && !bools[3]) {
		boolean[] bools_1170_ = bools;
		bools[2] = false;
		bools_1170_[1] = false;
		anInt5023
		    = (0 == 1434602089 * anInt5023 ? 13 : 14) * 1378346457;
		anInt5017 = 1232755802;
	    } else if (!bools[0] && !bools[1] && bools[2] && bools[3]) {
		boolean[] bools_1171_ = bools;
		bools[3] = false;
		bools_1171_[2] = false;
		anInt5023
		    = (1434602089 * anInt5023 == 0 ? 13 : 14) * 1378346457;
		anInt5017 = 616377901;
	    }
	}
    }
    
    static final void method7450(Class683 class683, int i) {
	int i_1172_ = (class683.anIntArray8661
		       [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class525_Sub15 class525_sub15
	    = Class16.method767(Class412.aClass412_4364,
				client.aClass96_11085.aClass6_1169,
				1977859884);
	class525_sub15.aClass525_Sub38_Sub2_10546.method16602(i_1172_,
							      861308688);
	client.aClass96_11085.method1794(class525_sub15, (short) 30425);
    }
}
