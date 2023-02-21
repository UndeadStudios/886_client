/* Class167 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class167
{
    static int anInt1837;
    static int anInt1838;
    static int anInt1839;
    static int[] anIntArray1840;
    static int anInt1841;
    static int anInt1842;
    static int anInt1843;
    static int anInt1844;
    
    static void method2679() {
	anInt1841 = 0;
    }
    
    static void method2680(int i, int i_0_) {
	for (/**/; i_0_ >= i + 8; i_0_ -= 4) {
	    boolean bool = true;
	    for (int i_1_ = i + 4; i_1_ < i_0_; i_1_ += 4) {
		int i_2_ = anIntArray1840[i_1_ - 4];
		int i_3_ = anIntArray1840[i_1_];
		if (i_2_ > i_3_) {
		    bool = false;
		    anIntArray1840[i_1_ - 4] = i_3_;
		    anIntArray1840[i_1_] = i_2_;
		    i_2_ = anIntArray1840[i_1_ - 2];
		    anIntArray1840[i_1_ - 2] = anIntArray1840[i_1_ + 2];
		    anIntArray1840[i_1_ + 2] = i_2_;
		    i_2_ = anIntArray1840[i_1_ - 1];
		    anIntArray1840[i_1_ - 1] = anIntArray1840[i_1_ + 3];
		    anIntArray1840[i_1_ + 3] = i_2_;
		}
	    }
	    if (bool)
		break;
	}
    }
    
    public static void method2681(Class182 class182, int[] is, int i,
				  int[] is_4_, int[] is_5_) {
	method2682(class182, is, 0, is.length, i, is_4_, is_5_);
    }
    
    static void method2682(Class182 class182, int[] is, int i, int i_6_,
			   int i_7_, int[] is_8_, int[] is_9_) {
	int[] is_10_ = new int[4];
	class182.method3187(is_10_);
	if (is_8_ != null && is_10_[3] - is_10_[1] != is_8_.length)
	    throw new IllegalStateException();
	method2683();
	method2684(is, i, i_6_);
	method2685(is_10_[1]);
	while (method2686(is_10_[3])) {
	    int i_11_ = anInt1837;
	    int i_12_ = anInt1838;
	    int i_13_ = anInt1839;
	    if (is_8_ != null) {
		int i_14_ = i_13_ - is_10_[1];
		if (i_11_ < is_8_[i_14_] + is_10_[0])
		    i_11_ = is_8_[i_14_] + is_10_[0];
		if (i_12_ > is_8_[i_14_] + is_9_[i_14_] + is_10_[0])
		    i_12_ = is_8_[i_14_] + is_9_[i_14_] + is_10_[0];
		if (i_12_ - i_11_ <= 0)
		    continue;
	    }
	    class182.method3199(i_11_, i_13_, i_12_ - i_11_, i_7_, 1);
	}
    }
    
    static void method2683() {
	anInt1841 = 0;
    }
    
    static void method2684(int[] is, int i, int i_15_) {
	int i_16_ = anInt1841 + (i_15_ << 1);
	if (anIntArray1840 == null || anIntArray1840.length < i_16_) {
	    int[] is_17_ = new int[i_16_];
	    for (int i_18_ = 0; i_18_ < anInt1841; i_18_++)
		is_17_[i_18_] = anIntArray1840[i_18_];
	    anIntArray1840 = is_17_;
	}
	i_15_ += i;
	int i_19_ = i_15_ - 2;
	for (int i_20_ = i; i_20_ < i_15_; i_20_ += 2) {
	    int i_21_ = is[i_19_ + 1];
	    int i_22_ = is[i_20_ + 1];
	    if (i_21_ < i_22_) {
		anIntArray1840[anInt1841++] = is[i_19_];
		anIntArray1840[anInt1841++] = i_21_;
		anIntArray1840[anInt1841++] = is[i_20_];
		anIntArray1840[anInt1841++] = i_22_;
	    } else if (i_22_ < i_21_) {
		anIntArray1840[anInt1841++] = is[i_20_];
		anIntArray1840[anInt1841++] = i_22_;
		anIntArray1840[anInt1841++] = is[i_19_];
		anIntArray1840[anInt1841++] = i_21_;
	    }
	    i_19_ = i_20_;
	}
    }
    
    static void method2685(int i) {
	if (anInt1841 < 0) {
	    anInt1844 = 0;
	    anInt1843 = 0;
	    anInt1842 = 0;
	    anInt1839 = 2147483646;
	} else {
	    method2687(0, anInt1841);
	    int i_23_ = anIntArray1840[1];
	    if (i_23_ < i)
		i_23_ = i;
	    int i_24_ = 0;
	    int i_25_;
	    for (i_25_ = 0; i_25_ < anInt1841; i_25_ += 4) {
		int i_26_ = anIntArray1840[i_25_ + 1];
		if (i_23_ < i_26_)
		    break;
		int i_27_ = anIntArray1840[i_25_];
		int i_28_ = anIntArray1840[i_25_ + 2];
		int i_29_ = anIntArray1840[i_25_ + 3];
		int i_30_ = (i_28_ - i_27_ << 16) / (i_29_ - i_26_);
		int i_31_ = (i_27_ << 16) + 32768;
		anIntArray1840[i_25_] = i_31_ + (i_23_ - i_26_) * i_30_;
		anIntArray1840[i_25_ + 2] = i_30_;
	    }
	    anInt1842 = i_24_;
	    anInt1843 = i_25_;
	    anInt1844 = i_25_;
	    anInt1839 = i_23_ - 1;
	}
    }
    
    static boolean method2686(int i) {
	int i_32_ = anInt1843;
	int i_33_ = anInt1844;
	int i_34_ = anInt1839;
	int i_35_;
	for (/**/; i_33_ >= i_32_; i_33_ = i_35_) {
	    anInt1839 = ++i_34_;
	    if (i_34_ >= i)
		return false;
	    i_35_ = anInt1842;
	    for (/**/; i_32_ < anInt1841; i_32_ += 4) {
		int i_36_ = anIntArray1840[i_32_ + 1];
		if (i_34_ < i_36_)
		    break;
		int i_37_ = anIntArray1840[i_32_];
		int i_38_ = anIntArray1840[i_32_ + 2];
		int i_39_ = anIntArray1840[i_32_ + 3];
		int i_40_ = (i_38_ - i_37_ << 16) / (i_39_ - i_36_);
		int i_41_ = (i_37_ << 16) + 32768;
		anIntArray1840[i_32_] = i_41_;
		anIntArray1840[i_32_ + 2] = i_40_;
	    }
	    for (int i_42_ = i_35_; i_42_ < i_32_; i_42_ += 4) {
		int i_43_ = anIntArray1840[i_42_ + 3];
		if (i_34_ >= i_43_) {
		    anIntArray1840[i_42_] = anIntArray1840[i_35_];
		    anIntArray1840[i_42_ + 1] = anIntArray1840[i_35_ + 1];
		    anIntArray1840[i_42_ + 2] = anIntArray1840[i_35_ + 2];
		    anIntArray1840[i_42_ + 3] = anIntArray1840[i_35_ + 3];
		    i_35_ += 4;
		}
	    }
	    if (i_35_ == anInt1841) {
		anInt1841 = 0;
		return false;
	    }
	    method2695(i_35_, i_32_);
	    anInt1842 = i_35_;
	    anInt1843 = i_32_;
	}
	anInt1837 = anIntArray1840[i_33_] >> 16;
	anInt1838 = anIntArray1840[i_33_ + 4] >> 16;
	anIntArray1840[i_33_] += anIntArray1840[i_33_ + 2];
	anIntArray1840[i_33_ + 4] += anIntArray1840[i_33_ + 6];
	i_33_ += 8;
	anInt1844 = i_33_;
	return true;
    }
    
    static void method2687(int i, int i_44_) {
	if (i_44_ > i + 4) {
	    int i_45_ = i;
	    int i_46_ = anIntArray1840[i_45_];
	    int i_47_ = anIntArray1840[i_45_ + 1];
	    int i_48_ = anIntArray1840[i_45_ + 2];
	    int i_49_ = anIntArray1840[i_45_ + 3];
	    for (int i_50_ = i + 4; i_50_ < i_44_; i_50_ += 4) {
		int i_51_ = anIntArray1840[i_50_ + 1];
		if (i_51_ < i_47_) {
		    anIntArray1840[i_45_] = anIntArray1840[i_50_];
		    anIntArray1840[i_45_ + 1] = i_51_;
		    anIntArray1840[i_45_ + 2] = anIntArray1840[i_50_ + 2];
		    anIntArray1840[i_45_ + 3] = anIntArray1840[i_50_ + 3];
		    i_45_ += 4;
		    anIntArray1840[i_50_] = anIntArray1840[i_45_];
		    anIntArray1840[i_50_ + 1] = anIntArray1840[i_45_ + 1];
		    anIntArray1840[i_50_ + 2] = anIntArray1840[i_45_ + 2];
		    anIntArray1840[i_50_ + 3] = anIntArray1840[i_45_ + 3];
		}
	    }
	    anIntArray1840[i_45_] = i_46_;
	    anIntArray1840[i_45_ + 1] = i_47_;
	    anIntArray1840[i_45_ + 2] = i_48_;
	    anIntArray1840[i_45_ + 3] = i_49_;
	    method2687(i, i_45_);
	    method2687(i_45_ + 4, i_44_);
	}
    }
    
    static void method2688(int i, int i_52_) {
	if (i_52_ > i + 4) {
	    int i_53_ = i;
	    int i_54_ = anIntArray1840[i_53_];
	    int i_55_ = anIntArray1840[i_53_ + 1];
	    int i_56_ = anIntArray1840[i_53_ + 2];
	    int i_57_ = anIntArray1840[i_53_ + 3];
	    for (int i_58_ = i + 4; i_58_ < i_52_; i_58_ += 4) {
		int i_59_ = anIntArray1840[i_58_ + 1];
		if (i_59_ < i_55_) {
		    anIntArray1840[i_53_] = anIntArray1840[i_58_];
		    anIntArray1840[i_53_ + 1] = i_59_;
		    anIntArray1840[i_53_ + 2] = anIntArray1840[i_58_ + 2];
		    anIntArray1840[i_53_ + 3] = anIntArray1840[i_58_ + 3];
		    i_53_ += 4;
		    anIntArray1840[i_58_] = anIntArray1840[i_53_];
		    anIntArray1840[i_58_ + 1] = anIntArray1840[i_53_ + 1];
		    anIntArray1840[i_58_ + 2] = anIntArray1840[i_53_ + 2];
		    anIntArray1840[i_58_ + 3] = anIntArray1840[i_53_ + 3];
		}
	    }
	    anIntArray1840[i_53_] = i_54_;
	    anIntArray1840[i_53_ + 1] = i_55_;
	    anIntArray1840[i_53_ + 2] = i_56_;
	    anIntArray1840[i_53_ + 3] = i_57_;
	    method2687(i, i_53_);
	    method2687(i_53_ + 4, i_52_);
	}
    }
    
    public static void method2689(Class182 class182, int[] is, int i) {
	method2682(class182, is, 0, is.length, i, null, null);
    }
    
    public static void method2690(Class182 class182, int[] is, int i,
				  int[] is_60_, int[] is_61_) {
	method2682(class182, is, 0, is.length, i, is_60_, is_61_);
    }
    
    static void method2691(int i) {
	if (anInt1841 < 0) {
	    anInt1844 = 0;
	    anInt1843 = 0;
	    anInt1842 = 0;
	    anInt1839 = 2147483646;
	} else {
	    method2687(0, anInt1841);
	    int i_62_ = anIntArray1840[1];
	    if (i_62_ < i)
		i_62_ = i;
	    int i_63_ = 0;
	    int i_64_;
	    for (i_64_ = 0; i_64_ < anInt1841; i_64_ += 4) {
		int i_65_ = anIntArray1840[i_64_ + 1];
		if (i_62_ < i_65_)
		    break;
		int i_66_ = anIntArray1840[i_64_];
		int i_67_ = anIntArray1840[i_64_ + 2];
		int i_68_ = anIntArray1840[i_64_ + 3];
		int i_69_ = (i_67_ - i_66_ << 16) / (i_68_ - i_65_);
		int i_70_ = (i_66_ << 16) + 32768;
		anIntArray1840[i_64_] = i_70_ + (i_62_ - i_65_) * i_69_;
		anIntArray1840[i_64_ + 2] = i_69_;
	    }
	    anInt1842 = i_63_;
	    anInt1843 = i_64_;
	    anInt1844 = i_64_;
	    anInt1839 = i_62_ - 1;
	}
    }
    
    static void method2692(int i, int i_71_) {
	if (i_71_ > i + 4) {
	    int i_72_ = i;
	    int i_73_ = anIntArray1840[i_72_];
	    int i_74_ = anIntArray1840[i_72_ + 1];
	    int i_75_ = anIntArray1840[i_72_ + 2];
	    int i_76_ = anIntArray1840[i_72_ + 3];
	    for (int i_77_ = i + 4; i_77_ < i_71_; i_77_ += 4) {
		int i_78_ = anIntArray1840[i_77_ + 1];
		if (i_78_ < i_74_) {
		    anIntArray1840[i_72_] = anIntArray1840[i_77_];
		    anIntArray1840[i_72_ + 1] = i_78_;
		    anIntArray1840[i_72_ + 2] = anIntArray1840[i_77_ + 2];
		    anIntArray1840[i_72_ + 3] = anIntArray1840[i_77_ + 3];
		    i_72_ += 4;
		    anIntArray1840[i_77_] = anIntArray1840[i_72_];
		    anIntArray1840[i_77_ + 1] = anIntArray1840[i_72_ + 1];
		    anIntArray1840[i_77_ + 2] = anIntArray1840[i_72_ + 2];
		    anIntArray1840[i_77_ + 3] = anIntArray1840[i_72_ + 3];
		}
	    }
	    anIntArray1840[i_72_] = i_73_;
	    anIntArray1840[i_72_ + 1] = i_74_;
	    anIntArray1840[i_72_ + 2] = i_75_;
	    anIntArray1840[i_72_ + 3] = i_76_;
	    method2687(i, i_72_);
	    method2687(i_72_ + 4, i_71_);
	}
    }
    
    static void method2693(Class182 class182, int[] is, int i, int i_79_,
			   int i_80_, int[] is_81_, int[] is_82_) {
	int[] is_83_ = new int[4];
	class182.method3187(is_83_);
	if (is_81_ != null && is_83_[3] - is_83_[1] != is_81_.length)
	    throw new IllegalStateException();
	method2683();
	method2684(is, i, i_79_);
	method2685(is_83_[1]);
	while (method2686(is_83_[3])) {
	    int i_84_ = anInt1837;
	    int i_85_ = anInt1838;
	    int i_86_ = anInt1839;
	    if (is_81_ != null) {
		int i_87_ = i_86_ - is_83_[1];
		if (i_84_ < is_81_[i_87_] + is_83_[0])
		    i_84_ = is_81_[i_87_] + is_83_[0];
		if (i_85_ > is_81_[i_87_] + is_82_[i_87_] + is_83_[0])
		    i_85_ = is_81_[i_87_] + is_82_[i_87_] + is_83_[0];
		if (i_85_ - i_84_ <= 0)
		    continue;
	    }
	    class182.method3199(i_84_, i_86_, i_85_ - i_84_, i_80_, 1);
	}
    }
    
    public static void method2694(Class182 class182, int[] is, int i) {
	method2682(class182, is, 0, is.length, i, null, null);
    }
    
    static void method2695(int i, int i_88_) {
	for (/**/; i_88_ >= i + 8; i_88_ -= 4) {
	    boolean bool = true;
	    for (int i_89_ = i + 4; i_89_ < i_88_; i_89_ += 4) {
		int i_90_ = anIntArray1840[i_89_ - 4];
		int i_91_ = anIntArray1840[i_89_];
		if (i_90_ > i_91_) {
		    bool = false;
		    anIntArray1840[i_89_ - 4] = i_91_;
		    anIntArray1840[i_89_] = i_90_;
		    i_90_ = anIntArray1840[i_89_ - 2];
		    anIntArray1840[i_89_ - 2] = anIntArray1840[i_89_ + 2];
		    anIntArray1840[i_89_ + 2] = i_90_;
		    i_90_ = anIntArray1840[i_89_ - 1];
		    anIntArray1840[i_89_ - 1] = anIntArray1840[i_89_ + 3];
		    anIntArray1840[i_89_ + 3] = i_90_;
		}
	    }
	    if (bool)
		break;
	}
    }
    
    static void method2696() {
	anInt1841 = 0;
    }
    
    static void method2697() {
	anInt1841 = 0;
    }
    
    Class167() throws Throwable {
	throw new Error();
    }
    
    static void method2698(int i) {
	if (anInt1841 < 0) {
	    anInt1844 = 0;
	    anInt1843 = 0;
	    anInt1842 = 0;
	    anInt1839 = 2147483646;
	} else {
	    method2687(0, anInt1841);
	    int i_92_ = anIntArray1840[1];
	    if (i_92_ < i)
		i_92_ = i;
	    int i_93_ = 0;
	    int i_94_;
	    for (i_94_ = 0; i_94_ < anInt1841; i_94_ += 4) {
		int i_95_ = anIntArray1840[i_94_ + 1];
		if (i_92_ < i_95_)
		    break;
		int i_96_ = anIntArray1840[i_94_];
		int i_97_ = anIntArray1840[i_94_ + 2];
		int i_98_ = anIntArray1840[i_94_ + 3];
		int i_99_ = (i_97_ - i_96_ << 16) / (i_98_ - i_95_);
		int i_100_ = (i_96_ << 16) + 32768;
		anIntArray1840[i_94_] = i_100_ + (i_92_ - i_95_) * i_99_;
		anIntArray1840[i_94_ + 2] = i_99_;
	    }
	    anInt1842 = i_93_;
	    anInt1843 = i_94_;
	    anInt1844 = i_94_;
	    anInt1839 = i_92_ - 1;
	}
    }
    
    static boolean method2699(int i) {
	int i_101_ = anInt1843;
	int i_102_ = anInt1844;
	int i_103_ = anInt1839;
	int i_104_;
	for (/**/; i_102_ >= i_101_; i_102_ = i_104_) {
	    anInt1839 = ++i_103_;
	    if (i_103_ >= i)
		return false;
	    i_104_ = anInt1842;
	    for (/**/; i_101_ < anInt1841; i_101_ += 4) {
		int i_105_ = anIntArray1840[i_101_ + 1];
		if (i_103_ < i_105_)
		    break;
		int i_106_ = anIntArray1840[i_101_];
		int i_107_ = anIntArray1840[i_101_ + 2];
		int i_108_ = anIntArray1840[i_101_ + 3];
		int i_109_ = (i_107_ - i_106_ << 16) / (i_108_ - i_105_);
		int i_110_ = (i_106_ << 16) + 32768;
		anIntArray1840[i_101_] = i_110_;
		anIntArray1840[i_101_ + 2] = i_109_;
	    }
	    for (int i_111_ = i_104_; i_111_ < i_101_; i_111_ += 4) {
		int i_112_ = anIntArray1840[i_111_ + 3];
		if (i_103_ >= i_112_) {
		    anIntArray1840[i_111_] = anIntArray1840[i_104_];
		    anIntArray1840[i_111_ + 1] = anIntArray1840[i_104_ + 1];
		    anIntArray1840[i_111_ + 2] = anIntArray1840[i_104_ + 2];
		    anIntArray1840[i_111_ + 3] = anIntArray1840[i_104_ + 3];
		    i_104_ += 4;
		}
	    }
	    if (i_104_ == anInt1841) {
		anInt1841 = 0;
		return false;
	    }
	    method2695(i_104_, i_101_);
	    anInt1842 = i_104_;
	    anInt1843 = i_101_;
	}
	anInt1837 = anIntArray1840[i_102_] >> 16;
	anInt1838 = anIntArray1840[i_102_ + 4] >> 16;
	anIntArray1840[i_102_] += anIntArray1840[i_102_ + 2];
	anIntArray1840[i_102_ + 4] += anIntArray1840[i_102_ + 6];
	i_102_ += 8;
	anInt1844 = i_102_;
	return true;
    }
    
    static boolean method2700(int i) {
	int i_113_ = anInt1843;
	int i_114_ = anInt1844;
	int i_115_ = anInt1839;
	int i_116_;
	for (/**/; i_114_ >= i_113_; i_114_ = i_116_) {
	    anInt1839 = ++i_115_;
	    if (i_115_ >= i)
		return false;
	    i_116_ = anInt1842;
	    for (/**/; i_113_ < anInt1841; i_113_ += 4) {
		int i_117_ = anIntArray1840[i_113_ + 1];
		if (i_115_ < i_117_)
		    break;
		int i_118_ = anIntArray1840[i_113_];
		int i_119_ = anIntArray1840[i_113_ + 2];
		int i_120_ = anIntArray1840[i_113_ + 3];
		int i_121_ = (i_119_ - i_118_ << 16) / (i_120_ - i_117_);
		int i_122_ = (i_118_ << 16) + 32768;
		anIntArray1840[i_113_] = i_122_;
		anIntArray1840[i_113_ + 2] = i_121_;
	    }
	    for (int i_123_ = i_116_; i_123_ < i_113_; i_123_ += 4) {
		int i_124_ = anIntArray1840[i_123_ + 3];
		if (i_115_ >= i_124_) {
		    anIntArray1840[i_123_] = anIntArray1840[i_116_];
		    anIntArray1840[i_123_ + 1] = anIntArray1840[i_116_ + 1];
		    anIntArray1840[i_123_ + 2] = anIntArray1840[i_116_ + 2];
		    anIntArray1840[i_123_ + 3] = anIntArray1840[i_116_ + 3];
		    i_116_ += 4;
		}
	    }
	    if (i_116_ == anInt1841) {
		anInt1841 = 0;
		return false;
	    }
	    method2695(i_116_, i_113_);
	    anInt1842 = i_116_;
	    anInt1843 = i_113_;
	}
	anInt1837 = anIntArray1840[i_114_] >> 16;
	anInt1838 = anIntArray1840[i_114_ + 4] >> 16;
	anIntArray1840[i_114_] += anIntArray1840[i_114_ + 2];
	anIntArray1840[i_114_ + 4] += anIntArray1840[i_114_ + 6];
	i_114_ += 8;
	anInt1844 = i_114_;
	return true;
    }
    
    static boolean method2701(int i) {
	int i_125_ = anInt1843;
	int i_126_ = anInt1844;
	int i_127_ = anInt1839;
	int i_128_;
	for (/**/; i_126_ >= i_125_; i_126_ = i_128_) {
	    anInt1839 = ++i_127_;
	    if (i_127_ >= i)
		return false;
	    i_128_ = anInt1842;
	    for (/**/; i_125_ < anInt1841; i_125_ += 4) {
		int i_129_ = anIntArray1840[i_125_ + 1];
		if (i_127_ < i_129_)
		    break;
		int i_130_ = anIntArray1840[i_125_];
		int i_131_ = anIntArray1840[i_125_ + 2];
		int i_132_ = anIntArray1840[i_125_ + 3];
		int i_133_ = (i_131_ - i_130_ << 16) / (i_132_ - i_129_);
		int i_134_ = (i_130_ << 16) + 32768;
		anIntArray1840[i_125_] = i_134_;
		anIntArray1840[i_125_ + 2] = i_133_;
	    }
	    for (int i_135_ = i_128_; i_135_ < i_125_; i_135_ += 4) {
		int i_136_ = anIntArray1840[i_135_ + 3];
		if (i_127_ >= i_136_) {
		    anIntArray1840[i_135_] = anIntArray1840[i_128_];
		    anIntArray1840[i_135_ + 1] = anIntArray1840[i_128_ + 1];
		    anIntArray1840[i_135_ + 2] = anIntArray1840[i_128_ + 2];
		    anIntArray1840[i_135_ + 3] = anIntArray1840[i_128_ + 3];
		    i_128_ += 4;
		}
	    }
	    if (i_128_ == anInt1841) {
		anInt1841 = 0;
		return false;
	    }
	    method2695(i_128_, i_125_);
	    anInt1842 = i_128_;
	    anInt1843 = i_125_;
	}
	anInt1837 = anIntArray1840[i_126_] >> 16;
	anInt1838 = anIntArray1840[i_126_ + 4] >> 16;
	anIntArray1840[i_126_] += anIntArray1840[i_126_ + 2];
	anIntArray1840[i_126_ + 4] += anIntArray1840[i_126_ + 6];
	i_126_ += 8;
	anInt1844 = i_126_;
	return true;
    }
    
    static boolean method2702(int i) {
	int i_137_ = anInt1843;
	int i_138_ = anInt1844;
	int i_139_ = anInt1839;
	int i_140_;
	for (/**/; i_138_ >= i_137_; i_138_ = i_140_) {
	    anInt1839 = ++i_139_;
	    if (i_139_ >= i)
		return false;
	    i_140_ = anInt1842;
	    for (/**/; i_137_ < anInt1841; i_137_ += 4) {
		int i_141_ = anIntArray1840[i_137_ + 1];
		if (i_139_ < i_141_)
		    break;
		int i_142_ = anIntArray1840[i_137_];
		int i_143_ = anIntArray1840[i_137_ + 2];
		int i_144_ = anIntArray1840[i_137_ + 3];
		int i_145_ = (i_143_ - i_142_ << 16) / (i_144_ - i_141_);
		int i_146_ = (i_142_ << 16) + 32768;
		anIntArray1840[i_137_] = i_146_;
		anIntArray1840[i_137_ + 2] = i_145_;
	    }
	    for (int i_147_ = i_140_; i_147_ < i_137_; i_147_ += 4) {
		int i_148_ = anIntArray1840[i_147_ + 3];
		if (i_139_ >= i_148_) {
		    anIntArray1840[i_147_] = anIntArray1840[i_140_];
		    anIntArray1840[i_147_ + 1] = anIntArray1840[i_140_ + 1];
		    anIntArray1840[i_147_ + 2] = anIntArray1840[i_140_ + 2];
		    anIntArray1840[i_147_ + 3] = anIntArray1840[i_140_ + 3];
		    i_140_ += 4;
		}
	    }
	    if (i_140_ == anInt1841) {
		anInt1841 = 0;
		return false;
	    }
	    method2695(i_140_, i_137_);
	    anInt1842 = i_140_;
	    anInt1843 = i_137_;
	}
	anInt1837 = anIntArray1840[i_138_] >> 16;
	anInt1838 = anIntArray1840[i_138_ + 4] >> 16;
	anIntArray1840[i_138_] += anIntArray1840[i_138_ + 2];
	anIntArray1840[i_138_ + 4] += anIntArray1840[i_138_ + 6];
	i_138_ += 8;
	anInt1844 = i_138_;
	return true;
    }
    
    static void method2703() {
	anInt1841 = 0;
    }
    
    static void method2704(int i, int i_149_) {
	if (i_149_ > i + 4) {
	    int i_150_ = i;
	    int i_151_ = anIntArray1840[i_150_];
	    int i_152_ = anIntArray1840[i_150_ + 1];
	    int i_153_ = anIntArray1840[i_150_ + 2];
	    int i_154_ = anIntArray1840[i_150_ + 3];
	    for (int i_155_ = i + 4; i_155_ < i_149_; i_155_ += 4) {
		int i_156_ = anIntArray1840[i_155_ + 1];
		if (i_156_ < i_152_) {
		    anIntArray1840[i_150_] = anIntArray1840[i_155_];
		    anIntArray1840[i_150_ + 1] = i_156_;
		    anIntArray1840[i_150_ + 2] = anIntArray1840[i_155_ + 2];
		    anIntArray1840[i_150_ + 3] = anIntArray1840[i_155_ + 3];
		    i_150_ += 4;
		    anIntArray1840[i_155_] = anIntArray1840[i_150_];
		    anIntArray1840[i_155_ + 1] = anIntArray1840[i_150_ + 1];
		    anIntArray1840[i_155_ + 2] = anIntArray1840[i_150_ + 2];
		    anIntArray1840[i_155_ + 3] = anIntArray1840[i_150_ + 3];
		}
	    }
	    anIntArray1840[i_150_] = i_151_;
	    anIntArray1840[i_150_ + 1] = i_152_;
	    anIntArray1840[i_150_ + 2] = i_153_;
	    anIntArray1840[i_150_ + 3] = i_154_;
	    method2687(i, i_150_);
	    method2687(i_150_ + 4, i_149_);
	}
    }
    
    static void method2705(Class182 class182, int[] is, int i, int i_157_,
			   int i_158_, int[] is_159_, int[] is_160_) {
	int[] is_161_ = new int[4];
	class182.method3187(is_161_);
	if (is_159_ != null && is_161_[3] - is_161_[1] != is_159_.length)
	    throw new IllegalStateException();
	method2683();
	method2684(is, i, i_157_);
	method2685(is_161_[1]);
	while (method2686(is_161_[3])) {
	    int i_162_ = anInt1837;
	    int i_163_ = anInt1838;
	    int i_164_ = anInt1839;
	    if (is_159_ != null) {
		int i_165_ = i_164_ - is_161_[1];
		if (i_162_ < is_159_[i_165_] + is_161_[0])
		    i_162_ = is_159_[i_165_] + is_161_[0];
		if (i_163_ > is_159_[i_165_] + is_160_[i_165_] + is_161_[0])
		    i_163_ = is_159_[i_165_] + is_160_[i_165_] + is_161_[0];
		if (i_163_ - i_162_ <= 0)
		    continue;
	    }
	    class182.method3199(i_162_, i_164_, i_163_ - i_162_, i_158_, 1);
	}
    }
    
    static void method2706(int i, int i_166_) {
	for (/**/; i_166_ >= i + 8; i_166_ -= 4) {
	    boolean bool = true;
	    for (int i_167_ = i + 4; i_167_ < i_166_; i_167_ += 4) {
		int i_168_ = anIntArray1840[i_167_ - 4];
		int i_169_ = anIntArray1840[i_167_];
		if (i_168_ > i_169_) {
		    bool = false;
		    anIntArray1840[i_167_ - 4] = i_169_;
		    anIntArray1840[i_167_] = i_168_;
		    i_168_ = anIntArray1840[i_167_ - 2];
		    anIntArray1840[i_167_ - 2] = anIntArray1840[i_167_ + 2];
		    anIntArray1840[i_167_ + 2] = i_168_;
		    i_168_ = anIntArray1840[i_167_ - 1];
		    anIntArray1840[i_167_ - 1] = anIntArray1840[i_167_ + 3];
		    anIntArray1840[i_167_ + 3] = i_168_;
		}
	    }
	    if (bool)
		break;
	}
    }
    
    static void method2707() {
	anInt1841 = 0;
    }
    
    static void method2708(int i, int i_170_) {
	for (/**/; i_170_ >= i + 8; i_170_ -= 4) {
	    boolean bool = true;
	    for (int i_171_ = i + 4; i_171_ < i_170_; i_171_ += 4) {
		int i_172_ = anIntArray1840[i_171_ - 4];
		int i_173_ = anIntArray1840[i_171_];
		if (i_172_ > i_173_) {
		    bool = false;
		    anIntArray1840[i_171_ - 4] = i_173_;
		    anIntArray1840[i_171_] = i_172_;
		    i_172_ = anIntArray1840[i_171_ - 2];
		    anIntArray1840[i_171_ - 2] = anIntArray1840[i_171_ + 2];
		    anIntArray1840[i_171_ + 2] = i_172_;
		    i_172_ = anIntArray1840[i_171_ - 1];
		    anIntArray1840[i_171_ - 1] = anIntArray1840[i_171_ + 3];
		    anIntArray1840[i_171_ + 3] = i_172_;
		}
	    }
	    if (bool)
		break;
	}
    }
}
