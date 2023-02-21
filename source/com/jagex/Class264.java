/* Class264 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class264
{
    static Class264 aClass264_2802 = new Class264(0);
    static Class264 aClass264_2803 = new Class264(1);
    int anInt2804;
    
    Class264(int i) {
	anInt2804 = i * 975971621;
    }
    
    static boolean method4790(int i, int i_0_) {
	if (18 == i || i == 19 || 20 == i || i == 21 || 22 == i || 1004 == i)
	    return true;
	if (17 == i)
	    return true;
	return false;
    }
    
    static Class605[] method4791(int i) {
	return (new Class605[]
		{ Class605.aClass605_7959, Class605.aClass605_7962,
		  Class605.aClass605_7960 });
    }
    
    static final void method4792(Class683 class683, int i) {
	class683.anInt8662 -= -1189665054;
	int i_1_ = class683.anIntArray8661[501271953 * class683.anInt8662];
	int i_2_ = class683.anIntArray8661[class683.anInt8662 * 501271953 + 1];
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = (1214913539
	       * client.aClass486ArrayArray11128[i_2_][i_1_].anInt5238);
    }
    
    static final void method4793(Class683 class683, int i) {
	String string
	    = (String) (class683.anObjectArray8636
			[(class683.anInt8644 -= 1285561025) * 1373599041]);
	long l = Class696_Sub36.method17301(868143310);
	if (l == 0L)
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= 5;
	else
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= Class301.method5405(l, string, (byte) 7);
    }
    
    static final void method4794(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = 0;
    }
    
    static final void method4795(Class683 class683, int i) {
	Class322 class322
	    = (Class322) (class683.aClass525_Sub16_Sub4_8664.anObjectArray11750
			  [1931825055 * class683.anInt8663]);
	Interface17 interface17
	    = ((Interface17)
	       (class683.anIntArray8647[class683.anInt8663 * 1931825055] == 0
		? class683.aMap8657.get(class322.aClass163_3544.aClass453_1767)
		: class683.aMap8643
		      .get(class322.aClass163_3544.aClass453_1767)));
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = interface17.method93(class322, (byte) 2);
    }
}
