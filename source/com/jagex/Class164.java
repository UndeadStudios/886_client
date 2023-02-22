/* Class164 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class164
{
    Class164() throws Throwable {
	throw new Error();
    }
    
    public static String method2660(String string) {
	int i = string.length();
	int i_0_ = 0;
	for (int i_1_ = 0; i_1_ < i; i_1_++) {
	    char c = string.charAt(i_1_);
	    if (c == '<' || '>' == c)
		i_0_ += 3;
	}
	StringBuilder stringbuilder = new StringBuilder(i_0_ + i);
	for (int i_2_ = 0; i_2_ < i; i_2_++) {
	    char c = string.charAt(i_2_);
	    if (c == '<')
		stringbuilder.append("<lt>");
	    else if (c == '>')
		stringbuilder.append("<gt>");
	    else
		stringbuilder.append(c);
	}
	return stringbuilder.toString();
    }
    
    static final void method2661(Class683 class683, byte i) {
	Class453.method7359((byte) -21);
    }
    
    static final void method2662(Class683 class683, byte i) {
	String string = null;
	if (null != Class50.aClass41_375)
	    string = Class50.aClass41_375.method1039(786409409);
	if (string == null)
	    string = "";
	class683.anObjectArray8636
	    [(class683.anInt8644 += 1285561025) * 1373599041 - 1]
	    = string;
    }
    
    static final void method2663(Class259 class259, Class245 class245,
				 Class683 class683, int i) {
	String string
	    = (String) (class683.anObjectArray8636
			[(class683.anInt8644 -= 1285561025) * 1373599041]);
	if (Class558.method9375(string, class683, (byte) 3) != null)
	    string = string.substring(0, string.length() - 1);
	class259.anObjectArray2726
	    = Class656_Sub1_Sub5_Sub1.method18727(string, class683,
						  -1831999453);
	class259.aBool2695 = true;
    }
    
    public static void method2664(JS5 class458, Class180 class180,
                                  Interface24 interface24, byte i) {
	Class326.aClass458_3563 = class458;
	Class515.aClass180_5702 = class180;
	Class406.anInterface24_4168 = interface24;
    }
}
