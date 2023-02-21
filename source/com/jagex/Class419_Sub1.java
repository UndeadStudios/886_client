/* Class419_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.nio.ByteBuffer;

import jagdx.IDirect3DCubeTexture;
import jagdx.IDirect3DDevice;

public class Class419_Sub1 extends Class419 implements Interface40
{
    int anInt10148;
    
    public void method126() {
	super.method127();
    }
    
    public void method276() {
	aClass182_Sub1_Sub1_4673.method18053(this);
    }
    
    Class419_Sub1(Class182_Sub1_Sub1 class182_sub1_sub1, int i, boolean bool,
		  int[][] is) {
	super(class182_sub1_sub1, Class165.aClass165_1771,
	      Class178.aClass178_1905, bool && class182_sub1_sub1.aBool11478,
	      i * i * 6);
	anInt10148 = i;
	if (aBool4672)
	    aLong4676
		= IDirect3DDevice.CreateCubeTexture((aClass182_Sub1_Sub1_4673
						     .aLong11475),
						    anInt10148, 0, 1024, 21,
						    1);
	else
	    aLong4676
		= IDirect3DDevice.CreateCubeTexture((aClass182_Sub1_Sub1_4673
						     .aLong11475),
						    anInt10148, 1, 0, 21, 1);
	ByteBuffer bytebuffer = aClass182_Sub1_Sub1_4673.aByteBuffer9271;
	aClass182_Sub1_Sub1_4673.method14790(anInt10148 * anInt10148 * 4);
	for (int i_0_ = 0; i_0_ < 6; i_0_++) {
	    bytebuffer.clear();
	    bytebuffer.asIntBuffer().put(is[i_0_]);
	    IDirect3DCubeTexture.Upload(aLong4676, i_0_, 0, 0, 0, anInt10148,
					anInt10148, anInt10148 * 4, 0,
					aClass182_Sub1_Sub1_4673.aLong9160);
	}
    }
    
    public void method271(Class377 class377) {
	super.method271(class377);
    }
    
    public void method275() {
	aClass182_Sub1_Sub1_4673.method18053(this);
    }
    
    public void method272(Class377 class377) {
	super.method271(class377);
    }
    
    public void method274() {
	aClass182_Sub1_Sub1_4673.method18053(this);
    }
    
    public void method127() {
	super.method127();
    }
    
    public void method273(Class377 class377) {
	super.method271(class377);
    }
    
    public void method125() {
	super.method127();
    }
    
    public void method277(Class377 class377) {
	super.method271(class377);
    }
    
    public void method278(Class377 class377) {
	super.method271(class377);
    }
}
