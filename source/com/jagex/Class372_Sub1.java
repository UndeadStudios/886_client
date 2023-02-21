/* Class372_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class Class372_Sub1 extends Class372
{
    long aLong10184;
    HashMap aHashMap10185;
    Class381 aClass381_10186;
    Thread aThread10187;
    Thread aThread10188;
    Runnable aRunnable10189;
    volatile boolean aBool10190 = false;
    Runnable aRunnable10191;
    static final float aFloat10192 = 2.0F;
    
    public void method6335(Object object, byte[] is, int i, int i_0_,
			   int i_1_) {
	/* empty */
    }
    
    Object method6345(Class393 class393) {
	return null;
    }
    
    public void method6332(byte i) {
	if (aClass381_10186 != null)
	    aClass381_10186.method6396(-970585964);
	Iterator iterator = aHashMap10185.keySet().iterator();
	while (iterator.hasNext()) {
	    Class477 class477 = (Class477) iterator.next();
	    Class494[] class494s = (Class494[]) aHashMap10185.get(class477);
	    if (!class477.aBool5198) {
		boolean bool = false;
		for (int i_2_ = 0; i_2_ < class494s.length; i_2_++) {
		    class494s[i_2_].method8004(-208455877);
		    bool |= class494s[i_2_].method8093(-1379472965);
		}
		if (bool)
		    Arrays.sort(class494s, new Class162(this));
	    }
	    int i_3_ = 3;
	    boolean bool = false;
	    int i_4_ = class494s.length - 1;
	    while (false == bool) {
		float f = class494s[i_4_].method8019(2121621503);
		Class491 class491 = class494s[i_4_].method8038((byte) 99);
		if (f < 0.0F) {
		    if (Class491.aClass491_5286 == class491
			|| Class491.aClass491_5288 == class491
			|| class491 == Class491.aClass491_5287)
			class494s[i_4_].method8109((byte) -63);
		} else
		    bool = true;
		if (--i_4_ < 0)
		    bool = true;
	    }
	    if (i_4_ >= class494s.length - i_3_) {
		for (/**/; i_4_ >= class494s.length - i_3_; i_4_--) {
		    Class491 class491 = class494s[i_4_].method8038((byte) 88);
		    if (class491 == Class491.aClass491_5286)
			class494s[i_4_].method8109((byte) -9);
		}
	    }
	}
    }
    
    public int method6336(Object object, int i) {
	long l = Class251.method4508((byte) 8);
	int i_5_ = (int) (180000.0F
			  / ((float) (l - aLong10184 * -4548889386835330199L)
			     / 1000.0F));
	aLong10184 = -7086906430210079527L * l;
	return i_5_;
    }
    
    public Object method6333(int i, int i_6_, Class397 class397,
			     Class391 class391, int i_7_, float f, int i_8_) {
	return new Object();
    }
    
    public void method6334(Object object, byte i) {
	/* empty */
    }
    
    public void method6359() {
	HashMap hashmap = method15801((byte) 93);
	synchronized (hashmap) {
	    Iterator iterator = hashmap.keySet().iterator();
	    while (iterator.hasNext()) {
		Class477 class477 = (Class477) iterator.next();
		Class494[] class494s = (Class494[]) hashmap.get(class477);
		for (int i = 0; i < class494s.length; i++) {
		    if (class494s[i].method8038((byte) 108)
			!= Class491.aClass491_5284) {
			class494s[i].method8109((byte) -54);
			class494s[i].method8010(-1430472954);
		    }
		}
	    }
	}
	boolean bool = false;
	while (!bool) {
	    bool = true;
	    synchronized (hashmap) {
		Iterator iterator = hashmap.keySet().iterator();
		while (iterator.hasNext()) {
		    Class477 class477 = (Class477) iterator.next();
		    Class494[] class494s = (Class494[]) hashmap.get(class477);
		    for (int i = 0; i < class494s.length; i++) {
			if (class494s[i].method8038((byte) 93)
			    != Class491.aClass491_5284) {
			    class494s[i].method8004(-208455877);
			    bool = false;
			}
		    }
		}
	    }
	    Class229.method4381(10L);
	}
	aBool10190 = true;
	try {
	    aThread10188.join();
	} catch (InterruptedException interruptedexception) {
	    interruptedexception.printStackTrace();
	}
	try {
	    aThread10187.join();
	} catch (InterruptedException interruptedexception) {
	    interruptedexception.printStackTrace();
	}
    }
    
    HashMap method15798() {
	return aHashMap10185;
    }
    
    Object method6338(Class393 class393, int i) {
	return null;
    }
    
    public Class381 method6342(int i) {
	return aClass381_10186;
    }
    
    public Object method6343(int i, int i_9_, Class397 class397,
			     Class391 class391, int i_10_, float f) {
	return new Object();
    }
    
    public void method6346(Object object) {
	/* empty */
    }
    
    HashMap method15799() {
	return aHashMap10185;
    }
    
    public void method6340(int i) {
	HashMap hashmap = method15801((byte) -18);
	synchronized (hashmap) {
	    Iterator iterator = hashmap.keySet().iterator();
	    while (iterator.hasNext()) {
		Class477 class477 = (Class477) iterator.next();
		Class494[] class494s = (Class494[]) hashmap.get(class477);
		for (int i_11_ = 0; i_11_ < class494s.length; i_11_++) {
		    if (class494s[i_11_].method8038((byte) 102)
			!= Class491.aClass491_5284) {
			class494s[i_11_].method8109((byte) -39);
			class494s[i_11_].method8010(-2041852758);
		    }
		}
	    }
	}
	boolean bool = false;
	while (!bool) {
	    bool = true;
	    synchronized (hashmap) {
		Iterator iterator = hashmap.keySet().iterator();
		while (iterator.hasNext()) {
		    Class477 class477 = (Class477) iterator.next();
		    Class494[] class494s = (Class494[]) hashmap.get(class477);
		    for (int i_12_ = 0; i_12_ < class494s.length; i_12_++) {
			if (class494s[i_12_].method8038((byte) 107)
			    != Class491.aClass491_5284) {
			    class494s[i_12_].method8004(-208455877);
			    bool = false;
			}
		    }
		}
	    }
	    Class229.method4381(10L);
	}
	aBool10190 = true;
	try {
	    aThread10188.join();
	} catch (InterruptedException interruptedexception) {
	    interruptedexception.printStackTrace();
	}
	try {
	    aThread10187.join();
	} catch (InterruptedException interruptedexception) {
	    interruptedexception.printStackTrace();
	}
    }
    
    HashMap method15800() {
	return aHashMap10185;
    }
    
    public void method6357() {
	if (aClass381_10186 != null)
	    aClass381_10186.method6396(1254292221);
	Iterator iterator = aHashMap10185.keySet().iterator();
	while (iterator.hasNext()) {
	    Class477 class477 = (Class477) iterator.next();
	    Class494[] class494s = (Class494[]) aHashMap10185.get(class477);
	    if (!class477.aBool5198) {
		boolean bool = false;
		for (int i = 0; i < class494s.length; i++) {
		    class494s[i].method8004(-208455877);
		    bool |= class494s[i].method8093(-1467887077);
		}
		if (bool)
		    Arrays.sort(class494s, new Class162(this));
	    }
	    int i = 3;
	    boolean bool = false;
	    int i_13_ = class494s.length - 1;
	    while (false == bool) {
		float f = class494s[i_13_].method8019(1848012042);
		Class491 class491 = class494s[i_13_].method8038((byte) 86);
		if (f < 0.0F) {
		    if (Class491.aClass491_5286 == class491
			|| Class491.aClass491_5288 == class491
			|| class491 == Class491.aClass491_5287)
			class494s[i_13_].method8109((byte) -81);
		} else
		    bool = true;
		if (--i_13_ < 0)
		    bool = true;
	    }
	    if (i_13_ >= class494s.length - i) {
		for (/**/; i_13_ >= class494s.length - i; i_13_--) {
		    Class491 class491 = class494s[i_13_].method8038((byte) 85);
		    if (class491 == Class491.aClass491_5286)
			class494s[i_13_].method8109((byte) -84);
		}
	    }
	}
    }
    
    HashMap method15801(byte i) {
	return aHashMap10185;
    }
    
    public Object method6331(int i, int i_14_, Class397 class397,
			     Class391 class391, int i_15_, float f) {
	return new Object();
    }
    
    public Class494 method6356(Class477 class477) {
	synchronized (aHashMap10185) {
	    Class494[] class494s = (Class494[]) aHashMap10185.get(class477);
	    if (class494s == null) {
		Class494 class494 = null;
		return class494;
	    }
	    for (int i = 0; i < class494s.length; i++) {
		Class494 class494 = class494s[i];
		Class491 class491 = class494.method8038((byte) 126);
		if (Class491.aClass491_5284 == class491) {
		    class494.method8043((short) 4682);
		    Class494 class494_16_ = class494;
		    return class494_16_;
		}
	    }
	}
	return null;
    }
    
    public Object method6344(int i, int i_17_, Class397 class397,
			     Class391 class391, int i_18_, float f) {
	return new Object();
    }
    
    public Object method6358(int i, int i_19_, Class397 class397,
			     Class391 class391, int i_20_, float f) {
	return new Object();
    }
    
    public int method6341(Object object) {
	long l = Class251.method4508((byte) 8);
	int i = (int) (180000.0F
		       / ((float) (l - aLong10184 * -4548889386835330199L)
			  / 1000.0F));
	aLong10184 = -7086906430210079527L * l;
	return i;
    }
    
    public void method6339(Object object) {
	/* empty */
    }
    
    public void method6348(Object object) {
	/* empty */
    }
    
    public Class494 method6353(Class477 class477) {
	synchronized (aHashMap10185) {
	    Class494[] class494s = (Class494[]) aHashMap10185.get(class477);
	    if (class494s == null) {
		Class494 class494 = null;
		return class494;
	    }
	    for (int i = 0; i < class494s.length; i++) {
		Class494 class494 = class494s[i];
		Class491 class491 = class494.method8038((byte) 86);
		if (Class491.aClass491_5284 == class491) {
		    class494.method8043((short) 9644);
		    Class494 class494_21_ = class494;
		    return class494_21_;
		}
	    }
	}
	return null;
    }
    
    public Class372_Sub1(Class657 class657) {
	aLong10184 = Class251.method4508((byte) 8) * -7086906430210079527L;
	aRunnable10191 = new Class156(this);
	aRunnable10189 = new Class159(this);
	aClass381_10186 = new Class381(this);
	aHashMap10185 = new HashMap();
	Iterator iterator = class657.aHashMap8439.keySet().iterator();
	while (iterator.hasNext()) {
	    Class477 class477 = (Class477) iterator.next();
	    aHashMap10185.put(class477,
			      (new Class494
			       [((Integer) class657.aHashMap8439.get(class477))
				    .intValue()]));
	}
	iterator = aHashMap10185.keySet().iterator();
	while (iterator.hasNext()) {
	    Class477 class477 = (Class477) iterator.next();
	    Class494[] class494s = (Class494[]) aHashMap10185.get(class477);
	    for (int i = 0; i < class494s.length; i++) {
		Class255 class255 = new Class255(2.0F);
		class255.method314(0, Class397.aClass397_4112,
				   Class391.aClass391_4070, 2);
		class494s[i]
		    = new Class494(class477, 32768, 3, class255, this);
	    }
	}
	aThread10188 = new Thread(aRunnable10189);
	aThread10187 = new Thread(aRunnable10191);
	aThread10188.setPriority(1);
	aThread10187.setPriority(1);
	aThread10188.start();
	aThread10187.start();
    }
    
    HashMap method15802() {
	return aHashMap10185;
    }
    
    public Class494 method6352(Class477 class477) {
	synchronized (aHashMap10185) {
	    Class494[] class494s = (Class494[]) aHashMap10185.get(class477);
	    if (class494s == null) {
		Class494 class494 = null;
		return class494;
	    }
	    for (int i = 0; i < class494s.length; i++) {
		Class494 class494 = class494s[i];
		Class491 class491 = class494.method8038((byte) 125);
		if (Class491.aClass491_5284 == class491) {
		    class494.method8043((short) 2197);
		    Class494 class494_22_ = class494;
		    return class494_22_;
		}
	    }
	}
	return null;
    }
    
    public Class494 method6337(Class477 class477, int i) {
	synchronized (aHashMap10185) {
	    Class494[] class494s = (Class494[]) aHashMap10185.get(class477);
	    if (class494s == null) {
		Class494 class494 = null;
		return class494;
	    }
	    for (int i_23_ = 0; i_23_ < class494s.length; i_23_++) {
		Class494 class494 = class494s[i_23_];
		Class491 class491 = class494.method8038((byte) 126);
		if (Class491.aClass491_5284 == class491) {
		    class494.method8043((short) -26964);
		    Class494 class494_24_ = class494;
		    return class494_24_;
		}
	    }
	}
	return null;
    }
    
    Object method6354(Class393 class393) {
	return null;
    }
    
    Object method6355(Class393 class393) {
	return null;
    }
    
    public void method6349(Object object, byte[] is, int i, int i_25_) {
	/* empty */
    }
    
    public Class381 method6347() {
	return aClass381_10186;
    }
    
    public void method6351() {
	HashMap hashmap = method15801((byte) -54);
	synchronized (hashmap) {
	    Iterator iterator = hashmap.keySet().iterator();
	    while (iterator.hasNext()) {
		Class477 class477 = (Class477) iterator.next();
		Class494[] class494s = (Class494[]) hashmap.get(class477);
		for (int i = 0; i < class494s.length; i++) {
		    if (class494s[i].method8038((byte) 107)
			!= Class491.aClass491_5284) {
			class494s[i].method8109((byte) -112);
			class494s[i].method8010(-1740314185);
		    }
		}
	    }
	}
	boolean bool = false;
	while (!bool) {
	    bool = true;
	    synchronized (hashmap) {
		Iterator iterator = hashmap.keySet().iterator();
		while (iterator.hasNext()) {
		    Class477 class477 = (Class477) iterator.next();
		    Class494[] class494s = (Class494[]) hashmap.get(class477);
		    for (int i = 0; i < class494s.length; i++) {
			if (class494s[i].method8038((byte) 86)
			    != Class491.aClass491_5284) {
			    class494s[i].method8004(-208455877);
			    bool = false;
			}
		    }
		}
	    }
	    Class229.method4381(10L);
	}
	aBool10190 = true;
	try {
	    aThread10188.join();
	} catch (InterruptedException interruptedexception) {
	    interruptedexception.printStackTrace();
	}
	try {
	    aThread10187.join();
	} catch (InterruptedException interruptedexception) {
	    interruptedexception.printStackTrace();
	}
    }
    
    public void method6350(Object object, byte[] is, int i, int i_26_) {
	/* empty */
    }
    
    public static void method15803(int i, int i_27_, int i_28_, boolean bool,
				   int i_29_) {
	Class525_Sub16_Sub6 class525_sub16_sub6
	    = Class556_Sub1.aClass525_Sub16_Sub6_7469;
	Class556_Sub1.method9315(i);
	Class556_Sub1.aBool7475 = false;
	if (class525_sub16_sub6 != Class556_Sub1.aClass525_Sub16_Sub6_7469)
	    Class2.method528(1492001045);
	Class556_Sub1.anInt10619 = -426071613 * i_27_;
	Class556_Sub1.anInt10630 = i_28_ * -1228317553;
	Class556_Sub1.aBool10635 = bool;
    }
}
