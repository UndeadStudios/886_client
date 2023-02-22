/* Class159 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.HashMap;
import java.util.Iterator;

class Class159 implements Runnable
{
    Class372_Sub1 this$0;
    public static Class295 aClass295_1755;
    static int anInt1756;
    
    Class159(Class372_Sub1 class372_sub1) {
	this$0 = class372_sub1;
    }
    
    public void run() {
	try {
	    while (!this$0.aBool10190) {
		HashMap hashmap = this$0.method15801((byte) 1);
		Iterator iterator = hashmap.keySet().iterator();
		while (iterator.hasNext()) {
		    Class477 class477 = (Class477) iterator.next();
		    if (!class477.aBool5198) {
			Class494[] class494s
			    = (Class494[]) hashmap.get(class477);
			for (int i = 0; i < class494s.length; i++)
			    class494s[i].method8030((byte) 8);
		    }
		}
		Class229.method4381(25L);
	    }
	} catch (Exception exception) {
	    Class525_Sub16_Sub13.method18448(null, exception, (byte) 27);
	}
    }
    
    public void method2566() {
	try {
	    while (!this$0.aBool10190) {
		HashMap hashmap = this$0.method15801((byte) -75);
		Iterator iterator = hashmap.keySet().iterator();
		while (iterator.hasNext()) {
		    Class477 class477 = (Class477) iterator.next();
		    if (!class477.aBool5198) {
			Class494[] class494s
			    = (Class494[]) hashmap.get(class477);
			for (int i = 0; i < class494s.length; i++)
			    class494s[i].method8030((byte) 18);
		    }
		}
		Class229.method4381(25L);
	    }
	} catch (Exception exception) {
	    Class525_Sub16_Sub13.method18448(null, exception, (byte) 100);
	}
    }
    
    public static Class245 method2567(int i, int i_0_) {
	return Class162.aClass245Array1764[i >> 16];
    }
    
    public static int method2568(int i, int i_1_, int i_2_) {
	i_1_ = (i & 0x7f) * i_1_ >> 7;
	if (i_1_ < 2)
	    i_1_ = 2;
	else if (i_1_ > 126)
	    i_1_ = 126;
	return i_1_ + (i & 0xff80);
    }
    
    public static void method2569
	(Class578 class578, int i, int i_3_, Class676 class676,
	 Class656_Sub1_Sub2_Sub1 class656_sub1_sub2_sub1, int i_4_) {
	Class683 class683 = Class457.method7468(-485786200);
	class683.aClass656_Sub1_Sub2_Sub1_8646 = class656_sub1_sub2_sub1;
	Class587.method9691(class578, i, i_3_, class683, (byte) 34);
	class683.aClass656_Sub1_Sub2_Sub1_8646 = null;
    }
    
    static final void method2570(Class683 class683, int i) {
	Class163 class163
	    = (Class163) (class683.aClass525_Sub16_Sub4_8664.anObjectArray11750
			  [class683.anInt8663 * 1931825055]);
	Interface17 interface17
	    = ((Interface17)
	       (0 == class683.anIntArray8647[1931825055 * class683.anInt8663]
		? class683.aMap8657.get(class163.aClass453_1767)
		: class683.aMap8643.get(class163.aClass453_1767)));
	Class480 class480 = class163.aClass495_1765.method8131(-190673460);
	if (class480 == Class480.aClass480_5216) {
	    if (Class453.aClass453_4940 == class163.aClass453_1767)
		Class34.method961(class163, (byte) 12);
	    interface17.method88(class163,
				 class683.anIntArray8661[((class683.anInt8662
							   -= 1552651121)
							  * 501271953)],
				 1378015964);
	} else if (Class480.aClass480_5211 == class480)
	    interface17.method100(class163,
				  class683.aLongArray8645[((class683.anInt8648
							    -= 2101136961)
							   * 105529793)]);
	else if (class480 == Class480.aClass480_5212) {
	    if (Class453.aClass453_4940 == class163.aClass453_1767)
		Class644.method10619(class163, -169087963);
	    interface17.method92(class163,
				 (class683.anObjectArray8636
				  [((class683.anInt8644 -= 1285561025)
				    * 1373599041)]),
				 (byte) -85);
	} else
	    throw new RuntimeException();
    }
    
    static final void method2571(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = 1440880309 * class259.anInt2718;
    }
    
    static final void method2572(Class683 class683, int i) {
	MagnetConfig.method2454(class683,
			    Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705,
			    (byte) -124);
    }
    
    static final void method2573(Class683 class683, int i) {
	Class7.aClass278_54.method5123(331459295);
    }
}
