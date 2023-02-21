/* Class492 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

final class Class492 implements Interface11
{
    public Object method65(RSBuffer class525_sub38, int i) {
	return class525_sub38.readString((byte) -29);
    }
    
    public Object method64(RSBuffer class525_sub38) {
	return class525_sub38.readString((byte) 45);
    }
    
    public Object method63(RSBuffer class525_sub38) {
	return class525_sub38.readString((byte) 37);
    }
    
    static final void method7990(Class259 class259, Class245 class245,
				 Class683 class683, int i) {
	class683.anInt8662 -= -1189665054;
	class259.anInt2604
	    = (class683.anIntArray8661[class683.anInt8662 * 501271953]
	       * -824731709);
	class259.anInt2705
	    = (-1370168039
	       * class683.anIntArray8661[501271953 * class683.anInt8662 + 1]);
	Class649.method10708(class259, (byte) 0);
	Class372.method6364(class245, class259, -1788827441);
	if (class259.anInt2590 * 2010235789 == 0)
	    Class76.method1560(class245, class259, false, -181562890);
    }
    
    static final void method7991(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = class259.anInt2602 * -1694810043;
    }
    
    static final void method7992(Class683 class683, int i) {
	Class390_Sub3.anInt10233 = 0;
    }
    
    static final void method7993(Class683 class683, byte i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = 1403168505 * Class686.anInt8695;
    }
    
    static final void method7994(int i, int i_0_, int i_1_, int i_2_, int i_3_,
				 int i_4_, int i_5_, int i_6_) {
	int i_7_ = i_5_ - 334;
	if (i_7_ < 0)
	    i_7_ = 0;
	else if (i_7_ > 100)
	    i_7_ = 100;
	int i_8_ = (i_7_ * (client.aShort11351 - client.aShort11350) / 100
		    + client.aShort11350);
	i_4_ = i_8_ * i_4_ >> 8;
	int i_9_ = 16384 - i_2_ & 0x3fff;
	int i_10_ = 16384 - i_3_ & 0x3fff;
	int i_11_ = 0;
	int i_12_ = 0;
	int i_13_ = i_4_;
	if (0 != i_9_) {
	    i_12_ = -i_13_ * Class436.anIntArray4831[i_9_] >> 14;
	    i_13_ = Class436.anIntArray4838[i_9_] * i_13_ >> 14;
	}
	if (0 != i_10_) {
	    i_11_ = i_13_ * Class436.anIntArray4831[i_10_] >> 14;
	    i_13_ = Class436.anIntArray4838[i_10_] * i_13_ >> 14;
	}
	Class477.anInt5200 = 54795941 * (i - i_11_);
	Class575.anInt7648 = (i_0_ - i_12_) * -1332233853;
	Class475.anInt5179 = 662343119 * (i_1_ - i_13_);
	Class689_Sub1.anInt11019 = i_2_ * 784259773;
	Class64.anInt695 = -1054956469 * i_3_;
	Class8.anInt137 = 0;
    }
    
    static final void method7995(Class683 class683, int i) {
	int i_14_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Character.toUpperCase((char) i_14_);
    }
}
