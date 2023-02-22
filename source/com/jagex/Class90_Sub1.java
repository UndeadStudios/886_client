/* Class90_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class90_Sub1 extends Class90
{
    public Class method45() {
	return com.jagex.Class79.class;
    }
    
    public Interface12 method42(int i, Interface13 interface13, int i_0_) {
	return new Class79(i, this);
    }
    
    Class90_Sub1(JS5 class458, int i) {
	super(class458, i);
    }
    
    public Interface12 method39(int i, Interface13 interface13) {
	return new Class79(i, this);
    }
    
    public Interface12 method41(int i, Interface13 interface13) {
	return new Class79(i, this);
    }
    
    public Interface12 method43(int i, Interface13 interface13) {
	return new Class79(i, this);
    }
    
    public Interface12 method38(int i, Interface13 interface13) {
	return new Class79(i, this);
    }
    
    public Interface12 method44(int i, Interface13 interface13) {
	return new Class79(i, this);
    }
    
    public Class method40(int i) {
	return com.jagex.Class79.class;
    }
    
    public Class method46() {
	return com.jagex.Class79.class;
    }
    
    static final void method17496(Class683 class683, int i) {
	int i_1_
	    = class683.anIntArray8647[class683.anInt8663 * 1931825055] >> 16;
	int i_2_ = (class683.anIntArray8647[class683.anInt8663 * 1931825055]
		    & 0xffff);
	int i_3_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	if (i_3_ < 0 || i_3_ > 5000)
	    throw new RuntimeException();
	class683.anIntArray8639[i_1_] = i_3_;
	int i_4_ = -1;
	if (i_2_ == Class495.aClass495_5519.method80())
	    i_4_ = 0;
	for (int i_5_ = 0; i_5_ < i_3_; i_5_++)
	    class683.anIntArrayArray8641[i_1_][i_5_] = i_4_;
    }
    
    static final void method17497(Class683 class683, byte i) {
	int i_6_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class287 class287
	    = (Class287) Class698.aClass40_Sub2_8770.method76(i_6_, 55792581);
	if (null == class287.aString3152)
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= "";
	else
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= class287.aString3152;
    }
}
