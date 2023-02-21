/* Class540 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class540
{
    public int anInt7182 = -637232685;
    public Class689 aClass689_7183;
    public int anInt7184;
    public int anInt7185;
    public int anInt7186;
    
    Class540(Class656_Sub1_Sub3_Sub1 class656_sub1_sub3_sub1) {
	aClass689_7183 = new Class689_Sub2(class656_sub1_sub3_sub1, false);
    }
    
    static final void method8890(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = client.method17531(class259).method16132(739412626);
    }
    
    public static String method8891(byte[] is, int i) {
	return Class392.method6482(is, 0, is.length, 1382763602);
    }
    
    static String method8892(long l, int i, short i_0_) {
	Class677.method11134(l);
	int i_1_ = Class86.aCalendar890.get(5);
	int i_2_ = Class86.aCalendar890.get(2) + 1;
	int i_3_ = Class86.aCalendar890.get(1);
	return new StringBuilder().append(Integer.toString(i_1_ / 10)).append
		   (i_1_ % 10).append
		   ("/").append
		   (i_2_ / 10).append
		   (i_2_ % 10).append
		   ("/").append
		   (i_3_ % 100 / 10).append
		   (i_3_ % 10).toString();
    }
}
