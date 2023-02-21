/* Class479 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public final class Class479
{
    long aLong5202;
    Comparator aComparator5203 = new Class464(this);
    Map aMap5204;
    AbstractQueue_Sub1 anAbstractQueue_Sub1_5205;
    AbstractQueue_Sub1 anAbstractQueue_Sub1_5206;
    Class452 aClass452_5207;
    int anInt5208;
    public static String aString5209;
    
    void method7793(Class462 class462, boolean bool) {
	if (!bool) {
	    anAbstractQueue_Sub1_5205.remove(class462);
	    if (method7794(-1396662783)
		&& !anAbstractQueue_Sub1_5206.remove(class462))
		throw new IllegalStateException("");
	}
	class462.aLong5092
	    = System.currentTimeMillis() * -6027345584526481717L;
	if (method7794(-540235524)) {
	    switch (-1600639625 * aClass452_5207.anInt4937) {
	    case 1:
		class462.aLong5091 += -3394645929950097467L;
		break;
	    case 0:
		class462.aLong5091 = class462.aLong5092 * 895181470312071599L;
		break;
	    }
	    anAbstractQueue_Sub1_5206.add(class462);
	}
	anAbstractQueue_Sub1_5205.add(class462);
    }
    
    Class479(long l, int i, Class452 class452) {
	aLong5202 = l * 1465935400093589195L;
	anInt5208 = i * -837831345;
	aClass452_5207 = class452;
	if (-1 == anInt5208 * -609861201) {
	    aMap5204 = new HashMap(64);
	    anAbstractQueue_Sub1_5205
		= new AbstractQueue_Sub1(64, aComparator5203);
	    anAbstractQueue_Sub1_5206 = null;
	} else {
	    if (aClass452_5207 == null)
		throw new IllegalArgumentException("");
	    aMap5204 = new HashMap(anInt5208 * -609861201);
	    anAbstractQueue_Sub1_5205
		= new AbstractQueue_Sub1(anInt5208 * -609861201,
					 aComparator5203);
	    anAbstractQueue_Sub1_5206
		= new AbstractQueue_Sub1(anInt5208 * -609861201);
	}
    }
    
    boolean method7794(int i) {
	return -1 != -609861201 * anInt5208;
    }
    
    void method7795(int i) {
	if (aLong5202 * -2947722206619933L == -1L)
	    throw new IllegalStateException("");
	long l = System.currentTimeMillis() - aLong5202 * -2947722206619933L;
	while (!anAbstractQueue_Sub1_5205.isEmpty()) {
	    Class462 class462 = (Class462) anAbstractQueue_Sub1_5205.peek();
	    if (8772797108211683043L * class462.aLong5092 < l) {
		aMap5204.remove(class462.anObject5094);
		anAbstractQueue_Sub1_5205.remove(class462);
		if (method7794(-935777360))
		    anAbstractQueue_Sub1_5206.remove(class462);
	    } else
		break;
	}
    }
    
    public Object method7796(Object object, Object object_0_, int i) {
	synchronized (this) {
	    if (-2947722206619933L * aLong5202 != -1L)
		method7795(1917224605);
	    Class462 class462 = (Class462) aMap5204.get(object);
	    if (null != class462) {
		Object object_1_ = class462.anObject5093;
		class462.anObject5093 = object_0_;
		method7797(class462, false, 20340977);
		Object object_2_ = object_1_;
		return object_2_;
	    }
	    if (method7794(1032213052)
		&& aMap5204.size() == anInt5208 * -609861201) {
		Class462 class462_3_
		    = (Class462) anAbstractQueue_Sub1_5206.remove();
		aMap5204.remove(class462_3_.anObject5094);
		anAbstractQueue_Sub1_5205.remove(class462_3_);
	    }
	    Class462 class462_4_ = new Class462(object_0_, object);
	    aMap5204.put(object, class462_4_);
	    method7797(class462_4_, true, 20340977);
	    Object object_5_ = null;
	    return object_5_;
	}
    }
    
    void method7797(Class462 class462, boolean bool, int i) {
	if (!bool) {
	    anAbstractQueue_Sub1_5205.remove(class462);
	    if (method7794(-353307888)
		&& !anAbstractQueue_Sub1_5206.remove(class462))
		throw new IllegalStateException("");
	}
	class462.aLong5092
	    = System.currentTimeMillis() * -6027345584526481717L;
	if (method7794(1347577730)) {
	    switch (-1600639625 * aClass452_5207.anInt4937) {
	    case 1:
		class462.aLong5091 += -3394645929950097467L;
		break;
	    case 0:
		class462.aLong5091 = class462.aLong5092 * 895181470312071599L;
		break;
	    }
	    anAbstractQueue_Sub1_5206.add(class462);
	}
	anAbstractQueue_Sub1_5205.add(class462);
    }
    
    public Object method7798(Object object) {
	synchronized (this) {
	    if (-1L != aLong5202 * -2947722206619933L)
		method7795(1792207473);
	    Class462 class462 = (Class462) aMap5204.get(object);
	    if (null == class462) {
		Object object_6_ = null;
		return object_6_;
	    }
	    method7797(class462, false, 20340977);
	    Object object_7_ = class462.anObject5093;
	    return object_7_;
	}
    }
    
    boolean method7799() {
	return -1 != -609861201 * anInt5208;
    }
    
    public Object method7800(Object object, Object object_8_) {
	synchronized (this) {
	    if (-2947722206619933L * aLong5202 != -1L)
		method7795(807572854);
	    Class462 class462 = (Class462) aMap5204.get(object);
	    if (null != class462) {
		Object object_9_ = class462.anObject5093;
		class462.anObject5093 = object_8_;
		method7797(class462, false, 20340977);
		Object object_10_ = object_9_;
		return object_10_;
	    }
	    if (method7794(-987557451)
		&& aMap5204.size() == anInt5208 * -609861201) {
		Class462 class462_11_
		    = (Class462) anAbstractQueue_Sub1_5206.remove();
		aMap5204.remove(class462_11_.anObject5094);
		anAbstractQueue_Sub1_5205.remove(class462_11_);
	    }
	    Class462 class462_12_ = new Class462(object_8_, object);
	    aMap5204.put(object, class462_12_);
	    method7797(class462_12_, true, 20340977);
	    Object object_13_ = null;
	    return object_13_;
	}
    }
    
    public Class479(int i, Class452 class452) {
	this(-1L, i, class452);
    }
    
    void method7801(Class462 class462, boolean bool) {
	if (!bool) {
	    anAbstractQueue_Sub1_5205.remove(class462);
	    if (method7794(-962978429)
		&& !anAbstractQueue_Sub1_5206.remove(class462))
		throw new IllegalStateException("");
	}
	class462.aLong5092
	    = System.currentTimeMillis() * -6027345584526481717L;
	if (method7794(1158746327)) {
	    switch (-1600639625 * aClass452_5207.anInt4937) {
	    case 1:
		class462.aLong5091 += -3394645929950097467L;
		break;
	    case 0:
		class462.aLong5091 = class462.aLong5092 * 895181470312071599L;
		break;
	    }
	    anAbstractQueue_Sub1_5206.add(class462);
	}
	anAbstractQueue_Sub1_5205.add(class462);
    }
    
    public Object method7802(Object object, int i) {
	synchronized (this) {
	    if (-1L != aLong5202 * -2947722206619933L)
		method7795(1097554657);
	    Class462 class462 = (Class462) aMap5204.get(object);
	    if (null == class462) {
		Object object_14_ = null;
		return object_14_;
	    }
	    method7797(class462, false, 20340977);
	    Object object_15_ = class462.anObject5093;
	    return object_15_;
	}
    }
    
    void method7803() {
	if (aLong5202 * -2947722206619933L == -1L)
	    throw new IllegalStateException("");
	long l = System.currentTimeMillis() - aLong5202 * -2947722206619933L;
	while (!anAbstractQueue_Sub1_5205.isEmpty()) {
	    Class462 class462 = (Class462) anAbstractQueue_Sub1_5205.peek();
	    if (8772797108211683043L * class462.aLong5092 < l) {
		aMap5204.remove(class462.anObject5094);
		anAbstractQueue_Sub1_5205.remove(class462);
		if (method7794(-1157146724))
		    anAbstractQueue_Sub1_5206.remove(class462);
	    } else
		break;
	}
    }
    
    static final void method7804(Class683 class683, int i) {
	int i_16_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_16_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_16_ >> 16];
	Class61.method1374(class259, class245, class683, 90205212);
    }
    
    public static void method7805(int i) {
	Class89.aClass709_896 = new Class709();
    }
    
    public static final int method7806(String string, byte i) {
	if (null == string)
	    return -1;
	for (int i_17_ = 0; i_17_ < client.anInt11204 * -883281325; i_17_++) {
	    if (string.equalsIgnoreCase(client.aClass66Array11356[i_17_]
					.aString708))
		return i_17_;
	}
	return -1;
    }
    
    static final void method7807(Class683 class683, int i) {
	class683.anInt8662 -= -1189665054;
	int i_18_ = class683.anIntArray8661[501271953 * class683.anInt8662];
	int i_19_
	    = class683.anIntArray8661[1 + 501271953 * class683.anInt8662];
	if (-1 == i_19_)
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= -1;
	else
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= Class562.aClass471_7557.method7736(i_18_, -135814271)
		      .method18551((char) i_19_, (byte) 113);
    }
}
