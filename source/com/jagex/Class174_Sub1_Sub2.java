/* Class174_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaggl.OpenGL;

public class Class174_Sub1_Sub2 extends Class174_Sub1
{
    static int[] anIntArray11566 = new int[4];
    Class136_Sub3 aClass136_Sub3_11567;
    Class182_Sub3 aClass182_Sub3_11568;
    static int[] anIntArray11569 = new int[4];
    
    int method18165() {
	return aClass136_Sub3_11567.anInt8950;
    }
    
    Class136_Sub3 method15163() {
	return aClass136_Sub3_11567;
    }
    
    Class136_Sub3 method15160() {
	return aClass136_Sub3_11567;
    }
    
    boolean method18166(Class136_Sub3 class136_sub3,
			Class136_Sub3 class136_sub3_0_, float f) {
	boolean bool = true;
	Class168_Sub2_Sub2 class168_sub2_sub2
	    = aClass182_Sub3_11568.aClass168_Sub2_Sub2_9822;
	aClass182_Sub3_11568.method3187(anIntArray11566);
	aClass182_Sub3_11568.method3480();
	aClass182_Sub3_11568.method3181(anIntArray11569);
	aClass182_Sub3_11568.method15361();
	OpenGL.glMatrixMode(5889);
	OpenGL.glLoadIdentity();
	OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
	OpenGL.glMatrixMode(5888);
	OpenGL.glLoadIdentity();
	OpenGL.glViewport(0, 0, aClass136_Sub3_11567.anInt8950,
			  aClass136_Sub3_11567.anInt8950);
	aClass182_Sub3_11568.method15549(false);
	aClass182_Sub3_11568.method15404(false);
	aClass182_Sub3_11568.method15406(false);
	aClass182_Sub3_11568.method15512(false);
	aClass182_Sub3_11568.method15455(-2);
	aClass182_Sub3_11568.method15394(1);
	aClass182_Sub3_11568.method15482(0.0F, 0.0F, 0.0F, f);
	aClass182_Sub3_11568.method15398(34165, 34165);
	aClass182_Sub3_11568.method15395(class136_sub3_0_);
	aClass182_Sub3_11568.method15394(0);
	aClass182_Sub3_11568.method15396(1);
	aClass182_Sub3_11568.method15395(class136_sub3);
	aClass182_Sub3_11568.method3158(class168_sub2_sub2, -1166817212);
	for (int i = 0; i < 6; i++) {
	    int i_1_ = 34069 + i;
	    class168_sub2_sub2
		.method15585(0, aClass136_Sub3_11567.method14501(i_1_, 0));
	    class168_sub2_sub2.method18155(0);
	    if (class168_sub2_sub2.method15588()) {
		OpenGL.glBegin(7);
		switch (i_1_) {
		case 34071:
		    OpenGL.glTexCoord3i(-65534, 65535, -65534);
		    OpenGL.glMultiTexCoord3i(33985, -65534, 65535, -65534);
		    OpenGL.glVertex2f(0.0F, 0.0F);
		    OpenGL.glTexCoord3i(65534, 65535, -65534);
		    OpenGL.glMultiTexCoord3i(33985, 65534, 65535, -65534);
		    OpenGL.glVertex2f(1.0F, 0.0F);
		    OpenGL.glTexCoord3i(65534, 65535, 65534);
		    OpenGL.glMultiTexCoord3i(33985, 65534, 65535, 65534);
		    OpenGL.glVertex2f(1.0F, 1.0F);
		    OpenGL.glTexCoord3i(-65534, 65535, 65534);
		    OpenGL.glMultiTexCoord3i(33985, -65534, 65535, 65534);
		    OpenGL.glVertex2f(0.0F, 1.0F);
		    break;
		case 34073:
		    OpenGL.glTexCoord3i(-65534, 65534, 65535);
		    OpenGL.glMultiTexCoord3i(33985, -65534, 65534, 65535);
		    OpenGL.glVertex2f(0.0F, 0.0F);
		    OpenGL.glTexCoord3i(65534, 65534, 65535);
		    OpenGL.glMultiTexCoord3i(33985, 65534, 65534, 65535);
		    OpenGL.glVertex2f(1.0F, 0.0F);
		    OpenGL.glTexCoord3i(65534, -65534, 65535);
		    OpenGL.glMultiTexCoord3i(33985, 65534, -65534, 65535);
		    OpenGL.glVertex2f(1.0F, 1.0F);
		    OpenGL.glTexCoord3i(-65534, -65534, 65535);
		    OpenGL.glMultiTexCoord3i(33985, -65534, -65534, 65535);
		    OpenGL.glVertex2f(0.0F, 1.0F);
		    break;
		case 34072:
		    OpenGL.glTexCoord3i(-65534, -65535, 65534);
		    OpenGL.glMultiTexCoord3i(33985, -65534, -65535, 65534);
		    OpenGL.glVertex2f(0.0F, 0.0F);
		    OpenGL.glTexCoord3i(65534, -65535, 65534);
		    OpenGL.glMultiTexCoord3i(33985, 65534, -65535, 65534);
		    OpenGL.glVertex2f(1.0F, 0.0F);
		    OpenGL.glTexCoord3i(65534, -65535, -65534);
		    OpenGL.glMultiTexCoord3i(33985, 65534, -65535, -65534);
		    OpenGL.glVertex2f(1.0F, 1.0F);
		    OpenGL.glTexCoord3i(-65534, -65535, -65534);
		    OpenGL.glMultiTexCoord3i(33985, -65534, -65535, -65534);
		    OpenGL.glVertex2f(0.0F, 1.0F);
		    break;
		case 34069:
		    OpenGL.glTexCoord3i(65535, 65534, 65534);
		    OpenGL.glMultiTexCoord3i(33985, 65535, 65534, 65534);
		    OpenGL.glVertex2f(0.0F, 0.0F);
		    OpenGL.glTexCoord3i(65535, 65534, -65534);
		    OpenGL.glMultiTexCoord3i(33985, 65535, 65534, -65534);
		    OpenGL.glVertex2f(1.0F, 0.0F);
		    OpenGL.glTexCoord3i(65535, -65534, -65534);
		    OpenGL.glMultiTexCoord3i(33985, 65535, -65534, -65534);
		    OpenGL.glVertex2f(1.0F, 1.0F);
		    OpenGL.glTexCoord3i(65535, -65534, 65534);
		    OpenGL.glMultiTexCoord3i(33985, 65535, -65534, 65534);
		    OpenGL.glVertex2f(0.0F, 1.0F);
		    break;
		case 34070:
		    OpenGL.glTexCoord3i(-65535, 65534, -65534);
		    OpenGL.glMultiTexCoord3i(33985, -65535, 65534, -65534);
		    OpenGL.glVertex2f(0.0F, 0.0F);
		    OpenGL.glTexCoord3i(-65535, 65534, 65534);
		    OpenGL.glMultiTexCoord3i(33985, -65535, 65534, 65534);
		    OpenGL.glVertex2f(1.0F, 0.0F);
		    OpenGL.glTexCoord3i(-65535, -65534, 65534);
		    OpenGL.glMultiTexCoord3i(33985, -65535, -65534, 65534);
		    OpenGL.glVertex2f(1.0F, 1.0F);
		    OpenGL.glTexCoord3i(-65535, -65534, -65534);
		    OpenGL.glMultiTexCoord3i(33985, -65535, -65534, -65534);
		    OpenGL.glVertex2f(0.0F, 1.0F);
		    break;
		case 34074:
		    OpenGL.glTexCoord3i(65534, 65534, -65535);
		    OpenGL.glMultiTexCoord3i(33985, 65534, 65534, -65535);
		    OpenGL.glVertex2f(0.0F, 0.0F);
		    OpenGL.glTexCoord3i(-65534, 65534, -65535);
		    OpenGL.glMultiTexCoord3i(33985, -65534, 65534, -65535);
		    OpenGL.glVertex2f(1.0F, 0.0F);
		    OpenGL.glTexCoord3i(-65534, -65534, -65535);
		    OpenGL.glMultiTexCoord3i(33985, -65534, -65534, -65535);
		    OpenGL.glVertex2f(1.0F, 1.0F);
		    OpenGL.glTexCoord3i(65534, -65534, -65535);
		    OpenGL.glMultiTexCoord3i(33985, 65534, -65534, -65535);
		    OpenGL.glVertex2f(0.0F, 1.0F);
		    break;
		}
		OpenGL.glEnd();
	    } else {
		bool = false;
		break;
	    }
	}
	class168_sub2_sub2.method15585(0, null);
	aClass182_Sub3_11568.method3159(class168_sub2_sub2, -1876999470);
	aClass182_Sub3_11568.method15394(1);
	aClass182_Sub3_11568.method15395(null);
	aClass182_Sub3_11568.method15398(8448, 8448);
	aClass182_Sub3_11568.method15394(0);
	aClass182_Sub3_11568.method15395(null);
	aClass182_Sub3_11568.method3184(anIntArray11566[0], anIntArray11566[1],
					anIntArray11566[2],
					anIntArray11566[3]);
	aClass182_Sub3_11568.method3277(anIntArray11569[0], anIntArray11569[1],
					anIntArray11569[2],
					anIntArray11569[3]);
	if (bool && !aClass182_Sub3_11568.aBool9790)
	    aClass136_Sub3_11567.method2306();
	return bool;
    }
    
    Class136_Sub3 method15161() {
	return aClass136_Sub3_11567;
    }
    
    int method18167() {
	return aClass136_Sub3_11567.anInt8950;
    }
    
    int method18168() {
	return aClass136_Sub3_11567.anInt8950;
    }
    
    int method18169() {
	return aClass136_Sub3_11567.anInt8950;
    }
    
    Class174_Sub1_Sub2(Class182_Sub3 class182_sub3, int i) {
	aClass182_Sub3_11568 = class182_sub3;
	aClass136_Sub3_11567
	    = new Class136_Sub3(class182_sub3, Class165.aClass165_1771,
				Class178.aClass178_1905, i);
    }
    
    Class136_Sub3 method15162() {
	return aClass136_Sub3_11567;
    }
    
    boolean method18170(Class136_Sub3 class136_sub3,
			Class136_Sub3 class136_sub3_2_, float f) {
	boolean bool = true;
	Class168_Sub2_Sub2 class168_sub2_sub2
	    = aClass182_Sub3_11568.aClass168_Sub2_Sub2_9822;
	aClass182_Sub3_11568.method3187(anIntArray11566);
	aClass182_Sub3_11568.method3480();
	aClass182_Sub3_11568.method3181(anIntArray11569);
	aClass182_Sub3_11568.method15361();
	OpenGL.glMatrixMode(5889);
	OpenGL.glLoadIdentity();
	OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
	OpenGL.glMatrixMode(5888);
	OpenGL.glLoadIdentity();
	OpenGL.glViewport(0, 0, aClass136_Sub3_11567.anInt8950,
			  aClass136_Sub3_11567.anInt8950);
	aClass182_Sub3_11568.method15549(false);
	aClass182_Sub3_11568.method15404(false);
	aClass182_Sub3_11568.method15406(false);
	aClass182_Sub3_11568.method15512(false);
	aClass182_Sub3_11568.method15455(-2);
	aClass182_Sub3_11568.method15394(1);
	aClass182_Sub3_11568.method15482(0.0F, 0.0F, 0.0F, f);
	aClass182_Sub3_11568.method15398(34165, 34165);
	aClass182_Sub3_11568.method15395(class136_sub3_2_);
	aClass182_Sub3_11568.method15394(0);
	aClass182_Sub3_11568.method15396(1);
	aClass182_Sub3_11568.method15395(class136_sub3);
	aClass182_Sub3_11568.method3158(class168_sub2_sub2, -1166817212);
	for (int i = 0; i < 6; i++) {
	    int i_3_ = 34069 + i;
	    class168_sub2_sub2
		.method15585(0, aClass136_Sub3_11567.method14501(i_3_, 0));
	    class168_sub2_sub2.method18155(0);
	    if (class168_sub2_sub2.method15588()) {
		OpenGL.glBegin(7);
		switch (i_3_) {
		case 34071:
		    OpenGL.glTexCoord3i(-65534, 65535, -65534);
		    OpenGL.glMultiTexCoord3i(33985, -65534, 65535, -65534);
		    OpenGL.glVertex2f(0.0F, 0.0F);
		    OpenGL.glTexCoord3i(65534, 65535, -65534);
		    OpenGL.glMultiTexCoord3i(33985, 65534, 65535, -65534);
		    OpenGL.glVertex2f(1.0F, 0.0F);
		    OpenGL.glTexCoord3i(65534, 65535, 65534);
		    OpenGL.glMultiTexCoord3i(33985, 65534, 65535, 65534);
		    OpenGL.glVertex2f(1.0F, 1.0F);
		    OpenGL.glTexCoord3i(-65534, 65535, 65534);
		    OpenGL.glMultiTexCoord3i(33985, -65534, 65535, 65534);
		    OpenGL.glVertex2f(0.0F, 1.0F);
		    break;
		case 34073:
		    OpenGL.glTexCoord3i(-65534, 65534, 65535);
		    OpenGL.glMultiTexCoord3i(33985, -65534, 65534, 65535);
		    OpenGL.glVertex2f(0.0F, 0.0F);
		    OpenGL.glTexCoord3i(65534, 65534, 65535);
		    OpenGL.glMultiTexCoord3i(33985, 65534, 65534, 65535);
		    OpenGL.glVertex2f(1.0F, 0.0F);
		    OpenGL.glTexCoord3i(65534, -65534, 65535);
		    OpenGL.glMultiTexCoord3i(33985, 65534, -65534, 65535);
		    OpenGL.glVertex2f(1.0F, 1.0F);
		    OpenGL.glTexCoord3i(-65534, -65534, 65535);
		    OpenGL.glMultiTexCoord3i(33985, -65534, -65534, 65535);
		    OpenGL.glVertex2f(0.0F, 1.0F);
		    break;
		case 34072:
		    OpenGL.glTexCoord3i(-65534, -65535, 65534);
		    OpenGL.glMultiTexCoord3i(33985, -65534, -65535, 65534);
		    OpenGL.glVertex2f(0.0F, 0.0F);
		    OpenGL.glTexCoord3i(65534, -65535, 65534);
		    OpenGL.glMultiTexCoord3i(33985, 65534, -65535, 65534);
		    OpenGL.glVertex2f(1.0F, 0.0F);
		    OpenGL.glTexCoord3i(65534, -65535, -65534);
		    OpenGL.glMultiTexCoord3i(33985, 65534, -65535, -65534);
		    OpenGL.glVertex2f(1.0F, 1.0F);
		    OpenGL.glTexCoord3i(-65534, -65535, -65534);
		    OpenGL.glMultiTexCoord3i(33985, -65534, -65535, -65534);
		    OpenGL.glVertex2f(0.0F, 1.0F);
		    break;
		case 34069:
		    OpenGL.glTexCoord3i(65535, 65534, 65534);
		    OpenGL.glMultiTexCoord3i(33985, 65535, 65534, 65534);
		    OpenGL.glVertex2f(0.0F, 0.0F);
		    OpenGL.glTexCoord3i(65535, 65534, -65534);
		    OpenGL.glMultiTexCoord3i(33985, 65535, 65534, -65534);
		    OpenGL.glVertex2f(1.0F, 0.0F);
		    OpenGL.glTexCoord3i(65535, -65534, -65534);
		    OpenGL.glMultiTexCoord3i(33985, 65535, -65534, -65534);
		    OpenGL.glVertex2f(1.0F, 1.0F);
		    OpenGL.glTexCoord3i(65535, -65534, 65534);
		    OpenGL.glMultiTexCoord3i(33985, 65535, -65534, 65534);
		    OpenGL.glVertex2f(0.0F, 1.0F);
		    break;
		case 34070:
		    OpenGL.glTexCoord3i(-65535, 65534, -65534);
		    OpenGL.glMultiTexCoord3i(33985, -65535, 65534, -65534);
		    OpenGL.glVertex2f(0.0F, 0.0F);
		    OpenGL.glTexCoord3i(-65535, 65534, 65534);
		    OpenGL.glMultiTexCoord3i(33985, -65535, 65534, 65534);
		    OpenGL.glVertex2f(1.0F, 0.0F);
		    OpenGL.glTexCoord3i(-65535, -65534, 65534);
		    OpenGL.glMultiTexCoord3i(33985, -65535, -65534, 65534);
		    OpenGL.glVertex2f(1.0F, 1.0F);
		    OpenGL.glTexCoord3i(-65535, -65534, -65534);
		    OpenGL.glMultiTexCoord3i(33985, -65535, -65534, -65534);
		    OpenGL.glVertex2f(0.0F, 1.0F);
		    break;
		case 34074:
		    OpenGL.glTexCoord3i(65534, 65534, -65535);
		    OpenGL.glMultiTexCoord3i(33985, 65534, 65534, -65535);
		    OpenGL.glVertex2f(0.0F, 0.0F);
		    OpenGL.glTexCoord3i(-65534, 65534, -65535);
		    OpenGL.glMultiTexCoord3i(33985, -65534, 65534, -65535);
		    OpenGL.glVertex2f(1.0F, 0.0F);
		    OpenGL.glTexCoord3i(-65534, -65534, -65535);
		    OpenGL.glMultiTexCoord3i(33985, -65534, -65534, -65535);
		    OpenGL.glVertex2f(1.0F, 1.0F);
		    OpenGL.glTexCoord3i(65534, -65534, -65535);
		    OpenGL.glMultiTexCoord3i(33985, 65534, -65534, -65535);
		    OpenGL.glVertex2f(0.0F, 1.0F);
		    break;
		}
		OpenGL.glEnd();
	    } else {
		bool = false;
		break;
	    }
	}
	class168_sub2_sub2.method15585(0, null);
	aClass182_Sub3_11568.method3159(class168_sub2_sub2, -1876999470);
	aClass182_Sub3_11568.method15394(1);
	aClass182_Sub3_11568.method15395(null);
	aClass182_Sub3_11568.method15398(8448, 8448);
	aClass182_Sub3_11568.method15394(0);
	aClass182_Sub3_11568.method15395(null);
	aClass182_Sub3_11568.method3184(anIntArray11566[0], anIntArray11566[1],
					anIntArray11566[2],
					anIntArray11566[3]);
	aClass182_Sub3_11568.method3277(anIntArray11569[0], anIntArray11569[1],
					anIntArray11569[2],
					anIntArray11569[3]);
	if (bool && !aClass182_Sub3_11568.aBool9790)
	    aClass136_Sub3_11567.method2306();
	return bool;
    }
    
    boolean method18171(Class136_Sub3 class136_sub3,
			Class136_Sub3 class136_sub3_4_, float f) {
	boolean bool = true;
	Class168_Sub2_Sub2 class168_sub2_sub2
	    = aClass182_Sub3_11568.aClass168_Sub2_Sub2_9822;
	aClass182_Sub3_11568.method3187(anIntArray11566);
	aClass182_Sub3_11568.method3480();
	aClass182_Sub3_11568.method3181(anIntArray11569);
	aClass182_Sub3_11568.method15361();
	OpenGL.glMatrixMode(5889);
	OpenGL.glLoadIdentity();
	OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
	OpenGL.glMatrixMode(5888);
	OpenGL.glLoadIdentity();
	OpenGL.glViewport(0, 0, aClass136_Sub3_11567.anInt8950,
			  aClass136_Sub3_11567.anInt8950);
	aClass182_Sub3_11568.method15549(false);
	aClass182_Sub3_11568.method15404(false);
	aClass182_Sub3_11568.method15406(false);
	aClass182_Sub3_11568.method15512(false);
	aClass182_Sub3_11568.method15455(-2);
	aClass182_Sub3_11568.method15394(1);
	aClass182_Sub3_11568.method15482(0.0F, 0.0F, 0.0F, f);
	aClass182_Sub3_11568.method15398(34165, 34165);
	aClass182_Sub3_11568.method15395(class136_sub3_4_);
	aClass182_Sub3_11568.method15394(0);
	aClass182_Sub3_11568.method15396(1);
	aClass182_Sub3_11568.method15395(class136_sub3);
	aClass182_Sub3_11568.method3158(class168_sub2_sub2, -1166817212);
	for (int i = 0; i < 6; i++) {
	    int i_5_ = 34069 + i;
	    class168_sub2_sub2
		.method15585(0, aClass136_Sub3_11567.method14501(i_5_, 0));
	    class168_sub2_sub2.method18155(0);
	    if (class168_sub2_sub2.method15588()) {
		OpenGL.glBegin(7);
		switch (i_5_) {
		case 34071:
		    OpenGL.glTexCoord3i(-65534, 65535, -65534);
		    OpenGL.glMultiTexCoord3i(33985, -65534, 65535, -65534);
		    OpenGL.glVertex2f(0.0F, 0.0F);
		    OpenGL.glTexCoord3i(65534, 65535, -65534);
		    OpenGL.glMultiTexCoord3i(33985, 65534, 65535, -65534);
		    OpenGL.glVertex2f(1.0F, 0.0F);
		    OpenGL.glTexCoord3i(65534, 65535, 65534);
		    OpenGL.glMultiTexCoord3i(33985, 65534, 65535, 65534);
		    OpenGL.glVertex2f(1.0F, 1.0F);
		    OpenGL.glTexCoord3i(-65534, 65535, 65534);
		    OpenGL.glMultiTexCoord3i(33985, -65534, 65535, 65534);
		    OpenGL.glVertex2f(0.0F, 1.0F);
		    break;
		case 34073:
		    OpenGL.glTexCoord3i(-65534, 65534, 65535);
		    OpenGL.glMultiTexCoord3i(33985, -65534, 65534, 65535);
		    OpenGL.glVertex2f(0.0F, 0.0F);
		    OpenGL.glTexCoord3i(65534, 65534, 65535);
		    OpenGL.glMultiTexCoord3i(33985, 65534, 65534, 65535);
		    OpenGL.glVertex2f(1.0F, 0.0F);
		    OpenGL.glTexCoord3i(65534, -65534, 65535);
		    OpenGL.glMultiTexCoord3i(33985, 65534, -65534, 65535);
		    OpenGL.glVertex2f(1.0F, 1.0F);
		    OpenGL.glTexCoord3i(-65534, -65534, 65535);
		    OpenGL.glMultiTexCoord3i(33985, -65534, -65534, 65535);
		    OpenGL.glVertex2f(0.0F, 1.0F);
		    break;
		case 34072:
		    OpenGL.glTexCoord3i(-65534, -65535, 65534);
		    OpenGL.glMultiTexCoord3i(33985, -65534, -65535, 65534);
		    OpenGL.glVertex2f(0.0F, 0.0F);
		    OpenGL.glTexCoord3i(65534, -65535, 65534);
		    OpenGL.glMultiTexCoord3i(33985, 65534, -65535, 65534);
		    OpenGL.glVertex2f(1.0F, 0.0F);
		    OpenGL.glTexCoord3i(65534, -65535, -65534);
		    OpenGL.glMultiTexCoord3i(33985, 65534, -65535, -65534);
		    OpenGL.glVertex2f(1.0F, 1.0F);
		    OpenGL.glTexCoord3i(-65534, -65535, -65534);
		    OpenGL.glMultiTexCoord3i(33985, -65534, -65535, -65534);
		    OpenGL.glVertex2f(0.0F, 1.0F);
		    break;
		case 34069:
		    OpenGL.glTexCoord3i(65535, 65534, 65534);
		    OpenGL.glMultiTexCoord3i(33985, 65535, 65534, 65534);
		    OpenGL.glVertex2f(0.0F, 0.0F);
		    OpenGL.glTexCoord3i(65535, 65534, -65534);
		    OpenGL.glMultiTexCoord3i(33985, 65535, 65534, -65534);
		    OpenGL.glVertex2f(1.0F, 0.0F);
		    OpenGL.glTexCoord3i(65535, -65534, -65534);
		    OpenGL.glMultiTexCoord3i(33985, 65535, -65534, -65534);
		    OpenGL.glVertex2f(1.0F, 1.0F);
		    OpenGL.glTexCoord3i(65535, -65534, 65534);
		    OpenGL.glMultiTexCoord3i(33985, 65535, -65534, 65534);
		    OpenGL.glVertex2f(0.0F, 1.0F);
		    break;
		case 34070:
		    OpenGL.glTexCoord3i(-65535, 65534, -65534);
		    OpenGL.glMultiTexCoord3i(33985, -65535, 65534, -65534);
		    OpenGL.glVertex2f(0.0F, 0.0F);
		    OpenGL.glTexCoord3i(-65535, 65534, 65534);
		    OpenGL.glMultiTexCoord3i(33985, -65535, 65534, 65534);
		    OpenGL.glVertex2f(1.0F, 0.0F);
		    OpenGL.glTexCoord3i(-65535, -65534, 65534);
		    OpenGL.glMultiTexCoord3i(33985, -65535, -65534, 65534);
		    OpenGL.glVertex2f(1.0F, 1.0F);
		    OpenGL.glTexCoord3i(-65535, -65534, -65534);
		    OpenGL.glMultiTexCoord3i(33985, -65535, -65534, -65534);
		    OpenGL.glVertex2f(0.0F, 1.0F);
		    break;
		case 34074:
		    OpenGL.glTexCoord3i(65534, 65534, -65535);
		    OpenGL.glMultiTexCoord3i(33985, 65534, 65534, -65535);
		    OpenGL.glVertex2f(0.0F, 0.0F);
		    OpenGL.glTexCoord3i(-65534, 65534, -65535);
		    OpenGL.glMultiTexCoord3i(33985, -65534, 65534, -65535);
		    OpenGL.glVertex2f(1.0F, 0.0F);
		    OpenGL.glTexCoord3i(-65534, -65534, -65535);
		    OpenGL.glMultiTexCoord3i(33985, -65534, -65534, -65535);
		    OpenGL.glVertex2f(1.0F, 1.0F);
		    OpenGL.glTexCoord3i(65534, -65534, -65535);
		    OpenGL.glMultiTexCoord3i(33985, 65534, -65534, -65535);
		    OpenGL.glVertex2f(0.0F, 1.0F);
		    break;
		}
		OpenGL.glEnd();
	    } else {
		bool = false;
		break;
	    }
	}
	class168_sub2_sub2.method15585(0, null);
	aClass182_Sub3_11568.method3159(class168_sub2_sub2, -1876999470);
	aClass182_Sub3_11568.method15394(1);
	aClass182_Sub3_11568.method15395(null);
	aClass182_Sub3_11568.method15398(8448, 8448);
	aClass182_Sub3_11568.method15394(0);
	aClass182_Sub3_11568.method15395(null);
	aClass182_Sub3_11568.method3184(anIntArray11566[0], anIntArray11566[1],
					anIntArray11566[2],
					anIntArray11566[3]);
	aClass182_Sub3_11568.method3277(anIntArray11569[0], anIntArray11569[1],
					anIntArray11569[2],
					anIntArray11569[3]);
	if (bool && !aClass182_Sub3_11568.aBool9790)
	    aClass136_Sub3_11567.method2306();
	return bool;
    }
    
    boolean method18172(Class136_Sub3 class136_sub3,
			Class136_Sub3 class136_sub3_6_, float f) {
	boolean bool = true;
	Class168_Sub2_Sub2 class168_sub2_sub2
	    = aClass182_Sub3_11568.aClass168_Sub2_Sub2_9822;
	aClass182_Sub3_11568.method3187(anIntArray11566);
	aClass182_Sub3_11568.method3480();
	aClass182_Sub3_11568.method3181(anIntArray11569);
	aClass182_Sub3_11568.method15361();
	OpenGL.glMatrixMode(5889);
	OpenGL.glLoadIdentity();
	OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
	OpenGL.glMatrixMode(5888);
	OpenGL.glLoadIdentity();
	OpenGL.glViewport(0, 0, aClass136_Sub3_11567.anInt8950,
			  aClass136_Sub3_11567.anInt8950);
	aClass182_Sub3_11568.method15549(false);
	aClass182_Sub3_11568.method15404(false);
	aClass182_Sub3_11568.method15406(false);
	aClass182_Sub3_11568.method15512(false);
	aClass182_Sub3_11568.method15455(-2);
	aClass182_Sub3_11568.method15394(1);
	aClass182_Sub3_11568.method15482(0.0F, 0.0F, 0.0F, f);
	aClass182_Sub3_11568.method15398(34165, 34165);
	aClass182_Sub3_11568.method15395(class136_sub3_6_);
	aClass182_Sub3_11568.method15394(0);
	aClass182_Sub3_11568.method15396(1);
	aClass182_Sub3_11568.method15395(class136_sub3);
	aClass182_Sub3_11568.method3158(class168_sub2_sub2, -1166817212);
	for (int i = 0; i < 6; i++) {
	    int i_7_ = 34069 + i;
	    class168_sub2_sub2
		.method15585(0, aClass136_Sub3_11567.method14501(i_7_, 0));
	    class168_sub2_sub2.method18155(0);
	    if (class168_sub2_sub2.method15588()) {
		OpenGL.glBegin(7);
		switch (i_7_) {
		case 34071:
		    OpenGL.glTexCoord3i(-65534, 65535, -65534);
		    OpenGL.glMultiTexCoord3i(33985, -65534, 65535, -65534);
		    OpenGL.glVertex2f(0.0F, 0.0F);
		    OpenGL.glTexCoord3i(65534, 65535, -65534);
		    OpenGL.glMultiTexCoord3i(33985, 65534, 65535, -65534);
		    OpenGL.glVertex2f(1.0F, 0.0F);
		    OpenGL.glTexCoord3i(65534, 65535, 65534);
		    OpenGL.glMultiTexCoord3i(33985, 65534, 65535, 65534);
		    OpenGL.glVertex2f(1.0F, 1.0F);
		    OpenGL.glTexCoord3i(-65534, 65535, 65534);
		    OpenGL.glMultiTexCoord3i(33985, -65534, 65535, 65534);
		    OpenGL.glVertex2f(0.0F, 1.0F);
		    break;
		case 34073:
		    OpenGL.glTexCoord3i(-65534, 65534, 65535);
		    OpenGL.glMultiTexCoord3i(33985, -65534, 65534, 65535);
		    OpenGL.glVertex2f(0.0F, 0.0F);
		    OpenGL.glTexCoord3i(65534, 65534, 65535);
		    OpenGL.glMultiTexCoord3i(33985, 65534, 65534, 65535);
		    OpenGL.glVertex2f(1.0F, 0.0F);
		    OpenGL.glTexCoord3i(65534, -65534, 65535);
		    OpenGL.glMultiTexCoord3i(33985, 65534, -65534, 65535);
		    OpenGL.glVertex2f(1.0F, 1.0F);
		    OpenGL.glTexCoord3i(-65534, -65534, 65535);
		    OpenGL.glMultiTexCoord3i(33985, -65534, -65534, 65535);
		    OpenGL.glVertex2f(0.0F, 1.0F);
		    break;
		case 34072:
		    OpenGL.glTexCoord3i(-65534, -65535, 65534);
		    OpenGL.glMultiTexCoord3i(33985, -65534, -65535, 65534);
		    OpenGL.glVertex2f(0.0F, 0.0F);
		    OpenGL.glTexCoord3i(65534, -65535, 65534);
		    OpenGL.glMultiTexCoord3i(33985, 65534, -65535, 65534);
		    OpenGL.glVertex2f(1.0F, 0.0F);
		    OpenGL.glTexCoord3i(65534, -65535, -65534);
		    OpenGL.glMultiTexCoord3i(33985, 65534, -65535, -65534);
		    OpenGL.glVertex2f(1.0F, 1.0F);
		    OpenGL.glTexCoord3i(-65534, -65535, -65534);
		    OpenGL.glMultiTexCoord3i(33985, -65534, -65535, -65534);
		    OpenGL.glVertex2f(0.0F, 1.0F);
		    break;
		case 34069:
		    OpenGL.glTexCoord3i(65535, 65534, 65534);
		    OpenGL.glMultiTexCoord3i(33985, 65535, 65534, 65534);
		    OpenGL.glVertex2f(0.0F, 0.0F);
		    OpenGL.glTexCoord3i(65535, 65534, -65534);
		    OpenGL.glMultiTexCoord3i(33985, 65535, 65534, -65534);
		    OpenGL.glVertex2f(1.0F, 0.0F);
		    OpenGL.glTexCoord3i(65535, -65534, -65534);
		    OpenGL.glMultiTexCoord3i(33985, 65535, -65534, -65534);
		    OpenGL.glVertex2f(1.0F, 1.0F);
		    OpenGL.glTexCoord3i(65535, -65534, 65534);
		    OpenGL.glMultiTexCoord3i(33985, 65535, -65534, 65534);
		    OpenGL.glVertex2f(0.0F, 1.0F);
		    break;
		case 34070:
		    OpenGL.glTexCoord3i(-65535, 65534, -65534);
		    OpenGL.glMultiTexCoord3i(33985, -65535, 65534, -65534);
		    OpenGL.glVertex2f(0.0F, 0.0F);
		    OpenGL.glTexCoord3i(-65535, 65534, 65534);
		    OpenGL.glMultiTexCoord3i(33985, -65535, 65534, 65534);
		    OpenGL.glVertex2f(1.0F, 0.0F);
		    OpenGL.glTexCoord3i(-65535, -65534, 65534);
		    OpenGL.glMultiTexCoord3i(33985, -65535, -65534, 65534);
		    OpenGL.glVertex2f(1.0F, 1.0F);
		    OpenGL.glTexCoord3i(-65535, -65534, -65534);
		    OpenGL.glMultiTexCoord3i(33985, -65535, -65534, -65534);
		    OpenGL.glVertex2f(0.0F, 1.0F);
		    break;
		case 34074:
		    OpenGL.glTexCoord3i(65534, 65534, -65535);
		    OpenGL.glMultiTexCoord3i(33985, 65534, 65534, -65535);
		    OpenGL.glVertex2f(0.0F, 0.0F);
		    OpenGL.glTexCoord3i(-65534, 65534, -65535);
		    OpenGL.glMultiTexCoord3i(33985, -65534, 65534, -65535);
		    OpenGL.glVertex2f(1.0F, 0.0F);
		    OpenGL.glTexCoord3i(-65534, -65534, -65535);
		    OpenGL.glMultiTexCoord3i(33985, -65534, -65534, -65535);
		    OpenGL.glVertex2f(1.0F, 1.0F);
		    OpenGL.glTexCoord3i(65534, -65534, -65535);
		    OpenGL.glMultiTexCoord3i(33985, 65534, -65534, -65535);
		    OpenGL.glVertex2f(0.0F, 1.0F);
		    break;
		}
		OpenGL.glEnd();
	    } else {
		bool = false;
		break;
	    }
	}
	class168_sub2_sub2.method15585(0, null);
	aClass182_Sub3_11568.method3159(class168_sub2_sub2, -1876999470);
	aClass182_Sub3_11568.method15394(1);
	aClass182_Sub3_11568.method15395(null);
	aClass182_Sub3_11568.method15398(8448, 8448);
	aClass182_Sub3_11568.method15394(0);
	aClass182_Sub3_11568.method15395(null);
	aClass182_Sub3_11568.method3184(anIntArray11566[0], anIntArray11566[1],
					anIntArray11566[2],
					anIntArray11566[3]);
	aClass182_Sub3_11568.method3277(anIntArray11569[0], anIntArray11569[1],
					anIntArray11569[2],
					anIntArray11569[3]);
	if (bool && !aClass182_Sub3_11568.aBool9790)
	    aClass136_Sub3_11567.method2306();
	return bool;
    }
}
