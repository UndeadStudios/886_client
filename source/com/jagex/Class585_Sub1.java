/* Class585_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.IOException;

public class Class585_Sub1 extends Class585 implements Interface5
{
    public Interface12 method44(int i, Interface13 interface13) {
	return new Class580(i, this, interface13);
    }
    
    public Interface12 method42(int i, Interface13 interface13, int i_0_) {
	return new Class580(i, this, interface13);
    }
    
    public Class method45() {
	return com.jagex.Class580.class;
    }
    
    public Interface12 method39(int i, Interface13 interface13) {
	return new Class580(i, this, interface13);
    }
    
    public Interface12 method41(int i, Interface13 interface13) {
	return new Class580(i, this, interface13);
    }
    
    public Interface12 method43(int i, Interface13 interface13) {
	return new Class580(i, this, interface13);
    }
    
    public Class method46() {
	return com.jagex.Class580.class;
    }
    
    Class585_Sub1(Class458 class458) {
	super(class458);
    }
    
    public Interface12 method38(int i, Interface13 interface13) {
	return new Class580(i, this, interface13);
    }
    
    public Class method40(int i) {
	return com.jagex.Class580.class;
    }
    
    static final void method16484(Class259 class259, Class245 class245,
				  Class683 class683, int i) {
	String string
	    = (String) (class683.anObjectArray8636
			[(class683.anInt8644 -= 1285561025) * 1373599041]);
	if (Class558.method9375(string, class683, (byte) 3) != null)
	    string = string.substring(0, string.length() - 1);
	class259.anObjectArray2733
	    = Class656_Sub1_Sub5_Sub1.method18727(string, class683,
						  -1496985966);
	class259.aBool2695 = true;
    }
    
    public static void method16485(boolean bool, int i) {
	Class40_Sub20.aClass217_11050.method4028(971708487);
	if (Class265.method4801(client.anInt11075 * 1777895575, -1269297214)) {
	    Class96[] class96s = client.aClass96Array11133;
	    for (int i_1_ = 0; i_1_ < class96s.length; i_1_++) {
		Class96 class96 = class96s[i_1_];
		class96.anInt1182 += -1049943141;
		if (class96.anInt1182 * -303330669 < 50 && !bool)
		    return;
		class96.anInt1182 = 0;
		if (!class96.aBool1184
		    && class96.method1799((byte) 0) != null) {
		    Class525_Sub15 class525_sub15
			= Class16.method767(Class412.aClass412_4351,
					    class96.aClass6_1169, 1977859884);
		    class96.method1794(class525_sub15, (short) 29953);
		    try {
			class96.method1792(1726021699);
		    } catch (IOException ioexception) {
			class96.aBool1184 = true;
		    }
		}
	    }
	    Class40_Sub20.aClass217_11050.method4028(1387878827);
	}
    }
}
