/* Class133 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaclib.memory.Buffer;

import jaggl.OpenGL;

public abstract class Class133
{
    static int[] anIntArray1590 = new int[1];
    static final int anInt1591 = 34963;
    Class182_Sub3 aClass182_Sub3_1592;
    int anInt1593;
    int anInt1594;
    static final int anInt1595 = 34962;
    int anInt1596;
    boolean aBool1597 = false;
    boolean aBool1598;
    
    Class133(Class182_Sub3 class182_sub3, int i, Buffer buffer, int i_0_,
	     boolean bool) {
	aClass182_Sub3_1592 = class182_sub3;
	anInt1593 = i;
	anInt1596 = i_0_;
	aBool1598 = bool;
	OpenGL.glGenBuffersARB(1, anIntArray1590, 0);
	anInt1594 = anIntArray1590[0];
	method2290();
	OpenGL.glBufferDataARBa(i, anInt1596, buffer.method2(),
				aBool1598 ? 35040 : 35044);
	aClass182_Sub3_1592.anInt9692 += anInt1596;
    }
    
    Class133(Class182_Sub3 class182_sub3, int i, byte[] is, int i_1_,
	     boolean bool) {
	aClass182_Sub3_1592 = class182_sub3;
	anInt1593 = i;
	anInt1596 = i_1_;
	aBool1598 = bool;
	OpenGL.glGenBuffersARB(1, anIntArray1590, 0);
	anInt1594 = anIntArray1590[0];
	method2290();
	OpenGL.glBufferDataARBub(i, anInt1596, is, 0,
				 aBool1598 ? 35040 : 35044);
	aClass182_Sub3_1592.anInt9692 += anInt1596;
    }
    
    void method2286() throws Throwable {
	if (!aBool1597) {
	    aClass182_Sub3_1592.method15422(anInt1594, anInt1596);
	    aBool1597 = true;
	}
	super.finalize();
    }
    
    void method2287(byte[] is, int i) {
	method2290();
	if (i > anInt1596) {
	    OpenGL.glBufferDataARBub(anInt1593, i, is, 0,
				     aBool1598 ? 35040 : 35044);
	    aClass182_Sub3_1592.anInt9692 += i - anInt1596;
	    anInt1596 = i;
	} else
	    OpenGL.glBufferSubDataARBub(anInt1593, 0, i, is, 0);
    }
    
    public void finalize() throws Throwable {
	if (!aBool1597) {
	    aClass182_Sub3_1592.method15422(anInt1594, anInt1596);
	    aBool1597 = true;
	}
	super.finalize();
    }
    
    void method2288() throws Throwable {
	if (!aBool1597) {
	    aClass182_Sub3_1592.method15422(anInt1594, anInt1596);
	    aBool1597 = true;
	}
	super.finalize();
    }
    
    abstract void method2289();
    
    abstract void method2290();
    
    void method2291() throws Throwable {
	if (!aBool1597) {
	    aClass182_Sub3_1592.method15422(anInt1594, anInt1596);
	    aBool1597 = true;
	}
	super.finalize();
    }
    
    abstract void method2292();
    
    void method2293() throws Throwable {
	if (!aBool1597) {
	    aClass182_Sub3_1592.method15422(anInt1594, anInt1596);
	    aBool1597 = true;
	}
	super.finalize();
    }
    
    void method2294(byte[] is, int i) {
	method2290();
	if (i > anInt1596) {
	    OpenGL.glBufferDataARBub(anInt1593, i, is, 0,
				     aBool1598 ? 35040 : 35044);
	    aClass182_Sub3_1592.anInt9692 += i - anInt1596;
	    anInt1596 = i;
	} else
	    OpenGL.glBufferSubDataARBub(anInt1593, 0, i, is, 0);
    }
    
    void method2295(byte[] is, int i) {
	method2290();
	if (i > anInt1596) {
	    OpenGL.glBufferDataARBub(anInt1593, i, is, 0,
				     aBool1598 ? 35040 : 35044);
	    aClass182_Sub3_1592.anInt9692 += i - anInt1596;
	    anInt1596 = i;
	} else
	    OpenGL.glBufferSubDataARBub(anInt1593, 0, i, is, 0);
    }
}
