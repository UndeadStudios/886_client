/* Class664 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class664
{
    static char[] aCharArray8555
	= { '\u20ac', '\0', '\u201a', '\u0192', '\u201e', '\u2026', '\u2020',
	    '\u2021', '\u02c6', '\u2030', '\u0160', '\u2039', '\u0152', '\0',
	    '\u017d', '\0', '\0', '\u2018', '\u2019', '\u201c', '\u201d',
	    '\u2022', '\u2013', '\u2014', '\u02dc', '\u2122', '\u0161',
	    '\u203a', '\u0153', '\0', '\u017e', '\u0178' };
    static Class157[] aClass157Array8556;
    public static Class634 aClass634_8557;
    
    Class664() throws Throwable {
	throw new Error();
    }
    
    public static int method10972(CharSequence charsequence, int i, int i_0_,
				  byte[] is, int i_1_) {
	int i_2_ = i_0_ - i;
	for (int i_3_ = 0; i_3_ < i_2_; i_3_++) {
	    char c = charsequence.charAt(i_3_ + i);
	    if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
		is[i_3_ + i_1_] = (byte) c;
	    else if (c == '\u20ac')
		is[i_3_ + i_1_] = (byte) -128;
	    else if (c == '\u201a')
		is[i_3_ + i_1_] = (byte) -126;
	    else if ('\u0192' == c)
		is[i_3_ + i_1_] = (byte) -125;
	    else if (c == '\u201e')
		is[i_1_ + i_3_] = (byte) -124;
	    else if (c == '\u2026')
		is[i_1_ + i_3_] = (byte) -123;
	    else if (c == '\u2020')
		is[i_3_ + i_1_] = (byte) -122;
	    else if ('\u2021' == c)
		is[i_3_ + i_1_] = (byte) -121;
	    else if (c == '\u02c6')
		is[i_1_ + i_3_] = (byte) -120;
	    else if ('\u2030' == c)
		is[i_3_ + i_1_] = (byte) -119;
	    else if ('\u0160' == c)
		is[i_1_ + i_3_] = (byte) -118;
	    else if (c == '\u2039')
		is[i_3_ + i_1_] = (byte) -117;
	    else if (c == '\u0152')
		is[i_1_ + i_3_] = (byte) -116;
	    else if ('\u017d' == c)
		is[i_1_ + i_3_] = (byte) -114;
	    else if (c == '\u2018')
		is[i_3_ + i_1_] = (byte) -111;
	    else if ('\u2019' == c)
		is[i_1_ + i_3_] = (byte) -110;
	    else if (c == '\u201c')
		is[i_3_ + i_1_] = (byte) -109;
	    else if (c == '\u201d')
		is[i_1_ + i_3_] = (byte) -108;
	    else if ('\u2022' == c)
		is[i_1_ + i_3_] = (byte) -107;
	    else if ('\u2013' == c)
		is[i_3_ + i_1_] = (byte) -106;
	    else if ('\u2014' == c)
		is[i_3_ + i_1_] = (byte) -105;
	    else if ('\u02dc' == c)
		is[i_1_ + i_3_] = (byte) -104;
	    else if ('\u2122' == c)
		is[i_3_ + i_1_] = (byte) -103;
	    else if ('\u0161' == c)
		is[i_1_ + i_3_] = (byte) -102;
	    else if ('\u203a' == c)
		is[i_1_ + i_3_] = (byte) -101;
	    else if (c == '\u0153')
		is[i_1_ + i_3_] = (byte) -100;
	    else if ('\u017e' == c)
		is[i_1_ + i_3_] = (byte) -98;
	    else if ('\u0178' == c)
		is[i_3_ + i_1_] = (byte) -97;
	    else
		is[i_1_ + i_3_] = (byte) 63;
	}
	return i_2_;
    }
    
    public static String method10973(byte[] is, int i, int i_4_) {
	char[] cs = new char[i_4_];
	int i_5_ = 0;
	for (int i_6_ = 0; i_6_ < i_4_; i_6_++) {
	    int i_7_ = is[i_6_ + i] & 0xff;
	    if (i_7_ != 0) {
		if (i_7_ >= 128 && i_7_ < 160) {
		    int i_8_ = aCharArray8555[i_7_ - 128];
		    if (0 == i_8_)
			i_8_ = 63;
		    i_7_ = i_8_;
		}
		cs[i_5_++] = (char) i_7_;
	    }
	}
	return new String(cs, 0, i_5_);
    }
    
    public static byte method10974(char c) {
	byte i;
	if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
	    i = (byte) c;
	else if (c == '\u20ac')
	    i = (byte) -128;
	else if ('\u201a' == c)
	    i = (byte) -126;
	else if ('\u0192' == c)
	    i = (byte) -125;
	else if ('\u201e' == c)
	    i = (byte) -124;
	else if (c == '\u2026')
	    i = (byte) -123;
	else if (c == '\u2020')
	    i = (byte) -122;
	else if ('\u2021' == c)
	    i = (byte) -121;
	else if (c == '\u02c6')
	    i = (byte) -120;
	else if (c == '\u2030')
	    i = (byte) -119;
	else if ('\u0160' == c)
	    i = (byte) -118;
	else if ('\u2039' == c)
	    i = (byte) -117;
	else if ('\u0152' == c)
	    i = (byte) -116;
	else if ('\u017d' == c)
	    i = (byte) -114;
	else if ('\u2018' == c)
	    i = (byte) -111;
	else if (c == '\u2019')
	    i = (byte) -110;
	else if (c == '\u201c')
	    i = (byte) -109;
	else if ('\u201d' == c)
	    i = (byte) -108;
	else if ('\u2022' == c)
	    i = (byte) -107;
	else if (c == '\u2013')
	    i = (byte) -106;
	else if (c == '\u2014')
	    i = (byte) -105;
	else if (c == '\u02dc')
	    i = (byte) -104;
	else if ('\u2122' == c)
	    i = (byte) -103;
	else if (c == '\u0161')
	    i = (byte) -102;
	else if ('\u203a' == c)
	    i = (byte) -101;
	else if (c == '\u0153')
	    i = (byte) -100;
	else if (c == '\u017e')
	    i = (byte) -98;
	else if ('\u0178' == c)
	    i = (byte) -97;
	else
	    i = (byte) 63;
	return i;
    }
    
    public static boolean method10975(char c) {
	if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
	    return true;
	if (c != 0) {
	    char[] cs = aCharArray8555;
	    for (int i = 0; i < cs.length; i++) {
		char c_9_ = cs[i];
		if (c_9_ == c)
		    return true;
	    }
	}
	return false;
    }
    
    public static byte method10976(char c) {
	byte i;
	if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
	    i = (byte) c;
	else if (c == '\u20ac')
	    i = (byte) -128;
	else if ('\u201a' == c)
	    i = (byte) -126;
	else if ('\u0192' == c)
	    i = (byte) -125;
	else if ('\u201e' == c)
	    i = (byte) -124;
	else if (c == '\u2026')
	    i = (byte) -123;
	else if (c == '\u2020')
	    i = (byte) -122;
	else if ('\u2021' == c)
	    i = (byte) -121;
	else if (c == '\u02c6')
	    i = (byte) -120;
	else if (c == '\u2030')
	    i = (byte) -119;
	else if ('\u0160' == c)
	    i = (byte) -118;
	else if ('\u2039' == c)
	    i = (byte) -117;
	else if ('\u0152' == c)
	    i = (byte) -116;
	else if ('\u017d' == c)
	    i = (byte) -114;
	else if ('\u2018' == c)
	    i = (byte) -111;
	else if (c == '\u2019')
	    i = (byte) -110;
	else if (c == '\u201c')
	    i = (byte) -109;
	else if ('\u201d' == c)
	    i = (byte) -108;
	else if ('\u2022' == c)
	    i = (byte) -107;
	else if (c == '\u2013')
	    i = (byte) -106;
	else if (c == '\u2014')
	    i = (byte) -105;
	else if (c == '\u02dc')
	    i = (byte) -104;
	else if ('\u2122' == c)
	    i = (byte) -103;
	else if (c == '\u0161')
	    i = (byte) -102;
	else if ('\u203a' == c)
	    i = (byte) -101;
	else if (c == '\u0153')
	    i = (byte) -100;
	else if (c == '\u017e')
	    i = (byte) -98;
	else if ('\u0178' == c)
	    i = (byte) -97;
	else
	    i = (byte) 63;
	return i;
    }
    
    public static boolean method10977(char c) {
	if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
	    return true;
	if (c != 0) {
	    char[] cs = aCharArray8555;
	    for (int i = 0; i < cs.length; i++) {
		char c_10_ = cs[i];
		if (c_10_ == c)
		    return true;
	    }
	}
	return false;
    }
    
    public static boolean method10978(char c) {
	if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
	    return true;
	if (c != 0) {
	    char[] cs = aCharArray8555;
	    for (int i = 0; i < cs.length; i++) {
		char c_11_ = cs[i];
		if (c_11_ == c)
		    return true;
	    }
	}
	return false;
    }
    
    public static byte method10979(char c) {
	byte i;
	if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
	    i = (byte) c;
	else if (c == '\u20ac')
	    i = (byte) -128;
	else if ('\u201a' == c)
	    i = (byte) -126;
	else if ('\u0192' == c)
	    i = (byte) -125;
	else if ('\u201e' == c)
	    i = (byte) -124;
	else if (c == '\u2026')
	    i = (byte) -123;
	else if (c == '\u2020')
	    i = (byte) -122;
	else if ('\u2021' == c)
	    i = (byte) -121;
	else if (c == '\u02c6')
	    i = (byte) -120;
	else if (c == '\u2030')
	    i = (byte) -119;
	else if ('\u0160' == c)
	    i = (byte) -118;
	else if ('\u2039' == c)
	    i = (byte) -117;
	else if ('\u0152' == c)
	    i = (byte) -116;
	else if ('\u017d' == c)
	    i = (byte) -114;
	else if ('\u2018' == c)
	    i = (byte) -111;
	else if (c == '\u2019')
	    i = (byte) -110;
	else if (c == '\u201c')
	    i = (byte) -109;
	else if ('\u201d' == c)
	    i = (byte) -108;
	else if ('\u2022' == c)
	    i = (byte) -107;
	else if (c == '\u2013')
	    i = (byte) -106;
	else if (c == '\u2014')
	    i = (byte) -105;
	else if (c == '\u02dc')
	    i = (byte) -104;
	else if ('\u2122' == c)
	    i = (byte) -103;
	else if (c == '\u0161')
	    i = (byte) -102;
	else if ('\u203a' == c)
	    i = (byte) -101;
	else if (c == '\u0153')
	    i = (byte) -100;
	else if (c == '\u017e')
	    i = (byte) -98;
	else if ('\u0178' == c)
	    i = (byte) -97;
	else
	    i = (byte) 63;
	return i;
    }
    
    public static boolean method10980(char c) {
	if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
	    return true;
	if (c != 0) {
	    char[] cs = aCharArray8555;
	    for (int i = 0; i < cs.length; i++) {
		char c_12_ = cs[i];
		if (c_12_ == c)
		    return true;
	    }
	}
	return false;
    }
    
    public static char method10981(byte i) {
	int i_13_ = i & 0xff;
	if (i_13_ == 0)
	    throw new IllegalArgumentException(new StringBuilder().append
						   ("").append
						   (Integer.toString(i_13_,
								     16))
						   .toString());
	if (i_13_ >= 128 && i_13_ < 160) {
	    int i_14_ = aCharArray8555[i_13_ - 128];
	    if (0 == i_14_)
		i_14_ = 63;
	    i_13_ = i_14_;
	}
	return (char) i_13_;
    }
    
    public static byte[] method10982(CharSequence charsequence) {
	int i = charsequence.length();
	byte[] is = new byte[i];
	for (int i_15_ = 0; i_15_ < i; i_15_++) {
	    char c = charsequence.charAt(i_15_);
	    if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
		is[i_15_] = (byte) c;
	    else if (c == '\u20ac')
		is[i_15_] = (byte) -128;
	    else if ('\u201a' == c)
		is[i_15_] = (byte) -126;
	    else if ('\u0192' == c)
		is[i_15_] = (byte) -125;
	    else if ('\u201e' == c)
		is[i_15_] = (byte) -124;
	    else if (c == '\u2026')
		is[i_15_] = (byte) -123;
	    else if ('\u2020' == c)
		is[i_15_] = (byte) -122;
	    else if ('\u2021' == c)
		is[i_15_] = (byte) -121;
	    else if (c == '\u02c6')
		is[i_15_] = (byte) -120;
	    else if ('\u2030' == c)
		is[i_15_] = (byte) -119;
	    else if ('\u0160' == c)
		is[i_15_] = (byte) -118;
	    else if (c == '\u2039')
		is[i_15_] = (byte) -117;
	    else if ('\u0152' == c)
		is[i_15_] = (byte) -116;
	    else if ('\u017d' == c)
		is[i_15_] = (byte) -114;
	    else if ('\u2018' == c)
		is[i_15_] = (byte) -111;
	    else if (c == '\u2019')
		is[i_15_] = (byte) -110;
	    else if ('\u201c' == c)
		is[i_15_] = (byte) -109;
	    else if ('\u201d' == c)
		is[i_15_] = (byte) -108;
	    else if (c == '\u2022')
		is[i_15_] = (byte) -107;
	    else if (c == '\u2013')
		is[i_15_] = (byte) -106;
	    else if (c == '\u2014')
		is[i_15_] = (byte) -105;
	    else if (c == '\u02dc')
		is[i_15_] = (byte) -104;
	    else if ('\u2122' == c)
		is[i_15_] = (byte) -103;
	    else if (c == '\u0161')
		is[i_15_] = (byte) -102;
	    else if (c == '\u203a')
		is[i_15_] = (byte) -101;
	    else if ('\u0153' == c)
		is[i_15_] = (byte) -100;
	    else if ('\u017e' == c)
		is[i_15_] = (byte) -98;
	    else if (c == '\u0178')
		is[i_15_] = (byte) -97;
	    else
		is[i_15_] = (byte) 63;
	}
	return is;
    }
    
    public static int method10983(CharSequence charsequence, int i, int i_16_,
				  byte[] is, int i_17_) {
	int i_18_ = i_16_ - i;
	for (int i_19_ = 0; i_19_ < i_18_; i_19_++) {
	    char c = charsequence.charAt(i_19_ + i);
	    if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
		is[i_19_ + i_17_] = (byte) c;
	    else if (c == '\u20ac')
		is[i_19_ + i_17_] = (byte) -128;
	    else if (c == '\u201a')
		is[i_19_ + i_17_] = (byte) -126;
	    else if ('\u0192' == c)
		is[i_19_ + i_17_] = (byte) -125;
	    else if (c == '\u201e')
		is[i_17_ + i_19_] = (byte) -124;
	    else if (c == '\u2026')
		is[i_17_ + i_19_] = (byte) -123;
	    else if (c == '\u2020')
		is[i_19_ + i_17_] = (byte) -122;
	    else if ('\u2021' == c)
		is[i_19_ + i_17_] = (byte) -121;
	    else if (c == '\u02c6')
		is[i_17_ + i_19_] = (byte) -120;
	    else if ('\u2030' == c)
		is[i_19_ + i_17_] = (byte) -119;
	    else if ('\u0160' == c)
		is[i_17_ + i_19_] = (byte) -118;
	    else if (c == '\u2039')
		is[i_19_ + i_17_] = (byte) -117;
	    else if (c == '\u0152')
		is[i_17_ + i_19_] = (byte) -116;
	    else if ('\u017d' == c)
		is[i_17_ + i_19_] = (byte) -114;
	    else if (c == '\u2018')
		is[i_19_ + i_17_] = (byte) -111;
	    else if ('\u2019' == c)
		is[i_17_ + i_19_] = (byte) -110;
	    else if (c == '\u201c')
		is[i_19_ + i_17_] = (byte) -109;
	    else if (c == '\u201d')
		is[i_17_ + i_19_] = (byte) -108;
	    else if ('\u2022' == c)
		is[i_17_ + i_19_] = (byte) -107;
	    else if ('\u2013' == c)
		is[i_19_ + i_17_] = (byte) -106;
	    else if ('\u2014' == c)
		is[i_19_ + i_17_] = (byte) -105;
	    else if ('\u02dc' == c)
		is[i_17_ + i_19_] = (byte) -104;
	    else if ('\u2122' == c)
		is[i_19_ + i_17_] = (byte) -103;
	    else if ('\u0161' == c)
		is[i_17_ + i_19_] = (byte) -102;
	    else if ('\u203a' == c)
		is[i_17_ + i_19_] = (byte) -101;
	    else if (c == '\u0153')
		is[i_17_ + i_19_] = (byte) -100;
	    else if ('\u017e' == c)
		is[i_17_ + i_19_] = (byte) -98;
	    else if ('\u0178' == c)
		is[i_19_ + i_17_] = (byte) -97;
	    else
		is[i_17_ + i_19_] = (byte) 63;
	}
	return i_18_;
    }
    
    public static boolean method10984(char c) {
	if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
	    return true;
	if (c != 0) {
	    char[] cs = aCharArray8555;
	    for (int i = 0; i < cs.length; i++) {
		char c_20_ = cs[i];
		if (c_20_ == c)
		    return true;
	    }
	}
	return false;
    }
    
    public static String method10985(byte[] is) {
	return Class392.method6482(is, 0, is.length, 1863830501);
    }
    
    public static boolean method10986(char c) {
	if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
	    return true;
	if (c != 0) {
	    char[] cs = aCharArray8555;
	    for (int i = 0; i < cs.length; i++) {
		char c_21_ = cs[i];
		if (c_21_ == c)
		    return true;
	    }
	}
	return false;
    }
    
    static final void method10987(Class683 class683, int i) {
	int i_22_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_22_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_22_ >> 16];
	Class263.method4784(class259, class245, class683, -565345590);
    }
    
    static final void method10988(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = client.aClass229_11119.method4360(501271953);
    }
    
    static final void method10989(Class683 class683, byte i) {
	class683.anInt8662 -= -1189665054;
	int i_23_ = class683.anIntArray8661[class683.anInt8662 * 501271953];
	int i_24_
	    = class683.anIntArray8661[class683.anInt8662 * 501271953 + 1];
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class508.method8496(i_23_, i_24_, false, (byte) 49);
    }
}
