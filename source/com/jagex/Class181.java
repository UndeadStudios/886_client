/* Class181 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class181
{
    public static final int anInt1921 = 0;
    public static int[] anIntArray1922 = { 3, 7, 15 };
    public static final int anInt1923 = 16;
    public static final int anInt1924 = 32;
    public static int[] anIntArray1925 = { 2047, 16383, 65535 };
    public static final int anInt1926 = 2;
    public static final int anInt1927 = 64;
    public static final int anInt1928 = 16;
    public static final int anInt1929 = 0;
    public static final int anInt1930 = 1;
    public static final int anInt1931 = 8191;
    public static final int anInt1932 = 8;
    public static final int anInt1933 = 1023;
    public static final int anInt1934 = 2;
    
    Class181() throws Throwable {
	throw new Error();
    }
    
    static void method3122(int[] is, double d) {
	if (d != Class172.aDouble1860) {
	    for (int i = 0; i < 256; i++) {
		int i_0_ = (int) (Math.pow((double) i / 255.0, d) * 255.0);
		Class172.anIntArray1859[i] = i_0_ > 255 ? 255 : i_0_;
	    }
	    Class172.aDouble1860 = d;
	}
	for (int i = 0; i < is.length; i++) {
	    int i_1_ = Class172.anIntArray1859[is[i] >> 16 & 0xff];
	    int i_2_ = Class172.anIntArray1859[is[i] >> 8 & 0xff];
	    int i_3_ = Class172.anIntArray1859[is[i] >> 0 & 0xff];
	    is[i] = is[i] & ~0xffffff | i_1_ << 16 | i_2_ << 8 | i_3_;
	}
    }
    
    static final void method3123(Class259 class259, Class683 class683, int i) {
	int i_4_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	int i_5_ = ((class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953])
		    - 1);
	if (2 != class259.anInt2630 * 307215955)
	    throw new RuntimeException("");
	NPCDefinitions class299
	    = ((NPCDefinitions)
	       Class168_Sub1.aClass40_Sub7_9112
		   .method76(-961419549 * class259.anInt2631, 1536867680));
	if (class259.aClass288_2769 == null)
	    class259.aClass288_2769 = new Class288(class299, false);
	class259.aClass288_2769.aLong3195
	    = Class666.method11002((byte) -28) * -6636968143718260973L;
	if (i_5_ < 0 || i_5_ >= class299.anIntArray3293.length)
	    throw new RuntimeException("");
	class259.aClass288_2769.anIntArray3197[i_5_] = i_4_;
	Class649.method10708(class259, (byte) 0);
    }
    
    static final void method3124(Class683 class683, int i) {
	class683.anInt8662 -= 1552651121;
    }
    
    static final void method3125(Class683 class683, int i) {
	int i_6_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class525_Sub16_Sub6 class525_sub16_sub6
	    = Class647.method10695(581993809);
	if (class525_sub16_sub6 != null) {
	    boolean bool
		= class525_sub16_sub6.method18275(i_6_ >> 28 & 0x3,
						  i_6_ >> 14 & 0x3fff,
						  i_6_ & 0x3fff,
						  Class686.anIntArray8699,
						  -1209871714);
	    if (bool) {
		class683.anIntArray8661
		    [(class683.anInt8662 += 1552651121) * 501271953 - 1]
		    = Class686.anIntArray8699[1];
		class683.anIntArray8661
		    [(class683.anInt8662 += 1552651121) * 501271953 - 1]
		    = Class686.anIntArray8699[2];
	    } else {
		class683.anIntArray8661
		    [(class683.anInt8662 += 1552651121) * 501271953 - 1]
		    = -1;
		class683.anIntArray8661
		    [(class683.anInt8662 += 1552651121) * 501271953 - 1]
		    = -1;
	    }
	} else {
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= -1;
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= -1;
	}
    }
    
    static boolean method3126(int i, byte i_7_) {
	return 17 == i || i == 15;
    }
    
    static boolean method3127(int i) {
	return Class1.method515((Class525_Sub22_Sub1.aClass632_11646
				 .aClass598_8211),
				(byte) 16);
    }
    
    public static Class245 method3128(int i, int[] is, Class245 class245,
				      boolean bool, int i_8_) {
	if (!Class172.aClass458_1861.method7558(i, (byte) 102))
	    return null;
	int i_9_ = Class172.aClass458_1861.method7487(i, 2080116611);
	Class259[] class259s;
	if (i_9_ == 0)
	    class259s = new Class259[0];
	else if (class245 == null)
	    class259s = new Class259[i_9_];
	else
	    class259s = class245.aClass259Array2426;
	if (class245 == null)
	    class245 = new Class245(bool, class259s);
	else {
	    class245.aClass259Array2426 = class259s;
	    class245.aBool2428 = bool;
	}
	for (int i_10_ = 0; i_10_ < i_9_; i_10_++) {
	    if (null == class245.aClass259Array2426[i_10_]) {
		byte[] is_11_
		    = Class172.aClass458_1861.method7477(i, i_10_, is,
							 -617120115);
		if (is_11_ != null) {
		    Class259 class259
			= class245.aClass259Array2426[i_10_] = new Class259();
		    class259.anInt2588 = ((i << 16) + i_10_) * -497417721;
		    class259.method4678(new RSBuffer(is_11_),
					(byte) -51);
		}
	    }
	}
	return class245;
    }
}
