/* Class406 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class406
{
    public static Class406 aClass406_4153;
    public static Class406 aClass406_4154;
    public static Class406 aClass406_4155;
    public static Class406 aClass406_4156 = new Class406(6);
    public static Class406 aClass406_4157;
    public static Class406 aClass406_4158;
    public static Class406 aClass406_4159;
    public static Class406 aClass406_4160;
    public static Class406 aClass406_4161;
    public static Class406 aClass406_4162;
    public static Class406 aClass406_4163;
    public static Class406 aClass406_4164;
    public static Class406 aClass406_4165;
    public static Class406 aClass406_4166;
    public static Class406 aClass406_4167;
    static Interface24 anInterface24_4168;
    
    public static Class406[] method6612() {
	return (new Class406[]
		{ aClass406_4156, aClass406_4154, aClass406_4158,
		  aClass406_4155, aClass406_4157, aClass406_4160,
		  aClass406_4159, aClass406_4164, aClass406_4161,
		  aClass406_4162, aClass406_4163, aClass406_4167,
		  aClass406_4165, aClass406_4166, aClass406_4153 });
    }
    
    static {
	aClass406_4154 = new Class406(7);
	aClass406_4158 = new Class406(18);
	aClass406_4155 = new Class406(5);
	aClass406_4157 = new Class406(2);
	aClass406_4160 = new Class406(8);
	aClass406_4159 = new Class406(9);
	aClass406_4164 = new Class406(7);
	aClass406_4161 = new Class406(7);
	aClass406_4162 = new Class406(5);
	aClass406_4163 = new Class406(21);
	aClass406_4167 = new Class406(10);
	aClass406_4165 = new Class406(-1);
	aClass406_4166 = new Class406(3);
	aClass406_4153 = new Class406(-1);
    }
    
    public static Class406[] method6613() {
	return (new Class406[]
		{ aClass406_4156, aClass406_4154, aClass406_4158,
		  aClass406_4155, aClass406_4157, aClass406_4160,
		  aClass406_4159, aClass406_4164, aClass406_4161,
		  aClass406_4162, aClass406_4163, aClass406_4167,
		  aClass406_4165, aClass406_4166, aClass406_4153 });
    }
    
    Class406(int i) {
	/* empty */
    }
    
    static final void method6614(Class683 class683, int i) {
	class683.anInt8662 -= 1552651121;
    }
    
    public static void method6615
	(Class656_Sub1_Sub3_Sub1_Sub1 class656_sub1_sub3_sub1_sub1, int i) {
	Class525_Sub2 class525_sub2
	    = ((Class525_Sub2)
	       (Class525_Sub2.aClass10_10412.method684
		((long) (2032864281
			 * class656_sub1_sub3_sub1_sub1.anInt11964))));
	if (class525_sub2 != null) {
	    if (null != class525_sub2.aClass488_10435) {
		class525_sub2.aClass488_10435.method7916(100, (byte) -41);
		Class40_Sub20.aClass217_11050
		    .method4026(class525_sub2.aClass488_10435, -1626387379);
		class525_sub2.aClass488_10435 = null;
	    }
	    class525_sub2.method8755(-1933461091);
	}
    }
    
    public static Class444 method6616(int i) {
	Class444 class444 = new Class444();
	class444.method7141(0.0F, 1.0F, 0.0F,
			    (float) (Math.random() * 3.141592653589793 * 2.0));
	float f = (float) (0.5 + 0.5 * Math.random()) * 256.0F;
	class444.method7147(f - 128.0F, 0.0F, 0.0F);
	class444.method7142(0.0F, 1.0F, 0.0F,
			    (float) (Math.random() * 3.141592653589793 * 2.0));
	return class444;
    }
}
