/* Class117 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.IOException;

public class Class117
{
    static final int anInt1423 = 10000;
    static final int anInt1424 = 100000;
    static final int anInt1425 = 50000;
    static final float aFloat1426 = 1.3F;
    public static boolean aBool1427 = false;
    static final int anInt1428 = 500;
    static final int anInt1429 = 1000;
    static final long aLong1430 = 64425238954L;
    static final int anInt1431 = 102;
    static final long aLong1432 = 60129613779L;
    public static boolean aBool1433 = false;
    static boolean aBool1434 = false;
    
    public static void method2066() {
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub6_10692, 1,
	     (byte) -45);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub6_10675, 1,
	     (byte) -56);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub11_10688, 1,
	     (byte) -44);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub24_10687, 1,
	     (byte) -55);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub21_10689, 0,
	     (byte) -70);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub5_10685, 0,
	     (byte) -120);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub17_10676, 0,
	     (byte) -19);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub15_10715, 0,
	     (byte) -77);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub4_10728, 0,
	     (byte) -25);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub9_10691, 0,
	     (byte) -16);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub12_10698, 0,
	     (byte) -63);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub8_10671, 0,
	     (byte) -104);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub39_10677, 0,
	     (byte) -41);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub39_10678, 0,
	     (byte) -87);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub2_10694, 0,
	     (byte) -95);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub26_10682,
	     -691210721 * Class290.aClass290_3216.anInt3213, (byte) -118);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub37_10680, 0,
	     (byte) -27);
	if (null != Class501.aClass182_5564
	    && Class501.aClass182_5564.method3142()
	    && Class501.aClass182_5564.method3284())
	    Class501.aClass182_5564.method3301();
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub42_10717, 0,
	     (byte) -87);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub36_10699, 0,
	     (byte) -73);
	Class237.method4414(-1035119349);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub30_10696, 2,
	     (byte) -128);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub23_10719, 2,
	     (byte) -70);
	Class424.method6769(-1852050786);
	client.aClass507_11137.method8361((byte) 60).method10398(203858348);
	client.aBool11095 = true;
    }
    
    static Class525_Sub30 method2067() {
	Class42 class42 = null;
	Class525_Sub30 class525_sub30
	    = new Class525_Sub30(client.gametype, 0);
	try {
	    class42
		= Class182.method3594("", client.gametype.aString8579,
				      false, 1059948327);
	    byte[] is = new byte[(int) class42.method1048(-2142881237)];
	    int i;
	    for (int i_0_ = 0; i_0_ < is.length; i_0_ += i) {
		i = class42.method1049(is, i_0_, is.length - i_0_, (byte) 76);
		if (i == -1)
		    throw new IOException();
	    }
	    class525_sub30 = new Class525_Sub30(new RSBuffer(is),
						client.gametype, 0);
	} catch (Exception exception) {
	    /* empty */
	}
	try {
	    if (null != class42)
		class42.method1047(533140905);
	} catch (Exception exception) {
	    /* empty */
	}
	return class525_sub30;
    }
    
    static Class525_Sub30 method2068() {
	Class42 class42 = null;
	Class525_Sub30 class525_sub30
	    = new Class525_Sub30(client.gametype, 0);
	try {
	    class42
		= Class182.method3594("", client.gametype.aString8579,
				      false, -2104357155);
	    byte[] is = new byte[(int) class42.method1048(-2054121786)];
	    int i;
	    for (int i_1_ = 0; i_1_ < is.length; i_1_ += i) {
		i = class42.method1049(is, i_1_, is.length - i_1_, (byte) 101);
		if (i == -1)
		    throw new IOException();
	    }
	    class525_sub30 = new Class525_Sub30(new RSBuffer(is),
						client.gametype, 0);
	} catch (Exception exception) {
	    /* empty */
	}
	try {
	    if (null != class42)
		class42.method1047(-1763089976);
	} catch (Exception exception) {
	    /* empty */
	}
	return class525_sub30;
    }
    
    static Class525_Sub30 method2069() {
	Class42 class42 = null;
	Class525_Sub30 class525_sub30
	    = new Class525_Sub30(client.gametype, 0);
	try {
	    class42
		= Class182.method3594("", client.gametype.aString8579,
				      false, -854979596);
	    byte[] is = new byte[(int) class42.method1048(-1815395818)];
	    int i;
	    for (int i_2_ = 0; i_2_ < is.length; i_2_ += i) {
		i = class42.method1049(is, i_2_, is.length - i_2_, (byte) 18);
		if (i == -1)
		    throw new IOException();
	    }
	    class525_sub30 = new Class525_Sub30(new RSBuffer(is),
						client.gametype, 0);
	} catch (Exception exception) {
	    /* empty */
	}
	try {
	    if (null != class42)
		class42.method1047(-901911957);
	} catch (Exception exception) {
	    /* empty */
	}
	return class525_sub30;
    }
    
    public static void method2070() {
	Class42 class42 = null;
	try {
	    class42
		= Class182.method3594("", client.gametype.aString8579,
				      true, 2077231694);
	    RSBuffer class525_sub38
		= Class198_Sub13.aClass525_Sub30_9973.method16501(-378202877);
	    class42.method1051(class525_sub38.buffer, 0,
			       class525_sub38.index * -1133521593,
			       2100613474);
	} catch (Exception exception) {
	    /* empty */
	}
	try {
	    if (class42 != null)
		class42.method1047(-121334900);
	} catch (Exception exception) {
	    /* empty */
	}
    }
    
    public static void method2071(boolean bool) {
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub6_10692, 1,
	     (byte) -94);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub6_10675, 1,
	     (byte) -122);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub11_10688, 0,
	     (byte) -55);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub8_10671, 0,
	     (byte) -9);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub24_10687, 0,
	     (byte) -64);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub21_10689, 0,
	     (byte) -92);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub5_10685, 0,
	     (byte) -96);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub17_10676, 0,
	     (byte) -47);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub15_10715, 0,
	     (byte) -79);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub4_10728, 0,
	     (byte) -85);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub9_10691, 0,
	     (byte) -7);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub12_10698, 0,
	     (byte) -70);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub39_10677, 0,
	     (byte) -85);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub39_10678, 0,
	     (byte) -63);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub2_10694, 0,
	     (byte) -125);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub26_10682,
	     Class290.aClass290_3216.anInt3213 * -691210721, (byte) -66);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub37_10680, 0,
	     (byte) -114);
	if (null != Class501.aClass182_5564
	    && Class501.aClass182_5564.method3142()
	    && Class501.aClass182_5564.method3284())
	    Class501.aClass182_5564.method3301();
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub42_10717, 0,
	     (byte) -46);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub36_10699, 0,
	     (byte) -77);
	Class237.method4414(612508424);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub30_10696, 2,
	     (byte) -30);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub23_10719, 1,
	     (byte) -57);
	Class424.method6769(-1852050786);
	client.aClass507_11137.method8361((byte) 114).method10398(-208928045);
	client.aBool11095 = true;
    }
    
    public static void method2072() {
	Class42 class42 = null;
	try {
	    class42
		= Class182.method3594("", client.gametype.aString8579,
				      true, 1667581202);
	    RSBuffer class525_sub38
		= Class198_Sub13.aClass525_Sub30_9973.method16501(-1141932105);
	    class42.method1051(class525_sub38.buffer, 0,
			       class525_sub38.index * -1133521593,
			       1546459663);
	} catch (Exception exception) {
	    /* empty */
	}
	try {
	    if (class42 != null)
		class42.method1047(1357270469);
	} catch (Exception exception) {
	    /* empty */
	}
    }
    
    public static void method2073() {
	Class42 class42 = null;
	try {
	    class42
		= Class182.method3594("", client.gametype.aString8579,
				      true, -1864028653);
	    RSBuffer class525_sub38
		= Class198_Sub13.aClass525_Sub30_9973.method16501(-342696091);
	    class42.method1051(class525_sub38.buffer, 0,
			       class525_sub38.index * -1133521593,
			       -1491564229);
	} catch (Exception exception) {
	    /* empty */
	}
	try {
	    if (class42 != null)
		class42.method1047(131589101);
	} catch (Exception exception) {
	    /* empty */
	}
    }
    
    public static void method2074() {
	Class42 class42 = null;
	try {
	    class42
		= Class182.method3594("", client.gametype.aString8579,
				      true, -184798328);
	    RSBuffer class525_sub38
		= Class198_Sub13.aClass525_Sub30_9973.method16501(-1392321955);
	    class42.method1051(class525_sub38.buffer, 0,
			       class525_sub38.index * -1133521593,
			       -2038411927);
	} catch (Exception exception) {
	    /* empty */
	}
	try {
	    if (class42 != null)
		class42.method1047(-1422632169);
	} catch (Exception exception) {
	    /* empty */
	}
    }
    
    public static int method2075() {
	Class71_Sub1 class71_sub1 = Class665.method11000((byte) 49);
	Class107.method1926(class71_sub1, 222413536);
	return class71_sub1.method1523((byte) 0);
    }
    
    static Class71_Sub1 method2076() {
	Class71_Sub1 class71_sub1 = new Class71_Sub1();
	boolean bool = false;
	boolean bool_3_ = false;
	boolean bool_4_ = false;
	if (Class396.aString4106.startsWith("win")) {
	    bool_3_ = true;
	    bool = true;
	    bool_4_ = true;
	} else {
	    bool = true;
	    bool_4_ = true;
	}
	if (aBool1427) {
	    class71_sub1.method16368(16, -1699543526);
	    bool = false;
	}
	if (aBool1433) {
	    class71_sub1.method16368(32, -1625934212);
	    bool_3_ = false;
	}
	if (aBool1434) {
	    class71_sub1.method16368(16384, -939639635);
	    bool_4_ = false;
	}
	if (!bool && !bool_3_) {
	    Class34.method958(class71_sub1, -1857244951);
	    return class71_sub1;
	}
	int i = -1;
	int i_5_ = -1;
	int i_6_ = -1;
	if (bool_3_) {
	    try {
		Class198_Sub13.aClass525_Sub30_9973.method16502
		    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub29_10722,
		     3, (byte) -38);
		Class650.method10715(-1758466106);
		i_5_ = Class206.method3905(3, 1000, -360169952);
		if (Class198_Sub13.aClass525_Sub30_9973
			.aClass696_Sub20_10708.method17160(481700652)
		    == 3) {
		    class71_sub1.method16368(4, 334954592);
		    Class170 class170 = Class501.aClass182_5564.method3130();
		    long l = (4822213046138725271L * class170.aLong1854
			      & 0xffffffffffffL);
		    switch (class170.anInt1850 * -1809895579) {
		    case 4318: {
			boolean bool_7_ = l >= 64425238954L;
			bool &= bool_7_;
			if (!bool_7_)
			    class71_sub1.method16368(256, -2028709630);
			break;
		    }
		    case 4098: {
			boolean bool_8_ = l >= 60129613779L;
			bool &= bool_8_;
			if (!bool_8_)
			    class71_sub1.method16368(512, 1945536943);
			break;
		    }
		    }
		}
	    } catch (Exception exception) {
		class71_sub1.method16368(4096, -1540818747);
	    }
	}
	if (bool_4_) {
	    try {
		Class198_Sub13.aClass525_Sub30_9973.method16502
		    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub29_10722,
		     5, (byte) -13);
		Class650.method10715(-1758466106);
		i_6_ = Class206.method3905(5, 1000, 316953589);
		if (Class198_Sub13.aClass525_Sub30_9973
			.aClass696_Sub20_10708.method17160(-948647197)
		    == 5)
		    class71_sub1.method16368(8192, 173481773);
	    } catch (Exception exception) {
		class71_sub1.method16368(32768, -821340051);
	    }
	}
	if (bool) {
	    try {
		Class198_Sub13.aClass525_Sub30_9973.method16502
		    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub29_10722,
		     4, (byte) -119);
		Class650.method10715(-1758466106);
		i = Class206.method3905(1, 1000, -772850926);
		if (Class198_Sub13.aClass525_Sub30_9973
			.aClass696_Sub20_10708.method17160(-391360626)
		    == 1)
		    class71_sub1.method16368(2, 1111699895);
	    } catch (Exception exception) {
		class71_sub1.method16368(2048, 722096908);
	    }
	}
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub29_10722, 0,
	     (byte) -2);
	if (-1 == i && i_5_ == -1) {
	    Class34.method958(class71_sub1, -1620425687);
	    return class71_sub1;
	}
	class71_sub1.method16366(3, i_5_, (byte) 33);
	class71_sub1.method16366(1, i, (byte) 30);
	class71_sub1.method16366(5, i_6_, (byte) -14);
	i_5_ *= 1.3F;
	if (i_5_ > 100000 && i > 100000 || i_5_ > i)
	    Class198_Sub15.method15654(class71_sub1, 3, -1 == i ? i_5_ : i,
				       (byte) 0);
	else
	    Class198_Sub15.method15654(class71_sub1, 1, -1 == i_5_ ? i : i_5_,
				       (byte) 0);
	return class71_sub1;
    }
    
    public static void method2077() {
	Class42 class42 = null;
	try {
	    class42
		= Class182.method3594("", client.gametype.aString8579,
				      true, -630762249);
	    RSBuffer class525_sub38
		= Class198_Sub13.aClass525_Sub30_9973.method16501(-585014608);
	    class42.method1051(class525_sub38.buffer, 0,
			       class525_sub38.index * -1133521593,
			       443128745);
	} catch (Exception exception) {
	    /* empty */
	}
	try {
	    if (class42 != null)
		class42.method1047(1602865167);
	} catch (Exception exception) {
	    /* empty */
	}
    }
    
    static void method2078(Class71_Sub1 class71_sub1) {
	class71_sub1.method16371(0, 1573892927);
	int i;
	if (-855455283 * Class503.anInt5590 >= 96) {
	    int i_9_ = Class422.method6758(876280537);
	    if (i_9_ <= 102) {
		Class101.method1882((short) -216);
		i = 4;
	    } else if (i_9_ <= 500) {
		Class654.method10801(1387753428);
		i = 3;
	    } else if (i_9_ <= 1000) {
		Class36.method978((byte) -9);
		i = 2;
	    } else {
		Class473.method7754(true, -1335910809);
		i = 1;
	    }
	    class71_sub1.method16366(0, i_9_, (byte) -62);
	} else {
	    Class473.method7754(true, -1335910809);
	    i = 1;
	    class71_sub1.method16368(64, 140578168);
	}
	if (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub20_10708
		.method17160(-188383354)
	    != 0) {
	    Class198_Sub13.aClass525_Sub30_9973.method16502
		(Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub20_10701, 0,
		 (byte) -116);
	    Class217.method4146(0, false, (byte) 31);
	} else
	    Class198_Sub13.aClass525_Sub30_9973.method16503
		(Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub20_10708,
		 true, (byte) -84);
	Class650.method10715(-1758466106);
	class71_sub1.method16367(i, (byte) 44);
    }
    
    static void method2079(Class71_Sub1 class71_sub1) {
	class71_sub1.method16371(0, 380095560);
	int i;
	if (-855455283 * Class503.anInt5590 >= 96) {
	    int i_10_ = Class422.method6758(1760444482);
	    if (i_10_ <= 102) {
		Class101.method1882((short) -31261);
		i = 4;
	    } else if (i_10_ <= 500) {
		Class654.method10801(1853927224);
		i = 3;
	    } else if (i_10_ <= 1000) {
		Class36.method978((byte) -33);
		i = 2;
	    } else {
		Class473.method7754(true, -1335910809);
		i = 1;
	    }
	    class71_sub1.method16366(0, i_10_, (byte) 81);
	} else {
	    Class473.method7754(true, -1335910809);
	    i = 1;
	    class71_sub1.method16368(64, 313098314);
	}
	if (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub20_10708
		.method17160(1287134324)
	    != 0) {
	    Class198_Sub13.aClass525_Sub30_9973.method16502
		(Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub20_10701, 0,
		 (byte) -81);
	    Class217.method4146(0, false, (byte) -29);
	} else
	    Class198_Sub13.aClass525_Sub30_9973.method16503
		(Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub20_10708,
		 true, (byte) -12);
	Class650.method10715(-1758466106);
	class71_sub1.method16367(i, (byte) 115);
    }
    
    Class117() throws Throwable {
	throw new Error();
    }
    
    public static void method2080() {
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub6_10692, 2,
	     (byte) -96);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub6_10675, 2,
	     (byte) -112);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub11_10688, 1,
	     (byte) -61);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub24_10687, 1,
	     (byte) -94);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub21_10689, 1,
	     (byte) -57);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub5_10685, 1,
	     (byte) -50);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub17_10676, 1,
	     (byte) -44);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub4_10728, 1,
	     (byte) -22);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub15_10715, 1,
	     (byte) -12);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub9_10691, 1,
	     (byte) -47);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub12_10698, 0,
	     (byte) -49);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub8_10671, 1,
	     (byte) -36);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub39_10677, 0,
	     (byte) -105);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub39_10678, 0,
	     (byte) -120);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub2_10694, 1,
	     (byte) -36);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub26_10682,
	     -691210721 * Class290.aClass290_3216.anInt3213, (byte) -105);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub37_10680, 0,
	     (byte) -88);
	if (null != Class501.aClass182_5564
	    && Class501.aClass182_5564.method3142()
	    && Class501.aClass182_5564.method3284())
	    Class501.aClass182_5564.method3301();
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub42_10717, 1,
	     (byte) -109);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub36_10699, 1,
	     (byte) -36);
	Class237.method4414(-1363690223);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub30_10696, 1,
	     (byte) -102);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub23_10719, 3,
	     (byte) -78);
	Class424.method6769(-1852050786);
	client.aClass507_11137.method8361((byte) 51).method10398(1478619675);
	client.aBool11095 = true;
    }
    
    static void method2081() {
	if (Class503.anInt5598 * 389852961 > 1)
	    Class198_Sub13.aClass525_Sub30_9973.method16502
		(Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub28_10720, 4,
		 (byte) -125);
	else
	    Class198_Sub13.aClass525_Sub30_9973.method16502
		(Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub28_10720, 2,
		 (byte) -92);
    }
    
    public static void method2082() {
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub6_10692, 1,
	     (byte) -51);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub6_10675, 1,
	     (byte) -118);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub11_10688, 1,
	     (byte) -100);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub24_10687, 1,
	     (byte) -77);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub21_10689, 0,
	     (byte) -28);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub5_10685, 0,
	     (byte) -10);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub17_10676, 0,
	     (byte) -45);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub15_10715, 0,
	     (byte) -89);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub4_10728, 0,
	     (byte) -121);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub9_10691, 0,
	     (byte) -125);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub12_10698, 0,
	     (byte) -39);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub8_10671, 0,
	     (byte) -127);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub39_10677, 0,
	     (byte) -56);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub39_10678, 0,
	     (byte) -1);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub2_10694, 0,
	     (byte) -40);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub26_10682,
	     -691210721 * Class290.aClass290_3216.anInt3213, (byte) -13);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub37_10680, 0,
	     (byte) -9);
	if (null != Class501.aClass182_5564
	    && Class501.aClass182_5564.method3142()
	    && Class501.aClass182_5564.method3284())
	    Class501.aClass182_5564.method3301();
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub42_10717, 0,
	     (byte) -50);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub36_10699, 0,
	     (byte) -110);
	Class237.method4414(1158129159);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub30_10696, 2,
	     (byte) -85);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub23_10719, 2,
	     (byte) -59);
	Class424.method6769(-1852050786);
	client.aClass507_11137.method8361((byte) 116).method10398(1772002379);
	client.aBool11095 = true;
    }
    
    public static void method2083() {
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub6_10692, 1,
	     (byte) -37);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub6_10675, 1,
	     (byte) -21);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub11_10688, 1,
	     (byte) -57);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub24_10687, 1,
	     (byte) -122);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub21_10689, 0,
	     (byte) -62);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub5_10685, 0,
	     (byte) -63);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub17_10676, 0,
	     (byte) -28);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub15_10715, 0,
	     (byte) -95);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub4_10728, 0,
	     (byte) -65);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub9_10691, 0,
	     (byte) -107);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub12_10698, 0,
	     (byte) -108);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub8_10671, 0,
	     (byte) -3);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub39_10677, 0,
	     (byte) -91);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub39_10678, 0,
	     (byte) -55);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub2_10694, 0,
	     (byte) -89);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub26_10682,
	     -691210721 * Class290.aClass290_3216.anInt3213, (byte) -50);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub37_10680, 0,
	     (byte) -111);
	if (null != Class501.aClass182_5564
	    && Class501.aClass182_5564.method3142()
	    && Class501.aClass182_5564.method3284())
	    Class501.aClass182_5564.method3301();
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub42_10717, 0,
	     (byte) -116);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub36_10699, 0,
	     (byte) -91);
	Class237.method4414(-1033879666);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub30_10696, 2,
	     (byte) -61);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub23_10719, 2,
	     (byte) -28);
	Class424.method6769(-1852050786);
	client.aClass507_11137.method8361((byte) 82).method10398(1392840463);
	client.aBool11095 = true;
    }
    
    static Class71_Sub1 method2084() {
	Class71_Sub1 class71_sub1 = new Class71_Sub1();
	boolean bool = false;
	boolean bool_11_ = false;
	boolean bool_12_ = false;
	if (Class396.aString4106.startsWith("win")) {
	    bool_11_ = true;
	    bool = true;
	    bool_12_ = true;
	} else {
	    bool = true;
	    bool_12_ = true;
	}
	if (aBool1427) {
	    class71_sub1.method16368(16, -1051762035);
	    bool = false;
	}
	if (aBool1433) {
	    class71_sub1.method16368(32, 549883684);
	    bool_11_ = false;
	}
	if (aBool1434) {
	    class71_sub1.method16368(16384, -1167129436);
	    bool_12_ = false;
	}
	if (!bool && !bool_11_) {
	    Class34.method958(class71_sub1, -1542155176);
	    return class71_sub1;
	}
	int i = -1;
	int i_13_ = -1;
	int i_14_ = -1;
	if (bool_11_) {
	    try {
		Class198_Sub13.aClass525_Sub30_9973.method16502
		    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub29_10722,
		     3, (byte) -17);
		Class650.method10715(-1758466106);
		i_13_ = Class206.method3905(3, 1000, 1923067405);
		if (Class198_Sub13.aClass525_Sub30_9973
			.aClass696_Sub20_10708.method17160(-1455910197)
		    == 3) {
		    class71_sub1.method16368(4, -1349998478);
		    Class170 class170 = Class501.aClass182_5564.method3130();
		    long l = (4822213046138725271L * class170.aLong1854
			      & 0xffffffffffffL);
		    switch (class170.anInt1850 * -1809895579) {
		    case 4318: {
			boolean bool_15_ = l >= 64425238954L;
			bool &= bool_15_;
			if (!bool_15_)
			    class71_sub1.method16368(256, -1779604747);
			break;
		    }
		    case 4098: {
			boolean bool_16_ = l >= 60129613779L;
			bool &= bool_16_;
			if (!bool_16_)
			    class71_sub1.method16368(512, -1388435774);
			break;
		    }
		    }
		}
	    } catch (Exception exception) {
		class71_sub1.method16368(4096, -539812910);
	    }
	}
	if (bool_12_) {
	    try {
		Class198_Sub13.aClass525_Sub30_9973.method16502
		    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub29_10722,
		     5, (byte) -82);
		Class650.method10715(-1758466106);
		i_14_ = Class206.method3905(5, 1000, -249103498);
		if (Class198_Sub13.aClass525_Sub30_9973
			.aClass696_Sub20_10708.method17160(1788990062)
		    == 5)
		    class71_sub1.method16368(8192, 27070907);
	    } catch (Exception exception) {
		class71_sub1.method16368(32768, -1690050260);
	    }
	}
	if (bool) {
	    try {
		Class198_Sub13.aClass525_Sub30_9973.method16502
		    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub29_10722,
		     4, (byte) -126);
		Class650.method10715(-1758466106);
		i = Class206.method3905(1, 1000, -982347227);
		if (Class198_Sub13.aClass525_Sub30_9973
			.aClass696_Sub20_10708.method17160(-1210749370)
		    == 1)
		    class71_sub1.method16368(2, -551882319);
	    } catch (Exception exception) {
		class71_sub1.method16368(2048, -740954641);
	    }
	}
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub29_10722, 0,
	     (byte) -71);
	if (-1 == i && i_13_ == -1) {
	    Class34.method958(class71_sub1, -1676721906);
	    return class71_sub1;
	}
	class71_sub1.method16366(3, i_13_, (byte) 41);
	class71_sub1.method16366(1, i, (byte) 62);
	class71_sub1.method16366(5, i_14_, (byte) -51);
	i_13_ *= 1.3F;
	if (i_13_ > 100000 && i > 100000 || i_13_ > i)
	    Class198_Sub15.method15654(class71_sub1, 3, -1 == i ? i_13_ : i,
				       (byte) 0);
	else
	    Class198_Sub15.method15654(class71_sub1, 1,
				       -1 == i_13_ ? i : i_13_, (byte) 0);
	return class71_sub1;
    }
    
    static void method2085() {
	if (Class503.anInt5598 * 389852961 > 1)
	    Class198_Sub13.aClass525_Sub30_9973.method16502
		(Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub28_10720, 4,
		 (byte) -114);
	else
	    Class198_Sub13.aClass525_Sub30_9973.method16502
		(Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub28_10720, 2,
		 (byte) -126);
    }
    
    static void method2086() {
	if (Class503.anInt5598 * 389852961 > 1)
	    Class198_Sub13.aClass525_Sub30_9973.method16502
		(Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub28_10720, 4,
		 (byte) -42);
	else
	    Class198_Sub13.aClass525_Sub30_9973.method16502
		(Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub28_10720, 2,
		 (byte) -1);
    }
    
    public static void method2087() {
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub6_10692, 2,
	     (byte) -102);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub6_10675, 2,
	     (byte) -43);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub11_10688, 1,
	     (byte) -82);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub24_10687, 1,
	     (byte) -113);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub21_10689, 1,
	     (byte) -67);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub5_10685, 1,
	     (byte) -50);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub17_10676, 1,
	     (byte) -82);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub4_10728, 1,
	     (byte) -34);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub15_10715, 2,
	     (byte) -120);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub9_10691, 1,
	     (byte) -77);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub12_10698, 2,
	     (byte) -105);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub8_10671, 1,
	     (byte) -66);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub39_10677, 0,
	     (byte) -80);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub39_10678, 0,
	     (byte) -110);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub2_10694, 2,
	     (byte) -74);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub26_10682,
	     Class290.aClass290_3216.anInt3213 * -691210721, (byte) -41);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub37_10680, 0,
	     (byte) -28);
	if (null != Class501.aClass182_5564
	    && Class501.aClass182_5564.method3142()
	    && Class501.aClass182_5564.method3284())
	    Class501.aClass182_5564.method3301();
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub42_10717, 1,
	     (byte) -29);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub36_10699, 1,
	     (byte) -6);
	Class237.method4414(364530715);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub30_10696, 0,
	     (byte) -31);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub23_10719, 4,
	     (byte) -75);
	Class424.method6769(-1852050786);
	client.aClass507_11137.method8361((byte) 102).method10398(695667287);
	client.aBool11095 = true;
    }
    
    static void method2088() {
	if (Class503.anInt5598 * 389852961 > 1)
	    Class198_Sub13.aClass525_Sub30_9973.method16502
		(Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub28_10720, 4,
		 (byte) -99);
	else
	    Class198_Sub13.aClass525_Sub30_9973.method16502
		(Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub28_10720, 2,
		 (byte) -92);
    }
    
    static void method2089(byte i) {
	Class525_Sub10.aClass10_10509.method688((short) -17805);
    }
    
    static final void method2090(Class683 class683, int i) {
	int i_17_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = (((Class525_Sub16_Sub1)
		Class612.aClass40_Sub19_8026.method76(i_17_, 76047177))
	       .anInt11404) * 785063537;
    }
}
