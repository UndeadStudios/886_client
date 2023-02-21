/* Class461 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class461
{
    Class265[] aClass265Array5071;
    int anInt5072;
    static final int anInt5073 = 7;
    byte[] aByteArray5074;
    int anInt5075;
    int anInt5076;
    int[] anIntArray5077;
    Class265 aClass265_5078;
    int anInt5079;
    int[] anIntArray5080;
    int[] anIntArray5081;
    byte[][] aByteArrayArray5082;
    int[] anIntArray5083;
    int[] anIntArray5084;
    int[] anIntArray5085;
    int[] anIntArray5086;
    int[][] anIntArrayArray5087;
    int[][] anIntArrayArray5088;
    int[] anIntArray5089;
    int[] anIntArray5090;
    
    void method7589(byte[] is, byte i) {
	RSBuffer class525_sub38
	    = new RSBuffer(Class214.method4011(is, (byte) 8));
	int i_0_ = class525_sub38.readUnsignedByte(207435282);
	if (i_0_ < 5 || i_0_ > 7)
	    throw new RuntimeException();
	if (i_0_ >= 6)
	    anInt5076 = class525_sub38.readInt(1608860541) * -1928966479;
	else
	    anInt5076 = 0;
	int i_1_ = class525_sub38.readUnsignedByte(1901386284);
	boolean bool = (i_1_ & 0x1) != 0;
	boolean bool_2_ = 0 != (i_1_ & 0x2);
	boolean bool_3_ = (i_1_ & 0x4) != 0;
	boolean bool_4_ = 0 != (i_1_ & 0x8);
	if (i_0_ >= 7)
	    anInt5075 = class525_sub38.method16732(159694411) * 273485491;
	else
	    anInt5075 = class525_sub38.readUnsignedShort((byte) 93) * 273485491;
	int i_5_ = 0;
	int i_6_ = -1;
	anIntArray5083 = new int[1628852347 * anInt5075];
	if (i_0_ >= 7) {
	    for (int i_7_ = 0; i_7_ < anInt5075 * 1628852347; i_7_++) {
		anIntArray5083[i_7_] = i_5_
		    += class525_sub38.method16732(159694411);
		if (anIntArray5083[i_7_] > i_6_)
		    i_6_ = anIntArray5083[i_7_];
	    }
	} else {
	    for (int i_8_ = 0; i_8_ < 1628852347 * anInt5075; i_8_++) {
		anIntArray5083[i_8_] = i_5_
		    += class525_sub38.readUnsignedShort((byte) 17);
		if (anIntArray5083[i_8_] > i_6_)
		    i_6_ = anIntArray5083[i_8_];
	    }
	}
	anInt5079 = 25256599 * (1 + i_6_);
	anIntArray5080 = new int[anInt5079 * 1259617575];
	if (bool_4_)
	    anIntArray5081 = new int[1259617575 * anInt5079];
	if (bool_2_)
	    aByteArrayArray5082 = new byte[anInt5079 * 1259617575][];
	anIntArray5089 = new int[anInt5079 * 1259617575];
	anIntArray5086 = new int[1259617575 * anInt5079];
	anIntArrayArray5087 = new int[1259617575 * anInt5079][];
	anIntArray5090 = new int[1259617575 * anInt5079];
	if (bool) {
	    anIntArray5077 = new int[anInt5079 * 1259617575];
	    for (int i_9_ = 0; i_9_ < 1259617575 * anInt5079; i_9_++)
		anIntArray5077[i_9_] = -1;
	    for (int i_10_ = 0; i_10_ < anInt5075 * 1628852347; i_10_++)
		anIntArray5077[anIntArray5083[i_10_]]
		    = class525_sub38.readInt(1487682502);
	    aClass265_5078 = new Class265(anIntArray5077);
	}
	for (int i_11_ = 0; i_11_ < anInt5075 * 1628852347; i_11_++)
	    anIntArray5080[anIntArray5083[i_11_]]
		= class525_sub38.readInt(986773337);
	if (bool_4_) {
	    for (int i_12_ = 0; i_12_ < anInt5075 * 1628852347; i_12_++)
		anIntArray5081[i_12_] = class525_sub38.readInt(1764008842);
	}
	if (bool_2_) {
	    for (int i_13_ = 0; i_13_ < anInt5075 * 1628852347; i_13_++) {
		byte[] is_14_ = new byte[64];
		class525_sub38.method16639(is_14_, 0, 64, 1487480465);
		aByteArrayArray5082[anIntArray5083[i_13_]] = is_14_;
	    }
	}
	if (bool_3_) {
	    anIntArray5084 = new int[anInt5079 * 1259617575];
	    anIntArray5085 = new int[anInt5079 * 1259617575];
	    for (int i_15_ = 0; i_15_ < anInt5075 * 1628852347; i_15_++) {
		anIntArray5084[anIntArray5083[i_15_]]
		    = class525_sub38.readInt(1976366677);
		anIntArray5085[anIntArray5083[i_15_]]
		    = class525_sub38.readInt(1024259529);
	    }
	}
	for (int i_16_ = 0; i_16_ < 1628852347 * anInt5075; i_16_++)
	    anIntArray5089[anIntArray5083[i_16_]]
		= class525_sub38.readInt(1942195917);
	if (i_0_ >= 7) {
	    for (int i_17_ = 0; i_17_ < 1628852347 * anInt5075; i_17_++)
		anIntArray5086[anIntArray5083[i_17_]]
		    = class525_sub38.method16732(159694411);
	    for (int i_18_ = 0; i_18_ < 1628852347 * anInt5075; i_18_++) {
		int i_19_ = anIntArray5083[i_18_];
		int i_20_ = anIntArray5086[i_19_];
		i_5_ = 0;
		int i_21_ = -1;
		anIntArrayArray5087[i_19_] = new int[i_20_];
		for (int i_22_ = 0; i_22_ < i_20_; i_22_++) {
		    int i_23_ = (anIntArrayArray5087[i_19_][i_22_] = i_5_
				 += class525_sub38.method16732(159694411));
		    if (i_23_ > i_21_)
			i_21_ = i_23_;
		}
		anIntArray5090[i_19_] = 1 + i_21_;
		if (1 + i_21_ == i_20_)
		    anIntArrayArray5087[i_19_] = null;
	    }
	} else {
	    for (int i_24_ = 0; i_24_ < anInt5075 * 1628852347; i_24_++)
		anIntArray5086[anIntArray5083[i_24_]]
		    = class525_sub38.readUnsignedShort((byte) 86);
	    for (int i_25_ = 0; i_25_ < anInt5075 * 1628852347; i_25_++) {
		int i_26_ = anIntArray5083[i_25_];
		int i_27_ = anIntArray5086[i_26_];
		i_5_ = 0;
		int i_28_ = -1;
		anIntArrayArray5087[i_26_] = new int[i_27_];
		for (int i_29_ = 0; i_29_ < i_27_; i_29_++) {
		    int i_30_ = (anIntArrayArray5087[i_26_][i_29_] = i_5_
				 += class525_sub38.readUnsignedShort((byte) 4));
		    if (i_30_ > i_28_)
			i_28_ = i_30_;
		}
		anIntArray5090[i_26_] = i_28_ + 1;
		if (i_28_ + 1 == i_27_)
		    anIntArrayArray5087[i_26_] = null;
	    }
	}
	if (bool) {
	    anIntArrayArray5088 = new int[i_6_ + 1][];
	    aClass265Array5071 = new Class265[1 + i_6_];
	    for (int i_31_ = 0; i_31_ < 1628852347 * anInt5075; i_31_++) {
		int i_32_ = anIntArray5083[i_31_];
		int i_33_ = anIntArray5086[i_32_];
		anIntArrayArray5088[i_32_] = new int[anIntArray5090[i_32_]];
		for (int i_34_ = 0; i_34_ < anIntArray5090[i_32_]; i_34_++)
		    anIntArrayArray5088[i_32_][i_34_] = -1;
		for (int i_35_ = 0; i_35_ < i_33_; i_35_++) {
		    int i_36_;
		    if (null != anIntArrayArray5087[i_32_])
			i_36_ = anIntArrayArray5087[i_32_][i_35_];
		    else
			i_36_ = i_35_;
		    anIntArrayArray5088[i_32_][i_36_]
			= class525_sub38.readInt(1419478433);
		}
		aClass265Array5071[i_32_]
		    = new Class265(anIntArrayArray5088[i_32_]);
	    }
	}
    }
    
    Class461(byte[] is, int i, byte[] is_37_) {
	anInt5072
	    = Class272.method5023(is, is.length, 1777895575) * -1485345203;
	if (anInt5072 * -982549883 != i)
	    throw new RuntimeException();
	if (null != is_37_) {
	    if (is_37_.length != 64)
		throw new RuntimeException();
	    aByteArray5074 = Class510.method8505(is, 0, is.length, (byte) -19);
	    for (int i_38_ = 0; i_38_ < 64; i_38_++) {
		if (is_37_[i_38_] != aByteArray5074[i_38_])
		    throw new RuntimeException();
	    }
	}
	method7589(is, (byte) -4);
    }
    
    void method7590(byte[] is) {
	RSBuffer class525_sub38
	    = new RSBuffer(Class214.method4011(is, (byte) -63));
	int i = class525_sub38.readUnsignedByte(1822483519);
	if (i < 5 || i > 7)
	    throw new RuntimeException();
	if (i >= 6)
	    anInt5076 = class525_sub38.readInt(1744814590) * -1928966479;
	else
	    anInt5076 = 0;
	int i_39_ = class525_sub38.readUnsignedByte(979422262);
	boolean bool = (i_39_ & 0x1) != 0;
	boolean bool_40_ = 0 != (i_39_ & 0x2);
	boolean bool_41_ = (i_39_ & 0x4) != 0;
	boolean bool_42_ = 0 != (i_39_ & 0x8);
	if (i >= 7)
	    anInt5075 = class525_sub38.method16732(159694411) * 273485491;
	else
	    anInt5075 = class525_sub38.readUnsignedShort((byte) 5) * 273485491;
	int i_43_ = 0;
	int i_44_ = -1;
	anIntArray5083 = new int[1628852347 * anInt5075];
	if (i >= 7) {
	    for (int i_45_ = 0; i_45_ < anInt5075 * 1628852347; i_45_++) {
		anIntArray5083[i_45_] = i_43_
		    += class525_sub38.method16732(159694411);
		if (anIntArray5083[i_45_] > i_44_)
		    i_44_ = anIntArray5083[i_45_];
	    }
	} else {
	    for (int i_46_ = 0; i_46_ < 1628852347 * anInt5075; i_46_++) {
		anIntArray5083[i_46_] = i_43_
		    += class525_sub38.readUnsignedShort((byte) 66);
		if (anIntArray5083[i_46_] > i_44_)
		    i_44_ = anIntArray5083[i_46_];
	    }
	}
	anInt5079 = 25256599 * (1 + i_44_);
	anIntArray5080 = new int[anInt5079 * 1259617575];
	if (bool_42_)
	    anIntArray5081 = new int[1259617575 * anInt5079];
	if (bool_40_)
	    aByteArrayArray5082 = new byte[anInt5079 * 1259617575][];
	anIntArray5089 = new int[anInt5079 * 1259617575];
	anIntArray5086 = new int[1259617575 * anInt5079];
	anIntArrayArray5087 = new int[1259617575 * anInt5079][];
	anIntArray5090 = new int[1259617575 * anInt5079];
	if (bool) {
	    anIntArray5077 = new int[anInt5079 * 1259617575];
	    for (int i_47_ = 0; i_47_ < 1259617575 * anInt5079; i_47_++)
		anIntArray5077[i_47_] = -1;
	    for (int i_48_ = 0; i_48_ < anInt5075 * 1628852347; i_48_++)
		anIntArray5077[anIntArray5083[i_48_]]
		    = class525_sub38.readInt(1073220590);
	    aClass265_5078 = new Class265(anIntArray5077);
	}
	for (int i_49_ = 0; i_49_ < anInt5075 * 1628852347; i_49_++)
	    anIntArray5080[anIntArray5083[i_49_]]
		= class525_sub38.readInt(1347755782);
	if (bool_42_) {
	    for (int i_50_ = 0; i_50_ < anInt5075 * 1628852347; i_50_++)
		anIntArray5081[i_50_] = class525_sub38.readInt(1206226221);
	}
	if (bool_40_) {
	    for (int i_51_ = 0; i_51_ < anInt5075 * 1628852347; i_51_++) {
		byte[] is_52_ = new byte[64];
		class525_sub38.method16639(is_52_, 0, 64, 91831812);
		aByteArrayArray5082[anIntArray5083[i_51_]] = is_52_;
	    }
	}
	if (bool_41_) {
	    anIntArray5084 = new int[anInt5079 * 1259617575];
	    anIntArray5085 = new int[anInt5079 * 1259617575];
	    for (int i_53_ = 0; i_53_ < anInt5075 * 1628852347; i_53_++) {
		anIntArray5084[anIntArray5083[i_53_]]
		    = class525_sub38.readInt(2116013542);
		anIntArray5085[anIntArray5083[i_53_]]
		    = class525_sub38.readInt(1444942135);
	    }
	}
	for (int i_54_ = 0; i_54_ < 1628852347 * anInt5075; i_54_++)
	    anIntArray5089[anIntArray5083[i_54_]]
		= class525_sub38.readInt(964620080);
	if (i >= 7) {
	    for (int i_55_ = 0; i_55_ < 1628852347 * anInt5075; i_55_++)
		anIntArray5086[anIntArray5083[i_55_]]
		    = class525_sub38.method16732(159694411);
	    for (int i_56_ = 0; i_56_ < 1628852347 * anInt5075; i_56_++) {
		int i_57_ = anIntArray5083[i_56_];
		int i_58_ = anIntArray5086[i_57_];
		i_43_ = 0;
		int i_59_ = -1;
		anIntArrayArray5087[i_57_] = new int[i_58_];
		for (int i_60_ = 0; i_60_ < i_58_; i_60_++) {
		    int i_61_ = (anIntArrayArray5087[i_57_][i_60_] = i_43_
				 += class525_sub38.method16732(159694411));
		    if (i_61_ > i_59_)
			i_59_ = i_61_;
		}
		anIntArray5090[i_57_] = 1 + i_59_;
		if (1 + i_59_ == i_58_)
		    anIntArrayArray5087[i_57_] = null;
	    }
	} else {
	    for (int i_62_ = 0; i_62_ < anInt5075 * 1628852347; i_62_++)
		anIntArray5086[anIntArray5083[i_62_]]
		    = class525_sub38.readUnsignedShort((byte) 59);
	    for (int i_63_ = 0; i_63_ < anInt5075 * 1628852347; i_63_++) {
		int i_64_ = anIntArray5083[i_63_];
		int i_65_ = anIntArray5086[i_64_];
		i_43_ = 0;
		int i_66_ = -1;
		anIntArrayArray5087[i_64_] = new int[i_65_];
		for (int i_67_ = 0; i_67_ < i_65_; i_67_++) {
		    int i_68_ = (anIntArrayArray5087[i_64_][i_67_] = i_43_
				 += class525_sub38.readUnsignedShort((byte) 10));
		    if (i_68_ > i_66_)
			i_66_ = i_68_;
		}
		anIntArray5090[i_64_] = i_66_ + 1;
		if (i_66_ + 1 == i_65_)
		    anIntArrayArray5087[i_64_] = null;
	    }
	}
	if (bool) {
	    anIntArrayArray5088 = new int[i_44_ + 1][];
	    aClass265Array5071 = new Class265[1 + i_44_];
	    for (int i_69_ = 0; i_69_ < 1628852347 * anInt5075; i_69_++) {
		int i_70_ = anIntArray5083[i_69_];
		int i_71_ = anIntArray5086[i_70_];
		anIntArrayArray5088[i_70_] = new int[anIntArray5090[i_70_]];
		for (int i_72_ = 0; i_72_ < anIntArray5090[i_70_]; i_72_++)
		    anIntArrayArray5088[i_70_][i_72_] = -1;
		for (int i_73_ = 0; i_73_ < i_71_; i_73_++) {
		    int i_74_;
		    if (null != anIntArrayArray5087[i_70_])
			i_74_ = anIntArrayArray5087[i_70_][i_73_];
		    else
			i_74_ = i_73_;
		    anIntArrayArray5088[i_70_][i_74_]
			= class525_sub38.readInt(1045705379);
		}
		aClass265Array5071[i_70_]
		    = new Class265(anIntArrayArray5088[i_70_]);
	    }
	}
    }
    
    static final void method7591(Class683 class683, short i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = 615376671 * client.anInt11053;
    }
}
