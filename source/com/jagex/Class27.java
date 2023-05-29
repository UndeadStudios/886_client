/* Class27 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class27
{
    public static Class27 aClass27_277;
    public static Class27 aClass27_278;
    public static Class27 aClass27_279;
    public static Class27 aClass27_280 = new Class27();
    static int anInt281;
    public static JS5 idx_16;
    
    static {
	aClass27_277 = new Class27();
	aClass27_279 = new Class27();
	aClass27_278 = new Class27();
    }
    
    static final void method901(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = client.aBool11333 ? 1 : 0;
    }
    
    static final void method902(Class259 class259, Class245 class245,
				Class683 class683, int i) {
	class683.anInt8662 -= 1915637188;
	class259.anInt2731
	    = (class683.anIntArray8661[501271953 * class683.anInt8662]
	       * 923255227);
	class259.anInt2599
	    = (class683.anIntArray8661[501271953 * class683.anInt8662 + 1]
	       * 106775187);
	class259.anInt2643 = 0;
	class259.anInt2644 = 0;
	int i_0_ = class683.anIntArray8661[2 + 501271953 * class683.anInt8662];
	if (i_0_ < 0)
	    i_0_ = 0;
	else if (i_0_ > 4)
	    i_0_ = 4;
	int i_1_ = class683.anIntArray8661[3 + 501271953 * class683.anInt8662];
	if (i_1_ < 0)
	    i_1_ = 0;
	else if (i_1_ > 4)
	    i_1_ = 4;
	class259.aByte2666 = (byte) i_0_;
	class259.aByte2719 = (byte) i_1_;
	Class649.method10708(class259, (byte) 0);
	Class372.method6364(class245, class259, -1788827441);
	if (0 == 2010235789 * class259.anInt2590)
	    Class76.method1560(class245, class259, false, -181562890);
    }
    
    Class27() {
	/* empty */
    }
    
    static final void method903(Class683 class683, short i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class239.method4422(class259, class245, class683, (byte) 93);
    }
    
    static final void method904(Class683 class683, byte i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub26_10682
		  .method17213((byte) 93) ? 1 : 0;
    }
    
    public static Class607[] method905(int i) {
	return (new Class607[]
		{ Class607.aClass607_7971, Class607.aClass607_7972,
		  Class607.aClass607_7973 });
    }
}
