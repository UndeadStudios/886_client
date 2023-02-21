/* Class525_Sub40 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class525_Sub40 extends Class525
{
    public static final float aFloat10844 = 4096.0F;
    protected static final int anInt10845 = 4096;
    protected static final int anInt10846 = 4095;
    protected static final int anInt10847 = 2048;
    protected static final int anInt10848 = 12;
    protected static final int anInt10849 = 8192;
    
    Class525_Sub40(int i, boolean bool) {
	/* empty */
    }
    
    static final void method16855(Class683 class683, byte i) {
	Class259 class259
	    = Class43.method1069(class683.anIntArray8661[((class683.anInt8662
							   -= 1552651121)
							  * 501271953)],
				 -695254952);
	if (class259.aClass259Array2655 == null)
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= 0;
	else {
	    int i_0_ = class259.aClass259Array2655.length;
	    for (int i_1_ = 0; i_1_ < class259.aClass259Array2655.length;
		 i_1_++) {
		if (null == class259.aClass259Array2655[i_1_]) {
		    i_0_ = i_1_;
		    break;
		}
	    }
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= i_0_;
	}
    }
}
