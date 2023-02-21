/* Class559_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.IOException;
import java.net.Socket;

public class Class559_Sub1 extends Class559
{
    Class555 aClass555_10859;
    Socket aSocket10860;
    Class565 aClass565_10861;
    
    public int method9389(byte[] is, int i, int i_0_) throws IOException {
	return aClass565_10861.method9457(is, i, i_0_, 1516347955);
    }
    
    public boolean method9376(int i, int i_1_) throws IOException {
	return aClass565_10861.method9456(i, -367675814);
    }
    
    Class559_Sub1(Socket socket, int i) throws IOException {
	aSocket10860 = socket;
	aSocket10860.setSoTimeout(30000);
	aSocket10860.setTcpNoDelay(true);
	aSocket10860.setReceiveBufferSize(65536);
	aSocket10860.setSendBufferSize(65536);
	aClass565_10861 = new Class565(aSocket10860.getInputStream(), i);
	aClass555_10859 = new Class555(aSocket10860.getOutputStream(), i);
    }
    
    public int method9379(byte[] is, int i, int i_2_, byte i_3_)
	throws IOException {
	return aClass565_10861.method9457(is, i, i_2_, 1641879481);
    }
    
    public void method9380(byte[] is, int i, int i_4_, int i_5_)
	throws IOException {
	aClass555_10859.method9236(is, i, i_4_, (short) 255);
    }
    
    public void method9381(int i) {
	aClass555_10859.method9227((short) 15613);
	try {
	    aSocket10860.close();
	} catch (IOException ioexception) {
	    /* empty */
	}
	aClass565_10861.method9455(-1057507407);
    }
    
    public void method9394() {
	aClass565_10861.method9459(202107343);
	aClass555_10859.method9228(-803468686);
    }
    
    public void method9396(byte[] is, int i, int i_6_) throws IOException {
	aClass555_10859.method9236(is, i, i_6_, (short) 255);
    }
    
    void method16884() {
	method9381(775319644);
    }
    
    public void method9378(byte i) {
	aClass565_10861.method9459(-2062295739);
	aClass555_10859.method9228(1567230876);
    }
    
    void method16885() {
	method9381(906549609);
    }
    
    void method16886() {
	method9381(1783567923);
    }
    
    public int method9398() throws IOException {
	return aClass565_10861.method9460(-1227002079);
    }
    
    public boolean method9384(int i) throws IOException {
	return aClass565_10861.method9456(i, -1833885724);
    }
    
    public boolean method9383(int i) throws IOException {
	return aClass565_10861.method9456(i, -346151910);
    }
    
    public int method9386() throws IOException {
	return aClass565_10861.method9460(-1227002079);
    }
    
    void method16887() {
	method9381(1127298755);
    }
    
    public int method9388(byte[] is, int i, int i_7_) throws IOException {
	return aClass565_10861.method9457(is, i, i_7_, -471662018);
    }
    
    public void finalize() {
	method9381(1338889404);
    }
    
    public int method9393(int i) throws IOException {
	return aClass565_10861.method9460(-1227002079);
    }
    
    public void method9382() {
	aClass555_10859.method9227((short) 22277);
	try {
	    aSocket10860.close();
	} catch (IOException ioexception) {
	    /* empty */
	}
	aClass565_10861.method9455(1839340195);
    }
    
    public void method9392() {
	aClass555_10859.method9227((short) 18922);
	try {
	    aSocket10860.close();
	} catch (IOException ioexception) {
	    /* empty */
	}
	aClass565_10861.method9455(-798664554);
    }
    
    public void method9390() {
	aClass565_10861.method9459(-1249234553);
	aClass555_10859.method9228(-763406544);
    }
    
    public int method9387() throws IOException {
	return aClass565_10861.method9460(-1227002079);
    }
    
    public void method9385() {
	aClass565_10861.method9459(401945521);
	aClass555_10859.method9228(1994651105);
    }
    
    public void method9395() {
	aClass565_10861.method9459(388521500);
	aClass555_10859.method9228(1129127495);
    }
    
    static final void method16888(Class683 class683, int i) {
	class683.anInt8662 -= 362986067;
	int i_8_ = class683.anIntArray8661[class683.anInt8662 * 501271953];
	int i_9_ = class683.anIntArray8661[1 + class683.anInt8662 * 501271953];
	boolean bool
	    = class683.anIntArray8661[2 + class683.anInt8662 * 501271953] == 1;
	Class624 class624 = Class182_Sub2.aClass228_9503.method4275
				(i_8_, 1632552776).method4152(i_9_, (byte) 91);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = (bool ? class624.method10225(-1346307573)
	       : class624.method10222(-24166875));
    }
}
