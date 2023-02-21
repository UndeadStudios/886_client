/* Class225 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

public class Class225 implements Interface28
{
    Class221 this$0;
    int anInt2341;
    
    public void method164(Class228 class228) {
	Class218 class218
	    = class228.method4275(716462079 * anInt2341, -566356751);
	class218.method4163(573778543);
	class218.method4189(-607882009);
	class228.method4279(anInt2341 * 716462079, (short) 24470);
    }
    
    public void method163(Class228 class228, int i) {
	Class218 class218
	    = class228.method4275(716462079 * anInt2341, 1960431368);
	class218.method4163(-166370654);
	class218.method4189(-198489871);
	class228.method4279(anInt2341 * 716462079, (short) 29792);
    }
    
    public void method161(Class228 class228) {
	Class218 class218
	    = class228.method4275(716462079 * anInt2341, -702346009);
	class218.method4163(-797093693);
	class218.method4189(-1258539355);
	class228.method4279(anInt2341 * 716462079, (short) 12687);
    }
    
    public void method162(Class228 class228) {
	Class218 class218
	    = class228.method4275(716462079 * anInt2341, -74575660);
	class218.method4163(-511314155);
	class218.method4189(-814025188);
	class228.method4279(anInt2341 * 716462079, (short) 27308);
    }
    
    public void method160(Class228 class228) {
	Class218 class218
	    = class228.method4275(716462079 * anInt2341, -338758027);
	class218.method4163(-1638898764);
	class218.method4189(-1782210256);
	class228.method4279(anInt2341 * 716462079, (short) 10539);
    }
    
    public void method165(Class228 class228) {
	Class218 class218
	    = class228.method4275(716462079 * anInt2341, -664055312);
	class218.method4163(-2072757451);
	class218.method4189(-865081652);
	class228.method4279(anInt2341 * 716462079, (short) 26879);
    }
    
    Class225(Class221 class221, RSBuffer class525_sub38) {
	this$0 = class221;
	anInt2341 = class525_sub38.readUnsignedShort((byte) 34) * -150231041;
    }
    
    static Class157 method4249(byte[] is, int i) {
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
		int i_0_ = image.getWidth(container);
		int i_1_ = image.getHeight(container);
		if (mediatracker.isErrorAny() || i_0_ < 0 || i_1_ < 0)
		    throw new RuntimeException("");
		int[] is_2_ = new int[i_1_ * i_0_];
		PixelGrabber pixelgrabber
		    = new PixelGrabber(image, 0, 0, i_0_, i_1_, is_2_, 0,
				       i_0_);
		pixelgrabber.grabPixels();
		class157
		    = Class501.aClass182_5564.method3215(is_2_, 0, i_0_, i_0_,
							 i_1_, (byte) 50);
		break;
	    } catch (InterruptedException interruptedexception) {
		/* empty */
	    }
	}
	return class157;
    }
    
    static Class590[] method4250(int i) {
	return (new Class590[]
		{ Class590.aClass590_7811, Class590.aClass590_7812 });
    }
    
    public static void method4251(int i) {
	if ((1777895575 * client.anInt11075 == 7
	     || client.anInt11075 * 1777895575 == 4)
	    && client.aClass96_11085 != null) {
	    for (;;) {
		Interface68 interface68
		    = (Interface68) Class577.aLinkedList7649.poll();
		if (null == interface68)
		    break;
		interface68.method211(-1510610711);
	    }
	}
    }
    
    static void method4252(Class525_Sub38_Sub2 class525_sub38_sub2, int i) {
	boolean bool = class525_sub38_sub2.readUnsignedByte(168921310) == 1;
	if (bool) {
	    boolean bool_3_ = false;
	    int i_4_ = class525_sub38_sub2.method18508(886883882) << 24;
	    i_4_ |= class525_sub38_sub2.method18508(886883882) << 16;
	    i_4_ |= class525_sub38_sub2.method18508(886883882) << 8;
	    i_4_ |= class525_sub38_sub2.method18508(886883882);
	    Class424.aClass52_4742.method1143((Class696_Sub20.aLong10929
					       * 450182445811707867L),
					      i_4_, (byte) 73);
	}
    }
    
    static final void method4253(Class683 class683, byte i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class27.method902(class259, class245, class683, -1887940752);
    }
    
    static void method4254(int i, int i_5_, byte i_6_) {
	Class525_Sub16_Sub10 class525_sub16_sub10
	    = Class465.method7671(6, (long) i);
	class525_sub16_sub10.method18361((byte) 41);
	class525_sub16_sub10.anInt11817 = i_5_ * -1179952119;
    }
    
    public static byte[] method4255(CharSequence charsequence, int i) {
	int i_7_ = charsequence.length();
	byte[] is = new byte[i_7_];
	for (int i_8_ = 0; i_8_ < i_7_; i_8_++) {
	    char c = charsequence.charAt(i_8_);
	    if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
		is[i_8_] = (byte) c;
	    else if (c == '\u20ac')
		is[i_8_] = (byte) -128;
	    else if ('\u201a' == c)
		is[i_8_] = (byte) -126;
	    else if ('\u0192' == c)
		is[i_8_] = (byte) -125;
	    else if ('\u201e' == c)
		is[i_8_] = (byte) -124;
	    else if (c == '\u2026')
		is[i_8_] = (byte) -123;
	    else if ('\u2020' == c)
		is[i_8_] = (byte) -122;
	    else if ('\u2021' == c)
		is[i_8_] = (byte) -121;
	    else if (c == '\u02c6')
		is[i_8_] = (byte) -120;
	    else if ('\u2030' == c)
		is[i_8_] = (byte) -119;
	    else if ('\u0160' == c)
		is[i_8_] = (byte) -118;
	    else if (c == '\u2039')
		is[i_8_] = (byte) -117;
	    else if ('\u0152' == c)
		is[i_8_] = (byte) -116;
	    else if ('\u017d' == c)
		is[i_8_] = (byte) -114;
	    else if ('\u2018' == c)
		is[i_8_] = (byte) -111;
	    else if (c == '\u2019')
		is[i_8_] = (byte) -110;
	    else if ('\u201c' == c)
		is[i_8_] = (byte) -109;
	    else if ('\u201d' == c)
		is[i_8_] = (byte) -108;
	    else if (c == '\u2022')
		is[i_8_] = (byte) -107;
	    else if (c == '\u2013')
		is[i_8_] = (byte) -106;
	    else if (c == '\u2014')
		is[i_8_] = (byte) -105;
	    else if (c == '\u02dc')
		is[i_8_] = (byte) -104;
	    else if ('\u2122' == c)
		is[i_8_] = (byte) -103;
	    else if (c == '\u0161')
		is[i_8_] = (byte) -102;
	    else if (c == '\u203a')
		is[i_8_] = (byte) -101;
	    else if ('\u0153' == c)
		is[i_8_] = (byte) -100;
	    else if ('\u017e' == c)
		is[i_8_] = (byte) -98;
	    else if (c == '\u0178')
		is[i_8_] = (byte) -97;
	    else
		is[i_8_] = (byte) 63;
	}
	return is;
    }
}
