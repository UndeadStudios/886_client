/* Class642 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Font;
import java.net.InetAddress;
import java.util.LinkedList;
import java.util.Queue;

import jaclib.ping.Ping;

public class Class642 implements Runnable
{
    Thread aThread8323;
    public static int[] anIntArray8324;
    Object anObject8325 = new Object();
    Queue aQueue8326 = new LinkedList();
    public static Class40_Sub11 aClass40_Sub11_8327;
    public static int anInt8328;
    static Font aFont8329;
    
    public void method10578() {
	if (null != aThread8323) {
	    method10581(anObject8325, 1816208082);
	    try {
		aThread8323.join();
	    } catch (InterruptedException interruptedexception) {
		/* empty */
	    }
	    aThread8323 = null;
	}
    }
    
    public Class642() {
	aThread8323 = new Thread(this);
	aThread8323.setDaemon(true);
	aThread8323.start();
    }
    
    public void method10579(int i) {
	if (null != aThread8323) {
	    method10581(anObject8325, 1813064360);
	    try {
		aThread8323.join();
	    } catch (InterruptedException interruptedexception) {
		/* empty */
	    }
	    aThread8323 = null;
	}
    }
    
    void method10580(Object object) {
	synchronized (aQueue8326) {
	    aQueue8326.add(object);
	    aQueue8326.notify();
	}
    }
    
    public void run() {
	for (;;) {
	    Class646 class646;
	    synchronized (aQueue8326) {
		Object object;
		for (object = aQueue8326.poll(); null == object;
		     object = aQueue8326.poll()) {
		    try {
			aQueue8326.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		}
		if (anObject8325 == object)
		    break;
		class646 = (Class646) object;
	    }
	    int i;
	    try {
		byte[] is
		    = InetAddress.getByName(class646.aString8357).getAddress();
		i = Ping.method680(is[0], is[1], is[2], is[3], 1000L);
	    } catch (Throwable throwable) {
		i = 1000;
	    }
	    class646.anInt8356 = i * -1305597287;
	}
    }
    
    void method10581(Object object, int i) {
	synchronized (aQueue8326) {
	    aQueue8326.add(object);
	    aQueue8326.notify();
	}
    }
    
    public Class646 method10582(String string) {
	if (aThread8323 == null)
	    throw new IllegalStateException("");
	if (string == null)
	    throw new IllegalArgumentException("");
	Class646 class646 = new Class646(string);
	method10581(class646, 1810460822);
	return class646;
    }
    
    public void method10583() {
	if (null != aThread8323) {
	    method10581(anObject8325, 1152307873);
	    try {
		aThread8323.join();
	    } catch (InterruptedException interruptedexception) {
		/* empty */
	    }
	    aThread8323 = null;
	}
    }
    
    void method10584(Object object) {
	synchronized (aQueue8326) {
	    aQueue8326.add(object);
	    aQueue8326.notify();
	}
    }
    
    public void method10585() {
	if (null != aThread8323) {
	    method10581(anObject8325, 556447813);
	    try {
		aThread8323.join();
	    } catch (InterruptedException interruptedexception) {
		/* empty */
	    }
	    aThread8323 = null;
	}
    }
    
    void method10586(Object object) {
	synchronized (aQueue8326) {
	    aQueue8326.add(object);
	    aQueue8326.notify();
	}
    }
    
    public void method10587() {
	for (;;) {
	    Class646 class646;
	    synchronized (aQueue8326) {
		Object object;
		for (object = aQueue8326.poll(); null == object;
		     object = aQueue8326.poll()) {
		    try {
			aQueue8326.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		}
		if (anObject8325 == object)
		    break;
		class646 = (Class646) object;
	    }
	    int i;
	    try {
		byte[] is
		    = InetAddress.getByName(class646.aString8357).getAddress();
		i = Ping.method680(is[0], is[1], is[2], is[3], 1000L);
	    } catch (Throwable throwable) {
		i = 1000;
	    }
	    class646.anInt8356 = i * -1305597287;
	}
    }
    
    void method10588(Object object) {
	synchronized (aQueue8326) {
	    aQueue8326.add(object);
	    aQueue8326.notify();
	}
    }
    
    void method10589(Object object) {
	synchronized (aQueue8326) {
	    aQueue8326.add(object);
	    aQueue8326.notify();
	}
    }
    
    public Class646 method10590(String string, int i) {
	if (aThread8323 == null)
	    throw new IllegalStateException("");
	if (string == null)
	    throw new IllegalArgumentException("");
	Class646 class646 = new Class646(string);
	method10581(class646, 2103229540);
	return class646;
    }
    
    static final void method10591(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = client.aBool11358 ? 1 : 0;
	class683.anObjectArray8636
	    [(class683.anInt8644 += 1285561025) * 1373599041 - 1]
	    = null == client.aString11117 ? "" : client.aString11117;
	class683.anObjectArray8636
	    [(class683.anInt8644 += 1285561025) * 1373599041 - 1]
	    = client.aString11258 == null ? "" : client.aString11258;
    }
    
    static void method10592(Class656_Sub1_Sub3_Sub1 class656_sub1_sub3_sub1,
			    int i, int i_0_) {
	if (class656_sub1_sub3_sub1.anIntArray11985 != null) {
	    Class684 class684
		= ((Class684)
		   Class539.method8888(Class684.method11241(-1577800303), i,
				       -218878262));
	    int i_1_ = (class656_sub1_sub3_sub1.anIntArray11985
			[class684.method11235(992915526)]);
	    if (i_1_ != class656_sub1_sub3_sub1.aClass689_11987
			    .method14048(-1305469198)) {
		class656_sub1_sub3_sub1.aClass689_11987.method14025
		    (i_1_, class656_sub1_sub3_sub1.aClass689_11987
			       .method14019(-2075420236), (short) 244);
		class656_sub1_sub3_sub1.anInt11970
		    = class656_sub1_sub3_sub1.anInt12015 * 1772857993;
	    }
	}
    }
    
    static final void method10593(Class259 class259, Class245 class245,
				  Class683 class683, int i) {
	String string
	    = (String) (class683.anObjectArray8636
			[(class683.anInt8644 -= 1285561025) * 1373599041]);
	if (Class558.method9375(string, class683, (byte) 3) != null)
	    string = string.substring(0, string.length() - 1);
	class259.anObjectArray2635
	    = Class656_Sub1_Sub5_Sub1.method18727(string, class683,
						  -1847010816);
	class259.aBool2695 = true;
    }
    
    static final void method10594(Class683 class683, int i) {
	long l = Class251.method4508((byte) 8);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = (int) (l / 60000L);
    }
}
