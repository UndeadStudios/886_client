/* Class122_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaggl.OpenGL;

public class Class122_Sub5 extends Class122
{
    Class126 aClass126_8951;
    boolean aBool8952 = false;
    static final char aChar8953 = '\001';
    static final char aChar8954 = '\0';
    
    void method2111() {
	if (aBool8952) {
	    aClass126_8951.method2234('\001');
	    aClass182_Sub3_1445.method15394(1);
	    aClass182_Sub3_1445.method15395(null);
	    aClass182_Sub3_1445.method15394(0);
	} else
	    aClass182_Sub3_1445.method15399(0, 5890, 770);
	aClass182_Sub3_1445.method15398(8448, 8448);
	aBool8952 = false;
    }
    
    Class122_Sub5(Class182_Sub3 class182_sub3) {
	super(class182_sub3);
	if (class182_sub3.aBool9806) {
	    aClass126_8951 = new Class126(class182_sub3, 2);
	    aClass126_8951.method2233(0);
	    aClass182_Sub3_1445.method15394(1);
	    aClass182_Sub3_1445.method15398(34165, 7681);
	    aClass182_Sub3_1445.method15431(2, 34168, 770);
	    aClass182_Sub3_1445.method15399(0, 34167, 770);
	    OpenGL.glTexGeni(8192, 9472, 34066);
	    OpenGL.glTexGeni(8193, 9472, 34066);
	    OpenGL.glTexGeni(8194, 9472, 34066);
	    OpenGL.glEnable(3168);
	    OpenGL.glEnable(3169);
	    OpenGL.glEnable(3170);
	    aClass182_Sub3_1445.method15394(0);
	    aClass126_8951.method2238();
	    aClass126_8951.method2233(1);
	    aClass182_Sub3_1445.method15394(1);
	    aClass182_Sub3_1445.method15398(8448, 8448);
	    aClass182_Sub3_1445.method15431(2, 34166, 770);
	    aClass182_Sub3_1445.method15399(0, 5890, 770);
	    OpenGL.glDisable(3168);
	    OpenGL.glDisable(3169);
	    OpenGL.glDisable(3170);
	    OpenGL.glMatrixMode(5890);
	    OpenGL.glLoadIdentity();
	    OpenGL.glMatrixMode(5888);
	    aClass182_Sub3_1445.method15394(0);
	    aClass126_8951.method2238();
	}
    }
    
    void method2106(boolean bool) {
	Class136_Sub3 class136_sub3 = aClass182_Sub3_1445.method15374();
	if (aClass126_8951 != null && class136_sub3 != null && bool) {
	    aClass126_8951.method2234('\0');
	    aClass182_Sub3_1445.method15394(1);
	    aClass182_Sub3_1445.method15395(class136_sub3);
	    OpenGL.glMatrixMode(5890);
	    OpenGL.glLoadMatrixf((aClass182_Sub3_1445.aClass435_9716.method6982
				  (aClass182_Sub3_1445.aFloatArray9733)),
				 0);
	    OpenGL.glScalef(1.0F, -1.0F, -1.0F);
	    OpenGL.glMatrixMode(5888);
	    aClass182_Sub3_1445.method15394(0);
	    aBool8952 = true;
	} else
	    aClass182_Sub3_1445.method15399(0, 34168, 770);
    }
    
    void method2116(boolean bool) {
	aClass182_Sub3_1445.method15398(8448, 7681);
    }
    
    void method2108() {
	if (aBool8952) {
	    aClass126_8951.method2234('\001');
	    aClass182_Sub3_1445.method15394(1);
	    aClass182_Sub3_1445.method15395(null);
	    aClass182_Sub3_1445.method15394(0);
	} else
	    aClass182_Sub3_1445.method15399(0, 5890, 770);
	aClass182_Sub3_1445.method15398(8448, 8448);
	aBool8952 = false;
    }
    
    void method2107(int i, int i_0_) {
	/* empty */
    }
    
    void method2110(Class136 class136, int i) {
	aClass182_Sub3_1445.method15395(class136);
	aClass182_Sub3_1445.method15396(i);
    }
    
    void method2112(boolean bool) {
	Class136_Sub3 class136_sub3 = aClass182_Sub3_1445.method15374();
	if (aClass126_8951 != null && class136_sub3 != null && bool) {
	    aClass126_8951.method2234('\0');
	    aClass182_Sub3_1445.method15394(1);
	    aClass182_Sub3_1445.method15395(class136_sub3);
	    OpenGL.glMatrixMode(5890);
	    OpenGL.glLoadMatrixf((aClass182_Sub3_1445.aClass435_9716.method6982
				  (aClass182_Sub3_1445.aFloatArray9733)),
				 0);
	    OpenGL.glScalef(1.0F, -1.0F, -1.0F);
	    OpenGL.glMatrixMode(5888);
	    aClass182_Sub3_1445.method15394(0);
	    aBool8952 = true;
	} else
	    aClass182_Sub3_1445.method15399(0, 34168, 770);
    }
    
    boolean method2117() {
	return true;
    }
    
    void method2113(boolean bool) {
	Class136_Sub3 class136_sub3 = aClass182_Sub3_1445.method15374();
	if (aClass126_8951 != null && class136_sub3 != null && bool) {
	    aClass126_8951.method2234('\0');
	    aClass182_Sub3_1445.method15394(1);
	    aClass182_Sub3_1445.method15395(class136_sub3);
	    OpenGL.glMatrixMode(5890);
	    OpenGL.glLoadMatrixf((aClass182_Sub3_1445.aClass435_9716.method6982
				  (aClass182_Sub3_1445.aFloatArray9733)),
				 0);
	    OpenGL.glScalef(1.0F, -1.0F, -1.0F);
	    OpenGL.glMatrixMode(5888);
	    aClass182_Sub3_1445.method15394(0);
	    aBool8952 = true;
	} else
	    aClass182_Sub3_1445.method15399(0, 34168, 770);
    }
    
    void method2114(boolean bool) {
	aClass182_Sub3_1445.method15398(8448, 7681);
    }
    
    void method2115(boolean bool) {
	aClass182_Sub3_1445.method15398(8448, 7681);
    }
    
    void method2109(Class136 class136, int i) {
	aClass182_Sub3_1445.method15395(class136);
	aClass182_Sub3_1445.method15396(i);
    }
    
    void method2105(int i, int i_1_) {
	/* empty */
    }
    
    boolean method2118() {
	return true;
    }
}
