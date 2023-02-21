/* Class639 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class639
{
    static int anInt8317 = 0;
    static int anInt8318 = 0;
    public static int[] anIntArray8319;
    
    static void method10520() {
	if (Class381.anIntArray3929 == null)
	    Class381.anIntArray3929 = new int[65536];
	else
	    return;
	double d = 0.7;
	int i = 0;
	for (int i_0_ = 0; i_0_ < 512; i_0_++) {
	    float f = (0.0078125F + (float) (i_0_ >> 3) / 64.0F) * 360.0F;
	    float f_1_ = (float) (i_0_ & 0x7) / 8.0F + 0.0625F;
	    for (int i_2_ = 0; i_2_ < 128; i_2_++) {
		float f_3_ = (float) i_2_ / 128.0F;
		float f_4_ = 0.0F;
		float f_5_ = 0.0F;
		float f_6_ = 0.0F;
		float f_7_ = f / 60.0F;
		int i_8_ = (int) f_7_;
		int i_9_ = i_8_ % 6;
		float f_10_ = f_7_ - (float) i_8_;
		float f_11_ = f_3_ * (1.0F - f_1_);
		float f_12_ = f_3_ * (1.0F - f_1_ * f_10_);
		float f_13_ = f_3_ * (1.0F - f_1_ * (1.0F - f_10_));
		if (i_9_ == 0) {
		    f_4_ = f_3_;
		    f_5_ = f_13_;
		    f_6_ = f_11_;
		} else if (i_9_ == 1) {
		    f_4_ = f_12_;
		    f_5_ = f_3_;
		    f_6_ = f_11_;
		} else if (2 == i_9_) {
		    f_4_ = f_11_;
		    f_5_ = f_3_;
		    f_6_ = f_13_;
		} else if (i_9_ == 3) {
		    f_4_ = f_11_;
		    f_5_ = f_12_;
		    f_6_ = f_3_;
		} else if (4 == i_9_) {
		    f_4_ = f_13_;
		    f_5_ = f_11_;
		    f_6_ = f_3_;
		} else if (i_9_ == 5) {
		    f_4_ = f_3_;
		    f_5_ = f_11_;
		    f_6_ = f_12_;
		}
		f_4_ = (float) Math.pow((double) f_4_, d);
		f_5_ = (float) Math.pow((double) f_5_, d);
		f_6_ = (float) Math.pow((double) f_6_, d);
		int i_14_ = (int) (f_4_ * 256.0F);
		int i_15_ = (int) (f_5_ * 256.0F);
		int i_16_ = (int) (256.0F * f_6_);
		int i_17_ = (i_15_ << 8) + ((i_14_ << 16) + -16777216) + i_16_;
		Class381.anIntArray3929[i++] = i_17_;
	    }
	}
    }
    
    public static void method10521(boolean bool, boolean bool_18_) {
	if (bool) {
	    anInt8317 += -1740306889;
	    Class398.method6543(1556510205);
	}
	if (bool_18_) {
	    anInt8318 += -114268357;
	    Class413.method6681((byte) 44);
	}
    }
    
    public static final int method10522(int i, int i_19_, int i_20_) {
	if (i_20_ > 243)
	    i_19_ >>= 4;
	else if (i_20_ > 217)
	    i_19_ >>= 3;
	else if (i_20_ > 192)
	    i_19_ >>= 2;
	else if (i_20_ > 179)
	    i_19_ >>= 1;
	return ((i & 0xff) >> 2 << 10) + (i_19_ >> 5 << 7) + (i_20_ >> 1);
    }
    
    public static void method10523(boolean bool, boolean bool_21_) {
	if (bool) {
	    anInt8317 += -1740306889;
	    Class398.method6543(-111937120);
	}
	if (bool_21_) {
	    anInt8318 += -114268357;
	    Class413.method6681((byte) 123);
	}
    }
    
    public static void method10524(boolean bool, boolean bool_22_) {
	if (bool) {
	    anInt8317 += -1740306889;
	    Class398.method6543(2020392350);
	}
	if (bool_22_) {
	    anInt8318 += -114268357;
	    Class413.method6681((byte) 23);
	}
    }
    
    public static void method10525(boolean bool, boolean bool_23_) {
	if (bool) {
	    anInt8317 += -1740306889;
	    Class398.method6543(605941572);
	}
	if (bool_23_) {
	    anInt8318 += -114268357;
	    Class413.method6681((byte) 33);
	}
    }
    
    public static void method10526(boolean bool, boolean bool_24_) {
	if (bool) {
	    anInt8317 -= -1740306889;
	    if (0 == 57118599 * anInt8317)
		Class381.anIntArray3929 = null;
	}
	if (bool_24_) {
	    anInt8318 -= -114268357;
	    if (0 == 1742199283 * anInt8318)
		Class642.anIntArray8324 = null;
	}
    }
    
    public static void method10527(boolean bool, boolean bool_25_) {
	if (bool) {
	    anInt8317 += -1740306889;
	    Class398.method6543(1896006452);
	}
	if (bool_25_) {
	    anInt8318 += -114268357;
	    Class413.method6681((byte) 41);
	}
    }
    
    public static void method10528(boolean bool, boolean bool_26_) {
	if (bool) {
	    anInt8317 -= -1740306889;
	    if (0 == 57118599 * anInt8317)
		Class381.anIntArray3929 = null;
	}
	if (bool_26_) {
	    anInt8318 -= -114268357;
	    if (0 == 1742199283 * anInt8318)
		Class642.anIntArray8324 = null;
	}
    }
    
    public static void method10529(boolean bool, boolean bool_27_) {
	if (bool) {
	    anInt8317 -= -1740306889;
	    if (0 == 57118599 * anInt8317)
		Class381.anIntArray3929 = null;
	}
	if (bool_27_) {
	    anInt8318 -= -114268357;
	    if (0 == 1742199283 * anInt8318)
		Class642.anIntArray8324 = null;
	}
    }
    
    public static void method10530(boolean bool, boolean bool_28_) {
	if (bool) {
	    anInt8317 -= -1740306889;
	    if (0 == 57118599 * anInt8317)
		Class381.anIntArray3929 = null;
	}
	if (bool_28_) {
	    anInt8318 -= -114268357;
	    if (0 == 1742199283 * anInt8318)
		Class642.anIntArray8324 = null;
	}
    }
    
    public static final int method10531(int i, int i_29_, int i_30_) {
	if (i_30_ > 243)
	    i_29_ >>= 4;
	else if (i_30_ > 217)
	    i_29_ >>= 3;
	else if (i_30_ > 192)
	    i_29_ >>= 2;
	else if (i_30_ > 179)
	    i_29_ >>= 1;
	return ((i & 0xff) >> 2 << 10) + (i_29_ >> 5 << 7) + (i_30_ >> 1);
    }
    
    public static void method10532(boolean bool, boolean bool_31_) {
	if (bool) {
	    anInt8317 -= -1740306889;
	    if (0 == 57118599 * anInt8317)
		Class381.anIntArray3929 = null;
	}
	if (bool_31_) {
	    anInt8318 -= -114268357;
	    if (0 == 1742199283 * anInt8318)
		Class642.anIntArray8324 = null;
	}
    }
    
    static void method10533() {
	if (Class381.anIntArray3929 == null)
	    Class381.anIntArray3929 = new int[65536];
	else
	    return;
	double d = 0.7;
	int i = 0;
	for (int i_32_ = 0; i_32_ < 512; i_32_++) {
	    float f = (0.0078125F + (float) (i_32_ >> 3) / 64.0F) * 360.0F;
	    float f_33_ = (float) (i_32_ & 0x7) / 8.0F + 0.0625F;
	    for (int i_34_ = 0; i_34_ < 128; i_34_++) {
		float f_35_ = (float) i_34_ / 128.0F;
		float f_36_ = 0.0F;
		float f_37_ = 0.0F;
		float f_38_ = 0.0F;
		float f_39_ = f / 60.0F;
		int i_40_ = (int) f_39_;
		int i_41_ = i_40_ % 6;
		float f_42_ = f_39_ - (float) i_40_;
		float f_43_ = f_35_ * (1.0F - f_33_);
		float f_44_ = f_35_ * (1.0F - f_33_ * f_42_);
		float f_45_ = f_35_ * (1.0F - f_33_ * (1.0F - f_42_));
		if (i_41_ == 0) {
		    f_36_ = f_35_;
		    f_37_ = f_45_;
		    f_38_ = f_43_;
		} else if (i_41_ == 1) {
		    f_36_ = f_44_;
		    f_37_ = f_35_;
		    f_38_ = f_43_;
		} else if (2 == i_41_) {
		    f_36_ = f_43_;
		    f_37_ = f_35_;
		    f_38_ = f_45_;
		} else if (i_41_ == 3) {
		    f_36_ = f_43_;
		    f_37_ = f_44_;
		    f_38_ = f_35_;
		} else if (4 == i_41_) {
		    f_36_ = f_45_;
		    f_37_ = f_43_;
		    f_38_ = f_35_;
		} else if (i_41_ == 5) {
		    f_36_ = f_35_;
		    f_37_ = f_43_;
		    f_38_ = f_44_;
		}
		f_36_ = (float) Math.pow((double) f_36_, d);
		f_37_ = (float) Math.pow((double) f_37_, d);
		f_38_ = (float) Math.pow((double) f_38_, d);
		int i_46_ = (int) (f_36_ * 256.0F);
		int i_47_ = (int) (f_37_ * 256.0F);
		int i_48_ = (int) (256.0F * f_38_);
		int i_49_ = (i_47_ << 8) + ((i_46_ << 16) + -16777216) + i_48_;
		Class381.anIntArray3929[i++] = i_49_;
	    }
	}
    }
    
    static void method10534() {
	if (Class381.anIntArray3929 == null)
	    Class381.anIntArray3929 = new int[65536];
	else
	    return;
	double d = 0.7;
	int i = 0;
	for (int i_50_ = 0; i_50_ < 512; i_50_++) {
	    float f = (0.0078125F + (float) (i_50_ >> 3) / 64.0F) * 360.0F;
	    float f_51_ = (float) (i_50_ & 0x7) / 8.0F + 0.0625F;
	    for (int i_52_ = 0; i_52_ < 128; i_52_++) {
		float f_53_ = (float) i_52_ / 128.0F;
		float f_54_ = 0.0F;
		float f_55_ = 0.0F;
		float f_56_ = 0.0F;
		float f_57_ = f / 60.0F;
		int i_58_ = (int) f_57_;
		int i_59_ = i_58_ % 6;
		float f_60_ = f_57_ - (float) i_58_;
		float f_61_ = f_53_ * (1.0F - f_51_);
		float f_62_ = f_53_ * (1.0F - f_51_ * f_60_);
		float f_63_ = f_53_ * (1.0F - f_51_ * (1.0F - f_60_));
		if (i_59_ == 0) {
		    f_54_ = f_53_;
		    f_55_ = f_63_;
		    f_56_ = f_61_;
		} else if (i_59_ == 1) {
		    f_54_ = f_62_;
		    f_55_ = f_53_;
		    f_56_ = f_61_;
		} else if (2 == i_59_) {
		    f_54_ = f_61_;
		    f_55_ = f_53_;
		    f_56_ = f_63_;
		} else if (i_59_ == 3) {
		    f_54_ = f_61_;
		    f_55_ = f_62_;
		    f_56_ = f_53_;
		} else if (4 == i_59_) {
		    f_54_ = f_63_;
		    f_55_ = f_61_;
		    f_56_ = f_53_;
		} else if (i_59_ == 5) {
		    f_54_ = f_53_;
		    f_55_ = f_61_;
		    f_56_ = f_62_;
		}
		f_54_ = (float) Math.pow((double) f_54_, d);
		f_55_ = (float) Math.pow((double) f_55_, d);
		f_56_ = (float) Math.pow((double) f_56_, d);
		int i_64_ = (int) (f_54_ * 256.0F);
		int i_65_ = (int) (f_55_ * 256.0F);
		int i_66_ = (int) (256.0F * f_56_);
		int i_67_ = (i_65_ << 8) + ((i_64_ << 16) + -16777216) + i_66_;
		Class381.anIntArray3929[i++] = i_67_;
	    }
	}
    }
    
    public static short method10535(int i) {
	int i_68_ = i >> 10 & 0x3f;
	int i_69_ = i >> 3 & 0x70;
	int i_70_ = i & 0x7f;
	i_69_ = i_70_ <= 64 ? i_69_ * i_70_ >> 7 : i_69_ * (127 - i_70_) >> 7;
	int i_71_ = i_69_ + i_70_;
	int i_72_;
	if (0 != i_71_)
	    i_72_ = (i_69_ << 8) / i_71_;
	else
	    i_72_ = i_69_ << 1;
	int i_73_ = i_71_;
	return (short) (i_68_ << 10 | i_72_ >> 4 << 7 | i_73_);
    }
    
    public static short method10536(int i) {
	int i_74_ = i >> 10 & 0x3f;
	int i_75_ = i >> 3 & 0x70;
	int i_76_ = i & 0x7f;
	i_75_ = i_76_ <= 64 ? i_75_ * i_76_ >> 7 : i_75_ * (127 - i_76_) >> 7;
	int i_77_ = i_75_ + i_76_;
	int i_78_;
	if (0 != i_77_)
	    i_78_ = (i_75_ << 8) / i_77_;
	else
	    i_78_ = i_75_ << 1;
	int i_79_ = i_77_;
	return (short) (i_74_ << 10 | i_78_ >> 4 << 7 | i_79_);
    }
    
    public static short method10537(int i) {
	int i_80_ = i >> 10 & 0x3f;
	int i_81_ = i >> 3 & 0x70;
	int i_82_ = i & 0x7f;
	i_81_ = i_82_ <= 64 ? i_81_ * i_82_ >> 7 : i_81_ * (127 - i_82_) >> 7;
	int i_83_ = i_81_ + i_82_;
	int i_84_;
	if (0 != i_83_)
	    i_84_ = (i_81_ << 8) / i_83_;
	else
	    i_84_ = i_81_ << 1;
	int i_85_ = i_83_;
	return (short) (i_80_ << 10 | i_84_ >> 4 << 7 | i_85_);
    }
    
    public static int method10538(int i, int i_86_) {
	i_86_ = (i & 0x7f) * i_86_ >> 7;
	if (i_86_ < 2)
	    i_86_ = 2;
	else if (i_86_ > 126)
	    i_86_ = 126;
	return i_86_ + (i & 0xff80);
    }
    
    public static int method10539(int i, int i_87_) {
	i_87_ = (i & 0x7f) * i_87_ >> 7;
	if (i_87_ < 2)
	    i_87_ = 2;
	else if (i_87_ > 126)
	    i_87_ = 126;
	return i_87_ + (i & 0xff80);
    }
    
    public static int method10540(int i, int i_88_) {
	int i_89_ = i_88_ >>> 24;
	int i_90_ = 255 - i_89_;
	i_88_ = ((i_88_ & 0xff00ff) * i_89_ & ~0xff00ff
		 | (i_88_ & 0xff00) * i_89_ & 0xff0000) >>> 8;
	return i_88_ + ((i_90_ * (i & 0xff00ff) & ~0xff00ff
			 | i_90_ * (i & 0xff00) & 0xff0000)
			>>> 8);
    }
    
    public static int method10541(int i, int i_91_, int i_92_) {
	int i_93_ = 255 - i_92_;
	i_91_ = ((i_91_ & 0xff00ff) * i_92_ & ~0xff00ff
		 | i_92_ * (i_91_ & 0xff00) & 0xff0000) >>> 8;
	return (((i_93_ * (i & 0xff00ff) & ~0xff00ff
		  | i_93_ * (i & 0xff00) & 0xff0000)
		 >>> 8)
		+ i_91_);
    }
    
    public static int method10542(int i, int i_94_, float f) {
	return Class525_Sub31.method16523(i, i_94_, (int) f, -1425027090);
    }
    
    public static int method10543(int i, int i_95_, float f) {
	return Class525_Sub31.method16523(i, i_95_, (int) f, -1425027090);
    }
    
    public static final int method10544(int i, int i_96_) {
	if (-1 == i)
	    return 12345678;
	i_96_ = (i & 0x7f) * i_96_ >> 7;
	if (i_96_ < 2)
	    i_96_ = 2;
	else if (i_96_ > 126)
	    i_96_ = 126;
	return (i & 0xff80) + i_96_;
    }
    
    public static int method10545(int i) {
	double d = (double) (i >> 16 & 0xff) / 256.0;
	double d_97_ = (double) (i >> 8 & 0xff) / 256.0;
	double d_98_ = (double) (i & 0xff) / 256.0;
	double d_99_ = d;
	if (d_97_ < d_99_)
	    d_99_ = d_97_;
	if (d_98_ < d_99_)
	    d_99_ = d_98_;
	double d_100_ = d;
	if (d_97_ > d_100_)
	    d_100_ = d_97_;
	if (d_98_ > d_100_)
	    d_100_ = d_98_;
	double d_101_ = 0.0;
	double d_102_ = 0.0;
	double d_103_ = (d_100_ + d_99_) / 2.0;
	if (d_100_ != d_99_) {
	    if (d_103_ < 0.5)
		d_102_ = (d_100_ - d_99_) / (d_99_ + d_100_);
	    if (d_103_ >= 0.5)
		d_102_ = (d_100_ - d_99_) / (2.0 - d_100_ - d_99_);
	    if (d == d_100_)
		d_101_ = (d_97_ - d_98_) / (d_100_ - d_99_);
	    else if (d_97_ == d_100_)
		d_101_ = (d_98_ - d) / (d_100_ - d_99_) + 2.0;
	    else if (d_98_ == d_100_)
		d_101_ = 4.0 + (d - d_97_) / (d_100_ - d_99_);
	}
	d_101_ /= 6.0;
	int i_104_ = (int) (256.0 * d_101_);
	int i_105_ = (int) (d_102_ * 256.0);
	int i_106_ = (int) (d_103_ * 256.0);
	if (i_105_ < 0)
	    i_105_ = 0;
	else if (i_105_ > 255)
	    i_105_ = 255;
	if (i_106_ < 0)
	    i_106_ = 0;
	else if (i_106_ > 255)
	    i_106_ = 255;
	if (i_106_ > 243)
	    i_105_ >>= 4;
	else if (i_106_ > 217)
	    i_105_ >>= 3;
	else if (i_106_ > 192)
	    i_105_ >>= 2;
	else if (i_106_ > 179)
	    i_105_ >>= 1;
	return ((i_105_ >> 5 << 7) + ((i_104_ & 0xff) >> 2 << 10)
		+ (i_106_ >> 1));
    }
    
    public static int method10546(int i) {
	double d = (double) (i >> 16 & 0xff) / 256.0;
	double d_107_ = (double) (i >> 8 & 0xff) / 256.0;
	double d_108_ = (double) (i & 0xff) / 256.0;
	double d_109_ = d;
	if (d_107_ < d_109_)
	    d_109_ = d_107_;
	if (d_108_ < d_109_)
	    d_109_ = d_108_;
	double d_110_ = d;
	if (d_107_ > d_110_)
	    d_110_ = d_107_;
	if (d_108_ > d_110_)
	    d_110_ = d_108_;
	double d_111_ = 0.0;
	double d_112_ = 0.0;
	double d_113_ = (d_110_ + d_109_) / 2.0;
	if (d_110_ != d_109_) {
	    if (d_113_ < 0.5)
		d_112_ = (d_110_ - d_109_) / (d_109_ + d_110_);
	    if (d_113_ >= 0.5)
		d_112_ = (d_110_ - d_109_) / (2.0 - d_110_ - d_109_);
	    if (d == d_110_)
		d_111_ = (d_107_ - d_108_) / (d_110_ - d_109_);
	    else if (d_107_ == d_110_)
		d_111_ = (d_108_ - d) / (d_110_ - d_109_) + 2.0;
	    else if (d_108_ == d_110_)
		d_111_ = 4.0 + (d - d_107_) / (d_110_ - d_109_);
	}
	d_111_ /= 6.0;
	int i_114_ = (int) (256.0 * d_111_);
	int i_115_ = (int) (d_112_ * 256.0);
	int i_116_ = (int) (d_113_ * 256.0);
	if (i_115_ < 0)
	    i_115_ = 0;
	else if (i_115_ > 255)
	    i_115_ = 255;
	if (i_116_ < 0)
	    i_116_ = 0;
	else if (i_116_ > 255)
	    i_116_ = 255;
	if (i_116_ > 243)
	    i_115_ >>= 4;
	else if (i_116_ > 217)
	    i_115_ >>= 3;
	else if (i_116_ > 192)
	    i_115_ >>= 2;
	else if (i_116_ > 179)
	    i_115_ >>= 1;
	return ((i_115_ >> 5 << 7) + ((i_114_ & 0xff) >> 2 << 10)
		+ (i_116_ >> 1));
    }
    
    public static int method10547(int i) {
	double d = (double) (i >> 16 & 0xff) / 256.0;
	double d_117_ = (double) (i >> 8 & 0xff) / 256.0;
	double d_118_ = (double) (i & 0xff) / 256.0;
	double d_119_ = d;
	if (d_117_ < d_119_)
	    d_119_ = d_117_;
	if (d_118_ < d_119_)
	    d_119_ = d_118_;
	double d_120_ = d;
	if (d_117_ > d_120_)
	    d_120_ = d_117_;
	if (d_118_ > d_120_)
	    d_120_ = d_118_;
	double d_121_ = 0.0;
	double d_122_ = 0.0;
	double d_123_ = (d_120_ + d_119_) / 2.0;
	if (d_120_ != d_119_) {
	    if (d_123_ < 0.5)
		d_122_ = (d_120_ - d_119_) / (d_119_ + d_120_);
	    if (d_123_ >= 0.5)
		d_122_ = (d_120_ - d_119_) / (2.0 - d_120_ - d_119_);
	    if (d == d_120_)
		d_121_ = (d_117_ - d_118_) / (d_120_ - d_119_);
	    else if (d_117_ == d_120_)
		d_121_ = (d_118_ - d) / (d_120_ - d_119_) + 2.0;
	    else if (d_118_ == d_120_)
		d_121_ = 4.0 + (d - d_117_) / (d_120_ - d_119_);
	}
	d_121_ /= 6.0;
	int i_124_ = (int) (256.0 * d_121_);
	int i_125_ = (int) (d_122_ * 256.0);
	int i_126_ = (int) (d_123_ * 256.0);
	if (i_125_ < 0)
	    i_125_ = 0;
	else if (i_125_ > 255)
	    i_125_ = 255;
	if (i_126_ < 0)
	    i_126_ = 0;
	else if (i_126_ > 255)
	    i_126_ = 255;
	if (i_126_ > 243)
	    i_125_ >>= 4;
	else if (i_126_ > 217)
	    i_125_ >>= 3;
	else if (i_126_ > 192)
	    i_125_ >>= 2;
	else if (i_126_ > 179)
	    i_125_ >>= 1;
	return ((i_125_ >> 5 << 7) + ((i_124_ & 0xff) >> 2 << 10)
		+ (i_126_ >> 1));
    }
    
    public static int method10548(int i) {
	double d = (double) (i >> 16 & 0xff) / 256.0;
	double d_127_ = (double) (i >> 8 & 0xff) / 256.0;
	double d_128_ = (double) (i & 0xff) / 256.0;
	double d_129_ = d;
	if (d_127_ < d_129_)
	    d_129_ = d_127_;
	if (d_128_ < d_129_)
	    d_129_ = d_128_;
	double d_130_ = d;
	if (d_127_ > d_130_)
	    d_130_ = d_127_;
	if (d_128_ > d_130_)
	    d_130_ = d_128_;
	double d_131_ = 0.0;
	double d_132_ = 0.0;
	double d_133_ = (d_130_ + d_129_) / 2.0;
	if (d_130_ != d_129_) {
	    if (d_133_ < 0.5)
		d_132_ = (d_130_ - d_129_) / (d_129_ + d_130_);
	    if (d_133_ >= 0.5)
		d_132_ = (d_130_ - d_129_) / (2.0 - d_130_ - d_129_);
	    if (d == d_130_)
		d_131_ = (d_127_ - d_128_) / (d_130_ - d_129_);
	    else if (d_127_ == d_130_)
		d_131_ = (d_128_ - d) / (d_130_ - d_129_) + 2.0;
	    else if (d_128_ == d_130_)
		d_131_ = 4.0 + (d - d_127_) / (d_130_ - d_129_);
	}
	d_131_ /= 6.0;
	int i_134_ = (int) (256.0 * d_131_);
	int i_135_ = (int) (d_132_ * 256.0);
	int i_136_ = (int) (d_133_ * 256.0);
	if (i_135_ < 0)
	    i_135_ = 0;
	else if (i_135_ > 255)
	    i_135_ = 255;
	if (i_136_ < 0)
	    i_136_ = 0;
	else if (i_136_ > 255)
	    i_136_ = 255;
	if (i_136_ > 243)
	    i_135_ >>= 4;
	else if (i_136_ > 217)
	    i_135_ >>= 3;
	else if (i_136_ > 192)
	    i_135_ >>= 2;
	else if (i_136_ > 179)
	    i_135_ >>= 1;
	return ((i_135_ >> 5 << 7) + ((i_134_ & 0xff) >> 2 << 10)
		+ (i_136_ >> 1));
    }
    
    public static short method10549(int i) {
	int i_137_ = i >> 10 & 0x3f;
	int i_138_ = i >> 3 & 0x70;
	int i_139_ = i & 0x7f;
	i_138_ = (i_139_ <= 64 ? i_138_ * i_139_ >> 7
		  : i_138_ * (127 - i_139_) >> 7);
	int i_140_ = i_138_ + i_139_;
	int i_141_;
	if (0 != i_140_)
	    i_141_ = (i_138_ << 8) / i_140_;
	else
	    i_141_ = i_138_ << 1;
	int i_142_ = i_140_;
	return (short) (i_137_ << 10 | i_141_ >> 4 << 7 | i_142_);
    }
    
    public static final int method10550(int i, int i_143_) {
	if (-1 == i)
	    return 12345678;
	i_143_ = (i & 0x7f) * i_143_ >> 7;
	if (i_143_ < 2)
	    i_143_ = 2;
	else if (i_143_ > 126)
	    i_143_ = 126;
	return (i & 0xff80) + i_143_;
    }
    
    public static final int method10551(int i, int i_144_) {
	if (-2 == i)
	    return 12345678;
	if (-1 == i) {
	    if (i_144_ < 2)
		i_144_ = 2;
	    else if (i_144_ > 126)
		i_144_ = 126;
	    return i_144_;
	}
	i_144_ = (i & 0x7f) * i_144_ >> 7;
	if (i_144_ < 2)
	    i_144_ = 2;
	else if (i_144_ > 126)
	    i_144_ = 126;
	return (i & 0xff80) + i_144_;
    }
    
    Class639() throws Throwable {
	throw new Error();
    }
    
    public static final int method10552(int i, int i_145_) {
	if (-2 == i)
	    return 12345678;
	if (-1 == i) {
	    if (i_145_ < 2)
		i_145_ = 2;
	    else if (i_145_ > 126)
		i_145_ = 126;
	    return i_145_;
	}
	i_145_ = (i & 0x7f) * i_145_ >> 7;
	if (i_145_ < 2)
	    i_145_ = 2;
	else if (i_145_ > 126)
	    i_145_ = 126;
	return (i & 0xff80) + i_145_;
    }
    
    public static final int method10553(int i, int i_146_) {
	if (-2 == i)
	    return 12345678;
	if (-1 == i) {
	    if (i_146_ < 2)
		i_146_ = 2;
	    else if (i_146_ > 126)
		i_146_ = 126;
	    return i_146_;
	}
	i_146_ = (i & 0x7f) * i_146_ >> 7;
	if (i_146_ < 2)
	    i_146_ = 2;
	else if (i_146_ > 126)
	    i_146_ = 126;
	return (i & 0xff80) + i_146_;
    }
    
    public static int method10554(int i, int i_147_, float f) {
	return Class525_Sub31.method16523(i, i_147_, (int) f, -1425027090);
    }
    
    public static final int method10555(int i, int i_148_, int i_149_) {
	if (i_149_ > 243)
	    i_148_ >>= 4;
	else if (i_149_ > 217)
	    i_148_ >>= 3;
	else if (i_149_ > 192)
	    i_148_ >>= 2;
	else if (i_149_ > 179)
	    i_148_ >>= 1;
	return ((i & 0xff) >> 2 << 10) + (i_148_ >> 5 << 7) + (i_149_ >> 1);
    }
    
    static final void method10556(Class259 class259, Class245 class245,
				  Class683 class683, byte i) {
	String string
	    = (String) (class683.anObjectArray8636
			[(class683.anInt8644 -= 1285561025) * 1373599041]);
	if (!string.equals(class259.aString2667)) {
	    class259.aString2667 = string;
	    Class649.method10708(class259, (byte) 0);
	}
	if (-1 == class259.anInt2576 * 1534974651 && !class245.aBool2428)
	    Class696_Sub27.method17230(1984678839 * class259.anInt2588,
				       (short) -28202);
    }
    
    static final void method10557(Class259 class259, Class245 class245,
				  Class683 class683, int i) {
	class259.method4740(-1789497775);
    }
    
    static final void method10558(Class683 class683, int i) {
	class683.anInt8662 -= -1189665054;
	if (class683.anIntArray8661[class683.anInt8662 * 501271953]
	    == class683.anIntArray8661[1 + 501271953 * class683.anInt8662])
	    class683.anInt8663
		+= -1827402657 * (class683.anIntArray8647
				  [class683.anInt8663 * 1931825055]);
    }
    
    public static void method10559(int i, int i_150_, int i_151_) {
	Class556_Sub1.anInt10626 = 106402817 * (i - Class556_Sub1.anInt7483);
	Class556_Sub1.anInt10627
	    = -107721765 * (i_150_ - Class556_Sub1.anInt7484);
    }
    
    static final void method10560(Class683 class683, byte i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class294.method5313(class259, class245, class683, (byte) -44);
    }
}
