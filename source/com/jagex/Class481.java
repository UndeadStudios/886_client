/* Class481 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class481
{
    Class494 this$0;
    boolean aBool5219;
    int anInt5220;
    int anInt5221;
    RSBuffer aClass525_Sub38_5222;
    
    Class481(Class494 class494, RSBuffer class525_sub38, boolean bool) {
	this$0 = class494;
	aClass525_Sub38_5222 = class525_sub38;
	aBool5219 = bool;
	anInt5220 = -1695524045;
	anInt5221 = 1096621995;
    }
    
    void method7825() {
	if (null != aClass525_Sub38_5222 && !aBool5219)
	    aClass525_Sub38_5222.method16627(170264378);
	anInt5220 = -1695524045;
	anInt5221 = 1096621995;
    }
    
    void method7826() {
	if (null != aClass525_Sub38_5222 && !aBool5219)
	    aClass525_Sub38_5222.method16627(-1189698896);
	anInt5220 = -1695524045;
	anInt5221 = 1096621995;
    }
    
    void method7827(int i) {
	if (null != aClass525_Sub38_5222 && !aBool5219)
	    aClass525_Sub38_5222.method16627(-1198967715);
	anInt5220 = -1695524045;
	anInt5221 = 1096621995;
    }
    
    static final void method7828(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class580.method9615(class259, class245, class683, 724956467);
    }
    
    public static String[] method7829(String string, char c, int i) {
	int i_0_ = Class275.method5101(string, c, 168912168);
	String[] strings = new String[i_0_ + 1];
	int i_1_ = 0;
	int i_2_ = 0;
	for (int i_3_ = 0; i_3_ < i_0_; i_3_++) {
	    int i_4_;
	    for (i_4_ = i_2_; string.charAt(i_4_) != c; i_4_++) {
		/* empty */
	    }
	    strings[i_1_++] = string.substring(i_2_, i_4_);
	    i_2_ = i_4_ + 1;
	}
	strings[i_0_] = string.substring(i_2_);
	return strings;
    }
    
    static Class610[] method7830(byte i) {
	return (new Class610[]
		{ Class610.aClass610_8012, Class610.aClass610_8011,
		  Class610.aClass610_8009 });
    }
    
    static final void method7831(Class683 class683, byte i) {
	int i_5_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_5_, -695254952);
	class683.anObjectArray8636
	    [(class683.anInt8644 += 1285561025) * 1373599041 - 1]
	    = class259.aString2667;
    }
    
    static final void method7832(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = class683.aClass353_8652.aByte3764;
    }
}
