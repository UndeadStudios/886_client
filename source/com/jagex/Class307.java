/* Class307 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class307
{
    int anInt3414;
    public static Class307 aClass307_3415;
    public static Class307 aClass307_3416 = new Class307(0);
    public static Class458 aClass458_3417;
    static Class525_Sub16_Sub16 aClass525_Sub16_Sub16_3418;
    
    static {
	aClass307_3415 = new Class307(1);
    }
    
    public static Class307 method5428(int i) {
	if (i == 1876777343 * aClass307_3416.anInt3414)
	    return aClass307_3416;
	if (aClass307_3415.anInt3414 * 1876777343 == i)
	    return aClass307_3415;
	return null;
    }
    
    Class307(int i) {
	anInt3414 = -1535613313 * i;
    }
    
    static final void method5429(Class683 class683, int i) {
	int i_0_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_0_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_0_ >> 16];
	Class697.method14206(class259, class245, class683, 2122214937);
    }
    
    static final void method5430(Class683 class683, int i) {
	int i_1_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_1_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_1_ >> 16];
	Class655.method10812(class259, class245, class683, -1830978638);
    }
    
    static final void method5431(Class683 class683, int i) {
	if (Class695.aBool8757) {
	    Class18[] class18s = Class63.method1389((byte) -128);
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= class18s.length;
	} else
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= 0;
    }
    
    static final void method5432(Class683 class683, int i) {
	Class263.method4788(-1794204277 * Class556_Sub1.anInt10624,
			    -272521619);
    }
    
    static final void method5433(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = 372293357 * class259.anInt2740;
    }
    
    static void method5434(int i, String string, int i_2_) {
	Class525_Sub16_Sub10 class525_sub16_sub10
	    = Class465.method7671(3, (long) i);
	class525_sub16_sub10.method18361((byte) 96);
	class525_sub16_sub10.aString11798 = string;
    }
}
