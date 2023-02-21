/* Class318 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class318 implements Interface33
{
    Class458 aClass458_3505;
    Class383 aClass383_3506;
    Class157 aClass157_3507;
    
    public void method209(boolean bool) {
	if (bool) {
	    int i = ((Class434.anInt4827 * -1445589163
		      > client.anInt11223 * -1202561691)
		     ? -1445589163 * Class434.anInt4827
		     : -1202561691 * client.anInt11223);
	    int i_0_ = ((-1883654023 * Class696_Sub47.anInt11032
			 > client.anInt11224 * -1167554197)
			? Class696_Sub47.anInt11032 * -1883654023
			: client.anInt11224 * -1167554197);
	    int i_1_ = aClass157_3507.method12();
	    int i_2_ = aClass157_3507.method2472();
	    int i_3_ = 0;
	    int i_4_ = i;
	    int i_5_ = i * i_2_ / i_1_;
	    int i_6_ = (i_0_ - i_5_) / 2;
	    if (i_5_ > i_0_) {
		i_6_ = 0;
		i_5_ = i_0_;
		i_4_ = i_0_ * i_1_ / i_2_;
		i_3_ = (i - i_4_) / 2;
	    }
	    aClass157_3507.method2481(i_3_, i_6_, i_4_, i_5_);
	}
    }
    
    public void method211(int i) {
	aClass157_3507
	    = Class108.method1933(aClass458_3505,
				  -434521947 * aClass383_3506.anInt4009,
				  65280);
    }
    
    public void method212(boolean bool, byte i) {
	if (bool) {
	    int i_7_ = ((Class434.anInt4827 * -1445589163
			 > client.anInt11223 * -1202561691)
			? -1445589163 * Class434.anInt4827
			: -1202561691 * client.anInt11223);
	    int i_8_ = ((-1883654023 * Class696_Sub47.anInt11032
			 > client.anInt11224 * -1167554197)
			? Class696_Sub47.anInt11032 * -1883654023
			: client.anInt11224 * -1167554197);
	    int i_9_ = aClass157_3507.method12();
	    int i_10_ = aClass157_3507.method2472();
	    int i_11_ = 0;
	    int i_12_ = i_7_;
	    int i_13_ = i_7_ * i_10_ / i_9_;
	    int i_14_ = (i_8_ - i_13_) / 2;
	    if (i_13_ > i_8_) {
		i_14_ = 0;
		i_13_ = i_8_;
		i_12_ = i_8_ * i_9_ / i_10_;
		i_11_ = (i_7_ - i_12_) / 2;
	    }
	    aClass157_3507.method2481(i_11_, i_14_, i_12_, i_13_);
	}
    }
    
    public boolean method213(int i) {
	return aClass458_3505.method7506(aClass383_3506.anInt4009 * -434521947,
					 1382955977);
    }
    
    Class318(Class458 class458, Class383 class383) {
	aClass458_3505 = class458;
	aClass383_3506 = class383;
    }
    
    public void method70() {
	aClass157_3507
	    = Class108.method1933(aClass458_3505,
				  -434521947 * aClass383_3506.anInt4009,
				  65280);
    }
    
    public boolean method210() {
	return aClass458_3505.method7506(aClass383_3506.anInt4009 * -434521947,
					 -995895972);
    }
    
    static final void method5671(Class683 class683, int i) {
	Class621.method10187((String) (class683.anObjectArray8636
				       [((class683.anInt8644 -= 1285561025)
					 * 1373599041)]),
			     (byte) -2);
    }
    
    static final void method5672(Class683 class683, int i) {
	String string
	    = (String) (class683.anObjectArray8636
			[(class683.anInt8644 -= 1285561025) * 1373599041]);
	Class313_Sub2.method15733(string, -1885665187);
    }
    
    public static boolean method5673(int i) {
	return Class589.aBool7799;
    }
    
    static final void method5674(Class683 class683, int i) {
	Class473.method7754(true, -1335910809);
	Class559.method9402(-23555767);
	client.aClass507_11137.method8375((byte) -53);
	Class650.method10715(-1758466106);
	client.aBool11084 = false;
    }
}
