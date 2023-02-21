/* Class143 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaggl.OpenGL;

public class Class143
{
    static final int anInt1663 = 34336;
    Class182_Sub3 aClass182_Sub3_1664;
    int anInt1665;
    static int[] anIntArray1666 = new int[1];
    
    public void finalize() throws Throwable {
	aClass182_Sub3_1664.method15483(anInt1665);
	super.finalize();
    }
    
    Class143(Class182_Sub3 class182_sub3, int i, int i_0_) {
	aClass182_Sub3_1664 = class182_sub3;
	anInt1665 = i_0_;
    }
    
    void method2348() throws Throwable {
	aClass182_Sub3_1664.method15483(anInt1665);
	super.finalize();
    }
    
    void method2349() throws Throwable {
	aClass182_Sub3_1664.method15483(anInt1665);
	super.finalize();
    }
    
    static Class143 method2350(Class182_Sub3 class182_sub3, int i,
			       String string) {
	int i_1_ = OpenGL.glGenProgramARB();
	OpenGL.glBindProgramARB(i, i_1_);
	OpenGL.glProgramStringARB(i, 34933, string);
	OpenGL.glGetIntegerv(34379, anIntArray1666, 0);
	if (anIntArray1666[0] != -1) {
	    OpenGL.glBindProgramARB(i, 0);
	    return null;
	}
	OpenGL.glBindProgramARB(i, 0);
	return new Class143(class182_sub3, i, i_1_);
    }
    
    void method2351() throws Throwable {
	aClass182_Sub3_1664.method15483(anInt1665);
	super.finalize();
    }
    
    void method2352() throws Throwable {
	aClass182_Sub3_1664.method15483(anInt1665);
	super.finalize();
    }
    
    static Class143 method2353(Class182_Sub3 class182_sub3, int i,
			       String string) {
	int i_2_ = OpenGL.glGenProgramARB();
	OpenGL.glBindProgramARB(i, i_2_);
	OpenGL.glProgramStringARB(i, 34933, string);
	OpenGL.glGetIntegerv(34379, anIntArray1666, 0);
	if (anIntArray1666[0] != -1) {
	    OpenGL.glBindProgramARB(i, 0);
	    return null;
	}
	OpenGL.glBindProgramARB(i, 0);
	return new Class143(class182_sub3, i, i_2_);
    }
}
