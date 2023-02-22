/* Class516 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class516
{
    static final int anInt5724 = 16;
    static final int anInt5725 = 0;
    static final int anInt5726 = 1;
    static final int anInt5727 = 2;
    int anInt5728;
    int anInt5729;
    int anInt5730;
    int anInt5731;
    int anInt5732;
    static Class157 aClass157_5733;
    boolean aBool5734;
    int anInt5735;
    int anInt5736;
    static final int anInt5737 = 128;
    int anInt5738;
    int anInt5739;
    int anInt5740;
    static final int anInt5741 = 24;
    int anInt5742;
    int anInt5743;
    int anInt5744;
    static final int anInt5745 = 24;
    int anInt5746;
    static final int anInt5747 = 192;
    Class157 aClass157_5748;
    static final int anInt5749 = 13;
    static final int anInt5750 = 512;
    int anInt5751;
    static Class179 aClass179_5752;
    static Class157 aClass157_5753;
    static int[] anIntArray5754 = new int[4];
    
    void method8602(Class182 class182, Class516 class516_0_) {
	ModelDecoder class186
	    = ModelDecoder.method3644(Class326.aClass458_3563, anInt5735, 0);
	if (class186 != null) {
	    class182.method3187(anIntArray5754);
	    class182.method3184(0, 0, anInt5739, anInt5739);
	    class182.method3188(2, 0);
	    class182.method3151(0, 0, anInt5739, anInt5739, 0, 0);
	    int i = 0;
	    int i_1_ = 0;
	    int i_2_ = 256;
	    if (class516_0_ != null) {
		if (class516_0_.aBool5734) {
		    i = -class516_0_.anInt5730;
		    i_1_ = -class516_0_.anInt5731;
		    i_2_ = -class516_0_.anInt5732;
		} else {
		    i = anInt5730 - class516_0_.anInt5730;
		    i_1_ = anInt5731 - class516_0_.anInt5731;
		    i_2_ = anInt5732 - class516_0_.anInt5732;
		}
	    }
	    if (anInt5736 != 0) {
		int i_3_ = -anInt5736 & 0x3fff;
		int i_4_ = Class436.anIntArray4831[i_3_];
		int i_5_ = Class436.anIntArray4838[i_3_];
		int i_6_ = i_1_ * i_5_ - i_2_ * i_4_ >> 14;
		i_2_ = i_1_ * i_4_ + i_2_ * i_5_ >> 14;
		i_1_ = i_6_;
	    }
	    if (anInt5751 != 0) {
		int i_7_ = -anInt5751 & 0x3fff;
		int i_8_ = Class436.anIntArray4831[i_7_];
		int i_9_ = Class436.anIntArray4838[i_7_];
		int i_10_ = i_2_ * i_8_ + i * i_9_ >> 14;
		i_2_ = i_2_ * i_9_ - i * i_8_ >> 14;
		i = i_10_;
	    }
	    class182.method3351(1.0F);
	    class182.method3307(anInt5746, 1.0F, 1.0F, (float) i, (float) i_1_,
				(float) i_2_);
	    class186.method3647(anInt5742 & 0x3fff, anInt5743 & 0x3fff,
				anInt5744 & 0x3fff);
	    Class179 class179
		= class182.method3556(class186, 2048, 0, 64, 768);
	    int i_11_ = class179.method2959() - class179.method3001();
	    int i_12_ = class179.method2961() - class179.method2960();
	    int i_13_ = i_11_ > i_12_ ? i_11_ : i_12_;
	    int i_14_ = 1024 * anInt5739 / i_13_;
	    Class435 class435 = class182.method3237();
	    Class435 class435_15_ = class182.method3224();
	    class435_15_.method6948((float) (anInt5739 / 2),
				    (float) (anInt5739 / 2), (float) i_14_,
				    (float) i_14_, 50.0F, 50000.0F,
				    (float) class182.method3566
						(-1003239972).method2710(),
				    (float) class182.method3566(-778515393)
						.method2711(),
				    1024.0F);
	    class182.method3252(class435_15_);
	    Class444 class444 = new Class444();
	    class182.method3233(class444);
	    Class444 class444_16_ = class182.method3225();
	    class444_16_.method7137(0.0F, 0.0F,
				    (float) (50 - class179.method2962()));
	    class179.method2953(class444_16_, null, 1);
	    aClass157_5748
		= class182.method3217(0, 0, anInt5739, anInt5739, true);
	    aClass157_5748.method2477(0, 0, 3);
	    class182.method3252(class435);
	    class182.method3184(anIntArray5754[0], anIntArray5754[1],
				anIntArray5754[2], anIntArray5754[3]);
	}
    }
    
    static void method8603() {
	aClass179_5752 = null;
	aClass157_5733 = null;
    }
    
    boolean method8604(int i, int i_17_, int i_18_, int i_19_) {
	int i_20_;
	int i_21_;
	int i_22_;
	if (!aBool5734) {
	    i_20_ = anInt5730 - i;
	    i_21_ = anInt5731 - i_17_;
	    i_22_ = anInt5732 - i_18_;
	    anInt5738 = (int) Math.sqrt((double) (i_20_ * i_20_ + i_21_ * i_21_
						  + i_22_ * i_22_));
	    if (anInt5738 == 0)
		anInt5738 = 1;
	    i_20_ = (i_20_ << 8) / anInt5738;
	    i_21_ = (i_21_ << 8) / anInt5738;
	    i_22_ = (i_22_ << 8) / anInt5738;
	} else {
	    anInt5738 = 1073741823;
	    i_20_ = anInt5730;
	    i_21_ = anInt5731;
	    i_22_ = anInt5732;
	}
	int i_23_ = (int) (Math.sqrt((double) (i_20_ * i_20_ + i_21_ * i_21_
					       + i_22_ * i_22_))
			   * 256.0);
	if (i_23_ > 128) {
	    i_20_ = (i_20_ << 16) / i_23_;
	    i_21_ = (i_21_ << 16) / i_23_;
	    i_22_ = (i_22_ << 16) / i_23_;
	    anInt5740 = anInt5729 * i_19_ / (aBool5734 ? 1024 : anInt5738);
	} else
	    anInt5740 = 0;
	if (anInt5740 < 8) {
	    aClass157_5748 = null;
	    return false;
	}
	int i_24_ = Class212.method3935(anInt5740, -2056250364);
	if (i_24_ > i_19_)
	    i_24_ = Class696_Sub18.method17142(i_19_, (byte) 118);
	if (i_24_ > 512)
	    i_24_ = 512;
	if (i_24_ != anInt5739)
	    anInt5739 = i_24_;
	anInt5736 = (int) (Math.asin((double) ((float) i_21_ / 256.0F))
			   * 2607.5945876176133) & 0x3fff;
	anInt5751 = (int) (Math.atan2((double) i_20_, (double) -i_22_)
			   * 2607.5945876176133) & 0x3fff;
	aClass157_5748 = null;
	return true;
    }
    
    boolean method8605(Class182 class182, Class516 class516_25_) {
	return aClass157_5748 != null || method8617(class182, class516_25_);
    }
    
    void method8606(Class182 class182, int i, int i_26_, int i_27_, int i_28_,
		    int i_29_, int i_30_, int i_31_, int i_32_, int i_33_,
		    int i_34_) {
	if (aClass157_5748 != null) {
	    float[] fs = new float[3];
	    float f = (float) -(anInt5730 - i_31_ << 16);
	    float f_35_ = (float) (anInt5731 - i_32_ << 15);
	    float f_36_ = (float) -(anInt5732 - i_33_ << 16);
	    float[] fs_37_ = new float[3];
	    class182.method3491().method7155(fs_37_);
	    f += fs_37_[0];
	    f_35_ += fs_37_[1];
	    f_36_ += fs_37_[2];
	    class182.method3360(f, f_35_, f_36_, fs);
	    if (!(fs[2] < 0.0F)) {
		int i_38_ = (int) (fs[0] - (float) (anInt5740 / 2));
		int i_39_ = (int) (fs[1] - (float) (anInt5740 / 2));
		if (i_39_ < i_28_ && i_39_ + anInt5740 > 0 && i_38_ < i_27_
		    && i_38_ + anInt5740 > 0)
		    aClass157_5748.method2482(i_38_, i_39_, anInt5740,
					      anInt5740, 0,
					      i_34_ << 24 | 0xffffff, 1);
	    }
	}
    }
    
    void method8607(Class182 class182, Class516 class516_40_) {
	ModelDecoder class186
	    = ModelDecoder.method3644(Class326.aClass458_3563, anInt5735, 0);
	if (class186 != null) {
	    class182.method3187(anIntArray5754);
	    class182.method3184(0, 0, anInt5739, anInt5739);
	    class182.method3188(2, 0);
	    class182.method3151(0, 0, anInt5739, anInt5739, 0, 0);
	    int i = 0;
	    int i_41_ = 0;
	    int i_42_ = 256;
	    if (class516_40_ != null) {
		if (class516_40_.aBool5734) {
		    i = -class516_40_.anInt5730;
		    i_41_ = -class516_40_.anInt5731;
		    i_42_ = -class516_40_.anInt5732;
		} else {
		    i = anInt5730 - class516_40_.anInt5730;
		    i_41_ = anInt5731 - class516_40_.anInt5731;
		    i_42_ = anInt5732 - class516_40_.anInt5732;
		}
	    }
	    if (anInt5736 != 0) {
		int i_43_ = -anInt5736 & 0x3fff;
		int i_44_ = Class436.anIntArray4831[i_43_];
		int i_45_ = Class436.anIntArray4838[i_43_];
		int i_46_ = i_41_ * i_45_ - i_42_ * i_44_ >> 14;
		i_42_ = i_41_ * i_44_ + i_42_ * i_45_ >> 14;
		i_41_ = i_46_;
	    }
	    if (anInt5751 != 0) {
		int i_47_ = -anInt5751 & 0x3fff;
		int i_48_ = Class436.anIntArray4831[i_47_];
		int i_49_ = Class436.anIntArray4838[i_47_];
		int i_50_ = i_42_ * i_48_ + i * i_49_ >> 14;
		i_42_ = i_42_ * i_49_ - i * i_48_ >> 14;
		i = i_50_;
	    }
	    class182.method3351(1.0F);
	    class182.method3307(anInt5746, 1.0F, 1.0F, (float) i,
				(float) i_41_, (float) i_42_);
	    class186.method3647(anInt5742 & 0x3fff, anInt5743 & 0x3fff,
				anInt5744 & 0x3fff);
	    Class179 class179
		= class182.method3556(class186, 2048, 0, 64, 768);
	    int i_51_ = class179.method2959() - class179.method3001();
	    int i_52_ = class179.method2961() - class179.method2960();
	    int i_53_ = i_51_ > i_52_ ? i_51_ : i_52_;
	    int i_54_ = 1024 * anInt5739 / i_53_;
	    Class435 class435 = class182.method3237();
	    Class435 class435_55_ = class182.method3224();
	    class435_55_.method6948((float) (anInt5739 / 2),
				    (float) (anInt5739 / 2), (float) i_54_,
				    (float) i_54_, 50.0F, 50000.0F,
				    (float) class182.method3566
						(-1238006807).method2710(),
				    (float) class182.method3566
						(-1150893415).method2711(),
				    1024.0F);
	    class182.method3252(class435_55_);
	    Class444 class444 = new Class444();
	    class182.method3233(class444);
	    Class444 class444_56_ = class182.method3225();
	    class444_56_.method7137(0.0F, 0.0F,
				    (float) (50 - class179.method2962()));
	    class179.method2953(class444_56_, null, 1);
	    aClass157_5748
		= class182.method3217(0, 0, anInt5739, anInt5739, true);
	    aClass157_5748.method2477(0, 0, 3);
	    class182.method3252(class435);
	    class182.method3184(anIntArray5754[0], anIntArray5754[1],
				anIntArray5754[2], anIntArray5754[3]);
	}
    }
    
    boolean method8608(Class182 class182, Class516 class516_57_) {
	return aClass157_5748 != null || method8617(class182, class516_57_);
    }
    
    void method8609(Class182 class182, Class516 class516_58_) {
	method8610(class182);
	method8611(class182);
	class182.method3187(anIntArray5754);
	class182.method3184(0, 0, anInt5739, anInt5739);
	class182.method3188(2, 0);
	class182.method3151(0, 0, anInt5739, anInt5739, ~0xffffff | anInt5746,
			    0);
	int i = 0;
	int i_59_ = 0;
	int i_60_ = 256;
	if (class516_58_ != null) {
	    if (class516_58_.aBool5734) {
		i = -class516_58_.anInt5730;
		i_59_ = -class516_58_.anInt5731;
		i_60_ = -class516_58_.anInt5732;
	    } else {
		i = class516_58_.anInt5730 - anInt5730;
		i_59_ = class516_58_.anInt5731 - anInt5731;
		i_60_ = class516_58_.anInt5732 - anInt5732;
	    }
	}
	if (anInt5736 != 0) {
	    int i_61_ = Class436.anIntArray4831[anInt5736];
	    int i_62_ = Class436.anIntArray4838[anInt5736];
	    int i_63_ = i_59_ * i_62_ - i_60_ * i_61_ >> 14;
	    i_60_ = i_59_ * i_61_ + i_60_ * i_62_ >> 14;
	    i_59_ = i_63_;
	}
	if (anInt5751 != 0) {
	    int i_64_ = Class436.anIntArray4831[anInt5751];
	    int i_65_ = Class436.anIntArray4838[anInt5751];
	    int i_66_ = i_60_ * i_64_ + i * i_65_ >> 14;
	    i_60_ = i_60_ * i_65_ - i * i_64_ >> 14;
	    i = i_66_;
	}
	Class179 class179 = aClass179_5752.method2926((byte) 0, 51200, true);
	class179.method2973((short) 0, (short) anInt5735);
	class182.method3351(1.0F);
	class182.method3307(16777215, 1.0F, 1.0F, (float) i, (float) i_59_,
			    (float) i_60_);
	int i_67_ = (1024 * anInt5739
		     / (class179.method2959() - class179.method3001()));
	if (anInt5746 != 0)
	    i_67_ = i_67_ * 13 / 16;
	Class435 class435 = class182.method3237();
	Class435 class435_68_ = class182.method3224();
	class435_68_.method6948
	    ((float) (anInt5739 / 2), (float) (anInt5739 / 2), (float) i_67_,
	     (float) i_67_, 50.0F, 50000.0F,
	     (float) class182.method3566(-1975650648).method2710(),
	     (float) class182.method3566(-2046446768).method2711(), 1024.0F);
	class182.method3252(class435_68_);
	class182.method3233(new Class444());
	Class444 class444 = new Class444();
	class444.method7137(0.0F, 0.0F, (float) (50 - class179.method2962()));
	class179.method2953(class444, null, 1);
	int i_69_ = anInt5739 * 13 / 16;
	int i_70_ = (anInt5739 - i_69_) / 2;
	aClass157_5753.method2482(i_70_, i_70_, i_69_, i_69_, 0,
				  ~0xffffff | anInt5746, 1);
	aClass157_5748 = class182.method3217(0, 0, anInt5739, anInt5739, true);
	class182.method3188(2, 0);
	class182.method3151(0, 0, anInt5739, anInt5739, 0, 0);
	aClass157_5733.method2482(0, 0, anInt5739, anInt5739, 1, 0, 0);
	aClass157_5748.method2477(0, 0, 3);
	class182.method3252(class435);
	class182.method3184(anIntArray5754[0], anIntArray5754[1],
			    anIntArray5754[2], anIntArray5754[3]);
    }
    
    static void method8610(Class182 class182) {
	if (aClass179_5752 == null) {
	    ModelDecoder class186 = new ModelDecoder(580, 1104, 1);
	    class186.method3628((short) 0, (short) 32767, (short) 0,
				(short) 1024, (short) 1024, (short) 1024,
				(byte) 0, (byte) 0, (byte) 0);
	    class186.method3625(0, 128, 0);
	    class186.method3625(0, -128, 0);
	    for (int i = 0; i <= 24; i++) {
		int i_71_ = i * 8192 / 24;
		int i_72_ = Class436.anIntArray4831[i_71_];
		int i_73_ = Class436.anIntArray4838[i_71_];
		for (int i_74_ = 1; i_74_ < 24; i_74_++) {
		    int i_75_ = i_74_ * 8192 / 24;
		    int i_76_ = Class436.anIntArray4838[i_75_] >> 7;
		    int i_77_ = Class436.anIntArray4831[i_75_] * i_72_ >> 21;
		    int i_78_ = Class436.anIntArray4831[i_75_] * i_73_ >> 21;
		    class186.method3625(i_78_, i_76_, -i_77_);
		}
		if (i > 0) {
		    int i_79_ = i * 23 + 2;
		    int i_80_ = i_79_ - 23;
		    class186.method3626(0, i_80_, i_79_, (byte) 0, (byte) 0,
					(short) 127, (byte) 0, (short) 0);
		    for (int i_81_ = 1; i_81_ < 23; i_81_++) {
			int i_82_ = i_80_ + 1;
			int i_83_ = i_79_ + 1;
			class186.method3626(i_80_, i_82_, i_79_, (byte) 0,
					    (byte) 0, (short) 127, (byte) 0,
					    (short) 0);
			class186.method3626(i_82_, i_83_, i_79_, (byte) 0,
					    (byte) 0, (short) 127, (byte) 0,
					    (short) 0);
			i_80_ = i_82_;
			i_79_ = i_83_;
		    }
		    class186.method3626(i_79_, i_80_, 1, (byte) 0, (byte) 0,
					(short) 127, (byte) 0, (short) 0);
		}
	    }
	    class186.maxVertexUsed = class186.vertexCount;
	    class186.faceBones = null;
	    class186.vertexBones = null;
	    class186.facePriorities = null;
	    aClass179_5752 = class182.method3556(class186, 51200, 33, 64, 768);
	}
    }
    
    static void method8611(Class182 class182) {
	if (aClass157_5733 == null) {
	    int[] is = new int[16384];
	    int[] is_84_ = new int[16384];
	    for (int i = 0; i < 64; i++) {
		int i_85_ = 64 - i;
		i_85_ *= i_85_;
		int i_86_ = 128 - i - 1;
		int i_87_ = i * 128;
		int i_88_ = i_86_ * 128;
		for (int i_89_ = 0; i_89_ < 64; i_89_++) {
		    int i_90_ = 64 - i_89_;
		    i_90_ *= i_90_;
		    int i_91_ = 128 - i_89_ - 1;
		    int i_92_ = 256 - (i_90_ + i_85_ << 8) / 4096;
		    i_92_ = i_92_ * 3072 / 1536;
		    if (i_92_ < 0)
			i_92_ = 0;
		    else if (i_92_ > 255)
			i_92_ = 255;
		    int i_93_ = i_92_ / 2;
		    is_84_[i_87_ + i_89_] = is_84_[i_87_ + i_91_]
			= is_84_[i_88_ + i_89_] = is_84_[i_88_ + i_91_]
			= ~0xffffff | i_92_ << 16;
		    is[i_87_ + i_89_] = is[i_87_ + i_91_]
			= is[i_88_ + i_89_] = is[i_88_ + i_91_]
			= 127 - i_93_ << 24 | 0xffffff;
		}
	    }
	    aClass157_5733
		= class182.method3215(is_84_, 0, 128, 128, 128, (byte) 85);
	    aClass157_5753
		= class182.method3215(is, 0, 128, 128, 128, (byte) 11);
	}
    }
    
    static void method8612() {
	aClass179_5752 = null;
	aClass157_5733 = null;
    }
    
    static void method8613(Class182 class182) {
	if (aClass179_5752 == null) {
	    ModelDecoder class186 = new ModelDecoder(580, 1104, 1);
	    class186.method3628((short) 0, (short) 32767, (short) 0,
				(short) 1024, (short) 1024, (short) 1024,
				(byte) 0, (byte) 0, (byte) 0);
	    class186.method3625(0, 128, 0);
	    class186.method3625(0, -128, 0);
	    for (int i = 0; i <= 24; i++) {
		int i_94_ = i * 8192 / 24;
		int i_95_ = Class436.anIntArray4831[i_94_];
		int i_96_ = Class436.anIntArray4838[i_94_];
		for (int i_97_ = 1; i_97_ < 24; i_97_++) {
		    int i_98_ = i_97_ * 8192 / 24;
		    int i_99_ = Class436.anIntArray4838[i_98_] >> 7;
		    int i_100_ = Class436.anIntArray4831[i_98_] * i_95_ >> 21;
		    int i_101_ = Class436.anIntArray4831[i_98_] * i_96_ >> 21;
		    class186.method3625(i_101_, i_99_, -i_100_);
		}
		if (i > 0) {
		    int i_102_ = i * 23 + 2;
		    int i_103_ = i_102_ - 23;
		    class186.method3626(0, i_103_, i_102_, (byte) 0, (byte) 0,
					(short) 127, (byte) 0, (short) 0);
		    for (int i_104_ = 1; i_104_ < 23; i_104_++) {
			int i_105_ = i_103_ + 1;
			int i_106_ = i_102_ + 1;
			class186.method3626(i_103_, i_105_, i_102_, (byte) 0,
					    (byte) 0, (short) 127, (byte) 0,
					    (short) 0);
			class186.method3626(i_105_, i_106_, i_102_, (byte) 0,
					    (byte) 0, (short) 127, (byte) 0,
					    (short) 0);
			i_103_ = i_105_;
			i_102_ = i_106_;
		    }
		    class186.method3626(i_102_, i_103_, 1, (byte) 0, (byte) 0,
					(short) 127, (byte) 0, (short) 0);
		}
	    }
	    class186.maxVertexUsed = class186.vertexCount;
	    class186.faceBones = null;
	    class186.vertexBones = null;
	    class186.facePriorities = null;
	    aClass179_5752 = class182.method3556(class186, 51200, 33, 64, 768);
	}
    }
    
    static void method8614() {
	aClass179_5752 = null;
	aClass157_5733 = null;
    }
    
    boolean method8615(Class182 class182, Class516 class516_107_) {
	if (aClass157_5748 == null) {
	    if (anInt5728 == 0) {
		if (Class406.anInterface24_4168.method130
		    (Class593.aClass593_7831, anInt5735,
		     Class594.aClass594_7833, 0.7F, anInt5739, anInt5739,
		     false, (byte) 102)) {
		    int[] is = (Class406.anInterface24_4168.method132
				(Class593.aClass593_7831, anInt5735, 0.7F,
				 anInt5739, anInt5739, false, -1005831774));
		    aClass157_5748
			= class182.method3215(is, 0, anInt5739, anInt5739,
					      anInt5739, (byte) 66);
		}
	    } else if (anInt5728 == 2)
		method8629(class182, class516_107_);
	    else if (anInt5728 == 1)
		method8609(class182, class516_107_);
	}
	return aClass157_5748 != null;
    }
    
    boolean method8616(int i, int i_108_, int i_109_, int i_110_) {
	int i_111_;
	int i_112_;
	int i_113_;
	if (!aBool5734) {
	    i_111_ = anInt5730 - i;
	    i_112_ = anInt5731 - i_108_;
	    i_113_ = anInt5732 - i_109_;
	    anInt5738
		= (int) Math.sqrt((double) (i_111_ * i_111_ + i_112_ * i_112_
					    + i_113_ * i_113_));
	    if (anInt5738 == 0)
		anInt5738 = 1;
	    i_111_ = (i_111_ << 8) / anInt5738;
	    i_112_ = (i_112_ << 8) / anInt5738;
	    i_113_ = (i_113_ << 8) / anInt5738;
	} else {
	    anInt5738 = 1073741823;
	    i_111_ = anInt5730;
	    i_112_ = anInt5731;
	    i_113_ = anInt5732;
	}
	int i_114_
	    = (int) (Math.sqrt((double) (i_111_ * i_111_ + i_112_ * i_112_
					 + i_113_ * i_113_))
		     * 256.0);
	if (i_114_ > 128) {
	    i_111_ = (i_111_ << 16) / i_114_;
	    i_112_ = (i_112_ << 16) / i_114_;
	    i_113_ = (i_113_ << 16) / i_114_;
	    anInt5740 = anInt5729 * i_110_ / (aBool5734 ? 1024 : anInt5738);
	} else
	    anInt5740 = 0;
	if (anInt5740 < 8) {
	    aClass157_5748 = null;
	    return false;
	}
	int i_115_ = Class212.method3935(anInt5740, -2056250364);
	if (i_115_ > i_110_)
	    i_115_ = Class696_Sub18.method17142(i_110_, (byte) 18);
	if (i_115_ > 512)
	    i_115_ = 512;
	if (i_115_ != anInt5739)
	    anInt5739 = i_115_;
	anInt5736 = (int) (Math.asin((double) ((float) i_112_ / 256.0F))
			   * 2607.5945876176133) & 0x3fff;
	anInt5751 = (int) (Math.atan2((double) i_111_, (double) -i_113_)
			   * 2607.5945876176133) & 0x3fff;
	aClass157_5748 = null;
	return true;
    }
    
    boolean method8617(Class182 class182, Class516 class516_116_) {
	if (aClass157_5748 == null) {
	    if (anInt5728 == 0) {
		if (Class406.anInterface24_4168.method130
		    (Class593.aClass593_7831, anInt5735,
		     Class594.aClass594_7833, 0.7F, anInt5739, anInt5739,
		     false, (byte) 104)) {
		    int[] is = (Class406.anInterface24_4168.method132
				(Class593.aClass593_7831, anInt5735, 0.7F,
				 anInt5739, anInt5739, false, -547566560));
		    aClass157_5748
			= class182.method3215(is, 0, anInt5739, anInt5739,
					      anInt5739, (byte) 38);
		}
	    } else if (anInt5728 == 2)
		method8629(class182, class516_116_);
	    else if (anInt5728 == 1)
		method8609(class182, class516_116_);
	}
	return aClass157_5748 != null;
    }
    
    boolean method8618(Class182 class182, Class516 class516_117_) {
	return aClass157_5748 != null || method8617(class182, class516_117_);
    }
    
    boolean method8619(Class182 class182, Class516 class516_118_) {
	if (aClass157_5748 == null) {
	    if (anInt5728 == 0) {
		if (Class406.anInterface24_4168.method130
		    (Class593.aClass593_7831, anInt5735,
		     Class594.aClass594_7833, 0.7F, anInt5739, anInt5739,
		     false, (byte) 66)) {
		    int[] is = (Class406.anInterface24_4168.method132
				(Class593.aClass593_7831, anInt5735, 0.7F,
				 anInt5739, anInt5739, false, -792504306));
		    aClass157_5748
			= class182.method3215(is, 0, anInt5739, anInt5739,
					      anInt5739, (byte) 104);
		}
	    } else if (anInt5728 == 2)
		method8629(class182, class516_118_);
	    else if (anInt5728 == 1)
		method8609(class182, class516_118_);
	}
	return aClass157_5748 != null;
    }
    
    void method8620(Class182 class182, int i, int i_119_, int i_120_,
		    int i_121_, int i_122_, int i_123_, int i_124_, int i_125_,
		    int i_126_, int i_127_) {
	if (aClass157_5748 != null) {
	    float[] fs = new float[3];
	    float f = (float) -(anInt5730 - i_124_ << 16);
	    float f_128_ = (float) (anInt5731 - i_125_ << 15);
	    float f_129_ = (float) -(anInt5732 - i_126_ << 16);
	    float[] fs_130_ = new float[3];
	    class182.method3491().method7155(fs_130_);
	    f += fs_130_[0];
	    f_128_ += fs_130_[1];
	    f_129_ += fs_130_[2];
	    class182.method3360(f, f_128_, f_129_, fs);
	    if (!(fs[2] < 0.0F)) {
		int i_131_ = (int) (fs[0] - (float) (anInt5740 / 2));
		int i_132_ = (int) (fs[1] - (float) (anInt5740 / 2));
		if (i_132_ < i_121_ && i_132_ + anInt5740 > 0
		    && i_131_ < i_120_ && i_131_ + anInt5740 > 0)
		    aClass157_5748.method2482(i_131_, i_132_, anInt5740,
					      anInt5740, 0,
					      i_127_ << 24 | 0xffffff, 1);
	    }
	}
    }
    
    void method8621(Class182 class182, int i, int i_133_, int i_134_,
		    int i_135_, int i_136_, int i_137_, int i_138_, int i_139_,
		    int i_140_, int i_141_) {
	if (aClass157_5748 != null) {
	    float[] fs = new float[3];
	    float f = (float) -(anInt5730 - i_138_ << 16);
	    float f_142_ = (float) (anInt5731 - i_139_ << 15);
	    float f_143_ = (float) -(anInt5732 - i_140_ << 16);
	    float[] fs_144_ = new float[3];
	    class182.method3491().method7155(fs_144_);
	    f += fs_144_[0];
	    f_142_ += fs_144_[1];
	    f_143_ += fs_144_[2];
	    class182.method3360(f, f_142_, f_143_, fs);
	    if (!(fs[2] < 0.0F)) {
		int i_145_ = (int) (fs[0] - (float) (anInt5740 / 2));
		int i_146_ = (int) (fs[1] - (float) (anInt5740 / 2));
		if (i_146_ < i_135_ && i_146_ + anInt5740 > 0
		    && i_145_ < i_134_ && i_145_ + anInt5740 > 0)
		    aClass157_5748.method2482(i_145_, i_146_, anInt5740,
					      anInt5740, 0,
					      i_141_ << 24 | 0xffffff, 1);
	    }
	}
    }
    
    void method8622(Class182 class182, Class516 class516_147_) {
	ModelDecoder class186
	    = ModelDecoder.method3644(Class326.aClass458_3563, anInt5735, 0);
	if (class186 != null) {
	    class182.method3187(anIntArray5754);
	    class182.method3184(0, 0, anInt5739, anInt5739);
	    class182.method3188(2, 0);
	    class182.method3151(0, 0, anInt5739, anInt5739, 0, 0);
	    int i = 0;
	    int i_148_ = 0;
	    int i_149_ = 256;
	    if (class516_147_ != null) {
		if (class516_147_.aBool5734) {
		    i = -class516_147_.anInt5730;
		    i_148_ = -class516_147_.anInt5731;
		    i_149_ = -class516_147_.anInt5732;
		} else {
		    i = anInt5730 - class516_147_.anInt5730;
		    i_148_ = anInt5731 - class516_147_.anInt5731;
		    i_149_ = anInt5732 - class516_147_.anInt5732;
		}
	    }
	    if (anInt5736 != 0) {
		int i_150_ = -anInt5736 & 0x3fff;
		int i_151_ = Class436.anIntArray4831[i_150_];
		int i_152_ = Class436.anIntArray4838[i_150_];
		int i_153_ = i_148_ * i_152_ - i_149_ * i_151_ >> 14;
		i_149_ = i_148_ * i_151_ + i_149_ * i_152_ >> 14;
		i_148_ = i_153_;
	    }
	    if (anInt5751 != 0) {
		int i_154_ = -anInt5751 & 0x3fff;
		int i_155_ = Class436.anIntArray4831[i_154_];
		int i_156_ = Class436.anIntArray4838[i_154_];
		int i_157_ = i_149_ * i_155_ + i * i_156_ >> 14;
		i_149_ = i_149_ * i_156_ - i * i_155_ >> 14;
		i = i_157_;
	    }
	    class182.method3351(1.0F);
	    class182.method3307(anInt5746, 1.0F, 1.0F, (float) i,
				(float) i_148_, (float) i_149_);
	    class186.method3647(anInt5742 & 0x3fff, anInt5743 & 0x3fff,
				anInt5744 & 0x3fff);
	    Class179 class179
		= class182.method3556(class186, 2048, 0, 64, 768);
	    int i_158_ = class179.method2959() - class179.method3001();
	    int i_159_ = class179.method2961() - class179.method2960();
	    int i_160_ = i_158_ > i_159_ ? i_158_ : i_159_;
	    int i_161_ = 1024 * anInt5739 / i_160_;
	    Class435 class435 = class182.method3237();
	    Class435 class435_162_ = class182.method3224();
	    class435_162_.method6948((float) (anInt5739 / 2),
				     (float) (anInt5739 / 2), (float) i_161_,
				     (float) i_161_, 50.0F, 50000.0F,
				     (float) class182.method3566(46272338)
						 .method2710(),
				     (float) class182.method3566
						 (-256083595).method2711(),
				     1024.0F);
	    class182.method3252(class435_162_);
	    Class444 class444 = new Class444();
	    class182.method3233(class444);
	    Class444 class444_163_ = class182.method3225();
	    class444_163_.method7137(0.0F, 0.0F,
				     (float) (50 - class179.method2962()));
	    class179.method2953(class444_163_, null, 1);
	    aClass157_5748
		= class182.method3217(0, 0, anInt5739, anInt5739, true);
	    aClass157_5748.method2477(0, 0, 3);
	    class182.method3252(class435);
	    class182.method3184(anIntArray5754[0], anIntArray5754[1],
				anIntArray5754[2], anIntArray5754[3]);
	}
    }
    
    static void method8623(Class182 class182) {
	if (aClass179_5752 == null) {
	    ModelDecoder class186 = new ModelDecoder(580, 1104, 1);
	    class186.method3628((short) 0, (short) 32767, (short) 0,
				(short) 1024, (short) 1024, (short) 1024,
				(byte) 0, (byte) 0, (byte) 0);
	    class186.method3625(0, 128, 0);
	    class186.method3625(0, -128, 0);
	    for (int i = 0; i <= 24; i++) {
		int i_164_ = i * 8192 / 24;
		int i_165_ = Class436.anIntArray4831[i_164_];
		int i_166_ = Class436.anIntArray4838[i_164_];
		for (int i_167_ = 1; i_167_ < 24; i_167_++) {
		    int i_168_ = i_167_ * 8192 / 24;
		    int i_169_ = Class436.anIntArray4838[i_168_] >> 7;
		    int i_170_
			= Class436.anIntArray4831[i_168_] * i_165_ >> 21;
		    int i_171_
			= Class436.anIntArray4831[i_168_] * i_166_ >> 21;
		    class186.method3625(i_171_, i_169_, -i_170_);
		}
		if (i > 0) {
		    int i_172_ = i * 23 + 2;
		    int i_173_ = i_172_ - 23;
		    class186.method3626(0, i_173_, i_172_, (byte) 0, (byte) 0,
					(short) 127, (byte) 0, (short) 0);
		    for (int i_174_ = 1; i_174_ < 23; i_174_++) {
			int i_175_ = i_173_ + 1;
			int i_176_ = i_172_ + 1;
			class186.method3626(i_173_, i_175_, i_172_, (byte) 0,
					    (byte) 0, (short) 127, (byte) 0,
					    (short) 0);
			class186.method3626(i_175_, i_176_, i_172_, (byte) 0,
					    (byte) 0, (short) 127, (byte) 0,
					    (short) 0);
			i_173_ = i_175_;
			i_172_ = i_176_;
		    }
		    class186.method3626(i_172_, i_173_, 1, (byte) 0, (byte) 0,
					(short) 127, (byte) 0, (short) 0);
		}
	    }
	    class186.maxVertexUsed = class186.vertexCount;
	    class186.faceBones = null;
	    class186.vertexBones = null;
	    class186.facePriorities = null;
	    aClass179_5752 = class182.method3556(class186, 51200, 33, 64, 768);
	}
    }
    
    boolean method8624(Class182 class182, Class516 class516_177_) {
	if (aClass157_5748 == null) {
	    if (anInt5728 == 0) {
		if (Class406.anInterface24_4168.method130
		    (Class593.aClass593_7831, anInt5735,
		     Class594.aClass594_7833, 0.7F, anInt5739, anInt5739,
		     false, (byte) 21)) {
		    int[] is = (Class406.anInterface24_4168.method132
				(Class593.aClass593_7831, anInt5735, 0.7F,
				 anInt5739, anInt5739, false, -556534462));
		    aClass157_5748
			= class182.method3215(is, 0, anInt5739, anInt5739,
					      anInt5739, (byte) 109);
		}
	    } else if (anInt5728 == 2)
		method8629(class182, class516_177_);
	    else if (anInt5728 == 1)
		method8609(class182, class516_177_);
	}
	return aClass157_5748 != null;
    }
    
    void method8625(Class182 class182, Class516 class516_178_) {
	ModelDecoder class186
	    = ModelDecoder.method3644(Class326.aClass458_3563, anInt5735, 0);
	if (class186 != null) {
	    class182.method3187(anIntArray5754);
	    class182.method3184(0, 0, anInt5739, anInt5739);
	    class182.method3188(2, 0);
	    class182.method3151(0, 0, anInt5739, anInt5739, 0, 0);
	    int i = 0;
	    int i_179_ = 0;
	    int i_180_ = 256;
	    if (class516_178_ != null) {
		if (class516_178_.aBool5734) {
		    i = -class516_178_.anInt5730;
		    i_179_ = -class516_178_.anInt5731;
		    i_180_ = -class516_178_.anInt5732;
		} else {
		    i = anInt5730 - class516_178_.anInt5730;
		    i_179_ = anInt5731 - class516_178_.anInt5731;
		    i_180_ = anInt5732 - class516_178_.anInt5732;
		}
	    }
	    if (anInt5736 != 0) {
		int i_181_ = -anInt5736 & 0x3fff;
		int i_182_ = Class436.anIntArray4831[i_181_];
		int i_183_ = Class436.anIntArray4838[i_181_];
		int i_184_ = i_179_ * i_183_ - i_180_ * i_182_ >> 14;
		i_180_ = i_179_ * i_182_ + i_180_ * i_183_ >> 14;
		i_179_ = i_184_;
	    }
	    if (anInt5751 != 0) {
		int i_185_ = -anInt5751 & 0x3fff;
		int i_186_ = Class436.anIntArray4831[i_185_];
		int i_187_ = Class436.anIntArray4838[i_185_];
		int i_188_ = i_180_ * i_186_ + i * i_187_ >> 14;
		i_180_ = i_180_ * i_187_ - i * i_186_ >> 14;
		i = i_188_;
	    }
	    class182.method3351(1.0F);
	    class182.method3307(anInt5746, 1.0F, 1.0F, (float) i,
				(float) i_179_, (float) i_180_);
	    class186.method3647(anInt5742 & 0x3fff, anInt5743 & 0x3fff,
				anInt5744 & 0x3fff);
	    Class179 class179
		= class182.method3556(class186, 2048, 0, 64, 768);
	    int i_189_ = class179.method2959() - class179.method3001();
	    int i_190_ = class179.method2961() - class179.method2960();
	    int i_191_ = i_189_ > i_190_ ? i_189_ : i_190_;
	    int i_192_ = 1024 * anInt5739 / i_191_;
	    Class435 class435 = class182.method3237();
	    Class435 class435_193_ = class182.method3224();
	    class435_193_.method6948((float) (anInt5739 / 2),
				     (float) (anInt5739 / 2), (float) i_192_,
				     (float) i_192_, 50.0F, 50000.0F,
				     (float) class182.method3566
						 (-1306454711).method2710(),
				     (float) class182.method3566
						 (-1873993262).method2711(),
				     1024.0F);
	    class182.method3252(class435_193_);
	    Class444 class444 = new Class444();
	    class182.method3233(class444);
	    Class444 class444_194_ = class182.method3225();
	    class444_194_.method7137(0.0F, 0.0F,
				     (float) (50 - class179.method2962()));
	    class179.method2953(class444_194_, null, 1);
	    aClass157_5748
		= class182.method3217(0, 0, anInt5739, anInt5739, true);
	    aClass157_5748.method2477(0, 0, 3);
	    class182.method3252(class435);
	    class182.method3184(anIntArray5754[0], anIntArray5754[1],
				anIntArray5754[2], anIntArray5754[3]);
	}
    }
    
    boolean method8626(Class182 class182, Class516 class516_195_) {
	return aClass157_5748 != null || method8617(class182, class516_195_);
    }
    
    void method8627(Class182 class182, Class516 class516_196_) {
	ModelDecoder class186
	    = ModelDecoder.method3644(Class326.aClass458_3563, anInt5735, 0);
	if (class186 != null) {
	    class182.method3187(anIntArray5754);
	    class182.method3184(0, 0, anInt5739, anInt5739);
	    class182.method3188(2, 0);
	    class182.method3151(0, 0, anInt5739, anInt5739, 0, 0);
	    int i = 0;
	    int i_197_ = 0;
	    int i_198_ = 256;
	    if (class516_196_ != null) {
		if (class516_196_.aBool5734) {
		    i = -class516_196_.anInt5730;
		    i_197_ = -class516_196_.anInt5731;
		    i_198_ = -class516_196_.anInt5732;
		} else {
		    i = anInt5730 - class516_196_.anInt5730;
		    i_197_ = anInt5731 - class516_196_.anInt5731;
		    i_198_ = anInt5732 - class516_196_.anInt5732;
		}
	    }
	    if (anInt5736 != 0) {
		int i_199_ = -anInt5736 & 0x3fff;
		int i_200_ = Class436.anIntArray4831[i_199_];
		int i_201_ = Class436.anIntArray4838[i_199_];
		int i_202_ = i_197_ * i_201_ - i_198_ * i_200_ >> 14;
		i_198_ = i_197_ * i_200_ + i_198_ * i_201_ >> 14;
		i_197_ = i_202_;
	    }
	    if (anInt5751 != 0) {
		int i_203_ = -anInt5751 & 0x3fff;
		int i_204_ = Class436.anIntArray4831[i_203_];
		int i_205_ = Class436.anIntArray4838[i_203_];
		int i_206_ = i_198_ * i_204_ + i * i_205_ >> 14;
		i_198_ = i_198_ * i_205_ - i * i_204_ >> 14;
		i = i_206_;
	    }
	    class182.method3351(1.0F);
	    class182.method3307(anInt5746, 1.0F, 1.0F, (float) i,
				(float) i_197_, (float) i_198_);
	    class186.method3647(anInt5742 & 0x3fff, anInt5743 & 0x3fff,
				anInt5744 & 0x3fff);
	    Class179 class179
		= class182.method3556(class186, 2048, 0, 64, 768);
	    int i_207_ = class179.method2959() - class179.method3001();
	    int i_208_ = class179.method2961() - class179.method2960();
	    int i_209_ = i_207_ > i_208_ ? i_207_ : i_208_;
	    int i_210_ = 1024 * anInt5739 / i_209_;
	    Class435 class435 = class182.method3237();
	    Class435 class435_211_ = class182.method3224();
	    class435_211_.method6948((float) (anInt5739 / 2),
				     (float) (anInt5739 / 2), (float) i_210_,
				     (float) i_210_, 50.0F, 50000.0F,
				     (float) class182.method3566
						 (-1341990885).method2710(),
				     (float) class182.method3566
						 (-987954054).method2711(),
				     1024.0F);
	    class182.method3252(class435_211_);
	    Class444 class444 = new Class444();
	    class182.method3233(class444);
	    Class444 class444_212_ = class182.method3225();
	    class444_212_.method7137(0.0F, 0.0F,
				     (float) (50 - class179.method2962()));
	    class179.method2953(class444_212_, null, 1);
	    aClass157_5748
		= class182.method3217(0, 0, anInt5739, anInt5739, true);
	    aClass157_5748.method2477(0, 0, 3);
	    class182.method3252(class435);
	    class182.method3184(anIntArray5754[0], anIntArray5754[1],
				anIntArray5754[2], anIntArray5754[3]);
	}
    }
    
    static void method8628() {
	aClass179_5752 = null;
	aClass157_5733 = null;
    }
    
    void method8629(Class182 class182, Class516 class516_213_) {
	ModelDecoder class186
	    = ModelDecoder.method3644(Class326.aClass458_3563, anInt5735, 0);
	if (class186 != null) {
	    class182.method3187(anIntArray5754);
	    class182.method3184(0, 0, anInt5739, anInt5739);
	    class182.method3188(2, 0);
	    class182.method3151(0, 0, anInt5739, anInt5739, 0, 0);
	    int i = 0;
	    int i_214_ = 0;
	    int i_215_ = 256;
	    if (class516_213_ != null) {
		if (class516_213_.aBool5734) {
		    i = -class516_213_.anInt5730;
		    i_214_ = -class516_213_.anInt5731;
		    i_215_ = -class516_213_.anInt5732;
		} else {
		    i = anInt5730 - class516_213_.anInt5730;
		    i_214_ = anInt5731 - class516_213_.anInt5731;
		    i_215_ = anInt5732 - class516_213_.anInt5732;
		}
	    }
	    if (anInt5736 != 0) {
		int i_216_ = -anInt5736 & 0x3fff;
		int i_217_ = Class436.anIntArray4831[i_216_];
		int i_218_ = Class436.anIntArray4838[i_216_];
		int i_219_ = i_214_ * i_218_ - i_215_ * i_217_ >> 14;
		i_215_ = i_214_ * i_217_ + i_215_ * i_218_ >> 14;
		i_214_ = i_219_;
	    }
	    if (anInt5751 != 0) {
		int i_220_ = -anInt5751 & 0x3fff;
		int i_221_ = Class436.anIntArray4831[i_220_];
		int i_222_ = Class436.anIntArray4838[i_220_];
		int i_223_ = i_215_ * i_221_ + i * i_222_ >> 14;
		i_215_ = i_215_ * i_222_ - i * i_221_ >> 14;
		i = i_223_;
	    }
	    class182.method3351(1.0F);
	    class182.method3307(anInt5746, 1.0F, 1.0F, (float) i,
				(float) i_214_, (float) i_215_);
	    class186.method3647(anInt5742 & 0x3fff, anInt5743 & 0x3fff,
				anInt5744 & 0x3fff);
	    Class179 class179
		= class182.method3556(class186, 2048, 0, 64, 768);
	    int i_224_ = class179.method2959() - class179.method3001();
	    int i_225_ = class179.method2961() - class179.method2960();
	    int i_226_ = i_224_ > i_225_ ? i_224_ : i_225_;
	    int i_227_ = 1024 * anInt5739 / i_226_;
	    Class435 class435 = class182.method3237();
	    Class435 class435_228_ = class182.method3224();
	    class435_228_.method6948((float) (anInt5739 / 2),
				     (float) (anInt5739 / 2), (float) i_227_,
				     (float) i_227_, 50.0F, 50000.0F,
				     (float) class182.method3566
						 (-1208863276).method2710(),
				     (float) class182.method3566
						 (-599870838).method2711(),
				     1024.0F);
	    class182.method3252(class435_228_);
	    Class444 class444 = new Class444();
	    class182.method3233(class444);
	    Class444 class444_229_ = class182.method3225();
	    class444_229_.method7137(0.0F, 0.0F,
				     (float) (50 - class179.method2962()));
	    class179.method2953(class444_229_, null, 1);
	    aClass157_5748
		= class182.method3217(0, 0, anInt5739, anInt5739, true);
	    aClass157_5748.method2477(0, 0, 3);
	    class182.method3252(class435);
	    class182.method3184(anIntArray5754[0], anIntArray5754[1],
				anIntArray5754[2], anIntArray5754[3]);
	}
    }
    
    void method8630(Class182 class182, Class516 class516_230_) {
	method8610(class182);
	method8611(class182);
	class182.method3187(anIntArray5754);
	class182.method3184(0, 0, anInt5739, anInt5739);
	class182.method3188(2, 0);
	class182.method3151(0, 0, anInt5739, anInt5739, ~0xffffff | anInt5746,
			    0);
	int i = 0;
	int i_231_ = 0;
	int i_232_ = 256;
	if (class516_230_ != null) {
	    if (class516_230_.aBool5734) {
		i = -class516_230_.anInt5730;
		i_231_ = -class516_230_.anInt5731;
		i_232_ = -class516_230_.anInt5732;
	    } else {
		i = class516_230_.anInt5730 - anInt5730;
		i_231_ = class516_230_.anInt5731 - anInt5731;
		i_232_ = class516_230_.anInt5732 - anInt5732;
	    }
	}
	if (anInt5736 != 0) {
	    int i_233_ = Class436.anIntArray4831[anInt5736];
	    int i_234_ = Class436.anIntArray4838[anInt5736];
	    int i_235_ = i_231_ * i_234_ - i_232_ * i_233_ >> 14;
	    i_232_ = i_231_ * i_233_ + i_232_ * i_234_ >> 14;
	    i_231_ = i_235_;
	}
	if (anInt5751 != 0) {
	    int i_236_ = Class436.anIntArray4831[anInt5751];
	    int i_237_ = Class436.anIntArray4838[anInt5751];
	    int i_238_ = i_232_ * i_236_ + i * i_237_ >> 14;
	    i_232_ = i_232_ * i_237_ - i * i_236_ >> 14;
	    i = i_238_;
	}
	Class179 class179 = aClass179_5752.method2926((byte) 0, 51200, true);
	class179.method2973((short) 0, (short) anInt5735);
	class182.method3351(1.0F);
	class182.method3307(16777215, 1.0F, 1.0F, (float) i, (float) i_231_,
			    (float) i_232_);
	int i_239_ = (1024 * anInt5739
		      / (class179.method2959() - class179.method3001()));
	if (anInt5746 != 0)
	    i_239_ = i_239_ * 13 / 16;
	Class435 class435 = class182.method3237();
	Class435 class435_240_ = class182.method3224();
	class435_240_.method6948
	    ((float) (anInt5739 / 2), (float) (anInt5739 / 2), (float) i_239_,
	     (float) i_239_, 50.0F, 50000.0F,
	     (float) class182.method3566(60490551).method2710(),
	     (float) class182.method3566(-950794371).method2711(), 1024.0F);
	class182.method3252(class435_240_);
	class182.method3233(new Class444());
	Class444 class444 = new Class444();
	class444.method7137(0.0F, 0.0F, (float) (50 - class179.method2962()));
	class179.method2953(class444, null, 1);
	int i_241_ = anInt5739 * 13 / 16;
	int i_242_ = (anInt5739 - i_241_) / 2;
	aClass157_5753.method2482(i_242_, i_242_, i_241_, i_241_, 0,
				  ~0xffffff | anInt5746, 1);
	aClass157_5748 = class182.method3217(0, 0, anInt5739, anInt5739, true);
	class182.method3188(2, 0);
	class182.method3151(0, 0, anInt5739, anInt5739, 0, 0);
	aClass157_5733.method2482(0, 0, anInt5739, anInt5739, 1, 0, 0);
	aClass157_5748.method2477(0, 0, 3);
	class182.method3252(class435);
	class182.method3184(anIntArray5754[0], anIntArray5754[1],
			    anIntArray5754[2], anIntArray5754[3]);
    }
    
    public Class516(int i, int i_243_, int i_244_, int i_245_, int i_246_,
		    int i_247_, int i_248_, boolean bool, int i_249_,
		    int i_250_, int i_251_) {
	anInt5730 = i_244_;
	anInt5731 = i_245_;
	anInt5732 = i_246_;
	aBool5734 = bool;
	anInt5735 = i_243_;
	anInt5746 = i_248_;
	anInt5729 = i_247_;
	anInt5728 = i;
	anInt5742 = i_249_;
	anInt5743 = i_250_;
	anInt5744 = i_251_;
    }
    
    static void method8631(Class182 class182) {
	if (aClass157_5733 == null) {
	    int[] is = new int[16384];
	    int[] is_252_ = new int[16384];
	    for (int i = 0; i < 64; i++) {
		int i_253_ = 64 - i;
		i_253_ *= i_253_;
		int i_254_ = 128 - i - 1;
		int i_255_ = i * 128;
		int i_256_ = i_254_ * 128;
		for (int i_257_ = 0; i_257_ < 64; i_257_++) {
		    int i_258_ = 64 - i_257_;
		    i_258_ *= i_258_;
		    int i_259_ = 128 - i_257_ - 1;
		    int i_260_ = 256 - (i_258_ + i_253_ << 8) / 4096;
		    i_260_ = i_260_ * 3072 / 1536;
		    if (i_260_ < 0)
			i_260_ = 0;
		    else if (i_260_ > 255)
			i_260_ = 255;
		    int i_261_ = i_260_ / 2;
		    is_252_[i_255_ + i_257_] = is_252_[i_255_ + i_259_]
			= is_252_[i_256_ + i_257_] = is_252_[i_256_ + i_259_]
			= ~0xffffff | i_260_ << 16;
		    is[i_255_ + i_257_] = is[i_255_ + i_259_]
			= is[i_256_ + i_257_] = is[i_256_ + i_259_]
			= 127 - i_261_ << 24 | 0xffffff;
		}
	    }
	    aClass157_5733
		= class182.method3215(is_252_, 0, 128, 128, 128, (byte) 119);
	    aClass157_5753
		= class182.method3215(is, 0, 128, 128, 128, (byte) 16);
	}
    }
}
