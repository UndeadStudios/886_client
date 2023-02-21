/* Class75 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class75
{
    boolean aBool822;
    Class73[] aClass73Array823;
    
    Class75(boolean bool, Class73[] class73s) {
	aBool822 = bool;
	aClass73Array823 = class73s;
    }
    
    public static int method1552(int i, boolean bool, int i_0_) {
	if (bool)
	    return 0;
	Class525_Sub10 class525_sub10
	    = Class190.method3692(i, bool, (byte) 100);
	if (null == class525_sub10)
	    return ((((Class525_Sub16_Sub1)
		      Class612.aClass40_Sub19_8026.method76(i, -1960324976))
		     .anInt11404)
		    * 785063537);
	int i_1_ = 0;
	for (int i_2_ = 0; i_2_ < class525_sub10.anIntArray10507.length;
	     i_2_++) {
	    if (class525_sub10.anIntArray10507[i_2_] == -1)
		i_1_++;
	}
	i_1_ += ((((Class525_Sub16_Sub1)
		   Class612.aClass40_Sub19_8026.method76(i, 1800864635))
		  .anInt11404) * 785063537
		 - class525_sub10.anIntArray10507.length);
	return i_1_;
    }
    
    public static Class179 method1553
	(Class182 class182, int i, int i_3_, int i_4_, int i_5_, int i_6_,
	 Class179 class179, int i_7_, int i_8_, int i_9_, int i_10_,
	 Class689 class689, int i_11_) {
	if (class179 == null)
	    return null;
	int i_12_ = 2055;
	if (null != class689) {
	    i_12_ |= class689.method14033(1268682379);
	    i_12_ &= ~0x200;
	}
	long l = (((long) i_8_ << 48)
		  + (((long) i_7_ << 32)
		     + (long) ((i_9_ << 16) + i_6_ + (i_10_ << 24))));
	Class179 class179_13_;
	synchronized (Class72.aClass200_816) {
	    class179_13_ = (Class179) Class72.aClass200_816.method3785(l);
	}
	if (class179_13_ == null
	    || class182.method3321(class179_13_.method2928(), i_12_) != 0) {
	    if (null != class179_13_)
		i_12_ = class182.method3229(i_12_, class179_13_.method2928());
	    int i_14_ = 3 * i_6_ + 6;
	    int i_15_ = 3;
	    int[] is = { 64, 96, 128 };
	    Class186 class186 = new Class186(i_15_ * i_14_ + 1,
					     i_14_ * i_15_ * 2 - i_14_, 0);
	    int i_16_ = class186.method3625(0, 0, 0);
	    int[][] is_17_ = new int[i_15_][i_14_];
	    for (int i_18_ = 0; i_18_ < i_15_; i_18_++) {
		int i_19_ = is[i_18_];
		int i_20_ = is[i_18_];
		for (int i_21_ = 0; i_21_ < i_14_; i_21_++) {
		    int i_22_ = (i_21_ << 14) / i_14_;
		    int i_23_ = Class436.anIntArray4831[i_22_] * i_19_ >> 14;
		    int i_24_ = i_20_ * Class436.anIntArray4838[i_22_] >> 14;
		    is_17_[i_18_][i_21_]
			= class186.method3625(i_23_, 0, i_24_);
		}
	    }
	    for (int i_25_ = 0; i_25_ < i_15_; i_25_++) {
		int i_26_ = (128 + 256 * i_25_) / i_15_;
		int i_27_ = 256 - i_26_;
		byte i_28_ = (byte) (i_26_ * i_10_ + i_27_ * i_9_ >> 8);
		short i_29_
		    = (short) ((((i_7_ & 0x7f) * i_27_ + (i_8_ & 0x7f) * i_26_
				 & 0x7f00)
				+ (((i_27_ * (i_7_ & 0x380)
				     + (i_8_ & 0x380) * i_26_)
				    & 0x38000)
				   + (((i_8_ & 0xfc00) * i_26_
				       + i_27_ * (i_7_ & 0xfc00))
				      & 0xfc0000)))
			       >> 8);
		for (int i_30_ = 0; i_30_ < i_14_; i_30_++) {
		    if (0 == i_25_)
			class186.method3626(i_16_,
					    is_17_[0][(1 + i_30_) % i_14_],
					    is_17_[0][i_30_], (byte) 1,
					    (byte) -1, i_29_, i_28_,
					    (short) -1);
		    else {
			class186.method3626(is_17_[i_25_ - 1][i_30_],
					    (is_17_[i_25_ - 1]
					     [(1 + i_30_) % i_14_]),
					    is_17_[i_25_][(i_30_ + 1) % i_14_],
					    (byte) 1, (byte) -1, i_29_, i_28_,
					    (short) -1);
			class186.method3626(is_17_[i_25_ - 1][i_30_],
					    is_17_[i_25_][(1 + i_30_) % i_14_],
					    is_17_[i_25_][i_30_], (byte) 1,
					    (byte) -1, i_29_, i_28_,
					    (short) -1);
		    }
		}
	    }
	    class179_13_
		= class182.method3556(class186, i_12_,
				      -1099674713 * Class72.anInt815, 64, 768);
	    synchronized (Class72.aClass200_816) {
		Class72.aClass200_816.method3788(class179_13_, l);
	    }
	}
	int i_31_ = class179.method3001();
	int i_32_ = class179.method2959();
	int i_33_ = class179.method2962();
	int i_34_ = class179.method2963();
	if (class689 != null) {
	    class179_13_ = class179_13_.method2926((byte) 3, i_12_, true);
	    class179_13_.method2936(i_32_ - i_31_ >> 1, 128,
				    i_34_ - i_33_ >> 1);
	    class179_13_.method2934(i_31_ + i_32_ >> 1, 0, i_34_ + i_33_ >> 1);
	    class689.method14036(class179_13_, (byte) 32);
	} else {
	    class179_13_ = class179_13_.method2926((byte) 3, i_12_, true);
	    class179_13_.method2936(i_32_ - i_31_ >> 1, 128,
				    i_34_ - i_33_ >> 1);
	    class179_13_.method2934(i_32_ + i_31_ >> 1, 0, i_34_ + i_33_ >> 1);
	}
	if (i_3_ != 0)
	    class179_13_.method2932(i_3_);
	if (i_4_ != 0)
	    class179_13_.method2933(i_4_);
	if (i_5_ != 0)
	    class179_13_.method2934(0, i_5_, 0);
	return class179_13_;
    }
    
    static final void method1554(Class683 class683, int i) {
	int i_35_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_35_, -695254952);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = 2054207119 * class259.anInt2598;
    }
    
    static final void method1555(Class259 class259, Class245 class245,
				 Class683 class683, short i) {
	String string
	    = (String) (class683.anObjectArray8636
			[(class683.anInt8644 -= 1285561025) * 1373599041]);
	int[] is = Class558.method9375(string, class683, (byte) 3);
	if (is != null)
	    string = string.substring(0, string.length() - 1);
	class259.anObjectArray2714
	    = Class656_Sub1_Sub5_Sub1.method18727(string, class683,
						  -701606002);
	class259.anIntArray2747 = is;
	class259.aBool2695 = true;
    }
}
