/* Class54 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

public class Class54 implements Runnable
{
    Queue aQueue557 = new LinkedList();
    volatile boolean aBool558;
    Thread aThread559 = new Thread(this);
    
    public void run() {
	while (!aBool558) {
	    try {
		Class113 class113;
		synchronized (this) {
		    class113 = (Class113) aQueue557.poll();
		    if (null == class113) {
			try {
			    this.wait();
			} catch (InterruptedException interruptedexception) {
			    /* empty */
			}
			continue;
		    }
		}
		try {
		    URLConnection urlconnection
			= class113.anURL1387.openConnection();
		    urlconnection.setConnectTimeout(30000);
		    int i = urlconnection.getContentLength();
		    if (i >= 0) {
			byte[] is = new byte[i];
			new DataInputStream(urlconnection.getInputStream())
			    .readFully(is);
			class113.aByteArray1389 = is;
		    }
		    class113.aBool1388 = true;
		} catch (IOException ioexception) {
		    class113.aBool1388 = true;
		}
	    } catch (Exception exception) {
		Class525_Sub16_Sub13.method18448(null, exception, (byte) 6);
	    }
	}
    }
    
    Class113 method1177(URL url, short i) {
	Class113 class113 = new Class113(url);
	synchronized (this) {
	    aQueue557.add(class113);
	    this.notify();
	}
	return class113;
    }
    
    void method1178(int i) {
	aBool558 = true;
	try {
	    synchronized (this) {
		this.notify();
	    }
	    aThread559.join();
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
    }
    
    Class113 method1179(URL url) {
	Class113 class113 = new Class113(url);
	synchronized (this) {
	    aQueue557.add(class113);
	    this.notify();
	}
	return class113;
    }
    
    public void method1180() {
	while (!aBool558) {
	    try {
		Class113 class113;
		synchronized (this) {
		    class113 = (Class113) aQueue557.poll();
		    if (null == class113) {
			try {
			    this.wait();
			} catch (InterruptedException interruptedexception) {
			    /* empty */
			}
			continue;
		    }
		}
		try {
		    URLConnection urlconnection
			= class113.anURL1387.openConnection();
		    urlconnection.setConnectTimeout(30000);
		    int i = urlconnection.getContentLength();
		    if (i >= 0) {
			byte[] is = new byte[i];
			new DataInputStream(urlconnection.getInputStream())
			    .readFully(is);
			class113.aByteArray1389 = is;
		    }
		    class113.aBool1388 = true;
		} catch (IOException ioexception) {
		    class113.aBool1388 = true;
		}
	    } catch (Exception exception) {
		Class525_Sub16_Sub13.method18448(null, exception, (byte) 6);
	    }
	}
    }
    
    Class54() {
	aThread559.setPriority(1);
	aThread559.start();
    }
    
    Class113 method1181(URL url) {
	Class113 class113 = new Class113(url);
	synchronized (this) {
	    aQueue557.add(class113);
	    this.notify();
	}
	return class113;
    }
    
    void method1182() {
	aBool558 = true;
	try {
	    synchronized (this) {
		this.notify();
	    }
	    aThread559.join();
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
    }
    
    static final void method1183(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = client.aBool11110 ? 1 : 0;
    }
    
    static final void method1184(Class683 class683, short i) {
	if (null != client.aString11074)
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= client.aString11074;
	else
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= "";
    }
    
    static final void method1185(Class683 class683, int i) {
	int i_0_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_0_, -695254952);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = 855530469 * class259.anInt2618;
    }
}
