/* Class311 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class311
{
    static Class311 aClass311_3468;
    static Class311 aClass311_3469;
    static Class311 aClass311_3470 = new Class311(0);
    int anInt3471;
    static Class157 aClass157_3472;
    
    static Class311 method5627(int i) {
	if (-2018763605 * aClass311_3470.anInt3471 == i)
	    return aClass311_3470;
	if (-2018763605 * aClass311_3469.anInt3471 == i)
	    return aClass311_3469;
	if (i == -2018763605 * aClass311_3468.anInt3471)
	    return aClass311_3468;
	return null;
    }
    
    Class311(int i) {
	anInt3471 = -643891709 * i;
    }
    
    static {
	aClass311_3469 = new Class311(1);
	aClass311_3468 = new Class311(2);
    }
    
    static final void method5628(Class683 class683, int i) {
	class683.anInt8662 -= -826678987;
	int i_0_ = class683.anIntArray8661[class683.anInt8662 * 501271953];
	int i_1_ = class683.anIntArray8661[501271953 * class683.anInt8662 + 1];
	int i_2_ = class683.anIntArray8661[2 + 501271953 * class683.anInt8662];
	int i_3_ = class683.anIntArray8661[3 + 501271953 * class683.anInt8662];
	int i_4_ = class683.anIntArray8661[4 + class683.anInt8662 * 501271953];
	if (i_2_ == -1)
	    throw new RuntimeException();
	WorldTile class65
	    = ((WorldTile)
	       Class525_Sub22.aClass40_Sub15_10585.method76(i_2_, -446295003));
	if (class65.aClass495_699.method80() != i_1_)
	    throw new RuntimeException();
	if (class65.aClass495_698.method80() != i_0_)
	    throw new RuntimeException();
	int[] is = class65.method1413(Integer.valueOf(i_3_), 936501507);
	if (i_4_ < 0 || null == is || is.length <= i_4_)
	    throw new RuntimeException();
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = is[i_4_];
    }
    
    static final void method5629(Class683 class683, byte i) {
	class683.anInt8662 -= -1189665054;
	int i_5_ = class683.anIntArray8661[501271953 * class683.anInt8662];
	int i_6_ = class683.anIntArray8661[class683.anInt8662 * 501271953 + 1];
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = i_5_ & i_6_;
    }
    
    static final void method5630(Class683 class683, int i) {
	Class503.method8312((Class656_Sub1) class683.anInterface62_8655,
			    (class683.anIntArray8661
			     [(class683.anInt8662 -= 1552651121) * 501271953]),
			    true, -1666363985);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = (int) client.aFloatArray11375[0];
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = (int) client.aFloatArray11375[1];
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = (int) client.aFloatArray11375[2];
    }
    
    static final void method5631(Class683 class683, int i) {
	int i_7_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class713.method14460((char) i_7_, -1226662737) ? 1 : 0;
    }
    
    static final void method5632(Class259 class259, Class245 class245,
				 Class683 class683, int i) {
	class259.anInt2565
	    = (class683.anIntArray8661
	       [(class683.anInt8662 -= 1552651121) * 501271953]) * -129109965;
	Class649.method10708(class259, (byte) 0);
    }
}
