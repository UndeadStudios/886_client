/* Class525_Sub5_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaggl.OpenGL;

public class Class525_Sub5_Sub1_Sub2 extends Class525_Sub5_Sub1
{
    int[] anIntArray12150 = null;
    Class266_Sub1 aClass266_Sub1_12151;
    
    Class525_Sub5_Sub1_Sub2(Class266_Sub1 class266_sub1, Class274 class274) {
	super(class274);
	aClass266_Sub1_12151 = class266_sub1;
    }
    
    final int method18822() {
	return anIntArray12150[aClass266_Sub1_12151.method4816(-1543940816)];
    }
    
    public boolean method18224(int i) {
	if (anIntArray12150 == null)
	    anIntArray12150 = new int[aClass266_Sub1_12151.method4810(65280)];
	Class273_Sub2 class273_sub2
	    = (Class273_Sub2) aClass266_Sub1_12151.method4811(i, 704137511);
	anIntArray12150[i]
	    = OpenGL.glGetUniformLocation(class273_sub2.anInt10070,
					  method18225((byte) -31));
	return anIntArray12150[i] != -1;
    }
    
    public final int method18229(int i) {
	return anIntArray12150[i];
    }
    
    public boolean method18230(int i) {
	if (anIntArray12150 == null)
	    anIntArray12150 = new int[aClass266_Sub1_12151.method4810(65280)];
	Class273_Sub2 class273_sub2
	    = (Class273_Sub2) aClass266_Sub1_12151.method4811(i, 328277922);
	anIntArray12150[i]
	    = OpenGL.glGetUniformLocation(class273_sub2.anInt10070,
					  method18225((byte) 108));
	return anIntArray12150[i] != -1;
    }
    
    final int method18823() {
	return anIntArray12150[aClass266_Sub1_12151.method4816(-1403780832)];
    }
    
    public boolean method18227(int i) {
	if (anIntArray12150 == null)
	    anIntArray12150 = new int[aClass266_Sub1_12151.method4810(65280)];
	Class273_Sub2 class273_sub2
	    = (Class273_Sub2) aClass266_Sub1_12151.method4811(i, -619369331);
	anIntArray12150[i]
	    = OpenGL.glGetUniformLocation(class273_sub2.anInt10070,
					  method18225((byte) 18));
	return anIntArray12150[i] != -1;
    }
    
    public final int method18245(int i) {
	return anIntArray12150[i];
    }
    
    final int method18824() {
	return anIntArray12150[aClass266_Sub1_12151.method4816(-1624355297)];
    }
    
    public boolean method18232(int i) {
	if (anIntArray12150 == null)
	    anIntArray12150 = new int[aClass266_Sub1_12151.method4810(65280)];
	Class273_Sub2 class273_sub2
	    = (Class273_Sub2) aClass266_Sub1_12151.method4811(i, -574973751);
	anIntArray12150[i]
	    = OpenGL.glGetUniformLocation(class273_sub2.anInt10070,
					  method18225((byte) -98));
	return anIntArray12150[i] != -1;
    }
    
    final int method18825() {
	return anIntArray12150[aClass266_Sub1_12151.method4816(-1074421612)];
    }
}
