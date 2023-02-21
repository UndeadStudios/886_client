/* Class135 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class135
{
    Class140 aClass140_1610;
    int anInt1611 = 0;
    int anInt1612;
    Class122[] aClass122Array1613;
    Class182_Sub3 aClass182_Sub3_1614;
    int anInt1615 = 0;
    Class122_Sub3 aClass122_Sub3_1616;
    
    boolean method2296(int i) {
	return aClass122Array1613[i].method2117();
    }
    
    boolean method2297(Class136 class136, int i) {
	if (anInt1612 == 0)
	    return false;
	aClass122Array1613[anInt1612 & 0x7fffffff].method2110(class136, i);
	return true;
    }
    
    void method2298(int i, int i_0_, int i_1_, boolean bool, boolean bool_2_) {
	bool_2_ &= aClass182_Sub3_1614.method15339();
	if (!bool_2_ && (i == 4 || i == 8 || i == 9)) {
	    if (i == 4)
		i_1_ = i_0_;
	    i = 2;
	}
	if (i != 0 && bool)
	    i |= ~0x7fffffff;
	if (anInt1612 != i) {
	    if (anInt1612 != 0)
		aClass122Array1613[anInt1612 & 0x7fffffff].method2108();
	    if (i != 0) {
		aClass122Array1613[i & 0x7fffffff].method2106(bool);
		aClass122Array1613[i & 0x7fffffff].method2116(bool);
		aClass122Array1613[i & 0x7fffffff].method2107(i_0_, i_1_);
	    }
	    anInt1612 = i;
	    anInt1611 = i_0_;
	    anInt1615 = i_1_;
	} else if (anInt1612 != 0) {
	    aClass122Array1613[anInt1612 & 0x7fffffff].method2116(bool);
	    if (anInt1611 != i_0_ || anInt1615 != i_1_) {
		aClass122Array1613[anInt1612 & 0x7fffffff].method2107(i_0_,
								      i_1_);
		anInt1611 = i_0_;
		anInt1615 = i_1_;
	    }
	}
    }
    
    Class135(Class182_Sub3 class182_sub3) {
	anInt1612 = 0;
	aClass182_Sub3_1614 = class182_sub3;
	aClass140_1610 = new Class140(class182_sub3);
	aClass122Array1613 = new Class122[16];
	aClass122Array1613[1] = new Class122_Sub8(class182_sub3);
	aClass122Array1613[2]
	    = new Class122_Sub1(class182_sub3, aClass140_1610);
	aClass122Array1613[4]
	    = new Class122_Sub4(class182_sub3, aClass140_1610);
	aClass122Array1613[5]
	    = new Class122_Sub7(class182_sub3, aClass140_1610);
	aClass122Array1613[6] = new Class122_Sub2(class182_sub3);
	aClass122Array1613[7] = new Class122_Sub5(class182_sub3);
	aClass122Array1613[3] = aClass122_Sub3_1616
	    = new Class122_Sub3(class182_sub3);
	aClass122Array1613[8]
	    = new Class122_Sub6(class182_sub3, aClass140_1610);
	aClass122Array1613[9]
	    = new Class122_Sub9(class182_sub3, aClass140_1610);
	if (!aClass122Array1613[8].method2117())
	    aClass122Array1613[8] = aClass122Array1613[4];
	if (!aClass122Array1613[9].method2117())
	    aClass122Array1613[9] = aClass122Array1613[8];
    }
    
    boolean method2299(int i) {
	return aClass122Array1613[i].method2117();
    }
    
    boolean method2300(int i) {
	return aClass122Array1613[i].method2117();
    }
    
    void method2301(int i, int i_3_, int i_4_, boolean bool, boolean bool_5_) {
	bool_5_ &= aClass182_Sub3_1614.method15339();
	if (!bool_5_ && (i == 4 || i == 8 || i == 9)) {
	    if (i == 4)
		i_4_ = i_3_;
	    i = 2;
	}
	if (i != 0 && bool)
	    i |= ~0x7fffffff;
	if (anInt1612 != i) {
	    if (anInt1612 != 0)
		aClass122Array1613[anInt1612 & 0x7fffffff].method2108();
	    if (i != 0) {
		aClass122Array1613[i & 0x7fffffff].method2106(bool);
		aClass122Array1613[i & 0x7fffffff].method2116(bool);
		aClass122Array1613[i & 0x7fffffff].method2107(i_3_, i_4_);
	    }
	    anInt1612 = i;
	    anInt1611 = i_3_;
	    anInt1615 = i_4_;
	} else if (anInt1612 != 0) {
	    aClass122Array1613[anInt1612 & 0x7fffffff].method2116(bool);
	    if (anInt1611 != i_3_ || anInt1615 != i_4_) {
		aClass122Array1613[anInt1612 & 0x7fffffff].method2107(i_3_,
								      i_4_);
		anInt1611 = i_3_;
		anInt1615 = i_4_;
	    }
	}
    }
    
    boolean method2302(Class136 class136, int i) {
	if (anInt1612 == 0)
	    return false;
	aClass122Array1613[anInt1612 & 0x7fffffff].method2110(class136, i);
	return true;
    }
}
