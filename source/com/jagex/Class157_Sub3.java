/* Class157_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class157_Sub3 extends Class157
{
    int anInt9449;
    boolean aBool9450;
    Interface21 anInterface21_9451;
    int anInt9452;
    boolean aBool9453;
    boolean aBool9454 = false;
    int anInt9455 = 0;
    Class182_Sub1 aClass182_Sub1_9456;
    int anInt9457;
    int anInt9458;
    boolean aBool9459;
    boolean aBool9460;
    Interface38 anInterface38_9461;
    int anInt9462 = 0;
    
    public void method2480(int i, int i_0_, Class152 class152, int i_1_,
			   int i_2_) {
	aClass182_Sub1_9456.method14752();
	Class312 class312 = aClass182_Sub1_9456.aClass312_9249;
	class312.anInterface38_3481 = anInterface38_9461;
	class312.method5634(1, -1);
	i += anInt9462;
	i_0_ += anInt9455;
	float f
	    = (float) aClass182_Sub1_9456.method3566(460498651).method2710();
	float f_3_
	    = (float) aClass182_Sub1_9456.method3566(-1565734184).method2711();
	class312.aClass435_3476.method6954((float) anInt9452 * 2.0F / f,
					   (float) anInt9449 * 2.0F / f_3_,
					   1.0F, 1.0F);
	class312.aClass435_3476.aFloatArray4830[12]
	    = (((float) i + aClass182_Sub1_9456.method14674()) * 2.0F / f
	       - 1.0F);
	class312.aClass435_3476.aFloatArray4830[13]
	    = (((float) i_0_ + aClass182_Sub1_9456.method14674()) * 2.0F / f_3_
	       - 1.0F);
	class312.aClass435_3476.aFloatArray4830[14] = -1.0F;
	class312.aClass435_3477.method6954(anInterface38_9461
					       .method250((float) anInt9452),
					   anInterface38_9461
					       .method229((float) anInt9449),
					   1.0F, 1.0F);
	class312.anInterface35_3479 = aClass182_Sub1_9456.anInterface35_9311;
	class312.anInt3473 = 0;
	class312.aClass337_3480 = aClass182_Sub1_9456.aClass337_9261;
	Interface38 interface38
	    = ((Class152_Sub3) class152).anInterface38_9884;
	class312.anInterface38_3475 = interface38;
	class312.aClass435_3474.method6954(interface38
					       .method250((float) anInt9452),
					   interface38
					       .method229((float) anInt9449),
					   1.0F, 1.0F);
	class312.aClass435_3474.aFloatArray4830[12]
	    = interface38.method250((float) (i - i_1_));
	class312.aClass435_3474.aFloatArray4830[13]
	    = interface38.method229((float) (i_0_ - i_2_));
	class312.method5633();
    }
    
    Class157_Sub3(Class182_Sub1 class182_sub1, int i, int i_4_, int[] is,
		  int i_5_, int i_6_) {
	anInt9457 = 0;
	anInt9458 = 0;
	aClass182_Sub1_9456 = class182_sub1;
	anInt9452 = i;
	anInt9449 = i_4_;
	anInterface21_9451 = null;
	anInterface38_9461
	    = class182_sub1.method14726(i, i_4_, false, is, i_5_, i_6_);
	anInterface38_9461.method231(true, true);
	aBool9459 = anInterface38_9461.method1() != i;
	aBool9460 = anInterface38_9461.method80() != i_4_;
	aBool9453 = !aBool9459 && anInterface38_9461.method210();
	aBool9450 = !aBool9460 && anInterface38_9461.method210();
    }
    
    Class157_Sub3(Class182_Sub1 class182_sub1, Interface38 interface38) {
	this(class182_sub1, interface38, interface38.method1(),
	     interface38.method80());
    }
    
    Class157_Sub3(Class182_Sub1 class182_sub1, Interface38 interface38, int i,
		  int i_7_) {
	anInt9457 = 0;
	anInt9458 = 0;
	aClass182_Sub1_9456 = class182_sub1;
	anInt9452 = i;
	anInt9449 = i_7_;
	anInterface38_9461 = interface38;
	anInterface21_9451 = null;
	aBool9459 = anInterface38_9461.method1() != i;
	aBool9460 = anInterface38_9461.method80() != i_7_;
	aBool9453 = !aBool9459 && anInterface38_9461.method210();
	aBool9450 = !aBool9460 && anInterface38_9461.method210();
    }
    
    public void method2540(int i, int i_8_, int i_9_, int i_10_, int i_11_,
			   int i_12_) {
	anInterface38_9461.method251(i, i_8_, i_9_, i_10_, i_11_, i_12_);
    }
    
    public void method2477(int i, int i_13_, int i_14_) {
	int[] is
	    = aClass182_Sub1_9456.method3165(i, i_13_, anInt9452, anInt9449);
	int[] is_15_ = new int[anInt9452 * anInt9449];
	anInterface38_9461.method258(0, 0, anInt9452, anInt9449, is_15_, 0);
	if (i_14_ == 0) {
	    for (int i_16_ = 0; i_16_ < anInt9449; i_16_++) {
		int i_17_ = i_16_ * anInt9452;
		for (int i_18_ = 0; i_18_ < anInt9452; i_18_++)
		    is_15_[i_17_ + i_18_]
			= (is_15_[i_17_ + i_18_] & 0xffffff
			   | is[i_17_ + i_18_] << 8 & ~0xffffff);
	    }
	} else if (i_14_ == 1) {
	    for (int i_19_ = 0; i_19_ < anInt9449; i_19_++) {
		int i_20_ = i_19_ * anInt9452;
		for (int i_21_ = 0; i_21_ < anInt9452; i_21_++)
		    is_15_[i_20_ + i_21_]
			= (is_15_[i_20_ + i_21_] & 0xffffff
			   | is[i_20_ + i_21_] << 16 & ~0xffffff);
	    }
	} else if (i_14_ == 2) {
	    for (int i_22_ = 0; i_22_ < anInt9449; i_22_++) {
		int i_23_ = i_22_ * anInt9452;
		for (int i_24_ = 0; i_24_ < anInt9452; i_24_++)
		    is_15_[i_23_ + i_24_]
			= (is_15_[i_23_ + i_24_] & 0xffffff
			   | is[i_23_ + i_24_] << 24 & ~0xffffff);
	    }
	} else if (i_14_ == 3) {
	    for (int i_25_ = 0; i_25_ < anInt9449; i_25_++) {
		int i_26_ = i_25_ * anInt9452;
		for (int i_27_ = 0; i_27_ < anInt9452; i_27_++)
		    is_15_[i_26_ + i_27_]
			= (is_15_[i_26_ + i_27_] & 0xffffff
			   | (is[i_26_ + i_27_] != 0 ? -16777216 : 0));
	    }
	}
	method2474(0, 0, anInt9452, anInt9449, is_15_, 0, anInt9452);
    }
    
    public void method2468(int i, int i_28_, int i_29_, int i_30_) {
	anInt9462 = i;
	anInt9455 = i_28_;
	anInt9458 = i_29_;
	anInt9457 = i_30_;
	aBool9454 = (anInt9462 != 0 || anInt9455 != 0 || anInt9458 != 0
		     || anInt9457 != 0);
    }
    
    public void method2469(int[] is) {
	is[0] = anInt9462;
	is[1] = anInt9455;
	is[2] = anInt9458;
	is[3] = anInt9457;
    }
    
    public int method2503() {
	return anInt9452;
    }
    
    void method2508(int i, int i_31_, int i_32_, int i_33_, int i_34_,
		    int i_35_, int i_36_, int i_37_) {
	if (aClass182_Sub1_9456.method14675() != Class348.aClass348_3732) {
	    if (aBool9454) {
		i_32_ = i_32_ * anInt9452 / method12();
		i_33_ = i_33_ * anInt9449 / method2472();
		i += anInt9462 * i_32_ / anInt9452;
		i_31_ += anInt9455 * i_33_ / anInt9449;
	    }
	    aClass182_Sub1_9456.aClass360_9259.method6274
		((float) i, (float) i_31_, (float) (i + i_32_),
		 (float) (i_31_ + i_33_), anInterface38_9461.method250(0.0F),
		 anInterface38_9461.method229(0.0F),
		 anInterface38_9461.method250((float) anInt9452),
		 anInterface38_9461.method229((float) anInt9449),
		 anInterface38_9461, i_35_);
	} else {
	    aClass182_Sub1_9456.method14752();
	    aClass182_Sub1_9456.method14779(i_36_);
	    Class312 class312 = aClass182_Sub1_9456.aClass312_9249;
	    class312.anInterface38_3481 = anInterface38_9461;
	    class312.method5634(i_34_, i_35_);
	    if (aBool9454) {
		i_32_ = i_32_ * anInt9452 / method12();
		i_33_ = i_33_ * anInt9449 / method2472();
		i += anInt9462 * i_32_ / anInt9452;
		i_31_ += anInt9455 * i_33_ / anInt9449;
	    }
	    float f = (float) aClass182_Sub1_9456.method3566(-1595949701)
				  .method2710();
	    float f_38_ = (float) aClass182_Sub1_9456.method3566(378950442)
				      .method2711();
	    class312.aClass435_3476.method6954((float) i_32_ * 2.0F / f,
					       (float) i_33_ * 2.0F / f_38_,
					       1.0F, 1.0F);
	    class312.aClass435_3476.aFloatArray4830[12]
		= (((float) i + aClass182_Sub1_9456.method14674()) * 2.0F / f
		   - 1.0F);
	    class312.aClass435_3476.aFloatArray4830[13]
		= (((float) i_31_ + aClass182_Sub1_9456.method14674()) * 2.0F
		   / f_38_) - 1.0F;
	    class312.aClass435_3476.aFloatArray4830[14] = -1.0F;
	    class312.aClass435_3477.method6954
		(anInterface38_9461.method250((float) anInt9452),
		 anInterface38_9461.method229((float) anInt9449), 1.0F, 1.0F);
	    class312.anInterface35_3479
		= aClass182_Sub1_9456.anInterface35_9311;
	    class312.anInt3473 = 0;
	    class312.aClass337_3480 = aClass182_Sub1_9456.aClass337_9261;
	    class312.method5635();
	}
    }
    
    public void method2510(int i, int i_39_, int i_40_, int i_41_, int[] is,
			   int[] is_42_, int i_43_, int i_44_) {
	anInterface38_9461.method236(i, i_39_, i_40_, i_41_, is, is_42_,
				     i_43_);
    }
    
    public int method2472() {
	return anInt9449 + anInt9455 + anInt9457;
    }
    
    public int method12() {
	return anInt9452 + anInt9462 + anInt9458;
    }
    
    void method2528(float f, float f_45_, float f_46_, float f_47_,
		    float f_48_, float f_49_, int i, Class152 class152,
		    int i_50_, int i_51_) {
	aClass182_Sub1_9456.method14752();
	Class312 class312 = aClass182_Sub1_9456.aClass312_9249;
	class312.anInterface38_3481 = anInterface38_9461;
	class312.method5634(1, -1);
	float f_52_
	    = (float) aClass182_Sub1_9456.method3566(474399651).method2710();
	float f_53_
	    = (float) aClass182_Sub1_9456.method3566(-1764529806).method2711();
	class312.aClass435_3476.method7023();
	if (aBool9454) {
	    float f_54_ = (float) anInt9452 / (float) method12();
	    float f_55_ = (float) anInt9449 / (float) method2472();
	    class312.aClass435_3476.aFloatArray4830[0] = (f_46_ - f) * f_54_;
	    class312.aClass435_3476.aFloatArray4830[1]
		= (f_47_ - f_45_) * f_54_;
	    class312.aClass435_3476.aFloatArray4830[4] = (f_48_ - f) * f_55_;
	    class312.aClass435_3476.aFloatArray4830[5]
		= (f_49_ - f_45_) * f_55_;
	    class312.aClass435_3476.aFloatArray4830[12]
		= ((f + (float) anInt9462) * f_54_
		   + aClass182_Sub1_9456.method14674());
	    class312.aClass435_3476.aFloatArray4830[13]
		= ((f_45_ + (float) anInt9455) * f_55_
		   + aClass182_Sub1_9456.method14674());
	} else {
	    class312.aClass435_3476.aFloatArray4830[0] = f_46_ - f;
	    class312.aClass435_3476.aFloatArray4830[1] = f_47_ - f_45_;
	    class312.aClass435_3476.aFloatArray4830[4] = f_48_ - f;
	    class312.aClass435_3476.aFloatArray4830[5] = f_49_ - f_45_;
	    class312.aClass435_3476.aFloatArray4830[12]
		= f + aClass182_Sub1_9456.method14674();
	    class312.aClass435_3476.aFloatArray4830[13]
		= f_45_ + aClass182_Sub1_9456.method14674();
	}
	Class435 class435 = aClass182_Sub1_9456.aClass435_9180;
	class435.method7023();
	class435.aFloatArray4830[0] = 2.0F / f_52_;
	class435.aFloatArray4830[5] = 2.0F / f_53_;
	class435.aFloatArray4830[12] = -1.0F;
	class435.aFloatArray4830[13] = -1.0F;
	class435.aFloatArray4830[14] = -1.0F;
	class312.aClass435_3476.method6950(class435);
	class312.aClass435_3477.method6954(anInterface38_9461
					       .method250((float) anInt9452),
					   anInterface38_9461
					       .method229((float) anInt9449),
					   1.0F, 1.0F);
	class312.anInterface35_3479 = aClass182_Sub1_9456.anInterface35_9311;
	class312.anInt3473 = 0;
	class312.aClass337_3480 = aClass182_Sub1_9456.aClass337_9261;
	Interface38 interface38
	    = ((Class152_Sub3) class152).anInterface38_9884;
	class312.anInterface38_3475 = interface38;
	class312.aClass435_3474.method7023();
	class312.aClass435_3474.aFloatArray4830[0]
	    = (f_46_ - f) * interface38.method250(1.0F);
	class312.aClass435_3474.aFloatArray4830[1]
	    = (f_47_ - f_45_) * interface38.method250(1.0F);
	class312.aClass435_3474.aFloatArray4830[4]
	    = (f_48_ - f) * interface38.method229(1.0F);
	class312.aClass435_3474.aFloatArray4830[5]
	    = (f_49_ - f_45_) * interface38.method229(1.0F);
	class312.aClass435_3474.aFloatArray4830[12]
	    = (f - (float) i_50_) * interface38.method250(1.0F);
	class312.aClass435_3474.aFloatArray4830[13]
	    = (f_45_ - (float) i_51_) * interface38.method229(1.0F);
	class312.method5633();
    }
    
    public void method2475(int i, int i_56_, int i_57_, int i_58_, int[] is,
			   int[] is_59_, int i_60_, int i_61_) {
	anInterface38_9461.method236(i, i_56_, i_57_, i_58_, is, is_59_,
				     i_60_);
    }
    
    public void method2479(int i, int i_62_, int i_63_, int i_64_, int i_65_) {
	if (aClass182_Sub1_9456.method14675() != Class348.aClass348_3732) {
	    i += anInt9462;
	    i_62_ += anInt9455;
	    aClass182_Sub1_9456.aClass360_9259.method6274
		((float) i, (float) i_62_, (float) (i + anInt9452),
		 (float) (i_62_ + anInt9449), 0.0F, 0.0F,
		 anInterface38_9461.method237(),
		 anInterface38_9461.method247(), anInterface38_9461, i_64_);
	} else {
	    aClass182_Sub1_9456.method14752();
	    aClass182_Sub1_9456.method14779(i_65_);
	    Class312 class312 = aClass182_Sub1_9456.aClass312_9249;
	    class312.anInterface38_3481 = anInterface38_9461;
	    class312.method5634(i_63_, i_64_);
	    i += anInt9462;
	    i_62_ += anInt9455;
	    float f = (float) aClass182_Sub1_9456.method3566(-403220200)
				  .method2710();
	    float f_66_ = (float) aClass182_Sub1_9456.method3566
				      (-928766708).method2711();
	    class312.aClass435_3476.method6954((float) anInt9452 * 2.0F / f,
					       ((float) anInt9449 * 2.0F
						/ f_66_),
					       1.0F, 1.0F);
	    class312.aClass435_3476.aFloatArray4830[12]
		= (((float) i + aClass182_Sub1_9456.method14674()) * 2.0F / f
		   - 1.0F);
	    class312.aClass435_3476.aFloatArray4830[13]
		= (((float) i_62_ + aClass182_Sub1_9456.method14674()) * 2.0F
		   / f_66_) - 1.0F;
	    class312.aClass435_3476.aFloatArray4830[14] = -1.0F;
	    class312.aClass435_3477.method6954
		(anInterface38_9461.method250((float) anInt9452),
		 anInterface38_9461.method229((float) anInt9449), 1.0F, 1.0F);
	    class312.anInterface35_3479
		= aClass182_Sub1_9456.anInterface35_9311;
	    class312.anInt3473 = 0;
	    class312.aClass337_3480 = aClass182_Sub1_9456.aClass337_9261;
	    class312.method5635();
	}
    }
    
    public void method2545(int i, int i_67_, int i_68_, int i_69_, int i_70_) {
	if (aClass182_Sub1_9456.method14675() != Class348.aClass348_3732) {
	    i += anInt9462;
	    i_67_ += anInt9455;
	    aClass182_Sub1_9456.aClass360_9259.method6274
		((float) i, (float) i_67_, (float) (i + anInt9452),
		 (float) (i_67_ + anInt9449), 0.0F, 0.0F,
		 anInterface38_9461.method237(),
		 anInterface38_9461.method247(), anInterface38_9461, i_69_);
	} else {
	    aClass182_Sub1_9456.method14752();
	    aClass182_Sub1_9456.method14779(i_70_);
	    Class312 class312 = aClass182_Sub1_9456.aClass312_9249;
	    class312.anInterface38_3481 = anInterface38_9461;
	    class312.method5634(i_68_, i_69_);
	    i += anInt9462;
	    i_67_ += anInt9455;
	    float f = (float) aClass182_Sub1_9456.method3566(-533907438)
				  .method2710();
	    float f_71_ = (float) aClass182_Sub1_9456.method3566
				      (-1136336969).method2711();
	    class312.aClass435_3476.method6954((float) anInt9452 * 2.0F / f,
					       ((float) anInt9449 * 2.0F
						/ f_71_),
					       1.0F, 1.0F);
	    class312.aClass435_3476.aFloatArray4830[12]
		= (((float) i + aClass182_Sub1_9456.method14674()) * 2.0F / f
		   - 1.0F);
	    class312.aClass435_3476.aFloatArray4830[13]
		= (((float) i_67_ + aClass182_Sub1_9456.method14674()) * 2.0F
		   / f_71_) - 1.0F;
	    class312.aClass435_3476.aFloatArray4830[14] = -1.0F;
	    class312.aClass435_3477.method6954
		(anInterface38_9461.method250((float) anInt9452),
		 anInterface38_9461.method229((float) anInt9449), 1.0F, 1.0F);
	    class312.anInterface35_3479
		= aClass182_Sub1_9456.anInterface35_9311;
	    class312.anInt3473 = 0;
	    class312.aClass337_3480 = aClass182_Sub1_9456.aClass337_9261;
	    class312.method5635();
	}
    }
    
    void method2483(int i, int i_72_, int i_73_, int i_74_, int i_75_,
		    int i_76_, int i_77_, int i_78_) {
	if (aClass182_Sub1_9456.method14675() != Class348.aClass348_3732) {
	    if (aBool9454) {
		i_73_ = i_73_ * anInt9452 / method12();
		i_74_ = i_74_ * anInt9449 / method2472();
		i += anInt9462 * i_73_ / anInt9452;
		i_72_ += anInt9455 * i_74_ / anInt9449;
	    }
	    aClass182_Sub1_9456.aClass360_9259.method6274
		((float) i, (float) i_72_, (float) (i + i_73_),
		 (float) (i_72_ + i_74_), anInterface38_9461.method250(0.0F),
		 anInterface38_9461.method229(0.0F),
		 anInterface38_9461.method250((float) anInt9452),
		 anInterface38_9461.method229((float) anInt9449),
		 anInterface38_9461, i_76_);
	} else {
	    aClass182_Sub1_9456.method14752();
	    aClass182_Sub1_9456.method14779(i_77_);
	    Class312 class312 = aClass182_Sub1_9456.aClass312_9249;
	    class312.anInterface38_3481 = anInterface38_9461;
	    class312.method5634(i_75_, i_76_);
	    if (aBool9454) {
		i_73_ = i_73_ * anInt9452 / method12();
		i_74_ = i_74_ * anInt9449 / method2472();
		i += anInt9462 * i_73_ / anInt9452;
		i_72_ += anInt9455 * i_74_ / anInt9449;
	    }
	    float f = (float) aClass182_Sub1_9456.method3566(-861091863)
				  .method2710();
	    float f_79_ = (float) aClass182_Sub1_9456.method3566
				      (-1507604570).method2711();
	    class312.aClass435_3476.method6954((float) i_73_ * 2.0F / f,
					       (float) i_74_ * 2.0F / f_79_,
					       1.0F, 1.0F);
	    class312.aClass435_3476.aFloatArray4830[12]
		= (((float) i + aClass182_Sub1_9456.method14674()) * 2.0F / f
		   - 1.0F);
	    class312.aClass435_3476.aFloatArray4830[13]
		= (((float) i_72_ + aClass182_Sub1_9456.method14674()) * 2.0F
		   / f_79_) - 1.0F;
	    class312.aClass435_3476.aFloatArray4830[14] = -1.0F;
	    class312.aClass435_3477.method6954
		(anInterface38_9461.method250((float) anInt9452),
		 anInterface38_9461.method229((float) anInt9449), 1.0F, 1.0F);
	    class312.anInterface35_3479
		= aClass182_Sub1_9456.anInterface35_9311;
	    class312.anInt3473 = 0;
	    class312.aClass337_3480 = aClass182_Sub1_9456.aClass337_9261;
	    class312.method5635();
	}
    }
    
    public void method2485(int i, int i_80_, int i_81_, int i_82_, int i_83_,
			   int i_84_, int i_85_) {
	if (aClass182_Sub1_9456.method14675() != Class348.aClass348_3732) {
	    int i_86_ = i_80_ + i_82_;
	    int i_87_ = i + i_81_;
	    int i_88_ = method12();
	    int i_89_ = method2472();
	    int i_90_ = i_80_ + anInt9455;
	    for (int i_91_ = i_90_ + anInt9449; i_91_ <= i_86_;
		 i_91_ += i_89_) {
		int i_92_ = i + anInt9462;
		for (int i_93_ = i_92_ + anInt9452; i_93_ <= i_87_;
		     i_93_ += i_88_) {
		    aClass182_Sub1_9456.aClass360_9259.method6274
			((float) i_92_, (float) i_90_,
			 (float) (i_92_ + anInt9452),
			 (float) (i_90_ + anInt9449), 0.0F, 0.0F,
			 anInterface38_9461.method237(),
			 anInterface38_9461.method247(), anInterface38_9461,
			 i_84_);
		    i_92_ += i_88_;
		}
		if (i_92_ < i_87_) {
		    int i_94_ = i_87_ - i_92_;
		    aClass182_Sub1_9456.aClass360_9259.method6274
			((float) i_92_, (float) i_90_, (float) (i_92_ + i_94_),
			 (float) (i_90_ + anInt9449), 0.0F, 0.0F,
			 ((float) i_94_ / (float) anInt9452
			  * anInterface38_9461.method237()),
			 anInterface38_9461.method247(), anInterface38_9461,
			 i_84_);
		}
		i_90_ += i_89_;
	    }
	    if (i_90_ < i_86_) {
		int i_95_ = i_86_ - i_90_;
		float f = ((float) i_95_ / (float) anInt9449
			   * anInterface38_9461.method247());
		int i_96_ = i + anInt9462;
		for (int i_97_ = i_96_ + anInt9452; i_97_ <= i_87_;
		     i_97_ += i_88_) {
		    aClass182_Sub1_9456.aClass360_9259.method6274
			((float) i_96_, (float) i_90_,
			 (float) (i_96_ + anInt9452), (float) (i_90_ + i_95_),
			 0.0F, 0.0F, anInterface38_9461.method237(), f,
			 anInterface38_9461, i_84_);
		    i_96_ += i_88_;
		}
		if (i_96_ < i_87_) {
		    int i_98_ = i_87_ - i_96_;
		    aClass182_Sub1_9456.aClass360_9259.method6274
			((float) i_96_, (float) i_90_, (float) (i_96_ + i_98_),
			 (float) (i_90_ + i_95_), 0.0F, 0.0F,
			 ((float) i_98_ / (float) anInt9452
			  * anInterface38_9461.method237()),
			 f, anInterface38_9461, i_84_);
		}
	    }
	} else {
	    aClass182_Sub1_9456.method14752();
	    aClass182_Sub1_9456.method14779(i_85_);
	    Class312 class312 = aClass182_Sub1_9456.aClass312_9249;
	    class312.anInterface38_3481 = anInterface38_9461;
	    class312.method5634(i_83_, i_84_);
	    float f = (float) aClass182_Sub1_9456.method3566(423471458)
				  .method2710();
	    float f_99_ = (float) aClass182_Sub1_9456.method3566(317861719)
				      .method2711();
	    class312.anInterface35_3479
		= aClass182_Sub1_9456.anInterface35_9311;
	    class312.anInt3473 = 0;
	    class312.aClass337_3480 = aClass182_Sub1_9456.aClass337_9261;
	    boolean bool = aBool9450 && anInt9455 == 0 && anInt9457 == 0;
	    boolean bool_100_ = aBool9453 && anInt9462 == 0 && anInt9458 == 0;
	    if (bool_100_ & bool) {
		class312.aClass435_3476.method6954((float) i_81_ * 2.0F / f,
						   ((float) i_82_ * 2.0F
						    / f_99_),
						   1.0F, 1.0F);
		class312.aClass435_3476.aFloatArray4830[12]
		    = (((float) i + aClass182_Sub1_9456.method14674()) * 2.0F
		       / f) - 1.0F;
		class312.aClass435_3476.aFloatArray4830[13]
		    = (((float) i_80_ + aClass182_Sub1_9456.method14674())
		       * 2.0F / f_99_) - 1.0F;
		class312.aClass435_3476.aFloatArray4830[14] = -1.0F;
		class312.aClass435_3477.method6954
		    (anInterface38_9461.method250((float) i_81_),
		     anInterface38_9461.method229((float) i_82_), 1.0F, 1.0F);
		class312.method5635();
	    } else if (bool_100_) {
		int i_101_ = i_80_ + i_82_;
		int i_102_ = method2472();
		class312.aClass435_3477.method6954
		    (anInterface38_9461.method250((float) i_81_),
		     anInterface38_9461.method229((float) anInt9449), 1.0F,
		     1.0F);
		int i_103_ = i_80_ + anInt9455;
		for (int i_104_ = i_103_ + anInt9449; i_104_ <= i_101_;
		     i_104_ += i_102_) {
		    class312.aClass435_3476.method6954(((float) i_81_ * 2.0F
							/ f),
						       ((float) anInt9449
							* 2.0F / f_99_),
						       1.0F, 1.0F);
		    class312.aClass435_3476.aFloatArray4830[12]
			= (((float) i + aClass182_Sub1_9456.method14674())
			   * 2.0F / f) - 1.0F;
		    class312.aClass435_3476.aFloatArray4830[13]
			= (((float) i_103_ + aClass182_Sub1_9456.method14674())
			   * 2.0F / f_99_) - 1.0F;
		    class312.aClass435_3476.aFloatArray4830[14] = -1.0F;
		    class312.method5635();
		    i_103_ += i_102_;
		}
		if (i_103_ < i_101_) {
		    int i_105_ = i_101_ - i_103_;
		    class312.aClass435_3477.method6954
			(anInterface38_9461.method250((float) i_81_),
			 anInterface38_9461.method229((float) i_105_), 1.0F,
			 1.0F);
		    class312.aClass435_3476.method6954(((float) i_81_ * 2.0F
							/ f),
						       ((float) i_105_ * 2.0F
							/ f_99_),
						       1.0F, 1.0F);
		    class312.aClass435_3476.aFloatArray4830[12]
			= (((float) i + aClass182_Sub1_9456.method14674())
			   * 2.0F / f) - 1.0F;
		    class312.aClass435_3476.aFloatArray4830[13]
			= (((float) i_103_ + aClass182_Sub1_9456.method14674())
			   * 2.0F / f_99_) - 1.0F;
		    class312.aClass435_3476.aFloatArray4830[14] = -1.0F;
		    class312.method5635();
		}
	    } else if (bool) {
		int i_106_ = i + i_81_;
		int i_107_ = method12();
		class312.aClass435_3477.method6954
		    (anInterface38_9461.method250((float) anInt9452),
		     anInterface38_9461.method229((float) i_82_), 1.0F, 1.0F);
		int i_108_ = i + anInt9462;
		for (int i_109_ = i_108_ + anInt9452; i_109_ <= i_106_;
		     i_109_ += i_107_) {
		    class312.aClass435_3476.method6954(((float) anInt9452
							* 2.0F / f),
						       ((float) i_82_ * 2.0F
							/ f_99_),
						       1.0F, 1.0F);
		    class312.aClass435_3476.aFloatArray4830[12]
			= (((float) i_108_ + aClass182_Sub1_9456.method14674())
			   * 2.0F / f) - 1.0F;
		    class312.aClass435_3476.aFloatArray4830[13]
			= (((float) i_80_ + aClass182_Sub1_9456.method14674())
			   * 2.0F / f_99_) - 1.0F;
		    class312.aClass435_3476.aFloatArray4830[14] = -1.0F;
		    class312.method5635();
		    i_108_ += i_107_;
		}
		if (i_108_ < i_106_) {
		    int i_110_ = i_106_ - i_108_;
		    class312.aClass435_3477.method6954
			(anInterface38_9461.method250((float) i_110_),
			 anInterface38_9461.method229((float) i_82_), 1.0F,
			 1.0F);
		    class312.aClass435_3476.method6954(((float) i_110_ * 2.0F
							/ f),
						       ((float) i_82_ * 2.0F
							/ f_99_),
						       1.0F, 1.0F);
		    class312.aClass435_3476.aFloatArray4830[12]
			= (((float) i_108_ + aClass182_Sub1_9456.method14674())
			   * 2.0F / f) - 1.0F;
		    class312.aClass435_3476.aFloatArray4830[13]
			= (((float) i_80_ + aClass182_Sub1_9456.method14674())
			   * 2.0F / f_99_) - 1.0F;
		    class312.aClass435_3476.aFloatArray4830[14] = -1.0F;
		    class312.method5635();
		}
	    } else {
		int i_111_ = i_80_ + i_82_;
		int i_112_ = i + i_81_;
		int i_113_ = method12();
		int i_114_ = method2472();
		int i_115_ = i_80_ + anInt9455;
		for (int i_116_ = i_115_ + anInt9449; i_116_ <= i_111_;
		     i_116_ += i_114_) {
		    class312.aClass435_3477.method6954
			(anInterface38_9461.method250((float) anInt9452),
			 anInterface38_9461.method229((float) anInt9449), 1.0F,
			 1.0F);
		    int i_117_ = i + anInt9462;
		    for (int i_118_ = i_117_ + anInt9452; i_118_ <= i_112_;
			 i_118_ += i_113_) {
			class312.aClass435_3476.method6954(((float) anInt9452
							    * 2.0F / f),
							   ((float) anInt9449
							    * 2.0F / f_99_),
							   1.0F, 1.0F);
			class312.aClass435_3476.aFloatArray4830[12]
			    = (((float) i_117_
				+ aClass182_Sub1_9456.method14674()) * 2.0F / f
			       - 1.0F);
			class312.aClass435_3476.aFloatArray4830[13]
			    = (((float) i_115_
				+ aClass182_Sub1_9456.method14674())
			       * 2.0F / f_99_) - 1.0F;
			class312.aClass435_3476.aFloatArray4830[14] = -1.0F;
			class312.method5635();
			i_117_ += i_113_;
		    }
		    if (i_117_ < i_112_) {
			int i_119_ = i_112_ - i_117_;
			class312.aClass435_3477.method6954
			    (anInterface38_9461.method250((float) i_119_),
			     anInterface38_9461.method229((float) anInt9449),
			     1.0F, 1.0F);
			class312.aClass435_3476.method6954(((float) i_119_
							    * 2.0F / f),
							   ((float) anInt9449
							    * 2.0F / f_99_),
							   1.0F, 1.0F);
			class312.aClass435_3476.aFloatArray4830[12]
			    = (((float) i_117_
				+ aClass182_Sub1_9456.method14674()) * 2.0F / f
			       - 1.0F);
			class312.aClass435_3476.aFloatArray4830[13]
			    = (((float) i_115_
				+ aClass182_Sub1_9456.method14674())
			       * 2.0F / f_99_) - 1.0F;
			class312.aClass435_3476.aFloatArray4830[14] = -1.0F;
			class312.method5635();
		    }
		    i_115_ += i_114_;
		}
		if (i_115_ < i_111_) {
		    int i_120_ = i_111_ - i_115_;
		    class312.aClass435_3477.method6954
			(anInterface38_9461.method250((float) anInt9452),
			 anInterface38_9461.method229((float) i_120_), 1.0F,
			 1.0F);
		    int i_121_ = i + anInt9462;
		    for (int i_122_ = i_121_ + anInt9452; i_122_ <= i_112_;
			 i_122_ += i_113_) {
			class312.aClass435_3476.method6954(((float) anInt9452
							    * 2.0F / f),
							   ((float) i_120_
							    * 2.0F / f_99_),
							   1.0F, 1.0F);
			class312.aClass435_3476.aFloatArray4830[12]
			    = (((float) i_121_
				+ aClass182_Sub1_9456.method14674()) * 2.0F / f
			       - 1.0F);
			class312.aClass435_3476.aFloatArray4830[13]
			    = (((float) i_115_
				+ aClass182_Sub1_9456.method14674())
			       * 2.0F / f_99_) - 1.0F;
			class312.aClass435_3476.aFloatArray4830[14] = -1.0F;
			class312.method5635();
			i_121_ += i_113_;
		    }
		    if (i_121_ < i_112_) {
			int i_123_ = i_112_ - i_121_;
			class312.aClass435_3477.method6954
			    (anInterface38_9461.method250((float) i_123_),
			     anInterface38_9461.method229((float) i_120_),
			     1.0F, 1.0F);
			class312.aClass435_3476.method6954(((float) i_123_
							    * 2.0F / f),
							   ((float) i_120_
							    * 2.0F / f_99_),
							   1.0F, 1.0F);
			class312.aClass435_3476.aFloatArray4830[12]
			    = (((float) i_121_
				+ aClass182_Sub1_9456.method14674()) * 2.0F / f
			       - 1.0F);
			class312.aClass435_3476.aFloatArray4830[13]
			    = (((float) i_115_
				+ aClass182_Sub1_9456.method14674())
			       * 2.0F / f_99_) - 1.0F;
			class312.aClass435_3476.aFloatArray4830[14] = -1.0F;
			class312.method5635();
		    }
		}
	    }
	}
    }
    
    public void method2474(int i, int i_124_, int i_125_, int i_126_, int[] is,
			   int i_127_, int i_128_) {
	anInterface38_9461.method232(i, i_124_, i_125_, i_126_, is, i_127_,
				     i_128_);
    }
    
    void method2504(float f, float f_129_, float f_130_, float f_131_,
		    float f_132_, float f_133_, int i, int i_134_, int i_135_,
		    int i_136_) {
	if (aClass182_Sub1_9456.method14675() != Class348.aClass348_3732)
	    aClass182_Sub1_9456.aClass360_9259.method6285
		(f, f_129_, f_130_, f_131_, f_132_, f_133_,
		 f_130_ + f_132_ - f, f_131_ + f_133_ - f_129_, 0.0F, 0.0F,
		 anInterface38_9461.method237(), 0.0F, 0.0F,
		 anInterface38_9461.method247(),
		 anInterface38_9461.method237(),
		 anInterface38_9461.method247(), anInterface38_9461, i_134_);
	else {
	    aClass182_Sub1_9456.method14752();
	    aClass182_Sub1_9456.method14779(i_135_);
	    if (aBool9454) {
		float f_137_ = (float) method12();
		float f_138_ = (float) method2472();
		float f_139_ = (f_130_ - f) / f_137_;
		float f_140_ = (f_131_ - f_129_) / f_137_;
		float f_141_ = (f_132_ - f) / f_138_;
		float f_142_ = (f_133_ - f_129_) / f_138_;
		float f_143_ = f_141_ * (float) anInt9455;
		float f_144_ = f_142_ * (float) anInt9455;
		float f_145_ = f_139_ * (float) anInt9462;
		float f_146_ = f_140_ * (float) anInt9462;
		float f_147_ = -f_139_ * (float) anInt9458;
		float f_148_ = -f_140_ * (float) anInt9458;
		float f_149_ = -f_141_ * (float) anInt9457;
		float f_150_ = -f_142_ * (float) anInt9457;
		f = f + f_145_ + f_143_;
		f_129_ = f_129_ + f_146_ + f_144_;
		f_130_ = f_130_ + f_147_ + f_143_;
		f_131_ = f_131_ + f_148_ + f_144_;
		f_132_ = f_132_ + f_145_ + f_149_;
		f_133_ = f_133_ + f_146_ + f_150_;
	    }
	    Class312 class312 = aClass182_Sub1_9456.aClass312_9249;
	    class312.anInterface38_3481 = anInterface38_9461;
	    class312.method5634(i, i_134_);
	    float f_151_ = (float) aClass182_Sub1_9456.method3566
				       (586357888).method2710();
	    float f_152_ = (float) aClass182_Sub1_9456.method3566
				       (-1207073696).method2711();
	    class312.aClass435_3476.method7023();
	    class312.aClass435_3476.aFloatArray4830[0]
		= (f_130_ - f) * 2.0F / f_151_;
	    class312.aClass435_3476.aFloatArray4830[1]
		= (f_131_ - f_129_) * 2.0F / f_152_;
	    class312.aClass435_3476.aFloatArray4830[4]
		= (f_132_ - f) * 2.0F / f_151_;
	    class312.aClass435_3476.aFloatArray4830[5]
		= (f_133_ - f_129_) * 2.0F / f_152_;
	    class312.aClass435_3476.aFloatArray4830[12]
		= ((f + aClass182_Sub1_9456.method14674()) * 2.0F / f_151_
		   - 1.0F);
	    class312.aClass435_3476.aFloatArray4830[13]
		= ((f_129_ + aClass182_Sub1_9456.method14674()) * 2.0F / f_152_
		   - 1.0F);
	    class312.aClass435_3476.aFloatArray4830[14] = -1.0F;
	    class312.aClass435_3477.method6954
		(anInterface38_9461.method250((float) anInt9452),
		 anInterface38_9461.method229((float) anInt9449), 1.0F, 1.0F);
	    class312.anInterface35_3479
		= aClass182_Sub1_9456.anInterface35_9311;
	    class312.anInt3473 = 0;
	    class312.aClass337_3480 = aClass182_Sub1_9456.aClass337_9261;
	    class312.method5635();
	}
    }
    
    public void method2527(int i, int i_153_, int i_154_, int i_155_, int[] is,
			   int i_156_, int i_157_) {
	anInterface38_9461.method232(i, i_153_, i_154_, i_155_, is, i_156_,
				     i_157_);
    }
    
    public void method2497(int i, int i_158_, int i_159_, int i_160_,
			   int i_161_, int i_162_) {
	anInterface38_9461.method251(i, i_158_, i_159_, i_160_, i_161_,
				     i_162_);
    }
    
    public int method2471() {
	return anInt9449;
    }
    
    public void method2499(int i, int i_163_, int i_164_, int i_165_,
			   int i_166_, int i_167_) {
	anInterface38_9461.method251(i, i_163_, i_164_, i_165_, i_166_,
				     i_167_);
    }
    
    public void method2486(int i, int i_168_, int i_169_) {
	int[] is
	    = aClass182_Sub1_9456.method3165(i, i_168_, anInt9452, anInt9449);
	int[] is_170_ = new int[anInt9452 * anInt9449];
	anInterface38_9461.method258(0, 0, anInt9452, anInt9449, is_170_, 0);
	if (i_169_ == 0) {
	    for (int i_171_ = 0; i_171_ < anInt9449; i_171_++) {
		int i_172_ = i_171_ * anInt9452;
		for (int i_173_ = 0; i_173_ < anInt9452; i_173_++)
		    is_170_[i_172_ + i_173_]
			= (is_170_[i_172_ + i_173_] & 0xffffff
			   | is[i_172_ + i_173_] << 8 & ~0xffffff);
	    }
	} else if (i_169_ == 1) {
	    for (int i_174_ = 0; i_174_ < anInt9449; i_174_++) {
		int i_175_ = i_174_ * anInt9452;
		for (int i_176_ = 0; i_176_ < anInt9452; i_176_++)
		    is_170_[i_175_ + i_176_]
			= (is_170_[i_175_ + i_176_] & 0xffffff
			   | is[i_175_ + i_176_] << 16 & ~0xffffff);
	    }
	} else if (i_169_ == 2) {
	    for (int i_177_ = 0; i_177_ < anInt9449; i_177_++) {
		int i_178_ = i_177_ * anInt9452;
		for (int i_179_ = 0; i_179_ < anInt9452; i_179_++)
		    is_170_[i_178_ + i_179_]
			= (is_170_[i_178_ + i_179_] & 0xffffff
			   | is[i_178_ + i_179_] << 24 & ~0xffffff);
	    }
	} else if (i_169_ == 3) {
	    for (int i_180_ = 0; i_180_ < anInt9449; i_180_++) {
		int i_181_ = i_180_ * anInt9452;
		for (int i_182_ = 0; i_182_ < anInt9452; i_182_++)
		    is_170_[i_181_ + i_182_]
			= (is_170_[i_181_ + i_182_] & 0xffffff
			   | (is[i_181_ + i_182_] != 0 ? -16777216 : 0));
	    }
	}
	method2474(0, 0, anInt9452, anInt9449, is_170_, 0, anInt9452);
    }
    
    public Interface21 method2501() {
	return anInterface21_9451;
    }
    
    void method2550(float f, float f_183_, float f_184_, float f_185_,
		    float f_186_, float f_187_, int i, int i_188_, int i_189_,
		    int i_190_) {
	if (aClass182_Sub1_9456.method14675() != Class348.aClass348_3732)
	    aClass182_Sub1_9456.aClass360_9259.method6285
		(f, f_183_, f_184_, f_185_, f_186_, f_187_,
		 f_184_ + f_186_ - f, f_185_ + f_187_ - f_183_, 0.0F, 0.0F,
		 anInterface38_9461.method237(), 0.0F, 0.0F,
		 anInterface38_9461.method247(),
		 anInterface38_9461.method237(),
		 anInterface38_9461.method247(), anInterface38_9461, i_188_);
	else {
	    aClass182_Sub1_9456.method14752();
	    aClass182_Sub1_9456.method14779(i_189_);
	    if (aBool9454) {
		float f_191_ = (float) method12();
		float f_192_ = (float) method2472();
		float f_193_ = (f_184_ - f) / f_191_;
		float f_194_ = (f_185_ - f_183_) / f_191_;
		float f_195_ = (f_186_ - f) / f_192_;
		float f_196_ = (f_187_ - f_183_) / f_192_;
		float f_197_ = f_195_ * (float) anInt9455;
		float f_198_ = f_196_ * (float) anInt9455;
		float f_199_ = f_193_ * (float) anInt9462;
		float f_200_ = f_194_ * (float) anInt9462;
		float f_201_ = -f_193_ * (float) anInt9458;
		float f_202_ = -f_194_ * (float) anInt9458;
		float f_203_ = -f_195_ * (float) anInt9457;
		float f_204_ = -f_196_ * (float) anInt9457;
		f = f + f_199_ + f_197_;
		f_183_ = f_183_ + f_200_ + f_198_;
		f_184_ = f_184_ + f_201_ + f_197_;
		f_185_ = f_185_ + f_202_ + f_198_;
		f_186_ = f_186_ + f_199_ + f_203_;
		f_187_ = f_187_ + f_200_ + f_204_;
	    }
	    Class312 class312 = aClass182_Sub1_9456.aClass312_9249;
	    class312.anInterface38_3481 = anInterface38_9461;
	    class312.method5634(i, i_188_);
	    float f_205_ = (float) aClass182_Sub1_9456.method3566
				       (434754326).method2710();
	    float f_206_ = (float) aClass182_Sub1_9456.method3566
				       (482077531).method2711();
	    class312.aClass435_3476.method7023();
	    class312.aClass435_3476.aFloatArray4830[0]
		= (f_184_ - f) * 2.0F / f_205_;
	    class312.aClass435_3476.aFloatArray4830[1]
		= (f_185_ - f_183_) * 2.0F / f_206_;
	    class312.aClass435_3476.aFloatArray4830[4]
		= (f_186_ - f) * 2.0F / f_205_;
	    class312.aClass435_3476.aFloatArray4830[5]
		= (f_187_ - f_183_) * 2.0F / f_206_;
	    class312.aClass435_3476.aFloatArray4830[12]
		= ((f + aClass182_Sub1_9456.method14674()) * 2.0F / f_205_
		   - 1.0F);
	    class312.aClass435_3476.aFloatArray4830[13]
		= ((f_183_ + aClass182_Sub1_9456.method14674()) * 2.0F / f_206_
		   - 1.0F);
	    class312.aClass435_3476.aFloatArray4830[14] = -1.0F;
	    class312.aClass435_3477.method6954
		(anInterface38_9461.method250((float) anInt9452),
		 anInterface38_9461.method229((float) anInt9449), 1.0F, 1.0F);
	    class312.anInterface35_3479
		= aClass182_Sub1_9456.anInterface35_9311;
	    class312.anInt3473 = 0;
	    class312.aClass337_3480 = aClass182_Sub1_9456.aClass337_9261;
	    class312.method5635();
	}
    }
    
    public Interface21 method2507() {
	return anInterface21_9451;
    }
    
    public void method2467(int i, int i_207_, int i_208_, int i_209_,
			   int i_210_) {
	if (aClass182_Sub1_9456.method14675() != Class348.aClass348_3732) {
	    i += anInt9462;
	    i_207_ += anInt9455;
	    aClass182_Sub1_9456.aClass360_9259.method6274
		((float) i, (float) i_207_, (float) (i + anInt9452),
		 (float) (i_207_ + anInt9449), 0.0F, 0.0F,
		 anInterface38_9461.method237(),
		 anInterface38_9461.method247(), anInterface38_9461, i_209_);
	} else {
	    aClass182_Sub1_9456.method14752();
	    aClass182_Sub1_9456.method14779(i_210_);
	    Class312 class312 = aClass182_Sub1_9456.aClass312_9249;
	    class312.anInterface38_3481 = anInterface38_9461;
	    class312.method5634(i_208_, i_209_);
	    i += anInt9462;
	    i_207_ += anInt9455;
	    float f = (float) aClass182_Sub1_9456.method3566(-178816536)
				  .method2710();
	    float f_211_ = (float) aClass182_Sub1_9456.method3566
				       (669984291).method2711();
	    class312.aClass435_3476.method6954((float) anInt9452 * 2.0F / f,
					       ((float) anInt9449 * 2.0F
						/ f_211_),
					       1.0F, 1.0F);
	    class312.aClass435_3476.aFloatArray4830[12]
		= (((float) i + aClass182_Sub1_9456.method14674()) * 2.0F / f
		   - 1.0F);
	    class312.aClass435_3476.aFloatArray4830[13]
		= (((float) i_207_ + aClass182_Sub1_9456.method14674()) * 2.0F
		   / f_211_) - 1.0F;
	    class312.aClass435_3476.aFloatArray4830[14] = -1.0F;
	    class312.aClass435_3477.method6954
		(anInterface38_9461.method250((float) anInt9452),
		 anInterface38_9461.method229((float) anInt9449), 1.0F, 1.0F);
	    class312.anInterface35_3479
		= aClass182_Sub1_9456.anInterface35_9311;
	    class312.anInt3473 = 0;
	    class312.aClass337_3480 = aClass182_Sub1_9456.aClass337_9261;
	    class312.method5635();
	}
    }
    
    public int method11() {
	return anInt9452 + anInt9462 + anInt9458;
    }
    
    void method2476(float f, float f_212_, float f_213_, float f_214_,
		    float f_215_, float f_216_, int i, int i_217_, int i_218_,
		    int i_219_) {
	if (aClass182_Sub1_9456.method14675() != Class348.aClass348_3732)
	    aClass182_Sub1_9456.aClass360_9259.method6285
		(f, f_212_, f_213_, f_214_, f_215_, f_216_,
		 f_213_ + f_215_ - f, f_214_ + f_216_ - f_212_, 0.0F, 0.0F,
		 anInterface38_9461.method237(), 0.0F, 0.0F,
		 anInterface38_9461.method247(),
		 anInterface38_9461.method237(),
		 anInterface38_9461.method247(), anInterface38_9461, i_217_);
	else {
	    aClass182_Sub1_9456.method14752();
	    aClass182_Sub1_9456.method14779(i_218_);
	    if (aBool9454) {
		float f_220_ = (float) method12();
		float f_221_ = (float) method2472();
		float f_222_ = (f_213_ - f) / f_220_;
		float f_223_ = (f_214_ - f_212_) / f_220_;
		float f_224_ = (f_215_ - f) / f_221_;
		float f_225_ = (f_216_ - f_212_) / f_221_;
		float f_226_ = f_224_ * (float) anInt9455;
		float f_227_ = f_225_ * (float) anInt9455;
		float f_228_ = f_222_ * (float) anInt9462;
		float f_229_ = f_223_ * (float) anInt9462;
		float f_230_ = -f_222_ * (float) anInt9458;
		float f_231_ = -f_223_ * (float) anInt9458;
		float f_232_ = -f_224_ * (float) anInt9457;
		float f_233_ = -f_225_ * (float) anInt9457;
		f = f + f_228_ + f_226_;
		f_212_ = f_212_ + f_229_ + f_227_;
		f_213_ = f_213_ + f_230_ + f_226_;
		f_214_ = f_214_ + f_231_ + f_227_;
		f_215_ = f_215_ + f_228_ + f_232_;
		f_216_ = f_216_ + f_229_ + f_233_;
	    }
	    Class312 class312 = aClass182_Sub1_9456.aClass312_9249;
	    class312.anInterface38_3481 = anInterface38_9461;
	    class312.method5634(i, i_217_);
	    float f_234_ = (float) aClass182_Sub1_9456.method3566
				       (-1548391163).method2710();
	    float f_235_ = (float) aClass182_Sub1_9456.method3566
				       (-70684363).method2711();
	    class312.aClass435_3476.method7023();
	    class312.aClass435_3476.aFloatArray4830[0]
		= (f_213_ - f) * 2.0F / f_234_;
	    class312.aClass435_3476.aFloatArray4830[1]
		= (f_214_ - f_212_) * 2.0F / f_235_;
	    class312.aClass435_3476.aFloatArray4830[4]
		= (f_215_ - f) * 2.0F / f_234_;
	    class312.aClass435_3476.aFloatArray4830[5]
		= (f_216_ - f_212_) * 2.0F / f_235_;
	    class312.aClass435_3476.aFloatArray4830[12]
		= ((f + aClass182_Sub1_9456.method14674()) * 2.0F / f_234_
		   - 1.0F);
	    class312.aClass435_3476.aFloatArray4830[13]
		= ((f_212_ + aClass182_Sub1_9456.method14674()) * 2.0F / f_235_
		   - 1.0F);
	    class312.aClass435_3476.aFloatArray4830[14] = -1.0F;
	    class312.aClass435_3477.method6954
		(anInterface38_9461.method250((float) anInt9452),
		 anInterface38_9461.method229((float) anInt9449), 1.0F, 1.0F);
	    class312.anInterface35_3479
		= aClass182_Sub1_9456.anInterface35_9311;
	    class312.anInt3473 = 0;
	    class312.aClass337_3480 = aClass182_Sub1_9456.aClass337_9261;
	    class312.method5635();
	}
    }
    
    void method2470(int i, int i_236_, int i_237_, int i_238_, int i_239_,
		    int i_240_, int i_241_, int i_242_) {
	if (aClass182_Sub1_9456.method14675() != Class348.aClass348_3732) {
	    if (aBool9454) {
		i_237_ = i_237_ * anInt9452 / method12();
		i_238_ = i_238_ * anInt9449 / method2472();
		i += anInt9462 * i_237_ / anInt9452;
		i_236_ += anInt9455 * i_238_ / anInt9449;
	    }
	    aClass182_Sub1_9456.aClass360_9259.method6274
		((float) i, (float) i_236_, (float) (i + i_237_),
		 (float) (i_236_ + i_238_), anInterface38_9461.method250(0.0F),
		 anInterface38_9461.method229(0.0F),
		 anInterface38_9461.method250((float) anInt9452),
		 anInterface38_9461.method229((float) anInt9449),
		 anInterface38_9461, i_240_);
	} else {
	    aClass182_Sub1_9456.method14752();
	    aClass182_Sub1_9456.method14779(i_241_);
	    Class312 class312 = aClass182_Sub1_9456.aClass312_9249;
	    class312.anInterface38_3481 = anInterface38_9461;
	    class312.method5634(i_239_, i_240_);
	    if (aBool9454) {
		i_237_ = i_237_ * anInt9452 / method12();
		i_238_ = i_238_ * anInt9449 / method2472();
		i += anInt9462 * i_237_ / anInt9452;
		i_236_ += anInt9455 * i_238_ / anInt9449;
	    }
	    float f = (float) aClass182_Sub1_9456.method3566(-1074340355)
				  .method2710();
	    float f_243_ = (float) aClass182_Sub1_9456.method3566
				       (-1378906201).method2711();
	    class312.aClass435_3476.method6954((float) i_237_ * 2.0F / f,
					       (float) i_238_ * 2.0F / f_243_,
					       1.0F, 1.0F);
	    class312.aClass435_3476.aFloatArray4830[12]
		= (((float) i + aClass182_Sub1_9456.method14674()) * 2.0F / f
		   - 1.0F);
	    class312.aClass435_3476.aFloatArray4830[13]
		= (((float) i_236_ + aClass182_Sub1_9456.method14674()) * 2.0F
		   / f_243_) - 1.0F;
	    class312.aClass435_3476.aFloatArray4830[14] = -1.0F;
	    class312.aClass435_3477.method6954
		(anInterface38_9461.method250((float) anInt9452),
		 anInterface38_9461.method229((float) anInt9449), 1.0F, 1.0F);
	    class312.anInterface35_3479
		= aClass182_Sub1_9456.anInterface35_9311;
	    class312.anInt3473 = 0;
	    class312.aClass337_3480 = aClass182_Sub1_9456.aClass337_9261;
	    class312.method5635();
	}
    }
    
    public void method2515(int i, int i_244_, int i_245_, int i_246_) {
	anInt9462 = i;
	anInt9455 = i_244_;
	anInt9458 = i_245_;
	anInt9457 = i_246_;
	aBool9454 = (anInt9462 != 0 || anInt9455 != 0 || anInt9458 != 0
		     || anInt9457 != 0);
    }
    
    void method2509(int i, int i_247_, int i_248_, int i_249_, int i_250_,
		    int i_251_, int i_252_, int i_253_) {
	if (aClass182_Sub1_9456.method14675() != Class348.aClass348_3732) {
	    if (aBool9454) {
		i_248_ = i_248_ * anInt9452 / method12();
		i_249_ = i_249_ * anInt9449 / method2472();
		i += anInt9462 * i_248_ / anInt9452;
		i_247_ += anInt9455 * i_249_ / anInt9449;
	    }
	    aClass182_Sub1_9456.aClass360_9259.method6274
		((float) i, (float) i_247_, (float) (i + i_248_),
		 (float) (i_247_ + i_249_), anInterface38_9461.method250(0.0F),
		 anInterface38_9461.method229(0.0F),
		 anInterface38_9461.method250((float) anInt9452),
		 anInterface38_9461.method229((float) anInt9449),
		 anInterface38_9461, i_251_);
	} else {
	    aClass182_Sub1_9456.method14752();
	    aClass182_Sub1_9456.method14779(i_252_);
	    Class312 class312 = aClass182_Sub1_9456.aClass312_9249;
	    class312.anInterface38_3481 = anInterface38_9461;
	    class312.method5634(i_250_, i_251_);
	    if (aBool9454) {
		i_248_ = i_248_ * anInt9452 / method12();
		i_249_ = i_249_ * anInt9449 / method2472();
		i += anInt9462 * i_248_ / anInt9452;
		i_247_ += anInt9455 * i_249_ / anInt9449;
	    }
	    float f = (float) aClass182_Sub1_9456.method3566(-172961133)
				  .method2710();
	    float f_254_ = (float) aClass182_Sub1_9456.method3566
				       (-1614384148).method2711();
	    class312.aClass435_3476.method6954((float) i_248_ * 2.0F / f,
					       (float) i_249_ * 2.0F / f_254_,
					       1.0F, 1.0F);
	    class312.aClass435_3476.aFloatArray4830[12]
		= (((float) i + aClass182_Sub1_9456.method14674()) * 2.0F / f
		   - 1.0F);
	    class312.aClass435_3476.aFloatArray4830[13]
		= (((float) i_247_ + aClass182_Sub1_9456.method14674()) * 2.0F
		   / f_254_) - 1.0F;
	    class312.aClass435_3476.aFloatArray4830[14] = -1.0F;
	    class312.aClass435_3477.method6954
		(anInterface38_9461.method250((float) anInt9452),
		 anInterface38_9461.method229((float) anInt9449), 1.0F, 1.0F);
	    class312.anInterface35_3479
		= aClass182_Sub1_9456.anInterface35_9311;
	    class312.anInt3473 = 0;
	    class312.aClass337_3480 = aClass182_Sub1_9456.aClass337_9261;
	    class312.method5635();
	}
    }
    
    void method2484(float f, float f_255_, float f_256_, float f_257_,
		    float f_258_, float f_259_, int i, Class152 class152,
		    int i_260_, int i_261_) {
	aClass182_Sub1_9456.method14752();
	Class312 class312 = aClass182_Sub1_9456.aClass312_9249;
	class312.anInterface38_3481 = anInterface38_9461;
	class312.method5634(1, -1);
	float f_262_
	    = (float) aClass182_Sub1_9456.method3566(-1296623436).method2710();
	float f_263_
	    = (float) aClass182_Sub1_9456.method3566(513415916).method2711();
	class312.aClass435_3476.method7023();
	if (aBool9454) {
	    float f_264_ = (float) anInt9452 / (float) method12();
	    float f_265_ = (float) anInt9449 / (float) method2472();
	    class312.aClass435_3476.aFloatArray4830[0] = (f_256_ - f) * f_264_;
	    class312.aClass435_3476.aFloatArray4830[1]
		= (f_257_ - f_255_) * f_264_;
	    class312.aClass435_3476.aFloatArray4830[4] = (f_258_ - f) * f_265_;
	    class312.aClass435_3476.aFloatArray4830[5]
		= (f_259_ - f_255_) * f_265_;
	    class312.aClass435_3476.aFloatArray4830[12]
		= ((f + (float) anInt9462) * f_264_
		   + aClass182_Sub1_9456.method14674());
	    class312.aClass435_3476.aFloatArray4830[13]
		= ((f_255_ + (float) anInt9455) * f_265_
		   + aClass182_Sub1_9456.method14674());
	} else {
	    class312.aClass435_3476.aFloatArray4830[0] = f_256_ - f;
	    class312.aClass435_3476.aFloatArray4830[1] = f_257_ - f_255_;
	    class312.aClass435_3476.aFloatArray4830[4] = f_258_ - f;
	    class312.aClass435_3476.aFloatArray4830[5] = f_259_ - f_255_;
	    class312.aClass435_3476.aFloatArray4830[12]
		= f + aClass182_Sub1_9456.method14674();
	    class312.aClass435_3476.aFloatArray4830[13]
		= f_255_ + aClass182_Sub1_9456.method14674();
	}
	Class435 class435 = aClass182_Sub1_9456.aClass435_9180;
	class435.method7023();
	class435.aFloatArray4830[0] = 2.0F / f_262_;
	class435.aFloatArray4830[5] = 2.0F / f_263_;
	class435.aFloatArray4830[12] = -1.0F;
	class435.aFloatArray4830[13] = -1.0F;
	class435.aFloatArray4830[14] = -1.0F;
	class312.aClass435_3476.method6950(class435);
	class312.aClass435_3477.method6954(anInterface38_9461
					       .method250((float) anInt9452),
					   anInterface38_9461
					       .method229((float) anInt9449),
					   1.0F, 1.0F);
	class312.anInterface35_3479 = aClass182_Sub1_9456.anInterface35_9311;
	class312.anInt3473 = 0;
	class312.aClass337_3480 = aClass182_Sub1_9456.aClass337_9261;
	Interface38 interface38
	    = ((Class152_Sub3) class152).anInterface38_9884;
	class312.anInterface38_3475 = interface38;
	class312.aClass435_3474.method7023();
	class312.aClass435_3474.aFloatArray4830[0]
	    = (f_256_ - f) * interface38.method250(1.0F);
	class312.aClass435_3474.aFloatArray4830[1]
	    = (f_257_ - f_255_) * interface38.method250(1.0F);
	class312.aClass435_3474.aFloatArray4830[4]
	    = (f_258_ - f) * interface38.method229(1.0F);
	class312.aClass435_3474.aFloatArray4830[5]
	    = (f_259_ - f_255_) * interface38.method229(1.0F);
	class312.aClass435_3474.aFloatArray4830[12]
	    = (f - (float) i_260_) * interface38.method250(1.0F);
	class312.aClass435_3474.aFloatArray4830[13]
	    = (f_255_ - (float) i_261_) * interface38.method229(1.0F);
	class312.method5633();
    }
    
    public void method2514(int i, int i_266_, int i_267_, int i_268_, int[] is,
			   int[] is_269_, int i_270_, int i_271_) {
	anInterface38_9461.method236(i, i_266_, i_267_, i_268_, is, is_269_,
				     i_270_);
    }
    
    public void method2500(int i, int i_272_, int i_273_, int i_274_, int[] is,
			   int[] is_275_, int i_276_, int i_277_) {
	anInterface38_9461.method236(i, i_272_, i_273_, i_274_, is, is_275_,
				     i_276_);
    }
    
    public void method2513(int i, int i_278_, Class152 class152, int i_279_,
			   int i_280_) {
	aClass182_Sub1_9456.method14752();
	Class312 class312 = aClass182_Sub1_9456.aClass312_9249;
	class312.anInterface38_3481 = anInterface38_9461;
	class312.method5634(1, -1);
	i += anInt9462;
	i_278_ += anInt9455;
	float f
	    = (float) aClass182_Sub1_9456.method3566(-849418010).method2710();
	float f_281_
	    = (float) aClass182_Sub1_9456.method3566(-1024599055).method2711();
	class312.aClass435_3476.method6954((float) anInt9452 * 2.0F / f,
					   (float) anInt9449 * 2.0F / f_281_,
					   1.0F, 1.0F);
	class312.aClass435_3476.aFloatArray4830[12]
	    = (((float) i + aClass182_Sub1_9456.method14674()) * 2.0F / f
	       - 1.0F);
	class312.aClass435_3476.aFloatArray4830[13]
	    = (((float) i_278_ + aClass182_Sub1_9456.method14674()) * 2.0F
	       / f_281_) - 1.0F;
	class312.aClass435_3476.aFloatArray4830[14] = -1.0F;
	class312.aClass435_3477.method6954(anInterface38_9461
					       .method250((float) anInt9452),
					   anInterface38_9461
					       .method229((float) anInt9449),
					   1.0F, 1.0F);
	class312.anInterface35_3479 = aClass182_Sub1_9456.anInterface35_9311;
	class312.anInt3473 = 0;
	class312.aClass337_3480 = aClass182_Sub1_9456.aClass337_9261;
	Interface38 interface38
	    = ((Class152_Sub3) class152).anInterface38_9884;
	class312.anInterface38_3475 = interface38;
	class312.aClass435_3474.method6954(interface38
					       .method250((float) anInt9452),
					   interface38
					       .method229((float) anInt9449),
					   1.0F, 1.0F);
	class312.aClass435_3474.aFloatArray4830[12]
	    = interface38.method250((float) (i - i_279_));
	class312.aClass435_3474.aFloatArray4830[13]
	    = interface38.method229((float) (i_278_ - i_280_));
	class312.method5633();
    }
    
    public void method2549(int i, int i_282_, Class152 class152, int i_283_,
			   int i_284_) {
	aClass182_Sub1_9456.method14752();
	Class312 class312 = aClass182_Sub1_9456.aClass312_9249;
	class312.anInterface38_3481 = anInterface38_9461;
	class312.method5634(1, -1);
	i += anInt9462;
	i_282_ += anInt9455;
	float f
	    = (float) aClass182_Sub1_9456.method3566(260295102).method2710();
	float f_285_
	    = (float) aClass182_Sub1_9456.method3566(-74586011).method2711();
	class312.aClass435_3476.method6954((float) anInt9452 * 2.0F / f,
					   (float) anInt9449 * 2.0F / f_285_,
					   1.0F, 1.0F);
	class312.aClass435_3476.aFloatArray4830[12]
	    = (((float) i + aClass182_Sub1_9456.method14674()) * 2.0F / f
	       - 1.0F);
	class312.aClass435_3476.aFloatArray4830[13]
	    = (((float) i_282_ + aClass182_Sub1_9456.method14674()) * 2.0F
	       / f_285_) - 1.0F;
	class312.aClass435_3476.aFloatArray4830[14] = -1.0F;
	class312.aClass435_3477.method6954(anInterface38_9461
					       .method250((float) anInt9452),
					   anInterface38_9461
					       .method229((float) anInt9449),
					   1.0F, 1.0F);
	class312.anInterface35_3479 = aClass182_Sub1_9456.anInterface35_9311;
	class312.anInt3473 = 0;
	class312.aClass337_3480 = aClass182_Sub1_9456.aClass337_9261;
	Interface38 interface38
	    = ((Class152_Sub3) class152).anInterface38_9884;
	class312.anInterface38_3475 = interface38;
	class312.aClass435_3474.method6954(interface38
					       .method250((float) anInt9452),
					   interface38
					       .method229((float) anInt9449),
					   1.0F, 1.0F);
	class312.aClass435_3474.aFloatArray4830[12]
	    = interface38.method250((float) (i - i_283_));
	class312.aClass435_3474.aFloatArray4830[13]
	    = interface38.method229((float) (i_282_ - i_284_));
	class312.method5633();
    }
    
    void method2495(float f, float f_286_, float f_287_, float f_288_,
		    float f_289_, float f_290_, int i, Class152 class152,
		    int i_291_, int i_292_) {
	aClass182_Sub1_9456.method14752();
	Class312 class312 = aClass182_Sub1_9456.aClass312_9249;
	class312.anInterface38_3481 = anInterface38_9461;
	class312.method5634(1, -1);
	float f_293_
	    = (float) aClass182_Sub1_9456.method3566(172456889).method2710();
	float f_294_
	    = (float) aClass182_Sub1_9456.method3566(-1905696983).method2711();
	class312.aClass435_3476.method7023();
	if (aBool9454) {
	    float f_295_ = (float) anInt9452 / (float) method12();
	    float f_296_ = (float) anInt9449 / (float) method2472();
	    class312.aClass435_3476.aFloatArray4830[0] = (f_287_ - f) * f_295_;
	    class312.aClass435_3476.aFloatArray4830[1]
		= (f_288_ - f_286_) * f_295_;
	    class312.aClass435_3476.aFloatArray4830[4] = (f_289_ - f) * f_296_;
	    class312.aClass435_3476.aFloatArray4830[5]
		= (f_290_ - f_286_) * f_296_;
	    class312.aClass435_3476.aFloatArray4830[12]
		= ((f + (float) anInt9462) * f_295_
		   + aClass182_Sub1_9456.method14674());
	    class312.aClass435_3476.aFloatArray4830[13]
		= ((f_286_ + (float) anInt9455) * f_296_
		   + aClass182_Sub1_9456.method14674());
	} else {
	    class312.aClass435_3476.aFloatArray4830[0] = f_287_ - f;
	    class312.aClass435_3476.aFloatArray4830[1] = f_288_ - f_286_;
	    class312.aClass435_3476.aFloatArray4830[4] = f_289_ - f;
	    class312.aClass435_3476.aFloatArray4830[5] = f_290_ - f_286_;
	    class312.aClass435_3476.aFloatArray4830[12]
		= f + aClass182_Sub1_9456.method14674();
	    class312.aClass435_3476.aFloatArray4830[13]
		= f_286_ + aClass182_Sub1_9456.method14674();
	}
	Class435 class435 = aClass182_Sub1_9456.aClass435_9180;
	class435.method7023();
	class435.aFloatArray4830[0] = 2.0F / f_293_;
	class435.aFloatArray4830[5] = 2.0F / f_294_;
	class435.aFloatArray4830[12] = -1.0F;
	class435.aFloatArray4830[13] = -1.0F;
	class435.aFloatArray4830[14] = -1.0F;
	class312.aClass435_3476.method6950(class435);
	class312.aClass435_3477.method6954(anInterface38_9461
					       .method250((float) anInt9452),
					   anInterface38_9461
					       .method229((float) anInt9449),
					   1.0F, 1.0F);
	class312.anInterface35_3479 = aClass182_Sub1_9456.anInterface35_9311;
	class312.anInt3473 = 0;
	class312.aClass337_3480 = aClass182_Sub1_9456.aClass337_9261;
	Interface38 interface38
	    = ((Class152_Sub3) class152).anInterface38_9884;
	class312.anInterface38_3475 = interface38;
	class312.aClass435_3474.method7023();
	class312.aClass435_3474.aFloatArray4830[0]
	    = (f_287_ - f) * interface38.method250(1.0F);
	class312.aClass435_3474.aFloatArray4830[1]
	    = (f_288_ - f_286_) * interface38.method250(1.0F);
	class312.aClass435_3474.aFloatArray4830[4]
	    = (f_289_ - f) * interface38.method229(1.0F);
	class312.aClass435_3474.aFloatArray4830[5]
	    = (f_290_ - f_286_) * interface38.method229(1.0F);
	class312.aClass435_3474.aFloatArray4830[12]
	    = (f - (float) i_291_) * interface38.method250(1.0F);
	class312.aClass435_3474.aFloatArray4830[13]
	    = (f_286_ - (float) i_292_) * interface38.method229(1.0F);
	class312.method5633();
    }
    
    public void method2516(int i, int i_297_, int i_298_, int i_299_) {
	anInt9462 = i;
	anInt9455 = i_297_;
	anInt9458 = i_298_;
	anInt9457 = i_299_;
	aBool9454 = (anInt9462 != 0 || anInt9455 != 0 || anInt9458 != 0
		     || anInt9457 != 0);
    }
    
    public void method2517(int i, int i_300_, int i_301_, int i_302_) {
	anInt9462 = i;
	anInt9455 = i_300_;
	anInt9458 = i_301_;
	anInt9457 = i_302_;
	aBool9454 = (anInt9462 != 0 || anInt9455 != 0 || anInt9458 != 0
		     || anInt9457 != 0);
    }
    
    public void method2541(int[] is) {
	is[0] = anInt9462;
	is[1] = anInt9455;
	is[2] = anInt9458;
	is[3] = anInt9457;
    }
    
    public int method2519() {
	return anInt9452;
    }
    
    public Interface21 method2502() {
	return anInterface21_9451;
    }
    
    void method2493(float f, float f_303_, float f_304_, float f_305_,
		    float f_306_, float f_307_, int i, int i_308_, int i_309_,
		    int i_310_) {
	if (aClass182_Sub1_9456.method14675() != Class348.aClass348_3732)
	    aClass182_Sub1_9456.aClass360_9259.method6285
		(f, f_303_, f_304_, f_305_, f_306_, f_307_,
		 f_304_ + f_306_ - f, f_305_ + f_307_ - f_303_, 0.0F, 0.0F,
		 anInterface38_9461.method237(), 0.0F, 0.0F,
		 anInterface38_9461.method247(),
		 anInterface38_9461.method237(),
		 anInterface38_9461.method247(), anInterface38_9461, i_308_);
	else {
	    aClass182_Sub1_9456.method14752();
	    aClass182_Sub1_9456.method14779(i_309_);
	    if (aBool9454) {
		float f_311_ = (float) method12();
		float f_312_ = (float) method2472();
		float f_313_ = (f_304_ - f) / f_311_;
		float f_314_ = (f_305_ - f_303_) / f_311_;
		float f_315_ = (f_306_ - f) / f_312_;
		float f_316_ = (f_307_ - f_303_) / f_312_;
		float f_317_ = f_315_ * (float) anInt9455;
		float f_318_ = f_316_ * (float) anInt9455;
		float f_319_ = f_313_ * (float) anInt9462;
		float f_320_ = f_314_ * (float) anInt9462;
		float f_321_ = -f_313_ * (float) anInt9458;
		float f_322_ = -f_314_ * (float) anInt9458;
		float f_323_ = -f_315_ * (float) anInt9457;
		float f_324_ = -f_316_ * (float) anInt9457;
		f = f + f_319_ + f_317_;
		f_303_ = f_303_ + f_320_ + f_318_;
		f_304_ = f_304_ + f_321_ + f_317_;
		f_305_ = f_305_ + f_322_ + f_318_;
		f_306_ = f_306_ + f_319_ + f_323_;
		f_307_ = f_307_ + f_320_ + f_324_;
	    }
	    Class312 class312 = aClass182_Sub1_9456.aClass312_9249;
	    class312.anInterface38_3481 = anInterface38_9461;
	    class312.method5634(i, i_308_);
	    float f_325_ = (float) aClass182_Sub1_9456.method3566
				       (554611216).method2710();
	    float f_326_ = (float) aClass182_Sub1_9456.method3566
				       (346436101).method2711();
	    class312.aClass435_3476.method7023();
	    class312.aClass435_3476.aFloatArray4830[0]
		= (f_304_ - f) * 2.0F / f_325_;
	    class312.aClass435_3476.aFloatArray4830[1]
		= (f_305_ - f_303_) * 2.0F / f_326_;
	    class312.aClass435_3476.aFloatArray4830[4]
		= (f_306_ - f) * 2.0F / f_325_;
	    class312.aClass435_3476.aFloatArray4830[5]
		= (f_307_ - f_303_) * 2.0F / f_326_;
	    class312.aClass435_3476.aFloatArray4830[12]
		= ((f + aClass182_Sub1_9456.method14674()) * 2.0F / f_325_
		   - 1.0F);
	    class312.aClass435_3476.aFloatArray4830[13]
		= ((f_303_ + aClass182_Sub1_9456.method14674()) * 2.0F / f_326_
		   - 1.0F);
	    class312.aClass435_3476.aFloatArray4830[14] = -1.0F;
	    class312.aClass435_3477.method6954
		(anInterface38_9461.method250((float) anInt9452),
		 anInterface38_9461.method229((float) anInt9449), 1.0F, 1.0F);
	    class312.anInterface35_3479
		= aClass182_Sub1_9456.anInterface35_9311;
	    class312.anInt3473 = 0;
	    class312.aClass337_3480 = aClass182_Sub1_9456.aClass337_9261;
	    class312.method5635();
	}
    }
    
    public void method2544(int i, int i_327_, int i_328_, int i_329_,
			   int i_330_, int i_331_, int i_332_) {
	if (aClass182_Sub1_9456.method14675() != Class348.aClass348_3732) {
	    int i_333_ = i_327_ + i_329_;
	    int i_334_ = i + i_328_;
	    int i_335_ = method12();
	    int i_336_ = method2472();
	    int i_337_ = i_327_ + anInt9455;
	    for (int i_338_ = i_337_ + anInt9449; i_338_ <= i_333_;
		 i_338_ += i_336_) {
		int i_339_ = i + anInt9462;
		for (int i_340_ = i_339_ + anInt9452; i_340_ <= i_334_;
		     i_340_ += i_335_) {
		    aClass182_Sub1_9456.aClass360_9259.method6274
			((float) i_339_, (float) i_337_,
			 (float) (i_339_ + anInt9452),
			 (float) (i_337_ + anInt9449), 0.0F, 0.0F,
			 anInterface38_9461.method237(),
			 anInterface38_9461.method247(), anInterface38_9461,
			 i_331_);
		    i_339_ += i_335_;
		}
		if (i_339_ < i_334_) {
		    int i_341_ = i_334_ - i_339_;
		    aClass182_Sub1_9456.aClass360_9259.method6274
			((float) i_339_, (float) i_337_,
			 (float) (i_339_ + i_341_),
			 (float) (i_337_ + anInt9449), 0.0F, 0.0F,
			 ((float) i_341_ / (float) anInt9452
			  * anInterface38_9461.method237()),
			 anInterface38_9461.method247(), anInterface38_9461,
			 i_331_);
		}
		i_337_ += i_336_;
	    }
	    if (i_337_ < i_333_) {
		int i_342_ = i_333_ - i_337_;
		float f = ((float) i_342_ / (float) anInt9449
			   * anInterface38_9461.method247());
		int i_343_ = i + anInt9462;
		for (int i_344_ = i_343_ + anInt9452; i_344_ <= i_334_;
		     i_344_ += i_335_) {
		    aClass182_Sub1_9456.aClass360_9259.method6274
			((float) i_343_, (float) i_337_,
			 (float) (i_343_ + anInt9452),
			 (float) (i_337_ + i_342_), 0.0F, 0.0F,
			 anInterface38_9461.method237(), f, anInterface38_9461,
			 i_331_);
		    i_343_ += i_335_;
		}
		if (i_343_ < i_334_) {
		    int i_345_ = i_334_ - i_343_;
		    aClass182_Sub1_9456.aClass360_9259.method6274
			((float) i_343_, (float) i_337_,
			 (float) (i_343_ + i_345_), (float) (i_337_ + i_342_),
			 0.0F, 0.0F,
			 ((float) i_345_ / (float) anInt9452
			  * anInterface38_9461.method237()),
			 f, anInterface38_9461, i_331_);
		}
	    }
	} else {
	    aClass182_Sub1_9456.method14752();
	    aClass182_Sub1_9456.method14779(i_332_);
	    Class312 class312 = aClass182_Sub1_9456.aClass312_9249;
	    class312.anInterface38_3481 = anInterface38_9461;
	    class312.method5634(i_330_, i_331_);
	    float f = (float) aClass182_Sub1_9456.method3566(-1325425843)
				  .method2710();
	    float f_346_ = (float) aClass182_Sub1_9456.method3566
				       (-854616112).method2711();
	    class312.anInterface35_3479
		= aClass182_Sub1_9456.anInterface35_9311;
	    class312.anInt3473 = 0;
	    class312.aClass337_3480 = aClass182_Sub1_9456.aClass337_9261;
	    boolean bool = aBool9450 && anInt9455 == 0 && anInt9457 == 0;
	    boolean bool_347_ = aBool9453 && anInt9462 == 0 && anInt9458 == 0;
	    if (bool_347_ & bool) {
		class312.aClass435_3476.method6954((float) i_328_ * 2.0F / f,
						   ((float) i_329_ * 2.0F
						    / f_346_),
						   1.0F, 1.0F);
		class312.aClass435_3476.aFloatArray4830[12]
		    = (((float) i + aClass182_Sub1_9456.method14674()) * 2.0F
		       / f) - 1.0F;
		class312.aClass435_3476.aFloatArray4830[13]
		    = (((float) i_327_ + aClass182_Sub1_9456.method14674())
		       * 2.0F / f_346_) - 1.0F;
		class312.aClass435_3476.aFloatArray4830[14] = -1.0F;
		class312.aClass435_3477.method6954
		    (anInterface38_9461.method250((float) i_328_),
		     anInterface38_9461.method229((float) i_329_), 1.0F, 1.0F);
		class312.method5635();
	    } else if (bool_347_) {
		int i_348_ = i_327_ + i_329_;
		int i_349_ = method2472();
		class312.aClass435_3477.method6954
		    (anInterface38_9461.method250((float) i_328_),
		     anInterface38_9461.method229((float) anInt9449), 1.0F,
		     1.0F);
		int i_350_ = i_327_ + anInt9455;
		for (int i_351_ = i_350_ + anInt9449; i_351_ <= i_348_;
		     i_351_ += i_349_) {
		    class312.aClass435_3476.method6954(((float) i_328_ * 2.0F
							/ f),
						       ((float) anInt9449
							* 2.0F / f_346_),
						       1.0F, 1.0F);
		    class312.aClass435_3476.aFloatArray4830[12]
			= (((float) i + aClass182_Sub1_9456.method14674())
			   * 2.0F / f) - 1.0F;
		    class312.aClass435_3476.aFloatArray4830[13]
			= (((float) i_350_ + aClass182_Sub1_9456.method14674())
			   * 2.0F / f_346_) - 1.0F;
		    class312.aClass435_3476.aFloatArray4830[14] = -1.0F;
		    class312.method5635();
		    i_350_ += i_349_;
		}
		if (i_350_ < i_348_) {
		    int i_352_ = i_348_ - i_350_;
		    class312.aClass435_3477.method6954
			(anInterface38_9461.method250((float) i_328_),
			 anInterface38_9461.method229((float) i_352_), 1.0F,
			 1.0F);
		    class312.aClass435_3476.method6954(((float) i_328_ * 2.0F
							/ f),
						       ((float) i_352_ * 2.0F
							/ f_346_),
						       1.0F, 1.0F);
		    class312.aClass435_3476.aFloatArray4830[12]
			= (((float) i + aClass182_Sub1_9456.method14674())
			   * 2.0F / f) - 1.0F;
		    class312.aClass435_3476.aFloatArray4830[13]
			= (((float) i_350_ + aClass182_Sub1_9456.method14674())
			   * 2.0F / f_346_) - 1.0F;
		    class312.aClass435_3476.aFloatArray4830[14] = -1.0F;
		    class312.method5635();
		}
	    } else if (bool) {
		int i_353_ = i + i_328_;
		int i_354_ = method12();
		class312.aClass435_3477.method6954
		    (anInterface38_9461.method250((float) anInt9452),
		     anInterface38_9461.method229((float) i_329_), 1.0F, 1.0F);
		int i_355_ = i + anInt9462;
		for (int i_356_ = i_355_ + anInt9452; i_356_ <= i_353_;
		     i_356_ += i_354_) {
		    class312.aClass435_3476.method6954(((float) anInt9452
							* 2.0F / f),
						       ((float) i_329_ * 2.0F
							/ f_346_),
						       1.0F, 1.0F);
		    class312.aClass435_3476.aFloatArray4830[12]
			= (((float) i_355_ + aClass182_Sub1_9456.method14674())
			   * 2.0F / f) - 1.0F;
		    class312.aClass435_3476.aFloatArray4830[13]
			= (((float) i_327_ + aClass182_Sub1_9456.method14674())
			   * 2.0F / f_346_) - 1.0F;
		    class312.aClass435_3476.aFloatArray4830[14] = -1.0F;
		    class312.method5635();
		    i_355_ += i_354_;
		}
		if (i_355_ < i_353_) {
		    int i_357_ = i_353_ - i_355_;
		    class312.aClass435_3477.method6954
			(anInterface38_9461.method250((float) i_357_),
			 anInterface38_9461.method229((float) i_329_), 1.0F,
			 1.0F);
		    class312.aClass435_3476.method6954(((float) i_357_ * 2.0F
							/ f),
						       ((float) i_329_ * 2.0F
							/ f_346_),
						       1.0F, 1.0F);
		    class312.aClass435_3476.aFloatArray4830[12]
			= (((float) i_355_ + aClass182_Sub1_9456.method14674())
			   * 2.0F / f) - 1.0F;
		    class312.aClass435_3476.aFloatArray4830[13]
			= (((float) i_327_ + aClass182_Sub1_9456.method14674())
			   * 2.0F / f_346_) - 1.0F;
		    class312.aClass435_3476.aFloatArray4830[14] = -1.0F;
		    class312.method5635();
		}
	    } else {
		int i_358_ = i_327_ + i_329_;
		int i_359_ = i + i_328_;
		int i_360_ = method12();
		int i_361_ = method2472();
		int i_362_ = i_327_ + anInt9455;
		for (int i_363_ = i_362_ + anInt9449; i_363_ <= i_358_;
		     i_363_ += i_361_) {
		    class312.aClass435_3477.method6954
			(anInterface38_9461.method250((float) anInt9452),
			 anInterface38_9461.method229((float) anInt9449), 1.0F,
			 1.0F);
		    int i_364_ = i + anInt9462;
		    for (int i_365_ = i_364_ + anInt9452; i_365_ <= i_359_;
			 i_365_ += i_360_) {
			class312.aClass435_3476.method6954(((float) anInt9452
							    * 2.0F / f),
							   ((float) anInt9449
							    * 2.0F / f_346_),
							   1.0F, 1.0F);
			class312.aClass435_3476.aFloatArray4830[12]
			    = (((float) i_364_
				+ aClass182_Sub1_9456.method14674()) * 2.0F / f
			       - 1.0F);
			class312.aClass435_3476.aFloatArray4830[13]
			    = (((float) i_362_
				+ aClass182_Sub1_9456.method14674())
			       * 2.0F / f_346_) - 1.0F;
			class312.aClass435_3476.aFloatArray4830[14] = -1.0F;
			class312.method5635();
			i_364_ += i_360_;
		    }
		    if (i_364_ < i_359_) {
			int i_366_ = i_359_ - i_364_;
			class312.aClass435_3477.method6954
			    (anInterface38_9461.method250((float) i_366_),
			     anInterface38_9461.method229((float) anInt9449),
			     1.0F, 1.0F);
			class312.aClass435_3476.method6954(((float) i_366_
							    * 2.0F / f),
							   ((float) anInt9449
							    * 2.0F / f_346_),
							   1.0F, 1.0F);
			class312.aClass435_3476.aFloatArray4830[12]
			    = (((float) i_364_
				+ aClass182_Sub1_9456.method14674()) * 2.0F / f
			       - 1.0F);
			class312.aClass435_3476.aFloatArray4830[13]
			    = (((float) i_362_
				+ aClass182_Sub1_9456.method14674())
			       * 2.0F / f_346_) - 1.0F;
			class312.aClass435_3476.aFloatArray4830[14] = -1.0F;
			class312.method5635();
		    }
		    i_362_ += i_361_;
		}
		if (i_362_ < i_358_) {
		    int i_367_ = i_358_ - i_362_;
		    class312.aClass435_3477.method6954
			(anInterface38_9461.method250((float) anInt9452),
			 anInterface38_9461.method229((float) i_367_), 1.0F,
			 1.0F);
		    int i_368_ = i + anInt9462;
		    for (int i_369_ = i_368_ + anInt9452; i_369_ <= i_359_;
			 i_369_ += i_360_) {
			class312.aClass435_3476.method6954(((float) anInt9452
							    * 2.0F / f),
							   ((float) i_367_
							    * 2.0F / f_346_),
							   1.0F, 1.0F);
			class312.aClass435_3476.aFloatArray4830[12]
			    = (((float) i_368_
				+ aClass182_Sub1_9456.method14674()) * 2.0F / f
			       - 1.0F);
			class312.aClass435_3476.aFloatArray4830[13]
			    = (((float) i_362_
				+ aClass182_Sub1_9456.method14674())
			       * 2.0F / f_346_) - 1.0F;
			class312.aClass435_3476.aFloatArray4830[14] = -1.0F;
			class312.method5635();
			i_368_ += i_360_;
		    }
		    if (i_368_ < i_359_) {
			int i_370_ = i_359_ - i_368_;
			class312.aClass435_3477.method6954
			    (anInterface38_9461.method250((float) i_370_),
			     anInterface38_9461.method229((float) i_367_),
			     1.0F, 1.0F);
			class312.aClass435_3476.method6954(((float) i_370_
							    * 2.0F / f),
							   ((float) i_367_
							    * 2.0F / f_346_),
							   1.0F, 1.0F);
			class312.aClass435_3476.aFloatArray4830[12]
			    = (((float) i_368_
				+ aClass182_Sub1_9456.method14674()) * 2.0F / f
			       - 1.0F);
			class312.aClass435_3476.aFloatArray4830[13]
			    = (((float) i_362_
				+ aClass182_Sub1_9456.method14674())
			       * 2.0F / f_346_) - 1.0F;
			class312.aClass435_3476.aFloatArray4830[14] = -1.0F;
			class312.method5635();
		    }
		}
	    }
	}
    }
    
    public void method2511(int i, int i_371_, int i_372_, int i_373_,
			   int i_374_, int i_375_, int i_376_) {
	if (aClass182_Sub1_9456.method14675() != Class348.aClass348_3732) {
	    int i_377_ = i_371_ + i_373_;
	    int i_378_ = i + i_372_;
	    int i_379_ = method12();
	    int i_380_ = method2472();
	    int i_381_ = i_371_ + anInt9455;
	    for (int i_382_ = i_381_ + anInt9449; i_382_ <= i_377_;
		 i_382_ += i_380_) {
		int i_383_ = i + anInt9462;
		for (int i_384_ = i_383_ + anInt9452; i_384_ <= i_378_;
		     i_384_ += i_379_) {
		    aClass182_Sub1_9456.aClass360_9259.method6274
			((float) i_383_, (float) i_381_,
			 (float) (i_383_ + anInt9452),
			 (float) (i_381_ + anInt9449), 0.0F, 0.0F,
			 anInterface38_9461.method237(),
			 anInterface38_9461.method247(), anInterface38_9461,
			 i_375_);
		    i_383_ += i_379_;
		}
		if (i_383_ < i_378_) {
		    int i_385_ = i_378_ - i_383_;
		    aClass182_Sub1_9456.aClass360_9259.method6274
			((float) i_383_, (float) i_381_,
			 (float) (i_383_ + i_385_),
			 (float) (i_381_ + anInt9449), 0.0F, 0.0F,
			 ((float) i_385_ / (float) anInt9452
			  * anInterface38_9461.method237()),
			 anInterface38_9461.method247(), anInterface38_9461,
			 i_375_);
		}
		i_381_ += i_380_;
	    }
	    if (i_381_ < i_377_) {
		int i_386_ = i_377_ - i_381_;
		float f = ((float) i_386_ / (float) anInt9449
			   * anInterface38_9461.method247());
		int i_387_ = i + anInt9462;
		for (int i_388_ = i_387_ + anInt9452; i_388_ <= i_378_;
		     i_388_ += i_379_) {
		    aClass182_Sub1_9456.aClass360_9259.method6274
			((float) i_387_, (float) i_381_,
			 (float) (i_387_ + anInt9452),
			 (float) (i_381_ + i_386_), 0.0F, 0.0F,
			 anInterface38_9461.method237(), f, anInterface38_9461,
			 i_375_);
		    i_387_ += i_379_;
		}
		if (i_387_ < i_378_) {
		    int i_389_ = i_378_ - i_387_;
		    aClass182_Sub1_9456.aClass360_9259.method6274
			((float) i_387_, (float) i_381_,
			 (float) (i_387_ + i_389_), (float) (i_381_ + i_386_),
			 0.0F, 0.0F,
			 ((float) i_389_ / (float) anInt9452
			  * anInterface38_9461.method237()),
			 f, anInterface38_9461, i_375_);
		}
	    }
	} else {
	    aClass182_Sub1_9456.method14752();
	    aClass182_Sub1_9456.method14779(i_376_);
	    Class312 class312 = aClass182_Sub1_9456.aClass312_9249;
	    class312.anInterface38_3481 = anInterface38_9461;
	    class312.method5634(i_374_, i_375_);
	    float f = (float) aClass182_Sub1_9456.method3566(-699776409)
				  .method2710();
	    float f_390_ = (float) aClass182_Sub1_9456.method3566
				       (-1210283911).method2711();
	    class312.anInterface35_3479
		= aClass182_Sub1_9456.anInterface35_9311;
	    class312.anInt3473 = 0;
	    class312.aClass337_3480 = aClass182_Sub1_9456.aClass337_9261;
	    boolean bool = aBool9450 && anInt9455 == 0 && anInt9457 == 0;
	    boolean bool_391_ = aBool9453 && anInt9462 == 0 && anInt9458 == 0;
	    if (bool_391_ & bool) {
		class312.aClass435_3476.method6954((float) i_372_ * 2.0F / f,
						   ((float) i_373_ * 2.0F
						    / f_390_),
						   1.0F, 1.0F);
		class312.aClass435_3476.aFloatArray4830[12]
		    = (((float) i + aClass182_Sub1_9456.method14674()) * 2.0F
		       / f) - 1.0F;
		class312.aClass435_3476.aFloatArray4830[13]
		    = (((float) i_371_ + aClass182_Sub1_9456.method14674())
		       * 2.0F / f_390_) - 1.0F;
		class312.aClass435_3476.aFloatArray4830[14] = -1.0F;
		class312.aClass435_3477.method6954
		    (anInterface38_9461.method250((float) i_372_),
		     anInterface38_9461.method229((float) i_373_), 1.0F, 1.0F);
		class312.method5635();
	    } else if (bool_391_) {
		int i_392_ = i_371_ + i_373_;
		int i_393_ = method2472();
		class312.aClass435_3477.method6954
		    (anInterface38_9461.method250((float) i_372_),
		     anInterface38_9461.method229((float) anInt9449), 1.0F,
		     1.0F);
		int i_394_ = i_371_ + anInt9455;
		for (int i_395_ = i_394_ + anInt9449; i_395_ <= i_392_;
		     i_395_ += i_393_) {
		    class312.aClass435_3476.method6954(((float) i_372_ * 2.0F
							/ f),
						       ((float) anInt9449
							* 2.0F / f_390_),
						       1.0F, 1.0F);
		    class312.aClass435_3476.aFloatArray4830[12]
			= (((float) i + aClass182_Sub1_9456.method14674())
			   * 2.0F / f) - 1.0F;
		    class312.aClass435_3476.aFloatArray4830[13]
			= (((float) i_394_ + aClass182_Sub1_9456.method14674())
			   * 2.0F / f_390_) - 1.0F;
		    class312.aClass435_3476.aFloatArray4830[14] = -1.0F;
		    class312.method5635();
		    i_394_ += i_393_;
		}
		if (i_394_ < i_392_) {
		    int i_396_ = i_392_ - i_394_;
		    class312.aClass435_3477.method6954
			(anInterface38_9461.method250((float) i_372_),
			 anInterface38_9461.method229((float) i_396_), 1.0F,
			 1.0F);
		    class312.aClass435_3476.method6954(((float) i_372_ * 2.0F
							/ f),
						       ((float) i_396_ * 2.0F
							/ f_390_),
						       1.0F, 1.0F);
		    class312.aClass435_3476.aFloatArray4830[12]
			= (((float) i + aClass182_Sub1_9456.method14674())
			   * 2.0F / f) - 1.0F;
		    class312.aClass435_3476.aFloatArray4830[13]
			= (((float) i_394_ + aClass182_Sub1_9456.method14674())
			   * 2.0F / f_390_) - 1.0F;
		    class312.aClass435_3476.aFloatArray4830[14] = -1.0F;
		    class312.method5635();
		}
	    } else if (bool) {
		int i_397_ = i + i_372_;
		int i_398_ = method12();
		class312.aClass435_3477.method6954
		    (anInterface38_9461.method250((float) anInt9452),
		     anInterface38_9461.method229((float) i_373_), 1.0F, 1.0F);
		int i_399_ = i + anInt9462;
		for (int i_400_ = i_399_ + anInt9452; i_400_ <= i_397_;
		     i_400_ += i_398_) {
		    class312.aClass435_3476.method6954(((float) anInt9452
							* 2.0F / f),
						       ((float) i_373_ * 2.0F
							/ f_390_),
						       1.0F, 1.0F);
		    class312.aClass435_3476.aFloatArray4830[12]
			= (((float) i_399_ + aClass182_Sub1_9456.method14674())
			   * 2.0F / f) - 1.0F;
		    class312.aClass435_3476.aFloatArray4830[13]
			= (((float) i_371_ + aClass182_Sub1_9456.method14674())
			   * 2.0F / f_390_) - 1.0F;
		    class312.aClass435_3476.aFloatArray4830[14] = -1.0F;
		    class312.method5635();
		    i_399_ += i_398_;
		}
		if (i_399_ < i_397_) {
		    int i_401_ = i_397_ - i_399_;
		    class312.aClass435_3477.method6954
			(anInterface38_9461.method250((float) i_401_),
			 anInterface38_9461.method229((float) i_373_), 1.0F,
			 1.0F);
		    class312.aClass435_3476.method6954(((float) i_401_ * 2.0F
							/ f),
						       ((float) i_373_ * 2.0F
							/ f_390_),
						       1.0F, 1.0F);
		    class312.aClass435_3476.aFloatArray4830[12]
			= (((float) i_399_ + aClass182_Sub1_9456.method14674())
			   * 2.0F / f) - 1.0F;
		    class312.aClass435_3476.aFloatArray4830[13]
			= (((float) i_371_ + aClass182_Sub1_9456.method14674())
			   * 2.0F / f_390_) - 1.0F;
		    class312.aClass435_3476.aFloatArray4830[14] = -1.0F;
		    class312.method5635();
		}
	    } else {
		int i_402_ = i_371_ + i_373_;
		int i_403_ = i + i_372_;
		int i_404_ = method12();
		int i_405_ = method2472();
		int i_406_ = i_371_ + anInt9455;
		for (int i_407_ = i_406_ + anInt9449; i_407_ <= i_402_;
		     i_407_ += i_405_) {
		    class312.aClass435_3477.method6954
			(anInterface38_9461.method250((float) anInt9452),
			 anInterface38_9461.method229((float) anInt9449), 1.0F,
			 1.0F);
		    int i_408_ = i + anInt9462;
		    for (int i_409_ = i_408_ + anInt9452; i_409_ <= i_403_;
			 i_409_ += i_404_) {
			class312.aClass435_3476.method6954(((float) anInt9452
							    * 2.0F / f),
							   ((float) anInt9449
							    * 2.0F / f_390_),
							   1.0F, 1.0F);
			class312.aClass435_3476.aFloatArray4830[12]
			    = (((float) i_408_
				+ aClass182_Sub1_9456.method14674()) * 2.0F / f
			       - 1.0F);
			class312.aClass435_3476.aFloatArray4830[13]
			    = (((float) i_406_
				+ aClass182_Sub1_9456.method14674())
			       * 2.0F / f_390_) - 1.0F;
			class312.aClass435_3476.aFloatArray4830[14] = -1.0F;
			class312.method5635();
			i_408_ += i_404_;
		    }
		    if (i_408_ < i_403_) {
			int i_410_ = i_403_ - i_408_;
			class312.aClass435_3477.method6954
			    (anInterface38_9461.method250((float) i_410_),
			     anInterface38_9461.method229((float) anInt9449),
			     1.0F, 1.0F);
			class312.aClass435_3476.method6954(((float) i_410_
							    * 2.0F / f),
							   ((float) anInt9449
							    * 2.0F / f_390_),
							   1.0F, 1.0F);
			class312.aClass435_3476.aFloatArray4830[12]
			    = (((float) i_408_
				+ aClass182_Sub1_9456.method14674()) * 2.0F / f
			       - 1.0F);
			class312.aClass435_3476.aFloatArray4830[13]
			    = (((float) i_406_
				+ aClass182_Sub1_9456.method14674())
			       * 2.0F / f_390_) - 1.0F;
			class312.aClass435_3476.aFloatArray4830[14] = -1.0F;
			class312.method5635();
		    }
		    i_406_ += i_405_;
		}
		if (i_406_ < i_402_) {
		    int i_411_ = i_402_ - i_406_;
		    class312.aClass435_3477.method6954
			(anInterface38_9461.method250((float) anInt9452),
			 anInterface38_9461.method229((float) i_411_), 1.0F,
			 1.0F);
		    int i_412_ = i + anInt9462;
		    for (int i_413_ = i_412_ + anInt9452; i_413_ <= i_403_;
			 i_413_ += i_404_) {
			class312.aClass435_3476.method6954(((float) anInt9452
							    * 2.0F / f),
							   ((float) i_411_
							    * 2.0F / f_390_),
							   1.0F, 1.0F);
			class312.aClass435_3476.aFloatArray4830[12]
			    = (((float) i_412_
				+ aClass182_Sub1_9456.method14674()) * 2.0F / f
			       - 1.0F);
			class312.aClass435_3476.aFloatArray4830[13]
			    = (((float) i_406_
				+ aClass182_Sub1_9456.method14674())
			       * 2.0F / f_390_) - 1.0F;
			class312.aClass435_3476.aFloatArray4830[14] = -1.0F;
			class312.method5635();
			i_412_ += i_404_;
		    }
		    if (i_412_ < i_403_) {
			int i_414_ = i_403_ - i_412_;
			class312.aClass435_3477.method6954
			    (anInterface38_9461.method250((float) i_414_),
			     anInterface38_9461.method229((float) i_411_),
			     1.0F, 1.0F);
			class312.aClass435_3476.method6954(((float) i_414_
							    * 2.0F / f),
							   ((float) i_411_
							    * 2.0F / f_390_),
							   1.0F, 1.0F);
			class312.aClass435_3476.aFloatArray4830[12]
			    = (((float) i_412_
				+ aClass182_Sub1_9456.method14674()) * 2.0F / f
			       - 1.0F);
			class312.aClass435_3476.aFloatArray4830[13]
			    = (((float) i_406_
				+ aClass182_Sub1_9456.method14674())
			       * 2.0F / f_390_) - 1.0F;
			class312.aClass435_3476.aFloatArray4830[14] = -1.0F;
			class312.method5635();
		    }
		}
	    }
	}
    }
    
    public void method2498(int i, int i_415_, int i_416_, int i_417_,
			   int i_418_, int i_419_) {
	anInterface38_9461.method251(i, i_415_, i_416_, i_417_, i_418_,
				     i_419_);
    }
    
    void method2524(float f, float f_420_, float f_421_, float f_422_,
		    float f_423_, float f_424_, int i, int i_425_, int i_426_,
		    int i_427_) {
	if (aClass182_Sub1_9456.method14675() != Class348.aClass348_3732)
	    aClass182_Sub1_9456.aClass360_9259.method6285
		(f, f_420_, f_421_, f_422_, f_423_, f_424_,
		 f_421_ + f_423_ - f, f_422_ + f_424_ - f_420_, 0.0F, 0.0F,
		 anInterface38_9461.method237(), 0.0F, 0.0F,
		 anInterface38_9461.method247(),
		 anInterface38_9461.method237(),
		 anInterface38_9461.method247(), anInterface38_9461, i_425_);
	else {
	    aClass182_Sub1_9456.method14752();
	    aClass182_Sub1_9456.method14779(i_426_);
	    if (aBool9454) {
		float f_428_ = (float) method12();
		float f_429_ = (float) method2472();
		float f_430_ = (f_421_ - f) / f_428_;
		float f_431_ = (f_422_ - f_420_) / f_428_;
		float f_432_ = (f_423_ - f) / f_429_;
		float f_433_ = (f_424_ - f_420_) / f_429_;
		float f_434_ = f_432_ * (float) anInt9455;
		float f_435_ = f_433_ * (float) anInt9455;
		float f_436_ = f_430_ * (float) anInt9462;
		float f_437_ = f_431_ * (float) anInt9462;
		float f_438_ = -f_430_ * (float) anInt9458;
		float f_439_ = -f_431_ * (float) anInt9458;
		float f_440_ = -f_432_ * (float) anInt9457;
		float f_441_ = -f_433_ * (float) anInt9457;
		f = f + f_436_ + f_434_;
		f_420_ = f_420_ + f_437_ + f_435_;
		f_421_ = f_421_ + f_438_ + f_434_;
		f_422_ = f_422_ + f_439_ + f_435_;
		f_423_ = f_423_ + f_436_ + f_440_;
		f_424_ = f_424_ + f_437_ + f_441_;
	    }
	    Class312 class312 = aClass182_Sub1_9456.aClass312_9249;
	    class312.anInterface38_3481 = anInterface38_9461;
	    class312.method5634(i, i_425_);
	    float f_442_ = (float) aClass182_Sub1_9456.method3566
				       (-829345292).method2710();
	    float f_443_ = (float) aClass182_Sub1_9456.method3566
				       (-1845991096).method2711();
	    class312.aClass435_3476.method7023();
	    class312.aClass435_3476.aFloatArray4830[0]
		= (f_421_ - f) * 2.0F / f_442_;
	    class312.aClass435_3476.aFloatArray4830[1]
		= (f_422_ - f_420_) * 2.0F / f_443_;
	    class312.aClass435_3476.aFloatArray4830[4]
		= (f_423_ - f) * 2.0F / f_442_;
	    class312.aClass435_3476.aFloatArray4830[5]
		= (f_424_ - f_420_) * 2.0F / f_443_;
	    class312.aClass435_3476.aFloatArray4830[12]
		= ((f + aClass182_Sub1_9456.method14674()) * 2.0F / f_442_
		   - 1.0F);
	    class312.aClass435_3476.aFloatArray4830[13]
		= ((f_420_ + aClass182_Sub1_9456.method14674()) * 2.0F / f_443_
		   - 1.0F);
	    class312.aClass435_3476.aFloatArray4830[14] = -1.0F;
	    class312.aClass435_3477.method6954
		(anInterface38_9461.method250((float) anInt9452),
		 anInterface38_9461.method229((float) anInt9449), 1.0F, 1.0F);
	    class312.anInterface35_3479
		= aClass182_Sub1_9456.anInterface35_9311;
	    class312.anInt3473 = 0;
	    class312.aClass337_3480 = aClass182_Sub1_9456.aClass337_9261;
	    class312.method5635();
	}
    }
    
    public int method2520() {
	return anInt9452;
    }
    
    public int method2531() {
	return anInt9449 + anInt9455 + anInt9457;
    }
    
    Class157_Sub3(Class182_Sub1 class182_sub1, int i, int i_444_, boolean bool,
		  boolean bool_445_) {
	anInt9457 = 0;
	anInt9458 = 0;
	aClass182_Sub1_9456 = class182_sub1;
	anInt9452 = i;
	anInt9449 = i_444_;
	if (bool_445_) {
	    Interface42 interface42
		= class182_sub1.method14728((bool ? Class165.aClass165_1771
					     : Class165.aClass165_1775),
					    Class178.aClass178_1905, i,
					    i_444_);
	    anInterface21_9451 = interface42.method322(0);
	    anInterface38_9461 = interface42;
	} else {
	    anInterface38_9461
		= class182_sub1.method15043((bool ? Class165.aClass165_1771
					     : Class165.aClass165_1775),
					    Class178.aClass178_1905, i,
					    i_444_);
	    anInterface21_9451 = null;
	}
	anInterface38_9461.method231(true, true);
	aBool9459 = anInterface38_9461.method1() != i;
	aBool9460 = anInterface38_9461.method80() != i_444_;
	aBool9453 = !aBool9459 && anInterface38_9461.method210();
	aBool9450 = !aBool9460 && anInterface38_9461.method210();
    }
    
    public void method2505(int i, int i_446_, int i_447_, int i_448_,
			   int i_449_) {
	if (aClass182_Sub1_9456.method14675() != Class348.aClass348_3732) {
	    i += anInt9462;
	    i_446_ += anInt9455;
	    aClass182_Sub1_9456.aClass360_9259.method6274
		((float) i, (float) i_446_, (float) (i + anInt9452),
		 (float) (i_446_ + anInt9449), 0.0F, 0.0F,
		 anInterface38_9461.method237(),
		 anInterface38_9461.method247(), anInterface38_9461, i_448_);
	} else {
	    aClass182_Sub1_9456.method14752();
	    aClass182_Sub1_9456.method14779(i_449_);
	    Class312 class312 = aClass182_Sub1_9456.aClass312_9249;
	    class312.anInterface38_3481 = anInterface38_9461;
	    class312.method5634(i_447_, i_448_);
	    i += anInt9462;
	    i_446_ += anInt9455;
	    float f = (float) aClass182_Sub1_9456.method3566(-860991308)
				  .method2710();
	    float f_450_ = (float) aClass182_Sub1_9456.method3566
				       (-462177386).method2711();
	    class312.aClass435_3476.method6954((float) anInt9452 * 2.0F / f,
					       ((float) anInt9449 * 2.0F
						/ f_450_),
					       1.0F, 1.0F);
	    class312.aClass435_3476.aFloatArray4830[12]
		= (((float) i + aClass182_Sub1_9456.method14674()) * 2.0F / f
		   - 1.0F);
	    class312.aClass435_3476.aFloatArray4830[13]
		= (((float) i_446_ + aClass182_Sub1_9456.method14674()) * 2.0F
		   / f_450_) - 1.0F;
	    class312.aClass435_3476.aFloatArray4830[14] = -1.0F;
	    class312.aClass435_3477.method6954
		(anInterface38_9461.method250((float) anInt9452),
		 anInterface38_9461.method229((float) anInt9449), 1.0F, 1.0F);
	    class312.anInterface35_3479
		= aClass182_Sub1_9456.anInterface35_9311;
	    class312.anInt3473 = 0;
	    class312.aClass337_3480 = aClass182_Sub1_9456.aClass337_9261;
	    class312.method5635();
	}
    }
    
    public int method2529() {
	return anInt9449;
    }
    
    public int method2530() {
	return anInt9449 + anInt9455 + anInt9457;
    }
    
    public Interface21 method2521() {
	return anInterface21_9451;
    }
}
