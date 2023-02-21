/* Class119 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaggl.OpenGL;

public class Class119
{
    static final int anInt1435 = 35633;
    static final int anInt1436 = 35632;
    static int[] anIntArray1437 = new int[2];
    Class182_Sub3 aClass182_Sub3_1438;
    int anInt1439;
    
    static Class119 method2095(Class182_Sub3 class182_sub3, int i,
			       String string) {
	int i_0_ = OpenGL.glCreateShader(i);
	OpenGL.glShaderSource(i_0_, string);
	OpenGL.glCompileShader(i_0_);
	OpenGL.glGetShaderiv(i_0_, 35713, anIntArray1437, 0);
	if (anIntArray1437[0] == 0) {
	    boolean bool = false;
	    if (anIntArray1437[0] == 0) {
		bool = true;
		System.out.println("");
	    }
	    OpenGL.glGetShaderiv(i_0_, 35716, anIntArray1437, 1);
	    if (anIntArray1437[1] > 1) {
		byte[] is = new byte[anIntArray1437[1]];
		OpenGL.glGetShaderInfoLog(i_0_, anIntArray1437[1],
					  anIntArray1437, 0, is, 0);
		System.out.println(new String(is));
	    }
	    if (bool) {
		OpenGL.glDeleteShader(i_0_);
		return null;
	    }
	}
	return new Class119(class182_sub3, i_0_, i);
    }
    
    Class119(Class182_Sub3 class182_sub3, int i, int i_1_) {
	aClass182_Sub3_1438 = class182_sub3;
	anInt1439 = i;
    }
    
    public void finalize() throws Throwable {
	aClass182_Sub3_1438.method15419((long) anInt1439);
	super.finalize();
    }
    
    void method2096() throws Throwable {
	aClass182_Sub3_1438.method15419((long) anInt1439);
	super.finalize();
    }
    
    void method2097() throws Throwable {
	aClass182_Sub3_1438.method15419((long) anInt1439);
	super.finalize();
    }
    
    void method2098() throws Throwable {
	aClass182_Sub3_1438.method15419((long) anInt1439);
	super.finalize();
    }
    
    void method2099() throws Throwable {
	aClass182_Sub3_1438.method15419((long) anInt1439);
	super.finalize();
    }
    
    static Class119 method2100(Class182_Sub3 class182_sub3, int i,
			       String string) {
	int i_2_ = OpenGL.glCreateShader(i);
	OpenGL.glShaderSource(i_2_, string);
	OpenGL.glCompileShader(i_2_);
	OpenGL.glGetShaderiv(i_2_, 35713, anIntArray1437, 0);
	if (anIntArray1437[0] == 0) {
	    boolean bool = false;
	    if (anIntArray1437[0] == 0) {
		bool = true;
		System.out.println("");
	    }
	    OpenGL.glGetShaderiv(i_2_, 35716, anIntArray1437, 1);
	    if (anIntArray1437[1] > 1) {
		byte[] is = new byte[anIntArray1437[1]];
		OpenGL.glGetShaderInfoLog(i_2_, anIntArray1437[1],
					  anIntArray1437, 0, is, 0);
		System.out.println(new String(is));
	    }
	    if (bool) {
		OpenGL.glDeleteShader(i_2_);
		return null;
	    }
	}
	return new Class119(class182_sub3, i_2_, i);
    }
    
    static Class119 method2101(Class182_Sub3 class182_sub3, int i,
			       String string) {
	int i_3_ = OpenGL.glCreateShader(i);
	OpenGL.glShaderSource(i_3_, string);
	OpenGL.glCompileShader(i_3_);
	OpenGL.glGetShaderiv(i_3_, 35713, anIntArray1437, 0);
	if (anIntArray1437[0] == 0) {
	    boolean bool = false;
	    if (anIntArray1437[0] == 0) {
		bool = true;
		System.out.println("");
	    }
	    OpenGL.glGetShaderiv(i_3_, 35716, anIntArray1437, 1);
	    if (anIntArray1437[1] > 1) {
		byte[] is = new byte[anIntArray1437[1]];
		OpenGL.glGetShaderInfoLog(i_3_, anIntArray1437[1],
					  anIntArray1437, 0, is, 0);
		System.out.println(new String(is));
	    }
	    if (bool) {
		OpenGL.glDeleteShader(i_3_);
		return null;
	    }
	}
	return new Class119(class182_sub3, i_3_, i);
    }
    
    static Class119 method2102(Class182_Sub3 class182_sub3, int i,
			       String string) {
	int i_4_ = OpenGL.glCreateShader(i);
	OpenGL.glShaderSource(i_4_, string);
	OpenGL.glCompileShader(i_4_);
	OpenGL.glGetShaderiv(i_4_, 35713, anIntArray1437, 0);
	if (anIntArray1437[0] == 0) {
	    boolean bool = false;
	    if (anIntArray1437[0] == 0) {
		bool = true;
		System.out.println("");
	    }
	    OpenGL.glGetShaderiv(i_4_, 35716, anIntArray1437, 1);
	    if (anIntArray1437[1] > 1) {
		byte[] is = new byte[anIntArray1437[1]];
		OpenGL.glGetShaderInfoLog(i_4_, anIntArray1437[1],
					  anIntArray1437, 0, is, 0);
		System.out.println(new String(is));
	    }
	    if (bool) {
		OpenGL.glDeleteShader(i_4_);
		return null;
	    }
	}
	return new Class119(class182_sub3, i_4_, i);
    }
}
