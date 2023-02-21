/* Class558 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class558
{
    Class550 aClass550_7536;
    int anInt7537;
    byte[] aByteArray7538;
    float aFloat7539;
    int anInt7540;
    int anInt7541;
    int anInt7542;
    byte[] aByteArray7543;
    int anInt7544;
    int anInt7545;
    Class372_Sub2 this$0;
    
    void method9365(byte[] is, int i, int i_0_) {
	int i_1_ = i;
	while (i_1_ < i + i_0_) {
	    aByteArray7543[-1820754621 * anInt7540] = is[i_1_];
	    aByteArray7543[1 + -1820754621 * anInt7540] = is[i_1_ + 1];
	    i_1_ += 2;
	    anInt7540 += -608178474;
	    anInt7540
		= -1820754621 * anInt7540 % aByteArray7543.length * -304089237;
	    anInt7545 -= -858337542;
	}
    }
    
    void method9366(byte[] is, int i, int i_2_, int i_3_) {
	int i_4_ = i;
	while (i_4_ < i + i_2_) {
	    aByteArray7543[-1820754621 * anInt7540] = is[i_4_];
	    aByteArray7543[1 + -1820754621 * anInt7540] = is[i_4_ + 1];
	    i_4_ += 2;
	    anInt7540 += -608178474;
	    anInt7540
		= -1820754621 * anInt7540 % aByteArray7543.length * -304089237;
	    anInt7545 -= -858337542;
	}
    }
    
    int method9367(int i) {
	return 1695910357 * anInt7545;
    }
    
    void method9368(byte[] is, int i, int i_5_) {
	int i_6_ = i;
	while (i_6_ < i + i_5_) {
	    aByteArray7543[-1820754621 * anInt7540] = is[i_6_];
	    aByteArray7543[1 + -1820754621 * anInt7540] = is[i_6_ + 1];
	    i_6_ += 2;
	    anInt7540 += -608178474;
	    anInt7540
		= -1820754621 * anInt7540 % aByteArray7543.length * -304089237;
	    anInt7545 -= -858337542;
	}
    }
    
    Class558(Class372_Sub2 class372_sub2, Class550 class550, int i, float f,
	     int i_7_, int i_8_, boolean bool, boolean bool_9_) {
	this$0 = class372_sub2;
	aClass550_7536 = class550;
	aByteArray7543 = new byte[i];
	aByteArray7538 = new byte[i_7_ / 8];
	anInt7545 = aByteArray7543.length * -429168771;
	aFloat7539 = f;
	anInt7544 = 555175947 * i_7_;
	anInt7537 = -883041591 * i_8_;
	anInt7540 = 0;
	anInt7541 = 0;
	anInt7542 = 0;
    }
    
    void method9369(byte[] is, int i, int i_10_) {
	int i_11_ = i;
	while (i_11_ < i + i_10_) {
	    aByteArray7543[-1820754621 * anInt7540] = is[i_11_];
	    aByteArray7543[1 + -1820754621 * anInt7540] = is[i_11_ + 1];
	    i_11_ += 2;
	    anInt7540 += -608178474;
	    anInt7540
		= -1820754621 * anInt7540 % aByteArray7543.length * -304089237;
	    anInt7545 -= -858337542;
	}
    }
    
    void method9370(byte[] is, int i, int i_12_) {
	int i_13_ = i;
	while (i_13_ < i + i_12_) {
	    aByteArray7543[-1820754621 * anInt7540] = is[i_13_];
	    aByteArray7543[1 + -1820754621 * anInt7540] = is[i_13_ + 1];
	    i_13_ += 2;
	    anInt7540 += -608178474;
	    anInt7540
		= -1820754621 * anInt7540 % aByteArray7543.length * -304089237;
	    anInt7545 -= -858337542;
	}
    }
    
    int method9371() {
	return 1695910357 * anInt7545;
    }
    
    int method9372() {
	return 1695910357 * anInt7545;
    }
    
    public static Class603_Sub1 method9373(byte i) {
	Class15.anInt178 = 0;
	return Class584.method9643(1496233650);
    }
    
    public static int method9374(int i) {
	return Class159.aClass295_1755.method5315((short) 999);
    }
    
    static final int[] method9375(String string, Class683 class683, byte i) {
	int[] is = null;
	if (string.length() > 0 && string.charAt(string.length() - 1) == 'Y') {
	    int i_14_ = (class683.anIntArray8661
			 [(class683.anInt8662 -= 1552651121) * 501271953]);
	    if (i_14_ > 0) {
		is = new int[i_14_];
		while (i_14_-- > 0)
		    is[i_14_]
			= (class683.anIntArray8661
			   [(class683.anInt8662 -= 1552651121) * 501271953]);
	    }
	}
	return is;
    }
}
