/* Class171 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class BillBoardConfig
{
    public int anInt1855;
    public int anInt1856;
    int anInt1857;
    public int anInt1858;
    
    BillBoardConfig method2732(int i, int i_0_) {
	return new BillBoardConfig(-145881707 * anInt1855, i, -821245807 * anInt1857,
			    -998013967 * anInt1858);
    }
    
    BillBoardConfig method2733(int i) {
	return new BillBoardConfig(-145881707 * anInt1855, i, -821245807 * anInt1857,
			    -998013967 * anInt1858);
    }
    
    BillBoardConfig method2734(int i) {
	return new BillBoardConfig(-145881707 * anInt1855, i, -821245807 * anInt1857,
			    -998013967 * anInt1858);
    }
    
    BillBoardConfig(int i, int i_1_, int i_2_, int i_3_) {
	anInt1855 = i * 146021821;
	anInt1856 = 783931505 * i_1_;
	anInt1857 = i_2_ * -1214252943;
	anInt1858 = i_3_ * -73331439;
    }
    
    static void method2735(RSBuffer class525_sub38, byte i) {
	for (;;) {
	    int i_4_ = class525_sub38.readUnsignedByte(17709718);
	    switch (i_4_) {
	    case 255:
		return;
	    case 0:
		Class201.anInt2208
		    = class525_sub38.readUnsignedShort((byte) 57) * -1498413573;
		Class201.anInt2200
		    = class525_sub38.readUnsignedShort((byte) 46) * 1670745699;
	    }
	}
    }
    
    static final void method2736(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class598.method9850(class259, class245, class683, (byte) -24);
    }
    
    static final void method2737(Class683 class683, int i) {
	int i_5_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_5_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_5_ >> 16];
	Class224.method4246(class259, class245, class683, 2132299654);
    }
    
    static final void method2738(Class683 class683, int i) {
	int i_6_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = class683.aClass353_8652.aBoolArray3781[i_6_] ? 1 : 0;
    }
    
    static final void method2739(Class683 class683, byte i) {
	int i_7_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	ItemDefinitions class8
	    = ((ItemDefinitions)
	       Class313_Sub2.aClass40_Sub22_10106.method76(i_7_, 1660705702));
	if (class8.anInt114 * 195314511 >= 0
	    && class8.anInt113 * 593405105 >= 0)
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= class8.anInt113 * 593405105;
	else
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= i_7_;
    }
}
