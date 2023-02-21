/* Class372_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Class372_Sub2 extends Class372
{
    Runnable aRunnable10297;
    List aList10298;
    Class381 aClass381_10299;
    volatile boolean aBool10300 = false;
    Thread aThread10301;
    HashMap aHashMap10302;
    static final float aFloat10303 = 2.0F;
    Runnable aRunnable10304;
    Thread aThread10305;
    
    Class550 method15898(float f) {
	float f_0_ = -1.0F;
	float f_1_ = 3.4028235E38F;
	Class550 class550 = null;
	Iterator iterator = aList10298.iterator();
	while (iterator.hasNext()) {
	    Class550 class550_2_ = (Class550) iterator.next();
	    float f_3_ = class550_2_.aFloat7289;
	    float f_4_ = Math.abs(f_3_ - f);
	    if (f_0_ < 0.0F || f_4_ < f_1_) {
		f_0_ = f_3_;
		f_1_ = f_4_;
		class550 = class550_2_;
	    }
	}
	return class550;
    }
    
    public void method6332(byte i) {
	if (null != aClass381_10299)
	    aClass381_10299.method6396(1365488793);
	Iterator iterator = aHashMap10302.keySet().iterator();
	while (iterator.hasNext()) {
	    Class477 class477 = (Class477) iterator.next();
	    Class494[] class494s = (Class494[]) aHashMap10302.get(class477);
	    if (!class477.aBool5198) {
		boolean bool = false;
		for (int i_5_ = 0; i_5_ < class494s.length; i_5_++) {
		    class494s[i_5_].method8004(-208455877);
		    bool |= class494s[i_5_].method8093(-1848714268);
		}
		if (bool)
		    Arrays.sort(class494s, new Class561(this));
	    }
	    int i_6_ = 6;
	    boolean bool = false;
	    int i_7_ = class494s.length - 1;
	    while (!bool) {
		float f = class494s[i_7_].method8019(1597764943);
		Class491 class491 = class494s[i_7_].method8038((byte) 119);
		if (f < 0.0F) {
		    if (Class491.aClass491_5286 == class491
			|| class491 == Class491.aClass491_5288
			|| class491 == Class491.aClass491_5287)
			class494s[i_7_].method8109((byte) -90);
		} else
		    bool = true;
		if (--i_7_ < 0)
		    bool = true;
	    }
	    if (i_7_ >= class494s.length - i_6_) {
		for (/**/; i_7_ >= class494s.length - i_6_; i_7_--) {
		    Class491 class491 = class494s[i_7_].method8038((byte) 118);
		    if (class491 == Class491.aClass491_5286)
			class494s[i_7_].method8109((byte) -112);
		}
	    }
	}
    }
    
    public Object method6333(int i, int i_8_, Class397 class397,
			     Class391 class391, int i_9_, float f, int i_10_) {
	Class550 class550 = method15899((float) i_8_ * f, (byte) 31);
	Class558 class558
	    = new Class558(this, class550, i_9_, f * (float) i_8_,
			   -1339941795 * class397.anInt4107, i < 2 ? 2 : i,
			   (class397 == Class397.aClass397_4112
			    || Class397.aClass397_4109 == class397),
			   class391 == Class391.aClass391_4071);
	synchronized (class558.aClass550_7536) {
	    class558.aClass550_7536.method9119(class558, 172609283);
	}
	return class558;
    }
    
    public int method6336(Object object, int i) {
	if (object != null && object instanceof Class558) {
	    Class558 class558 = (Class558) object;
	    synchronized (class558.aClass550_7536) {
		int i_11_ = class558.method9367(640534672);
		return i_11_;
	    }
	}
	return 0;
    }
    
    Class550 method15899(float f, byte i) {
	float f_12_ = -1.0F;
	float f_13_ = 3.4028235E38F;
	Class550 class550 = null;
	Iterator iterator = aList10298.iterator();
	while (iterator.hasNext()) {
	    Class550 class550_14_ = (Class550) iterator.next();
	    float f_15_ = class550_14_.aFloat7289;
	    float f_16_ = Math.abs(f_15_ - f);
	    if (f_12_ < 0.0F || f_16_ < f_13_) {
		f_12_ = f_15_;
		f_13_ = f_16_;
		class550 = class550_14_;
	    }
	}
	return class550;
    }
    
    HashMap method15900() {
	return aHashMap10302;
    }
    
    public void method6334(Object object, byte i) {
	if (null != object && object instanceof Class558) {
	    Class558 class558 = (Class558) object;
	    synchronized (class558.aClass550_7536) {
		class558.aClass550_7536.method9123(class558, -886578090);
	    }
	}
    }
    
    public void method6335(Object object, byte[] is, int i, int i_17_,
			   int i_18_) {
	if (object != null && object instanceof Class558) {
	    Class558 class558 = (Class558) object;
	    synchronized (class558.aClass550_7536) {
		class558.method9366(is, i, i_17_, -1013070020);
	    }
	}
    }
    
    public Class494 method6337(Class477 class477, int i) {
	synchronized (aHashMap10302) {
	    Class494[] class494s = (Class494[]) aHashMap10302.get(class477);
	    if (null == class494s) {
		Class494 class494 = null;
		return class494;
	    }
	    for (int i_19_ = 0; i_19_ < class494s.length; i_19_++) {
		Class494 class494 = class494s[i_19_];
		Class491 class491 = class494.method8038((byte) 83);
		if (class491 == Class491.aClass491_5284) {
		    class494.method8043((short) -13061);
		    Class494 class494_20_ = class494;
		    return class494_20_;
		}
	    }
	}
	return null;
    }
    
    Object method6338(Class393 class393, int i) {
	return null;
    }
    
    public Class381 method6342(int i) {
	return aClass381_10299;
    }
    
    public int method6341(Object object) {
	if (object != null && object instanceof Class558) {
	    Class558 class558 = (Class558) object;
	    synchronized (class558.aClass550_7536) {
		int i = class558.method9367(975452422);
		return i;
	    }
	}
	return 0;
    }
    
    public void method6357() {
	if (null != aClass381_10299)
	    aClass381_10299.method6396(1040059669);
	Iterator iterator = aHashMap10302.keySet().iterator();
	while (iterator.hasNext()) {
	    Class477 class477 = (Class477) iterator.next();
	    Class494[] class494s = (Class494[]) aHashMap10302.get(class477);
	    if (!class477.aBool5198) {
		boolean bool = false;
		for (int i = 0; i < class494s.length; i++) {
		    class494s[i].method8004(-208455877);
		    bool |= class494s[i].method8093(-1359050597);
		}
		if (bool)
		    Arrays.sort(class494s, new Class561(this));
	    }
	    int i = 6;
	    boolean bool = false;
	    int i_21_ = class494s.length - 1;
	    while (!bool) {
		float f = class494s[i_21_].method8019(1476624052);
		Class491 class491 = class494s[i_21_].method8038((byte) 101);
		if (f < 0.0F) {
		    if (Class491.aClass491_5286 == class491
			|| class491 == Class491.aClass491_5288
			|| class491 == Class491.aClass491_5287)
			class494s[i_21_].method8109((byte) -110);
		} else
		    bool = true;
		if (--i_21_ < 0)
		    bool = true;
	    }
	    if (i_21_ >= class494s.length - i) {
		for (/**/; i_21_ >= class494s.length - i; i_21_--) {
		    Class491 class491
			= class494s[i_21_].method8038((byte) 108);
		    if (class491 == Class491.aClass491_5286)
			class494s[i_21_].method8109((byte) -34);
		}
	    }
	}
    }
    
    public Object method6344(int i, int i_22_, Class397 class397,
			     Class391 class391, int i_23_, float f) {
	Class550 class550 = method15899((float) i_22_ * f, (byte) 35);
	Class558 class558
	    = new Class558(this, class550, i_23_, f * (float) i_22_,
			   -1339941795 * class397.anInt4107, i < 2 ? 2 : i,
			   (class397 == Class397.aClass397_4112
			    || Class397.aClass397_4109 == class397),
			   class391 == Class391.aClass391_4071);
	synchronized (class558.aClass550_7536) {
	    class558.aClass550_7536.method9119(class558, -91517699);
	}
	return class558;
    }
    
    public Object method6331(int i, int i_24_, Class397 class397,
			     Class391 class391, int i_25_, float f) {
	Class550 class550 = method15899((float) i_24_ * f, (byte) 3);
	Class558 class558
	    = new Class558(this, class550, i_25_, f * (float) i_24_,
			   -1339941795 * class397.anInt4107, i < 2 ? 2 : i,
			   (class397 == Class397.aClass397_4112
			    || Class397.aClass397_4109 == class397),
			   class391 == Class391.aClass391_4071);
	synchronized (class558.aClass550_7536) {
	    class558.aClass550_7536.method9119(class558, 271505998);
	}
	return class558;
    }
    
    public Object method6358(int i, int i_26_, Class397 class397,
			     Class391 class391, int i_27_, float f) {
	Class550 class550 = method15899((float) i_26_ * f, (byte) 16);
	Class558 class558
	    = new Class558(this, class550, i_27_, f * (float) i_26_,
			   -1339941795 * class397.anInt4107, i < 2 ? 2 : i,
			   (class397 == Class397.aClass397_4112
			    || Class397.aClass397_4109 == class397),
			   class391 == Class391.aClass391_4071);
	synchronized (class558.aClass550_7536) {
	    class558.aClass550_7536.method9119(class558, 723016422);
	}
	return class558;
    }
    
    public void method6340(int i) {
	HashMap hashmap = method15902(-2128468997);
	synchronized (hashmap) {
	    Iterator iterator = hashmap.keySet().iterator();
	    while (iterator.hasNext()) {
		Class477 class477 = (Class477) iterator.next();
		Class494[] class494s = (Class494[]) hashmap.get(class477);
		for (int i_28_ = 0; i_28_ < class494s.length; i_28_++) {
		    if (class494s[i_28_].method8038((byte) 125)
			!= Class491.aClass491_5284) {
			class494s[i_28_].method8109((byte) -12);
			class494s[i_28_].method8010(-399900971);
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
		    for (int i_29_ = 0; i_29_ < class494s.length; i_29_++) {
			if (class494s[i_29_].method8038((byte) 107)
			    != Class491.aClass491_5284) {
			    class494s[i_29_].method8004(-208455877);
			    bool = false;
			}
		    }
		}
	    }
	    Class229.method4381(10L);
	}
	aBool10300 = true;
	try {
	    aThread10305.join();
	} catch (InterruptedException interruptedexception) {
	    interruptedexception.printStackTrace();
	}
	try {
	    aThread10301.join();
	} catch (InterruptedException interruptedexception) {
	    interruptedexception.printStackTrace();
	}
    }
    
    public Class494 method6356(Class477 class477) {
	synchronized (aHashMap10302) {
	    Class494[] class494s = (Class494[]) aHashMap10302.get(class477);
	    if (null == class494s) {
		Class494 class494 = null;
		return class494;
	    }
	    for (int i = 0; i < class494s.length; i++) {
		Class494 class494 = class494s[i];
		Class491 class491 = class494.method8038((byte) 113);
		if (class491 == Class491.aClass491_5284) {
		    class494.method8043((short) -8370);
		    Class494 class494_30_ = class494;
		    return class494_30_;
		}
	    }
	}
	return null;
    }
    
    public void method6346(Object object) {
	if (null != object && object instanceof Class558) {
	    Class558 class558 = (Class558) object;
	    synchronized (class558.aClass550_7536) {
		class558.aClass550_7536.method9123(class558, 1179628283);
	    }
	}
    }
    
    public Class372_Sub2(Class657 class657) {
	aList10298 = new ArrayList();
	aRunnable10304 = new Class549(this);
	aRunnable10297 = new Class566(this);
	aClass381_10299 = new Class381(this);
	aHashMap10302 = new HashMap();
	Iterator iterator = class657.aHashMap8439.keySet().iterator();
	while (iterator.hasNext()) {
	    Class477 class477 = (Class477) iterator.next();
	    aHashMap10302.put(class477,
			      (new Class494
			       [((Integer) class657.aHashMap8439.get(class477))
				    .intValue()]));
	}
	iterator = aHashMap10302.keySet().iterator();
	while (iterator.hasNext()) {
	    Class477 class477 = (Class477) iterator.next();
	    Class494[] class494s = (Class494[]) aHashMap10302.get(class477);
	    for (int i = 0; i < class494s.length; i++) {
		Class255 class255 = new Class255(2.0F);
		class255.method314(0, Class397.aClass397_4112,
				   Class391.aClass391_4070, 2);
		class494s[i] = new Class494(class477, 8192, 3, class255, this);
	    }
	}
	Class550 class550 = new Class550(this, 44100.0F, 32768);
	Class550 class550_31_ = new Class550(this, 22050.0F, 16384);
	aList10298.add(class550);
	aList10298.add(class550_31_);
	aThread10305 = new Thread(aRunnable10297);
	aThread10301 = new Thread(aRunnable10304);
	aThread10305.setPriority(10);
	aThread10301.setPriority(10);
	aThread10305.start();
	aThread10301.start();
    }
    
    public void method6348(Object object) {
	if (null != object && object instanceof Class558) {
	    Class558 class558 = (Class558) object;
	    synchronized (class558.aClass550_7536) {
		class558.aClass550_7536.method9123(class558, -1039878146);
	    }
	}
    }
    
    public void method6349(Object object, byte[] is, int i, int i_32_) {
	if (object != null && object instanceof Class558) {
	    Class558 class558 = (Class558) object;
	    synchronized (class558.aClass550_7536) {
		class558.method9366(is, i, i_32_, -1013070020);
	    }
	}
    }
    
    public void method6350(Object object, byte[] is, int i, int i_33_) {
	if (object != null && object instanceof Class558) {
	    Class558 class558 = (Class558) object;
	    synchronized (class558.aClass550_7536) {
		class558.method9366(is, i, i_33_, -1013070020);
	    }
	}
    }
    
    public Object method6343(int i, int i_34_, Class397 class397,
			     Class391 class391, int i_35_, float f) {
	Class550 class550 = method15899((float) i_34_ * f, (byte) 27);
	Class558 class558
	    = new Class558(this, class550, i_35_, f * (float) i_34_,
			   -1339941795 * class397.anInt4107, i < 2 ? 2 : i,
			   (class397 == Class397.aClass397_4112
			    || Class397.aClass397_4109 == class397),
			   class391 == Class391.aClass391_4071);
	synchronized (class558.aClass550_7536) {
	    class558.aClass550_7536.method9119(class558, 1850029739);
	}
	return class558;
    }
    
    public Class494 method6352(Class477 class477) {
	synchronized (aHashMap10302) {
	    Class494[] class494s = (Class494[]) aHashMap10302.get(class477);
	    if (null == class494s) {
		Class494 class494 = null;
		return class494;
	    }
	    for (int i = 0; i < class494s.length; i++) {
		Class494 class494 = class494s[i];
		Class491 class491 = class494.method8038((byte) 126);
		if (class491 == Class491.aClass491_5284) {
		    class494.method8043((short) -21703);
		    Class494 class494_36_ = class494;
		    return class494_36_;
		}
	    }
	}
	return null;
    }
    
    public Class494 method6353(Class477 class477) {
	synchronized (aHashMap10302) {
	    Class494[] class494s = (Class494[]) aHashMap10302.get(class477);
	    if (null == class494s) {
		Class494 class494 = null;
		return class494;
	    }
	    for (int i = 0; i < class494s.length; i++) {
		Class494 class494 = class494s[i];
		Class491 class491 = class494.method8038((byte) 92);
		if (class491 == Class491.aClass491_5284) {
		    class494.method8043((short) -4536);
		    Class494 class494_37_ = class494;
		    return class494_37_;
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
    
    Object method6345(Class393 class393) {
	return null;
    }
    
    public Class381 method6347() {
	return aClass381_10299;
    }
    
    public void method6351() {
	HashMap hashmap = method15902(-2105607010);
	synchronized (hashmap) {
	    Iterator iterator = hashmap.keySet().iterator();
	    while (iterator.hasNext()) {
		Class477 class477 = (Class477) iterator.next();
		Class494[] class494s = (Class494[]) hashmap.get(class477);
		for (int i = 0; i < class494s.length; i++) {
		    if (class494s[i].method8038((byte) 122)
			!= Class491.aClass491_5284) {
			class494s[i].method8109((byte) -19);
			class494s[i].method8010(683266895);
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
			if (class494s[i].method8038((byte) 102)
			    != Class491.aClass491_5284) {
			    class494s[i].method8004(-208455877);
			    bool = false;
			}
		    }
		}
	    }
	    Class229.method4381(10L);
	}
	aBool10300 = true;
	try {
	    aThread10305.join();
	} catch (InterruptedException interruptedexception) {
	    interruptedexception.printStackTrace();
	}
	try {
	    aThread10301.join();
	} catch (InterruptedException interruptedexception) {
	    interruptedexception.printStackTrace();
	}
    }
    
    public void method6359() {
	HashMap hashmap = method15902(-2134290909);
	synchronized (hashmap) {
	    Iterator iterator = hashmap.keySet().iterator();
	    while (iterator.hasNext()) {
		Class477 class477 = (Class477) iterator.next();
		Class494[] class494s = (Class494[]) hashmap.get(class477);
		for (int i = 0; i < class494s.length; i++) {
		    if (class494s[i].method8038((byte) 93)
			!= Class491.aClass491_5284) {
			class494s[i].method8109((byte) -125);
			class494s[i].method8010(239215490);
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
			if (class494s[i].method8038((byte) 103)
			    != Class491.aClass491_5284) {
			    class494s[i].method8004(-208455877);
			    bool = false;
			}
		    }
		}
	    }
	    Class229.method4381(10L);
	}
	aBool10300 = true;
	try {
	    aThread10305.join();
	} catch (InterruptedException interruptedexception) {
	    interruptedexception.printStackTrace();
	}
	try {
	    aThread10301.join();
	} catch (InterruptedException interruptedexception) {
	    interruptedexception.printStackTrace();
	}
    }
    
    public void method6339(Object object) {
	if (null != object && object instanceof Class558) {
	    Class558 class558 = (Class558) object;
	    synchronized (class558.aClass550_7536) {
		class558.aClass550_7536.method9123(class558, -1095775080);
	    }
	}
    }
    
    HashMap method15901() {
	return aHashMap10302;
    }
    
    HashMap method15902(int i) {
	return aHashMap10302;
    }
    
    Class550 method15903(float f) {
	float f_38_ = -1.0F;
	float f_39_ = 3.4028235E38F;
	Class550 class550 = null;
	Iterator iterator = aList10298.iterator();
	while (iterator.hasNext()) {
	    Class550 class550_40_ = (Class550) iterator.next();
	    float f_41_ = class550_40_.aFloat7289;
	    float f_42_ = Math.abs(f_41_ - f);
	    if (f_38_ < 0.0F || f_42_ < f_39_) {
		f_38_ = f_41_;
		f_39_ = f_42_;
		class550 = class550_40_;
	    }
	}
	return class550;
    }
    
    static boolean method15904(int i) {
	return Class116.aBool1409;
    }
}
