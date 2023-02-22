/* Class187 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class187
{
    static final int anInt2132 = 0;
    static final int anInt2133 = 1;
    static final int anInt2134 = 0;
    
    public static Class173 method3666(JS5 class458, int i, int i_0_) {
	byte[] is = class458.getFile(i, i_0_, 1569490028);
	if (is == null)
	    return null;
	return method3670(is)[0];
    }
    
    public static Class173 method3667(JS5 class458, int i, int i_1_) {
	byte[] is = class458.getFile(i, i_1_, 1055201411);
	if (is == null)
	    return null;
	return method3670(is)[0];
    }
    
    public static Class173 method3668(JS5 class458, int i) {
	byte[] is = class458.getTextureData(i, 1737412568);
	if (is == null)
	    return null;
	return method3670(is)[0];
    }
    
    public static Class173[] method3669(byte[] is) {
	RSBuffer class525_sub38 = new RSBuffer(is);
	class525_sub38.index = (is.length - 2) * 339428471;
	int i = class525_sub38.readUnsignedShort((byte) 54);
	int i_2_ = i >> 15;
	int i_3_ = i & 0x7fff;
	if (i_2_ == 0) {
	    Class173_Sub2[] class173_sub2s = new Class173_Sub2[i_3_];
	    for (int i_4_ = 0; i_4_ < i_3_; i_4_++)
		class173_sub2s[i_4_] = new Class173_Sub2();
	    class525_sub38.index = (is.length - 7 - i_3_ * 8) * 339428471;
	    int i_5_ = class525_sub38.readUnsignedShort((byte) 118);
	    int i_6_ = class525_sub38.readUnsignedShort((byte) 19);
	    int i_7_ = (class525_sub38.readUnsignedByte(1780106500) & 0xff) + 1;
	    for (int i_8_ = 0; i_8_ < i_3_; i_8_++)
		class173_sub2s[i_8_].anInt9620
		    = class525_sub38.readUnsignedShort((byte) 119);
	    for (int i_9_ = 0; i_9_ < i_3_; i_9_++)
		class173_sub2s[i_9_].anInt9621
		    = class525_sub38.readUnsignedShort((byte) 56);
	    for (int i_10_ = 0; i_10_ < i_3_; i_10_++)
		class173_sub2s[i_10_].anInt9625
		    = class525_sub38.readUnsignedShort((byte) 56);
	    for (int i_11_ = 0; i_11_ < i_3_; i_11_++)
		class173_sub2s[i_11_].anInt9618
		    = class525_sub38.readUnsignedShort((byte) 11);
	    for (int i_12_ = 0; i_12_ < i_3_; i_12_++) {
		Class173_Sub2 class173_sub2 = class173_sub2s[i_12_];
		class173_sub2.anInt9623
		    = i_5_ - class173_sub2.anInt9625 - class173_sub2.anInt9620;
		class173_sub2.anInt9619
		    = i_6_ - class173_sub2.anInt9618 - class173_sub2.anInt9621;
	    }
	    class525_sub38.index
		= (is.length - 7 - i_3_ * 8 - (i_7_ - 1) * 3) * 339428471;
	    int[] is_13_ = new int[i_7_];
	    for (int i_14_ = 1; i_14_ < i_7_; i_14_++) {
		is_13_[i_14_] = class525_sub38.method16834(-1994884458);
		if (is_13_[i_14_] == 0)
		    is_13_[i_14_] = 1;
	    }
	    for (int i_15_ = 0; i_15_ < i_3_; i_15_++)
		class173_sub2s[i_15_].anIntArray9624 = is_13_;
	    class525_sub38.index = 0;
	    for (int i_16_ = 0; i_16_ < i_3_; i_16_++) {
		Class173_Sub2 class173_sub2 = class173_sub2s[i_16_];
		int i_17_ = class173_sub2.anInt9625 * class173_sub2.anInt9618;
		class173_sub2.aByteArray9622 = new byte[i_17_];
		int i_18_ = class525_sub38.readUnsignedByte(1517133178);
		if ((i_18_ & 0x2) == 0) {
		    if ((i_18_ & 0x1) == 0) {
			for (int i_19_ = 0; i_19_ < i_17_; i_19_++)
			    class173_sub2.aByteArray9622[i_19_]
				= class525_sub38.readByte(-1150098071);
		    } else {
			for (int i_20_ = 0; i_20_ < class173_sub2.anInt9625;
			     i_20_++) {
			    for (int i_21_ = 0;
				 i_21_ < class173_sub2.anInt9618; i_21_++)
				class173_sub2.aByteArray9622
				    [i_20_ + i_21_ * class173_sub2.anInt9625]
				    = class525_sub38.readByte(-1150098071);
			}
		    }
		} else {
		    boolean bool = false;
		    class173_sub2.aByteArray9626 = new byte[i_17_];
		    if ((i_18_ & 0x1) == 0) {
			for (int i_22_ = 0; i_22_ < i_17_; i_22_++)
			    class173_sub2.aByteArray9622[i_22_]
				= class525_sub38.readByte(-1150098071);
			for (int i_23_ = 0; i_23_ < i_17_; i_23_++) {
			    byte i_24_
				= (class173_sub2.aByteArray9626[i_23_]
				   = class525_sub38.readByte(-1150098071));
			    bool = bool | i_24_ != -1;
			}
		    } else {
			for (int i_25_ = 0; i_25_ < class173_sub2.anInt9625;
			     i_25_++) {
			    for (int i_26_ = 0;
				 i_26_ < class173_sub2.anInt9618; i_26_++)
				class173_sub2.aByteArray9622
				    [i_25_ + i_26_ * class173_sub2.anInt9625]
				    = class525_sub38.readByte(-1150098071);
			}
			for (int i_27_ = 0; i_27_ < class173_sub2.anInt9625;
			     i_27_++) {
			    for (int i_28_ = 0;
				 i_28_ < class173_sub2.anInt9618; i_28_++) {
				byte i_29_
				    = (class173_sub2.aByteArray9626
					   [i_27_ + i_28_ * (class173_sub2
							     .anInt9625)]
				       = class525_sub38
					     .readByte(-1150098071));
				bool = bool | i_29_ != -1;
			    }
			}
		    }
		    if (!bool)
			class173_sub2.aByteArray9626 = null;
		}
	    }
	    return class173_sub2s;
	}
	Class173_Sub1[] class173_sub1s = new Class173_Sub1[i_3_];
	class525_sub38.index = 0;
	int i_30_ = class525_sub38.readUnsignedByte(1617255710);
	if (i_30_ == 0) {
	    boolean bool = class525_sub38.readUnsignedByte(1647079394) == 1;
	    int i_31_ = class525_sub38.readUnsignedShort((byte) 63);
	    int i_32_ = class525_sub38.readUnsignedShort((byte) 59);
	    for (int i_33_ = 0; i_33_ < i_3_; i_33_++) {
		int[] is_34_ = new int[i_31_ * i_32_];
		for (int i_35_ = 0; i_35_ < i_31_ * i_32_; i_35_++) {
		    is_34_[i_35_]
			= ~0xffffff | class525_sub38.method16834(-1994884458);
		    if (is_34_[i_35_] == -65281)
			is_34_[i_35_] = 0;
		}
		if (bool) {
		    for (int i_36_ = 0; i_36_ < i_31_ * i_32_; i_36_++) {
			is_34_[i_36_] &= 0xffffff;
			is_34_[i_36_]
			    |= class525_sub38.readUnsignedByte(244839228) << 24;
		    }
		}
		class173_sub1s[i_33_]
		    = new Class173_Sub1(i_31_, i_32_, is_34_);
	    }
	} else {
	    if (i_30_ == 1)
		throw new UnsupportedOperationException();
	    throw new RuntimeException();
	}
	return class173_sub1s;
    }
    
    Class187() throws Throwable {
	throw new Error();
    }
    
    public static Class173[] method3670(byte[] is) {
	RSBuffer class525_sub38 = new RSBuffer(is);
	class525_sub38.index = (is.length - 2) * 339428471;
	int i = class525_sub38.readUnsignedShort((byte) 78);
	int i_37_ = i >> 15;
	int i_38_ = i & 0x7fff;
	if (i_37_ == 0) {
	    Class173_Sub2[] class173_sub2s = new Class173_Sub2[i_38_];
	    for (int i_39_ = 0; i_39_ < i_38_; i_39_++)
		class173_sub2s[i_39_] = new Class173_Sub2();
	    class525_sub38.index
		= (is.length - 7 - i_38_ * 8) * 339428471;
	    int i_40_ = class525_sub38.readUnsignedShort((byte) 15);
	    int i_41_ = class525_sub38.readUnsignedShort((byte) 123);
	    int i_42_ = (class525_sub38.readUnsignedByte(2115396596) & 0xff) + 1;
	    for (int i_43_ = 0; i_43_ < i_38_; i_43_++)
		class173_sub2s[i_43_].anInt9620
		    = class525_sub38.readUnsignedShort((byte) 72);
	    for (int i_44_ = 0; i_44_ < i_38_; i_44_++)
		class173_sub2s[i_44_].anInt9621
		    = class525_sub38.readUnsignedShort((byte) 60);
	    for (int i_45_ = 0; i_45_ < i_38_; i_45_++)
		class173_sub2s[i_45_].anInt9625
		    = class525_sub38.readUnsignedShort((byte) 63);
	    for (int i_46_ = 0; i_46_ < i_38_; i_46_++)
		class173_sub2s[i_46_].anInt9618
		    = class525_sub38.readUnsignedShort((byte) 101);
	    for (int i_47_ = 0; i_47_ < i_38_; i_47_++) {
		Class173_Sub2 class173_sub2 = class173_sub2s[i_47_];
		class173_sub2.anInt9623 = (i_40_ - class173_sub2.anInt9625
					   - class173_sub2.anInt9620);
		class173_sub2.anInt9619 = (i_41_ - class173_sub2.anInt9618
					   - class173_sub2.anInt9621);
	    }
	    class525_sub38.index
		= (is.length - 7 - i_38_ * 8 - (i_42_ - 1) * 3) * 339428471;
	    int[] is_48_ = new int[i_42_];
	    for (int i_49_ = 1; i_49_ < i_42_; i_49_++) {
		is_48_[i_49_] = class525_sub38.method16834(-1994884458);
		if (is_48_[i_49_] == 0)
		    is_48_[i_49_] = 1;
	    }
	    for (int i_50_ = 0; i_50_ < i_38_; i_50_++)
		class173_sub2s[i_50_].anIntArray9624 = is_48_;
	    class525_sub38.index = 0;
	    for (int i_51_ = 0; i_51_ < i_38_; i_51_++) {
		Class173_Sub2 class173_sub2 = class173_sub2s[i_51_];
		int i_52_ = class173_sub2.anInt9625 * class173_sub2.anInt9618;
		class173_sub2.aByteArray9622 = new byte[i_52_];
		int i_53_ = class525_sub38.readUnsignedByte(68366918);
		if ((i_53_ & 0x2) == 0) {
		    if ((i_53_ & 0x1) == 0) {
			for (int i_54_ = 0; i_54_ < i_52_; i_54_++)
			    class173_sub2.aByteArray9622[i_54_]
				= class525_sub38.readByte(-1150098071);
		    } else {
			for (int i_55_ = 0; i_55_ < class173_sub2.anInt9625;
			     i_55_++) {
			    for (int i_56_ = 0;
				 i_56_ < class173_sub2.anInt9618; i_56_++)
				class173_sub2.aByteArray9622
				    [i_55_ + i_56_ * class173_sub2.anInt9625]
				    = class525_sub38.readByte(-1150098071);
			}
		    }
		} else {
		    boolean bool = false;
		    class173_sub2.aByteArray9626 = new byte[i_52_];
		    if ((i_53_ & 0x1) == 0) {
			for (int i_57_ = 0; i_57_ < i_52_; i_57_++)
			    class173_sub2.aByteArray9622[i_57_]
				= class525_sub38.readByte(-1150098071);
			for (int i_58_ = 0; i_58_ < i_52_; i_58_++) {
			    byte i_59_
				= (class173_sub2.aByteArray9626[i_58_]
				   = class525_sub38.readByte(-1150098071));
			    bool = bool | i_59_ != -1;
			}
		    } else {
			for (int i_60_ = 0; i_60_ < class173_sub2.anInt9625;
			     i_60_++) {
			    for (int i_61_ = 0;
				 i_61_ < class173_sub2.anInt9618; i_61_++)
				class173_sub2.aByteArray9622
				    [i_60_ + i_61_ * class173_sub2.anInt9625]
				    = class525_sub38.readByte(-1150098071);
			}
			for (int i_62_ = 0; i_62_ < class173_sub2.anInt9625;
			     i_62_++) {
			    for (int i_63_ = 0;
				 i_63_ < class173_sub2.anInt9618; i_63_++) {
				byte i_64_
				    = (class173_sub2.aByteArray9626
					   [i_62_ + i_63_ * (class173_sub2
							     .anInt9625)]
				       = class525_sub38
					     .readByte(-1150098071));
				bool = bool | i_64_ != -1;
			    }
			}
		    }
		    if (!bool)
			class173_sub2.aByteArray9626 = null;
		}
	    }
	    return class173_sub2s;
	}
	Class173_Sub1[] class173_sub1s = new Class173_Sub1[i_38_];
	class525_sub38.index = 0;
	int i_65_ = class525_sub38.readUnsignedByte(480137750);
	if (i_65_ == 0) {
	    boolean bool = class525_sub38.readUnsignedByte(1202885207) == 1;
	    int i_66_ = class525_sub38.readUnsignedShort((byte) 11);
	    int i_67_ = class525_sub38.readUnsignedShort((byte) 32);
	    for (int i_68_ = 0; i_68_ < i_38_; i_68_++) {
		int[] is_69_ = new int[i_66_ * i_67_];
		for (int i_70_ = 0; i_70_ < i_66_ * i_67_; i_70_++) {
		    is_69_[i_70_]
			= ~0xffffff | class525_sub38.method16834(-1994884458);
		    if (is_69_[i_70_] == -65281)
			is_69_[i_70_] = 0;
		}
		if (bool) {
		    for (int i_71_ = 0; i_71_ < i_66_ * i_67_; i_71_++) {
			is_69_[i_71_] &= 0xffffff;
			is_69_[i_71_]
			    |= class525_sub38.readUnsignedByte(1296291240) << 24;
		    }
		}
		class173_sub1s[i_68_]
		    = new Class173_Sub1(i_66_, i_67_, is_69_);
	    }
	} else {
	    if (i_65_ == 1)
		throw new UnsupportedOperationException();
	    throw new RuntimeException();
	}
	return class173_sub1s;
    }
    
    public static Class173[] method3671(JS5 class458, int i) {
	byte[] is = class458.getTextureData(i, 1862938473);
	if (is == null)
	    return null;
	return method3670(is);
    }
    
    public static Class173 method3672(JS5 class458, int i) {
	byte[] is = class458.getTextureData(i, 1306127148);
	if (is == null)
	    return null;
	return method3670(is)[0];
    }
    
    public static Class173 method3673(JS5 class458, int i, int i_72_) {
	byte[] is = class458.getFile(i, i_72_, 1472170919);
	if (is == null)
	    return null;
	return method3670(is)[0];
    }
    
    public static Class173[] method3674(JS5 class458, int i, int i_73_) {
	byte[] is = class458.getFile(i, i_73_, 1684305058);
	if (is == null)
	    return null;
	return method3670(is);
    }
    
    public static Class173 method3675(JS5 class458, int i, int i_74_) {
	byte[] is = class458.getFile(i, i_74_, 1458969370);
	if (is == null)
	    return null;
	return method3670(is)[0];
    }
    
    public static Class173 method3676(JS5 class458, int i) {
	byte[] is = class458.getTextureData(i, 1946932196);
	if (is == null)
	    return null;
	return method3670(is)[0];
    }
    
    public static Class173 method3677(JS5 class458, int i) {
	byte[] is = class458.getTextureData(i, 1736625876);
	if (is == null)
	    return null;
	return method3670(is)[0];
    }
    
    public static Class173 method3678(JS5 class458, int i, int i_75_) {
	byte[] is = class458.getFile(i, i_75_, 561256124);
	if (is == null)
	    return null;
	return method3670(is)[0];
    }
    
    public static Class173[] method3679(JS5 class458, int i, int i_76_) {
	byte[] is = class458.getFile(i, i_76_, 1301512537);
	if (is == null)
	    return null;
	return method3670(is);
    }
    
    public static Class173[] method3680(JS5 class458, int i) {
	byte[] is = class458.getTextureData(i, 1807018234);
	if (is == null)
	    return null;
	return method3670(is);
    }
    
    public static Class173[] method3681(byte[] is) {
	RSBuffer class525_sub38 = new RSBuffer(is);
	class525_sub38.index = (is.length - 2) * 339428471;
	int i = class525_sub38.readUnsignedShort((byte) 95);
	int i_77_ = i >> 15;
	int i_78_ = i & 0x7fff;
	if (i_77_ == 0) {
	    Class173_Sub2[] class173_sub2s = new Class173_Sub2[i_78_];
	    for (int i_79_ = 0; i_79_ < i_78_; i_79_++)
		class173_sub2s[i_79_] = new Class173_Sub2();
	    class525_sub38.index
		= (is.length - 7 - i_78_ * 8) * 339428471;
	    int i_80_ = class525_sub38.readUnsignedShort((byte) 103);
	    int i_81_ = class525_sub38.readUnsignedShort((byte) 86);
	    int i_82_ = (class525_sub38.readUnsignedByte(1526921980) & 0xff) + 1;
	    for (int i_83_ = 0; i_83_ < i_78_; i_83_++)
		class173_sub2s[i_83_].anInt9620
		    = class525_sub38.readUnsignedShort((byte) 91);
	    for (int i_84_ = 0; i_84_ < i_78_; i_84_++)
		class173_sub2s[i_84_].anInt9621
		    = class525_sub38.readUnsignedShort((byte) 59);
	    for (int i_85_ = 0; i_85_ < i_78_; i_85_++)
		class173_sub2s[i_85_].anInt9625
		    = class525_sub38.readUnsignedShort((byte) 69);
	    for (int i_86_ = 0; i_86_ < i_78_; i_86_++)
		class173_sub2s[i_86_].anInt9618
		    = class525_sub38.readUnsignedShort((byte) 111);
	    for (int i_87_ = 0; i_87_ < i_78_; i_87_++) {
		Class173_Sub2 class173_sub2 = class173_sub2s[i_87_];
		class173_sub2.anInt9623 = (i_80_ - class173_sub2.anInt9625
					   - class173_sub2.anInt9620);
		class173_sub2.anInt9619 = (i_81_ - class173_sub2.anInt9618
					   - class173_sub2.anInt9621);
	    }
	    class525_sub38.index
		= (is.length - 7 - i_78_ * 8 - (i_82_ - 1) * 3) * 339428471;
	    int[] is_88_ = new int[i_82_];
	    for (int i_89_ = 1; i_89_ < i_82_; i_89_++) {
		is_88_[i_89_] = class525_sub38.method16834(-1994884458);
		if (is_88_[i_89_] == 0)
		    is_88_[i_89_] = 1;
	    }
	    for (int i_90_ = 0; i_90_ < i_78_; i_90_++)
		class173_sub2s[i_90_].anIntArray9624 = is_88_;
	    class525_sub38.index = 0;
	    for (int i_91_ = 0; i_91_ < i_78_; i_91_++) {
		Class173_Sub2 class173_sub2 = class173_sub2s[i_91_];
		int i_92_ = class173_sub2.anInt9625 * class173_sub2.anInt9618;
		class173_sub2.aByteArray9622 = new byte[i_92_];
		int i_93_ = class525_sub38.readUnsignedByte(696955493);
		if ((i_93_ & 0x2) == 0) {
		    if ((i_93_ & 0x1) == 0) {
			for (int i_94_ = 0; i_94_ < i_92_; i_94_++)
			    class173_sub2.aByteArray9622[i_94_]
				= class525_sub38.readByte(-1150098071);
		    } else {
			for (int i_95_ = 0; i_95_ < class173_sub2.anInt9625;
			     i_95_++) {
			    for (int i_96_ = 0;
				 i_96_ < class173_sub2.anInt9618; i_96_++)
				class173_sub2.aByteArray9622
				    [i_95_ + i_96_ * class173_sub2.anInt9625]
				    = class525_sub38.readByte(-1150098071);
			}
		    }
		} else {
		    boolean bool = false;
		    class173_sub2.aByteArray9626 = new byte[i_92_];
		    if ((i_93_ & 0x1) == 0) {
			for (int i_97_ = 0; i_97_ < i_92_; i_97_++)
			    class173_sub2.aByteArray9622[i_97_]
				= class525_sub38.readByte(-1150098071);
			for (int i_98_ = 0; i_98_ < i_92_; i_98_++) {
			    byte i_99_
				= (class173_sub2.aByteArray9626[i_98_]
				   = class525_sub38.readByte(-1150098071));
			    bool = bool | i_99_ != -1;
			}
		    } else {
			for (int i_100_ = 0; i_100_ < class173_sub2.anInt9625;
			     i_100_++) {
			    for (int i_101_ = 0;
				 i_101_ < class173_sub2.anInt9618; i_101_++)
				class173_sub2.aByteArray9622
				    [i_100_ + i_101_ * class173_sub2.anInt9625]
				    = class525_sub38.readByte(-1150098071);
			}
			for (int i_102_ = 0; i_102_ < class173_sub2.anInt9625;
			     i_102_++) {
			    for (int i_103_ = 0;
				 i_103_ < class173_sub2.anInt9618; i_103_++) {
				byte i_104_
				    = (class173_sub2.aByteArray9626
					   [i_102_ + i_103_ * (class173_sub2
							       .anInt9625)]
				       = class525_sub38
					     .readByte(-1150098071));
				bool = bool | i_104_ != -1;
			    }
			}
		    }
		    if (!bool)
			class173_sub2.aByteArray9626 = null;
		}
	    }
	    return class173_sub2s;
	}
	Class173_Sub1[] class173_sub1s = new Class173_Sub1[i_78_];
	class525_sub38.index = 0;
	int i_105_ = class525_sub38.readUnsignedByte(1294915095);
	if (i_105_ == 0) {
	    boolean bool = class525_sub38.readUnsignedByte(1875327107) == 1;
	    int i_106_ = class525_sub38.readUnsignedShort((byte) 48);
	    int i_107_ = class525_sub38.readUnsignedShort((byte) 30);
	    for (int i_108_ = 0; i_108_ < i_78_; i_108_++) {
		int[] is_109_ = new int[i_106_ * i_107_];
		for (int i_110_ = 0; i_110_ < i_106_ * i_107_; i_110_++) {
		    is_109_[i_110_]
			= ~0xffffff | class525_sub38.method16834(-1994884458);
		    if (is_109_[i_110_] == -65281)
			is_109_[i_110_] = 0;
		}
		if (bool) {
		    for (int i_111_ = 0; i_111_ < i_106_ * i_107_; i_111_++) {
			is_109_[i_111_] &= 0xffffff;
			is_109_[i_111_]
			    |= class525_sub38.readUnsignedByte(1728468782) << 24;
		    }
		}
		class173_sub1s[i_108_]
		    = new Class173_Sub1(i_106_, i_107_, is_109_);
	    }
	} else {
	    if (i_105_ == 1)
		throw new UnsupportedOperationException();
	    throw new RuntimeException();
	}
	return class173_sub1s;
    }
    
    public static Class173 method3682(JS5 class458, int i, int i_112_) {
	byte[] is = class458.getFile(i, i_112_, 1067954951);
	if (is == null)
	    return null;
	return method3670(is)[0];
    }
}
