/* Class487 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaclib.memory.heap.NativeHeapBuffer;

import jaggl.OpenGL;

public abstract class Class487 implements Interface34
{
    int anInt5241;
    static final int anInt5242 = 34963;
    boolean aBool5243;
    static final int anInt5244 = 34962;
    int anInt5245;
    int anInt5246 = -1;
    int anInt5247;
    Class182_Sub1_Sub2 aClass182_Sub1_Sub2_5248;
    NativeHeapBuffer aNativeHeapBuffer5249;
    static int[] anIntArray5250 = new int[1];
    
    void method7858() {
	if (anInt5246 < 0) {
	    if (aClass182_Sub1_Sub2_5248.aBool11505) {
		OpenGL.glGenBuffersARB(1, anIntArray5250, 0);
		anInt5246 = anIntArray5250[0];
		OpenGL.glBindBufferARB(anInt5241, anInt5246);
	    } else
		anInt5246 = 0;
	}
    }
    
    public int method224() {
	return anInt5247;
    }
    
    void method7859() throws Throwable {
	method127();
	super.finalize();
    }
    
    long method7860() {
	return anInt5246 == 0 ? aNativeHeapBuffer5249.method2() : 0L;
    }
    
    void method333(int i) {
	if (i > anInt5245) {
	    method7861();
	    if (anInt5246 > 0) {
		OpenGL.glBindBufferARB(anInt5241, anInt5246);
		OpenGL.glBufferDataARBub(anInt5241, i, null, 0,
					 aBool5243 ? 35040 : 35044);
		aClass182_Sub1_Sub2_5248.anInt9167 += i - anInt5245;
	    } else
		aNativeHeapBuffer5249
		    = aClass182_Sub1_Sub2_5248.method14681(i, false);
	    anInt5245 = i;
	}
	anInt5247 = i;
    }
    
    void method29(int i) {
	if (i > anInt5245) {
	    method7861();
	    if (anInt5246 > 0) {
		OpenGL.glBindBufferARB(anInt5241, anInt5246);
		OpenGL.glBufferDataARBub(anInt5241, i, null, 0,
					 aBool5243 ? 35040 : 35044);
		aClass182_Sub1_Sub2_5248.anInt9167 += i - anInt5245;
	    } else
		aNativeHeapBuffer5249
		    = aClass182_Sub1_Sub2_5248.method14681(i, false);
	    anInt5245 = i;
	}
	anInt5247 = i;
    }
    
    public long method219(int i, int i_0_) {
	OpenGL.glBindBufferARB(anInt5241, anInt5246);
	return OpenGL.glMapBufferARB(anInt5241, 35001) + (long) i;
    }
    
    public void method217() {
	OpenGL.glUnmapBufferARB(anInt5241);
    }
    
    public boolean method215(int i, int i_1_, long l) {
	method7861();
	if (anInt5246 > 0) {
	    OpenGL.glBindBufferARB(anInt5241, anInt5246);
	    OpenGL.glBufferSubDataARBa(anInt5241, i, i_1_, l);
	} else
	    aNativeHeapBuffer5249.aNativeHeap1128
		.copy(aNativeHeapBuffer5249.method2() + (long) i, l, i_1_);
	return true;
    }
    
    public long method216(int i, int i_2_) {
	OpenGL.glBindBufferARB(anInt5241, anInt5246);
	return OpenGL.glMapBufferARB(anInt5241, 35001) + (long) i;
    }
    
    public void finalize() throws Throwable {
	method127();
	super.finalize();
    }
    
    void method126() {
	if (anInt5246 > 0) {
	    aClass182_Sub1_Sub2_5248.method18113(anInt5246, anInt5247);
	    anInt5246 = -1;
	}
    }
    
    void method7861() {
	if (anInt5246 < 0) {
	    if (aClass182_Sub1_Sub2_5248.aBool11505) {
		OpenGL.glGenBuffersARB(1, anIntArray5250, 0);
		anInt5246 = anIntArray5250[0];
		OpenGL.glBindBufferARB(anInt5241, anInt5246);
	    } else
		anInt5246 = 0;
	}
    }
    
    Class487(Class182_Sub1_Sub2 class182_sub1_sub2, int i, boolean bool) {
	aClass182_Sub1_Sub2_5248 = class182_sub1_sub2;
	anInt5241 = i;
	aBool5243 = bool;
    }
    
    void method7862() throws Throwable {
	method127();
	super.finalize();
    }
    
    public void method220() {
	OpenGL.glUnmapBufferARB(anInt5241);
    }
    
    void method7863() throws Throwable {
	method127();
	super.finalize();
    }
    
    public boolean method218(int i, int i_3_, long l) {
	method7861();
	if (anInt5246 > 0) {
	    OpenGL.glBindBufferARB(anInt5241, anInt5246);
	    OpenGL.glBufferSubDataARBa(anInt5241, i, i_3_, l);
	} else
	    aNativeHeapBuffer5249.aNativeHeap1128
		.copy(aNativeHeapBuffer5249.method2() + (long) i, l, i_3_);
	return true;
    }
    
    public long method214(int i, int i_4_) {
	OpenGL.glBindBufferARB(anInt5241, anInt5246);
	return OpenGL.glMapBufferARB(anInt5241, 35001) + (long) i;
    }
    
    void method7864() {
	if (aClass182_Sub1_Sub2_5248.aBool11505)
	    OpenGL.glBindBufferARB(anInt5241, anInt5246);
    }
    
    public void method221() {
	OpenGL.glUnmapBufferARB(anInt5241);
    }
    
    public void method222() {
	OpenGL.glUnmapBufferARB(anInt5241);
    }
    
    void method327(int i) {
	if (i > anInt5245) {
	    method7861();
	    if (anInt5246 > 0) {
		OpenGL.glBindBufferARB(anInt5241, anInt5246);
		OpenGL.glBufferDataARBub(anInt5241, i, null, 0,
					 aBool5243 ? 35040 : 35044);
		aClass182_Sub1_Sub2_5248.anInt9167 += i - anInt5245;
	    } else
		aNativeHeapBuffer5249
		    = aClass182_Sub1_Sub2_5248.method14681(i, false);
	    anInt5245 = i;
	}
	anInt5247 = i;
    }
    
    void method125() {
	if (anInt5246 > 0) {
	    aClass182_Sub1_Sub2_5248.method18113(anInt5246, anInt5247);
	    anInt5246 = -1;
	}
    }
    
    void method331(int i) {
	if (i > anInt5245) {
	    method7861();
	    if (anInt5246 > 0) {
		OpenGL.glBindBufferARB(anInt5241, anInt5246);
		OpenGL.glBufferDataARBub(anInt5241, i, null, 0,
					 aBool5243 ? 35040 : 35044);
		aClass182_Sub1_Sub2_5248.anInt9167 += i - anInt5245;
	    } else
		aNativeHeapBuffer5249
		    = aClass182_Sub1_Sub2_5248.method14681(i, false);
	    anInt5245 = i;
	}
	anInt5247 = i;
    }
    
    void method332(int i) {
	if (i > anInt5245) {
	    method7861();
	    if (anInt5246 > 0) {
		OpenGL.glBindBufferARB(anInt5241, anInt5246);
		OpenGL.glBufferDataARBub(anInt5241, i, null, 0,
					 aBool5243 ? 35040 : 35044);
		aClass182_Sub1_Sub2_5248.anInt9167 += i - anInt5245;
	    } else
		aNativeHeapBuffer5249
		    = aClass182_Sub1_Sub2_5248.method14681(i, false);
	    anInt5245 = i;
	}
	anInt5247 = i;
    }
    
    public int method57() {
	return anInt5247;
    }
    
    public int method223() {
	return anInt5247;
    }
    
    void method7865() throws Throwable {
	method127();
	super.finalize();
    }
    
    void method127() {
	if (anInt5246 > 0) {
	    aClass182_Sub1_Sub2_5248.method18113(anInt5246, anInt5247);
	    anInt5246 = -1;
	}
    }
    
    long method7866() {
	return anInt5246 == 0 ? aNativeHeapBuffer5249.method2() : 0L;
    }
    
    void method7867() {
	if (aClass182_Sub1_Sub2_5248.aBool11505)
	    OpenGL.glBindBufferARB(anInt5241, anInt5246);
    }
}
