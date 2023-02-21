/* Class525_Sub16_Sub12_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class Class525_Sub16_Sub12_Sub3 extends Class525_Sub16_Sub12
{
    int anInt12206;
    Future aFuture12207;
    
    byte[] method18446() {
	do {
	    if (aFuture12207.isDone()) {
		byte[] is;
		try {
		    is = ((Class465) aFuture12207.get()).method7663(885243121);
		} catch (InterruptedException interruptedexception) {
		    interruptedexception.printStackTrace();
		    break;
		} catch (ExecutionException executionexception) {
		    executionexception.printStackTrace();
		    break;
		}
		return is;
	    }
	} while (false);
	return null;
    }
    
    void method18894(Future future, byte i) {
	aFuture12207 = future;
    }
    
    Class525_Sub16_Sub12_Sub3(int i) {
	anInt12206 = -1203547105 * i;
    }
    
    int method18445(int i) {
	if (null == aFuture12207)
	    return 0;
	return aFuture12207.isDone() ? 100 : 0;
    }
    
    byte[] method18447(int i) {
	do {
	    if (aFuture12207.isDone()) {
		byte[] is;
		try {
		    is = ((Class465) aFuture12207.get()).method7663(885243121);
		} catch (InterruptedException interruptedexception) {
		    interruptedexception.printStackTrace();
		    break;
		} catch (ExecutionException executionexception) {
		    executionexception.printStackTrace();
		    break;
		}
		return is;
	    }
	} while (false);
	return null;
    }
    
    int method18444() {
	if (null == aFuture12207)
	    return 0;
	return aFuture12207.isDone() ? 100 : 0;
    }
    
    void method18895(Future future) {
	aFuture12207 = future;
    }
    
    void method18896(Future future) {
	aFuture12207 = future;
    }
}
