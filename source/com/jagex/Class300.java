/* Class300 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class300 implements Interface76
{
    static Class300 aClass300_3359;
    static Class300 aClass300_3360;
    static Class300 aClass300_3361 = new Class300(0);
    static Class300 aClass300_3362;
    int anInt3363;
    
    public int method75() {
	return 902553083 * anInt3363;
    }
    
    public int method80() {
	return 902553083 * anInt3363;
    }
    
    static {
	aClass300_3360 = new Class300(1);
	aClass300_3362 = new Class300(2);
	aClass300_3359 = new Class300(3);
    }
    
    public int method57() {
	return 902553083 * anInt3363;
    }
    
    Class300(int i) {
	anInt3363 = i * -1510955725;
    }
    
    static final void method5395(Class683 class683, int i) {
	class683.anInt8662 -= 1915637188;
	int i_0_ = class683.anIntArray8661[501271953 * class683.anInt8662];
	int i_1_ = class683.anIntArray8661[1 + 501271953 * class683.anInt8662];
	int i_2_ = class683.anIntArray8661[2 + 501271953 * class683.anInt8662];
	int i_3_ = class683.anIntArray8661[class683.anInt8662 * 501271953 + 3];
	Class600 class600 = client.aClass507_11137.method8350(1484945702);
	Class269.method4999(((i_0_ >> 14 & 0x3fff)
			     - -1227002079 * class600.anInt7858),
			    (i_0_ & 0x3fff) - 1429253007 * class600.anInt7860,
			    i_1_ << 2, i_2_, i_3_, false, (byte) 8);
	client.aBool11364 = true;
    }
    
    static final void method5396(Class683 class683, int i) {
	class683.anInt8662 -= -1189665054;
	int i_4_ = class683.anIntArray8661[class683.anInt8662 * 501271953];
	int i_5_ = class683.anIntArray8661[501271953 * class683.anInt8662 + 1];
	Class584.method9644(1, i_4_, i_5_, "", 1293097089);
    }
    
    static final void method5397(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = 855530469 * class259.anInt2618;
    }
    
    public static Class302 method5398(int i, short i_6_) {
	if (i == Class302.aClass302_3379.anInt3375 * -1021736389)
	    return Class302.aClass302_3379;
	if (Class302.aClass302_3376.anInt3375 * -1021736389 == i)
	    return Class302.aClass302_3376;
	if (i == Class302.aClass302_3378.anInt3375 * -1021736389)
	    return Class302.aClass302_3378;
	return null;
    }
    
    static void method5399(Class525_Sub38_Sub2 class525_sub38_sub2, int i,
			   byte i_7_) {
	Class600 class600 = client.aClass507_11137.method8350(1349136435);
	boolean bool = class525_sub38_sub2.method18496(1, 578733530) == 1;
	if (bool)
	    Class104.anIntArray1278
		[(Class104.anInt1289 += -812984013) * -799225349 - 1]
		= i;
	int i_8_ = class525_sub38_sub2.method18496(2, 578733530);
	Class656_Sub1_Sub3_Sub1_Sub1 class656_sub1_sub3_sub1_sub1
	    = client.aClass656_Sub1_Sub3_Sub1_Sub1Array11384[i];
	if (0 == i_8_) {
	    if (!bool) {
		if (615376671 * client.anInt11053 == i)
		    throw new RuntimeException();
		Class46 class46
		    = Class104.aClass46Array1283[i] = new Class46();
		Class684.method11241(-1091966907);
		class46.anInt351
		    = (-1174120235
		       * (((class656_sub1_sub3_sub1_sub1.anIntArray12017[0]
			    + class600.anInt7860 * 1429253007)
			   >> 6)
			  + (((-1227002079 * class600.anInt7858
			       + (class656_sub1_sub3_sub1_sub1.anIntArray12014
				  [0]))
			      >> 6 << 14)
			     + (class656_sub1_sub3_sub1_sub1.aByte10867
				<< 28))));
		if (-1191180917 * class656_sub1_sub3_sub1_sub1.anInt12242
		    != -1)
		    class46.anInt355
			= 1173793289 * class656_sub1_sub3_sub1_sub1.anInt12242;
		else
		    class46.anInt355
			= class656_sub1_sub3_sub1_sub1.aClass64_11992
			      .method1393((short) 21788) * -340096709;
		class46.anInt353
		    = 1650950841 * class656_sub1_sub3_sub1_sub1.anInt11983;
		class46.aClass243_354
		    = class656_sub1_sub3_sub1_sub1.aClass243_12252;
		class46.aBool352 = class656_sub1_sub3_sub1_sub1.aBool12254;
		if (class656_sub1_sub3_sub1_sub1.anInt12249 * -1464774485 > 0)
		    Class406.method6615(class656_sub1_sub3_sub1_sub1,
					162263469);
		client.aClass656_Sub1_Sub3_Sub1_Sub1Array11384[i] = null;
		if (class525_sub38_sub2.method18496(1, 578733530) != 0)
		    Class594.method9832(class525_sub38_sub2, i, -208599962);
	    }
	} else if (1 == i_8_) {
	    int i_9_ = class525_sub38_sub2.method18496(3, 578733530);
	    int i_10_ = class525_sub38_sub2.method18496(1, 578733530);
	    int i_11_ = class656_sub1_sub3_sub1_sub1.anIntArray12014[0];
	    int i_12_ = class656_sub1_sub3_sub1_sub1.anIntArray12017[0];
	    if (i_10_ == 1) {
		Class104.aByteArray1287[i] = Class684.aClass684_8669.aByte8666;
		int i_13_ = class525_sub38_sub2.method18496(2, 578733530);
		switch (i_13_) {
		case 0:
		    class656_sub1_sub3_sub1_sub1.method18909(i_11_, i_12_ + 1,
							     (Class104
							      .aByteArray1287
							      [i]),
							     (short) 3317);
		    break;
		case 3:
		    class656_sub1_sub3_sub1_sub1.method18909(i_11_, i_12_ - 1,
							     (Class104
							      .aByteArray1287
							      [i]),
							     (short) 3317);
		    break;
		case 1:
		    class656_sub1_sub3_sub1_sub1.method18909(i_11_ - 1, i_12_,
							     (Class104
							      .aByteArray1287
							      [i]),
							     (short) 3317);
		    break;
		case 2:
		    class656_sub1_sub3_sub1_sub1.method18909(i_11_ + 1, i_12_,
							     (Class104
							      .aByteArray1287
							      [i]),
							     (short) 3317);
		    break;
		}
	    }
	    if (i_9_ == 0) {
		i_11_--;
		i_12_--;
	    } else if (1 == i_9_)
		i_12_--;
	    else if (i_9_ == 2) {
		i_11_++;
		i_12_--;
	    } else if (3 == i_9_)
		i_11_--;
	    else if (4 == i_9_)
		i_11_++;
	    else if (i_9_ == 5) {
		i_11_--;
		i_12_++;
	    } else if (i_9_ == 6)
		i_12_++;
	    else if (7 == i_9_) {
		i_11_++;
		i_12_++;
	    }
	    class656_sub1_sub3_sub1_sub1.method18909(i_11_, i_12_,
						     (Class104.aByteArray1287
						      [i]),
						     (short) 3317);
	} else if (i_8_ == 2) {
	    int i_14_ = class525_sub38_sub2.method18496(4, 578733530);
	    int i_15_ = class656_sub1_sub3_sub1_sub1.anIntArray12014[0];
	    int i_16_ = class656_sub1_sub3_sub1_sub1.anIntArray12017[0];
	    if (0 == i_14_) {
		i_15_ -= 2;
		i_16_ -= 2;
	    } else if (i_14_ == 1) {
		i_15_--;
		i_16_ -= 2;
	    } else if (i_14_ == 2)
		i_16_ -= 2;
	    else if (i_14_ == 3) {
		i_15_++;
		i_16_ -= 2;
	    } else if (i_14_ == 4) {
		i_15_ += 2;
		i_16_ -= 2;
	    } else if (i_14_ == 5) {
		i_15_ -= 2;
		i_16_--;
	    } else if (i_14_ == 6) {
		i_15_ += 2;
		i_16_--;
	    } else if (i_14_ == 7)
		i_15_ -= 2;
	    else if (i_14_ == 8)
		i_15_ += 2;
	    else if (9 == i_14_) {
		i_15_ -= 2;
		i_16_++;
	    } else if (i_14_ == 10) {
		i_15_ += 2;
		i_16_++;
	    } else if (11 == i_14_) {
		i_15_ -= 2;
		i_16_ += 2;
	    } else if (i_14_ == 12) {
		i_15_--;
		i_16_ += 2;
	    } else if (13 == i_14_)
		i_16_ += 2;
	    else if (i_14_ == 14) {
		i_15_++;
		i_16_ += 2;
	    } else if (15 == i_14_) {
		i_15_ += 2;
		i_16_ += 2;
	    }
	    class656_sub1_sub3_sub1_sub1.method18909(i_15_, i_16_,
						     (Class104.aByteArray1287
						      [i]),
						     (short) 3317);
	} else {
	    int i_17_ = class525_sub38_sub2.method18496(1, 578733530);
	    if (0 == i_17_) {
		int i_18_ = class525_sub38_sub2.method18496(15, 578733530);
		int i_19_ = i_18_ >> 12 & 0x7;
		int i_20_ = (byte) (i_18_ >> 10) & 0x3;
		int i_21_ = i_18_ >> 5 & 0x1f;
		if (i_21_ > 15)
		    i_21_ -= 32;
		int i_22_ = i_18_ & 0x1f;
		if (i_22_ > 15)
		    i_22_ -= 32;
		int i_23_
		    = class656_sub1_sub3_sub1_sub1.anIntArray12014[0] + i_21_;
		int i_24_
		    = i_22_ + class656_sub1_sub3_sub1_sub1.anIntArray12017[0];
		if (-2023714129 * Class684.aClass684_8670.anInt8671 == i_19_)
		    class656_sub1_sub3_sub1_sub1.method18910(i_23_, i_24_,
							     329694950);
		else {
		    Class104.aByteArray1287[i] = (byte) (i_19_ - 1);
		    class656_sub1_sub3_sub1_sub1.method18909(i_23_, i_24_,
							     (Class104
							      .aByteArray1287
							      [i]),
							     (short) 3317);
		}
		class656_sub1_sub3_sub1_sub1.aByte10867
		    = class656_sub1_sub3_sub1_sub1.aByte10870
		    = (byte) (class656_sub1_sub3_sub1_sub1.aByte10867 + i_20_
			      & 0x3);
		if (client.aClass507_11137.method8360(2131671176)
			.method7774(i_23_, i_24_, 504903199))
		    class656_sub1_sub3_sub1_sub1.aByte10870++;
		if (client.anInt11053 * 615376671 == i
		    && (-1335910809 * Class677.anInt8619
			!= class656_sub1_sub3_sub1_sub1.aByte10867))
		    Class677.anInt8619
			= -398156457 * class656_sub1_sub3_sub1_sub1.aByte10867;
	    } else {
		int i_25_ = class525_sub38_sub2.method18496(3, 578733530);
		int i_26_ = class525_sub38_sub2.method18496(30, 578733530);
		int i_27_ = i_26_ >> 28 & 0x3;
		int i_28_ = i_26_ >> 14 & 0x3fff;
		int i_29_ = i_26_ & 0x3fff;
		int i_30_ = (((class656_sub1_sub3_sub1_sub1.anIntArray12014[0]
			       + -1227002079 * class600.anInt7858 + i_28_)
			      & 0x3fff)
			     - class600.anInt7858 * -1227002079);
		int i_31_ = (((class656_sub1_sub3_sub1_sub1.anIntArray12017[0]
			       + class600.anInt7860 * 1429253007 + i_29_)
			      & 0x3fff)
			     - class600.anInt7860 * 1429253007);
		if (i_25_ == Class684.aClass684_8670.anInt8671 * -2023714129)
		    class656_sub1_sub3_sub1_sub1.method18910(i_30_, i_31_,
							     716052077);
		else {
		    Class104.aByteArray1287[i] = (byte) (i_25_ - 1);
		    class656_sub1_sub3_sub1_sub1.method18909(i_30_, i_31_,
							     (Class104
							      .aByteArray1287
							      [i]),
							     (short) 3317);
		}
		class656_sub1_sub3_sub1_sub1.aByte10867
		    = class656_sub1_sub3_sub1_sub1.aByte10870
		    = (byte) (i_27_ + class656_sub1_sub3_sub1_sub1.aByte10867
			      & 0x3);
		if (client.aClass507_11137.method8360(1647739169)
			.method7774(i_30_, i_31_, 988067375))
		    class656_sub1_sub3_sub1_sub1.aByte10870++;
		if (i == client.anInt11053 * 615376671)
		    Class677.anInt8619
			= class656_sub1_sub3_sub1_sub1.aByte10867 * -398156457;
	    }
	}
    }
}
