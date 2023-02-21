/* Class136_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaggl.OpenGL;

public class Class136_Sub4 extends Class136
{
    int anInt8955;
    
    void method14508(boolean bool) {
	aClass182_Sub3_1617.method15395(this);
	OpenGL.glTexParameteri(anInt1625, 10242, bool ? 10497 : 33071);
    }
    
    void method14509(boolean bool) {
	aClass182_Sub3_1617.method15395(this);
	OpenGL.glTexParameteri(anInt1625, 10242, bool ? 10497 : 33071);
    }
    
    Class136_Sub4(Class182_Sub3 class182_sub3, Class165 class165,
		  Class178 class178, int i, byte[] is, Class165 class165_0_) {
	super(class182_sub3, 3552, class165, class178, i, false);
	anInt8955 = i;
	aClass182_Sub3_1617.method15395(this);
	OpenGL.glPixelStorei(3317, 1);
	OpenGL.glTexImage1Dub(anInt1625, 0,
			      Class182_Sub3.method15534(aClass165_1624,
							aClass178_1627),
			      anInt8955, 0,
			      Class182_Sub3.method15421(class165_0_), 5121, is,
			      0);
	OpenGL.glPixelStorei(3317, 4);
	method2304(true);
    }
}
