/* Class83 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class83
{
    public static final int anInt851 = 8;
    public static Class40_Sub12 aClass40_Sub12_852;
    
    Class83() throws Throwable {
	throw new Error();
    }
    
    static void method1604(int i) {
	for (int i_0_ = 0; i_0_ < 107; i_0_++)
	    client.aBoolArray11320[i_0_] = true;
    }
    
    static boolean method1605(CharSequence charsequence, int i, boolean bool,
			      int i_1_) {
	if (i < 2 || i > 36)
	    throw new IllegalArgumentException(new StringBuilder().append
						   ("").append
						   (i).toString());
	boolean bool_2_ = false;
	boolean bool_3_ = false;
	int i_4_ = 0;
	int i_5_ = charsequence.length();
	for (int i_6_ = 0; i_6_ < i_5_; i_6_++) {
	    int i_7_ = charsequence.charAt(i_6_);
	    if (0 == i_6_) {
		if (45 == i_7_) {
		    bool_2_ = true;
		    continue;
		}
		if (43 == i_7_ && bool)
		    continue;
	    }
	    if (i_7_ >= 48 && i_7_ <= 57)
		i_7_ -= 48;
	    else if (i_7_ >= 65 && i_7_ <= 90)
		i_7_ -= 55;
	    else if (i_7_ >= 97 && i_7_ <= 122)
		i_7_ -= 87;
	    else
		return false;
	    if (i_7_ >= i)
		return false;
	    if (bool_2_)
		i_7_ = -i_7_;
	    int i_8_ = i_7_ + i_4_ * i;
	    if (i_4_ != i_8_ / i)
		return false;
	    i_4_ = i_8_;
	    bool_3_ = true;
	}
	return bool_3_;
    }
    
    static final void method1606(Class525_Sub38_Sub2 class525_sub38_sub2,
				 int i, int i_9_) {
	Class104.anInt1289 = 0;
	Class267.method4947(class525_sub38_sub2, 1669844360);
	Class466.method7692(class525_sub38_sub2, (byte) -13);
	if (class525_sub38_sub2.pos * -1133521593 != i)
	    throw new RuntimeException(new StringBuilder().append
					   (class525_sub38_sub2.pos
					    * -1133521593)
					   .append
					   (" ").append
					   (i).toString());
    }
}
