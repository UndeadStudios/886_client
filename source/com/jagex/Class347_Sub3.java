/* Class347_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class347_Sub3 extends Class347
{
    public static float aFloat10279;
    Class525_Sub5_Sub1 aClass525_Sub5_Sub1_10280;
    Class273[] aClass273Array10281 = null;
    public static Class169_Sub1[] aClass169_Sub1Array10282;
    Class266 aClass266_10283;
    public static int anInt10284;
    Class525_Sub5_Sub1 aClass525_Sub5_Sub1_10285;
    Class525_Sub5_Sub1[] aClass525_Sub5_Sub1Array10286 = null;
    Class525_Sub5_Sub1 aClass525_Sub5_Sub1_10287;
    public static float[] aFloatArray10288 = { 0.0F, 0.0F, 0.0F };
    Class525_Sub5_Sub1 aClass525_Sub5_Sub1_10289;
    boolean aBool10290;
    
    boolean method6115() {
	return (anInt10284 == 0 || aFloat10279 == 1.0F
		|| (aFloatArray10288[0] + aFloatArray10288[1]
		    + aFloatArray10288[2]) == 0.0F
		|| (aClass169_Sub1Array10282[0] == null
		    && aClass169_Sub1Array10282[1] == null
		    && aClass169_Sub1Array10282[2] == null));
    }
    
    int method6105() {
	return 0;
    }
    
    boolean method6114() {
	return (anInt10284 == 0 || aFloat10279 == 1.0F
		|| (aFloatArray10288[0] + aFloatArray10288[1]
		    + aFloatArray10288[2]) == 0.0F
		|| (aClass169_Sub1Array10282[0] == null
		    && aClass169_Sub1Array10282[1] == null
		    && aClass169_Sub1Array10282[2] == null));
    }
    
    boolean method6076() {
	if (method6074()) {
	    aClass266_10283
		= aClass182_Sub1_3731.method14660("FilterColourRemapping");
	    if (aClass266_10283 == null)
		return false;
	    try {
		aClass525_Sub5_Sub1_10285
		    = aClass266_10283.method4837("sceneTex", 886883362);
		aClass273Array10281 = new Class273[3];
		aClass525_Sub5_Sub1Array10286 = new Class525_Sub5_Sub1[3];
		if (aClass182_Sub1_3731.aBool9307) {
		    aClass273Array10281[0]
			= aClass266_10283.method4839("techRemap3D_1",
						     -1818061834);
		    aClass273Array10281[1]
			= aClass266_10283.method4839("techRemap3D_2",
						     -586131997);
		    aClass273Array10281[2]
			= aClass266_10283.method4839("techRemap3D_3",
						     -2144010988);
		    aClass525_Sub5_Sub1Array10286[0]
			= aClass266_10283.method4837("remapTex3D_1",
						     886883362);
		    aClass525_Sub5_Sub1Array10286[1]
			= aClass266_10283.method4837("remapTex3D_2",
						     886883362);
		    aClass525_Sub5_Sub1Array10286[2]
			= aClass266_10283.method4837("remapTex3D_3",
						     886883362);
		} else {
		    aClass273Array10281[0]
			= aClass266_10283.method4839("techRemap2D_1",
						     -313986634);
		    aClass273Array10281[1]
			= aClass266_10283.method4839("techRemap2D_2",
						     -1571227154);
		    aClass273Array10281[2]
			= aClass266_10283.method4839("techRemap2D_3",
						     -1568436766);
		    aClass525_Sub5_Sub1Array10286[0]
			= aClass266_10283.method4837("remapTex2D_1",
						     886883362);
		    aClass525_Sub5_Sub1Array10286[1]
			= aClass266_10283.method4837("remapTex2D_2",
						     886883362);
		    aClass525_Sub5_Sub1Array10286[2]
			= aClass266_10283.method4837("remapTex2D_3",
						     886883362);
		}
		aClass525_Sub5_Sub1_10287
		    = aClass266_10283.method4837("paramsWeightings",
						 886883362);
		aClass525_Sub5_Sub1_10280
		    = aClass266_10283.method4837("pixelOffset", 886883362);
		aClass525_Sub5_Sub1_10289
		    = aClass266_10283.method4837("PosAndTexCoords", 886883362);
	    } catch (Exception_Sub5_Sub2 exception_sub5_sub2) {
		return false;
	    } catch (Exception_Sub5_Sub1 exception_sub5_sub1) {
		return false;
	    }
	    if (!aClass273Array10281[0].method5043()
		|| !aClass273Array10281[1].method5043()
		|| !aClass273Array10281[2].method5043())
		return false;
	    aBool10290 = true;
	    return true;
	}
	return false;
    }
    
    void method6079(int i, int i_0_) {
	/* empty */
    }
    
    boolean method6075() {
	return aBool10290;
    }
    
    boolean method6074() {
	return (aClass182_Sub1_3731.aBool9302
		&& aClass182_Sub1_3731.method14655());
    }
    
    void method6080(int i, Class168_Sub2 class168_sub2,
		    Interface38 interface38, Interface22 interface22,
		    Interface38 interface38_1_, boolean bool) {
	float f = aClass182_Sub1_3731.method14674();
	float f_2_ = (float) class168_sub2.method2710();
	float f_3_ = (float) class168_sub2.method2711();
	Interface38 interface38_4_ = interface38;
	float f_5_ = f * 2.0F / f_2_;
	float f_6_ = -f * 2.0F / f_3_;
	float[] fs = { -1.0F + f_5_, 1.0F + f_6_, 0.0F, 0.0F, -1.0F + f_5_,
		       -3.0F + f_6_, 0.0F, 2.0F, 3.0F + f_5_, 1.0F + f_6_,
		       2.0F, 0.0F };
	int i_7_ = (int) f_2_;
	int i_8_ = (int) f_3_;
	int i_9_
	    = (bool ? aClass182_Sub1_3731.method3322(-2022841575).method2710()
	       : i_7_);
	int i_10_
	    = (bool ? aClass182_Sub1_3731.method3322(-2135870197).method2711()
	       : i_8_);
	Class273 class273 = aClass273Array10281[anInt10284 - 1];
	aClass266_10283.method4856(class273);
	aClass266_10283.method4804();
	aClass266_10283.method4806(aClass525_Sub5_Sub1_10287, aFloat10279,
				   aFloatArray10288[0], aFloatArray10288[1],
				   aFloatArray10288[2], (byte) 61);
	Object object = null;
	Object object_11_ = null;
	for (int i_12_ = 0; i_12_ < anInt10284; i_12_++) {
	    if (aClass169_Sub1Array10282[i_12_] != null) {
		Class525_Sub5_Sub1 class525_sub5_sub1
		    = aClass525_Sub5_Sub1Array10286[i_12_];
		Interface39 interface39
		    = aClass169_Sub1Array10282[i_12_].method14651();
		aClass266_10283.method4828(class525_sub5_sub1, i_12_ + 1,
					   interface39, 513894529);
	    }
	}
	float f_13_ = (float) i_7_ / f_2_;
	float f_14_ = (float) i_8_ / f_3_;
	float f_15_ = (float) i_9_ / f_2_;
	float f_16_ = (float) i_10_ / f_3_;
	fs[8] = (fs[8] + 1.0F) * f_13_ - 1.0F;
	fs[5] = (fs[5] - 1.0F) * f_14_ + 1.0F;
	fs[10] *= f_15_;
	fs[7] *= f_16_;
	aClass266_10283.method4807(aClass525_Sub5_Sub1_10289, fs, -516160187);
	aClass266_10283.method4828(aClass525_Sub5_Sub1_10285, 0,
				   interface38_4_, -904713786);
	aClass266_10283.method4806(aClass525_Sub5_Sub1_10280, 0.0F, 0.0F, 0.0F,
				   0.0F, (byte) 47);
	aClass182_Sub1_3731.method3277(0, 0, i_7_, i_8_);
    }
    
    void method6093(int i) {
	aClass266_10283.method4805();
    }
    
    int method6084() {
	return 0;
    }
    
    boolean method6116() {
	return (anInt10284 == 0 || aFloat10279 == 1.0F
		|| (aFloatArray10288[0] + aFloatArray10288[1]
		    + aFloatArray10288[2]) == 0.0F
		|| (aClass169_Sub1Array10282[0] == null
		    && aClass169_Sub1Array10282[1] == null
		    && aClass169_Sub1Array10282[2] == null));
    }
    
    void method6112() {
	/* empty */
    }
    
    boolean method6085() {
	return aBool10290;
    }
    
    boolean method6088() {
	return (aClass182_Sub1_3731.aBool9302
		&& aClass182_Sub1_3731.method14655());
    }
    
    public Class347_Sub3(Class182_Sub1 class182_sub1) {
	super(class182_sub1);
    }
    
    boolean method6081() {
	if (method6074()) {
	    aClass266_10283
		= aClass182_Sub1_3731.method14660("FilterColourRemapping");
	    if (aClass266_10283 == null)
		return false;
	    try {
		aClass525_Sub5_Sub1_10285
		    = aClass266_10283.method4837("sceneTex", 886883362);
		aClass273Array10281 = new Class273[3];
		aClass525_Sub5_Sub1Array10286 = new Class525_Sub5_Sub1[3];
		if (aClass182_Sub1_3731.aBool9307) {
		    aClass273Array10281[0]
			= aClass266_10283.method4839("techRemap3D_1",
						     -471176356);
		    aClass273Array10281[1]
			= aClass266_10283.method4839("techRemap3D_2",
						     -560195217);
		    aClass273Array10281[2]
			= aClass266_10283.method4839("techRemap3D_3",
						     -1893184271);
		    aClass525_Sub5_Sub1Array10286[0]
			= aClass266_10283.method4837("remapTex3D_1",
						     886883362);
		    aClass525_Sub5_Sub1Array10286[1]
			= aClass266_10283.method4837("remapTex3D_2",
						     886883362);
		    aClass525_Sub5_Sub1Array10286[2]
			= aClass266_10283.method4837("remapTex3D_3",
						     886883362);
		} else {
		    aClass273Array10281[0]
			= aClass266_10283.method4839("techRemap2D_1",
						     -1982408084);
		    aClass273Array10281[1]
			= aClass266_10283.method4839("techRemap2D_2",
						     -967617999);
		    aClass273Array10281[2]
			= aClass266_10283.method4839("techRemap2D_3",
						     -304359747);
		    aClass525_Sub5_Sub1Array10286[0]
			= aClass266_10283.method4837("remapTex2D_1",
						     886883362);
		    aClass525_Sub5_Sub1Array10286[1]
			= aClass266_10283.method4837("remapTex2D_2",
						     886883362);
		    aClass525_Sub5_Sub1Array10286[2]
			= aClass266_10283.method4837("remapTex2D_3",
						     886883362);
		}
		aClass525_Sub5_Sub1_10287
		    = aClass266_10283.method4837("paramsWeightings",
						 886883362);
		aClass525_Sub5_Sub1_10280
		    = aClass266_10283.method4837("pixelOffset", 886883362);
		aClass525_Sub5_Sub1_10289
		    = aClass266_10283.method4837("PosAndTexCoords", 886883362);
	    } catch (Exception_Sub5_Sub2 exception_sub5_sub2) {
		return false;
	    } catch (Exception_Sub5_Sub1 exception_sub5_sub1) {
		return false;
	    }
	    if (!aClass273Array10281[0].method5043()
		|| !aClass273Array10281[1].method5043()
		|| !aClass273Array10281[2].method5043())
		return false;
	    aBool10290 = true;
	    return true;
	}
	return false;
    }
    
    boolean method6102() {
	if (method6074()) {
	    aClass266_10283
		= aClass182_Sub1_3731.method14660("FilterColourRemapping");
	    if (aClass266_10283 == null)
		return false;
	    try {
		aClass525_Sub5_Sub1_10285
		    = aClass266_10283.method4837("sceneTex", 886883362);
		aClass273Array10281 = new Class273[3];
		aClass525_Sub5_Sub1Array10286 = new Class525_Sub5_Sub1[3];
		if (aClass182_Sub1_3731.aBool9307) {
		    aClass273Array10281[0]
			= aClass266_10283.method4839("techRemap3D_1",
						     -2022919429);
		    aClass273Array10281[1]
			= aClass266_10283.method4839("techRemap3D_2",
						     -1210710727);
		    aClass273Array10281[2]
			= aClass266_10283.method4839("techRemap3D_3",
						     -1290104626);
		    aClass525_Sub5_Sub1Array10286[0]
			= aClass266_10283.method4837("remapTex3D_1",
						     886883362);
		    aClass525_Sub5_Sub1Array10286[1]
			= aClass266_10283.method4837("remapTex3D_2",
						     886883362);
		    aClass525_Sub5_Sub1Array10286[2]
			= aClass266_10283.method4837("remapTex3D_3",
						     886883362);
		} else {
		    aClass273Array10281[0]
			= aClass266_10283.method4839("techRemap2D_1",
						     -910969281);
		    aClass273Array10281[1]
			= aClass266_10283.method4839("techRemap2D_2",
						     -398684662);
		    aClass273Array10281[2]
			= aClass266_10283.method4839("techRemap2D_3",
						     -1960367053);
		    aClass525_Sub5_Sub1Array10286[0]
			= aClass266_10283.method4837("remapTex2D_1",
						     886883362);
		    aClass525_Sub5_Sub1Array10286[1]
			= aClass266_10283.method4837("remapTex2D_2",
						     886883362);
		    aClass525_Sub5_Sub1Array10286[2]
			= aClass266_10283.method4837("remapTex2D_3",
						     886883362);
		}
		aClass525_Sub5_Sub1_10287
		    = aClass266_10283.method4837("paramsWeightings",
						 886883362);
		aClass525_Sub5_Sub1_10280
		    = aClass266_10283.method4837("pixelOffset", 886883362);
		aClass525_Sub5_Sub1_10289
		    = aClass266_10283.method4837("PosAndTexCoords", 886883362);
	    } catch (Exception_Sub5_Sub2 exception_sub5_sub2) {
		return false;
	    } catch (Exception_Sub5_Sub1 exception_sub5_sub1) {
		return false;
	    }
	    if (!aClass273Array10281[0].method5043()
		|| !aClass273Array10281[1].method5043()
		|| !aClass273Array10281[2].method5043())
		return false;
	    aBool10290 = true;
	    return true;
	}
	return false;
    }
    
    void method6096() {
	/* empty */
    }
    
    void method6095() {
	/* empty */
    }
    
    int method6082() {
	return 1;
    }
    
    void method6097(int i, int i_17_) {
	/* empty */
    }
    
    void method6098(int i, Class168_Sub2 class168_sub2,
		    Interface38 interface38, Interface22 interface22,
		    Interface38 interface38_18_, boolean bool) {
	float f = aClass182_Sub1_3731.method14674();
	float f_19_ = (float) class168_sub2.method2710();
	float f_20_ = (float) class168_sub2.method2711();
	Interface38 interface38_21_ = interface38;
	float f_22_ = f * 2.0F / f_19_;
	float f_23_ = -f * 2.0F / f_20_;
	float[] fs = { -1.0F + f_22_, 1.0F + f_23_, 0.0F, 0.0F, -1.0F + f_22_,
		       -3.0F + f_23_, 0.0F, 2.0F, 3.0F + f_22_, 1.0F + f_23_,
		       2.0F, 0.0F };
	int i_24_ = (int) f_19_;
	int i_25_ = (int) f_20_;
	int i_26_
	    = (bool ? aClass182_Sub1_3731.method3322(-2033293094).method2710()
	       : i_24_);
	int i_27_
	    = (bool ? aClass182_Sub1_3731.method3322(-2126317133).method2711()
	       : i_25_);
	Class273 class273 = aClass273Array10281[anInt10284 - 1];
	aClass266_10283.method4856(class273);
	aClass266_10283.method4804();
	aClass266_10283.method4806(aClass525_Sub5_Sub1_10287, aFloat10279,
				   aFloatArray10288[0], aFloatArray10288[1],
				   aFloatArray10288[2], (byte) 51);
	Object object = null;
	Object object_28_ = null;
	for (int i_29_ = 0; i_29_ < anInt10284; i_29_++) {
	    if (aClass169_Sub1Array10282[i_29_] != null) {
		Class525_Sub5_Sub1 class525_sub5_sub1
		    = aClass525_Sub5_Sub1Array10286[i_29_];
		Interface39 interface39
		    = aClass169_Sub1Array10282[i_29_].method14651();
		aClass266_10283.method4828(class525_sub5_sub1, i_29_ + 1,
					   interface39, -1354878349);
	    }
	}
	float f_30_ = (float) i_24_ / f_19_;
	float f_31_ = (float) i_25_ / f_20_;
	float f_32_ = (float) i_26_ / f_19_;
	float f_33_ = (float) i_27_ / f_20_;
	fs[8] = (fs[8] + 1.0F) * f_30_ - 1.0F;
	fs[5] = (fs[5] - 1.0F) * f_31_ + 1.0F;
	fs[10] *= f_32_;
	fs[7] *= f_33_;
	aClass266_10283.method4807(aClass525_Sub5_Sub1_10289, fs, 745652663);
	aClass266_10283.method4828(aClass525_Sub5_Sub1_10285, 0,
				   interface38_21_, 364514083);
	aClass266_10283.method4806(aClass525_Sub5_Sub1_10280, 0.0F, 0.0F, 0.0F,
				   0.0F, (byte) 100);
	aClass182_Sub1_3731.method3277(0, 0, i_24_, i_25_);
    }
    
    void method6099(int i, Class168_Sub2 class168_sub2,
		    Interface38 interface38, Interface22 interface22,
		    Interface38 interface38_34_, boolean bool) {
	float f = aClass182_Sub1_3731.method14674();
	float f_35_ = (float) class168_sub2.method2710();
	float f_36_ = (float) class168_sub2.method2711();
	Interface38 interface38_37_ = interface38;
	float f_38_ = f * 2.0F / f_35_;
	float f_39_ = -f * 2.0F / f_36_;
	float[] fs = { -1.0F + f_38_, 1.0F + f_39_, 0.0F, 0.0F, -1.0F + f_38_,
		       -3.0F + f_39_, 0.0F, 2.0F, 3.0F + f_38_, 1.0F + f_39_,
		       2.0F, 0.0F };
	int i_40_ = (int) f_35_;
	int i_41_ = (int) f_36_;
	int i_42_
	    = (bool ? aClass182_Sub1_3731.method3322(-2059472839).method2710()
	       : i_40_);
	int i_43_
	    = (bool ? aClass182_Sub1_3731.method3322(-2017212831).method2711()
	       : i_41_);
	Class273 class273 = aClass273Array10281[anInt10284 - 1];
	aClass266_10283.method4856(class273);
	aClass266_10283.method4804();
	aClass266_10283.method4806(aClass525_Sub5_Sub1_10287, aFloat10279,
				   aFloatArray10288[0], aFloatArray10288[1],
				   aFloatArray10288[2], (byte) 52);
	Object object = null;
	Object object_44_ = null;
	for (int i_45_ = 0; i_45_ < anInt10284; i_45_++) {
	    if (aClass169_Sub1Array10282[i_45_] != null) {
		Class525_Sub5_Sub1 class525_sub5_sub1
		    = aClass525_Sub5_Sub1Array10286[i_45_];
		Interface39 interface39
		    = aClass169_Sub1Array10282[i_45_].method14651();
		aClass266_10283.method4828(class525_sub5_sub1, i_45_ + 1,
					   interface39, 1065204841);
	    }
	}
	float f_46_ = (float) i_40_ / f_35_;
	float f_47_ = (float) i_41_ / f_36_;
	float f_48_ = (float) i_42_ / f_35_;
	float f_49_ = (float) i_43_ / f_36_;
	fs[8] = (fs[8] + 1.0F) * f_46_ - 1.0F;
	fs[5] = (fs[5] - 1.0F) * f_47_ + 1.0F;
	fs[10] *= f_48_;
	fs[7] *= f_49_;
	aClass266_10283.method4807(aClass525_Sub5_Sub1_10289, fs, -1866494981);
	aClass266_10283.method4828(aClass525_Sub5_Sub1_10285, 0,
				   interface38_37_, -902719709);
	aClass266_10283.method4806(aClass525_Sub5_Sub1_10280, 0.0F, 0.0F, 0.0F,
				   0.0F, (byte) 91);
	aClass182_Sub1_3731.method3277(0, 0, i_40_, i_41_);
    }
    
    void method6100(int i) {
	aClass266_10283.method4805();
    }
    
    boolean method6089() {
	return (aClass182_Sub1_3731.aBool9302
		&& aClass182_Sub1_3731.method14655());
    }
    
    int method6086() {
	return 1;
    }
    
    int method6108() {
	return 2;
    }
    
    int method6104() {
	return 0;
    }
    
    void method6087(int i) {
	aClass266_10283.method4805();
    }
    
    int method6106() {
	return 0;
    }
    
    int method6101() {
	return 0;
    }
    
    boolean method6090() {
	return (anInt10284 == 0 || aFloat10279 == 1.0F
		|| (aFloatArray10288[0] + aFloatArray10288[1]
		    + aFloatArray10288[2]) == 0.0F
		|| (aClass169_Sub1Array10282[0] == null
		    && aClass169_Sub1Array10282[1] == null
		    && aClass169_Sub1Array10282[2] == null));
    }
    
    void method6078() {
	/* empty */
    }
    
    static {
	aFloat10279 = 1.0F;
	anInt10284 = 1;
	aClass169_Sub1Array10282 = new Class169_Sub1[] { null, null, null };
    }
    
    boolean method6094() {
	return (anInt10284 == 0 || aFloat10279 == 1.0F
		|| (aFloatArray10288[0] + aFloatArray10288[1]
		    + aFloatArray10288[2]) == 0.0F
		|| (aClass169_Sub1Array10282[0] == null
		    && aClass169_Sub1Array10282[1] == null
		    && aClass169_Sub1Array10282[2] == null));
    }
    
    int method6083() {
	return 2;
    }
    
    boolean method6119() {
	return aBool10290;
    }
}
