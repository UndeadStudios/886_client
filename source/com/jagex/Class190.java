/* Class190 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Canvas;

public class Class190
{
    static Class190 aClass190_2136;
    static Class190 aClass190_2137;
    static Class190 aClass190_2138 = new Class190();
    static long aLong2139;
    
    static {
	aClass190_2137 = new Class190();
	aClass190_2136 = new Class190();
    }
    
    Class190() {
	/* empty */
    }
    
    static void method3690(Class525_Sub16_Sub16 class525_sub16_sub16, int i) {
	if (class525_sub16_sub16 != null) {
	    Class61.aClass709_660.method14345(class525_sub16_sub16, (byte) 0);
	    Class61.anInt658 += 963673869;
	    Object object = null;
	    Class525_Sub16_Sub7 class525_sub16_sub7;
	    if (!class525_sub16_sub16.aBool11867
		&& !"".equals(class525_sub16_sub16.aString11868)) {
		long l
		    = class525_sub16_sub16.aLong11866 * -4663703702830765539L;
		for (class525_sub16_sub7 = ((Class525_Sub16_Sub7)
					    Class61.aClass10_661.method684(l));
		     (null != class525_sub16_sub7
		      && !class525_sub16_sub7.aString11779
			      .equals(class525_sub16_sub16.aString11868));
		     class525_sub16_sub7
			 = ((Class525_Sub16_Sub7)
			    Class61.aClass10_661.method696(-2057538770))) {
		    /* empty */
		}
		if (null == class525_sub16_sub7) {
		    class525_sub16_sub7
			= ((Class525_Sub16_Sub7)
			   Class61.aClass200_653.method3785(l));
		    if (class525_sub16_sub7 != null
			&& !class525_sub16_sub7.aString11779
				.equals(class525_sub16_sub16.aString11868))
			class525_sub16_sub7 = null;
		    if (class525_sub16_sub7 == null)
			class525_sub16_sub7
			    = new Class525_Sub16_Sub7(class525_sub16_sub16
						      .aString11868);
		    Class61.aClass10_661.method695(class525_sub16_sub7, l);
		    Class61.anInt659 += 507109661;
		}
	    } else {
		class525_sub16_sub7
		    = new Class525_Sub16_Sub7(class525_sub16_sub16
					      .aString11868);
		Class61.anInt659 += 507109661;
	    }
	    if (class525_sub16_sub7.method18290(class525_sub16_sub16,
						-937427579))
		Class176.method2911(class525_sub16_sub7, (byte) 0);
	}
    }
    
    static final void method3691(Class683 class683, int i) {
	Class663.method10966(621638961);
    }
    
    static Class525_Sub10 method3692(int i, boolean bool, byte i_0_) {
	long l = (long) (i | (bool ? -2147483648 : 0));
	return (Class525_Sub10) Class525_Sub10.aClass10_10509.method684(l);
    }
    
    static void method3693(Class182 class182, int i) {
	if (Class108.aClass709_1308.method14410((short) 8192) != 0) {
	    if (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub20_10708
		    .method17160(-900732897)
		== 0) {
		for (Class525_Sub6 class525_sub6
			 = (Class525_Sub6) Class108.aClass709_1308
					       .method14372((short) -11778);
		     null != class525_sub6;
		     class525_sub6
			 = (Class525_Sub6) Class108.aClass709_1308
					       .method14353(-1977739262)) {
		    Class313_Sub2.aClass40_Sub22_10106.method17503
			(class182, class182,
			 class525_sub6.anInt10480 * -865738991,
			 class525_sub6.anInt10482 * 1781753297,
			 class525_sub6.anInt10481 * -494138899,
			 -821120623 * class525_sub6.anInt10479, false, false,
			 -467808145 * class525_sub6.anInt10483,
			 Class222.aClass175_2338,
			 (class525_sub6.aBool10484
			  ? (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
			     .aClass637_12246)
			  : null),
			 Class138.aClass631_1641, (byte) -21);
		    class525_sub6.method8755(-1933461091);
		}
		Class83.method1604(-1965081426);
	    } else {
		if (null == Class108.aClass182_1306) {
		    Canvas canvas = new Canvas();
		    canvas.setSize(36, 32);
		    Class108.aClass182_1306
			= Class232.method4394(0, canvas,
					      Class166.aClass180_1835,
					      Class411.anInterface24_4255,
					      Class628.aClass385_8157,
					      Class263.aClass402_2799,
					      Class450.aClass400_4926,
					      Class17_Sub1.aClass458_11027, 0,
					      1484986552);
		    Class108.aClass175_1307
			= (Class108.aClass182_1306.method3223
			   (Class49.method1125(Class276.aClass458_2875,
					       Class29.anInt286 * -1687840411,
					       0, (short) -12458),
			    Class187.method3674(Class462.aClass458_5095,
						Class29.anInt286 * -1687840411,
						0),
			    true));
		}
		for (Class525_Sub6 class525_sub6
			 = (Class525_Sub6) Class108.aClass709_1308
					       .method14372((short) -23721);
		     class525_sub6 != null;
		     class525_sub6
			 = (Class525_Sub6) Class108.aClass709_1308
					       .method14353(-1995265415)) {
		    Class313_Sub2.aClass40_Sub22_10106.method17503
			(Class108.aClass182_1306, class182,
			 -865738991 * class525_sub6.anInt10480,
			 1781753297 * class525_sub6.anInt10482,
			 class525_sub6.anInt10481 * -494138899,
			 class525_sub6.anInt10479 * -821120623, false, false,
			 class525_sub6.anInt10483 * -467808145,
			 Class108.aClass175_1307,
			 (class525_sub6.aBool10484
			  ? (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
			     .aClass637_12246)
			  : null),
			 Class138.aClass631_1641, (byte) 25);
		    class525_sub6.method8755(-1933461091);
		}
	    }
	}
    }
}
