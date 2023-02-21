/* Class490_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaggl.OpenGL;

public class Class490_Sub1 extends Class490 implements Interface37
{
    int anInt10234;
    int anInt10235;
    int anInt10236;
    
    public void method271(Class377 class377) {
	super.method271(class377);
    }
    
    public void method276() {
	super.method276();
    }
    
    Class490_Sub1(Class182_Sub1_Sub2 class182_sub1_sub2, Class165 class165,
		  int i, int i_0_, int i_1_, boolean bool, byte[] is) {
	super(class182_sub1_sub2, 32879, class165, Class178.aClass178_1905,
	      i * i_0_ * i_1_, bool);
	anInt10235 = i;
	anInt10234 = i_0_;
	anInt10236 = i_1_;
	aClass182_Sub1_Sub2_5279.method14731(this);
	OpenGL.glPixelStorei(3317, 1);
	OpenGL.glTexImage3Dub(anInt5276, 0,
			      Class182_Sub1_Sub2.method18120(aClass165_5277,
							     aClass178_5278),
			      anInt10235, anInt10234, anInt10236, 0,
			      Class182_Sub1_Sub2.method18124(aClass165_5277),
			      5121, is, 0);
	OpenGL.glPixelStorei(3317, 4);
	if (bool)
	    method239();
    }
    
    public void method127() {
	super.method127();
    }
    
    public void method126() {
	super.method127();
    }
    
    public void method125() {
	super.method127();
    }
    
    public void method274() {
	super.method276();
    }
    
    public void method275() {
	super.method276();
    }
    
    public void method273(Class377 class377) {
	super.method271(class377);
    }
    
    public void method272(Class377 class377) {
	super.method271(class377);
    }
    
    public void method277(Class377 class377) {
	super.method271(class377);
    }
    
    public void method278(Class377 class377) {
	super.method271(class377);
    }
}
