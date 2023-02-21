/* Class681 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class681
{
    static int method11209(char c, Class666 class666) {
	int i = c << 4;
	if (Character.isUpperCase(c) || Character.isTitleCase(c)) {
	    c = Character.toLowerCase(c);
	    i = 1 + (c << 4);
	}
	if (241 == c && class666 == Class666.aClass666_8564)
	    i = 1762;
	return i;
    }
    
    static int method11210(char c, Class666 class666) {
	int i = c << 4;
	if (Character.isUpperCase(c) || Character.isTitleCase(c)) {
	    c = Character.toLowerCase(c);
	    i = 1 + (c << 4);
	}
	if (241 == c && class666 == Class666.aClass666_8564)
	    i = 1762;
	return i;
    }
    
    static char method11211(char c, Class666 class666) {
	if (c >= '\u00c0' && c <= '\u00ff') {
	    if (c >= '\u00c0' && c <= '\u00c6')
		return 'A';
	    if (c == '\u00c7')
		return 'C';
	    if (c >= '\u00c8' && c <= '\u00cb')
		return 'E';
	    if (c >= '\u00cc' && c <= '\u00cf')
		return 'I';
	    if ('\u00d1' == c && Class666.aClass666_8564 != class666)
		return 'N';
	    if (c >= '\u00d2' && c <= '\u00d6')
		return 'O';
	    if (c >= '\u00d9' && c <= '\u00dc')
		return 'U';
	    if ('\u00dd' == c)
		return 'Y';
	    if ('\u00df' == c)
		return 's';
	    if (c >= '\u00e0' && c <= '\u00e6')
		return 'a';
	    if ('\u00e7' == c)
		return 'c';
	    if (c >= '\u00e8' && c <= '\u00eb')
		return 'e';
	    if (c >= '\u00ec' && c <= '\u00ef')
		return 'i';
	    if (c == '\u00f1' && Class666.aClass666_8564 != class666)
		return 'n';
	    if (c >= '\u00f2' && c <= '\u00f6')
		return 'o';
	    if (c >= '\u00f9' && c <= '\u00fc')
		return 'u';
	    if (c == '\u00fd' || c == '\u00ff')
		return 'y';
	}
	if ('\u0152' == c)
	    return 'O';
	if (c == '\u0153')
	    return 'o';
	if (c == '\u0178')
	    return 'Y';
	return c;
    }
    
    static char method11212(char c, Class666 class666) {
	if (c >= '\u00c0' && c <= '\u00ff') {
	    if (c >= '\u00c0' && c <= '\u00c6')
		return 'A';
	    if (c == '\u00c7')
		return 'C';
	    if (c >= '\u00c8' && c <= '\u00cb')
		return 'E';
	    if (c >= '\u00cc' && c <= '\u00cf')
		return 'I';
	    if ('\u00d1' == c && Class666.aClass666_8564 != class666)
		return 'N';
	    if (c >= '\u00d2' && c <= '\u00d6')
		return 'O';
	    if (c >= '\u00d9' && c <= '\u00dc')
		return 'U';
	    if ('\u00dd' == c)
		return 'Y';
	    if ('\u00df' == c)
		return 's';
	    if (c >= '\u00e0' && c <= '\u00e6')
		return 'a';
	    if ('\u00e7' == c)
		return 'c';
	    if (c >= '\u00e8' && c <= '\u00eb')
		return 'e';
	    if (c >= '\u00ec' && c <= '\u00ef')
		return 'i';
	    if (c == '\u00f1' && Class666.aClass666_8564 != class666)
		return 'n';
	    if (c >= '\u00f2' && c <= '\u00f6')
		return 'o';
	    if (c >= '\u00f9' && c <= '\u00fc')
		return 'u';
	    if (c == '\u00fd' || c == '\u00ff')
		return 'y';
	}
	if ('\u0152' == c)
	    return 'O';
	if (c == '\u0153')
	    return 'o';
	if (c == '\u0178')
	    return 'Y';
	return c;
    }
    
    static char method11213(char c) {
	if ('\u00c6' == c)
	    return 'E';
	if (c == '\u00e6')
	    return 'e';
	if ('\u00df' == c)
	    return 's';
	if (c == '\u0152')
	    return 'E';
	if ('\u0153' == c)
	    return 'e';
	return '\0';
    }
    
    public static int method11214(CharSequence charsequence,
				  CharSequence charsequence_0_,
				  Class666 class666) {
	int i = charsequence.length();
	int i_1_ = charsequence_0_.length();
	int i_2_ = 0;
	int i_3_ = 0;
	char c = '\0';
	char c_4_ = '\0';
	while (i_2_ - c < i || i_3_ - c_4_ < i_1_) {
	    if (i_2_ - c >= i)
		return -1;
	    if (i_3_ - c_4_ >= i_1_)
		return 1;
	    char c_5_;
	    if (0 != c) {
		c_5_ = c;
		boolean bool = false;
	    } else
		c_5_ = charsequence.charAt(i_2_++);
	    char c_6_;
	    if (0 != c_4_) {
		c_6_ = c_4_;
		boolean bool = false;
	    } else
		c_6_ = charsequence_0_.charAt(i_3_++);
	    c = Class645.method10686(c_5_, -2041474668);
	    c_4_ = Class645.method10686(c_6_, -2040360879);
	    c_5_ = Class575.method9551(c_5_, class666, (byte) -87);
	    c_6_ = Class575.method9551(c_6_, class666, (byte) -33);
	    if (c_6_ != c_5_ && (Character.toUpperCase(c_5_)
				 != Character.toUpperCase(c_6_))) {
		c_5_ = Character.toLowerCase(c_5_);
		c_6_ = Character.toLowerCase(c_6_);
		if (c_6_ != c_5_)
		    return (Class568.method9491(c_5_, class666, -787425981)
			    - Class568.method9491(c_6_, class666, 268166336));
	    }
	}
	int i_7_ = Math.min(i, i_1_);
	for (int i_8_ = 0; i_8_ < i_7_; i_8_++) {
	    if (class666 == Class666.aClass666_8561) {
		i_2_ = i - 1 - i_8_;
		i_3_ = i_1_ - 1 - i_8_;
	    } else
		i_2_ = i_3_ = i_8_;
	    char c_9_ = charsequence.charAt(i_2_);
	    char c_10_ = charsequence_0_.charAt(i_3_);
	    if (c_10_ != c_9_ && (Character.toUpperCase(c_9_)
				  != Character.toUpperCase(c_10_))) {
		c_9_ = Character.toLowerCase(c_9_);
		c_10_ = Character.toLowerCase(c_10_);
		if (c_9_ != c_10_)
		    return (Class568.method9491(c_9_, class666, 123635683)
			    - Class568.method9491(c_10_, class666,
						  -479765479));
	    }
	}
	int i_11_ = i - i_1_;
	if (i_11_ != 0)
	    return i_11_;
	for (int i_12_ = 0; i_12_ < i_7_; i_12_++) {
	    char c_13_ = charsequence.charAt(i_12_);
	    char c_14_ = charsequence_0_.charAt(i_12_);
	    if (c_14_ != c_13_)
		return (Class568.method9491(c_13_, class666, -136494370)
			- Class568.method9491(c_14_, class666, 83314626));
	}
	return 0;
    }
    
    static int method11215(char c, Class666 class666) {
	int i = c << 4;
	if (Character.isUpperCase(c) || Character.isTitleCase(c)) {
	    c = Character.toLowerCase(c);
	    i = 1 + (c << 4);
	}
	if (241 == c && class666 == Class666.aClass666_8564)
	    i = 1762;
	return i;
    }
    
    static int method11216(char c, Class666 class666) {
	int i = c << 4;
	if (Character.isUpperCase(c) || Character.isTitleCase(c)) {
	    c = Character.toLowerCase(c);
	    i = 1 + (c << 4);
	}
	if (241 == c && class666 == Class666.aClass666_8564)
	    i = 1762;
	return i;
    }
    
    Class681() throws Throwable {
	throw new Error();
    }
    
    static char method11217(char c) {
	if ('\u00c6' == c)
	    return 'E';
	if (c == '\u00e6')
	    return 'e';
	if ('\u00df' == c)
	    return 's';
	if (c == '\u0152')
	    return 'E';
	if ('\u0153' == c)
	    return 'e';
	return '\0';
    }
    
    public static String method11218(long l, int i, boolean bool,
				     Class666 class666) {
	char c = ',';
	char c_15_ = '.';
	if (Class666.aClass666_8562 == class666) {
	    c = '.';
	    c_15_ = ',';
	}
	if (class666 == Class666.aClass666_8561)
	    c_15_ = '\u00a0';
	boolean bool_16_ = false;
	if (l < 0L) {
	    bool_16_ = true;
	    l = -l;
	}
	StringBuilder stringbuilder = new StringBuilder(26);
	if (i > 0) {
	    for (int i_17_ = 0; i_17_ < i; i_17_++) {
		int i_18_ = (int) l;
		l /= 10L;
		stringbuilder.append((char) (i_18_ + 48 - 10 * (int) l));
	    }
	    stringbuilder.append(c);
	}
	int i_19_ = 0;
	for (;;) {
	    int i_20_ = (int) l;
	    l /= 10L;
	    stringbuilder.append((char) (48 + i_20_ - 10 * (int) l));
	    if (0L == l)
		break;
	    if (bool && ++i_19_ % 3 == 0)
		stringbuilder.append(c_15_);
	}
	if (bool_16_)
	    stringbuilder.append('-');
	return stringbuilder.reverse().toString();
    }
    
    public static String method11219(long l, int i, boolean bool,
				     Class666 class666) {
	char c = ',';
	char c_21_ = '.';
	if (Class666.aClass666_8562 == class666) {
	    c = '.';
	    c_21_ = ',';
	}
	if (class666 == Class666.aClass666_8561)
	    c_21_ = '\u00a0';
	boolean bool_22_ = false;
	if (l < 0L) {
	    bool_22_ = true;
	    l = -l;
	}
	StringBuilder stringbuilder = new StringBuilder(26);
	if (i > 0) {
	    for (int i_23_ = 0; i_23_ < i; i_23_++) {
		int i_24_ = (int) l;
		l /= 10L;
		stringbuilder.append((char) (i_24_ + 48 - 10 * (int) l));
	    }
	    stringbuilder.append(c);
	}
	int i_25_ = 0;
	for (;;) {
	    int i_26_ = (int) l;
	    l /= 10L;
	    stringbuilder.append((char) (48 + i_26_ - 10 * (int) l));
	    if (0L == l)
		break;
	    if (bool && ++i_25_ % 3 == 0)
		stringbuilder.append(c_21_);
	}
	if (bool_22_)
	    stringbuilder.append('-');
	return stringbuilder.reverse().toString();
    }
    
    public static String method11220(long l, int i, boolean bool,
				     Class666 class666) {
	char c = ',';
	char c_27_ = '.';
	if (Class666.aClass666_8562 == class666) {
	    c = '.';
	    c_27_ = ',';
	}
	if (class666 == Class666.aClass666_8561)
	    c_27_ = '\u00a0';
	boolean bool_28_ = false;
	if (l < 0L) {
	    bool_28_ = true;
	    l = -l;
	}
	StringBuilder stringbuilder = new StringBuilder(26);
	if (i > 0) {
	    for (int i_29_ = 0; i_29_ < i; i_29_++) {
		int i_30_ = (int) l;
		l /= 10L;
		stringbuilder.append((char) (i_30_ + 48 - 10 * (int) l));
	    }
	    stringbuilder.append(c);
	}
	int i_31_ = 0;
	for (;;) {
	    int i_32_ = (int) l;
	    l /= 10L;
	    stringbuilder.append((char) (48 + i_32_ - 10 * (int) l));
	    if (0L == l)
		break;
	    if (bool && ++i_31_ % 3 == 0)
		stringbuilder.append(c_27_);
	}
	if (bool_28_)
	    stringbuilder.append('-');
	return stringbuilder.reverse().toString();
    }
    
    static final void method11221(Class683 class683, short i) {
	int i_33_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_33_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_33_ >> 16];
	Class281.method5193(class259, class245, class683, 2108049701);
    }
}
