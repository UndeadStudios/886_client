/* Class650 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class650
{
    static Class650 aClass650_8369;
    public int anInt8370;
    public static Class650 aClass650_8371 = new Class650(0, 2, 2, 1);
    static Class650 aClass650_8372;
    static Class650 aClass650_8373;
    public static Class650 aClass650_8374;
    static Class650 aClass650_8375;
    public static Class650 aClass650_8376;
    public static Class650 aClass650_8377;
    public static Class650 aClass650_8378;
    static Class650 aClass650_8379;
    static Class650 aClass650_8380;
    static Class650 aClass650_8381;
    static Class650 aClass650_8382;
    public static Class650 aClass650_8383;
    public int anInt8384;
    public static Class650 aClass650_8385 = new Class650(1, 2, 2, 0);
    public int anInt8386;
    public int anInt8387;
    
    Class650(int i, int i_0_, int i_1_, int i_2_) {
	anInt8384 = 959610843 * i;
	anInt8370 = 1631231061 * i_0_;
	anInt8386 = 1483993213 * i_1_;
	anInt8387 = i_2_ * -1714787743;
    }
    
    static Class650[] method10709() {
	return (new Class650[]
		{ aClass650_8385, aClass650_8382, aClass650_8381,
		  aClass650_8376, aClass650_8369, aClass650_8378,
		  aClass650_8383, aClass650_8372, aClass650_8374,
		  aClass650_8371, aClass650_8377, aClass650_8375,
		  aClass650_8380, aClass650_8373, aClass650_8379 });
    }
    
    static Class650[] method10710() {
	return (new Class650[]
		{ aClass650_8385, aClass650_8382, aClass650_8381,
		  aClass650_8376, aClass650_8369, aClass650_8378,
		  aClass650_8383, aClass650_8372, aClass650_8374,
		  aClass650_8371, aClass650_8377, aClass650_8375,
		  aClass650_8380, aClass650_8373, aClass650_8379 });
    }
    
    static {
	aClass650_8375 = new Class650(2, 4, 4, 0);
	aClass650_8372 = new Class650(4, 1, 1, 1);
	aClass650_8376 = new Class650(6, 0, 4, 2);
	aClass650_8374 = new Class650(7, 0, 1, 1);
	aClass650_8369 = new Class650(8, 0, 4, 1);
	aClass650_8373 = new Class650(9, 0, 4, 1);
	aClass650_8377 = new Class650(10, 2, 2, 0);
	aClass650_8378 = new Class650(11, 0, 1, 2);
	aClass650_8379 = new Class650(12, 0, 1, 0);
	aClass650_8380 = new Class650(13, 0, 1, 0);
	aClass650_8381 = new Class650(14, 0, 4, 1);
	aClass650_8382 = new Class650(15, 0, 1, 0);
	aClass650_8383 = new Class650(16, 0, 4, 2);
    }
    
    public static Class650 method10711(int i) {
	Class650[] class650s = Class562.method9428((byte) 0);
	for (int i_3_ = 0; i_3_ < class650s.length; i_3_++) {
	    if (class650s[i_3_].anInt8384 * -490904493 == i)
		return class650s[i_3_];
	}
	return null;
    }
    
    public static Class650 method10712(int i) {
	Class650[] class650s = Class562.method9428((byte) 0);
	for (int i_4_ = 0; i_4_ < class650s.length; i_4_++) {
	    if (class650s[i_4_].anInt8384 * -490904493 == i)
		return class650s[i_4_];
	}
	return null;
    }
    
    static final void method10713(Class683 class683, byte i) {
	int i_5_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_5_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_5_ >> 16];
	Class550.method9133(class259, class245, class683, (byte) 1);
    }
    
    static void method10714(int i, int i_6_) {
	int i_7_;
	if (i == 0)
	    i_7_ = 0;
	else if (i == 1)
	    i_7_ = 1;
	else if (2 == i)
	    i_7_ = 2;
	else
	    return;
	int i_8_;
	if (2.0 == (double) Class556_Sub1.aFloat7526)
	    i_8_ = 0;
	else if (3.0 == (double) Class556_Sub1.aFloat7526)
	    i_8_ = 1;
	else if (4.0 == (double) Class556_Sub1.aFloat7526)
	    i_8_ = 2;
	else if (6.0 == (double) Class556_Sub1.aFloat7526)
	    i_8_ = 3;
	else if ((double) Class556_Sub1.aFloat7526 >= 8.0)
	    i_8_ = 4;
	else
	    return;
	Class614.aClass175_8040
	    = Class556_Sub1.aClass175ArrayArray10637[i_7_][i_8_];
	Class525_Sub19.aClass7_10572
	    = Class556_Sub1.aClass7ArrayArray10633[i_7_][i_8_];
    }
    
    public static void method10715(int i) {
	Class42 class42 = null;
	try {
	    class42
		= Class182.method3594("", client.gametype.aString8579,
				      true, 1194898388);
	    RSBuffer class525_sub38
		= Class198_Sub13.aClass525_Sub30_9973.method16501(-411979930);
	    class42.method1051(class525_sub38.buffer, 0,
			       class525_sub38.index * -1133521593,
			       870162888);
	} catch (Exception exception) {
	    /* empty */
	}
	try {
	    if (class42 != null)
		class42.method1047(-1983315632);
	} catch (Exception exception) {
	    /* empty */
	}
    }
}
