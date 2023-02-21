/* Class525_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class525_Sub10 extends Class525
{
    static Class200 aClass200_10505;
    int[] anIntArray10506;
    int[] anIntArray10507 = { -1 };
    Class9[] aClass9Array10508;
    static Class10 aClass10_10509 = new Class10(32);
    
    public static int method16155(int i, int i_0_, boolean bool) {
	int i_1_ = 0;
	Class525_Sub10 class525_sub10
	    = Class190.method3692(i, bool, (byte) 100);
	if (null == class525_sub10)
	    return 0;
	for (int i_2_ = 0; i_2_ < class525_sub10.anIntArray10507.length;
	     i_2_++) {
	    if (class525_sub10.anIntArray10507[i_2_] >= 0
		&& ((Class8) (Class313_Sub2.aClass40_Sub22_10106.method76
			      (class525_sub10.anIntArray10507[i_2_],
			       -1008880482))).anInt64 * 1533509829 == i_0_)
		i_1_ += Class210.method3922(i, i_2_, bool, -1179952119);
	}
	return i_1_;
    }
    
    static Class525_Sub10 method16156(int i, boolean bool) {
	long l = (long) (i | (bool ? -2147483648 : 0));
	return (Class525_Sub10) aClass10_10509.method684(l);
    }
    
    public static int method16157(int i, int i_3_, boolean bool) {
	Class525_Sub10 class525_sub10
	    = Class190.method3692(i, bool, (byte) 100);
	if (null == class525_sub10)
	    return 0;
	if (i_3_ < 0 || i_3_ >= class525_sub10.anIntArray10506.length)
	    return 0;
	return class525_sub10.anIntArray10506[i_3_];
    }
    
    static {
	aClass200_10505 = new Class200(11);
    }
    
    public static int method16158(int i, int i_4_, boolean bool) {
	Class525_Sub10 class525_sub10
	    = Class190.method3692(i, bool, (byte) 100);
	if (class525_sub10 == null)
	    return -1;
	if (i_4_ < 0 || i_4_ >= class525_sub10.anIntArray10507.length)
	    return -1;
	return class525_sub10.anIntArray10507[i_4_];
    }
    
    public static int method16159(int i, int i_5_, boolean bool) {
	Class525_Sub10 class525_sub10
	    = Class190.method3692(i, bool, (byte) 100);
	if (class525_sub10 == null)
	    return -1;
	if (i_5_ < 0 || i_5_ >= class525_sub10.anIntArray10507.length)
	    return -1;
	return class525_sub10.anIntArray10507[i_5_];
    }
    
    Class525_Sub10() {
	anIntArray10506 = new int[] { 0 };
	aClass9Array10508 = null;
    }
    
    public static int method16160(int i, int i_6_, boolean bool) {
	Class525_Sub10 class525_sub10
	    = Class190.method3692(i, bool, (byte) 100);
	if (null == class525_sub10)
	    return 0;
	if (i_6_ < 0 || i_6_ >= class525_sub10.anIntArray10506.length)
	    return 0;
	return class525_sub10.anIntArray10506[i_6_];
    }
    
    public static int method16161(int i, int i_7_, int i_8_, boolean bool) {
	Class322 class322
	    = ((Class322)
	       Class575.aClass40_Sub10_7647.method76(i_8_, 984894023));
	Class163 class163 = class322.aClass163_3544;
	Class525_Sub10 class525_sub10
	    = Class190.method3692(i, bool, (byte) 100);
	int i_9_;
	if (null == class525_sub10 || i_7_ < 0
	    || i_7_ >= class525_sub10.anIntArray10506.length
	    || null == class525_sub10.aClass9Array10508
	    || class525_sub10.aClass9Array10508[i_7_] == null)
	    i_9_ = ((Integer) class163.method2646(643922459)).intValue();
	else
	    i_9_ = class525_sub10.aClass9Array10508[i_7_]
		       .method26(class163.anInt1766 * 248546353, (byte) 83);
	return class322.method5722(i_9_, 350830169);
    }
    
    public static int method16162(int i, int i_10_, int i_11_, boolean bool) {
	Class322 class322
	    = ((Class322)
	       Class575.aClass40_Sub10_7647.method76(i_11_, 1027596981));
	Class163 class163 = class322.aClass163_3544;
	Class525_Sub10 class525_sub10
	    = Class190.method3692(i, bool, (byte) 100);
	int i_12_;
	if (null == class525_sub10 || i_10_ < 0
	    || i_10_ >= class525_sub10.anIntArray10506.length
	    || null == class525_sub10.aClass9Array10508
	    || class525_sub10.aClass9Array10508[i_10_] == null)
	    i_12_ = ((Integer) class163.method2646(1571734682)).intValue();
	else
	    i_12_ = class525_sub10.aClass9Array10508[i_10_]
			.method26(class163.anInt1766 * 248546353, (byte) 15);
	return class322.method5722(i_12_, -645980554);
    }
    
    public static int method16163(int i, int i_13_, boolean bool) {
	Class525_Sub10 class525_sub10
	    = Class190.method3692(i, bool, (byte) 100);
	if (class525_sub10 == null)
	    return 0;
	if (i_13_ == -1)
	    return 0;
	int i_14_ = 0;
	for (int i_15_ = 0; i_15_ < class525_sub10.anIntArray10506.length;
	     i_15_++) {
	    if (class525_sub10.anIntArray10507[i_15_] == i_13_)
		i_14_ += class525_sub10.anIntArray10506[i_15_];
	}
	return i_14_;
    }
    
    static void method16164() {
	aClass200_10505.method3791((byte) -52);
    }
    
    public static int method16165(int i, int i_16_, boolean bool) {
	Class525_Sub10 class525_sub10
	    = Class190.method3692(i, bool, (byte) 100);
	if (class525_sub10 == null)
	    return 0;
	if (i_16_ == -1)
	    return 0;
	int i_17_ = 0;
	for (int i_18_ = 0; i_18_ < class525_sub10.anIntArray10506.length;
	     i_18_++) {
	    if (class525_sub10.anIntArray10507[i_18_] == i_16_)
		i_17_ += class525_sub10.anIntArray10506[i_18_];
	}
	return i_17_;
    }
    
    public static int method16166(int i, int i_19_, boolean bool,
				  boolean bool_20_) {
	Class525_Sub10 class525_sub10
	    = Class190.method3692(i, bool_20_, (byte) 100);
	if (null == class525_sub10)
	    return 0;
	int i_21_ = 0;
	for (int i_22_ = 0; i_22_ < class525_sub10.anIntArray10507.length;
	     i_22_++) {
	    if (class525_sub10.anIntArray10507[i_22_] >= 0
		&& (class525_sub10.anIntArray10507[i_22_]
		    < (-1988422751
		       * Class313_Sub2.aClass40_Sub22_10106.anInt332))) {
		Class8 class8
		    = ((Class8)
		       (Class313_Sub2.aClass40_Sub22_10106.method76
			(class525_sub10.anIntArray10507[i_22_], 1673882042)));
		int i_23_
		    = class8.method629(i_19_,
				       (((Class88)
					 client.aClass40_Sub16_11201
					     .method76(i_19_, 2009529975))
					.anInt893) * 2053564367,
				       (byte) 89);
		if (bool)
		    i_21_ += i_23_ * class525_sub10.anIntArray10506[i_22_];
		else
		    i_21_ += i_23_;
	    }
	}
	return i_21_;
    }
    
    public static int method16167(int i, int i_24_, boolean bool) {
	int i_25_ = 0;
	Class525_Sub10 class525_sub10
	    = Class190.method3692(i, bool, (byte) 100);
	if (null == class525_sub10)
	    return 0;
	for (int i_26_ = 0; i_26_ < class525_sub10.anIntArray10507.length;
	     i_26_++) {
	    if (class525_sub10.anIntArray10507[i_26_] >= 0
		&& ((Class8) (Class313_Sub2.aClass40_Sub22_10106.method76
			      (class525_sub10.anIntArray10507[i_26_],
			       1549808126))).anInt64 * 1533509829 == i_24_)
		i_25_ += Class210.method3922(i, i_26_, bool, -1179952119);
	}
	return i_25_;
    }
    
    public static int method16168(int i, int i_27_, boolean bool) {
	Class525_Sub10 class525_sub10
	    = Class190.method3692(i, bool, (byte) 100);
	if (class525_sub10 == null)
	    return 0;
	if (i_27_ == -1)
	    return 0;
	int i_28_ = 0;
	for (int i_29_ = 0; i_29_ < class525_sub10.anIntArray10506.length;
	     i_29_++) {
	    if (class525_sub10.anIntArray10507[i_29_] == i_27_)
		i_28_ += class525_sub10.anIntArray10506[i_29_];
	}
	return i_28_;
    }
    
    public static int method16169(int i, int i_30_, boolean bool) {
	Class525_Sub10 class525_sub10
	    = Class190.method3692(i, bool, (byte) 100);
	if (class525_sub10 == null)
	    return 0;
	if (i_30_ == -1)
	    return 0;
	int i_31_ = 0;
	for (int i_32_ = 0; i_32_ < class525_sub10.anIntArray10506.length;
	     i_32_++) {
	    if (class525_sub10.anIntArray10507[i_32_] == i_30_)
		i_31_ += class525_sub10.anIntArray10506[i_32_];
	}
	return i_31_;
    }
    
    public static int method16170(int i, int i_33_, boolean bool,
				  boolean bool_34_) {
	Class525_Sub10 class525_sub10
	    = Class190.method3692(i, bool_34_, (byte) 100);
	if (null == class525_sub10)
	    return 0;
	int i_35_ = 0;
	for (int i_36_ = 0; i_36_ < class525_sub10.anIntArray10507.length;
	     i_36_++) {
	    if (class525_sub10.anIntArray10507[i_36_] >= 0
		&& (class525_sub10.anIntArray10507[i_36_]
		    < (-1988422751
		       * Class313_Sub2.aClass40_Sub22_10106.anInt332))) {
		Class8 class8
		    = ((Class8)
		       (Class313_Sub2.aClass40_Sub22_10106.method76
			(class525_sub10.anIntArray10507[i_36_], 1567475663)));
		int i_37_
		    = class8.method629(i_33_,
				       (((Class88)
					 client.aClass40_Sub16_11201
					     .method76(i_33_, -1409838831))
					.anInt893) * 2053564367,
				       (byte) 15);
		if (bool)
		    i_35_ += i_37_ * class525_sub10.anIntArray10506[i_36_];
		else
		    i_35_ += i_37_;
	    }
	}
	return i_35_;
    }
    
    public static int method16171(int i, int i_38_, boolean bool,
				  boolean bool_39_) {
	Class525_Sub10 class525_sub10
	    = Class190.method3692(i, bool_39_, (byte) 100);
	if (null == class525_sub10)
	    return 0;
	int i_40_ = 0;
	for (int i_41_ = 0; i_41_ < class525_sub10.anIntArray10507.length;
	     i_41_++) {
	    if (class525_sub10.anIntArray10507[i_41_] >= 0
		&& (class525_sub10.anIntArray10507[i_41_]
		    < (-1988422751
		       * Class313_Sub2.aClass40_Sub22_10106.anInt332))) {
		Class8 class8
		    = ((Class8)
		       (Class313_Sub2.aClass40_Sub22_10106.method76
			(class525_sub10.anIntArray10507[i_41_], 795477618)));
		int i_42_
		    = class8.method629(i_38_,
				       (((Class88)
					 client.aClass40_Sub16_11201
					     .method76(i_38_, 1401577042))
					.anInt893) * 2053564367,
				       (byte) 97);
		if (bool)
		    i_40_ += i_42_ * class525_sub10.anIntArray10506[i_41_];
		else
		    i_40_ += i_42_;
	    }
	}
	return i_40_;
    }
    
    long method16172(int[] is, int i, int[] is_43_, boolean bool) {
	long[] ls = RSBuffer.aLongArray10833;
	long l = -1L;
	l = l >>> 8 ^ ls[(int) ((l ^ (long) (i >> 8)) & 0xffL)];
	l = l >>> 8 ^ ls[(int) ((l ^ (long) i) & 0xffL)];
	for (int i_44_ = 0; i_44_ < is.length; i_44_++) {
	    l = l >>> 8 ^ ls[(int) ((l ^ (long) (is[i_44_] >> 24)) & 0xffL)];
	    l = l >>> 8 ^ ls[(int) ((l ^ (long) (is[i_44_] >> 16)) & 0xffL)];
	    l = l >>> 8 ^ ls[(int) ((l ^ (long) (is[i_44_] >> 8)) & 0xffL)];
	    l = l >>> 8 ^ ls[(int) ((l ^ (long) is[i_44_]) & 0xffL)];
	}
	if (null != is_43_) {
	    for (int i_45_ = 0; i_45_ < 5; i_45_++)
		l = l >>> 8 ^ ls[(int) ((l ^ (long) is_43_[i_45_]) & 0xffL)];
	}
	l = l >>> 8 ^ ls[(int) ((l ^ (long) (bool ? 1 : 0)) & 0xffL)];
	return l;
    }
    
    public static int method16173(int i, boolean bool) {
	if (bool)
	    return 0;
	Class525_Sub10 class525_sub10
	    = Class190.method3692(i, bool, (byte) 100);
	if (null == class525_sub10)
	    return ((((Class525_Sub16_Sub1)
		      Class612.aClass40_Sub19_8026.method76(i, -743865101))
		     .anInt11404)
		    * 785063537);
	int i_46_ = 0;
	for (int i_47_ = 0; i_47_ < class525_sub10.anIntArray10507.length;
	     i_47_++) {
	    if (class525_sub10.anIntArray10507[i_47_] == -1)
		i_46_++;
	}
	i_46_ += ((((Class525_Sub16_Sub1)
		    Class612.aClass40_Sub19_8026.method76(i, -596518525))
		   .anInt11404) * 785063537
		  - class525_sub10.anIntArray10507.length);
	return i_46_;
    }
    
    final Class179 method16174(Class182 class182, int i, Class689 class689,
			       int i_48_, boolean bool, Class637 class637,
			       short i_49_) {
	Class179 class179 = null;
	int i_50_ = i;
	Class586 class586 = null;
	if (-1 != i_48_)
	    class586
		= (Class586) Class227.aClass40_Sub1_2345.method76(i_48_,
								  -60892737);
	int[] is = anIntArray10507;
	if (class586 != null && null != class586.anIntArray7759) {
	    is = new int[class586.anIntArray7759.length];
	    for (int i_51_ = 0; i_51_ < class586.anIntArray7759.length;
		 i_51_++) {
		int i_52_ = class586.anIntArray7759[i_51_];
		if (i_52_ >= 0 && i_52_ < anIntArray10507.length)
		    is[i_51_] = anIntArray10507[i_52_];
		else
		    is[i_51_] = -1;
	    }
	}
	if (class689 != null)
	    i_50_ |= class689.method14033(-1504623359);
	long l = method16190(is, i_48_,
			     class637 != null ? class637.anIntArray8301 : null,
			     bool, (byte) -87);
	if (null != aClass200_10505)
	    class179 = (Class179) aClass200_10505.method3785(l);
	if (null == class179
	    || class182.method3321(class179.method2928(), i_50_) != 0) {
	    if (null != class179)
		i_50_ = class182.method3229(i_50_, class179.method2928());
	    int i_53_ = i_50_;
	    boolean bool_54_ = false;
	    for (int i_55_ = 0; i_55_ < is.length; i_55_++) {
		if (is[i_55_] != -1
		    && !((Class8) Class313_Sub2.aClass40_Sub22_10106
				      .method76(is[i_55_], 1332346874))
			    .method625(bool, null, 874069490))
		    bool_54_ = true;
	    }
	    if (bool_54_)
		return null;
	    Class186[] class186s = new Class186[is.length];
	    for (int i_56_ = 0; i_56_ < is.length; i_56_++) {
		if (is[i_56_] != -1)
		    class186s[i_56_]
			= ((Class8) Class313_Sub2.aClass40_Sub22_10106
					.method76(is[i_56_], -17876197))
			      .method653(bool, null, -1862849028);
	    }
	    if (null != class586 && null != class586.anIntArrayArray7755) {
		for (int i_57_ = 0;
		     i_57_ < class586.anIntArrayArray7755.length; i_57_++) {
		    if (class586.anIntArrayArray7755[i_57_] != null
			&& class186s[i_57_] != null) {
			int i_58_ = class586.anIntArrayArray7755[i_57_][0];
			int i_59_ = class586.anIntArrayArray7755[i_57_][1];
			int i_60_ = class586.anIntArrayArray7755[i_57_][2];
			int i_61_ = class586.anIntArrayArray7755[i_57_][3];
			int i_62_ = class586.anIntArrayArray7755[i_57_][4];
			int i_63_ = class586.anIntArrayArray7755[i_57_][5];
			if (i_61_ != 0 || i_62_ != 0 || i_63_ != 0)
			    class186s[i_57_].method3647(i_61_, i_62_, i_63_);
			if (i_58_ != 0 || i_59_ != 0 || 0 != i_60_)
			    class186s[i_57_].method3633(i_58_, i_59_, i_60_);
		    }
		}
	    }
	    Class186 class186 = new Class186(class186s, class186s.length);
	    if (class637 != null)
		i_53_ |= 0x4000;
	    class179
		= class182.method3556(class186, i_53_,
				      871561691 * Class496.anInt5543, 65, 855);
	    if (class637 != null) {
		for (int i_64_ = 0; i_64_ < 10; i_64_++) {
		    for (int i_65_ = 0;
			 (i_65_
			  < Class198_Sub18.aShortArrayArray9988[i_64_].length);
			 i_65_++) {
			if (class637.anIntArray8301[i_64_]
			    < (Class525_Sub6.aShortArrayArrayArray10485[i_64_]
			       [i_65_]).length)
			    class179.method2971((Class198_Sub18
						 .aShortArrayArray9988[i_64_]
						 [i_65_]),
						(Class525_Sub6
						 .aShortArrayArrayArray10485
						 [i_64_][i_65_]
						 [(class637.anIntArray8301
						   [i_64_])]));
		    }
		}
		for (int i_66_ = 0; i_66_ < 10; i_66_++) {
		    for (int i_67_ = 0;
			 i_67_ < Class477.aShortArrayArray5199[i_66_].length;
			 i_67_++) {
			if (class637.anIntArray8298[i_66_]
			    < (Class522_Sub1.aShortArrayArrayArray10395[i_66_]
			       [i_67_]).length)
			    class179.method2973((Class477.aShortArrayArray5199
						 [i_66_][i_67_]),
						(Class522_Sub1
						 .aShortArrayArrayArray10395
						 [i_66_][i_67_]
						 [(class637.anIntArray8298
						   [i_66_])]));
		    }
		}
	    }
	    if (aClass200_10505 != null) {
		class179.method3010(i_50_);
		aClass200_10505.method3788(class179, l);
	    }
	}
	if (null == class689)
	    return class179;
	Class179 class179_68_ = class179.method2926((byte) 1, i_50_, true);
	class689.method14034(class179_68_, 0, 1741833657);
	return class179_68_;
    }
    
    public static int method16175(int i, boolean bool) {
	if (bool)
	    return 0;
	Class525_Sub10 class525_sub10
	    = Class190.method3692(i, bool, (byte) 100);
	if (null == class525_sub10)
	    return ((((Class525_Sub16_Sub1)
		      Class612.aClass40_Sub19_8026.method76(i, 1660162583))
		     .anInt11404)
		    * 785063537);
	int i_69_ = 0;
	for (int i_70_ = 0; i_70_ < class525_sub10.anIntArray10507.length;
	     i_70_++) {
	    if (class525_sub10.anIntArray10507[i_70_] == -1)
		i_69_++;
	}
	i_69_ += ((((Class525_Sub16_Sub1)
		    Class612.aClass40_Sub19_8026.method76(i, -1059442068))
		   .anInt11404) * 785063537
		  - class525_sub10.anIntArray10507.length);
	return i_69_;
    }
    
    static Class525_Sub10 method16176(int i, boolean bool) {
	long l = (long) (i | (bool ? -2147483648 : 0));
	return (Class525_Sub10) aClass10_10509.method684(l);
    }
    
    static void method16177() {
	aClass10_10509.method688((short) 662);
    }
    
    static void method16178(int i, int i_71_, int i_72_, int i_73_,
			    Class9 class9, boolean bool) {
	long l = (long) (i | (bool ? -2147483648 : 0));
	Class525_Sub10 class525_sub10
	    = (Class525_Sub10) aClass10_10509.method684(l);
	if (null == class525_sub10) {
	    class525_sub10 = new Class525_Sub10();
	    aClass10_10509.method695(class525_sub10, l);
	}
	if (class525_sub10.anIntArray10507.length <= i_71_) {
	    int[] is = new int[i_71_ + 1];
	    int[] is_74_ = new int[i_71_ + 1];
	    Class9[] class9s = null;
	    if (null != class525_sub10.aClass9Array10508)
		class9s = new Class9[i_71_ + 1];
	    for (int i_75_ = 0; i_75_ < class525_sub10.anIntArray10507.length;
		 i_75_++) {
		is[i_75_] = class525_sub10.anIntArray10507[i_75_];
		is_74_[i_75_] = class525_sub10.anIntArray10506[i_75_];
		if (null != class525_sub10.aClass9Array10508)
		    class9s[i_75_] = class525_sub10.aClass9Array10508[i_75_];
	    }
	    for (int i_76_ = class525_sub10.anIntArray10507.length;
		 i_76_ < i_71_; i_76_++) {
		is[i_76_] = -1;
		is_74_[i_76_] = 0;
	    }
	    class525_sub10.anIntArray10507 = is;
	    class525_sub10.anIntArray10506 = is_74_;
	    class525_sub10.aClass9Array10508 = class9s;
	}
	class525_sub10.anIntArray10507[i_71_] = i_72_;
	class525_sub10.anIntArray10506[i_71_] = i_73_;
	if (class9 != null) {
	    if (null == class525_sub10.aClass9Array10508)
		class525_sub10.aClass9Array10508
		    = new Class9[class525_sub10.anIntArray10507.length];
	    class525_sub10.aClass9Array10508[i_71_] = class9;
	} else if (null != class525_sub10.aClass9Array10508)
	    class525_sub10.aClass9Array10508[i_71_] = null;
    }
    
    static void method16179(int i, boolean bool) {
	Class525_Sub10 class525_sub10
	    = Class190.method3692(i, bool, (byte) 100);
	if (class525_sub10 != null) {
	    for (int i_77_ = 0; i_77_ < class525_sub10.anIntArray10507.length;
		 i_77_++) {
		class525_sub10.anIntArray10507[i_77_] = -1;
		class525_sub10.anIntArray10506[i_77_] = 0;
	    }
	    class525_sub10.aClass9Array10508 = null;
	}
    }
    
    static void method16180(int i, boolean bool) {
	Class525_Sub10 class525_sub10
	    = Class190.method3692(i, bool, (byte) 100);
	if (null != class525_sub10)
	    class525_sub10.method8755(-1933461091);
    }
    
    static void method16181() {
	aClass10_10509.method688((short) 12873);
    }
    
    static void method16182() {
	aClass10_10509.method688((short) -17537);
    }
    
    public static int method16183(int i, int i_78_, boolean bool,
				  boolean bool_79_) {
	Class525_Sub10 class525_sub10
	    = Class190.method3692(i, bool_79_, (byte) 100);
	if (null == class525_sub10)
	    return 0;
	int i_80_ = 0;
	for (int i_81_ = 0; i_81_ < class525_sub10.anIntArray10507.length;
	     i_81_++) {
	    if (class525_sub10.anIntArray10507[i_81_] >= 0
		&& (class525_sub10.anIntArray10507[i_81_]
		    < (-1988422751
		       * Class313_Sub2.aClass40_Sub22_10106.anInt332))) {
		Class8 class8
		    = ((Class8)
		       (Class313_Sub2.aClass40_Sub22_10106.method76
			(class525_sub10.anIntArray10507[i_81_], -1792674005)));
		int i_82_
		    = class8.method629(i_78_,
				       (((Class88)
					 client.aClass40_Sub16_11201
					     .method76(i_78_, -112113156))
					.anInt893) * 2053564367,
				       (byte) 67);
		if (bool)
		    i_80_ += i_82_ * class525_sub10.anIntArray10506[i_81_];
		else
		    i_80_ += i_82_;
	    }
	}
	return i_80_;
    }
    
    long method16184(int[] is, int i, int[] is_83_, boolean bool) {
	long[] ls = RSBuffer.aLongArray10833;
	long l = -1L;
	l = l >>> 8 ^ ls[(int) ((l ^ (long) (i >> 8)) & 0xffL)];
	l = l >>> 8 ^ ls[(int) ((l ^ (long) i) & 0xffL)];
	for (int i_84_ = 0; i_84_ < is.length; i_84_++) {
	    l = l >>> 8 ^ ls[(int) ((l ^ (long) (is[i_84_] >> 24)) & 0xffL)];
	    l = l >>> 8 ^ ls[(int) ((l ^ (long) (is[i_84_] >> 16)) & 0xffL)];
	    l = l >>> 8 ^ ls[(int) ((l ^ (long) (is[i_84_] >> 8)) & 0xffL)];
	    l = l >>> 8 ^ ls[(int) ((l ^ (long) is[i_84_]) & 0xffL)];
	}
	if (null != is_83_) {
	    for (int i_85_ = 0; i_85_ < 5; i_85_++)
		l = l >>> 8 ^ ls[(int) ((l ^ (long) is_83_[i_85_]) & 0xffL)];
	}
	l = l >>> 8 ^ ls[(int) ((l ^ (long) (bool ? 1 : 0)) & 0xffL)];
	return l;
    }
    
    long method16185(int[] is, int i, int[] is_86_, boolean bool) {
	long[] ls = RSBuffer.aLongArray10833;
	long l = -1L;
	l = l >>> 8 ^ ls[(int) ((l ^ (long) (i >> 8)) & 0xffL)];
	l = l >>> 8 ^ ls[(int) ((l ^ (long) i) & 0xffL)];
	for (int i_87_ = 0; i_87_ < is.length; i_87_++) {
	    l = l >>> 8 ^ ls[(int) ((l ^ (long) (is[i_87_] >> 24)) & 0xffL)];
	    l = l >>> 8 ^ ls[(int) ((l ^ (long) (is[i_87_] >> 16)) & 0xffL)];
	    l = l >>> 8 ^ ls[(int) ((l ^ (long) (is[i_87_] >> 8)) & 0xffL)];
	    l = l >>> 8 ^ ls[(int) ((l ^ (long) is[i_87_]) & 0xffL)];
	}
	if (null != is_86_) {
	    for (int i_88_ = 0; i_88_ < 5; i_88_++)
		l = l >>> 8 ^ ls[(int) ((l ^ (long) is_86_[i_88_]) & 0xffL)];
	}
	l = l >>> 8 ^ ls[(int) ((l ^ (long) (bool ? 1 : 0)) & 0xffL)];
	return l;
    }
    
    long method16186(int[] is, int i, int[] is_89_, boolean bool) {
	long[] ls = RSBuffer.aLongArray10833;
	long l = -1L;
	l = l >>> 8 ^ ls[(int) ((l ^ (long) (i >> 8)) & 0xffL)];
	l = l >>> 8 ^ ls[(int) ((l ^ (long) i) & 0xffL)];
	for (int i_90_ = 0; i_90_ < is.length; i_90_++) {
	    l = l >>> 8 ^ ls[(int) ((l ^ (long) (is[i_90_] >> 24)) & 0xffL)];
	    l = l >>> 8 ^ ls[(int) ((l ^ (long) (is[i_90_] >> 16)) & 0xffL)];
	    l = l >>> 8 ^ ls[(int) ((l ^ (long) (is[i_90_] >> 8)) & 0xffL)];
	    l = l >>> 8 ^ ls[(int) ((l ^ (long) is[i_90_]) & 0xffL)];
	}
	if (null != is_89_) {
	    for (int i_91_ = 0; i_91_ < 5; i_91_++)
		l = l >>> 8 ^ ls[(int) ((l ^ (long) is_89_[i_91_]) & 0xffL)];
	}
	l = l >>> 8 ^ ls[(int) ((l ^ (long) (bool ? 1 : 0)) & 0xffL)];
	return l;
    }
    
    public static int method16187(int i, boolean bool) {
	if (bool)
	    return 0;
	Class525_Sub10 class525_sub10
	    = Class190.method3692(i, bool, (byte) 100);
	if (null == class525_sub10)
	    return ((((Class525_Sub16_Sub1)
		      Class612.aClass40_Sub19_8026.method76(i, 1889225123))
		     .anInt11404)
		    * 785063537);
	int i_92_ = 0;
	for (int i_93_ = 0; i_93_ < class525_sub10.anIntArray10507.length;
	     i_93_++) {
	    if (class525_sub10.anIntArray10507[i_93_] == -1)
		i_92_++;
	}
	i_92_ += ((((Class525_Sub16_Sub1)
		    Class612.aClass40_Sub19_8026.method76(i, 1037514466))
		   .anInt11404) * 785063537
		  - class525_sub10.anIntArray10507.length);
	return i_92_;
    }
    
    final Class179 method16188(Class182 class182, int i, Class689 class689,
			       int i_94_, boolean bool, Class637 class637) {
	Class179 class179 = null;
	int i_95_ = i;
	Class586 class586 = null;
	if (-1 != i_94_)
	    class586
		= (Class586) Class227.aClass40_Sub1_2345.method76(i_94_,
								  -1147747079);
	int[] is = anIntArray10507;
	if (class586 != null && null != class586.anIntArray7759) {
	    is = new int[class586.anIntArray7759.length];
	    for (int i_96_ = 0; i_96_ < class586.anIntArray7759.length;
		 i_96_++) {
		int i_97_ = class586.anIntArray7759[i_96_];
		if (i_97_ >= 0 && i_97_ < anIntArray10507.length)
		    is[i_96_] = anIntArray10507[i_97_];
		else
		    is[i_96_] = -1;
	    }
	}
	if (class689 != null)
	    i_95_ |= class689.method14033(397071982);
	long l = method16190(is, i_94_,
			     class637 != null ? class637.anIntArray8301 : null,
			     bool, (byte) -30);
	if (null != aClass200_10505)
	    class179 = (Class179) aClass200_10505.method3785(l);
	if (null == class179
	    || class182.method3321(class179.method2928(), i_95_) != 0) {
	    if (null != class179)
		i_95_ = class182.method3229(i_95_, class179.method2928());
	    int i_98_ = i_95_;
	    boolean bool_99_ = false;
	    for (int i_100_ = 0; i_100_ < is.length; i_100_++) {
		if (is[i_100_] != -1
		    && !((Class8) Class313_Sub2.aClass40_Sub22_10106
				      .method76(is[i_100_], 2141450875))
			    .method625(bool, null, -272958802))
		    bool_99_ = true;
	    }
	    if (bool_99_)
		return null;
	    Class186[] class186s = new Class186[is.length];
	    for (int i_101_ = 0; i_101_ < is.length; i_101_++) {
		if (is[i_101_] != -1)
		    class186s[i_101_]
			= ((Class8) Class313_Sub2.aClass40_Sub22_10106
					.method76(is[i_101_], -2048286249))
			      .method653(bool, null, -2037605924);
	    }
	    if (null != class586 && null != class586.anIntArrayArray7755) {
		for (int i_102_ = 0;
		     i_102_ < class586.anIntArrayArray7755.length; i_102_++) {
		    if (class586.anIntArrayArray7755[i_102_] != null
			&& class186s[i_102_] != null) {
			int i_103_ = class586.anIntArrayArray7755[i_102_][0];
			int i_104_ = class586.anIntArrayArray7755[i_102_][1];
			int i_105_ = class586.anIntArrayArray7755[i_102_][2];
			int i_106_ = class586.anIntArrayArray7755[i_102_][3];
			int i_107_ = class586.anIntArrayArray7755[i_102_][4];
			int i_108_ = class586.anIntArrayArray7755[i_102_][5];
			if (i_106_ != 0 || i_107_ != 0 || i_108_ != 0)
			    class186s[i_102_].method3647(i_106_, i_107_,
							 i_108_);
			if (i_103_ != 0 || i_104_ != 0 || 0 != i_105_)
			    class186s[i_102_].method3633(i_103_, i_104_,
							 i_105_);
		    }
		}
	    }
	    Class186 class186 = new Class186(class186s, class186s.length);
	    if (class637 != null)
		i_98_ |= 0x4000;
	    class179
		= class182.method3556(class186, i_98_,
				      871561691 * Class496.anInt5543, 65, 855);
	    if (class637 != null) {
		for (int i_109_ = 0; i_109_ < 10; i_109_++) {
		    for (int i_110_ = 0;
			 i_110_ < (Class198_Sub18.aShortArrayArray9988
				   [i_109_]).length;
			 i_110_++) {
			if (class637.anIntArray8301[i_109_]
			    < (Class525_Sub6.aShortArrayArrayArray10485[i_109_]
			       [i_110_]).length)
			    class179.method2971((Class198_Sub18
						 .aShortArrayArray9988[i_109_]
						 [i_110_]),
						(Class525_Sub6
						 .aShortArrayArrayArray10485
						 [i_109_][i_110_]
						 [(class637.anIntArray8301
						   [i_109_])]));
		    }
		}
		for (int i_111_ = 0; i_111_ < 10; i_111_++) {
		    for (int i_112_ = 0;
			 i_112_ < Class477.aShortArrayArray5199[i_111_].length;
			 i_112_++) {
			if (class637.anIntArray8298[i_111_]
			    < (Class522_Sub1.aShortArrayArrayArray10395[i_111_]
			       [i_112_]).length)
			    class179.method2973((Class477.aShortArrayArray5199
						 [i_111_][i_112_]),
						(Class522_Sub1
						 .aShortArrayArrayArray10395
						 [i_111_][i_112_]
						 [(class637.anIntArray8298
						   [i_111_])]));
		    }
		}
	    }
	    if (aClass200_10505 != null) {
		class179.method3010(i_95_);
		aClass200_10505.method3788(class179, l);
	    }
	}
	if (null == class689)
	    return class179;
	Class179 class179_113_ = class179.method2926((byte) 1, i_95_, true);
	class689.method14034(class179_113_, 0, 1543672673);
	return class179_113_;
    }
    
    final Class179 method16189(Class182 class182, int i, Class689 class689,
			       int i_114_, boolean bool, Class637 class637) {
	Class179 class179 = null;
	int i_115_ = i;
	Class586 class586 = null;
	if (-1 != i_114_)
	    class586
		= (Class586) Class227.aClass40_Sub1_2345.method76(i_114_,
								  -1592381703);
	int[] is = anIntArray10507;
	if (class586 != null && null != class586.anIntArray7759) {
	    is = new int[class586.anIntArray7759.length];
	    for (int i_116_ = 0; i_116_ < class586.anIntArray7759.length;
		 i_116_++) {
		int i_117_ = class586.anIntArray7759[i_116_];
		if (i_117_ >= 0 && i_117_ < anIntArray10507.length)
		    is[i_116_] = anIntArray10507[i_117_];
		else
		    is[i_116_] = -1;
	    }
	}
	if (class689 != null)
	    i_115_ |= class689.method14033(-735863957);
	long l = method16190(is, i_114_,
			     class637 != null ? class637.anIntArray8301 : null,
			     bool, (byte) 69);
	if (null != aClass200_10505)
	    class179 = (Class179) aClass200_10505.method3785(l);
	if (null == class179
	    || class182.method3321(class179.method2928(), i_115_) != 0) {
	    if (null != class179)
		i_115_ = class182.method3229(i_115_, class179.method2928());
	    int i_118_ = i_115_;
	    boolean bool_119_ = false;
	    for (int i_120_ = 0; i_120_ < is.length; i_120_++) {
		if (is[i_120_] != -1
		    && !((Class8) Class313_Sub2.aClass40_Sub22_10106
				      .method76(is[i_120_], -988395844))
			    .method625(bool, null, 1576594148))
		    bool_119_ = true;
	    }
	    if (bool_119_)
		return null;
	    Class186[] class186s = new Class186[is.length];
	    for (int i_121_ = 0; i_121_ < is.length; i_121_++) {
		if (is[i_121_] != -1)
		    class186s[i_121_]
			= ((Class8) Class313_Sub2.aClass40_Sub22_10106
					.method76(is[i_121_], 239409523))
			      .method653(bool, null, -1974203214);
	    }
	    if (null != class586 && null != class586.anIntArrayArray7755) {
		for (int i_122_ = 0;
		     i_122_ < class586.anIntArrayArray7755.length; i_122_++) {
		    if (class586.anIntArrayArray7755[i_122_] != null
			&& class186s[i_122_] != null) {
			int i_123_ = class586.anIntArrayArray7755[i_122_][0];
			int i_124_ = class586.anIntArrayArray7755[i_122_][1];
			int i_125_ = class586.anIntArrayArray7755[i_122_][2];
			int i_126_ = class586.anIntArrayArray7755[i_122_][3];
			int i_127_ = class586.anIntArrayArray7755[i_122_][4];
			int i_128_ = class586.anIntArrayArray7755[i_122_][5];
			if (i_126_ != 0 || i_127_ != 0 || i_128_ != 0)
			    class186s[i_122_].method3647(i_126_, i_127_,
							 i_128_);
			if (i_123_ != 0 || i_124_ != 0 || 0 != i_125_)
			    class186s[i_122_].method3633(i_123_, i_124_,
							 i_125_);
		    }
		}
	    }
	    Class186 class186 = new Class186(class186s, class186s.length);
	    if (class637 != null)
		i_118_ |= 0x4000;
	    class179
		= class182.method3556(class186, i_118_,
				      871561691 * Class496.anInt5543, 65, 855);
	    if (class637 != null) {
		for (int i_129_ = 0; i_129_ < 10; i_129_++) {
		    for (int i_130_ = 0;
			 i_130_ < (Class198_Sub18.aShortArrayArray9988
				   [i_129_]).length;
			 i_130_++) {
			if (class637.anIntArray8301[i_129_]
			    < (Class525_Sub6.aShortArrayArrayArray10485[i_129_]
			       [i_130_]).length)
			    class179.method2971((Class198_Sub18
						 .aShortArrayArray9988[i_129_]
						 [i_130_]),
						(Class525_Sub6
						 .aShortArrayArrayArray10485
						 [i_129_][i_130_]
						 [(class637.anIntArray8301
						   [i_129_])]));
		    }
		}
		for (int i_131_ = 0; i_131_ < 10; i_131_++) {
		    for (int i_132_ = 0;
			 i_132_ < Class477.aShortArrayArray5199[i_131_].length;
			 i_132_++) {
			if (class637.anIntArray8298[i_131_]
			    < (Class522_Sub1.aShortArrayArrayArray10395[i_131_]
			       [i_132_]).length)
			    class179.method2973((Class477.aShortArrayArray5199
						 [i_131_][i_132_]),
						(Class522_Sub1
						 .aShortArrayArrayArray10395
						 [i_131_][i_132_]
						 [(class637.anIntArray8298
						   [i_131_])]));
		    }
		}
	    }
	    if (aClass200_10505 != null) {
		class179.method3010(i_115_);
		aClass200_10505.method3788(class179, l);
	    }
	}
	if (null == class689)
	    return class179;
	Class179 class179_133_ = class179.method2926((byte) 1, i_115_, true);
	class689.method14034(class179_133_, 0, 1926838783);
	return class179_133_;
    }
    
    long method16190(int[] is, int i, int[] is_134_, boolean bool,
		     byte i_135_) {
	long[] ls = RSBuffer.aLongArray10833;
	long l = -1L;
	l = l >>> 8 ^ ls[(int) ((l ^ (long) (i >> 8)) & 0xffL)];
	l = l >>> 8 ^ ls[(int) ((l ^ (long) i) & 0xffL)];
	for (int i_136_ = 0; i_136_ < is.length; i_136_++) {
	    l = l >>> 8 ^ ls[(int) ((l ^ (long) (is[i_136_] >> 24)) & 0xffL)];
	    l = l >>> 8 ^ ls[(int) ((l ^ (long) (is[i_136_] >> 16)) & 0xffL)];
	    l = l >>> 8 ^ ls[(int) ((l ^ (long) (is[i_136_] >> 8)) & 0xffL)];
	    l = l >>> 8 ^ ls[(int) ((l ^ (long) is[i_136_]) & 0xffL)];
	}
	if (null != is_134_) {
	    for (int i_137_ = 0; i_137_ < 5; i_137_++)
		l = l >>> 8 ^ ls[(int) ((l ^ (long) is_134_[i_137_]) & 0xffL)];
	}
	l = l >>> 8 ^ ls[(int) ((l ^ (long) (bool ? 1 : 0)) & 0xffL)];
	return l;
    }
    
    static void method16191(int i) {
	Class496.anInt5543 = -2017043885 * i;
	aClass200_10505.method3791((byte) -46);
    }
    
    static void method16192(int i) {
	Class496.anInt5543 = -2017043885 * i;
	aClass200_10505.method3791((byte) 110);
    }
    
    static void method16193(int i) {
	Class496.anInt5543 = -2017043885 * i;
	aClass200_10505.method3791((byte) -79);
    }
    
    static void method16194(int i) {
	Class496.anInt5543 = -2017043885 * i;
	aClass200_10505.method3791((byte) -4);
    }
    
    final Class179 method16195(Class182 class182, int i, Class689 class689,
			       int i_138_, boolean bool, Class637 class637) {
	Class179 class179 = null;
	int i_139_ = i;
	Class586 class586 = null;
	if (-1 != i_138_)
	    class586
		= (Class586) Class227.aClass40_Sub1_2345.method76(i_138_,
								  -333807941);
	int[] is = anIntArray10507;
	if (class586 != null && null != class586.anIntArray7759) {
	    is = new int[class586.anIntArray7759.length];
	    for (int i_140_ = 0; i_140_ < class586.anIntArray7759.length;
		 i_140_++) {
		int i_141_ = class586.anIntArray7759[i_140_];
		if (i_141_ >= 0 && i_141_ < anIntArray10507.length)
		    is[i_140_] = anIntArray10507[i_141_];
		else
		    is[i_140_] = -1;
	    }
	}
	if (class689 != null)
	    i_139_ |= class689.method14033(620042926);
	long l = method16190(is, i_138_,
			     class637 != null ? class637.anIntArray8301 : null,
			     bool, (byte) -66);
	if (null != aClass200_10505)
	    class179 = (Class179) aClass200_10505.method3785(l);
	if (null == class179
	    || class182.method3321(class179.method2928(), i_139_) != 0) {
	    if (null != class179)
		i_139_ = class182.method3229(i_139_, class179.method2928());
	    int i_142_ = i_139_;
	    boolean bool_143_ = false;
	    for (int i_144_ = 0; i_144_ < is.length; i_144_++) {
		if (is[i_144_] != -1
		    && !((Class8) Class313_Sub2.aClass40_Sub22_10106
				      .method76(is[i_144_], 258848294))
			    .method625(bool, null, 991616703))
		    bool_143_ = true;
	    }
	    if (bool_143_)
		return null;
	    Class186[] class186s = new Class186[is.length];
	    for (int i_145_ = 0; i_145_ < is.length; i_145_++) {
		if (is[i_145_] != -1)
		    class186s[i_145_]
			= ((Class8) Class313_Sub2.aClass40_Sub22_10106
					.method76(is[i_145_], -2075301506))
			      .method653(bool, null, -2078657527);
	    }
	    if (null != class586 && null != class586.anIntArrayArray7755) {
		for (int i_146_ = 0;
		     i_146_ < class586.anIntArrayArray7755.length; i_146_++) {
		    if (class586.anIntArrayArray7755[i_146_] != null
			&& class186s[i_146_] != null) {
			int i_147_ = class586.anIntArrayArray7755[i_146_][0];
			int i_148_ = class586.anIntArrayArray7755[i_146_][1];
			int i_149_ = class586.anIntArrayArray7755[i_146_][2];
			int i_150_ = class586.anIntArrayArray7755[i_146_][3];
			int i_151_ = class586.anIntArrayArray7755[i_146_][4];
			int i_152_ = class586.anIntArrayArray7755[i_146_][5];
			if (i_150_ != 0 || i_151_ != 0 || i_152_ != 0)
			    class186s[i_146_].method3647(i_150_, i_151_,
							 i_152_);
			if (i_147_ != 0 || i_148_ != 0 || 0 != i_149_)
			    class186s[i_146_].method3633(i_147_, i_148_,
							 i_149_);
		    }
		}
	    }
	    Class186 class186 = new Class186(class186s, class186s.length);
	    if (class637 != null)
		i_142_ |= 0x4000;
	    class179
		= class182.method3556(class186, i_142_,
				      871561691 * Class496.anInt5543, 65, 855);
	    if (class637 != null) {
		for (int i_153_ = 0; i_153_ < 10; i_153_++) {
		    for (int i_154_ = 0;
			 i_154_ < (Class198_Sub18.aShortArrayArray9988
				   [i_153_]).length;
			 i_154_++) {
			if (class637.anIntArray8301[i_153_]
			    < (Class525_Sub6.aShortArrayArrayArray10485[i_153_]
			       [i_154_]).length)
			    class179.method2971((Class198_Sub18
						 .aShortArrayArray9988[i_153_]
						 [i_154_]),
						(Class525_Sub6
						 .aShortArrayArrayArray10485
						 [i_153_][i_154_]
						 [(class637.anIntArray8301
						   [i_153_])]));
		    }
		}
		for (int i_155_ = 0; i_155_ < 10; i_155_++) {
		    for (int i_156_ = 0;
			 i_156_ < Class477.aShortArrayArray5199[i_155_].length;
			 i_156_++) {
			if (class637.anIntArray8298[i_155_]
			    < (Class522_Sub1.aShortArrayArrayArray10395[i_155_]
			       [i_156_]).length)
			    class179.method2973((Class477.aShortArrayArray5199
						 [i_155_][i_156_]),
						(Class522_Sub1
						 .aShortArrayArrayArray10395
						 [i_155_][i_156_]
						 [(class637.anIntArray8298
						   [i_155_])]));
		    }
		}
	    }
	    if (aClass200_10505 != null) {
		class179.method3010(i_139_);
		aClass200_10505.method3788(class179, l);
	    }
	}
	if (null == class689)
	    return class179;
	Class179 class179_157_ = class179.method2926((byte) 1, i_139_, true);
	class689.method14034(class179_157_, 0, 1897480762);
	return class179_157_;
    }
    
    static final void method16196(int i, int i_158_, int i_159_, int i_160_,
				  byte i_161_) {
	Class448.method7321(Class501.aClass182_5564, -1443282648);
	Class696_Sub1.method16897(i, i_158_, i_159_, i_160_, 256, 256,
				  463921042);
	Class658.method10876(i, i_158_, i_159_, i_160_, 256, 256, (byte) -15);
	Class11.method714(i, i_158_, i_159_, i_160_, 256, 256, 1806233612);
	Class646.method10693(i, i_158_, i_159_, i_160_, (short) 341);
    }
}
