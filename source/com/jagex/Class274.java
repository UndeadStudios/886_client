/* Class274 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class274
{
    Class284 aClass284_2854;
    int anInt2855 = 1771177181;
    String aString2856;
    public int[] anIntArray2857;
    String aString2858;
    Class284 aClass284_2859;
    public int[] anIntArray2860;
    static int anInt2861;
    
    void method5087(Class286 class286, int i) {
	int i_0_ = class286.method5225((byte) -117);
	aClass284_2859 = Class248.method4495(715194453)[i_0_];
	if (aClass284_2859 == Class284.aClass284_3066) {
	    int i_1_ = class286.method5225((byte) -114);
	    aClass284_2854 = Class248.method4495(-911829630)[i_1_];
	    anInt2855 = class286.method5225((byte) 10) * -1771177181;
	}
	aString2856 = class286.method5226(1789206555);
	aString2858 = class286.method5226(2046837295);
	int i_2_ = class286.method5225((byte) -2);
	anIntArray2857 = new int[i_2_];
	anIntArray2860 = new int[i_2_];
	for (int i_3_ = 0; i_3_ < i_2_; i_3_++) {
	    anIntArray2857[i_3_] = class286.method5225((byte) -47);
	    anIntArray2860[i_3_] = class286.method5225((byte) -59);
	}
    }
    
    Class274() {
	/* empty */
    }
    
    static final void method5088(byte i) {
	Class70.aLong746 = 4378125559561557397L;
	Class70.aLong776 = 0L;
	Class70.anInt783 = -546683307;
    }
    
    static final void method5089(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class271.method5018(class259, class245, class683, -1810440752);
    }
    
    static void method5090(int i) {
	synchronized (Class72.aClass200_816) {
	    Class72.aClass200_816.method3809((byte) 88);
	}
    }
    
    public static int method5091(byte i) {
	return Class589.anInt7805 * -345055283;
    }
    
    public static String method5092(String string, int i) {
	int i_4_ = string.length();
	int i_5_ = 0;
	for (int i_6_ = 0; i_6_ < i_4_; i_6_++) {
	    char c = string.charAt(i_6_);
	    if (c == '<' || '>' == c)
		i_5_ += 3;
	}
	StringBuilder stringbuilder = new StringBuilder(i_5_ + i_4_);
	for (int i_7_ = 0; i_7_ < i_4_; i_7_++) {
	    char c = string.charAt(i_7_);
	    if (c == '<')
		stringbuilder.append("<lt>");
	    else if (c == '>')
		stringbuilder.append("<gt>");
	    else
		stringbuilder.append(c);
	}
	return stringbuilder.toString();
    }
}
