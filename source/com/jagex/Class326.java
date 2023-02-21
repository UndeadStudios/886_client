/* Class326 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class326
{
    String aString3558;
    String aString3559;
    String aString3560;
    static String aString3561;
    public static int anInt3562;
    static Class458 aClass458_3563;
    
    Class326(String string, String string_0_, String string_1_) {
	aString3558 = string;
	aString3559 = string_0_;
	aString3560 = string_1_;
    }
    
    public static void method5741(int i, String string, int i_2_, int i_3_) {
	Class525_Sub16_Sub4 class525_sub16_sub4
	    = Class71_Sub1.method16376(Class578.aClass578_7660, i, -1,
				       (byte) 40);
	if (class525_sub16_sub4 != null) {
	    Class683 class683 = Class457.method7468(-485786200);
	    class683.anIntArray8649
		= new int[class525_sub16_sub4.anInt11747 * -1831313555];
	    class683.anObjectArray8637
		= new String[678090421 * class525_sub16_sub4.anInt11752];
	    class683.anObjectArray8637[0] = string;
	    class683.anIntArray8649[0] = i_2_;
	    Class60.method1231(class525_sub16_sub4, 500000, class683,
			       -706291870);
	}
    }
    
    static final void method5742(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class521.method8695(class259, class245, class683, (byte) -68);
    }
    
    static final void method5743(Class683 class683, int i) {
	String string
	    = (String) (class683.anObjectArray8636
			[(class683.anInt8644 -= 1285561025) * 1373599041]);
	class683.anObjectArray8636
	    [(class683.anInt8644 += 1285561025) * 1373599041 - 1]
	    = Class274.method5092(string, -408146074);
    }
    
    static final void method5744(Class683 class683, int i) {
	class683.anInt8662 -= 362986067;
	int i_4_ = class683.anIntArray8661[class683.anInt8662 * 501271953];
	int i_5_ = class683.anIntArray8661[class683.anInt8662 * 501271953 + 1];
	int i_6_ = class683.anIntArray8661[2 + 501271953 * class683.anInt8662];
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = client.aClass229_11119.method4356(i_4_, 2033842054)
		  .method4001(i_5_, i_6_, -1248968673) == null ? 0 : 1;
    }
    
    static void method5745(Class683 class683, int i) {
	int i_7_
	    = Class215.method4018(class683.anIntArray8661[((class683.anInt8662
							    -= 1552651121)
							   * 501271953)],
				  (byte) -4);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = i_7_;
    }
    
    static final void method5746(Class683 class683, byte i) {
	int i_8_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_8_, -695254952);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = class259.anInt2621 * 1940882535;
    }
    
    static final void method5747(Class683 class683, byte i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = client.anInt11083;
    }
}
