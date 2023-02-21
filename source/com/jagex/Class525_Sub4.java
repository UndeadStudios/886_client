/* Class525_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class525_Sub4 extends Class525
{
    Class10 aClass10_10458;
    Class161_Sub1 aClass161_Sub1_10459;
    Class525_Sub21 aClass525_Sub21_10460;
    int anInt10461;
    int anInt10462;
    Class182_Sub3 aClass182_Sub3_10463;
    int anInt10464;
    Class137 aClass137_10465;
    float[][] aFloatArrayArray10466;
    Interface16 anInterface16_10467;
    int anInt10468;
    Class137 aClass137_10469;
    int anInt10470;
    int anInt10471;
    Interface15 anInterface15_10472;
    float[][] aFloatArrayArray10473;
    RSBuffer aClass525_Sub38_10474;
    Class525_Sub38_Sub1 aClass525_Sub38_Sub1_10475;
    float[][] aFloatArrayArray10476;
    
    void method16104(int i, int i_0_, int i_1_, boolean[][] bools) {
	if (anInterface16_10467 != null && anInt10461 <= i + i_1_
	    && anInt10462 >= i - i_1_ && anInt10471 <= i_0_ + i_1_
	    && anInt10464 >= i_0_ - i_1_) {
	    for (int i_2_ = anInt10471; i_2_ <= anInt10464; i_2_++) {
		for (int i_3_ = anInt10461; i_3_ <= anInt10462; i_3_++) {
		    int i_4_ = i_3_ - i;
		    int i_5_ = i_2_ - i_0_;
		    if (i_4_ > -i_1_ && i_4_ < i_1_ && i_5_ > -i_1_
			&& i_5_ < i_1_ && bools[i_4_ + i_1_][i_5_ + i_1_]) {
			aClass182_Sub3_10463.method15400
			    ((int) (aClass525_Sub21_10460
					.method16306(-1485514904)
				    * 255.0F) << 24);
			aClass182_Sub3_10463.method15384(aClass137_10469, null,
							 aClass137_10465,
							 null);
			aClass182_Sub3_10463.method15427(anInterface16_10467,
							 4, 0, anInt10470);
			return;
		    }
		}
	    }
	}
    }
    
    void method16105(int i, int i_6_, int i_7_, boolean[][] bools) {
	if (anInterface16_10467 != null && anInt10461 <= i + i_7_
	    && anInt10462 >= i - i_7_ && anInt10471 <= i_6_ + i_7_
	    && anInt10464 >= i_6_ - i_7_) {
	    for (int i_8_ = anInt10471; i_8_ <= anInt10464; i_8_++) {
		for (int i_9_ = anInt10461; i_9_ <= anInt10462; i_9_++) {
		    int i_10_ = i_9_ - i;
		    int i_11_ = i_8_ - i_6_;
		    if (i_10_ > -i_7_ && i_10_ < i_7_ && i_11_ > -i_7_
			&& i_11_ < i_7_ && bools[i_10_ + i_7_][i_11_ + i_7_]) {
			aClass182_Sub3_10463.method15400
			    ((int) (aClass525_Sub21_10460
					.method16306(-1563628627)
				    * 255.0F) << 24);
			aClass182_Sub3_10463.method15384(aClass137_10469, null,
							 aClass137_10465,
							 null);
			aClass182_Sub3_10463.method15427(anInterface16_10467,
							 4, 0, anInt10470);
			return;
		    }
		}
	    }
	}
    }
    
    void method16106(int i, int i_12_, int i_13_, int i_14_, int i_15_,
		     int i_16_) {
	long l = -1L;
	int i_17_
	    = i_15_ + (i_13_ << aClass161_Sub1_10459.anInt1763 * -2063427645);
	int i_18_
	    = i_16_ + (i_14_ << aClass161_Sub1_10459.anInt1763 * -2063427645);
	int i_19_ = aClass161_Sub1_10459.method2619(i_17_, i_18_, 1118488422);
	if ((i_15_ & 0x7f) == 0 || (i_16_ & 0x7f) == 0) {
	    l = ((long) i_18_ & 0xffffL) << 16 | (long) i_17_ & 0xffffL;
	    Class525_Sub20 class525_sub20
		= (Class525_Sub20) aClass10_10458.method684(l);
	    if (class525_sub20 != null) {
		method16112(class525_sub20.aShort10573);
		return;
	    }
	}
	short i_20_ = (short) anInt10468++;
	if (l != -1L)
	    aClass10_10458.method695(new Class525_Sub20(i_20_), l);
	float f;
	float f_21_;
	float f_22_;
	if (i_15_ == 0 && i_16_ == 0) {
	    f = aFloatArrayArray10476[i][i_12_];
	    f_21_ = aFloatArrayArray10473[i][i_12_];
	    f_22_ = aFloatArrayArray10466[i][i_12_];
	} else if (i_15_ == aClass161_Sub1_10459.anInt1761 * 435863595
		   && i_16_ == 0) {
	    f = aFloatArrayArray10476[i + 1][i_12_];
	    f_21_ = aFloatArrayArray10473[i + 1][i_12_];
	    f_22_ = aFloatArrayArray10466[i + 1][i_12_];
	} else if (i_15_ == aClass161_Sub1_10459.anInt1761 * 435863595
		   && i_16_ == aClass161_Sub1_10459.anInt1761 * 435863595) {
	    f = aFloatArrayArray10476[i + 1][i_12_ + 1];
	    f_21_ = aFloatArrayArray10473[i + 1][i_12_ + 1];
	    f_22_ = aFloatArrayArray10466[i + 1][i_12_ + 1];
	} else if (i_15_ == 0
		   && i_16_ == aClass161_Sub1_10459.anInt1761 * 435863595) {
	    f = aFloatArrayArray10476[i][i_12_ + 1];
	    f_21_ = aFloatArrayArray10473[i][i_12_ + 1];
	    f_22_ = aFloatArrayArray10466[i][i_12_ + 1];
	} else {
	    float f_23_
		= ((float) i_15_
		   / (float) (aClass161_Sub1_10459.anInt1761 * 435863595));
	    float f_24_
		= ((float) i_16_
		   / (float) (aClass161_Sub1_10459.anInt1761 * 435863595));
	    float f_25_ = aFloatArrayArray10476[i][i_12_];
	    float f_26_ = aFloatArrayArray10473[i][i_12_];
	    float f_27_ = aFloatArrayArray10466[i][i_12_];
	    float f_28_ = aFloatArrayArray10476[i + 1][i_12_];
	    float f_29_ = aFloatArrayArray10473[i + 1][i_12_];
	    float f_30_ = aFloatArrayArray10466[i + 1][i_12_];
	    f_25_ += (aFloatArrayArray10476[i][i_12_ + 1] - f_25_) * f_23_;
	    f_26_ += (aFloatArrayArray10473[i][i_12_ + 1] - f_26_) * f_23_;
	    f_27_ += (aFloatArrayArray10466[i][i_12_ + 1] - f_27_) * f_23_;
	    f_28_ += (aFloatArrayArray10476[i + 1][i_12_ + 1] - f_28_) * f_23_;
	    f_29_ += (aFloatArrayArray10473[i + 1][i_12_ + 1] - f_29_) * f_23_;
	    f_30_ += (aFloatArrayArray10466[i + 1][i_12_ + 1] - f_30_) * f_23_;
	    f = f_25_ + (f_28_ - f_25_) * f_24_;
	    f_21_ = f_26_ + (f_29_ - f_26_) * f_24_;
	    f_22_ = f_27_ + (f_30_ - f_27_) * f_24_;
	}
	float f_31_
	    = (float) (aClass525_Sub21_10460.method16314(613491578) - i_17_);
	float f_32_ = (float) (aClass525_Sub21_10460.method16312((short) 25607)
			       - i_19_);
	float f_33_
	    = (float) (aClass525_Sub21_10460.method16301((byte) 6) - i_18_);
	float f_34_ = (float) Math.sqrt((double) (f_31_ * f_31_ + f_32_ * f_32_
						  + f_33_ * f_33_));
	float f_35_ = 1.0F / f_34_;
	f_31_ *= f_35_;
	f_32_ *= f_35_;
	f_33_ *= f_35_;
	float f_36_
	    = f_34_ / (float) aClass525_Sub21_10460.method16332(1887813949);
	float f_37_ = 1.0F - f_36_ * f_36_;
	if (f_37_ < 0.0F)
	    f_37_ = 0.0F;
	float f_38_ = f_31_ * f + f_32_ * f_21_ + f_33_ * f_22_;
	if (f_38_ < 0.0F)
	    f_38_ = 0.0F;
	float f_39_ = f_38_ * f_37_ * 2.0F;
	if (f_39_ > 1.0F)
	    f_39_ = 1.0F;
	int i_40_ = aClass525_Sub21_10460.method16298(-1560631710);
	int i_41_ = (int) (f_39_ * (float) (i_40_ >> 16 & 0xff));
	if (i_41_ > 255)
	    i_41_ = 255;
	int i_42_ = (int) (f_39_ * (float) (i_40_ >> 8 & 0xff));
	if (i_42_ > 255)
	    i_42_ = 255;
	int i_43_ = (int) (f_39_ * (float) (i_40_ & 0xff));
	if (i_43_ > 255)
	    i_43_ = 255;
	if (aClass182_Sub3_10463.aBool9792) {
	    aClass525_Sub38_Sub1_10475.method18263((float) i_17_);
	    aClass525_Sub38_Sub1_10475.method18263((float) i_19_);
	    aClass525_Sub38_Sub1_10475.method18263((float) i_18_);
	} else {
	    aClass525_Sub38_Sub1_10475.method18262((float) i_17_);
	    aClass525_Sub38_Sub1_10475.method18262((float) i_19_);
	    aClass525_Sub38_Sub1_10475.method18262((float) i_18_);
	}
	aClass525_Sub38_Sub1_10475.method16735(i_41_, -704382952);
	aClass525_Sub38_Sub1_10475.method16735(i_42_, -285783142);
	aClass525_Sub38_Sub1_10475.method16735(i_43_, -333750511);
	aClass525_Sub38_Sub1_10475.method16735(255, -2115137628);
	method16112(i_20_);
    }
    
    void method16107(int i, int i_44_, int i_45_, int i_46_, int i_47_,
		     int i_48_) {
	long l = -1L;
	int i_49_
	    = i_47_ + (i_45_ << aClass161_Sub1_10459.anInt1763 * -2063427645);
	int i_50_
	    = i_48_ + (i_46_ << aClass161_Sub1_10459.anInt1763 * -2063427645);
	int i_51_ = aClass161_Sub1_10459.method2619(i_49_, i_50_, -266773051);
	if ((i_47_ & 0x7f) == 0 || (i_48_ & 0x7f) == 0) {
	    l = ((long) i_50_ & 0xffffL) << 16 | (long) i_49_ & 0xffffL;
	    Class525_Sub20 class525_sub20
		= (Class525_Sub20) aClass10_10458.method684(l);
	    if (class525_sub20 != null) {
		method16112(class525_sub20.aShort10573);
		return;
	    }
	}
	short i_52_ = (short) anInt10468++;
	if (l != -1L)
	    aClass10_10458.method695(new Class525_Sub20(i_52_), l);
	float f;
	float f_53_;
	float f_54_;
	if (i_47_ == 0 && i_48_ == 0) {
	    f = aFloatArrayArray10476[i][i_44_];
	    f_53_ = aFloatArrayArray10473[i][i_44_];
	    f_54_ = aFloatArrayArray10466[i][i_44_];
	} else if (i_47_ == aClass161_Sub1_10459.anInt1761 * 435863595
		   && i_48_ == 0) {
	    f = aFloatArrayArray10476[i + 1][i_44_];
	    f_53_ = aFloatArrayArray10473[i + 1][i_44_];
	    f_54_ = aFloatArrayArray10466[i + 1][i_44_];
	} else if (i_47_ == aClass161_Sub1_10459.anInt1761 * 435863595
		   && i_48_ == aClass161_Sub1_10459.anInt1761 * 435863595) {
	    f = aFloatArrayArray10476[i + 1][i_44_ + 1];
	    f_53_ = aFloatArrayArray10473[i + 1][i_44_ + 1];
	    f_54_ = aFloatArrayArray10466[i + 1][i_44_ + 1];
	} else if (i_47_ == 0
		   && i_48_ == aClass161_Sub1_10459.anInt1761 * 435863595) {
	    f = aFloatArrayArray10476[i][i_44_ + 1];
	    f_53_ = aFloatArrayArray10473[i][i_44_ + 1];
	    f_54_ = aFloatArrayArray10466[i][i_44_ + 1];
	} else {
	    float f_55_
		= ((float) i_47_
		   / (float) (aClass161_Sub1_10459.anInt1761 * 435863595));
	    float f_56_
		= ((float) i_48_
		   / (float) (aClass161_Sub1_10459.anInt1761 * 435863595));
	    float f_57_ = aFloatArrayArray10476[i][i_44_];
	    float f_58_ = aFloatArrayArray10473[i][i_44_];
	    float f_59_ = aFloatArrayArray10466[i][i_44_];
	    float f_60_ = aFloatArrayArray10476[i + 1][i_44_];
	    float f_61_ = aFloatArrayArray10473[i + 1][i_44_];
	    float f_62_ = aFloatArrayArray10466[i + 1][i_44_];
	    f_57_ += (aFloatArrayArray10476[i][i_44_ + 1] - f_57_) * f_55_;
	    f_58_ += (aFloatArrayArray10473[i][i_44_ + 1] - f_58_) * f_55_;
	    f_59_ += (aFloatArrayArray10466[i][i_44_ + 1] - f_59_) * f_55_;
	    f_60_ += (aFloatArrayArray10476[i + 1][i_44_ + 1] - f_60_) * f_55_;
	    f_61_ += (aFloatArrayArray10473[i + 1][i_44_ + 1] - f_61_) * f_55_;
	    f_62_ += (aFloatArrayArray10466[i + 1][i_44_ + 1] - f_62_) * f_55_;
	    f = f_57_ + (f_60_ - f_57_) * f_56_;
	    f_53_ = f_58_ + (f_61_ - f_58_) * f_56_;
	    f_54_ = f_59_ + (f_62_ - f_59_) * f_56_;
	}
	float f_63_
	    = (float) (aClass525_Sub21_10460.method16314(1123409618) - i_49_);
	float f_64_ = (float) (aClass525_Sub21_10460.method16312((short) 18403)
			       - i_51_);
	float f_65_
	    = (float) (aClass525_Sub21_10460.method16301((byte) 6) - i_50_);
	float f_66_ = (float) Math.sqrt((double) (f_63_ * f_63_ + f_64_ * f_64_
						  + f_65_ * f_65_));
	float f_67_ = 1.0F / f_66_;
	f_63_ *= f_67_;
	f_64_ *= f_67_;
	f_65_ *= f_67_;
	float f_68_
	    = f_66_ / (float) aClass525_Sub21_10460.method16332(1669265183);
	float f_69_ = 1.0F - f_68_ * f_68_;
	if (f_69_ < 0.0F)
	    f_69_ = 0.0F;
	float f_70_ = f_63_ * f + f_64_ * f_53_ + f_65_ * f_54_;
	if (f_70_ < 0.0F)
	    f_70_ = 0.0F;
	float f_71_ = f_70_ * f_69_ * 2.0F;
	if (f_71_ > 1.0F)
	    f_71_ = 1.0F;
	int i_72_ = aClass525_Sub21_10460.method16298(-1794463127);
	int i_73_ = (int) (f_71_ * (float) (i_72_ >> 16 & 0xff));
	if (i_73_ > 255)
	    i_73_ = 255;
	int i_74_ = (int) (f_71_ * (float) (i_72_ >> 8 & 0xff));
	if (i_74_ > 255)
	    i_74_ = 255;
	int i_75_ = (int) (f_71_ * (float) (i_72_ & 0xff));
	if (i_75_ > 255)
	    i_75_ = 255;
	if (aClass182_Sub3_10463.aBool9792) {
	    aClass525_Sub38_Sub1_10475.method18263((float) i_49_);
	    aClass525_Sub38_Sub1_10475.method18263((float) i_51_);
	    aClass525_Sub38_Sub1_10475.method18263((float) i_50_);
	} else {
	    aClass525_Sub38_Sub1_10475.method18262((float) i_49_);
	    aClass525_Sub38_Sub1_10475.method18262((float) i_51_);
	    aClass525_Sub38_Sub1_10475.method18262((float) i_50_);
	}
	aClass525_Sub38_Sub1_10475.method16735(i_73_, -886527368);
	aClass525_Sub38_Sub1_10475.method16735(i_74_, -691509311);
	aClass525_Sub38_Sub1_10475.method16735(i_75_, -1029845530);
	aClass525_Sub38_Sub1_10475.method16735(255, -2063605322);
	method16112(i_52_);
    }
    
    void method16108(int i, int i_76_, int i_77_, boolean[][] bools) {
	if (anInterface16_10467 != null && anInt10461 <= i + i_77_
	    && anInt10462 >= i - i_77_ && anInt10471 <= i_76_ + i_77_
	    && anInt10464 >= i_76_ - i_77_) {
	    for (int i_78_ = anInt10471; i_78_ <= anInt10464; i_78_++) {
		for (int i_79_ = anInt10461; i_79_ <= anInt10462; i_79_++) {
		    int i_80_ = i_79_ - i;
		    int i_81_ = i_78_ - i_76_;
		    if (i_80_ > -i_77_ && i_80_ < i_77_ && i_81_ > -i_77_
			&& i_81_ < i_77_
			&& bools[i_80_ + i_77_][i_81_ + i_77_]) {
			aClass182_Sub3_10463.method15400
			    ((int) (aClass525_Sub21_10460
					.method16306(-2065453966)
				    * 255.0F) << 24);
			aClass182_Sub3_10463.method15384(aClass137_10469, null,
							 aClass137_10465,
							 null);
			aClass182_Sub3_10463.method15427(anInterface16_10467,
							 4, 0, anInt10470);
			return;
		    }
		}
	    }
	}
    }
    
    void method16109(short i) {
	if (aClass182_Sub3_10463.aBool9792)
	    aClass525_Sub38_10474.method16602(i, 1658928346);
	else
	    aClass525_Sub38_10474.method16840(i, 241387851);
    }
    
    void method16110(int i, int i_82_, int i_83_, int i_84_, int i_85_,
		     int i_86_) {
	long l = -1L;
	int i_87_
	    = i_85_ + (i_83_ << aClass161_Sub1_10459.anInt1763 * -2063427645);
	int i_88_
	    = i_86_ + (i_84_ << aClass161_Sub1_10459.anInt1763 * -2063427645);
	int i_89_ = aClass161_Sub1_10459.method2619(i_87_, i_88_, -1389349292);
	if ((i_85_ & 0x7f) == 0 || (i_86_ & 0x7f) == 0) {
	    l = ((long) i_88_ & 0xffffL) << 16 | (long) i_87_ & 0xffffL;
	    Class525_Sub20 class525_sub20
		= (Class525_Sub20) aClass10_10458.method684(l);
	    if (class525_sub20 != null) {
		method16112(class525_sub20.aShort10573);
		return;
	    }
	}
	short i_90_ = (short) anInt10468++;
	if (l != -1L)
	    aClass10_10458.method695(new Class525_Sub20(i_90_), l);
	float f;
	float f_91_;
	float f_92_;
	if (i_85_ == 0 && i_86_ == 0) {
	    f = aFloatArrayArray10476[i][i_82_];
	    f_91_ = aFloatArrayArray10473[i][i_82_];
	    f_92_ = aFloatArrayArray10466[i][i_82_];
	} else if (i_85_ == aClass161_Sub1_10459.anInt1761 * 435863595
		   && i_86_ == 0) {
	    f = aFloatArrayArray10476[i + 1][i_82_];
	    f_91_ = aFloatArrayArray10473[i + 1][i_82_];
	    f_92_ = aFloatArrayArray10466[i + 1][i_82_];
	} else if (i_85_ == aClass161_Sub1_10459.anInt1761 * 435863595
		   && i_86_ == aClass161_Sub1_10459.anInt1761 * 435863595) {
	    f = aFloatArrayArray10476[i + 1][i_82_ + 1];
	    f_91_ = aFloatArrayArray10473[i + 1][i_82_ + 1];
	    f_92_ = aFloatArrayArray10466[i + 1][i_82_ + 1];
	} else if (i_85_ == 0
		   && i_86_ == aClass161_Sub1_10459.anInt1761 * 435863595) {
	    f = aFloatArrayArray10476[i][i_82_ + 1];
	    f_91_ = aFloatArrayArray10473[i][i_82_ + 1];
	    f_92_ = aFloatArrayArray10466[i][i_82_ + 1];
	} else {
	    float f_93_
		= ((float) i_85_
		   / (float) (aClass161_Sub1_10459.anInt1761 * 435863595));
	    float f_94_
		= ((float) i_86_
		   / (float) (aClass161_Sub1_10459.anInt1761 * 435863595));
	    float f_95_ = aFloatArrayArray10476[i][i_82_];
	    float f_96_ = aFloatArrayArray10473[i][i_82_];
	    float f_97_ = aFloatArrayArray10466[i][i_82_];
	    float f_98_ = aFloatArrayArray10476[i + 1][i_82_];
	    float f_99_ = aFloatArrayArray10473[i + 1][i_82_];
	    float f_100_ = aFloatArrayArray10466[i + 1][i_82_];
	    f_95_ += (aFloatArrayArray10476[i][i_82_ + 1] - f_95_) * f_93_;
	    f_96_ += (aFloatArrayArray10473[i][i_82_ + 1] - f_96_) * f_93_;
	    f_97_ += (aFloatArrayArray10466[i][i_82_ + 1] - f_97_) * f_93_;
	    f_98_ += (aFloatArrayArray10476[i + 1][i_82_ + 1] - f_98_) * f_93_;
	    f_99_ += (aFloatArrayArray10473[i + 1][i_82_ + 1] - f_99_) * f_93_;
	    f_100_
		+= (aFloatArrayArray10466[i + 1][i_82_ + 1] - f_100_) * f_93_;
	    f = f_95_ + (f_98_ - f_95_) * f_94_;
	    f_91_ = f_96_ + (f_99_ - f_96_) * f_94_;
	    f_92_ = f_97_ + (f_100_ - f_97_) * f_94_;
	}
	float f_101_
	    = (float) (aClass525_Sub21_10460.method16314(-1584353604) - i_87_);
	float f_102_
	    = (float) (aClass525_Sub21_10460.method16312((short) 15639)
		       - i_89_);
	float f_103_
	    = (float) (aClass525_Sub21_10460.method16301((byte) 6) - i_88_);
	float f_104_
	    = (float) Math.sqrt((double) (f_101_ * f_101_ + f_102_ * f_102_
					  + f_103_ * f_103_));
	float f_105_ = 1.0F / f_104_;
	f_101_ *= f_105_;
	f_102_ *= f_105_;
	f_103_ *= f_105_;
	float f_106_
	    = f_104_ / (float) aClass525_Sub21_10460.method16332(1728231340);
	float f_107_ = 1.0F - f_106_ * f_106_;
	if (f_107_ < 0.0F)
	    f_107_ = 0.0F;
	float f_108_ = f_101_ * f + f_102_ * f_91_ + f_103_ * f_92_;
	if (f_108_ < 0.0F)
	    f_108_ = 0.0F;
	float f_109_ = f_108_ * f_107_ * 2.0F;
	if (f_109_ > 1.0F)
	    f_109_ = 1.0F;
	int i_110_ = aClass525_Sub21_10460.method16298(-60225835);
	int i_111_ = (int) (f_109_ * (float) (i_110_ >> 16 & 0xff));
	if (i_111_ > 255)
	    i_111_ = 255;
	int i_112_ = (int) (f_109_ * (float) (i_110_ >> 8 & 0xff));
	if (i_112_ > 255)
	    i_112_ = 255;
	int i_113_ = (int) (f_109_ * (float) (i_110_ & 0xff));
	if (i_113_ > 255)
	    i_113_ = 255;
	if (aClass182_Sub3_10463.aBool9792) {
	    aClass525_Sub38_Sub1_10475.method18263((float) i_87_);
	    aClass525_Sub38_Sub1_10475.method18263((float) i_89_);
	    aClass525_Sub38_Sub1_10475.method18263((float) i_88_);
	} else {
	    aClass525_Sub38_Sub1_10475.method18262((float) i_87_);
	    aClass525_Sub38_Sub1_10475.method18262((float) i_89_);
	    aClass525_Sub38_Sub1_10475.method18262((float) i_88_);
	}
	aClass525_Sub38_Sub1_10475.method16735(i_111_, -540609019);
	aClass525_Sub38_Sub1_10475.method16735(i_112_, -374247655);
	aClass525_Sub38_Sub1_10475.method16735(i_113_, -937981556);
	aClass525_Sub38_Sub1_10475.method16735(255, -1074903561);
	method16112(i_90_);
    }
    
    void method16111(int i, int i_114_, int i_115_, int i_116_, int i_117_,
		     int i_118_) {
	long l = -1L;
	int i_119_
	    = (i_117_
	       + (i_115_ << aClass161_Sub1_10459.anInt1763 * -2063427645));
	int i_120_
	    = (i_118_
	       + (i_116_ << aClass161_Sub1_10459.anInt1763 * -2063427645));
	int i_121_
	    = aClass161_Sub1_10459.method2619(i_119_, i_120_, 1288679620);
	if ((i_117_ & 0x7f) == 0 || (i_118_ & 0x7f) == 0) {
	    l = ((long) i_120_ & 0xffffL) << 16 | (long) i_119_ & 0xffffL;
	    Class525_Sub20 class525_sub20
		= (Class525_Sub20) aClass10_10458.method684(l);
	    if (class525_sub20 != null) {
		method16112(class525_sub20.aShort10573);
		return;
	    }
	}
	short i_122_ = (short) anInt10468++;
	if (l != -1L)
	    aClass10_10458.method695(new Class525_Sub20(i_122_), l);
	float f;
	float f_123_;
	float f_124_;
	if (i_117_ == 0 && i_118_ == 0) {
	    f = aFloatArrayArray10476[i][i_114_];
	    f_123_ = aFloatArrayArray10473[i][i_114_];
	    f_124_ = aFloatArrayArray10466[i][i_114_];
	} else if (i_117_ == aClass161_Sub1_10459.anInt1761 * 435863595
		   && i_118_ == 0) {
	    f = aFloatArrayArray10476[i + 1][i_114_];
	    f_123_ = aFloatArrayArray10473[i + 1][i_114_];
	    f_124_ = aFloatArrayArray10466[i + 1][i_114_];
	} else if (i_117_ == aClass161_Sub1_10459.anInt1761 * 435863595
		   && i_118_ == aClass161_Sub1_10459.anInt1761 * 435863595) {
	    f = aFloatArrayArray10476[i + 1][i_114_ + 1];
	    f_123_ = aFloatArrayArray10473[i + 1][i_114_ + 1];
	    f_124_ = aFloatArrayArray10466[i + 1][i_114_ + 1];
	} else if (i_117_ == 0
		   && i_118_ == aClass161_Sub1_10459.anInt1761 * 435863595) {
	    f = aFloatArrayArray10476[i][i_114_ + 1];
	    f_123_ = aFloatArrayArray10473[i][i_114_ + 1];
	    f_124_ = aFloatArrayArray10466[i][i_114_ + 1];
	} else {
	    float f_125_
		= ((float) i_117_
		   / (float) (aClass161_Sub1_10459.anInt1761 * 435863595));
	    float f_126_
		= ((float) i_118_
		   / (float) (aClass161_Sub1_10459.anInt1761 * 435863595));
	    float f_127_ = aFloatArrayArray10476[i][i_114_];
	    float f_128_ = aFloatArrayArray10473[i][i_114_];
	    float f_129_ = aFloatArrayArray10466[i][i_114_];
	    float f_130_ = aFloatArrayArray10476[i + 1][i_114_];
	    float f_131_ = aFloatArrayArray10473[i + 1][i_114_];
	    float f_132_ = aFloatArrayArray10466[i + 1][i_114_];
	    f_127_ += (aFloatArrayArray10476[i][i_114_ + 1] - f_127_) * f_125_;
	    f_128_ += (aFloatArrayArray10473[i][i_114_ + 1] - f_128_) * f_125_;
	    f_129_ += (aFloatArrayArray10466[i][i_114_ + 1] - f_129_) * f_125_;
	    f_130_ += ((aFloatArrayArray10476[i + 1][i_114_ + 1] - f_130_)
		       * f_125_);
	    f_131_ += ((aFloatArrayArray10473[i + 1][i_114_ + 1] - f_131_)
		       * f_125_);
	    f_132_ += ((aFloatArrayArray10466[i + 1][i_114_ + 1] - f_132_)
		       * f_125_);
	    f = f_127_ + (f_130_ - f_127_) * f_126_;
	    f_123_ = f_128_ + (f_131_ - f_128_) * f_126_;
	    f_124_ = f_129_ + (f_132_ - f_129_) * f_126_;
	}
	float f_133_ = (float) (aClass525_Sub21_10460.method16314(-1463192469)
				- i_119_);
	float f_134_ = (float) (aClass525_Sub21_10460.method16312((short) 383)
				- i_121_);
	float f_135_
	    = (float) (aClass525_Sub21_10460.method16301((byte) 6) - i_120_);
	float f_136_
	    = (float) Math.sqrt((double) (f_133_ * f_133_ + f_134_ * f_134_
					  + f_135_ * f_135_));
	float f_137_ = 1.0F / f_136_;
	f_133_ *= f_137_;
	f_134_ *= f_137_;
	f_135_ *= f_137_;
	float f_138_
	    = f_136_ / (float) aClass525_Sub21_10460.method16332(1839141186);
	float f_139_ = 1.0F - f_138_ * f_138_;
	if (f_139_ < 0.0F)
	    f_139_ = 0.0F;
	float f_140_ = f_133_ * f + f_134_ * f_123_ + f_135_ * f_124_;
	if (f_140_ < 0.0F)
	    f_140_ = 0.0F;
	float f_141_ = f_140_ * f_139_ * 2.0F;
	if (f_141_ > 1.0F)
	    f_141_ = 1.0F;
	int i_142_ = aClass525_Sub21_10460.method16298(-2026966163);
	int i_143_ = (int) (f_141_ * (float) (i_142_ >> 16 & 0xff));
	if (i_143_ > 255)
	    i_143_ = 255;
	int i_144_ = (int) (f_141_ * (float) (i_142_ >> 8 & 0xff));
	if (i_144_ > 255)
	    i_144_ = 255;
	int i_145_ = (int) (f_141_ * (float) (i_142_ & 0xff));
	if (i_145_ > 255)
	    i_145_ = 255;
	if (aClass182_Sub3_10463.aBool9792) {
	    aClass525_Sub38_Sub1_10475.method18263((float) i_119_);
	    aClass525_Sub38_Sub1_10475.method18263((float) i_121_);
	    aClass525_Sub38_Sub1_10475.method18263((float) i_120_);
	} else {
	    aClass525_Sub38_Sub1_10475.method18262((float) i_119_);
	    aClass525_Sub38_Sub1_10475.method18262((float) i_121_);
	    aClass525_Sub38_Sub1_10475.method18262((float) i_120_);
	}
	aClass525_Sub38_Sub1_10475.method16735(i_143_, -675929890);
	aClass525_Sub38_Sub1_10475.method16735(i_144_, -1813346010);
	aClass525_Sub38_Sub1_10475.method16735(i_145_, -1042232296);
	aClass525_Sub38_Sub1_10475.method16735(255, -1684559566);
	method16112(i_122_);
    }
    
    void method16112(short i) {
	if (aClass182_Sub3_10463.aBool9792)
	    aClass525_Sub38_10474.method16602(i, 1748789290);
	else
	    aClass525_Sub38_10474.method16840(i, 241387851);
    }
    
    void method16113(int i, int i_146_, int i_147_, boolean[][] bools) {
	if (anInterface16_10467 != null && anInt10461 <= i + i_147_
	    && anInt10462 >= i - i_147_ && anInt10471 <= i_146_ + i_147_
	    && anInt10464 >= i_146_ - i_147_) {
	    for (int i_148_ = anInt10471; i_148_ <= anInt10464; i_148_++) {
		for (int i_149_ = anInt10461; i_149_ <= anInt10462; i_149_++) {
		    int i_150_ = i_149_ - i;
		    int i_151_ = i_148_ - i_146_;
		    if (i_150_ > -i_147_ && i_150_ < i_147_ && i_151_ > -i_147_
			&& i_151_ < i_147_
			&& bools[i_150_ + i_147_][i_151_ + i_147_]) {
			aClass182_Sub3_10463.method15400
			    ((int) (aClass525_Sub21_10460
					.method16306(-2115106925)
				    * 255.0F) << 24);
			aClass182_Sub3_10463.method15384(aClass137_10469, null,
							 aClass137_10465,
							 null);
			aClass182_Sub3_10463.method15427(anInterface16_10467,
							 4, 0, anInt10470);
			return;
		    }
		}
	    }
	}
    }
    
    void method16114(short i) {
	if (aClass182_Sub3_10463.aBool9792)
	    aClass525_Sub38_10474.method16602(i, 1427527651);
	else
	    aClass525_Sub38_10474.method16840(i, 241387851);
    }
    
    Class525_Sub4(Class182_Sub3 class182_sub3, Class161_Sub1 class161_sub1,
		  Class525_Sub21 class525_sub21, int[] is) {
	aClass182_Sub3_10463 = class182_sub3;
	aClass525_Sub21_10460 = class525_sub21;
	aClass161_Sub1_10459 = class161_sub1;
	int i = (aClass525_Sub21_10460.method16332(2040669385)
		 - (class161_sub1.anInt1761 * 435863595 >> 1));
	anInt10461 = (aClass525_Sub21_10460.method16314(-2132032765) - i
		      >> class161_sub1.anInt1763 * -2063427645);
	anInt10462 = (aClass525_Sub21_10460.method16314(1891750792) + i
		      >> class161_sub1.anInt1763 * -2063427645);
	anInt10471 = (aClass525_Sub21_10460.method16301((byte) 6) - i
		      >> class161_sub1.anInt1763 * -2063427645);
	anInt10464 = (aClass525_Sub21_10460.method16301((byte) 6) + i
		      >> class161_sub1.anInt1763 * -2063427645);
	int i_152_ = anInt10462 - anInt10461 + 1;
	int i_153_ = anInt10464 - anInt10471 + 1;
	aFloatArrayArray10476 = new float[i_152_ + 1][i_153_ + 1];
	aFloatArrayArray10473 = new float[i_152_ + 1][i_153_ + 1];
	aFloatArrayArray10466 = new float[i_152_ + 1][i_153_ + 1];
	for (int i_154_ = 0; i_154_ <= i_153_; i_154_++) {
	    int i_155_ = i_154_ + anInt10471;
	    if (i_155_ > 0
		&& i_155_ < aClass161_Sub1_10459.anInt1760 * -1152334393 - 1) {
		for (int i_156_ = 0; i_156_ <= i_152_; i_156_++) {
		    int i_157_ = i_156_ + anInt10461;
		    if (i_157_ > 0
			&& i_157_ < (aClass161_Sub1_10459.anInt1759 * 363736815
				     - 1)) {
			int i_158_
			    = (class161_sub1.method2577(i_157_ + 1, i_155_,
							(byte) -24)
			       - class161_sub1.method2577(i_157_ - 1, i_155_,
							  (byte) -20));
			int i_159_
			    = (class161_sub1.method2577(i_157_, i_155_ + 1,
							(byte) 42)
			       - class161_sub1.method2577(i_157_, i_155_ - 1,
							  (byte) 50));
			float f
			    = (float) (1.0
				       / Math.sqrt((double) (i_158_ * i_158_
							     + 65536
							     + (i_159_
								* i_159_))));
			aFloatArrayArray10476[i_156_][i_154_]
			    = (float) i_158_ * f;
			aFloatArrayArray10473[i_156_][i_154_] = -256.0F * f;
			aFloatArrayArray10466[i_156_][i_154_]
			    = (float) i_159_ * f;
		    }
		}
	    }
	}
	int i_160_ = 0;
	for (int i_161_ = anInt10471; i_161_ <= anInt10464; i_161_++) {
	    if (i_161_ >= 0
		&& i_161_ < class161_sub1.anInt1760 * -1152334393) {
		for (int i_162_ = anInt10461; i_162_ <= anInt10462; i_162_++) {
		    if (i_162_ >= 0
			&& i_162_ < class161_sub1.anInt1759 * 363736815) {
			int i_163_ = is[i_160_];
			int[] is_164_ = (class161_sub1.anIntArrayArrayArray9337
					 [i_162_][i_161_]);
			if (is_164_ != null && i_163_ != 0) {
			    if (i_163_ == 1) {
				for (int i_165_ = 0; i_165_ < is_164_.length;
				     i_165_ += 3) {
				    if (is_164_[i_165_] != -1
					&& is_164_[i_165_ + 1] != -1
					&& is_164_[i_165_ + 2] != -1)
					anInt10470 += 3;
				}
			    } else
				anInt10470 += 3;
			}
		    }
		    i_160_++;
		}
	    } else
		i_160_ += anInt10462 - anInt10461;
	}
	if (anInt10470 > 0) {
	    aClass525_Sub38_10474 = new RSBuffer(anInt10470 * 2);
	    aClass525_Sub38_Sub1_10475
		= new Class525_Sub38_Sub1(anInt10470 * 16);
	    aClass10_10458
		= new Class10(Class212.method3935(anInt10470, -2056250364));
	    int i_166_ = 0;
	    i_160_ = 0;
	    for (int i_167_ = anInt10471; i_167_ <= anInt10464; i_167_++) {
		if (i_167_ >= 0
		    && i_167_ < class161_sub1.anInt1760 * -1152334393) {
		    int i_168_ = 0;
		    for (int i_169_ = anInt10461; i_169_ <= anInt10462;
			 i_169_++) {
			if (i_169_ >= 0
			    && i_169_ < class161_sub1.anInt1759 * 363736815) {
			    int i_170_ = is[i_160_];
			    int[] is_171_
				= (class161_sub1.anIntArrayArrayArray9337
				   [i_169_][i_167_]);
			    if (is_171_ != null && i_170_ != 0) {
				if (i_170_ == 1) {
				    int[] is_172_ = (class161_sub1
						     .anIntArrayArrayArray9339
						     [i_169_][i_167_]);
				    int[] is_173_ = (class161_sub1
						     .anIntArrayArrayArray9352
						     [i_169_][i_167_]);
				    int i_174_ = 0;
				    while (i_174_ < is_171_.length) {
					if (is_171_[i_174_] != -1
					    && is_171_[i_174_ + 1] != -1
					    && is_171_[i_174_ + 2] != -1) {
					    method16106(i_168_, i_166_, i_169_,
							i_167_,
							is_172_[i_174_],
							is_173_[i_174_]);
					    i_174_++;
					    method16106(i_168_, i_166_, i_169_,
							i_167_,
							is_172_[i_174_],
							is_173_[i_174_]);
					    i_174_++;
					    method16106(i_168_, i_166_, i_169_,
							i_167_,
							is_172_[i_174_],
							is_173_[i_174_]);
					    i_174_++;
					} else
					    i_174_ += 3;
				    }
				} else if (i_170_ == 3) {
				    method16106(i_168_, i_166_, i_169_, i_167_,
						0, 0);
				    method16106(i_168_, i_166_, i_169_, i_167_,
						(class161_sub1.anInt1761
						 * 435863595),
						0);
				    method16106(i_168_, i_166_, i_169_, i_167_,
						0,
						(class161_sub1.anInt1761
						 * 435863595));
				} else if (i_170_ == 2) {
				    method16106(i_168_, i_166_, i_169_, i_167_,
						(class161_sub1.anInt1761
						 * 435863595),
						0);
				    method16106(i_168_, i_166_, i_169_, i_167_,
						(class161_sub1.anInt1761
						 * 435863595),
						(class161_sub1.anInt1761
						 * 435863595));
				    method16106(i_168_, i_166_, i_169_, i_167_,
						0, 0);
				} else if (i_170_ == 5) {
				    method16106(i_168_, i_166_, i_169_, i_167_,
						(class161_sub1.anInt1761
						 * 435863595),
						(class161_sub1.anInt1761
						 * 435863595));
				    method16106(i_168_, i_166_, i_169_, i_167_,
						0,
						(class161_sub1.anInt1761
						 * 435863595));
				    method16106(i_168_, i_166_, i_169_, i_167_,
						(class161_sub1.anInt1761
						 * 435863595),
						0);
				} else if (i_170_ == 4) {
				    method16106(i_168_, i_166_, i_169_, i_167_,
						0,
						(class161_sub1.anInt1761
						 * 435863595));
				    method16106(i_168_, i_166_, i_169_, i_167_,
						0, 0);
				    method16106(i_168_, i_166_, i_169_, i_167_,
						(class161_sub1.anInt1761
						 * 435863595),
						(class161_sub1.anInt1761
						 * 435863595));
				}
			    }
			}
			i_160_++;
			i_168_++;
		    }
		} else
		    i_160_ += anInt10462 - anInt10461;
		i_166_++;
	    }
	    anInterface16_10467
		= (aClass182_Sub3_10463.method15441
		   (5123, aClass525_Sub38_10474.buffer,
		    aClass525_Sub38_10474.pos * -1133521593, false));
	    anInterface15_10472
		= aClass182_Sub3_10463.method15533(16,
						   (aClass525_Sub38_Sub1_10475
						    .buffer),
						   (aClass525_Sub38_Sub1_10475
						    .pos) * -1133521593,
						   false);
	    aClass137_10469 = new Class137(anInterface15_10472, 5126, 3, 0);
	    aClass137_10465 = new Class137(anInterface15_10472, 5121, 4, 12);
	} else {
	    anInterface16_10467 = null;
	    anInterface15_10472 = null;
	    aClass137_10469 = null;
	    aClass137_10465 = null;
	}
	aClass525_Sub38_Sub1_10475 = null;
	aClass525_Sub38_10474 = null;
	aClass10_10458 = null;
	aFloatArrayArray10466 = null;
	aFloatArrayArray10473 = null;
	aFloatArrayArray10476 = null;
    }
    
    void method16115(int i, int i_175_, int i_176_, boolean[][] bools) {
	if (anInterface16_10467 != null && anInt10461 <= i + i_176_
	    && anInt10462 >= i - i_176_ && anInt10471 <= i_175_ + i_176_
	    && anInt10464 >= i_175_ - i_176_) {
	    for (int i_177_ = anInt10471; i_177_ <= anInt10464; i_177_++) {
		for (int i_178_ = anInt10461; i_178_ <= anInt10462; i_178_++) {
		    int i_179_ = i_178_ - i;
		    int i_180_ = i_177_ - i_175_;
		    if (i_179_ > -i_176_ && i_179_ < i_176_ && i_180_ > -i_176_
			&& i_180_ < i_176_
			&& bools[i_179_ + i_176_][i_180_ + i_176_]) {
			aClass182_Sub3_10463.method15400
			    ((int) (aClass525_Sub21_10460
					.method16306(-1438555970)
				    * 255.0F) << 24);
			aClass182_Sub3_10463.method15384(aClass137_10469, null,
							 aClass137_10465,
							 null);
			aClass182_Sub3_10463.method15427(anInterface16_10467,
							 4, 0, anInt10470);
			return;
		    }
		}
	    }
	}
    }
    
    void method16116(int i, int i_181_, int i_182_, boolean[][] bools) {
	if (anInterface16_10467 != null && anInt10461 <= i + i_182_
	    && anInt10462 >= i - i_182_ && anInt10471 <= i_181_ + i_182_
	    && anInt10464 >= i_181_ - i_182_) {
	    for (int i_183_ = anInt10471; i_183_ <= anInt10464; i_183_++) {
		for (int i_184_ = anInt10461; i_184_ <= anInt10462; i_184_++) {
		    int i_185_ = i_184_ - i;
		    int i_186_ = i_183_ - i_181_;
		    if (i_185_ > -i_182_ && i_185_ < i_182_ && i_186_ > -i_182_
			&& i_186_ < i_182_
			&& bools[i_185_ + i_182_][i_186_ + i_182_]) {
			aClass182_Sub3_10463.method15400
			    ((int) (aClass525_Sub21_10460
					.method16306(-63404184)
				    * 255.0F) << 24);
			aClass182_Sub3_10463.method15384(aClass137_10469, null,
							 aClass137_10465,
							 null);
			aClass182_Sub3_10463.method15427(anInterface16_10467,
							 4, 0, anInt10470);
			return;
		    }
		}
	    }
	}
    }
}
