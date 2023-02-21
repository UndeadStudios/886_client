/* Class266 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class266
{
    static Interface29 anInterface29_2807 = new Class261();
    Class273[] aClass273Array2808;
    Class283 aClass283_2809;
    Class283 aClass283_2810;
    int anInt2811;
    String aString2812;
    protected int anInt2813 = 1852759053;
    int anInt2814;
    
    public String method4803() {
	return aString2812;
    }
    
    public abstract void method4804();
    
    public abstract void method4805();
    
    public final void method4806(Class525_Sub5_Sub1 class525_sub5_sub1,
				 float f, float f_0_, float f_1_, float f_2_,
				 byte i) {
	aClass273Array2808[-1130812101 * anInt2813]
	    .method5034(class525_sub5_sub1, f, f_0_, f_1_, f_2_);
    }
    
    public final void method4807(Class525_Sub5_Sub1 class525_sub5_sub1,
				 float[] fs, int i) {
	aClass273Array2808[-1130812101 * anInt2813]
	    .method5058(class525_sub5_sub1, fs, fs.length);
    }
    
    abstract Class273 method4808(Class182_Sub1 class182_sub1,
				 Class280 class280);
    
    public final void method4809(int i, Class435 class435, int i_3_) {
	aClass273Array2808[-1130812101 * anInt2813].method5044(i, class435);
    }
    
    public final int method4810(int i) {
	return aClass273Array2808.length;
    }
    
    public final Class273 method4811(int i, int i_4_) {
	return aClass273Array2808[i];
    }
    
    public int method4812(Class273 class273, int i) {
	for (int i_5_ = 0; i_5_ < aClass273Array2808.length; i_5_++) {
	    if (class273 == aClass273Array2808[i_5_])
		return i_5_;
	}
	return -1;
    }
    
    public final int method4813() {
	return aClass273Array2808.length;
    }
    
    public final int method4814() {
	return aClass273Array2808.length;
    }
    
    public final Class273 method4815() {
	return (-1130812101 * anInt2813 >= 0
		? aClass273Array2808[anInt2813 * -1130812101] : null);
    }
    
    public final int method4816(int i) {
	return anInt2813 * -1130812101;
    }
    
    abstract Class525_Sub5_Sub1 method4817(Class274 class274);
    
    public final void method4818(Class525_Sub5_Sub1 class525_sub5_sub1,
				 float f, int i) {
	aClass273Array2808[-1130812101 * anInt2813]
	    .method5031(class525_sub5_sub1, f);
    }
    
    public final void method4819(Class525_Sub5_Sub1 class525_sub5_sub1,
				 float f, float f_6_, int i) {
	aClass273Array2808[-1130812101 * anInt2813]
	    .method5032(class525_sub5_sub1, f, f_6_);
    }
    
    public final void method4820(Class525_Sub5_Sub1 class525_sub5_sub1,
				 float f, float f_7_, float f_8_, int i) {
	aClass273Array2808[-1130812101 * anInt2813]
	    .method5033(class525_sub5_sub1, f, f_7_, f_8_);
    }
    
    public Class525_Sub5_Sub1 method4821(String string)
	throws Exception_Sub5_Sub2 {
	Class525_Sub5_Sub1 class525_sub5_sub1
	    = ((Class525_Sub5_Sub1)
	       aClass283_2809.method5201(string, (byte) 43));
	if (null == class525_sub5_sub1)
	    throw new Exception_Sub5_Sub2(string);
	return class525_sub5_sub1;
    }
    
    public final void method4822(Class525_Sub5_Sub1 class525_sub5_sub1,
				 Class446 class446, int i) {
	aClass273Array2808[-1130812101 * anInt2813].method5033
	    (class525_sub5_sub1, class446.aFloat4895, class446.aFloat4896,
	     class446.aFloat4897);
    }
    
    public final void method4823(Class525_Sub5_Sub1 class525_sub5_sub1,
				 Class437 class437, int i) {
	aClass273Array2808[anInt2813 * -1130812101].method5034
	    (class525_sub5_sub1, class437.aFloat4851, class437.aFloat4850,
	     class437.aFloat4849, class437.aFloat4852);
    }
    
    public final void method4824(Class525_Sub5_Sub1 class525_sub5_sub1, int i,
				 Interface39 interface39) {
	aClass273Array2808[anInt2813 * -1130812101]
	    .method5029(class525_sub5_sub1, i, interface39);
    }
    
    public final void method4825(Class525_Sub5_Sub1 class525_sub5_sub1, int i,
				 byte i_9_) {
	float f = (float) (i >> 16 & 0xff) / 255.0F;
	float f_10_ = (float) (i >> 8 & 0xff) / 255.0F;
	float f_11_ = (float) (i & 0xff) / 255.0F;
	float f_12_ = (float) (i >> 24 & 0xff) / 255.0F;
	method4806(class525_sub5_sub1, f, f_10_, f_11_, f_12_, (byte) 100);
    }
    
    public final void method4826(Class525_Sub5_Sub1 class525_sub5_sub1,
				 Class435 class435, short i) {
	aClass273Array2808[anInt2813 * -1130812101]
	    .method5036(class525_sub5_sub1, class435);
    }
    
    public final void method4827(Class525_Sub5_Sub1 class525_sub5_sub1,
				 Class435 class435, int i) {
	aClass273Array2808[anInt2813 * -1130812101]
	    .method5063(class525_sub5_sub1, class435);
    }
    
    public final void method4828(Class525_Sub5_Sub1 class525_sub5_sub1, int i,
				 Interface39 interface39, int i_13_) {
	aClass273Array2808[anInt2813 * -1130812101]
	    .method5029(class525_sub5_sub1, i, interface39);
    }
    
    public final void method4829(int i, float f, float f_14_, float f_15_,
				 byte i_16_) {
	aClass273Array2808[anInt2813 * -1130812101].method5028(i, f, f_14_,
							       f_15_);
    }
    
    public abstract boolean method4830();
    
    public Class525_Sub5_Sub1 method4831(int i, byte i_17_) {
	return (Class525_Sub5_Sub1) aClass283_2810.method5200(i, -980650477);
    }
    
    public final void method4832(int i, float[] fs, int i_18_, byte i_19_) {
	aClass273Array2808[anInt2813 * -1130812101].method5041(i, fs, i_18_);
    }
    
    public int method4833() {
	return -1139834357 * anInt2814;
    }
    
    public final void method4834(int i, Class435 class435, int i_20_) {
	aClass273Array2808[anInt2813 * -1130812101].method5055(i, class435);
    }
    
    public final void method4835(Class525_Sub5_Sub1 class525_sub5_sub1,
				 Class437 class437) {
	aClass273Array2808[anInt2813 * -1130812101].method5034
	    (class525_sub5_sub1, class437.aFloat4851, class437.aFloat4850,
	     class437.aFloat4849, class437.aFloat4852);
    }
    
    public final void method4836(int i, int i_21_, Interface39 interface39,
				 int i_22_) {
	aClass273Array2808[anInt2813 * -1130812101].method5072(i, i_21_,
							       interface39);
    }
    
    public Class525_Sub5_Sub1 method4837(String string, int i)
	throws Exception_Sub5_Sub2 {
	Class525_Sub5_Sub1 class525_sub5_sub1
	    = ((Class525_Sub5_Sub1)
	       aClass283_2809.method5201(string, (byte) 107));
	if (null == class525_sub5_sub1)
	    throw new Exception_Sub5_Sub2(string);
	return class525_sub5_sub1;
    }
    
    public String method4838(int i) {
	return aString2812;
    }
    
    public Class273 method4839(String string, int i)
	throws Exception_Sub5_Sub1 {
	Class273[] class273s = aClass273Array2808;
	for (int i_23_ = 0; i_23_ < class273s.length; i_23_++) {
	    Class273 class273 = class273s[i_23_];
	    String string_24_ = class273.method5030(1569824710);
	    if (string_24_ != null && string_24_.equals(string)) {
		if (!class273.method5043())
		    throw new Exception_Sub5_Sub1(string);
		return class273;
	    }
	}
	throw new Exception_Sub5_Sub1(string);
    }
    
    public Class525_Sub5_Sub1 method4840(String string, int i) {
	return ((Class525_Sub5_Sub1)
		aClass283_2810.method5201(string, (byte) 15));
    }
    
    public final void method4841(int i, Class435 class435, int i_25_) {
	aClass273Array2808[anInt2813 * -1130812101].method5039(i, class435);
    }
    
    public Class525_Sub5_Sub1 method4842(int i, int i_26_) {
	return (Class525_Sub5_Sub1) aClass283_2809.method5200(i, -1065034914);
    }
    
    void method4843() {
	/* empty */
    }
    
    public abstract void method4844();
    
    public abstract void method4845();
    
    abstract Class273 method4846(Class182_Sub1 class182_sub1,
				 Class280 class280);
    
    public abstract boolean method4847();
    
    public String method4848() {
	return aString2812;
    }
    
    public String method4849() {
	return aString2812;
    }
    
    public final void method4850(Class525_Sub5_Sub1 class525_sub5_sub1,
				 Class437 class437) {
	aClass273Array2808[anInt2813 * -1130812101].method5034
	    (class525_sub5_sub1, class437.aFloat4851, class437.aFloat4850,
	     class437.aFloat4849, class437.aFloat4852);
    }
    
    public String method4851() {
	return aString2812;
    }
    
    public String method4852() {
	return aString2812;
    }
    
    public final void method4853(int i, float[] fs, int i_27_) {
	aClass273Array2808[anInt2813 * -1130812101].method5041(i, fs, i_27_);
    }
    
    public final void method4854(Class525_Sub5_Sub1 class525_sub5_sub1,
				 float f, float f_28_, float f_29_) {
	aClass273Array2808[-1130812101 * anInt2813]
	    .method5033(class525_sub5_sub1, f, f_28_, f_29_);
    }
    
    abstract Class273 method4855(Class182_Sub1 class182_sub1,
				 Class280 class280);
    
    public abstract boolean method4856(Class273 class273);
    
    public Class525_Sub5_Sub1 method4857(String string) {
	return ((Class525_Sub5_Sub1)
		aClass283_2810.method5201(string, (byte) 83));
    }
    
    public final int method4858() {
	return aClass273Array2808.length;
    }
    
    public final void method4859(Class525_Sub5_Sub1 class525_sub5_sub1,
				 Class437 class437) {
	aClass273Array2808[anInt2813 * -1130812101].method5034
	    (class525_sub5_sub1, class437.aFloat4851, class437.aFloat4850,
	     class437.aFloat4849, class437.aFloat4852);
    }
    
    public final int method4860() {
	return aClass273Array2808.length;
    }
    
    public final void method4861(Class525_Sub5_Sub1 class525_sub5_sub1,
				 float f, float f_30_, float f_31_) {
	aClass273Array2808[-1130812101 * anInt2813]
	    .method5033(class525_sub5_sub1, f, f_30_, f_31_);
    }
    
    public Class273 method4862(int i) {
	Class273[] class273s = aClass273Array2808;
	for (int i_32_ = 0; i_32_ < class273s.length; i_32_++) {
	    Class273 class273 = class273s[i_32_];
	    if (class273.method5043())
		return class273;
	}
	return null;
    }
    
    public abstract void method4863();
    
    public int method4864(Class273 class273) {
	for (int i = 0; i < aClass273Array2808.length; i++) {
	    if (class273 == aClass273Array2808[i])
		return i;
	}
	return -1;
    }
    
    public Class273 method4865() {
	Class273[] class273s = aClass273Array2808;
	for (int i = 0; i < class273s.length; i++) {
	    Class273 class273 = class273s[i];
	    if (class273.method5043())
		return class273;
	}
	return null;
    }
    
    public abstract boolean method4866(Class273 class273);
    
    public final int method4867() {
	return aClass273Array2808.length;
    }
    
    public final void method4868(Class525_Sub5_Sub1 class525_sub5_sub1,
				 Class446 class446) {
	aClass273Array2808[-1130812101 * anInt2813].method5033
	    (class525_sub5_sub1, class446.aFloat4895, class446.aFloat4896,
	     class446.aFloat4897);
    }
    
    public abstract boolean method4869(Class273 class273);
    
    public int method4870(int i) {
	return -1139834357 * anInt2814;
    }
    
    public final void method4871(int i, float f, float f_33_, float f_34_,
				 float f_35_) {
	aClass273Array2808[anInt2813 * -1130812101].method5040(i, f, f_33_,
							       f_34_, f_35_);
    }
    
    public final Class273 method4872() {
	return (-1130812101 * anInt2813 >= 0
		? aClass273Array2808[anInt2813 * -1130812101] : null);
    }
    
    public abstract boolean method4873(Class273 class273);
    
    public final int method4874() {
	return anInt2813 * -1130812101;
    }
    
    abstract Class525_Sub5_Sub1 method4875(Class274 class274);
    
    abstract Class525_Sub5_Sub1 method4876(Class274 class274);
    
    Class266(Class182_Sub1 class182_sub1, Class262 class262) {
	aString2812 = class262.aString2792;
	anInt2811 = 483807657 * class262.aClass274Array2794.length;
	aClass283_2809
	    = new Class283(anInt2811 * 1484972697, anInterface29_2807);
	for (int i = 0; i < 1484972697 * anInt2811; i++)
	    aClass283_2809.method5203
		(i, class262.aClass274Array2794[i].aString2856,
		 method4817(class262.aClass274Array2794[i]), 416509926);
	anInt2814 = class262.aClass274Array2795.length * 865827235;
	aClass283_2810
	    = new Class283(anInt2814 * -1139834357, anInterface29_2807);
	for (int i = 0; i < -1139834357 * anInt2814; i++)
	    aClass283_2810.method5203
		(i, class262.aClass274Array2795[i].aString2856,
		 method4817(class262.aClass274Array2795[i]), 416509926);
	aClass273Array2808 = new Class273[class262.aClass280Array2796.length];
	for (int i = 0; i < class262.aClass280Array2796.length; i++)
	    aClass273Array2808[i]
		= method4808(class182_sub1, class262.aClass280Array2796[i]);
    }
    
    public final void method4877(Class525_Sub5_Sub1 class525_sub5_sub1,
				 float f) {
	aClass273Array2808[-1130812101 * anInt2813]
	    .method5031(class525_sub5_sub1, f);
    }
    
    public final void method4878(Class525_Sub5_Sub1 class525_sub5_sub1,
				 float f, float f_36_) {
	aClass273Array2808[-1130812101 * anInt2813]
	    .method5032(class525_sub5_sub1, f, f_36_);
    }
    
    public final void method4879(Class525_Sub5_Sub1 class525_sub5_sub1,
				 float f) {
	aClass273Array2808[-1130812101 * anInt2813]
	    .method5031(class525_sub5_sub1, f);
    }
    
    public Class525_Sub5_Sub1 method4880(int i) {
	return (Class525_Sub5_Sub1) aClass283_2809.method5200(i, -987600408);
    }
    
    public final void method4881(Class525_Sub5_Sub1 class525_sub5_sub1,
				 float f, float f_37_, float f_38_) {
	aClass273Array2808[-1130812101 * anInt2813]
	    .method5033(class525_sub5_sub1, f, f_37_, f_38_);
    }
    
    public final Class273 method4882() {
	return (-1130812101 * anInt2813 >= 0
		? aClass273Array2808[anInt2813 * -1130812101] : null);
    }
    
    public final void method4883(Class525_Sub5_Sub1 class525_sub5_sub1,
				 float f, float f_39_, float f_40_) {
	aClass273Array2808[-1130812101 * anInt2813]
	    .method5033(class525_sub5_sub1, f, f_39_, f_40_);
    }
    
    public int method4884(Class273 class273) {
	for (int i = 0; i < aClass273Array2808.length; i++) {
	    if (class273 == aClass273Array2808[i])
		return i;
	}
	return -1;
    }
    
    public final void method4885(Class525_Sub5_Sub1 class525_sub5_sub1,
				 float f, float f_41_, float f_42_,
				 float f_43_) {
	aClass273Array2808[-1130812101 * anInt2813]
	    .method5034(class525_sub5_sub1, f, f_41_, f_42_, f_43_);
    }
    
    public final void method4886(Class525_Sub5_Sub1 class525_sub5_sub1,
				 float f, float f_44_, float f_45_,
				 float f_46_) {
	aClass273Array2808[-1130812101 * anInt2813]
	    .method5034(class525_sub5_sub1, f, f_44_, f_45_, f_46_);
    }
    
    public final void method4887(Class525_Sub5_Sub1 class525_sub5_sub1,
				 float f, float f_47_, float f_48_,
				 float f_49_) {
	aClass273Array2808[-1130812101 * anInt2813]
	    .method5034(class525_sub5_sub1, f, f_47_, f_48_, f_49_);
    }
    
    public final void method4888(Class525_Sub5_Sub1 class525_sub5_sub1,
				 float f, float f_50_, float f_51_,
				 float f_52_) {
	aClass273Array2808[-1130812101 * anInt2813]
	    .method5034(class525_sub5_sub1, f, f_50_, f_51_, f_52_);
    }
    
    public final void method4889(Class525_Sub5_Sub1 class525_sub5_sub1,
				 Class446 class446) {
	aClass273Array2808[-1130812101 * anInt2813].method5033
	    (class525_sub5_sub1, class446.aFloat4895, class446.aFloat4896,
	     class446.aFloat4897);
    }
    
    public final void method4890(Class525_Sub5_Sub1 class525_sub5_sub1,
				 Class446 class446) {
	aClass273Array2808[-1130812101 * anInt2813].method5033
	    (class525_sub5_sub1, class446.aFloat4895, class446.aFloat4896,
	     class446.aFloat4897);
    }
    
    public final void method4891(Class525_Sub5_Sub1 class525_sub5_sub1,
				 float f, float f_53_) {
	aClass273Array2808[-1130812101 * anInt2813]
	    .method5032(class525_sub5_sub1, f, f_53_);
    }
    
    public final void method4892(Class525_Sub5_Sub1 class525_sub5_sub1,
				 Class446 class446) {
	aClass273Array2808[-1130812101 * anInt2813].method5033
	    (class525_sub5_sub1, class446.aFloat4895, class446.aFloat4896,
	     class446.aFloat4897);
    }
    
    public final void method4893(Class525_Sub5_Sub1 class525_sub5_sub1,
				 float f, float f_54_) {
	aClass273Array2808[-1130812101 * anInt2813]
	    .method5032(class525_sub5_sub1, f, f_54_);
    }
    
    abstract Class273 method4894(Class182_Sub1 class182_sub1,
				 Class280 class280);
    
    public Class525_Sub5_Sub1 method4895(String string) {
	return ((Class525_Sub5_Sub1)
		aClass283_2810.method5201(string, (byte) 24));
    }
    
    public final Class273 method4896() {
	return (-1130812101 * anInt2813 >= 0
		? aClass273Array2808[anInt2813 * -1130812101] : null);
    }
    
    public int method4897(int i) {
	return 1484972697 * anInt2811;
    }
    
    public Class273 method4898(String string) throws Exception_Sub5_Sub1 {
	Class273[] class273s = aClass273Array2808;
	for (int i = 0; i < class273s.length; i++) {
	    Class273 class273 = class273s[i];
	    String string_55_ = class273.method5030(-510761687);
	    if (string_55_ != null && string_55_.equals(string)) {
		if (!class273.method5043())
		    throw new Exception_Sub5_Sub1(string);
		return class273;
	    }
	}
	throw new Exception_Sub5_Sub1(string);
    }
    
    public final void method4899(Class525_Sub5_Sub1 class525_sub5_sub1,
				 int i) {
	float f = (float) (i >> 16 & 0xff) / 255.0F;
	float f_56_ = (float) (i >> 8 & 0xff) / 255.0F;
	float f_57_ = (float) (i & 0xff) / 255.0F;
	float f_58_ = (float) (i >> 24 & 0xff) / 255.0F;
	method4806(class525_sub5_sub1, f, f_56_, f_57_, f_58_, (byte) 55);
    }
    
    public final void method4900(Class525_Sub5_Sub1 class525_sub5_sub1,
				 int i) {
	float f = (float) (i >> 16 & 0xff) / 255.0F;
	float f_59_ = (float) (i >> 8 & 0xff) / 255.0F;
	float f_60_ = (float) (i & 0xff) / 255.0F;
	float f_61_ = (float) (i >> 24 & 0xff) / 255.0F;
	method4806(class525_sub5_sub1, f, f_59_, f_60_, f_61_, (byte) 44);
    }
    
    public final void method4901(Class525_Sub5_Sub1 class525_sub5_sub1,
				 Class435 class435) {
	aClass273Array2808[anInt2813 * -1130812101]
	    .method5036(class525_sub5_sub1, class435);
    }
    
    public final void method4902(Class525_Sub5_Sub1 class525_sub5_sub1,
				 Class435 class435) {
	aClass273Array2808[anInt2813 * -1130812101]
	    .method5063(class525_sub5_sub1, class435);
    }
    
    public final void method4903(Class525_Sub5_Sub1 class525_sub5_sub1,
				 Class435 class435) {
	aClass273Array2808[anInt2813 * -1130812101]
	    .method5063(class525_sub5_sub1, class435);
    }
    
    public abstract boolean method4904(Class273 class273);
    
    public Class273 method4905(String string) throws Exception_Sub5_Sub1 {
	Class273[] class273s = aClass273Array2808;
	for (int i = 0; i < class273s.length; i++) {
	    Class273 class273 = class273s[i];
	    String string_62_ = class273.method5030(562795569);
	    if (string_62_ != null && string_62_.equals(string)) {
		if (!class273.method5043())
		    throw new Exception_Sub5_Sub1(string);
		return class273;
	    }
	}
	throw new Exception_Sub5_Sub1(string);
    }
    
    public final void method4906(int i, float f, float f_63_, float f_64_) {
	aClass273Array2808[anInt2813 * -1130812101].method5028(i, f, f_63_,
							       f_64_);
    }
    
    public final void method4907(int i, float f, float f_65_, float f_66_) {
	aClass273Array2808[anInt2813 * -1130812101].method5028(i, f, f_65_,
							       f_66_);
    }
    
    public final Class273 method4908(int i) {
	return (-1130812101 * anInt2813 >= 0
		? aClass273Array2808[anInt2813 * -1130812101] : null);
    }
    
    public abstract void method4909();
    
    public final void method4910(int i, Class446 class446) {
	aClass273Array2808[anInt2813 * -1130812101].method5028
	    (i, class446.aFloat4895, class446.aFloat4896, class446.aFloat4897);
    }
    
    public final void method4911(int i, Class446 class446) {
	aClass273Array2808[anInt2813 * -1130812101].method5028
	    (i, class446.aFloat4895, class446.aFloat4896, class446.aFloat4897);
    }
    
    public final void method4912(Class525_Sub5_Sub1 class525_sub5_sub1,
				 Class446 class446) {
	aClass273Array2808[-1130812101 * anInt2813].method5033
	    (class525_sub5_sub1, class446.aFloat4895, class446.aFloat4896,
	     class446.aFloat4897);
    }
    
    public final void method4913(int i, float[] fs, int i_67_) {
	aClass273Array2808[anInt2813 * -1130812101].method5041(i, fs, i_67_);
    }
    
    public final void method4914(int i, Class435 class435) {
	aClass273Array2808[anInt2813 * -1130812101].method5039(i, class435);
    }
    
    public final void method4915(int i, Class435 class435) {
	aClass273Array2808[anInt2813 * -1130812101].method5039(i, class435);
    }
    
    public final void method4916(int i, Class435 class435) {
	aClass273Array2808[anInt2813 * -1130812101].method5039(i, class435);
    }
    
    public final void method4917(int i, Class435 class435) {
	aClass273Array2808[anInt2813 * -1130812101].method5055(i, class435);
    }
    
    public final void method4918(int i, Class435 class435) {
	aClass273Array2808[-1130812101 * anInt2813].method5044(i, class435);
    }
    
    public final void method4919(int i, Class446 class446, int i_68_) {
	aClass273Array2808[anInt2813 * -1130812101].method5028
	    (i, class446.aFloat4895, class446.aFloat4896, class446.aFloat4897);
    }
    
    public final void method4920(int i, int i_69_, Interface39 interface39) {
	aClass273Array2808[anInt2813 * -1130812101].method5072(i, i_69_,
							       interface39);
    }
    
    public final void method4921(int i, float f, float f_70_, float f_71_) {
	aClass273Array2808[anInt2813 * -1130812101].method5028(i, f, f_70_,
							       f_71_);
    }
    
    public final void method4922(int i, int i_72_, Interface39 interface39) {
	aClass273Array2808[anInt2813 * -1130812101].method5072(i, i_72_,
							       interface39);
    }
    
    public int method4923() {
	return -1139834357 * anInt2814;
    }
    
    public final void method4924(Class525_Sub5_Sub1 class525_sub5_sub1,
				 int i) {
	float f = (float) (i >> 16 & 0xff) / 255.0F;
	float f_73_ = (float) (i >> 8 & 0xff) / 255.0F;
	float f_74_ = (float) (i & 0xff) / 255.0F;
	float f_75_ = (float) (i >> 24 & 0xff) / 255.0F;
	method4806(class525_sub5_sub1, f, f_73_, f_74_, f_75_, (byte) 45);
    }
    
    public int method4925() {
	return -1139834357 * anInt2814;
    }
    
    public Class525_Sub5_Sub1 method4926(int i) {
	return (Class525_Sub5_Sub1) aClass283_2810.method5200(i, -1009168477);
    }
    
    public Class525_Sub5_Sub1 method4927(int i) {
	return (Class525_Sub5_Sub1) aClass283_2810.method5200(i, -1671131475);
    }
    
    public int method4928() {
	return -1139834357 * anInt2814;
    }
    
    public int method4929() {
	return 1484972697 * anInt2811;
    }
    
    public final void method4930(int i, Class446 class446) {
	aClass273Array2808[anInt2813 * -1130812101].method5028
	    (i, class446.aFloat4895, class446.aFloat4896, class446.aFloat4897);
    }
    
    public int method4931() {
	return 1484972697 * anInt2811;
    }
    
    public final void method4932(Class525_Sub5_Sub1 class525_sub5_sub1,
				 float[] fs) {
	aClass273Array2808[-1130812101 * anInt2813]
	    .method5058(class525_sub5_sub1, fs, fs.length);
    }
    
    public int method4933() {
	return 1484972697 * anInt2811;
    }
    
    public int method4934() {
	return 1484972697 * anInt2811;
    }
    
    public Class525_Sub5_Sub1 method4935(int i) {
	return (Class525_Sub5_Sub1) aClass283_2809.method5200(i, -1262742262);
    }
    
    public abstract boolean method4936();
    
    public Class525_Sub5_Sub1 method4937(int i) {
	return (Class525_Sub5_Sub1) aClass283_2809.method5200(i, -1302578992);
    }
    
    public Class525_Sub5_Sub1 method4938(int i) {
	return (Class525_Sub5_Sub1) aClass283_2809.method5200(i, -1587264144);
    }
    
    void method4939() {
	/* empty */
    }
    
    void method4940() {
	/* empty */
    }
    
    public final void method4941(int i, float f, float f_76_, float f_77_,
				 float f_78_, int i_79_) {
	aClass273Array2808[anInt2813 * -1130812101].method5040(i, f, f_76_,
							       f_77_, f_78_);
    }
    
    public abstract void method4942();
    
    public Class525_Sub5_Sub1 method4943(int i) {
	return (Class525_Sub5_Sub1) aClass283_2810.method5200(i, -1688935720);
    }
    
    static final void method4944(Class683 class683, int i) {
	class683.anInt8648 -= -92693374;
	if (class683.aLongArray8645[1 + class683.anInt8648 * 105529793]
	    != class683.aLongArray8645[class683.anInt8648 * 105529793])
	    class683.anInt8663
		+= (class683.anIntArray8647[1931825055 * class683.anInt8663]
		    * -1827402657);
    }
    
    static final void method4945(Class259 class259, Class245 class245,
				 Class683 class683, byte i) {
	String string
	    = (String) (class683.anObjectArray8636
			[(class683.anInt8644 -= 1285561025) * 1373599041]);
	int[] is = Class558.method9375(string, class683, (byte) 3);
	if (null != is)
	    string = string.substring(0, string.length() - 1);
	class259.anObjectArray2710
	    = Class656_Sub1_Sub5_Sub1.method18727(string, class683,
						  -1075201657);
	class259.anIntArray2711 = is;
	class259.aBool2695 = true;
    }
    
    static final void method4946(Class683 class683, short i) {
	class683.anInt8662 -= 362986067;
	int i_80_ = class683.anIntArray8661[class683.anInt8662 * 501271953];
	int i_81_
	    = class683.anIntArray8661[class683.anInt8662 * 501271953 + 1];
	int i_82_
	    = class683.anIntArray8661[501271953 * class683.anInt8662 + 2];
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = class683.aClass353_8652.method6204(i_80_, i_81_, i_82_,
						 1700860103);
    }
}
