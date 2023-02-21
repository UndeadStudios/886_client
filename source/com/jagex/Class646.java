/* Class646 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.File;

public final class Class646
{
    public volatile int anInt8356 = 1305597287;
    volatile String aString8357;
    static short aShort8358;
    
    Class646(String string) {
	aString8357 = string;
    }
    
    static final void method10688(Class683 class683, int i) {
	class683.anInt8663
	    += (class683.anIntArray8647[1931825055 * class683.anInt8663]
		* -1827402657);
    }
    
    static final void method10689(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class636.method10471(class259, class245, class683, 1659082612);
    }
    
    static final void method10690(Class683 class683, byte i) {
	int i_0_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_0_, -695254952);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = -30526621 * class259.anInt2620;
    }
    
    static final void method10691(Class683 class683, int i) {
	class683.anInt8662 -= -1189665054;
	int i_1_ = class683.anIntArray8661[501271953 * class683.anInt8662];
	int i_2_ = class683.anIntArray8661[501271953 * class683.anInt8662 + 1];
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = (i_1_ & 1 << i_2_) != 0 ? 1 : 0;
    }
    
    public static byte[] method10692(File file, byte i) {
	return Class324.method5738(file, (int) file.length(), 672510500);
    }
    
    static final void method10693(int i, int i_3_, int i_4_, int i_5_,
				  short i_6_) {
	int i_7_ = -597643975 * client.anInt11205;
	int i_8_ = client.anInt11099 * 818607533;
	if (224735789 * client.anInt11208 == 1) {
	    Class157 class157 = (Class198_Sub7.aClass157Array9926
				 [client.anInt11139 * 981721963 / 100]);
	    class157.method2518(i_7_ - 8, i_8_ - 8);
	}
	if (2 == 224735789 * client.anInt11208) {
	    Class157 class157 = (Class198_Sub7.aClass157Array9926
				 [4 + client.anInt11139 * 981721963 / 100]);
	    class157.method2518(i_7_ - 8, i_8_ - 8);
	}
    }
}
