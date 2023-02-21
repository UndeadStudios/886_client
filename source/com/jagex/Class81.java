/* Class81 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;

public final class Class81
{
    ReferenceQueue aReferenceQueue846 = new ReferenceQueue();
    WeakReference_Sub1[] aWeakReference_Sub1Array847
	= new WeakReference_Sub1[16];
    int anInt848;
    
    void method1594(int i) {
	for (;;) {
	    WeakReference_Sub1 weakreference_sub1
		= (WeakReference_Sub1) aReferenceQueue846.poll();
	    if (null == weakreference_sub1)
		break;
	    int i_0_ = (-609271085 * weakreference_sub1.anInt11932
			& aWeakReference_Sub1Array847.length - 1);
	    WeakReference_Sub1 weakreference_sub1_1_
		= aWeakReference_Sub1Array847[i_0_];
	    if (weakreference_sub1 == weakreference_sub1_1_) {
		aWeakReference_Sub1Array847[i_0_]
		    = weakreference_sub1.aWeakReference_Sub1_11931;
		anInt848 -= -1754409949;
	    } else {
		for (/**/;
		     (null != weakreference_sub1_1_
		      && (weakreference_sub1_1_.aWeakReference_Sub1_11931
			  != weakreference_sub1));
		     weakreference_sub1_1_
			 = weakreference_sub1_1_.aWeakReference_Sub1_11931) {
		    /* empty */
		}
		if (null != weakreference_sub1_1_) {
		    weakreference_sub1_1_.aWeakReference_Sub1_11931
			= weakreference_sub1.aWeakReference_Sub1_11931;
		    anInt848 -= -1754409949;
		}
	    }
	}
    }
    
    public void method1595(Object object, Object object_2_, int i) {
	if (object == null)
	    throw new NullPointerException();
	method1594(258188125);
	int i_3_ = System.identityHashCode(object);
	int i_4_ = i_3_ & aWeakReference_Sub1Array847.length - 1;
	WeakReference_Sub1 weakreference_sub1
	    = aWeakReference_Sub1Array847[i_4_];
	if (weakreference_sub1 == null) {
	    aWeakReference_Sub1Array847[i_4_]
		= new WeakReference_Sub1(object, aReferenceQueue846, i_3_,
					 object_2_);
	    anInt848 += -1754409949;
	    if (-1638171765 * anInt848 >= aWeakReference_Sub1Array847.length)
		method1598(845391448);
	} else {
	    for (/**/; weakreference_sub1.get() != object;
		 weakreference_sub1
		     = weakreference_sub1.aWeakReference_Sub1_11931) {
		if (weakreference_sub1.aWeakReference_Sub1_11931 == null) {
		    weakreference_sub1.aWeakReference_Sub1_11931
			= new WeakReference_Sub1(object, aReferenceQueue846,
						 i_3_, object_2_);
		    anInt848 += -1754409949;
		    if (-1638171765 * anInt848
			>= aWeakReference_Sub1Array847.length)
			method1598(903494161);
		    break;
		}
	    }
	}
    }
    
    void method1596() {
	for (;;) {
	    WeakReference_Sub1 weakreference_sub1
		= (WeakReference_Sub1) aReferenceQueue846.poll();
	    if (null == weakreference_sub1)
		break;
	    int i = (-609271085 * weakreference_sub1.anInt11932
		     & aWeakReference_Sub1Array847.length - 1);
	    WeakReference_Sub1 weakreference_sub1_5_
		= aWeakReference_Sub1Array847[i];
	    if (weakreference_sub1 == weakreference_sub1_5_) {
		aWeakReference_Sub1Array847[i]
		    = weakreference_sub1.aWeakReference_Sub1_11931;
		anInt848 -= -1754409949;
	    } else {
		for (/**/;
		     (null != weakreference_sub1_5_
		      && (weakreference_sub1_5_.aWeakReference_Sub1_11931
			  != weakreference_sub1));
		     weakreference_sub1_5_
			 = weakreference_sub1_5_.aWeakReference_Sub1_11931) {
		    /* empty */
		}
		if (null != weakreference_sub1_5_) {
		    weakreference_sub1_5_.aWeakReference_Sub1_11931
			= weakreference_sub1.aWeakReference_Sub1_11931;
		    anInt848 -= -1754409949;
		}
	    }
	}
    }
    
    public ArrayList method1597(int i) {
	method1594(258188125);
	ArrayList arraylist = new ArrayList(anInt848 * -1638171765);
	WeakReference_Sub1[] weakreference_sub1s = aWeakReference_Sub1Array847;
	for (int i_6_ = 0; i_6_ < weakreference_sub1s.length; i_6_++) {
	    for (WeakReference_Sub1 weakreference_sub1
		     = weakreference_sub1s[i_6_];
		 null != weakreference_sub1;
		 weakreference_sub1
		     = weakreference_sub1.aWeakReference_Sub1_11931) {
		Object object = weakreference_sub1.get();
		if (object != null)
		    arraylist.add(object);
	    }
	}
	return arraylist;
    }
    
    void method1598(int i) {
	WeakReference_Sub1[] weakreference_sub1s = aWeakReference_Sub1Array847;
	aWeakReference_Sub1Array847
	    = new WeakReference_Sub1[weakreference_sub1s.length * 2];
	WeakReference_Sub1[] weakreference_sub1s_7_ = weakreference_sub1s;
	for (int i_8_ = 0; i_8_ < weakreference_sub1s_7_.length; i_8_++) {
	    WeakReference_Sub1 weakreference_sub1_9_;
	    for (WeakReference_Sub1 weakreference_sub1
		     = weakreference_sub1s_7_[i_8_];
		 null != weakreference_sub1;
		 weakreference_sub1 = weakreference_sub1_9_) {
		weakreference_sub1_9_
		    = weakreference_sub1.aWeakReference_Sub1_11931;
		int i_10_ = (weakreference_sub1.anInt11932 * -609271085
			     & aWeakReference_Sub1Array847.length - 1);
		weakreference_sub1.aWeakReference_Sub1_11931
		    = aWeakReference_Sub1Array847[i_10_];
		aWeakReference_Sub1Array847[i_10_] = weakreference_sub1;
	    }
	}
    }
    
    public void method1599(Object object, int i) {
	if (null == object)
	    throw new NullPointerException();
	method1594(258188125);
	int i_11_ = System.identityHashCode(object);
	int i_12_ = i_11_ & aWeakReference_Sub1Array847.length - 1;
	WeakReference_Sub1 weakreference_sub1
	    = aWeakReference_Sub1Array847[i_12_];
	if (null != weakreference_sub1) {
	    if (weakreference_sub1.get() == object) {
		aWeakReference_Sub1Array847[i_12_]
		    = weakreference_sub1.aWeakReference_Sub1_11931;
		anInt848 -= -1754409949;
	    } else {
		for (;;) {
		    WeakReference_Sub1 weakreference_sub1_13_
			= weakreference_sub1.aWeakReference_Sub1_11931;
		    if (weakreference_sub1_13_ == null)
			break;
		    if (weakreference_sub1_13_.get() == object) {
			weakreference_sub1.aWeakReference_Sub1_11931
			    = weakreference_sub1_13_.aWeakReference_Sub1_11931;
			anInt848 -= -1754409949;
			break;
		    }
		    weakreference_sub1 = weakreference_sub1_13_;
		}
	    }
	}
    }
    
    void method1600() {
	WeakReference_Sub1[] weakreference_sub1s = aWeakReference_Sub1Array847;
	aWeakReference_Sub1Array847
	    = new WeakReference_Sub1[weakreference_sub1s.length * 2];
	WeakReference_Sub1[] weakreference_sub1s_14_ = weakreference_sub1s;
	for (int i = 0; i < weakreference_sub1s_14_.length; i++) {
	    WeakReference_Sub1 weakreference_sub1_15_;
	    for (WeakReference_Sub1 weakreference_sub1
		     = weakreference_sub1s_14_[i];
		 null != weakreference_sub1;
		 weakreference_sub1 = weakreference_sub1_15_) {
		weakreference_sub1_15_
		    = weakreference_sub1.aWeakReference_Sub1_11931;
		int i_16_ = (weakreference_sub1.anInt11932 * -609271085
			     & aWeakReference_Sub1Array847.length - 1);
		weakreference_sub1.aWeakReference_Sub1_11931
		    = aWeakReference_Sub1Array847[i_16_];
		aWeakReference_Sub1Array847[i_16_] = weakreference_sub1;
	    }
	}
    }
}
