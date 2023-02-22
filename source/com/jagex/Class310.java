/* Class310 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class310
{
    public int[] anIntArray3466;
    public short[] aShortArray3467;
    
    public Class310(NPCDefinitions class299) {
	anIntArray3466 = new int[8];
	aShortArray3467 = new short[8];
	int i = 0;
	if (null != class299.anIntArray3319
	    && class299.aShortArray3356 != null) {
	    i = class299.anIntArray3319.length;
	    System.arraycopy(class299.anIntArray3319, 0, anIntArray3466, 0, i);
	    System.arraycopy(class299.aShortArray3356, 0, aShortArray3467, 0,
			     i);
	}
	for (int i_0_ = i; i_0_ < 8; i_0_++) {
	    anIntArray3466[i_0_] = -1;
	    aShortArray3467[i_0_] = (short) -1;
	}
    }
    
    public Class310(int[] is, short[] is_1_) {
	anIntArray3466 = is;
	aShortArray3467 = is_1_;
    }
    
    static final void method5625(Class683 class683, int i) {
	Class503.method8312(class683.aClass656_Sub1_Sub2_Sub1_8646,
			    (class683.anIntArray8661
			     [(class683.anInt8662 -= 1552651121) * 501271953]),
			    true, -2070029814);
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
    
    static final void method5626(Class683 class683, byte i)
	throws Exception_Sub7 {
	class683.anInt8662 -= -1189665054;
	boolean bool
	    = class683.anIntArray8661[class683.anInt8662 * 501271953] == 1;
	boolean bool_2_
	    = 1 == class683.anIntArray8661[class683.anInt8662 * 501271953 + 1];
	Class453_Sub3.aClass309_Sub1_10316.method5458(bool, bool_2_,
						      786175924);
    }
}
