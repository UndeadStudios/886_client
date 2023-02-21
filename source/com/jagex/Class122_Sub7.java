/* Class122_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaggl.OpenGL;

public class Class122_Sub7 extends Class122
{
    Class140 aClass140_8962;
    static final char aChar8963 = '\0';
    Class126 aClass126_8964;
    static final char aChar8965 = '\001';
    static float[] aFloatArray8966 = new float[4];
    
    boolean method2118() {
	return true;
    }
    
    boolean method2117() {
	return true;
    }
    
    void method2106(boolean bool) {
	aClass126_8964.method2234('\0');
	if (aClass140_8962.aBool1647) {
	    aClass182_Sub3_1445.method15394(1);
	    aClass182_Sub3_1445
		.method15395(aClass140_8962.aClass136_Sub1_1651);
	    aClass182_Sub3_1445.method15394(0);
	}
    }
    
    void method2116(boolean bool) {
	/* empty */
    }
    
    void method2109(Class136 class136, int i) {
	aClass182_Sub3_1445.method15395(class136);
	aClass182_Sub3_1445.method15396(i);
    }
    
    void method2107(int i, int i_0_) {
	float f = -5.0E-4F * (float) ((i & 0x3) + 1);
	float f_1_ = 5.0E-4F * (float) ((i >> 3 & 0x3) + 1);
	float f_2_ = (i & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
	boolean bool = (i & 0x80) != 0;
	aClass182_Sub3_1445.method15394(1);
	if (bool) {
	    aFloatArray8966[0] = f_2_;
	    aFloatArray8966[1] = 0.0F;
	    aFloatArray8966[2] = 0.0F;
	    aFloatArray8966[3] = 0.0F;
	} else {
	    aFloatArray8966[0] = 0.0F;
	    aFloatArray8966[1] = 0.0F;
	    aFloatArray8966[2] = f_2_;
	    aFloatArray8966[3] = 0.0F;
	}
	OpenGL.glTexGenfv(8192, 9474, aFloatArray8966, 0);
	aFloatArray8966[0] = 0.0F;
	aFloatArray8966[1] = f_2_;
	aFloatArray8966[2] = 0.0F;
	aFloatArray8966[3] = (float) aClass182_Sub3_1445.anInt9721 * f % 1.0F;
	OpenGL.glTexGenfv(8193, 9474, aFloatArray8966, 0);
	if (!aClass140_8962.aBool1647) {
	    int i_3_
		= (int) (f_1_ * (float) aClass182_Sub3_1445.anInt9721 * 16.0F);
	    aClass182_Sub3_1445.method15395(aClass140_8962
					    .aClass136_Sub2Array1655
					    [i_3_ % 16]);
	} else {
	    aFloatArray8966[0] = 0.0F;
	    aFloatArray8966[1] = 0.0F;
	    aFloatArray8966[2] = 0.0F;
	    aFloatArray8966[3]
		= (float) aClass182_Sub3_1445.anInt9721 * f_1_ % 1.0F;
	    OpenGL.glTexGenfv(8194, 9473, aFloatArray8966, 0);
	}
	aClass182_Sub3_1445.method15394(0);
    }
    
    void method2108() {
	aClass126_8964.method2234('\001');
	aClass182_Sub3_1445.method15394(1);
	aClass182_Sub3_1445.method15395(null);
	aClass182_Sub3_1445.method15394(0);
    }
    
    void method2111() {
	aClass126_8964.method2234('\001');
	aClass182_Sub3_1445.method15394(1);
	aClass182_Sub3_1445.method15395(null);
	aClass182_Sub3_1445.method15394(0);
    }
    
    void method2110(Class136 class136, int i) {
	aClass182_Sub3_1445.method15395(class136);
	aClass182_Sub3_1445.method15396(i);
    }
    
    void method2113(boolean bool) {
	aClass126_8964.method2234('\0');
	if (aClass140_8962.aBool1647) {
	    aClass182_Sub3_1445.method15394(1);
	    aClass182_Sub3_1445
		.method15395(aClass140_8962.aClass136_Sub1_1651);
	    aClass182_Sub3_1445.method15394(0);
	}
    }
    
    void method2114(boolean bool) {
	/* empty */
    }
    
    void method2115(boolean bool) {
	/* empty */
    }
    
    void method2112(boolean bool) {
	aClass126_8964.method2234('\0');
	if (aClass140_8962.aBool1647) {
	    aClass182_Sub3_1445.method15394(1);
	    aClass182_Sub3_1445
		.method15395(aClass140_8962.aClass136_Sub1_1651);
	    aClass182_Sub3_1445.method15394(0);
	}
    }
    
    void method2105(int i, int i_4_) {
	float f = -5.0E-4F * (float) ((i & 0x3) + 1);
	float f_5_ = 5.0E-4F * (float) ((i >> 3 & 0x3) + 1);
	float f_6_ = (i & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
	boolean bool = (i & 0x80) != 0;
	aClass182_Sub3_1445.method15394(1);
	if (bool) {
	    aFloatArray8966[0] = f_6_;
	    aFloatArray8966[1] = 0.0F;
	    aFloatArray8966[2] = 0.0F;
	    aFloatArray8966[3] = 0.0F;
	} else {
	    aFloatArray8966[0] = 0.0F;
	    aFloatArray8966[1] = 0.0F;
	    aFloatArray8966[2] = f_6_;
	    aFloatArray8966[3] = 0.0F;
	}
	OpenGL.glTexGenfv(8192, 9474, aFloatArray8966, 0);
	aFloatArray8966[0] = 0.0F;
	aFloatArray8966[1] = f_6_;
	aFloatArray8966[2] = 0.0F;
	aFloatArray8966[3] = (float) aClass182_Sub3_1445.anInt9721 * f % 1.0F;
	OpenGL.glTexGenfv(8193, 9474, aFloatArray8966, 0);
	if (!aClass140_8962.aBool1647) {
	    int i_7_
		= (int) (f_5_ * (float) aClass182_Sub3_1445.anInt9721 * 16.0F);
	    aClass182_Sub3_1445.method15395(aClass140_8962
					    .aClass136_Sub2Array1655
					    [i_7_ % 16]);
	} else {
	    aFloatArray8966[0] = 0.0F;
	    aFloatArray8966[1] = 0.0F;
	    aFloatArray8966[2] = 0.0F;
	    aFloatArray8966[3]
		= (float) aClass182_Sub3_1445.anInt9721 * f_5_ % 1.0F;
	    OpenGL.glTexGenfv(8194, 9473, aFloatArray8966, 0);
	}
	aClass182_Sub3_1445.method15394(0);
    }
    
    Class122_Sub7(Class182_Sub3 class182_sub3, Class140 class140) {
	super(class182_sub3);
	aClass140_8962 = class140;
	aClass126_8964 = new Class126(class182_sub3, 2);
	aClass126_8964.method2233(0);
	aClass182_Sub3_1445.method15394(1);
	if (aClass140_8962.aBool1647) {
	    OpenGL.glTexGeni(8194, 9472, 9217);
	    OpenGL.glEnable(3170);
	}
	OpenGL.glTexGeni(8192, 9472, 9216);
	OpenGL.glTexGeni(8193, 9472, 9216);
	OpenGL.glEnable(3168);
	OpenGL.glEnable(3169);
	aClass182_Sub3_1445.method15394(0);
	aClass126_8964.method2238();
	aClass126_8964.method2233(1);
	aClass182_Sub3_1445.method15394(1);
	if (aClass140_8962.aBool1647)
	    OpenGL.glDisable(3170);
	OpenGL.glDisable(3168);
	OpenGL.glDisable(3169);
	aClass182_Sub3_1445.method15394(0);
	aClass126_8964.method2238();
    }
}
