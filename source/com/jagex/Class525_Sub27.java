/* Class525_Sub27 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Class525_Sub27 extends Class525
{
    Method[] aMethodArray10606;
    int anInt10607;
    int[] anIntArray10608;
    int[] anIntArray10609;
    Field[] aFieldArray10610;
    int[] anIntArray10611;
    int anInt10612;
    byte[][][] aByteArrayArrayArray10613;
    
    Class525_Sub27() {
	/* empty */
    }
    
    public static int method16377(int i, int i_0_, boolean bool,
				  boolean bool_1_, int i_2_) {
	Class525_Sub10 class525_sub10
	    = Class190.method3692(i, bool_1_, (byte) 100);
	if (null == class525_sub10)
	    return 0;
	int i_3_ = 0;
	for (int i_4_ = 0; i_4_ < class525_sub10.anIntArray10507.length;
	     i_4_++) {
	    if (class525_sub10.anIntArray10507[i_4_] >= 0
		&& (class525_sub10.anIntArray10507[i_4_]
		    < (-1988422751
		       * Class313_Sub2.aClass40_Sub22_10106.anInt332))) {
		Class8 class8
		    = ((Class8)
		       (Class313_Sub2.aClass40_Sub22_10106.method76
			(class525_sub10.anIntArray10507[i_4_], -314951313)));
		int i_5_ = class8.method629(i_0_,
					    (((Class88)
					      client.aClass40_Sub16_11201
						  .method76(i_0_, 598913281))
					     .anInt893) * 2053564367,
					    (byte) 103);
		if (bool)
		    i_3_ += i_5_ * class525_sub10.anIntArray10506[i_4_];
		else
		    i_3_ += i_5_;
	    }
	}
	return i_3_;
    }
}
