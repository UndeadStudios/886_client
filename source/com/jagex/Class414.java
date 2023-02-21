/* Class414 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jagdx.IDirect3DTexture;
import jagdx.IUnknown;

public class Class414 implements Interface54, Interface51
{
    long aLong4408;
    Class419_Sub3_Sub1 aClass419_Sub3_Sub1_4409;
    int anInt4410;
    
    public long method348() {
	if (aLong4408 == 0L)
	    aLong4408
		= IDirect3DTexture.GetSurfaceLevel((aClass419_Sub3_Sub1_4409
						    .aLong4676),
						   anInt4410);
	return aLong4408;
    }
    
    public int method1() {
	return aClass419_Sub3_Sub1_4409.method1();
    }
    
    public int method80() {
	return aClass419_Sub3_Sub1_4409.method80();
    }
    
    public long method10() {
	if (aLong4408 == 0L)
	    aLong4408
		= IDirect3DTexture.GetSurfaceLevel((aClass419_Sub3_Sub1_4409
						    .aLong4676),
						   anInt4410);
	return aLong4408;
    }
    
    public void method127() {
	if (aLong4408 != 0L) {
	    IUnknown.Release(aLong4408);
	    aLong4408 = 0L;
	}
	aClass419_Sub3_Sub1_4409.aClass182_Sub1_Sub1_4673.method14721(this);
    }
    
    void method6690() {
	method349();
    }
    
    public void finalize() {
	method349();
    }
    
    public void method222() {
	if (aLong4408 != 0L) {
	    aClass419_Sub3_Sub1_4409.aClass182_Sub1_Sub1_4673
		.method18061(aLong4408);
	    aLong4408 = 0L;
	}
    }
    
    public int method57() {
	return aClass419_Sub3_Sub1_4409.method1();
    }
    
    public int method75() {
	return aClass419_Sub3_Sub1_4409.method80();
    }
    
    public int method7() {
	return aClass419_Sub3_Sub1_4409.method80();
    }
    
    public void method126() {
	if (aLong4408 != 0L) {
	    IUnknown.Release(aLong4408);
	    aLong4408 = 0L;
	}
	aClass419_Sub3_Sub1_4409.aClass182_Sub1_Sub1_4673.method14721(this);
    }
    
    public void method125() {
	if (aLong4408 != 0L) {
	    IUnknown.Release(aLong4408);
	    aLong4408 = 0L;
	}
	aClass419_Sub3_Sub1_4409.aClass182_Sub1_Sub1_4673.method14721(this);
    }
    
    public void method221() {
	if (aLong4408 != 0L) {
	    aClass419_Sub3_Sub1_4409.aClass182_Sub1_Sub1_4673
		.method18061(aLong4408);
	    aLong4408 = 0L;
	}
    }
    
    void method6691() {
	method349();
    }
    
    void method6692() {
	method349();
    }
    
    void method6693() {
	method349();
    }
    
    Class414(Class419_Sub3_Sub1 class419_sub3_sub1, int i) {
	anInt4410 = i;
	aClass419_Sub3_Sub1_4409 = class419_sub3_sub1;
	aClass419_Sub3_Sub1_4409.aClass182_Sub1_Sub1_4673.method14863(this);
    }
    
    public int method12() {
	return aClass419_Sub3_Sub1_4409.method1();
    }
    
    public void method349() {
	if (aLong4408 != 0L) {
	    aClass419_Sub3_Sub1_4409.aClass182_Sub1_Sub1_4673
		.method18061(aLong4408);
	    aLong4408 = 0L;
	}
    }
    
    public long method347() {
	if (aLong4408 == 0L)
	    aLong4408
		= IDirect3DTexture.GetSurfaceLevel((aClass419_Sub3_Sub1_4409
						    .aLong4676),
						   anInt4410);
	return aLong4408;
    }
}
