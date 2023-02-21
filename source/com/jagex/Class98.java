/* Class98 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.IOException;

public class Class98
{
    static boolean aBool1190;
    static int[] anIntArray1191;
    static boolean aBool1192;
    static int[] anIntArray1193;
    static int[] anIntArray1194;
    static int anInt1195;
    static final double aDouble1196 = 100.0;
    static int[] anIntArray1197;
    static boolean aBool1198 = false;
    static int anInt1199;
    public static int anInt1200;
    public static int anInt1201;
    static boolean aBool1202;
    static Class709 aClass709_1203;
    static final int anInt1204 = 48;
    static int anInt1205;
    static Class458 aClass458_1206;
    
    static boolean method1822(Class182 class182, int i) {
	class182.method3218();
	Class251.method4508((byte) 8);
	if (!class182.method3231(-860548315))
	    return false;
	int i_0_ = client.aClass507_11137.method8412(1762669552);
	int i_1_ = client.aClass507_11137.method8352((byte) -47);
	Class475 class475 = client.aClass507_11137.method8360(1234938958);
	Class546 class546 = client.aClass507_11137.method8358((byte) 106);
	int i_2_ = i;
	if (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705 != null) {
	    int i_3_ = ((Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
			 .anIntArray12014[0])
			>> 3);
	    int i_4_ = ((Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
			 .anIntArray12017[0])
			>> 3);
	    if (i_3_ >= 0 && i_3_ < Class617.aBoolArrayArray8064.length
		&& i_4_ >= 0
		&& i_4_ < Class617.aBoolArrayArray8064[i_3_].length
		&& Class617.aBoolArrayArray8064[i_3_][i_4_])
		i_2_ = 0;
	}
	int i_5_ = i_0_ / 2;
	int i_6_ = 0;
	int i_7_ = 0;
	boolean bool = true;
	for (int i_8_ = i_6_; i_8_ < i_6_ + i_0_; i_8_++) {
	    for (int i_9_ = i_7_; i_9_ < i_1_ + i_7_; i_9_++) {
		for (int i_10_ = i_2_; i_10_ <= 3; i_10_++) {
		    if (i_10_ < i || class475.method7765(i, i_10_, i_8_, i_9_,
							 -266717396)) {
			int i_11_ = i_10_;
			if (class475.method7774(i_8_, i_9_, 552107225))
			    i_11_--;
			if (i_11_ >= 0)
			    bool &= Class696_Sub22.method17185(i_11_, i_8_,
							       i_9_,
							       (byte) -29);
		    }
		}
	    }
	}
	if (!bool)
	    return false;
	int i_12_ = 48 + (48 + 4 * i_0_);
	int[] is = new int[i_12_ * i_12_];
	for (int i_13_ = 0; i_13_ < is.length; i_13_++)
	    is[i_13_] = 0;
	Class168_Sub2 class168_sub2 = null;
	int i_14_ = 0;
	int i_15_ = 0;
	if (aBool1192) {
	    Class311.aClass157_3472
		= class182.method3213(i_12_, i_12_, false, true);
	    class168_sub2 = class182.method3314();
	    class168_sub2.method15585(0, Class311.aClass157_3472.method2521());
	    Interface22 interface22 = class182.method3163(i_12_, i_12_);
	    class168_sub2.method15584(interface22);
	    class182.method3158(class168_sub2, -1166817212);
	    i_5_ = i_0_;
	    i_14_ = 48;
	    i_15_ = 48;
	    class182.method3188(1, 0);
	} else
	    Class311.aClass157_3472
		= class182.method3215(is, 0, i_12_, i_12_, i_12_, (byte) 41);
	client.aClass507_11137.method8361((byte) 63).method10447(-674542031);
	int i_16_
	    = ~0xffffff | ((238 + (int) (Math.random() * 20.0) - 10 << 16)
			   + (238 + (int) (Math.random() * 20.0) - 10 << 8)
			   + (238 + (int) (Math.random() * 20.0) - 10));
	int i_17_ = ~0xffffff | 238 + (int) (Math.random() * 20.0) - 10 << 16;
	int i_18_ = ((int) (Math.random() * 8.0) << 16
		     | (int) (Math.random() * 8.0) << 8
		     | (int) (Math.random() * 8.0));
	boolean[][] bools = new boolean[i_5_ + 1 + 2][2 + (1 + i_5_)];
	class182.method3181(anIntArray1193);
	class182.method3580();
	for (int i_19_ = i_6_; i_19_ < i_0_ + i_6_; i_19_ += i_5_) {
	    for (int i_20_ = i_7_; i_20_ < i_1_ + i_7_; i_20_ += i_5_) {
		int i_21_ = i_14_;
		int i_22_ = i_15_;
		int i_23_ = i_19_;
		if (i_23_ > 0) {
		    i_23_--;
		    i_21_ += 4;
		}
		int i_24_ = i_20_;
		if (i_24_ > 0)
		    i_24_--;
		int i_25_ = i_19_ + i_5_;
		if (i_25_ < i_0_)
		    i_25_++;
		int i_26_ = i_5_ + i_20_;
		if (i_26_ < i_1_) {
		    i_26_++;
		    i_22_ += 4;
		}
		if (aBool1198)
		    class182.method3480();
		else
		    class182.method3184(0, 0, i_21_ + i_5_ * 4,
					i_5_ * 4 + i_22_);
		class182.method3188(3, -16777216);
		int i_27_ = i_5_;
		if (i_27_ > i_0_ - 1)
		    i_27_ = i_0_ - 1;
		for (int i_28_ = i_2_; i_28_ <= 3; i_28_++) {
		    for (int i_29_ = 0; i_29_ <= i_27_; i_29_++) {
			for (int i_30_ = 0; i_30_ <= i_27_; i_30_++)
			    bools[i_29_][i_30_]
				= (i_28_ < i
				   || class475.method7765(i, i_28_,
							  i_23_ + i_29_,
							  i_30_ + i_24_,
							  1429511594));
		    }
		    class546.aClass161Array7215[i_28_].method2574(i_14_, i_15_,
								  1024, i_23_,
								  i_24_, i_25_,
								  i_26_,
								  bools);
		    for (int i_31_ = -4; i_31_ < i_5_; i_31_++) {
			for (int i_32_ = -4; i_32_ < i_5_; i_32_++) {
			    int i_33_ = i_19_ + i_31_;
			    int i_34_ = i_32_ + i_20_;
			    if (i_33_ >= i_6_ && i_34_ >= i_7_
				&& (i_28_ < i
				    || class475.method7765(i, i_28_, i_33_,
							   i_34_, 33907319))) {
				int i_35_ = i_28_;
				if (class475.method7774(i_33_, i_34_,
							1166502509))
				    i_35_--;
				if (i_35_ >= 0)
				    Class684.method11237(class182, i_35_,
							 i_33_, i_34_,
							 i_31_ * 4 + i_21_,
							 ((i_5_ - i_32_) * 4
							  + i_22_ - 4),
							 i_16_, i_17_,
							 (byte) -41);
			    }
			}
		    }
		}
		class182.method3151(i_21_, i_22_, 4 * i_5_, 4 * i_5_, i_18_,
				    2);
		class182.method3218();
		if (!aBool1192) {
		    Class311.aClass157_3472.method2540(48 + 4 * (i_19_ - i_6_),
						       (4 * i_1_ + 48
							- 4 * (i_20_ - i_7_)
							- 4 * i_5_),
						       i_5_ * 4, i_5_ * 4,
						       i_21_, i_22_);
		    if (aBool1198) {
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
	if (aBool1192) {
	    class182.method3159(class168_sub2, -1876999470);
	    if (aBool1198) {
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
	class182.method3277(anIntArray1193[0], anIntArray1193[1],
			    anIntArray1193[2], anIntArray1193[3]);
	class182.method3188(1, 1);
	Class83.method1604(-2032167419);
	anInt1195 = 0;
	aClass709_1203.method14344(190638114);
	if (!aBool1190) {
	    Class350_Sub2_Sub1.method18173(i, 1828245696);
	    Class529 class529 = client.aClass507_11137.method8345(-1972012930);
	    if (null != class529) {
		Class698.aClass40_Sub2_8770.method17397(1024, 64, -615092481);
		Class600 class600
		    = client.aClass507_11137.method8350(1802281734);
		for (int i_36_ = 0; i_36_ < class529.anInt7140 * -698145127;
		     i_36_++) {
		    int i_37_ = class529.anIntArray7139[i_36_];
		    if (i_37_ >> 28
			== (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
			    .aByte10867)) {
			int i_38_ = ((i_37_ >> 14 & 0x3fff)
				     - class600.anInt7858 * -1227002079);
			int i_39_ = ((i_37_ & 0x3fff)
				     - 1429253007 * class600.anInt7860);
			if (i_38_ >= 0 && i_38_ < i_0_ && i_39_ >= 0
			    && i_39_ < i_1_)
			    aClass709_1203.method14345
				(new Class525_Sub42(i_36_), (byte) 0);
			else {
			    Class287 class287
				= ((Class287)
				   (Class698.aClass40_Sub2_8770.method76
				    (class529.anIntArray7141[i_36_],
				     1631113817)));
			    if (null != class287.anIntArray3175
				&& i_38_ + 1597685531 * class287.anInt3178 >= 0
				&& (class287.anInt3176 * -218323365 + i_38_
				    < i_0_)
				&& i_39_ + 443050347 * class287.anInt3179 >= 0
				&& (i_39_ + -420580167 * class287.anInt3164
				    < i_1_))
				aClass709_1203.method14345
				    (new Class525_Sub42(i_36_), (byte) 0);
			}
		    }
		}
		Class698.aClass40_Sub2_8770.method17397(128, 64, -615092481);
	    }
	}
	return true;
    }
    
    static {
	aBool1192 = false;
	anIntArray1193 = new int[4];
	anInt1199 = -975231321;
	anInt1195 = 0;
	anIntArray1194 = new int[1001];
	anIntArray1197 = new int[1011];
	anIntArray1191 = new int[1004];
	aClass709_1203 = new Class709();
	anInt1200 = 1046245019;
	anInt1201 = 671956915;
	aBool1202 = true;
	aBool1190 = false;
	anInt1205 = 0;
    }
    
    static void method1823() {
	anInt1205 = 0;
	anInt1200 = 1046245019;
	anInt1201 = 671956915;
    }
    
    static void method1824() {
	anInt1205 = 0;
	anInt1199 = -975231321;
	anInt1200 = 1046245019;
	anInt1201 = 671956915;
    }
    
    static void method1825() {
	anInt1205 = 0;
	anInt1200 = 1046245019;
	anInt1201 = 671956915;
    }
    
    public static void method1826() {
	anInt1199 = -975231321;
    }
    
    static void method1827() {
	anInt1205 = 0;
	anInt1199 = -975231321;
	anInt1200 = 1046245019;
	anInt1201 = 671956915;
    }
    
    public static void method1828() {
	Class311.aClass157_3472 = null;
	anInt1199 = -975231321;
    }
    
    public static void method1829() {
	Class311.aClass157_3472 = null;
	anInt1199 = -975231321;
    }
    
    public static void method1830() {
	Class311.aClass157_3472 = null;
	anInt1199 = -975231321;
    }
    
    public static void method1831() {
	anInt1199 = -975231321;
    }
    
    static void method1832(Class182 class182, Class259 class259, int i,
			   int i_40_) {
	if (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705 != null) {
	    class182.method3218();
	    Class246 class246 = null;
	    Class152 class152 = null;
	    if (2010235789 * class259.anInt2590 == 5) {
		class246 = class259.method4692(class182, -1924679640);
		if (class246 == null)
		    return;
		class152 = class246.aClass152_2433;
		if ((-1694810043 * class259.anInt2602
		     != 757608145 * class246.anInt2431)
		    || (class246.anInt2430 * -2047032127
			!= class259.anInt2598 * 2054207119))
		    throw new IllegalStateException("");
	    }
	    class182.method3184(i, i_40_, i + -1694810043 * class259.anInt2602,
				class259.anInt2598 * 2054207119 + i_40_);
	    if (1806053763 * anInt1205 != 2 && 5 != 1806053763 * anInt1205
		&& null != Class311.aClass157_3472) {
		class182.method3181(anIntArray1193);
		class182.method3580();
		Class600 class600
		    = client.aClass507_11137.method8350(1509283916);
		int i_41_;
		int i_42_;
		int i_43_;
		int i_44_;
		if (2 == -174799205 * Class700.anInt8779) {
		    i_41_ = client.anInt11174 * -914139697;
		    i_42_ = -2064193877 * client.anInt11112;
		    i_43_ = (int) -client.aFloat11052 & 0x3fff;
		    i_44_ = 4096;
		} else {
		    Class446 class446
			= (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
			       .method10818
			   ().aClass446_4807);
		    i_41_ = (int) class446.aFloat4895;
		    i_42_ = (int) class446.aFloat4897;
		    if (5 == -174799205 * Class700.anInt8779)
			i_43_ = ((int) -((double) Class453_Sub3
						      .aClass309_Sub1_10316
						      .method5491((byte) 0)
					 * 2607.5945876176133)
				 + 223546583 * client.anInt11059) & 0x3fff;
		    else
			i_43_ = ((int) -client.aFloat11052
				 + client.anInt11059 * 223546583) & 0x3fff;
		    i_44_ = 4096 - 1121773680 * client.anInt11169;
		}
		int i_45_ = i_41_ / 128 + 48;
		int i_46_
		    = (48 + client.aClass507_11137.method8352((byte) -40) * 4
		       - i_42_ / 128);
		if (class152 != null)
		    Class311.aClass157_3472.method2491
			(((float) (-1694810043 * class259.anInt2602) / 2.0F
			  + (float) i),
			 ((float) i_40_
			  + (float) (2054207119 * class259.anInt2598) / 2.0F),
			 (float) i_45_, (float) i_46_, i_44_, i_43_ << 2,
			 class152, i, i_40_);
		else
		    Class311.aClass157_3472.method2489
			(((float) i
			  + (float) (class259.anInt2602 * -1694810043) / 2.0F),
			 ((float) (class259.anInt2598 * 2054207119) / 2.0F
			  + (float) i_40_),
			 (float) i_45_, (float) i_46_, i_44_, i_43_ << 2, 1,
			 -1, 1);
		Class529 class529
		    = client.aClass507_11137.method8345(2013044091);
		for (Class525_Sub42 class525_sub42
			 = ((Class525_Sub42)
			    aClass709_1203.method14372((short) -14102));
		     class525_sub42 != null;
		     class525_sub42
			 = ((Class525_Sub42)
			    aClass709_1203.method14353(-1565464978))) {
		    int i_47_ = class525_sub42.anInt10858 * -1344652871;
		    int i_48_
			= ((class529.anIntArray7139[i_47_] >> 14 & 0x3fff)
			   - -1227002079 * class600.anInt7858);
		    int i_49_ = ((class529.anIntArray7139[i_47_] & 0x3fff)
				 - 1429253007 * class600.anInt7860);
		    int i_50_ = 2 + i_48_ * 4 - i_41_ / 128;
		    int i_51_ = i_49_ * 4 + 2 - i_42_ / 128;
		    Class413.method6689(class182, class152, class259, i, i_40_,
					i_50_, i_51_,
					class529.anIntArray7141[i_47_],
					491212854);
		}
		for (int i_52_ = 0; i_52_ < 1748507383 * anInt1195; i_52_++) {
		    int i_53_ = 4 * anIntArray1194[i_52_] + 2 - i_41_ / 128;
		    int i_54_ = 2 + 4 * anIntArray1197[i_52_] - i_42_ / 128;
		    Class602 class602
			= ((Class602)
			   client.aClass507_11137.method8362((byte) -1)
			       .method76(anIntArray1191[i_52_], 777778195));
		    if (class602.anIntArray7923 != null) {
			class602 = class602.method9909(Class532.aClass111_7170,
						       Class532.aClass111_7170,
						       -1798895509);
			if (class602 == null
			    || 1813512349 * class602.anInt7918 == -1)
			    continue;
		    }
		    Class413.method6689(class182, class152, class259, i, i_40_,
					i_53_, i_54_,
					class602.anInt7918 * 1813512349,
					491212854);
		}
		for (Class525_Sub23 class525_sub23
			 = ((Class525_Sub23)
			    client.aClass10_11246.method689(272704464));
		     class525_sub23 != null;
		     class525_sub23
			 = ((Class525_Sub23)
			    client.aClass10_11246.method690((byte) 83))) {
		    int i_55_ = (int) ((class525_sub23.aLong7113
					* -5126207504388691097L) >> 28
				       & 0x3L);
		    if (i_55_ == -2051547415 * anInt1199) {
			int i_56_ = ((int) ((-5126207504388691097L
					     * class525_sub23.aLong7113)
					    & 0x3fffL)
				     - -1227002079 * class600.anInt7858);
			int i_57_ = ((int) ((class525_sub23.aLong7113
					     * -5126207504388691097L) >> 14
					    & 0x3fffL)
				     - 1429253007 * class600.anInt7860);
			int i_58_ = i_56_ * 4 + 2 - i_41_ / 128;
			int i_59_ = i_57_ * 4 + 2 - i_42_ / 128;
			Class182.method3593(class259, class152, i, i_40_,
					    i_58_, i_59_,
					    Class66.aClass157Array716[0],
					    -646118774);
		    }
		}
		Class451.method7333(class182, i_41_, i_42_, class259, class152,
				    i, i_40_, 2123245534);
		Class519.method8659(i_41_, i_42_, class259, class152, i, i_40_,
				    (byte) 43);
		Class686.method14008(i_41_, i_42_, class259, class246, i,
				     i_40_, 970958708);
		if (2 != -174799205 * Class700.anInt8779) {
		    if (-1 != anInt1200 * -183945107) {
			int i_60_
			    = (2 + -735780428 * anInt1200 - i_41_ / 128
			       + (Class581
				      .aClass656_Sub1_Sub3_Sub1_Sub1_7705
				      .method18608((byte) 82)
				  - 1) * 2);
			int i_61_
			    = (2 + 450486804 * anInt1201 - i_42_ / 128
			       + (Class581
				      .aClass656_Sub1_Sub3_Sub1_Sub1_7705
				      .method18608((byte) 83)
				  - 1) * 2);
			Class322.method5728
			    (class259, class152,
			     i - Class696_Sub13.anInt10911 * -770959357,
			     i_40_ - -1844218305 * Class525_Sub31.anInt10733,
			     i_60_, i_61_,
			     Class521.aClass157Array7093[aBool1202 ? 1 : 0],
			     100.0, Class275.aClass275_2864,
			     Class272.aClass272_2850, -1110918668);
		    }
		    if (!Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
			     .aClass627_12253.method10267((byte) 0))
			class182.method3190
			    (i + class259.anInt2602 * -1694810043 / 2 - 1,
			     i_40_ + class259.anInt2598 * 2054207119 / 2 - 1,
			     3, 3, -1, (byte) -1);
		}
		class182.method3277(anIntArray1193[0], anIntArray1193[1],
				    anIntArray1193[2], anIntArray1193[3]);
	    } else if (null != class152)
		class182.method3328(-16777216, class152, i, i_40_);
	}
    }
    
    public static void method1833() {
	anInt1199 = -975231321;
    }
    
    static void method1834(Class182 class182) {
	if ((Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705.aByte10867
	     != anInt1199 * -2051547415)
	    && client.aClass507_11137.method8358((byte) 15) != null) {
	    Class251.method4508((byte) 8);
	    if (Class223.method4242(class182,
				    (Class581
				     .aClass656_Sub1_Sub3_Sub1_Sub1_7705
				     .aByte10867),
				    1667183064))
		anInt1199
		    = 975231321 * (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
				   .aByte10867);
	}
    }
    
    static void method1835(Class182 class182) {
	if ((Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705.aByte10867
	     != anInt1199 * -2051547415)
	    && client.aClass507_11137.method8358((byte) 34) != null) {
	    Class251.method4508((byte) 8);
	    if (Class223.method4242(class182,
				    (Class581
				     .aClass656_Sub1_Sub3_Sub1_Sub1_7705
				     .aByte10867),
				    1494928380))
		anInt1199
		    = 975231321 * (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
				   .aByte10867);
	}
    }
    
    static void method1836(int i, int i_62_, boolean bool) {
	Class617.aBoolArrayArray8064[i][i_62_] = bool;
    }
    
    static boolean method1837(Class182 class182, int i) {
	class182.method3218();
	Class251.method4508((byte) 8);
	if (!class182.method3231(-596742672))
	    return false;
	int i_63_ = client.aClass507_11137.method8412(48241647);
	int i_64_ = client.aClass507_11137.method8352((byte) -31);
	Class475 class475 = client.aClass507_11137.method8360(1659755073);
	Class546 class546 = client.aClass507_11137.method8358((byte) 28);
	int i_65_ = i;
	if (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705 != null) {
	    int i_66_ = ((Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
			  .anIntArray12014[0])
			 >> 3);
	    int i_67_ = ((Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
			  .anIntArray12017[0])
			 >> 3);
	    if (i_66_ >= 0 && i_66_ < Class617.aBoolArrayArray8064.length
		&& i_67_ >= 0
		&& i_67_ < Class617.aBoolArrayArray8064[i_66_].length
		&& Class617.aBoolArrayArray8064[i_66_][i_67_])
		i_65_ = 0;
	}
	int i_68_ = i_63_ / 2;
	int i_69_ = 0;
	int i_70_ = 0;
	boolean bool = true;
	for (int i_71_ = i_69_; i_71_ < i_69_ + i_63_; i_71_++) {
	    for (int i_72_ = i_70_; i_72_ < i_64_ + i_70_; i_72_++) {
		for (int i_73_ = i_65_; i_73_ <= 3; i_73_++) {
		    if (i_73_ < i || class475.method7765(i, i_73_, i_71_,
							 i_72_, 1226965400)) {
			int i_74_ = i_73_;
			if (class475.method7774(i_71_, i_72_, 571064059))
			    i_74_--;
			if (i_74_ >= 0)
			    bool &= Class696_Sub22.method17185(i_74_, i_71_,
							       i_72_,
							       (byte) -9);
		    }
		}
	    }
	}
	if (!bool)
	    return false;
	int i_75_ = 48 + (48 + 4 * i_63_);
	int[] is = new int[i_75_ * i_75_];
	for (int i_76_ = 0; i_76_ < is.length; i_76_++)
	    is[i_76_] = 0;
	Class168_Sub2 class168_sub2 = null;
	int i_77_ = 0;
	int i_78_ = 0;
	if (aBool1192) {
	    Class311.aClass157_3472
		= class182.method3213(i_75_, i_75_, false, true);
	    class168_sub2 = class182.method3314();
	    class168_sub2.method15585(0, Class311.aClass157_3472.method2521());
	    Interface22 interface22 = class182.method3163(i_75_, i_75_);
	    class168_sub2.method15584(interface22);
	    class182.method3158(class168_sub2, -1166817212);
	    i_68_ = i_63_;
	    i_77_ = 48;
	    i_78_ = 48;
	    class182.method3188(1, 0);
	} else
	    Class311.aClass157_3472
		= class182.method3215(is, 0, i_75_, i_75_, i_75_, (byte) 23);
	client.aClass507_11137.method8361((byte) 81).method10447(-674542031);
	int i_79_
	    = ~0xffffff | ((238 + (int) (Math.random() * 20.0) - 10 << 16)
			   + (238 + (int) (Math.random() * 20.0) - 10 << 8)
			   + (238 + (int) (Math.random() * 20.0) - 10));
	int i_80_ = ~0xffffff | 238 + (int) (Math.random() * 20.0) - 10 << 16;
	int i_81_ = ((int) (Math.random() * 8.0) << 16
		     | (int) (Math.random() * 8.0) << 8
		     | (int) (Math.random() * 8.0));
	boolean[][] bools = new boolean[i_68_ + 1 + 2][2 + (1 + i_68_)];
	class182.method3181(anIntArray1193);
	class182.method3580();
	for (int i_82_ = i_69_; i_82_ < i_63_ + i_69_; i_82_ += i_68_) {
	    for (int i_83_ = i_70_; i_83_ < i_64_ + i_70_; i_83_ += i_68_) {
		int i_84_ = i_77_;
		int i_85_ = i_78_;
		int i_86_ = i_82_;
		if (i_86_ > 0) {
		    i_86_--;
		    i_84_ += 4;
		}
		int i_87_ = i_83_;
		if (i_87_ > 0)
		    i_87_--;
		int i_88_ = i_82_ + i_68_;
		if (i_88_ < i_63_)
		    i_88_++;
		int i_89_ = i_68_ + i_83_;
		if (i_89_ < i_64_) {
		    i_89_++;
		    i_85_ += 4;
		}
		if (aBool1198)
		    class182.method3480();
		else
		    class182.method3184(0, 0, i_84_ + i_68_ * 4,
					i_68_ * 4 + i_85_);
		class182.method3188(3, -16777216);
		int i_90_ = i_68_;
		if (i_90_ > i_63_ - 1)
		    i_90_ = i_63_ - 1;
		for (int i_91_ = i_65_; i_91_ <= 3; i_91_++) {
		    for (int i_92_ = 0; i_92_ <= i_90_; i_92_++) {
			for (int i_93_ = 0; i_93_ <= i_90_; i_93_++)
			    bools[i_92_][i_93_]
				= (i_91_ < i
				   || class475.method7765(i, i_91_,
							  i_86_ + i_92_,
							  i_93_ + i_87_,
							  675807121));
		    }
		    class546.aClass161Array7215[i_91_].method2574(i_77_, i_78_,
								  1024, i_86_,
								  i_87_, i_88_,
								  i_89_,
								  bools);
		    for (int i_94_ = -4; i_94_ < i_68_; i_94_++) {
			for (int i_95_ = -4; i_95_ < i_68_; i_95_++) {
			    int i_96_ = i_82_ + i_94_;
			    int i_97_ = i_95_ + i_83_;
			    if (i_96_ >= i_69_ && i_97_ >= i_70_
				&& (i_91_ < i
				    || class475.method7765(i, i_91_, i_96_,
							   i_97_,
							   -1200086913))) {
				int i_98_ = i_91_;
				if (class475.method7774(i_96_, i_97_,
							412608364))
				    i_98_--;
				if (i_98_ >= 0)
				    Class684.method11237(class182, i_98_,
							 i_96_, i_97_,
							 i_94_ * 4 + i_84_,
							 ((i_68_ - i_95_) * 4
							  + i_85_ - 4),
							 i_79_, i_80_,
							 (byte) -42);
			    }
			}
		    }
		}
		class182.method3151(i_84_, i_85_, 4 * i_68_, 4 * i_68_, i_81_,
				    2);
		class182.method3218();
		if (!aBool1192) {
		    Class311.aClass157_3472.method2540(48 + 4 * (i_82_
								 - i_69_),
						       (4 * i_64_ + 48
							- 4 * (i_83_ - i_70_)
							- 4 * i_68_),
						       i_68_ * 4, i_68_ * 4,
						       i_84_, i_85_);
		    if (aBool1198) {
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
	if (aBool1192) {
	    class182.method3159(class168_sub2, -1876999470);
	    if (aBool1198) {
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
	class182.method3277(anIntArray1193[0], anIntArray1193[1],
			    anIntArray1193[2], anIntArray1193[3]);
	class182.method3188(1, 1);
	Class83.method1604(-2143376283);
	anInt1195 = 0;
	aClass709_1203.method14344(-1522409391);
	if (!aBool1190) {
	    Class350_Sub2_Sub1.method18173(i, 1464167581);
	    Class529 class529 = client.aClass507_11137.method8345(-128548832);
	    if (null != class529) {
		Class698.aClass40_Sub2_8770.method17397(1024, 64, -615092481);
		Class600 class600
		    = client.aClass507_11137.method8350(462510665);
		for (int i_99_ = 0; i_99_ < class529.anInt7140 * -698145127;
		     i_99_++) {
		    int i_100_ = class529.anIntArray7139[i_99_];
		    if (i_100_ >> 28
			== (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
			    .aByte10867)) {
			int i_101_ = ((i_100_ >> 14 & 0x3fff)
				      - class600.anInt7858 * -1227002079);
			int i_102_ = ((i_100_ & 0x3fff)
				      - 1429253007 * class600.anInt7860);
			if (i_101_ >= 0 && i_101_ < i_63_ && i_102_ >= 0
			    && i_102_ < i_64_)
			    aClass709_1203.method14345
				(new Class525_Sub42(i_99_), (byte) 0);
			else {
			    Class287 class287
				= ((Class287)
				   (Class698.aClass40_Sub2_8770.method76
				    (class529.anIntArray7141[i_99_],
				     -172301489)));
			    if (null != class287.anIntArray3175
				&& (i_101_ + 1597685531 * class287.anInt3178
				    >= 0)
				&& (class287.anInt3176 * -218323365 + i_101_
				    < i_63_)
				&& i_102_ + 443050347 * class287.anInt3179 >= 0
				&& (i_102_ + -420580167 * class287.anInt3164
				    < i_64_))
				aClass709_1203.method14345
				    (new Class525_Sub42(i_99_), (byte) 0);
			}
		    }
		}
		Class698.aClass40_Sub2_8770.method17397(128, 64, -615092481);
	    }
	}
	return true;
    }
    
    static boolean method1838(Class182 class182, int i) {
	class182.method3218();
	Class251.method4508((byte) 8);
	if (!class182.method3231(-1627407157))
	    return false;
	int i_103_ = client.aClass507_11137.method8412(567952880);
	int i_104_ = client.aClass507_11137.method8352((byte) -45);
	Class475 class475 = client.aClass507_11137.method8360(1629977249);
	Class546 class546 = client.aClass507_11137.method8358((byte) 52);
	int i_105_ = i;
	if (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705 != null) {
	    int i_106_ = ((Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
			   .anIntArray12014[0])
			  >> 3);
	    int i_107_ = ((Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
			   .anIntArray12017[0])
			  >> 3);
	    if (i_106_ >= 0 && i_106_ < Class617.aBoolArrayArray8064.length
		&& i_107_ >= 0
		&& i_107_ < Class617.aBoolArrayArray8064[i_106_].length
		&& Class617.aBoolArrayArray8064[i_106_][i_107_])
		i_105_ = 0;
	}
	int i_108_ = i_103_ / 2;
	int i_109_ = 0;
	int i_110_ = 0;
	boolean bool = true;
	for (int i_111_ = i_109_; i_111_ < i_109_ + i_103_; i_111_++) {
	    for (int i_112_ = i_110_; i_112_ < i_104_ + i_110_; i_112_++) {
		for (int i_113_ = i_105_; i_113_ <= 3; i_113_++) {
		    if (i_113_ < i
			|| class475.method7765(i, i_113_, i_111_, i_112_,
					       -755011407)) {
			int i_114_ = i_113_;
			if (class475.method7774(i_111_, i_112_, 679599487))
			    i_114_--;
			if (i_114_ >= 0)
			    bool &= Class696_Sub22.method17185(i_114_, i_111_,
							       i_112_,
							       (byte) -123);
		    }
		}
	    }
	}
	if (!bool)
	    return false;
	int i_115_ = 48 + (48 + 4 * i_103_);
	int[] is = new int[i_115_ * i_115_];
	for (int i_116_ = 0; i_116_ < is.length; i_116_++)
	    is[i_116_] = 0;
	Class168_Sub2 class168_sub2 = null;
	int i_117_ = 0;
	int i_118_ = 0;
	if (aBool1192) {
	    Class311.aClass157_3472
		= class182.method3213(i_115_, i_115_, false, true);
	    class168_sub2 = class182.method3314();
	    class168_sub2.method15585(0, Class311.aClass157_3472.method2521());
	    Interface22 interface22 = class182.method3163(i_115_, i_115_);
	    class168_sub2.method15584(interface22);
	    class182.method3158(class168_sub2, -1166817212);
	    i_108_ = i_103_;
	    i_117_ = 48;
	    i_118_ = 48;
	    class182.method3188(1, 0);
	} else
	    Class311.aClass157_3472
		= class182.method3215(is, 0, i_115_, i_115_, i_115_,
				      (byte) 29);
	client.aClass507_11137.method8361((byte) 87).method10447(-674542031);
	int i_119_
	    = ~0xffffff | ((238 + (int) (Math.random() * 20.0) - 10 << 16)
			   + (238 + (int) (Math.random() * 20.0) - 10 << 8)
			   + (238 + (int) (Math.random() * 20.0) - 10));
	int i_120_ = ~0xffffff | 238 + (int) (Math.random() * 20.0) - 10 << 16;
	int i_121_ = ((int) (Math.random() * 8.0) << 16
		      | (int) (Math.random() * 8.0) << 8
		      | (int) (Math.random() * 8.0));
	boolean[][] bools = new boolean[i_108_ + 1 + 2][2 + (1 + i_108_)];
	class182.method3181(anIntArray1193);
	class182.method3580();
	for (int i_122_ = i_109_; i_122_ < i_103_ + i_109_; i_122_ += i_108_) {
	    for (int i_123_ = i_110_; i_123_ < i_104_ + i_110_;
		 i_123_ += i_108_) {
		int i_124_ = i_117_;
		int i_125_ = i_118_;
		int i_126_ = i_122_;
		if (i_126_ > 0) {
		    i_126_--;
		    i_124_ += 4;
		}
		int i_127_ = i_123_;
		if (i_127_ > 0)
		    i_127_--;
		int i_128_ = i_122_ + i_108_;
		if (i_128_ < i_103_)
		    i_128_++;
		int i_129_ = i_108_ + i_123_;
		if (i_129_ < i_104_) {
		    i_129_++;
		    i_125_ += 4;
		}
		if (aBool1198)
		    class182.method3480();
		else
		    class182.method3184(0, 0, i_124_ + i_108_ * 4,
					i_108_ * 4 + i_125_);
		class182.method3188(3, -16777216);
		int i_130_ = i_108_;
		if (i_130_ > i_103_ - 1)
		    i_130_ = i_103_ - 1;
		for (int i_131_ = i_105_; i_131_ <= 3; i_131_++) {
		    for (int i_132_ = 0; i_132_ <= i_130_; i_132_++) {
			for (int i_133_ = 0; i_133_ <= i_130_; i_133_++)
			    bools[i_132_][i_133_]
				= (i_131_ < i
				   || class475.method7765(i, i_131_,
							  i_126_ + i_132_,
							  i_133_ + i_127_,
							  -199117813));
		    }
		    class546.aClass161Array7215[i_131_].method2574
			(i_117_, i_118_, 1024, i_126_, i_127_, i_128_, i_129_,
			 bools);
		    for (int i_134_ = -4; i_134_ < i_108_; i_134_++) {
			for (int i_135_ = -4; i_135_ < i_108_; i_135_++) {
			    int i_136_ = i_122_ + i_134_;
			    int i_137_ = i_135_ + i_123_;
			    if (i_136_ >= i_109_ && i_137_ >= i_110_
				&& (i_131_ < i
				    || class475.method7765(i, i_131_, i_136_,
							   i_137_,
							   553520716))) {
				int i_138_ = i_131_;
				if (class475.method7774(i_136_, i_137_,
							1096412732))
				    i_138_--;
				if (i_138_ >= 0)
				    Class684.method11237(class182, i_138_,
							 i_136_, i_137_,
							 i_134_ * 4 + i_124_,
							 ((i_108_ - i_135_) * 4
							  + i_125_ - 4),
							 i_119_, i_120_,
							 (byte) -42);
			    }
			}
		    }
		}
		class182.method3151(i_124_, i_125_, 4 * i_108_, 4 * i_108_,
				    i_121_, 2);
		class182.method3218();
		if (!aBool1192) {
		    Class311.aClass157_3472.method2540(48 + 4 * (i_122_
								 - i_109_),
						       (4 * i_104_ + 48
							- 4 * (i_123_ - i_110_)
							- 4 * i_108_),
						       i_108_ * 4, i_108_ * 4,
						       i_124_, i_125_);
		    if (aBool1198) {
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
	if (aBool1192) {
	    class182.method3159(class168_sub2, -1876999470);
	    if (aBool1198) {
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
	class182.method3277(anIntArray1193[0], anIntArray1193[1],
			    anIntArray1193[2], anIntArray1193[3]);
	class182.method3188(1, 1);
	Class83.method1604(-2074369752);
	anInt1195 = 0;
	aClass709_1203.method14344(1918147593);
	if (!aBool1190) {
	    Class350_Sub2_Sub1.method18173(i, 1281528091);
	    Class529 class529 = client.aClass507_11137.method8345(-172004035);
	    if (null != class529) {
		Class698.aClass40_Sub2_8770.method17397(1024, 64, -615092481);
		Class600 class600
		    = client.aClass507_11137.method8350(-1340402071);
		for (int i_139_ = 0; i_139_ < class529.anInt7140 * -698145127;
		     i_139_++) {
		    int i_140_ = class529.anIntArray7139[i_139_];
		    if (i_140_ >> 28
			== (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
			    .aByte10867)) {
			int i_141_ = ((i_140_ >> 14 & 0x3fff)
				      - class600.anInt7858 * -1227002079);
			int i_142_ = ((i_140_ & 0x3fff)
				      - 1429253007 * class600.anInt7860);
			if (i_141_ >= 0 && i_141_ < i_103_ && i_142_ >= 0
			    && i_142_ < i_104_)
			    aClass709_1203.method14345
				(new Class525_Sub42(i_139_), (byte) 0);
			else {
			    Class287 class287
				= ((Class287)
				   (Class698.aClass40_Sub2_8770.method76
				    (class529.anIntArray7141[i_139_],
				     -1337497165)));
			    if (null != class287.anIntArray3175
				&& (i_141_ + 1597685531 * class287.anInt3178
				    >= 0)
				&& (class287.anInt3176 * -218323365 + i_141_
				    < i_103_)
				&& i_142_ + 443050347 * class287.anInt3179 >= 0
				&& (i_142_ + -420580167 * class287.anInt3164
				    < i_104_))
				aClass709_1203.method14345
				    (new Class525_Sub42(i_139_), (byte) 0);
			}
		    }
		}
		Class698.aClass40_Sub2_8770.method17397(128, 64, -615092481);
	    }
	}
	return true;
    }
    
    static void method1839(Class182 class182, int i, int i_143_,
			   Class259 class259, Class152 class152, int i_144_,
			   int i_145_) {
	for (int i_146_ = 0; i_146_ < 1111866889 * client.anInt11216;
	     i_146_++) {
	    Class525_Sub19 class525_sub19
		= ((Class525_Sub19)
		   client.aClass10_11121
		       .method684((long) client.anIntArray11125[i_146_]));
	    if (class525_sub19 != null) {
		Class656_Sub1_Sub3_Sub1_Sub2 class656_sub1_sub3_sub1_sub2
		    = ((Class656_Sub1_Sub3_Sub1_Sub2)
		       class525_sub19.anObject10571);
		if (class656_sub1_sub3_sub1_sub2.method18954(-288330498)
		    && (class656_sub1_sub3_sub1_sub2.aByte10867
			== (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
			    .aByte10867))) {
		    Class299 class299
			= class656_sub1_sub3_sub1_sub2.aClass299_12255;
		    if (class299 != null && null != class299.anIntArray3323)
			class299 = class299.method5386(Class532.aClass111_7170,
						       Class532.aClass111_7170,
						       2112427921);
		    if (class299 != null && class299.aBool3310
			&& class299.aBool3326) {
			Class446 class446
			    = (class656_sub1_sub3_sub1_sub2.method10818()
			       .aClass446_4807);
			int i_147_ = (int) class446.aFloat4895 / 128 - i / 128;
			int i_148_
			    = (int) class446.aFloat4897 / 128 - i_143_ / 128;
			if (-1 != class299.anInt3348 * 1552956859)
			    Class413.method6689(class182, class152, class259,
						i_144_, i_145_, i_147_, i_148_,
						(1552956859
						 * class299.anInt3348),
						491212854);
			else
			    Class182.method3593(class259, class152, i_144_,
						i_145_, i_147_, i_148_,
						Class66.aClass157Array716[1],
						206180269);
		    }
		}
	    }
	}
    }
    
    static void method1840(int i) {
	anInt1195 = 0;
	int i_149_ = client.aClass507_11137.method8412(747515787);
	int i_150_ = client.aClass507_11137.method8352((byte) -113);
	Class475 class475 = client.aClass507_11137.method8360(1965585273);
	Class546 class546 = client.aClass507_11137.method8358((byte) 110);
	Class40_Sub11 class40_sub11
	    = client.aClass507_11137.method8362((byte) -1);
	int i_151_ = i;
	if (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705 != null) {
	    int i_152_ = ((Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
			   .anIntArray12014[0])
			  >> 3);
	    int i_153_ = ((Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
			   .anIntArray12017[0])
			  >> 3);
	    if (i_152_ >= 0 && i_152_ < Class617.aBoolArrayArray8064.length
		&& i_153_ >= 0
		&& i_153_ < Class617.aBoolArrayArray8064[i_152_].length
		&& Class617.aBoolArrayArray8064[i_152_][i_153_])
		i_151_ = 0;
	}
	for (int i_154_ = 0; i_154_ < i_149_; i_154_++) {
	    for (int i_155_ = 0; i_155_ < i_150_; i_155_++) {
		for (int i_156_ = i_151_; i_156_ <= i + 1 && i_156_ <= 3;
		     i_156_++) {
		    if ((i_156_ < i || class475.method7765(i, i_156_, i_154_,
							   i_155_, 1960681152))
			&& !(Class673.method11091
			     ((Interface62) class546.method8974(i_156_, i_154_,
								i_155_,
								(byte) -30),
			      class40_sub11, i_154_, i_155_, (byte) 1))
			&& !(Class673.method11091
			     (((Interface62)
			       class546.method8972(i_156_, i_154_, i_155_,
						   client.anInterface63_11091,
						   332483378)),
			      class40_sub11, i_154_, i_155_, (byte) 1))
			&& !(Class673.method11091
			     ((Interface62) class546.method8968(i_156_, i_154_,
								i_155_,
								(byte) -90),
			      class40_sub11, i_154_, i_155_, (byte) 1))
			&& !(Class673.method11091
			     ((Interface62) class546.method8970(i_156_, i_154_,
								i_155_,
								(byte) 1),
			      class40_sub11, i_154_, i_155_, (byte) 1))) {
			/* empty */
		    }
		}
	    }
	}
    }
    
    static void method1841(Class182 class182, Class602 class602, int i,
			   int i_157_, int i_158_) {
	Class79 class79
	    = ((Class79)
	       Class568.aClass40_Sub17_7627
		   .method76(1280945471 * class602.anInt7895, -1062023133));
	if (class79.anInt838 * 1911611899 != -1) {
	    if (class602.aBool7905) {
		i += class602.anInt7906 * -816113691;
		i &= 0x3;
	    } else
		i = 0;
	    Class157 class157
		= class79.method1574(class182, i, class602.aBool7945,
				     -237537763);
	    if (class157 != null) {
		int i_159_ = class602.anInt7885 * -2084474039;
		int i_160_ = 1437840657 * class602.anInt7886;
		if (1 == (i & 0x1)) {
		    i_159_ = 1437840657 * class602.anInt7886;
		    i_160_ = class602.anInt7885 * -2084474039;
		}
		int i_161_ = class157.method12();
		int i_162_ = class157.method2472();
		if (class79.aBool837) {
		    i_161_ = i_159_ * 4;
		    i_162_ = 4 * i_160_;
		}
		if (0 != class79.anInt840 * -443253289)
		    class157.method2482(i_157_, i_158_ - (i_160_ - 1) * 4,
					i_161_, i_162_, 0,
					(~0xffffff
					 | class79.anInt840 * -443253289),
					1);
		else
		    class157.method2481(i_157_, i_158_ - 4 * (i_160_ - 1),
					i_161_, i_162_);
	    }
	}
    }
    
    static boolean method1842(Interface62 interface62,
			      Class40_Sub11 class40_sub11, int i, int i_163_) {
	if (interface62 == null)
	    return false;
	Class602 class602
	    = ((Class602)
	       class40_sub11.method76(interface62.method406((byte) 1),
				      -940693537));
	if (class602.aBool7936 && !client.aBool11230)
	    return false;
	int i_164_ = 1813512349 * class602.anInt7918;
	if (null != class602.anIntArray7923) {
	    for (int i_165_ = 0; i_165_ < class602.anIntArray7923.length;
		 i_165_++) {
		if (-1 != class602.anIntArray7923[i_165_]) {
		    Class602 class602_166_
			= ((Class602)
			   class40_sub11.method76((class602.anIntArray7923
						   [i_165_]),
						  1473957239));
		    if (1813512349 * class602_166_.anInt7918 >= 0)
			i_164_ = class602_166_.anInt7918 * 1813512349;
		}
	    }
	}
	if (i_164_ >= 0) {
	    anIntArray1191[anInt1195 * 1748507383]
		= class602.anInt7894 * 1156889815;
	    anIntArray1194[anInt1195 * 1748507383] = i;
	    anIntArray1197[anInt1195 * 1748507383] = i_163_;
	    anInt1195 += -88553785;
	    return true;
	}
	return false;
    }
    
    static boolean method1843(int i, int i_167_, int i_168_) {
	Class546 class546 = client.aClass507_11137.method8358((byte) 98);
	boolean bool = true;
	Interface62 interface62
	    = (Interface62) class546.method8968(i, i_167_, i_168_, (byte) -33);
	if (interface62 != null)
	    bool &= Class198_Sub15.method15656(interface62, 2139505447);
	interface62
	    = (Interface62) class546.method8972(i, i_167_, i_168_,
						client.anInterface63_11091,
						332483378);
	if (interface62 != null)
	    bool &= Class198_Sub15.method15656(interface62, 2144857235);
	interface62
	    = (Interface62) class546.method8974(i, i_167_, i_168_, (byte) -83);
	if (interface62 != null)
	    bool &= Class198_Sub15.method15656(interface62, 2128464292);
	return bool;
    }
    
    static boolean method1844(int i, int i_169_, int i_170_) {
	Class546 class546 = client.aClass507_11137.method8358((byte) 39);
	boolean bool = true;
	Interface62 interface62
	    = (Interface62) class546.method8968(i, i_169_, i_170_, (byte) -77);
	if (interface62 != null)
	    bool &= Class198_Sub15.method15656(interface62, 2119741066);
	interface62
	    = (Interface62) class546.method8972(i, i_169_, i_170_,
						client.anInterface63_11091,
						332483378);
	if (interface62 != null)
	    bool &= Class198_Sub15.method15656(interface62, 2131936393);
	interface62
	    = (Interface62) class546.method8974(i, i_169_, i_170_, (byte) -68);
	if (interface62 != null)
	    bool &= Class198_Sub15.method15656(interface62, 2143175484);
	return bool;
    }
    
    Class98() throws Throwable {
	throw new Error();
    }
    
    static void method1845(Class259 class259, Class152 class152, int i,
			   int i_171_, int i_172_, int i_173_,
			   Class157 class157) {
	Class322.method5728(class259, class152, i, i_171_, i_172_, i_173_,
			    class157, 100.0, Class275.aClass275_2863,
			    Class272.aClass272_2846, 315429152);
    }
    
    static void method1846(Class182 class182, int i, int i_174_, int i_175_,
			   int i_176_, int i_177_, int i_178_, int i_179_) {
	Class546 class546 = client.aClass507_11137.method8358((byte) 45);
	Interface62 interface62
	    = (Interface62) class546.method8968(i, i_174_, i_175_, (byte) -4);
	if (null != interface62) {
	    Class602 class602
		= ((Class602)
		   (client.aClass507_11137.method8362((byte) -1).method76
		    (interface62.method406((byte) 1), -1927874171)));
	    int i_180_ = interface62.method413(1556828120) & 0x3;
	    int i_181_ = interface62.method72(-1019901937);
	    if (-1 != class602.anInt7895 * 1280945471)
		Class284.method5220(class182, class602, i_180_, i_176_, i_177_,
				    2115481571);
	    else {
		int i_182_ = i_178_;
		if (1700857535 * class602.anInt7888 > 0)
		    i_182_ = i_179_;
		if (i_181_ == -1214990409 * Class608.aClass608_7981.anInt7995
		    || (-1214990409 * Class608.aClass608_7978.anInt7995
			== i_181_)) {
		    if (i_180_ == 0)
			class182.method3193(i_176_, i_177_, 4, i_182_,
					    -1728356933);
		    else if (1 == i_180_)
			class182.method3192(i_176_, i_177_, 4, i_182_,
					    -331460350);
		    else if (2 == i_180_)
			class182.method3193(3 + i_176_, i_177_, 4, i_182_,
					    1957199678);
		    else if (3 == i_180_)
			class182.method3192(i_176_, 3 + i_177_, 4, i_182_,
					    -1208171214);
		}
		if (Class608.aClass608_7979.anInt7995 * -1214990409
		    == i_181_) {
		    if (0 == i_180_)
			class182.method3190(i_176_, i_177_, 1, 1, i_182_,
					    (byte) -1);
		    else if (i_180_ == 1)
			class182.method3190(i_176_ + 3, i_177_, 1, 1, i_182_,
					    (byte) -1);
		    else if (2 == i_180_)
			class182.method3190(3 + i_176_, 3 + i_177_, 1, 1,
					    i_182_, (byte) -1);
		    else if (3 == i_180_)
			class182.method3190(i_176_, i_177_ + 3, 1, 1, i_182_,
					    (byte) -1);
		}
		if (-1214990409 * Class608.aClass608_7978.anInt7995
		    == i_181_) {
		    if (i_180_ == 0)
			class182.method3192(i_176_, i_177_, 4, i_182_,
					    781884054);
		    else if (1 == i_180_)
			class182.method3193(3 + i_176_, i_177_, 4, i_182_,
					    611755422);
		    else if (i_180_ == 2)
			class182.method3192(i_176_, i_177_ + 3, 4, i_182_,
					    1679347730);
		    else if (i_180_ == 3)
			class182.method3193(i_176_, i_177_, 4, i_182_,
					    485486171);
		}
	    }
	}
	interface62
	    = (Interface62) class546.method8972(i, i_174_, i_175_,
						client.anInterface63_11091,
						332483378);
	if (null != interface62) {
	    Class602 class602
		= ((Class602)
		   client.aClass507_11137.method8362((byte) -1)
		       .method76(interface62.method406((byte) 1), 1336430264));
	    int i_183_ = interface62.method413(1938952853) & 0x3;
	    int i_184_ = interface62.method72(-1331666805);
	    if (-1 != 1280945471 * class602.anInt7895)
		Class284.method5220(class182, class602, i_183_, i_176_, i_177_,
				    -38956305);
	    else if (i_184_
		     == Class608.aClass608_7980.anInt7995 * -1214990409) {
		int i_185_ = -1118482;
		if (1700857535 * class602.anInt7888 > 0)
		    i_185_ = -1179648;
		if (0 == i_183_ || i_183_ == 2)
		    class182.method3194(i_176_, i_177_ + 3, 3 + i_176_, i_177_,
					i_185_, -2075226233);
		else
		    class182.method3194(i_176_, i_177_, i_176_ + 3, i_177_ + 3,
					i_185_, -2146794964);
	    }
	}
	interface62
	    = (Interface62) class546.method8974(i, i_174_, i_175_, (byte) -42);
	if (interface62 != null) {
	    Class602 class602
		= ((Class602)
		   (client.aClass507_11137.method8362((byte) -1).method76
		    (interface62.method406((byte) 1), -1193344690)));
	    int i_186_ = interface62.method413(1230108327) & 0x3;
	    if (class602.anInt7895 * 1280945471 != -1)
		Class284.method5220(class182, class602, i_186_, i_176_, i_177_,
				    -1914771463);
	}
    }
    
    static void method1847(Class182 class182, Class602 class602, int i,
			   int i_187_, int i_188_) {
	Class79 class79
	    = ((Class79)
	       Class568.aClass40_Sub17_7627
		   .method76(1280945471 * class602.anInt7895, 560933148));
	if (class79.anInt838 * 1911611899 != -1) {
	    if (class602.aBool7905) {
		i += class602.anInt7906 * -816113691;
		i &= 0x3;
	    } else
		i = 0;
	    Class157 class157
		= class79.method1574(class182, i, class602.aBool7945,
				     -871967249);
	    if (class157 != null) {
		int i_189_ = class602.anInt7885 * -2084474039;
		int i_190_ = 1437840657 * class602.anInt7886;
		if (1 == (i & 0x1)) {
		    i_189_ = 1437840657 * class602.anInt7886;
		    i_190_ = class602.anInt7885 * -2084474039;
		}
		int i_191_ = class157.method12();
		int i_192_ = class157.method2472();
		if (class79.aBool837) {
		    i_191_ = i_189_ * 4;
		    i_192_ = 4 * i_190_;
		}
		if (0 != class79.anInt840 * -443253289)
		    class157.method2482(i_187_, i_188_ - (i_190_ - 1) * 4,
					i_191_, i_192_, 0,
					(~0xffffff
					 | class79.anInt840 * -443253289),
					1);
		else
		    class157.method2481(i_187_, i_188_ - 4 * (i_190_ - 1),
					i_191_, i_192_);
	    }
	}
    }
    
    static void method1848(Class182 class182, Class602 class602, int i,
			   int i_193_, int i_194_) {
	Class79 class79
	    = ((Class79)
	       Class568.aClass40_Sub17_7627
		   .method76(1280945471 * class602.anInt7895, 716747040));
	if (class79.anInt838 * 1911611899 != -1) {
	    if (class602.aBool7905) {
		i += class602.anInt7906 * -816113691;
		i &= 0x3;
	    } else
		i = 0;
	    Class157 class157
		= class79.method1574(class182, i, class602.aBool7945,
				     -537748958);
	    if (class157 != null) {
		int i_195_ = class602.anInt7885 * -2084474039;
		int i_196_ = 1437840657 * class602.anInt7886;
		if (1 == (i & 0x1)) {
		    i_195_ = 1437840657 * class602.anInt7886;
		    i_196_ = class602.anInt7885 * -2084474039;
		}
		int i_197_ = class157.method12();
		int i_198_ = class157.method2472();
		if (class79.aBool837) {
		    i_197_ = i_195_ * 4;
		    i_198_ = 4 * i_196_;
		}
		if (0 != class79.anInt840 * -443253289)
		    class157.method2482(i_193_, i_194_ - (i_196_ - 1) * 4,
					i_197_, i_198_, 0,
					(~0xffffff
					 | class79.anInt840 * -443253289),
					1);
		else
		    class157.method2481(i_193_, i_194_ - 4 * (i_196_ - 1),
					i_197_, i_198_);
	    }
	}
    }
    
    static void method1849(Class259 class259, Class246 class246, int i,
			   int i_199_, int i_200_, int i_201_, int i_202_,
			   long l) {
	int i_203_ = i_201_ * i_201_ + i_200_ * i_200_;
	if ((long) i_203_ <= l) {
	    int i_204_;
	    if (5 == -174799205 * Class700.anInt8779)
		i_204_ = ((int) ((double) Class453_Sub3
					      .aClass309_Sub1_10316
					      .method5491((byte) 0)
				 * 2607.5945876176133)
			  + 223546583 * client.anInt11059) & 0x3fff;
	    else if (-174799205 * Class700.anInt8779 == 2)
		i_204_ = (int) client.aFloat11052 & 0x3fff;
	    else
		i_204_
		    = ((int) client.aFloat11052 + 223546583 * client.anInt11059
		       & 0x3fff);
	    int i_205_ = Class436.anIntArray4831[i_204_];
	    int i_206_ = Class436.anIntArray4838[i_204_];
	    if (2 != Class700.anInt8779 * -174799205) {
		i_205_ = i_205_ * 256 / (256 + -198324601 * client.anInt11169);
		i_206_ = i_206_ * 256 / (-198324601 * client.anInt11169 + 256);
	    }
	    int i_207_ = i_206_ * i_200_ + i_201_ * i_205_ >> 14;
	    int i_208_ = i_206_ * i_201_ - i_205_ * i_200_ >> 14;
	    Class157 class157 = Class308_Sub1.aClass157Array10143[i_202_];
	    int i_209_ = class157.method2503();
	    int i_210_ = class157.method2471();
	    int i_211_
		= class259.anInt2602 * -1694810043 / 2 + i_207_ - i_209_ / 2;
	    int i_212_ = i_211_ + i_209_;
	    int i_213_
		= -i_208_ + class259.anInt2598 * 2054207119 / 2 - i_210_;
	    int i_214_ = i_213_ + i_210_;
	    boolean bool;
	    if (null != class246)
		bool = (!class246.method4486(i_211_, i_213_, (byte) 108)
			|| !class246.method4486(i_212_, i_213_, (byte) 8)
			|| !class246.method4486(i_211_, i_214_, (byte) 29)
			|| !class246.method4486(i_212_, i_214_, (byte) 29));
	    else {
		int i_215_ = i_210_;
		int i_216_ = i_209_ / 2;
		bool
		    = (i_213_ <= -i_215_
		       || i_214_ >= 2054207119 * class259.anInt2598
		       || i_211_ <= -i_216_
		       || i_212_ >= -1694810043 * class259.anInt2602 + i_216_);
	    }
	    if (bool) {
		double d = Math.atan2((double) i_207_, (double) i_208_);
		double d_217_ = Math.atan2((double) Math.abs(i_207_),
					   (double) Math.abs(i_208_));
		double d_218_ = Math.atan2((double) (-1694810043
						     * class259.anInt2602 / 2),
					   (double) (class259.anInt2598
						     * 2054207119 / 2));
		boolean bool_219_ = false;
		double d_220_ = 0.0;
		int i_221_;
		if (d_217_ < d_218_) {
		    d_220_ = 1.5707963267948966 - d;
		    i_221_ = 2054207119 * class259.anInt2598 / 2;
		} else {
		    d_220_ = d;
		    i_221_ = -1694810043 * class259.anInt2602 / 2;
		}
		int i_222_ = Math.abs((int) -((double) i_221_
					      * Math.sin(1.5707963267948966)
					      / Math.sin(d_220_)));
		Class335.aClass157Array3628[i_202_].method2532
		    (0.0F + ((float) (class259.anInt2602 * -1694810043) / 2.0F
			     + (float) i),
		     ((float) i_199_
		      + (float) (class259.anInt2598 * 2054207119) / 2.0F
		      - 0.0F),
		     ((float) Class335.aClass157Array3628[i_202_].method12()
		      / 2.0F),
		     (float) i_222_, 4096,
		     (int) (-d / 6.283185307179586 * 65535.0));
	    } else if (class246 != null)
		class157.method2480(i + i_211_, i_213_ + i_199_,
				    class246.aClass152_2433, i, i_199_);
	    else
		class157.method2518(i_211_ + i, i_199_ + i_213_);
	}
    }
    
    static void method1850(int i, int i_223_, Class259 class259,
			   Class152 class152, int i_224_, int i_225_) {
	int i_226_ = 692634081 * Class104.anInt1284;
	int[] is = Class104.anIntArray1285;
	for (int i_227_ = 0; i_227_ < i_226_; i_227_++) {
	    Class656_Sub1_Sub3_Sub1_Sub1 class656_sub1_sub3_sub1_sub1
		= client.aClass656_Sub1_Sub3_Sub1_Sub1Array11384[is[i_227_]];
	    if (class656_sub1_sub3_sub1_sub1 != null
		&& class656_sub1_sub3_sub1_sub1.method18919((byte) -24)
		&& !class656_sub1_sub3_sub1_sub1.aClass627_12253
			.method10267((byte) 0)
		&& (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
		    != class656_sub1_sub3_sub1_sub1)
		&& (class656_sub1_sub3_sub1_sub1.aByte10867
		    == (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
			.aByte10867))) {
		Class446 class446 = (class656_sub1_sub3_sub1_sub1.method10818()
				     .aClass446_4807);
		int i_228_ = (int) class446.aFloat4895 / 128 - i / 128;
		int i_229_ = (int) class446.aFloat4897 / 128 - i_223_ / 128;
		boolean bool = false;
		for (int i_230_ = 0; i_230_ < -883281325 * client.anInt11204;
		     i_230_++) {
		    Class66 class66 = client.aClass66Array11356[i_230_];
		    if (class656_sub1_sub3_sub1_sub1.aString12231
			    .equals(class66.aString708)
			&& 0 != class66.anInt706 * 163601069) {
			bool = true;
			break;
		    }
		}
		boolean bool_231_ = false;
		for (int i_232_ = 0; i_232_ < -218000115 * Class110.anInt1371;
		     i_232_++) {
		    if (class656_sub1_sub3_sub1_sub1.aString12231.equals
			(Class699.aClass99Array8774[i_232_].aString1208)) {
			bool_231_ = true;
			break;
		    }
		}
		boolean bool_233_ = false;
		if (0 != -1861114115 * (Class581
					.aClass656_Sub1_Sub3_Sub1_Sub1_7705
					.anInt12244)
		    && (class656_sub1_sub3_sub1_sub1.anInt12244 * -1861114115
			!= 0)
		    && (-1861114115 * class656_sub1_sub3_sub1_sub1.anInt12244
			== (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
			    .anInt12244) * -1861114115))
		    bool_233_ = true;
		if (class656_sub1_sub3_sub1_sub1.aClass637_12246 != null
		    && (class656_sub1_sub3_sub1_sub1.aClass637_12246.anInt8300
			* -1172437919) != -1
		    && ((Class299)
			(Class168_Sub1.aClass40_Sub7_9112.method76
			 (-1172437919 * (class656_sub1_sub3_sub1_sub1
					 .aClass637_12246.anInt8300),
			  1005743067))).aBool3358)
		    Class182.method3593(class259, class152, i_224_, i_225_,
					i_228_, i_229_,
					Class66.aClass157Array716[1],
					1284324813);
		else if (class656_sub1_sub3_sub1_sub1.aClass243_12252
			 == Class243.aClass243_2414)
		    Class182.method3593(class259, class152, i_224_, i_225_,
					i_228_, i_229_,
					Class66.aClass157Array716[8],
					-506740979);
		else if (Class243.aClass243_2413
			 == class656_sub1_sub3_sub1_sub1.aClass243_12252)
		    Class182.method3593(class259, class152, i_224_, i_225_,
					i_228_, i_229_,
					Class66.aClass157Array716[6],
					-1043624548);
		else if (bool_233_)
		    Class182.method3593(class259, class152, i_224_, i_225_,
					i_228_, i_229_,
					Class66.aClass157Array716[4],
					-923641321);
		else if (class656_sub1_sub3_sub1_sub1.aBool12254)
		    Class182.method3593(class259, class152, i_224_, i_225_,
					i_228_, i_229_,
					Class66.aClass157Array716[7],
					-738796954);
		else if (bool)
		    Class182.method3593(class259, class152, i_224_, i_225_,
					i_228_, i_229_,
					Class66.aClass157Array716[3],
					122862125);
		else if (bool_231_)
		    Class182.method3593(class259, class152, i_224_, i_225_,
					i_228_, i_229_,
					Class66.aClass157Array716[5],
					1947006489);
		else
		    Class182.method3593(class259, class152, i_224_, i_225_,
					i_228_, i_229_,
					Class66.aClass157Array716[2],
					1761876863);
	    }
	}
    }
    
    static void method1851(Class182 class182, Class259 class259, int i,
			   int i_234_) {
	if (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705 != null) {
	    class182.method3218();
	    Class246 class246 = null;
	    Class152 class152 = null;
	    if (2010235789 * class259.anInt2590 == 5) {
		class246 = class259.method4692(class182, -691092028);
		if (class246 == null)
		    return;
		class152 = class246.aClass152_2433;
		if ((-1694810043 * class259.anInt2602
		     != 757608145 * class246.anInt2431)
		    || (class246.anInt2430 * -2047032127
			!= class259.anInt2598 * 2054207119))
		    throw new IllegalStateException("");
	    }
	    class182.method3184(i, i_234_,
				i + -1694810043 * class259.anInt2602,
				class259.anInt2598 * 2054207119 + i_234_);
	    if (1806053763 * anInt1205 != 2 && 5 != 1806053763 * anInt1205
		&& null != Class311.aClass157_3472) {
		class182.method3181(anIntArray1193);
		class182.method3580();
		Class600 class600
		    = client.aClass507_11137.method8350(1003736830);
		int i_235_;
		int i_236_;
		int i_237_;
		int i_238_;
		if (2 == -174799205 * Class700.anInt8779) {
		    i_235_ = client.anInt11174 * -914139697;
		    i_236_ = -2064193877 * client.anInt11112;
		    i_237_ = (int) -client.aFloat11052 & 0x3fff;
		    i_238_ = 4096;
		} else {
		    Class446 class446
			= (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
			       .method10818
			   ().aClass446_4807);
		    i_235_ = (int) class446.aFloat4895;
		    i_236_ = (int) class446.aFloat4897;
		    if (5 == -174799205 * Class700.anInt8779)
			i_237_ = ((int) -((double) Class453_Sub3
						       .aClass309_Sub1_10316
						       .method5491((byte) 0)
					  * 2607.5945876176133)
				  + 223546583 * client.anInt11059) & 0x3fff;
		    else
			i_237_ = ((int) -client.aFloat11052
				  + client.anInt11059 * 223546583) & 0x3fff;
		    i_238_ = 4096 - 1121773680 * client.anInt11169;
		}
		int i_239_ = i_235_ / 128 + 48;
		int i_240_
		    = (48 + client.aClass507_11137.method8352((byte) -127) * 4
		       - i_236_ / 128);
		if (class152 != null)
		    Class311.aClass157_3472.method2491
			(((float) (-1694810043 * class259.anInt2602) / 2.0F
			  + (float) i),
			 ((float) i_234_
			  + (float) (2054207119 * class259.anInt2598) / 2.0F),
			 (float) i_239_, (float) i_240_, i_238_, i_237_ << 2,
			 class152, i, i_234_);
		else
		    Class311.aClass157_3472.method2489
			(((float) i
			  + (float) (class259.anInt2602 * -1694810043) / 2.0F),
			 ((float) (class259.anInt2598 * 2054207119) / 2.0F
			  + (float) i_234_),
			 (float) i_239_, (float) i_240_, i_238_, i_237_ << 2,
			 1, -1, 1);
		Class529 class529
		    = client.aClass507_11137.method8345(-1804854093);
		for (Class525_Sub42 class525_sub42
			 = ((Class525_Sub42)
			    aClass709_1203.method14372((short) -1282));
		     class525_sub42 != null;
		     class525_sub42
			 = ((Class525_Sub42)
			    aClass709_1203.method14353(-1347995535))) {
		    int i_241_ = class525_sub42.anInt10858 * -1344652871;
		    int i_242_
			= ((class529.anIntArray7139[i_241_] >> 14 & 0x3fff)
			   - -1227002079 * class600.anInt7858);
		    int i_243_ = ((class529.anIntArray7139[i_241_] & 0x3fff)
				  - 1429253007 * class600.anInt7860);
		    int i_244_ = 2 + i_242_ * 4 - i_235_ / 128;
		    int i_245_ = i_243_ * 4 + 2 - i_236_ / 128;
		    Class413.method6689(class182, class152, class259, i,
					i_234_, i_244_, i_245_,
					class529.anIntArray7141[i_241_],
					491212854);
		}
		for (int i_246_ = 0; i_246_ < 1748507383 * anInt1195;
		     i_246_++) {
		    int i_247_ = 4 * anIntArray1194[i_246_] + 2 - i_235_ / 128;
		    int i_248_ = 2 + 4 * anIntArray1197[i_246_] - i_236_ / 128;
		    Class602 class602
			= ((Class602)
			   client.aClass507_11137.method8362((byte) -1)
			       .method76(anIntArray1191[i_246_], -1689781511));
		    if (class602.anIntArray7923 != null) {
			class602 = class602.method9909(Class532.aClass111_7170,
						       Class532.aClass111_7170,
						       -2040727721);
			if (class602 == null
			    || 1813512349 * class602.anInt7918 == -1)
			    continue;
		    }
		    Class413.method6689(class182, class152, class259, i,
					i_234_, i_247_, i_248_,
					class602.anInt7918 * 1813512349,
					491212854);
		}
		for (Class525_Sub23 class525_sub23
			 = ((Class525_Sub23)
			    client.aClass10_11246.method689(513949751));
		     class525_sub23 != null;
		     class525_sub23
			 = ((Class525_Sub23)
			    client.aClass10_11246.method690((byte) -82))) {
		    int i_249_ = (int) ((class525_sub23.aLong7113
					 * -5126207504388691097L) >> 28
					& 0x3L);
		    if (i_249_ == -2051547415 * anInt1199) {
			int i_250_ = ((int) ((-5126207504388691097L
					      * class525_sub23.aLong7113)
					     & 0x3fffL)
				      - -1227002079 * class600.anInt7858);
			int i_251_ = ((int) ((class525_sub23.aLong7113
					      * -5126207504388691097L) >> 14
					     & 0x3fffL)
				      - 1429253007 * class600.anInt7860);
			int i_252_ = i_250_ * 4 + 2 - i_235_ / 128;
			int i_253_ = i_251_ * 4 + 2 - i_236_ / 128;
			Class182.method3593(class259, class152, i, i_234_,
					    i_252_, i_253_,
					    Class66.aClass157Array716[0],
					    1835819174);
		    }
		}
		Class451.method7333(class182, i_235_, i_236_, class259,
				    class152, i, i_234_, -1554455505);
		Class519.method8659(i_235_, i_236_, class259, class152, i,
				    i_234_, (byte) 123);
		Class686.method14008(i_235_, i_236_, class259, class246, i,
				     i_234_, -1656607438);
		if (2 != -174799205 * Class700.anInt8779) {
		    if (-1 != anInt1200 * -183945107) {
			int i_254_
			    = (2 + -735780428 * anInt1200 - i_235_ / 128
			       + (Class581
				      .aClass656_Sub1_Sub3_Sub1_Sub1_7705
				      .method18608((byte) 38)
				  - 1) * 2);
			int i_255_
			    = (2 + 450486804 * anInt1201 - i_236_ / 128
			       + (Class581
				      .aClass656_Sub1_Sub3_Sub1_Sub1_7705
				      .method18608((byte) 76)
				  - 1) * 2);
			Class322.method5728
			    (class259, class152,
			     i - Class696_Sub13.anInt10911 * -770959357,
			     i_234_ - -1844218305 * Class525_Sub31.anInt10733,
			     i_254_, i_255_,
			     Class521.aClass157Array7093[aBool1202 ? 1 : 0],
			     100.0, Class275.aClass275_2864,
			     Class272.aClass272_2850, -2008577541);
		    }
		    if (!Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
			     .aClass627_12253.method10267((byte) 0))
			class182.method3190
			    (i + class259.anInt2602 * -1694810043 / 2 - 1,
			     i_234_ + class259.anInt2598 * 2054207119 / 2 - 1,
			     3, 3, -1, (byte) -1);
		}
		class182.method3277(anIntArray1193[0], anIntArray1193[1],
				    anIntArray1193[2], anIntArray1193[3]);
	    } else if (null != class152)
		class182.method3328(-16777216, class152, i, i_234_);
	}
    }
    
    static void method1852(int i, int i_256_, boolean bool) {
	Class617.aBoolArrayArray8064[i][i_256_] = bool;
    }
    
    static boolean method1853(Interface62 interface62) {
	Class602 class602
	    = ((Class602)
	       client.aClass507_11137.method8362((byte) -1)
		   .method76(interface62.method406((byte) 1), -1474999783));
	if (class602.anInt7895 * 1280945471 == -1)
	    return true;
	Class79 class79
	    = ((Class79)
	       Class568.aClass40_Sub17_7627
		   .method76(class602.anInt7895 * 1280945471, 291489135));
	if (-1 == 1911611899 * class79.anInt838)
	    return true;
	return class79.method1585(1275918962);
    }
    
    static void method1854(Class182 class182, Class602 class602, int i,
			   int i_257_, int i_258_) {
	Class79 class79
	    = ((Class79)
	       Class568.aClass40_Sub17_7627
		   .method76(1280945471 * class602.anInt7895, -329606254));
	if (class79.anInt838 * 1911611899 != -1) {
	    if (class602.aBool7905) {
		i += class602.anInt7906 * -816113691;
		i &= 0x3;
	    } else
		i = 0;
	    Class157 class157
		= class79.method1574(class182, i, class602.aBool7945,
				     -1317058863);
	    if (class157 != null) {
		int i_259_ = class602.anInt7885 * -2084474039;
		int i_260_ = 1437840657 * class602.anInt7886;
		if (1 == (i & 0x1)) {
		    i_259_ = 1437840657 * class602.anInt7886;
		    i_260_ = class602.anInt7885 * -2084474039;
		}
		int i_261_ = class157.method12();
		int i_262_ = class157.method2472();
		if (class79.aBool837) {
		    i_261_ = i_259_ * 4;
		    i_262_ = 4 * i_260_;
		}
		if (0 != class79.anInt840 * -443253289)
		    class157.method2482(i_257_, i_258_ - (i_260_ - 1) * 4,
					i_261_, i_262_, 0,
					(~0xffffff
					 | class79.anInt840 * -443253289),
					1);
		else
		    class157.method2481(i_257_, i_258_ - 4 * (i_260_ - 1),
					i_261_, i_262_);
	    }
	}
    }
    
    static void method1855(Class182 class182) {
	if ((Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705.aByte10867
	     != anInt1199 * -2051547415)
	    && client.aClass507_11137.method8358((byte) 116) != null) {
	    Class251.method4508((byte) 8);
	    if (Class223.method4242(class182,
				    (Class581
				     .aClass656_Sub1_Sub3_Sub1_Sub1_7705
				     .aByte10867),
				    954403970))
		anInt1199
		    = 975231321 * (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
				   .aByte10867);
	}
    }
    
    static void method1856(int i, int i_263_, Class259 class259,
			   Class152 class152, int i_264_, int i_265_) {
	int i_266_ = 692634081 * Class104.anInt1284;
	int[] is = Class104.anIntArray1285;
	for (int i_267_ = 0; i_267_ < i_266_; i_267_++) {
	    Class656_Sub1_Sub3_Sub1_Sub1 class656_sub1_sub3_sub1_sub1
		= client.aClass656_Sub1_Sub3_Sub1_Sub1Array11384[is[i_267_]];
	    if (class656_sub1_sub3_sub1_sub1 != null
		&& class656_sub1_sub3_sub1_sub1.method18919((byte) 59)
		&& !class656_sub1_sub3_sub1_sub1.aClass627_12253
			.method10267((byte) 0)
		&& (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
		    != class656_sub1_sub3_sub1_sub1)
		&& (class656_sub1_sub3_sub1_sub1.aByte10867
		    == (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
			.aByte10867))) {
		Class446 class446 = (class656_sub1_sub3_sub1_sub1.method10818()
				     .aClass446_4807);
		int i_268_ = (int) class446.aFloat4895 / 128 - i / 128;
		int i_269_ = (int) class446.aFloat4897 / 128 - i_263_ / 128;
		boolean bool = false;
		for (int i_270_ = 0; i_270_ < -883281325 * client.anInt11204;
		     i_270_++) {
		    Class66 class66 = client.aClass66Array11356[i_270_];
		    if (class656_sub1_sub3_sub1_sub1.aString12231
			    .equals(class66.aString708)
			&& 0 != class66.anInt706 * 163601069) {
			bool = true;
			break;
		    }
		}
		boolean bool_271_ = false;
		for (int i_272_ = 0; i_272_ < -218000115 * Class110.anInt1371;
		     i_272_++) {
		    if (class656_sub1_sub3_sub1_sub1.aString12231.equals
			(Class699.aClass99Array8774[i_272_].aString1208)) {
			bool_271_ = true;
			break;
		    }
		}
		boolean bool_273_ = false;
		if (0 != -1861114115 * (Class581
					.aClass656_Sub1_Sub3_Sub1_Sub1_7705
					.anInt12244)
		    && (class656_sub1_sub3_sub1_sub1.anInt12244 * -1861114115
			!= 0)
		    && (-1861114115 * class656_sub1_sub3_sub1_sub1.anInt12244
			== (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
			    .anInt12244) * -1861114115))
		    bool_273_ = true;
		if (class656_sub1_sub3_sub1_sub1.aClass637_12246 != null
		    && (class656_sub1_sub3_sub1_sub1.aClass637_12246.anInt8300
			* -1172437919) != -1
		    && ((Class299)
			(Class168_Sub1.aClass40_Sub7_9112.method76
			 (-1172437919 * (class656_sub1_sub3_sub1_sub1
					 .aClass637_12246.anInt8300),
			  -1437386420))).aBool3358)
		    Class182.method3593(class259, class152, i_264_, i_265_,
					i_268_, i_269_,
					Class66.aClass157Array716[1],
					-503676430);
		else if (class656_sub1_sub3_sub1_sub1.aClass243_12252
			 == Class243.aClass243_2414)
		    Class182.method3593(class259, class152, i_264_, i_265_,
					i_268_, i_269_,
					Class66.aClass157Array716[8],
					1744735816);
		else if (Class243.aClass243_2413
			 == class656_sub1_sub3_sub1_sub1.aClass243_12252)
		    Class182.method3593(class259, class152, i_264_, i_265_,
					i_268_, i_269_,
					Class66.aClass157Array716[6],
					-1963282728);
		else if (bool_273_)
		    Class182.method3593(class259, class152, i_264_, i_265_,
					i_268_, i_269_,
					Class66.aClass157Array716[4],
					-1875996482);
		else if (class656_sub1_sub3_sub1_sub1.aBool12254)
		    Class182.method3593(class259, class152, i_264_, i_265_,
					i_268_, i_269_,
					Class66.aClass157Array716[7],
					1299596189);
		else if (bool)
		    Class182.method3593(class259, class152, i_264_, i_265_,
					i_268_, i_269_,
					Class66.aClass157Array716[3],
					-419664788);
		else if (bool_271_)
		    Class182.method3593(class259, class152, i_264_, i_265_,
					i_268_, i_269_,
					Class66.aClass157Array716[5],
					-1551341982);
		else
		    Class182.method3593(class259, class152, i_264_, i_265_,
					i_268_, i_269_,
					Class66.aClass157Array716[2],
					1228826555);
	    }
	}
    }
    
    static void method1857(int i, int i_274_, Class259 class259,
			   Class152 class152, int i_275_, int i_276_) {
	int i_277_ = 692634081 * Class104.anInt1284;
	int[] is = Class104.anIntArray1285;
	for (int i_278_ = 0; i_278_ < i_277_; i_278_++) {
	    Class656_Sub1_Sub3_Sub1_Sub1 class656_sub1_sub3_sub1_sub1
		= client.aClass656_Sub1_Sub3_Sub1_Sub1Array11384[is[i_278_]];
	    if (class656_sub1_sub3_sub1_sub1 != null
		&& class656_sub1_sub3_sub1_sub1.method18919((byte) 26)
		&& !class656_sub1_sub3_sub1_sub1.aClass627_12253
			.method10267((byte) 0)
		&& (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
		    != class656_sub1_sub3_sub1_sub1)
		&& (class656_sub1_sub3_sub1_sub1.aByte10867
		    == (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
			.aByte10867))) {
		Class446 class446 = (class656_sub1_sub3_sub1_sub1.method10818()
				     .aClass446_4807);
		int i_279_ = (int) class446.aFloat4895 / 128 - i / 128;
		int i_280_ = (int) class446.aFloat4897 / 128 - i_274_ / 128;
		boolean bool = false;
		for (int i_281_ = 0; i_281_ < -883281325 * client.anInt11204;
		     i_281_++) {
		    Class66 class66 = client.aClass66Array11356[i_281_];
		    if (class656_sub1_sub3_sub1_sub1.aString12231
			    .equals(class66.aString708)
			&& 0 != class66.anInt706 * 163601069) {
			bool = true;
			break;
		    }
		}
		boolean bool_282_ = false;
		for (int i_283_ = 0; i_283_ < -218000115 * Class110.anInt1371;
		     i_283_++) {
		    if (class656_sub1_sub3_sub1_sub1.aString12231.equals
			(Class699.aClass99Array8774[i_283_].aString1208)) {
			bool_282_ = true;
			break;
		    }
		}
		boolean bool_284_ = false;
		if (0 != -1861114115 * (Class581
					.aClass656_Sub1_Sub3_Sub1_Sub1_7705
					.anInt12244)
		    && (class656_sub1_sub3_sub1_sub1.anInt12244 * -1861114115
			!= 0)
		    && (-1861114115 * class656_sub1_sub3_sub1_sub1.anInt12244
			== (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
			    .anInt12244) * -1861114115))
		    bool_284_ = true;
		if (class656_sub1_sub3_sub1_sub1.aClass637_12246 != null
		    && (class656_sub1_sub3_sub1_sub1.aClass637_12246.anInt8300
			* -1172437919) != -1
		    && ((Class299)
			(Class168_Sub1.aClass40_Sub7_9112.method76
			 (-1172437919 * (class656_sub1_sub3_sub1_sub1
					 .aClass637_12246.anInt8300),
			  1333584911))).aBool3358)
		    Class182.method3593(class259, class152, i_275_, i_276_,
					i_279_, i_280_,
					Class66.aClass157Array716[1],
					591553029);
		else if (class656_sub1_sub3_sub1_sub1.aClass243_12252
			 == Class243.aClass243_2414)
		    Class182.method3593(class259, class152, i_275_, i_276_,
					i_279_, i_280_,
					Class66.aClass157Array716[8],
					-269601159);
		else if (Class243.aClass243_2413
			 == class656_sub1_sub3_sub1_sub1.aClass243_12252)
		    Class182.method3593(class259, class152, i_275_, i_276_,
					i_279_, i_280_,
					Class66.aClass157Array716[6],
					-864180845);
		else if (bool_284_)
		    Class182.method3593(class259, class152, i_275_, i_276_,
					i_279_, i_280_,
					Class66.aClass157Array716[4],
					-335314275);
		else if (class656_sub1_sub3_sub1_sub1.aBool12254)
		    Class182.method3593(class259, class152, i_275_, i_276_,
					i_279_, i_280_,
					Class66.aClass157Array716[7],
					455045666);
		else if (bool)
		    Class182.method3593(class259, class152, i_275_, i_276_,
					i_279_, i_280_,
					Class66.aClass157Array716[3],
					-27895774);
		else if (bool_282_)
		    Class182.method3593(class259, class152, i_275_, i_276_,
					i_279_, i_280_,
					Class66.aClass157Array716[5],
					-339731782);
		else
		    Class182.method3593(class259, class152, i_275_, i_276_,
					i_279_, i_280_,
					Class66.aClass157Array716[2],
					842348670);
	    }
	}
    }
    
    static void method1858() {
	anInt1205 = 0;
	anInt1200 = 1046245019;
	anInt1201 = 671956915;
    }
    
    static void method1859(Class182 class182, Class152 class152,
			   Class259 class259, int i, int i_285_, int i_286_,
			   int i_287_, int i_288_) {
	Class287 class287
	    = ((Class287)
	       Class698.aClass40_Sub2_8770.method76(i_288_, -1965302758));
	if (class287 != null && null != class287.anIntArray3174
	    && class287.method5234(Class532.aClass111_7170,
				   Class532.aClass111_7170, (byte) -24))
	    class287
		= class287.method5232(Class532.aClass111_7170,
				      Class532.aClass111_7170, -2100421665);
	if (null != class287 && class287.aBool3157
	    && class287.method5234(Class532.aClass111_7170,
				   Class532.aClass111_7170, (byte) -39)) {
	    if (class287.anIntArray3175 != null) {
		int[] is = new int[class287.anIntArray3175.length];
		for (int i_289_ = 0; i_289_ < is.length / 2; i_289_++) {
		    int i_290_;
		    if (Class700.anInt8779 * -174799205 == 5)
			i_290_ = ((int) ((double) Class453_Sub3
						      .aClass309_Sub1_10316
						      .method5491((byte) 0)
					 * 2607.5945876176133)
				  + client.anInt11059 * 223546583) & 0x3fff;
		    else if (Class700.anInt8779 * -174799205 == 2)
			i_290_ = (int) client.aFloat11052 & 0x3fff;
		    else
			i_290_ = (223546583 * client.anInt11059
				  + (int) client.aFloat11052) & 0x3fff;
		    int i_291_ = Class436.anIntArray4831[i_290_];
		    int i_292_ = Class436.anIntArray4838[i_290_];
		    if (2 != -174799205 * Class700.anInt8779) {
			i_291_ = 256 * i_291_ / (-198324601 * client.anInt11169
						 + 256);
			i_292_ = i_292_ * 256 / (-198324601 * client.anInt11169
						 + 256);
		    }
		    is[i_289_ * 2]
			= ((((i_286_ + class287.anIntArray3175[i_289_ * 2] * 4)
			     * i_292_)
			    + i_291_ * (i_287_ + (class287.anIntArray3175
						  [1 + 2 * i_289_]) * 4))
			   >> 14) + (i + -1694810043 * class259.anInt2602 / 2);
		    is[2 * i_289_ + 1]
			= (2054207119 * class259.anInt2598 / 2 + i_285_
			   - ((((i_287_
				 + 4 * class287.anIntArray3175[1 + 2 * i_289_])
				* i_292_)
			       - i_291_ * (i_286_
					   + 4 * (class287.anIntArray3175
						  [i_289_ * 2])))
			      >> 14));
		}
		Class246 class246 = class259.method4692(class182, -1757831900);
		if (class246 != null)
		    Class167.method2681(class182, is,
					class287.anInt3183 * -2074779725,
					class246.anIntArray2429,
					class246.anIntArray2432);
		if (668357193 * class287.anInt3181 > 0) {
		    for (int i_293_ = 0; i_293_ < is.length / 2 - 1;
			 i_293_++) {
			int i_294_ = is[2 * i_293_];
			int i_295_ = is[1 + 2 * i_293_];
			int i_296_ = is[2 * (1 + i_293_)];
			int i_297_ = is[2 * (1 + i_293_) + 1];
			if (i_296_ < i_294_) {
			    int i_298_ = i_294_;
			    int i_299_ = i_295_;
			    i_294_ = i_296_;
			    i_295_ = i_297_;
			    i_296_ = i_298_;
			    i_297_ = i_299_;
			} else if (i_294_ == i_296_ && i_297_ < i_295_) {
			    int i_300_ = i_295_;
			    i_295_ = i_297_;
			    i_297_ = i_300_;
			}
			if (null != class152)
			    class182.method3204(i_294_, i_295_, i_296_, i_297_,
						(class287.anIntArray3165
						 [(class287.aByteArray3189
						   [i_293_]) & 0xff]),
						1, class152, i, i_285_,
						668357193 * class287.anInt3181,
						310583221 * class287.anInt3182,
						(-1258236733
						 * class287.anInt3162));
			else
			    class182.method3508
				(i_294_, i_295_, i_296_, i_297_,
				 (class287.anIntArray3165
				  [class287.aByteArray3189[i_293_] & 0xff]),
				 1, class287.anInt3181 * 668357193,
				 class287.anInt3182 * 310583221,
				 class287.anInt3162 * -1258236733);
		    }
		    int i_301_ = is[is.length - 2];
		    int i_302_ = is[is.length - 1];
		    int i_303_ = is[0];
		    int i_304_ = is[1];
		    if (i_303_ < i_301_) {
			int i_305_ = i_301_;
			int i_306_ = i_302_;
			i_301_ = i_303_;
			i_302_ = i_304_;
			i_303_ = i_305_;
			i_304_ = i_306_;
		    } else if (i_301_ == i_303_ && i_304_ < i_302_) {
			int i_307_ = i_302_;
			i_302_ = i_304_;
			i_304_ = i_307_;
		    }
		    if (class152 != null)
			class182.method3204(i_301_, i_302_, i_303_, i_304_,
					    (class287.anIntArray3165
					     [(class287.aByteArray3189
					       [(class287.aByteArray3189.length
						 - 1)]) & 0xff]),
					    1, class152, i, i_285_,
					    class287.anInt3181 * 668357193,
					    310583221 * class287.anInt3182,
					    class287.anInt3162 * -1258236733);
		    else
			class182.method3508(i_301_, i_302_, i_303_, i_304_,
					    (class287.anIntArray3165
					     [(class287.aByteArray3189
					       [(class287.aByteArray3189.length
						 - 1)]) & 0xff]),
					    1, 668357193 * class287.anInt3181,
					    class287.anInt3182 * 310583221,
					    class287.anInt3162 * -1258236733);
		} else if (null != class152) {
		    for (int i_308_ = 0; i_308_ < is.length / 2 - 1; i_308_++)
			class182.method3202(is[2 * i_308_], is[1 + i_308_ * 2],
					    is[(i_308_ + 1) * 2],
					    is[2 * (1 + i_308_) + 1],
					    (class287.anIntArray3165
					     [(class287.aByteArray3189[i_308_]
					       & 0xff)]),
					    1, class152, i, i_285_);
		    class182.method3202(is[is.length - 2], is[is.length - 1],
					is[0], is[1],
					(class287.anIntArray3165
					 [(class287.aByteArray3189
					   [(class287.aByteArray3189.length
					     - 1)]) & 0xff]),
					1, class152, i, i_285_);
		} else {
		    for (int i_309_ = 0; i_309_ < is.length / 2 - 1; i_309_++)
			class182.method3201(is[i_309_ * 2], is[1 + i_309_ * 2],
					    is[2 * (1 + i_309_)],
					    is[1 + 2 * (1 + i_309_)],
					    (class287.anIntArray3165
					     [(class287.aByteArray3189[i_309_]
					       & 0xff)]),
					    1);
		    class182.method3201(is[is.length - 2], is[is.length - 1],
					is[0], is[1],
					(class287.anIntArray3165
					 [(class287.aByteArray3189
					   [(class287.aByteArray3189.length
					     - 1)]) & 0xff]),
					1);
		}
	    }
	    Class157 class157 = null;
	    if (1564425333 * class287.anInt3150 != -1) {
		class157 = class287.method5235(class182, false, 430926630);
		if (null != class157) {
		    int i_310_
			= (-254785117 * class287.anInt3190 > 0
			   ? class287.anInt3190 * -254785117
			   : Class138.aClass631_1641.anInt8181 * 912141075);
		    Class322.method5728(class259, class152, i, i_285_, i_286_,
					i_287_, class157, (double) i_310_,
					class287.aClass275_3186,
					class287.aClass272_3161, -493394263);
		}
	    }
	    if (null != class287.aString3152) {
		int i_311_ = 0;
		if (class157 != null)
		    i_311_ = class157.method2471();
		Class175 class175 = Class222.aClass175_2338;
		Class7 class7 = Class263.aClass7_2800;
		if (1 == class287.anInt3149 * -436572411) {
		    class175 = Class29.aClass175_293;
		    class7 = Class500.aClass7_5560;
		}
		if (2 == -436572411 * class287.anInt3149) {
		    class175 = Class29.aClass175_294;
		    class7 = Class525_Sub24.aClass7_10595;
		}
		Class226.method4256(class259, class152, i, i_285_, i_286_,
				    i_287_, i_311_, class287.aString3152,
				    class175, class7,
				    -1507268529 * class287.anInt3153,
				    1028545668);
	    }
	}
    }
    
    static void method1860(Class182 class182, Class152 class152,
			   Class259 class259, int i, int i_312_, int i_313_,
			   int i_314_, int i_315_) {
	Class287 class287
	    = ((Class287)
	       Class698.aClass40_Sub2_8770.method76(i_315_, -2020101746));
	if (class287 != null && null != class287.anIntArray3174
	    && class287.method5234(Class532.aClass111_7170,
				   Class532.aClass111_7170, (byte) -52))
	    class287
		= class287.method5232(Class532.aClass111_7170,
				      Class532.aClass111_7170, -2100421665);
	if (null != class287 && class287.aBool3157
	    && class287.method5234(Class532.aClass111_7170,
				   Class532.aClass111_7170, (byte) -114)) {
	    if (class287.anIntArray3175 != null) {
		int[] is = new int[class287.anIntArray3175.length];
		for (int i_316_ = 0; i_316_ < is.length / 2; i_316_++) {
		    int i_317_;
		    if (Class700.anInt8779 * -174799205 == 5)
			i_317_ = ((int) ((double) Class453_Sub3
						      .aClass309_Sub1_10316
						      .method5491((byte) 0)
					 * 2607.5945876176133)
				  + client.anInt11059 * 223546583) & 0x3fff;
		    else if (Class700.anInt8779 * -174799205 == 2)
			i_317_ = (int) client.aFloat11052 & 0x3fff;
		    else
			i_317_ = (223546583 * client.anInt11059
				  + (int) client.aFloat11052) & 0x3fff;
		    int i_318_ = Class436.anIntArray4831[i_317_];
		    int i_319_ = Class436.anIntArray4838[i_317_];
		    if (2 != -174799205 * Class700.anInt8779) {
			i_318_ = 256 * i_318_ / (-198324601 * client.anInt11169
						 + 256);
			i_319_ = i_319_ * 256 / (-198324601 * client.anInt11169
						 + 256);
		    }
		    is[i_316_ * 2]
			= ((((i_313_ + class287.anIntArray3175[i_316_ * 2] * 4)
			     * i_319_)
			    + i_318_ * (i_314_ + (class287.anIntArray3175
						  [1 + 2 * i_316_]) * 4))
			   >> 14) + (i + -1694810043 * class259.anInt2602 / 2);
		    is[2 * i_316_ + 1]
			= (2054207119 * class259.anInt2598 / 2 + i_312_
			   - ((((i_314_
				 + 4 * class287.anIntArray3175[1 + 2 * i_316_])
				* i_319_)
			       - i_318_ * (i_313_
					   + 4 * (class287.anIntArray3175
						  [i_316_ * 2])))
			      >> 14));
		}
		Class246 class246 = class259.method4692(class182, -939489337);
		if (class246 != null)
		    Class167.method2681(class182, is,
					class287.anInt3183 * -2074779725,
					class246.anIntArray2429,
					class246.anIntArray2432);
		if (668357193 * class287.anInt3181 > 0) {
		    for (int i_320_ = 0; i_320_ < is.length / 2 - 1;
			 i_320_++) {
			int i_321_ = is[2 * i_320_];
			int i_322_ = is[1 + 2 * i_320_];
			int i_323_ = is[2 * (1 + i_320_)];
			int i_324_ = is[2 * (1 + i_320_) + 1];
			if (i_323_ < i_321_) {
			    int i_325_ = i_321_;
			    int i_326_ = i_322_;
			    i_321_ = i_323_;
			    i_322_ = i_324_;
			    i_323_ = i_325_;
			    i_324_ = i_326_;
			} else if (i_321_ == i_323_ && i_324_ < i_322_) {
			    int i_327_ = i_322_;
			    i_322_ = i_324_;
			    i_324_ = i_327_;
			}
			if (null != class152)
			    class182.method3204(i_321_, i_322_, i_323_, i_324_,
						(class287.anIntArray3165
						 [(class287.aByteArray3189
						   [i_320_]) & 0xff]),
						1, class152, i, i_312_,
						668357193 * class287.anInt3181,
						310583221 * class287.anInt3182,
						(-1258236733
						 * class287.anInt3162));
			else
			    class182.method3508
				(i_321_, i_322_, i_323_, i_324_,
				 (class287.anIntArray3165
				  [class287.aByteArray3189[i_320_] & 0xff]),
				 1, class287.anInt3181 * 668357193,
				 class287.anInt3182 * 310583221,
				 class287.anInt3162 * -1258236733);
		    }
		    int i_328_ = is[is.length - 2];
		    int i_329_ = is[is.length - 1];
		    int i_330_ = is[0];
		    int i_331_ = is[1];
		    if (i_330_ < i_328_) {
			int i_332_ = i_328_;
			int i_333_ = i_329_;
			i_328_ = i_330_;
			i_329_ = i_331_;
			i_330_ = i_332_;
			i_331_ = i_333_;
		    } else if (i_328_ == i_330_ && i_331_ < i_329_) {
			int i_334_ = i_329_;
			i_329_ = i_331_;
			i_331_ = i_334_;
		    }
		    if (class152 != null)
			class182.method3204(i_328_, i_329_, i_330_, i_331_,
					    (class287.anIntArray3165
					     [(class287.aByteArray3189
					       [(class287.aByteArray3189.length
						 - 1)]) & 0xff]),
					    1, class152, i, i_312_,
					    class287.anInt3181 * 668357193,
					    310583221 * class287.anInt3182,
					    class287.anInt3162 * -1258236733);
		    else
			class182.method3508(i_328_, i_329_, i_330_, i_331_,
					    (class287.anIntArray3165
					     [(class287.aByteArray3189
					       [(class287.aByteArray3189.length
						 - 1)]) & 0xff]),
					    1, 668357193 * class287.anInt3181,
					    class287.anInt3182 * 310583221,
					    class287.anInt3162 * -1258236733);
		} else if (null != class152) {
		    for (int i_335_ = 0; i_335_ < is.length / 2 - 1; i_335_++)
			class182.method3202(is[2 * i_335_], is[1 + i_335_ * 2],
					    is[(i_335_ + 1) * 2],
					    is[2 * (1 + i_335_) + 1],
					    (class287.anIntArray3165
					     [(class287.aByteArray3189[i_335_]
					       & 0xff)]),
					    1, class152, i, i_312_);
		    class182.method3202(is[is.length - 2], is[is.length - 1],
					is[0], is[1],
					(class287.anIntArray3165
					 [(class287.aByteArray3189
					   [(class287.aByteArray3189.length
					     - 1)]) & 0xff]),
					1, class152, i, i_312_);
		} else {
		    for (int i_336_ = 0; i_336_ < is.length / 2 - 1; i_336_++)
			class182.method3201(is[i_336_ * 2], is[1 + i_336_ * 2],
					    is[2 * (1 + i_336_)],
					    is[1 + 2 * (1 + i_336_)],
					    (class287.anIntArray3165
					     [(class287.aByteArray3189[i_336_]
					       & 0xff)]),
					    1);
		    class182.method3201(is[is.length - 2], is[is.length - 1],
					is[0], is[1],
					(class287.anIntArray3165
					 [(class287.aByteArray3189
					   [(class287.aByteArray3189.length
					     - 1)]) & 0xff]),
					1);
		}
	    }
	    Class157 class157 = null;
	    if (1564425333 * class287.anInt3150 != -1) {
		class157 = class287.method5235(class182, false, 430926630);
		if (null != class157) {
		    int i_337_
			= (-254785117 * class287.anInt3190 > 0
			   ? class287.anInt3190 * -254785117
			   : Class138.aClass631_1641.anInt8181 * 912141075);
		    Class322.method5728(class259, class152, i, i_312_, i_313_,
					i_314_, class157, (double) i_337_,
					class287.aClass275_3186,
					class287.aClass272_3161, 600753678);
		}
	    }
	    if (null != class287.aString3152) {
		int i_338_ = 0;
		if (class157 != null)
		    i_338_ = class157.method2471();
		Class175 class175 = Class222.aClass175_2338;
		Class7 class7 = Class263.aClass7_2800;
		if (1 == class287.anInt3149 * -436572411) {
		    class175 = Class29.aClass175_293;
		    class7 = Class500.aClass7_5560;
		}
		if (2 == -436572411 * class287.anInt3149) {
		    class175 = Class29.aClass175_294;
		    class7 = Class525_Sub24.aClass7_10595;
		}
		Class226.method4256(class259, class152, i, i_312_, i_313_,
				    i_314_, i_338_, class287.aString3152,
				    class175, class7,
				    -1507268529 * class287.anInt3153,
				    1905283702);
	    }
	}
    }
    
    static void method1861(Class259 class259, Class246 class246, int i,
			   int i_339_, int i_340_, int i_341_, int i_342_,
			   long l) {
	int i_343_ = i_341_ * i_341_ + i_340_ * i_340_;
	if ((long) i_343_ <= l) {
	    int i_344_;
	    if (5 == -174799205 * Class700.anInt8779)
		i_344_ = ((int) ((double) Class453_Sub3
					      .aClass309_Sub1_10316
					      .method5491((byte) 0)
				 * 2607.5945876176133)
			  + 223546583 * client.anInt11059) & 0x3fff;
	    else if (-174799205 * Class700.anInt8779 == 2)
		i_344_ = (int) client.aFloat11052 & 0x3fff;
	    else
		i_344_
		    = ((int) client.aFloat11052 + 223546583 * client.anInt11059
		       & 0x3fff);
	    int i_345_ = Class436.anIntArray4831[i_344_];
	    int i_346_ = Class436.anIntArray4838[i_344_];
	    if (2 != Class700.anInt8779 * -174799205) {
		i_345_ = i_345_ * 256 / (256 + -198324601 * client.anInt11169);
		i_346_ = i_346_ * 256 / (-198324601 * client.anInt11169 + 256);
	    }
	    int i_347_ = i_346_ * i_340_ + i_341_ * i_345_ >> 14;
	    int i_348_ = i_346_ * i_341_ - i_345_ * i_340_ >> 14;
	    Class157 class157 = Class308_Sub1.aClass157Array10143[i_342_];
	    int i_349_ = class157.method2503();
	    int i_350_ = class157.method2471();
	    int i_351_
		= class259.anInt2602 * -1694810043 / 2 + i_347_ - i_349_ / 2;
	    int i_352_ = i_351_ + i_349_;
	    int i_353_
		= -i_348_ + class259.anInt2598 * 2054207119 / 2 - i_350_;
	    int i_354_ = i_353_ + i_350_;
	    boolean bool;
	    if (null != class246)
		bool = (!class246.method4486(i_351_, i_353_, (byte) 59)
			|| !class246.method4486(i_352_, i_353_, (byte) 90)
			|| !class246.method4486(i_351_, i_354_, (byte) 83)
			|| !class246.method4486(i_352_, i_354_, (byte) 22));
	    else {
		int i_355_ = i_350_;
		int i_356_ = i_349_ / 2;
		bool
		    = (i_353_ <= -i_355_
		       || i_354_ >= 2054207119 * class259.anInt2598
		       || i_351_ <= -i_356_
		       || i_352_ >= -1694810043 * class259.anInt2602 + i_356_);
	    }
	    if (bool) {
		double d = Math.atan2((double) i_347_, (double) i_348_);
		double d_357_ = Math.atan2((double) Math.abs(i_347_),
					   (double) Math.abs(i_348_));
		double d_358_ = Math.atan2((double) (-1694810043
						     * class259.anInt2602 / 2),
					   (double) (class259.anInt2598
						     * 2054207119 / 2));
		boolean bool_359_ = false;
		double d_360_ = 0.0;
		int i_361_;
		if (d_357_ < d_358_) {
		    d_360_ = 1.5707963267948966 - d;
		    i_361_ = 2054207119 * class259.anInt2598 / 2;
		} else {
		    d_360_ = d;
		    i_361_ = -1694810043 * class259.anInt2602 / 2;
		}
		int i_362_ = Math.abs((int) -((double) i_361_
					      * Math.sin(1.5707963267948966)
					      / Math.sin(d_360_)));
		Class335.aClass157Array3628[i_342_].method2532
		    (0.0F + ((float) (class259.anInt2602 * -1694810043) / 2.0F
			     + (float) i),
		     ((float) i_339_
		      + (float) (class259.anInt2598 * 2054207119) / 2.0F
		      - 0.0F),
		     ((float) Class335.aClass157Array3628[i_342_].method12()
		      / 2.0F),
		     (float) i_362_, 4096,
		     (int) (-d / 6.283185307179586 * 65535.0));
	    } else if (class246 != null)
		class157.method2480(i + i_351_, i_353_ + i_339_,
				    class246.aClass152_2433, i, i_339_);
	    else
		class157.method2518(i_351_ + i, i_339_ + i_353_);
	}
    }
    
    static void method1862(Class259 class259, Class246 class246, int i,
			   int i_363_, int i_364_, int i_365_, int i_366_,
			   long l) {
	int i_367_ = i_365_ * i_365_ + i_364_ * i_364_;
	if ((long) i_367_ <= l) {
	    int i_368_;
	    if (5 == -174799205 * Class700.anInt8779)
		i_368_ = ((int) ((double) Class453_Sub3
					      .aClass309_Sub1_10316
					      .method5491((byte) 0)
				 * 2607.5945876176133)
			  + 223546583 * client.anInt11059) & 0x3fff;
	    else if (-174799205 * Class700.anInt8779 == 2)
		i_368_ = (int) client.aFloat11052 & 0x3fff;
	    else
		i_368_
		    = ((int) client.aFloat11052 + 223546583 * client.anInt11059
		       & 0x3fff);
	    int i_369_ = Class436.anIntArray4831[i_368_];
	    int i_370_ = Class436.anIntArray4838[i_368_];
	    if (2 != Class700.anInt8779 * -174799205) {
		i_369_ = i_369_ * 256 / (256 + -198324601 * client.anInt11169);
		i_370_ = i_370_ * 256 / (-198324601 * client.anInt11169 + 256);
	    }
	    int i_371_ = i_370_ * i_364_ + i_365_ * i_369_ >> 14;
	    int i_372_ = i_370_ * i_365_ - i_369_ * i_364_ >> 14;
	    Class157 class157 = Class308_Sub1.aClass157Array10143[i_366_];
	    int i_373_ = class157.method2503();
	    int i_374_ = class157.method2471();
	    int i_375_
		= class259.anInt2602 * -1694810043 / 2 + i_371_ - i_373_ / 2;
	    int i_376_ = i_375_ + i_373_;
	    int i_377_
		= -i_372_ + class259.anInt2598 * 2054207119 / 2 - i_374_;
	    int i_378_ = i_377_ + i_374_;
	    boolean bool;
	    if (null != class246)
		bool = (!class246.method4486(i_375_, i_377_, (byte) 49)
			|| !class246.method4486(i_376_, i_377_, (byte) 84)
			|| !class246.method4486(i_375_, i_378_, (byte) 27)
			|| !class246.method4486(i_376_, i_378_, (byte) 71));
	    else {
		int i_379_ = i_374_;
		int i_380_ = i_373_ / 2;
		bool
		    = (i_377_ <= -i_379_
		       || i_378_ >= 2054207119 * class259.anInt2598
		       || i_375_ <= -i_380_
		       || i_376_ >= -1694810043 * class259.anInt2602 + i_380_);
	    }
	    if (bool) {
		double d = Math.atan2((double) i_371_, (double) i_372_);
		double d_381_ = Math.atan2((double) Math.abs(i_371_),
					   (double) Math.abs(i_372_));
		double d_382_ = Math.atan2((double) (-1694810043
						     * class259.anInt2602 / 2),
					   (double) (class259.anInt2598
						     * 2054207119 / 2));
		boolean bool_383_ = false;
		double d_384_ = 0.0;
		int i_385_;
		if (d_381_ < d_382_) {
		    d_384_ = 1.5707963267948966 - d;
		    i_385_ = 2054207119 * class259.anInt2598 / 2;
		} else {
		    d_384_ = d;
		    i_385_ = -1694810043 * class259.anInt2602 / 2;
		}
		int i_386_ = Math.abs((int) -((double) i_385_
					      * Math.sin(1.5707963267948966)
					      / Math.sin(d_384_)));
		Class335.aClass157Array3628[i_366_].method2532
		    (0.0F + ((float) (class259.anInt2602 * -1694810043) / 2.0F
			     + (float) i),
		     ((float) i_363_
		      + (float) (class259.anInt2598 * 2054207119) / 2.0F
		      - 0.0F),
		     ((float) Class335.aClass157Array3628[i_366_].method12()
		      / 2.0F),
		     (float) i_386_, 4096,
		     (int) (-d / 6.283185307179586 * 65535.0));
	    } else if (class246 != null)
		class157.method2480(i + i_375_, i_377_ + i_363_,
				    class246.aClass152_2433, i, i_363_);
	    else
		class157.method2518(i_375_ + i, i_363_ + i_377_);
	}
    }
    
    static void method1863(Class182 class182, Class259 class259, int i,
			   int i_387_) {
	if (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705 != null) {
	    class182.method3218();
	    Class246 class246 = null;
	    Class152 class152 = null;
	    if (2010235789 * class259.anInt2590 == 5) {
		class246 = class259.method4692(class182, -1005109199);
		if (class246 == null)
		    return;
		class152 = class246.aClass152_2433;
		if ((-1694810043 * class259.anInt2602
		     != 757608145 * class246.anInt2431)
		    || (class246.anInt2430 * -2047032127
			!= class259.anInt2598 * 2054207119))
		    throw new IllegalStateException("");
	    }
	    class182.method3184(i, i_387_,
				i + -1694810043 * class259.anInt2602,
				class259.anInt2598 * 2054207119 + i_387_);
	    if (1806053763 * anInt1205 != 2 && 5 != 1806053763 * anInt1205
		&& null != Class311.aClass157_3472) {
		class182.method3181(anIntArray1193);
		class182.method3580();
		Class600 class600
		    = client.aClass507_11137.method8350(770290958);
		int i_388_;
		int i_389_;
		int i_390_;
		int i_391_;
		if (2 == -174799205 * Class700.anInt8779) {
		    i_388_ = client.anInt11174 * -914139697;
		    i_389_ = -2064193877 * client.anInt11112;
		    i_390_ = (int) -client.aFloat11052 & 0x3fff;
		    i_391_ = 4096;
		} else {
		    Class446 class446
			= (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
			       .method10818
			   ().aClass446_4807);
		    i_388_ = (int) class446.aFloat4895;
		    i_389_ = (int) class446.aFloat4897;
		    if (5 == -174799205 * Class700.anInt8779)
			i_390_ = ((int) -((double) Class453_Sub3
						       .aClass309_Sub1_10316
						       .method5491((byte) 0)
					  * 2607.5945876176133)
				  + 223546583 * client.anInt11059) & 0x3fff;
		    else
			i_390_ = ((int) -client.aFloat11052
				  + client.anInt11059 * 223546583) & 0x3fff;
		    i_391_ = 4096 - 1121773680 * client.anInt11169;
		}
		int i_392_ = i_388_ / 128 + 48;
		int i_393_
		    = (48 + client.aClass507_11137.method8352((byte) -97) * 4
		       - i_389_ / 128);
		if (class152 != null)
		    Class311.aClass157_3472.method2491
			(((float) (-1694810043 * class259.anInt2602) / 2.0F
			  + (float) i),
			 ((float) i_387_
			  + (float) (2054207119 * class259.anInt2598) / 2.0F),
			 (float) i_392_, (float) i_393_, i_391_, i_390_ << 2,
			 class152, i, i_387_);
		else
		    Class311.aClass157_3472.method2489
			(((float) i
			  + (float) (class259.anInt2602 * -1694810043) / 2.0F),
			 ((float) (class259.anInt2598 * 2054207119) / 2.0F
			  + (float) i_387_),
			 (float) i_392_, (float) i_393_, i_391_, i_390_ << 2,
			 1, -1, 1);
		Class529 class529
		    = client.aClass507_11137.method8345(-1744981500);
		for (Class525_Sub42 class525_sub42
			 = ((Class525_Sub42)
			    aClass709_1203.method14372((short) -3575));
		     class525_sub42 != null;
		     class525_sub42
			 = ((Class525_Sub42)
			    aClass709_1203.method14353(-1621193407))) {
		    int i_394_ = class525_sub42.anInt10858 * -1344652871;
		    int i_395_
			= ((class529.anIntArray7139[i_394_] >> 14 & 0x3fff)
			   - -1227002079 * class600.anInt7858);
		    int i_396_ = ((class529.anIntArray7139[i_394_] & 0x3fff)
				  - 1429253007 * class600.anInt7860);
		    int i_397_ = 2 + i_395_ * 4 - i_388_ / 128;
		    int i_398_ = i_396_ * 4 + 2 - i_389_ / 128;
		    Class413.method6689(class182, class152, class259, i,
					i_387_, i_397_, i_398_,
					class529.anIntArray7141[i_394_],
					491212854);
		}
		for (int i_399_ = 0; i_399_ < 1748507383 * anInt1195;
		     i_399_++) {
		    int i_400_ = 4 * anIntArray1194[i_399_] + 2 - i_388_ / 128;
		    int i_401_ = 2 + 4 * anIntArray1197[i_399_] - i_389_ / 128;
		    Class602 class602
			= ((Class602)
			   client.aClass507_11137.method8362((byte) -1)
			       .method76(anIntArray1191[i_399_], 317849517));
		    if (class602.anIntArray7923 != null) {
			class602 = class602.method9909(Class532.aClass111_7170,
						       Class532.aClass111_7170,
						       -1475221850);
			if (class602 == null
			    || 1813512349 * class602.anInt7918 == -1)
			    continue;
		    }
		    Class413.method6689(class182, class152, class259, i,
					i_387_, i_400_, i_401_,
					class602.anInt7918 * 1813512349,
					491212854);
		}
		for (Class525_Sub23 class525_sub23
			 = ((Class525_Sub23)
			    client.aClass10_11246.method689(2141782589));
		     class525_sub23 != null;
		     class525_sub23
			 = ((Class525_Sub23)
			    client.aClass10_11246.method690((byte) 37))) {
		    int i_402_ = (int) ((class525_sub23.aLong7113
					 * -5126207504388691097L) >> 28
					& 0x3L);
		    if (i_402_ == -2051547415 * anInt1199) {
			int i_403_ = ((int) ((-5126207504388691097L
					      * class525_sub23.aLong7113)
					     & 0x3fffL)
				      - -1227002079 * class600.anInt7858);
			int i_404_ = ((int) ((class525_sub23.aLong7113
					      * -5126207504388691097L) >> 14
					     & 0x3fffL)
				      - 1429253007 * class600.anInt7860);
			int i_405_ = i_403_ * 4 + 2 - i_388_ / 128;
			int i_406_ = i_404_ * 4 + 2 - i_389_ / 128;
			Class182.method3593(class259, class152, i, i_387_,
					    i_405_, i_406_,
					    Class66.aClass157Array716[0],
					    1971688272);
		    }
		}
		Class451.method7333(class182, i_388_, i_389_, class259,
				    class152, i, i_387_, 1444623892);
		Class519.method8659(i_388_, i_389_, class259, class152, i,
				    i_387_, (byte) 88);
		Class686.method14008(i_388_, i_389_, class259, class246, i,
				     i_387_, 1962955113);
		if (2 != -174799205 * Class700.anInt8779) {
		    if (-1 != anInt1200 * -183945107) {
			int i_407_
			    = (2 + -735780428 * anInt1200 - i_388_ / 128
			       + (Class581
				      .aClass656_Sub1_Sub3_Sub1_Sub1_7705
				      .method18608((byte) 24)
				  - 1) * 2);
			int i_408_
			    = (2 + 450486804 * anInt1201 - i_389_ / 128
			       + (Class581
				      .aClass656_Sub1_Sub3_Sub1_Sub1_7705
				      .method18608((byte) 31)
				  - 1) * 2);
			Class322.method5728
			    (class259, class152,
			     i - Class696_Sub13.anInt10911 * -770959357,
			     i_387_ - -1844218305 * Class525_Sub31.anInt10733,
			     i_407_, i_408_,
			     Class521.aClass157Array7093[aBool1202 ? 1 : 0],
			     100.0, Class275.aClass275_2864,
			     Class272.aClass272_2850, -1003162937);
		    }
		    if (!Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
			     .aClass627_12253.method10267((byte) 0))
			class182.method3190
			    (i + class259.anInt2602 * -1694810043 / 2 - 1,
			     i_387_ + class259.anInt2598 * 2054207119 / 2 - 1,
			     3, 3, -1, (byte) -1);
		}
		class182.method3277(anIntArray1193[0], anIntArray1193[1],
				    anIntArray1193[2], anIntArray1193[3]);
	    } else if (null != class152)
		class182.method3328(-16777216, class152, i, i_387_);
	}
    }
    
    static void method1864(Class259 class259, Class152 class152, int i,
			   int i_409_, int i_410_, int i_411_,
			   Class157 class157) {
	Class322.method5728(class259, class152, i, i_409_, i_410_, i_411_,
			    class157, 100.0, Class275.aClass275_2863,
			    Class272.aClass272_2846, -17959069);
    }
    
    static void method1865(Class182 class182, int i, int i_412_,
			   Class259 class259, Class152 class152, int i_413_,
			   int i_414_) {
	for (int i_415_ = 0; i_415_ < 1111866889 * client.anInt11216;
	     i_415_++) {
	    Class525_Sub19 class525_sub19
		= ((Class525_Sub19)
		   client.aClass10_11121
		       .method684((long) client.anIntArray11125[i_415_]));
	    if (class525_sub19 != null) {
		Class656_Sub1_Sub3_Sub1_Sub2 class656_sub1_sub3_sub1_sub2
		    = ((Class656_Sub1_Sub3_Sub1_Sub2)
		       class525_sub19.anObject10571);
		if (class656_sub1_sub3_sub1_sub2.method18954(754632318)
		    && (class656_sub1_sub3_sub1_sub2.aByte10867
			== (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
			    .aByte10867))) {
		    Class299 class299
			= class656_sub1_sub3_sub1_sub2.aClass299_12255;
		    if (class299 != null && null != class299.anIntArray3323)
			class299 = class299.method5386(Class532.aClass111_7170,
						       Class532.aClass111_7170,
						       2126628784);
		    if (class299 != null && class299.aBool3310
			&& class299.aBool3326) {
			Class446 class446
			    = (class656_sub1_sub3_sub1_sub2.method10818()
			       .aClass446_4807);
			int i_416_ = (int) class446.aFloat4895 / 128 - i / 128;
			int i_417_
			    = (int) class446.aFloat4897 / 128 - i_412_ / 128;
			if (-1 != class299.anInt3348 * 1552956859)
			    Class413.method6689(class182, class152, class259,
						i_413_, i_414_, i_416_, i_417_,
						(1552956859
						 * class299.anInt3348),
						491212854);
			else
			    Class182.method3593(class259, class152, i_413_,
						i_414_, i_416_, i_417_,
						Class66.aClass157Array716[1],
						487554259);
		    }
		}
	    }
	}
    }
    
    static void method1866(int i) {
	anInt1195 = 0;
	int i_418_ = client.aClass507_11137.method8412(272093128);
	int i_419_ = client.aClass507_11137.method8352((byte) -118);
	Class475 class475 = client.aClass507_11137.method8360(2106376196);
	Class546 class546 = client.aClass507_11137.method8358((byte) 4);
	Class40_Sub11 class40_sub11
	    = client.aClass507_11137.method8362((byte) -1);
	int i_420_ = i;
	if (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705 != null) {
	    int i_421_ = ((Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
			   .anIntArray12014[0])
			  >> 3);
	    int i_422_ = ((Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
			   .anIntArray12017[0])
			  >> 3);
	    if (i_421_ >= 0 && i_421_ < Class617.aBoolArrayArray8064.length
		&& i_422_ >= 0
		&& i_422_ < Class617.aBoolArrayArray8064[i_421_].length
		&& Class617.aBoolArrayArray8064[i_421_][i_422_])
		i_420_ = 0;
	}
	for (int i_423_ = 0; i_423_ < i_418_; i_423_++) {
	    for (int i_424_ = 0; i_424_ < i_419_; i_424_++) {
		for (int i_425_ = i_420_; i_425_ <= i + 1 && i_425_ <= 3;
		     i_425_++) {
		    if ((i_425_ < i
			 || class475.method7765(i, i_425_, i_423_, i_424_,
						-1242611341))
			&& !(Class673.method11091
			     ((Interface62) class546.method8974(i_425_, i_423_,
								i_424_,
								(byte) -62),
			      class40_sub11, i_423_, i_424_, (byte) 1))
			&& !(Class673.method11091
			     (((Interface62)
			       class546.method8972(i_425_, i_423_, i_424_,
						   client.anInterface63_11091,
						   332483378)),
			      class40_sub11, i_423_, i_424_, (byte) 1))
			&& !(Class673.method11091
			     ((Interface62) class546.method8968(i_425_, i_423_,
								i_424_,
								(byte) -53),
			      class40_sub11, i_423_, i_424_, (byte) 1))
			&& !(Class673.method11091
			     ((Interface62) class546.method8970(i_425_, i_423_,
								i_424_,
								(byte) 1),
			      class40_sub11, i_423_, i_424_, (byte) 1))) {
			/* empty */
		    }
		}
	    }
	}
    }
    
    static void method1867(Class259 class259, Class152 class152, int i,
			   int i_426_, int i_427_, int i_428_,
			   Class157 class157, double d, Class275 class275,
			   Class272 class272) {
	if (class157 != null) {
	    int i_429_;
	    if (-174799205 * Class700.anInt8779 == 5)
		i_429_ = ((int) ((double) Class453_Sub3
					      .aClass309_Sub1_10316
					      .method5491((byte) 0)
				 * 2607.5945876176133)
			  + client.anInt11059 * 223546583) & 0x3fff;
	    else if (2 == Class700.anInt8779 * -174799205)
		i_429_ = (int) client.aFloat11052 & 0x3fff;
	    else
		i_429_
		    = (client.anInt11059 * 223546583 + (int) client.aFloat11052
		       & 0x3fff);
	    int i_430_ = (Math.max(-1694810043 * class259.anInt2602 / 2,
				   2054207119 * class259.anInt2598 / 2)
			  + 10);
	    int i_431_ = i_428_ * i_428_ + i_427_ * i_427_;
	    if (i_431_ <= i_430_ * i_430_) {
		int i_432_ = Class436.anIntArray4831[i_429_];
		int i_433_ = Class436.anIntArray4838[i_429_];
		if (-174799205 * Class700.anInt8779 != 2) {
		    i_432_ = i_432_ * 256 / (client.anInt11169 * -198324601
					     + 256);
		    i_433_ = i_433_ * 256 / (256
					     + -198324601 * client.anInt11169);
		}
		int i_434_ = i_428_ * i_432_ + i_433_ * i_427_ >> 14;
		int i_435_ = i_433_ * i_428_ - i_432_ * i_427_ >> 14;
		double d_436_ = d / 100.0;
		switch (1165567667 * class275.anInt2866) {
		case 0:
		    i = i_434_ + (class259.anInt2602 * -1694810043 / 2 + i);
		    break;
		case 2:
		    i = (i_434_ + (i + class259.anInt2602 * -1694810043 / 2)
			 - (int) ((double) (class157.method12() / 2)
				  * d_436_));
		    break;
		case 1:
		    i = (i_434_ + (-1694810043 * class259.anInt2602 / 2 + i)
			 - (int) ((double) class157.method12() * d_436_));
		    break;
		}
		switch (1302320603 * class272.anInt2847) {
		case 1:
		    i_426_ = (i_426_ + class259.anInt2598 * 2054207119 / 2
			      - i_435_
			      - (int) ((double) (class157.method2472() / 2)
				       * d_436_));
		    break;
		case 2:
		    i_426_ = (i_426_ + 2054207119 * class259.anInt2598 / 2
			      - i_435_);
		    break;
		case 0:
		    i_426_
			= (i_426_ + class259.anInt2598 * 2054207119 / 2
			   - i_435_
			   - (int) ((double) class157.method2472() * d_436_));
		    break;
		}
		if (null != class152) {
		    if (1.0 == d_436_)
			class157.method2480(i, i_426_, class152, i, i_426_);
		    else
			class157.method2481(i, i_426_,
					    (int) ((double) class157.method12()
						   * d_436_),
					    (int) ((double) class157
								.method2472()
						   * d_436_));
		} else {
		    if (d_436_ == 1.0)
			class157.method2518(i, i_426_);
		    class157.method2481(i, i_426_,
					(int) ((double) class157.method12()
					       * d_436_),
					(int) ((double) class157.method2472()
					       * d_436_));
		}
	    }
	}
    }
    
    static void method1868(Class259 class259, Class152 class152, int i,
			   int i_437_, int i_438_, int i_439_, int i_440_,
			   String string, Class175 class175, Class7 class7,
			   int i_441_) {
	int i_442_;
	if (-174799205 * Class700.anInt8779 == 5)
	    i_442_ = ((int) ((double) Class453_Sub3.aClass309_Sub1_10316
					  .method5491((byte) 0)
			     * 2607.5945876176133)
		      + 223546583 * client.anInt11059) & 0x3fff;
	else if (-174799205 * Class700.anInt8779 == 2)
	    i_442_ = (int) client.aFloat11052 & 0x3fff;
	else
	    i_442_ = (223546583 * client.anInt11059 + (int) client.aFloat11052
		      & 0x3fff);
	int i_443_ = (Math.max(-1694810043 * class259.anInt2602 / 2,
			       2054207119 * class259.anInt2598 / 2)
		      + 10);
	int i_444_ = i_438_ * i_438_ + i_439_ * i_439_;
	if (i_444_ <= i_443_ * i_443_) {
	    int i_445_ = Class436.anIntArray4831[i_442_];
	    int i_446_ = Class436.anIntArray4838[i_442_];
	    if (2 != -174799205 * Class700.anInt8779) {
		i_445_ = 256 * i_445_ / (-198324601 * client.anInt11169 + 256);
		i_446_ = i_446_ * 256 / (-198324601 * client.anInt11169 + 256);
	    }
	    int i_447_ = i_438_ * i_446_ + i_439_ * i_445_ >> 14;
	    int i_448_ = i_446_ * i_439_ - i_445_ * i_438_ >> 14;
	    int i_449_ = class7.method566(string, 100, null, 805534933);
	    int i_450_ = class7.method594(string, 100, 0, null, -2140265492);
	    i_447_ -= i_449_ / 2;
	    if (i_447_ >= -(class259.anInt2602 * -1694810043)
		&& i_447_ <= class259.anInt2602 * -1694810043
		&& i_448_ >= -(2054207119 * class259.anInt2598)
		&& i_448_ <= class259.anInt2598 * 2054207119)
		class175.method2839(string,
				    (i_447_ + i
				     + class259.anInt2602 * -1694810043 / 2),
				    (2054207119 * class259.anInt2598 / 2
				     + i_437_ - i_448_ - i_440_ - i_450_),
				    i_449_, 50, i_441_, 0, 1, 0, 0, null, null,
				    class152, i, i_437_, -685625404);
	}
    }
    
    static void method1869(Class259 class259, Class152 class152, int i,
			   int i_451_, int i_452_, int i_453_, int i_454_,
			   String string, Class175 class175, Class7 class7,
			   int i_455_) {
	int i_456_;
	if (-174799205 * Class700.anInt8779 == 5)
	    i_456_ = ((int) ((double) Class453_Sub3.aClass309_Sub1_10316
					  .method5491((byte) 0)
			     * 2607.5945876176133)
		      + 223546583 * client.anInt11059) & 0x3fff;
	else if (-174799205 * Class700.anInt8779 == 2)
	    i_456_ = (int) client.aFloat11052 & 0x3fff;
	else
	    i_456_ = (223546583 * client.anInt11059 + (int) client.aFloat11052
		      & 0x3fff);
	int i_457_ = (Math.max(-1694810043 * class259.anInt2602 / 2,
			       2054207119 * class259.anInt2598 / 2)
		      + 10);
	int i_458_ = i_452_ * i_452_ + i_453_ * i_453_;
	if (i_458_ <= i_457_ * i_457_) {
	    int i_459_ = Class436.anIntArray4831[i_456_];
	    int i_460_ = Class436.anIntArray4838[i_456_];
	    if (2 != -174799205 * Class700.anInt8779) {
		i_459_ = 256 * i_459_ / (-198324601 * client.anInt11169 + 256);
		i_460_ = i_460_ * 256 / (-198324601 * client.anInt11169 + 256);
	    }
	    int i_461_ = i_452_ * i_460_ + i_453_ * i_459_ >> 14;
	    int i_462_ = i_460_ * i_453_ - i_459_ * i_452_ >> 14;
	    int i_463_ = class7.method566(string, 100, null, 805534933);
	    int i_464_ = class7.method594(string, 100, 0, null, -2130537441);
	    i_461_ -= i_463_ / 2;
	    if (i_461_ >= -(class259.anInt2602 * -1694810043)
		&& i_461_ <= class259.anInt2602 * -1694810043
		&& i_462_ >= -(2054207119 * class259.anInt2598)
		&& i_462_ <= class259.anInt2598 * 2054207119)
		class175.method2839(string,
				    (i_461_ + i
				     + class259.anInt2602 * -1694810043 / 2),
				    (2054207119 * class259.anInt2598 / 2
				     + i_451_ - i_462_ - i_454_ - i_464_),
				    i_463_, 50, i_455_, 0, 1, 0, 0, null, null,
				    class152, i, i_451_, -784954025);
	}
    }
    
    static void method1870(Class259 class259, Class152 class152, int i,
			   int i_465_, int i_466_, int i_467_,
			   Class157 class157) {
	Class322.method5728(class259, class152, i, i_465_, i_466_, i_467_,
			    class157, 100.0, Class275.aClass275_2863,
			    Class272.aClass272_2846, 306546865);
    }
    
    static boolean method1871(Interface62 interface62) {
	Class602 class602
	    = ((Class602)
	       client.aClass507_11137.method8362((byte) -1)
		   .method76(interface62.method406((byte) 1), 1398150357));
	if (class602.anInt7895 * 1280945471 == -1)
	    return true;
	Class79 class79
	    = ((Class79)
	       Class568.aClass40_Sub17_7627
		   .method76(class602.anInt7895 * 1280945471, -1551157343));
	if (-1 == 1911611899 * class79.anInt838)
	    return true;
	return class79.method1585(-965086101);
    }
    
    static void method1872(int i, int i_468_, boolean bool) {
	Class617.aBoolArrayArray8064[i][i_468_] = bool;
    }
    
    static Class525_Sub30 method1873(byte i) {
	Class42 class42 = null;
	Class525_Sub30 class525_sub30
	    = new Class525_Sub30(client.aClass668_11090, 0);
	try {
	    class42
		= Class182.method3594("", client.aClass668_11090.aString8579,
				      false, 1145873156);
	    byte[] is = new byte[(int) class42.method1048(-1832780082)];
	    int i_469_;
	    for (int i_470_ = 0; i_470_ < is.length; i_470_ += i_469_) {
		i_469_ = class42.method1049(is, i_470_, is.length - i_470_,
					    (byte) 109);
		if (i_469_ == -1)
		    throw new IOException();
	    }
	    class525_sub30 = new Class525_Sub30(new RSBuffer(is),
						client.aClass668_11090, 0);
	} catch (Exception exception) {
	    /* empty */
	}
	try {
	    if (null != class42)
		class42.method1047(6726016);
	} catch (Exception exception) {
	    /* empty */
	}
	return class525_sub30;
    }
    
    static final void method1874(Class683 class683, int i) {
	int i_471_ = (class683.anIntArray8661
		      [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_471_, -695254952);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = class259.anInt2613 * 1059112359;
    }
    
    static void method1875(int i, int i_472_, int i_473_, boolean bool,
			   int i_474_, boolean bool_475_, byte i_476_) {
	if (i < i_472_) {
	    int i_477_ = (i + i_472_) / 2;
	    int i_478_ = i;
	    Class603_Sub1 class603_sub1
		= Class15.aClass603_Sub1Array175[i_477_];
	    Class15.aClass603_Sub1Array175[i_477_]
		= Class15.aClass603_Sub1Array175[i_472_];
	    Class15.aClass603_Sub1Array175[i_472_] = class603_sub1;
	    for (int i_479_ = i; i_479_ < i_472_; i_479_++) {
		if (Class698.method14224((Class15.aClass603_Sub1Array175
					  [i_479_]),
					 class603_sub1, i_473_, bool, i_474_,
					 bool_475_, -798259000)
		    <= 0) {
		    Class603_Sub1 class603_sub1_480_
			= Class15.aClass603_Sub1Array175[i_479_];
		    Class15.aClass603_Sub1Array175[i_479_]
			= Class15.aClass603_Sub1Array175[i_478_];
		    Class15.aClass603_Sub1Array175[i_478_++]
			= class603_sub1_480_;
		}
	    }
	    Class15.aClass603_Sub1Array175[i_472_]
		= Class15.aClass603_Sub1Array175[i_478_];
	    Class15.aClass603_Sub1Array175[i_478_] = class603_sub1;
	    method1875(i, i_478_ - 1, i_473_, bool, i_474_, bool_475_,
		       (byte) 21);
	    method1875(i_478_ + 1, i_472_, i_473_, bool, i_474_, bool_475_,
		       (byte) 61);
	}
    }
    
    static final void method1876(Class683 class683, int i) {
	int i_481_ = (class683.anIntArray8661
		      [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_481_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_481_ >> 16];
	Class245.method4480(class259, class245, class683, (byte) 52);
    }
    
    static void method1877(int i) {
	anInt1205 = 0;
	anInt1200 = 1046245019;
	anInt1201 = 671956915;
    }
    
    static final void method1878(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class509.aClass569_5662.method9494((byte) 1) ? 1 : 0;
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class509.aClass569_5662.method9501(-1942848713) ? 1 : 0;
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class509.aClass569_5662.method9496(658631833) ? 1 : 0;
    }
}
