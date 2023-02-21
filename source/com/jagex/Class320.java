/* Class320 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.IOException;

import com.jagex.twitchtv.TwitchEventLiveStreams;

public class Class320
{
    int anInt3531;
    short[] aShortArray3532;
    static int anInt3533;
    public static TwitchEventLiveStreams aTwitchEventLiveStreams3534;
    
    public int method5700(Class334 class334) throws IOException {
	int i = 1;
	for (int i_0_ = 662240131 * anInt3531; 0 != i_0_; i_0_--)
	    i = (i << 1) + class334.method5829(aShortArray3532, i, (byte) -33);
	return i - (1 << 662240131 * anInt3531);
    }
    
    public int method5701(Class334 class334) throws IOException {
	int i = 1;
	for (int i_1_ = 662240131 * anInt3531; 0 != i_1_; i_1_--)
	    i = (i << 1) + class334.method5829(aShortArray3532, i, (byte) -26);
	return i - (1 << 662240131 * anInt3531);
    }
    
    public void method5702() {
	Class28.method906(aShortArray3532, 2059588903);
    }
    
    public int method5703(Class334 class334, int i) throws IOException {
	int i_2_ = 1;
	int i_3_ = 0;
	for (int i_4_ = 0; i_4_ < 662240131 * anInt3531; i_4_++) {
	    int i_5_ = class334.method5829(aShortArray3532, i_2_, (byte) -25);
	    i_2_ <<= 1;
	    i_2_ += i_5_;
	    i_3_ |= i_5_ << i_4_;
	}
	return i_3_;
    }
    
    public void method5704() {
	Class28.method906(aShortArray3532, 2142966544);
    }
    
    public void method5705(byte i) {
	Class28.method906(aShortArray3532, 2053231624);
    }
    
    public Class320(int i) {
	anInt3531 = i * -522556629;
	aShortArray3532 = new short[1 << i];
    }
    
    public void method5706() {
	Class28.method906(aShortArray3532, 2066060733);
    }
    
    public void method5707() {
	Class28.method906(aShortArray3532, 2035542409);
    }
    
    public int method5708(Class334 class334, int i) throws IOException {
	int i_6_ = 1;
	for (int i_7_ = 662240131 * anInt3531; 0 != i_7_; i_7_--)
	    i_6_ = (i_6_ << 1) + class334.method5829(aShortArray3532, i_6_,
						     (byte) -64);
	return i_6_ - (1 << 662240131 * anInt3531);
    }
    
    public void method5709() {
	Class28.method906(aShortArray3532, 2045306936);
    }
    
    public int method5710(Class334 class334) throws IOException {
	int i = 1;
	int i_8_ = 0;
	for (int i_9_ = 0; i_9_ < 662240131 * anInt3531; i_9_++) {
	    int i_10_ = class334.method5829(aShortArray3532, i, (byte) -27);
	    i <<= 1;
	    i += i_10_;
	    i_8_ |= i_10_ << i_9_;
	}
	return i_8_;
    }
    
    static final void method5711(Class683 class683, byte i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = class683.aClass353_8652.method6239(((String)
						  (class683.anObjectArray8636
						   [((class683.anInt8644
						      -= 1285561025)
						     * 1373599041)])),
						 -1659726275);
    }
    
    static final void method5712(Class683 class683, short i) {
	int i_11_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class8 class8
	    = ((Class8)
	       Class313_Sub2.aClass40_Sub22_10106.method76(i_11_, 968587951));
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = class8.aBool80 ? 1 : 0;
    }
    
    public static Class525_Sub37 method5713(int i) {
	if (null == Class556_Sub1.aClass709_7473
	    || Class556_Sub1.aClass699_10642 == null)
	    return null;
	Class556_Sub1.aClass699_10642.method14229(Class556_Sub1.aClass709_7473,
						  960664595);
	Class525_Sub37 class525_sub37
	    = ((Class525_Sub37)
	       Class556_Sub1.aClass699_10642.method14235(630079091));
	if (class525_sub37 == null)
	    return null;
	Class287 class287
	    = ((Class287)
	       Class556_Sub1.aClass40_Sub2_7464.method76((-480723851
							  * (class525_sub37
							     .anInt10825)),
							 -96118434));
	if (class287 == null || !class287.aBool3180
	    || !class287.method5234(Class556_Sub1.anInterface20_7472,
				    Class556_Sub1.anInterface18_7466,
				    (byte) -40))
	    return Class62.method1380(1111263457);
	return class525_sub37;
    }
    
    static void method5714(int i, byte i_12_) {
	for (Class525_Sub16_Sub16 class525_sub16_sub16
		 = ((Class525_Sub16_Sub16)
		    Class61.aClass709_660.method14372((short) -20736));
	     null != class525_sub16_sub16;
	     class525_sub16_sub16
		 = ((Class525_Sub16_Sub16)
		    Class61.aClass709_660.method14353(-1822563101))) {
	    if (Class390_Sub3.method15878((91103913
					   * class525_sub16_sub16.anInt11861),
					  (byte) 59)
		&& class525_sub16_sub16.anInt11863 * -691010033 >> 16 == i)
		Class691.method14112(class525_sub16_sub16, -1907924812);
	}
    }
    
    public static int method5715(int i, int i_13_, int i_14_) {
	int i_15_ = 0;
	for (/**/; i_13_ > 0; i_13_--) {
	    i_15_ = i_15_ << 1 | i & 0x1;
	    i >>>= 1;
	}
	return i_15_;
    }
}
