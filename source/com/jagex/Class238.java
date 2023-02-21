/* Class238 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.EOFException;

public class Class238 implements Interface76
{
    public static Class238 aClass238_2395;
    public static Class238 aClass238_2396;
    int anInt2397;
    public static Class238 aClass238_2398;
    public static Class238 aClass238_2399 = new Class238(3, 0);
    public static Class238 aClass238_2400;
    public int anInt2401;
    public static Class238 aClass238_2402;
    public static Class157 aClass157_2403;
    static int anInt2404;
    
    public int method57() {
	return anInt2397 * -825414143;
    }
    
    public int method80() {
	return anInt2397 * -825414143;
    }
    
    static {
	aClass238_2396 = new Class238(4, 1);
	aClass238_2400 = new Class238(5, 2);
	aClass238_2398 = new Class238(2, 3);
	aClass238_2395 = new Class238(1, 4);
	aClass238_2402 = new Class238(0, 5);
    }
    
    public int method75() {
	return anInt2397 * -825414143;
    }
    
    Class238(int i, int i_0_) {
	anInt2401 = i * -955996529;
	anInt2397 = i_0_ * -1384721919;
    }
    
    public static Class52 method4416(byte i) {
	Class42 class42 = null;
	try {
	    Class52 class52;
	    try {
		class42
		    = Class182.method3594("3",
					  client.aClass668_11090.aString8579,
					  false, 1316374824);
		byte[] is = new byte[(int) class42.method1048(-2092208110)];
		int i_1_;
		for (int i_2_ = 0; i_2_ < is.length; i_2_ += i_1_) {
		    i_1_ = class42.method1049(is, i_2_, is.length - i_2_,
					      (byte) 90);
		    if (-1 == i_1_)
			throw new EOFException();
		}
		class52 = new Class52(new RSBuffer(is));
	    } catch (Exception exception) {
		Class52 class52_3_ = new Class52();
		try {
		    if (class42 != null)
			class42.method1047(641867375);
		} catch (Exception exception_4_) {
		    /* empty */
		}
		return class52_3_;
	    }
	    try {
		if (class42 != null)
		    class42.method1047(-1296009421);
	    } catch (Exception exception) {
		/* empty */
	    }
	    return class52;
	} catch (Object object) {
	    try {
		if (class42 != null)
		    class42.method1047(-1684573964);
	    } catch (Exception exception) {
		/* empty */
	    }
	    throw object;
	}
    }
    
    static final void method4417(Class259 class259, Class245 class245,
				 Class683 class683, byte i) {
	class259.anInt2624
	    = (class683.anIntArray8661
	       [(class683.anInt8662 -= 1552651121) * 501271953]) * -899075623;
	Class649.method10708(class259, (byte) 0);
    }
}
