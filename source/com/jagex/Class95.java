/* Class95 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class95
{
    static String[] aStringArray1126;
    
    public static String method1738(CharSequence charsequence) {
	int i = charsequence.length();
	StringBuilder stringbuilder = new StringBuilder(i);
	for (int i_0_ = 0; i_0_ < i; i_0_++) {
	    char c = charsequence.charAt(i_0_);
	    if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z'
		|| c >= '0' && c <= '9' || c == '.' || '-' == c || '*' == c
		|| c == '_')
		stringbuilder.append(c);
	    else if (' ' == c)
		stringbuilder.append('+');
	    else {
		int i_1_ = Class28.method908(c, -2099340796);
		stringbuilder.append('%');
		int i_2_ = i_1_ >> 4 & 0xf;
		if (i_2_ >= 10)
		    stringbuilder.append((char) (i_2_ + 55));
		else
		    stringbuilder.append((char) (48 + i_2_));
		i_2_ = i_1_ & 0xf;
		if (i_2_ >= 10)
		    stringbuilder.append((char) (i_2_ + 55));
		else
		    stringbuilder.append((char) (i_2_ + 48));
	    }
	}
	return stringbuilder.toString();
    }
    
    Class95() throws Throwable {
	throw new Error();
    }
    
    public static String method1739(CharSequence charsequence) {
	int i = charsequence.length();
	StringBuilder stringbuilder = new StringBuilder(i);
	for (int i_3_ = 0; i_3_ < i; i_3_++) {
	    char c = charsequence.charAt(i_3_);
	    if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z'
		|| c >= '0' && c <= '9' || c == '.' || '-' == c || '*' == c
		|| c == '_')
		stringbuilder.append(c);
	    else if (' ' == c)
		stringbuilder.append('+');
	    else {
		int i_4_ = Class28.method908(c, -2099340796);
		stringbuilder.append('%');
		int i_5_ = i_4_ >> 4 & 0xf;
		if (i_5_ >= 10)
		    stringbuilder.append((char) (i_5_ + 55));
		else
		    stringbuilder.append((char) (48 + i_5_));
		i_5_ = i_4_ & 0xf;
		if (i_5_ >= 10)
		    stringbuilder.append((char) (i_5_ + 55));
		else
		    stringbuilder.append((char) (i_5_ + 48));
	    }
	}
	return stringbuilder.toString();
    }
    
    static boolean method1740(int i) {
	return -628070459 * Class61.anInt658 > 0;
    }
}
