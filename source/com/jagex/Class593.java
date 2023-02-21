/* Class593 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import com.jagex.twitchtv.TwitchWebcamDevice;

public class Class593
{
    public static Class593 aClass593_7829;
    public static Class593 aClass593_7830 = new Class593(0);
    public static Class593 aClass593_7831 = new Class593(1);
    static boolean[] aBoolArray7832;
    
    static {
	aClass593_7829 = new Class593(4);
    }
    
    Class593(int i) {
	/* empty */
    }
    
    static void method9824(Class683 class683, byte i) {
	String string
	    = (String) (class683.anObjectArray8636
			[(class683.anInt8644 -= 1285561025) * 1373599041]);
	TwitchWebcamDevice twitchwebcamdevice
	    = Class467.method7696(string, (byte) 20);
	if (twitchwebcamdevice == null) {
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= -1;
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= "";
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= "";
	} else {
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= -1577362963 * twitchwebcamdevice.anInt1150;
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= twitchwebcamdevice.aString1148;
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= twitchwebcamdevice.aString1149;
	}
    }
    
    static final void method9825(Class683 class683, int i) {
	int i_0_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_0_, -695254952);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = client.method17533(class259) ? 1 : 0;
    }
    
    static final void method9826(Class683 class683, int i) {
	class683.anInt8662 -= -100706853;
	Class395[] class395s = Class96.method1813(-1089825578);
	Class396[] class396s = Class643.method10595((byte) 66);
	Class243.method4457
	    ((class395s
	      [class683.anIntArray8661[501271953 * class683.anInt8662]]),
	     (class396s
	      [class683.anIntArray8661[1 + 501271953 * class683.anInt8662]]),
	     class683.anIntArray8661[501271953 * class683.anInt8662 + 2],
	     class683.anIntArray8661[501271953 * class683.anInt8662 + 3],
	     class683.anIntArray8661[class683.anInt8662 * 501271953 + 4],
	     class683.anIntArray8661[5 + class683.anInt8662 * 501271953],
	     class683.anIntArray8661[class683.anInt8662 * 501271953 + 6],
	     class683.anIntArray8661[7 + 501271953 * class683.anInt8662],
	     class683.anIntArray8661[501271953 * class683.anInt8662 + 8],
	     class683.anIntArray8661[class683.anInt8662 * 501271953 + 9],
	     class683.anIntArray8661[10 + 501271953 * class683.anInt8662],
	     798048431);
    }
    
    static int method9827(Class259 class259, int i, int i_1_) {
	if (!client.method17531(class259).method16133(i, (short) 197)
	    && null == class259.anObjectArray2721)
	    return -1;
	return ((class259.anIntArray2688 != null
		 && class259.anIntArray2688.length > i)
		? class259.anIntArray2688[i] : -1);
    }
    
    static final void method9828(Class683 class683, int i) {
	if (null != Class303.aClass525_Sub25_3406) {
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= 1;
	    class683.aClass525_Sub25_8653 = Class303.aClass525_Sub25_3406;
	} else
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= 0;
    }
    
    static final void method9829(Class683 class683, int i) {
	class683.anInt8662 -= -1189665054;
	int i_2_ = class683.anIntArray8661[501271953 * class683.anInt8662];
	int i_3_ = class683.anIntArray8661[1 + class683.anInt8662 * 501271953];
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class525_Sub27.method16377(i_2_, i_3_, false, false, -520139882);
    }
}
