/* Class490 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaggl.OpenGL;

public abstract class Class490 implements Interface39
{
    int anInt5270;
    static final int anInt5271 = 3553;
    static int[] anIntArray5272 = new int[1];
    static final int anInt5273 = 32879;
    boolean aBool5274;
    static final int anInt5275 = 34067;
    int anInt5276;
    Class165 aClass165_5277;
    Class178 aClass178_5278;
    Class182_Sub1_Sub2 aClass182_Sub1_Sub2_5279;
    Class377 aClass377_5280 = Class377.aClass377_3903;
    int anInt5281;
    static final int anInt5282 = 0;
    
    public void method125() {
	if (anInt5270 != 0) {
	    aClass182_Sub1_Sub2_5279.anInt9166 -= method7967();
	    int[] is = new int[1];
	    is[0] = anInt5270;
	    OpenGL.glDeleteTextures(1, is, 0);
	    anInt5270 = 0;
	}
    }
    
    void method7960(int i, int i_0_, int i_1_, byte[] is) {
	if (anInt5270 == 0)
	    throw new IllegalStateException("");
	if (i_0_ > 0 && !Class72.method1537(i_0_, (byte) 0))
	    throw new IllegalArgumentException("");
	if (i_1_ > 0 && !Class72.method1537(i_1_, (byte) 0))
	    throw new IllegalArgumentException("");
	int i_2_ = aClass165_5277.anInt1770 * -1998053519;
	int i_3_ = 0;
	int i_4_ = i_0_ < i_1_ ? i_0_ : i_1_;
	int i_5_ = i_0_ >> 1;
	int i_6_ = i_1_ >> 1;
	byte[] is_7_ = is;
	byte[] is_8_ = new byte[i_5_ * i_6_ * i_2_];
	for (;;) {
	    OpenGL.glTexImage2Dub
		(i, i_3_,
		 Class182_Sub1_Sub2.method18120(aClass165_5277,
						aClass178_5278),
		 i_0_, i_1_, 0, Class182_Sub1_Sub2.method18124(aClass165_5277),
		 5121, is_7_, 0);
	    if (i_4_ <= 1)
		break;
	    int i_9_ = i_0_ * i_2_;
	    for (int i_10_ = 0; i_10_ < i_2_; i_10_++) {
		int i_11_ = i_10_;
		int i_12_ = i_10_;
		int i_13_ = i_12_ + i_9_;
		for (int i_14_ = 0; i_14_ < i_6_; i_14_++) {
		    for (int i_15_ = 0; i_15_ < i_5_; i_15_++) {
			int i_16_ = is_7_[i_12_];
			i_12_ += i_2_;
			i_16_ += is_7_[i_12_];
			i_12_ += i_2_;
			i_16_ += is_7_[i_13_];
			i_13_ += i_2_;
			i_16_ += is_7_[i_13_];
			i_13_ += i_2_;
			is_8_[i_11_] = (byte) (i_16_ >> 2);
			i_11_ += i_2_;
		    }
		    i_12_ += i_9_;
		    i_13_ += i_9_;
		}
	    }
	    byte[] is_17_ = is_8_;
	    is_8_ = is_7_;
	    is_7_ = is_17_;
	    i_0_ = i_5_;
	    i_1_ = i_6_;
	    i_5_ >>= 1;
	    i_6_ >>= 1;
	    i_4_ >>= 1;
	    i_3_++;
	}
    }
    
    void method7961(int i, int i_18_, int i_19_, byte[] is) {
	if (anInt5270 == 0)
	    throw new IllegalStateException("");
	if (i_18_ > 0 && !Class72.method1537(i_18_, (byte) 0))
	    throw new IllegalArgumentException("");
	if (i_19_ > 0 && !Class72.method1537(i_19_, (byte) 0))
	    throw new IllegalArgumentException("");
	int i_20_ = aClass165_5277.anInt1770 * -1998053519;
	int i_21_ = 0;
	int i_22_ = i_18_ < i_19_ ? i_18_ : i_19_;
	int i_23_ = i_18_ >> 1;
	int i_24_ = i_19_ >> 1;
	byte[] is_25_ = is;
	byte[] is_26_ = new byte[i_23_ * i_24_ * i_20_];
	for (;;) {
	    OpenGL.glTexImage2Dub
		(i, i_21_,
		 Class182_Sub1_Sub2.method18120(aClass165_5277,
						aClass178_5278),
		 i_18_, i_19_, 0,
		 Class182_Sub1_Sub2.method18124(aClass165_5277), 5121, is_25_,
		 0);
	    if (i_22_ <= 1)
		break;
	    int i_27_ = i_18_ * i_20_;
	    for (int i_28_ = 0; i_28_ < i_20_; i_28_++) {
		int i_29_ = i_28_;
		int i_30_ = i_28_;
		int i_31_ = i_30_ + i_27_;
		for (int i_32_ = 0; i_32_ < i_24_; i_32_++) {
		    for (int i_33_ = 0; i_33_ < i_23_; i_33_++) {
			int i_34_ = is_25_[i_30_];
			i_30_ += i_20_;
			i_34_ += is_25_[i_30_];
			i_30_ += i_20_;
			i_34_ += is_25_[i_31_];
			i_31_ += i_20_;
			i_34_ += is_25_[i_31_];
			i_31_ += i_20_;
			is_26_[i_29_] = (byte) (i_34_ >> 2);
			i_29_ += i_20_;
		    }
		    i_30_ += i_27_;
		    i_31_ += i_27_;
		}
	    }
	    byte[] is_35_ = is_26_;
	    is_26_ = is_25_;
	    is_25_ = is_35_;
	    i_18_ = i_23_;
	    i_19_ = i_24_;
	    i_23_ >>= 1;
	    i_24_ >>= 1;
	    i_22_ >>= 1;
	    i_21_++;
	}
    }
    
    void method7962() {
	if (anInt5270 == 0)
	    throw new IllegalStateException("");
	aClass182_Sub1_Sub2_5279.method14731(this);
	if (aClass377_5280 == Class377.aClass377_3903) {
	    OpenGL.glTexParameteri(anInt5276, 10241, aBool5274 ? 9987 : 9729);
	    OpenGL.glTexParameteri(anInt5276, 10240, 9729);
	} else {
	    OpenGL.glTexParameteri(anInt5276, 10241, aBool5274 ? 9984 : 9728);
	    OpenGL.glTexParameteri(anInt5276, 10240, 9728);
	}
    }
    
    boolean method239() {
	if (anInt5270 == 0)
	    throw new IllegalStateException("");
	int i = method7967();
	aClass182_Sub1_Sub2_5279.method14731(this);
	if (aClass182_Sub1_Sub2_5279.aBool11510)
	    OpenGL.glEnable(anInt5276);
	OpenGL.glGenerateMipmapEXT(anInt5276);
	if (aClass182_Sub1_Sub2_5279.aBool11510)
	    OpenGL.glDisable(anInt5276);
	aBool5274 = true;
	method7962();
	method7973(i);
	return true;
    }
    
    void method7963(int i, int i_36_, int i_37_, int[] is) {
	if (anInt5270 == 0)
	    throw new IllegalStateException("");
	if (i_36_ > 0 && !Class72.method1537(i_36_, (byte) 0))
	    throw new IllegalArgumentException("");
	if (i_37_ > 0 && !Class72.method1537(i_37_, (byte) 0))
	    throw new IllegalArgumentException("");
	if (aClass165_5277 != Class165.aClass165_1771)
	    throw new IllegalArgumentException("");
	int i_38_ = 0;
	int i_39_ = i_36_ < i_37_ ? i_36_ : i_37_;
	int i_40_ = i_36_ >> 1;
	int i_41_ = i_37_ >> 1;
	int[] is_42_ = is;
	int[] is_43_ = new int[i_40_ * i_41_];
	for (;;) {
	    OpenGL.glTexImage2Di
		(i, i_38_,
		 Class182_Sub1_Sub2.method18120(aClass165_5277,
						aClass178_5278),
		 i_36_, i_37_, 0, 32993, aClass182_Sub1_Sub2_5279.anInt11512,
		 is_42_, 0);
	    if (i_39_ <= 1)
		break;
	    int i_44_ = 0;
	    int i_45_ = 0;
	    int i_46_ = i_45_ + i_36_;
	    for (int i_47_ = 0; i_47_ < i_41_; i_47_++) {
		for (int i_48_ = 0; i_48_ < i_40_; i_48_++) {
		    int i_49_ = is_42_[i_45_++];
		    int i_50_ = is_42_[i_45_++];
		    int i_51_ = is_42_[i_46_++];
		    int i_52_ = is_42_[i_46_++];
		    int i_53_ = i_49_ >> 24 & 0xff;
		    int i_54_ = i_49_ >> 16 & 0xff;
		    int i_55_ = i_49_ >> 8 & 0xff;
		    int i_56_ = i_49_ & 0xff;
		    i_53_ += i_50_ >> 24 & 0xff;
		    i_54_ += i_50_ >> 16 & 0xff;
		    i_55_ += i_50_ >> 8 & 0xff;
		    i_56_ += i_50_ & 0xff;
		    i_53_ += i_51_ >> 24 & 0xff;
		    i_54_ += i_51_ >> 16 & 0xff;
		    i_55_ += i_51_ >> 8 & 0xff;
		    i_56_ += i_51_ & 0xff;
		    i_53_ += i_52_ >> 24 & 0xff;
		    i_54_ += i_52_ >> 16 & 0xff;
		    i_55_ += i_52_ >> 8 & 0xff;
		    i_56_ += i_52_ & 0xff;
		    is_43_[i_44_++]
			= ((i_53_ & 0x3fc) << 22 | (i_54_ & 0x3fc) << 14
			   | (i_55_ & 0x3fc) << 6 | (i_56_ & 0x3fc) >> 2);
		}
		i_45_ += i_36_;
		i_46_ += i_36_;
	    }
	    int[] is_57_ = is_43_;
	    is_43_ = is_42_;
	    is_42_ = is_57_;
	    i_36_ = i_40_;
	    i_37_ = i_41_;
	    i_40_ >>= 1;
	    i_41_ >>= 1;
	    i_39_ >>= 1;
	    i_38_++;
	}
    }
    
    void method7964() {
	if (anInt5270 == 0)
	    throw new IllegalStateException("");
	aClass182_Sub1_Sub2_5279.method14731(this);
	if (aClass377_5280 == Class377.aClass377_3903) {
	    OpenGL.glTexParameteri(anInt5276, 10241, aBool5274 ? 9987 : 9729);
	    OpenGL.glTexParameteri(anInt5276, 10240, 9729);
	} else {
	    OpenGL.glTexParameteri(anInt5276, 10241, aBool5274 ? 9984 : 9728);
	    OpenGL.glTexParameteri(anInt5276, 10240, 9728);
	}
    }
    
    void method7965() {
	if (anInt5270 != 0) {
	    aClass182_Sub1_Sub2_5279.method18114(anInt5270, method7967());
	    anInt5270 = 0;
	}
    }
    
    void method7966() {
	if (anInt5270 != 0) {
	    aClass182_Sub1_Sub2_5279.method18114(anInt5270, method7967());
	    anInt5270 = 0;
	}
    }
    
    int method7967() {
	int i = (aClass165_5277.anInt1770 * -1998053519
		 * (aClass178_5278.anInt1915 * -103623665) * anInt5281);
	return aBool5274 ? i * 4 / 3 : i;
    }
    
    public void method127() {
	if (anInt5270 != 0) {
	    aClass182_Sub1_Sub2_5279.anInt9166 -= method7967();
	    int[] is = new int[1];
	    is[0] = anInt5270;
	    OpenGL.glDeleteTextures(1, is, 0);
	    anInt5270 = 0;
	}
    }
    
    void method7968(int i, int i_58_, int i_59_, float[] fs) {
	if (anInt5270 == 0)
	    throw new IllegalStateException("");
	if (i_58_ > 0 && !Class72.method1537(i_58_, (byte) 0))
	    throw new IllegalArgumentException("");
	if (i_59_ > 0 && !Class72.method1537(i_59_, (byte) 0))
	    throw new IllegalArgumentException("");
	int i_60_ = aClass165_5277.anInt1770 * -1998053519;
	int i_61_ = 0;
	int i_62_ = i_58_ < i_59_ ? i_58_ : i_59_;
	int i_63_ = i_58_ >> 1;
	int i_64_ = i_59_ >> 1;
	float[] fs_65_ = fs;
	float[] fs_66_ = new float[i_63_ * i_64_ * i_60_];
	for (;;) {
	    OpenGL.glTexImage2Df
		(i, i_61_,
		 Class182_Sub1_Sub2.method18120(aClass165_5277,
						aClass178_5278),
		 i_58_, i_59_, 0,
		 Class182_Sub1_Sub2.method18124(aClass165_5277), 5126, fs_65_,
		 0);
	    if (i_62_ <= 1)
		break;
	    int i_67_ = i_58_ * i_60_;
	    for (int i_68_ = 0; i_68_ < i_60_; i_68_++) {
		int i_69_ = i_68_;
		int i_70_ = i_68_;
		int i_71_ = i_70_ + i_67_;
		for (int i_72_ = 0; i_72_ < i_64_; i_72_++) {
		    for (int i_73_ = 0; i_73_ < i_63_; i_73_++) {
			float f = fs_65_[i_70_];
			i_70_ += i_60_;
			f += fs_65_[i_70_];
			i_70_ += i_60_;
			f += fs_65_[i_71_];
			i_71_ += i_60_;
			f += fs_65_[i_71_];
			i_71_ += i_60_;
			fs_66_[i_69_] = f * 0.25F;
			i_69_ += i_60_;
		    }
		    i_70_ += i_67_;
		    i_71_ += i_67_;
		}
	    }
	    float[] fs_74_ = fs_66_;
	    fs_66_ = fs_65_;
	    fs_65_ = fs_74_;
	    i_58_ = i_63_;
	    i_59_ = i_64_;
	    i_63_ >>= 1;
	    i_64_ >>= 1;
	    i_62_ >>= 1;
	    i_61_++;
	}
    }
    
    public void finalize() throws Throwable {
	method7966();
	super.finalize();
    }
    
    public void method276() {
	if (anInt5270 == 0)
	    throw new IllegalStateException("");
	int i = aClass182_Sub1_Sub2_5279.method14817();
	int i_75_ = aClass182_Sub1_Sub2_5279.anIntArray11483[i];
	if (i_75_ != anInt5276) {
	    if (i_75_ != 0) {
		OpenGL.glBindTexture(i_75_, 0);
		OpenGL.glDisable(i_75_);
	    }
	    OpenGL.glEnable(anInt5276);
	    aClass182_Sub1_Sub2_5279.anIntArray11483[i] = anInt5276;
	}
	OpenGL.glBindTexture(anInt5276, anInt5270);
    }
    
    void method7969() throws Throwable {
	method7966();
	super.finalize();
    }
    
    public void method274() {
	if (anInt5270 == 0)
	    throw new IllegalStateException("");
	int i = aClass182_Sub1_Sub2_5279.method14817();
	int i_76_ = aClass182_Sub1_Sub2_5279.anIntArray11483[i];
	if (i_76_ != anInt5276) {
	    if (i_76_ != 0) {
		OpenGL.glBindTexture(i_76_, 0);
		OpenGL.glDisable(i_76_);
	    }
	    OpenGL.glEnable(anInt5276);
	    aClass182_Sub1_Sub2_5279.anIntArray11483[i] = anInt5276;
	}
	OpenGL.glBindTexture(anInt5276, anInt5270);
    }
    
    void method7970() throws Throwable {
	method7966();
	super.finalize();
    }
    
    void method7971() throws Throwable {
	method7966();
	super.finalize();
    }
    
    void method7972() throws Throwable {
	method7966();
	super.finalize();
    }
    
    void method7973(int i) {
	aClass182_Sub1_Sub2_5279.anInt9166 -= i;
	aClass182_Sub1_Sub2_5279.anInt9166 += method7967();
    }
    
    boolean method268() {
	if (anInt5270 == 0)
	    throw new IllegalStateException("");
	int i = method7967();
	aClass182_Sub1_Sub2_5279.method14731(this);
	if (aClass182_Sub1_Sub2_5279.aBool11510)
	    OpenGL.glEnable(anInt5276);
	OpenGL.glGenerateMipmapEXT(anInt5276);
	if (aClass182_Sub1_Sub2_5279.aBool11510)
	    OpenGL.glDisable(anInt5276);
	aBool5274 = true;
	method7962();
	method7973(i);
	return true;
    }
    
    boolean method269() {
	if (anInt5270 == 0)
	    throw new IllegalStateException("");
	int i = method7967();
	aClass182_Sub1_Sub2_5279.method14731(this);
	if (aClass182_Sub1_Sub2_5279.aBool11510)
	    OpenGL.glEnable(anInt5276);
	OpenGL.glGenerateMipmapEXT(anInt5276);
	if (aClass182_Sub1_Sub2_5279.aBool11510)
	    OpenGL.glDisable(anInt5276);
	aBool5274 = true;
	method7962();
	method7973(i);
	return true;
    }
    
    void method7974(int i) {
	aClass182_Sub1_Sub2_5279.anInt9166 -= i;
	aClass182_Sub1_Sub2_5279.anInt9166 += method7967();
    }
    
    public void method275() {
	if (anInt5270 == 0)
	    throw new IllegalStateException("");
	int i = aClass182_Sub1_Sub2_5279.method14817();
	int i_77_ = aClass182_Sub1_Sub2_5279.anIntArray11483[i];
	if (i_77_ != anInt5276) {
	    if (i_77_ != 0) {
		OpenGL.glBindTexture(i_77_, 0);
		OpenGL.glDisable(i_77_);
	    }
	    OpenGL.glEnable(anInt5276);
	    aClass182_Sub1_Sub2_5279.anIntArray11483[i] = anInt5276;
	}
	OpenGL.glBindTexture(anInt5276, anInt5270);
    }
    
    public void method273(Class377 class377) {
	if (aClass377_5280 != class377) {
	    aClass377_5280 = class377;
	    method7962();
	}
    }
    
    public void method272(Class377 class377) {
	if (aClass377_5280 != class377) {
	    aClass377_5280 = class377;
	    method7962();
	}
    }
    
    public void method277(Class377 class377) {
	if (aClass377_5280 != class377) {
	    aClass377_5280 = class377;
	    method7962();
	}
    }
    
    public void method278(Class377 class377) {
	if (aClass377_5280 != class377) {
	    aClass377_5280 = class377;
	    method7962();
	}
    }
    
    public void method126() {
	if (anInt5270 != 0) {
	    aClass182_Sub1_Sub2_5279.anInt9166 -= method7967();
	    int[] is = new int[1];
	    is[0] = anInt5270;
	    OpenGL.glDeleteTextures(1, is, 0);
	    anInt5270 = 0;
	}
    }
    
    void method7975(int i, int i_78_, int i_79_, int[] is) {
	if (anInt5270 == 0)
	    throw new IllegalStateException("");
	if (i_78_ > 0 && !Class72.method1537(i_78_, (byte) 0))
	    throw new IllegalArgumentException("");
	if (i_79_ > 0 && !Class72.method1537(i_79_, (byte) 0))
	    throw new IllegalArgumentException("");
	if (aClass165_5277 != Class165.aClass165_1771)
	    throw new IllegalArgumentException("");
	int i_80_ = 0;
	int i_81_ = i_78_ < i_79_ ? i_78_ : i_79_;
	int i_82_ = i_78_ >> 1;
	int i_83_ = i_79_ >> 1;
	int[] is_84_ = is;
	int[] is_85_ = new int[i_82_ * i_83_];
	for (;;) {
	    OpenGL.glTexImage2Di
		(i, i_80_,
		 Class182_Sub1_Sub2.method18120(aClass165_5277,
						aClass178_5278),
		 i_78_, i_79_, 0, 32993, aClass182_Sub1_Sub2_5279.anInt11512,
		 is_84_, 0);
	    if (i_81_ <= 1)
		break;
	    int i_86_ = 0;
	    int i_87_ = 0;
	    int i_88_ = i_87_ + i_78_;
	    for (int i_89_ = 0; i_89_ < i_83_; i_89_++) {
		for (int i_90_ = 0; i_90_ < i_82_; i_90_++) {
		    int i_91_ = is_84_[i_87_++];
		    int i_92_ = is_84_[i_87_++];
		    int i_93_ = is_84_[i_88_++];
		    int i_94_ = is_84_[i_88_++];
		    int i_95_ = i_91_ >> 24 & 0xff;
		    int i_96_ = i_91_ >> 16 & 0xff;
		    int i_97_ = i_91_ >> 8 & 0xff;
		    int i_98_ = i_91_ & 0xff;
		    i_95_ += i_92_ >> 24 & 0xff;
		    i_96_ += i_92_ >> 16 & 0xff;
		    i_97_ += i_92_ >> 8 & 0xff;
		    i_98_ += i_92_ & 0xff;
		    i_95_ += i_93_ >> 24 & 0xff;
		    i_96_ += i_93_ >> 16 & 0xff;
		    i_97_ += i_93_ >> 8 & 0xff;
		    i_98_ += i_93_ & 0xff;
		    i_95_ += i_94_ >> 24 & 0xff;
		    i_96_ += i_94_ >> 16 & 0xff;
		    i_97_ += i_94_ >> 8 & 0xff;
		    i_98_ += i_94_ & 0xff;
		    is_85_[i_86_++]
			= ((i_95_ & 0x3fc) << 22 | (i_96_ & 0x3fc) << 14
			   | (i_97_ & 0x3fc) << 6 | (i_98_ & 0x3fc) >> 2);
		}
		i_87_ += i_78_;
		i_88_ += i_78_;
	    }
	    int[] is_99_ = is_85_;
	    is_85_ = is_84_;
	    is_84_ = is_99_;
	    i_78_ = i_82_;
	    i_79_ = i_83_;
	    i_82_ >>= 1;
	    i_83_ >>= 1;
	    i_81_ >>= 1;
	    i_80_++;
	}
    }
    
    void method7976(int i, int i_100_, int i_101_, int[] is) {
	if (anInt5270 == 0)
	    throw new IllegalStateException("");
	if (i_100_ > 0 && !Class72.method1537(i_100_, (byte) 0))
	    throw new IllegalArgumentException("");
	if (i_101_ > 0 && !Class72.method1537(i_101_, (byte) 0))
	    throw new IllegalArgumentException("");
	if (aClass165_5277 != Class165.aClass165_1771)
	    throw new IllegalArgumentException("");
	int i_102_ = 0;
	int i_103_ = i_100_ < i_101_ ? i_100_ : i_101_;
	int i_104_ = i_100_ >> 1;
	int i_105_ = i_101_ >> 1;
	int[] is_106_ = is;
	int[] is_107_ = new int[i_104_ * i_105_];
	for (;;) {
	    OpenGL.glTexImage2Di
		(i, i_102_,
		 Class182_Sub1_Sub2.method18120(aClass165_5277,
						aClass178_5278),
		 i_100_, i_101_, 0, 32993, aClass182_Sub1_Sub2_5279.anInt11512,
		 is_106_, 0);
	    if (i_103_ <= 1)
		break;
	    int i_108_ = 0;
	    int i_109_ = 0;
	    int i_110_ = i_109_ + i_100_;
	    for (int i_111_ = 0; i_111_ < i_105_; i_111_++) {
		for (int i_112_ = 0; i_112_ < i_104_; i_112_++) {
		    int i_113_ = is_106_[i_109_++];
		    int i_114_ = is_106_[i_109_++];
		    int i_115_ = is_106_[i_110_++];
		    int i_116_ = is_106_[i_110_++];
		    int i_117_ = i_113_ >> 24 & 0xff;
		    int i_118_ = i_113_ >> 16 & 0xff;
		    int i_119_ = i_113_ >> 8 & 0xff;
		    int i_120_ = i_113_ & 0xff;
		    i_117_ += i_114_ >> 24 & 0xff;
		    i_118_ += i_114_ >> 16 & 0xff;
		    i_119_ += i_114_ >> 8 & 0xff;
		    i_120_ += i_114_ & 0xff;
		    i_117_ += i_115_ >> 24 & 0xff;
		    i_118_ += i_115_ >> 16 & 0xff;
		    i_119_ += i_115_ >> 8 & 0xff;
		    i_120_ += i_115_ & 0xff;
		    i_117_ += i_116_ >> 24 & 0xff;
		    i_118_ += i_116_ >> 16 & 0xff;
		    i_119_ += i_116_ >> 8 & 0xff;
		    i_120_ += i_116_ & 0xff;
		    is_107_[i_108_++]
			= ((i_117_ & 0x3fc) << 22 | (i_118_ & 0x3fc) << 14
			   | (i_119_ & 0x3fc) << 6 | (i_120_ & 0x3fc) >> 2);
		}
		i_109_ += i_100_;
		i_110_ += i_100_;
	    }
	    int[] is_121_ = is_107_;
	    is_107_ = is_106_;
	    is_106_ = is_121_;
	    i_100_ = i_104_;
	    i_101_ = i_105_;
	    i_104_ >>= 1;
	    i_105_ >>= 1;
	    i_103_ >>= 1;
	    i_102_++;
	}
    }
    
    void method7977(int i, int i_122_, int i_123_, byte[] is) {
	if (anInt5270 == 0)
	    throw new IllegalStateException("");
	if (i_122_ > 0 && !Class72.method1537(i_122_, (byte) 0))
	    throw new IllegalArgumentException("");
	if (i_123_ > 0 && !Class72.method1537(i_123_, (byte) 0))
	    throw new IllegalArgumentException("");
	int i_124_ = aClass165_5277.anInt1770 * -1998053519;
	int i_125_ = 0;
	int i_126_ = i_122_ < i_123_ ? i_122_ : i_123_;
	int i_127_ = i_122_ >> 1;
	int i_128_ = i_123_ >> 1;
	byte[] is_129_ = is;
	byte[] is_130_ = new byte[i_127_ * i_128_ * i_124_];
	for (;;) {
	    OpenGL.glTexImage2Dub
		(i, i_125_,
		 Class182_Sub1_Sub2.method18120(aClass165_5277,
						aClass178_5278),
		 i_122_, i_123_, 0,
		 Class182_Sub1_Sub2.method18124(aClass165_5277), 5121, is_129_,
		 0);
	    if (i_126_ <= 1)
		break;
	    int i_131_ = i_122_ * i_124_;
	    for (int i_132_ = 0; i_132_ < i_124_; i_132_++) {
		int i_133_ = i_132_;
		int i_134_ = i_132_;
		int i_135_ = i_134_ + i_131_;
		for (int i_136_ = 0; i_136_ < i_128_; i_136_++) {
		    for (int i_137_ = 0; i_137_ < i_127_; i_137_++) {
			int i_138_ = is_129_[i_134_];
			i_134_ += i_124_;
			i_138_ += is_129_[i_134_];
			i_134_ += i_124_;
			i_138_ += is_129_[i_135_];
			i_135_ += i_124_;
			i_138_ += is_129_[i_135_];
			i_135_ += i_124_;
			is_130_[i_133_] = (byte) (i_138_ >> 2);
			i_133_ += i_124_;
		    }
		    i_134_ += i_131_;
		    i_135_ += i_131_;
		}
	    }
	    byte[] is_139_ = is_130_;
	    is_130_ = is_129_;
	    is_129_ = is_139_;
	    i_122_ = i_127_;
	    i_123_ = i_128_;
	    i_127_ >>= 1;
	    i_128_ >>= 1;
	    i_126_ >>= 1;
	    i_125_++;
	}
    }
    
    void method7978(int i, int i_140_, int i_141_, byte[] is) {
	if (anInt5270 == 0)
	    throw new IllegalStateException("");
	if (i_140_ > 0 && !Class72.method1537(i_140_, (byte) 0))
	    throw new IllegalArgumentException("");
	if (i_141_ > 0 && !Class72.method1537(i_141_, (byte) 0))
	    throw new IllegalArgumentException("");
	int i_142_ = aClass165_5277.anInt1770 * -1998053519;
	int i_143_ = 0;
	int i_144_ = i_140_ < i_141_ ? i_140_ : i_141_;
	int i_145_ = i_140_ >> 1;
	int i_146_ = i_141_ >> 1;
	byte[] is_147_ = is;
	byte[] is_148_ = new byte[i_145_ * i_146_ * i_142_];
	for (;;) {
	    OpenGL.glTexImage2Dub
		(i, i_143_,
		 Class182_Sub1_Sub2.method18120(aClass165_5277,
						aClass178_5278),
		 i_140_, i_141_, 0,
		 Class182_Sub1_Sub2.method18124(aClass165_5277), 5121, is_147_,
		 0);
	    if (i_144_ <= 1)
		break;
	    int i_149_ = i_140_ * i_142_;
	    for (int i_150_ = 0; i_150_ < i_142_; i_150_++) {
		int i_151_ = i_150_;
		int i_152_ = i_150_;
		int i_153_ = i_152_ + i_149_;
		for (int i_154_ = 0; i_154_ < i_146_; i_154_++) {
		    for (int i_155_ = 0; i_155_ < i_145_; i_155_++) {
			int i_156_ = is_147_[i_152_];
			i_152_ += i_142_;
			i_156_ += is_147_[i_152_];
			i_152_ += i_142_;
			i_156_ += is_147_[i_153_];
			i_153_ += i_142_;
			i_156_ += is_147_[i_153_];
			i_153_ += i_142_;
			is_148_[i_151_] = (byte) (i_156_ >> 2);
			i_151_ += i_142_;
		    }
		    i_152_ += i_149_;
		    i_153_ += i_149_;
		}
	    }
	    byte[] is_157_ = is_148_;
	    is_148_ = is_147_;
	    is_147_ = is_157_;
	    i_140_ = i_145_;
	    i_141_ = i_146_;
	    i_145_ >>= 1;
	    i_146_ >>= 1;
	    i_144_ >>= 1;
	    i_143_++;
	}
    }
    
    public void method271(Class377 class377) {
	if (aClass377_5280 != class377) {
	    aClass377_5280 = class377;
	    method7962();
	}
    }
    
    void method7979(int i, int i_158_, int i_159_, float[] fs) {
	if (anInt5270 == 0)
	    throw new IllegalStateException("");
	if (i_158_ > 0 && !Class72.method1537(i_158_, (byte) 0))
	    throw new IllegalArgumentException("");
	if (i_159_ > 0 && !Class72.method1537(i_159_, (byte) 0))
	    throw new IllegalArgumentException("");
	int i_160_ = aClass165_5277.anInt1770 * -1998053519;
	int i_161_ = 0;
	int i_162_ = i_158_ < i_159_ ? i_158_ : i_159_;
	int i_163_ = i_158_ >> 1;
	int i_164_ = i_159_ >> 1;
	float[] fs_165_ = fs;
	float[] fs_166_ = new float[i_163_ * i_164_ * i_160_];
	for (;;) {
	    OpenGL.glTexImage2Df
		(i, i_161_,
		 Class182_Sub1_Sub2.method18120(aClass165_5277,
						aClass178_5278),
		 i_158_, i_159_, 0,
		 Class182_Sub1_Sub2.method18124(aClass165_5277), 5126, fs_165_,
		 0);
	    if (i_162_ <= 1)
		break;
	    int i_167_ = i_158_ * i_160_;
	    for (int i_168_ = 0; i_168_ < i_160_; i_168_++) {
		int i_169_ = i_168_;
		int i_170_ = i_168_;
		int i_171_ = i_170_ + i_167_;
		for (int i_172_ = 0; i_172_ < i_164_; i_172_++) {
		    for (int i_173_ = 0; i_173_ < i_163_; i_173_++) {
			float f = fs_165_[i_170_];
			i_170_ += i_160_;
			f += fs_165_[i_170_];
			i_170_ += i_160_;
			f += fs_165_[i_171_];
			i_171_ += i_160_;
			f += fs_165_[i_171_];
			i_171_ += i_160_;
			fs_166_[i_169_] = f * 0.25F;
			i_169_ += i_160_;
		    }
		    i_170_ += i_167_;
		    i_171_ += i_167_;
		}
	    }
	    float[] fs_174_ = fs_166_;
	    fs_166_ = fs_165_;
	    fs_165_ = fs_174_;
	    i_158_ = i_163_;
	    i_159_ = i_164_;
	    i_163_ >>= 1;
	    i_164_ >>= 1;
	    i_162_ >>= 1;
	    i_161_++;
	}
    }
    
    void method7980(int i, int i_175_, int i_176_, float[] fs) {
	if (anInt5270 == 0)
	    throw new IllegalStateException("");
	if (i_175_ > 0 && !Class72.method1537(i_175_, (byte) 0))
	    throw new IllegalArgumentException("");
	if (i_176_ > 0 && !Class72.method1537(i_176_, (byte) 0))
	    throw new IllegalArgumentException("");
	int i_177_ = aClass165_5277.anInt1770 * -1998053519;
	int i_178_ = 0;
	int i_179_ = i_175_ < i_176_ ? i_175_ : i_176_;
	int i_180_ = i_175_ >> 1;
	int i_181_ = i_176_ >> 1;
	float[] fs_182_ = fs;
	float[] fs_183_ = new float[i_180_ * i_181_ * i_177_];
	for (;;) {
	    OpenGL.glTexImage2Df
		(i, i_178_,
		 Class182_Sub1_Sub2.method18120(aClass165_5277,
						aClass178_5278),
		 i_175_, i_176_, 0,
		 Class182_Sub1_Sub2.method18124(aClass165_5277), 5126, fs_182_,
		 0);
	    if (i_179_ <= 1)
		break;
	    int i_184_ = i_175_ * i_177_;
	    for (int i_185_ = 0; i_185_ < i_177_; i_185_++) {
		int i_186_ = i_185_;
		int i_187_ = i_185_;
		int i_188_ = i_187_ + i_184_;
		for (int i_189_ = 0; i_189_ < i_181_; i_189_++) {
		    for (int i_190_ = 0; i_190_ < i_180_; i_190_++) {
			float f = fs_182_[i_187_];
			i_187_ += i_177_;
			f += fs_182_[i_187_];
			i_187_ += i_177_;
			f += fs_182_[i_188_];
			i_188_ += i_177_;
			f += fs_182_[i_188_];
			i_188_ += i_177_;
			fs_183_[i_186_] = f * 0.25F;
			i_186_ += i_177_;
		    }
		    i_187_ += i_184_;
		    i_188_ += i_184_;
		}
	    }
	    float[] fs_191_ = fs_183_;
	    fs_183_ = fs_182_;
	    fs_182_ = fs_191_;
	    i_175_ = i_180_;
	    i_176_ = i_181_;
	    i_180_ >>= 1;
	    i_181_ >>= 1;
	    i_179_ >>= 1;
	    i_178_++;
	}
    }
    
    void method7981(int i, int i_192_, int i_193_, float[] fs) {
	if (anInt5270 == 0)
	    throw new IllegalStateException("");
	if (i_192_ > 0 && !Class72.method1537(i_192_, (byte) 0))
	    throw new IllegalArgumentException("");
	if (i_193_ > 0 && !Class72.method1537(i_193_, (byte) 0))
	    throw new IllegalArgumentException("");
	int i_194_ = aClass165_5277.anInt1770 * -1998053519;
	int i_195_ = 0;
	int i_196_ = i_192_ < i_193_ ? i_192_ : i_193_;
	int i_197_ = i_192_ >> 1;
	int i_198_ = i_193_ >> 1;
	float[] fs_199_ = fs;
	float[] fs_200_ = new float[i_197_ * i_198_ * i_194_];
	for (;;) {
	    OpenGL.glTexImage2Df
		(i, i_195_,
		 Class182_Sub1_Sub2.method18120(aClass165_5277,
						aClass178_5278),
		 i_192_, i_193_, 0,
		 Class182_Sub1_Sub2.method18124(aClass165_5277), 5126, fs_199_,
		 0);
	    if (i_196_ <= 1)
		break;
	    int i_201_ = i_192_ * i_194_;
	    for (int i_202_ = 0; i_202_ < i_194_; i_202_++) {
		int i_203_ = i_202_;
		int i_204_ = i_202_;
		int i_205_ = i_204_ + i_201_;
		for (int i_206_ = 0; i_206_ < i_198_; i_206_++) {
		    for (int i_207_ = 0; i_207_ < i_197_; i_207_++) {
			float f = fs_199_[i_204_];
			i_204_ += i_194_;
			f += fs_199_[i_204_];
			i_204_ += i_194_;
			f += fs_199_[i_205_];
			i_205_ += i_194_;
			f += fs_199_[i_205_];
			i_205_ += i_194_;
			fs_200_[i_203_] = f * 0.25F;
			i_203_ += i_194_;
		    }
		    i_204_ += i_201_;
		    i_205_ += i_201_;
		}
	    }
	    float[] fs_208_ = fs_200_;
	    fs_200_ = fs_199_;
	    fs_199_ = fs_208_;
	    i_192_ = i_197_;
	    i_193_ = i_198_;
	    i_197_ >>= 1;
	    i_198_ >>= 1;
	    i_196_ >>= 1;
	    i_195_++;
	}
    }
    
    void method7982(int i, int i_209_, int i_210_, float[] fs) {
	if (anInt5270 == 0)
	    throw new IllegalStateException("");
	if (i_209_ > 0 && !Class72.method1537(i_209_, (byte) 0))
	    throw new IllegalArgumentException("");
	if (i_210_ > 0 && !Class72.method1537(i_210_, (byte) 0))
	    throw new IllegalArgumentException("");
	int i_211_ = aClass165_5277.anInt1770 * -1998053519;
	int i_212_ = 0;
	int i_213_ = i_209_ < i_210_ ? i_209_ : i_210_;
	int i_214_ = i_209_ >> 1;
	int i_215_ = i_210_ >> 1;
	float[] fs_216_ = fs;
	float[] fs_217_ = new float[i_214_ * i_215_ * i_211_];
	for (;;) {
	    OpenGL.glTexImage2Df
		(i, i_212_,
		 Class182_Sub1_Sub2.method18120(aClass165_5277,
						aClass178_5278),
		 i_209_, i_210_, 0,
		 Class182_Sub1_Sub2.method18124(aClass165_5277), 5126, fs_216_,
		 0);
	    if (i_213_ <= 1)
		break;
	    int i_218_ = i_209_ * i_211_;
	    for (int i_219_ = 0; i_219_ < i_211_; i_219_++) {
		int i_220_ = i_219_;
		int i_221_ = i_219_;
		int i_222_ = i_221_ + i_218_;
		for (int i_223_ = 0; i_223_ < i_215_; i_223_++) {
		    for (int i_224_ = 0; i_224_ < i_214_; i_224_++) {
			float f = fs_216_[i_221_];
			i_221_ += i_211_;
			f += fs_216_[i_221_];
			i_221_ += i_211_;
			f += fs_216_[i_222_];
			i_222_ += i_211_;
			f += fs_216_[i_222_];
			i_222_ += i_211_;
			fs_217_[i_220_] = f * 0.25F;
			i_220_ += i_211_;
		    }
		    i_221_ += i_218_;
		    i_222_ += i_218_;
		}
	    }
	    float[] fs_225_ = fs_217_;
	    fs_217_ = fs_216_;
	    fs_216_ = fs_225_;
	    i_209_ = i_214_;
	    i_210_ = i_215_;
	    i_214_ >>= 1;
	    i_215_ >>= 1;
	    i_213_ >>= 1;
	    i_212_++;
	}
    }
    
    boolean method228() {
	if (anInt5270 == 0)
	    throw new IllegalStateException("");
	int i = method7967();
	aClass182_Sub1_Sub2_5279.method14731(this);
	if (aClass182_Sub1_Sub2_5279.aBool11510)
	    OpenGL.glEnable(anInt5276);
	OpenGL.glGenerateMipmapEXT(anInt5276);
	if (aClass182_Sub1_Sub2_5279.aBool11510)
	    OpenGL.glDisable(anInt5276);
	aBool5274 = true;
	method7962();
	method7973(i);
	return true;
    }
    
    Class490(Class182_Sub1_Sub2 class182_sub1_sub2, int i, Class165 class165,
	     Class178 class178, int i_226_, boolean bool) {
	aClass182_Sub1_Sub2_5279 = class182_sub1_sub2;
	anInt5276 = i;
	aClass165_5277 = class165;
	aClass178_5278 = class178;
	aBool5274 = bool;
	anInt5281 = i_226_;
	OpenGL.glGenTextures(1, anIntArray5272, 0);
	anInt5270 = anIntArray5272[0];
	method7962();
	method7973(0);
    }
    
    int method7983() {
	int i = (aClass165_5277.anInt1770 * -1998053519
		 * (aClass178_5278.anInt1915 * -103623665) * anInt5281);
	return aBool5274 ? i * 4 / 3 : i;
    }
    
    int method7984() {
	int i = (aClass165_5277.anInt1770 * -1998053519
		 * (aClass178_5278.anInt1915 * -103623665) * anInt5281);
	return aBool5274 ? i * 4 / 3 : i;
    }
    
    void method7985() {
	if (anInt5270 != 0) {
	    aClass182_Sub1_Sub2_5279.method18114(anInt5270, method7967());
	    anInt5270 = 0;
	}
    }
    
    void method7986(int i) {
	aClass182_Sub1_Sub2_5279.anInt9166 -= i;
	aClass182_Sub1_Sub2_5279.anInt9166 += method7967();
    }
}
