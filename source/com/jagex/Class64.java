/* Class64 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class64
{
    int anInt693;
    public int anInt694;
    public static int anInt695;
    public static Class157 aClass157_696;
    
    public boolean method1390(int i, int i_0_, int i_1_) {
	int i_2_ = 1657237733 * anInt693;
	if (2030157131 * anInt694 == i && 0 == anInt693 * 1657237733)
	    return false;
	boolean bool;
	if (1657237733 * anInt693 == 0) {
	    if (i > 2030157131 * anInt694 && i <= i_0_ + 2030157131 * anInt694
		|| (i < 2030157131 * anInt694
		    && i >= anInt694 * 2030157131 - i_0_)) {
		anInt694 = i * 840426595;
		return false;
	    }
	    bool = true;
	} else if (1657237733 * anInt693 > 0 && i > anInt694 * 2030157131) {
	    int i_3_
		= anInt693 * 1657237733 * (1657237733 * anInt693) / (2 * i_0_);
	    int i_4_ = 2030157131 * anInt694 + i_3_;
	    if (i_4_ >= i || i_4_ < 2030157131 * anInt694)
		bool = false;
	    else
		bool = true;
	} else if (anInt693 * 1657237733 < 0 && i < 2030157131 * anInt694) {
	    int i_5_
		= anInt693 * 1657237733 * (anInt693 * 1657237733) / (2 * i_0_);
	    int i_6_ = anInt694 * 2030157131 - i_5_;
	    if (i_6_ <= i || i_6_ > anInt694 * 2030157131)
		bool = false;
	    else
		bool = true;
	} else
	    bool = false;
	if (bool) {
	    if (i > anInt694 * 2030157131) {
		anInt693 += i_0_ * -647050003;
		if (0 != i_1_ && 1657237733 * anInt693 > i_1_)
		    anInt693 = -647050003 * i_1_;
	    } else {
		anInt693 -= i_0_ * -647050003;
		if (0 != i_1_ && anInt693 * 1657237733 < -i_1_)
		    anInt693 = -i_1_ * -647050003;
	    }
	    if (i_2_ != 1657237733 * anInt693) {
		int i_7_ = (1657237733 * anInt693 * (1657237733 * anInt693)
			    / (i_0_ * 2));
		if (i > 2030157131 * anInt694) {
		    if (2030157131 * anInt694 + i_7_ > i)
			anInt693 = -647050003 * i_2_;
		} else if (i < anInt694 * 2030157131
			   && anInt694 * 2030157131 - i_7_ < i)
		    anInt693 = -647050003 * i_2_;
	    }
	} else if (anInt693 * 1657237733 > 0) {
	    anInt693 -= -647050003 * i_0_;
	    if (anInt693 * 1657237733 < 0)
		anInt693 = 0;
	} else {
	    anInt693 += -647050003 * i_0_;
	    if (1657237733 * anInt693 > 0)
		anInt693 = 0;
	}
	anInt694 += (1657237733 * anInt693 + i_2_ >> 1) * 840426595;
	return bool;
    }
    
    public boolean method1391(int i, int i_8_, int i_9_, int i_10_) {
	int i_11_ = 1657237733 * anInt693;
	if (2030157131 * anInt694 == i && 0 == anInt693 * 1657237733)
	    return false;
	boolean bool;
	if (1657237733 * anInt693 == 0) {
	    if (i > 2030157131 * anInt694 && i <= i_8_ + 2030157131 * anInt694
		|| (i < 2030157131 * anInt694
		    && i >= anInt694 * 2030157131 - i_8_)) {
		anInt694 = i * 840426595;
		return false;
	    }
	    bool = true;
	} else if (1657237733 * anInt693 > 0 && i > anInt694 * 2030157131) {
	    int i_12_
		= anInt693 * 1657237733 * (1657237733 * anInt693) / (2 * i_8_);
	    int i_13_ = 2030157131 * anInt694 + i_12_;
	    if (i_13_ >= i || i_13_ < 2030157131 * anInt694)
		bool = false;
	    else
		bool = true;
	} else if (anInt693 * 1657237733 < 0 && i < 2030157131 * anInt694) {
	    int i_14_
		= anInt693 * 1657237733 * (anInt693 * 1657237733) / (2 * i_8_);
	    int i_15_ = anInt694 * 2030157131 - i_14_;
	    if (i_15_ <= i || i_15_ > anInt694 * 2030157131)
		bool = false;
	    else
		bool = true;
	} else
	    bool = false;
	if (bool) {
	    if (i > anInt694 * 2030157131) {
		anInt693 += i_8_ * -647050003;
		if (0 != i_9_ && 1657237733 * anInt693 > i_9_)
		    anInt693 = -647050003 * i_9_;
	    } else {
		anInt693 -= i_8_ * -647050003;
		if (0 != i_9_ && anInt693 * 1657237733 < -i_9_)
		    anInt693 = -i_9_ * -647050003;
	    }
	    if (i_11_ != 1657237733 * anInt693) {
		int i_16_ = (1657237733 * anInt693 * (1657237733 * anInt693)
			     / (i_8_ * 2));
		if (i > 2030157131 * anInt694) {
		    if (2030157131 * anInt694 + i_16_ > i)
			anInt693 = -647050003 * i_11_;
		} else if (i < anInt694 * 2030157131
			   && anInt694 * 2030157131 - i_16_ < i)
		    anInt693 = -647050003 * i_11_;
	    }
	} else if (anInt693 * 1657237733 > 0) {
	    anInt693 -= -647050003 * i_8_;
	    if (anInt693 * 1657237733 < 0)
		anInt693 = 0;
	} else {
	    anInt693 += -647050003 * i_8_;
	    if (1657237733 * anInt693 > 0)
		anInt693 = 0;
	}
	anInt694 += (1657237733 * anInt693 + i_11_ >> 1) * 840426595;
	return bool;
    }
    
    public void method1392(int i) {
	anInt694 = i * 840426595;
	anInt693 = 0;
    }
    
    public int method1393(short i) {
	return anInt694 * 2030157131 & 0x3fff;
    }
    
    public void method1394(int i) {
	anInt694 = 840426595 * (anInt694 * 2030157131 & 0x3fff);
    }
    
    public boolean method1395(int i, int i_17_, int i_18_) {
	int i_19_ = 1657237733 * anInt693;
	if (2030157131 * anInt694 == i && 0 == anInt693 * 1657237733)
	    return false;
	boolean bool;
	if (1657237733 * anInt693 == 0) {
	    if (i > 2030157131 * anInt694 && i <= i_17_ + 2030157131 * anInt694
		|| (i < 2030157131 * anInt694
		    && i >= anInt694 * 2030157131 - i_17_)) {
		anInt694 = i * 840426595;
		return false;
	    }
	    bool = true;
	} else if (1657237733 * anInt693 > 0 && i > anInt694 * 2030157131) {
	    int i_20_ = (anInt693 * 1657237733 * (1657237733 * anInt693)
			 / (2 * i_17_));
	    int i_21_ = 2030157131 * anInt694 + i_20_;
	    if (i_21_ >= i || i_21_ < 2030157131 * anInt694)
		bool = false;
	    else
		bool = true;
	} else if (anInt693 * 1657237733 < 0 && i < 2030157131 * anInt694) {
	    int i_22_ = (anInt693 * 1657237733 * (anInt693 * 1657237733)
			 / (2 * i_17_));
	    int i_23_ = anInt694 * 2030157131 - i_22_;
	    if (i_23_ <= i || i_23_ > anInt694 * 2030157131)
		bool = false;
	    else
		bool = true;
	} else
	    bool = false;
	if (bool) {
	    if (i > anInt694 * 2030157131) {
		anInt693 += i_17_ * -647050003;
		if (0 != i_18_ && 1657237733 * anInt693 > i_18_)
		    anInt693 = -647050003 * i_18_;
	    } else {
		anInt693 -= i_17_ * -647050003;
		if (0 != i_18_ && anInt693 * 1657237733 < -i_18_)
		    anInt693 = -i_18_ * -647050003;
	    }
	    if (i_19_ != 1657237733 * anInt693) {
		int i_24_ = (1657237733 * anInt693 * (1657237733 * anInt693)
			     / (i_17_ * 2));
		if (i > 2030157131 * anInt694) {
		    if (2030157131 * anInt694 + i_24_ > i)
			anInt693 = -647050003 * i_19_;
		} else if (i < anInt694 * 2030157131
			   && anInt694 * 2030157131 - i_24_ < i)
		    anInt693 = -647050003 * i_19_;
	    }
	} else if (anInt693 * 1657237733 > 0) {
	    anInt693 -= -647050003 * i_17_;
	    if (anInt693 * 1657237733 < 0)
		anInt693 = 0;
	} else {
	    anInt693 += -647050003 * i_17_;
	    if (1657237733 * anInt693 > 0)
		anInt693 = 0;
	}
	anInt694 += (1657237733 * anInt693 + i_19_ >> 1) * 840426595;
	return bool;
    }
    
    public void method1396() {
	anInt694 = 840426595 * (anInt694 * 2030157131 & 0x3fff);
    }
    
    public void method1397(int i) {
	anInt694 = i * 840426595;
	anInt693 = 0;
    }
    
    public void method1398() {
	anInt694 = 840426595 * (anInt694 * 2030157131 & 0x3fff);
    }
    
    public void method1399() {
	anInt694 = 840426595 * (anInt694 * 2030157131 & 0x3fff);
    }
    
    public void method1400() {
	anInt694 = 840426595 * (anInt694 * 2030157131 & 0x3fff);
    }
    
    public void method1401(int i, int i_25_) {
	anInt694 = i * 840426595;
	anInt693 = 0;
    }
    
    static String method1402(int i, int i_26_, int i_27_) {
	int i_28_ = i_26_ - i;
	if (i_28_ < -9)
	    return Class493.method8001(16711680, 1125434183);
	if (i_28_ < -6)
	    return Class493.method8001(16723968, 1814628829);
	if (i_28_ < -3)
	    return Class493.method8001(16740352, 380894190);
	if (i_28_ < 0)
	    return Class493.method8001(16756736, 1255682134);
	if (i_28_ > 9)
	    return Class493.method8001(65280, 634193794);
	if (i_28_ > 6)
	    return Class493.method8001(4259584, 743717199);
	if (i_28_ > 3)
	    return Class493.method8001(8453888, 1234882752);
	if (i_28_ > 0)
	    return Class493.method8001(12648192, 485287424);
	return Class493.method8001(16776960, 1676131489);
    }
    
    static final void method1403(Class683 class683, int i) {
	int i_29_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_29_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_29_ >> 16];
	Class459.method7584(class259, class245, class683, -2042752966);
    }
    
    static final void method1404(Class683 class683, int i) {
	int i_30_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class532.aClass111_7170.method1965(i_30_, 1172176052);
    }
    
    static final void method1405(Class683 class683, byte i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = class683.aClass353_8652.aByte3765;
    }
    
    static void method1406(int i, String string, String string_31_,
			   int i_32_) {
	if (client.aClass96_11085 != null) {
	    Class525_Sub15 class525_sub15
		= Class16.method767(Class412.aClass412_4281,
				    client.aClass96_11085.aClass6_1169,
				    1977859884);
	    class525_sub15.aClass525_Sub38_Sub2_10546.method16602
		((1 + Class538.method8886(string, 1470515156)
		  + Class538.method8886(string_31_, 1470515156)),
		 1748513485);
	    class525_sub15.aClass525_Sub38_Sub2_10546.method16612(string_31_,
								  -1303923493);
	    class525_sub15.aClass525_Sub38_Sub2_10546.method16612(string,
								  -2038593372);
	    class525_sub15.aClass525_Sub38_Sub2_10546
		.method16696(i, (short) 9106);
	    client.aClass96_11085.method1794(class525_sub15, (short) 2458);
	}
    }
}
