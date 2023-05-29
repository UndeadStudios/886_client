/* Class502 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Canvas;

import jaggl.OpenGL;

public class Class502
{
    public static Class182 method8200
	(Canvas canvas, Textures class180, Interface24 interface24,
     Interface47 interface47, Interface48 interface48,
     Interface49 interface49, JS5 class458, int i) {
	Class182_Sub1_Sub2 class182_sub1_sub2;
	try {
	    Class182_Sub1.method14663();
	    EmitterConfig.method18248(-691734241).method385("jaggl",
								  -1513851153);
	    Class66.method1435(canvas, -1245379215);
	    OpenGL opengl = new OpenGL();
	    long l = opengl.init(canvas, 8, 8, 8, 24, 0, i);
	    if (l == 0L)
		throw new RuntimeException("");
	    Class182_Sub1_Sub2 class182_sub1_sub2_0_
		= new Class182_Sub1_Sub2(opengl, canvas, l, class180,
					 interface24, interface47, interface48,
					 interface49, class458, i);
	    class182_sub1_sub2_0_.method14665();
	    class182_sub1_sub2 = class182_sub1_sub2_0_;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	} catch (Throwable throwable) {
	    throw new RuntimeException("");
	}
	return class182_sub1_sub2;
    }
    
    public static Class182 method8201
	(Canvas canvas, Textures class180, Interface24 interface24,
     Interface47 interface47, Interface48 interface48,
     Interface49 interface49, JS5 class458, int i) {
	Class182_Sub1_Sub2 class182_sub1_sub2;
	try {
	    Class182_Sub1.method14663();
	    EmitterConfig.method18248(-691734241).method385("jaggl",
								  -959923493);
	    Class66.method1435(canvas, 786698840);
	    OpenGL opengl = new OpenGL();
	    long l = opengl.init(canvas, 8, 8, 8, 24, 0, i);
	    if (l == 0L)
		throw new RuntimeException("");
	    Class182_Sub1_Sub2 class182_sub1_sub2_1_
		= new Class182_Sub1_Sub2(opengl, canvas, l, class180,
					 interface24, interface47, interface48,
					 interface49, class458, i);
	    class182_sub1_sub2_1_.method14665();
	    class182_sub1_sub2 = class182_sub1_sub2_1_;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	} catch (Throwable throwable) {
	    throw new RuntimeException("");
	}
	return class182_sub1_sub2;
    }
    
    Class502() throws Throwable {
	throw new Error();
    }
}
