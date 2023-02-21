/* Class690 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class690 implements Interface76
{
    public static Class690 aClass690_8737;
    int anInt8738;
    public static Class690 aClass690_8739 = new Class690(-2);
    public static Class690 aClass690_8740;
    static Class690 aClass690_8741;
    public static Class690 aClass690_8742 = new Class690(-3);
    
    public int method80() {
	return 1494082551 * anInt8738;
    }
    
    public int method75() {
	return 1494082551 * anInt8738;
    }
    
    static {
	aClass690_8737 = new Class690(2);
	aClass690_8740 = new Class690(3);
	aClass690_8741 = new Class690(4);
    }
    
    Class690(int i) {
	anInt8738 = i * 1188154823;
    }
    
    public int method57() {
	return 1494082551 * anInt8738;
    }
    
    public static Class690[] method14097() {
	return new Class690[] { aClass690_8737, aClass690_8741, aClass690_8740,
				aClass690_8742, aClass690_8739 };
    }
    
    public static Class690[] method14098() {
	return new Class690[] { aClass690_8737, aClass690_8741, aClass690_8740,
				aClass690_8742, aClass690_8739 };
    }
    
    static final void method14099(Class683 class683, byte i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class183.method3600(class259, class245, false, 1, class683,
			    -406754664);
    }
    
    public static void method14100(int i, byte i_0_) {
	Class525_Sub16_Sub10 class525_sub16_sub10
	    = Class465.method7671(21, (long) i);
	class525_sub16_sub10.method18350((byte) -24);
    }
    
    static void method14101(Class182 class182, Class709 class709, int i,
			    int i_1_, int i_2_) {
	Class447.aClass709_4900.method14344(2126867766);
	if (!Class556_Sub1.aBool10639) {
	    for (Class525_Sub37 class525_sub37
		     = (Class525_Sub37) class709.method14372((short) -26068);
		 null != class525_sub37;
		 class525_sub37
		     = (Class525_Sub37) class709.method14353(-1890506235)) {
		Class287 class287
		    = ((Class287)
		       (Class556_Sub1.aClass40_Sub2_7464.method76
			(class525_sub37.anInt10825 * -480723851, -501303791)));
		if (Class525_Sub42.method16881(class287, 1040917523)) {
		    boolean bool
			= Class94.method1729(class182, class525_sub37,
					     class287, i, i_1_, (byte) 43);
		    if (bool)
			Class109.method1953(class182, class525_sub37, class287,
					    (byte) -63);
		}
	    }
	}
    }
}
