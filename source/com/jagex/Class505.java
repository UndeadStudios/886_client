/* Class505 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.IOException;

public class Class505
{
    public static void method8318(boolean bool) {
	Class40_Sub20.aClass217_11050.method4028(1497605201);
	if (Class265.method4801(client.anInt11075 * 1777895575, -200922594)) {
	    Class96[] class96s = client.aClass96Array11133;
	    for (int i = 0; i < class96s.length; i++) {
		Class96 class96 = class96s[i];
		class96.anInt1182 += -1049943141;
		if (class96.anInt1182 * -303330669 < 50 && !bool)
		    return;
		class96.anInt1182 = 0;
		if (!class96.aBool1184
		    && class96.method1799((byte) 0) != null) {
		    Class525_Sub15 class525_sub15
			= Class16.method767(Class412.aClass412_4351,
					    class96.aClass6_1169, 1977859884);
		    class96.method1794(class525_sub15, (short) 25579);
		    try {
			class96.method1792(1043904029);
		    } catch (IOException ioexception) {
			class96.aBool1184 = true;
		    }
		}
	    }
	    Class40_Sub20.aClass217_11050.method4028(2076624464);
	}
    }
    
    Class505() throws Throwable {
	throw new Error();
    }
    
    public static void method8319(boolean bool) {
	Class40_Sub20.aClass217_11050.method4028(1405876715);
	if (Class265.method4801(client.anInt11075 * 1777895575, -1439787280)) {
	    Class96[] class96s = client.aClass96Array11133;
	    for (int i = 0; i < class96s.length; i++) {
		Class96 class96 = class96s[i];
		class96.anInt1182 += -1049943141;
		if (class96.anInt1182 * -303330669 < 50 && !bool)
		    return;
		class96.anInt1182 = 0;
		if (!class96.aBool1184
		    && class96.method1799((byte) 0) != null) {
		    Class525_Sub15 class525_sub15
			= Class16.method767(Class412.aClass412_4351,
					    class96.aClass6_1169, 1977859884);
		    class96.method1794(class525_sub15, (short) 3049);
		    try {
			class96.method1792(1992212707);
		    } catch (IOException ioexception) {
			class96.aBool1184 = true;
		    }
		}
	    }
	    Class40_Sub20.aClass217_11050.method4028(1417636522);
	}
    }
    
    static final void method8320(Class683 class683, byte i) {
	int i_0_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_0_, -695254952);
	Class332_Sub1.method15674(class259, class683, 1007100704);
    }
    
    public static boolean method8321(int i, int i_1_, byte i_2_) {
	if (Class661.aClass372_8473 == null
	    || Class661.aClass372_8473.method6342(-587373829) == null)
	    return false;
	if (i_1_ == i)
	    return true;
	Class393 class393 = Class661.aClass372_8473.method6342(-778178273)
				.method6398(i, 396163835);
	Class393 class393_3_ = Class661.aClass372_8473.method6342
				   (-406388161).method6398(i_1_, -635445193);
	Class393 class393_4_ = class393;
    while_13_:
	do {
	    do {
		if (class393_4_ == null)
		    break while_13_;
		class393_4_ = class393_4_.method6499(787398453);
		if (class393_4_ == class393_3_)
		    return true;
	    } while (class393_4_ != class393);
	    return false;
	} while (false);
	class393_4_ = class393_3_;
    while_14_:
	do {
	    do {
		if (null == class393_4_)
		    break while_14_;
		class393_4_ = class393_4_.method6499(-570973553);
		if (class393_4_ == class393)
		    return true;
	    } while (class393_3_ != class393_4_);
	    return false;
	} while (false);
	return false;
    }
    
    public static int method8322(int i) {
	return (null == Class589.aTwitchWebcamDeviceArray7803 ? 0
		: Class589.aTwitchWebcamDeviceArray7803.length);
    }
}
