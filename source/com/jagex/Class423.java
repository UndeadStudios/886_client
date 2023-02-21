/* Class423 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jagdx.Class361;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DIndexBuffer;
import jagdx.IUnknown;

public class Class423 implements Interface44
{
    boolean aBool4710;
    int anInt4711;
    Class182_Sub1_Sub1 aClass182_Sub1_Sub1_4712;
    Class178 aClass178_4713;
    int anInt4714;
    long aLong4715 = 0L;
    
    void method6759() {
	method6761();
    }
    
    public boolean method218(int i, int i_0_, long l) {
	return Class361.method6305(IDirect3DIndexBuffer.Upload(aLong4715, i,
							       i_0_,
							       (aBool4710
								? 8192 : 0),
							       l));
    }
    
    public Class178 method326() {
	return aClass178_4713;
    }
    
    public void method29(int i) {
	anInt4711 = aClass178_4713.anInt1915 * -103623665 * i;
	if (anInt4711 > anInt4714) {
	    if (aLong4715 != 0L)
		IUnknown.Release(aLong4715);
	    int i_1_ = 8;
	    int i_2_;
	    if (aBool4710) {
		i_2_ = 0;
		i_1_ |= 0x200;
	    } else
		i_2_ = 1;
	    aLong4715
		= (IDirect3DDevice.CreateIndexBuffer
		   (aClass182_Sub1_Sub1_4712.aLong11475, anInt4711, i_1_,
		    aClass178_4713 == Class178.aClass178_1909 ? 101 : 102,
		    i_2_));
	    anInt4714 = anInt4711;
	}
    }
    
    public Class178 method330() {
	return aClass178_4713;
    }
    
    public void method220() {
	IDirect3DIndexBuffer.Unlock(aLong4715);
    }
    
    void method6760() {
	method6761();
    }
    
    Class423(Class182_Sub1_Sub1 class182_sub1_sub1, Class178 class178,
	     boolean bool) {
	aClass182_Sub1_Sub1_4712 = class182_sub1_sub1;
	aClass178_4713 = class178;
	aBool4710 = bool;
	aClass182_Sub1_Sub1_4712.method14863(this);
    }
    
    void method6761() {
	if (aLong4715 != 0L) {
	    aClass182_Sub1_Sub1_4712.method18061(aLong4715);
	    aLong4715 = 0L;
	}
	anInt4714 = 0;
	anInt4711 = 0;
    }
    
    public void finalize() {
	method6761();
    }
    
    public int method57() {
	return anInt4711;
    }
    
    public void method125() {
	if (aLong4715 != 0L) {
	    IUnknown.Release(aLong4715);
	    aLong4715 = 0L;
	}
	anInt4714 = 0;
	anInt4711 = 0;
	aClass182_Sub1_Sub1_4712.method14721(this);
    }
    
    void method6762() {
	method6761();
    }
    
    public long method216(int i, int i_3_) {
	return IDirect3DIndexBuffer.Lock(aLong4715, i, i_3_,
					 aBool4710 ? 8192 : 0);
    }
    
    public long method219(int i, int i_4_) {
	return IDirect3DIndexBuffer.Lock(aLong4715, i, i_4_,
					 aBool4710 ? 8192 : 0);
    }
    
    void method6763() {
	method6761();
    }
    
    public void method127() {
	if (aLong4715 != 0L) {
	    IUnknown.Release(aLong4715);
	    aLong4715 = 0L;
	}
	anInt4714 = 0;
	anInt4711 = 0;
	aClass182_Sub1_Sub1_4712.method14721(this);
    }
    
    public long method214(int i, int i_5_) {
	return IDirect3DIndexBuffer.Lock(aLong4715, i, i_5_,
					 aBool4710 ? 8192 : 0);
    }
    
    public void method222() {
	IDirect3DIndexBuffer.Unlock(aLong4715);
    }
    
    public void method221() {
	IDirect3DIndexBuffer.Unlock(aLong4715);
    }
    
    public void method126() {
	if (aLong4715 != 0L) {
	    IUnknown.Release(aLong4715);
	    aLong4715 = 0L;
	}
	anInt4714 = 0;
	anInt4711 = 0;
	aClass182_Sub1_Sub1_4712.method14721(this);
    }
    
    public void method217() {
	IDirect3DIndexBuffer.Unlock(aLong4715);
    }
    
    public Class178 method325() {
	return aClass178_4713;
    }
    
    public Class178 method328() {
	return aClass178_4713;
    }
    
    public Class178 method329() {
	return aClass178_4713;
    }
    
    public int method223() {
	return anInt4711;
    }
    
    public void method327(int i) {
	anInt4711 = aClass178_4713.anInt1915 * -103623665 * i;
	if (anInt4711 > anInt4714) {
	    if (aLong4715 != 0L)
		IUnknown.Release(aLong4715);
	    int i_6_ = 8;
	    int i_7_;
	    if (aBool4710) {
		i_7_ = 0;
		i_6_ |= 0x200;
	    } else
		i_7_ = 1;
	    aLong4715
		= (IDirect3DDevice.CreateIndexBuffer
		   (aClass182_Sub1_Sub1_4712.aLong11475, anInt4711, i_6_,
		    aClass178_4713 == Class178.aClass178_1909 ? 101 : 102,
		    i_7_));
	    anInt4714 = anInt4711;
	}
    }
    
    public void method331(int i) {
	anInt4711 = aClass178_4713.anInt1915 * -103623665 * i;
	if (anInt4711 > anInt4714) {
	    if (aLong4715 != 0L)
		IUnknown.Release(aLong4715);
	    int i_8_ = 8;
	    int i_9_;
	    if (aBool4710) {
		i_9_ = 0;
		i_8_ |= 0x200;
	    } else
		i_9_ = 1;
	    aLong4715
		= (IDirect3DDevice.CreateIndexBuffer
		   (aClass182_Sub1_Sub1_4712.aLong11475, anInt4711, i_8_,
		    aClass178_4713 == Class178.aClass178_1909 ? 101 : 102,
		    i_9_));
	    anInt4714 = anInt4711;
	}
    }
    
    public void method332(int i) {
	anInt4711 = aClass178_4713.anInt1915 * -103623665 * i;
	if (anInt4711 > anInt4714) {
	    if (aLong4715 != 0L)
		IUnknown.Release(aLong4715);
	    int i_10_ = 8;
	    int i_11_;
	    if (aBool4710) {
		i_11_ = 0;
		i_10_ |= 0x200;
	    } else
		i_11_ = 1;
	    aLong4715
		= (IDirect3DDevice.CreateIndexBuffer
		   (aClass182_Sub1_Sub1_4712.aLong11475, anInt4711, i_10_,
		    aClass178_4713 == Class178.aClass178_1909 ? 101 : 102,
		    i_11_));
	    anInt4714 = anInt4711;
	}
    }
    
    public void method333(int i) {
	anInt4711 = aClass178_4713.anInt1915 * -103623665 * i;
	if (anInt4711 > anInt4714) {
	    if (aLong4715 != 0L)
		IUnknown.Release(aLong4715);
	    int i_12_ = 8;
	    int i_13_;
	    if (aBool4710) {
		i_13_ = 0;
		i_12_ |= 0x200;
	    } else
		i_13_ = 1;
	    aLong4715
		= (IDirect3DDevice.CreateIndexBuffer
		   (aClass182_Sub1_Sub1_4712.aLong11475, anInt4711, i_12_,
		    aClass178_4713 == Class178.aClass178_1909 ? 101 : 102,
		    i_13_));
	    anInt4714 = anInt4711;
	}
    }
    
    public boolean method215(int i, int i_14_, long l) {
	return Class361.method6305(IDirect3DIndexBuffer.Upload(aLong4715, i,
							       i_14_,
							       (aBool4710
								? 8192 : 0),
							       l));
    }
    
    public int method224() {
	return anInt4711;
    }
    
    void method6764() {
	if (aLong4715 != 0L) {
	    aClass182_Sub1_Sub1_4712.method18061(aLong4715);
	    aLong4715 = 0L;
	}
	anInt4714 = 0;
	anInt4711 = 0;
    }
}
