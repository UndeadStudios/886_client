/* Class223 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

class Class223 implements Interface43
{
    Class217 this$0;
    
    public float method323(int i) {
	return ((float) Class198_Sub13.aClass525_Sub30_9973
			    .aClass696_Sub45_10726.method17416(1059689343)
		/ 255.0F);
    }
    
    Class223(Class217 class217) {
	this$0 = class217;
    }
    
    public float method324() {
	return ((float) Class198_Sub13.aClass525_Sub30_9973
			    .aClass696_Sub45_10726.method17416(1011718580)
		/ 255.0F);
    }
    
    public static String method4241(RSBuffer class525_sub38, byte i) {
	return Class219.method4199(class525_sub38, 32767, -166110550);
    }
    
    static boolean method4242(Class182 class182, int i, int i_0_) {
	class182.method3218();
	Class251.method4508((byte) 8);
	if (!class182.method3231(-763967390))
	    return false;
	int i_1_ = client.aClass507_11137.method8412(1155997037);
	int i_2_ = client.aClass507_11137.method8352((byte) -92);
	Class475 class475 = client.aClass507_11137.method8360(1273746009);
	Class546 class546 = client.aClass507_11137.method8358((byte) 7);
	int i_3_ = i;
	if (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705 != null) {
	    int i_4_ = ((Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
			 .anIntArray12014[0])
			>> 3);
	    int i_5_ = ((Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
			 .anIntArray12017[0])
			>> 3);
	    if (i_4_ >= 0 && i_4_ < Class617.aBoolArrayArray8064.length
		&& i_5_ >= 0
		&& i_5_ < Class617.aBoolArrayArray8064[i_4_].length
		&& Class617.aBoolArrayArray8064[i_4_][i_5_])
		i_3_ = 0;
	}
	int i_6_ = i_1_ / 2;
	int i_7_ = 0;
	int i_8_ = 0;
	boolean bool = true;
	for (int i_9_ = i_7_; i_9_ < i_7_ + i_1_; i_9_++) {
	    for (int i_10_ = i_8_; i_10_ < i_2_ + i_8_; i_10_++) {
		for (int i_11_ = i_3_; i_11_ <= 3; i_11_++) {
		    if (i_11_ < i || class475.method7765(i, i_11_, i_9_, i_10_,
							 -1635545770)) {
			int i_12_ = i_11_;
			if (class475.method7774(i_9_, i_10_, 1004467151))
			    i_12_--;
			if (i_12_ >= 0)
			    bool &= Class696_Sub22.method17185(i_12_, i_9_,
							       i_10_,
							       (byte) -45);
		    }
		}
	    }
	}
	if (!bool)
	    return false;
	int i_13_ = 48 + (48 + 4 * i_1_);
	int[] is = new int[i_13_ * i_13_];
	for (int i_14_ = 0; i_14_ < is.length; i_14_++)
	    is[i_14_] = 0;
	Class168_Sub2 class168_sub2 = null;
	int i_15_ = 0;
	int i_16_ = 0;
	if (Class98.aBool1192) {
	    Class311.aClass157_3472
		= class182.method3213(i_13_, i_13_, false, true);
	    class168_sub2 = class182.method3314();
	    class168_sub2.method15585(0, Class311.aClass157_3472.method2521());
	    Interface22 interface22 = class182.method3163(i_13_, i_13_);
	    class168_sub2.method15584(interface22);
	    class182.method3158(class168_sub2, -1166817212);
	    i_6_ = i_1_;
	    i_15_ = 48;
	    i_16_ = 48;
	    class182.method3188(1, 0);
	} else
	    Class311.aClass157_3472
		= class182.method3215(is, 0, i_13_, i_13_, i_13_, (byte) 12);
	client.aClass507_11137.method8361((byte) 105).method10447(-674542031);
	int i_17_
	    = ~0xffffff | ((238 + (int) (Math.random() * 20.0) - 10 << 16)
			   + (238 + (int) (Math.random() * 20.0) - 10 << 8)
			   + (238 + (int) (Math.random() * 20.0) - 10));
	int i_18_ = ~0xffffff | 238 + (int) (Math.random() * 20.0) - 10 << 16;
	int i_19_ = ((int) (Math.random() * 8.0) << 16
		     | (int) (Math.random() * 8.0) << 8
		     | (int) (Math.random() * 8.0));
	boolean[][] bools = new boolean[i_6_ + 1 + 2][2 + (1 + i_6_)];
	class182.method3181(Class98.anIntArray1193);
	class182.method3580();
	for (int i_20_ = i_7_; i_20_ < i_1_ + i_7_; i_20_ += i_6_) {
	    for (int i_21_ = i_8_; i_21_ < i_2_ + i_8_; i_21_ += i_6_) {
		int i_22_ = i_15_;
		int i_23_ = i_16_;
		int i_24_ = i_20_;
		if (i_24_ > 0) {
		    i_24_--;
		    i_22_ += 4;
		}
		int i_25_ = i_21_;
		if (i_25_ > 0)
		    i_25_--;
		int i_26_ = i_20_ + i_6_;
		if (i_26_ < i_1_)
		    i_26_++;
		int i_27_ = i_6_ + i_21_;
		if (i_27_ < i_2_) {
		    i_27_++;
		    i_23_ += 4;
		}
		if (Class98.aBool1198)
		    class182.method3480();
		else
		    class182.method3184(0, 0, i_22_ + i_6_ * 4,
					i_6_ * 4 + i_23_);
		class182.method3188(3, -16777216);
		int i_28_ = i_6_;
		if (i_28_ > i_1_ - 1)
		    i_28_ = i_1_ - 1;
		for (int i_29_ = i_3_; i_29_ <= 3; i_29_++) {
		    for (int i_30_ = 0; i_30_ <= i_28_; i_30_++) {
			for (int i_31_ = 0; i_31_ <= i_28_; i_31_++)
			    bools[i_30_][i_31_]
				= (i_29_ < i
				   || class475.method7765(i, i_29_,
							  i_24_ + i_30_,
							  i_31_ + i_25_,
							  1262607141));
		    }
		    class546.aClass161Array7215[i_29_].method2574(i_15_, i_16_,
								  1024, i_24_,
								  i_25_, i_26_,
								  i_27_,
								  bools);
		    for (int i_32_ = -4; i_32_ < i_6_; i_32_++) {
			for (int i_33_ = -4; i_33_ < i_6_; i_33_++) {
			    int i_34_ = i_20_ + i_32_;
			    int i_35_ = i_33_ + i_21_;
			    if (i_34_ >= i_7_ && i_35_ >= i_8_
				&& (i_29_ < i
				    || class475.method7765(i, i_29_, i_34_,
							   i_35_,
							   -1672496708))) {
				int i_36_ = i_29_;
				if (class475.method7774(i_34_, i_35_,
							1314759123))
				    i_36_--;
				if (i_36_ >= 0)
				    Class684.method11237(class182, i_36_,
							 i_34_, i_35_,
							 i_32_ * 4 + i_22_,
							 ((i_6_ - i_33_) * 4
							  + i_23_ - 4),
							 i_17_, i_18_,
							 (byte) -121);
			    }
			}
		    }
		}
		class182.method3151(i_22_, i_23_, 4 * i_6_, 4 * i_6_, i_19_,
				    2);
		class182.method3218();
		if (!Class98.aBool1192) {
		    Class311.aClass157_3472.method2540(48 + 4 * (i_20_ - i_7_),
						       (4 * i_2_ + 48
							- 4 * (i_21_ - i_8_)
							- 4 * i_6_),
						       i_6_ * 4, i_6_ * 4,
						       i_22_, i_23_);
		    if (Class98.aBool1198) {
			Class311.aClass157_3472.method2518(256, 0);
			try {
			    class182.method3357(65535);
			    Class229.method4381(2000L);
			} catch (Exception exception) {
			    /* empty */
			}
		    }
		}
	    }
	}
	if (Class98.aBool1192) {
	    class182.method3159(class168_sub2, -1876999470);
	    if (Class98.aBool1198) {
		Class311.aClass157_3472.method2518(256, 0);
		try {
		    class182.method3357(65535);
		    Class229.method4381(2000L);
		} catch (Exception exception) {
		    /* empty */
		}
	    }
	}
	class182.method3480();
	class182.method3277(Class98.anIntArray1193[0],
			    Class98.anIntArray1193[1],
			    Class98.anIntArray1193[2],
			    Class98.anIntArray1193[3]);
	class182.method3188(1, 1);
	Class83.method1604(-2064406289);
	Class98.anInt1195 = 0;
	Class98.aClass709_1203.method14344(1006389163);
	if (!Class98.aBool1190) {
	    Class350_Sub2_Sub1.method18173(i, 2146532507);
	    Class529 class529 = client.aClass507_11137.method8345(-1230644897);
	    if (null != class529) {
		Class698.aClass40_Sub2_8770.method17397(1024, 64, -615092481);
		Class600 class600
		    = client.aClass507_11137.method8350(2071467159);
		for (int i_37_ = 0; i_37_ < class529.anInt7140 * -698145127;
		     i_37_++) {
		    int i_38_ = class529.anIntArray7139[i_37_];
		    if (i_38_ >> 28
			== (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
			    .aByte10867)) {
			int i_39_ = ((i_38_ >> 14 & 0x3fff)
				     - class600.anInt7858 * -1227002079);
			int i_40_ = ((i_38_ & 0x3fff)
				     - 1429253007 * class600.anInt7860);
			if (i_39_ >= 0 && i_39_ < i_1_ && i_40_ >= 0
			    && i_40_ < i_2_)
			    Class98.aClass709_1203.method14345
				(new Class525_Sub42(i_37_), (byte) 0);
			else {
			    Class287 class287
				= ((Class287)
				   (Class698.aClass40_Sub2_8770.method76
				    (class529.anIntArray7141[i_37_],
				     464602887)));
			    if (null != class287.anIntArray3175
				&& i_39_ + 1597685531 * class287.anInt3178 >= 0
				&& (class287.anInt3176 * -218323365 + i_39_
				    < i_1_)
				&& i_40_ + 443050347 * class287.anInt3179 >= 0
				&& (i_40_ + -420580167 * class287.anInt3164
				    < i_2_))
				Class98.aClass709_1203.method14345
				    (new Class525_Sub42(i_37_), (byte) 0);
			}
		    }
		}
		Class698.aClass40_Sub2_8770.method17397(128, 64, -615092481);
	    }
	}
	return true;
    }
    
    public static void method4243(Class30 class30, String string, int i,
				  Throwable throwable, byte i_41_) {
	Class390.method6471(new Class579(class30, string, i, throwable),
			    -1818824270);
    }
    
    static final int method4244(int i, byte i_42_) {
	i -= 2;
	if (i < 4)
	    return i;
	return 3;
    }
    
    static void method4245(Class525_Sub28 class525_sub28, int i) {
	Class44.aClass309_Sub1_345 = new Class309_Sub1(client.aClass28_11341);
	Class44.aClass309_Sub1_345.method5572(Class294.aClass294_3240,
					      1487537078);
	try {
	    Class350_Sub3 class350_sub3
		= ((Class350_Sub3)
		   Class44.aClass309_Sub1_345.method5552((Class289
							  .aClass289_3204),
							 false, 1196076041));
	    Class704_Sub5 class704_sub5
		= ((Class704_Sub5)
		   Class44.aClass309_Sub1_345.method5578((Class298
							  .aClass298_3275),
							 false, (byte) -12));
	    class350_sub3.method15911(class525_sub28, (byte) -21);
	    class704_sub5.method17459(new Class429(0.0F, 0.0F, 0.0F),
				      (byte) -98);
	    Class44.aClass309_Sub1_345.method5607
		(Class446.method7208(99999.0F, 99999.0F, 99999.0F),
		 (byte) -14);
	    Class44.aClass309_Sub1_345.method5560
		(Class446.method7208(Float.POSITIVE_INFINITY,
				     Float.POSITIVE_INFINITY,
				     Float.POSITIVE_INFINITY),
		 -394935966);
	    Class44.aClass309_Sub1_345.method5465
		(Class446.method7208(99999.0F, 99999.0F, 99999.0F),
		 -2135660396);
	    Class44.aClass309_Sub1_345.method5495
		(Class446.method7208(Float.POSITIVE_INFINITY,
				     Float.POSITIVE_INFINITY,
				     Float.POSITIVE_INFINITY),
		 511591371);
	} catch (Exception_Sub7 exception_sub7) {
	    /* empty */
	}
	Class44.anInt344
	    = Class509.aClass569_5662.method9498(422731051) * 1093855195;
	Class44.anInt347
	    = Class509.aClass569_5662.method9499(501271953) * 32519171;
	Class44.aBool346 = true;
    }
}
