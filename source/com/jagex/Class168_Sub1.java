/* Class168_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class168_Sub1 extends Class168
{
    public static Class40_Sub7 aClass40_Sub7_9112;
    static String[] aStringArray9113;
    
    abstract void method14605(int i, int i_0_);
    
    public abstract int method14606();
    
    public abstract int method14607(int i, int i_1_);
    
    public abstract int method14608();
    
    abstract void method14609(int i, int i_2_);
    
    Class168_Sub1() {
	/* empty */
    }
    
    public abstract int method14610();
    
    public abstract int method14611(int i, int i_3_);
    
    public abstract int method14612(int i, int i_4_);
    
    static final void method14613(Class683 class683, byte i) {
	int i_5_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_5_, -695254952);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = -106078709 * class259.anInt2636;
    }
    
    static void method14614(int i, boolean bool, int i_6_) {
	Class525_Sub10 class525_sub10
	    = Class190.method3692(i, bool, (byte) 100);
	if (class525_sub10 != null) {
	    for (int i_7_ = 0; i_7_ < class525_sub10.anIntArray10507.length;
		 i_7_++) {
		class525_sub10.anIntArray10507[i_7_] = -1;
		class525_sub10.anIntArray10506[i_7_] = 0;
	    }
	    class525_sub10.aClass9Array10508 = null;
	}
    }
}
