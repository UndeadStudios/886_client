/* Class337_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.nio.ByteBuffer;

import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

public class Class337_Sub2 extends Class337
{
    Class182_Sub1_Sub1 aClass182_Sub1_Sub1_10295;
    long aLong10296 = 0L;
    
    public void finalize() {
	method15892();
    }
    
    Class337_Sub2(Class182_Sub1_Sub1 class182_sub1_sub1,
		  Class378[] class378s) {
	super(class378s);
	aClass182_Sub1_Sub1_10295 = class182_sub1_sub1;
	byte i = 0;
	ByteBuffer bytebuffer = aClass182_Sub1_Sub1_10295.aByteBuffer9271;
	bytebuffer.clear();
	for (short i_0_ = 0; i_0_ < aClass378Array3630.length; i_0_++) {
	    short i_1_ = 0;
	    Class378 class378 = aClass378Array3630[i_0_];
	    for (int i_2_ = 0; i_2_ < class378.method6371(); i_2_++) {
		Class342 class342 = class378.method6372(i_2_);
		if (class342 == Class342.aClass342_3673)
		    method15897(bytebuffer, i_0_, i_1_, (byte) 2, (byte) 0,
				(byte) 0, (byte) 0);
		else if (class342 == Class342.aClass342_3655)
		    method15897(bytebuffer, i_0_, i_1_, (byte) 2, (byte) 0,
				(byte) 3, (byte) 0);
		else if (class342 == Class342.aClass342_3657)
		    method15897(bytebuffer, i_0_, i_1_, (byte) 4, (byte) 0,
				(byte) 10, (byte) 0);
		else if (class342 == Class342.aClass342_3658) {
		    Class337_Sub2 class337_sub2_3_ = this;
		    ByteBuffer bytebuffer_4_ = bytebuffer;
		    short i_5_ = i_0_;
		    short i_6_ = i_1_;
		    byte i_7_ = 0;
		    byte i_8_ = 0;
		    byte i_9_ = 5;
		    byte i_10_ = i;
		    i++;
		    class337_sub2_3_.method15897(bytebuffer_4_, i_5_, i_6_,
						 i_7_, i_8_, i_9_, i_10_);
		} else if (class342 == Class342.aClass342_3659) {
		    Class337_Sub2 class337_sub2_11_ = this;
		    ByteBuffer bytebuffer_12_ = bytebuffer;
		    short i_13_ = i_0_;
		    short i_14_ = i_1_;
		    byte i_15_ = 1;
		    byte i_16_ = 0;
		    byte i_17_ = 5;
		    byte i_18_ = i;
		    i++;
		    class337_sub2_11_.method15897(bytebuffer_12_, i_13_, i_14_,
						  i_15_, i_16_, i_17_, i_18_);
		} else if (class342 == Class342.aClass342_3669) {
		    Class337_Sub2 class337_sub2_19_ = this;
		    ByteBuffer bytebuffer_20_ = bytebuffer;
		    short i_21_ = i_0_;
		    short i_22_ = i_1_;
		    byte i_23_ = 2;
		    byte i_24_ = 0;
		    byte i_25_ = 5;
		    byte i_26_ = i;
		    i++;
		    class337_sub2_19_.method15897(bytebuffer_20_, i_21_, i_22_,
						  i_23_, i_24_, i_25_, i_26_);
		} else if (class342 == Class342.aClass342_3660) {
		    Class337_Sub2 class337_sub2_27_ = this;
		    ByteBuffer bytebuffer_28_ = bytebuffer;
		    short i_29_ = i_0_;
		    short i_30_ = i_1_;
		    byte i_31_ = 3;
		    byte i_32_ = 0;
		    byte i_33_ = 5;
		    byte i_34_ = i;
		    i++;
		    class337_sub2_27_.method15897(bytebuffer_28_, i_29_, i_30_,
						  i_31_, i_32_, i_33_, i_34_);
		}
		i_1_ += class342.anInt3671;
	    }
	}
	method15897(bytebuffer, (short) 255, (short) 0, (byte) 17, (byte) 0,
		    (byte) 0, (byte) 0);
	aLong10296 = (IDirect3DDevice.CreateVertexDeclaration
		      (aClass182_Sub1_Sub1_10295.aLong11475,
		       aClass182_Sub1_Sub1_10295.aLong9160));
	aClass182_Sub1_Sub1_10295.method14863(this);
    }
    
    void method15891() {
	method15892();
    }
    
    void method15892() {
	if (aLong10296 != 0L) {
	    aClass182_Sub1_Sub1_10295.method18061(aLong10296);
	    aLong10296 = 0L;
	}
    }
    
    public void method127() {
	if (aLong10296 != 0L) {
	    IUnknown.Release(aLong10296);
	    aLong10296 = 0L;
	}
	aClass182_Sub1_Sub1_10295.method14721(this);
    }
    
    public void method126() {
	if (aLong10296 != 0L) {
	    IUnknown.Release(aLong10296);
	    aLong10296 = 0L;
	}
	aClass182_Sub1_Sub1_10295.method14721(this);
    }
    
    public void method125() {
	if (aLong10296 != 0L) {
	    IUnknown.Release(aLong10296);
	    aLong10296 = 0L;
	}
	aClass182_Sub1_Sub1_10295.method14721(this);
    }
    
    void method15893() {
	method15892();
    }
    
    void method15894() {
	if (aLong10296 != 0L) {
	    aClass182_Sub1_Sub1_10295.method18061(aLong10296);
	    aLong10296 = 0L;
	}
    }
    
    void method15895() {
	method15892();
    }
    
    void method15896() {
	method15892();
    }
    
    void method15897(ByteBuffer bytebuffer, short i, short i_35_, byte i_36_,
		     byte i_37_, byte i_38_, byte i_39_) {
	bytebuffer.putShort(i);
	bytebuffer.putShort(i_35_);
	bytebuffer.put(i_36_);
	bytebuffer.put(i_37_);
	bytebuffer.put(i_38_);
	bytebuffer.put(i_39_);
    }
}
