/* Class222 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.ArrayList;
import java.util.List;

public class Class222
{
    List aList2337;
    Class217 this$0;
    public static Class175 aClass175_2338;
    
    void method4219(Class488 class488) {
	aList2337.remove(class488);
    }
    
    boolean method4220(Class488 class488, int i) {
	return aList2337.contains(class488);
    }
    
    void method4221(Class488 class488, byte i) {
	aList2337.remove(class488);
    }
    
    Class222(Class217 class217) {
	this$0 = class217;
	aList2337 = new ArrayList();
    }
    
    void method4222(Class488 class488) {
	aList2337.add(class488);
    }
    
    void method4223(Class488 class488) {
	aList2337.add(class488);
    }
    
    void method4224(Class488 class488, int i) {
	aList2337.add(class488);
    }
    
    void method4225(Class488 class488) {
	aList2337.add(class488);
    }
    
    void method4226(Class488 class488) {
	aList2337.remove(class488);
    }
    
    List method4227(byte i) {
	return aList2337;
    }
    
    List method4228() {
	return aList2337;
    }
    
    List method4229() {
	return aList2337;
    }
    
    List method4230() {
	return aList2337;
    }
    
    boolean method4231(Class488 class488) {
	return aList2337.contains(class488);
    }
    
    boolean method4232(Class488 class488) {
	return aList2337.contains(class488);
    }
    
    boolean method4233(Class488 class488) {
	return aList2337.contains(class488);
    }
    
    static final void method4234(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class263.method4784(class259, class245, class683, 1692523324);
    }
    
    static final void method4235(Class683 class683, int i)
	throws Exception_Sub7 {
	class683.anInt8662 -= 1915637188;
	float f
	    = (float) class683.anIntArray8661[501271953 * class683.anInt8662];
	float f_0_ = (float) (class683.anIntArray8661
			      [501271953 * class683.anInt8662 + 1]);
	float f_1_ = (float) (class683.anIntArray8661
			      [class683.anInt8662 * 501271953 + 2]);
	float f_2_ = ((float) (class683.anIntArray8661
			       [3 + class683.anInt8662 * 501271953])
		      / 1000.0F);
	Class453_Sub3.aClass309_Sub1_10316
	    .method5469(Class446.method7208(f, f_0_, f_1_), f_2_, -1886687689);
    }
    
    static final void method4236(Class683 class683, byte i) {
	class683.anInt8662 -= -1189665054;
	int i_3_ = class683.anIntArray8661[501271953 * class683.anInt8662];
	String string
	    = (String) (class683.anObjectArray8636
			[(class683.anInt8644 -= 1285561025) * 1373599041]);
	boolean bool
	    = class683.anIntArray8661[class683.anInt8662 * 501271953 + 1] == 1;
	Class696_Sub33.method17276(i_3_, string, bool, 255302559);
    }
    
    static final void method4237(Class683 class683, int i) {
	class683.anInt8662 -= -1189665054;
	int i_4_ = class683.anIntArray8661[class683.anInt8662 * 501271953];
	int i_5_ = class683.anIntArray8661[501271953 * class683.anInt8662 + 1];
	Class584.method9644(9, i_4_, i_5_, "", 1303826438);
    }
    
    static final void method4238(Class683 class683, int i) {
	int i_6_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub2_10694
		  .method14167(i_6_, (byte) -36);
    }
    
    static final void method4239(Class683 class683, int i) {
	class683.anInt8662 -= -1189665054;
	int i_7_ = class683.anIntArray8661[class683.anInt8662 * 501271953];
	int i_8_ = class683.anIntArray8661[class683.anInt8662 * 501271953 + 1];
	int i_9_ = client.aClass486ArrayArray11128[i_8_][i_7_]
		       .method7845(-684733318);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = 5 == i_9_ ? 1 : 0;
    }
    
    public static void method4240
	(Class656_Sub1_Sub3_Sub1_Sub2 class656_sub1_sub3_sub1_sub2, int i) {
	for (Class525_Sub2 class525_sub2
		 = ((Class525_Sub2)
		    Class525_Sub2.aClass709_10411.method14372((short) -10389));
	     null != class525_sub2;
	     class525_sub2 = (Class525_Sub2) Class525_Sub2.aClass709_10411
						 .method14353(-1797900980)) {
	    if (class656_sub1_sub3_sub1_sub2
		== class525_sub2.aClass656_Sub1_Sub3_Sub1_Sub2_10424) {
		if (null != class525_sub2.aClass488_10435) {
		    class525_sub2.aClass488_10435.method7916(100, (byte) -99);
		    Class40_Sub20.aClass217_11050
			.method4026(class525_sub2.aClass488_10435, 1568504540);
		    class525_sub2.aClass488_10435 = null;
		}
		class525_sub2.method8755(-1933461091);
		break;
	    }
	}
    }
}
