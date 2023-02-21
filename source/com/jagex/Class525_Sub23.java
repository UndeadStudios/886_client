/* Class525_Sub23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class525_Sub23 extends Class525
{
    public Class709 aClass709_10586 = new Class709();
    
    Class525_Sub23() {
	/* empty */
    }
    
    static final void method16342(Class259 class259, Class245 class245,
				  Class683 class683, int i) {
	String string
	    = (String) (class683.anObjectArray8636
			[(class683.anInt8644 -= 1285561025) * 1373599041]);
	int[] is = Class558.method9375(string, class683, (byte) 3);
	if (null != is)
	    string = string.substring(0, string.length() - 1);
	class259.anObjectArray2716
	    = Class656_Sub1_Sub5_Sub1.method18727(string, class683,
						  -1079489803);
	class259.anIntArray2595 = is;
	class259.aBool2695 = true;
    }
    
    static void method16343(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
	Class525_Sub16_Sub10 class525_sub16_sub10
	    = Class465.method7671(17, (long) i_0_ << 32 | (long) i);
	class525_sub16_sub10.method18361((byte) 125);
	class525_sub16_sub10.anInt11817 = -1179952119 * i_1_;
	class525_sub16_sub10.anInt11796 = i_2_ * 16878283;
    }
}
