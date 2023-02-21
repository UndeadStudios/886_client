/* Class674 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class674 implements Interface12
{
    int anInt8592;
    static final int anInt8593 = 8224;
    int anInt8594;
    short[] aShortArray8595;
    public int anInt8596 = 1112493833;
    short[] aShortArray8597;
    short[] aShortArray8598;
    byte aByte8599;
    short[] aShortArray8600;
    byte[] aByteArray8601;
    byte[] aByteArray8602;
    int anInt8603 = 1086157952;
    int anInt8604 = -1083524480;
    int anInt8605 = 0;
    int anInt8606 = 0;
    int anInt8607 = 0;
    public boolean aBool8608 = false;
    Class669 aClass669_8609;
    int anInt8610;
    
    public final Class179 method11094(Class182 class182, int i, int i_0_,
				      int i_1_, int i_2_, int i_3_,
				      Class689 class689, byte i_4_, int i_5_) {
	if (aByte8599 != 3)
	    return method11098(class182, i, false, null, null, 0, 0, 0, i_0_,
			       0, 0, 0, class689, i_4_, 2087131850);
	return method11098(class182, i, true, null, null, 0, 0, 0, i_0_, i_1_,
			   i_2_, i_3_, class689, i_4_, -193160885);
    }
    
    public void method66(RSBuffer class525_sub38, int i) {
	for (;;) {
	    int i_6_ = class525_sub38.readUnsignedByte(2022739628);
	    if (i_6_ == 0)
		break;
	    method11095(class525_sub38, i_6_, 1742711448);
	}
    }
    
    void method11095(RSBuffer class525_sub38, int i, int i_7_) {
	do {
	    if (1 == i)
		anInt8592
		    = class525_sub38.readBigSmart(-2043778683) * 1919913699;
	    else if (i == 2)
		anInt8596
		    = class525_sub38.readBigSmart(-2043778683) * -1112493833;
	    else if (4 == i)
		anInt8603 = class525_sub38.readUnsignedShort((byte) 35) * -427722007;
	    else if (5 == i)
		anInt8604 = class525_sub38.readUnsignedShort((byte) 104) * 226415989;
	    else if (6 == i)
		anInt8605
		    = class525_sub38.readUnsignedShort((byte) 78) * -1711854627;
	    else if (7 == i)
		anInt8606
		    = class525_sub38.readUnsignedByte(1166602234) * -727328281;
	    else if (8 == i)
		anInt8607
		    = class525_sub38.readUnsignedByte(1352842065) * -702821037;
	    else if (10 == i)
		aBool8608 = true;
	    else if (9 == i) {
		aByte8599 = (byte) 3;
		anInt8610 = -217898336;
	    } else if (15 == i) {
		aByte8599 = (byte) 3;
		anInt8610 = class525_sub38.readUnsignedShort((byte) 100) * 60032021;
	    } else if (16 == i) {
		aByte8599 = (byte) 3;
		anInt8610 = class525_sub38.readInt(1561777141) * 60032021;
	    } else if (i == 40) {
		int i_8_ = class525_sub38.readUnsignedByte(1037339858);
		aShortArray8597 = new short[i_8_];
		aShortArray8598 = new short[i_8_];
		for (int i_9_ = 0; i_9_ < i_8_; i_9_++) {
		    aShortArray8597[i_9_]
			= (short) class525_sub38.readUnsignedShort((byte) 82);
		    aShortArray8598[i_9_]
			= (short) class525_sub38.readUnsignedShort((byte) 102);
		}
	    } else if (41 == i) {
		int i_10_ = class525_sub38.readUnsignedByte(1579745754);
		aShortArray8595 = new short[i_10_];
		aShortArray8600 = new short[i_10_];
		for (int i_11_ = 0; i_11_ < i_10_; i_11_++) {
		    aShortArray8595[i_11_]
			= (short) class525_sub38.readUnsignedShort((byte) 85);
		    aShortArray8600[i_11_]
			= (short) class525_sub38.readUnsignedShort((byte) 18);
		}
	    } else if (i == 44) {
		int i_12_ = class525_sub38.readUnsignedShort((byte) 81);
		int i_13_ = 0;
		for (int i_14_ = i_12_; i_14_ > 0; i_14_ >>= 1)
		    i_13_++;
		aByteArray8601 = new byte[i_13_];
		byte i_15_ = 0;
		for (int i_16_ = 0; i_16_ < i_13_; i_16_++) {
		    if ((i_12_ & 1 << i_16_) > 0) {
			aByteArray8601[i_16_] = i_15_;
			i_15_++;
		    } else
			aByteArray8601[i_16_] = (byte) -1;
		}
	    } else if (45 == i) {
		int i_17_ = class525_sub38.readUnsignedShort((byte) 103);
		int i_18_ = 0;
		for (int i_19_ = i_17_; i_19_ > 0; i_19_ >>= 1)
		    i_18_++;
		aByteArray8602 = new byte[i_18_];
		byte i_20_ = 0;
		for (int i_21_ = 0; i_21_ < i_18_; i_21_++) {
		    if ((i_17_ & 1 << i_21_) > 0) {
			aByteArray8602[i_21_] = i_20_;
			i_20_++;
		    } else
			aByteArray8602[i_21_] = (byte) -1;
		}
	    } else if (46 == i)
		break;
	} while (false);
    }
    
    public final boolean method11096() {
	if (-526637365 * anInt8592 == -1)
	    return true;
	return aClass669_8609.aClass458_8587.method7478(anInt8592 * -526637365,
							0, (short) 9191);
    }
    
    final Class179 method11097
	(Class182 class182, int i, boolean bool, Class161 class161,
	 Class161 class161_22_, int i_23_, int i_24_, int i_25_, int i_26_,
	 int i_27_, int i_28_, int i_29_, Class689 class689, byte i_30_) {
	int i_31_ = i;
	bool = bool & aByte8599 != 0;
	if (null != class689)
	    i_31_ |= class689.method14033(47476357);
	if (128 != -1693347107 * anInt8604)
	    i_31_ |= 0x2;
	if (anInt8603 * -1746600615 != 128 || 0 != -672693131 * anInt8605
	    || i_26_ != 0)
	    i_31_ |= 0x5;
	if (bool)
	    i_31_ |= 0x7;
	Class179 class179;
	synchronized (aClass669_8609.aClass200_8586) {
	    class179 = ((Class179)
			(aClass669_8609.aClass200_8586.method3785
			 ((long) (171907995 * anInt8594
				  | -2117565327 * class182.anInt1942 << 29))));
	}
	if (null == class179
	    || class182.method3321(class179.method2928(), i_31_) != 0) {
	    if (class179 != null)
		i_31_ = class182.method3229(i_31_, class179.method2928());
	    int i_32_ = i_31_;
	    if (null != aShortArray8597)
		i_32_ |= 0x4000;
	    if (aShortArray8595 != null)
		i_32_ |= 0x8000;
	    Class186 class186
		= Class186.method3644(aClass669_8609.aClass458_8587,
				      anInt8592 * -526637365, 0);
	    if (null == class186)
		return null;
	    if (class186.anInt2086 < 13)
		class186.method3651(2);
	    class179
		= class182.method3556(class186, i_32_,
				      aClass669_8609.anInt8585 * 1688026641,
				      anInt8606 * 1722821079 + 64,
				      anInt8607 * 782630619 + 850);
	    if (aShortArray8597 != null) {
		for (int i_33_ = 0; i_33_ < aShortArray8597.length; i_33_++)
		    class179.method2971(aShortArray8597[i_33_],
					aShortArray8598[i_33_]);
	    }
	    if (null != aShortArray8595) {
		for (int i_34_ = 0; i_34_ < aShortArray8595.length; i_34_++)
		    class179.method2973(aShortArray8595[i_34_],
					aShortArray8600[i_34_]);
	    }
	    class179.method3010(i_31_);
	    synchronized (aClass669_8609.aClass200_8586) {
		aClass669_8609.aClass200_8586.method3788
		    (class179,
		     (long) (171907995 * anInt8594
			     | class182.anInt1942 * -2117565327 << 29));
	    }
	}
	Class179 class179_35_ = class179.method2926(i_30_, i_31_, true);
	if (class689 != null)
	    class689.method14034(class179_35_, 0, 1744087066);
	if (anInt8603 * -1746600615 != 128 || 128 != anInt8604 * -1693347107)
	    class179_35_.method2936(-1746600615 * anInt8603,
				    -1693347107 * anInt8604,
				    -1746600615 * anInt8603);
	if (anInt8605 * -672693131 != 0) {
	    if (90 == -672693131 * anInt8605)
		i_26_ += 4096;
	    if (180 == anInt8605 * -672693131)
		i_26_ += 8192;
	    if (-672693131 * anInt8605 == 270)
		i_26_ += 12288;
	}
	if (0 != i_26_) {
	    i_26_ &= 0x3fff;
	    class179_35_.method2930(i_26_);
	}
	if (bool) {
	    if (null != class161)
		class179_35_.method2937(aByte8599, -1774343363 * anInt8610,
					class161, class161_22_, i_23_, i_24_,
					i_25_);
	    else {
		if (i_27_ != 0)
		    class179_35_.method2932(i_27_);
		if (0 != i_28_)
		    class179_35_.method2933(i_28_);
		if (i_29_ != 0)
		    class179_35_.method2934(0, i_29_, 0);
	    }
	}
	class179_35_.method3010(i);
	return class179_35_;
    }
    
    Class674(int i, Class669 class669) {
	aByte8599 = (byte) 0;
	anInt8610 = -60032021;
	anInt8594 = i * -935669101;
	aClass669_8609 = class669;
    }
    
    final Class179 method11098(Class182 class182, int i, boolean bool,
			       Class161 class161, Class161 class161_36_,
			       int i_37_, int i_38_, int i_39_, int i_40_,
			       int i_41_, int i_42_, int i_43_,
			       Class689 class689, byte i_44_, int i_45_) {
	int i_46_ = i;
	bool = bool & aByte8599 != 0;
	if (null != class689)
	    i_46_ |= class689.method14033(34864339);
	if (128 != -1693347107 * anInt8604)
	    i_46_ |= 0x2;
	if (anInt8603 * -1746600615 != 128 || 0 != -672693131 * anInt8605
	    || i_40_ != 0)
	    i_46_ |= 0x5;
	if (bool)
	    i_46_ |= 0x7;
	Class179 class179;
	synchronized (aClass669_8609.aClass200_8586) {
	    class179 = ((Class179)
			(aClass669_8609.aClass200_8586.method3785
			 ((long) (171907995 * anInt8594
				  | -2117565327 * class182.anInt1942 << 29))));
	}
	if (null == class179
	    || class182.method3321(class179.method2928(), i_46_) != 0) {
	    if (class179 != null)
		i_46_ = class182.method3229(i_46_, class179.method2928());
	    int i_47_ = i_46_;
	    if (null != aShortArray8597)
		i_47_ |= 0x4000;
	    if (aShortArray8595 != null)
		i_47_ |= 0x8000;
	    Class186 class186
		= Class186.method3644(aClass669_8609.aClass458_8587,
				      anInt8592 * -526637365, 0);
	    if (null == class186)
		return null;
	    if (class186.anInt2086 < 13)
		class186.method3651(2);
	    class179
		= class182.method3556(class186, i_47_,
				      aClass669_8609.anInt8585 * 1688026641,
				      anInt8606 * 1722821079 + 64,
				      anInt8607 * 782630619 + 850);
	    if (aShortArray8597 != null) {
		for (int i_48_ = 0; i_48_ < aShortArray8597.length; i_48_++)
		    class179.method2971(aShortArray8597[i_48_],
					aShortArray8598[i_48_]);
	    }
	    if (null != aShortArray8595) {
		for (int i_49_ = 0; i_49_ < aShortArray8595.length; i_49_++)
		    class179.method2973(aShortArray8595[i_49_],
					aShortArray8600[i_49_]);
	    }
	    class179.method3010(i_46_);
	    synchronized (aClass669_8609.aClass200_8586) {
		aClass669_8609.aClass200_8586.method3788
		    (class179,
		     (long) (171907995 * anInt8594
			     | class182.anInt1942 * -2117565327 << 29));
	    }
	}
	Class179 class179_50_ = class179.method2926(i_44_, i_46_, true);
	if (class689 != null)
	    class689.method14034(class179_50_, 0, 1476351127);
	if (anInt8603 * -1746600615 != 128 || 128 != anInt8604 * -1693347107)
	    class179_50_.method2936(-1746600615 * anInt8603,
				    -1693347107 * anInt8604,
				    -1746600615 * anInt8603);
	if (anInt8605 * -672693131 != 0) {
	    if (90 == -672693131 * anInt8605)
		i_40_ += 4096;
	    if (180 == anInt8605 * -672693131)
		i_40_ += 8192;
	    if (-672693131 * anInt8605 == 270)
		i_40_ += 12288;
	}
	if (0 != i_40_) {
	    i_40_ &= 0x3fff;
	    class179_50_.method2930(i_40_);
	}
	if (bool) {
	    if (null != class161)
		class179_50_.method2937(aByte8599, -1774343363 * anInt8610,
					class161, class161_36_, i_37_, i_38_,
					i_39_);
	    else {
		if (i_41_ != 0)
		    class179_50_.method2932(i_41_);
		if (0 != i_42_)
		    class179_50_.method2933(i_42_);
		if (i_43_ != 0)
		    class179_50_.method2934(0, i_43_, 0);
	    }
	}
	class179_50_.method3010(i);
	return class179_50_;
    }
    
    public final Class179 method11099
	(Class182 class182, int i, int i_51_, Class161 class161,
	 Class161 class161_52_, int i_53_, int i_54_, int i_55_,
	 Class689 class689, byte i_56_, int i_57_) {
	return method11098(class182, i, true, class161, class161_52_, i_53_,
			   i_54_, i_55_, i_51_, 0, 0, 0, class689, i_56_,
			   1789596365);
    }
    
    public final Class179 method11100
	(Class182 class182, int i, Class689 class689, byte i_58_, int i_59_) {
	return method11098(class182, i, false, null, null, 0, 0, 0, 0, 0, 0, 0,
			   class689, i_58_, 676291977);
    }
    
    public void method68(RSBuffer class525_sub38) {
	for (;;) {
	    int i = class525_sub38.readUnsignedByte(373051121);
	    if (i == 0)
		break;
	    method11095(class525_sub38, i, -580531601);
	}
    }
    
    public void method69() {
	/* empty */
    }
    
    public void method70() {
	/* empty */
    }
    
    void method11101(RSBuffer class525_sub38, int i) {
	do {
	    if (1 == i)
		anInt8592
		    = class525_sub38.readBigSmart(-2043778683) * 1919913699;
	    else if (i == 2)
		anInt8596
		    = class525_sub38.readBigSmart(-2043778683) * -1112493833;
	    else if (4 == i)
		anInt8603 = class525_sub38.readUnsignedShort((byte) 3) * -427722007;
	    else if (5 == i)
		anInt8604 = class525_sub38.readUnsignedShort((byte) 69) * 226415989;
	    else if (6 == i)
		anInt8605
		    = class525_sub38.readUnsignedShort((byte) 23) * -1711854627;
	    else if (7 == i)
		anInt8606
		    = class525_sub38.readUnsignedByte(1937319960) * -727328281;
	    else if (8 == i)
		anInt8607 = class525_sub38.readUnsignedByte(498810121) * -702821037;
	    else if (10 == i)
		aBool8608 = true;
	    else if (9 == i) {
		aByte8599 = (byte) 3;
		anInt8610 = -217898336;
	    } else if (15 == i) {
		aByte8599 = (byte) 3;
		anInt8610 = class525_sub38.readUnsignedShort((byte) 66) * 60032021;
	    } else if (16 == i) {
		aByte8599 = (byte) 3;
		anInt8610 = class525_sub38.readInt(1887822625) * 60032021;
	    } else if (i == 40) {
		int i_60_ = class525_sub38.readUnsignedByte(942935176);
		aShortArray8597 = new short[i_60_];
		aShortArray8598 = new short[i_60_];
		for (int i_61_ = 0; i_61_ < i_60_; i_61_++) {
		    aShortArray8597[i_61_]
			= (short) class525_sub38.readUnsignedShort((byte) 86);
		    aShortArray8598[i_61_]
			= (short) class525_sub38.readUnsignedShort((byte) 68);
		}
	    } else if (41 == i) {
		int i_62_ = class525_sub38.readUnsignedByte(1590281600);
		aShortArray8595 = new short[i_62_];
		aShortArray8600 = new short[i_62_];
		for (int i_63_ = 0; i_63_ < i_62_; i_63_++) {
		    aShortArray8595[i_63_]
			= (short) class525_sub38.readUnsignedShort((byte) 33);
		    aShortArray8600[i_63_]
			= (short) class525_sub38.readUnsignedShort((byte) 120);
		}
	    } else if (i == 44) {
		int i_64_ = class525_sub38.readUnsignedShort((byte) 36);
		int i_65_ = 0;
		for (int i_66_ = i_64_; i_66_ > 0; i_66_ >>= 1)
		    i_65_++;
		aByteArray8601 = new byte[i_65_];
		byte i_67_ = 0;
		for (int i_68_ = 0; i_68_ < i_65_; i_68_++) {
		    if ((i_64_ & 1 << i_68_) > 0) {
			aByteArray8601[i_68_] = i_67_;
			i_67_++;
		    } else
			aByteArray8601[i_68_] = (byte) -1;
		}
	    } else if (45 == i) {
		int i_69_ = class525_sub38.readUnsignedShort((byte) 35);
		int i_70_ = 0;
		for (int i_71_ = i_69_; i_71_ > 0; i_71_ >>= 1)
		    i_70_++;
		aByteArray8602 = new byte[i_70_];
		byte i_72_ = 0;
		for (int i_73_ = 0; i_73_ < i_70_; i_73_++) {
		    if ((i_69_ & 1 << i_73_) > 0) {
			aByteArray8602[i_73_] = i_72_;
			i_72_++;
		    } else
			aByteArray8602[i_73_] = (byte) -1;
		}
	    } else if (46 == i)
		break;
	} while (false);
    }
    
    void method11102(RSBuffer class525_sub38, int i) {
	do {
	    if (1 == i)
		anInt8592
		    = class525_sub38.readBigSmart(-2043778683) * 1919913699;
	    else if (i == 2)
		anInt8596
		    = class525_sub38.readBigSmart(-2043778683) * -1112493833;
	    else if (4 == i)
		anInt8603 = class525_sub38.readUnsignedShort((byte) 54) * -427722007;
	    else if (5 == i)
		anInt8604 = class525_sub38.readUnsignedShort((byte) 32) * 226415989;
	    else if (6 == i)
		anInt8605
		    = class525_sub38.readUnsignedShort((byte) 127) * -1711854627;
	    else if (7 == i)
		anInt8606
		    = class525_sub38.readUnsignedByte(1028701212) * -727328281;
	    else if (8 == i)
		anInt8607 = class525_sub38.readUnsignedByte(48447385) * -702821037;
	    else if (10 == i)
		aBool8608 = true;
	    else if (9 == i) {
		aByte8599 = (byte) 3;
		anInt8610 = -217898336;
	    } else if (15 == i) {
		aByte8599 = (byte) 3;
		anInt8610 = class525_sub38.readUnsignedShort((byte) 100) * 60032021;
	    } else if (16 == i) {
		aByte8599 = (byte) 3;
		anInt8610 = class525_sub38.readInt(992827343) * 60032021;
	    } else if (i == 40) {
		int i_74_ = class525_sub38.readUnsignedByte(1518227115);
		aShortArray8597 = new short[i_74_];
		aShortArray8598 = new short[i_74_];
		for (int i_75_ = 0; i_75_ < i_74_; i_75_++) {
		    aShortArray8597[i_75_]
			= (short) class525_sub38.readUnsignedShort((byte) 73);
		    aShortArray8598[i_75_]
			= (short) class525_sub38.readUnsignedShort((byte) 58);
		}
	    } else if (41 == i) {
		int i_76_ = class525_sub38.readUnsignedByte(1968339288);
		aShortArray8595 = new short[i_76_];
		aShortArray8600 = new short[i_76_];
		for (int i_77_ = 0; i_77_ < i_76_; i_77_++) {
		    aShortArray8595[i_77_]
			= (short) class525_sub38.readUnsignedShort((byte) 78);
		    aShortArray8600[i_77_]
			= (short) class525_sub38.readUnsignedShort((byte) 10);
		}
	    } else if (i == 44) {
		int i_78_ = class525_sub38.readUnsignedShort((byte) 19);
		int i_79_ = 0;
		for (int i_80_ = i_78_; i_80_ > 0; i_80_ >>= 1)
		    i_79_++;
		aByteArray8601 = new byte[i_79_];
		byte i_81_ = 0;
		for (int i_82_ = 0; i_82_ < i_79_; i_82_++) {
		    if ((i_78_ & 1 << i_82_) > 0) {
			aByteArray8601[i_82_] = i_81_;
			i_81_++;
		    } else
			aByteArray8601[i_82_] = (byte) -1;
		}
	    } else if (45 == i) {
		int i_83_ = class525_sub38.readUnsignedShort((byte) 84);
		int i_84_ = 0;
		for (int i_85_ = i_83_; i_85_ > 0; i_85_ >>= 1)
		    i_84_++;
		aByteArray8602 = new byte[i_84_];
		byte i_86_ = 0;
		for (int i_87_ = 0; i_87_ < i_84_; i_87_++) {
		    if ((i_83_ & 1 << i_87_) > 0) {
			aByteArray8602[i_87_] = i_86_;
			i_86_++;
		    } else
			aByteArray8602[i_87_] = (byte) -1;
		}
	    } else if (46 == i)
		break;
	} while (false);
    }
    
    void method11103(RSBuffer class525_sub38, int i) {
	do {
	    if (1 == i)
		anInt8592
		    = class525_sub38.readBigSmart(-2043778683) * 1919913699;
	    else if (i == 2)
		anInt8596
		    = class525_sub38.readBigSmart(-2043778683) * -1112493833;
	    else if (4 == i)
		anInt8603 = class525_sub38.readUnsignedShort((byte) 59) * -427722007;
	    else if (5 == i)
		anInt8604 = class525_sub38.readUnsignedShort((byte) 14) * 226415989;
	    else if (6 == i)
		anInt8605
		    = class525_sub38.readUnsignedShort((byte) 118) * -1711854627;
	    else if (7 == i)
		anInt8606 = class525_sub38.readUnsignedByte(172054863) * -727328281;
	    else if (8 == i)
		anInt8607 = class525_sub38.readUnsignedByte(619729184) * -702821037;
	    else if (10 == i)
		aBool8608 = true;
	    else if (9 == i) {
		aByte8599 = (byte) 3;
		anInt8610 = -217898336;
	    } else if (15 == i) {
		aByte8599 = (byte) 3;
		anInt8610 = class525_sub38.readUnsignedShort((byte) 44) * 60032021;
	    } else if (16 == i) {
		aByte8599 = (byte) 3;
		anInt8610 = class525_sub38.readInt(1572652037) * 60032021;
	    } else if (i == 40) {
		int i_88_ = class525_sub38.readUnsignedByte(489988033);
		aShortArray8597 = new short[i_88_];
		aShortArray8598 = new short[i_88_];
		for (int i_89_ = 0; i_89_ < i_88_; i_89_++) {
		    aShortArray8597[i_89_]
			= (short) class525_sub38.readUnsignedShort((byte) 86);
		    aShortArray8598[i_89_]
			= (short) class525_sub38.readUnsignedShort((byte) 68);
		}
	    } else if (41 == i) {
		int i_90_ = class525_sub38.readUnsignedByte(803725004);
		aShortArray8595 = new short[i_90_];
		aShortArray8600 = new short[i_90_];
		for (int i_91_ = 0; i_91_ < i_90_; i_91_++) {
		    aShortArray8595[i_91_]
			= (short) class525_sub38.readUnsignedShort((byte) 12);
		    aShortArray8600[i_91_]
			= (short) class525_sub38.readUnsignedShort((byte) 36);
		}
	    } else if (i == 44) {
		int i_92_ = class525_sub38.readUnsignedShort((byte) 88);
		int i_93_ = 0;
		for (int i_94_ = i_92_; i_94_ > 0; i_94_ >>= 1)
		    i_93_++;
		aByteArray8601 = new byte[i_93_];
		byte i_95_ = 0;
		for (int i_96_ = 0; i_96_ < i_93_; i_96_++) {
		    if ((i_92_ & 1 << i_96_) > 0) {
			aByteArray8601[i_96_] = i_95_;
			i_95_++;
		    } else
			aByteArray8601[i_96_] = (byte) -1;
		}
	    } else if (45 == i) {
		int i_97_ = class525_sub38.readUnsignedShort((byte) 68);
		int i_98_ = 0;
		for (int i_99_ = i_97_; i_99_ > 0; i_99_ >>= 1)
		    i_98_++;
		aByteArray8602 = new byte[i_98_];
		byte i_100_ = 0;
		for (int i_101_ = 0; i_101_ < i_98_; i_101_++) {
		    if ((i_97_ & 1 << i_101_) > 0) {
			aByteArray8602[i_101_] = i_100_;
			i_100_++;
		    } else
			aByteArray8602[i_101_] = (byte) -1;
		}
	    } else if (46 == i)
		break;
	} while (false);
    }
    
    void method11104(RSBuffer class525_sub38, int i) {
	do {
	    if (1 == i)
		anInt8592
		    = class525_sub38.readBigSmart(-2043778683) * 1919913699;
	    else if (i == 2)
		anInt8596
		    = class525_sub38.readBigSmart(-2043778683) * -1112493833;
	    else if (4 == i)
		anInt8603 = class525_sub38.readUnsignedShort((byte) 62) * -427722007;
	    else if (5 == i)
		anInt8604 = class525_sub38.readUnsignedShort((byte) 83) * 226415989;
	    else if (6 == i)
		anInt8605
		    = class525_sub38.readUnsignedShort((byte) 100) * -1711854627;
	    else if (7 == i)
		anInt8606
		    = class525_sub38.readUnsignedByte(1842285844) * -727328281;
	    else if (8 == i)
		anInt8607 = class525_sub38.readUnsignedByte(-7836057) * -702821037;
	    else if (10 == i)
		aBool8608 = true;
	    else if (9 == i) {
		aByte8599 = (byte) 3;
		anInt8610 = -217898336;
	    } else if (15 == i) {
		aByte8599 = (byte) 3;
		anInt8610 = class525_sub38.readUnsignedShort((byte) 98) * 60032021;
	    } else if (16 == i) {
		aByte8599 = (byte) 3;
		anInt8610 = class525_sub38.readInt(1454991878) * 60032021;
	    } else if (i == 40) {
		int i_102_ = class525_sub38.readUnsignedByte(1567679717);
		aShortArray8597 = new short[i_102_];
		aShortArray8598 = new short[i_102_];
		for (int i_103_ = 0; i_103_ < i_102_; i_103_++) {
		    aShortArray8597[i_103_]
			= (short) class525_sub38.readUnsignedShort((byte) 119);
		    aShortArray8598[i_103_]
			= (short) class525_sub38.readUnsignedShort((byte) 2);
		}
	    } else if (41 == i) {
		int i_104_ = class525_sub38.readUnsignedByte(1544078016);
		aShortArray8595 = new short[i_104_];
		aShortArray8600 = new short[i_104_];
		for (int i_105_ = 0; i_105_ < i_104_; i_105_++) {
		    aShortArray8595[i_105_]
			= (short) class525_sub38.readUnsignedShort((byte) 9);
		    aShortArray8600[i_105_]
			= (short) class525_sub38.readUnsignedShort((byte) 62);
		}
	    } else if (i == 44) {
		int i_106_ = class525_sub38.readUnsignedShort((byte) 30);
		int i_107_ = 0;
		for (int i_108_ = i_106_; i_108_ > 0; i_108_ >>= 1)
		    i_107_++;
		aByteArray8601 = new byte[i_107_];
		byte i_109_ = 0;
		for (int i_110_ = 0; i_110_ < i_107_; i_110_++) {
		    if ((i_106_ & 1 << i_110_) > 0) {
			aByteArray8601[i_110_] = i_109_;
			i_109_++;
		    } else
			aByteArray8601[i_110_] = (byte) -1;
		}
	    } else if (45 == i) {
		int i_111_ = class525_sub38.readUnsignedShort((byte) 56);
		int i_112_ = 0;
		for (int i_113_ = i_111_; i_113_ > 0; i_113_ >>= 1)
		    i_112_++;
		aByteArray8602 = new byte[i_112_];
		byte i_114_ = 0;
		for (int i_115_ = 0; i_115_ < i_112_; i_115_++) {
		    if ((i_111_ & 1 << i_115_) > 0) {
			aByteArray8602[i_115_] = i_114_;
			i_114_++;
		    } else
			aByteArray8602[i_115_] = (byte) -1;
		}
	    } else if (46 == i)
		break;
	} while (false);
    }
    
    void method11105(RSBuffer class525_sub38, int i) {
	do {
	    if (1 == i)
		anInt8592
		    = class525_sub38.readBigSmart(-2043778683) * 1919913699;
	    else if (i == 2)
		anInt8596
		    = class525_sub38.readBigSmart(-2043778683) * -1112493833;
	    else if (4 == i)
		anInt8603 = class525_sub38.readUnsignedShort((byte) 82) * -427722007;
	    else if (5 == i)
		anInt8604 = class525_sub38.readUnsignedShort((byte) 112) * 226415989;
	    else if (6 == i)
		anInt8605
		    = class525_sub38.readUnsignedShort((byte) 43) * -1711854627;
	    else if (7 == i)
		anInt8606
		    = class525_sub38.readUnsignedByte(2141979067) * -727328281;
	    else if (8 == i)
		anInt8607 = class525_sub38.readUnsignedByte(638125224) * -702821037;
	    else if (10 == i)
		aBool8608 = true;
	    else if (9 == i) {
		aByte8599 = (byte) 3;
		anInt8610 = -217898336;
	    } else if (15 == i) {
		aByte8599 = (byte) 3;
		anInt8610 = class525_sub38.readUnsignedShort((byte) 52) * 60032021;
	    } else if (16 == i) {
		aByte8599 = (byte) 3;
		anInt8610 = class525_sub38.readInt(1318841942) * 60032021;
	    } else if (i == 40) {
		int i_116_ = class525_sub38.readUnsignedByte(464405494);
		aShortArray8597 = new short[i_116_];
		aShortArray8598 = new short[i_116_];
		for (int i_117_ = 0; i_117_ < i_116_; i_117_++) {
		    aShortArray8597[i_117_]
			= (short) class525_sub38.readUnsignedShort((byte) 127);
		    aShortArray8598[i_117_]
			= (short) class525_sub38.readUnsignedShort((byte) 92);
		}
	    } else if (41 == i) {
		int i_118_ = class525_sub38.readUnsignedByte(1515147925);
		aShortArray8595 = new short[i_118_];
		aShortArray8600 = new short[i_118_];
		for (int i_119_ = 0; i_119_ < i_118_; i_119_++) {
		    aShortArray8595[i_119_]
			= (short) class525_sub38.readUnsignedShort((byte) 10);
		    aShortArray8600[i_119_]
			= (short) class525_sub38.readUnsignedShort((byte) 99);
		}
	    } else if (i == 44) {
		int i_120_ = class525_sub38.readUnsignedShort((byte) 46);
		int i_121_ = 0;
		for (int i_122_ = i_120_; i_122_ > 0; i_122_ >>= 1)
		    i_121_++;
		aByteArray8601 = new byte[i_121_];
		byte i_123_ = 0;
		for (int i_124_ = 0; i_124_ < i_121_; i_124_++) {
		    if ((i_120_ & 1 << i_124_) > 0) {
			aByteArray8601[i_124_] = i_123_;
			i_123_++;
		    } else
			aByteArray8601[i_124_] = (byte) -1;
		}
	    } else if (45 == i) {
		int i_125_ = class525_sub38.readUnsignedShort((byte) 56);
		int i_126_ = 0;
		for (int i_127_ = i_125_; i_127_ > 0; i_127_ >>= 1)
		    i_126_++;
		aByteArray8602 = new byte[i_126_];
		byte i_128_ = 0;
		for (int i_129_ = 0; i_129_ < i_126_; i_129_++) {
		    if ((i_125_ & 1 << i_129_) > 0) {
			aByteArray8602[i_129_] = i_128_;
			i_128_++;
		    } else
			aByteArray8602[i_129_] = (byte) -1;
		}
	    } else if (46 == i)
		break;
	} while (false);
    }
    
    public final Class179 method11106(Class182 class182, int i,
				      Class689 class689, byte i_130_) {
	return method11098(class182, i, false, null, null, 0, 0, 0, 0, 0, 0, 0,
			   class689, i_130_, -859814589);
    }
    
    public final Class179 method11107(Class182 class182, int i, int i_131_,
				      int i_132_, int i_133_, int i_134_,
				      Class689 class689, byte i_135_) {
	if (aByte8599 != 3)
	    return method11098(class182, i, false, null, null, 0, 0, 0, i_131_,
			       0, 0, 0, class689, i_135_, -1355980494);
	return method11098(class182, i, true, null, null, 0, 0, 0, i_131_,
			   i_132_, i_133_, i_134_, class689, i_135_,
			   1736778393);
    }
    
    public final boolean method11108(int i) {
	if (-526637365 * anInt8592 == -1)
	    return true;
	return aClass669_8609.aClass458_8587.method7478(anInt8592 * -526637365,
							0, (short) 19065);
    }
    
    public final Class179 method11109(Class182 class182, int i, int i_136_,
				      int i_137_, int i_138_, int i_139_,
				      Class689 class689, byte i_140_) {
	if (aByte8599 != 3)
	    return method11098(class182, i, false, null, null, 0, 0, 0, i_136_,
			       0, 0, 0, class689, i_140_, -414625402);
	return method11098(class182, i, true, null, null, 0, 0, 0, i_136_,
			   i_137_, i_138_, i_139_, class689, i_140_,
			   -1712646524);
    }
    
    public final Class179 method11110
	(Class182 class182, int i, int i_141_, Class161 class161,
	 Class161 class161_142_, int i_143_, int i_144_, int i_145_,
	 Class689 class689, byte i_146_) {
	return method11098(class182, i, true, class161, class161_142_, i_143_,
			   i_144_, i_145_, i_141_, 0, 0, 0, class689, i_146_,
			   -1632755065);
    }
    
    public final Class179 method11111
	(Class182 class182, int i, int i_147_, Class161 class161,
	 Class161 class161_148_, int i_149_, int i_150_, int i_151_,
	 Class689 class689, byte i_152_) {
	return method11098(class182, i, true, class161, class161_148_, i_149_,
			   i_150_, i_151_, i_147_, 0, 0, 0, class689, i_152_,
			   -476757914);
    }
    
    public final Class179 method11112
	(Class182 class182, int i, int i_153_, Class161 class161,
	 Class161 class161_154_, int i_155_, int i_156_, int i_157_,
	 Class689 class689, byte i_158_) {
	return method11098(class182, i, true, class161, class161_154_, i_155_,
			   i_156_, i_157_, i_153_, 0, 0, 0, class689, i_158_,
			   -746279500);
    }
    
    public final Class179 method11113(Class182 class182, int i, int i_159_,
				      int i_160_, int i_161_, int i_162_,
				      Class689 class689, byte i_163_) {
	if (aByte8599 != 3)
	    return method11098(class182, i, false, null, null, 0, 0, 0, i_159_,
			       0, 0, 0, class689, i_163_, 1264414877);
	return method11098(class182, i, true, null, null, 0, 0, 0, i_159_,
			   i_160_, i_161_, i_162_, class689, i_163_,
			   -758758145);
    }
    
    public final boolean method11114() {
	if (-526637365 * anInt8592 == -1)
	    return true;
	return aClass669_8609.aClass458_8587.method7478(anInt8592 * -526637365,
							0, (short) 20352);
    }
    
    public void method67(int i) {
	/* empty */
    }
    
    static final void method11115(Class683 class683, int i) {
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub45_10710,
	     (class683.anIntArray8661
	      [(class683.anInt8662 -= 1552651121) * 501271953]),
	     (byte) -29);
	Class650.method10715(-1758466106);
	client.aBool11084 = false;
    }
    
    static void method11116(Class683 class683, int i) {
	Class44.method1083(-1292578284);
	Class192.method3706(class683, 1145325401);
    }
    
    public static Class157 method11117(byte i) {
	return Class589.aClass157_7807;
    }
    
    static final void method11118(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	class683.anInt8662 -= -1653357974;
	byte[] is = null;
	byte[] is_164_ = null;
	int i_165_;
	for (i_165_ = 0;
	     i_165_ < 10 && (class683.anIntArray8661
			     [class683.anInt8662 * 501271953 + i_165_]) >= 0;
	     i_165_ += 2) {
	    /* empty */
	}
	if (i_165_ > 0) {
	    is = new byte[i_165_ / 2];
	    is_164_ = new byte[i_165_ / 2];
	    for (i_165_ -= 2; i_165_ >= 0; i_165_ -= 2) {
		is[i_165_ / 2]
		    = (byte) (class683.anIntArray8661
			      [501271953 * class683.anInt8662 + i_165_]);
		is_164_[i_165_ / 2]
		    = (byte) (class683.anIntArray8661
			      [i_165_ + class683.anInt8662 * 501271953 + 1]);
	    }
	}
	Class198_Sub8.method15644(class259, is, is_164_, class683,
				  -2144099519);
    }
}
