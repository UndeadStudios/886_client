/* Class434 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class434 implements Interface6
{
    boolean aBool4824;
    boolean aBool4825;
    String aString4826;
    public static int anInt4827;
    static int anInt4828;
    
    Class434(String string) {
	this(string, false);
    }
    
    public Class27 method48(int i) {
	return Class27.aClass27_278;
    }
    
    public int method49(int i) {
	if (aBool4824)
	    return 100;
	int i_0_;
	try {
	    i_0_ = Class312_Sub1.aClass544_10064
		       .method8917(aString4826, aBool4825, (byte) 0);
	} catch (Exception_Sub1 exception_sub1) {
	    Class223.method4243(Class30.aClass30_297,
				exception_sub1.aString11417,
				exception_sub1.anInt11416 * 2007005951,
				exception_sub1.getCause(), (byte) 99);
	    aBool4824 = true;
	    return 100;
	}
	return i_0_;
    }
    
    Class434(String string, boolean bool) {
	aString4826 = string;
	aBool4825 = bool;
    }
    
    void method6936(int i) {
	aBool4824 = true;
    }
    
    public Class27 method47() {
	return Class27.aClass27_278;
    }
    
    boolean method6937() {
	return aBool4824;
    }
    
    public int method12() {
	if (aBool4824)
	    return 100;
	int i;
	try {
	    i = Class312_Sub1.aClass544_10064.method8917(aString4826,
							 aBool4825, (byte) 0);
	} catch (Exception_Sub1 exception_sub1) {
	    Class223.method4243(Class30.aClass30_297,
				exception_sub1.aString11417,
				exception_sub1.anInt11416 * 2007005951,
				exception_sub1.getCause(), (byte) 12);
	    aBool4824 = true;
	    return 100;
	}
	return i;
    }
    
    public int method50() {
	if (aBool4824)
	    return 100;
	int i;
	try {
	    i = Class312_Sub1.aClass544_10064.method8917(aString4826,
							 aBool4825, (byte) 0);
	} catch (Exception_Sub1 exception_sub1) {
	    Class223.method4243(Class30.aClass30_297,
				exception_sub1.aString11417,
				exception_sub1.anInt11416 * 2007005951,
				exception_sub1.getCause(), (byte) -31);
	    aBool4824 = true;
	    return 100;
	}
	return i;
    }
    
    public Class27 method51() {
	return Class27.aClass27_278;
    }
    
    public Class27 method52() {
	return Class27.aClass27_278;
    }
    
    boolean method6938() {
	return aBool4824;
    }
    
    boolean method6939(byte i) {
	return aBool4824;
    }
    
    static final void method6940(Class683 class683, byte i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class224.method4248(class259, class245, class683, 16711935);
    }
    
    static final void method6941(Class683 class683, int i) {
	class683.anInt8662 -= 1552651121;
    }
    
    static void method6942(Class683 class683, byte i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class572.method9535(-1685330829) ? 1 : 0;
    }
    
    static final void method6943(Class656_Sub1 class656_sub1, int i,
				 boolean bool, byte i_1_) {
	Class532.method8838(class656_sub1, i, false, bool, 2114584989);
    }
    
    public static Class688[] method6944(byte i) {
	return (new Class688[]
		{ Class688.aClass688_8710, Class688.aClass688_8714,
		  Class688.aClass688_8715, Class688.aClass688_8711,
		  Class688.aClass688_8718, Class688.aClass688_8716,
		  Class688.aClass688_8709, Class688.aClass688_8712,
		  Class688.aClass688_8717, Class688.aClass688_8713 });
    }
}
