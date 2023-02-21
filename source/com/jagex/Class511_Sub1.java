/* Class511_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaclib.nanotime.QueryPerformanceCounter;

public class Class511_Sub1 extends Class511
{
    long aLong10382;
    long aLong10383;
    long aLong10384 = 0L;
    long[] aLongArray10385;
    int anInt10386;
    int anInt10387;
    
    int method8519(long l) {
	if (-8679522229171309393L * aLong10382
	    > -2950840832594970295L * aLong10384) {
	    aLong10383 += (-7570638939109885051L * aLong10382
			   - aLong10384 * 2901136409541197347L);
	    aLong10384 += 21028588330087991L * aLong10382 - aLong10384 * 1L;
	    aLong10382 += -361776980792401329L * l;
	    return 1;
	}
	int i = 0;
	do {
	    i++;
	    aLong10382 += l * -361776980792401329L;
	} while (i < 10 && (-8679522229171309393L * aLong10382
			    < aLong10384 * -2950840832594970295L));
	if (-8679522229171309393L * aLong10382
	    < aLong10384 * -2950840832594970295L)
	    aLong10382 = -4088128351853305977L * aLong10384;
	return i;
    }
    
    void method8509(int i) {
	aLong10383 = 0L;
	if (aLong10382 * -8679522229171309393L
	    > aLong10384 * -2950840832594970295L)
	    aLong10384 += 21028588330087991L * aLong10382 - aLong10384 * 1L;
    }
    
    long method8512(byte i) {
	return aLong10384 * -2950840832594970295L;
    }
    
    long method16047() {
	long l = QueryPerformanceCounter.nanoTime();
	long l_0_ = l - -3932724649096445021L * aLong10383;
	aLong10383 = l * -3300628880346888181L;
	if (l_0_ > -5000000000L && l_0_ < 5000000000L) {
	    aLongArray10385[anInt10386 * -2035409697] = l_0_;
	    anInt10386 = (anInt10386 * -2035409697 + 1) % 10 * -1769693409;
	    if (-682195269 * anInt10387 < 1)
		anInt10387 += -852111757;
	}
	long l_1_ = 0L;
	for (int i = 1; i <= anInt10387 * -682195269; i++)
	    l_1_
		+= aLongArray10385[(10 + (anInt10386 * -2035409697 - i)) % 10];
	return l_1_ / (long) (anInt10387 * -682195269);
    }
    
    Class511_Sub1() {
	aLong10382 = 0L;
	aLong10383 = 0L;
	aLongArray10385 = new long[10];
	anInt10386 = 0;
	anInt10387 = -852111757;
	aLong10382
	    = ((aLong10384
		= QueryPerformanceCounter.nanoTime() * -7979453722459846407L)
	       * -4088128351853305977L);
	if (-2950840832594970295L * aLong10384 == 0L)
	    throw new RuntimeException();
    }
    
    long method16048(int i) {
	long l = QueryPerformanceCounter.nanoTime();
	long l_2_ = l - -3932724649096445021L * aLong10383;
	aLong10383 = l * -3300628880346888181L;
	if (l_2_ > -5000000000L && l_2_ < 5000000000L) {
	    aLongArray10385[anInt10386 * -2035409697] = l_2_;
	    anInt10386 = (anInt10386 * -2035409697 + 1) % 10 * -1769693409;
	    if (-682195269 * anInt10387 < 1)
		anInt10387 += -852111757;
	}
	long l_3_ = 0L;
	for (int i_4_ = 1; i_4_ <= anInt10387 * -682195269; i_4_++)
	    l_3_ += (aLongArray10385
		     [(10 + (anInt10386 * -2035409697 - i_4_)) % 10]);
	return l_3_ / (long) (anInt10387 * -682195269);
    }
    
    void method8521() {
	aLong10383 = 0L;
	if (aLong10382 * -8679522229171309393L
	    > aLong10384 * -2950840832594970295L)
	    aLong10384 += 21028588330087991L * aLong10382 - aLong10384 * 1L;
    }
    
    long method8514() {
	aLong10384 += method16048(1647918271) * -7979453722459846407L;
	if (-8679522229171309393L * aLong10382
	    > aLong10384 * -2950840832594970295L)
	    return ((-8679522229171309393L * aLong10382
		     - -2950840832594970295L * aLong10384)
		    / 1000000L);
	return 0L;
    }
    
    long method8515() {
	aLong10384 += method16048(1647918271) * -7979453722459846407L;
	if (-8679522229171309393L * aLong10382
	    > aLong10384 * -2950840832594970295L)
	    return ((-8679522229171309393L * aLong10382
		     - -2950840832594970295L * aLong10384)
		    / 1000000L);
	return 0L;
    }
    
    long method8516() {
	aLong10384 += method16048(1647918271) * -7979453722459846407L;
	if (-8679522229171309393L * aLong10382
	    > aLong10384 * -2950840832594970295L)
	    return ((-8679522229171309393L * aLong10382
		     - -2950840832594970295L * aLong10384)
		    / 1000000L);
	return 0L;
    }
    
    int method8518(long l) {
	if (-8679522229171309393L * aLong10382
	    > -2950840832594970295L * aLong10384) {
	    aLong10383 += (-7570638939109885051L * aLong10382
			   - aLong10384 * 2901136409541197347L);
	    aLong10384 += 21028588330087991L * aLong10382 - aLong10384 * 1L;
	    aLong10382 += -361776980792401329L * l;
	    return 1;
	}
	int i = 0;
	do {
	    i++;
	    aLong10382 += l * -361776980792401329L;
	} while (i < 10 && (-8679522229171309393L * aLong10382
			    < aLong10384 * -2950840832594970295L));
	if (-8679522229171309393L * aLong10382
	    < aLong10384 * -2950840832594970295L)
	    aLong10382 = -4088128351853305977L * aLong10384;
	return i;
    }
    
    int method8520(long l) {
	if (-8679522229171309393L * aLong10382
	    > -2950840832594970295L * aLong10384) {
	    aLong10383 += (-7570638939109885051L * aLong10382
			   - aLong10384 * 2901136409541197347L);
	    aLong10384 += 21028588330087991L * aLong10382 - aLong10384 * 1L;
	    aLong10382 += -361776980792401329L * l;
	    return 1;
	}
	int i = 0;
	do {
	    i++;
	    aLong10382 += l * -361776980792401329L;
	} while (i < 10 && (-8679522229171309393L * aLong10382
			    < aLong10384 * -2950840832594970295L));
	if (-8679522229171309393L * aLong10382
	    < aLong10384 * -2950840832594970295L)
	    aLong10382 = -4088128351853305977L * aLong10384;
	return i;
    }
    
    long method8507() {
	return aLong10384 * -2950840832594970295L;
    }
    
    long method16049() {
	long l = QueryPerformanceCounter.nanoTime();
	long l_5_ = l - -3932724649096445021L * aLong10383;
	aLong10383 = l * -3300628880346888181L;
	if (l_5_ > -5000000000L && l_5_ < 5000000000L) {
	    aLongArray10385[anInt10386 * -2035409697] = l_5_;
	    anInt10386 = (anInt10386 * -2035409697 + 1) % 10 * -1769693409;
	    if (-682195269 * anInt10387 < 1)
		anInt10387 += -852111757;
	}
	long l_6_ = 0L;
	for (int i = 1; i <= anInt10387 * -682195269; i++)
	    l_6_
		+= aLongArray10385[(10 + (anInt10386 * -2035409697 - i)) % 10];
	return l_6_ / (long) (anInt10387 * -682195269);
    }
    
    long method8510(int i) {
	aLong10384 += method16048(1647918271) * -7979453722459846407L;
	if (-8679522229171309393L * aLong10382
	    > aLong10384 * -2950840832594970295L)
	    return ((-8679522229171309393L * aLong10382
		     - -2950840832594970295L * aLong10384)
		    / 1000000L);
	return 0L;
    }
}
