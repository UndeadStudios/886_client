/* Class415 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Random;

public abstract class Class415
{
    int anInt4411;
    int anInt4412;
    static final int anInt4413 = 4095;
    short[] aShortArray4414;
    short[] aShortArray4415 = new short[512];
    static final int anInt4416 = 4096;
    static final int anInt4417 = 12;
    int anInt4418;
    int anInt4419;
    int anInt4420;
    public static int[] anIntArray4421 = new int[4096];
    
    void method6694() {
	Random random = new Random((long) anInt4412);
	for (int i = 0; i < 255; i++)
	    aShortArray4415[i] = (short) i;
	for (int i = 0; i < 255; i++) {
	    int i_0_ = 255 - i;
	    int i_1_ = Class2.method526(random, i_0_, -1781912443);
	    short i_2_ = aShortArray4415[i_1_];
	    aShortArray4415[i_1_] = aShortArray4415[i_0_];
	    aShortArray4415[i_0_] = aShortArray4415[i_0_ + 256] = i_2_;
	}
    }
    
    void method6695(int i, int i_3_, int i_4_) {
	int[] is = new int[i];
	int[] is_5_ = new int[i_3_];
	int[] is_6_ = new int[i_4_];
	for (int i_7_ = 0; i_7_ < i; i_7_++)
	    is[i_7_] = (i_7_ << 12) / i;
	for (int i_8_ = 0; i_8_ < i_3_; i_8_++)
	    is_5_[i_8_] = (i_8_ << 12) / i_3_;
	for (int i_9_ = 0; i_9_ < i_4_; i_9_++)
	    is_6_[i_9_] = (i_9_ << 12) / i_4_;
	method6696();
	for (int i_10_ = 0; i_10_ < i_4_; i_10_++) {
	    for (int i_11_ = 0; i_11_ < i_3_; i_11_++) {
		for (int i_12_ = 0; i_12_ < i; i_12_++) {
		    for (int i_13_ = 0; i_13_ < anInt4420; i_13_++) {
			int i_14_ = aShortArray4414[i_13_] << 12;
			int i_15_ = anInt4411 * i_14_ >> 12;
			int i_16_ = anInt4418 * i_14_ >> 12;
			int i_17_ = anInt4419 * i_14_ >> 12;
			int i_18_ = is[i_12_] * i_14_ >> 12;
			int i_19_ = is_5_[i_11_] * i_14_ >> 12;
			int i_20_ = is_6_[i_10_] * i_14_ >> 12;
			i_18_ *= anInt4411;
			i_19_ *= anInt4418;
			i_20_ *= anInt4419;
			int i_21_ = i_18_ >> 12;
			int i_22_ = i_21_ + 1;
			i_21_ &= 0xff;
			int i_23_ = i_19_ >> 12;
			int i_24_ = i_23_ + 1;
			i_23_ &= 0xff;
			int i_25_ = i_20_ >> 12;
			int i_26_ = i_25_ + 1;
			i_25_ &= 0xff;
			if (i_22_ >= i_15_)
			    i_22_ = 0;
			else
			    i_22_ &= 0xff;
			if (i_24_ >= i_16_)
			    i_24_ = 0;
			else
			    i_24_ &= 0xff;
			if (i_26_ >= i_17_)
			    i_26_ = 0;
			else
			    i_26_ &= 0xff;
			i_18_ &= 0xfff;
			i_19_ &= 0xfff;
			i_20_ &= 0xfff;
			int i_27_ = anIntArray4421[i_18_];
			int i_28_ = anIntArray4421[i_19_];
			int i_29_ = anIntArray4421[i_20_];
			int i_30_ = i_18_ - 4096;
			int i_31_ = i_19_ - 4096;
			int i_32_ = i_20_ - 4096;
			int i_33_ = aShortArray4415[i_25_];
			int i_34_ = aShortArray4415[i_26_];
			int i_35_ = aShortArray4415[i_23_ + i_33_];
			int i_36_ = aShortArray4415[i_24_ + i_33_];
			int i_37_ = aShortArray4415[i_23_ + i_34_];
			int i_38_ = aShortArray4415[i_24_ + i_34_];
			int i_39_ = method6702(aShortArray4415[i_21_ + i_35_],
					       i_18_, i_19_, i_20_);
			int i_40_ = method6702(aShortArray4415[i_22_ + i_35_],
					       i_30_, i_19_, i_20_);
			int i_41_ = i_39_ + (i_27_ * (i_40_ - i_39_) >> 12);
			i_39_ = method6702(aShortArray4415[i_21_ + i_36_],
					   i_18_, i_31_, i_20_);
			i_40_ = method6702(aShortArray4415[i_22_ + i_36_],
					   i_30_, i_31_, i_20_);
			int i_42_ = i_39_ + (i_27_ * (i_40_ - i_39_) >> 12);
			int i_43_ = i_41_ + (i_28_ * (i_42_ - i_41_) >> 12);
			i_39_ = method6702(aShortArray4415[i_21_ + i_37_],
					   i_18_, i_19_, i_32_);
			i_40_ = method6702(aShortArray4415[i_22_ + i_37_],
					   i_30_, i_19_, i_32_);
			i_41_ = i_39_ + (i_27_ * (i_40_ - i_39_) >> 12);
			i_39_ = method6702(aShortArray4415[i_21_ + i_38_],
					   i_18_, i_31_, i_32_);
			i_40_ = method6702(aShortArray4415[i_22_ + i_38_],
					   i_30_, i_31_, i_32_);
			i_42_ = i_39_ + (i_27_ * (i_40_ - i_39_) >> 12);
			int i_44_ = i_41_ + (i_28_ * (i_42_ - i_41_) >> 12);
			method6698(i_13_,
				   i_43_ + (i_29_ * (i_44_ - i_43_) >> 12));
		    }
		    method6710();
		}
	    }
	}
    }
    
    abstract void method6696();
    
    void method6697() {
	aShortArray4414 = new short[anInt4420];
	for (int i = 0; i < anInt4420; i++)
	    aShortArray4414[i] = (short) (int) Math.pow(2.0, (double) i);
    }
    
    abstract void method6698(int i, int i_45_);
    
    void method6699() {
	aShortArray4414 = new short[anInt4420];
	for (int i = 0; i < anInt4420; i++)
	    aShortArray4414[i] = (short) (int) Math.pow(2.0, (double) i);
    }
    
    void method6700(int i, int i_46_, int i_47_) {
	int[] is = new int[i];
	int[] is_48_ = new int[i_46_];
	int[] is_49_ = new int[i_47_];
	for (int i_50_ = 0; i_50_ < i; i_50_++)
	    is[i_50_] = (i_50_ << 12) / i;
	for (int i_51_ = 0; i_51_ < i_46_; i_51_++)
	    is_48_[i_51_] = (i_51_ << 12) / i_46_;
	for (int i_52_ = 0; i_52_ < i_47_; i_52_++)
	    is_49_[i_52_] = (i_52_ << 12) / i_47_;
	method6696();
	for (int i_53_ = 0; i_53_ < i_47_; i_53_++) {
	    for (int i_54_ = 0; i_54_ < i_46_; i_54_++) {
		for (int i_55_ = 0; i_55_ < i; i_55_++) {
		    for (int i_56_ = 0; i_56_ < anInt4420; i_56_++) {
			int i_57_ = aShortArray4414[i_56_] << 12;
			int i_58_ = anInt4411 * i_57_ >> 12;
			int i_59_ = anInt4418 * i_57_ >> 12;
			int i_60_ = anInt4419 * i_57_ >> 12;
			int i_61_ = is[i_55_] * i_57_ >> 12;
			int i_62_ = is_48_[i_54_] * i_57_ >> 12;
			int i_63_ = is_49_[i_53_] * i_57_ >> 12;
			i_61_ *= anInt4411;
			i_62_ *= anInt4418;
			i_63_ *= anInt4419;
			int i_64_ = i_61_ >> 12;
			int i_65_ = i_64_ + 1;
			i_64_ &= 0xff;
			int i_66_ = i_62_ >> 12;
			int i_67_ = i_66_ + 1;
			i_66_ &= 0xff;
			int i_68_ = i_63_ >> 12;
			int i_69_ = i_68_ + 1;
			i_68_ &= 0xff;
			if (i_65_ >= i_58_)
			    i_65_ = 0;
			else
			    i_65_ &= 0xff;
			if (i_67_ >= i_59_)
			    i_67_ = 0;
			else
			    i_67_ &= 0xff;
			if (i_69_ >= i_60_)
			    i_69_ = 0;
			else
			    i_69_ &= 0xff;
			i_61_ &= 0xfff;
			i_62_ &= 0xfff;
			i_63_ &= 0xfff;
			int i_70_ = anIntArray4421[i_61_];
			int i_71_ = anIntArray4421[i_62_];
			int i_72_ = anIntArray4421[i_63_];
			int i_73_ = i_61_ - 4096;
			int i_74_ = i_62_ - 4096;
			int i_75_ = i_63_ - 4096;
			int i_76_ = aShortArray4415[i_68_];
			int i_77_ = aShortArray4415[i_69_];
			int i_78_ = aShortArray4415[i_66_ + i_76_];
			int i_79_ = aShortArray4415[i_67_ + i_76_];
			int i_80_ = aShortArray4415[i_66_ + i_77_];
			int i_81_ = aShortArray4415[i_67_ + i_77_];
			int i_82_ = method6702(aShortArray4415[i_64_ + i_78_],
					       i_61_, i_62_, i_63_);
			int i_83_ = method6702(aShortArray4415[i_65_ + i_78_],
					       i_73_, i_62_, i_63_);
			int i_84_ = i_82_ + (i_70_ * (i_83_ - i_82_) >> 12);
			i_82_ = method6702(aShortArray4415[i_64_ + i_79_],
					   i_61_, i_74_, i_63_);
			i_83_ = method6702(aShortArray4415[i_65_ + i_79_],
					   i_73_, i_74_, i_63_);
			int i_85_ = i_82_ + (i_70_ * (i_83_ - i_82_) >> 12);
			int i_86_ = i_84_ + (i_71_ * (i_85_ - i_84_) >> 12);
			i_82_ = method6702(aShortArray4415[i_64_ + i_80_],
					   i_61_, i_62_, i_75_);
			i_83_ = method6702(aShortArray4415[i_65_ + i_80_],
					   i_73_, i_62_, i_75_);
			i_84_ = i_82_ + (i_70_ * (i_83_ - i_82_) >> 12);
			i_82_ = method6702(aShortArray4415[i_64_ + i_81_],
					   i_61_, i_74_, i_75_);
			i_83_ = method6702(aShortArray4415[i_65_ + i_81_],
					   i_73_, i_74_, i_75_);
			i_85_ = i_82_ + (i_70_ * (i_83_ - i_82_) >> 12);
			int i_87_ = i_84_ + (i_71_ * (i_85_ - i_84_) >> 12);
			method6698(i_56_,
				   i_86_ + (i_72_ * (i_87_ - i_86_) >> 12));
		    }
		    method6710();
		}
	    }
	}
    }
    
    void method6701(int i, int i_88_, int i_89_) {
	int[] is = new int[i];
	int[] is_90_ = new int[i_88_];
	int[] is_91_ = new int[i_89_];
	for (int i_92_ = 0; i_92_ < i; i_92_++)
	    is[i_92_] = (i_92_ << 12) / i;
	for (int i_93_ = 0; i_93_ < i_88_; i_93_++)
	    is_90_[i_93_] = (i_93_ << 12) / i_88_;
	for (int i_94_ = 0; i_94_ < i_89_; i_94_++)
	    is_91_[i_94_] = (i_94_ << 12) / i_89_;
	method6696();
	for (int i_95_ = 0; i_95_ < i_89_; i_95_++) {
	    for (int i_96_ = 0; i_96_ < i_88_; i_96_++) {
		for (int i_97_ = 0; i_97_ < i; i_97_++) {
		    for (int i_98_ = 0; i_98_ < anInt4420; i_98_++) {
			int i_99_ = aShortArray4414[i_98_] << 12;
			int i_100_ = anInt4411 * i_99_ >> 12;
			int i_101_ = anInt4418 * i_99_ >> 12;
			int i_102_ = anInt4419 * i_99_ >> 12;
			int i_103_ = is[i_97_] * i_99_ >> 12;
			int i_104_ = is_90_[i_96_] * i_99_ >> 12;
			int i_105_ = is_91_[i_95_] * i_99_ >> 12;
			i_103_ *= anInt4411;
			i_104_ *= anInt4418;
			i_105_ *= anInt4419;
			int i_106_ = i_103_ >> 12;
			int i_107_ = i_106_ + 1;
			i_106_ &= 0xff;
			int i_108_ = i_104_ >> 12;
			int i_109_ = i_108_ + 1;
			i_108_ &= 0xff;
			int i_110_ = i_105_ >> 12;
			int i_111_ = i_110_ + 1;
			i_110_ &= 0xff;
			if (i_107_ >= i_100_)
			    i_107_ = 0;
			else
			    i_107_ &= 0xff;
			if (i_109_ >= i_101_)
			    i_109_ = 0;
			else
			    i_109_ &= 0xff;
			if (i_111_ >= i_102_)
			    i_111_ = 0;
			else
			    i_111_ &= 0xff;
			i_103_ &= 0xfff;
			i_104_ &= 0xfff;
			i_105_ &= 0xfff;
			int i_112_ = anIntArray4421[i_103_];
			int i_113_ = anIntArray4421[i_104_];
			int i_114_ = anIntArray4421[i_105_];
			int i_115_ = i_103_ - 4096;
			int i_116_ = i_104_ - 4096;
			int i_117_ = i_105_ - 4096;
			int i_118_ = aShortArray4415[i_110_];
			int i_119_ = aShortArray4415[i_111_];
			int i_120_ = aShortArray4415[i_108_ + i_118_];
			int i_121_ = aShortArray4415[i_109_ + i_118_];
			int i_122_ = aShortArray4415[i_108_ + i_119_];
			int i_123_ = aShortArray4415[i_109_ + i_119_];
			int i_124_
			    = method6702(aShortArray4415[i_106_ + i_120_],
					 i_103_, i_104_, i_105_);
			int i_125_
			    = method6702(aShortArray4415[i_107_ + i_120_],
					 i_115_, i_104_, i_105_);
			int i_126_
			    = i_124_ + (i_112_ * (i_125_ - i_124_) >> 12);
			i_124_ = method6702(aShortArray4415[i_106_ + i_121_],
					    i_103_, i_116_, i_105_);
			i_125_ = method6702(aShortArray4415[i_107_ + i_121_],
					    i_115_, i_116_, i_105_);
			int i_127_
			    = i_124_ + (i_112_ * (i_125_ - i_124_) >> 12);
			int i_128_
			    = i_126_ + (i_113_ * (i_127_ - i_126_) >> 12);
			i_124_ = method6702(aShortArray4415[i_106_ + i_122_],
					    i_103_, i_104_, i_117_);
			i_125_ = method6702(aShortArray4415[i_107_ + i_122_],
					    i_115_, i_104_, i_117_);
			i_126_ = i_124_ + (i_112_ * (i_125_ - i_124_) >> 12);
			i_124_ = method6702(aShortArray4415[i_106_ + i_123_],
					    i_103_, i_116_, i_117_);
			i_125_ = method6702(aShortArray4415[i_107_ + i_123_],
					    i_115_, i_116_, i_117_);
			i_127_ = i_124_ + (i_112_ * (i_125_ - i_124_) >> 12);
			int i_129_
			    = i_126_ + (i_113_ * (i_127_ - i_126_) >> 12);
			method6698(i_98_, i_128_ + (i_114_ * (i_129_ - i_128_)
						    >> 12));
		    }
		    method6710();
		}
	    }
	}
    }
    
    static int method6702(int i, int i_130_, int i_131_, int i_132_) {
	int i_133_ = i & 0xf;
	int i_134_ = i_133_ < 8 ? i_130_ : i_131_;
	int i_135_ = (i_133_ < 4 ? i_131_ : i_133_ == 12 || i_133_ == 14
		      ? i_130_ : i_132_);
	return (((i_133_ & 0x1) == 0 ? i_134_ : -i_134_)
		+ ((i_133_ & 0x2) == 0 ? i_135_ : -i_135_));
    }
    
    static {
	for (int i = 0; i < 4096; i++)
	    anIntArray4421[i] = method6703(i);
    }
    
    Class415(int i, int i_136_, int i_137_, int i_138_, int i_139_) {
	anInt4412 = 0;
	anInt4411 = 4;
	anInt4418 = 4;
	anInt4419 = 4;
	anInt4420 = 4;
	anInt4412 = i;
	anInt4411 = i_137_;
	anInt4418 = i_138_;
	anInt4419 = i_139_;
	anInt4420 = i_136_;
	method6699();
	method6694();
    }
    
    static final int method6703(int i) {
	int i_140_ = i * (i * i >> 12) >> 12;
	int i_141_ = i * 6 - 61440;
	int i_142_ = 40960 + (i_141_ * i >> 12);
	return i_142_ * i_140_ >> 12;
    }
    
    void method6704(int i, int i_143_, int i_144_) {
	int[] is = new int[i];
	int[] is_145_ = new int[i_143_];
	int[] is_146_ = new int[i_144_];
	for (int i_147_ = 0; i_147_ < i; i_147_++)
	    is[i_147_] = (i_147_ << 12) / i;
	for (int i_148_ = 0; i_148_ < i_143_; i_148_++)
	    is_145_[i_148_] = (i_148_ << 12) / i_143_;
	for (int i_149_ = 0; i_149_ < i_144_; i_149_++)
	    is_146_[i_149_] = (i_149_ << 12) / i_144_;
	method6696();
	for (int i_150_ = 0; i_150_ < i_144_; i_150_++) {
	    for (int i_151_ = 0; i_151_ < i_143_; i_151_++) {
		for (int i_152_ = 0; i_152_ < i; i_152_++) {
		    for (int i_153_ = 0; i_153_ < anInt4420; i_153_++) {
			int i_154_ = aShortArray4414[i_153_] << 12;
			int i_155_ = anInt4411 * i_154_ >> 12;
			int i_156_ = anInt4418 * i_154_ >> 12;
			int i_157_ = anInt4419 * i_154_ >> 12;
			int i_158_ = is[i_152_] * i_154_ >> 12;
			int i_159_ = is_145_[i_151_] * i_154_ >> 12;
			int i_160_ = is_146_[i_150_] * i_154_ >> 12;
			i_158_ *= anInt4411;
			i_159_ *= anInt4418;
			i_160_ *= anInt4419;
			int i_161_ = i_158_ >> 12;
			int i_162_ = i_161_ + 1;
			i_161_ &= 0xff;
			int i_163_ = i_159_ >> 12;
			int i_164_ = i_163_ + 1;
			i_163_ &= 0xff;
			int i_165_ = i_160_ >> 12;
			int i_166_ = i_165_ + 1;
			i_165_ &= 0xff;
			if (i_162_ >= i_155_)
			    i_162_ = 0;
			else
			    i_162_ &= 0xff;
			if (i_164_ >= i_156_)
			    i_164_ = 0;
			else
			    i_164_ &= 0xff;
			if (i_166_ >= i_157_)
			    i_166_ = 0;
			else
			    i_166_ &= 0xff;
			i_158_ &= 0xfff;
			i_159_ &= 0xfff;
			i_160_ &= 0xfff;
			int i_167_ = anIntArray4421[i_158_];
			int i_168_ = anIntArray4421[i_159_];
			int i_169_ = anIntArray4421[i_160_];
			int i_170_ = i_158_ - 4096;
			int i_171_ = i_159_ - 4096;
			int i_172_ = i_160_ - 4096;
			int i_173_ = aShortArray4415[i_165_];
			int i_174_ = aShortArray4415[i_166_];
			int i_175_ = aShortArray4415[i_163_ + i_173_];
			int i_176_ = aShortArray4415[i_164_ + i_173_];
			int i_177_ = aShortArray4415[i_163_ + i_174_];
			int i_178_ = aShortArray4415[i_164_ + i_174_];
			int i_179_
			    = method6702(aShortArray4415[i_161_ + i_175_],
					 i_158_, i_159_, i_160_);
			int i_180_
			    = method6702(aShortArray4415[i_162_ + i_175_],
					 i_170_, i_159_, i_160_);
			int i_181_
			    = i_179_ + (i_167_ * (i_180_ - i_179_) >> 12);
			i_179_ = method6702(aShortArray4415[i_161_ + i_176_],
					    i_158_, i_171_, i_160_);
			i_180_ = method6702(aShortArray4415[i_162_ + i_176_],
					    i_170_, i_171_, i_160_);
			int i_182_
			    = i_179_ + (i_167_ * (i_180_ - i_179_) >> 12);
			int i_183_
			    = i_181_ + (i_168_ * (i_182_ - i_181_) >> 12);
			i_179_ = method6702(aShortArray4415[i_161_ + i_177_],
					    i_158_, i_159_, i_172_);
			i_180_ = method6702(aShortArray4415[i_162_ + i_177_],
					    i_170_, i_159_, i_172_);
			i_181_ = i_179_ + (i_167_ * (i_180_ - i_179_) >> 12);
			i_179_ = method6702(aShortArray4415[i_161_ + i_178_],
					    i_158_, i_171_, i_172_);
			i_180_ = method6702(aShortArray4415[i_162_ + i_178_],
					    i_170_, i_171_, i_172_);
			i_182_ = i_179_ + (i_167_ * (i_180_ - i_179_) >> 12);
			int i_184_
			    = i_181_ + (i_168_ * (i_182_ - i_181_) >> 12);
			method6698(i_153_, i_183_ + (i_169_ * (i_184_ - i_183_)
						     >> 12));
		    }
		    method6710();
		}
	    }
	}
    }
    
    void method6705(int i, int i_185_, int i_186_) {
	int[] is = new int[i];
	int[] is_187_ = new int[i_185_];
	int[] is_188_ = new int[i_186_];
	for (int i_189_ = 0; i_189_ < i; i_189_++)
	    is[i_189_] = (i_189_ << 12) / i;
	for (int i_190_ = 0; i_190_ < i_185_; i_190_++)
	    is_187_[i_190_] = (i_190_ << 12) / i_185_;
	for (int i_191_ = 0; i_191_ < i_186_; i_191_++)
	    is_188_[i_191_] = (i_191_ << 12) / i_186_;
	method6696();
	for (int i_192_ = 0; i_192_ < i_186_; i_192_++) {
	    for (int i_193_ = 0; i_193_ < i_185_; i_193_++) {
		for (int i_194_ = 0; i_194_ < i; i_194_++) {
		    for (int i_195_ = 0; i_195_ < anInt4420; i_195_++) {
			int i_196_ = aShortArray4414[i_195_] << 12;
			int i_197_ = anInt4411 * i_196_ >> 12;
			int i_198_ = anInt4418 * i_196_ >> 12;
			int i_199_ = anInt4419 * i_196_ >> 12;
			int i_200_ = is[i_194_] * i_196_ >> 12;
			int i_201_ = is_187_[i_193_] * i_196_ >> 12;
			int i_202_ = is_188_[i_192_] * i_196_ >> 12;
			i_200_ *= anInt4411;
			i_201_ *= anInt4418;
			i_202_ *= anInt4419;
			int i_203_ = i_200_ >> 12;
			int i_204_ = i_203_ + 1;
			i_203_ &= 0xff;
			int i_205_ = i_201_ >> 12;
			int i_206_ = i_205_ + 1;
			i_205_ &= 0xff;
			int i_207_ = i_202_ >> 12;
			int i_208_ = i_207_ + 1;
			i_207_ &= 0xff;
			if (i_204_ >= i_197_)
			    i_204_ = 0;
			else
			    i_204_ &= 0xff;
			if (i_206_ >= i_198_)
			    i_206_ = 0;
			else
			    i_206_ &= 0xff;
			if (i_208_ >= i_199_)
			    i_208_ = 0;
			else
			    i_208_ &= 0xff;
			i_200_ &= 0xfff;
			i_201_ &= 0xfff;
			i_202_ &= 0xfff;
			int i_209_ = anIntArray4421[i_200_];
			int i_210_ = anIntArray4421[i_201_];
			int i_211_ = anIntArray4421[i_202_];
			int i_212_ = i_200_ - 4096;
			int i_213_ = i_201_ - 4096;
			int i_214_ = i_202_ - 4096;
			int i_215_ = aShortArray4415[i_207_];
			int i_216_ = aShortArray4415[i_208_];
			int i_217_ = aShortArray4415[i_205_ + i_215_];
			int i_218_ = aShortArray4415[i_206_ + i_215_];
			int i_219_ = aShortArray4415[i_205_ + i_216_];
			int i_220_ = aShortArray4415[i_206_ + i_216_];
			int i_221_
			    = method6702(aShortArray4415[i_203_ + i_217_],
					 i_200_, i_201_, i_202_);
			int i_222_
			    = method6702(aShortArray4415[i_204_ + i_217_],
					 i_212_, i_201_, i_202_);
			int i_223_
			    = i_221_ + (i_209_ * (i_222_ - i_221_) >> 12);
			i_221_ = method6702(aShortArray4415[i_203_ + i_218_],
					    i_200_, i_213_, i_202_);
			i_222_ = method6702(aShortArray4415[i_204_ + i_218_],
					    i_212_, i_213_, i_202_);
			int i_224_
			    = i_221_ + (i_209_ * (i_222_ - i_221_) >> 12);
			int i_225_
			    = i_223_ + (i_210_ * (i_224_ - i_223_) >> 12);
			i_221_ = method6702(aShortArray4415[i_203_ + i_219_],
					    i_200_, i_201_, i_214_);
			i_222_ = method6702(aShortArray4415[i_204_ + i_219_],
					    i_212_, i_201_, i_214_);
			i_223_ = i_221_ + (i_209_ * (i_222_ - i_221_) >> 12);
			i_221_ = method6702(aShortArray4415[i_203_ + i_220_],
					    i_200_, i_213_, i_214_);
			i_222_ = method6702(aShortArray4415[i_204_ + i_220_],
					    i_212_, i_213_, i_214_);
			i_224_ = i_221_ + (i_209_ * (i_222_ - i_221_) >> 12);
			int i_226_
			    = i_223_ + (i_210_ * (i_224_ - i_223_) >> 12);
			method6698(i_195_, i_225_ + (i_211_ * (i_226_ - i_225_)
						     >> 12));
		    }
		    method6710();
		}
	    }
	}
    }
    
    abstract void method6706();
    
    abstract void method6707();
    
    abstract void method6708();
    
    abstract void method6709(int i, int i_227_);
    
    abstract void method6710();
    
    void method6711() {
	aShortArray4414 = new short[anInt4420];
	for (int i = 0; i < anInt4420; i++)
	    aShortArray4414[i] = (short) (int) Math.pow(2.0, (double) i);
    }
    
    static int method6712(int i, int i_228_, int i_229_, int i_230_) {
	int i_231_ = i & 0xf;
	int i_232_ = i_231_ < 8 ? i_228_ : i_229_;
	int i_233_ = (i_231_ < 4 ? i_229_ : i_231_ == 12 || i_231_ == 14
		      ? i_228_ : i_230_);
	return (((i_231_ & 0x1) == 0 ? i_232_ : -i_232_)
		+ ((i_231_ & 0x2) == 0 ? i_233_ : -i_233_));
    }
    
    void method6713() {
	Random random = new Random((long) anInt4412);
	for (int i = 0; i < 255; i++)
	    aShortArray4415[i] = (short) i;
	for (int i = 0; i < 255; i++) {
	    int i_234_ = 255 - i;
	    int i_235_ = Class2.method526(random, i_234_, 1213021032);
	    short i_236_ = aShortArray4415[i_235_];
	    aShortArray4415[i_235_] = aShortArray4415[i_234_];
	    aShortArray4415[i_234_] = aShortArray4415[i_234_ + 256] = i_236_;
	}
    }
    
    static final int method6714(int i) {
	int i_237_ = i * (i * i >> 12) >> 12;
	int i_238_ = i * 6 - 61440;
	int i_239_ = 40960 + (i_238_ * i >> 12);
	return i_239_ * i_237_ >> 12;
    }
}
