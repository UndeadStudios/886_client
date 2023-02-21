/* Class707 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class707
{
    static byte[][] aByteArrayArray8810;
    static int anInt8811 = 0;
    static int anInt8812;
    static byte[][] aByteArrayArray8813;
    static byte[][][] aByteArrayArrayArray8814;
    static byte[][] aByteArrayArray8815;
    static int anInt8816 = 0;
    static int[] anIntArray8817;
    
    public static synchronized void method14308(byte[] is, byte i) {
	if (100 == is.length && anInt8811 * -1913925699 < 1000)
	    aByteArrayArray8813[(anInt8811 += 2142397333) * -1913925699 - 1]
		= is;
	else if (5000 == is.length && 1863978029 * anInt8816 < 250)
	    aByteArrayArray8810[(anInt8816 += 574366629) * 1863978029 - 1]
		= is;
	else if (is.length == 30000 && 1331537393 * anInt8812 < 50)
	    aByteArrayArray8815[(anInt8812 += 1274063633) * 1331537393 - 1]
		= is;
	else if (null != aByteArrayArrayArray8814) {
	    for (int i_0_ = 0; i_0_ < anIntArray8817.length; i_0_++) {
		if (anIntArray8817[i_0_] == is.length
		    && (Class613.anIntArray8031[i_0_]
			< aByteArrayArrayArray8814[i_0_].length)) {
		    aByteArrayArrayArray8814[i_0_]
			[Class613.anIntArray8031[i_0_]++]
			= is;
		    break;
		}
	    }
	}
    }
    
    public static synchronized byte[] method14309(int i, boolean bool,
						  int i_1_) {
	if ((100 == i || i < 100 && bool) && -1913925699 * anInt8811 > 0) {
	    byte[] is
		= aByteArrayArray8813[(anInt8811 -= 2142397333) * -1913925699];
	    aByteArrayArray8813[anInt8811 * -1913925699] = null;
	    return is;
	}
	if ((i == 5000 || i < 5000 && bool) && anInt8816 * 1863978029 > 0) {
	    byte[] is
		= aByteArrayArray8810[(anInt8816 -= 574366629) * 1863978029];
	    aByteArrayArray8810[anInt8816 * 1863978029] = null;
	    return is;
	}
	if ((i == 30000 || i < 30000 && bool) && anInt8812 * 1331537393 > 0) {
	    byte[] is
		= aByteArrayArray8815[(anInt8812 -= 1274063633) * 1331537393];
	    aByteArrayArray8815[anInt8812 * 1331537393] = null;
	    return is;
	}
	if (null != aByteArrayArrayArray8814) {
	    for (int i_2_ = 0; i_2_ < anIntArray8817.length; i_2_++) {
		if ((anIntArray8817[i_2_] == i
		     || i < anIntArray8817[i_2_] && bool)
		    && Class613.anIntArray8031[i_2_] > 0) {
		    byte[] is = (aByteArrayArrayArray8814[i_2_]
				 [--Class613.anIntArray8031[i_2_]]);
		    aByteArrayArrayArray8814[i_2_][(Class613.anIntArray8031
						    [i_2_])]
			= null;
		    return is;
		}
	    }
	}
	if (bool && null != anIntArray8817) {
	    for (int i_3_ = 0; i_3_ < anIntArray8817.length; i_3_++) {
		if (i <= anIntArray8817[i_3_]
		    && (Class613.anIntArray8031[i_3_]
			< aByteArrayArrayArray8814[i_3_].length))
		    return new byte[anIntArray8817[i_3_]];
	    }
	}
	return new byte[i];
    }
    
    public static synchronized byte[] method14310(int i, int i_4_) {
	return method14309(i, false, 295014839);
    }
    
    public static synchronized void method14311(byte[] is) {
	if (100 == is.length && anInt8811 * -1913925699 < 1000)
	    aByteArrayArray8813[(anInt8811 += 2142397333) * -1913925699 - 1]
		= is;
	else if (5000 == is.length && 1863978029 * anInt8816 < 250)
	    aByteArrayArray8810[(anInt8816 += 574366629) * 1863978029 - 1]
		= is;
	else if (is.length == 30000 && 1331537393 * anInt8812 < 50)
	    aByteArrayArray8815[(anInt8812 += 1274063633) * 1331537393 - 1]
		= is;
	else if (null != aByteArrayArrayArray8814) {
	    for (int i = 0; i < anIntArray8817.length; i++) {
		if (anIntArray8817[i] == is.length
		    && (Class613.anIntArray8031[i]
			< aByteArrayArrayArray8814[i].length)) {
		    aByteArrayArrayArray8814[i][Class613.anIntArray8031[i]++]
			= is;
		    break;
		}
	    }
	}
    }
    
    public static synchronized byte[] method14312(int i, boolean bool) {
	if ((100 == i || i < 100 && bool) && -1913925699 * anInt8811 > 0) {
	    byte[] is
		= aByteArrayArray8813[(anInt8811 -= 2142397333) * -1913925699];
	    aByteArrayArray8813[anInt8811 * -1913925699] = null;
	    return is;
	}
	if ((i == 5000 || i < 5000 && bool) && anInt8816 * 1863978029 > 0) {
	    byte[] is
		= aByteArrayArray8810[(anInt8816 -= 574366629) * 1863978029];
	    aByteArrayArray8810[anInt8816 * 1863978029] = null;
	    return is;
	}
	if ((i == 30000 || i < 30000 && bool) && anInt8812 * 1331537393 > 0) {
	    byte[] is
		= aByteArrayArray8815[(anInt8812 -= 1274063633) * 1331537393];
	    aByteArrayArray8815[anInt8812 * 1331537393] = null;
	    return is;
	}
	if (null != aByteArrayArrayArray8814) {
	    for (int i_5_ = 0; i_5_ < anIntArray8817.length; i_5_++) {
		if ((anIntArray8817[i_5_] == i
		     || i < anIntArray8817[i_5_] && bool)
		    && Class613.anIntArray8031[i_5_] > 0) {
		    byte[] is = (aByteArrayArrayArray8814[i_5_]
				 [--Class613.anIntArray8031[i_5_]]);
		    aByteArrayArrayArray8814[i_5_][(Class613.anIntArray8031
						    [i_5_])]
			= null;
		    return is;
		}
	    }
	}
	if (bool && null != anIntArray8817) {
	    for (int i_6_ = 0; i_6_ < anIntArray8817.length; i_6_++) {
		if (i <= anIntArray8817[i_6_]
		    && (Class613.anIntArray8031[i_6_]
			< aByteArrayArrayArray8814[i_6_].length))
		    return new byte[anIntArray8817[i_6_]];
	    }
	}
	return new byte[i];
    }
    
    static {
	anInt8812 = 0;
	aByteArrayArray8813 = new byte[1000][];
	aByteArrayArray8810 = new byte[250][];
	aByteArrayArray8815 = new byte[50][];
    }
    
    public static void method14313(int[] is, int[] is_7_) {
	if (is == null || null == is_7_) {
	    anIntArray8817 = null;
	    Class613.anIntArray8031 = null;
	    aByteArrayArrayArray8814 = null;
	} else {
	    anIntArray8817 = is;
	    Class613.anIntArray8031 = new int[is.length];
	    aByteArrayArrayArray8814 = new byte[is.length][][];
	    for (int i = 0; i < anIntArray8817.length; i++)
		aByteArrayArrayArray8814[i] = new byte[is_7_[i]][];
	}
    }
    
    public static synchronized byte[] method14314(int i, boolean bool) {
	if ((100 == i || i < 100 && bool) && -1913925699 * anInt8811 > 0) {
	    byte[] is
		= aByteArrayArray8813[(anInt8811 -= 2142397333) * -1913925699];
	    aByteArrayArray8813[anInt8811 * -1913925699] = null;
	    return is;
	}
	if ((i == 5000 || i < 5000 && bool) && anInt8816 * 1863978029 > 0) {
	    byte[] is
		= aByteArrayArray8810[(anInt8816 -= 574366629) * 1863978029];
	    aByteArrayArray8810[anInt8816 * 1863978029] = null;
	    return is;
	}
	if ((i == 30000 || i < 30000 && bool) && anInt8812 * 1331537393 > 0) {
	    byte[] is
		= aByteArrayArray8815[(anInt8812 -= 1274063633) * 1331537393];
	    aByteArrayArray8815[anInt8812 * 1331537393] = null;
	    return is;
	}
	if (null != aByteArrayArrayArray8814) {
	    for (int i_8_ = 0; i_8_ < anIntArray8817.length; i_8_++) {
		if ((anIntArray8817[i_8_] == i
		     || i < anIntArray8817[i_8_] && bool)
		    && Class613.anIntArray8031[i_8_] > 0) {
		    byte[] is = (aByteArrayArrayArray8814[i_8_]
				 [--Class613.anIntArray8031[i_8_]]);
		    aByteArrayArrayArray8814[i_8_][(Class613.anIntArray8031
						    [i_8_])]
			= null;
		    return is;
		}
	    }
	}
	if (bool && null != anIntArray8817) {
	    for (int i_9_ = 0; i_9_ < anIntArray8817.length; i_9_++) {
		if (i <= anIntArray8817[i_9_]
		    && (Class613.anIntArray8031[i_9_]
			< aByteArrayArrayArray8814[i_9_].length))
		    return new byte[anIntArray8817[i_9_]];
	    }
	}
	return new byte[i];
    }
    
    public static synchronized byte[] method14315(int i, boolean bool) {
	if ((100 == i || i < 100 && bool) && -1913925699 * anInt8811 > 0) {
	    byte[] is
		= aByteArrayArray8813[(anInt8811 -= 2142397333) * -1913925699];
	    aByteArrayArray8813[anInt8811 * -1913925699] = null;
	    return is;
	}
	if ((i == 5000 || i < 5000 && bool) && anInt8816 * 1863978029 > 0) {
	    byte[] is
		= aByteArrayArray8810[(anInt8816 -= 574366629) * 1863978029];
	    aByteArrayArray8810[anInt8816 * 1863978029] = null;
	    return is;
	}
	if ((i == 30000 || i < 30000 && bool) && anInt8812 * 1331537393 > 0) {
	    byte[] is
		= aByteArrayArray8815[(anInt8812 -= 1274063633) * 1331537393];
	    aByteArrayArray8815[anInt8812 * 1331537393] = null;
	    return is;
	}
	if (null != aByteArrayArrayArray8814) {
	    for (int i_10_ = 0; i_10_ < anIntArray8817.length; i_10_++) {
		if ((anIntArray8817[i_10_] == i
		     || i < anIntArray8817[i_10_] && bool)
		    && Class613.anIntArray8031[i_10_] > 0) {
		    byte[] is = (aByteArrayArrayArray8814[i_10_]
				 [--Class613.anIntArray8031[i_10_]]);
		    aByteArrayArrayArray8814[i_10_][(Class613.anIntArray8031
						     [i_10_])]
			= null;
		    return is;
		}
	    }
	}
	if (bool && null != anIntArray8817) {
	    for (int i_11_ = 0; i_11_ < anIntArray8817.length; i_11_++) {
		if (i <= anIntArray8817[i_11_]
		    && (Class613.anIntArray8031[i_11_]
			< aByteArrayArrayArray8814[i_11_].length))
		    return new byte[anIntArray8817[i_11_]];
	    }
	}
	return new byte[i];
    }
    
    public static synchronized byte[] method14316(int i, boolean bool) {
	if ((100 == i || i < 100 && bool) && -1913925699 * anInt8811 > 0) {
	    byte[] is
		= aByteArrayArray8813[(anInt8811 -= 2142397333) * -1913925699];
	    aByteArrayArray8813[anInt8811 * -1913925699] = null;
	    return is;
	}
	if ((i == 5000 || i < 5000 && bool) && anInt8816 * 1863978029 > 0) {
	    byte[] is
		= aByteArrayArray8810[(anInt8816 -= 574366629) * 1863978029];
	    aByteArrayArray8810[anInt8816 * 1863978029] = null;
	    return is;
	}
	if ((i == 30000 || i < 30000 && bool) && anInt8812 * 1331537393 > 0) {
	    byte[] is
		= aByteArrayArray8815[(anInt8812 -= 1274063633) * 1331537393];
	    aByteArrayArray8815[anInt8812 * 1331537393] = null;
	    return is;
	}
	if (null != aByteArrayArrayArray8814) {
	    for (int i_12_ = 0; i_12_ < anIntArray8817.length; i_12_++) {
		if ((anIntArray8817[i_12_] == i
		     || i < anIntArray8817[i_12_] && bool)
		    && Class613.anIntArray8031[i_12_] > 0) {
		    byte[] is = (aByteArrayArrayArray8814[i_12_]
				 [--Class613.anIntArray8031[i_12_]]);
		    aByteArrayArrayArray8814[i_12_][(Class613.anIntArray8031
						     [i_12_])]
			= null;
		    return is;
		}
	    }
	}
	if (bool && null != anIntArray8817) {
	    for (int i_13_ = 0; i_13_ < anIntArray8817.length; i_13_++) {
		if (i <= anIntArray8817[i_13_]
		    && (Class613.anIntArray8031[i_13_]
			< aByteArrayArrayArray8814[i_13_].length))
		    return new byte[anIntArray8817[i_13_]];
	    }
	}
	return new byte[i];
    }
    
    Class707() throws Throwable {
	throw new Error();
    }
    
    public static synchronized byte[] method14317(int i) {
	return method14309(i, false, 1888250211);
    }
    
    public static synchronized byte[] method14318(int i) {
	return method14309(i, false, 1019787107);
    }
    
    public static synchronized void method14319(byte[] is) {
	if (100 == is.length && anInt8811 * -1913925699 < 1000)
	    aByteArrayArray8813[(anInt8811 += 2142397333) * -1913925699 - 1]
		= is;
	else if (5000 == is.length && 1863978029 * anInt8816 < 250)
	    aByteArrayArray8810[(anInt8816 += 574366629) * 1863978029 - 1]
		= is;
	else if (is.length == 30000 && 1331537393 * anInt8812 < 50)
	    aByteArrayArray8815[(anInt8812 += 1274063633) * 1331537393 - 1]
		= is;
	else if (null != aByteArrayArrayArray8814) {
	    for (int i = 0; i < anIntArray8817.length; i++) {
		if (anIntArray8817[i] == is.length
		    && (Class613.anIntArray8031[i]
			< aByteArrayArrayArray8814[i].length)) {
		    aByteArrayArrayArray8814[i][Class613.anIntArray8031[i]++]
			= is;
		    break;
		}
	    }
	}
    }
    
    public static synchronized void method14320(byte[] is) {
	if (100 == is.length && anInt8811 * -1913925699 < 1000)
	    aByteArrayArray8813[(anInt8811 += 2142397333) * -1913925699 - 1]
		= is;
	else if (5000 == is.length && 1863978029 * anInt8816 < 250)
	    aByteArrayArray8810[(anInt8816 += 574366629) * 1863978029 - 1]
		= is;
	else if (is.length == 30000 && 1331537393 * anInt8812 < 50)
	    aByteArrayArray8815[(anInt8812 += 1274063633) * 1331537393 - 1]
		= is;
	else if (null != aByteArrayArrayArray8814) {
	    for (int i = 0; i < anIntArray8817.length; i++) {
		if (anIntArray8817[i] == is.length
		    && (Class613.anIntArray8031[i]
			< aByteArrayArrayArray8814[i].length)) {
		    aByteArrayArrayArray8814[i][Class613.anIntArray8031[i]++]
			= is;
		    break;
		}
	    }
	}
    }
    
    static Class84[] method14321(int i) {
	return new Class84[] { Class84.aClass84_860, Class84.aClass84_883,
			       Class84.aClass84_874, Class84.aClass84_881,
			       Class84.aClass84_857, Class84.aClass84_862,
			       Class84.aClass84_868, Class84.aClass84_876,
			       Class84.aClass84_880, Class84.aClass84_869,
			       Class84.aClass84_859, Class84.aClass84_864,
			       Class84.aClass84_871, Class84.aClass84_856,
			       Class84.aClass84_867, Class84.aClass84_853,
			       Class84.aClass84_861, Class84.aClass84_854,
			       Class84.aClass84_879, Class84.aClass84_855,
			       Class84.aClass84_873, Class84.aClass84_866,
			       Class84.aClass84_863, Class84.aClass84_878,
			       Class84.aClass84_858, Class84.aClass84_872,
			       Class84.aClass84_870, Class84.aClass84_882,
			       Class84.aClass84_875, Class84.aClass84_865,
			       Class84.aClass84_877 };
    }
    
    static void method14322(String[] strings, int i) {
	if (strings.length > 1) {
	    for (int i_14_ = 0; i_14_ < strings.length; i_14_++) {
		if (strings[i_14_].startsWith("pause")) {
		    int i_15_ = 5;
		    try {
			i_15_ = Integer.parseInt(strings[i_14_].substring(6));
		    } catch (Exception exception) {
			/* empty */
		    }
		    Class268.method4961(new StringBuilder().append
					    ("Pausing for ").append
					    (i_15_).append
					    (" seconds...").toString(),
					1775003657);
		    Class95.aStringArray1126 = strings;
		    Class116.anInt1419 = 1709148145 * (i_14_ + 1);
		    Class41.aLong337
			= (Class251.method4508((byte) 8)
			   + (long) (1000 * i_15_)) * -3188431922941586339L;
		    break;
		}
		Class116.aString1414 = strings[i_14_];
		Class655.method10814(false, 1883442868);
	    }
	} else {
	    Class116.aString1414
		= new StringBuilder().append(Class116.aString1414).append
		      (strings[0]).toString();
	    Class116.anInt1420 += strings[0].length() * -2087599183;
	}
    }
}
