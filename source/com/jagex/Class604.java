/* Class604 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Canvas;

public class Class604
{
    long aLong7954;
    short[] aShortArray7955;
    int[] anIntArray7956;
    short[] aShortArray7957;
    static Class157 aClass157_7958;
    
    public Class604(long l, int[] is, short[] is_0_, short[] is_1_) {
	aLong7954 = 3751699162305376725L * l;
	anIntArray7956 = is;
	aShortArray7955 = is_0_;
	aShortArray7957 = is_1_;
    }
    
    static final void method9983(Class683 class683, byte i) {
	int i_2_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_2_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_2_ >> 16];
	Class168.method2720(class259, class245, class683, 1056446776);
    }
    
    static final void method9984(Class683 class683, byte i) {
	class683.anInt8644 -= -438284221;
	Class245.method4479((String) (class683.anObjectArray8636
				      [1373599041 * class683.anInt8644]),
			    (String) (class683.anObjectArray8636
				      [1 + 1373599041 * class683.anInt8644]),
			    (String) (class683.anObjectArray8636
				      [2 + 1373599041 * class683.anInt8644]),
			    ((class683.anIntArray8661
			      [(class683.anInt8662 -= 1552651121) * 501271953])
			     == 1),
			    true, -1837801119);
    }
    
    static int method9985(Class603_Sub1 class603_sub1,
			  Class603_Sub1 class603_sub1_3_, int i, boolean bool,
			  int i_4_) {
	if (1 == i) {
	    int i_5_ = class603_sub1.anInt7953 * 1234139243;
	    int i_6_ = 1234139243 * class603_sub1_3_.anInt7953;
	    if (!bool) {
		if (-1 == i_5_)
		    i_5_ = 2001;
		if (i_6_ == -1)
		    i_6_ = 2001;
	    }
	    return i_5_ - i_6_;
	}
	if (i == 2)
	    return Class275.method5105(class603_sub1.method16995((byte) 87),
				       class603_sub1_3_.method16995((byte) 90),
				       Class21.aClass666_213, (byte) 0);
	if (i == 3) {
	    if (class603_sub1.aString10881.equals("-")) {
		if (class603_sub1_3_.aString10881.equals("-"))
		    return 0;
		return bool ? -1 : 1;
	    }
	    if (class603_sub1_3_.aString10881.equals("-"))
		return bool ? 1 : -1;
	    return Class275.method5105(class603_sub1.aString10881,
				       class603_sub1_3_.aString10881,
				       Class21.aClass666_213, (byte) 0);
	}
	if (4 == i)
	    return (class603_sub1.method9968(13333226)
		    ? class603_sub1_3_.method9968(13333226) ? 0 : 1
		    : class603_sub1_3_.method9968(13333226) ? -1 : 0);
	if (5 == i)
	    return (class603_sub1.method9966(1144164195)
		    ? class603_sub1_3_.method9966(1323576203) ? 0 : 1
		    : class603_sub1_3_.method9966(1177357041) ? -1 : 0);
	if (i == 6)
	    return (class603_sub1.method9967(-2066474901)
		    ? class603_sub1_3_.method9967(-1689347193) ? 0 : 1
		    : class603_sub1_3_.method9967(-1097346628) ? -1 : 0);
	if (i == 7)
	    return (class603_sub1.method9965((byte) -80)
		    ? class603_sub1_3_.method9965((byte) -37) ? 0 : 1
		    : class603_sub1_3_.method9965((byte) -32) ? -1 : 0);
	if (i == 8) {
	    int i_7_ = class603_sub1.anInt10882 * 1803394105;
	    int i_8_ = class603_sub1_3_.anInt10882 * 1803394105;
	    if (bool) {
		if (1000 == i_7_)
		    i_7_ = -1;
		if (i_8_ == 1000)
		    i_8_ = -1;
	    } else {
		if (-1 == i_7_)
		    i_7_ = 1000;
		if (-1 == i_8_)
		    i_8_ = 1000;
	    }
	    return i_7_ - i_8_;
	}
	return (-1721515947 * class603_sub1.anInt10883
		- class603_sub1_3_.anInt10883 * -1721515947);
    }
    
    public static Class182 method9986
	(Canvas canvas, Textures class180, Interface24 interface24,
     Interface47 interface47, Interface48 interface48,
     Interface49 interface49, int i, int i_9_, byte i_10_) {
	return new Class182_Sub2(canvas, class180, interface24, interface47,
				 interface48, interface49, i, i_9_);
    }
    
    static final void method9987(Class683 class683, byte i) {
	Class525_Sub15 class525_sub15
	    = Class16.method767(Class412.aClass412_4265,
				client.aClass96_11085.aClass6_1169,
				1977859884);
	client.aClass96_11085.method1794(class525_sub15, (short) 7198);
    }
    
    static final void method9988(Class683 class683, int i) {
	boolean bool = ((class683.anIntArray8661
			 [(class683.anInt8662 -= 1552651121) * 501271953])
			!= 0);
	if (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705.aClass637_12246
	    != null)
	    Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705.aClass637_12246
		.method10479(bool, -1975809757);
    }
}
