/* Class283 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class283
{
    Class10 aClass10_3008;
    Class525_Sub5[] aClass525_Sub5Array3009;
    Interface29 anInterface29_3010;
    public static int anInt3011;
    
    public Class525_Sub5 method5199(String string) {
	long l = anInterface29_3010.method166(string, 1805403500);
	for (Class525_Sub5 class525_sub5
		 = (Class525_Sub5) aClass10_3008.method684(l);
	     null != class525_sub5;
	     class525_sub5
		 = (Class525_Sub5) aClass10_3008.method696(-2057538770)) {
	    if (class525_sub5.aString10478.equals(string))
		return class525_sub5;
	}
	return null;
    }
    
    public Class525_Sub5 method5200(int i, int i_0_) {
	if (i >= aClass525_Sub5Array3009.length)
	    return null;
	return aClass525_Sub5Array3009[i];
    }
    
    public Class525_Sub5 method5201(String string, byte i) {
	long l = anInterface29_3010.method166(string, 1389222037);
	for (Class525_Sub5 class525_sub5
		 = (Class525_Sub5) aClass10_3008.method684(l);
	     null != class525_sub5;
	     class525_sub5
		 = (Class525_Sub5) aClass10_3008.method696(-2057538770)) {
	    if (class525_sub5.aString10478.equals(string))
		return class525_sub5;
	}
	return null;
    }
    
    void method5202(int i, int i_1_) {
	Class525_Sub5 class525_sub5 = method5200(i, -1707064865);
	if (class525_sub5 != null) {
	    class525_sub5.method8755(-1933461091);
	    aClass525_Sub5Array3009[class525_sub5.anInt10477 * 2026506879]
		= null;
	}
    }
    
    public void method5203(int i, String string, Class525_Sub5 class525_sub5,
			   int i_2_) {
	Class525_Sub5 class525_sub5_3_ = method5201(string, (byte) 38);
	if (null != class525_sub5_3_
	    && i != 2026506879 * class525_sub5_3_.anInt10477)
	    throw new IllegalArgumentException(string);
	method5202(i, 808399505);
	if (i >= aClass525_Sub5Array3009.length) {
	    int i_4_;
	    for (i_4_ = aClass525_Sub5Array3009.length; i >= i_4_;
		 i_4_ += i_4_) {
		/* empty */
	    }
	    aClass10_3008 = new Class10(i_4_);
	    for (int i_5_ = 0; i_5_ < aClass525_Sub5Array3009.length; i_5_++) {
		Class525_Sub5 class525_sub5_6_ = aClass525_Sub5Array3009[i_5_];
		if (class525_sub5_6_ != null)
		    aClass10_3008.method695(class525_sub5_6_,
					    (class525_sub5_6_.aLong7113
					     * -5126207504388691097L));
	    }
	    Class525_Sub5[] class525_sub5s = new Class525_Sub5[i_4_];
	    for (int i_7_ = 0; i_7_ < aClass525_Sub5Array3009.length; i_7_++)
		class525_sub5s[i_7_] = aClass525_Sub5Array3009[i_7_];
	    aClass525_Sub5Array3009 = class525_sub5s;
	}
	class525_sub5.anInt10477 = i * -551045761;
	class525_sub5.aString10478 = string;
	aClass10_3008.method695(class525_sub5,
				anInterface29_3010.method166(string,
							     1105161062));
	aClass525_Sub5Array3009[i] = class525_sub5;
    }
    
    public Class525_Sub5 method5204(int i) {
	if (i >= aClass525_Sub5Array3009.length)
	    return null;
	return aClass525_Sub5Array3009[i];
    }
    
    public Class525_Sub5 method5205(String string) {
	long l = anInterface29_3010.method166(string, 1156594892);
	for (Class525_Sub5 class525_sub5
		 = (Class525_Sub5) aClass10_3008.method684(l);
	     null != class525_sub5;
	     class525_sub5
		 = (Class525_Sub5) aClass10_3008.method696(-2057538770)) {
	    if (class525_sub5.aString10478.equals(string))
		return class525_sub5;
	}
	return null;
    }
    
    public Class525_Sub5 method5206(String string) {
	long l = anInterface29_3010.method166(string, 1444573478);
	for (Class525_Sub5 class525_sub5
		 = (Class525_Sub5) aClass10_3008.method684(l);
	     null != class525_sub5;
	     class525_sub5
		 = (Class525_Sub5) aClass10_3008.method696(-2057538770)) {
	    if (class525_sub5.aString10478.equals(string))
		return class525_sub5;
	}
	return null;
    }
    
    void method5207(int i) {
	Class525_Sub5 class525_sub5 = method5200(i, -1869681507);
	if (class525_sub5 != null) {
	    class525_sub5.method8755(-1933461091);
	    aClass525_Sub5Array3009[class525_sub5.anInt10477 * 2026506879]
		= null;
	}
    }
    
    public void method5208(int i, String string, Class525_Sub5 class525_sub5) {
	Class525_Sub5 class525_sub5_8_ = method5201(string, (byte) 19);
	if (null != class525_sub5_8_
	    && i != 2026506879 * class525_sub5_8_.anInt10477)
	    throw new IllegalArgumentException(string);
	method5202(i, -293262747);
	if (i >= aClass525_Sub5Array3009.length) {
	    int i_9_;
	    for (i_9_ = aClass525_Sub5Array3009.length; i >= i_9_;
		 i_9_ += i_9_) {
		/* empty */
	    }
	    aClass10_3008 = new Class10(i_9_);
	    for (int i_10_ = 0; i_10_ < aClass525_Sub5Array3009.length;
		 i_10_++) {
		Class525_Sub5 class525_sub5_11_
		    = aClass525_Sub5Array3009[i_10_];
		if (class525_sub5_11_ != null)
		    aClass10_3008.method695(class525_sub5_11_,
					    (class525_sub5_11_.aLong7113
					     * -5126207504388691097L));
	    }
	    Class525_Sub5[] class525_sub5s = new Class525_Sub5[i_9_];
	    for (int i_12_ = 0; i_12_ < aClass525_Sub5Array3009.length;
		 i_12_++)
		class525_sub5s[i_12_] = aClass525_Sub5Array3009[i_12_];
	    aClass525_Sub5Array3009 = class525_sub5s;
	}
	class525_sub5.anInt10477 = i * -551045761;
	class525_sub5.aString10478 = string;
	aClass10_3008.method695(class525_sub5,
				anInterface29_3010.method166(string,
							     1703462584));
	aClass525_Sub5Array3009[i] = class525_sub5;
    }
    
    public Class525_Sub5 method5209(String string) {
	long l = anInterface29_3010.method166(string, 1006880266);
	for (Class525_Sub5 class525_sub5
		 = (Class525_Sub5) aClass10_3008.method684(l);
	     null != class525_sub5;
	     class525_sub5
		 = (Class525_Sub5) aClass10_3008.method696(-2057538770)) {
	    if (class525_sub5.aString10478.equals(string))
		return class525_sub5;
	}
	return null;
    }
    
    void method5210(int i) {
	Class525_Sub5 class525_sub5 = method5200(i, -1946925033);
	if (class525_sub5 != null) {
	    class525_sub5.method8755(-1933461091);
	    aClass525_Sub5Array3009[class525_sub5.anInt10477 * 2026506879]
		= null;
	}
    }
    
    public Class525_Sub5 method5211(int i) {
	if (i >= aClass525_Sub5Array3009.length)
	    return null;
	return aClass525_Sub5Array3009[i];
    }
    
    public void method5212(int i, String string, Class525_Sub5 class525_sub5) {
	Class525_Sub5 class525_sub5_13_ = method5201(string, (byte) 56);
	if (null != class525_sub5_13_
	    && i != 2026506879 * class525_sub5_13_.anInt10477)
	    throw new IllegalArgumentException(string);
	method5202(i, 407923098);
	if (i >= aClass525_Sub5Array3009.length) {
	    int i_14_;
	    for (i_14_ = aClass525_Sub5Array3009.length; i >= i_14_;
		 i_14_ += i_14_) {
		/* empty */
	    }
	    aClass10_3008 = new Class10(i_14_);
	    for (int i_15_ = 0; i_15_ < aClass525_Sub5Array3009.length;
		 i_15_++) {
		Class525_Sub5 class525_sub5_16_
		    = aClass525_Sub5Array3009[i_15_];
		if (class525_sub5_16_ != null)
		    aClass10_3008.method695(class525_sub5_16_,
					    (class525_sub5_16_.aLong7113
					     * -5126207504388691097L));
	    }
	    Class525_Sub5[] class525_sub5s = new Class525_Sub5[i_14_];
	    for (int i_17_ = 0; i_17_ < aClass525_Sub5Array3009.length;
		 i_17_++)
		class525_sub5s[i_17_] = aClass525_Sub5Array3009[i_17_];
	    aClass525_Sub5Array3009 = class525_sub5s;
	}
	class525_sub5.anInt10477 = i * -551045761;
	class525_sub5.aString10478 = string;
	aClass10_3008.method695(class525_sub5,
				anInterface29_3010.method166(string,
							     944679393));
	aClass525_Sub5Array3009[i] = class525_sub5;
    }
    
    public Class283(int i, Interface29 interface29) {
	int i_18_;
	for (i_18_ = 1; i_18_ < i; i_18_ += i_18_) {
	    /* empty */
	}
	aClass10_3008 = new Class10(i_18_);
	aClass525_Sub5Array3009 = new Class525_Sub5[i_18_];
	anInterface29_3010 = interface29;
    }
    
    static final void method5213(Class683 class683, byte i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = (class683.anIntArray8649
	       [class683.anIntArray8647[class683.anInt8663 * 1931825055]]);
    }
    
    static final void method5214(Class683 class683, int i) {
	int i_19_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	String string
	    = (String) (class683.anObjectArray8636
			[(class683.anInt8644 -= 1285561025) * 1373599041]);
	if (i_19_ == -1)
	    throw new RuntimeException();
	WorldTile class65
	    = ((WorldTile)
	       Class525_Sub22.aClass40_Sub15_10585.method76(i_19_, -46670804));
	if (Class495.aClass495_5387 != class65.aClass495_698)
	    throw new RuntimeException();
	int[] is = class65.method1413(string, -575712230);
	int i_20_ = 0;
	if (null != is)
	    i_20_ = is.length;
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = i_20_;
    }
    
    static final void method5215(Class683 class683, int i) {
	class683.anInt8662 -= -1189665054;
	int i_21_ = class683.anIntArray8661[class683.anInt8662 * 501271953];
	int i_22_
	    = class683.anIntArray8661[1 + 501271953 * class683.anInt8662];
	Class88 class88
	    = ((Class88)
	       client.aClass40_Sub16_11201.method76(i_22_, -1410819899));
	if (class88.method1661(933582620))
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= ((ItemDefinitions)
		   Class313_Sub2.aClass40_Sub22_10106.method76(i_21_,
							       -1355393213))
		      .method641(i_22_, class88.aString892, (byte) 13);
	else
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= (((ItemDefinitions)
		    Class313_Sub2.aClass40_Sub22_10106.method76(i_21_,
								1323030303))
		       .method629
		   (i_22_, 2053564367 * class88.anInt893, (byte) 101));
    }
    
    static void method5216(Class182 class182, int i, int i_23_, int i_24_,
			   int i_25_, byte i_26_) {
	class182.method3184(i, i_23_, i_24_ + i, i_23_ + i_25_);
	if (Class556_Sub1.anInt10625 * 294186987 < 100) {
	    int i_27_ = 20;
	    int i_28_ = i + i_24_ / 2;
	    int i_29_ = i_23_ + i_25_ / 2 - 18 - i_27_;
	    class182.method3151(i, i_23_, i_24_, i_25_, -16777216, 0);
	    class182.method3195(i_28_ - 152, i_29_, 304, 34,
				client.aColorArray11070
				    [client.anInt11217 * 155153947].getRGB(),
				0);
	    class182.method3151(i_28_ - 150, i_29_ + 2,
				Class556_Sub1.anInt10625 * 882560961, 30,
				client.aColorArray11107
				    [client.anInt11217 * 155153947].getRGB(),
				0);
	    Class29.aClass175_294.method2838
		(Class53.aClass53_478.method1169(Class21.aClass666_213,
						 1552651121),
		 i_28_, i_27_ + i_29_,
		 client.aColorArray11109[155153947 * client.anInt11217]
		     .getRGB(),
		 -1, (byte) 101);
	} else {
	    int i_30_ = (Class144_Sub1.anInt9141 * 1318111247
			 - (int) ((float) i_24_ / Class556_Sub1.aFloat7479));
	    int i_31_ = ((int) ((float) i_25_ / Class556_Sub1.aFloat7479)
			 + 1586604897 * Class696_Sub13.anInt10912);
	    int i_32_ = ((int) ((float) i_24_ / Class556_Sub1.aFloat7479)
			 + Class144_Sub1.anInt9141 * 1318111247);
	    int i_33_ = (Class696_Sub13.anInt10912 * 1586604897
			 - (int) ((float) i_25_ / Class556_Sub1.aFloat7479));
	    client.anInt11396
		= -2132355741 * (Class144_Sub1.anInt9141 * 1318111247
				 - (int) ((float) i_24_
					  / Class556_Sub1.aFloat7479));
	    Class63.anInt692
		= -1728995303 * (Class696_Sub13.anInt10912 * 1586604897
				 - (int) ((float) i_25_
					  / Class556_Sub1.aFloat7479));
	    Class463.anInt5119
		= ((int) ((float) (2 * i_24_) / Class556_Sub1.aFloat7479)
		   * -1656508497);
	    Class696_Sub5.anInt10890
		= 1523078295 * (int) ((float) (i_25_ * 2)
				      / Class556_Sub1.aFloat7479);
	    Class556_Sub1.aClass200_7496 = Class556_Sub1.aClass200_7486;
	    Class556_Sub1.method9260(i_30_ + Class556_Sub1.anInt7483,
				     Class556_Sub1.anInt7484 + i_31_,
				     i_32_ + Class556_Sub1.anInt7483,
				     i_33_ + Class556_Sub1.anInt7484, i, i_23_,
				     i_24_ + i, i_23_ + i_25_ + 1);
	    Class556_Sub1.method9261(class182, !Class556_Sub1.aBool10644,
				     !Class556_Sub1.aBool10647,
				     client.aBool11230, false);
	    Class709 class709 = Class556_Sub1.method9268(class182);
	    Class690.method14101(class182, class709, 0, 0, -727902931);
	    if (client.aBool11086) {
		int i_34_ = i + i_24_ - 5;
		int i_35_ = i_23_ + i_25_ - 8;
		Class29.aClass175_293.method2852
		    (new StringBuilder().append("Fps: ").append
			 (-300823033 * Class503.anInt5567).append
			 (" (").append
			 (1203003921 * Class503.anInt5595).append
			 (" ms)").toString(),
		     i_34_, i_35_, 16776960, -1, 2053415674);
		i_35_ -= 15;
		Runtime runtime = Runtime.getRuntime();
		int i_36_
		    = (int) ((runtime.totalMemory() - runtime.freeMemory())
			     / 1024L);
		int i_37_ = 16776960;
		if (i_36_ > 65536)
		    i_37_ = 16711680;
		Class29.aClass175_293.method2852(new StringBuilder().append
						     ("Mem:").append
						     (i_36_).append
						     ("k").toString(),
						 i_34_, i_35_, i_37_, -1,
						 1837428224);
		i_35_ -= 15;
	    }
	    Class556_Sub1.aClass200_7486.method3805(5, 2135130859);
	}
    }
    
    static void method5217(Class683 class683, int i) {
	Class269 class269
	    = ((Class269)
	       Class249.aClass47_Sub1_2445.method76((class683.anIntArray8661
						     [((class683.anInt8662
							-= 1552651121)
						       * 501271953)]),
						    -243812594));
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = (class269.anIntArray2831 == null ? 0
	       : class269.anIntArray2831.length);
    }
}
