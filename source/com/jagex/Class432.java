/* Class432 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class432 implements Interface6
{
    JS5 aClass458_4820;
    
    public int method49(int i) {
	if (aClass458_4820.method7481((short) -13745))
	    return 100;
	return aClass458_4820.method7483((byte) 40);
    }
    
    Class432(JS5 class458) {
	aClass458_4820 = class458;
    }
    
    public Class27 method48(int i) {
	return Class27.aClass27_280;
    }
    
    public Class27 method47() {
	return Class27.aClass27_280;
    }
    
    public int method12() {
	if (aClass458_4820.method7481((short) 25232))
	    return 100;
	return aClass458_4820.method7483((byte) 42);
    }
    
    public int method50() {
	if (aClass458_4820.method7481((short) -19662))
	    return 100;
	return aClass458_4820.method7483((byte) 89);
    }
    
    public Class27 method51() {
	return Class27.aClass27_280;
    }
    
    public Class27 method52() {
	return Class27.aClass27_280;
    }
    
    static final int method6906(int i, byte i_0_) {
	return i < 7 ? 8 : 11;
    }
    
    static final void method6907(Class683 class683, int i) {
	int i_1_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	String string
	    = (String) (class683.anObjectArray8636
			[(class683.anInt8644 -= 1285561025) * 1373599041]);
	int i_2_ = Class198_Sub3.method15609(Class176.aClass685_1884,
					     Class675.aClass675_8613, i_1_,
					     742041011);
	int i_3_
	    = Class46.method1094(Class176.aClass685_1884,
				 Class675.aClass675_8613, i_1_, (byte) 16);
	if (16 != 1777895575 * client.anInt11075
	    || Class198_Sub4.method15613(-492271742))
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= 0;
	else
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= (Class480.method7823(i_1_, string, i_2_, i_3_, -1275179312)
		   ? 1 : 0);
    }
    
    static void method6908(Class182 class182, Class259 class259, short i) {
	boolean bool
	    = ((Class313_Sub2.aClass40_Sub22_10106.method17506
		(class182, class259.anInt2740 * 372293357,
		 class259.anInt2741 * -1408303227,
		 1107836521 * class259.anInt2624,
		 ~0xffffff | 1971227387 * class259.anInt2565,
		 -510508613 * class259.anInt2715,
		 (class259.aBool2702
		  ? Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705.aClass637_12246
		  : null),
		 (byte) -18))
	       == null);
	if (bool) {
	    Class108.aClass709_1308.method14345
		(new Class525_Sub6(372293357 * class259.anInt2740,
				   -1408303227 * class259.anInt2741,
				   class259.anInt2624 * 1107836521,
				   ~0xffffff | 1971227387 * class259.anInt2565,
				   class259.anInt2715 * -510508613,
				   class259.aBool2702),
		 (byte) 0);
	    Class649.method10708(class259, (byte) 0);
	}
    }
}
