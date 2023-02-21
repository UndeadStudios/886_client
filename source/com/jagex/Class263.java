/* Class263 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class263 implements Interface5
{
    static int anInt2798;
    public static Class402 aClass402_2799;
    static Class7 aClass7_2800;
    public static Class458 aClass458_2801;
    
    public Interface12 method43(int i, Interface13 interface13) {
	return new Class269(i, interface13);
    }
    
    public Interface12 method44(int i, Interface13 interface13) {
	return new Class269(i, interface13);
    }
    
    public Class method40(int i) {
	return com.jagex.Class269.class;
    }
    
    public Interface12 method39(int i, Interface13 interface13) {
	return new Class269(i, interface13);
    }
    
    public Interface12 method41(int i, Interface13 interface13) {
	return new Class269(i, interface13);
    }
    
    public Interface12 method42(int i, Interface13 interface13, int i_0_) {
	return new Class269(i, interface13);
    }
    
    public Interface12 method38(int i, Interface13 interface13) {
	return new Class269(i, interface13);
    }
    
    public Class method45() {
	return com.jagex.Class269.class;
    }
    
    Class263() {
	/* empty */
    }
    
    public Class method46() {
	return com.jagex.Class269.class;
    }
    
    static final void method4783(Class683 class683, byte i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class108.method1935(class259, class245, class683, (byte) 15);
    }
    
    static final void method4784(Class259 class259, Class245 class245,
				 Class683 class683, int i) {
	String string
	    = (String) (class683.anObjectArray8636
			[(class683.anInt8644 -= 1285561025) * 1373599041]);
	if (Class558.method9375(string, class683, (byte) 3) != null)
	    string = string.substring(0, string.length() - 1);
	class259.anObjectArray2758
	    = Class656_Sub1_Sub5_Sub1.method18727(string, class683,
						  -1886755106);
	class259.aBool2695 = true;
    }
    
    static final void method4785(Class683 class683, byte i) {
	String string
	    = (String) (class683.anObjectArray8636
			[(class683.anInt8644 -= 1285561025) * 1373599041]);
	Class376.method6367(string, false, -1587542507);
    }
    
    static final void method4786(Class683 class683, int i) {
	int i_1_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_1_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_1_ >> 16];
	Class294.method5313(class259, class245, class683, (byte) -10);
    }
    
    static final void method4787(Class683 class683, byte i) {
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub8_10671,
	     (class683.anIntArray8661
	      [(class683.anInt8662 -= 1552651121) * 501271953]) == 1 ? 1 : 0,
	     (byte) -51);
	client.aClass507_11137.method8375((byte) 73);
	Class650.method10715(-1758466106);
	client.aBool11084 = false;
    }
    
    public static void method4788(int i, int i_2_) {
	if (i < 1)
	    Class556_Sub1.anInt10648 = 329547631 * Class556_Sub1.anInt10624;
	else
	    Class556_Sub1.anInt10648 = i * 1777216045;
    }
    
    static int method4789(byte i) {
	return 13;
    }
}
