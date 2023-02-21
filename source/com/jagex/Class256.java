/* Class256 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public final class Class256
{
    static final String aString2548 = "#";
    
    Class256() throws Throwable {
	throw new Error();
    }
    
    public static final boolean method4648
	(String string, String string_0_, String string_1_, String string_2_) {
	if (string == null || null == string_1_)
	    return false;
	if (string.startsWith("#") || string_1_.startsWith("#"))
	    return string.equals(string_1_);
	return string_0_.equals(string_2_);
    }
    
    static final void method4649(Class259 class259, Class245 class245,
				 Class683 class683, byte i) {
	class259.aBool2623
	    = (class683.anIntArray8661
	       [(class683.anInt8662 -= 1552651121) * 501271953]) == 1;
	Class649.method10708(class259, (byte) 0);
    }
    
    static final void method4650(Class683 class683, int i) {
	class683.anInt8644 -= -1723845246;
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class275.method5105((String) (class683.anObjectArray8636
					    [1373599041 * class683.anInt8644]),
				  ((String)
				   (class683.anObjectArray8636
				    [class683.anInt8644 * 1373599041 + 1])),
				  Class21.aClass666_213, (byte) 0);
    }
    
    static final void method4651(Class683 class683, short i) {
	class683.anInt8662 -= 362986067;
	int i_3_ = class683.anIntArray8661[class683.anInt8662 * 501271953];
	int i_4_ = class683.anIntArray8661[1 + class683.anInt8662 * 501271953];
	int i_5_ = class683.anIntArray8661[501271953 * class683.anInt8662 + 2];
	long l = Class172.method2758(0, 0, 12, i_3_, i_4_, i_5_, 1069071038);
	int i_6_ = Class452.method7342(l);
	if (i_5_ < 1970)
	    i_6_--;
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = i_6_;
    }
    
    static final void method4652(Class683 class683, int i) {
	class683.anInt8662 -= -1189665054;
	int i_7_ = class683.anIntArray8661[class683.anInt8662 * 501271953];
	int i_8_ = class683.anIntArray8661[501271953 * class683.anInt8662 + 1];
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = (Class562.aClass471_7557.method7736(i_7_, 1241198265)
	       .anIntArray11914[i_8_]);
    }
    
    static final void method4653(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	class683.anObjectArray8636
	    [(class683.anInt8644 += 1285561025) * 1373599041 - 1]
	    = class259.aString2667;
    }
}
