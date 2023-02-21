/* Class549 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.HashMap;
import java.util.Iterator;

class Class549 implements Runnable
{
    static int anInt7287;
    Class372_Sub2 this$0;
    public static Class430 aClass430_7288;
    
    Class549(Class372_Sub2 class372_sub2) {
	this$0 = class372_sub2;
    }
    
    public void run() {
	try {
	    while (!this$0.aBool10300) {
		Iterator iterator = this$0.aList10298.iterator();
		while (iterator.hasNext()) {
		    Class550 class550 = (Class550) iterator.next();
		    class550.method9121((byte) 0);
		}
		HashMap hashmap = this$0.method15902(-2003073535);
		Iterator iterator_0_ = hashmap.keySet().iterator();
		while (iterator_0_.hasNext()) {
		    Class477 class477 = (Class477) iterator_0_.next();
		    if (!class477.aBool5198) {
			Class494[] class494s
			    = (Class494[]) hashmap.get(class477);
			for (int i = 0; i < class494s.length; i++)
			    class494s[i].method8033(843932929);
		    }
		}
		iterator_0_ = this$0.aList10298.iterator();
		while (iterator_0_.hasNext()) {
		    Class550 class550 = (Class550) iterator_0_.next();
		    class550.method9122(1025321374);
		}
		Class229.method4381(6L);
	    }
	} catch (Exception exception) {
	    Class525_Sub16_Sub13.method18448(null, exception, (byte) 77);
	    exception.printStackTrace();
	}
    }
    
    public void method9113() {
	try {
	    while (!this$0.aBool10300) {
		Iterator iterator = this$0.aList10298.iterator();
		while (iterator.hasNext()) {
		    Class550 class550 = (Class550) iterator.next();
		    class550.method9121((byte) 0);
		}
		HashMap hashmap = this$0.method15902(-2091211836);
		Iterator iterator_1_ = hashmap.keySet().iterator();
		while (iterator_1_.hasNext()) {
		    Class477 class477 = (Class477) iterator_1_.next();
		    if (!class477.aBool5198) {
			Class494[] class494s
			    = (Class494[]) hashmap.get(class477);
			for (int i = 0; i < class494s.length; i++)
			    class494s[i].method8033(-1397827557);
		    }
		}
		iterator_1_ = this$0.aList10298.iterator();
		while (iterator_1_.hasNext()) {
		    Class550 class550 = (Class550) iterator_1_.next();
		    class550.method9122(1025321374);
		}
		Class229.method4381(6L);
	    }
	} catch (Exception exception) {
	    Class525_Sub16_Sub13.method18448(null, exception, (byte) 18);
	    exception.printStackTrace();
	}
    }
    
    static final void method9114(Class683 class683, byte i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class199.method3779(class259, class245, class683, (byte) -28);
    }
    
    static final void method9115(Class683 class683, byte i) {
	int i_2_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = i_2_ & 0x3fff;
    }
    
    static final void method9116(Class683 class683, int i) {
	if (-1122540775 * client.anInt11232 >= 5
	    && client.anInt11232 * -1122540775 <= 9)
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= -1122540775 * client.anInt11232;
	else
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= 0;
    }
    
    static final void method9117(Class683 class683, int i) {
	/* empty */
    }
}
