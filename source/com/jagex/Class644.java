/* Class644 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Desktop;
import java.net.URI;

public class Class644
{
    static Class199 aClass199_8336 = new Class199(128);
    
    static Class525_Sub16_Sub4 method10602(Class578 class578, int i,
					   int i_0_) {
	int i_1_ = class578.anInt7672 * -1909858453 | i << 10;
	Class525_Sub16_Sub4 class525_sub16_sub4
	    = ((Class525_Sub16_Sub4)
	       aClass199_8336.method3769((long) i_1_ << 16));
	if (null != class525_sub16_sub4)
	    return class525_sub16_sub4;
	byte[] is = (Class112.aClass458_1386.method7484
		     (Class112.aClass458_1386.method7557(i_1_, -1329062221),
		      1677560491));
	if (is != null) {
	    if (is.length <= 1)
		return null;
	    try {
		class525_sub16_sub4 = Class483.method7834(is, -1915998114);
	    } catch (Exception exception) {
		throw new RuntimeException(new StringBuilder().append
					       (exception.getMessage()).append
					       (" ").append
					       (i_1_).toString());
	    }
	    class525_sub16_sub4.aClass578_11751 = class578;
	    aClass199_8336.method3775(class525_sub16_sub4, (long) i_1_ << 16);
	    return class525_sub16_sub4;
	}
	i_1_ = -1909858453 * class578.anInt7672 | 65536 + i_0_ << 10;
	class525_sub16_sub4 = ((Class525_Sub16_Sub4)
			       aClass199_8336.method3769((long) i_1_ << 16));
	if (null != class525_sub16_sub4)
	    return class525_sub16_sub4;
	is = (Class112.aClass458_1386.method7484
	      (Class112.aClass458_1386.method7557(i_1_, 470074355),
	       1643903231));
	if (null != is) {
	    if (is.length <= 1)
		return null;
	    try {
		class525_sub16_sub4 = Class483.method7834(is, -1256505878);
	    } catch (Exception exception) {
		throw new RuntimeException(new StringBuilder().append
					       (exception.getMessage()).append
					       (" ").append
					       (i_1_).toString());
	    }
	    class525_sub16_sub4.aClass578_11751 = class578;
	    aClass199_8336.method3775(class525_sub16_sub4, (long) i_1_ << 16);
	    return class525_sub16_sub4;
	}
	i_1_ = -1909858453 * class578.anInt7672 | 0x3fffc00;
	class525_sub16_sub4 = ((Class525_Sub16_Sub4)
			       aClass199_8336.method3769((long) i_1_ << 16));
	if (null != class525_sub16_sub4)
	    return class525_sub16_sub4;
	is = (Class112.aClass458_1386.method7484
	      (Class112.aClass458_1386.method7557(i_1_, -28597998),
	       1433760630));
	if (null != is) {
	    if (is.length <= 1)
		return null;
	    try {
		class525_sub16_sub4 = Class483.method7834(is, -997029019);
	    } catch (Exception exception) {
		throw new RuntimeException(new StringBuilder().append
					       (exception.getMessage()).append
					       (" ").append
					       (i_1_).toString());
	    }
	    class525_sub16_sub4.aClass578_11751 = class578;
	    aClass199_8336.method3775(class525_sub16_sub4, (long) i_1_ << 16);
	    return class525_sub16_sub4;
	}
	return null;
    }
    
    public static void method10603() {
	aClass199_8336.method3772(-448393074);
    }
    
    Class644() throws Throwable {
	throw new Error();
    }
    
    static Class525_Sub16_Sub4 method10604(int i) {
	Class525_Sub16_Sub4 class525_sub16_sub4
	    = (Class525_Sub16_Sub4) aClass199_8336.method3769((long) i);
	if (class525_sub16_sub4 != null)
	    return class525_sub16_sub4;
	byte[] is = Class112.aClass458_1386.method7476(i, 0, 1702690462);
	if (null == is || is.length <= 1)
	    return null;
	try {
	    class525_sub16_sub4 = Class483.method7834(is, -1633623509);
	} catch (Exception exception) {
	    throw new RuntimeException(new StringBuilder().append
					   (exception.getMessage()).append
					   (" ").append
					   (i).toString());
	}
	aClass199_8336.method3775(class525_sub16_sub4, (long) i);
	return class525_sub16_sub4;
    }
    
    public static void method10605() {
	aClass199_8336.method3772(-573551402);
    }
    
    public static void method10606() {
	aClass199_8336.method3772(1260343554);
    }
    
    public static void method10607() {
	aClass199_8336.method3772(-1366071887);
    }
    
    public static void method10608() {
	aClass199_8336.method3772(-2113276769);
    }
    
    static Class525_Sub16_Sub4 method10609(int i) {
	Class525_Sub16_Sub4 class525_sub16_sub4
	    = (Class525_Sub16_Sub4) aClass199_8336.method3769((long) i);
	if (class525_sub16_sub4 != null)
	    return class525_sub16_sub4;
	byte[] is = Class112.aClass458_1386.method7476(i, 0, 2085790445);
	if (null == is || is.length <= 1)
	    return null;
	try {
	    class525_sub16_sub4 = Class483.method7834(is, -1639636274);
	} catch (Exception exception) {
	    throw new RuntimeException(new StringBuilder().append
					   (exception.getMessage()).append
					   (" ").append
					   (i).toString());
	}
	aClass199_8336.method3775(class525_sub16_sub4, (long) i);
	return class525_sub16_sub4;
    }
    
    static Class525_Sub16_Sub4 method10610(byte[] is) {
	return new Class525_Sub16_Sub4(new RSBuffer(is),
				       Class607.anInterface20_7975);
    }
    
    static Class525_Sub16_Sub4 method10611(byte[] is) {
	return new Class525_Sub16_Sub4(new RSBuffer(is),
				       Class607.anInterface20_7975);
    }
    
    static Class525_Sub16_Sub4 method10612(byte[] is) {
	return new Class525_Sub16_Sub4(new RSBuffer(is),
				       Class607.anInterface20_7975);
    }
    
    static final void method10613(Class683 class683, int i) {
	Class603_Sub1 class603_sub1 = Class558.method9373((byte) 1);
	if (class603_sub1 != null) {
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= class603_sub1.anInt10883 * -1721515947;
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= class603_sub1.anInt7951 * 36102555;
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= class603_sub1.aString10881;
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= class603_sub1.method16997(-1841268526);
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= class603_sub1.method16995((byte) 115);
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= 1234139243 * class603_sub1.anInt7953;
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= 1803394105 * class603_sub1.anInt10882;
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= class603_sub1.aString10880;
	} else {
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= -1;
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= 0;
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= "";
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= 0;
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= "";
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= 0;
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= 0;
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= "";
	}
    }
    
    public static void method10614(String string, boolean bool,
				   String string_2_, boolean bool_3_, int i) {
	if (bool) {
	    do {
		if (!bool_3_ && Desktop.isDesktopSupported()
		    && Desktop.getDesktop()
			   .isSupported(Desktop.Action.BROWSE)) {
		    try {
			Desktop.getDesktop().browse(new URI(string));
		    } catch (Exception exception) {
			break;
		    }
		    return;
		}
	    } while (false);
	    if (Class513.aString5692.startsWith("win") && !bool_3_)
		Class313.method5644(string, 0, -1583526322);
	    else if (Class513.aString5692.startsWith("mac"))
		Class413.method6685(string, 1, string_2_, (byte) 126);
	    else
		Class313.method5644(string, 2, -1696868002);
	} else
	    Class313.method5644(string, 3, -1588853095);
    }
    
    static final int method10615(int i, int i_4_) {
	if (i < 4)
	    return 0;
	if (i < 10)
	    return i - 3;
	return i - 6;
    }
    
    static final void method10616(Class683 class683, byte i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class539.method8889(class259, class245, class683, 577400626);
    }
    
    public static void method10617(int i, int i_5_) {
	int i_6_ = client.aList11395.indexOf(Integer.valueOf(i));
	if (i_6_ == -1)
	    client.aList11395.add(Integer.valueOf(i));
    }
    
    static final void method10618(Class683 class683, byte i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = -936808459 * Class597.anInt7846;
    }
    
    public static void method10619(Class163 class163, int i) {
	Class525_Sub16_Sub10 class525_sub16_sub10
	    = Class465.method7671(2, (long) (class163.anInt1766 * 248546353));
	class525_sub16_sub10.method18350((byte) 100);
    }
}
