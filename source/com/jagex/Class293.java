/* Class293 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

public class Class293 implements Interface32
{
    int anInt3231;
    static Class200 aClass200_3232;
    Class87 aClass87_3233;
    Interface33[] anInterface33Array3234;
    int anInt3235;
    boolean aBool3236;
    Class182 aClass182_3237;
    static byte[] aByteArray3238
	= { 31, -117, 8, 0, 0, 0, 0, 0, 0, 0, -5, 127, -29, -1, 109, 6, 103, 6,
	    14, 54, 54, 118, 54, 86, 14, 118, 118, 118, 78, 78, 14, 46, 30, 17,
	    94, 30, 110, 110, 30, 73, 33, 97, 126, 17, 89, 41, 121, 57, 89, 41,
	    25, 25, 5, 21, 61, 117, 5, 37, 29, 101, 25, 25, 13, 115, 77, 29, 3,
	    67, 19, 19, 19, 121, 117, 75, 91, 11, 35, 27, 61, 99, 19, 35, -112,
	    33, -116, -100, -100, -100, 60, -36, 60, 18, -68, -68, 18, 70,
	    -118, 50, -118, 70, 36, -125, -1, 7, 24, 68, 56, 24, 24, 25, 24,
	    89, 24, -107, 24, -104, 4, 25, -103, 5, 25, 89, -108, 24, -2, 31,
	    97, -112, 103, 96, 96, 100, 101, 4, 3, 6, 40, 96, 100, 98, 102, 97,
	    101, 99, -25, -32, -28, -30, 6, 42, -40, 42, -64, -64, -60, -56,
	    -52, -52, -60, -62, -52, -54, -54, -62, 2, -108, -83, 5, -54, 51,
	    -80, 8, -78, 10, 41, 26, 58, -78, 9, 7, 38, -78, 43, 21, -118, 24,
	    53, 78, 92, -56, -95, -20, -76, -15, -96, 104, -48, -59, 15, 42,
	    -58, 73, 69, 77, -100, 92, 98, -30, 18, -110, 82, -86, 106, -22,
	    26, -102, 90, 38, -90, 102, -26, 22, -106, 86, -50, 46, -82, 110,
	    -18, 30, -98, 94, -63, 33, -95, 97, -31, 17, -111, 81, -55, 41,
	    -87, 105, -23, 25, -103, 89, -59, 37, -91, 101, -27, 21, -107, 85,
	    -51, 45, -83, 109, -19, 29, -99, 93, -109, 38, 79, -103, 58, 109,
	    -6, -116, -103, -77, 22, 45, 94, -78, 116, -39, -14, 21, 43, 87,
	    109, -38, -68, 101, -21, -74, -19, 59, 118, -18, 58, 116, -8, -56,
	    -47, 99, -57, 79, -100, 60, 117, -23, -14, -107, -85, -41, -82,
	    -33, -72, 121, -21, -31, -93, -57, 79, -98, 62, 123, -2, -30, -27,
	    -85, -113, -97, 62, 127, -7, -6, -19, -5, -113, -97, -65, 64, -2,
	    98, 100, 96, 102, -124, 1, -84, -2, 18, 4, -6, -117, -119, -123,
	    -123, -103, -123, 29, -28, 47, 70, -90, 114, -112, 2, 65, 22, 86,
	    69, 67, 54, 33, -57, 64, -10, -60, 66, 97, 37, -93, 70, 14, 17,
	    -89, -119, 11, 55, 30, -28, 84, 54, 14, -6, 32, -102, 84, 116,
	    -111, 75, 76, -59, -28, -95, -22, 71, -112, -41, -64, 62, 35, -50,
	    99, 77, 100, -7, 12, -18, 49, -124, -65, 110, 49, -16, -79, 48, 2,
	    -29, 15, -24, 78, 6, 6, 123, -122, -97, -1, -70, 52, 22, -16, -49,
	    127, -79, -88, -21, -1, 77, 0, 38, 27, -28, 10, 110, 2, 0, 0 };
    public static Class106_Sub1_Sub2 aClass106_Sub1_Sub2_3239;
    
    public int method196() {
	int i = 0;
	Interface33[] interface33s = anInterface33Array3234;
	for (int i_0_ = 0; i_0_ < interface33s.length; i_0_++) {
	    Interface33 interface33 = interface33s[i_0_];
	    if (interface33 == null || interface33.method213(2061547021))
		i++;
	}
	return i * 100 / anInterface33Array3234.length;
    }
    
    public void method19(int i) {
	if (Class501.aClass182_5564 != aClass182_3237) {
	    aClass182_3237 = Class501.aClass182_5564;
	    aBool3236 = true;
	}
	aClass182_3237.method3188(3, 0);
	Interface33[] interface33s = anInterface33Array3234;
	for (int i_1_ = 0; i_1_ < interface33s.length; i_1_++) {
	    Interface33 interface33 = interface33s[i_1_];
	    if (interface33 != null)
		interface33.method211(857072231);
	}
    }
    
    public void method194(boolean bool, int i) {
	bool = true;
	Interface33[] interface33s = anInterface33Array3234;
	for (int i_2_ = 0; i_2_ < interface33s.length; i_2_++) {
	    Interface33 interface33 = interface33s[i_2_];
	    if (null != interface33)
		interface33.method212(bool || aBool3236, (byte) -1);
	}
	aBool3236 = false;
    }
    
    public static Class157 method5296(Class458 class458, int i) {
	Class157 class157 = (Class157) aClass200_3232.method3785((long) i);
	if (class157 == null) {
	    if (Class302.aBool3380)
		class157
		    = Class501.aClass182_5564
			  .method3216(Class187.method3668(class458, i), true);
	    else
		class157
		    = Class225.method4249(class458.method7484(i, 2014827246),
					  294776821);
	    aClass200_3232.method3788(class157, (long) i);
	}
	return class157;
    }
    
    public int method189() {
	return 1535036643 * anInt3231;
    }
    
    public boolean method198(long l) {
	return (Class251.method4508((byte) 8)
		>= (long) (-1925415009 * anInt3235) + l);
    }
    
    public int method190(int i) {
	return 1535036643 * anInt3231;
    }
    
    public void method134() {
	if (Class501.aClass182_5564 != aClass182_3237) {
	    aClass182_3237 = Class501.aClass182_5564;
	    aBool3236 = true;
	}
	aClass182_3237.method3188(3, 0);
	Interface33[] interface33s = anInterface33Array3234;
	for (int i = 0; i < interface33s.length; i++) {
	    Interface33 interface33 = interface33s[i];
	    if (interface33 != null)
		interface33.method211(857072231);
	}
    }
    
    public void method200() {
	/* empty */
    }
    
    static {
	aClass200_3232 = new Class200(128, 4);
    }
    
    public void method193() {
	/* empty */
    }
    
    public int method203() {
	return 1535036643 * anInt3231;
    }
    
    public void method195() {
	if (Class501.aClass182_5564 != aClass182_3237) {
	    aClass182_3237 = Class501.aClass182_5564;
	    aBool3236 = true;
	}
	aClass182_3237.method3188(3, 0);
	Interface33[] interface33s = anInterface33Array3234;
	for (int i = 0; i < interface33s.length; i++) {
	    Interface33 interface33 = interface33s[i];
	    if (interface33 != null)
		interface33.method211(857072231);
	}
    }
    
    public int method202(int i) {
	int i_3_ = 0;
	Interface33[] interface33s = anInterface33Array3234;
	for (int i_4_ = 0; i_4_ < interface33s.length; i_4_++) {
	    Interface33 interface33 = interface33s[i_4_];
	    if (interface33 == null || interface33.method213(2061547021))
		i_3_++;
	}
	return i_3_ * 100 / anInterface33Array3234.length;
    }
    
    public int method197() {
	int i = 0;
	Interface33[] interface33s = anInterface33Array3234;
	for (int i_5_ = 0; i_5_ < interface33s.length; i_5_++) {
	    Interface33 interface33 = interface33s[i_5_];
	    if (interface33 == null || interface33.method213(2061547021))
		i++;
	}
	return i * 100 / anInterface33Array3234.length;
    }
    
    public int method208() {
	int i = 0;
	Interface33[] interface33s = anInterface33Array3234;
	for (int i_6_ = 0; i_6_ < interface33s.length; i_6_++) {
	    Interface33 interface33 = interface33s[i_6_];
	    if (interface33 == null || interface33.method213(2061547021))
		i++;
	}
	return i * 100 / anInterface33Array3234.length;
    }
    
    public boolean method206(long l) {
	return (Class251.method4508((byte) 8)
		>= (long) (-1925415009 * anInt3235) + l);
    }
    
    public boolean method205(long l) {
	return (Class251.method4508((byte) 8)
		>= (long) (-1925415009 * anInt3235) + l);
    }
    
    public void method207(boolean bool) {
	bool = true;
	Interface33[] interface33s = anInterface33Array3234;
	for (int i = 0; i < interface33s.length; i++) {
	    Interface33 interface33 = interface33s[i];
	    if (null != interface33)
		interface33.method212(bool || aBool3236, (byte) -53);
	}
	aBool3236 = false;
    }
    
    public void method187(boolean bool) {
	bool = true;
	Interface33[] interface33s = anInterface33Array3234;
	for (int i = 0; i < interface33s.length; i++) {
	    Interface33 interface33 = interface33s[i];
	    if (null != interface33)
		interface33.method212(bool || aBool3236, (byte) -127);
	}
	aBool3236 = false;
    }
    
    Class293(Class87 class87, int i, int i_7_, Class315 class315) {
	aClass87_3233 = class87;
	anInt3235 = i * 992009311;
	anInt3231 = i_7_ * 475846859;
	anInterface33Array3234
	    = new Interface33[aClass87_3233.anInterface45Array891.length];
	for (int i_8_ = 0; i_8_ < anInterface33Array3234.length; i_8_++)
	    anInterface33Array3234[i_8_]
		= class315.method5655((aClass87_3233.anInterface45Array891
				       [i_8_]),
				      1712066094);
    }
    
    public int method201() {
	return 1535036643 * anInt3231;
    }
    
    static void method5297() {
	aClass200_3232.method3791((byte) -8);
    }
    
    static void method5298() {
	aClass200_3232.method3791((byte) -20);
    }
    
    static void method5299() {
	aClass200_3232.method3791((byte) -78);
    }
    
    public void method199(boolean bool) {
	bool = true;
	Interface33[] interface33s = anInterface33Array3234;
	for (int i = 0; i < interface33s.length; i++) {
	    Interface33 interface33 = interface33s[i];
	    if (null != interface33)
		interface33.method212(bool || aBool3236, (byte) -59);
	}
	aBool3236 = false;
    }
    
    public void method192() {
	/* empty */
    }
    
    public void method191(boolean bool) {
	bool = true;
	Interface33[] interface33s = anInterface33Array3234;
	for (int i = 0; i < interface33s.length; i++) {
	    Interface33 interface33 = interface33s[i];
	    if (null != interface33)
		interface33.method212(bool || aBool3236, (byte) -65);
	}
	aBool3236 = false;
    }
    
    public void method188(int i) {
	/* empty */
    }
    
    public int method204() {
	return 1535036643 * anInt3231;
    }
    
    public void method186(boolean bool) {
	bool = true;
	Interface33[] interface33s = anInterface33Array3234;
	for (int i = 0; i < interface33s.length; i++) {
	    Interface33 interface33 = interface33s[i];
	    if (null != interface33)
		interface33.method212(bool || aBool3236, (byte) -76);
	}
	aBool3236 = false;
    }
    
    static boolean method5300() {
	boolean bool;
	try {
	    Class74 class74 = new Class74();
	    byte[] is = class74.method1544(aByteArray3238, (byte) 1);
	    Class225.method4249(is, 294776821);
	    bool = true;
	} catch (Exception exception) {
	    return false;
	}
	return bool;
    }
    
    static Class157 method5301(byte[] is) {
	if (is == null)
	    throw new RuntimeException("");
	Class157 class157;
	for (;;) {
	    try {
		Image image = Toolkit.getDefaultToolkit().createImage(is);
		java.awt.Container container = Class203.method3854(1955349051);
		MediaTracker mediatracker = new MediaTracker(container);
		mediatracker.addImage(image, 0);
		mediatracker.waitForAll();
		int i = image.getWidth(container);
		int i_9_ = image.getHeight(container);
		if (mediatracker.isErrorAny() || i < 0 || i_9_ < 0)
		    throw new RuntimeException("");
		int[] is_10_ = new int[i_9_ * i];
		PixelGrabber pixelgrabber
		    = new PixelGrabber(image, 0, 0, i, i_9_, is_10_, 0, i);
		pixelgrabber.grabPixels();
		class157 = Class501.aClass182_5564.method3215(is_10_, 0, i, i,
							      i_9_, (byte) 61);
		break;
	    } catch (InterruptedException interruptedexception) {
		/* empty */
	    }
	}
	return class157;
    }
    
    static Class157 method5302(byte[] is) {
	if (is == null)
	    throw new RuntimeException("");
	Class157 class157;
	for (;;) {
	    try {
		Image image = Toolkit.getDefaultToolkit().createImage(is);
		java.awt.Container container = Class203.method3854(1955349051);
		MediaTracker mediatracker = new MediaTracker(container);
		mediatracker.addImage(image, 0);
		mediatracker.waitForAll();
		int i = image.getWidth(container);
		int i_11_ = image.getHeight(container);
		if (mediatracker.isErrorAny() || i < 0 || i_11_ < 0)
		    throw new RuntimeException("");
		int[] is_12_ = new int[i_11_ * i];
		PixelGrabber pixelgrabber
		    = new PixelGrabber(image, 0, 0, i, i_11_, is_12_, 0, i);
		pixelgrabber.grabPixels();
		class157
		    = Class501.aClass182_5564.method3215(is_12_, 0, i, i,
							 i_11_, (byte) 17);
		break;
	    } catch (InterruptedException interruptedexception) {
		/* empty */
	    }
	}
	return class157;
    }
    
    public static Class567 method5303(boolean bool, short i) {
	synchronized (Class567.aStack7607) {
	    Class567 class567;
	    if (Class567.aStack7607.isEmpty())
		class567 = new Class567();
	    else
		class567 = (Class567) Class567.aStack7607.pop();
	    class567.aBool7608 = bool;
	    Class567 class567_13_ = class567;
	    return class567_13_;
	}
    }
    
    static final void method5304(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class101.method1883(class259, class245, class683, (byte) 1);
    }
    
    static final void method5305(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class470.method7732((byte) -86).method80();
    }
    
    public static Class7 method5306(Class458 class458, int i,
				    Interface4 interface4, int i_14_) {
	byte[] is = class458.method7484(i, 1694587278);
	if (null == is)
	    return null;
	return new Class7(is, interface4);
    }
    
    static byte[] method5307(Class458 class458, Class663 class663, int i,
			     short i_15_) {
	if (class663.method10957(1891139730) > 1)
	    return class458.method7476(class663.method10963(i, -80888470),
				       class663.method10958(i, (byte) -4),
				       279044981);
	return class458.method7476(class663.anInt8553 * -1918643565, i,
				   913833361);
    }
    
    static final void method5308(Class683 class683, int i) {
	int i_16_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_16_, -695254952);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = class259.anInt2718 * 1440880309;
    }
}
