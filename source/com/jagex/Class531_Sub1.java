/* Class531_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class531_Sub1 extends Class531
{
    String aString10311;
    short aShort10312;
    int anInt10313
	= (int) (Class251.method4508((byte) 8) / 1000L) * 1144547029;
    
    Class531_Sub1(String string, int i) {
	aString10311 = string;
	aShort10312 = (short) i;
    }
    
    static final String method15919(String string, String string_0_,
				    String string_1_, int i) {
	for (int i_2_ = string.indexOf(string_0_); i_2_ != -1;
	     i_2_ = string.indexOf(string_0_, i_2_ + string_1_.length()))
	    string
		= new StringBuilder().append(string.substring(0, i_2_)).append
		      (string_1_).append
		      (string.substring(i_2_ + string_0_.length())).toString();
	return string;
    }
}
