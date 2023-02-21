/* Class270 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class270
{
    static final int anInt2841 = 100;
    Class525_Sub16_Sub8[] aClass525_Sub16_Sub8Array2842
	= new Class525_Sub16_Sub8[100];
    int anInt2843;
    
    Class525_Sub16_Sub8 method5002
	(int i, int i_0_, String string, String string_1_, String string_2_,
	 String string_3_, String string_4_, int i_5_, Class411 class411) {
	Class525_Sub16_Sub8 class525_sub16_sub8
	    = aClass525_Sub16_Sub8Array2842[99];
	for (int i_6_ = -889919163 * anInt2843; i_6_ > 0; i_6_--) {
	    if (i_6_ != 100)
		aClass525_Sub16_Sub8Array2842[i_6_]
		    = aClass525_Sub16_Sub8Array2842[i_6_ - 1];
	}
	if (null == class525_sub16_sub8)
	    class525_sub16_sub8
		= new Class525_Sub16_Sub8(i, i_0_, string, string_1_,
					  string_2_, string_4_, i_5_,
					  string_3_, class411);
	else {
	    class525_sub16_sub8.method8755(-1933461091);
	    class525_sub16_sub8.method16266(-1925745724);
	    class525_sub16_sub8.method18298(i, i_0_, string, string_1_,
					    string_2_, string_4_, i_5_,
					    string_3_, class411, -64554265);
	}
	aClass525_Sub16_Sub8Array2842[0] = class525_sub16_sub8;
	if (anInt2843 * -889919163 < 100)
	    anInt2843 += 2012037517;
	return class525_sub16_sub8;
    }
    
    Class525_Sub16_Sub8 method5003(int i) {
	if (i < 0 || i >= anInt2843 * -889919163)
	    return null;
	return aClass525_Sub16_Sub8Array2842[i];
    }
    
    Class525_Sub16_Sub8 method5004(int i, int i_7_) {
	if (i < 0 || i >= anInt2843 * -889919163)
	    return null;
	return aClass525_Sub16_Sub8Array2842[i];
    }
    
    int method5005(int i) {
	return anInt2843 * -889919163;
    }
    
    Class525_Sub16_Sub8 method5006(int i, int i_8_, String string,
				   String string_9_, String string_10_,
				   String string_11_, String string_12_,
				   int i_13_, Class411 class411, int i_14_) {
	Class525_Sub16_Sub8 class525_sub16_sub8
	    = aClass525_Sub16_Sub8Array2842[99];
	for (int i_15_ = -889919163 * anInt2843; i_15_ > 0; i_15_--) {
	    if (i_15_ != 100)
		aClass525_Sub16_Sub8Array2842[i_15_]
		    = aClass525_Sub16_Sub8Array2842[i_15_ - 1];
	}
	if (null == class525_sub16_sub8)
	    class525_sub16_sub8
		= new Class525_Sub16_Sub8(i, i_8_, string, string_9_,
					  string_10_, string_12_, i_13_,
					  string_11_, class411);
	else {
	    class525_sub16_sub8.method8755(-1933461091);
	    class525_sub16_sub8.method16266(-1925745724);
	    class525_sub16_sub8.method18298(i, i_8_, string, string_9_,
					    string_10_, string_12_, i_13_,
					    string_11_, class411, -772941344);
	}
	aClass525_Sub16_Sub8Array2842[0] = class525_sub16_sub8;
	if (anInt2843 * -889919163 < 100)
	    anInt2843 += 2012037517;
	return class525_sub16_sub8;
    }
    
    Class270() {
	/* empty */
    }
    
    Class525_Sub16_Sub8 method5007(int i) {
	if (i < 0 || i >= anInt2843 * -889919163)
	    return null;
	return aClass525_Sub16_Sub8Array2842[i];
    }
    
    static final void method5008(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class227.method4261(class259, class245, class683, -708216893);
    }
}
