/* Class229 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.ArrayList;
import java.util.List;

public class Class229
{
    List aList2362 = new ArrayList();
    static final int anInt2363 = 5;
    public static Class157[] aClass157Array2364;
    
    public int method4355(Class214 class214) {
	return method4368(class214, -1, (byte) 64);
    }
    
    public Class214 method4356(int i, int i_0_) {
	return (Class214) aList2362.get(i);
    }
    
    public int method4357(int i, int i_1_) {
	for (int i_2_ = 0; i_2_ < aList2362.size(); i_2_++) {
	    if (((Class214) aList2362.get(i_2_)).anInt2278 * 634309281 == i)
		return i_2_;
	}
	return -1;
    }
    
    public int method4358(Class214 class214, int i) {
	return method4368(class214, -1, (byte) 124);
    }
    
    public int method4359(int i) {
	for (int i_3_ = 0; i_3_ < aList2362.size(); i_3_++) {
	    if (((Class214) aList2362.get(i_3_)).anInt2278 * 634309281 == i)
		return i_3_;
	}
	return -1;
    }
    
    public int method4360(int i) {
	return aList2362.size();
    }
    
    public Class214 method4361(int i) {
	return (Class214) aList2362.get(i);
    }
    
    public int method4362() {
	return aList2362.size();
    }
    
    public int method4363(int i) {
	for (int i_4_ = 0; i_4_ < aList2362.size(); i_4_++) {
	    if (((Class214) aList2362.get(i_4_)).anInt2278 * 634309281 == i)
		return i_4_;
	}
	return -1;
    }
    
    public void method4364(int i, int i_5_) {
	aList2362.remove(i);
    }
    
    public int method4365(int i) {
	for (int i_6_ = 0; i_6_ < aList2362.size(); i_6_++) {
	    if (((Class214) aList2362.get(i_6_)).anInt2278 * 634309281 == i)
		return i_6_;
	}
	return -1;
    }
    
    public void method4366(int i) {
	aList2362.clear();
    }
    
    public int method4367(Class214 class214) {
	return method4368(class214, -1, (byte) 65);
    }
    
    public int method4368(Class214 class214, int i, byte i_7_) {
	if (aList2362.size() == 5)
	    throw new RuntimeException("");
	if (method4357(634309281 * class214.anInt2278, 1304421190) != -1)
	    throw new RuntimeException("");
	if (i == -1)
	    i = aList2362.size();
	aList2362.add(i, class214);
	return i;
    }
    
    public int method4369(Class214 class214, int i) {
	if (aList2362.size() == 5)
	    throw new RuntimeException("");
	if (method4357(634309281 * class214.anInt2278, 1304421190) != -1)
	    throw new RuntimeException("");
	if (i == -1)
	    i = aList2362.size();
	aList2362.add(i, class214);
	return i;
    }
    
    public void method4370(int i) {
	aList2362.remove(i);
    }
    
    public void method4371() {
	aList2362.clear();
    }
    
    public void method4372() {
	aList2362.clear();
    }
    
    public void method4373() {
	aList2362.clear();
    }
    
    public void method4374() {
	aList2362.clear();
    }
    
    static final void method4375(Class683 class683, int i) {
	/* empty */
    }
    
    public static Class693 method4376(int i, byte i_8_) {
	Class693[] class693s = Class60.method1234(2090163781);
	for (int i_9_ = 0; i_9_ < class693s.length; i_9_++) {
	    Class693 class693 = class693s[i_9_];
	    if (class693.anInt8754 * -677912137 == i)
		return class693;
	}
	return null;
    }
    
    static boolean method4377(byte i) {
	if (Class69.aProcess733 == null)
	    return false;
	boolean bool;
	try {
	    Class69.aProcess733.exitValue();
	    bool = true;
	} catch (IllegalThreadStateException illegalthreadstateexception) {
	    return false;
	}
	return bool;
    }
    
    static void method4378(long[] ls, Object[] objects, int i, int i_10_,
			   int i_11_) {
	if (i < i_10_) {
	    int i_12_ = (i + i_10_) / 2;
	    int i_13_ = i;
	    long l = ls[i_12_];
	    ls[i_12_] = ls[i_10_];
	    ls[i_10_] = l;
	    Object object = objects[i_12_];
	    objects[i_12_] = objects[i_10_];
	    objects[i_10_] = object;
	    int i_14_ = l == 9223372036854775807L ? 0 : 1;
	    for (int i_15_ = i; i_15_ < i_10_; i_15_++) {
		if (ls[i_15_] < (long) (i_15_ & i_14_) + l) {
		    long l_16_ = ls[i_15_];
		    ls[i_15_] = ls[i_13_];
		    ls[i_13_] = l_16_;
		    Object object_17_ = objects[i_15_];
		    objects[i_15_] = objects[i_13_];
		    objects[i_13_++] = object_17_;
		}
	    }
	    ls[i_10_] = ls[i_13_];
	    ls[i_13_] = l;
	    objects[i_10_] = objects[i_13_];
	    objects[i_13_] = object;
	    method4378(ls, objects, i, i_13_ - 1, 2086677309);
	    method4378(ls, objects, 1 + i_13_, i_10_, 2097404773);
	}
    }
    
    public static void method4379(int i) {
	for (Class525_Sub2 class525_sub2
		 = ((Class525_Sub2)
		    Class525_Sub2.aClass709_10429.method14372((short) -26302));
	     class525_sub2 != null;
	     class525_sub2 = (Class525_Sub2) Class525_Sub2.aClass709_10429
						 .method14353(-1541525128)) {
	    if (class525_sub2.aBool10414)
		class525_sub2.method16073((byte) 1);
	}
	for (Class525_Sub2 class525_sub2
		 = ((Class525_Sub2)
		    Class525_Sub2.aClass709_10411.method14372((short) -1167));
	     class525_sub2 != null;
	     class525_sub2 = (Class525_Sub2) Class525_Sub2.aClass709_10411
						 .method14353(-1482935342)) {
	    if (class525_sub2.aBool10414)
		class525_sub2.method16073((byte) 1);
	}
    }
    
    public static Class276 method4380(int i, int i_18_) {
	if (2082320043 * Class276.aClass276_2870.anInt2874 == i)
	    return Class276.aClass276_2870;
	if (Class276.aClass276_2869.anInt2874 * 2082320043 == i)
	    return Class276.aClass276_2869;
	if (Class276.aClass276_2872.anInt2874 * 2082320043 == i)
	    return Class276.aClass276_2872;
	if (Class276.aClass276_2871.anInt2874 * 2082320043 == i)
	    return Class276.aClass276_2871;
	if (i == Class276.aClass276_2873.anInt2874 * 2082320043)
	    return Class276.aClass276_2873;
	if (2082320043 * Class276.aClass276_2868.anInt2874 == i)
	    return Class276.aClass276_2868;
	return null;
    }
    
    public static final void method4381(long l) {
	if (l > 0L) {
	    if (0L == l % 10L) {
		Class78.method1573(l - 1L);
		Class78.method1573(1L);
	    } else
		Class78.method1573(l);
	}
    }
}
