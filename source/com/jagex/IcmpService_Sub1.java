/* IcmpService_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import jaclib.ping.IcmpService;

public class IcmpService_Sub1 extends IcmpService
{
    static volatile IcmpService_Sub1 anIcmpService_Sub1_10886;
    List aList10887 = new ArrayList();
    
    protected void method1750(int i, int i_0_, int i_1_) {
	Iterator iterator = aList10887.iterator();
	while (iterator.hasNext()) {
	    Interface74 interface74 = (Interface74) iterator.next();
	    interface74.method503(i, i_0_, i_1_, -576781035);
	}
    }
    
    protected void notify(int i) {
	Iterator iterator = aList10887.iterator();
	while (iterator.hasNext()) {
	    Interface74 interface74 = (Interface74) iterator.next();
	    interface74.method501(0 == i, 1501048927);
	}
    }
    
    protected void notify(int i, int i_2_, int i_3_) {
	Iterator iterator = aList10887.iterator();
	while (iterator.hasNext()) {
	    Interface74 interface74 = (Interface74) iterator.next();
	    interface74.method503(i, i_2_, i_3_, -744746990);
	}
    }
    
    public static void method17007(Interface74 interface74) {
	if (null == anIcmpService_Sub1_10886)
	    throw new IllegalStateException("");
	anIcmpService_Sub1_10886.aList10887.add(interface74);
    }
    
    public static void method17008(Interface74 interface74) {
	if (null == anIcmpService_Sub1_10886)
	    throw new IllegalStateException("");
	anIcmpService_Sub1_10886.aList10887.add(interface74);
    }
    
    public static boolean method17009() {
	do {
	    boolean bool;
	    try {
		if (available())
		    break;
		bool = false;
	    } catch (Throwable throwable) {
		return false;
	    }
	    return bool;
	} while (false);
	if (null != anIcmpService_Sub1_10886)
	    throw new IllegalStateException("");
	anIcmpService_Sub1_10886 = new IcmpService_Sub1();
	Thread thread = new Thread(new Class662());
	thread.setDaemon(true);
	thread.start();
	return true;
    }
    
    protected void method1751(int i, int i_4_, int i_5_) {
	Iterator iterator = aList10887.iterator();
	while (iterator.hasNext()) {
	    Interface74 interface74 = (Interface74) iterator.next();
	    interface74.method503(i, i_4_, i_5_, 1161825349);
	}
    }
    
    public static boolean method17010() {
	do {
	    boolean bool;
	    try {
		if (available())
		    break;
		bool = false;
	    } catch (Throwable throwable) {
		return false;
	    }
	    return bool;
	} while (false);
	if (null != anIcmpService_Sub1_10886)
	    throw new IllegalStateException("");
	anIcmpService_Sub1_10886 = new IcmpService_Sub1();
	Thread thread = new Thread(new Class662());
	thread.setDaemon(true);
	thread.start();
	return true;
    }
    
    public static void method17011(Interface74 interface74) {
	if (null == anIcmpService_Sub1_10886)
	    throw new IllegalStateException("");
	anIcmpService_Sub1_10886.aList10887.add(interface74);
    }
    
    public static void method17012() {
	if (null != anIcmpService_Sub1_10886) {
	    try {
		anIcmpService_Sub1_10886.quit();
	    } catch (Throwable throwable) {
		/* empty */
	    }
	    anIcmpService_Sub1_10886 = null;
	}
    }
    
    public static void method17013() {
	if (null != anIcmpService_Sub1_10886) {
	    try {
		anIcmpService_Sub1_10886.quit();
	    } catch (Throwable throwable) {
		/* empty */
	    }
	    anIcmpService_Sub1_10886 = null;
	}
    }
    
    protected void method1749(int i) {
	Iterator iterator = aList10887.iterator();
	while (iterator.hasNext()) {
	    Interface74 interface74 = (Interface74) iterator.next();
	    interface74.method501(0 == i, -2067582380);
	}
    }
    
    public static void method17014() {
	if (null != anIcmpService_Sub1_10886) {
	    try {
		anIcmpService_Sub1_10886.quit();
	    } catch (Throwable throwable) {
		/* empty */
	    }
	    anIcmpService_Sub1_10886 = null;
	}
    }
    
    IcmpService_Sub1() {
	/* empty */
    }
}
