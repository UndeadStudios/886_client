/* Class556 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

public class Class556
{
    protected static byte[][][] aByteArrayArrayArray7461;
    static Interface13 anInterface13_7462;
    protected static Class40_Sub11 aClass40_Sub11_7463;
    protected static Class40_Sub2 aClass40_Sub2_7464;
    protected static Class40_Sub17 aClass40_Sub17_7465;
    protected static Interface18 anInterface18_7466;
    static byte[] aByteArray7467;
    public static Class623 aClass623_7468;
    public static Class525_Sub16_Sub6 aClass525_Sub16_Sub6_7469;
    static Class458 aClass458_7470;
    protected static Class458 aClass458_7471;
    protected static Interface20 anInterface20_7472;
    protected static Class709 aClass709_7473;
    static int anInt7474;
    protected static boolean aBool7475;
    protected static int anInt7476;
    static int[] anIntArray7477;
    static byte[] aByteArray7478;
    public static float aFloat7479;
    protected static int anInt7480;
    static int anInt7481;
    static RSBuffer aClass525_Sub38_7482;
    public static int anInt7483;
    public static int anInt7484;
    protected static int anInt7485;
    protected static Class200 aClass200_7486;
    static int[] anIntArray7487;
    static int anInt7488;
    protected static int anInt7489;
    static short[] aShortArray7490;
    static short[] aShortArray7491;
    static byte[] aByteArray7492;
    static Object[] anObjectArray7493;
    static byte[] aByteArray7494;
    protected static boolean aBool7495;
    protected static Class200 aClass200_7496;
    static int[][] anIntArrayArray7497;
    static Interface13 anInterface13_7498 = null;
    static Class10 aClass10_7499;
    static int anInt7500;
    static int anInt7501;
    protected static int anInt7502;
    static int anInt7503;
    static RSBuffer aClass525_Sub38_7504;
    static int anInt7505;
    static HashMap[][][] aHashMapArrayArrayArray7506;
    protected static int anInt7507;
    protected static Class200 aClass200_7508;
    protected static Class529 aClass529_7509;
    static final int anInt7510 = 64;
    static ArrayList anArrayList7511;
    static int anInt7512;
    static int[] anIntArray7513;
    static int anInt7514;
    static boolean[][] aBoolArrayArray7515;
    static short[] aShortArray7516;
    protected static int anInt7517;
    static int anInt7518;
    static int[] anIntArray7519;
    static int[] anIntArray7520;
    protected static int anInt7521;
    protected static int anInt7522;
    protected static int anInt7523;
    protected static int anInt7524;
    protected static int anInt7525;
    public static float aFloat7526;
    protected static int anInt7527;
    protected static int anInt7528;
    static int anInt7529;
    static int anInt7530;
    static boolean[] aBoolArray7531;
    
    static int method9243(Interface13 interface13, Class180 class180, int i,
			  int i_0_, int i_1_) {
	Class658 class658 = (Class658) interface13.method76(i, -1946714588);
	if (class658 == null)
	    return 0;
	int i_2_ = class658.anInt8453 * -1899182957;
	if (i_2_ >= 0 && class180.method3116(i_2_, -1431554601).aBool1819)
	    i_2_ = -1;
	int i_3_;
	if (class658.anInt8452 * 2040702555 >= 0) {
	    int i_4_ = class658.anInt8452 * 2040702555;
	    int i_5_ = (i_4_ & 0x7f) + i_1_;
	    if (i_5_ < 0)
		i_5_ = 0;
	    else if (i_5_ > 127)
		i_5_ = 127;
	    int i_6_ = (i_4_ + i_0_ & 0xfc00) + (i_4_ & 0x380) + i_5_;
	    i_3_ = (~0xffffff
		    | (Class381.anIntArray3929
		       [Class504.method8313(Class615.method10090(i_6_, 96,
								 1929149401),
					    1921832052) & 0xffff]));
	} else if (i_2_ >= 0)
	    i_3_ = ~0xffffff | (Class381.anIntArray3929
				[(Class504.method8313
				  (Class615.method10090((class180.method3116
							 (i_2_, -1431554601)
							 .aShort1834),
							96, 1961407994),
				   2119632347)) & 0xffff]);
	else if (class658.anInt8446 * -1932204261 == -1)
	    i_3_ = 0;
	else {
	    int i_7_ = class658.anInt8446 * -1932204261;
	    int i_8_ = (i_7_ & 0x7f) + i_1_;
	    if (i_8_ < 0)
		i_8_ = 0;
	    else if (i_8_ > 127)
		i_8_ = 127;
	    int i_9_ = (i_7_ + i_0_ & 0xfc00) + (i_7_ & 0x380) + i_8_;
	    i_3_ = (~0xffffff
		    | (Class381.anIntArray3929
		       [Class504.method8313(Class615.method10090(i_9_, 96,
								 1454835448),
					    271005489) & 0xffff]));
	}
	return i_3_;
    }
    
    public static void method9244
	(Class458 class458, Class458 class458_10_, Class40_Sub18 class40_sub18,
	 Class40_Sub14 class40_sub14, Class40_Sub11 class40_sub11,
	 Class40_Sub2 class40_sub2, Class40_Sub17 class40_sub17,
	 Interface20 interface20, Interface18 interface18) {
	aClass458_7470 = class458;
	aClass458_7471 = class458_10_;
	anInterface13_7498 = class40_sub18;
	anInterface13_7462 = class40_sub14;
	aClass40_Sub11_7463 = class40_sub11;
	aClass40_Sub2_7464 = class40_sub2;
	aClass40_Sub17_7465 = class40_sub17;
	anInterface20_7472 = interface20;
	anInterface18_7466 = interface18;
	aClass10_7499.method688((short) 14831);
	int[] is
	    = aClass458_7470.method7540(Class643.aClass643_8330.method80(),
					303458318);
	if (is != null) {
	    for (int i = 0; i < is.length; i++) {
		Class525_Sub16_Sub6 class525_sub16_sub6
		    = Class603.method9982(aClass458_7470, is[i], (byte) 0);
		aClass10_7499.method695(class525_sub16_sub6,
					(long) (class525_sub16_sub6.anInt11777
						* 2044380983));
	    }
	}
	Class455_Sub1.method15988(true, false, 679780902);
    }
    
    static void method9245(Class182 class182, int[] is, int i, int i_11_,
			   int i_12_, int[] is_13_, byte[] is_14_) {
	if (is_13_ != null) {
	    for (int i_15_ = 0; i_15_ < is_13_.length; i_15_++) {
		Class602 class602
		    = (Class602) aClass40_Sub11_7463.method76(is_13_[i_15_],
							      -1082959008);
		int i_16_ = class602.anInt7895 * 1280945471;
		if (i_16_ != -1) {
		    Class79 class79
			= ((Class79)
			   aClass40_Sub17_7465.method76(i_16_, -1029086784));
		    Class157 class157
			= class79.method1574(class182,
					     (class602.aBool7905
					      ? is_14_[i_15_] >> 6 & 0x3 : 0),
					     (class602.aBool7945
					      ? class602.aBool7891 : false),
					     -929502851);
		    int[] is_17_
			= class79.method1578(class182,
					     (class602.aBool7905
					      ? is_14_[i_15_] >> 6 & 0x3 : 0),
					     (class602.aBool7945
					      ? class602.aBool7891 : false),
					     (byte) 63);
		    if (class157 != null) {
			int i_18_ = class157.method12();
			int i_19_ = class157.method2472();
			int i_20_ = i * i_18_ / 64 >> 2;
			int i_21_ = i * i_19_ / 64 >> 2;
			if (class79.aBool837) {
			    int i_22_ = class602.anInt7885 * -2084474039;
			    int i_23_ = class602.anInt7886 * 1437840657;
			    if ((is_14_[i_15_] >> 6 & 0x1) == 1) {
				int i_24_ = i_22_;
				i_22_ = i_23_;
				i_23_ = i_24_;
			    }
			    i_20_ = i_22_ * i / 64;
			    i_21_ = i_23_ * i / 64;
			}
			if (i_20_ != 0 && i_21_ != 0) {
			    int i_25_ = i_11_ * i / 64;
			    int i_26_ = (64 - i_12_) * i / 64 - i_21_ + 1;
			    for (int i_27_ = 0; i_27_ < i_20_; i_27_++) {
				int i_28_ = i_27_ + i_25_;
				if (i_28_ >= 0) {
				    if (i_28_ >= i)
					break;
				    for (int i_29_ = 0; i_29_ < i_21_;
					 i_29_++) {
					int i_30_ = i_29_ + i_26_;
					if (i_30_ >= 0) {
					    if (i_30_ >= i)
						break;
					    int i_31_
						= (is_17_
						   [(i_27_ * i_18_ / i_20_
						     + i_18_ * (i_29_ * i_19_
								/ i_21_))]);
					    int i_32_ = i_31_ >> 24 & 0xff;
					    if (i_32_ != 0)
						is[i_28_ + i * i_30_] = i_31_;
					}
				    }
				}
			    }
			}
		    }
		}
	    }
	}
    }
    
    static int method9246(Class180 class180, int i, int i_33_, int i_34_) {
	return method9254(anInterface13_7498, class180, i, i_33_, i_34_);
    }
    
    static void method9247() {
	aShortArray7516 = null;
	aByteArray7467 = null;
	aShortArray7490 = null;
	aShortArray7491 = null;
	aByteArray7492 = null;
	anObjectArray7493 = null;
	aByteArray7494 = null;
	aHashMapArrayArrayArray7506 = null;
	anIntArray7487 = null;
	aBoolArrayArray7515 = null;
    }
    
    static boolean method9248(Class525_Sub16_Sub6 class525_sub16_sub6) {
	if (class525_sub16_sub6 != null
	    && class525_sub16_sub6 != aClass525_Sub16_Sub6_7469) {
	    aClass525_Sub16_Sub6_7469 = class525_sub16_sub6;
	    aBool7495 = (aClass525_Sub16_Sub6_7469.anInt11777 * 2044380983
			 == aClass623_7468.anInt8103 * -672689321);
	    return true;
	}
	return false;
    }
    
    public static Class525_Sub16_Sub6 method9249(int i, int i_35_) {
	for (Class525_Sub16_Sub6 class525_sub16_sub6
		 = (Class525_Sub16_Sub6) aClass10_7499.method689(305979874);
	     class525_sub16_sub6 != null;
	     class525_sub16_sub6
		 = (Class525_Sub16_Sub6) aClass10_7499.method690((byte) 28)) {
	    if (class525_sub16_sub6.aBool11767
		&& class525_sub16_sub6.method18284(i, i_35_, (byte) 5))
		return class525_sub16_sub6;
	}
	return null;
    }
    
    static Class709 method9250(Class182 class182, int i, int i_36_, int i_37_,
			       int i_38_) {
	for (Class525_Sub37 class525_sub37
		 = (Class525_Sub37) aClass709_7473.method14372((short) -18884);
	     class525_sub37 != null;
	     class525_sub37
		 = (Class525_Sub37) aClass709_7473.method14353(-1509104274))
	    method9309(class182, class525_sub37, i, i_36_, i_37_, i_38_);
	return aClass709_7473;
    }
    
    public static Class697 method9251(int i, int i_39_) {
	Class697 class697 = new Class697();
	for (Class525_Sub16_Sub6 class525_sub16_sub6
		 = (Class525_Sub16_Sub6) aClass10_7499.method689(983468100);
	     class525_sub16_sub6 != null;
	     class525_sub16_sub6
		 = (Class525_Sub16_Sub6) aClass10_7499.method690((byte) -48)) {
	    if (class525_sub16_sub6.aBool11767
		&& class525_sub16_sub6.method18284(i, i_39_, (byte) 5))
		class697.method14184(class525_sub16_sub6, 728171782);
	}
	return class697;
    }
    
    static void method9252(Class182 class182, Class525_Sub37 class525_sub37,
			   int i, int i_40_, int i_41_, int i_42_) {
	class525_sub37.anInt10827
	    = (anInt7525 + (i_41_ + i * (class525_sub37.anInt10826 * 1273194629
					 - anInt7489)
			    >> 16)) * -465270039;
	class525_sub37.anInt10828
	    = (anInt7528
	       - (i_42_ + i_40_ * (class525_sub37.anInt10824 * -1383897689
				   - anInt7524)
		  >> 16)) * -244938849;
    }
    
    static boolean method9253(int i, int i_43_) {
	int i_44_ = i >> 3;
	int i_45_ = i_43_ >> 3;
	if (i_44_ < 0 || i_45_ < 0 || i_44_ >= aBoolArrayArray7515.length
	    || i_45_ >= aBoolArrayArray7515[i_44_].length)
	    return false;
	return aBoolArrayArray7515[i_44_][i_45_];
    }
    
    static int method9254(Interface13 interface13, Class180 class180, int i,
			  int i_46_, int i_47_) {
	Class658 class658 = (Class658) interface13.method76(i, 1805921689);
	if (class658 == null)
	    return 0;
	int i_48_ = class658.anInt8453 * -1899182957;
	if (i_48_ >= 0 && class180.method3116(i_48_, -1431554601).aBool1819)
	    i_48_ = -1;
	int i_49_;
	if (class658.anInt8452 * 2040702555 >= 0) {
	    int i_50_ = class658.anInt8452 * 2040702555;
	    int i_51_ = (i_50_ & 0x7f) + i_47_;
	    if (i_51_ < 0)
		i_51_ = 0;
	    else if (i_51_ > 127)
		i_51_ = 127;
	    int i_52_ = (i_50_ + i_46_ & 0xfc00) + (i_50_ & 0x380) + i_51_;
	    i_49_ = (~0xffffff
		     | (Class381.anIntArray3929
			[Class504.method8313(Class615.method10090(i_52_, 96,
								  1642380366),
					     201570770) & 0xffff]));
	} else if (i_48_ >= 0)
	    i_49_ = ~0xffffff | (Class381.anIntArray3929
				 [(Class504.method8313
				   (Class615.method10090((class180.method3116
							  (i_48_, -1431554601)
							  .aShort1834),
							 96, 1708947643),
				    323108574)) & 0xffff]);
	else if (class658.anInt8446 * -1932204261 == -1)
	    i_49_ = 0;
	else {
	    int i_53_ = class658.anInt8446 * -1932204261;
	    int i_54_ = (i_53_ & 0x7f) + i_47_;
	    if (i_54_ < 0)
		i_54_ = 0;
	    else if (i_54_ > 127)
		i_54_ = 127;
	    int i_55_ = (i_53_ + i_46_ & 0xfc00) + (i_53_ & 0x380) + i_54_;
	    i_49_ = (~0xffffff
		     | (Class381.anIntArray3929
			[Class504.method8313(Class615.method10090(i_55_, 96,
								  2034557085),
					     998439491) & 0xffff]));
	}
	return i_49_;
    }
    
    static boolean method9255(Class182 class182, int i, int i_56_,
			      boolean bool) {
	long l = Class251.method4508((byte) 8);
	if (anInt7517 == 0) {
	    if (aClass525_Sub16_Sub6_7469.anInt11777 * 2044380983
		== aClass623_7468.anInt8120 * 1938296189) {
		int i_57_
		    = aClass458_7471.method7521((aClass525_Sub16_Sub6_7469
						 .aString11776),
						-2116786302);
		if (aClass525_Sub38_7504 == null)
		    aClass525_Sub38_7504
			= (new RSBuffer
			   (aClass458_7471.method7476(i_57_, 0, 1171119577)));
		aClass525_Sub38_7482 = aClass525_Sub38_7504;
		aClass525_Sub38_7482.pos = 0;
	    } else {
		int i_58_
		    = aClass458_7471.method7521((aClass525_Sub16_Sub6_7469
						 .aString11776),
						-2116786302);
		aClass525_Sub38_7482
		    = (new RSBuffer
		       (aClass458_7471.method7476(i_58_, 0, 1860312356)));
	    }
	    int i_59_ = aClass525_Sub38_7482.readUnsignedByte(1430390752);
	    anIntArray7519 = new int[i_59_];
	    for (int i_60_ = 0; i_60_ < i_59_; i_60_++)
		anIntArray7519[i_60_]
		    = aClass525_Sub38_7482.method16740((byte) -6);
	    int i_61_ = aClass525_Sub38_7482.readUnsignedByte(1342477876);
	    anIntArray7520 = new int[i_61_];
	    for (int i_62_ = 0; i_62_ < i_61_; i_62_++)
		anIntArray7520[i_62_]
		    = aClass525_Sub38_7482.method16740((byte) -34);
	}
	while (aClass525_Sub38_7482 != null
	       && (aClass525_Sub38_7482.pos * -1133521593
		   < aClass525_Sub38_7482.buffer.length)
	       && (!bool
		   || Class251.method4508((byte) 8) < l + (long) anInt7512)) {
	    if (aClass525_Sub38_7482.readUnsignedByte(460300117) == 0) {
		int i_63_ = aClass525_Sub38_7482.readUnsignedByte(402470795);
		int i_64_ = aClass525_Sub38_7482.readUnsignedByte(1277806105);
		for (int i_65_ = 0; i_65_ < 8; i_65_++) {
		    int i_66_ = aClass525_Sub38_7482.readUnsignedByte(303860340);
		    int i_67_ = i_63_ * 8 + i_65_ - anInt7483 / 8;
		    for (int i_68_ = 0; i_68_ < 8; i_68_++) {
			int i_69_ = i_64_ * 8 + i_68_ - anInt7484 / 8;
			aBoolArrayArray7515[i_67_][i_69_]
			    = (i_66_ & 1 << i_68_) != 0;
		    }
		}
		for (int i_70_ = 0; i_70_ < 64; i_70_++) {
		    for (int i_71_ = 0; i_71_ < 64; i_71_++) {
			int i_72_ = i_63_ * 64 + i_70_ - anInt7483;
			int i_73_ = i_64_ * 64 + i_71_ - anInt7484;
			method9256(class182, aClass525_Sub38_7482, i_63_,
				   i_64_, i_72_, i_73_, anIntArray7519,
				   anIntArray7520);
		    }
		}
	    } else {
		int i_74_ = aClass525_Sub38_7482.readUnsignedByte(1217541729);
		int i_75_ = aClass525_Sub38_7482.readUnsignedByte(1113651814);
		int i_76_ = aClass525_Sub38_7482.readUnsignedByte(1166989195);
		int i_77_ = aClass525_Sub38_7482.readUnsignedByte(1592486834);
		aBoolArrayArray7515[i_74_ * 8 + i_76_ - anInt7483 / 8]
		    [i_75_ * 8 + i_77_ - anInt7484 / 8]
		    = aClass525_Sub38_7482.readUnsignedByte(247252459) != 0;
		for (int i_78_ = 0; i_78_ < 8; i_78_++) {
		    for (int i_79_ = 0; i_79_ < 8; i_79_++) {
			int i_80_ = i_74_ * 64 + i_76_ * 8 + i_78_ - anInt7483;
			int i_81_ = i_75_ * 64 + i_77_ * 8 + i_79_ - anInt7484;
			method9256(class182, aClass525_Sub38_7482, i_74_,
				   i_75_, i_80_, i_81_, anIntArray7519,
				   anIntArray7520);
		    }
		}
	    }
	}
	if (aClass525_Sub38_7482 != null) {
	    anInt7517 = aClass525_Sub38_7482.pos * -1133521593;
	    if (aClass525_Sub38_7482.pos * -1133521593
		< aClass525_Sub38_7482.buffer.length)
		return false;
	}
	aClass525_Sub38_7482 = null;
	anIntArray7520 = null;
	anIntArray7519 = null;
	if (aShortArray7516 != null) {
	    aByteArray7467 = new byte[anInt7502 * anInt7521];
	    aShortArray7490 = new short[anInt7502 * anInt7521];
	    for (int i_82_ = 0; i_82_ < 3; i_82_++) {
		short[] is = new short[anInt7502 * anInt7521];
		for (int i_83_ = 0;
		     i_83_ < aHashMapArrayArrayArray7506[i_82_].length;
		     i_83_++) {
		    for (int i_84_ = 0;
			 i_84_ < aHashMapArrayArrayArray7506[i_82_][0].length;
			 i_84_++) {
			HashMap hashmap
			    = aHashMapArrayArrayArray7506[i_82_][i_83_][i_84_];
			if (hashmap != null) {
			    Iterator iterator = hashmap.values().iterator();
			    while (iterator.hasNext()) {
				Class528 class528 = (Class528) iterator.next();
				is[(i_83_ * 64 + class528.aByte7133
				    + ((i_84_ * 64 + class528.aByte7135)
				       * anInt7502))]
				    = (short) class528.anInt7134;
			    }
			}
		    }
		}
		method9258(is, aByteArray7467, aShortArray7490, i, i_56_);
		for (int i_85_ = 0;
		     i_85_ < aHashMapArrayArrayArray7506[i_82_].length;
		     i_85_++) {
		    for (int i_86_ = 0;
			 i_86_ < aHashMapArrayArrayArray7506[i_82_][0].length;
			 i_86_++) {
			HashMap hashmap
			    = aHashMapArrayArrayArray7506[i_82_][i_85_][i_86_];
			if (hashmap != null) {
			    Iterator iterator = hashmap.values().iterator();
			    while (iterator.hasNext()) {
				Class528 class528 = (Class528) iterator.next();
				int i_87_
				    = (i_85_ * 64 + class528.aByte7133
				       + ((i_86_ * 64 + class528.aByte7135)
					  * anInt7502));
				class528.anInt7134
				    = ((aByteArray7467[i_87_] & 0xff) << 16
				       | aShortArray7490[i_87_] & 0xffff);
				if (class528.anInt7134 != 0)
				    class528.anInt7134 |= ~0xffffff;
			    }
			}
		    }
		}
	    }
	    method9258(aShortArray7516, aByteArray7467, aShortArray7490, i,
		       i_56_);
	    aShortArray7516 = null;
	}
	if (!bool || Class251.method4508((byte) 8) < l + (long) anInt7512) {
	    method9257();
	    return true;
	}
	return false;
    }
    
    static void method9256(Class182 class182, RSBuffer class525_sub38,
			   int i, int i_88_, int i_89_, int i_90_, int[] is,
			   int[] is_91_) {
	int i_92_ = class525_sub38.readUnsignedByte(1348406550);
	if ((i_92_ & 0x1) == 0) {
	    boolean bool = (i_92_ & 0x2) == 0;
	    int i_93_ = i_92_ >> 2 & 0x3f;
	    if (i_93_ != 62) {
		if (i_93_ == 63)
		    i_93_ = class525_sub38.method16740((byte) -128);
		else if (bool)
		    i_93_ = is[i_93_];
		else
		    i_93_ = is_91_[i_93_];
		if (bool) {
		    aShortArray7516[i_89_ + i_90_ * anInt7502] = (short) i_93_;
		    aShortArray7491[i_89_ + i_90_ * anInt7502] = (short) 0;
		} else {
		    aShortArray7491[i_89_ + i_90_ * anInt7502] = (short) i_93_;
		    aByteArray7492[i_89_ + i_90_ * anInt7502] = (byte) 0;
		    aShortArray7516[i_89_ + i_90_ * anInt7502]
			= (short) class525_sub38.method16740((byte) -126);
		}
	    }
	} else {
	    int i_94_ = (i_92_ >> 1 & 0x3) + 1;
	    boolean bool = (i_92_ & 0x8) != 0;
	    boolean bool_95_ = (i_92_ & 0x10) != 0;
	    for (int i_96_ = 0; i_96_ < i_94_; i_96_++) {
		int i_97_ = class525_sub38.method16740((byte) -108);
		int i_98_ = 0;
		int i_99_ = 0;
		if (bool) {
		    i_98_ = class525_sub38.method16740((byte) -37);
		    i_99_ = class525_sub38.readUnsignedByte(696543762);
		}
		int i_100_ = 0;
		if (bool_95_)
		    i_100_ = class525_sub38.readUnsignedByte(1247651129);
		if (i_96_ == 0) {
		    aShortArray7516[i_89_ + i_90_ * anInt7502] = (short) i_97_;
		    aShortArray7491[i_89_ + i_90_ * anInt7502] = (short) i_98_;
		    aByteArray7492[i_89_ + i_90_ * anInt7502] = (byte) i_99_;
		    if (i_100_ == 1) {
			anObjectArray7493[i_89_ + i_90_ * anInt7502]
			    = new Integer(class525_sub38
					      .readBigSmart(-2043778683));
			aByteArray7494[i_89_ + i_90_ * anInt7502]
			    = class525_sub38.readByte(-1150098071);
		    } else if (i_100_ > 1) {
			int[] is_101_ = new int[i_100_];
			byte[] is_102_ = new byte[i_100_];
			for (int i_103_ = 0; i_103_ < i_100_; i_103_++) {
			    is_101_[i_103_]
				= class525_sub38.readBigSmart(-2043778683);
			    is_102_[i_103_]
				= class525_sub38.readByte(-1150098071);
			}
			anObjectArray7493[i_89_ + i_90_ * anInt7502]
			    = new Class525_Sub35(is_101_, is_102_);
		    }
		} else {
		    int[] is_104_ = null;
		    byte[] is_105_ = null;
		    if (i_100_ > 0) {
			is_104_ = new int[i_100_];
			is_105_ = new byte[i_100_];
			for (int i_106_ = 0; i_106_ < i_100_; i_106_++) {
			    is_104_[i_106_]
				= class525_sub38.readBigSmart(-2043778683);
			    is_105_[i_106_]
				= class525_sub38.readByte(-1150098071);
			}
		    }
		    if ((aHashMapArrayArrayArray7506[i_96_ - 1]
			 [i - (anInt7483 >> 6)][i_88_ - (anInt7484 >> 6)])
			== null)
			aHashMapArrayArrayArray7506[i_96_ - 1]
			    [i - (anInt7483 >> 6)][i_88_ - (anInt7484 >> 6)]
			    = new HashMap();
		    int i_107_ = ((i_89_ & 0x3f) << 8) + (i_90_ & 0x3f);
		    Class528 class528
			= new Class528(i_89_ & 0x3f, i_90_ & 0x3f, i_97_,
				       i_98_, i_99_, is_104_, is_105_);
		    aHashMapArrayArrayArray7506[i_96_ - 1]
			[i - (anInt7483 >> 6)][i_88_ - (anInt7484 >> 6)]
			.put(Integer.valueOf(i_107_), class528);
		}
	    }
	}
    }
    
    static void method9257() {
	for (int i = 0; i < anInt7502; i++) {
	    for (int i_108_ = 0; i_108_ < anInt7521; i_108_++) {
		Object object = anObjectArray7493[i + i_108_ * anInt7502];
		if (object != null) {
		    if (object instanceof Class525_Sub35) {
			Class525_Sub35 class525_sub35
			    = (Class525_Sub35) object;
			if (class525_sub35 != null) {
			    for (int i_109_ = 0;
				 (i_109_
				  < class525_sub35.anIntArray10763.length);
				 i_109_++) {
				Class602 class602
				    = (Class602) (aClass40_Sub11_7463.method76
						  ((class525_sub35
						    .anIntArray10763[i_109_]),
						   1215183681));
				int i_110_ = class602.anInt7918 * 1813512349;
				if (class602.anIntArray7923 != null) {
				    class602
					= (class602.method9909
					   (anInterface20_7472,
					    anInterface18_7466, -1461704867));
				    if (class602 != null)
					i_110_
					    = class602.anInt7918 * 1813512349;
				}
				if (i_110_ != -1) {
				    Class525_Sub37 class525_sub37
					= new Class525_Sub37(i_110_);
				    class525_sub37.anInt10826 = i * 1731219533;
				    class525_sub37.anInt10824
					= i_108_ * 727118359;
				    aClass709_7473.method14345(class525_sub37,
							       (byte) 0);
				}
			    }
			}
		    } else {
			Integer integer = (Integer) object;
			Class602 class602
			    = ((Class602)
			       aClass40_Sub11_7463.method76(integer.intValue(),
							    995774635));
			int i_111_ = class602.anInt7918 * 1813512349;
			if (class602.anIntArray7923 != null) {
			    class602 = class602.method9909(anInterface20_7472,
							   anInterface18_7466,
							   -1528681872);
			    if (class602 != null)
				i_111_ = class602.anInt7918 * 1813512349;
			}
			if (i_111_ != -1) {
			    Class525_Sub37 class525_sub37
				= new Class525_Sub37(i_111_);
			    class525_sub37.anInt10826 = i * 1731219533;
			    class525_sub37.anInt10824 = i_108_ * 727118359;
			    aClass709_7473.method14345(class525_sub37,
						       (byte) 0);
			}
		    }
		}
	    }
	}
	for (int i = 0; i < 3; i++) {
	    for (int i_112_ = 0;
		 i_112_ < aHashMapArrayArrayArray7506[0].length; i_112_++) {
		for (int i_113_ = 0;
		     i_113_ < aHashMapArrayArrayArray7506[0][0].length;
		     i_113_++) {
		    HashMap hashmap
			= aHashMapArrayArrayArray7506[i][i_112_][i_113_];
		    if (hashmap != null) {
			Iterator iterator = hashmap.values().iterator();
			while (iterator.hasNext()) {
			    Class528 class528 = (Class528) iterator.next();
			    if (class528.anIntArray7137 != null) {
				for (int i_114_ = 0;
				     i_114_ < class528.anIntArray7137.length;
				     i_114_++) {
				    Class602 class602
					= ((Class602)
					   (aClass40_Sub11_7463.method76
					    (class528.anIntArray7137[i_114_],
					     729302994)));
				    int i_115_
					= class602.anInt7918 * 1813512349;
				    if (class602.anIntArray7923 != null) {
					class602 = (class602.method9909
						    (anInterface20_7472,
						     anInterface18_7466,
						     -1821437207));
					if (class602 != null)
					    i_115_ = (class602.anInt7918
						      * 1813512349);
				    }
				    if (i_115_ != -1) {
					Class525_Sub37 class525_sub37
					    = new Class525_Sub37(i_115_);
					class525_sub37.anInt10826
					    = ((i_112_ + (anInt7483 >> 6)) * 64
					       + class528.aByte7133
					       - anInt7483) * 1731219533;
					class525_sub37.anInt10824
					    = ((i_113_ + (anInt7484 >> 6)) * 64
					       + class528.aByte7135
					       - anInt7484) * 727118359;
					aClass709_7473.method14345
					    (class525_sub37, (byte) 0);
				    }
				}
			    }
			}
		    }
		}
	    }
	}
    }
    
    static void method9258(short[] is, byte[] is_116_, short[] is_117_, int i,
			   int i_118_) {
	int[] is_119_ = new int[anInt7521];
	int[] is_120_ = new int[anInt7521];
	int[] is_121_ = new int[anInt7521];
	int[] is_122_ = new int[anInt7521];
	int[] is_123_ = new int[anInt7521];
	for (int i_124_ = -5; i_124_ < anInt7502; i_124_++) {
	    int i_125_ = i_124_ + 5;
	    int i_126_ = i_124_ - 5;
	    for (int i_127_ = 0; i_127_ < anInt7521; i_127_++) {
		if (i_125_ < anInt7502) {
		    short i_128_ = is[i_125_ + i_127_ * anInt7502];
		    if (i_128_ > 0) {
			Class23 class23
			    = ((Class23)
			       anInterface13_7462.method76(i_128_ - 1,
							   1423838543));
			is_119_[i_127_] += class23.anInt222 * -42935381;
			is_120_[i_127_] += class23.anInt218 * 337157395;
			is_121_[i_127_] += class23.anInt225 * 1486533035;
			is_122_[i_127_] += class23.anInt226 * -1462290935;
			is_123_[i_127_]++;
		    }
		}
		if (i_126_ >= 0) {
		    short i_129_ = is[i_126_ + i_127_ * anInt7502];
		    if (i_129_ > 0) {
			Class23 class23
			    = ((Class23)
			       anInterface13_7462.method76(i_129_ - 1,
							   -2003869086));
			is_119_[i_127_] -= class23.anInt222 * -42935381;
			is_120_[i_127_] -= class23.anInt218 * 337157395;
			is_121_[i_127_] -= class23.anInt225 * 1486533035;
			is_122_[i_127_] -= class23.anInt226 * -1462290935;
			is_123_[i_127_]--;
		    }
		}
	    }
	    if (i_124_ >= 0) {
		int i_130_ = 0;
		int i_131_ = 0;
		int i_132_ = 0;
		int i_133_ = 0;
		int i_134_ = 0;
		for (int i_135_ = -5; i_135_ < anInt7521; i_135_++) {
		    int i_136_ = i_135_ + 5;
		    if (i_136_ < anInt7521) {
			i_130_ += is_119_[i_136_];
			i_131_ += is_120_[i_136_];
			i_132_ += is_121_[i_136_];
			i_133_ += is_122_[i_136_];
			i_134_ += is_123_[i_136_];
		    }
		    int i_137_ = i_135_ - 5;
		    if (i_137_ >= 0) {
			i_130_ -= is_119_[i_137_];
			i_131_ -= is_120_[i_137_];
			i_132_ -= is_121_[i_137_];
			i_133_ -= is_122_[i_137_];
			i_134_ -= is_123_[i_137_];
		    }
		    if (i_135_ >= 0 && i_134_ > 0) {
			if (is[i_124_ + i_135_ * anInt7502] == 0) {
			    int i_138_ = i_124_ + i_135_ * anInt7502;
			    is_116_[i_138_] = (byte) 0;
			    is_117_[i_138_] = (short) 0;
			} else {
			    int i_139_
				= (i_133_ == 0 ? 0
				   : Class57.method1214(i_130_ * 256 / i_133_,
							i_131_ / i_134_,
							i_132_ / i_134_,
							2092983139));
			    int i_140_ = (i_139_ & 0x7f) + i_118_;
			    if (i_140_ < 0)
				i_140_ = 0;
			    else if (i_140_ > 127)
				i_140_ = 127;
			    int i_141_ = ((i_139_ + i & 0xfc00)
					  + (i_139_ & 0x380) + i_140_);
			    int i_142_ = i_124_ + i_135_ * anInt7502;
			    int i_143_
				= (Class381.anIntArray3929
				   [(Class504.method8313
				     (Class329.method5805(i_141_, 96, 65536),
				      1974135322)) & 0xffff]);
			    is_116_[i_142_] = (byte) (i_143_ >> 16 & 0xff);
			    is_117_[i_142_] = (short) (i_143_ & 0xffff);
			}
		    }
		}
	    }
	}
    }
    
    static void method9259() {
	int[] is = new int[3];
	for (int i = 0; i < aClass529_7509.anInt7140 * -698145127; i++) {
	    boolean bool
		= (aClass525_Sub16_Sub6_7469.method18275
		   (aClass529_7509.anIntArray7139[i] >> 28 & 0x3,
		    aClass529_7509.anIntArray7139[i] >> 14 & 0x3fff,
		    aClass529_7509.anIntArray7139[i] & 0x3fff, is, 37877221));
	    if (bool) {
		Class525_Sub37 class525_sub37
		    = new Class525_Sub37(aClass529_7509.anIntArray7141[i]);
		class525_sub37.anInt10826 = (is[1] - anInt7483) * 1731219533;
		class525_sub37.anInt10824 = (is[2] - anInt7484) * 727118359;
		aClass709_7473.method14345(class525_sub37, (byte) 0);
	    }
	}
    }
    
    static void method9260(int i, int i_144_, int i_145_, int i_146_,
			   int i_147_, int i_148_, int i_149_, int i_150_) {
	anInt7489 = i - anInt7483;
	anInt7522 = i_144_ - anInt7484;
	anInt7523 = i_145_ - anInt7483;
	anInt7524 = i_146_ - anInt7484;
	anInt7525 = i_147_;
	anInt7480 = i_148_;
	anInt7527 = i_149_;
	anInt7528 = i_150_;
    }
    
    static void method9261(Class182 class182, boolean bool, boolean bool_151_,
			   boolean bool_152_, boolean bool_153_) {
	int i = anInt7523 - anInt7489;
	int i_154_ = anInt7522 - anInt7524;
	int i_155_ = (anInt7527 - anInt7525 << 16) / i;
	int i_156_ = (anInt7528 - anInt7480 << 16) / i_154_;
	method9284(class182, bool, bool_151_, i_155_, i_156_, 0, 0, bool_152_,
		   bool_153_);
    }
    
    static void method9262(int i, int i_157_, int i_158_, int i_159_,
			   boolean bool, boolean bool_160_, boolean bool_161_,
			   Class182 class182) {
	int i_162_ = i * 64;
	int i_163_ = i_157_ * 64;
	if (anIntArray7513 == null || anIntArray7513.length != i_158_ * i_158_)
	    anIntArray7513 = new int[i_158_ * i_158_];
	boolean bool_164_ = aBool7495 && !bool_161_;
	for (int i_165_ = 0; i_165_ < 64; i_165_++) {
	    int i_166_ = i_162_ + i_165_;
	    int i_167_ = i_165_ * i_158_ / 64;
	    int i_168_ = (i_165_ + 1) * i_158_ / 64 - 1;
	    if (i_168_ < i_167_)
		i_168_ = i_167_;
	    for (int i_169_ = 0; i_169_ < 64; i_169_++) {
		int i_170_ = i_163_ + i_169_;
		boolean bool_171_ = bool;
		if (bool_164_ && !method9272(i_166_, i_170_))
		    bool_171_ = false;
		int i_172_ = i_166_ + i_170_ * anInt7502;
		boolean bool_173_ = false;
		boolean bool_174_ = false;
		Object object = null;
		int i_175_ = ((aByteArray7467[i_172_] & 0xff) << 16
			      | aShortArray7490[i_172_] & 0xffff);
		if (i_175_ != 0)
		    i_175_ |= ~0xffffff;
		short i_176_ = aShortArray7491[i_172_];
		object = anObjectArray7493[i_172_];
		int i_177_ = i_169_ * i_158_ / 64;
		int i_178_ = (i_169_ + 1) * i_158_ / 64 - 1;
		if (i_178_ < i_177_)
		    i_178_ = i_177_;
		if (object != null) {
		    if (object instanceof Class525_Sub35) {
			Class525_Sub35 class525_sub35
			    = (Class525_Sub35) object;
			if (class525_sub35 != null)
			    method9265(anIntArray7513, i_167_, i_168_, i_177_,
				       i_178_, i_158_, bool_171_, i_175_,
				       i_176_, aByteArray7492[i_172_],
				       class525_sub35.anIntArray10763,
				       class525_sub35.aByteArray10764, true);
		    } else {
			Integer integer = (Integer) object;
			anIntArray7477[0] = integer.intValue();
			aByteArray7478[0] = aByteArray7494[i_172_];
			method9265(anIntArray7513, i_167_, i_168_, i_177_,
				   i_178_, i_158_, bool_171_, i_175_, i_176_,
				   aByteArray7492[i_172_], anIntArray7477,
				   aByteArray7478, true);
		    }
		} else
		    method9265(anIntArray7513, i_167_, i_168_, i_177_, i_178_,
			       i_158_, bool_171_, i_175_, i_176_,
			       aByteArray7492[i_172_], null, null, true);
	    }
	}
	if (bool_160_) {
	    for (int i_179_ = 0; i_179_ < 64; i_179_++) {
		int i_180_ = i_162_ + i_179_;
		boolean bool_181_ = i_179_ == 0 && i_180_ != 0;
		for (int i_182_ = 0; i_182_ < 64; i_182_++) {
		    int i_183_ = i_163_ + i_182_;
		    if (!bool_164_ || method9272(i_180_, i_183_)) {
			boolean bool_184_ = i_182_ == 0 && i_183_ != 0;
			int i_185_ = i_180_ + i_183_ * anInt7502;
			if (bool_181_ && bool_184_)
			    method9266(class182, anIntArray7513, i_158_, -1,
				       -1, i_180_ - 1, i_183_ - 1,
				       i_185_ - 1 - anInt7502);
			if (bool_181_)
			    method9266(class182, anIntArray7513, i_158_, -1,
				       i_182_, i_180_ - 1, i_183_, i_185_ - 1);
			if (bool_184_)
			    method9266(class182, anIntArray7513, i_158_,
				       i_179_, -1, i_180_, i_183_ - 1,
				       i_185_ - anInt7502);
			method9266(class182, anIntArray7513, i_158_, i_179_,
				   i_182_, i_180_, i_183_, i_185_);
		    }
		}
	    }
	}
	int i_186_ = i * 64 / 64;
	int i_187_ = i_157_ * 64 / 64;
	for (int i_188_ = 0; i_188_ < 3; i_188_++) {
	    for (int i_189_ = 0; i_189_ < 64; i_189_++) {
		int i_190_ = i_162_ + i_189_;
		int i_191_ = i_190_ & 0x3f;
		int i_192_ = i_189_ * i_158_ / 64;
		int i_193_ = (i_189_ + 1) * i_158_ / 64 - 1;
		if (i_193_ < i_192_)
		    i_193_ = i_192_;
		for (int i_194_ = 0; i_194_ < 64; i_194_++) {
		    int i_195_ = i_163_ + i_194_;
		    boolean bool_196_ = bool;
		    if (bool_164_ && !method9272(i_190_, i_195_))
			bool_196_ = false;
		    int i_197_ = i_195_ & 0x3f;
		    int i_198_ = i_194_ * i_158_ / 64;
		    int i_199_ = (i_194_ + 1) * i_158_ / 64 - 1;
		    if (i_199_ < i_198_)
			i_199_ = i_198_;
		    HashMap hashmap
			= aHashMapArrayArrayArray7506[i_188_][i_186_][i_187_];
		    if (hashmap != null) {
			Class528 class528
			    = ((Class528)
			       hashmap.get(Integer.valueOf((i_191_ << 8)
							   + i_197_)));
			if (class528 != null)
			    method9265(anIntArray7513, i_192_, i_193_, i_198_,
				       i_199_, i_158_, bool_196_,
				       class528.anInt7134, class528.aShort7132,
				       class528.aByte7136,
				       class528.anIntArray7137,
				       class528.aByteArray7138, false);
		    }
		}
	    }
	    for (int i_200_ = 0; i_200_ < 64; i_200_++) {
		int i_201_ = i_162_ + i_200_;
		int i_202_ = i_201_ & 0x3f;
		for (int i_203_ = 0; i_203_ < 64; i_203_++) {
		    int i_204_ = i_163_ + i_203_;
		    if (!bool_164_ || method9272(i_201_, i_204_)) {
			int i_205_ = i_204_ & 0x3f;
			HashMap hashmap = (aHashMapArrayArrayArray7506[i_188_]
					   [i_186_][i_187_]);
			if (hashmap != null) {
			    Class528 class528
				= ((Class528)
				   hashmap.get(Integer.valueOf((i_202_ << 8)
							       + i_205_)));
			    if (class528 != null)
				method9331(class182, anIntArray7513, i_158_,
					   i_200_, i_203_,
					   class528.anIntArray7137,
					   class528.aByteArray7138);
			}
		    }
		}
	    }
	}
	if (bool_164_) {
	    int i_206_ = 8;
	    for (int i_207_ = 0; i_207_ < i_206_; i_207_++) {
		int i_208_ = i_162_ + i_207_ * 8;
		int i_209_ = i_207_ * i_158_ / i_206_;
		int i_210_ = (i_207_ + 1) * i_158_ / i_206_ - 1;
		for (int i_211_ = 0; i_211_ < i_206_; i_211_++) {
		    int i_212_ = i_163_ + i_211_ * 8;
		    if (!method9272(i_208_, i_212_)) {
			int i_213_ = i_211_ * i_158_ / i_206_;
			int i_214_ = (i_211_ + 1) * i_158_ / i_206_ - 1;
			if (i_158_ < 64)
			    method9277(anIntArray7513, i_209_, i_210_, i_213_,
				       i_214_, i_158_);
			else {
			    aBoolArray7531[anInt7474]
				= method9272(i_208_, i_212_ + 8);
			    aBoolArray7531[anInt7481]
				= method9272(i_208_ + 8, i_212_ + 8);
			    aBoolArray7531[anInt7500]
				= method9272(i_208_ + 8, i_212_);
			    aBoolArray7531[anInt7501]
				= method9272(i_208_ + 8, i_212_ - 8);
			    aBoolArray7531[anInt7514]
				= method9272(i_208_, i_212_ - 8);
			    aBoolArray7531[anInt7503]
				= method9272(i_208_ - 8, i_212_ - 8);
			    aBoolArray7531[anInt7488]
				= method9272(i_208_ - 8, i_212_);
			    aBoolArray7531[anInt7505]
				= method9272(i_208_ - 8, i_212_ + 8);
			    method9276(anIntArray7513, i_209_, i_210_, i_213_,
				       i_214_, i_158_);
			}
		    }
		}
	    }
	}
	aClass200_7496.method3788(class182.method3214(anIntArray7513, 0,
						      i_158_, i_158_, i_158_,
						      true),
				  (long) i_159_);
    }
    
    static void method9263() {
	aShortArray7516 = new short[anInt7502 * anInt7521];
	aShortArray7491 = new short[anInt7502 * anInt7521];
	aByteArray7492 = new byte[anInt7502 * anInt7521];
	anObjectArray7493 = new Object[anInt7502 * anInt7521];
	aByteArray7494 = new byte[anInt7502 * anInt7521];
	aHashMapArrayArrayArray7506
	    = new HashMap[3][anInt7502 >> 6][anInt7521 >> 6];
	anIntArray7487 = new int[anInterface13_7498.method72(1794036610) + 1];
	aBoolArrayArray7515 = new boolean[anInt7502 / 8][anInt7521 / 8];
    }
    
    public static void method9264
	(Class458 class458, Class458 class458_215_,
	 Class40_Sub18 class40_sub18, Class40_Sub14 class40_sub14,
	 Class40_Sub11 class40_sub11, Class40_Sub2 class40_sub2,
	 Class40_Sub17 class40_sub17, Interface20 interface20,
	 Interface18 interface18) {
	aClass458_7470 = class458;
	aClass458_7471 = class458_215_;
	anInterface13_7498 = class40_sub18;
	anInterface13_7462 = class40_sub14;
	aClass40_Sub11_7463 = class40_sub11;
	aClass40_Sub2_7464 = class40_sub2;
	aClass40_Sub17_7465 = class40_sub17;
	anInterface20_7472 = interface20;
	anInterface18_7466 = interface18;
	aClass10_7499.method688((short) 6307);
	int[] is
	    = aClass458_7470.method7540(Class643.aClass643_8330.method80(),
					-1551150153);
	if (is != null) {
	    for (int i = 0; i < is.length; i++) {
		Class525_Sub16_Sub6 class525_sub16_sub6
		    = Class603.method9982(aClass458_7470, is[i], (byte) 0);
		aClass10_7499.method695(class525_sub16_sub6,
					(long) (class525_sub16_sub6.anInt11777
						* 2044380983));
	    }
	}
	Class455_Sub1.method15988(true, false, 679780902);
    }
    
    static void method9265(int[] is, int i, int i_216_, int i_217_, int i_218_,
			   int i_219_, boolean bool, int i_220_, int i_221_,
			   int i_222_, int[] is_223_, byte[] is_224_,
			   boolean bool_225_) {
	if (bool_225_ || i_220_ != 0 || i_221_ > 0) {
	    if (i_221_ == 0)
		method9275(is, i, i_216_, i_217_, i_218_, i_219_, i_219_,
			   i_220_ | ~0xffffff);
	    else {
		int i_226_ = i_222_ & 0x3f;
		if (i_226_ == 0 || anInt7476 == 0) {
		    int i_227_ = anIntArray7487[i_221_];
		    if (bool_225_ || i_227_ != 0)
			method9275(is, i, i_216_, i_217_, i_218_, i_219_,
				   i_219_, i_227_ | ~0xffffff);
		} else {
		    int i_228_ = bool_225_ ? 0 : 1;
		    int i_229_ = Class200.method3829(i_222_ >> 6 & 0x3, i_226_,
						     215215032);
		    i_226_ = Class176.method2904(i_226_, -2129012907);
		    method9280(is, i, i_216_, i_217_, i_218_, i_219_, i_219_,
			       i_220_, anIntArray7487[i_221_],
			       aByteArrayArrayArray7461[i_226_ - 1][i_229_],
			       anInt7476, i_228_);
		}
	    }
	}
	if (bool && is_223_ != null) {
	    int i_230_ = i_216_ - i + 1;
	    int i_231_ = i_218_ - i_217_ + 1;
	    for (int i_232_ = 0; i_232_ < is_223_.length; i_232_++) {
		int i_233_ = is_224_[i_232_] & 0x3f;
		if (i_233_ == Class608.aClass608_7981.anInt7995 * -1214990409
		    || (i_233_
			== Class608.aClass608_7978.anInt7995 * -1214990409)
		    || (i_233_
			== Class608.aClass608_7979.anInt7995 * -1214990409)
		    || (i_233_
			== Class608.aClass608_7980.anInt7995 * -1214990409)) {
		    Class602 class602
			= ((Class602)
			   aClass40_Sub11_7463.method76(is_223_[i_232_],
							-1777279930));
		    if (class602.anInt7895 * 1280945471 == -1) {
			int i_234_ = -3355444;
			if (class602.anInt7888 * 1700857535 == 1)
			    i_234_ = -3407872;
			int i_235_ = is_224_[i_232_] >> 6 & 0x3;
			if (i_233_ == (Class608.aClass608_7981.anInt7995
				       * -1214990409)) {
			    if (i_235_ == 0)
				method9282(is, i, i_218_, i_231_, i_219_,
					   i_234_);
			    else if (i_235_ == 1)
				method9281(is, i, i_218_, i_230_, i_219_,
					   i_234_);
			    else if (i_235_ == 2)
				method9282(is, i_216_, i_218_, i_231_, i_219_,
					   i_234_);
			    else
				method9281(is, i, i_217_, i_230_, i_219_,
					   i_234_);
			} else if (i_233_ == (Class608.aClass608_7978.anInt7995
					      * -1214990409)) {
			    if (i_235_ == 0) {
				method9282(is, i, i_218_, i_231_, i_219_, -1);
				method9281(is, i, i_218_, i_230_, i_219_,
					   i_234_);
			    } else if (i_235_ == 1) {
				method9282(is, i_216_, i_218_, i_231_, i_219_,
					   -1);
				method9281(is, i, i_218_, i_230_, i_219_,
					   i_234_);
			    } else if (i_235_ == 2) {
				method9282(is, i_216_, i_218_, i_231_, i_219_,
					   -1);
				method9281(is, i, i_217_, i_230_, i_219_,
					   i_234_);
			    } else {
				method9282(is, i, i_218_, i_231_, i_219_, -1);
				method9281(is, i, i_217_, i_230_, i_219_,
					   i_234_);
			    }
			} else if (i_233_ == (Class608.aClass608_7979.anInt7995
					      * -1214990409)) {
			    if (i_235_ == 0)
				method9281(is, i, i_218_, 1, i_219_, i_234_);
			    else if (i_235_ == 1)
				method9281(is, i_216_, i_218_, 1, i_219_,
					   i_234_);
			    else if (i_235_ == 2)
				method9281(is, i_216_, i_217_, 1, i_219_,
					   i_234_);
			    else
				method9281(is, i, i_217_, 1, i_219_, i_234_);
			} else if (i_233_ == (Class608.aClass608_7980.anInt7995
					      * -1214990409)) {
			    if (i_235_ == 0 || i_235_ == 2) {
				for (int i_236_ = 0; i_236_ < i_231_; i_236_++)
				    method9281(is, i + i_236_, i_217_ + i_236_,
					       1, i_219_, i_234_);
			    } else {
				for (int i_237_ = 0; i_237_ < i_231_; i_237_++)
				    method9281(is, i + i_237_, i_218_ - i_237_,
					       1, i_219_, i_234_);
			    }
			}
		    }
		}
	    }
	}
    }
    
    static void method9266(Class182 class182, int[] is, int i, int i_238_,
			   int i_239_, int i_240_, int i_241_, int i_242_) {
	Object object = anObjectArray7493[i_242_];
	if (object != null) {
	    if (object instanceof Class525_Sub35) {
		Class525_Sub35 class525_sub35 = (Class525_Sub35) object;
		if (class525_sub35 != null)
		    method9331(class182, is, i, i_238_, i_239_,
			       class525_sub35.anIntArray10763,
			       class525_sub35.aByteArray10764);
	    } else {
		Integer integer = (Integer) object;
		anIntArray7477[0] = integer.intValue();
		aByteArray7478[0]
		    = aByteArray7494[i_240_ + i_241_ * anInt7502];
		method9331(class182, is, i, i_238_, i_239_, anIntArray7477,
			   aByteArray7478);
	    }
	}
    }
    
    static boolean method9267(Class182 class182, int i, int i_243_,
			      boolean bool) {
	long l = Class251.method4508((byte) 8);
	if (anInt7517 == 0) {
	    if (aClass525_Sub16_Sub6_7469.anInt11777 * 2044380983
		== aClass623_7468.anInt8120 * 1938296189) {
		int i_244_
		    = aClass458_7471.method7521((aClass525_Sub16_Sub6_7469
						 .aString11776),
						-2116786302);
		if (aClass525_Sub38_7504 == null)
		    aClass525_Sub38_7504
			= (new RSBuffer
			   (aClass458_7471.method7476(i_244_, 0, 1015072366)));
		aClass525_Sub38_7482 = aClass525_Sub38_7504;
		aClass525_Sub38_7482.pos = 0;
	    } else {
		int i_245_
		    = aClass458_7471.method7521((aClass525_Sub16_Sub6_7469
						 .aString11776),
						-2116786302);
		aClass525_Sub38_7482
		    = new RSBuffer(aClass458_7471.method7476(i_245_, 0,
								   184927574));
	    }
	    int i_246_ = aClass525_Sub38_7482.readUnsignedByte(1092279223);
	    anIntArray7519 = new int[i_246_];
	    for (int i_247_ = 0; i_247_ < i_246_; i_247_++)
		anIntArray7519[i_247_]
		    = aClass525_Sub38_7482.method16740((byte) -94);
	    int i_248_ = aClass525_Sub38_7482.readUnsignedByte(1046114616);
	    anIntArray7520 = new int[i_248_];
	    for (int i_249_ = 0; i_249_ < i_248_; i_249_++)
		anIntArray7520[i_249_]
		    = aClass525_Sub38_7482.method16740((byte) -88);
	}
	while (aClass525_Sub38_7482 != null
	       && (aClass525_Sub38_7482.pos * -1133521593
		   < aClass525_Sub38_7482.buffer.length)
	       && (!bool
		   || Class251.method4508((byte) 8) < l + (long) anInt7512)) {
	    if (aClass525_Sub38_7482.readUnsignedByte(5084329) == 0) {
		int i_250_ = aClass525_Sub38_7482.readUnsignedByte(1037782431);
		int i_251_ = aClass525_Sub38_7482.readUnsignedByte(1060095214);
		for (int i_252_ = 0; i_252_ < 8; i_252_++) {
		    int i_253_ = aClass525_Sub38_7482.readUnsignedByte(972730242);
		    int i_254_ = i_250_ * 8 + i_252_ - anInt7483 / 8;
		    for (int i_255_ = 0; i_255_ < 8; i_255_++) {
			int i_256_ = i_251_ * 8 + i_255_ - anInt7484 / 8;
			aBoolArrayArray7515[i_254_][i_256_]
			    = (i_253_ & 1 << i_255_) != 0;
		    }
		}
		for (int i_257_ = 0; i_257_ < 64; i_257_++) {
		    for (int i_258_ = 0; i_258_ < 64; i_258_++) {
			int i_259_ = i_250_ * 64 + i_257_ - anInt7483;
			int i_260_ = i_251_ * 64 + i_258_ - anInt7484;
			method9256(class182, aClass525_Sub38_7482, i_250_,
				   i_251_, i_259_, i_260_, anIntArray7519,
				   anIntArray7520);
		    }
		}
	    } else {
		int i_261_ = aClass525_Sub38_7482.readUnsignedByte(1489531228);
		int i_262_ = aClass525_Sub38_7482.readUnsignedByte(363036541);
		int i_263_ = aClass525_Sub38_7482.readUnsignedByte(1766486778);
		int i_264_ = aClass525_Sub38_7482.readUnsignedByte(1908828424);
		aBoolArrayArray7515[i_261_ * 8 + i_263_ - anInt7483 / 8]
		    [i_262_ * 8 + i_264_ - anInt7484 / 8]
		    = aClass525_Sub38_7482.readUnsignedByte(1273298818) != 0;
		for (int i_265_ = 0; i_265_ < 8; i_265_++) {
		    for (int i_266_ = 0; i_266_ < 8; i_266_++) {
			int i_267_
			    = i_261_ * 64 + i_263_ * 8 + i_265_ - anInt7483;
			int i_268_
			    = i_262_ * 64 + i_264_ * 8 + i_266_ - anInt7484;
			method9256(class182, aClass525_Sub38_7482, i_261_,
				   i_262_, i_267_, i_268_, anIntArray7519,
				   anIntArray7520);
		    }
		}
	    }
	}
	if (aClass525_Sub38_7482 != null) {
	    anInt7517 = aClass525_Sub38_7482.pos * -1133521593;
	    if (aClass525_Sub38_7482.pos * -1133521593
		< aClass525_Sub38_7482.buffer.length)
		return false;
	}
	aClass525_Sub38_7482 = null;
	anIntArray7520 = null;
	anIntArray7519 = null;
	if (aShortArray7516 != null) {
	    aByteArray7467 = new byte[anInt7502 * anInt7521];
	    aShortArray7490 = new short[anInt7502 * anInt7521];
	    for (int i_269_ = 0; i_269_ < 3; i_269_++) {
		short[] is = new short[anInt7502 * anInt7521];
		for (int i_270_ = 0;
		     i_270_ < aHashMapArrayArrayArray7506[i_269_].length;
		     i_270_++) {
		    for (int i_271_ = 0;
			 (i_271_
			  < aHashMapArrayArrayArray7506[i_269_][0].length);
			 i_271_++) {
			HashMap hashmap = (aHashMapArrayArrayArray7506[i_269_]
					   [i_270_][i_271_]);
			if (hashmap != null) {
			    Iterator iterator = hashmap.values().iterator();
			    while (iterator.hasNext()) {
				Class528 class528 = (Class528) iterator.next();
				is[(i_270_ * 64 + class528.aByte7133
				    + ((i_271_ * 64 + class528.aByte7135)
				       * anInt7502))]
				    = (short) class528.anInt7134;
			    }
			}
		    }
		}
		method9258(is, aByteArray7467, aShortArray7490, i, i_243_);
		for (int i_272_ = 0;
		     i_272_ < aHashMapArrayArrayArray7506[i_269_].length;
		     i_272_++) {
		    for (int i_273_ = 0;
			 (i_273_
			  < aHashMapArrayArrayArray7506[i_269_][0].length);
			 i_273_++) {
			HashMap hashmap = (aHashMapArrayArrayArray7506[i_269_]
					   [i_272_][i_273_]);
			if (hashmap != null) {
			    Iterator iterator = hashmap.values().iterator();
			    while (iterator.hasNext()) {
				Class528 class528 = (Class528) iterator.next();
				int i_274_
				    = (i_272_ * 64 + class528.aByte7133
				       + ((i_273_ * 64 + class528.aByte7135)
					  * anInt7502));
				class528.anInt7134
				    = ((aByteArray7467[i_274_] & 0xff) << 16
				       | aShortArray7490[i_274_] & 0xffff);
				if (class528.anInt7134 != 0)
				    class528.anInt7134 |= ~0xffffff;
			    }
			}
		    }
		}
	    }
	    method9258(aShortArray7516, aByteArray7467, aShortArray7490, i,
		       i_243_);
	    aShortArray7516 = null;
	}
	if (!bool || Class251.method4508((byte) 8) < l + (long) anInt7512) {
	    method9257();
	    return true;
	}
	return false;
    }
    
    static Class709 method9268(Class182 class182) {
	int i = anInt7523 - anInt7489;
	int i_275_ = anInt7522 - anInt7524;
	int i_276_ = (anInt7527 - anInt7525 << 16) / i;
	int i_277_ = (anInt7528 - anInt7480 << 16) / i_275_;
	return method9269(class182, i_276_, i_277_, 0, 0);
    }
    
    static Class709 method9269(Class182 class182, int i, int i_278_,
			       int i_279_, int i_280_) {
	for (Class525_Sub37 class525_sub37
		 = (Class525_Sub37) aClass709_7473.method14372((short) -17911);
	     class525_sub37 != null;
	     class525_sub37
		 = (Class525_Sub37) aClass709_7473.method14353(-1878691196))
	    method9309(class182, class525_sub37, i, i_278_, i_279_, i_280_);
	return aClass709_7473;
    }
    
    static void method9270(int i) {
	Class525_Sub16_Sub6 class525_sub16_sub6
	    = (Class525_Sub16_Sub6) aClass10_7499.method684((long) i);
	if (class525_sub16_sub6 != null
	    && class525_sub16_sub6 != aClass525_Sub16_Sub6_7469) {
	    aClass525_Sub16_Sub6_7469 = class525_sub16_sub6;
	    aBool7495 = (aClass525_Sub16_Sub6_7469.anInt11777 * 2044380983
			 == aClass623_7468.anInt8103 * -672689321);
	}
    }
    
    static void method9271(Class182 class182, Class525_Sub37 class525_sub37,
			   Class287 class287) {
	if (class287.anIntArray3175 != null) {
	    int[] is = new int[class287.anIntArray3175.length];
	    for (int i = 0; i < is.length / 2; i++) {
		int i_281_ = (class287.anIntArray3175[i * 2]
			      + class525_sub37.anInt10826 * 1273194629);
		int i_282_ = (class287.anIntArray3175[i * 2 + 1]
			      + class525_sub37.anInt10824 * -1383897689);
		is[i * 2] = anInt7525 + ((anInt7527 - anInt7525)
					 * (i_281_ - anInt7489)
					 / (anInt7523 - anInt7489));
		is[i * 2 + 1] = anInt7528 - ((anInt7528 - anInt7480)
					     * (i_282_ - anInt7524)
					     / (anInt7522 - anInt7524));
	    }
	    Class167.method2694(class182, is,
				class287.anInt3183 * -2074779725);
	    if (class287.anInt3181 * 668357193 > 0) {
		for (int i = 0; i < is.length / 2 - 1; i++) {
		    int i_283_ = is[i * 2];
		    int i_284_ = is[i * 2 + 1];
		    int i_285_ = is[(i + 1) * 2];
		    int i_286_ = is[(i + 1) * 2 + 1];
		    if (i_285_ < i_283_) {
			int i_287_ = i_283_;
			int i_288_ = i_284_;
			i_283_ = i_285_;
			i_284_ = i_286_;
			i_285_ = i_287_;
			i_286_ = i_288_;
		    } else if (i_285_ == i_283_ && i_286_ < i_284_) {
			int i_289_ = i_284_;
			i_284_ = i_286_;
			i_286_ = i_289_;
		    }
		    class182.method3508(i_283_, i_284_, i_285_, i_286_,
					(class287.anIntArray3165
					 [class287.aByteArray3189[i] & 0xff]),
					1, class287.anInt3181 * 668357193,
					class287.anInt3182 * 310583221,
					class287.anInt3162 * -1258236733);
		}
		int i = is[is.length - 2];
		int i_290_ = is[is.length - 1];
		int i_291_ = is[0];
		int i_292_ = is[1];
		if (i_291_ < i) {
		    int i_293_ = i;
		    int i_294_ = i_290_;
		    i = i_291_;
		    i_290_ = i_292_;
		    i_291_ = i_293_;
		    i_292_ = i_294_;
		} else if (i_291_ == i && i_292_ < i_290_) {
		    int i_295_ = i_290_;
		    i_290_ = i_292_;
		    i_292_ = i_295_;
		}
		class182.method3508(i, i_290_, i_291_, i_292_,
				    (class287.anIntArray3165
				     [((class287.aByteArray3189
					[class287.aByteArray3189.length - 1])
				       & 0xff)]),
				    1, class287.anInt3181 * 668357193,
				    class287.anInt3182 * 310583221,
				    class287.anInt3162 * -1258236733);
	    } else {
		for (int i = 0; i < is.length / 2 - 1; i++)
		    class182.method3194(is[i * 2], is[i * 2 + 1],
					is[(i + 1) * 2], is[(i + 1) * 2 + 1],
					(class287.anIntArray3165
					 [class287.aByteArray3189[i] & 0xff]),
					-2031762223);
		class182.method3194(is[is.length - 2], is[is.length - 1],
				    is[0], is[1],
				    (class287.anIntArray3165
				     [((class287.aByteArray3189
					[class287.aByteArray3189.length - 1])
				       & 0xff)]),
				    -1939167370);
	    }
	}
    }
    
    static boolean method9272(int i, int i_296_) {
	int i_297_ = i >> 3;
	int i_298_ = i_296_ >> 3;
	if (i_297_ < 0 || i_298_ < 0 || i_297_ >= aBoolArrayArray7515.length
	    || i_298_ >= aBoolArrayArray7515[i_297_].length)
	    return false;
	return aBoolArrayArray7515[i_297_][i_298_];
    }
    
    static int method9273() {
	return (int) (64.0F * aFloat7526 / 2.0F);
    }
    
    static int method9274(long l) {
	Class157 class157 = (Class157) aClass200_7496.method3785(l);
	if (class157 != null)
	    return class157.method2503();
	return -1;
    }
    
    static void method9275(int[] is, int i, int i_299_, int i_300_, int i_301_,
			   int i_302_, int i_303_, int i_304_) {
	for (int i_305_ = i; i_305_ <= i_299_; i_305_++) {
	    for (int i_306_ = i_300_; i_306_ <= i_301_; i_306_++)
		is[(i_303_ - i_306_ - 1) * i_302_ + i_305_] = i_304_;
	}
    }
    
    static void method9276(int[] is, int i, int i_307_, int i_308_, int i_309_,
			   int i_310_) {
	int i_311_ = aClass623_7468.anInt8116 * -70148343 >> 24 & 0xff;
	int i_312_ = 255 - i_311_;
	if ((!aBoolArray7531[anInt7474]
	     || !aBoolArray7531[anInt7500] && !aBoolArray7531[anInt7488])
	    && (!aBoolArray7531[anInt7514]
		|| !aBoolArray7531[anInt7500] && !aBoolArray7531[anInt7488])) {
	    method9278(is, i, i_307_, i_308_, i_309_, i_310_, i_311_, i_312_,
		       true, true, true, true);
	    if (aBoolArray7531[anInt7481]) {
		is[(i_310_ - i_309_ - 1) * i_310_ + i_307_]
		    = aClass623_7468.anInt8117 * 425619501;
		is[(i_310_ - i_309_) * i_310_ + i_307_]
		    = aClass623_7468.anInt8117 * 425619501;
		is[(i_310_ - i_309_ - 1) * i_310_ + i_307_ - 1]
		    = aClass623_7468.anInt8117 * 425619501;
	    }
	    if (aBoolArray7531[anInt7501]) {
		is[(i_310_ - i_308_ - 1) * i_310_ + i_307_]
		    = aClass623_7468.anInt8117 * 425619501;
		is[(i_310_ - i_308_ - 2) * i_310_ + i_307_]
		    = aClass623_7468.anInt8117 * 425619501;
		is[(i_310_ - i_308_ - 1) * i_310_ + i_307_ - 1]
		    = aClass623_7468.anInt8117 * 425619501;
	    }
	    if (aBoolArray7531[anInt7503]) {
		is[(i_310_ - i_308_ - 1) * i_310_ + i]
		    = aClass623_7468.anInt8117 * 425619501;
		is[(i_310_ - i_308_ - 2) * i_310_ + i]
		    = aClass623_7468.anInt8117 * 425619501;
		is[(i_310_ - i_308_ - 1) * i_310_ + i + 1]
		    = aClass623_7468.anInt8117 * 425619501;
	    }
	    if (aBoolArray7531[anInt7505]) {
		is[(i_310_ - i_309_ - 1) * i_310_ + i]
		    = aClass623_7468.anInt8117 * 425619501;
		is[(i_310_ - i_309_) * i_310_ + i]
		    = aClass623_7468.anInt8117 * 425619501;
		is[(i_310_ - i_309_ - 1) * i_310_ + i + 1]
		    = aClass623_7468.anInt8117 * 425619501;
	    }
	} else {
	    if (aBoolArray7531[anInt7474] && aBoolArray7531[anInt7500])
		method9279(is,
			   i_307_ - aClass623_7468.anInt8119 * -1016598897 + 1,
			   i_309_ - aClass623_7468.anInt8119 * -1016598897 + 1,
			   i_310_, i_311_, i_312_, anInt7481);
	    else {
		method9278(is,
			   i_307_ - aClass623_7468.anInt8119 * -1016598897 + 1,
			   i_307_,
			   i_309_ - aClass623_7468.anInt8119 * -1016598897 + 1,
			   i_309_, i_310_, i_311_, i_312_, true, true, false,
			   false);
		if (aBoolArray7531[anInt7481]) {
		    is[(i_310_ - i_309_ - 1) * i_310_ + i_307_]
			= aClass623_7468.anInt8117 * 425619501;
		    is[(i_310_ - i_309_) * i_310_ + i_307_]
			= aClass623_7468.anInt8117 * 425619501;
		    is[(i_310_ - i_309_ - 1) * i_310_ + i_307_ - 1]
			= aClass623_7468.anInt8117 * 425619501;
		}
	    }
	    if (aBoolArray7531[anInt7514] && aBoolArray7531[anInt7500])
		method9279(is,
			   i_307_ - aClass623_7468.anInt8119 * -1016598897 + 1,
			   i_308_, i_310_, i_311_, i_312_, anInt7501);
	    else {
		method9278(is,
			   i_307_ - aClass623_7468.anInt8119 * -1016598897 + 1,
			   i_307_, i_308_,
			   i_308_ + aClass623_7468.anInt8119 * -1016598897 - 1,
			   i_310_, i_311_, i_312_, false, true, true, false);
		if (aBoolArray7531[anInt7501]) {
		    is[(i_310_ - i_308_ - 1) * i_310_ + i_307_]
			= aClass623_7468.anInt8117 * 425619501;
		    is[(i_310_ - i_308_ - 2) * i_310_ + i_307_]
			= aClass623_7468.anInt8117 * 425619501;
		    is[(i_310_ - i_308_ - 1) * i_310_ + i_307_ - 1]
			= aClass623_7468.anInt8117 * 425619501;
		}
	    }
	    if (aBoolArray7531[anInt7514] && aBoolArray7531[anInt7488])
		method9279(is, i, i_308_, i_310_, i_311_, i_312_, anInt7503);
	    else {
		method9278(is, i,
			   i + aClass623_7468.anInt8119 * -1016598897 - 1,
			   i_308_,
			   i_308_ + aClass623_7468.anInt8119 * -1016598897 - 1,
			   i_310_, i_311_, i_312_, false, false, true, true);
		if (aBoolArray7531[anInt7503]) {
		    is[(i_310_ - i_308_ - 1) * i_310_ + i]
			= aClass623_7468.anInt8117 * 425619501;
		    is[(i_310_ - i_308_ - 2) * i_310_ + i]
			= aClass623_7468.anInt8117 * 425619501;
		    is[(i_310_ - i_308_ - 1) * i_310_ + i + 1]
			= aClass623_7468.anInt8117 * 425619501;
		}
	    }
	    if (aBoolArray7531[anInt7474] && aBoolArray7531[anInt7488])
		method9279(is, i,
			   i_309_ - aClass623_7468.anInt8119 * -1016598897 + 1,
			   i_310_, i_311_, i_312_, anInt7505);
	    else {
		method9278(is, i,
			   i + aClass623_7468.anInt8119 * -1016598897 - 1,
			   i_309_ - aClass623_7468.anInt8119 * -1016598897 + 1,
			   i_309_, i_310_, i_311_, i_312_, true, false, false,
			   true);
		if (aBoolArray7531[anInt7505]) {
		    is[(i_310_ - i_309_ - 1) * i_310_ + i]
			= aClass623_7468.anInt8117 * 425619501;
		    is[(i_310_ - i_309_) * i_310_ + i]
			= aClass623_7468.anInt8117 * 425619501;
		    is[(i_310_ - i_309_ - 1) * i_310_ + i + 1]
			= aClass623_7468.anInt8117 * 425619501;
		}
	    }
	    if (i + aClass623_7468.anInt8119 * -1016598897
		< i_307_ - aClass623_7468.anInt8119 * -1016598897)
		method9278(is, i + aClass623_7468.anInt8119 * -1016598897,
			   i_307_ - aClass623_7468.anInt8119 * -1016598897,
			   i_308_, i_309_, i_310_, i_311_, i_312_, true, false,
			   true, false);
	    if (i_308_ + aClass623_7468.anInt8119 * -1016598897 + 1
		< i_309_ - aClass623_7468.anInt8119 * -1016598897 - 1) {
		method9278(is, i,
			   i + aClass623_7468.anInt8119 * -1016598897 - 1,
			   i_308_ + aClass623_7468.anInt8119 * -1016598897,
			   i_309_ - aClass623_7468.anInt8119 * -1016598897,
			   i_310_, i_311_, i_312_, false, false, false, true);
		method9278(is,
			   i_307_ - aClass623_7468.anInt8119 * -1016598897 + 1,
			   i_307_,
			   i_308_ + aClass623_7468.anInt8119 * -1016598897,
			   i_309_ - aClass623_7468.anInt8119 * -1016598897,
			   i_310_, i_311_, i_312_, false, true, false, false);
	    }
	}
    }
    
    static void method9277(int[] is, int i, int i_313_, int i_314_, int i_315_,
			   int i_316_) {
	int i_317_ = aClass623_7468.anInt8116 * -70148343 >> 24 & 0xff;
	int i_318_ = 255 - i_317_;
	for (int i_319_ = i; i_319_ <= i_313_; i_319_++) {
	    for (int i_320_ = i_314_; i_320_ <= i_315_; i_320_++) {
		int i_321_ = is[(i_316_ - i_320_ - 1) * i_316_ + i_319_];
		if (i_321_ != anInt7529) {
		    anInt7529 = i_321_;
		    anInt7530 = (~0xffffff
				 | ((((aClass623_7468.anInt8116 * -70148343
				       & 0xff00ff) * i_317_
				      + (i_321_ & 0xff00ff) * i_318_)
				     & ~0xff00ff)
				    + (((aClass623_7468.anInt8116 * -70148343
					 & 0xff00) * i_317_
					+ (i_321_ & 0xff00) * i_318_)
				       & 0xff0000)) >> 8);
		}
		is[(i_316_ - i_320_ - 1) * i_316_ + i_319_] = anInt7530;
	    }
	}
    }
    
    static void method9278(int[] is, int i, int i_322_, int i_323_, int i_324_,
			   int i_325_, int i_326_, int i_327_, boolean bool,
			   boolean bool_328_, boolean bool_329_,
			   boolean bool_330_) {
	for (int i_331_ = i; i_331_ <= i_322_; i_331_++) {
	    boolean bool_332_
		= bool_328_ ? (aBoolArray7531[anInt7500]
			       && i_322_ - i_331_ < (aClass623_7468.anInt8108
						     * 1785499363)) : false;
	    boolean bool_333_
		= (bool_330_
		   ? (aBoolArray7531[anInt7488]
		      && i_331_ - i < aClass623_7468.anInt8108 * 1785499363)
		   : false);
	    for (int i_334_ = i_323_; i_334_ <= i_324_; i_334_++) {
		if (bool_332_ || bool_333_)
		    is[(i_325_ - i_334_ - 1) * i_325_ + i_331_]
			= aClass623_7468.anInt8117 * 425619501;
		else {
		    boolean bool_335_
			= (bool
			   ? (aBoolArray7531[anInt7474]
			      && (i_324_ - i_334_
				  < aClass623_7468.anInt8108 * 1785499363))
			   : false);
		    boolean bool_336_
			= (bool_329_
			   ? (aBoolArray7531[anInt7514]
			      && (i_334_ - i_323_
				  < aClass623_7468.anInt8108 * 1785499363))
			   : false);
		    if (bool_335_ || bool_336_)
			is[(i_325_ - i_334_ - 1) * i_325_ + i_331_]
			    = aClass623_7468.anInt8117 * 425619501;
		    else {
			int i_337_
			    = is[(i_325_ - i_334_ - 1) * i_325_ + i_331_];
			if (i_337_ != anInt7529) {
			    anInt7529 = i_337_;
			    anInt7530
				= (~0xffffff
				   | ((((aClass623_7468.anInt8116 * -70148343
					 & 0xff00ff) * i_326_
					+ (i_337_ & 0xff00ff) * i_327_)
				       & ~0xff00ff)
				      + (((aClass623_7468.anInt8116 * -70148343
					   & 0xff00) * i_326_
					  + (i_337_ & 0xff00) * i_327_)
					 & 0xff0000)) >> 8);
			}
			is[(i_325_ - i_334_ - 1) * i_325_ + i_331_]
			    = anInt7530;
		    }
		}
	    }
	}
    }
    
    static void method9279(int[] is, int i, int i_338_, int i_339_, int i_340_,
			   int i_341_, int i_342_) {
	for (int i_343_ = 0; i_343_ < aClass623_7468.anInt8119 * -1016598897;
	     i_343_++) {
	    int i_344_ = i_343_;
	    if (i_342_ == anInt7481 || i_342_ == anInt7501)
		i_344_ = aClass623_7468.anInt8119 * -1016598897 - i_343_ - 1;
	    for (int i_345_ = 0;
		 i_345_ < aClass623_7468.anInt8119 * -1016598897; i_345_++) {
		int i_346_ = i_345_;
		if (i_342_ == anInt7501 || i_342_ == anInt7503)
		    i_346_
			= aClass623_7468.anInt8119 * -1016598897 - i_345_ - 1;
		int i_347_ = anIntArrayArray7497[i_344_][i_346_];
		if (i_347_ != 0) {
		    if (i_347_ == 1) {
			int i_348_
			    = is[((i_339_ - i_338_ - i_345_ - 1) * i_339_ + i
				  + i_343_)];
			if (i_348_ != anInt7529) {
			    anInt7529 = i_348_;
			    anInt7530
				= (~0xffffff
				   | ((((aClass623_7468.anInt8116 * -70148343
					 & 0xff00ff) * i_340_
					+ (i_348_ & 0xff00ff) * i_341_)
				       & ~0xff00ff)
				      + (((aClass623_7468.anInt8116 * -70148343
					   & 0xff00) * i_340_
					  + (i_348_ & 0xff00) * i_341_)
					 & 0xff0000)) >> 8);
			}
			is[((i_339_ - i_338_ - i_345_ - 1) * i_339_ + i
			    + i_343_)]
			    = anInt7530;
		    } else if (i_347_ == 2)
			is[((i_339_ - i_338_ - i_345_ - 1) * i_339_ + i
			    + i_343_)]
			    = aClass623_7468.anInt8117 * 425619501;
		}
	    }
	}
    }
    
    static void method9280(int[] is, int i, int i_349_, int i_350_, int i_351_,
			   int i_352_, int i_353_, int i_354_, int i_355_,
			   byte[] is_356_, int i_357_, int i_358_) {
	int i_359_ = 0;
	int i_360_ = 0;
	int i_361_ = i_349_ - i + 1;
	int i_362_ = i_351_ - i_350_ + 1;
	int i_363_ = (i_357_ << 16) / i_361_;
	int i_364_ = (is_356_.length / i_357_ << 16) / i_362_;
	int i_365_ = i + (i_353_ - i_351_ - 1) * i_352_;
	int i_366_ = i_354_ >> 24;
	int i_367_ = i_355_ >> 24;
	if (i_358_ == 0 || i_358_ == 1 && i_366_ == 255 && i_367_ == 255) {
	    int i_368_ = i_359_;
	    for (int i_369_ = -i_362_; i_369_ < 0; i_369_++) {
		int i_370_ = (i_360_ >> 16) * i_357_;
		for (int i_371_ = -i_361_; i_371_ < 0; i_371_++) {
		    if (is_356_[(i_359_ >> 16) + i_370_] != 0)
			is[i_365_++] = i_355_;
		    else
			is[i_365_++] = i_354_;
		    i_359_ += i_363_;
		}
		i_360_ += i_364_;
		i_359_ = i_368_;
		i_365_ += i_352_ - i_361_;
	    }
	} else if (i_358_ == 1) {
	    int i_372_ = i_359_;
	    for (int i_373_ = -i_362_; i_373_ < 0; i_373_++) {
		int i_374_ = (i_360_ >> 16) * i_357_;
		for (int i_375_ = -i_361_; i_375_ < 0; i_375_++) {
		    int i_376_ = i_354_;
		    if (is_356_[(i_359_ >> 16) + i_374_] != 0)
			i_376_ = i_355_;
		    int i_377_ = i_376_ >>> 24;
		    int i_378_ = 255 - i_377_;
		    int i_379_ = is[i_365_];
		    is[i_365_++]
			= ~0xffffff | ((((i_376_ & 0xff00ff) * i_377_
					 + (i_379_ & 0xff00ff) * i_378_)
					& ~0xff00ff)
				       + (((i_376_ & 0xff00) * i_377_
					   + (i_379_ & 0xff00) * i_378_)
					  & 0xff0000)) >> 8;
		    i_359_ += i_363_;
		}
		i_360_ += i_364_;
		i_359_ = i_372_;
		i_365_ += i_352_ - i_361_;
	    }
	} else
	    throw new IllegalArgumentException();
    }
    
    static void method9281(int[] is, int i, int i_380_, int i_381_, int i_382_,
			   int i_383_) {
	int i_384_ = i + (i_382_ - i_380_ - 1) * i_382_;
	for (int i_385_ = 0; i_385_ < i_381_; i_385_++)
	    is[i_384_ + i_385_] = i_383_;
    }
    
    static void method9282(int[] is, int i, int i_386_, int i_387_, int i_388_,
			   int i_389_) {
	int i_390_ = i + (i_388_ - i_386_ - 1) * i_388_;
	for (int i_391_ = 0; i_391_ < i_387_; i_391_++)
	    is[i_390_ + i_391_ * i_388_] = i_389_;
    }
    
    static {
	anInterface13_7462 = null;
	aClass10_7499 = new Class10(16);
	anInt7507 = (int) (Math.random() * 11.0) - 5;
	anInt7485 = (int) (Math.random() * 17.0) - 8;
	anIntArray7477 = new int[1];
	aByteArray7478 = new byte[1];
	aClass709_7473 = new Class709();
	aBool7495 = true;
	anIntArrayArray7497
	    = new int[][] { { 2, 2, 0, 0, 0, 0 }, { 2, 2, 2, 0, 0, 0 },
			    { 1, 2, 2, 2, 0, 0 }, { 1, 1, 1, 2, 2, 0 },
			    { 1, 1, 1, 2, 2, 2 }, { 1, 1, 1, 1, 2, 2 } };
	anInt7474 = Class682.aClass682_8627.method80();
	anInt7481 = Class682.aClass682_8634.method80();
	anInt7500 = Class682.aClass682_8628.method80();
	anInt7501 = Class682.aClass682_8631.method80();
	anInt7514 = Class682.aClass682_8630.method80();
	anInt7503 = Class682.aClass682_8633.method80();
	anInt7488 = Class682.aClass682_8632.method80();
	anInt7505 = Class682.aClass682_8626.method80();
	aClass200_7486 = new Class200(4096, 256);
	aClass200_7508 = new Class200(4096, 1024);
	aClass200_7496 = aClass200_7486;
	anArrayList7511 = new ArrayList();
	anInt7518 = 262144;
	anInt7517 = 0;
	anInt7512 = 5;
	aClass525_Sub38_7482 = null;
	aClass525_Sub38_7504 = null;
	aBool7475 = true;
	new Date();
	anInt7529 = 0;
	anInt7530 = 0;
	aBoolArray7531 = new boolean[8];
    }
    
    static void method9283(Class182 class182, boolean bool, boolean bool_392_,
			   boolean bool_393_, boolean bool_394_) {
	int i = anInt7523 - anInt7489;
	int i_395_ = anInt7522 - anInt7524;
	int i_396_ = (anInt7527 - anInt7525 << 16) / i;
	int i_397_ = (anInt7528 - anInt7480 << 16) / i_395_;
	method9284(class182, bool, bool_392_, i_396_, i_397_, 0, 0, bool_393_,
		   bool_394_);
    }
    
    static void method9284(Class182 class182, boolean bool, boolean bool_398_,
			   int i, int i_399_, int i_400_, int i_401_,
			   boolean bool_402_, boolean bool_403_) {
	int i_404_ = anInt7523 - anInt7489;
	int i_405_ = anInt7522 - anInt7524;
	if (anInt7523 < anInt7502)
	    i_404_++;
	if (anInt7522 < anInt7521)
	    i_405_++;
	int i_406_ = anInt7489 / 64;
	int i_407_ = anInt7524 / 64;
	int i_408_ = (anInt7489 + i_404_) / 64;
	int i_409_ = (anInt7524 + i_405_) / 64;
	int i_410_;
	int i_411_;
	if (bool_403_) {
	    i_410_ = (anInt7527 - anInt7525) / ((anInt7523 - anInt7489) / 64);
	    i_411_ = i_410_;
	} else {
	    i_410_ = method9273();
	    i_411_ = (int) Math.ceil((double) (64.0F * aFloat7479 / 2.0F));
	}
	anArrayList7511.clear();
	int i_412_ = 0;
	int i_413_ = i_410_ * i_410_;
	for (int i_414_ = i_406_; i_414_ <= i_408_; i_414_++) {
	    for (int i_415_ = i_407_; i_415_ <= i_409_; i_415_++) {
		int i_416_ = (i_414_ << 16) + i_415_;
		int i_417_ = method9274((long) i_416_);
		if (i_417_ != i_410_) {
		    if (i_414_ < 0 || i_414_ * 64 >= anInt7502 || i_415_ < 0
			|| i_415_ * 64 >= anInt7521)
			method9320(class182, i_414_, i_415_, i_410_, i_416_);
		    else if (i_417_ == -1) {
			method9262(i_414_, i_415_, i_410_, i_416_, bool,
				   bool_398_, bool_402_, class182);
			i_412_ += i_413_;
		    } else
			anArrayList7511.add(Integer.valueOf(i_416_));
		}
	    }
	}
	if (!anArrayList7511.isEmpty() && i_412_ < anInt7518) {
	    for (Iterator iterator = anArrayList7511.iterator();
		 i_412_ < anInt7518 && iterator.hasNext(); i_412_ += i_413_) {
		int i_418_ = ((Integer) iterator.next()).intValue();
		int i_419_ = i_418_ >> 16 & 0xffff;
		int i_420_ = i_418_ & 0xffff;
		method9262(i_419_, i_420_, i_410_, i_418_, bool, bool_398_,
			   bool_402_, class182);
	    }
	}
	for (int i_421_ = i_406_; i_421_ <= i_408_; i_421_++) {
	    int i_422_ = i_421_ * 64;
	    int i_423_ = i_422_ - anInt7489;
	    int i_424_ = i_411_;
	    int i_425_ = (i_400_ + i * i_423_ >> 16) + anInt7525;
	    int i_426_ = (i_400_ + i * (i_423_ + 64) >> 16) + anInt7525;
	    if (i_425_ + i_424_ != i_426_)
		i_424_ = i_426_ - i_425_;
	    for (int i_427_ = i_407_; i_427_ <= i_409_; i_427_++) {
		int i_428_ = i_427_ * 64;
		int i_429_ = i_428_ - anInt7524;
		int i_430_ = (i_421_ << 16) + i_427_;
		int i_431_ = i_411_;
		int i_432_ = anInt7528 - (i_401_ + i_399_ * i_429_ >> 16);
		int i_433_
		    = anInt7528 - (i_401_ + i_399_ * (i_429_ + 64) >> 16);
		if (i_432_ - i_431_ != i_433_)
		    i_431_ = i_432_ - i_433_;
		i_432_ -= i_431_;
		Class157 class157
		    = (Class157) aClass200_7496.method3785((long) i_430_);
		if (class157 == null)
		    throw new RuntimeException();
		if (class157.method2503() == i_424_
		    && class157.method2471() == i_431_)
		    class157.method2518(i_425_, i_432_);
		else
		    class157.method2481(i_425_, i_432_, i_424_, i_431_);
	    }
	}
    }
    
    public static void method9285
	(Class458 class458, Class458 class458_434_,
	 Class40_Sub18 class40_sub18, Class40_Sub14 class40_sub14,
	 Class40_Sub11 class40_sub11, Class40_Sub2 class40_sub2,
	 Class40_Sub17 class40_sub17, Interface20 interface20,
	 Interface18 interface18) {
	aClass458_7470 = class458;
	aClass458_7471 = class458_434_;
	anInterface13_7498 = class40_sub18;
	anInterface13_7462 = class40_sub14;
	aClass40_Sub11_7463 = class40_sub11;
	aClass40_Sub2_7464 = class40_sub2;
	aClass40_Sub17_7465 = class40_sub17;
	anInterface20_7472 = interface20;
	anInterface18_7466 = interface18;
	aClass10_7499.method688((short) 7646);
	int[] is
	    = aClass458_7470.method7540(Class643.aClass643_8330.method80(),
					-2072949089);
	if (is != null) {
	    for (int i = 0; i < is.length; i++) {
		Class525_Sub16_Sub6 class525_sub16_sub6
		    = Class603.method9982(aClass458_7470, is[i], (byte) 0);
		aClass10_7499.method695(class525_sub16_sub6,
					(long) (class525_sub16_sub6.anInt11777
						* 2044380983));
	    }
	}
	Class455_Sub1.method15988(true, false, 679780902);
    }
    
    static void method9286(Class182 class182, Class525_Sub37 class525_sub37,
			   Class287 class287) {
	if (class287.anIntArray3175 != null) {
	    int[] is = new int[class287.anIntArray3175.length];
	    for (int i = 0; i < is.length / 2; i++) {
		int i_435_ = (class287.anIntArray3175[i * 2]
			      + class525_sub37.anInt10826 * 1273194629);
		int i_436_ = (class287.anIntArray3175[i * 2 + 1]
			      + class525_sub37.anInt10824 * -1383897689);
		is[i * 2] = anInt7525 + ((anInt7527 - anInt7525)
					 * (i_435_ - anInt7489)
					 / (anInt7523 - anInt7489));
		is[i * 2 + 1] = anInt7528 - ((anInt7528 - anInt7480)
					     * (i_436_ - anInt7524)
					     / (anInt7522 - anInt7524));
	    }
	    Class167.method2694(class182, is,
				class287.anInt3183 * -2074779725);
	    if (class287.anInt3181 * 668357193 > 0) {
		for (int i = 0; i < is.length / 2 - 1; i++) {
		    int i_437_ = is[i * 2];
		    int i_438_ = is[i * 2 + 1];
		    int i_439_ = is[(i + 1) * 2];
		    int i_440_ = is[(i + 1) * 2 + 1];
		    if (i_439_ < i_437_) {
			int i_441_ = i_437_;
			int i_442_ = i_438_;
			i_437_ = i_439_;
			i_438_ = i_440_;
			i_439_ = i_441_;
			i_440_ = i_442_;
		    } else if (i_439_ == i_437_ && i_440_ < i_438_) {
			int i_443_ = i_438_;
			i_438_ = i_440_;
			i_440_ = i_443_;
		    }
		    class182.method3508(i_437_, i_438_, i_439_, i_440_,
					(class287.anIntArray3165
					 [class287.aByteArray3189[i] & 0xff]),
					1, class287.anInt3181 * 668357193,
					class287.anInt3182 * 310583221,
					class287.anInt3162 * -1258236733);
		}
		int i = is[is.length - 2];
		int i_444_ = is[is.length - 1];
		int i_445_ = is[0];
		int i_446_ = is[1];
		if (i_445_ < i) {
		    int i_447_ = i;
		    int i_448_ = i_444_;
		    i = i_445_;
		    i_444_ = i_446_;
		    i_445_ = i_447_;
		    i_446_ = i_448_;
		} else if (i_445_ == i && i_446_ < i_444_) {
		    int i_449_ = i_444_;
		    i_444_ = i_446_;
		    i_446_ = i_449_;
		}
		class182.method3508(i, i_444_, i_445_, i_446_,
				    (class287.anIntArray3165
				     [((class287.aByteArray3189
					[class287.aByteArray3189.length - 1])
				       & 0xff)]),
				    1, class287.anInt3181 * 668357193,
				    class287.anInt3182 * 310583221,
				    class287.anInt3162 * -1258236733);
	    } else {
		for (int i = 0; i < is.length / 2 - 1; i++)
		    class182.method3194(is[i * 2], is[i * 2 + 1],
					is[(i + 1) * 2], is[(i + 1) * 2 + 1],
					(class287.anIntArray3165
					 [class287.aByteArray3189[i] & 0xff]),
					-2129046481);
		class182.method3194(is[is.length - 2], is[is.length - 1],
				    is[0], is[1],
				    (class287.anIntArray3165
				     [((class287.aByteArray3189
					[class287.aByteArray3189.length - 1])
				       & 0xff)]),
				    -2146624226);
	    }
	}
    }
    
    static void method9287() {
	aShortArray7516 = new short[anInt7502 * anInt7521];
	aShortArray7491 = new short[anInt7502 * anInt7521];
	aByteArray7492 = new byte[anInt7502 * anInt7521];
	anObjectArray7493 = new Object[anInt7502 * anInt7521];
	aByteArray7494 = new byte[anInt7502 * anInt7521];
	aHashMapArrayArrayArray7506
	    = new HashMap[3][anInt7502 >> 6][anInt7521 >> 6];
	anIntArray7487 = new int[anInterface13_7498.method72(1210607136) + 1];
	aBoolArrayArray7515 = new boolean[anInt7502 / 8][anInt7521 / 8];
    }
    
    static void method9288() {
	aShortArray7516 = null;
	aByteArray7467 = null;
	aShortArray7490 = null;
	aShortArray7491 = null;
	aByteArray7492 = null;
	anObjectArray7493 = null;
	aByteArray7494 = null;
	aHashMapArrayArrayArray7506 = null;
	anIntArray7487 = null;
	aBoolArrayArray7515 = null;
    }
    
    public static Class525_Sub16_Sub6 method9289(int i) {
	return (Class525_Sub16_Sub6) aClass10_7499.method684((long) i);
    }
    
    static void method9290(int i, int i_450_, int i_451_, int i_452_,
			   int i_453_, int i_454_, int i_455_, int i_456_) {
	anInt7489 = i - anInt7483;
	anInt7522 = i_450_ - anInt7484;
	anInt7523 = i_451_ - anInt7483;
	anInt7524 = i_452_ - anInt7484;
	anInt7525 = i_453_;
	anInt7480 = i_454_;
	anInt7527 = i_455_;
	anInt7528 = i_456_;
    }
    
    static void method9291(int i) {
	Class525_Sub16_Sub6 class525_sub16_sub6
	    = (Class525_Sub16_Sub6) aClass10_7499.method684((long) i);
	if (class525_sub16_sub6 != null
	    && class525_sub16_sub6 != aClass525_Sub16_Sub6_7469) {
	    aClass525_Sub16_Sub6_7469 = class525_sub16_sub6;
	    aBool7495 = (aClass525_Sub16_Sub6_7469.anInt11777 * 2044380983
			 == aClass623_7468.anInt8103 * -672689321);
	}
    }
    
    static boolean method9292(Class525_Sub16_Sub6 class525_sub16_sub6) {
	if (class525_sub16_sub6 != null
	    && class525_sub16_sub6 != aClass525_Sub16_Sub6_7469) {
	    aClass525_Sub16_Sub6_7469 = class525_sub16_sub6;
	    aBool7495 = (aClass525_Sub16_Sub6_7469.anInt11777 * 2044380983
			 == aClass623_7468.anInt8103 * -672689321);
	    return true;
	}
	return false;
    }
    
    static boolean method9293(Class525_Sub16_Sub6 class525_sub16_sub6) {
	if (class525_sub16_sub6 != null
	    && class525_sub16_sub6 != aClass525_Sub16_Sub6_7469) {
	    aClass525_Sub16_Sub6_7469 = class525_sub16_sub6;
	    aBool7495 = (aClass525_Sub16_Sub6_7469.anInt11777 * 2044380983
			 == aClass623_7468.anInt8103 * -672689321);
	    return true;
	}
	return false;
    }
    
    static int method9294(Interface13 interface13, Class180 class180, int i,
			  int i_457_, int i_458_) {
	Class658 class658 = (Class658) interface13.method76(i, 1990039285);
	if (class658 == null)
	    return 0;
	int i_459_ = class658.anInt8453 * -1899182957;
	if (i_459_ >= 0 && class180.method3116(i_459_, -1431554601).aBool1819)
	    i_459_ = -1;
	int i_460_;
	if (class658.anInt8452 * 2040702555 >= 0) {
	    int i_461_ = class658.anInt8452 * 2040702555;
	    int i_462_ = (i_461_ & 0x7f) + i_458_;
	    if (i_462_ < 0)
		i_462_ = 0;
	    else if (i_462_ > 127)
		i_462_ = 127;
	    int i_463_
		= (i_461_ + i_457_ & 0xfc00) + (i_461_ & 0x380) + i_462_;
	    i_460_ = (~0xffffff
		      | (Class381.anIntArray3929
			 [Class504.method8313(Class615.method10090(i_463_, 96,
								   1697053281),
					      1113973753) & 0xffff]));
	} else if (i_459_ >= 0)
	    i_460_ = ~0xffffff | (Class381.anIntArray3929
				  [Class504.method8313((Class615.method10090
							((class180.method3116
							  (i_459_, -1431554601)
							  .aShort1834),
							 96, 1623942175)),
						       1395485577) & 0xffff]);
	else if (class658.anInt8446 * -1932204261 == -1)
	    i_460_ = 0;
	else {
	    int i_464_ = class658.anInt8446 * -1932204261;
	    int i_465_ = (i_464_ & 0x7f) + i_458_;
	    if (i_465_ < 0)
		i_465_ = 0;
	    else if (i_465_ > 127)
		i_465_ = 127;
	    int i_466_
		= (i_464_ + i_457_ & 0xfc00) + (i_464_ & 0x380) + i_465_;
	    i_460_ = (~0xffffff
		      | (Class381.anIntArray3929
			 [Class504.method8313(Class615.method10090(i_466_, 96,
								   1844785836),
					      1201342380) & 0xffff]));
	}
	return i_460_;
    }
    
    public static Class525_Sub16_Sub6 method9295(int i, int i_467_) {
	for (Class525_Sub16_Sub6 class525_sub16_sub6
		 = (Class525_Sub16_Sub6) aClass10_7499.method689(1998593304);
	     class525_sub16_sub6 != null;
	     class525_sub16_sub6
		 = (Class525_Sub16_Sub6) aClass10_7499.method690((byte) -92)) {
	    if (class525_sub16_sub6.aBool11767
		&& class525_sub16_sub6.method18284(i, i_467_, (byte) 5))
		return class525_sub16_sub6;
	}
	return null;
    }
    
    public static Class525_Sub16_Sub6 method9296(int i) {
	return (Class525_Sub16_Sub6) aClass10_7499.method684((long) i);
    }
    
    public static Class697 method9297(int i, int i_468_) {
	Class697 class697 = new Class697();
	for (Class525_Sub16_Sub6 class525_sub16_sub6
		 = (Class525_Sub16_Sub6) aClass10_7499.method689(1067058213);
	     class525_sub16_sub6 != null;
	     class525_sub16_sub6
		 = (Class525_Sub16_Sub6) aClass10_7499.method690((byte) -2)) {
	    if (class525_sub16_sub6.aBool11767
		&& class525_sub16_sub6.method18284(i, i_468_, (byte) 5))
		class697.method14184(class525_sub16_sub6, 728171782);
	}
	return class697;
    }
    
    public static Class697 method9298(int i, int i_469_) {
	Class697 class697 = new Class697();
	for (Class525_Sub16_Sub6 class525_sub16_sub6
		 = (Class525_Sub16_Sub6) aClass10_7499.method689(1670781244);
	     class525_sub16_sub6 != null;
	     class525_sub16_sub6
		 = (Class525_Sub16_Sub6) aClass10_7499.method690((byte) -16)) {
	    if (class525_sub16_sub6.aBool11767
		&& class525_sub16_sub6.method18284(i, i_469_, (byte) 5))
		class697.method14184(class525_sub16_sub6, 728171782);
	}
	return class697;
    }
    
    static void method9299(int[] is, int i, int i_470_, int i_471_, int i_472_,
			   int i_473_, int i_474_, int i_475_, int i_476_,
			   byte[] is_477_, int i_478_, int i_479_) {
	int i_480_ = 0;
	int i_481_ = 0;
	int i_482_ = i_470_ - i + 1;
	int i_483_ = i_472_ - i_471_ + 1;
	int i_484_ = (i_478_ << 16) / i_482_;
	int i_485_ = (is_477_.length / i_478_ << 16) / i_483_;
	int i_486_ = i + (i_474_ - i_472_ - 1) * i_473_;
	int i_487_ = i_475_ >> 24;
	int i_488_ = i_476_ >> 24;
	if (i_479_ == 0 || i_479_ == 1 && i_487_ == 255 && i_488_ == 255) {
	    int i_489_ = i_480_;
	    for (int i_490_ = -i_483_; i_490_ < 0; i_490_++) {
		int i_491_ = (i_481_ >> 16) * i_478_;
		for (int i_492_ = -i_482_; i_492_ < 0; i_492_++) {
		    if (is_477_[(i_480_ >> 16) + i_491_] != 0)
			is[i_486_++] = i_476_;
		    else
			is[i_486_++] = i_475_;
		    i_480_ += i_484_;
		}
		i_481_ += i_485_;
		i_480_ = i_489_;
		i_486_ += i_473_ - i_482_;
	    }
	} else if (i_479_ == 1) {
	    int i_493_ = i_480_;
	    for (int i_494_ = -i_483_; i_494_ < 0; i_494_++) {
		int i_495_ = (i_481_ >> 16) * i_478_;
		for (int i_496_ = -i_482_; i_496_ < 0; i_496_++) {
		    int i_497_ = i_475_;
		    if (is_477_[(i_480_ >> 16) + i_495_] != 0)
			i_497_ = i_476_;
		    int i_498_ = i_497_ >>> 24;
		    int i_499_ = 255 - i_498_;
		    int i_500_ = is[i_486_];
		    is[i_486_++]
			= ~0xffffff | ((((i_497_ & 0xff00ff) * i_498_
					 + (i_500_ & 0xff00ff) * i_499_)
					& ~0xff00ff)
				       + (((i_497_ & 0xff00) * i_498_
					   + (i_500_ & 0xff00) * i_499_)
					  & 0xff0000)) >> 8;
		    i_480_ += i_484_;
		}
		i_481_ += i_485_;
		i_480_ = i_493_;
		i_486_ += i_473_ - i_482_;
	    }
	} else
	    throw new IllegalArgumentException();
    }
    
    static void method9300(Class180 class180, int i, int i_501_) {
	for (int i_502_ = 0; i_502_ < anInterface13_7498.method72(994443601);
	     i_502_++)
	    anIntArray7487[i_502_ + 1]
		= method9348(class180, i_502_, i, i_501_);
    }
    
    static int method9301(Class180 class180, int i, int i_503_, int i_504_) {
	return method9254(anInterface13_7498, class180, i, i_503_, i_504_);
    }
    
    static Class709 method9302(Class182 class182) {
	int i = anInt7523 - anInt7489;
	int i_505_ = anInt7522 - anInt7524;
	int i_506_ = (anInt7527 - anInt7525 << 16) / i;
	int i_507_ = (anInt7528 - anInt7480 << 16) / i_505_;
	return method9269(class182, i_506_, i_507_, 0, 0);
    }
    
    static int method9303(Class180 class180, int i, int i_508_, int i_509_) {
	return method9254(anInterface13_7498, class180, i, i_508_, i_509_);
    }
    
    static void method9304(Class180 class180, int i, int i_510_) {
	for (int i_511_ = 0; i_511_ < anInterface13_7498.method72(-1889637497);
	     i_511_++)
	    anIntArray7487[i_511_ + 1]
		= method9348(class180, i_511_, i, i_510_);
    }
    
    static boolean method9305(Class525_Sub16_Sub6 class525_sub16_sub6) {
	if (class525_sub16_sub6 != null
	    && class525_sub16_sub6 != aClass525_Sub16_Sub6_7469) {
	    aClass525_Sub16_Sub6_7469 = class525_sub16_sub6;
	    aBool7495 = (aClass525_Sub16_Sub6_7469.anInt11777 * 2044380983
			 == aClass623_7468.anInt8103 * -672689321);
	    return true;
	}
	return false;
    }
    
    static int method9306(Interface13 interface13, Class180 class180, int i,
			  int i_512_, int i_513_) {
	Class658 class658 = (Class658) interface13.method76(i, 1570886347);
	if (class658 == null)
	    return 0;
	int i_514_ = class658.anInt8453 * -1899182957;
	if (i_514_ >= 0 && class180.method3116(i_514_, -1431554601).aBool1819)
	    i_514_ = -1;
	int i_515_;
	if (class658.anInt8452 * 2040702555 >= 0) {
	    int i_516_ = class658.anInt8452 * 2040702555;
	    int i_517_ = (i_516_ & 0x7f) + i_513_;
	    if (i_517_ < 0)
		i_517_ = 0;
	    else if (i_517_ > 127)
		i_517_ = 127;
	    int i_518_
		= (i_516_ + i_512_ & 0xfc00) + (i_516_ & 0x380) + i_517_;
	    i_515_ = (~0xffffff
		      | (Class381.anIntArray3929
			 [Class504.method8313(Class615.method10090(i_518_, 96,
								   1884950276),
					      720359929) & 0xffff]));
	} else if (i_514_ >= 0)
	    i_515_ = ~0xffffff | (Class381.anIntArray3929
				  [Class504.method8313((Class615.method10090
							((class180.method3116
							  (i_514_, -1431554601)
							  .aShort1834),
							 96, 1465258884)),
						       416854755) & 0xffff]);
	else if (class658.anInt8446 * -1932204261 == -1)
	    i_515_ = 0;
	else {
	    int i_519_ = class658.anInt8446 * -1932204261;
	    int i_520_ = (i_519_ & 0x7f) + i_513_;
	    if (i_520_ < 0)
		i_520_ = 0;
	    else if (i_520_ > 127)
		i_520_ = 127;
	    int i_521_
		= (i_519_ + i_512_ & 0xfc00) + (i_519_ & 0x380) + i_520_;
	    i_515_ = (~0xffffff
		      | (Class381.anIntArray3929
			 [Class504.method8313(Class615.method10090(i_521_, 96,
								   1874290269),
					      296093278) & 0xffff]));
	}
	return i_515_;
    }
    
    static void method9307(int i) {
	Class525_Sub16_Sub6 class525_sub16_sub6
	    = (Class525_Sub16_Sub6) aClass10_7499.method684((long) i);
	if (class525_sub16_sub6 != null
	    && class525_sub16_sub6 != aClass525_Sub16_Sub6_7469) {
	    aClass525_Sub16_Sub6_7469 = class525_sub16_sub6;
	    aBool7495 = (aClass525_Sub16_Sub6_7469.anInt11777 * 2044380983
			 == aClass623_7468.anInt8103 * -672689321);
	}
    }
    
    static boolean method9308(Class182 class182, int i, int i_522_,
			      boolean bool) {
	long l = Class251.method4508((byte) 8);
	if (anInt7517 == 0) {
	    if (aClass525_Sub16_Sub6_7469.anInt11777 * 2044380983
		== aClass623_7468.anInt8120 * 1938296189) {
		int i_523_
		    = aClass458_7471.method7521((aClass525_Sub16_Sub6_7469
						 .aString11776),
						-2116786302);
		if (aClass525_Sub38_7504 == null)
		    aClass525_Sub38_7504
			= (new RSBuffer
			   (aClass458_7471.method7476(i_523_, 0, 945912479)));
		aClass525_Sub38_7482 = aClass525_Sub38_7504;
		aClass525_Sub38_7482.pos = 0;
	    } else {
		int i_524_
		    = aClass458_7471.method7521((aClass525_Sub16_Sub6_7469
						 .aString11776),
						-2116786302);
		aClass525_Sub38_7482
		    = (new RSBuffer
		       (aClass458_7471.method7476(i_524_, 0, 1002683283)));
	    }
	    int i_525_ = aClass525_Sub38_7482.readUnsignedByte(1495226096);
	    anIntArray7519 = new int[i_525_];
	    for (int i_526_ = 0; i_526_ < i_525_; i_526_++)
		anIntArray7519[i_526_]
		    = aClass525_Sub38_7482.method16740((byte) -107);
	    int i_527_ = aClass525_Sub38_7482.readUnsignedByte(460847730);
	    anIntArray7520 = new int[i_527_];
	    for (int i_528_ = 0; i_528_ < i_527_; i_528_++)
		anIntArray7520[i_528_]
		    = aClass525_Sub38_7482.method16740((byte) -16);
	}
	while (aClass525_Sub38_7482 != null
	       && (aClass525_Sub38_7482.pos * -1133521593
		   < aClass525_Sub38_7482.buffer.length)
	       && (!bool
		   || Class251.method4508((byte) 8) < l + (long) anInt7512)) {
	    if (aClass525_Sub38_7482.readUnsignedByte(755217278) == 0) {
		int i_529_ = aClass525_Sub38_7482.readUnsignedByte(2005805993);
		int i_530_ = aClass525_Sub38_7482.readUnsignedByte(1528290904);
		for (int i_531_ = 0; i_531_ < 8; i_531_++) {
		    int i_532_ = aClass525_Sub38_7482.readUnsignedByte(1665449823);
		    int i_533_ = i_529_ * 8 + i_531_ - anInt7483 / 8;
		    for (int i_534_ = 0; i_534_ < 8; i_534_++) {
			int i_535_ = i_530_ * 8 + i_534_ - anInt7484 / 8;
			aBoolArrayArray7515[i_533_][i_535_]
			    = (i_532_ & 1 << i_534_) != 0;
		    }
		}
		for (int i_536_ = 0; i_536_ < 64; i_536_++) {
		    for (int i_537_ = 0; i_537_ < 64; i_537_++) {
			int i_538_ = i_529_ * 64 + i_536_ - anInt7483;
			int i_539_ = i_530_ * 64 + i_537_ - anInt7484;
			method9256(class182, aClass525_Sub38_7482, i_529_,
				   i_530_, i_538_, i_539_, anIntArray7519,
				   anIntArray7520);
		    }
		}
	    } else {
		int i_540_ = aClass525_Sub38_7482.readUnsignedByte(833533942);
		int i_541_ = aClass525_Sub38_7482.readUnsignedByte(9630239);
		int i_542_ = aClass525_Sub38_7482.readUnsignedByte(442877343);
		int i_543_ = aClass525_Sub38_7482.readUnsignedByte(679460136);
		aBoolArrayArray7515[i_540_ * 8 + i_542_ - anInt7483 / 8]
		    [i_541_ * 8 + i_543_ - anInt7484 / 8]
		    = aClass525_Sub38_7482.readUnsignedByte(226985321) != 0;
		for (int i_544_ = 0; i_544_ < 8; i_544_++) {
		    for (int i_545_ = 0; i_545_ < 8; i_545_++) {
			int i_546_
			    = i_540_ * 64 + i_542_ * 8 + i_544_ - anInt7483;
			int i_547_
			    = i_541_ * 64 + i_543_ * 8 + i_545_ - anInt7484;
			method9256(class182, aClass525_Sub38_7482, i_540_,
				   i_541_, i_546_, i_547_, anIntArray7519,
				   anIntArray7520);
		    }
		}
	    }
	}
	if (aClass525_Sub38_7482 != null) {
	    anInt7517 = aClass525_Sub38_7482.pos * -1133521593;
	    if (aClass525_Sub38_7482.pos * -1133521593
		< aClass525_Sub38_7482.buffer.length)
		return false;
	}
	aClass525_Sub38_7482 = null;
	anIntArray7520 = null;
	anIntArray7519 = null;
	if (aShortArray7516 != null) {
	    aByteArray7467 = new byte[anInt7502 * anInt7521];
	    aShortArray7490 = new short[anInt7502 * anInt7521];
	    for (int i_548_ = 0; i_548_ < 3; i_548_++) {
		short[] is = new short[anInt7502 * anInt7521];
		for (int i_549_ = 0;
		     i_549_ < aHashMapArrayArrayArray7506[i_548_].length;
		     i_549_++) {
		    for (int i_550_ = 0;
			 (i_550_
			  < aHashMapArrayArrayArray7506[i_548_][0].length);
			 i_550_++) {
			HashMap hashmap = (aHashMapArrayArrayArray7506[i_548_]
					   [i_549_][i_550_]);
			if (hashmap != null) {
			    Iterator iterator = hashmap.values().iterator();
			    while (iterator.hasNext()) {
				Class528 class528 = (Class528) iterator.next();
				is[(i_549_ * 64 + class528.aByte7133
				    + ((i_550_ * 64 + class528.aByte7135)
				       * anInt7502))]
				    = (short) class528.anInt7134;
			    }
			}
		    }
		}
		method9258(is, aByteArray7467, aShortArray7490, i, i_522_);
		for (int i_551_ = 0;
		     i_551_ < aHashMapArrayArrayArray7506[i_548_].length;
		     i_551_++) {
		    for (int i_552_ = 0;
			 (i_552_
			  < aHashMapArrayArrayArray7506[i_548_][0].length);
			 i_552_++) {
			HashMap hashmap = (aHashMapArrayArrayArray7506[i_548_]
					   [i_551_][i_552_]);
			if (hashmap != null) {
			    Iterator iterator = hashmap.values().iterator();
			    while (iterator.hasNext()) {
				Class528 class528 = (Class528) iterator.next();
				int i_553_
				    = (i_551_ * 64 + class528.aByte7133
				       + ((i_552_ * 64 + class528.aByte7135)
					  * anInt7502));
				class528.anInt7134
				    = ((aByteArray7467[i_553_] & 0xff) << 16
				       | aShortArray7490[i_553_] & 0xffff);
				if (class528.anInt7134 != 0)
				    class528.anInt7134 |= ~0xffffff;
			    }
			}
		    }
		}
	    }
	    method9258(aShortArray7516, aByteArray7467, aShortArray7490, i,
		       i_522_);
	    aShortArray7516 = null;
	}
	if (!bool || Class251.method4508((byte) 8) < l + (long) anInt7512) {
	    method9257();
	    return true;
	}
	return false;
    }
    
    static void method9309(Class182 class182, Class525_Sub37 class525_sub37,
			   int i, int i_554_, int i_555_, int i_556_) {
	class525_sub37.anInt10827
	    = (anInt7525
	       + (i_555_ + i * (class525_sub37.anInt10826 * 1273194629
				- anInt7489)
		  >> 16)) * -465270039;
	class525_sub37.anInt10828
	    = (anInt7528
	       - (i_556_ + i_554_ * (class525_sub37.anInt10824 * -1383897689
				     - anInt7524)
		  >> 16)) * -244938849;
    }
    
    static void method9310() {
	aShortArray7516 = new short[anInt7502 * anInt7521];
	aShortArray7491 = new short[anInt7502 * anInt7521];
	aByteArray7492 = new byte[anInt7502 * anInt7521];
	anObjectArray7493 = new Object[anInt7502 * anInt7521];
	aByteArray7494 = new byte[anInt7502 * anInt7521];
	aHashMapArrayArrayArray7506
	    = new HashMap[3][anInt7502 >> 6][anInt7521 >> 6];
	anIntArray7487 = new int[anInterface13_7498.method72(-630745671) + 1];
	aBoolArrayArray7515 = new boolean[anInt7502 / 8][anInt7521 / 8];
    }
    
    static void method9311(Class182 class182, RSBuffer class525_sub38,
			   int i, int i_557_, int i_558_, int i_559_, int[] is,
			   int[] is_560_) {
	int i_561_ = class525_sub38.readUnsignedByte(93088570);
	if ((i_561_ & 0x1) == 0) {
	    boolean bool = (i_561_ & 0x2) == 0;
	    int i_562_ = i_561_ >> 2 & 0x3f;
	    if (i_562_ != 62) {
		if (i_562_ == 63)
		    i_562_ = class525_sub38.method16740((byte) -52);
		else if (bool)
		    i_562_ = is[i_562_];
		else
		    i_562_ = is_560_[i_562_];
		if (bool) {
		    aShortArray7516[i_558_ + i_559_ * anInt7502]
			= (short) i_562_;
		    aShortArray7491[i_558_ + i_559_ * anInt7502] = (short) 0;
		} else {
		    aShortArray7491[i_558_ + i_559_ * anInt7502]
			= (short) i_562_;
		    aByteArray7492[i_558_ + i_559_ * anInt7502] = (byte) 0;
		    aShortArray7516[i_558_ + i_559_ * anInt7502]
			= (short) class525_sub38.method16740((byte) -38);
		}
	    }
	} else {
	    int i_563_ = (i_561_ >> 1 & 0x3) + 1;
	    boolean bool = (i_561_ & 0x8) != 0;
	    boolean bool_564_ = (i_561_ & 0x10) != 0;
	    for (int i_565_ = 0; i_565_ < i_563_; i_565_++) {
		int i_566_ = class525_sub38.method16740((byte) -36);
		int i_567_ = 0;
		int i_568_ = 0;
		if (bool) {
		    i_567_ = class525_sub38.method16740((byte) -103);
		    i_568_ = class525_sub38.readUnsignedByte(1458901938);
		}
		int i_569_ = 0;
		if (bool_564_)
		    i_569_ = class525_sub38.readUnsignedByte(1869120013);
		if (i_565_ == 0) {
		    aShortArray7516[i_558_ + i_559_ * anInt7502]
			= (short) i_566_;
		    aShortArray7491[i_558_ + i_559_ * anInt7502]
			= (short) i_567_;
		    aByteArray7492[i_558_ + i_559_ * anInt7502]
			= (byte) i_568_;
		    if (i_569_ == 1) {
			anObjectArray7493[i_558_ + i_559_ * anInt7502]
			    = new Integer(class525_sub38
					      .readBigSmart(-2043778683));
			aByteArray7494[i_558_ + i_559_ * anInt7502]
			    = class525_sub38.readByte(-1150098071);
		    } else if (i_569_ > 1) {
			int[] is_570_ = new int[i_569_];
			byte[] is_571_ = new byte[i_569_];
			for (int i_572_ = 0; i_572_ < i_569_; i_572_++) {
			    is_570_[i_572_]
				= class525_sub38.readBigSmart(-2043778683);
			    is_571_[i_572_]
				= class525_sub38.readByte(-1150098071);
			}
			anObjectArray7493[i_558_ + i_559_ * anInt7502]
			    = new Class525_Sub35(is_570_, is_571_);
		    }
		} else {
		    int[] is_573_ = null;
		    byte[] is_574_ = null;
		    if (i_569_ > 0) {
			is_573_ = new int[i_569_];
			is_574_ = new byte[i_569_];
			for (int i_575_ = 0; i_575_ < i_569_; i_575_++) {
			    is_573_[i_575_]
				= class525_sub38.readBigSmart(-2043778683);
			    is_574_[i_575_]
				= class525_sub38.readByte(-1150098071);
			}
		    }
		    if ((aHashMapArrayArrayArray7506[i_565_ - 1]
			 [i - (anInt7483 >> 6)][i_557_ - (anInt7484 >> 6)])
			== null)
			aHashMapArrayArrayArray7506[i_565_ - 1]
			    [i - (anInt7483 >> 6)][i_557_ - (anInt7484 >> 6)]
			    = new HashMap();
		    int i_576_ = ((i_558_ & 0x3f) << 8) + (i_559_ & 0x3f);
		    Class528 class528
			= new Class528(i_558_ & 0x3f, i_559_ & 0x3f, i_566_,
				       i_567_, i_568_, is_573_, is_574_);
		    aHashMapArrayArrayArray7506[i_565_ - 1]
			[i - (anInt7483 >> 6)][i_557_ - (anInt7484 >> 6)]
			.put(Integer.valueOf(i_576_), class528);
		}
	    }
	}
    }
    
    static void method9312(short[] is, byte[] is_577_, short[] is_578_, int i,
			   int i_579_) {
	int[] is_580_ = new int[anInt7521];
	int[] is_581_ = new int[anInt7521];
	int[] is_582_ = new int[anInt7521];
	int[] is_583_ = new int[anInt7521];
	int[] is_584_ = new int[anInt7521];
	for (int i_585_ = -5; i_585_ < anInt7502; i_585_++) {
	    int i_586_ = i_585_ + 5;
	    int i_587_ = i_585_ - 5;
	    for (int i_588_ = 0; i_588_ < anInt7521; i_588_++) {
		if (i_586_ < anInt7502) {
		    short i_589_ = is[i_586_ + i_588_ * anInt7502];
		    if (i_589_ > 0) {
			Class23 class23
			    = ((Class23)
			       anInterface13_7462.method76(i_589_ - 1,
							   -1208621799));
			is_580_[i_588_] += class23.anInt222 * -42935381;
			is_581_[i_588_] += class23.anInt218 * 337157395;
			is_582_[i_588_] += class23.anInt225 * 1486533035;
			is_583_[i_588_] += class23.anInt226 * -1462290935;
			is_584_[i_588_]++;
		    }
		}
		if (i_587_ >= 0) {
		    short i_590_ = is[i_587_ + i_588_ * anInt7502];
		    if (i_590_ > 0) {
			Class23 class23
			    = (Class23) anInterface13_7462.method76(i_590_ - 1,
								    647750861);
			is_580_[i_588_] -= class23.anInt222 * -42935381;
			is_581_[i_588_] -= class23.anInt218 * 337157395;
			is_582_[i_588_] -= class23.anInt225 * 1486533035;
			is_583_[i_588_] -= class23.anInt226 * -1462290935;
			is_584_[i_588_]--;
		    }
		}
	    }
	    if (i_585_ >= 0) {
		int i_591_ = 0;
		int i_592_ = 0;
		int i_593_ = 0;
		int i_594_ = 0;
		int i_595_ = 0;
		for (int i_596_ = -5; i_596_ < anInt7521; i_596_++) {
		    int i_597_ = i_596_ + 5;
		    if (i_597_ < anInt7521) {
			i_591_ += is_580_[i_597_];
			i_592_ += is_581_[i_597_];
			i_593_ += is_582_[i_597_];
			i_594_ += is_583_[i_597_];
			i_595_ += is_584_[i_597_];
		    }
		    int i_598_ = i_596_ - 5;
		    if (i_598_ >= 0) {
			i_591_ -= is_580_[i_598_];
			i_592_ -= is_581_[i_598_];
			i_593_ -= is_582_[i_598_];
			i_594_ -= is_583_[i_598_];
			i_595_ -= is_584_[i_598_];
		    }
		    if (i_596_ >= 0 && i_595_ > 0) {
			if (is[i_585_ + i_596_ * anInt7502] == 0) {
			    int i_599_ = i_585_ + i_596_ * anInt7502;
			    is_577_[i_599_] = (byte) 0;
			    is_578_[i_599_] = (short) 0;
			} else {
			    int i_600_
				= (i_594_ == 0 ? 0
				   : Class57.method1214(i_591_ * 256 / i_594_,
							i_592_ / i_595_,
							i_593_ / i_595_,
							2092983139));
			    int i_601_ = (i_600_ & 0x7f) + i_579_;
			    if (i_601_ < 0)
				i_601_ = 0;
			    else if (i_601_ > 127)
				i_601_ = 127;
			    int i_602_ = ((i_600_ + i & 0xfc00)
					  + (i_600_ & 0x380) + i_601_);
			    int i_603_ = i_585_ + i_596_ * anInt7502;
			    int i_604_
				= (Class381.anIntArray3929
				   [(Class504.method8313
				     (Class329.method5805(i_602_, 96, 65536),
				      327201164)) & 0xffff]);
			    is_577_[i_603_] = (byte) (i_604_ >> 16 & 0xff);
			    is_578_[i_603_] = (short) (i_604_ & 0xffff);
			}
		    }
		}
	    }
	}
    }
    
    static void method9313() {
	int[] is = new int[3];
	for (int i = 0; i < aClass529_7509.anInt7140 * -698145127; i++) {
	    boolean bool = (aClass525_Sub16_Sub6_7469.method18275
			    (aClass529_7509.anIntArray7139[i] >> 28 & 0x3,
			     aClass529_7509.anIntArray7139[i] >> 14 & 0x3fff,
			     aClass529_7509.anIntArray7139[i] & 0x3fff, is,
			     -956633395));
	    if (bool) {
		Class525_Sub37 class525_sub37
		    = new Class525_Sub37(aClass529_7509.anIntArray7141[i]);
		class525_sub37.anInt10826 = (is[1] - anInt7483) * 1731219533;
		class525_sub37.anInt10824 = (is[2] - anInt7484) * 727118359;
		aClass709_7473.method14345(class525_sub37, (byte) 0);
	    }
	}
    }
    
    static void method9314() {
	int[] is = new int[3];
	for (int i = 0; i < aClass529_7509.anInt7140 * -698145127; i++) {
	    boolean bool = (aClass525_Sub16_Sub6_7469.method18275
			    (aClass529_7509.anIntArray7139[i] >> 28 & 0x3,
			     aClass529_7509.anIntArray7139[i] >> 14 & 0x3fff,
			     aClass529_7509.anIntArray7139[i] & 0x3fff, is,
			     -495338045));
	    if (bool) {
		Class525_Sub37 class525_sub37
		    = new Class525_Sub37(aClass529_7509.anIntArray7141[i]);
		class525_sub37.anInt10826 = (is[1] - anInt7483) * 1731219533;
		class525_sub37.anInt10824 = (is[2] - anInt7484) * 727118359;
		aClass709_7473.method14345(class525_sub37, (byte) 0);
	    }
	}
    }
    
    Class556() throws Throwable {
	throw new Error();
    }
    
    static void method9315(int i) {
	Class525_Sub16_Sub6 class525_sub16_sub6
	    = (Class525_Sub16_Sub6) aClass10_7499.method684((long) i);
	if (class525_sub16_sub6 != null
	    && class525_sub16_sub6 != aClass525_Sub16_Sub6_7469) {
	    aClass525_Sub16_Sub6_7469 = class525_sub16_sub6;
	    aBool7495 = (aClass525_Sub16_Sub6_7469.anInt11777 * 2044380983
			 == aClass623_7468.anInt8103 * -672689321);
	}
    }
    
    static void method9316(int[] is, int i, int i_605_, int i_606_, int i_607_,
			   int i_608_) {
	int i_609_ = aClass623_7468.anInt8116 * -70148343 >> 24 & 0xff;
	int i_610_ = 255 - i_609_;
	if ((!aBoolArray7531[anInt7474]
	     || !aBoolArray7531[anInt7500] && !aBoolArray7531[anInt7488])
	    && (!aBoolArray7531[anInt7514]
		|| !aBoolArray7531[anInt7500] && !aBoolArray7531[anInt7488])) {
	    method9278(is, i, i_605_, i_606_, i_607_, i_608_, i_609_, i_610_,
		       true, true, true, true);
	    if (aBoolArray7531[anInt7481]) {
		is[(i_608_ - i_607_ - 1) * i_608_ + i_605_]
		    = aClass623_7468.anInt8117 * 425619501;
		is[(i_608_ - i_607_) * i_608_ + i_605_]
		    = aClass623_7468.anInt8117 * 425619501;
		is[(i_608_ - i_607_ - 1) * i_608_ + i_605_ - 1]
		    = aClass623_7468.anInt8117 * 425619501;
	    }
	    if (aBoolArray7531[anInt7501]) {
		is[(i_608_ - i_606_ - 1) * i_608_ + i_605_]
		    = aClass623_7468.anInt8117 * 425619501;
		is[(i_608_ - i_606_ - 2) * i_608_ + i_605_]
		    = aClass623_7468.anInt8117 * 425619501;
		is[(i_608_ - i_606_ - 1) * i_608_ + i_605_ - 1]
		    = aClass623_7468.anInt8117 * 425619501;
	    }
	    if (aBoolArray7531[anInt7503]) {
		is[(i_608_ - i_606_ - 1) * i_608_ + i]
		    = aClass623_7468.anInt8117 * 425619501;
		is[(i_608_ - i_606_ - 2) * i_608_ + i]
		    = aClass623_7468.anInt8117 * 425619501;
		is[(i_608_ - i_606_ - 1) * i_608_ + i + 1]
		    = aClass623_7468.anInt8117 * 425619501;
	    }
	    if (aBoolArray7531[anInt7505]) {
		is[(i_608_ - i_607_ - 1) * i_608_ + i]
		    = aClass623_7468.anInt8117 * 425619501;
		is[(i_608_ - i_607_) * i_608_ + i]
		    = aClass623_7468.anInt8117 * 425619501;
		is[(i_608_ - i_607_ - 1) * i_608_ + i + 1]
		    = aClass623_7468.anInt8117 * 425619501;
	    }
	} else {
	    if (aBoolArray7531[anInt7474] && aBoolArray7531[anInt7500])
		method9279(is,
			   i_605_ - aClass623_7468.anInt8119 * -1016598897 + 1,
			   i_607_ - aClass623_7468.anInt8119 * -1016598897 + 1,
			   i_608_, i_609_, i_610_, anInt7481);
	    else {
		method9278(is,
			   i_605_ - aClass623_7468.anInt8119 * -1016598897 + 1,
			   i_605_,
			   i_607_ - aClass623_7468.anInt8119 * -1016598897 + 1,
			   i_607_, i_608_, i_609_, i_610_, true, true, false,
			   false);
		if (aBoolArray7531[anInt7481]) {
		    is[(i_608_ - i_607_ - 1) * i_608_ + i_605_]
			= aClass623_7468.anInt8117 * 425619501;
		    is[(i_608_ - i_607_) * i_608_ + i_605_]
			= aClass623_7468.anInt8117 * 425619501;
		    is[(i_608_ - i_607_ - 1) * i_608_ + i_605_ - 1]
			= aClass623_7468.anInt8117 * 425619501;
		}
	    }
	    if (aBoolArray7531[anInt7514] && aBoolArray7531[anInt7500])
		method9279(is,
			   i_605_ - aClass623_7468.anInt8119 * -1016598897 + 1,
			   i_606_, i_608_, i_609_, i_610_, anInt7501);
	    else {
		method9278(is,
			   i_605_ - aClass623_7468.anInt8119 * -1016598897 + 1,
			   i_605_, i_606_,
			   i_606_ + aClass623_7468.anInt8119 * -1016598897 - 1,
			   i_608_, i_609_, i_610_, false, true, true, false);
		if (aBoolArray7531[anInt7501]) {
		    is[(i_608_ - i_606_ - 1) * i_608_ + i_605_]
			= aClass623_7468.anInt8117 * 425619501;
		    is[(i_608_ - i_606_ - 2) * i_608_ + i_605_]
			= aClass623_7468.anInt8117 * 425619501;
		    is[(i_608_ - i_606_ - 1) * i_608_ + i_605_ - 1]
			= aClass623_7468.anInt8117 * 425619501;
		}
	    }
	    if (aBoolArray7531[anInt7514] && aBoolArray7531[anInt7488])
		method9279(is, i, i_606_, i_608_, i_609_, i_610_, anInt7503);
	    else {
		method9278(is, i,
			   i + aClass623_7468.anInt8119 * -1016598897 - 1,
			   i_606_,
			   i_606_ + aClass623_7468.anInt8119 * -1016598897 - 1,
			   i_608_, i_609_, i_610_, false, false, true, true);
		if (aBoolArray7531[anInt7503]) {
		    is[(i_608_ - i_606_ - 1) * i_608_ + i]
			= aClass623_7468.anInt8117 * 425619501;
		    is[(i_608_ - i_606_ - 2) * i_608_ + i]
			= aClass623_7468.anInt8117 * 425619501;
		    is[(i_608_ - i_606_ - 1) * i_608_ + i + 1]
			= aClass623_7468.anInt8117 * 425619501;
		}
	    }
	    if (aBoolArray7531[anInt7474] && aBoolArray7531[anInt7488])
		method9279(is, i,
			   i_607_ - aClass623_7468.anInt8119 * -1016598897 + 1,
			   i_608_, i_609_, i_610_, anInt7505);
	    else {
		method9278(is, i,
			   i + aClass623_7468.anInt8119 * -1016598897 - 1,
			   i_607_ - aClass623_7468.anInt8119 * -1016598897 + 1,
			   i_607_, i_608_, i_609_, i_610_, true, false, false,
			   true);
		if (aBoolArray7531[anInt7505]) {
		    is[(i_608_ - i_607_ - 1) * i_608_ + i]
			= aClass623_7468.anInt8117 * 425619501;
		    is[(i_608_ - i_607_) * i_608_ + i]
			= aClass623_7468.anInt8117 * 425619501;
		    is[(i_608_ - i_607_ - 1) * i_608_ + i + 1]
			= aClass623_7468.anInt8117 * 425619501;
		}
	    }
	    if (i + aClass623_7468.anInt8119 * -1016598897
		< i_605_ - aClass623_7468.anInt8119 * -1016598897)
		method9278(is, i + aClass623_7468.anInt8119 * -1016598897,
			   i_605_ - aClass623_7468.anInt8119 * -1016598897,
			   i_606_, i_607_, i_608_, i_609_, i_610_, true, false,
			   true, false);
	    if (i_606_ + aClass623_7468.anInt8119 * -1016598897 + 1
		< i_607_ - aClass623_7468.anInt8119 * -1016598897 - 1) {
		method9278(is, i,
			   i + aClass623_7468.anInt8119 * -1016598897 - 1,
			   i_606_ + aClass623_7468.anInt8119 * -1016598897,
			   i_607_ - aClass623_7468.anInt8119 * -1016598897,
			   i_608_, i_609_, i_610_, false, false, false, true);
		method9278(is,
			   i_605_ - aClass623_7468.anInt8119 * -1016598897 + 1,
			   i_605_,
			   i_606_ + aClass623_7468.anInt8119 * -1016598897,
			   i_607_ - aClass623_7468.anInt8119 * -1016598897,
			   i_608_, i_609_, i_610_, false, true, false, false);
	    }
	}
    }
    
    static void method9317(Class182 class182, boolean bool, boolean bool_611_,
			   boolean bool_612_, boolean bool_613_) {
	int i = anInt7523 - anInt7489;
	int i_614_ = anInt7522 - anInt7524;
	int i_615_ = (anInt7527 - anInt7525 << 16) / i;
	int i_616_ = (anInt7528 - anInt7480 << 16) / i_614_;
	method9284(class182, bool, bool_611_, i_615_, i_616_, 0, 0, bool_612_,
		   bool_613_);
    }
    
    static void method9318(Class182 class182, int i, int i_617_, int i_618_,
			   int i_619_) {
	Class157 class157 = (Class157) aClass200_7496.method3785(-1L);
	if (class157 == null || class157.method2503() != i_618_) {
	    int i_620_;
	    if (aClass525_Sub16_Sub6_7469.anInt11771 * 710722315 != -1)
		i_620_ = (~0xffffff
			  | aClass525_Sub16_Sub6_7469.anInt11771 * 710722315);
	    else
		i_620_ = -16777216;
	    if (anIntArray7513 == null
		|| anIntArray7513.length != i_618_ * i_618_)
		anIntArray7513 = new int[i_618_ * i_618_];
	    Arrays.fill(anIntArray7513, i_620_);
	    class157 = class182.method3214(anIntArray7513, 0, i_618_, i_618_,
					   i_618_, true);
	    aClass200_7496.method3788(class157, -1L);
	}
	aClass200_7496.method3788(class157, (long) i_619_);
    }
    
    static void method9319(Class182 class182, int i, int i_621_, int i_622_,
			   int i_623_) {
	Class157 class157 = (Class157) aClass200_7496.method3785(-1L);
	if (class157 == null || class157.method2503() != i_622_) {
	    int i_624_;
	    if (aClass525_Sub16_Sub6_7469.anInt11771 * 710722315 != -1)
		i_624_ = (~0xffffff
			  | aClass525_Sub16_Sub6_7469.anInt11771 * 710722315);
	    else
		i_624_ = -16777216;
	    if (anIntArray7513 == null
		|| anIntArray7513.length != i_622_ * i_622_)
		anIntArray7513 = new int[i_622_ * i_622_];
	    Arrays.fill(anIntArray7513, i_624_);
	    class157 = class182.method3214(anIntArray7513, 0, i_622_, i_622_,
					   i_622_, true);
	    aClass200_7496.method3788(class157, -1L);
	}
	aClass200_7496.method3788(class157, (long) i_623_);
    }
    
    static void method9320(Class182 class182, int i, int i_625_, int i_626_,
			   int i_627_) {
	Class157 class157 = (Class157) aClass200_7496.method3785(-1L);
	if (class157 == null || class157.method2503() != i_626_) {
	    int i_628_;
	    if (aClass525_Sub16_Sub6_7469.anInt11771 * 710722315 != -1)
		i_628_ = (~0xffffff
			  | aClass525_Sub16_Sub6_7469.anInt11771 * 710722315);
	    else
		i_628_ = -16777216;
	    if (anIntArray7513 == null
		|| anIntArray7513.length != i_626_ * i_626_)
		anIntArray7513 = new int[i_626_ * i_626_];
	    Arrays.fill(anIntArray7513, i_628_);
	    class157 = class182.method3214(anIntArray7513, 0, i_626_, i_626_,
					   i_626_, true);
	    aClass200_7496.method3788(class157, -1L);
	}
	aClass200_7496.method3788(class157, (long) i_627_);
    }
    
    static void method9321(Class182 class182, RSBuffer class525_sub38,
			   int i, int i_629_, int i_630_, int i_631_, int[] is,
			   int[] is_632_) {
	int i_633_ = class525_sub38.readUnsignedByte(485708190);
	if ((i_633_ & 0x1) == 0) {
	    boolean bool = (i_633_ & 0x2) == 0;
	    int i_634_ = i_633_ >> 2 & 0x3f;
	    if (i_634_ != 62) {
		if (i_634_ == 63)
		    i_634_ = class525_sub38.method16740((byte) -107);
		else if (bool)
		    i_634_ = is[i_634_];
		else
		    i_634_ = is_632_[i_634_];
		if (bool) {
		    aShortArray7516[i_630_ + i_631_ * anInt7502]
			= (short) i_634_;
		    aShortArray7491[i_630_ + i_631_ * anInt7502] = (short) 0;
		} else {
		    aShortArray7491[i_630_ + i_631_ * anInt7502]
			= (short) i_634_;
		    aByteArray7492[i_630_ + i_631_ * anInt7502] = (byte) 0;
		    aShortArray7516[i_630_ + i_631_ * anInt7502]
			= (short) class525_sub38.method16740((byte) -46);
		}
	    }
	} else {
	    int i_635_ = (i_633_ >> 1 & 0x3) + 1;
	    boolean bool = (i_633_ & 0x8) != 0;
	    boolean bool_636_ = (i_633_ & 0x10) != 0;
	    for (int i_637_ = 0; i_637_ < i_635_; i_637_++) {
		int i_638_ = class525_sub38.method16740((byte) -113);
		int i_639_ = 0;
		int i_640_ = 0;
		if (bool) {
		    i_639_ = class525_sub38.method16740((byte) -107);
		    i_640_ = class525_sub38.readUnsignedByte(376771980);
		}
		int i_641_ = 0;
		if (bool_636_)
		    i_641_ = class525_sub38.readUnsignedByte(768044295);
		if (i_637_ == 0) {
		    aShortArray7516[i_630_ + i_631_ * anInt7502]
			= (short) i_638_;
		    aShortArray7491[i_630_ + i_631_ * anInt7502]
			= (short) i_639_;
		    aByteArray7492[i_630_ + i_631_ * anInt7502]
			= (byte) i_640_;
		    if (i_641_ == 1) {
			anObjectArray7493[i_630_ + i_631_ * anInt7502]
			    = new Integer(class525_sub38
					      .readBigSmart(-2043778683));
			aByteArray7494[i_630_ + i_631_ * anInt7502]
			    = class525_sub38.readByte(-1150098071);
		    } else if (i_641_ > 1) {
			int[] is_642_ = new int[i_641_];
			byte[] is_643_ = new byte[i_641_];
			for (int i_644_ = 0; i_644_ < i_641_; i_644_++) {
			    is_642_[i_644_]
				= class525_sub38.readBigSmart(-2043778683);
			    is_643_[i_644_]
				= class525_sub38.readByte(-1150098071);
			}
			anObjectArray7493[i_630_ + i_631_ * anInt7502]
			    = new Class525_Sub35(is_642_, is_643_);
		    }
		} else {
		    int[] is_645_ = null;
		    byte[] is_646_ = null;
		    if (i_641_ > 0) {
			is_645_ = new int[i_641_];
			is_646_ = new byte[i_641_];
			for (int i_647_ = 0; i_647_ < i_641_; i_647_++) {
			    is_645_[i_647_]
				= class525_sub38.readBigSmart(-2043778683);
			    is_646_[i_647_]
				= class525_sub38.readByte(-1150098071);
			}
		    }
		    if ((aHashMapArrayArrayArray7506[i_637_ - 1]
			 [i - (anInt7483 >> 6)][i_629_ - (anInt7484 >> 6)])
			== null)
			aHashMapArrayArrayArray7506[i_637_ - 1]
			    [i - (anInt7483 >> 6)][i_629_ - (anInt7484 >> 6)]
			    = new HashMap();
		    int i_648_ = ((i_630_ & 0x3f) << 8) + (i_631_ & 0x3f);
		    Class528 class528
			= new Class528(i_630_ & 0x3f, i_631_ & 0x3f, i_638_,
				       i_639_, i_640_, is_645_, is_646_);
		    aHashMapArrayArrayArray7506[i_637_ - 1]
			[i - (anInt7483 >> 6)][i_629_ - (anInt7484 >> 6)]
			.put(Integer.valueOf(i_648_), class528);
		}
	    }
	}
    }
    
    static Class709 method9322(Class182 class182) {
	int i = anInt7523 - anInt7489;
	int i_649_ = anInt7522 - anInt7524;
	int i_650_ = (anInt7527 - anInt7525 << 16) / i;
	int i_651_ = (anInt7528 - anInt7480 << 16) / i_649_;
	return method9269(class182, i_650_, i_651_, 0, 0);
    }
    
    static void method9323(Class182 class182, Class525_Sub37 class525_sub37,
			   Class287 class287) {
	if (class287.anIntArray3175 != null) {
	    int[] is = new int[class287.anIntArray3175.length];
	    for (int i = 0; i < is.length / 2; i++) {
		int i_652_ = (class287.anIntArray3175[i * 2]
			      + class525_sub37.anInt10826 * 1273194629);
		int i_653_ = (class287.anIntArray3175[i * 2 + 1]
			      + class525_sub37.anInt10824 * -1383897689);
		is[i * 2] = anInt7525 + ((anInt7527 - anInt7525)
					 * (i_652_ - anInt7489)
					 / (anInt7523 - anInt7489));
		is[i * 2 + 1] = anInt7528 - ((anInt7528 - anInt7480)
					     * (i_653_ - anInt7524)
					     / (anInt7522 - anInt7524));
	    }
	    Class167.method2694(class182, is,
				class287.anInt3183 * -2074779725);
	    if (class287.anInt3181 * 668357193 > 0) {
		for (int i = 0; i < is.length / 2 - 1; i++) {
		    int i_654_ = is[i * 2];
		    int i_655_ = is[i * 2 + 1];
		    int i_656_ = is[(i + 1) * 2];
		    int i_657_ = is[(i + 1) * 2 + 1];
		    if (i_656_ < i_654_) {
			int i_658_ = i_654_;
			int i_659_ = i_655_;
			i_654_ = i_656_;
			i_655_ = i_657_;
			i_656_ = i_658_;
			i_657_ = i_659_;
		    } else if (i_656_ == i_654_ && i_657_ < i_655_) {
			int i_660_ = i_655_;
			i_655_ = i_657_;
			i_657_ = i_660_;
		    }
		    class182.method3508(i_654_, i_655_, i_656_, i_657_,
					(class287.anIntArray3165
					 [class287.aByteArray3189[i] & 0xff]),
					1, class287.anInt3181 * 668357193,
					class287.anInt3182 * 310583221,
					class287.anInt3162 * -1258236733);
		}
		int i = is[is.length - 2];
		int i_661_ = is[is.length - 1];
		int i_662_ = is[0];
		int i_663_ = is[1];
		if (i_662_ < i) {
		    int i_664_ = i;
		    int i_665_ = i_661_;
		    i = i_662_;
		    i_661_ = i_663_;
		    i_662_ = i_664_;
		    i_663_ = i_665_;
		} else if (i_662_ == i && i_663_ < i_661_) {
		    int i_666_ = i_661_;
		    i_661_ = i_663_;
		    i_663_ = i_666_;
		}
		class182.method3508(i, i_661_, i_662_, i_663_,
				    (class287.anIntArray3165
				     [((class287.aByteArray3189
					[class287.aByteArray3189.length - 1])
				       & 0xff)]),
				    1, class287.anInt3181 * 668357193,
				    class287.anInt3182 * 310583221,
				    class287.anInt3162 * -1258236733);
	    } else {
		for (int i = 0; i < is.length / 2 - 1; i++)
		    class182.method3194(is[i * 2], is[i * 2 + 1],
					is[(i + 1) * 2], is[(i + 1) * 2 + 1],
					(class287.anIntArray3165
					 [class287.aByteArray3189[i] & 0xff]),
					-1980434001);
		class182.method3194(is[is.length - 2], is[is.length - 1],
				    is[0], is[1],
				    (class287.anIntArray3165
				     [((class287.aByteArray3189
					[class287.aByteArray3189.length - 1])
				       & 0xff)]),
				    -2099059678);
	    }
	}
    }
    
    static Class709 method9324(Class182 class182, int i, int i_667_,
			       int i_668_, int i_669_) {
	for (Class525_Sub37 class525_sub37
		 = (Class525_Sub37) aClass709_7473.method14372((short) -19386);
	     class525_sub37 != null;
	     class525_sub37
		 = (Class525_Sub37) aClass709_7473.method14353(-1877113493))
	    method9309(class182, class525_sub37, i, i_667_, i_668_, i_669_);
	return aClass709_7473;
    }
    
    static Class709 method9325(Class182 class182, int i, int i_670_,
			       int i_671_, int i_672_) {
	for (Class525_Sub37 class525_sub37
		 = (Class525_Sub37) aClass709_7473.method14372((short) -14579);
	     class525_sub37 != null;
	     class525_sub37
		 = (Class525_Sub37) aClass709_7473.method14353(-1192732587))
	    method9309(class182, class525_sub37, i, i_670_, i_671_, i_672_);
	return aClass709_7473;
    }
    
    static void method9326(Class180 class180, int i, int i_673_) {
	for (int i_674_ = 0; i_674_ < anInterface13_7498.method72(1366571579);
	     i_674_++)
	    anIntArray7487[i_674_ + 1]
		= method9348(class180, i_674_, i, i_673_);
    }
    
    static void method9327(Class182 class182, Class525_Sub37 class525_sub37,
			   int i, int i_675_, int i_676_, int i_677_) {
	class525_sub37.anInt10827
	    = (anInt7525
	       + (i_676_ + i * (class525_sub37.anInt10826 * 1273194629
				- anInt7489)
		  >> 16)) * -465270039;
	class525_sub37.anInt10828
	    = (anInt7528
	       - (i_677_ + i_675_ * (class525_sub37.anInt10824 * -1383897689
				     - anInt7524)
		  >> 16)) * -244938849;
    }
    
    static void method9328(Class182 class182, Class525_Sub37 class525_sub37,
			   int i, int i_678_, int i_679_, int i_680_) {
	class525_sub37.anInt10827
	    = (anInt7525
	       + (i_679_ + i * (class525_sub37.anInt10826 * 1273194629
				- anInt7489)
		  >> 16)) * -465270039;
	class525_sub37.anInt10828
	    = (anInt7528
	       - (i_680_ + i_678_ * (class525_sub37.anInt10824 * -1383897689
				     - anInt7524)
		  >> 16)) * -244938849;
    }
    
    static void method9329(Class182 class182, Class525_Sub37 class525_sub37,
			   int i, int i_681_, int i_682_, int i_683_) {
	class525_sub37.anInt10827
	    = (anInt7525
	       + (i_682_ + i * (class525_sub37.anInt10826 * 1273194629
				- anInt7489)
		  >> 16)) * -465270039;
	class525_sub37.anInt10828
	    = (anInt7528
	       - (i_683_ + i_681_ * (class525_sub37.anInt10824 * -1383897689
				     - anInt7524)
		  >> 16)) * -244938849;
    }
    
    public static void method9330
	(Class458 class458, Class458 class458_684_,
	 Class40_Sub18 class40_sub18, Class40_Sub14 class40_sub14,
	 Class40_Sub11 class40_sub11, Class40_Sub2 class40_sub2,
	 Class40_Sub17 class40_sub17, Interface20 interface20,
	 Interface18 interface18) {
	aClass458_7470 = class458;
	aClass458_7471 = class458_684_;
	anInterface13_7498 = class40_sub18;
	anInterface13_7462 = class40_sub14;
	aClass40_Sub11_7463 = class40_sub11;
	aClass40_Sub2_7464 = class40_sub2;
	aClass40_Sub17_7465 = class40_sub17;
	anInterface20_7472 = interface20;
	anInterface18_7466 = interface18;
	aClass10_7499.method688((short) -20652);
	int[] is
	    = aClass458_7470.method7540(Class643.aClass643_8330.method80(),
					1918765767);
	if (is != null) {
	    for (int i = 0; i < is.length; i++) {
		Class525_Sub16_Sub6 class525_sub16_sub6
		    = Class603.method9982(aClass458_7470, is[i], (byte) 0);
		aClass10_7499.method695(class525_sub16_sub6,
					(long) (class525_sub16_sub6.anInt11777
						* 2044380983));
	    }
	}
	Class455_Sub1.method15988(true, false, 679780902);
    }
    
    static void method9331(Class182 class182, int[] is, int i, int i_685_,
			   int i_686_, int[] is_687_, byte[] is_688_) {
	if (is_687_ != null) {
	    for (int i_689_ = 0; i_689_ < is_687_.length; i_689_++) {
		Class602 class602
		    = (Class602) aClass40_Sub11_7463.method76(is_687_[i_689_],
							      1176218718);
		int i_690_ = class602.anInt7895 * 1280945471;
		if (i_690_ != -1) {
		    Class79 class79
			= ((Class79)
			   aClass40_Sub17_7465.method76(i_690_, -920865297));
		    Class157 class157
			= class79.method1574(class182,
					     (class602.aBool7905
					      ? is_688_[i_689_] >> 6 & 0x3
					      : 0),
					     (class602.aBool7945
					      ? class602.aBool7891 : false),
					     -1063824970);
		    int[] is_691_
			= class79.method1578(class182,
					     (class602.aBool7905
					      ? is_688_[i_689_] >> 6 & 0x3
					      : 0),
					     (class602.aBool7945
					      ? class602.aBool7891 : false),
					     (byte) -45);
		    if (class157 != null) {
			int i_692_ = class157.method12();
			int i_693_ = class157.method2472();
			int i_694_ = i * i_692_ / 64 >> 2;
			int i_695_ = i * i_693_ / 64 >> 2;
			if (class79.aBool837) {
			    int i_696_ = class602.anInt7885 * -2084474039;
			    int i_697_ = class602.anInt7886 * 1437840657;
			    if ((is_688_[i_689_] >> 6 & 0x1) == 1) {
				int i_698_ = i_696_;
				i_696_ = i_697_;
				i_697_ = i_698_;
			    }
			    i_694_ = i_696_ * i / 64;
			    i_695_ = i_697_ * i / 64;
			}
			if (i_694_ != 0 && i_695_ != 0) {
			    int i_699_ = i_685_ * i / 64;
			    int i_700_ = (64 - i_686_) * i / 64 - i_695_ + 1;
			    for (int i_701_ = 0; i_701_ < i_694_; i_701_++) {
				int i_702_ = i_701_ + i_699_;
				if (i_702_ >= 0) {
				    if (i_702_ >= i)
					break;
				    for (int i_703_ = 0; i_703_ < i_695_;
					 i_703_++) {
					int i_704_ = i_703_ + i_700_;
					if (i_704_ >= 0) {
					    if (i_704_ >= i)
						break;
					    int i_705_
						= (is_691_
						   [(i_701_ * i_692_ / i_694_
						     + i_692_ * (i_703_
								 * i_693_
								 / i_695_))]);
					    int i_706_ = i_705_ >> 24 & 0xff;
					    if (i_706_ != 0)
						is[i_702_ + i * i_704_]
						    = i_705_;
					}
				    }
				}
			    }
			}
		    }
		}
	    }
	}
    }
    
    static void method9332(Class182 class182, Class525_Sub37 class525_sub37,
			   Class287 class287) {
	if (class287.anIntArray3175 != null) {
	    int[] is = new int[class287.anIntArray3175.length];
	    for (int i = 0; i < is.length / 2; i++) {
		int i_707_ = (class287.anIntArray3175[i * 2]
			      + class525_sub37.anInt10826 * 1273194629);
		int i_708_ = (class287.anIntArray3175[i * 2 + 1]
			      + class525_sub37.anInt10824 * -1383897689);
		is[i * 2] = anInt7525 + ((anInt7527 - anInt7525)
					 * (i_707_ - anInt7489)
					 / (anInt7523 - anInt7489));
		is[i * 2 + 1] = anInt7528 - ((anInt7528 - anInt7480)
					     * (i_708_ - anInt7524)
					     / (anInt7522 - anInt7524));
	    }
	    Class167.method2694(class182, is,
				class287.anInt3183 * -2074779725);
	    if (class287.anInt3181 * 668357193 > 0) {
		for (int i = 0; i < is.length / 2 - 1; i++) {
		    int i_709_ = is[i * 2];
		    int i_710_ = is[i * 2 + 1];
		    int i_711_ = is[(i + 1) * 2];
		    int i_712_ = is[(i + 1) * 2 + 1];
		    if (i_711_ < i_709_) {
			int i_713_ = i_709_;
			int i_714_ = i_710_;
			i_709_ = i_711_;
			i_710_ = i_712_;
			i_711_ = i_713_;
			i_712_ = i_714_;
		    } else if (i_711_ == i_709_ && i_712_ < i_710_) {
			int i_715_ = i_710_;
			i_710_ = i_712_;
			i_712_ = i_715_;
		    }
		    class182.method3508(i_709_, i_710_, i_711_, i_712_,
					(class287.anIntArray3165
					 [class287.aByteArray3189[i] & 0xff]),
					1, class287.anInt3181 * 668357193,
					class287.anInt3182 * 310583221,
					class287.anInt3162 * -1258236733);
		}
		int i = is[is.length - 2];
		int i_716_ = is[is.length - 1];
		int i_717_ = is[0];
		int i_718_ = is[1];
		if (i_717_ < i) {
		    int i_719_ = i;
		    int i_720_ = i_716_;
		    i = i_717_;
		    i_716_ = i_718_;
		    i_717_ = i_719_;
		    i_718_ = i_720_;
		} else if (i_717_ == i && i_718_ < i_716_) {
		    int i_721_ = i_716_;
		    i_716_ = i_718_;
		    i_718_ = i_721_;
		}
		class182.method3508(i, i_716_, i_717_, i_718_,
				    (class287.anIntArray3165
				     [((class287.aByteArray3189
					[class287.aByteArray3189.length - 1])
				       & 0xff)]),
				    1, class287.anInt3181 * 668357193,
				    class287.anInt3182 * 310583221,
				    class287.anInt3162 * -1258236733);
	    } else {
		for (int i = 0; i < is.length / 2 - 1; i++)
		    class182.method3194(is[i * 2], is[i * 2 + 1],
					is[(i + 1) * 2], is[(i + 1) * 2 + 1],
					(class287.anIntArray3165
					 [class287.aByteArray3189[i] & 0xff]),
					-2140156783);
		class182.method3194(is[is.length - 2], is[is.length - 1],
				    is[0], is[1],
				    (class287.anIntArray3165
				     [((class287.aByteArray3189
					[class287.aByteArray3189.length - 1])
				       & 0xff)]),
				    -2013991295);
	    }
	}
    }
    
    static boolean method9333(int i, int i_722_) {
	int i_723_ = i >> 3;
	int i_724_ = i_722_ >> 3;
	if (i_723_ < 0 || i_724_ < 0 || i_723_ >= aBoolArrayArray7515.length
	    || i_724_ >= aBoolArrayArray7515[i_723_].length)
	    return false;
	return aBoolArrayArray7515[i_723_][i_724_];
    }
    
    static boolean method9334(int i, int i_725_) {
	int i_726_ = i >> 3;
	int i_727_ = i_725_ >> 3;
	if (i_726_ < 0 || i_727_ < 0 || i_726_ >= aBoolArrayArray7515.length
	    || i_727_ >= aBoolArrayArray7515[i_726_].length)
	    return false;
	return aBoolArrayArray7515[i_726_][i_727_];
    }
    
    static boolean method9335(int i, int i_728_) {
	int i_729_ = i >> 3;
	int i_730_ = i_728_ >> 3;
	if (i_729_ < 0 || i_730_ < 0 || i_729_ >= aBoolArrayArray7515.length
	    || i_730_ >= aBoolArrayArray7515[i_729_].length)
	    return false;
	return aBoolArrayArray7515[i_729_][i_730_];
    }
    
    static int method9336() {
	return (int) (64.0F * aFloat7526 / 2.0F);
    }
    
    static int method9337() {
	return (int) (64.0F * aFloat7526 / 2.0F);
    }
    
    static void method9338(int[] is, int i, int i_731_, int i_732_, int i_733_,
			   int i_734_) {
	int i_735_ = aClass623_7468.anInt8116 * -70148343 >> 24 & 0xff;
	int i_736_ = 255 - i_735_;
	if ((!aBoolArray7531[anInt7474]
	     || !aBoolArray7531[anInt7500] && !aBoolArray7531[anInt7488])
	    && (!aBoolArray7531[anInt7514]
		|| !aBoolArray7531[anInt7500] && !aBoolArray7531[anInt7488])) {
	    method9278(is, i, i_731_, i_732_, i_733_, i_734_, i_735_, i_736_,
		       true, true, true, true);
	    if (aBoolArray7531[anInt7481]) {
		is[(i_734_ - i_733_ - 1) * i_734_ + i_731_]
		    = aClass623_7468.anInt8117 * 425619501;
		is[(i_734_ - i_733_) * i_734_ + i_731_]
		    = aClass623_7468.anInt8117 * 425619501;
		is[(i_734_ - i_733_ - 1) * i_734_ + i_731_ - 1]
		    = aClass623_7468.anInt8117 * 425619501;
	    }
	    if (aBoolArray7531[anInt7501]) {
		is[(i_734_ - i_732_ - 1) * i_734_ + i_731_]
		    = aClass623_7468.anInt8117 * 425619501;
		is[(i_734_ - i_732_ - 2) * i_734_ + i_731_]
		    = aClass623_7468.anInt8117 * 425619501;
		is[(i_734_ - i_732_ - 1) * i_734_ + i_731_ - 1]
		    = aClass623_7468.anInt8117 * 425619501;
	    }
	    if (aBoolArray7531[anInt7503]) {
		is[(i_734_ - i_732_ - 1) * i_734_ + i]
		    = aClass623_7468.anInt8117 * 425619501;
		is[(i_734_ - i_732_ - 2) * i_734_ + i]
		    = aClass623_7468.anInt8117 * 425619501;
		is[(i_734_ - i_732_ - 1) * i_734_ + i + 1]
		    = aClass623_7468.anInt8117 * 425619501;
	    }
	    if (aBoolArray7531[anInt7505]) {
		is[(i_734_ - i_733_ - 1) * i_734_ + i]
		    = aClass623_7468.anInt8117 * 425619501;
		is[(i_734_ - i_733_) * i_734_ + i]
		    = aClass623_7468.anInt8117 * 425619501;
		is[(i_734_ - i_733_ - 1) * i_734_ + i + 1]
		    = aClass623_7468.anInt8117 * 425619501;
	    }
	} else {
	    if (aBoolArray7531[anInt7474] && aBoolArray7531[anInt7500])
		method9279(is,
			   i_731_ - aClass623_7468.anInt8119 * -1016598897 + 1,
			   i_733_ - aClass623_7468.anInt8119 * -1016598897 + 1,
			   i_734_, i_735_, i_736_, anInt7481);
	    else {
		method9278(is,
			   i_731_ - aClass623_7468.anInt8119 * -1016598897 + 1,
			   i_731_,
			   i_733_ - aClass623_7468.anInt8119 * -1016598897 + 1,
			   i_733_, i_734_, i_735_, i_736_, true, true, false,
			   false);
		if (aBoolArray7531[anInt7481]) {
		    is[(i_734_ - i_733_ - 1) * i_734_ + i_731_]
			= aClass623_7468.anInt8117 * 425619501;
		    is[(i_734_ - i_733_) * i_734_ + i_731_]
			= aClass623_7468.anInt8117 * 425619501;
		    is[(i_734_ - i_733_ - 1) * i_734_ + i_731_ - 1]
			= aClass623_7468.anInt8117 * 425619501;
		}
	    }
	    if (aBoolArray7531[anInt7514] && aBoolArray7531[anInt7500])
		method9279(is,
			   i_731_ - aClass623_7468.anInt8119 * -1016598897 + 1,
			   i_732_, i_734_, i_735_, i_736_, anInt7501);
	    else {
		method9278(is,
			   i_731_ - aClass623_7468.anInt8119 * -1016598897 + 1,
			   i_731_, i_732_,
			   i_732_ + aClass623_7468.anInt8119 * -1016598897 - 1,
			   i_734_, i_735_, i_736_, false, true, true, false);
		if (aBoolArray7531[anInt7501]) {
		    is[(i_734_ - i_732_ - 1) * i_734_ + i_731_]
			= aClass623_7468.anInt8117 * 425619501;
		    is[(i_734_ - i_732_ - 2) * i_734_ + i_731_]
			= aClass623_7468.anInt8117 * 425619501;
		    is[(i_734_ - i_732_ - 1) * i_734_ + i_731_ - 1]
			= aClass623_7468.anInt8117 * 425619501;
		}
	    }
	    if (aBoolArray7531[anInt7514] && aBoolArray7531[anInt7488])
		method9279(is, i, i_732_, i_734_, i_735_, i_736_, anInt7503);
	    else {
		method9278(is, i,
			   i + aClass623_7468.anInt8119 * -1016598897 - 1,
			   i_732_,
			   i_732_ + aClass623_7468.anInt8119 * -1016598897 - 1,
			   i_734_, i_735_, i_736_, false, false, true, true);
		if (aBoolArray7531[anInt7503]) {
		    is[(i_734_ - i_732_ - 1) * i_734_ + i]
			= aClass623_7468.anInt8117 * 425619501;
		    is[(i_734_ - i_732_ - 2) * i_734_ + i]
			= aClass623_7468.anInt8117 * 425619501;
		    is[(i_734_ - i_732_ - 1) * i_734_ + i + 1]
			= aClass623_7468.anInt8117 * 425619501;
		}
	    }
	    if (aBoolArray7531[anInt7474] && aBoolArray7531[anInt7488])
		method9279(is, i,
			   i_733_ - aClass623_7468.anInt8119 * -1016598897 + 1,
			   i_734_, i_735_, i_736_, anInt7505);
	    else {
		method9278(is, i,
			   i + aClass623_7468.anInt8119 * -1016598897 - 1,
			   i_733_ - aClass623_7468.anInt8119 * -1016598897 + 1,
			   i_733_, i_734_, i_735_, i_736_, true, false, false,
			   true);
		if (aBoolArray7531[anInt7505]) {
		    is[(i_734_ - i_733_ - 1) * i_734_ + i]
			= aClass623_7468.anInt8117 * 425619501;
		    is[(i_734_ - i_733_) * i_734_ + i]
			= aClass623_7468.anInt8117 * 425619501;
		    is[(i_734_ - i_733_ - 1) * i_734_ + i + 1]
			= aClass623_7468.anInt8117 * 425619501;
		}
	    }
	    if (i + aClass623_7468.anInt8119 * -1016598897
		< i_731_ - aClass623_7468.anInt8119 * -1016598897)
		method9278(is, i + aClass623_7468.anInt8119 * -1016598897,
			   i_731_ - aClass623_7468.anInt8119 * -1016598897,
			   i_732_, i_733_, i_734_, i_735_, i_736_, true, false,
			   true, false);
	    if (i_732_ + aClass623_7468.anInt8119 * -1016598897 + 1
		< i_733_ - aClass623_7468.anInt8119 * -1016598897 - 1) {
		method9278(is, i,
			   i + aClass623_7468.anInt8119 * -1016598897 - 1,
			   i_732_ + aClass623_7468.anInt8119 * -1016598897,
			   i_733_ - aClass623_7468.anInt8119 * -1016598897,
			   i_734_, i_735_, i_736_, false, false, false, true);
		method9278(is,
			   i_731_ - aClass623_7468.anInt8119 * -1016598897 + 1,
			   i_731_,
			   i_732_ + aClass623_7468.anInt8119 * -1016598897,
			   i_733_ - aClass623_7468.anInt8119 * -1016598897,
			   i_734_, i_735_, i_736_, false, true, false, false);
	    }
	}
    }
    
    static void method9339(int[] is, int i, int i_737_, int i_738_, int i_739_,
			   int i_740_, int i_741_, int i_742_) {
	for (int i_743_ = i; i_743_ <= i_737_; i_743_++) {
	    for (int i_744_ = i_738_; i_744_ <= i_739_; i_744_++)
		is[(i_741_ - i_744_ - 1) * i_740_ + i_743_] = i_742_;
	}
    }
    
    static void method9340(int[] is, int i, int i_745_, int i_746_, int i_747_,
			   int i_748_, int i_749_, int i_750_) {
	for (int i_751_ = i; i_751_ <= i_745_; i_751_++) {
	    for (int i_752_ = i_746_; i_752_ <= i_747_; i_752_++)
		is[(i_749_ - i_752_ - 1) * i_748_ + i_751_] = i_750_;
	}
    }
    
    static void method9341(int[] is, int i, int i_753_, int i_754_, int i_755_,
			   int i_756_, int i_757_, int i_758_) {
	for (int i_759_ = i; i_759_ <= i_753_; i_759_++) {
	    for (int i_760_ = i_754_; i_760_ <= i_755_; i_760_++)
		is[(i_757_ - i_760_ - 1) * i_756_ + i_759_] = i_758_;
	}
    }
    
    static int method9342(Class180 class180, int i, int i_761_, int i_762_) {
	return method9254(anInterface13_7498, class180, i, i_761_, i_762_);
    }
    
    static void method9343(int[] is, int i, int i_763_, int i_764_, int i_765_,
			   int i_766_, int i_767_) {
	for (int i_768_ = 0; i_768_ < aClass623_7468.anInt8119 * -1016598897;
	     i_768_++) {
	    int i_769_ = i_768_;
	    if (i_767_ == anInt7481 || i_767_ == anInt7501)
		i_769_ = aClass623_7468.anInt8119 * -1016598897 - i_768_ - 1;
	    for (int i_770_ = 0;
		 i_770_ < aClass623_7468.anInt8119 * -1016598897; i_770_++) {
		int i_771_ = i_770_;
		if (i_767_ == anInt7501 || i_767_ == anInt7503)
		    i_771_
			= aClass623_7468.anInt8119 * -1016598897 - i_770_ - 1;
		int i_772_ = anIntArrayArray7497[i_769_][i_771_];
		if (i_772_ != 0) {
		    if (i_772_ == 1) {
			int i_773_
			    = is[((i_764_ - i_763_ - i_770_ - 1) * i_764_ + i
				  + i_768_)];
			if (i_773_ != anInt7529) {
			    anInt7529 = i_773_;
			    anInt7530
				= (~0xffffff
				   | ((((aClass623_7468.anInt8116 * -70148343
					 & 0xff00ff) * i_765_
					+ (i_773_ & 0xff00ff) * i_766_)
				       & ~0xff00ff)
				      + (((aClass623_7468.anInt8116 * -70148343
					   & 0xff00) * i_765_
					  + (i_773_ & 0xff00) * i_766_)
					 & 0xff0000)) >> 8);
			}
			is[((i_764_ - i_763_ - i_770_ - 1) * i_764_ + i
			    + i_768_)]
			    = anInt7530;
		    } else if (i_772_ == 2)
			is[((i_764_ - i_763_ - i_770_ - 1) * i_764_ + i
			    + i_768_)]
			    = aClass623_7468.anInt8117 * 425619501;
		}
	    }
	}
    }
    
    static void method9344(int[] is, int i, int i_774_, int i_775_, int i_776_,
			   int i_777_) {
	int i_778_ = aClass623_7468.anInt8116 * -70148343 >> 24 & 0xff;
	int i_779_ = 255 - i_778_;
	if ((!aBoolArray7531[anInt7474]
	     || !aBoolArray7531[anInt7500] && !aBoolArray7531[anInt7488])
	    && (!aBoolArray7531[anInt7514]
		|| !aBoolArray7531[anInt7500] && !aBoolArray7531[anInt7488])) {
	    method9278(is, i, i_774_, i_775_, i_776_, i_777_, i_778_, i_779_,
		       true, true, true, true);
	    if (aBoolArray7531[anInt7481]) {
		is[(i_777_ - i_776_ - 1) * i_777_ + i_774_]
		    = aClass623_7468.anInt8117 * 425619501;
		is[(i_777_ - i_776_) * i_777_ + i_774_]
		    = aClass623_7468.anInt8117 * 425619501;
		is[(i_777_ - i_776_ - 1) * i_777_ + i_774_ - 1]
		    = aClass623_7468.anInt8117 * 425619501;
	    }
	    if (aBoolArray7531[anInt7501]) {
		is[(i_777_ - i_775_ - 1) * i_777_ + i_774_]
		    = aClass623_7468.anInt8117 * 425619501;
		is[(i_777_ - i_775_ - 2) * i_777_ + i_774_]
		    = aClass623_7468.anInt8117 * 425619501;
		is[(i_777_ - i_775_ - 1) * i_777_ + i_774_ - 1]
		    = aClass623_7468.anInt8117 * 425619501;
	    }
	    if (aBoolArray7531[anInt7503]) {
		is[(i_777_ - i_775_ - 1) * i_777_ + i]
		    = aClass623_7468.anInt8117 * 425619501;
		is[(i_777_ - i_775_ - 2) * i_777_ + i]
		    = aClass623_7468.anInt8117 * 425619501;
		is[(i_777_ - i_775_ - 1) * i_777_ + i + 1]
		    = aClass623_7468.anInt8117 * 425619501;
	    }
	    if (aBoolArray7531[anInt7505]) {
		is[(i_777_ - i_776_ - 1) * i_777_ + i]
		    = aClass623_7468.anInt8117 * 425619501;
		is[(i_777_ - i_776_) * i_777_ + i]
		    = aClass623_7468.anInt8117 * 425619501;
		is[(i_777_ - i_776_ - 1) * i_777_ + i + 1]
		    = aClass623_7468.anInt8117 * 425619501;
	    }
	} else {
	    if (aBoolArray7531[anInt7474] && aBoolArray7531[anInt7500])
		method9279(is,
			   i_774_ - aClass623_7468.anInt8119 * -1016598897 + 1,
			   i_776_ - aClass623_7468.anInt8119 * -1016598897 + 1,
			   i_777_, i_778_, i_779_, anInt7481);
	    else {
		method9278(is,
			   i_774_ - aClass623_7468.anInt8119 * -1016598897 + 1,
			   i_774_,
			   i_776_ - aClass623_7468.anInt8119 * -1016598897 + 1,
			   i_776_, i_777_, i_778_, i_779_, true, true, false,
			   false);
		if (aBoolArray7531[anInt7481]) {
		    is[(i_777_ - i_776_ - 1) * i_777_ + i_774_]
			= aClass623_7468.anInt8117 * 425619501;
		    is[(i_777_ - i_776_) * i_777_ + i_774_]
			= aClass623_7468.anInt8117 * 425619501;
		    is[(i_777_ - i_776_ - 1) * i_777_ + i_774_ - 1]
			= aClass623_7468.anInt8117 * 425619501;
		}
	    }
	    if (aBoolArray7531[anInt7514] && aBoolArray7531[anInt7500])
		method9279(is,
			   i_774_ - aClass623_7468.anInt8119 * -1016598897 + 1,
			   i_775_, i_777_, i_778_, i_779_, anInt7501);
	    else {
		method9278(is,
			   i_774_ - aClass623_7468.anInt8119 * -1016598897 + 1,
			   i_774_, i_775_,
			   i_775_ + aClass623_7468.anInt8119 * -1016598897 - 1,
			   i_777_, i_778_, i_779_, false, true, true, false);
		if (aBoolArray7531[anInt7501]) {
		    is[(i_777_ - i_775_ - 1) * i_777_ + i_774_]
			= aClass623_7468.anInt8117 * 425619501;
		    is[(i_777_ - i_775_ - 2) * i_777_ + i_774_]
			= aClass623_7468.anInt8117 * 425619501;
		    is[(i_777_ - i_775_ - 1) * i_777_ + i_774_ - 1]
			= aClass623_7468.anInt8117 * 425619501;
		}
	    }
	    if (aBoolArray7531[anInt7514] && aBoolArray7531[anInt7488])
		method9279(is, i, i_775_, i_777_, i_778_, i_779_, anInt7503);
	    else {
		method9278(is, i,
			   i + aClass623_7468.anInt8119 * -1016598897 - 1,
			   i_775_,
			   i_775_ + aClass623_7468.anInt8119 * -1016598897 - 1,
			   i_777_, i_778_, i_779_, false, false, true, true);
		if (aBoolArray7531[anInt7503]) {
		    is[(i_777_ - i_775_ - 1) * i_777_ + i]
			= aClass623_7468.anInt8117 * 425619501;
		    is[(i_777_ - i_775_ - 2) * i_777_ + i]
			= aClass623_7468.anInt8117 * 425619501;
		    is[(i_777_ - i_775_ - 1) * i_777_ + i + 1]
			= aClass623_7468.anInt8117 * 425619501;
		}
	    }
	    if (aBoolArray7531[anInt7474] && aBoolArray7531[anInt7488])
		method9279(is, i,
			   i_776_ - aClass623_7468.anInt8119 * -1016598897 + 1,
			   i_777_, i_778_, i_779_, anInt7505);
	    else {
		method9278(is, i,
			   i + aClass623_7468.anInt8119 * -1016598897 - 1,
			   i_776_ - aClass623_7468.anInt8119 * -1016598897 + 1,
			   i_776_, i_777_, i_778_, i_779_, true, false, false,
			   true);
		if (aBoolArray7531[anInt7505]) {
		    is[(i_777_ - i_776_ - 1) * i_777_ + i]
			= aClass623_7468.anInt8117 * 425619501;
		    is[(i_777_ - i_776_) * i_777_ + i]
			= aClass623_7468.anInt8117 * 425619501;
		    is[(i_777_ - i_776_ - 1) * i_777_ + i + 1]
			= aClass623_7468.anInt8117 * 425619501;
		}
	    }
	    if (i + aClass623_7468.anInt8119 * -1016598897
		< i_774_ - aClass623_7468.anInt8119 * -1016598897)
		method9278(is, i + aClass623_7468.anInt8119 * -1016598897,
			   i_774_ - aClass623_7468.anInt8119 * -1016598897,
			   i_775_, i_776_, i_777_, i_778_, i_779_, true, false,
			   true, false);
	    if (i_775_ + aClass623_7468.anInt8119 * -1016598897 + 1
		< i_776_ - aClass623_7468.anInt8119 * -1016598897 - 1) {
		method9278(is, i,
			   i + aClass623_7468.anInt8119 * -1016598897 - 1,
			   i_775_ + aClass623_7468.anInt8119 * -1016598897,
			   i_776_ - aClass623_7468.anInt8119 * -1016598897,
			   i_777_, i_778_, i_779_, false, false, false, true);
		method9278(is,
			   i_774_ - aClass623_7468.anInt8119 * -1016598897 + 1,
			   i_774_,
			   i_775_ + aClass623_7468.anInt8119 * -1016598897,
			   i_776_ - aClass623_7468.anInt8119 * -1016598897,
			   i_777_, i_778_, i_779_, false, true, false, false);
	    }
	}
    }
    
    static void method9345(int[] is, int i, int i_780_, int i_781_, int i_782_,
			   int i_783_) {
	int i_784_ = aClass623_7468.anInt8116 * -70148343 >> 24 & 0xff;
	int i_785_ = 255 - i_784_;
	for (int i_786_ = i; i_786_ <= i_780_; i_786_++) {
	    for (int i_787_ = i_781_; i_787_ <= i_782_; i_787_++) {
		int i_788_ = is[(i_783_ - i_787_ - 1) * i_783_ + i_786_];
		if (i_788_ != anInt7529) {
		    anInt7529 = i_788_;
		    anInt7530 = (~0xffffff
				 | ((((aClass623_7468.anInt8116 * -70148343
				       & 0xff00ff) * i_784_
				      + (i_788_ & 0xff00ff) * i_785_)
				     & ~0xff00ff)
				    + (((aClass623_7468.anInt8116 * -70148343
					 & 0xff00) * i_784_
					+ (i_788_ & 0xff00) * i_785_)
				       & 0xff0000)) >> 8);
		}
		is[(i_783_ - i_787_ - 1) * i_783_ + i_786_] = anInt7530;
	    }
	}
    }
    
    static void method9346(int[] is, int i, int i_789_, int i_790_, int i_791_,
			   int i_792_, int i_793_, int i_794_, boolean bool,
			   boolean bool_795_, boolean bool_796_,
			   boolean bool_797_) {
	for (int i_798_ = i; i_798_ <= i_789_; i_798_++) {
	    boolean bool_799_
		= bool_795_ ? (aBoolArray7531[anInt7500]
			       && i_789_ - i_798_ < (aClass623_7468.anInt8108
						     * 1785499363)) : false;
	    boolean bool_800_
		= (bool_797_
		   ? (aBoolArray7531[anInt7488]
		      && i_798_ - i < aClass623_7468.anInt8108 * 1785499363)
		   : false);
	    for (int i_801_ = i_790_; i_801_ <= i_791_; i_801_++) {
		if (bool_799_ || bool_800_)
		    is[(i_792_ - i_801_ - 1) * i_792_ + i_798_]
			= aClass623_7468.anInt8117 * 425619501;
		else {
		    boolean bool_802_
			= (bool
			   ? (aBoolArray7531[anInt7474]
			      && (i_791_ - i_801_
				  < aClass623_7468.anInt8108 * 1785499363))
			   : false);
		    boolean bool_803_
			= (bool_796_
			   ? (aBoolArray7531[anInt7514]
			      && (i_801_ - i_790_
				  < aClass623_7468.anInt8108 * 1785499363))
			   : false);
		    if (bool_802_ || bool_803_)
			is[(i_792_ - i_801_ - 1) * i_792_ + i_798_]
			    = aClass623_7468.anInt8117 * 425619501;
		    else {
			int i_804_
			    = is[(i_792_ - i_801_ - 1) * i_792_ + i_798_];
			if (i_804_ != anInt7529) {
			    anInt7529 = i_804_;
			    anInt7530
				= (~0xffffff
				   | ((((aClass623_7468.anInt8116 * -70148343
					 & 0xff00ff) * i_793_
					+ (i_804_ & 0xff00ff) * i_794_)
				       & ~0xff00ff)
				      + (((aClass623_7468.anInt8116 * -70148343
					   & 0xff00) * i_793_
					  + (i_804_ & 0xff00) * i_794_)
					 & 0xff0000)) >> 8);
			}
			is[(i_792_ - i_801_ - 1) * i_792_ + i_798_]
			    = anInt7530;
		    }
		}
	    }
	}
    }
    
    static void method9347(int[] is, int i, int i_805_, int i_806_, int i_807_,
			   int i_808_, int i_809_, int i_810_, boolean bool,
			   boolean bool_811_, boolean bool_812_,
			   boolean bool_813_) {
	for (int i_814_ = i; i_814_ <= i_805_; i_814_++) {
	    boolean bool_815_
		= bool_811_ ? (aBoolArray7531[anInt7500]
			       && i_805_ - i_814_ < (aClass623_7468.anInt8108
						     * 1785499363)) : false;
	    boolean bool_816_
		= (bool_813_
		   ? (aBoolArray7531[anInt7488]
		      && i_814_ - i < aClass623_7468.anInt8108 * 1785499363)
		   : false);
	    for (int i_817_ = i_806_; i_817_ <= i_807_; i_817_++) {
		if (bool_815_ || bool_816_)
		    is[(i_808_ - i_817_ - 1) * i_808_ + i_814_]
			= aClass623_7468.anInt8117 * 425619501;
		else {
		    boolean bool_818_
			= (bool
			   ? (aBoolArray7531[anInt7474]
			      && (i_807_ - i_817_
				  < aClass623_7468.anInt8108 * 1785499363))
			   : false);
		    boolean bool_819_
			= (bool_812_
			   ? (aBoolArray7531[anInt7514]
			      && (i_817_ - i_806_
				  < aClass623_7468.anInt8108 * 1785499363))
			   : false);
		    if (bool_818_ || bool_819_)
			is[(i_808_ - i_817_ - 1) * i_808_ + i_814_]
			    = aClass623_7468.anInt8117 * 425619501;
		    else {
			int i_820_
			    = is[(i_808_ - i_817_ - 1) * i_808_ + i_814_];
			if (i_820_ != anInt7529) {
			    anInt7529 = i_820_;
			    anInt7530
				= (~0xffffff
				   | ((((aClass623_7468.anInt8116 * -70148343
					 & 0xff00ff) * i_809_
					+ (i_820_ & 0xff00ff) * i_810_)
				       & ~0xff00ff)
				      + (((aClass623_7468.anInt8116 * -70148343
					   & 0xff00) * i_809_
					  + (i_820_ & 0xff00) * i_810_)
					 & 0xff0000)) >> 8);
			}
			is[(i_808_ - i_817_ - 1) * i_808_ + i_814_]
			    = anInt7530;
		    }
		}
	    }
	}
    }
    
    static int method9348(Class180 class180, int i, int i_821_, int i_822_) {
	return method9254(anInterface13_7498, class180, i, i_821_, i_822_);
    }
    
    static void method9349(int[] is, int i, int i_823_, int i_824_, int i_825_,
			   int i_826_, int i_827_) {
	for (int i_828_ = 0; i_828_ < aClass623_7468.anInt8119 * -1016598897;
	     i_828_++) {
	    int i_829_ = i_828_;
	    if (i_827_ == anInt7481 || i_827_ == anInt7501)
		i_829_ = aClass623_7468.anInt8119 * -1016598897 - i_828_ - 1;
	    for (int i_830_ = 0;
		 i_830_ < aClass623_7468.anInt8119 * -1016598897; i_830_++) {
		int i_831_ = i_830_;
		if (i_827_ == anInt7501 || i_827_ == anInt7503)
		    i_831_
			= aClass623_7468.anInt8119 * -1016598897 - i_830_ - 1;
		int i_832_ = anIntArrayArray7497[i_829_][i_831_];
		if (i_832_ != 0) {
		    if (i_832_ == 1) {
			int i_833_
			    = is[((i_824_ - i_823_ - i_830_ - 1) * i_824_ + i
				  + i_828_)];
			if (i_833_ != anInt7529) {
			    anInt7529 = i_833_;
			    anInt7530
				= (~0xffffff
				   | ((((aClass623_7468.anInt8116 * -70148343
					 & 0xff00ff) * i_825_
					+ (i_833_ & 0xff00ff) * i_826_)
				       & ~0xff00ff)
				      + (((aClass623_7468.anInt8116 * -70148343
					   & 0xff00) * i_825_
					  + (i_833_ & 0xff00) * i_826_)
					 & 0xff0000)) >> 8);
			}
			is[((i_824_ - i_823_ - i_830_ - 1) * i_824_ + i
			    + i_828_)]
			    = anInt7530;
		    } else if (i_832_ == 2)
			is[((i_824_ - i_823_ - i_830_ - 1) * i_824_ + i
			    + i_828_)]
			    = aClass623_7468.anInt8117 * 425619501;
		}
	    }
	}
    }
    
    static void method9350(int[] is, int i, int i_834_, int i_835_, int i_836_,
			   int i_837_, int i_838_, int i_839_, int i_840_,
			   byte[] is_841_, int i_842_, int i_843_) {
	int i_844_ = 0;
	int i_845_ = 0;
	int i_846_ = i_834_ - i + 1;
	int i_847_ = i_836_ - i_835_ + 1;
	int i_848_ = (i_842_ << 16) / i_846_;
	int i_849_ = (is_841_.length / i_842_ << 16) / i_847_;
	int i_850_ = i + (i_838_ - i_836_ - 1) * i_837_;
	int i_851_ = i_839_ >> 24;
	int i_852_ = i_840_ >> 24;
	if (i_843_ == 0 || i_843_ == 1 && i_851_ == 255 && i_852_ == 255) {
	    int i_853_ = i_844_;
	    for (int i_854_ = -i_847_; i_854_ < 0; i_854_++) {
		int i_855_ = (i_845_ >> 16) * i_842_;
		for (int i_856_ = -i_846_; i_856_ < 0; i_856_++) {
		    if (is_841_[(i_844_ >> 16) + i_855_] != 0)
			is[i_850_++] = i_840_;
		    else
			is[i_850_++] = i_839_;
		    i_844_ += i_848_;
		}
		i_845_ += i_849_;
		i_844_ = i_853_;
		i_850_ += i_837_ - i_846_;
	    }
	} else if (i_843_ == 1) {
	    int i_857_ = i_844_;
	    for (int i_858_ = -i_847_; i_858_ < 0; i_858_++) {
		int i_859_ = (i_845_ >> 16) * i_842_;
		for (int i_860_ = -i_846_; i_860_ < 0; i_860_++) {
		    int i_861_ = i_839_;
		    if (is_841_[(i_844_ >> 16) + i_859_] != 0)
			i_861_ = i_840_;
		    int i_862_ = i_861_ >>> 24;
		    int i_863_ = 255 - i_862_;
		    int i_864_ = is[i_850_];
		    is[i_850_++]
			= ~0xffffff | ((((i_861_ & 0xff00ff) * i_862_
					 + (i_864_ & 0xff00ff) * i_863_)
					& ~0xff00ff)
				       + (((i_861_ & 0xff00) * i_862_
					   + (i_864_ & 0xff00) * i_863_)
					  & 0xff0000)) >> 8;
		    i_844_ += i_848_;
		}
		i_845_ += i_849_;
		i_844_ = i_857_;
		i_850_ += i_837_ - i_846_;
	    }
	} else
	    throw new IllegalArgumentException();
    }
    
    static void method9351(int i, int i_865_, int i_866_, int i_867_,
			   int i_868_, int i_869_, int i_870_, int i_871_) {
	anInt7489 = i - anInt7483;
	anInt7522 = i_865_ - anInt7484;
	anInt7523 = i_866_ - anInt7483;
	anInt7524 = i_867_ - anInt7484;
	anInt7525 = i_868_;
	anInt7480 = i_869_;
	anInt7527 = i_870_;
	anInt7528 = i_871_;
    }
    
    static void method9352(int[] is, int i, int i_872_, int i_873_, int i_874_,
			   int i_875_) {
	int i_876_ = i + (i_874_ - i_872_ - 1) * i_874_;
	for (int i_877_ = 0; i_877_ < i_873_; i_877_++)
	    is[i_876_ + i_877_ * i_874_] = i_875_;
    }
    
    static void method9353(int[] is, int i, int i_878_, int i_879_, int i_880_,
			   int i_881_) {
	int i_882_ = i + (i_880_ - i_878_ - 1) * i_880_;
	for (int i_883_ = 0; i_883_ < i_879_; i_883_++)
	    is[i_882_ + i_883_ * i_880_] = i_881_;
    }
    
    static void method9354(int[] is, int i, int i_884_, int i_885_, int i_886_,
			   int i_887_) {
	int i_888_ = i + (i_886_ - i_884_ - 1) * i_886_;
	for (int i_889_ = 0; i_889_ < i_885_; i_889_++)
	    is[i_888_ + i_889_ * i_886_] = i_887_;
    }
}
