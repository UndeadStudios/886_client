/* Class244 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class244
{
    int anInt2418;
    int[] anIntArray2419 = null;
    int[] anIntArray2420;
    int anInt2421;
    int[] anIntArray2422;
    Class255 aClass255_2423;
    int[] anIntArray2424;
    int[] anIntArray2425;
    
    void method4460(Class255 class255) {
	aClass255_2423 = class255;
	int i = aClass255_2423.method4556();
	aClass255_2423.method4550(16);
	anInt2421 = (aClass255_2423.method4570() != 0
		     ? aClass255_2423.method4550(4) + 1 : 1);
	if (aClass255_2423.method4570() != 0) {
	    anInt2418 = aClass255_2423.method4550(8) + 1;
	    if (anIntArray2424 == null || anIntArray2424.length != anInt2418)
		anIntArray2424 = new int[anInt2418];
	    else
		method4461(anIntArray2424);
	    if (anIntArray2425 == null || anIntArray2425.length != anInt2418)
		anIntArray2425 = new int[anInt2418];
	    else
		method4461(anIntArray2425);
	    for (int i_0_ = 0; i_0_ < anInt2418; i_0_++) {
		anIntArray2424[i_0_]
		    = aClass255_2423.method4550(method4467(i - 1));
		anIntArray2425[i_0_]
		    = aClass255_2423.method4550(method4467(i - 1));
	    }
	} else
	    anInt2418 = 0;
	aClass255_2423.method4550(2);
	if (anInt2421 > 1) {
	    anIntArray2419 = new int[i];
	    for (int i_1_ = 0; i_1_ < i; i_1_++)
		anIntArray2419[i_1_] = aClass255_2423.method4550(4);
	}
	if (anIntArray2420 == null || anIntArray2420.length != anInt2421)
	    anIntArray2420 = new int[anInt2421];
	else
	    method4461(anIntArray2420);
	if (anIntArray2422 == null || anIntArray2422.length != anInt2421)
	    anIntArray2422 = new int[anInt2421];
	else
	    method4461(anIntArray2422);
	for (int i_2_ = 0; i_2_ < anInt2421; i_2_++) {
	    aClass255_2423.method4550(8);
	    anIntArray2420[i_2_] = aClass255_2423.method4550(8);
	    anIntArray2422[i_2_] = aClass255_2423.method4550(8);
	}
    }
    
    void method4461(int[] is) {
	if (is != null) {
	    for (int i = 0; i < is.length; i++)
		is[i] = 0;
	}
    }
    
    void method4462(Class255 class255) {
	aClass255_2423 = class255;
	int i = aClass255_2423.method4556();
	aClass255_2423.method4550(16);
	anInt2421 = (aClass255_2423.method4570() != 0
		     ? aClass255_2423.method4550(4) + 1 : 1);
	if (aClass255_2423.method4570() != 0) {
	    anInt2418 = aClass255_2423.method4550(8) + 1;
	    if (anIntArray2424 == null || anIntArray2424.length != anInt2418)
		anIntArray2424 = new int[anInt2418];
	    else
		method4461(anIntArray2424);
	    if (anIntArray2425 == null || anIntArray2425.length != anInt2418)
		anIntArray2425 = new int[anInt2418];
	    else
		method4461(anIntArray2425);
	    for (int i_3_ = 0; i_3_ < anInt2418; i_3_++) {
		anIntArray2424[i_3_]
		    = aClass255_2423.method4550(method4467(i - 1));
		anIntArray2425[i_3_]
		    = aClass255_2423.method4550(method4467(i - 1));
	    }
	} else
	    anInt2418 = 0;
	aClass255_2423.method4550(2);
	if (anInt2421 > 1) {
	    anIntArray2419 = new int[i];
	    for (int i_4_ = 0; i_4_ < i; i_4_++)
		anIntArray2419[i_4_] = aClass255_2423.method4550(4);
	}
	if (anIntArray2420 == null || anIntArray2420.length != anInt2421)
	    anIntArray2420 = new int[anInt2421];
	else
	    method4461(anIntArray2420);
	if (anIntArray2422 == null || anIntArray2422.length != anInt2421)
	    anIntArray2422 = new int[anInt2421];
	else
	    method4461(anIntArray2422);
	for (int i_5_ = 0; i_5_ < anInt2421; i_5_++) {
	    aClass255_2423.method4550(8);
	    anIntArray2420[i_5_] = aClass255_2423.method4550(8);
	    anIntArray2422[i_5_] = aClass255_2423.method4550(8);
	}
    }
    
    Class244() {
	/* empty */
    }
    
    void method4463(int[] is) {
	if (is != null) {
	    for (int i = 0; i < is.length; i++)
		is[i] = 0;
	}
    }
    
    void method4464(int[] is) {
	if (is != null) {
	    for (int i = 0; i < is.length; i++)
		is[i] = 0;
	}
    }
    
    int method4465(int i) {
	int i_6_ = 0;
	for (/**/; i > 0; i >>= 1)
	    i_6_++;
	return i_6_;
    }
    
    void method4466(Class255 class255) {
	aClass255_2423 = class255;
	int i = aClass255_2423.method4556();
	aClass255_2423.method4550(16);
	anInt2421 = (aClass255_2423.method4570() != 0
		     ? aClass255_2423.method4550(4) + 1 : 1);
	if (aClass255_2423.method4570() != 0) {
	    anInt2418 = aClass255_2423.method4550(8) + 1;
	    if (anIntArray2424 == null || anIntArray2424.length != anInt2418)
		anIntArray2424 = new int[anInt2418];
	    else
		method4461(anIntArray2424);
	    if (anIntArray2425 == null || anIntArray2425.length != anInt2418)
		anIntArray2425 = new int[anInt2418];
	    else
		method4461(anIntArray2425);
	    for (int i_7_ = 0; i_7_ < anInt2418; i_7_++) {
		anIntArray2424[i_7_]
		    = aClass255_2423.method4550(method4467(i - 1));
		anIntArray2425[i_7_]
		    = aClass255_2423.method4550(method4467(i - 1));
	    }
	} else
	    anInt2418 = 0;
	aClass255_2423.method4550(2);
	if (anInt2421 > 1) {
	    anIntArray2419 = new int[i];
	    for (int i_8_ = 0; i_8_ < i; i_8_++)
		anIntArray2419[i_8_] = aClass255_2423.method4550(4);
	}
	if (anIntArray2420 == null || anIntArray2420.length != anInt2421)
	    anIntArray2420 = new int[anInt2421];
	else
	    method4461(anIntArray2420);
	if (anIntArray2422 == null || anIntArray2422.length != anInt2421)
	    anIntArray2422 = new int[anInt2421];
	else
	    method4461(anIntArray2422);
	for (int i_9_ = 0; i_9_ < anInt2421; i_9_++) {
	    aClass255_2423.method4550(8);
	    anIntArray2420[i_9_] = aClass255_2423.method4550(8);
	    anIntArray2422[i_9_] = aClass255_2423.method4550(8);
	}
    }
    
    int method4467(int i) {
	int i_10_ = 0;
	for (/**/; i > 0; i >>= 1)
	    i_10_++;
	return i_10_;
    }
    
    void method4468(int[] is) {
	if (is != null) {
	    for (int i = 0; i < is.length; i++)
		is[i] = 0;
	}
    }
    
    void method4469(Class255 class255) {
	aClass255_2423 = class255;
	int i = aClass255_2423.method4556();
	aClass255_2423.method4550(16);
	anInt2421 = (aClass255_2423.method4570() != 0
		     ? aClass255_2423.method4550(4) + 1 : 1);
	if (aClass255_2423.method4570() != 0) {
	    anInt2418 = aClass255_2423.method4550(8) + 1;
	    if (anIntArray2424 == null || anIntArray2424.length != anInt2418)
		anIntArray2424 = new int[anInt2418];
	    else
		method4461(anIntArray2424);
	    if (anIntArray2425 == null || anIntArray2425.length != anInt2418)
		anIntArray2425 = new int[anInt2418];
	    else
		method4461(anIntArray2425);
	    for (int i_11_ = 0; i_11_ < anInt2418; i_11_++) {
		anIntArray2424[i_11_]
		    = aClass255_2423.method4550(method4467(i - 1));
		anIntArray2425[i_11_]
		    = aClass255_2423.method4550(method4467(i - 1));
	    }
	} else
	    anInt2418 = 0;
	aClass255_2423.method4550(2);
	if (anInt2421 > 1) {
	    anIntArray2419 = new int[i];
	    for (int i_12_ = 0; i_12_ < i; i_12_++)
		anIntArray2419[i_12_] = aClass255_2423.method4550(4);
	}
	if (anIntArray2420 == null || anIntArray2420.length != anInt2421)
	    anIntArray2420 = new int[anInt2421];
	else
	    method4461(anIntArray2420);
	if (anIntArray2422 == null || anIntArray2422.length != anInt2421)
	    anIntArray2422 = new int[anInt2421];
	else
	    method4461(anIntArray2422);
	for (int i_13_ = 0; i_13_ < anInt2421; i_13_++) {
	    aClass255_2423.method4550(8);
	    anIntArray2420[i_13_] = aClass255_2423.method4550(8);
	    anIntArray2422[i_13_] = aClass255_2423.method4550(8);
	}
    }
    
    int method4470(int i) {
	int i_14_ = 0;
	for (/**/; i > 0; i >>= 1)
	    i_14_++;
	return i_14_;
    }
}
