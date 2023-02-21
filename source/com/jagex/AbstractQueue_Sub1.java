/* AbstractQueue_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class AbstractQueue_Sub1 extends AbstractQueue
{
    Map aMap11933;
    Comparator aComparator11934;
    Class417[] aClass417Array11935;
    int anInt11936;
    int anInt11937 = 0;
    
    void method18559(int i) {
	Class417 class417 = aClass417Array11935[i];
	int i_0_;
	for (int i_1_ = anInt11936 * 1724898015 >>> 1; i < i_1_; i = i_0_) {
	    int i_2_ = (i << 1) + 1;
	    Class417 class417_3_ = aClass417Array11935[i_2_];
	    int i_4_ = (i << 1) + 2;
	    Class417 class417_5_ = aClass417Array11935[i_4_];
	    if (aComparator11934 != null) {
		if (i_4_ < anInt11936 * 1724898015
		    && aComparator11934.compare(class417_3_.anObject4618,
						class417_5_.anObject4618) > 0)
		    i_0_ = i_4_;
		else
		    i_0_ = i_2_;
	    } else if (i_4_ < anInt11936 * 1724898015
		       && ((Comparable) class417_3_.anObject4618)
			      .compareTo(class417_5_.anObject4618) > 0)
		i_0_ = i_4_;
	    else
		i_0_ = i_2_;
	    if (null != aComparator11934) {
		if (aComparator11934.compare(class417.anObject4618,
					     (aClass417Array11935[i_0_]
					      .anObject4618))
		    <= 0)
		    break;
	    } else if (((Comparable) class417.anObject4618)
			   .compareTo(aClass417Array11935[i_0_].anObject4618)
		       <= 0)
		break;
	    aClass417Array11935[i] = aClass417Array11935[i_0_];
	    aClass417Array11935[i].anInt4619 = -1896934949 * i;
	}
	aClass417Array11935[i] = class417;
	aClass417Array11935[i].anInt4619 = -1896934949 * i;
    }
    
    public AbstractQueue_Sub1(int i, Comparator comparator) {
	aClass417Array11935 = new Class417[i];
	aMap11933 = new HashMap();
	aComparator11934 = comparator;
    }
    
    void method18560(byte i) {
	int i_6_ = 1 + (aClass417Array11935.length << 1);
	aClass417Array11935
	    = (Class417[]) Arrays.copyOf(aClass417Array11935, i_6_);
    }
    
    public int size() {
	return 1724898015 * anInt11936;
    }
    
    public boolean offer(Object object) {
	if (aMap11933.containsKey(object))
	    throw new IllegalArgumentException("");
	anInt11937 += -800261119;
	int i = 1724898015 * anInt11936;
	if (i >= aClass417Array11935.length)
	    method18560((byte) -61);
	anInt11936 += -1210425057;
	if (i == 0) {
	    aClass417Array11935[0] = new Class417(object, 0);
	    aMap11933.put(object, aClass417Array11935[0]);
	} else {
	    aClass417Array11935[i] = new Class417(object, i);
	    aMap11933.put(object, aClass417Array11935[i]);
	    method18561(i, (byte) -3);
	}
	return true;
    }
    
    public Object peek() {
	if (anInt11936 * 1724898015 == 0)
	    return null;
	return aClass417Array11935[0].anObject4618;
    }
    
    public Object poll() {
	if (anInt11936 * 1724898015 == 0)
	    return null;
	anInt11937 += -800261119;
	Object object = aClass417Array11935[0].anObject4618;
	aMap11933.remove(object);
	anInt11936 -= -1210425057;
	if (0 == 1724898015 * anInt11936)
	    aClass417Array11935[1724898015 * anInt11936] = null;
	else {
	    aClass417Array11935[0]
		= aClass417Array11935[anInt11936 * 1724898015];
	    aClass417Array11935[0].anInt4619 = 0;
	    aClass417Array11935[1724898015 * anInt11936] = null;
	    method18585(0, 385866399);
	}
	return object;
    }
    
    public AbstractQueue_Sub1(int i) {
	this(i, null);
    }
    
    void method18561(int i, byte i_7_) {
	Class417 class417 = aClass417Array11935[i];
	int i_8_;
	for (/**/; i > 0; i = i_8_) {
	    i_8_ = i - 1 >>> 1;
	    Class417 class417_9_ = aClass417Array11935[i_8_];
	    if (null != aComparator11934) {
		if (aComparator11934.compare(class417.anObject4618,
					     class417_9_.anObject4618)
		    >= 0)
		    break;
	    } else if (((Comparable) class417.anObject4618)
			   .compareTo(class417_9_.anObject4618)
		       >= 0)
		break;
	    aClass417Array11935[i] = class417_9_;
	    aClass417Array11935[i].anInt4619 = i * -1896934949;
	}
	aClass417Array11935[i] = class417;
	aClass417Array11935[i].anInt4619 = i * -1896934949;
    }
    
    public Iterator method18562() {
	return new Class410(this);
    }
    
    public boolean contains(Object object) {
	return aMap11933.containsKey(object);
    }
    
    public Object[] toArray() {
	Object[] objects = super.toArray();
	if (null != aComparator11934)
	    Arrays.sort(objects, aComparator11934);
	else
	    Arrays.sort(objects);
	return objects;
    }
    
    public Iterator iterator() {
	return new Class410(this);
    }
    
    public Iterator method18563() {
	return new Class410(this);
    }
    
    void method18564() {
	int i = 1 + (aClass417Array11935.length << 1);
	aClass417Array11935
	    = (Class417[]) Arrays.copyOf(aClass417Array11935, i);
    }
    
    public boolean method18565(Object object) {
	if (aMap11933.containsKey(object))
	    throw new IllegalArgumentException("");
	anInt11937 += -800261119;
	int i = 1724898015 * anInt11936;
	if (i >= aClass417Array11935.length)
	    method18560((byte) -83);
	anInt11936 += -1210425057;
	if (i == 0) {
	    aClass417Array11935[0] = new Class417(object, 0);
	    aMap11933.put(object, aClass417Array11935[0]);
	} else {
	    aClass417Array11935[i] = new Class417(object, i);
	    aMap11933.put(object, aClass417Array11935[i]);
	    method18561(i, (byte) -92);
	}
	return true;
    }
    
    void method18566() {
	int i = 1 + (aClass417Array11935.length << 1);
	aClass417Array11935
	    = (Class417[]) Arrays.copyOf(aClass417Array11935, i);
    }
    
    public int method18567() {
	return 1724898015 * anInt11936;
    }
    
    public boolean remove(Object object) {
	Class417 class417 = (Class417) aMap11933.remove(object);
	if (null == class417)
	    return false;
	anInt11937 += -800261119;
	anInt11936 -= -1210425057;
	if (anInt11936 * 1724898015 == class417.anInt4619 * 235176531) {
	    aClass417Array11935[1724898015 * anInt11936] = null;
	    return true;
	}
	Class417 class417_10_ = aClass417Array11935[1724898015 * anInt11936];
	aClass417Array11935[1724898015 * anInt11936] = null;
	aClass417Array11935[235176531 * class417.anInt4619] = class417_10_;
	aClass417Array11935[class417.anInt4619 * 235176531].anInt4619
	    = class417.anInt4619 * 1;
	method18585(class417.anInt4619 * 235176531, 385866399);
	if (class417_10_
	    == aClass417Array11935[class417.anInt4619 * 235176531])
	    method18561(class417.anInt4619 * 235176531, (byte) -6);
	return true;
    }
    
    public int method18568() {
	return 1724898015 * anInt11936;
    }
    
    public boolean method18569(Object object) {
	if (aMap11933.containsKey(object))
	    throw new IllegalArgumentException("");
	anInt11937 += -800261119;
	int i = 1724898015 * anInt11936;
	if (i >= aClass417Array11935.length)
	    method18560((byte) 79);
	anInt11936 += -1210425057;
	if (i == 0) {
	    aClass417Array11935[0] = new Class417(object, 0);
	    aMap11933.put(object, aClass417Array11935[0]);
	} else {
	    aClass417Array11935[i] = new Class417(object, i);
	    aMap11933.put(object, aClass417Array11935[i]);
	    method18561(i, (byte) -52);
	}
	return true;
    }
    
    public boolean method18570(Object object) {
	if (aMap11933.containsKey(object))
	    throw new IllegalArgumentException("");
	anInt11937 += -800261119;
	int i = 1724898015 * anInt11936;
	if (i >= aClass417Array11935.length)
	    method18560((byte) -23);
	anInt11936 += -1210425057;
	if (i == 0) {
	    aClass417Array11935[0] = new Class417(object, 0);
	    aMap11933.put(object, aClass417Array11935[0]);
	} else {
	    aClass417Array11935[i] = new Class417(object, i);
	    aMap11933.put(object, aClass417Array11935[i]);
	    method18561(i, (byte) -20);
	}
	return true;
    }
    
    public Object method18571() {
	if (anInt11936 * 1724898015 == 0)
	    return null;
	anInt11937 += -800261119;
	Object object = aClass417Array11935[0].anObject4618;
	aMap11933.remove(object);
	anInt11936 -= -1210425057;
	if (0 == 1724898015 * anInt11936)
	    aClass417Array11935[1724898015 * anInt11936] = null;
	else {
	    aClass417Array11935[0]
		= aClass417Array11935[anInt11936 * 1724898015];
	    aClass417Array11935[0].anInt4619 = 0;
	    aClass417Array11935[1724898015 * anInt11936] = null;
	    method18585(0, 385866399);
	}
	return object;
    }
    
    public Object method18572() {
	if (anInt11936 * 1724898015 == 0)
	    return null;
	anInt11937 += -800261119;
	Object object = aClass417Array11935[0].anObject4618;
	aMap11933.remove(object);
	anInt11936 -= -1210425057;
	if (0 == 1724898015 * anInt11936)
	    aClass417Array11935[1724898015 * anInt11936] = null;
	else {
	    aClass417Array11935[0]
		= aClass417Array11935[anInt11936 * 1724898015];
	    aClass417Array11935[0].anInt4619 = 0;
	    aClass417Array11935[1724898015 * anInt11936] = null;
	    method18585(0, 385866399);
	}
	return object;
    }
    
    public Object method18573() {
	if (anInt11936 * 1724898015 == 0)
	    return null;
	anInt11937 += -800261119;
	Object object = aClass417Array11935[0].anObject4618;
	aMap11933.remove(object);
	anInt11936 -= -1210425057;
	if (0 == 1724898015 * anInt11936)
	    aClass417Array11935[1724898015 * anInt11936] = null;
	else {
	    aClass417Array11935[0]
		= aClass417Array11935[anInt11936 * 1724898015];
	    aClass417Array11935[0].anInt4619 = 0;
	    aClass417Array11935[1724898015 * anInt11936] = null;
	    method18585(0, 385866399);
	}
	return object;
    }
    
    void method18574(int i) {
	Class417 class417 = aClass417Array11935[i];
	int i_11_;
	for (/**/; i > 0; i = i_11_) {
	    i_11_ = i - 1 >>> 1;
	    Class417 class417_12_ = aClass417Array11935[i_11_];
	    if (null != aComparator11934) {
		if (aComparator11934.compare(class417.anObject4618,
					     class417_12_.anObject4618)
		    >= 0)
		    break;
	    } else if (((Comparable) class417.anObject4618)
			   .compareTo(class417_12_.anObject4618)
		       >= 0)
		break;
	    aClass417Array11935[i] = class417_12_;
	    aClass417Array11935[i].anInt4619 = i * -1896934949;
	}
	aClass417Array11935[i] = class417;
	aClass417Array11935[i].anInt4619 = i * -1896934949;
    }
    
    public int method18575() {
	return 1724898015 * anInt11936;
    }
    
    public Object method18576() {
	if (anInt11936 * 1724898015 == 0)
	    return null;
	anInt11937 += -800261119;
	Object object = aClass417Array11935[0].anObject4618;
	aMap11933.remove(object);
	anInt11936 -= -1210425057;
	if (0 == 1724898015 * anInt11936)
	    aClass417Array11935[1724898015 * anInt11936] = null;
	else {
	    aClass417Array11935[0]
		= aClass417Array11935[anInt11936 * 1724898015];
	    aClass417Array11935[0].anInt4619 = 0;
	    aClass417Array11935[1724898015 * anInt11936] = null;
	    method18585(0, 385866399);
	}
	return object;
    }
    
    public boolean method18577(Object object) {
	Class417 class417 = (Class417) aMap11933.remove(object);
	if (null == class417)
	    return false;
	anInt11937 += -800261119;
	anInt11936 -= -1210425057;
	if (anInt11936 * 1724898015 == class417.anInt4619 * 235176531) {
	    aClass417Array11935[1724898015 * anInt11936] = null;
	    return true;
	}
	Class417 class417_13_ = aClass417Array11935[1724898015 * anInt11936];
	aClass417Array11935[1724898015 * anInt11936] = null;
	aClass417Array11935[235176531 * class417.anInt4619] = class417_13_;
	aClass417Array11935[class417.anInt4619 * 235176531].anInt4619
	    = class417.anInt4619 * 1;
	method18585(class417.anInt4619 * 235176531, 385866399);
	if (class417_13_
	    == aClass417Array11935[class417.anInt4619 * 235176531])
	    method18561(class417.anInt4619 * 235176531, (byte) -95);
	return true;
    }
    
    void method18578(int i) {
	Class417 class417 = aClass417Array11935[i];
	int i_14_;
	for (/**/; i > 0; i = i_14_) {
	    i_14_ = i - 1 >>> 1;
	    Class417 class417_15_ = aClass417Array11935[i_14_];
	    if (null != aComparator11934) {
		if (aComparator11934.compare(class417.anObject4618,
					     class417_15_.anObject4618)
		    >= 0)
		    break;
	    } else if (((Comparable) class417.anObject4618)
			   .compareTo(class417_15_.anObject4618)
		       >= 0)
		break;
	    aClass417Array11935[i] = class417_15_;
	    aClass417Array11935[i].anInt4619 = i * -1896934949;
	}
	aClass417Array11935[i] = class417;
	aClass417Array11935[i].anInt4619 = i * -1896934949;
    }
    
    void method18579(int i) {
	Class417 class417 = aClass417Array11935[i];
	int i_16_;
	for (/**/; i > 0; i = i_16_) {
	    i_16_ = i - 1 >>> 1;
	    Class417 class417_17_ = aClass417Array11935[i_16_];
	    if (null != aComparator11934) {
		if (aComparator11934.compare(class417.anObject4618,
					     class417_17_.anObject4618)
		    >= 0)
		    break;
	    } else if (((Comparable) class417.anObject4618)
			   .compareTo(class417_17_.anObject4618)
		       >= 0)
		break;
	    aClass417Array11935[i] = class417_17_;
	    aClass417Array11935[i].anInt4619 = i * -1896934949;
	}
	aClass417Array11935[i] = class417;
	aClass417Array11935[i].anInt4619 = i * -1896934949;
    }
    
    public Object method18580() {
	if (anInt11936 * 1724898015 == 0)
	    return null;
	anInt11937 += -800261119;
	Object object = aClass417Array11935[0].anObject4618;
	aMap11933.remove(object);
	anInt11936 -= -1210425057;
	if (0 == 1724898015 * anInt11936)
	    aClass417Array11935[1724898015 * anInt11936] = null;
	else {
	    aClass417Array11935[0]
		= aClass417Array11935[anInt11936 * 1724898015];
	    aClass417Array11935[0].anInt4619 = 0;
	    aClass417Array11935[1724898015 * anInt11936] = null;
	    method18585(0, 385866399);
	}
	return object;
    }
    
    void method18581(int i) {
	Class417 class417 = aClass417Array11935[i];
	int i_18_;
	for (int i_19_ = anInt11936 * 1724898015 >>> 1; i < i_19_; i = i_18_) {
	    int i_20_ = (i << 1) + 1;
	    Class417 class417_21_ = aClass417Array11935[i_20_];
	    int i_22_ = (i << 1) + 2;
	    Class417 class417_23_ = aClass417Array11935[i_22_];
	    if (aComparator11934 != null) {
		if (i_22_ < anInt11936 * 1724898015
		    && aComparator11934.compare(class417_21_.anObject4618,
						class417_23_.anObject4618) > 0)
		    i_18_ = i_22_;
		else
		    i_18_ = i_20_;
	    } else if (i_22_ < anInt11936 * 1724898015
		       && ((Comparable) class417_21_.anObject4618)
			      .compareTo(class417_23_.anObject4618) > 0)
		i_18_ = i_22_;
	    else
		i_18_ = i_20_;
	    if (null != aComparator11934) {
		if (aComparator11934.compare(class417.anObject4618,
					     (aClass417Array11935[i_18_]
					      .anObject4618))
		    <= 0)
		    break;
	    } else if (((Comparable) class417.anObject4618)
			   .compareTo(aClass417Array11935[i_18_].anObject4618)
		       <= 0)
		break;
	    aClass417Array11935[i] = aClass417Array11935[i_18_];
	    aClass417Array11935[i].anInt4619 = -1896934949 * i;
	}
	aClass417Array11935[i] = class417;
	aClass417Array11935[i].anInt4619 = -1896934949 * i;
    }
    
    public boolean method18582(Object object) {
	return aMap11933.containsKey(object);
    }
    
    void method18583(int i) {
	Class417 class417 = aClass417Array11935[i];
	int i_24_;
	for (int i_25_ = anInt11936 * 1724898015 >>> 1; i < i_25_; i = i_24_) {
	    int i_26_ = (i << 1) + 1;
	    Class417 class417_27_ = aClass417Array11935[i_26_];
	    int i_28_ = (i << 1) + 2;
	    Class417 class417_29_ = aClass417Array11935[i_28_];
	    if (aComparator11934 != null) {
		if (i_28_ < anInt11936 * 1724898015
		    && aComparator11934.compare(class417_27_.anObject4618,
						class417_29_.anObject4618) > 0)
		    i_24_ = i_28_;
		else
		    i_24_ = i_26_;
	    } else if (i_28_ < anInt11936 * 1724898015
		       && ((Comparable) class417_27_.anObject4618)
			      .compareTo(class417_29_.anObject4618) > 0)
		i_24_ = i_28_;
	    else
		i_24_ = i_26_;
	    if (null != aComparator11934) {
		if (aComparator11934.compare(class417.anObject4618,
					     (aClass417Array11935[i_24_]
					      .anObject4618))
		    <= 0)
		    break;
	    } else if (((Comparable) class417.anObject4618)
			   .compareTo(aClass417Array11935[i_24_].anObject4618)
		       <= 0)
		break;
	    aClass417Array11935[i] = aClass417Array11935[i_24_];
	    aClass417Array11935[i].anInt4619 = -1896934949 * i;
	}
	aClass417Array11935[i] = class417;
	aClass417Array11935[i].anInt4619 = -1896934949 * i;
    }
    
    public boolean method18584(Object object) {
	return aMap11933.containsKey(object);
    }
    
    void method18585(int i, int i_30_) {
	Class417 class417 = aClass417Array11935[i];
	int i_31_;
	for (int i_32_ = anInt11936 * 1724898015 >>> 1; i < i_32_; i = i_31_) {
	    int i_33_ = (i << 1) + 1;
	    Class417 class417_34_ = aClass417Array11935[i_33_];
	    int i_35_ = (i << 1) + 2;
	    Class417 class417_36_ = aClass417Array11935[i_35_];
	    if (aComparator11934 != null) {
		if (i_35_ < anInt11936 * 1724898015
		    && aComparator11934.compare(class417_34_.anObject4618,
						class417_36_.anObject4618) > 0)
		    i_31_ = i_35_;
		else
		    i_31_ = i_33_;
	    } else if (i_35_ < anInt11936 * 1724898015
		       && ((Comparable) class417_34_.anObject4618)
			      .compareTo(class417_36_.anObject4618) > 0)
		i_31_ = i_35_;
	    else
		i_31_ = i_33_;
	    if (null != aComparator11934) {
		if (aComparator11934.compare(class417.anObject4618,
					     (aClass417Array11935[i_31_]
					      .anObject4618))
		    <= 0)
		    break;
	    } else if (((Comparable) class417.anObject4618)
			   .compareTo(aClass417Array11935[i_31_].anObject4618)
		       <= 0)
		break;
	    aClass417Array11935[i] = aClass417Array11935[i_31_];
	    aClass417Array11935[i].anInt4619 = -1896934949 * i;
	}
	aClass417Array11935[i] = class417;
	aClass417Array11935[i].anInt4619 = -1896934949 * i;
    }
    
    public Object[] method18586() {
	Object[] objects = super.toArray();
	if (null != aComparator11934)
	    Arrays.sort(objects, aComparator11934);
	else
	    Arrays.sort(objects);
	return objects;
    }
    
    public Object[] method18587() {
	Object[] objects = super.toArray();
	if (null != aComparator11934)
	    Arrays.sort(objects, aComparator11934);
	else
	    Arrays.sort(objects);
	return objects;
    }
    
    public Object[] method18588() {
	Object[] objects = super.toArray();
	if (null != aComparator11934)
	    Arrays.sort(objects, aComparator11934);
	else
	    Arrays.sort(objects);
	return objects;
    }
    
    public Object[] method18589() {
	Object[] objects = super.toArray();
	if (null != aComparator11934)
	    Arrays.sort(objects, aComparator11934);
	else
	    Arrays.sort(objects);
	return objects;
    }
}
