/* Class185 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.net.Socket;

public class Class185
{
    public static final int anInt2080 = 8191;
    public Class698 aClass698_2081 = new Class698();
    static Socket aSocket2082;
    
    static final void method3615(Class683 class683, byte i) {
	class683.anInt8662 -= -1189665054;
	int i_0_ = class683.anIntArray8661[501271953 * class683.anInt8662];
	boolean bool
	    = 1 == class683.anIntArray8661[501271953 * class683.anInt8662 + 1];
	class683.anObjectArray8636
	    [(class683.anInt8644 += 1285561025) * 1373599041 - 1]
	    = Class466.method7695(i_0_, bool, -411350439);
    }
    
    static final void method3616(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = 0;
    }
    
    static final void method3617(Class683 class683, byte i) {
	int i_1_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_1_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_1_ >> 16];
	Class178.method2917(class259, class245, class683, 982004133);
    }
    
    static final void method3618(Class683 class683, int i) {
	int i_2_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class656_Sub1_Sub3_Sub1_Sub2 class656_sub1_sub3_sub1_sub2
	    = ((Class656_Sub1_Sub3_Sub1_Sub2)
	       class683.aClass656_Sub1_Sub3_Sub1_8654);
	int i_3_ = class656_sub1_sub3_sub1_sub2.method18964(i_2_, 1374035712);
	int i_4_ = class656_sub1_sub3_sub1_sub2.method18948(i_2_, 707461188);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = i_3_;
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = i_4_;
    }
}
