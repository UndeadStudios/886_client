/* Class245 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class245
{
    public Class259[] aClass259Array2426;
    Class259[] aClass259Array2427;
    public boolean aBool2428;
    
    public Class259[] method4471() {
	return (aClass259Array2427 == null ? aClass259Array2426
		: aClass259Array2427);
    }
    
    Class245(boolean bool, Class259[] class259s) {
	aClass259Array2426 = class259s;
	aBool2428 = bool;
    }
    
    public Class259[] method4472(byte i) {
	if (aClass259Array2427 == null) {
	    int i_0_ = aClass259Array2426.length;
	    aClass259Array2427 = new Class259[i_0_];
	    System.arraycopy(aClass259Array2426, 0, aClass259Array2427, 0,
			     aClass259Array2426.length);
	}
	return aClass259Array2427;
    }
    
    public Class259 method4473(int i, int i_1_) {
	if (aClass259Array2426[0].anInt2588 * 1984678839 >>> 16 != i >>> 16)
	    throw new IllegalArgumentException();
	return aClass259Array2426[i & 0xffff];
    }
    
    public Class259[] method4474() {
	return (aClass259Array2427 == null ? aClass259Array2426
		: aClass259Array2427);
    }
    
    public Class259[] method4475() {
	if (aClass259Array2427 == null) {
	    int i = aClass259Array2426.length;
	    aClass259Array2427 = new Class259[i];
	    System.arraycopy(aClass259Array2426, 0, aClass259Array2427, 0,
			     aClass259Array2426.length);
	}
	return aClass259Array2427;
    }
    
    public Class259[] method4476() {
	return (aClass259Array2427 == null ? aClass259Array2426
		: aClass259Array2427);
    }
    
    public Class259[] method4477() {
	if (aClass259Array2427 == null) {
	    int i = aClass259Array2426.length;
	    aClass259Array2427 = new Class259[i];
	    System.arraycopy(aClass259Array2426, 0, aClass259Array2427, 0,
			     aClass259Array2426.length);
	}
	return aClass259Array2427;
    }
    
    public Class259[] method4478(byte i) {
	return (aClass259Array2427 == null ? aClass259Array2426
		: aClass259Array2427);
    }
    
    static void method4479(String string, String string_2_, String string_3_,
			   boolean bool, boolean bool_4_, int i) {
	Class96 class96 = Class111.method1979(-529668695);
	if (class96.method1799((byte) 0) != null) {
	    Class525_Sub15 class525_sub15
		= Class16.method767(Class412.aClass412_4287,
				    class96.aClass6_1169, 1977859884);
	    class525_sub15.aClass525_Sub38_Sub2_10546.method16602
		((Class161.method2628(string, 1324163349)
		  + Class161.method2628(string_2_, -1279181221)
		  + Class161.method2628(string_3_, -1893335102) + 1),
		 988899836);
	    class525_sub15.aClass525_Sub38_Sub2_10546.method16700(string,
								  296538945);
	    class525_sub15.aClass525_Sub38_Sub2_10546.method16700(string_2_,
								  382721623);
	    class525_sub15.aClass525_Sub38_Sub2_10546.method16700(string_3_,
								  2038096531);
	    int i_5_ = 0;
	    if (bool)
		i_5_ |= 0x1;
	    if (bool_4_)
		i_5_ |= 0x2;
	    class525_sub15.aClass525_Sub38_Sub2_10546.method16735(i_5_,
								  -2054723162);
	    class96.method1794(class525_sub15, (short) 14443);
	}
    }
    
    static final void method4480(Class259 class259, Class245 class245,
				 Class683 class683, byte i) {
	String string
	    = (String) (class683.anObjectArray8636
			[(class683.anInt8644 -= 1285561025) * 1373599041]);
	if (Class558.method9375(string, class683, (byte) 3) != null)
	    string = string.substring(0, string.length() - 1);
	class259.anObjectArray2734
	    = Class656_Sub1_Sub5_Sub1.method18727(string, class683,
						  -1964268163);
	class259.aBool2695 = true;
    }
    
    static final void method4481(Class683 class683, byte i) {
	int i_6_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_6_, -695254952);
	Class280.method5159(class259, class683, (byte) 1);
    }
    
    static final void method4482(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class613.anInt8032 * 1844941479;
    }
    
    public static void method4483(int i, int i_7_, byte i_8_) {
	Class144_Sub1.anInt9141 = -1716705553 * (i - Class556_Sub1.anInt7483);
	Class696_Sub13.anInt10912
	    = -2002372447 * (i_7_ - Class556_Sub1.anInt7484);
	Class556_Sub1.anInt10626 = -106402817;
	Class556_Sub1.anInt10627 = 107721765;
	Class58.method1221(-381366526);
    }
    
    static final void method4484(Class683 class683, byte i) {
	class683.anInt8662 -= -1189665054;
    }
}
