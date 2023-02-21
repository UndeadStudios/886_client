/* Class347_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class347_Sub2 extends Class347
{
    Class525_Sub5_Sub1 aClass525_Sub5_Sub1_10257;
    public static float aFloat10258 = 0.25F;
    Class525_Sub5_Sub1 aClass525_Sub5_Sub1_10259;
    Class525_Sub5_Sub1 aClass525_Sub5_Sub1_10260;
    public static float aFloat10261;
    Class266 aClass266_10262;
    Class273 aClass273_10263;
    Class273 aClass273_10264;
    Class273 aClass273_10265;
    public static float aFloat10266;
    Class273 aClass273_10267;
    static final int anInt10268 = 256;
    public static float aFloat10269 = 1.0F;
    Class525_Sub5_Sub1 aClass525_Sub5_Sub1_10270;
    Class525_Sub5_Sub1 aClass525_Sub5_Sub1_10271;
    boolean aBool10272;
    Class273 aClass273_10273;
    Class525_Sub5_Sub1 aClass525_Sub5_Sub1_10274;
    
    void method6080(int i, Class168_Sub2 class168_sub2,
		    Interface38 interface38, Interface22 interface22,
		    Interface38 interface38_0_, boolean bool) {
	float f = aClass182_Sub1_3731.method14674();
	float f_1_ = (float) class168_sub2.method2710();
	float f_2_ = (float) class168_sub2.method2711();
	Interface38 interface38_3_ = interface38;
	float f_4_ = f * 2.0F / f_1_;
	float f_5_ = -f * 2.0F / f_2_;
	float[] fs = { -1.0F + f_4_, 1.0F + f_5_, 0.0F, 0.0F, -1.0F + f_4_,
		       -3.0F + f_5_, 0.0F, 2.0F, 3.0F + f_4_, 1.0F + f_5_,
		       2.0F, 0.0F };
	int i_6_ = (int) f_1_;
	int i_7_ = (int) f_2_;
	int i_8_
	    = (bool ? aClass182_Sub1_3731.method3322(-2045907553).method2710()
	       : i_6_);
	int i_9_
	    = (bool ? aClass182_Sub1_3731.method3322(-2006944784).method2711()
	       : i_7_);
	if (i == 0) {
	    i_6_ = 256;
	    i_7_ = 256;
	    aClass266_10262.method4856(aClass273_10264);
	    aClass266_10262.method4804();
	} else if (i == 1) {
	    i_6_ = 256;
	    i_7_ = 256;
	    i_8_ = i_6_;
	    i_9_ = i_7_;
	    aClass266_10262.method4856(aClass273_10265);
	    aClass266_10262.method4804();
	    aClass266_10262.method4819(aClass525_Sub5_Sub1_10259,
				       aFloat10261 / f_1_, 0.0F, -1732513880);
	} else if (i == 2) {
	    i_6_ = 256;
	    i_7_ = 256;
	    i_8_ = i_6_;
	    i_9_ = i_7_;
	    aClass266_10262.method4856(aClass273_10265);
	    aClass266_10262.method4804();
	    aClass266_10262.method4819(aClass525_Sub5_Sub1_10259, 0.0F,
				       aFloat10261 / f_2_, -1005212656);
	} else if (i == 3) {
	    aClass266_10262.method4856(aClass273_10273);
	    interface38_3_ = interface38_0_;
	    aClass266_10262.method4828(aClass525_Sub5_Sub1_10260, 1,
				       interface38, -642887397);
	    aClass266_10262.method4804();
	}
	float f_10_ = (float) i_6_ / f_1_;
	float f_11_ = (float) i_7_ / f_2_;
	float f_12_ = (float) i_8_ / f_1_;
	float f_13_ = (float) i_9_ / f_2_;
	fs[8] = (fs[8] + 1.0F) * f_10_ - 1.0F;
	fs[5] = (fs[5] - 1.0F) * f_11_ + 1.0F;
	fs[10] *= f_12_;
	fs[7] *= f_13_;
	aClass266_10262.method4807(aClass525_Sub5_Sub1_10274, fs, 471015724);
	aClass266_10262.method4828(aClass525_Sub5_Sub1_10257, 0,
				   interface38_3_, -1937804184);
	aClass266_10262.method4806(aClass525_Sub5_Sub1_10270, aFloat10266,
				   aFloat10258, aFloat10269, 0.0F, (byte) 3);
	aClass266_10262.method4806(aClass525_Sub5_Sub1_10271, 0.0F, 0.0F,
				   256.0F / f_1_, 256.0F / f_2_, (byte) 109);
	aClass182_Sub1_3731.method3277(0, 0, i_6_, i_7_);
    }
    
    boolean method6074() {
	return (aClass182_Sub1_3731.aBool9302
		&& aClass182_Sub1_3731.method14655()
		&& aClass182_Sub1_3731.method14656(true));
    }
    
    boolean method6102() {
	if (method6074()) {
	    aClass266_10262 = aClass182_Sub1_3731.method14660("FilterBloom");
	    if (aClass266_10262 == null)
		return false;
	    try {
		aClass525_Sub5_Sub1_10257
		    = aClass266_10262.method4837("sceneTex", 886883362);
		aClass525_Sub5_Sub1_10260
		    = aClass266_10262.method4837("bloomTex1", 886883362);
		aClass525_Sub5_Sub1_10270
		    = aClass266_10262.method4837("params", 886883362);
		aClass525_Sub5_Sub1_10259
		    = aClass266_10262.method4837("sampleSize", 886883362);
		aClass525_Sub5_Sub1_10271
		    = aClass266_10262.method4837("pixelOffsetAndBloomScale",
						 886883362);
		aClass525_Sub5_Sub1_10274
		    = aClass266_10262.method4837("PosAndTexCoords", 886883362);
		aClass266_10262.method4839("test", -303799165);
		aClass273_10263
		    = aClass266_10262.method4839("techFullscreenTri",
						 -813351935);
		aClass273_10264
		    = aClass266_10262.method4839("brightpass", -1607765723);
		aClass273_10265
		    = aClass266_10262.method4839("blur", -301936881);
		aClass273_10273
		    = aClass266_10262.method4839("composite", -601115500);
		aClass273_10267
		    = aClass266_10262.method4839("techDefault", -1560353920);
	    } catch (Exception_Sub5_Sub2 exception_sub5_sub2) {
		return false;
	    } catch (Exception_Sub5_Sub1 exception_sub5_sub1) {
		return false;
	    }
	    if (!aClass273_10263.method5043())
		return false;
	    if (!aClass273_10264.method5043())
		return false;
	    if (!aClass273_10265.method5043())
		return false;
	    if (!aClass273_10273.method5043())
		return false;
	    if (!aClass273_10267.method5043())
		return false;
	    aBool10272 = true;
	    return true;
	}
	return false;
    }
    
    boolean method6076() {
	if (method6074()) {
	    aClass266_10262 = aClass182_Sub1_3731.method14660("FilterBloom");
	    if (aClass266_10262 == null)
		return false;
	    try {
		aClass525_Sub5_Sub1_10257
		    = aClass266_10262.method4837("sceneTex", 886883362);
		aClass525_Sub5_Sub1_10260
		    = aClass266_10262.method4837("bloomTex1", 886883362);
		aClass525_Sub5_Sub1_10270
		    = aClass266_10262.method4837("params", 886883362);
		aClass525_Sub5_Sub1_10259
		    = aClass266_10262.method4837("sampleSize", 886883362);
		aClass525_Sub5_Sub1_10271
		    = aClass266_10262.method4837("pixelOffsetAndBloomScale",
						 886883362);
		aClass525_Sub5_Sub1_10274
		    = aClass266_10262.method4837("PosAndTexCoords", 886883362);
		aClass266_10262.method4839("test", -977448611);
		aClass273_10263
		    = aClass266_10262.method4839("techFullscreenTri",
						 -1988869202);
		aClass273_10264
		    = aClass266_10262.method4839("brightpass", -827528997);
		aClass273_10265
		    = aClass266_10262.method4839("blur", -1417769529);
		aClass273_10273
		    = aClass266_10262.method4839("composite", -580280999);
		aClass273_10267
		    = aClass266_10262.method4839("techDefault", -607513603);
	    } catch (Exception_Sub5_Sub2 exception_sub5_sub2) {
		return false;
	    } catch (Exception_Sub5_Sub1 exception_sub5_sub1) {
		return false;
	    }
	    if (!aClass273_10263.method5043())
		return false;
	    if (!aClass273_10264.method5043())
		return false;
	    if (!aClass273_10265.method5043())
		return false;
	    if (!aClass273_10273.method5043())
		return false;
	    if (!aClass273_10267.method5043())
		return false;
	    aBool10272 = true;
	    return true;
	}
	return false;
    }
    
    void method6079(int i, int i_14_) {
	/* empty */
    }
    
    boolean method6088() {
	return (aClass182_Sub1_3731.aBool9302
		&& aClass182_Sub1_3731.method14655()
		&& aClass182_Sub1_3731.method14656(true));
    }
    
    int method6082() {
	return 4;
    }
    
    int method6083() {
	return 0;
    }
    
    void method6093(int i) {
	aClass266_10262.method4805();
    }
    
    void method6078() {
	/* empty */
    }
    
    boolean method6075() {
	return aBool10272;
    }
    
    boolean method6090() {
	return false;
    }
    
    void method6099(int i, Class168_Sub2 class168_sub2,
		    Interface38 interface38, Interface22 interface22,
		    Interface38 interface38_15_, boolean bool) {
	float f = aClass182_Sub1_3731.method14674();
	float f_16_ = (float) class168_sub2.method2710();
	float f_17_ = (float) class168_sub2.method2711();
	Interface38 interface38_18_ = interface38;
	float f_19_ = f * 2.0F / f_16_;
	float f_20_ = -f * 2.0F / f_17_;
	float[] fs = { -1.0F + f_19_, 1.0F + f_20_, 0.0F, 0.0F, -1.0F + f_19_,
		       -3.0F + f_20_, 0.0F, 2.0F, 3.0F + f_19_, 1.0F + f_20_,
		       2.0F, 0.0F };
	int i_21_ = (int) f_16_;
	int i_22_ = (int) f_17_;
	int i_23_
	    = (bool ? aClass182_Sub1_3731.method3322(-2028810499).method2710()
	       : i_21_);
	int i_24_
	    = (bool ? aClass182_Sub1_3731.method3322(-2125102356).method2711()
	       : i_22_);
	if (i == 0) {
	    i_21_ = 256;
	    i_22_ = 256;
	    aClass266_10262.method4856(aClass273_10264);
	    aClass266_10262.method4804();
	} else if (i == 1) {
	    i_21_ = 256;
	    i_22_ = 256;
	    i_23_ = i_21_;
	    i_24_ = i_22_;
	    aClass266_10262.method4856(aClass273_10265);
	    aClass266_10262.method4804();
	    aClass266_10262.method4819(aClass525_Sub5_Sub1_10259,
				       aFloat10261 / f_16_, 0.0F, -1504494624);
	} else if (i == 2) {
	    i_21_ = 256;
	    i_22_ = 256;
	    i_23_ = i_21_;
	    i_24_ = i_22_;
	    aClass266_10262.method4856(aClass273_10265);
	    aClass266_10262.method4804();
	    aClass266_10262.method4819(aClass525_Sub5_Sub1_10259, 0.0F,
				       aFloat10261 / f_17_, -1168062643);
	} else if (i == 3) {
	    aClass266_10262.method4856(aClass273_10273);
	    interface38_18_ = interface38_15_;
	    aClass266_10262.method4828(aClass525_Sub5_Sub1_10260, 1,
				       interface38, 259493614);
	    aClass266_10262.method4804();
	}
	float f_25_ = (float) i_21_ / f_16_;
	float f_26_ = (float) i_22_ / f_17_;
	float f_27_ = (float) i_23_ / f_16_;
	float f_28_ = (float) i_24_ / f_17_;
	fs[8] = (fs[8] + 1.0F) * f_25_ - 1.0F;
	fs[5] = (fs[5] - 1.0F) * f_26_ + 1.0F;
	fs[10] *= f_27_;
	fs[7] *= f_28_;
	aClass266_10262.method4807(aClass525_Sub5_Sub1_10274, fs, -2088633975);
	aClass266_10262.method4828(aClass525_Sub5_Sub1_10257, 0,
				   interface38_18_, -1093371440);
	aClass266_10262.method4806(aClass525_Sub5_Sub1_10270, aFloat10266,
				   aFloat10258, aFloat10269, 0.0F, (byte) 106);
	aClass266_10262.method4806(aClass525_Sub5_Sub1_10271, 0.0F, 0.0F,
				   256.0F / f_16_, 256.0F / f_17_, (byte) 42);
	aClass182_Sub1_3731.method3277(0, 0, i_21_, i_22_);
    }
    
    int method6084() {
	return 1;
    }
    
    boolean method6089() {
	return (aClass182_Sub1_3731.aBool9302
		&& aClass182_Sub1_3731.method14655()
		&& aClass182_Sub1_3731.method14656(true));
    }
    
    boolean method6081() {
	if (method6074()) {
	    aClass266_10262 = aClass182_Sub1_3731.method14660("FilterBloom");
	    if (aClass266_10262 == null)
		return false;
	    try {
		aClass525_Sub5_Sub1_10257
		    = aClass266_10262.method4837("sceneTex", 886883362);
		aClass525_Sub5_Sub1_10260
		    = aClass266_10262.method4837("bloomTex1", 886883362);
		aClass525_Sub5_Sub1_10270
		    = aClass266_10262.method4837("params", 886883362);
		aClass525_Sub5_Sub1_10259
		    = aClass266_10262.method4837("sampleSize", 886883362);
		aClass525_Sub5_Sub1_10271
		    = aClass266_10262.method4837("pixelOffsetAndBloomScale",
						 886883362);
		aClass525_Sub5_Sub1_10274
		    = aClass266_10262.method4837("PosAndTexCoords", 886883362);
		aClass266_10262.method4839("test", -1311931700);
		aClass273_10263
		    = aClass266_10262.method4839("techFullscreenTri",
						 -1126757277);
		aClass273_10264
		    = aClass266_10262.method4839("brightpass", -453663970);
		aClass273_10265
		    = aClass266_10262.method4839("blur", -2089281142);
		aClass273_10273
		    = aClass266_10262.method4839("composite", -818803965);
		aClass273_10267
		    = aClass266_10262.method4839("techDefault", -1129378673);
	    } catch (Exception_Sub5_Sub2 exception_sub5_sub2) {
		return false;
	    } catch (Exception_Sub5_Sub1 exception_sub5_sub1) {
		return false;
	    }
	    if (!aClass273_10263.method5043())
		return false;
	    if (!aClass273_10264.method5043())
		return false;
	    if (!aClass273_10265.method5043())
		return false;
	    if (!aClass273_10273.method5043())
		return false;
	    if (!aClass273_10267.method5043())
		return false;
	    aBool10272 = true;
	    return true;
	}
	return false;
    }
    
    boolean method6115() {
	return false;
    }
    
    boolean method6119() {
	return aBool10272;
    }
    
    void method6095() {
	/* empty */
    }
    
    void method6100(int i) {
	aClass266_10262.method4805();
    }
    
    void method6097(int i, int i_29_) {
	/* empty */
    }
    
    int method6105() {
	return 1;
    }
    
    boolean method6085() {
	return aBool10272;
    }
    
    void method6098(int i, Class168_Sub2 class168_sub2,
		    Interface38 interface38, Interface22 interface22,
		    Interface38 interface38_30_, boolean bool) {
	float f = aClass182_Sub1_3731.method14674();
	float f_31_ = (float) class168_sub2.method2710();
	float f_32_ = (float) class168_sub2.method2711();
	Interface38 interface38_33_ = interface38;
	float f_34_ = f * 2.0F / f_31_;
	float f_35_ = -f * 2.0F / f_32_;
	float[] fs = { -1.0F + f_34_, 1.0F + f_35_, 0.0F, 0.0F, -1.0F + f_34_,
		       -3.0F + f_35_, 0.0F, 2.0F, 3.0F + f_34_, 1.0F + f_35_,
		       2.0F, 0.0F };
	int i_36_ = (int) f_31_;
	int i_37_ = (int) f_32_;
	int i_38_
	    = (bool ? aClass182_Sub1_3731.method3322(-2091896488).method2710()
	       : i_36_);
	int i_39_
	    = (bool ? aClass182_Sub1_3731.method3322(-2051587135).method2711()
	       : i_37_);
	if (i == 0) {
	    i_36_ = 256;
	    i_37_ = 256;
	    aClass266_10262.method4856(aClass273_10264);
	    aClass266_10262.method4804();
	} else if (i == 1) {
	    i_36_ = 256;
	    i_37_ = 256;
	    i_38_ = i_36_;
	    i_39_ = i_37_;
	    aClass266_10262.method4856(aClass273_10265);
	    aClass266_10262.method4804();
	    aClass266_10262.method4819(aClass525_Sub5_Sub1_10259,
				       aFloat10261 / f_31_, 0.0F, -2128762122);
	} else if (i == 2) {
	    i_36_ = 256;
	    i_37_ = 256;
	    i_38_ = i_36_;
	    i_39_ = i_37_;
	    aClass266_10262.method4856(aClass273_10265);
	    aClass266_10262.method4804();
	    aClass266_10262.method4819(aClass525_Sub5_Sub1_10259, 0.0F,
				       aFloat10261 / f_32_, -1173929608);
	} else if (i == 3) {
	    aClass266_10262.method4856(aClass273_10273);
	    interface38_33_ = interface38_30_;
	    aClass266_10262.method4828(aClass525_Sub5_Sub1_10260, 1,
				       interface38, -298240160);
	    aClass266_10262.method4804();
	}
	float f_40_ = (float) i_36_ / f_31_;
	float f_41_ = (float) i_37_ / f_32_;
	float f_42_ = (float) i_38_ / f_31_;
	float f_43_ = (float) i_39_ / f_32_;
	fs[8] = (fs[8] + 1.0F) * f_40_ - 1.0F;
	fs[5] = (fs[5] - 1.0F) * f_41_ + 1.0F;
	fs[10] *= f_42_;
	fs[7] *= f_43_;
	aClass266_10262.method4807(aClass525_Sub5_Sub1_10274, fs, 140042292);
	aClass266_10262.method4828(aClass525_Sub5_Sub1_10257, 0,
				   interface38_33_, -468506158);
	aClass266_10262.method4806(aClass525_Sub5_Sub1_10270, aFloat10266,
				   aFloat10258, aFloat10269, 0.0F, (byte) 48);
	aClass266_10262.method4806(aClass525_Sub5_Sub1_10271, 0.0F, 0.0F,
				   256.0F / f_31_, 256.0F / f_32_, (byte) 49);
	aClass182_Sub1_3731.method3277(0, 0, i_36_, i_37_);
    }
    
    void method6087(int i) {
	aClass266_10262.method4805();
    }
    
    int method6086() {
	return 4;
    }
    
    int method6108() {
	return 0;
    }
    
    int method6104() {
	return 1;
    }
    
    void method6112() {
	/* empty */
    }
    
    int method6106() {
	return 1;
    }
    
    int method6101() {
	return 1;
    }
    
    boolean method6114() {
	return false;
    }
    
    public Class347_Sub2(Class182_Sub1 class182_sub1) {
	super(class182_sub1);
    }
    
    boolean method6116() {
	return false;
    }
    
    boolean method6094() {
	return false;
    }
    
    void method6096() {
	/* empty */
    }
    
    static {
	aFloat10266 = 1.0F;
	aFloat10261 = 1.0F;
    }
}
