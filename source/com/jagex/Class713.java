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
	return new Class56[] { Class56.idx_0, Class56.idx_1,
			       Class56.idx_2, Class56.idx_3,
			       Class56.idx_5, Class56.idx_7,
			       Class56.idx_8, Class56.idx_10,
			       Class56.idx_12, Class56.idx_13,
			       Class56.idx_14, Class56.idx_16,
			       Class56.idx_17, Class56.idx_18,
			       Class56.idx_19, Class56.idx_20,
			       Class56.idx_21, Class56.idx_22,
			       Class56.idx_23, Class56.idx_24,
			       Class56.idx_25, Class56.idx_26,
			       Class56.idx_27, Class56.idx_28,
			       Class56.idx_29, Class56.idx_30,
			       Class56.idx_31, Class56.idx_32,
			       Class56.idx_33, Class56.idx_34,
			       Class56.idx_35, Class56.idx_40,
			       Class56.idx_41, Class56.idx_42,
			       Class56.idx_43, Class56.idx_44,
			       Class56.idx_45, Class56.idx_46,
			       Class56.idx_47, Class56.idx_48,
			       Class56.idx_49, Class56.idx_50,
			       Class56.idx_51};
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
