/* Class265 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class265
{
    int[] anIntArray2805;
    static int anInt2806;
    
    public Class265(int[] is) {
	int i;
	for (i = 1; i <= is.length + (is.length >> 1); i <<= 1) {
	    /* empty */
	}
	anIntArray2805 = new int[i + i];
	for (int i_0_ = 0; i_0_ < i + i; i_0_++)
	    anIntArray2805[i_0_] = -1;
	for (int i_1_ = 0; i_1_ < is.length; i_1_++) {
	    int i_2_;
	    for (i_2_ = is[i_1_] & i - 1;
		 -1 != anIntArray2805[1 + (i_2_ + i_2_)];
		 i_2_ = i_2_ + 1 & i - 1) {
		/* empty */
	    }
	    anIntArray2805[i_2_ + i_2_] = is[i_1_];
	    anIntArray2805[i_2_ + i_2_ + 1] = i_1_;
	}
    }
    
    public int method4796(int i, int i_3_) {
	int i_4_ = (anIntArray2805.length >> 1) - 1;
	int i_5_ = i & i_4_;
	for (;;) {
	    int i_6_ = anIntArray2805[1 + (i_5_ + i_5_)];
	    if (i_6_ == -1)
		return -1;
	    if (anIntArray2805[i_5_ + i_5_] == i)
		return i_6_;
	    i_5_ = i_5_ + 1 & i_4_;
	}
    }
    
    public int method4797(int i) {
	int i_7_ = (anIntArray2805.length >> 1) - 1;
	int i_8_ = i & i_7_;
	for (;;) {
	    int i_9_ = anIntArray2805[1 + (i_8_ + i_8_)];
	    if (i_9_ == -1)
		return -1;
	    if (anIntArray2805[i_8_ + i_8_] == i)
		return i_9_;
	    i_8_ = i_8_ + 1 & i_7_;
	}
    }
    
    static final void method4798(Class683 class683, byte i) {
	int i_10_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_10_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_10_ >> 16];
	Class183.method3600(class259, class245, false, 2, class683,
			    -1378489645);
    }
    
    static final void method4799(Class683 class683, int i) {
	int i_11_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	if (2 == client.anInt11362 * 1819257147
	    && i_11_ < client.anInt11204 * -883281325)
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= client.aClass66Array11356[i_11_].aString713;
	else
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= "";
    }
    
    static final void method4800(Class683 class683, int i) {
	CharSequence charsequence
	    = ((CharSequence)
	       (class683.anObjectArray8636
		[(class683.anInt8644 -= 1285561025) * 1373599041]));
	class683.anObjectArray8636
	    [(class683.anInt8644 += 1285561025) * 1373599041 - 1]
	    = Class3.method529(charsequence, 1552651121);
    }
    
    public static boolean method4801(int i, int i_12_) {
	return 7 == i || i == 4 || 12 == i;
    }
    
    static boolean method4802(int i) {
	if (1 != client.anInt11075 * 1777895575)
	    return false;
	if (Class198_Sub4.method15613(-492271742)
	    || Class688.method14016(132771206))
	    return false;
	return true;
    }
}
