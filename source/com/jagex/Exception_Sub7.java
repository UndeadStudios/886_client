/* Exception_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Exception_Sub7 extends Exception
{
    Exception_Sub7() {
	/* empty */
    }
    
    static final void method18030(Class683 class683, byte i) {
	String string
	    = (String) (class683.anObjectArray8636
			[(class683.anInt8644 -= 1285561025) * 1373599041]);
	class683.anInt8662 -= -1189665054;
	int i_0_ = class683.anIntArray8661[class683.anInt8662 * 501271953];
	int i_1_ = class683.anIntArray8661[501271953 * class683.anInt8662 + 1];
	class683.anObjectArray8636
	    [(class683.anInt8644 += 1285561025) * 1373599041 - 1]
	    = string.substring(i_0_, i_1_);
    }
}
