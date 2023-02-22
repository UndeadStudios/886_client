/* Class462 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public final class Class462 implements Comparable
{
    long aLong5091;
    long aLong5092;
    Object anObject5093;
    Object anObject5094;
    public static JS5 aClass458_5095;
    static int anInt5096;
    
    public boolean method7592(Object object) {
	if (object instanceof Class462)
	    return anObject5094.equals(((Class462) object).anObject5094);
	throw new IllegalArgumentException();
    }
    
    public int method7593(Object object) {
	return method7594((Class462) object, -147268164);
    }
    
    int method7594(Class462 class462_0_, int i) {
	if (aLong5091 * -3494449614505945331L
	    < -3494449614505945331L * class462_0_.aLong5091)
	    return -1;
	if (-3494449614505945331L * aLong5091
	    > class462_0_.aLong5091 * -3494449614505945331L)
	    return 1;
	return 0;
    }
    
    public int hashCode() {
	return anObject5094.hashCode();
    }
    
    public int compareTo(Object object) {
	return method7594((Class462) object, -1915379550);
    }
    
    public boolean method7595(Object object) {
	if (object instanceof Class462)
	    return anObject5094.equals(((Class462) object).anObject5094);
	throw new IllegalArgumentException();
    }
    
    public boolean method7596(Object object) {
	if (object instanceof Class462)
	    return anObject5094.equals(((Class462) object).anObject5094);
	throw new IllegalArgumentException();
    }
    
    public boolean method7597(Object object) {
	if (object instanceof Class462)
	    return anObject5094.equals(((Class462) object).anObject5094);
	throw new IllegalArgumentException();
    }
    
    public boolean method7598(Object object) {
	if (object instanceof Class462)
	    return anObject5094.equals(((Class462) object).anObject5094);
	throw new IllegalArgumentException();
    }
    
    public boolean equals(Object object) {
	if (object instanceof Class462)
	    return anObject5094.equals(((Class462) object).anObject5094);
	throw new IllegalArgumentException();
    }
    
    public int method7599() {
	return anObject5094.hashCode();
    }
    
    public int method7600() {
	return anObject5094.hashCode();
    }
    
    public int method7601(Object object) {
	return method7594((Class462) object, 78487027);
    }
    
    int method7602(Class462 class462_1_) {
	if (aLong5091 * -3494449614505945331L
	    < -3494449614505945331L * class462_1_.aLong5091)
	    return -1;
	if (-3494449614505945331L * aLong5091
	    > class462_1_.aLong5091 * -3494449614505945331L)
	    return 1;
	return 0;
    }
    
    Class462(Object object, Object object_2_) {
	anObject5093 = object;
	anObject5094 = object_2_;
    }
    
    public int method7603() {
	return anObject5094.hashCode();
    }
    
    public int method7604(Object object) {
	return method7594((Class462) object, 229036717);
    }
    
    static final int method7605(int i, byte i_3_) {
	return i < 7 ? 9 : 11;
    }
    
    static final void method7606(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class50.method1133(class259, class245, class683, (byte) 99);
    }
    
    static final void method7607(Class683 class683, byte i) {
	int i_4_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_4_, -695254952);
	int i_5_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	i_5_--;
	if (class259.aStringArray2701 == null
	    || i_5_ >= class259.aStringArray2701.length
	    || class259.aStringArray2701[i_5_] == null)
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= "";
	else
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= class259.aStringArray2701[i_5_];
    }
    
    static void method7608(byte i) {
	Class525_Sub10.aClass200_10505.method3791((byte) -93);
    }
    
    static final void method7609(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = 0;
    }
}
