/* Class410 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Class410 implements Iterator
{
    int anInt4238;
    int anInt4239 = 0;
    AbstractQueue_Sub1 anAbstractQueue_Sub1_4240;
    
    public boolean method6656() {
	return (anInt4239 * -414716793
		< 1724898015 * anAbstractQueue_Sub1_4240.anInt11936);
    }
    
    public boolean hasNext() {
	return (anInt4239 * -414716793
		< 1724898015 * anAbstractQueue_Sub1_4240.anInt11936);
    }
    
    public Object next() {
	if (anAbstractQueue_Sub1_4240.anInt11937 * 130221057
	    != anInt4238 * 207548097)
	    throw new ConcurrentModificationException();
	if (anInt4239 * -414716793
	    < anAbstractQueue_Sub1_4240.anInt11936 * 1724898015) {
	    Object object = (anAbstractQueue_Sub1_4240.aClass417Array11935
			     [anInt4239 * -414716793].anObject4618);
	    anInt4239 += 45422903;
	    return object;
	}
	throw new NoSuchElementException();
    }
    
    public boolean method6657() {
	return (anInt4239 * -414716793
		< 1724898015 * anAbstractQueue_Sub1_4240.anInt11936);
    }
    
    Class410(AbstractQueue_Sub1 abstractqueue_sub1) {
	anInt4238 = 726050113 * anAbstractQueue_Sub1_4240.anInt11937;
	anAbstractQueue_Sub1_4240 = abstractqueue_sub1;
    }
    
    public boolean method6658() {
	return (anInt4239 * -414716793
		< 1724898015 * anAbstractQueue_Sub1_4240.anInt11936);
    }
    
    public void method6659() {
	throw new UnsupportedOperationException();
    }
    
    public Object method6660() {
	if (anAbstractQueue_Sub1_4240.anInt11937 * 130221057
	    != anInt4238 * 207548097)
	    throw new ConcurrentModificationException();
	if (anInt4239 * -414716793
	    < anAbstractQueue_Sub1_4240.anInt11936 * 1724898015) {
	    Object object = (anAbstractQueue_Sub1_4240.aClass417Array11935
			     [anInt4239 * -414716793].anObject4618);
	    anInt4239 += 45422903;
	    return object;
	}
	throw new NoSuchElementException();
    }
    
    public Object method6661() {
	if (anAbstractQueue_Sub1_4240.anInt11937 * 130221057
	    != anInt4238 * 207548097)
	    throw new ConcurrentModificationException();
	if (anInt4239 * -414716793
	    < anAbstractQueue_Sub1_4240.anInt11936 * 1724898015) {
	    Object object = (anAbstractQueue_Sub1_4240.aClass417Array11935
			     [anInt4239 * -414716793].anObject4618);
	    anInt4239 += 45422903;
	    return object;
	}
	throw new NoSuchElementException();
    }
    
    public Object method6662() {
	if (anAbstractQueue_Sub1_4240.anInt11937 * 130221057
	    != anInt4238 * 207548097)
	    throw new ConcurrentModificationException();
	if (anInt4239 * -414716793
	    < anAbstractQueue_Sub1_4240.anInt11936 * 1724898015) {
	    Object object = (anAbstractQueue_Sub1_4240.aClass417Array11935
			     [anInt4239 * -414716793].anObject4618);
	    anInt4239 += 45422903;
	    return object;
	}
	throw new NoSuchElementException();
    }
    
    public void remove() {
	throw new UnsupportedOperationException();
    }
    
    static Class9 method6663(RSBuffer class525_sub38,
							 Class106_Sub1 class106_sub1, int i) {
	Class9 class9 = new Class9(class106_sub1);
	for (;;) {
	    int i_0_ = class525_sub38.readUnsignedByte(971152479);
	    if (255 == i_0_)
		break;
	    Class480 class480
		= (Class480) Class239.method4424(com.jagex.Class480.class,
						 i_0_, (byte) 11);
	    for (;;) {
		int i_1_ = class525_sub38.readUnsignedByte(1010806998);
		if (255 == i_1_)
		    break;
		class525_sub38.index -= 339428471;
		Class447 class447
		    = class106_sub1.method14522(class525_sub38, class480,
						1005577089);
		if (class447 != null)
		    class9.method18(class447.anInt4898 * -316828413,
				    class447.anObject4899, (byte) -117);
	    }
	}
	return class9;
    }
    
    static final void method6664(Class683 class683, byte i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub38_10721
		  .method17314(1823311579);
    }
    
    static final boolean method6665(Class547[][][] class547s, int i, int i_2_,
				    int i_3_, boolean bool, byte i_4_) {
	byte[][][] is = client.aClass507_11137.method8417((byte) -11);
	byte i_5_ = (bool ? (byte) 1
		     : (byte) (-1308155485 * client.anInt11267 & 0xff));
	if (is[-1335910809 * Class677.anInt8619][i_2_][i_3_] == i_5_)
	    return false;
	Class475 class475 = client.aClass507_11137.method8360(1936171287);
	if (0 == ((class475.aByteArrayArrayArray5178
		   [-1335910809 * Class677.anInt8619][i_2_][i_3_])
		  & 0x4))
	    return false;
	int i_6_ = 0;
	int i_7_ = 0;
	client.anIntArray11207[i_6_] = i_2_;
	client.anIntArray11197[i_6_++] = i_3_;
	is[Class677.anInt8619 * -1335910809][i_2_][i_3_] = i_5_;
	while (i_7_ != i_6_) {
	    int i_8_ = client.anIntArray11207[i_7_] & 0xffff;
	    int i_9_ = client.anIntArray11207[i_7_] >> 16 & 0xff;
	    int i_10_ = client.anIntArray11207[i_7_] >> 24 & 0xff;
	    int i_11_ = client.anIntArray11197[i_7_] & 0xffff;
	    int i_12_ = client.anIntArray11197[i_7_] >> 16 & 0xff;
	    i_7_ = i_7_ + 1 & 0xfff;
	    boolean bool_13_ = false;
	    if (((class475.aByteArrayArrayArray5178
		  [Class677.anInt8619 * -1335910809][i_8_][i_11_])
		 & 0x4)
		== 0)
		bool_13_ = true;
	    boolean bool_14_ = false;
	    if (null != class547s) {
		int i_15_ = Class677.anInt8619 * -1335910809 + 1;
	    while_115_:
		for (/**/; i_15_ <= 3; i_15_++) {
		    if (class547s[i_15_] != null
			&& 0 == ((class475.aByteArrayArrayArray5178[i_15_]
				  [i_8_][i_11_])
				 & 0x8)) {
			if (bool_13_
			    && class547s[i_15_][i_8_][i_11_] != null) {
			    if (null != (class547s[i_15_][i_8_][i_11_]
					 .aClass656_Sub1_Sub5_7266)) {
				int i_16_
				    = Class575.method9553(i_9_, -580431186);
				if (i_16_ == (class547s[i_15_][i_8_][i_11_]
					      .aClass656_Sub1_Sub5_7266
					      .aShort11952)
				    || (null != (class547s[i_15_][i_8_][i_11_]
						 .aClass656_Sub1_Sub5_7267)
					&& i_16_ == (class547s[i_15_][i_8_]
						     [i_11_]
						     .aClass656_Sub1_Sub5_7267
						     .aShort11952)))
				    continue;
				if (i_10_ != 0) {
				    int i_17_
					= Class575.method9553(i_10_,
							      -580431186);
				    if ((class547s[i_15_][i_8_][i_11_]
					 .aClass656_Sub1_Sub5_7266
					 .aShort11952) == i_17_
					|| ((class547s[i_15_][i_8_][i_11_]
					     .aClass656_Sub1_Sub5_7267) != null
					    && (class547s[i_15_][i_8_][i_11_]
						.aClass656_Sub1_Sub5_7267
						.aShort11952) == i_17_))
					continue;
				}
				if (i_12_ != 0) {
				    int i_18_
					= Class575.method9553(i_12_,
							      -580431186);
				    if (i_18_ == (class547s[i_15_][i_8_][i_11_]
						  .aClass656_Sub1_Sub5_7266
						  .aShort11952)
					|| ((class547s[i_15_][i_8_][i_11_]
					     .aClass656_Sub1_Sub5_7267) != null
					    && (i_18_
						== (class547s[i_15_][i_8_]
						    [i_11_]
						    .aClass656_Sub1_Sub5_7267
						    .aShort11952))))
					continue;
				}
			    }
			    Class547 class547 = class547s[i_15_][i_8_][i_11_];
			    if (class547.aClass560_7272 != null) {
				for (Class560 class560
					 = class547.aClass560_7272;
				     null != class560;
				     class560 = class560.aClass560_7546) {
				    Class656_Sub1_Sub3 class656_sub1_sub3
					= class560.aClass656_Sub1_Sub3_7547;
				    if (class656_sub1_sub3
					instanceof Interface62) {
					Interface62 interface62
					    = (Interface62) class656_sub1_sub3;
					int i_19_ = interface62
							.method72(-1258999684);
					int i_20_ = interface62
							.method413(1288241348);
					if (21 == i_19_)
					    i_19_ = 19;
					int i_21_ = i_19_ | i_20_ << 6;
					if (i_9_ == i_21_
					    || 0 != i_10_ && i_10_ == i_21_
					    || 0 != i_12_ && i_21_ == i_12_)
					    continue while_115_;
				    }
				}
			    }
			}
			Class547 class547 = class547s[i_15_][i_8_][i_11_];
			if (null != class547
			    && class547.aClass560_7272 != null) {
			    for (Class560 class560 = class547.aClass560_7272;
				 class560 != null;
				 class560 = class560.aClass560_7546) {
				Class656_Sub1_Sub3 class656_sub1_sub3
				    = class560.aClass656_Sub1_Sub3_7547;
				if ((class656_sub1_sub3.aShort11924
				     != class656_sub1_sub3.aShort11923)
				    || (class656_sub1_sub3.aShort11925
					!= class656_sub1_sub3.aShort11930)) {
				    short i_22_
					= class656_sub1_sub3.aShort11923;
				    short i_23_
					= class656_sub1_sub3.aShort11924;
				    short i_24_
					= class656_sub1_sub3.aShort11925;
				    short i_25_
					= class656_sub1_sub3.aShort11930;
				    int i_26_
					= Math.max(0,
						   Math.min(i_22_,
							    (is[i_15_].length
							     - 1)));
				    int i_27_
					= Math.max(0,
						   Math.min(i_24_,
							    (is[i_15_]
							     [0]).length - 1));
				    int i_28_
					= Math.max(0,
						   Math.min(i_23_,
							    (is[i_15_].length
							     - 1)));
				    int i_29_
					= Math.max(0,
						   Math.min(i_25_,
							    (is[i_15_]
							     [0]).length - 1));
				    for (/**/; i_26_ <= i_28_; i_26_++) {
					for (/**/; i_27_ <= i_29_; i_27_++)
					    is[i_15_][i_26_][i_27_] = i_5_;
				    }
				}
			    }
			}
			is[i_15_][i_8_][i_11_] = i_5_;
			bool_14_ = true;
		    }
		}
	    }
	    if (bool_14_) {
		int i_30_ = client.aClass507_11137.method8358((byte) 74)
				.aClass161Array7226
				[Class677.anInt8619 * -1335910809 + 1]
				.method2577(i_8_, i_11_, (byte) 48);
		if (client.anIntArray11214[i] < i_30_)
		    client.anIntArray11214[i] = i_30_;
		int i_31_ = i_8_ << 9;
		int i_32_ = i_11_ << 9;
		if (client.anIntArray11215[i] > i_31_)
		    client.anIntArray11215[i] = i_31_;
		else if (client.anIntArray11316[i] < i_31_)
		    client.anIntArray11316[i] = i_31_;
		if (client.anIntArray11218[i] > i_32_)
		    client.anIntArray11218[i] = i_32_;
		else if (client.anIntArray11321[i] < i_32_)
		    client.anIntArray11321[i] = i_32_;
	    }
	    if (!bool_13_) {
		if (i_8_ >= 1 && i_5_ != (is[Class677.anInt8619 * -1335910809]
					  [i_8_ - 1][i_11_])) {
		    client.anIntArray11207[i_6_]
			= i_8_ - 1 | 0x120000 | ~0x2cffffff;
		    client.anIntArray11197[i_6_] = i_11_ | 0x130000;
		    i_6_ = 1 + i_6_ & 0xfff;
		    is[Class677.anInt8619 * -1335910809][i_8_ - 1][i_11_]
			= i_5_;
		}
		if (++i_11_ < client.aClass507_11137.method8352((byte) -21)) {
		    if (i_8_ - 1 >= 0
			&& i_5_ != (is[Class677.anInt8619 * -1335910809]
				    [i_8_ - 1][i_11_])
			&& ((class475.aByteArrayArrayArray5178
			     [Class677.anInt8619 * -1335910809][i_8_][i_11_])
			    & 0x4) == 0
			&& ((class475.aByteArrayArrayArray5178
			     [-1335910809 * Class677.anInt8619][i_8_ - 1]
			     [i_11_ - 1])
			    & 0x4) == 0) {
			client.anIntArray11207[i_6_]
			    = i_8_ - 1 | 0x120000 | 0x52000000;
			client.anIntArray11197[i_6_] = i_11_ | 0x130000;
			i_6_ = 1 + i_6_ & 0xfff;
			is[-1335910809 * Class677.anInt8619][i_8_ - 1][i_11_]
			    = i_5_;
		    }
		    if (i_5_
			!= is[-1335910809 * Class677.anInt8619][i_8_][i_11_]) {
			client.anIntArray11207[i_6_]
			    = i_8_ | 0x520000 | 0x13000000;
			client.anIntArray11197[i_6_] = i_11_ | 0x530000;
			i_6_ = i_6_ + 1 & 0xfff;
			is[Class677.anInt8619 * -1335910809][i_8_][i_11_]
			    = i_5_;
		    }
		    if ((1 + i_8_
			 < client.aClass507_11137.method8412(1840156052))
			&& i_5_ != (is[Class677.anInt8619 * -1335910809]
				    [1 + i_8_][i_11_])
			&& 0 == ((class475.aByteArrayArrayArray5178
				  [-1335910809 * Class677.anInt8619][i_8_]
				  [i_11_])
				 & 0x4)
			&& 0 == ((class475.aByteArrayArrayArray5178
				  [-1335910809 * Class677.anInt8619][1 + i_8_]
				  [i_11_ - 1])
				 & 0x4)) {
			client.anIntArray11207[i_6_]
			    = i_8_ + 1 | 0x520000 | ~0x6dffffff;
			client.anIntArray11197[i_6_] = i_11_ | 0x530000;
			i_6_ = i_6_ + 1 & 0xfff;
			is[Class677.anInt8619 * -1335910809][1 + i_8_][i_11_]
			    = i_5_;
		    }
		}
		i_11_--;
		if (i_8_ + 1 < client.aClass507_11137.method8412(667694111)
		    && i_5_ != (is[Class677.anInt8619 * -1335910809][i_8_ + 1]
				[i_11_])) {
		    client.anIntArray11207[i_6_]
			= i_8_ + 1 | 0x920000 | 0x53000000;
		    client.anIntArray11197[i_6_] = i_11_ | 0x930000;
		    i_6_ = 1 + i_6_ & 0xfff;
		    is[Class677.anInt8619 * -1335910809][i_8_ + 1][i_11_]
			= i_5_;
		}
		if (--i_11_ >= 0) {
		    if (i_8_ - 1 >= 0
			&& (is[-1335910809 * Class677.anInt8619][i_8_ - 1]
			    [i_11_]) != i_5_
			&& ((class475.aByteArrayArrayArray5178
			     [-1335910809 * Class677.anInt8619][i_8_][i_11_])
			    & 0x4) == 0
			&& 0 == ((class475.aByteArrayArrayArray5178
				  [Class677.anInt8619 * -1335910809][i_8_ - 1]
				  [i_11_ + 1])
				 & 0x4)) {
			client.anIntArray11207[i_6_]
			    = i_8_ - 1 | 0xd20000 | 0x12000000;
			client.anIntArray11197[i_6_] = i_11_ | 0xd30000;
			i_6_ = i_6_ + 1 & 0xfff;
			is[-1335910809 * Class677.anInt8619][i_8_ - 1][i_11_]
			    = i_5_;
		    }
		    if (i_5_
			!= is[-1335910809 * Class677.anInt8619][i_8_][i_11_]) {
			client.anIntArray11207[i_6_]
			    = i_8_ | 0xd20000 | ~0x6cffffff;
			client.anIntArray11197[i_6_] = i_11_ | 0xd30000;
			i_6_ = 1 + i_6_ & 0xfff;
			is[Class677.anInt8619 * -1335910809][i_8_][i_11_]
			    = i_5_;
		    }
		    if ((1 + i_8_
			 < client.aClass507_11137.method8412(1158344691))
			&& (is[-1335910809 * Class677.anInt8619][i_8_ + 1]
			    [i_11_]) != i_5_
			&& 0 == ((class475.aByteArrayArrayArray5178
				  [Class677.anInt8619 * -1335910809][i_8_]
				  [i_11_])
				 & 0x4)
			&& 0 == ((class475.aByteArrayArrayArray5178
				  [-1335910809 * Class677.anInt8619][i_8_ + 1]
				  [1 + i_11_])
				 & 0x4)) {
			client.anIntArray11207[i_6_]
			    = 1 + i_8_ | 0x920000 | ~0x2dffffff;
			client.anIntArray11197[i_6_] = i_11_ | 0x930000;
			i_6_ = 1 + i_6_ & 0xfff;
			is[Class677.anInt8619 * -1335910809][i_8_ + 1][i_11_]
			    = i_5_;
		    }
		}
	    }
	}
	if (client.anIntArray11214[i] != -1000000) {
	    client.anIntArray11214[i] += 40;
	    client.anIntArray11215[i] -= 512;
	    client.anIntArray11316[i] += 512;
	    client.anIntArray11321[i] += 512;
	    client.anIntArray11218[i] -= 512;
	}
	return true;
    }
    
    public static void method6666(String string, boolean bool,
				  boolean bool_33_, byte i) {
	do {
	    try {
		if (string.equalsIgnoreCase("commands")
		    || string.equalsIgnoreCase("help")) {
		    Class268.method4961("commands - This command", 1684994120);
		    Class268.method4961("cls - Clear console", 1419276196);
		    Class268.method4961
			("displayfps - Toggle FPS and other information",
			 2145972766);
		    Class268.method4961
			("renderer - Print graphics renderer information",
			 2132796043);
		    Class268.method4961("heap - Print java memory information",
					2045777726);
		    Class268.method4961
			("getcamerapos - Print location and direction of camera for use in bug reports",
			 2130800034);
		} else if (string.equalsIgnoreCase("cls")) {
		    Class116.anInt1412 = 0;
		    Class116.anInt1413 = 0;
		} else if (string.equalsIgnoreCase("displayfps")) {
		    client.aBool11086 = !client.aBool11086;
		    if (client.aBool11086)
			Class268.method4961("FPS on", 1706269098);
		    else
			Class268.method4961("FPS off", 1852464002);
		} else if (string.equals("renderer")) {
		    Class170 class170 = Class501.aClass182_5564.method3130();
		    Class268.method4961(new StringBuilder().append
					    ("Toolkit ID: ").append
					    (Class198_Sub13
						 .aClass525_Sub30_9973
						 .aClass696_Sub20_10708
						 .method17160(-738190797))
					    .toString(),
					1932512168);
		    Class268.method4961(new StringBuilder().append
					    ("Vendor: ").append
					    (class170.anInt1850 * -1809895579)
					    .toString(),
					1912941961);
		    Class268.method4961(new StringBuilder().append
					    ("Name: ").append
					    (class170.aString1851).toString(),
					1528888229);
		    Class268.method4961(new StringBuilder().append
					    ("Version: ").append
					    (-118228173 * class170.anInt1852)
					    .toString(),
					2141753477);
		    Class268.method4961(new StringBuilder().append
					    ("Device: ").append
					    (class170.aString1853).toString(),
					1851874144);
		    Class268.method4961(new StringBuilder().append
					    ("Driver Version: ").append
					    (4822213046138725271L
					     * class170.aLong1854)
					    .toString(),
					1368195709);
		    String string_34_ = Class501.aClass182_5564.method3265();
		    if (string_34_.length() > 0)
			Class268.method4961(string_34_, 2108983842);
		} else if (string.equals("heap"))
		    Class268.method4961(new StringBuilder().append
					    ("Heap: ").append
					    (-855455283 * Class503.anInt5590)
					    .append
					    ("MB").toString(),
					1602328778);
		else {
		    if (!string.equalsIgnoreCase("getcamerapos"))
			break;
		    Class600 class600
			= client.aClass507_11137.method8350(-1425384183);
		    if (5 == -174799205 * Class700.anInt8779) {
			Class446 class446 = Class453_Sub3
						.aClass309_Sub1_10316
						.method5486(-1195745812);
			Class446 class446_35_
			    = Class453_Sub3.aClass309_Sub1_10316
				  .method5488(-1900158854);
			Class268.method4961
			    (new StringBuilder().append("Pos: ").append
				 (new Class600
				      ((Class581
					.aClass656_Sub1_Sub3_Sub1_Sub1_7705
					.aByte10867),
				       (int) class446.aFloat4895 >> 9,
				       (int) class446.aFloat4897 >> 9)
				      .toString())
				 .append
				 (" Height: ").append
				 ((Class335.method5855
				   (((int) class446.aFloat4895
				     - (class600.anInt7858 * -1227002079
					<< 9)),
				    ((int) class446.aFloat4897
				     - (class600.anInt7860 * 1429253007 << 9)),
				    (Class581
				     .aClass656_Sub1_Sub3_Sub1_Sub1_7705
				     .aByte10867),
				    2020563229)) + (int) class446.aFloat4896)
				 .toString(),
			     1424446371);
			Class268.method4961
			    (new StringBuilder().append("Look: ").append
				 (new Class600
				      ((Class581
					.aClass656_Sub1_Sub3_Sub1_Sub1_7705
					.aByte10867),
				       (int) class446_35_.aFloat4895 >> 9,
				       (int) class446_35_.aFloat4897 >> 9)
				      .toString())
				 .append
				 (" Height: ").append
				 ((Class335.method5855
				   (((int) class446_35_.aFloat4895
				     - (class600.anInt7858 * -1227002079
					<< 9)),
				    ((int) class446.aFloat4897
				     - (1429253007 * class600.anInt7860 << 9)),
				    (Class581
				     .aClass656_Sub1_Sub3_Sub1_Sub1_7705
				     .aByte10867),
				    2020563229)) + (int) class446.aFloat4896)
				 .toString(),
			     1862088626);
		    } else {
			Class268.method4961
			    (new StringBuilder().append("Pos: ").append
				 (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
				  .aByte10867)
				 .append
				 (",").append
				 ((class600.anInt7858 * -1227002079
				   + (-469853907 * Class477.anInt5200 >> 9))
				  >> 6)
				 .append
				 (",").append
				 (((-1889707729 * Class475.anInt5179 >> 9)
				   + 1429253007 * class600.anInt7860) >> 6)
				 .append
				 (",").append
				 (((-469853907 * Class477.anInt5200 >> 9)
				   + -1227002079 * class600.anInt7858) & 0x3f)
				 .append
				 (",").append
				 ((class600.anInt7860 * 1429253007
				   + (Class475.anInt5179 * -1889707729 >> 9))
				  & 0x3f)
				 .append
				 (" Height: ").append
				 ((Class335.method5855
				   (Class477.anInt5200 * -469853907,
				    -1889707729 * Class475.anInt5179,
				    (Class581
				     .aClass656_Sub1_Sub3_Sub1_Sub1_7705
				     .aByte10867),
				    2020563229))
				  - Class575.anInt7648 * -142598869)
				 .toString(),
			     1600441524);
			Class268.method4961
			    (new StringBuilder().append("Look: ").append
				 (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
				  .aByte10867)
				 .append
				 (",").append
				 ((-1227002079 * class600.anInt7858
				   + Class326.anInt3562 * -130227567) >> 6)
				 .append
				 (",").append
				 ((1105240097 * Class198_Sub16.anInt9979
				   + class600.anInt7860 * 1429253007) >> 6)
				 .append
				 (",").append
				 ((-1227002079 * class600.anInt7858
				   + -130227567 * Class326.anInt3562) & 0x3f)
				 .append
				 (",").append
				 ((class600.anInt7860 * 1429253007
				   + Class198_Sub16.anInt9979 * 1105240097)
				  & 0x3f)
				 .append
				 (" Height: ").append
				 ((Class335.method5855
				   (-130227567 * Class326.anInt3562,
				    Class198_Sub16.anInt9979 * 1105240097,
				    (Class581
				     .aClass656_Sub1_Sub3_Sub1_Sub1_7705
				     .aByte10867),
				    2020563229))
				  - Class350_Sub2.anInt10225 * -458002533)
				 .toString(),
			     1345982661);
		    }
		}
	    } catch (Exception exception) {
		Class268.method4961
		    (Class53.aClass53_381.method1169(Class21.aClass666_213,
						     1552651121),
		     1906724669);
	    }
	    return;
	} while (false);
	if (Class685.aClass685_8686 != Class176.aClass685_1884
	    || 619753713 * client.anInt11231 >= 2) {
	    try {
		if (string.equalsIgnoreCase("wm1")) {
		    Class332_Sub1.method15672(1, -1, -1, false, (byte) -93);
		    if (Class441.method7120((byte) -5) == 1)
			Class268.method4961("Success", 1695169150);
		    else
			Class268.method4961("Failure", 1563143837);
		    return;
		}
		if (string.equalsIgnoreCase("wm2")) {
		    Class332_Sub1.method15672(2, -1, -1, false, (byte) 92);
		    if (Class441.method7120((byte) -101) == 2)
			Class268.method4961("Success", 1804697735);
		    else
			Class268.method4961("Failure", 1823289058);
		    return;
		}
		if (Class695.aBool8757 && string.equalsIgnoreCase("wm3")) {
		    Class332_Sub1.method15672(3, 1024, 768, false, (byte) -3);
		    if (Class441.method7120((byte) -75) == 3)
			Class268.method4961("Success", 1509595700);
		    else
			Class268.method4961("Failure", 1448796065);
		    return;
		}
		if (string.startsWith("setlobby ")) {
		    if (client.anInt11075 * 1777895575 != 1)
			Class268.method4961("Failure", 1833152671);
		    else {
			int i_36_ = -1;
			Object object = null;
			string = string.substring(9);
			int i_37_ = string.indexOf(' ');
			if (i_37_ == -1)
			    Class268.method4961("Failure", 1996030693);
			else {
			    try {
				i_36_ = (Integer.parseInt
					 (string.substring(0, i_37_)));
			    } catch (NumberFormatException numberformatexception) {
				/* empty */
			    }
			    if (i_36_ == -1)
				Class268.method4961("Failure", 1811779570);
			    else {
				String string_38_
				    = new StringBuilder().append
					  (string.substring(i_37_ + 1).trim())
					  .append
					  (".runescape.com").toString();
				Class547.method9102(string_38_, i_36_,
						    (byte) 91);
				Class268.method4961("Success", 1991288607);
				return;
			    }
			    return;
			}
			return;
		    }
		    return;
		}
		if (string.equalsIgnoreCase("tk0")) {
		    Class217.method4146(0, false, (byte) -86);
		    if (Class198_Sub13.aClass525_Sub30_9973
			    .aClass696_Sub20_10708.method17160(1199642096)
			== 0) {
			Class268.method4961("Success", 1849515941);
			Class198_Sub13.aClass525_Sub30_9973.method16502
			    ((Class198_Sub13.aClass525_Sub30_9973
			      .aClass696_Sub20_10701),
			     0, (byte) -124);
			Class650.method10715(-1758466106);
			client.aBool11084 = false;
		    } else
			Class268.method4961("Failure", 1992712205);
		    return;
		}
		if (string.equalsIgnoreCase("tk1")) {
		    Class217.method4146(1, false, (byte) -23);
		    if (Class198_Sub13.aClass525_Sub30_9973
			    .aClass696_Sub20_10708.method17160(-705185268)
			== 1) {
			Class268.method4961("Success", 1295660545);
			Class198_Sub13.aClass525_Sub30_9973.method16502
			    ((Class198_Sub13.aClass525_Sub30_9973
			      .aClass696_Sub20_10701),
			     1, (byte) -110);
			Class650.method10715(-1758466106);
			client.aBool11084 = false;
		    } else
			Class268.method4961("Failure", 2137811920);
		    return;
		}
		if (string.equalsIgnoreCase("tk3")) {
		    Class217.method4146(3, false, (byte) -65);
		    if (Class198_Sub13.aClass525_Sub30_9973
			    .aClass696_Sub20_10708.method17160(-615926499)
			== 3) {
			Class268.method4961("Success", 2034106102);
			Class198_Sub13.aClass525_Sub30_9973.method16502
			    ((Class198_Sub13.aClass525_Sub30_9973
			      .aClass696_Sub20_10701),
			     3, (byte) -105);
			Class650.method10715(-1758466106);
			client.aBool11084 = false;
		    } else
			Class268.method4961("Failure", 1619955567);
		    return;
		}
		if (string.equalsIgnoreCase("tk5")) {
		    Class217.method4146(5, false, (byte) -74);
		    if (Class198_Sub13.aClass525_Sub30_9973
			    .aClass696_Sub20_10708.method17160(-2018294882)
			== 5) {
			Class268.method4961("Success", 1928635850);
			Class198_Sub13.aClass525_Sub30_9973.method16502
			    ((Class198_Sub13.aClass525_Sub30_9973
			      .aClass696_Sub20_10701),
			     5, (byte) -83);
			Class650.method10715(-1758466106);
			client.aBool11084 = false;
		    } else
			Class268.method4961("Failure", 1511534434);
		    return;
		}
		if (string.equalsIgnoreCase("clientdrop")) {
		    if (client.anInt11075 * 1777895575 == 7)
			Class196.method3742((byte) -106);
		    else if (client.anInt11075 * 1777895575 == 4)
			client.aClass96_11085.aBool1184 = true;
		    return;
		}
		if (string.equalsIgnoreCase("breakcon")) {
		    Class96[] class96s = client.aClass96Array11133;
		    for (int i_39_ = 0; i_39_ < class96s.length; i_39_++) {
			Class96 class96 = class96s[i_39_];
			if (class96.method1799((byte) 0) != null)
			    class96.method1799((byte) 0).method9378((byte) 94);
		    }
		    Class94.aClass463_912.method7622(1969737582);
		    return;
		}
		if (string.startsWith("getclientvarpbit")) {
		    int i_40_ = Integer.parseInt(string.substring(17));
		    Class268.method4961
			(new StringBuilder().append("varpbit=").append
			     (Class532.aClass111_7170.method93
			      (Class532.aClass111_7170.method124(i_40_,
								 -1125805836),
			       (byte) 2))
			     .toString(),
			 1475110274);
		    return;
		}
		if (string.startsWith("getclientvarp")) {
		    int i_41_ = Integer.parseInt(string.substring(14));
		    Class268.method4961(new StringBuilder().append("varp=")
					    .append
					    (Class532.aClass111_7170.method104
					     ((Class532.aClass111_7170
						   .method119
					       (Class453.aClass453_4939, i_41_,
						-1987387303)),
					      623775022))
					    .toString(),
					1789796625);
		    return;
		}
		if (string.startsWith("directlogin")) {
		    String[] strings
			= Class481.method7829(string.substring(12), ' ',
					      842449020);
		    if (strings.length == 2 || 3 == strings.length) {
			if (Class198_Sub4.method15613(-492271742))
			    Class280.method5162((byte) 10);
			Class350.method6154(strings[0], strings[1],
					    (strings.length > 2 ? strings[2]
					     : ""),
					    true, (byte) 0);
		    }
		    return;
		}
		if (string.startsWith("snlogin ")) {
		    String[] strings = Class481.method7829(string.substring(8),
							   ' ', 132968980);
		    int i_42_ = Integer.parseInt(strings[0]);
		    String string_43_ = strings.length > 1 ? strings[1] : "";
		    Class696_Sub33.method17276(i_42_, string_43_, true,
					       705460521);
		    return;
		}
		if (string.startsWith("setoutput ")) {
		    File file = new File(string.substring(10));
		    if (file.exists()) {
			file = new File(new StringBuilder().append
					    (string.substring(10)).append
					    (".").append
					    (Class251.method4508((byte) 8))
					    .append
					    (".log").toString());
			if (file.exists()) {
			    Class268.method4961("file already exists!",
						1480076518);
			    return;
			}
		    }
		    if (null != Class525_Sub7_Sub11.aFileOutputStream11721) {
			Class525_Sub7_Sub11.aFileOutputStream11721.close();
			Class525_Sub7_Sub11.aFileOutputStream11721 = null;
		    }
		    try {
			Class525_Sub7_Sub11.aFileOutputStream11721
			    = new FileOutputStream(file);
		    } catch (FileNotFoundException filenotfoundexception) {
			Class268.method4961(new StringBuilder().append
						("Could not create ").append
						(file.getName()).toString(),
					    1540169750);
		    } catch (SecurityException securityexception) {
			Class268.method4961(new StringBuilder().append
						("Cannot write to ").append
						(file.getName()).toString(),
					    2000638556);
		    }
		    return;
		}
		if (string.equals("closeoutput")) {
		    if (Class525_Sub7_Sub11.aFileOutputStream11721 != null)
			Class525_Sub7_Sub11.aFileOutputStream11721.close();
		    Class525_Sub7_Sub11.aFileOutputStream11721 = null;
		    return;
		}
		if (string.startsWith("runscript ")) {
		    File file = new File(string.substring(10));
		    if (!file.exists()) {
			Class268.method4961("No such file", 1340404472);
			return;
		    }
		    byte[] is = Class646.method10692(file, (byte) 63);
		    if (is == null) {
			Class268.method4961("Failed to read file", 1789250436);
			return;
		    }
		    String[] strings = (Class481.method7829
					((Class654.method10800
					  (Class540.method8891(is, -126630903),
					   '\r', "", 1987149335)),
					 '\n', -345236098));
		    Class707.method14322(strings, 1052289907);
		}
		if (7 == 1777895575 * client.anInt11075
		    || 1777895575 * client.anInt11075 == 16) {
		    Class96 class96 = Class111.method1979(946434244);
		    Class525_Sub15 class525_sub15
			= Class16.method767(Class412.aClass412_4271,
					    class96.aClass6_1169, 1977859884);
		    class525_sub15.aClass525_Sub38_Sub2_10546
			.method16735(string.length() + 3, -1134758370);
		    class525_sub15.aClass525_Sub38_Sub2_10546
			.method16735(bool ? 1 : 0, -1236221123);
		    class525_sub15.aClass525_Sub38_Sub2_10546
			.method16735(bool_33_ ? 1 : 0, -363035202);
		    class525_sub15.aClass525_Sub38_Sub2_10546
			.method16700(string, 782349093);
		    class96.method1794(class525_sub15, (short) 25904);
		}
	    } catch (Exception exception) {
		Class268.method4961
		    (Class53.aClass53_381.method1169(Class21.aClass666_213,
						     1552651121),
		     1501844057);
		return;
	    }
	}
	if (7 != 1777895575 * client.anInt11075
	    && 1777895575 * client.anInt11075 != 16)
	    Class268.method4961
		(new StringBuilder().append
		     (Class53.aClass53_466.method1169(Class21.aClass666_213,
						      1552651121))
		     .append
		     (string).toString(),
		 2119260401);
    }
}
