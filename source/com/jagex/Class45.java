/* Class45 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class45 implements Interface5
{
    Class aClass348;
    public static Class500 aClass500_349;
    static short aShort350;
    
    public Class method46() {
	return aClass348;
    }
    
    public Class45(Class var_class) {
	aClass348 = var_class;
    }
    
    public Class method40(int i) {
	return aClass348;
    }
    
    public Interface12 method39(int i, Interface13 interface13) {
	Interface12 interface12;
	try {
	    Interface12 interface12_0_ = (Interface12) aClass348.newInstance();
	    ((Interface7) interface12_0_).method54(i, (byte) 121);
	    interface12 = interface12_0_;
	} catch (Exception exception) {
	    exception.printStackTrace();
	    return null;
	}
	return interface12;
    }
    
    public Interface12 method41(int i, Interface13 interface13) {
	Interface12 interface12;
	try {
	    Interface12 interface12_1_ = (Interface12) aClass348.newInstance();
	    ((Interface7) interface12_1_).method54(i, (byte) 73);
	    interface12 = interface12_1_;
	} catch (Exception exception) {
	    exception.printStackTrace();
	    return null;
	}
	return interface12;
    }
    
    public Interface12 method42(int i, Interface13 interface13, int i_2_) {
	Interface12 interface12;
	try {
	    Interface12 interface12_3_ = (Interface12) aClass348.newInstance();
	    ((Interface7) interface12_3_).method54(i, (byte) 61);
	    interface12 = interface12_3_;
	} catch (Exception exception) {
	    exception.printStackTrace();
	    return null;
	}
	return interface12;
    }
    
    public Interface12 method38(int i, Interface13 interface13) {
	Interface12 interface12;
	try {
	    Interface12 interface12_4_ = (Interface12) aClass348.newInstance();
	    ((Interface7) interface12_4_).method54(i, (byte) 37);
	    interface12 = interface12_4_;
	} catch (Exception exception) {
	    exception.printStackTrace();
	    return null;
	}
	return interface12;
    }
    
    public Interface12 method44(int i, Interface13 interface13) {
	Interface12 interface12;
	try {
	    Interface12 interface12_5_ = (Interface12) aClass348.newInstance();
	    ((Interface7) interface12_5_).method54(i, (byte) 122);
	    interface12 = interface12_5_;
	} catch (Exception exception) {
	    exception.printStackTrace();
	    return null;
	}
	return interface12;
    }
    
    public Class method45() {
	return aClass348;
    }
    
    public Interface12 method43(int i, Interface13 interface13) {
	Interface12 interface12;
	try {
	    Interface12 interface12_6_ = (Interface12) aClass348.newInstance();
	    ((Interface7) interface12_6_).method54(i, (byte) 55);
	    interface12 = interface12_6_;
	} catch (Exception exception) {
	    exception.printStackTrace();
	    return null;
	}
	return interface12;
    }
    
    static final void method1090(Class683 class683, byte i) {
	client.aBool11307
	    = (class683.anIntArray8661
	       [(class683.anInt8662 -= 1552651121) * 501271953]) == 1;
	if (client.aBool11307)
	    Class208.method3908(363736815);
    }
}
