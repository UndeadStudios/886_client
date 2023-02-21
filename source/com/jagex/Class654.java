/* Class654 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Point;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Class654
{
    static Queue aQueue8395;
    static int anInt8396;
    static boolean aBool8397;
    static Class652_Sub2 aClass652_Sub2_8398;
    static Class652_Sub1 aClass652_Sub1_8399;
    static long aLong8400 = -5611731449678946449L;
    
    public static void method10790() {
	aClass652_Sub2_8398.method10748((byte) -99);
	aClass652_Sub1_8399.method10748((byte) 19);
	aLong8400 = -5611731449678946449L;
	aBool8397 = true;
    }
    
    static {
	anInt8396 = 0;
	aBool8397 = true;
	aClass652_Sub2_8398 = new Class652_Sub2();
	aClass652_Sub1_8399 = new Class652_Sub1();
	aQueue8395 = new LinkedList();
    }
    
    public static void method10791() {
	Class579.method9585((short) -25769);
	aClass652_Sub2_8398.method10768((byte) 14);
	aClass652_Sub1_8399.method10768((byte) 31);
	if (client.anInt11273 * 1353095005 > 0) {
	    Class525_Sub15 class525_sub15
		= Class16.method767(Class412.aClass412_4333,
				    client.aClass96_11085.aClass6_1169,
				    1977859884);
	    class525_sub15.aClass525_Sub38_Sub2_10546
		.method16602(1117412724 * client.anInt11273, 1682243657);
	    for (int i = 0; i < 1353095005 * client.anInt11273; i++) {
		Interface64 interface64 = client.anInterface64Array11106[i];
		long l = (interface64.method422(316032614)
			  - 2266328018382184561L * aLong8400);
		if (l > 16777215L)
		    l = 16777215L;
		aLong8400
		    = interface64.method422(388381927) * 5611731449678946449L;
		class525_sub15.aClass525_Sub38_Sub2_10546.method16735
		    (interface64.method413(1258758582), -438281147);
		class525_sub15.aClass525_Sub38_Sub2_10546
		    .method16604((int) l, (byte) 1);
	    }
	    client.aClass96_11085.method1794(class525_sub15, (short) 24934);
	}
	if (anInt8396 * 1348481885 > 0)
	    anInt8396 -= -1630226187;
	if (client.aBool11364 && 1348481885 * anInt8396 <= 0) {
	    anInt8396 = 1755214628;
	    client.aBool11364 = false;
	    int i;
	    int i_0_;
	    if (5 == -174799205 * Class700.anInt8779) {
		if (Class453_Sub3.aClass309_Sub1_10316.method5485(1161896550)
		    == Class289.aClass289_3202) {
		    Class350_Sub1 class350_sub1
			= (Class350_Sub1) Class453_Sub3
					      .aClass309_Sub1_10316
					      .method5481(-505244345);
		    i = Class511.method8531(class350_sub1.aClass429_10201,
					    19722651) >> 3;
		    int i_1_ = 1024;
		    i_0_ = (i_1_ * 3 - (Class308.method5449((class350_sub1
							     .aClass429_10201),
							    701816993)
					>> 3)) % (i_1_ * 2);
		} else {
		    i = 0;
		    i_0_ = 0;
		}
	    } else {
		i = (int) client.aFloat11176 >> 3;
		i_0_ = (int) client.aFloat11052 >> 3;
	    }
	    Class525_Sub15 class525_sub15
		= Class16.method767(Class412.aClass412_4301,
				    client.aClass96_11085.aClass6_1169,
				    1977859884);
	    class525_sub15.aClass525_Sub38_Sub2_10546.method16664(i_0_,
								  -802574676);
	    class525_sub15.aClass525_Sub38_Sub2_10546.method16664(i,
								  -850717034);
	    client.aClass96_11085.method1794(class525_sub15, (short) 28670);
	}
	if (Class280.aBool3001 != aBool8397) {
	    aBool8397 = Class280.aBool3001;
	    Class525_Sub15 class525_sub15
		= Class16.method767(Class412.aClass412_4360,
				    client.aClass96_11085.aClass6_1169,
				    1977859884);
	    class525_sub15.aClass525_Sub38_Sub2_10546
		.method16735(Class280.aBool3001 ? 1 : 0, -1945724723);
	    client.aClass96_11085.method1794(class525_sub15, (short) 14592);
	}
	if (!client.aBool11084) {
	    Class525_Sub15 class525_sub15
		= Class16.method767(Class412.aClass412_4267,
				    client.aClass96_11085.aClass6_1169,
				    1977859884);
	    class525_sub15.aClass525_Sub38_Sub2_10546.method16735(0,
								  -210636657);
	    int i = (class525_sub15.aClass525_Sub38_Sub2_10546.pos
		     * -1133521593);
	    RSBuffer class525_sub38
		= Class198_Sub13.aClass525_Sub30_9973.method16501(-402101553);
	    class525_sub15.aClass525_Sub38_Sub2_10546.method16614
		(class525_sub38.buffer, 0,
		 class525_sub38.pos * -1133521593, 1291768592);
	    class525_sub15.aClass525_Sub38_Sub2_10546.method16617
		((-1133521593
		  * class525_sub15.aClass525_Sub38_Sub2_10546.pos) - i,
		 (byte) 7);
	    client.aClass96_11085.method1794(class525_sub15, (short) 11940);
	    client.aBool11084 = true;
	}
	if (!client.aBool11251
	    && Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub20_10701
		   .method17160(547349884) == 1) {
	    int[] is = Class501.aClass182_5564.method3541();
	    Class525_Sub15 class525_sub15
		= Class16.method767(Class412.aClass412_4278,
				    client.aClass96_11085.aClass6_1169,
				    1977859884);
	    class525_sub15.aClass525_Sub38_Sub2_10546.method16602(0,
								  1911511796);
	    int i = (-1133521593
		     * class525_sub15.aClass525_Sub38_Sub2_10546.pos);
	    if (null != is && is.length != 0) {
		class525_sub15.aClass525_Sub38_Sub2_10546
		    .method16735(1, -762740665);
		Class130[] class130s = Class130.method2279((byte) -98);
		HashSet hashset = new HashSet();
		ArrayList arraylist = new ArrayList();
		for (int i_2_ = 0; i_2_ < is.length; i_2_++) {
		    boolean bool = false;
		    for (int i_3_ = 0; i_3_ < class130s.length; i_3_++) {
			if (class130s[i_3_].anInt1580 == is[i_2_]) {
			    hashset.add(class130s[i_3_]);
			    bool = true;
			    break;
			}
		    }
		    if (!bool)
			arraylist.add(Integer.valueOf(is[i_2_]));
		}
		Class106_Sub1.method14528(hashset,
					  (class525_sub15
					   .aClass525_Sub38_Sub2_10546),
					  -1509992749);
		class525_sub15.aClass525_Sub38_Sub2_10546
		    .method16642(arraylist.size(), (byte) 69);
		if (arraylist.size() > 0) {
		    int i_4_ = 2147483647;
		    Iterator iterator = arraylist.iterator();
		    while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			if (integer.intValue() < i_4_)
			    i_4_ = integer.intValue();
		    }
		    class525_sub15.aClass525_Sub38_Sub2_10546
			.method16620(i_4_, (byte) 19);
		    iterator = arraylist.iterator();
		    while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			if (integer.intValue() != i_4_)
			    class525_sub15.aClass525_Sub38_Sub2_10546
				.method16620
				(integer.intValue() - i_4_, (byte) 19);
		    }
		}
	    } else
		class525_sub15.aClass525_Sub38_Sub2_10546
		    .method16735(0, -1094410225);
	    class525_sub15.aClass525_Sub38_Sub2_10546.method16616
		((class525_sub15.aClass525_Sub38_Sub2_10546.pos
		  * -1133521593) - i,
		 712679767);
	    client.aClass96_11085.method1794(class525_sub15, (short) 29828);
	    client.aBool11251 = true;
	}
    }
    
    static void method10792() {
	synchronized (aQueue8395) {
	    Point point;
	    if (Class532.aCanvas7169.isShowing())
		point = Class532.aCanvas7169.getLocationOnScreen();
	    else
		point = null;
	    for (;;) {
		Class525_Sub41_Sub2 class525_sub41_sub2
		    = (Class525_Sub41_Sub2) aQueue8395.poll();
		if (null == class525_sub41_sub2)
		    break;
		if (point == null || !Class532.aCanvas7169.isShowing()
		    || !Class280.aBool3001)
		    class525_sub41_sub2.method16861(442479656);
		else {
		    class525_sub41_sub2.method18524(point, -814261677);
		    if (!class525_sub41_sub2.method18528((byte) 22)
			&& (class525_sub41_sub2.method16870((byte) -106)
			    < -1445589163 * Class434.anInt4827)
			&& (class525_sub41_sub2.method16858((byte) 26)
			    < -1883654023 * Class696_Sub47.anInt11032)
			&& class525_sub41_sub2.method16870((byte) -79) >= 0
			&& class525_sub41_sub2.method16858((byte) 61) >= 0) {
			int i = class525_sub41_sub2.method16857(2126845105);
			if (class525_sub41_sub2.method16857(2114712754) == -1)
			    aClass652_Sub1_8399
				.method10749(class525_sub41_sub2, (byte) 64);
			else if (Class525_Sub16_Sub1.method17994(i,
								 (byte) -66))
			    aClass652_Sub1_8399
				.method17001(class525_sub41_sub2, (byte) 76);
		    }
		}
	    }
	}
    }
    
    public static void method10793() {
	Class696_Sub21.method17172(-851439741);
    }
    
    public static void method10794() {
	aClass652_Sub2_8398.method10748((byte) -62);
	aClass652_Sub1_8399.method10748((byte) -52);
	aLong8400 = -5611731449678946449L;
	aBool8397 = true;
    }
    
    public static void method10795() {
	aClass652_Sub2_8398.method10748((byte) 93);
	aClass652_Sub1_8399.method10748((byte) -78);
	aLong8400 = -5611731449678946449L;
	aBool8397 = true;
    }
    
    static void method10796() {
	synchronized (aQueue8395) {
	    Point point;
	    if (Class532.aCanvas7169.isShowing())
		point = Class532.aCanvas7169.getLocationOnScreen();
	    else
		point = null;
	    for (;;) {
		Class525_Sub41_Sub2 class525_sub41_sub2
		    = (Class525_Sub41_Sub2) aQueue8395.poll();
		if (null == class525_sub41_sub2)
		    break;
		if (point == null || !Class532.aCanvas7169.isShowing()
		    || !Class280.aBool3001)
		    class525_sub41_sub2.method16861(1237588795);
		else {
		    class525_sub41_sub2.method18524(point, -814261677);
		    if (!class525_sub41_sub2.method18528((byte) 92)
			&& (class525_sub41_sub2.method16870((byte) -52)
			    < -1445589163 * Class434.anInt4827)
			&& (class525_sub41_sub2.method16858((byte) 52)
			    < -1883654023 * Class696_Sub47.anInt11032)
			&& class525_sub41_sub2.method16870((byte) -121) >= 0
			&& class525_sub41_sub2.method16858((byte) 90) >= 0) {
			int i = class525_sub41_sub2.method16857(2121737258);
			if (class525_sub41_sub2.method16857(2132702323) == -1)
			    aClass652_Sub1_8399
				.method10749(class525_sub41_sub2, (byte) 34);
			else if (Class525_Sub16_Sub1.method17994(i,
								 (byte) -98))
			    aClass652_Sub1_8399
				.method17001(class525_sub41_sub2, (byte) 78);
		    }
		}
	    }
	}
    }
    
    public static void method10797() {
	Class696_Sub21.method17172(-851439741);
    }
    
    Class654() throws Throwable {
	throw new Error();
    }
    
    public static void method10798() {
	Class579.method9585((short) -26687);
	aClass652_Sub2_8398.method10768((byte) 33);
	aClass652_Sub1_8399.method10768((byte) 42);
	if (client.anInt11273 * 1353095005 > 0) {
	    Class525_Sub15 class525_sub15
		= Class16.method767(Class412.aClass412_4333,
				    client.aClass96_11085.aClass6_1169,
				    1977859884);
	    class525_sub15.aClass525_Sub38_Sub2_10546
		.method16602(1117412724 * client.anInt11273, 1466972780);
	    for (int i = 0; i < 1353095005 * client.anInt11273; i++) {
		Interface64 interface64 = client.anInterface64Array11106[i];
		long l = (interface64.method422(-1234001198)
			  - 2266328018382184561L * aLong8400);
		if (l > 16777215L)
		    l = 16777215L;
		aLong8400 = (interface64.method422(-2030822509)
			     * 5611731449678946449L);
		class525_sub15.aClass525_Sub38_Sub2_10546.method16735
		    (interface64.method413(326986158), -1893858364);
		class525_sub15.aClass525_Sub38_Sub2_10546
		    .method16604((int) l, (byte) 1);
	    }
	    client.aClass96_11085.method1794(class525_sub15, (short) 19308);
	}
	if (anInt8396 * 1348481885 > 0)
	    anInt8396 -= -1630226187;
	if (client.aBool11364 && 1348481885 * anInt8396 <= 0) {
	    anInt8396 = 1755214628;
	    client.aBool11364 = false;
	    int i;
	    int i_5_;
	    if (5 == -174799205 * Class700.anInt8779) {
		if (Class453_Sub3.aClass309_Sub1_10316.method5485(-145089821)
		    == Class289.aClass289_3202) {
		    Class350_Sub1 class350_sub1
			= (Class350_Sub1) Class453_Sub3
					      .aClass309_Sub1_10316
					      .method5481(-1930220625);
		    i = Class511.method8531(class350_sub1.aClass429_10201,
					    19722651) >> 3;
		    int i_6_ = 1024;
		    i_5_ = (i_6_ * 3 - (Class308.method5449((class350_sub1
							     .aClass429_10201),
							    -1867909518)
					>> 3)) % (i_6_ * 2);
		} else {
		    i = 0;
		    i_5_ = 0;
		}
	    } else {
		i = (int) client.aFloat11176 >> 3;
		i_5_ = (int) client.aFloat11052 >> 3;
	    }
	    Class525_Sub15 class525_sub15
		= Class16.method767(Class412.aClass412_4301,
				    client.aClass96_11085.aClass6_1169,
				    1977859884);
	    class525_sub15.aClass525_Sub38_Sub2_10546.method16664(i_5_,
								  -1885360529);
	    class525_sub15.aClass525_Sub38_Sub2_10546.method16664(i,
								  -1890620417);
	    client.aClass96_11085.method1794(class525_sub15, (short) 32513);
	}
	if (Class280.aBool3001 != aBool8397) {
	    aBool8397 = Class280.aBool3001;
	    Class525_Sub15 class525_sub15
		= Class16.method767(Class412.aClass412_4360,
				    client.aClass96_11085.aClass6_1169,
				    1977859884);
	    class525_sub15.aClass525_Sub38_Sub2_10546
		.method16735(Class280.aBool3001 ? 1 : 0, -976529722);
	    client.aClass96_11085.method1794(class525_sub15, (short) 23756);
	}
	if (!client.aBool11084) {
	    Class525_Sub15 class525_sub15
		= Class16.method767(Class412.aClass412_4267,
				    client.aClass96_11085.aClass6_1169,
				    1977859884);
	    class525_sub15.aClass525_Sub38_Sub2_10546.method16735(0,
								  -647638031);
	    int i = (class525_sub15.aClass525_Sub38_Sub2_10546.pos
		     * -1133521593);
	    RSBuffer class525_sub38
		= Class198_Sub13.aClass525_Sub30_9973.method16501(-1536245487);
	    class525_sub15.aClass525_Sub38_Sub2_10546.method16614
		(class525_sub38.buffer, 0,
		 class525_sub38.pos * -1133521593, 1981626054);
	    class525_sub15.aClass525_Sub38_Sub2_10546.method16617
		((-1133521593
		  * class525_sub15.aClass525_Sub38_Sub2_10546.pos) - i,
		 (byte) 7);
	    client.aClass96_11085.method1794(class525_sub15, (short) 3623);
	    client.aBool11084 = true;
	}
	if (!client.aBool11251
	    && Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub20_10701
		   .method17160(-1498228229) == 1) {
	    int[] is = Class501.aClass182_5564.method3541();
	    Class525_Sub15 class525_sub15
		= Class16.method767(Class412.aClass412_4278,
				    client.aClass96_11085.aClass6_1169,
				    1977859884);
	    class525_sub15.aClass525_Sub38_Sub2_10546.method16602(0,
								  1156708062);
	    int i = (-1133521593
		     * class525_sub15.aClass525_Sub38_Sub2_10546.pos);
	    if (null != is && is.length != 0) {
		class525_sub15.aClass525_Sub38_Sub2_10546
		    .method16735(1, -452302271);
		Class130[] class130s = Class130.method2279((byte) -8);
		HashSet hashset = new HashSet();
		ArrayList arraylist = new ArrayList();
		for (int i_7_ = 0; i_7_ < is.length; i_7_++) {
		    boolean bool = false;
		    for (int i_8_ = 0; i_8_ < class130s.length; i_8_++) {
			if (class130s[i_8_].anInt1580 == is[i_7_]) {
			    hashset.add(class130s[i_8_]);
			    bool = true;
			    break;
			}
		    }
		    if (!bool)
			arraylist.add(Integer.valueOf(is[i_7_]));
		}
		Class106_Sub1.method14528(hashset,
					  (class525_sub15
					   .aClass525_Sub38_Sub2_10546),
					  -1507088645);
		class525_sub15.aClass525_Sub38_Sub2_10546
		    .method16642(arraylist.size(), (byte) 66);
		if (arraylist.size() > 0) {
		    int i_9_ = 2147483647;
		    Iterator iterator = arraylist.iterator();
		    while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			if (integer.intValue() < i_9_)
			    i_9_ = integer.intValue();
		    }
		    class525_sub15.aClass525_Sub38_Sub2_10546
			.method16620(i_9_, (byte) 19);
		    iterator = arraylist.iterator();
		    while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			if (integer.intValue() != i_9_)
			    class525_sub15.aClass525_Sub38_Sub2_10546
				.method16620
				(integer.intValue() - i_9_, (byte) 19);
		    }
		}
	    } else
		class525_sub15.aClass525_Sub38_Sub2_10546
		    .method16735(0, -279721718);
	    class525_sub15.aClass525_Sub38_Sub2_10546.method16616
		((class525_sub15.aClass525_Sub38_Sub2_10546.pos
		  * -1133521593) - i,
		 1144372038);
	    client.aClass96_11085.method1794(class525_sub15, (short) 17633);
	    client.aBool11251 = true;
	}
    }
    
    static final void method10799(Class683 class683, byte i) {
	class683.anInt8662 -= 1552651121;
    }
    
    public static String method10800(String string, char c, String string_10_,
				     int i) {
	int i_11_ = string.length();
	int i_12_ = string_10_.length();
	int i_13_ = i_11_;
	int i_14_ = i_12_ - 1;
	if (i_14_ != 0) {
	    int i_15_ = 0;
	    for (;;) {
		i_15_ = string.indexOf(c, i_15_);
		if (i_15_ < 0)
		    break;
		i_15_++;
		i_13_ += i_14_;
	    }
	}
	StringBuilder stringbuilder = new StringBuilder(i_13_);
	int i_16_ = 0;
	for (;;) {
	    int i_17_ = string.indexOf(c, i_16_);
	    if (i_17_ < 0)
		break;
	    stringbuilder.append(string.substring(i_16_, i_17_));
	    stringbuilder.append(string_10_);
	    i_16_ = 1 + i_17_;
	}
	stringbuilder.append(string.substring(i_16_));
	return stringbuilder.toString();
    }
    
    public static void method10801(int i) {
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub6_10692, 2,
	     (byte) -57);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub6_10675, 2,
	     (byte) -59);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub11_10688, 1,
	     (byte) -46);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub24_10687, 1,
	     (byte) -96);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub21_10689, 1,
	     (byte) -88);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub5_10685, 1,
	     (byte) -94);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub17_10676, 1,
	     (byte) -28);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub4_10728, 1,
	     (byte) -11);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub15_10715, 1,
	     (byte) -49);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub9_10691, 1,
	     (byte) -85);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub12_10698, 0,
	     (byte) -55);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub8_10671, 1,
	     (byte) -112);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub39_10677, 0,
	     (byte) -37);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub39_10678, 0,
	     (byte) -93);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub2_10694, 1,
	     (byte) -106);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub26_10682,
	     -691210721 * Class290.aClass290_3216.anInt3213, (byte) -48);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub37_10680, 0,
	     (byte) -122);
	if (null != Class501.aClass182_5564
	    && Class501.aClass182_5564.method3142()
	    && Class501.aClass182_5564.method3284())
	    Class501.aClass182_5564.method3301();
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub42_10717, 1,
	     (byte) -57);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub36_10699, 1,
	     (byte) -28);
	Class237.method4414(456997045);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub30_10696, 1,
	     (byte) -50);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub23_10719, 3,
	     (byte) -25);
	Class424.method6769(-1852050786);
	client.aClass507_11137.method8361((byte) 52).method10398(-563174969);
	client.aBool11095 = true;
    }
}
