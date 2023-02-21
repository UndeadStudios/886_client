/* Class440 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

public class Class440 implements Interface51
{
    Class178 aClass178_4856;
    long aLong4857;
    int anInt4858;
    Class182_Sub1_Sub1 aClass182_Sub1_Sub1_4859;
    int anInt4860;
    
    public int method75() {
	return anInt4860;
    }
    
    public void method127() {
	if (aLong4857 != 0L) {
	    IUnknown.Release(aLong4857);
	    aLong4857 = 0L;
	}
	aClass182_Sub1_Sub1_4859.method14721(this);
    }
    
    public int method1() {
	return anInt4858;
    }
    
    public long method10() {
	return aLong4857;
    }
    
    public void method126() {
	if (aLong4857 != 0L) {
	    IUnknown.Release(aLong4857);
	    aLong4857 = 0L;
	}
	aClass182_Sub1_Sub1_4859.method14721(this);
    }
    
    public int method12() {
	return anInt4858;
    }
    
    public void finalize() {
	method349();
    }
    
    public void method221() {
	if (aLong4857 != 0L) {
	    aClass182_Sub1_Sub1_4859.method18061(aLong4857);
	    aLong4857 = 0L;
	}
    }
    
    public int method57() {
	return anInt4858;
    }
    
    Class440(Class182_Sub1_Sub1 class182_sub1_sub1, Class178 class178, int i,
	     int i_0_, int i_1_) {
	aClass182_Sub1_Sub1_4859 = class182_sub1_sub1;
	anInt4858 = i;
	anInt4860 = i_0_;
	aClass178_4856 = class178;
	aLong4857 = (IDirect3DDevice.CreateDepthStencilSurface
		     (aClass182_Sub1_Sub1_4859.aLong11475, i, i_0_,
		      Class182_Sub1_Sub1.method18059(aClass178_4856), 0 + i_1_,
		      0, false));
	aClass182_Sub1_Sub1_4859.method14863(this);
    }
    
    public int method7() {
	return anInt4860;
    }
    
    void method7112() {
	method349();
    }
    
    public void method125() {
	if (aLong4857 != 0L) {
	    IUnknown.Release(aLong4857);
	    aLong4857 = 0L;
	}
	aClass182_Sub1_Sub1_4859.method14721(this);
    }
    
    void method7113() {
	method349();
    }
    
    void method7114() {
	method349();
    }
    
    public int method80() {
	return anInt4860;
    }
    
    void method7115() {
	method349();
    }
    
    public long method348() {
	return aLong4857;
    }
    
    public long method347() {
	return aLong4857;
    }
    
    public void method349() {
	if (aLong4857 != 0L) {
	    aClass182_Sub1_Sub1_4859.method18061(aLong4857);
	    aLong4857 = 0L;
	}
    }
    
    public void method222() {
	if (aLong4857 != 0L) {
	    aClass182_Sub1_Sub1_4859.method18061(aLong4857);
	    aLong4857 = 0L;
	}
    }
}
