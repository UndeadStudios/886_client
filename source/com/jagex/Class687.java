/* Class687 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class687
{
    static char[] aCharArray8705 = new char[64];
    static char[] aCharArray8706;
    static char[] aCharArray8707;
    static int[] anIntArray8708;
    
    static String method14009(byte[] is, int i, int i_0_) {
	StringBuilder stringbuilder = new StringBuilder();
	for (int i_1_ = i; i_1_ < i + i_0_; i_1_ += 3) {
	    int i_2_ = is[i_1_] & 0xff;
	    stringbuilder.append(aCharArray8705[i_2_ >>> 2]);
	    if (i_1_ < i_0_ - 1) {
		int i_3_ = is[1 + i_1_] & 0xff;
		stringbuilder
		    .append(aCharArray8705[(i_2_ & 0x3) << 4 | i_3_ >>> 4]);
		if (i_1_ < i_0_ - 2) {
		    int i_4_ = is[2 + i_1_] & 0xff;
		    stringbuilder.append
			(aCharArray8705[(i_3_ & 0xf) << 2 | i_4_ >>> 6])
			.append(aCharArray8705[i_4_ & 0x3f]);
		} else
		    stringbuilder.append(aCharArray8705[(i_3_ & 0xf) << 2])
			.append('=');
	    } else
		stringbuilder.append(aCharArray8705[(i_2_ & 0x3) << 4]).append
		    ('=').append('=');
	}
	return stringbuilder.toString();
    }
    
    Class687() throws Throwable {
	throw new Error();
    }
    
    public static String method14010(byte[] is) {
	return Class526.method8780(is, 0, is.length, (byte) 9);
    }
    
    public static String method14011(byte[] is) {
	return Class526.method8780(is, 0, is.length, (byte) 9);
    }
    
    static String method14012(byte[] is, int i, int i_5_) {
	StringBuilder stringbuilder = new StringBuilder();
	for (int i_6_ = i; i_6_ < i + i_5_; i_6_ += 3) {
	    int i_7_ = is[i_6_] & 0xff;
	    stringbuilder.append(aCharArray8705[i_7_ >>> 2]);
	    if (i_6_ < i_5_ - 1) {
		int i_8_ = is[1 + i_6_] & 0xff;
		stringbuilder
		    .append(aCharArray8705[(i_7_ & 0x3) << 4 | i_8_ >>> 4]);
		if (i_6_ < i_5_ - 2) {
		    int i_9_ = is[2 + i_6_] & 0xff;
		    stringbuilder.append
			(aCharArray8705[(i_8_ & 0xf) << 2 | i_9_ >>> 6])
			.append(aCharArray8705[i_9_ & 0x3f]);
		} else
		    stringbuilder.append(aCharArray8705[(i_8_ & 0xf) << 2])
			.append('=');
	    } else
		stringbuilder.append(aCharArray8705[(i_7_ & 0x3) << 4]).append
		    ('=').append('=');
	}
	return stringbuilder.toString();
    }
    
    static String method14013(byte[] is, int i, int i_10_) {
	StringBuilder stringbuilder = new StringBuilder();
	for (int i_11_ = i; i_11_ < i + i_10_; i_11_ += 3) {
	    int i_12_ = is[i_11_] & 0xff;
	    stringbuilder.append(aCharArray8705[i_12_ >>> 2]);
	    if (i_11_ < i_10_ - 1) {
		int i_13_ = is[1 + i_11_] & 0xff;
		stringbuilder
		    .append(aCharArray8705[(i_12_ & 0x3) << 4 | i_13_ >>> 4]);
		if (i_11_ < i_10_ - 2) {
		    int i_14_ = is[2 + i_11_] & 0xff;
		    stringbuilder.append
			(aCharArray8705[(i_13_ & 0xf) << 2 | i_14_ >>> 6])
			.append(aCharArray8705[i_14_ & 0x3f]);
		} else
		    stringbuilder.append
			(aCharArray8705[(i_13_ & 0xf) << 2]).append('=');
	    } else
		stringbuilder.append(aCharArray8705[(i_12_ & 0x3) << 4]).append
		    ('=').append('=');
	}
	return stringbuilder.toString();
    }
    
    static String method14014(byte[] is, int i, int i_15_) {
	StringBuilder stringbuilder = new StringBuilder();
	for (int i_16_ = i; i_16_ < i + i_15_; i_16_ += 3) {
	    int i_17_ = is[i_16_] & 0xff;
	    stringbuilder.append(aCharArray8705[i_17_ >>> 2]);
	    if (i_16_ < i_15_ - 1) {
		int i_18_ = is[1 + i_16_] & 0xff;
		stringbuilder
		    .append(aCharArray8705[(i_17_ & 0x3) << 4 | i_18_ >>> 4]);
		if (i_16_ < i_15_ - 2) {
		    int i_19_ = is[2 + i_16_] & 0xff;
		    stringbuilder.append
			(aCharArray8705[(i_18_ & 0xf) << 2 | i_19_ >>> 6])
			.append(aCharArray8705[i_19_ & 0x3f]);
		} else
		    stringbuilder.append
			(aCharArray8705[(i_18_ & 0xf) << 2]).append('=');
	    } else
		stringbuilder.append(aCharArray8705[(i_17_ & 0x3) << 4]).append
		    ('=').append('=');
	}
	return stringbuilder.toString();
    }
    
    static {
	for (int i = 0; i < 26; i++)
	    aCharArray8705[i] = (char) (65 + i);
	for (int i = 26; i < 52; i++)
	    aCharArray8705[i] = (char) (i + 97 - 26);
	for (int i = 52; i < 62; i++)
	    aCharArray8705[i] = (char) (48 + i - 52);
	aCharArray8705[62] = '+';
	aCharArray8705[63] = '/';
	aCharArray8707 = new char[64];
	for (int i = 0; i < 26; i++)
	    aCharArray8707[i] = (char) (i + 65);
	for (int i = 26; i < 52; i++)
	    aCharArray8707[i] = (char) (97 + i - 26);
	for (int i = 52; i < 62; i++)
	    aCharArray8707[i] = (char) (48 + i - 52);
	aCharArray8707[62] = '*';
	aCharArray8707[63] = '-';
	aCharArray8706 = new char[64];
	for (int i = 0; i < 26; i++)
	    aCharArray8706[i] = (char) (65 + i);
	for (int i = 26; i < 52; i++)
	    aCharArray8706[i] = (char) (i + 97 - 26);
	for (int i = 52; i < 62; i++)
	    aCharArray8706[i] = (char) (48 + i - 52);
	aCharArray8706[62] = '-';
	aCharArray8706[63] = '_';
	anIntArray8708 = new int[128];
	for (int i = 0; i < anIntArray8708.length; i++)
	    anIntArray8708[i] = -1;
	for (int i = 65; i <= 90; i++)
	    anIntArray8708[i] = i - 65;
	for (int i = 97; i <= 122; i++)
	    anIntArray8708[i] = 26 + (i - 97);
	for (int i = 48; i <= 57; i++)
	    anIntArray8708[i] = 52 + (i - 48);
	int[] is = anIntArray8708;
	anIntArray8708[43] = 62;
	is[42] = 62;
	int[] is_20_ = anIntArray8708;
	anIntArray8708[47] = 63;
	is_20_[45] = 63;
    }
}
