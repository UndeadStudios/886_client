/* Class273_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.HashMap;
import java.util.Map;

import jaggl.OpenGL;

public class Class273_Sub2 extends Class273
{
    Class182_Sub1_Sub2 aClass182_Sub1_Sub2_10066;
    static final int anInt10067 = 35632;
    static final int anInt10068 = 13;
    static boolean $assertionsDisabled
	= !com.jagex.Class273_Sub2.class.desiredAssertionStatus();
    boolean aBool10069;
    int anInt10070 = 0;
    int anInt10071 = 0;
    String aString10072;
    Class266_Sub1 aClass266_Sub1_10073;
    int[] anIntArray10074;
    static int[] anIntArray10075 = new int[2];
    static float[] aFloatArray10076 = new float[16];
    Map aMap10077;
    Map aMap10078;
    int anInt10079 = 0;
    Map aMap10080;
    Map aMap10081;
    Map aMap10082;
    static final int anInt10083 = 35633;
    String aString10084;
    
    public void method126() {
	if (anInt10070 != 0) {
	    aClass182_Sub1_Sub2_10066.method18117(anInt10070);
	    if (anInt10071 != 0)
		aClass182_Sub1_Sub2_10066.method18108((long) anInt10071);
	    if (anInt10079 != 0)
		aClass182_Sub1_Sub2_10066.method18108((long) anInt10079);
	    anInt10070 = 0;
	    anInt10071 = 0;
	    anInt10079 = 0;
	}
    }
    
    int method15705(int i, String string, String string_0_) {
	if (string == null)
	    return 0;
	int i_1_ = OpenGL.glCreateShader(i);
	OpenGL.glShaderSource(i_1_, string);
	OpenGL.glCompileShader(i_1_);
	OpenGL.glGetShaderiv(i_1_, 35713, anIntArray10075, 0);
	if (anIntArray10075[0] == 0) {
	    OpenGL.glDeleteShader(i_1_);
	    i_1_ = 0;
	}
	return i_1_;
    }
    
    int method15706(int i, String string, String string_2_) {
	if (string == null)
	    return 0;
	int i_3_ = OpenGL.glCreateShader(i);
	OpenGL.glShaderSource(i_3_, string);
	OpenGL.glCompileShader(i_3_);
	OpenGL.glGetShaderiv(i_3_, 35713, anIntArray10075, 0);
	if (anIntArray10075[0] == 0) {
	    OpenGL.glDeleteShader(i_3_);
	    i_3_ = 0;
	}
	return i_3_;
    }
    
    public boolean method5043() {
	if (aBool10069)
	    return true;
	aClass182_Sub1_Sub2_10066.aClass273_Sub2_11495 = null;
	anInt10071 = method15706(35633, aString10084, aString2852);
	anInt10079 = method15706(35632, aString10072, aString2851);
	if (anInt10071 == 0 || anInt10079 == 0) {
	    if (anInt10071 != 0)
		OpenGL.glDeleteShader(anInt10071);
	    if (anInt10079 != 0)
		OpenGL.glDeleteShader(anInt10079);
	    return false;
	}
	anInt10070 = OpenGL.glCreateProgram();
	if (anInt10071 != 0)
	    OpenGL.glAttachShader(anInt10070, anInt10071);
	if (anInt10079 != 0)
	    OpenGL.glAttachShader(anInt10070, anInt10079);
	OpenGL.glLinkProgram(anInt10070);
	OpenGL.glGetProgramiv(anInt10070, 35714, anIntArray10075, 0);
	if (anIntArray10075[0] == 0) {
	    if (anInt10071 != 0) {
		OpenGL.glDetachShader(anInt10070, anInt10071);
		OpenGL.glDeleteShader(anInt10071);
	    }
	    if (anInt10079 != 0) {
		OpenGL.glDetachShader(anInt10070, anInt10079);
		OpenGL.glDeleteShader(anInt10079);
	    }
	    OpenGL.glDeleteProgram(anInt10070);
	    return false;
	}
	OpenGL.glUseProgram(anInt10070);
	int i = -1;
	for (int i_4_ = 0; i_4_ < aClass266_Sub1_10073.method4810(65280);
	     i_4_++) {
	    if (aClass266_Sub1_10073.method4811(i_4_, -553253346) == this) {
		i = i_4_;
		break;
	    }
	}
	if (i == -1)
	    return false;
	for (int i_5_ = 0; i_5_ < aClass266_Sub1_10073.method4897(1720693502);
	     i_5_++) {
	    Class525_Sub5_Sub1 class525_sub5_sub1
		= aClass266_Sub1_10073.method4842(i_5_, -1680479870);
	    if (class525_sub5_sub1 != null)
		class525_sub5_sub1.method18224(i);
	}
	for (int i_6_ = 0; i_6_ < aClass266_Sub1_10073.method4870(353739239);
	     i_6_++) {
	    Class525_Sub5_Sub1 class525_sub5_sub1
		= aClass266_Sub1_10073.method4831(i_6_, (byte) 88);
	    if (class525_sub5_sub1 != null)
		class525_sub5_sub1.method18224(i);
	}
	aString10084 = null;
	aString10072 = null;
	aBool10069 = true;
	return true;
    }
    
    void method5031(Class525_Sub5_Sub1 class525_sub5_sub1, float f) {
	int i = ((Class525_Sub5_Sub1_Sub2) class525_sub5_sub1).method18825();
	if (i != -1) {
	    if (aMap10077.get(Integer.valueOf(i)) == null
		|| (((Float) aMap10077.get(Integer.valueOf(i))).floatValue()
		    != f)) {
		aMap10077.put(Integer.valueOf(i), Float.valueOf(f));
		if ((class525_sub5_sub1.method18241(-1872791434)
		     != Class284.aClass284_3054)
		    && (class525_sub5_sub1.method18241(-1207101090)
			!= Class284.aClass284_3032))
		    throw new IllegalArgumentException_Sub1(class525_sub5_sub1,
							    "");
		OpenGL.glUniform1f(i, f);
	    }
	}
    }
    
    void method5032(Class525_Sub5_Sub1 class525_sub5_sub1, float f,
		    float f_7_) {
	int i = ((Class525_Sub5_Sub1_Sub2) class525_sub5_sub1).method18825();
	if (i != -1) {
	    if (aMap10077.get(Integer.valueOf(i)) == null
		|| aMap10078.get(Integer.valueOf(i)) == null
		|| (((Float) aMap10077.get(Integer.valueOf(i))).floatValue()
		    != f)
		|| (((Float) aMap10078.get(Integer.valueOf(i))).floatValue()
		    != f_7_)) {
		aMap10077.put(Integer.valueOf(i), Float.valueOf(f));
		aMap10078.put(Integer.valueOf(i), Float.valueOf(f_7_));
		if (class525_sub5_sub1.method18241(-1337244879)
		    != Class284.aClass284_3037)
		    throw new IllegalArgumentException_Sub1(class525_sub5_sub1,
							    "");
		OpenGL.glUniform2f(i, f, f_7_);
	    }
	}
    }
    
    void method5033(Class525_Sub5_Sub1 class525_sub5_sub1, float f, float f_8_,
		    float f_9_) {
	int i = ((Class525_Sub5_Sub1_Sub2) class525_sub5_sub1).method18825();
	if (i != -1) {
	    if (aMap10077.get(Integer.valueOf(i)) == null
		|| aMap10078.get(Integer.valueOf(i)) == null
		|| aMap10082.get(Integer.valueOf(i)) == null
		|| (((Float) aMap10077.get(Integer.valueOf(i))).floatValue()
		    != f)
		|| (((Float) aMap10078.get(Integer.valueOf(i))).floatValue()
		    != f_8_)
		|| (((Float) aMap10082.get(Integer.valueOf(i))).floatValue()
		    != f_9_)) {
		aMap10077.put(Integer.valueOf(i), Float.valueOf(f));
		aMap10078.put(Integer.valueOf(i), Float.valueOf(f_8_));
		aMap10082.put(Integer.valueOf(i), Float.valueOf(f_9_));
		if (class525_sub5_sub1.method18241(206019860)
		    != Class284.aClass284_3038)
		    throw new IllegalArgumentException_Sub1(class525_sub5_sub1,
							    "");
		OpenGL.glUniform3f(i, f, f_8_, f_9_);
	    }
	}
    }
    
    void method15707() {
	method127();
    }
    
    void method5058(Class525_Sub5_Sub1 class525_sub5_sub1, float[] fs, int i) {
	int i_10_
	    = ((Class525_Sub5_Sub1_Sub2) class525_sub5_sub1).method18825();
	if (i_10_ != -1)
	    OpenGL.glUniform4fv(i_10_, i, fs, 0);
    }
    
    void method5053(Class525_Sub5_Sub1 class525_sub5_sub1, float[] fs, int i) {
	int i_11_
	    = ((Class525_Sub5_Sub1_Sub2) class525_sub5_sub1).method18825();
	if (i_11_ != -1)
	    OpenGL.glUniform4fv(i_11_, i, fs, 0);
    }
    
    Class273_Sub2(Class182_Sub1_Sub2 class182_sub1_sub2,
		  Class266_Sub1 class266_sub1, Class280 class280) {
	this(class182_sub1_sub2, class280);
	aClass266_Sub1_10073 = class266_sub1;
	aClass182_Sub1_Sub2_10066 = class182_sub1_sub2;
    }
    
    void method5029(Class525_Sub5_Sub1 class525_sub5_sub1, int i,
		    Interface39 interface39) {
	int i_12_
	    = ((Class525_Sub5_Sub1_Sub2) class525_sub5_sub1).method18825();
	if (i_12_ != -1) {
	    if (interface39 == null)
		interface39 = aClass182_Sub1_Sub2_10066.anInterface38_9168;
	    if (i < aClass182_Sub1_Sub2_10066.anInt9300) {
		aClass182_Sub1_Sub2_10066.method14730(i);
		aClass182_Sub1_Sub2_10066.method14731(interface39);
	    } else {
		OpenGL.glActiveTexture(33984 + i);
		OpenGL.glBindTexture(((Class490) interface39).anInt5276,
				     ((Class490) interface39).anInt5270);
	    }
	    if (aMap10081.get(Integer.valueOf(i_12_)) == null
		|| ((Integer) aMap10081.get(Integer.valueOf(i_12_)))
		       .intValue() != i) {
		aMap10081.put(Integer.valueOf(i_12_), Integer.valueOf(i));
		OpenGL.glUniform1i(i_12_, i);
	    }
	}
    }
    
    void method5056(Class525_Sub5_Sub1 class525_sub5_sub1, int i,
		    Interface39 interface39) {
	int i_13_
	    = ((Class525_Sub5_Sub1_Sub2) class525_sub5_sub1).method18825();
	if (i_13_ != -1) {
	    if (interface39 == null)
		interface39 = aClass182_Sub1_Sub2_10066.anInterface38_9168;
	    if (i < aClass182_Sub1_Sub2_10066.anInt9300) {
		aClass182_Sub1_Sub2_10066.method14730(i);
		aClass182_Sub1_Sub2_10066.method14731(interface39);
	    } else {
		OpenGL.glActiveTexture(33984 + i);
		OpenGL.glBindTexture(((Class490) interface39).anInt5276,
				     ((Class490) interface39).anInt5270);
	    }
	    if (aMap10081.get(Integer.valueOf(i_13_)) == null
		|| ((Integer) aMap10081.get(Integer.valueOf(i_13_)))
		       .intValue() != i) {
		aMap10081.put(Integer.valueOf(i_13_), Integer.valueOf(i));
		OpenGL.glUniform1i(i_13_, i);
	    }
	}
    }
    
    void method5040(int i, float f, float f_14_, float f_15_, float f_16_) {
	OpenGL.glUniform4f(i, f, f_14_, f_15_, f_16_);
    }
    
    void method5041(int i, float[] fs, int i_17_) {
	OpenGL.glUniform4fv(i, i_17_, fs, 0);
    }
    
    void method5039(int i, Class435 class435) {
	OpenGL.glUniform3fv(i, 3, class435.method6976(aFloatArray10076), 0);
    }
    
    void method5055(int i, Class435 class435) {
	OpenGL.glUniform2fv(i, 4, class435.method7032(aFloatArray10076), 0);
    }
    
    void method5044(int i, Class435 class435) {
	OpenGL.glUniform4fv(i, 4, class435.method6974(aFloatArray10076), 0);
    }
    
    void method5072(int i, int i_18_, Interface39 interface39) {
	aClass182_Sub1_Sub2_10066.method14730(i_18_);
	aClass182_Sub1_Sub2_10066.method14731(interface39);
	OpenGL.glUniform1i(i, i_18_);
    }
    
    void method5064(int i, Class435 class435) {
	OpenGL.glUniform2fv(i, 4, class435.method7032(aFloatArray10076), 0);
    }
    
    public void finalize() {
	method127();
    }
    
    void method5076(Class525_Sub5_Sub1 class525_sub5_sub1, Class435 class435) {
	if (!$assertionsDisabled && (class525_sub5_sub1.method18241(353944376)
				     != Class284.aClass284_3053))
	    throw new AssertionError();
	int i = ((Class525_Sub5_Sub1_Sub2) class525_sub5_sub1).method18825();
	if (i != -1)
	    OpenGL.glUniform2fv(i, 4, class435.method7032(aFloatArray10076),
				0);
    }
    
    void method15708() {
	method127();
    }
    
    public void method125() {
	if (anInt10070 != 0) {
	    aClass182_Sub1_Sub2_10066.method18117(anInt10070);
	    if (anInt10071 != 0)
		aClass182_Sub1_Sub2_10066.method18108((long) anInt10071);
	    if (anInt10079 != 0)
		aClass182_Sub1_Sub2_10066.method18108((long) anInt10079);
	    anInt10070 = 0;
	    anInt10071 = 0;
	    anInt10079 = 0;
	}
    }
    
    int method15709(int i, String string, String string_19_) {
	if (string == null)
	    return 0;
	int i_20_ = OpenGL.glCreateShader(i);
	OpenGL.glShaderSource(i_20_, string);
	OpenGL.glCompileShader(i_20_);
	OpenGL.glGetShaderiv(i_20_, 35713, anIntArray10075, 0);
	if (anIntArray10075[0] == 0) {
	    OpenGL.glDeleteShader(i_20_);
	    i_20_ = 0;
	}
	return i_20_;
    }
    
    void method5028(int i, float f, float f_21_, float f_22_) {
	OpenGL.glUniform3f(i, f, f_21_, f_22_);
    }
    
    public boolean method5046() {
	if (aBool10069)
	    return true;
	aClass182_Sub1_Sub2_10066.aClass273_Sub2_11495 = null;
	anInt10071 = method15706(35633, aString10084, aString2852);
	anInt10079 = method15706(35632, aString10072, aString2851);
	if (anInt10071 == 0 || anInt10079 == 0) {
	    if (anInt10071 != 0)
		OpenGL.glDeleteShader(anInt10071);
	    if (anInt10079 != 0)
		OpenGL.glDeleteShader(anInt10079);
	    return false;
	}
	anInt10070 = OpenGL.glCreateProgram();
	if (anInt10071 != 0)
	    OpenGL.glAttachShader(anInt10070, anInt10071);
	if (anInt10079 != 0)
	    OpenGL.glAttachShader(anInt10070, anInt10079);
	OpenGL.glLinkProgram(anInt10070);
	OpenGL.glGetProgramiv(anInt10070, 35714, anIntArray10075, 0);
	if (anIntArray10075[0] == 0) {
	    if (anInt10071 != 0) {
		OpenGL.glDetachShader(anInt10070, anInt10071);
		OpenGL.glDeleteShader(anInt10071);
	    }
	    if (anInt10079 != 0) {
		OpenGL.glDetachShader(anInt10070, anInt10079);
		OpenGL.glDeleteShader(anInt10079);
	    }
	    OpenGL.glDeleteProgram(anInt10070);
	    return false;
	}
	OpenGL.glUseProgram(anInt10070);
	int i = -1;
	for (int i_23_ = 0; i_23_ < aClass266_Sub1_10073.method4810(65280);
	     i_23_++) {
	    if (aClass266_Sub1_10073.method4811(i_23_, -627165293) == this) {
		i = i_23_;
		break;
	    }
	}
	if (i == -1)
	    return false;
	for (int i_24_ = 0;
	     i_24_ < aClass266_Sub1_10073.method4897(1876613256); i_24_++) {
	    Class525_Sub5_Sub1 class525_sub5_sub1
		= aClass266_Sub1_10073.method4842(i_24_, -1530582422);
	    if (class525_sub5_sub1 != null)
		class525_sub5_sub1.method18224(i);
	}
	for (int i_25_ = 0;
	     i_25_ < aClass266_Sub1_10073.method4870(-208025446); i_25_++) {
	    Class525_Sub5_Sub1 class525_sub5_sub1
		= aClass266_Sub1_10073.method4831(i_25_, (byte) 109);
	    if (class525_sub5_sub1 != null)
		class525_sub5_sub1.method18224(i);
	}
	aString10084 = null;
	aString10072 = null;
	aBool10069 = true;
	return true;
    }
    
    void method5062(int i, float[] fs, int i_26_) {
	OpenGL.glUniform4fv(i, i_26_, fs, 0);
    }
    
    int method15710(int i, String string, String string_27_) {
	if (string == null)
	    return 0;
	int i_28_ = OpenGL.glCreateShader(i);
	OpenGL.glShaderSource(i_28_, string);
	OpenGL.glCompileShader(i_28_);
	OpenGL.glGetShaderiv(i_28_, 35713, anIntArray10075, 0);
	if (anIntArray10075[0] == 0) {
	    OpenGL.glDeleteShader(i_28_);
	    i_28_ = 0;
	}
	return i_28_;
    }
    
    void method5075(Class525_Sub5_Sub1 class525_sub5_sub1, float f,
		    float f_29_, float f_30_) {
	int i = ((Class525_Sub5_Sub1_Sub2) class525_sub5_sub1).method18825();
	if (i != -1) {
	    if (aMap10077.get(Integer.valueOf(i)) == null
		|| aMap10078.get(Integer.valueOf(i)) == null
		|| aMap10082.get(Integer.valueOf(i)) == null
		|| (((Float) aMap10077.get(Integer.valueOf(i))).floatValue()
		    != f)
		|| (((Float) aMap10078.get(Integer.valueOf(i))).floatValue()
		    != f_29_)
		|| (((Float) aMap10082.get(Integer.valueOf(i))).floatValue()
		    != f_30_)) {
		aMap10077.put(Integer.valueOf(i), Float.valueOf(f));
		aMap10078.put(Integer.valueOf(i), Float.valueOf(f_29_));
		aMap10082.put(Integer.valueOf(i), Float.valueOf(f_30_));
		if (class525_sub5_sub1.method18241(-1508749040)
		    != Class284.aClass284_3038)
		    throw new IllegalArgumentException_Sub1(class525_sub5_sub1,
							    "");
		OpenGL.glUniform3f(i, f, f_29_, f_30_);
	    }
	}
    }
    
    void method5050(Class525_Sub5_Sub1 class525_sub5_sub1, float f,
		    float f_31_, float f_32_) {
	int i = ((Class525_Sub5_Sub1_Sub2) class525_sub5_sub1).method18825();
	if (i != -1) {
	    if (aMap10077.get(Integer.valueOf(i)) == null
		|| aMap10078.get(Integer.valueOf(i)) == null
		|| aMap10082.get(Integer.valueOf(i)) == null
		|| (((Float) aMap10077.get(Integer.valueOf(i))).floatValue()
		    != f)
		|| (((Float) aMap10078.get(Integer.valueOf(i))).floatValue()
		    != f_31_)
		|| (((Float) aMap10082.get(Integer.valueOf(i))).floatValue()
		    != f_32_)) {
		aMap10077.put(Integer.valueOf(i), Float.valueOf(f));
		aMap10078.put(Integer.valueOf(i), Float.valueOf(f_31_));
		aMap10082.put(Integer.valueOf(i), Float.valueOf(f_32_));
		if (class525_sub5_sub1.method18241(-1258900423)
		    != Class284.aClass284_3038)
		    throw new IllegalArgumentException_Sub1(class525_sub5_sub1,
							    "");
		OpenGL.glUniform3f(i, f, f_31_, f_32_);
	    }
	}
    }
    
    void method5057(Class525_Sub5_Sub1 class525_sub5_sub1, float f,
		    float f_33_, float f_34_, float f_35_) {
	int i = ((Class525_Sub5_Sub1_Sub2) class525_sub5_sub1).method18825();
	if (i != -1) {
	    if (aMap10077.get(Integer.valueOf(i)) == null
		|| aMap10078.get(Integer.valueOf(i)) == null
		|| aMap10082.get(Integer.valueOf(i)) == null
		|| aMap10080.get(Integer.valueOf(i)) == null
		|| (((Float) aMap10077.get(Integer.valueOf(i))).floatValue()
		    != f)
		|| (((Float) aMap10078.get(Integer.valueOf(i))).floatValue()
		    != f_33_)
		|| (((Float) aMap10082.get(Integer.valueOf(i))).floatValue()
		    != f_34_)
		|| (((Float) aMap10080.get(Integer.valueOf(i))).floatValue()
		    != f_35_)) {
		aMap10077.put(Integer.valueOf(i), Float.valueOf(f));
		aMap10078.put(Integer.valueOf(i), Float.valueOf(f_33_));
		aMap10082.put(Integer.valueOf(i), Float.valueOf(f_34_));
		aMap10080.put(Integer.valueOf(i), Float.valueOf(f_35_));
		if (class525_sub5_sub1.method18241(-1238574585)
		    != Class284.aClass284_3106)
		    throw new IllegalArgumentException_Sub1(class525_sub5_sub1,
							    "");
		OpenGL.glUniform4f(i, f, f_33_, f_34_, f_35_);
	    }
	}
    }
    
    void method5045(Class525_Sub5_Sub1 class525_sub5_sub1, float f,
		    float f_36_, float f_37_, float f_38_) {
	int i = ((Class525_Sub5_Sub1_Sub2) class525_sub5_sub1).method18825();
	if (i != -1) {
	    if (aMap10077.get(Integer.valueOf(i)) == null
		|| aMap10078.get(Integer.valueOf(i)) == null
		|| aMap10082.get(Integer.valueOf(i)) == null
		|| aMap10080.get(Integer.valueOf(i)) == null
		|| (((Float) aMap10077.get(Integer.valueOf(i))).floatValue()
		    != f)
		|| (((Float) aMap10078.get(Integer.valueOf(i))).floatValue()
		    != f_36_)
		|| (((Float) aMap10082.get(Integer.valueOf(i))).floatValue()
		    != f_37_)
		|| (((Float) aMap10080.get(Integer.valueOf(i))).floatValue()
		    != f_38_)) {
		aMap10077.put(Integer.valueOf(i), Float.valueOf(f));
		aMap10078.put(Integer.valueOf(i), Float.valueOf(f_36_));
		aMap10082.put(Integer.valueOf(i), Float.valueOf(f_37_));
		aMap10080.put(Integer.valueOf(i), Float.valueOf(f_38_));
		if (class525_sub5_sub1.method18241(-715680882)
		    != Class284.aClass284_3106)
		    throw new IllegalArgumentException_Sub1(class525_sub5_sub1,
							    "");
		OpenGL.glUniform4f(i, f, f_36_, f_37_, f_38_);
	    }
	}
    }
    
    void method5052(Class525_Sub5_Sub1 class525_sub5_sub1, float[] fs, int i) {
	int i_39_
	    = ((Class525_Sub5_Sub1_Sub2) class525_sub5_sub1).method18825();
	if (i_39_ != -1)
	    OpenGL.glUniform4fv(i_39_, i, fs, 0);
    }
    
    public void method127() {
	if (anInt10070 != 0) {
	    aClass182_Sub1_Sub2_10066.method18117(anInt10070);
	    if (anInt10071 != 0)
		aClass182_Sub1_Sub2_10066.method18108((long) anInt10071);
	    if (anInt10079 != 0)
		aClass182_Sub1_Sub2_10066.method18108((long) anInt10079);
	    anInt10070 = 0;
	    anInt10071 = 0;
	    anInt10079 = 0;
	}
    }
    
    void method5070(int i, Class435 class435) {
	OpenGL.glUniform4fv(i, 4, class435.method6974(aFloatArray10076), 0);
    }
    
    void method5035(Class525_Sub5_Sub1 class525_sub5_sub1, Class435 class435) {
	if (!$assertionsDisabled && (class525_sub5_sub1.method18241(-639513749)
				     != Class284.aClass284_3053))
	    throw new AssertionError();
	int i = ((Class525_Sub5_Sub1_Sub2) class525_sub5_sub1).method18825();
	if (i != -1)
	    OpenGL.glUniform2fv(i, 4, class435.method7032(aFloatArray10076),
				0);
    }
    
    Class273_Sub2(Class182_Sub1_Sub2 class182_sub1_sub2, Class280 class280) {
	aBool10069 = false;
	anIntArray10074 = new int[13];
	aMap10077 = new HashMap();
	aMap10078 = new HashMap();
	aMap10082 = new HashMap();
	aMap10080 = new HashMap();
	aMap10081 = new HashMap();
	aString2853 = class280.aString2997;
	StringBuilder stringbuilder = new StringBuilder();
	if (class280.aString2996 != null) {
	    aString2852 = class280.aString2996;
	    if (class280.aClass271Array2999 != null) {
		Class271[] class271s = class280.aClass271Array2999;
		for (int i = 0; i < class271s.length; i++) {
		    Class271 class271 = class271s[i];
		    stringbuilder.append(new StringBuilder().append
					     ("#define ").append
					     (class271.aString2844).append
					     (" ").append
					     (class271.aString2845).append
					     ('\n').toString());
		}
	    }
	    stringbuilder.append(new String(class182_sub1_sub2
						.method18123(aString2852)));
	    aString10084 = stringbuilder.toString();
	}
	if (class280.aString2998 != null) {
	    aString2851 = class280.aString2998;
	    stringbuilder.setLength(0);
	    if (class280.aClass271Array3000 != null) {
		Class271[] class271s = class280.aClass271Array3000;
		for (int i = 0; i < class271s.length; i++) {
		    Class271 class271 = class271s[i];
		    stringbuilder.append(new StringBuilder().append
					     ("#define ").append
					     (class271.aString2844).append
					     (" ").append
					     (class271.aString2845).append
					     ('\n').toString());
		}
	    }
	    stringbuilder.append(new String(class182_sub1_sub2
						.method18123(aString2851)));
	    aString10072 = stringbuilder.toString();
	}
	Class692.method14123(anIntArray10074, 0, anIntArray10074.length, -1);
    }
    
    void method5037(int i, float f, float f_40_, float f_41_) {
	OpenGL.glUniform3f(i, f, f_40_, f_41_);
    }
    
    void method5042(int i, float f, float f_42_, float f_43_, float f_44_) {
	OpenGL.glUniform4f(i, f, f_42_, f_43_, f_44_);
    }
    
    void method5063(Class525_Sub5_Sub1 class525_sub5_sub1, Class435 class435) {
	if (!$assertionsDisabled && (class525_sub5_sub1.method18241(-250753007)
				     != Class284.aClass284_3055))
	    throw new AssertionError();
	int i = ((Class525_Sub5_Sub1_Sub2) class525_sub5_sub1).method18825();
	if (i != -1)
	    OpenGL.glUniform4fv(i, 4, class435.method6974(aFloatArray10076),
				0);
    }
    
    void method5060(int i, float f, float f_45_, float f_46_, float f_47_) {
	OpenGL.glUniform4f(i, f, f_45_, f_46_, f_47_);
    }
    
    void method5061(int i, float f, float f_48_, float f_49_, float f_50_) {
	OpenGL.glUniform4f(i, f, f_48_, f_49_, f_50_);
    }
    
    void method5036(Class525_Sub5_Sub1 class525_sub5_sub1, Class435 class435) {
	if (!$assertionsDisabled
	    && (class525_sub5_sub1.method18241(-1660697062)
		!= Class284.aClass284_3053))
	    throw new AssertionError();
	int i = ((Class525_Sub5_Sub1_Sub2) class525_sub5_sub1).method18825();
	if (i != -1)
	    OpenGL.glUniform2fv(i, 4, class435.method7032(aFloatArray10076),
				0);
    }
    
    void method5038(int i, Class435 class435) {
	OpenGL.glUniform3fv(i, 3, class435.method6976(aFloatArray10076), 0);
    }
    
    void method5034(Class525_Sub5_Sub1 class525_sub5_sub1, float f,
		    float f_51_, float f_52_, float f_53_) {
	int i = ((Class525_Sub5_Sub1_Sub2) class525_sub5_sub1).method18825();
	if (i != -1) {
	    if (aMap10077.get(Integer.valueOf(i)) == null
		|| aMap10078.get(Integer.valueOf(i)) == null
		|| aMap10082.get(Integer.valueOf(i)) == null
		|| aMap10080.get(Integer.valueOf(i)) == null
		|| (((Float) aMap10077.get(Integer.valueOf(i))).floatValue()
		    != f)
		|| (((Float) aMap10078.get(Integer.valueOf(i))).floatValue()
		    != f_51_)
		|| (((Float) aMap10082.get(Integer.valueOf(i))).floatValue()
		    != f_52_)
		|| (((Float) aMap10080.get(Integer.valueOf(i))).floatValue()
		    != f_53_)) {
		aMap10077.put(Integer.valueOf(i), Float.valueOf(f));
		aMap10078.put(Integer.valueOf(i), Float.valueOf(f_51_));
		aMap10082.put(Integer.valueOf(i), Float.valueOf(f_52_));
		aMap10080.put(Integer.valueOf(i), Float.valueOf(f_53_));
		if (class525_sub5_sub1.method18241(401742997)
		    != Class284.aClass284_3106)
		    throw new IllegalArgumentException_Sub1(class525_sub5_sub1,
							    "");
		OpenGL.glUniform4f(i, f, f_51_, f_52_, f_53_);
	    }
	}
    }
    
    void method5065(int i, Class435 class435) {
	OpenGL.glUniform2fv(i, 4, class435.method7032(aFloatArray10076), 0);
    }
    
    void method5066(int i, Class435 class435) {
	OpenGL.glUniform2fv(i, 4, class435.method7032(aFloatArray10076), 0);
    }
    
    void method15711() {
	method127();
    }
    
    void method5068(int i, Class435 class435) {
	OpenGL.glUniform4fv(i, 4, class435.method6974(aFloatArray10076), 0);
    }
    
    void method5069(int i, Class435 class435) {
	OpenGL.glUniform4fv(i, 4, class435.method6974(aFloatArray10076), 0);
    }
    
    public boolean method5047() {
	if (aBool10069)
	    return true;
	aClass182_Sub1_Sub2_10066.aClass273_Sub2_11495 = null;
	anInt10071 = method15706(35633, aString10084, aString2852);
	anInt10079 = method15706(35632, aString10072, aString2851);
	if (anInt10071 == 0 || anInt10079 == 0) {
	    if (anInt10071 != 0)
		OpenGL.glDeleteShader(anInt10071);
	    if (anInt10079 != 0)
		OpenGL.glDeleteShader(anInt10079);
	    return false;
	}
	anInt10070 = OpenGL.glCreateProgram();
	if (anInt10071 != 0)
	    OpenGL.glAttachShader(anInt10070, anInt10071);
	if (anInt10079 != 0)
	    OpenGL.glAttachShader(anInt10070, anInt10079);
	OpenGL.glLinkProgram(anInt10070);
	OpenGL.glGetProgramiv(anInt10070, 35714, anIntArray10075, 0);
	if (anIntArray10075[0] == 0) {
	    if (anInt10071 != 0) {
		OpenGL.glDetachShader(anInt10070, anInt10071);
		OpenGL.glDeleteShader(anInt10071);
	    }
	    if (anInt10079 != 0) {
		OpenGL.glDetachShader(anInt10070, anInt10079);
		OpenGL.glDeleteShader(anInt10079);
	    }
	    OpenGL.glDeleteProgram(anInt10070);
	    return false;
	}
	OpenGL.glUseProgram(anInt10070);
	int i = -1;
	for (int i_54_ = 0; i_54_ < aClass266_Sub1_10073.method4810(65280);
	     i_54_++) {
	    if (aClass266_Sub1_10073.method4811(i_54_, -1784347167) == this) {
		i = i_54_;
		break;
	    }
	}
	if (i == -1)
	    return false;
	for (int i_55_ = 0; i_55_ < aClass266_Sub1_10073.method4897(460166980);
	     i_55_++) {
	    Class525_Sub5_Sub1 class525_sub5_sub1
		= aClass266_Sub1_10073.method4842(i_55_, -1163841593);
	    if (class525_sub5_sub1 != null)
		class525_sub5_sub1.method18224(i);
	}
	for (int i_56_ = 0;
	     i_56_ < aClass266_Sub1_10073.method4870(-1051710365); i_56_++) {
	    Class525_Sub5_Sub1 class525_sub5_sub1
		= aClass266_Sub1_10073.method4831(i_56_, (byte) 14);
	    if (class525_sub5_sub1 != null)
		class525_sub5_sub1.method18224(i);
	}
	aString10084 = null;
	aString10072 = null;
	aBool10069 = true;
	return true;
    }
    
    void method5071(int i, Class435 class435) {
	OpenGL.glUniform4fv(i, 4, class435.method6974(aFloatArray10076), 0);
    }
    
    void method5067(int i, Class435 class435) {
	OpenGL.glUniform4fv(i, 4, class435.method6974(aFloatArray10076), 0);
    }
    
    void method15712() {
	method127();
    }
    
    void method5074(int i, int i_57_, Interface39 interface39) {
	aClass182_Sub1_Sub2_10066.method14730(i_57_);
	aClass182_Sub1_Sub2_10066.method14731(interface39);
	OpenGL.glUniform1i(i, i_57_);
    }
    
    void method5073(int i, int i_58_, Interface39 interface39) {
	aClass182_Sub1_Sub2_10066.method14730(i_58_);
	aClass182_Sub1_Sub2_10066.method14731(interface39);
	OpenGL.glUniform1i(i, i_58_);
    }
    
    void method5048(Class525_Sub5_Sub1 class525_sub5_sub1, float f) {
	int i = ((Class525_Sub5_Sub1_Sub2) class525_sub5_sub1).method18825();
	if (i != -1) {
	    if (aMap10077.get(Integer.valueOf(i)) == null
		|| (((Float) aMap10077.get(Integer.valueOf(i))).floatValue()
		    != f)) {
		aMap10077.put(Integer.valueOf(i), Float.valueOf(f));
		if ((class525_sub5_sub1.method18241(-99917034)
		     != Class284.aClass284_3054)
		    && (class525_sub5_sub1.method18241(-340723048)
			!= Class284.aClass284_3032))
		    throw new IllegalArgumentException_Sub1(class525_sub5_sub1,
							    "");
		OpenGL.glUniform1f(i, f);
	    }
	}
    }
    
    void method5077(Class525_Sub5_Sub1 class525_sub5_sub1, float f) {
	int i = ((Class525_Sub5_Sub1_Sub2) class525_sub5_sub1).method18825();
	if (i != -1) {
	    if (aMap10077.get(Integer.valueOf(i)) == null
		|| (((Float) aMap10077.get(Integer.valueOf(i))).floatValue()
		    != f)) {
		aMap10077.put(Integer.valueOf(i), Float.valueOf(f));
		if ((class525_sub5_sub1.method18241(-921953500)
		     != Class284.aClass284_3054)
		    && (class525_sub5_sub1.method18241(-336271103)
			!= Class284.aClass284_3032))
		    throw new IllegalArgumentException_Sub1(class525_sub5_sub1,
							    "");
		OpenGL.glUniform1f(i, f);
	    }
	}
    }
    
    void method5078(Class525_Sub5_Sub1 class525_sub5_sub1, float f,
		    float f_59_) {
	int i = ((Class525_Sub5_Sub1_Sub2) class525_sub5_sub1).method18825();
	if (i != -1) {
	    if (aMap10077.get(Integer.valueOf(i)) == null
		|| aMap10078.get(Integer.valueOf(i)) == null
		|| (((Float) aMap10077.get(Integer.valueOf(i))).floatValue()
		    != f)
		|| (((Float) aMap10078.get(Integer.valueOf(i))).floatValue()
		    != f_59_)) {
		aMap10077.put(Integer.valueOf(i), Float.valueOf(f));
		aMap10078.put(Integer.valueOf(i), Float.valueOf(f_59_));
		if (class525_sub5_sub1.method18241(-88097769)
		    != Class284.aClass284_3037)
		    throw new IllegalArgumentException_Sub1(class525_sub5_sub1,
							    "");
		OpenGL.glUniform2f(i, f, f_59_);
	    }
	}
    }
    
    void method5079(Class525_Sub5_Sub1 class525_sub5_sub1, float f,
		    float f_60_) {
	int i = ((Class525_Sub5_Sub1_Sub2) class525_sub5_sub1).method18825();
	if (i != -1) {
	    if (aMap10077.get(Integer.valueOf(i)) == null
		|| aMap10078.get(Integer.valueOf(i)) == null
		|| (((Float) aMap10077.get(Integer.valueOf(i))).floatValue()
		    != f)
		|| (((Float) aMap10078.get(Integer.valueOf(i))).floatValue()
		    != f_60_)) {
		aMap10077.put(Integer.valueOf(i), Float.valueOf(f));
		aMap10078.put(Integer.valueOf(i), Float.valueOf(f_60_));
		if (class525_sub5_sub1.method18241(-679635576)
		    != Class284.aClass284_3037)
		    throw new IllegalArgumentException_Sub1(class525_sub5_sub1,
							    "");
		OpenGL.glUniform2f(i, f, f_60_);
	    }
	}
    }
    
    void method5080(Class525_Sub5_Sub1 class525_sub5_sub1, float f,
		    float f_61_) {
	int i = ((Class525_Sub5_Sub1_Sub2) class525_sub5_sub1).method18825();
	if (i != -1) {
	    if (aMap10077.get(Integer.valueOf(i)) == null
		|| aMap10078.get(Integer.valueOf(i)) == null
		|| (((Float) aMap10077.get(Integer.valueOf(i))).floatValue()
		    != f)
		|| (((Float) aMap10078.get(Integer.valueOf(i))).floatValue()
		    != f_61_)) {
		aMap10077.put(Integer.valueOf(i), Float.valueOf(f));
		aMap10078.put(Integer.valueOf(i), Float.valueOf(f_61_));
		if (class525_sub5_sub1.method18241(-1657925622)
		    != Class284.aClass284_3037)
		    throw new IllegalArgumentException_Sub1(class525_sub5_sub1,
							    "");
		OpenGL.glUniform2f(i, f, f_61_);
	    }
	}
    }
    
    void method5049(Class525_Sub5_Sub1 class525_sub5_sub1, Class435 class435) {
	if (!$assertionsDisabled
	    && (class525_sub5_sub1.method18241(-1311551882)
		!= Class284.aClass284_3055))
	    throw new AssertionError();
	int i = ((Class525_Sub5_Sub1_Sub2) class525_sub5_sub1).method18825();
	if (i != -1)
	    OpenGL.glUniform4fv(i, 4, class435.method6974(aFloatArray10076),
				0);
    }
    
    void method5082(Class525_Sub5_Sub1 class525_sub5_sub1, Class435 class435) {
	if (!$assertionsDisabled && (class525_sub5_sub1.method18241(535536796)
				     != Class284.aClass284_3055))
	    throw new AssertionError();
	int i = ((Class525_Sub5_Sub1_Sub2) class525_sub5_sub1).method18825();
	if (i != -1)
	    OpenGL.glUniform4fv(i, 4, class435.method6974(aFloatArray10076),
				0);
    }
    
    void method5083(Class525_Sub5_Sub1 class525_sub5_sub1, Class435 class435) {
	if (!$assertionsDisabled && (class525_sub5_sub1.method18241(-758218406)
				     != Class284.aClass284_3055))
	    throw new AssertionError();
	int i = ((Class525_Sub5_Sub1_Sub2) class525_sub5_sub1).method18825();
	if (i != -1)
	    OpenGL.glUniform4fv(i, 4, class435.method6974(aFloatArray10076),
				0);
    }
    
    void method5051(Class525_Sub5_Sub1 class525_sub5_sub1, float f) {
	int i = ((Class525_Sub5_Sub1_Sub2) class525_sub5_sub1).method18825();
	if (i != -1) {
	    if (aMap10077.get(Integer.valueOf(i)) == null
		|| (((Float) aMap10077.get(Integer.valueOf(i))).floatValue()
		    != f)) {
		aMap10077.put(Integer.valueOf(i), Float.valueOf(f));
		if ((class525_sub5_sub1.method18241(-1619429019)
		     != Class284.aClass284_3054)
		    && (class525_sub5_sub1.method18241(-1076845365)
			!= Class284.aClass284_3032))
		    throw new IllegalArgumentException_Sub1(class525_sub5_sub1,
							    "");
		OpenGL.glUniform1f(i, f);
	    }
	}
    }
    
    void method5059(int i, float f, float f_62_, float f_63_, float f_64_) {
	OpenGL.glUniform4f(i, f, f_62_, f_63_, f_64_);
    }
    
    void method5054(int i, Class435 class435) {
	OpenGL.glUniform4fv(i, 4, class435.method6974(aFloatArray10076), 0);
    }
}
