/* Class426 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

public class Class426 implements Interface54
{
    int anInt4795;
    Class178 aClass178_4796;
    Class165 aClass165_4797;
    int anInt4798;
    Class182_Sub1_Sub1 aClass182_Sub1_Sub1_4799;
    long aLong4800;
    
    Class426(Class182_Sub1_Sub1 class182_sub1_sub1, Class165 class165,
	     Class178 class178, int i, int i_0_, int i_1_) {
	aClass182_Sub1_Sub1_4799 = class182_sub1_sub1;
	anInt4795 = i;
	anInt4798 = i_0_;
	aClass165_4797 = class165;
	aClass178_4796 = class178;
	aLong4800
	    = (IDirect3DDevice.CreateRenderTarget
	       (aClass182_Sub1_Sub1_4799.aLong11475, i, i_0_,
		Class182_Sub1_Sub1.method18071(aClass165_4797, aClass178_4796),
		0 + i_1_, 0, false));
	aClass182_Sub1_Sub1_4799.method14863(this);
    }
    
    public int method1() {
	return anInt4795;
    }
    
    public int method80() {
	return anInt4798;
    }
    
    public void method221() {
	if (aLong4800 != 0L) {
	    aClass182_Sub1_Sub1_4799.method18061(aLong4800);
	    aLong4800 = 0L;
	}
    }
    
    public void method127() {
	if (aLong4800 != 0L) {
	    IUnknown.Release(aLong4800);
	    aLong4800 = 0L;
	}
	aClass182_Sub1_Sub1_4799.method14721(this);
    }
    
    public void method349() {
	if (aLong4800 != 0L) {
	    aClass182_Sub1_Sub1_4799.method18061(aLong4800);
	    aLong4800 = 0L;
	}
    }
    
    void method6779() {
	method349();
    }
    
    public int method12() {
	return anInt4795;
    }
    
    public int method57() {
	return anInt4795;
    }
    
    public int method75() {
	return anInt4798;
    }
    
    public long method10() {
	return aLong4800;
    }
    
    void method6780() {
	method349();
    }
    
    public void method125() {
	if (aLong4800 != 0L) {
	    IUnknown.Release(aLong4800);
	    aLong4800 = 0L;
	}
	aClass182_Sub1_Sub1_4799.method14721(this);
    }
    
    public void finalize() {
	method349();
    }
    
    void method6781() {
	method349();
    }
    
    public void method126() {
	if (aLong4800 != 0L) {
	    IUnknown.Release(aLong4800);
	    aLong4800 = 0L;
	}
	aClass182_Sub1_Sub1_4799.method14721(this);
    }
    
    public int method7() {
	return anInt4798;
    }
    
    public long method348() {
	return aLong4800;
    }
    
    public long method347() {
	return aLong4800;
    }
    
    void method6782() {
	method349();
    }
    
    public void method222() {
	if (aLong4800 != 0L) {
	    aClass182_Sub1_Sub1_4799.method18061(aLong4800);
	    aLong4800 = 0L;
	}
    }
}
