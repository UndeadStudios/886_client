/* Class651 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class651
{
    static void method10716(long[] ls, int[] is, int i, int i_0_) {
	if (i < i_0_) {
	    int i_1_ = (i + i_0_) / 2;
	    int i_2_ = i;
	    long l = ls[i_1_];
	    ls[i_1_] = ls[i_0_];
	    ls[i_0_] = l;
	    int i_3_ = is[i_1_];
	    is[i_1_] = is[i_0_];
	    is[i_0_] = i_3_;
	    int i_4_ = 9223372036854775807L == l ? 0 : 1;
	    for (int i_5_ = i; i_5_ < i_0_; i_5_++) {
		if (ls[i_5_] < l + (long) (i_5_ & i_4_)) {
		    long l_6_ = ls[i_5_];
		    ls[i_5_] = ls[i_2_];
		    ls[i_2_] = l_6_;
		    int i_7_ = is[i_5_];
		    is[i_5_] = is[i_2_];
		    is[i_2_++] = i_7_;
		}
	    }
	    ls[i_0_] = ls[i_2_];
	    ls[i_2_] = l;
	    is[i_0_] = is[i_2_];
	    is[i_2_] = i_3_;
	    Class643.method10596(ls, is, i, i_2_ - 1, (byte) 48);
	    Class643.method10596(ls, is, i_2_ + 1, i_0_, (byte) 7);
	}
    }
    
    static void method10717(String[] strings, int[] is, int i, int i_8_) {
	if (i < i_8_) {
	    int i_9_ = (i + i_8_) / 2;
	    int i_10_ = i;
	    String string = strings[i_9_];
	    strings[i_9_] = strings[i_8_];
	    strings[i_8_] = string;
	    int i_11_ = is[i_9_];
	    is[i_9_] = is[i_8_];
	    is[i_8_] = i_11_;
	    for (int i_12_ = i; i_12_ < i_8_; i_12_++) {
		if (null == string
		    || (null != strings[i_12_]
			&& strings[i_12_].compareTo(string) < (i_12_ & 0x1))) {
		    String string_13_ = strings[i_12_];
		    strings[i_12_] = strings[i_10_];
		    strings[i_10_] = string_13_;
		    int i_14_ = is[i_12_];
		    is[i_12_] = is[i_10_];
		    is[i_10_++] = i_14_;
		}
	    }
	    strings[i_8_] = strings[i_10_];
	    strings[i_10_] = string;
	    is[i_8_] = is[i_10_];
	    is[i_10_] = i_11_;
	    Class402.method6563(strings, is, i, i_10_ - 1, 1673379381);
	    Class402.method6563(strings, is, i_10_ + 1, i_8_, 1673379381);
	}
    }
    
    Class651() throws Throwable {
	throw new Error();
    }
    
    public static void method10718(int[] is, int[] is_15_, int i, int i_16_) {
	if (i < i_16_) {
	    int i_17_ = (i_16_ + i) / 2;
	    int i_18_ = i;
	    int i_19_ = is[i_17_];
	    is[i_17_] = is[i_16_];
	    is[i_16_] = i_19_;
	    int i_20_ = is_15_[i_17_];
	    is_15_[i_17_] = is_15_[i_16_];
	    is_15_[i_16_] = i_20_;
	    int i_21_ = 2147483647 == i_19_ ? 0 : 1;
	    for (int i_22_ = i; i_22_ < i_16_; i_22_++) {
		if (is[i_22_] < (i_22_ & i_21_) + i_19_) {
		    int i_23_ = is[i_22_];
		    is[i_22_] = is[i_18_];
		    is[i_18_] = i_23_;
		    int i_24_ = is_15_[i_22_];
		    is_15_[i_22_] = is_15_[i_18_];
		    is_15_[i_18_++] = i_24_;
		}
	    }
	    is[i_16_] = is[i_18_];
	    is[i_18_] = i_19_;
	    is_15_[i_16_] = is_15_[i_18_];
	    is_15_[i_18_] = i_20_;
	    Class546.method9099(is, is_15_, i, i_18_ - 1, 1782313374);
	    Class546.method9099(is, is_15_, 1 + i_18_, i_16_, 1782313374);
	}
    }
    
    public static void method10719(long[] ls, int[] is) {
	Class643.method10596(ls, is, 0, ls.length - 1, (byte) 55);
    }
    
    static void method10720(long[] ls, Object[] objects, int i, int i_25_) {
	if (i < i_25_) {
	    int i_26_ = (i + i_25_) / 2;
	    int i_27_ = i;
	    long l = ls[i_26_];
	    ls[i_26_] = ls[i_25_];
	    ls[i_25_] = l;
	    Object object = objects[i_26_];
	    objects[i_26_] = objects[i_25_];
	    objects[i_25_] = object;
	    int i_28_ = l == 9223372036854775807L ? 0 : 1;
	    for (int i_29_ = i; i_29_ < i_25_; i_29_++) {
		if (ls[i_29_] < (long) (i_29_ & i_28_) + l) {
		    long l_30_ = ls[i_29_];
		    ls[i_29_] = ls[i_27_];
		    ls[i_27_] = l_30_;
		    Object object_31_ = objects[i_29_];
		    objects[i_29_] = objects[i_27_];
		    objects[i_27_++] = object_31_;
		}
	    }
	    ls[i_25_] = ls[i_27_];
	    ls[i_27_] = l;
	    objects[i_25_] = objects[i_27_];
	    objects[i_27_] = object;
	    Class229.method4378(ls, objects, i, i_27_ - 1, 2119877633);
	    Class229.method4378(ls, objects, 1 + i_27_, i_25_, 2088711020);
	}
    }
    
    public static void method10721(long[] ls, int[] is) {
	Class643.method10596(ls, is, 0, ls.length - 1, (byte) 22);
    }
    
    public static void method10722(int[] is, Object[] objects) {
	Class288.method5260(is, objects, 0, is.length - 1, (byte) 8);
    }
    
    static void method10723(long[] ls, int[] is, int i, int i_32_) {
	if (i < i_32_) {
	    int i_33_ = (i + i_32_) / 2;
	    int i_34_ = i;
	    long l = ls[i_33_];
	    ls[i_33_] = ls[i_32_];
	    ls[i_32_] = l;
	    int i_35_ = is[i_33_];
	    is[i_33_] = is[i_32_];
	    is[i_32_] = i_35_;
	    int i_36_ = 9223372036854775807L == l ? 0 : 1;
	    for (int i_37_ = i; i_37_ < i_32_; i_37_++) {
		if (ls[i_37_] < l + (long) (i_37_ & i_36_)) {
		    long l_38_ = ls[i_37_];
		    ls[i_37_] = ls[i_34_];
		    ls[i_34_] = l_38_;
		    int i_39_ = is[i_37_];
		    is[i_37_] = is[i_34_];
		    is[i_34_++] = i_39_;
		}
	    }
	    ls[i_32_] = ls[i_34_];
	    ls[i_34_] = l;
	    is[i_32_] = is[i_34_];
	    is[i_34_] = i_35_;
	    Class643.method10596(ls, is, i, i_34_ - 1, (byte) 42);
	    Class643.method10596(ls, is, i_34_ + 1, i_32_, (byte) 88);
	}
    }
    
    public static void method10724(float[] fs, int[] is, int i, int i_40_) {
	if (i < i_40_) {
	    int i_41_ = (i_40_ + i) / 2;
	    int i_42_ = i;
	    float f = fs[i_41_];
	    fs[i_41_] = fs[i_40_];
	    fs[i_40_] = f;
	    int i_43_ = is[i_41_];
	    is[i_41_] = is[i_40_];
	    is[i_40_] = i_43_;
	    for (int i_44_ = i; i_44_ < i_40_; i_44_++) {
		if (fs[i_44_] > f) {
		    float f_45_ = fs[i_44_];
		    fs[i_44_] = fs[i_42_];
		    fs[i_42_] = f_45_;
		    int i_46_ = is[i_44_];
		    is[i_44_] = is[i_42_];
		    is[i_42_++] = i_46_;
		}
	    }
	    fs[i_40_] = fs[i_42_];
	    fs[i_42_] = f;
	    is[i_40_] = is[i_42_];
	    is[i_42_] = i_43_;
	    Class544.method8928(fs, is, i, i_42_ - 1, (byte) -53);
	    Class544.method8928(fs, is, 1 + i_42_, i_40_, (byte) -84);
	}
    }
    
    public static void method10725(float[] fs, int[] is, int i, int i_47_) {
	if (i < i_47_) {
	    int i_48_ = (i_47_ + i) / 2;
	    int i_49_ = i;
	    float f = fs[i_48_];
	    fs[i_48_] = fs[i_47_];
	    fs[i_47_] = f;
	    int i_50_ = is[i_48_];
	    is[i_48_] = is[i_47_];
	    is[i_47_] = i_50_;
	    for (int i_51_ = i; i_51_ < i_47_; i_51_++) {
		if (fs[i_51_] > f) {
		    float f_52_ = fs[i_51_];
		    fs[i_51_] = fs[i_49_];
		    fs[i_49_] = f_52_;
		    int i_53_ = is[i_51_];
		    is[i_51_] = is[i_49_];
		    is[i_49_++] = i_53_;
		}
	    }
	    fs[i_47_] = fs[i_49_];
	    fs[i_49_] = f;
	    is[i_47_] = is[i_49_];
	    is[i_49_] = i_50_;
	    Class544.method8928(fs, is, i, i_49_ - 1, (byte) -15);
	    Class544.method8928(fs, is, 1 + i_49_, i_47_, (byte) -49);
	}
    }
    
    public static void method10726(int[] is, float[] fs, float[] fs_54_) {
	Class598.method9854(is, fs, fs_54_, 0, is.length - 1, (byte) -38);
    }
    
    public static void method10727(int[] is, int[] is_55_, int i, int i_56_) {
	if (i < i_56_) {
	    int i_57_ = (i_56_ + i) / 2;
	    int i_58_ = i;
	    int i_59_ = is[i_57_];
	    is[i_57_] = is[i_56_];
	    is[i_56_] = i_59_;
	    int i_60_ = is_55_[i_57_];
	    is_55_[i_57_] = is_55_[i_56_];
	    is_55_[i_56_] = i_60_;
	    int i_61_ = 2147483647 == i_59_ ? 0 : 1;
	    for (int i_62_ = i; i_62_ < i_56_; i_62_++) {
		if (is[i_62_] < (i_62_ & i_61_) + i_59_) {
		    int i_63_ = is[i_62_];
		    is[i_62_] = is[i_58_];
		    is[i_58_] = i_63_;
		    int i_64_ = is_55_[i_62_];
		    is_55_[i_62_] = is_55_[i_58_];
		    is_55_[i_58_++] = i_64_;
		}
	    }
	    is[i_56_] = is[i_58_];
	    is[i_58_] = i_59_;
	    is_55_[i_56_] = is_55_[i_58_];
	    is_55_[i_58_] = i_60_;
	    Class546.method9099(is, is_55_, i, i_58_ - 1, 1782313374);
	    Class546.method9099(is, is_55_, 1 + i_58_, i_56_, 1782313374);
	}
    }
    
    static void method10728(int[] is, float[] fs, float[] fs_65_, int i,
			    int i_66_) {
	if (i < i_66_) {
	    int i_67_ = (i_66_ + i) / 2;
	    int i_68_ = i;
	    int i_69_ = is[i_67_];
	    is[i_67_] = is[i_66_];
	    is[i_66_] = i_69_;
	    float f = fs[i_67_];
	    fs[i_67_] = fs[i_66_];
	    fs[i_66_] = f;
	    float f_70_ = fs_65_[i_67_];
	    fs_65_[i_67_] = fs_65_[i_66_];
	    fs_65_[i_66_] = f_70_;
	    int i_71_ = (long) i_69_ == 9223372036854775807L ? 0 : 1;
	    for (int i_72_ = i; i_72_ < i_66_; i_72_++) {
		if (is[i_72_] < (i_72_ & i_71_) + i_69_) {
		    int i_73_ = is[i_72_];
		    is[i_72_] = is[i_68_];
		    is[i_68_] = i_73_;
		    float f_74_ = fs[i_72_];
		    fs[i_72_] = fs[i_68_];
		    fs[i_68_] = f_74_;
		    float f_75_ = fs_65_[i_72_];
		    fs_65_[i_72_] = fs_65_[i_68_];
		    fs_65_[i_68_] = f_75_;
		    i_68_++;
		}
	    }
	    is[i_66_] = is[i_68_];
	    is[i_68_] = i_69_;
	    fs[i_66_] = fs[i_68_];
	    fs[i_68_] = f;
	    fs_65_[i_66_] = fs_65_[i_68_];
	    fs_65_[i_68_] = f_70_;
	    Class598.method9854(is, fs, fs_65_, i, i_68_ - 1, (byte) -18);
	    Class598.method9854(is, fs, fs_65_, i_68_ + 1, i_66_, (byte) -26);
	}
    }
    
    static void method10729(int[] is, float[] fs, float[] fs_76_, int i,
			    int i_77_) {
	if (i < i_77_) {
	    int i_78_ = (i_77_ + i) / 2;
	    int i_79_ = i;
	    int i_80_ = is[i_78_];
	    is[i_78_] = is[i_77_];
	    is[i_77_] = i_80_;
	    float f = fs[i_78_];
	    fs[i_78_] = fs[i_77_];
	    fs[i_77_] = f;
	    float f_81_ = fs_76_[i_78_];
	    fs_76_[i_78_] = fs_76_[i_77_];
	    fs_76_[i_77_] = f_81_;
	    int i_82_ = (long) i_80_ == 9223372036854775807L ? 0 : 1;
	    for (int i_83_ = i; i_83_ < i_77_; i_83_++) {
		if (is[i_83_] < (i_83_ & i_82_) + i_80_) {
		    int i_84_ = is[i_83_];
		    is[i_83_] = is[i_79_];
		    is[i_79_] = i_84_;
		    float f_85_ = fs[i_83_];
		    fs[i_83_] = fs[i_79_];
		    fs[i_79_] = f_85_;
		    float f_86_ = fs_76_[i_83_];
		    fs_76_[i_83_] = fs_76_[i_79_];
		    fs_76_[i_79_] = f_86_;
		    i_79_++;
		}
	    }
	    is[i_77_] = is[i_79_];
	    is[i_79_] = i_80_;
	    fs[i_77_] = fs[i_79_];
	    fs[i_79_] = f;
	    fs_76_[i_77_] = fs_76_[i_79_];
	    fs_76_[i_79_] = f_81_;
	    Class598.method9854(is, fs, fs_76_, i, i_79_ - 1, (byte) -117);
	    Class598.method9854(is, fs, fs_76_, i_79_ + 1, i_77_, (byte) -104);
	}
    }
    
    static void method10730(int[] is, float[] fs, float[] fs_87_, int i,
			    int i_88_) {
	if (i < i_88_) {
	    int i_89_ = (i_88_ + i) / 2;
	    int i_90_ = i;
	    int i_91_ = is[i_89_];
	    is[i_89_] = is[i_88_];
	    is[i_88_] = i_91_;
	    float f = fs[i_89_];
	    fs[i_89_] = fs[i_88_];
	    fs[i_88_] = f;
	    float f_92_ = fs_87_[i_89_];
	    fs_87_[i_89_] = fs_87_[i_88_];
	    fs_87_[i_88_] = f_92_;
	    int i_93_ = (long) i_91_ == 9223372036854775807L ? 0 : 1;
	    for (int i_94_ = i; i_94_ < i_88_; i_94_++) {
		if (is[i_94_] < (i_94_ & i_93_) + i_91_) {
		    int i_95_ = is[i_94_];
		    is[i_94_] = is[i_90_];
		    is[i_90_] = i_95_;
		    float f_96_ = fs[i_94_];
		    fs[i_94_] = fs[i_90_];
		    fs[i_90_] = f_96_;
		    float f_97_ = fs_87_[i_94_];
		    fs_87_[i_94_] = fs_87_[i_90_];
		    fs_87_[i_90_] = f_97_;
		    i_90_++;
		}
	    }
	    is[i_88_] = is[i_90_];
	    is[i_90_] = i_91_;
	    fs[i_88_] = fs[i_90_];
	    fs[i_90_] = f;
	    fs_87_[i_88_] = fs_87_[i_90_];
	    fs_87_[i_90_] = f_92_;
	    Class598.method9854(is, fs, fs_87_, i, i_90_ - 1, (byte) -101);
	    Class598.method9854(is, fs, fs_87_, i_90_ + 1, i_88_, (byte) -75);
	}
    }
    
    public static void method10731(int[] is, Object[] objects) {
	Class288.method5260(is, objects, 0, is.length - 1, (byte) 29);
    }
    
    public static void method10732(int[] is, Object[] objects, int i,
				   int i_98_) {
	if (i < i_98_) {
	    int i_99_ = (i_98_ + i) / 2;
	    int i_100_ = i;
	    int i_101_ = is[i_99_];
	    is[i_99_] = is[i_98_];
	    is[i_98_] = i_101_;
	    Object object = objects[i_99_];
	    objects[i_99_] = objects[i_98_];
	    objects[i_98_] = object;
	    int i_102_ = i_101_ == 2147483647 ? 0 : 1;
	    for (int i_103_ = i; i_103_ < i_98_; i_103_++) {
		if (is[i_103_] < (i_103_ & i_102_) + i_101_) {
		    int i_104_ = is[i_103_];
		    is[i_103_] = is[i_100_];
		    is[i_100_] = i_104_;
		    Object object_105_ = objects[i_103_];
		    objects[i_103_] = objects[i_100_];
		    objects[i_100_++] = object_105_;
		}
	    }
	    is[i_98_] = is[i_100_];
	    is[i_100_] = i_101_;
	    objects[i_98_] = objects[i_100_];
	    objects[i_100_] = object;
	    Class288.method5260(is, objects, i, i_100_ - 1, (byte) 77);
	    Class288.method5260(is, objects, i_100_ + 1, i_98_, (byte) 36);
	}
    }
    
    public static void method10733(int[] is, Object[] objects) {
	Class288.method5260(is, objects, 0, is.length - 1, (byte) 29);
    }
    
    public static void method10734(int[] is, Object[] objects) {
	Class288.method5260(is, objects, 0, is.length - 1, (byte) 37);
    }
    
    public static void method10735(int[] is, Object[] objects, int i,
				   int i_106_) {
	if (i < i_106_) {
	    int i_107_ = (i_106_ + i) / 2;
	    int i_108_ = i;
	    int i_109_ = is[i_107_];
	    is[i_107_] = is[i_106_];
	    is[i_106_] = i_109_;
	    Object object = objects[i_107_];
	    objects[i_107_] = objects[i_106_];
	    objects[i_106_] = object;
	    int i_110_ = i_109_ == 2147483647 ? 0 : 1;
	    for (int i_111_ = i; i_111_ < i_106_; i_111_++) {
		if (is[i_111_] < (i_111_ & i_110_) + i_109_) {
		    int i_112_ = is[i_111_];
		    is[i_111_] = is[i_108_];
		    is[i_108_] = i_112_;
		    Object object_113_ = objects[i_111_];
		    objects[i_111_] = objects[i_108_];
		    objects[i_108_++] = object_113_;
		}
	    }
	    is[i_106_] = is[i_108_];
	    is[i_108_] = i_109_;
	    objects[i_106_] = objects[i_108_];
	    objects[i_108_] = object;
	    Class288.method5260(is, objects, i, i_108_ - 1, (byte) 41);
	    Class288.method5260(is, objects, i_108_ + 1, i_106_, (byte) 27);
	}
    }
    
    static void method10736(int[] is, float[] fs, float[] fs_114_, int i,
			    int i_115_) {
	if (i < i_115_) {
	    int i_116_ = (i_115_ + i) / 2;
	    int i_117_ = i;
	    int i_118_ = is[i_116_];
	    is[i_116_] = is[i_115_];
	    is[i_115_] = i_118_;
	    float f = fs[i_116_];
	    fs[i_116_] = fs[i_115_];
	    fs[i_115_] = f;
	    float f_119_ = fs_114_[i_116_];
	    fs_114_[i_116_] = fs_114_[i_115_];
	    fs_114_[i_115_] = f_119_;
	    int i_120_ = (long) i_118_ == 9223372036854775807L ? 0 : 1;
	    for (int i_121_ = i; i_121_ < i_115_; i_121_++) {
		if (is[i_121_] < (i_121_ & i_120_) + i_118_) {
		    int i_122_ = is[i_121_];
		    is[i_121_] = is[i_117_];
		    is[i_117_] = i_122_;
		    float f_123_ = fs[i_121_];
		    fs[i_121_] = fs[i_117_];
		    fs[i_117_] = f_123_;
		    float f_124_ = fs_114_[i_121_];
		    fs_114_[i_121_] = fs_114_[i_117_];
		    fs_114_[i_117_] = f_124_;
		    i_117_++;
		}
	    }
	    is[i_115_] = is[i_117_];
	    is[i_117_] = i_118_;
	    fs[i_115_] = fs[i_117_];
	    fs[i_117_] = f;
	    fs_114_[i_115_] = fs_114_[i_117_];
	    fs_114_[i_117_] = f_119_;
	    Class598.method9854(is, fs, fs_114_, i, i_117_ - 1, (byte) -95);
	    Class598.method9854(is, fs, fs_114_, i_117_ + 1, i_115_,
				(byte) -126);
	}
    }
    
    static void method10737(long[] ls, Object[] objects, int i, int i_125_) {
	if (i < i_125_) {
	    int i_126_ = (i + i_125_) / 2;
	    int i_127_ = i;
	    long l = ls[i_126_];
	    ls[i_126_] = ls[i_125_];
	    ls[i_125_] = l;
	    Object object = objects[i_126_];
	    objects[i_126_] = objects[i_125_];
	    objects[i_125_] = object;
	    int i_128_ = l == 9223372036854775807L ? 0 : 1;
	    for (int i_129_ = i; i_129_ < i_125_; i_129_++) {
		if (ls[i_129_] < (long) (i_129_ & i_128_) + l) {
		    long l_130_ = ls[i_129_];
		    ls[i_129_] = ls[i_127_];
		    ls[i_127_] = l_130_;
		    Object object_131_ = objects[i_129_];
		    objects[i_129_] = objects[i_127_];
		    objects[i_127_++] = object_131_;
		}
	    }
	    ls[i_125_] = ls[i_127_];
	    ls[i_127_] = l;
	    objects[i_125_] = objects[i_127_];
	    objects[i_127_] = object;
	    Class229.method4378(ls, objects, i, i_127_ - 1, 2049872836);
	    Class229.method4378(ls, objects, 1 + i_127_, i_125_, 2093811409);
	}
    }
    
    static void method10738(long[] ls, Object[] objects, int i, int i_132_) {
	if (i < i_132_) {
	    int i_133_ = (i + i_132_) / 2;
	    int i_134_ = i;
	    long l = ls[i_133_];
	    ls[i_133_] = ls[i_132_];
	    ls[i_132_] = l;
	    Object object = objects[i_133_];
	    objects[i_133_] = objects[i_132_];
	    objects[i_132_] = object;
	    int i_135_ = l == 9223372036854775807L ? 0 : 1;
	    for (int i_136_ = i; i_136_ < i_132_; i_136_++) {
		if (ls[i_136_] < (long) (i_136_ & i_135_) + l) {
		    long l_137_ = ls[i_136_];
		    ls[i_136_] = ls[i_134_];
		    ls[i_134_] = l_137_;
		    Object object_138_ = objects[i_136_];
		    objects[i_136_] = objects[i_134_];
		    objects[i_134_++] = object_138_;
		}
	    }
	    ls[i_132_] = ls[i_134_];
	    ls[i_134_] = l;
	    objects[i_132_] = objects[i_134_];
	    objects[i_134_] = object;
	    Class229.method4378(ls, objects, i, i_134_ - 1, 2074666610);
	    Class229.method4378(ls, objects, 1 + i_134_, i_132_, 2119393761);
	}
    }
    
    public static void method10739(long[] ls, int[] is) {
	Class643.method10596(ls, is, 0, ls.length - 1, (byte) 101);
    }
    
    static final void method10740(Class259 class259, Class245 class245,
				  Class683 class683, int i) {
	class259.anInt2622
	    = (class683.anIntArray8661
	       [(class683.anInt8662 -= 1552651121) * 501271953]) * 593011619;
	Class649.method10708(class259, (byte) 0);
    }
    
    static final void method10741(Class683 class683, short i) {
	int i_139_ = (class683.anIntArray8661
		      [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_139_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_139_ >> 16];
	Class279.method5154(class259, class245, class683, (byte) 22);
    }
    
    static final void method10742(Class683 class683, int i) {
	class683.anInt8662 -= 1915637188;
	int i_140_ = class683.anIntArray8661[class683.anInt8662 * 501271953];
	boolean bool
	    = class683.anIntArray8661[501271953 * class683.anInt8662 + 1] == 1;
	int i_141_
	    = class683.anIntArray8661[class683.anInt8662 * 501271953 + 2];
	boolean bool_142_
	    = 1 == class683.anIntArray8661[3 + 501271953 * class683.anInt8662];
	Class394.method6518(i_140_, bool, i_141_, bool_142_, (byte) -118);
    }
    
    static final void method10743(Class683 class683, int i) {
	class683.anInt8644 -= -438284221;
	String string
	    = ((String)
	       class683.anObjectArray8636[1373599041 * class683.anInt8644]);
	String string_143_ = (String) (class683.anObjectArray8636
				       [1 + class683.anInt8644 * 1373599041]);
	String string_144_ = (String) (class683.anObjectArray8636
				       [2 + class683.anInt8644 * 1373599041]);
	boolean bool = ((class683.anIntArray8661
			 [(class683.anInt8662 -= 1552651121) * 501271953])
			== 1);
	Class144.method2359(string, string_143_, string_144_, bool,
			    (short) 31728);
    }
    
    public static Class668 method10744(int i, int i_145_) {
	Class668[] class668s = Class486.method7857((byte) 46);
	for (int i_146_ = 0; i_146_ < class668s.length; i_146_++) {
	    Class668 class668 = class668s[i_146_];
	    if (i == -1420999111 * class668.anInt8584)
		return class668;
	}
	return null;
    }
    
    static final void method10745(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class182_Sub2.aClass228_9503.method4273((byte) -124);
    }
}
