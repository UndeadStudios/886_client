/* Class688 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class688 implements Interface76
{
    static Class688 aClass688_8709;
    static Class688 aClass688_8710;
    public static Class688 aClass688_8711;
    public static Class688 aClass688_8712;
    public static Class688 aClass688_8713;
    static Class688 aClass688_8714;
    static Class688 aClass688_8715;
    static Class688 aClass688_8716;
    public static Class688 aClass688_8717;
    static Class688 aClass688_8718 = new Class688(-1);
    int anInt8719;
    
    public int method80() {
	return anInt8719 * -903546269;
    }
    
    Class688(int i) {
	anInt8719 = 1284593483 * i;
    }
    
    static {
	aClass688_8717 = new Class688(-2);
	aClass688_8711 = new Class688(-3);
	aClass688_8709 = new Class688(-4);
	aClass688_8713 = new Class688(-5);
	aClass688_8712 = new Class688(2);
	aClass688_8715 = new Class688(3);
	aClass688_8716 = new Class688(7);
	aClass688_8710 = new Class688(9);
	aClass688_8714 = new Class688(37);
    }
    
    public int method75() {
	return anInt8719 * -903546269;
    }
    
    public int method57() {
	return anInt8719 * -903546269;
    }
    
    public static Class688[] method14015() {
	return new Class688[] { aClass688_8710, aClass688_8714, aClass688_8715,
				aClass688_8711, aClass688_8718, aClass688_8716,
				aClass688_8709, aClass688_8712, aClass688_8717,
				aClass688_8713 };
    }
    
    static boolean method14016(int i) {
	return null != Class25.aClass43_241;
    }
    
    static void method14017(Class705 class705, int i) {
	Class251.aClass705_2452 = class705;
    }
    
    static final void method14018(int i, int i_0_, int i_1_, int i_2_,
				  int i_3_, int i_4_, int i_5_, int i_6_) {
	if (1 == client.anInt11145 * 1874190559) {
	    int i_7_ = 692634081 * Class104.anInt1284;
	    int[] is = Class104.anIntArray1285;
	    for (int i_8_ = 0; i_8_ < i_7_; i_8_++) {
		Class656_Sub1_Sub3_Sub1_Sub1 class656_sub1_sub3_sub1_sub1
		    = client.aClass656_Sub1_Sub3_Sub1_Sub1Array11384[is[i_8_]];
		if (null != class656_sub1_sub3_sub1_sub1)
		    class656_sub1_sub3_sub1_sub1.method18620(i, i_0_, i_1_,
							     i_2_, i_3_, i_4_,
							     i_5_, 730370196);
	    }
	    for (int i_9_ = 0; i_9_ < client.anInt11216 * 1111866889; i_9_++) {
		int i_10_ = client.anIntArray11125[i_9_];
		Class525_Sub19 class525_sub19
		    = ((Class525_Sub19)
		       client.aClass10_11121.method684((long) i_10_));
		if (class525_sub19 != null)
		    ((Class656_Sub1_Sub3_Sub1) class525_sub19.anObject10571)
			.method18620
			(i, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_, -602185954);
	    }
	}
    }
}
