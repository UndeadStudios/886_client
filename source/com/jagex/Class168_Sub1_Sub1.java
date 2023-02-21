/* Class168_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Canvas;
import java.awt.Dimension;

import jaggl.OpenGL;

public class Class168_Sub1_Sub1 extends Class168_Sub1
{
    boolean aBool11544 = false;
    Canvas aCanvas11545;
    OpenGL anOpenGL11546;
    long aLong11547;
    Class182_Sub3 aClass182_Sub3_11548;
    int anInt11549;
    int anInt11550;
    boolean aBool11551 = false;
    
    void method18148() {
	Dimension dimension = aCanvas11545.getSize();
	anInt11549 = dimension.height;
	anInt11550 = dimension.width;
    }
    
    public int method2711() {
	return anInt11549;
    }
    
    public int method2710() {
	return anInt11550;
    }
    
    public int method14608() {
	if (aBool11544)
	    throw new IllegalStateException();
	anOpenGL11546.swapBuffers(aLong11547);
	return 0;
    }
    
    void method14605(int i, int i_0_) {
	if (aBool11544)
	    throw new IllegalStateException();
	anOpenGL11546.surfaceResized(aLong11547);
	method18148();
	if (this == aClass182_Sub3_11548.method3566(-1183412969))
	    aClass182_Sub3_11548.method15417();
    }
    
    Class168_Sub1_Sub1(Class182_Sub3 class182_sub3, Canvas canvas) {
	this(class182_sub3, canvas,
	     class182_sub3.anOpenGL9671.prepareSurface(canvas));
    }
    
    public int method14606() {
	if (aBool11544)
	    throw new IllegalStateException();
	anOpenGL11546.swapBuffers(aLong11547);
	return 0;
    }
    
    public int method14607(int i, int i_1_) {
	return 0;
    }
    
    public int method2716() {
	return anInt11550;
    }
    
    boolean method2712() {
	return true;
    }
    
    public void method127() {
	if (aBool11544)
	    throw new IllegalStateException();
	anOpenGL11546.releaseSurface(aCanvas11545, aLong11547);
	aBool11544 = true;
	aBool11551 = false;
    }
    
    public int method2713() {
	return anInt11550;
    }
    
    boolean method2717() {
	return true;
    }
    
    public int method2714() {
	return anInt11549;
    }
    
    boolean method351() {
	if (aBool11544)
	    throw new IllegalStateException();
	if (!aBool11551) {
	    anOpenGL11546.setSurface(aLong11547);
	    aBool11551 = true;
	}
	aClass182_Sub3_11548.method15567();
	return true;
    }
    
    public void method352() {
	if (aBool11544)
	    throw new IllegalStateException();
	anOpenGL11546.releaseSurface(aCanvas11545, aLong11547);
	aBool11544 = true;
	aBool11551 = false;
    }
    
    boolean method2709() {
	return true;
    }
    
    boolean method2715() {
	return true;
    }
    
    public int method14612(int i, int i_2_) {
	return 0;
    }
    
    public void method221() {
	if (aBool11544)
	    throw new IllegalStateException();
	anOpenGL11546.releaseSurface(aCanvas11545, aLong11547);
	aBool11544 = true;
	aBool11551 = false;
    }
    
    void method14609(int i, int i_3_) {
	if (aBool11544)
	    throw new IllegalStateException();
	anOpenGL11546.surfaceResized(aLong11547);
	method18148();
	if (this == aClass182_Sub3_11548.method3566(-868948700))
	    aClass182_Sub3_11548.method15417();
    }
    
    public void method222() {
	if (aBool11544)
	    throw new IllegalStateException();
	anOpenGL11546.releaseSurface(aCanvas11545, aLong11547);
	aBool11544 = true;
	aBool11551 = false;
    }
    
    void method18149() {
	Dimension dimension = aCanvas11545.getSize();
	anInt11549 = dimension.height;
	anInt11550 = dimension.width;
    }
    
    public int method14610() {
	if (aBool11544)
	    throw new IllegalStateException();
	anOpenGL11546.swapBuffers(aLong11547);
	return 0;
    }
    
    public int method14611(int i, int i_4_) {
	return 0;
    }
    
    Class168_Sub1_Sub1(Class182_Sub3 class182_sub3, Canvas canvas, long l) {
	aClass182_Sub3_11548 = class182_sub3;
	aCanvas11545 = canvas;
	anOpenGL11546 = class182_sub3.anOpenGL9671;
	aLong11547 = l;
	method18148();
    }
    
    void method18150() {
	Dimension dimension = aCanvas11545.getSize();
	anInt11549 = dimension.height;
	anInt11550 = dimension.width;
    }
    
    void method18151() {
	Dimension dimension = aCanvas11545.getSize();
	anInt11549 = dimension.height;
	anInt11550 = dimension.width;
    }
    
    boolean method350() {
	if (aBool11544)
	    throw new IllegalStateException();
	if (!aBool11551) {
	    anOpenGL11546.setSurface(aLong11547);
	    aBool11551 = true;
	}
	aClass182_Sub3_11548.method15567();
	return true;
    }
    
    void method18152() {
	Dimension dimension = aCanvas11545.getSize();
	anInt11549 = dimension.height;
	anInt11550 = dimension.width;
    }
}
