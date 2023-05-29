/* Class327 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class327 implements Interface12
{
    JS5 aClass458_3564;
    int[] anIntArray3565;
    byte[] aByteArray3566;
    short[] aShortArray3567;
    short[] aShortArray3568;
    short[] aShortArray3569;
    short[] aShortArray3570;
    byte[] aByteArray3571;
    int[] anIntArray3572 = { -1, -1, -1, -1, -1 };
    public static int[] anIntArray3573 = { 0, 1, 2, 3, 4, 5, 6, 14 };
    public static int[] anIntArray3574 = { 7, 8, 9, 10, 11, 12, 13, 15 };
    public static client aclient3575;
    
    public void method67(int i) {
	/* empty */
    }
    
    public void method66(RSBuffer class525_sub38, int i) {
	for (;;) {
	    int i_0_ = class525_sub38.readUnsignedByte(1993766152);
	    if (0 == i_0_)
		break;
	    method5759(class525_sub38, i_0_, -1582820556);
	}
    }
    
    Class327(int i, JS5 class458) {
	aClass458_3564 = class458;
    }
    
    public boolean method5748() {
	boolean bool = true;
	synchronized (aClass458_3564) {
	    for (int i = 0; i < 5; i++) {
		if (anIntArray3572[i] != -1
		    && !aClass458_3564.method7478(anIntArray3572[i], 0,
						  (short) 26945))
		    bool = false;
	    }
	}
	return bool;
    }
    
    public boolean method5749(byte i) {
	boolean bool = true;
	synchronized (aClass458_3564) {
	    for (int i_1_ = 0; i_1_ < 5; i_1_++) {
		if (anIntArray3572[i_1_] != -1
		    && !aClass458_3564.method7478(anIntArray3572[i_1_], 0,
						  (short) 26635))
		    bool = false;
	    }
	}
	return bool;
    }
    
    public ModelDecoder method5750(int i) {
	if (null == anIntArray3565)
	    return null;
	ModelDecoder[] class186s = new ModelDecoder[anIntArray3565.length];
	synchronized (aClass458_3564) {
	    for (int i_2_ = 0; i_2_ < anIntArray3565.length; i_2_++)
		class186s[i_2_] = ModelDecoder.method3644(aClass458_3564,
						      anIntArray3565[i_2_], 0);
	}
	for (int i_3_ = 0; i_3_ < anIntArray3565.length; i_3_++) {
	    if (class186s[i_3_].version < 13)
		class186s[i_3_].method3651(2);
	}
	ModelDecoder class186;
	if (class186s.length == 1)
	    class186 = class186s[0];
	else
	    class186 = new ModelDecoder(class186s, class186s.length);
	if (class186 == null)
	    return null;
	if (null != aShortArray3570) {
	    for (int i_4_ = 0; i_4_ < aShortArray3570.length; i_4_++)
		class186.method3631(aShortArray3570[i_4_],
				    aShortArray3567[i_4_]);
	}
	if (null != aShortArray3568) {
	    for (int i_5_ = 0; i_5_ < aShortArray3568.length; i_5_++)
		class186.method3632(aShortArray3568[i_5_],
				    aShortArray3569[i_5_]);
	}
	return class186;
    }
    
    public ModelDecoder method5751() {
	ModelDecoder[] class186s = new ModelDecoder[5];
	int i = 0;
	synchronized (aClass458_3564) {
	    for (int i_6_ = 0; i_6_ < 5; i_6_++) {
		if (-1 != anIntArray3572[i_6_])
		    class186s[i++]
			= ModelDecoder.method3644(aClass458_3564,
					      anIntArray3572[i_6_], 0);
	    }
	}
	for (int i_7_ = 0; i_7_ < 5; i_7_++) {
	    if (class186s[i_7_] != null && class186s[i_7_].version < 13)
		class186s[i_7_].method3651(2);
	}
	ModelDecoder class186 = new ModelDecoder(class186s, i);
	if (aShortArray3570 != null) {
	    for (int i_8_ = 0; i_8_ < aShortArray3570.length; i_8_++)
		class186.method3631(aShortArray3570[i_8_],
				    aShortArray3567[i_8_]);
	}
	if (null != aShortArray3568) {
	    for (int i_9_ = 0; i_9_ < aShortArray3568.length; i_9_++)
		class186.method3632(aShortArray3568[i_9_],
				    aShortArray3569[i_9_]);
	}
	return class186;
    }
    
    public ModelDecoder method5752(int i) {
	ModelDecoder[] class186s = new ModelDecoder[5];
	int i_10_ = 0;
	synchronized (aClass458_3564) {
	    for (int i_11_ = 0; i_11_ < 5; i_11_++) {
		if (-1 != anIntArray3572[i_11_])
		    class186s[i_10_++]
			= ModelDecoder.method3644(aClass458_3564,
					      anIntArray3572[i_11_], 0);
	    }
	}
	for (int i_12_ = 0; i_12_ < 5; i_12_++) {
	    if (class186s[i_12_] != null && class186s[i_12_].version < 13)
		class186s[i_12_].method3651(2);
	}
	ModelDecoder class186 = new ModelDecoder(class186s, i_10_);
	if (aShortArray3570 != null) {
	    for (int i_13_ = 0; i_13_ < aShortArray3570.length; i_13_++)
		class186.method3631(aShortArray3570[i_13_],
				    aShortArray3567[i_13_]);
	}
	if (null != aShortArray3568) {
	    for (int i_14_ = 0; i_14_ < aShortArray3568.length; i_14_++)
		class186.method3632(aShortArray3568[i_14_],
				    aShortArray3569[i_14_]);
	}
	return class186;
    }
    
    public boolean method5753(int i) {
	if (anIntArray3565 == null)
	    return true;
	boolean bool = true;
	synchronized (aClass458_3564) {
	    for (int i_15_ = 0; i_15_ < anIntArray3565.length; i_15_++) {
		if (!aClass458_3564.method7478(anIntArray3565[i_15_], 0,
					       (short) 28828))
		    bool = false;
	    }
	}
	return bool;
    }
    
    public void method69() {
	/* empty */
    }
    
    public void method70() {
	/* empty */
    }
    
    void method5754(RSBuffer class525_sub38, int i) {
	if (i == 1)
	    class525_sub38.readUnsignedByte(1667103027);
	else if (2 == i) {
	    int i_16_ = class525_sub38.readUnsignedByte(553133252);
	    anIntArray3565 = new int[i_16_];
	    for (int i_17_ = 0; i_17_ < i_16_; i_17_++)
		anIntArray3565[i_17_]
		    = class525_sub38.readBigSmart(-2043778683);
	} else if (i != 3) {
	    if (i == 40) {
		int i_18_ = class525_sub38.readUnsignedByte(1257877679);
		aShortArray3570 = new short[i_18_];
		aShortArray3567 = new short[i_18_];
		for (int i_19_ = 0; i_19_ < i_18_; i_19_++) {
		    aShortArray3570[i_19_]
			= (short) class525_sub38.readUnsignedShort((byte) 96);
		    aShortArray3567[i_19_]
			= (short) class525_sub38.readUnsignedShort((byte) 87);
		}
	    } else if (41 == i) {
		int i_20_ = class525_sub38.readUnsignedByte(265885461);
		aShortArray3568 = new short[i_20_];
		aShortArray3569 = new short[i_20_];
		for (int i_21_ = 0; i_21_ < i_20_; i_21_++) {
		    aShortArray3568[i_21_]
			= (short) class525_sub38.readUnsignedShort((byte) 125);
		    aShortArray3569[i_21_]
			= (short) class525_sub38.readUnsignedShort((byte) 90);
		}
	    } else if (44 == i) {
		int i_22_ = class525_sub38.readUnsignedShort((byte) 67);
		int i_23_ = 0;
		for (int i_24_ = i_22_; i_24_ > 0; i_24_ >>= 1)
		    i_23_++;
		aByteArray3571 = new byte[i_23_];
		byte i_25_ = 0;
		for (int i_26_ = 0; i_26_ < i_23_; i_26_++) {
		    if ((i_22_ & 1 << i_26_) > 0) {
			aByteArray3571[i_26_] = i_25_;
			i_25_++;
		    } else
			aByteArray3571[i_26_] = (byte) -1;
		}
	    } else if (i == 45) {
		int i_27_ = class525_sub38.readUnsignedShort((byte) 85);
		int i_28_ = 0;
		for (int i_29_ = i_27_; i_29_ > 0; i_29_ >>= 1)
		    i_28_++;
		aByteArray3566 = new byte[i_28_];
		byte i_30_ = 0;
		for (int i_31_ = 0; i_31_ < i_28_; i_31_++) {
		    if ((i_27_ & 1 << i_31_) > 0) {
			aByteArray3566[i_31_] = i_30_;
			i_30_++;
		    } else
			aByteArray3566[i_31_] = (byte) -1;
		}
	    } else if (i >= 60 && i < 70)
		anIntArray3572[i - 60]
		    = class525_sub38.readBigSmart(-2043778683);
	}
    }
    
    public void method68(RSBuffer class525_sub38) {
	for (;;) {
	    int i = class525_sub38.readUnsignedByte(532895024);
	    if (0 == i)
		break;
	    method5759(class525_sub38, i, -830967369);
	}
    }
    
    void method5755(RSBuffer class525_sub38, int i) {
	if (i == 1)
	    class525_sub38.readUnsignedByte(1005996920);
	else if (2 == i) {
	    int i_32_ = class525_sub38.readUnsignedByte(1379497048);
	    anIntArray3565 = new int[i_32_];
	    for (int i_33_ = 0; i_33_ < i_32_; i_33_++)
		anIntArray3565[i_33_]
		    = class525_sub38.readBigSmart(-2043778683);
	} else if (i != 3) {
	    if (i == 40) {
		int i_34_ = class525_sub38.readUnsignedByte(326945306);
		aShortArray3570 = new short[i_34_];
		aShortArray3567 = new short[i_34_];
		for (int i_35_ = 0; i_35_ < i_34_; i_35_++) {
		    aShortArray3570[i_35_]
			= (short) class525_sub38.readUnsignedShort((byte) 14);
		    aShortArray3567[i_35_]
			= (short) class525_sub38.readUnsignedShort((byte) 98);
		}
	    } else if (41 == i) {
		int i_36_ = class525_sub38.readUnsignedByte(831978797);
		aShortArray3568 = new short[i_36_];
		aShortArray3569 = new short[i_36_];
		for (int i_37_ = 0; i_37_ < i_36_; i_37_++) {
		    aShortArray3568[i_37_]
			= (short) class525_sub38.readUnsignedShort((byte) 58);
		    aShortArray3569[i_37_]
			= (short) class525_sub38.readUnsignedShort((byte) 126);
		}
	    } else if (44 == i) {
		int i_38_ = class525_sub38.readUnsignedShort((byte) 14);
		int i_39_ = 0;
		for (int i_40_ = i_38_; i_40_ > 0; i_40_ >>= 1)
		    i_39_++;
		aByteArray3571 = new byte[i_39_];
		byte i_41_ = 0;
		for (int i_42_ = 0; i_42_ < i_39_; i_42_++) {
		    if ((i_38_ & 1 << i_42_) > 0) {
			aByteArray3571[i_42_] = i_41_;
			i_41_++;
		    } else
			aByteArray3571[i_42_] = (byte) -1;
		}
	    } else if (i == 45) {
		int i_43_ = class525_sub38.readUnsignedShort((byte) 36);
		int i_44_ = 0;
		for (int i_45_ = i_43_; i_45_ > 0; i_45_ >>= 1)
		    i_44_++;
		aByteArray3566 = new byte[i_44_];
		byte i_46_ = 0;
		for (int i_47_ = 0; i_47_ < i_44_; i_47_++) {
		    if ((i_43_ & 1 << i_47_) > 0) {
			aByteArray3566[i_47_] = i_46_;
			i_46_++;
		    } else
			aByteArray3566[i_47_] = (byte) -1;
		}
	    } else if (i >= 60 && i < 70)
		anIntArray3572[i - 60]
		    = class525_sub38.readBigSmart(-2043778683);
	}
    }
    
    public boolean method5756() {
	if (anIntArray3565 == null)
	    return true;
	boolean bool = true;
	synchronized (aClass458_3564) {
	    for (int i = 0; i < anIntArray3565.length; i++) {
		if (!aClass458_3564.method7478(anIntArray3565[i], 0,
					       (short) 29164))
		    bool = false;
	    }
	}
	return bool;
    }
    
    public boolean method5757() {
	if (anIntArray3565 == null)
	    return true;
	boolean bool = true;
	synchronized (aClass458_3564) {
	    for (int i = 0; i < anIntArray3565.length; i++) {
		if (!aClass458_3564.method7478(anIntArray3565[i], 0,
					       (short) 19862))
		    bool = false;
	    }
	}
	return bool;
    }
    
    void method5758(RSBuffer class525_sub38, int i) {
	if (i == 1)
	    class525_sub38.readUnsignedByte(832256958);
	else if (2 == i) {
	    int i_48_ = class525_sub38.readUnsignedByte(947145743);
	    anIntArray3565 = new int[i_48_];
	    for (int i_49_ = 0; i_49_ < i_48_; i_49_++)
		anIntArray3565[i_49_]
		    = class525_sub38.readBigSmart(-2043778683);
	} else if (i != 3) {
	    if (i == 40) {
		int i_50_ = class525_sub38.readUnsignedByte(1123904796);
		aShortArray3570 = new short[i_50_];
		aShortArray3567 = new short[i_50_];
		for (int i_51_ = 0; i_51_ < i_50_; i_51_++) {
		    aShortArray3570[i_51_]
			= (short) class525_sub38.readUnsignedShort((byte) 122);
		    aShortArray3567[i_51_]
			= (short) class525_sub38.readUnsignedShort((byte) 52);
		}
	    } else if (41 == i) {
		int i_52_ = class525_sub38.readUnsignedByte(1322913459);
		aShortArray3568 = new short[i_52_];
		aShortArray3569 = new short[i_52_];
		for (int i_53_ = 0; i_53_ < i_52_; i_53_++) {
		    aShortArray3568[i_53_]
			= (short) class525_sub38.readUnsignedShort((byte) 1);
		    aShortArray3569[i_53_]
			= (short) class525_sub38.readUnsignedShort((byte) 4);
		}
	    } else if (44 == i) {
		int i_54_ = class525_sub38.readUnsignedShort((byte) 40);
		int i_55_ = 0;
		for (int i_56_ = i_54_; i_56_ > 0; i_56_ >>= 1)
		    i_55_++;
		aByteArray3571 = new byte[i_55_];
		byte i_57_ = 0;
		for (int i_58_ = 0; i_58_ < i_55_; i_58_++) {
		    if ((i_54_ & 1 << i_58_) > 0) {
			aByteArray3571[i_58_] = i_57_;
			i_57_++;
		    } else
			aByteArray3571[i_58_] = (byte) -1;
		}
	    } else if (i == 45) {
		int i_59_ = class525_sub38.readUnsignedShort((byte) 126);
		int i_60_ = 0;
		for (int i_61_ = i_59_; i_61_ > 0; i_61_ >>= 1)
		    i_60_++;
		aByteArray3566 = new byte[i_60_];
		byte i_62_ = 0;
		for (int i_63_ = 0; i_63_ < i_60_; i_63_++) {
		    if ((i_59_ & 1 << i_63_) > 0) {
			aByteArray3566[i_63_] = i_62_;
			i_62_++;
		    } else
			aByteArray3566[i_63_] = (byte) -1;
		}
	    } else if (i >= 60 && i < 70)
		anIntArray3572[i - 60]
		    = class525_sub38.readBigSmart(-2043778683);
	}
    }
    
    void method5759(RSBuffer class525_sub38, int i, int i_64_) {
	if (i == 1)
	    class525_sub38.readUnsignedByte(726087226);
	else if (2 == i) {
	    int i_65_ = class525_sub38.readUnsignedByte(1098015362);
	    anIntArray3565 = new int[i_65_];
	    for (int i_66_ = 0; i_66_ < i_65_; i_66_++)
		anIntArray3565[i_66_]
		    = class525_sub38.readBigSmart(-2043778683);
	} else if (i != 3) {
	    if (i == 40) {
		int i_67_ = class525_sub38.readUnsignedByte(1118906133);
		aShortArray3570 = new short[i_67_];
		aShortArray3567 = new short[i_67_];
		for (int i_68_ = 0; i_68_ < i_67_; i_68_++) {
		    aShortArray3570[i_68_]
			= (short) class525_sub38.readUnsignedShort((byte) 83);
		    aShortArray3567[i_68_]
			= (short) class525_sub38.readUnsignedShort((byte) 109);
		}
	    } else if (41 == i) {
		int i_69_ = class525_sub38.readUnsignedByte(286591465);
		aShortArray3568 = new short[i_69_];
		aShortArray3569 = new short[i_69_];
		for (int i_70_ = 0; i_70_ < i_69_; i_70_++) {
		    aShortArray3568[i_70_]
			= (short) class525_sub38.readUnsignedShort((byte) 118);
		    aShortArray3569[i_70_]
			= (short) class525_sub38.readUnsignedShort((byte) 88);
		}
	    } else if (44 == i) {
		int i_71_ = class525_sub38.readUnsignedShort((byte) 103);
		int i_72_ = 0;
		for (int i_73_ = i_71_; i_73_ > 0; i_73_ >>= 1)
		    i_72_++;
		aByteArray3571 = new byte[i_72_];
		byte i_74_ = 0;
		for (int i_75_ = 0; i_75_ < i_72_; i_75_++) {
		    if ((i_71_ & 1 << i_75_) > 0) {
			aByteArray3571[i_75_] = i_74_;
			i_74_++;
		    } else
			aByteArray3571[i_75_] = (byte) -1;
		}
	    } else if (i == 45) {
		int i_76_ = class525_sub38.readUnsignedShort((byte) 49);
		int i_77_ = 0;
		for (int i_78_ = i_76_; i_78_ > 0; i_78_ >>= 1)
		    i_77_++;
		aByteArray3566 = new byte[i_77_];
		byte i_79_ = 0;
		for (int i_80_ = 0; i_80_ < i_77_; i_80_++) {
		    if ((i_76_ & 1 << i_80_) > 0) {
			aByteArray3566[i_80_] = i_79_;
			i_79_++;
		    } else
			aByteArray3566[i_80_] = (byte) -1;
		}
	    } else if (i >= 60 && i < 70)
		anIntArray3572[i - 60]
		    = class525_sub38.readBigSmart(-2043778683);
	}
    }
    
    public ModelDecoder method5760() {
	if (null == anIntArray3565)
	    return null;
	ModelDecoder[] class186s = new ModelDecoder[anIntArray3565.length];
	synchronized (aClass458_3564) {
	    for (int i = 0; i < anIntArray3565.length; i++)
		class186s[i] = ModelDecoder.method3644(aClass458_3564,
						   anIntArray3565[i], 0);
	}
	for (int i = 0; i < anIntArray3565.length; i++) {
	    if (class186s[i].version < 13)
		class186s[i].method3651(2);
	}
	ModelDecoder class186;
	if (class186s.length == 1)
	    class186 = class186s[0];
	else
	    class186 = new ModelDecoder(class186s, class186s.length);
	if (class186 == null)
	    return null;
	if (null != aShortArray3570) {
	    for (int i = 0; i < aShortArray3570.length; i++)
		class186.method3631(aShortArray3570[i], aShortArray3567[i]);
	}
	if (null != aShortArray3568) {
	    for (int i = 0; i < aShortArray3568.length; i++)
		class186.method3632(aShortArray3568[i], aShortArray3569[i]);
	}
	return class186;
    }
    
    public ModelDecoder method5761() {
	if (null == anIntArray3565)
	    return null;
	ModelDecoder[] class186s = new ModelDecoder[anIntArray3565.length];
	synchronized (aClass458_3564) {
	    for (int i = 0; i < anIntArray3565.length; i++)
		class186s[i] = ModelDecoder.method3644(aClass458_3564,
						   anIntArray3565[i], 0);
	}
	for (int i = 0; i < anIntArray3565.length; i++) {
	    if (class186s[i].version < 13)
		class186s[i].method3651(2);
	}
	ModelDecoder class186;
	if (class186s.length == 1)
	    class186 = class186s[0];
	else
	    class186 = new ModelDecoder(class186s, class186s.length);
	if (class186 == null)
	    return null;
	if (null != aShortArray3570) {
	    for (int i = 0; i < aShortArray3570.length; i++)
		class186.method3631(aShortArray3570[i], aShortArray3567[i]);
	}
	if (null != aShortArray3568) {
	    for (int i = 0; i < aShortArray3568.length; i++)
		class186.method3632(aShortArray3568[i], aShortArray3569[i]);
	}
	return class186;
    }
    
    public ModelDecoder method5762() {
	if (null == anIntArray3565)
	    return null;
	ModelDecoder[] class186s = new ModelDecoder[anIntArray3565.length];
	synchronized (aClass458_3564) {
	    for (int i = 0; i < anIntArray3565.length; i++)
		class186s[i] = ModelDecoder.method3644(aClass458_3564,
						   anIntArray3565[i], 0);
	}
	for (int i = 0; i < anIntArray3565.length; i++) {
	    if (class186s[i].version < 13)
		class186s[i].method3651(2);
	}
	ModelDecoder class186;
	if (class186s.length == 1)
	    class186 = class186s[0];
	else
	    class186 = new ModelDecoder(class186s, class186s.length);
	if (class186 == null)
	    return null;
	if (null != aShortArray3570) {
	    for (int i = 0; i < aShortArray3570.length; i++)
		class186.method3631(aShortArray3570[i], aShortArray3567[i]);
	}
	if (null != aShortArray3568) {
	    for (int i = 0; i < aShortArray3568.length; i++)
		class186.method3632(aShortArray3568[i], aShortArray3569[i]);
	}
	return class186;
    }
    
    public boolean method5763() {
	boolean bool = true;
	synchronized (aClass458_3564) {
	    for (int i = 0; i < 5; i++) {
		if (anIntArray3572[i] != -1
		    && !aClass458_3564.method7478(anIntArray3572[i], 0,
						  (short) 19395))
		    bool = false;
	    }
	}
	return bool;
    }
    
    public boolean method5764() {
	if (anIntArray3565 == null)
	    return true;
	boolean bool = true;
	synchronized (aClass458_3564) {
	    for (int i = 0; i < anIntArray3565.length; i++) {
		if (!aClass458_3564.method7478(anIntArray3565[i], 0,
					       (short) 1238))
		    bool = false;
	    }
	}
	return bool;
    }
    
    static final void method5765(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = (-398479907 * client.anInt11071
	       == class683.aClass656_Sub1_Sub3_Sub1_8654
		      .method18600(-1324423249)) ? 1 : 0;
    }
    
    static final void method5766(Class683 class683, byte i) {
	int i_81_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub8_10671
		  .method14167(i_81_, (byte) -34);
    }
    
    public static boolean method5767(int i, int i_82_) {
	if (Class201.anInt2209 * -1755834573 != i
	    || null == Class387.aClass190_4036) {
	    Class555.method9241(-2007319410);
	    Class387.aClass190_4036 = Class190.aClass190_2138;
	    Class201.anInt2209 = i * 831896571;
	}
	if (Class387.aClass190_4036 == Class190.aClass190_2138) {
	    byte[] is = Class656_Sub1_Sub3_Sub3.idx_35
			    .getTextureData(i, 1969607210);
	    if (is == null)
		return false;
	    RSBuffer class525_sub38 = new RSBuffer(is);
	    Class171.method2735(class525_sub38, (byte) -69);
	    int i_83_ = class525_sub38.readUnsignedByte(1076737007);
	    for (int i_84_ = 0; i_84_ < i_83_; i_84_++)
		Class201.aClass709_2201
		    .method14345(new Class525_Sub24(class525_sub38), (byte) 0);
	    int i_85_ = class525_sub38.readUnsignedSmart((byte) -50);
	    Class201.aClass202Array2206 = new Class202[i_85_];
	    for (int i_86_ = 0; i_86_ < i_85_; i_86_++)
		Class201.aClass202Array2206[i_86_]
		    = new Class202(class525_sub38);
	    int i_87_ = class525_sub38.readUnsignedSmart((byte) -105);
	    Class201.aClass205Array2202 = new Class205[i_87_];
	    for (int i_88_ = 0; i_88_ < i_87_; i_88_++)
		Class201.aClass205Array2202[i_88_]
		    = new Class205(class525_sub38, i_88_);
	    int i_89_ = class525_sub38.readUnsignedSmart((byte) -17);
	    Class201.aClass193Array2203 = new Class193[i_89_];
	    for (int i_90_ = 0; i_90_ < i_89_; i_90_++)
		Class201.aClass193Array2203[i_90_]
		    = new Class193(class525_sub38);
	    int i_91_ = class525_sub38.readUnsignedSmart((byte) -53);
	    Class201.aClass191Array2210 = new Class191[i_91_];
	    for (int i_92_ = 0; i_92_ < i_91_; i_92_++)
		Class201.aClass191Array2210[i_92_]
		    = new Class191(class525_sub38);
	    int i_93_ = class525_sub38.readUnsignedSmart((byte) -85);
	    Class201.aClass198Array2205 = new Class198[i_93_];
	    for (int i_94_ = 0; i_94_ < i_93_; i_94_++)
		Class201.aClass198Array2205[i_94_]
		    = Class466.method7691(class525_sub38, -1369568567);
	    Class387.aClass190_4036 = Class190.aClass190_2137;
	}
	if (Class387.aClass190_4036 == Class190.aClass190_2137) {
	    boolean bool = true;
	    Class205[] class205s = Class201.aClass205Array2202;
	    for (int i_95_ = 0; i_95_ < class205s.length; i_95_++) {
		Class205 class205 = class205s[i_95_];
		if (!class205.method3865((byte) 26))
		    bool = false;
	    }
	    Class198[] class198s = Class201.aClass198Array2205;
	    for (int i_96_ = 0; i_96_ < class198s.length; i_96_++) {
		Class198 class198 = class198s[i_96_];
		if (!class198.method3752(476761320))
		    bool = false;
	    }
	    Class193[] class193s = Class201.aClass193Array2203;
	    for (int i_97_ = 0; i_97_ < class193s.length; i_97_++) {
		Class193 class193 = class193s[i_97_];
		if (!class193.method3707((byte) -53))
		    bool = false;
	    }
	    if (!bool)
		return false;
	    Class387.aClass190_4036 = Class190.aClass190_2136;
	}
	return true;
    }
    
    static final void method5768(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = client.aShort11350;
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = client.aShort11351;
    }
    
    static final void method5769(Class683 class683, byte i) {
	throw new RuntimeException("");
    }
}
