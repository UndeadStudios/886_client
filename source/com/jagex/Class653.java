/* Class653 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Iterator;

public final class Class653
{
    static Class458 aClass458_8393;
    static Iterator anIterator8394;
    
    public static int method10779(byte[] is, int i,
				  CharSequence charsequence) {
	int i_0_ = charsequence.length();
	int i_1_ = i;
	for (int i_2_ = 0; i_2_ < i_0_; i_2_++) {
	    int i_3_ = charsequence.charAt(i_2_);
	    if (i_3_ <= 127)
		is[i_1_++] = (byte) i_3_;
	    else if (i_3_ <= 2047) {
		is[i_1_++] = (byte) (0xc0 | i_3_ >> 6);
		is[i_1_++] = (byte) (0x80 | i_3_ & 0x3f);
	    } else {
		is[i_1_++] = (byte) (0xe0 | i_3_ >> 12);
		is[i_1_++] = (byte) (0x80 | i_3_ >> 6 & 0x3f);
		is[i_1_++] = (byte) (0x80 | i_3_ & 0x3f);
	    }
	}
	return i_1_ - i;
    }
    
    public static int method10780(byte[] is, int i,
				  CharSequence charsequence) {
	int i_4_ = charsequence.length();
	int i_5_ = i;
	for (int i_6_ = 0; i_6_ < i_4_; i_6_++) {
	    int i_7_ = charsequence.charAt(i_6_);
	    if (i_7_ <= 127)
		is[i_5_++] = (byte) i_7_;
	    else if (i_7_ <= 2047) {
		is[i_5_++] = (byte) (0xc0 | i_7_ >> 6);
		is[i_5_++] = (byte) (0x80 | i_7_ & 0x3f);
	    } else {
		is[i_5_++] = (byte) (0xe0 | i_7_ >> 12);
		is[i_5_++] = (byte) (0x80 | i_7_ >> 6 & 0x3f);
		is[i_5_++] = (byte) (0x80 | i_7_ & 0x3f);
	    }
	}
	return i_5_ - i;
    }
    
    public static int method10781(CharSequence charsequence) {
	int i = charsequence.length();
	int i_8_ = 0;
	for (int i_9_ = 0; i_9_ < i; i_9_++) {
	    char c = charsequence.charAt(i_9_);
	    if (c <= '\u007f')
		i_8_++;
	    else if (c <= '\u07ff')
		i_8_ += 2;
	    else
		i_8_ += 3;
	}
	return i_8_;
    }
    
    Class653() throws Throwable {
	throw new Error();
    }
    
    public static int method10782(byte[] is, int i,
				  CharSequence charsequence) {
	int i_10_ = charsequence.length();
	int i_11_ = i;
	for (int i_12_ = 0; i_12_ < i_10_; i_12_++) {
	    int i_13_ = charsequence.charAt(i_12_);
	    if (i_13_ <= 127)
		is[i_11_++] = (byte) i_13_;
	    else if (i_13_ <= 2047) {
		is[i_11_++] = (byte) (0xc0 | i_13_ >> 6);
		is[i_11_++] = (byte) (0x80 | i_13_ & 0x3f);
	    } else {
		is[i_11_++] = (byte) (0xe0 | i_13_ >> 12);
		is[i_11_++] = (byte) (0x80 | i_13_ >> 6 & 0x3f);
		is[i_11_++] = (byte) (0x80 | i_13_ & 0x3f);
	    }
	}
	return i_11_ - i;
    }
    
    public static int method10783(byte[] is, int i,
				  CharSequence charsequence) {
	int i_14_ = charsequence.length();
	int i_15_ = i;
	for (int i_16_ = 0; i_16_ < i_14_; i_16_++) {
	    int i_17_ = charsequence.charAt(i_16_);
	    if (i_17_ <= 127)
		is[i_15_++] = (byte) i_17_;
	    else if (i_17_ <= 2047) {
		is[i_15_++] = (byte) (0xc0 | i_17_ >> 6);
		is[i_15_++] = (byte) (0x80 | i_17_ & 0x3f);
	    } else {
		is[i_15_++] = (byte) (0xe0 | i_17_ >> 12);
		is[i_15_++] = (byte) (0x80 | i_17_ >> 6 & 0x3f);
		is[i_15_++] = (byte) (0x80 | i_17_ & 0x3f);
	    }
	}
	return i_15_ - i;
    }
    
    public static int method10784(CharSequence charsequence) {
	int i = charsequence.length();
	int i_18_ = 0;
	for (int i_19_ = 0; i_19_ < i; i_19_++) {
	    char c = charsequence.charAt(i_19_);
	    if (c <= '\u007f')
		i_18_++;
	    else if (c <= '\u07ff')
		i_18_ += 2;
	    else
		i_18_ += 3;
	}
	return i_18_;
    }
    
    public static String method10785(byte[] is, int i, int i_20_) {
	char[] cs = new char[i_20_];
	int i_21_ = 0;
	int i_22_ = i;
	int i_23_ = i_20_ + i;
	while (i_22_ < i_23_) {
	    int i_24_ = is[i_22_++] & 0xff;
	    int i_25_;
	    if (i_24_ < 128) {
		if (0 == i_24_)
		    i_25_ = 65533;
		else
		    i_25_ = i_24_;
	    } else if (i_24_ < 192)
		i_25_ = 65533;
	    else if (i_24_ < 224) {
		if (i_22_ < i_23_ && 128 == (is[i_22_] & 0xc0)) {
		    i_25_ = (i_24_ & 0x1f) << 6 | is[i_22_++] & 0x3f;
		    if (i_25_ < 128)
			i_25_ = 65533;
		} else
		    i_25_ = 65533;
	    } else if (i_24_ < 240) {
		if (1 + i_22_ < i_23_ && (is[i_22_] & 0xc0) == 128
		    && 128 == (is[i_22_ + 1] & 0xc0)) {
		    i_25_ = ((i_24_ & 0xf) << 12 | (is[i_22_++] & 0x3f) << 6
			     | is[i_22_++] & 0x3f);
		    if (i_25_ < 2048)
			i_25_ = 65533;
		} else
		    i_25_ = 65533;
	    } else if (i_24_ < 248) {
		if (i_22_ + 2 < i_23_ && 128 == (is[i_22_] & 0xc0)
		    && (is[1 + i_22_] & 0xc0) == 128
		    && (is[i_22_ + 2] & 0xc0) == 128) {
		    i_25_ = ((i_24_ & 0x7) << 18 | (is[i_22_++] & 0x3f) << 12
			     | (is[i_22_++] & 0x3f) << 6 | is[i_22_++] & 0x3f);
		    if (i_25_ < 65536 || i_25_ > 1114111)
			i_25_ = 65533;
		    else
			i_25_ = 65533;
		} else
		    i_25_ = 65533;
	    } else
		i_25_ = 65533;
	    cs[i_21_++] = (char) i_25_;
	}
	return new String(cs, 0, i_21_);
    }
    
    public static String method10786(byte[] is, int i, int i_26_) {
	char[] cs = new char[i_26_];
	int i_27_ = 0;
	int i_28_ = i;
	int i_29_ = i_26_ + i;
	while (i_28_ < i_29_) {
	    int i_30_ = is[i_28_++] & 0xff;
	    int i_31_;
	    if (i_30_ < 128) {
		if (0 == i_30_)
		    i_31_ = 65533;
		else
		    i_31_ = i_30_;
	    } else if (i_30_ < 192)
		i_31_ = 65533;
	    else if (i_30_ < 224) {
		if (i_28_ < i_29_ && 128 == (is[i_28_] & 0xc0)) {
		    i_31_ = (i_30_ & 0x1f) << 6 | is[i_28_++] & 0x3f;
		    if (i_31_ < 128)
			i_31_ = 65533;
		} else
		    i_31_ = 65533;
	    } else if (i_30_ < 240) {
		if (1 + i_28_ < i_29_ && (is[i_28_] & 0xc0) == 128
		    && 128 == (is[i_28_ + 1] & 0xc0)) {
		    i_31_ = ((i_30_ & 0xf) << 12 | (is[i_28_++] & 0x3f) << 6
			     | is[i_28_++] & 0x3f);
		    if (i_31_ < 2048)
			i_31_ = 65533;
		} else
		    i_31_ = 65533;
	    } else if (i_30_ < 248) {
		if (i_28_ + 2 < i_29_ && 128 == (is[i_28_] & 0xc0)
		    && (is[1 + i_28_] & 0xc0) == 128
		    && (is[i_28_ + 2] & 0xc0) == 128) {
		    i_31_ = ((i_30_ & 0x7) << 18 | (is[i_28_++] & 0x3f) << 12
			     | (is[i_28_++] & 0x3f) << 6 | is[i_28_++] & 0x3f);
		    if (i_31_ < 65536 || i_31_ > 1114111)
			i_31_ = 65533;
		    else
			i_31_ = 65533;
		} else
		    i_31_ = 65533;
	    } else
		i_31_ = 65533;
	    cs[i_27_++] = (char) i_31_;
	}
	return new String(cs, 0, i_27_);
    }
    
    static final void method10787(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class592.method9821(class259, class683, (byte) 1);
    }
    
    public static Class390 method10788(RSBuffer class525_sub38, int i) {
	Class390 class390 = Class198.method3766(class525_sub38, -2085875279);
	int i_32_ = class525_sub38.readInt(2138238069);
	int i_33_ = class525_sub38.readInt(1230508928);
	int i_34_ = class525_sub38.readBigSmart(-2043778683);
	return new Class390_Sub2(class390.aClass395_4068,
				 class390.aClass396_4062,
				 1345009707 * class390.anInt4063,
				 1202152725 * class390.anInt4064,
				 class390.anInt4065 * 1827301945,
				 -797820993 * class390.anInt4066,
				 1374070015 * class390.anInt4067,
				 -349107147 * class390.anInt4061,
				 512449097 * class390.anInt4069, i_32_, i_33_,
				 i_34_);
    }
    
    static final void method10789(Class683 class683, byte i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class105.method1911(class259, class245, class683, 1960981456);
    }
}
