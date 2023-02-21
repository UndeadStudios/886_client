/* Class313 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Graphics;

import jaclib.ping.Ping;

public abstract class Class313
{
    Class292 this$0;
    int anInt3482;
    int anInt3483;
    
    abstract void method5641(Graphics graphics, int i);
    
    Class313(Class292 class292, int i, int i_0_) {
	this$0 = class292;
	anInt3483 = 458266635 * i;
	anInt3482 = i_0_ * 376374581;
    }
    
    abstract void method5642(Graphics graphics);
    
    public static int method5643(int i) {
	if (1128054897 * Class438.anInt4854 == 0) {
	    Class26.aClass26_247.method881(new Class434("jaclib"), (byte) 30);
	    if (Class26.aClass26_247.method879((short) 7564)
		    .method49(-13569958)
		!= 100)
		return 1;
	    if (!((Class434) Class26.aClass26_247.method879((short) -110))
		     .method6939((byte) 118)
		&& !Class612.method10051(-1583604962)) {
		try {
		    Class327.aclient3575.method8299((byte) 0);
		    Class696_Sub43.method17360(-2052334401);
		    Ping.init();
		} catch (Exception_Sub2 exception_sub2) {
		    Class223.method4243(Class30.aClass30_298,
					exception_sub2.aString11419,
					exception_sub2.anInt11418 * 1113496469,
					exception_sub2.getCause(), (byte) -97);
		} catch (Throwable throwable) {
		    /* empty */
		}
	    }
	    Class438.anInt4854 = -544800623;
	}
	if (1 == Class438.anInt4854 * 1128054897) {
	    Class438.aClass26Array4853 = Class26.method885((byte) 5);
	    Class26.aClass26_270.method881(new Class432(Class18.aClass458_204),
					   (byte) 75);
	    Class26.aClass26_251.method881(new Class434("jaggl"), (byte) 57);
	    Class434 class434 = new Class434("jagdx");
	    if (!Class396.aString4106.startsWith("win"))
		class434.method6936(-2146168211);
	    Class26.aClass26_250.method881(class434, (byte) 47);
	    Class26.aClass26_263.method881(new Class434("sw3d"), (byte) 44);
	    Class26.aClass26_253.method881(new Class434("hw3d"), (byte) 123);
	    Class26.aClass26_252.method881(new Class434("RuneScape-Setup.exe",
							true),
					   (byte) 103);
	    Class26.aClass26_254.method881(new Class432(Class17_Sub1
							.aClass458_11027),
					   (byte) 40);
	    Class26.aClass26_255.method881(new Class432(Class40_Sub22
							.aClass458_11051),
					   (byte) 42);
	    Class26.aClass26_267
		.method881(new Class432(Class316.aClass458_3497), (byte) 111);
	    Class26.aClass26_257.method881(new Class432(Class27.aClass458_282),
					   (byte) 23);
	    Class26.aClass26_248
		.method881(new Class432(Class138.aClass458_1640), (byte) 72);
	    Class26.aClass26_259.method881(new Class432(Class47.aClass458_363),
					   (byte) 4);
	    Class26.aClass26_273.method881(new Class432(Class198_Sub2
							.aClass458_9905),
					   (byte) 9);
	    Class26.aClass26_261
		.method881(new Class432(Class297.aClass458_3274), (byte) 20);
	    Class26.aClass26_262
		.method881(new Class432(Class220.aClass458_2330), (byte) 105);
	    Class26.aClass26_258.method881(new Class432(Class350_Sub2
							.aClass458_10224),
					   (byte) 47);
	    Class26.aClass26_264
		.method881(new Class432(Class555.aClass458_7460), (byte) 29);
	    Class26.aClass26_266
		.method881(new Class432(Class174.aClass458_1862), (byte) 62);
	    Class26.aClass26_249
		.method881(new Class432(Class427.aClass458_4806), (byte) 55);
	    Class26.aClass26_265
		.method881(new Class432(Class504.aClass458_5605), (byte) 34);
	    Class26.aClass26_268.method881(new Class432(Class198_Sub15
							.aClass458_9976),
					   (byte) 82);
	    Class26.aClass26_269.method881(new Class441((Class110
							 .aClass458_1370),
							"huffman"),
					   (byte) 125);
	    Class26.aClass26_256.method881(new Class432(Class175_Sub4
							.aClass458_9940),
					   (byte) 29);
	    Class26.aClass26_271
		.method881(new Class432(Class112.aClass458_1386), (byte) 26);
	    Class26.aClass26_272
		.method881(new Class432(Class276.aClass458_2875), (byte) 106);
	    Class26.aClass26_260
		.method881(new Class442(Class8.aClass458_136, 0), (byte) 18);
	    for (int i_1_ = 0; i_1_ < Class438.aClass26Array4853.length;
		 i_1_++) {
		if (Class438.aClass26Array4853[i_1_].method879((short) -13105)
		    == null)
		    throw new RuntimeException();
	    }
	    int i_2_ = 0;
	    Class26[] class26s = Class438.aClass26Array4853;
	    for (int i_3_ = 0; i_3_ < class26s.length; i_3_++) {
		Class26 class26 = class26s[i_3_];
		int i_4_ = class26.method892(-1362956894);
		int i_5_
		    = class26.method879((short) -4708).method49(782062844);
		i_2_ += i_4_ * i_5_ / 100;
	    }
	    Class438.anInt4855 = 967294201 * i_2_;
	    Class438.anInt4854 = -1089601246;
	}
	if (Class438.aClass26Array4853 == null)
	    return 100;
	int i_6_ = 0;
	int i_7_ = 0;
	boolean bool = true;
	Class26[] class26s = Class438.aClass26Array4853;
	for (int i_8_ = 0; i_8_ < class26s.length; i_8_++) {
	    Class26 class26 = class26s[i_8_];
	    int i_9_ = class26.method892(-1702121669);
	    int i_10_ = class26.method879((short) 27055).method49(318269264);
	    if (i_10_ < 100)
		bool = false;
	    i_6_ += i_9_;
	    i_7_ += i_10_ * i_9_ / 100;
	}
	if (bool)
	    Class438.aClass26Array4853 = null;
	i_7_ -= -1642314423 * Class438.anInt4855;
	i_6_ -= Class438.anInt4855 * -1642314423;
	int i_11_ = i_6_ > 0 ? i_7_ * 100 / i_6_ : 100;
	if (!bool && i_11_ > 99)
	    i_11_ = 99;
	return i_11_;
    }
    
    static boolean method5644(String string, int i, int i_12_) {
	return Class413.method6685(string, i, "openjs", (byte) 126);
    }
    
    static final void method5645(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class396.method6535(class259, class683, -1927748470);
    }
    
    static final void method5646(Class683 class683, int i) {
	class683.anInt8662 -= 362986067;
	int i_13_ = class683.anIntArray8661[class683.anInt8662 * 501271953];
	int i_14_
	    = class683.anIntArray8661[1 + 501271953 * class683.anInt8662];
	int i_15_
	    = class683.anIntArray8661[501271953 * class683.anInt8662 + 2];
	if (i_14_ == -1)
	    throw new RuntimeException();
	Class65 class65 = (Class65) Class525_Sub22.aClass40_Sub15_10585
					.method76(i_14_, 1482415365);
	if (class65.aClass495_698.method80() != i_13_)
	    throw new RuntimeException();
	int[] is = class65.method1413(Integer.valueOf(i_15_), -153268266);
	int i_16_ = 0;
	if (null != is)
	    i_16_ = is.length;
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = i_16_;
    }
}
