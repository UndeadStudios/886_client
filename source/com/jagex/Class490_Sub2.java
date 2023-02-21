/* Class490_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaggl.OpenGL;

public class Class490_Sub2 extends Class490 implements Interface40
{
    static final int anInt10256 = 34069;
    
    public void method274() {
	super.method276();
    }
    
    public void method276() {
	super.method276();
    }
    
    public void method271(Class377 class377) {
	super.method271(class377);
    }
    
    public void method127() {
	super.method127();
    }
    
    public void method126() {
	super.method127();
    }
    
    public void method278(Class377 class377) {
	super.method271(class377);
    }
    
    public void method277(Class377 class377) {
	super.method271(class377);
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
    
    public void method125() {
	super.method127();
    }
    
    Class490_Sub2(Class182_Sub1_Sub2 class182_sub1_sub2, int i, boolean bool,
		  int[][] is) {
	super(class182_sub1_sub2, 34067, Class165.aClass165_1771,
	      Class178.aClass178_1905, i * i * 6, bool);
	for (int i_0_ = 0; i_0_ < 6; i_0_++) {
	    for (int i_1_ = 0; i_1_ < is[i_0_].length; i_1_++) {
		int i_2_ = is[i_0_][i_1_];
		is[i_0_][i_1_] = (~0xff00ff & i_2_ | (i_2_ & 0xff) << 16
				  | i_2_ >> 16 & 0xff);
	    }
	}
	aClass182_Sub1_Sub2_5279.method14731(this);
	if (bool) {
	    for (int i_3_ = 0; i_3_ < 6; i_3_++)
		method7963(34069 + i_3_, i, i, is[i_3_]);
	} else {
	    for (int i_4_ = 0; i_4_ < 6; i_4_++)
		OpenGL.glTexImage2Di
		    (34069 + i_4_, 0,
		     Class182_Sub1_Sub2.method18120(aClass165_5277,
						    aClass178_5278),
		     i, i, 0, Class182_Sub1_Sub2.method18124(aClass165_5277),
		     aClass182_Sub1_Sub2_5279.anInt11512, is[i_4_], 0);
	}
    }
}
