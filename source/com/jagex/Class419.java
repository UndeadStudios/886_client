/* Class419 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jagdx.IUnknown;

public abstract class Class419 implements Interface36
{
    boolean aBool4672;
    Class182_Sub1_Sub1 aClass182_Sub1_Sub1_4673;
    Class178 aClass178_4674;
    Class165 aClass165_4675;
    long aLong4676 = 0L;
    
    void method6730() {
	method6732();
    }
    
    public void method278(Class377 class377) {
	/* empty */
    }
    
    public void method271(Class377 class377) {
	/* empty */
    }
    
    public void method127() {
	if (aLong4676 != 0L) {
	    IUnknown.Release(aLong4676);
	    aLong4676 = 0L;
	}
	aClass182_Sub1_Sub1_4673.method14721(this);
    }
    
    public void method272(Class377 class377) {
	/* empty */
    }
    
    public void finalize() {
	method6732();
    }
    
    public void method126() {
	if (aLong4676 != 0L) {
	    IUnknown.Release(aLong4676);
	    aLong4676 = 0L;
	}
	aClass182_Sub1_Sub1_4673.method14721(this);
    }
    
    public void method125() {
	if (aLong4676 != 0L) {
	    IUnknown.Release(aLong4676);
	    aLong4676 = 0L;
	}
	aClass182_Sub1_Sub1_4673.method14721(this);
    }
    
    void method6731() {
	method6732();
    }
    
    void method6732() {
	if (aLong4676 != 0L) {
	    aClass182_Sub1_Sub1_4673.method18061(aLong4676);
	    aLong4676 = 0L;
	}
    }
    
    void method6733() {
	method6732();
    }
    
    void method6734() {
	method6732();
    }
    
    public void method273(Class377 class377) {
	/* empty */
    }
    
    long method6735() {
	return aLong4676;
    }
    
    public void method277(Class377 class377) {
	/* empty */
    }
    
    void method6736() {
	if (aLong4676 != 0L) {
	    aClass182_Sub1_Sub1_4673.method18061(aLong4676);
	    aLong4676 = 0L;
	}
    }
    
    long method6737() {
	return aLong4676;
    }
    
    void method6738() {
	if (aLong4676 != 0L) {
	    aClass182_Sub1_Sub1_4673.method18061(aLong4676);
	    aLong4676 = 0L;
	}
    }
    
    Class419(Class182_Sub1_Sub1 class182_sub1_sub1, Class165 class165,
	     Class178 class178, boolean bool, int i) {
	aClass182_Sub1_Sub1_4673 = class182_sub1_sub1;
	aClass165_4675 = class165;
	aClass178_4674 = class178;
	aBool4672 = bool;
	aClass182_Sub1_Sub1_4673.method14863(this);
    }
}
