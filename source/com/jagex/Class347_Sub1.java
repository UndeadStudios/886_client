/* Class347_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class347_Sub1 extends Class347
{
    public static float aFloat10243;
    public static float aFloat10244;
    Class525_Sub5_Sub1 aClass525_Sub5_Sub1_10245;
    Class525_Sub5_Sub1 aClass525_Sub5_Sub1_10246;
    Class525_Sub5_Sub1 aClass525_Sub5_Sub1_10247;
    Class525_Sub5_Sub1 aClass525_Sub5_Sub1_10248;
    Class273 aClass273_10249;
    public static float aFloat10250 = 1.0F;
    Class525_Sub5_Sub1 aClass525_Sub5_Sub1_10251;
    Class266 aClass266_10252;
    public static float aFloat10253;
    public static float aFloat10254;
    boolean aBool10255;
    
    int method6084() {
	return 0;
    }
    
    boolean method6074() {
	return (aClass182_Sub1_3731.aBool9302
		&& aClass182_Sub1_3731.method14655());
    }
    
    boolean method6075() {
	return aBool10255;
    }
    
    int method6083() {
	return 1;
    }
    
    void method6079(int i, int i_0_) {
	/* empty */
    }
    
    void method6078() {
	/* empty */
    }
    
    public Class347_Sub1(Class182_Sub1 class182_sub1) {
	super(class182_sub1);
    }
    
    void method6080(int i, Class168_Sub2 class168_sub2,
		    Interface38 interface38, Interface22 interface22,
		    Interface38 interface38_1_, boolean bool) {
	float f = aClass182_Sub1_3731.method14674();
	float f_2_ = (float) class168_sub2.method2710();
	float f_3_ = (float) class168_sub2.method2711();
	float f_4_ = f * 2.0F / f_2_;
	float f_5_ = -f * 2.0F / f_3_;
	float[] fs = { -1.0F + f_4_, 1.0F + f_5_, 0.0F, 0.0F, -1.0F + f_4_,
		       -3.0F + f_5_, 0.0F, 2.0F, 3.0F + f_4_, 1.0F + f_5_,
		       2.0F, 0.0F };
	int i_6_ = (int) f_2_;
	int i_7_ = (int) f_3_;
	int i_8_
	    = (bool ? aClass182_Sub1_3731.method3322(-2110630664).method2710()
	       : i_6_);
	int i_9_
	    = (bool ? aClass182_Sub1_3731.method3322(-2109481467).method2711()
	       : i_7_);
	aClass266_10252.method4856(aClass273_10249);
	aClass266_10252.method4804();
	float f_10_ = (float) i_6_ / f_2_;
	float f_11_ = (float) i_7_ / f_3_;
	float f_12_ = (float) i_8_ / f_2_;
	float f_13_ = (float) i_9_ / f_3_;
	fs[8] = (fs[8] + 1.0F) * f_10_ - 1.0F;
	fs[5] = (fs[5] - 1.0F) * f_11_ + 1.0F;
	fs[10] *= f_12_;
	fs[7] *= f_13_;
	aClass266_10252.method4807(aClass525_Sub5_Sub1_10245, fs, -360990951);
	aClass266_10252.method4828(aClass525_Sub5_Sub1_10251, 0, interface38,
				   642458899);
	aClass266_10252.method4818(aClass525_Sub5_Sub1_10246, aFloat10250,
				   1008430712);
	aClass266_10252.method4806(aClass525_Sub5_Sub1_10247, aFloat10244,
				   aFloat10243, aFloat10253, aFloat10254,
				   (byte) 19);
	aClass266_10252.method4806(aClass525_Sub5_Sub1_10248, 0.0F, 0.0F, 0.0F,
				   0.0F, (byte) 3);
	aClass182_Sub1_3731.method3277(0, 0, i_6_, i_7_);
    }
    
    void method6093(int i) {
	aClass266_10252.method4805();
    }
    
    void method6097(int i, int i_14_) {
	/* empty */
    }
    
    boolean method6085() {
	return aBool10255;
    }
    
    boolean method6090() {
	return (aFloat10250 == 1.0F && aFloat10244 == 0.0F
		&& aFloat10243 == 1.0F && aFloat10253 == 0.0F
		&& aFloat10254 == 1.0F);
    }
    
    static {
	aFloat10244 = 0.0F;
	aFloat10243 = 1.0F;
	aFloat10253 = 0.0F;
	aFloat10254 = 1.0F;
    }
    
    boolean method6088() {
	return (aClass182_Sub1_3731.aBool9302
		&& aClass182_Sub1_3731.method14655());
    }
    
    boolean method6089() {
	return (aClass182_Sub1_3731.aBool9302
		&& aClass182_Sub1_3731.method14655());
    }
    
    boolean method6081() {
	if (method6074()) {
	    aClass266_10252 = aClass182_Sub1_3731.method14660("FilterLevels");
	    if (aClass266_10252 == null)
		return false;
	    try {
		aClass525_Sub5_Sub1_10251
		    = aClass266_10252.method4837("sceneTex", 886883362);
		aClass525_Sub5_Sub1_10246
		    = aClass266_10252.method4837("paramsGamma", 886883362);
		aClass525_Sub5_Sub1_10247
		    = aClass266_10252.method4837("paramsRanges", 886883362);
		aClass525_Sub5_Sub1_10248
		    = aClass266_10252.method4837("pixelOffset", 886883362);
		aClass525_Sub5_Sub1_10245
		    = aClass266_10252.method4837("PosAndTexCoords", 886883362);
		aClass273_10249
		    = aClass266_10252.method4839("techAdjust", -1890304676);
	    } catch (Exception_Sub5_Sub2 exception_sub5_sub2) {
		return false;
	    } catch (Exception_Sub5_Sub1 exception_sub5_sub1) {
		return false;
	    }
	    if (!aClass273_10249.method5043())
		return false;
	    aBool10255 = true;
	    return true;
	}
	return false;
    }
    
    boolean method6102() {
	if (method6074()) {
	    aClass266_10252 = aClass182_Sub1_3731.method14660("FilterLevels");
	    if (aClass266_10252 == null)
		return false;
	    try {
		aClass525_Sub5_Sub1_10251
		    = aClass266_10252.method4837("sceneTex", 886883362);
		aClass525_Sub5_Sub1_10246
		    = aClass266_10252.method4837("paramsGamma", 886883362);
		aClass525_Sub5_Sub1_10247
		    = aClass266_10252.method4837("paramsRanges", 886883362);
		aClass525_Sub5_Sub1_10248
		    = aClass266_10252.method4837("pixelOffset", 886883362);
		aClass525_Sub5_Sub1_10245
		    = aClass266_10252.method4837("PosAndTexCoords", 886883362);
		aClass273_10249
		    = aClass266_10252.method4839("techAdjust", -1563087224);
	    } catch (Exception_Sub5_Sub2 exception_sub5_sub2) {
		return false;
	    } catch (Exception_Sub5_Sub1 exception_sub5_sub1) {
		return false;
	    }
	    if (!aClass273_10249.method5043())
		return false;
	    aBool10255 = true;
	    return true;
	}
	return false;
    }
    
    void method6112() {
	/* empty */
    }
    
    void method6095() {
	/* empty */
    }
    
    void method6096() {
	/* empty */
    }
    
    int method6104() {
	return 0;
    }
    
    int method6082() {
	return 1;
    }
    
    void method6099(int i, Class168_Sub2 class168_sub2,
		    Interface38 interface38, Interface22 interface22,
		    Interface38 interface38_15_, boolean bool) {
	float f = aClass182_Sub1_3731.method14674();
	float f_16_ = (float) class168_sub2.method2710();
	float f_17_ = (float) class168_sub2.method2711();
	float f_18_ = f * 2.0F / f_16_;
	float f_19_ = -f * 2.0F / f_17_;
	float[] fs = { -1.0F + f_18_, 1.0F + f_19_, 0.0F, 0.0F, -1.0F + f_18_,
		       -3.0F + f_19_, 0.0F, 2.0F, 3.0F + f_18_, 1.0F + f_19_,
		       2.0F, 0.0F };
	int i_20_ = (int) f_16_;
	int i_21_ = (int) f_17_;
	int i_22_
	    = (bool ? aClass182_Sub1_3731.method3322(-2126336549).method2710()
	       : i_20_);
	int i_23_
	    = (bool ? aClass182_Sub1_3731.method3322(-2115676123).method2711()
	       : i_21_);
	aClass266_10252.method4856(aClass273_10249);
	aClass266_10252.method4804();
	float f_24_ = (float) i_20_ / f_16_;
	float f_25_ = (float) i_21_ / f_17_;
	float f_26_ = (float) i_22_ / f_16_;
	float f_27_ = (float) i_23_ / f_17_;
	fs[8] = (fs[8] + 1.0F) * f_24_ - 1.0F;
	fs[5] = (fs[5] - 1.0F) * f_25_ + 1.0F;
	fs[10] *= f_26_;
	fs[7] *= f_27_;
	aClass266_10252.method4807(aClass525_Sub5_Sub1_10245, fs, -845842839);
	aClass266_10252.method4828(aClass525_Sub5_Sub1_10251, 0, interface38,
				   1343730580);
	aClass266_10252.method4818(aClass525_Sub5_Sub1_10246, aFloat10250,
				   1931572362);
	aClass266_10252.method4806(aClass525_Sub5_Sub1_10247, aFloat10244,
				   aFloat10243, aFloat10253, aFloat10254,
				   (byte) 34);
	aClass266_10252.method4806(aClass525_Sub5_Sub1_10248, 0.0F, 0.0F, 0.0F,
				   0.0F, (byte) 68);
	aClass182_Sub1_3731.method3277(0, 0, i_20_, i_21_);
    }
    
    boolean method6076() {
	if (method6074()) {
	    aClass266_10252 = aClass182_Sub1_3731.method14660("FilterLevels");
	    if (aClass266_10252 == null)
		return false;
	    try {
		aClass525_Sub5_Sub1_10251
		    = aClass266_10252.method4837("sceneTex", 886883362);
		aClass525_Sub5_Sub1_10246
		    = aClass266_10252.method4837("paramsGamma", 886883362);
		aClass525_Sub5_Sub1_10247
		    = aClass266_10252.method4837("paramsRanges", 886883362);
		aClass525_Sub5_Sub1_10248
		    = aClass266_10252.method4837("pixelOffset", 886883362);
		aClass525_Sub5_Sub1_10245
		    = aClass266_10252.method4837("PosAndTexCoords", 886883362);
		aClass273_10249
		    = aClass266_10252.method4839("techAdjust", -1140677736);
	    } catch (Exception_Sub5_Sub2 exception_sub5_sub2) {
		return false;
	    } catch (Exception_Sub5_Sub1 exception_sub5_sub1) {
		return false;
	    }
	    if (!aClass273_10249.method5043())
		return false;
	    aBool10255 = true;
	    return true;
	}
	return false;
    }
    
    int method6106() {
	return 0;
    }
    
    int method6086() {
	return 1;
    }
    
    int method6108() {
	return 1;
    }
    
    void method6100(int i) {
	aClass266_10252.method4805();
    }
    
    int method6105() {
	return 0;
    }
    
    void method6098(int i, Class168_Sub2 class168_sub2,
		    Interface38 interface38, Interface22 interface22,
		    Interface38 interface38_28_, boolean bool) {
	float f = aClass182_Sub1_3731.method14674();
	float f_29_ = (float) class168_sub2.method2710();
	float f_30_ = (float) class168_sub2.method2711();
	float f_31_ = f * 2.0F / f_29_;
	float f_32_ = -f * 2.0F / f_30_;
	float[] fs = { -1.0F + f_31_, 1.0F + f_32_, 0.0F, 0.0F, -1.0F + f_31_,
		       -3.0F + f_32_, 0.0F, 2.0F, 3.0F + f_31_, 1.0F + f_32_,
		       2.0F, 0.0F };
	int i_33_ = (int) f_29_;
	int i_34_ = (int) f_30_;
	int i_35_
	    = (bool ? aClass182_Sub1_3731.method3322(-2094453515).method2710()
	       : i_33_);
	int i_36_
	    = (bool ? aClass182_Sub1_3731.method3322(-2047287653).method2711()
	       : i_34_);
	aClass266_10252.method4856(aClass273_10249);
	aClass266_10252.method4804();
	float f_37_ = (float) i_33_ / f_29_;
	float f_38_ = (float) i_34_ / f_30_;
	float f_39_ = (float) i_35_ / f_29_;
	float f_40_ = (float) i_36_ / f_30_;
	fs[8] = (fs[8] + 1.0F) * f_37_ - 1.0F;
	fs[5] = (fs[5] - 1.0F) * f_38_ + 1.0F;
	fs[10] *= f_39_;
	fs[7] *= f_40_;
	aClass266_10252.method4807(aClass525_Sub5_Sub1_10245, fs, 466111256);
	aClass266_10252.method4828(aClass525_Sub5_Sub1_10251, 0, interface38,
				   -11049938);
	aClass266_10252.method4818(aClass525_Sub5_Sub1_10246, aFloat10250,
				   65793069);
	aClass266_10252.method4806(aClass525_Sub5_Sub1_10247, aFloat10244,
				   aFloat10243, aFloat10253, aFloat10254,
				   (byte) 96);
	aClass266_10252.method4806(aClass525_Sub5_Sub1_10248, 0.0F, 0.0F, 0.0F,
				   0.0F, (byte) 119);
	aClass182_Sub1_3731.method3277(0, 0, i_33_, i_34_);
    }
    
    int method6101() {
	return 0;
    }
    
    boolean method6094() {
	return (aFloat10250 == 1.0F && aFloat10244 == 0.0F
		&& aFloat10243 == 1.0F && aFloat10253 == 0.0F
		&& aFloat10254 == 1.0F);
    }
    
    boolean method6115() {
	return (aFloat10250 == 1.0F && aFloat10244 == 0.0F
		&& aFloat10243 == 1.0F && aFloat10253 == 0.0F
		&& aFloat10254 == 1.0F);
    }
    
    boolean method6116() {
	return (aFloat10250 == 1.0F && aFloat10244 == 0.0F
		&& aFloat10243 == 1.0F && aFloat10253 == 0.0F
		&& aFloat10254 == 1.0F);
    }
    
    boolean method6114() {
	return (aFloat10250 == 1.0F && aFloat10244 == 0.0F
		&& aFloat10243 == 1.0F && aFloat10253 == 0.0F
		&& aFloat10254 == 1.0F);
    }
    
    void method6087(int i) {
	aClass266_10252.method4805();
    }
    
    boolean method6119() {
	return aBool10255;
    }
}
