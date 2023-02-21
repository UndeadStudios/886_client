/* Class554 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class554
{
    boolean aBool7421;
    int anInt7422;
    static final int anInt7423 = 10;
    static final float aFloat7424 = 3.0F;
    static final int anInt7425 = 101;
    Class546 aClass546_7426;
    boolean aBool7427;
    int[][][] anIntArrayArrayArray7428;
    int anInt7429;
    int anInt7430;
    Class568[] aClass568Array7431;
    int anInt7432;
    Class568[] aClass568Array7433;
    public boolean aBool7434 = true;
    Class568[] aClass568Array7435;
    Class548 aClass548_7436;
    Class568[] aClass568Array7437;
    int anInt7438;
    int anInt7439;
    int[] anIntArray7440;
    int[] anIntArray7441;
    int anInt7442;
    int[] anIntArray7443;
    int[] anIntArray7444;
    int[] anIntArray7445;
    static Class182 aClass182_7446;
    float[] aFloatArray7447;
    int[] anIntArray7448;
    int anInt7449;
    int[] anIntArray7450;
    boolean aBool7451;
    
    boolean method9171(int i, int i_0_, int i_1_, int i_2_, int i_3_,
		       Class553 class553) {
	if (!aBool7434 || !aBool7421)
	    return false;
	if (aClass548_7436.anInt7284 < 101)
	    return false;
	if (i_0_ < 0 || i_2_ < 0 || i_1_ >= anIntArrayArrayArray7428[i].length
	    || i_3_ >= anIntArrayArrayArray7428[i][i_0_].length)
	    return false;
	if (i_0_ == i_1_ && i_2_ == i_3_) {
	    if (!method9181(i, i_0_, i_2_))
		return false;
	    if (method9219(class553))
		return true;
	    return false;
	}
	for (int i_4_ = i_0_; i_4_ <= i_1_; i_4_++) {
	    for (int i_5_ = i_2_; i_5_ <= i_3_; i_5_++) {
		if (anIntArrayArrayArray7428[i][i_4_][i_5_]
		    == -(aClass546_7426.anInt7261 * -852140167))
		    return false;
	    }
	}
	if (!method9219(class553))
	    return false;
	return true;
    }
    
    final boolean method9172(int i, int i_6_, int i_7_, int i_8_, int i_9_,
			     int i_10_) {
	int i_11_ = i + i_8_;
	int i_12_ = i_6_ + i_9_;
	int i_13_ = i_7_ + i_10_;
	if (!method9187(i, i_12_, i_7_, i_11_, i_12_, i_13_, i, i_12_, i_13_))
	    return false;
	if (!method9187(i, i_12_, i_7_, i_11_, i_12_, i_7_, i_11_, i_12_,
			i_13_))
	    return false;
	if (i < aClass546_7426.anInt7238 * 1787068049) {
	    if (!method9187(i, i_6_, i_13_, i, i_12_, i_7_, i, i_12_, i_13_))
		return false;
	    if (!method9187(i, i_6_, i_13_, i, i_6_, i_7_, i, i_12_, i_7_))
		return false;
	} else {
	    if (!method9187(i_11_, i_6_, i_13_, i_11_, i_12_, i_7_, i_11_,
			    i_12_, i_13_))
		return false;
	    if (!method9187(i_11_, i_6_, i_13_, i_11_, i_6_, i_7_, i_11_,
			    i_12_, i_7_))
		return false;
	}
	if (i_7_ < aClass546_7426.anInt7239 * 934728119) {
	    if (!method9187(i, i_6_, i_7_, i_11_, i_12_, i_7_, i, i_12_, i_7_))
		return false;
	    if (!method9187(i, i_6_, i_7_, i_11_, i_6_, i_7_, i_11_, i_12_,
			    i_7_))
		return false;
	} else {
	    if (!method9187(i, i_6_, i_13_, i_11_, i_12_, i_13_, i, i_12_,
			    i_13_))
		return false;
	    if (!method9187(i, i_6_, i_13_, i_11_, i_6_, i_13_, i_11_, i_12_,
			    i_13_))
		return false;
	}
	return true;
    }
    
    public void method9173(int i, int i_14_, int i_15_, int i_16_) {
	if (i == 8 || i == 16) {
	    for (int i_17_ = 0; i_17_ < anInt7442; i_17_++) {
		Class568 class568 = aClass568Array7437[i_17_];
		if (class568.aByte7615 == i && class568.aByte7616 == i_14_
		    && ((class568.aShort7617 == i_15_
			 && class568.aShort7618 == i_16_)
			|| (class568.aShort7610 == i_15_
			    && class568.aShort7620 == i_16_))) {
		    if (i_17_ != anInt7442)
			System.arraycopy(aClass568Array7437, i_17_ + 1,
					 aClass568Array7437, i_17_,
					 aClass568Array7437.length - (i_17_
								      + 1));
		    anInt7442--;
		    break;
		}
	    }
	} else {
	    Class547 class547 = (aClass546_7426.aClass547ArrayArrayArray7263
				 [i_14_][i_15_][i_16_]);
	    if (class547 != null) {
		if (i == 1)
		    class547.aShort7273 = (short) 0;
		else if (i == 2)
		    class547.aShort7270 = (short) 0;
	    }
	    method9178();
	}
    }
    
    boolean method9174(int i, int i_18_, int i_19_, int i_20_, int i_21_,
		       Class553 class553) {
	if (!aBool7434 || !aBool7421)
	    return false;
	if (aClass548_7436.anInt7284 < 101)
	    return false;
	if (i_18_ < 0 || i_20_ < 0
	    || i_19_ >= anIntArrayArrayArray7428[i].length
	    || i_21_ >= anIntArrayArrayArray7428[i][i_18_].length)
	    return false;
	if (i_18_ == i_19_ && i_20_ == i_21_) {
	    if (!method9181(i, i_18_, i_20_))
		return false;
	    if (method9219(class553))
		return true;
	    return false;
	}
	for (int i_22_ = i_18_; i_22_ <= i_19_; i_22_++) {
	    for (int i_23_ = i_20_; i_23_ <= i_21_; i_23_++) {
		if (anIntArrayArrayArray7428[i][i_22_][i_23_]
		    == -(aClass546_7426.anInt7261 * -852140167))
		    return false;
	    }
	}
	if (!method9219(class553))
	    return false;
	return true;
    }
    
    public void method9175() {
	method9178();
    }
    
    public void method9176(int i, int i_24_, int i_25_, int i_26_) {
	if (i == 8 || i == 16) {
	    for (int i_27_ = 0; i_27_ < anInt7442; i_27_++) {
		Class568 class568 = aClass568Array7437[i_27_];
		if (class568.aByte7615 == i && class568.aByte7616 == i_24_
		    && ((class568.aShort7617 == i_25_
			 && class568.aShort7618 == i_26_)
			|| (class568.aShort7610 == i_25_
			    && class568.aShort7620 == i_26_))) {
		    if (i_27_ != anInt7442)
			System.arraycopy(aClass568Array7437, i_27_ + 1,
					 aClass568Array7437, i_27_,
					 aClass568Array7437.length - (i_27_
								      + 1));
		    anInt7442--;
		    break;
		}
	    }
	} else {
	    Class547 class547 = (aClass546_7426.aClass547ArrayArrayArray7263
				 [i_24_][i_25_][i_26_]);
	    if (class547 != null) {
		if (i == 1)
		    class547.aShort7273 = (short) 0;
		else if (i == 2)
		    class547.aShort7270 = (short) 0;
	    }
	    method9178();
	}
    }
    
    final boolean method9177(int i, int i_28_, int i_29_, int i_30_, int i_31_,
			     int i_32_, int i_33_, int i_34_, int i_35_) {
	if (!method9180(i, i_28_, i_29_))
	    return false;
	i = (int) aFloatArray7447[0];
	i_28_ = (int) aFloatArray7447[1];
	i_29_ = (int) aFloatArray7447[2];
	if (!method9180(i_30_, i_31_, i_32_))
	    return false;
	i_30_ = (int) aFloatArray7447[0];
	i_31_ = (int) aFloatArray7447[1];
	i_32_ = (int) aFloatArray7447[2];
	if (!method9180(i_33_, i_34_, i_35_))
	    return false;
	i_33_ = (int) aFloatArray7447[0];
	i_34_ = (int) aFloatArray7447[1];
	i_35_ = (int) aFloatArray7447[2];
	return aClass548_7436.method9106(i_28_, i_31_, i_34_, i, i_30_, i_33_,
					 i_29_, i_32_, i_35_);
    }
    
    void method9178() {
	for (int i = 0; i < anInt7439; i++)
	    aClass568Array7435[i] = null;
	anInt7439 = 0;
	for (int i = 0; i < aClass546_7426.anInt7241 * 230317859; i++) {
	    for (int i_36_ = 0; i_36_ < aClass546_7426.anInt7210 * 1761949661;
		 i_36_++) {
		for (int i_37_ = 0;
		     i_37_ < aClass546_7426.anInt7211 * 947301287; i_37_++) {
		    Class547 class547
			= (aClass546_7426.aClass547ArrayArrayArray7263[i]
			   [i_37_][i_36_]);
		    if (class547 != null) {
			if (class547.aShort7273 > 0)
			    class547.aShort7273 *= -1;
			if (class547.aShort7270 > 0)
			    class547.aShort7270 *= -1;
		    }
		}
	    }
	}
	for (int i = 0; i < aClass546_7426.anInt7241 * 230317859; i++) {
	    for (int i_38_ = 0; i_38_ < aClass546_7426.anInt7210 * 1761949661;
		 i_38_++) {
		for (int i_39_ = 0;
		     i_39_ < aClass546_7426.anInt7211 * 947301287; i_39_++) {
		    Class547 class547
			= (aClass546_7426.aClass547ArrayArrayArray7263[i]
			   [i_39_][i_38_]);
		    if (class547 != null) {
			boolean bool
			    = ((aClass546_7426.aClass547ArrayArrayArray7263[0]
				[i_39_][i_38_]) != null
			       && (aClass546_7426.aClass547ArrayArrayArray7263
				   [0][i_39_][i_38_].aClass547_7269) != null);
			if (class547.aShort7273 < 0) {
			    int i_40_ = i_38_;
			    int i_41_ = i_38_;
			    int i_42_ = i;
			    int i_43_ = i;
			    Class547 class547_44_
				= (aClass546_7426.aClass547ArrayArrayArray7263
				   [i][i_39_][i_40_ - 1]);
			    int i_45_;
			    for (i_45_ = (aClass546_7426.aClass161Array7215
					      [i].method2577
					  (i_39_, i_38_, (byte) -52));
				 (i_40_ > 0 && class547_44_ != null
				  && class547_44_.aShort7273 < 0
				  && (class547_44_.aShort7273
				      == class547.aShort7273)
				  && (class547_44_.aShort7274
				      == class547.aShort7274)
				  && i_45_ == (aClass546_7426
						   .aClass161Array7215[i]
						   .method2577
					       (i_39_, i_40_ - 1, (byte) -19))
				  && (i_40_ - 1 <= 0
				      || (i_45_
					  == (aClass546_7426
						  .aClass161Array7215[i]
						  .method2577
					      (i_39_, i_40_ - 2, (byte) 16))))
				  && i_41_ - i_40_ <= 10);
				 class547_44_ = (aClass546_7426
						 .aClass547ArrayArrayArray7263
						 [i][i_39_][i_40_ - 1]))
				i_40_--;
			    for (class547_44_ = (aClass546_7426
						 .aClass547ArrayArrayArray7263
						 [i][i_39_][i_41_ + 1]);
				 (i_41_ < aClass546_7426.anInt7211 * 947301287
				  && class547_44_ != null
				  && class547_44_.aShort7273 < 0
				  && (class547_44_.aShort7273
				      == class547.aShort7273)
				  && (class547_44_.aShort7274
				      == class547.aShort7274)
				  && i_45_ == (aClass546_7426
						   .aClass161Array7215[i]
						   .method2577
					       (i_39_, i_41_ + 1, (byte) -89))
				  && ((i_41_ + 1
				       >= aClass546_7426.anInt7211 * 947301287)
				      || (i_45_
					  == (aClass546_7426
						  .aClass161Array7215[i]
						  .method2577
					      (i_39_, i_41_ + 2, (byte) 110))))
				  && i_41_ - i_40_ <= 10);
				 class547_44_ = (aClass546_7426
						 .aClass547ArrayArrayArray7263
						 [i][i_39_][i_41_ + 1]))
				i_41_++;
			    int i_46_ = i_43_ - i_42_ + 1;
			    int i_47_
				= aClass546_7426.aClass161Array7215
				      [bool ? i_42_ + 1 : i_42_]
				      .method2577(i_39_, i_40_, (byte) 17);
			    int i_48_ = i_47_ + class547.aShort7273 * i_46_;
			    int i_49_
				= (aClass546_7426.aClass161Array7215
				       [bool ? i_42_ + 1 : i_42_].method2577
				   (i_39_, i_41_ + 1, (byte) -60));
			    int i_50_ = i_49_ + class547.aShort7273 * i_46_;
			    int i_51_
				= (i_39_
				   << aClass546_7426.anInt7200 * 1819515263);
			    int i_52_
				= (i_40_
				   << aClass546_7426.anInt7200 * 1819515263);
			    int i_53_
				= ((i_41_
				    << aClass546_7426.anInt7200 * 1819515263)
				   + aClass546_7426.anInt7221 * -466040829);
			    aClass568Array7435[anInt7439++]
				= new Class568(aClass546_7426, 1, i_43_,
					       i_51_ + class547.aShort7274,
					       i_51_ + class547.aShort7274,
					       i_51_ + class547.aShort7274,
					       i_51_ + class547.aShort7274,
					       i_47_, i_49_, i_50_, i_48_,
					       i_52_, i_53_, i_53_, i_52_);
			    for (int i_54_ = i_42_; i_54_ <= i_43_; i_54_++) {
				for (int i_55_ = i_40_; i_55_ <= i_41_;
				     i_55_++)
				    aClass546_7426
					.aClass547ArrayArrayArray7263[i_54_]
					[i_39_][i_55_].aShort7273
					*= -1;
			    }
			}
			if (class547.aShort7270 < 0) {
			    int i_56_ = i_39_;
			    int i_57_ = i_39_;
			    int i_58_ = i;
			    int i_59_ = i;
			    Class547 class547_60_
				= (aClass546_7426.aClass547ArrayArrayArray7263
				   [i][i_56_ - 1][i_38_]);
			    int i_61_;
			    for (i_61_ = (aClass546_7426.aClass161Array7215
					      [i].method2577
					  (i_39_, i_38_, (byte) 79));
				 (i_56_ > 0 && class547_60_ != null
				  && class547_60_.aShort7270 < 0
				  && (class547_60_.aShort7270
				      == class547.aShort7270)
				  && (class547_60_.aShort7265
				      == class547.aShort7265)
				  && i_61_ == (aClass546_7426
						   .aClass161Array7215[i]
						   .method2577
					       (i_56_ - 1, i_38_, (byte) -60))
				  && (i_56_ - 1 <= 0
				      || (i_61_
					  == (aClass546_7426
						  .aClass161Array7215[i]
						  .method2577
					      (i_56_ - 2, i_38_, (byte) 36))))
				  && i_57_ - i_56_ <= 10);
				 class547_60_ = (aClass546_7426
						 .aClass547ArrayArrayArray7263
						 [i][i_56_ - 1][i_38_]))
				i_56_--;
			    for (class547_60_ = (aClass546_7426
						 .aClass547ArrayArrayArray7263
						 [i][i_57_ + 1][i_38_]);
				 (i_57_ < aClass546_7426.anInt7210 * 1761949661
				  && class547_60_ != null
				  && class547_60_.aShort7270 < 0
				  && (class547_60_.aShort7270
				      == class547.aShort7270)
				  && (class547_60_.aShort7265
				      == class547.aShort7265)
				  && i_61_ == (aClass546_7426
						   .aClass161Array7215[i]
						   .method2577
					       (i_57_ + 1, i_38_, (byte) -8))
				  && (i_57_ + 1 >= (aClass546_7426.anInt7210
						    * 1761949661)
				      || (i_61_
					  == (aClass546_7426
						  .aClass161Array7215[i]
						  .method2577
					      (i_57_ + 2, i_38_, (byte) -1))))
				  && i_57_ - i_56_ <= 10);
				 class547_60_ = (aClass546_7426
						 .aClass547ArrayArrayArray7263
						 [i][i_57_ + 1][i_38_]))
				i_57_++;
			    int i_62_ = i_59_ - i_58_ + 1;
			    int i_63_
				= aClass546_7426.aClass161Array7215
				      [bool ? i_58_ + 1 : i_58_]
				      .method2577(i_56_, i_38_, (byte) 26);
			    int i_64_ = i_63_ + class547.aShort7270 * i_62_;
			    int i_65_
				= aClass546_7426.aClass161Array7215
				      [bool ? i_58_ + 1 : i_58_]
				      .method2577(i_57_ + 1, i_38_, (byte) 19);
			    int i_66_ = i_65_ + class547.aShort7270 * i_62_;
			    int i_67_
				= (i_56_
				   << aClass546_7426.anInt7200 * 1819515263);
			    int i_68_
				= ((i_57_
				    << aClass546_7426.anInt7200 * 1819515263)
				   + aClass546_7426.anInt7221 * -466040829);
			    int i_69_
				= (i_38_
				   << aClass546_7426.anInt7200 * 1819515263);
			    aClass568Array7435[anInt7439++]
				= new Class568(aClass546_7426, 2, i_59_, i_67_,
					       i_68_, i_68_, i_67_, i_63_,
					       i_65_, i_66_, i_64_,
					       i_69_ + class547.aShort7265,
					       i_69_ + class547.aShort7265,
					       i_69_ + class547.aShort7265,
					       i_69_ + class547.aShort7265);
			    for (int i_70_ = i_58_; i_70_ <= i_59_; i_70_++) {
				for (int i_71_ = i_56_; i_71_ <= i_57_;
				     i_71_++)
				    aClass546_7426
					.aClass547ArrayArrayArray7263[i_70_]
					[i_71_][i_38_].aShort7270
					*= -1;
			    }
			}
		    }
		}
	    }
	}
	aBool7427 = true;
    }
    
    void method9179(Class182 class182, int i) {
	aClass182_7446 = class182;
	if (!aBool7434 || !aBool7421)
	    anInt7430 = 0;
	else {
	    if (aBool7451)
		aClass546_7426.aClass51_7205.method1136(-1099094416);
	    aClass182_7446.method3234(anIntArray7448);
	    if (anInt7449 != (int) ((float) anIntArray7448[0] / 3.0F)
		|| anInt7438 != (int) ((float) anIntArray7448[1] / 3.0F)) {
		anInt7449 = (int) ((float) anIntArray7448[0] / 3.0F);
		anInt7438 = (int) ((float) anIntArray7448[1] / 3.0F);
		anIntArray7445 = new int[anInt7449 * anInt7438];
	    }
	    anInt7430 = 0;
	    for (int i_72_ = 0; i_72_ < anInt7432; i_72_++)
		method9218(aClass182_7446, aClass568Array7433[i_72_], i);
	    for (int i_73_ = 0; i_73_ < anInt7439; i_73_++)
		method9218(aClass182_7446, aClass568Array7435[i_73_], i);
	    for (int i_74_ = 0; i_74_ < anInt7442; i_74_++)
		method9218(aClass182_7446, aClass568Array7437[i_74_], i);
	    aClass548_7436.anInt7284 = 0;
	    if (anInt7430 > 0) {
		int i_75_ = anIntArray7445.length;
		int i_76_ = i_75_ - i_75_ & 0x7;
		int i_77_ = 0;
		while (i_77_ < i_76_) {
		    anIntArray7445[i_77_++] = 2147483647;
		    anIntArray7445[i_77_++] = 2147483647;
		    anIntArray7445[i_77_++] = 2147483647;
		    anIntArray7445[i_77_++] = 2147483647;
		    anIntArray7445[i_77_++] = 2147483647;
		    anIntArray7445[i_77_++] = 2147483647;
		    anIntArray7445[i_77_++] = 2147483647;
		    anIntArray7445[i_77_++] = 2147483647;
		}
		while (i_77_ < i_75_)
		    anIntArray7445[i_77_++] = 2147483647;
		aClass548_7436.anInt7277 = 1;
		for (int i_78_ = 0; i_78_ < anInt7430; i_78_++) {
		    Class568 class568 = aClass568Array7431[i_78_];
		    aClass548_7436.method9106(class568.aShortArray7625[0],
					      class568.aShortArray7625[1],
					      class568.aShortArray7625[3],
					      class568.aShortArray7624[0],
					      class568.aShortArray7624[1],
					      class568.aShortArray7624[3],
					      class568.aShortArray7626[0],
					      class568.aShortArray7626[1],
					      class568.aShortArray7626[3]);
		    aClass548_7436.method9106(class568.aShortArray7625[1],
					      class568.aShortArray7625[2],
					      class568.aShortArray7625[3],
					      class568.aShortArray7624[1],
					      class568.aShortArray7624[2],
					      class568.aShortArray7624[3],
					      class568.aShortArray7626[1],
					      class568.aShortArray7626[2],
					      class568.aShortArray7626[3]);
		}
		aClass548_7436.anInt7277 = 2;
	    }
	    if (aBool7451)
		aClass546_7426.aClass51_7205.method1136(-1747173892);
	}
    }
    
    final boolean method9180(int i, int i_79_, int i_80_) {
	aClass182_7446.method3360((float) i, (float) i_79_, (float) i_80_,
				  aFloatArray7447);
	if (aFloatArray7447[2] < 50.0F)
	    return false;
	aFloatArray7447[0] /= 3.0F;
	aFloatArray7447[1] /= 3.0F;
	return true;
    }
    
    boolean method9181(int i, int i_81_, int i_82_) {
	if (!aBool7434 || !aBool7421)
	    return false;
	if (aClass548_7436.anInt7284 < 101)
	    return false;
	int i_83_ = anIntArrayArrayArray7428[i][i_81_][i_82_];
	if (i_83_ == -(aClass546_7426.anInt7261 * -852140167))
	    return false;
	if (i_83_ == aClass546_7426.anInt7261 * -852140167)
	    return true;
	if (aClass546_7426.aClass161Array7226
	    == aClass546_7426.aClass161Array7249)
	    return false;
	int i_84_ = i_81_ << aClass546_7426.anInt7200 * 1819515263;
	int i_85_ = i_82_ << aClass546_7426.anInt7200 * 1819515263;
	if (method9187(i_84_ + 1,
		       aClass546_7426.aClass161Array7226[i]
			   .method2577(i_81_, i_82_, (byte) -27),
		       i_85_ + 1,
		       i_84_ + aClass546_7426.anInt7221 * -466040829 - 1,
		       aClass546_7426.aClass161Array7226[i]
			   .method2577(i_81_ + 1, i_82_ + 1, (byte) -43),
		       i_85_ + aClass546_7426.anInt7221 * -466040829 - 1,
		       i_84_ + 1,
		       aClass546_7426.aClass161Array7226[i]
			   .method2577(i_81_, i_82_ + 1, (byte) -49),
		       i_85_ + aClass546_7426.anInt7221 * -466040829 - 1)
	    && method9187(i_84_ + 1,
			  aClass546_7426.aClass161Array7226[i]
			      .method2577(i_81_, i_82_, (byte) 113),
			  i_85_ + 1,
			  i_84_ + aClass546_7426.anInt7221 * -466040829 - 1,
			  aClass546_7426.aClass161Array7226[i]
			      .method2577(i_81_ + 1, i_82_, (byte) -104),
			  i_85_ + 1,
			  i_84_ + aClass546_7426.anInt7221 * -466040829 - 1,
			  aClass546_7426.aClass161Array7226[i]
			      .method2577(i_81_ + 1, i_82_ + 1, (byte) -79),
			  i_85_ + aClass546_7426.anInt7221 * -466040829 - 1)) {
	    anIntArrayArrayArray7428[i][i_81_][i_82_]
		= aClass546_7426.anInt7261 * -852140167;
	    return true;
	}
	anIntArrayArrayArray7428[i][i_81_][i_82_]
	    = -(aClass546_7426.anInt7261 * -852140167);
	return false;
    }
    
    boolean method9182(Class656_Sub1_Sub5 class656_sub1_sub5, int i, int i_86_,
		       int i_87_) {
	if (!aBool7434 || !aBool7421)
	    return false;
	if (aClass548_7436.anInt7284 < 101)
	    return false;
	if (!method9181(i, i_86_, i_87_))
	    return false;
	int i_88_ = i_86_ << aClass546_7426.anInt7200 * 1819515263;
	int i_89_ = i_87_ << aClass546_7426.anInt7200 * 1819515263;
	int i_90_
	    = (aClass546_7426.aClass161Array7226[i].method2577(i_86_, i_87_,
							       (byte) 5)
	       - 1);
	int i_91_ = i_90_ + class656_sub1_sub5.method16909((byte) 24);
	if (class656_sub1_sub5.aShort11952 == 1) {
	    if (!method9187(i_88_, i_90_, i_89_, i_88_, i_91_, i_89_, i_88_,
			    i_91_,
			    i_89_ + aClass546_7426.anInt7221 * -466040829))
		return false;
	    if (!method9187(i_88_, i_90_, i_89_, i_88_, i_91_,
			    i_89_ + aClass546_7426.anInt7221 * -466040829,
			    i_88_, i_90_,
			    i_89_ + aClass546_7426.anInt7221 * -466040829))
		return false;
	    return true;
	}
	if (class656_sub1_sub5.aShort11952 == 2) {
	    if (!method9187(i_88_, i_90_,
			    i_89_ + aClass546_7426.anInt7221 * -466040829,
			    i_88_ + aClass546_7426.anInt7221 * -466040829,
			    i_91_,
			    i_89_ + aClass546_7426.anInt7221 * -466040829,
			    i_88_, i_91_,
			    i_89_ + aClass546_7426.anInt7221 * -466040829))
		return false;
	    if (!method9187(i_88_, i_90_,
			    i_89_ + aClass546_7426.anInt7221 * -466040829,
			    i_88_ + aClass546_7426.anInt7221 * -466040829,
			    i_90_,
			    i_89_ + aClass546_7426.anInt7221 * -466040829,
			    i_88_ + aClass546_7426.anInt7221 * -466040829,
			    i_91_,
			    i_89_ + aClass546_7426.anInt7221 * -466040829))
		return false;
	    return true;
	}
	if (class656_sub1_sub5.aShort11952 == 4) {
	    if (!method9187(i_88_ + aClass546_7426.anInt7221 * -466040829,
			    i_90_, i_89_,
			    i_88_ + aClass546_7426.anInt7221 * -466040829,
			    i_91_, i_89_,
			    i_88_ + aClass546_7426.anInt7221 * -466040829,
			    i_91_,
			    i_89_ + aClass546_7426.anInt7221 * -466040829))
		return false;
	    if (!method9187(i_88_ + aClass546_7426.anInt7221 * -466040829,
			    i_90_, i_89_,
			    i_88_ + aClass546_7426.anInt7221 * -466040829,
			    i_91_,
			    i_89_ + aClass546_7426.anInt7221 * -466040829,
			    i_88_ + aClass546_7426.anInt7221 * -466040829,
			    i_90_,
			    i_89_ + aClass546_7426.anInt7221 * -466040829))
		return false;
	    return true;
	}
	if (class656_sub1_sub5.aShort11952 == 8) {
	    if (!method9187(i_88_, i_90_, i_89_,
			    i_88_ + aClass546_7426.anInt7221 * -466040829,
			    i_91_, i_89_, i_88_, i_91_, i_89_))
		return false;
	    if (!method9187(i_88_, i_90_, i_89_,
			    i_88_ + aClass546_7426.anInt7221 * -466040829,
			    i_90_, i_89_,
			    i_88_ + aClass546_7426.anInt7221 * -466040829,
			    i_91_, i_89_))
		return false;
	    return true;
	}
	if (class656_sub1_sub5.aShort11952 == 16) {
	    if (!method9172(i_88_, i_90_,
			    i_89_ + aClass546_7426.anInt7240 * -576707309,
			    aClass546_7426.anInt7240 * -576707309, i_91_,
			    aClass546_7426.anInt7240 * -576707309))
		return false;
	    return true;
	}
	if (class656_sub1_sub5.aShort11952 == 32) {
	    if (!method9172(i_88_ + aClass546_7426.anInt7240 * -576707309,
			    i_90_,
			    i_89_ + aClass546_7426.anInt7240 * -576707309,
			    aClass546_7426.anInt7240 * -576707309, i_91_,
			    aClass546_7426.anInt7240 * -576707309))
		return false;
	    return true;
	}
	if (class656_sub1_sub5.aShort11952 == 64) {
	    if (!method9172(i_88_ + aClass546_7426.anInt7240 * -576707309,
			    i_90_, i_89_,
			    aClass546_7426.anInt7240 * -576707309, i_91_,
			    aClass546_7426.anInt7240 * -576707309))
		return false;
	    return true;
	}
	if (class656_sub1_sub5.aShort11952 == 128) {
	    if (!method9172(i_88_, i_90_, i_89_,
			    aClass546_7426.anInt7240 * -576707309, i_91_,
			    aClass546_7426.anInt7240 * -576707309))
		return false;
	    return true;
	}
	return true;
    }
    
    boolean method9183(int i, int i_92_, int i_93_, int i_94_) {
	if (!aBool7434 || !aBool7421)
	    return false;
	if (aClass548_7436.anInt7284 < 101)
	    return false;
	if (!method9181(i, i_92_, i_93_))
	    return false;
	int i_95_ = i_92_ << aClass546_7426.anInt7200 * 1819515263;
	int i_96_ = i_93_ << aClass546_7426.anInt7200 * 1819515263;
	if (method9172(i_95_,
		       aClass546_7426.aClass161Array7226[i]
			   .method2577(i_92_, i_93_, (byte) 111),
		       i_96_, aClass546_7426.anInt7221 * -466040829, i_94_,
		       aClass546_7426.anInt7221 * -466040829))
	    return true;
	return false;
    }
    
    boolean method9184(int i, int i_97_, int i_98_, int i_99_, int i_100_,
		       Class553 class553) {
	if (!aBool7434 || !aBool7421)
	    return false;
	if (aClass548_7436.anInt7284 < 101)
	    return false;
	if (i_97_ < 0 || i_99_ < 0
	    || i_98_ >= anIntArrayArrayArray7428[i].length
	    || i_100_ >= anIntArrayArrayArray7428[i][i_97_].length)
	    return false;
	if (i_97_ == i_98_ && i_99_ == i_100_) {
	    if (!method9181(i, i_97_, i_99_))
		return false;
	    if (method9219(class553))
		return true;
	    return false;
	}
	for (int i_101_ = i_97_; i_101_ <= i_98_; i_101_++) {
	    for (int i_102_ = i_99_; i_102_ <= i_100_; i_102_++) {
		if (anIntArrayArrayArray7428[i][i_101_][i_102_]
		    == -(aClass546_7426.anInt7261 * -852140167))
		    return false;
	    }
	}
	if (!method9219(class553))
	    return false;
	return true;
    }
    
    boolean method9185(Class568 class568, int i) {
	if (!method9180(class568.anIntArray7621[i], class568.anIntArray7622[i],
			class568.anIntArray7623[i]))
	    return false;
	class568.aShortArray7624[i] = (short) (int) aFloatArray7447[0];
	class568.aShortArray7625[i] = (short) (int) aFloatArray7447[1];
	class568.aShortArray7626[i] = (short) (int) aFloatArray7447[2];
	return true;
    }
    
    void method9186(Class182 class182, int i) {
	aClass182_7446 = class182;
	if (!aBool7434 || !aBool7421)
	    anInt7430 = 0;
	else {
	    if (aBool7451)
		aClass546_7426.aClass51_7205.method1136(-992752804);
	    aClass182_7446.method3234(anIntArray7448);
	    if (anInt7449 != (int) ((float) anIntArray7448[0] / 3.0F)
		|| anInt7438 != (int) ((float) anIntArray7448[1] / 3.0F)) {
		anInt7449 = (int) ((float) anIntArray7448[0] / 3.0F);
		anInt7438 = (int) ((float) anIntArray7448[1] / 3.0F);
		anIntArray7445 = new int[anInt7449 * anInt7438];
	    }
	    anInt7430 = 0;
	    for (int i_103_ = 0; i_103_ < anInt7432; i_103_++)
		method9218(aClass182_7446, aClass568Array7433[i_103_], i);
	    for (int i_104_ = 0; i_104_ < anInt7439; i_104_++)
		method9218(aClass182_7446, aClass568Array7435[i_104_], i);
	    for (int i_105_ = 0; i_105_ < anInt7442; i_105_++)
		method9218(aClass182_7446, aClass568Array7437[i_105_], i);
	    aClass548_7436.anInt7284 = 0;
	    if (anInt7430 > 0) {
		int i_106_ = anIntArray7445.length;
		int i_107_ = i_106_ - i_106_ & 0x7;
		int i_108_ = 0;
		while (i_108_ < i_107_) {
		    anIntArray7445[i_108_++] = 2147483647;
		    anIntArray7445[i_108_++] = 2147483647;
		    anIntArray7445[i_108_++] = 2147483647;
		    anIntArray7445[i_108_++] = 2147483647;
		    anIntArray7445[i_108_++] = 2147483647;
		    anIntArray7445[i_108_++] = 2147483647;
		    anIntArray7445[i_108_++] = 2147483647;
		    anIntArray7445[i_108_++] = 2147483647;
		}
		while (i_108_ < i_106_)
		    anIntArray7445[i_108_++] = 2147483647;
		aClass548_7436.anInt7277 = 1;
		for (int i_109_ = 0; i_109_ < anInt7430; i_109_++) {
		    Class568 class568 = aClass568Array7431[i_109_];
		    aClass548_7436.method9106(class568.aShortArray7625[0],
					      class568.aShortArray7625[1],
					      class568.aShortArray7625[3],
					      class568.aShortArray7624[0],
					      class568.aShortArray7624[1],
					      class568.aShortArray7624[3],
					      class568.aShortArray7626[0],
					      class568.aShortArray7626[1],
					      class568.aShortArray7626[3]);
		    aClass548_7436.method9106(class568.aShortArray7625[1],
					      class568.aShortArray7625[2],
					      class568.aShortArray7625[3],
					      class568.aShortArray7624[1],
					      class568.aShortArray7624[2],
					      class568.aShortArray7624[3],
					      class568.aShortArray7626[1],
					      class568.aShortArray7626[2],
					      class568.aShortArray7626[3]);
		}
		aClass548_7436.anInt7277 = 2;
	    }
	    if (aBool7451)
		aClass546_7426.aClass51_7205.method1136(-1561553789);
	}
    }
    
    final boolean method9187(int i, int i_110_, int i_111_, int i_112_,
			     int i_113_, int i_114_, int i_115_, int i_116_,
			     int i_117_) {
	if (!method9180(i, i_110_, i_111_))
	    return false;
	i = (int) aFloatArray7447[0];
	i_110_ = (int) aFloatArray7447[1];
	i_111_ = (int) aFloatArray7447[2];
	if (!method9180(i_112_, i_113_, i_114_))
	    return false;
	i_112_ = (int) aFloatArray7447[0];
	i_113_ = (int) aFloatArray7447[1];
	i_114_ = (int) aFloatArray7447[2];
	if (!method9180(i_115_, i_116_, i_117_))
	    return false;
	i_115_ = (int) aFloatArray7447[0];
	i_116_ = (int) aFloatArray7447[1];
	i_117_ = (int) aFloatArray7447[2];
	return aClass548_7436.method9106(i_110_, i_113_, i_116_, i, i_112_,
					 i_115_, i_111_, i_114_, i_117_);
    }
    
    public void method9188(int i, int i_118_, int i_119_, int i_120_,
			   int i_121_, int i_122_) {
	if (i == 8 || i == 16) {
	    if (i == 8) {
		int i_123_ = i_119_ << aClass546_7426.anInt7200 * 1819515263;
		int i_124_ = i_123_ + aClass546_7426.anInt7221 * -466040829;
		int i_125_ = i_120_ << aClass546_7426.anInt7200 * 1819515263;
		int i_126_ = i_125_ + aClass546_7426.anInt7221 * -466040829;
		int i_127_ = aClass546_7426.aClass161Array7215[i_118_]
				 .method2577(i_119_, i_120_, (byte) -98);
		int i_128_
		    = aClass546_7426.aClass161Array7215[i_118_]
			  .method2577(i_119_ + 1, i_120_ + 1, (byte) -39);
		aClass568Array7437[anInt7442++]
		    = new Class568(aClass546_7426, i, i_118_, i_123_, i_124_,
				   i_124_, i_123_, i_127_, i_128_,
				   i_128_ - i_121_, i_127_ - i_121_, i_125_,
				   i_126_, i_126_, i_125_);
	    } else {
		int i_129_ = ((i_119_ << aClass546_7426.anInt7200 * 1819515263)
			      + aClass546_7426.anInt7221 * -466040829);
		int i_130_ = i_129_ - aClass546_7426.anInt7221 * -466040829;
		int i_131_ = i_120_ << aClass546_7426.anInt7200 * 1819515263;
		int i_132_ = i_131_ + aClass546_7426.anInt7221 * -466040829;
		int i_133_ = aClass546_7426.aClass161Array7215[i_118_]
				 .method2577(i_119_ + 1, i_120_, (byte) 33);
		int i_134_ = aClass546_7426.aClass161Array7215[i_118_]
				 .method2577(i_119_, i_120_ + 1, (byte) 8);
		aClass568Array7437[anInt7442++]
		    = new Class568(aClass546_7426, i, i_118_, i_129_, i_130_,
				   i_130_, i_129_, i_133_, i_134_,
				   i_134_ - i_121_, i_133_ - i_121_, i_131_,
				   i_132_, i_132_, i_131_);
	    }
	} else {
	    Class547 class547 = (aClass546_7426.aClass547ArrayArrayArray7263
				 [i_118_][i_119_][i_120_]);
	    if (class547 == null)
		aClass546_7426.aClass547ArrayArrayArray7263[i_118_][i_119_]
		    [i_120_]
		    = class547 = new Class547(i_118_);
	    if (i == 1) {
		class547.aShort7273 = (short) i_121_;
		class547.aShort7274 = (short) i_122_;
	    } else if (i == 2) {
		class547.aShort7270 = (short) i_121_;
		class547.aShort7265 = (short) i_122_;
	    }
	    if (aBool7427)
		method9178();
	}
    }
    
    public void method9189(int i, int i_135_, int i_136_, int i_137_) {
	if (i == 8 || i == 16) {
	    for (int i_138_ = 0; i_138_ < anInt7442; i_138_++) {
		Class568 class568 = aClass568Array7437[i_138_];
		if (class568.aByte7615 == i && class568.aByte7616 == i_135_
		    && ((class568.aShort7617 == i_136_
			 && class568.aShort7618 == i_137_)
			|| (class568.aShort7610 == i_136_
			    && class568.aShort7620 == i_137_))) {
		    if (i_138_ != anInt7442)
			System.arraycopy(aClass568Array7437, i_138_ + 1,
					 aClass568Array7437, i_138_,
					 aClass568Array7437.length - (i_138_
								      + 1));
		    anInt7442--;
		    break;
		}
	    }
	} else {
	    Class547 class547 = (aClass546_7426.aClass547ArrayArrayArray7263
				 [i_135_][i_136_][i_137_]);
	    if (class547 != null) {
		if (i == 1)
		    class547.aShort7273 = (short) 0;
		else if (i == 2)
		    class547.aShort7270 = (short) 0;
	    }
	    method9178();
	}
    }
    
    void method9190(Class182 class182, int i) {
	aClass182_7446 = class182;
	if (!aBool7434 || !aBool7421)
	    anInt7430 = 0;
	else {
	    if (aBool7451)
		aClass546_7426.aClass51_7205.method1136(-1528962976);
	    aClass182_7446.method3234(anIntArray7448);
	    if (anInt7449 != (int) ((float) anIntArray7448[0] / 3.0F)
		|| anInt7438 != (int) ((float) anIntArray7448[1] / 3.0F)) {
		anInt7449 = (int) ((float) anIntArray7448[0] / 3.0F);
		anInt7438 = (int) ((float) anIntArray7448[1] / 3.0F);
		anIntArray7445 = new int[anInt7449 * anInt7438];
	    }
	    anInt7430 = 0;
	    for (int i_139_ = 0; i_139_ < anInt7432; i_139_++)
		method9218(aClass182_7446, aClass568Array7433[i_139_], i);
	    for (int i_140_ = 0; i_140_ < anInt7439; i_140_++)
		method9218(aClass182_7446, aClass568Array7435[i_140_], i);
	    for (int i_141_ = 0; i_141_ < anInt7442; i_141_++)
		method9218(aClass182_7446, aClass568Array7437[i_141_], i);
	    aClass548_7436.anInt7284 = 0;
	    if (anInt7430 > 0) {
		int i_142_ = anIntArray7445.length;
		int i_143_ = i_142_ - i_142_ & 0x7;
		int i_144_ = 0;
		while (i_144_ < i_143_) {
		    anIntArray7445[i_144_++] = 2147483647;
		    anIntArray7445[i_144_++] = 2147483647;
		    anIntArray7445[i_144_++] = 2147483647;
		    anIntArray7445[i_144_++] = 2147483647;
		    anIntArray7445[i_144_++] = 2147483647;
		    anIntArray7445[i_144_++] = 2147483647;
		    anIntArray7445[i_144_++] = 2147483647;
		    anIntArray7445[i_144_++] = 2147483647;
		}
		while (i_144_ < i_142_)
		    anIntArray7445[i_144_++] = 2147483647;
		aClass548_7436.anInt7277 = 1;
		for (int i_145_ = 0; i_145_ < anInt7430; i_145_++) {
		    Class568 class568 = aClass568Array7431[i_145_];
		    aClass548_7436.method9106(class568.aShortArray7625[0],
					      class568.aShortArray7625[1],
					      class568.aShortArray7625[3],
					      class568.aShortArray7624[0],
					      class568.aShortArray7624[1],
					      class568.aShortArray7624[3],
					      class568.aShortArray7626[0],
					      class568.aShortArray7626[1],
					      class568.aShortArray7626[3]);
		    aClass548_7436.method9106(class568.aShortArray7625[1],
					      class568.aShortArray7625[2],
					      class568.aShortArray7625[3],
					      class568.aShortArray7624[1],
					      class568.aShortArray7624[2],
					      class568.aShortArray7624[3],
					      class568.aShortArray7626[1],
					      class568.aShortArray7626[2],
					      class568.aShortArray7626[3]);
		}
		aClass548_7436.anInt7277 = 2;
	    }
	    if (aBool7451)
		aClass546_7426.aClass51_7205.method1136(-1023675251);
	}
    }
    
    public void method9191(int i, int i_146_, int i_147_, int i_148_,
			   int i_149_, int i_150_, int i_151_, int i_152_) {
	aClass568Array7433[anInt7432++]
	    = new Class568(aClass546_7426, i, i_146_, i_147_, i_148_, i_148_,
			   i_147_, i_151_, i_152_, i_152_, i_151_, i_149_,
			   i_149_, i_150_, i_150_);
    }
    
    public void method9192(int i, int i_153_, int i_154_, int i_155_) {
	if (i == 8 || i == 16) {
	    for (int i_156_ = 0; i_156_ < anInt7442; i_156_++) {
		Class568 class568 = aClass568Array7437[i_156_];
		if (class568.aByte7615 == i && class568.aByte7616 == i_153_
		    && ((class568.aShort7617 == i_154_
			 && class568.aShort7618 == i_155_)
			|| (class568.aShort7610 == i_154_
			    && class568.aShort7620 == i_155_))) {
		    if (i_156_ != anInt7442)
			System.arraycopy(aClass568Array7437, i_156_ + 1,
					 aClass568Array7437, i_156_,
					 aClass568Array7437.length - (i_156_
								      + 1));
		    anInt7442--;
		    break;
		}
	    }
	} else {
	    Class547 class547 = (aClass546_7426.aClass547ArrayArrayArray7263
				 [i_153_][i_154_][i_155_]);
	    if (class547 != null) {
		if (i == 1)
		    class547.aShort7273 = (short) 0;
		else if (i == 2)
		    class547.aShort7270 = (short) 0;
	    }
	    method9178();
	}
    }
    
    public void method9193(int i, int i_157_, int i_158_, int i_159_) {
	if (i == 8 || i == 16) {
	    for (int i_160_ = 0; i_160_ < anInt7442; i_160_++) {
		Class568 class568 = aClass568Array7437[i_160_];
		if (class568.aByte7615 == i && class568.aByte7616 == i_157_
		    && ((class568.aShort7617 == i_158_
			 && class568.aShort7618 == i_159_)
			|| (class568.aShort7610 == i_158_
			    && class568.aShort7620 == i_159_))) {
		    if (i_160_ != anInt7442)
			System.arraycopy(aClass568Array7437, i_160_ + 1,
					 aClass568Array7437, i_160_,
					 aClass568Array7437.length - (i_160_
								      + 1));
		    anInt7442--;
		    break;
		}
	    }
	} else {
	    Class547 class547 = (aClass546_7426.aClass547ArrayArrayArray7263
				 [i_157_][i_158_][i_159_]);
	    if (class547 != null) {
		if (i == 1)
		    class547.aShort7273 = (short) 0;
		else if (i == 2)
		    class547.aShort7270 = (short) 0;
	    }
	    method9178();
	}
    }
    
    public void method9194() {
	method9178();
    }
    
    final boolean method9195(int i, int i_161_, int i_162_, int i_163_,
			     int i_164_, int i_165_) {
	int i_166_ = i + i_163_;
	int i_167_ = i_161_ + i_164_;
	int i_168_ = i_162_ + i_165_;
	if (!method9187(i, i_167_, i_162_, i_166_, i_167_, i_168_, i, i_167_,
			i_168_))
	    return false;
	if (!method9187(i, i_167_, i_162_, i_166_, i_167_, i_162_, i_166_,
			i_167_, i_168_))
	    return false;
	if (i < aClass546_7426.anInt7238 * 1787068049) {
	    if (!method9187(i, i_161_, i_168_, i, i_167_, i_162_, i, i_167_,
			    i_168_))
		return false;
	    if (!method9187(i, i_161_, i_168_, i, i_161_, i_162_, i, i_167_,
			    i_162_))
		return false;
	} else {
	    if (!method9187(i_166_, i_161_, i_168_, i_166_, i_167_, i_162_,
			    i_166_, i_167_, i_168_))
		return false;
	    if (!method9187(i_166_, i_161_, i_168_, i_166_, i_161_, i_162_,
			    i_166_, i_167_, i_162_))
		return false;
	}
	if (i_162_ < aClass546_7426.anInt7239 * 934728119) {
	    if (!method9187(i, i_161_, i_162_, i_166_, i_167_, i_162_, i,
			    i_167_, i_162_))
		return false;
	    if (!method9187(i, i_161_, i_162_, i_166_, i_161_, i_162_, i_166_,
			    i_167_, i_162_))
		return false;
	} else {
	    if (!method9187(i, i_161_, i_168_, i_166_, i_167_, i_168_, i,
			    i_167_, i_168_))
		return false;
	    if (!method9187(i, i_161_, i_168_, i_166_, i_161_, i_168_, i_166_,
			    i_167_, i_168_))
		return false;
	}
	return true;
    }
    
    public void method9196() {
	method9178();
    }
    
    void method9197(Class182 class182, int i) {
	aClass182_7446 = class182;
	if (!aBool7434 || !aBool7421)
	    anInt7430 = 0;
	else {
	    if (aBool7451)
		aClass546_7426.aClass51_7205.method1136(-2115406405);
	    aClass182_7446.method3234(anIntArray7448);
	    if (anInt7449 != (int) ((float) anIntArray7448[0] / 3.0F)
		|| anInt7438 != (int) ((float) anIntArray7448[1] / 3.0F)) {
		anInt7449 = (int) ((float) anIntArray7448[0] / 3.0F);
		anInt7438 = (int) ((float) anIntArray7448[1] / 3.0F);
		anIntArray7445 = new int[anInt7449 * anInt7438];
	    }
	    anInt7430 = 0;
	    for (int i_169_ = 0; i_169_ < anInt7432; i_169_++)
		method9218(aClass182_7446, aClass568Array7433[i_169_], i);
	    for (int i_170_ = 0; i_170_ < anInt7439; i_170_++)
		method9218(aClass182_7446, aClass568Array7435[i_170_], i);
	    for (int i_171_ = 0; i_171_ < anInt7442; i_171_++)
		method9218(aClass182_7446, aClass568Array7437[i_171_], i);
	    aClass548_7436.anInt7284 = 0;
	    if (anInt7430 > 0) {
		int i_172_ = anIntArray7445.length;
		int i_173_ = i_172_ - i_172_ & 0x7;
		int i_174_ = 0;
		while (i_174_ < i_173_) {
		    anIntArray7445[i_174_++] = 2147483647;
		    anIntArray7445[i_174_++] = 2147483647;
		    anIntArray7445[i_174_++] = 2147483647;
		    anIntArray7445[i_174_++] = 2147483647;
		    anIntArray7445[i_174_++] = 2147483647;
		    anIntArray7445[i_174_++] = 2147483647;
		    anIntArray7445[i_174_++] = 2147483647;
		    anIntArray7445[i_174_++] = 2147483647;
		}
		while (i_174_ < i_172_)
		    anIntArray7445[i_174_++] = 2147483647;
		aClass548_7436.anInt7277 = 1;
		for (int i_175_ = 0; i_175_ < anInt7430; i_175_++) {
		    Class568 class568 = aClass568Array7431[i_175_];
		    aClass548_7436.method9106(class568.aShortArray7625[0],
					      class568.aShortArray7625[1],
					      class568.aShortArray7625[3],
					      class568.aShortArray7624[0],
					      class568.aShortArray7624[1],
					      class568.aShortArray7624[3],
					      class568.aShortArray7626[0],
					      class568.aShortArray7626[1],
					      class568.aShortArray7626[3]);
		    aClass548_7436.method9106(class568.aShortArray7625[1],
					      class568.aShortArray7625[2],
					      class568.aShortArray7625[3],
					      class568.aShortArray7624[1],
					      class568.aShortArray7624[2],
					      class568.aShortArray7624[3],
					      class568.aShortArray7626[1],
					      class568.aShortArray7626[2],
					      class568.aShortArray7626[3]);
		}
		aClass548_7436.anInt7277 = 2;
	    }
	    if (aBool7451)
		aClass546_7426.aClass51_7205.method1136(-2068111344);
	}
    }
    
    void method9198() {
	for (int i = 0; i < anInt7439; i++)
	    aClass568Array7435[i] = null;
	anInt7439 = 0;
	for (int i = 0; i < aClass546_7426.anInt7241 * 230317859; i++) {
	    for (int i_176_ = 0;
		 i_176_ < aClass546_7426.anInt7210 * 1761949661; i_176_++) {
		for (int i_177_ = 0;
		     i_177_ < aClass546_7426.anInt7211 * 947301287; i_177_++) {
		    Class547 class547
			= (aClass546_7426.aClass547ArrayArrayArray7263[i]
			   [i_177_][i_176_]);
		    if (class547 != null) {
			if (class547.aShort7273 > 0)
			    class547.aShort7273 *= -1;
			if (class547.aShort7270 > 0)
			    class547.aShort7270 *= -1;
		    }
		}
	    }
	}
	for (int i = 0; i < aClass546_7426.anInt7241 * 230317859; i++) {
	    for (int i_178_ = 0;
		 i_178_ < aClass546_7426.anInt7210 * 1761949661; i_178_++) {
		for (int i_179_ = 0;
		     i_179_ < aClass546_7426.anInt7211 * 947301287; i_179_++) {
		    Class547 class547
			= (aClass546_7426.aClass547ArrayArrayArray7263[i]
			   [i_179_][i_178_]);
		    if (class547 != null) {
			boolean bool
			    = ((aClass546_7426.aClass547ArrayArrayArray7263[0]
				[i_179_][i_178_]) != null
			       && ((aClass546_7426.aClass547ArrayArrayArray7263
				    [0][i_179_][i_178_].aClass547_7269)
				   != null));
			if (class547.aShort7273 < 0) {
			    int i_180_ = i_178_;
			    int i_181_ = i_178_;
			    int i_182_ = i;
			    int i_183_ = i;
			    Class547 class547_184_
				= (aClass546_7426.aClass547ArrayArrayArray7263
				   [i][i_179_][i_180_ - 1]);
			    int i_185_;
			    for (i_185_ = (aClass546_7426
					       .aClass161Array7215[i]
					       .method2577
					   (i_179_, i_178_, (byte) -54));
				 (i_180_ > 0 && class547_184_ != null
				  && class547_184_.aShort7273 < 0
				  && (class547_184_.aShort7273
				      == class547.aShort7273)
				  && (class547_184_.aShort7274
				      == class547.aShort7274)
				  && (i_185_
				      == (aClass546_7426.aClass161Array7215
					      [i].method2577
					  (i_179_, i_180_ - 1, (byte) -25)))
				  && (i_180_ - 1 <= 0
				      || (i_185_
					  == (aClass546_7426
						  .aClass161Array7215[i]
						  .method2577
					      (i_179_, i_180_ - 2, (byte) 8))))
				  && i_181_ - i_180_ <= 10);
				 class547_184_ = (aClass546_7426
						  .aClass547ArrayArrayArray7263
						  [i][i_179_][i_180_ - 1]))
				i_180_--;
			    for (class547_184_ = (aClass546_7426
						  .aClass547ArrayArrayArray7263
						  [i][i_179_][i_181_ + 1]);
				 (i_181_ < aClass546_7426.anInt7211 * 947301287
				  && class547_184_ != null
				  && class547_184_.aShort7273 < 0
				  && (class547_184_.aShort7273
				      == class547.aShort7273)
				  && (class547_184_.aShort7274
				      == class547.aShort7274)
				  && (i_185_
				      == (aClass546_7426.aClass161Array7215
					      [i].method2577
					  (i_179_, i_181_ + 1, (byte) 66)))
				  && ((i_181_ + 1
				       >= aClass546_7426.anInt7211 * 947301287)
				      || i_185_ == (aClass546_7426
							.aClass161Array7215[i]
							.method2577
						    (i_179_, i_181_ + 2,
						     (byte) 68)))
				  && i_181_ - i_180_ <= 10);
				 class547_184_ = (aClass546_7426
						  .aClass547ArrayArrayArray7263
						  [i][i_179_][i_181_ + 1]))
				i_181_++;
			    int i_186_ = i_183_ - i_182_ + 1;
			    int i_187_
				= aClass546_7426.aClass161Array7215
				      [bool ? i_182_ + 1 : i_182_]
				      .method2577(i_179_, i_180_, (byte) -5);
			    int i_188_ = i_187_ + class547.aShort7273 * i_186_;
			    int i_189_
				= (aClass546_7426.aClass161Array7215
				       [bool ? i_182_ + 1 : i_182_].method2577
				   (i_179_, i_181_ + 1, (byte) -39));
			    int i_190_ = i_189_ + class547.aShort7273 * i_186_;
			    int i_191_
				= (i_179_
				   << aClass546_7426.anInt7200 * 1819515263);
			    int i_192_
				= (i_180_
				   << aClass546_7426.anInt7200 * 1819515263);
			    int i_193_
				= ((i_181_
				    << aClass546_7426.anInt7200 * 1819515263)
				   + aClass546_7426.anInt7221 * -466040829);
			    aClass568Array7435[anInt7439++]
				= new Class568(aClass546_7426, 1, i_183_,
					       i_191_ + class547.aShort7274,
					       i_191_ + class547.aShort7274,
					       i_191_ + class547.aShort7274,
					       i_191_ + class547.aShort7274,
					       i_187_, i_189_, i_190_, i_188_,
					       i_192_, i_193_, i_193_, i_192_);
			    for (int i_194_ = i_182_; i_194_ <= i_183_;
				 i_194_++) {
				for (int i_195_ = i_180_; i_195_ <= i_181_;
				     i_195_++)
				    aClass546_7426
					.aClass547ArrayArrayArray7263[i_194_]
					[i_179_][i_195_].aShort7273
					*= -1;
			    }
			}
			if (class547.aShort7270 < 0) {
			    int i_196_ = i_179_;
			    int i_197_ = i_179_;
			    int i_198_ = i;
			    int i_199_ = i;
			    Class547 class547_200_
				= (aClass546_7426.aClass547ArrayArrayArray7263
				   [i][i_196_ - 1][i_178_]);
			    int i_201_;
			    for (i_201_ = (aClass546_7426
					       .aClass161Array7215[i]
					       .method2577
					   (i_179_, i_178_, (byte) -64));
				 (i_196_ > 0 && class547_200_ != null
				  && class547_200_.aShort7270 < 0
				  && (class547_200_.aShort7270
				      == class547.aShort7270)
				  && (class547_200_.aShort7265
				      == class547.aShort7265)
				  && i_201_ == (aClass546_7426
						    .aClass161Array7215[i]
						    .method2577
						(i_196_ - 1, i_178_, (byte) 6))
				  && (i_196_ - 1 <= 0
				      || i_201_ == (aClass546_7426
							.aClass161Array7215[i]
							.method2577
						    (i_196_ - 2, i_178_,
						     (byte) 49)))
				  && i_197_ - i_196_ <= 10);
				 class547_200_ = (aClass546_7426
						  .aClass547ArrayArrayArray7263
						  [i][i_196_ - 1][i_178_]))
				i_196_--;
			    for (class547_200_ = (aClass546_7426
						  .aClass547ArrayArrayArray7263
						  [i][i_197_ + 1][i_178_]);
				 ((i_197_
				   < aClass546_7426.anInt7210 * 1761949661)
				  && class547_200_ != null
				  && class547_200_.aShort7270 < 0
				  && (class547_200_.aShort7270
				      == class547.aShort7270)
				  && (class547_200_.aShort7265
				      == class547.aShort7265)
				  && (i_201_
				      == (aClass546_7426.aClass161Array7215
					      [i].method2577
					  (i_197_ + 1, i_178_, (byte) 44)))
				  && (i_197_ + 1 >= (aClass546_7426.anInt7210
						     * 1761949661)
				      || i_201_ == (aClass546_7426
							.aClass161Array7215[i]
							.method2577
						    (i_197_ + 2, i_178_,
						     (byte) 40)))
				  && i_197_ - i_196_ <= 10);
				 class547_200_ = (aClass546_7426
						  .aClass547ArrayArrayArray7263
						  [i][i_197_ + 1][i_178_]))
				i_197_++;
			    int i_202_ = i_199_ - i_198_ + 1;
			    int i_203_
				= aClass546_7426.aClass161Array7215
				      [bool ? i_198_ + 1 : i_198_]
				      .method2577(i_196_, i_178_, (byte) -20);
			    int i_204_ = i_203_ + class547.aShort7270 * i_202_;
			    int i_205_
				= (aClass546_7426.aClass161Array7215
				       [bool ? i_198_ + 1 : i_198_].method2577
				   (i_197_ + 1, i_178_, (byte) 96));
			    int i_206_ = i_205_ + class547.aShort7270 * i_202_;
			    int i_207_
				= (i_196_
				   << aClass546_7426.anInt7200 * 1819515263);
			    int i_208_
				= ((i_197_
				    << aClass546_7426.anInt7200 * 1819515263)
				   + aClass546_7426.anInt7221 * -466040829);
			    int i_209_
				= (i_178_
				   << aClass546_7426.anInt7200 * 1819515263);
			    aClass568Array7435[anInt7439++]
				= new Class568(aClass546_7426, 2, i_199_,
					       i_207_, i_208_, i_208_, i_207_,
					       i_203_, i_205_, i_206_, i_204_,
					       i_209_ + class547.aShort7265,
					       i_209_ + class547.aShort7265,
					       i_209_ + class547.aShort7265,
					       i_209_ + class547.aShort7265);
			    for (int i_210_ = i_198_; i_210_ <= i_199_;
				 i_210_++) {
				for (int i_211_ = i_196_; i_211_ <= i_197_;
				     i_211_++)
				    aClass546_7426
					.aClass547ArrayArrayArray7263[i_210_]
					[i_211_][i_178_].aShort7270
					*= -1;
			    }
			}
		    }
		}
	    }
	}
	aBool7427 = true;
    }
    
    void method9199() {
	for (int i = 0; i < anInt7439; i++)
	    aClass568Array7435[i] = null;
	anInt7439 = 0;
	for (int i = 0; i < aClass546_7426.anInt7241 * 230317859; i++) {
	    for (int i_212_ = 0;
		 i_212_ < aClass546_7426.anInt7210 * 1761949661; i_212_++) {
		for (int i_213_ = 0;
		     i_213_ < aClass546_7426.anInt7211 * 947301287; i_213_++) {
		    Class547 class547
			= (aClass546_7426.aClass547ArrayArrayArray7263[i]
			   [i_213_][i_212_]);
		    if (class547 != null) {
			if (class547.aShort7273 > 0)
			    class547.aShort7273 *= -1;
			if (class547.aShort7270 > 0)
			    class547.aShort7270 *= -1;
		    }
		}
	    }
	}
	for (int i = 0; i < aClass546_7426.anInt7241 * 230317859; i++) {
	    for (int i_214_ = 0;
		 i_214_ < aClass546_7426.anInt7210 * 1761949661; i_214_++) {
		for (int i_215_ = 0;
		     i_215_ < aClass546_7426.anInt7211 * 947301287; i_215_++) {
		    Class547 class547
			= (aClass546_7426.aClass547ArrayArrayArray7263[i]
			   [i_215_][i_214_]);
		    if (class547 != null) {
			boolean bool
			    = ((aClass546_7426.aClass547ArrayArrayArray7263[0]
				[i_215_][i_214_]) != null
			       && ((aClass546_7426.aClass547ArrayArrayArray7263
				    [0][i_215_][i_214_].aClass547_7269)
				   != null));
			if (class547.aShort7273 < 0) {
			    int i_216_ = i_214_;
			    int i_217_ = i_214_;
			    int i_218_ = i;
			    int i_219_ = i;
			    Class547 class547_220_
				= (aClass546_7426.aClass547ArrayArrayArray7263
				   [i][i_215_][i_216_ - 1]);
			    int i_221_;
			    for (i_221_ = (aClass546_7426
					       .aClass161Array7215[i]
					       .method2577
					   (i_215_, i_214_, (byte) 12));
				 (i_216_ > 0 && class547_220_ != null
				  && class547_220_.aShort7273 < 0
				  && (class547_220_.aShort7273
				      == class547.aShort7273)
				  && (class547_220_.aShort7274
				      == class547.aShort7274)
				  && (i_221_
				      == (aClass546_7426.aClass161Array7215
					      [i].method2577
					  (i_215_, i_216_ - 1, (byte) 63)))
				  && (i_216_ - 1 <= 0
				      || i_221_ == (aClass546_7426
							.aClass161Array7215[i]
							.method2577
						    (i_215_, i_216_ - 2,
						     (byte) 55)))
				  && i_217_ - i_216_ <= 10);
				 class547_220_ = (aClass546_7426
						  .aClass547ArrayArrayArray7263
						  [i][i_215_][i_216_ - 1]))
				i_216_--;
			    for (class547_220_ = (aClass546_7426
						  .aClass547ArrayArrayArray7263
						  [i][i_215_][i_217_ + 1]);
				 (i_217_ < aClass546_7426.anInt7211 * 947301287
				  && class547_220_ != null
				  && class547_220_.aShort7273 < 0
				  && (class547_220_.aShort7273
				      == class547.aShort7273)
				  && (class547_220_.aShort7274
				      == class547.aShort7274)
				  && i_221_ == (aClass546_7426
						    .aClass161Array7215[i]
						    .method2577
						(i_215_, i_217_ + 1, (byte) 8))
				  && ((i_217_ + 1
				       >= aClass546_7426.anInt7211 * 947301287)
				      || i_221_ == (aClass546_7426
							.aClass161Array7215[i]
							.method2577
						    (i_215_, i_217_ + 2,
						     (byte) -75)))
				  && i_217_ - i_216_ <= 10);
				 class547_220_ = (aClass546_7426
						  .aClass547ArrayArrayArray7263
						  [i][i_215_][i_217_ + 1]))
				i_217_++;
			    int i_222_ = i_219_ - i_218_ + 1;
			    int i_223_
				= aClass546_7426.aClass161Array7215
				      [bool ? i_218_ + 1 : i_218_]
				      .method2577(i_215_, i_216_, (byte) 51);
			    int i_224_ = i_223_ + class547.aShort7273 * i_222_;
			    int i_225_
				= (aClass546_7426.aClass161Array7215
				       [bool ? i_218_ + 1 : i_218_].method2577
				   (i_215_, i_217_ + 1, (byte) 15));
			    int i_226_ = i_225_ + class547.aShort7273 * i_222_;
			    int i_227_
				= (i_215_
				   << aClass546_7426.anInt7200 * 1819515263);
			    int i_228_
				= (i_216_
				   << aClass546_7426.anInt7200 * 1819515263);
			    int i_229_
				= ((i_217_
				    << aClass546_7426.anInt7200 * 1819515263)
				   + aClass546_7426.anInt7221 * -466040829);
			    aClass568Array7435[anInt7439++]
				= new Class568(aClass546_7426, 1, i_219_,
					       i_227_ + class547.aShort7274,
					       i_227_ + class547.aShort7274,
					       i_227_ + class547.aShort7274,
					       i_227_ + class547.aShort7274,
					       i_223_, i_225_, i_226_, i_224_,
					       i_228_, i_229_, i_229_, i_228_);
			    for (int i_230_ = i_218_; i_230_ <= i_219_;
				 i_230_++) {
				for (int i_231_ = i_216_; i_231_ <= i_217_;
				     i_231_++)
				    aClass546_7426
					.aClass547ArrayArrayArray7263[i_230_]
					[i_215_][i_231_].aShort7273
					*= -1;
			    }
			}
			if (class547.aShort7270 < 0) {
			    int i_232_ = i_215_;
			    int i_233_ = i_215_;
			    int i_234_ = i;
			    int i_235_ = i;
			    Class547 class547_236_
				= (aClass546_7426.aClass547ArrayArrayArray7263
				   [i][i_232_ - 1][i_214_]);
			    int i_237_;
			    for (i_237_ = (aClass546_7426
					       .aClass161Array7215[i]
					       .method2577
					   (i_215_, i_214_, (byte) -61));
				 (i_232_ > 0 && class547_236_ != null
				  && class547_236_.aShort7270 < 0
				  && (class547_236_.aShort7270
				      == class547.aShort7270)
				  && (class547_236_.aShort7265
				      == class547.aShort7265)
				  && (i_237_
				      == (aClass546_7426.aClass161Array7215
					      [i].method2577
					  (i_232_ - 1, i_214_, (byte) -83)))
				  && (i_232_ - 1 <= 0
				      || i_237_ == (aClass546_7426
							.aClass161Array7215[i]
							.method2577
						    (i_232_ - 2, i_214_,
						     (byte) 32)))
				  && i_233_ - i_232_ <= 10);
				 class547_236_ = (aClass546_7426
						  .aClass547ArrayArrayArray7263
						  [i][i_232_ - 1][i_214_]))
				i_232_--;
			    for (class547_236_ = (aClass546_7426
						  .aClass547ArrayArrayArray7263
						  [i][i_233_ + 1][i_214_]);
				 ((i_233_
				   < aClass546_7426.anInt7210 * 1761949661)
				  && class547_236_ != null
				  && class547_236_.aShort7270 < 0
				  && (class547_236_.aShort7270
				      == class547.aShort7270)
				  && (class547_236_.aShort7265
				      == class547.aShort7265)
				  && (i_237_
				      == (aClass546_7426.aClass161Array7215
					      [i].method2577
					  (i_233_ + 1, i_214_, (byte) -12)))
				  && (i_233_ + 1 >= (aClass546_7426.anInt7210
						     * 1761949661)
				      || i_237_ == (aClass546_7426
							.aClass161Array7215[i]
							.method2577
						    (i_233_ + 2, i_214_,
						     (byte) 15)))
				  && i_233_ - i_232_ <= 10);
				 class547_236_ = (aClass546_7426
						  .aClass547ArrayArrayArray7263
						  [i][i_233_ + 1][i_214_]))
				i_233_++;
			    int i_238_ = i_235_ - i_234_ + 1;
			    int i_239_
				= aClass546_7426.aClass161Array7215
				      [bool ? i_234_ + 1 : i_234_]
				      .method2577(i_232_, i_214_, (byte) -102);
			    int i_240_ = i_239_ + class547.aShort7270 * i_238_;
			    int i_241_
				= (aClass546_7426.aClass161Array7215
				       [bool ? i_234_ + 1 : i_234_].method2577
				   (i_233_ + 1, i_214_, (byte) -11));
			    int i_242_ = i_241_ + class547.aShort7270 * i_238_;
			    int i_243_
				= (i_232_
				   << aClass546_7426.anInt7200 * 1819515263);
			    int i_244_
				= ((i_233_
				    << aClass546_7426.anInt7200 * 1819515263)
				   + aClass546_7426.anInt7221 * -466040829);
			    int i_245_
				= (i_214_
				   << aClass546_7426.anInt7200 * 1819515263);
			    aClass568Array7435[anInt7439++]
				= new Class568(aClass546_7426, 2, i_235_,
					       i_243_, i_244_, i_244_, i_243_,
					       i_239_, i_241_, i_242_, i_240_,
					       i_245_ + class547.aShort7265,
					       i_245_ + class547.aShort7265,
					       i_245_ + class547.aShort7265,
					       i_245_ + class547.aShort7265);
			    for (int i_246_ = i_234_; i_246_ <= i_235_;
				 i_246_++) {
				for (int i_247_ = i_232_; i_247_ <= i_233_;
				     i_247_++)
				    aClass546_7426
					.aClass547ArrayArrayArray7263[i_246_]
					[i_247_][i_214_].aShort7270
					*= -1;
			    }
			}
		    }
		}
	    }
	}
	aBool7427 = true;
    }
    
    Class554(Class546 class546) {
	aBool7421 = true;
	aBool7427 = false;
	anInt7430 = 0;
	aFloatArray7447 = new float[3];
	anIntArray7448 = new int[2];
	anInt7449 = -1;
	anInt7438 = -1;
	aBool7451 = true;
	anInt7429 = class546.anInt7221 * -466040829;
	anInt7422 = class546.anInt7221 * -466040829;
	aClass546_7426 = class546;
	aClass568Array7433 = new Class568[542];
	anInt7432 = 0;
	aClass568Array7435 = new Class568[2002];
	anInt7439 = 0;
	aClass568Array7437 = new Class568[1037];
	anInt7442 = 0;
	aClass568Array7431 = new Class568[1047];
	anInt7430 = 0;
	anIntArrayArrayArray7428
	    = (new int[aClass546_7426.anInt7241 * 230317859]
	       [aClass546_7426.anInt7210 * 1761949661 + 1]
	       [aClass546_7426.anInt7211 * 947301287 + 1]);
	aBool7427 = false;
	aBool7434 = true;
	if (aBool7434)
	    aClass548_7436 = new Class548(this);
    }
    
    public void method9200(int i, int i_248_, int i_249_, int i_250_) {
	if (i == 8 || i == 16) {
	    for (int i_251_ = 0; i_251_ < anInt7442; i_251_++) {
		Class568 class568 = aClass568Array7437[i_251_];
		if (class568.aByte7615 == i && class568.aByte7616 == i_248_
		    && ((class568.aShort7617 == i_249_
			 && class568.aShort7618 == i_250_)
			|| (class568.aShort7610 == i_249_
			    && class568.aShort7620 == i_250_))) {
		    if (i_251_ != anInt7442)
			System.arraycopy(aClass568Array7437, i_251_ + 1,
					 aClass568Array7437, i_251_,
					 aClass568Array7437.length - (i_251_
								      + 1));
		    anInt7442--;
		    break;
		}
	    }
	} else {
	    Class547 class547 = (aClass546_7426.aClass547ArrayArrayArray7263
				 [i_248_][i_249_][i_250_]);
	    if (class547 != null) {
		if (i == 1)
		    class547.aShort7273 = (short) 0;
		else if (i == 2)
		    class547.aShort7270 = (short) 0;
	    }
	    method9178();
	}
    }
    
    void method9201(Class182 class182, Class568 class568, int i) {
	aClass182_7446 = class182;
	if (anIntArray7450 != null && class568.aByte7616 >= i) {
	    for (int i_252_ = 0; i_252_ < anIntArray7450.length; i_252_++) {
		if (anIntArray7450[i_252_] != -1000000
		    && (class568.anIntArray7622[0] <= anIntArray7450[i_252_]
			|| class568.anIntArray7622[1] <= anIntArray7450[i_252_]
			|| class568.anIntArray7622[2] <= anIntArray7450[i_252_]
			|| (class568.anIntArray7622[3]
			    <= anIntArray7450[i_252_]))
		    && (class568.anIntArray7621[0] <= anIntArray7440[i_252_]
			|| class568.anIntArray7621[1] <= anIntArray7440[i_252_]
			|| class568.anIntArray7621[2] <= anIntArray7440[i_252_]
			|| (class568.anIntArray7621[3]
			    <= anIntArray7440[i_252_]))
		    && (class568.anIntArray7621[0] >= anIntArray7441[i_252_]
			|| class568.anIntArray7621[1] >= anIntArray7441[i_252_]
			|| class568.anIntArray7621[2] >= anIntArray7441[i_252_]
			|| (class568.anIntArray7621[3]
			    >= anIntArray7441[i_252_]))
		    && (class568.anIntArray7623[0] <= anIntArray7443[i_252_]
			|| class568.anIntArray7623[1] <= anIntArray7443[i_252_]
			|| class568.anIntArray7623[2] <= anIntArray7443[i_252_]
			|| (class568.anIntArray7623[3]
			    <= anIntArray7443[i_252_]))
		    && (class568.anIntArray7623[0] >= anIntArray7444[i_252_]
			|| class568.anIntArray7623[1] >= anIntArray7444[i_252_]
			|| class568.anIntArray7623[2] >= anIntArray7444[i_252_]
			|| (class568.anIntArray7623[3]
			    >= anIntArray7444[i_252_])))
		    return;
	    }
	}
	if (class568.aByte7615 == 1) {
	    int i_253_
		= (class568.aShort7617 - aClass546_7426.anInt7214 * 1874840879
		   + aClass546_7426.anInt7242 * -699511149);
	    if (i_253_ >= 0
		&& i_253_ <= (aClass546_7426.anInt7242 * -699511149
			      + aClass546_7426.anInt7242 * -699511149)) {
		int i_254_ = (class568.aShort7618
			      - aClass546_7426.anInt7202 * 1049621335
			      + aClass546_7426.anInt7242 * -699511149);
		if (i_254_ < 0)
		    i_254_ = 0;
		else if (i_254_ > (aClass546_7426.anInt7242 * -699511149
				   + aClass546_7426.anInt7242 * -699511149))
		    return;
		int i_255_ = (class568.aShort7620
			      - aClass546_7426.anInt7202 * 1049621335
			      + aClass546_7426.anInt7242 * -699511149);
		if (i_255_ > (aClass546_7426.anInt7242 * -699511149
			      + aClass546_7426.anInt7242 * -699511149))
		    i_255_ = (aClass546_7426.anInt7242 * -699511149
			      + aClass546_7426.anInt7242 * -699511149);
		else if (i_255_ < 0)
		    return;
		boolean bool = false;
	    while_33_:
		do {
		    do {
			if (i_254_ > i_255_)
			    break while_33_;
		    } while (!aClass546_7426.aBoolArrayArray7262[i_253_]
			      [i_254_++]);
		    bool = true;
		} while (false);
		if (bool) {
		    float f = (float) (aClass546_7426.anInt7238 * 1787068049
				       - class568.anIntArray7621[0]);
		    if (f < 0.0F)
			f *= -1.0F;
		    if (!(f < (float) anInt7429) && method9185(class568, 0)
			&& method9185(class568, 1) && method9185(class568, 2)
			&& method9185(class568, 3))
			aClass568Array7431[anInt7430++] = class568;
		}
	    }
	} else if (class568.aByte7615 == 2) {
	    int i_256_
		= (class568.aShort7618 - aClass546_7426.anInt7202 * 1049621335
		   + aClass546_7426.anInt7242 * -699511149);
	    if (i_256_ >= 0
		&& i_256_ <= (aClass546_7426.anInt7242 * -699511149
			      + aClass546_7426.anInt7242 * -699511149)) {
		int i_257_ = (class568.aShort7617
			      - aClass546_7426.anInt7214 * 1874840879
			      + aClass546_7426.anInt7242 * -699511149);
		if (i_257_ < 0)
		    i_257_ = 0;
		else if (i_257_ > (aClass546_7426.anInt7242 * -699511149
				   + aClass546_7426.anInt7242 * -699511149))
		    return;
		int i_258_ = (class568.aShort7610
			      - aClass546_7426.anInt7214 * 1874840879
			      + aClass546_7426.anInt7242 * -699511149);
		if (i_258_ > (aClass546_7426.anInt7242 * -699511149
			      + aClass546_7426.anInt7242 * -699511149))
		    i_258_ = (aClass546_7426.anInt7242 * -699511149
			      + aClass546_7426.anInt7242 * -699511149);
		else if (i_258_ < 0)
		    return;
		boolean bool = false;
	    while_34_:
		do {
		    do {
			if (i_257_ > i_258_)
			    break while_34_;
		    } while (!aClass546_7426.aBoolArrayArray7262[i_257_++]
			      [i_256_]);
		    bool = true;
		} while (false);
		if (bool) {
		    float f = (float) (aClass546_7426.anInt7239 * 934728119
				       - class568.anIntArray7623[0]);
		    if (f < 0.0F)
			f *= -1.0F;
		    if (!(f < (float) anInt7429) && method9185(class568, 0)
			&& method9185(class568, 1) && method9185(class568, 2)
			&& method9185(class568, 3))
			aClass568Array7431[anInt7430++] = class568;
		}
	    }
	} else if (class568.aByte7615 == 16 || class568.aByte7615 == 8) {
	    int i_259_
		= (class568.aShort7617 - aClass546_7426.anInt7214 * 1874840879
		   + aClass546_7426.anInt7242 * -699511149);
	    if (i_259_ >= 0
		&& i_259_ <= (aClass546_7426.anInt7242 * -699511149
			      + aClass546_7426.anInt7242 * -699511149)) {
		int i_260_ = (class568.aShort7618
			      - aClass546_7426.anInt7202 * 1049621335
			      + aClass546_7426.anInt7242 * -699511149);
		if (i_260_ >= 0
		    && i_260_ <= (aClass546_7426.anInt7242 * -699511149
				  + aClass546_7426.anInt7242 * -699511149)
		    && aClass546_7426.aBoolArrayArray7262[i_259_][i_260_]) {
		    float f = (float) (aClass546_7426.anInt7238 * 1787068049
				       - class568.anIntArray7621[0]);
		    if (f < 0.0F)
			f *= -1.0F;
		    float f_261_
			= (float) (aClass546_7426.anInt7239 * 934728119
				   - class568.anIntArray7623[0]);
		    if (f_261_ < 0.0F)
			f_261_ *= -1.0F;
		    if ((!(f < (float) anInt7429)
			 || !(f_261_ < (float) anInt7429))
			&& method9185(class568, 0) && method9185(class568, 1)
			&& method9185(class568, 2) && method9185(class568, 3))
			aClass568Array7431[anInt7430++] = class568;
		}
	    }
	} else if (class568.aByte7615 == 4) {
	    float f = (float) (class568.anIntArray7622[0]
			       - aClass546_7426.anInt7244 * 486881679);
	    if (!(f <= (float) anInt7422)) {
		int i_262_ = (class568.aShort7618
			      - aClass546_7426.anInt7202 * 1049621335
			      + aClass546_7426.anInt7242 * -699511149);
		if (i_262_ < 0)
		    i_262_ = 0;
		else if (i_262_ > (aClass546_7426.anInt7242 * -699511149
				   + aClass546_7426.anInt7242 * -699511149))
		    return;
		int i_263_ = (class568.aShort7620
			      - aClass546_7426.anInt7202 * 1049621335
			      + aClass546_7426.anInt7242 * -699511149);
		if (i_263_ > (aClass546_7426.anInt7242 * -699511149
			      + aClass546_7426.anInt7242 * -699511149))
		    i_263_ = (aClass546_7426.anInt7242 * -699511149
			      + aClass546_7426.anInt7242 * -699511149);
		else if (i_263_ < 0)
		    return;
		int i_264_ = (class568.aShort7617
			      - aClass546_7426.anInt7214 * 1874840879
			      + aClass546_7426.anInt7242 * -699511149);
		if (i_264_ < 0)
		    i_264_ = 0;
		else if (i_264_ > (aClass546_7426.anInt7242 * -699511149
				   + aClass546_7426.anInt7242 * -699511149))
		    return;
		int i_265_ = (class568.aShort7610
			      - aClass546_7426.anInt7214 * 1874840879
			      + aClass546_7426.anInt7242 * -699511149);
		if (i_265_ > (aClass546_7426.anInt7242 * -699511149
			      + aClass546_7426.anInt7242 * -699511149))
		    i_265_ = (aClass546_7426.anInt7242 * -699511149
			      + aClass546_7426.anInt7242 * -699511149);
		else if (i_265_ < 0)
		    return;
		boolean bool = false;
	    while_35_:
		for (int i_266_ = i_264_; i_266_ <= i_265_; i_266_++) {
		    for (int i_267_ = i_262_; i_267_ <= i_263_; i_267_++) {
			if (aClass546_7426.aBoolArrayArray7262[i_266_]
			    [i_267_]) {
			    bool = true;
			    break while_35_;
			}
		    }
		}
		if (bool && method9185(class568, 0) && method9185(class568, 1)
		    && method9185(class568, 2) && method9185(class568, 3))
		    aClass568Array7431[anInt7430++] = class568;
	    }
	}
    }
    
    void method9202(Class182 class182, int i) {
	aClass182_7446 = class182;
	if (!aBool7434 || !aBool7421)
	    anInt7430 = 0;
	else {
	    if (aBool7451)
		aClass546_7426.aClass51_7205.method1136(-2029945189);
	    aClass182_7446.method3234(anIntArray7448);
	    if (anInt7449 != (int) ((float) anIntArray7448[0] / 3.0F)
		|| anInt7438 != (int) ((float) anIntArray7448[1] / 3.0F)) {
		anInt7449 = (int) ((float) anIntArray7448[0] / 3.0F);
		anInt7438 = (int) ((float) anIntArray7448[1] / 3.0F);
		anIntArray7445 = new int[anInt7449 * anInt7438];
	    }
	    anInt7430 = 0;
	    for (int i_268_ = 0; i_268_ < anInt7432; i_268_++)
		method9218(aClass182_7446, aClass568Array7433[i_268_], i);
	    for (int i_269_ = 0; i_269_ < anInt7439; i_269_++)
		method9218(aClass182_7446, aClass568Array7435[i_269_], i);
	    for (int i_270_ = 0; i_270_ < anInt7442; i_270_++)
		method9218(aClass182_7446, aClass568Array7437[i_270_], i);
	    aClass548_7436.anInt7284 = 0;
	    if (anInt7430 > 0) {
		int i_271_ = anIntArray7445.length;
		int i_272_ = i_271_ - i_271_ & 0x7;
		int i_273_ = 0;
		while (i_273_ < i_272_) {
		    anIntArray7445[i_273_++] = 2147483647;
		    anIntArray7445[i_273_++] = 2147483647;
		    anIntArray7445[i_273_++] = 2147483647;
		    anIntArray7445[i_273_++] = 2147483647;
		    anIntArray7445[i_273_++] = 2147483647;
		    anIntArray7445[i_273_++] = 2147483647;
		    anIntArray7445[i_273_++] = 2147483647;
		    anIntArray7445[i_273_++] = 2147483647;
		}
		while (i_273_ < i_271_)
		    anIntArray7445[i_273_++] = 2147483647;
		aClass548_7436.anInt7277 = 1;
		for (int i_274_ = 0; i_274_ < anInt7430; i_274_++) {
		    Class568 class568 = aClass568Array7431[i_274_];
		    aClass548_7436.method9106(class568.aShortArray7625[0],
					      class568.aShortArray7625[1],
					      class568.aShortArray7625[3],
					      class568.aShortArray7624[0],
					      class568.aShortArray7624[1],
					      class568.aShortArray7624[3],
					      class568.aShortArray7626[0],
					      class568.aShortArray7626[1],
					      class568.aShortArray7626[3]);
		    aClass548_7436.method9106(class568.aShortArray7625[1],
					      class568.aShortArray7625[2],
					      class568.aShortArray7625[3],
					      class568.aShortArray7624[1],
					      class568.aShortArray7624[2],
					      class568.aShortArray7624[3],
					      class568.aShortArray7626[1],
					      class568.aShortArray7626[2],
					      class568.aShortArray7626[3]);
		}
		aClass548_7436.anInt7277 = 2;
	    }
	    if (aBool7451)
		aClass546_7426.aClass51_7205.method1136(-1037784744);
	}
    }
    
    public void method9203(int i, int i_275_, int i_276_, int i_277_,
			   int i_278_, int i_279_) {
	if (i == 8 || i == 16) {
	    if (i == 8) {
		int i_280_ = i_276_ << aClass546_7426.anInt7200 * 1819515263;
		int i_281_ = i_280_ + aClass546_7426.anInt7221 * -466040829;
		int i_282_ = i_277_ << aClass546_7426.anInt7200 * 1819515263;
		int i_283_ = i_282_ + aClass546_7426.anInt7221 * -466040829;
		int i_284_ = aClass546_7426.aClass161Array7215[i_275_]
				 .method2577(i_276_, i_277_, (byte) 4);
		int i_285_
		    = aClass546_7426.aClass161Array7215[i_275_]
			  .method2577(i_276_ + 1, i_277_ + 1, (byte) 38);
		aClass568Array7437[anInt7442++]
		    = new Class568(aClass546_7426, i, i_275_, i_280_, i_281_,
				   i_281_, i_280_, i_284_, i_285_,
				   i_285_ - i_278_, i_284_ - i_278_, i_282_,
				   i_283_, i_283_, i_282_);
	    } else {
		int i_286_ = ((i_276_ << aClass546_7426.anInt7200 * 1819515263)
			      + aClass546_7426.anInt7221 * -466040829);
		int i_287_ = i_286_ - aClass546_7426.anInt7221 * -466040829;
		int i_288_ = i_277_ << aClass546_7426.anInt7200 * 1819515263;
		int i_289_ = i_288_ + aClass546_7426.anInt7221 * -466040829;
		int i_290_ = aClass546_7426.aClass161Array7215[i_275_]
				 .method2577(i_276_ + 1, i_277_, (byte) 50);
		int i_291_ = aClass546_7426.aClass161Array7215[i_275_]
				 .method2577(i_276_, i_277_ + 1, (byte) -69);
		aClass568Array7437[anInt7442++]
		    = new Class568(aClass546_7426, i, i_275_, i_286_, i_287_,
				   i_287_, i_286_, i_290_, i_291_,
				   i_291_ - i_278_, i_290_ - i_278_, i_288_,
				   i_289_, i_289_, i_288_);
	    }
	} else {
	    Class547 class547 = (aClass546_7426.aClass547ArrayArrayArray7263
				 [i_275_][i_276_][i_277_]);
	    if (class547 == null)
		aClass546_7426.aClass547ArrayArrayArray7263[i_275_][i_276_]
		    [i_277_]
		    = class547 = new Class547(i_275_);
	    if (i == 1) {
		class547.aShort7273 = (short) i_278_;
		class547.aShort7274 = (short) i_279_;
	    } else if (i == 2) {
		class547.aShort7270 = (short) i_278_;
		class547.aShort7265 = (short) i_279_;
	    }
	    if (aBool7427)
		method9178();
	}
    }
    
    boolean method9204(Class568 class568, int i) {
	if (!method9180(class568.anIntArray7621[i], class568.anIntArray7622[i],
			class568.anIntArray7623[i]))
	    return false;
	class568.aShortArray7624[i] = (short) (int) aFloatArray7447[0];
	class568.aShortArray7625[i] = (short) (int) aFloatArray7447[1];
	class568.aShortArray7626[i] = (short) (int) aFloatArray7447[2];
	return true;
    }
    
    boolean method9205(Class568 class568, int i) {
	if (!method9180(class568.anIntArray7621[i], class568.anIntArray7622[i],
			class568.anIntArray7623[i]))
	    return false;
	class568.aShortArray7624[i] = (short) (int) aFloatArray7447[0];
	class568.aShortArray7625[i] = (short) (int) aFloatArray7447[1];
	class568.aShortArray7626[i] = (short) (int) aFloatArray7447[2];
	return true;
    }
    
    boolean method9206(Class568 class568, int i) {
	if (!method9180(class568.anIntArray7621[i], class568.anIntArray7622[i],
			class568.anIntArray7623[i]))
	    return false;
	class568.aShortArray7624[i] = (short) (int) aFloatArray7447[0];
	class568.aShortArray7625[i] = (short) (int) aFloatArray7447[1];
	class568.aShortArray7626[i] = (short) (int) aFloatArray7447[2];
	return true;
    }
    
    final boolean method9207(int i, int i_292_, int i_293_) {
	aClass182_7446.method3360((float) i, (float) i_292_, (float) i_293_,
				  aFloatArray7447);
	if (aFloatArray7447[2] < 50.0F)
	    return false;
	aFloatArray7447[0] /= 3.0F;
	aFloatArray7447[1] /= 3.0F;
	return true;
    }
    
    boolean method9208(int i, int i_294_, int i_295_) {
	if (!aBool7434 || !aBool7421)
	    return false;
	if (aClass548_7436.anInt7284 < 101)
	    return false;
	int i_296_ = anIntArrayArrayArray7428[i][i_294_][i_295_];
	if (i_296_ == -(aClass546_7426.anInt7261 * -852140167))
	    return false;
	if (i_296_ == aClass546_7426.anInt7261 * -852140167)
	    return true;
	if (aClass546_7426.aClass161Array7226
	    == aClass546_7426.aClass161Array7249)
	    return false;
	int i_297_ = i_294_ << aClass546_7426.anInt7200 * 1819515263;
	int i_298_ = i_295_ << aClass546_7426.anInt7200 * 1819515263;
	if (method9187(i_297_ + 1,
		       aClass546_7426.aClass161Array7226[i]
			   .method2577(i_294_, i_295_, (byte) 79),
		       i_298_ + 1,
		       i_297_ + aClass546_7426.anInt7221 * -466040829 - 1,
		       aClass546_7426.aClass161Array7226[i]
			   .method2577(i_294_ + 1, i_295_ + 1, (byte) -4),
		       i_298_ + aClass546_7426.anInt7221 * -466040829 - 1,
		       i_297_ + 1,
		       aClass546_7426.aClass161Array7226[i]
			   .method2577(i_294_, i_295_ + 1, (byte) -32),
		       i_298_ + aClass546_7426.anInt7221 * -466040829 - 1)
	    && method9187(i_297_ + 1,
			  aClass546_7426.aClass161Array7226[i]
			      .method2577(i_294_, i_295_, (byte) -26),
			  i_298_ + 1,
			  i_297_ + aClass546_7426.anInt7221 * -466040829 - 1,
			  aClass546_7426.aClass161Array7226[i]
			      .method2577(i_294_ + 1, i_295_, (byte) -80),
			  i_298_ + 1,
			  i_297_ + aClass546_7426.anInt7221 * -466040829 - 1,
			  aClass546_7426.aClass161Array7226[i]
			      .method2577(i_294_ + 1, i_295_ + 1, (byte) -17),
			  (i_298_ + aClass546_7426.anInt7221 * -466040829
			   - 1))) {
	    anIntArrayArrayArray7428[i][i_294_][i_295_]
		= aClass546_7426.anInt7261 * -852140167;
	    return true;
	}
	anIntArrayArrayArray7428[i][i_294_][i_295_]
	    = -(aClass546_7426.anInt7261 * -852140167);
	return false;
    }
    
    boolean method9209(int i, int i_299_, int i_300_) {
	if (!aBool7434 || !aBool7421)
	    return false;
	if (aClass548_7436.anInt7284 < 101)
	    return false;
	int i_301_ = anIntArrayArrayArray7428[i][i_299_][i_300_];
	if (i_301_ == -(aClass546_7426.anInt7261 * -852140167))
	    return false;
	if (i_301_ == aClass546_7426.anInt7261 * -852140167)
	    return true;
	if (aClass546_7426.aClass161Array7226
	    == aClass546_7426.aClass161Array7249)
	    return false;
	int i_302_ = i_299_ << aClass546_7426.anInt7200 * 1819515263;
	int i_303_ = i_300_ << aClass546_7426.anInt7200 * 1819515263;
	if (method9187(i_302_ + 1,
		       aClass546_7426.aClass161Array7226[i]
			   .method2577(i_299_, i_300_, (byte) 12),
		       i_303_ + 1,
		       i_302_ + aClass546_7426.anInt7221 * -466040829 - 1,
		       aClass546_7426.aClass161Array7226[i]
			   .method2577(i_299_ + 1, i_300_ + 1, (byte) 118),
		       i_303_ + aClass546_7426.anInt7221 * -466040829 - 1,
		       i_302_ + 1,
		       aClass546_7426.aClass161Array7226[i]
			   .method2577(i_299_, i_300_ + 1, (byte) -4),
		       i_303_ + aClass546_7426.anInt7221 * -466040829 - 1)
	    && method9187(i_302_ + 1,
			  aClass546_7426.aClass161Array7226[i]
			      .method2577(i_299_, i_300_, (byte) 16),
			  i_303_ + 1,
			  i_302_ + aClass546_7426.anInt7221 * -466040829 - 1,
			  aClass546_7426.aClass161Array7226[i]
			      .method2577(i_299_ + 1, i_300_, (byte) 42),
			  i_303_ + 1,
			  i_302_ + aClass546_7426.anInt7221 * -466040829 - 1,
			  aClass546_7426.aClass161Array7226[i]
			      .method2577(i_299_ + 1, i_300_ + 1, (byte) 22),
			  (i_303_ + aClass546_7426.anInt7221 * -466040829
			   - 1))) {
	    anIntArrayArrayArray7428[i][i_299_][i_300_]
		= aClass546_7426.anInt7261 * -852140167;
	    return true;
	}
	anIntArrayArrayArray7428[i][i_299_][i_300_]
	    = -(aClass546_7426.anInt7261 * -852140167);
	return false;
    }
    
    boolean method9210(Class656_Sub1_Sub5 class656_sub1_sub5, int i,
		       int i_304_, int i_305_) {
	if (!aBool7434 || !aBool7421)
	    return false;
	if (aClass548_7436.anInt7284 < 101)
	    return false;
	if (!method9181(i, i_304_, i_305_))
	    return false;
	int i_306_ = i_304_ << aClass546_7426.anInt7200 * 1819515263;
	int i_307_ = i_305_ << aClass546_7426.anInt7200 * 1819515263;
	int i_308_
	    = (aClass546_7426.aClass161Array7226[i].method2577(i_304_, i_305_,
							       (byte) -99)
	       - 1);
	int i_309_ = i_308_ + class656_sub1_sub5.method16909((byte) 106);
	if (class656_sub1_sub5.aShort11952 == 1) {
	    if (!method9187(i_306_, i_308_, i_307_, i_306_, i_309_, i_307_,
			    i_306_, i_309_,
			    i_307_ + aClass546_7426.anInt7221 * -466040829))
		return false;
	    if (!method9187(i_306_, i_308_, i_307_, i_306_, i_309_,
			    i_307_ + aClass546_7426.anInt7221 * -466040829,
			    i_306_, i_308_,
			    i_307_ + aClass546_7426.anInt7221 * -466040829))
		return false;
	    return true;
	}
	if (class656_sub1_sub5.aShort11952 == 2) {
	    if (!method9187(i_306_, i_308_,
			    i_307_ + aClass546_7426.anInt7221 * -466040829,
			    i_306_ + aClass546_7426.anInt7221 * -466040829,
			    i_309_,
			    i_307_ + aClass546_7426.anInt7221 * -466040829,
			    i_306_, i_309_,
			    i_307_ + aClass546_7426.anInt7221 * -466040829))
		return false;
	    if (!method9187(i_306_, i_308_,
			    i_307_ + aClass546_7426.anInt7221 * -466040829,
			    i_306_ + aClass546_7426.anInt7221 * -466040829,
			    i_308_,
			    i_307_ + aClass546_7426.anInt7221 * -466040829,
			    i_306_ + aClass546_7426.anInt7221 * -466040829,
			    i_309_,
			    i_307_ + aClass546_7426.anInt7221 * -466040829))
		return false;
	    return true;
	}
	if (class656_sub1_sub5.aShort11952 == 4) {
	    if (!method9187(i_306_ + aClass546_7426.anInt7221 * -466040829,
			    i_308_, i_307_,
			    i_306_ + aClass546_7426.anInt7221 * -466040829,
			    i_309_, i_307_,
			    i_306_ + aClass546_7426.anInt7221 * -466040829,
			    i_309_,
			    i_307_ + aClass546_7426.anInt7221 * -466040829))
		return false;
	    if (!method9187(i_306_ + aClass546_7426.anInt7221 * -466040829,
			    i_308_, i_307_,
			    i_306_ + aClass546_7426.anInt7221 * -466040829,
			    i_309_,
			    i_307_ + aClass546_7426.anInt7221 * -466040829,
			    i_306_ + aClass546_7426.anInt7221 * -466040829,
			    i_308_,
			    i_307_ + aClass546_7426.anInt7221 * -466040829))
		return false;
	    return true;
	}
	if (class656_sub1_sub5.aShort11952 == 8) {
	    if (!method9187(i_306_, i_308_, i_307_,
			    i_306_ + aClass546_7426.anInt7221 * -466040829,
			    i_309_, i_307_, i_306_, i_309_, i_307_))
		return false;
	    if (!method9187(i_306_, i_308_, i_307_,
			    i_306_ + aClass546_7426.anInt7221 * -466040829,
			    i_308_, i_307_,
			    i_306_ + aClass546_7426.anInt7221 * -466040829,
			    i_309_, i_307_))
		return false;
	    return true;
	}
	if (class656_sub1_sub5.aShort11952 == 16) {
	    if (!method9172(i_306_, i_308_,
			    i_307_ + aClass546_7426.anInt7240 * -576707309,
			    aClass546_7426.anInt7240 * -576707309, i_309_,
			    aClass546_7426.anInt7240 * -576707309))
		return false;
	    return true;
	}
	if (class656_sub1_sub5.aShort11952 == 32) {
	    if (!method9172(i_306_ + aClass546_7426.anInt7240 * -576707309,
			    i_308_,
			    i_307_ + aClass546_7426.anInt7240 * -576707309,
			    aClass546_7426.anInt7240 * -576707309, i_309_,
			    aClass546_7426.anInt7240 * -576707309))
		return false;
	    return true;
	}
	if (class656_sub1_sub5.aShort11952 == 64) {
	    if (!method9172(i_306_ + aClass546_7426.anInt7240 * -576707309,
			    i_308_, i_307_,
			    aClass546_7426.anInt7240 * -576707309, i_309_,
			    aClass546_7426.anInt7240 * -576707309))
		return false;
	    return true;
	}
	if (class656_sub1_sub5.aShort11952 == 128) {
	    if (!method9172(i_306_, i_308_, i_307_,
			    aClass546_7426.anInt7240 * -576707309, i_309_,
			    aClass546_7426.anInt7240 * -576707309))
		return false;
	    return true;
	}
	return true;
    }
    
    final boolean method9211(int i, int i_310_, int i_311_, int i_312_,
			     int i_313_, int i_314_) {
	int i_315_ = i + i_312_;
	int i_316_ = i_310_ + i_313_;
	int i_317_ = i_311_ + i_314_;
	if (!method9187(i, i_316_, i_311_, i_315_, i_316_, i_317_, i, i_316_,
			i_317_))
	    return false;
	if (!method9187(i, i_316_, i_311_, i_315_, i_316_, i_311_, i_315_,
			i_316_, i_317_))
	    return false;
	if (i < aClass546_7426.anInt7238 * 1787068049) {
	    if (!method9187(i, i_310_, i_317_, i, i_316_, i_311_, i, i_316_,
			    i_317_))
		return false;
	    if (!method9187(i, i_310_, i_317_, i, i_310_, i_311_, i, i_316_,
			    i_311_))
		return false;
	} else {
	    if (!method9187(i_315_, i_310_, i_317_, i_315_, i_316_, i_311_,
			    i_315_, i_316_, i_317_))
		return false;
	    if (!method9187(i_315_, i_310_, i_317_, i_315_, i_310_, i_311_,
			    i_315_, i_316_, i_311_))
		return false;
	}
	if (i_311_ < aClass546_7426.anInt7239 * 934728119) {
	    if (!method9187(i, i_310_, i_311_, i_315_, i_316_, i_311_, i,
			    i_316_, i_311_))
		return false;
	    if (!method9187(i, i_310_, i_311_, i_315_, i_310_, i_311_, i_315_,
			    i_316_, i_311_))
		return false;
	} else {
	    if (!method9187(i, i_310_, i_317_, i_315_, i_316_, i_317_, i,
			    i_316_, i_317_))
		return false;
	    if (!method9187(i, i_310_, i_317_, i_315_, i_310_, i_317_, i_315_,
			    i_316_, i_317_))
		return false;
	}
	return true;
    }
    
    public void method9212() {
	method9178();
    }
    
    public void method9213() {
	method9178();
    }
    
    boolean method9214(int i, int i_318_, int i_319_, int i_320_, int i_321_,
		       Class553 class553) {
	if (!aBool7434 || !aBool7421)
	    return false;
	if (aClass548_7436.anInt7284 < 101)
	    return false;
	if (i_318_ < 0 || i_320_ < 0
	    || i_319_ >= anIntArrayArrayArray7428[i].length
	    || i_321_ >= anIntArrayArrayArray7428[i][i_318_].length)
	    return false;
	if (i_318_ == i_319_ && i_320_ == i_321_) {
	    if (!method9181(i, i_318_, i_320_))
		return false;
	    if (method9219(class553))
		return true;
	    return false;
	}
	for (int i_322_ = i_318_; i_322_ <= i_319_; i_322_++) {
	    for (int i_323_ = i_320_; i_323_ <= i_321_; i_323_++) {
		if (anIntArrayArrayArray7428[i][i_322_][i_323_]
		    == -(aClass546_7426.anInt7261 * -852140167))
		    return false;
	    }
	}
	if (!method9219(class553))
	    return false;
	return true;
    }
    
    final boolean method9215(Class553 class553) {
	if (class553 == null)
	    return false;
	return method9172(class553.anInt7415, class553.anInt7417,
			  class553.anInt7411,
			  class553.anInt7418 - class553.anInt7415,
			  class553.anInt7416 - class553.anInt7417,
			  class553.anInt7420 - class553.anInt7411);
    }
    
    final boolean method9216(Class553 class553) {
	if (class553 == null)
	    return false;
	return method9172(class553.anInt7415, class553.anInt7417,
			  class553.anInt7411,
			  class553.anInt7418 - class553.anInt7415,
			  class553.anInt7416 - class553.anInt7417,
			  class553.anInt7420 - class553.anInt7411);
    }
    
    final boolean method9217(int i, int i_324_, int i_325_, int i_326_,
			     int i_327_, int i_328_) {
	int i_329_ = i + i_326_;
	int i_330_ = i_324_ + i_327_;
	int i_331_ = i_325_ + i_328_;
	if (!method9187(i, i_330_, i_325_, i_329_, i_330_, i_331_, i, i_330_,
			i_331_))
	    return false;
	if (!method9187(i, i_330_, i_325_, i_329_, i_330_, i_325_, i_329_,
			i_330_, i_331_))
	    return false;
	if (i < aClass546_7426.anInt7238 * 1787068049) {
	    if (!method9187(i, i_324_, i_331_, i, i_330_, i_325_, i, i_330_,
			    i_331_))
		return false;
	    if (!method9187(i, i_324_, i_331_, i, i_324_, i_325_, i, i_330_,
			    i_325_))
		return false;
	} else {
	    if (!method9187(i_329_, i_324_, i_331_, i_329_, i_330_, i_325_,
			    i_329_, i_330_, i_331_))
		return false;
	    if (!method9187(i_329_, i_324_, i_331_, i_329_, i_324_, i_325_,
			    i_329_, i_330_, i_325_))
		return false;
	}
	if (i_325_ < aClass546_7426.anInt7239 * 934728119) {
	    if (!method9187(i, i_324_, i_325_, i_329_, i_330_, i_325_, i,
			    i_330_, i_325_))
		return false;
	    if (!method9187(i, i_324_, i_325_, i_329_, i_324_, i_325_, i_329_,
			    i_330_, i_325_))
		return false;
	} else {
	    if (!method9187(i, i_324_, i_331_, i_329_, i_330_, i_331_, i,
			    i_330_, i_331_))
		return false;
	    if (!method9187(i, i_324_, i_331_, i_329_, i_324_, i_331_, i_329_,
			    i_330_, i_331_))
		return false;
	}
	return true;
    }
    
    void method9218(Class182 class182, Class568 class568, int i) {
	aClass182_7446 = class182;
	if (anIntArray7450 != null && class568.aByte7616 >= i) {
	    for (int i_332_ = 0; i_332_ < anIntArray7450.length; i_332_++) {
		if (anIntArray7450[i_332_] != -1000000
		    && (class568.anIntArray7622[0] <= anIntArray7450[i_332_]
			|| class568.anIntArray7622[1] <= anIntArray7450[i_332_]
			|| class568.anIntArray7622[2] <= anIntArray7450[i_332_]
			|| (class568.anIntArray7622[3]
			    <= anIntArray7450[i_332_]))
		    && (class568.anIntArray7621[0] <= anIntArray7440[i_332_]
			|| class568.anIntArray7621[1] <= anIntArray7440[i_332_]
			|| class568.anIntArray7621[2] <= anIntArray7440[i_332_]
			|| (class568.anIntArray7621[3]
			    <= anIntArray7440[i_332_]))
		    && (class568.anIntArray7621[0] >= anIntArray7441[i_332_]
			|| class568.anIntArray7621[1] >= anIntArray7441[i_332_]
			|| class568.anIntArray7621[2] >= anIntArray7441[i_332_]
			|| (class568.anIntArray7621[3]
			    >= anIntArray7441[i_332_]))
		    && (class568.anIntArray7623[0] <= anIntArray7443[i_332_]
			|| class568.anIntArray7623[1] <= anIntArray7443[i_332_]
			|| class568.anIntArray7623[2] <= anIntArray7443[i_332_]
			|| (class568.anIntArray7623[3]
			    <= anIntArray7443[i_332_]))
		    && (class568.anIntArray7623[0] >= anIntArray7444[i_332_]
			|| class568.anIntArray7623[1] >= anIntArray7444[i_332_]
			|| class568.anIntArray7623[2] >= anIntArray7444[i_332_]
			|| (class568.anIntArray7623[3]
			    >= anIntArray7444[i_332_])))
		    return;
	    }
	}
	if (class568.aByte7615 == 1) {
	    int i_333_
		= (class568.aShort7617 - aClass546_7426.anInt7214 * 1874840879
		   + aClass546_7426.anInt7242 * -699511149);
	    if (i_333_ >= 0
		&& i_333_ <= (aClass546_7426.anInt7242 * -699511149
			      + aClass546_7426.anInt7242 * -699511149)) {
		int i_334_ = (class568.aShort7618
			      - aClass546_7426.anInt7202 * 1049621335
			      + aClass546_7426.anInt7242 * -699511149);
		if (i_334_ < 0)
		    i_334_ = 0;
		else if (i_334_ > (aClass546_7426.anInt7242 * -699511149
				   + aClass546_7426.anInt7242 * -699511149))
		    return;
		int i_335_ = (class568.aShort7620
			      - aClass546_7426.anInt7202 * 1049621335
			      + aClass546_7426.anInt7242 * -699511149);
		if (i_335_ > (aClass546_7426.anInt7242 * -699511149
			      + aClass546_7426.anInt7242 * -699511149))
		    i_335_ = (aClass546_7426.anInt7242 * -699511149
			      + aClass546_7426.anInt7242 * -699511149);
		else if (i_335_ < 0)
		    return;
		boolean bool = false;
	    while_36_:
		do {
		    do {
			if (i_334_ > i_335_)
			    break while_36_;
		    } while (!aClass546_7426.aBoolArrayArray7262[i_333_]
			      [i_334_++]);
		    bool = true;
		} while (false);
		if (bool) {
		    float f = (float) (aClass546_7426.anInt7238 * 1787068049
				       - class568.anIntArray7621[0]);
		    if (f < 0.0F)
			f *= -1.0F;
		    if (!(f < (float) anInt7429) && method9185(class568, 0)
			&& method9185(class568, 1) && method9185(class568, 2)
			&& method9185(class568, 3))
			aClass568Array7431[anInt7430++] = class568;
		}
	    }
	} else if (class568.aByte7615 == 2) {
	    int i_336_
		= (class568.aShort7618 - aClass546_7426.anInt7202 * 1049621335
		   + aClass546_7426.anInt7242 * -699511149);
	    if (i_336_ >= 0
		&& i_336_ <= (aClass546_7426.anInt7242 * -699511149
			      + aClass546_7426.anInt7242 * -699511149)) {
		int i_337_ = (class568.aShort7617
			      - aClass546_7426.anInt7214 * 1874840879
			      + aClass546_7426.anInt7242 * -699511149);
		if (i_337_ < 0)
		    i_337_ = 0;
		else if (i_337_ > (aClass546_7426.anInt7242 * -699511149
				   + aClass546_7426.anInt7242 * -699511149))
		    return;
		int i_338_ = (class568.aShort7610
			      - aClass546_7426.anInt7214 * 1874840879
			      + aClass546_7426.anInt7242 * -699511149);
		if (i_338_ > (aClass546_7426.anInt7242 * -699511149
			      + aClass546_7426.anInt7242 * -699511149))
		    i_338_ = (aClass546_7426.anInt7242 * -699511149
			      + aClass546_7426.anInt7242 * -699511149);
		else if (i_338_ < 0)
		    return;
		boolean bool = false;
	    while_37_:
		do {
		    do {
			if (i_337_ > i_338_)
			    break while_37_;
		    } while (!aClass546_7426.aBoolArrayArray7262[i_337_++]
			      [i_336_]);
		    bool = true;
		} while (false);
		if (bool) {
		    float f = (float) (aClass546_7426.anInt7239 * 934728119
				       - class568.anIntArray7623[0]);
		    if (f < 0.0F)
			f *= -1.0F;
		    if (!(f < (float) anInt7429) && method9185(class568, 0)
			&& method9185(class568, 1) && method9185(class568, 2)
			&& method9185(class568, 3))
			aClass568Array7431[anInt7430++] = class568;
		}
	    }
	} else if (class568.aByte7615 == 16 || class568.aByte7615 == 8) {
	    int i_339_
		= (class568.aShort7617 - aClass546_7426.anInt7214 * 1874840879
		   + aClass546_7426.anInt7242 * -699511149);
	    if (i_339_ >= 0
		&& i_339_ <= (aClass546_7426.anInt7242 * -699511149
			      + aClass546_7426.anInt7242 * -699511149)) {
		int i_340_ = (class568.aShort7618
			      - aClass546_7426.anInt7202 * 1049621335
			      + aClass546_7426.anInt7242 * -699511149);
		if (i_340_ >= 0
		    && i_340_ <= (aClass546_7426.anInt7242 * -699511149
				  + aClass546_7426.anInt7242 * -699511149)
		    && aClass546_7426.aBoolArrayArray7262[i_339_][i_340_]) {
		    float f = (float) (aClass546_7426.anInt7238 * 1787068049
				       - class568.anIntArray7621[0]);
		    if (f < 0.0F)
			f *= -1.0F;
		    float f_341_
			= (float) (aClass546_7426.anInt7239 * 934728119
				   - class568.anIntArray7623[0]);
		    if (f_341_ < 0.0F)
			f_341_ *= -1.0F;
		    if ((!(f < (float) anInt7429)
			 || !(f_341_ < (float) anInt7429))
			&& method9185(class568, 0) && method9185(class568, 1)
			&& method9185(class568, 2) && method9185(class568, 3))
			aClass568Array7431[anInt7430++] = class568;
		}
	    }
	} else if (class568.aByte7615 == 4) {
	    float f = (float) (class568.anIntArray7622[0]
			       - aClass546_7426.anInt7244 * 486881679);
	    if (!(f <= (float) anInt7422)) {
		int i_342_ = (class568.aShort7618
			      - aClass546_7426.anInt7202 * 1049621335
			      + aClass546_7426.anInt7242 * -699511149);
		if (i_342_ < 0)
		    i_342_ = 0;
		else if (i_342_ > (aClass546_7426.anInt7242 * -699511149
				   + aClass546_7426.anInt7242 * -699511149))
		    return;
		int i_343_ = (class568.aShort7620
			      - aClass546_7426.anInt7202 * 1049621335
			      + aClass546_7426.anInt7242 * -699511149);
		if (i_343_ > (aClass546_7426.anInt7242 * -699511149
			      + aClass546_7426.anInt7242 * -699511149))
		    i_343_ = (aClass546_7426.anInt7242 * -699511149
			      + aClass546_7426.anInt7242 * -699511149);
		else if (i_343_ < 0)
		    return;
		int i_344_ = (class568.aShort7617
			      - aClass546_7426.anInt7214 * 1874840879
			      + aClass546_7426.anInt7242 * -699511149);
		if (i_344_ < 0)
		    i_344_ = 0;
		else if (i_344_ > (aClass546_7426.anInt7242 * -699511149
				   + aClass546_7426.anInt7242 * -699511149))
		    return;
		int i_345_ = (class568.aShort7610
			      - aClass546_7426.anInt7214 * 1874840879
			      + aClass546_7426.anInt7242 * -699511149);
		if (i_345_ > (aClass546_7426.anInt7242 * -699511149
			      + aClass546_7426.anInt7242 * -699511149))
		    i_345_ = (aClass546_7426.anInt7242 * -699511149
			      + aClass546_7426.anInt7242 * -699511149);
		else if (i_345_ < 0)
		    return;
		boolean bool = false;
	    while_38_:
		for (int i_346_ = i_344_; i_346_ <= i_345_; i_346_++) {
		    for (int i_347_ = i_342_; i_347_ <= i_343_; i_347_++) {
			if (aClass546_7426.aBoolArrayArray7262[i_346_]
			    [i_347_]) {
			    bool = true;
			    break while_38_;
			}
		    }
		}
		if (bool && method9185(class568, 0) && method9185(class568, 1)
		    && method9185(class568, 2) && method9185(class568, 3))
		    aClass568Array7431[anInt7430++] = class568;
	    }
	}
    }
    
    final boolean method9219(Class553 class553) {
	if (class553 == null)
	    return false;
	return method9172(class553.anInt7415, class553.anInt7417,
			  class553.anInt7411,
			  class553.anInt7418 - class553.anInt7415,
			  class553.anInt7416 - class553.anInt7417,
			  class553.anInt7420 - class553.anInt7411);
    }
    
    final boolean method9220(int i, int i_348_, int i_349_, int i_350_,
			     int i_351_, int i_352_) {
	int i_353_ = i + i_350_;
	int i_354_ = i_348_ + i_351_;
	int i_355_ = i_349_ + i_352_;
	if (!method9187(i, i_354_, i_349_, i_353_, i_354_, i_355_, i, i_354_,
			i_355_))
	    return false;
	if (!method9187(i, i_354_, i_349_, i_353_, i_354_, i_349_, i_353_,
			i_354_, i_355_))
	    return false;
	if (i < aClass546_7426.anInt7238 * 1787068049) {
	    if (!method9187(i, i_348_, i_355_, i, i_354_, i_349_, i, i_354_,
			    i_355_))
		return false;
	    if (!method9187(i, i_348_, i_355_, i, i_348_, i_349_, i, i_354_,
			    i_349_))
		return false;
	} else {
	    if (!method9187(i_353_, i_348_, i_355_, i_353_, i_354_, i_349_,
			    i_353_, i_354_, i_355_))
		return false;
	    if (!method9187(i_353_, i_348_, i_355_, i_353_, i_348_, i_349_,
			    i_353_, i_354_, i_349_))
		return false;
	}
	if (i_349_ < aClass546_7426.anInt7239 * 934728119) {
	    if (!method9187(i, i_348_, i_349_, i_353_, i_354_, i_349_, i,
			    i_354_, i_349_))
		return false;
	    if (!method9187(i, i_348_, i_349_, i_353_, i_348_, i_349_, i_353_,
			    i_354_, i_349_))
		return false;
	} else {
	    if (!method9187(i, i_348_, i_355_, i_353_, i_354_, i_355_, i,
			    i_354_, i_355_))
		return false;
	    if (!method9187(i, i_348_, i_355_, i_353_, i_348_, i_355_, i_353_,
			    i_354_, i_355_))
		return false;
	}
	return true;
    }
    
    final boolean method9221(int i, int i_356_, int i_357_, int i_358_,
			     int i_359_, int i_360_, int i_361_, int i_362_,
			     int i_363_) {
	if (!method9180(i, i_356_, i_357_))
	    return false;
	i = (int) aFloatArray7447[0];
	i_356_ = (int) aFloatArray7447[1];
	i_357_ = (int) aFloatArray7447[2];
	if (!method9180(i_358_, i_359_, i_360_))
	    return false;
	i_358_ = (int) aFloatArray7447[0];
	i_359_ = (int) aFloatArray7447[1];
	i_360_ = (int) aFloatArray7447[2];
	if (!method9180(i_361_, i_362_, i_363_))
	    return false;
	i_361_ = (int) aFloatArray7447[0];
	i_362_ = (int) aFloatArray7447[1];
	i_363_ = (int) aFloatArray7447[2];
	return aClass548_7436.method9106(i_356_, i_359_, i_362_, i, i_358_,
					 i_361_, i_357_, i_360_, i_363_);
    }
    
    final boolean method9222(int i, int i_364_, int i_365_, int i_366_,
			     int i_367_, int i_368_, int i_369_, int i_370_,
			     int i_371_) {
	if (!method9180(i, i_364_, i_365_))
	    return false;
	i = (int) aFloatArray7447[0];
	i_364_ = (int) aFloatArray7447[1];
	i_365_ = (int) aFloatArray7447[2];
	if (!method9180(i_366_, i_367_, i_368_))
	    return false;
	i_366_ = (int) aFloatArray7447[0];
	i_367_ = (int) aFloatArray7447[1];
	i_368_ = (int) aFloatArray7447[2];
	if (!method9180(i_369_, i_370_, i_371_))
	    return false;
	i_369_ = (int) aFloatArray7447[0];
	i_370_ = (int) aFloatArray7447[1];
	i_371_ = (int) aFloatArray7447[2];
	return aClass548_7436.method9106(i_364_, i_367_, i_370_, i, i_366_,
					 i_369_, i_365_, i_368_, i_371_);
    }
    
    boolean method9223(int i, int i_372_, int i_373_, int i_374_) {
	if (!aBool7434 || !aBool7421)
	    return false;
	if (aClass548_7436.anInt7284 < 101)
	    return false;
	if (!method9181(i, i_372_, i_373_))
	    return false;
	int i_375_ = i_372_ << aClass546_7426.anInt7200 * 1819515263;
	int i_376_ = i_373_ << aClass546_7426.anInt7200 * 1819515263;
	if (method9172(i_375_,
		       aClass546_7426.aClass161Array7226[i]
			   .method2577(i_372_, i_373_, (byte) -6),
		       i_376_, aClass546_7426.anInt7221 * -466040829, i_374_,
		       aClass546_7426.anInt7221 * -466040829))
	    return true;
	return false;
    }
    
    final boolean method9224(int i, int i_377_, int i_378_, int i_379_,
			     int i_380_, int i_381_, int i_382_, int i_383_,
			     int i_384_) {
	if (!method9180(i, i_377_, i_378_))
	    return false;
	i = (int) aFloatArray7447[0];
	i_377_ = (int) aFloatArray7447[1];
	i_378_ = (int) aFloatArray7447[2];
	if (!method9180(i_379_, i_380_, i_381_))
	    return false;
	i_379_ = (int) aFloatArray7447[0];
	i_380_ = (int) aFloatArray7447[1];
	i_381_ = (int) aFloatArray7447[2];
	if (!method9180(i_382_, i_383_, i_384_))
	    return false;
	i_382_ = (int) aFloatArray7447[0];
	i_383_ = (int) aFloatArray7447[1];
	i_384_ = (int) aFloatArray7447[2];
	return aClass548_7436.method9106(i_377_, i_380_, i_383_, i, i_379_,
					 i_382_, i_378_, i_381_, i_384_);
    }
}
