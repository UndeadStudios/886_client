/* Class630 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class630
{
    public Interface66 anInterface66_8163;
    static int anInt8164;
    
    public Class630(Class458 class458) {
	byte[] is = class458.method7484((Class638.aClass638_8310.anInt8316
					 * 2028004077),
					1529951282);
	if (is != null)
	    method10307(new RSBuffer(is), 726840575);
    }
    
    void method10307(RSBuffer class525_sub38, int i) {
	for (;;) {
	    int i_0_ = class525_sub38.readUnsignedByte(604036819);
	    if (0 == i_0_)
		break;
	    if (i_0_ == 1)
		anInterface66_8163
		    = Class305.method5423(class525_sub38, 1319461885);
	}
    }
    
    void method10308(RSBuffer class525_sub38) {
	for (;;) {
	    int i = class525_sub38.readUnsignedByte(659311123);
	    if (0 == i)
		break;
	    if (i == 1)
		anInterface66_8163
		    = Class305.method5423(class525_sub38, -162827920);
	}
    }
    
    static final void method10309(Class259 class259, Class245 class245,
				  Class683 class683, byte i) {
	class683.anInt8662 -= 362986067;
	int i_1_ = class683.anIntArray8661[class683.anInt8662 * 501271953];
	short i_2_ = (short) (class683.anIntArray8661
			      [1 + class683.anInt8662 * 501271953]);
	short i_3_ = (short) (class683.anIntArray8661
			      [class683.anInt8662 * 501271953 + 2]);
	if (i_1_ >= 0 && i_1_ < 5) {
	    class259.method4696(i_1_, i_2_, i_3_, (byte) 85);
	    Class649.method10708(class259, (byte) 0);
	    if (-1 == 1534974651 * class259.anInt2576 && !class245.aBool2428)
		Class88.method1667(class259.anInt2588 * 1984678839, i_1_,
				   (byte) 9);
	}
    }
    
    static final void method10310(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class601.method9901(class259, class245, class683,
			    Class238.aClass238_2402, (byte) 9);
    }
    
    static Class656_Sub1_Sub3_Sub1 method10311(int i, int i_4_, int i_5_,
					       int i_6_) {
	Class547 class547 = (client.aClass507_11137.method8358((byte) 121)
			     .aClass547ArrayArrayArray7263[i][i_4_][i_5_]);
	if (null == class547)
	    return null;
	Class656_Sub1_Sub3_Sub1 class656_sub1_sub3_sub1 = null;
	int i_7_ = -1;
	for (Class560 class560 = class547.aClass560_7272; null != class560;
	     class560 = class560.aClass560_7546) {
	    Class656_Sub1_Sub3 class656_sub1_sub3
		= class560.aClass656_Sub1_Sub3_7547;
	    if (class656_sub1_sub3 instanceof Class656_Sub1_Sub3_Sub1) {
		Class656_Sub1_Sub3_Sub1 class656_sub1_sub3_sub1_8_
		    = (Class656_Sub1_Sub3_Sub1) class656_sub1_sub3;
		int i_9_ = ((class656_sub1_sub3_sub1_8_.method18608((byte) 75)
			     - 1) * 256
			    + 252);
		Class446 class446
		    = class656_sub1_sub3_sub1_8_.method10818().aClass446_4807;
		int i_10_ = (int) class446.aFloat4895 - i_9_ >> 9;
		int i_11_ = (int) class446.aFloat4897 - i_9_ >> 9;
		int i_12_ = (int) class446.aFloat4895 + i_9_ >> 9;
		int i_13_ = (int) class446.aFloat4897 + i_9_ >> 9;
		if (i_10_ <= i_4_ && i_11_ <= i_5_ && i_12_ >= i_4_
		    && i_13_ >= i_5_) {
		    int i_14_ = (1 + i_12_ - i_4_) * (1 + i_13_ - i_5_);
		    if (i_14_ > i_7_) {
			class656_sub1_sub3_sub1 = class656_sub1_sub3_sub1_8_;
			i_7_ = i_14_;
		    }
		}
	    }
	}
	return class656_sub1_sub3_sub1;
    }
    
    static void method10312(int i, int i_15_, int i_16_) {
	Class322 class322
	    = (Class322) Class575.aClass40_Sub10_7647.method76(i, 208474960);
	Class525_Sub16_Sub10 class525_sub16_sub10
	    = Class465.method7671(1,
				  (long) (248546353 * (class322.aClass163_3544
						       .anInt1766)));
	try {
	    if (Class525_Sub16_Sub10.aBool11825)
		class525_sub16_sub10.anInt11817
		    = (Class309.aClass144_Sub1_3465
			   .method104(class322.aClass163_3544, 623775022)
		       * -1179952119);
	    class525_sub16_sub10.anInt11817
		= class322.method5721((1931014713
				       * class525_sub16_sub10.anInt11817),
				      i_15_, 2051086609) * -1179952119;
	    class525_sub16_sub10.method18361((byte) 53);
	} catch (Exception_Sub6 exception_sub6) {
	    Class525_Sub16_Sub13.method18448(new StringBuilder().append("")
						 .append
						 (i).toString(),
					     exception_sub6, (byte) 32);
	}
    }
}
