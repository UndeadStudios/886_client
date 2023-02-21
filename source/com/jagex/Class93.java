/* Class93 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Random;

public class Class93
{
    static Object anObject908 = new Object();
    static Random aRandom909;
    static int[] anIntArray910 = new int[33];
    
    static int method1705(int i, int i_0_) {
	int i_1_ = i >> 31 & i_0_ - 1;
	return (i + (i >>> 31)) % i_0_ + i_1_;
    }
    
    static {
	anIntArray910[0] = 0;
	int i = 2;
	for (int i_2_ = 1; i_2_ < 33; i_2_++) {
	    anIntArray910[i_2_] = i - 1;
	    i += i;
	}
    }
    
    public static int method1706(int i, int i_3_) {
	int i_4_ = 1;
	for (/**/; i_3_ > 1; i_3_ >>= 1) {
	    if ((i_3_ & 0x1) != 0)
		i_4_ *= i;
	    i *= i;
	}
	if (1 == i_3_)
	    return i * i_4_;
	return i_4_;
    }
    
    public static int method1707(int i) {
	return anIntArray910[i];
    }
    
    public static int method1708(int i) {
	return anIntArray910[i];
    }
    
    public static int method1709(int i) {
	return anIntArray910[i];
    }
    
    public static int method1710(int i) {
	i = (i & 0x55555555) + (i >>> 1 & 0x55555555);
	i = (i >>> 2 & 0x33333333) + (i & 0x33333333);
	i = (i >>> 4) + i & 0xf0f0f0f;
	i += i >>> 8;
	i += i >>> 16;
	return i & 0xff;
    }
    
    Class93() throws Throwable {
	throw new Error();
    }
    
    public static int method1711(int i) {
	i = (i & 0x55555555) + (i >>> 1 & 0x55555555);
	i = (i >>> 2 & 0x33333333) + (i & 0x33333333);
	i = (i >>> 4) + i & 0xf0f0f0f;
	i += i >>> 8;
	i += i >>> 16;
	return i & 0xff;
    }
    
    public static int method1712(int i, int i_5_, int i_6_) {
	int i_7_ = Class294.method5312(1 + (i_6_ - i_5_), (byte) 0);
	i_7_ <<= i_5_;
	i |= i_7_;
	return i;
    }
    
    public static int method1713(int i, int i_8_, int i_9_) {
	int i_10_ = Class294.method5312(1 + (i_9_ - i_8_), (byte) 0);
	i_10_ <<= i_8_;
	i |= i_10_;
	return i;
    }
    
    public static int method1714(int i) {
	int i_11_ = i >>> 1;
	i_11_ |= i_11_ >>> 1;
	i_11_ |= i_11_ >>> 2;
	i_11_ |= i_11_ >>> 4;
	i_11_ |= i_11_ >>> 8;
	i_11_ |= i_11_ >>> 16;
	return i & (i_11_ ^ 0xffffffff);
    }
    
    public static int method1715(int i, int i_12_, int i_13_) {
	int i_14_ = Class294.method5312(1 + (i_13_ - i_12_), (byte) 0);
	i_14_ <<= i_12_;
	i |= i_14_;
	return i;
    }
    
    public static int method1716(int i) {
	int i_15_ = i >>> 1;
	i_15_ |= i_15_ >>> 1;
	i_15_ |= i_15_ >>> 2;
	i_15_ |= i_15_ >>> 4;
	i_15_ |= i_15_ >>> 8;
	i_15_ |= i_15_ >>> 16;
	return i & (i_15_ ^ 0xffffffff);
    }
    
    public static int method1717(int i) {
	return anIntArray910[i];
    }
    
    public static int method1718(int i) {
	int i_16_ = i >>> 1;
	i_16_ |= i_16_ >>> 1;
	i_16_ |= i_16_ >>> 2;
	i_16_ |= i_16_ >>> 4;
	i_16_ |= i_16_ >>> 8;
	i_16_ |= i_16_ >>> 16;
	return i & (i_16_ ^ 0xffffffff);
    }
    
    public static int method1719(int i) {
	int i_17_ = i >>> 1;
	i_17_ |= i_17_ >>> 1;
	i_17_ |= i_17_ >>> 2;
	i_17_ |= i_17_ >>> 4;
	i_17_ |= i_17_ >>> 8;
	i_17_ |= i_17_ >>> 16;
	return i & (i_17_ ^ 0xffffffff);
    }
    
    public static boolean method1720(int i) {
	return i == (i & -i);
    }
    
    public static int method1721(int i, int i_18_) {
	int i_19_ = 0;
	for (/**/; i_18_ > 0; i_18_--) {
	    i_19_ = i_19_ << 1 | i & 0x1;
	    i >>>= 1;
	}
	return i_19_;
    }
    
    static int method1722(int i, int i_20_) {
	int i_21_ = i >> 31 & i_20_ - 1;
	return (i + (i >>> 31)) % i_20_ + i_21_;
    }
    
    public static int method1723(int i) {
	int i_22_ = 0;
	if (i < 0 || i >= 65536) {
	    i >>>= 16;
	    i_22_ += 16;
	}
	if (i >= 256) {
	    i >>>= 8;
	    i_22_ += 8;
	}
	if (i >= 16) {
	    i >>>= 4;
	    i_22_ += 4;
	}
	if (i >= 4) {
	    i >>>= 2;
	    i_22_ += 2;
	}
	if (i >= 1) {
	    i >>>= 1;
	    i_22_++;
	}
	return i_22_ + i;
    }
    
    public static int method1724(Random random, int i) {
	if (null == random) {
	    random = aRandom909;
	    if (random == null) {
		synchronized (anObject908) {
		    if (aRandom909 == null)
			aRandom909 = new Random();
		    random = aRandom909;
		}
	    }
	}
	if (i <= 0)
	    throw new IllegalArgumentException();
	if (Class72.method1537(i, (byte) 0))
	    return (int) (((long) random.nextInt() & 0xffffffffL) * (long) i
			  >> 32);
	int i_23_ = -2147483648 - (int) (4294967296L % (long) i);
	int i_24_;
	do
	    i_24_ = random.nextInt();
	while (i_24_ >= i_23_);
	return Class672.method11057(i_24_, i, 1785240173);
    }
    
    public static int method1725(Random random, int i) {
	if (null == random) {
	    random = aRandom909;
	    if (random == null) {
		synchronized (anObject908) {
		    if (aRandom909 == null)
			aRandom909 = new Random();
		    random = aRandom909;
		}
	    }
	}
	if (i <= 0)
	    throw new IllegalArgumentException();
	if (Class72.method1537(i, (byte) 0))
	    return (int) (((long) random.nextInt() & 0xffffffffL) * (long) i
			  >> 32);
	int i_25_ = -2147483648 - (int) (4294967296L % (long) i);
	int i_26_;
	do
	    i_26_ = random.nextInt();
	while (i_26_ >= i_25_);
	return Class672.method11057(i_26_, i, 1919672782);
    }
    
    static void method1726(Class683 class683, int i) {
	class683.anInt8644 -= -1723845246;
	String string
	    = ((String)
	       class683.anObjectArray8636[1373599041 * class683.anInt8644]);
	String string_27_ = (String) (class683.anObjectArray8636
				      [1373599041 * class683.anInt8644 + 1]);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class334.method5844(string, string_27_, (byte) -88);
    }
    
    public static void method1727(int[] is, int[] is_28_, int i) {
	if (is == null || null == is_28_) {
	    Class707.anIntArray8817 = null;
	    Class613.anIntArray8031 = null;
	    Class707.aByteArrayArrayArray8814 = null;
	} else {
	    Class707.anIntArray8817 = is;
	    Class613.anIntArray8031 = new int[is.length];
	    Class707.aByteArrayArrayArray8814 = new byte[is.length][][];
	    for (int i_29_ = 0; i_29_ < Class707.anIntArray8817.length;
		 i_29_++)
		Class707.aByteArrayArrayArray8814[i_29_]
		    = new byte[is_28_[i_29_]][];
	}
    }
    
    static int method1728(Interface18 interface18, Interface13 interface13,
			  byte i) {
	int i_30_ = 0;
	for (int i_31_ = 0; i_31_ < interface13.method72(-945966374);
	     i_31_++) {
	    Class269 class269
		= (Class269) interface13.method76(i_31_, 666725013);
	    if (class269.method4966(interface18, -972559734))
		i_30_ += class269.anInt2823 * 1578208537;
	}
	return i_30_;
    }
}
