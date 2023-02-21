/* Class713 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class713
{
    public static short[] method14456(short[] is) {
	if (is == null)
	    return null;
	short[] is_0_ = new short[is.length];
	System.arraycopy(is, 0, is_0_, 0, is.length);
	return is_0_;
    }
    
    public static byte[] method14457(byte[] is) {
	if (is == null)
	    return null;
	byte[] is_1_ = new byte[is.length];
	System.arraycopy(is, 0, is_1_, 0, is.length);
	return is_1_;
    }
    
    Class713() throws Throwable {
	throw new Error();
    }
    
    public static Class56[] method14458(byte i) {
	return new Class56[] { Class56.aClass56_601, Class56.aClass56_569,
			       Class56.aClass56_570, Class56.aClass56_571,
			       Class56.aClass56_568, Class56.aClass56_582,
			       Class56.aClass56_574, Class56.aClass56_612,
			       Class56.aClass56_583, Class56.aClass56_577,
			       Class56.aClass56_593, Class56.aClass56_579,
			       Class56.aClass56_575, Class56.aClass56_578,
			       Class56.aClass56_585, Class56.aClass56_573,
			       Class56.aClass56_584, Class56.aClass56_608,
			       Class56.aClass56_586, Class56.aClass56_590,
			       Class56.aClass56_588, Class56.aClass56_589,
			       Class56.aClass56_572, Class56.aClass56_591,
			       Class56.aClass56_592, Class56.aClass56_576,
			       Class56.aClass56_596, Class56.aClass56_595,
			       Class56.aClass56_587, Class56.aClass56_580,
			       Class56.aClass56_598, Class56.aClass56_599,
			       Class56.aClass56_600, Class56.aClass56_602,
			       Class56.aClass56_594, Class56.aClass56_603,
			       Class56.aClass56_604, Class56.aClass56_605,
			       Class56.aClass56_606, Class56.aClass56_607,
			       Class56.aClass56_581, Class56.aClass56_609,
			       Class56.aClass56_610 };
    }
    
    static int method14459
	(Class656_Sub1_Sub3_Sub1_Sub1 class656_sub1_sub3_sub1_sub1, int i) {
	int i_2_ = class656_sub1_sub3_sub1_sub1.anInt12238 * 2025647547;
	Class586 class586
	    = class656_sub1_sub3_sub1_sub1.method18633((byte) -100);
	int i_3_ = class656_sub1_sub3_sub1_sub1.aClass689_Sub1_11986
		       .method14048(-601800632);
	if (i_3_ == -1
	    || class656_sub1_sub3_sub1_sub1.aClass689_Sub1_11986.aBool11017)
	    i_2_ = -1422129767 * class656_sub1_sub3_sub1_sub1.anInt12247;
	else if (i_3_ == class586.anInt7737 * 1543647097
		 || i_3_ == 1757568299 * class586.anInt7738
		 || i_3_ == 847346181 * class586.anInt7740
		 || i_3_ == class586.anInt7749 * -323002495)
	    i_2_ = 1428343353 * class656_sub1_sub3_sub1_sub1.anInt12248;
	else if (i_3_ == 323075315 * class586.anInt7741
		 || class586.anInt7742 * -1270065645 == i_3_
		 || i_3_ == class586.anInt7744 * -880993293
		 || -1559403155 * class586.anInt7762 == i_3_)
	    i_2_ = 2100329717 * class656_sub1_sub3_sub1_sub1.anInt12245;
	return i_2_;
    }
    
    public static boolean method14460(char c, int i) {
	return c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z';
    }
}
