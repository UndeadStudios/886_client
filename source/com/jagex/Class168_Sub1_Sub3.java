/* Class168_Sub1_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Canvas;

public abstract class Class168_Sub1_Sub3 extends Class168_Sub1
{
    Class182_Sub2 aClass182_Sub2_11622;
    boolean aBool11623;
    Canvas aCanvas11624;
    int anInt11625;
    int[] anIntArray11626;
    float[] aFloatArray11627;
    int anInt11628;
    
    final boolean method2715() {
	aBool11623 = false;
	return true;
    }
    
    void method18205(int i) {
	anIntArray11626
	    = new int[-1098803169 * anInt11628 * (anInt11625 * 1162325157)];
	aFloatArray11627
	    = new float[anInt11628 * -1098803169 * (1162325157 * anInt11625)];
	if (aBool11623)
	    aClass182_Sub2_11622.method15171(anInt11628 * -1098803169,
					     anInt11625 * 1162325157,
					     anIntArray11626,
					     aFloatArray11627);
    }
    
    Class168_Sub1_Sub3(Class182_Sub2 class182_sub2, Canvas canvas, int i,
		       int i_0_) {
	aCanvas11624 = canvas;
	aClass182_Sub2_11622 = class182_sub2;
	anInt11628 = 967304159 * i;
	anInt11625 = i_0_ * 1365793581;
    }
    
    public int method2711() {
	return anInt11625 * 1162325157;
    }
    
    public int method2710() {
	return anInt11628 * -1098803169;
    }
    
    final boolean method350() {
	aClass182_Sub2_11622.method15171(anInt11628 * -1098803169,
					 anInt11625 * 1162325157,
					 anIntArray11626, aFloatArray11627);
	aBool11623 = true;
	return true;
    }
    
    final boolean method2712() {
	aBool11623 = false;
	return true;
    }
    
    public int method2713() {
	return anInt11628 * -1098803169;
    }
    
    public int method2716() {
	return anInt11628 * -1098803169;
    }
    
    public int method2714() {
	return anInt11625 * 1162325157;
    }
    
    final boolean method351() {
	aClass182_Sub2_11622.method15171(anInt11628 * -1098803169,
					 anInt11625 * 1162325157,
					 anIntArray11626, aFloatArray11627);
	aBool11623 = true;
	return true;
    }
    
    final boolean method2709() {
	aBool11623 = false;
	return true;
    }
    
    static Class168_Sub1_Sub3 method18206(Class182_Sub2 class182_sub2,
					  Canvas canvas, int i, int i_1_) {
	Class168_Sub1_Sub3_Sub1 class168_sub1_sub3_sub1
	    = new Class168_Sub1_Sub3_Sub1(class182_sub2, canvas, i, i_1_);
	return class168_sub1_sub3_sub1;
    }
    
    final boolean method2717() {
	aBool11623 = false;
	return true;
    }
    
    final void method14609(int i, int i_2_) {
	if (-1098803169 * anInt11628 != i || i_2_ != 1162325157 * anInt11625) {
	    anInt11628 = 967304159 * i;
	    anInt11625 = i_2_ * 1365793581;
	    method18205(1822714346);
	}
    }
    
    void method18207() {
	anIntArray11626
	    = new int[-1098803169 * anInt11628 * (anInt11625 * 1162325157)];
	aFloatArray11627
	    = new float[anInt11628 * -1098803169 * (1162325157 * anInt11625)];
	if (aBool11623)
	    aClass182_Sub2_11622.method15171(anInt11628 * -1098803169,
					     anInt11625 * 1162325157,
					     anIntArray11626,
					     aFloatArray11627);
    }
    
    final void method14605(int i, int i_3_) {
	if (-1098803169 * anInt11628 != i || i_3_ != 1162325157 * anInt11625) {
	    anInt11628 = 967304159 * i;
	    anInt11625 = i_3_ * 1365793581;
	    method18205(1569930515);
	}
    }
    
    static final void method18208(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class70.anInt739 * 1967819523;
    }
}
