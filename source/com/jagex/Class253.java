/* Class253 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class253
{
    int[] anIntArray2454;
    int anInt2455;
    int[] anIntArray2456;
    int anInt2457;
    int anInt2458;
    int anInt2459;
    Class255 aClass255_2460;
    int anInt2461;
    int anInt2462;
    int[][] anIntArrayArray2463;
    
    Class250[] method4519(Class250[] class250s, int i, boolean[] bools) {
	int i_0_ = class250s.length;
	for (int i_1_ = 0; i_1_ < i_0_; i_1_++) {
	    if (!bools[i_1_]) {
		for (int i_2_ = 0; i_2_ < i; i_2_++)
		    class250s[i_1_].aFloatArray2449[i_2_] = 0.0F;
	    }
	}
	int i_3_ = aClass255_2460.aClass258Array2494[anInt2459].anInt2556;
	int i_4_ = anInt2461 - anInt2462;
	int i_5_ = i_4_ / anInt2457;
	if (anIntArrayArray2463 == null || anIntArrayArray2463.length != i_0_
	    || anIntArrayArray2463[0].length != i_5_)
	    anIntArrayArray2463 = new int[i_0_][i_5_];
	else {
	    for (int i_6_ = 0; i_6_ < i_0_; i_6_++)
		method4521(anIntArrayArray2463[i_6_]);
	}
	for (int i_7_ = 0; i_7_ < 8; i_7_++) {
	    int i_8_ = 0;
	    while (i_8_ < i_5_) {
		if (i_7_ == 0) {
		    for (int i_9_ = 0; i_9_ < i_0_; i_9_++) {
			if (!bools[i_9_]) {
			    int i_10_
				= aClass255_2460.aClass258Array2494
				      [anInt2459].method4671(aClass255_2460);
			    for (int i_11_ = i_3_ - 1; i_11_ >= 0; i_11_--) {
				if (i_8_ + i_11_ < i_5_)
				    anIntArrayArray2463[i_9_][i_8_ + i_11_]
					= i_10_ % anInt2458;
				i_10_ /= anInt2458;
			    }
			}
		    }
		}
		for (int i_12_ = 0; i_12_ < i_3_; i_12_++) {
		    for (int i_13_ = 0; i_13_ < i_0_; i_13_++) {
			if (!bools[i_13_]) {
			    int i_14_ = anIntArrayArray2463[i_13_][i_8_];
			    int i_15_ = anIntArray2456[i_14_ * 8 + i_7_];
			    if (i_15_ >= 0) {
				int i_16_ = anInt2462 + i_8_ * anInt2457;
				Class258 class258
				    = aClass255_2460.aClass258Array2494[i_15_];
				if (anInt2455 == 0) {
				    int i_17_ = anInt2457 / class258.anInt2556;
				    for (int i_18_ = 0; i_18_ < i_17_;
					 i_18_++) {
					float[] fs
					    = class258
						  .method4669(aClass255_2460);
					for (int i_19_ = 0;
					     i_19_ < class258.anInt2556;
					     i_19_++)
					    class250s[i_13_]
						.aFloatArray2449
						[i_16_ + i_18_ + i_19_ * i_17_]
						+= fs[i_19_];
				    }
				} else if (anInt2455 == 1 || anInt2455 == 2) {
				    int i_20_ = 0;
				    while (i_20_ < anInt2457) {
					float[] fs
					    = class258
						  .method4669(aClass255_2460);
					for (int i_21_ = 0;
					     i_21_ < class258.anInt2556;
					     i_21_++) {
					    class250s[i_13_]
						.aFloatArray2449[i_16_ + i_20_]
						+= fs[i_21_];
					    i_20_++;
					}
				    }
				}
			    }
			}
		    }
		    if (++i_8_ >= i_5_)
			break;
		}
	    }
	}
	return class250s;
    }
    
    void method4520(Class255 class255) {
	aClass255_2460 = class255;
	anInt2455 = aClass255_2460.method4550(16);
	anInt2462 = aClass255_2460.method4550(24);
	anInt2461 = aClass255_2460.method4550(24);
	anInt2457 = aClass255_2460.method4550(24) + 1;
	anInt2458 = aClass255_2460.method4550(6) + 1;
	anInt2459 = aClass255_2460.method4550(8);
	if (anIntArray2454 == null || anIntArray2454.length != anInt2458)
	    anIntArray2454 = new int[anInt2458];
	for (int i = 0; i < anInt2458; i++) {
	    int i_22_ = 0;
	    int i_23_ = aClass255_2460.method4550(3);
	    boolean bool = aClass255_2460.method4570() != 0;
	    if (bool)
		i_22_ = aClass255_2460.method4550(5);
	    anIntArray2454[i] = i_22_ << 3 | i_23_;
	}
	if (anIntArray2456 == null || anIntArray2456.length != anInt2458 * 8)
	    anIntArray2456 = new int[anInt2458 * 8];
	for (int i = 0; i < anInt2458 * 8; i++)
	    anIntArray2456[i] = ((anIntArray2454[i >> 3] & 1 << (i & 0x7)) != 0
				 ? aClass255_2460.method4550(8) : -1);
    }
    
    void method4521(int[] is) {
	if (is != null) {
	    for (int i = 0; i < is.length; i++)
		is[i] = 0;
	}
    }
    
    Class250[] method4522(Class250[] class250s, int i, boolean[] bools) {
	int i_24_ = class250s.length;
	for (int i_25_ = 0; i_25_ < i_24_; i_25_++) {
	    if (!bools[i_25_]) {
		for (int i_26_ = 0; i_26_ < i; i_26_++)
		    class250s[i_25_].aFloatArray2449[i_26_] = 0.0F;
	    }
	}
	int i_27_ = aClass255_2460.aClass258Array2494[anInt2459].anInt2556;
	int i_28_ = anInt2461 - anInt2462;
	int i_29_ = i_28_ / anInt2457;
	if (anIntArrayArray2463 == null || anIntArrayArray2463.length != i_24_
	    || anIntArrayArray2463[0].length != i_29_)
	    anIntArrayArray2463 = new int[i_24_][i_29_];
	else {
	    for (int i_30_ = 0; i_30_ < i_24_; i_30_++)
		method4521(anIntArrayArray2463[i_30_]);
	}
	for (int i_31_ = 0; i_31_ < 8; i_31_++) {
	    int i_32_ = 0;
	    while (i_32_ < i_29_) {
		if (i_31_ == 0) {
		    for (int i_33_ = 0; i_33_ < i_24_; i_33_++) {
			if (!bools[i_33_]) {
			    int i_34_
				= aClass255_2460.aClass258Array2494
				      [anInt2459].method4671(aClass255_2460);
			    for (int i_35_ = i_27_ - 1; i_35_ >= 0; i_35_--) {
				if (i_32_ + i_35_ < i_29_)
				    anIntArrayArray2463[i_33_][i_32_ + i_35_]
					= i_34_ % anInt2458;
				i_34_ /= anInt2458;
			    }
			}
		    }
		}
		for (int i_36_ = 0; i_36_ < i_27_; i_36_++) {
		    for (int i_37_ = 0; i_37_ < i_24_; i_37_++) {
			if (!bools[i_37_]) {
			    int i_38_ = anIntArrayArray2463[i_37_][i_32_];
			    int i_39_ = anIntArray2456[i_38_ * 8 + i_31_];
			    if (i_39_ >= 0) {
				int i_40_ = anInt2462 + i_32_ * anInt2457;
				Class258 class258
				    = aClass255_2460.aClass258Array2494[i_39_];
				if (anInt2455 == 0) {
				    int i_41_ = anInt2457 / class258.anInt2556;
				    for (int i_42_ = 0; i_42_ < i_41_;
					 i_42_++) {
					float[] fs
					    = class258
						  .method4669(aClass255_2460);
					for (int i_43_ = 0;
					     i_43_ < class258.anInt2556;
					     i_43_++)
					    class250s[i_37_]
						.aFloatArray2449
						[i_40_ + i_42_ + i_43_ * i_41_]
						+= fs[i_43_];
				    }
				} else if (anInt2455 == 1 || anInt2455 == 2) {
				    int i_44_ = 0;
				    while (i_44_ < anInt2457) {
					float[] fs
					    = class258
						  .method4669(aClass255_2460);
					for (int i_45_ = 0;
					     i_45_ < class258.anInt2556;
					     i_45_++) {
					    class250s[i_37_]
						.aFloatArray2449[i_40_ + i_44_]
						+= fs[i_45_];
					    i_44_++;
					}
				    }
				}
			    }
			}
		    }
		    if (++i_32_ >= i_29_)
			break;
		}
	    }
	}
	return class250s;
    }
    
    void method4523(Class255 class255) {
	aClass255_2460 = class255;
	anInt2455 = aClass255_2460.method4550(16);
	anInt2462 = aClass255_2460.method4550(24);
	anInt2461 = aClass255_2460.method4550(24);
	anInt2457 = aClass255_2460.method4550(24) + 1;
	anInt2458 = aClass255_2460.method4550(6) + 1;
	anInt2459 = aClass255_2460.method4550(8);
	if (anIntArray2454 == null || anIntArray2454.length != anInt2458)
	    anIntArray2454 = new int[anInt2458];
	for (int i = 0; i < anInt2458; i++) {
	    int i_46_ = 0;
	    int i_47_ = aClass255_2460.method4550(3);
	    boolean bool = aClass255_2460.method4570() != 0;
	    if (bool)
		i_46_ = aClass255_2460.method4550(5);
	    anIntArray2454[i] = i_46_ << 3 | i_47_;
	}
	if (anIntArray2456 == null || anIntArray2456.length != anInt2458 * 8)
	    anIntArray2456 = new int[anInt2458 * 8];
	for (int i = 0; i < anInt2458 * 8; i++)
	    anIntArray2456[i] = ((anIntArray2454[i >> 3] & 1 << (i & 0x7)) != 0
				 ? aClass255_2460.method4550(8) : -1);
    }
    
    Class253() {
	/* empty */
    }
    
    void method4524(Class255 class255) {
	aClass255_2460 = class255;
	anInt2455 = aClass255_2460.method4550(16);
	anInt2462 = aClass255_2460.method4550(24);
	anInt2461 = aClass255_2460.method4550(24);
	anInt2457 = aClass255_2460.method4550(24) + 1;
	anInt2458 = aClass255_2460.method4550(6) + 1;
	anInt2459 = aClass255_2460.method4550(8);
	if (anIntArray2454 == null || anIntArray2454.length != anInt2458)
	    anIntArray2454 = new int[anInt2458];
	for (int i = 0; i < anInt2458; i++) {
	    int i_48_ = 0;
	    int i_49_ = aClass255_2460.method4550(3);
	    boolean bool = aClass255_2460.method4570() != 0;
	    if (bool)
		i_48_ = aClass255_2460.method4550(5);
	    anIntArray2454[i] = i_48_ << 3 | i_49_;
	}
	if (anIntArray2456 == null || anIntArray2456.length != anInt2458 * 8)
	    anIntArray2456 = new int[anInt2458 * 8];
	for (int i = 0; i < anInt2458 * 8; i++)
	    anIntArray2456[i] = ((anIntArray2454[i >> 3] & 1 << (i & 0x7)) != 0
				 ? aClass255_2460.method4550(8) : -1);
    }
    
    Class250[] method4525(Class250[] class250s, int i, boolean[] bools) {
	int i_50_ = class250s.length;
	for (int i_51_ = 0; i_51_ < i_50_; i_51_++) {
	    if (!bools[i_51_]) {
		for (int i_52_ = 0; i_52_ < i; i_52_++)
		    class250s[i_51_].aFloatArray2449[i_52_] = 0.0F;
	    }
	}
	int i_53_ = aClass255_2460.aClass258Array2494[anInt2459].anInt2556;
	int i_54_ = anInt2461 - anInt2462;
	int i_55_ = i_54_ / anInt2457;
	if (anIntArrayArray2463 == null || anIntArrayArray2463.length != i_50_
	    || anIntArrayArray2463[0].length != i_55_)
	    anIntArrayArray2463 = new int[i_50_][i_55_];
	else {
	    for (int i_56_ = 0; i_56_ < i_50_; i_56_++)
		method4521(anIntArrayArray2463[i_56_]);
	}
	for (int i_57_ = 0; i_57_ < 8; i_57_++) {
	    int i_58_ = 0;
	    while (i_58_ < i_55_) {
		if (i_57_ == 0) {
		    for (int i_59_ = 0; i_59_ < i_50_; i_59_++) {
			if (!bools[i_59_]) {
			    int i_60_
				= aClass255_2460.aClass258Array2494
				      [anInt2459].method4671(aClass255_2460);
			    for (int i_61_ = i_53_ - 1; i_61_ >= 0; i_61_--) {
				if (i_58_ + i_61_ < i_55_)
				    anIntArrayArray2463[i_59_][i_58_ + i_61_]
					= i_60_ % anInt2458;
				i_60_ /= anInt2458;
			    }
			}
		    }
		}
		for (int i_62_ = 0; i_62_ < i_53_; i_62_++) {
		    for (int i_63_ = 0; i_63_ < i_50_; i_63_++) {
			if (!bools[i_63_]) {
			    int i_64_ = anIntArrayArray2463[i_63_][i_58_];
			    int i_65_ = anIntArray2456[i_64_ * 8 + i_57_];
			    if (i_65_ >= 0) {
				int i_66_ = anInt2462 + i_58_ * anInt2457;
				Class258 class258
				    = aClass255_2460.aClass258Array2494[i_65_];
				if (anInt2455 == 0) {
				    int i_67_ = anInt2457 / class258.anInt2556;
				    for (int i_68_ = 0; i_68_ < i_67_;
					 i_68_++) {
					float[] fs
					    = class258
						  .method4669(aClass255_2460);
					for (int i_69_ = 0;
					     i_69_ < class258.anInt2556;
					     i_69_++)
					    class250s[i_63_]
						.aFloatArray2449
						[i_66_ + i_68_ + i_69_ * i_67_]
						+= fs[i_69_];
				    }
				} else if (anInt2455 == 1 || anInt2455 == 2) {
				    int i_70_ = 0;
				    while (i_70_ < anInt2457) {
					float[] fs
					    = class258
						  .method4669(aClass255_2460);
					for (int i_71_ = 0;
					     i_71_ < class258.anInt2556;
					     i_71_++) {
					    class250s[i_63_]
						.aFloatArray2449[i_66_ + i_70_]
						+= fs[i_71_];
					    i_70_++;
					}
				    }
				}
			    }
			}
		    }
		    if (++i_58_ >= i_55_)
			break;
		}
	    }
	}
	return class250s;
    }
    
    Class250[] method4526(Class250[] class250s, int i, boolean[] bools) {
	int i_72_ = class250s.length;
	for (int i_73_ = 0; i_73_ < i_72_; i_73_++) {
	    if (!bools[i_73_]) {
		for (int i_74_ = 0; i_74_ < i; i_74_++)
		    class250s[i_73_].aFloatArray2449[i_74_] = 0.0F;
	    }
	}
	int i_75_ = aClass255_2460.aClass258Array2494[anInt2459].anInt2556;
	int i_76_ = anInt2461 - anInt2462;
	int i_77_ = i_76_ / anInt2457;
	if (anIntArrayArray2463 == null || anIntArrayArray2463.length != i_72_
	    || anIntArrayArray2463[0].length != i_77_)
	    anIntArrayArray2463 = new int[i_72_][i_77_];
	else {
	    for (int i_78_ = 0; i_78_ < i_72_; i_78_++)
		method4521(anIntArrayArray2463[i_78_]);
	}
	for (int i_79_ = 0; i_79_ < 8; i_79_++) {
	    int i_80_ = 0;
	    while (i_80_ < i_77_) {
		if (i_79_ == 0) {
		    for (int i_81_ = 0; i_81_ < i_72_; i_81_++) {
			if (!bools[i_81_]) {
			    int i_82_
				= aClass255_2460.aClass258Array2494
				      [anInt2459].method4671(aClass255_2460);
			    for (int i_83_ = i_75_ - 1; i_83_ >= 0; i_83_--) {
				if (i_80_ + i_83_ < i_77_)
				    anIntArrayArray2463[i_81_][i_80_ + i_83_]
					= i_82_ % anInt2458;
				i_82_ /= anInt2458;
			    }
			}
		    }
		}
		for (int i_84_ = 0; i_84_ < i_75_; i_84_++) {
		    for (int i_85_ = 0; i_85_ < i_72_; i_85_++) {
			if (!bools[i_85_]) {
			    int i_86_ = anIntArrayArray2463[i_85_][i_80_];
			    int i_87_ = anIntArray2456[i_86_ * 8 + i_79_];
			    if (i_87_ >= 0) {
				int i_88_ = anInt2462 + i_80_ * anInt2457;
				Class258 class258
				    = aClass255_2460.aClass258Array2494[i_87_];
				if (anInt2455 == 0) {
				    int i_89_ = anInt2457 / class258.anInt2556;
				    for (int i_90_ = 0; i_90_ < i_89_;
					 i_90_++) {
					float[] fs
					    = class258
						  .method4669(aClass255_2460);
					for (int i_91_ = 0;
					     i_91_ < class258.anInt2556;
					     i_91_++)
					    class250s[i_85_]
						.aFloatArray2449
						[i_88_ + i_90_ + i_91_ * i_89_]
						+= fs[i_91_];
				    }
				} else if (anInt2455 == 1 || anInt2455 == 2) {
				    int i_92_ = 0;
				    while (i_92_ < anInt2457) {
					float[] fs
					    = class258
						  .method4669(aClass255_2460);
					for (int i_93_ = 0;
					     i_93_ < class258.anInt2556;
					     i_93_++) {
					    class250s[i_85_]
						.aFloatArray2449[i_88_ + i_92_]
						+= fs[i_93_];
					    i_92_++;
					}
				    }
				}
			    }
			}
		    }
		    if (++i_80_ >= i_77_)
			break;
		}
	    }
	}
	return class250s;
    }
}
