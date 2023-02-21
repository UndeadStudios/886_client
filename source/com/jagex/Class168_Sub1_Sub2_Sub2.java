/* Class168_Sub1_Sub2_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Canvas;
import java.awt.Dimension;

import jaggl.OpenGL;

public class Class168_Sub1_Sub2_Sub2 extends Class168_Sub1_Sub2
{
    OpenGL anOpenGL12152;
    Canvas aCanvas12153;
    long aLong12154;
    int anInt12155;
    boolean aBool12156 = false;
    int anInt12157;
    
    void method18826() {
	Dimension dimension = aCanvas12153.getSize();
	anInt12157 = dimension.height;
	anInt12155 = dimension.width;
    }
    
    void method18827() {
	Dimension dimension = aCanvas12153.getSize();
	anInt12157 = dimension.height;
	anInt12155 = dimension.width;
    }
    
    public int method2710() {
	return anInt12155;
    }
    
    public int method2711() {
	return anInt12157;
    }
    
    void method14605(int i, int i_0_) {
	if (aLong12154 == 0L)
	    throw new IllegalStateException("");
	anOpenGL12152.surfaceResized(aLong12154);
	method18827();
	super.method14605(i, i_0_);
    }
    
    public int method14606() {
	if (aLong12154 == 0L)
	    throw new IllegalStateException("");
	anOpenGL12152.swapBuffers(aLong12154);
	return 0;
    }
    
    Class168_Sub1_Sub2_Sub2(Class182_Sub1_Sub2 class182_sub1_sub2,
			    Canvas canvas) {
	this(class182_sub1_sub2, canvas,
	     class182_sub1_sub2.anOpenGL11521.prepareSurface(canvas));
    }
    
    boolean method350() {
	if (aLong12154 == 0L)
	    throw new IllegalStateException("");
	boolean bool = true;
	if (!aBool12156) {
	    bool = anOpenGL12152.setSurface(aLong12154);
	    aBool12156 = true;
	}
	return bool && super.method350();
    }
    
    boolean method2712() {
	return true;
    }
    
    boolean method2709() {
	return true;
    }
    
    public void method127() {
	if (aLong12154 != 0L) {
	    anOpenGL12152.releaseSurface(aCanvas12153, aLong12154);
	    aLong12154 = 0L;
	}
    }
    
    void method14609(int i, int i_1_) {
	if (aLong12154 == 0L)
	    throw new IllegalStateException("");
	anOpenGL12152.surfaceResized(aLong12154);
	method18827();
	super.method14605(i, i_1_);
    }
    
    public int method2716() {
	return anInt12155;
    }
    
    public int method2714() {
	return anInt12157;
    }
    
    boolean method351() {
	if (aLong12154 == 0L)
	    throw new IllegalStateException("");
	boolean bool = true;
	if (!aBool12156) {
	    bool = anOpenGL12152.setSurface(aLong12154);
	    aBool12156 = true;
	}
	return bool && super.method350();
    }
    
    public int method14611(int i, int i_2_) {
	return 0;
    }
    
    boolean method2715() {
	return true;
    }
    
    boolean method2717() {
	return true;
    }
    
    public void method352() {
	if (aLong12154 != 0L) {
	    anOpenGL12152.releaseSurface(aCanvas12153, aLong12154);
	    aLong12154 = 0L;
	}
    }
    
    public void method221() {
	if (aLong12154 != 0L) {
	    anOpenGL12152.releaseSurface(aCanvas12153, aLong12154);
	    aLong12154 = 0L;
	}
    }
    
    Class168_Sub1_Sub2_Sub2(Class182_Sub1_Sub2 class182_sub1_sub2,
			    Canvas canvas, long l) {
	super(class182_sub1_sub2);
	aCanvas12153 = canvas;
	anOpenGL12152 = class182_sub1_sub2.anOpenGL11521;
	aLong12154 = l;
	method18827();
    }
    
    public int method14607(int i, int i_3_) {
	return 0;
    }
    
    public int method14608() {
	if (aLong12154 == 0L)
	    throw new IllegalStateException("");
	anOpenGL12152.swapBuffers(aLong12154);
	return 0;
    }
    
    public int method14610() {
	if (aLong12154 == 0L)
	    throw new IllegalStateException("");
	anOpenGL12152.swapBuffers(aLong12154);
	return 0;
    }
    
    public int method2713() {
	return anInt12155;
    }
    
    public int method14612(int i, int i_4_) {
	return 0;
    }
    
    void method18828() {
	Dimension dimension = aCanvas12153.getSize();
	anInt12157 = dimension.height;
	anInt12155 = dimension.width;
    }
    
    public void method222() {
	if (aLong12154 != 0L) {
	    anOpenGL12152.releaseSurface(aCanvas12153, aLong12154);
	    aLong12154 = 0L;
	}
    }
}
