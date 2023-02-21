/* Class287 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class287 implements Interface12
{
    public int anInt3147;
    Interface13 anInterface13_3148;
    public int anInt3149;
    public int anInt3150 = 1674071075;
    public int anInt3151 = 124406177;
    public String aString3152;
    public int anInt3153;
    public int anInt3154 = -2113470577;
    Class267 aClass267_3155;
    public static final int anInt3156 = 0;
    public boolean aBool3157;
    int anInt3158;
    public int anInt3159;
    public int anInt3160;
    public Class272 aClass272_3161;
    public int anInt3162;
    public String[] aStringArray3163;
    public int anInt3164;
    public int[] anIntArray3165;
    int anInt3166;
    int anInt3167;
    int anInt3168;
    int anInt3169;
    int anInt3170;
    int anInt3171;
    int anInt3172;
    public int anInt3173;
    public int[] anIntArray3174;
    public int[] anIntArray3175;
    public int anInt3176;
    public static final int anInt3177 = 2;
    public int anInt3178;
    public int anInt3179;
    public boolean aBool3180;
    public int anInt3181;
    public int anInt3182;
    public int anInt3183;
    public static final int anInt3184 = 1;
    public int anInt3185;
    public Class275 aClass275_3186;
    int anInt3187;
    public boolean aBool3188;
    public byte[] aByteArray3189;
    public int anInt3190;
    public String aString3191;
    public int anInt3192;
    Class10 aClass10_3193;
    public int anInt3194;
    
    public final Class287 method5232(Interface20 interface20,
				     Interface18 interface18, int i) {
	int i_0_ = -1;
	if (301610423 * anInt3187 != -1) {
	    Class322 class322
		= interface20.method124(301610423 * anInt3187, 756311469);
	    if (null != class322)
		i_0_ = interface18.method93(class322, (byte) 2);
	} else if (573014389 * anInt3169 != -1) {
	    Class163 class163
		= interface20.method119(Class453.aClass453_4939,
					573014389 * anInt3169, -1889553434);
	    if (null != class163)
		i_0_ = interface18.method104(class163, 623775022);
	}
	if (i_0_ < 0 || i_0_ >= anIntArray3174.length - 1) {
	    int i_1_ = anIntArray3174[anIntArray3174.length - 1];
	    if (-1 != i_1_)
		return ((Class287)
			anInterface13_3148.method76(i_1_, -927209984));
	    return null;
	}
	if (-1 == anIntArray3174[i_0_])
	    return null;
	return ((Class287)
		anInterface13_3148.method76(anIntArray3174[i_0_], 780674913));
    }
    
    public void method66(RSBuffer class525_sub38, int i) {
	for (;;) {
	    int i_2_ = class525_sub38.readUnsignedByte(464762626);
	    if (i_2_ == 0)
		break;
	    method5233(class525_sub38, i_2_, (byte) 96);
	}
    }
    
    void method5233(RSBuffer class525_sub38, int i, byte i_3_) {
	if (1 == i)
	    anInt3150 = class525_sub38.readBigSmart(-2043778683) * -1674071075;
	else if (i == 2)
	    anInt3151 = class525_sub38.readBigSmart(-2043778683) * -124406177;
	else if (3 == i)
	    aString3152 = class525_sub38.readString((byte) -95);
	else if (4 == i)
	    anInt3153 = class525_sub38.method16834(-1994884458) * -1656410449;
	else if (5 == i)
	    anInt3154 = class525_sub38.method16834(-1994884458) * 2113470577;
	else if (6 == i)
	    anInt3149 = class525_sub38.readUnsignedByte(1500232914) * 2000815565;
	else if (7 == i) {
	    int i_4_ = class525_sub38.readUnsignedByte(1838207891);
	    if ((i_4_ & 0x1) == 0)
		aBool3188 = false;
	    if ((i_4_ & 0x2) == 2)
		aBool3157 = true;
	} else if (i == 8)
	    class525_sub38.readUnsignedByte(852571067);
	else if (i == 9) {
	    anInt3187 = class525_sub38.readUnsignedShort((byte) 116) * 148617223;
	    if (anInt3187 * 301610423 == 65535)
		anInt3187 = -148617223;
	    anInt3169 = class525_sub38.readUnsignedShort((byte) 21) * -1487239459;
	    if (573014389 * anInt3169 == 65535)
		anInt3169 = 1487239459;
	    anInt3166 = class525_sub38.readInt(1341794070) * -935920143;
	    anInt3167 = class525_sub38.readInt(1321189304) * -1826212729;
	} else if (i >= 10 && i <= 14)
	    aStringArray3163[i - 10] = class525_sub38.readString((byte) -18);
	else if (i == 15) {
	    int i_5_ = class525_sub38.readUnsignedByte(2014434178);
	    anIntArray3175 = new int[i_5_ * 2];
	    for (int i_6_ = 0; i_6_ < 2 * i_5_; i_6_++)
		anIntArray3175[i_6_] = class525_sub38.method16625((byte) -13);
	    anInt3183 = class525_sub38.readInt(1433721890) * 2073978747;
	    int i_7_ = class525_sub38.readUnsignedByte(1410554747);
	    anIntArray3165 = new int[i_7_];
	    for (int i_8_ = 0; i_8_ < anIntArray3165.length; i_8_++)
		anIntArray3165[i_8_] = class525_sub38.readInt(1724690857);
	    aByteArray3189 = new byte[i_5_];
	    for (int i_9_ = 0; i_9_ < i_5_; i_9_++)
		aByteArray3189[i_9_] = class525_sub38.readByte(-1150098071);
	} else if (i == 16)
	    aBool3180 = false;
	else if (17 == i)
	    aString3191 = class525_sub38.readString((byte) -2);
	else if (i == 18)
	    anInt3168 = class525_sub38.readBigSmart(-2043778683) * -895304057;
	else if (19 == i)
	    anInt3192 = class525_sub38.readUnsignedShort((byte) 49) * 1678614789;
	else if (20 == i) {
	    anInt3172 = class525_sub38.readUnsignedShort((byte) 77) * -1650424187;
	    if (1497924173 * anInt3172 == 65535)
		anInt3172 = 1650424187;
	    anInt3158 = class525_sub38.readUnsignedShort((byte) 5) * -1114469753;
	    if (1507334967 * anInt3158 == 65535)
		anInt3158 = 1114469753;
	    anInt3170 = class525_sub38.readInt(1152342411) * 1412826327;
	    anInt3171 = class525_sub38.readInt(1360442452) * 389202637;
	} else if (21 == i)
	    anInt3160 = class525_sub38.readInt(1095580806) * -393819593;
	else if (22 == i)
	    anInt3159 = class525_sub38.readInt(1487605081) * 754822751;
	else if (i == 23) {
	    anInt3181 = class525_sub38.readUnsignedByte(877531915) * -268812295;
	    anInt3182 = class525_sub38.readUnsignedByte(2017617045) * 1324095133;
	    anInt3162 = class525_sub38.readUnsignedByte(1674688420) * 432110571;
	} else if (i == 24) {
	    anInt3173 = class525_sub38.method16625((byte) -37) * -148707283;
	    anInt3185 = class525_sub38.method16625((byte) 3) * 1864420539;
	} else if (i == 25)
	    anInt3147 = class525_sub38.readBigSmart(-2043778683) * -1088873851;
	else if (i == 26 || i == 27) {
	    anInt3187 = class525_sub38.readUnsignedShort((byte) 67) * 148617223;
	    if (65535 == 301610423 * anInt3187)
		anInt3187 = -148617223;
	    anInt3169 = class525_sub38.readUnsignedShort((byte) 119) * -1487239459;
	    if (anInt3169 * 573014389 == 65535)
		anInt3169 = 1487239459;
	    int i_10_ = -1;
	    if (i == 27) {
		i_10_ = class525_sub38.readUnsignedShort((byte) 125);
		if (i_10_ == 65535)
		    i_10_ = -1;
	    }
	    int i_11_ = class525_sub38.readUnsignedByte(1576422208);
	    anIntArray3174 = new int[2 + i_11_];
	    for (int i_12_ = 0; i_12_ <= i_11_; i_12_++) {
		anIntArray3174[i_12_] = class525_sub38.readUnsignedShort((byte) 124);
		if (anIntArray3174[i_12_] == 65535)
		    anIntArray3174[i_12_] = -1;
	    }
	    anIntArray3174[1 + i_11_] = i_10_;
	} else if (i == 28)
	    anInt3190 = class525_sub38.readUnsignedByte(1644186470) * 358167051;
	else if (29 == i)
	    aClass275_3186
		= ((Class275)
		   Class539.method8888(Class230.method4385((byte) -113),
				       class525_sub38.readUnsignedByte(393124450),
				       1644233091));
	else if (i == 30)
	    aClass272_3161
		= ((Class272)
		   Class539.method8888(Class694.method14156(-1564583759),
				       class525_sub38.readUnsignedByte(293439890),
				       -876223667));
	else if (249 == i) {
	    int i_13_ = class525_sub38.readUnsignedByte(611936055);
	    if (null == aClass10_3193) {
		int i_14_ = Class212.method3935(i_13_, -2056250364);
		aClass10_3193 = new Class10(i_14_);
	    }
	    for (int i_15_ = 0; i_15_ < i_13_; i_15_++) {
		boolean bool = class525_sub38.readUnsignedByte(1379854647) == 1;
		int i_16_ = class525_sub38.method16834(-1994884458);
		Class525 class525;
		if (bool)
		    class525
			= new Class525_Sub19(class525_sub38
						 .readString((byte) -38));
		else
		    class525
			= new Class525_Sub42(class525_sub38
						 .readInt(1017470391));
		aClass10_3193.method695(class525, (long) i_16_);
	    }
	}
    }
    
    public void method67(int i) {
	if (anIntArray3175 != null) {
	    for (int i_17_ = 0; i_17_ < anIntArray3175.length; i_17_ += 2) {
		if (anIntArray3175[i_17_] < -218323365 * anInt3176)
		    anInt3176 = 130816467 * anIntArray3175[i_17_];
		else if (anIntArray3175[i_17_] > 1597685531 * anInt3178)
		    anInt3178 = -1793359085 * anIntArray3175[i_17_];
		if (anIntArray3175[i_17_ + 1] < anInt3164 * -420580167)
		    anInt3164 = 1922912649 * anIntArray3175[1 + i_17_];
		else if (anIntArray3175[1 + i_17_] > 443050347 * anInt3179)
		    anInt3179 = anIntArray3175[i_17_ + 1] * -1483572413;
	    }
	}
    }
    
    public boolean method5234(Interface20 interface20, Interface18 interface18,
			      byte i) {
	int i_18_ = -1;
	if (-1 != anInt3169 * 573014389) {
	    Class163 class163
		= interface20.method119(Class453.aClass453_4939,
					anInt3169 * 573014389, -1254062520);
	    i_18_ = interface18.method104(class163, 623775022);
	} else if (-1 != 301610423 * anInt3187) {
	    Class322 class322
		= interface20.method124(301610423 * anInt3187, -255744024);
	    i_18_ = interface18.method93(class322, (byte) 2);
	} else
	    return true;
	if (null == anIntArray3174) {
	    if (i_18_ < 742675217 * anInt3166
		|| i_18_ > 1232359735 * anInt3167)
		return false;
	} else {
	    if (i_18_ < 0 || i_18_ >= anIntArray3174.length - 1) {
		int i_19_ = anIntArray3174[anIntArray3174.length - 1];
		if (i_19_ != -1) {
		    if (-1 != anInt3166 * 742675217
			&& -1 != 1232359735 * anInt3167
			&& (i_18_ < 742675217 * anInt3166
			    || i_18_ > anInt3167 * 1232359735))
			return false;
		} else
		    return false;
	    }
	    if (-1 == anIntArray3174[i_18_])
		return false;
	}
	boolean bool = false;
	int i_20_;
	if (1507334967 * anInt3158 != -1) {
	    Class163 class163
		= interface20.method119(Class453.aClass453_4939,
					anInt3158 * 1507334967, -1495877742);
	    i_20_ = interface18.method104(class163, 623775022);
	} else if (-1 != anInt3172 * 1497924173) {
	    Class322 class322
		= interface20.method124(1497924173 * anInt3172, 931466389);
	    i_20_ = interface18.method93(class322, (byte) 2);
	} else
	    return true;
	if (i_20_ < -2058015001 * anInt3170 || i_20_ > 1021245957 * anInt3171)
	    return false;
	return true;
    }
    
    public Class157 method5235(Class182 class182, boolean bool, int i) {
	int i_21_ = bool ? anInt3151 * 425207199 : 1564425333 * anInt3150;
	int i_22_ = i_21_ | class182.anInt1942 * -2117565327 << 29;
	Class157 class157
	    = ((Class157)
	       aClass267_3155.aClass200_2815.method3785((long) i_22_));
	if (class157 != null)
	    return class157;
	if (!aClass267_3155.aClass458_2816.method7506(i_21_, -2128193686))
	    return null;
	Class173 class173
	    = Class187.method3667(aClass267_3155.aClass458_2816, i_21_, 0);
	if (class173 != null) {
	    class157 = class182.method3216(class173, true);
	    aClass267_3155.aClass200_2815.method3788(class157, (long) i_22_);
	}
	return class157;
    }
    
    public Class157 method5236(Class182 class182, int i) {
	int i_23_
	    = 980209229 * anInt3147 | -2117565327 * class182.anInt1942 << 29;
	Class157 class157
	    = ((Class157)
	       aClass267_3155.aClass200_2815.method3785((long) i_23_));
	if (null != class157)
	    return class157;
	if (!aClass267_3155.aClass458_2816.method7506(anInt3147 * 980209229,
						      1956224317))
	    return null;
	Class173 class173 = Class187.method3667(aClass267_3155.aClass458_2816,
						anInt3147 * 980209229, 0);
	if (class173 != null) {
	    class157 = class182.method3216(class173, true);
	    aClass267_3155.aClass200_2815.method3788(class157, (long) i_23_);
	}
	return class157;
    }
    
    public Class157 method5237(Class182 class182) {
	Class157 class157
	    = (Class157) (aClass267_3155.aClass200_2815.method3785
			  ((long) (369731383 * anInt3168 | 0x20000
				   | class182.anInt1942 * -2117565327 << 29)));
	if (class157 != null)
	    return class157;
	aClass267_3155.aClass458_2816.method7506(369731383 * anInt3168,
						 -1050644192);
	Class173 class173 = Class187.method3667(aClass267_3155.aClass458_2816,
						anInt3168 * 369731383, 0);
	if (null != class173) {
	    class157 = class182.method3216(class173, true);
	    aClass267_3155.aClass200_2815.method3788
		(class157, (long) (369731383 * anInt3168 | 0x20000
				   | -2117565327 * class182.anInt1942 << 29));
	}
	return class157;
    }
    
    public int method5238(int i, int i_24_, byte i_25_) {
	if (aClass10_3193 == null)
	    return i_24_;
	Class525_Sub42 class525_sub42
	    = (Class525_Sub42) aClass10_3193.method684((long) i);
	if (class525_sub42 == null)
	    return i_24_;
	return class525_sub42.anInt10858 * -1344652871;
    }
    
    public boolean method5239(Interface20 interface20,
			      Interface18 interface18) {
	int i = -1;
	if (-1 != anInt3169 * 573014389) {
	    Class163 class163
		= interface20.method119(Class453.aClass453_4939,
					anInt3169 * 573014389, -1450691516);
	    i = interface18.method104(class163, 623775022);
	} else if (-1 != 301610423 * anInt3187) {
	    Class322 class322
		= interface20.method124(301610423 * anInt3187, -571602882);
	    i = interface18.method93(class322, (byte) 2);
	} else
	    return true;
	if (null == anIntArray3174) {
	    if (i < 742675217 * anInt3166 || i > 1232359735 * anInt3167)
		return false;
	} else {
	    if (i < 0 || i >= anIntArray3174.length - 1) {
		int i_26_ = anIntArray3174[anIntArray3174.length - 1];
		if (i_26_ != -1) {
		    if (-1 != anInt3166 * 742675217
			&& -1 != 1232359735 * anInt3167
			&& (i < 742675217 * anInt3166
			    || i > anInt3167 * 1232359735))
			return false;
		} else
		    return false;
	    }
	    if (-1 == anIntArray3174[i])
		return false;
	}
	boolean bool = false;
	int i_27_;
	if (1507334967 * anInt3158 != -1) {
	    Class163 class163
		= interface20.method119(Class453.aClass453_4939,
					anInt3158 * 1507334967, -2089283765);
	    i_27_ = interface18.method104(class163, 623775022);
	} else if (-1 != anInt3172 * 1497924173) {
	    Class322 class322
		= interface20.method124(1497924173 * anInt3172, 1802034639);
	    i_27_ = interface18.method93(class322, (byte) 2);
	} else
	    return true;
	if (i_27_ < -2058015001 * anInt3170 || i_27_ > 1021245957 * anInt3171)
	    return false;
	return true;
    }
    
    public void method68(RSBuffer class525_sub38) {
	for (;;) {
	    int i = class525_sub38.readUnsignedByte(2136700203);
	    if (i == 0)
		break;
	    method5233(class525_sub38, i, (byte) 58);
	}
    }
    
    public int method5240(int i, int i_28_) {
	if (aClass10_3193 == null)
	    return i_28_;
	Class525_Sub42 class525_sub42
	    = (Class525_Sub42) aClass10_3193.method684((long) i);
	if (class525_sub42 == null)
	    return i_28_;
	return class525_sub42.anInt10858 * -1344652871;
    }
    
    public void method69() {
	if (anIntArray3175 != null) {
	    for (int i = 0; i < anIntArray3175.length; i += 2) {
		if (anIntArray3175[i] < -218323365 * anInt3176)
		    anInt3176 = 130816467 * anIntArray3175[i];
		else if (anIntArray3175[i] > 1597685531 * anInt3178)
		    anInt3178 = -1793359085 * anIntArray3175[i];
		if (anIntArray3175[i + 1] < anInt3164 * -420580167)
		    anInt3164 = 1922912649 * anIntArray3175[1 + i];
		else if (anIntArray3175[1 + i] > 443050347 * anInt3179)
		    anInt3179 = anIntArray3175[i + 1] * -1483572413;
	    }
	}
    }
    
    public void method70() {
	if (anIntArray3175 != null) {
	    for (int i = 0; i < anIntArray3175.length; i += 2) {
		if (anIntArray3175[i] < -218323365 * anInt3176)
		    anInt3176 = 130816467 * anIntArray3175[i];
		else if (anIntArray3175[i] > 1597685531 * anInt3178)
		    anInt3178 = -1793359085 * anIntArray3175[i];
		if (anIntArray3175[i + 1] < anInt3164 * -420580167)
		    anInt3164 = 1922912649 * anIntArray3175[1 + i];
		else if (anIntArray3175[1 + i] > 443050347 * anInt3179)
		    anInt3179 = anIntArray3175[i + 1] * -1483572413;
	    }
	}
    }
    
    public Class157 method5241(Class182 class182) {
	int i = 980209229 * anInt3147 | -2117565327 * class182.anInt1942 << 29;
	Class157 class157
	    = (Class157) aClass267_3155.aClass200_2815.method3785((long) i);
	if (null != class157)
	    return class157;
	if (!aClass267_3155.aClass458_2816.method7506(anInt3147 * 980209229,
						      -537584514))
	    return null;
	Class173 class173 = Class187.method3667(aClass267_3155.aClass458_2816,
						anInt3147 * 980209229, 0);
	if (class173 != null) {
	    class157 = class182.method3216(class173, true);
	    aClass267_3155.aClass200_2815.method3788(class157, (long) i);
	}
	return class157;
    }
    
    public boolean method5242(Interface20 interface20,
			      Interface18 interface18) {
	int i = -1;
	if (-1 != anInt3169 * 573014389) {
	    Class163 class163
		= interface20.method119(Class453.aClass453_4939,
					anInt3169 * 573014389, -1262389322);
	    i = interface18.method104(class163, 623775022);
	} else if (-1 != 301610423 * anInt3187) {
	    Class322 class322
		= interface20.method124(301610423 * anInt3187, 566469392);
	    i = interface18.method93(class322, (byte) 2);
	} else
	    return true;
	if (null == anIntArray3174) {
	    if (i < 742675217 * anInt3166 || i > 1232359735 * anInt3167)
		return false;
	} else {
	    if (i < 0 || i >= anIntArray3174.length - 1) {
		int i_29_ = anIntArray3174[anIntArray3174.length - 1];
		if (i_29_ != -1) {
		    if (-1 != anInt3166 * 742675217
			&& -1 != 1232359735 * anInt3167
			&& (i < 742675217 * anInt3166
			    || i > anInt3167 * 1232359735))
			return false;
		} else
		    return false;
	    }
	    if (-1 == anIntArray3174[i])
		return false;
	}
	boolean bool = false;
	int i_30_;
	if (1507334967 * anInt3158 != -1) {
	    Class163 class163
		= interface20.method119(Class453.aClass453_4939,
					anInt3158 * 1507334967, -1042768556);
	    i_30_ = interface18.method104(class163, 623775022);
	} else if (-1 != anInt3172 * 1497924173) {
	    Class322 class322
		= interface20.method124(1497924173 * anInt3172, -1017816069);
	    i_30_ = interface18.method93(class322, (byte) 2);
	} else
	    return true;
	if (i_30_ < -2058015001 * anInt3170 || i_30_ > 1021245957 * anInt3171)
	    return false;
	return true;
    }
    
    public Class157 method5243(Class182 class182) {
	int i = 980209229 * anInt3147 | -2117565327 * class182.anInt1942 << 29;
	Class157 class157
	    = (Class157) aClass267_3155.aClass200_2815.method3785((long) i);
	if (null != class157)
	    return class157;
	if (!aClass267_3155.aClass458_2816.method7506(anInt3147 * 980209229,
						      1769785511))
	    return null;
	Class173 class173 = Class187.method3667(aClass267_3155.aClass458_2816,
						anInt3147 * 980209229, 0);
	if (class173 != null) {
	    class157 = class182.method3216(class173, true);
	    aClass267_3155.aClass200_2815.method3788(class157, (long) i);
	}
	return class157;
    }
    
    public boolean method5244(Interface20 interface20,
			      Interface18 interface18) {
	int i = -1;
	if (-1 != anInt3169 * 573014389) {
	    Class163 class163
		= interface20.method119(Class453.aClass453_4939,
					anInt3169 * 573014389, -1129800091);
	    i = interface18.method104(class163, 623775022);
	} else if (-1 != 301610423 * anInt3187) {
	    Class322 class322
		= interface20.method124(301610423 * anInt3187, 2063362379);
	    i = interface18.method93(class322, (byte) 2);
	} else
	    return true;
	if (null == anIntArray3174) {
	    if (i < 742675217 * anInt3166 || i > 1232359735 * anInt3167)
		return false;
	} else {
	    if (i < 0 || i >= anIntArray3174.length - 1) {
		int i_31_ = anIntArray3174[anIntArray3174.length - 1];
		if (i_31_ != -1) {
		    if (-1 != anInt3166 * 742675217
			&& -1 != 1232359735 * anInt3167
			&& (i < 742675217 * anInt3166
			    || i > anInt3167 * 1232359735))
			return false;
		} else
		    return false;
	    }
	    if (-1 == anIntArray3174[i])
		return false;
	}
	boolean bool = false;
	int i_32_;
	if (1507334967 * anInt3158 != -1) {
	    Class163 class163
		= interface20.method119(Class453.aClass453_4939,
					anInt3158 * 1507334967, -945242301);
	    i_32_ = interface18.method104(class163, 623775022);
	} else if (-1 != anInt3172 * 1497924173) {
	    Class322 class322
		= interface20.method124(1497924173 * anInt3172, -981170039);
	    i_32_ = interface18.method93(class322, (byte) 2);
	} else
	    return true;
	if (i_32_ < -2058015001 * anInt3170 || i_32_ > 1021245957 * anInt3171)
	    return false;
	return true;
    }
    
    public Class157 method5245(Class182 class182, boolean bool) {
	int i = bool ? anInt3151 * 425207199 : 1564425333 * anInt3150;
	int i_33_ = i | class182.anInt1942 * -2117565327 << 29;
	Class157 class157
	    = ((Class157)
	       aClass267_3155.aClass200_2815.method3785((long) i_33_));
	if (class157 != null)
	    return class157;
	if (!aClass267_3155.aClass458_2816.method7506(i, -374264152))
	    return null;
	Class173 class173
	    = Class187.method3667(aClass267_3155.aClass458_2816, i, 0);
	if (class173 != null) {
	    class157 = class182.method3216(class173, true);
	    aClass267_3155.aClass200_2815.method3788(class157, (long) i_33_);
	}
	return class157;
    }
    
    public Class157 method5246(Class182 class182, boolean bool) {
	int i = bool ? anInt3151 * 425207199 : 1564425333 * anInt3150;
	int i_34_ = i | class182.anInt1942 * -2117565327 << 29;
	Class157 class157
	    = ((Class157)
	       aClass267_3155.aClass200_2815.method3785((long) i_34_));
	if (class157 != null)
	    return class157;
	if (!aClass267_3155.aClass458_2816.method7506(i, 143309193))
	    return null;
	Class173 class173
	    = Class187.method3667(aClass267_3155.aClass458_2816, i, 0);
	if (class173 != null) {
	    class157 = class182.method3216(class173, true);
	    aClass267_3155.aClass200_2815.method3788(class157, (long) i_34_);
	}
	return class157;
    }
    
    public Class157 method5247(Class182 class182, boolean bool) {
	int i = bool ? anInt3151 * 425207199 : 1564425333 * anInt3150;
	int i_35_ = i | class182.anInt1942 * -2117565327 << 29;
	Class157 class157
	    = ((Class157)
	       aClass267_3155.aClass200_2815.method3785((long) i_35_));
	if (class157 != null)
	    return class157;
	if (!aClass267_3155.aClass458_2816.method7506(i, -672755708))
	    return null;
	Class173 class173
	    = Class187.method3667(aClass267_3155.aClass458_2816, i, 0);
	if (class173 != null) {
	    class157 = class182.method3216(class173, true);
	    aClass267_3155.aClass200_2815.method3788(class157, (long) i_35_);
	}
	return class157;
    }
    
    public final Class287 method5248(Interface20 interface20,
				     Interface18 interface18) {
	int i = -1;
	if (301610423 * anInt3187 != -1) {
	    Class322 class322
		= interface20.method124(301610423 * anInt3187, 66414070);
	    if (null != class322)
		i = interface18.method93(class322, (byte) 2);
	} else if (573014389 * anInt3169 != -1) {
	    Class163 class163
		= interface20.method119(Class453.aClass453_4939,
					573014389 * anInt3169, -923638680);
	    if (null != class163)
		i = interface18.method104(class163, 623775022);
	}
	if (i < 0 || i >= anIntArray3174.length - 1) {
	    int i_36_ = anIntArray3174[anIntArray3174.length - 1];
	    if (-1 != i_36_)
		return ((Class287)
			anInterface13_3148.method76(i_36_, -1352959268));
	    return null;
	}
	if (-1 == anIntArray3174[i])
	    return null;
	return ((Class287)
		anInterface13_3148.method76(anIntArray3174[i], -662799880));
    }
    
    public String method5249(int i, String string, short i_37_) {
	if (aClass10_3193 == null)
	    return string;
	Class525_Sub19 class525_sub19
	    = (Class525_Sub19) aClass10_3193.method684((long) i);
	if (class525_sub19 == null)
	    return string;
	return (String) class525_sub19.anObject10571;
    }
    
    Class287(int i, Interface13 interface13, Class267 class267) {
	anInt3149 = 0;
	aBool3188 = true;
	aBool3157 = false;
	aStringArray3163 = new String[5];
	anInt3168 = 895304057;
	anInt3166 = 935920143;
	anInt3167 = 1826212729;
	anInt3187 = -148617223;
	anInt3169 = 1487239459;
	anInt3172 = 1650424187;
	anInt3158 = 1114469753;
	anIntArray3174 = null;
	anInt3176 = 2016667181;
	anInt3164 = 224570999;
	anInt3178 = -2147483648;
	anInt3179 = -2147483648;
	anInt3181 = 268812295;
	anInt3182 = -1324095133;
	anInt3162 = -432110571;
	aClass275_3186 = Class275.aClass275_2863;
	aClass272_3161 = Class272.aClass272_2846;
	anInt3190 = -358167051;
	aBool3180 = true;
	anInt3192 = -1678614789;
	anInt3147 = 1088873851;
	anInt3194 = 565328807 * i;
	anInterface13_3148 = interface13;
	aClass267_3155 = class267;
    }
    
    public Class157 method5250(Class182 class182, int i) {
	Class157 class157
	    = (Class157) (aClass267_3155.aClass200_2815.method3785
			  ((long) (369731383 * anInt3168 | 0x20000
				   | class182.anInt1942 * -2117565327 << 29)));
	if (class157 != null)
	    return class157;
	aClass267_3155.aClass458_2816.method7506(369731383 * anInt3168,
						 -1961103069);
	Class173 class173 = Class187.method3667(aClass267_3155.aClass458_2816,
						anInt3168 * 369731383, 0);
	if (null != class173) {
	    class157 = class182.method3216(class173, true);
	    aClass267_3155.aClass200_2815.method3788
		(class157, (long) (369731383 * anInt3168 | 0x20000
				   | -2117565327 * class182.anInt1942 << 29));
	}
	return class157;
    }
    
    public int method5251(int i, int i_38_) {
	if (aClass10_3193 == null)
	    return i_38_;
	Class525_Sub42 class525_sub42
	    = (Class525_Sub42) aClass10_3193.method684((long) i);
	if (class525_sub42 == null)
	    return i_38_;
	return class525_sub42.anInt10858 * -1344652871;
    }
    
    public boolean method5252(Interface20 interface20,
			      Interface18 interface18) {
	int i = -1;
	if (-1 != anInt3169 * 573014389) {
	    Class163 class163
		= interface20.method119(Class453.aClass453_4939,
					anInt3169 * 573014389, -1496478275);
	    i = interface18.method104(class163, 623775022);
	} else if (-1 != 301610423 * anInt3187) {
	    Class322 class322
		= interface20.method124(301610423 * anInt3187, 1070530334);
	    i = interface18.method93(class322, (byte) 2);
	} else
	    return true;
	if (null == anIntArray3174) {
	    if (i < 742675217 * anInt3166 || i > 1232359735 * anInt3167)
		return false;
	} else {
	    if (i < 0 || i >= anIntArray3174.length - 1) {
		int i_39_ = anIntArray3174[anIntArray3174.length - 1];
		if (i_39_ != -1) {
		    if (-1 != anInt3166 * 742675217
			&& -1 != 1232359735 * anInt3167
			&& (i < 742675217 * anInt3166
			    || i > anInt3167 * 1232359735))
			return false;
		} else
		    return false;
	    }
	    if (-1 == anIntArray3174[i])
		return false;
	}
	boolean bool = false;
	int i_40_;
	if (1507334967 * anInt3158 != -1) {
	    Class163 class163
		= interface20.method119(Class453.aClass453_4939,
					anInt3158 * 1507334967, -951450939);
	    i_40_ = interface18.method104(class163, 623775022);
	} else if (-1 != anInt3172 * 1497924173) {
	    Class322 class322
		= interface20.method124(1497924173 * anInt3172, 1547013964);
	    i_40_ = interface18.method93(class322, (byte) 2);
	} else
	    return true;
	if (i_40_ < -2058015001 * anInt3170 || i_40_ > 1021245957 * anInt3171)
	    return false;
	return true;
    }
    
    public final Class287 method5253(Interface20 interface20,
				     Interface18 interface18) {
	int i = -1;
	if (301610423 * anInt3187 != -1) {
	    Class322 class322
		= interface20.method124(301610423 * anInt3187, 363889698);
	    if (null != class322)
		i = interface18.method93(class322, (byte) 2);
	} else if (573014389 * anInt3169 != -1) {
	    Class163 class163
		= interface20.method119(Class453.aClass453_4939,
					573014389 * anInt3169, -1357888145);
	    if (null != class163)
		i = interface18.method104(class163, 623775022);
	}
	if (i < 0 || i >= anIntArray3174.length - 1) {
	    int i_41_ = anIntArray3174[anIntArray3174.length - 1];
	    if (-1 != i_41_)
		return ((Class287)
			anInterface13_3148.method76(i_41_, -1691758079));
	    return null;
	}
	if (-1 == anIntArray3174[i])
	    return null;
	return ((Class287)
		anInterface13_3148.method76(anIntArray3174[i], -710444306));
    }
    
    public final Class287 method5254(Interface20 interface20,
				     Interface18 interface18) {
	int i = -1;
	if (301610423 * anInt3187 != -1) {
	    Class322 class322
		= interface20.method124(301610423 * anInt3187, 578327216);
	    if (null != class322)
		i = interface18.method93(class322, (byte) 2);
	} else if (573014389 * anInt3169 != -1) {
	    Class163 class163
		= interface20.method119(Class453.aClass453_4939,
					573014389 * anInt3169, -2110572725);
	    if (null != class163)
		i = interface18.method104(class163, 623775022);
	}
	if (i < 0 || i >= anIntArray3174.length - 1) {
	    int i_42_ = anIntArray3174[anIntArray3174.length - 1];
	    if (-1 != i_42_)
		return ((Class287)
			anInterface13_3148.method76(i_42_, 292718307));
	    return null;
	}
	if (-1 == anIntArray3174[i])
	    return null;
	return ((Class287)
		anInterface13_3148.method76(anIntArray3174[i], -751932809));
    }
    
    public String method5255(int i, String string) {
	if (aClass10_3193 == null)
	    return string;
	Class525_Sub19 class525_sub19
	    = (Class525_Sub19) aClass10_3193.method684((long) i);
	if (class525_sub19 == null)
	    return string;
	return (String) class525_sub19.anObject10571;
    }
    
    public final Class287 method5256(Interface20 interface20,
				     Interface18 interface18) {
	int i = -1;
	if (301610423 * anInt3187 != -1) {
	    Class322 class322
		= interface20.method124(301610423 * anInt3187, -350264687);
	    if (null != class322)
		i = interface18.method93(class322, (byte) 2);
	} else if (573014389 * anInt3169 != -1) {
	    Class163 class163
		= interface20.method119(Class453.aClass453_4939,
					573014389 * anInt3169, -2039390132);
	    if (null != class163)
		i = interface18.method104(class163, 623775022);
	}
	if (i < 0 || i >= anIntArray3174.length - 1) {
	    int i_43_ = anIntArray3174[anIntArray3174.length - 1];
	    if (-1 != i_43_)
		return ((Class287)
			anInterface13_3148.method76(i_43_, -1337878191));
	    return null;
	}
	if (-1 == anIntArray3174[i])
	    return null;
	return ((Class287)
		anInterface13_3148.method76(anIntArray3174[i], 889989253));
    }
    
    static final void method5257(Class683 class683, int i) {
	int i_44_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class182_Sub2.aClass228_9503.method4275(i_44_, -307982714)
		  .method4161((byte) 93);
    }
    
    static final void method5258(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = class683.aClass525_Sub25_8653.method16348(((String)
							 (class683
							  .anObjectArray8636
							  [((class683.anInt8644
							     -= 1285561025)
							    * 1373599041)])),
							35714);
    }
    
    public static void method5259(Class631 class631, int i) {
	Class29.anInt286 = class631.anInt8196 * 1560223539;
	Class188.anInt2135 = class631.anInt8195 * -2075388873;
	Class29.anInt287 = class631.anInt8198 * 1612347385;
    }
}
