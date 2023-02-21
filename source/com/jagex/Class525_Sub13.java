/* Class525_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class525_Sub13 extends Class525
{
    public int anInt10528;
    int anInt10529;
    
    Class525_Sub13(int i, int i_0_) {
	anInt10528 = i * -97272483;
	anInt10529 = 1399909441 * i_0_;
    }
    
    static final void method16250(Class683 class683, int i) {
	boolean bool = false;
	if (client.aBool11315) {
	    try {
		Object object
		    = (Class407.aClass407_4174.method6627
		       ((new Object[]
			 { Integer.valueOf(1815116363 * Class642.anInt8328),
			   Boolean.valueOf((Class581
					    .aClass656_Sub1_Sub3_Sub1_Sub1_7705
					    .aByte12235) == 1),
			   Integer.valueOf(class683.anIntArray8661
					   [((class683.anInt8662 -= 1552651121)
					     * 501271953)]) }),
			1480711698));
		if (null != object)
		    bool = ((Boolean) object).booleanValue();
	    } catch (Throwable throwable) {
		/* empty */
	    }
	}
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = bool ? 1 : 0;
    }
}
