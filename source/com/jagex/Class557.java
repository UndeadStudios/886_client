/* Class557 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Class557
{
    int anInt7532;
    boolean aBool7533;
    public List aList7534 = new LinkedList();
    int anInt7535;
    
    void method9355(Class567 class567) {
	Class656_Sub1 class656_sub1 = class567.aClass656_Sub1_7606;
	boolean bool = true;
	Class211[] class211s
	    = class567.aClass656_Sub1_7606.aClass211Array10869;
	for (int i = 0; i < class211s.length; i++) {
	    if (class211s[i].aBool2265) {
		bool = false;
		break;
	    }
	}
	if (!bool) {
	    class567.aClass557_7609 = this;
	    if (aBool7533) {
		Iterator iterator = aList7534.iterator();
		while (iterator.hasNext()) {
		    Class567 class567_0_ = (Class567) iterator.next();
		    if (class567_0_.aClass656_Sub1_7606 == class656_sub1) {
			iterator.remove();
			Class168.method2718(class567_0_, -1995677073);
		    }
		}
	    }
	    ListIterator listiterator = aList7534.listIterator();
	    while (listiterator.hasNext()) {
		Class567 class567_1_ = (Class567) listiterator.next();
		if (46608013 * class656_sub1.anInt10871
		    >= 46608013 * class567_1_.aClass656_Sub1_7606.anInt10871) {
		    listiterator.previous();
		    listiterator.add(class567);
		    return;
		}
	    }
	    aList7534.add(class567);
	}
    }
    
    public void method9356(int i) {
	Iterator iterator = aList7534.iterator();
	while (iterator.hasNext()) {
	    Class567 class567 = (Class567) iterator.next();
	    iterator.remove();
	    Class168.method2718(class567, -1853071943);
	}
    }
    
    Class557(boolean bool) {
	aBool7533 = false;
	anInt7532 = 0;
	anInt7535 = 0;
	aBool7533 = bool;
    }
    
    void method9357(Class567 class567) {
	Class656_Sub1 class656_sub1 = class567.aClass656_Sub1_7606;
	boolean bool = true;
	Class211[] class211s
	    = class567.aClass656_Sub1_7606.aClass211Array10869;
	for (int i = 0; i < class211s.length; i++) {
	    if (class211s[i].aBool2265) {
		bool = false;
		break;
	    }
	}
	if (!bool) {
	    class567.aClass557_7609 = this;
	    if (aBool7533) {
		Iterator iterator = aList7534.iterator();
		while (iterator.hasNext()) {
		    Class567 class567_2_ = (Class567) iterator.next();
		    if (class567_2_.aClass656_Sub1_7606 == class656_sub1) {
			iterator.remove();
			Class168.method2718(class567_2_, -1929200027);
		    }
		}
	    }
	    ListIterator listiterator = aList7534.listIterator();
	    while (listiterator.hasNext()) {
		Class567 class567_3_ = (Class567) listiterator.next();
		if (46608013 * class656_sub1.anInt10871
		    >= 46608013 * class567_3_.aClass656_Sub1_7606.anInt10871) {
		    listiterator.previous();
		    listiterator.add(class567);
		    return;
		}
	    }
	    aList7534.add(class567);
	}
    }
    
    public void method9358() {
	Iterator iterator = aList7534.iterator();
	while (iterator.hasNext()) {
	    Class567 class567 = (Class567) iterator.next();
	    iterator.remove();
	    Class168.method2718(class567, -2040371924);
	}
    }
    
    public void method9359() {
	Iterator iterator = aList7534.iterator();
	while (iterator.hasNext()) {
	    Class567 class567 = (Class567) iterator.next();
	    iterator.remove();
	    Class168.method2718(class567, -1878958899);
	}
    }
    
    void method9360(Class567 class567, short i) {
	Class656_Sub1 class656_sub1 = class567.aClass656_Sub1_7606;
	boolean bool = true;
	Class211[] class211s
	    = class567.aClass656_Sub1_7606.aClass211Array10869;
	for (int i_4_ = 0; i_4_ < class211s.length; i_4_++) {
	    if (class211s[i_4_].aBool2265) {
		bool = false;
		break;
	    }
	}
	if (!bool) {
	    class567.aClass557_7609 = this;
	    if (aBool7533) {
		Iterator iterator = aList7534.iterator();
		while (iterator.hasNext()) {
		    Class567 class567_5_ = (Class567) iterator.next();
		    if (class567_5_.aClass656_Sub1_7606 == class656_sub1) {
			iterator.remove();
			Class168.method2718(class567_5_, -1990278611);
		    }
		}
	    }
	    ListIterator listiterator = aList7534.listIterator();
	    while (listiterator.hasNext()) {
		Class567 class567_6_ = (Class567) listiterator.next();
		if (46608013 * class656_sub1.anInt10871
		    >= 46608013 * class567_6_.aClass656_Sub1_7606.anInt10871) {
		    listiterator.previous();
		    listiterator.add(class567);
		    return;
		}
	    }
	    aList7534.add(class567);
	}
    }
    
    static final void method9361(Class683 class683, int i) {
	class683.anInt8662 -= -1189665054;
	int i_7_ = class683.anIntArray8661[501271953 * class683.anInt8662];
	int i_8_ = class683.anIntArray8661[1 + class683.anInt8662 * 501271953];
	if (i_7_ == 0)
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= 0;
	else
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= (int) Math.pow((double) i_7_, (double) i_8_);
    }
    
    static final void method9362(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = 0;
    }
    
    static final void method9363(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = 0;
    }
    
    static final void method9364(int i, int i_9_, int i_10_, int i_11_) {
	String string = new StringBuilder().append("tele ").append(i).append
			    (Class55.aString560).append
			    (i_9_ >> 6).append
			    (Class55.aString560).append
			    (i_10_ >> 6).append
			    (Class55.aString560).append
			    (i_9_ & 0x3f).append
			    (Class55.aString560).append
			    (i_10_ & 0x3f).toString();
	System.out.println(string);
	Class410.method6666(string, true, false, (byte) 91);
    }
}
