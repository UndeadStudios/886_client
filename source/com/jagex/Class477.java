/* Class477 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class477
{
    int anInt5188;
    static Class477 aClass477_5189 = new Class477(0, false);
    public static Class477 aClass477_5190 = new Class477(1, false);
    static Class477 aClass477_5191;
    static Class477 aClass477_5192;
    static Class477 aClass477_5193;
    static Class477 aClass477_5194;
    static Class477 aClass477_5195;
    static Class477 aClass477_5196;
    static Class477 aClass477_5197 = new Class477(2, false);
    public boolean aBool5198;
    public static short[][] aShortArrayArray5199;
    public static int anInt5200;
    
    static {
	aClass477_5191 = new Class477(3, false);
	aClass477_5192 = new Class477(4, false);
	aClass477_5193 = new Class477(5, true);
	aClass477_5194 = new Class477(6, true);
	aClass477_5195 = new Class477(7, true);
	aClass477_5196 = new Class477(8, true);
    }
    
    Class477(int i, boolean bool) {
	anInt5188 = -1797831125 * i;
	aBool5198 = bool;
    }
    
    static final void method7782(Class683 class683, int i) {
	class683.anInt8662 -= 1552651121;
    }
    
    static final void method7783(Class683 class683, byte i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = class683.aClass353_8652.aBool3761 ? 1 : 0;
    }
    
    static final void method7784(Class683 class683, int i) {
	Class690 class690 = Class322.method5727(1034217314);
	String string = Class399.method6547((byte) 64);
	if (string == null)
	    string = "";
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = class690.method80();
	class683.anObjectArray8636
	    [(class683.anInt8644 += 1285561025) * 1373599041 - 1]
	    = string;
    }
    
    static final void method7785(Class683 class683, int i) {
	int i_0_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	if (i_0_ > 255 || i_0_ < 0)
	    i_0_ = 0;
	if (i_0_ != Class198_Sub13.aClass525_Sub30_9973
			.aClass696_Sub38_10721.method17314(823514383)) {
	    Class198_Sub13.aClass525_Sub30_9973.method16502
		(Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub38_10721,
		 i_0_, (byte) -32);
	    Class650.method10715(-1758466106);
	    client.aBool11084 = false;
	}
    }
    
    static final void method7786(Class259 class259, Class245 class245,
				 Class683 class683, short i) {
	class683.anInt8662 -= 1915637188;
	class259.anInt2596
	    = (class683.anIntArray8661[501271953 * class683.anInt8662]
	       * 713195545);
	class259.anInt2597
	    = (class683.anIntArray8661[1 + class683.anInt8662 * 501271953]
	       * 129500881);
	int i_1_ = class683.anIntArray8661[class683.anInt8662 * 501271953 + 2];
	if (i_1_ < 0)
	    i_1_ = 0;
	else if (i_1_ > 5)
	    i_1_ = 5;
	int i_2_ = class683.anIntArray8661[3 + 501271953 * class683.anInt8662];
	if (i_2_ < 0)
	    i_2_ = 0;
	else if (i_2_ > 5)
	    i_2_ = 5;
	class259.aByte2592 = (byte) i_1_;
	class259.aByte2593 = (byte) i_2_;
	Class649.method10708(class259, (byte) 0);
	Class372.method6364(class245, class259, -1788827441);
	if (0 == 2010235789 * class259.anInt2590)
	    Class76.method1560(class245, class259, false, -181562890);
	if (class259.anInt2576 * 1534974651 == -1 && !class245.aBool2428)
	    Class563.method9434(1984678839 * class259.anInt2588, (short) 128);
    }
    
    public static Class84 method7787(int i, int i_3_) {
	Class84[] class84s = Class707.method14321(-627876);
	Class84[] class84s_4_ = class84s;
	for (int i_5_ = 0; i_5_ < class84s_4_.length; i_5_++) {
	    Class84 class84 = class84s_4_[i_5_];
	    if (i == -65856417 * class84.anInt885)
		return class84;
	}
	return null;
    }
    
    static final void method7788(Class683 class683, int i) {
	int i_6_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_6_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_6_ >> 16];
	Class266.method4945(class259, class245, class683, (byte) 54);
    }
    
    static final void method7789(Class683 class683, int i) {
	boolean bool = true;
	if (client.aBool11315) {
	    try {
		Object object = Class407.aClass407_4175.method6618(1178996993);
		if (null != object)
		    bool = ((Boolean) object).booleanValue();
	    } catch (Throwable throwable) {
		/* empty */
	    }
	}
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = bool ? 1 : 0;
    }
}
