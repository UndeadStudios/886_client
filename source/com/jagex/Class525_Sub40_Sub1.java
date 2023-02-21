/* Class525_Sub40_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class525_Sub40_Sub1 extends Class525_Sub40
{
    int anInt11842;
    static final int anInt11843 = 4;
    static final int anInt11844 = 4;
    static final int anInt11845 = 1638;
    byte[] aByteArray11846 = new byte[512];
    short[] aShortArray11847;
    int anInt11848 = 0;
    int anInt11849;
    static final boolean aBool11850 = true;
    static final int anInt11851 = 0;
    int anInt11852;
    int anInt11853;
    short[] aShortArray11854;
    boolean aBool11855;
    static final int anInt11856 = 8;
    
    void method18457(int i, int[] is, int i_0_) {
	int i_1_ = 1218509837 * anInt11852 * Class60.anIntArray643[i];
	if (1 == -2033634165 * anInt11853) {
	    int i_2_ = aShortArray11847[0];
	    int i_3_ = aShortArray11854[0] << 12;
	    int i_4_ = i_3_ * (1218509837 * anInt11852) >> 12;
	    int i_5_ = i_3_ * (anInt11842 * -831470941) >> 12;
	    int i_6_ = i_3_ * i_1_ >> 12;
	    int i_7_ = i_6_ >> 12;
	    int i_8_ = i_7_ + 1;
	    if (i_8_ >= i_4_)
		i_8_ = 0;
	    i_6_ &= 0xfff;
	    int i_9_ = Class415.anIntArray4421[i_6_];
	    int i_10_ = aByteArray11846[i_7_ & 0xff] & 0xff;
	    int i_11_ = aByteArray11846[i_8_ & 0xff] & 0xff;
	    if (aBool11855) {
		for (int i_12_ = 0; i_12_ < Class60.anInt639 * -262886165;
		     i_12_++) {
		    int i_13_ = (-831470941 * anInt11842
				 * Class60.anIntArray642[i_12_]);
		    int i_14_ = method18459(i_3_ * i_13_ >> 12, i_6_, i_10_,
					    i_11_, i_9_, i_5_, (byte) -105);
		    i_14_ = i_2_ * i_14_ >> 12;
		    is[i_12_] = (i_14_ >> 1) + 2048;
		}
	    } else {
		for (int i_15_ = 0; i_15_ < Class60.anInt639 * -262886165;
		     i_15_++) {
		    int i_16_ = (anInt11842 * -831470941
				 * Class60.anIntArray642[i_15_]);
		    int i_17_ = method18459(i_16_ * i_3_ >> 12, i_6_, i_10_,
					    i_11_, i_9_, i_5_, (byte) -47);
		    is[i_15_] = i_17_ * i_2_ >> 12;
		}
	    }
	} else {
	    int i_18_ = aShortArray11847[0];
	    if (i_18_ > 8 || i_18_ < -8) {
		int i_19_ = aShortArray11854[0] << 12;
		int i_20_ = i_19_ * (1218509837 * anInt11852) >> 12;
		int i_21_ = i_19_ * (anInt11842 * -831470941) >> 12;
		int i_22_ = i_1_ * i_19_ >> 12;
		int i_23_ = i_22_ >> 12;
		int i_24_ = i_23_ + 1;
		if (i_24_ >= i_20_)
		    i_24_ = 0;
		i_22_ &= 0xfff;
		int i_25_ = Class415.anIntArray4421[i_22_];
		int i_26_ = aByteArray11846[i_23_ & 0xff] & 0xff;
		int i_27_ = aByteArray11846[i_24_ & 0xff] & 0xff;
		for (int i_28_ = 0; i_28_ < -262886165 * Class60.anInt639;
		     i_28_++) {
		    int i_29_ = (anInt11842 * -831470941
				 * Class60.anIntArray642[i_28_]);
		    int i_30_ = method18459(i_29_ * i_19_ >> 12, i_22_, i_26_,
					    i_27_, i_25_, i_21_, (byte) -5);
		    is[i_28_] = i_30_ * i_18_ >> 12;
		}
	    }
	    for (int i_31_ = 1; i_31_ < anInt11853 * -2033634165; i_31_++) {
		i_18_ = aShortArray11847[i_31_];
		if (i_18_ > 8 || i_18_ < -8) {
		    int i_32_ = aShortArray11854[i_31_] << 12;
		    int i_33_ = i_32_ * (anInt11852 * 1218509837) >> 12;
		    int i_34_ = i_32_ * (anInt11842 * -831470941) >> 12;
		    int i_35_ = i_1_ * i_32_ >> 12;
		    int i_36_ = i_35_ >> 12;
		    int i_37_ = 1 + i_36_;
		    if (i_37_ >= i_33_)
			i_37_ = 0;
		    i_35_ &= 0xfff;
		    int i_38_ = Class415.anIntArray4421[i_35_];
		    int i_39_ = aByteArray11846[i_36_ & 0xff] & 0xff;
		    int i_40_ = aByteArray11846[i_37_ & 0xff] & 0xff;
		    if (aBool11855 && i_31_ == -2033634165 * anInt11853 - 1) {
			for (int i_41_ = 0;
			     i_41_ < Class60.anInt639 * -262886165; i_41_++) {
			    int i_42_ = (anInt11842 * -831470941
					 * Class60.anIntArray642[i_41_]);
			    int i_43_ = method18459(i_42_ * i_32_ >> 12, i_35_,
						    i_39_, i_40_, i_38_, i_34_,
						    (byte) -74);
			    i_43_ = is[i_41_] + (i_43_ * i_18_ >> 12);
			    is[i_41_] = (i_43_ >> 1) + 2048;
			}
		    } else {
			for (int i_44_ = 0;
			     i_44_ < Class60.anInt639 * -262886165; i_44_++) {
			    int i_45_ = (-831470941 * anInt11842
					 * Class60.anIntArray642[i_44_]);
			    int i_46_ = method18459(i_45_ * i_32_ >> 12, i_35_,
						    i_39_, i_40_, i_38_, i_34_,
						    (byte) -3);
			    is[i_44_] += i_18_ * i_46_ >> 12;
			}
		    }
		}
	    }
	}
    }
    
    int method18458(int i, int i_47_, int i_48_, int i_49_, int i_50_,
		    int i_51_) {
	int i_52_ = i >> 12;
	int i_53_ = i_52_ + 1;
	if (i_53_ >= i_51_)
	    i_53_ = 0;
	i &= 0xfff;
	i_52_ &= 0xff;
	i_53_ &= 0xff;
	int i_54_ = i - 4096;
	int i_55_ = i_47_ - 4096;
	int i_56_ = Class415.anIntArray4421[i];
	int i_57_ = aByteArray11846[i_52_ + i_48_] & 0x3;
	int i_58_;
	if (i_57_ <= 1)
	    i_58_ = 0 == i_57_ ? i_47_ + i : i_47_ - i;
	else
	    i_58_ = i_57_ == 2 ? i - i_47_ : -i - i_47_;
	i_57_ = aByteArray11846[i_48_ + i_53_] & 0x3;
	int i_59_;
	if (i_57_ <= 1)
	    i_59_ = i_57_ == 0 ? i_47_ + i_54_ : i_47_ - i_54_;
	else
	    i_59_ = i_57_ == 2 ? i_54_ - i_47_ : -i_54_ - i_47_;
	int i_60_ = i_58_ + (i_56_ * (i_59_ - i_58_) >> 12);
	i_57_ = aByteArray11846[i_49_ + i_52_] & 0x3;
	if (i_57_ <= 1)
	    i_58_ = i_57_ == 0 ? i + i_55_ : i_55_ - i;
	else
	    i_58_ = 2 == i_57_ ? i - i_55_ : -i - i_55_;
	i_57_ = aByteArray11846[i_53_ + i_49_] & 0x3;
	if (i_57_ <= 1)
	    i_59_ = 0 == i_57_ ? i_54_ + i_55_ : i_55_ - i_54_;
	else
	    i_59_ = 2 == i_57_ ? i_54_ - i_55_ : -i_54_ - i_55_;
	int i_61_ = (i_56_ * (i_59_ - i_58_) >> 12) + i_58_;
	return i_60_ + (i_50_ * (i_61_ - i_60_) >> 12);
    }
    
    int method18459(int i, int i_62_, int i_63_, int i_64_, int i_65_,
		    int i_66_, byte i_67_) {
	int i_68_ = i >> 12;
	int i_69_ = i_68_ + 1;
	if (i_69_ >= i_66_)
	    i_69_ = 0;
	i &= 0xfff;
	i_68_ &= 0xff;
	i_69_ &= 0xff;
	int i_70_ = i - 4096;
	int i_71_ = i_62_ - 4096;
	int i_72_ = Class415.anIntArray4421[i];
	int i_73_ = aByteArray11846[i_68_ + i_63_] & 0x3;
	int i_74_;
	if (i_73_ <= 1)
	    i_74_ = 0 == i_73_ ? i_62_ + i : i_62_ - i;
	else
	    i_74_ = i_73_ == 2 ? i - i_62_ : -i - i_62_;
	i_73_ = aByteArray11846[i_63_ + i_69_] & 0x3;
	int i_75_;
	if (i_73_ <= 1)
	    i_75_ = i_73_ == 0 ? i_62_ + i_70_ : i_62_ - i_70_;
	else
	    i_75_ = i_73_ == 2 ? i_70_ - i_62_ : -i_70_ - i_62_;
	int i_76_ = i_74_ + (i_72_ * (i_75_ - i_74_) >> 12);
	i_73_ = aByteArray11846[i_64_ + i_68_] & 0x3;
	if (i_73_ <= 1)
	    i_74_ = i_73_ == 0 ? i + i_71_ : i_71_ - i;
	else
	    i_74_ = 2 == i_73_ ? i - i_71_ : -i - i_71_;
	i_73_ = aByteArray11846[i_69_ + i_64_] & 0x3;
	if (i_73_ <= 1)
	    i_75_ = 0 == i_73_ ? i_70_ + i_71_ : i_71_ - i_70_;
	else
	    i_75_ = 2 == i_73_ ? i_70_ - i_71_ : -i_70_ - i_71_;
	int i_77_ = (i_72_ * (i_75_ - i_74_) >> 12) + i_74_;
	return i_76_ + (i_65_ * (i_77_ - i_76_) >> 12);
    }
    
    public static int[] method18460(int i, int i_78_, int i_79_, int i_80_,
				    int i_81_, float f, boolean bool) {
	int[] is = new int[i];
	Class525_Sub40_Sub1 class525_sub40_sub1 = new Class525_Sub40_Sub1();
	class525_sub40_sub1.anInt11848 = 473430349 * i_78_;
	class525_sub40_sub1.aBool11855 = bool;
	class525_sub40_sub1.anInt11842 = -111738613 * i_79_;
	class525_sub40_sub1.anInt11852 = 806466245 * i_80_;
	class525_sub40_sub1.anInt11853 = i_81_ * 1547080483;
	class525_sub40_sub1.anInt11849 = -150373995 * (int) (4096.0F * f);
	class525_sub40_sub1.method18464((byte) 1);
	Class60.method1229(i, 1, -280376399);
	class525_sub40_sub1.method18457(0, is, 2117753864);
	return is;
    }
    
    void method18461() {
	if (anInt11849 * 1158613437 > 0) {
	    aShortArray11847 = new short[anInt11853 * -2033634165];
	    aShortArray11854 = new short[-2033634165 * anInt11853];
	    for (int i = 0; i < anInt11853 * -2033634165; i++) {
		aShortArray11847[i]
		    = (short) (int) (Math.pow((double) ((float) (1158613437
								 * anInt11849)
							/ 4096.0F),
					      (double) i)
				     * 4096.0);
		aShortArray11854[i] = (short) (int) Math.pow(2.0, (double) i);
	    }
	} else if (aShortArray11847 != null
		   && aShortArray11847.length == -2033634165 * anInt11853) {
	    aShortArray11854 = new short[anInt11853 * -2033634165];
	    for (int i = 0; i < anInt11853 * -2033634165; i++)
		aShortArray11854[i] = (short) (int) Math.pow(2.0, (double) i);
	}
    }
    
    void method18462(int i, int[] is) {
	int i_82_ = 1218509837 * anInt11852 * Class60.anIntArray643[i];
	if (1 == -2033634165 * anInt11853) {
	    int i_83_ = aShortArray11847[0];
	    int i_84_ = aShortArray11854[0] << 12;
	    int i_85_ = i_84_ * (1218509837 * anInt11852) >> 12;
	    int i_86_ = i_84_ * (anInt11842 * -831470941) >> 12;
	    int i_87_ = i_84_ * i_82_ >> 12;
	    int i_88_ = i_87_ >> 12;
	    int i_89_ = i_88_ + 1;
	    if (i_89_ >= i_85_)
		i_89_ = 0;
	    i_87_ &= 0xfff;
	    int i_90_ = Class415.anIntArray4421[i_87_];
	    int i_91_ = aByteArray11846[i_88_ & 0xff] & 0xff;
	    int i_92_ = aByteArray11846[i_89_ & 0xff] & 0xff;
	    if (aBool11855) {
		for (int i_93_ = 0; i_93_ < Class60.anInt639 * -262886165;
		     i_93_++) {
		    int i_94_ = (-831470941 * anInt11842
				 * Class60.anIntArray642[i_93_]);
		    int i_95_ = method18459(i_84_ * i_94_ >> 12, i_87_, i_91_,
					    i_92_, i_90_, i_86_, (byte) -3);
		    i_95_ = i_83_ * i_95_ >> 12;
		    is[i_93_] = (i_95_ >> 1) + 2048;
		}
	    } else {
		for (int i_96_ = 0; i_96_ < Class60.anInt639 * -262886165;
		     i_96_++) {
		    int i_97_ = (anInt11842 * -831470941
				 * Class60.anIntArray642[i_96_]);
		    int i_98_ = method18459(i_97_ * i_84_ >> 12, i_87_, i_91_,
					    i_92_, i_90_, i_86_, (byte) -30);
		    is[i_96_] = i_98_ * i_83_ >> 12;
		}
	    }
	} else {
	    int i_99_ = aShortArray11847[0];
	    if (i_99_ > 8 || i_99_ < -8) {
		int i_100_ = aShortArray11854[0] << 12;
		int i_101_ = i_100_ * (1218509837 * anInt11852) >> 12;
		int i_102_ = i_100_ * (anInt11842 * -831470941) >> 12;
		int i_103_ = i_82_ * i_100_ >> 12;
		int i_104_ = i_103_ >> 12;
		int i_105_ = i_104_ + 1;
		if (i_105_ >= i_101_)
		    i_105_ = 0;
		i_103_ &= 0xfff;
		int i_106_ = Class415.anIntArray4421[i_103_];
		int i_107_ = aByteArray11846[i_104_ & 0xff] & 0xff;
		int i_108_ = aByteArray11846[i_105_ & 0xff] & 0xff;
		for (int i_109_ = 0; i_109_ < -262886165 * Class60.anInt639;
		     i_109_++) {
		    int i_110_ = (anInt11842 * -831470941
				  * Class60.anIntArray642[i_109_]);
		    int i_111_
			= method18459(i_110_ * i_100_ >> 12, i_103_, i_107_,
				      i_108_, i_106_, i_102_, (byte) -84);
		    is[i_109_] = i_111_ * i_99_ >> 12;
		}
	    }
	    for (int i_112_ = 1; i_112_ < anInt11853 * -2033634165; i_112_++) {
		i_99_ = aShortArray11847[i_112_];
		if (i_99_ > 8 || i_99_ < -8) {
		    int i_113_ = aShortArray11854[i_112_] << 12;
		    int i_114_ = i_113_ * (anInt11852 * 1218509837) >> 12;
		    int i_115_ = i_113_ * (anInt11842 * -831470941) >> 12;
		    int i_116_ = i_82_ * i_113_ >> 12;
		    int i_117_ = i_116_ >> 12;
		    int i_118_ = 1 + i_117_;
		    if (i_118_ >= i_114_)
			i_118_ = 0;
		    i_116_ &= 0xfff;
		    int i_119_ = Class415.anIntArray4421[i_116_];
		    int i_120_ = aByteArray11846[i_117_ & 0xff] & 0xff;
		    int i_121_ = aByteArray11846[i_118_ & 0xff] & 0xff;
		    if (aBool11855 && i_112_ == -2033634165 * anInt11853 - 1) {
			for (int i_122_ = 0;
			     i_122_ < Class60.anInt639 * -262886165;
			     i_122_++) {
			    int i_123_ = (anInt11842 * -831470941
					  * Class60.anIntArray642[i_122_]);
			    int i_124_
				= method18459(i_123_ * i_113_ >> 12, i_116_,
					      i_120_, i_121_, i_119_, i_115_,
					      (byte) -128);
			    i_124_ = is[i_122_] + (i_124_ * i_99_ >> 12);
			    is[i_122_] = (i_124_ >> 1) + 2048;
			}
		    } else {
			for (int i_125_ = 0;
			     i_125_ < Class60.anInt639 * -262886165;
			     i_125_++) {
			    int i_126_ = (-831470941 * anInt11842
					  * Class60.anIntArray642[i_125_]);
			    int i_127_
				= method18459(i_126_ * i_113_ >> 12, i_116_,
					      i_120_, i_121_, i_119_, i_115_,
					      (byte) -45);
			    is[i_125_] += i_99_ * i_127_ >> 12;
			}
		    }
		}
	    }
	}
    }
    
    void method18463(int i, int[] is) {
	int i_128_ = 1218509837 * anInt11852 * Class60.anIntArray643[i];
	if (1 == -2033634165 * anInt11853) {
	    int i_129_ = aShortArray11847[0];
	    int i_130_ = aShortArray11854[0] << 12;
	    int i_131_ = i_130_ * (1218509837 * anInt11852) >> 12;
	    int i_132_ = i_130_ * (anInt11842 * -831470941) >> 12;
	    int i_133_ = i_130_ * i_128_ >> 12;
	    int i_134_ = i_133_ >> 12;
	    int i_135_ = i_134_ + 1;
	    if (i_135_ >= i_131_)
		i_135_ = 0;
	    i_133_ &= 0xfff;
	    int i_136_ = Class415.anIntArray4421[i_133_];
	    int i_137_ = aByteArray11846[i_134_ & 0xff] & 0xff;
	    int i_138_ = aByteArray11846[i_135_ & 0xff] & 0xff;
	    if (aBool11855) {
		for (int i_139_ = 0; i_139_ < Class60.anInt639 * -262886165;
		     i_139_++) {
		    int i_140_ = (-831470941 * anInt11842
				  * Class60.anIntArray642[i_139_]);
		    int i_141_
			= method18459(i_130_ * i_140_ >> 12, i_133_, i_137_,
				      i_138_, i_136_, i_132_, (byte) -110);
		    i_141_ = i_129_ * i_141_ >> 12;
		    is[i_139_] = (i_141_ >> 1) + 2048;
		}
	    } else {
		for (int i_142_ = 0; i_142_ < Class60.anInt639 * -262886165;
		     i_142_++) {
		    int i_143_ = (anInt11842 * -831470941
				  * Class60.anIntArray642[i_142_]);
		    int i_144_
			= method18459(i_143_ * i_130_ >> 12, i_133_, i_137_,
				      i_138_, i_136_, i_132_, (byte) -90);
		    is[i_142_] = i_144_ * i_129_ >> 12;
		}
	    }
	} else {
	    int i_145_ = aShortArray11847[0];
	    if (i_145_ > 8 || i_145_ < -8) {
		int i_146_ = aShortArray11854[0] << 12;
		int i_147_ = i_146_ * (1218509837 * anInt11852) >> 12;
		int i_148_ = i_146_ * (anInt11842 * -831470941) >> 12;
		int i_149_ = i_128_ * i_146_ >> 12;
		int i_150_ = i_149_ >> 12;
		int i_151_ = i_150_ + 1;
		if (i_151_ >= i_147_)
		    i_151_ = 0;
		i_149_ &= 0xfff;
		int i_152_ = Class415.anIntArray4421[i_149_];
		int i_153_ = aByteArray11846[i_150_ & 0xff] & 0xff;
		int i_154_ = aByteArray11846[i_151_ & 0xff] & 0xff;
		for (int i_155_ = 0; i_155_ < -262886165 * Class60.anInt639;
		     i_155_++) {
		    int i_156_ = (anInt11842 * -831470941
				  * Class60.anIntArray642[i_155_]);
		    int i_157_
			= method18459(i_156_ * i_146_ >> 12, i_149_, i_153_,
				      i_154_, i_152_, i_148_, (byte) -62);
		    is[i_155_] = i_157_ * i_145_ >> 12;
		}
	    }
	    for (int i_158_ = 1; i_158_ < anInt11853 * -2033634165; i_158_++) {
		i_145_ = aShortArray11847[i_158_];
		if (i_145_ > 8 || i_145_ < -8) {
		    int i_159_ = aShortArray11854[i_158_] << 12;
		    int i_160_ = i_159_ * (anInt11852 * 1218509837) >> 12;
		    int i_161_ = i_159_ * (anInt11842 * -831470941) >> 12;
		    int i_162_ = i_128_ * i_159_ >> 12;
		    int i_163_ = i_162_ >> 12;
		    int i_164_ = 1 + i_163_;
		    if (i_164_ >= i_160_)
			i_164_ = 0;
		    i_162_ &= 0xfff;
		    int i_165_ = Class415.anIntArray4421[i_162_];
		    int i_166_ = aByteArray11846[i_163_ & 0xff] & 0xff;
		    int i_167_ = aByteArray11846[i_164_ & 0xff] & 0xff;
		    if (aBool11855 && i_158_ == -2033634165 * anInt11853 - 1) {
			for (int i_168_ = 0;
			     i_168_ < Class60.anInt639 * -262886165;
			     i_168_++) {
			    int i_169_ = (anInt11842 * -831470941
					  * Class60.anIntArray642[i_168_]);
			    int i_170_
				= method18459(i_169_ * i_159_ >> 12, i_162_,
					      i_166_, i_167_, i_165_, i_161_,
					      (byte) -25);
			    i_170_ = is[i_168_] + (i_170_ * i_145_ >> 12);
			    is[i_168_] = (i_170_ >> 1) + 2048;
			}
		    } else {
			for (int i_171_ = 0;
			     i_171_ < Class60.anInt639 * -262886165;
			     i_171_++) {
			    int i_172_ = (-831470941 * anInt11842
					  * Class60.anIntArray642[i_171_]);
			    int i_173_
				= method18459(i_172_ * i_159_ >> 12, i_162_,
					      i_166_, i_167_, i_165_, i_161_,
					      (byte) -37);
			    is[i_171_] += i_145_ * i_173_ >> 12;
			}
		    }
		}
	    }
	}
    }
    
    void method18464(byte i) {
	aByteArray11846
	    = Class60.method1230(-2058098811 * anInt11848, 1809055275);
	method18467((short) 6379);
	for (int i_174_ = anInt11853 * -2033634165 - 1; i_174_ >= 1;
	     i_174_--) {
	    short i_175_ = aShortArray11847[i_174_];
	    if (i_175_ > 8 || i_175_ < -8)
		break;
	    anInt11853 -= 1547080483;
	}
    }
    
    void method18465(int i, int[] is) {
	int i_176_ = 1218509837 * anInt11852 * Class60.anIntArray643[i];
	if (1 == -2033634165 * anInt11853) {
	    int i_177_ = aShortArray11847[0];
	    int i_178_ = aShortArray11854[0] << 12;
	    int i_179_ = i_178_ * (1218509837 * anInt11852) >> 12;
	    int i_180_ = i_178_ * (anInt11842 * -831470941) >> 12;
	    int i_181_ = i_178_ * i_176_ >> 12;
	    int i_182_ = i_181_ >> 12;
	    int i_183_ = i_182_ + 1;
	    if (i_183_ >= i_179_)
		i_183_ = 0;
	    i_181_ &= 0xfff;
	    int i_184_ = Class415.anIntArray4421[i_181_];
	    int i_185_ = aByteArray11846[i_182_ & 0xff] & 0xff;
	    int i_186_ = aByteArray11846[i_183_ & 0xff] & 0xff;
	    if (aBool11855) {
		for (int i_187_ = 0; i_187_ < Class60.anInt639 * -262886165;
		     i_187_++) {
		    int i_188_ = (-831470941 * anInt11842
				  * Class60.anIntArray642[i_187_]);
		    int i_189_
			= method18459(i_178_ * i_188_ >> 12, i_181_, i_185_,
				      i_186_, i_184_, i_180_, (byte) -47);
		    i_189_ = i_177_ * i_189_ >> 12;
		    is[i_187_] = (i_189_ >> 1) + 2048;
		}
	    } else {
		for (int i_190_ = 0; i_190_ < Class60.anInt639 * -262886165;
		     i_190_++) {
		    int i_191_ = (anInt11842 * -831470941
				  * Class60.anIntArray642[i_190_]);
		    int i_192_
			= method18459(i_191_ * i_178_ >> 12, i_181_, i_185_,
				      i_186_, i_184_, i_180_, (byte) -23);
		    is[i_190_] = i_192_ * i_177_ >> 12;
		}
	    }
	} else {
	    int i_193_ = aShortArray11847[0];
	    if (i_193_ > 8 || i_193_ < -8) {
		int i_194_ = aShortArray11854[0] << 12;
		int i_195_ = i_194_ * (1218509837 * anInt11852) >> 12;
		int i_196_ = i_194_ * (anInt11842 * -831470941) >> 12;
		int i_197_ = i_176_ * i_194_ >> 12;
		int i_198_ = i_197_ >> 12;
		int i_199_ = i_198_ + 1;
		if (i_199_ >= i_195_)
		    i_199_ = 0;
		i_197_ &= 0xfff;
		int i_200_ = Class415.anIntArray4421[i_197_];
		int i_201_ = aByteArray11846[i_198_ & 0xff] & 0xff;
		int i_202_ = aByteArray11846[i_199_ & 0xff] & 0xff;
		for (int i_203_ = 0; i_203_ < -262886165 * Class60.anInt639;
		     i_203_++) {
		    int i_204_ = (anInt11842 * -831470941
				  * Class60.anIntArray642[i_203_]);
		    int i_205_
			= method18459(i_204_ * i_194_ >> 12, i_197_, i_201_,
				      i_202_, i_200_, i_196_, (byte) -24);
		    is[i_203_] = i_205_ * i_193_ >> 12;
		}
	    }
	    for (int i_206_ = 1; i_206_ < anInt11853 * -2033634165; i_206_++) {
		i_193_ = aShortArray11847[i_206_];
		if (i_193_ > 8 || i_193_ < -8) {
		    int i_207_ = aShortArray11854[i_206_] << 12;
		    int i_208_ = i_207_ * (anInt11852 * 1218509837) >> 12;
		    int i_209_ = i_207_ * (anInt11842 * -831470941) >> 12;
		    int i_210_ = i_176_ * i_207_ >> 12;
		    int i_211_ = i_210_ >> 12;
		    int i_212_ = 1 + i_211_;
		    if (i_212_ >= i_208_)
			i_212_ = 0;
		    i_210_ &= 0xfff;
		    int i_213_ = Class415.anIntArray4421[i_210_];
		    int i_214_ = aByteArray11846[i_211_ & 0xff] & 0xff;
		    int i_215_ = aByteArray11846[i_212_ & 0xff] & 0xff;
		    if (aBool11855 && i_206_ == -2033634165 * anInt11853 - 1) {
			for (int i_216_ = 0;
			     i_216_ < Class60.anInt639 * -262886165;
			     i_216_++) {
			    int i_217_ = (anInt11842 * -831470941
					  * Class60.anIntArray642[i_216_]);
			    int i_218_
				= method18459(i_217_ * i_207_ >> 12, i_210_,
					      i_214_, i_215_, i_213_, i_209_,
					      (byte) -9);
			    i_218_ = is[i_216_] + (i_218_ * i_193_ >> 12);
			    is[i_216_] = (i_218_ >> 1) + 2048;
			}
		    } else {
			for (int i_219_ = 0;
			     i_219_ < Class60.anInt639 * -262886165;
			     i_219_++) {
			    int i_220_ = (-831470941 * anInt11842
					  * Class60.anIntArray642[i_219_]);
			    int i_221_
				= method18459(i_220_ * i_207_ >> 12, i_210_,
					      i_214_, i_215_, i_213_, i_209_,
					      (byte) -38);
			    is[i_219_] += i_193_ * i_221_ >> 12;
			}
		    }
		}
	    }
	}
    }
    
    Class525_Sub40_Sub1() {
	super(0, true);
	anInt11842 = -446954452;
	anInt11852 = -1069102316;
	anInt11853 = 1893354636;
	anInt11849 = -1499467938;
	aBool11855 = true;
    }
    
    void method18466() {
	aByteArray11846
	    = Class60.method1230(-2058098811 * anInt11848, 1157250215);
	method18467((short) -2372);
	for (int i = anInt11853 * -2033634165 - 1; i >= 1; i--) {
	    short i_222_ = aShortArray11847[i];
	    if (i_222_ > 8 || i_222_ < -8)
		break;
	    anInt11853 -= 1547080483;
	}
    }
    
    void method18467(short i) {
	if (anInt11849 * 1158613437 > 0) {
	    aShortArray11847 = new short[anInt11853 * -2033634165];
	    aShortArray11854 = new short[-2033634165 * anInt11853];
	    for (int i_223_ = 0; i_223_ < anInt11853 * -2033634165; i_223_++) {
		aShortArray11847[i_223_]
		    = (short) (int) (Math.pow((double) ((float) (1158613437
								 * anInt11849)
							/ 4096.0F),
					      (double) i_223_)
				     * 4096.0);
		aShortArray11854[i_223_]
		    = (short) (int) Math.pow(2.0, (double) i_223_);
	    }
	} else if (aShortArray11847 != null
		   && aShortArray11847.length == -2033634165 * anInt11853) {
	    aShortArray11854 = new short[anInt11853 * -2033634165];
	    for (int i_224_ = 0; i_224_ < anInt11853 * -2033634165; i_224_++)
		aShortArray11854[i_224_]
		    = (short) (int) Math.pow(2.0, (double) i_224_);
	}
    }
    
    void method18468() {
	if (anInt11849 * 1158613437 > 0) {
	    aShortArray11847 = new short[anInt11853 * -2033634165];
	    aShortArray11854 = new short[-2033634165 * anInt11853];
	    for (int i = 0; i < anInt11853 * -2033634165; i++) {
		aShortArray11847[i]
		    = (short) (int) (Math.pow((double) ((float) (1158613437
								 * anInt11849)
							/ 4096.0F),
					      (double) i)
				     * 4096.0);
		aShortArray11854[i] = (short) (int) Math.pow(2.0, (double) i);
	    }
	} else if (aShortArray11847 != null
		   && aShortArray11847.length == -2033634165 * anInt11853) {
	    aShortArray11854 = new short[anInt11853 * -2033634165];
	    for (int i = 0; i < anInt11853 * -2033634165; i++)
		aShortArray11854[i] = (short) (int) Math.pow(2.0, (double) i);
	}
    }
    
    void method18469() {
	if (anInt11849 * 1158613437 > 0) {
	    aShortArray11847 = new short[anInt11853 * -2033634165];
	    aShortArray11854 = new short[-2033634165 * anInt11853];
	    for (int i = 0; i < anInt11853 * -2033634165; i++) {
		aShortArray11847[i]
		    = (short) (int) (Math.pow((double) ((float) (1158613437
								 * anInt11849)
							/ 4096.0F),
					      (double) i)
				     * 4096.0);
		aShortArray11854[i] = (short) (int) Math.pow(2.0, (double) i);
	    }
	} else if (aShortArray11847 != null
		   && aShortArray11847.length == -2033634165 * anInt11853) {
	    aShortArray11854 = new short[anInt11853 * -2033634165];
	    for (int i = 0; i < anInt11853 * -2033634165; i++)
		aShortArray11854[i] = (short) (int) Math.pow(2.0, (double) i);
	}
    }
    
    public static int[][] method18470(int i, int i_225_, int i_226_,
				      int i_227_, int i_228_, int i_229_,
				      float f, boolean bool) {
	int[][] is = new int[i_225_][i];
	Class525_Sub40_Sub1 class525_sub40_sub1 = new Class525_Sub40_Sub1();
	class525_sub40_sub1.aBool11855 = bool;
	class525_sub40_sub1.anInt11842 = i_227_ * -111738613;
	class525_sub40_sub1.anInt11852 = i_228_ * 806466245;
	class525_sub40_sub1.anInt11853 = i_229_ * 1547080483;
	class525_sub40_sub1.anInt11849 = -150373995 * (int) (f * 4096.0F);
	class525_sub40_sub1.method18464((byte) 1);
	Class60.method1229(i, i_225_, -249751671);
	for (int i_230_ = 0; i_230_ < i_225_; i_230_++)
	    class525_sub40_sub1.method18457(i_230_, is[i_230_], 2129248617);
	return is;
    }
    
    public static int[] method18471(int i, int i_231_, int i_232_, int i_233_,
				    int i_234_, float f, boolean bool) {
	int[] is = new int[i];
	Class525_Sub40_Sub1 class525_sub40_sub1 = new Class525_Sub40_Sub1();
	class525_sub40_sub1.anInt11848 = 473430349 * i_231_;
	class525_sub40_sub1.aBool11855 = bool;
	class525_sub40_sub1.anInt11842 = -111738613 * i_232_;
	class525_sub40_sub1.anInt11852 = 806466245 * i_233_;
	class525_sub40_sub1.anInt11853 = i_234_ * 1547080483;
	class525_sub40_sub1.anInt11849 = -150373995 * (int) (4096.0F * f);
	class525_sub40_sub1.method18464((byte) 1);
	Class60.method1229(i, 1, 1800089475);
	class525_sub40_sub1.method18457(0, is, 2115373460);
	return is;
    }
    
    void method18472(int i, int[] is) {
	int i_235_ = 1218509837 * anInt11852 * Class60.anIntArray643[i];
	if (1 == -2033634165 * anInt11853) {
	    int i_236_ = aShortArray11847[0];
	    int i_237_ = aShortArray11854[0] << 12;
	    int i_238_ = i_237_ * (1218509837 * anInt11852) >> 12;
	    int i_239_ = i_237_ * (anInt11842 * -831470941) >> 12;
	    int i_240_ = i_237_ * i_235_ >> 12;
	    int i_241_ = i_240_ >> 12;
	    int i_242_ = i_241_ + 1;
	    if (i_242_ >= i_238_)
		i_242_ = 0;
	    i_240_ &= 0xfff;
	    int i_243_ = Class415.anIntArray4421[i_240_];
	    int i_244_ = aByteArray11846[i_241_ & 0xff] & 0xff;
	    int i_245_ = aByteArray11846[i_242_ & 0xff] & 0xff;
	    if (aBool11855) {
		for (int i_246_ = 0; i_246_ < Class60.anInt639 * -262886165;
		     i_246_++) {
		    int i_247_ = (-831470941 * anInt11842
				  * Class60.anIntArray642[i_246_]);
		    int i_248_
			= method18459(i_237_ * i_247_ >> 12, i_240_, i_244_,
				      i_245_, i_243_, i_239_, (byte) -114);
		    i_248_ = i_236_ * i_248_ >> 12;
		    is[i_246_] = (i_248_ >> 1) + 2048;
		}
	    } else {
		for (int i_249_ = 0; i_249_ < Class60.anInt639 * -262886165;
		     i_249_++) {
		    int i_250_ = (anInt11842 * -831470941
				  * Class60.anIntArray642[i_249_]);
		    int i_251_
			= method18459(i_250_ * i_237_ >> 12, i_240_, i_244_,
				      i_245_, i_243_, i_239_, (byte) -126);
		    is[i_249_] = i_251_ * i_236_ >> 12;
		}
	    }
	} else {
	    int i_252_ = aShortArray11847[0];
	    if (i_252_ > 8 || i_252_ < -8) {
		int i_253_ = aShortArray11854[0] << 12;
		int i_254_ = i_253_ * (1218509837 * anInt11852) >> 12;
		int i_255_ = i_253_ * (anInt11842 * -831470941) >> 12;
		int i_256_ = i_235_ * i_253_ >> 12;
		int i_257_ = i_256_ >> 12;
		int i_258_ = i_257_ + 1;
		if (i_258_ >= i_254_)
		    i_258_ = 0;
		i_256_ &= 0xfff;
		int i_259_ = Class415.anIntArray4421[i_256_];
		int i_260_ = aByteArray11846[i_257_ & 0xff] & 0xff;
		int i_261_ = aByteArray11846[i_258_ & 0xff] & 0xff;
		for (int i_262_ = 0; i_262_ < -262886165 * Class60.anInt639;
		     i_262_++) {
		    int i_263_ = (anInt11842 * -831470941
				  * Class60.anIntArray642[i_262_]);
		    int i_264_
			= method18459(i_263_ * i_253_ >> 12, i_256_, i_260_,
				      i_261_, i_259_, i_255_, (byte) -105);
		    is[i_262_] = i_264_ * i_252_ >> 12;
		}
	    }
	    for (int i_265_ = 1; i_265_ < anInt11853 * -2033634165; i_265_++) {
		i_252_ = aShortArray11847[i_265_];
		if (i_252_ > 8 || i_252_ < -8) {
		    int i_266_ = aShortArray11854[i_265_] << 12;
		    int i_267_ = i_266_ * (anInt11852 * 1218509837) >> 12;
		    int i_268_ = i_266_ * (anInt11842 * -831470941) >> 12;
		    int i_269_ = i_235_ * i_266_ >> 12;
		    int i_270_ = i_269_ >> 12;
		    int i_271_ = 1 + i_270_;
		    if (i_271_ >= i_267_)
			i_271_ = 0;
		    i_269_ &= 0xfff;
		    int i_272_ = Class415.anIntArray4421[i_269_];
		    int i_273_ = aByteArray11846[i_270_ & 0xff] & 0xff;
		    int i_274_ = aByteArray11846[i_271_ & 0xff] & 0xff;
		    if (aBool11855 && i_265_ == -2033634165 * anInt11853 - 1) {
			for (int i_275_ = 0;
			     i_275_ < Class60.anInt639 * -262886165;
			     i_275_++) {
			    int i_276_ = (anInt11842 * -831470941
					  * Class60.anIntArray642[i_275_]);
			    int i_277_
				= method18459(i_276_ * i_266_ >> 12, i_269_,
					      i_273_, i_274_, i_272_, i_268_,
					      (byte) -111);
			    i_277_ = is[i_275_] + (i_277_ * i_252_ >> 12);
			    is[i_275_] = (i_277_ >> 1) + 2048;
			}
		    } else {
			for (int i_278_ = 0;
			     i_278_ < Class60.anInt639 * -262886165;
			     i_278_++) {
			    int i_279_ = (-831470941 * anInt11842
					  * Class60.anIntArray642[i_278_]);
			    int i_280_
				= method18459(i_279_ * i_266_ >> 12, i_269_,
					      i_273_, i_274_, i_272_, i_268_,
					      (byte) -59);
			    is[i_278_] += i_252_ * i_280_ >> 12;
			}
		    }
		}
	    }
	}
    }
    
    public static int[][] method18473(int i, int i_281_, int i_282_,
				      int i_283_, int i_284_, int i_285_,
				      float f, boolean bool) {
	int[][] is = new int[i_281_][i];
	Class525_Sub40_Sub1 class525_sub40_sub1 = new Class525_Sub40_Sub1();
	class525_sub40_sub1.aBool11855 = bool;
	class525_sub40_sub1.anInt11842 = i_283_ * -111738613;
	class525_sub40_sub1.anInt11852 = i_284_ * 806466245;
	class525_sub40_sub1.anInt11853 = i_285_ * 1547080483;
	class525_sub40_sub1.anInt11849 = -150373995 * (int) (f * 4096.0F);
	class525_sub40_sub1.method18464((byte) 1);
	Class60.method1229(i, i_281_, -750086998);
	for (int i_286_ = 0; i_286_ < i_281_; i_286_++)
	    class525_sub40_sub1.method18457(i_286_, is[i_286_], 2129652601);
	return is;
    }
}
