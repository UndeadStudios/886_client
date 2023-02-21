/* Class695 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Frame;

public final class Class695
{
    static int anInt8756;
    public static boolean aBool8757 = true;
    public static int anInt8758;
    
    public static Class18[] method14157(Class4 class4) {
	int[] is = class4.method532((byte) 16);
	Class18[] class18s = new Class18[is.length >> 2];
	for (int i = 0; i < class18s.length; i++) {
	    Class18 class18 = new Class18();
	    class18s[i] = class18;
	    class18.anInt200 = is[i << 2] * -1842247821;
	    class18.anInt201 = is[1 + (i << 2)] * 61613439;
	    class18.anInt202 = -1753671315 * is[(i << 2) + 2];
	    class18.anInt203 = is[(i << 2) + 3] * -903355675;
	}
	return class18s;
    }
    
    public static void method14158(Class4 class4, Frame frame) {
	class4.method534(-1741488676);
	frame.setVisible(false);
	frame.dispose();
    }
    
    public static void method14159(Class4 class4, Frame frame) {
	class4.method534(-1771166365);
	frame.setVisible(false);
	frame.dispose();
    }
    
    public static Class18[] method14160(Class4 class4) {
	int[] is = class4.method532((byte) 86);
	Class18[] class18s = new Class18[is.length >> 2];
	for (int i = 0; i < class18s.length; i++) {
	    Class18 class18 = new Class18();
	    class18s[i] = class18;
	    class18.anInt200 = is[i << 2] * -1842247821;
	    class18.anInt201 = is[1 + (i << 2)] * 61613439;
	    class18.anInt202 = -1753671315 * is[(i << 2) + 2];
	    class18.anInt203 = is[(i << 2) + 3] * -903355675;
	}
	return class18s;
    }
    
    public static Frame method14161(Class4 class4, int i, int i_0_, int i_1_,
				    int i_2_) {
	if (i_1_ == 0) {
	    Class18[] class18s = Class389.method6467(class4, 344012813);
	    if (class18s == null)
		return null;
	    boolean bool = false;
	    for (int i_3_ = 0; i_3_ < class18s.length; i_3_++) {
		if (class18s[i_3_].anInt200 * 1036776891 == i
		    && class18s[i_3_].anInt201 * -2072667521 == i_0_
		    && (i_2_ == 0
			|| i_2_ == -805434643 * class18s[i_3_].anInt203)
		    && (!bool
			|| class18s[i_3_].anInt202 * 1891227749 > i_1_)) {
		    i_1_ = class18s[i_3_].anInt202 * 1891227749;
		    bool = true;
		}
	    }
	    if (!bool)
		return null;
	}
	Frame frame = new Frame("Jagex Full Screen");
	frame.setResizable(false);
	class4.method533(frame, i, i_0_, i_1_, i_2_, (byte) 0);
	return frame;
    }
    
    public static void method14162(Class4 class4, Frame frame) {
	class4.method534(-1962335745);
	frame.setVisible(false);
	frame.dispose();
    }
    
    public static Class18[] method14163(Class4 class4) {
	int[] is = class4.method532((byte) 71);
	Class18[] class18s = new Class18[is.length >> 2];
	for (int i = 0; i < class18s.length; i++) {
	    Class18 class18 = new Class18();
	    class18s[i] = class18;
	    class18.anInt200 = is[i << 2] * -1842247821;
	    class18.anInt201 = is[1 + (i << 2)] * 61613439;
	    class18.anInt202 = -1753671315 * is[(i << 2) + 2];
	    class18.anInt203 = is[(i << 2) + 3] * -903355675;
	}
	return class18s;
    }
    
    Class695() throws Throwable {
	throw new Error();
    }
    
    public static void method14164(Class4 class4, Frame frame) {
	class4.method534(-1788555765);
	frame.setVisible(false);
	frame.dispose();
    }
    
    public static final void method14165(byte i) {
	Class96 class96 = Class111.method1979(-2091393405);
	Class525_Sub15 class525_sub15
	    = Class16.method767(Class412.aClass412_4327, class96.aClass6_1169,
				1977859884);
	class525_sub15.aClass525_Sub38_Sub2_10546.method16735(0, -1477933096);
	class96.method1794(class525_sub15, (short) 7332);
    }
    
    public static Class688 method14166(int i) {
	if (Class25.aClass688_242 == null)
	    return Class688.aClass688_8717;
	return Class25.aClass688_242;
    }
}
