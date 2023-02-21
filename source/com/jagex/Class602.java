/* Class602 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Arrays;
import java.util.Calendar;

public class Class602 implements Interface12
{
    public int anInt7866;
    public static short[] aShortArray7867 = new short[256];
    public int[] anIntArray7868;
    byte[] aByteArray7869;
    Interface13 anInterface13_7870;
    byte[] aByteArray7871;
    int[][] anIntArrayArray7872;
    Class592 aClass592_7873;
    short[] aShortArray7874;
    public boolean aBool7875;
    byte[] aByteArray7876;
    short[] aShortArray7877;
    short[] aShortArray7878;
    public int anInt7879;
    byte[] aByteArray7880;
    byte aByte7881;
    int anInt7882;
    byte aByte7883;
    byte aByte7884;
    public int anInt7885;
    public int anInt7886;
    public int anInt7887;
    public int anInt7888;
    public boolean aBool7889;
    int anInt7890;
    public boolean aBool7891;
    public int anInt7892;
    public int anInt7893;
    public int anInt7894;
    public int anInt7895;
    int[] anIntArray7896;
    public boolean aBool7897;
    public int anInt7898;
    int anInt7899;
    int anInt7900;
    public String[] aStringArray7901;
    Class10 aClass10_7902;
    boolean aBool7903;
    int[] anIntArray7904;
    public boolean aBool7905;
    public int anInt7906;
    public int anInt7907;
    public int anInt7908;
    public boolean aBool7909;
    int anInt7910;
    int anInt7911;
    static final int anInt7912 = 6;
    int anInt7913;
    int anInt7914;
    int anInt7915;
    int anInt7916;
    int anInt7917;
    public int anInt7918;
    public boolean aBool7919;
    public Class443 aClass443_7920;
    public int anInt7921;
    public int anInt7922;
    public int[] anIntArray7923;
    int anInt7924;
    int[] anIntArray7925;
    public boolean aBool7926;
    public int anInt7927;
    public String aString7928 = "null";
    public int anInt7929;
    public int anInt7930;
    int anInt7931;
    byte aByte7932;
    short[] aShortArray7933;
    public boolean aBool7934;
    public int anInt7935;
    public boolean aBool7936;
    public boolean aBool7937;
    public boolean aBool7938;
    public int[] anIntArray7939;
    public int anInt7940;
    int anInt7941;
    public boolean aBool7942;
    byte aByte7943;
    public Class605 aClass605_7944;
    public boolean aBool7945;
    static final int anInt7946 = 127007;
    
    public final synchronized Class20 method9902
	(Class182 class182, int i, int i_0_, int i_1_, Class161 class161,
	 Class161 class161_2_, int i_3_, int i_4_, int i_5_, boolean bool,
	 Class604 class604) {
	if (Class5.method542(i_0_, 859505775))
	    i_0_ = Class608.aClass608_7976.anInt7995 * -1214990409;
	long l = (long) ((i_0_ << 3) + (1156889815 * anInt7894 << 10) + i_1_);
	l |= (long) (class182.anInt1942 * -2117565327 << 29);
	if (class604 != null)
	    l |= class604.aLong7954 * -768056368964829315L << 32;
	int i_6_ = i;
	if (aByte7943 == 3)
	    i_6_ |= 0x7;
	else {
	    if (0 != aByte7943 || 0 != anInt7917 * 80970075)
		i_6_ |= 0x2;
	    if (261048199 * anInt7916 != 0)
		i_6_ |= 0x1;
	    if (-1090495991 * anInt7882 != 0)
		i_6_ |= 0x4;
	}
	if (bool)
	    i_6_ |= 0x40000;
	boolean bool_7_
	    = 0 != aByte7943 && (null != class161 || null != class161_2_);
	boolean bool_8_
	    = (anInt7916 * 261048199 != 0 || 0 != 80970075 * anInt7917
	       || 0 != -1090495991 * anInt7882);
	Class20 class20;
	synchronized (aClass592_7873.aClass200_7823) {
	    class20 = (Class20) aClass592_7873.aClass200_7823.method3785(l);
	}
	Class179 class179
	    = (Class179) (null != class20 ? class20.anObject207 : null);
	Class525_Sub16_Sub17 class525_sub16_sub17 = null;
	if (class179 == null
	    || class182.method3321(class179.method2928(), i_6_) != 0) {
	    if (null != class179)
		i_6_ = class182.method3229(i_6_, class179.method2928());
	    int i_9_ = i_6_;
	    if (Class608.aClass608_7996.anInt7995 * -1214990409 == i_0_
		&& i_1_ > 3)
		i_9_ |= 0x5;
	    class179
		= method9908(class182, i_9_, i_0_, i_1_, class604, 1303536134);
	    if (class179 == null)
		return null;
	    if (i_0_ == Class608.aClass608_7996.anInt7995 * -1214990409
		&& i_1_ > 3)
		class179.method2930(2048);
	    if (bool && !bool_7_ && !bool_8_)
		class525_sub16_sub17 = class179.method2955(null);
	    class179.method3010(i_6_);
	    class20 = new Class20(class179, class525_sub16_sub17);
	    synchronized (aClass592_7873.aClass200_7823) {
		aClass592_7873.aClass200_7823.method3788(class20, l);
	    }
	} else {
	    class525_sub16_sub17 = (Class525_Sub16_Sub17) class20.anObject208;
	    if (bool && class525_sub16_sub17 == null && !bool_7_ && !bool_8_)
		class525_sub16_sub17
		    = (Class525_Sub16_Sub17) (class20.anObject208
					      = class179.method2955(null));
	}
	if (bool_7_ || bool_8_) {
	    class179 = class179.method2926((byte) 0, i_6_, true);
	    if (bool_7_)
		class179.method2937(aByte7943, anInt7890 * 1149948829,
				    class161, class161_2_, i_3_, i_4_, i_5_);
	    if (bool_8_)
		class179.method2934(261048199 * anInt7916,
				    anInt7917 * 80970075,
				    -1090495991 * anInt7882);
	    if (bool)
		class525_sub16_sub17 = class179.method2955(null);
	    class179.method3010(i);
	} else
	    class179 = class179.method2926((byte) 0, i, true);
	aClass592_7873.aClass20_7825.anObject207 = class179;
	aClass592_7873.aClass20_7825.anObject208 = class525_sub16_sub17;
	return aClass592_7873.aClass20_7825;
    }
    
    public void method67(int i) {
	method9904(-1845395868);
	if (aBool7903)
	    anInt7887 = 0;
	if (!aClass592_7873.aBool7822 && aBool7936) {
	    aStringArray7901 = null;
	    anIntArray7939 = null;
	}
    }
    
    void method9903() {
	if (1700857535 * anInt7888 == -1) {
	    anInt7888 = 0;
	    if (null != aByteArray7871 && aByteArray7871.length == 1
		&& (Class608.aClass608_7996.anInt7995 * -1214990409
		    == aByteArray7871[0]))
		anInt7888 = 1751476543;
	    for (int i = 0; i < 5; i++) {
		if (null != aStringArray7901[i]) {
		    anInt7888 = 1751476543;
		    break;
		}
	    }
	}
	if (-1 == 1596797987 * anInt7921)
	    anInt7921 = -351855733 * (668917471 * anInt7887 != 0 ? 1 : 0);
	if (method9956(-1733785047) || aBool7938 || anIntArray7923 != null)
	    aBool7942 = true;
	if (1700857535 * anInt7888 <= 0
	    && aClass605_7944 != Class605.aClass605_7962) {
	    /* empty */
	}
    }
    
    void method9904(int i) {
	if (1700857535 * anInt7888 == -1) {
	    anInt7888 = 0;
	    if (null != aByteArray7871 && aByteArray7871.length == 1
		&& (Class608.aClass608_7996.anInt7995 * -1214990409
		    == aByteArray7871[0]))
		anInt7888 = 1751476543;
	    for (int i_10_ = 0; i_10_ < 5; i_10_++) {
		if (null != aStringArray7901[i_10_]) {
		    anInt7888 = 1751476543;
		    break;
		}
	    }
	}
	if (-1 == 1596797987 * anInt7921)
	    anInt7921 = -351855733 * (668917471 * anInt7887 != 0 ? 1 : 0);
	if (method9956(-1251031628) || aBool7938 || anIntArray7923 != null)
	    aBool7942 = true;
	if (1700857535 * anInt7888 <= 0
	    && aClass605_7944 != Class605.aClass605_7962) {
	    /* empty */
	}
    }
    
    public final boolean method9905(int i, int i_11_) {
	if (anIntArrayArray7872 == null)
	    return true;
	boolean bool = true;
	for (int i_12_ = 0; i_12_ < aByteArray7871.length; i_12_++) {
	    if (aByteArray7871[i_12_] == i) {
		for (int i_13_ = 0; i_13_ < anIntArrayArray7872[i_12_].length;
		     i_13_++) {
		    if (!aClass592_7873.method9803((anIntArrayArray7872[i_12_]
						    [i_13_]),
						   -807224623))
			bool = false;
		}
	    }
	}
	return bool;
    }
    
    public void method66(RSBuffer class525_sub38, int i) {
	for (;;) {
	    int i_14_ = class525_sub38.readUnsignedByte(96151977);
	    if (0 == i_14_)
		break;
	    method9938(class525_sub38, i_14_, 501271953);
	}
    }
    
    public boolean method9906(int i) {
	if (anIntArray7904 != null && i != -1) {
	    for (int i_15_ = 0; i_15_ < anIntArray7904.length; i_15_++) {
		if (i == anIntArray7904[i_15_])
		    return true;
	    }
	}
	return false;
    }
    
    public final synchronized Class179 method9907
	(Class182 class182, int i, int i_16_, int i_17_, Class161 class161,
	 Class161 class161_18_, int i_19_, int i_20_, int i_21_,
	 Class689 class689, Class604 class604, int i_22_) {
	if (Class5.method542(i_16_, 1449253579))
	    i_16_ = -1214990409 * Class608.aClass608_7976.anInt7995;
	long l
	    = (long) ((anInt7894 * 1156889815 << 10) + (i_16_ << 3) + i_17_);
	int i_23_ = i;
	l |= (long) (-2117565327 * class182.anInt1942 << 29);
	if (null != class604)
	    l |= -768056368964829315L * class604.aLong7954 << 32;
	if (class689 != null)
	    i |= class689.method14033(-1552334750);
	if (3 == aByte7943)
	    i |= 0x7;
	else {
	    if (aByte7943 != 0 || anInt7917 * 80970075 != 0)
		i |= 0x2;
	    if (0 != anInt7916 * 261048199)
		i |= 0x1;
	    if (-1090495991 * anInt7882 != 0)
		i |= 0x4;
	}
	if (i_16_ == -1214990409 * Class608.aClass608_7996.anInt7995
	    && i_17_ > 3)
	    i |= 0x5;
	Class179 class179;
	synchronized (aClass592_7873.aClass200_7824) {
	    class179 = (Class179) aClass592_7873.aClass200_7824.method3785(l);
	}
	if (class179 == null
	    || class182.method3321(class179.method2928(), i) != 0) {
	    if (null != class179)
		i = class182.method3229(i, class179.method2928());
	    class179
		= method9908(class182, i, i_16_, i_17_, class604, -352738518);
	    if (null == class179)
		return null;
	    synchronized (aClass592_7873.aClass200_7824) {
		aClass592_7873.aClass200_7824.method3788(class179, l);
	    }
	}
	boolean bool = false;
	if (null != class689) {
	    class179 = class179.method2926((byte) 1, i, true);
	    bool = true;
	    class689.method14034(class179, i_17_ & 0x3, 1534202963);
	}
	if (i_16_ == Class608.aClass608_7996.anInt7995 * -1214990409
	    && i_17_ > 3) {
	    if (!bool) {
		class179 = class179.method2926((byte) 3, i, true);
		bool = true;
	    }
	    class179.method2930(2048);
	}
	if (0 != aByte7943) {
	    if (!bool) {
		class179 = class179.method2926((byte) 3, i, true);
		bool = true;
	    }
	    class179.method2937(aByte7943, anInt7890 * 1149948829, class161,
				class161_18_, i_19_, i_20_, i_21_);
	}
	if (0 != anInt7916 * 261048199 || 0 != anInt7917 * 80970075
	    || anInt7882 * -1090495991 != 0) {
	    if (!bool) {
		class179 = class179.method2926((byte) 3, i, true);
		bool = true;
	    }
	    class179.method2934(261048199 * anInt7916, 80970075 * anInt7917,
				anInt7882 * -1090495991);
	}
	if (bool)
	    class179.method3010(i_23_);
	return class179;
    }
    
    Class179 method9908(Class182 class182, int i, int i_24_, int i_25_,
			Class604 class604, int i_26_) {
	int i_27_ = anInt7899 * -1822650503 + 64;
	int i_28_ = 1610422171 * anInt7900 + 850;
	int i_29_ = i;
	boolean bool
	    = (aBool7891
	       || (-1214990409 * Class608.aClass608_7978.anInt7995 == i_24_
		   && i_25_ > 3));
	if (bool)
	    i |= 0x10;
	if (i_25_ == 0) {
	    if (128 != anInt7910 * -751777211 || 0 != 107322009 * anInt7913)
		i |= 0x1;
	    if (128 != anInt7931 * 669346399 || 0 != anInt7915 * -653269247)
		i |= 0x4;
	} else
	    i |= 0xd;
	if (128 != 1355752901 * anInt7911 || 0 != anInt7914 * 1714070995)
	    i |= 0x2;
	if (aShortArray7874 != null)
	    i |= 0x4000;
	if (aShortArray7877 != null)
	    i |= 0x8000;
	if (aByte7884 != 0)
	    i |= 0x80000;
	Class179 class179 = null;
	if (aByteArray7871 != null) {
	    int i_30_ = -1;
	    for (int i_31_ = 0; i_31_ < aByteArray7871.length; i_31_++) {
		if (aByteArray7871[i_31_] == i_24_) {
		    i_30_ = i_31_;
		    break;
		}
	    }
	    if (i_30_ == -1)
		return null;
	    int[] is
		= (null != class604 && null != class604.anIntArray7956
		   ? class604.anIntArray7956 : anIntArrayArray7872[i_30_]);
	    int i_32_ = is.length;
	    if (i_32_ > 0) {
		long l = (long) (-2117565327 * class182.anInt1942);
		for (int i_33_ = 0; i_33_ < i_32_; i_33_++)
		    l = 67783L * l + (long) is[i_33_];
		synchronized (aClass592_7873.aClass200_7828) {
		    class179 = ((Class179)
				aClass592_7873.aClass200_7828.method3785(l));
		}
		if (null != class179) {
		    if (i_27_ != class179.method3065())
			i |= 0x1000;
		    if (i_28_ != class179.method3026())
			i |= 0x2000;
		}
		if (class179 == null
		    || class182.method3321(class179.method2928(), i) != 0) {
		    int i_34_ = i | 0x1f01f;
		    if (class179 != null)
			i_34_ = class182.method3229(i_34_,
						    class179.method2928());
		    Class186 class186 = null;
		    synchronized (aClass592_7873.aClass186Array7827) {
			for (int i_35_ = 0; i_35_ < i_32_; i_35_++) {
			    byte[] is_36_
				= aClass592_7873.method9802(is[i_35_],
							    (byte) 13);
			    if (null == is_36_) {
				Class179 class179_37_ = null;
				return class179_37_;
			    }
			    class186 = new Class186(is_36_);
			    if (class186.anInt2086 < 13)
				class186.method3651(2);
			    if (i_32_ > 1)
				aClass592_7873.aClass186Array7827[i_35_]
				    = class186;
			}
			if (i_32_ > 1)
			    class186 = new Class186((aClass592_7873
						     .aClass186Array7827),
						    i_32_);
		    }
		    class179 = class182.method3556(class186, i_34_,
						   1500613919 * (aClass592_7873
								 .anInt7821),
						   i_27_, i_28_);
		    synchronized (aClass592_7873.aClass200_7828) {
			aClass592_7873.aClass200_7828.method3788(class179, l);
		    }
		}
	    }
	}
	if (null == class179)
	    return null;
	Class179 class179_38_ = class179.method2926((byte) 0, i, true);
	if (i_27_ != class179.method3065())
	    class179_38_.method2966(i_27_);
	if (i_28_ != class179.method3026())
	    class179_38_.method2952(i_28_);
	if (bool)
	    class179_38_.method3074();
	if (i_24_ == -1214990409 * Class608.aClass608_7976.anInt7995
	    && i_25_ > 3) {
	    class179_38_.method2931(2048);
	    class179_38_.method2934(180, 0, -180);
	}
	i_25_ &= 0x3;
	if (i_25_ == 1)
	    class179_38_.method2931(4096);
	else if (2 == i_25_)
	    class179_38_.method2931(8192);
	else if (i_25_ == 3)
	    class179_38_.method2931(12288);
	if (aShortArray7874 != null) {
	    short[] is;
	    if (null != class604 && class604.aShortArray7955 != null)
		is = class604.aShortArray7955;
	    else
		is = aShortArray7933;
	    for (int i_39_ = 0; i_39_ < aShortArray7874.length; i_39_++) {
		if (aByteArray7876 != null && i_39_ < aByteArray7876.length)
		    class179_38_.method2971(aShortArray7874[i_39_],
					    (aShortArray7867
					     [aByteArray7876[i_39_] & 0xff]));
		else
		    class179_38_.method2971(aShortArray7874[i_39_], is[i_39_]);
	    }
	}
	if (null != aShortArray7877) {
	    short[] is;
	    if (class604 != null && class604.aShortArray7957 != null)
		is = class604.aShortArray7957;
	    else
		is = aShortArray7878;
	    for (int i_40_ = 0; i_40_ < aShortArray7877.length; i_40_++)
		class179_38_.method2973(aShortArray7877[i_40_], is[i_40_]);
	}
	if (0 != aByte7884)
	    class179_38_.method2974(aByte7881, aByte7932, aByte7883,
				    aByte7884 & 0xff);
	if (-751777211 * anInt7910 != 128 || 128 != 1355752901 * anInt7911
	    || anInt7931 * 669346399 != 128)
	    class179_38_.method2936(-751777211 * anInt7910,
				    1355752901 * anInt7911,
				    669346399 * anInt7931);
	if (0 != anInt7913 * 107322009 || 1714070995 * anInt7914 != 0
	    || -653269247 * anInt7915 != 0)
	    class179_38_.method2934(anInt7913 * 107322009,
				    anInt7914 * 1714070995,
				    -653269247 * anInt7915);
	class179_38_.method3010(i_29_);
	return class179_38_;
    }
    
    public final Class602 method9909(Interface20 interface20,
				     Interface18 interface18, int i) {
	int i_41_ = -1;
	if (anInt7924 * -693493 != -1) {
	    Class322 class322
		= interface20.method124(anInt7924 * -693493, -337159148);
	    if (null != class322)
		i_41_ = interface18.method93(class322, (byte) 2);
	} else if (-1 != -1640192111 * anInt7941) {
	    Class163 class163
		= interface20.method119(Class453.aClass453_4939,
					-1640192111 * anInt7941, -1452621243);
	    if (class163 != null)
		i_41_ = interface18.method104(class163, 623775022);
	}
	if (i_41_ < 0 || i_41_ >= anIntArray7923.length - 1) {
	    int i_42_ = anIntArray7923[anIntArray7923.length - 1];
	    if (i_42_ != -1)
		return ((Class602)
			anInterface13_7870.method76(i_42_, 270721934));
	    return null;
	}
	if (anIntArray7923[i_41_] == -1)
	    return null;
	return (Class602) anInterface13_7870.method76(anIntArray7923[i_41_],
						      1307095857);
    }
    
    public int method9910(int i, int i_43_, byte i_44_) {
	if (aClass10_7902 == null)
	    return i_43_;
	Class525_Sub42 class525_sub42
	    = (Class525_Sub42) aClass10_7902.method684((long) i);
	if (class525_sub42 == null)
	    return i_43_;
	return class525_sub42.anInt10858 * -1344652871;
    }
    
    public String method9911(int i, String string, int i_45_) {
	if (aClass10_7902 == null)
	    return string;
	Class525_Sub19 class525_sub19
	    = (Class525_Sub19) aClass10_7902.method684((long) i);
	if (null == class525_sub19)
	    return string;
	return (String) class525_sub19.anObject10571;
    }
    
    public int[] method9912() {
	return anIntArray7904;
    }
    
    public final synchronized Class20 method9913
	(Class182 class182, int i, int i_46_, int i_47_, Class161 class161,
	 Class161 class161_48_, int i_49_, int i_50_, int i_51_, boolean bool,
	 Class604 class604) {
	if (Class5.method542(i_46_, 1775853061))
	    i_46_ = Class608.aClass608_7976.anInt7995 * -1214990409;
	long l
	    = (long) ((i_46_ << 3) + (1156889815 * anInt7894 << 10) + i_47_);
	l |= (long) (class182.anInt1942 * -2117565327 << 29);
	if (class604 != null)
	    l |= class604.aLong7954 * -768056368964829315L << 32;
	int i_52_ = i;
	if (aByte7943 == 3)
	    i_52_ |= 0x7;
	else {
	    if (0 != aByte7943 || 0 != anInt7917 * 80970075)
		i_52_ |= 0x2;
	    if (261048199 * anInt7916 != 0)
		i_52_ |= 0x1;
	    if (-1090495991 * anInt7882 != 0)
		i_52_ |= 0x4;
	}
	if (bool)
	    i_52_ |= 0x40000;
	boolean bool_53_
	    = 0 != aByte7943 && (null != class161 || null != class161_48_);
	boolean bool_54_
	    = (anInt7916 * 261048199 != 0 || 0 != 80970075 * anInt7917
	       || 0 != -1090495991 * anInt7882);
	Class20 class20;
	synchronized (aClass592_7873.aClass200_7823) {
	    class20 = (Class20) aClass592_7873.aClass200_7823.method3785(l);
	}
	Class179 class179
	    = (Class179) (null != class20 ? class20.anObject207 : null);
	Class525_Sub16_Sub17 class525_sub16_sub17 = null;
	if (class179 == null
	    || class182.method3321(class179.method2928(), i_52_) != 0) {
	    if (null != class179)
		i_52_ = class182.method3229(i_52_, class179.method2928());
	    int i_55_ = i_52_;
	    if (Class608.aClass608_7996.anInt7995 * -1214990409 == i_46_
		&& i_47_ > 3)
		i_55_ |= 0x5;
	    class179 = method9908(class182, i_55_, i_46_, i_47_, class604,
				  -1756938941);
	    if (class179 == null)
		return null;
	    if (i_46_ == Class608.aClass608_7996.anInt7995 * -1214990409
		&& i_47_ > 3)
		class179.method2930(2048);
	    if (bool && !bool_53_ && !bool_54_)
		class525_sub16_sub17 = class179.method2955(null);
	    class179.method3010(i_52_);
	    class20 = new Class20(class179, class525_sub16_sub17);
	    synchronized (aClass592_7873.aClass200_7823) {
		aClass592_7873.aClass200_7823.method3788(class20, l);
	    }
	} else {
	    class525_sub16_sub17 = (Class525_Sub16_Sub17) class20.anObject208;
	    if (bool && class525_sub16_sub17 == null && !bool_53_ && !bool_54_)
		class525_sub16_sub17
		    = (Class525_Sub16_Sub17) (class20.anObject208
					      = class179.method2955(null));
	}
	if (bool_53_ || bool_54_) {
	    class179 = class179.method2926((byte) 0, i_52_, true);
	    if (bool_53_)
		class179.method2937(aByte7943, anInt7890 * 1149948829,
				    class161, class161_48_, i_49_, i_50_,
				    i_51_);
	    if (bool_54_)
		class179.method2934(261048199 * anInt7916,
				    anInt7917 * 80970075,
				    -1090495991 * anInt7882);
	    if (bool)
		class525_sub16_sub17 = class179.method2955(null);
	    class179.method3010(i);
	} else
	    class179 = class179.method2926((byte) 0, i, true);
	aClass592_7873.aClass20_7825.anObject207 = class179;
	aClass592_7873.aClass20_7825.anObject208 = class525_sub16_sub17;
	return aClass592_7873.aClass20_7825;
    }
    
    public boolean method9914(int i) {
	return null != anIntArray7904 && anIntArray7904.length > 1;
    }
    
    public int method9915(int i) {
	if (anIntArray7904 != null) {
	    if (anIntArray7904.length > 1) {
		int i_56_ = (int) (Math.random() * 65535.0);
		for (int i_57_ = 0; i_57_ < anIntArray7904.length; i_57_++) {
		    if (i_56_ <= anIntArray7896[i_57_])
			return anIntArray7904[i_57_];
		    i_56_ -= anIntArray7896[i_57_];
		}
	    } else
		return anIntArray7904[0];
	}
	return -1;
    }
    
    public int[] method9916(int i) {
	return anIntArray7904;
    }
    
    public boolean method9917(int i, int i_58_) {
	if (anIntArray7904 != null && i != -1) {
	    for (int i_59_ = 0; i_59_ < anIntArray7904.length; i_59_++) {
		if (i == anIntArray7904[i_59_])
		    return true;
	    }
	}
	return false;
    }
    
    public final boolean method9918(Class641 class641, int i) {
	if (null == anIntArrayArray7872)
	    return true;
	boolean bool = true;
	for (int i_60_ = 0; i_60_ < anIntArrayArray7872.length; i_60_++) {
	    for (int i_61_ = 0; i_61_ < anIntArrayArray7872[i_60_].length;
		 i_61_++) {
		boolean bool_62_
		    = aClass592_7873.method9803((anIntArrayArray7872[i_60_]
						 [i_61_]),
						-807224623);
		bool &= bool_62_;
		if (!bool_62_)
		    class641.anInt8322
			= anIntArrayArray7872[i_60_][i_61_] * -1459355133;
	    }
	}
	return bool;
    }
    
    public final synchronized Class20 method9919
	(Class182 class182, int i, int i_63_, int i_64_, Class161 class161,
	 Class161 class161_65_, int i_66_, int i_67_, int i_68_, boolean bool,
	 Class604 class604, int i_69_) {
	if (Class5.method542(i_63_, 942843942))
	    i_63_ = Class608.aClass608_7976.anInt7995 * -1214990409;
	long l
	    = (long) ((i_63_ << 3) + (1156889815 * anInt7894 << 10) + i_64_);
	l |= (long) (class182.anInt1942 * -2117565327 << 29);
	if (class604 != null)
	    l |= class604.aLong7954 * -768056368964829315L << 32;
	int i_70_ = i;
	if (aByte7943 == 3)
	    i_70_ |= 0x7;
	else {
	    if (0 != aByte7943 || 0 != anInt7917 * 80970075)
		i_70_ |= 0x2;
	    if (261048199 * anInt7916 != 0)
		i_70_ |= 0x1;
	    if (-1090495991 * anInt7882 != 0)
		i_70_ |= 0x4;
	}
	if (bool)
	    i_70_ |= 0x40000;
	boolean bool_71_
	    = 0 != aByte7943 && (null != class161 || null != class161_65_);
	boolean bool_72_
	    = (anInt7916 * 261048199 != 0 || 0 != 80970075 * anInt7917
	       || 0 != -1090495991 * anInt7882);
	Class20 class20;
	synchronized (aClass592_7873.aClass200_7823) {
	    class20 = (Class20) aClass592_7873.aClass200_7823.method3785(l);
	}
	Class179 class179
	    = (Class179) (null != class20 ? class20.anObject207 : null);
	Class525_Sub16_Sub17 class525_sub16_sub17 = null;
	if (class179 == null
	    || class182.method3321(class179.method2928(), i_70_) != 0) {
	    if (null != class179)
		i_70_ = class182.method3229(i_70_, class179.method2928());
	    int i_73_ = i_70_;
	    if (Class608.aClass608_7996.anInt7995 * -1214990409 == i_63_
		&& i_64_ > 3)
		i_73_ |= 0x5;
	    class179 = method9908(class182, i_73_, i_63_, i_64_, class604,
				  -356258659);
	    if (class179 == null)
		return null;
	    if (i_63_ == Class608.aClass608_7996.anInt7995 * -1214990409
		&& i_64_ > 3)
		class179.method2930(2048);
	    if (bool && !bool_71_ && !bool_72_)
		class525_sub16_sub17 = class179.method2955(null);
	    class179.method3010(i_70_);
	    class20 = new Class20(class179, class525_sub16_sub17);
	    synchronized (aClass592_7873.aClass200_7823) {
		aClass592_7873.aClass200_7823.method3788(class20, l);
	    }
	} else {
	    class525_sub16_sub17 = (Class525_Sub16_Sub17) class20.anObject208;
	    if (bool && class525_sub16_sub17 == null && !bool_71_ && !bool_72_)
		class525_sub16_sub17
		    = (Class525_Sub16_Sub17) (class20.anObject208
					      = class179.method2955(null));
	}
	if (bool_71_ || bool_72_) {
	    class179 = class179.method2926((byte) 0, i_70_, true);
	    if (bool_71_)
		class179.method2937(aByte7943, anInt7890 * 1149948829,
				    class161, class161_65_, i_66_, i_67_,
				    i_68_);
	    if (bool_72_)
		class179.method2934(261048199 * anInt7916,
				    anInt7917 * 80970075,
				    -1090495991 * anInt7882);
	    if (bool)
		class525_sub16_sub17 = class179.method2955(null);
	    class179.method3010(i);
	} else
	    class179 = class179.method2926((byte) 0, i, true);
	aClass592_7873.aClass20_7825.anObject207 = class179;
	aClass592_7873.aClass20_7825.anObject208 = class525_sub16_sub17;
	return aClass592_7873.aClass20_7825;
    }
    
    public void method68(RSBuffer class525_sub38) {
	for (;;) {
	    int i = class525_sub38.readUnsignedByte(457212053);
	    if (0 == i)
		break;
	    method9938(class525_sub38, i, 501271953);
	}
    }
    
    public void method69() {
	method9904(-673124123);
	if (aBool7903)
	    anInt7887 = 0;
	if (!aClass592_7873.aBool7822 && aBool7936) {
	    aStringArray7901 = null;
	    anIntArray7939 = null;
	}
    }
    
    public int[] method9920() {
	return anIntArray7904;
    }
    
    void method9921(RSBuffer class525_sub38, int i) {
	if (i == 1) {
	    int i_74_ = class525_sub38.readUnsignedByte(1150253392);
	    aByteArray7871 = new byte[i_74_];
	    anIntArrayArray7872 = new int[i_74_][];
	    for (int i_75_ = 0; i_75_ < i_74_; i_75_++) {
		aByteArray7871[i_75_]
		    = class525_sub38.readByte(-1150098071);
		int i_76_ = class525_sub38.readUnsignedByte(1721075017);
		anIntArrayArray7872[i_75_] = new int[i_76_];
		for (int i_77_ = 0; i_77_ < i_76_; i_77_++)
		    anIntArrayArray7872[i_75_][i_77_]
			= class525_sub38.readBigSmart(-2043778683);
	    }
	} else if (2 == i)
	    aString7928 = class525_sub38.readString((byte) 20).intern();
	else if (14 == i)
	    anInt7885 = class525_sub38.readUnsignedByte(1328867937) * -916328711;
	else if (i == 15)
	    anInt7886 = class525_sub38.readUnsignedByte(1107289614) * -484582415;
	else if (i == 17)
	    anInt7887 = 0;
	else if (i != 18) {
	    if (19 == i)
		anInt7888 = class525_sub38.readUnsignedByte(334258407) * 1751476543;
	    else if (21 == i)
		aByte7943 = (byte) 1;
	    else if (22 == i)
		aBool7889 = true;
	    else if (23 == i)
		anInt7892 = -769582769;
	    else if (24 == i) {
		int i_78_ = class525_sub38.readBigSmart(-2043778683);
		if (-1 != i_78_)
		    anIntArray7904 = new int[] { i_78_ };
	    } else if (i == 27)
		anInt7887 = -931898081;
	    else if (28 == i)
		anInt7898 = ((class525_sub38.readUnsignedByte(1750082677) << 2)
			     * -966283989);
	    else if (29 == i)
		anInt7899
		    = class525_sub38.readByte(-1150098071) * -382358839;
	    else if (i == 39)
		anInt7900
		    = class525_sub38.readByte(-1150098071) * -1745334049;
	    else if (i >= 30 && i < 35)
		aStringArray7901[i - 30]
		    = class525_sub38.readString((byte) -61).intern();
	    else if (i == 40) {
		int i_79_ = class525_sub38.readUnsignedByte(1765379885);
		aShortArray7874 = new short[i_79_];
		aShortArray7933 = new short[i_79_];
		for (int i_80_ = 0; i_80_ < i_79_; i_80_++) {
		    aShortArray7874[i_80_]
			= (short) class525_sub38.readUnsignedShort((byte) 112);
		    aShortArray7933[i_80_]
			= (short) class525_sub38.readUnsignedShort((byte) 103);
		}
	    } else if (41 == i) {
		int i_81_ = class525_sub38.readUnsignedByte(966870028);
		aShortArray7877 = new short[i_81_];
		aShortArray7878 = new short[i_81_];
		for (int i_82_ = 0; i_82_ < i_81_; i_82_++) {
		    aShortArray7877[i_82_]
			= (short) class525_sub38.readUnsignedShort((byte) 84);
		    aShortArray7878[i_82_]
			= (short) class525_sub38.readUnsignedShort((byte) 88);
		}
	    } else if (i == 42) {
		int i_83_ = class525_sub38.readUnsignedByte(1620021274);
		aByteArray7876 = new byte[i_83_];
		for (int i_84_ = 0; i_84_ < i_83_; i_84_++)
		    aByteArray7876[i_84_]
			= class525_sub38.readByte(-1150098071);
	    } else if (44 == i) {
		int i_85_ = class525_sub38.readUnsignedShort((byte) 11);
		int i_86_ = 0;
		for (int i_87_ = i_85_; i_87_ > 0; i_87_ >>= 1)
		    i_86_++;
		aByteArray7869 = new byte[i_86_];
		byte i_88_ = 0;
		for (int i_89_ = 0; i_89_ < i_86_; i_89_++) {
		    if ((i_85_ & 1 << i_89_) > 0) {
			aByteArray7869[i_89_] = i_88_;
			i_88_++;
		    } else
			aByteArray7869[i_89_] = (byte) -1;
		}
	    } else if (45 == i) {
		int i_90_ = class525_sub38.readUnsignedShort((byte) 126);
		int i_91_ = 0;
		for (int i_92_ = i_90_; i_92_ > 0; i_92_ >>= 1)
		    i_91_++;
		aByteArray7880 = new byte[i_91_];
		byte i_93_ = 0;
		for (int i_94_ = 0; i_94_ < i_91_; i_94_++) {
		    if ((i_90_ & 1 << i_94_) > 0) {
			aByteArray7880[i_94_] = i_93_;
			i_93_++;
		    } else
			aByteArray7880[i_94_] = (byte) -1;
		}
	    } else if (62 == i)
		aBool7891 = true;
	    else if (64 == i)
		aBool7875 = false;
	    else if (i == 65)
		anInt7910 = class525_sub38.readUnsignedShort((byte) 8) * -1657554803;
	    else if (66 == i)
		anInt7911 = class525_sub38.readUnsignedShort((byte) 49) * 1554321677;
	    else if (i == 67)
		anInt7931 = class525_sub38.readUnsignedShort((byte) 124) * 64057759;
	    else if (i == 69)
		class525_sub38.readUnsignedByte(1587039741);
	    else if (70 == i)
		anInt7913 = ((class525_sub38.method16625((byte) -88) << 2)
			     * 703863209);
	    else if (i == 71)
		anInt7914 = ((class525_sub38.method16625((byte) 10) << 2)
			     * -1071777189);
	    else if (72 == i)
		anInt7915 = ((class525_sub38.method16625((byte) -86) << 2)
			     * 308353281);
	    else if (i == 73)
		aBool7919 = true;
	    else if (74 == i)
		aBool7903 = true;
	    else if (i == 75)
		anInt7921
		    = class525_sub38.readUnsignedByte(1801253229) * -351855733;
	    else if (i == 77 || i == 92) {
		anInt7924 = class525_sub38.readUnsignedShort((byte) 3) * 352159907;
		if (65535 == -693493 * anInt7924)
		    anInt7924 = -352159907;
		anInt7941 = class525_sub38.readUnsignedShort((byte) 61) * 291436913;
		if (65535 == anInt7941 * -1640192111)
		    anInt7941 = -291436913;
		int i_95_ = -1;
		if (92 == i)
		    i_95_ = class525_sub38.readBigSmart(-2043778683);
		int i_96_ = class525_sub38.readUnsignedByte(231922297);
		anIntArray7923 = new int[i_96_ + 2];
		for (int i_97_ = 0; i_97_ <= i_96_; i_97_++)
		    anIntArray7923[i_97_]
			= class525_sub38.readBigSmart(-2043778683);
		anIntArray7923[1 + i_96_] = i_95_;
	    } else if (i == 78) {
		anInt7866 = class525_sub38.readUnsignedShort((byte) 67) * 553243461;
		anInt7927
		    = class525_sub38.readUnsignedByte(2035540679) * -326241115;
	    } else if (i == 79) {
		anInt7930
		    = class525_sub38.readUnsignedShort((byte) 115) * 1056942057;
		anInt7908 = class525_sub38.readUnsignedShort((byte) 44) * 2006730543;
		anInt7927 = class525_sub38.readUnsignedByte(26773956) * -326241115;
		int i_98_ = class525_sub38.readUnsignedByte(317215202);
		anIntArray7868 = new int[i_98_];
		for (int i_99_ = 0; i_99_ < i_98_; i_99_++)
		    anIntArray7868[i_99_]
			= class525_sub38.readUnsignedShort((byte) 64);
	    } else if (i == 81) {
		aByte7943 = (byte) 2;
		anInt7890 = class525_sub38.readUnsignedByte(641365474) * 1363850496;
	    } else if (82 == i)
		aBool7934 = true;
	    else if (88 == i)
		aBool7926 = false;
	    else if (i == 89)
		aBool7909 = false;
	    else if (i == 91)
		aBool7936 = true;
	    else if (93 == i) {
		aByte7943 = (byte) 3;
		anInt7890 = class525_sub38.readUnsignedShort((byte) 74) * 72436405;
	    } else if (i == 94)
		aByte7943 = (byte) 4;
	    else if (i == 95) {
		aByte7943 = (byte) 5;
		anInt7890 = class525_sub38.method16625((byte) 33) * 72436405;
	    } else if (i == 97)
		aBool7905 = true;
	    else if (i == 98)
		aBool7938 = true;
	    else if (i == 99 || i == 100) {
		class525_sub38.readUnsignedByte(507513579);
		class525_sub38.readUnsignedShort((byte) 85);
	    } else if (101 == i)
		anInt7906 = class525_sub38.readUnsignedByte(878112099) * 1793019373;
	    else if (i == 102)
		anInt7895
		    = class525_sub38.readUnsignedShort((byte) 120) * -491601217;
	    else if (103 == i)
		anInt7892 = 0;
	    else if (i == 104)
		anInt7929
		    = class525_sub38.readUnsignedByte(1020077635) * -754707255;
	    else if (i == 105)
		aBool7945 = true;
	    else if (i == 106) {
		int i_100_ = class525_sub38.readUnsignedByte(2145095335);
		int i_101_ = 0;
		anIntArray7904 = new int[i_100_];
		anIntArray7896 = new int[i_100_];
		for (int i_102_ = 0; i_102_ < i_100_; i_102_++) {
		    anIntArray7904[i_102_]
			= class525_sub38.readBigSmart(-2043778683);
		    i_101_ += anIntArray7896[i_102_]
			= class525_sub38.readUnsignedByte(1936707870);
		}
		for (int i_103_ = 0; i_103_ < i_100_; i_103_++)
		    anIntArray7896[i_103_]
			= 65535 * anIntArray7896[i_103_] / i_101_;
	    } else if (i == 107)
		anInt7918 = class525_sub38.readUnsignedShort((byte) 75) * 1890485685;
	    else if (i >= 150 && i < 155) {
		aStringArray7901[i - 150]
		    = class525_sub38.readString((byte) -112).intern();
		if (!aClass592_7873.aBool7822)
		    aStringArray7901[i - 150] = null;
	    } else if (i == 160) {
		int i_104_ = class525_sub38.readUnsignedByte(1041296253);
		anIntArray7939 = new int[i_104_];
		for (int i_105_ = 0; i_105_ < i_104_; i_105_++)
		    anIntArray7939[i_105_]
			= class525_sub38.readUnsignedShort((byte) 79);
	    } else if (i == 162) {
		aByte7943 = (byte) 3;
		anInt7890 = class525_sub38.readInt(1483874262) * 72436405;
	    } else if (163 == i) {
		aByte7881 = class525_sub38.readByte(-1150098071);
		aByte7932 = class525_sub38.readByte(-1150098071);
		aByte7883 = class525_sub38.readByte(-1150098071);
		aByte7884 = class525_sub38.readByte(-1150098071);
	    } else if (164 == i)
		anInt7916 = class525_sub38.method16625((byte) 23) * -430977481;
	    else if (i == 165)
		anInt7917
		    = class525_sub38.method16625((byte) 75) * -1059010861;
	    else if (166 == i)
		anInt7882 = class525_sub38.method16625((byte) 64) * 748246073;
	    else if (167 == i)
		anInt7922 = class525_sub38.readUnsignedShort((byte) 64) * -774037571;
	    else if (168 != i && 169 != i) {
		if (i == 170)
		    anInt7893
			= class525_sub38.method16740((byte) -26) * -918721877;
		else if (171 == i)
		    anInt7879
			= class525_sub38.method16740((byte) -27) * -342010581;
		else if (i == 173) {
		    anInt7940
			= class525_sub38.readUnsignedShort((byte) 97) * 864189957;
		    anInt7907
			= class525_sub38.readUnsignedShort((byte) 2) * 675788047;
		} else if (i == 177)
		    aBool7942 = true;
		else if (i == 178)
		    anInt7935
			= class525_sub38.readUnsignedByte(1648091467) * -1049266893;
		else if (186 == i)
		    aClass605_7944
			= ((Class605)
			   Class539.method8888(Class264.method4791(1268305072),
					       class525_sub38
						   .readUnsignedByte(912369241),
					       -1747441968));
		else if (i != 188) {
		    if (189 == i)
			aBool7937 = true;
		    else if (i >= 190 && i < 196) {
			if (null == anIntArray7925) {
			    anIntArray7925 = new int[6];
			    Arrays.fill(anIntArray7925, -1);
			}
			anIntArray7925[i - 190]
			    = class525_sub38.readUnsignedShort((byte) 112);
		    } else if (196 == i)
			Class539.method8888(Class96.method1815((byte) 85),
					    class525_sub38
						.readUnsignedByte(634123126),
					    1844381256);
		    else if (i == 197)
			Class539.method8888(Class470.method7730(1739496588),
					    class525_sub38
						.readUnsignedByte(374569475),
					    -761215163);
		    else if (i != 198 && i != 199) {
			if (i == 200)
			    aBool7897 = true;
			else if (i == 201) {
			    aClass443_7920 = new Class443();
			    aClass443_7920.aFloat4877
				= (float) class525_sub38
					      .method16640(993241788);
			    aClass443_7920.aFloat4873
				= (float) class525_sub38
					      .method16640(993241788);
			    aClass443_7920.aFloat4871
				= (float) class525_sub38
					      .method16640(993241788);
			    aClass443_7920.aFloat4875
				= (float) class525_sub38
					      .method16640(993241788);
			    aClass443_7920.aFloat4869
				= (float) class525_sub38
					      .method16640(993241788);
			    aClass443_7920.aFloat4874
				= (float) class525_sub38
					      .method16640(993241788);
			} else if (249 == i) {
			    int i_106_
				= class525_sub38.readUnsignedByte(1849051249);
			    if (null == aClass10_7902) {
				int i_107_
				    = Class212.method3935(i_106_, -2056250364);
				aClass10_7902 = new Class10(i_107_);
			    }
			    for (int i_108_ = 0; i_108_ < i_106_; i_108_++) {
				boolean bool
				    = (class525_sub38.readUnsignedByte(1561440114)
				       == 1);
				int i_109_
				    = class525_sub38.method16834(-1994884458);
				Class525 class525;
				if (bool)
				    class525
					= new Class525_Sub19(class525_sub38
								 .readString
								 ((byte) 40)
								 .intern());
				else
				    class525
					= new Class525_Sub42(class525_sub38
								 .readInt
							     (1830354384));
				aClass10_7902.method695(class525,
							(long) i_109_);
			    }
			}
		    }
		}
	    }
	}
    }
    
    public final synchronized Class20 method9922
	(Class182 class182, int i, int i_110_, int i_111_, Class161 class161,
	 Class161 class161_112_, int i_113_, int i_114_, int i_115_,
	 boolean bool, Class604 class604) {
	if (Class5.method542(i_110_, 792168441))
	    i_110_ = Class608.aClass608_7976.anInt7995 * -1214990409;
	long l
	    = (long) ((i_110_ << 3) + (1156889815 * anInt7894 << 10) + i_111_);
	l |= (long) (class182.anInt1942 * -2117565327 << 29);
	if (class604 != null)
	    l |= class604.aLong7954 * -768056368964829315L << 32;
	int i_116_ = i;
	if (aByte7943 == 3)
	    i_116_ |= 0x7;
	else {
	    if (0 != aByte7943 || 0 != anInt7917 * 80970075)
		i_116_ |= 0x2;
	    if (261048199 * anInt7916 != 0)
		i_116_ |= 0x1;
	    if (-1090495991 * anInt7882 != 0)
		i_116_ |= 0x4;
	}
	if (bool)
	    i_116_ |= 0x40000;
	boolean bool_117_
	    = 0 != aByte7943 && (null != class161 || null != class161_112_);
	boolean bool_118_
	    = (anInt7916 * 261048199 != 0 || 0 != 80970075 * anInt7917
	       || 0 != -1090495991 * anInt7882);
	Class20 class20;
	synchronized (aClass592_7873.aClass200_7823) {
	    class20 = (Class20) aClass592_7873.aClass200_7823.method3785(l);
	}
	Class179 class179
	    = (Class179) (null != class20 ? class20.anObject207 : null);
	Class525_Sub16_Sub17 class525_sub16_sub17 = null;
	if (class179 == null
	    || class182.method3321(class179.method2928(), i_116_) != 0) {
	    if (null != class179)
		i_116_ = class182.method3229(i_116_, class179.method2928());
	    int i_119_ = i_116_;
	    if (Class608.aClass608_7996.anInt7995 * -1214990409 == i_110_
		&& i_111_ > 3)
		i_119_ |= 0x5;
	    class179 = method9908(class182, i_119_, i_110_, i_111_, class604,
				  687299354);
	    if (class179 == null)
		return null;
	    if (i_110_ == Class608.aClass608_7996.anInt7995 * -1214990409
		&& i_111_ > 3)
		class179.method2930(2048);
	    if (bool && !bool_117_ && !bool_118_)
		class525_sub16_sub17 = class179.method2955(null);
	    class179.method3010(i_116_);
	    class20 = new Class20(class179, class525_sub16_sub17);
	    synchronized (aClass592_7873.aClass200_7823) {
		aClass592_7873.aClass200_7823.method3788(class20, l);
	    }
	} else {
	    class525_sub16_sub17 = (Class525_Sub16_Sub17) class20.anObject208;
	    if (bool && class525_sub16_sub17 == null && !bool_117_
		&& !bool_118_)
		class525_sub16_sub17
		    = (Class525_Sub16_Sub17) (class20.anObject208
					      = class179.method2955(null));
	}
	if (bool_117_ || bool_118_) {
	    class179 = class179.method2926((byte) 0, i_116_, true);
	    if (bool_117_)
		class179.method2937(aByte7943, anInt7890 * 1149948829,
				    class161, class161_112_, i_113_, i_114_,
				    i_115_);
	    if (bool_118_)
		class179.method2934(261048199 * anInt7916,
				    anInt7917 * 80970075,
				    -1090495991 * anInt7882);
	    if (bool)
		class525_sub16_sub17 = class179.method2955(null);
	    class179.method3010(i);
	} else
	    class179 = class179.method2926((byte) 0, i, true);
	aClass592_7873.aClass20_7825.anObject207 = class179;
	aClass592_7873.aClass20_7825.anObject208 = class525_sub16_sub17;
	return aClass592_7873.aClass20_7825;
    }
    
    void method9923() {
	if (1700857535 * anInt7888 == -1) {
	    anInt7888 = 0;
	    if (null != aByteArray7871 && aByteArray7871.length == 1
		&& (Class608.aClass608_7996.anInt7995 * -1214990409
		    == aByteArray7871[0]))
		anInt7888 = 1751476543;
	    for (int i = 0; i < 5; i++) {
		if (null != aStringArray7901[i]) {
		    anInt7888 = 1751476543;
		    break;
		}
	    }
	}
	if (-1 == 1596797987 * anInt7921)
	    anInt7921 = -351855733 * (668917471 * anInt7887 != 0 ? 1 : 0);
	if (method9956(-2061736963) || aBool7938 || anIntArray7923 != null)
	    aBool7942 = true;
	if (1700857535 * anInt7888 <= 0
	    && aClass605_7944 != Class605.aClass605_7962) {
	    /* empty */
	}
    }
    
    void method9924() {
	if (1700857535 * anInt7888 == -1) {
	    anInt7888 = 0;
	    if (null != aByteArray7871 && aByteArray7871.length == 1
		&& (Class608.aClass608_7996.anInt7995 * -1214990409
		    == aByteArray7871[0]))
		anInt7888 = 1751476543;
	    for (int i = 0; i < 5; i++) {
		if (null != aStringArray7901[i]) {
		    anInt7888 = 1751476543;
		    break;
		}
	    }
	}
	if (-1 == 1596797987 * anInt7921)
	    anInt7921 = -351855733 * (668917471 * anInt7887 != 0 ? 1 : 0);
	if (method9956(-2098228518) || aBool7938 || anIntArray7923 != null)
	    aBool7942 = true;
	if (1700857535 * anInt7888 <= 0
	    && aClass605_7944 != Class605.aClass605_7962) {
	    /* empty */
	}
    }
    
    public final boolean method9925(int i) {
	if (anIntArrayArray7872 == null)
	    return true;
	boolean bool = true;
	for (int i_120_ = 0; i_120_ < aByteArray7871.length; i_120_++) {
	    if (aByteArray7871[i_120_] == i) {
		for (int i_121_ = 0;
		     i_121_ < anIntArrayArray7872[i_120_].length; i_121_++) {
		    if (!aClass592_7873.method9803((anIntArrayArray7872[i_120_]
						    [i_121_]),
						   -807224623))
			bool = false;
		}
	    }
	}
	return bool;
    }
    
    public final boolean method9926(int i) {
	if (anIntArrayArray7872 == null)
	    return true;
	boolean bool = true;
	for (int i_122_ = 0; i_122_ < aByteArray7871.length; i_122_++) {
	    if (aByteArray7871[i_122_] == i) {
		for (int i_123_ = 0;
		     i_123_ < anIntArrayArray7872[i_122_].length; i_123_++) {
		    if (!aClass592_7873.method9803((anIntArrayArray7872[i_122_]
						    [i_123_]),
						   -807224623))
			bool = false;
		}
	    }
	}
	return bool;
    }
    
    public final boolean method9927(int i) {
	if (anIntArrayArray7872 == null)
	    return true;
	boolean bool = true;
	for (int i_124_ = 0; i_124_ < aByteArray7871.length; i_124_++) {
	    if (aByteArray7871[i_124_] == i) {
		for (int i_125_ = 0;
		     i_125_ < anIntArrayArray7872[i_124_].length; i_125_++) {
		    if (!aClass592_7873.method9803((anIntArrayArray7872[i_124_]
						    [i_125_]),
						   -807224623))
			bool = false;
		}
	    }
	}
	return bool;
    }
    
    public final boolean method9928(Class641 class641) {
	if (null == anIntArrayArray7872)
	    return true;
	boolean bool = true;
	for (int i = 0; i < anIntArrayArray7872.length; i++) {
	    for (int i_126_ = 0; i_126_ < anIntArrayArray7872[i].length;
		 i_126_++) {
		boolean bool_127_
		    = aClass592_7873.method9803(anIntArrayArray7872[i][i_126_],
						-807224623);
		bool &= bool_127_;
		if (!bool_127_)
		    class641.anInt8322
			= anIntArrayArray7872[i][i_126_] * -1459355133;
	    }
	}
	return bool;
    }
    
    public int method9929(int i, byte i_128_) {
	if (anIntArray7925 == null)
	    return -1;
	return anIntArray7925[i];
    }
    
    public final boolean method9930(int i) {
	if (anIntArrayArray7872 == null)
	    return true;
	boolean bool = true;
	for (int i_129_ = 0; i_129_ < aByteArray7871.length; i_129_++) {
	    if (aByteArray7871[i_129_] == i) {
		for (int i_130_ = 0;
		     i_130_ < anIntArrayArray7872[i_129_].length; i_130_++) {
		    if (!aClass592_7873.method9803((anIntArrayArray7872[i_129_]
						    [i_130_]),
						   -807224623))
			bool = false;
		}
	    }
	}
	return bool;
    }
    
    public final boolean method9931(Class641 class641) {
	if (null == anIntArrayArray7872)
	    return true;
	boolean bool = true;
	for (int i = 0; i < anIntArrayArray7872.length; i++) {
	    for (int i_131_ = 0; i_131_ < anIntArrayArray7872[i].length;
		 i_131_++) {
		boolean bool_132_
		    = aClass592_7873.method9803(anIntArrayArray7872[i][i_131_],
						-807224623);
		bool &= bool_132_;
		if (!bool_132_)
		    class641.anInt8322
			= anIntArrayArray7872[i][i_131_] * -1459355133;
	    }
	}
	return bool;
    }
    
    void method9932(RSBuffer class525_sub38, int i) {
	if (i == 1) {
	    int i_133_ = class525_sub38.readUnsignedByte(1751170723);
	    aByteArray7871 = new byte[i_133_];
	    anIntArrayArray7872 = new int[i_133_][];
	    for (int i_134_ = 0; i_134_ < i_133_; i_134_++) {
		aByteArray7871[i_134_]
		    = class525_sub38.readByte(-1150098071);
		int i_135_ = class525_sub38.readUnsignedByte(68418900);
		anIntArrayArray7872[i_134_] = new int[i_135_];
		for (int i_136_ = 0; i_136_ < i_135_; i_136_++)
		    anIntArrayArray7872[i_134_][i_136_]
			= class525_sub38.readBigSmart(-2043778683);
	    }
	} else if (2 == i)
	    aString7928 = class525_sub38.readString((byte) -73).intern();
	else if (14 == i)
	    anInt7885 = class525_sub38.readUnsignedByte(1848003273) * -916328711;
	else if (i == 15)
	    anInt7886 = class525_sub38.readUnsignedByte(1337102135) * -484582415;
	else if (i == 17)
	    anInt7887 = 0;
	else if (i != 18) {
	    if (19 == i)
		anInt7888
		    = class525_sub38.readUnsignedByte(1988782949) * 1751476543;
	    else if (21 == i)
		aByte7943 = (byte) 1;
	    else if (22 == i)
		aBool7889 = true;
	    else if (23 == i)
		anInt7892 = -769582769;
	    else if (24 == i) {
		int i_137_ = class525_sub38.readBigSmart(-2043778683);
		if (-1 != i_137_)
		    anIntArray7904 = new int[] { i_137_ };
	    } else if (i == 27)
		anInt7887 = -931898081;
	    else if (28 == i)
		anInt7898 = ((class525_sub38.readUnsignedByte(1643128389) << 2)
			     * -966283989);
	    else if (29 == i)
		anInt7899
		    = class525_sub38.readByte(-1150098071) * -382358839;
	    else if (i == 39)
		anInt7900
		    = class525_sub38.readByte(-1150098071) * -1745334049;
	    else if (i >= 30 && i < 35)
		aStringArray7901[i - 30]
		    = class525_sub38.readString((byte) 6).intern();
	    else if (i == 40) {
		int i_138_ = class525_sub38.readUnsignedByte(2072280618);
		aShortArray7874 = new short[i_138_];
		aShortArray7933 = new short[i_138_];
		for (int i_139_ = 0; i_139_ < i_138_; i_139_++) {
		    aShortArray7874[i_139_]
			= (short) class525_sub38.readUnsignedShort((byte) 75);
		    aShortArray7933[i_139_]
			= (short) class525_sub38.readUnsignedShort((byte) 36);
		}
	    } else if (41 == i) {
		int i_140_ = class525_sub38.readUnsignedByte(733392614);
		aShortArray7877 = new short[i_140_];
		aShortArray7878 = new short[i_140_];
		for (int i_141_ = 0; i_141_ < i_140_; i_141_++) {
		    aShortArray7877[i_141_]
			= (short) class525_sub38.readUnsignedShort((byte) 98);
		    aShortArray7878[i_141_]
			= (short) class525_sub38.readUnsignedShort((byte) 63);
		}
	    } else if (i == 42) {
		int i_142_ = class525_sub38.readUnsignedByte(10756964);
		aByteArray7876 = new byte[i_142_];
		for (int i_143_ = 0; i_143_ < i_142_; i_143_++)
		    aByteArray7876[i_143_]
			= class525_sub38.readByte(-1150098071);
	    } else if (44 == i) {
		int i_144_ = class525_sub38.readUnsignedShort((byte) 117);
		int i_145_ = 0;
		for (int i_146_ = i_144_; i_146_ > 0; i_146_ >>= 1)
		    i_145_++;
		aByteArray7869 = new byte[i_145_];
		byte i_147_ = 0;
		for (int i_148_ = 0; i_148_ < i_145_; i_148_++) {
		    if ((i_144_ & 1 << i_148_) > 0) {
			aByteArray7869[i_148_] = i_147_;
			i_147_++;
		    } else
			aByteArray7869[i_148_] = (byte) -1;
		}
	    } else if (45 == i) {
		int i_149_ = class525_sub38.readUnsignedShort((byte) 23);
		int i_150_ = 0;
		for (int i_151_ = i_149_; i_151_ > 0; i_151_ >>= 1)
		    i_150_++;
		aByteArray7880 = new byte[i_150_];
		byte i_152_ = 0;
		for (int i_153_ = 0; i_153_ < i_150_; i_153_++) {
		    if ((i_149_ & 1 << i_153_) > 0) {
			aByteArray7880[i_153_] = i_152_;
			i_152_++;
		    } else
			aByteArray7880[i_153_] = (byte) -1;
		}
	    } else if (62 == i)
		aBool7891 = true;
	    else if (64 == i)
		aBool7875 = false;
	    else if (i == 65)
		anInt7910
		    = class525_sub38.readUnsignedShort((byte) 45) * -1657554803;
	    else if (66 == i)
		anInt7911 = class525_sub38.readUnsignedShort((byte) 26) * 1554321677;
	    else if (i == 67)
		anInt7931 = class525_sub38.readUnsignedShort((byte) 97) * 64057759;
	    else if (i == 69)
		class525_sub38.readUnsignedByte(921184474);
	    else if (70 == i)
		anInt7913 = ((class525_sub38.method16625((byte) -52) << 2)
			     * 703863209);
	    else if (i == 71)
		anInt7914 = ((class525_sub38.method16625((byte) 62) << 2)
			     * -1071777189);
	    else if (72 == i)
		anInt7915
		    = (class525_sub38.method16625((byte) 42) << 2) * 308353281;
	    else if (i == 73)
		aBool7919 = true;
	    else if (74 == i)
		aBool7903 = true;
	    else if (i == 75)
		anInt7921 = class525_sub38.readUnsignedByte(139944075) * -351855733;
	    else if (i == 77 || i == 92) {
		anInt7924 = class525_sub38.readUnsignedShort((byte) 50) * 352159907;
		if (65535 == -693493 * anInt7924)
		    anInt7924 = -352159907;
		anInt7941 = class525_sub38.readUnsignedShort((byte) 66) * 291436913;
		if (65535 == anInt7941 * -1640192111)
		    anInt7941 = -291436913;
		int i_154_ = -1;
		if (92 == i)
		    i_154_ = class525_sub38.readBigSmart(-2043778683);
		int i_155_ = class525_sub38.readUnsignedByte(48689721);
		anIntArray7923 = new int[i_155_ + 2];
		for (int i_156_ = 0; i_156_ <= i_155_; i_156_++)
		    anIntArray7923[i_156_]
			= class525_sub38.readBigSmart(-2043778683);
		anIntArray7923[1 + i_155_] = i_154_;
	    } else if (i == 78) {
		anInt7866 = class525_sub38.readUnsignedShort((byte) 22) * 553243461;
		anInt7927 = class525_sub38.readUnsignedByte(36789331) * -326241115;
	    } else if (i == 79) {
		anInt7930 = class525_sub38.readUnsignedShort((byte) 84) * 1056942057;
		anInt7908 = class525_sub38.readUnsignedShort((byte) 81) * 2006730543;
		anInt7927 = class525_sub38.readUnsignedByte(645829218) * -326241115;
		int i_157_ = class525_sub38.readUnsignedByte(348657332);
		anIntArray7868 = new int[i_157_];
		for (int i_158_ = 0; i_158_ < i_157_; i_158_++)
		    anIntArray7868[i_158_]
			= class525_sub38.readUnsignedShort((byte) 83);
	    } else if (i == 81) {
		aByte7943 = (byte) 2;
		anInt7890 = class525_sub38.readUnsignedByte(436923836) * 1363850496;
	    } else if (82 == i)
		aBool7934 = true;
	    else if (88 == i)
		aBool7926 = false;
	    else if (i == 89)
		aBool7909 = false;
	    else if (i == 91)
		aBool7936 = true;
	    else if (93 == i) {
		aByte7943 = (byte) 3;
		anInt7890 = class525_sub38.readUnsignedShort((byte) 94) * 72436405;
	    } else if (i == 94)
		aByte7943 = (byte) 4;
	    else if (i == 95) {
		aByte7943 = (byte) 5;
		anInt7890 = class525_sub38.method16625((byte) -16) * 72436405;
	    } else if (i == 97)
		aBool7905 = true;
	    else if (i == 98)
		aBool7938 = true;
	    else if (i == 99 || i == 100) {
		class525_sub38.readUnsignedByte(312685039);
		class525_sub38.readUnsignedShort((byte) 123);
	    } else if (101 == i)
		anInt7906
		    = class525_sub38.readUnsignedByte(1312162926) * 1793019373;
	    else if (i == 102)
		anInt7895 = class525_sub38.readUnsignedShort((byte) 52) * -491601217;
	    else if (103 == i)
		anInt7892 = 0;
	    else if (i == 104)
		anInt7929 = class525_sub38.readUnsignedByte(427109843) * -754707255;
	    else if (i == 105)
		aBool7945 = true;
	    else if (i == 106) {
		int i_159_ = class525_sub38.readUnsignedByte(1236296750);
		int i_160_ = 0;
		anIntArray7904 = new int[i_159_];
		anIntArray7896 = new int[i_159_];
		for (int i_161_ = 0; i_161_ < i_159_; i_161_++) {
		    anIntArray7904[i_161_]
			= class525_sub38.readBigSmart(-2043778683);
		    i_160_ += anIntArray7896[i_161_]
			= class525_sub38.readUnsignedByte(495651998);
		}
		for (int i_162_ = 0; i_162_ < i_159_; i_162_++)
		    anIntArray7896[i_162_]
			= 65535 * anIntArray7896[i_162_] / i_160_;
	    } else if (i == 107)
		anInt7918 = class525_sub38.readUnsignedShort((byte) 39) * 1890485685;
	    else if (i >= 150 && i < 155) {
		aStringArray7901[i - 150]
		    = class525_sub38.readString((byte) -3).intern();
		if (!aClass592_7873.aBool7822)
		    aStringArray7901[i - 150] = null;
	    } else if (i == 160) {
		int i_163_ = class525_sub38.readUnsignedByte(1384601917);
		anIntArray7939 = new int[i_163_];
		for (int i_164_ = 0; i_164_ < i_163_; i_164_++)
		    anIntArray7939[i_164_]
			= class525_sub38.readUnsignedShort((byte) 15);
	    } else if (i == 162) {
		aByte7943 = (byte) 3;
		anInt7890 = class525_sub38.readInt(842534274) * 72436405;
	    } else if (163 == i) {
		aByte7881 = class525_sub38.readByte(-1150098071);
		aByte7932 = class525_sub38.readByte(-1150098071);
		aByte7883 = class525_sub38.readByte(-1150098071);
		aByte7884 = class525_sub38.readByte(-1150098071);
	    } else if (164 == i)
		anInt7916 = class525_sub38.method16625((byte) 6) * -430977481;
	    else if (i == 165)
		anInt7917
		    = class525_sub38.method16625((byte) 97) * -1059010861;
	    else if (166 == i)
		anInt7882 = class525_sub38.method16625((byte) -56) * 748246073;
	    else if (167 == i)
		anInt7922
		    = class525_sub38.readUnsignedShort((byte) 107) * -774037571;
	    else if (168 != i && 169 != i) {
		if (i == 170)
		    anInt7893
			= class525_sub38.method16740((byte) -125) * -918721877;
		else if (171 == i)
		    anInt7879
			= class525_sub38.method16740((byte) -60) * -342010581;
		else if (i == 173) {
		    anInt7940
			= class525_sub38.readUnsignedShort((byte) 111) * 864189957;
		    anInt7907
			= class525_sub38.readUnsignedShort((byte) 61) * 675788047;
		} else if (i == 177)
		    aBool7942 = true;
		else if (i == 178)
		    anInt7935
			= class525_sub38.readUnsignedByte(1865560497) * -1049266893;
		else if (186 == i)
		    aClass605_7944
			= ((Class605)
			   Class539.method8888(Class264.method4791(1268305072),
					       class525_sub38
						   .readUnsignedByte(254268110),
					       -195034053));
		else if (i != 188) {
		    if (189 == i)
			aBool7937 = true;
		    else if (i >= 190 && i < 196) {
			if (null == anIntArray7925) {
			    anIntArray7925 = new int[6];
			    Arrays.fill(anIntArray7925, -1);
			}
			anIntArray7925[i - 190]
			    = class525_sub38.readUnsignedShort((byte) 19);
		    } else if (196 == i)
			Class539.method8888(Class96.method1815((byte) 125),
					    class525_sub38
						.readUnsignedByte(1721287457),
					    592870678);
		    else if (i == 197)
			Class539.method8888(Class470.method7730(2145993383),
					    class525_sub38
						.readUnsignedByte(1125575394),
					    -1649881968);
		    else if (i != 198 && i != 199) {
			if (i == 200)
			    aBool7897 = true;
			else if (i == 201) {
			    aClass443_7920 = new Class443();
			    aClass443_7920.aFloat4877
				= (float) class525_sub38
					      .method16640(993241788);
			    aClass443_7920.aFloat4873
				= (float) class525_sub38
					      .method16640(993241788);
			    aClass443_7920.aFloat4871
				= (float) class525_sub38
					      .method16640(993241788);
			    aClass443_7920.aFloat4875
				= (float) class525_sub38
					      .method16640(993241788);
			    aClass443_7920.aFloat4869
				= (float) class525_sub38
					      .method16640(993241788);
			    aClass443_7920.aFloat4874
				= (float) class525_sub38
					      .method16640(993241788);
			} else if (249 == i) {
			    int i_165_ = class525_sub38.readUnsignedByte(992219208);
			    if (null == aClass10_7902) {
				int i_166_
				    = Class212.method3935(i_165_, -2056250364);
				aClass10_7902 = new Class10(i_166_);
			    }
			    for (int i_167_ = 0; i_167_ < i_165_; i_167_++) {
				boolean bool
				    = (class525_sub38.readUnsignedByte(1899545343)
				       == 1);
				int i_168_
				    = class525_sub38.method16834(-1994884458);
				Class525 class525;
				if (bool)
				    class525
					= new Class525_Sub19(class525_sub38
								 .readString
								 ((byte) 86)
								 .intern());
				else
				    class525
					= new Class525_Sub42(class525_sub38
								 .readInt
							     (1778889816));
				aClass10_7902.method695(class525,
							(long) i_168_);
			    }
			}
		    }
		}
	    }
	}
    }
    
    public final boolean method9933(int i) {
	if (anIntArrayArray7872 == null)
	    return true;
	boolean bool = true;
	for (int i_169_ = 0; i_169_ < aByteArray7871.length; i_169_++) {
	    if (aByteArray7871[i_169_] == i) {
		for (int i_170_ = 0;
		     i_170_ < anIntArrayArray7872[i_169_].length; i_170_++) {
		    if (!aClass592_7873.method9803((anIntArrayArray7872[i_169_]
						    [i_170_]),
						   -807224623))
			bool = false;
		}
	    }
	}
	return bool;
    }
    
    public void method70() {
	method9904(-1105435838);
	if (aBool7903)
	    anInt7887 = 0;
	if (!aClass592_7873.aBool7822 && aBool7936) {
	    aStringArray7901 = null;
	    anIntArray7939 = null;
	}
    }
    
    public final boolean method9934(Class641 class641) {
	if (null == anIntArrayArray7872)
	    return true;
	boolean bool = true;
	for (int i = 0; i < anIntArrayArray7872.length; i++) {
	    for (int i_171_ = 0; i_171_ < anIntArrayArray7872[i].length;
		 i_171_++) {
		boolean bool_172_
		    = aClass592_7873.method9803(anIntArrayArray7872[i][i_171_],
						-807224623);
		bool &= bool_172_;
		if (!bool_172_)
		    class641.anInt8322
			= anIntArrayArray7872[i][i_171_] * -1459355133;
	    }
	}
	return bool;
    }
    
    public boolean method9935() {
	return null != anIntArray7904 && anIntArray7904.length > 1;
    }
    
    public int method9936() {
	if (anIntArray7904 != null) {
	    if (anIntArray7904.length > 1) {
		int i = (int) (Math.random() * 65535.0);
		for (int i_173_ = 0; i_173_ < anIntArray7904.length;
		     i_173_++) {
		    if (i <= anIntArray7896[i_173_])
			return anIntArray7904[i_173_];
		    i -= anIntArray7896[i_173_];
		}
	    } else
		return anIntArray7904[0];
	}
	return -1;
    }
    
    public final Class602 method9937(Interface20 interface20,
				     Interface18 interface18) {
	int i = -1;
	if (anInt7924 * -693493 != -1) {
	    Class322 class322
		= interface20.method124(anInt7924 * -693493, 162882926);
	    if (null != class322)
		i = interface18.method93(class322, (byte) 2);
	} else if (-1 != -1640192111 * anInt7941) {
	    Class163 class163
		= interface20.method119(Class453.aClass453_4939,
					-1640192111 * anInt7941, -1392799017);
	    if (class163 != null)
		i = interface18.method104(class163, 623775022);
	}
	if (i < 0 || i >= anIntArray7923.length - 1) {
	    int i_174_ = anIntArray7923[anIntArray7923.length - 1];
	    if (i_174_ != -1)
		return ((Class602)
			anInterface13_7870.method76(i_174_, -1079034977));
	    return null;
	}
	if (anIntArray7923[i] == -1)
	    return null;
	return ((Class602)
		anInterface13_7870.method76(anIntArray7923[i], -1285416345));
    }
    
    void method9938(RSBuffer class525_sub38, int i, int i_175_) {
	if (i == 1) {
	    int i_176_ = class525_sub38.readUnsignedByte(1737266089);
	    aByteArray7871 = new byte[i_176_];
	    anIntArrayArray7872 = new int[i_176_][];
	    for (int i_177_ = 0; i_177_ < i_176_; i_177_++) {
		aByteArray7871[i_177_]
		    = class525_sub38.readByte(-1150098071);
		int i_178_ = class525_sub38.readUnsignedByte(1086711096);
		anIntArrayArray7872[i_177_] = new int[i_178_];
		for (int i_179_ = 0; i_179_ < i_178_; i_179_++)
		    anIntArrayArray7872[i_177_][i_179_]
			= class525_sub38.readBigSmart(-2043778683);
	    }
	} else if (2 == i)
	    aString7928 = class525_sub38.readString((byte) 87).intern();
	else if (14 == i)
	    anInt7885 = class525_sub38.readUnsignedByte(1466683376) * -916328711;
	else if (i == 15)
	    anInt7886 = class525_sub38.readUnsignedByte(1209312474) * -484582415;
	else if (i == 17)
	    anInt7887 = 0;
	else if (i != 18) {
	    if (19 == i)
		anInt7888
		    = class525_sub38.readUnsignedByte(1560373924) * 1751476543;
	    else if (21 == i)
		aByte7943 = (byte) 1;
	    else if (22 == i)
		aBool7889 = true;
	    else if (23 == i)
		anInt7892 = -769582769;
	    else if (24 == i) {
		int i_180_ = class525_sub38.readBigSmart(-2043778683);
		if (-1 != i_180_)
		    anIntArray7904 = new int[] { i_180_ };
	    } else if (i == 27)
		anInt7887 = -931898081;
	    else if (28 == i)
		anInt7898 = ((class525_sub38.readUnsignedByte(793471093) << 2)
			     * -966283989);
	    else if (29 == i)
		anInt7899
		    = class525_sub38.readByte(-1150098071) * -382358839;
	    else if (i == 39)
		anInt7900
		    = class525_sub38.readByte(-1150098071) * -1745334049;
	    else if (i >= 30 && i < 35)
		aStringArray7901[i - 30]
		    = class525_sub38.readString((byte) 49).intern();
	    else if (i == 40) {
		int i_181_ = class525_sub38.readUnsignedByte(167620978);
		aShortArray7874 = new short[i_181_];
		aShortArray7933 = new short[i_181_];
		for (int i_182_ = 0; i_182_ < i_181_; i_182_++) {
		    aShortArray7874[i_182_]
			= (short) class525_sub38.readUnsignedShort((byte) 84);
		    aShortArray7933[i_182_]
			= (short) class525_sub38.readUnsignedShort((byte) 44);
		}
	    } else if (41 == i) {
		int i_183_ = class525_sub38.readUnsignedByte(1845368026);
		aShortArray7877 = new short[i_183_];
		aShortArray7878 = new short[i_183_];
		for (int i_184_ = 0; i_184_ < i_183_; i_184_++) {
		    aShortArray7877[i_184_]
			= (short) class525_sub38.readUnsignedShort((byte) 76);
		    aShortArray7878[i_184_]
			= (short) class525_sub38.readUnsignedShort((byte) 110);
		}
	    } else if (i == 42) {
		int i_185_ = class525_sub38.readUnsignedByte(436498293);
		aByteArray7876 = new byte[i_185_];
		for (int i_186_ = 0; i_186_ < i_185_; i_186_++)
		    aByteArray7876[i_186_]
			= class525_sub38.readByte(-1150098071);
	    } else if (44 == i) {
		int i_187_ = class525_sub38.readUnsignedShort((byte) 43);
		int i_188_ = 0;
		for (int i_189_ = i_187_; i_189_ > 0; i_189_ >>= 1)
		    i_188_++;
		aByteArray7869 = new byte[i_188_];
		byte i_190_ = 0;
		for (int i_191_ = 0; i_191_ < i_188_; i_191_++) {
		    if ((i_187_ & 1 << i_191_) > 0) {
			aByteArray7869[i_191_] = i_190_;
			i_190_++;
		    } else
			aByteArray7869[i_191_] = (byte) -1;
		}
	    } else if (45 == i) {
		int i_192_ = class525_sub38.readUnsignedShort((byte) 86);
		int i_193_ = 0;
		for (int i_194_ = i_192_; i_194_ > 0; i_194_ >>= 1)
		    i_193_++;
		aByteArray7880 = new byte[i_193_];
		byte i_195_ = 0;
		for (int i_196_ = 0; i_196_ < i_193_; i_196_++) {
		    if ((i_192_ & 1 << i_196_) > 0) {
			aByteArray7880[i_196_] = i_195_;
			i_195_++;
		    } else
			aByteArray7880[i_196_] = (byte) -1;
		}
	    } else if (62 == i)
		aBool7891 = true;
	    else if (64 == i)
		aBool7875 = false;
	    else if (i == 65)
		anInt7910
		    = class525_sub38.readUnsignedShort((byte) 29) * -1657554803;
	    else if (66 == i)
		anInt7911 = class525_sub38.readUnsignedShort((byte) 31) * 1554321677;
	    else if (i == 67)
		anInt7931 = class525_sub38.readUnsignedShort((byte) 92) * 64057759;
	    else if (i == 69)
		class525_sub38.readUnsignedByte(1917850258);
	    else if (70 == i)
		anInt7913 = ((class525_sub38.method16625((byte) -43) << 2)
			     * 703863209);
	    else if (i == 71)
		anInt7914 = ((class525_sub38.method16625((byte) -83) << 2)
			     * -1071777189);
	    else if (72 == i)
		anInt7915 = ((class525_sub38.method16625((byte) -16) << 2)
			     * 308353281);
	    else if (i == 73)
		aBool7919 = true;
	    else if (74 == i)
		aBool7903 = true;
	    else if (i == 75)
		anInt7921
		    = class525_sub38.readUnsignedByte(1332565442) * -351855733;
	    else if (i == 77 || i == 92) {
		anInt7924 = class525_sub38.readUnsignedShort((byte) 7) * 352159907;
		if (65535 == -693493 * anInt7924)
		    anInt7924 = -352159907;
		anInt7941 = class525_sub38.readUnsignedShort((byte) 116) * 291436913;
		if (65535 == anInt7941 * -1640192111)
		    anInt7941 = -291436913;
		int i_197_ = -1;
		if (92 == i)
		    i_197_ = class525_sub38.readBigSmart(-2043778683);
		int i_198_ = class525_sub38.readUnsignedByte(2122187885);
		anIntArray7923 = new int[i_198_ + 2];
		for (int i_199_ = 0; i_199_ <= i_198_; i_199_++)
		    anIntArray7923[i_199_]
			= class525_sub38.readBigSmart(-2043778683);
		anIntArray7923[1 + i_198_] = i_197_;
	    } else if (i == 78) {
		anInt7866 = class525_sub38.readUnsignedShort((byte) 28) * 553243461;
		anInt7927 = class525_sub38.readUnsignedByte(170541143) * -326241115;
	    } else if (i == 79) {
		anInt7930 = class525_sub38.readUnsignedShort((byte) 49) * 1056942057;
		anInt7908 = class525_sub38.readUnsignedShort((byte) 44) * 2006730543;
		anInt7927
		    = class525_sub38.readUnsignedByte(1872525947) * -326241115;
		int i_200_ = class525_sub38.readUnsignedByte(1266752592);
		anIntArray7868 = new int[i_200_];
		for (int i_201_ = 0; i_201_ < i_200_; i_201_++)
		    anIntArray7868[i_201_]
			= class525_sub38.readUnsignedShort((byte) 95);
	    } else if (i == 81) {
		aByte7943 = (byte) 2;
		anInt7890 = class525_sub38.readUnsignedByte(232376199) * 1363850496;
	    } else if (82 == i)
		aBool7934 = true;
	    else if (88 == i)
		aBool7926 = false;
	    else if (i == 89)
		aBool7909 = false;
	    else if (i == 91)
		aBool7936 = true;
	    else if (93 == i) {
		aByte7943 = (byte) 3;
		anInt7890 = class525_sub38.readUnsignedShort((byte) 85) * 72436405;
	    } else if (i == 94)
		aByte7943 = (byte) 4;
	    else if (i == 95) {
		aByte7943 = (byte) 5;
		anInt7890 = class525_sub38.method16625((byte) 42) * 72436405;
	    } else if (i == 97)
		aBool7905 = true;
	    else if (i == 98)
		aBool7938 = true;
	    else if (i == 99 || i == 100) {
		class525_sub38.readUnsignedByte(1085981278);
		class525_sub38.readUnsignedShort((byte) 31);
	    } else if (101 == i)
		anInt7906
		    = class525_sub38.readUnsignedByte(1283480179) * 1793019373;
	    else if (i == 102)
		anInt7895
		    = class525_sub38.readUnsignedShort((byte) 122) * -491601217;
	    else if (103 == i)
		anInt7892 = 0;
	    else if (i == 104)
		anInt7929
		    = class525_sub38.readUnsignedByte(2135622342) * -754707255;
	    else if (i == 105)
		aBool7945 = true;
	    else if (i == 106) {
		int i_202_ = class525_sub38.readUnsignedByte(115023551);
		int i_203_ = 0;
		anIntArray7904 = new int[i_202_];
		anIntArray7896 = new int[i_202_];
		for (int i_204_ = 0; i_204_ < i_202_; i_204_++) {
		    anIntArray7904[i_204_]
			= class525_sub38.readBigSmart(-2043778683);
		    i_203_ += anIntArray7896[i_204_]
			= class525_sub38.readUnsignedByte(418237024);
		}
		for (int i_205_ = 0; i_205_ < i_202_; i_205_++)
		    anIntArray7896[i_205_]
			= 65535 * anIntArray7896[i_205_] / i_203_;
	    } else if (i == 107)
		anInt7918 = class525_sub38.readUnsignedShort((byte) 72) * 1890485685;
	    else if (i >= 150 && i < 155) {
		aStringArray7901[i - 150]
		    = class525_sub38.readString((byte) -83).intern();
		if (!aClass592_7873.aBool7822)
		    aStringArray7901[i - 150] = null;
	    } else if (i == 160) {
		int i_206_ = class525_sub38.readUnsignedByte(1731501491);
		anIntArray7939 = new int[i_206_];
		for (int i_207_ = 0; i_207_ < i_206_; i_207_++)
		    anIntArray7939[i_207_]
			= class525_sub38.readUnsignedShort((byte) 23);
	    } else if (i == 162) {
		aByte7943 = (byte) 3;
		anInt7890 = class525_sub38.readInt(2015663332) * 72436405;
	    } else if (163 == i) {
		aByte7881 = class525_sub38.readByte(-1150098071);
		aByte7932 = class525_sub38.readByte(-1150098071);
		aByte7883 = class525_sub38.readByte(-1150098071);
		aByte7884 = class525_sub38.readByte(-1150098071);
	    } else if (164 == i)
		anInt7916 = class525_sub38.method16625((byte) 47) * -430977481;
	    else if (i == 165)
		anInt7917
		    = class525_sub38.method16625((byte) -29) * -1059010861;
	    else if (166 == i)
		anInt7882 = class525_sub38.method16625((byte) 89) * 748246073;
	    else if (167 == i)
		anInt7922 = class525_sub38.readUnsignedShort((byte) 16) * -774037571;
	    else if (168 != i && 169 != i) {
		if (i == 170)
		    anInt7893
			= class525_sub38.method16740((byte) -26) * -918721877;
		else if (171 == i)
		    anInt7879
			= class525_sub38.method16740((byte) -106) * -342010581;
		else if (i == 173) {
		    anInt7940
			= class525_sub38.readUnsignedShort((byte) 84) * 864189957;
		    anInt7907
			= class525_sub38.readUnsignedShort((byte) 2) * 675788047;
		} else if (i == 177)
		    aBool7942 = true;
		else if (i == 178)
		    anInt7935
			= class525_sub38.readUnsignedByte(751419081) * -1049266893;
		else if (186 == i)
		    aClass605_7944
			= ((Class605)
			   Class539.method8888(Class264.method4791(1268305072),
					       class525_sub38
						   .readUnsignedByte(1338399380),
					       -1569921210));
		else if (i != 188) {
		    if (189 == i)
			aBool7937 = true;
		    else if (i >= 190 && i < 196) {
			if (null == anIntArray7925) {
			    anIntArray7925 = new int[6];
			    Arrays.fill(anIntArray7925, -1);
			}
			anIntArray7925[i - 190]
			    = class525_sub38.readUnsignedShort((byte) 102);
		    } else if (196 == i)
			Class539.method8888(Class96.method1815((byte) 64),
					    class525_sub38
						.readUnsignedByte(1242936175),
					    865201492);
		    else if (i == 197)
			Class539.method8888(Class470.method7730(2125238740),
					    class525_sub38
						.readUnsignedByte(1099429763),
					    -1287762371);
		    else if (i != 198 && i != 199) {
			if (i == 200)
			    aBool7897 = true;
			else if (i == 201) {
			    aClass443_7920 = new Class443();
			    aClass443_7920.aFloat4877
				= (float) class525_sub38
					      .method16640(993241788);
			    aClass443_7920.aFloat4873
				= (float) class525_sub38
					      .method16640(993241788);
			    aClass443_7920.aFloat4871
				= (float) class525_sub38
					      .method16640(993241788);
			    aClass443_7920.aFloat4875
				= (float) class525_sub38
					      .method16640(993241788);
			    aClass443_7920.aFloat4869
				= (float) class525_sub38
					      .method16640(993241788);
			    aClass443_7920.aFloat4874
				= (float) class525_sub38
					      .method16640(993241788);
			} else if (249 == i) {
			    int i_208_
				= class525_sub38.readUnsignedByte(1690677693);
			    if (null == aClass10_7902) {
				int i_209_
				    = Class212.method3935(i_208_, -2056250364);
				aClass10_7902 = new Class10(i_209_);
			    }
			    for (int i_210_ = 0; i_210_ < i_208_; i_210_++) {
				boolean bool
				    = (class525_sub38.readUnsignedByte(172475099)
				       == 1);
				int i_211_
				    = class525_sub38.method16834(-1994884458);
				Class525 class525;
				if (bool)
				    class525
					= new Class525_Sub19(class525_sub38
								 .readString
								 ((byte) 1)
								 .intern());
				else
				    class525
					= new Class525_Sub42(class525_sub38
								 .readInt
							     (1051989875));
				aClass10_7902.method695(class525,
							(long) i_211_);
			    }
			}
		    }
		}
	    }
	}
    }
    
    Class179 method9939(Class182 class182, int i, int i_212_, int i_213_,
			Class604 class604) {
	int i_214_ = anInt7899 * -1822650503 + 64;
	int i_215_ = 1610422171 * anInt7900 + 850;
	int i_216_ = i;
	boolean bool
	    = (aBool7891
	       || (-1214990409 * Class608.aClass608_7978.anInt7995 == i_212_
		   && i_213_ > 3));
	if (bool)
	    i |= 0x10;
	if (i_213_ == 0) {
	    if (128 != anInt7910 * -751777211 || 0 != 107322009 * anInt7913)
		i |= 0x1;
	    if (128 != anInt7931 * 669346399 || 0 != anInt7915 * -653269247)
		i |= 0x4;
	} else
	    i |= 0xd;
	if (128 != 1355752901 * anInt7911 || 0 != anInt7914 * 1714070995)
	    i |= 0x2;
	if (aShortArray7874 != null)
	    i |= 0x4000;
	if (aShortArray7877 != null)
	    i |= 0x8000;
	if (aByte7884 != 0)
	    i |= 0x80000;
	Class179 class179 = null;
	if (aByteArray7871 != null) {
	    int i_217_ = -1;
	    for (int i_218_ = 0; i_218_ < aByteArray7871.length; i_218_++) {
		if (aByteArray7871[i_218_] == i_212_) {
		    i_217_ = i_218_;
		    break;
		}
	    }
	    if (i_217_ == -1)
		return null;
	    int[] is
		= (null != class604 && null != class604.anIntArray7956
		   ? class604.anIntArray7956 : anIntArrayArray7872[i_217_]);
	    int i_219_ = is.length;
	    if (i_219_ > 0) {
		long l = (long) (-2117565327 * class182.anInt1942);
		for (int i_220_ = 0; i_220_ < i_219_; i_220_++)
		    l = 67783L * l + (long) is[i_220_];
		synchronized (aClass592_7873.aClass200_7828) {
		    class179 = ((Class179)
				aClass592_7873.aClass200_7828.method3785(l));
		}
		if (null != class179) {
		    if (i_214_ != class179.method3065())
			i |= 0x1000;
		    if (i_215_ != class179.method3026())
			i |= 0x2000;
		}
		if (class179 == null
		    || class182.method3321(class179.method2928(), i) != 0) {
		    int i_221_ = i | 0x1f01f;
		    if (class179 != null)
			i_221_ = class182.method3229(i_221_,
						     class179.method2928());
		    Class186 class186 = null;
		    synchronized (aClass592_7873.aClass186Array7827) {
			for (int i_222_ = 0; i_222_ < i_219_; i_222_++) {
			    byte[] is_223_
				= aClass592_7873.method9802(is[i_222_],
							    (byte) 29);
			    if (null == is_223_) {
				Class179 class179_224_ = null;
				return class179_224_;
			    }
			    class186 = new Class186(is_223_);
			    if (class186.anInt2086 < 13)
				class186.method3651(2);
			    if (i_219_ > 1)
				aClass592_7873.aClass186Array7827[i_222_]
				    = class186;
			}
			if (i_219_ > 1)
			    class186 = new Class186((aClass592_7873
						     .aClass186Array7827),
						    i_219_);
		    }
		    class179 = class182.method3556(class186, i_221_,
						   1500613919 * (aClass592_7873
								 .anInt7821),
						   i_214_, i_215_);
		    synchronized (aClass592_7873.aClass200_7828) {
			aClass592_7873.aClass200_7828.method3788(class179, l);
		    }
		}
	    }
	}
	if (null == class179)
	    return null;
	Class179 class179_225_ = class179.method2926((byte) 0, i, true);
	if (i_214_ != class179.method3065())
	    class179_225_.method2966(i_214_);
	if (i_215_ != class179.method3026())
	    class179_225_.method2952(i_215_);
	if (bool)
	    class179_225_.method3074();
	if (i_212_ == -1214990409 * Class608.aClass608_7976.anInt7995
	    && i_213_ > 3) {
	    class179_225_.method2931(2048);
	    class179_225_.method2934(180, 0, -180);
	}
	i_213_ &= 0x3;
	if (i_213_ == 1)
	    class179_225_.method2931(4096);
	else if (2 == i_213_)
	    class179_225_.method2931(8192);
	else if (i_213_ == 3)
	    class179_225_.method2931(12288);
	if (aShortArray7874 != null) {
	    short[] is;
	    if (null != class604 && class604.aShortArray7955 != null)
		is = class604.aShortArray7955;
	    else
		is = aShortArray7933;
	    for (int i_226_ = 0; i_226_ < aShortArray7874.length; i_226_++) {
		if (aByteArray7876 != null && i_226_ < aByteArray7876.length)
		    class179_225_.method2971(aShortArray7874[i_226_],
					     (aShortArray7867
					      [(aByteArray7876[i_226_]
						& 0xff)]));
		else
		    class179_225_.method2971(aShortArray7874[i_226_],
					     is[i_226_]);
	    }
	}
	if (null != aShortArray7877) {
	    short[] is;
	    if (class604 != null && class604.aShortArray7957 != null)
		is = class604.aShortArray7957;
	    else
		is = aShortArray7878;
	    for (int i_227_ = 0; i_227_ < aShortArray7877.length; i_227_++)
		class179_225_.method2973(aShortArray7877[i_227_], is[i_227_]);
	}
	if (0 != aByte7884)
	    class179_225_.method2974(aByte7881, aByte7932, aByte7883,
				     aByte7884 & 0xff);
	if (-751777211 * anInt7910 != 128 || 128 != 1355752901 * anInt7911
	    || anInt7931 * 669346399 != 128)
	    class179_225_.method2936(-751777211 * anInt7910,
				     1355752901 * anInt7911,
				     669346399 * anInt7931);
	if (0 != anInt7913 * 107322009 || 1714070995 * anInt7914 != 0
	    || -653269247 * anInt7915 != 0)
	    class179_225_.method2934(anInt7913 * 107322009,
				     anInt7914 * 1714070995,
				     -653269247 * anInt7915);
	class179_225_.method3010(i_216_);
	return class179_225_;
    }
    
    Class179 method9940(Class182 class182, int i, int i_228_, int i_229_,
			Class604 class604) {
	int i_230_ = anInt7899 * -1822650503 + 64;
	int i_231_ = 1610422171 * anInt7900 + 850;
	int i_232_ = i;
	boolean bool
	    = (aBool7891
	       || (-1214990409 * Class608.aClass608_7978.anInt7995 == i_228_
		   && i_229_ > 3));
	if (bool)
	    i |= 0x10;
	if (i_229_ == 0) {
	    if (128 != anInt7910 * -751777211 || 0 != 107322009 * anInt7913)
		i |= 0x1;
	    if (128 != anInt7931 * 669346399 || 0 != anInt7915 * -653269247)
		i |= 0x4;
	} else
	    i |= 0xd;
	if (128 != 1355752901 * anInt7911 || 0 != anInt7914 * 1714070995)
	    i |= 0x2;
	if (aShortArray7874 != null)
	    i |= 0x4000;
	if (aShortArray7877 != null)
	    i |= 0x8000;
	if (aByte7884 != 0)
	    i |= 0x80000;
	Class179 class179 = null;
	if (aByteArray7871 != null) {
	    int i_233_ = -1;
	    for (int i_234_ = 0; i_234_ < aByteArray7871.length; i_234_++) {
		if (aByteArray7871[i_234_] == i_228_) {
		    i_233_ = i_234_;
		    break;
		}
	    }
	    if (i_233_ == -1)
		return null;
	    int[] is
		= (null != class604 && null != class604.anIntArray7956
		   ? class604.anIntArray7956 : anIntArrayArray7872[i_233_]);
	    int i_235_ = is.length;
	    if (i_235_ > 0) {
		long l = (long) (-2117565327 * class182.anInt1942);
		for (int i_236_ = 0; i_236_ < i_235_; i_236_++)
		    l = 67783L * l + (long) is[i_236_];
		synchronized (aClass592_7873.aClass200_7828) {
		    class179 = ((Class179)
				aClass592_7873.aClass200_7828.method3785(l));
		}
		if (null != class179) {
		    if (i_230_ != class179.method3065())
			i |= 0x1000;
		    if (i_231_ != class179.method3026())
			i |= 0x2000;
		}
		if (class179 == null
		    || class182.method3321(class179.method2928(), i) != 0) {
		    int i_237_ = i | 0x1f01f;
		    if (class179 != null)
			i_237_ = class182.method3229(i_237_,
						     class179.method2928());
		    Class186 class186 = null;
		    synchronized (aClass592_7873.aClass186Array7827) {
			for (int i_238_ = 0; i_238_ < i_235_; i_238_++) {
			    byte[] is_239_
				= aClass592_7873.method9802(is[i_238_],
							    (byte) 22);
			    if (null == is_239_) {
				Class179 class179_240_ = null;
				return class179_240_;
			    }
			    class186 = new Class186(is_239_);
			    if (class186.anInt2086 < 13)
				class186.method3651(2);
			    if (i_235_ > 1)
				aClass592_7873.aClass186Array7827[i_238_]
				    = class186;
			}
			if (i_235_ > 1)
			    class186 = new Class186((aClass592_7873
						     .aClass186Array7827),
						    i_235_);
		    }
		    class179 = class182.method3556(class186, i_237_,
						   1500613919 * (aClass592_7873
								 .anInt7821),
						   i_230_, i_231_);
		    synchronized (aClass592_7873.aClass200_7828) {
			aClass592_7873.aClass200_7828.method3788(class179, l);
		    }
		}
	    }
	}
	if (null == class179)
	    return null;
	Class179 class179_241_ = class179.method2926((byte) 0, i, true);
	if (i_230_ != class179.method3065())
	    class179_241_.method2966(i_230_);
	if (i_231_ != class179.method3026())
	    class179_241_.method2952(i_231_);
	if (bool)
	    class179_241_.method3074();
	if (i_228_ == -1214990409 * Class608.aClass608_7976.anInt7995
	    && i_229_ > 3) {
	    class179_241_.method2931(2048);
	    class179_241_.method2934(180, 0, -180);
	}
	i_229_ &= 0x3;
	if (i_229_ == 1)
	    class179_241_.method2931(4096);
	else if (2 == i_229_)
	    class179_241_.method2931(8192);
	else if (i_229_ == 3)
	    class179_241_.method2931(12288);
	if (aShortArray7874 != null) {
	    short[] is;
	    if (null != class604 && class604.aShortArray7955 != null)
		is = class604.aShortArray7955;
	    else
		is = aShortArray7933;
	    for (int i_242_ = 0; i_242_ < aShortArray7874.length; i_242_++) {
		if (aByteArray7876 != null && i_242_ < aByteArray7876.length)
		    class179_241_.method2971(aShortArray7874[i_242_],
					     (aShortArray7867
					      [(aByteArray7876[i_242_]
						& 0xff)]));
		else
		    class179_241_.method2971(aShortArray7874[i_242_],
					     is[i_242_]);
	    }
	}
	if (null != aShortArray7877) {
	    short[] is;
	    if (class604 != null && class604.aShortArray7957 != null)
		is = class604.aShortArray7957;
	    else
		is = aShortArray7878;
	    for (int i_243_ = 0; i_243_ < aShortArray7877.length; i_243_++)
		class179_241_.method2973(aShortArray7877[i_243_], is[i_243_]);
	}
	if (0 != aByte7884)
	    class179_241_.method2974(aByte7881, aByte7932, aByte7883,
				     aByte7884 & 0xff);
	if (-751777211 * anInt7910 != 128 || 128 != 1355752901 * anInt7911
	    || anInt7931 * 669346399 != 128)
	    class179_241_.method2936(-751777211 * anInt7910,
				     1355752901 * anInt7911,
				     669346399 * anInt7931);
	if (0 != anInt7913 * 107322009 || 1714070995 * anInt7914 != 0
	    || -653269247 * anInt7915 != 0)
	    class179_241_.method2934(anInt7913 * 107322009,
				     anInt7914 * 1714070995,
				     -653269247 * anInt7915);
	class179_241_.method3010(i_232_);
	return class179_241_;
    }
    
    Class179 method9941(Class182 class182, int i, int i_244_, int i_245_,
			Class604 class604) {
	int i_246_ = anInt7899 * -1822650503 + 64;
	int i_247_ = 1610422171 * anInt7900 + 850;
	int i_248_ = i;
	boolean bool
	    = (aBool7891
	       || (-1214990409 * Class608.aClass608_7978.anInt7995 == i_244_
		   && i_245_ > 3));
	if (bool)
	    i |= 0x10;
	if (i_245_ == 0) {
	    if (128 != anInt7910 * -751777211 || 0 != 107322009 * anInt7913)
		i |= 0x1;
	    if (128 != anInt7931 * 669346399 || 0 != anInt7915 * -653269247)
		i |= 0x4;
	} else
	    i |= 0xd;
	if (128 != 1355752901 * anInt7911 || 0 != anInt7914 * 1714070995)
	    i |= 0x2;
	if (aShortArray7874 != null)
	    i |= 0x4000;
	if (aShortArray7877 != null)
	    i |= 0x8000;
	if (aByte7884 != 0)
	    i |= 0x80000;
	Class179 class179 = null;
	if (aByteArray7871 != null) {
	    int i_249_ = -1;
	    for (int i_250_ = 0; i_250_ < aByteArray7871.length; i_250_++) {
		if (aByteArray7871[i_250_] == i_244_) {
		    i_249_ = i_250_;
		    break;
		}
	    }
	    if (i_249_ == -1)
		return null;
	    int[] is
		= (null != class604 && null != class604.anIntArray7956
		   ? class604.anIntArray7956 : anIntArrayArray7872[i_249_]);
	    int i_251_ = is.length;
	    if (i_251_ > 0) {
		long l = (long) (-2117565327 * class182.anInt1942);
		for (int i_252_ = 0; i_252_ < i_251_; i_252_++)
		    l = 67783L * l + (long) is[i_252_];
		synchronized (aClass592_7873.aClass200_7828) {
		    class179 = ((Class179)
				aClass592_7873.aClass200_7828.method3785(l));
		}
		if (null != class179) {
		    if (i_246_ != class179.method3065())
			i |= 0x1000;
		    if (i_247_ != class179.method3026())
			i |= 0x2000;
		}
		if (class179 == null
		    || class182.method3321(class179.method2928(), i) != 0) {
		    int i_253_ = i | 0x1f01f;
		    if (class179 != null)
			i_253_ = class182.method3229(i_253_,
						     class179.method2928());
		    Class186 class186 = null;
		    synchronized (aClass592_7873.aClass186Array7827) {
			for (int i_254_ = 0; i_254_ < i_251_; i_254_++) {
			    byte[] is_255_
				= aClass592_7873.method9802(is[i_254_],
							    (byte) 11);
			    if (null == is_255_) {
				Class179 class179_256_ = null;
				return class179_256_;
			    }
			    class186 = new Class186(is_255_);
			    if (class186.anInt2086 < 13)
				class186.method3651(2);
			    if (i_251_ > 1)
				aClass592_7873.aClass186Array7827[i_254_]
				    = class186;
			}
			if (i_251_ > 1)
			    class186 = new Class186((aClass592_7873
						     .aClass186Array7827),
						    i_251_);
		    }
		    class179 = class182.method3556(class186, i_253_,
						   1500613919 * (aClass592_7873
								 .anInt7821),
						   i_246_, i_247_);
		    synchronized (aClass592_7873.aClass200_7828) {
			aClass592_7873.aClass200_7828.method3788(class179, l);
		    }
		}
	    }
	}
	if (null == class179)
	    return null;
	Class179 class179_257_ = class179.method2926((byte) 0, i, true);
	if (i_246_ != class179.method3065())
	    class179_257_.method2966(i_246_);
	if (i_247_ != class179.method3026())
	    class179_257_.method2952(i_247_);
	if (bool)
	    class179_257_.method3074();
	if (i_244_ == -1214990409 * Class608.aClass608_7976.anInt7995
	    && i_245_ > 3) {
	    class179_257_.method2931(2048);
	    class179_257_.method2934(180, 0, -180);
	}
	i_245_ &= 0x3;
	if (i_245_ == 1)
	    class179_257_.method2931(4096);
	else if (2 == i_245_)
	    class179_257_.method2931(8192);
	else if (i_245_ == 3)
	    class179_257_.method2931(12288);
	if (aShortArray7874 != null) {
	    short[] is;
	    if (null != class604 && class604.aShortArray7955 != null)
		is = class604.aShortArray7955;
	    else
		is = aShortArray7933;
	    for (int i_258_ = 0; i_258_ < aShortArray7874.length; i_258_++) {
		if (aByteArray7876 != null && i_258_ < aByteArray7876.length)
		    class179_257_.method2971(aShortArray7874[i_258_],
					     (aShortArray7867
					      [(aByteArray7876[i_258_]
						& 0xff)]));
		else
		    class179_257_.method2971(aShortArray7874[i_258_],
					     is[i_258_]);
	    }
	}
	if (null != aShortArray7877) {
	    short[] is;
	    if (class604 != null && class604.aShortArray7957 != null)
		is = class604.aShortArray7957;
	    else
		is = aShortArray7878;
	    for (int i_259_ = 0; i_259_ < aShortArray7877.length; i_259_++)
		class179_257_.method2973(aShortArray7877[i_259_], is[i_259_]);
	}
	if (0 != aByte7884)
	    class179_257_.method2974(aByte7881, aByte7932, aByte7883,
				     aByte7884 & 0xff);
	if (-751777211 * anInt7910 != 128 || 128 != 1355752901 * anInt7911
	    || anInt7931 * 669346399 != 128)
	    class179_257_.method2936(-751777211 * anInt7910,
				     1355752901 * anInt7911,
				     669346399 * anInt7931);
	if (0 != anInt7913 * 107322009 || 1714070995 * anInt7914 != 0
	    || -653269247 * anInt7915 != 0)
	    class179_257_.method2934(anInt7913 * 107322009,
				     anInt7914 * 1714070995,
				     -653269247 * anInt7915);
	class179_257_.method3010(i_248_);
	return class179_257_;
    }
    
    public int method9942(int i, int i_260_) {
	if (aClass10_7902 == null)
	    return i_260_;
	Class525_Sub42 class525_sub42
	    = (Class525_Sub42) aClass10_7902.method684((long) i);
	if (class525_sub42 == null)
	    return i_260_;
	return class525_sub42.anInt10858 * -1344652871;
    }
    
    public String method9943(int i, String string) {
	if (aClass10_7902 == null)
	    return string;
	Class525_Sub19 class525_sub19
	    = (Class525_Sub19) aClass10_7902.method684((long) i);
	if (null == class525_sub19)
	    return string;
	return (String) class525_sub19.anObject10571;
    }
    
    public String method9944(int i, String string) {
	if (aClass10_7902 == null)
	    return string;
	Class525_Sub19 class525_sub19
	    = (Class525_Sub19) aClass10_7902.method684((long) i);
	if (null == class525_sub19)
	    return string;
	return (String) class525_sub19.anObject10571;
    }
    
    public String method9945(int i, String string) {
	if (aClass10_7902 == null)
	    return string;
	Class525_Sub19 class525_sub19
	    = (Class525_Sub19) aClass10_7902.method684((long) i);
	if (null == class525_sub19)
	    return string;
	return (String) class525_sub19.anObject10571;
    }
    
    public boolean method9946() {
	return anIntArray7904 != null;
    }
    
    public boolean method9947() {
	return anIntArray7904 != null;
    }
    
    Class602(int i, Class592 class592, Interface13 interface13) {
	aByte7884 = (byte) 0;
	anInt7885 = -916328711;
	anInt7886 = -484582415;
	anInt7887 = -1863796162;
	anInt7888 = -1751476543;
	aByte7943 = (byte) 0;
	anInt7890 = -72436405;
	aBool7889 = false;
	anInt7892 = 769582769;
	anInt7893 = -1504706240;
	anInt7879 = 0;
	anIntArray7904 = null;
	anIntArray7896 = null;
	aBool7897 = false;
	anInt7898 = -1712633152;
	anInt7899 = 0;
	anInt7900 = 0;
	anInt7918 = -1890485685;
	anInt7895 = 491601217;
	aBool7905 = false;
	anInt7906 = 0;
	aBool7945 = false;
	aBool7891 = false;
	aBool7875 = true;
	anInt7910 = -1713617280;
	anInt7911 = 1384679040;
	anInt7931 = -390541440;
	anInt7913 = 0;
	anInt7914 = 0;
	anInt7915 = 0;
	anInt7916 = 0;
	anInt7917 = 0;
	anInt7882 = 0;
	aBool7919 = false;
	aBool7903 = false;
	anInt7921 = 351855733;
	anInt7922 = 0;
	anInt7924 = -352159907;
	anInt7941 = -291436913;
	anInt7866 = -553243461;
	anInt7927 = 0;
	anInt7935 = 0;
	anInt7929 = 823178295;
	anInt7930 = 0;
	anInt7908 = 0;
	aBool7909 = true;
	aBool7934 = false;
	aBool7926 = true;
	aBool7936 = false;
	aBool7938 = false;
	anInt7940 = -2105670400;
	anInt7907 = 1203048192;
	aBool7942 = false;
	aBool7937 = false;
	aClass605_7944 = Class605.aClass605_7960;
	anInt7894 = i * -1299843353;
	aClass592_7873 = class592;
	anInterface13_7870 = interface13;
	aStringArray7901 = (String[]) aClass592_7873.aStringArray7826.clone();
    }
    
    public final boolean method9948(Class641 class641) {
	if (null == anIntArrayArray7872)
	    return true;
	boolean bool = true;
	for (int i = 0; i < anIntArrayArray7872.length; i++) {
	    for (int i_261_ = 0; i_261_ < anIntArrayArray7872[i].length;
		 i_261_++) {
		boolean bool_262_
		    = aClass592_7873.method9803(anIntArrayArray7872[i][i_261_],
						-807224623);
		bool &= bool_262_;
		if (!bool_262_)
		    class641.anInt8322
			= anIntArrayArray7872[i][i_261_] * -1459355133;
	    }
	}
	return bool;
    }
    
    public int method9949() {
	if (anIntArray7904 != null) {
	    if (anIntArray7904.length > 1) {
		int i = (int) (Math.random() * 65535.0);
		for (int i_263_ = 0; i_263_ < anIntArray7904.length;
		     i_263_++) {
		    if (i <= anIntArray7896[i_263_])
			return anIntArray7904[i_263_];
		    i -= anIntArray7896[i_263_];
		}
	    } else
		return anIntArray7904[0];
	}
	return -1;
    }
    
    public int method9950() {
	if (anIntArray7904 != null) {
	    if (anIntArray7904.length > 1) {
		int i = (int) (Math.random() * 65535.0);
		for (int i_264_ = 0; i_264_ < anIntArray7904.length;
		     i_264_++) {
		    if (i <= anIntArray7896[i_264_])
			return anIntArray7904[i_264_];
		    i -= anIntArray7896[i_264_];
		}
	    } else
		return anIntArray7904[0];
	}
	return -1;
    }
    
    public int method9951() {
	if (anIntArray7904 != null) {
	    if (anIntArray7904.length > 1) {
		int i = (int) (Math.random() * 65535.0);
		for (int i_265_ = 0; i_265_ < anIntArray7904.length;
		     i_265_++) {
		    if (i <= anIntArray7896[i_265_])
			return anIntArray7904[i_265_];
		    i -= anIntArray7896[i_265_];
		}
	    } else
		return anIntArray7904[0];
	}
	return -1;
    }
    
    public int[] method9952() {
	return anIntArray7904;
    }
    
    public boolean method9953(int i) {
	if (null == anIntArray7923)
	    return -1 != 322750349 * anInt7866 || null != anIntArray7868;
	for (int i_266_ = 0; i_266_ < anIntArray7923.length; i_266_++) {
	    if (anIntArray7923[i_266_] != -1) {
		Class602 class602_267_
		    = ((Class602)
		       anInterface13_7870.method76(anIntArray7923[i_266_],
						   -1777831543));
		if (-1 != class602_267_.anInt7866 * 322750349
		    || class602_267_.anIntArray7868 != null)
		    return true;
	    }
	}
	return false;
    }
    
    public int[] method9954() {
	return anIntArray7904;
    }
    
    public final boolean method9955(Class641 class641) {
	if (null == anIntArrayArray7872)
	    return true;
	boolean bool = true;
	for (int i = 0; i < anIntArrayArray7872.length; i++) {
	    for (int i_268_ = 0; i_268_ < anIntArrayArray7872[i].length;
		 i_268_++) {
		boolean bool_269_
		    = aClass592_7873.method9803(anIntArrayArray7872[i][i_268_],
						-807224623);
		bool &= bool_269_;
		if (!bool_269_)
		    class641.anInt8322
			= anIntArrayArray7872[i][i_268_] * -1459355133;
	    }
	}
	return bool;
    }
    
    public boolean method9956(int i) {
	return anIntArray7904 != null;
    }
    
    public boolean method9957(int i) {
	if (anIntArray7904 != null && i != -1) {
	    for (int i_270_ = 0; i_270_ < anIntArray7904.length; i_270_++) {
		if (i == anIntArray7904[i_270_])
		    return true;
	    }
	}
	return false;
    }
    
    public int method9958(int i) {
	if (anIntArray7925 == null)
	    return -1;
	return anIntArray7925[i];
    }
    
    public static int method9959(int i) {
	return 1206403205 * Class616.anInt8047;
    }
    
    static final void method9960(Class683 class683, byte i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class283.anInt3011 * 1186734341 & 0x1;
    }
    
    static final void method9961(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = 0;
    }
    
    public static String method9962(long l, int i, boolean bool, int i_271_) {
	Calendar calendar;
	if (bool) {
	    Class61.method1371(l);
	    calendar = Class86.aCalendar888;
	} else {
	    Class677.method11134(l);
	    calendar = Class86.aCalendar890;
	}
	int i_272_ = calendar.get(5);
	int i_273_ = calendar.get(2);
	int i_274_ = calendar.get(1);
	int i_275_ = calendar.get(11);
	int i_276_ = calendar.get(12);
	if (i == 3)
	    return Class85.method1622(l, i, bool, (byte) 58);
	return new StringBuilder().append(Integer.toString(i_272_ / 10)).append
		   (i_272_ % 10).append
		   ("-").append
		   (Class86.aStringArrayArray889[i][i_273_]).append
		   ("-").append
		   (i_274_).append
		   (" ").append
		   (i_275_ / 10).append
		   (i_275_ % 10).append
		   (":").append
		   (i_276_ / 10).append
		   (i_276_ % 10).toString();
    }
    
    static void method9963(short i) {
	Class70.aString779 = "";
	Class70.aString789 = "";
	Class70.aString777 = "";
	Class70.aBool780 = true;
    }
}
