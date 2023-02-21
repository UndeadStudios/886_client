/* Class195 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class195
{
    static Class195 aClass195_2176;
    public static Class195 aClass195_2177;
    static Class195 aClass195_2178;
    static Class195 aClass195_2179;
    public static Class195 aClass195_2180 = new Class195();
    
    Class195() {
	/* empty */
    }
    
    static {
	aClass195_2176 = new Class195();
	aClass195_2178 = new Class195();
	aClass195_2179 = new Class195();
	aClass195_2177 = new Class195();
    }
    
    static final void method3733(Class683 class683, int i) {
	class683.anInt8662 -= 362986067;
	int i_0_ = class683.anIntArray8661[class683.anInt8662 * 501271953];
	int i_1_ = class683.anIntArray8661[501271953 * class683.anInt8662 + 1];
	int i_2_ = class683.anIntArray8661[2 + class683.anInt8662 * 501271953];
	String string
	    = (String) (class683.anObjectArray8636
			[(class683.anInt8644 -= 1285561025) * 1373599041]);
	if (-1 == i_1_)
	    throw new RuntimeException();
	Class65 class65
	    = ((Class65)
	       Class525_Sub22.aClass40_Sub15_10585.method76(i_1_, 1561982184));
	if (class65.aClass495_699.method80() != i_0_)
	    throw new RuntimeException();
	if (class65.aClass495_698.method80()
	    != Class495.aClass495_5387.method80())
	    throw new RuntimeException();
	int[] is = class65.method1413(string, 505328941);
	if (i_2_ < 0 || is == null || is.length <= i_2_)
	    throw new RuntimeException();
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = is[i_2_];
    }
    
    static final void method3734(Class683 class683, int i) {
	class683.anInt8662 -= 1915637188;
	int i_3_ = class683.anIntArray8661[class683.anInt8662 * 501271953];
	int i_4_ = class683.anIntArray8661[1 + class683.anInt8662 * 501271953];
	int i_5_ = class683.anIntArray8661[501271953 * class683.anInt8662 + 2];
	int i_6_ = class683.anIntArray8661[class683.anInt8662 * 501271953 + 3];
	Class600 class600 = client.aClass507_11137.method8350(458596651);
	Class73.method1540(((i_3_ >> 14 & 0x3fff)
			    - class600.anInt7858 * -1227002079),
			   (i_3_ & 0x3fff) - 1429253007 * class600.anInt7860,
			   i_4_ << 2, i_5_, i_6_, 2090390003);
	client.aBool11364 = true;
    }
    
    static void method3735(Class182 class182, int i, int i_7_,
			   Class259 class259, int i_8_) {
	int i_9_ = 127;
	int i_10_ = 7;
	for (int i_11_ = 63; i_11_ >= 0; i_11_--) {
	    int i_12_
		= (i_11_ & 0x3f) << 10 | (i_10_ & 0x7) << 7 | i_9_ & 0x7f;
	    Class455_Sub1.method15988(false, true, 679780902);
	    int i_13_ = Class381.anIntArray3929[i_12_];
	    Class511.method8524(false, true, (byte) 1);
	    class182.method3151(i,
				((63 - i_11_) * (2054207119
						 * class259.anInt2598)
				 >> 6) + i_7_,
				class259.anInt2602 * -1694810043,
				(2054207119 * class259.anInt2598 >> 6) + 1,
				~0xffffff | i_13_, 0);
	}
    }
}
