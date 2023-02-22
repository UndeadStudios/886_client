/* Class500 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.LinkedList;

public class Class500 implements Runnable
{
    Class507 aClass507_5557;
    volatile boolean aBool5558 = false;
    LinkedList aLinkedList5559 = new LinkedList();
    public static Class7 aClass7_5560;
    
    public void run() {
	for (;;)
	    method8175(-682195269);
    }
    
    public Class500() {
	aClass507_5557 = new Class507(true);
    }
    
    public void method8170(Class514 class514, int i) {
	synchronized (aLinkedList5559) {
	    aLinkedList5559.add(class514);
	    aLinkedList5559.notify();
	}
    }
    
    public boolean method8171(byte i) {
	return aBool5558;
    }
    
    public Class507 method8172(int i) {
	return aClass507_5557;
    }
    
    void method8173(Class507 class507, byte i) {
	aClass507_5557 = class507;
    }
    
    public void method8174(Class40_Sub11 class40_sub11) {
	aClass507_5557.method8398(class40_sub11, 1804784598);
    }
    
    void method8175(int i) {
	Object object = null;
	Class514 class514;
	synchronized (aLinkedList5559) {
	    try {
		aLinkedList5559.wait();
	    } catch (InterruptedException interruptedexception) {
		/* empty */
	    }
	    class514 = (Class514) aLinkedList5559.pollFirst();
	}
	do {
	    try {
		try {
		    if (null != class514) {
			aBool5558 = true;
			method8184(class514, 1088336922);
		    }
		} catch (Exception exception) {
		    aBool5558 = false;
		    break;
		}
		aBool5558 = false;
	    } catch (Exception object_0_) {
		aBool5558 = false;
		throw object_0_;
	    }
	} while (false);
    }
    
    public void method8176() {
	for (;;)
	    method8175(-682195269);
    }
    
    void method8177(Class514 class514) {
	if (Class499.aClass499_5554 == class514.aClass499_5694)
	    aClass507_5557.method8375((byte) -29);
	else
	    aClass507_5557.method8376(class514, -1133521593);
	for (boolean bool = aClass507_5557.method8387(1060367497); !bool;
	     bool = aClass507_5557.method8387(1060367497)) {
	    /* empty */
	}
	aClass507_5557.method8370(-471614275);
	client.aClass507_11137.method8370(-1126148631);
    }
    
    public void method8178(Class40_Sub11 class40_sub11, int i) {
	aClass507_5557.method8398(class40_sub11, 1804784598);
    }
    
    public void method8179(Class40_Sub11 class40_sub11) {
	aClass507_5557.method8398(class40_sub11, 1804784598);
    }
    
    public Class507 method8180() {
	return aClass507_5557;
    }
    
    void method8181(Class507 class507) {
	aClass507_5557 = class507;
    }
    
    void method8182(Class514 class514) {
	if (Class499.aClass499_5554 == class514.aClass499_5694)
	    aClass507_5557.method8375((byte) -46);
	else
	    aClass507_5557.method8376(class514, -1133521593);
	for (boolean bool = aClass507_5557.method8387(1060367497); !bool;
	     bool = aClass507_5557.method8387(1060367497)) {
	    /* empty */
	}
	aClass507_5557.method8370(-275614364);
	client.aClass507_11137.method8370(-208379374);
    }
    
    void method8183(Class514 class514) {
	if (Class499.aClass499_5554 == class514.aClass499_5694)
	    aClass507_5557.method8375((byte) 7);
	else
	    aClass507_5557.method8376(class514, -1133521593);
	for (boolean bool = aClass507_5557.method8387(1060367497); !bool;
	     bool = aClass507_5557.method8387(1060367497)) {
	    /* empty */
	}
	aClass507_5557.method8370(1920179971);
	client.aClass507_11137.method8370(1105090673);
    }
    
    void method8184(Class514 class514, int i) {
	if (Class499.aClass499_5554 == class514.aClass499_5694)
	    aClass507_5557.method8375((byte) 4);
	else
	    aClass507_5557.method8376(class514, -1133521593);
	for (boolean bool = aClass507_5557.method8387(1060367497); !bool;
	     bool = aClass507_5557.method8387(1060367497)) {
	    /* empty */
	}
	aClass507_5557.method8370(274167490);
	client.aClass507_11137.method8370(1402918363);
    }
    
    static final void method8185(Class683 class683, int i) {
	int i_1_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub17_10676
		  .method14167(i_1_, (byte) -53);
    }
}
