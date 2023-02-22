/* Class246 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class246
{
    public int[] anIntArray2429;
    public int anInt2430;
    public int anInt2431;
    public int[] anIntArray2432;
    public Class152 aClass152_2433;
    int anInt2434;
    
    public boolean method4485(int i, int i_0_) {
	if (i_0_ >= 0 && i_0_ < anIntArray2429.length) {
	    int i_1_ = anIntArray2429[i_0_];
	    if (i >= i_1_ && i <= i_1_ + anIntArray2432[i_0_])
		return true;
	}
	return false;
    }
    
    public boolean method4486(int i, int i_2_, byte i_3_) {
	if (i_2_ >= 0 && i_2_ < anIntArray2429.length) {
	    int i_4_ = anIntArray2429[i_2_];
	    if (i >= i_4_ && i <= i_4_ + anIntArray2432[i_2_])
		return true;
	}
	return false;
    }
    
    Class246(int i, int i_5_, int[] is, int[] is_6_, Class152 class152,
	     int i_7_) {
	anInt2431 = 1631906353 * i;
	anInt2430 = i_5_ * -854734015;
	anIntArray2432 = is;
	anIntArray2429 = is_6_;
	aClass152_2433 = class152;
	anInt2434 = -1060471627 * i_7_;
    }
    
    public boolean method4487(int i, int i_8_) {
	if (i_8_ >= 0 && i_8_ < anIntArray2429.length) {
	    int i_9_ = anIntArray2429[i_8_];
	    if (i >= i_9_ && i <= i_9_ + anIntArray2432[i_8_])
		return true;
	}
	return false;
    }
    
    static void method4488
	(int i, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_,
	 int i_15_, Class525_Sub16_Sub7 class525_sub16_sub7, Class175 class175,
	 Class7 class7, int i_16_, int i_17_, byte i_18_) {
	if (i > i_11_ && i < i_13_ + i_11_
	    && i_10_ > i_15_ - 385749773 * class7.anInt49 - 1
	    && i_10_ < i_15_ + 1921008003 * class7.anInt51)
	    i_16_ = i_17_;
	String string
	    = Class198_Sub13.method15651(class525_sub16_sub7, -2072095924);
	class175.method2844(string, 3 + i_11_, i_15_, i_16_, 0,
			    client.aRandom11303, Class413.anInt4407,
			    Class229.aClass157Array2364, null, 2014088990);
    }
    
    static void method4489(byte i) {
	if (Class108.aClass182_1306 != null) {
	    Class108.aClass182_1306.method3134(-1625059452);
	    Class108.aClass182_1306 = null;
	    Class108.aClass175_1307 = null;
	}
    }
    
    static final void method4490(Class683 class683, int i) {
	int i_19_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_19_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_19_ >> 16];
	Class656_Sub1_Sub3_Sub2.method18705(class259, class245, class683,
					    -688244379);
    }
    
    static final void method4491(Class683 class683, byte i) {
	int i_20_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_20_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_20_ >> 16];
	Class639.method10557(class259, class245, class683, -494052253);
    }
    
    static void method4492(Class182 class182, Class259 class259, int i,
			   int i_21_, int i_22_) {
	if (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705 != null) {
	    class182.method3218();
	    Class246 class246 = null;
	    Class152 class152 = null;
	    if (2010235789 * class259.anInt2590 == 5) {
		class246 = class259.method4692(class182, -2132770807);
		if (class246 == null)
		    return;
		class152 = class246.aClass152_2433;
		if ((-1694810043 * class259.anInt2602
		     != 757608145 * class246.anInt2431)
		    || (class246.anInt2430 * -2047032127
			!= class259.anInt2598 * 2054207119))
		    throw new IllegalStateException("");
	    }
	    class182.method3184(i, i_21_, i + -1694810043 * class259.anInt2602,
				class259.anInt2598 * 2054207119 + i_21_);
	    if (1806053763 * Class98.anInt1205 != 2
		&& 5 != 1806053763 * Class98.anInt1205
		&& null != Class311.aClass157_3472) {
		class182.method3181(Class98.anIntArray1193);
		class182.method3580();
		Class600 class600
		    = client.aClass507_11137.method8350(1577053234);
		int i_23_;
		int i_24_;
		int i_25_;
		int i_26_;
		if (2 == -174799205 * Class700.anInt8779) {
		    i_23_ = client.anInt11174 * -914139697;
		    i_24_ = -2064193877 * client.anInt11112;
		    i_25_ = (int) -client.aFloat11052 & 0x3fff;
		    i_26_ = 4096;
		} else {
		    Class446 class446
			= (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
			       .method10818
			   ().aClass446_4807);
		    i_23_ = (int) class446.aFloat4895;
		    i_24_ = (int) class446.aFloat4897;
		    if (5 == -174799205 * Class700.anInt8779)
			i_25_ = ((int) -((double) Class453_Sub3
						      .aClass309_Sub1_10316
						      .method5491((byte) 0)
					 * 2607.5945876176133)
				 + 223546583 * client.anInt11059) & 0x3fff;
		    else
			i_25_ = ((int) -client.aFloat11052
				 + client.anInt11059 * 223546583) & 0x3fff;
		    i_26_ = 4096 - 1121773680 * client.anInt11169;
		}
		int i_27_ = i_23_ / 128 + 48;
		int i_28_
		    = (48 + client.aClass507_11137.method8352((byte) -99) * 4
		       - i_24_ / 128);
		if (class152 != null)
		    Class311.aClass157_3472.method2491
			(((float) (-1694810043 * class259.anInt2602) / 2.0F
			  + (float) i),
			 ((float) i_21_
			  + (float) (2054207119 * class259.anInt2598) / 2.0F),
			 (float) i_27_, (float) i_28_, i_26_, i_25_ << 2,
			 class152, i, i_21_);
		else
		    Class311.aClass157_3472.method2489
			(((float) i
			  + (float) (class259.anInt2602 * -1694810043) / 2.0F),
			 ((float) (class259.anInt2598 * 2054207119) / 2.0F
			  + (float) i_21_),
			 (float) i_27_, (float) i_28_, i_26_, i_25_ << 2, 1,
			 -1, 1);
		Class529 class529
		    = client.aClass507_11137.method8345(-454509782);
		for (Class525_Sub42 class525_sub42
			 = ((Class525_Sub42)
			    Class98.aClass709_1203.method14372((short) -7545));
		     class525_sub42 != null;
		     class525_sub42
			 = ((Class525_Sub42)
			    Class98.aClass709_1203.method14353(-1874146913))) {
		    int i_29_ = class525_sub42.anInt10858 * -1344652871;
		    int i_30_
			= ((class529.anIntArray7139[i_29_] >> 14 & 0x3fff)
			   - -1227002079 * class600.anInt7858);
		    int i_31_ = ((class529.anIntArray7139[i_29_] & 0x3fff)
				 - 1429253007 * class600.anInt7860);
		    int i_32_ = 2 + i_30_ * 4 - i_23_ / 128;
		    int i_33_ = i_31_ * 4 + 2 - i_24_ / 128;
		    Class413.method6689(class182, class152, class259, i, i_21_,
					i_32_, i_33_,
					class529.anIntArray7141[i_29_],
					491212854);
		}
		for (int i_34_ = 0; i_34_ < 1748507383 * Class98.anInt1195;
		     i_34_++) {
		    int i_35_
			= 4 * Class98.anIntArray1194[i_34_] + 2 - i_23_ / 128;
		    int i_36_
			= 2 + 4 * Class98.anIntArray1197[i_34_] - i_24_ / 128;
		    ObjectDefinitions class602
			= ((ObjectDefinitions)
			   (client.aClass507_11137.method8362((byte) -1)
				.method76
			    (Class98.anIntArray1191[i_34_], -1051726891)));
		    if (class602.anIntArray7923 != null) {
			class602 = class602.method9909(Class532.aClass111_7170,
						       Class532.aClass111_7170,
						       -1585844679);
			if (class602 == null
			    || 1813512349 * class602.anInt7918 == -1)
			    continue;
		    }
		    Class413.method6689(class182, class152, class259, i, i_21_,
					i_35_, i_36_,
					class602.anInt7918 * 1813512349,
					491212854);
		}
		for (Class525_Sub23 class525_sub23
			 = ((Class525_Sub23)
			    client.aClass10_11246.method689(2038304713));
		     class525_sub23 != null;
		     class525_sub23
			 = ((Class525_Sub23)
			    client.aClass10_11246.method690((byte) 82))) {
		    int i_37_ = (int) ((class525_sub23.aLong7113
					* -5126207504388691097L) >> 28
				       & 0x3L);
		    if (i_37_ == -2051547415 * Class98.anInt1199) {
			int i_38_ = ((int) ((-5126207504388691097L
					     * class525_sub23.aLong7113)
					    & 0x3fffL)
				     - -1227002079 * class600.anInt7858);
			int i_39_ = ((int) ((class525_sub23.aLong7113
					     * -5126207504388691097L) >> 14
					    & 0x3fffL)
				     - 1429253007 * class600.anInt7860);
			int i_40_ = i_38_ * 4 + 2 - i_23_ / 128;
			int i_41_ = i_39_ * 4 + 2 - i_24_ / 128;
			Class182.method3593(class259, class152, i, i_21_,
					    i_40_, i_41_,
					    Class66.aClass157Array716[0],
					    454184129);
		    }
		}
		Class451.method7333(class182, i_23_, i_24_, class259, class152,
				    i, i_21_, 885845126);
		Class519.method8659(i_23_, i_24_, class259, class152, i, i_21_,
				    (byte) 46);
		Class686.method14008(i_23_, i_24_, class259, class246, i,
				     i_21_, -1742290392);
		if (2 != -174799205 * Class700.anInt8779) {
		    if (-1 != Class98.anInt1200 * -183945107) {
			int i_42_
			    = (2 + -735780428 * Class98.anInt1200 - i_23_ / 128
			       + (Class581
				      .aClass656_Sub1_Sub3_Sub1_Sub1_7705
				      .method18608((byte) 19)
				  - 1) * 2);
			int i_43_
			    = (2 + 450486804 * Class98.anInt1201 - i_24_ / 128
			       + (Class581
				      .aClass656_Sub1_Sub3_Sub1_Sub1_7705
				      .method18608((byte) 122)
				  - 1) * 2);
			Class322.method5728
			    (class259, class152,
			     i - Class696_Sub13.anInt10911 * -770959357,
			     i_21_ - -1844218305 * Class525_Sub31.anInt10733,
			     i_42_, i_43_,
			     (Class521.aClass157Array7093
			      [Class98.aBool1202 ? 1 : 0]),
			     100.0, Class275.aClass275_2864,
			     Class272.aClass272_2850, -1454721241);
		    }
		    if (!Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
			     .aClass627_12253.method10267((byte) 0))
			class182.method3190
			    (i + class259.anInt2602 * -1694810043 / 2 - 1,
			     i_21_ + class259.anInt2598 * 2054207119 / 2 - 1,
			     3, 3, -1, (byte) -1);
		}
		class182.method3277(Class98.anIntArray1193[0],
				    Class98.anIntArray1193[1],
				    Class98.anIntArray1193[2],
				    Class98.anIntArray1193[3]);
	    } else if (null != class152)
		class182.method3328(-16777216, class152, i, i_21_);
	}
    }
}
