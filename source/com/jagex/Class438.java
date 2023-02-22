/* Class438 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaclib.ping.Ping;

public class Class438
{
    static Class26[] aClass26Array4853;
    static int anInt4854 = 0;
    static int anInt4855 = 0;
    
    Class438() throws Throwable {
	throw new Error();
    }
    
    public static void method7100() {
	anInt4854 = 0;
	anInt4855 = 0;
    }
    
    public static int method7101() {
	if (1128054897 * anInt4854 == 0) {
	    Class26.aClass26_247.method881(new Class434("jaclib"), (byte) 90);
	    if (Class26.aClass26_247.method879((short) -17302)
		    .method49(306870509)
		!= 100)
		return 1;
	    if (!((Class434) Class26.aClass26_247.method879((short) -4091))
		     .method6939((byte) 40)
		&& !Class612.method10051(-423367943)) {
		try {
		    Class327.aclient3575.method8299((byte) 0);
		    Class696_Sub43.method17360(-1032790391);
		    Ping.init();
		} catch (Exception_Sub2 exception_sub2) {
		    Class223.method4243(Class30.aClass30_298,
					exception_sub2.aString11419,
					exception_sub2.anInt11418 * 1113496469,
					exception_sub2.getCause(), (byte) 11);
		} catch (Throwable throwable) {
		    /* empty */
		}
	    }
	    anInt4854 = -544800623;
	}
	if (1 == anInt4854 * 1128054897) {
	    aClass26Array4853 = Class26.method885((byte) 5);
	    Class26.aClass26_270.method881(new Class432(Class18.aClass458_204),
					   (byte) 82);
	    Class26.aClass26_251.method881(new Class434("jaggl"), (byte) 74);
	    Class434 class434 = new Class434("jagdx");
	    if (!Class396.aString4106.startsWith("win"))
		class434.method6936(-1663540934);
	    Class26.aClass26_250.method881(class434, (byte) 17);
	    Class26.aClass26_263.method881(new Class434("sw3d"), (byte) 64);
	    Class26.aClass26_253.method881(new Class434("hw3d"), (byte) 93);
	    Class26.aClass26_252.method881(new Class434("RuneScape-Setup.exe",
							true),
					   (byte) 74);
	    Class26.aClass26_254.method881(new Class432(Class17_Sub1
							.aClass458_11027),
					   (byte) 71);
	    Class26.aClass26_255.method881(new Class432(Class40_Sub22
							.aClass458_11051),
					   (byte) 96);
	    Class26.aClass26_267
		.method881(new Class432(Class316.aClass458_3497), (byte) 126);
	    Class26.aClass26_257.method881(new Class432(Class27.aClass458_282),
					   (byte) 16);
	    Class26.aClass26_248
		.method881(new Class432(Class138.aClass458_1640), (byte) 120);
	    Class26.aClass26_259.method881(new Class432(Class47.aClass458_363),
					   (byte) 66);
	    Class26.aClass26_273.method881(new Class432(Class198_Sub2
							.aClass458_9905),
					   (byte) 125);
	    Class26.aClass26_261
		.method881(new Class432(Class297.aClass458_3274), (byte) 52);
	    Class26.aClass26_262
		.method881(new Class432(Class220.aClass458_2330), (byte) 27);
	    Class26.aClass26_258.method881(new Class432(Class350_Sub2
							.aClass458_10224),
					   (byte) 18);
	    Class26.aClass26_264
		.method881(new Class432(Class555.aClass458_7460), (byte) 89);
	    Class26.aClass26_266
		.method881(new Class432(Class174.aClass458_1862), (byte) 90);
	    Class26.aClass26_249
		.method881(new Class432(Class427.aClass458_4806), (byte) 18);
	    Class26.aClass26_265
		.method881(new Class432(BillBoardDefinitions.aClass458_5605), (byte) 26);
	    Class26.aClass26_268.method881(new Class432(Class198_Sub15
							.aClass458_9976),
					   (byte) 88);
	    Class26.aClass26_269.method881(new Class441((Class110
							 .aClass458_1370),
							"huffman"),
					   (byte) 111);
	    Class26.aClass26_256.method881(new Class432(Class175_Sub4
							.aClass458_9940),
					   (byte) 93);
	    Class26.aClass26_271
		.method881(new Class432(Class112.aClass458_1386), (byte) 124);
	    Class26.aClass26_272
		.method881(new Class432(Class276.aClass458_2875), (byte) 79);
	    Class26.aClass26_260
		.method881(new Class442(ItemDefinitions.aClass458_136, 0), (byte) 110);
	    for (int i = 0; i < aClass26Array4853.length; i++) {
		if (aClass26Array4853[i].method879((short) 4814) == null)
		    throw new RuntimeException();
	    }
	    int i = 0;
	    Class26[] class26s = aClass26Array4853;
	    for (int i_0_ = 0; i_0_ < class26s.length; i_0_++) {
		Class26 class26 = class26s[i_0_];
		int i_1_ = class26.method892(-1986816762);
		int i_2_
		    = class26.method879((short) -15398).method49(-1223917884);
		i += i_1_ * i_2_ / 100;
	    }
	    anInt4855 = 967294201 * i;
	    anInt4854 = -1089601246;
	}
	if (aClass26Array4853 == null)
	    return 100;
	int i = 0;
	int i_3_ = 0;
	boolean bool = true;
	Class26[] class26s = aClass26Array4853;
	for (int i_4_ = 0; i_4_ < class26s.length; i_4_++) {
	    Class26 class26 = class26s[i_4_];
	    int i_5_ = class26.method892(-1642296251);
	    int i_6_ = class26.method879((short) 7217).method49(-865406886);
	    if (i_6_ < 100)
		bool = false;
	    i += i_5_;
	    i_3_ += i_6_ * i_5_ / 100;
	}
	if (bool)
	    aClass26Array4853 = null;
	i_3_ -= -1642314423 * anInt4855;
	i -= anInt4855 * -1642314423;
	int i_7_ = i > 0 ? i_3_ * 100 / i : 100;
	if (!bool && i_7_ > 99)
	    i_7_ = 99;
	return i_7_;
    }
    
    public static int method7102() {
	if (1128054897 * anInt4854 == 0) {
	    Class26.aClass26_247.method881(new Class434("jaclib"), (byte) 98);
	    if (Class26.aClass26_247.method879((short) 9811)
		    .method49(-1839754906)
		!= 100)
		return 1;
	    if (!((Class434) Class26.aClass26_247.method879((short) -25777))
		     .method6939((byte) 100)
		&& !Class612.method10051(803172195)) {
		try {
		    Class327.aclient3575.method8299((byte) 0);
		    Class696_Sub43.method17360(-1103803268);
		    Ping.init();
		} catch (Exception_Sub2 exception_sub2) {
		    Class223.method4243(Class30.aClass30_298,
					exception_sub2.aString11419,
					exception_sub2.anInt11418 * 1113496469,
					exception_sub2.getCause(), (byte) -4);
		} catch (Throwable throwable) {
		    /* empty */
		}
	    }
	    anInt4854 = -544800623;
	}
	if (1 == anInt4854 * 1128054897) {
	    aClass26Array4853 = Class26.method885((byte) 5);
	    Class26.aClass26_270.method881(new Class432(Class18.aClass458_204),
					   (byte) 31);
	    Class26.aClass26_251.method881(new Class434("jaggl"), (byte) 95);
	    Class434 class434 = new Class434("jagdx");
	    if (!Class396.aString4106.startsWith("win"))
		class434.method6936(-1969853930);
	    Class26.aClass26_250.method881(class434, (byte) 53);
	    Class26.aClass26_263.method881(new Class434("sw3d"), (byte) 4);
	    Class26.aClass26_253.method881(new Class434("hw3d"), (byte) 123);
	    Class26.aClass26_252.method881(new Class434("RuneScape-Setup.exe",
							true),
					   (byte) 70);
	    Class26.aClass26_254.method881(new Class432(Class17_Sub1
							.aClass458_11027),
					   (byte) 51);
	    Class26.aClass26_255.method881(new Class432(Class40_Sub22
							.aClass458_11051),
					   (byte) 41);
	    Class26.aClass26_267
		.method881(new Class432(Class316.aClass458_3497), (byte) 73);
	    Class26.aClass26_257.method881(new Class432(Class27.aClass458_282),
					   (byte) 35);
	    Class26.aClass26_248
		.method881(new Class432(Class138.aClass458_1640), (byte) 52);
	    Class26.aClass26_259.method881(new Class432(Class47.aClass458_363),
					   (byte) 108);
	    Class26.aClass26_273.method881(new Class432(Class198_Sub2
							.aClass458_9905),
					   (byte) 55);
	    Class26.aClass26_261
		.method881(new Class432(Class297.aClass458_3274), (byte) 76);
	    Class26.aClass26_262
		.method881(new Class432(Class220.aClass458_2330), (byte) 75);
	    Class26.aClass26_258.method881(new Class432(Class350_Sub2
							.aClass458_10224),
					   (byte) 113);
	    Class26.aClass26_264
		.method881(new Class432(Class555.aClass458_7460), (byte) 103);
	    Class26.aClass26_266
		.method881(new Class432(Class174.aClass458_1862), (byte) 27);
	    Class26.aClass26_249
		.method881(new Class432(Class427.aClass458_4806), (byte) 24);
	    Class26.aClass26_265
		.method881(new Class432(BillBoardDefinitions.aClass458_5605), (byte) 65);
	    Class26.aClass26_268.method881(new Class432(Class198_Sub15
							.aClass458_9976),
					   (byte) 107);
	    Class26.aClass26_269.method881(new Class441((Class110
							 .aClass458_1370),
							"huffman"),
					   (byte) 7);
	    Class26.aClass26_256.method881(new Class432(Class175_Sub4
							.aClass458_9940),
					   (byte) 15);
	    Class26.aClass26_271
		.method881(new Class432(Class112.aClass458_1386), (byte) 2);
	    Class26.aClass26_272
		.method881(new Class432(Class276.aClass458_2875), (byte) 81);
	    Class26.aClass26_260
		.method881(new Class442(ItemDefinitions.aClass458_136, 0), (byte) 77);
	    for (int i = 0; i < aClass26Array4853.length; i++) {
		if (aClass26Array4853[i].method879((short) -3308) == null)
		    throw new RuntimeException();
	    }
	    int i = 0;
	    Class26[] class26s = aClass26Array4853;
	    for (int i_8_ = 0; i_8_ < class26s.length; i_8_++) {
		Class26 class26 = class26s[i_8_];
		int i_9_ = class26.method892(-1399448616);
		int i_10_
		    = class26.method879((short) 7686).method49(-2047352444);
		i += i_9_ * i_10_ / 100;
	    }
	    anInt4855 = 967294201 * i;
	    anInt4854 = -1089601246;
	}
	if (aClass26Array4853 == null)
	    return 100;
	int i = 0;
	int i_11_ = 0;
	boolean bool = true;
	Class26[] class26s = aClass26Array4853;
	for (int i_12_ = 0; i_12_ < class26s.length; i_12_++) {
	    Class26 class26 = class26s[i_12_];
	    int i_13_ = class26.method892(-1308432255);
	    int i_14_ = class26.method879((short) 13164).method49(-1188772682);
	    if (i_14_ < 100)
		bool = false;
	    i += i_13_;
	    i_11_ += i_14_ * i_13_ / 100;
	}
	if (bool)
	    aClass26Array4853 = null;
	i_11_ -= -1642314423 * anInt4855;
	i -= anInt4855 * -1642314423;
	int i_15_ = i > 0 ? i_11_ * 100 / i : 100;
	if (!bool && i_15_ > 99)
	    i_15_ = 99;
	return i_15_;
    }
    
    public static void method7103() {
	anInt4854 = 0;
	anInt4855 = 0;
    }
    
    public static int method7104() {
	if (1128054897 * anInt4854 == 0) {
	    Class26.aClass26_247.method881(new Class434("jaclib"), (byte) 97);
	    if (Class26.aClass26_247.method879((short) -24183)
		    .method49(-508579833)
		!= 100)
		return 1;
	    if (!((Class434) Class26.aClass26_247.method879((short) 5467))
		     .method6939((byte) 100)
		&& !Class612.method10051(1644909291)) {
		try {
		    Class327.aclient3575.method8299((byte) 0);
		    Class696_Sub43.method17360(280214685);
		    Ping.init();
		} catch (Exception_Sub2 exception_sub2) {
		    Class223.method4243(Class30.aClass30_298,
					exception_sub2.aString11419,
					exception_sub2.anInt11418 * 1113496469,
					exception_sub2.getCause(), (byte) -11);
		} catch (Throwable throwable) {
		    /* empty */
		}
	    }
	    anInt4854 = -544800623;
	}
	if (1 == anInt4854 * 1128054897) {
	    aClass26Array4853 = Class26.method885((byte) 5);
	    Class26.aClass26_270.method881(new Class432(Class18.aClass458_204),
					   (byte) 108);
	    Class26.aClass26_251.method881(new Class434("jaggl"), (byte) 27);
	    Class434 class434 = new Class434("jagdx");
	    if (!Class396.aString4106.startsWith("win"))
		class434.method6936(-1931478701);
	    Class26.aClass26_250.method881(class434, (byte) 66);
	    Class26.aClass26_263.method881(new Class434("sw3d"), (byte) 44);
	    Class26.aClass26_253.method881(new Class434("hw3d"), (byte) 64);
	    Class26.aClass26_252.method881(new Class434("RuneScape-Setup.exe",
							true),
					   (byte) 122);
	    Class26.aClass26_254.method881(new Class432(Class17_Sub1
							.aClass458_11027),
					   (byte) 81);
	    Class26.aClass26_255.method881(new Class432(Class40_Sub22
							.aClass458_11051),
					   (byte) 7);
	    Class26.aClass26_267
		.method881(new Class432(Class316.aClass458_3497), (byte) 110);
	    Class26.aClass26_257.method881(new Class432(Class27.aClass458_282),
					   (byte) 75);
	    Class26.aClass26_248
		.method881(new Class432(Class138.aClass458_1640), (byte) 3);
	    Class26.aClass26_259.method881(new Class432(Class47.aClass458_363),
					   (byte) 57);
	    Class26.aClass26_273.method881(new Class432(Class198_Sub2
							.aClass458_9905),
					   (byte) 75);
	    Class26.aClass26_261
		.method881(new Class432(Class297.aClass458_3274), (byte) 86);
	    Class26.aClass26_262
		.method881(new Class432(Class220.aClass458_2330), (byte) 44);
	    Class26.aClass26_258.method881(new Class432(Class350_Sub2
							.aClass458_10224),
					   (byte) 74);
	    Class26.aClass26_264
		.method881(new Class432(Class555.aClass458_7460), (byte) 105);
	    Class26.aClass26_266
		.method881(new Class432(Class174.aClass458_1862), (byte) 53);
	    Class26.aClass26_249
		.method881(new Class432(Class427.aClass458_4806), (byte) 54);
	    Class26.aClass26_265
		.method881(new Class432(BillBoardDefinitions.aClass458_5605), (byte) 54);
	    Class26.aClass26_268.method881(new Class432(Class198_Sub15
							.aClass458_9976),
					   (byte) 10);
	    Class26.aClass26_269.method881(new Class441((Class110
							 .aClass458_1370),
							"huffman"),
					   (byte) 64);
	    Class26.aClass26_256.method881(new Class432(Class175_Sub4
							.aClass458_9940),
					   (byte) 35);
	    Class26.aClass26_271
		.method881(new Class432(Class112.aClass458_1386), (byte) 83);
	    Class26.aClass26_272
		.method881(new Class432(Class276.aClass458_2875), (byte) 24);
	    Class26.aClass26_260
		.method881(new Class442(ItemDefinitions.aClass458_136, 0), (byte) 77);
	    for (int i = 0; i < aClass26Array4853.length; i++) {
		if (aClass26Array4853[i].method879((short) 17318) == null)
		    throw new RuntimeException();
	    }
	    int i = 0;
	    Class26[] class26s = aClass26Array4853;
	    for (int i_16_ = 0; i_16_ < class26s.length; i_16_++) {
		Class26 class26 = class26s[i_16_];
		int i_17_ = class26.method892(-2115423989);
		int i_18_
		    = class26.method879((short) 6653).method49(-1133142078);
		i += i_17_ * i_18_ / 100;
	    }
	    anInt4855 = 967294201 * i;
	    anInt4854 = -1089601246;
	}
	if (aClass26Array4853 == null)
	    return 100;
	int i = 0;
	int i_19_ = 0;
	boolean bool = true;
	Class26[] class26s = aClass26Array4853;
	for (int i_20_ = 0; i_20_ < class26s.length; i_20_++) {
	    Class26 class26 = class26s[i_20_];
	    int i_21_ = class26.method892(-1801285406);
	    int i_22_ = class26.method879((short) -3894).method49(-1849032194);
	    if (i_22_ < 100)
		bool = false;
	    i += i_21_;
	    i_19_ += i_22_ * i_21_ / 100;
	}
	if (bool)
	    aClass26Array4853 = null;
	i_19_ -= -1642314423 * anInt4855;
	i -= anInt4855 * -1642314423;
	int i_23_ = i > 0 ? i_19_ * 100 / i : 100;
	if (!bool && i_23_ > 99)
	    i_23_ = 99;
	return i_23_;
    }
    
    public static int method7105() {
	if (1128054897 * anInt4854 == 0) {
	    Class26.aClass26_247.method881(new Class434("jaclib"), (byte) 54);
	    if (Class26.aClass26_247.method879((short) -7041)
		    .method49(440515420)
		!= 100)
		return 1;
	    if (!((Class434) Class26.aClass26_247.method879((short) -1458))
		     .method6939((byte) 53)
		&& !Class612.method10051(-1307263024)) {
		try {
		    Class327.aclient3575.method8299((byte) 0);
		    Class696_Sub43.method17360(-1422954078);
		    Ping.init();
		} catch (Exception_Sub2 exception_sub2) {
		    Class223.method4243(Class30.aClass30_298,
					exception_sub2.aString11419,
					exception_sub2.anInt11418 * 1113496469,
					exception_sub2.getCause(), (byte) -45);
		} catch (Throwable throwable) {
		    /* empty */
		}
	    }
	    anInt4854 = -544800623;
	}
	if (1 == anInt4854 * 1128054897) {
	    aClass26Array4853 = Class26.method885((byte) 5);
	    Class26.aClass26_270.method881(new Class432(Class18.aClass458_204),
					   (byte) 104);
	    Class26.aClass26_251.method881(new Class434("jaggl"), (byte) 90);
	    Class434 class434 = new Class434("jagdx");
	    if (!Class396.aString4106.startsWith("win"))
		class434.method6936(-1785494115);
	    Class26.aClass26_250.method881(class434, (byte) 49);
	    Class26.aClass26_263.method881(new Class434("sw3d"), (byte) 111);
	    Class26.aClass26_253.method881(new Class434("hw3d"), (byte) 63);
	    Class26.aClass26_252.method881(new Class434("RuneScape-Setup.exe",
							true),
					   (byte) 73);
	    Class26.aClass26_254.method881(new Class432(Class17_Sub1
							.aClass458_11027),
					   (byte) 122);
	    Class26.aClass26_255.method881(new Class432(Class40_Sub22
							.aClass458_11051),
					   (byte) 87);
	    Class26.aClass26_267
		.method881(new Class432(Class316.aClass458_3497), (byte) 54);
	    Class26.aClass26_257.method881(new Class432(Class27.aClass458_282),
					   (byte) 83);
	    Class26.aClass26_248
		.method881(new Class432(Class138.aClass458_1640), (byte) 90);
	    Class26.aClass26_259.method881(new Class432(Class47.aClass458_363),
					   (byte) 124);
	    Class26.aClass26_273.method881(new Class432(Class198_Sub2
							.aClass458_9905),
					   (byte) 48);
	    Class26.aClass26_261
		.method881(new Class432(Class297.aClass458_3274), (byte) 100);
	    Class26.aClass26_262
		.method881(new Class432(Class220.aClass458_2330), (byte) 60);
	    Class26.aClass26_258.method881(new Class432(Class350_Sub2
							.aClass458_10224),
					   (byte) 127);
	    Class26.aClass26_264
		.method881(new Class432(Class555.aClass458_7460), (byte) 9);
	    Class26.aClass26_266
		.method881(new Class432(Class174.aClass458_1862), (byte) 20);
	    Class26.aClass26_249
		.method881(new Class432(Class427.aClass458_4806), (byte) 90);
	    Class26.aClass26_265
		.method881(new Class432(BillBoardDefinitions.aClass458_5605), (byte) 64);
	    Class26.aClass26_268.method881(new Class432(Class198_Sub15
							.aClass458_9976),
					   (byte) 119);
	    Class26.aClass26_269.method881(new Class441((Class110
							 .aClass458_1370),
							"huffman"),
					   (byte) 108);
	    Class26.aClass26_256.method881(new Class432(Class175_Sub4
							.aClass458_9940),
					   (byte) 113);
	    Class26.aClass26_271
		.method881(new Class432(Class112.aClass458_1386), (byte) 102);
	    Class26.aClass26_272
		.method881(new Class432(Class276.aClass458_2875), (byte) 63);
	    Class26.aClass26_260
		.method881(new Class442(ItemDefinitions.aClass458_136, 0), (byte) 43);
	    for (int i = 0; i < aClass26Array4853.length; i++) {
		if (aClass26Array4853[i].method879((short) -2721) == null)
		    throw new RuntimeException();
	    }
	    int i = 0;
	    Class26[] class26s = aClass26Array4853;
	    for (int i_24_ = 0; i_24_ < class26s.length; i_24_++) {
		Class26 class26 = class26s[i_24_];
		int i_25_ = class26.method892(-1745634501);
		int i_26_
		    = class26.method879((short) -10346).method49(-923885489);
		i += i_25_ * i_26_ / 100;
	    }
	    anInt4855 = 967294201 * i;
	    anInt4854 = -1089601246;
	}
	if (aClass26Array4853 == null)
	    return 100;
	int i = 0;
	int i_27_ = 0;
	boolean bool = true;
	Class26[] class26s = aClass26Array4853;
	for (int i_28_ = 0; i_28_ < class26s.length; i_28_++) {
	    Class26 class26 = class26s[i_28_];
	    int i_29_ = class26.method892(-2132893710);
	    int i_30_ = class26.method879((short) -25455).method49(364334604);
	    if (i_30_ < 100)
		bool = false;
	    i += i_29_;
	    i_27_ += i_30_ * i_29_ / 100;
	}
	if (bool)
	    aClass26Array4853 = null;
	i_27_ -= -1642314423 * anInt4855;
	i -= anInt4855 * -1642314423;
	int i_31_ = i > 0 ? i_27_ * 100 / i : 100;
	if (!bool && i_31_ > 99)
	    i_31_ = 99;
	return i_31_;
    }
    
    public static void method7106() {
	anInt4854 = 0;
	anInt4855 = 0;
    }
    
    static final void method7107(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = 0;
    }
    
    static final void method7108(Class683 class683, int i) {
	int i_32_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = (((ItemDefinitions)
		Class313_Sub2.aClass40_Sub22_10106.method76(i_32_, 340508412))
	       .anInt72) * 1597162009;
    }
    
    public static void method7109(int i, int i_33_, int i_34_, int i_35_) {
	i <<= 3;
	i_33_ <<= 3;
	i_34_ <<= 3;
	if (5 == -174799205 * Class700.anInt8779) {
	    if (Class453_Sub3.aClass309_Sub1_10316.method5485(959415873)
		== Class289.aClass289_3202) {
		Class350_Sub1 class350_sub1
		    = (Class350_Sub1) Class453_Sub3.aClass309_Sub1_10316
					  .method5481(-1352913608);
		Class429 class429 = new Class429();
		Class429 class429_36_ = new Class429();
		class429.method6811(0.0F, 1.0F, 0.0F,
				    (3.1415927F
				     - (float) (2.0
						* ((double) i_33_
						   * 3.141592653589793)
						/ 16384.0)));
		Class446 class446 = new Class446(1.0F, 0.0F, 0.0F);
		class446.method7239(class429);
		class446.method7219();
		class429_36_.method6810(class446,
					(float) ((double) i * 3.141592653589793
						 * 2.0) / 16384.0F);
		class429.method6822(class429_36_);
		class350_sub1.aClass429_10201.method6809(class429);
	    }
	} else {
	    client.aFloat11176 = (float) i;
	    client.aFloat11052 = (float) i_33_;
	    if (Class700.anInt8779 * -174799205 == 3) {
		Class689_Sub1.anInt11019 = i * 784259773;
		Class64.anInt695 = -1054956469 * i_33_;
		ItemDefinitions.anInt137 = i_34_ * 786225157;
	    }
	    Class76.method1559(746347971);
	}
	client.aBool11364 = true;
    }
}
