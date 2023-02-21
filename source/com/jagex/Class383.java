/* Class383 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class383 implements Interface45
{
    public int anInt4009;
    public static int anInt4010;
    
    Class383(int i) {
	anInt4009 = i * 1708093229;
    }
    
    public Class392 method334(int i) {
	return Class392.aClass392_4074;
    }
    
    public Class392 method335() {
	return Class392.aClass392_4074;
    }
    
    public Class392 method336() {
	return Class392.aClass392_4074;
    }
    
    public static int method6430(int i, int i_0_, int i_1_, int i_2_, int i_3_,
				 int i_4_, byte i_5_) {
	if (1 == (i_4_ & 0x1)) {
	    int i_6_ = i_2_;
	    i_2_ = i_3_;
	    i_3_ = i_6_;
	}
	i_1_ &= 0x3;
	if (i_1_ == 0)
	    return i_0_;
	if (i_1_ == 1)
	    return 7 - i - (i_2_ - 1);
	if (i_1_ == 2)
	    return 7 - i_0_ - (i_3_ - 1);
	return i;
    }
    
    static final void method6431(Class683 class683, int i) {
	String string
	    = (String) (class683.anObjectArray8636
			[(class683.anInt8644 -= 1285561025) * 1373599041]);
	int i_7_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class198_Sub4.method15614(string, i_7_, 1951109647);
    }
}
