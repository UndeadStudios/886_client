/* Class490_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaggl.OpenGL;

public class Class490_Sub3 extends Class490 implements Interface42
{
    int anInt10275;
    float aFloat10276;
    int anInt10277;
    float aFloat10278;
    
    public void method261(int i, int i_0_, int i_1_, int i_2_, int i_3_,
			  int i_4_) {
	aClass182_Sub1_Sub2_5279.method14731(this);
	Class168 class168 = aClass182_Sub1_Sub2_5279.method3566(-2083368015);
	if (class168 != null) {
	    int i_5_ = class168.method2711() - (i_4_ + i_2_);
	    int i_6_ = Class182_Sub1_Sub2.method18120(aClass165_5277,
						      aClass178_5278);
	    OpenGL.glCopyTexImage2D(anInt5276, 0, i_6_, i_3_, i_5_, i_1_, i_2_,
				    0);
	}
    }
    
    public void method232(int i, int i_7_, int i_8_, int i_9_, int[] is,
			  int i_10_, int i_11_) {
	aClass182_Sub1_Sub2_5279.method14731(this);
	OpenGL.glPixelStorei(3314, i_11_);
	OpenGL.glTexSubImage2Di(anInt5276, 0, i, i_7_, i_8_, i_9_, 32993,
				aClass182_Sub1_Sub2_5279.anInt11512, is,
				i_10_);
	OpenGL.glPixelStorei(3314, 0);
    }
    
    Class490_Sub3(Class182_Sub1_Sub2 class182_sub1_sub2, Class165 class165,
		  int i, int i_12_, boolean bool, byte[] is, int i_13_,
		  int i_14_) {
	super(class182_sub1_sub2, 3553, class165, Class178.aClass178_1905,
	      i * i_12_, bool);
	if (!aClass182_Sub1_Sub2_5279.aBool11507) {
	    anInt10277 = Class212.method3935(i, -2056250364);
	    anInt10275 = Class212.method3935(i_12_, -2056250364);
	    aFloat10276 = (float) i / (float) anInt10277;
	    aFloat10278 = (float) i_12_ / (float) anInt10275;
	    if (i != anInt10277 || i_12_ != anInt10275) {
		is = aClass182_Sub1_Sub2_5279.method3176(i, i_12_, anInt10277,
							 anInt10275, is, i_13_,
							 i_14_,
							 (class165.anInt1770
							  * -1998053519),
							 (byte) 6);
		i_13_ = 0;
		i_14_ = anInt10277;
	    }
	} else {
	    anInt10277 = i;
	    anInt10275 = i_12_;
	    aFloat10276 = 1.0F;
	    aFloat10278 = 1.0F;
	}
	aClass182_Sub1_Sub2_5279.method14731(this);
	OpenGL.glPixelStorei(3317, 1);
	if (!bool || i_14_ != 0 || i_13_ != 0) {
	    OpenGL.glPixelStorei(3314, i_14_);
	    if (aClass165_5277 == Class165.aClass165_1778)
		OpenGL.glCompressedTexImage2Dub(anInt5276, 0, 33777, i, i_12_,
						0, i * i_12_ / 2, is, i_13_);
	    else if (aClass165_5277 == Class165.aClass165_1779)
		OpenGL.glCompressedTexImage2Dub(anInt5276, 0, 33779, i, i_12_,
						0, i * i_12_, is, i_13_);
	    else
		OpenGL.glTexImage2Dub
		    (anInt5276, 0,
		     Class182_Sub1_Sub2.method18120(aClass165_5277,
						    aClass178_5278),
		     i, i_12_, 0,
		     Class182_Sub1_Sub2.method18124(aClass165_5277), 5121, is,
		     i_13_);
	    OpenGL.glPixelStorei(3314, 0);
	} else
	    method7960(anInt5276, i, i_12_, is);
	OpenGL.glPixelStorei(3317, 4);
    }
    
    public void method275() {
	super.method276();
    }
    
    public void method270(boolean bool, boolean bool_15_) {
	aClass182_Sub1_Sub2_5279.method14731(this);
	OpenGL.glTexParameteri(anInt5276, 10242, bool ? 10497 : 33071);
	OpenGL.glTexParameteri(anInt5276, 10243, bool_15_ ? 10497 : 33071);
    }
    
    public int method80() {
	return anInt10275;
    }
    
    public float method237() {
	return aFloat10276;
    }
    
    public float method229(float f) {
	return f / (float) anInt10275;
    }
    
    public Interface21 method319(int i) {
	return new Class497(this, i);
    }
    
    public void method258(int i, int i_16_, int i_17_, int i_18_, int[] is,
			  int i_19_) {
	method236(i, i_16_, i_17_, i_18_, is, null, i_19_);
    }
    
    public boolean method210() {
	return true;
    }
    
    public void method231(boolean bool, boolean bool_20_) {
	aClass182_Sub1_Sub2_5279.method14731(this);
	OpenGL.glTexParameteri(anInt5276, 10242, bool ? 10497 : 33071);
	OpenGL.glTexParameteri(anInt5276, 10243, bool_20_ ? 10497 : 33071);
    }
    
    public void method254(int i, int i_21_, int i_22_, int i_23_, int[] is,
			  int[] is_24_, int i_25_) {
	int[] is_26_
	    = is_24_ == null ? new int[anInt10277 * anInt10275] : is_24_;
	aClass182_Sub1_Sub2_5279.method14731(this);
	OpenGL.glGetTexImagei(anInt5276, 0, 32993, 5121, is_26_, 0);
	for (int i_27_ = 0; i_27_ < i_23_; i_27_++)
	    System.arraycopy(is_26_, i_27_ * anInt10277, is,
			     i_25_ + i_27_ * i_22_, i_22_);
    }
    
    public void method238(int i, int i_28_, int i_29_, int i_30_, byte[] is,
			  Class165 class165, int i_31_, int i_32_) {
	aClass182_Sub1_Sub2_5279.method14731(this);
	OpenGL.glPixelStorei(3317, 1);
	OpenGL.glPixelStorei(3314, i_32_);
	OpenGL.glTexSubImage2Dub(anInt5276, 0, i, i_28_, i_29_, i_30_,
				 Class182_Sub1_Sub2.method18124(class165),
				 5121, is, i_31_);
	OpenGL.glPixelStorei(3314, 0);
	OpenGL.glPixelStorei(3317, 4);
    }
    
    public float method247() {
	return aFloat10278;
    }
    
    public void method236(int i, int i_33_, int i_34_, int i_35_, int[] is,
			  int[] is_36_, int i_37_) {
	int[] is_38_
	    = is_36_ == null ? new int[anInt10277 * anInt10275] : is_36_;
	aClass182_Sub1_Sub2_5279.method14731(this);
	OpenGL.glGetTexImagei(anInt5276, 0, 32993, 5121, is_38_, 0);
	for (int i_39_ = 0; i_39_ < i_35_; i_39_++)
	    System.arraycopy(is_38_, i_39_ * anInt10277, is,
			     i_37_ + i_39_ * i_34_, i_34_);
    }
    
    public int method224() {
	return anInt10277;
    }
    
    public Interface21 method322(int i) {
	return new Class497(this, i);
    }
    
    public int method1() {
	return anInt10277;
    }
    
    Class490_Sub3(Class182_Sub1_Sub2 class182_sub1_sub2, Class165 class165,
		  int i, int i_40_, boolean bool, float[] fs, int i_41_,
		  int i_42_) {
	super(class182_sub1_sub2, 3553, class165, Class178.aClass178_1914,
	      i * i_40_, bool);
	if (!aClass182_Sub1_Sub2_5279.aBool11507) {
	    anInt10277 = Class212.method3935(i, -2056250364);
	    anInt10275 = Class212.method3935(i_40_, -2056250364);
	    aFloat10276 = (float) i / (float) anInt10277;
	    aFloat10278 = (float) i_40_ / (float) anInt10275;
	    if (i != anInt10277 || i_40_ != anInt10275) {
		fs = aClass182_Sub1_Sub2_5279.method3398(i, i_40_, anInt10277,
							 anInt10275, fs, i_41_,
							 i_42_,
							 (class165.anInt1770
							  * -1998053519),
							 -1556245213);
		i_41_ = 0;
		i_42_ = anInt10277;
	    }
	} else {
	    anInt10277 = i;
	    anInt10275 = i_40_;
	    aFloat10276 = 1.0F;
	    aFloat10278 = 1.0F;
	}
	aClass182_Sub1_Sub2_5279.method14731(this);
	if (!bool || i_42_ != 0 || i_41_ != 0) {
	    OpenGL.glPixelStorei(3314, i_42_);
	    OpenGL.glTexImage2Df
		(anInt5276, 0,
		 Class182_Sub1_Sub2.method18120(aClass165_5277,
						aClass178_5278),
		 i, i_40_, 0, Class182_Sub1_Sub2.method18124(aClass165_5277),
		 5126, fs, i_41_ * 4);
	    OpenGL.glPixelStorei(3314, 0);
	} else
	    method7982(anInt5276, i, i_40_, fs);
    }
    
    public void method271(Class377 class377) {
	super.method271(class377);
    }
    
    public void method127() {
	super.method127();
    }
    
    public void method126() {
	super.method127();
    }
    
    public void method251(int i, int i_43_, int i_44_, int i_45_, int i_46_,
			  int i_47_) {
	aClass182_Sub1_Sub2_5279.method14731(this);
	Class168 class168 = aClass182_Sub1_Sub2_5279.method3566(-268580419);
	if (class168 != null) {
	    int i_48_ = class168.method2711() - (i_47_ + i_45_);
	    int i_49_ = Class182_Sub1_Sub2.method18120(aClass165_5277,
						       aClass178_5278);
	    OpenGL.glCopyTexImage2D(anInt5276, 0, i_49_, i_46_, i_48_, i_44_,
				    i_45_, 0);
	}
    }
    
    public Interface21 method321(int i) {
	return new Class497(this, i);
    }
    
    public int method234() {
	return anInt10277;
    }
    
    public int method241() {
	return anInt10275;
    }
    
    public int method242() {
	return anInt10275;
    }
    
    public float method243(float f) {
	return f / (float) anInt10277;
    }
    
    public float method244(float f) {
	return f / (float) anInt10275;
    }
    
    public float method245(float f) {
	return f / (float) anInt10275;
    }
    
    public boolean method246() {
	return true;
    }
    
    public void method125() {
	super.method127();
    }
    
    public boolean method248() {
	return true;
    }
    
    public void method249(int i, int i_50_, int i_51_, int i_52_, int[] is,
			  int i_53_, int i_54_) {
	aClass182_Sub1_Sub2_5279.method14731(this);
	OpenGL.glPixelStorei(3314, i_54_);
	OpenGL.glTexSubImage2Di(anInt5276, 0, i, i_50_, i_51_, i_52_, 32993,
				aClass182_Sub1_Sub2_5279.anInt11512, is,
				i_53_);
	OpenGL.glPixelStorei(3314, 0);
    }
    
    public void method267(int i, int i_55_, int i_56_, int i_57_, byte[] is,
			  Class165 class165, int i_58_, int i_59_) {
	aClass182_Sub1_Sub2_5279.method14731(this);
	OpenGL.glPixelStorei(3317, 1);
	OpenGL.glPixelStorei(3314, i_59_);
	OpenGL.glTexSubImage2Dub(anInt5276, 0, i, i_55_, i_56_, i_57_,
				 Class182_Sub1_Sub2.method18124(class165),
				 5121, is, i_58_);
	OpenGL.glPixelStorei(3314, 0);
	OpenGL.glPixelStorei(3317, 4);
    }
    
    public boolean method240() {
	return true;
    }
    
    public void method230(int i, int i_60_, int i_61_, int i_62_, int[] is,
			  int i_63_) {
	method236(i, i_60_, i_61_, i_62_, is, null, i_63_);
    }
    
    public void method252(int i, int i_64_, int i_65_, int i_66_, int[] is,
			  int i_67_) {
	method236(i, i_64_, i_65_, i_66_, is, null, i_67_);
    }
    
    public void method253(int i, int i_68_, int i_69_, int i_70_, int[] is,
			  int[] is_71_, int i_72_) {
	int[] is_73_
	    = is_71_ == null ? new int[anInt10277 * anInt10275] : is_71_;
	aClass182_Sub1_Sub2_5279.method14731(this);
	OpenGL.glGetTexImagei(anInt5276, 0, 32993, 5121, is_73_, 0);
	for (int i_74_ = 0; i_74_ < i_70_; i_74_++)
	    System.arraycopy(is_73_, i_74_ * anInt10277, is,
			     i_72_ + i_74_ * i_69_, i_69_);
    }
    
    public void method272(Class377 class377) {
	super.method271(class377);
    }
    
    public float method250(float f) {
	return f / (float) anInt10277;
    }
    
    public void method256(int i, int i_75_, int i_76_, int i_77_, int[] is,
			  int[] is_78_, int i_79_) {
	int[] is_80_
	    = is_78_ == null ? new int[anInt10277 * anInt10275] : is_78_;
	aClass182_Sub1_Sub2_5279.method14731(this);
	OpenGL.glGetTexImagei(anInt5276, 0, 32993, 5121, is_80_, 0);
	for (int i_81_ = 0; i_81_ < i_77_; i_81_++)
	    System.arraycopy(is_80_, i_81_ * anInt10277, is,
			     i_79_ + i_81_ * i_76_, i_76_);
    }
    
    Class490_Sub3(Class182_Sub1_Sub2 class182_sub1_sub2, Class165 class165,
		  Class178 class178, int i, int i_82_) {
	super(class182_sub1_sub2, 3553, class165, class178, i * i_82_, false);
	if (!aClass182_Sub1_Sub2_5279.aBool11507) {
	    anInt10277 = Class212.method3935(i, -2056250364);
	    anInt10275 = Class212.method3935(i_82_, -2056250364);
	    aFloat10276 = (float) i / (float) anInt10277;
	    aFloat10278 = (float) i_82_ / (float) anInt10275;
	} else {
	    anInt10277 = i;
	    anInt10275 = i_82_;
	    aFloat10276 = 1.0F;
	    aFloat10278 = 1.0F;
	}
	aClass182_Sub1_Sub2_5279.method14731(this);
	OpenGL.glTexImage2Dub(anInt5276, 0,
			      Class182_Sub1_Sub2.method18120(aClass165_5277,
							     aClass178_5278),
			      i, i_82_, 0,
			      Class182_Sub1_Sub2.method18124(aClass165_5277),
			      Class182_Sub1_Sub2.method18109(aClass178_5278),
			      null, 0);
    }
    
    public void method257(int i, int i_83_, int i_84_, int i_85_, int i_86_,
			  int i_87_) {
	aClass182_Sub1_Sub2_5279.method14731(this);
	Class168 class168 = aClass182_Sub1_Sub2_5279.method3566(-461780905);
	if (class168 != null) {
	    int i_88_ = class168.method2711() - (i_87_ + i_85_);
	    int i_89_ = Class182_Sub1_Sub2.method18120(aClass165_5277,
						       aClass178_5278);
	    OpenGL.glCopyTexImage2D(anInt5276, 0, i_89_, i_86_, i_88_, i_84_,
				    i_85_, 0);
	}
    }
    
    public void method259(int i, int i_90_, int i_91_, int i_92_, int i_93_,
			  int i_94_) {
	aClass182_Sub1_Sub2_5279.method14731(this);
	Class168 class168 = aClass182_Sub1_Sub2_5279.method3566(-290283344);
	if (class168 != null) {
	    int i_95_ = class168.method2711() - (i_94_ + i_92_);
	    int i_96_ = Class182_Sub1_Sub2.method18120(aClass165_5277,
						       aClass178_5278);
	    OpenGL.glCopyTexImage2D(anInt5276, 0, i_96_, i_93_, i_95_, i_91_,
				    i_92_, 0);
	}
    }
    
    public void method263(int i, int i_97_, int i_98_, int i_99_, int i_100_,
			  int i_101_) {
	aClass182_Sub1_Sub2_5279.method14731(this);
	Class168 class168 = aClass182_Sub1_Sub2_5279.method3566(-2119846732);
	if (class168 != null) {
	    int i_102_ = class168.method2711() - (i_101_ + i_99_);
	    int i_103_ = Class182_Sub1_Sub2.method18120(aClass165_5277,
							aClass178_5278);
	    OpenGL.glCopyTexImage2D(anInt5276, 0, i_103_, i_100_, i_102_,
				    i_98_, i_99_, 0);
	}
    }
    
    public boolean method268() {
	return super.method239();
    }
    
    public float method262() {
	return aFloat10276;
    }
    
    public void method260(int i, int i_104_, int i_105_, int i_106_,
			  int i_107_, int i_108_) {
	aClass182_Sub1_Sub2_5279.method14731(this);
	Class168 class168 = aClass182_Sub1_Sub2_5279.method3566(446842364);
	if (class168 != null) {
	    int i_109_ = class168.method2711() - (i_108_ + i_106_);
	    int i_110_ = Class182_Sub1_Sub2.method18120(aClass165_5277,
							aClass178_5278);
	    OpenGL.glCopyTexImage2D(anInt5276, 0, i_110_, i_107_, i_109_,
				    i_105_, i_106_, 0);
	}
    }
    
    public float method264() {
	return aFloat10276;
    }
    
    public float method265() {
	return aFloat10278;
    }
    
    public void method276() {
	super.method276();
    }
    
    public boolean method228() {
	return super.method239();
    }
    
    Class490_Sub3(Class182_Sub1_Sub2 class182_sub1_sub2, int i, int i_111_,
		  boolean bool, int[] is, int i_112_, int i_113_) {
	super(class182_sub1_sub2, 3553, Class165.aClass165_1771,
	      Class178.aClass178_1905, i * i_111_, bool);
	if (!aClass182_Sub1_Sub2_5279.aBool11507) {
	    anInt10277 = Class212.method3935(i, -2056250364);
	    anInt10275 = Class212.method3935(i_111_, -2056250364);
	    aFloat10276 = (float) i / (float) anInt10277;
	    aFloat10278 = (float) i_111_ / (float) anInt10275;
	    if (i != anInt10277 || i_111_ != anInt10275) {
		is = aClass182_Sub1_Sub2_5279.method3266(i, i_111_, anInt10277,
							 anInt10275, is,
							 i_112_, i_113_,
							 1777471944);
		i_112_ = 0;
		i_113_ = anInt10277;
	    }
	} else {
	    anInt10277 = i;
	    anInt10275 = i_111_;
	    aFloat10276 = 1.0F;
	    aFloat10278 = 1.0F;
	}
	aClass182_Sub1_Sub2_5279.method14731(this);
	if (!bool || i_113_ != 0 || i_112_ != 0) {
	    OpenGL.glPixelStorei(3314, i_113_);
	    OpenGL.glTexImage2Di(anInt5276, 0, 6408, anInt10277, anInt10275, 0,
				 32993, aClass182_Sub1_Sub2_5279.anInt11512,
				 is, i_112_ * 4);
	    OpenGL.glPixelStorei(3314, 0);
	} else
	    method7963(anInt5276, i, i_111_, is);
    }
    
    public boolean method269() {
	return super.method239();
    }
    
    public void method274() {
	super.method276();
    }
    
    public boolean method239() {
	return super.method239();
    }
    
    public void method273(Class377 class377) {
	super.method271(class377);
    }
    
    public float method235() {
	return aFloat10278;
    }
    
    public void method277(Class377 class377) {
	super.method271(class377);
    }
    
    public void method278(Class377 class377) {
	super.method271(class377);
    }
    
    public void method233(int i, int i_114_, int i_115_, int i_116_, byte[] is,
			  Class165 class165, int i_117_, int i_118_) {
	aClass182_Sub1_Sub2_5279.method14731(this);
	OpenGL.glPixelStorei(3317, 1);
	OpenGL.glPixelStorei(3314, i_118_);
	OpenGL.glTexSubImage2Dub(anInt5276, 0, i, i_114_, i_115_, i_116_,
				 Class182_Sub1_Sub2.method18124(class165),
				 5121, is, i_117_);
	OpenGL.glPixelStorei(3314, 0);
	OpenGL.glPixelStorei(3317, 4);
    }
    
    public Interface21 method320(int i) {
	return new Class497(this, i);
    }
    
    public void method255(int i, int i_119_, int i_120_, int i_121_, int[] is,
			  int[] is_122_, int i_123_) {
	int[] is_124_
	    = is_122_ == null ? new int[anInt10277 * anInt10275] : is_122_;
	aClass182_Sub1_Sub2_5279.method14731(this);
	OpenGL.glGetTexImagei(anInt5276, 0, 32993, 5121, is_124_, 0);
	for (int i_125_ = 0; i_125_ < i_121_; i_125_++)
	    System.arraycopy(is_124_, i_125_ * anInt10277, is,
			     i_123_ + i_125_ * i_120_, i_120_);
    }
    
    public float method266() {
	return aFloat10276;
    }
}
