/* Class520 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaggl.OpenGL;

public class Class520 implements Interface21, Interface22, Interface55
{
    int anInt7068;
    Class178 aClass178_7069;
    int anInt7070;
    Class165 aClass165_7071;
    Class182_Sub1_Sub2 aClass182_Sub1_Sub2_7072;
    int anInt7073;
    
    void method8663() {
	if (anInt7073 != 0) {
	    aClass182_Sub1_Sub2_7072.method18116(anInt7073,
						 (anInt7070 * anInt7068
						  * (aClass178_7069.anInt1915
						     * -103623665)
						  * (aClass165_7071.anInt1770
						     * -1998053519)));
	    anInt7073 = 0;
	}
    }
    
    Class520(Class182_Sub1_Sub2 class182_sub1_sub2, Class165 class165,
	     Class178 class178, int i, int i_0_, int i_1_) {
	aClass165_7071 = class165;
	aClass178_7069 = class178;
	anInt7070 = i;
	anInt7068 = i_0_;
	aClass182_Sub1_Sub2_7072 = class182_sub1_sub2;
	int[] is = new int[1];
	OpenGL.glGenRenderbuffersEXT(1, is, 0);
	anInt7073 = is[0];
	OpenGL.glBindRenderbufferEXT(36161, anInt7073);
	OpenGL.glRenderbufferStorageMultisampleEXT
	    (36161, i_1_,
	     Class182_Sub1_Sub2.method18120(aClass165_7071, aClass178_7069), i,
	     i_0_);
    }
    
    void method8664() throws Throwable {
	method8666();
	super.finalize();
    }
    
    public int method80() {
	return anInt7068;
    }
    
    public void method53(int i) {
	OpenGL.glFramebufferRenderbufferEXT(36160, i, 36161, anInt7073);
    }
    
    public void method127() {
	if (anInt7073 != 0) {
	    int[] is = new int[1];
	    is[0] = anInt7073;
	    OpenGL.glDeleteRenderbuffersEXT(1, is, 0);
	    anInt7073 = 0;
	}
    }
    
    void method8665() {
	if (anInt7073 != 0) {
	    aClass182_Sub1_Sub2_7072.method18116(anInt7073,
						 (anInt7070 * anInt7068
						  * (aClass178_7069.anInt1915
						     * -103623665)
						  * (aClass165_7071.anInt1770
						     * -1998053519)));
	    anInt7073 = 0;
	}
    }
    
    public void finalize() throws Throwable {
	method8666();
	super.finalize();
    }
    
    public int method12() {
	return anInt7070;
    }
    
    public int method1() {
	return anInt7070;
    }
    
    public int method7() {
	return anInt7068;
    }
    
    void method8666() {
	if (anInt7073 != 0) {
	    aClass182_Sub1_Sub2_7072.method18116(anInt7073,
						 (anInt7070 * anInt7068
						  * (aClass178_7069.anInt1915
						     * -103623665)
						  * (aClass165_7071.anInt1770
						     * -1998053519)));
	    anInt7073 = 0;
	}
    }
    
    public void method126() {
	if (anInt7073 != 0) {
	    int[] is = new int[1];
	    is[0] = anInt7073;
	    OpenGL.glDeleteRenderbuffersEXT(1, is, 0);
	    anInt7073 = 0;
	}
    }
    
    public void method125() {
	if (anInt7073 != 0) {
	    int[] is = new int[1];
	    is[0] = anInt7073;
	    OpenGL.glDeleteRenderbuffersEXT(1, is, 0);
	    anInt7073 = 0;
	}
    }
    
    void method8667() {
	if (anInt7073 != 0) {
	    aClass182_Sub1_Sub2_7072.method18116(anInt7073,
						 (anInt7070 * anInt7068
						  * (aClass178_7069.anInt1915
						     * -103623665)
						  * (aClass165_7071.anInt1770
						     * -1998053519)));
	    anInt7073 = 0;
	}
    }
    
    void method8668() throws Throwable {
	method8666();
	super.finalize();
    }
    
    void method8669() throws Throwable {
	method8666();
	super.finalize();
    }
    
    void method8670() throws Throwable {
	method8666();
	super.finalize();
    }
    
    public void method116(int i) {
	OpenGL.glFramebufferRenderbufferEXT(36160, i, 36161, anInt7073);
    }
    
    public void method115(int i) {
	OpenGL.glFramebufferRenderbufferEXT(36160, i, 36161, anInt7073);
    }
    
    public void method356(int i) {
	OpenGL.glFramebufferRenderbufferEXT(36160, i, 36161, anInt7073);
    }
    
    public int method75() {
	return anInt7068;
    }
    
    void method8671() {
	if (anInt7073 != 0) {
	    aClass182_Sub1_Sub2_7072.method18116(anInt7073,
						 (anInt7070 * anInt7068
						  * (aClass178_7069.anInt1915
						     * -103623665)
						  * (aClass165_7071.anInt1770
						     * -1998053519)));
	    anInt7073 = 0;
	}
    }
    
    public int method57() {
	return anInt7070;
    }
    
    Class520(Class182_Sub1_Sub2 class182_sub1_sub2, Class165 class165,
	     Class178 class178, int i, int i_2_) {
	aClass165_7071 = class165;
	aClass178_7069 = class178;
	anInt7070 = i;
	anInt7068 = i_2_;
	aClass182_Sub1_Sub2_7072 = class182_sub1_sub2;
	int[] is = new int[1];
	OpenGL.glGenRenderbuffersEXT(1, is, 0);
	anInt7073 = is[0];
	OpenGL.glBindRenderbufferEXT(36161, anInt7073);
	OpenGL.glRenderbufferStorageEXT
	    (36161,
	     Class182_Sub1_Sub2.method18120(aClass165_7071, aClass178_7069), i,
	     i_2_);
    }
    
    void method8672() {
	if (anInt7073 != 0) {
	    aClass182_Sub1_Sub2_7072.method18116(anInt7073,
						 (anInt7070 * anInt7068
						  * (aClass178_7069.anInt1915
						     * -103623665)
						  * (aClass165_7071.anInt1770
						     * -1998053519)));
	    anInt7073 = 0;
	}
    }
}
