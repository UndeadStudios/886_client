/* Class267 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class267 implements Interface5
{
    Class200 aClass200_2815;
    Class458 aClass458_2816;
    
    Class267(Class458 class458, int i) {
	aClass458_2816 = class458;
	aClass200_2815 = new Class200(i);
    }
    
    static final void method4947(Class525_Sub38_Sub2 class525_sub38_sub2,
				 int i) {
	int i_0_ = 0;
	class525_sub38_sub2.method18495(-1168175848);
	for (int i_1_ = 0; i_1_ < Class104.anInt1284 * 692634081; i_1_++) {
	    int i_2_ = Class104.anIntArray1285[i_1_];
	    if ((Class104.aByteArray1280[i_2_] & 0x1) == 0) {
		if (i_0_ > 0) {
		    i_0_--;
		    Class104.aByteArray1280[i_2_] |= 0x2;
		} else {
		    int i_3_ = class525_sub38_sub2.method18496(1, 578733530);
		    if (i_3_ == 0) {
			i_0_ = Class178.method2912(class525_sub38_sub2,
						   -1439995398);
			Class104.aByteArray1280[i_2_] |= 0x2;
		    } else
			Class300.method5399(class525_sub38_sub2, i_2_,
					    (byte) -70);
		}
	    }
	}
	class525_sub38_sub2.method18497(-2061790185);
	if (0 != i_0_)
	    throw new RuntimeException();
	class525_sub38_sub2.method18495(-789400692);
	for (int i_4_ = 0; i_4_ < Class104.anInt1284 * 692634081; i_4_++) {
	    int i_5_ = Class104.anIntArray1285[i_4_];
	    if (0 != (Class104.aByteArray1280[i_5_] & 0x1)) {
		if (i_0_ > 0) {
		    i_0_--;
		    Class104.aByteArray1280[i_5_] |= 0x2;
		} else {
		    int i_6_ = class525_sub38_sub2.method18496(1, 578733530);
		    if (i_6_ == 0) {
			i_0_ = Class178.method2912(class525_sub38_sub2,
						   1630835309);
			Class104.aByteArray1280[i_5_] |= 0x2;
		    } else
			Class300.method5399(class525_sub38_sub2, i_5_,
					    (byte) -52);
		}
	    }
	}
	class525_sub38_sub2.method18497(-2061790185);
	if (0 != i_0_)
	    throw new RuntimeException();
	class525_sub38_sub2.method18495(-1184625788);
	for (int i_7_ = 0; i_7_ < Class104.anInt1286 * 505464439; i_7_++) {
	    int i_8_ = Class104.anIntArray1288[i_7_];
	    if (0 != (Class104.aByteArray1280[i_8_] & 0x1)) {
		if (i_0_ > 0) {
		    i_0_--;
		    Class104.aByteArray1280[i_8_] |= 0x2;
		} else {
		    int i_9_ = class525_sub38_sub2.method18496(1, 578733530);
		    if (i_9_ == 0) {
			i_0_ = Class178.method2912(class525_sub38_sub2,
						   -846236472);
			Class104.aByteArray1280[i_8_] |= 0x2;
		    } else if (Class594.method9832(class525_sub38_sub2, i_8_,
						   -755284624))
			Class104.aByteArray1280[i_8_] |= 0x2;
		}
	    }
	}
	class525_sub38_sub2.method18497(-2061790185);
	if (0 != i_0_)
	    throw new RuntimeException();
	class525_sub38_sub2.method18495(83547671);
	for (int i_10_ = 0; i_10_ < Class104.anInt1286 * 505464439; i_10_++) {
	    int i_11_ = Class104.anIntArray1288[i_10_];
	    if (0 == (Class104.aByteArray1280[i_11_] & 0x1)) {
		if (i_0_ > 0) {
		    i_0_--;
		    Class104.aByteArray1280[i_11_] |= 0x2;
		} else {
		    int i_12_ = class525_sub38_sub2.method18496(1, 578733530);
		    if (0 == i_12_) {
			i_0_ = Class178.method2912(class525_sub38_sub2,
						   1267932100);
			Class104.aByteArray1280[i_11_] |= 0x2;
		    } else if (Class594.method9832(class525_sub38_sub2, i_11_,
						   1660505258))
			Class104.aByteArray1280[i_11_] |= 0x2;
		}
	    }
	}
	class525_sub38_sub2.method18497(-2061790185);
	if (i_0_ != 0)
	    throw new RuntimeException();
	Class104.anInt1284 = 0;
	Class104.anInt1286 = 0;
	for (int i_13_ = 1; i_13_ < 2048; i_13_++) {
	    Class104.aByteArray1280[i_13_] >>= 1;
	    Class656_Sub1_Sub3_Sub1_Sub1 class656_sub1_sub3_sub1_sub1
		= client.aClass656_Sub1_Sub3_Sub1_Sub1Array11384[i_13_];
	    if (class656_sub1_sub3_sub1_sub1 != null)
		Class104.anIntArray1285
		    [(Class104.anInt1284 += 1711489569) * 692634081 - 1]
		    = i_13_;
	    else
		Class104.anIntArray1288
		    [(Class104.anInt1286 += 254473031) * 505464439 - 1]
		    = i_13_;
	}
    }
    
    static void method4948(Class259 class259, int i, int i_14_, int i_15_) {
	Class246 class246
	    = class259.method4692(Class501.aClass182_5564, -1848823148);
	if (class246 != null) {
	    Class501.aClass182_5564.method3184
		(i, i_14_, class259.anInt2602 * -1694810043 + i,
		 2054207119 * class259.anInt2598 + i_14_);
	    if (1806053763 * Class98.anInt1205 < 3) {
		int i_16_;
		if (-174799205 * Class700.anInt8779 == 5)
		    i_16_ = (int) -((double) Class453_Sub3
						 .aClass309_Sub1_10316
						 .method5491((byte) 0)
				    * 2607.5945876176133);
		else
		    i_16_ = (int) -client.aFloat11052;
		i_16_ = client.anInt11059 * 447093166 + i_16_ & 0x3fff;
		i_16_ <<= 2;
		Class279.aClass157_2994.method2490
		    (((float) i
		      + (float) (class259.anInt2602 * -1694810043) / 2.0F),
		     ((float) i_14_
		      + (float) (class259.anInt2598 * 2054207119) / 2.0F),
		     4501, i_16_, class246.aClass152_2433, i, i_14_);
	    } else
		Class501.aClass182_5564
		    .method3328(-16777216, class246.aClass152_2433, i, i_14_);
	}
    }
    
    static final void method4949(Class683 class683, int i) {
	class683.anInt8662 -= -1189665054;
	Class438.method7109((class683.anIntArray8661
			     [class683.anInt8662 * 501271953]),
			    (class683.anIntArray8661
			     [1 + class683.anInt8662 * 501271953]),
			    0, 1115781230);
    }
    
    static final void method4950(Class683 class683, int i) {
	int i_17_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = (((Class194)
		Class685.aClass40_Sub8_8691.method76(i_17_, -692232881))
	       .anInt2157) * -1090465317;
    }
}
