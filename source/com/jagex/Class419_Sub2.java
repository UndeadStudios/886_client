/* Class419_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.nio.ByteBuffer;

import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVolumeTexture;

public class Class419_Sub2 extends Class419 implements Interface37
{
    int anInt10181;
    int anInt10182;
    int anInt10183;
    
    long method6737() {
	return aLong4676;
    }
    
    public void method277(Class377 class377) {
	super.method271(class377);
    }
    
    public void method276() {
	aClass182_Sub1_Sub1_4673.method18055(this);
    }
    
    public void method271(Class377 class377) {
	super.method271(class377);
    }
    
    public void method127() {
	super.method127();
    }
    
    public void method275() {
	aClass182_Sub1_Sub1_4673.method18055(this);
    }
    
    public void method125() {
	super.method127();
    }
    
    public void method274() {
	aClass182_Sub1_Sub1_4673.method18055(this);
    }
    
    public void method273(Class377 class377) {
	super.method271(class377);
    }
    
    Class419_Sub2(Class182_Sub1_Sub1 class182_sub1_sub1, Class165 class165,
		  int i, int i_0_, int i_1_, boolean bool, byte[] is) {
	super(class182_sub1_sub1, class165, Class178.aClass178_1905, false,
	      i * i_0_ * i_1_);
	anInt10181 = i;
	anInt10182 = i_0_;
	anInt10183 = i_1_;
	aLong4676
	    = (IDirect3DDevice.CreateVolumeTexture
	       (aClass182_Sub1_Sub1_4673.aLong11475, i, i_0_, i_1_, 1, 0,
		Class182_Sub1_Sub1.method18071(class165, aClass178_4674), 1));
	aClass182_Sub1_Sub1_4673.method14790(anInt10181 * anInt10182
					     * (class165.anInt1770
						* -1998053519));
	ByteBuffer bytebuffer = aClass182_Sub1_Sub1_4673.aByteBuffer9271;
	bytebuffer.clear();
	bytebuffer.put(is);
	IDirect3DVolumeTexture.Upload(aLong4676, 0, 0, 0, 0, anInt10181,
				      anInt10182, anInt10183,
				      anInt10181 * (class165.anInt1770
						    * -1998053519),
				      0, aClass182_Sub1_Sub1_4673.aLong9160);
    }
    
    public void method272(Class377 class377) {
	super.method271(class377);
    }
    
    long method6735() {
	return aLong4676;
    }
    
    public void method126() {
	super.method127();
    }
    
    public void method278(Class377 class377) {
	super.method271(class377);
    }
}
