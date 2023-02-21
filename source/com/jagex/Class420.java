/* Class420 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;

public class Class420
{
    public static Class420 aClass420_4677;
    static Class420[] aClass420Array4678;
    public static Class420 aClass420_4679;
    public static Class420 aClass420_4680;
    static Class420 aClass420_4681;
    static Class420 aClass420_4682;
    public static Class420 aClass420_4683;
    static Class420 aClass420_4684;
    public static Class420 aClass420_4685;
    public static Class420 aClass420_4686;
    public static Class420 aClass420_4687;
    static Class420 aClass420_4688;
    public int anInt4689;
    public static Class420 aClass420_4690 = new Class420(14, 0);
    
    Class420(int i, int i_0_) {
	anInt4689 = 352239421 * i;
    }
    
    static {
	aClass420_4679 = new Class420(15, -1);
	aClass420_4677 = new Class420(16, -2);
	aClass420_4680 = new Class420(19, -2);
	aClass420_4681 = new Class420(23, 4);
	aClass420_4688 = new Class420(24, -1);
	aClass420_4683 = new Class420(26, 0);
	aClass420_4684 = new Class420(27, 0);
	aClass420_4685 = new Class420(28, -2);
	aClass420_4686 = new Class420(29, -2);
	aClass420_4687 = new Class420(30, -2);
	aClass420_4682 = new Class420(31, 4);
	aClass420Array4678 = new Class420[32];
	Class420[] class420s = Class465.method7670(-1757849351);
	for (int i = 0; i < class420s.length; i++)
	    aClass420Array4678[class420s[i].anInt4689 * 573083669]
		= class420s[i];
    }
    
    static Class420[] method6739() {
	return (new Class420[]
		{ aClass420_4682, aClass420_4684, aClass420_4679,
		  aClass420_4683, aClass420_4688, aClass420_4686,
		  aClass420_4677, aClass420_4690, aClass420_4685,
		  aClass420_4687, aClass420_4681, aClass420_4680 });
    }
    
    static Class420[] method6740() {
	return (new Class420[]
		{ aClass420_4682, aClass420_4684, aClass420_4679,
		  aClass420_4683, aClass420_4688, aClass420_4686,
		  aClass420_4677, aClass420_4690, aClass420_4685,
		  aClass420_4687, aClass420_4681, aClass420_4680 });
    }
    
    static Class420[] method6741() {
	return (new Class420[]
		{ aClass420_4682, aClass420_4684, aClass420_4679,
		  aClass420_4683, aClass420_4688, aClass420_4686,
		  aClass420_4677, aClass420_4690, aClass420_4685,
		  aClass420_4687, aClass420_4681, aClass420_4680 });
    }
    
    static final void method6742(Class683 class683, int i) {
	Class656_Sub1_Sub3_Sub1_Sub2 class656_sub1_sub3_sub1_sub2
	    = ((Class656_Sub1_Sub3_Sub1_Sub2)
	       class683.aClass656_Sub1_Sub3_Sub1_8654);
	String string = class656_sub1_sub3_sub1_sub2.aString12264;
	Class299 class299 = class656_sub1_sub3_sub1_sub2.aClass299_12255;
	if (class299.anIntArray3323 != null) {
	    class299
		= class299.method5386(Class532.aClass111_7170,
				      Class532.aClass111_7170, 2098201888);
	    if (null == class299)
		string = "";
	    else
		string = class299.aString3290;
	}
	if (string == null)
	    string = "";
	class683.anObjectArray8636
	    [(class683.anInt8644 += 1285561025) * 1373599041 - 1]
	    = string;
    }
    
    static final void method6743(int i) {
	if (651106723 * client.anInt11257 > 1) {
	    client.anInt11257 -= 1965613579;
	    client.anInt11309 = -1428085261 * client.anInt11162;
	}
	if (client.aClass96_11085.aBool1184) {
	    client.aClass96_11085.aBool1184 = false;
	    Class196.method3742((byte) -9);
	} else {
	    if (!Class61.aBool670)
		Class272.method5024((byte) 61);
	    for (int i_1_ = 0;
		 i_1_ < 100 && Class332_Sub3.method15764(client.aClass96_11085,
							 -1846636497);
		 i_1_++) {
		/* empty */
	    }
	    if (client.anInt11075 * 1777895575 == 7) {
		while (Class205.method3880(1649580006)) {
		    Class525_Sub15 class525_sub15
			= Class16.method767(Class412.aClass412_4274,
					    client.aClass96_11085.aClass6_1169,
					    1977859884);
		    class525_sub15.aClass525_Sub38_Sub2_10546
			.method16735(0, -1766530593);
		    int i_2_ = (-1133521593
				* (class525_sub15.aClass525_Sub38_Sub2_10546
				   .pos));
		    Class70.method1520((class525_sub15
					.aClass525_Sub38_Sub2_10546),
				       1280945471);
		    class525_sub15.aClass525_Sub38_Sub2_10546.method16617
			(-1133521593 * (class525_sub15
					.aClass525_Sub38_Sub2_10546
					.pos) - i_2_,
			 (byte) 7);
		    client.aClass96_11085.method1794(class525_sub15,
						     (short) 5948);
		}
		if (null != Class69.aClass646_736) {
		    if (1053460905 * Class69.aClass646_736.anInt8356 != -1) {
			Class525_Sub15 class525_sub15
			    = Class16.method767(Class412.aClass412_4365,
						(client.aClass96_11085
						 .aClass6_1169),
						1977859884);
			if (null == Class696.aGarbageCollectorMXBean8764
			    || !Class696.aGarbageCollectorMXBean8764
				    .isValid()) {
			    try {
				Iterator iterator
				    = ManagementFactory
					  .getGarbageCollectorMXBeans
					  ().iterator();
				while (iterator.hasNext()) {
				    GarbageCollectorMXBean garbagecollectormxbean
					= ((GarbageCollectorMXBean)
					   iterator.next());
				    if (garbagecollectormxbean.isValid()) {
					Class696.aGarbageCollectorMXBean8764
					    = garbagecollectormxbean;
					client.aLong11372
					    = -4638451322752839517L;
					client.aLong11371
					    = -372314911543769669L;
				    }
				}
			    } catch (Throwable throwable) {
				/* empty */
			    }
			}
			long l = Class251.method4508((byte) 8);
			int i_3_ = -1;
			if (null != Class696.aGarbageCollectorMXBean8764) {
			    long l_4_ = Class696
					    .aGarbageCollectorMXBean8764
					    .getCollectionTime();
			    if (-1L
				!= -5531775462636697459L * client.aLong11371) {
				long l_5_ = l_4_ - (client.aLong11371
						    * -5531775462636697459L);
				long l_6_ = l - (9082050333274479861L
						 * client.aLong11372);
				if (l_6_ != 0L)
				    i_3_ = (int) (100L * l_5_ / l_6_);
			    }
			    client.aLong11371 = l_4_ * 372314911543769669L;
			    client.aLong11372 = l * 4638451322752839517L;
			}
			class525_sub15.aClass525_Sub38_Sub2_10546.method16602
			    (1053460905 * Class69.aClass646_736.anInt8356,
			     929165611);
			class525_sub15.aClass525_Sub38_Sub2_10546.method16696
			    (client.anInt5567 * -300823033, (short) 2048);
			class525_sub15.aClass525_Sub38_Sub2_10546
			    .method16696(i_3_, (short) -16978);
			client.aClass96_11085.method1794(class525_sub15,
							 (short) 29617);
			Class69.aClass646_736 = null;
			Class629.aLong8161
			    = (l + 30000L) * 1427417818750416449L;
		    }
		} else if (Class251.method4508((byte) 8)
			   >= Class629.aLong8161 * -1392327274559399487L)
		    Class69.aClass646_736
			= client.aClass642_11136.method10590((Class15
							      .aClass1_173
							      .aString10),
							     1638970567);
		Class96.method1816(-233337188);
		Class225.method4251(1628619096);
		Class525_Sub41 class525_sub41
		    = ((Class525_Sub41)
		       client.aClass709_11288.method14372((short) -20766));
		if (client.aClass507_11137.method8358((byte) 74) != null) {
		    if (-174799205 * Class700.anInt8779 == 3)
			Class70.method1518(985885596);
		    else if (Class700.anInt8779 * -174799205 == 6)
			Class691.method14110(-1231240462);
		}
		if (client.aBool11180)
		    client.aBool11180 = false;
		else
		    client.aFloat11179 /= 2.0F;
		if (client.aBool11181)
		    client.aBool11181 = false;
		else
		    client.aFloat11172 /= 2.0F;
		if (Class581.method9621((byte) 0))
		    Class665.method10999(975533973);
		else if (-174799205 * Class700.anInt8779 == 5) {
		    Class600 class600
			= client.aClass507_11137.method8350(560488025);
		    int i_7_ = class600.anInt7858 * -1227002079 << 9;
		    int i_8_ = 1429253007 * class600.anInt7860 << 9;
		    if (Class332_Sub1.aLong10010 * 6257091193382310091L <= 0L)
			Class332_Sub1.aLong10010
			    = (Class251.method4508((byte) 8)
			       * -3167411274493668125L);
		    float f = (float) (Class251.method4508((byte) 8)
				       - (6257091193382310091L
					  * Class332_Sub1.aLong10010));
		    int i_9_ = 1000 / Class424.method6768(1684836768);
		    i_9_ *= 1.25;
		    for (/**/; f > 0.0F; f -= (float) i_9_) {
			float f_10_ = Math.min(f, (float) i_9_);
			Class453_Sub3.aClass309_Sub1_10316.method5453
			    (f_10_ / 1000.0F,
			     (client.aClass507_11137.method8359(-2062014765)
			      .anIntArrayArrayArray4966),
			     client.aClass507_11137.method8360(1401862586),
			     i_7_, i_8_, -402361456);
		    }
		    Class332_Sub1.aLong10010 = (Class251.method4508((byte) 8)
						* -3167411274493668125L);
		}
		Class217.method4147(1804810257);
		if (client.anInt11075 * 1777895575 == 7) {
		    client.aClass507_11137.method8361((byte) 15)
			.method10382(client.aClass507_11137, 2075587491);
		    Class531_Sub6.method15994((byte) -44);
		    if (-372410643 * client.anInt11097 > 10)
			client.aClass96_11085.anInt1175 += 1236994417;
		    if (client.aClass96_11085.anInt1175 * 593401745 > 2250)
			Class196.method3742((byte) -79);
		    else {
			if (1 == 1874190559 * client.anInt11145) {
			    Class683.method11229((byte) 5);
			    Class689.method14094((short) 22480);
			} else if (Class685.aClass630_8692
				       .anInterface66_8163.method430
				   (class525_sub41,
				    client.anInterface64Array11106,
				    client.anInt11273 * 1353095005,
				    Class198_Sub21.aClass551_10003,
				    1590248629))
			    Class231.method4392(false, (short) -6420);
			else {
			    if (0 == client.anInt11145 * 1874190559
				&& Class327.method5767((1278550387
							* client.anInt11280),
						       362372318)) {
				client.aClass507_11137.method8376
				    (new Class514(Class499.aClass499_5551,
						  null),
				     -1133521593);
				client.anInt11145 = -712264130;
			    }
			    if (2 == client.anInt11145 * 1874190559
				&& 1777895575 * client.anInt11075 != 4) {
				Class201.aClass10_2204.method688((short) 9700);
				client.anInt11145 = -1424528260;
				client.anInt11147
				    = client.anInt11083 * 1429589879;
				client.anInt11148 = 0;
				client.aBool11146 = false;
				Class472.method7751((byte) 16);
			    }
			    if (4 == 1874190559 * client.anInt11145) {
				int i_11_ = (client.anInt11083
					     - 1898035783 * client.anInt11147);
				if (-1425383399 * client.anInt11148
				    < Class201.aClass198Array2205.length) {
				    do {
					Class198 class198
					    = (Class201.aClass198Array2205
					       [(-1425383399
						 * client.anInt11148)]);
					if (class198.anInt2188 * 1477543291
					    > i_11_)
					    break;
					class198.method3753(-402362614);
				    } while ((1874190559 * client.anInt11145
					      == 4)
					     && ((client.anInt11148
						  += 711916585) * -1425383399
						 < (Class201
						    .aClass198Array2205).length));
				}
				if (4 == 1874190559 * client.anInt11145) {
				    for (int i_12_ = 0;
					 i_12_ < (Class201
						  .aClass205Array2202).length;
					 i_12_++) {
					Class205 class205
					    = (Class201.aClass205Array2202
					       [i_12_]);
					if (class205.aBool2242) {
					    Class656_Sub1_Sub3_Sub1 class656_sub1_sub3_sub1
						= class205
						      .method3864(1180537464);
					    Class26.method900
						(class656_sub1_sub3_sub1, true,
						 1612796310);
					}
				    }
				}
			    }
			}
			Class259.method4756((byte) -8);
			Class656_Sub1_Sub4_Sub1.method18732((byte) 0);
			Class77.method1564(-1178306130);
			Class231.method4391(false, -1825571166);
			Class184.method3614(Class501.aClass182_5564,
					    Class166.aClass180_1835, (byte) 0);
			client.anInt11173 += 948502557;
			if (0 != 224735789 * client.anInt11208) {
			    client.anInt11139 += 1295243580;
			    if (981721963 * client.anInt11139 >= 400)
				client.anInt11208 = 0;
			}
			if (Class609.aClass259_8008 != null) {
			    client.anInt11209 += 138110179;
			    if (-550698805 * client.anInt11209 >= 15) {
				Class649.method10708(Class609.aClass259_8008,
						     (byte) 0);
				Class609.aClass259_8008 = null;
			    }
			}
			client.aClass259_11275 = null;
			client.aBool11281 = false;
			client.aBool11324 = false;
			Class562.aClass259_7558 = null;
			Class577.method9575(null, -1, -1, 620324690);
			if (!client.aBool11358)
			    client.anInt11373 = -888222529;
			Class522.method8701(1749498351);
			client.anInt11162 += 592265053;
			if (client.aBool11098) {
			    Class525_Sub15 class525_sub15
				= Class16.method767(Class412.aClass412_4366,
						    (client.aClass96_11085
						     .aClass6_1169),
						    1977859884);
			    class525_sub15.aClass525_Sub38_Sub2_10546
				.method16605
				((1664523967 * Class291.anInt3221 << 28
				  | -360491259 * Class409.anInt4237 << 14
				  | 936959139 * Class274.anInt2861),
				 -1628499102);
			    client.aClass96_11085.method1794(class525_sub15,
							     (short) 2633);
			    client.aBool11098 = false;
			}
			for (;;) {
			    Class525_Sub32 class525_sub32
				= ((Class525_Sub32)
				   client.aClass709_11369
				       .method14423(-1684874393));
			    if (null == class525_sub32)
				break;
			    Class259 class259 = class525_sub32.aClass259_10736;
			    if (class259.anInt2576 * 1534974651 >= 0) {
				Class259 class259_13_
				    = Class43.method1069((-1549235523
							  * (class259
							     .anInt2606)),
							 -695254952);
				if (class259_13_ == null
				    || null == class259_13_.aClass259Array2655
				    || (1534974651 * class259.anInt2576
					>= (class259_13_
					    .aClass259Array2655).length)
				    || class259 != (class259_13_
						    .aClass259Array2655
						    [(1534974651
						      * class259.anInt2576)]))
				    continue;
			    }
			    Class241.method4435(class525_sub32, 856361507);
			}
			for (;;) {
			    Class525_Sub32 class525_sub32
				= ((Class525_Sub32)
				   client.aClass709_11323
				       .method14423(-1618877698));
			    if (null == class525_sub32)
				break;
			    Class259 class259 = class525_sub32.aClass259_10736;
			    if (1534974651 * class259.anInt2576 >= 0) {
				Class259 class259_14_
				    = Class43.method1069((class259.anInt2606
							  * -1549235523),
							 -695254952);
				if (null == class259_14_
				    || class259_14_.aClass259Array2655 == null
				    || (1534974651 * class259.anInt2576
					>= (class259_14_
					    .aClass259Array2655).length)
				    || class259 != (class259_14_
						    .aClass259Array2655
						    [(1534974651
						      * class259.anInt2576)]))
				    continue;
			    }
			    Class241.method4435(class525_sub32, 828703754);
			}
			for (;;) {
			    Class525_Sub32 class525_sub32
				= ((Class525_Sub32)
				   client.aClass709_11079
				       .method14423(-1416108646));
			    if (null == class525_sub32)
				break;
			    Class259 class259 = class525_sub32.aClass259_10736;
			    if (class259.anInt2576 * 1534974651 >= 0) {
				Class259 class259_15_
				    = Class43.method1069((class259.anInt2606
							  * -1549235523),
							 -695254952);
				if (null == class259_15_
				    || class259_15_.aClass259Array2655 == null
				    || (1534974651 * class259.anInt2576
					>= (class259_15_
					    .aClass259Array2655).length)
				    || ((class259_15_.aClass259Array2655
					 [class259.anInt2576 * 1534974651])
					!= class259))
				    continue;
			    }
			    Class241.method4435(class525_sub32, 435589066);
			}
			if (Class562.aClass259_7558 == null)
			    client.anInt11285 = 0;
			if (client.aClass259_11271 != null)
			    Class213.method3940(-1871231668);
			Class411.method6667(-958178363);
			if (619753713 * client.anInt11231 > 0
			    && Class198_Sub21.aClass551_10003
				   .method9149(82, 1218156407)
			    && Class198_Sub21.aClass551_10003
				   .method9149(81, 1551674922)
			    && client.anInt11100 * 542098735 != 0) {
			    int i_16_
				= ((Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
				    .aByte10867)
				   - 542098735 * client.anInt11100);
			    if (i_16_ < 0)
				i_16_ = 0;
			    else if (i_16_ > 3)
				i_16_ = 3;
			    Class600 class600 = client.aClass507_11137
						    .method8350(1662320889);
			    Class557.method9364
				(i_16_,
				 ((Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
				   .anIntArray12014[0])
				  + -1227002079 * class600.anInt7858),
				 (1429253007 * class600.anInt7860
				  + (Class581
				     .aClass656_Sub1_Sub3_Sub1_Sub1_7705
				     .anIntArray12017[0])),
				 -1549080590);
			}
			for (int i_17_ = 0; i_17_ < 5; i_17_++)
			    client.anIntArray11088[i_17_]++;
			if (Class309.aClass144_Sub1_3465.aBool9132
			    && ((Class309.aClass144_Sub1_3465.aLong9133
				 * 1195431761729797033L)
				< Class251.method4508((byte) 8) - 60000L))
			    Class276.method5113(808592004);
			Class309.aClass144_Sub1_3465.method14628(899897303);
			for (Class531_Sub1 class531_sub1
				 = ((Class531_Sub1)
				    client.aClass708_11394
					.method14328(1416260746));
			     null != class531_sub1;
			     class531_sub1 = ((Class531_Sub1)
					      client.aClass708_11394
						  .method14337(1037142902))) {
			    if ((long) (class531_sub1.anInt10313 * 1498915453)
				< Class251.method4508((byte) 8) / 1000L - 5L) {
				if (class531_sub1.aShort10312 > 0)
				    Class240.method4427
					(5, 0, "", "", "",
					 new StringBuilder().append
					     (class531_sub1.aString10311)
					     .append
					     (Class53.aClass53_505.method1169
					      (Class21.aClass666_213,
					       1552651121))
					     .toString(),
					 null, 944146144);
				if (0 == class531_sub1.aShort10312)
				    Class240.method4427
					(5, 0, "", "", "",
					 new StringBuilder().append
					     (class531_sub1.aString10311)
					     .append
					     (Class53.aClass53_446.method1169
					      (Class21.aClass666_213,
					       1552651121))
					     .toString(),
					 null, -1743501452);
				class531_sub1.method8794(-2097151274);
			    }
			}
			client.anInt11166 += -859915803;
			if (-27534355 * client.anInt11166 > 502) {
			    client.anInt11166 = 0;
			    int i_18_ = (int) (Math.random() * 8.0);
			    if ((i_18_ & 0x1) == 1)
				client.anInt11160
				    += client.anInt11161 * -1657286057;
			    if ((i_18_ & 0x2) == 2)
				client.anInt11094
				    += client.anInt11163 * 422993983;
			    if ((i_18_ & 0x4) == 4)
				client.anInt11164
				    += -1526581373 * client.anInt11165;
			}
			if (864319767 * client.anInt11160 < -54)
			    client.anInt11161 = 1106225250;
			if (client.anInt11160 * 864319767 > 56)
			    client.anInt11161 = -1106225250;
			if (1282768989 * client.anInt11094 < -55)
			    client.anInt11163 = 1592720790;
			if (1282768989 * client.anInt11094 > 59)
			    client.anInt11163 = -1592720790;
			if (client.anInt11164 * 1579923035 < -44)
			    client.anInt11165 = -2016640143;
			if (client.anInt11164 * 1579923035 > 40)
			    client.anInt11165 = 2016640143;
			client.anInt11347 += 1307759535;
			if (1108108111 * client.anInt11347 > 506) {
			    client.anInt11347 = 0;
			    int i_19_ = (int) (Math.random() * 8.0);
			    if ((i_19_ & 0x1) == 1)
				client.anInt11059
				    += -251882435 * client.anInt11168;
			    if ((i_19_ & 0x2) == 2)
				client.anInt11169
				    += client.anInt11170 * -429948433;
			}
			if (client.anInt11059 * 223546583 < -62)
			    client.anInt11168 = 4951014;
			if (223546583 * client.anInt11059 > 69)
			    client.anInt11168 = -4951014;
			if (-198324601 * client.anInt11169 < -22)
			    client.anInt11170 = -121510087;
			if (client.anInt11169 * -198324601 > 11)
			    client.anInt11170 = 121510087;
			client.aClass96_11085.anInt1182 += -1049943141;
			if (client.aClass96_11085.anInt1182 * -303330669
			    > 50) {
			    Class525_Sub15 class525_sub15
				= Class16.method767(Class412.aClass412_4351,
						    (client.aClass96_11085
						     .aClass6_1169),
						    1977859884);
			    client.aClass96_11085.method1794(class525_sub15,
							     (short) 6518);
			}
			if (client.aBool11135) {
			    Class448.method7325(872676591);
			    client.aBool11135 = false;
			}
			try {
			    client.aClass96_11085.method1792(1859992163);
			} catch (IOException ioexception) {
			    Class196.method3742((byte) -77);
			}
		    }
		}
	    }
	}
    }
    
    public static int method6744(byte i) {
	Class320.aTwitchEventLiveStreams3534 = null;
	int i_20_
	    = Class285.aTwitchTV3143
		  .RequestLiveStreams(client.aClass668_11090.aString8583);
	return i_20_;
    }
}
