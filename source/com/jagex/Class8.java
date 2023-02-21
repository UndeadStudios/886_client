/* Class8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Arrays;

public class Class8 implements Interface12
{
    Class17 aClass17_55;
    public int anInt56;
    public static final int anInt57 = 2;
    static final int anInt58 = 6;
    public int anInt59;
    public int anInt60;
    Interface13 anInterface13_61;
    int anInt62;
    int anInt63;
    public int anInt64 = 1413480947;
    int anInt65;
    public String aString66 = "null";
    short[] aShortArray67;
    short[] aShortArray68;
    public int[] anIntArray69;
    short[] aShortArray70;
    short[] aShortArray71;
    public int anInt72;
    public int anInt73;
    public int anInt74 = 1859439984;
    public int anInt75 = 0;
    int anInt76;
    public int anInt77;
    int anInt78;
    public static final int anInt79 = 0;
    public boolean aBool80;
    public int anInt81 = 0;
    int anInt82;
    public boolean aBool83;
    public String[] aStringArray84;
    public String[] aStringArray85;
    int[] anIntArray86;
    int[] anIntArray87;
    public int anInt88;
    static String aString89;
    public boolean aBool90;
    int anInt91;
    public int anInt92 = 0;
    int anInt93;
    int anInt94;
    public int anInt95;
    public static short[] aShortArray96 = new short[256];
    int anInt97;
    public int anInt98;
    public int anInt99;
    int anInt100;
    int anInt101;
    int anInt102;
    int anInt103;
    int anInt104;
    int anInt105;
    int anInt106;
    int[] anIntArray107;
    int[] anIntArray108;
    int anInt109;
    byte[] aByteArray110;
    int anInt111;
    public int anInt112;
    public int anInt113;
    public int anInt114;
    String aString115;
    public int anInt116;
    byte[] aByteArray117;
    int anInt118;
    int anInt119;
    int anInt120;
    int anInt121;
    int anInt122;
    public boolean aBool123;
    byte[] aByteArray124;
    boolean aBool125;
    public int anInt126;
    Class10 aClass10_127;
    public int anInt128 = 0;
    public int anInt129;
    static final int anInt130 = 5;
    public int anInt131;
    public static final int anInt132 = 1;
    public int anInt133;
    public boolean aBool134;
    int anInt135;
    public static Class458 aClass458_136;
    static int anInt137;
    
    static String method611(int i, Class666 class666, Class631 class631) {
	if (i < 100000)
	    return new StringBuilder().append
		       (Class459.method7583(1746106145 * class631.anInt8193,
					    (byte) -16))
		       .append
		       (i).append
		       (aString89).toString();
	if (i < 10000000)
	    return new StringBuilder().append
		       (Class459.method7583(class631.anInt8194 * -1075664863,
					    (byte) -86))
		       .append
		       (i / 1000).append
		       (Class53.aClass53_524.method1169(class666, 1552651121))
		       .append
		       (aString89).toString();
	return new StringBuilder().append
		   (Class459.method7583(class631.anInt8173 * -266050813,
					(byte) -74))
		   .append
		   (i / 1000000).append
		   (Class53.aClass53_546.method1169(class666, 1552651121))
		   .append
		   (aString89).toString();
    }
    
    public final Class186 method612(boolean bool, Class2 class2) {
	int i;
	int i_0_;
	if (bool) {
	    if (null != class2 && class2.anIntArray23 != null) {
		i = class2.anIntArray23[0];
		i_0_ = class2.anIntArray23[1];
	    } else {
		i = 1522045387 * anInt105;
		i_0_ = anInt106 * -769283651;
	    }
	} else if (null != class2 && null != class2.anIntArray15) {
	    i = class2.anIntArray15[0];
	    i_0_ = class2.anIntArray15[1];
	} else {
	    i = anInt103 * 1730663877;
	    i_0_ = -252626025 * anInt104;
	}
	if (-1 == i)
	    return null;
	Class186 class186
	    = Class186.method3644(aClass17_55.aClass458_191, i, 0);
	if (class186.anInt2086 < 13)
	    class186.method3651(2);
	if (i_0_ != -1) {
	    Class186 class186_1_
		= Class186.method3644(aClass17_55.aClass458_191, i_0_, 0);
	    if (class186_1_.anInt2086 < 13)
		class186_1_.method3651(2);
	    Class186[] class186s = { class186, class186_1_ };
	    class186 = new Class186(class186s, 2);
	}
	if (aShortArray67 != null) {
	    short[] is;
	    if (null != class2 && null != class2.aShortArray24)
		is = class2.aShortArray24;
	    else
		is = aShortArray68;
	    for (int i_2_ = 0; i_2_ < aShortArray67.length; i_2_++)
		class186.method3631(aShortArray67[i_2_], is[i_2_]);
	}
	if (aShortArray70 != null) {
	    short[] is;
	    if (null != class2 && class2.aShortArray21 != null)
		is = class2.aShortArray21;
	    else
		is = aShortArray71;
	    for (int i_3_ = 0; i_3_ < aShortArray70.length; i_3_++)
		class186.method3632(aShortArray70[i_3_], is[i_3_]);
	}
	return class186;
    }
    
    void method613(Class8 class8_4_, Class8 class8_5_, Class666 class666) {
	method663(Class22.aClass22_215, class8_4_, class8_5_,
		  Class53.aClass53_388, class666, -1027368908);
    }
    
    public int method614(int i) {
	if (anIntArray86 == null)
	    return -1;
	return anIntArray86[i];
    }
    
    void method615(Class8 class8_6_, Class8 class8_7_, Class666 class666) {
	method663(Class22.aClass22_216, class8_6_, class8_7_, null, class666,
		  1083579378);
    }
    
    public final Class179 method616(Class182 class182, int i, int i_8_,
				    Class637 class637, Class689 class689,
				    int i_9_, int i_10_, int i_11_, int i_12_,
				    int i_13_) {
	if (null != anIntArray107 && i_8_ > 1) {
	    int i_14_ = -1;
	    for (int i_15_ = 0; i_15_ < 10; i_15_++) {
		if (i_8_ >= anIntArray108[i_15_] && anIntArray108[i_15_] != 0)
		    i_14_ = anIntArray107[i_15_];
	    }
	    if (i_14_ != -1)
		return (((Class8) anInterface13_61.method76(i_14_, -807929266))
			    .method616
			(class182, i, 1, class637, class689, i_9_, i_10_,
			 i_11_, i_12_, -1934522739));
	}
	int i_16_ = i;
	if (null != class689)
	    i_16_ |= class689.method14033(885689975);
	Class179 class179;
	synchronized (aClass17_55.aClass200_197) {
	    class179 = ((Class179)
			(aClass17_55.aClass200_197.method3785
			 ((long) (1736248109 * anInt63
				  | -2117565327 * class182.anInt1942 << 29))));
	}
	if (null == class179
	    || class182.method3321(class179.method2928(), i_16_) != 0) {
	    if (null != class179)
		i_16_ = class182.method3229(i_16_, class179.method2928());
	    int i_17_ = i_16_;
	    if (aShortArray70 != null)
		i_17_ |= 0x8000;
	    if (null != aShortArray67 || null != class637)
		i_17_ |= 0x4000;
	    if (anInt122 * -311590649 != 128)
		i_17_ |= 0x1;
	    if (anInt118 * -207729681 != 128)
		i_17_ |= 0x2;
	    if (128 != -994464071 * anInt119)
		i_17_ |= 0x4;
	    Class186 class186 = Class186.method3644(aClass17_55.aClass458_191,
						    -1870434119 * anInt65, 0);
	    if (null == class186)
		return null;
	    if (class186.anInt2086 < 13)
		class186.method3651(2);
	    class179 = class182.method3556(class186, i_17_,
					   1509051035 * aClass17_55.anInt196,
					   64 + anInt120 * -358510299,
					   850 + anInt121 * 1692172521);
	    if (anInt122 * -311590649 != 128 || -207729681 * anInt118 != 128
		|| 128 != anInt119 * -994464071)
		class179.method2936(-311590649 * anInt122,
				    anInt118 * -207729681,
				    anInt119 * -994464071);
	    if (null != aShortArray67) {
		for (int i_18_ = 0; i_18_ < aShortArray67.length; i_18_++) {
		    if (aByteArray117 != null && i_18_ < aByteArray117.length)
			class179.method2971(aShortArray67[i_18_],
					    (aShortArray96
					     [aByteArray117[i_18_] & 0xff]));
		    else
			class179.method2971(aShortArray67[i_18_],
					    aShortArray68[i_18_]);
		}
	    }
	    if (null != aShortArray70) {
		for (int i_19_ = 0; i_19_ < aShortArray70.length; i_19_++)
		    class179.method2973(aShortArray70[i_19_],
					aShortArray71[i_19_]);
	    }
	    if (null != class637) {
		for (int i_20_ = 0; i_20_ < 10; i_20_++) {
		    for (int i_21_ = 0;
			 (i_21_
			  < Class198_Sub18.aShortArrayArray9988[i_20_].length);
			 i_21_++) {
			if (class637.anIntArray8301[i_20_]
			    < (Class525_Sub6.aShortArrayArrayArray10485[i_20_]
			       [i_21_]).length)
			    class179.method2971((Class198_Sub18
						 .aShortArrayArray9988[i_20_]
						 [i_21_]),
						(Class525_Sub6
						 .aShortArrayArrayArray10485
						 [i_20_][i_21_]
						 [(class637.anIntArray8301
						   [i_20_])]));
		    }
		}
		for (int i_22_ = 0; i_22_ < 10; i_22_++) {
		    for (int i_23_ = 0;
			 i_23_ < Class477.aShortArrayArray5199[i_22_].length;
			 i_23_++) {
			if (class637.anIntArray8298[i_22_]
			    < (Class522_Sub1.aShortArrayArrayArray10395[i_22_]
			       [i_23_]).length)
			    class179.method2973((Class477.aShortArrayArray5199
						 [i_22_][i_23_]),
						(Class522_Sub1
						 .aShortArrayArrayArray10395
						 [i_22_][i_23_]
						 [(class637.anIntArray8298
						   [i_22_])]));
		    }
		}
	    }
	    class179.method3010(i_16_);
	    synchronized (aClass17_55.aClass200_197) {
		aClass17_55.aClass200_197.method3788
		    (class179,
		     (long) (1736248109 * anInt63
			     | class182.anInt1942 * -2117565327 << 29));
	    }
	}
	if (null != class689 || i_12_ != 0) {
	    class179 = class179.method2926((byte) 1, i_16_, true);
	    if (class689 != null)
		class689.method14034(class179, 0, 1888060788);
	    if (0 != i_12_)
		class179.method2974(i_9_, i_10_, i_11_, i_12_);
	}
	class179.method3010(i);
	return class179;
    }
    
    void method617(Class8 class8_24_, Class8 class8_25_, Class666 class666,
		   int i) {
	method663(Class22.aClass22_215, class8_24_, class8_25_,
		  Class53.aClass53_388, class666, -724461272);
    }
    
    void method618(Class8 class8_26_, Class8 class8_27_, Class666 class666,
		   int i) {
	method663(Class22.aClass22_214, class8_26_, class8_27_,
		  Class53.aClass53_384, class666, -192780125);
    }
    
    void method619(Class8 class8_28_, Class8 class8_29_, Class666 class666,
		   short i) {
	method663(Class22.aClass22_217, class8_28_, class8_29_,
		  Class53.aClass53_549, class666, 1849363444);
    }
    
    public int method620(int i, int i_30_) {
	if (aClass10_127 == null)
	    return i_30_;
	Class525_Sub42 class525_sub42
	    = (Class525_Sub42) aClass10_127.method684((long) i);
	if (null == class525_sub42)
	    return i_30_;
	return -1344652871 * class525_sub42.anInt10858;
    }
    
    public int method621(int i) {
	if (null == anIntArray87)
	    return -1;
	return anIntArray87[i];
    }
    
    int[] method622(Class182 class182, Class182 class182_31_, int i, int i_32_,
		    int i_33_, boolean bool, int i_34_, Class175 class175,
		    Class637 class637, Class631 class631, int i_35_) {
	Class186 class186 = Class186.method3644(aClass17_55.aClass458_191,
						anInt65 * -1870434119, 0);
	if (null == class186)
	    return null;
	if (class186.anInt2086 < 13)
	    class186.method3651(2);
	if (aShortArray67 != null) {
	    for (int i_36_ = 0; i_36_ < aShortArray67.length; i_36_++) {
		if (aByteArray117 != null && i_36_ < aByteArray117.length)
		    class186.method3631(aShortArray67[i_36_],
					(aShortArray96
					 [aByteArray117[i_36_] & 0xff]));
		else
		    class186.method3631(aShortArray67[i_36_],
					aShortArray68[i_36_]);
	    }
	}
	if (null != aShortArray70) {
	    for (int i_37_ = 0; i_37_ < aShortArray70.length; i_37_++)
		class186.method3632(aShortArray70[i_37_],
				    aShortArray71[i_37_]);
	}
	if (null != class637) {
	    for (int i_38_ = 0; i_38_ < 10; i_38_++) {
		for (int i_39_ = 0;
		     i_39_ < Class198_Sub18.aShortArrayArray9988[i_38_].length;
		     i_39_++) {
		    if (class637.anIntArray8301[i_38_]
			< (Class525_Sub6.aShortArrayArrayArray10485[i_38_]
			   [i_39_]).length)
			class186.method3631
			    (Class198_Sub18.aShortArrayArray9988[i_38_][i_39_],
			     (Class525_Sub6.aShortArrayArrayArray10485[i_38_]
			      [i_39_][class637.anIntArray8301[i_38_]]));
		}
	    }
	    for (int i_40_ = 0; i_40_ < 10; i_40_++) {
		for (int i_41_ = 0;
		     i_41_ < Class477.aShortArrayArray5199[i_40_].length;
		     i_41_++) {
		    if (class637.anIntArray8298[i_40_]
			< (Class522_Sub1.aShortArrayArrayArray10395[i_40_]
			   [i_41_]).length)
			class186.method3632
			    (Class477.aShortArrayArray5199[i_40_][i_41_],
			     (Class522_Sub1.aShortArrayArrayArray10395[i_40_]
			      [i_41_][class637.anIntArray8298[i_40_]]));
		}
	    }
	}
	int i_42_ = 2048;
	boolean bool_43_ = false;
	if (128 != -311590649 * anInt122 || -207729681 * anInt118 != 128
	    || 128 != -994464071 * anInt119) {
	    bool_43_ = true;
	    i_42_ |= 0x7;
	}
	Class179 class179 = class182.method3556(class186, i_42_, 64,
						64 + anInt120 * -358510299,
						768 + anInt121 * 1692172521);
	if (!class179.method2924())
	    return null;
	if (bool_43_)
	    class179.method2936(anInt122 * -311590649, anInt118 * -207729681,
				-994464071 * anInt119);
	Class157 class157 = null;
	if (-1 != -1095552769 * anInt77) {
	    class157
		= aClass17_55.method787(class182, class182_31_,
					-1210387357 * anInt59, 10, 1, 0, true,
					true, 0, class175, class637, class631,
					anInterface13_61, -1187651446);
	    if (null == class157)
		return null;
	} else if (-1 != 2020962253 * anInt98) {
	    class157 = aClass17_55.method787(class182, class182_31_,
					     1088959965 * anInt111, i, i_32_,
					     i_33_, false, true, 0, class175,
					     class637, class631,
					     anInterface13_61, -1187651446);
	    if (class157 == null)
		return null;
	} else if (1860754759 * anInt131 != -1) {
	    class157 = aClass17_55.method787(class182, class182_31_,
					     45619687 * anInt135, i, i_32_,
					     i_33_, false, true, 0, class175,
					     class637, class631,
					     anInterface13_61, -1187651446);
	    if (class157 == null)
		return null;
	} else if (-1 != anInt114 * 195314511) {
	    class157
		= aClass17_55.method787(class182, class182_31_,
					593405105 * anInt113, 10, 1, 0, true,
					true, 0, class175, class637, class631,
					anInterface13_61, -1187651446);
	    if (class157 == null)
		return null;
	}
	int i_44_;
	if (bool)
	    i_44_ = (int) ((double) (-1048035637 * anInt74) * 1.5) << 2;
	else if (2 == i_32_)
	    i_44_ = (int) (1.04 * (double) (anInt74 * -1048035637)) << 2;
	else
	    i_44_ = anInt74 * -1048035637 << 2;
	Class435 class435 = class182.method3237();
	Class435 class435_45_ = class182.method3224();
	class435_45_.method6963(16.0F, 16.0F, 512.0F, 512.0F, 50.0F,
				2.14748365E9F,
				(float) class182.method3566(-1531053032)
					    .method2710(),
				(float) class182.method3566(-281749615)
					    .method2711());
	class182.method3252(class435_45_);
	class182.method3277(0, 0,
			    class182.method3566(-1579125475).method2710(),
			    class182.method3566(-1160144518).method2711());
	Class444 class444 = new Class444();
	class182.method3233(class444);
	class182.method3351(0.95F + (float) (Math.random() / 10.0));
	class182.method3307(16777215, 0.95F + (float) (Math.random() / 10.0),
			    0.95F + (float) (Math.random() / 10.0), -50.0F,
			    -10.0F, -50.0F);
	Class444 class444_46_ = class182.method3225();
	class444_46_.method7141(0.0F, 0.0F, 1.0F,
				Class436
				    .method7071(-(anInt92 * 968302009) << 3));
	class444_46_.method7142(0.0F, 1.0F, 0.0F,
				Class436.method7071(795105987 * anInt81 << 3));
	class444_46_.method7147((float) (-905924017 * anInt128 << 2),
				(float) (((i_44_
					   * (Class436.anIntArray4831
					      [anInt75 * -1891985835 << 3]))
					  >> 14)
					 - class179.method2960() / 2
					 + (-1874228003 * anInt95 << 2)),
				(float) ((anInt95 * -1874228003 << 2)
					 + ((i_44_
					     * (Class436.anIntArray4838
						[anInt75 * -1891985835 << 3]))
					    >> 14)));
	class444_46_.method7142(1.0F, 0.0F, 0.0F,
				Class436
				    .method7071(-1891985835 * anInt75 << 3));
	class182.method3184(0, 0, 36, 32);
	class182.method3188(2, 0);
	class182.method3151(0, 0, 36, 32, 0, 0);
	class182.method3140(0, -1, 0);
	class179.method2953(class444_46_, null, 1);
	class182.method3252(class435);
	int[] is = class182.method3165(0, 0, 36, 32);
	if (i_32_ >= 1) {
	    is = method623(is, -16777214, -872339982);
	    if (i_32_ >= 2)
		is = method623(is, -1, -1792510524);
	}
	if (i_33_ != 0)
	    method624(is, i_33_, 1389111970);
	if (-1 != 2020962253 * anInt98)
	    class157.method2518(0, 0);
	else if (anInt131 * 1860754759 != -1)
	    class157.method2518(0, 0);
	class182.method3215(is, 0, 36, 36, 32, (byte) 106).method2518(0, 0);
	if (anInt77 * -1095552769 != -1)
	    class157.method2518(0, 0);
	if (-1 != 195314511 * anInt114)
	    class157.method2518(0, 0);
	if (1 == i_34_
	    || i_34_ == 2 && (anInt56 * 1051584679 == 1 || i != 1) && i != -1)
	    class175.method2851(Class272.method5026(i,
						    aClass17_55.aClass666_198,
						    class631, 711179182),
				0, 9, -256, -16777215, 5445315);
	is = class182.method3165(0, 0, 36, 32);
	for (int i_47_ = 0; i_47_ < is.length; i_47_++) {
	    if ((is[i_47_] & 0xffffff) == 0)
		is[i_47_] = 0;
	    else
		is[i_47_] |= ~0xffffff;
	}
	return is;
    }
    
    int[] method623(int[] is, int i, int i_48_) {
	int[] is_49_ = new int[1152];
	int i_50_ = 0;
	for (int i_51_ = 0; i_51_ < 32; i_51_++) {
	    for (int i_52_ = 0; i_52_ < 36; i_52_++) {
		int i_53_ = is[i_50_];
		if (i_53_ == 0) {
		    if (i_52_ > 0 && is[i_50_ - 1] != 0)
			i_53_ = i;
		    else if (i_51_ > 0 && is[i_50_ - 36] != 0)
			i_53_ = i;
		    else if (i_52_ < 35 && 0 != is[1 + i_50_])
			i_53_ = i;
		    else if (i_51_ < 31 && is[36 + i_50_] != 0)
			i_53_ = i;
		}
		is_49_[i_50_++] = i_53_;
	    }
	}
	return is_49_;
    }
    
    void method624(int[] is, int i, int i_54_) {
	for (int i_55_ = 31; i_55_ > 0; i_55_--) {
	    int i_56_ = 36 * i_55_;
	    for (int i_57_ = 35; i_57_ > 0; i_57_--) {
		if (0 == is[i_56_ + i_57_] && is[i_57_ + i_56_ - 1 - 36] != 0)
		    is[i_56_ + i_57_] = i;
	    }
	}
    }
    
    public final boolean method625(boolean bool, Class2 class2, int i) {
	int i_58_;
	int i_59_;
	int i_60_;
	if (bool) {
	    if (class2 != null && class2.anIntArray16 != null) {
		i_58_ = class2.anIntArray16[0];
		i_59_ = class2.anIntArray16[1];
		i_60_ = class2.anIntArray16[2];
	    } else {
		i_58_ = -1747988637 * anInt93;
		i_59_ = anInt94 * 49799703;
		i_60_ = -2096722129 * anInt62;
	    }
	} else if (null != class2 && null != class2.anIntArray22) {
	    i_58_ = class2.anIntArray22[0];
	    i_59_ = class2.anIntArray22[1];
	    i_60_ = class2.anIntArray22[2];
	} else {
	    i_58_ = 1508242079 * anInt78;
	    i_59_ = anInt91 * -1343555447;
	    i_60_ = anInt82 * 74846191;
	}
	if (i_58_ == -1)
	    return true;
	boolean bool_61_ = true;
	if (!aClass17_55.aClass458_191.method7478(i_58_, 0, (short) 18698))
	    bool_61_ = false;
	if (-1 != i_59_
	    && !aClass17_55.aClass458_191.method7478(i_59_, 0, (short) 5124))
	    bool_61_ = false;
	if (-1 != i_60_
	    && !aClass17_55.aClass458_191.method7478(i_60_, 0, (short) 24999))
	    bool_61_ = false;
	return bool_61_;
    }
    
    int[] method626(Class182 class182, Class182 class182_62_, int i, int i_63_,
		    int i_64_, boolean bool, int i_65_, Class175 class175,
		    Class637 class637, Class631 class631) {
	Class186 class186 = Class186.method3644(aClass17_55.aClass458_191,
						anInt65 * -1870434119, 0);
	if (null == class186)
	    return null;
	if (class186.anInt2086 < 13)
	    class186.method3651(2);
	if (aShortArray67 != null) {
	    for (int i_66_ = 0; i_66_ < aShortArray67.length; i_66_++) {
		if (aByteArray117 != null && i_66_ < aByteArray117.length)
		    class186.method3631(aShortArray67[i_66_],
					(aShortArray96
					 [aByteArray117[i_66_] & 0xff]));
		else
		    class186.method3631(aShortArray67[i_66_],
					aShortArray68[i_66_]);
	    }
	}
	if (null != aShortArray70) {
	    for (int i_67_ = 0; i_67_ < aShortArray70.length; i_67_++)
		class186.method3632(aShortArray70[i_67_],
				    aShortArray71[i_67_]);
	}
	if (null != class637) {
	    for (int i_68_ = 0; i_68_ < 10; i_68_++) {
		for (int i_69_ = 0;
		     i_69_ < Class198_Sub18.aShortArrayArray9988[i_68_].length;
		     i_69_++) {
		    if (class637.anIntArray8301[i_68_]
			< (Class525_Sub6.aShortArrayArrayArray10485[i_68_]
			   [i_69_]).length)
			class186.method3631
			    (Class198_Sub18.aShortArrayArray9988[i_68_][i_69_],
			     (Class525_Sub6.aShortArrayArrayArray10485[i_68_]
			      [i_69_][class637.anIntArray8301[i_68_]]));
		}
	    }
	    for (int i_70_ = 0; i_70_ < 10; i_70_++) {
		for (int i_71_ = 0;
		     i_71_ < Class477.aShortArrayArray5199[i_70_].length;
		     i_71_++) {
		    if (class637.anIntArray8298[i_70_]
			< (Class522_Sub1.aShortArrayArrayArray10395[i_70_]
			   [i_71_]).length)
			class186.method3632
			    (Class477.aShortArrayArray5199[i_70_][i_71_],
			     (Class522_Sub1.aShortArrayArrayArray10395[i_70_]
			      [i_71_][class637.anIntArray8298[i_70_]]));
		}
	    }
	}
	int i_72_ = 2048;
	boolean bool_73_ = false;
	if (128 != -311590649 * anInt122 || -207729681 * anInt118 != 128
	    || 128 != -994464071 * anInt119) {
	    bool_73_ = true;
	    i_72_ |= 0x7;
	}
	Class179 class179 = class182.method3556(class186, i_72_, 64,
						64 + anInt120 * -358510299,
						768 + anInt121 * 1692172521);
	if (!class179.method2924())
	    return null;
	if (bool_73_)
	    class179.method2936(anInt122 * -311590649, anInt118 * -207729681,
				-994464071 * anInt119);
	Class157 class157 = null;
	if (-1 != -1095552769 * anInt77) {
	    class157
		= aClass17_55.method787(class182, class182_62_,
					-1210387357 * anInt59, 10, 1, 0, true,
					true, 0, class175, class637, class631,
					anInterface13_61, -1187651446);
	    if (null == class157)
		return null;
	} else if (-1 != 2020962253 * anInt98) {
	    class157 = aClass17_55.method787(class182, class182_62_,
					     1088959965 * anInt111, i, i_63_,
					     i_64_, false, true, 0, class175,
					     class637, class631,
					     anInterface13_61, -1187651446);
	    if (class157 == null)
		return null;
	} else if (1860754759 * anInt131 != -1) {
	    class157 = aClass17_55.method787(class182, class182_62_,
					     45619687 * anInt135, i, i_63_,
					     i_64_, false, true, 0, class175,
					     class637, class631,
					     anInterface13_61, -1187651446);
	    if (class157 == null)
		return null;
	} else if (-1 != anInt114 * 195314511) {
	    class157
		= aClass17_55.method787(class182, class182_62_,
					593405105 * anInt113, 10, 1, 0, true,
					true, 0, class175, class637, class631,
					anInterface13_61, -1187651446);
	    if (class157 == null)
		return null;
	}
	int i_74_;
	if (bool)
	    i_74_ = (int) ((double) (-1048035637 * anInt74) * 1.5) << 2;
	else if (2 == i_63_)
	    i_74_ = (int) (1.04 * (double) (anInt74 * -1048035637)) << 2;
	else
	    i_74_ = anInt74 * -1048035637 << 2;
	Class435 class435 = class182.method3237();
	Class435 class435_75_ = class182.method3224();
	class435_75_.method6963(16.0F, 16.0F, 512.0F, 512.0F, 50.0F,
				2.14748365E9F,
				(float) class182.method3566(-282169157)
					    .method2710(),
				(float) class182.method3566(-443894528)
					    .method2711());
	class182.method3252(class435_75_);
	class182.method3277(0, 0,
			    class182.method3566(-1534586423).method2710(),
			    class182.method3566(216692947).method2711());
	Class444 class444 = new Class444();
	class182.method3233(class444);
	class182.method3351(0.95F + (float) (Math.random() / 10.0));
	class182.method3307(16777215, 0.95F + (float) (Math.random() / 10.0),
			    0.95F + (float) (Math.random() / 10.0), -50.0F,
			    -10.0F, -50.0F);
	Class444 class444_76_ = class182.method3225();
	class444_76_.method7141(0.0F, 0.0F, 1.0F,
				Class436
				    .method7071(-(anInt92 * 968302009) << 3));
	class444_76_.method7142(0.0F, 1.0F, 0.0F,
				Class436.method7071(795105987 * anInt81 << 3));
	class444_76_.method7147((float) (-905924017 * anInt128 << 2),
				(float) (((i_74_
					   * (Class436.anIntArray4831
					      [anInt75 * -1891985835 << 3]))
					  >> 14)
					 - class179.method2960() / 2
					 + (-1874228003 * anInt95 << 2)),
				(float) ((anInt95 * -1874228003 << 2)
					 + ((i_74_
					     * (Class436.anIntArray4838
						[anInt75 * -1891985835 << 3]))
					    >> 14)));
	class444_76_.method7142(1.0F, 0.0F, 0.0F,
				Class436
				    .method7071(-1891985835 * anInt75 << 3));
	class182.method3184(0, 0, 36, 32);
	class182.method3188(2, 0);
	class182.method3151(0, 0, 36, 32, 0, 0);
	class182.method3140(0, -1, 0);
	class179.method2953(class444_76_, null, 1);
	class182.method3252(class435);
	int[] is = class182.method3165(0, 0, 36, 32);
	if (i_63_ >= 1) {
	    is = method623(is, -16777214, 1289996840);
	    if (i_63_ >= 2)
		is = method623(is, -1, -1473822506);
	}
	if (i_64_ != 0)
	    method624(is, i_64_, 1711152985);
	if (-1 != 2020962253 * anInt98)
	    class157.method2518(0, 0);
	else if (anInt131 * 1860754759 != -1)
	    class157.method2518(0, 0);
	class182.method3215(is, 0, 36, 36, 32, (byte) 24).method2518(0, 0);
	if (anInt77 * -1095552769 != -1)
	    class157.method2518(0, 0);
	if (-1 != 195314511 * anInt114)
	    class157.method2518(0, 0);
	if (1 == i_65_
	    || i_65_ == 2 && (anInt56 * 1051584679 == 1 || i != 1) && i != -1)
	    class175.method2851(Class272.method5026(i,
						    aClass17_55.aClass666_198,
						    class631, 711179182),
				0, 9, -256, -16777215, -128640314);
	is = class182.method3165(0, 0, 36, 32);
	for (int i_77_ = 0; i_77_ < is.length; i_77_++) {
	    if ((is[i_77_] & 0xffffff) == 0)
		is[i_77_] = 0;
	    else
		is[i_77_] |= ~0xffffff;
	}
	return is;
    }
    
    public final boolean method627(boolean bool, Class2 class2, int i) {
	int i_78_;
	int i_79_;
	if (bool) {
	    if (class2 != null && class2.anIntArray23 != null) {
		i_78_ = class2.anIntArray23[0];
		i_79_ = class2.anIntArray23[1];
	    } else {
		i_78_ = 1522045387 * anInt105;
		i_79_ = anInt106 * -769283651;
	    }
	} else if (null != class2 && class2.anIntArray15 != null) {
	    i_78_ = class2.anIntArray15[0];
	    i_79_ = class2.anIntArray15[1];
	} else {
	    i_78_ = anInt103 * 1730663877;
	    i_79_ = anInt104 * -252626025;
	}
	if (-1 == i_78_)
	    return true;
	boolean bool_80_ = true;
	if (!aClass17_55.aClass458_191.method7478(i_78_, 0, (short) 28446))
	    bool_80_ = false;
	if (-1 != i_79_
	    && !aClass17_55.aClass458_191.method7478(i_79_, 0, (short) 5991))
	    bool_80_ = false;
	return bool_80_;
    }
    
    public final Class186 method628(boolean bool, Class2 class2, int i) {
	int i_81_;
	int i_82_;
	if (bool) {
	    if (null != class2 && class2.anIntArray23 != null) {
		i_81_ = class2.anIntArray23[0];
		i_82_ = class2.anIntArray23[1];
	    } else {
		i_81_ = 1522045387 * anInt105;
		i_82_ = anInt106 * -769283651;
	    }
	} else if (null != class2 && null != class2.anIntArray15) {
	    i_81_ = class2.anIntArray15[0];
	    i_82_ = class2.anIntArray15[1];
	} else {
	    i_81_ = anInt103 * 1730663877;
	    i_82_ = -252626025 * anInt104;
	}
	if (-1 == i_81_)
	    return null;
	Class186 class186
	    = Class186.method3644(aClass17_55.aClass458_191, i_81_, 0);
	if (class186.anInt2086 < 13)
	    class186.method3651(2);
	if (i_82_ != -1) {
	    Class186 class186_83_
		= Class186.method3644(aClass17_55.aClass458_191, i_82_, 0);
	    if (class186_83_.anInt2086 < 13)
		class186_83_.method3651(2);
	    Class186[] class186s = { class186, class186_83_ };
	    class186 = new Class186(class186s, 2);
	}
	if (aShortArray67 != null) {
	    short[] is;
	    if (null != class2 && null != class2.aShortArray24)
		is = class2.aShortArray24;
	    else
		is = aShortArray68;
	    for (int i_84_ = 0; i_84_ < aShortArray67.length; i_84_++)
		class186.method3631(aShortArray67[i_84_], is[i_84_]);
	}
	if (aShortArray70 != null) {
	    short[] is;
	    if (null != class2 && class2.aShortArray21 != null)
		is = class2.aShortArray21;
	    else
		is = aShortArray71;
	    for (int i_85_ = 0; i_85_ < aShortArray70.length; i_85_++)
		class186.method3632(aShortArray70[i_85_], is[i_85_]);
	}
	return class186;
    }
    
    public int method629(int i, int i_86_, byte i_87_) {
	if (aClass10_127 == null)
	    return i_86_;
	Class525_Sub42 class525_sub42
	    = (Class525_Sub42) aClass10_127.method684((long) i);
	if (null == class525_sub42)
	    return i_86_;
	return -1344652871 * class525_sub42.anInt10858;
    }
    
    void method630(RSBuffer class525_sub38, int i, byte i_88_) {
	if (1 == i)
	    anInt65 = class525_sub38.readBigSmart(-2043778683) * -1997171319;
	else if (i == 2)
	    aString66 = class525_sub38.readString((byte) 18);
	else if (i == 4)
	    anInt74 = class525_sub38.readUnsignedShort((byte) 56) * -1188776221;
	else if (5 == i)
	    anInt75 = class525_sub38.readUnsignedShort((byte) 44) * 1515566845;
	else if (6 == i)
	    anInt81 = class525_sub38.readUnsignedShort((byte) 5) * -838097429;
	else if (7 == i) {
	    anInt128 = class525_sub38.readUnsignedShort((byte) 120) * -1432542033;
	    if (anInt128 * -905924017 > 32767)
		anInt128 -= 615448576;
	} else if (8 == i) {
	    anInt95 = class525_sub38.readUnsignedShort((byte) 6) * -1941460107;
	    if (anInt95 * -1874228003 > 32767)
		anInt95 -= -1418395648;
	} else if (11 == i)
	    anInt56 = -1043775721;
	else if (12 == i)
	    anInt73 = class525_sub38.readInt(1122701520) * -600484153;
	else if (i == 13)
	    anInt72 = class525_sub38.readUnsignedByte(304262447) * 1698134569;
	else if (i == 14)
	    anInt99 = class525_sub38.readUnsignedByte(1766349313) * -1428809531;
	else if (15 == i)
	    aBool80 = false;
	else if (16 == i)
	    aBool83 = true;
	else if (18 == i)
	    anInt60 = class525_sub38.readUnsignedShort((byte) 62) * 238325389;
	else if (23 == i)
	    anInt78 = class525_sub38.readBigSmart(-2043778683) * 427862367;
	else if (24 == i)
	    anInt91 = class525_sub38.readBigSmart(-2043778683) * 1614544313;
	else if (25 == i)
	    anInt93 = class525_sub38.readBigSmart(-2043778683) * 822618699;
	else if (i == 26)
	    anInt94 = class525_sub38.readBigSmart(-2043778683) * 119633319;
	else if (i == 27)
	    anInt112 = class525_sub38.readUnsignedByte(679526051) * -1036310425;
	else if (i >= 30 && i < 35)
	    aStringArray84[i - 30] = class525_sub38.readString((byte) 58);
	else if (i >= 35 && i < 40)
	    aStringArray85[i - 35] = class525_sub38.readString((byte) 8);
	else if (40 == i) {
	    int i_89_ = class525_sub38.readUnsignedByte(1111218114);
	    aShortArray67 = new short[i_89_];
	    aShortArray68 = new short[i_89_];
	    for (int i_90_ = 0; i_90_ < i_89_; i_90_++) {
		aShortArray67[i_90_]
		    = (short) class525_sub38.readUnsignedShort((byte) 47);
		aShortArray68[i_90_]
		    = (short) class525_sub38.readUnsignedShort((byte) 61);
	    }
	} else if (41 == i) {
	    int i_91_ = class525_sub38.readUnsignedByte(598453306);
	    aShortArray70 = new short[i_91_];
	    aShortArray71 = new short[i_91_];
	    for (int i_92_ = 0; i_92_ < i_91_; i_92_++) {
		aShortArray70[i_92_]
		    = (short) class525_sub38.readUnsignedShort((byte) 78);
		aShortArray71[i_92_]
		    = (short) class525_sub38.readUnsignedShort((byte) 54);
	    }
	} else if (i == 42) {
	    int i_93_ = class525_sub38.readUnsignedByte(1455803413);
	    aByteArray117 = new byte[i_93_];
	    for (int i_94_ = 0; i_94_ < i_93_; i_94_++)
		aByteArray117[i_94_] = class525_sub38.readByte(-1150098071);
	} else if (i == 43) {
	    anInt133 = class525_sub38.readInt(933686789) * 1932058403;
	    aBool90 = true;
	} else if (44 == i) {
	    int i_95_ = class525_sub38.readUnsignedShort((byte) 35);
	    int i_96_ = 0;
	    for (int i_97_ = i_95_; i_97_ > 0; i_97_ >>= 1)
		i_96_++;
	    aByteArray110 = new byte[i_96_];
	    byte i_98_ = 0;
	    for (int i_99_ = 0; i_99_ < i_96_; i_99_++) {
		if ((i_95_ & 1 << i_99_) > 0) {
		    aByteArray110[i_99_] = i_98_;
		    i_98_++;
		} else
		    aByteArray110[i_99_] = (byte) -1;
	    }
	} else if (45 == i) {
	    int i_100_ = class525_sub38.readUnsignedShort((byte) 117);
	    int i_101_ = 0;
	    for (int i_102_ = i_100_; i_102_ > 0; i_102_ >>= 1)
		i_101_++;
	    aByteArray124 = new byte[i_101_];
	    byte i_103_ = 0;
	    for (int i_104_ = 0; i_104_ < i_101_; i_104_++) {
		if ((i_100_ & 1 << i_104_) > 0) {
		    aByteArray124[i_104_] = i_103_;
		    i_103_++;
		} else
		    aByteArray124[i_104_] = (byte) -1;
	    }
	} else if (65 == i)
	    aBool123 = true;
	else if (i == 78)
	    anInt82 = class525_sub38.readBigSmart(-2043778683) * -634716401;
	else if (i == 79)
	    anInt62 = class525_sub38.readBigSmart(-2043778683) * 960174031;
	else if (i == 90)
	    anInt103 = class525_sub38.readBigSmart(-2043778683) * -650583795;
	else if (i == 91)
	    anInt105 = class525_sub38.readBigSmart(-2043778683) * -1042740253;
	else if (i == 92)
	    anInt104 = class525_sub38.readBigSmart(-2043778683) * -206769113;
	else if (i == 93)
	    anInt106 = class525_sub38.readBigSmart(-2043778683) * -676341355;
	else if (94 == i)
	    anInt64 = class525_sub38.readUnsignedShort((byte) 28) * -1413480947;
	else if (i == 95)
	    anInt92 = class525_sub38.readUnsignedShort((byte) 108) * 1775622281;
	else if (96 == i)
	    anInt126 = class525_sub38.readUnsignedByte(788569775) * 318311195;
	else if (i == 97)
	    anInt59 = class525_sub38.readUnsignedShort((byte) 8) * -619238069;
	else if (98 == i)
	    anInt77 = class525_sub38.readUnsignedShort((byte) 51) * 552324863;
	else if (i >= 100 && i < 110) {
	    if (null == anIntArray107) {
		anIntArray107 = new int[10];
		anIntArray108 = new int[10];
	    }
	    anIntArray107[i - 100] = class525_sub38.readUnsignedShort((byte) 102);
	    anIntArray108[i - 100] = class525_sub38.readUnsignedShort((byte) 108);
	} else if (110 == i)
	    anInt122 = class525_sub38.readUnsignedShort((byte) 50) * -746316617;
	else if (111 == i)
	    anInt118 = class525_sub38.readUnsignedShort((byte) 44) * 2143699727;
	else if (i == 112)
	    anInt119 = class525_sub38.readUnsignedShort((byte) 27) * 720762761;
	else if (113 == i)
	    anInt120 = class525_sub38.readByte(-1150098071) * 1346511533;
	else if (i == 114)
	    anInt121 = class525_sub38.readByte(-1150098071) * 1198109885;
	else if (i == 115)
	    anInt88 = class525_sub38.readUnsignedByte(2044773816) * 579008171;
	else if (121 == i)
	    anInt111 = class525_sub38.readUnsignedShort((byte) 10) * 2020330101;
	else if (122 == i)
	    anInt98 = class525_sub38.readUnsignedShort((byte) 102) * 1319965957;
	else if (i == 125) {
	    anInt97
		= (class525_sub38.readByte(-1150098071) << 2) * 417690531;
	    anInt76
		= (class525_sub38.readByte(-1150098071) << 2) * -1997166251;
	    anInt101
		= (class525_sub38.readByte(-1150098071) << 2) * 1253502443;
	} else if (126 == i) {
	    anInt109
		= (class525_sub38.readByte(-1150098071) << 2) * -1876346585;
	    anInt100
		= (class525_sub38.readByte(-1150098071) << 2) * 465177999;
	    anInt102
		= (class525_sub38.readByte(-1150098071) << 2) * 382193025;
	} else if (i == 127 || i == 128 || i == 129 || i == 130) {
	    class525_sub38.readUnsignedByte(312218680);
	    class525_sub38.readUnsignedShort((byte) 66);
	} else if (132 == i) {
	    int i_105_ = class525_sub38.readUnsignedByte(1246859152);
	    anIntArray69 = new int[i_105_];
	    for (int i_106_ = 0; i_106_ < i_105_; i_106_++)
		anIntArray69[i_106_] = class525_sub38.readUnsignedShort((byte) 44);
	} else if (i == 134)
	    anInt129 = class525_sub38.readUnsignedByte(372588305) * 1701436755;
	else if (i == 139)
	    anInt135 = class525_sub38.readUnsignedShort((byte) 125) * -707139113;
	else if (i == 140)
	    anInt131 = class525_sub38.readUnsignedShort((byte) 101) * 1933032567;
	else if (i >= 142 && i < 147) {
	    if (null == anIntArray86) {
		anIntArray86 = new int[6];
		Arrays.fill(anIntArray86, -1);
	    }
	    anIntArray86[i - 142] = class525_sub38.readUnsignedShort((byte) 43);
	} else if (i >= 150 && i < 155) {
	    if (null == anIntArray87) {
		anIntArray87 = new int[5];
		Arrays.fill(anIntArray87, -1);
	    }
	    anIntArray87[i - 150] = class525_sub38.readUnsignedShort((byte) 60);
	} else if (156 != i) {
	    if (i == 157)
		aBool134 = true;
	    else if (161 == i)
		anInt113
		    = class525_sub38.readUnsignedShort((byte) 111) * -1418386351;
	    else if (i == 162)
		anInt114 = class525_sub38.readUnsignedShort((byte) 26) * 1737421743;
	    else if (i == 163)
		anInt116 = class525_sub38.readUnsignedShort((byte) 77) * 96751913;
	    else if (164 == i)
		aString115 = class525_sub38.readString((byte) 8);
	    else if (i == 165)
		anInt56 = -2087551442;
	    else if (i == 167)
		aBool125 = true;
	    else if (i == 249) {
		int i_107_ = class525_sub38.readUnsignedByte(1334578628);
		if (aClass10_127 == null) {
		    int i_108_ = Class212.method3935(i_107_, -2056250364);
		    aClass10_127 = new Class10(i_108_);
		}
		for (int i_109_ = 0; i_109_ < i_107_; i_109_++) {
		    boolean bool = class525_sub38.readUnsignedByte(2133855555) == 1;
		    int i_110_ = class525_sub38.method16834(-1994884458);
		    Class525 class525;
		    if (bool)
			class525
			    = new Class525_Sub19(class525_sub38
						     .readString((byte) 36));
		    else
			class525
			    = new Class525_Sub42(class525_sub38
						     .readInt(2147110418));
		    aClass10_127.method695(class525, (long) i_110_);
		}
	    }
	}
    }
    
    public int method631(int i, byte i_111_) {
	if (anIntArray86 == null)
	    return -1;
	return anIntArray86[i];
    }
    
    public Class8 method632(int i, int i_112_) {
	if (anIntArray107 != null && i > 1) {
	    int i_113_ = -1;
	    for (int i_114_ = 0; i_114_ < 10; i_114_++) {
		if (i >= anIntArray108[i_114_] && 0 != anIntArray108[i_114_])
		    i_113_ = anIntArray107[i_114_];
	    }
	    if (-1 != i_113_)
		return (Class8) anInterface13_61.method76(i_113_, 640613659);
	}
	return this;
    }
    
    static {
	aString89 = "</col>";
    }
    
    public void method68(RSBuffer class525_sub38) {
	aBool80 = true;
	for (;;) {
	    int i = class525_sub38.readUnsignedByte(1235213443);
	    if (0 == i)
		break;
	    method630(class525_sub38, i, (byte) 50);
	}
    }
    
    public void method69() {
	if (-1095552769 * anInt77 != -1)
	    method639((Class8) anInterface13_61.method76(-1095552769 * anInt77,
							 -176778877),
		      (Class8) anInterface13_61.method76(anInt59 * -1210387357,
							 26542732),
		      aClass17_55.aClass666_198, 1715380719);
	else if (-1 != anInt98 * 2020962253)
	    method617((Class8) anInterface13_61.method76(anInt98 * 2020962253,
							 64953638),
		      (Class8) anInterface13_61.method76(1088959965 * anInt111,
							 -2067400851),
		      aClass17_55.aClass666_198, -25902913);
	else if (1860754759 * anInt131 != -1)
	    method618((Class8) anInterface13_61.method76(anInt131 * 1860754759,
							 198612801),
		      (Class8) anInterface13_61.method76(anInt135 * 45619687,
							 1938215858),
		      aClass17_55.aClass666_198, 1650610192);
	else if (-1 != 195314511 * anInt114)
	    method619((Class8) anInterface13_61.method76(anInt114 * 195314511,
							 1442596345),
		      (Class8) anInterface13_61.method76(593405105 * anInt113,
							 511623057),
		      aClass17_55.aClass666_198, (short) -6010);
	if (-1139124461 * anInt126 != 0)
	    aBool80 = false;
	if (!aClass17_55.aBool190 && aBool83) {
	    anInt88 = 0;
	    aStringArray84 = aClass17_55.aStringArray195;
	    aStringArray85 = aClass17_55.aStringArray192;
	    aBool123 = false;
	    anIntArray69 = null;
	    aBool80 = false;
	    if (null != aClass10_127) {
		boolean bool = false;
		for (Class525 class525 = aClass10_127.method689(1762257969);
		     null != class525;
		     class525 = aClass10_127.method690((byte) 25)) {
		    Class88 class88
			= (Class88) (aClass17_55.anInterface13_189.method76
				     ((int) (class525.aLong7113
					     * -5126207504388691097L),
				      -1778924519));
		    if (class88.aBool895)
			class525.method8755(-1933461091);
		    else
			bool = true;
		}
		if (!bool)
		    aClass10_127 = null;
	    }
	}
    }
    
    public void method70() {
	if (-1095552769 * anInt77 != -1)
	    method639((Class8) anInterface13_61.method76(-1095552769 * anInt77,
							 -1553058158),
		      (Class8) anInterface13_61.method76(anInt59 * -1210387357,
							 -831192408),
		      aClass17_55.aClass666_198, 1991902079);
	else if (-1 != anInt98 * 2020962253)
	    method617((Class8) anInterface13_61.method76(anInt98 * 2020962253,
							 496716700),
		      (Class8) anInterface13_61.method76(1088959965 * anInt111,
							 775213940),
		      aClass17_55.aClass666_198, 1757003588);
	else if (1860754759 * anInt131 != -1)
	    method618((Class8) anInterface13_61.method76(anInt131 * 1860754759,
							 755244554),
		      (Class8) anInterface13_61.method76(anInt135 * 45619687,
							 -1571713883),
		      aClass17_55.aClass666_198, 1650610192);
	else if (-1 != 195314511 * anInt114)
	    method619((Class8) anInterface13_61.method76(anInt114 * 195314511,
							 954830771),
		      (Class8) anInterface13_61.method76(593405105 * anInt113,
							 306206027),
		      aClass17_55.aClass666_198, (short) 9522);
	if (-1139124461 * anInt126 != 0)
	    aBool80 = false;
	if (!aClass17_55.aBool190 && aBool83) {
	    anInt88 = 0;
	    aStringArray84 = aClass17_55.aStringArray195;
	    aStringArray85 = aClass17_55.aStringArray192;
	    aBool123 = false;
	    anIntArray69 = null;
	    aBool80 = false;
	    if (null != aClass10_127) {
		boolean bool = false;
		for (Class525 class525 = aClass10_127.method689(164769993);
		     null != class525;
		     class525 = aClass10_127.method690((byte) -40)) {
		    Class88 class88
			= (Class88) (aClass17_55.anInterface13_189.method76
				     ((int) (class525.aLong7113
					     * -5126207504388691097L),
				      257248262));
		    if (class88.aBool895)
			class525.method8755(-1933461091);
		    else
			bool = true;
		}
		if (!bool)
		    aClass10_127 = null;
	    }
	}
    }
    
    void method633(RSBuffer class525_sub38, int i) {
	if (1 == i)
	    anInt65 = class525_sub38.readBigSmart(-2043778683) * -1997171319;
	else if (i == 2)
	    aString66 = class525_sub38.readString((byte) 38);
	else if (i == 4)
	    anInt74 = class525_sub38.readUnsignedShort((byte) 67) * -1188776221;
	else if (5 == i)
	    anInt75 = class525_sub38.readUnsignedShort((byte) 112) * 1515566845;
	else if (6 == i)
	    anInt81 = class525_sub38.readUnsignedShort((byte) 109) * -838097429;
	else if (7 == i) {
	    anInt128 = class525_sub38.readUnsignedShort((byte) 102) * -1432542033;
	    if (anInt128 * -905924017 > 32767)
		anInt128 -= 615448576;
	} else if (8 == i) {
	    anInt95 = class525_sub38.readUnsignedShort((byte) 111) * -1941460107;
	    if (anInt95 * -1874228003 > 32767)
		anInt95 -= -1418395648;
	} else if (11 == i)
	    anInt56 = -1043775721;
	else if (12 == i)
	    anInt73 = class525_sub38.readInt(1590637043) * -600484153;
	else if (i == 13)
	    anInt72 = class525_sub38.readUnsignedByte(799486387) * 1698134569;
	else if (i == 14)
	    anInt99 = class525_sub38.readUnsignedByte(1140526259) * -1428809531;
	else if (15 == i)
	    aBool80 = false;
	else if (16 == i)
	    aBool83 = true;
	else if (18 == i)
	    anInt60 = class525_sub38.readUnsignedShort((byte) 59) * 238325389;
	else if (23 == i)
	    anInt78 = class525_sub38.readBigSmart(-2043778683) * 427862367;
	else if (24 == i)
	    anInt91 = class525_sub38.readBigSmart(-2043778683) * 1614544313;
	else if (25 == i)
	    anInt93 = class525_sub38.readBigSmart(-2043778683) * 822618699;
	else if (i == 26)
	    anInt94 = class525_sub38.readBigSmart(-2043778683) * 119633319;
	else if (i == 27)
	    anInt112 = class525_sub38.readUnsignedByte(2007516638) * -1036310425;
	else if (i >= 30 && i < 35)
	    aStringArray84[i - 30] = class525_sub38.readString((byte) 13);
	else if (i >= 35 && i < 40)
	    aStringArray85[i - 35] = class525_sub38.readString((byte) -43);
	else if (40 == i) {
	    int i_115_ = class525_sub38.readUnsignedByte(1583419931);
	    aShortArray67 = new short[i_115_];
	    aShortArray68 = new short[i_115_];
	    for (int i_116_ = 0; i_116_ < i_115_; i_116_++) {
		aShortArray67[i_116_]
		    = (short) class525_sub38.readUnsignedShort((byte) 23);
		aShortArray68[i_116_]
		    = (short) class525_sub38.readUnsignedShort((byte) 48);
	    }
	} else if (41 == i) {
	    int i_117_ = class525_sub38.readUnsignedByte(279086748);
	    aShortArray70 = new short[i_117_];
	    aShortArray71 = new short[i_117_];
	    for (int i_118_ = 0; i_118_ < i_117_; i_118_++) {
		aShortArray70[i_118_]
		    = (short) class525_sub38.readUnsignedShort((byte) 50);
		aShortArray71[i_118_]
		    = (short) class525_sub38.readUnsignedShort((byte) 20);
	    }
	} else if (i == 42) {
	    int i_119_ = class525_sub38.readUnsignedByte(765690753);
	    aByteArray117 = new byte[i_119_];
	    for (int i_120_ = 0; i_120_ < i_119_; i_120_++)
		aByteArray117[i_120_]
		    = class525_sub38.readByte(-1150098071);
	} else if (i == 43) {
	    anInt133 = class525_sub38.readInt(1197618295) * 1932058403;
	    aBool90 = true;
	} else if (44 == i) {
	    int i_121_ = class525_sub38.readUnsignedShort((byte) 67);
	    int i_122_ = 0;
	    for (int i_123_ = i_121_; i_123_ > 0; i_123_ >>= 1)
		i_122_++;
	    aByteArray110 = new byte[i_122_];
	    byte i_124_ = 0;
	    for (int i_125_ = 0; i_125_ < i_122_; i_125_++) {
		if ((i_121_ & 1 << i_125_) > 0) {
		    aByteArray110[i_125_] = i_124_;
		    i_124_++;
		} else
		    aByteArray110[i_125_] = (byte) -1;
	    }
	} else if (45 == i) {
	    int i_126_ = class525_sub38.readUnsignedShort((byte) 85);
	    int i_127_ = 0;
	    for (int i_128_ = i_126_; i_128_ > 0; i_128_ >>= 1)
		i_127_++;
	    aByteArray124 = new byte[i_127_];
	    byte i_129_ = 0;
	    for (int i_130_ = 0; i_130_ < i_127_; i_130_++) {
		if ((i_126_ & 1 << i_130_) > 0) {
		    aByteArray124[i_130_] = i_129_;
		    i_129_++;
		} else
		    aByteArray124[i_130_] = (byte) -1;
	    }
	} else if (65 == i)
	    aBool123 = true;
	else if (i == 78)
	    anInt82 = class525_sub38.readBigSmart(-2043778683) * -634716401;
	else if (i == 79)
	    anInt62 = class525_sub38.readBigSmart(-2043778683) * 960174031;
	else if (i == 90)
	    anInt103 = class525_sub38.readBigSmart(-2043778683) * -650583795;
	else if (i == 91)
	    anInt105 = class525_sub38.readBigSmart(-2043778683) * -1042740253;
	else if (i == 92)
	    anInt104 = class525_sub38.readBigSmart(-2043778683) * -206769113;
	else if (i == 93)
	    anInt106 = class525_sub38.readBigSmart(-2043778683) * -676341355;
	else if (94 == i)
	    anInt64 = class525_sub38.readUnsignedShort((byte) 124) * -1413480947;
	else if (i == 95)
	    anInt92 = class525_sub38.readUnsignedShort((byte) 127) * 1775622281;
	else if (96 == i)
	    anInt126 = class525_sub38.readUnsignedByte(1167507750) * 318311195;
	else if (i == 97)
	    anInt59 = class525_sub38.readUnsignedShort((byte) 121) * -619238069;
	else if (98 == i)
	    anInt77 = class525_sub38.readUnsignedShort((byte) 87) * 552324863;
	else if (i >= 100 && i < 110) {
	    if (null == anIntArray107) {
		anIntArray107 = new int[10];
		anIntArray108 = new int[10];
	    }
	    anIntArray107[i - 100] = class525_sub38.readUnsignedShort((byte) 67);
	    anIntArray108[i - 100] = class525_sub38.readUnsignedShort((byte) 55);
	} else if (110 == i)
	    anInt122 = class525_sub38.readUnsignedShort((byte) 107) * -746316617;
	else if (111 == i)
	    anInt118 = class525_sub38.readUnsignedShort((byte) 122) * 2143699727;
	else if (i == 112)
	    anInt119 = class525_sub38.readUnsignedShort((byte) 44) * 720762761;
	else if (113 == i)
	    anInt120 = class525_sub38.readByte(-1150098071) * 1346511533;
	else if (i == 114)
	    anInt121 = class525_sub38.readByte(-1150098071) * 1198109885;
	else if (i == 115)
	    anInt88 = class525_sub38.readUnsignedByte(561797800) * 579008171;
	else if (121 == i)
	    anInt111 = class525_sub38.readUnsignedShort((byte) 103) * 2020330101;
	else if (122 == i)
	    anInt98 = class525_sub38.readUnsignedShort((byte) 81) * 1319965957;
	else if (i == 125) {
	    anInt97
		= (class525_sub38.readByte(-1150098071) << 2) * 417690531;
	    anInt76
		= (class525_sub38.readByte(-1150098071) << 2) * -1997166251;
	    anInt101
		= (class525_sub38.readByte(-1150098071) << 2) * 1253502443;
	} else if (126 == i) {
	    anInt109
		= (class525_sub38.readByte(-1150098071) << 2) * -1876346585;
	    anInt100
		= (class525_sub38.readByte(-1150098071) << 2) * 465177999;
	    anInt102
		= (class525_sub38.readByte(-1150098071) << 2) * 382193025;
	} else if (i == 127 || i == 128 || i == 129 || i == 130) {
	    class525_sub38.readUnsignedByte(207090442);
	    class525_sub38.readUnsignedShort((byte) 52);
	} else if (132 == i) {
	    int i_131_ = class525_sub38.readUnsignedByte(543978509);
	    anIntArray69 = new int[i_131_];
	    for (int i_132_ = 0; i_132_ < i_131_; i_132_++)
		anIntArray69[i_132_] = class525_sub38.readUnsignedShort((byte) 24);
	} else if (i == 134)
	    anInt129 = class525_sub38.readUnsignedByte(1932262260) * 1701436755;
	else if (i == 139)
	    anInt135 = class525_sub38.readUnsignedShort((byte) 69) * -707139113;
	else if (i == 140)
	    anInt131 = class525_sub38.readUnsignedShort((byte) 82) * 1933032567;
	else if (i >= 142 && i < 147) {
	    if (null == anIntArray86) {
		anIntArray86 = new int[6];
		Arrays.fill(anIntArray86, -1);
	    }
	    anIntArray86[i - 142] = class525_sub38.readUnsignedShort((byte) 28);
	} else if (i >= 150 && i < 155) {
	    if (null == anIntArray87) {
		anIntArray87 = new int[5];
		Arrays.fill(anIntArray87, -1);
	    }
	    anIntArray87[i - 150] = class525_sub38.readUnsignedShort((byte) 107);
	} else if (156 != i) {
	    if (i == 157)
		aBool134 = true;
	    else if (161 == i)
		anInt113
		    = class525_sub38.readUnsignedShort((byte) 124) * -1418386351;
	    else if (i == 162)
		anInt114 = class525_sub38.readUnsignedShort((byte) 94) * 1737421743;
	    else if (i == 163)
		anInt116 = class525_sub38.readUnsignedShort((byte) 86) * 96751913;
	    else if (164 == i)
		aString115 = class525_sub38.readString((byte) 37);
	    else if (i == 165)
		anInt56 = -2087551442;
	    else if (i == 167)
		aBool125 = true;
	    else if (i == 249) {
		int i_133_ = class525_sub38.readUnsignedByte(1716388967);
		if (aClass10_127 == null) {
		    int i_134_ = Class212.method3935(i_133_, -2056250364);
		    aClass10_127 = new Class10(i_134_);
		}
		for (int i_135_ = 0; i_135_ < i_133_; i_135_++) {
		    boolean bool = class525_sub38.readUnsignedByte(1181672819) == 1;
		    int i_136_ = class525_sub38.method16834(-1994884458);
		    Class525 class525;
		    if (bool)
			class525
			    = new Class525_Sub19(class525_sub38
						     .readString((byte) -6));
		    else
			class525
			    = new Class525_Sub42(class525_sub38
						     .readInt(957636756));
		    aClass10_127.method695(class525, (long) i_136_);
		}
	    }
	}
    }
    
    void method634(RSBuffer class525_sub38, int i) {
	if (1 == i)
	    anInt65 = class525_sub38.readBigSmart(-2043778683) * -1997171319;
	else if (i == 2)
	    aString66 = class525_sub38.readString((byte) 55);
	else if (i == 4)
	    anInt74 = class525_sub38.readUnsignedShort((byte) 119) * -1188776221;
	else if (5 == i)
	    anInt75 = class525_sub38.readUnsignedShort((byte) 21) * 1515566845;
	else if (6 == i)
	    anInt81 = class525_sub38.readUnsignedShort((byte) 121) * -838097429;
	else if (7 == i) {
	    anInt128 = class525_sub38.readUnsignedShort((byte) 90) * -1432542033;
	    if (anInt128 * -905924017 > 32767)
		anInt128 -= 615448576;
	} else if (8 == i) {
	    anInt95 = class525_sub38.readUnsignedShort((byte) 104) * -1941460107;
	    if (anInt95 * -1874228003 > 32767)
		anInt95 -= -1418395648;
	} else if (11 == i)
	    anInt56 = -1043775721;
	else if (12 == i)
	    anInt73 = class525_sub38.readInt(1482365857) * -600484153;
	else if (i == 13)
	    anInt72 = class525_sub38.readUnsignedByte(1349970098) * 1698134569;
	else if (i == 14)
	    anInt99 = class525_sub38.readUnsignedByte(1001229612) * -1428809531;
	else if (15 == i)
	    aBool80 = false;
	else if (16 == i)
	    aBool83 = true;
	else if (18 == i)
	    anInt60 = class525_sub38.readUnsignedShort((byte) 120) * 238325389;
	else if (23 == i)
	    anInt78 = class525_sub38.readBigSmart(-2043778683) * 427862367;
	else if (24 == i)
	    anInt91 = class525_sub38.readBigSmart(-2043778683) * 1614544313;
	else if (25 == i)
	    anInt93 = class525_sub38.readBigSmart(-2043778683) * 822618699;
	else if (i == 26)
	    anInt94 = class525_sub38.readBigSmart(-2043778683) * 119633319;
	else if (i == 27)
	    anInt112 = class525_sub38.readUnsignedByte(465353973) * -1036310425;
	else if (i >= 30 && i < 35)
	    aStringArray84[i - 30] = class525_sub38.readString((byte) -86);
	else if (i >= 35 && i < 40)
	    aStringArray85[i - 35] = class525_sub38.readString((byte) -5);
	else if (40 == i) {
	    int i_137_ = class525_sub38.readUnsignedByte(64237294);
	    aShortArray67 = new short[i_137_];
	    aShortArray68 = new short[i_137_];
	    for (int i_138_ = 0; i_138_ < i_137_; i_138_++) {
		aShortArray67[i_138_]
		    = (short) class525_sub38.readUnsignedShort((byte) 12);
		aShortArray68[i_138_]
		    = (short) class525_sub38.readUnsignedShort((byte) 14);
	    }
	} else if (41 == i) {
	    int i_139_ = class525_sub38.readUnsignedByte(398095403);
	    aShortArray70 = new short[i_139_];
	    aShortArray71 = new short[i_139_];
	    for (int i_140_ = 0; i_140_ < i_139_; i_140_++) {
		aShortArray70[i_140_]
		    = (short) class525_sub38.readUnsignedShort((byte) 96);
		aShortArray71[i_140_]
		    = (short) class525_sub38.readUnsignedShort((byte) 78);
	    }
	} else if (i == 42) {
	    int i_141_ = class525_sub38.readUnsignedByte(755241555);
	    aByteArray117 = new byte[i_141_];
	    for (int i_142_ = 0; i_142_ < i_141_; i_142_++)
		aByteArray117[i_142_]
		    = class525_sub38.readByte(-1150098071);
	} else if (i == 43) {
	    anInt133 = class525_sub38.readInt(1166959171) * 1932058403;
	    aBool90 = true;
	} else if (44 == i) {
	    int i_143_ = class525_sub38.readUnsignedShort((byte) 94);
	    int i_144_ = 0;
	    for (int i_145_ = i_143_; i_145_ > 0; i_145_ >>= 1)
		i_144_++;
	    aByteArray110 = new byte[i_144_];
	    byte i_146_ = 0;
	    for (int i_147_ = 0; i_147_ < i_144_; i_147_++) {
		if ((i_143_ & 1 << i_147_) > 0) {
		    aByteArray110[i_147_] = i_146_;
		    i_146_++;
		} else
		    aByteArray110[i_147_] = (byte) -1;
	    }
	} else if (45 == i) {
	    int i_148_ = class525_sub38.readUnsignedShort((byte) 50);
	    int i_149_ = 0;
	    for (int i_150_ = i_148_; i_150_ > 0; i_150_ >>= 1)
		i_149_++;
	    aByteArray124 = new byte[i_149_];
	    byte i_151_ = 0;
	    for (int i_152_ = 0; i_152_ < i_149_; i_152_++) {
		if ((i_148_ & 1 << i_152_) > 0) {
		    aByteArray124[i_152_] = i_151_;
		    i_151_++;
		} else
		    aByteArray124[i_152_] = (byte) -1;
	    }
	} else if (65 == i)
	    aBool123 = true;
	else if (i == 78)
	    anInt82 = class525_sub38.readBigSmart(-2043778683) * -634716401;
	else if (i == 79)
	    anInt62 = class525_sub38.readBigSmart(-2043778683) * 960174031;
	else if (i == 90)
	    anInt103 = class525_sub38.readBigSmart(-2043778683) * -650583795;
	else if (i == 91)
	    anInt105 = class525_sub38.readBigSmart(-2043778683) * -1042740253;
	else if (i == 92)
	    anInt104 = class525_sub38.readBigSmart(-2043778683) * -206769113;
	else if (i == 93)
	    anInt106 = class525_sub38.readBigSmart(-2043778683) * -676341355;
	else if (94 == i)
	    anInt64 = class525_sub38.readUnsignedShort((byte) 66) * -1413480947;
	else if (i == 95)
	    anInt92 = class525_sub38.readUnsignedShort((byte) 7) * 1775622281;
	else if (96 == i)
	    anInt126 = class525_sub38.readUnsignedByte(1979657157) * 318311195;
	else if (i == 97)
	    anInt59 = class525_sub38.readUnsignedShort((byte) 24) * -619238069;
	else if (98 == i)
	    anInt77 = class525_sub38.readUnsignedShort((byte) 12) * 552324863;
	else if (i >= 100 && i < 110) {
	    if (null == anIntArray107) {
		anIntArray107 = new int[10];
		anIntArray108 = new int[10];
	    }
	    anIntArray107[i - 100] = class525_sub38.readUnsignedShort((byte) 20);
	    anIntArray108[i - 100] = class525_sub38.readUnsignedShort((byte) 117);
	} else if (110 == i)
	    anInt122 = class525_sub38.readUnsignedShort((byte) 7) * -746316617;
	else if (111 == i)
	    anInt118 = class525_sub38.readUnsignedShort((byte) 110) * 2143699727;
	else if (i == 112)
	    anInt119 = class525_sub38.readUnsignedShort((byte) 41) * 720762761;
	else if (113 == i)
	    anInt120 = class525_sub38.readByte(-1150098071) * 1346511533;
	else if (i == 114)
	    anInt121 = class525_sub38.readByte(-1150098071) * 1198109885;
	else if (i == 115)
	    anInt88 = class525_sub38.readUnsignedByte(1383197323) * 579008171;
	else if (121 == i)
	    anInt111 = class525_sub38.readUnsignedShort((byte) 29) * 2020330101;
	else if (122 == i)
	    anInt98 = class525_sub38.readUnsignedShort((byte) 111) * 1319965957;
	else if (i == 125) {
	    anInt97
		= (class525_sub38.readByte(-1150098071) << 2) * 417690531;
	    anInt76
		= (class525_sub38.readByte(-1150098071) << 2) * -1997166251;
	    anInt101
		= (class525_sub38.readByte(-1150098071) << 2) * 1253502443;
	} else if (126 == i) {
	    anInt109
		= (class525_sub38.readByte(-1150098071) << 2) * -1876346585;
	    anInt100
		= (class525_sub38.readByte(-1150098071) << 2) * 465177999;
	    anInt102
		= (class525_sub38.readByte(-1150098071) << 2) * 382193025;
	} else if (i == 127 || i == 128 || i == 129 || i == 130) {
	    class525_sub38.readUnsignedByte(1547071056);
	    class525_sub38.readUnsignedShort((byte) 45);
	} else if (132 == i) {
	    int i_153_ = class525_sub38.readUnsignedByte(495306856);
	    anIntArray69 = new int[i_153_];
	    for (int i_154_ = 0; i_154_ < i_153_; i_154_++)
		anIntArray69[i_154_] = class525_sub38.readUnsignedShort((byte) 114);
	} else if (i == 134)
	    anInt129 = class525_sub38.readUnsignedByte(628997766) * 1701436755;
	else if (i == 139)
	    anInt135 = class525_sub38.readUnsignedShort((byte) 63) * -707139113;
	else if (i == 140)
	    anInt131 = class525_sub38.readUnsignedShort((byte) 87) * 1933032567;
	else if (i >= 142 && i < 147) {
	    if (null == anIntArray86) {
		anIntArray86 = new int[6];
		Arrays.fill(anIntArray86, -1);
	    }
	    anIntArray86[i - 142] = class525_sub38.readUnsignedShort((byte) 56);
	} else if (i >= 150 && i < 155) {
	    if (null == anIntArray87) {
		anIntArray87 = new int[5];
		Arrays.fill(anIntArray87, -1);
	    }
	    anIntArray87[i - 150] = class525_sub38.readUnsignedShort((byte) 54);
	} else if (156 != i) {
	    if (i == 157)
		aBool134 = true;
	    else if (161 == i)
		anInt113 = class525_sub38.readUnsignedShort((byte) 35) * -1418386351;
	    else if (i == 162)
		anInt114 = class525_sub38.readUnsignedShort((byte) 115) * 1737421743;
	    else if (i == 163)
		anInt116 = class525_sub38.readUnsignedShort((byte) 40) * 96751913;
	    else if (164 == i)
		aString115 = class525_sub38.readString((byte) -2);
	    else if (i == 165)
		anInt56 = -2087551442;
	    else if (i == 167)
		aBool125 = true;
	    else if (i == 249) {
		int i_155_ = class525_sub38.readUnsignedByte(549905315);
		if (aClass10_127 == null) {
		    int i_156_ = Class212.method3935(i_155_, -2056250364);
		    aClass10_127 = new Class10(i_156_);
		}
		for (int i_157_ = 0; i_157_ < i_155_; i_157_++) {
		    boolean bool = class525_sub38.readUnsignedByte(1364278794) == 1;
		    int i_158_ = class525_sub38.method16834(-1994884458);
		    Class525 class525;
		    if (bool)
			class525
			    = new Class525_Sub19(class525_sub38
						     .readString((byte) -31));
		    else
			class525
			    = new Class525_Sub42(class525_sub38
						     .readInt(900815309));
		    aClass10_127.method695(class525, (long) i_158_);
		}
	    }
	}
    }
    
    void method635(Class22 class22, Class8 class8_159_, Class8 class8_160_,
		   Class53 class53, Class666 class666) {
	anInt65 = class8_159_.anInt65 * 1;
	anInt74 = class8_159_.anInt74 * 1;
	anInt75 = 1 * class8_159_.anInt75;
	anInt81 = 1 * class8_159_.anInt81;
	anInt92 = class8_159_.anInt92 * 1;
	anInt128 = class8_159_.anInt128 * 1;
	anInt95 = 1 * class8_159_.anInt95;
	Class8 class8_161_
	    = Class22.aClass22_216 == class22 ? class8_159_ : class8_160_;
	aShortArray67 = class8_161_.aShortArray67;
	aShortArray68 = class8_161_.aShortArray68;
	aByteArray117 = class8_161_.aByteArray117;
	aShortArray70 = class8_161_.aShortArray70;
	aShortArray71 = class8_161_.aShortArray71;
	aString66 = class8_160_.aString66;
	aBool83 = class8_160_.aBool83;
	if (Class22.aClass22_216 == class22) {
	    anInt73 = 1 * class8_160_.anInt73;
	    anInt56 = -1043775721;
	    if (class8_160_.aBool125)
		aBool80 = false;
	    else
		aBool80 = class8_160_.aBool80;
	} else if (class22 == Class22.aClass22_217) {
	    aString66 = class8_160_.aString115;
	    anInt73
		= ((int) Math.floor((double) (class8_160_.anInt73 * 1345227511
					      / (-1711875303
						 * class8_160_.anInt116)))
		   * -600484153);
	    anInt56 = -1043775721;
	    aBool123 = class8_160_.aBool123;
	    aBool80 = class8_160_.aBool80;
	    anInt64 = 1 * class8_159_.anInt64;
	    anIntArray86 = class8_159_.anIntArray86;
	    anIntArray87 = class8_159_.anIntArray87;
	    aStringArray85 = new String[5];
	    aStringArray85[0]
		= Class53.aClass53_392.method1169(class666, 1552651121);
	    aStringArray85[4] = class53.method1169(class666, 1552651121);
	} else {
	    anInt73 = 0;
	    anInt56 = class8_160_.anInt56 * 1;
	    aBool80 = false;
	    anInt72 = class8_160_.anInt72 * 1;
	    anInt99 = 1 * class8_160_.anInt99;
	    anInt112 = class8_160_.anInt112 * 1;
	    anInt78 = class8_160_.anInt78 * 1;
	    anInt91 = class8_160_.anInt91 * 1;
	    anInt82 = class8_160_.anInt82 * 1;
	    anInt93 = 1 * class8_160_.anInt93;
	    anInt94 = 1 * class8_160_.anInt94;
	    anInt62 = class8_160_.anInt62 * 1;
	    anInt97 = class8_160_.anInt97 * 1;
	    anInt109 = 1 * class8_160_.anInt109;
	    anInt76 = 1 * class8_160_.anInt76;
	    anInt100 = 1 * class8_160_.anInt100;
	    anInt101 = 1 * class8_160_.anInt101;
	    anInt102 = 1 * class8_160_.anInt102;
	    anInt103 = 1 * class8_160_.anInt103;
	    anInt104 = 1 * class8_160_.anInt104;
	    anInt105 = 1 * class8_160_.anInt105;
	    anInt106 = class8_160_.anInt106 * 1;
	    anInt64 = class8_160_.anInt64 * 1;
	    anInt88 = 1 * class8_160_.anInt88;
	    aStringArray84 = class8_160_.aStringArray84;
	    aClass10_127 = class8_160_.aClass10_127;
	    aStringArray85 = new String[5];
	    if (class8_160_.aStringArray85 != null) {
		for (int i = 0; i < 4; i++)
		    aStringArray85[i] = class8_160_.aStringArray85[i];
	    }
	    aStringArray85[4] = class53.method1169(class666, 1552651121);
	}
    }
    
    void method636(Class22 class22, Class8 class8_162_, Class8 class8_163_,
		   Class53 class53, Class666 class666) {
	anInt65 = class8_162_.anInt65 * 1;
	anInt74 = class8_162_.anInt74 * 1;
	anInt75 = 1 * class8_162_.anInt75;
	anInt81 = 1 * class8_162_.anInt81;
	anInt92 = class8_162_.anInt92 * 1;
	anInt128 = class8_162_.anInt128 * 1;
	anInt95 = 1 * class8_162_.anInt95;
	Class8 class8_164_
	    = Class22.aClass22_216 == class22 ? class8_162_ : class8_163_;
	aShortArray67 = class8_164_.aShortArray67;
	aShortArray68 = class8_164_.aShortArray68;
	aByteArray117 = class8_164_.aByteArray117;
	aShortArray70 = class8_164_.aShortArray70;
	aShortArray71 = class8_164_.aShortArray71;
	aString66 = class8_163_.aString66;
	aBool83 = class8_163_.aBool83;
	if (Class22.aClass22_216 == class22) {
	    anInt73 = 1 * class8_163_.anInt73;
	    anInt56 = -1043775721;
	    if (class8_163_.aBool125)
		aBool80 = false;
	    else
		aBool80 = class8_163_.aBool80;
	} else if (class22 == Class22.aClass22_217) {
	    aString66 = class8_163_.aString115;
	    anInt73
		= ((int) Math.floor((double) (class8_163_.anInt73 * 1345227511
					      / (-1711875303
						 * class8_163_.anInt116)))
		   * -600484153);
	    anInt56 = -1043775721;
	    aBool123 = class8_163_.aBool123;
	    aBool80 = class8_163_.aBool80;
	    anInt64 = 1 * class8_162_.anInt64;
	    anIntArray86 = class8_162_.anIntArray86;
	    anIntArray87 = class8_162_.anIntArray87;
	    aStringArray85 = new String[5];
	    aStringArray85[0]
		= Class53.aClass53_392.method1169(class666, 1552651121);
	    aStringArray85[4] = class53.method1169(class666, 1552651121);
	} else {
	    anInt73 = 0;
	    anInt56 = class8_163_.anInt56 * 1;
	    aBool80 = false;
	    anInt72 = class8_163_.anInt72 * 1;
	    anInt99 = 1 * class8_163_.anInt99;
	    anInt112 = class8_163_.anInt112 * 1;
	    anInt78 = class8_163_.anInt78 * 1;
	    anInt91 = class8_163_.anInt91 * 1;
	    anInt82 = class8_163_.anInt82 * 1;
	    anInt93 = 1 * class8_163_.anInt93;
	    anInt94 = 1 * class8_163_.anInt94;
	    anInt62 = class8_163_.anInt62 * 1;
	    anInt97 = class8_163_.anInt97 * 1;
	    anInt109 = 1 * class8_163_.anInt109;
	    anInt76 = 1 * class8_163_.anInt76;
	    anInt100 = 1 * class8_163_.anInt100;
	    anInt101 = 1 * class8_163_.anInt101;
	    anInt102 = 1 * class8_163_.anInt102;
	    anInt103 = 1 * class8_163_.anInt103;
	    anInt104 = 1 * class8_163_.anInt104;
	    anInt105 = 1 * class8_163_.anInt105;
	    anInt106 = class8_163_.anInt106 * 1;
	    anInt64 = class8_163_.anInt64 * 1;
	    anInt88 = 1 * class8_163_.anInt88;
	    aStringArray84 = class8_163_.aStringArray84;
	    aClass10_127 = class8_163_.aClass10_127;
	    aStringArray85 = new String[5];
	    if (class8_163_.aStringArray85 != null) {
		for (int i = 0; i < 4; i++)
		    aStringArray85[i] = class8_163_.aStringArray85[i];
	    }
	    aStringArray85[4] = class53.method1169(class666, 1552651121);
	}
    }
    
    public final Class179 method637
	(Class182 class182, int i, int i_165_, Class637 class637,
	 Class689 class689, int i_166_, int i_167_, int i_168_, int i_169_) {
	if (null != anIntArray107 && i_165_ > 1) {
	    int i_170_ = -1;
	    for (int i_171_ = 0; i_171_ < 10; i_171_++) {
		if (i_165_ >= anIntArray108[i_171_]
		    && anIntArray108[i_171_] != 0)
		    i_170_ = anIntArray107[i_171_];
	    }
	    if (i_170_ != -1)
		return (((Class8)
			 anInterface13_61.method76(i_170_, -267343121))
			    .method616
			(class182, i, 1, class637, class689, i_166_, i_167_,
			 i_168_, i_169_, -1913836698));
	}
	int i_172_ = i;
	if (null != class689)
	    i_172_ |= class689.method14033(-1593270230);
	Class179 class179;
	synchronized (aClass17_55.aClass200_197) {
	    class179 = ((Class179)
			(aClass17_55.aClass200_197.method3785
			 ((long) (1736248109 * anInt63
				  | -2117565327 * class182.anInt1942 << 29))));
	}
	if (null == class179
	    || class182.method3321(class179.method2928(), i_172_) != 0) {
	    if (null != class179)
		i_172_ = class182.method3229(i_172_, class179.method2928());
	    int i_173_ = i_172_;
	    if (aShortArray70 != null)
		i_173_ |= 0x8000;
	    if (null != aShortArray67 || null != class637)
		i_173_ |= 0x4000;
	    if (anInt122 * -311590649 != 128)
		i_173_ |= 0x1;
	    if (anInt118 * -207729681 != 128)
		i_173_ |= 0x2;
	    if (128 != -994464071 * anInt119)
		i_173_ |= 0x4;
	    Class186 class186 = Class186.method3644(aClass17_55.aClass458_191,
						    -1870434119 * anInt65, 0);
	    if (null == class186)
		return null;
	    if (class186.anInt2086 < 13)
		class186.method3651(2);
	    class179 = class182.method3556(class186, i_173_,
					   1509051035 * aClass17_55.anInt196,
					   64 + anInt120 * -358510299,
					   850 + anInt121 * 1692172521);
	    if (anInt122 * -311590649 != 128 || -207729681 * anInt118 != 128
		|| 128 != anInt119 * -994464071)
		class179.method2936(-311590649 * anInt122,
				    anInt118 * -207729681,
				    anInt119 * -994464071);
	    if (null != aShortArray67) {
		for (int i_174_ = 0; i_174_ < aShortArray67.length; i_174_++) {
		    if (aByteArray117 != null && i_174_ < aByteArray117.length)
			class179.method2971(aShortArray67[i_174_],
					    (aShortArray96
					     [aByteArray117[i_174_] & 0xff]));
		    else
			class179.method2971(aShortArray67[i_174_],
					    aShortArray68[i_174_]);
		}
	    }
	    if (null != aShortArray70) {
		for (int i_175_ = 0; i_175_ < aShortArray70.length; i_175_++)
		    class179.method2973(aShortArray70[i_175_],
					aShortArray71[i_175_]);
	    }
	    if (null != class637) {
		for (int i_176_ = 0; i_176_ < 10; i_176_++) {
		    for (int i_177_ = 0;
			 i_177_ < (Class198_Sub18.aShortArrayArray9988
				   [i_176_]).length;
			 i_177_++) {
			if (class637.anIntArray8301[i_176_]
			    < (Class525_Sub6.aShortArrayArrayArray10485[i_176_]
			       [i_177_]).length)
			    class179.method2971((Class198_Sub18
						 .aShortArrayArray9988[i_176_]
						 [i_177_]),
						(Class525_Sub6
						 .aShortArrayArrayArray10485
						 [i_176_][i_177_]
						 [(class637.anIntArray8301
						   [i_176_])]));
		    }
		}
		for (int i_178_ = 0; i_178_ < 10; i_178_++) {
		    for (int i_179_ = 0;
			 i_179_ < Class477.aShortArrayArray5199[i_178_].length;
			 i_179_++) {
			if (class637.anIntArray8298[i_178_]
			    < (Class522_Sub1.aShortArrayArrayArray10395[i_178_]
			       [i_179_]).length)
			    class179.method2973((Class477.aShortArrayArray5199
						 [i_178_][i_179_]),
						(Class522_Sub1
						 .aShortArrayArrayArray10395
						 [i_178_][i_179_]
						 [(class637.anIntArray8298
						   [i_178_])]));
		    }
		}
	    }
	    class179.method3010(i_172_);
	    synchronized (aClass17_55.aClass200_197) {
		aClass17_55.aClass200_197.method3788
		    (class179,
		     (long) (1736248109 * anInt63
			     | class182.anInt1942 * -2117565327 << 29));
	    }
	}
	if (null != class689 || i_169_ != 0) {
	    class179 = class179.method2926((byte) 1, i_172_, true);
	    if (class689 != null)
		class689.method14034(class179, 0, 1683852278);
	    if (0 != i_169_)
		class179.method2974(i_166_, i_167_, i_168_, i_169_);
	}
	class179.method3010(i);
	return class179;
    }
    
    public int method638(int i, int i_180_) {
	if (null == anIntArray87)
	    return -1;
	return anIntArray87[i];
    }
    
    void method639(Class8 class8_181_, Class8 class8_182_, Class666 class666,
		   int i) {
	method663(Class22.aClass22_216, class8_181_, class8_182_, null,
		  class666, 1431683201);
    }
    
    int[] method640(int[] is, int i) {
	int[] is_183_ = new int[1152];
	int i_184_ = 0;
	for (int i_185_ = 0; i_185_ < 32; i_185_++) {
	    for (int i_186_ = 0; i_186_ < 36; i_186_++) {
		int i_187_ = is[i_184_];
		if (i_187_ == 0) {
		    if (i_186_ > 0 && is[i_184_ - 1] != 0)
			i_187_ = i;
		    else if (i_185_ > 0 && is[i_184_ - 36] != 0)
			i_187_ = i;
		    else if (i_186_ < 35 && 0 != is[1 + i_184_])
			i_187_ = i;
		    else if (i_185_ < 31 && is[36 + i_184_] != 0)
			i_187_ = i;
		}
		is_183_[i_184_++] = i_187_;
	    }
	}
	return is_183_;
    }
    
    public String method641(int i, String string, byte i_188_) {
	if (aClass10_127 == null)
	    return string;
	Class525_Sub19 class525_sub19
	    = (Class525_Sub19) aClass10_127.method684((long) i);
	if (null == class525_sub19)
	    return string;
	return (String) class525_sub19.anObject10571;
    }
    
    void method642(Class8 class8_189_, Class8 class8_190_, Class666 class666) {
	method663(Class22.aClass22_216, class8_189_, class8_190_, null,
		  class666, 1942761155);
    }
    
    void method643(Class22 class22, Class8 class8_191_, Class8 class8_192_,
		   Class53 class53, Class666 class666) {
	anInt65 = class8_191_.anInt65 * 1;
	anInt74 = class8_191_.anInt74 * 1;
	anInt75 = 1 * class8_191_.anInt75;
	anInt81 = 1 * class8_191_.anInt81;
	anInt92 = class8_191_.anInt92 * 1;
	anInt128 = class8_191_.anInt128 * 1;
	anInt95 = 1 * class8_191_.anInt95;
	Class8 class8_193_
	    = Class22.aClass22_216 == class22 ? class8_191_ : class8_192_;
	aShortArray67 = class8_193_.aShortArray67;
	aShortArray68 = class8_193_.aShortArray68;
	aByteArray117 = class8_193_.aByteArray117;
	aShortArray70 = class8_193_.aShortArray70;
	aShortArray71 = class8_193_.aShortArray71;
	aString66 = class8_192_.aString66;
	aBool83 = class8_192_.aBool83;
	if (Class22.aClass22_216 == class22) {
	    anInt73 = 1 * class8_192_.anInt73;
	    anInt56 = -1043775721;
	    if (class8_192_.aBool125)
		aBool80 = false;
	    else
		aBool80 = class8_192_.aBool80;
	} else if (class22 == Class22.aClass22_217) {
	    aString66 = class8_192_.aString115;
	    anInt73
		= ((int) Math.floor((double) (class8_192_.anInt73 * 1345227511
					      / (-1711875303
						 * class8_192_.anInt116)))
		   * -600484153);
	    anInt56 = -1043775721;
	    aBool123 = class8_192_.aBool123;
	    aBool80 = class8_192_.aBool80;
	    anInt64 = 1 * class8_191_.anInt64;
	    anIntArray86 = class8_191_.anIntArray86;
	    anIntArray87 = class8_191_.anIntArray87;
	    aStringArray85 = new String[5];
	    aStringArray85[0]
		= Class53.aClass53_392.method1169(class666, 1552651121);
	    aStringArray85[4] = class53.method1169(class666, 1552651121);
	} else {
	    anInt73 = 0;
	    anInt56 = class8_192_.anInt56 * 1;
	    aBool80 = false;
	    anInt72 = class8_192_.anInt72 * 1;
	    anInt99 = 1 * class8_192_.anInt99;
	    anInt112 = class8_192_.anInt112 * 1;
	    anInt78 = class8_192_.anInt78 * 1;
	    anInt91 = class8_192_.anInt91 * 1;
	    anInt82 = class8_192_.anInt82 * 1;
	    anInt93 = 1 * class8_192_.anInt93;
	    anInt94 = 1 * class8_192_.anInt94;
	    anInt62 = class8_192_.anInt62 * 1;
	    anInt97 = class8_192_.anInt97 * 1;
	    anInt109 = 1 * class8_192_.anInt109;
	    anInt76 = 1 * class8_192_.anInt76;
	    anInt100 = 1 * class8_192_.anInt100;
	    anInt101 = 1 * class8_192_.anInt101;
	    anInt102 = 1 * class8_192_.anInt102;
	    anInt103 = 1 * class8_192_.anInt103;
	    anInt104 = 1 * class8_192_.anInt104;
	    anInt105 = 1 * class8_192_.anInt105;
	    anInt106 = class8_192_.anInt106 * 1;
	    anInt64 = class8_192_.anInt64 * 1;
	    anInt88 = 1 * class8_192_.anInt88;
	    aStringArray84 = class8_192_.aStringArray84;
	    aClass10_127 = class8_192_.aClass10_127;
	    aStringArray85 = new String[5];
	    if (class8_192_.aStringArray85 != null) {
		for (int i = 0; i < 4; i++)
		    aStringArray85[i] = class8_192_.aStringArray85[i];
	    }
	    aStringArray85[4] = class53.method1169(class666, 1552651121);
	}
    }
    
    public int method644(int i) {
	if (null == anIntArray87)
	    return -1;
	return anIntArray87[i];
    }
    
    void method645(Class8 class8_194_, Class8 class8_195_, Class666 class666) {
	method663(Class22.aClass22_216, class8_194_, class8_195_, null,
		  class666, -942789369);
    }
    
    public Class8 method646(int i) {
	if (anIntArray107 != null && i > 1) {
	    int i_196_ = -1;
	    for (int i_197_ = 0; i_197_ < 10; i_197_++) {
		if (i >= anIntArray108[i_197_] && 0 != anIntArray108[i_197_])
		    i_196_ = anIntArray107[i_197_];
	    }
	    if (-1 != i_196_)
		return (Class8) anInterface13_61.method76(i_196_, 1983239192);
	}
	return this;
    }
    
    public Class8 method647(int i) {
	if (anIntArray107 != null && i > 1) {
	    int i_198_ = -1;
	    for (int i_199_ = 0; i_199_ < 10; i_199_++) {
		if (i >= anIntArray108[i_199_] && 0 != anIntArray108[i_199_])
		    i_198_ = anIntArray107[i_199_];
	    }
	    if (-1 != i_198_)
		return (Class8) anInterface13_61.method76(i_198_, 1140109349);
	}
	return this;
    }
    
    public Class8 method648(int i) {
	if (anIntArray107 != null && i > 1) {
	    int i_200_ = -1;
	    for (int i_201_ = 0; i_201_ < 10; i_201_++) {
		if (i >= anIntArray108[i_201_] && 0 != anIntArray108[i_201_])
		    i_200_ = anIntArray107[i_201_];
	    }
	    if (-1 != i_200_)
		return (Class8) anInterface13_61.method76(i_200_, 36119426);
	}
	return this;
    }
    
    void method649(Class8 class8_202_, Class8 class8_203_, Class666 class666) {
	method663(Class22.aClass22_215, class8_202_, class8_203_,
		  Class53.aClass53_388, class666, -1067159235);
    }
    
    public void method66(RSBuffer class525_sub38, int i) {
	aBool80 = true;
	for (;;) {
	    int i_204_ = class525_sub38.readUnsignedByte(984991069);
	    if (0 == i_204_)
		break;
	    method630(class525_sub38, i_204_, (byte) 1);
	}
    }
    
    int[] method650(Class182 class182, Class182 class182_205_, int i,
		    int i_206_, int i_207_, boolean bool, int i_208_,
		    Class175 class175, Class637 class637, Class631 class631) {
	Class186 class186 = Class186.method3644(aClass17_55.aClass458_191,
						anInt65 * -1870434119, 0);
	if (null == class186)
	    return null;
	if (class186.anInt2086 < 13)
	    class186.method3651(2);
	if (aShortArray67 != null) {
	    for (int i_209_ = 0; i_209_ < aShortArray67.length; i_209_++) {
		if (aByteArray117 != null && i_209_ < aByteArray117.length)
		    class186.method3631(aShortArray67[i_209_],
					(aShortArray96
					 [aByteArray117[i_209_] & 0xff]));
		else
		    class186.method3631(aShortArray67[i_209_],
					aShortArray68[i_209_]);
	    }
	}
	if (null != aShortArray70) {
	    for (int i_210_ = 0; i_210_ < aShortArray70.length; i_210_++)
		class186.method3632(aShortArray70[i_210_],
				    aShortArray71[i_210_]);
	}
	if (null != class637) {
	    for (int i_211_ = 0; i_211_ < 10; i_211_++) {
		for (int i_212_ = 0;
		     (i_212_
		      < Class198_Sub18.aShortArrayArray9988[i_211_].length);
		     i_212_++) {
		    if (class637.anIntArray8301[i_211_]
			< (Class525_Sub6.aShortArrayArrayArray10485[i_211_]
			   [i_212_]).length)
			class186.method3631((Class198_Sub18
					     .aShortArrayArray9988[i_211_]
					     [i_212_]),
					    (Class525_Sub6
					     .aShortArrayArrayArray10485
					     [i_211_][i_212_]
					     [(class637.anIntArray8301
					       [i_211_])]));
		}
	    }
	    for (int i_213_ = 0; i_213_ < 10; i_213_++) {
		for (int i_214_ = 0;
		     i_214_ < Class477.aShortArrayArray5199[i_213_].length;
		     i_214_++) {
		    if (class637.anIntArray8298[i_213_]
			< (Class522_Sub1.aShortArrayArrayArray10395[i_213_]
			   [i_214_]).length)
			class186.method3632
			    (Class477.aShortArrayArray5199[i_213_][i_214_],
			     (Class522_Sub1.aShortArrayArrayArray10395[i_213_]
			      [i_214_][class637.anIntArray8298[i_213_]]));
		}
	    }
	}
	int i_215_ = 2048;
	boolean bool_216_ = false;
	if (128 != -311590649 * anInt122 || -207729681 * anInt118 != 128
	    || 128 != -994464071 * anInt119) {
	    bool_216_ = true;
	    i_215_ |= 0x7;
	}
	Class179 class179 = class182.method3556(class186, i_215_, 64,
						64 + anInt120 * -358510299,
						768 + anInt121 * 1692172521);
	if (!class179.method2924())
	    return null;
	if (bool_216_)
	    class179.method2936(anInt122 * -311590649, anInt118 * -207729681,
				-994464071 * anInt119);
	Class157 class157 = null;
	if (-1 != -1095552769 * anInt77) {
	    class157
		= aClass17_55.method787(class182, class182_205_,
					-1210387357 * anInt59, 10, 1, 0, true,
					true, 0, class175, class637, class631,
					anInterface13_61, -1187651446);
	    if (null == class157)
		return null;
	} else if (-1 != 2020962253 * anInt98) {
	    class157 = aClass17_55.method787(class182, class182_205_,
					     1088959965 * anInt111, i, i_206_,
					     i_207_, false, true, 0, class175,
					     class637, class631,
					     anInterface13_61, -1187651446);
	    if (class157 == null)
		return null;
	} else if (1860754759 * anInt131 != -1) {
	    class157 = aClass17_55.method787(class182, class182_205_,
					     45619687 * anInt135, i, i_206_,
					     i_207_, false, true, 0, class175,
					     class637, class631,
					     anInterface13_61, -1187651446);
	    if (class157 == null)
		return null;
	} else if (-1 != anInt114 * 195314511) {
	    class157
		= aClass17_55.method787(class182, class182_205_,
					593405105 * anInt113, 10, 1, 0, true,
					true, 0, class175, class637, class631,
					anInterface13_61, -1187651446);
	    if (class157 == null)
		return null;
	}
	int i_217_;
	if (bool)
	    i_217_ = (int) ((double) (-1048035637 * anInt74) * 1.5) << 2;
	else if (2 == i_206_)
	    i_217_ = (int) (1.04 * (double) (anInt74 * -1048035637)) << 2;
	else
	    i_217_ = anInt74 * -1048035637 << 2;
	Class435 class435 = class182.method3237();
	Class435 class435_218_ = class182.method3224();
	class435_218_.method6963(16.0F, 16.0F, 512.0F, 512.0F, 50.0F,
				 2.14748365E9F,
				 (float) class182.method3566(579099046)
					     .method2710(),
				 (float) class182.method3566(-1112671251)
					     .method2711());
	class182.method3252(class435_218_);
	class182.method3277(0, 0, class182.method3566(-979457382).method2710(),
			    class182.method3566(-494739594).method2711());
	Class444 class444 = new Class444();
	class182.method3233(class444);
	class182.method3351(0.95F + (float) (Math.random() / 10.0));
	class182.method3307(16777215, 0.95F + (float) (Math.random() / 10.0),
			    0.95F + (float) (Math.random() / 10.0), -50.0F,
			    -10.0F, -50.0F);
	Class444 class444_219_ = class182.method3225();
	class444_219_.method7141(0.0F, 0.0F, 1.0F,
				 Class436
				     .method7071(-(anInt92 * 968302009) << 3));
	class444_219_.method7142(0.0F, 1.0F, 0.0F,
				 Class436
				     .method7071(795105987 * anInt81 << 3));
	class444_219_.method7147((float) (-905924017 * anInt128 << 2),
				 (float) (((i_217_
					    * (Class436.anIntArray4831
					       [anInt75 * -1891985835 << 3]))
					   >> 14)
					  - class179.method2960() / 2
					  + (-1874228003 * anInt95 << 2)),
				 (float) ((anInt95 * -1874228003 << 2)
					  + ((i_217_
					      * (Class436.anIntArray4838
						 [anInt75 * -1891985835 << 3]))
					     >> 14)));
	class444_219_.method7142(1.0F, 0.0F, 0.0F,
				 Class436
				     .method7071(-1891985835 * anInt75 << 3));
	class182.method3184(0, 0, 36, 32);
	class182.method3188(2, 0);
	class182.method3151(0, 0, 36, 32, 0, 0);
	class182.method3140(0, -1, 0);
	class179.method2953(class444_219_, null, 1);
	class182.method3252(class435);
	int[] is = class182.method3165(0, 0, 36, 32);
	if (i_206_ >= 1) {
	    is = method623(is, -16777214, 420091564);
	    if (i_206_ >= 2)
		is = method623(is, -1, -514291692);
	}
	if (i_207_ != 0)
	    method624(is, i_207_, 1644773015);
	if (-1 != 2020962253 * anInt98)
	    class157.method2518(0, 0);
	else if (anInt131 * 1860754759 != -1)
	    class157.method2518(0, 0);
	class182.method3215(is, 0, 36, 36, 32, (byte) 22).method2518(0, 0);
	if (anInt77 * -1095552769 != -1)
	    class157.method2518(0, 0);
	if (-1 != 195314511 * anInt114)
	    class157.method2518(0, 0);
	if (1 == i_208_
	    || i_208_ == 2 && (anInt56 * 1051584679 == 1 || i != 1) && i != -1)
	    class175.method2851(Class272.method5026(i,
						    aClass17_55.aClass666_198,
						    class631, 711179182),
				0, 9, -256, -16777215, -20349386);
	is = class182.method3165(0, 0, 36, 32);
	for (int i_220_ = 0; i_220_ < is.length; i_220_++) {
	    if ((is[i_220_] & 0xffffff) == 0)
		is[i_220_] = 0;
	    else
		is[i_220_] |= ~0xffffff;
	}
	return is;
    }
    
    Class8(int i, Interface13 interface13, Class17 class17) {
	anInt95 = 0;
	anInt56 = 0;
	anInt60 = -238325389;
	anInt73 = -600484153;
	aBool83 = false;
	anInt72 = -1698134569;
	anInt99 = 1428809531;
	anInt112 = 1036310425;
	anInt78 = -427862367;
	anInt91 = -1614544313;
	anInt93 = -822618699;
	anInt94 = -119633319;
	anInt82 = 634716401;
	anInt62 = -960174031;
	anInt97 = 0;
	anInt109 = 0;
	anInt76 = 0;
	anInt100 = 0;
	anInt101 = 0;
	anInt102 = 0;
	anInt103 = 650583795;
	anInt104 = 206769113;
	anInt105 = 1042740253;
	anInt106 = 676341355;
	anInt77 = -552324863;
	anInt59 = 619238069;
	anInt111 = -2020330101;
	anInt98 = -1319965957;
	anInt113 = 1418386351;
	anInt114 = -1737421743;
	aString115 = "null";
	anInt116 = 0;
	anInt122 = -1039246464;
	anInt118 = -484341888;
	anInt119 = 2063320192;
	anInt120 = 0;
	anInt121 = 0;
	anInt88 = 0;
	aBool123 = false;
	aBool80 = false;
	aBool125 = false;
	anInt126 = 0;
	anInt129 = 0;
	anInt135 = 707139113;
	anInt131 = -1933032567;
	aBool90 = false;
	aBool134 = false;
	anInt63 = i * -1917420379;
	anInterface13_61 = interface13;
	aClass17_55 = class17;
	aStringArray84 = (String[]) aClass17_55.aStringArray195.clone();
	aStringArray85 = (String[]) aClass17_55.aStringArray192.clone();
    }
    
    int[] method651(int[] is, int i) {
	int[] is_221_ = new int[1152];
	int i_222_ = 0;
	for (int i_223_ = 0; i_223_ < 32; i_223_++) {
	    for (int i_224_ = 0; i_224_ < 36; i_224_++) {
		int i_225_ = is[i_222_];
		if (i_225_ == 0) {
		    if (i_224_ > 0 && is[i_222_ - 1] != 0)
			i_225_ = i;
		    else if (i_223_ > 0 && is[i_222_ - 36] != 0)
			i_225_ = i;
		    else if (i_224_ < 35 && 0 != is[1 + i_222_])
			i_225_ = i;
		    else if (i_223_ < 31 && is[36 + i_222_] != 0)
			i_225_ = i;
		}
		is_221_[i_222_++] = i_225_;
	    }
	}
	return is_221_;
    }
    
    int[] method652(int[] is, int i) {
	int[] is_226_ = new int[1152];
	int i_227_ = 0;
	for (int i_228_ = 0; i_228_ < 32; i_228_++) {
	    for (int i_229_ = 0; i_229_ < 36; i_229_++) {
		int i_230_ = is[i_227_];
		if (i_230_ == 0) {
		    if (i_229_ > 0 && is[i_227_ - 1] != 0)
			i_230_ = i;
		    else if (i_228_ > 0 && is[i_227_ - 36] != 0)
			i_230_ = i;
		    else if (i_229_ < 35 && 0 != is[1 + i_227_])
			i_230_ = i;
		    else if (i_228_ < 31 && is[36 + i_227_] != 0)
			i_230_ = i;
		}
		is_226_[i_227_++] = i_230_;
	    }
	}
	return is_226_;
    }
    
    public final Class186 method653(boolean bool, Class2 class2, int i) {
	int i_231_;
	int i_232_;
	int i_233_;
	if (bool) {
	    if (class2 != null && class2.anIntArray16 != null) {
		i_231_ = class2.anIntArray16[0];
		i_232_ = class2.anIntArray16[1];
		i_233_ = class2.anIntArray16[2];
	    } else {
		i_231_ = -1747988637 * anInt93;
		i_232_ = anInt94 * 49799703;
		i_233_ = -2096722129 * anInt62;
	    }
	} else if (null != class2 && null != class2.anIntArray22) {
	    i_231_ = class2.anIntArray22[0];
	    i_232_ = class2.anIntArray22[1];
	    i_233_ = class2.anIntArray22[2];
	} else {
	    i_231_ = 1508242079 * anInt78;
	    i_232_ = -1343555447 * anInt91;
	    i_233_ = 74846191 * anInt82;
	}
	if (-1 == i_231_)
	    return null;
	Class186 class186
	    = Class186.method3644(aClass17_55.aClass458_191, i_231_, 0);
	if (class186 == null)
	    return null;
	if (class186.anInt2086 < 13)
	    class186.method3651(2);
	if (i_232_ != -1) {
	    Class186 class186_234_
		= Class186.method3644(aClass17_55.aClass458_191, i_232_, 0);
	    if (class186_234_.anInt2086 < 13)
		class186_234_.method3651(2);
	    if (-1 != i_233_) {
		Class186 class186_235_
		    = Class186.method3644(aClass17_55.aClass458_191, i_233_,
					  0);
		if (class186_235_.anInt2086 < 13)
		    class186_235_.method3651(2);
		Class186[] class186s
		    = { class186, class186_234_, class186_235_ };
		class186 = new Class186(class186s, 3);
	    } else {
		Class186[] class186s = { class186, class186_234_ };
		class186 = new Class186(class186s, 2);
	    }
	}
	if (!bool && (0 != -28551157 * anInt97 || 0 != 120392701 * anInt76
		      || 0 != 284873411 * anInt101))
	    class186.method3633(-28551157 * anInt97, anInt76 * 120392701,
				284873411 * anInt101);
	if (bool && (-2107595113 * anInt109 != 0 || 0 != anInt100 * -2077724305
		     || 785281665 * anInt102 != 0))
	    class186.method3633(-2107595113 * anInt109, anInt100 * -2077724305,
				anInt102 * 785281665);
	if (null != aShortArray67) {
	    short[] is;
	    if (class2 != null && null != class2.aShortArray24)
		is = class2.aShortArray24;
	    else
		is = aShortArray68;
	    for (int i_236_ = 0; i_236_ < aShortArray67.length; i_236_++)
		class186.method3631(aShortArray67[i_236_], is[i_236_]);
	}
	if (aShortArray70 != null) {
	    short[] is;
	    if (class2 != null && class2.aShortArray21 != null)
		is = class2.aShortArray21;
	    else
		is = aShortArray71;
	    for (int i_237_ = 0; i_237_ < aShortArray70.length; i_237_++)
		class186.method3632(aShortArray70[i_237_], is[i_237_]);
	}
	return class186;
    }
    
    static String method654(int i, Class666 class666, Class631 class631) {
	if (i < 100000)
	    return new StringBuilder().append
		       (Class459.method7583(1746106145 * class631.anInt8193,
					    (byte) -67))
		       .append
		       (i).append
		       (aString89).toString();
	if (i < 10000000)
	    return new StringBuilder().append
		       (Class459.method7583(class631.anInt8194 * -1075664863,
					    (byte) -97))
		       .append
		       (i / 1000).append
		       (Class53.aClass53_524.method1169(class666, 1552651121))
		       .append
		       (aString89).toString();
	return new StringBuilder().append
		   (Class459.method7583(class631.anInt8173 * -266050813,
					(byte) -64))
		   .append
		   (i / 1000000).append
		   (Class53.aClass53_546.method1169(class666, 1552651121))
		   .append
		   (aString89).toString();
    }
    
    static String method655(int i, Class666 class666, Class631 class631) {
	if (i < 100000)
	    return new StringBuilder().append
		       (Class459.method7583(1746106145 * class631.anInt8193,
					    (byte) -69))
		       .append
		       (i).append
		       (aString89).toString();
	if (i < 10000000)
	    return new StringBuilder().append
		       (Class459.method7583(class631.anInt8194 * -1075664863,
					    (byte) -56))
		       .append
		       (i / 1000).append
		       (Class53.aClass53_524.method1169(class666, 1552651121))
		       .append
		       (aString89).toString();
	return new StringBuilder().append
		   (Class459.method7583(class631.anInt8173 * -266050813,
					(byte) -121))
		   .append
		   (i / 1000000).append
		   (Class53.aClass53_546.method1169(class666, 1552651121))
		   .append
		   (aString89).toString();
    }
    
    static String method656(int i) {
	return new StringBuilder().append("<col=").append
		   (Integer.toHexString(i)).append
		   (">").toString();
    }
    
    static String method657(int i) {
	return new StringBuilder().append("<col=").append
		   (Integer.toHexString(i)).append
		   (">").toString();
    }
    
    public final Class186 method658(boolean bool, Class2 class2) {
	int i;
	int i_238_;
	int i_239_;
	if (bool) {
	    if (class2 != null && class2.anIntArray16 != null) {
		i = class2.anIntArray16[0];
		i_238_ = class2.anIntArray16[1];
		i_239_ = class2.anIntArray16[2];
	    } else {
		i = -1747988637 * anInt93;
		i_238_ = anInt94 * 49799703;
		i_239_ = -2096722129 * anInt62;
	    }
	} else if (null != class2 && null != class2.anIntArray22) {
	    i = class2.anIntArray22[0];
	    i_238_ = class2.anIntArray22[1];
	    i_239_ = class2.anIntArray22[2];
	} else {
	    i = 1508242079 * anInt78;
	    i_238_ = -1343555447 * anInt91;
	    i_239_ = 74846191 * anInt82;
	}
	if (-1 == i)
	    return null;
	Class186 class186
	    = Class186.method3644(aClass17_55.aClass458_191, i, 0);
	if (class186 == null)
	    return null;
	if (class186.anInt2086 < 13)
	    class186.method3651(2);
	if (i_238_ != -1) {
	    Class186 class186_240_
		= Class186.method3644(aClass17_55.aClass458_191, i_238_, 0);
	    if (class186_240_.anInt2086 < 13)
		class186_240_.method3651(2);
	    if (-1 != i_239_) {
		Class186 class186_241_
		    = Class186.method3644(aClass17_55.aClass458_191, i_239_,
					  0);
		if (class186_241_.anInt2086 < 13)
		    class186_241_.method3651(2);
		Class186[] class186s
		    = { class186, class186_240_, class186_241_ };
		class186 = new Class186(class186s, 3);
	    } else {
		Class186[] class186s = { class186, class186_240_ };
		class186 = new Class186(class186s, 2);
	    }
	}
	if (!bool && (0 != -28551157 * anInt97 || 0 != 120392701 * anInt76
		      || 0 != 284873411 * anInt101))
	    class186.method3633(-28551157 * anInt97, anInt76 * 120392701,
				284873411 * anInt101);
	if (bool && (-2107595113 * anInt109 != 0 || 0 != anInt100 * -2077724305
		     || 785281665 * anInt102 != 0))
	    class186.method3633(-2107595113 * anInt109, anInt100 * -2077724305,
				anInt102 * 785281665);
	if (null != aShortArray67) {
	    short[] is;
	    if (class2 != null && null != class2.aShortArray24)
		is = class2.aShortArray24;
	    else
		is = aShortArray68;
	    for (int i_242_ = 0; i_242_ < aShortArray67.length; i_242_++)
		class186.method3631(aShortArray67[i_242_], is[i_242_]);
	}
	if (aShortArray70 != null) {
	    short[] is;
	    if (class2 != null && class2.aShortArray21 != null)
		is = class2.aShortArray21;
	    else
		is = aShortArray71;
	    for (int i_243_ = 0; i_243_ < aShortArray70.length; i_243_++)
		class186.method3632(aShortArray70[i_243_], is[i_243_]);
	}
	return class186;
    }
    
    public final boolean method659(boolean bool, Class2 class2) {
	int i;
	int i_244_;
	if (bool) {
	    if (class2 != null && class2.anIntArray23 != null) {
		i = class2.anIntArray23[0];
		i_244_ = class2.anIntArray23[1];
	    } else {
		i = 1522045387 * anInt105;
		i_244_ = anInt106 * -769283651;
	    }
	} else if (null != class2 && class2.anIntArray15 != null) {
	    i = class2.anIntArray15[0];
	    i_244_ = class2.anIntArray15[1];
	} else {
	    i = anInt103 * 1730663877;
	    i_244_ = anInt104 * -252626025;
	}
	if (-1 == i)
	    return true;
	boolean bool_245_ = true;
	if (!aClass17_55.aClass458_191.method7478(i, 0, (short) 23210))
	    bool_245_ = false;
	if (-1 != i_244_
	    && !aClass17_55.aClass458_191.method7478(i_244_, 0, (short) 27166))
	    bool_245_ = false;
	return bool_245_;
    }
    
    public final boolean method660(boolean bool, Class2 class2) {
	int i;
	int i_246_;
	if (bool) {
	    if (class2 != null && class2.anIntArray23 != null) {
		i = class2.anIntArray23[0];
		i_246_ = class2.anIntArray23[1];
	    } else {
		i = 1522045387 * anInt105;
		i_246_ = anInt106 * -769283651;
	    }
	} else if (null != class2 && class2.anIntArray15 != null) {
	    i = class2.anIntArray15[0];
	    i_246_ = class2.anIntArray15[1];
	} else {
	    i = anInt103 * 1730663877;
	    i_246_ = anInt104 * -252626025;
	}
	if (-1 == i)
	    return true;
	boolean bool_247_ = true;
	if (!aClass17_55.aClass458_191.method7478(i, 0, (short) 29328))
	    bool_247_ = false;
	if (-1 != i_246_
	    && !aClass17_55.aClass458_191.method7478(i_246_, 0, (short) 3951))
	    bool_247_ = false;
	return bool_247_;
    }
    
    public final boolean method661(boolean bool, Class2 class2) {
	int i;
	int i_248_;
	if (bool) {
	    if (class2 != null && class2.anIntArray23 != null) {
		i = class2.anIntArray23[0];
		i_248_ = class2.anIntArray23[1];
	    } else {
		i = 1522045387 * anInt105;
		i_248_ = anInt106 * -769283651;
	    }
	} else if (null != class2 && class2.anIntArray15 != null) {
	    i = class2.anIntArray15[0];
	    i_248_ = class2.anIntArray15[1];
	} else {
	    i = anInt103 * 1730663877;
	    i_248_ = anInt104 * -252626025;
	}
	if (-1 == i)
	    return true;
	boolean bool_249_ = true;
	if (!aClass17_55.aClass458_191.method7478(i, 0, (short) 27120))
	    bool_249_ = false;
	if (-1 != i_248_
	    && !aClass17_55.aClass458_191.method7478(i_248_, 0, (short) 13640))
	    bool_249_ = false;
	return bool_249_;
    }
    
    public final boolean method662(boolean bool, Class2 class2) {
	int i;
	int i_250_;
	if (bool) {
	    if (class2 != null && class2.anIntArray23 != null) {
		i = class2.anIntArray23[0];
		i_250_ = class2.anIntArray23[1];
	    } else {
		i = 1522045387 * anInt105;
		i_250_ = anInt106 * -769283651;
	    }
	} else if (null != class2 && class2.anIntArray15 != null) {
	    i = class2.anIntArray15[0];
	    i_250_ = class2.anIntArray15[1];
	} else {
	    i = anInt103 * 1730663877;
	    i_250_ = anInt104 * -252626025;
	}
	if (-1 == i)
	    return true;
	boolean bool_251_ = true;
	if (!aClass17_55.aClass458_191.method7478(i, 0, (short) 22897))
	    bool_251_ = false;
	if (-1 != i_250_
	    && !aClass17_55.aClass458_191.method7478(i_250_, 0, (short) 1932))
	    bool_251_ = false;
	return bool_251_;
    }
    
    void method663(Class22 class22, Class8 class8_252_, Class8 class8_253_,
		   Class53 class53, Class666 class666, int i) {
	anInt65 = class8_252_.anInt65 * 1;
	anInt74 = class8_252_.anInt74 * 1;
	anInt75 = 1 * class8_252_.anInt75;
	anInt81 = 1 * class8_252_.anInt81;
	anInt92 = class8_252_.anInt92 * 1;
	anInt128 = class8_252_.anInt128 * 1;
	anInt95 = 1 * class8_252_.anInt95;
	Class8 class8_254_
	    = Class22.aClass22_216 == class22 ? class8_252_ : class8_253_;
	aShortArray67 = class8_254_.aShortArray67;
	aShortArray68 = class8_254_.aShortArray68;
	aByteArray117 = class8_254_.aByteArray117;
	aShortArray70 = class8_254_.aShortArray70;
	aShortArray71 = class8_254_.aShortArray71;
	aString66 = class8_253_.aString66;
	aBool83 = class8_253_.aBool83;
	if (Class22.aClass22_216 == class22) {
	    anInt73 = 1 * class8_253_.anInt73;
	    anInt56 = -1043775721;
	    if (class8_253_.aBool125)
		aBool80 = false;
	    else
		aBool80 = class8_253_.aBool80;
	} else if (class22 == Class22.aClass22_217) {
	    aString66 = class8_253_.aString115;
	    anInt73
		= ((int) Math.floor((double) (class8_253_.anInt73 * 1345227511
					      / (-1711875303
						 * class8_253_.anInt116)))
		   * -600484153);
	    anInt56 = -1043775721;
	    aBool123 = class8_253_.aBool123;
	    aBool80 = class8_253_.aBool80;
	    anInt64 = 1 * class8_252_.anInt64;
	    anIntArray86 = class8_252_.anIntArray86;
	    anIntArray87 = class8_252_.anIntArray87;
	    aStringArray85 = new String[5];
	    aStringArray85[0]
		= Class53.aClass53_392.method1169(class666, 1552651121);
	    aStringArray85[4] = class53.method1169(class666, 1552651121);
	} else {
	    anInt73 = 0;
	    anInt56 = class8_253_.anInt56 * 1;
	    aBool80 = false;
	    anInt72 = class8_253_.anInt72 * 1;
	    anInt99 = 1 * class8_253_.anInt99;
	    anInt112 = class8_253_.anInt112 * 1;
	    anInt78 = class8_253_.anInt78 * 1;
	    anInt91 = class8_253_.anInt91 * 1;
	    anInt82 = class8_253_.anInt82 * 1;
	    anInt93 = 1 * class8_253_.anInt93;
	    anInt94 = 1 * class8_253_.anInt94;
	    anInt62 = class8_253_.anInt62 * 1;
	    anInt97 = class8_253_.anInt97 * 1;
	    anInt109 = 1 * class8_253_.anInt109;
	    anInt76 = 1 * class8_253_.anInt76;
	    anInt100 = 1 * class8_253_.anInt100;
	    anInt101 = 1 * class8_253_.anInt101;
	    anInt102 = 1 * class8_253_.anInt102;
	    anInt103 = 1 * class8_253_.anInt103;
	    anInt104 = 1 * class8_253_.anInt104;
	    anInt105 = 1 * class8_253_.anInt105;
	    anInt106 = class8_253_.anInt106 * 1;
	    anInt64 = class8_253_.anInt64 * 1;
	    anInt88 = 1 * class8_253_.anInt88;
	    aStringArray84 = class8_253_.aStringArray84;
	    aClass10_127 = class8_253_.aClass10_127;
	    aStringArray85 = new String[5];
	    if (class8_253_.aStringArray85 != null) {
		for (int i_255_ = 0; i_255_ < 4; i_255_++)
		    aStringArray85[i_255_]
			= class8_253_.aStringArray85[i_255_];
	    }
	    aStringArray85[4] = class53.method1169(class666, 1552651121);
	}
    }
    
    public final Class186 method664(boolean bool, Class2 class2) {
	int i;
	int i_256_;
	if (bool) {
	    if (null != class2 && class2.anIntArray23 != null) {
		i = class2.anIntArray23[0];
		i_256_ = class2.anIntArray23[1];
	    } else {
		i = 1522045387 * anInt105;
		i_256_ = anInt106 * -769283651;
	    }
	} else if (null != class2 && null != class2.anIntArray15) {
	    i = class2.anIntArray15[0];
	    i_256_ = class2.anIntArray15[1];
	} else {
	    i = anInt103 * 1730663877;
	    i_256_ = -252626025 * anInt104;
	}
	if (-1 == i)
	    return null;
	Class186 class186
	    = Class186.method3644(aClass17_55.aClass458_191, i, 0);
	if (class186.anInt2086 < 13)
	    class186.method3651(2);
	if (i_256_ != -1) {
	    Class186 class186_257_
		= Class186.method3644(aClass17_55.aClass458_191, i_256_, 0);
	    if (class186_257_.anInt2086 < 13)
		class186_257_.method3651(2);
	    Class186[] class186s = { class186, class186_257_ };
	    class186 = new Class186(class186s, 2);
	}
	if (aShortArray67 != null) {
	    short[] is;
	    if (null != class2 && null != class2.aShortArray24)
		is = class2.aShortArray24;
	    else
		is = aShortArray68;
	    for (int i_258_ = 0; i_258_ < aShortArray67.length; i_258_++)
		class186.method3631(aShortArray67[i_258_], is[i_258_]);
	}
	if (aShortArray70 != null) {
	    short[] is;
	    if (null != class2 && class2.aShortArray21 != null)
		is = class2.aShortArray21;
	    else
		is = aShortArray71;
	    for (int i_259_ = 0; i_259_ < aShortArray70.length; i_259_++)
		class186.method3632(aShortArray70[i_259_], is[i_259_]);
	}
	return class186;
    }
    
    void method665(Class22 class22, Class8 class8_260_, Class8 class8_261_,
		   Class53 class53, Class666 class666) {
	anInt65 = class8_260_.anInt65 * 1;
	anInt74 = class8_260_.anInt74 * 1;
	anInt75 = 1 * class8_260_.anInt75;
	anInt81 = 1 * class8_260_.anInt81;
	anInt92 = class8_260_.anInt92 * 1;
	anInt128 = class8_260_.anInt128 * 1;
	anInt95 = 1 * class8_260_.anInt95;
	Class8 class8_262_
	    = Class22.aClass22_216 == class22 ? class8_260_ : class8_261_;
	aShortArray67 = class8_262_.aShortArray67;
	aShortArray68 = class8_262_.aShortArray68;
	aByteArray117 = class8_262_.aByteArray117;
	aShortArray70 = class8_262_.aShortArray70;
	aShortArray71 = class8_262_.aShortArray71;
	aString66 = class8_261_.aString66;
	aBool83 = class8_261_.aBool83;
	if (Class22.aClass22_216 == class22) {
	    anInt73 = 1 * class8_261_.anInt73;
	    anInt56 = -1043775721;
	    if (class8_261_.aBool125)
		aBool80 = false;
	    else
		aBool80 = class8_261_.aBool80;
	} else if (class22 == Class22.aClass22_217) {
	    aString66 = class8_261_.aString115;
	    anInt73
		= ((int) Math.floor((double) (class8_261_.anInt73 * 1345227511
					      / (-1711875303
						 * class8_261_.anInt116)))
		   * -600484153);
	    anInt56 = -1043775721;
	    aBool123 = class8_261_.aBool123;
	    aBool80 = class8_261_.aBool80;
	    anInt64 = 1 * class8_260_.anInt64;
	    anIntArray86 = class8_260_.anIntArray86;
	    anIntArray87 = class8_260_.anIntArray87;
	    aStringArray85 = new String[5];
	    aStringArray85[0]
		= Class53.aClass53_392.method1169(class666, 1552651121);
	    aStringArray85[4] = class53.method1169(class666, 1552651121);
	} else {
	    anInt73 = 0;
	    anInt56 = class8_261_.anInt56 * 1;
	    aBool80 = false;
	    anInt72 = class8_261_.anInt72 * 1;
	    anInt99 = 1 * class8_261_.anInt99;
	    anInt112 = class8_261_.anInt112 * 1;
	    anInt78 = class8_261_.anInt78 * 1;
	    anInt91 = class8_261_.anInt91 * 1;
	    anInt82 = class8_261_.anInt82 * 1;
	    anInt93 = 1 * class8_261_.anInt93;
	    anInt94 = 1 * class8_261_.anInt94;
	    anInt62 = class8_261_.anInt62 * 1;
	    anInt97 = class8_261_.anInt97 * 1;
	    anInt109 = 1 * class8_261_.anInt109;
	    anInt76 = 1 * class8_261_.anInt76;
	    anInt100 = 1 * class8_261_.anInt100;
	    anInt101 = 1 * class8_261_.anInt101;
	    anInt102 = 1 * class8_261_.anInt102;
	    anInt103 = 1 * class8_261_.anInt103;
	    anInt104 = 1 * class8_261_.anInt104;
	    anInt105 = 1 * class8_261_.anInt105;
	    anInt106 = class8_261_.anInt106 * 1;
	    anInt64 = class8_261_.anInt64 * 1;
	    anInt88 = 1 * class8_261_.anInt88;
	    aStringArray84 = class8_261_.aStringArray84;
	    aClass10_127 = class8_261_.aClass10_127;
	    aStringArray85 = new String[5];
	    if (class8_261_.aStringArray85 != null) {
		for (int i = 0; i < 4; i++)
		    aStringArray85[i] = class8_261_.aStringArray85[i];
	    }
	    aStringArray85[4] = class53.method1169(class666, 1552651121);
	}
    }
    
    public String method666(int i, String string) {
	if (aClass10_127 == null)
	    return string;
	Class525_Sub19 class525_sub19
	    = (Class525_Sub19) aClass10_127.method684((long) i);
	if (null == class525_sub19)
	    return string;
	return (String) class525_sub19.anObject10571;
    }
    
    public String method667(int i, String string) {
	if (aClass10_127 == null)
	    return string;
	Class525_Sub19 class525_sub19
	    = (Class525_Sub19) aClass10_127.method684((long) i);
	if (null == class525_sub19)
	    return string;
	return (String) class525_sub19.anObject10571;
    }
    
    public String method668(int i, String string) {
	if (aClass10_127 == null)
	    return string;
	Class525_Sub19 class525_sub19
	    = (Class525_Sub19) aClass10_127.method684((long) i);
	if (null == class525_sub19)
	    return string;
	return (String) class525_sub19.anObject10571;
    }
    
    public int method669(int i) {
	if (anIntArray86 == null)
	    return -1;
	return anIntArray86[i];
    }
    
    public int method670(int i) {
	if (anIntArray86 == null)
	    return -1;
	return anIntArray86[i];
    }
    
    public int method671(int i) {
	if (anIntArray86 == null)
	    return -1;
	return anIntArray86[i];
    }
    
    public final Class179 method672
	(Class182 class182, int i, int i_263_, Class637 class637,
	 Class689 class689, int i_264_, int i_265_, int i_266_, int i_267_) {
	if (null != anIntArray107 && i_263_ > 1) {
	    int i_268_ = -1;
	    for (int i_269_ = 0; i_269_ < 10; i_269_++) {
		if (i_263_ >= anIntArray108[i_269_]
		    && anIntArray108[i_269_] != 0)
		    i_268_ = anIntArray107[i_269_];
	    }
	    if (i_268_ != -1)
		return (((Class8)
			 anInterface13_61.method76(i_268_, -530632692))
			    .method616
			(class182, i, 1, class637, class689, i_264_, i_265_,
			 i_266_, i_267_, -1891095092));
	}
	int i_270_ = i;
	if (null != class689)
	    i_270_ |= class689.method14033(1788843680);
	Class179 class179;
	synchronized (aClass17_55.aClass200_197) {
	    class179 = ((Class179)
			(aClass17_55.aClass200_197.method3785
			 ((long) (1736248109 * anInt63
				  | -2117565327 * class182.anInt1942 << 29))));
	}
	if (null == class179
	    || class182.method3321(class179.method2928(), i_270_) != 0) {
	    if (null != class179)
		i_270_ = class182.method3229(i_270_, class179.method2928());
	    int i_271_ = i_270_;
	    if (aShortArray70 != null)
		i_271_ |= 0x8000;
	    if (null != aShortArray67 || null != class637)
		i_271_ |= 0x4000;
	    if (anInt122 * -311590649 != 128)
		i_271_ |= 0x1;
	    if (anInt118 * -207729681 != 128)
		i_271_ |= 0x2;
	    if (128 != -994464071 * anInt119)
		i_271_ |= 0x4;
	    Class186 class186 = Class186.method3644(aClass17_55.aClass458_191,
						    -1870434119 * anInt65, 0);
	    if (null == class186)
		return null;
	    if (class186.anInt2086 < 13)
		class186.method3651(2);
	    class179 = class182.method3556(class186, i_271_,
					   1509051035 * aClass17_55.anInt196,
					   64 + anInt120 * -358510299,
					   850 + anInt121 * 1692172521);
	    if (anInt122 * -311590649 != 128 || -207729681 * anInt118 != 128
		|| 128 != anInt119 * -994464071)
		class179.method2936(-311590649 * anInt122,
				    anInt118 * -207729681,
				    anInt119 * -994464071);
	    if (null != aShortArray67) {
		for (int i_272_ = 0; i_272_ < aShortArray67.length; i_272_++) {
		    if (aByteArray117 != null && i_272_ < aByteArray117.length)
			class179.method2971(aShortArray67[i_272_],
					    (aShortArray96
					     [aByteArray117[i_272_] & 0xff]));
		    else
			class179.method2971(aShortArray67[i_272_],
					    aShortArray68[i_272_]);
		}
	    }
	    if (null != aShortArray70) {
		for (int i_273_ = 0; i_273_ < aShortArray70.length; i_273_++)
		    class179.method2973(aShortArray70[i_273_],
					aShortArray71[i_273_]);
	    }
	    if (null != class637) {
		for (int i_274_ = 0; i_274_ < 10; i_274_++) {
		    for (int i_275_ = 0;
			 i_275_ < (Class198_Sub18.aShortArrayArray9988
				   [i_274_]).length;
			 i_275_++) {
			if (class637.anIntArray8301[i_274_]
			    < (Class525_Sub6.aShortArrayArrayArray10485[i_274_]
			       [i_275_]).length)
			    class179.method2971((Class198_Sub18
						 .aShortArrayArray9988[i_274_]
						 [i_275_]),
						(Class525_Sub6
						 .aShortArrayArrayArray10485
						 [i_274_][i_275_]
						 [(class637.anIntArray8301
						   [i_274_])]));
		    }
		}
		for (int i_276_ = 0; i_276_ < 10; i_276_++) {
		    for (int i_277_ = 0;
			 i_277_ < Class477.aShortArrayArray5199[i_276_].length;
			 i_277_++) {
			if (class637.anIntArray8298[i_276_]
			    < (Class522_Sub1.aShortArrayArrayArray10395[i_276_]
			       [i_277_]).length)
			    class179.method2973((Class477.aShortArrayArray5199
						 [i_276_][i_277_]),
						(Class522_Sub1
						 .aShortArrayArrayArray10395
						 [i_276_][i_277_]
						 [(class637.anIntArray8298
						   [i_276_])]));
		    }
		}
	    }
	    class179.method3010(i_270_);
	    synchronized (aClass17_55.aClass200_197) {
		aClass17_55.aClass200_197.method3788
		    (class179,
		     (long) (1736248109 * anInt63
			     | class182.anInt1942 * -2117565327 << 29));
	    }
	}
	if (null != class689 || i_267_ != 0) {
	    class179 = class179.method2926((byte) 1, i_270_, true);
	    if (class689 != null)
		class689.method14034(class179, 0, 2044308680);
	    if (0 != i_267_)
		class179.method2974(i_264_, i_265_, i_266_, i_267_);
	}
	class179.method3010(i);
	return class179;
    }
    
    void method673(Class8 class8_278_, Class8 class8_279_, Class666 class666) {
	method663(Class22.aClass22_216, class8_278_, class8_279_, null,
		  class666, 1946151148);
    }
    
    public int method674(int i) {
	if (null == anIntArray87)
	    return -1;
	return anIntArray87[i];
    }
    
    public void method67(int i) {
	if (-1095552769 * anInt77 != -1)
	    method639((Class8) anInterface13_61.method76(-1095552769 * anInt77,
							 682779858),
		      (Class8) anInterface13_61.method76(anInt59 * -1210387357,
							 1111710947),
		      aClass17_55.aClass666_198, 1595972117);
	else if (-1 != anInt98 * 2020962253)
	    method617((Class8) anInterface13_61.method76(anInt98 * 2020962253,
							 307373039),
		      (Class8) anInterface13_61.method76(1088959965 * anInt111,
							 1608116356),
		      aClass17_55.aClass666_198, -1225423335);
	else if (1860754759 * anInt131 != -1)
	    method618((Class8) anInterface13_61.method76(anInt131 * 1860754759,
							 -286381743),
		      (Class8) anInterface13_61.method76(anInt135 * 45619687,
							 193091875),
		      aClass17_55.aClass666_198, 1650610192);
	else if (-1 != 195314511 * anInt114)
	    method619((Class8) anInterface13_61.method76(anInt114 * 195314511,
							 1445226137),
		      (Class8) anInterface13_61.method76(593405105 * anInt113,
							 -944043513),
		      aClass17_55.aClass666_198, (short) 19297);
	if (-1139124461 * anInt126 != 0)
	    aBool80 = false;
	if (!aClass17_55.aBool190 && aBool83) {
	    anInt88 = 0;
	    aStringArray84 = aClass17_55.aStringArray195;
	    aStringArray85 = aClass17_55.aStringArray192;
	    aBool123 = false;
	    anIntArray69 = null;
	    aBool80 = false;
	    if (null != aClass10_127) {
		boolean bool = false;
		for (Class525 class525 = aClass10_127.method689(1836631178);
		     null != class525;
		     class525 = aClass10_127.method690((byte) -123)) {
		    Class88 class88
			= (Class88) (aClass17_55.anInterface13_189.method76
				     ((int) (class525.aLong7113
					     * -5126207504388691097L),
				      -1794175658));
		    if (class88.aBool895)
			class525.method8755(-1933461091);
		    else
			bool = true;
		}
		if (!bool)
		    aClass10_127 = null;
	    }
	}
    }
    
    static void method675(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class585.method9662(1080614061);
    }
    
    static final void method676(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = 0;
    }
}
