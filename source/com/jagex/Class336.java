/* Class336 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Map;

public abstract class Class336 implements Interface5
{
    Map aMap3629;
    
    Class336(Map map) {
	aMap3629 = map;
    }
    
    static final void method5861(Class259 class259, Class245 class245,
				 Class683 class683, int i) {
	String string
	    = (String) (class683.anObjectArray8636
			[(class683.anInt8644 -= 1285561025) * 1373599041]);
	if (Class558.method9375(string, class683, (byte) 3) != null)
	    string = string.substring(0, string.length() - 1);
	class259.anObjectArray2728
	    = Class656_Sub1_Sub5_Sub1.method18727(string, class683,
						  -1025961450);
	class259.aBool2695 = true;
    }
    
    static final void method5862(Class683 class683, short i) {
	int i_0_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_0_, -695254952);
	Class592.method9821(class259, class683, (byte) 1);
    }
}
