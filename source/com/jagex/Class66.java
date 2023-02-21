/* Class66 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Canvas;
import java.lang.reflect.Method;

public class Class66
{
    public int anInt706;
    public String aString707;
    public String aString708;
    public int anInt709;
    public boolean aBool710;
    public int anInt711;
    public boolean aBool712;
    public String aString713;
    public String aString714;
    public int anInt715;
    static Class157[] aClass157Array716;
    
    Class66() {
	/* empty */
    }
    
    public static void method1435(Canvas canvas, int i) {
	try {
	    Class var_class = Class.forName("java.awt.Canvas");
	    Method method = var_class.getMethod("setIgnoreRepaint",
						new Class[] { Boolean.TYPE });
	    method.invoke(canvas, new Object[] { Boolean.TRUE });
	} catch (Exception exception) {
	    /* empty */
	}
    }
    
    static final void method1436(Class683 class683, int i) {
	int i_0_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class603_Sub1 class603_sub1
	    = Class525_Sub28.method16401(i_0_, 1587438657);
	if (class603_sub1 != null) {
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= class603_sub1.anInt7951 * 36102555;
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= class603_sub1.aString10881;
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= class603_sub1.method16997(-949493417);
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= class603_sub1.method16995((byte) 113);
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= class603_sub1.anInt7953 * 1234139243;
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= class603_sub1.anInt10882 * 1803394105;
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= class603_sub1.aString10880;
	} else {
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= -1;
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= "";
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= 0;
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= "";
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= 0;
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= 0;
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= "";
	}
    }
    
    static final void method1437(Class683 class683, byte i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class594.method9830(class259, class245, class683, -2143980257);
    }
    
    public static void method1438(int i) {
	if (1 == 1777895575 * client.anInt11075
	    && (!Class198_Sub4.method15613(-492271742)
		&& !Class688.method14016(98701216)))
	    Class441.method7119(8, 1240985285);
    }
    
    public static void method1439(int[] is, float[] fs, float[] fs_1_,
				  byte i) {
	Class598.method9854(is, fs, fs_1_, 0, is.length - 1, (byte) -40);
    }
}
