/* Class535 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class535
{
    Class526 this$0;
    int anInt7172;
    Class533[] aClass533Array7173;
    int anInt7174;
    int anInt7175;
    public static Class106_Sub1_Sub2 aClass106_Sub1_Sub2_7176;
    
    void method8856(int i, int i_0_) {
	if (null == aClass533Array7173 || i_0_ != -1399591617 * anInt7175
	    || i != anInt7172 * 1492711087) {
	    anInt7172 = i * 780804175;
	    anInt7174 = 1057699269 * ((1 << i) - 1);
	    anInt7175 = i_0_ * -1898413377;
	    int i_1_ = 1 << anInt7175 * -1399591617 + 1492711087 * anInt7172;
	    aClass533Array7173 = new Class533[i_1_];
	    for (int i_2_ = 0; i_2_ < i_1_; i_2_++)
		aClass533Array7173[i_2_] = new Class533(this);
	}
    }
    
    void method8857(int i, int i_3_) {
	if (null == aClass533Array7173 || i_3_ != -1399591617 * anInt7175
	    || i != anInt7172 * 1492711087) {
	    anInt7172 = i * 780804175;
	    anInt7174 = 1057699269 * ((1 << i) - 1);
	    anInt7175 = i_3_ * -1898413377;
	    int i_4_ = 1 << anInt7175 * -1399591617 + 1492711087 * anInt7172;
	    aClass533Array7173 = new Class533[i_4_];
	    for (int i_5_ = 0; i_5_ < i_4_; i_5_++)
		aClass533Array7173[i_5_] = new Class533(this);
	}
    }
    
    void method8858(int i) {
	int i_6_ = 1 << -1399591617 * anInt7175 + 1492711087 * anInt7172;
	for (int i_7_ = 0; i_7_ < i_6_; i_7_++)
	    aClass533Array7173[i_7_].method8841((short) 29580);
    }
    
    Class533 method8859(int i, byte i_8_, int i_9_) {
	return (aClass533Array7173
		[(((i & anInt7174 * 1214152973) << anInt7175 * -1399591617)
		  + ((i_8_ & 0xff) >>> 8 - -1399591617 * anInt7175))]);
    }
    
    void method8860(int i, int i_10_) {
	if (null == aClass533Array7173 || i_10_ != -1399591617 * anInt7175
	    || i != anInt7172 * 1492711087) {
	    anInt7172 = i * 780804175;
	    anInt7174 = 1057699269 * ((1 << i) - 1);
	    anInt7175 = i_10_ * -1898413377;
	    int i_11_ = 1 << anInt7175 * -1399591617 + 1492711087 * anInt7172;
	    aClass533Array7173 = new Class533[i_11_];
	    for (int i_12_ = 0; i_12_ < i_11_; i_12_++)
		aClass533Array7173[i_12_] = new Class533(this);
	}
    }
    
    void method8861(int i, int i_13_, int i_14_) {
	if (null == aClass533Array7173 || i_13_ != -1399591617 * anInt7175
	    || i != anInt7172 * 1492711087) {
	    anInt7172 = i * 780804175;
	    anInt7174 = 1057699269 * ((1 << i) - 1);
	    anInt7175 = i_13_ * -1898413377;
	    int i_15_ = 1 << anInt7175 * -1399591617 + 1492711087 * anInt7172;
	    aClass533Array7173 = new Class533[i_15_];
	    for (int i_16_ = 0; i_16_ < i_15_; i_16_++)
		aClass533Array7173[i_16_] = new Class533(this);
	}
    }
    
    Class535(Class526 class526) {
	this$0 = class526;
    }
    
    void method8862() {
	int i = 1 << -1399591617 * anInt7175 + 1492711087 * anInt7172;
	for (int i_17_ = 0; i_17_ < i; i_17_++)
	    aClass533Array7173[i_17_].method8841((short) 25057);
    }
    
    Class533 method8863(int i, byte i_18_) {
	return (aClass533Array7173
		[(((i & anInt7174 * 1214152973) << anInt7175 * -1399591617)
		  + ((i_18_ & 0xff) >>> 8 - -1399591617 * anInt7175))]);
    }
    
    static final void method8864(Class683 class683, int i) {
	int i_19_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_19_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_19_ >> 16];
	Class580.method9615(class259, class245, class683, 545166697);
    }
    
    static final void method8865(Class683 class683, int i) {
	if (client.aString11337 != null)
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= Class110.anInt1371 * -218000115;
	else
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= 0;
    }
    
    static final void method8866(Class683 class683, short i) {
	int i_20_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub4_10728
		  .method14167(i_20_, (byte) 118);
    }
    
    static boolean method8867(Interface66 interface66,
			      Class525_Sub41 class525_sub41, byte i) {
	return (null != interface66
		&& interface66.method430(class525_sub41,
					 client.anInterface64Array11106,
					 1353095005 * client.anInt11273,
					 Class198_Sub21.aClass551_10003,
					 346467305));
    }
}
