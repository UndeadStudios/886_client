/* Class78 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class78
{
    public static int method1566(int i) {
	return i & 0xff;
    }
    
    public static int method1567(int i) {
	return i >>> 8;
    }
    
    Class78() throws Throwable {
	throw new Error();
    }
    
    public static int method1568(int i) {
	return i >>> 8;
    }
    
    public static int method1569(int i) {
	return i & 0xff;
    }
    
    public static int method1570(int i) {
	return i & 0xff;
    }
    
    public static Object[] method1571(RSBuffer class525_sub38,
                                      Class495[] class495s) {
	int i = class525_sub38.method16740((byte) -94);
	Object[] objects = new Object[class495s.length * i];
	for (int i_0_ = 0; i_0_ < i; i_0_++) {
	    for (int i_1_ = 0; i_1_ < class495s.length; i_1_++) {
		int i_2_ = i_1_ + class495s.length * i_0_;
		objects[i_2_]
		    = class495s[i_1_].aClass480_5456.method7813(class525_sub38,
								1552651121);
	    }
	}
	return objects;
    }
    
    public static Object[] method1572(RSBuffer class525_sub38,
                                      Class495[] class495s) {
	int i = class525_sub38.method16740((byte) -1);
	Object[] objects = new Object[class495s.length * i];
	for (int i_3_ = 0; i_3_ < i; i_3_++) {
	    for (int i_4_ = 0; i_4_ < class495s.length; i_4_++) {
		int i_5_ = i_4_ + class495s.length * i_3_;
		objects[i_5_]
		    = class495s[i_4_].aClass480_5456.method7813(class525_sub38,
								1552651121);
	    }
	}
	return objects;
    }
    
    static final void method1573(long l) {
	try {
	    Thread.sleep(l);
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
    }
}
