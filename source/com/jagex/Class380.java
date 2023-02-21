/* Class380 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class380
{
    public static Class380 aClass380_3923;
    public static Class380 aClass380_3924 = new Class380();
    public static int anInt3925;
    
    Class380() {
	/* empty */
    }
    
    static {
	aClass380_3923 = new Class380();
    }
    
    static void method6392(Class683 class683, int i) {
	Class269 class269
	    = ((Class269)
	       Class249.aClass47_Sub1_2445.method76((class683.anIntArray8661
						     [((class683.anInt8662
							-= 1552651121)
						       * 501271953)]),
						    528359919));
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = (null == class269.anIntArrayArray2839 ? 0
	       : class269.anIntArrayArray2839.length);
    }
    
    static final void method6393(Class683 class683, int i) {
	class683.anInt8662 -= -826678987;
	int i_0_ = class683.anIntArray8661[501271953 * class683.anInt8662];
	int i_1_ = class683.anIntArray8661[1 + 501271953 * class683.anInt8662];
	int i_2_ = class683.anIntArray8661[class683.anInt8662 * 501271953 + 2];
	int i_3_ = class683.anIntArray8661[501271953 * class683.anInt8662 + 3];
	int i_4_ = class683.anIntArray8661[501271953 * class683.anInt8662 + 4];
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = (i_4_ - i_2_) * (i_1_ - i_0_) / (i_3_ - i_2_) + i_0_;
    }
    
    static Class525_Sub15 method6394(int i, int i_5_, int i_6_, int i_7_) {
	Class525_Sub15 class525_sub15 = null;
	if (i_6_ == 0)
	    class525_sub15
		= Class16.method767(Class412.aClass412_4277,
				    client.aClass96_11085.aClass6_1169,
				    1977859884);
	if (i_6_ == 1)
	    class525_sub15
		= Class16.method767(Class412.aClass412_4326,
				    client.aClass96_11085.aClass6_1169,
				    1977859884);
	Class600 class600 = client.aClass507_11137.method8350(1444711729);
	class525_sub15.aClass525_Sub38_Sub2_10546.method16696
	    (Class181.method3127(-512499992) ? 1 : 0, (short) -14607);
	class525_sub15.aClass525_Sub38_Sub2_10546
	    .method16602(i_5_ + class600.anInt7860 * 1429253007, 926457213);
	class525_sub15.aClass525_Sub38_Sub2_10546
	    .method16664(-1227002079 * class600.anInt7858 + i, -1168294043);
	Class98.anInt1200 = i * -1046245019;
	Class98.anInt1201 = i_5_ * -671956915;
	Class98.aBool1202 = false;
	Class73.method1541(899428791);
	return class525_sub15;
    }
}
