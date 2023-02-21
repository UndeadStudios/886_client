/* Class403 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.applet.Applet;

public class Class403
{
    public static final int anInt4137 = 1;
    public static final int anInt4138 = 886;
    public static Applet anApplet4139;
    
    Class403() throws Throwable {
	throw new Error();
    }
    
    static final void method6571(Class683 class683, byte i) {
	int i_0_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class525_Sub16_Sub6 class525_sub16_sub6
	    = Class647.method10695(-1375105393);
	if (null != class525_sub16_sub6) {
	    boolean bool
		= class525_sub16_sub6.method18275(i_0_ >> 28 & 0x3,
						  i_0_ >> 14 & 0x3fff,
						  i_0_ & 0x3fff,
						  Class686.anIntArray8699,
						  -644295826);
	    if (bool)
		Class639.method10559(Class686.anIntArray8699[1],
				     Class686.anIntArray8699[2], -1876096298);
	}
    }
    
    static final void method6572(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub37_10680
		  .method17305((byte) 72) == 1 ? 1 : 0;
    }
    
    static final void method6573(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub42_10717
		  .method17347(1245711077) ? 1 : 0;
    }
}
