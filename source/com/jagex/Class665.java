/* Class665 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Class665
{
    static Map aMap8558 = new HashMap();
    
    Class665() throws Throwable {
	throw new Error();
    }
    
    public static Interface76 method10990(Class var_class, int i) {
	synchronized (aMap8558) {
	    Map map = (Map) aMap8558.get(var_class);
	    if (map == null) {
		map = new HashMap();
		Interface76[] interface76s
		    = (Interface76[]) var_class.getEnumConstants();
		for (int i_0_ = 0; i_0_ < interface76s.length; i_0_++) {
		    Interface76 interface76 = interface76s[i_0_];
		    map.put(Integer.valueOf(interface76.method80()),
			    interface76);
		}
		aMap8558.put(var_class, map);
	    }
	    Interface76 interface76
		= (Interface76) map.get(Integer.valueOf(i));
	    return interface76;
	}
    }
    
    public static Interface76 method10991(Class var_class, int i) {
	synchronized (aMap8558) {
	    Map map = (Map) aMap8558.get(var_class);
	    if (map == null) {
		map = new HashMap();
		Interface76[] interface76s
		    = (Interface76[]) var_class.getEnumConstants();
		for (int i_1_ = 0; i_1_ < interface76s.length; i_1_++) {
		    Interface76 interface76 = interface76s[i_1_];
		    map.put(Integer.valueOf(interface76.method80()),
			    interface76);
		}
		aMap8558.put(var_class, map);
	    }
	    Interface76 interface76
		= (Interface76) map.get(Integer.valueOf(i));
	    return interface76;
	}
    }
    
    public static Interface76 method10992(Class var_class, int i) {
	synchronized (aMap8558) {
	    Map map = (Map) aMap8558.get(var_class);
	    if (map == null) {
		map = new HashMap();
		Interface76[] interface76s
		    = (Interface76[]) var_class.getEnumConstants();
		for (int i_2_ = 0; i_2_ < interface76s.length; i_2_++) {
		    Interface76 interface76 = interface76s[i_2_];
		    map.put(Integer.valueOf(interface76.method80()),
			    interface76);
		}
		aMap8558.put(var_class, map);
	    }
	    Interface76 interface76
		= (Interface76) map.get(Integer.valueOf(i));
	    return interface76;
	}
    }
    
    public static Interface76 method10993(Interface76[] interface76s, int i) {
	Interface76[] interface76s_3_ = interface76s;
	for (int i_4_ = 0; i_4_ < interface76s_3_.length; i_4_++) {
	    Interface76 interface76 = interface76s_3_[i_4_];
	    if (i == interface76.method80())
		return interface76;
	}
	return null;
    }
    
    public static Interface76 method10994(Interface76[] interface76s, int i) {
	Interface76[] interface76s_5_ = interface76s;
	for (int i_6_ = 0; i_6_ < interface76s_5_.length; i_6_++) {
	    Interface76 interface76 = interface76s_5_[i_6_];
	    if (i == interface76.method80())
		return interface76;
	}
	return null;
    }
    
    public static void method10995(Iterable iterable,
				   RSBuffer class525_sub38) {
	int i = Class598.method9853(iterable, 2062478712);
	class525_sub38.method16829(i, 82540619);
	if (i != 0) {
	    for (int i_7_ = 0; i_7_ < i; i_7_++)
		class525_sub38.buffer
		    [class525_sub38.index * -1133521593 + i_7_]
		    = (byte) 0;
	    Iterator iterator = iterable.iterator();
	    while (iterator.hasNext()) {
		Interface76 interface76 = (Interface76) iterator.next();
		int i_8_ = interface76.method80();
		int i_9_ = i_8_ / 8;
		class525_sub38.buffer
		    [-1133521593 * class525_sub38.index + i_9_]
		    |= 1 << (i_8_ & 0x7);
	    }
	    class525_sub38.index += i * 339428471;
	}
    }
    
    public static void method10996(Iterable iterable,
				   RSBuffer class525_sub38) {
	int i = Class598.method9853(iterable, 1689391091);
	class525_sub38.method16829(i, 231099529);
	if (i != 0) {
	    for (int i_10_ = 0; i_10_ < i; i_10_++)
		class525_sub38.buffer
		    [class525_sub38.index * -1133521593 + i_10_]
		    = (byte) 0;
	    Iterator iterator = iterable.iterator();
	    while (iterator.hasNext()) {
		Interface76 interface76 = (Interface76) iterator.next();
		int i_11_ = interface76.method80();
		int i_12_ = i_11_ / 8;
		class525_sub38.buffer
		    [-1133521593 * class525_sub38.index + i_12_]
		    |= 1 << (i_11_ & 0x7);
	    }
	    class525_sub38.index += i * 339428471;
	}
    }
    
    static int method10997(Iterable iterable) {
	int i = -1;
	Iterator iterator = iterable.iterator();
	while (iterator.hasNext()) {
	    Interface76 interface76 = (Interface76) iterator.next();
	    if (interface76.method80() > i)
		i = interface76.method80();
	}
	return (8 + i) / 8;
    }
    
    static void method10998(byte i) {
	Class551_Sub1.anIntArray10753[44] = 71;
	Class551_Sub1.anIntArray10753[45] = 26;
	Class551_Sub1.anIntArray10753[46] = 72;
	Class551_Sub1.anIntArray10753[47] = 73;
	Class551_Sub1.anIntArray10753[59] = 57;
	Class551_Sub1.anIntArray10753[61] = 27;
	Class551_Sub1.anIntArray10753[91] = 42;
	Class551_Sub1.anIntArray10753[92] = 74;
	Class551_Sub1.anIntArray10753[93] = 43;
	Class551_Sub1.anIntArray10753[192] = 28;
	Class551_Sub1.anIntArray10753[222] = 58;
	Class551_Sub1.anIntArray10753[520] = 59;
    }
    
    static void method10999(int i) {
	Class350_Sub3 class350_sub3
	    = ((Class350_Sub3)
	       Class44.aClass309_Sub1_345.method5481(-145378184));
	Class704_Sub5 class704_sub5
	    = ((Class704_Sub5)
	       Class44.aClass309_Sub1_345.method5482(1640046317));
	Class446 class446 = class350_sub3.method6131(-1906828385);
	Class429 class429 = class704_sub5.method17463(-1589039601);
	if (client.aClass259_11268 != null) {
	    int i_13_ = client.aClass259_11268.anInt2602 * -1694810043;
	    int i_14_ = client.aClass259_11268.anInt2598 * 2054207119;
	    float f = 1000.0F;
	    float f_15_ = (float) (2.0 * Math.atan((double) ((float) i_13_
							     / 2.0F / f)));
	    float f_16_ = (float) (2.0 * Math.atan((double) ((float) i_14_
							     / 2.0F / f)));
	    try {
		Class44.aClass309_Sub1_345.method5509(f_15_, f_16_,
						      1926721721);
	    } catch (Exception_Sub7 exception_sub7) {
		/* empty */
	    }
	}
	if (Class509.aClass569_5662.method9501(-1896669093)) {
	    Class429 class429_17_ = Class429.method6864();
	    class429_17_.method6811(1.0F, 0.0F, 0.0F,
				    ((float) (Class509.aClass569_5662
						  .method9499(501271953)
					      - Class44.anInt347 * -1945692501)
				     / 200.0F));
	    class429.method6822(class429_17_);
	    Class446 class446_18_ = Class446.method7208(0.0F, 1.0F, 0.0F);
	    class446_18_.method7239(class429);
	    Class429 class429_19_ = Class429.method6864();
	    class429_19_.method6810(class446_18_,
				    ((float) (Class44.anInt344 * 953072723
					      - Class509.aClass569_5662
						    .method9498(-1132266727))
				     / 200.0F));
	    class429.method6822(class429_19_);
	    class704_sub5.method17459(class429, (byte) -114);
	}
	Class44.anInt344
	    = Class509.aClass569_5662.method9498(-841290109) * 1093855195;
	Class44.anInt347
	    = Class509.aClass569_5662.method9499(501271953) * 32519171;
	class429.method6815();
	if (Class198_Sub21.aClass551_10003.method9149(98, 1000205069)) {
	    Class446 class446_20_ = Class446.method7208(0.0F, 0.0F, 25.0F);
	    class446_20_.method7239(class429);
	    class446_20_.aFloat4896 *= -1.0F;
	    class446.method7221(class446_20_);
	}
	if (Class198_Sub21.aClass551_10003.method9149(99, 1561175568)) {
	    Class446 class446_21_ = Class446.method7208(0.0F, 0.0F, -25.0F);
	    class446_21_.method7239(class429);
	    class446_21_.aFloat4896 *= -1.0F;
	    class446.method7221(class446_21_);
	}
	if (Class198_Sub21.aClass551_10003.method9149(96, 1078095164)) {
	    Class446 class446_22_ = Class446.method7208(-25.0F, 0.0F, 0.0F);
	    class446_22_.method7239(class429);
	    class446_22_.aFloat4896 *= -1.0F;
	    class446.method7221(class446_22_);
	}
	if (Class198_Sub21.aClass551_10003.method9149(97, 991051260)) {
	    Class446 class446_23_ = Class446.method7208(25.0F, 0.0F, 0.0F);
	    class446_23_.method7239(class429);
	    class446_23_.aFloat4896 *= -1.0F;
	    class446.method7221(class446_23_);
	}
	Class525_Sub28 class525_sub28
	    = new Class525_Sub28(0, (int) class446.aFloat4895,
				 (int) class446.aFloat4896,
				 (int) class446.aFloat4897);
	class350_sub3.method15911(class525_sub28, (byte) -114);
	Class600 class600 = client.aClass507_11137.method8350(-525007369);
	int i_24_ = class600.anInt7858 * -1227002079 << 9;
	int i_25_ = 1429253007 * class600.anInt7860 << 9;
	Class44.aClass309_Sub1_345.method5453(0.02F,
					      (client.aClass507_11137
						   .method8359
					       (603434863)
					       .anIntArrayArrayArray4966),
					      client.aClass507_11137
						  .method8360(1365901739),
					      i_24_, i_25_, -1959938446);
    }
    
    static Class71_Sub1 method11000(byte i) {
	Class71_Sub1 class71_sub1 = new Class71_Sub1();
	boolean bool = false;
	boolean bool_26_ = false;
	boolean bool_27_ = false;
	if (Class396.aString4106.startsWith("win")) {
	    bool_26_ = true;
	    bool = true;
	    bool_27_ = true;
	} else {
	    bool = true;
	    bool_27_ = true;
	}
	if (Class117.aBool1427) {
	    class71_sub1.method16368(16, -972609357);
	    bool = false;
	}
	if (Class117.aBool1433) {
	    class71_sub1.method16368(32, -617698048);
	    bool_26_ = false;
	}
	if (Class117.aBool1434) {
	    class71_sub1.method16368(16384, -883217625);
	    bool_27_ = false;
	}
	if (!bool && !bool_26_) {
	    Class34.method958(class71_sub1, -1975060495);
	    return class71_sub1;
	}
	int i_28_ = -1;
	int i_29_ = -1;
	int i_30_ = -1;
	if (bool_26_) {
	    try {
		Class198_Sub13.aClass525_Sub30_9973.method16502
		    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub29_10722,
		     3, (byte) -12);
		Class650.method10715(-1758466106);
		i_29_ = Class206.method3905(3, 1000, 2052253316);
		if (Class198_Sub13.aClass525_Sub30_9973
			.aClass696_Sub20_10708.method17160(-1924521514)
		    == 3) {
		    class71_sub1.method16368(4, -2019908233);
		    Class170 class170 = Class501.aClass182_5564.method3130();
		    long l = (4822213046138725271L * class170.aLong1854
			      & 0xffffffffffffL);
		    switch (class170.anInt1850 * -1809895579) {
		    case 4318: {
			boolean bool_31_ = l >= 64425238954L;
			bool &= bool_31_;
			if (!bool_31_)
			    class71_sub1.method16368(256, 1524619444);
			break;
		    }
		    case 4098: {
			boolean bool_32_ = l >= 60129613779L;
			bool &= bool_32_;
			if (!bool_32_)
			    class71_sub1.method16368(512, -1989891349);
			break;
		    }
		    }
		}
	    } catch (Exception exception) {
		class71_sub1.method16368(4096, -552756665);
	    }
	}
	if (bool_27_) {
	    try {
		Class198_Sub13.aClass525_Sub30_9973.method16502
		    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub29_10722,
		     5, (byte) -39);
		Class650.method10715(-1758466106);
		i_30_ = Class206.method3905(5, 1000, -1855665287);
		if (Class198_Sub13.aClass525_Sub30_9973
			.aClass696_Sub20_10708.method17160(-2016259880)
		    == 5)
		    class71_sub1.method16368(8192, 1723268148);
	    } catch (Exception exception) {
		class71_sub1.method16368(32768, -1358255688);
	    }
	}
	if (bool) {
	    try {
		Class198_Sub13.aClass525_Sub30_9973.method16502
		    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub29_10722,
		     4, (byte) -86);
		Class650.method10715(-1758466106);
		i_28_ = Class206.method3905(1, 1000, 1972009472);
		if (Class198_Sub13.aClass525_Sub30_9973
			.aClass696_Sub20_10708.method17160(1908018097)
		    == 1)
		    class71_sub1.method16368(2, -2146448545);
	    } catch (Exception exception) {
		class71_sub1.method16368(2048, 1842090910);
	    }
	}
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub29_10722, 0,
	     (byte) -7);
	if (-1 == i_28_ && i_29_ == -1) {
	    Class34.method958(class71_sub1, -1025534374);
	    return class71_sub1;
	}
	class71_sub1.method16366(3, i_29_, (byte) -39);
	class71_sub1.method16366(1, i_28_, (byte) 16);
	class71_sub1.method16366(5, i_30_, (byte) 58);
	i_29_ *= 1.3F;
	if (i_29_ > 100000 && i_28_ > 100000 || i_29_ > i_28_)
	    Class198_Sub15.method15654(class71_sub1, 3,
				       -1 == i_28_ ? i_29_ : i_28_, (byte) 0);
	else
	    Class198_Sub15.method15654(class71_sub1, 1,
				       -1 == i_29_ ? i_28_ : i_29_, (byte) 0);
	return class71_sub1;
    }
    
    static final void method11001(int i, int i_33_) {
	if (Class165.method2667(i, null, -852502698))
	    Class341.method5994((Class162.aClass245Array1764[i]
				 .aClass259Array2426),
				-1, 653970739);
    }
}
