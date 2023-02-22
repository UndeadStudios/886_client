/* Class332_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class332_Sub1 extends Class332
{
    Class157 aClass157_10004;
    Class157 aClass157_10005;
    Class157 aClass157_10006;
    Class157 aClass157_10007;
    Class157 aClass157_10008;
    Class157 aClass157_10009;
    static long aLong10010;
    
    public void method70() {
	super.method211(857072231);
	Class390_Sub1 class390_sub1 = (Class390_Sub1) aClass390_3598;
	aClass157_10009
	    = Class108.method1933(aClass458_3597,
				  class390_sub1.anInt10193 * -1923500339,
				  65280);
	aClass157_10005
	    = Class108.method1933(aClass458_3597,
				  47239433 * class390_sub1.anInt10194, 65280);
	aClass157_10006
	    = Class108.method1933(aClass458_3597,
				  class390_sub1.anInt10195 * -1307997095,
				  65280);
	aClass157_10004
	    = Class108.method1933(aClass458_3597,
				  class390_sub1.anInt10196 * -1649676655,
				  65280);
	aClass157_10008
	    = Class108.method1933(aClass458_3597,
				  class390_sub1.anInt10197 * 621080955, 65280);
	aClass157_10007
	    = Class108.method1933(aClass458_3597,
				  class390_sub1.anInt10198 * -1185025401,
				  65280);
    }
    
    public void method211(int i) {
	super.method211(857072231);
	Class390_Sub1 class390_sub1 = (Class390_Sub1) aClass390_3598;
	aClass157_10009
	    = Class108.method1933(aClass458_3597,
				  class390_sub1.anInt10193 * -1923500339,
				  65280);
	aClass157_10005
	    = Class108.method1933(aClass458_3597,
				  47239433 * class390_sub1.anInt10194, 65280);
	aClass157_10006
	    = Class108.method1933(aClass458_3597,
				  class390_sub1.anInt10195 * -1307997095,
				  65280);
	aClass157_10004
	    = Class108.method1933(aClass458_3597,
				  class390_sub1.anInt10196 * -1649676655,
				  65280);
	aClass157_10008
	    = Class108.method1933(aClass458_3597,
				  class390_sub1.anInt10197 * 621080955, 65280);
	aClass157_10007
	    = Class108.method1933(aClass458_3597,
				  class390_sub1.anInt10198 * -1185025401,
				  65280);
    }
    
    void method5810(boolean bool, int i, int i_0_, int i_1_) {
	if (bool) {
	    int[] is = new int[4];
	    Class501.aClass182_5564.method3187(is);
	    Class501.aClass182_5564.method3184
		(i, i_0_, i + 1827301945 * aClass390_3598.anInt4065,
		 i_0_ + -797820993 * aClass390_3598.anInt4066);
	    int i_2_ = aClass157_10006.method12();
	    int i_3_ = aClass157_10006.method2472();
	    int i_4_ = aClass157_10004.method12();
	    int i_5_ = aClass157_10004.method2472();
	    aClass157_10006.method2518(i, i_0_ + ((aClass390_3598.anInt4066
						   * -797820993)
						  - i_3_) / 2);
	    aClass157_10004.method2518
		(i + 1827301945 * aClass390_3598.anInt4065 - i_4_,
		 i_0_ + (-797820993 * aClass390_3598.anInt4066 - i_5_) / 2);
	    Class501.aClass182_5564.method3184
		(i, i_0_, 1827301945 * aClass390_3598.anInt4065 + i,
		 i_0_ + aClass157_10008.method2472());
	    aClass157_10008.method2478(i_2_ + i, i_0_,
				       (1827301945 * aClass390_3598.anInt4065
					- i_2_ - i_4_),
				       aClass390_3598.anInt4066 * -797820993);
	    int i_6_ = aClass157_10007.method2472();
	    Class501.aClass182_5564.method3184
		(i, aClass390_3598.anInt4066 * -797820993 + i_0_ - i_6_,
		 i + 1827301945 * aClass390_3598.anInt4065,
		 i_0_ + -797820993 * aClass390_3598.anInt4066);
	    aClass157_10007.method2478(i + i_2_,
				       (aClass390_3598.anInt4066 * -797820993
					+ i_0_ - i_6_),
				       (aClass390_3598.anInt4065 * 1827301945
					- i_2_ - i_4_),
				       -797820993 * aClass390_3598.anInt4066);
	    Class501.aClass182_5564.method3184(is[0], is[1], is[2], is[3]);
	}
    }
    
    void method5818(boolean bool, int i, int i_7_) {
	int i_8_ = i + aClass157_10006.method12();
	int i_9_ = (1827301945 * aClass390_3598.anInt4065 + i
		    - aClass157_10004.method12());
	int i_10_ = i_7_ + aClass157_10008.method2472();
	int i_11_ = (aClass390_3598.anInt4066 * -797820993 + i_7_
		     - aClass157_10007.method2472());
	int i_12_ = i_9_ - i_8_;
	int i_13_ = i_11_ - i_10_;
	int i_14_ = method5815((byte) -22) * i_12_ / 10000;
	int[] is = new int[4];
	Class501.aClass182_5564.method3187(is);
	Class501.aClass182_5564.method3184(i_8_, i_10_, i_14_ + i_8_, i_11_);
	method15664(i_8_, i_10_, i_12_, i_13_, -1980907460);
	Class501.aClass182_5564.method3184(i_8_ + i_14_, i_10_, i_9_, i_11_);
	aClass157_10005.method2478(i_8_, i_10_, i_12_, i_13_);
	Class501.aClass182_5564.method3184(is[0], is[1], is[2], is[3]);
    }
    
    void method15664(int i, int i_15_, int i_16_, int i_17_, int i_18_) {
	aClass157_10009.method2478(i, i_15_, i_16_, i_17_);
    }
    
    public boolean method213(int i) {
	if (!super.method213(2061547021))
	    return false;
	Class390_Sub1 class390_sub1 = (Class390_Sub1) aClass390_3598;
	if (!aClass458_3597.method7506(class390_sub1.anInt10193 * -1923500339,
				       294062446))
	    return false;
	if (!aClass458_3597.method7506(class390_sub1.anInt10194 * 47239433,
				       -887960482))
	    return false;
	if (!aClass458_3597.method7506(class390_sub1.anInt10195 * -1307997095,
				       -1608387801))
	    return false;
	if (!aClass458_3597.method7506(-1649676655 * class390_sub1.anInt10196,
				       1225952888))
	    return false;
	if (!aClass458_3597.method7506(class390_sub1.anInt10197 * 621080955,
				       -1473970723))
	    return false;
	if (!aClass458_3597.method7506(-1185025401 * class390_sub1.anInt10198,
				       770614267))
	    return false;
	return true;
    }
    
    void method15665(int i, int i_19_, int i_20_, int i_21_) {
	aClass157_10009.method2478(i, i_19_, i_20_, i_21_);
    }
    
    public boolean method210() {
	if (!super.method213(2061547021))
	    return false;
	Class390_Sub1 class390_sub1 = (Class390_Sub1) aClass390_3598;
	if (!aClass458_3597.method7506(class390_sub1.anInt10193 * -1923500339,
				       -1474285468))
	    return false;
	if (!aClass458_3597.method7506(class390_sub1.anInt10194 * 47239433,
				       401345302))
	    return false;
	if (!aClass458_3597.method7506(class390_sub1.anInt10195 * -1307997095,
				       501979864))
	    return false;
	if (!aClass458_3597.method7506(-1649676655 * class390_sub1.anInt10196,
				       -887581559))
	    return false;
	if (!aClass458_3597.method7506(class390_sub1.anInt10197 * 621080955,
				       -1697153416))
	    return false;
	if (!aClass458_3597.method7506(-1185025401 * class390_sub1.anInt10198,
				       -2003216385))
	    return false;
	return true;
    }
    
    void method5813(boolean bool, int i, int i_22_) {
	if (bool) {
	    int[] is = new int[4];
	    Class501.aClass182_5564.method3187(is);
	    Class501.aClass182_5564.method3184
		(i, i_22_, i + 1827301945 * aClass390_3598.anInt4065,
		 i_22_ + -797820993 * aClass390_3598.anInt4066);
	    int i_23_ = aClass157_10006.method12();
	    int i_24_ = aClass157_10006.method2472();
	    int i_25_ = aClass157_10004.method12();
	    int i_26_ = aClass157_10004.method2472();
	    aClass157_10006.method2518(i, i_22_ + ((aClass390_3598.anInt4066
						    * -797820993)
						   - i_24_) / 2);
	    aClass157_10004.method2518
		(i + 1827301945 * aClass390_3598.anInt4065 - i_25_,
		 i_22_ + (-797820993 * aClass390_3598.anInt4066 - i_26_) / 2);
	    Class501.aClass182_5564.method3184
		(i, i_22_, 1827301945 * aClass390_3598.anInt4065 + i,
		 i_22_ + aClass157_10008.method2472());
	    aClass157_10008.method2478(i_23_ + i, i_22_,
				       (1827301945 * aClass390_3598.anInt4065
					- i_23_ - i_25_),
				       aClass390_3598.anInt4066 * -797820993);
	    int i_27_ = aClass157_10007.method2472();
	    Class501.aClass182_5564.method3184
		(i, aClass390_3598.anInt4066 * -797820993 + i_22_ - i_27_,
		 i + 1827301945 * aClass390_3598.anInt4065,
		 i_22_ + -797820993 * aClass390_3598.anInt4066);
	    aClass157_10007.method2478(i + i_23_,
				       (aClass390_3598.anInt4066 * -797820993
					+ i_22_ - i_27_),
				       (aClass390_3598.anInt4065 * 1827301945
					- i_23_ - i_25_),
				       -797820993 * aClass390_3598.anInt4066);
	    Class501.aClass182_5564.method3184(is[0], is[1], is[2], is[3]);
	}
    }
    
    void method5814(boolean bool, int i, int i_28_) {
	if (bool) {
	    int[] is = new int[4];
	    Class501.aClass182_5564.method3187(is);
	    Class501.aClass182_5564.method3184
		(i, i_28_, i + 1827301945 * aClass390_3598.anInt4065,
		 i_28_ + -797820993 * aClass390_3598.anInt4066);
	    int i_29_ = aClass157_10006.method12();
	    int i_30_ = aClass157_10006.method2472();
	    int i_31_ = aClass157_10004.method12();
	    int i_32_ = aClass157_10004.method2472();
	    aClass157_10006.method2518(i, i_28_ + ((aClass390_3598.anInt4066
						    * -797820993)
						   - i_30_) / 2);
	    aClass157_10004.method2518
		(i + 1827301945 * aClass390_3598.anInt4065 - i_31_,
		 i_28_ + (-797820993 * aClass390_3598.anInt4066 - i_32_) / 2);
	    Class501.aClass182_5564.method3184
		(i, i_28_, 1827301945 * aClass390_3598.anInt4065 + i,
		 i_28_ + aClass157_10008.method2472());
	    aClass157_10008.method2478(i_29_ + i, i_28_,
				       (1827301945 * aClass390_3598.anInt4065
					- i_29_ - i_31_),
				       aClass390_3598.anInt4066 * -797820993);
	    int i_33_ = aClass157_10007.method2472();
	    Class501.aClass182_5564.method3184
		(i, aClass390_3598.anInt4066 * -797820993 + i_28_ - i_33_,
		 i + 1827301945 * aClass390_3598.anInt4065,
		 i_28_ + -797820993 * aClass390_3598.anInt4066);
	    aClass157_10007.method2478(i + i_29_,
				       (aClass390_3598.anInt4066 * -797820993
					+ i_28_ - i_33_),
				       (aClass390_3598.anInt4065 * 1827301945
					- i_29_ - i_31_),
				       -797820993 * aClass390_3598.anInt4066);
	    Class501.aClass182_5564.method3184(is[0], is[1], is[2], is[3]);
	}
    }
    
    void method15666(int i, int i_34_, int i_35_, int i_36_) {
	aClass157_10009.method2478(i, i_34_, i_35_, i_36_);
    }
    
    void method5812(boolean bool, int i, int i_37_) {
	if (bool) {
	    int[] is = new int[4];
	    Class501.aClass182_5564.method3187(is);
	    Class501.aClass182_5564.method3184
		(i, i_37_, i + 1827301945 * aClass390_3598.anInt4065,
		 i_37_ + -797820993 * aClass390_3598.anInt4066);
	    int i_38_ = aClass157_10006.method12();
	    int i_39_ = aClass157_10006.method2472();
	    int i_40_ = aClass157_10004.method12();
	    int i_41_ = aClass157_10004.method2472();
	    aClass157_10006.method2518(i, i_37_ + ((aClass390_3598.anInt4066
						    * -797820993)
						   - i_39_) / 2);
	    aClass157_10004.method2518
		(i + 1827301945 * aClass390_3598.anInt4065 - i_40_,
		 i_37_ + (-797820993 * aClass390_3598.anInt4066 - i_41_) / 2);
	    Class501.aClass182_5564.method3184
		(i, i_37_, 1827301945 * aClass390_3598.anInt4065 + i,
		 i_37_ + aClass157_10008.method2472());
	    aClass157_10008.method2478(i_38_ + i, i_37_,
				       (1827301945 * aClass390_3598.anInt4065
					- i_38_ - i_40_),
				       aClass390_3598.anInt4066 * -797820993);
	    int i_42_ = aClass157_10007.method2472();
	    Class501.aClass182_5564.method3184
		(i, aClass390_3598.anInt4066 * -797820993 + i_37_ - i_42_,
		 i + 1827301945 * aClass390_3598.anInt4065,
		 i_37_ + -797820993 * aClass390_3598.anInt4066);
	    aClass157_10007.method2478(i + i_38_,
				       (aClass390_3598.anInt4066 * -797820993
					+ i_37_ - i_42_),
				       (aClass390_3598.anInt4065 * 1827301945
					- i_38_ - i_40_),
				       -797820993 * aClass390_3598.anInt4066);
	    Class501.aClass182_5564.method3184(is[0], is[1], is[2], is[3]);
	}
    }
    
    void method15667(int i, int i_43_, int i_44_, int i_45_) {
	aClass157_10009.method2478(i, i_43_, i_44_, i_45_);
    }
    
    void method15668(int i, int i_46_, int i_47_, int i_48_) {
	aClass157_10009.method2478(i, i_46_, i_47_, i_48_);
    }
    
    void method5811(boolean bool, int i, int i_49_, int i_50_) {
	int i_51_ = i + aClass157_10006.method12();
	int i_52_ = (1827301945 * aClass390_3598.anInt4065 + i
		     - aClass157_10004.method12());
	int i_53_ = i_49_ + aClass157_10008.method2472();
	int i_54_ = (aClass390_3598.anInt4066 * -797820993 + i_49_
		     - aClass157_10007.method2472());
	int i_55_ = i_52_ - i_51_;
	int i_56_ = i_54_ - i_53_;
	int i_57_ = method5815((byte) -55) * i_55_ / 10000;
	int[] is = new int[4];
	Class501.aClass182_5564.method3187(is);
	Class501.aClass182_5564.method3184(i_51_, i_53_, i_57_ + i_51_, i_54_);
	method15664(i_51_, i_53_, i_55_, i_56_, -2095157152);
	Class501.aClass182_5564.method3184(i_51_ + i_57_, i_53_, i_52_, i_54_);
	aClass157_10005.method2478(i_51_, i_53_, i_55_, i_56_);
	Class501.aClass182_5564.method3184(is[0], is[1], is[2], is[3]);
    }
    
    void method15669(int i, int i_58_, int i_59_, int i_60_) {
	aClass157_10009.method2478(i, i_58_, i_59_, i_60_);
    }
    
    Class332_Sub1(JS5 class458, JS5 class458_61_,
                  Class390_Sub1 class390_sub1) {
	super(class458, class458_61_, (Class390) class390_sub1);
    }
    
    void method15670(int i, int i_62_, int i_63_, int i_64_) {
	aClass157_10009.method2478(i, i_62_, i_63_, i_64_);
    }
    
    void method15671(int i, int i_65_, int i_66_, int i_67_) {
	aClass157_10009.method2478(i, i_65_, i_66_, i_67_);
    }
    
    public static void method15672(int i, int i_68_, int i_69_, boolean bool,
				   byte i_70_) {
	client.aLong11219 = 0L;
	int i_71_ = Class441.method7120((byte) -88);
	if (i == 3 || i_71_ == 3)
	    bool = true;
	if (!Class501.aClass182_5564.method3258())
	    bool = true;
	Class50.method1130(i_71_, i, i_68_, i_69_, bool, (byte) -117);
    }
    
    static void method15673(Class259 class259, byte i) {
	if (class259.anInt2590 * 2010235789 == 5
	    && 372293357 * class259.anInt2740 != -1)
	    Class432.method6908(Class501.aClass182_5564, class259,
				(short) 128);
    }
    
    static final void method15674(Class259 class259, Class683 class683,
				  int i) {
	if (class683.anInt8659 * -2063059969 >= 10)
	    throw new RuntimeException();
	if (null != class259.anObjectArray2609) {
	    Class525_Sub32 class525_sub32 = new Class525_Sub32();
	    class525_sub32.aClass259_10736 = class259;
	    class525_sub32.anObjectArray10740 = class259.anObjectArray2609;
	    class525_sub32.anInt10744
		= -143352767 + class683.anInt8659 * 1599117247;
	    client.aClass709_11079.method14345(class525_sub32, (byte) 0);
	}
    }
}
