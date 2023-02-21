/* Class168_Sub1_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Canvas;

import jagdx.Class361;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DSwapChain;
import jagdx.IUnknown;

public class Class168_Sub1_Sub2_Sub1 extends Class168_Sub1_Sub2
    implements Interface52
{
    Canvas aCanvas12073;
    Class182_Sub1_Sub1 aClass182_Sub1_Sub1_12074;
    long aLong12075;
    long aLong12076;
    boolean aBool12077;
    int anInt12078;
    int anInt12079;
    boolean aBool12080 = false;
    long aLong12081;
    D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS12082;
    
    void method14605(int i, int i_0_) {
	method127();
	anInt12078 = i;
	anInt12079 = i_0_;
	if (aBool12077)
	    aClass182_Sub1_Sub1_12074.method18064(anInt12078, anInt12079);
	method217();
	super.method14605(i, i_0_);
    }
    
    public int method14611(int i, int i_1_) {
	return IDirect3DSwapChain.Present(aLong12075, 0);
    }
    
    public int method2710() {
	return anInt12078;
    }
    
    public int method2711() {
	return anInt12079;
    }
    
    public int method2714() {
	return anInt12079;
    }
    
    public int method14608() {
	return IDirect3DSwapChain.Present(aLong12075, 0);
    }
    
    public int method14606() {
	return IDirect3DSwapChain.Present(aLong12075, 0);
    }
    
    Class168_Sub1_Sub2_Sub1(Class182_Sub1_Sub1 class182_sub1_sub1,
			    Canvas canvas, int i, int i_2_, boolean bool) {
	super(class182_sub1_sub1);
	aBool12077 = false;
	aCanvas12073 = canvas;
	aClass182_Sub1_Sub1_12074 = class182_sub1_sub1;
	anInt12078 = i;
	anInt12079 = i_2_;
	aBool12077 = bool;
	method217();
    }
    
    boolean method2715() {
	aBool12080 = false;
	return Class361.method6305(IDirect3DDevice.SetDepthStencilSurface
				   (aClass182_Sub1_Sub1_12074.aLong11475, 0L));
    }
    
    public void method127() {
	if (aLong12081 != 0L) {
	    IUnknown.Release(aLong12081);
	    aLong12081 = 0L;
	}
	if (aLong12076 != 0L) {
	    IUnknown.Release(aLong12076);
	    aLong12076 = 0L;
	}
	if (aLong12075 != 0L) {
	    IUnknown.Release(aLong12075);
	    aLong12075 = 0L;
	}
	aClass182_Sub1_Sub1_12074.method18048(this);
    }
    
    void method18733() {
	if (aLong12081 != 0L) {
	    IUnknown.Release(aLong12081);
	    aLong12081 = 0L;
	}
	if (aLong12076 != 0L) {
	    IUnknown.Release(aLong12076);
	    aLong12076 = 0L;
	}
	if (aLong12075 != 0L) {
	    IUnknown.Release(aLong12075);
	    aLong12075 = 0L;
	}
	aClass182_Sub1_Sub1_12074.method18048(this);
    }
    
    public void method217() {
	if (aLong12075 == 0L) {
	    aD3DPRESENT_PARAMETERS12082
		= new D3DPRESENT_PARAMETERS(aCanvas12073);
	    aD3DPRESENT_PARAMETERS12082.Windowed = true;
	    aD3DPRESENT_PARAMETERS12082.BackBufferCount = 1;
	    aD3DPRESENT_PARAMETERS12082.PresentationInterval = -2147483648;
	    aD3DPRESENT_PARAMETERS12082.BackBufferWidth = anInt12078;
	    aD3DPRESENT_PARAMETERS12082.BackBufferHeight = anInt12079;
	    if (aBool12077) {
		aLong12075
		    = IDirect3DDevice.GetSwapChain((aClass182_Sub1_Sub1_12074
						    .aLong11475),
						   0);
		aLong12081
		    = IDirect3DSwapChain.GetBackBuffer(aLong12075, 0, 0);
		aLong12076 = (IDirect3DDevice.GetDepthStencilSurface
			      (aClass182_Sub1_Sub1_12074.aLong11475));
	    } else {
		if (!Class182_Sub1_Sub1.method18062
		     (aClass182_Sub1_Sub1_12074.anInt11452,
		      aClass182_Sub1_Sub1_12074.anInt11439,
		      aClass182_Sub1_Sub1_12074.aLong11441,
		      aClass182_Sub1_Sub1_12074.anInt9294,
		      aClass182_Sub1_Sub1_12074.aD3DDISPLAYMODE11443,
		      aD3DPRESENT_PARAMETERS12082))
		    throw new RuntimeException();
		int i = aD3DPRESENT_PARAMETERS12082.AutoDepthStencilFormat;
		aLong12075 = (IDirect3DDevice.CreateAdditionalSwapChain
			      (aClass182_Sub1_Sub1_12074.aLong11475,
			       aD3DPRESENT_PARAMETERS12082));
		aLong12081
		    = IDirect3DSwapChain.GetBackBuffer(aLong12075, 0, 0);
		aLong12076 = (IDirect3DDevice.CreateDepthStencilSurface
			      (aClass182_Sub1_Sub1_12074.aLong11475,
			       anInt12078, anInt12079, i,
			       aD3DPRESENT_PARAMETERS12082.MultiSampleType,
			       aD3DPRESENT_PARAMETERS12082.MultiSampleQuality,
			       false));
	    }
	    aClass182_Sub1_Sub1_12074.method18067(this);
	}
	if (aBool12080)
	    method350();
    }
    
    boolean method2709() {
	aBool12080 = false;
	return Class361.method6305(IDirect3DDevice.SetDepthStencilSurface
				   (aClass182_Sub1_Sub1_12074.aLong11475, 0L));
    }
    
    public int method2716() {
	return anInt12078;
    }
    
    public void method353() {
	if (aLong12075 == 0L) {
	    aD3DPRESENT_PARAMETERS12082
		= new D3DPRESENT_PARAMETERS(aCanvas12073);
	    aD3DPRESENT_PARAMETERS12082.Windowed = true;
	    aD3DPRESENT_PARAMETERS12082.BackBufferCount = 1;
	    aD3DPRESENT_PARAMETERS12082.PresentationInterval = -2147483648;
	    aD3DPRESENT_PARAMETERS12082.BackBufferWidth = anInt12078;
	    aD3DPRESENT_PARAMETERS12082.BackBufferHeight = anInt12079;
	    if (aBool12077) {
		aLong12075
		    = IDirect3DDevice.GetSwapChain((aClass182_Sub1_Sub1_12074
						    .aLong11475),
						   0);
		aLong12081
		    = IDirect3DSwapChain.GetBackBuffer(aLong12075, 0, 0);
		aLong12076 = (IDirect3DDevice.GetDepthStencilSurface
			      (aClass182_Sub1_Sub1_12074.aLong11475));
	    } else {
		if (!Class182_Sub1_Sub1.method18062
		     (aClass182_Sub1_Sub1_12074.anInt11452,
		      aClass182_Sub1_Sub1_12074.anInt11439,
		      aClass182_Sub1_Sub1_12074.aLong11441,
		      aClass182_Sub1_Sub1_12074.anInt9294,
		      aClass182_Sub1_Sub1_12074.aD3DDISPLAYMODE11443,
		      aD3DPRESENT_PARAMETERS12082))
		    throw new RuntimeException();
		int i = aD3DPRESENT_PARAMETERS12082.AutoDepthStencilFormat;
		aLong12075 = (IDirect3DDevice.CreateAdditionalSwapChain
			      (aClass182_Sub1_Sub1_12074.aLong11475,
			       aD3DPRESENT_PARAMETERS12082));
		aLong12081
		    = IDirect3DSwapChain.GetBackBuffer(aLong12075, 0, 0);
		aLong12076 = (IDirect3DDevice.CreateDepthStencilSurface
			      (aClass182_Sub1_Sub1_12074.aLong11475,
			       anInt12078, anInt12079, i,
			       aD3DPRESENT_PARAMETERS12082.MultiSampleType,
			       aD3DPRESENT_PARAMETERS12082.MultiSampleQuality,
			       false));
	    }
	    aClass182_Sub1_Sub1_12074.method18067(this);
	}
	if (aBool12080)
	    method350();
    }
    
    public boolean method351() {
	aBool12080 = true;
	if (aLong12075 == 0L) {
	    if (aClass182_Sub1_Sub1_12074.aBool11446)
		return false;
	    method217();
	}
	if (Class361.method6304(IDirect3DDevice.SetRenderTarget
				(aClass182_Sub1_Sub1_12074.aLong11475, 0,
				 aLong12081)))
	    return false;
	if (Class361.method6304(IDirect3DDevice.SetDepthStencilSurface
				(aClass182_Sub1_Sub1_12074.aLong11475,
				 aLong12076)))
	    return false;
	return super.method350();
    }
    
    boolean method2712() {
	aBool12080 = false;
	return Class361.method6305(IDirect3DDevice.SetDepthStencilSurface
				   (aClass182_Sub1_Sub1_12074.aLong11475, 0L));
    }
    
    public void finalize() throws Throwable {
	method18733();
	super.finalize();
    }
    
    boolean method2717() {
	aBool12080 = false;
	return Class361.method6305(IDirect3DDevice.SetDepthStencilSurface
				   (aClass182_Sub1_Sub1_12074.aLong11475, 0L));
    }
    
    public void method352() {
	if (aLong12081 != 0L) {
	    IUnknown.Release(aLong12081);
	    aLong12081 = 0L;
	}
	if (aLong12076 != 0L) {
	    IUnknown.Release(aLong12076);
	    aLong12076 = 0L;
	}
	if (aLong12075 != 0L) {
	    IUnknown.Release(aLong12075);
	    aLong12075 = 0L;
	}
	aClass182_Sub1_Sub1_12074.method18048(this);
    }
    
    public void method221() {
	if (aLong12081 != 0L) {
	    IUnknown.Release(aLong12081);
	    aLong12081 = 0L;
	}
	if (aLong12076 != 0L) {
	    IUnknown.Release(aLong12076);
	    aLong12076 = 0L;
	}
	if (aLong12075 != 0L) {
	    IUnknown.Release(aLong12075);
	    aLong12075 = 0L;
	}
	aClass182_Sub1_Sub1_12074.method18048(this);
    }
    
    public void method222() {
	if (aLong12081 != 0L) {
	    IUnknown.Release(aLong12081);
	    aLong12081 = 0L;
	}
	if (aLong12076 != 0L) {
	    IUnknown.Release(aLong12076);
	    aLong12076 = 0L;
	}
	if (aLong12075 != 0L) {
	    IUnknown.Release(aLong12075);
	    aLong12075 = 0L;
	}
	aClass182_Sub1_Sub1_12074.method18048(this);
    }
    
    void method14609(int i, int i_3_) {
	method127();
	anInt12078 = i;
	anInt12079 = i_3_;
	if (aBool12077)
	    aClass182_Sub1_Sub1_12074.method18064(anInt12078, anInt12079);
	method217();
	super.method14605(i, i_3_);
    }
    
    public void method134() {
	if (aLong12075 == 0L) {
	    aD3DPRESENT_PARAMETERS12082
		= new D3DPRESENT_PARAMETERS(aCanvas12073);
	    aD3DPRESENT_PARAMETERS12082.Windowed = true;
	    aD3DPRESENT_PARAMETERS12082.BackBufferCount = 1;
	    aD3DPRESENT_PARAMETERS12082.PresentationInterval = -2147483648;
	    aD3DPRESENT_PARAMETERS12082.BackBufferWidth = anInt12078;
	    aD3DPRESENT_PARAMETERS12082.BackBufferHeight = anInt12079;
	    if (aBool12077) {
		aLong12075
		    = IDirect3DDevice.GetSwapChain((aClass182_Sub1_Sub1_12074
						    .aLong11475),
						   0);
		aLong12081
		    = IDirect3DSwapChain.GetBackBuffer(aLong12075, 0, 0);
		aLong12076 = (IDirect3DDevice.GetDepthStencilSurface
			      (aClass182_Sub1_Sub1_12074.aLong11475));
	    } else {
		if (!Class182_Sub1_Sub1.method18062
		     (aClass182_Sub1_Sub1_12074.anInt11452,
		      aClass182_Sub1_Sub1_12074.anInt11439,
		      aClass182_Sub1_Sub1_12074.aLong11441,
		      aClass182_Sub1_Sub1_12074.anInt9294,
		      aClass182_Sub1_Sub1_12074.aD3DDISPLAYMODE11443,
		      aD3DPRESENT_PARAMETERS12082))
		    throw new RuntimeException();
		int i = aD3DPRESENT_PARAMETERS12082.AutoDepthStencilFormat;
		aLong12075 = (IDirect3DDevice.CreateAdditionalSwapChain
			      (aClass182_Sub1_Sub1_12074.aLong11475,
			       aD3DPRESENT_PARAMETERS12082));
		aLong12081
		    = IDirect3DSwapChain.GetBackBuffer(aLong12075, 0, 0);
		aLong12076 = (IDirect3DDevice.CreateDepthStencilSurface
			      (aClass182_Sub1_Sub1_12074.aLong11475,
			       anInt12078, anInt12079, i,
			       aD3DPRESENT_PARAMETERS12082.MultiSampleType,
			       aD3DPRESENT_PARAMETERS12082.MultiSampleQuality,
			       false));
	    }
	    aClass182_Sub1_Sub1_12074.method18067(this);
	}
	if (aBool12080)
	    method350();
    }
    
    public int method14610() {
	return IDirect3DSwapChain.Present(aLong12075, 0);
    }
    
    public int method2713() {
	return anInt12078;
    }
    
    public int method14612(int i, int i_4_) {
	return IDirect3DSwapChain.Present(aLong12075, 0);
    }
    
    void method18734() throws Throwable {
	method18733();
	super.finalize();
    }
    
    void method18735() throws Throwable {
	method18733();
	super.finalize();
    }
    
    void method18736() throws Throwable {
	method18733();
	super.finalize();
    }
    
    void method18737() throws Throwable {
	method18733();
	super.finalize();
    }
    
    void method18738() {
	if (aLong12081 != 0L) {
	    IUnknown.Release(aLong12081);
	    aLong12081 = 0L;
	}
	if (aLong12076 != 0L) {
	    IUnknown.Release(aLong12076);
	    aLong12076 = 0L;
	}
	if (aLong12075 != 0L) {
	    IUnknown.Release(aLong12075);
	    aLong12075 = 0L;
	}
	aClass182_Sub1_Sub1_12074.method18048(this);
    }
    
    void method18739() {
	if (aLong12081 != 0L) {
	    IUnknown.Release(aLong12081);
	    aLong12081 = 0L;
	}
	if (aLong12076 != 0L) {
	    IUnknown.Release(aLong12076);
	    aLong12076 = 0L;
	}
	if (aLong12075 != 0L) {
	    IUnknown.Release(aLong12075);
	    aLong12075 = 0L;
	}
	aClass182_Sub1_Sub1_12074.method18048(this);
    }
    
    void method18740() {
	if (aLong12081 != 0L) {
	    IUnknown.Release(aLong12081);
	    aLong12081 = 0L;
	}
	if (aLong12076 != 0L) {
	    IUnknown.Release(aLong12076);
	    aLong12076 = 0L;
	}
	if (aLong12075 != 0L) {
	    IUnknown.Release(aLong12075);
	    aLong12075 = 0L;
	}
	aClass182_Sub1_Sub1_12074.method18048(this);
    }
    
    void method18741() {
	if (aLong12081 != 0L) {
	    IUnknown.Release(aLong12081);
	    aLong12081 = 0L;
	}
	if (aLong12076 != 0L) {
	    IUnknown.Release(aLong12076);
	    aLong12076 = 0L;
	}
	if (aLong12075 != 0L) {
	    IUnknown.Release(aLong12075);
	    aLong12075 = 0L;
	}
	aClass182_Sub1_Sub1_12074.method18048(this);
    }
    
    public boolean method350() {
	aBool12080 = true;
	if (aLong12075 == 0L) {
	    if (aClass182_Sub1_Sub1_12074.aBool11446)
		return false;
	    method217();
	}
	if (Class361.method6304(IDirect3DDevice.SetRenderTarget
				(aClass182_Sub1_Sub1_12074.aLong11475, 0,
				 aLong12081)))
	    return false;
	if (Class361.method6304(IDirect3DDevice.SetDepthStencilSurface
				(aClass182_Sub1_Sub1_12074.aLong11475,
				 aLong12076)))
	    return false;
	return super.method350();
    }
    
    public void method200() {
	if (aLong12075 == 0L) {
	    aD3DPRESENT_PARAMETERS12082
		= new D3DPRESENT_PARAMETERS(aCanvas12073);
	    aD3DPRESENT_PARAMETERS12082.Windowed = true;
	    aD3DPRESENT_PARAMETERS12082.BackBufferCount = 1;
	    aD3DPRESENT_PARAMETERS12082.PresentationInterval = -2147483648;
	    aD3DPRESENT_PARAMETERS12082.BackBufferWidth = anInt12078;
	    aD3DPRESENT_PARAMETERS12082.BackBufferHeight = anInt12079;
	    if (aBool12077) {
		aLong12075
		    = IDirect3DDevice.GetSwapChain((aClass182_Sub1_Sub1_12074
						    .aLong11475),
						   0);
		aLong12081
		    = IDirect3DSwapChain.GetBackBuffer(aLong12075, 0, 0);
		aLong12076 = (IDirect3DDevice.GetDepthStencilSurface
			      (aClass182_Sub1_Sub1_12074.aLong11475));
	    } else {
		if (!Class182_Sub1_Sub1.method18062
		     (aClass182_Sub1_Sub1_12074.anInt11452,
		      aClass182_Sub1_Sub1_12074.anInt11439,
		      aClass182_Sub1_Sub1_12074.aLong11441,
		      aClass182_Sub1_Sub1_12074.anInt9294,
		      aClass182_Sub1_Sub1_12074.aD3DDISPLAYMODE11443,
		      aD3DPRESENT_PARAMETERS12082))
		    throw new RuntimeException();
		int i = aD3DPRESENT_PARAMETERS12082.AutoDepthStencilFormat;
		aLong12075 = (IDirect3DDevice.CreateAdditionalSwapChain
			      (aClass182_Sub1_Sub1_12074.aLong11475,
			       aD3DPRESENT_PARAMETERS12082));
		aLong12081
		    = IDirect3DSwapChain.GetBackBuffer(aLong12075, 0, 0);
		aLong12076 = (IDirect3DDevice.CreateDepthStencilSurface
			      (aClass182_Sub1_Sub1_12074.aLong11475,
			       anInt12078, anInt12079, i,
			       aD3DPRESENT_PARAMETERS12082.MultiSampleType,
			       aD3DPRESENT_PARAMETERS12082.MultiSampleQuality,
			       false));
	    }
	    aClass182_Sub1_Sub1_12074.method18067(this);
	}
	if (aBool12080)
	    method350();
    }
    
    public void method192() {
	if (aLong12075 == 0L) {
	    aD3DPRESENT_PARAMETERS12082
		= new D3DPRESENT_PARAMETERS(aCanvas12073);
	    aD3DPRESENT_PARAMETERS12082.Windowed = true;
	    aD3DPRESENT_PARAMETERS12082.BackBufferCount = 1;
	    aD3DPRESENT_PARAMETERS12082.PresentationInterval = -2147483648;
	    aD3DPRESENT_PARAMETERS12082.BackBufferWidth = anInt12078;
	    aD3DPRESENT_PARAMETERS12082.BackBufferHeight = anInt12079;
	    if (aBool12077) {
		aLong12075
		    = IDirect3DDevice.GetSwapChain((aClass182_Sub1_Sub1_12074
						    .aLong11475),
						   0);
		aLong12081
		    = IDirect3DSwapChain.GetBackBuffer(aLong12075, 0, 0);
		aLong12076 = (IDirect3DDevice.GetDepthStencilSurface
			      (aClass182_Sub1_Sub1_12074.aLong11475));
	    } else {
		if (!Class182_Sub1_Sub1.method18062
		     (aClass182_Sub1_Sub1_12074.anInt11452,
		      aClass182_Sub1_Sub1_12074.anInt11439,
		      aClass182_Sub1_Sub1_12074.aLong11441,
		      aClass182_Sub1_Sub1_12074.anInt9294,
		      aClass182_Sub1_Sub1_12074.aD3DDISPLAYMODE11443,
		      aD3DPRESENT_PARAMETERS12082))
		    throw new RuntimeException();
		int i = aD3DPRESENT_PARAMETERS12082.AutoDepthStencilFormat;
		aLong12075 = (IDirect3DDevice.CreateAdditionalSwapChain
			      (aClass182_Sub1_Sub1_12074.aLong11475,
			       aD3DPRESENT_PARAMETERS12082));
		aLong12081
		    = IDirect3DSwapChain.GetBackBuffer(aLong12075, 0, 0);
		aLong12076 = (IDirect3DDevice.CreateDepthStencilSurface
			      (aClass182_Sub1_Sub1_12074.aLong11475,
			       anInt12078, anInt12079, i,
			       aD3DPRESENT_PARAMETERS12082.MultiSampleType,
			       aD3DPRESENT_PARAMETERS12082.MultiSampleQuality,
			       false));
	    }
	    aClass182_Sub1_Sub1_12074.method18067(this);
	}
	if (aBool12080)
	    method350();
    }
    
    public void method193() {
	if (aLong12075 == 0L) {
	    aD3DPRESENT_PARAMETERS12082
		= new D3DPRESENT_PARAMETERS(aCanvas12073);
	    aD3DPRESENT_PARAMETERS12082.Windowed = true;
	    aD3DPRESENT_PARAMETERS12082.BackBufferCount = 1;
	    aD3DPRESENT_PARAMETERS12082.PresentationInterval = -2147483648;
	    aD3DPRESENT_PARAMETERS12082.BackBufferWidth = anInt12078;
	    aD3DPRESENT_PARAMETERS12082.BackBufferHeight = anInt12079;
	    if (aBool12077) {
		aLong12075
		    = IDirect3DDevice.GetSwapChain((aClass182_Sub1_Sub1_12074
						    .aLong11475),
						   0);
		aLong12081
		    = IDirect3DSwapChain.GetBackBuffer(aLong12075, 0, 0);
		aLong12076 = (IDirect3DDevice.GetDepthStencilSurface
			      (aClass182_Sub1_Sub1_12074.aLong11475));
	    } else {
		if (!Class182_Sub1_Sub1.method18062
		     (aClass182_Sub1_Sub1_12074.anInt11452,
		      aClass182_Sub1_Sub1_12074.anInt11439,
		      aClass182_Sub1_Sub1_12074.aLong11441,
		      aClass182_Sub1_Sub1_12074.anInt9294,
		      aClass182_Sub1_Sub1_12074.aD3DDISPLAYMODE11443,
		      aD3DPRESENT_PARAMETERS12082))
		    throw new RuntimeException();
		int i = aD3DPRESENT_PARAMETERS12082.AutoDepthStencilFormat;
		aLong12075 = (IDirect3DDevice.CreateAdditionalSwapChain
			      (aClass182_Sub1_Sub1_12074.aLong11475,
			       aD3DPRESENT_PARAMETERS12082));
		aLong12081
		    = IDirect3DSwapChain.GetBackBuffer(aLong12075, 0, 0);
		aLong12076 = (IDirect3DDevice.CreateDepthStencilSurface
			      (aClass182_Sub1_Sub1_12074.aLong11475,
			       anInt12078, anInt12079, i,
			       aD3DPRESENT_PARAMETERS12082.MultiSampleType,
			       aD3DPRESENT_PARAMETERS12082.MultiSampleQuality,
			       false));
	    }
	    aClass182_Sub1_Sub1_12074.method18067(this);
	}
	if (aBool12080)
	    method350();
    }
    
    public int method14607(int i, int i_5_) {
	return IDirect3DSwapChain.Present(aLong12075, 0);
    }
}
