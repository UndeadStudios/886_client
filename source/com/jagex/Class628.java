/* Class628 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Iterator;

public class Class628 implements Iterator
{
    Class622[] aClass622Array8154;
    int anInt8155;
    public static int anInt8156;
    public static Class385 aClass385_8157;
    
    public boolean hasNext() {
	return anInt8155 * -1219785297 < aClass622Array8154.length;
    }
    
    public Object next() {
	return aClass622Array8154[(anInt8155 += 834005327) * -1219785297 - 1];
    }
    
    public boolean method10276() {
	return anInt8155 * -1219785297 < aClass622Array8154.length;
    }
    
    public void remove() {
	throw new UnsupportedOperationException();
    }
    
    Class628(Class622[] class622s) {
	aClass622Array8154 = class622s;
    }
    
    public boolean method10277() {
	return anInt8155 * -1219785297 < aClass622Array8154.length;
    }
    
    public boolean method10278() {
	return anInt8155 * -1219785297 < aClass622Array8154.length;
    }
    
    public Object method10279() {
	return aClass622Array8154[(anInt8155 += 834005327) * -1219785297 - 1];
    }
    
    public Object method10280() {
	return aClass622Array8154[(anInt8155 += 834005327) * -1219785297 - 1];
    }
    
    public Object method10281() {
	return aClass622Array8154[(anInt8155 += 834005327) * -1219785297 - 1];
    }
    
    public void method10282() {
	throw new UnsupportedOperationException();
    }
    
    static final void method10283(Class259 class259, Class245 class245,
				  Class683 class683, int i) {
	class683.anInt8662 -= 362986067;
	class259.anInt2669 = 1459892197 * (class683.anIntArray8661
					   [501271953 * class683.anInt8662]);
	class259.anInt2670
	    = (class683.anIntArray8661[class683.anInt8662 * 501271953 + 1]
	       * 276568897);
	class259.anInt2668
	    = (-1167804509
	       * class683.anIntArray8661[2 + 501271953 * class683.anInt8662]);
	Class649.method10708(class259, (byte) 0);
    }
    
    static final void method10284(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class184.method3609(class259, class683, 2012344333);
    }
    
    static final void method10285(Class683 class683, byte i) {
	int i_0_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class7.aClass278_54.method5118(i_0_ != 0, -2118739047);
    }
    
    static final void method10286(Class683 class683, int i) {
	String string
	    = (String) (class683.anObjectArray8636
			[(class683.anInt8644 -= 1285561025) * 1373599041]);
	if (string.startsWith(Class501.method8197(0, 184595581))
	    || string.startsWith(Class501.method8197(1, 719032387)))
	    string = string.substring(7);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class479.method7806(string, (byte) -1);
    }
}
