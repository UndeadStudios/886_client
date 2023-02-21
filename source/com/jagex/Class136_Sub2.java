/* Class136_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaggl.OpenGL;

public class Class136_Sub2 extends Class136
{
    int anInt8922;
    int anInt8923;
    
    Interface21 method14472(int i) {
	return new Class153(this, i);
    }
    
    Class136_Sub2(Class182_Sub3 class182_sub3, int i, int i_0_, int i_1_,
		  int i_2_, int i_3_) {
	super(class182_sub3, i, Class165.aClass165_1775,
	      Class178.aClass178_1905, i_2_ * i_3_, false);
	anInt8922 = i_2_;
	anInt8923 = i_3_;
	aClass182_Sub3_1617.method15395(this);
	Class168 class168 = aClass182_Sub3_1617.method3566(-974931003);
	if (class168 != null) {
	    int i_4_ = class168.method2711() - (i_1_ + i_3_);
	    int i_5_
		= Class182_Sub3.method15534(aClass165_1624, aClass178_1627);
	    OpenGL.glCopyTexImage2D(anInt1625, 0, i_5_, i_0_, i_4_, i_2_, i_3_,
				    0);
	}
	method2304(true);
    }
    
    void method14473(int i, int i_6_, int i_7_, int i_8_, byte[] is,
		     Class165 class165, int i_9_, int i_10_, boolean bool) {
	if (i_10_ == 0)
	    i_10_ = i_7_;
	if (bool) {
	    int i_11_ = class165.anInt1770 * -1998053519;
	    int i_12_ = i_11_ * i_7_;
	    int i_13_ = i_11_ * i_10_;
	    byte[] is_14_ = new byte[i_12_ * i_8_];
	    for (int i_15_ = 0; i_15_ < i_8_; i_15_++) {
		int i_16_ = i_15_ * i_12_;
		int i_17_ = (i_8_ - i_15_ - 1) * i_13_ + i_9_;
		for (int i_18_ = 0; i_18_ < i_12_; i_18_++)
		    is_14_[i_16_++] = is[i_17_++];
	    }
	    is = is_14_;
	}
	aClass182_Sub3_1617.method15395(this);
	OpenGL.glPixelStorei(3317, 1);
	if (i_10_ != i_7_)
	    OpenGL.glPixelStorei(3314, i_10_);
	OpenGL.glTexSubImage2Dub(anInt1625, 0, i, anInt8923 - i_6_ - i_8_,
				 i_7_, i_8_,
				 Class182_Sub3.method15421(class165), 5121, is,
				 i_9_);
	if (i_10_ != i_7_)
	    OpenGL.glPixelStorei(3314, 0);
	OpenGL.glPixelStorei(3317, 4);
    }
    
    Class136_Sub2(Class182_Sub3 class182_sub3, int i, Class165 class165,
		  Class178 class178, int i_19_, int i_20_, boolean bool,
		  byte[] is, Class165 class165_21_, boolean bool_22_) {
	super(class182_sub3, i, class165, class178, i_19_ * i_20_, bool);
	anInt8922 = i_19_;
	anInt8923 = i_20_;
	if (bool_22_) {
	    byte[] is_23_ = new byte[is.length];
	    for (int i_24_ = 0; i_24_ < i_20_; i_24_++) {
		int i_25_ = i_24_ * i_19_;
		int i_26_ = (i_20_ - i_24_ - 1) * i_19_;
		for (int i_27_ = 0; i_27_ < i_19_; i_27_++)
		    is_23_[i_25_++] = is[i_26_++];
	    }
	    is = is_23_;
	}
	aClass182_Sub3_1617.method15395(this);
	OpenGL.glPixelStorei(3317, 1);
	if (bool && anInt1625 != 34037) {
	    method2314(i,
		       Class182_Sub3.method15534(aClass165_1624,
						 aClass178_1627),
		       i_19_, i_20_, class165_21_, is);
	    method2303(true);
	} else {
	    OpenGL.glTexImage2Dub(anInt1625, 0,
				  Class182_Sub3.method15534(aClass165_1624,
							    aClass178_1627),
				  anInt8922, anInt8923, 0,
				  Class182_Sub3.method15421(class165_21_),
				  5121, is, 0);
	    method2303(false);
	}
	OpenGL.glPixelStorei(3317, 4);
	method2304(true);
    }
    
    Class136_Sub2(Class182_Sub3 class182_sub3, int i, Class165 class165,
		  Class178 class178, int i_28_, int i_29_) {
	super(class182_sub3, i, class165, class178, i_28_ * i_29_, false);
	anInt8922 = i_28_;
	anInt8923 = i_29_;
	aClass182_Sub3_1617.method15395(this);
	OpenGL.glTexImage2Dub(anInt1625, 0,
			      Class182_Sub3.method15534(aClass165_1624,
							aClass178_1627),
			      i_28_, i_29_, 0,
			      Class182_Sub3.method15421(aClass165_1624), 5121,
			      null, 0);
	method2304(true);
    }
    
    void method14474(boolean bool, boolean bool_30_) {
	if (anInt1625 == 3553) {
	    aClass182_Sub3_1617.method15395(this);
	    OpenGL.glTexParameteri(anInt1625, 10242, bool ? 10497 : 33071);
	    OpenGL.glTexParameteri(anInt1625, 10243, bool_30_ ? 10497 : 33071);
	}
    }
    
    void method14475(int i, int i_31_, int i_32_, int i_33_, byte[] is,
		     Class165 class165, int i_34_, int i_35_, boolean bool) {
	if (i_35_ == 0)
	    i_35_ = i_32_;
	if (bool) {
	    int i_36_ = class165.anInt1770 * -1998053519;
	    int i_37_ = i_36_ * i_32_;
	    int i_38_ = i_36_ * i_35_;
	    byte[] is_39_ = new byte[i_37_ * i_33_];
	    for (int i_40_ = 0; i_40_ < i_33_; i_40_++) {
		int i_41_ = i_40_ * i_37_;
		int i_42_ = (i_33_ - i_40_ - 1) * i_38_ + i_34_;
		for (int i_43_ = 0; i_43_ < i_37_; i_43_++)
		    is_39_[i_41_++] = is[i_42_++];
	    }
	    is = is_39_;
	}
	aClass182_Sub3_1617.method15395(this);
	OpenGL.glPixelStorei(3317, 1);
	if (i_35_ != i_32_)
	    OpenGL.glPixelStorei(3314, i_35_);
	OpenGL.glTexSubImage2Dub(anInt1625, 0, i, anInt8923 - i_31_ - i_33_,
				 i_32_, i_33_,
				 Class182_Sub3.method15421(class165), 5121, is,
				 i_34_);
	if (i_35_ != i_32_)
	    OpenGL.glPixelStorei(3314, 0);
	OpenGL.glPixelStorei(3317, 4);
    }
    
    Class136_Sub2(Class182_Sub3 class182_sub3, int i, int i_44_, int i_45_,
		  boolean bool, int[] is, int i_46_, int i_47_,
		  boolean bool_48_) {
	super(class182_sub3, i, Class165.aClass165_1771,
	      Class178.aClass178_1905, i_44_ * i_45_, bool);
	anInt8922 = i_44_;
	anInt8923 = i_45_;
	if (bool_48_) {
	    int[] is_49_ = new int[is.length];
	    for (int i_50_ = 0; i_50_ < i_45_; i_50_++) {
		int i_51_ = i_50_ * i_44_;
		int i_52_ = (i_45_ - i_50_ - 1) * i_44_;
		for (int i_53_ = 0; i_53_ < i_44_; i_53_++)
		    is_49_[i_51_++] = is[i_52_++];
	    }
	    is = is_49_;
	}
	aClass182_Sub3_1617.method15395(this);
	if (anInt1625 == 34037 || !bool || i_46_ != 0 || i_47_ != 0) {
	    OpenGL.glPixelStorei(3314, i_46_);
	    OpenGL.glTexImage2Di(anInt1625, 0,
				 Class182_Sub3.method15534(aClass165_1624,
							   aClass178_1627),
				 anInt8922, anInt8923, 0, 32993,
				 aClass182_Sub3_1617.anInt9817, is, i_47_ * 4);
	    OpenGL.glPixelStorei(3314, 0);
	    method2303(false);
	} else {
	    method2313(anInt1625,
		       Class182_Sub3.method15534(aClass165_1624,
						 aClass178_1627),
		       anInt8922, anInt8923, 32993,
		       aClass182_Sub3_1617.anInt9817, is);
	    method2303(true);
	}
	method2304(true);
    }
    
    void method14476(int i, int i_54_, int i_55_, int i_56_, int[] is,
		     int[] is_57_, int i_58_) {
	int[] is_59_
	    = is_57_ == null ? new int[anInt8922 * anInt8923] : is_57_;
	aClass182_Sub3_1617.method15395(this);
	OpenGL.glGetTexImagei(anInt1625, 0, 32993, 5121, is_59_, 0);
	for (int i_60_ = 0; i_60_ < i_56_; i_60_++)
	    System.arraycopy(is_59_, (i_54_ + (i_56_ - 1) - i_60_) * anInt8922,
			     is, i_58_ + i_60_ * i_55_, i_55_);
    }
    
    void method14477(boolean bool, boolean bool_61_) {
	if (anInt1625 == 3553) {
	    aClass182_Sub3_1617.method15395(this);
	    OpenGL.glTexParameteri(anInt1625, 10242, bool ? 10497 : 33071);
	    OpenGL.glTexParameteri(anInt1625, 10243, bool_61_ ? 10497 : 33071);
	}
    }
    
    Interface22 method14478(int i) {
	return new Class153(this, i);
    }
    
    Interface21 method14479(int i) {
	return new Class153(this, i);
    }
    
    void method14480(boolean bool, boolean bool_62_) {
	if (anInt1625 == 3553) {
	    aClass182_Sub3_1617.method15395(this);
	    OpenGL.glTexParameteri(anInt1625, 10242, bool ? 10497 : 33071);
	    OpenGL.glTexParameteri(anInt1625, 10243, bool_62_ ? 10497 : 33071);
	}
    }
    
    Class136_Sub2(Class182_Sub3 class182_sub3, int i, Class165 class165,
		  Class178 class178, int i_63_, int i_64_, boolean bool,
		  float[] fs, Class165 class165_65_) {
	super(class182_sub3, i, class165, class178, i_63_ * i_64_, bool);
	anInt8922 = i_63_;
	anInt8923 = i_64_;
	aClass182_Sub3_1617.method15395(this);
	if (bool && anInt1625 != 34037) {
	    method2315(i,
		       Class182_Sub3.method15534(aClass165_1624,
						 aClass178_1627),
		       i_63_, i_64_, class165_65_, fs);
	    method2303(true);
	} else {
	    OpenGL.glTexImage2Df(anInt1625, 0,
				 Class182_Sub3.method15534(aClass165_1624,
							   aClass178_1627),
				 anInt8922, anInt8923, 0,
				 Class182_Sub3.method15421(class165_65_), 5126,
				 fs, 0);
	    method2303(false);
	}
	method2304(true);
    }
    
    void method14481(boolean bool, boolean bool_66_) {
	if (anInt1625 == 3553) {
	    aClass182_Sub3_1617.method15395(this);
	    OpenGL.glTexParameteri(anInt1625, 10242, bool ? 10497 : 33071);
	    OpenGL.glTexParameteri(anInt1625, 10243, bool_66_ ? 10497 : 33071);
	}
    }
    
    void method14482(int i, int i_67_, int i_68_, int i_69_, byte[] is,
		     Class165 class165, int i_70_, int i_71_, boolean bool) {
	if (i_71_ == 0)
	    i_71_ = i_68_;
	if (bool) {
	    int i_72_ = class165.anInt1770 * -1998053519;
	    int i_73_ = i_72_ * i_68_;
	    int i_74_ = i_72_ * i_71_;
	    byte[] is_75_ = new byte[i_73_ * i_69_];
	    for (int i_76_ = 0; i_76_ < i_69_; i_76_++) {
		int i_77_ = i_76_ * i_73_;
		int i_78_ = (i_69_ - i_76_ - 1) * i_74_ + i_70_;
		for (int i_79_ = 0; i_79_ < i_73_; i_79_++)
		    is_75_[i_77_++] = is[i_78_++];
	    }
	    is = is_75_;
	}
	aClass182_Sub3_1617.method15395(this);
	OpenGL.glPixelStorei(3317, 1);
	if (i_71_ != i_68_)
	    OpenGL.glPixelStorei(3314, i_71_);
	OpenGL.glTexSubImage2Dub(anInt1625, 0, i, anInt8923 - i_67_ - i_69_,
				 i_68_, i_69_,
				 Class182_Sub3.method15421(class165), 5121, is,
				 i_70_);
	if (i_71_ != i_68_)
	    OpenGL.glPixelStorei(3314, 0);
	OpenGL.glPixelStorei(3317, 4);
    }
    
    void method14483(int i, int i_80_, int i_81_, int i_82_, byte[] is,
		     Class165 class165, int i_83_, int i_84_, boolean bool) {
	if (i_84_ == 0)
	    i_84_ = i_81_;
	if (bool) {
	    int i_85_ = class165.anInt1770 * -1998053519;
	    int i_86_ = i_85_ * i_81_;
	    int i_87_ = i_85_ * i_84_;
	    byte[] is_88_ = new byte[i_86_ * i_82_];
	    for (int i_89_ = 0; i_89_ < i_82_; i_89_++) {
		int i_90_ = i_89_ * i_86_;
		int i_91_ = (i_82_ - i_89_ - 1) * i_87_ + i_83_;
		for (int i_92_ = 0; i_92_ < i_86_; i_92_++)
		    is_88_[i_90_++] = is[i_91_++];
	    }
	    is = is_88_;
	}
	aClass182_Sub3_1617.method15395(this);
	OpenGL.glPixelStorei(3317, 1);
	if (i_84_ != i_81_)
	    OpenGL.glPixelStorei(3314, i_84_);
	OpenGL.glTexSubImage2Dub(anInt1625, 0, i, anInt8923 - i_80_ - i_82_,
				 i_81_, i_82_,
				 Class182_Sub3.method15421(class165), 5121, is,
				 i_83_);
	if (i_84_ != i_81_)
	    OpenGL.glPixelStorei(3314, 0);
	OpenGL.glPixelStorei(3317, 4);
    }
    
    void method14484(int i, int i_93_, int i_94_, int i_95_, byte[] is,
		     Class165 class165, int i_96_, int i_97_, boolean bool) {
	if (i_97_ == 0)
	    i_97_ = i_94_;
	if (bool) {
	    int i_98_ = class165.anInt1770 * -1998053519;
	    int i_99_ = i_98_ * i_94_;
	    int i_100_ = i_98_ * i_97_;
	    byte[] is_101_ = new byte[i_99_ * i_95_];
	    for (int i_102_ = 0; i_102_ < i_95_; i_102_++) {
		int i_103_ = i_102_ * i_99_;
		int i_104_ = (i_95_ - i_102_ - 1) * i_100_ + i_96_;
		for (int i_105_ = 0; i_105_ < i_99_; i_105_++)
		    is_101_[i_103_++] = is[i_104_++];
	    }
	    is = is_101_;
	}
	aClass182_Sub3_1617.method15395(this);
	OpenGL.glPixelStorei(3317, 1);
	if (i_97_ != i_94_)
	    OpenGL.glPixelStorei(3314, i_97_);
	OpenGL.glTexSubImage2Dub(anInt1625, 0, i, anInt8923 - i_93_ - i_95_,
				 i_94_, i_95_,
				 Class182_Sub3.method15421(class165), 5121, is,
				 i_96_);
	if (i_97_ != i_94_)
	    OpenGL.glPixelStorei(3314, 0);
	OpenGL.glPixelStorei(3317, 4);
    }
    
    void method14485(int i, int i_106_, int i_107_, int i_108_, int[] is,
		     int i_109_, int i_110_, boolean bool) {
	if (i_110_ == 0)
	    i_110_ = i_107_;
	if (bool) {
	    int[] is_111_ = new int[i_107_ * i_108_];
	    for (int i_112_ = 0; i_112_ < i_108_; i_112_++) {
		int i_113_ = i_112_ * i_107_;
		int i_114_ = (i_108_ - i_112_ - 1) * i_110_ + i_109_;
		for (int i_115_ = 0; i_115_ < i_107_; i_115_++)
		    is_111_[i_113_++] = is[i_114_++];
	    }
	    is = is_111_;
	}
	aClass182_Sub3_1617.method15395(this);
	if (i_107_ != i_110_)
	    OpenGL.glPixelStorei(3314, i_110_);
	OpenGL.glTexSubImage2Di(anInt1625, 0, i, anInt8923 - i_106_ - i_108_,
				i_107_, i_108_, 32993,
				aClass182_Sub3_1617.anInt9817, is, i_109_);
	if (i_107_ != i_110_)
	    OpenGL.glPixelStorei(3314, 0);
    }
    
    void method14486(int i, int i_116_, int i_117_, int i_118_, int[] is,
		     int i_119_, int i_120_, boolean bool) {
	if (i_120_ == 0)
	    i_120_ = i_117_;
	if (bool) {
	    int[] is_121_ = new int[i_117_ * i_118_];
	    for (int i_122_ = 0; i_122_ < i_118_; i_122_++) {
		int i_123_ = i_122_ * i_117_;
		int i_124_ = (i_118_ - i_122_ - 1) * i_120_ + i_119_;
		for (int i_125_ = 0; i_125_ < i_117_; i_125_++)
		    is_121_[i_123_++] = is[i_124_++];
	    }
	    is = is_121_;
	}
	aClass182_Sub3_1617.method15395(this);
	if (i_117_ != i_120_)
	    OpenGL.glPixelStorei(3314, i_120_);
	OpenGL.glTexSubImage2Di(anInt1625, 0, i, anInt8923 - i_116_ - i_118_,
				i_117_, i_118_, 32993,
				aClass182_Sub3_1617.anInt9817, is, i_119_);
	if (i_117_ != i_120_)
	    OpenGL.glPixelStorei(3314, 0);
    }
    
    void method14487(int i, int i_126_, int i_127_, int i_128_, int[] is,
		     int i_129_, int i_130_, boolean bool) {
	if (i_130_ == 0)
	    i_130_ = i_127_;
	if (bool) {
	    int[] is_131_ = new int[i_127_ * i_128_];
	    for (int i_132_ = 0; i_132_ < i_128_; i_132_++) {
		int i_133_ = i_132_ * i_127_;
		int i_134_ = (i_128_ - i_132_ - 1) * i_130_ + i_129_;
		for (int i_135_ = 0; i_135_ < i_127_; i_135_++)
		    is_131_[i_133_++] = is[i_134_++];
	    }
	    is = is_131_;
	}
	aClass182_Sub3_1617.method15395(this);
	if (i_127_ != i_130_)
	    OpenGL.glPixelStorei(3314, i_130_);
	OpenGL.glTexSubImage2Di(anInt1625, 0, i, anInt8923 - i_126_ - i_128_,
				i_127_, i_128_, 32993,
				aClass182_Sub3_1617.anInt9817, is, i_129_);
	if (i_127_ != i_130_)
	    OpenGL.glPixelStorei(3314, 0);
    }
    
    void method14488(int i, int i_136_, int i_137_, int i_138_, int[] is,
		     int[] is_139_, int i_140_) {
	int[] is_141_
	    = is_139_ == null ? new int[anInt8922 * anInt8923] : is_139_;
	aClass182_Sub3_1617.method15395(this);
	OpenGL.glGetTexImagei(anInt1625, 0, 32993, 5121, is_141_, 0);
	for (int i_142_ = 0; i_142_ < i_138_; i_142_++)
	    System.arraycopy(is_141_,
			     (i_136_ + (i_138_ - 1) - i_142_) * anInt8922, is,
			     i_140_ + i_142_ * i_137_, i_137_);
    }
    
    void method14489(int i, int i_143_, int i_144_, int i_145_, int i_146_,
		     int i_147_) {
	Class168 class168 = aClass182_Sub3_1617.method3566(109537427);
	if (class168 != null) {
	    int i_148_ = class168.method2711() - (i_147_ + i_145_);
	    aClass182_Sub3_1617.method15395(this);
	    OpenGL.glCopyTexSubImage2D(anInt1625, 0, i,
				       anInt8923 - (i_143_ + i_145_), i_146_,
				       i_148_, i_144_, i_145_);
	    OpenGL.glFlush();
	}
    }
    
    void method14490(int i, int i_149_, int i_150_, int i_151_, int i_152_,
		     int i_153_) {
	Class168 class168 = aClass182_Sub3_1617.method3566(-1084841767);
	if (class168 != null) {
	    int i_154_ = class168.method2711() - (i_153_ + i_151_);
	    aClass182_Sub3_1617.method15395(this);
	    OpenGL.glCopyTexSubImage2D(anInt1625, 0, i,
				       anInt8923 - (i_149_ + i_151_), i_152_,
				       i_154_, i_150_, i_151_);
	    OpenGL.glFlush();
	}
    }
    
    Interface22 method14491(int i) {
	return new Class153(this, i);
    }
    
    void method14492(int i, int i_155_, int i_156_, int i_157_, int i_158_,
		     int i_159_) {
	Class168 class168 = aClass182_Sub3_1617.method3566(-1428670854);
	if (class168 != null) {
	    int i_160_ = class168.method2711() - (i_159_ + i_157_);
	    aClass182_Sub3_1617.method15395(this);
	    OpenGL.glCopyTexSubImage2D(anInt1625, 0, i,
				       anInt8923 - (i_155_ + i_157_), i_158_,
				       i_160_, i_156_, i_157_);
	    OpenGL.glFlush();
	}
    }
}
