/* Class136_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaggl.OpenGL;

public class Class136_Sub1 extends Class136
{
    int anInt8907;
    int anInt8908;
    int anInt8909;
    
    Class136_Sub1(Class182_Sub3 class182_sub3, Class165 class165,
		  Class178 class178, int i, int i_0_, int i_1_, byte[] is,
		  Class165 class165_2_) {
	super(class182_sub3, 32879, class165, class178, i * i_0_ * i_1_,
	      false);
	anInt8907 = i;
	anInt8908 = i_0_;
	anInt8909 = i_1_;
	aClass182_Sub3_1617.method15395(this);
	OpenGL.glPixelStorei(3317, 1);
	OpenGL.glTexImage3Dub(anInt1625, 0,
			      Class182_Sub3.method15534(aClass165_1624,
							aClass178_1627),
			      anInt8907, anInt8908, anInt8909, 0,
			      Class182_Sub3.method15421(class165_2_), 5121, is,
			      0);
	OpenGL.glPixelStorei(3317, 4);
	method2304(true);
    }
    
    Class136_Sub1(Class182_Sub3 class182_sub3, Class165 class165,
		  Class178 class178, int i, int i_3_, int i_4_) {
	super(class182_sub3, 32879, class165, class178, i * i_3_ * i_4_,
	      false);
	anInt8907 = i;
	anInt8908 = i_3_;
	anInt8909 = i_4_;
	aClass182_Sub3_1617.method15395(this);
	OpenGL.glTexImage3Dub(anInt1625, 0,
			      Class182_Sub3.method15534(aClass165_1624,
							aClass178_1627),
			      anInt8907, anInt8908, anInt8909, 0,
			      Class182_Sub3.method15421(aClass165_1624), 5121,
			      null, 0);
	method2304(true);
    }
    
    void method14466(int i, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_,
		     int i_10_) {
	aClass182_Sub3_1617.method15395(this);
	OpenGL.glCopyTexSubImage3D(anInt1625, 0, i, i_5_, i_6_, i_9_, i_10_,
				   i_7_, i_8_);
	OpenGL.glFlush();
    }
    
    void method14467(int i, int i_11_, int i_12_, int i_13_, int i_14_,
		     int i_15_, int i_16_) {
	aClass182_Sub3_1617.method15395(this);
	OpenGL.glCopyTexSubImage3D(anInt1625, 0, i, i_11_, i_12_, i_15_, i_16_,
				   i_13_, i_14_);
	OpenGL.glFlush();
    }
}
