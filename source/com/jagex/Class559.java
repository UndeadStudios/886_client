/* Class559 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.IOException;
import java.net.Socket;

public abstract class Class559
{
    public abstract boolean method9376(int i, int i_0_) throws IOException;
    
    public static Class559 method9377(Socket socket, int i)
	throws IOException {
	return new Class559_Sub1(socket, i);
    }
    
    public abstract void method9378(byte i);
    
    public abstract int method9379(byte[] is, int i, int i_1_, byte i_2_)
	throws IOException;
    
    public abstract void method9380(byte[] is, int i, int i_3_, int i_4_)
	throws IOException;
    
    public abstract void method9381(int i);
    
    public abstract void method9382();
    
    public abstract boolean method9383(int i) throws IOException;
    
    public abstract boolean method9384(int i) throws IOException;
    
    public abstract void method9385();
    
    public abstract int method9386() throws IOException;
    
    public abstract int method9387() throws IOException;
    
    public abstract int method9388(byte[] is, int i, int i_5_)
	throws IOException;
    
    public abstract int method9389(byte[] is, int i, int i_6_)
	throws IOException;
    
    public abstract void method9390();
    
    public static Class559 method9391(Socket socket, int i)
	throws IOException {
	return new Class559_Sub1(socket, i);
    }
    
    public abstract void method9392();
    
    public abstract int method9393(int i) throws IOException;
    
    Class559() {
	/* empty */
    }
    
    public abstract void method9394();
    
    public abstract void method9395();
    
    public abstract void method9396(byte[] is, int i, int i_7_)
	throws IOException;
    
    public static Class559 method9397(Socket socket, int i)
	throws IOException {
	return new Class559_Sub1(socket, i);
    }
    
    public abstract int method9398() throws IOException;
    
    static final void method9399(Class683 class683, byte i)
	throws Exception_Sub7 {
	Class453_Sub3.aClass309_Sub1_10316.method5473((byte) 0);
    }
    
    static final void method9400(Class259 class259, Class245 class245,
				 Class683 class683, short i) {
	class259.aString2694
	    = (String) (class683.anObjectArray8636
			[(class683.anInt8644 -= 1285561025) * 1373599041]);
    }
    
    public static final void method9401(byte i) {
	int i_8_ = Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub6_10675
		       .method17028((byte) 44);
	if (i_8_ == 0) {
	    client.aClass507_11137.method8443(null, 501271953);
	    Class89.method1675(0, 1727932959);
	} else if (i_8_ == 1 || i_8_ == 3) {
	    Class453.method7358((byte) 0, 2048498612);
	    Class89.method1675(512, 1779627065);
	    if (client.aClass507_11137.method8358((byte) 76) != null)
		Class525_Sub16_Sub1.method17992((byte) 0);
	} else {
	    Class453.method7358((byte) (client.anInt11267 * -1308155485 - 4
					& 0xff),
				1712887689);
	    Class89.method1675(2, 1608755890);
	}
	client.anInt11065 = -837969325 * Class677.anInt8619;
    }
    
    public static void method9402(int i) {
	synchronized (Class72.aClass200_816) {
	    Class72.aClass200_816.method3791((byte) 74);
	}
    }
}
