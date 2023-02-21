/* Class573 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class573 implements Interface66
{
    int anInt7643;
    int anInt7644;
    
    Class573(int i, int i_0_) {
	anInt7643 = 365783463 * i;
	anInt7644 = i_0_ * 2120401815;
    }
    
    public boolean method430(Class525_Sub41 class525_sub41,
			     Interface64[] interface64s, int i,
			     Class551 class551, int i_1_) {
	for (int i_2_ = 0; i_2_ < i && i_2_ < interface64s.length; i_2_++) {
	    Interface64 interface64 = interface64s[i_2_];
	    if (null != interface64
		&& (interface64.method413(-1342655352)
		    == anInt7643 * -1931170281)
		&& interface64.method427((byte) 17) == 1394863143 * anInt7644)
		return true;
	}
	return false;
    }
    
    public boolean method432(Class525_Sub41 class525_sub41,
			     Interface64[] interface64s, int i,
			     Class551 class551) {
	for (int i_3_ = 0; i_3_ < i && i_3_ < interface64s.length; i_3_++) {
	    Interface64 interface64 = interface64s[i_3_];
	    if (null != interface64
		&& (interface64.method413(-1216853010)
		    == anInt7643 * -1931170281)
		&& interface64.method427((byte) -94) == 1394863143 * anInt7644)
		return true;
	}
	return false;
    }
    
    public boolean method429(Class525_Sub41 class525_sub41,
			     Interface64[] interface64s, int i,
			     Class551 class551) {
	for (int i_4_ = 0; i_4_ < i && i_4_ < interface64s.length; i_4_++) {
	    Interface64 interface64 = interface64s[i_4_];
	    if (null != interface64
		&& interface64.method413(513765218) == anInt7643 * -1931170281
		&& interface64.method427((byte) 29) == 1394863143 * anInt7644)
		return true;
	}
	return false;
    }
    
    static Class573 method9538(RSBuffer class525_sub38) {
	int i = class525_sub38.readUnsignedByte(1510904521);
	int i_5_ = class525_sub38.readUnsignedByte(345971425);
	return new Class573(i, i_5_);
    }
    
    static Class573 method9539(RSBuffer class525_sub38) {
	int i = class525_sub38.readUnsignedByte(1854234917);
	int i_6_ = class525_sub38.readUnsignedByte(2007622645);
	return new Class573(i, i_6_);
    }
    
    public boolean method431(Class525_Sub41 class525_sub41,
			     Interface64[] interface64s, int i,
			     Class551 class551) {
	for (int i_7_ = 0; i_7_ < i && i_7_ < interface64s.length; i_7_++) {
	    Interface64 interface64 = interface64s[i_7_];
	    if (null != interface64
		&& interface64.method413(-159831367) == anInt7643 * -1931170281
		&& interface64.method427((byte) -14) == 1394863143 * anInt7644)
		return true;
	}
	return false;
    }
    
    static Class573 method9540(RSBuffer class525_sub38) {
	int i = class525_sub38.readUnsignedByte(855974985);
	int i_8_ = class525_sub38.readUnsignedByte(1744681509);
	return new Class573(i, i_8_);
    }
    
    static final void method9541(Class683 class683, int i) {
	int i_9_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_9_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_9_ >> 16];
	Class626.method10260(class259, class245, class683, (byte) 41);
    }
    
    public static void method9542(int i, int i_10_, int i_11_,
				  Class602 class602, byte i_12_) {
	for (Class525_Sub2 class525_sub2
		 = ((Class525_Sub2)
		    Class525_Sub2.aClass709_10429.method14372((short) -23511));
	     null != class525_sub2;
	     class525_sub2 = (Class525_Sub2) Class525_Sub2.aClass709_10429
						 .method14353(-1526588017)) {
	    if (i == -1116430801 * class525_sub2.anInt10430
		&& -1434804169 * class525_sub2.anInt10413 == i_10_ << 9
		&& class525_sub2.anInt10415 * 778074015 == i_11_ << 9
		&& (1156889815 * class525_sub2.aClass602_10423.anInt7894
		    == 1156889815 * class602.anInt7894)) {
		if (class525_sub2.aClass488_10435 != null) {
		    class525_sub2.aClass488_10435.method7916(100, (byte) -79);
		    Class40_Sub20.aClass217_11050
			.method4026(class525_sub2.aClass488_10435, 277438154);
		    class525_sub2.aClass488_10435 = null;
		}
		class525_sub2.method8755(-1933461091);
		break;
	    }
	}
    }
}
