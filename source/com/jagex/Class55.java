/* Class55 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class55
{
    public static String aString560;
    static String aString561;
    static String aString562;
    static String aString563 = "true";
    static String aString564;
    public static String aString565;
    static String aString566;
    static int anInt567;
    
    public static String method1186(int i) {
	return new StringBuilder().append("<col=").append
		   (Integer.toHexString(i)).append
		   (">").toString();
    }
    
    static {
	aString560 = ",";
	aString562 = " (";
	aString561 = ")";
	aString564 = "->";
	aString565 = "<br>";
	aString566 = "</col>";
    }
    
    public static String method1187(int i) {
	return new StringBuilder().append("<img=").append(i).append(">")
		   .toString();
    }
    
    Class55() throws Throwable {
	throw new Error();
    }
    
    static final void method1188(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class651.method10740(class259, class245, class683, -507161998);
    }
    
    static final void method1189(Class683 class683, byte i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = 1523980585 * class259.anInt2637;
    }
    
    static final void method1190(Class683 class683, int i) {
	Class268.method4960((byte) 0);
    }
    
    static final void method1191(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class302.method5408(class259, class683, -907731485);
    }
    
    static final void method1192(Class683 class683, byte i) {
	int i_0_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_0_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_0_ >> 16];
	Class183.method3600(class259, class245, false, 1, class683,
			    1992359753);
    }
}
