/* Class49 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.net.InetAddress;
import java.net.UnknownHostException;

import jaclib.ping.Ping;

public class Class49 implements Runnable
{
    String aString369;
    InetAddress anInetAddress370;
    volatile long aLong371 = 48068741891465159L;
    volatile boolean aBool372 = true;
    static int anInt373;
    
    void method1114(int i) {
	aBool372 = false;
    }
    
    void method1115(String string, int i) {
	aString369 = string;
	anInetAddress370 = null;
	aLong371 = 48068741891465159L;
	if (aString369 != null) {
	    try {
		anInetAddress370 = InetAddress.getByName(aString369);
	    } catch (UnknownHostException unknownhostexception) {
		/* empty */
	    }
	}
    }
    
    void method1116(String string) {
	aString369 = string;
	anInetAddress370 = null;
	aLong371 = 48068741891465159L;
	if (aString369 != null) {
	    try {
		anInetAddress370 = InetAddress.getByName(aString369);
	    } catch (UnknownHostException unknownhostexception) {
		/* empty */
	    }
	}
    }
    
    void method1117() {
	if (null != anInetAddress370) {
	    try {
		byte[] is = anInetAddress370.getAddress();
		aLong371 = (long) Ping.method680(is[0], is[1], is[2], is[3],
						 10000L) * -48068741891465159L;
	    } catch (Throwable throwable) {
		/* empty */
	    }
	}
	Class229.method4381(1000L);
    }
    
    public void run() {
	while (aBool372)
	    method1118(1429253007);
    }
    
    void method1118(int i) {
	if (null != anInetAddress370) {
	    try {
		byte[] is = anInetAddress370.getAddress();
		aLong371 = (long) Ping.method680(is[0], is[1], is[2], is[3],
						 10000L) * -48068741891465159L;
	    } catch (Throwable throwable) {
		/* empty */
	    }
	}
	Class229.method4381(1000L);
    }
    
    long method1119(int i) {
	return aLong371 * 318135024369241609L;
    }
    
    void method1120(String string) {
	aString369 = string;
	anInetAddress370 = null;
	aLong371 = 48068741891465159L;
	if (aString369 != null) {
	    try {
		anInetAddress370 = InetAddress.getByName(aString369);
	    } catch (UnknownHostException unknownhostexception) {
		/* empty */
	    }
	}
    }
    
    long method1121() {
	return aLong371 * 318135024369241609L;
    }
    
    void method1122() {
	aBool372 = false;
    }
    
    public void method1123() {
	while (aBool372)
	    method1118(1429253007);
    }
    
    Class49() {
	/* empty */
    }
    
    void method1124() {
	if (null != anInetAddress370) {
	    try {
		byte[] is = anInetAddress370.getAddress();
		aLong371 = (long) Ping.method680(is[0], is[1], is[2], is[3],
						 10000L) * -48068741891465159L;
	    } catch (Throwable throwable) {
		/* empty */
	    }
	}
	Class229.method4381(1000L);
    }
    
    public static Class7 method1125(JS5 class458, int i, int i_0_,
                                    short i_1_) {
	return Class610.method10023(class458, i, i_0_, null, 209080133);
    }
    
    static final void method1126(Class683 class683, int i) {
	int i_2_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	if (-1 == i_2_)
	    Class198_Sub13.aClass525_Sub30_9973.method16502
		(Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub6_10675,
		 Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub6_10692
		     .method17028((byte) 117),
		 (byte) -43);
	else
	    Class198_Sub13.aClass525_Sub30_9973.method16502
		(Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub6_10675,
		 i_2_, (byte) -16);
	Class559.method9401((byte) -66);
    }
}
