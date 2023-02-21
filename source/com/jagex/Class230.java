/* Class230 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class230
{
    String aString2365;
    
    Class230(RSBuffer class525_sub38, boolean bool, boolean bool_0_) {
	if (bool)
	    class525_sub38.method16603(-1556491422);
	if (bool_0_)
	    aString2365 = class525_sub38.method16635(-2135041045);
	else
	    aString2365 = null;
    }
    
    public String method4382() {
	return aString2365;
    }
    
    public String method4383(byte i) {
	return aString2365;
    }
    
    public String method4384() {
	return aString2365;
    }
    
    static Class275[] method4385(byte i) {
	return (new Class275[]
		{ Class275.aClass275_2864, Class275.aClass275_2865,
		  Class275.aClass275_2863 });
    }
    
    static final void method4386(Class683 class683, byte i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class442.method7124(class259, class245, class683, (byte) 1);
    }
    
    static final void method4387(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class655.method10810((byte) 17).method80();
    }
}
