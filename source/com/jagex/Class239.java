/* Class239 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.HashMap;
import java.util.Map;

public class Class239 implements Interface76
{
    static Class239 aClass239_2405;
    static Class239 aClass239_2406;
    static Class239 aClass239_2407;
    int anInt2408;
    int anInt2409;
    static Class239 aClass239_2410 = new Class239(2, 0);
    static int anInt2411;
    
    static Class239[] method4418(int i) {
	return new Class239[] { aClass239_2407, aClass239_2406, aClass239_2410,
				aClass239_2405 };
    }
    
    static {
	aClass239_2406 = new Class239(1, 1);
	aClass239_2407 = new Class239(0, 2);
	aClass239_2405 = new Class239(3, 3);
    }
    
    public int method80() {
	return anInt2408 * 1314900781;
    }
    
    Class239(int i, int i_0_) {
	anInt2409 = 1364115759 * i;
	anInt2408 = 593607845 * i_0_;
    }
    
    public int method57() {
	return anInt2408 * 1314900781;
    }
    
    public int method75() {
	return anInt2408 * 1314900781;
    }
    
    static Class239[] method4419() {
	return new Class239[] { aClass239_2407, aClass239_2406, aClass239_2410,
				aClass239_2405 };
    }
    
    static Class239[] method4420() {
	return new Class239[] { aClass239_2407, aClass239_2406, aClass239_2410,
				aClass239_2405 };
    }
    
    public static byte[][][] method4421(int i, int i_1_) {
	byte[][][] is = new byte[8][4][];
	int i_2_ = i;
	int i_3_ = i;
	byte[] is_4_ = new byte[i_2_ * i_3_];
	int i_5_ = 0;
	for (int i_6_ = 0; i_6_ < i_3_; i_6_++) {
	    for (int i_7_ = 0; i_7_ < i_2_; i_7_++) {
		if (i_7_ <= i_6_)
		    is_4_[i_5_] = (byte) -1;
		i_5_++;
	    }
	}
	is[0][0] = is_4_;
	is_4_ = new byte[i_3_ * i_2_];
	i_5_ = 0;
	for (int i_8_ = i_3_ - 1; i_8_ >= 0; i_8_--) {
	    for (int i_9_ = 0; i_9_ < i_3_; i_9_++) {
		if (i_9_ <= i_8_)
		    is_4_[i_5_] = (byte) -1;
		i_5_++;
	    }
	}
	is[0][1] = is_4_;
	is_4_ = new byte[i_2_ * i_3_];
	i_5_ = 0;
	for (int i_10_ = 0; i_10_ < i_3_; i_10_++) {
	    for (int i_11_ = 0; i_11_ < i_2_; i_11_++) {
		if (i_11_ >= i_10_)
		    is_4_[i_5_] = (byte) -1;
		i_5_++;
	    }
	}
	is[0][2] = is_4_;
	is_4_ = new byte[i_2_ * i_3_];
	i_5_ = 0;
	for (int i_12_ = i_3_ - 1; i_12_ >= 0; i_12_--) {
	    for (int i_13_ = 0; i_13_ < i_2_; i_13_++) {
		if (i_13_ >= i_12_)
		    is_4_[i_5_] = (byte) -1;
		i_5_++;
	    }
	}
	is[0][3] = is_4_;
	is_4_ = new byte[i_2_ * i_3_];
	i_5_ = 0;
	for (int i_14_ = i_3_ - 1; i_14_ >= 0; i_14_--) {
	    for (int i_15_ = 0; i_15_ < i_2_; i_15_++) {
		if (i_15_ <= i_14_ >> 1)
		    is_4_[i_5_] = (byte) -1;
		i_5_++;
	    }
	}
	is[1][0] = is_4_;
	is_4_ = new byte[i_2_ * i_3_];
	i_5_ = 0;
	for (int i_16_ = 0; i_16_ < i_3_; i_16_++) {
	    for (int i_17_ = 0; i_17_ < i_2_; i_17_++) {
		if (i_5_ < 0 || i_5_ >= is_4_.length)
		    i_5_++;
		else {
		    if (i_17_ >= i_16_ << 1)
			is_4_[i_5_] = (byte) -1;
		    i_5_++;
		}
	    }
	}
	is[1][1] = is_4_;
	is_4_ = new byte[i_2_ * i_3_];
	i_5_ = 0;
	for (int i_18_ = 0; i_18_ < i_3_; i_18_++) {
	    for (int i_19_ = i_2_ - 1; i_19_ >= 0; i_19_--) {
		if (i_19_ <= i_18_ >> 1)
		    is_4_[i_5_] = (byte) -1;
		i_5_++;
	    }
	}
	is[1][2] = is_4_;
	is_4_ = new byte[i_2_ * i_3_];
	i_5_ = 0;
	for (int i_20_ = i_3_ - 1; i_20_ >= 0; i_20_--) {
	    for (int i_21_ = i_2_ - 1; i_21_ >= 0; i_21_--) {
		if (i_21_ >= i_20_ << 1)
		    is_4_[i_5_] = (byte) -1;
		i_5_++;
	    }
	}
	is[1][3] = is_4_;
	is_4_ = new byte[i_2_ * i_3_];
	i_5_ = 0;
	for (int i_22_ = i_3_ - 1; i_22_ >= 0; i_22_--) {
	    for (int i_23_ = i_2_ - 1; i_23_ >= 0; i_23_--) {
		if (i_23_ <= i_22_ >> 1)
		    is_4_[i_5_] = (byte) -1;
		i_5_++;
	    }
	}
	is[2][0] = is_4_;
	is_4_ = new byte[i_3_ * i_2_];
	i_5_ = 0;
	for (int i_24_ = i_3_ - 1; i_24_ >= 0; i_24_--) {
	    for (int i_25_ = 0; i_25_ < i_2_; i_25_++) {
		if (i_25_ >= i_24_ << 1)
		    is_4_[i_5_] = (byte) -1;
		i_5_++;
	    }
	}
	is[2][1] = is_4_;
	is_4_ = new byte[i_3_ * i_2_];
	i_5_ = 0;
	for (int i_26_ = 0; i_26_ < i_3_; i_26_++) {
	    for (int i_27_ = 0; i_27_ < i_2_; i_27_++) {
		if (i_27_ <= i_26_ >> 1)
		    is_4_[i_5_] = (byte) -1;
		i_5_++;
	    }
	}
	is[2][2] = is_4_;
	is_4_ = new byte[i_2_ * i_3_];
	i_5_ = 0;
	for (int i_28_ = 0; i_28_ < i_3_; i_28_++) {
	    for (int i_29_ = i_2_ - 1; i_29_ >= 0; i_29_--) {
		if (i_29_ >= i_28_ << 1)
		    is_4_[i_5_] = (byte) -1;
		i_5_++;
	    }
	}
	is[2][3] = is_4_;
	is_4_ = new byte[i_3_ * i_2_];
	i_5_ = 0;
	for (int i_30_ = i_3_ - 1; i_30_ >= 0; i_30_--) {
	    for (int i_31_ = 0; i_31_ < i_2_; i_31_++) {
		if (i_31_ >= i_30_ >> 1)
		    is_4_[i_5_] = (byte) -1;
		i_5_++;
	    }
	}
	is[3][0] = is_4_;
	is_4_ = new byte[i_2_ * i_3_];
	i_5_ = 0;
	for (int i_32_ = 0; i_32_ < i_3_; i_32_++) {
	    for (int i_33_ = 0; i_33_ < i_2_; i_33_++) {
		if (i_33_ <= i_32_ << 1)
		    is_4_[i_5_] = (byte) -1;
		i_5_++;
	    }
	}
	is[3][1] = is_4_;
	is_4_ = new byte[i_3_ * i_2_];
	i_5_ = 0;
	for (int i_34_ = 0; i_34_ < i_3_; i_34_++) {
	    for (int i_35_ = i_2_ - 1; i_35_ >= 0; i_35_--) {
		if (i_35_ >= i_34_ >> 1)
		    is_4_[i_5_] = (byte) -1;
		i_5_++;
	    }
	}
	is[3][2] = is_4_;
	is_4_ = new byte[i_3_ * i_2_];
	i_5_ = 0;
	for (int i_36_ = i_3_ - 1; i_36_ >= 0; i_36_--) {
	    for (int i_37_ = i_2_ - 1; i_37_ >= 0; i_37_--) {
		if (i_37_ <= i_36_ << 1)
		    is_4_[i_5_] = (byte) -1;
		i_5_++;
	    }
	}
	is[3][3] = is_4_;
	is_4_ = new byte[i_2_ * i_3_];
	i_5_ = 0;
	for (int i_38_ = i_3_ - 1; i_38_ >= 0; i_38_--) {
	    for (int i_39_ = i_2_ - 1; i_39_ >= 0; i_39_--) {
		if (i_39_ >= i_38_ >> 1)
		    is_4_[i_5_] = (byte) -1;
		i_5_++;
	    }
	}
	is[4][0] = is_4_;
	is_4_ = new byte[i_2_ * i_3_];
	i_5_ = 0;
	for (int i_40_ = i_3_ - 1; i_40_ >= 0; i_40_--) {
	    for (int i_41_ = 0; i_41_ < i_2_; i_41_++) {
		if (i_41_ <= i_40_ << 1)
		    is_4_[i_5_] = (byte) -1;
		i_5_++;
	    }
	}
	is[4][1] = is_4_;
	is_4_ = new byte[i_2_ * i_3_];
	i_5_ = 0;
	for (int i_42_ = 0; i_42_ < i_3_; i_42_++) {
	    for (int i_43_ = 0; i_43_ < i_2_; i_43_++) {
		if (i_43_ >= i_42_ >> 1)
		    is_4_[i_5_] = (byte) -1;
		i_5_++;
	    }
	}
	is[4][2] = is_4_;
	is_4_ = new byte[i_3_ * i_2_];
	i_5_ = 0;
	for (int i_44_ = 0; i_44_ < i_3_; i_44_++) {
	    for (int i_45_ = i_2_ - 1; i_45_ >= 0; i_45_--) {
		if (i_45_ <= i_44_ << 1)
		    is_4_[i_5_] = (byte) -1;
		i_5_++;
	    }
	}
	is[4][3] = is_4_;
	is_4_ = new byte[i_2_ * i_3_];
	i_5_ = 0;
	for (int i_46_ = 0; i_46_ < i_3_; i_46_++) {
	    for (int i_47_ = 0; i_47_ < i_2_; i_47_++) {
		if (i_47_ <= i_2_ / 2)
		    is_4_[i_5_] = (byte) -1;
		i_5_++;
	    }
	}
	is[5][0] = is_4_;
	is_4_ = new byte[i_3_ * i_2_];
	i_5_ = 0;
	for (int i_48_ = 0; i_48_ < i_3_; i_48_++) {
	    for (int i_49_ = 0; i_49_ < i_2_; i_49_++) {
		if (i_48_ <= i_3_ / 2)
		    is_4_[i_5_] = (byte) -1;
		i_5_++;
	    }
	}
	is[5][1] = is_4_;
	is_4_ = new byte[i_2_ * i_3_];
	i_5_ = 0;
	for (int i_50_ = 0; i_50_ < i_3_; i_50_++) {
	    for (int i_51_ = 0; i_51_ < i_2_; i_51_++) {
		if (i_51_ >= i_2_ / 2)
		    is_4_[i_5_] = (byte) -1;
		i_5_++;
	    }
	}
	is[5][2] = is_4_;
	is_4_ = new byte[i_2_ * i_3_];
	i_5_ = 0;
	for (int i_52_ = 0; i_52_ < i_3_; i_52_++) {
	    for (int i_53_ = 0; i_53_ < i_2_; i_53_++) {
		if (i_52_ >= i_3_ / 2)
		    is_4_[i_5_] = (byte) -1;
		i_5_++;
	    }
	}
	is[5][3] = is_4_;
	is_4_ = new byte[i_3_ * i_2_];
	i_5_ = 0;
	for (int i_54_ = 0; i_54_ < i_3_; i_54_++) {
	    for (int i_55_ = 0; i_55_ < i_2_; i_55_++) {
		if (i_55_ <= i_54_ - i_3_ / 2)
		    is_4_[i_5_] = (byte) -1;
		i_5_++;
	    }
	}
	is[6][0] = is_4_;
	is_4_ = new byte[i_3_ * i_2_];
	i_5_ = 0;
	for (int i_56_ = i_3_ - 1; i_56_ >= 0; i_56_--) {
	    for (int i_57_ = 0; i_57_ < i_2_; i_57_++) {
		if (i_57_ <= i_56_ - i_3_ / 2)
		    is_4_[i_5_] = (byte) -1;
		i_5_++;
	    }
	}
	is[6][1] = is_4_;
	is_4_ = new byte[i_2_ * i_3_];
	i_5_ = 0;
	for (int i_58_ = i_3_ - 1; i_58_ >= 0; i_58_--) {
	    for (int i_59_ = i_2_ - 1; i_59_ >= 0; i_59_--) {
		if (i_59_ <= i_58_ - i_3_ / 2)
		    is_4_[i_5_] = (byte) -1;
		i_5_++;
	    }
	}
	is[6][2] = is_4_;
	is_4_ = new byte[i_2_ * i_3_];
	i_5_ = 0;
	for (int i_60_ = 0; i_60_ < i_3_; i_60_++) {
	    for (int i_61_ = i_2_ - 1; i_61_ >= 0; i_61_--) {
		if (i_61_ <= i_60_ - i_3_ / 2)
		    is_4_[i_5_] = (byte) -1;
		i_5_++;
	    }
	}
	is[6][3] = is_4_;
	is_4_ = new byte[i_2_ * i_3_];
	i_5_ = 0;
	for (int i_62_ = 0; i_62_ < i_3_; i_62_++) {
	    for (int i_63_ = 0; i_63_ < i_2_; i_63_++) {
		if (i_63_ >= i_62_ - i_3_ / 2)
		    is_4_[i_5_] = (byte) -1;
		i_5_++;
	    }
	}
	is[7][0] = is_4_;
	is_4_ = new byte[i_2_ * i_3_];
	i_5_ = 0;
	for (int i_64_ = i_3_ - 1; i_64_ >= 0; i_64_--) {
	    for (int i_65_ = 0; i_65_ < i_2_; i_65_++) {
		if (i_65_ >= i_64_ - i_3_ / 2)
		    is_4_[i_5_] = (byte) -1;
		i_5_++;
	    }
	}
	is[7][1] = is_4_;
	is_4_ = new byte[i_2_ * i_3_];
	i_5_ = 0;
	for (int i_66_ = i_3_ - 1; i_66_ >= 0; i_66_--) {
	    for (int i_67_ = i_2_ - 1; i_67_ >= 0; i_67_--) {
		if (i_67_ >= i_66_ - i_3_ / 2)
		    is_4_[i_5_] = (byte) -1;
		i_5_++;
	    }
	}
	is[7][2] = is_4_;
	is_4_ = new byte[i_3_ * i_2_];
	i_5_ = 0;
	for (int i_68_ = 0; i_68_ < i_3_; i_68_++) {
	    for (int i_69_ = i_2_ - 1; i_69_ >= 0; i_69_--) {
		if (i_69_ >= i_68_ - i_3_ / 2)
		    is_4_[i_5_] = (byte) -1;
		i_5_++;
	    }
	}
	is[7][3] = is_4_;
	return is;
    }
    
    static final void method4422(Class259 class259, Class245 class245,
				 Class683 class683, byte i) {
	class683.anInt8662 -= -1653357974;
	class259.aBool2656 = true;
	class259.anInt2662
	    = Math.max(Math.min((class683.anIntArray8661
				 [class683.anInt8662 * 501271953]),
				2816),
		       0) * 417318945;
	class259.anInt2689
	    = Math.max(Math.min((class683.anIntArray8661
				 [class683.anInt8662 * 501271953 + 1]),
				2816),
		       0) * -1288840501;
	class259.anInt2762
	    = Math.max(Math.min((class683.anIntArray8661
				 [501271953 * class683.anInt8662 + 2]),
				2816),
		       0) * -1520626833;
	int i_70_ = Math.max(Math.min((class683.anIntArray8661
				       [501271953 * class683.anInt8662 + 3]),
				      255),
			     0);
	int i_71_ = Math.max(Math.min((class683.anIntArray8661
				       [class683.anInt8662 * 501271953 + 4]),
				      255),
			     0);
	int i_72_ = Math.max(Math.min((class683.anIntArray8661
				       [5 + 501271953 * class683.anInt8662]),
				      255),
			     0);
	class259.anInt2663 = 2009914015 * (i_70_ << 16 | i_71_ << 8 | i_72_);
	class259.anInt2657
	    = (-279371609
	       * class683.anIntArray8661[501271953 * class683.anInt8662 + 6]);
	class259.anInt2658
	    = (-229857167
	       * class683.anIntArray8661[class683.anInt8662 * 501271953 + 7]);
	class259.anInt2659
	    = (778385643
	       * class683.anIntArray8661[501271953 * class683.anInt8662 + 8]);
	class259.anInt2674
	    = (-1687576951
	       * class683.anIntArray8661[501271953 * class683.anInt8662 + 9]);
	Class649.method10708(class259, (byte) 0);
    }
    
    static final void method4423(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class183.method3600(class259, class245, true, 2, class683,
			    -1682495836);
    }
    
    public static Interface76 method4424(Class var_class, int i, byte i_73_) {
	synchronized (Class665.aMap8558) {
	    Map map = (Map) Class665.aMap8558.get(var_class);
	    if (map == null) {
		map = new HashMap();
		Interface76[] interface76s
		    = (Interface76[]) var_class.getEnumConstants();
		for (int i_74_ = 0; i_74_ < interface76s.length; i_74_++) {
		    Interface76 interface76 = interface76s[i_74_];
		    map.put(Integer.valueOf(interface76.method80()),
			    interface76);
		}
		Class665.aMap8558.put(var_class, map);
	    }
	    Interface76 interface76
		= (Interface76) map.get(Integer.valueOf(i));
	    return interface76;
	}
    }
    
    static final void method4425(Class683 class683, int i) {
	long l = Class251.method4508((byte) 8);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class401.method6555(l);
    }
    
    static final int method4426(int i, int i_75_, int i_76_, byte i_77_) {
	if (i_75_ == i)
	    return i;
	int i_78_ = 128 - i_76_;
	int i_79_ = i_78_ * (i & 0x7f) + i_76_ * (i_75_ & 0x7f) >> 7;
	int i_80_ = (i_75_ & 0x380) * i_76_ + (i & 0x380) * i_78_ >> 7;
	int i_81_ = i_76_ * (i_75_ & 0xfc00) + i_78_ * (i & 0xfc00) >> 7;
	return i_81_ & 0xfc00 | i_80_ & 0x380 | i_79_ & 0x7f;
    }
}
