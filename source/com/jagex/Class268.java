/* Class268 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.IOException;
import java.util.Date;

public class Class268
{
    static Class279 aClass279_2817;
    
    public static void method4951(Class279 class279) {
	aClass279_2817 = class279;
    }
    
    public static int method4952(RSBuffer class525_sub38,
								 String string) {
	int i = class525_sub38.index * -1133521593;
	byte[] is = Class225.method4255(string, 447768767);
	class525_sub38.method16829(is.length, 718494585);
	class525_sub38.index
	    += aClass279_2817.method5150(is, 0, is.length,
					 class525_sub38.buffer,
					 (class525_sub38.index
					  * -1133521593),
					 1155273639) * 339428471;
	return class525_sub38.index * -1133521593 - i;
    }
    
    Class268() throws Throwable {
	throw new Error();
    }
    
    public static int method4953(RSBuffer class525_sub38,
								 String string) {
	int i = class525_sub38.index * -1133521593;
	byte[] is = Class225.method4255(string, -750942263);
	class525_sub38.method16829(is.length, 2012873248);
	class525_sub38.index
	    += aClass279_2817.method5150(is, 0, is.length,
					 class525_sub38.buffer,
					 (class525_sub38.index
					  * -1133521593),
					 2101115258) * 339428471;
	return class525_sub38.index * -1133521593 - i;
    }
    
    public static String method4954(RSBuffer class525_sub38) {
	return Class219.method4199(class525_sub38, 32767, 836141235);
    }
    
    public static String method4955(RSBuffer class525_sub38) {
	return Class219.method4199(class525_sub38, 32767, -205601526);
    }
    
    static String method4956(RSBuffer class525_sub38, int i) {
	String string;
	try {
	    int i_0_ = class525_sub38.readUnsignedSmart((byte) -78);
	    if (i_0_ > i)
		i_0_ = i;
	    byte[] is = new byte[i_0_];
	    class525_sub38.index
		+= (aClass279_2817.method5149(class525_sub38.buffer,
					      (class525_sub38.index
					       * -1133521593),
					      is, 0, i_0_, -1192771669)
		    * 339428471);
	    String string_1_ = Class392.method6482(is, 0, i_0_, 1985428650);
	    string = string_1_;
	} catch (Exception exception) {
	    return "Cabbage";
	}
	return string;
    }
    
    public static void method4957(int i) {
	if (Class159.aClass295_1755 != null)
	    Class159.aClass295_1755.method5346((byte) 1);
	if (Class328.aThread3581 != null) {
	    for (;;) {
		try {
		    Class328.aThread3581.join();
		    break;
		} catch (InterruptedException interruptedexception) {
		    /* empty */
		}
	    }
	}
    }
    
    public static int method4958(int i) {
	Class71_Sub1 class71_sub1 = Class665.method11000((byte) -55);
	Class107.method1926(class71_sub1, 2035064610);
	return class71_sub1.method1523((byte) 0);
    }
    
    static final void method4959(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = -1866158997 * Class70.anInt785;
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = 940596433 * Class70.anInt788;
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = -1603191745 * Class70.anInt786;
	Class70.anInt785 = 2036776826;
	Class70.anInt788 = 1348895695;
	Class70.anInt786 = 1734560833;
    }
    
    public static final void method4960(byte i) {
	client.aBool11284 = true;
    }
    
    public static void method4961(String string, int i) {
	if (null == Class116.aStringArray1411)
	    Class206.method3899((short) 14872);
	client.aCalendar11116.setTime(new Date(Class251.method4508((byte) 8)));
	int i_2_ = client.aCalendar11116.get(11);
	int i_3_ = client.aCalendar11116.get(12);
	int i_4_ = client.aCalendar11116.get(13);
	String string_5_
	    = new StringBuilder().append(Integer.toString(i_2_ / 10)).append
		  (i_2_ % 10).append
		  (":").append
		  (i_3_ / 10).append
		  (i_3_ % 10).append
		  (":").append
		  (i_4_ / 10).append
		  (i_4_ % 10).toString();
	String[] strings = Class481.method7829(string, '\n', 357905683);
	for (int i_6_ = 0; i_6_ < strings.length; i_6_++) {
	    for (int i_7_ = -592886281 * Class116.anInt1412; i_7_ > 0; i_7_--)
		Class116.aStringArray1411[i_7_]
		    = Class116.aStringArray1411[i_7_ - 1];
	    Class116.aStringArray1411[0]
		= new StringBuilder().append(string_5_).append(": ").append
		      (strings[i_6_]).toString();
	    if (Class525_Sub7_Sub11.aFileOutputStream11721 != null) {
		try {
		    Class525_Sub7_Sub11.aFileOutputStream11721.write
			(Class225.method4255(new StringBuilder().append
						 (Class116.aStringArray1411[0])
						 .append
						 ("\n").toString(),
					     -690066147));
		} catch (IOException ioexception) {
		    /* empty */
		}
	    }
	    if (-592886281 * Class116.anInt1412
		< Class116.aStringArray1411.length - 1) {
		Class116.anInt1412 += -1298199609;
		if (Class116.anInt1413 * 545098001 > 0)
		    Class116.anInt1413 += 501909489;
	    }
	}
    }
}
