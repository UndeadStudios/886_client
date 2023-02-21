/* Class194 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class194 implements Interface12
{
    public int[] anIntArray2151;
    int anInt2152;
    public int anInt2153;
    public int anInt2154;
    Class10 aClass10_2155;
    public int[] anIntArray2156;
    public int anInt2157 = 0;
    public Class210 aClass210_2158;
    public int[] anIntArray2159;
    public int[][] anIntArrayArray2160;
    public int anInt2161;
    public int anInt2162;
    public boolean aBool2163;
    public int anInt2164;
    public int anInt2165;
    public int anInt2166;
    public int anInt2167;
    public int anInt2168;
    public boolean aBool2169;
    Class206 aClass206_2170;
    public int[] anIntArray2171;
    public int[] anIntArray2172;
    public int[] anIntArray2173;
    public static boolean aBool2174 = false;
    public int anInt2175;
    
    void method3718(RSBuffer class525_sub38, int i, int i_0_) {
	if (1 == i) {
	    int i_1_ = class525_sub38.readUnsignedShort((byte) 92);
	    anIntArray2156 = new int[i_1_];
	    for (int i_2_ = 0; i_2_ < i_1_; i_2_++)
		anIntArray2156[i_2_] = class525_sub38.readUnsignedShort((byte) 30);
	    anIntArray2159 = new int[i_1_];
	    for (int i_3_ = 0; i_3_ < i_1_; i_3_++)
		anIntArray2159[i_3_] = class525_sub38.readUnsignedShort((byte) 55);
	    for (int i_4_ = 0; i_4_ < i_1_; i_4_++)
		anIntArray2159[i_4_] = (class525_sub38.readUnsignedShort((byte) 126)
					<< 16) + anIntArray2159[i_4_];
	} else if (i == 2)
	    anInt2168 = class525_sub38.readUnsignedShort((byte) 17) * 1471889067;
	else if (i == 5)
	    anInt2162 = class525_sub38.readUnsignedByte(1731271389) * 275412631;
	else if (6 == i)
	    anInt2161 = class525_sub38.readUnsignedShort((byte) 44) * 219955247;
	else if (i == 7)
	    anInt2164 = class525_sub38.readUnsignedShort((byte) 47) * 1107178429;
	else if (8 == i)
	    anInt2165 = class525_sub38.readUnsignedByte(2105332226) * -1537345603;
	else if (9 == i)
	    anInt2166 = class525_sub38.readUnsignedByte(1808736380) * 513988037;
	else if (i == 10)
	    anInt2167 = class525_sub38.readUnsignedByte(2107183457) * -1313336343;
	else if (i == 11)
	    anInt2154 = class525_sub38.readUnsignedByte(37813992) * -1849278909;
	else if (i == 12 || i == 112) {
	    int i_5_;
	    if (12 == i)
		i_5_ = class525_sub38.readUnsignedByte(1490578772);
	    else
		i_5_ = class525_sub38.readUnsignedShort((byte) 4);
	    anIntArray2171 = new int[i_5_];
	    for (int i_6_ = 0; i_6_ < i_5_; i_6_++)
		anIntArray2171[i_6_] = class525_sub38.readUnsignedShort((byte) 14);
	    for (int i_7_ = 0; i_7_ < i_5_; i_7_++)
		anIntArray2171[i_7_] = (class525_sub38.readUnsignedShort((byte) 109)
					<< 16) + anIntArray2171[i_7_];
	} else if (13 == i) {
	    int i_8_ = class525_sub38.readUnsignedShort((byte) 93);
	    anIntArrayArray2160 = new int[i_8_][];
	    for (int i_9_ = 0; i_9_ < i_8_; i_9_++) {
		int i_10_ = class525_sub38.readUnsignedByte(352099844);
		if (i_10_ > 0) {
		    anIntArrayArray2160[i_9_] = new int[i_10_];
		    anIntArrayArray2160[i_9_][0]
			= class525_sub38.method16834(-1994884458);
		    for (int i_11_ = 1; i_11_ < i_10_; i_11_++)
			anIntArrayArray2160[i_9_][i_11_]
			    = class525_sub38.readUnsignedShort((byte) 109);
		}
	    }
	} else if (14 == i)
	    aBool2169 = true;
	else if (15 == i)
	    aBool2163 = true;
	else if (i != 16 && i != 18) {
	    if (i == 19 || 119 == i) {
		if (anIntArray2151 == null) {
		    anIntArray2151 = new int[anIntArrayArray2160.length];
		    for (int i_12_ = 0; i_12_ < anIntArrayArray2160.length;
			 i_12_++)
			anIntArray2151[i_12_] = 255;
		}
		int i_13_;
		if (i == 19)
		    i_13_ = class525_sub38.readUnsignedByte(684576145);
		else
		    i_13_ = class525_sub38.readUnsignedShort((byte) 65);
		anIntArray2151[i_13_] = class525_sub38.readUnsignedByte(1734745657);
	    } else if (i == 20 || 120 == i) {
		if (null == anIntArray2172 || null == anIntArray2173) {
		    anIntArray2172 = new int[anIntArrayArray2160.length];
		    anIntArray2173 = new int[anIntArrayArray2160.length];
		    for (int i_14_ = 0; i_14_ < anIntArrayArray2160.length;
			 i_14_++) {
			anIntArray2172[i_14_] = 256;
			anIntArray2173[i_14_] = 256;
		    }
		}
		int i_15_;
		if (i == 20)
		    i_15_ = class525_sub38.readUnsignedByte(711903727);
		else
		    i_15_ = class525_sub38.readUnsignedShort((byte) 16);
		anIntArray2172[i_15_] = class525_sub38.readUnsignedShort((byte) 5);
		anIntArray2173[i_15_] = class525_sub38.readUnsignedShort((byte) 37);
	    } else if (22 == i)
		anInt2175
		    = class525_sub38.readUnsignedByte(1248602322) * -1022542303;
	    else if (i == 23)
		class525_sub38.readUnsignedShort((byte) 20);
	    else if (i == 24) {
		anInt2152 = class525_sub38.readUnsignedShort((byte) 70) * 2121231111;
		if (null != aClass206_2170)
		    aClass210_2158
			= ((Class210)
			   aClass206_2170.anInterface13_2245
			       .method76(anInt2152 * 2005668535, -1911836536));
	    } else if (249 == i) {
		int i_16_ = class525_sub38.readUnsignedByte(1490667704);
		if (null == aClass10_2155) {
		    int i_17_ = Class212.method3935(i_16_, -2056250364);
		    aClass10_2155 = new Class10(i_17_);
		}
		for (int i_18_ = 0; i_18_ < i_16_; i_18_++) {
		    boolean bool = class525_sub38.readUnsignedByte(580807210) == 1;
		    int i_19_ = class525_sub38.method16834(-1994884458);
		    Class525 class525;
		    if (bool)
			class525
			    = new Class525_Sub19(class525_sub38
						     .readString((byte) -27));
		    else
			class525
			    = new Class525_Sub42(class525_sub38
						     .readInt(2096809219));
		    aClass10_2155.method695(class525, (long) i_19_);
		}
	    }
	}
    }
    
    public boolean method3719() {
	if (null == anIntArray2159)
	    return true;
	boolean bool = true;
	int[] is = anIntArray2159;
	for (int i = 0; i < is.length; i++) {
	    int i_20_ = is[i];
	    if (aClass206_2170.method3898(i_20_ >>> 16, 512751906) == null)
		bool = false;
	}
	return bool;
    }
    
    void method3720(RSBuffer class525_sub38, int i) {
	if (1 == i) {
	    int i_21_ = class525_sub38.readUnsignedShort((byte) 24);
	    anIntArray2156 = new int[i_21_];
	    for (int i_22_ = 0; i_22_ < i_21_; i_22_++)
		anIntArray2156[i_22_] = class525_sub38.readUnsignedShort((byte) 8);
	    anIntArray2159 = new int[i_21_];
	    for (int i_23_ = 0; i_23_ < i_21_; i_23_++)
		anIntArray2159[i_23_] = class525_sub38.readUnsignedShort((byte) 27);
	    for (int i_24_ = 0; i_24_ < i_21_; i_24_++)
		anIntArray2159[i_24_] = (class525_sub38.readUnsignedShort((byte) 109)
					 << 16) + anIntArray2159[i_24_];
	} else if (i == 2)
	    anInt2168 = class525_sub38.readUnsignedShort((byte) 117) * 1471889067;
	else if (i == 5)
	    anInt2162 = class525_sub38.readUnsignedByte(1507557861) * 275412631;
	else if (6 == i)
	    anInt2161 = class525_sub38.readUnsignedShort((byte) 61) * 219955247;
	else if (i == 7)
	    anInt2164 = class525_sub38.readUnsignedShort((byte) 34) * 1107178429;
	else if (8 == i)
	    anInt2165 = class525_sub38.readUnsignedByte(685459774) * -1537345603;
	else if (9 == i)
	    anInt2166 = class525_sub38.readUnsignedByte(632223559) * 513988037;
	else if (i == 10)
	    anInt2167 = class525_sub38.readUnsignedByte(2077248937) * -1313336343;
	else if (i == 11)
	    anInt2154 = class525_sub38.readUnsignedByte(1512839681) * -1849278909;
	else if (i == 12 || i == 112) {
	    int i_25_;
	    if (12 == i)
		i_25_ = class525_sub38.readUnsignedByte(806278250);
	    else
		i_25_ = class525_sub38.readUnsignedShort((byte) 71);
	    anIntArray2171 = new int[i_25_];
	    for (int i_26_ = 0; i_26_ < i_25_; i_26_++)
		anIntArray2171[i_26_] = class525_sub38.readUnsignedShort((byte) 25);
	    for (int i_27_ = 0; i_27_ < i_25_; i_27_++)
		anIntArray2171[i_27_] = (class525_sub38.readUnsignedShort((byte) 123)
					 << 16) + anIntArray2171[i_27_];
	} else if (13 == i) {
	    int i_28_ = class525_sub38.readUnsignedShort((byte) 34);
	    anIntArrayArray2160 = new int[i_28_][];
	    for (int i_29_ = 0; i_29_ < i_28_; i_29_++) {
		int i_30_ = class525_sub38.readUnsignedByte(1890547304);
		if (i_30_ > 0) {
		    anIntArrayArray2160[i_29_] = new int[i_30_];
		    anIntArrayArray2160[i_29_][0]
			= class525_sub38.method16834(-1994884458);
		    for (int i_31_ = 1; i_31_ < i_30_; i_31_++)
			anIntArrayArray2160[i_29_][i_31_]
			    = class525_sub38.readUnsignedShort((byte) 61);
		}
	    }
	} else if (14 == i)
	    aBool2169 = true;
	else if (15 == i)
	    aBool2163 = true;
	else if (i != 16 && i != 18) {
	    if (i == 19 || 119 == i) {
		if (anIntArray2151 == null) {
		    anIntArray2151 = new int[anIntArrayArray2160.length];
		    for (int i_32_ = 0; i_32_ < anIntArrayArray2160.length;
			 i_32_++)
			anIntArray2151[i_32_] = 255;
		}
		int i_33_;
		if (i == 19)
		    i_33_ = class525_sub38.readUnsignedByte(412667800);
		else
		    i_33_ = class525_sub38.readUnsignedShort((byte) 94);
		anIntArray2151[i_33_] = class525_sub38.readUnsignedByte(905487470);
	    } else if (i == 20 || 120 == i) {
		if (null == anIntArray2172 || null == anIntArray2173) {
		    anIntArray2172 = new int[anIntArrayArray2160.length];
		    anIntArray2173 = new int[anIntArrayArray2160.length];
		    for (int i_34_ = 0; i_34_ < anIntArrayArray2160.length;
			 i_34_++) {
			anIntArray2172[i_34_] = 256;
			anIntArray2173[i_34_] = 256;
		    }
		}
		int i_35_;
		if (i == 20)
		    i_35_ = class525_sub38.readUnsignedByte(146108748);
		else
		    i_35_ = class525_sub38.readUnsignedShort((byte) 24);
		anIntArray2172[i_35_] = class525_sub38.readUnsignedShort((byte) 94);
		anIntArray2173[i_35_] = class525_sub38.readUnsignedShort((byte) 107);
	    } else if (22 == i)
		anInt2175
		    = class525_sub38.readUnsignedByte(2110429332) * -1022542303;
	    else if (i == 23)
		class525_sub38.readUnsignedShort((byte) 5);
	    else if (i == 24) {
		anInt2152 = class525_sub38.readUnsignedShort((byte) 42) * 2121231111;
		if (null != aClass206_2170)
		    aClass210_2158
			= ((Class210)
			   aClass206_2170.anInterface13_2245
			       .method76(anInt2152 * 2005668535, 550153950));
	    } else if (249 == i) {
		int i_36_ = class525_sub38.readUnsignedByte(2012131769);
		if (null == aClass10_2155) {
		    int i_37_ = Class212.method3935(i_36_, -2056250364);
		    aClass10_2155 = new Class10(i_37_);
		}
		for (int i_38_ = 0; i_38_ < i_36_; i_38_++) {
		    boolean bool = class525_sub38.readUnsignedByte(1276897664) == 1;
		    int i_39_ = class525_sub38.method16834(-1994884458);
		    Class525 class525;
		    if (bool)
			class525
			    = new Class525_Sub19(class525_sub38
						     .readString((byte) 1));
		    else
			class525
			    = new Class525_Sub42(class525_sub38
						     .readInt(1885091493));
		    aClass10_2155.method695(class525, (long) i_39_);
		}
	    }
	}
    }
    
    Class194(int i, Class206 class206) {
	anInt2152 = -2121231111;
	anInt2168 = -1471889067;
	anInt2162 = 1377063155;
	anInt2161 = -219955247;
	anInt2164 = -1107178429;
	anInt2165 = -1873359337;
	anInt2166 = -513988037;
	anInt2167 = 1313336343;
	anInt2154 = 596409478;
	aBool2169 = false;
	aBool2163 = false;
	anInt2175 = 1022542303;
	anInt2153 = i * 2097759349;
	aClass206_2170 = class206;
    }
    
    public int method3721(int i, int i_40_) {
	if (aClass10_2155 == null)
	    return i_40_;
	Class525_Sub42 class525_sub42
	    = (Class525_Sub42) aClass10_2155.method684((long) i);
	if (class525_sub42 == null)
	    return i_40_;
	return -1344652871 * class525_sub42.anInt10858;
    }
    
    public int method3722(int i, int i_41_, byte i_42_) {
	if (aClass10_2155 == null)
	    return i_41_;
	Class525_Sub42 class525_sub42
	    = (Class525_Sub42) aClass10_2155.method684((long) i);
	if (class525_sub42 == null)
	    return i_41_;
	return -1344652871 * class525_sub42.anInt10858;
    }
    
    public void method68(RSBuffer class525_sub38) {
	for (;;) {
	    int i = class525_sub38.readUnsignedByte(1438967659);
	    if (i == 0)
		break;
	    method3718(class525_sub38, i, -1201417620);
	}
    }
    
    public void method66(RSBuffer class525_sub38, int i) {
	for (;;) {
	    int i_43_ = class525_sub38.readUnsignedByte(980663559);
	    if (i_43_ == 0)
		break;
	    method3718(class525_sub38, i_43_, -1319607841);
	}
    }
    
    public void method69() {
	if (-1 == anInt2166 * -83500787) {
	    if (null != aClass210_2158
		&& null != aClass210_2158.aBoolArray2262)
		anInt2166 = 1027976074;
	    else
		anInt2166 = 0;
	}
	if (-764414887 * anInt2167 == -1) {
	    if (null != aClass210_2158
		&& aClass210_2158.aBoolArray2262 != null)
		anInt2167 = 1668294610;
	    else
		anInt2167 = 0;
	}
	if (null != anIntArray2156) {
	    anInt2157 = 0;
	    for (int i = 0; i < anIntArray2156.length; i++)
		anInt2157 += anIntArray2156[i] * -346242477;
	}
    }
    
    public void method70() {
	if (-1 == anInt2166 * -83500787) {
	    if (null != aClass210_2158
		&& null != aClass210_2158.aBoolArray2262)
		anInt2166 = 1027976074;
	    else
		anInt2166 = 0;
	}
	if (-764414887 * anInt2167 == -1) {
	    if (null != aClass210_2158
		&& aClass210_2158.aBoolArray2262 != null)
		anInt2167 = 1668294610;
	    else
		anInt2167 = 0;
	}
	if (null != anIntArray2156) {
	    anInt2157 = 0;
	    for (int i = 0; i < anIntArray2156.length; i++)
		anInt2157 += anIntArray2156[i] * -346242477;
	}
    }
    
    public void method67(int i) {
	if (-1 == anInt2166 * -83500787) {
	    if (null != aClass210_2158
		&& null != aClass210_2158.aBoolArray2262)
		anInt2166 = 1027976074;
	    else
		anInt2166 = 0;
	}
	if (-764414887 * anInt2167 == -1) {
	    if (null != aClass210_2158
		&& aClass210_2158.aBoolArray2262 != null)
		anInt2167 = 1668294610;
	    else
		anInt2167 = 0;
	}
	if (null != anIntArray2156) {
	    anInt2157 = 0;
	    for (int i_44_ = 0; i_44_ < anIntArray2156.length; i_44_++)
		anInt2157 += anIntArray2156[i_44_] * -346242477;
	}
    }
    
    void method3723(RSBuffer class525_sub38, int i) {
	if (1 == i) {
	    int i_45_ = class525_sub38.readUnsignedShort((byte) 114);
	    anIntArray2156 = new int[i_45_];
	    for (int i_46_ = 0; i_46_ < i_45_; i_46_++)
		anIntArray2156[i_46_] = class525_sub38.readUnsignedShort((byte) 99);
	    anIntArray2159 = new int[i_45_];
	    for (int i_47_ = 0; i_47_ < i_45_; i_47_++)
		anIntArray2159[i_47_] = class525_sub38.readUnsignedShort((byte) 110);
	    for (int i_48_ = 0; i_48_ < i_45_; i_48_++)
		anIntArray2159[i_48_] = (class525_sub38.readUnsignedShort((byte) 13)
					 << 16) + anIntArray2159[i_48_];
	} else if (i == 2)
	    anInt2168 = class525_sub38.readUnsignedShort((byte) 22) * 1471889067;
	else if (i == 5)
	    anInt2162 = class525_sub38.readUnsignedByte(253626020) * 275412631;
	else if (6 == i)
	    anInt2161 = class525_sub38.readUnsignedShort((byte) 42) * 219955247;
	else if (i == 7)
	    anInt2164 = class525_sub38.readUnsignedShort((byte) 76) * 1107178429;
	else if (8 == i)
	    anInt2165 = class525_sub38.readUnsignedByte(1232674181) * -1537345603;
	else if (9 == i)
	    anInt2166 = class525_sub38.readUnsignedByte(1743401768) * 513988037;
	else if (i == 10)
	    anInt2167 = class525_sub38.readUnsignedByte(923069454) * -1313336343;
	else if (i == 11)
	    anInt2154 = class525_sub38.readUnsignedByte(1596127308) * -1849278909;
	else if (i == 12 || i == 112) {
	    int i_49_;
	    if (12 == i)
		i_49_ = class525_sub38.readUnsignedByte(871525296);
	    else
		i_49_ = class525_sub38.readUnsignedShort((byte) 83);
	    anIntArray2171 = new int[i_49_];
	    for (int i_50_ = 0; i_50_ < i_49_; i_50_++)
		anIntArray2171[i_50_] = class525_sub38.readUnsignedShort((byte) 121);
	    for (int i_51_ = 0; i_51_ < i_49_; i_51_++)
		anIntArray2171[i_51_] = (class525_sub38.readUnsignedShort((byte) 101)
					 << 16) + anIntArray2171[i_51_];
	} else if (13 == i) {
	    int i_52_ = class525_sub38.readUnsignedShort((byte) 73);
	    anIntArrayArray2160 = new int[i_52_][];
	    for (int i_53_ = 0; i_53_ < i_52_; i_53_++) {
		int i_54_ = class525_sub38.readUnsignedByte(1264772063);
		if (i_54_ > 0) {
		    anIntArrayArray2160[i_53_] = new int[i_54_];
		    anIntArrayArray2160[i_53_][0]
			= class525_sub38.method16834(-1994884458);
		    for (int i_55_ = 1; i_55_ < i_54_; i_55_++)
			anIntArrayArray2160[i_53_][i_55_]
			    = class525_sub38.readUnsignedShort((byte) 5);
		}
	    }
	} else if (14 == i)
	    aBool2169 = true;
	else if (15 == i)
	    aBool2163 = true;
	else if (i != 16 && i != 18) {
	    if (i == 19 || 119 == i) {
		if (anIntArray2151 == null) {
		    anIntArray2151 = new int[anIntArrayArray2160.length];
		    for (int i_56_ = 0; i_56_ < anIntArrayArray2160.length;
			 i_56_++)
			anIntArray2151[i_56_] = 255;
		}
		int i_57_;
		if (i == 19)
		    i_57_ = class525_sub38.readUnsignedByte(739237237);
		else
		    i_57_ = class525_sub38.readUnsignedShort((byte) 64);
		anIntArray2151[i_57_] = class525_sub38.readUnsignedByte(-13446998);
	    } else if (i == 20 || 120 == i) {
		if (null == anIntArray2172 || null == anIntArray2173) {
		    anIntArray2172 = new int[anIntArrayArray2160.length];
		    anIntArray2173 = new int[anIntArrayArray2160.length];
		    for (int i_58_ = 0; i_58_ < anIntArrayArray2160.length;
			 i_58_++) {
			anIntArray2172[i_58_] = 256;
			anIntArray2173[i_58_] = 256;
		    }
		}
		int i_59_;
		if (i == 20)
		    i_59_ = class525_sub38.readUnsignedByte(1639607410);
		else
		    i_59_ = class525_sub38.readUnsignedShort((byte) 29);
		anIntArray2172[i_59_] = class525_sub38.readUnsignedShort((byte) 90);
		anIntArray2173[i_59_] = class525_sub38.readUnsignedShort((byte) 24);
	    } else if (22 == i)
		anInt2175
		    = class525_sub38.readUnsignedByte(939859334) * -1022542303;
	    else if (i == 23)
		class525_sub38.readUnsignedShort((byte) 29);
	    else if (i == 24) {
		anInt2152 = class525_sub38.readUnsignedShort((byte) 27) * 2121231111;
		if (null != aClass206_2170)
		    aClass210_2158
			= ((Class210)
			   aClass206_2170.anInterface13_2245
			       .method76(anInt2152 * 2005668535, 548045077));
	    } else if (249 == i) {
		int i_60_ = class525_sub38.readUnsignedByte(1814709116);
		if (null == aClass10_2155) {
		    int i_61_ = Class212.method3935(i_60_, -2056250364);
		    aClass10_2155 = new Class10(i_61_);
		}
		for (int i_62_ = 0; i_62_ < i_60_; i_62_++) {
		    boolean bool = class525_sub38.readUnsignedByte(1714508327) == 1;
		    int i_63_ = class525_sub38.method16834(-1994884458);
		    Class525 class525;
		    if (bool)
			class525
			    = new Class525_Sub19(class525_sub38
						     .readString((byte) -27));
		    else
			class525
			    = new Class525_Sub42(class525_sub38
						     .readInt(2085658728));
		    aClass10_2155.method695(class525, (long) i_63_);
		}
	    }
	}
    }
    
    public boolean method3724() {
	if (null == anIntArray2159)
	    return true;
	boolean bool = true;
	int[] is = anIntArray2159;
	for (int i = 0; i < is.length; i++) {
	    int i_64_ = is[i];
	    if (aClass206_2170.method3898(i_64_ >>> 16, 1887745401) == null)
		bool = false;
	}
	return bool;
    }
    
    public boolean method3725(int i) {
	if (null == anIntArray2159)
	    return true;
	boolean bool = true;
	int[] is = anIntArray2159;
	for (int i_65_ = 0; i_65_ < is.length; i_65_++) {
	    int i_66_ = is[i_65_];
	    if (aClass206_2170.method3898(i_66_ >>> 16, 372856903) == null)
		bool = false;
	}
	return bool;
    }
    
    public int method3726(int i, int i_67_) {
	if (aClass10_2155 == null)
	    return i_67_;
	Class525_Sub42 class525_sub42
	    = (Class525_Sub42) aClass10_2155.method684((long) i);
	if (class525_sub42 == null)
	    return i_67_;
	return -1344652871 * class525_sub42.anInt10858;
    }
    
    public int method3727(int i, int i_68_) {
	if (aClass10_2155 == null)
	    return i_68_;
	Class525_Sub42 class525_sub42
	    = (Class525_Sub42) aClass10_2155.method684((long) i);
	if (class525_sub42 == null)
	    return i_68_;
	return -1344652871 * class525_sub42.anInt10858;
    }
    
    public String method3728(int i, String string, byte i_69_) {
	if (null == aClass10_2155)
	    return string;
	Class525_Sub19 class525_sub19
	    = (Class525_Sub19) aClass10_2155.method684((long) i);
	if (null == class525_sub19)
	    return string;
	return (String) class525_sub19.anObject10571;
    }
    
    public String method3729(int i, String string) {
	if (null == aClass10_2155)
	    return string;
	Class525_Sub19 class525_sub19
	    = (Class525_Sub19) aClass10_2155.method684((long) i);
	if (null == class525_sub19)
	    return string;
	return (String) class525_sub19.anObject10571;
    }
    
    public String method3730(int i, String string) {
	if (null == aClass10_2155)
	    return string;
	Class525_Sub19 class525_sub19
	    = (Class525_Sub19) aClass10_2155.method684((long) i);
	if (null == class525_sub19)
	    return string;
	return (String) class525_sub19.anObject10571;
    }
    
    static final void method3731(Class683 class683, int i) {
	throw new RuntimeException("");
    }
    
    static final void method3732(Class683 class683, byte i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class70.anInt782 * 473728883;
    }
}
