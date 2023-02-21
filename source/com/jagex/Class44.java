/* Class44 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import com.jagex.twitchtv.TwitchWebcamDevice;
import com.jagex.twitchtv.TwitchWebcamDeviceCapability;

public class Class44
{
    static int anInt344;
    static Class309_Sub1 aClass309_Sub1_345;
    static boolean aBool346 = false;
    static int anInt347;
    
    static void method1074() {
	aClass309_Sub1_345 = null;
	aBool346 = false;
    }
    
    static void method1075(Class525_Sub28 class525_sub28) {
	aClass309_Sub1_345 = new Class309_Sub1(client.aClass28_11341);
	aClass309_Sub1_345.method5572(Class294.aClass294_3240, 2061926410);
	try {
	    Class350_Sub3 class350_sub3
		= ((Class350_Sub3)
		   aClass309_Sub1_345.method5552(Class289.aClass289_3204,
						 false, 1196076041));
	    Class704_Sub5 class704_sub5
		= ((Class704_Sub5)
		   aClass309_Sub1_345.method5578(Class298.aClass298_3275,
						 false, (byte) -13));
	    class350_sub3.method15911(class525_sub28, (byte) -6);
	    class704_sub5.method17459(new Class429(0.0F, 0.0F, 0.0F),
				      (byte) -84);
	    aClass309_Sub1_345.method5607(Class446.method7208(99999.0F,
							      99999.0F,
							      99999.0F),
					  (byte) 13);
	    aClass309_Sub1_345.method5560
		(Class446.method7208(Float.POSITIVE_INFINITY,
				     Float.POSITIVE_INFINITY,
				     Float.POSITIVE_INFINITY),
		 -394935966);
	    aClass309_Sub1_345.method5465(Class446.method7208(99999.0F,
							      99999.0F,
							      99999.0F),
					  -2140192239);
	    aClass309_Sub1_345.method5495
		(Class446.method7208(Float.POSITIVE_INFINITY,
				     Float.POSITIVE_INFINITY,
				     Float.POSITIVE_INFINITY),
		 1528094492);
	} catch (Exception_Sub7 exception_sub7) {
	    /* empty */
	}
	anInt344
	    = Class509.aClass569_5662.method9498(-1439043956) * 1093855195;
	anInt347 = Class509.aClass569_5662.method9499(501271953) * 32519171;
	aBool346 = true;
    }
    
    static void method1076(Class525_Sub28 class525_sub28) {
	aClass309_Sub1_345 = new Class309_Sub1(client.aClass28_11341);
	aClass309_Sub1_345.method5572(Class294.aClass294_3240, 2097844394);
	try {
	    Class350_Sub3 class350_sub3
		= ((Class350_Sub3)
		   aClass309_Sub1_345.method5552(Class289.aClass289_3204,
						 false, 1196076041));
	    Class704_Sub5 class704_sub5
		= ((Class704_Sub5)
		   aClass309_Sub1_345.method5578(Class298.aClass298_3275,
						 false, (byte) -71));
	    class350_sub3.method15911(class525_sub28, (byte) -52);
	    class704_sub5.method17459(new Class429(0.0F, 0.0F, 0.0F),
				      (byte) -87);
	    aClass309_Sub1_345.method5607(Class446.method7208(99999.0F,
							      99999.0F,
							      99999.0F),
					  (byte) 54);
	    aClass309_Sub1_345.method5560
		(Class446.method7208(Float.POSITIVE_INFINITY,
				     Float.POSITIVE_INFINITY,
				     Float.POSITIVE_INFINITY),
		 -394935966);
	    aClass309_Sub1_345.method5465(Class446.method7208(99999.0F,
							      99999.0F,
							      99999.0F),
					  -2140365902);
	    aClass309_Sub1_345.method5495
		(Class446.method7208(Float.POSITIVE_INFINITY,
				     Float.POSITIVE_INFINITY,
				     Float.POSITIVE_INFINITY),
		 -787098162);
	} catch (Exception_Sub7 exception_sub7) {
	    /* empty */
	}
	anInt344
	    = Class509.aClass569_5662.method9498(-1727568835) * 1093855195;
	anInt347 = Class509.aClass569_5662.method9499(501271953) * 32519171;
	aBool346 = true;
    }
    
    static void method1077() {
	aClass309_Sub1_345 = null;
	aBool346 = false;
    }
    
    static void method1078() {
	Class350_Sub3 class350_sub3
	    = (Class350_Sub3) aClass309_Sub1_345.method5481(-1042626766);
	Class704_Sub5 class704_sub5
	    = (Class704_Sub5) aClass309_Sub1_345.method5482(-2083738578);
	Class446 class446 = class350_sub3.method6131(-1367000544);
	Class429 class429 = class704_sub5.method17463(-331460738);
	if (client.aClass259_11268 != null) {
	    int i = client.aClass259_11268.anInt2602 * -1694810043;
	    int i_0_ = client.aClass259_11268.anInt2598 * 2054207119;
	    float f = 1000.0F;
	    float f_1_
		= (float) (2.0 * Math.atan((double) ((float) i / 2.0F / f)));
	    float f_2_ = (float) (2.0 * Math.atan((double) ((float) i_0_ / 2.0F
							    / f)));
	    try {
		aClass309_Sub1_345.method5509(f_1_, f_2_, -1024641701);
	    } catch (Exception_Sub7 exception_sub7) {
		/* empty */
	    }
	}
	if (Class509.aClass569_5662.method9501(-1807613212)) {
	    Class429 class429_3_ = Class429.method6864();
	    class429_3_.method6811(1.0F, 0.0F, 0.0F,
				   ((float) (Class509.aClass569_5662
						 .method9499(501271953)
					     - anInt347 * -1945692501)
				    / 200.0F));
	    class429.method6822(class429_3_);
	    Class446 class446_4_ = Class446.method7208(0.0F, 1.0F, 0.0F);
	    class446_4_.method7239(class429);
	    Class429 class429_5_ = Class429.method6864();
	    class429_5_.method6810(class446_4_,
				   ((float) (anInt344 * 953072723
					     - Class509.aClass569_5662
						   .method9498(-1082745627))
				    / 200.0F));
	    class429.method6822(class429_5_);
	    class704_sub5.method17459(class429, (byte) -101);
	}
	anInt344 = Class509.aClass569_5662.method9498(795888927) * 1093855195;
	anInt347 = Class509.aClass569_5662.method9499(501271953) * 32519171;
	class429.method6815();
	if (Class198_Sub21.aClass551_10003.method9149(98, 1359090847)) {
	    Class446 class446_6_ = Class446.method7208(0.0F, 0.0F, 25.0F);
	    class446_6_.method7239(class429);
	    class446_6_.aFloat4896 *= -1.0F;
	    class446.method7221(class446_6_);
	}
	if (Class198_Sub21.aClass551_10003.method9149(99, 1135151521)) {
	    Class446 class446_7_ = Class446.method7208(0.0F, 0.0F, -25.0F);
	    class446_7_.method7239(class429);
	    class446_7_.aFloat4896 *= -1.0F;
	    class446.method7221(class446_7_);
	}
	if (Class198_Sub21.aClass551_10003.method9149(96, 1050800770)) {
	    Class446 class446_8_ = Class446.method7208(-25.0F, 0.0F, 0.0F);
	    class446_8_.method7239(class429);
	    class446_8_.aFloat4896 *= -1.0F;
	    class446.method7221(class446_8_);
	}
	if (Class198_Sub21.aClass551_10003.method9149(97, 1844744867)) {
	    Class446 class446_9_ = Class446.method7208(25.0F, 0.0F, 0.0F);
	    class446_9_.method7239(class429);
	    class446_9_.aFloat4896 *= -1.0F;
	    class446.method7221(class446_9_);
	}
	Class525_Sub28 class525_sub28
	    = new Class525_Sub28(0, (int) class446.aFloat4895,
				 (int) class446.aFloat4896,
				 (int) class446.aFloat4897);
	class350_sub3.method15911(class525_sub28, (byte) -116);
	Class600 class600 = client.aClass507_11137.method8350(73029644);
	int i = class600.anInt7858 * -1227002079 << 9;
	int i_10_ = 1429253007 * class600.anInt7860 << 9;
	aClass309_Sub1_345.method5453(0.02F,
				      (client.aClass507_11137.method8359
				       (-1495231309).anIntArrayArrayArray4966),
				      client.aClass507_11137
					  .method8360(1694012939),
				      i, i_10_, -990179196);
    }
    
    static boolean method1079() {
	return aBool346;
    }
    
    static void method1080() {
	Class350_Sub3 class350_sub3
	    = (Class350_Sub3) aClass309_Sub1_345.method5481(-513256196);
	Class704_Sub5 class704_sub5
	    = (Class704_Sub5) aClass309_Sub1_345.method5482(1221683978);
	Class446 class446 = class350_sub3.method6131(-1662921930);
	Class429 class429 = class704_sub5.method17463(-2118525782);
	if (client.aClass259_11268 != null) {
	    int i = client.aClass259_11268.anInt2602 * -1694810043;
	    int i_11_ = client.aClass259_11268.anInt2598 * 2054207119;
	    float f = 1000.0F;
	    float f_12_
		= (float) (2.0 * Math.atan((double) ((float) i / 2.0F / f)));
	    float f_13_ = (float) (2.0 * Math.atan((double) ((float) i_11_
							     / 2.0F / f)));
	    try {
		aClass309_Sub1_345.method5509(f_12_, f_13_, -1784222296);
	    } catch (Exception_Sub7 exception_sub7) {
		/* empty */
	    }
	}
	if (Class509.aClass569_5662.method9501(-2100552960)) {
	    Class429 class429_14_ = Class429.method6864();
	    class429_14_.method6811(1.0F, 0.0F, 0.0F,
				    ((float) (Class509.aClass569_5662
						  .method9499(501271953)
					      - anInt347 * -1945692501)
				     / 200.0F));
	    class429.method6822(class429_14_);
	    Class446 class446_15_ = Class446.method7208(0.0F, 1.0F, 0.0F);
	    class446_15_.method7239(class429);
	    Class429 class429_16_ = Class429.method6864();
	    class429_16_.method6810(class446_15_,
				    ((float) (anInt344 * 953072723
					      - Class509.aClass569_5662
						    .method9498(-513648544))
				     / 200.0F));
	    class429.method6822(class429_16_);
	    class704_sub5.method17459(class429, (byte) -102);
	}
	anInt344 = Class509.aClass569_5662.method9498(1062531825) * 1093855195;
	anInt347 = Class509.aClass569_5662.method9499(501271953) * 32519171;
	class429.method6815();
	if (Class198_Sub21.aClass551_10003.method9149(98, 1399603863)) {
	    Class446 class446_17_ = Class446.method7208(0.0F, 0.0F, 25.0F);
	    class446_17_.method7239(class429);
	    class446_17_.aFloat4896 *= -1.0F;
	    class446.method7221(class446_17_);
	}
	if (Class198_Sub21.aClass551_10003.method9149(99, 921745346)) {
	    Class446 class446_18_ = Class446.method7208(0.0F, 0.0F, -25.0F);
	    class446_18_.method7239(class429);
	    class446_18_.aFloat4896 *= -1.0F;
	    class446.method7221(class446_18_);
	}
	if (Class198_Sub21.aClass551_10003.method9149(96, 1709748571)) {
	    Class446 class446_19_ = Class446.method7208(-25.0F, 0.0F, 0.0F);
	    class446_19_.method7239(class429);
	    class446_19_.aFloat4896 *= -1.0F;
	    class446.method7221(class446_19_);
	}
	if (Class198_Sub21.aClass551_10003.method9149(97, 1180611647)) {
	    Class446 class446_20_ = Class446.method7208(25.0F, 0.0F, 0.0F);
	    class446_20_.method7239(class429);
	    class446_20_.aFloat4896 *= -1.0F;
	    class446.method7221(class446_20_);
	}
	Class525_Sub28 class525_sub28
	    = new Class525_Sub28(0, (int) class446.aFloat4895,
				 (int) class446.aFloat4896,
				 (int) class446.aFloat4897);
	class350_sub3.method15911(class525_sub28, (byte) -51);
	Class600 class600 = client.aClass507_11137.method8350(-837723130);
	int i = class600.anInt7858 * -1227002079 << 9;
	int i_21_ = 1429253007 * class600.anInt7860 << 9;
	aClass309_Sub1_345.method5453(0.02F,
				      (client.aClass507_11137.method8359
				       (905064428).anIntArrayArrayArray4966),
				      client.aClass507_11137
					  .method8360(2086271499),
				      i, i_21_, 1721578829);
    }
    
    static void method1081() {
	Class350_Sub3 class350_sub3
	    = (Class350_Sub3) aClass309_Sub1_345.method5481(-1821665152);
	Class704_Sub5 class704_sub5
	    = (Class704_Sub5) aClass309_Sub1_345.method5482(-896745407);
	Class446 class446 = class350_sub3.method6131(-1406132395);
	Class429 class429 = class704_sub5.method17463(8682517);
	if (client.aClass259_11268 != null) {
	    int i = client.aClass259_11268.anInt2602 * -1694810043;
	    int i_22_ = client.aClass259_11268.anInt2598 * 2054207119;
	    float f = 1000.0F;
	    float f_23_
		= (float) (2.0 * Math.atan((double) ((float) i / 2.0F / f)));
	    float f_24_ = (float) (2.0 * Math.atan((double) ((float) i_22_
							     / 2.0F / f)));
	    try {
		aClass309_Sub1_345.method5509(f_23_, f_24_, -2124972839);
	    } catch (Exception_Sub7 exception_sub7) {
		/* empty */
	    }
	}
	if (Class509.aClass569_5662.method9501(-1840439353)) {
	    Class429 class429_25_ = Class429.method6864();
	    class429_25_.method6811(1.0F, 0.0F, 0.0F,
				    ((float) (Class509.aClass569_5662
						  .method9499(501271953)
					      - anInt347 * -1945692501)
				     / 200.0F));
	    class429.method6822(class429_25_);
	    Class446 class446_26_ = Class446.method7208(0.0F, 1.0F, 0.0F);
	    class446_26_.method7239(class429);
	    Class429 class429_27_ = Class429.method6864();
	    class429_27_.method6810(class446_26_,
				    ((float) (anInt344 * 953072723
					      - Class509.aClass569_5662
						    .method9498(1000955914))
				     / 200.0F));
	    class429.method6822(class429_27_);
	    class704_sub5.method17459(class429, (byte) -99);
	}
	anInt344
	    = Class509.aClass569_5662.method9498(-2027315839) * 1093855195;
	anInt347 = Class509.aClass569_5662.method9499(501271953) * 32519171;
	class429.method6815();
	if (Class198_Sub21.aClass551_10003.method9149(98, 535664388)) {
	    Class446 class446_28_ = Class446.method7208(0.0F, 0.0F, 25.0F);
	    class446_28_.method7239(class429);
	    class446_28_.aFloat4896 *= -1.0F;
	    class446.method7221(class446_28_);
	}
	if (Class198_Sub21.aClass551_10003.method9149(99, 1141925655)) {
	    Class446 class446_29_ = Class446.method7208(0.0F, 0.0F, -25.0F);
	    class446_29_.method7239(class429);
	    class446_29_.aFloat4896 *= -1.0F;
	    class446.method7221(class446_29_);
	}
	if (Class198_Sub21.aClass551_10003.method9149(96, 820263444)) {
	    Class446 class446_30_ = Class446.method7208(-25.0F, 0.0F, 0.0F);
	    class446_30_.method7239(class429);
	    class446_30_.aFloat4896 *= -1.0F;
	    class446.method7221(class446_30_);
	}
	if (Class198_Sub21.aClass551_10003.method9149(97, 1365785251)) {
	    Class446 class446_31_ = Class446.method7208(25.0F, 0.0F, 0.0F);
	    class446_31_.method7239(class429);
	    class446_31_.aFloat4896 *= -1.0F;
	    class446.method7221(class446_31_);
	}
	Class525_Sub28 class525_sub28
	    = new Class525_Sub28(0, (int) class446.aFloat4895,
				 (int) class446.aFloat4896,
				 (int) class446.aFloat4897);
	class350_sub3.method15911(class525_sub28, (byte) -96);
	Class600 class600 = client.aClass507_11137.method8350(-149838239);
	int i = class600.anInt7858 * -1227002079 << 9;
	int i_32_ = 1429253007 * class600.anInt7860 << 9;
	aClass309_Sub1_345.method5453(0.02F,
				      (client.aClass507_11137.method8359
				       (-1008085970).anIntArrayArrayArray4966),
				      client.aClass507_11137
					  .method8360(1759601737),
				      i, i_32_, 164805048);
    }
    
    Class44() throws Throwable {
	throw new Error();
    }
    
    static void method1082() {
	Class350_Sub3 class350_sub3
	    = (Class350_Sub3) aClass309_Sub1_345.method5481(-2114363096);
	Class704_Sub5 class704_sub5
	    = (Class704_Sub5) aClass309_Sub1_345.method5482(1374659482);
	Class446 class446 = class350_sub3.method6131(-542481563);
	Class429 class429 = class704_sub5.method17463(-1319785478);
	if (client.aClass259_11268 != null) {
	    int i = client.aClass259_11268.anInt2602 * -1694810043;
	    int i_33_ = client.aClass259_11268.anInt2598 * 2054207119;
	    float f = 1000.0F;
	    float f_34_
		= (float) (2.0 * Math.atan((double) ((float) i / 2.0F / f)));
	    float f_35_ = (float) (2.0 * Math.atan((double) ((float) i_33_
							     / 2.0F / f)));
	    try {
		aClass309_Sub1_345.method5509(f_34_, f_35_, -940494152);
	    } catch (Exception_Sub7 exception_sub7) {
		/* empty */
	    }
	}
	if (Class509.aClass569_5662.method9501(-1865188004)) {
	    Class429 class429_36_ = Class429.method6864();
	    class429_36_.method6811(1.0F, 0.0F, 0.0F,
				    ((float) (Class509.aClass569_5662
						  .method9499(501271953)
					      - anInt347 * -1945692501)
				     / 200.0F));
	    class429.method6822(class429_36_);
	    Class446 class446_37_ = Class446.method7208(0.0F, 1.0F, 0.0F);
	    class446_37_.method7239(class429);
	    Class429 class429_38_ = Class429.method6864();
	    class429_38_.method6810(class446_37_,
				    ((float) (anInt344 * 953072723
					      - Class509.aClass569_5662
						    .method9498(-1930206297))
				     / 200.0F));
	    class429.method6822(class429_38_);
	    class704_sub5.method17459(class429, (byte) -82);
	}
	anInt344 = Class509.aClass569_5662.method9498(-158120092) * 1093855195;
	anInt347 = Class509.aClass569_5662.method9499(501271953) * 32519171;
	class429.method6815();
	if (Class198_Sub21.aClass551_10003.method9149(98, 1288747782)) {
	    Class446 class446_39_ = Class446.method7208(0.0F, 0.0F, 25.0F);
	    class446_39_.method7239(class429);
	    class446_39_.aFloat4896 *= -1.0F;
	    class446.method7221(class446_39_);
	}
	if (Class198_Sub21.aClass551_10003.method9149(99, 1766798724)) {
	    Class446 class446_40_ = Class446.method7208(0.0F, 0.0F, -25.0F);
	    class446_40_.method7239(class429);
	    class446_40_.aFloat4896 *= -1.0F;
	    class446.method7221(class446_40_);
	}
	if (Class198_Sub21.aClass551_10003.method9149(96, 1543007120)) {
	    Class446 class446_41_ = Class446.method7208(-25.0F, 0.0F, 0.0F);
	    class446_41_.method7239(class429);
	    class446_41_.aFloat4896 *= -1.0F;
	    class446.method7221(class446_41_);
	}
	if (Class198_Sub21.aClass551_10003.method9149(97, 572510161)) {
	    Class446 class446_42_ = Class446.method7208(25.0F, 0.0F, 0.0F);
	    class446_42_.method7239(class429);
	    class446_42_.aFloat4896 *= -1.0F;
	    class446.method7221(class446_42_);
	}
	Class525_Sub28 class525_sub28
	    = new Class525_Sub28(0, (int) class446.aFloat4895,
				 (int) class446.aFloat4896,
				 (int) class446.aFloat4897);
	class350_sub3.method15911(class525_sub28, (byte) -91);
	Class600 class600 = client.aClass507_11137.method8350(726640759);
	int i = class600.anInt7858 * -1227002079 << 9;
	int i_43_ = 1429253007 * class600.anInt7860 << 9;
	aClass309_Sub1_345.method5453(0.02F,
				      (client.aClass507_11137.method8359
				       (759409919).anIntArrayArrayArray4966),
				      client.aClass507_11137
					  .method8360(2036156980),
				      i, i_43_, -239052870);
    }
    
    public static void method1083(int i) {
	Class589.anInt7804 = -1007231145;
    }
    
    static void method1084(Class683 class683, byte i) {
	String string
	    = (String) (class683.anObjectArray8636
			[(class683.anInt8644 -= 1285561025) * 1373599041]);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class524.method8753(string, (short) 128);
    }
    
    static void method1085(Class683 class683, int i) {
	class683.anInt8662 -= -1189665054;
	int i_44_ = class683.anIntArray8661[class683.anInt8662 * 501271953];
	int i_45_
	    = class683.anIntArray8661[501271953 * class683.anInt8662 + 1];
	TwitchWebcamDevice twitchwebcamdevice
	    = Class541.method8901(i_44_, -371013555);
	TwitchWebcamDeviceCapability twitchwebcamdevicecapability = null;
	if (twitchwebcamdevice != null)
	    twitchwebcamdevicecapability
		= twitchwebcamdevice.method1753(i_45_);
	if (null == twitchwebcamdevicecapability) {
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= -1;
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= -1;
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= -1;
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= -1;
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= -1;
	} else {
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= twitchwebcamdevicecapability.anInt1159 * -530318113;
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= twitchwebcamdevicecapability.anInt1160 * 1797575109;
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= twitchwebcamdevicecapability.anInt1161 * -1777334653;
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= twitchwebcamdevicecapability.anInt1162 * -169581313;
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= twitchwebcamdevicecapability.anInt1163 * -1668677381;
	}
    }
    
    static final void method1086(Class683 class683, int i) {
	class683.anInt8662 -= 1552651121;
	int i_46_ = class683.anIntArray8661[501271953 * class683.anInt8662];
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class519.method8660(i_46_, 1630489187);
    }
    
    static final void method1087(Class683 class683, int i) {
	class683.anInt8662 -= 1552651121;
    }
    
    static final void method1088(Class683 class683, int i) {
	class683.anInt8662 -= 1552651121;
    }
    
    static final void method1089(Class683 class683, byte i) {
	class683.aLongArray8645[((class683.anInt8648 += 2101136961) * 105529793
				 - 1)]
	    = (class683.aLongArray8638
	       [class683.anIntArray8647[class683.anInt8663 * 1931825055]]);
    }
}
