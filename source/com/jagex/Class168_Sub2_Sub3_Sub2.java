/* Class168_Sub2_Sub3_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaggl.OpenGL;

public class Class168_Sub2_Sub3_Sub2 extends Class168_Sub2_Sub3
{
    int anInt12130;
    Class182_Sub1_Sub2 aClass182_Sub1_Sub2_12131;
    Interface55[] anInterface55Array12132 = new Interface55[4];
    int anInt12133;
    int anInt12134;
    static final int anInt12135 = 16;
    int anInt12136;
    Interface55 anInterface55_12137;
    int anInt12138;
    
    public void method15584(Interface22 interface22) {
	Interface55 interface55 = (Interface55) interface22;
	if (interface22 != null) {
	    if (anInt12133 != 0) {
		if (anInt12138 != interface55.method1()
		    || anInt12130 != interface55.method80())
		    throw new RuntimeException();
	    } else {
		anInt12130 = interface55.method80();
		anInt12138 = interface55.method1();
		method18178();
	    }
	    anInt12133 |= 0x10;
	    anInterface55_12137 = interface55;
	} else {
	    anInt12133 &= ~0x10;
	    anInterface55_12137 = null;
	    if (anInt12133 == 0) {
		anInt12130 = 0;
		anInt12138 = 0;
	    }
	}
	if (this == aClass182_Sub1_Sub2_12131.method3566(-758996511))
	    method18801();
	else
	    anInt12136 |= 0x10;
    }
    
    public int method2710() {
	return anInt12138;
    }
    
    public boolean method15588() {
	int i = OpenGL.glCheckFramebufferStatusEXT(36160);
	if (i != 36053)
	    return false;
	return true;
    }
    
    public void method15585(int i, Interface21 interface21) {
	int i_0_ = 1 << i;
	Interface55 interface55 = (Interface55) interface21;
	if (interface21 != null) {
	    if (anInt12133 != 0) {
		if (anInt12138 != interface55.method1()
		    || anInt12130 != interface55.method80())
		    throw new RuntimeException();
	    } else {
		anInt12130 = interface55.method80();
		anInt12138 = interface55.method1();
		method18178();
	    }
	    anInt12133 |= i_0_;
	    anInterface55Array12132[i] = interface55;
	} else {
	    anInt12133 &= i_0_ ^ 0xffffffff;
	    anInterface55Array12132[i] = null;
	    if (anInt12133 == 0) {
		anInt12130 = 0;
		anInt12138 = 0;
	    }
	}
	if (this == aClass182_Sub1_Sub2_12131.method3566(-477426982))
	    method18799(i);
	else
	    anInt12136 |= i_0_;
    }
    
    public boolean method15597() {
	int i = OpenGL.glCheckFramebufferStatusEXT(36160);
	if (i != 36053)
	    return false;
	return true;
    }
    
    void method18799(int i) {
	Interface55 interface55 = anInterface55Array12132[i];
	if (interface55 == null)
	    OpenGL.glFramebufferRenderbufferEXT(36160, 36064 + i, 36161, 0);
	else
	    interface55.method53(36064 + i);
    }
    
    Class168_Sub2_Sub3_Sub2(Class182_Sub1_Sub2 class182_sub1_sub2) {
	super((Class182_Sub1) class182_sub1_sub2);
	aClass182_Sub1_Sub2_12131 = class182_sub1_sub2;
	int[] is = new int[1];
	if (!aClass182_Sub1_Sub2_12131.aBool9302)
	    throw new RuntimeException("");
	OpenGL.glGenFramebuffersEXT(1, is, 0);
	anInt12134 = is[0];
    }
    
    public void method221() {
	if (anInt12134 != 0) {
	    aClass182_Sub1_Sub2_12131.method18119(anInt12134);
	    anInt12134 = 0;
	}
    }
    
    boolean method350() {
	OpenGL.glBindFramebufferEXT(36160, anInt12134);
	for (int i = 0; i < 4; i++) {
	    if ((anInt12136 & 1 << i) != 0)
		method18799(i);
	}
	if ((anInt12136 & 0x10) != 0)
	    method18801();
	anInt12136 = 0;
	return super.method350();
    }
    
    void method18800() throws Throwable {
	super.finalize();
	method127();
    }
    
    public void method15596(int i, int i_1_, int i_2_, int i_3_, int i_4_,
			    int i_5_, boolean bool, boolean bool_6_) {
	if (bool | bool_6_) {
	    int i_7_ = anInt12130;
	    int i_8_ = aClass182_Sub1_Sub2_12131.method3566(-729204637)
			   .method2711();
	    int i_9_ = 0;
	    if (bool_6_)
		i_9_ |= 0x100;
	    if (bool)
		i_9_ |= 0x4000;
	    OpenGL.glBindFramebufferEXT(36008, anInt12134);
	    OpenGL.glBlitFramebufferEXT(i, i_7_ - i_1_ - i_3_, i + i_2_,
					i_7_ - i_1_, i_4_, i_8_ - i_5_ - i_3_,
					i_4_ + i_2_, i_8_ - i_5_, i_9_, 9728);
	    OpenGL.glBindFramebufferEXT(36008, 0);
	}
    }
    
    public void method127() {
	if (anInt12134 != 0) {
	    aClass182_Sub1_Sub2_12131.method18119(anInt12134);
	    anInt12134 = 0;
	}
    }
    
    public void finalize() throws Throwable {
	super.finalize();
	method127();
    }
    
    public int method2711() {
	return anInt12130;
    }
    
    public int method2716() {
	return anInt12138;
    }
    
    public int method2714() {
	return anInt12130;
    }
    
    public void method15587(int i, Interface21 interface21) {
	int i_10_ = 1 << i;
	Interface55 interface55 = (Interface55) interface21;
	if (interface21 != null) {
	    if (anInt12133 != 0) {
		if (anInt12138 != interface55.method1()
		    || anInt12130 != interface55.method80())
		    throw new RuntimeException();
	    } else {
		anInt12130 = interface55.method80();
		anInt12138 = interface55.method1();
		method18178();
	    }
	    anInt12133 |= i_10_;
	    anInterface55Array12132[i] = interface55;
	} else {
	    anInt12133 &= i_10_ ^ 0xffffffff;
	    anInterface55Array12132[i] = null;
	    if (anInt12133 == 0) {
		anInt12130 = 0;
		anInt12138 = 0;
	    }
	}
	if (this == aClass182_Sub1_Sub2_12131.method3566(159208746))
	    method18799(i);
	else
	    anInt12136 |= i_10_;
    }
    
    public void method15589(int i, Interface21 interface21) {
	int i_11_ = 1 << i;
	Interface55 interface55 = (Interface55) interface21;
	if (interface21 != null) {
	    if (anInt12133 != 0) {
		if (anInt12138 != interface55.method1()
		    || anInt12130 != interface55.method80())
		    throw new RuntimeException();
	    } else {
		anInt12130 = interface55.method80();
		anInt12138 = interface55.method1();
		method18178();
	    }
	    anInt12133 |= i_11_;
	    anInterface55Array12132[i] = interface55;
	} else {
	    anInt12133 &= i_11_ ^ 0xffffffff;
	    anInterface55Array12132[i] = null;
	    if (anInt12133 == 0) {
		anInt12130 = 0;
		anInt12138 = 0;
	    }
	}
	if (this == aClass182_Sub1_Sub2_12131.method3566(465681246))
	    method18799(i);
	else
	    anInt12136 |= i_11_;
    }
    
    public void method15590(int i, Interface21 interface21) {
	int i_12_ = 1 << i;
	Interface55 interface55 = (Interface55) interface21;
	if (interface21 != null) {
	    if (anInt12133 != 0) {
		if (anInt12138 != interface55.method1()
		    || anInt12130 != interface55.method80())
		    throw new RuntimeException();
	    } else {
		anInt12130 = interface55.method80();
		anInt12138 = interface55.method1();
		method18178();
	    }
	    anInt12133 |= i_12_;
	    anInterface55Array12132[i] = interface55;
	} else {
	    anInt12133 &= i_12_ ^ 0xffffffff;
	    anInterface55Array12132[i] = null;
	    if (anInt12133 == 0) {
		anInt12130 = 0;
		anInt12138 = 0;
	    }
	}
	if (this == aClass182_Sub1_Sub2_12131.method3566(-354755471))
	    method18799(i);
	else
	    anInt12136 |= i_12_;
    }
    
    public void method15591(int i, Interface21 interface21) {
	int i_13_ = 1 << i;
	Interface55 interface55 = (Interface55) interface21;
	if (interface21 != null) {
	    if (anInt12133 != 0) {
		if (anInt12138 != interface55.method1()
		    || anInt12130 != interface55.method80())
		    throw new RuntimeException();
	    } else {
		anInt12130 = interface55.method80();
		anInt12138 = interface55.method1();
		method18178();
	    }
	    anInt12133 |= i_13_;
	    anInterface55Array12132[i] = interface55;
	} else {
	    anInt12133 &= i_13_ ^ 0xffffffff;
	    anInterface55Array12132[i] = null;
	    if (anInt12133 == 0) {
		anInt12130 = 0;
		anInt12138 = 0;
	    }
	}
	if (this == aClass182_Sub1_Sub2_12131.method3566(-1996250827))
	    method18799(i);
	else
	    anInt12136 |= i_13_;
    }
    
    boolean method2717() {
	OpenGL.glBindFramebufferEXT(36160, 0);
	return true;
    }
    
    public int method2713() {
	return anInt12138;
    }
    
    boolean method351() {
	OpenGL.glBindFramebufferEXT(36160, anInt12134);
	for (int i = 0; i < 4; i++) {
	    if ((anInt12136 & 1 << i) != 0)
		method18799(i);
	}
	if ((anInt12136 & 0x10) != 0)
	    method18801();
	anInt12136 = 0;
	return super.method350();
    }
    
    boolean method2709() {
	OpenGL.glBindFramebufferEXT(36160, 0);
	return true;
    }
    
    boolean method2715() {
	OpenGL.glBindFramebufferEXT(36160, 0);
	return true;
    }
    
    public void method15594(int i, int i_14_, int i_15_, int i_16_, int i_17_,
			    int i_18_, boolean bool, boolean bool_19_) {
	if (bool | bool_19_) {
	    int i_20_ = anInt12130;
	    int i_21_ = aClass182_Sub1_Sub2_12131.method3566(-2047803767)
			    .method2711();
	    int i_22_ = 0;
	    if (bool_19_)
		i_22_ |= 0x100;
	    if (bool)
		i_22_ |= 0x4000;
	    OpenGL.glBindFramebufferEXT(36008, anInt12134);
	    OpenGL.glBlitFramebufferEXT(i, i_20_ - i_14_ - i_16_, i + i_15_,
					i_20_ - i_14_, i_17_,
					i_21_ - i_18_ - i_16_, i_17_ + i_15_,
					i_21_ - i_18_, i_22_, 9728);
	    OpenGL.glBindFramebufferEXT(36008, 0);
	}
    }
    
    boolean method2712() {
	OpenGL.glBindFramebufferEXT(36160, 0);
	return true;
    }
    
    public void method15595(int i, int i_23_, int i_24_, int i_25_, int i_26_,
			    int i_27_, boolean bool, boolean bool_28_) {
	if (bool | bool_28_) {
	    int i_29_ = anInt12130;
	    int i_30_ = aClass182_Sub1_Sub2_12131.method3566(-215636653)
			    .method2711();
	    int i_31_ = 0;
	    if (bool_28_)
		i_31_ |= 0x100;
	    if (bool)
		i_31_ |= 0x4000;
	    OpenGL.glBindFramebufferEXT(36008, anInt12134);
	    OpenGL.glBlitFramebufferEXT(i, i_29_ - i_23_ - i_25_, i + i_24_,
					i_29_ - i_23_, i_26_,
					i_30_ - i_27_ - i_25_, i_26_ + i_24_,
					i_30_ - i_27_, i_31_, 9728);
	    OpenGL.glBindFramebufferEXT(36008, 0);
	}
    }
    
    public void method352() {
	if (anInt12134 != 0) {
	    aClass182_Sub1_Sub2_12131.method18119(anInt12134);
	    anInt12134 = 0;
	}
    }
    
    public void method222() {
	if (anInt12134 != 0) {
	    aClass182_Sub1_Sub2_12131.method18119(anInt12134);
	    anInt12134 = 0;
	}
    }
    
    void method18801() {
	if (anInterface55_12137 == null)
	    OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
	else
	    anInterface55_12137.method53(36096);
    }
    
    void method18802() throws Throwable {
	super.finalize();
	method127();
    }
    
    void method18803() throws Throwable {
	super.finalize();
	method127();
    }
    
    public void method15592(Interface22 interface22) {
	Interface55 interface55 = (Interface55) interface22;
	if (interface22 != null) {
	    if (anInt12133 != 0) {
		if (anInt12138 != interface55.method1()
		    || anInt12130 != interface55.method80())
		    throw new RuntimeException();
	    } else {
		anInt12130 = interface55.method80();
		anInt12138 = interface55.method1();
		method18178();
	    }
	    anInt12133 |= 0x10;
	    anInterface55_12137 = interface55;
	} else {
	    anInt12133 &= ~0x10;
	    anInterface55_12137 = null;
	    if (anInt12133 == 0) {
		anInt12130 = 0;
		anInt12138 = 0;
	    }
	}
	if (this == aClass182_Sub1_Sub2_12131.method3566(459550171))
	    method18801();
	else
	    anInt12136 |= 0x10;
    }
    
    void method18804() throws Throwable {
	super.finalize();
	method127();
    }
    
    public boolean method15586() {
	int i = OpenGL.glCheckFramebufferStatusEXT(36160);
	if (i != 36053)
	    return false;
	return true;
    }
    
    public void method15593(Interface22 interface22) {
	Interface55 interface55 = (Interface55) interface22;
	if (interface22 != null) {
	    if (anInt12133 != 0) {
		if (anInt12138 != interface55.method1()
		    || anInt12130 != interface55.method80())
		    throw new RuntimeException();
	    } else {
		anInt12130 = interface55.method80();
		anInt12138 = interface55.method1();
		method18178();
	    }
	    anInt12133 |= 0x10;
	    anInterface55_12137 = interface55;
	} else {
	    anInt12133 &= ~0x10;
	    anInterface55_12137 = null;
	    if (anInt12133 == 0) {
		anInt12130 = 0;
		anInt12138 = 0;
	    }
	}
	if (this == aClass182_Sub1_Sub2_12131.method3566(-2056146950))
	    method18801();
	else
	    anInt12136 |= 0x10;
    }
    
    public boolean method15598() {
	int i = OpenGL.glCheckFramebufferStatusEXT(36160);
	if (i != 36053)
	    return false;
	return true;
    }
    
    void method18805(int i) {
	Interface55 interface55 = anInterface55Array12132[i];
	if (interface55 == null)
	    OpenGL.glFramebufferRenderbufferEXT(36160, 36064 + i, 36161, 0);
	else
	    interface55.method53(36064 + i);
    }
    
    void method18806() {
	if (anInterface55_12137 == null)
	    OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
	else
	    anInterface55_12137.method53(36096);
    }
}
