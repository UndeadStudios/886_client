/* Class352 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.nio.ByteBuffer;

public class Class352
{
    byte[] aByteArray3745;
    int anInt3746;
    int anInt3747;
    int anInt3748;
    int anInt3749;
    int anInt3750;
    Class182_Sub1 aClass182_Sub1_3751;
    Class161_Sub3 aClass161_Sub3_3752;
    Class344[][] aClass344ArrayArray3753;
    
    boolean method6173(Class525_Sub16_Sub17 class525_sub16_sub17, int i,
		       int i_0_) {
	Class525_Sub16_Sub17_Sub2 class525_sub16_sub17_sub2
	    = (Class525_Sub16_Sub17_Sub2) class525_sub16_sub17;
	i += class525_sub16_sub17_sub2.anInt12203 + 1;
	i_0_ += class525_sub16_sub17_sub2.anInt12201 + 1;
	int i_1_ = i + i_0_ * anInt3747;
	int i_2_ = class525_sub16_sub17_sub2.anInt12200;
	int i_3_ = class525_sub16_sub17_sub2.anInt12204;
	int i_4_ = anInt3747 - i_3_;
	if (i_0_ <= 0) {
	    int i_5_ = 1 - i_0_;
	    i_2_ -= i_5_;
	    i_1_ += i_5_ * anInt3747;
	    i_0_ = 1;
	}
	if (i_0_ + i_2_ >= anInt3748) {
	    int i_6_ = i_0_ + i_2_ + 1 - anInt3748;
	    i_2_ -= i_6_;
	}
	if (i <= 0) {
	    int i_7_ = 1 - i;
	    i_3_ -= i_7_;
	    i_1_ += i_7_;
	    i_4_ += i_7_;
	    i = 1;
	}
	if (i + i_3_ >= anInt3747) {
	    int i_8_ = i + i_3_ + 1 - anInt3747;
	    i_3_ -= i_8_;
	    i_4_ += i_8_;
	}
	if (i_3_ <= 0 || i_2_ <= 0)
	    return false;
	int i_9_ = 8;
	i_4_ += (i_9_ - 1) * anInt3747;
	return method6194(aByteArray3745, i_1_, i_3_, i_2_, i_4_, i_9_);
    }
    
    void method6174() {
	aClass344ArrayArray3753 = new Class344[anInt3750][anInt3749];
	for (int i = 0; i < anInt3749; i++) {
	    for (int i_10_ = 0; i_10_ < anInt3750; i_10_++) {
		aClass344ArrayArray3753[i_10_][i]
		    = new Class344(aClass182_Sub1_3751, this,
				   aClass161_Sub3_3752, i_10_, i, anInt3746,
				   i_10_ * 128 + 1, i * 128 + 1);
		if (aClass344ArrayArray3753[i_10_][i].anInt3705 == 0)
		    aClass344ArrayArray3753[i_10_][i] = null;
	    }
	}
    }
    
    void method6175(Class319 class319, int i, int i_11_, int i_12_,
		    boolean[][] bools, boolean bool) {
	aClass182_Sub1_3751.method3235(false);
	float f = 1.0F / (float) (aClass182_Sub1_3751.anInt9242 * 128);
	if (bool) {
	    for (int i_13_ = 0; i_13_ < anInt3749; i_13_++) {
		int i_14_ = i_13_ << anInt3746;
		int i_15_ = i_13_ + 1 << anInt3746;
		for (int i_16_ = 0; i_16_ < anInt3750; i_16_++) {
		    if (aClass344ArrayArray3753[i_16_][i_13_] != null) {
			int i_17_ = i_16_ << anInt3746;
			int i_18_ = i_16_ + 1 << anInt3746;
		    while_22_:
			for (int i_19_ = i_17_; i_19_ < i_18_; i_19_++) {
			    if (i_19_ - i >= -i_12_ && i_19_ - i <= i_12_) {
				for (int i_20_ = i_14_; i_20_ < i_15_;
				     i_20_++) {
				    if (i_20_ - i_11_ >= -i_12_
					&& i_20_ - i_11_ <= i_12_
					&& (bools[i_19_ - i + i_12_]
					    [i_20_ - i_11_ + i_12_])) {
					class319.aClass435_3529
					    .method6954(f, f, 1.0F, 1.0F);
					class319.aClass435_3529
					    .aFloatArray4830[12]
					    = (float) -i_16_;
					class319.aClass435_3529
					    .aFloatArray4830[13]
					    = (float) -i_13_;
					aClass344ArrayArray3753[i_16_]
					    [i_13_].method6038(class319);
					break while_22_;
				    }
				}
			    }
			}
		    }
		}
	    }
	} else {
	    int[] is = new int[anInt3749 * anInt3750];
	    ByteBuffer bytebuffer = aClass182_Sub1_3751.aByteBuffer9271;
	    bytebuffer.clear();
	    int i_21_ = 0;
	    for (int i_22_ = 0; i_22_ < anInt3749; i_22_++) {
		int i_23_ = i_22_ << anInt3746;
		int i_24_ = i_22_ + 1 << anInt3746;
		for (int i_25_ = 0; i_25_ < anInt3750; i_25_++) {
		    Class344 class344 = aClass344ArrayArray3753[i_25_][i_22_];
		    int i_26_ = 0;
		    if (class344 != null) {
			int i_27_ = i_25_ << anInt3746;
			int i_28_ = i_25_ + 1 << anInt3746;
			for (int i_29_ = i_23_; i_29_ < i_24_; i_29_++) {
			    if (i_29_ - i_11_ >= -i_12_
				&& i_29_ - i_11_ <= i_12_) {
				int i_30_
				    = (i_29_ * (aClass161_Sub3_3752.anInt1759
						* 363736815)
				       + i_27_);
				for (int i_31_ = i_27_; i_31_ < i_28_;
				     i_31_++) {
				    if (i_31_ - i >= -i_12_
					&& i_31_ - i <= i_12_
					&& (bools[i_31_ - i + i_12_]
					    [i_29_ - i_11_ + i_12_])) {
					short[] is_32_
					    = (aClass161_Sub3_3752
					       .aShortArrayArray9851[i_30_]);
					if (is_32_ != null) {
					    for (int i_33_ = 0;
						 i_33_ < is_32_.length;
						 i_33_++) {
						bytebuffer
						    .putShort(is_32_[i_33_]);
						i_26_++;
					    }
					}
				    }
				    i_30_++;
				}
			    }
			}
		    }
		    is[i_21_] = i_26_;
		    i_21_++;
		}
	    }
	    if (bytebuffer.position() != 0) {
		int i_34_ = bytebuffer.position();
		Interface44 interface44
		    = aClass182_Sub1_3751.method14682(i_34_ / 2);
		interface44.method215(0, i_34_, aClass182_Sub1_3751.aLong9160);
		int i_35_ = 0;
		i_21_ = 0;
		for (int i_36_ = 0; i_36_ < anInt3749; i_36_++) {
		    for (int i_37_ = 0; i_37_ < anInt3750; i_37_++) {
			if (is[i_21_] != 0) {
			    class319.aClass435_3529.method6954(f, f, 1.0F,
							       1.0F);
			    class319.aClass435_3529.aFloatArray4830[12]
				= (float) -i_37_;
			    class319.aClass435_3529.aFloatArray4830[13]
				= (float) -i_36_;
			    aClass344ArrayArray3753[i_37_][i_36_].method6037
				(class319, interface44, i_35_, is[i_21_] / 3);
			    i_35_ += is[i_21_];
			}
			i_21_++;
		    }
		}
	    }
	}
	aClass182_Sub1_3751.method3235(true);
    }
    
    void method6176(Class525_Sub16_Sub17 class525_sub16_sub17, int i,
		    int i_38_) {
	Class525_Sub16_Sub17_Sub2 class525_sub16_sub17_sub2
	    = (Class525_Sub16_Sub17_Sub2) class525_sub16_sub17;
	i += class525_sub16_sub17_sub2.anInt12203 + 1;
	i_38_ += class525_sub16_sub17_sub2.anInt12201 + 1;
	int i_39_ = i + i_38_ * anInt3747;
	int i_40_ = 0;
	int i_41_ = class525_sub16_sub17_sub2.anInt12200;
	int i_42_ = class525_sub16_sub17_sub2.anInt12204;
	int i_43_ = anInt3747 - i_42_;
	int i_44_ = 0;
	if (i_38_ <= 0) {
	    int i_45_ = 1 - i_38_;
	    i_41_ -= i_45_;
	    i_40_ += i_45_ * i_42_;
	    i_39_ += i_45_ * anInt3747;
	    i_38_ = 1;
	}
	if (i_38_ + i_41_ >= anInt3748) {
	    int i_46_ = i_38_ + i_41_ + 1 - anInt3748;
	    i_41_ -= i_46_;
	}
	if (i <= 0) {
	    int i_47_ = 1 - i;
	    i_42_ -= i_47_;
	    i_40_ += i_47_;
	    i_39_ += i_47_;
	    i_44_ += i_47_;
	    i_43_ += i_47_;
	    i = 1;
	}
	if (i + i_42_ >= anInt3747) {
	    int i_48_ = i + i_42_ + 1 - anInt3747;
	    i_42_ -= i_48_;
	    i_44_ += i_48_;
	    i_43_ += i_48_;
	}
	if (i_42_ > 0 && i_41_ > 0) {
	    method6180(aByteArray3745,
		       class525_sub16_sub17_sub2.aByteArray12205, i_40_, i_39_,
		       i_42_, i_41_, i_43_, i_44_);
	    method6186(i, i_38_, i_42_, i_41_);
	}
    }
    
    void method6177(Class525_Sub16_Sub17 class525_sub16_sub17, int i,
		    int i_49_) {
	Class525_Sub16_Sub17_Sub2 class525_sub16_sub17_sub2
	    = (Class525_Sub16_Sub17_Sub2) class525_sub16_sub17;
	i += class525_sub16_sub17_sub2.anInt12203 + 1;
	i_49_ += class525_sub16_sub17_sub2.anInt12201 + 1;
	int i_50_ = i + i_49_ * anInt3747;
	int i_51_ = 0;
	int i_52_ = class525_sub16_sub17_sub2.anInt12200;
	int i_53_ = class525_sub16_sub17_sub2.anInt12204;
	int i_54_ = anInt3747 - i_53_;
	int i_55_ = 0;
	if (i_49_ <= 0) {
	    int i_56_ = 1 - i_49_;
	    i_52_ -= i_56_;
	    i_51_ += i_56_ * i_53_;
	    i_50_ += i_56_ * anInt3747;
	    i_49_ = 1;
	}
	if (i_49_ + i_52_ >= anInt3748) {
	    int i_57_ = i_49_ + i_52_ + 1 - anInt3748;
	    i_52_ -= i_57_;
	}
	if (i <= 0) {
	    int i_58_ = 1 - i;
	    i_53_ -= i_58_;
	    i_51_ += i_58_;
	    i_50_ += i_58_;
	    i_55_ += i_58_;
	    i_54_ += i_58_;
	    i = 1;
	}
	if (i + i_53_ >= anInt3747) {
	    int i_59_ = i + i_53_ + 1 - anInt3747;
	    i_53_ -= i_59_;
	    i_55_ += i_59_;
	    i_54_ += i_59_;
	}
	if (i_53_ > 0 && i_52_ > 0) {
	    method6181(aByteArray3745,
		       class525_sub16_sub17_sub2.aByteArray12205, i_51_, i_50_,
		       i_53_, i_52_, i_54_, i_55_);
	    method6186(i, i_49_, i_53_, i_52_);
	}
    }
    
    boolean method6178(Class525_Sub16_Sub17 class525_sub16_sub17, int i,
		       int i_60_) {
	Class525_Sub16_Sub17_Sub2 class525_sub16_sub17_sub2
	    = (Class525_Sub16_Sub17_Sub2) class525_sub16_sub17;
	i += class525_sub16_sub17_sub2.anInt12203 + 1;
	i_60_ += class525_sub16_sub17_sub2.anInt12201 + 1;
	int i_61_ = i + i_60_ * anInt3747;
	int i_62_ = class525_sub16_sub17_sub2.anInt12200;
	int i_63_ = class525_sub16_sub17_sub2.anInt12204;
	int i_64_ = anInt3747 - i_63_;
	if (i_60_ <= 0) {
	    int i_65_ = 1 - i_60_;
	    i_62_ -= i_65_;
	    i_61_ += i_65_ * anInt3747;
	    i_60_ = 1;
	}
	if (i_60_ + i_62_ >= anInt3748) {
	    int i_66_ = i_60_ + i_62_ + 1 - anInt3748;
	    i_62_ -= i_66_;
	}
	if (i <= 0) {
	    int i_67_ = 1 - i;
	    i_63_ -= i_67_;
	    i_61_ += i_67_;
	    i_64_ += i_67_;
	    i = 1;
	}
	if (i + i_63_ >= anInt3747) {
	    int i_68_ = i + i_63_ + 1 - anInt3747;
	    i_63_ -= i_68_;
	    i_64_ += i_68_;
	}
	if (i_63_ <= 0 || i_62_ <= 0)
	    return false;
	int i_69_ = 8;
	i_64_ += (i_69_ - 1) * anInt3747;
	return method6194(aByteArray3745, i_61_, i_63_, i_62_, i_64_, i_69_);
    }
    
    void method6179(int i, int i_70_, int i_71_, int i_72_) {
	if (aClass344ArrayArray3753 != null) {
	    int i_73_ = i - 1 >> 7;
	    int i_74_ = i - 1 + i_71_ - 1 >> 7;
	    int i_75_ = i_70_ - 1 >> 7;
	    int i_76_ = i_70_ - 1 + i_72_ - 1 >> 7;
	    for (int i_77_ = i_73_; i_77_ <= i_74_; i_77_++) {
		Class344[] class344s = aClass344ArrayArray3753[i_77_];
		for (int i_78_ = i_75_; i_78_ <= i_76_; i_78_++) {
		    if (class344s[i_78_] != null)
			class344s[i_78_].aBool3702 = true;
		}
	    }
	}
    }
    
    static final void method6180(byte[] is, byte[] is_79_, int i, int i_80_,
				 int i_81_, int i_82_, int i_83_, int i_84_) {
	int i_85_ = -(i_81_ >> 2);
	i_81_ = -(i_81_ & 0x3);
	for (int i_86_ = -i_82_; i_86_ < 0; i_86_++) {
	    for (int i_87_ = i_85_; i_87_ < 0; i_87_++) {
		is[i_80_++] += is_79_[i++];
		is[i_80_++] += is_79_[i++];
		is[i_80_++] += is_79_[i++];
		is[i_80_++] += is_79_[i++];
	    }
	    for (int i_88_ = i_81_; i_88_ < 0; i_88_++)
		is[i_80_++] += is_79_[i++];
	    i_80_ += i_83_;
	    i += i_84_;
	}
    }
    
    static final void method6181(byte[] is, byte[] is_89_, int i, int i_90_,
				 int i_91_, int i_92_, int i_93_, int i_94_) {
	int i_95_ = -(i_91_ >> 2);
	i_91_ = -(i_91_ & 0x3);
	for (int i_96_ = -i_92_; i_96_ < 0; i_96_++) {
	    for (int i_97_ = i_95_; i_97_ < 0; i_97_++) {
		is[i_90_++] -= is_89_[i++];
		is[i_90_++] -= is_89_[i++];
		is[i_90_++] -= is_89_[i++];
		is[i_90_++] -= is_89_[i++];
	    }
	    for (int i_98_ = i_91_; i_98_ < 0; i_98_++)
		is[i_90_++] -= is_89_[i++];
	    i_90_ += i_93_;
	    i += i_94_;
	}
    }
    
    void method6182(Class525_Sub16_Sub17 class525_sub16_sub17, int i,
		    int i_99_) {
	Class525_Sub16_Sub17_Sub2 class525_sub16_sub17_sub2
	    = (Class525_Sub16_Sub17_Sub2) class525_sub16_sub17;
	i += class525_sub16_sub17_sub2.anInt12203 + 1;
	i_99_ += class525_sub16_sub17_sub2.anInt12201 + 1;
	int i_100_ = i + i_99_ * anInt3747;
	int i_101_ = 0;
	int i_102_ = class525_sub16_sub17_sub2.anInt12200;
	int i_103_ = class525_sub16_sub17_sub2.anInt12204;
	int i_104_ = anInt3747 - i_103_;
	int i_105_ = 0;
	if (i_99_ <= 0) {
	    int i_106_ = 1 - i_99_;
	    i_102_ -= i_106_;
	    i_101_ += i_106_ * i_103_;
	    i_100_ += i_106_ * anInt3747;
	    i_99_ = 1;
	}
	if (i_99_ + i_102_ >= anInt3748) {
	    int i_107_ = i_99_ + i_102_ + 1 - anInt3748;
	    i_102_ -= i_107_;
	}
	if (i <= 0) {
	    int i_108_ = 1 - i;
	    i_103_ -= i_108_;
	    i_101_ += i_108_;
	    i_100_ += i_108_;
	    i_105_ += i_108_;
	    i_104_ += i_108_;
	    i = 1;
	}
	if (i + i_103_ >= anInt3747) {
	    int i_109_ = i + i_103_ + 1 - anInt3747;
	    i_103_ -= i_109_;
	    i_105_ += i_109_;
	    i_104_ += i_109_;
	}
	if (i_103_ > 0 && i_102_ > 0) {
	    method6180(aByteArray3745,
		       class525_sub16_sub17_sub2.aByteArray12205, i_101_,
		       i_100_, i_103_, i_102_, i_104_, i_105_);
	    method6186(i, i_99_, i_103_, i_102_);
	}
    }
    
    static final boolean method6183(byte[] is, int i, int i_110_, int i_111_,
				    int i_112_, int i_113_) {
	int i_114_ = i_110_ % i_113_;
	int i_115_;
	if (i_114_ != 0)
	    i_115_ = i_113_ - i_114_;
	else
	    i_115_ = 0;
	int i_116_ = -((i_111_ + i_113_ - 1) / i_113_);
	int i_117_ = -((i_110_ + i_113_ - 1) / i_113_);
	for (int i_118_ = i_116_; i_118_ < 0; i_118_++) {
	    for (int i_119_ = i_117_; i_119_ < 0; i_119_++) {
		if (is[i] == 0)
		    return true;
		i += i_113_;
	    }
	    i -= i_115_;
	    if (is[i - 1] == 0)
		return true;
	    i += i_112_;
	}
	return false;
    }
    
    void method6184(Class525_Sub16_Sub17 class525_sub16_sub17, int i,
		    int i_120_) {
	Class525_Sub16_Sub17_Sub2 class525_sub16_sub17_sub2
	    = (Class525_Sub16_Sub17_Sub2) class525_sub16_sub17;
	i += class525_sub16_sub17_sub2.anInt12203 + 1;
	i_120_ += class525_sub16_sub17_sub2.anInt12201 + 1;
	int i_121_ = i + i_120_ * anInt3747;
	int i_122_ = 0;
	int i_123_ = class525_sub16_sub17_sub2.anInt12200;
	int i_124_ = class525_sub16_sub17_sub2.anInt12204;
	int i_125_ = anInt3747 - i_124_;
	int i_126_ = 0;
	if (i_120_ <= 0) {
	    int i_127_ = 1 - i_120_;
	    i_123_ -= i_127_;
	    i_122_ += i_127_ * i_124_;
	    i_121_ += i_127_ * anInt3747;
	    i_120_ = 1;
	}
	if (i_120_ + i_123_ >= anInt3748) {
	    int i_128_ = i_120_ + i_123_ + 1 - anInt3748;
	    i_123_ -= i_128_;
	}
	if (i <= 0) {
	    int i_129_ = 1 - i;
	    i_124_ -= i_129_;
	    i_122_ += i_129_;
	    i_121_ += i_129_;
	    i_126_ += i_129_;
	    i_125_ += i_129_;
	    i = 1;
	}
	if (i + i_124_ >= anInt3747) {
	    int i_130_ = i + i_124_ + 1 - anInt3747;
	    i_124_ -= i_130_;
	    i_126_ += i_130_;
	    i_125_ += i_130_;
	}
	if (i_124_ > 0 && i_123_ > 0) {
	    method6180(aByteArray3745,
		       class525_sub16_sub17_sub2.aByteArray12205, i_122_,
		       i_121_, i_124_, i_123_, i_125_, i_126_);
	    method6186(i, i_120_, i_124_, i_123_);
	}
    }
    
    void method6185(Class525_Sub16_Sub17 class525_sub16_sub17, int i,
		    int i_131_) {
	Class525_Sub16_Sub17_Sub2 class525_sub16_sub17_sub2
	    = (Class525_Sub16_Sub17_Sub2) class525_sub16_sub17;
	i += class525_sub16_sub17_sub2.anInt12203 + 1;
	i_131_ += class525_sub16_sub17_sub2.anInt12201 + 1;
	int i_132_ = i + i_131_ * anInt3747;
	int i_133_ = 0;
	int i_134_ = class525_sub16_sub17_sub2.anInt12200;
	int i_135_ = class525_sub16_sub17_sub2.anInt12204;
	int i_136_ = anInt3747 - i_135_;
	int i_137_ = 0;
	if (i_131_ <= 0) {
	    int i_138_ = 1 - i_131_;
	    i_134_ -= i_138_;
	    i_133_ += i_138_ * i_135_;
	    i_132_ += i_138_ * anInt3747;
	    i_131_ = 1;
	}
	if (i_131_ + i_134_ >= anInt3748) {
	    int i_139_ = i_131_ + i_134_ + 1 - anInt3748;
	    i_134_ -= i_139_;
	}
	if (i <= 0) {
	    int i_140_ = 1 - i;
	    i_135_ -= i_140_;
	    i_133_ += i_140_;
	    i_132_ += i_140_;
	    i_137_ += i_140_;
	    i_136_ += i_140_;
	    i = 1;
	}
	if (i + i_135_ >= anInt3747) {
	    int i_141_ = i + i_135_ + 1 - anInt3747;
	    i_135_ -= i_141_;
	    i_137_ += i_141_;
	    i_136_ += i_141_;
	}
	if (i_135_ > 0 && i_134_ > 0) {
	    method6180(aByteArray3745,
		       class525_sub16_sub17_sub2.aByteArray12205, i_133_,
		       i_132_, i_135_, i_134_, i_136_, i_137_);
	    method6186(i, i_131_, i_135_, i_134_);
	}
    }
    
    void method6186(int i, int i_142_, int i_143_, int i_144_) {
	if (aClass344ArrayArray3753 != null) {
	    int i_145_ = i - 1 >> 7;
	    int i_146_ = i - 1 + i_143_ - 1 >> 7;
	    int i_147_ = i_142_ - 1 >> 7;
	    int i_148_ = i_142_ - 1 + i_144_ - 1 >> 7;
	    for (int i_149_ = i_145_; i_149_ <= i_146_; i_149_++) {
		Class344[] class344s = aClass344ArrayArray3753[i_149_];
		for (int i_150_ = i_147_; i_150_ <= i_148_; i_150_++) {
		    if (class344s[i_150_] != null)
			class344s[i_150_].aBool3702 = true;
		}
	    }
	}
    }
    
    void method6187(Class525_Sub16_Sub17 class525_sub16_sub17, int i,
		    int i_151_) {
	Class525_Sub16_Sub17_Sub2 class525_sub16_sub17_sub2
	    = (Class525_Sub16_Sub17_Sub2) class525_sub16_sub17;
	i += class525_sub16_sub17_sub2.anInt12203 + 1;
	i_151_ += class525_sub16_sub17_sub2.anInt12201 + 1;
	int i_152_ = i + i_151_ * anInt3747;
	int i_153_ = 0;
	int i_154_ = class525_sub16_sub17_sub2.anInt12200;
	int i_155_ = class525_sub16_sub17_sub2.anInt12204;
	int i_156_ = anInt3747 - i_155_;
	int i_157_ = 0;
	if (i_151_ <= 0) {
	    int i_158_ = 1 - i_151_;
	    i_154_ -= i_158_;
	    i_153_ += i_158_ * i_155_;
	    i_152_ += i_158_ * anInt3747;
	    i_151_ = 1;
	}
	if (i_151_ + i_154_ >= anInt3748) {
	    int i_159_ = i_151_ + i_154_ + 1 - anInt3748;
	    i_154_ -= i_159_;
	}
	if (i <= 0) {
	    int i_160_ = 1 - i;
	    i_155_ -= i_160_;
	    i_153_ += i_160_;
	    i_152_ += i_160_;
	    i_157_ += i_160_;
	    i_156_ += i_160_;
	    i = 1;
	}
	if (i + i_155_ >= anInt3747) {
	    int i_161_ = i + i_155_ + 1 - anInt3747;
	    i_155_ -= i_161_;
	    i_157_ += i_161_;
	    i_156_ += i_161_;
	}
	if (i_155_ > 0 && i_154_ > 0) {
	    method6180(aByteArray3745,
		       class525_sub16_sub17_sub2.aByteArray12205, i_153_,
		       i_152_, i_155_, i_154_, i_156_, i_157_);
	    method6186(i, i_151_, i_155_, i_154_);
	}
    }
    
    void method6188() {
	aClass344ArrayArray3753 = new Class344[anInt3750][anInt3749];
	for (int i = 0; i < anInt3749; i++) {
	    for (int i_162_ = 0; i_162_ < anInt3750; i_162_++) {
		aClass344ArrayArray3753[i_162_][i]
		    = new Class344(aClass182_Sub1_3751, this,
				   aClass161_Sub3_3752, i_162_, i, anInt3746,
				   i_162_ * 128 + 1, i * 128 + 1);
		if (aClass344ArrayArray3753[i_162_][i].anInt3705 == 0)
		    aClass344ArrayArray3753[i_162_][i] = null;
	    }
	}
    }
    
    void method6189(Class525_Sub16_Sub17 class525_sub16_sub17, int i,
		    int i_163_) {
	Class525_Sub16_Sub17_Sub2 class525_sub16_sub17_sub2
	    = (Class525_Sub16_Sub17_Sub2) class525_sub16_sub17;
	i += class525_sub16_sub17_sub2.anInt12203 + 1;
	i_163_ += class525_sub16_sub17_sub2.anInt12201 + 1;
	int i_164_ = i + i_163_ * anInt3747;
	int i_165_ = 0;
	int i_166_ = class525_sub16_sub17_sub2.anInt12200;
	int i_167_ = class525_sub16_sub17_sub2.anInt12204;
	int i_168_ = anInt3747 - i_167_;
	int i_169_ = 0;
	if (i_163_ <= 0) {
	    int i_170_ = 1 - i_163_;
	    i_166_ -= i_170_;
	    i_165_ += i_170_ * i_167_;
	    i_164_ += i_170_ * anInt3747;
	    i_163_ = 1;
	}
	if (i_163_ + i_166_ >= anInt3748) {
	    int i_171_ = i_163_ + i_166_ + 1 - anInt3748;
	    i_166_ -= i_171_;
	}
	if (i <= 0) {
	    int i_172_ = 1 - i;
	    i_167_ -= i_172_;
	    i_165_ += i_172_;
	    i_164_ += i_172_;
	    i_169_ += i_172_;
	    i_168_ += i_172_;
	    i = 1;
	}
	if (i + i_167_ >= anInt3747) {
	    int i_173_ = i + i_167_ + 1 - anInt3747;
	    i_167_ -= i_173_;
	    i_169_ += i_173_;
	    i_168_ += i_173_;
	}
	if (i_167_ > 0 && i_166_ > 0) {
	    method6181(aByteArray3745,
		       class525_sub16_sub17_sub2.aByteArray12205, i_165_,
		       i_164_, i_167_, i_166_, i_168_, i_169_);
	    method6186(i, i_163_, i_167_, i_166_);
	}
    }
    
    void method6190(Class525_Sub16_Sub17 class525_sub16_sub17, int i,
		    int i_174_) {
	Class525_Sub16_Sub17_Sub2 class525_sub16_sub17_sub2
	    = (Class525_Sub16_Sub17_Sub2) class525_sub16_sub17;
	i += class525_sub16_sub17_sub2.anInt12203 + 1;
	i_174_ += class525_sub16_sub17_sub2.anInt12201 + 1;
	int i_175_ = i + i_174_ * anInt3747;
	int i_176_ = 0;
	int i_177_ = class525_sub16_sub17_sub2.anInt12200;
	int i_178_ = class525_sub16_sub17_sub2.anInt12204;
	int i_179_ = anInt3747 - i_178_;
	int i_180_ = 0;
	if (i_174_ <= 0) {
	    int i_181_ = 1 - i_174_;
	    i_177_ -= i_181_;
	    i_176_ += i_181_ * i_178_;
	    i_175_ += i_181_ * anInt3747;
	    i_174_ = 1;
	}
	if (i_174_ + i_177_ >= anInt3748) {
	    int i_182_ = i_174_ + i_177_ + 1 - anInt3748;
	    i_177_ -= i_182_;
	}
	if (i <= 0) {
	    int i_183_ = 1 - i;
	    i_178_ -= i_183_;
	    i_176_ += i_183_;
	    i_175_ += i_183_;
	    i_180_ += i_183_;
	    i_179_ += i_183_;
	    i = 1;
	}
	if (i + i_178_ >= anInt3747) {
	    int i_184_ = i + i_178_ + 1 - anInt3747;
	    i_178_ -= i_184_;
	    i_180_ += i_184_;
	    i_179_ += i_184_;
	}
	if (i_178_ > 0 && i_177_ > 0) {
	    method6181(aByteArray3745,
		       class525_sub16_sub17_sub2.aByteArray12205, i_176_,
		       i_175_, i_178_, i_177_, i_179_, i_180_);
	    method6186(i, i_174_, i_178_, i_177_);
	}
    }
    
    void method6191(Class525_Sub16_Sub17 class525_sub16_sub17, int i,
		    int i_185_) {
	Class525_Sub16_Sub17_Sub2 class525_sub16_sub17_sub2
	    = (Class525_Sub16_Sub17_Sub2) class525_sub16_sub17;
	i += class525_sub16_sub17_sub2.anInt12203 + 1;
	i_185_ += class525_sub16_sub17_sub2.anInt12201 + 1;
	int i_186_ = i + i_185_ * anInt3747;
	int i_187_ = 0;
	int i_188_ = class525_sub16_sub17_sub2.anInt12200;
	int i_189_ = class525_sub16_sub17_sub2.anInt12204;
	int i_190_ = anInt3747 - i_189_;
	int i_191_ = 0;
	if (i_185_ <= 0) {
	    int i_192_ = 1 - i_185_;
	    i_188_ -= i_192_;
	    i_187_ += i_192_ * i_189_;
	    i_186_ += i_192_ * anInt3747;
	    i_185_ = 1;
	}
	if (i_185_ + i_188_ >= anInt3748) {
	    int i_193_ = i_185_ + i_188_ + 1 - anInt3748;
	    i_188_ -= i_193_;
	}
	if (i <= 0) {
	    int i_194_ = 1 - i;
	    i_189_ -= i_194_;
	    i_187_ += i_194_;
	    i_186_ += i_194_;
	    i_191_ += i_194_;
	    i_190_ += i_194_;
	    i = 1;
	}
	if (i + i_189_ >= anInt3747) {
	    int i_195_ = i + i_189_ + 1 - anInt3747;
	    i_189_ -= i_195_;
	    i_191_ += i_195_;
	    i_190_ += i_195_;
	}
	if (i_189_ > 0 && i_188_ > 0) {
	    method6180(aByteArray3745,
		       class525_sub16_sub17_sub2.aByteArray12205, i_187_,
		       i_186_, i_189_, i_188_, i_190_, i_191_);
	    method6186(i, i_185_, i_189_, i_188_);
	}
    }
    
    void method6192(int i, int i_196_, int i_197_, int i_198_) {
	if (aClass344ArrayArray3753 != null) {
	    int i_199_ = i - 1 >> 7;
	    int i_200_ = i - 1 + i_197_ - 1 >> 7;
	    int i_201_ = i_196_ - 1 >> 7;
	    int i_202_ = i_196_ - 1 + i_198_ - 1 >> 7;
	    for (int i_203_ = i_199_; i_203_ <= i_200_; i_203_++) {
		Class344[] class344s = aClass344ArrayArray3753[i_203_];
		for (int i_204_ = i_201_; i_204_ <= i_202_; i_204_++) {
		    if (class344s[i_204_] != null)
			class344s[i_204_].aBool3702 = true;
		}
	    }
	}
    }
    
    Class352(Class182_Sub1 class182_sub1, Class161_Sub3 class161_sub3) {
	aClass182_Sub1_3751 = class182_sub1;
	aClass161_Sub3_3752 = class161_sub3;
	anInt3747 = 2 + ((aClass161_Sub3_3752.anInt1759 * 363736815
			  * (aClass161_Sub3_3752.anInt1761 * 435863595))
			 >> aClass182_Sub1_3751.anInt9243);
	anInt3748 = 2 + ((aClass161_Sub3_3752.anInt1760 * -1152334393
			  * (aClass161_Sub3_3752.anInt1761 * 435863595))
			 >> aClass182_Sub1_3751.anInt9243);
	aByteArray3745 = new byte[anInt3747 * anInt3748];
	anInt3746 = (7 + aClass182_Sub1_3751.anInt9243
		     - aClass161_Sub3_3752.anInt1763 * -2063427645);
	anInt3750 = aClass161_Sub3_3752.anInt1759 * 363736815 >> anInt3746;
	anInt3749 = aClass161_Sub3_3752.anInt1760 * -1152334393 >> anInt3746;
    }
    
    void method6193(Class525_Sub16_Sub17 class525_sub16_sub17, int i,
		    int i_205_) {
	Class525_Sub16_Sub17_Sub2 class525_sub16_sub17_sub2
	    = (Class525_Sub16_Sub17_Sub2) class525_sub16_sub17;
	i += class525_sub16_sub17_sub2.anInt12203 + 1;
	i_205_ += class525_sub16_sub17_sub2.anInt12201 + 1;
	int i_206_ = i + i_205_ * anInt3747;
	int i_207_ = 0;
	int i_208_ = class525_sub16_sub17_sub2.anInt12200;
	int i_209_ = class525_sub16_sub17_sub2.anInt12204;
	int i_210_ = anInt3747 - i_209_;
	int i_211_ = 0;
	if (i_205_ <= 0) {
	    int i_212_ = 1 - i_205_;
	    i_208_ -= i_212_;
	    i_207_ += i_212_ * i_209_;
	    i_206_ += i_212_ * anInt3747;
	    i_205_ = 1;
	}
	if (i_205_ + i_208_ >= anInt3748) {
	    int i_213_ = i_205_ + i_208_ + 1 - anInt3748;
	    i_208_ -= i_213_;
	}
	if (i <= 0) {
	    int i_214_ = 1 - i;
	    i_209_ -= i_214_;
	    i_207_ += i_214_;
	    i_206_ += i_214_;
	    i_211_ += i_214_;
	    i_210_ += i_214_;
	    i = 1;
	}
	if (i + i_209_ >= anInt3747) {
	    int i_215_ = i + i_209_ + 1 - anInt3747;
	    i_209_ -= i_215_;
	    i_211_ += i_215_;
	    i_210_ += i_215_;
	}
	if (i_209_ > 0 && i_208_ > 0) {
	    method6181(aByteArray3745,
		       class525_sub16_sub17_sub2.aByteArray12205, i_207_,
		       i_206_, i_209_, i_208_, i_210_, i_211_);
	    method6186(i, i_205_, i_209_, i_208_);
	}
    }
    
    static final boolean method6194(byte[] is, int i, int i_216_, int i_217_,
				    int i_218_, int i_219_) {
	int i_220_ = i_216_ % i_219_;
	int i_221_;
	if (i_220_ != 0)
	    i_221_ = i_219_ - i_220_;
	else
	    i_221_ = 0;
	int i_222_ = -((i_217_ + i_219_ - 1) / i_219_);
	int i_223_ = -((i_216_ + i_219_ - 1) / i_219_);
	for (int i_224_ = i_222_; i_224_ < 0; i_224_++) {
	    for (int i_225_ = i_223_; i_225_ < 0; i_225_++) {
		if (is[i] == 0)
		    return true;
		i += i_219_;
	    }
	    i -= i_221_;
	    if (is[i - 1] == 0)
		return true;
	    i += i_218_;
	}
	return false;
    }
    
    void method6195(int i, int i_226_, int i_227_, int i_228_) {
	if (aClass344ArrayArray3753 != null) {
	    int i_229_ = i - 1 >> 7;
	    int i_230_ = i - 1 + i_227_ - 1 >> 7;
	    int i_231_ = i_226_ - 1 >> 7;
	    int i_232_ = i_226_ - 1 + i_228_ - 1 >> 7;
	    for (int i_233_ = i_229_; i_233_ <= i_230_; i_233_++) {
		Class344[] class344s = aClass344ArrayArray3753[i_233_];
		for (int i_234_ = i_231_; i_234_ <= i_232_; i_234_++) {
		    if (class344s[i_234_] != null)
			class344s[i_234_].aBool3702 = true;
		}
	    }
	}
    }
    
    static final void method6196(byte[] is, byte[] is_235_, int i, int i_236_,
				 int i_237_, int i_238_, int i_239_,
				 int i_240_) {
	int i_241_ = -(i_237_ >> 2);
	i_237_ = -(i_237_ & 0x3);
	for (int i_242_ = -i_238_; i_242_ < 0; i_242_++) {
	    for (int i_243_ = i_241_; i_243_ < 0; i_243_++) {
		is[i_236_++] += is_235_[i++];
		is[i_236_++] += is_235_[i++];
		is[i_236_++] += is_235_[i++];
		is[i_236_++] += is_235_[i++];
	    }
	    for (int i_244_ = i_237_; i_244_ < 0; i_244_++)
		is[i_236_++] += is_235_[i++];
	    i_236_ += i_239_;
	    i += i_240_;
	}
    }
    
    static final void method6197(byte[] is, byte[] is_245_, int i, int i_246_,
				 int i_247_, int i_248_, int i_249_,
				 int i_250_) {
	int i_251_ = -(i_247_ >> 2);
	i_247_ = -(i_247_ & 0x3);
	for (int i_252_ = -i_248_; i_252_ < 0; i_252_++) {
	    for (int i_253_ = i_251_; i_253_ < 0; i_253_++) {
		is[i_246_++] -= is_245_[i++];
		is[i_246_++] -= is_245_[i++];
		is[i_246_++] -= is_245_[i++];
		is[i_246_++] -= is_245_[i++];
	    }
	    for (int i_254_ = i_247_; i_254_ < 0; i_254_++)
		is[i_246_++] -= is_245_[i++];
	    i_246_ += i_249_;
	    i += i_250_;
	}
    }
    
    static final boolean method6198(byte[] is, int i, int i_255_, int i_256_,
				    int i_257_, int i_258_) {
	int i_259_ = i_255_ % i_258_;
	int i_260_;
	if (i_259_ != 0)
	    i_260_ = i_258_ - i_259_;
	else
	    i_260_ = 0;
	int i_261_ = -((i_256_ + i_258_ - 1) / i_258_);
	int i_262_ = -((i_255_ + i_258_ - 1) / i_258_);
	for (int i_263_ = i_261_; i_263_ < 0; i_263_++) {
	    for (int i_264_ = i_262_; i_264_ < 0; i_264_++) {
		if (is[i] == 0)
		    return true;
		i += i_258_;
	    }
	    i -= i_260_;
	    if (is[i - 1] == 0)
		return true;
	    i += i_257_;
	}
	return false;
    }
    
    static final void method6199(byte[] is, byte[] is_265_, int i, int i_266_,
				 int i_267_, int i_268_, int i_269_,
				 int i_270_) {
	int i_271_ = -(i_267_ >> 2);
	i_267_ = -(i_267_ & 0x3);
	for (int i_272_ = -i_268_; i_272_ < 0; i_272_++) {
	    for (int i_273_ = i_271_; i_273_ < 0; i_273_++) {
		is[i_266_++] += is_265_[i++];
		is[i_266_++] += is_265_[i++];
		is[i_266_++] += is_265_[i++];
		is[i_266_++] += is_265_[i++];
	    }
	    for (int i_274_ = i_267_; i_274_ < 0; i_274_++)
		is[i_266_++] += is_265_[i++];
	    i_266_ += i_269_;
	    i += i_270_;
	}
    }
}
