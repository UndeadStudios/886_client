/* Class525_Sub16_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaggl.OpenGL;

public class Class525_Sub16_Sub2 extends Class525_Sub16 implements Interface19
{
    Class165 aClass165_11405;
    static int[] anIntArray11406 = new int[1];
    int anInt11407;
    int anInt11408;
    Class178 aClass178_11409;
    int anInt11410;
    int anInt11411;
    Class182_Sub3 aClass182_Sub3_11412;
    
    public void method126() {
	if (anInt11408 != 0) {
	    int[] is = new int[1];
	    is[0] = anInt11408;
	    OpenGL.glDeleteRenderbuffersEXT(1, is, 0);
	    anInt11408 = 0;
	}
    }
    
    Class525_Sub16_Sub2(Class182_Sub3 class182_sub3, Class165 class165,
			Class178 class178, int i, int i_0_, int i_1_) {
	aClass182_Sub3_11412 = class182_sub3;
	anInt11407 = i;
	anInt11411 = i_0_;
	aClass165_11405 = class165;
	aClass178_11409 = class178;
	OpenGL.glGenRenderbuffersEXT(1, anIntArray11406, 0);
	anInt11408 = anIntArray11406[0];
	OpenGL.glBindRenderbufferEXT(36161, anInt11408);
	OpenGL.glRenderbufferStorageMultisampleEXT
	    (36161, i_1_,
	     Class182_Sub3.method15534(aClass165_11405, aClass178_11409),
	     anInt11407, anInt11411);
	anInt11410 = (anInt11407 * anInt11411
		      * (aClass165_11405.anInt1770 * -1998053519)
		      * (aClass178_11409.anInt1915 * -103623665));
    }
    
    public int method1() {
	return anInt11407;
    }
    
    public int method80() {
	return anInt11411;
    }
    
    Class525_Sub16_Sub2(Class182_Sub3 class182_sub3, Class165 class165,
			Class178 class178, int i, int i_2_) {
	aClass182_Sub3_11412 = class182_sub3;
	anInt11407 = i;
	anInt11411 = i_2_;
	aClass165_11405 = class165;
	aClass178_11409 = class178;
	OpenGL.glGenRenderbuffersEXT(1, anIntArray11406, 0);
	anInt11408 = anIntArray11406[0];
	OpenGL.glBindRenderbufferEXT(36161, anInt11408);
	OpenGL.glRenderbufferStorageEXT
	    (36161,
	     Class182_Sub3.method15534(aClass165_11405, aClass178_11409),
	     anInt11407, anInt11411);
	anInt11410 = (anInt11407 * anInt11411
		      * (aClass165_11405.anInt1770 * -1998053519)
		      * (aClass178_11409.anInt1915 * -103623665));
    }
    
    public void method127() {
	if (anInt11408 != 0) {
	    int[] is = new int[1];
	    is[0] = anInt11408;
	    OpenGL.glDeleteRenderbuffersEXT(1, is, 0);
	    anInt11408 = 0;
	}
    }
    
    void method17995() {
	if (anInt11408 != 0) {
	    aClass182_Sub3_11412.method15418(anInt11408, anInt11410);
	    anInt11408 = 0;
	}
    }
    
    public void finalize() throws Throwable {
	method17995();
	super.finalize();
    }
    
    public int method12() {
	return anInt11407;
    }
    
    void method17996() throws Throwable {
	method17995();
	super.finalize();
    }
    
    public int method75() {
	return anInt11411;
    }
    
    void method17997() throws Throwable {
	method17995();
	super.finalize();
    }
    
    void method17998() throws Throwable {
	method17995();
	super.finalize();
    }
    
    public void method125() {
	if (anInt11408 != 0) {
	    int[] is = new int[1];
	    is[0] = anInt11408;
	    OpenGL.glDeleteRenderbuffersEXT(1, is, 0);
	    anInt11408 = 0;
	}
    }
    
    public void method53(int i) {
	OpenGL.glFramebufferRenderbufferEXT(36160, i, 36161, anInt11408);
    }
    
    public int method7() {
	return anInt11411;
    }
    
    void method17999() throws Throwable {
	method17995();
	super.finalize();
    }
    
    public int method57() {
	return anInt11407;
    }
    
    void method18000() {
	if (anInt11408 != 0) {
	    aClass182_Sub3_11412.method15418(anInt11408, anInt11410);
	    anInt11408 = 0;
	}
    }
    
    public void method115(int i) {
	OpenGL.glFramebufferRenderbufferEXT(36160, i, 36161, anInt11408);
    }
    
    public void method116(int i) {
	OpenGL.glFramebufferRenderbufferEXT(36160, i, 36161, anInt11408);
    }
}
