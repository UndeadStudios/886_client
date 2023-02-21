/* Class509 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class509
{
    static Interface60 anInterface60_5660;
    static int anInt5661;
    public static Class569 aClass569_5662;
    
    public static boolean method8497() {
	return anInterface60_5660 != null;
    }
    
    Class509() throws Throwable {
	throw new Error();
    }
    
    public static boolean method8498() {
	return anInterface60_5660 != null;
    }
    
    public static void method8499(Interface60 interface60) {
	if (null != anInterface60_5660)
	    throw new IllegalStateException("");
	anInterface60_5660 = interface60;
    }
    
    static final void method8500(Class683 class683, int i) {
	class683.anObjectArray8636
	    [(class683.anInt8644 += 1285561025) * 1373599041 - 1]
	    = ((Class656_Sub1_Sub3_Sub1_Sub1)
	       class683.aClass656_Sub1_Sub3_Sub1_8654)
		  .method18907(true, 1109442456);
    }
    
    public static byte[] method8501(byte[] is, int i) {
	if (is == null)
	    return null;
	byte[] is_0_ = new byte[is.length];
	System.arraycopy(is, 0, is_0_, 0, is.length);
	return is_0_;
    }
    
    static final void method8502(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class33.method957(class259, class245, class683, (byte) -73);
    }
}
