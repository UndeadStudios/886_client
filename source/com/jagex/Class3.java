/* Class3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class3
{
    public static final int anInt28 = 2;
    public static final int anInt29 = 1;
    public static final int anInt30 = 3;
    public static final int anInt31 = 4;
    
    Class3() throws Throwable {
	throw new Error();
    }
    
    public static String method529(CharSequence charsequence, int i) {
	int i_0_ = charsequence.length();
	StringBuilder stringbuilder = new StringBuilder(i_0_);
	for (int i_1_ = 0; i_1_ < i_0_; i_1_++) {
	    char c = charsequence.charAt(i_1_);
	    if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z'
		|| c >= '0' && c <= '9' || c == '.' || '-' == c || '*' == c
		|| c == '_')
		stringbuilder.append(c);
	    else if (' ' == c)
		stringbuilder.append('+');
	    else {
		int i_2_ = Class28.method908(c, -2099340796);
		stringbuilder.append('%');
		int i_3_ = i_2_ >> 4 & 0xf;
		if (i_3_ >= 10)
		    stringbuilder.append((char) (i_3_ + 55));
		else
		    stringbuilder.append((char) (48 + i_3_));
		i_3_ = i_2_ & 0xf;
		if (i_3_ >= 10)
		    stringbuilder.append((char) (i_3_ + 55));
		else
		    stringbuilder.append((char) (i_3_ + 48));
	    }
	}
	return stringbuilder.toString();
    }
    
    static boolean method530(int i, int i_4_, int i_5_) {
	if (i_4_ >= 1000 && i < 1000)
	    return true;
	if (i_4_ < 1000 && i < 1000) {
	    if (Class473.method7752(i, 1475854835))
		return true;
	    if (Class473.method7752(i_4_, 2135604451))
		return false;
	    return true;
	}
	if (i_4_ >= 1000 && i >= 1000)
	    return true;
	return false;
    }
}
