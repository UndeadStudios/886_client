/* Class168 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class168
{
    abstract boolean method2709();
    
    public abstract int method2710();
    
    public abstract int method2711();
    
    abstract boolean method350();
    
    abstract boolean method2712();
    
    public abstract void method127();
    
    public abstract int method2713();
    
    Class168() {
	/* empty */
    }
    
    public abstract int method2714();
    
    abstract boolean method351();
    
    abstract boolean method2715();
    
    public abstract int method2716();
    
    abstract boolean method2717();
    
    public abstract void method352();
    
    public abstract void method221();
    
    public abstract void method222();
    
    static void method2718(Class567 class567, int i) {
	class567.aClass656_Sub1_7606 = null;
	synchronized (Class567.aStack7607) {
	    if (Class567.aStack7607.size() < 200)
		Class567.aStack7607.push(class567);
	}
    }
    
    static final void method2719(Class259 class259, Class245 class245,
				 Class683 class683, short i) {
	class683.anInt8662 -= -1189665054;
	int i_0_ = class683.anIntArray8661[501271953 * class683.anInt8662];
	int i_1_ = class683.anIntArray8661[class683.anInt8662 * 501271953 + 1];
	Class88 class88
	    = (Class88) client.aClass40_Sub16_11201.method76(i_0_, 201062752);
	if (i_1_ != 2053564367 * class88.anInt893)
	    class259.method4699(i_0_, i_1_, (byte) 15);
	else
	    class259.method4694(i_0_, -2035946912);
    }
    
    static final void method2720(Class259 class259, Class245 class245,
				 Class683 class683, int i) {
	class259.aString2687
	    = (String) (class683.anObjectArray8636
			[(class683.anInt8644 -= 1285561025) * 1373599041]);
    }
    
    static final void method2721(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class181.method3123(class259, class683, -464041627);
    }
    
    static final void method2722(Class683 class683, int i) {
	if (1 == Class383.anInt4010 * -2023195487)
	    Class117.aBool1427 = true;
	else if (Class383.anInt4010 * -2023195487 == 3)
	    Class117.aBool1433 = true;
    }
    
    static void method2723(int i, int i_2_) {
	Class109.anInt1322 = 1584513943 * i;
	Class109.aClass200_1321.method3791((byte) 45);
    }
}
