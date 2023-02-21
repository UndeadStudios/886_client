/* Class122_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaggl.OpenGL;

public class Class122_Sub4 extends Class122
{
    Class140 aClass140_8938;
    static final char aChar8939 = '\001';
    Class136_Sub4 aClass136_Sub4_8940;
    static final char aChar8941 = '\0';
    Class126 aClass126_8942;
    static float[] aFloatArray8943 = { 0.0F, 0.0F, 0.0F, 0.0F };
    
    void method2106(boolean bool) {
	if (aClass182_Sub3_1445.anInt9768 > 0) {
	    float f = -0.5F / (float) aClass182_Sub3_1445.anInt9768;
	    aClass182_Sub3_1445.method15394(1);
	    aFloatArray8943[0] = 0.0F;
	    aFloatArray8943[1] = 0.0F;
	    aFloatArray8943[2] = f;
	    aFloatArray8943[3] = aClass182_Sub3_1445.aFloat9770 * f + 0.25F;
	    OpenGL.glPushMatrix();
	    OpenGL.glLoadIdentity();
	    OpenGL.glTexGenfv(8192, 9474, aFloatArray8943, 0);
	    OpenGL.glPopMatrix();
	    aClass182_Sub3_1445
		.method15368(0.5F, (float) aClass182_Sub3_1445.anInt9768);
	    aClass182_Sub3_1445.method15395(aClass136_Sub4_8940);
	    aClass182_Sub3_1445.method15394(0);
	}
	aClass126_8942.method2234('\0');
	OpenGL.glMatrixMode(5890);
	OpenGL.glPushMatrix();
	OpenGL.glScalef(0.25F, 0.25F, 1.0F);
	OpenGL.glMatrixMode(5888);
    }
    
    void method2110(Class136 class136, int i) {
	/* empty */
    }
    
    void method2107(int i, int i_0_) {
	if ((i & 0x1) == 1) {
	    if (aClass140_8938.aBool1647) {
		aClass182_Sub3_1445
		    .method15395(aClass140_8938.aClass136_Sub1_1649);
		aFloatArray8943[0] = 0.0F;
		aFloatArray8943[1] = 0.0F;
		aFloatArray8943[2] = 0.0F;
		aFloatArray8943[3]
		    = (float) (aClass182_Sub3_1445.anInt9721 % 4000) / 4000.0F;
		OpenGL.glTexGenfv(8194, 9473, aFloatArray8943, 0);
	    } else {
		int i_1_ = aClass182_Sub3_1445.anInt9721 % 4000 * 16 / 4000;
		aClass182_Sub3_1445
		    .method15395(aClass140_8938.aClass136_Sub2Array1646[i_1_]);
	    }
	} else if (aClass140_8938.aBool1647) {
	    aClass182_Sub3_1445
		.method15395(aClass140_8938.aClass136_Sub1_1649);
	    aFloatArray8943[0] = 0.0F;
	    aFloatArray8943[1] = 0.0F;
	    aFloatArray8943[2] = 0.0F;
	    aFloatArray8943[3] = 0.0F;
	    OpenGL.glTexGenfv(8194, 9473, aFloatArray8943, 0);
	} else
	    aClass182_Sub3_1445
		.method15395(aClass140_8938.aClass136_Sub2Array1646[0]);
    }
    
    void method2112(boolean bool) {
	if (aClass182_Sub3_1445.anInt9768 > 0) {
	    float f = -0.5F / (float) aClass182_Sub3_1445.anInt9768;
	    aClass182_Sub3_1445.method15394(1);
	    aFloatArray8943[0] = 0.0F;
	    aFloatArray8943[1] = 0.0F;
	    aFloatArray8943[2] = f;
	    aFloatArray8943[3] = aClass182_Sub3_1445.aFloat9770 * f + 0.25F;
	    OpenGL.glPushMatrix();
	    OpenGL.glLoadIdentity();
	    OpenGL.glTexGenfv(8192, 9474, aFloatArray8943, 0);
	    OpenGL.glPopMatrix();
	    aClass182_Sub3_1445
		.method15368(0.5F, (float) aClass182_Sub3_1445.anInt9768);
	    aClass182_Sub3_1445.method15395(aClass136_Sub4_8940);
	    aClass182_Sub3_1445.method15394(0);
	}
	aClass126_8942.method2234('\0');
	OpenGL.glMatrixMode(5890);
	OpenGL.glPushMatrix();
	OpenGL.glScalef(0.25F, 0.25F, 1.0F);
	OpenGL.glMatrixMode(5888);
    }
    
    boolean method2117() {
	return true;
    }
    
    void method2116(boolean bool) {
	aClass182_Sub3_1445.method15398(260, 8448);
    }
    
    Class122_Sub4(Class182_Sub3 class182_sub3, Class140 class140) {
	super(class182_sub3);
	aClass140_8938 = class140;
	method14496();
	aClass136_Sub4_8940
	    = new Class136_Sub4(aClass182_Sub3_1445, Class165.aClass165_1772,
				Class178.aClass178_1905, 2,
				new byte[] { 0, -1 }, Class165.aClass165_1772);
	aClass136_Sub4_8940.method14508(false);
    }
    
    void method14496() {
	aClass126_8942 = new Class126(aClass182_Sub3_1445, 2);
	aClass126_8942.method2233(0);
	aClass182_Sub3_1445.method15394(1);
	aClass182_Sub3_1445.method15398(7681, 260);
	aClass182_Sub3_1445.method15431(0, 34168, 768);
	OpenGL.glTexGeni(8192, 9472, 9216);
	OpenGL.glEnable(3168);
	aClass182_Sub3_1445.method15394(0);
	OpenGL.glTexEnvf(8960, 34163, 2.0F);
	if (aClass140_8938.aBool1647) {
	    OpenGL.glTexGeni(8194, 9472, 9217);
	    OpenGL.glTexGeni(8195, 9472, 9217);
	    OpenGL.glTexGenfv(8195, 9473,
			      new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
	    OpenGL.glEnable(3170);
	    OpenGL.glEnable(3171);
	}
	aClass126_8942.method2238();
	aClass126_8942.method2233(1);
	aClass182_Sub3_1445.method15394(1);
	aClass182_Sub3_1445.method15398(8448, 8448);
	aClass182_Sub3_1445.method15431(0, 5890, 768);
	OpenGL.glDisable(3168);
	aClass182_Sub3_1445.method15394(0);
	OpenGL.glTexEnvf(8960, 34163, 1.0F);
	if (aClass140_8938.aBool1647) {
	    OpenGL.glDisable(3170);
	    OpenGL.glDisable(3171);
	}
	aClass126_8942.method2238();
    }
    
    boolean method2118() {
	return true;
    }
    
    void method14497() {
	aClass126_8942 = new Class126(aClass182_Sub3_1445, 2);
	aClass126_8942.method2233(0);
	aClass182_Sub3_1445.method15394(1);
	aClass182_Sub3_1445.method15398(7681, 260);
	aClass182_Sub3_1445.method15431(0, 34168, 768);
	OpenGL.glTexGeni(8192, 9472, 9216);
	OpenGL.glEnable(3168);
	aClass182_Sub3_1445.method15394(0);
	OpenGL.glTexEnvf(8960, 34163, 2.0F);
	if (aClass140_8938.aBool1647) {
	    OpenGL.glTexGeni(8194, 9472, 9217);
	    OpenGL.glTexGeni(8195, 9472, 9217);
	    OpenGL.glTexGenfv(8195, 9473,
			      new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
	    OpenGL.glEnable(3170);
	    OpenGL.glEnable(3171);
	}
	aClass126_8942.method2238();
	aClass126_8942.method2233(1);
	aClass182_Sub3_1445.method15394(1);
	aClass182_Sub3_1445.method15398(8448, 8448);
	aClass182_Sub3_1445.method15431(0, 5890, 768);
	OpenGL.glDisable(3168);
	aClass182_Sub3_1445.method15394(0);
	OpenGL.glTexEnvf(8960, 34163, 1.0F);
	if (aClass140_8938.aBool1647) {
	    OpenGL.glDisable(3170);
	    OpenGL.glDisable(3171);
	}
	aClass126_8942.method2238();
    }
    
    void method2113(boolean bool) {
	if (aClass182_Sub3_1445.anInt9768 > 0) {
	    float f = -0.5F / (float) aClass182_Sub3_1445.anInt9768;
	    aClass182_Sub3_1445.method15394(1);
	    aFloatArray8943[0] = 0.0F;
	    aFloatArray8943[1] = 0.0F;
	    aFloatArray8943[2] = f;
	    aFloatArray8943[3] = aClass182_Sub3_1445.aFloat9770 * f + 0.25F;
	    OpenGL.glPushMatrix();
	    OpenGL.glLoadIdentity();
	    OpenGL.glTexGenfv(8192, 9474, aFloatArray8943, 0);
	    OpenGL.glPopMatrix();
	    aClass182_Sub3_1445
		.method15368(0.5F, (float) aClass182_Sub3_1445.anInt9768);
	    aClass182_Sub3_1445.method15395(aClass136_Sub4_8940);
	    aClass182_Sub3_1445.method15394(0);
	}
	aClass126_8942.method2234('\0');
	OpenGL.glMatrixMode(5890);
	OpenGL.glPushMatrix();
	OpenGL.glScalef(0.25F, 0.25F, 1.0F);
	OpenGL.glMatrixMode(5888);
    }
    
    void method2114(boolean bool) {
	aClass182_Sub3_1445.method15398(260, 8448);
    }
    
    void method2115(boolean bool) {
	aClass182_Sub3_1445.method15398(260, 8448);
    }
    
    void method2111() {
	aClass126_8942.method2234('\001');
	if (aClass182_Sub3_1445.anInt9768 > 0) {
	    aClass182_Sub3_1445.method15394(1);
	    aClass182_Sub3_1445.method15395(null);
	    aClass182_Sub3_1445.method15368(1.0F, 0.0F);
	    aClass182_Sub3_1445.method15394(0);
	}
	aClass182_Sub3_1445.method15398(8448, 8448);
	OpenGL.glMatrixMode(5890);
	OpenGL.glPopMatrix();
	OpenGL.glMatrixMode(5888);
    }
    
    void method2105(int i, int i_2_) {
	if ((i & 0x1) == 1) {
	    if (aClass140_8938.aBool1647) {
		aClass182_Sub3_1445
		    .method15395(aClass140_8938.aClass136_Sub1_1649);
		aFloatArray8943[0] = 0.0F;
		aFloatArray8943[1] = 0.0F;
		aFloatArray8943[2] = 0.0F;
		aFloatArray8943[3]
		    = (float) (aClass182_Sub3_1445.anInt9721 % 4000) / 4000.0F;
		OpenGL.glTexGenfv(8194, 9473, aFloatArray8943, 0);
	    } else {
		int i_3_ = aClass182_Sub3_1445.anInt9721 % 4000 * 16 / 4000;
		aClass182_Sub3_1445
		    .method15395(aClass140_8938.aClass136_Sub2Array1646[i_3_]);
	    }
	} else if (aClass140_8938.aBool1647) {
	    aClass182_Sub3_1445
		.method15395(aClass140_8938.aClass136_Sub1_1649);
	    aFloatArray8943[0] = 0.0F;
	    aFloatArray8943[1] = 0.0F;
	    aFloatArray8943[2] = 0.0F;
	    aFloatArray8943[3] = 0.0F;
	    OpenGL.glTexGenfv(8194, 9473, aFloatArray8943, 0);
	} else
	    aClass182_Sub3_1445
		.method15395(aClass140_8938.aClass136_Sub2Array1646[0]);
    }
    
    void method2109(Class136 class136, int i) {
	/* empty */
    }
    
    void method14498() {
	aClass126_8942 = new Class126(aClass182_Sub3_1445, 2);
	aClass126_8942.method2233(0);
	aClass182_Sub3_1445.method15394(1);
	aClass182_Sub3_1445.method15398(7681, 260);
	aClass182_Sub3_1445.method15431(0, 34168, 768);
	OpenGL.glTexGeni(8192, 9472, 9216);
	OpenGL.glEnable(3168);
	aClass182_Sub3_1445.method15394(0);
	OpenGL.glTexEnvf(8960, 34163, 2.0F);
	if (aClass140_8938.aBool1647) {
	    OpenGL.glTexGeni(8194, 9472, 9217);
	    OpenGL.glTexGeni(8195, 9472, 9217);
	    OpenGL.glTexGenfv(8195, 9473,
			      new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
	    OpenGL.glEnable(3170);
	    OpenGL.glEnable(3171);
	}
	aClass126_8942.method2238();
	aClass126_8942.method2233(1);
	aClass182_Sub3_1445.method15394(1);
	aClass182_Sub3_1445.method15398(8448, 8448);
	aClass182_Sub3_1445.method15431(0, 5890, 768);
	OpenGL.glDisable(3168);
	aClass182_Sub3_1445.method15394(0);
	OpenGL.glTexEnvf(8960, 34163, 1.0F);
	if (aClass140_8938.aBool1647) {
	    OpenGL.glDisable(3170);
	    OpenGL.glDisable(3171);
	}
	aClass126_8942.method2238();
    }
    
    void method2108() {
	aClass126_8942.method2234('\001');
	if (aClass182_Sub3_1445.anInt9768 > 0) {
	    aClass182_Sub3_1445.method15394(1);
	    aClass182_Sub3_1445.method15395(null);
	    aClass182_Sub3_1445.method15368(1.0F, 0.0F);
	    aClass182_Sub3_1445.method15394(0);
	}
	aClass182_Sub3_1445.method15398(8448, 8448);
	OpenGL.glMatrixMode(5890);
	OpenGL.glPopMatrix();
	OpenGL.glMatrixMode(5888);
    }
    
    void method14499() {
	aClass126_8942 = new Class126(aClass182_Sub3_1445, 2);
	aClass126_8942.method2233(0);
	aClass182_Sub3_1445.method15394(1);
	aClass182_Sub3_1445.method15398(7681, 260);
	aClass182_Sub3_1445.method15431(0, 34168, 768);
	OpenGL.glTexGeni(8192, 9472, 9216);
	OpenGL.glEnable(3168);
	aClass182_Sub3_1445.method15394(0);
	OpenGL.glTexEnvf(8960, 34163, 2.0F);
	if (aClass140_8938.aBool1647) {
	    OpenGL.glTexGeni(8194, 9472, 9217);
	    OpenGL.glTexGeni(8195, 9472, 9217);
	    OpenGL.glTexGenfv(8195, 9473,
			      new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
	    OpenGL.glEnable(3170);
	    OpenGL.glEnable(3171);
	}
	aClass126_8942.method2238();
	aClass126_8942.method2233(1);
	aClass182_Sub3_1445.method15394(1);
	aClass182_Sub3_1445.method15398(8448, 8448);
	aClass182_Sub3_1445.method15431(0, 5890, 768);
	OpenGL.glDisable(3168);
	aClass182_Sub3_1445.method15394(0);
	OpenGL.glTexEnvf(8960, 34163, 1.0F);
	if (aClass140_8938.aBool1647) {
	    OpenGL.glDisable(3170);
	    OpenGL.glDisable(3171);
	}
	aClass126_8942.method2238();
    }
}
