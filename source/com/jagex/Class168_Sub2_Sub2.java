/* Class168_Sub2_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaggl.OpenGL;

public class Class168_Sub2_Sub2 extends Class168_Sub2
{
    int anInt11553;
    static final int anInt11554 = 16;
    int anInt11555;
    Interface19[] anInterface19Array11556 = new Interface19[4];
    int anInt11557;
    int anInt11558;
    int anInt11559;
    Interface19 anInterface19_11560;
    Class182_Sub3 aClass182_Sub3_11561;
    
    public int method2713() {
	return anInt11553;
    }
    
    public int method2710() {
	return anInt11553;
    }
    
    public int method2711() {
	return anInt11557;
    }
    
    public void method15585(int i, Interface21 interface21) {
	int i_0_ = 1 << i;
	Interface19 interface19 = (Interface19) interface21;
	if (interface21 != null) {
	    if ((anInt11558 | i_0_) != i_0_) {
		if (anInt11553 != interface19.method1()
		    || anInt11557 != interface19.method80())
		    throw new RuntimeException();
	    } else {
		anInt11557 = interface19.method80();
		anInt11553 = interface19.method1();
		if (this == aClass182_Sub3_11561.method3566(-1192515331))
		    aClass182_Sub3_11561.method15417();
	    }
	    anInt11558 |= i_0_;
	    anInterface19Array11556[i] = interface19;
	} else {
	    anInt11558 &= i_0_ ^ 0xffffffff;
	    anInterface19Array11556[i] = null;
	    if (anInt11558 == 0) {
		anInt11557 = 0;
		anInt11553 = 0;
	    }
	}
	if (this == aClass182_Sub3_11561.method3566(-1481827008))
	    method18159(i);
	else
	    anInt11559 |= i_0_;
    }
    
    void method18153() {
	if (anInterface19_11560 == null)
	    OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
	else
	    anInterface19_11560.method53(36096);
    }
    
    void method18154() throws Throwable {
	super.finalize();
	method127();
    }
    
    boolean method2717() {
	OpenGL.glBindFramebufferEXT(36160, 0);
	return true;
    }
    
    public boolean method15588() {
	int i = OpenGL.glCheckFramebufferStatusEXT(36160);
	if (i != 36053)
	    return false;
	return true;
    }
    
    boolean method350() {
	OpenGL.glBindFramebufferEXT(36160, anInt11555);
	for (int i = 0; i < 4; i++) {
	    if ((anInt11559 & 1 << i) != 0)
		method18159(i);
	}
	if ((anInt11559 & 0x10) != 0)
	    method18153();
	anInt11559 = 0;
	aClass182_Sub3_11561.method15567();
	return true;
    }
    
    boolean method2712() {
	OpenGL.glBindFramebufferEXT(36160, 0);
	return true;
    }
    
    void method18155(int i) {
	OpenGL.glDrawBuffer(36064 + i);
    }
    
    public void method15596(int i, int i_1_, int i_2_, int i_3_, int i_4_,
			    int i_5_, boolean bool, boolean bool_6_) {
	if (bool | bool_6_) {
	    int i_7_ = anInt11557;
	    int i_8_
		= aClass182_Sub3_11561.method3566(-479913542).method2711();
	    int i_9_ = 0;
	    if (bool_6_)
		i_9_ |= 0x100;
	    if (bool)
		i_9_ |= 0x4000;
	    OpenGL.glBindFramebufferEXT(36008, anInt11555);
	    OpenGL.glBlitFramebufferEXT(i, i_7_ - i_1_ - i_3_, i + i_2_,
					i_7_ - i_1_, i_4_, i_8_ - i_5_ - i_3_,
					i_4_ + i_2_, i_8_ - i_5_, i_9_, 9728);
	    OpenGL.glBindFramebufferEXT(36008, 0);
	}
    }
    
    void method18156(int i) {
	OpenGL.glDrawBuffer(36064 + i);
    }
    
    public void finalize() throws Throwable {
	super.finalize();
	method127();
    }
    
    public void method15592(Interface22 interface22) {
	Interface19 interface19 = (Interface19) interface22;
	if (interface22 != null) {
	    if ((anInt11558 | 0x10) != 16) {
		if (anInt11553 != interface19.method1()
		    || anInt11557 != interface19.method80())
		    throw new RuntimeException();
	    } else {
		anInt11557 = interface19.method80();
		anInt11553 = interface19.method1();
		if (this == aClass182_Sub3_11561.method3566(456735927))
		    aClass182_Sub3_11561.method15417();
	    }
	    anInt11558 |= 0x10;
	    anInterface19_11560 = interface19;
	} else {
	    anInt11558 &= ~0x10;
	    anInterface19_11560 = null;
	    if (anInt11558 == 0) {
		anInt11557 = 0;
		anInt11553 = 0;
	    }
	}
	if (this == aClass182_Sub3_11561.method3566(-832049710))
	    method18153();
	else
	    anInt11559 |= 0x10;
    }
    
    public int method2716() {
	return anInt11553;
    }
    
    public int method2714() {
	return anInt11557;
    }
    
    public void method15587(int i, Interface21 interface21) {
	int i_10_ = 1 << i;
	Interface19 interface19 = (Interface19) interface21;
	if (interface21 != null) {
	    if ((anInt11558 | i_10_) != i_10_) {
		if (anInt11553 != interface19.method1()
		    || anInt11557 != interface19.method80())
		    throw new RuntimeException();
	    } else {
		anInt11557 = interface19.method80();
		anInt11553 = interface19.method1();
		if (this == aClass182_Sub3_11561.method3566(-455949065))
		    aClass182_Sub3_11561.method15417();
	    }
	    anInt11558 |= i_10_;
	    anInterface19Array11556[i] = interface19;
	} else {
	    anInt11558 &= i_10_ ^ 0xffffffff;
	    anInterface19Array11556[i] = null;
	    if (anInt11558 == 0) {
		anInt11557 = 0;
		anInt11553 = 0;
	    }
	}
	if (this == aClass182_Sub3_11561.method3566(-704995085))
	    method18159(i);
	else
	    anInt11559 |= i_10_;
    }
    
    public void method15591(int i, Interface21 interface21) {
	int i_11_ = 1 << i;
	Interface19 interface19 = (Interface19) interface21;
	if (interface21 != null) {
	    if ((anInt11558 | i_11_) != i_11_) {
		if (anInt11553 != interface19.method1()
		    || anInt11557 != interface19.method80())
		    throw new RuntimeException();
	    } else {
		anInt11557 = interface19.method80();
		anInt11553 = interface19.method1();
		if (this == aClass182_Sub3_11561.method3566(533455741))
		    aClass182_Sub3_11561.method15417();
	    }
	    anInt11558 |= i_11_;
	    anInterface19Array11556[i] = interface19;
	} else {
	    anInt11558 &= i_11_ ^ 0xffffffff;
	    anInterface19Array11556[i] = null;
	    if (anInt11558 == 0) {
		anInt11557 = 0;
		anInt11553 = 0;
	    }
	}
	if (this == aClass182_Sub3_11561.method3566(-1167330754))
	    method18159(i);
	else
	    anInt11559 |= i_11_;
    }
    
    public void method15590(int i, Interface21 interface21) {
	int i_12_ = 1 << i;
	Interface19 interface19 = (Interface19) interface21;
	if (interface21 != null) {
	    if ((anInt11558 | i_12_) != i_12_) {
		if (anInt11553 != interface19.method1()
		    || anInt11557 != interface19.method80())
		    throw new RuntimeException();
	    } else {
		anInt11557 = interface19.method80();
		anInt11553 = interface19.method1();
		if (this == aClass182_Sub3_11561.method3566(476446469))
		    aClass182_Sub3_11561.method15417();
	    }
	    anInt11558 |= i_12_;
	    anInterface19Array11556[i] = interface19;
	} else {
	    anInt11558 &= i_12_ ^ 0xffffffff;
	    anInterface19Array11556[i] = null;
	    if (anInt11558 == 0) {
		anInt11557 = 0;
		anInt11553 = 0;
	    }
	}
	if (this == aClass182_Sub3_11561.method3566(585936118))
	    method18159(i);
	else
	    anInt11559 |= i_12_;
    }
    
    public void method15584(Interface22 interface22) {
	Interface19 interface19 = (Interface19) interface22;
	if (interface22 != null) {
	    if ((anInt11558 | 0x10) != 16) {
		if (anInt11553 != interface19.method1()
		    || anInt11557 != interface19.method80())
		    throw new RuntimeException();
	    } else {
		anInt11557 = interface19.method80();
		anInt11553 = interface19.method1();
		if (this == aClass182_Sub3_11561.method3566(-300810999))
		    aClass182_Sub3_11561.method15417();
	    }
	    anInt11558 |= 0x10;
	    anInterface19_11560 = interface19;
	} else {
	    anInt11558 &= ~0x10;
	    anInterface19_11560 = null;
	    if (anInt11558 == 0) {
		anInt11557 = 0;
		anInt11553 = 0;
	    }
	}
	if (this == aClass182_Sub3_11561.method3566(-1857193886))
	    method18153();
	else
	    anInt11559 |= 0x10;
    }
    
    public void method15589(int i, Interface21 interface21) {
	int i_13_ = 1 << i;
	Interface19 interface19 = (Interface19) interface21;
	if (interface21 != null) {
	    if ((anInt11558 | i_13_) != i_13_) {
		if (anInt11553 != interface19.method1()
		    || anInt11557 != interface19.method80())
		    throw new RuntimeException();
	    } else {
		anInt11557 = interface19.method80();
		anInt11553 = interface19.method1();
		if (this == aClass182_Sub3_11561.method3566(45083918))
		    aClass182_Sub3_11561.method15417();
	    }
	    anInt11558 |= i_13_;
	    anInterface19Array11556[i] = interface19;
	} else {
	    anInt11558 &= i_13_ ^ 0xffffffff;
	    anInterface19Array11556[i] = null;
	    if (anInt11558 == 0) {
		anInt11557 = 0;
		anInt11553 = 0;
	    }
	}
	if (this == aClass182_Sub3_11561.method3566(-240094257))
	    method18159(i);
	else
	    anInt11559 |= i_13_;
    }
    
    public void method15593(Interface22 interface22) {
	Interface19 interface19 = (Interface19) interface22;
	if (interface22 != null) {
	    if ((anInt11558 | 0x10) != 16) {
		if (anInt11553 != interface19.method1()
		    || anInt11557 != interface19.method80())
		    throw new RuntimeException();
	    } else {
		anInt11557 = interface19.method80();
		anInt11553 = interface19.method1();
		if (this == aClass182_Sub3_11561.method3566(-1240450658))
		    aClass182_Sub3_11561.method15417();
	    }
	    anInt11558 |= 0x10;
	    anInterface19_11560 = interface19;
	} else {
	    anInt11558 &= ~0x10;
	    anInterface19_11560 = null;
	    if (anInt11558 == 0) {
		anInt11557 = 0;
		anInt11553 = 0;
	    }
	}
	if (this == aClass182_Sub3_11561.method3566(-1768691485))
	    method18153();
	else
	    anInt11559 |= 0x10;
    }
    
    void method18157(int i) {
	Interface19 interface19 = anInterface19Array11556[i];
	if (interface19 == null)
	    OpenGL.glFramebufferRenderbufferEXT(36160, 36064 + i, 36161, 0);
	else
	    interface19.method53(36064 + i);
    }
    
    boolean method2709() {
	OpenGL.glBindFramebufferEXT(36160, 0);
	return true;
    }
    
    boolean method2715() {
	OpenGL.glBindFramebufferEXT(36160, 0);
	return true;
    }
    
    public void method127() {
	if (anInt11555 != 0) {
	    aClass182_Sub3_11561.method15416(anInt11555);
	    anInt11555 = 0;
	}
    }
    
    public void method15594(int i, int i_14_, int i_15_, int i_16_, int i_17_,
			    int i_18_, boolean bool, boolean bool_19_) {
	if (bool | bool_19_) {
	    int i_20_ = anInt11557;
	    int i_21_
		= aClass182_Sub3_11561.method3566(-567951446).method2711();
	    int i_22_ = 0;
	    if (bool_19_)
		i_22_ |= 0x100;
	    if (bool)
		i_22_ |= 0x4000;
	    OpenGL.glBindFramebufferEXT(36008, anInt11555);
	    OpenGL.glBlitFramebufferEXT(i, i_20_ - i_14_ - i_16_, i + i_15_,
					i_20_ - i_14_, i_17_,
					i_21_ - i_18_ - i_16_, i_17_ + i_15_,
					i_21_ - i_18_, i_22_, 9728);
	    OpenGL.glBindFramebufferEXT(36008, 0);
	}
    }
    
    public void method222() {
	if (anInt11555 != 0) {
	    aClass182_Sub3_11561.method15416(anInt11555);
	    anInt11555 = 0;
	}
    }
    
    public void method352() {
	if (anInt11555 != 0) {
	    aClass182_Sub3_11561.method15416(anInt11555);
	    anInt11555 = 0;
	}
    }
    
    public void method221() {
	if (anInt11555 != 0) {
	    aClass182_Sub3_11561.method15416(anInt11555);
	    anInt11555 = 0;
	}
    }
    
    void method18158() throws Throwable {
	super.finalize();
	method127();
    }
    
    void method18159(int i) {
	Interface19 interface19 = anInterface19Array11556[i];
	if (interface19 == null)
	    OpenGL.glFramebufferRenderbufferEXT(36160, 36064 + i, 36161, 0);
	else
	    interface19.method53(36064 + i);
    }
    
    void method18160() throws Throwable {
	super.finalize();
	method127();
    }
    
    void method18161() throws Throwable {
	super.finalize();
	method127();
    }
    
    Class168_Sub2_Sub2(Class182_Sub3 class182_sub3) {
	if (!class182_sub3.aBool9797)
	    throw new IllegalStateException("");
	aClass182_Sub3_11561 = class182_sub3;
	int[] is = new int[1];
	OpenGL.glGenFramebuffersEXT(1, is, 0);
	anInt11555 = is[0];
    }
    
    public void method15595(int i, int i_23_, int i_24_, int i_25_, int i_26_,
			    int i_27_, boolean bool, boolean bool_28_) {
	if (bool | bool_28_) {
	    int i_29_ = anInt11557;
	    int i_30_
		= aClass182_Sub3_11561.method3566(-121702818).method2711();
	    int i_31_ = 0;
	    if (bool_28_)
		i_31_ |= 0x100;
	    if (bool)
		i_31_ |= 0x4000;
	    OpenGL.glBindFramebufferEXT(36008, anInt11555);
	    OpenGL.glBlitFramebufferEXT(i, i_29_ - i_23_ - i_25_, i + i_24_,
					i_29_ - i_23_, i_26_,
					i_30_ - i_27_ - i_25_, i_26_ + i_24_,
					i_30_ - i_27_, i_31_, 9728);
	    OpenGL.glBindFramebufferEXT(36008, 0);
	}
    }
    
    void method18162(int i) {
	Interface19 interface19 = anInterface19Array11556[i];
	if (interface19 == null)
	    OpenGL.glFramebufferRenderbufferEXT(36160, 36064 + i, 36161, 0);
	else
	    interface19.method53(36064 + i);
    }
    
    void method18163() {
	if (anInterface19_11560 == null)
	    OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
	else
	    anInterface19_11560.method53(36096);
    }
    
    void method18164() {
	if (anInterface19_11560 == null)
	    OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
	else
	    anInterface19_11560.method53(36096);
    }
    
    public boolean method15586() {
	int i = OpenGL.glCheckFramebufferStatusEXT(36160);
	if (i != 36053)
	    return false;
	return true;
    }
    
    public boolean method15597() {
	int i = OpenGL.glCheckFramebufferStatusEXT(36160);
	if (i != 36053)
	    return false;
	return true;
    }
    
    public boolean method15598() {
	int i = OpenGL.glCheckFramebufferStatusEXT(36160);
	if (i != 36053)
	    return false;
	return true;
    }
    
    boolean method351() {
	OpenGL.glBindFramebufferEXT(36160, anInt11555);
	for (int i = 0; i < 4; i++) {
	    if ((anInt11559 & 1 << i) != 0)
		method18159(i);
	}
	if ((anInt11559 & 0x10) != 0)
	    method18153();
	anInt11559 = 0;
	aClass182_Sub3_11561.method15567();
	return true;
    }
}
