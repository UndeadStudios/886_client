/* Class280 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class280
{
    public String aString2996;
    public String aString2997;
    public String aString2998;
    public Class271[] aClass271Array2999;
    public Class271[] aClass271Array3000;
    public static boolean aBool3001;
    
    void method5156(Class286 class286, int i) {
	aString2997 = class286.method5226(1872491864);
	aString2996 = class286.method5226(2009858617);
	aString2998 = class286.method5226(2080558894);
	int i_0_ = class286.method5225((byte) -13);
	int i_1_ = class286.method5225((byte) -88);
	aClass271Array2999 = i_0_ == 0 ? null : new Class271[i_0_];
	aClass271Array3000 = i_1_ == 0 ? null : new Class271[i_1_];
	for (int i_2_ = 0; i_2_ < i_0_; i_2_++) {
	    aClass271Array2999[i_2_] = new Class271();
	    aClass271Array2999[i_2_].method5009(class286, (byte) -38);
	}
	for (int i_3_ = 0; i_3_ < i_1_; i_3_++) {
	    aClass271Array3000[i_3_] = new Class271();
	    aClass271Array3000[i_3_].method5009(class286, (byte) -86);
	}
    }
    
    Class280() {
	/* empty */
    }
    
    void method5157(Class286 class286) {
	aString2997 = class286.method5226(1930865241);
	aString2996 = class286.method5226(2052522480);
	aString2998 = class286.method5226(2098904207);
	int i = class286.method5225((byte) -110);
	int i_4_ = class286.method5225((byte) -20);
	aClass271Array2999 = i == 0 ? null : new Class271[i];
	aClass271Array3000 = i_4_ == 0 ? null : new Class271[i_4_];
	for (int i_5_ = 0; i_5_ < i; i_5_++) {
	    aClass271Array2999[i_5_] = new Class271();
	    aClass271Array2999[i_5_].method5009(class286, (byte) -19);
	}
	for (int i_6_ = 0; i_6_ < i_4_; i_6_++) {
	    aClass271Array3000[i_6_] = new Class271();
	    aClass271Array3000[i_6_].method5009(class286, (byte) -71);
	}
    }
    
    void method5158(Class286 class286) {
	aString2997 = class286.method5226(2012069404);
	aString2996 = class286.method5226(1683674315);
	aString2998 = class286.method5226(1718945634);
	int i = class286.method5225((byte) 8);
	int i_7_ = class286.method5225((byte) 5);
	aClass271Array2999 = i == 0 ? null : new Class271[i];
	aClass271Array3000 = i_7_ == 0 ? null : new Class271[i_7_];
	for (int i_8_ = 0; i_8_ < i; i_8_++) {
	    aClass271Array2999[i_8_] = new Class271();
	    aClass271Array2999[i_8_].method5009(class286, (byte) -24);
	}
	for (int i_9_ = 0; i_9_ < i_7_; i_9_++) {
	    aClass271Array3000[i_9_] = new Class271();
	    aClass271Array3000[i_9_].method5009(class286, (byte) -103);
	}
    }
    
    static final void method5159(Class259 class259, Class683 class683,
				 byte i) {
	int i_10_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	int i_11_ = ((class683.anIntArray8661
		      [(class683.anInt8662 -= 1552651121) * 501271953])
		     - 1);
	int i_12_ = i_11_;
	if (6 != 307215955 * class259.anInt2630
	    && 2 != class259.anInt2630 * 307215955)
	    throw new RuntimeException("");
	NPCDefinitions class299
	    = ((NPCDefinitions)
	       Class168_Sub1.aClass40_Sub7_9112
		   .method76(-961419549 * class259.anInt2631, -994469590));
	if (null == class259.aClass288_2769)
	    class259.aClass288_2769
		= new Class288(class299, class259.anInt2630 * 307215955 == 6);
	class259.aClass288_2769.aLong3195
	    = Class666.method11002((byte) 72) * -6636968143718260973L;
	if (null != class299.aByteArray3302) {
	    if (i_11_ < 0 || i_11_ >= class299.aByteArray3302.length)
		throw new RuntimeException("");
	    i_12_ = class299.aByteArray3302[i_11_];
	}
	if (class299.aShortArray3300 == null || i_12_ < 0
	    || i_12_ >= class299.aShortArray3300.length)
	    throw new RuntimeException("");
	class259.aClass288_2769.aShortArray3196[i_12_] = (short) i_10_;
	Class649.method10708(class259, (byte) 0);
    }
    
    static final void method5160(Class683 class683, int i) {
	class683.anInt8662 -= -1189665054;
	Class525_Sub16_Sub1 class525_sub16_sub1
	    = ((Class525_Sub16_Sub1)
	       Class612.aClass40_Sub19_8026.method76((class683.anIntArray8661
						      [(501271953
							* (class683
							   .anInt8662))]),
						     -716712874));
	int i_13_
	    = class683.anIntArray8661[1 + class683.anInt8662 * 501271953];
	int i_14_ = -1;
	for (int i_15_ = 0;
	     i_15_ < class525_sub16_sub1.anInt11401 * -644794771; i_15_++) {
	    if (i_13_ == class525_sub16_sub1.anIntArray11402[i_15_]) {
		i_14_ = class525_sub16_sub1.anIntArray11403[i_15_];
		break;
	    }
	}
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = i_14_;
    }
    
    static final void method5161(Class683 class683, byte i) {
	Class51.method1140((String) (class683.anObjectArray8636
				     [((class683.anInt8644 -= 1285561025)
				       * 1373599041)]),
			   ((class683.anIntArray8661
			     [(class683.anInt8662 -= 1552651121) * 501271953])
			    == 1),
			   -1187986295);
    }
    
    public static final void method5162(byte i) {
	if (1 != Class70.anInt784 * 1398680989) {
	    Class70.aClass96_741.method1802((short) 21507);
	    Class455_Sub1.method15986(608749259);
	    Class315.method5656(-822452215);
	}
    }
}
