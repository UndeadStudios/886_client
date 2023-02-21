/* Class421 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jagdx.Class361;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexBuffer;
import jagdx.IUnknown;

public class Class421 implements Interface35
{
    boolean aBool4691;
    long aLong4692 = 0L;
    int anInt4693;
    byte aByte4694;
    int anInt4695;
    Class182_Sub1_Sub1 aClass182_Sub1_Sub1_4696;
    
    public int method224() {
	return anInt4693;
    }
    
    public void method217() {
	IDirect3DVertexBuffer.Unlock(aLong4692);
    }
    
    int method6745() {
	return aByte4694;
    }
    
    public boolean method225(int i, int i_0_) {
	anInt4693 = i;
	aByte4694 = (byte) i_0_;
	if (anInt4693 > anInt4695) {
	    int i_1_ = 8;
	    int i_2_;
	    if (aBool4691) {
		i_2_ = 0;
		i_1_ |= 0x200;
	    } else
		i_2_ = 1;
	    if (aLong4692 != 0L)
		IUnknown.Release(aLong4692);
	    aLong4692
		= IDirect3DDevice.CreateVertexBuffer((aClass182_Sub1_Sub1_4696
						      .aLong11475),
						     anInt4693, i_1_, 0, i_2_);
	    anInt4695 = anInt4693;
	}
	return aLong4692 != 0L;
    }
    
    public boolean method218(int i, int i_3_, long l) {
	return Class361.method6305(IDirect3DVertexBuffer.Upload(aLong4692, i,
								i_3_,
								(aBool4691
								 ? 8192 : 0),
								l));
    }
    
    public void method220() {
	IDirect3DVertexBuffer.Unlock(aLong4692);
    }
    
    public boolean method215(int i, int i_4_, long l) {
	return Class361.method6305(IDirect3DVertexBuffer.Upload(aLong4692, i,
								i_4_,
								(aBool4691
								 ? 8192 : 0),
								l));
    }
    
    public void method127() {
	if (aLong4692 != 0L) {
	    IUnknown.Release(aLong4692);
	    aLong4692 = 0L;
	}
	anInt4695 = 0;
	anInt4693 = 0;
	aClass182_Sub1_Sub1_4696.method14721(this);
    }
    
    void method6746() {
	method6747();
    }
    
    void method6747() {
	if (aLong4692 != 0L) {
	    aClass182_Sub1_Sub1_4696.method18061(aLong4692);
	    aLong4692 = 0L;
	    anInt4695 = 0;
	    anInt4693 = 0;
	}
    }
    
    public void finalize() {
	method6747();
    }
    
    public void method125() {
	if (aLong4692 != 0L) {
	    IUnknown.Release(aLong4692);
	    aLong4692 = 0L;
	}
	anInt4695 = 0;
	anInt4693 = 0;
	aClass182_Sub1_Sub1_4696.method14721(this);
    }
    
    void method6748() {
	method6747();
    }
    
    public void method221() {
	IDirect3DVertexBuffer.Unlock(aLong4692);
    }
    
    void method6749() {
	method6747();
    }
    
    public long method216(int i, int i_5_) {
	return IDirect3DVertexBuffer.Lock(aLong4692, i, i_5_,
					  aBool4691 ? 8192 : 0);
    }
    
    public boolean method226(int i, int i_6_) {
	anInt4693 = i;
	aByte4694 = (byte) i_6_;
	if (anInt4693 > anInt4695) {
	    int i_7_ = 8;
	    int i_8_;
	    if (aBool4691) {
		i_8_ = 0;
		i_7_ |= 0x200;
	    } else
		i_8_ = 1;
	    if (aLong4692 != 0L)
		IUnknown.Release(aLong4692);
	    aLong4692
		= IDirect3DDevice.CreateVertexBuffer((aClass182_Sub1_Sub1_4696
						      .aLong11475),
						     anInt4693, i_7_, 0, i_8_);
	    anInt4695 = anInt4693;
	}
	return aLong4692 != 0L;
    }
    
    public boolean method227(int i, int i_9_) {
	anInt4693 = i;
	aByte4694 = (byte) i_9_;
	if (anInt4693 > anInt4695) {
	    int i_10_ = 8;
	    int i_11_;
	    if (aBool4691) {
		i_11_ = 0;
		i_10_ |= 0x200;
	    } else
		i_11_ = 1;
	    if (aLong4692 != 0L)
		IUnknown.Release(aLong4692);
	    aLong4692
		= IDirect3DDevice.CreateVertexBuffer((aClass182_Sub1_Sub1_4696
						      .aLong11475),
						     anInt4693, i_10_, 0,
						     i_11_);
	    anInt4695 = anInt4693;
	}
	return aLong4692 != 0L;
    }
    
    Class421(Class182_Sub1_Sub1 class182_sub1_sub1, boolean bool) {
	aClass182_Sub1_Sub1_4696 = class182_sub1_sub1;
	aBool4691 = bool;
	aClass182_Sub1_Sub1_4696.method14863(this);
    }
    
    public long method214(int i, int i_12_) {
	return IDirect3DVertexBuffer.Lock(aLong4692, i, i_12_,
					  aBool4691 ? 8192 : 0);
    }
    
    void method6750() {
	if (aLong4692 != 0L) {
	    aClass182_Sub1_Sub1_4696.method18061(aLong4692);
	    aLong4692 = 0L;
	    anInt4695 = 0;
	    anInt4693 = 0;
	}
    }
    
    public void method126() {
	if (aLong4692 != 0L) {
	    IUnknown.Release(aLong4692);
	    aLong4692 = 0L;
	}
	anInt4695 = 0;
	anInt4693 = 0;
	aClass182_Sub1_Sub1_4696.method14721(this);
    }
    
    public void method222() {
	IDirect3DVertexBuffer.Unlock(aLong4692);
    }
    
    void method6751() {
	method6747();
    }
    
    public int method223() {
	return anInt4693;
    }
    
    public long method219(int i, int i_13_) {
	return IDirect3DVertexBuffer.Lock(aLong4692, i, i_13_,
					  aBool4691 ? 8192 : 0);
    }
    
    int method6752() {
	return aByte4694;
    }
    
    void method6753() {
	if (aLong4692 != 0L) {
	    aClass182_Sub1_Sub1_4696.method18061(aLong4692);
	    aLong4692 = 0L;
	    anInt4695 = 0;
	    anInt4693 = 0;
	}
    }
    
    void method6754() {
	if (aLong4692 != 0L) {
	    aClass182_Sub1_Sub1_4696.method18061(aLong4692);
	    aLong4692 = 0L;
	    anInt4695 = 0;
	    anInt4693 = 0;
	}
    }
    
    public int method57() {
	return anInt4693;
    }
}
