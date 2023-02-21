/* Class136 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaggl.OpenGL;

public abstract class Class136
{
    Class182_Sub3 aClass182_Sub3_1617;
    static final int anInt1618 = 3553;
    static final int anInt1619 = 3552;
    static final int anInt1620 = 34067;
    static final int anInt1621 = 32879;
    static final int anInt1622 = 5121;
    int anInt1623;
    Class165 aClass165_1624;
    int anInt1625;
    boolean aBool1626 = false;
    Class178 aClass178_1627;
    boolean aBool1628;
    static int[] anIntArray1629 = new int[1];
    int anInt1630;
    static final int anInt1631 = 34037;
    
    void method2303(boolean bool) {
	if (aBool1628 != bool) {
	    int i = method2312();
	    aBool1628 = true;
	    method2305();
	    method2326(i);
	}
    }
    
    void method2304(boolean bool) {
	if (aBool1626 != bool) {
	    aBool1626 = bool;
	    method2305();
	}
    }
    
    void method2305() {
	aClass182_Sub3_1617.method15395(this);
	if (aBool1626) {
	    OpenGL.glTexParameteri(anInt1625, 10241, aBool1628 ? 9987 : 9729);
	    OpenGL.glTexParameteri(anInt1625, 10240, 9729);
	} else {
	    OpenGL.glTexParameteri(anInt1625, 10241, aBool1628 ? 9984 : 9728);
	    OpenGL.glTexParameteri(anInt1625, 10240, 9728);
	}
    }
    
    boolean method2306() {
	if (aClass182_Sub3_1617.aBool9797) {
	    int i = method2312();
	    aClass182_Sub3_1617.method15395(this);
	    OpenGL.glGenerateMipmapEXT(anInt1625);
	    aBool1628 = true;
	    method2305();
	    method2326(i);
	    return true;
	}
	return false;
    }
    
    void method2307() {
	if (anInt1623 != 0) {
	    aClass182_Sub3_1617.anInt9709 -= method2312();
	    int[] is = new int[1];
	    is[0] = anInt1623;
	    OpenGL.glDeleteTextures(1, is, 0);
	    anInt1623 = 0;
	}
    }
    
    void method2308(int i) {
	aClass182_Sub3_1617.anInt9709 -= i;
	aClass182_Sub3_1617.anInt9709 += method2312();
    }
    
    static void method2309(int i, int i_0_, int i_1_, int i_2_,
			   Class165 class165, byte[] is) {
	if (i_1_ > 0 && !Class72.method1537(i_1_, (byte) 0))
	    throw new IllegalArgumentException("");
	if (i_2_ > 0 && !Class72.method1537(i_2_, (byte) 0))
	    throw new IllegalArgumentException("");
	int i_3_ = class165.anInt1770 * -1998053519;
	int i_4_ = 0;
	int i_5_ = i_1_ < i_2_ ? i_1_ : i_2_;
	int i_6_ = i_1_ >> 1;
	int i_7_ = i_2_ >> 1;
	byte[] is_8_ = is;
	byte[] is_9_ = new byte[i_6_ * i_7_ * i_3_];
	for (;;) {
	    OpenGL.glTexImage2Dub(i, i_4_, i_0_, i_1_, i_2_, 0,
				  Class182_Sub3.method15421(class165), 5121,
				  is_8_, 0);
	    if (i_5_ <= 1)
		break;
	    int i_10_ = i_1_ * i_3_;
	    for (int i_11_ = 0; i_11_ < i_3_; i_11_++) {
		int i_12_ = i_11_;
		int i_13_ = i_11_;
		int i_14_ = i_13_ + i_10_;
		for (int i_15_ = 0; i_15_ < i_7_; i_15_++) {
		    for (int i_16_ = 0; i_16_ < i_6_; i_16_++) {
			int i_17_ = is_8_[i_13_];
			i_13_ += i_3_;
			i_17_ += is_8_[i_13_];
			i_13_ += i_3_;
			i_17_ += is_8_[i_14_];
			i_14_ += i_3_;
			i_17_ += is_8_[i_14_];
			i_14_ += i_3_;
			is_9_[i_12_] = (byte) (i_17_ >> 2);
			i_12_ += i_3_;
		    }
		    i_13_ += i_10_;
		    i_14_ += i_10_;
		}
	    }
	    byte[] is_18_ = is_9_;
	    is_9_ = is_8_;
	    is_8_ = is_18_;
	    i_1_ = i_6_;
	    i_2_ = i_7_;
	    i_6_ >>= 1;
	    i_7_ >>= 1;
	    i_5_ >>= 1;
	    i_4_++;
	}
    }
    
    void method2310() {
	if (anInt1623 != 0) {
	    aClass182_Sub3_1617.anInt9709 -= method2312();
	    int[] is = new int[1];
	    is[0] = anInt1623;
	    OpenGL.glDeleteTextures(1, is, 0);
	    anInt1623 = 0;
	}
    }
    
    void method2311() {
	if (anInt1623 != 0) {
	    aClass182_Sub3_1617.anInt9709 -= method2312();
	    int[] is = new int[1];
	    is[0] = anInt1623;
	    OpenGL.glDeleteTextures(1, is, 0);
	    anInt1623 = 0;
	}
    }
    
    int method2312() {
	int i = (aClass165_1624.anInt1770 * -1998053519
		 * (aClass178_1627.anInt1915 * -103623665) * anInt1630);
	return aBool1628 ? i * 4 / 3 : i;
    }
    
    static void method2313(int i, int i_19_, int i_20_, int i_21_, int i_22_,
			   int i_23_, int[] is) {
	if (i_20_ > 0 && !Class72.method1537(i_20_, (byte) 0))
	    throw new IllegalArgumentException("");
	if (i_21_ > 0 && !Class72.method1537(i_21_, (byte) 0))
	    throw new IllegalArgumentException("");
	if (i_22_ != 32993)
	    throw new IllegalArgumentException("");
	int i_24_ = 0;
	int i_25_ = i_20_ < i_21_ ? i_20_ : i_21_;
	int i_26_ = i_20_ >> 1;
	int i_27_ = i_21_ >> 1;
	int[] is_28_ = is;
	int[] is_29_ = new int[i_26_ * i_27_];
	for (;;) {
	    OpenGL.glTexImage2Di(i, i_24_, i_19_, i_20_, i_21_, 0, i_22_,
				 i_23_, is_28_, 0);
	    if (i_25_ <= 1)
		break;
	    int i_30_ = 0;
	    int i_31_ = 0;
	    int i_32_ = i_31_ + i_20_;
	    for (int i_33_ = 0; i_33_ < i_27_; i_33_++) {
		for (int i_34_ = 0; i_34_ < i_26_; i_34_++) {
		    int i_35_ = is_28_[i_31_++];
		    int i_36_ = is_28_[i_31_++];
		    int i_37_ = is_28_[i_32_++];
		    int i_38_ = is_28_[i_32_++];
		    int i_39_ = i_35_ >> 24 & 0xff;
		    int i_40_ = i_35_ >> 16 & 0xff;
		    int i_41_ = i_35_ >> 8 & 0xff;
		    int i_42_ = i_35_ & 0xff;
		    i_39_ += i_36_ >> 24 & 0xff;
		    i_40_ += i_36_ >> 16 & 0xff;
		    i_41_ += i_36_ >> 8 & 0xff;
		    i_42_ += i_36_ & 0xff;
		    i_39_ += i_37_ >> 24 & 0xff;
		    i_40_ += i_37_ >> 16 & 0xff;
		    i_41_ += i_37_ >> 8 & 0xff;
		    i_42_ += i_37_ & 0xff;
		    i_39_ += i_38_ >> 24 & 0xff;
		    i_40_ += i_38_ >> 16 & 0xff;
		    i_41_ += i_38_ >> 8 & 0xff;
		    i_42_ += i_38_ & 0xff;
		    is_29_[i_30_++]
			= ((i_39_ & 0x3fc) << 22 | (i_40_ & 0x3fc) << 14
			   | (i_41_ & 0x3fc) << 6 | (i_42_ & 0x3fc) >> 2);
		}
		i_31_ += i_20_;
		i_32_ += i_20_;
	    }
	    int[] is_43_ = is_29_;
	    is_29_ = is_28_;
	    is_28_ = is_43_;
	    i_20_ = i_26_;
	    i_21_ = i_27_;
	    i_26_ >>= 1;
	    i_27_ >>= 1;
	    i_25_ >>= 1;
	    i_24_++;
	}
    }
    
    static void method2314(int i, int i_44_, int i_45_, int i_46_,
			   Class165 class165, byte[] is) {
	if (i_45_ > 0 && !Class72.method1537(i_45_, (byte) 0))
	    throw new IllegalArgumentException("");
	if (i_46_ > 0 && !Class72.method1537(i_46_, (byte) 0))
	    throw new IllegalArgumentException("");
	int i_47_ = class165.anInt1770 * -1998053519;
	int i_48_ = 0;
	int i_49_ = i_45_ < i_46_ ? i_45_ : i_46_;
	int i_50_ = i_45_ >> 1;
	int i_51_ = i_46_ >> 1;
	byte[] is_52_ = is;
	byte[] is_53_ = new byte[i_50_ * i_51_ * i_47_];
	for (;;) {
	    OpenGL.glTexImage2Dub(i, i_48_, i_44_, i_45_, i_46_, 0,
				  Class182_Sub3.method15421(class165), 5121,
				  is_52_, 0);
	    if (i_49_ <= 1)
		break;
	    int i_54_ = i_45_ * i_47_;
	    for (int i_55_ = 0; i_55_ < i_47_; i_55_++) {
		int i_56_ = i_55_;
		int i_57_ = i_55_;
		int i_58_ = i_57_ + i_54_;
		for (int i_59_ = 0; i_59_ < i_51_; i_59_++) {
		    for (int i_60_ = 0; i_60_ < i_50_; i_60_++) {
			int i_61_ = is_52_[i_57_];
			i_57_ += i_47_;
			i_61_ += is_52_[i_57_];
			i_57_ += i_47_;
			i_61_ += is_52_[i_58_];
			i_58_ += i_47_;
			i_61_ += is_52_[i_58_];
			i_58_ += i_47_;
			is_53_[i_56_] = (byte) (i_61_ >> 2);
			i_56_ += i_47_;
		    }
		    i_57_ += i_54_;
		    i_58_ += i_54_;
		}
	    }
	    byte[] is_62_ = is_53_;
	    is_53_ = is_52_;
	    is_52_ = is_62_;
	    i_45_ = i_50_;
	    i_46_ = i_51_;
	    i_50_ >>= 1;
	    i_51_ >>= 1;
	    i_49_ >>= 1;
	    i_48_++;
	}
    }
    
    static void method2315(int i, int i_63_, int i_64_, int i_65_,
			   Class165 class165, float[] fs) {
	if (i_64_ > 0 && !Class72.method1537(i_64_, (byte) 0))
	    throw new IllegalArgumentException("");
	if (i_65_ > 0 && !Class72.method1537(i_65_, (byte) 0))
	    throw new IllegalArgumentException("");
	int i_66_ = class165.anInt1770 * -1998053519;
	int i_67_ = 0;
	int i_68_ = i_64_ < i_65_ ? i_64_ : i_65_;
	int i_69_ = i_64_ >> 1;
	int i_70_ = i_65_ >> 1;
	float[] fs_71_ = fs;
	float[] fs_72_ = new float[i_69_ * i_70_ * i_66_];
	for (;;) {
	    OpenGL.glTexImage2Df(i, i_67_, i_63_, i_64_, i_65_, 0,
				 Class182_Sub3.method15421(class165), 5126,
				 fs_71_, 0);
	    if (i_68_ <= 1)
		break;
	    int i_73_ = i_64_ * i_66_;
	    for (int i_74_ = 0; i_74_ < i_66_; i_74_++) {
		int i_75_ = i_74_;
		int i_76_ = i_74_;
		int i_77_ = i_76_ + i_73_;
		for (int i_78_ = 0; i_78_ < i_70_; i_78_++) {
		    for (int i_79_ = 0; i_79_ < i_69_; i_79_++) {
			float f = fs_71_[i_76_];
			i_76_ += i_66_;
			f += fs_71_[i_76_];
			i_76_ += i_66_;
			f += fs_71_[i_77_];
			i_77_ += i_66_;
			f += fs_71_[i_77_];
			i_77_ += i_66_;
			fs_72_[i_75_] = f * 0.25F;
			i_75_ += i_66_;
		    }
		    i_76_ += i_73_;
		    i_77_ += i_73_;
		}
	    }
	    float[] fs_80_ = fs_72_;
	    fs_72_ = fs_71_;
	    fs_71_ = fs_80_;
	    i_64_ = i_69_;
	    i_65_ = i_70_;
	    i_69_ >>= 1;
	    i_70_ >>= 1;
	    i_68_ >>= 1;
	    i_67_++;
	}
    }
    
    void method2316() throws Throwable {
	method2322();
	super.finalize();
    }
    
    void method2317() throws Throwable {
	method2322();
	super.finalize();
    }
    
    Class136(Class182_Sub3 class182_sub3, int i, Class165 class165,
	     Class178 class178, int i_81_, boolean bool) {
	aClass182_Sub3_1617 = class182_sub3;
	anInt1625 = i;
	aClass165_1624 = class165;
	aClass178_1627 = class178;
	aBool1628 = bool;
	anInt1630 = i_81_;
	OpenGL.glGenTextures(1, anIntArray1629, 0);
	anInt1623 = anIntArray1629[0];
	method2326(0);
    }
    
    void method2318() throws Throwable {
	method2322();
	super.finalize();
    }
    
    void method2319(boolean bool) {
	if (aBool1626 != bool) {
	    aBool1626 = bool;
	    method2305();
	}
    }
    
    void method2320(boolean bool) {
	if (aBool1626 != bool) {
	    aBool1626 = bool;
	    method2305();
	}
    }
    
    void method2321() {
	aClass182_Sub3_1617.method15395(this);
	if (aBool1626) {
	    OpenGL.glTexParameteri(anInt1625, 10241, aBool1628 ? 9987 : 9729);
	    OpenGL.glTexParameteri(anInt1625, 10240, 9729);
	} else {
	    OpenGL.glTexParameteri(anInt1625, 10241, aBool1628 ? 9984 : 9728);
	    OpenGL.glTexParameteri(anInt1625, 10240, 9728);
	}
    }
    
    void method2322() {
	if (anInt1623 != 0) {
	    aClass182_Sub3_1617.method15438(anInt1623, method2312());
	    anInt1623 = 0;
	}
    }
    
    void method2323(boolean bool) {
	if (aBool1628 != bool) {
	    int i = method2312();
	    aBool1628 = true;
	    method2305();
	    method2326(i);
	}
    }
    
    void method2324(boolean bool) {
	if (aBool1628 != bool) {
	    int i = method2312();
	    aBool1628 = true;
	    method2305();
	    method2326(i);
	}
    }
    
    void method2325() {
	if (anInt1623 != 0) {
	    aClass182_Sub3_1617.anInt9709 -= method2312();
	    int[] is = new int[1];
	    is[0] = anInt1623;
	    OpenGL.glDeleteTextures(1, is, 0);
	    anInt1623 = 0;
	}
    }
    
    void method2326(int i) {
	aClass182_Sub3_1617.anInt9709 -= i;
	aClass182_Sub3_1617.anInt9709 += method2312();
    }
    
    void method2327() {
	if (anInt1623 != 0) {
	    aClass182_Sub3_1617.method15438(anInt1623, method2312());
	    anInt1623 = 0;
	}
    }
    
    void method2328() {
	if (anInt1623 != 0) {
	    aClass182_Sub3_1617.method15438(anInt1623, method2312());
	    anInt1623 = 0;
	}
    }
    
    void method2329(int i) {
	aClass182_Sub3_1617.anInt9709 -= i;
	aClass182_Sub3_1617.anInt9709 += method2312();
    }
    
    static void method2330(int i, int i_82_, int i_83_, int i_84_, int i_85_,
			   int i_86_, int[] is) {
	if (i_83_ > 0 && !Class72.method1537(i_83_, (byte) 0))
	    throw new IllegalArgumentException("");
	if (i_84_ > 0 && !Class72.method1537(i_84_, (byte) 0))
	    throw new IllegalArgumentException("");
	if (i_85_ != 32993)
	    throw new IllegalArgumentException("");
	int i_87_ = 0;
	int i_88_ = i_83_ < i_84_ ? i_83_ : i_84_;
	int i_89_ = i_83_ >> 1;
	int i_90_ = i_84_ >> 1;
	int[] is_91_ = is;
	int[] is_92_ = new int[i_89_ * i_90_];
	for (;;) {
	    OpenGL.glTexImage2Di(i, i_87_, i_82_, i_83_, i_84_, 0, i_85_,
				 i_86_, is_91_, 0);
	    if (i_88_ <= 1)
		break;
	    int i_93_ = 0;
	    int i_94_ = 0;
	    int i_95_ = i_94_ + i_83_;
	    for (int i_96_ = 0; i_96_ < i_90_; i_96_++) {
		for (int i_97_ = 0; i_97_ < i_89_; i_97_++) {
		    int i_98_ = is_91_[i_94_++];
		    int i_99_ = is_91_[i_94_++];
		    int i_100_ = is_91_[i_95_++];
		    int i_101_ = is_91_[i_95_++];
		    int i_102_ = i_98_ >> 24 & 0xff;
		    int i_103_ = i_98_ >> 16 & 0xff;
		    int i_104_ = i_98_ >> 8 & 0xff;
		    int i_105_ = i_98_ & 0xff;
		    i_102_ += i_99_ >> 24 & 0xff;
		    i_103_ += i_99_ >> 16 & 0xff;
		    i_104_ += i_99_ >> 8 & 0xff;
		    i_105_ += i_99_ & 0xff;
		    i_102_ += i_100_ >> 24 & 0xff;
		    i_103_ += i_100_ >> 16 & 0xff;
		    i_104_ += i_100_ >> 8 & 0xff;
		    i_105_ += i_100_ & 0xff;
		    i_102_ += i_101_ >> 24 & 0xff;
		    i_103_ += i_101_ >> 16 & 0xff;
		    i_104_ += i_101_ >> 8 & 0xff;
		    i_105_ += i_101_ & 0xff;
		    is_92_[i_93_++]
			= ((i_102_ & 0x3fc) << 22 | (i_103_ & 0x3fc) << 14
			   | (i_104_ & 0x3fc) << 6 | (i_105_ & 0x3fc) >> 2);
		}
		i_94_ += i_83_;
		i_95_ += i_83_;
	    }
	    int[] is_106_ = is_92_;
	    is_92_ = is_91_;
	    is_91_ = is_106_;
	    i_83_ = i_89_;
	    i_84_ = i_90_;
	    i_89_ >>= 1;
	    i_90_ >>= 1;
	    i_88_ >>= 1;
	    i_87_++;
	}
    }
    
    int method2331() {
	int i = (aClass165_1624.anInt1770 * -1998053519
		 * (aClass178_1627.anInt1915 * -103623665) * anInt1630);
	return aBool1628 ? i * 4 / 3 : i;
    }
    
    public void finalize() throws Throwable {
	method2322();
	super.finalize();
    }
    
    void method2332() throws Throwable {
	method2322();
	super.finalize();
    }
    
    static void method2333(int i, int i_107_, int i_108_, int i_109_,
			   int i_110_, int i_111_, int[] is) {
	if (i_108_ > 0 && !Class72.method1537(i_108_, (byte) 0))
	    throw new IllegalArgumentException("");
	if (i_109_ > 0 && !Class72.method1537(i_109_, (byte) 0))
	    throw new IllegalArgumentException("");
	if (i_110_ != 32993)
	    throw new IllegalArgumentException("");
	int i_112_ = 0;
	int i_113_ = i_108_ < i_109_ ? i_108_ : i_109_;
	int i_114_ = i_108_ >> 1;
	int i_115_ = i_109_ >> 1;
	int[] is_116_ = is;
	int[] is_117_ = new int[i_114_ * i_115_];
	for (;;) {
	    OpenGL.glTexImage2Di(i, i_112_, i_107_, i_108_, i_109_, 0, i_110_,
				 i_111_, is_116_, 0);
	    if (i_113_ <= 1)
		break;
	    int i_118_ = 0;
	    int i_119_ = 0;
	    int i_120_ = i_119_ + i_108_;
	    for (int i_121_ = 0; i_121_ < i_115_; i_121_++) {
		for (int i_122_ = 0; i_122_ < i_114_; i_122_++) {
		    int i_123_ = is_116_[i_119_++];
		    int i_124_ = is_116_[i_119_++];
		    int i_125_ = is_116_[i_120_++];
		    int i_126_ = is_116_[i_120_++];
		    int i_127_ = i_123_ >> 24 & 0xff;
		    int i_128_ = i_123_ >> 16 & 0xff;
		    int i_129_ = i_123_ >> 8 & 0xff;
		    int i_130_ = i_123_ & 0xff;
		    i_127_ += i_124_ >> 24 & 0xff;
		    i_128_ += i_124_ >> 16 & 0xff;
		    i_129_ += i_124_ >> 8 & 0xff;
		    i_130_ += i_124_ & 0xff;
		    i_127_ += i_125_ >> 24 & 0xff;
		    i_128_ += i_125_ >> 16 & 0xff;
		    i_129_ += i_125_ >> 8 & 0xff;
		    i_130_ += i_125_ & 0xff;
		    i_127_ += i_126_ >> 24 & 0xff;
		    i_128_ += i_126_ >> 16 & 0xff;
		    i_129_ += i_126_ >> 8 & 0xff;
		    i_130_ += i_126_ & 0xff;
		    is_117_[i_118_++]
			= ((i_127_ & 0x3fc) << 22 | (i_128_ & 0x3fc) << 14
			   | (i_129_ & 0x3fc) << 6 | (i_130_ & 0x3fc) >> 2);
		}
		i_119_ += i_108_;
		i_120_ += i_108_;
	    }
	    int[] is_131_ = is_117_;
	    is_117_ = is_116_;
	    is_116_ = is_131_;
	    i_108_ = i_114_;
	    i_109_ = i_115_;
	    i_114_ >>= 1;
	    i_115_ >>= 1;
	    i_113_ >>= 1;
	    i_112_++;
	}
    }
    
    static void method2334(int i, int i_132_, int i_133_, int i_134_,
			   Class165 class165, float[] fs) {
	if (i_133_ > 0 && !Class72.method1537(i_133_, (byte) 0))
	    throw new IllegalArgumentException("");
	if (i_134_ > 0 && !Class72.method1537(i_134_, (byte) 0))
	    throw new IllegalArgumentException("");
	int i_135_ = class165.anInt1770 * -1998053519;
	int i_136_ = 0;
	int i_137_ = i_133_ < i_134_ ? i_133_ : i_134_;
	int i_138_ = i_133_ >> 1;
	int i_139_ = i_134_ >> 1;
	float[] fs_140_ = fs;
	float[] fs_141_ = new float[i_138_ * i_139_ * i_135_];
	for (;;) {
	    OpenGL.glTexImage2Df(i, i_136_, i_132_, i_133_, i_134_, 0,
				 Class182_Sub3.method15421(class165), 5126,
				 fs_140_, 0);
	    if (i_137_ <= 1)
		break;
	    int i_142_ = i_133_ * i_135_;
	    for (int i_143_ = 0; i_143_ < i_135_; i_143_++) {
		int i_144_ = i_143_;
		int i_145_ = i_143_;
		int i_146_ = i_145_ + i_142_;
		for (int i_147_ = 0; i_147_ < i_139_; i_147_++) {
		    for (int i_148_ = 0; i_148_ < i_138_; i_148_++) {
			float f = fs_140_[i_145_];
			i_145_ += i_135_;
			f += fs_140_[i_145_];
			i_145_ += i_135_;
			f += fs_140_[i_146_];
			i_146_ += i_135_;
			f += fs_140_[i_146_];
			i_146_ += i_135_;
			fs_141_[i_144_] = f * 0.25F;
			i_144_ += i_135_;
		    }
		    i_145_ += i_142_;
		    i_146_ += i_142_;
		}
	    }
	    float[] fs_149_ = fs_141_;
	    fs_141_ = fs_140_;
	    fs_140_ = fs_149_;
	    i_133_ = i_138_;
	    i_134_ = i_139_;
	    i_138_ >>= 1;
	    i_139_ >>= 1;
	    i_137_ >>= 1;
	    i_136_++;
	}
    }
    
    static void method2335(int i, int i_150_, int i_151_, int i_152_,
			   int i_153_, int i_154_, int[] is) {
	if (i_151_ > 0 && !Class72.method1537(i_151_, (byte) 0))
	    throw new IllegalArgumentException("");
	if (i_152_ > 0 && !Class72.method1537(i_152_, (byte) 0))
	    throw new IllegalArgumentException("");
	if (i_153_ != 32993)
	    throw new IllegalArgumentException("");
	int i_155_ = 0;
	int i_156_ = i_151_ < i_152_ ? i_151_ : i_152_;
	int i_157_ = i_151_ >> 1;
	int i_158_ = i_152_ >> 1;
	int[] is_159_ = is;
	int[] is_160_ = new int[i_157_ * i_158_];
	for (;;) {
	    OpenGL.glTexImage2Di(i, i_155_, i_150_, i_151_, i_152_, 0, i_153_,
				 i_154_, is_159_, 0);
	    if (i_156_ <= 1)
		break;
	    int i_161_ = 0;
	    int i_162_ = 0;
	    int i_163_ = i_162_ + i_151_;
	    for (int i_164_ = 0; i_164_ < i_158_; i_164_++) {
		for (int i_165_ = 0; i_165_ < i_157_; i_165_++) {
		    int i_166_ = is_159_[i_162_++];
		    int i_167_ = is_159_[i_162_++];
		    int i_168_ = is_159_[i_163_++];
		    int i_169_ = is_159_[i_163_++];
		    int i_170_ = i_166_ >> 24 & 0xff;
		    int i_171_ = i_166_ >> 16 & 0xff;
		    int i_172_ = i_166_ >> 8 & 0xff;
		    int i_173_ = i_166_ & 0xff;
		    i_170_ += i_167_ >> 24 & 0xff;
		    i_171_ += i_167_ >> 16 & 0xff;
		    i_172_ += i_167_ >> 8 & 0xff;
		    i_173_ += i_167_ & 0xff;
		    i_170_ += i_168_ >> 24 & 0xff;
		    i_171_ += i_168_ >> 16 & 0xff;
		    i_172_ += i_168_ >> 8 & 0xff;
		    i_173_ += i_168_ & 0xff;
		    i_170_ += i_169_ >> 24 & 0xff;
		    i_171_ += i_169_ >> 16 & 0xff;
		    i_172_ += i_169_ >> 8 & 0xff;
		    i_173_ += i_169_ & 0xff;
		    is_160_[i_161_++]
			= ((i_170_ & 0x3fc) << 22 | (i_171_ & 0x3fc) << 14
			   | (i_172_ & 0x3fc) << 6 | (i_173_ & 0x3fc) >> 2);
		}
		i_162_ += i_151_;
		i_163_ += i_151_;
	    }
	    int[] is_174_ = is_160_;
	    is_160_ = is_159_;
	    is_159_ = is_174_;
	    i_151_ = i_157_;
	    i_152_ = i_158_;
	    i_157_ >>= 1;
	    i_158_ >>= 1;
	    i_156_ >>= 1;
	    i_155_++;
	}
    }
}
