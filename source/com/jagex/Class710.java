/* Class710 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public final class Class710
{
    static final int anInt8823 = 6;
    static final int anInt8824 = 4096;
    static final int anInt8825 = 23;
    static final int anInt8826 = 0;
    static final int anInt8827 = 1;
    static final int anInt8828 = 16;
    static final int anInt8829 = 50;
    static Class711 aClass711_8830 = new Class711();
    
    static void method14429(Class711 class711) {
	class711.anInt8855 = 0;
	for (int i = 0; i < 256; i++) {
	    if (class711.aBoolArray8856[i]) {
		class711.aByteArray8858[class711.anInt8855 * -1391632771]
		    = (byte) i;
		class711.anInt8855 += 411405013;
	    }
	}
    }
    
    public static int method14430(byte[] is, int i, byte[] is_0_, int i_1_,
				  int i_2_) {
	synchronized (aClass711_8830) {
	    aClass711_8830.aByteArray8837 = is_0_;
	    aClass711_8830.anInt8838 = i_2_ * 1776574321;
	    aClass711_8830.aByteArray8840 = is;
	    aClass711_8830.anInt8862 = 0;
	    aClass711_8830.anInt8852 = i * -281801883;
	    aClass711_8830.anInt8847 = 0;
	    aClass711_8830.anInt8846 = 0;
	    aClass711_8830.anInt8839 = 0;
	    aClass711_8830.anInt8843 = 0;
	    method14432(aClass711_8830);
	    i -= aClass711_8830.anInt8852 * -1401999763;
	    aClass711_8830.aByteArray8837 = null;
	    aClass711_8830.aByteArray8840 = null;
	    int i_3_ = i;
	    return i_3_;
	}
    }
    
    static int method14431(int i, Class711 class711) {
	for (;;) {
	    if (class711.anInt8847 * 1490360251 >= i) {
		int i_4_ = ((class711.anInt8846 * -693351113
			     >> class711.anInt8847 * 1490360251 - i)
			    & (1 << i) - 1);
		class711.anInt8847 -= i * -1866721933;
		return i_4_;
	    }
	    class711.anInt8846
		= (class711.anInt8846 * -693351113 << 8
		   | (class711.aByteArray8837[class711.anInt8838 * 1601077649]
		      & 0xff)) * -1654982521;
	    class711.anInt8847 += -2048873576;
	    class711.anInt8838 += 1776574321;
	    class711.anInt8839 += 1669697823;
	    if (class711.anInt8839 * -222778657 == 0) {
		/* empty */
	    }
	}
    }
    
    static void method14432(Class711 class711) {
	boolean bool = false;
	boolean bool_5_ = false;
	boolean bool_6_ = false;
	boolean bool_7_ = false;
	boolean bool_8_ = false;
	boolean bool_9_ = false;
	boolean bool_10_ = false;
	boolean bool_11_ = false;
	boolean bool_12_ = false;
	boolean bool_13_ = false;
	boolean bool_14_ = false;
	boolean bool_15_ = false;
	boolean bool_16_ = false;
	boolean bool_17_ = false;
	boolean bool_18_ = false;
	boolean bool_19_ = false;
	boolean bool_20_ = false;
	boolean bool_21_ = false;
	int i = 0;
	int[] is = null;
	int[] is_22_ = null;
	int[] is_23_ = null;
	class711.anInt8848 = -365542317;
	if (Class16.anIntArray188 == null)
	    Class16.anIntArray188 = new int[class711.anInt8848 * -1687450912];
	boolean bool_24_ = true;
	while (bool_24_) {
	    byte i_25_ = method14433(class711);
	    if (i_25_ == 23)
		break;
	    i_25_ = method14433(class711);
	    i_25_ = method14433(class711);
	    i_25_ = method14433(class711);
	    i_25_ = method14433(class711);
	    i_25_ = method14433(class711);
	    i_25_ = method14433(class711);
	    i_25_ = method14433(class711);
	    i_25_ = method14433(class711);
	    i_25_ = method14433(class711);
	    i_25_ = method14434(class711);
	    if (i_25_ == 0) {
		/* empty */
	    }
	    class711.anInt8849 = 0;
	    int i_26_ = method14433(class711);
	    class711.anInt8849 = (class711.anInt8849 * -918230623 << 8
				  | i_26_ & 0xff) * -1646970271;
	    i_26_ = method14433(class711);
	    class711.anInt8849 = (class711.anInt8849 * -918230623 << 8
				  | i_26_ & 0xff) * -1646970271;
	    i_26_ = method14433(class711);
	    class711.anInt8849 = (class711.anInt8849 * -918230623 << 8
				  | i_26_ & 0xff) * -1646970271;
	    for (int i_27_ = 0; i_27_ < 16; i_27_++) {
		i_25_ = method14434(class711);
		if (i_25_ == 1)
		    class711.aBoolArray8857[i_27_] = true;
		else
		    class711.aBoolArray8857[i_27_] = false;
	    }
	    for (int i_28_ = 0; i_28_ < 256; i_28_++)
		class711.aBoolArray8856[i_28_] = false;
	    for (int i_29_ = 0; i_29_ < 16; i_29_++) {
		if (class711.aBoolArray8857[i_29_]) {
		    for (int i_30_ = 0; i_30_ < 16; i_30_++) {
			i_25_ = method14434(class711);
			if (i_25_ == 1)
			    class711.aBoolArray8856[i_29_ * 16 + i_30_] = true;
		    }
		}
	    }
	    method14429(class711);
	    int i_31_ = class711.anInt8855 * -1391632771 + 2;
	    int i_32_ = method14431(3, class711);
	    int i_33_ = method14431(15, class711);
	    for (int i_34_ = 0; i_34_ < i_33_; i_34_++) {
		int i_35_ = 0;
		for (;;) {
		    i_25_ = method14434(class711);
		    if (i_25_ == 0)
			break;
		    i_35_++;
		}
		class711.aByteArray8836[i_34_] = (byte) i_35_;
	    }
	    byte[] is_36_ = new byte[6];
	    for (byte i_37_ = 0; i_37_ < i_32_; i_37_++)
		is_36_[i_37_] = i_37_;
	    for (int i_38_ = 0; i_38_ < i_33_; i_38_++) {
		byte i_39_ = class711.aByteArray8836[i_38_];
		byte i_40_ = is_36_[i_39_];
		for (/**/; i_39_ > 0; i_39_--)
		    is_36_[i_39_] = is_36_[i_39_ - 1];
		is_36_[0] = i_40_;
		class711.aByteArray8835[i_38_] = i_40_;
	    }
	    for (int i_41_ = 0; i_41_ < i_32_; i_41_++) {
		int i_42_ = method14431(5, class711);
		for (int i_43_ = 0; i_43_ < i_31_; i_43_++) {
		    for (;;) {
			i_25_ = method14434(class711);
			if (i_25_ == 0)
			    break;
			i_25_ = method14434(class711);
			if (i_25_ == 0)
			    i_42_++;
			else
			    i_42_--;
		    }
		    class711.aByteArrayArray8842[i_41_][i_43_] = (byte) i_42_;
		}
	    }
	    for (int i_44_ = 0; i_44_ < i_32_; i_44_++) {
		int i_45_ = 32;
		byte i_46_ = 0;
		for (int i_47_ = 0; i_47_ < i_31_; i_47_++) {
		    if (class711.aByteArrayArray8842[i_44_][i_47_] > i_46_)
			i_46_ = class711.aByteArrayArray8842[i_44_][i_47_];
		    if (class711.aByteArrayArray8842[i_44_][i_47_] < i_45_)
			i_45_ = class711.aByteArrayArray8842[i_44_][i_47_];
		}
		method14436(class711.anIntArrayArray8864[i_44_],
			    class711.anIntArrayArray8865[i_44_],
			    class711.anIntArrayArray8866[i_44_],
			    class711.aByteArrayArray8842[i_44_], i_45_, i_46_,
			    i_31_);
		class711.anIntArray8867[i_44_] = i_45_;
	    }
	    int i_48_ = class711.anInt8855 * -1391632771 + 1;
	    int i_49_ = -1;
	    int i_50_ = 0;
	    for (int i_51_ = 0; i_51_ <= 255; i_51_++)
		class711.anIntArray8841[i_51_] = 0;
	    int i_52_ = 4095;
	    for (int i_53_ = 15; i_53_ >= 0; i_53_--) {
		for (int i_54_ = 15; i_54_ >= 0; i_54_--) {
		    class711.aByteArray8859[i_52_]
			= (byte) (i_53_ * 16 + i_54_);
		    i_52_--;
		}
		class711.anIntArray8860[i_53_] = i_52_ + 1;
	    }
	    int i_55_ = 0;
	    if (i_50_ == 0) {
		i_49_++;
		i_50_ = 50;
		byte i_56_ = class711.aByteArray8835[i_49_];
		i = class711.anIntArray8867[i_56_];
		is = class711.anIntArrayArray8864[i_56_];
		is_23_ = class711.anIntArrayArray8866[i_56_];
		is_22_ = class711.anIntArrayArray8865[i_56_];
	    }
	    i_50_--;
	    int i_57_ = i;
	    int i_58_;
	    int i_59_;
	    for (i_59_ = method14431(i_57_, class711); i_59_ > is[i_57_];
		 i_59_ = i_59_ << 1 | i_58_) {
		i_57_++;
		i_58_ = method14434(class711);
	    }
	    int i_60_ = is_23_[i_59_ - is_22_[i_57_]];
	    while (i_60_ != i_48_) {
		if (i_60_ == 0 || i_60_ == 1) {
		    int i_61_ = -1;
		    int i_62_ = 1;
		    do {
			if (i_60_ == 0)
			    i_61_ += 1 * i_62_;
			else if (i_60_ == 1)
			    i_61_ += 2 * i_62_;
			i_62_ *= 2;
			if (i_50_ == 0) {
			    i_49_++;
			    i_50_ = 50;
			    byte i_63_ = class711.aByteArray8835[i_49_];
			    i = class711.anIntArray8867[i_63_];
			    is = class711.anIntArrayArray8864[i_63_];
			    is_23_ = class711.anIntArrayArray8866[i_63_];
			    is_22_ = class711.anIntArrayArray8865[i_63_];
			}
			i_50_--;
			i_57_ = i;
			for (i_59_ = method14431(i_57_, class711);
			     i_59_ > is[i_57_]; i_59_ = i_59_ << 1 | i_58_) {
			    i_57_++;
			    i_58_ = method14434(class711);
			}
			i_60_ = is_23_[i_59_ - is_22_[i_57_]];
		    } while (i_60_ == 0 || i_60_ == 1);
		    i_61_++;
		    i_26_ = (class711.aByteArray8858
			     [(class711.aByteArray8859
			       [class711.anIntArray8860[0]]) & 0xff]);
		    class711.anIntArray8841[i_26_ & 0xff] += i_61_;
		    for (/**/; i_61_ > 0; i_61_--) {
			Class16.anIntArray188[i_55_] = i_26_ & 0xff;
			i_55_++;
		    }
		} else {
		    int i_64_ = i_60_ - 1;
		    if (i_64_ < 16) {
			int i_65_ = class711.anIntArray8860[0];
			i_25_ = class711.aByteArray8859[i_65_ + i_64_];
			for (/**/; i_64_ > 3; i_64_ -= 4) {
			    int i_66_ = i_65_ + i_64_;
			    class711.aByteArray8859[i_66_]
				= class711.aByteArray8859[i_66_ - 1];
			    class711.aByteArray8859[i_66_ - 1]
				= class711.aByteArray8859[i_66_ - 2];
			    class711.aByteArray8859[i_66_ - 2]
				= class711.aByteArray8859[i_66_ - 3];
			    class711.aByteArray8859[i_66_ - 3]
				= class711.aByteArray8859[i_66_ - 4];
			}
			for (/**/; i_64_ > 0; i_64_--)
			    class711.aByteArray8859[i_65_ + i_64_]
				= class711.aByteArray8859[i_65_ + i_64_ - 1];
			class711.aByteArray8859[i_65_] = i_25_;
		    } else {
			int i_67_ = i_64_ / 16;
			int i_68_ = i_64_ % 16;
			int i_69_ = class711.anIntArray8860[i_67_] + i_68_;
			i_25_ = class711.aByteArray8859[i_69_];
			for (/**/; i_69_ > class711.anIntArray8860[i_67_];
			     i_69_--)
			    class711.aByteArray8859[i_69_]
				= class711.aByteArray8859[i_69_ - 1];
			class711.anIntArray8860[i_67_]++;
			for (/**/; i_67_ > 0; i_67_--) {
			    class711.anIntArray8860[i_67_]--;
			    class711.aByteArray8859[(class711.anIntArray8860
						     [i_67_])]
				= (class711.aByteArray8859
				   [(class711.anIntArray8860[i_67_ - 1] + 16
				     - 1)]);
			}
			class711.anIntArray8860[0]--;
			class711.aByteArray8859[class711.anIntArray8860[0]]
			    = i_25_;
			if (class711.anIntArray8860[0] == 0) {
			    i_52_ = 4095;
			    for (int i_70_ = 15; i_70_ >= 0; i_70_--) {
				for (int i_71_ = 15; i_71_ >= 0; i_71_--) {
				    class711.aByteArray8859[i_52_]
					= (class711.aByteArray8859
					   [(class711.anIntArray8860[i_70_]
					     + i_71_)]);
				    i_52_--;
				}
				class711.anIntArray8860[i_70_] = i_52_ + 1;
			    }
			}
		    }
		    class711.anIntArray8841
			[class711.aByteArray8858[i_25_ & 0xff] & 0xff]++;
		    Class16.anIntArray188[i_55_]
			= class711.aByteArray8858[i_25_ & 0xff] & 0xff;
		    i_55_++;
		    if (i_50_ == 0) {
			i_49_++;
			i_50_ = 50;
			byte i_72_ = class711.aByteArray8835[i_49_];
			i = class711.anIntArray8867[i_72_];
			is = class711.anIntArrayArray8864[i_72_];
			is_23_ = class711.anIntArrayArray8866[i_72_];
			is_22_ = class711.anIntArrayArray8865[i_72_];
		    }
		    i_50_--;
		    i_57_ = i;
		    for (i_59_ = method14431(i_57_, class711);
			 i_59_ > is[i_57_]; i_59_ = i_59_ << 1 | i_58_) {
			i_57_++;
			i_58_ = method14434(class711);
		    }
		    i_60_ = is_23_[i_59_ - is_22_[i_57_]];
		}
	    }
	    class711.anInt8845 = 0;
	    class711.aByte8850 = (byte) 0;
	    class711.anIntArray8854[0] = 0;
	    for (int i_73_ = 1; i_73_ <= 256; i_73_++)
		class711.anIntArray8854[i_73_]
		    = class711.anIntArray8841[i_73_ - 1];
	    for (int i_74_ = 1; i_74_ <= 256; i_74_++)
		class711.anIntArray8854[i_74_]
		    += class711.anIntArray8854[i_74_ - 1];
	    for (int i_75_ = 0; i_75_ < i_55_; i_75_++) {
		i_26_ = (byte) (Class16.anIntArray188[i_75_] & 0xff);
		Class16.anIntArray188[class711.anIntArray8854[i_26_ & 0xff]]
		    |= i_75_ << 8;
		class711.anIntArray8854[i_26_ & 0xff]++;
	    }
	    class711.anInt8831
		= (Class16.anIntArray188[class711.anInt8849 * -918230623]
		   >> 8) * -1167232797;
	    class711.anInt8853 = 0;
	    class711.anInt8831
		= (Class16.anIntArray188[class711.anInt8831 * 1034900683]
		   * -1167232797);
	    class711.anInt8851
		= (byte) (class711.anInt8831 * 1034900683 & 0xff) * 48617223;
	    Class711 class711_76_;
	    (class711_76_ = class711).anInt8831
		= (class711_76_.anInt8831 * 1034900683 >> 8) * -1167232797;
	    class711.anInt8853 += 1686127717;
	    class711.anInt8832 = i_55_ * -1469642121;
	    method14440(class711);
	    if ((class711.anInt8853 * 1866911085
		 == class711.anInt8832 * -1085149369 + 1)
		&& class711.anInt8845 * -1507901393 == 0)
		bool_24_ = true;
	    else
		bool_24_ = false;
	}
    }
    
    static byte method14433(Class711 class711) {
	return (byte) method14431(8, class711);
    }
    
    static byte method14434(Class711 class711) {
	return (byte) method14431(1, class711);
    }
    
    static void method14435(Class711 class711) {
	byte i = class711.aByte8850;
	int i_77_ = class711.anInt8845 * -1507901393;
	int i_78_ = class711.anInt8853 * 1866911085;
	int i_79_ = class711.anInt8851 * -1314527561;
	int[] is = Class16.anIntArray188;
	int i_80_ = class711.anInt8831 * 1034900683;
	byte[] is_81_ = class711.aByteArray8840;
	int i_82_ = class711.anInt8862 * -1253859847;
	int i_83_ = class711.anInt8852 * -1401999763;
	int i_84_ = i_83_;
	int i_85_ = class711.anInt8832 * -1085149369 + 1;
    while_19_:
	for (;;) {
	    if (i_77_ > 0) {
		for (;;) {
		    if (i_83_ == 0)
			break while_19_;
		    if (i_77_ == 1)
			break;
		    is_81_[i_82_] = i;
		    i_77_--;
		    i_82_++;
		    i_83_--;
		}
		if (i_83_ == 0) {
		    i_77_ = 1;
		    break;
		}
		is_81_[i_82_] = i;
		i_82_++;
		i_83_--;
	    }
	    for (;;) {
		if (i_78_ == i_85_) {
		    i_77_ = 0;
		    break while_19_;
		}
		i = (byte) i_79_;
		i_80_ = is[i_80_];
		int i_86_ = (byte) i_80_;
		i_80_ >>= 8;
		i_78_++;
		if (i_86_ != i_79_) {
		    i_79_ = i_86_;
		    if (i_83_ == 0) {
			i_77_ = 1;
			break while_19_;
		    }
		    is_81_[i_82_] = i;
		    i_82_++;
		    i_83_--;
		} else {
		    if (i_78_ != i_85_)
			break;
		    if (i_83_ == 0) {
			i_77_ = 1;
			break while_19_;
		    }
		    is_81_[i_82_] = i;
		    i_82_++;
		    i_83_--;
		}
	    }
	    i_77_ = 2;
	    i_80_ = is[i_80_];
	    int i_87_ = (byte) i_80_;
	    i_80_ >>= 8;
	    if (++i_78_ != i_85_) {
		if (i_87_ != i_79_)
		    i_79_ = i_87_;
		else {
		    i_77_ = 3;
		    i_80_ = is[i_80_];
		    i_87_ = (byte) i_80_;
		    i_80_ >>= 8;
		    if (++i_78_ != i_85_) {
			if (i_87_ != i_79_)
			    i_79_ = i_87_;
			else {
			    i_80_ = is[i_80_];
			    i_87_ = (byte) i_80_;
			    i_80_ >>= 8;
			    i_78_++;
			    i_77_ = (i_87_ & 0xff) + 4;
			    i_80_ = is[i_80_];
			    i_79_ = (byte) i_80_;
			    i_80_ >>= 8;
			    i_78_++;
			}
		    }
		}
	    }
	}
	int i_88_ = class711.anInt8843 * -1792269133;
	class711.anInt8843 += (i_84_ - i_83_) * -945345925;
	if (class711.anInt8843 * -1792269133 >= i_88_) {
	    /* empty */
	}
	class711.aByte8850 = i;
	class711.anInt8845 = i_77_ * 1776682703;
	class711.anInt8853 = i_78_ * 1686127717;
	class711.anInt8851 = i_79_ * 48617223;
	Class16.anIntArray188 = is;
	class711.anInt8831 = i_80_ * -1167232797;
	class711.aByteArray8840 = is_81_;
	class711.anInt8862 = i_82_ * -461073335;
	class711.anInt8852 = i_83_ * -281801883;
    }
    
    Class710() throws Throwable {
	throw new Error();
    }
    
    static void method14436(int[] is, int[] is_89_, int[] is_90_,
			    byte[] is_91_, int i, int i_92_, int i_93_) {
	int i_94_ = 0;
	for (int i_95_ = i; i_95_ <= i_92_; i_95_++) {
	    for (int i_96_ = 0; i_96_ < i_93_; i_96_++) {
		if (is_91_[i_96_] == i_95_) {
		    is_90_[i_94_] = i_96_;
		    i_94_++;
		}
	    }
	}
	for (int i_97_ = 0; i_97_ < 23; i_97_++)
	    is_89_[i_97_] = 0;
	for (int i_98_ = 0; i_98_ < i_93_; i_98_++)
	    is_89_[is_91_[i_98_] + 1]++;
	for (int i_99_ = 1; i_99_ < 23; i_99_++)
	    is_89_[i_99_] += is_89_[i_99_ - 1];
	for (int i_100_ = 0; i_100_ < 23; i_100_++)
	    is[i_100_] = 0;
	int i_101_ = 0;
	for (int i_102_ = i; i_102_ <= i_92_; i_102_++) {
	    i_101_ += is_89_[i_102_ + 1] - is_89_[i_102_];
	    is[i_102_] = i_101_ - 1;
	    i_101_ <<= 1;
	}
	for (int i_103_ = i + 1; i_103_ <= i_92_; i_103_++)
	    is_89_[i_103_] = (is[i_103_ - 1] + 1 << 1) - is_89_[i_103_];
    }
    
    static void method14437(Class711 class711) {
	class711.anInt8855 = 0;
	for (int i = 0; i < 256; i++) {
	    if (class711.aBoolArray8856[i]) {
		class711.aByteArray8858[class711.anInt8855 * -1391632771]
		    = (byte) i;
		class711.anInt8855 += 411405013;
	    }
	}
    }
    
    static byte method14438(Class711 class711) {
	return (byte) method14431(8, class711);
    }
    
    static void method14439(Class711 class711) {
	byte i = class711.aByte8850;
	int i_104_ = class711.anInt8845 * -1507901393;
	int i_105_ = class711.anInt8853 * 1866911085;
	int i_106_ = class711.anInt8851 * -1314527561;
	int[] is = Class16.anIntArray188;
	int i_107_ = class711.anInt8831 * 1034900683;
	byte[] is_108_ = class711.aByteArray8840;
	int i_109_ = class711.anInt8862 * -1253859847;
	int i_110_ = class711.anInt8852 * -1401999763;
	int i_111_ = i_110_;
	int i_112_ = class711.anInt8832 * -1085149369 + 1;
    while_20_:
	for (;;) {
	    if (i_104_ > 0) {
		for (;;) {
		    if (i_110_ == 0)
			break while_20_;
		    if (i_104_ == 1)
			break;
		    is_108_[i_109_] = i;
		    i_104_--;
		    i_109_++;
		    i_110_--;
		}
		if (i_110_ == 0) {
		    i_104_ = 1;
		    break;
		}
		is_108_[i_109_] = i;
		i_109_++;
		i_110_--;
	    }
	    for (;;) {
		if (i_105_ == i_112_) {
		    i_104_ = 0;
		    break while_20_;
		}
		i = (byte) i_106_;
		i_107_ = is[i_107_];
		int i_113_ = (byte) i_107_;
		i_107_ >>= 8;
		i_105_++;
		if (i_113_ != i_106_) {
		    i_106_ = i_113_;
		    if (i_110_ == 0) {
			i_104_ = 1;
			break while_20_;
		    }
		    is_108_[i_109_] = i;
		    i_109_++;
		    i_110_--;
		} else {
		    if (i_105_ != i_112_)
			break;
		    if (i_110_ == 0) {
			i_104_ = 1;
			break while_20_;
		    }
		    is_108_[i_109_] = i;
		    i_109_++;
		    i_110_--;
		}
	    }
	    i_104_ = 2;
	    i_107_ = is[i_107_];
	    int i_114_ = (byte) i_107_;
	    i_107_ >>= 8;
	    if (++i_105_ != i_112_) {
		if (i_114_ != i_106_)
		    i_106_ = i_114_;
		else {
		    i_104_ = 3;
		    i_107_ = is[i_107_];
		    i_114_ = (byte) i_107_;
		    i_107_ >>= 8;
		    if (++i_105_ != i_112_) {
			if (i_114_ != i_106_)
			    i_106_ = i_114_;
			else {
			    i_107_ = is[i_107_];
			    i_114_ = (byte) i_107_;
			    i_107_ >>= 8;
			    i_105_++;
			    i_104_ = (i_114_ & 0xff) + 4;
			    i_107_ = is[i_107_];
			    i_106_ = (byte) i_107_;
			    i_107_ >>= 8;
			    i_105_++;
			}
		    }
		}
	    }
	}
	int i_115_ = class711.anInt8843 * -1792269133;
	class711.anInt8843 += (i_111_ - i_110_) * -945345925;
	if (class711.anInt8843 * -1792269133 >= i_115_) {
	    /* empty */
	}
	class711.aByte8850 = i;
	class711.anInt8845 = i_104_ * 1776682703;
	class711.anInt8853 = i_105_ * 1686127717;
	class711.anInt8851 = i_106_ * 48617223;
	Class16.anIntArray188 = is;
	class711.anInt8831 = i_107_ * -1167232797;
	class711.aByteArray8840 = is_108_;
	class711.anInt8862 = i_109_ * -461073335;
	class711.anInt8852 = i_110_ * -281801883;
    }
    
    static void method14440(Class711 class711) {
	byte i = class711.aByte8850;
	int i_116_ = class711.anInt8845 * -1507901393;
	int i_117_ = class711.anInt8853 * 1866911085;
	int i_118_ = class711.anInt8851 * -1314527561;
	int[] is = Class16.anIntArray188;
	int i_119_ = class711.anInt8831 * 1034900683;
	byte[] is_120_ = class711.aByteArray8840;
	int i_121_ = class711.anInt8862 * -1253859847;
	int i_122_ = class711.anInt8852 * -1401999763;
	int i_123_ = i_122_;
	int i_124_ = class711.anInt8832 * -1085149369 + 1;
    while_21_:
	for (;;) {
	    if (i_116_ > 0) {
		for (;;) {
		    if (i_122_ == 0)
			break while_21_;
		    if (i_116_ == 1)
			break;
		    is_120_[i_121_] = i;
		    i_116_--;
		    i_121_++;
		    i_122_--;
		}
		if (i_122_ == 0) {
		    i_116_ = 1;
		    break;
		}
		is_120_[i_121_] = i;
		i_121_++;
		i_122_--;
	    }
	    for (;;) {
		if (i_117_ == i_124_) {
		    i_116_ = 0;
		    break while_21_;
		}
		i = (byte) i_118_;
		i_119_ = is[i_119_];
		int i_125_ = (byte) i_119_;
		i_119_ >>= 8;
		i_117_++;
		if (i_125_ != i_118_) {
		    i_118_ = i_125_;
		    if (i_122_ == 0) {
			i_116_ = 1;
			break while_21_;
		    }
		    is_120_[i_121_] = i;
		    i_121_++;
		    i_122_--;
		} else {
		    if (i_117_ != i_124_)
			break;
		    if (i_122_ == 0) {
			i_116_ = 1;
			break while_21_;
		    }
		    is_120_[i_121_] = i;
		    i_121_++;
		    i_122_--;
		}
	    }
	    i_116_ = 2;
	    i_119_ = is[i_119_];
	    int i_126_ = (byte) i_119_;
	    i_119_ >>= 8;
	    if (++i_117_ != i_124_) {
		if (i_126_ != i_118_)
		    i_118_ = i_126_;
		else {
		    i_116_ = 3;
		    i_119_ = is[i_119_];
		    i_126_ = (byte) i_119_;
		    i_119_ >>= 8;
		    if (++i_117_ != i_124_) {
			if (i_126_ != i_118_)
			    i_118_ = i_126_;
			else {
			    i_119_ = is[i_119_];
			    i_126_ = (byte) i_119_;
			    i_119_ >>= 8;
			    i_117_++;
			    i_116_ = (i_126_ & 0xff) + 4;
			    i_119_ = is[i_119_];
			    i_118_ = (byte) i_119_;
			    i_119_ >>= 8;
			    i_117_++;
			}
		    }
		}
	    }
	}
	int i_127_ = class711.anInt8843 * -1792269133;
	class711.anInt8843 += (i_123_ - i_122_) * -945345925;
	if (class711.anInt8843 * -1792269133 >= i_127_) {
	    /* empty */
	}
	class711.aByte8850 = i;
	class711.anInt8845 = i_116_ * 1776682703;
	class711.anInt8853 = i_117_ * 1686127717;
	class711.anInt8851 = i_118_ * 48617223;
	Class16.anIntArray188 = is;
	class711.anInt8831 = i_119_ * -1167232797;
	class711.aByteArray8840 = is_120_;
	class711.anInt8862 = i_121_ * -461073335;
	class711.anInt8852 = i_122_ * -281801883;
    }
    
    static void method14441(Class711 class711) {
	boolean bool = false;
	boolean bool_128_ = false;
	boolean bool_129_ = false;
	boolean bool_130_ = false;
	boolean bool_131_ = false;
	boolean bool_132_ = false;
	boolean bool_133_ = false;
	boolean bool_134_ = false;
	boolean bool_135_ = false;
	boolean bool_136_ = false;
	boolean bool_137_ = false;
	boolean bool_138_ = false;
	boolean bool_139_ = false;
	boolean bool_140_ = false;
	boolean bool_141_ = false;
	boolean bool_142_ = false;
	boolean bool_143_ = false;
	boolean bool_144_ = false;
	int i = 0;
	int[] is = null;
	int[] is_145_ = null;
	int[] is_146_ = null;
	class711.anInt8848 = -365542317;
	if (Class16.anIntArray188 == null)
	    Class16.anIntArray188 = new int[class711.anInt8848 * -1687450912];
	boolean bool_147_ = true;
	while (bool_147_) {
	    byte i_148_ = method14433(class711);
	    if (i_148_ == 23)
		break;
	    i_148_ = method14433(class711);
	    i_148_ = method14433(class711);
	    i_148_ = method14433(class711);
	    i_148_ = method14433(class711);
	    i_148_ = method14433(class711);
	    i_148_ = method14433(class711);
	    i_148_ = method14433(class711);
	    i_148_ = method14433(class711);
	    i_148_ = method14433(class711);
	    i_148_ = method14434(class711);
	    if (i_148_ == 0) {
		/* empty */
	    }
	    class711.anInt8849 = 0;
	    int i_149_ = method14433(class711);
	    class711.anInt8849 = (class711.anInt8849 * -918230623 << 8
				  | i_149_ & 0xff) * -1646970271;
	    i_149_ = method14433(class711);
	    class711.anInt8849 = (class711.anInt8849 * -918230623 << 8
				  | i_149_ & 0xff) * -1646970271;
	    i_149_ = method14433(class711);
	    class711.anInt8849 = (class711.anInt8849 * -918230623 << 8
				  | i_149_ & 0xff) * -1646970271;
	    for (int i_150_ = 0; i_150_ < 16; i_150_++) {
		i_148_ = method14434(class711);
		if (i_148_ == 1)
		    class711.aBoolArray8857[i_150_] = true;
		else
		    class711.aBoolArray8857[i_150_] = false;
	    }
	    for (int i_151_ = 0; i_151_ < 256; i_151_++)
		class711.aBoolArray8856[i_151_] = false;
	    for (int i_152_ = 0; i_152_ < 16; i_152_++) {
		if (class711.aBoolArray8857[i_152_]) {
		    for (int i_153_ = 0; i_153_ < 16; i_153_++) {
			i_148_ = method14434(class711);
			if (i_148_ == 1)
			    class711.aBoolArray8856[i_152_ * 16 + i_153_]
				= true;
		    }
		}
	    }
	    method14429(class711);
	    int i_154_ = class711.anInt8855 * -1391632771 + 2;
	    int i_155_ = method14431(3, class711);
	    int i_156_ = method14431(15, class711);
	    for (int i_157_ = 0; i_157_ < i_156_; i_157_++) {
		int i_158_ = 0;
		for (;;) {
		    i_148_ = method14434(class711);
		    if (i_148_ == 0)
			break;
		    i_158_++;
		}
		class711.aByteArray8836[i_157_] = (byte) i_158_;
	    }
	    byte[] is_159_ = new byte[6];
	    for (byte i_160_ = 0; i_160_ < i_155_; i_160_++)
		is_159_[i_160_] = i_160_;
	    for (int i_161_ = 0; i_161_ < i_156_; i_161_++) {
		byte i_162_ = class711.aByteArray8836[i_161_];
		byte i_163_ = is_159_[i_162_];
		for (/**/; i_162_ > 0; i_162_--)
		    is_159_[i_162_] = is_159_[i_162_ - 1];
		is_159_[0] = i_163_;
		class711.aByteArray8835[i_161_] = i_163_;
	    }
	    for (int i_164_ = 0; i_164_ < i_155_; i_164_++) {
		int i_165_ = method14431(5, class711);
		for (int i_166_ = 0; i_166_ < i_154_; i_166_++) {
		    for (;;) {
			i_148_ = method14434(class711);
			if (i_148_ == 0)
			    break;
			i_148_ = method14434(class711);
			if (i_148_ == 0)
			    i_165_++;
			else
			    i_165_--;
		    }
		    class711.aByteArrayArray8842[i_164_][i_166_]
			= (byte) i_165_;
		}
	    }
	    for (int i_167_ = 0; i_167_ < i_155_; i_167_++) {
		int i_168_ = 32;
		byte i_169_ = 0;
		for (int i_170_ = 0; i_170_ < i_154_; i_170_++) {
		    if (class711.aByteArrayArray8842[i_167_][i_170_] > i_169_)
			i_169_ = class711.aByteArrayArray8842[i_167_][i_170_];
		    if (class711.aByteArrayArray8842[i_167_][i_170_] < i_168_)
			i_168_ = class711.aByteArrayArray8842[i_167_][i_170_];
		}
		method14436(class711.anIntArrayArray8864[i_167_],
			    class711.anIntArrayArray8865[i_167_],
			    class711.anIntArrayArray8866[i_167_],
			    class711.aByteArrayArray8842[i_167_], i_168_,
			    i_169_, i_154_);
		class711.anIntArray8867[i_167_] = i_168_;
	    }
	    int i_171_ = class711.anInt8855 * -1391632771 + 1;
	    int i_172_ = -1;
	    int i_173_ = 0;
	    for (int i_174_ = 0; i_174_ <= 255; i_174_++)
		class711.anIntArray8841[i_174_] = 0;
	    int i_175_ = 4095;
	    for (int i_176_ = 15; i_176_ >= 0; i_176_--) {
		for (int i_177_ = 15; i_177_ >= 0; i_177_--) {
		    class711.aByteArray8859[i_175_]
			= (byte) (i_176_ * 16 + i_177_);
		    i_175_--;
		}
		class711.anIntArray8860[i_176_] = i_175_ + 1;
	    }
	    int i_178_ = 0;
	    if (i_173_ == 0) {
		i_172_++;
		i_173_ = 50;
		byte i_179_ = class711.aByteArray8835[i_172_];
		i = class711.anIntArray8867[i_179_];
		is = class711.anIntArrayArray8864[i_179_];
		is_146_ = class711.anIntArrayArray8866[i_179_];
		is_145_ = class711.anIntArrayArray8865[i_179_];
	    }
	    i_173_--;
	    int i_180_ = i;
	    int i_181_;
	    int i_182_;
	    for (i_182_ = method14431(i_180_, class711); i_182_ > is[i_180_];
		 i_182_ = i_182_ << 1 | i_181_) {
		i_180_++;
		i_181_ = method14434(class711);
	    }
	    int i_183_ = is_146_[i_182_ - is_145_[i_180_]];
	    while (i_183_ != i_171_) {
		if (i_183_ == 0 || i_183_ == 1) {
		    int i_184_ = -1;
		    int i_185_ = 1;
		    do {
			if (i_183_ == 0)
			    i_184_ += 1 * i_185_;
			else if (i_183_ == 1)
			    i_184_ += 2 * i_185_;
			i_185_ *= 2;
			if (i_173_ == 0) {
			    i_172_++;
			    i_173_ = 50;
			    byte i_186_ = class711.aByteArray8835[i_172_];
			    i = class711.anIntArray8867[i_186_];
			    is = class711.anIntArrayArray8864[i_186_];
			    is_146_ = class711.anIntArrayArray8866[i_186_];
			    is_145_ = class711.anIntArrayArray8865[i_186_];
			}
			i_173_--;
			i_180_ = i;
			for (i_182_ = method14431(i_180_, class711);
			     i_182_ > is[i_180_];
			     i_182_ = i_182_ << 1 | i_181_) {
			    i_180_++;
			    i_181_ = method14434(class711);
			}
			i_183_ = is_146_[i_182_ - is_145_[i_180_]];
		    } while (i_183_ == 0 || i_183_ == 1);
		    i_184_++;
		    i_149_ = (class711.aByteArray8858
			      [(class711.aByteArray8859
				[class711.anIntArray8860[0]]) & 0xff]);
		    class711.anIntArray8841[i_149_ & 0xff] += i_184_;
		    for (/**/; i_184_ > 0; i_184_--) {
			Class16.anIntArray188[i_178_] = i_149_ & 0xff;
			i_178_++;
		    }
		} else {
		    int i_187_ = i_183_ - 1;
		    if (i_187_ < 16) {
			int i_188_ = class711.anIntArray8860[0];
			i_148_ = class711.aByteArray8859[i_188_ + i_187_];
			for (/**/; i_187_ > 3; i_187_ -= 4) {
			    int i_189_ = i_188_ + i_187_;
			    class711.aByteArray8859[i_189_]
				= class711.aByteArray8859[i_189_ - 1];
			    class711.aByteArray8859[i_189_ - 1]
				= class711.aByteArray8859[i_189_ - 2];
			    class711.aByteArray8859[i_189_ - 2]
				= class711.aByteArray8859[i_189_ - 3];
			    class711.aByteArray8859[i_189_ - 3]
				= class711.aByteArray8859[i_189_ - 4];
			}
			for (/**/; i_187_ > 0; i_187_--)
			    class711.aByteArray8859[i_188_ + i_187_]
				= class711.aByteArray8859[i_188_ + i_187_ - 1];
			class711.aByteArray8859[i_188_] = i_148_;
		    } else {
			int i_190_ = i_187_ / 16;
			int i_191_ = i_187_ % 16;
			int i_192_ = class711.anIntArray8860[i_190_] + i_191_;
			i_148_ = class711.aByteArray8859[i_192_];
			for (/**/; i_192_ > class711.anIntArray8860[i_190_];
			     i_192_--)
			    class711.aByteArray8859[i_192_]
				= class711.aByteArray8859[i_192_ - 1];
			class711.anIntArray8860[i_190_]++;
			for (/**/; i_190_ > 0; i_190_--) {
			    class711.anIntArray8860[i_190_]--;
			    class711.aByteArray8859[(class711.anIntArray8860
						     [i_190_])]
				= (class711.aByteArray8859
				   [(class711.anIntArray8860[i_190_ - 1] + 16
				     - 1)]);
			}
			class711.anIntArray8860[0]--;
			class711.aByteArray8859[class711.anIntArray8860[0]]
			    = i_148_;
			if (class711.anIntArray8860[0] == 0) {
			    i_175_ = 4095;
			    for (int i_193_ = 15; i_193_ >= 0; i_193_--) {
				for (int i_194_ = 15; i_194_ >= 0; i_194_--) {
				    class711.aByteArray8859[i_175_]
					= (class711.aByteArray8859
					   [(class711.anIntArray8860[i_193_]
					     + i_194_)]);
				    i_175_--;
				}
				class711.anIntArray8860[i_193_] = i_175_ + 1;
			    }
			}
		    }
		    class711.anIntArray8841
			[class711.aByteArray8858[i_148_ & 0xff] & 0xff]++;
		    Class16.anIntArray188[i_178_]
			= class711.aByteArray8858[i_148_ & 0xff] & 0xff;
		    i_178_++;
		    if (i_173_ == 0) {
			i_172_++;
			i_173_ = 50;
			byte i_195_ = class711.aByteArray8835[i_172_];
			i = class711.anIntArray8867[i_195_];
			is = class711.anIntArrayArray8864[i_195_];
			is_146_ = class711.anIntArrayArray8866[i_195_];
			is_145_ = class711.anIntArrayArray8865[i_195_];
		    }
		    i_173_--;
		    i_180_ = i;
		    for (i_182_ = method14431(i_180_, class711);
			 i_182_ > is[i_180_]; i_182_ = i_182_ << 1 | i_181_) {
			i_180_++;
			i_181_ = method14434(class711);
		    }
		    i_183_ = is_146_[i_182_ - is_145_[i_180_]];
		}
	    }
	    class711.anInt8845 = 0;
	    class711.aByte8850 = (byte) 0;
	    class711.anIntArray8854[0] = 0;
	    for (int i_196_ = 1; i_196_ <= 256; i_196_++)
		class711.anIntArray8854[i_196_]
		    = class711.anIntArray8841[i_196_ - 1];
	    for (int i_197_ = 1; i_197_ <= 256; i_197_++)
		class711.anIntArray8854[i_197_]
		    += class711.anIntArray8854[i_197_ - 1];
	    for (int i_198_ = 0; i_198_ < i_178_; i_198_++) {
		i_149_ = (byte) (Class16.anIntArray188[i_198_] & 0xff);
		Class16.anIntArray188[class711.anIntArray8854[i_149_ & 0xff]]
		    |= i_198_ << 8;
		class711.anIntArray8854[i_149_ & 0xff]++;
	    }
	    class711.anInt8831
		= (Class16.anIntArray188[class711.anInt8849 * -918230623]
		   >> 8) * -1167232797;
	    class711.anInt8853 = 0;
	    class711.anInt8831
		= (Class16.anIntArray188[class711.anInt8831 * 1034900683]
		   * -1167232797);
	    class711.anInt8851
		= (byte) (class711.anInt8831 * 1034900683 & 0xff) * 48617223;
	    Class711 class711_199_;
	    (class711_199_ = class711).anInt8831
		= (class711_199_.anInt8831 * 1034900683 >> 8) * -1167232797;
	    class711.anInt8853 += 1686127717;
	    class711.anInt8832 = i_178_ * -1469642121;
	    method14440(class711);
	    if ((class711.anInt8853 * 1866911085
		 == class711.anInt8832 * -1085149369 + 1)
		&& class711.anInt8845 * -1507901393 == 0)
		bool_147_ = true;
	    else
		bool_147_ = false;
	}
    }
    
    static byte method14442(Class711 class711) {
	return (byte) method14431(8, class711);
    }
    
    static int method14443(int i, Class711 class711) {
	for (;;) {
	    if (class711.anInt8847 * 1490360251 >= i) {
		int i_200_ = ((class711.anInt8846 * -693351113
			       >> class711.anInt8847 * 1490360251 - i)
			      & (1 << i) - 1);
		class711.anInt8847 -= i * -1866721933;
		return i_200_;
	    }
	    class711.anInt8846
		= (class711.anInt8846 * -693351113 << 8
		   | (class711.aByteArray8837[class711.anInt8838 * 1601077649]
		      & 0xff)) * -1654982521;
	    class711.anInt8847 += -2048873576;
	    class711.anInt8838 += 1776574321;
	    class711.anInt8839 += 1669697823;
	    if (class711.anInt8839 * -222778657 == 0) {
		/* empty */
	    }
	}
    }
    
    static int method14444(int i, Class711 class711) {
	for (;;) {
	    if (class711.anInt8847 * 1490360251 >= i) {
		int i_201_ = ((class711.anInt8846 * -693351113
			       >> class711.anInt8847 * 1490360251 - i)
			      & (1 << i) - 1);
		class711.anInt8847 -= i * -1866721933;
		return i_201_;
	    }
	    class711.anInt8846
		= (class711.anInt8846 * -693351113 << 8
		   | (class711.aByteArray8837[class711.anInt8838 * 1601077649]
		      & 0xff)) * -1654982521;
	    class711.anInt8847 += -2048873576;
	    class711.anInt8838 += 1776574321;
	    class711.anInt8839 += 1669697823;
	    if (class711.anInt8839 * -222778657 == 0) {
		/* empty */
	    }
	}
    }
    
    public static int method14445(byte[] is, int i, byte[] is_202_, int i_203_,
				  int i_204_) {
	synchronized (aClass711_8830) {
	    aClass711_8830.aByteArray8837 = is_202_;
	    aClass711_8830.anInt8838 = i_204_ * 1776574321;
	    aClass711_8830.aByteArray8840 = is;
	    aClass711_8830.anInt8862 = 0;
	    aClass711_8830.anInt8852 = i * -281801883;
	    aClass711_8830.anInt8847 = 0;
	    aClass711_8830.anInt8846 = 0;
	    aClass711_8830.anInt8839 = 0;
	    aClass711_8830.anInt8843 = 0;
	    method14432(aClass711_8830);
	    i -= aClass711_8830.anInt8852 * -1401999763;
	    aClass711_8830.aByteArray8837 = null;
	    aClass711_8830.aByteArray8840 = null;
	    int i_205_ = i;
	    return i_205_;
	}
    }
    
    static void method14446(Class711 class711) {
	class711.anInt8855 = 0;
	for (int i = 0; i < 256; i++) {
	    if (class711.aBoolArray8856[i]) {
		class711.aByteArray8858[class711.anInt8855 * -1391632771]
		    = (byte) i;
		class711.anInt8855 += 411405013;
	    }
	}
    }
    
    static void method14447(int[] is, int[] is_206_, int[] is_207_,
			    byte[] is_208_, int i, int i_209_, int i_210_) {
	int i_211_ = 0;
	for (int i_212_ = i; i_212_ <= i_209_; i_212_++) {
	    for (int i_213_ = 0; i_213_ < i_210_; i_213_++) {
		if (is_208_[i_213_] == i_212_) {
		    is_207_[i_211_] = i_213_;
		    i_211_++;
		}
	    }
	}
	for (int i_214_ = 0; i_214_ < 23; i_214_++)
	    is_206_[i_214_] = 0;
	for (int i_215_ = 0; i_215_ < i_210_; i_215_++)
	    is_206_[is_208_[i_215_] + 1]++;
	for (int i_216_ = 1; i_216_ < 23; i_216_++)
	    is_206_[i_216_] += is_206_[i_216_ - 1];
	for (int i_217_ = 0; i_217_ < 23; i_217_++)
	    is[i_217_] = 0;
	int i_218_ = 0;
	for (int i_219_ = i; i_219_ <= i_209_; i_219_++) {
	    i_218_ += is_206_[i_219_ + 1] - is_206_[i_219_];
	    is[i_219_] = i_218_ - 1;
	    i_218_ <<= 1;
	}
	for (int i_220_ = i + 1; i_220_ <= i_209_; i_220_++)
	    is_206_[i_220_] = (is[i_220_ - 1] + 1 << 1) - is_206_[i_220_];
    }
}
