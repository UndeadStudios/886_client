/* Class269 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class269 implements Interface12
{
    public int anInt2818 = 0;
    public String aString2819;
    public String aString2820;
    Interface13 anInterface13_2821;
    int[][] anIntArrayArray2822;
    public int anInt2823;
    public int anInt2824 = 0;
    public boolean aBool2825 = false;
    int[] anIntArray2826;
    public int[] anIntArray2827;
    public int[] anIntArray2828;
    int[] anIntArray2829;
    public int anInt2830;
    public int[] anIntArray2831;
    int[] anIntArray2832;
    Class10 aClass10_2833;
    public String[] aStringArray2834;
    int[] anIntArray2835;
    int[] anIntArray2836;
    int[][] anIntArrayArray2837;
    public String[] aStringArray2838;
    public int[][] anIntArrayArray2839;
    public int anInt2840 = -2130208029;
    
    public String method4962(int i, String string) {
	if (null == aClass10_2833)
	    return string;
	Class525_Sub19 class525_sub19
	    = (Class525_Sub19) aClass10_2833.method684((long) i);
	if (null == class525_sub19)
	    return string;
	return (String) class525_sub19.anObject10571;
    }
    
    public void method66(RSBuffer class525_sub38, int i) {
	for (;;) {
	    int i_0_ = class525_sub38.readUnsignedByte(358796147);
	    if (i_0_ == 0)
		break;
	    method4974(class525_sub38, i_0_, -190225504);
	}
    }
    
    Class269(int i, Interface13 interface13) {
	anInterface13_2821 = interface13;
    }
    
    public void method67(int i) {
	if (null == aString2820)
	    aString2820 = aString2819;
    }
    
    public int method4963(int i, int i_1_, int i_2_) {
	if (null == aClass10_2833)
	    return i_1_;
	Class525_Sub42 class525_sub42
	    = (Class525_Sub42) aClass10_2833.method684((long) i);
	if (class525_sub42 == null)
	    return i_1_;
	return class525_sub42.anInt10858 * -1344652871;
    }
    
    public String method4964(int i, String string, int i_3_) {
	if (null == aClass10_2833)
	    return string;
	Class525_Sub19 class525_sub19
	    = (Class525_Sub19) aClass10_2833.method684((long) i);
	if (null == class525_sub19)
	    return string;
	return (String) class525_sub19.anObject10571;
    }
    
    static int method4965(Interface18 interface18, Interface13 interface13) {
	int i = 0;
	for (int i_4_ = 0; i_4_ < interface13.method72(-1268318995); i_4_++) {
	    Class269 class269
		= (Class269) interface13.method76(i_4_, 1011119771);
	    if (class269.method4966(interface18, -2025777287))
		i += class269.anInt2823 * 1578208537;
	}
	return i;
    }
    
    public boolean method4966(Interface18 interface18, int i) {
	if (null != anIntArrayArray2837) {
	    for (int i_5_ = 0; i_5_ < anIntArrayArray2837.length; i_5_++) {
		Class163 class163
		    = (((Interface20) interface18).method119
		       (Class453.aClass453_4939, anIntArrayArray2837[i_5_][0],
			-1215625851));
		if (interface18.method104(class163, 623775022)
		    >= anIntArrayArray2837[i_5_][2])
		    return true;
	    }
	}
	if (anIntArrayArray2822 != null) {
	    for (int i_6_ = 0; i_6_ < anIntArrayArray2822.length; i_6_++) {
		Class322 class322
		    = ((Interface20) interface18)
			  .method124(anIntArrayArray2822[i_6_][0], 1054435349);
		if (interface18.method93(class322, (byte) 2)
		    >= anIntArrayArray2822[i_6_][2])
		    return true;
	    }
	}
	return false;
    }
    
    public boolean method4967(Interface18 interface18, int i) {
	if (Class93.method1728(interface18, anInterface13_2821, (byte) -51)
	    < -2090720135 * anInt2830)
	    return false;
	if (null != anIntArrayArray2839) {
	    for (int i_7_ = 0; i_7_ < anIntArrayArray2839.length; i_7_++) {
		if (((Interface73) interface18).method498((anIntArrayArray2839
							   [i_7_][0]),
							  (short) -24385)
		    < anIntArrayArray2839[i_7_][1])
		    return false;
	    }
	}
	if (null != anIntArray2828) {
	    for (int i_8_ = 0; i_8_ < anIntArray2828.length; i_8_++) {
		if (!((Class269)
		      anInterface13_2821.method76(anIntArray2828[i_8_],
						  -1602632473))
			 .method4966(interface18, -1328886098))
		    return false;
	    }
	}
	if (anIntArray2831 != null) {
	    for (int i_9_ = 0; i_9_ < anIntArray2831.length; i_9_++) {
		Class163 class163
		    = ((Interface20) interface18).method119((Class453
							     .aClass453_4939),
							    (anIntArray2831
							     [i_9_]),
							    -2035704423);
		int i_10_ = interface18.method104(class163, 623775022);
		if (i_10_ < anIntArray2832[i_9_]
		    || i_10_ > anIntArray2829[i_9_])
		    return false;
	    }
	}
	if (null != anIntArray2827) {
	    for (int i_11_ = 0; i_11_ < anIntArray2827.length; i_11_++) {
		Class322 class322
		    = ((Interface20) interface18)
			  .method124(anIntArray2827[i_11_], -673440496);
		int i_12_ = interface18.method93(class322, (byte) 2);
		if (i_12_ < anIntArray2826[i_11_]
		    || i_12_ > anIntArray2836[i_11_])
		    return false;
	    }
	}
	return true;
    }
    
    public boolean method4968(Interface18 interface18, int i) {
	if (Class93.method1728(interface18, anInterface13_2821, (byte) 61)
	    < anInt2830 * -2090720135)
	    return false;
	return true;
    }
    
    public boolean method4969(Interface18 interface18, int i, int i_13_) {
	if (null == anIntArray2828 || i < 0 || i >= anIntArray2828.length)
	    return false;
	if (!((Class269)
	      anInterface13_2821.method76(anIntArray2828[i], -1979127591))
		 .method4966(interface18, 131154102))
	    return false;
	return true;
    }
    
    public int method4970(int i, int i_14_) {
	if (null == aClass10_2833)
	    return i_14_;
	Class525_Sub42 class525_sub42
	    = (Class525_Sub42) aClass10_2833.method684((long) i);
	if (class525_sub42 == null)
	    return i_14_;
	return class525_sub42.anInt10858 * -1344652871;
    }
    
    public boolean method4971(Interface18 interface18, int i, int i_15_) {
	if (anIntArray2831 == null || i < 0 || i >= anIntArray2831.length)
	    return false;
	Class163 class163
	    = ((Interface20) interface18).method119(Class453.aClass453_4939,
						    anIntArray2831[i],
						    -1840592878);
	int i_16_ = interface18.method104(class163, 623775022);
	if (i_16_ < anIntArray2832[i] || i_16_ > anIntArray2829[i])
	    return false;
	return true;
    }
    
    public boolean method4972(Interface18 interface18, int i, int i_17_) {
	if (null == anIntArray2827 || i < 0 || i >= anIntArray2827.length)
	    return false;
	Class322 class322
	    = ((Interface20) interface18).method124(anIntArray2827[i],
						    900387696);
	int i_18_ = interface18.method93(class322, (byte) 2);
	if (i_18_ < anIntArray2826[i] || i_18_ > anIntArray2836[i])
	    return false;
	return true;
    }
    
    public boolean method4973(Interface18 interface18) {
	if (Class93.method1728(interface18, anInterface13_2821, (byte) 61)
	    < anInt2830 * -2090720135)
	    return false;
	return true;
    }
    
    void method4974(RSBuffer class525_sub38, int i, int i_19_) {
	if (i == 1)
	    aString2819 = class525_sub38.method16637(795490391);
	else if (i == 2)
	    aString2820 = class525_sub38.method16637(-1308954237);
	else if (i == 3) {
	    int i_20_ = class525_sub38.readUnsignedByte(841977603);
	    anIntArrayArray2837 = new int[i_20_][3];
	    for (int i_21_ = 0; i_21_ < i_20_; i_21_++) {
		anIntArrayArray2837[i_21_][0]
		    = class525_sub38.readUnsignedShort((byte) 116);
		anIntArrayArray2837[i_21_][1]
		    = class525_sub38.readInt(925738978);
		anIntArrayArray2837[i_21_][2]
		    = class525_sub38.readInt(829561782);
	    }
	} else if (4 == i) {
	    int i_22_ = class525_sub38.readUnsignedByte(377726083);
	    anIntArrayArray2822 = new int[i_22_][3];
	    for (int i_23_ = 0; i_23_ < i_22_; i_23_++) {
		anIntArrayArray2822[i_23_][0]
		    = class525_sub38.readUnsignedShort((byte) 11);
		anIntArrayArray2822[i_23_][1]
		    = class525_sub38.readInt(1251563208);
		anIntArrayArray2822[i_23_][2]
		    = class525_sub38.readInt(1219816847);
	    }
	} else if (5 == i)
	    class525_sub38.readUnsignedShort((byte) 60);
	else if (i == 6)
	    anInt2818 = class525_sub38.readUnsignedByte(413504118) * -703800217;
	else if (i == 7)
	    anInt2824 = class525_sub38.readUnsignedByte(118461403) * 152966745;
	else if (8 == i)
	    aBool2825 = true;
	else if (9 == i)
	    anInt2823 = class525_sub38.readUnsignedByte(373482500) * -1596358871;
	else if (10 == i) {
	    int i_24_ = class525_sub38.readUnsignedByte(1567871514);
	    anIntArray2835 = new int[i_24_];
	    for (int i_25_ = 0; i_25_ < i_24_; i_25_++)
		anIntArray2835[i_25_] = class525_sub38.readInt(2002134105);
	} else if (12 == i)
	    class525_sub38.readInt(1578194515);
	else if (13 == i) {
	    int i_26_ = class525_sub38.readUnsignedByte(1376622987);
	    anIntArray2828 = new int[i_26_];
	    for (int i_27_ = 0; i_27_ < i_26_; i_27_++)
		anIntArray2828[i_27_] = class525_sub38.readUnsignedShort((byte) 7);
	} else if (14 == i) {
	    int i_28_ = class525_sub38.readUnsignedByte(983285046);
	    anIntArrayArray2839 = new int[i_28_][2];
	    for (int i_29_ = 0; i_29_ < i_28_; i_29_++) {
		anIntArrayArray2839[i_29_][0]
		    = class525_sub38.readUnsignedByte(887569245);
		anIntArrayArray2839[i_29_][1]
		    = class525_sub38.readUnsignedByte(61507896);
	    }
	} else if (i == 15)
	    anInt2830 = class525_sub38.readUnsignedShort((byte) 49) * 1783825865;
	else if (i == 17)
	    anInt2840 = class525_sub38.readBigSmart(-2043778683) * 2130208029;
	else if (i == 18) {
	    int i_30_ = class525_sub38.readUnsignedByte(176493257);
	    anIntArray2831 = new int[i_30_];
	    anIntArray2832 = new int[i_30_];
	    anIntArray2829 = new int[i_30_];
	    aStringArray2834 = new String[i_30_];
	    for (int i_31_ = 0; i_31_ < i_30_; i_31_++) {
		anIntArray2831[i_31_] = class525_sub38.readInt(1727852938);
		anIntArray2832[i_31_] = class525_sub38.readInt(1702408561);
		anIntArray2829[i_31_] = class525_sub38.readInt(2068031300);
		aStringArray2834[i_31_] = class525_sub38.readString((byte) 1);
	    }
	} else if (19 == i) {
	    int i_32_ = class525_sub38.readUnsignedByte(1167768175);
	    anIntArray2827 = new int[i_32_];
	    anIntArray2826 = new int[i_32_];
	    anIntArray2836 = new int[i_32_];
	    aStringArray2838 = new String[i_32_];
	    for (int i_33_ = 0; i_33_ < i_32_; i_33_++) {
		anIntArray2827[i_33_] = class525_sub38.readInt(1440720751);
		anIntArray2826[i_33_] = class525_sub38.readInt(1163083742);
		anIntArray2836[i_33_] = class525_sub38.readInt(2022697928);
		aStringArray2838[i_33_]
		    = class525_sub38.readString((byte) -48);
	    }
	} else if (249 == i) {
	    int i_34_ = class525_sub38.readUnsignedByte(996353042);
	    if (aClass10_2833 == null) {
		int i_35_ = Class212.method3935(i_34_, -2056250364);
		aClass10_2833 = new Class10(i_35_);
	    }
	    for (int i_36_ = 0; i_36_ < i_34_; i_36_++) {
		boolean bool = class525_sub38.readUnsignedByte(1910470505) == 1;
		int i_37_ = class525_sub38.method16834(-1994884458);
		Class525 class525;
		if (bool)
		    class525
			= new Class525_Sub19(class525_sub38
						 .readString((byte) -18));
		else
		    class525
			= new Class525_Sub42(class525_sub38
						 .readInt(2115539917));
		aClass10_2833.method695(class525, (long) i_37_);
	    }
	}
    }
    
    public void method70() {
	if (null == aString2820)
	    aString2820 = aString2819;
    }
    
    void method4975(RSBuffer class525_sub38, int i) {
	if (i == 1)
	    aString2819 = class525_sub38.method16637(1215816339);
	else if (i == 2)
	    aString2820 = class525_sub38.method16637(-1622879396);
	else if (i == 3) {
	    int i_38_ = class525_sub38.readUnsignedByte(351849356);
	    anIntArrayArray2837 = new int[i_38_][3];
	    for (int i_39_ = 0; i_39_ < i_38_; i_39_++) {
		anIntArrayArray2837[i_39_][0]
		    = class525_sub38.readUnsignedShort((byte) 66);
		anIntArrayArray2837[i_39_][1]
		    = class525_sub38.readInt(881474389);
		anIntArrayArray2837[i_39_][2]
		    = class525_sub38.readInt(1164819271);
	    }
	} else if (4 == i) {
	    int i_40_ = class525_sub38.readUnsignedByte(1517771023);
	    anIntArrayArray2822 = new int[i_40_][3];
	    for (int i_41_ = 0; i_41_ < i_40_; i_41_++) {
		anIntArrayArray2822[i_41_][0]
		    = class525_sub38.readUnsignedShort((byte) 12);
		anIntArrayArray2822[i_41_][1]
		    = class525_sub38.readInt(1286589761);
		anIntArrayArray2822[i_41_][2]
		    = class525_sub38.readInt(914720106);
	    }
	} else if (5 == i)
	    class525_sub38.readUnsignedShort((byte) 95);
	else if (i == 6)
	    anInt2818 = class525_sub38.readUnsignedByte(1888929334) * -703800217;
	else if (i == 7)
	    anInt2824 = class525_sub38.readUnsignedByte(1033578663) * 152966745;
	else if (8 == i)
	    aBool2825 = true;
	else if (9 == i)
	    anInt2823 = class525_sub38.readUnsignedByte(1257244158) * -1596358871;
	else if (10 == i) {
	    int i_42_ = class525_sub38.readUnsignedByte(217417356);
	    anIntArray2835 = new int[i_42_];
	    for (int i_43_ = 0; i_43_ < i_42_; i_43_++)
		anIntArray2835[i_43_] = class525_sub38.readInt(2075256181);
	} else if (12 == i)
	    class525_sub38.readInt(1952074968);
	else if (13 == i) {
	    int i_44_ = class525_sub38.readUnsignedByte(1203794590);
	    anIntArray2828 = new int[i_44_];
	    for (int i_45_ = 0; i_45_ < i_44_; i_45_++)
		anIntArray2828[i_45_] = class525_sub38.readUnsignedShort((byte) 43);
	} else if (14 == i) {
	    int i_46_ = class525_sub38.readUnsignedByte(1752714275);
	    anIntArrayArray2839 = new int[i_46_][2];
	    for (int i_47_ = 0; i_47_ < i_46_; i_47_++) {
		anIntArrayArray2839[i_47_][0]
		    = class525_sub38.readUnsignedByte(603171773);
		anIntArrayArray2839[i_47_][1]
		    = class525_sub38.readUnsignedByte(483476173);
	    }
	} else if (i == 15)
	    anInt2830 = class525_sub38.readUnsignedShort((byte) 77) * 1783825865;
	else if (i == 17)
	    anInt2840 = class525_sub38.readBigSmart(-2043778683) * 2130208029;
	else if (i == 18) {
	    int i_48_ = class525_sub38.readUnsignedByte(2139376740);
	    anIntArray2831 = new int[i_48_];
	    anIntArray2832 = new int[i_48_];
	    anIntArray2829 = new int[i_48_];
	    aStringArray2834 = new String[i_48_];
	    for (int i_49_ = 0; i_49_ < i_48_; i_49_++) {
		anIntArray2831[i_49_] = class525_sub38.readInt(2143018208);
		anIntArray2832[i_49_] = class525_sub38.readInt(1836856624);
		anIntArray2829[i_49_] = class525_sub38.readInt(1629868864);
		aStringArray2834[i_49_]
		    = class525_sub38.readString((byte) 46);
	    }
	} else if (19 == i) {
	    int i_50_ = class525_sub38.readUnsignedByte(309123511);
	    anIntArray2827 = new int[i_50_];
	    anIntArray2826 = new int[i_50_];
	    anIntArray2836 = new int[i_50_];
	    aStringArray2838 = new String[i_50_];
	    for (int i_51_ = 0; i_51_ < i_50_; i_51_++) {
		anIntArray2827[i_51_] = class525_sub38.readInt(1420350769);
		anIntArray2826[i_51_] = class525_sub38.readInt(923692839);
		anIntArray2836[i_51_] = class525_sub38.readInt(1362453844);
		aStringArray2838[i_51_]
		    = class525_sub38.readString((byte) -13);
	    }
	} else if (249 == i) {
	    int i_52_ = class525_sub38.readUnsignedByte(970450858);
	    if (aClass10_2833 == null) {
		int i_53_ = Class212.method3935(i_52_, -2056250364);
		aClass10_2833 = new Class10(i_53_);
	    }
	    for (int i_54_ = 0; i_54_ < i_52_; i_54_++) {
		boolean bool = class525_sub38.readUnsignedByte(4104974) == 1;
		int i_55_ = class525_sub38.method16834(-1994884458);
		Class525 class525;
		if (bool)
		    class525 = new Class525_Sub19(class525_sub38
						      .readString((byte) 28));
		else
		    class525
			= new Class525_Sub42(class525_sub38
						 .readInt(1356251047));
		aClass10_2833.method695(class525, (long) i_55_);
	    }
	}
    }
    
    public boolean method4976(Interface18 interface18) {
	if (Class93.method1728(interface18, anInterface13_2821, (byte) 19)
	    < -2090720135 * anInt2830)
	    return false;
	if (null != anIntArrayArray2839) {
	    for (int i = 0; i < anIntArrayArray2839.length; i++) {
		if (((Interface73) interface18)
			.method498(anIntArrayArray2839[i][0], (short) -20431)
		    < anIntArrayArray2839[i][1])
		    return false;
	    }
	}
	if (null != anIntArray2828) {
	    for (int i = 0; i < anIntArray2828.length; i++) {
		if (!((Class269) anInterface13_2821.method76(anIntArray2828[i],
							     1957303019))
			 .method4966(interface18, -1977543672))
		    return false;
	    }
	}
	if (anIntArray2831 != null) {
	    for (int i = 0; i < anIntArray2831.length; i++) {
		Class163 class163
		    = ((Interface20) interface18).method119((Class453
							     .aClass453_4939),
							    anIntArray2831[i],
							    -1510142898);
		int i_56_ = interface18.method104(class163, 623775022);
		if (i_56_ < anIntArray2832[i] || i_56_ > anIntArray2829[i])
		    return false;
	    }
	}
	if (null != anIntArray2827) {
	    for (int i = 0; i < anIntArray2827.length; i++) {
		Class322 class322
		    = ((Interface20) interface18).method124(anIntArray2827[i],
							    1271728087);
		int i_57_ = interface18.method93(class322, (byte) 2);
		if (i_57_ < anIntArray2826[i] || i_57_ > anIntArray2836[i])
		    return false;
	    }
	}
	return true;
    }
    
    void method4977(RSBuffer class525_sub38, int i) {
	if (i == 1)
	    aString2819 = class525_sub38.method16637(2029048884);
	else if (i == 2)
	    aString2820 = class525_sub38.method16637(1385677511);
	else if (i == 3) {
	    int i_58_ = class525_sub38.readUnsignedByte(774955164);
	    anIntArrayArray2837 = new int[i_58_][3];
	    for (int i_59_ = 0; i_59_ < i_58_; i_59_++) {
		anIntArrayArray2837[i_59_][0]
		    = class525_sub38.readUnsignedShort((byte) 87);
		anIntArrayArray2837[i_59_][1]
		    = class525_sub38.readInt(1899862600);
		anIntArrayArray2837[i_59_][2]
		    = class525_sub38.readInt(1164943997);
	    }
	} else if (4 == i) {
	    int i_60_ = class525_sub38.readUnsignedByte(994183132);
	    anIntArrayArray2822 = new int[i_60_][3];
	    for (int i_61_ = 0; i_61_ < i_60_; i_61_++) {
		anIntArrayArray2822[i_61_][0]
		    = class525_sub38.readUnsignedShort((byte) 65);
		anIntArrayArray2822[i_61_][1]
		    = class525_sub38.readInt(1404532219);
		anIntArrayArray2822[i_61_][2]
		    = class525_sub38.readInt(1708128998);
	    }
	} else if (5 == i)
	    class525_sub38.readUnsignedShort((byte) 32);
	else if (i == 6)
	    anInt2818 = class525_sub38.readUnsignedByte(1412339129) * -703800217;
	else if (i == 7)
	    anInt2824 = class525_sub38.readUnsignedByte(52353265) * 152966745;
	else if (8 == i)
	    aBool2825 = true;
	else if (9 == i)
	    anInt2823 = class525_sub38.readUnsignedByte(1191694475) * -1596358871;
	else if (10 == i) {
	    int i_62_ = class525_sub38.readUnsignedByte(53273861);
	    anIntArray2835 = new int[i_62_];
	    for (int i_63_ = 0; i_63_ < i_62_; i_63_++)
		anIntArray2835[i_63_] = class525_sub38.readInt(1643096794);
	} else if (12 == i)
	    class525_sub38.readInt(1415380585);
	else if (13 == i) {
	    int i_64_ = class525_sub38.readUnsignedByte(14131663);
	    anIntArray2828 = new int[i_64_];
	    for (int i_65_ = 0; i_65_ < i_64_; i_65_++)
		anIntArray2828[i_65_] = class525_sub38.readUnsignedShort((byte) 64);
	} else if (14 == i) {
	    int i_66_ = class525_sub38.readUnsignedByte(1000948522);
	    anIntArrayArray2839 = new int[i_66_][2];
	    for (int i_67_ = 0; i_67_ < i_66_; i_67_++) {
		anIntArrayArray2839[i_67_][0]
		    = class525_sub38.readUnsignedByte(1325999685);
		anIntArrayArray2839[i_67_][1]
		    = class525_sub38.readUnsignedByte(2100613689);
	    }
	} else if (i == 15)
	    anInt2830 = class525_sub38.readUnsignedShort((byte) 105) * 1783825865;
	else if (i == 17)
	    anInt2840 = class525_sub38.readBigSmart(-2043778683) * 2130208029;
	else if (i == 18) {
	    int i_68_ = class525_sub38.readUnsignedByte(1601707766);
	    anIntArray2831 = new int[i_68_];
	    anIntArray2832 = new int[i_68_];
	    anIntArray2829 = new int[i_68_];
	    aStringArray2834 = new String[i_68_];
	    for (int i_69_ = 0; i_69_ < i_68_; i_69_++) {
		anIntArray2831[i_69_] = class525_sub38.readInt(977081039);
		anIntArray2832[i_69_] = class525_sub38.readInt(852203912);
		anIntArray2829[i_69_] = class525_sub38.readInt(938353496);
		aStringArray2834[i_69_]
		    = class525_sub38.readString((byte) -37);
	    }
	} else if (19 == i) {
	    int i_70_ = class525_sub38.readUnsignedByte(916148517);
	    anIntArray2827 = new int[i_70_];
	    anIntArray2826 = new int[i_70_];
	    anIntArray2836 = new int[i_70_];
	    aStringArray2838 = new String[i_70_];
	    for (int i_71_ = 0; i_71_ < i_70_; i_71_++) {
		anIntArray2827[i_71_] = class525_sub38.readInt(1316323179);
		anIntArray2826[i_71_] = class525_sub38.readInt(1368301281);
		anIntArray2836[i_71_] = class525_sub38.readInt(1843797115);
		aStringArray2838[i_71_]
		    = class525_sub38.readString((byte) -37);
	    }
	} else if (249 == i) {
	    int i_72_ = class525_sub38.readUnsignedByte(1365763333);
	    if (aClass10_2833 == null) {
		int i_73_ = Class212.method3935(i_72_, -2056250364);
		aClass10_2833 = new Class10(i_73_);
	    }
	    for (int i_74_ = 0; i_74_ < i_72_; i_74_++) {
		boolean bool = class525_sub38.readUnsignedByte(1885663248) == 1;
		int i_75_ = class525_sub38.method16834(-1994884458);
		Class525 class525;
		if (bool)
		    class525 = new Class525_Sub19(class525_sub38
						      .readString((byte) 79));
		else
		    class525
			= new Class525_Sub42(class525_sub38
						 .readInt(1972054535));
		aClass10_2833.method695(class525, (long) i_75_);
	    }
	}
    }
    
    public int method4978(int i, int i_76_) {
	if (null == aClass10_2833)
	    return i_76_;
	Class525_Sub42 class525_sub42
	    = (Class525_Sub42) aClass10_2833.method684((long) i);
	if (class525_sub42 == null)
	    return i_76_;
	return class525_sub42.anInt10858 * -1344652871;
    }
    
    public void method68(RSBuffer class525_sub38) {
	for (;;) {
	    int i = class525_sub38.readUnsignedByte(1891754809);
	    if (i == 0)
		break;
	    method4974(class525_sub38, i, -190225504);
	}
    }
    
    public String method4979(int i, String string) {
	if (null == aClass10_2833)
	    return string;
	Class525_Sub19 class525_sub19
	    = (Class525_Sub19) aClass10_2833.method684((long) i);
	if (null == class525_sub19)
	    return string;
	return (String) class525_sub19.anObject10571;
    }
    
    public void method69() {
	if (null == aString2820)
	    aString2820 = aString2819;
    }
    
    public String method4980(int i, String string) {
	if (null == aClass10_2833)
	    return string;
	Class525_Sub19 class525_sub19
	    = (Class525_Sub19) aClass10_2833.method684((long) i);
	if (null == class525_sub19)
	    return string;
	return (String) class525_sub19.anObject10571;
    }
    
    public boolean method4981(Interface18 interface18) {
	if (null != anIntArrayArray2837) {
	    for (int i = 0; i < anIntArrayArray2837.length; i++) {
		Class163 class163 = (((Interface20) interface18).method119
				     (Class453.aClass453_4939,
				      anIntArrayArray2837[i][0], -2111722530));
		if (interface18.method104(class163, 623775022)
		    >= anIntArrayArray2837[i][1])
		    return true;
	    }
	}
	if (null != anIntArrayArray2822) {
	    for (int i = 0; i < anIntArrayArray2822.length; i++) {
		Class322 class322
		    = ((Interface20) interface18)
			  .method124(anIntArrayArray2822[i][0], -171212732);
		if (interface18.method93(class322, (byte) 2)
		    >= anIntArrayArray2822[i][1])
		    return true;
	    }
	}
	return false;
    }
    
    public boolean method4982(Interface18 interface18) {
	if (null != anIntArrayArray2837) {
	    for (int i = 0; i < anIntArrayArray2837.length; i++) {
		Class163 class163 = (((Interface20) interface18).method119
				     (Class453.aClass453_4939,
				      anIntArrayArray2837[i][0], -1504766204));
		if (interface18.method104(class163, 623775022)
		    >= anIntArrayArray2837[i][1])
		    return true;
	    }
	}
	if (null != anIntArrayArray2822) {
	    for (int i = 0; i < anIntArrayArray2822.length; i++) {
		Class322 class322
		    = ((Interface20) interface18)
			  .method124(anIntArrayArray2822[i][0], 1171882834);
		if (interface18.method93(class322, (byte) 2)
		    >= anIntArrayArray2822[i][1])
		    return true;
	    }
	}
	return false;
    }
    
    public boolean method4983(Interface18 interface18) {
	if (null != anIntArrayArray2837) {
	    for (int i = 0; i < anIntArrayArray2837.length; i++) {
		Class163 class163 = (((Interface20) interface18).method119
				     (Class453.aClass453_4939,
				      anIntArrayArray2837[i][0], -1886431880));
		if (interface18.method104(class163, 623775022)
		    >= anIntArrayArray2837[i][2])
		    return true;
	    }
	}
	if (anIntArrayArray2822 != null) {
	    for (int i = 0; i < anIntArrayArray2822.length; i++) {
		Class322 class322
		    = ((Interface20) interface18)
			  .method124(anIntArrayArray2822[i][0], 1077879854);
		if (interface18.method93(class322, (byte) 2)
		    >= anIntArrayArray2822[i][2])
		    return true;
	    }
	}
	return false;
    }
    
    public boolean method4984(Interface18 interface18) {
	if (null != anIntArrayArray2837) {
	    for (int i = 0; i < anIntArrayArray2837.length; i++) {
		Class163 class163 = (((Interface20) interface18).method119
				     (Class453.aClass453_4939,
				      anIntArrayArray2837[i][0], -1562048122));
		if (interface18.method104(class163, 623775022)
		    >= anIntArrayArray2837[i][2])
		    return true;
	    }
	}
	if (anIntArrayArray2822 != null) {
	    for (int i = 0; i < anIntArrayArray2822.length; i++) {
		Class322 class322
		    = ((Interface20) interface18)
			  .method124(anIntArrayArray2822[i][0], -481208951);
		if (interface18.method93(class322, (byte) 2)
		    >= anIntArrayArray2822[i][2])
		    return true;
	    }
	}
	return false;
    }
    
    static int method4985(Interface18 interface18, Interface13 interface13) {
	int i = 0;
	for (int i_77_ = 0; i_77_ < interface13.method72(1088441896);
	     i_77_++) {
	    Class269 class269
		= (Class269) interface13.method76(i_77_, 1660207337);
	    if (class269.method4966(interface18, -2015456622))
		i += class269.anInt2823 * 1578208537;
	}
	return i;
    }
    
    public boolean method4986(Interface18 interface18) {
	if (Class93.method1728(interface18, anInterface13_2821, (byte) 93)
	    < -2090720135 * anInt2830)
	    return false;
	if (null != anIntArrayArray2839) {
	    for (int i = 0; i < anIntArrayArray2839.length; i++) {
		if (((Interface73) interface18)
			.method498(anIntArrayArray2839[i][0], (short) -9990)
		    < anIntArrayArray2839[i][1])
		    return false;
	    }
	}
	if (null != anIntArray2828) {
	    for (int i = 0; i < anIntArray2828.length; i++) {
		if (!((Class269) anInterface13_2821.method76(anIntArray2828[i],
							     2075342259))
			 .method4966(interface18, -1367708481))
		    return false;
	    }
	}
	if (anIntArray2831 != null) {
	    for (int i = 0; i < anIntArray2831.length; i++) {
		Class163 class163
		    = ((Interface20) interface18).method119((Class453
							     .aClass453_4939),
							    anIntArray2831[i],
							    -2051614202);
		int i_78_ = interface18.method104(class163, 623775022);
		if (i_78_ < anIntArray2832[i] || i_78_ > anIntArray2829[i])
		    return false;
	    }
	}
	if (null != anIntArray2827) {
	    for (int i = 0; i < anIntArray2827.length; i++) {
		Class322 class322
		    = ((Interface20) interface18).method124(anIntArray2827[i],
							    -418989619);
		int i_79_ = interface18.method93(class322, (byte) 2);
		if (i_79_ < anIntArray2826[i] || i_79_ > anIntArray2836[i])
		    return false;
	    }
	}
	return true;
    }
    
    public boolean method4987(Interface18 interface18) {
	if (Class93.method1728(interface18, anInterface13_2821, (byte) 52)
	    < -2090720135 * anInt2830)
	    return false;
	if (null != anIntArrayArray2839) {
	    for (int i = 0; i < anIntArrayArray2839.length; i++) {
		if (((Interface73) interface18)
			.method498(anIntArrayArray2839[i][0], (short) -27618)
		    < anIntArrayArray2839[i][1])
		    return false;
	    }
	}
	if (null != anIntArray2828) {
	    for (int i = 0; i < anIntArray2828.length; i++) {
		if (!((Class269) anInterface13_2821.method76(anIntArray2828[i],
							     -1522311559))
			 .method4966(interface18, -1895531172))
		    return false;
	    }
	}
	if (anIntArray2831 != null) {
	    for (int i = 0; i < anIntArray2831.length; i++) {
		Class163 class163
		    = ((Interface20) interface18).method119((Class453
							     .aClass453_4939),
							    anIntArray2831[i],
							    -937917846);
		int i_80_ = interface18.method104(class163, 623775022);
		if (i_80_ < anIntArray2832[i] || i_80_ > anIntArray2829[i])
		    return false;
	    }
	}
	if (null != anIntArray2827) {
	    for (int i = 0; i < anIntArray2827.length; i++) {
		Class322 class322
		    = ((Interface20) interface18).method124(anIntArray2827[i],
							    1642740677);
		int i_81_ = interface18.method93(class322, (byte) 2);
		if (i_81_ < anIntArray2826[i] || i_81_ > anIntArray2836[i])
		    return false;
	    }
	}
	return true;
    }
    
    public boolean method4988(Interface18 interface18) {
	if (Class93.method1728(interface18, anInterface13_2821, (byte) 18)
	    < anInt2830 * -2090720135)
	    return false;
	return true;
    }
    
    public boolean method4989(Interface18 interface18) {
	if (Class93.method1728(interface18, anInterface13_2821, (byte) -66)
	    < anInt2830 * -2090720135)
	    return false;
	return true;
    }
    
    public boolean method4990(Interface18 interface18) {
	if (Class93.method1728(interface18, anInterface13_2821, (byte) -22)
	    < anInt2830 * -2090720135)
	    return false;
	return true;
    }
    
    public boolean method4991(Interface18 interface18, int i) {
	if (null != anIntArrayArray2837) {
	    for (int i_82_ = 0; i_82_ < anIntArrayArray2837.length; i_82_++) {
		Class163 class163
		    = (((Interface20) interface18).method119
		       (Class453.aClass453_4939, anIntArrayArray2837[i_82_][0],
			-1475049780));
		if (interface18.method104(class163, 623775022)
		    >= anIntArrayArray2837[i_82_][1])
		    return true;
	    }
	}
	if (null != anIntArrayArray2822) {
	    for (int i_83_ = 0; i_83_ < anIntArrayArray2822.length; i_83_++) {
		Class322 class322
		    = (((Interface20) interface18).method124
		       (anIntArrayArray2822[i_83_][0], -770813544));
		if (interface18.method93(class322, (byte) 2)
		    >= anIntArrayArray2822[i_83_][1])
		    return true;
	    }
	}
	return false;
    }
    
    public boolean method4992(Interface18 interface18, int i) {
	if (anIntArrayArray2839 == null || i < 0
	    || i >= anIntArrayArray2839.length)
	    return false;
	if (((Interface73) interface18).method498(anIntArrayArray2839[i][0],
						  (short) -25618)
	    < anIntArrayArray2839[i][1])
	    return false;
	return true;
    }
    
    public boolean method4993(Interface18 interface18, int i) {
	if (null == anIntArray2828 || i < 0 || i >= anIntArray2828.length)
	    return false;
	if (!((Class269)
	      anInterface13_2821.method76(anIntArray2828[i], 412415244))
		 .method4966(interface18, -1085460048))
	    return false;
	return true;
    }
    
    public boolean method4994(Interface18 interface18, int i) {
	if (anIntArray2831 == null || i < 0 || i >= anIntArray2831.length)
	    return false;
	Class163 class163
	    = ((Interface20) interface18).method119(Class453.aClass453_4939,
						    anIntArray2831[i],
						    -1199955764);
	int i_84_ = interface18.method104(class163, 623775022);
	if (i_84_ < anIntArray2832[i] || i_84_ > anIntArray2829[i])
	    return false;
	return true;
    }
    
    public boolean method4995(Interface18 interface18, int i, byte i_85_) {
	if (anIntArrayArray2839 == null || i < 0
	    || i >= anIntArrayArray2839.length)
	    return false;
	if (((Interface73) interface18).method498(anIntArrayArray2839[i][0],
						  (short) -25270)
	    < anIntArrayArray2839[i][1])
	    return false;
	return true;
    }
    
    void method4996(RSBuffer class525_sub38, int i) {
	if (i == 1)
	    aString2819 = class525_sub38.method16637(1732685993);
	else if (i == 2)
	    aString2820 = class525_sub38.method16637(-666745130);
	else if (i == 3) {
	    int i_86_ = class525_sub38.readUnsignedByte(864632250);
	    anIntArrayArray2837 = new int[i_86_][3];
	    for (int i_87_ = 0; i_87_ < i_86_; i_87_++) {
		anIntArrayArray2837[i_87_][0]
		    = class525_sub38.readUnsignedShort((byte) 87);
		anIntArrayArray2837[i_87_][1]
		    = class525_sub38.readInt(1493409784);
		anIntArrayArray2837[i_87_][2]
		    = class525_sub38.readInt(2050436137);
	    }
	} else if (4 == i) {
	    int i_88_ = class525_sub38.readUnsignedByte(1602189118);
	    anIntArrayArray2822 = new int[i_88_][3];
	    for (int i_89_ = 0; i_89_ < i_88_; i_89_++) {
		anIntArrayArray2822[i_89_][0]
		    = class525_sub38.readUnsignedShort((byte) 86);
		anIntArrayArray2822[i_89_][1]
		    = class525_sub38.readInt(1019102260);
		anIntArrayArray2822[i_89_][2]
		    = class525_sub38.readInt(991165672);
	    }
	} else if (5 == i)
	    class525_sub38.readUnsignedShort((byte) 63);
	else if (i == 6)
	    anInt2818 = class525_sub38.readUnsignedByte(1827850091) * -703800217;
	else if (i == 7)
	    anInt2824 = class525_sub38.readUnsignedByte(1751349356) * 152966745;
	else if (8 == i)
	    aBool2825 = true;
	else if (9 == i)
	    anInt2823 = class525_sub38.readUnsignedByte(697386784) * -1596358871;
	else if (10 == i) {
	    int i_90_ = class525_sub38.readUnsignedByte(1661066999);
	    anIntArray2835 = new int[i_90_];
	    for (int i_91_ = 0; i_91_ < i_90_; i_91_++)
		anIntArray2835[i_91_] = class525_sub38.readInt(1001763412);
	} else if (12 == i)
	    class525_sub38.readInt(2016742574);
	else if (13 == i) {
	    int i_92_ = class525_sub38.readUnsignedByte(1760538608);
	    anIntArray2828 = new int[i_92_];
	    for (int i_93_ = 0; i_93_ < i_92_; i_93_++)
		anIntArray2828[i_93_] = class525_sub38.readUnsignedShort((byte) 118);
	} else if (14 == i) {
	    int i_94_ = class525_sub38.readUnsignedByte(2131505275);
	    anIntArrayArray2839 = new int[i_94_][2];
	    for (int i_95_ = 0; i_95_ < i_94_; i_95_++) {
		anIntArrayArray2839[i_95_][0]
		    = class525_sub38.readUnsignedByte(1160956227);
		anIntArrayArray2839[i_95_][1]
		    = class525_sub38.readUnsignedByte(-6210576);
	    }
	} else if (i == 15)
	    anInt2830 = class525_sub38.readUnsignedShort((byte) 97) * 1783825865;
	else if (i == 17)
	    anInt2840 = class525_sub38.readBigSmart(-2043778683) * 2130208029;
	else if (i == 18) {
	    int i_96_ = class525_sub38.readUnsignedByte(1063857727);
	    anIntArray2831 = new int[i_96_];
	    anIntArray2832 = new int[i_96_];
	    anIntArray2829 = new int[i_96_];
	    aStringArray2834 = new String[i_96_];
	    for (int i_97_ = 0; i_97_ < i_96_; i_97_++) {
		anIntArray2831[i_97_] = class525_sub38.readInt(1994446839);
		anIntArray2832[i_97_] = class525_sub38.readInt(874156037);
		anIntArray2829[i_97_] = class525_sub38.readInt(1203978778);
		aStringArray2834[i_97_]
		    = class525_sub38.readString((byte) -24);
	    }
	} else if (19 == i) {
	    int i_98_ = class525_sub38.readUnsignedByte(1582525621);
	    anIntArray2827 = new int[i_98_];
	    anIntArray2826 = new int[i_98_];
	    anIntArray2836 = new int[i_98_];
	    aStringArray2838 = new String[i_98_];
	    for (int i_99_ = 0; i_99_ < i_98_; i_99_++) {
		anIntArray2827[i_99_] = class525_sub38.readInt(1422050577);
		anIntArray2826[i_99_] = class525_sub38.readInt(850488739);
		anIntArray2836[i_99_] = class525_sub38.readInt(2013908772);
		aStringArray2838[i_99_]
		    = class525_sub38.readString((byte) 41);
	    }
	} else if (249 == i) {
	    int i_100_ = class525_sub38.readUnsignedByte(1513177123);
	    if (aClass10_2833 == null) {
		int i_101_ = Class212.method3935(i_100_, -2056250364);
		aClass10_2833 = new Class10(i_101_);
	    }
	    for (int i_102_ = 0; i_102_ < i_100_; i_102_++) {
		boolean bool = class525_sub38.readUnsignedByte(1597953451) == 1;
		int i_103_ = class525_sub38.method16834(-1994884458);
		Class525 class525;
		if (bool)
		    class525 = new Class525_Sub19(class525_sub38
						      .readString((byte) 51));
		else
		    class525
			= new Class525_Sub42(class525_sub38
						 .readInt(1843316675));
		aClass10_2833.method695(class525, (long) i_103_);
	    }
	}
    }
    
    public boolean method4997(Interface18 interface18, int i) {
	if (null == anIntArray2827 || i < 0 || i >= anIntArray2827.length)
	    return false;
	Class322 class322
	    = ((Interface20) interface18).method124(anIntArray2827[i],
						    1989318948);
	int i_104_ = interface18.method93(class322, (byte) 2);
	if (i_104_ < anIntArray2826[i] || i_104_ > anIntArray2836[i])
	    return false;
	return true;
    }
    
    static final void method4998(Class683 class683, byte i) {
	int i_105_ = (class683.anIntArray8661
		      [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_105_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_105_ >> 16];
	Class234.method4399(class259, class245, class683, 695019619);
    }
    
    public static final void method4999(int i, int i_106_, int i_107_,
					int i_108_, int i_109_, boolean bool,
					byte i_110_) {
	Class50.anInt376 = i * -833230687;
	Class695.anInt8758 = i_106_ * 446037575;
	Class25.anInt246 = -1032011443 * i_107_;
	Class686.anInt8704 = i_108_ * -219174413;
	Class239.anInt2411 = 1145046647 * i_109_;
	if (5 == -174799205 * Class700.anInt8779)
	    Class291.method5280((byte) 26);
	if (bool && -380652729 * Class239.anInt2411 >= 100) {
	    Class477.anInt5200 = 1489439232 * Class50.anInt376 + 1142859008;
	    Class475.anInt5179 = 2056113920 + 388002304 * Class695.anInt8758;
	    Class575.anInt7648
		= (Class335.method5855(-469853907 * Class477.anInt5200,
				       Class475.anInt5179 * -1889707729,
				       -1335910809 * Class677.anInt8619,
				       2020563229)
		   - Class25.anInt246 * 356802437) * -1332233853;
	}
	Class700.anInt8779 = 668995257;
	Class648.anInt8363 = -1945230309;
	Class198_Sub3.anInt9911 = 56698409;
    }
    
    static final void method5000(Class683 class683, int i) {
	class683.anInt8662 -= 1552651121;
	int i_111_ = class683.anIntArray8661[501271953 * class683.anInt8662];
	Class525_Sub33 class525_sub33
	    = (Class525_Sub33) client.aClass10_11261.method684((long) i_111_);
	if (class525_sub33 != null
	    && -271654987 * class525_sub33.anInt10746 == 3)
	    Class708.method14341(class525_sub33, true, true, 421513891);
    }
    
    public static int method5001(short i) {
	return 269852537 * Class281.anInt3004 - 1;
    }
}
