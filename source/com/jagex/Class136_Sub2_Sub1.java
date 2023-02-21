/* Class136_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class136_Sub2_Sub1 extends Class136_Sub2
{
    float aFloat11432;
    int anInt11433;
    float aFloat11434;
    int anInt11435;
    boolean aBool11436;
    boolean aBool11437;
    
    static Class136_Sub2_Sub1 method18031(Class182_Sub3 class182_sub3, int i,
					  int i_0_, int i_1_, int i_2_) {
	if (class182_sub3.aBool9810 || (Class72.method1537(i_1_, (byte) 0)
					&& Class72.method1537(i_2_, (byte) 0)))
	    return new Class136_Sub2_Sub1(class182_sub3, 3553, i, i_0_, i_1_,
					  i_2_, true);
	if (class182_sub3.aBool9750)
	    return new Class136_Sub2_Sub1(class182_sub3, 34037, i, i_0_, i_1_,
					  i_2_, true);
	return new Class136_Sub2_Sub1(class182_sub3, i, i_0_, i_1_, i_2_,
				      Class212.method3935(i_1_, -2056250364),
				      Class212.method3935(i_2_, -2056250364),
				      true);
    }
    
    static Class136_Sub2_Sub1 method18032(Class182_Sub3 class182_sub3, int i,
					  int i_3_, int i_4_, int i_5_) {
	if (class182_sub3.aBool9810 || (Class72.method1537(i_4_, (byte) 0)
					&& Class72.method1537(i_5_, (byte) 0)))
	    return new Class136_Sub2_Sub1(class182_sub3, 3553, i, i_3_, i_4_,
					  i_5_, true);
	if (class182_sub3.aBool9750)
	    return new Class136_Sub2_Sub1(class182_sub3, 34037, i, i_3_, i_4_,
					  i_5_, true);
	return new Class136_Sub2_Sub1(class182_sub3, i, i_3_, i_4_, i_5_,
				      Class212.method3935(i_4_, -2056250364),
				      Class212.method3935(i_5_, -2056250364),
				      true);
    }
    
    static Class136_Sub2_Sub1 method18033
	(Class182_Sub3 class182_sub3, Class165 class165, Class178 class178,
	 int i, int i_6_, boolean bool, byte[] is, Class165 class165_7_) {
	if (class182_sub3.aBool9810
	    || Class72.method1537(i, (byte) 0) && Class72.method1537(i_6_,
								     (byte) 0))
	    return new Class136_Sub2_Sub1(class182_sub3, 3553, class165,
					  class178, i, i_6_, bool, is,
					  class165_7_);
	if (class182_sub3.aBool9750)
	    return new Class136_Sub2_Sub1(class182_sub3, 34037, class165,
					  class178, i, i_6_, bool, is,
					  class165_7_);
	return new Class136_Sub2_Sub1(class182_sub3, class165, class178, i,
				      i_6_,
				      Class212.method3935(i, -2056250364),
				      Class212.method3935(i_6_, -2056250364),
				      is, class165_7_);
    }
    
    Class136_Sub2_Sub1(Class182_Sub3 class182_sub3, int i, int i_8_, int i_9_,
		       boolean bool, int[] is, int i_10_, int i_11_) {
	super(class182_sub3, i, i_8_, i_9_, bool, is, i_10_, i_11_, true);
	anInt11435 = i_8_;
	anInt11433 = i_9_;
	if (anInt1625 == 34037) {
	    aFloat11434 = (float) i_9_;
	    aFloat11432 = (float) i_8_;
	    aBool11436 = false;
	} else {
	    aFloat11434 = 1.0F;
	    aFloat11432 = 1.0F;
	    aBool11436 = true;
	}
	aBool11437 = false;
    }
    
    Class136_Sub2_Sub1(Class182_Sub3 class182_sub3, int i, Class165 class165,
		       Class178 class178, int i_12_, int i_13_) {
	super(class182_sub3, i, class165, class178, i_12_, i_13_);
	anInt11435 = i_12_;
	anInt11433 = i_13_;
	if (anInt1625 == 34037) {
	    aFloat11434 = (float) i_13_;
	    aFloat11432 = (float) i_12_;
	    aBool11436 = false;
	} else {
	    aFloat11434 = 1.0F;
	    aFloat11432 = 1.0F;
	    aBool11436 = true;
	}
	aBool11437 = false;
    }
    
    static Class136_Sub2_Sub1 method18034(Class182_Sub3 class182_sub3, int i,
					  int i_14_, int i_15_, int i_16_) {
	if (class182_sub3.aBool9810
	    || (Class72.method1537(i_15_, (byte) 0)
		&& Class72.method1537(i_16_, (byte) 0)))
	    return new Class136_Sub2_Sub1(class182_sub3, 3553, i, i_14_, i_15_,
					  i_16_, true);
	if (class182_sub3.aBool9750)
	    return new Class136_Sub2_Sub1(class182_sub3, 34037, i, i_14_,
					  i_15_, i_16_, true);
	return new Class136_Sub2_Sub1(class182_sub3, i, i_14_, i_15_, i_16_,
				      Class212.method3935(i_15_, -2056250364),
				      Class212.method3935(i_16_, -2056250364),
				      true);
    }
    
    Class136_Sub2_Sub1(Class182_Sub3 class182_sub3, int i, Class165 class165,
		       Class178 class178, int i_17_, int i_18_, boolean bool,
		       byte[] is, Class165 class165_19_) {
	super(class182_sub3, i, class165, class178, i_17_, i_18_, bool, is,
	      class165_19_, true);
	anInt11435 = i_17_;
	anInt11433 = i_18_;
	if (anInt1625 == 34037) {
	    aFloat11434 = (float) i_18_;
	    aFloat11432 = (float) i_17_;
	    aBool11436 = false;
	} else {
	    aFloat11434 = 1.0F;
	    aFloat11432 = 1.0F;
	    aBool11436 = true;
	}
	aBool11437 = false;
    }
    
    Class136_Sub2_Sub1(Class182_Sub3 class182_sub3, int i, int i_20_,
		       int i_21_, int i_22_, int i_23_, boolean bool) {
	super(class182_sub3, i, i_20_, i_21_, i_22_, i_23_);
	anInt11435 = i_22_;
	anInt11433 = i_23_;
	if (anInt1625 == 34037) {
	    aFloat11434 = (float) i_23_;
	    aFloat11432 = (float) i_22_;
	    aBool11436 = false;
	} else {
	    aFloat11434 = 1.0F;
	    aFloat11432 = 1.0F;
	    aBool11436 = true;
	}
	aBool11437 = false;
    }
    
    Class136_Sub2_Sub1(Class182_Sub3 class182_sub3, Class165 class165,
		       Class178 class178, int i, int i_24_, int i_25_,
		       int i_26_) {
	super(class182_sub3, 3553, class165, class178, i_25_, i_26_);
	anInt11435 = i;
	anInt11433 = i_24_;
	aFloat11434 = (float) i_24_ / (float) i_26_;
	aFloat11432 = (float) i / (float) i_25_;
	aBool11436 = false;
	aBool11437 = true;
	method14474(false, false);
    }
    
    Class136_Sub2_Sub1(Class182_Sub3 class182_sub3, int i, int i_27_,
		       int i_28_, int i_29_, int[] is) {
	super(class182_sub3, 3553, Class165.aClass165_1771,
	      Class178.aClass178_1905, i_28_, i_29_);
	anInt11435 = i;
	anInt11433 = i_27_;
	method14485(0, i_29_ - i_27_, i, i_27_, is, 0, 0, true);
	aFloat11434 = (float) i_27_ / (float) i_29_;
	aFloat11432 = (float) i / (float) i_28_;
	aBool11436 = false;
	aBool11437 = true;
	method14474(false, false);
    }
    
    Class136_Sub2_Sub1(Class182_Sub3 class182_sub3, Class165 class165,
		       Class178 class178, int i, int i_30_, int i_31_,
		       int i_32_, byte[] is, Class165 class165_33_) {
	super(class182_sub3, 3553, class165, class178, i_31_, i_32_);
	anInt11435 = i;
	anInt11433 = i_30_;
	method14475(0, i_32_ - i_30_, i, i_30_, is, class165_33_, 0, 0, true);
	aFloat11434 = (float) i_30_ / (float) i_32_;
	aFloat11432 = (float) i / (float) i_31_;
	aBool11436 = false;
	aBool11437 = true;
	method14474(false, false);
    }
    
    Class136_Sub2_Sub1(Class182_Sub3 class182_sub3, int i, int i_34_,
		       int i_35_, int i_36_, int i_37_, int i_38_,
		       boolean bool) {
	super(class182_sub3, 3553, i, i_34_, i_37_, i_38_);
	anInt11435 = i_35_;
	anInt11433 = i_36_;
	aFloat11434 = (float) i_36_ / (float) i_38_;
	aFloat11432 = (float) i_35_ / (float) i_37_;
	aBool11436 = false;
	aBool11437 = true;
	method14474(false, false);
    }
    
    static Class136_Sub2_Sub1 method18035(Class182_Sub3 class182_sub3, int i,
					  int i_39_, boolean bool, int[] is,
					  int i_40_, int i_41_) {
	if (class182_sub3.aBool9810
	    || Class72.method1537(i, (byte) 0) && Class72.method1537(i_39_,
								     (byte) 0))
	    return new Class136_Sub2_Sub1(class182_sub3, 3553, i, i_39_, bool,
					  is, i_40_, i_41_);
	if (class182_sub3.aBool9750)
	    return new Class136_Sub2_Sub1(class182_sub3, 34037, i, i_39_, bool,
					  is, i_40_, i_41_);
	return new Class136_Sub2_Sub1(class182_sub3, i, i_39_,
				      Class212.method3935(i, -2056250364),
				      Class212.method3935(i_39_, -2056250364),
				      is);
    }
    
    static Class136_Sub2_Sub1 method18036(Class182_Sub3 class182_sub3, int i,
					  int i_42_, boolean bool, int[] is,
					  int i_43_, int i_44_) {
	if (class182_sub3.aBool9810
	    || Class72.method1537(i, (byte) 0) && Class72.method1537(i_42_,
								     (byte) 0))
	    return new Class136_Sub2_Sub1(class182_sub3, 3553, i, i_42_, bool,
					  is, i_43_, i_44_);
	if (class182_sub3.aBool9750)
	    return new Class136_Sub2_Sub1(class182_sub3, 34037, i, i_42_, bool,
					  is, i_43_, i_44_);
	return new Class136_Sub2_Sub1(class182_sub3, i, i_42_,
				      Class212.method3935(i, -2056250364),
				      Class212.method3935(i_42_, -2056250364),
				      is);
    }
    
    void method2304(boolean bool) {
	super.method2304(bool && !aBool11437);
    }
    
    static Class136_Sub2_Sub1 method18037(Class182_Sub3 class182_sub3,
					  Class165 class165, Class178 class178,
					  int i, int i_45_) {
	if (class182_sub3.aBool9810
	    || Class72.method1537(i, (byte) 0) && Class72.method1537(i_45_,
								     (byte) 0))
	    return new Class136_Sub2_Sub1(class182_sub3, 3553, class165,
					  class178, i, i_45_);
	if (class182_sub3.aBool9750)
	    return new Class136_Sub2_Sub1(class182_sub3, 34037, class165,
					  class178, i, i_45_);
	return new Class136_Sub2_Sub1(class182_sub3, class165, class178, i,
				      i_45_,
				      Class212.method3935(i, -2056250364),
				      Class212.method3935(i_45_, -2056250364));
    }
    
    static Class136_Sub2_Sub1 method18038(Class182_Sub3 class182_sub3, int i,
					  int i_46_, boolean bool, int[] is,
					  int i_47_, int i_48_) {
	if (class182_sub3.aBool9810
	    || Class72.method1537(i, (byte) 0) && Class72.method1537(i_46_,
								     (byte) 0))
	    return new Class136_Sub2_Sub1(class182_sub3, 3553, i, i_46_, bool,
					  is, i_47_, i_48_);
	if (class182_sub3.aBool9750)
	    return new Class136_Sub2_Sub1(class182_sub3, 34037, i, i_46_, bool,
					  is, i_47_, i_48_);
	return new Class136_Sub2_Sub1(class182_sub3, i, i_46_,
				      Class212.method3935(i, -2056250364),
				      Class212.method3935(i_46_, -2056250364),
				      is);
    }
    
    static Class136_Sub2_Sub1 method18039(Class182_Sub3 class182_sub3,
					  Class165 class165, Class178 class178,
					  int i, int i_49_) {
	if (class182_sub3.aBool9810
	    || Class72.method1537(i, (byte) 0) && Class72.method1537(i_49_,
								     (byte) 0))
	    return new Class136_Sub2_Sub1(class182_sub3, 3553, class165,
					  class178, i, i_49_);
	if (class182_sub3.aBool9750)
	    return new Class136_Sub2_Sub1(class182_sub3, 34037, class165,
					  class178, i, i_49_);
	return new Class136_Sub2_Sub1(class182_sub3, class165, class178, i,
				      i_49_,
				      Class212.method3935(i, -2056250364),
				      Class212.method3935(i_49_, -2056250364));
    }
    
    static Class136_Sub2_Sub1 method18040(Class182_Sub3 class182_sub3,
					  Class165 class165, Class178 class178,
					  int i, int i_50_) {
	if (class182_sub3.aBool9810
	    || Class72.method1537(i, (byte) 0) && Class72.method1537(i_50_,
								     (byte) 0))
	    return new Class136_Sub2_Sub1(class182_sub3, 3553, class165,
					  class178, i, i_50_);
	if (class182_sub3.aBool9750)
	    return new Class136_Sub2_Sub1(class182_sub3, 34037, class165,
					  class178, i, i_50_);
	return new Class136_Sub2_Sub1(class182_sub3, class165, class178, i,
				      i_50_,
				      Class212.method3935(i, -2056250364),
				      Class212.method3935(i_50_, -2056250364));
    }
    
    static Class136_Sub2_Sub1 method18041
	(Class182_Sub3 class182_sub3, Class165 class165, Class178 class178,
	 int i, int i_51_, boolean bool, byte[] is, Class165 class165_52_) {
	if (class182_sub3.aBool9810
	    || Class72.method1537(i, (byte) 0) && Class72.method1537(i_51_,
								     (byte) 0))
	    return new Class136_Sub2_Sub1(class182_sub3, 3553, class165,
					  class178, i, i_51_, bool, is,
					  class165_52_);
	if (class182_sub3.aBool9750)
	    return new Class136_Sub2_Sub1(class182_sub3, 34037, class165,
					  class178, i, i_51_, bool, is,
					  class165_52_);
	return new Class136_Sub2_Sub1(class182_sub3, class165, class178, i,
				      i_51_,
				      Class212.method3935(i, -2056250364),
				      Class212.method3935(i_51_, -2056250364),
				      is, class165_52_);
    }
    
    static Class136_Sub2_Sub1 method18042
	(Class182_Sub3 class182_sub3, Class165 class165, Class178 class178,
	 int i, int i_53_, boolean bool, byte[] is, Class165 class165_54_) {
	if (class182_sub3.aBool9810
	    || Class72.method1537(i, (byte) 0) && Class72.method1537(i_53_,
								     (byte) 0))
	    return new Class136_Sub2_Sub1(class182_sub3, 3553, class165,
					  class178, i, i_53_, bool, is,
					  class165_54_);
	if (class182_sub3.aBool9750)
	    return new Class136_Sub2_Sub1(class182_sub3, 34037, class165,
					  class178, i, i_53_, bool, is,
					  class165_54_);
	return new Class136_Sub2_Sub1(class182_sub3, class165, class178, i,
				      i_53_,
				      Class212.method3935(i, -2056250364),
				      Class212.method3935(i_53_, -2056250364),
				      is, class165_54_);
    }
    
    static Class136_Sub2_Sub1 method18043(Class182_Sub3 class182_sub3, int i,
					  int i_55_, int i_56_, int i_57_) {
	if (class182_sub3.aBool9810
	    || (Class72.method1537(i_56_, (byte) 0)
		&& Class72.method1537(i_57_, (byte) 0)))
	    return new Class136_Sub2_Sub1(class182_sub3, 3553, i, i_55_, i_56_,
					  i_57_, true);
	if (class182_sub3.aBool9750)
	    return new Class136_Sub2_Sub1(class182_sub3, 34037, i, i_55_,
					  i_56_, i_57_, true);
	return new Class136_Sub2_Sub1(class182_sub3, i, i_55_, i_56_, i_57_,
				      Class212.method3935(i_56_, -2056250364),
				      Class212.method3935(i_57_, -2056250364),
				      true);
    }
    
    static Class136_Sub2_Sub1 method18044(Class182_Sub3 class182_sub3,
					  Class165 class165, Class178 class178,
					  int i, int i_58_) {
	if (class182_sub3.aBool9810
	    || Class72.method1537(i, (byte) 0) && Class72.method1537(i_58_,
								     (byte) 0))
	    return new Class136_Sub2_Sub1(class182_sub3, 3553, class165,
					  class178, i, i_58_);
	if (class182_sub3.aBool9750)
	    return new Class136_Sub2_Sub1(class182_sub3, 34037, class165,
					  class178, i, i_58_);
	return new Class136_Sub2_Sub1(class182_sub3, class165, class178, i,
				      i_58_,
				      Class212.method3935(i, -2056250364),
				      Class212.method3935(i_58_, -2056250364));
    }
    
    void method2319(boolean bool) {
	super.method2304(bool && !aBool11437);
    }
    
    void method2320(boolean bool) {
	super.method2304(bool && !aBool11437);
    }
}
