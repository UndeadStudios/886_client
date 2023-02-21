/* Class175_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class175_Sub1 extends Class175
{
    int[] anIntArray8990;
    Class182_Sub2 aClass182_Sub2_8991;
    Class157[] aClass157Array8992;
    Class157[] aClass157Array8993;
    int[] anIntArray8994;
    int[] anIntArray8995;
    int[] anIntArray8996;
    
    void method2874(char c, int i, int i_0_, int i_1_, boolean bool) {
	if (null != aClass182_Sub2_8991.anIntArray9466) {
	    i += anIntArray8996[c];
	    i_0_ += anIntArray8995[c];
	    if (bool)
		aClass157Array8993[c].method2479(i, i_0_, 1, i_1_, 1);
	    else
		aClass157Array8992[c].method2479(i, i_0_, 1, i_1_, 1);
	}
    }
    
    Class175_Sub1(Class182_Sub2 class182_sub2, Class7 class7,
		  Class173_Sub1[] class173_sub1s, int[] is, int[] is_2_) {
	super(class182_sub2, class7);
	aClass182_Sub2_8991 = class182_sub2;
	aClass182_Sub2_8991 = class182_sub2;
	anIntArray8990 = is;
	anIntArray8994 = is_2_;
	aClass157Array8992 = new Class157[class173_sub1s.length];
	aClass157Array8993 = new Class157[class173_sub1s.length];
	anIntArray8995 = new int[class173_sub1s.length];
	anIntArray8996 = new int[class173_sub1s.length];
	for (int i = 0; i < class173_sub1s.length; i++) {
	    aClass157Array8992[i]
		= aClass182_Sub2_8991.method3216(class173_sub1s[i], false);
	    int[] is_3_ = (int[]) class173_sub1s[i].method2778(false).clone();
	    for (int i_4_ = 0; i_4_ < is_3_.length; i_4_++) {
		int i_5_ = is_3_[i_4_];
		int i_6_ = (byte) (((i_5_ >> 8 & 0xff) * 4
				    + (i_5_ >> 16 & 0xff) * 3 + (i_5_ & 0xff))
				   >> 3);
		is_3_[i_4_]
		    = is_3_[i_4_] & ~0xffffff | i_6_ << 16 | i_6_ << 8 | i_6_;
	    }
	    aClass157Array8993[i]
		= aClass182_Sub2_8991.method3214(is_3_, 0, anIntArray8990[i],
						 anIntArray8990[i],
						 anIntArray8994[i], false);
	    anIntArray8995[i] = class173_sub1s[i].method2768();
	    anIntArray8996[i] = class173_sub1s[i].method2766();
	}
    }
    
    void method2853(char c, int i, int i_7_, int i_8_, boolean bool) {
	if (null != aClass182_Sub2_8991.anIntArray9466) {
	    i += anIntArray8996[c];
	    i_7_ += anIntArray8995[c];
	    if (bool)
		aClass157Array8993[c].method2479(i, i_7_, 1, i_8_, 1);
	    else
		aClass157Array8992[c].method2479(i, i_7_, 1, i_8_, 1);
	}
    }
    
    void method2854(char c, int i, int i_9_, int i_10_, boolean bool) {
	if (null != aClass182_Sub2_8991.anIntArray9466) {
	    i += anIntArray8996[c];
	    i_9_ += anIntArray8995[c];
	    if (bool)
		aClass157Array8993[c].method2479(i, i_9_, 1, i_10_, 1);
	    else
		aClass157Array8992[c].method2479(i, i_9_, 1, i_10_, 1);
	}
    }
    
    void method2868(char c, int i, int i_11_, int i_12_, boolean bool,
		    Class152 class152, int i_13_, int i_14_) {
	/* empty */
    }
    
    void method2856(char c, int i, int i_15_, int i_16_, boolean bool) {
	if (null != aClass182_Sub2_8991.anIntArray9466) {
	    i += anIntArray8996[c];
	    i_15_ += anIntArray8995[c];
	    if (bool)
		aClass157Array8993[c].method2479(i, i_15_, 1, i_16_, 1);
	    else
		aClass157Array8992[c].method2479(i, i_15_, 1, i_16_, 1);
	}
    }
    
    void method2857(char c, int i, int i_17_, int i_18_, boolean bool,
		    Class152 class152, int i_19_, int i_20_) {
	/* empty */
    }
    
    void method2858(char c, int i, int i_21_, int i_22_, boolean bool,
		    Class152 class152, int i_23_, int i_24_) {
	/* empty */
    }
    
    void method2835(char c, int i, int i_25_, int i_26_, boolean bool,
		    Class152 class152, int i_27_, int i_28_) {
	/* empty */
    }
    
    void method2860(char c, int i, int i_29_, int i_30_, boolean bool,
		    Class152 class152, int i_31_, int i_32_) {
	/* empty */
    }
    
    static void method14530(byte i) {
	client.anInt11274 = 0;
	client.anInt11294 = 0;
	client.anInt11296 = 0;
	client.anInt11158 = 0;
	client.anInt11300 = 0;
	client.anInt11255 = 0;
	client.anInt11153 = 0;
	client.anInt11304 = 0;
	client.anInt11339 = 0;
	client.anInt11056 = 0;
	client.anInt11108 = 0;
	client.anInt11308 = 0;
	client.anInt11309 = 0;
	client.anInt11310 = 0;
	client.anInt11311 = 0;
    }
    
    static final void method14531(Class683 class683, int i) {
	Class40_Sub20.aClass217_11050.method4053((class683.anIntArray8661
						  [((class683.anInt8662
						     -= 1552651121)
						    * 501271953)]),
						 -1006912780);
    }
    
    static void method14532(Class182 class182, int i) {
	if ((-628070459 * Class61.anInt658 >= 2 || client.aBool11358)
	    && null == client.aClass259_11271) {
	    String string;
	    if (client.aBool11358 && -628070459 * Class61.anInt658 < 2)
		string
		    = new StringBuilder().append(client.aString11258).append
			  (Class53.aClass53_520
			       .method1169(Class21.aClass666_213, 1552651121))
			  .append
			  (client.aString11117).append
			  (" ").append
			  (Class55.aString564).toString();
	    else if (Class682.method11225((byte) -114)
		     && Class61.anInt658 * -628070459 > 2)
		string
		    = Class335.method5851(Class307.aClass525_Sub16_Sub16_3418,
					  2070925161);
	    else {
		Class525_Sub16_Sub16 class525_sub16_sub16
		    = Class307.aClass525_Sub16_Sub16_3418;
		if (class525_sub16_sub16 == null)
		    return;
		string = Class335.method5851(class525_sub16_sub16, 2144158336);
		int[] is
		    = Class220.method4207(class525_sub16_sub16, -1613125466);
		if (null != is)
		    string
			= new StringBuilder().append(string).append
			      (Class91.method1699(is, -1517274269)).toString();
	    }
	    if (-628070459 * Class61.anInt658 > 2)
		string
		    = new StringBuilder().append(string).append
			  (Class493.method8001(16777215, 1797157523)).append
			  (" / ").append
			  (-628070459 * Class61.anInt658 - 2).append
			  (Class53.aClass53_512
			       .method1169(Class21.aClass666_213, 1552651121))
			  .toString();
	    if (Class61.aClass259_666 != null) {
		Class175 class175
		    = Class61.aClass259_666.method4682(Class7.aClass404_53,
						       (client
							.anInterface50_11252),
						       -1191920700);
		if (class175 == null)
		    class175 = Class29.aClass175_294;
		class175.method2845
		    (string, Class61.anInt679 * 988443395,
		     Class61.anInt690 * -254828299,
		     Class61.aClass259_666.anInt2602 * -1694810043,
		     Class61.aClass259_666.anInt2598 * 2054207119,
		     Class61.aClass259_666.anInt2638 * 1943498005,
		     Class61.aClass259_666.anInt2565 * 1971227387,
		     Class61.aClass259_666.anInt2669 * -1634961939,
		     Class61.aClass259_666.anInt2670 * -560565055,
		     client.aRandom11303, Class413.anInt4407,
		     client.anIntArray11354, Class229.aClass157Array2364, null,
		     (byte) 70);
		Class198_Sub19_Sub1.method18196(client.anIntArray11354[0],
						client.anIntArray11354[1],
						client.anIntArray11354[2],
						client.anIntArray11354[3],
						870295436);
	    }
	}
    }
}
