/* Class512 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.File;

public class Class512
{
    public static String aString5684;
    public static String aString5685;
    static String aString5686;
    public static String aString5687;
    
    static {
	String string = "Unknown";
	try {
	    string = System.getProperty("java.vendor").toLowerCase();
	} catch (Exception exception) {
	    /* empty */
	}
	string.toLowerCase();
	string = "Unknown";
	try {
	    string = System.getProperty("java.version").toLowerCase();
	} catch (Exception exception) {
	    /* empty */
	}
	string.toLowerCase();
	string = "Unknown";
	try {
	    string = System.getProperty("os.name").toLowerCase();
	} catch (Exception exception) {
	    /* empty */
	}
	aString5685 = string.toLowerCase();
	string = "Unknown";
	try {
	    string = System.getProperty("os.arch").toLowerCase();
	} catch (Exception exception) {
	    /* empty */
	}
	aString5687 = string.toLowerCase();
	string = "Unknown";
	try {
	    string = System.getProperty("os.version").toLowerCase();
	} catch (Exception exception) {
	    /* empty */
	}
	aString5686 = string.toLowerCase();
	aString5684 = String.format("%s (%s) [%s]",
				    new Object[] { aString5685, aString5687,
						   aString5686 });
	string = "~/";
	try {
	    string = System.getProperty("user.home").toLowerCase();
	} catch (Exception exception) {
	    /* empty */
	}
	new File(string);
    }
    
    Class512() throws Throwable {
	throw new Error();
    }
    
    static final void method8532(Class259 class259, Class683 class683, int i) {
	if (client.method17531(class259).method16130(1603116810)
	    && null == client.aClass259_11263) {
	    Class308_Sub1.method15762(class259.anInt2588 * 1984678839,
				      class259.anInt2576 * 1534974651,
				      (byte) -77);
	    client.aClass259_11263
		= Class147.method2388(class259.anInt2588 * 1984678839,
				      class259.anInt2576 * 1534974651,
				      -591235649);
	    Class649.method10708(client.aClass259_11263, (byte) 0);
	}
    }
    
    static final void method8533(Class683 class683, int i) {
	int i_0_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_0_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_0_ >> 16];
	Class271.method5018(class259, class245, class683, -2098811542);
    }
    
    static final void method8534(Class683 class683, short i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class50.method1129(class259, class683, 1356323069);
    }
    
    static final int method8535
	(Class656_Sub1_Sub3_Sub1 class656_sub1_sub3_sub1, byte i) {
	if (0 == class656_sub1_sub3_sub1.anInt12003 * 1128073317)
	    return 0;
	if (-705923653 * class656_sub1_sub3_sub1.anInt11983 != -1) {
	    Class656_Sub1_Sub3_Sub1 class656_sub1_sub3_sub1_1_ = null;
	    if (class656_sub1_sub3_sub1.anInt11983 * -705923653 < 32768) {
		Class525_Sub19 class525_sub19
		    = ((Class525_Sub19)
		       (client.aClass10_11121.method684
			((long) (-705923653
				 * class656_sub1_sub3_sub1.anInt11983))));
		if (class525_sub19 != null)
		    class656_sub1_sub3_sub1_1_
			= ((Class656_Sub1_Sub3_Sub1)
			   class525_sub19.anObject10571);
	    } else if (-705923653 * class656_sub1_sub3_sub1.anInt11983
		       >= 32768)
		class656_sub1_sub3_sub1_1_
		    = (client.aClass656_Sub1_Sub3_Sub1_Sub1Array11384
		       [(class656_sub1_sub3_sub1.anInt11983 * -705923653
			 - 32768)]);
	    if (class656_sub1_sub3_sub1_1_ != null) {
		Class446 class446
		    = Class446.method7225((class656_sub1_sub3_sub1.method10818
					   ().aClass446_4807),
					  class656_sub1_sub3_sub1_1_
					      .method10818().aClass446_4807);
		int i_2_ = (int) class446.aFloat4895;
		int i_3_ = (int) class446.aFloat4897;
		if (0 != i_2_ || i_3_ != 0)
		    class656_sub1_sub3_sub1.method18625
			((int) (Math.atan2((double) i_2_, (double) i_3_)
				* 2607.5945876176133) & 0x3fff,
			 (byte) 1);
	    }
	}
	if (class656_sub1_sub3_sub1 instanceof Class656_Sub1_Sub3_Sub1_Sub1) {
	    Class656_Sub1_Sub3_Sub1_Sub1 class656_sub1_sub3_sub1_sub1
		= (Class656_Sub1_Sub3_Sub1_Sub1) class656_sub1_sub3_sub1;
	    if (-1191180917 * class656_sub1_sub3_sub1_sub1.anInt12242 != -1
		&& (class656_sub1_sub3_sub1_sub1.anInt12015 * -2046237799 == 0
		    || (class656_sub1_sub3_sub1_sub1.anInt12019 * -782799573
			> 0))) {
		class656_sub1_sub3_sub1_sub1.method18625
		    (class656_sub1_sub3_sub1_sub1.anInt12242 * -1191180917,
		     (byte) 1);
		class656_sub1_sub3_sub1_sub1.anInt12242 = 1066304989;
	    }
	} else if (class656_sub1_sub3_sub1
		   instanceof Class656_Sub1_Sub3_Sub1_Sub2) {
	    Class656_Sub1_Sub3_Sub1_Sub2 class656_sub1_sub3_sub1_sub2
		= (Class656_Sub1_Sub3_Sub1_Sub2) class656_sub1_sub3_sub1;
	    if (class656_sub1_sub3_sub1_sub2.anInt12266 * -1497721863 != -1
		&& (0 == -2046237799 * class656_sub1_sub3_sub1_sub2.anInt12015
		    || (class656_sub1_sub3_sub1_sub2.anInt12019 * -782799573
			> 0))) {
		Class446 class446 = (class656_sub1_sub3_sub1_sub2.method10818()
				     .aClass446_4807);
		Class600 class600
		    = client.aClass507_11137.method8350(1815407436);
		int i_4_
		    = ((int) class446.aFloat4895
		       - (-1164707584 * class656_sub1_sub3_sub1_sub2.anInt12266
			  - class600.anInt7858 * -579919616
			  - class600.anInt7858 * -579919616));
		int i_5_
		    = ((int) class446.aFloat4897
		       - (-897606400 * class656_sub1_sub3_sub1_sub2.anInt12257
			  - 816549632 * class600.anInt7860
			  - class600.anInt7860 * 816549632));
		if (0 != i_4_ || 0 != i_5_)
		    class656_sub1_sub3_sub1_sub2.method18625
			((int) (Math.atan2((double) i_4_, (double) i_5_)
				* 2607.5945876176133) & 0x3fff,
			 (byte) 1);
		class656_sub1_sub3_sub1_sub2.anInt12266 = -1593949769;
	    }
	}
	return class656_sub1_sub3_sub1.method18598(1395410269);
    }
    
    public static int method8536(int i, int i_6_, int i_7_, int i_8_) {
	i_7_ &= 0x3;
	if (0 == i_7_)
	    return i_6_;
	if (1 == i_7_)
	    return 7 - i;
	if (2 == i_7_)
	    return 7 - i_6_;
	return i;
    }
    
    static final void method8537(Class683 class683, int i) {
	Class478.method7791(761749237);
    }
}
