/* Class104 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class104
{
    static int[] anIntArray1278;
    static final int anInt1279 = 1;
    static byte[] aByteArray1280;
    static final int anInt1281 = 2;
    static RSBuffer[] aClass525_Sub38Array1282;
    static Class46[] aClass46Array1283;
    public static int anInt1284;
    static int[] anIntArray1285;
    static int anInt1286;
    static byte[] aByteArray1287;
    static int[] anIntArray1288;
    static int anInt1289;
    static RSBuffer[] aClass525_Sub38Array1290;
    static boolean $assertionsDisabled
	= !com.jagex.Class104.class.desiredAssertionStatus();
    public static long aLong1291;
    
    static boolean method1894(Class525_Sub38_Sub2 class525_sub38_sub2, int i) {
	int i_0_ = class525_sub38_sub2.method18496(2, 578733530);
	if (0 == i_0_) {
	    if (class525_sub38_sub2.method18496(1, 578733530) != 0)
		Class594.method9832(class525_sub38_sub2, i, 1009550631);
	    int i_1_ = class525_sub38_sub2.method18496(6, 578733530);
	    int i_2_ = class525_sub38_sub2.method18496(6, 578733530);
	    boolean bool = class525_sub38_sub2.method18496(1, 578733530) == 1;
	    if (bool)
		anIntArray1278[(anInt1289 += -812984013) * -799225349 - 1] = i;
	    if (null != client.aClass656_Sub1_Sub3_Sub1_Sub1Array11384[i])
		throw new RuntimeException();
	    Class46 class46 = aClass46Array1283[i];
	    Class656_Sub1_Sub3_Sub1_Sub1 class656_sub1_sub3_sub1_sub1
		= (client.aClass656_Sub1_Sub3_Sub1_Sub1Array11384[i]
		   = (new Class656_Sub1_Sub3_Sub1_Sub1
		      (client.aClass507_11137.method8358((byte) 62))));
	    class656_sub1_sub3_sub1_sub1.anInt11964 = i * -447377367;
	    if (aClass525_Sub38Array1290[i] != null)
		class656_sub1_sub3_sub1_sub1
		    .method18903(aClass525_Sub38Array1290[i], (byte) 5);
	    if (null != aClass525_Sub38Array1282[i])
		class656_sub1_sub3_sub1_sub1
		    .method18904(aClass525_Sub38Array1282[i], 2139254559);
	    class656_sub1_sub3_sub1_sub1
		.method18597(-1365547021 * class46.anInt355, true, (byte) 1);
	    class656_sub1_sub3_sub1_sub1.anInt11983
		= class46.anInt353 * -960896119;
	    int i_3_ = 1085153405 * class46.anInt351;
	    int i_4_ = i_3_ >> 28;
	    int i_5_ = i_3_ >> 14 & 0xff;
	    int i_6_ = i_3_ & 0xff;
	    Class600 class600 = client.aClass507_11137.method8350(-520559463);
	    int i_7_ = (i_5_ << 6) + i_1_ - class600.anInt7858 * -1227002079;
	    int i_8_ = i_2_ + (i_6_ << 6) - 1429253007 * class600.anInt7860;
	    class656_sub1_sub3_sub1_sub1.aClass243_12252
		= class46.aClass243_354;
	    class656_sub1_sub3_sub1_sub1.aBool12254 = class46.aBool352;
	    class656_sub1_sub3_sub1_sub1.aByteArray12007[0]
		= aByteArray1287[i];
	    class656_sub1_sub3_sub1_sub1.aByte10867
		= class656_sub1_sub3_sub1_sub1.aByte10870 = (byte) i_4_;
	    if (client.aClass507_11137.method8360(1645809287)
		    .method7774(i_7_, i_8_, 1946415818))
		class656_sub1_sub3_sub1_sub1.aByte10870++;
	    class656_sub1_sub3_sub1_sub1.method18910(i_7_, i_8_, 241757813);
	    aClass46Array1283[i] = null;
	    return true;
	}
	if (1 == i_0_) {
	    int i_9_ = class525_sub38_sub2.method18496(2, 578733530);
	    int i_10_ = aClass46Array1283[i].anInt351 * 1085153405;
	    aClass46Array1283[i].anInt351
		= -1174120235 * (((i_9_ + (i_10_ >> 28) & 0x3) << 28)
				 + (i_10_ & 0xfffffff));
	    return false;
	}
	if (2 == i_0_) {
	    int i_11_ = class525_sub38_sub2.method18496(5, 578733530);
	    int i_12_ = i_11_ >> 3 & 0x3;
	    int i_13_ = i_11_ & 0x7;
	    int i_14_ = aClass46Array1283[i].anInt351 * 1085153405;
	    if (!$assertionsDisabled
		&& (aByteArray1287[i] < 0 || aByteArray1287[i] > 3))
		throw new AssertionError();
	    int i_15_ = i_12_ + (i_14_ >> 28) & 0x3;
	    int i_16_ = i_14_ >> 14 & 0xff;
	    int i_17_ = i_14_ & 0xff;
	    if (i_13_ == 0) {
		i_16_--;
		i_17_--;
	    }
	    if (1 == i_13_)
		i_17_--;
	    if (2 == i_13_) {
		i_16_++;
		i_17_--;
	    }
	    if (3 == i_13_)
		i_16_--;
	    if (i_13_ == 4)
		i_16_++;
	    if (5 == i_13_) {
		i_16_--;
		i_17_++;
	    }
	    if (i_13_ == 6)
		i_17_++;
	    if (7 == i_13_) {
		i_16_++;
		i_17_++;
	    }
	    Class539.method8888(Class684.method11241(-167168139),
				aByteArray1287[i], 1400310113);
	    aClass46Array1283[i].anInt351
		= -1174120235 * (i_17_ + ((i_16_ << 14) + (i_15_ << 28)));
	    return false;
	}
	int i_18_ = class525_sub38_sub2.method18496(20, 578733530);
	int i_19_ = i_18_ >> 18 & 0x3;
	int i_20_ = i_18_ >> 16 & 0x3;
	int i_21_ = i_18_ >> 8 & 0xff;
	int i_22_ = i_18_ & 0xff;
	int i_23_ = 1085153405 * aClass46Array1283[i].anInt351;
	aByteArray1287[i] = (byte) (i_19_ - 1);
	if (!$assertionsDisabled
	    && (aByteArray1287[i] < 0 || aByteArray1287[i] > 3))
	    throw new AssertionError();
	int i_24_ = i_20_ + (i_23_ >> 28) & 0x3;
	int i_25_ = (i_23_ >> 14) + i_21_ & 0xff;
	int i_26_ = i_23_ + i_22_ & 0xff;
	Class539.method8888(Class684.method11241(-921556916), i_19_ - 1,
			    830890968);
	aClass46Array1283[i].anInt351
	    = (i_26_ + ((i_25_ << 14) + (i_24_ << 28))) * -1174120235;
	return false;
    }
    
    static {
	aByteArray1280 = new byte[2048];
	aByteArray1287 = new byte[2048];
	aClass525_Sub38Array1290 = new RSBuffer[2048];
	aClass525_Sub38Array1282 = new RSBuffer[2048];
	anInt1284 = 0;
	anIntArray1285 = new int[2048];
	anInt1286 = 0;
	anIntArray1288 = new int[2048];
	aClass46Array1283 = new Class46[2048];
	anInt1289 = 0;
	anIntArray1278 = new int[2048];
    }
    
    static final void method1895(Class525_Sub38_Sub2 class525_sub38_sub2,
				 int i) {
	anInt1289 = 0;
	Class267.method4947(class525_sub38_sub2, -737720251);
	Class466.method7692(class525_sub38_sub2, (byte) -106);
	if (class525_sub38_sub2.pos * -1133521593 != i)
	    throw new RuntimeException(new StringBuilder().append
					   (class525_sub38_sub2.pos
					    * -1133521593)
					   .append
					   (" ").append
					   (i).toString());
    }
    
    static final void method1896(Class525_Sub38_Sub2 class525_sub38_sub2,
				 int i) {
	anInt1289 = 0;
	Class267.method4947(class525_sub38_sub2, 2140595557);
	Class466.method7692(class525_sub38_sub2, (byte) -108);
	if (class525_sub38_sub2.pos * -1133521593 != i)
	    throw new RuntimeException(new StringBuilder().append
					   (class525_sub38_sub2.pos
					    * -1133521593)
					   .append
					   (" ").append
					   (i).toString());
    }
    
    static final void method1897(Class525_Sub38_Sub2 class525_sub38_sub2,
				 int i) {
	anInt1289 = 0;
	Class267.method4947(class525_sub38_sub2, 2127622953);
	Class466.method7692(class525_sub38_sub2, (byte) -41);
	if (class525_sub38_sub2.pos * -1133521593 != i)
	    throw new RuntimeException(new StringBuilder().append
					   (class525_sub38_sub2.pos
					    * -1133521593)
					   .append
					   (" ").append
					   (i).toString());
    }
    
    static final void method1898(Class525_Sub38_Sub2 class525_sub38_sub2) {
	int i = 0;
	class525_sub38_sub2.method18495(-1868408009);
	for (int i_27_ = 0; i_27_ < anInt1284 * 692634081; i_27_++) {
	    int i_28_ = anIntArray1285[i_27_];
	    if ((aByteArray1280[i_28_] & 0x1) == 0) {
		if (i > 0) {
		    i--;
		    aByteArray1280[i_28_] |= 0x2;
		} else {
		    int i_29_ = class525_sub38_sub2.method18496(1, 578733530);
		    if (i_29_ == 0) {
			i = Class178.method2912(class525_sub38_sub2,
						-1455494672);
			aByteArray1280[i_28_] |= 0x2;
		    } else
			Class300.method5399(class525_sub38_sub2, i_28_,
					    (byte) 102);
		}
	    }
	}
	class525_sub38_sub2.method18497(-2061790185);
	if (0 != i)
	    throw new RuntimeException();
	class525_sub38_sub2.method18495(417456820);
	for (int i_30_ = 0; i_30_ < anInt1284 * 692634081; i_30_++) {
	    int i_31_ = anIntArray1285[i_30_];
	    if (0 != (aByteArray1280[i_31_] & 0x1)) {
		if (i > 0) {
		    i--;
		    aByteArray1280[i_31_] |= 0x2;
		} else {
		    int i_32_ = class525_sub38_sub2.method18496(1, 578733530);
		    if (i_32_ == 0) {
			i = Class178.method2912(class525_sub38_sub2,
						-522539751);
			aByteArray1280[i_31_] |= 0x2;
		    } else
			Class300.method5399(class525_sub38_sub2, i_31_,
					    (byte) -89);
		}
	    }
	}
	class525_sub38_sub2.method18497(-2061790185);
	if (0 != i)
	    throw new RuntimeException();
	class525_sub38_sub2.method18495(636368512);
	for (int i_33_ = 0; i_33_ < anInt1286 * 505464439; i_33_++) {
	    int i_34_ = anIntArray1288[i_33_];
	    if (0 != (aByteArray1280[i_34_] & 0x1)) {
		if (i > 0) {
		    i--;
		    aByteArray1280[i_34_] |= 0x2;
		} else {
		    int i_35_ = class525_sub38_sub2.method18496(1, 578733530);
		    if (i_35_ == 0) {
			i = Class178.method2912(class525_sub38_sub2,
						-720339074);
			aByteArray1280[i_34_] |= 0x2;
		    } else if (Class594.method9832(class525_sub38_sub2, i_34_,
						   2059731710))
			aByteArray1280[i_34_] |= 0x2;
		}
	    }
	}
	class525_sub38_sub2.method18497(-2061790185);
	if (0 != i)
	    throw new RuntimeException();
	class525_sub38_sub2.method18495(-180291911);
	for (int i_36_ = 0; i_36_ < anInt1286 * 505464439; i_36_++) {
	    int i_37_ = anIntArray1288[i_36_];
	    if (0 == (aByteArray1280[i_37_] & 0x1)) {
		if (i > 0) {
		    i--;
		    aByteArray1280[i_37_] |= 0x2;
		} else {
		    int i_38_ = class525_sub38_sub2.method18496(1, 578733530);
		    if (0 == i_38_) {
			i = Class178.method2912(class525_sub38_sub2,
						-1450812162);
			aByteArray1280[i_37_] |= 0x2;
		    } else if (Class594.method9832(class525_sub38_sub2, i_37_,
						   1205514174))
			aByteArray1280[i_37_] |= 0x2;
		}
	    }
	}
	class525_sub38_sub2.method18497(-2061790185);
	if (i != 0)
	    throw new RuntimeException();
	anInt1284 = 0;
	anInt1286 = 0;
	for (int i_39_ = 1; i_39_ < 2048; i_39_++) {
	    aByteArray1280[i_39_] >>= 1;
	    Class656_Sub1_Sub3_Sub1_Sub1 class656_sub1_sub3_sub1_sub1
		= client.aClass656_Sub1_Sub3_Sub1_Sub1Array11384[i_39_];
	    if (class656_sub1_sub3_sub1_sub1 != null)
		anIntArray1285[(anInt1284 += 1711489569) * 692634081 - 1]
		    = i_39_;
	    else
		anIntArray1288[(anInt1286 += 254473031) * 505464439 - 1]
		    = i_39_;
	}
    }
    
    static void method1899(Class525_Sub38_Sub2 class525_sub38_sub2, int i) {
	Class600 class600 = client.aClass507_11137.method8350(307007691);
	boolean bool = class525_sub38_sub2.method18496(1, 578733530) == 1;
	if (bool)
	    anIntArray1278[(anInt1289 += -812984013) * -799225349 - 1] = i;
	int i_40_ = class525_sub38_sub2.method18496(2, 578733530);
	Class656_Sub1_Sub3_Sub1_Sub1 class656_sub1_sub3_sub1_sub1
	    = client.aClass656_Sub1_Sub3_Sub1_Sub1Array11384[i];
	if (0 == i_40_) {
	    if (!bool) {
		if (615376671 * client.anInt11053 == i)
		    throw new RuntimeException();
		Class46 class46 = aClass46Array1283[i] = new Class46();
		Class684.method11241(-1231789693);
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
			      .method1393((short) 4537) * -340096709;
		class46.anInt353
		    = 1650950841 * class656_sub1_sub3_sub1_sub1.anInt11983;
		class46.aClass243_354
		    = class656_sub1_sub3_sub1_sub1.aClass243_12252;
		class46.aBool352 = class656_sub1_sub3_sub1_sub1.aBool12254;
		if (class656_sub1_sub3_sub1_sub1.anInt12249 * -1464774485 > 0)
		    Class406.method6615(class656_sub1_sub3_sub1_sub1,
					386739840);
		client.aClass656_Sub1_Sub3_Sub1_Sub1Array11384[i] = null;
		if (class525_sub38_sub2.method18496(1, 578733530) != 0)
		    Class594.method9832(class525_sub38_sub2, i, 1898142637);
	    }
	} else if (1 == i_40_) {
	    int i_41_ = class525_sub38_sub2.method18496(3, 578733530);
	    int i_42_ = class525_sub38_sub2.method18496(1, 578733530);
	    int i_43_ = class656_sub1_sub3_sub1_sub1.anIntArray12014[0];
	    int i_44_ = class656_sub1_sub3_sub1_sub1.anIntArray12017[0];
	    if (i_42_ == 1) {
		aByteArray1287[i] = Class684.aClass684_8669.aByte8666;
		int i_45_ = class525_sub38_sub2.method18496(2, 578733530);
		switch (i_45_) {
		case 0:
		    class656_sub1_sub3_sub1_sub1.method18909(i_43_, i_44_ + 1,
							     aByteArray1287[i],
							     (short) 3317);
		    break;
		case 3:
		    class656_sub1_sub3_sub1_sub1.method18909(i_43_, i_44_ - 1,
							     aByteArray1287[i],
							     (short) 3317);
		    break;
		case 1:
		    class656_sub1_sub3_sub1_sub1.method18909(i_43_ - 1, i_44_,
							     aByteArray1287[i],
							     (short) 3317);
		    break;
		case 2:
		    class656_sub1_sub3_sub1_sub1.method18909(i_43_ + 1, i_44_,
							     aByteArray1287[i],
							     (short) 3317);
		    break;
		}
	    }
	    if (i_41_ == 0) {
		i_43_--;
		i_44_--;
	    } else if (1 == i_41_)
		i_44_--;
	    else if (i_41_ == 2) {
		i_43_++;
		i_44_--;
	    } else if (3 == i_41_)
		i_43_--;
	    else if (4 == i_41_)
		i_43_++;
	    else if (i_41_ == 5) {
		i_43_--;
		i_44_++;
	    } else if (i_41_ == 6)
		i_44_++;
	    else if (7 == i_41_) {
		i_43_++;
		i_44_++;
	    }
	    class656_sub1_sub3_sub1_sub1
		.method18909(i_43_, i_44_, aByteArray1287[i], (short) 3317);
	} else if (i_40_ == 2) {
	    int i_46_ = class525_sub38_sub2.method18496(4, 578733530);
	    int i_47_ = class656_sub1_sub3_sub1_sub1.anIntArray12014[0];
	    int i_48_ = class656_sub1_sub3_sub1_sub1.anIntArray12017[0];
	    if (0 == i_46_) {
		i_47_ -= 2;
		i_48_ -= 2;
	    } else if (i_46_ == 1) {
		i_47_--;
		i_48_ -= 2;
	    } else if (i_46_ == 2)
		i_48_ -= 2;
	    else if (i_46_ == 3) {
		i_47_++;
		i_48_ -= 2;
	    } else if (i_46_ == 4) {
		i_47_ += 2;
		i_48_ -= 2;
	    } else if (i_46_ == 5) {
		i_47_ -= 2;
		i_48_--;
	    } else if (i_46_ == 6) {
		i_47_ += 2;
		i_48_--;
	    } else if (i_46_ == 7)
		i_47_ -= 2;
	    else if (i_46_ == 8)
		i_47_ += 2;
	    else if (9 == i_46_) {
		i_47_ -= 2;
		i_48_++;
	    } else if (i_46_ == 10) {
		i_47_ += 2;
		i_48_++;
	    } else if (11 == i_46_) {
		i_47_ -= 2;
		i_48_ += 2;
	    } else if (i_46_ == 12) {
		i_47_--;
		i_48_ += 2;
	    } else if (13 == i_46_)
		i_48_ += 2;
	    else if (i_46_ == 14) {
		i_47_++;
		i_48_ += 2;
	    } else if (15 == i_46_) {
		i_47_ += 2;
		i_48_ += 2;
	    }
	    class656_sub1_sub3_sub1_sub1
		.method18909(i_47_, i_48_, aByteArray1287[i], (short) 3317);
	} else {
	    int i_49_ = class525_sub38_sub2.method18496(1, 578733530);
	    if (0 == i_49_) {
		int i_50_ = class525_sub38_sub2.method18496(15, 578733530);
		int i_51_ = i_50_ >> 12 & 0x7;
		int i_52_ = (byte) (i_50_ >> 10) & 0x3;
		int i_53_ = i_50_ >> 5 & 0x1f;
		if (i_53_ > 15)
		    i_53_ -= 32;
		int i_54_ = i_50_ & 0x1f;
		if (i_54_ > 15)
		    i_54_ -= 32;
		int i_55_
		    = class656_sub1_sub3_sub1_sub1.anIntArray12014[0] + i_53_;
		int i_56_
		    = i_54_ + class656_sub1_sub3_sub1_sub1.anIntArray12017[0];
		if (-2023714129 * Class684.aClass684_8670.anInt8671 == i_51_)
		    class656_sub1_sub3_sub1_sub1.method18910(i_55_, i_56_,
							     138320066);
		else {
		    aByteArray1287[i] = (byte) (i_51_ - 1);
		    class656_sub1_sub3_sub1_sub1.method18909(i_55_, i_56_,
							     aByteArray1287[i],
							     (short) 3317);
		}
		class656_sub1_sub3_sub1_sub1.aByte10867
		    = class656_sub1_sub3_sub1_sub1.aByte10870
		    = (byte) (class656_sub1_sub3_sub1_sub1.aByte10867 + i_52_
			      & 0x3);
		if (client.aClass507_11137.method8360(1960199411)
			.method7774(i_55_, i_56_, 757303756))
		    class656_sub1_sub3_sub1_sub1.aByte10870++;
		if (client.anInt11053 * 615376671 == i
		    && (-1335910809 * Class677.anInt8619
			!= class656_sub1_sub3_sub1_sub1.aByte10867))
		    Class677.anInt8619
			= -398156457 * class656_sub1_sub3_sub1_sub1.aByte10867;
	    } else {
		int i_57_ = class525_sub38_sub2.method18496(3, 578733530);
		int i_58_ = class525_sub38_sub2.method18496(30, 578733530);
		int i_59_ = i_58_ >> 28 & 0x3;
		int i_60_ = i_58_ >> 14 & 0x3fff;
		int i_61_ = i_58_ & 0x3fff;
		int i_62_ = (((class656_sub1_sub3_sub1_sub1.anIntArray12014[0]
			       + -1227002079 * class600.anInt7858 + i_60_)
			      & 0x3fff)
			     - class600.anInt7858 * -1227002079);
		int i_63_ = (((class656_sub1_sub3_sub1_sub1.anIntArray12017[0]
			       + class600.anInt7860 * 1429253007 + i_61_)
			      & 0x3fff)
			     - class600.anInt7860 * 1429253007);
		if (i_57_ == Class684.aClass684_8670.anInt8671 * -2023714129)
		    class656_sub1_sub3_sub1_sub1.method18910(i_62_, i_63_,
							     -562892433);
		else {
		    aByteArray1287[i] = (byte) (i_57_ - 1);
		    class656_sub1_sub3_sub1_sub1.method18909(i_62_, i_63_,
							     aByteArray1287[i],
							     (short) 3317);
		}
		class656_sub1_sub3_sub1_sub1.aByte10867
		    = class656_sub1_sub3_sub1_sub1.aByte10870
		    = (byte) (i_59_ + class656_sub1_sub3_sub1_sub1.aByte10867
			      & 0x3);
		if (client.aClass507_11137.method8360(1602865752)
			.method7774(i_62_, i_63_, 1424103506))
		    class656_sub1_sub3_sub1_sub1.aByte10870++;
		if (i == client.anInt11053 * 615376671)
		    Class677.anInt8619
			= class656_sub1_sub3_sub1_sub1.aByte10867 * -398156457;
	    }
	}
    }
    
    static boolean method1900(Class525_Sub38_Sub2 class525_sub38_sub2, int i) {
	int i_64_ = class525_sub38_sub2.method18496(2, 578733530);
	if (0 == i_64_) {
	    if (class525_sub38_sub2.method18496(1, 578733530) != 0)
		Class594.method9832(class525_sub38_sub2, i, -836707865);
	    int i_65_ = class525_sub38_sub2.method18496(6, 578733530);
	    int i_66_ = class525_sub38_sub2.method18496(6, 578733530);
	    boolean bool = class525_sub38_sub2.method18496(1, 578733530) == 1;
	    if (bool)
		anIntArray1278[(anInt1289 += -812984013) * -799225349 - 1] = i;
	    if (null != client.aClass656_Sub1_Sub3_Sub1_Sub1Array11384[i])
		throw new RuntimeException();
	    Class46 class46 = aClass46Array1283[i];
	    Class656_Sub1_Sub3_Sub1_Sub1 class656_sub1_sub3_sub1_sub1
		= (client.aClass656_Sub1_Sub3_Sub1_Sub1Array11384[i]
		   = (new Class656_Sub1_Sub3_Sub1_Sub1
		      (client.aClass507_11137.method8358((byte) 19))));
	    class656_sub1_sub3_sub1_sub1.anInt11964 = i * -447377367;
	    if (aClass525_Sub38Array1290[i] != null)
		class656_sub1_sub3_sub1_sub1
		    .method18903(aClass525_Sub38Array1290[i], (byte) 5);
	    if (null != aClass525_Sub38Array1282[i])
		class656_sub1_sub3_sub1_sub1
		    .method18904(aClass525_Sub38Array1282[i], 2116551666);
	    class656_sub1_sub3_sub1_sub1
		.method18597(-1365547021 * class46.anInt355, true, (byte) 1);
	    class656_sub1_sub3_sub1_sub1.anInt11983
		= class46.anInt353 * -960896119;
	    int i_67_ = 1085153405 * class46.anInt351;
	    int i_68_ = i_67_ >> 28;
	    int i_69_ = i_67_ >> 14 & 0xff;
	    int i_70_ = i_67_ & 0xff;
	    Class600 class600 = client.aClass507_11137.method8350(2124631930);
	    int i_71_
		= (i_69_ << 6) + i_65_ - class600.anInt7858 * -1227002079;
	    int i_72_ = i_66_ + (i_70_ << 6) - 1429253007 * class600.anInt7860;
	    class656_sub1_sub3_sub1_sub1.aClass243_12252
		= class46.aClass243_354;
	    class656_sub1_sub3_sub1_sub1.aBool12254 = class46.aBool352;
	    class656_sub1_sub3_sub1_sub1.aByteArray12007[0]
		= aByteArray1287[i];
	    class656_sub1_sub3_sub1_sub1.aByte10867
		= class656_sub1_sub3_sub1_sub1.aByte10870 = (byte) i_68_;
	    if (client.aClass507_11137.method8360(2091540573)
		    .method7774(i_71_, i_72_, 2110983703))
		class656_sub1_sub3_sub1_sub1.aByte10870++;
	    class656_sub1_sub3_sub1_sub1.method18910(i_71_, i_72_,
						     -1888946043);
	    aClass46Array1283[i] = null;
	    return true;
	}
	if (1 == i_64_) {
	    int i_73_ = class525_sub38_sub2.method18496(2, 578733530);
	    int i_74_ = aClass46Array1283[i].anInt351 * 1085153405;
	    aClass46Array1283[i].anInt351
		= -1174120235 * (((i_73_ + (i_74_ >> 28) & 0x3) << 28)
				 + (i_74_ & 0xfffffff));
	    return false;
	}
	if (2 == i_64_) {
	    int i_75_ = class525_sub38_sub2.method18496(5, 578733530);
	    int i_76_ = i_75_ >> 3 & 0x3;
	    int i_77_ = i_75_ & 0x7;
	    int i_78_ = aClass46Array1283[i].anInt351 * 1085153405;
	    if (!$assertionsDisabled
		&& (aByteArray1287[i] < 0 || aByteArray1287[i] > 3))
		throw new AssertionError();
	    int i_79_ = i_76_ + (i_78_ >> 28) & 0x3;
	    int i_80_ = i_78_ >> 14 & 0xff;
	    int i_81_ = i_78_ & 0xff;
	    if (i_77_ == 0) {
		i_80_--;
		i_81_--;
	    }
	    if (1 == i_77_)
		i_81_--;
	    if (2 == i_77_) {
		i_80_++;
		i_81_--;
	    }
	    if (3 == i_77_)
		i_80_--;
	    if (i_77_ == 4)
		i_80_++;
	    if (5 == i_77_) {
		i_80_--;
		i_81_++;
	    }
	    if (i_77_ == 6)
		i_81_++;
	    if (7 == i_77_) {
		i_80_++;
		i_81_++;
	    }
	    Class539.method8888(Class684.method11241(-1891075711),
				aByteArray1287[i], 1564212530);
	    aClass46Array1283[i].anInt351
		= -1174120235 * (i_81_ + ((i_80_ << 14) + (i_79_ << 28)));
	    return false;
	}
	int i_82_ = class525_sub38_sub2.method18496(20, 578733530);
	int i_83_ = i_82_ >> 18 & 0x3;
	int i_84_ = i_82_ >> 16 & 0x3;
	int i_85_ = i_82_ >> 8 & 0xff;
	int i_86_ = i_82_ & 0xff;
	int i_87_ = 1085153405 * aClass46Array1283[i].anInt351;
	aByteArray1287[i] = (byte) (i_83_ - 1);
	if (!$assertionsDisabled
	    && (aByteArray1287[i] < 0 || aByteArray1287[i] > 3))
	    throw new AssertionError();
	int i_88_ = i_84_ + (i_87_ >> 28) & 0x3;
	int i_89_ = (i_87_ >> 14) + i_85_ & 0xff;
	int i_90_ = i_87_ + i_86_ & 0xff;
	Class539.method8888(Class684.method11241(-1912708301), i_83_ - 1,
			    -884209666);
	aClass46Array1283[i].anInt351
	    = (i_90_ + ((i_89_ << 14) + (i_88_ << 28))) * -1174120235;
	return false;
    }
    
    static void method1901() {
	anInt1284 = 0;
	for (int i = 0; i < 2048; i++) {
	    aClass525_Sub38Array1290[i] = null;
	    aClass525_Sub38Array1282[i] = null;
	    aByteArray1287[i] = Class684.aClass684_8668.aByte8666;
	    aClass46Array1283[i] = null;
	}
    }
    
    static boolean method1902(Class525_Sub38_Sub2 class525_sub38_sub2, int i) {
	int i_91_ = class525_sub38_sub2.method18496(2, 578733530);
	if (0 == i_91_) {
	    if (class525_sub38_sub2.method18496(1, 578733530) != 0)
		Class594.method9832(class525_sub38_sub2, i, 73730847);
	    int i_92_ = class525_sub38_sub2.method18496(6, 578733530);
	    int i_93_ = class525_sub38_sub2.method18496(6, 578733530);
	    boolean bool = class525_sub38_sub2.method18496(1, 578733530) == 1;
	    if (bool)
		anIntArray1278[(anInt1289 += -812984013) * -799225349 - 1] = i;
	    if (null != client.aClass656_Sub1_Sub3_Sub1_Sub1Array11384[i])
		throw new RuntimeException();
	    Class46 class46 = aClass46Array1283[i];
	    Class656_Sub1_Sub3_Sub1_Sub1 class656_sub1_sub3_sub1_sub1
		= (client.aClass656_Sub1_Sub3_Sub1_Sub1Array11384[i]
		   = (new Class656_Sub1_Sub3_Sub1_Sub1
		      (client.aClass507_11137.method8358((byte) 39))));
	    class656_sub1_sub3_sub1_sub1.anInt11964 = i * -447377367;
	    if (aClass525_Sub38Array1290[i] != null)
		class656_sub1_sub3_sub1_sub1
		    .method18903(aClass525_Sub38Array1290[i], (byte) 5);
	    if (null != aClass525_Sub38Array1282[i])
		class656_sub1_sub3_sub1_sub1
		    .method18904(aClass525_Sub38Array1282[i], 2005821908);
	    class656_sub1_sub3_sub1_sub1
		.method18597(-1365547021 * class46.anInt355, true, (byte) 1);
	    class656_sub1_sub3_sub1_sub1.anInt11983
		= class46.anInt353 * -960896119;
	    int i_94_ = 1085153405 * class46.anInt351;
	    int i_95_ = i_94_ >> 28;
	    int i_96_ = i_94_ >> 14 & 0xff;
	    int i_97_ = i_94_ & 0xff;
	    Class600 class600 = client.aClass507_11137.method8350(-2032234903);
	    int i_98_
		= (i_96_ << 6) + i_92_ - class600.anInt7858 * -1227002079;
	    int i_99_ = i_93_ + (i_97_ << 6) - 1429253007 * class600.anInt7860;
	    class656_sub1_sub3_sub1_sub1.aClass243_12252
		= class46.aClass243_354;
	    class656_sub1_sub3_sub1_sub1.aBool12254 = class46.aBool352;
	    class656_sub1_sub3_sub1_sub1.aByteArray12007[0]
		= aByteArray1287[i];
	    class656_sub1_sub3_sub1_sub1.aByte10867
		= class656_sub1_sub3_sub1_sub1.aByte10870 = (byte) i_95_;
	    if (client.aClass507_11137.method8360(1254757415)
		    .method7774(i_98_, i_99_, 2061759628))
		class656_sub1_sub3_sub1_sub1.aByte10870++;
	    class656_sub1_sub3_sub1_sub1.method18910(i_98_, i_99_, -189280142);
	    aClass46Array1283[i] = null;
	    return true;
	}
	if (1 == i_91_) {
	    int i_100_ = class525_sub38_sub2.method18496(2, 578733530);
	    int i_101_ = aClass46Array1283[i].anInt351 * 1085153405;
	    aClass46Array1283[i].anInt351
		= -1174120235 * (((i_100_ + (i_101_ >> 28) & 0x3) << 28)
				 + (i_101_ & 0xfffffff));
	    return false;
	}
	if (2 == i_91_) {
	    int i_102_ = class525_sub38_sub2.method18496(5, 578733530);
	    int i_103_ = i_102_ >> 3 & 0x3;
	    int i_104_ = i_102_ & 0x7;
	    int i_105_ = aClass46Array1283[i].anInt351 * 1085153405;
	    if (!$assertionsDisabled
		&& (aByteArray1287[i] < 0 || aByteArray1287[i] > 3))
		throw new AssertionError();
	    int i_106_ = i_103_ + (i_105_ >> 28) & 0x3;
	    int i_107_ = i_105_ >> 14 & 0xff;
	    int i_108_ = i_105_ & 0xff;
	    if (i_104_ == 0) {
		i_107_--;
		i_108_--;
	    }
	    if (1 == i_104_)
		i_108_--;
	    if (2 == i_104_) {
		i_107_++;
		i_108_--;
	    }
	    if (3 == i_104_)
		i_107_--;
	    if (i_104_ == 4)
		i_107_++;
	    if (5 == i_104_) {
		i_107_--;
		i_108_++;
	    }
	    if (i_104_ == 6)
		i_108_++;
	    if (7 == i_104_) {
		i_107_++;
		i_108_++;
	    }
	    Class539.method8888(Class684.method11241(-1033848675),
				aByteArray1287[i], -1757927047);
	    aClass46Array1283[i].anInt351
		= -1174120235 * (i_108_ + ((i_107_ << 14) + (i_106_ << 28)));
	    return false;
	}
	int i_109_ = class525_sub38_sub2.method18496(20, 578733530);
	int i_110_ = i_109_ >> 18 & 0x3;
	int i_111_ = i_109_ >> 16 & 0x3;
	int i_112_ = i_109_ >> 8 & 0xff;
	int i_113_ = i_109_ & 0xff;
	int i_114_ = 1085153405 * aClass46Array1283[i].anInt351;
	aByteArray1287[i] = (byte) (i_110_ - 1);
	if (!$assertionsDisabled
	    && (aByteArray1287[i] < 0 || aByteArray1287[i] > 3))
	    throw new AssertionError();
	int i_115_ = i_111_ + (i_114_ >> 28) & 0x3;
	int i_116_ = (i_114_ >> 14) + i_112_ & 0xff;
	int i_117_ = i_114_ + i_113_ & 0xff;
	Class539.method8888(Class684.method11241(-376872505), i_110_ - 1,
			    -355966375);
	aClass46Array1283[i].anInt351
	    = (i_117_ + ((i_116_ << 14) + (i_115_ << 28))) * -1174120235;
	return false;
    }
    
    static final void method1903(Class525_Sub38_Sub2 class525_sub38_sub2) {
	for (int i = 0; i < anInt1289 * -799225349; i++) {
	    class525_sub38_sub2.readUnsignedShort((byte) 59);
	    int i_118_ = anIntArray1278[i];
	    Class656_Sub1_Sub3_Sub1_Sub1 class656_sub1_sub3_sub1_sub1
		= client.aClass656_Sub1_Sub3_Sub1_Sub1Array11384[i_118_];
	    int i_119_ = class525_sub38_sub2.readUnsignedByte(914770829);
	    if (0 != (i_119_ & 0x2))
		i_119_ += class525_sub38_sub2.readUnsignedByte(895807358) << 8;
	    if ((i_119_ & 0x4000) != 0)
		i_119_ += class525_sub38_sub2.readUnsignedByte(1568504114) << 16;
	    Class178.method2913(class525_sub38_sub2, i_118_,
				class656_sub1_sub3_sub1_sub1, i_119_,
				(byte) 78);
	}
    }
    
    static final void method1904
	(Class525_Sub38_Sub2 class525_sub38_sub2, int i,
	 Class656_Sub1_Sub3_Sub1_Sub1 class656_sub1_sub3_sub1_sub1,
	 int i_120_) {
	if (0 != (i_120_ & 0x200000)) {
	    class656_sub1_sub3_sub1_sub1.aByte12000
		= class525_sub38_sub2.method16662(-880411526);
	    class656_sub1_sub3_sub1_sub1.aByte12001
		= class525_sub38_sub2.method16662(-880411526);
	    class656_sub1_sub3_sub1_sub1.aByte12002
		= class525_sub38_sub2.method16739(907094016);
	    class656_sub1_sub3_sub1_sub1.aByte11979
		= (byte) class525_sub38_sub2.method16660(1284224745);
	    class656_sub1_sub3_sub1_sub1.anInt11981
		= ((client.anInt11083
		    + class525_sub38_sub2.method16667(1975533348))
		   * -1693335625);
	    class656_sub1_sub3_sub1_sub1.anInt11999
		= (client.anInt11083
		   + class525_sub38_sub2.method16667(625239036)) * 1584360751;
	}
	if (0 != (i_120_ & 0x20)) {
	    int i_121_ = class525_sub38_sub2.method16624(1482724998);
	    if (i_121_ > 0) {
		for (int i_122_ = 0; i_122_ < i_121_; i_122_++) {
		    int i_123_ = -1;
		    int i_124_ = -1;
		    int i_125_ = -1;
		    int i_126_ = class525_sub38_sub2.method16740((byte) -121);
		    if (i_126_ == 32767) {
			i_126_ = class525_sub38_sub2.method16740((byte) -66);
			i_124_ = class525_sub38_sub2.method16740((byte) -85);
			i_123_ = class525_sub38_sub2.method16740((byte) -34);
			i_125_ = class525_sub38_sub2.method16740((byte) -54);
		    } else if (32766 != i_126_)
			i_124_ = class525_sub38_sub2.method16740((byte) -36);
		    else {
			i_126_ = -1;
			i_124_ = class525_sub38_sub2.method16607(-1571461918);
		    }
		    int i_127_ = class525_sub38_sub2.method16740((byte) -27);
		    class656_sub1_sub3_sub1_sub1.method18634(i_126_, i_124_,
							     i_123_, i_125_,
							     client.anInt11083,
							     i_127_,
							     744394782);
		}
	    }
	    int i_128_ = class525_sub38_sub2.readUnsignedByte(648168483);
	    if (i_128_ > 0) {
		for (int i_129_ = 0; i_129_ < i_128_; i_129_++) {
		    int i_130_ = class525_sub38_sub2.method16740((byte) -105);
		    int i_131_ = class525_sub38_sub2.method16740((byte) -39);
		    if (i_131_ != 32767) {
			int i_132_
			    = class525_sub38_sub2.method16740((byte) -64);
			int i_133_
			    = class525_sub38_sub2.method16607(-1571461918);
			int i_134_
			    = (i_131_ > 0
			       ? class525_sub38_sub2.method16660(1369496428)
			       : i_133_);
			class656_sub1_sub3_sub1_sub1.method18605
			    (i_130_, client.anInt11083, i_131_, i_132_, i_133_,
			     i_134_, -2071819227);
		    } else
			class656_sub1_sub3_sub1_sub1.method18631(i_130_,
								 905208271);
		}
	    }
	}
	if ((i_120_ & 0x1) != 0) {
	    int i_135_ = class525_sub38_sub2.method16668((byte) -8);
	    int i_136_ = class525_sub38_sub2.method16677(-2136023620);
	    if (65535 == i_135_)
		i_135_ = -1;
	    int i_137_ = class525_sub38_sub2.readUnsignedByte(2138361905);
	    int i_138_ = i_137_ & 0x7;
	    int i_139_ = i_137_ >> 3 & 0xf;
	    if (15 == i_139_)
		i_139_ = -1;
	    boolean bool = (i_137_ >> 7 & 0x1) == 1;
	    class656_sub1_sub3_sub1_sub1.method18602(i_135_, i_136_, i_138_,
						     i_139_, bool, 0,
						     -60698217);
	}
	if ((i_120_ & 0x8000) != 0) {
	    int i_140_ = class525_sub38_sub2.method16624(-1891679992);
	    byte[] is = new byte[i_140_];
	    RSBuffer class525_sub38 = new RSBuffer(is);
	    class525_sub38_sub2.method16639(is, 0, i_140_, 313113483);
	    aClass525_Sub38Array1282[i] = class525_sub38;
	    class656_sub1_sub3_sub1_sub1.method18904(class525_sub38,
						     2094306338);
	}
	if ((i_120_ & 0x100) != 0) {
	    int i_141_ = class525_sub38_sub2.method16660(1113161127);
	    int[] is = new int[i_141_];
	    int[] is_142_ = new int[i_141_];
	    int[] is_143_ = new int[i_141_];
	    for (int i_144_ = 0; i_144_ < i_141_; i_144_++) {
		is[i_144_] = class525_sub38_sub2.readBigSmart(-2043778683);
		is_142_[i_144_] = class525_sub38_sub2.method16624(-1078267419);
		is_143_[i_144_] = class525_sub38_sub2.method16668((byte) -45);
	    }
	    Class491.method7989(class656_sub1_sub3_sub1_sub1, is, is_142_,
				is_143_, (byte) 35);
	}
	if ((i_120_ & 0x10) != 0) {
	    class656_sub1_sub3_sub1_sub1.anInt11989
		= class525_sub38_sub2.method16739(907094016) * -1300706795;
	    class656_sub1_sub3_sub1_sub1.anInt11991
		= class525_sub38_sub2.method16663((byte) 30) * 1121862737;
	    class656_sub1_sub3_sub1_sub1.anInt11990
		= class525_sub38_sub2.method16663((byte) 31) * -140650319;
	    class656_sub1_sub3_sub1_sub1.anInt12018
		= class525_sub38_sub2.method16662(-880411526) * 748154517;
	    class656_sub1_sub3_sub1_sub1.anInt11993
		= class525_sub38_sub2.method16662(-880411526) * 31761437;
	    class656_sub1_sub3_sub1_sub1.anInt11968
		= class525_sub38_sub2.method16739(907094016) * -524750117;
	    class656_sub1_sub3_sub1_sub1.anInt11995
		= (class525_sub38_sub2.method16667(273739544)
		   + client.anInt11083) * 1917157447;
	    class656_sub1_sub3_sub1_sub1.anInt11996
		= (class525_sub38_sub2.method16668((byte) 21)
		   + client.anInt11083) * -1392686703;
	    class656_sub1_sub3_sub1_sub1.anInt11997
		= class525_sub38_sub2.method16668((byte) 40) * -1631328201;
	    class656_sub1_sub3_sub1_sub1.anInt12015 = -901267287;
	    class656_sub1_sub3_sub1_sub1.anInt11970 = 0;
	    class656_sub1_sub3_sub1_sub1.anInt11989
		+= (class656_sub1_sub3_sub1_sub1.anIntArray12014[0]
		    * -1300706795);
	    class656_sub1_sub3_sub1_sub1.anInt11991
		+= (1121862737
		    * class656_sub1_sub3_sub1_sub1.anIntArray12017[0]);
	    class656_sub1_sub3_sub1_sub1.anInt11990
		+= (-140650319
		    * class656_sub1_sub3_sub1_sub1.anIntArray12014[0]);
	    class656_sub1_sub3_sub1_sub1.anInt12018
		+= class656_sub1_sub3_sub1_sub1.anIntArray12017[0] * 748154517;
	    class656_sub1_sub3_sub1_sub1.anInt11993
		+= 31761437 * class656_sub1_sub3_sub1_sub1.aByte10867;
	    class656_sub1_sub3_sub1_sub1.anInt11968
		+= -524750117 * class656_sub1_sub3_sub1_sub1.aByte10867;
	}
	if (0 != (i_120_ & 0x2000)) {
	    int i_145_ = class525_sub38_sub2.method16667(1230185697);
	    int i_146_ = class525_sub38_sub2.method16679((byte) -30);
	    if (i_145_ == 65535)
		i_145_ = -1;
	    int i_147_ = class525_sub38_sub2.method16624(-1708465129);
	    int i_148_ = i_147_ & 0x7;
	    int i_149_ = i_147_ >> 3 & 0xf;
	    if (15 == i_149_)
		i_149_ = -1;
	    boolean bool = 1 == (i_147_ >> 7 & 0x1);
	    class656_sub1_sub3_sub1_sub1.method18602(i_145_, i_146_, i_148_,
						     i_149_, bool, 2,
						     2051756787);
	}
	if ((i_120_ & 0x800000) != 0)
	    class656_sub1_sub3_sub1_sub1.aBool12254
		= class525_sub38_sub2.readUnsignedByte(1086615222) == 1;
	if ((i_120_ & 0x1000) != 0) {
	    int i_150_ = class525_sub38_sub2.method16667(469693775);
	    int i_151_ = class525_sub38_sub2.readInt(1218007452);
	    if (i_150_ == 65535)
		i_150_ = -1;
	    int i_152_ = class525_sub38_sub2.method16660(1442887185);
	    int i_153_ = i_152_ & 0x7;
	    int i_154_ = i_152_ >> 3 & 0xf;
	    if (i_154_ == 15)
		i_154_ = -1;
	    boolean bool = 1 == (i_152_ >> 7 & 0x1);
	    class656_sub1_sub3_sub1_sub1.method18602(i_150_, i_151_, i_153_,
						     i_154_, bool, 1,
						     1822627666);
	}
	if ((i_120_ & 0x40) != 0) {
	    class656_sub1_sub3_sub1_sub1.anInt12242
		= class525_sub38_sub2.readUnsignedShort((byte) 47) * -1066304989;
	    if (0 == -2046237799 * class656_sub1_sub3_sub1_sub1.anInt12015) {
		class656_sub1_sub3_sub1_sub1.method18625
		    (class656_sub1_sub3_sub1_sub1.anInt12242 * -1191180917,
		     (byte) 1);
		class656_sub1_sub3_sub1_sub1.anInt12242 = 1066304989;
	    }
	}
	if (0 != (i_120_ & 0x100000)) {
	    int i_155_ = class525_sub38_sub2.method16607(-1571461918);
	    int[] is = new int[i_155_];
	    int[] is_156_ = new int[i_155_];
	    for (int i_157_ = 0; i_157_ < i_155_; i_157_++) {
		int i_158_ = class525_sub38_sub2.method16680(-1806141699);
		if ((i_158_ & 0xc000) == 49152) {
		    int i_159_ = class525_sub38_sub2.method16667(2053287831);
		    is[i_157_] = i_158_ << 16 | i_159_;
		} else
		    is[i_157_] = i_158_;
		is_156_[i_157_] = class525_sub38_sub2.method16680(-666650490);
	    }
	    class656_sub1_sub3_sub1_sub1.method18599(is, is_156_, -1760305247);
	}
	if (0 != (i_120_ & 0x80)) {
	    int i_160_ = class525_sub38_sub2.method16668((byte) 85);
	    if (65535 == i_160_)
		i_160_ = -1;
	    class656_sub1_sub3_sub1_sub1.anInt11983 = 104662899 * i_160_;
	}
	if ((i_120_ & 0x20000) != 0) {
	    int i_161_ = class525_sub38_sub2.readUnsignedShort((byte) 1);
	    int i_162_ = class525_sub38_sub2.method16679((byte) 9);
	    if (65535 == i_161_)
		i_161_ = -1;
	    int i_163_ = class525_sub38_sub2.method16607(-1571461918);
	    int i_164_ = i_163_ & 0x7;
	    int i_165_ = i_163_ >> 3 & 0xf;
	    if (i_165_ == 15)
		i_165_ = -1;
	    boolean bool = 1 == (i_163_ >> 7 & 0x1);
	    class656_sub1_sub3_sub1_sub1.method18602(i_161_, i_162_, i_164_,
						     i_165_, bool, 4,
						     -1646351669);
	}
	if ((i_120_ & 0x10000) != 0) {
	    class656_sub1_sub3_sub1_sub1.anInterface3_11961
		.method19(-711664883);
	    class525_sub38_sub2.pos += 678856942;
	    int i_166_ = ((class525_sub38_sub2.buffer
			   [((class525_sub38_sub2.pos += 339428471)
			     * -1133521593) - 1])
			  & 0xff);
	    for (int i_167_ = 0; i_167_ < i_166_; i_167_++) {
		int i_168_ = class525_sub38_sub2.method16607(-1571461918);
		Class480 class480
		    = ((Class480)
		       Class539.method8888(Class480.method7811(1418351239),
					   i_168_, 1114566037));
		Class447 class447
		    = (Class109.aClass106_Sub1_Sub1_1323.method14522
		       (class525_sub38_sub2, class480, 1005577089));
		class656_sub1_sub3_sub1_sub1.anInterface3_11961.method18
		    (-316828413 * class447.anInt4898, class447.anObject4899,
		     (byte) -105);
	    }
	}
	if ((i_120_ & 0x4) != 0) {
	    int[] is = new int[4];
	    for (int i_169_ = 0; i_169_ < 4; i_169_++)
		is[i_169_] = class525_sub38_sub2.readBigSmart(-2043778683);
	    int i_170_ = class525_sub38_sub2.method16660(759356912);
	    Class453_Sub2.method15917(class656_sub1_sub3_sub1_sub1, is, i_170_,
				      false, -798022472);
	}
	if (0 != (i_120_ & 0x80000)) {
	    String string = class525_sub38_sub2.readString((byte) 12);
	    int i_171_ = class525_sub38_sub2.method16624(1827000941);
	    if (0 != (i_171_ & 0x1))
		Class240.method4427(2, i_171_,
				    class656_sub1_sub3_sub1_sub1
					.method18907(true, 1109442456),
				    class656_sub1_sub3_sub1_sub1
					.method18908(false, (byte) -50),
				    class656_sub1_sub3_sub1_sub1.aString12241,
				    string, null, 381643199);
	    class656_sub1_sub3_sub1_sub1.method18914(string, 0, 0, -954344066);
	}
	if (0 != (i_120_ & 0x200)) {
	    String string = class525_sub38_sub2.readString((byte) 56);
	    if (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
		== class656_sub1_sub3_sub1_sub1)
		Class240.method4427(2, 0,
				    class656_sub1_sub3_sub1_sub1
					.method18907(true, 1109442456),
				    class656_sub1_sub3_sub1_sub1
					.method18908(false, (byte) -23),
				    class656_sub1_sub3_sub1_sub1.aString12241,
				    string, null, 357580326);
	    class656_sub1_sub3_sub1_sub1.method18914(string, 0, 0,
						     -1073793486);
	}
	if (0 != (i_120_ & 0x400)) {
	    class656_sub1_sub3_sub1_sub1.aClass243_12252
		= ((Class243)
		   Class539.method8888(Class243.method4451(-376149392),
				       class525_sub38_sub2
					   .method16607(-1571461918),
				       -1145358428));
	    if (null == class656_sub1_sub3_sub1_sub1.aClass243_12252)
		class656_sub1_sub3_sub1_sub1.aClass243_12252
		    = Class243.aClass243_2417;
	}
	if (0 != (i_120_ & 0x40000)) {
	    class525_sub38_sub2.pos += 678856942;
	    int i_172_ = ((class525_sub38_sub2.buffer
			   [((class525_sub38_sub2.pos += 339428471)
			     * -1133521593) - 1])
			  & 0xff);
	    for (int i_173_ = 0; i_173_ < i_172_; i_173_++) {
		int i_174_ = class525_sub38_sub2.method16660(2005900581);
		Class480 class480
		    = ((Class480)
		       Class539.method8888(Class480.method7811(-405072555),
					   i_174_, 1958809988));
		Class447 class447
		    = (Class109.aClass106_Sub1_Sub1_1323.method14522
		       (class525_sub38_sub2, class480, 1005577089));
		class656_sub1_sub3_sub1_sub1.anInterface3_11961.method18
		    (-316828413 * class447.anInt4898, class447.anObject4899,
		     (byte) -59);
	    }
	}
	if (0 != (i_120_ & 0x8)) {
	    int i_175_ = class525_sub38_sub2.method16607(-1571461918);
	    byte[] is = new byte[i_175_];
	    RSBuffer class525_sub38 = new RSBuffer(is);
	    class525_sub38_sub2.method16759(is, 0, i_175_, (short) 1150);
	    aClass525_Sub38Array1290[i] = class525_sub38;
	    class656_sub1_sub3_sub1_sub1.method18903(class525_sub38, (byte) 5);
	}
	if ((i_120_ & 0x400000) != 0) {
	    int i_176_ = class525_sub38_sub2.method16668((byte) 72);
	    int i_177_ = class525_sub38_sub2.method16679((byte) 74);
	    if (i_176_ == 65535)
		i_176_ = -1;
	    int i_178_ = class525_sub38_sub2.method16607(-1571461918);
	    int i_179_ = i_178_ & 0x7;
	    int i_180_ = i_178_ >> 3 & 0xf;
	    if (15 == i_180_)
		i_180_ = -1;
	    boolean bool = (i_178_ >> 7 & 0x1) == 1;
	    class656_sub1_sub3_sub1_sub1.method18602(i_176_, i_177_, i_179_,
						     i_180_, bool, 3,
						     1188315385);
	}
    }
    
    Class104() throws Throwable {
	throw new Error();
    }
    
    static final void method1905(Class683 class683, byte i) {
	int i_181_ = (class683.anIntArray8661
		      [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_181_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_181_ >> 16];
	Class231.method4388(class259, class245, class683, -863481518);
    }
    
    static final void method1906(Class683 class683, byte i) {
	class683.anInt8662 -= -1189665054;
	int i_182_ = class683.anIntArray8661[class683.anInt8662 * 501271953];
	int i_183_
	    = class683.anIntArray8661[class683.anInt8662 * 501271953 + 1];
	String string
	    = (String) (class683.anObjectArray8636
			[(class683.anInt8644 -= 1285561025) * 1373599041]);
	if (i_182_ == 99)
	    Class268.method4961(string, 2098651067);
	else if (98 == i_182_)
	    Class484.method7843(string, (byte) -124);
	else
	    Class240.method4427(i_182_, i_183_, "", "", "", string, null,
				1299047632);
    }
    
    static void method1907(int i, int i_184_) {
	synchronized (Class72.aClass200_816) {
	    Class72.aClass200_816.method3805(i, 1872736800);
	}
    }
    
    public static void method1908(String string, int i) {
	if (9 == client.anInt11075 * 1777895575) {
	    Class525_Sub15 class525_sub15
		= Class16.method767(Class412.aClass412_4367,
				    client.aClass96_11361.aClass6_1169,
				    1977859884);
	    class525_sub15.aClass525_Sub38_Sub2_10546.method16735(0,
								  -125140748);
	    int i_185_
		= (-1133521593
		   * class525_sub15.aClass525_Sub38_Sub2_10546.pos);
	    class525_sub15.aClass525_Sub38_Sub2_10546.method16700(string,
								  -818360838);
	    class525_sub15.aClass525_Sub38_Sub2_10546.pos
		+= -1918967999;
	    class525_sub15.aClass525_Sub38_Sub2_10546.method16650
		(Class25.anIntArray238, i_185_,
		 (class525_sub15.aClass525_Sub38_Sub2_10546.pos
		  * -1133521593),
		 (byte) -21);
	    class525_sub15.aClass525_Sub38_Sub2_10546.method16617
		((class525_sub15.aClass525_Sub38_Sub2_10546.pos
		  * -1133521593) - i_185_,
		 (byte) 7);
	    client.aClass96_11361.method1794(class525_sub15, (short) 21721);
	    Class251.aClass705_2452 = Class705.aClass705_8797;
	}
    }
}
