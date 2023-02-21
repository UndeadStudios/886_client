/* Class142 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaggl.OpenGL;

public class Class142
{
    static int[] anIntArray1660 = new int[2];
    Class182_Sub3 aClass182_Sub3_1661;
    int anInt1662;
    
    static Class142 method2341(Class182_Sub3 class182_sub3,
			       Class119[] class119s) {
	for (int i = 0; i < class119s.length; i++) {
	    if (class119s[i] == null || class119s[i].anInt1439 <= 0)
		return null;
	}
	int i = OpenGL.glCreateProgram();
	for (int i_0_ = 0; i_0_ < class119s.length; i_0_++)
	    OpenGL.glAttachShader(i, class119s[i_0_].anInt1439);
	OpenGL.glLinkProgram(i);
	OpenGL.glGetProgramiv(i, 35714, anIntArray1660, 0);
	if (anIntArray1660[0] == 0) {
	    OpenGL.glGetProgramiv(i, 35716, anIntArray1660, 1);
	    if (anIntArray1660[1] > 1) {
		byte[] is = new byte[anIntArray1660[1]];
		OpenGL.glGetProgramInfoLog(i, anIntArray1660[1],
					   anIntArray1660, 0, is, 0);
		System.out.println(new String(is));
	    }
	    if (anIntArray1660[0] == 0) {
		for (int i_1_ = 0; i_1_ < class119s.length; i_1_++)
		    OpenGL.glDetachShader(i, class119s[i_1_].anInt1439);
		OpenGL.glDeleteProgram(i);
		return null;
	    }
	}
	return new Class142(class182_sub3, i, class119s);
    }
    
    public void finalize() throws Throwable {
	aClass182_Sub3_1661.method15419((long) anInt1662);
	super.finalize();
    }
    
    void method2342() throws Throwable {
	aClass182_Sub3_1661.method15419((long) anInt1662);
	super.finalize();
    }
    
    static Class142 method2343(Class182_Sub3 class182_sub3,
			       Class119[] class119s) {
	for (int i = 0; i < class119s.length; i++) {
	    if (class119s[i] == null || class119s[i].anInt1439 <= 0)
		return null;
	}
	int i = OpenGL.glCreateProgram();
	for (int i_2_ = 0; i_2_ < class119s.length; i_2_++)
	    OpenGL.glAttachShader(i, class119s[i_2_].anInt1439);
	OpenGL.glLinkProgram(i);
	OpenGL.glGetProgramiv(i, 35714, anIntArray1660, 0);
	if (anIntArray1660[0] == 0) {
	    OpenGL.glGetProgramiv(i, 35716, anIntArray1660, 1);
	    if (anIntArray1660[1] > 1) {
		byte[] is = new byte[anIntArray1660[1]];
		OpenGL.glGetProgramInfoLog(i, anIntArray1660[1],
					   anIntArray1660, 0, is, 0);
		System.out.println(new String(is));
	    }
	    if (anIntArray1660[0] == 0) {
		for (int i_3_ = 0; i_3_ < class119s.length; i_3_++)
		    OpenGL.glDetachShader(i, class119s[i_3_].anInt1439);
		OpenGL.glDeleteProgram(i);
		return null;
	    }
	}
	return new Class142(class182_sub3, i, class119s);
    }
    
    static Class142 method2344(Class182_Sub3 class182_sub3,
			       Class119[] class119s) {
	for (int i = 0; i < class119s.length; i++) {
	    if (class119s[i] == null || class119s[i].anInt1439 <= 0)
		return null;
	}
	int i = OpenGL.glCreateProgram();
	for (int i_4_ = 0; i_4_ < class119s.length; i_4_++)
	    OpenGL.glAttachShader(i, class119s[i_4_].anInt1439);
	OpenGL.glLinkProgram(i);
	OpenGL.glGetProgramiv(i, 35714, anIntArray1660, 0);
	if (anIntArray1660[0] == 0) {
	    OpenGL.glGetProgramiv(i, 35716, anIntArray1660, 1);
	    if (anIntArray1660[1] > 1) {
		byte[] is = new byte[anIntArray1660[1]];
		OpenGL.glGetProgramInfoLog(i, anIntArray1660[1],
					   anIntArray1660, 0, is, 0);
		System.out.println(new String(is));
	    }
	    if (anIntArray1660[0] == 0) {
		for (int i_5_ = 0; i_5_ < class119s.length; i_5_++)
		    OpenGL.glDetachShader(i, class119s[i_5_].anInt1439);
		OpenGL.glDeleteProgram(i);
		return null;
	    }
	}
	return new Class142(class182_sub3, i, class119s);
    }
    
    void method2345() throws Throwable {
	aClass182_Sub3_1661.method15419((long) anInt1662);
	super.finalize();
    }
    
    Class142(Class182_Sub3 class182_sub3, int i, Class119[] class119s) {
	aClass182_Sub3_1661 = class182_sub3;
	anInt1662 = i;
    }
    
    void method2346() throws Throwable {
	aClass182_Sub3_1661.method15419((long) anInt1662);
	super.finalize();
    }
    
    void method2347() throws Throwable {
	aClass182_Sub3_1661.method15419((long) anInt1662);
	super.finalize();
    }
}
