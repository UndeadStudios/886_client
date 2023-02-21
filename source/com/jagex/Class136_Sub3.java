/* Class136_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaggl.OpenGL;

public class Class136_Sub3 extends Class136
{
    static final int anInt8944 = 34071;
    static final int anInt8945 = 34070;
    static final int anInt8946 = 34074;
    static final int anInt8947 = 34072;
    static final int anInt8948 = 34069;
    static final int anInt8949 = 34073;
    int anInt8950;
    
    Interface21 method14500(int i, int i_0_) {
	return new Class132(this, i, i_0_);
    }
    
    Class136_Sub3(Class182_Sub3 class182_sub3, Class165 class165,
		  Class178 class178, int i, boolean bool, int[][] is) {
	super(class182_sub3, 34067, class165, class178, i * i * 6, bool);
	anInt8950 = i;
	aClass182_Sub3_1617.method15395(this);
	if (bool) {
	    for (int i_1_ = 0; i_1_ < 6; i_1_++)
		method2313(34069 + i_1_,
			   Class182_Sub3.method15534(aClass165_1624,
						     aClass178_1627),
			   i, i, 32993, aClass182_Sub3_1617.anInt9817,
			   is[i_1_]);
	} else {
	    for (int i_2_ = 0; i_2_ < 6; i_2_++)
		OpenGL.glTexImage2Di(34069 + i_2_, 0,
				     Class182_Sub3.method15534(aClass165_1624,
							       aClass178_1627),
				     i, i, 0, 32993,
				     aClass182_Sub3_1617.anInt9817, is[i_2_],
				     0);
	}
	method2304(true);
    }
    
    Class136_Sub3(Class182_Sub3 class182_sub3, Class165 class165,
		  Class178 class178, int i, boolean bool, byte[][] is,
		  Class165 class165_3_) {
	super(class182_sub3, 34067, class165, class178, i * i * 6, bool);
	anInt8950 = i;
	aClass182_Sub3_1617.method15395(this);
	for (int i_4_ = 0; i_4_ < 6; i_4_++)
	    OpenGL.glTexImage2Dub(34069 + i_4_, 0,
				  Class182_Sub3.method15534(aClass165_1624,
							    aClass178_1627),
				  i, i, 0,
				  Class182_Sub3.method15421(class165_3_), 5121,
				  is[i_4_], 0);
	method2304(true);
    }
    
    Interface21 method14501(int i, int i_5_) {
	return new Class132(this, i, i_5_);
    }
    
    Interface21 method14502(int i, int i_6_) {
	return new Class132(this, i, i_6_);
    }
    
    Interface21 method14503(int i, int i_7_) {
	return new Class132(this, i, i_7_);
    }
    
    Interface21 method14504(int i, int i_8_) {
	return new Class132(this, i, i_8_);
    }
    
    Interface21 method14505(int i, int i_9_) {
	return new Class132(this, i, i_9_);
    }
    
    Interface21 method14506(int i, int i_10_) {
	return new Class132(this, i, i_10_);
    }
    
    Interface21 method14507(int i, int i_11_) {
	return new Class132(this, i, i_11_);
    }
    
    Class136_Sub3(Class182_Sub3 class182_sub3, Class165 class165,
		  Class178 class178, int i) {
	super(class182_sub3, 34067, class165, class178, i * i * 6, false);
	anInt8950 = i;
	aClass182_Sub3_1617.method15395(this);
	for (int i_12_ = 0; i_12_ < 6; i_12_++)
	    OpenGL.glTexImage2Dub(34069 + i_12_, 0,
				  Class182_Sub3.method15534(aClass165_1624,
							    aClass178_1627),
				  i, i, 0,
				  Class182_Sub3.method15421(aClass165_1624),
				  5121, null, 0);
	method2304(true);
    }
}
