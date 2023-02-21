/* Class80 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class80
{
    static char[] aCharArray842;
    static final int anInt843 = 12;
    static final int anInt844 = 1;
    static char[] aCharArray845
	= { ' ', '\u00a0', '_', '-', '\u00e0', '\u00e1', '\u00e2', '\u00e4',
	    '\u00e3', '\u00c0', '\u00c1', '\u00c2', '\u00c4', '\u00c3',
	    '\u00e8', '\u00e9', '\u00ea', '\u00eb', '\u00c8', '\u00c9',
	    '\u00ca', '\u00cb', '\u00ed', '\u00ee', '\u00ef', '\u00cd',
	    '\u00ce', '\u00cf', '\u00f2', '\u00f3', '\u00f4', '\u00f6',
	    '\u00f5', '\u00d2', '\u00d3', '\u00d4', '\u00d6', '\u00d5',
	    '\u00f9', '\u00fa', '\u00fb', '\u00fc', '\u00d9', '\u00da',
	    '\u00db', '\u00dc', '\u00e7', '\u00c7', '\u00ff', '\u0178',
	    '\u00f1', '\u00d1', '\u00df' };
    
    public static String method1586(CharSequence charsequence,
				    Class76 class76) {
	if (charsequence == null)
	    return null;
	int i = 0;
	int i_0_;
	for (i_0_ = charsequence.length();
	     (i < i_0_
	      && Class208.method3912(charsequence.charAt(i), 1952706621));
	     i++) {
	    /* empty */
	}
	for (/**/;
	     i_0_ > i && Class208.method3912(charsequence.charAt(i_0_ - 1),
					     708589776);
	     i_0_--) {
	    /* empty */
	}
	int i_1_ = i_0_ - i;
	if (i_1_ < 1 || i_1_ > Class13.method735(class76, -1914915293))
	    return null;
	StringBuilder stringbuilder = new StringBuilder(i_1_);
	for (int i_2_ = i; i_2_ < i_0_; i_2_++) {
	    char c = charsequence.charAt(i_2_);
	    if (Class57.method1215(c, 1964757451)) {
		char c_3_ = Class409.method6654(c, 1326751102);
		if (c_3_ != 0)
		    stringbuilder.append(c_3_);
	    }
	}
	if (stringbuilder.length() == 0)
	    return null;
	return stringbuilder.toString();
    }
    
    static final boolean method1587(char c) {
	if (Character.isISOControl(c))
	    return false;
	if (Class560.method9410(c, -2042662884))
	    return true;
	char[] cs = aCharArray845;
	for (int i = 0; i < cs.length; i++) {
	    char c_4_ = cs[i];
	    if (c_4_ == c)
		return true;
	}
	cs = aCharArray842;
	for (int i = 0; i < cs.length; i++) {
	    char c_5_ = cs[i];
	    if (c_5_ == c)
		return true;
	}
	return false;
    }
    
    static final int method1588(Class76 class76) {
	if (null == class76)
	    return 12;
	switch (-1164403495 * class76.anInt833) {
	case 4:
	    return 20;
	default:
	    return 12;
	}
    }
    
    static final int method1589(Class76 class76) {
	if (null == class76)
	    return 12;
	switch (-1164403495 * class76.anInt833) {
	case 4:
	    return 20;
	default:
	    return 12;
	}
    }
    
    static final boolean method1590(char c) {
	if (Character.isISOControl(c))
	    return false;
	if (Class560.method9410(c, 1469789223))
	    return true;
	char[] cs = aCharArray845;
	for (int i = 0; i < cs.length; i++) {
	    char c_6_ = cs[i];
	    if (c_6_ == c)
		return true;
	}
	cs = aCharArray842;
	for (int i = 0; i < cs.length; i++) {
	    char c_7_ = cs[i];
	    if (c_7_ == c)
		return true;
	}
	return false;
    }
    
    static {
	aCharArray842 = new char[] { '[', ']', '#' };
    }
    
    static final boolean method1591(char c) {
	if (Character.isISOControl(c))
	    return false;
	if (Class560.method9410(c, -263016879))
	    return true;
	char[] cs = aCharArray845;
	for (int i = 0; i < cs.length; i++) {
	    char c_8_ = cs[i];
	    if (c_8_ == c)
		return true;
	}
	cs = aCharArray842;
	for (int i = 0; i < cs.length; i++) {
	    char c_9_ = cs[i];
	    if (c_9_ == c)
		return true;
	}
	return false;
    }
    
    static final boolean method1592(char c) {
	return c == '\u00a0' || ' ' == c || c == '_' || '-' == c;
    }
    
    Class80() throws Throwable {
	throw new Error();
    }
    
    static final void method1593(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class534.method8854(class259, class245, class683, (byte) -73);
    }
}
