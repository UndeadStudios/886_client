/* Class610 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class610
{
    static Class610 aClass610_8009;
    int anInt8010;
    static Class610 aClass610_8011 = new Class610(0);
    static Class610 aClass610_8012;
    
    static Class610[] method10016() {
	return (new Class610[]
		{ aClass610_8012, aClass610_8011, aClass610_8009 });
    }
    
    static {
	aClass610_8009 = new Class610(1);
	aClass610_8012 = new Class610(2);
    }
    
    static Class610[] method10017() {
	return (new Class610[]
		{ aClass610_8012, aClass610_8011, aClass610_8009 });
    }
    
    Class610(int i) {
	anInt8010 = 1393808395 * i;
    }
    
    static Class610 method10018(int i) {
	Class610[] class610s = Class481.method7830((byte) 24);
	for (int i_0_ = 0; i_0_ < class610s.length; i_0_++) {
	    Class610 class610 = class610s[i_0_];
	    if (i == -539420765 * class610.anInt8010)
		return class610;
	}
	return null;
    }
    
    static void method10019(Class683 class683, int i) {
	class683.anObjectArray8636
	    [(class683.anInt8644 += 1285561025) * 1373599041 - 1]
	    = (((Class269)
		Class249.aClass47_Sub1_2445.method76((class683.anIntArray8661
						      [(class683.anInt8662
							* 501271953) - 2]),
						     1287655618))
	       .aStringArray2834
	       [class683.anIntArray8661[class683.anInt8662 * 501271953 - 1]]);
	class683.anInt8662 -= -1189665054;
    }
    
    static final void method10020(Class683 class683, int i) {
	class683.anObjectArray8637[(class683.anIntArray8647
				    [1931825055 * class683.anInt8663])]
	    = (class683.anObjectArray8636
	       [(class683.anInt8644 -= 1285561025) * 1373599041]);
    }
    
    static final void method10021(Class683 class683, byte i) {
	class683.anInt8662 -= -1189665054;
	int i_1_ = class683.anIntArray8661[501271953 * class683.anInt8662];
	int i_2_ = class683.anIntArray8661[1 + 501271953 * class683.anInt8662];
	Class40_Sub20.aClass217_11050.method4043(i_1_, i_2_, -16711936);
    }
    
    static final void method10022(Class683 class683, int i) {
	class683.anInt8662 -= -1189665054;
	int i_3_ = class683.anIntArray8661[class683.anInt8662 * 501271953];
	int i_4_ = class683.anIntArray8661[1 + 501271953 * class683.anInt8662];
	Class584.method9644(3, i_3_, i_4_, "", 1834481886);
    }
    
    public static Class7 method10023(JS5 class458, int i, int i_5_,
                                     Interface4 interface4, int i_6_) {
	byte[] is = class458.getFile(i, i_5_, 461701601);
	if (is == null)
	    return null;
	return new Class7(is, interface4);
    }
    
    public static void method10024
	(int i, int i_7_, int i_8_, int i_9_, ObjectDefinitions class602,
	 Class656_Sub1_Sub3_Sub1_Sub2 class656_sub1_sub3_sub1_sub2,
	 Class656_Sub1_Sub3_Sub1_Sub1 class656_sub1_sub3_sub1_sub1,
	 short i_10_) {
	Class525_Sub2 class525_sub2 = new Class525_Sub2();
	class525_sub2.anInt10430 = 895445199 * i;
	class525_sub2.anInt10413 = 1691817351 * (i_7_ << 9);
	class525_sub2.anInt10415 = 1746330719 * (i_8_ << 9);
	if (null != class602) {
	    class525_sub2.aClass602_10423 = class602;
	    int i_11_ = -2084474039 * class602.anInt7885;
	    int i_12_ = class602.anInt7886 * 1437840657;
	    if (i_9_ == 1 || i_9_ == 3) {
		i_11_ = class602.anInt7886 * 1437840657;
		i_12_ = class602.anInt7885 * -2084474039;
	    }
	    class525_sub2.anInt10416 = -925120407 * (i_7_ + i_11_ << 9);
	    class525_sub2.anInt10428 = (i_8_ + i_12_ << 9) * -872479259;
	    class525_sub2.anInt10434 = 615383811 * class602.anInt7866;
	    class525_sub2.anInt10421
		= (class602.anInt7927 * 1816711981 << 9) * 184638005;
	    class525_sub2.anInt10422 = class602.anInt7929 * -156115417;
	    class525_sub2.anInt10437 = class602.anInt7930 * -1868362023;
	    class525_sub2.anInt10438 = class602.anInt7908 * -944299971;
	    class525_sub2.anIntArray10426 = class602.anIntArray7868;
	    class525_sub2.anInt10433 = -1681535607 * class602.anInt7907;
	    class525_sub2.anInt10432 = class602.anInt7940 * -86710155;
	    class525_sub2.anInt10420
		= 376747929 * (class602.anInt7935 * 1553174011 << 9);
	    if (null != class602.anIntArray7923) {
		class525_sub2.aBool10414 = true;
		class525_sub2.method16073((byte) 1);
	    }
	    if (class525_sub2.anIntArray10426 != null)
		class525_sub2.anInt10440
		    = (-713609855 * class525_sub2.anInt10437
		       + (int) (Math.random()
				* (double) ((class525_sub2.anInt10438
					     * -1316809477)
					    - (class525_sub2.anInt10437
					       * -713609855)))) * -1781681283;
	    Class525_Sub2.aClass709_10429.method14345(class525_sub2, (byte) 0);
	    Class40_Sub20.aClass217_11050.method4044((class525_sub2.anInt10434
						      * -1235567057),
						     (byte) -93);
	    Class40_Sub20.aClass217_11050
		.method4039(class525_sub2.anIntArray10426, 1962169589);
	} else if (null != class656_sub1_sub3_sub1_sub2) {
	    class525_sub2.aClass656_Sub1_Sub3_Sub1_Sub2_10424
		= class656_sub1_sub3_sub1_sub2;
	    NPCDefinitions class299 = class656_sub1_sub3_sub1_sub2.aClass299_12255;
	    if (null != class299.anIntArray3323) {
		class525_sub2.aBool10414 = true;
		class299
		    = class299.method5386(Class532.aClass111_7170,
					  Class532.aClass111_7170, 2100233237);
	    }
	    if (class299 != null) {
		class525_sub2.anInt10416
		    = ((i_7_ + class299.anInt3291 * 1035256919 << 9)
		       * -925120407);
		class525_sub2.anInt10428
		    = ((i_8_ + class299.anInt3291 * 1035256919 << 9)
		       * -872479259);
		class525_sub2.anInt10434
		    = Class533.method8852(class656_sub1_sub3_sub1_sub2,
					  -1024137523) * -1655879473;
		class525_sub2.anInt10421
		    = (1340658875 * class299.anInt3333 << 9) * 184638005;
		class525_sub2.anInt10422 = -102763729 * class299.anInt3285;
		class525_sub2.anInt10433 = class299.anInt3312 * 1739679485;
		class525_sub2.anInt10432 = class299.anInt3303 * 1532165523;
		class525_sub2.anInt10420
		    = 376747929 * (-764277817 * class299.anInt3343 << 9);
		Class40_Sub20.aClass217_11050
		    .method4044(-1559975795 * class299.anInt3354, (byte) -127);
		Class40_Sub20.aClass217_11050
		    .method4044(1541231227 * class299.anInt3339, (byte) -70);
		Class40_Sub20.aClass217_11050
		    .method4044(766686113 * class299.anInt3357, (byte) -67);
		Class40_Sub20.aClass217_11050
		    .method4044(-1876270485 * class299.anInt3321, (byte) -101);
	    }
	    Class525_Sub2.aClass709_10411.method14345(class525_sub2, (byte) 0);
	} else if (class656_sub1_sub3_sub1_sub1 != null) {
	    class525_sub2.aClass656_Sub1_Sub3_Sub1_Sub1_10425
		= class656_sub1_sub3_sub1_sub1;
	    class525_sub2.anInt10416
		= (i_7_ + class656_sub1_sub3_sub1_sub1.method18608((byte) 58)
		   << 9) * -925120407;
	    class525_sub2.anInt10428
		= (i_8_ + class656_sub1_sub3_sub1_sub1.method18608((byte) 82)
		   << 9) * -872479259;
	    class525_sub2.anInt10434
		= Class713.method14459(class656_sub1_sub3_sub1_sub1,
				       -491315756) * -1655879473;
	    class525_sub2.anInt10421
		= (184638005
		   * (-1464774485 * class656_sub1_sub3_sub1_sub1.anInt12249
		      << 9));
	    class525_sub2.anInt10422
		= -505291201 * class656_sub1_sub3_sub1_sub1.anInt12250;
	    class525_sub2.anInt10433 = -404224256;
	    class525_sub2.anInt10432 = -64993024;
	    class525_sub2.anInt10420 = 0;
	    Class525_Sub2.aClass10_10412.method695
		(class525_sub2,
		 (long) (2032864281
			 * class656_sub1_sub3_sub1_sub1.anInt11964));
	    Class40_Sub20.aClass217_11050.method4044
		(-1422129767 * class656_sub1_sub3_sub1_sub1.anInt12247,
		 (byte) -126);
	    Class40_Sub20.aClass217_11050.method4044
		(2100329717 * class656_sub1_sub3_sub1_sub1.anInt12245,
		 (byte) -84);
	    Class40_Sub20.aClass217_11050.method4044
		(class656_sub1_sub3_sub1_sub1.anInt12238 * 2025647547,
		 (byte) -42);
	    Class40_Sub20.aClass217_11050.method4044
		(1428343353 * class656_sub1_sub3_sub1_sub1.anInt12248,
		 (byte) -48);
	}
    }
    
    public static void method10025(String[] strings, int[] is, byte i) {
	Class402.method6563(strings, is, 0, strings.length - 1, 1673379381);
    }
    
    public static void method10026(int i, String string, boolean bool,
				   int i_13_) {
	if (Class265.method4802(1990076041)) {
	    if (i != -1586005757 * Class70.anInt783)
		Class70.aLong746 = 4378125559561557397L;
	    Class70.anInt783 = i * 546683307;
	    Class70.aString779 = string;
	    Class70.aBool780 = bool;
	    client.aClass96_11361.method1802((short) 26716);
	    Class441.method7119(14, 2084250657);
	}
    }
}
