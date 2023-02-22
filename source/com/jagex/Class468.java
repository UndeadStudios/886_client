/* Class468 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class468
{
    int anInt5126;
    int anInt5127;
    Class472 aClass472_5128;
    protected static Class37[] aClass37Array5129;
    
    int method7700(int i) {
	return 1992650613 * anInt5127;
    }
    
    Class472 method7701(byte i) {
	return aClass472_5128;
    }
    
    int method7702() {
	return 1992650613 * anInt5127;
    }
    
    int method7703(byte i) {
	return -1052251283 * anInt5126;
    }
    
    int method7704() {
	return -1052251283 * anInt5126;
    }
    
    Class468(RSBuffer class525_sub38) {
	aClass472_5128
	    = ((Class472)
	       Class539.method8888(Class472.method7743((byte) -75),
				   class525_sub38.readUnsignedByte(1333369868),
				   -83577944));
	anInt5127 = class525_sub38.readInt(934565059) * 2038606045;
	if (Class472.aClass472_5152 != aClass472_5128)
	    anInt5126 = class525_sub38.readInt(1846124339) * 1883231845;
	else
	    anInt5126 = anInt5127 * -2065971415;
    }
    
    int method7705() {
	return 1992650613 * anInt5127;
    }
    
    Class472 method7706() {
	return aClass472_5128;
    }
    
    static final void method7707(Class683 class683, int i) {
	class683.anInt8662 -= -1189665054;
	int i_0_ = class683.anIntArray8661[501271953 * class683.anInt8662];
	int i_1_ = class683.anIntArray8661[501271953 * class683.anInt8662 + 1];
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = i_0_ ^ 1 << i_1_;
    }
    
    static boolean method7708(int i, byte i_2_) {
	if (9 == i || i == 10 || 11 == i || 12 == i || 13 == i || i == 1003)
	    return true;
	if (8 == i)
	    return true;
	return false;
    }
    
    static final void method7709(Class683 class683, byte i) {
	int i_3_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	ItemDefinitions class8
	    = ((ItemDefinitions)
	       Class313_Sub2.aClass40_Sub22_10106.method76(i_3_, 1128295657));
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = class8.anInt116 * -1711875303;
    }
}
