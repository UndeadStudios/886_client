/* Class456 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class456
{
    public static int method7451(int i, int i_0_, int i_1_) {
	i_1_ &= 0x3;
	if (0 == i_1_)
	    return i_0_;
	if (i_1_ == 1)
	    return 4095 - i;
	if (2 == i_1_)
	    return 4095 - i_0_;
	return i;
    }
    
    public static int method7452(int i, int i_2_, int i_3_) {
	i_3_ &= 0x3;
	if (0 == i_3_)
	    return i;
	if (1 == i_3_)
	    return i_2_;
	if (2 == i_3_)
	    return 7 - i;
	return 7 - i_2_;
    }
    
    public static int method7453(int i, int i_4_, int i_5_, int i_6_, int i_7_,
				 int i_8_) {
	if (1 == (i_8_ & 0x1)) {
	    int i_9_ = i_6_;
	    i_6_ = i_7_;
	    i_7_ = i_9_;
	}
	i_5_ &= 0x3;
	if (0 == i_5_)
	    return i;
	if (1 == i_5_)
	    return i_4_;
	if (2 == i_5_)
	    return 7 - i - (i_6_ - 1);
	return 7 - i_4_ - (i_7_ - 1);
    }
    
    public static int method7454(int i, int i_10_, int i_11_) {
	i_11_ &= 0x3;
	if (0 == i_11_)
	    return i_10_;
	if (i_11_ == 1)
	    return 4095 - i;
	if (2 == i_11_)
	    return 4095 - i_10_;
	return i;
    }
    
    public static int method7455(int i, int i_12_, int i_13_) {
	i_13_ &= 0x3;
	if (0 == i_13_)
	    return i_12_;
	if (i_13_ == 1)
	    return 4095 - i;
	if (2 == i_13_)
	    return 4095 - i_12_;
	return i;
    }
    
    Class456() throws Throwable {
	throw new Error();
    }
    
    public static int method7456(int i, int i_14_, int i_15_, int i_16_,
				 int i_17_, int i_18_) {
	if (1 == (i_18_ & 0x1)) {
	    int i_19_ = i_16_;
	    i_16_ = i_17_;
	    i_17_ = i_19_;
	}
	i_15_ &= 0x3;
	if (i_15_ == 0)
	    return i_14_;
	if (i_15_ == 1)
	    return 7 - i - (i_16_ - 1);
	if (i_15_ == 2)
	    return 7 - i_14_ - (i_17_ - 1);
	return i;
    }
    
    public static int method7457(int i, int i_20_, int i_21_, int i_22_,
				 int i_23_, int i_24_) {
	if (1 == (i_24_ & 0x1)) {
	    int i_25_ = i_22_;
	    i_22_ = i_23_;
	    i_23_ = i_25_;
	}
	i_21_ &= 0x3;
	if (0 == i_21_)
	    return i;
	if (1 == i_21_)
	    return i_20_;
	if (2 == i_21_)
	    return 7 - i - (i_22_ - 1);
	return 7 - i_20_ - (i_23_ - 1);
    }
    
    public static int method7458(int i, int i_26_, int i_27_, int i_28_,
				 int i_29_, int i_30_) {
	if (1 == (i_30_ & 0x1)) {
	    int i_31_ = i_28_;
	    i_28_ = i_29_;
	    i_29_ = i_31_;
	}
	i_27_ &= 0x3;
	if (0 == i_27_)
	    return i;
	if (1 == i_27_)
	    return i_26_;
	if (2 == i_27_)
	    return 7 - i - (i_28_ - 1);
	return 7 - i_26_ - (i_29_ - 1);
    }
    
    public static int method7459(int i, int i_32_, int i_33_, int i_34_,
				 int i_35_, int i_36_) {
	if (1 == (i_36_ & 0x1)) {
	    int i_37_ = i_34_;
	    i_34_ = i_35_;
	    i_35_ = i_37_;
	}
	i_33_ &= 0x3;
	if (i_33_ == 0)
	    return i_32_;
	if (i_33_ == 1)
	    return 7 - i - (i_34_ - 1);
	if (i_33_ == 2)
	    return 7 - i_32_ - (i_35_ - 1);
	return i;
    }
    
    static final void method7460(Class683 class683, int i) {
	int i_38_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_38_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_38_ >> 16];
	Class559.method9400(class259, class245, class683, (short) -7735);
    }
    
    static final void method7461(Class683 class683, byte i) {
	class683.anInt8648 -= -92693374;
	if (class683.aLongArray8645[105529793 * class683.anInt8648]
	    < class683.aLongArray8645[105529793 * class683.anInt8648 + 1])
	    class683.anInt8663
		+= -1827402657 * (class683.anIntArray8647
				  [class683.anInt8663 * 1931825055]);
    }
    
    public static void method7462(int i, byte i_39_) {
	Class525_Sub16_Sub10 class525_sub16_sub10
	    = Class465.method7671(22, (long) i);
	class525_sub16_sub10.method18350((byte) -19);
    }
    
    static final void method7463(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class191.method3701((short) 300).method80();
    }
}
