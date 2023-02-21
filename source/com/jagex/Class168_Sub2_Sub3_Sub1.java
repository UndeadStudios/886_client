/* Class168_Sub2_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jagdx.Class361;
import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

public class Class168_Sub2_Sub3_Sub1 extends Class168_Sub2_Sub3
{
    int anInt12122;
    Class182_Sub1_Sub1 aClass182_Sub1_Sub1_12123;
    int anInt12124;
    Interface51 anInterface51_12125 = null;
    static final int anInt12126 = 16;
    boolean aBool12127;
    int anInt12128;
    Interface54[] anInterface54Array12129 = new Interface54[4];
    
    public int method2713() {
	return anInt12124;
    }
    
    public int method2710() {
	return anInt12124;
    }
    
    boolean method18785(long l) {
	return Class361.method6305(IDirect3DDevice.SetDepthStencilSurface
				   (aClass182_Sub1_Sub1_12123.aLong11475, l));
    }
    
    public void method15589(int i, Interface21 interface21) {
	int i_0_ = 1 << i;
	Interface54 interface54 = (Interface54) interface21;
	if (interface21 != null) {
	    if (anInt12128 != 0) {
		if (anInt12124 != interface54.method1()
		    || anInt12122 != interface54.method80())
		    throw new RuntimeException();
	    } else {
		anInt12122 = interface54.method80();
		anInt12124 = interface54.method1();
		method18178();
	    }
	    anInt12128 |= i_0_;
	    anInterface54Array12129[i] = interface54;
	    if (aBool12127)
		method18789(i, interface54.method10());
	} else {
	    anInt12128 &= i_0_ ^ 0xffffffff;
	    anInterface54Array12129[i] = null;
	    if (aBool12127)
		method18789(i, 0L);
	    if (anInt12128 == 0) {
		anInt12122 = 0;
		anInt12124 = 0;
	    }
	}
    }
    
    boolean method2709() {
	for (int i = 1; i < 4; i++) {
	    Interface54 interface54 = anInterface54Array12129[i];
	    if (interface54 != null)
		method18789(i, 0L);
	}
	if (anInterface51_12125 != null)
	    method18786(0L);
	aBool12127 = false;
	return true;
    }
    
    public boolean method15597() {
	return anInterface54Array12129[0] != null;
    }
    
    boolean method18786(long l) {
	return Class361.method6305(IDirect3DDevice.SetDepthStencilSurface
				   (aClass182_Sub1_Sub1_12123.aLong11475, l));
    }
    
    public boolean method15588() {
	return anInterface54Array12129[0] != null;
    }
    
    boolean method350() {
	for (int i = 0; i < 4; i++) {
	    Interface54 interface54 = anInterface54Array12129[i];
	    if (interface54 != null) {
		long l = interface54.method10();
		method18789(i, l);
	    }
	}
	if (anInterface51_12125 != null)
	    method18786(anInterface51_12125.method10());
	aBool12127 = true;
	return super.method350();
    }
    
    boolean method2712() {
	for (int i = 1; i < 4; i++) {
	    Interface54 interface54 = anInterface54Array12129[i];
	    if (interface54 != null)
		method18789(i, 0L);
	}
	if (anInterface51_12125 != null)
	    method18786(0L);
	aBool12127 = false;
	return true;
    }
    
    Class168_Sub2_Sub3_Sub1(Class182_Sub1_Sub1 class182_sub1_sub1) {
	super((Class182_Sub1) class182_sub1_sub1);
	aClass182_Sub1_Sub1_12123 = class182_sub1_sub1;
    }
    
    void method18787() throws Throwable {
	method18788();
	super.finalize();
    }
    
    public int method2716() {
	return anInt12124;
    }
    
    public void finalize() throws Throwable {
	method18788();
	super.finalize();
    }
    
    void method18788() {
	if (anInterface51_12125 != null)
	    anInterface51_12125.method349();
	for (int i = 0; i < anInterface54Array12129.length; i++) {
	    if (anInterface54Array12129[i] != null)
		anInterface54Array12129[i].method349();
	}
    }
    
    public void method15584(Interface22 interface22) {
	Interface51 interface51 = (Interface51) interface22;
	if (interface22 != null) {
	    if (anInt12128 != 0) {
		if (anInt12124 != interface51.method1()
		    || anInt12122 != interface51.method80())
		    throw new RuntimeException();
	    } else {
		anInt12122 = interface51.method80();
		anInt12124 = interface51.method1();
		method18178();
	    }
	    anInt12128 |= 0x10;
	    anInterface51_12125 = interface51;
	    if (aBool12127)
		method18786(interface51.method10());
	} else {
	    anInt12128 &= ~0x10;
	    anInterface51_12125 = null;
	    if (aBool12127)
		method18786(0L);
	    if (anInt12128 == 0) {
		anInt12122 = 0;
		anInt12124 = 0;
	    }
	}
    }
    
    public int method2714() {
	return anInt12122;
    }
    
    public void method15587(int i, Interface21 interface21) {
	int i_1_ = 1 << i;
	Interface54 interface54 = (Interface54) interface21;
	if (interface21 != null) {
	    if (anInt12128 != 0) {
		if (anInt12124 != interface54.method1()
		    || anInt12122 != interface54.method80())
		    throw new RuntimeException();
	    } else {
		anInt12122 = interface54.method80();
		anInt12124 = interface54.method1();
		method18178();
	    }
	    anInt12128 |= i_1_;
	    anInterface54Array12129[i] = interface54;
	    if (aBool12127)
		method18789(i, interface54.method10());
	} else {
	    anInt12128 &= i_1_ ^ 0xffffffff;
	    anInterface54Array12129[i] = null;
	    if (aBool12127)
		method18789(i, 0L);
	    if (anInt12128 == 0) {
		anInt12122 = 0;
		anInt12124 = 0;
	    }
	}
    }
    
    public void method15585(int i, Interface21 interface21) {
	int i_2_ = 1 << i;
	Interface54 interface54 = (Interface54) interface21;
	if (interface21 != null) {
	    if (anInt12128 != 0) {
		if (anInt12124 != interface54.method1()
		    || anInt12122 != interface54.method80())
		    throw new RuntimeException();
	    } else {
		anInt12122 = interface54.method80();
		anInt12124 = interface54.method1();
		method18178();
	    }
	    anInt12128 |= i_2_;
	    anInterface54Array12129[i] = interface54;
	    if (aBool12127)
		method18789(i, interface54.method10());
	} else {
	    anInt12128 &= i_2_ ^ 0xffffffff;
	    anInterface54Array12129[i] = null;
	    if (aBool12127)
		method18789(i, 0L);
	    if (anInt12128 == 0) {
		anInt12122 = 0;
		anInt12124 = 0;
	    }
	}
    }
    
    public void method15590(int i, Interface21 interface21) {
	int i_3_ = 1 << i;
	Interface54 interface54 = (Interface54) interface21;
	if (interface21 != null) {
	    if (anInt12128 != 0) {
		if (anInt12124 != interface54.method1()
		    || anInt12122 != interface54.method80())
		    throw new RuntimeException();
	    } else {
		anInt12122 = interface54.method80();
		anInt12124 = interface54.method1();
		method18178();
	    }
	    anInt12128 |= i_3_;
	    anInterface54Array12129[i] = interface54;
	    if (aBool12127)
		method18789(i, interface54.method10());
	} else {
	    anInt12128 &= i_3_ ^ 0xffffffff;
	    anInterface54Array12129[i] = null;
	    if (aBool12127)
		method18789(i, 0L);
	    if (anInt12128 == 0) {
		anInt12122 = 0;
		anInt12124 = 0;
	    }
	}
    }
    
    public void method15591(int i, Interface21 interface21) {
	int i_4_ = 1 << i;
	Interface54 interface54 = (Interface54) interface21;
	if (interface21 != null) {
	    if (anInt12128 != 0) {
		if (anInt12124 != interface54.method1()
		    || anInt12122 != interface54.method80())
		    throw new RuntimeException();
	    } else {
		anInt12122 = interface54.method80();
		anInt12124 = interface54.method1();
		method18178();
	    }
	    anInt12128 |= i_4_;
	    anInterface54Array12129[i] = interface54;
	    if (aBool12127)
		method18789(i, interface54.method10());
	} else {
	    anInt12128 &= i_4_ ^ 0xffffffff;
	    anInterface54Array12129[i] = null;
	    if (aBool12127)
		method18789(i, 0L);
	    if (anInt12128 == 0) {
		anInt12122 = 0;
		anInt12124 = 0;
	    }
	}
    }
    
    public void method15592(Interface22 interface22) {
	Interface51 interface51 = (Interface51) interface22;
	if (interface22 != null) {
	    if (anInt12128 != 0) {
		if (anInt12124 != interface51.method1()
		    || anInt12122 != interface51.method80())
		    throw new RuntimeException();
	    } else {
		anInt12122 = interface51.method80();
		anInt12124 = interface51.method1();
		method18178();
	    }
	    anInt12128 |= 0x10;
	    anInterface51_12125 = interface51;
	    if (aBool12127)
		method18786(interface51.method10());
	} else {
	    anInt12128 &= ~0x10;
	    anInterface51_12125 = null;
	    if (aBool12127)
		method18786(0L);
	    if (anInt12128 == 0) {
		anInt12122 = 0;
		anInt12124 = 0;
	    }
	}
    }
    
    public void method15593(Interface22 interface22) {
	Interface51 interface51 = (Interface51) interface22;
	if (interface22 != null) {
	    if (anInt12128 != 0) {
		if (anInt12124 != interface51.method1()
		    || anInt12122 != interface51.method80())
		    throw new RuntimeException();
	    } else {
		anInt12122 = interface51.method80();
		anInt12124 = interface51.method1();
		method18178();
	    }
	    anInt12128 |= 0x10;
	    anInterface51_12125 = interface51;
	    if (aBool12127)
		method18786(interface51.method10());
	} else {
	    anInt12128 &= ~0x10;
	    anInterface51_12125 = null;
	    if (aBool12127)
		method18786(0L);
	    if (anInt12128 == 0) {
		anInt12122 = 0;
		anInt12124 = 0;
	    }
	}
    }
    
    boolean method351() {
	for (int i = 0; i < 4; i++) {
	    Interface54 interface54 = anInterface54Array12129[i];
	    if (interface54 != null) {
		long l = interface54.method10();
		method18789(i, l);
	    }
	}
	if (anInterface51_12125 != null)
	    method18786(anInterface51_12125.method10());
	aBool12127 = true;
	return super.method350();
    }
    
    public int method2711() {
	return anInt12122;
    }
    
    boolean method2715() {
	for (int i = 1; i < 4; i++) {
	    Interface54 interface54 = anInterface54Array12129[i];
	    if (interface54 != null)
		method18789(i, 0L);
	}
	if (anInterface51_12125 != null)
	    method18786(0L);
	aBool12127 = false;
	return true;
    }
    
    boolean method2717() {
	for (int i = 1; i < 4; i++) {
	    Interface54 interface54 = anInterface54Array12129[i];
	    if (interface54 != null)
		method18789(i, 0L);
	}
	if (anInterface51_12125 != null)
	    method18786(0L);
	aBool12127 = false;
	return true;
    }
    
    public void method15594(int i, int i_5_, int i_6_, int i_7_, int i_8_,
			    int i_9_, boolean bool, boolean bool_10_) {
	if (bool) {
	    long l = IDirect3DDevice.GetRenderTarget((aClass182_Sub1_Sub1_12123
						      .aLong11475),
						     0);
	    IDirect3DDevice.StretchRect(aClass182_Sub1_Sub1_12123.aLong11475,
					anInterface54Array12129[0].method10(),
					i, i_5_, i_6_, i_7_, l, i_8_, i_9_,
					i_6_, i_7_, 0);
	    IUnknown.Release(l);
	}
    }
    
    public void method15595(int i, int i_11_, int i_12_, int i_13_, int i_14_,
			    int i_15_, boolean bool, boolean bool_16_) {
	if (bool) {
	    long l = IDirect3DDevice.GetRenderTarget((aClass182_Sub1_Sub1_12123
						      .aLong11475),
						     0);
	    IDirect3DDevice.StretchRect(aClass182_Sub1_Sub1_12123.aLong11475,
					anInterface54Array12129[0].method10(),
					i, i_11_, i_12_, i_13_, l, i_14_,
					i_15_, i_12_, i_13_, 0);
	    IUnknown.Release(l);
	}
    }
    
    boolean method18789(int i, long l) {
	return Class361.method6305(IDirect3DDevice.SetRenderTarget
				   (aClass182_Sub1_Sub1_12123.aLong11475, i,
				    l));
    }
    
    public void method15596(int i, int i_17_, int i_18_, int i_19_, int i_20_,
			    int i_21_, boolean bool, boolean bool_22_) {
	if (bool) {
	    long l = IDirect3DDevice.GetRenderTarget((aClass182_Sub1_Sub1_12123
						      .aLong11475),
						     0);
	    IDirect3DDevice.StretchRect(aClass182_Sub1_Sub1_12123.aLong11475,
					anInterface54Array12129[0].method10(),
					i, i_17_, i_18_, i_19_, l, i_20_,
					i_21_, i_18_, i_19_, 0);
	    IUnknown.Release(l);
	}
    }
    
    public void method352() {
	if (anInterface51_12125 != null)
	    anInterface51_12125.method127();
	for (int i = 0; i < anInterface54Array12129.length; i++) {
	    if (anInterface54Array12129[i] != null)
		anInterface54Array12129[i].method127();
	}
    }
    
    void method18790() throws Throwable {
	method18788();
	super.finalize();
    }
    
    void method18791() throws Throwable {
	method18788();
	super.finalize();
    }
    
    void method18792() throws Throwable {
	method18788();
	super.finalize();
    }
    
    public void method221() {
	if (anInterface51_12125 != null)
	    anInterface51_12125.method127();
	for (int i = 0; i < anInterface54Array12129.length; i++) {
	    if (anInterface54Array12129[i] != null)
		anInterface54Array12129[i].method127();
	}
    }
    
    public boolean method15586() {
	return anInterface54Array12129[0] != null;
    }
    
    public void method222() {
	if (anInterface51_12125 != null)
	    anInterface51_12125.method127();
	for (int i = 0; i < anInterface54Array12129.length; i++) {
	    if (anInterface54Array12129[i] != null)
		anInterface54Array12129[i].method127();
	}
    }
    
    public boolean method15598() {
	return anInterface54Array12129[0] != null;
    }
    
    boolean method18793(int i, long l) {
	return Class361.method6305(IDirect3DDevice.SetRenderTarget
				   (aClass182_Sub1_Sub1_12123.aLong11475, i,
				    l));
    }
    
    boolean method18794(long l) {
	return Class361.method6305(IDirect3DDevice.SetDepthStencilSurface
				   (aClass182_Sub1_Sub1_12123.aLong11475, l));
    }
    
    void method18795() {
	if (anInterface51_12125 != null)
	    anInterface51_12125.method349();
	for (int i = 0; i < anInterface54Array12129.length; i++) {
	    if (anInterface54Array12129[i] != null)
		anInterface54Array12129[i].method349();
	}
    }
    
    void method18796() {
	if (anInterface51_12125 != null)
	    anInterface51_12125.method349();
	for (int i = 0; i < anInterface54Array12129.length; i++) {
	    if (anInterface54Array12129[i] != null)
		anInterface54Array12129[i].method349();
	}
    }
    
    void method18797() {
	if (anInterface51_12125 != null)
	    anInterface51_12125.method349();
	for (int i = 0; i < anInterface54Array12129.length; i++) {
	    if (anInterface54Array12129[i] != null)
		anInterface54Array12129[i].method349();
	}
    }
    
    public void method127() {
	if (anInterface51_12125 != null)
	    anInterface51_12125.method127();
	for (int i = 0; i < anInterface54Array12129.length; i++) {
	    if (anInterface54Array12129[i] != null)
		anInterface54Array12129[i].method127();
	}
    }
    
    void method18798() {
	if (anInterface51_12125 != null)
	    anInterface51_12125.method349();
	for (int i = 0; i < anInterface54Array12129.length; i++) {
	    if (anInterface54Array12129[i] != null)
		anInterface54Array12129[i].method349();
	}
    }
}
