/* Class236 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.IOException;

public class Class236 implements Interface76
{
    static Class236 aClass236_2375;
    static Class236 aClass236_2376;
    static Class236 aClass236_2377;
    static Class236 aClass236_2378;
    static Class236 aClass236_2379;
    static Class236 aClass236_2380;
    static Class236 aClass236_2381;
    static Class236 aClass236_2382;
    static Class236 aClass236_2383;
    static Class236 aClass236_2384;
    static Class236 aClass236_2385;
    static Class236 aClass236_2386 = new Class236(5, 1);
    static Class236 aClass236_2387;
    static Class236 aClass236_2388;
    int anInt2389;
    int anInt2390;
    static int anInt2391;
    public static int anInt2392;
    
    static Class236[] method4405(byte i) {
	return new Class236[] { aClass236_2377, aClass236_2387, aClass236_2379,
				aClass236_2375, aClass236_2388, aClass236_2386,
				aClass236_2384, aClass236_2385, aClass236_2378,
				aClass236_2380, aClass236_2382, aClass236_2383,
				aClass236_2381, aClass236_2376 };
    }
    
    Class236(int i, int i_0_) {
	anInt2389 = 616438883 * i;
	anInt2390 = i_0_ * -739301431;
    }
    
    public int method80() {
	return anInt2390 * 755081849;
    }
    
    static {
	aClass236_2383 = new Class236(11, 2);
	aClass236_2377 = new Class236(0, 3);
	aClass236_2388 = new Class236(4, 4);
	aClass236_2379 = new Class236(2, 5);
	aClass236_2380 = new Class236(9, 6);
	aClass236_2381 = new Class236(12, 7);
	aClass236_2382 = new Class236(10, 8);
	aClass236_2376 = new Class236(13, 9);
	aClass236_2384 = new Class236(6, 10);
	aClass236_2385 = new Class236(7, 11);
	aClass236_2387 = new Class236(1, 12);
	aClass236_2378 = new Class236(8, 13);
	aClass236_2375 = new Class236(3, 14);
    }
    
    public int method57() {
	return anInt2390 * 755081849;
    }
    
    public int method75() {
	return anInt2390 * 755081849;
    }
    
    static Class236[] method4406() {
	return new Class236[] { aClass236_2377, aClass236_2387, aClass236_2379,
				aClass236_2375, aClass236_2388, aClass236_2386,
				aClass236_2384, aClass236_2385, aClass236_2378,
				aClass236_2380, aClass236_2382, aClass236_2383,
				aClass236_2381, aClass236_2376 };
    }
    
    static Class236[] method4407() {
	return new Class236[] { aClass236_2377, aClass236_2387, aClass236_2379,
				aClass236_2375, aClass236_2388, aClass236_2386,
				aClass236_2384, aClass236_2385, aClass236_2378,
				aClass236_2380, aClass236_2382, aClass236_2383,
				aClass236_2381, aClass236_2376 };
    }
    
    public static void method4408(RSBuffer class525_sub38, byte i) {
	byte[] is = new byte[24];
	try {
	    Class503.aClass37_5568.method986(0L);
	    Class503.aClass37_5568.method984(is, 1952921412);
	    int i_1_;
	    for (i_1_ = 0; i_1_ < 24 && is[i_1_] == 0; i_1_++) {
		/* empty */
	    }
	    if (i_1_ >= 24)
		throw new IOException();
	} catch (Exception exception) {
	    for (int i_2_ = 0; i_2_ < 24; i_2_++)
		is[i_2_] = (byte) -1;
	}
	class525_sub38.method16614(is, 0, 24, 1505498560);
    }
    
    public static void method4409(boolean bool, byte i) {
	/* empty */
    }
    
    static final void method4410(Class683 class683, int i) {
	int i_3_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub20_10701
		  .method14167(i_3_, (byte) 22);
    }
    
    static final void method4411(Class683 class683, int i) {
	int i_4_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = (((ItemDefinitions)
		Class313_Sub2.aClass40_Sub22_10106.method76(i_4_, -1016236451))
	       .anInt73) * 1345227511;
    }
    
    static final void method4412(Class683 class683, int i) {
	class683.anInt8662 -= -1189665054;
	int i_5_ = class683.anIntArray8661[class683.anInt8662 * 501271953];
	int i_6_ = class683.anIntArray8661[501271953 * class683.anInt8662 + 1];
	Class88 class88
	    = (Class88) client.aClass40_Sub16_11201.method76(i_6_, -108064865);
	if (class88.method1661(52001871))
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= ((Class525_Sub16_Sub3)
		   Class397.aClass47_Sub2_4113.method76(i_5_, 1042798185))
		      .method18002(i_6_, class88.aString892, 1265671832);
	else
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= (((Class525_Sub16_Sub3)
		    Class397.aClass47_Sub2_4113.method76(i_5_, 1548362427))
		       .method18008
		   (i_6_, class88.anInt893 * 2053564367, (byte) 80));
    }
    
    public static Class264 method4413(int i, byte i_7_) {
	if (1104244397 * Class264.aClass264_2802.anInt2804 == i)
	    return Class264.aClass264_2802;
	if (Class264.aClass264_2803.anInt2804 * 1104244397 == i)
	    return Class264.aClass264_2803;
	return null;
    }
}
