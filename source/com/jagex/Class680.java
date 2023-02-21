/* Class680 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public final class Class680
{
    static long[] aLongArray8624;
    static char[] aCharArray8625
	= { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
	    'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y',
	    'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
    
    static long method11201(CharSequence charsequence) {
	long l = 0L;
	int i = charsequence.length();
	for (int i_0_ = 0; i_0_ < i; i_0_++) {
	    l *= 37L;
	    char c = charsequence.charAt(i_0_);
	    if (c >= 'A' && c <= 'Z')
		l += (long) ('\001' + c - 'A');
	    else if (c >= 'a' && c <= 'z')
		l += (long) (c + '\001' - 'a');
	    else if (c >= '0' && c <= '9')
		l += (long) ('\033' + c - '0');
	    if (l >= 177917621779460413L)
		break;
	}
	for (/**/; l % 37L == 0L && l != 0L; l /= 37L) {
	    /* empty */
	}
	return l;
    }
    
    static {
	aLongArray8624 = new long[12];
	for (int i = 0; i < aLongArray8624.length; i++)
	    aLongArray8624[i] = (long) Math.pow(37.0, (double) i);
    }
    
    static String method11202(long l) {
	if (l <= 0L || l >= 6582952005840035281L)
	    return null;
	if (l % 37L == 0L)
	    return null;
	int i = 0;
	for (long l_1_ = l; 0L != l_1_; l_1_ /= 37L)
	    i++;
	StringBuilder stringbuilder = new StringBuilder(i);
	while (0L != l) {
	    long l_2_ = l;
	    l /= 37L;
	    char c = aCharArray8625[(int) (l_2_ - 37L * l)];
	    if (c == '_') {
		int i_3_ = stringbuilder.length() - 1;
		stringbuilder.setCharAt
		    (i_3_, Character.toUpperCase(stringbuilder.charAt(i_3_)));
		c = '\u00a0';
	    }
	    stringbuilder.append(c);
	}
	stringbuilder.reverse();
	stringbuilder
	    .setCharAt(0, Character.toUpperCase(stringbuilder.charAt(0)));
	return stringbuilder.toString();
    }
    
    static long method11203(CharSequence charsequence) {
	long l = 0L;
	int i = charsequence.length();
	for (int i_4_ = 0; i_4_ < i; i_4_++) {
	    l *= 37L;
	    char c = charsequence.charAt(i_4_);
	    if (c >= 'A' && c <= 'Z')
		l += (long) ('\001' + c - 'A');
	    else if (c >= 'a' && c <= 'z')
		l += (long) (c + '\001' - 'a');
	    else if (c >= '0' && c <= '9')
		l += (long) ('\033' + c - '0');
	    if (l >= 177917621779460413L)
		break;
	}
	for (/**/; l % 37L == 0L && l != 0L; l /= 37L) {
	    /* empty */
	}
	return l;
    }
    
    static long method11204(CharSequence charsequence) {
	long l = 0L;
	int i = charsequence.length();
	for (int i_5_ = 0; i_5_ < i; i_5_++) {
	    l *= 37L;
	    char c = charsequence.charAt(i_5_);
	    if (c >= 'A' && c <= 'Z')
		l += (long) ('\001' + c - 'A');
	    else if (c >= 'a' && c <= 'z')
		l += (long) (c + '\001' - 'a');
	    else if (c >= '0' && c <= '9')
		l += (long) ('\033' + c - '0');
	    if (l >= 177917621779460413L)
		break;
	}
	for (/**/; l % 37L == 0L && l != 0L; l /= 37L) {
	    /* empty */
	}
	return l;
    }
    
    public static String method11205(CharSequence charsequence) {
	String string = Class618.method10164(Class608.method10004(charsequence,
								  (byte) 124));
	if (string == null)
	    string = "";
	return string;
    }
    
    static String method11206(long l) {
	if (l <= 0L || l >= 6582952005840035281L)
	    return null;
	if (l % 37L == 0L)
	    return null;
	int i = 0;
	for (long l_6_ = l; 0L != l_6_; l_6_ /= 37L)
	    i++;
	StringBuilder stringbuilder = new StringBuilder(i);
	while (0L != l) {
	    long l_7_ = l;
	    l /= 37L;
	    char c = aCharArray8625[(int) (l_7_ - 37L * l)];
	    if (c == '_') {
		int i_8_ = stringbuilder.length() - 1;
		stringbuilder.setCharAt
		    (i_8_, Character.toUpperCase(stringbuilder.charAt(i_8_)));
		c = '\u00a0';
	    }
	    stringbuilder.append(c);
	}
	stringbuilder.reverse();
	stringbuilder
	    .setCharAt(0, Character.toUpperCase(stringbuilder.charAt(0)));
	return stringbuilder.toString();
    }
    
    static String method11207(long l) {
	if (l <= 0L || l >= 6582952005840035281L)
	    return null;
	if (l % 37L == 0L)
	    return null;
	int i = 0;
	for (long l_9_ = l; 0L != l_9_; l_9_ /= 37L)
	    i++;
	StringBuilder stringbuilder = new StringBuilder(i);
	while (0L != l) {
	    long l_10_ = l;
	    l /= 37L;
	    char c = aCharArray8625[(int) (l_10_ - 37L * l)];
	    if (c == '_') {
		int i_11_ = stringbuilder.length() - 1;
		stringbuilder.setCharAt
		    (i_11_,
		     Character.toUpperCase(stringbuilder.charAt(i_11_)));
		c = '\u00a0';
	    }
	    stringbuilder.append(c);
	}
	stringbuilder.reverse();
	stringbuilder
	    .setCharAt(0, Character.toUpperCase(stringbuilder.charAt(0)));
	return stringbuilder.toString();
    }
    
    Class680() throws Throwable {
	throw new Error();
    }
    
    static final void method11208(Class683 class683, byte i) {
	class683.anInt8662 -= 362986067;
	long l
	    = (long) class683.anIntArray8661[501271953 * class683.anInt8662];
	long l_12_ = (long) (class683.anIntArray8661
			     [1 + class683.anInt8662 * 501271953]);
	long l_13_ = (long) (class683.anIntArray8661
			     [501271953 * class683.anInt8662 + 2]);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = (int) (l * l_13_ / l_12_);
    }
}
