/* Class113 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.IOException;
import java.net.URL;

public class Class113
{
    URL anURL1387;
    volatile boolean aBool1388;
    volatile byte[] aByteArray1389;
    public static JS5 aClass458_1390;
    public static int anInt1391;
    
    byte[] method2001(int i) {
	return aByteArray1389;
    }
    
    boolean method2002(byte i) {
	return aBool1388;
    }
    
    Class113(URL url) {
	anURL1387 = url;
    }
    
    boolean method2003() {
	return aBool1388;
    }
    
    boolean method2004() {
	return aBool1388;
    }
    
    boolean method2005() {
	return aBool1388;
    }
    
    byte[] method2006() {
	return aByteArray1389;
    }
    
    byte[] method2007() {
	return aByteArray1389;
    }
    
    byte[] method2008() {
	return aByteArray1389;
    }
    
    static void method2009(int i) {
	if (Class525_Sub7_Sub11.aFileOutputStream11721 != null) {
	    try {
		Class525_Sub7_Sub11.aFileOutputStream11721.close();
	    } catch (IOException ioexception) {
		/* empty */
	    }
	}
	Class525_Sub7_Sub11.aFileOutputStream11721 = null;
    }
    
    static boolean method2010(int i, byte i_0_) {
	return (44 == i || i == 45 || 46 == i || 47 == i || i == 48 || 49 == i
		|| i == 50 || i == 51 || i == 52 || i == 53 || i == 15);
    }
    
    static void method2011(Class525_Sub16_Sub16 class525_sub16_sub16, int i,
			   int i_1_, boolean bool, int i_2_) {
	if (class525_sub16_sub16 != null
	    && class525_sub16_sub16 != Class61.aClass709_660.aClass525_8821) {
	    int i_3_ = -232273081 * class525_sub16_sub16.anInt11862;
	    int i_4_ = class525_sub16_sub16.anInt11863 * -691010033;
	    int i_5_ = 91103913 * class525_sub16_sub16.anInt11861;
	    int i_6_ = (int) (class525_sub16_sub16.aLong11860
			      * -6417801577210029731L);
	    long l = class525_sub16_sub16.aLong11860 * -6417801577210029731L;
	    if (i_5_ >= 2000)
		i_5_ -= 2000;
	    Class600 class600 = client.aClass507_11137.method8350(-709184927);
	    if (i_5_ == 1008 || 1009 == i_5_ || 1010 == i_5_ || i_5_ == 1011
		|| i_5_ == 1012)
		Class262.method4782(i_5_, i_6_, i_3_, (byte) -1);
	    if (i_5_ == 58) {
		Class259 class259
		    = Class147.method2388(i_4_, i_3_, -591235649);
		if (class259 != null)
		    Class657.method10863(class259, 1132526850);
	    }
	    if (i_5_ == 23) {
		if (client.anInt11231 * 619753713 > 0
		    && Class640.method10572((byte) 12))
		    Class557.method9364((Class581
					 .aClass656_Sub1_Sub3_Sub1_Sub1_7705
					 .aByte10867),
					(class600.anInt7858 * -1227002079
					 + i_3_),
					i_4_ + class600.anInt7860 * 1429253007,
					-1798081101);
		else {
		    Class525_Sub15 class525_sub15
			= Class380.method6394(i_3_, i_4_, i_6_, -92081538);
		    if (i_6_ == 1) {
			class525_sub15.aClass525_Sub38_Sub2_10546
			    .method16735(-1, -1784693292);
			class525_sub15.aClass525_Sub38_Sub2_10546
			    .method16735(-1, -2125992555);
			class525_sub15.aClass525_Sub38_Sub2_10546
			    .method16602((int) client.aFloat11052, 838872865);
			class525_sub15.aClass525_Sub38_Sub2_10546
			    .method16735(57, -1551865088);
			class525_sub15.aClass525_Sub38_Sub2_10546.method16735
			    (223546583 * client.anInt11059, -1993913529);
			class525_sub15.aClass525_Sub38_Sub2_10546.method16735
			    (-198324601 * client.anInt11169, -210981055);
			class525_sub15.aClass525_Sub38_Sub2_10546
			    .method16735(89, -1845154859);
			Class446 class446
			    = (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
				   .method10818
			       ().aClass446_4807);
			class525_sub15.aClass525_Sub38_Sub2_10546.method16602
			    ((int) class446.aFloat4895, 1046686196);
			class525_sub15.aClass525_Sub38_Sub2_10546.method16602
			    ((int) class446.aFloat4897, 1318080215);
			class525_sub15.aClass525_Sub38_Sub2_10546
			    .method16735(63, -1521947959);
		    } else {
			client.anInt11205 = i * -1929236215;
			client.anInt11099 = -1724369371 * i_1_;
			client.anInt11208 = 847244709;
			client.anInt11139 = 0;
		    }
		    client.aClass96_11085.method1794(class525_sub15,
						     (short) 2631);
		    Class301.method5404(i_3_, i_4_, -1675499849);
		}
	    }
	    Class412 class412 = null;
	    if (i_5_ == 3)
		class412 = Class412.aClass412_4346;
	    else if (4 == i_5_)
		class412 = Class412.aClass412_4257;
	    else if (5 == i_5_)
		class412 = Class412.aClass412_4362;
	    else if (6 == i_5_)
		class412 = Class412.aClass412_4298;
	    else if (1001 == i_5_)
		class412 = Class412.aClass412_4353;
	    else if (1002 == i_5_)
		class412 = Class412.aClass412_4342;
	    if (class412 != null) {
		client.anInt11205 = i * -1929236215;
		client.anInt11099 = -1724369371 * i_1_;
		client.anInt11208 = 1694489418;
		client.anInt11139 = 0;
		Class525_Sub15 class525_sub15
		    = Class16.method767(class412,
					client.aClass96_11085.aClass6_1169,
					1977859884);
		class525_sub15.aClass525_Sub38_Sub2_10546.method16602
		    (i_4_ + 1429253007 * class600.anInt7860, 1907593079);
		class525_sub15.aClass525_Sub38_Sub2_10546.method16735
		    (Class181.method3127(-524508657) ? 1 : 0, -2141568652);
		class525_sub15.aClass525_Sub38_Sub2_10546.method16602
		    (-1227002079 * class600.anInt7858 + i_3_, 666062241);
		class525_sub15.aClass525_Sub38_Sub2_10546
		    .method16674((int) (l >>> 32) & 0x7fffffff, (byte) 0);
		client.aClass96_11085.method1794(class525_sub15,
						 (short) 16685);
		Class301.method5404(i_3_, i_4_, -1106292973);
	    }
	    Class412 class412_7_ = null;
	    if (i_5_ == 44)
		class412_7_ = Class412.aClass412_4295;
	    else if (i_5_ == 45)
		class412_7_ = Class412.aClass412_4313;
	    else if (46 == i_5_)
		class412_7_ = Class412.aClass412_4304;
	    else if (i_5_ == 47)
		class412_7_ = Class412.aClass412_4316;
	    else if (i_5_ == 48)
		class412_7_ = Class412.aClass412_4306;
	    else if (49 == i_5_)
		class412_7_ = Class412.aClass412_4350;
	    else if (50 == i_5_)
		class412_7_ = Class412.aClass412_4337;
	    else if (i_5_ == 51)
		class412_7_ = Class412.aClass412_4314;
	    else if (i_5_ == 52)
		class412_7_ = Class412.aClass412_4273;
	    else if (53 == i_5_)
		class412_7_ = Class412.aClass412_4260;
	    if (class412_7_ != null) {
		Class656_Sub1_Sub3_Sub1_Sub1 class656_sub1_sub3_sub1_sub1
		    = client.aClass656_Sub1_Sub3_Sub1_Sub1Array11384[i_6_];
		if (null != class656_sub1_sub3_sub1_sub1) {
		    client.anInt11205 = i * -1929236215;
		    client.anInt11099 = i_1_ * -1724369371;
		    client.anInt11208 = 1694489418;
		    client.anInt11139 = 0;
		    Class525_Sub15 class525_sub15
			= Class16.method767(class412_7_,
					    client.aClass96_11085.aClass6_1169,
					    1977859884);
		    class525_sub15.aClass525_Sub38_Sub2_10546.method16656
			(Class181.method3127(1719901577) ? 1 : 0, -379514171);
		    class525_sub15.aClass525_Sub38_Sub2_10546
			.method16602(i_6_, 1033806298);
		    client.aClass96_11085.method1794(class525_sub15,
						     (short) 11599);
		    Class301.method5404((class656_sub1_sub3_sub1_sub1
					 .anIntArray12014[0]),
					(class656_sub1_sub3_sub1_sub1
					 .anIntArray12017[0]),
					-1196791436);
		}
	    }
	    if (i_5_ == 2) {
		client.anInt11205 = -1929236215 * i;
		client.anInt11099 = i_1_ * -1724369371;
		client.anInt11208 = 1694489418;
		client.anInt11139 = 0;
		Class525_Sub15 class525_sub15
		    = Class16.method767(Class412.aClass412_4331,
					client.aClass96_11085.aClass6_1169,
					1977859884);
		class525_sub15.aClass525_Sub38_Sub2_10546.method16696
		    (Class181.method3127(-1629352288) ? 1 : 0, (short) -7111);
		class525_sub15.aClass525_Sub38_Sub2_10546
		    .method16675(1477024315 * Class462.anInt5096, (byte) -32);
		class525_sub15.aClass525_Sub38_Sub2_10546.method16666
		    (-1227002079 * class600.anInt7858 + i_3_, -870766193);
		class525_sub15.aClass525_Sub38_Sub2_10546
		    .method16676((int) (l >>> 32) & 0x7fffffff, -1133521593);
		class525_sub15.aClass525_Sub38_Sub2_10546
		    .method16665(-974815545 * client.anInt11256, (short) 1274);
		class525_sub15.aClass525_Sub38_Sub2_10546
		    .method16664(441068731 * client.anInt11298, 222843971);
		class525_sub15.aClass525_Sub38_Sub2_10546.method16666
		    (i_4_ + class600.anInt7860 * 1429253007, 64792879);
		client.aClass96_11085.method1794(class525_sub15,
						 (short) 18771);
		Class301.method5404(i_3_, i_4_, -1356153848);
	    }
	    if (i_5_ == 8) {
		Class525_Sub19 class525_sub19
		    = ((Class525_Sub19)
		       client.aClass10_11121.method684((long) i_6_));
		if (class525_sub19 != null) {
		    Class656_Sub1_Sub3_Sub1_Sub2 class656_sub1_sub3_sub1_sub2
			= ((Class656_Sub1_Sub3_Sub1_Sub2)
			   class525_sub19.anObject10571);
		    client.anInt11205 = -1929236215 * i;
		    client.anInt11099 = -1724369371 * i_1_;
		    client.anInt11208 = 1694489418;
		    client.anInt11139 = 0;
		    Class525_Sub15 class525_sub15
			= Class16.method767(Class412.aClass412_4368,
					    client.aClass96_11085.aClass6_1169,
					    1977859884);
		    class525_sub15.aClass525_Sub38_Sub2_10546.method16674
			(1477024315 * Class462.anInt5096, (byte) 0);
		    class525_sub15.aClass525_Sub38_Sub2_10546.method16656
			(Class181.method3127(-1412439735) ? 1 : 0,
			 -1120926047);
		    class525_sub15.aClass525_Sub38_Sub2_10546
			.method16666(client.anInt11298 * 441068731, 792755862);
		    class525_sub15.aClass525_Sub38_Sub2_10546
			.method16665(i_6_, (short) 1274);
		    class525_sub15.aClass525_Sub38_Sub2_10546.method16664
			(client.anInt11256 * -974815545, -1425294101);
		    client.aClass96_11085.method1794(class525_sub15,
						     (short) 24734);
		    Class301.method5404((class656_sub1_sub3_sub1_sub2
					 .anIntArray12014[0]),
					(class656_sub1_sub3_sub1_sub2
					 .anIntArray12017[0]),
					-2064761617);
		}
	    }
	    if (17 == i_5_) {
		client.anInt11205 = -1929236215 * i;
		client.anInt11099 = -1724369371 * i_1_;
		client.anInt11208 = 1694489418;
		client.anInt11139 = 0;
		Class525_Sub15 class525_sub15
		    = Class16.method767(Class412.aClass412_4309,
					client.aClass96_11085.aClass6_1169,
					1977859884);
		class525_sub15.aClass525_Sub38_Sub2_10546.method16664
		    (i_3_ + class600.anInt7858 * -1227002079, -712547190);
		class525_sub15.aClass525_Sub38_Sub2_10546
		    .method16665(i_6_, (short) 1274);
		class525_sub15.aClass525_Sub38_Sub2_10546.method16656
		    (Class181.method3127(781652287) ? 1 : 0, -241245761);
		class525_sub15.aClass525_Sub38_Sub2_10546
		    .method16665(client.anInt11298 * 441068731, (short) 1274);
		class525_sub15.aClass525_Sub38_Sub2_10546
		    .method16675(1477024315 * Class462.anInt5096, (byte) -107);
		class525_sub15.aClass525_Sub38_Sub2_10546.method16666
		    (i_4_ + 1429253007 * class600.anInt7860, -1673884472);
		class525_sub15.aClass525_Sub38_Sub2_10546
		    .method16665(client.anInt11256 * -974815545, (short) 1274);
		client.aClass96_11085.method1794(class525_sub15,
						 (short) 29198);
		Class301.method5404(i_3_, i_4_, -1920252373);
	    }
	    Class412 class412_8_ = null;
	    if (18 == i_5_)
		class412_8_ = Class412.aClass412_4279;
	    else if (19 == i_5_)
		class412_8_ = Class412.aClass412_4293;
	    else if (i_5_ == 20)
		class412_8_ = Class412.aClass412_4328;
	    else if (21 == i_5_)
		class412_8_ = Class412.aClass412_4332;
	    else if (22 == i_5_)
		class412_8_ = Class412.aClass412_4264;
	    else if (i_5_ == 1004)
		class412_8_ = Class412.aClass412_4285;
	    if (null != class412_8_) {
		client.anInt11205 = i * -1929236215;
		client.anInt11099 = -1724369371 * i_1_;
		client.anInt11208 = 1694489418;
		client.anInt11139 = 0;
		Class525_Sub15 class525_sub15
		    = Class16.method767(class412_8_,
					client.aClass96_11085.aClass6_1169,
					1977859884);
		class525_sub15.aClass525_Sub38_Sub2_10546.method16657
		    ((bool ? 2 : 0) | (Class181.method3127(-1435415533) ? 1
				       : 0),
		     -1871460579);
		class525_sub15.aClass525_Sub38_Sub2_10546.method16602
		    (1429253007 * class600.anInt7860 + i_4_, 600622431);
		class525_sub15.aClass525_Sub38_Sub2_10546.method16602
		    (i_3_ + -1227002079 * class600.anInt7858, 1850416327);
		class525_sub15.aClass525_Sub38_Sub2_10546
		    .method16602(i_6_, 1456602968);
		client.aClass96_11085.method1794(class525_sub15,
						 (short) 11620);
		Class301.method5404(i_3_, i_4_, -1147977222);
	    }
	    if (i_5_ == 25) {
		Class259 class259
		    = Class147.method2388(i_4_, i_3_, -591235649);
		if (null != class259) {
		    Class382.method6429(1771493886);
		    Class525_Sub8 class525_sub8 = client.method17531(class259);
		    Class328.method5796(class259,
					class525_sub8.method16132(631931457),
					-997142025 * class525_sub8.anInt10489,
					(short) 6144);
		    client.aString11258
			= Class689.method14095(class259, (short) 833);
		    if (client.aString11258 == null)
			client.aString11258 = "Null";
		    client.aString11117
			= new StringBuilder().append(class259.aString2763)
			      .append
			      (Class493.method8001(16777215, 2075134935))
			      .toString();
		}
	    } else {
		if (i_5_ == 60) {
		    if (619753713 * client.anInt11231 > 0
			&& Class640.method10572((byte) 124))
			Class557.method9364
			    ((Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
			      .aByte10867),
			     i_3_ + -1227002079 * class600.anInt7858,
			     i_4_ + class600.anInt7860 * 1429253007,
			     -1385194137);
		    else {
			client.anInt11205 = i * -1929236215;
			client.anInt11099 = i_1_ * -1724369371;
			client.anInt11208 = 847244709;
			client.anInt11139 = 0;
			Class525_Sub15 class525_sub15
			    = Class16.method767(Class412.aClass412_4369,
						(client.aClass96_11085
						 .aClass6_1169),
						1977859884);
			class525_sub15.aClass525_Sub38_Sub2_10546.method16665
			    (class600.anInt7858 * -1227002079 + i_3_,
			     (short) 1274);
			class525_sub15.aClass525_Sub38_Sub2_10546.method16666
			    (i_4_ + 1429253007 * class600.anInt7860,
			     -1259223982);
			client.aClass96_11085.method1794(class525_sub15,
							 (short) 3755);
		    }
		}
		if (i_5_ == 15) {
		    Class656_Sub1_Sub3_Sub1_Sub1 class656_sub1_sub3_sub1_sub1
			= client.aClass656_Sub1_Sub3_Sub1_Sub1Array11384[i_6_];
		    if (null != class656_sub1_sub3_sub1_sub1) {
			client.anInt11205 = i * -1929236215;
			client.anInt11099 = i_1_ * -1724369371;
			client.anInt11208 = 1694489418;
			client.anInt11139 = 0;
			Class525_Sub15 class525_sub15
			    = Class16.method767(Class412.aClass412_4325,
						(client.aClass96_11085
						 .aClass6_1169),
						1977859884);
			class525_sub15.aClass525_Sub38_Sub2_10546.method16666
			    (client.anInt11256 * -974815545, 1722881284);
			class525_sub15.aClass525_Sub38_Sub2_10546
			    .method16665(i_6_, (short) 1274);
			class525_sub15.aClass525_Sub38_Sub2_10546.method16696
			    (Class181.method3127(-539354977) ? 1 : 0,
			     (short) 11519);
			class525_sub15.aClass525_Sub38_Sub2_10546.method16674
			    (1477024315 * Class462.anInt5096, (byte) 0);
			class525_sub15.aClass525_Sub38_Sub2_10546.method16666
			    (client.anInt11298 * 441068731, 942524321);
			client.aClass96_11085.method1794(class525_sub15,
							 (short) 13073);
			Class301.method5404((class656_sub1_sub3_sub1_sub1
					     .anIntArray12014[0]),
					    (class656_sub1_sub3_sub1_sub1
					     .anIntArray12017[0]),
					    -2037920505);
		    }
		}
		Class412 class412_9_ = null;
		if (i_5_ == 9)
		    class412_9_ = Class412.aClass412_4324;
		else if (10 == i_5_)
		    class412_9_ = Class412.aClass412_4276;
		else if (i_5_ == 11)
		    class412_9_ = Class412.aClass412_4320;
		else if (12 == i_5_)
		    class412_9_ = Class412.aClass412_4355;
		else if (i_5_ == 13)
		    class412_9_ = Class412.aClass412_4380;
		else if (i_5_ == 1003)
		    class412_9_ = Class412.aClass412_4259;
		if (class412_9_ != null) {
		    Class525_Sub19 class525_sub19
			= ((Class525_Sub19)
			   client.aClass10_11121.method684((long) i_6_));
		    if (class525_sub19 != null) {
			Class656_Sub1_Sub3_Sub1_Sub2 class656_sub1_sub3_sub1_sub2
			    = ((Class656_Sub1_Sub3_Sub1_Sub2)
			       class525_sub19.anObject10571);
			client.anInt11205 = -1929236215 * i;
			client.anInt11099 = i_1_ * -1724369371;
			client.anInt11208 = 1694489418;
			client.anInt11139 = 0;
			Class525_Sub15 class525_sub15
			    = Class16.method767(class412_9_,
						(client.aClass96_11085
						 .aClass6_1169),
						1977859884);
			class525_sub15.aClass525_Sub38_Sub2_10546
			    .method16666(i_6_, 378733209);
			class525_sub15.aClass525_Sub38_Sub2_10546.method16735
			    (Class181.method3127(-1104899257) ? 1 : 0,
			     -395340069);
			client.aClass96_11085.method1794(class525_sub15,
							 (short) 11331);
			Class301.method5404((class656_sub1_sub3_sub1_sub2
					     .anIntArray12014[0]),
					    (class656_sub1_sub3_sub1_sub2
					     .anIntArray12017[0]),
					    -940172946);
		    }
		}
		if (i_5_ == 30 && client.aClass259_11263 == null) {
		    Class308_Sub1.method15762(i_4_, i_3_, (byte) -116);
		    client.aClass259_11263
			= Class147.method2388(i_4_, i_3_, -591235649);
		    if (client.aClass259_11263 != null)
			Class649.method10708(client.aClass259_11263, (byte) 0);
		}
		if (i_5_ == 16) {
		    client.anInt11205 = -1929236215 * i;
		    client.anInt11099 = -1724369371 * i_1_;
		    client.anInt11208 = 1694489418;
		    client.anInt11139 = 0;
		    Class525_Sub15 class525_sub15
			= Class16.method767(Class412.aClass412_4325,
					    client.aClass96_11085.aClass6_1169,
					    1977859884);
		    class525_sub15.aClass525_Sub38_Sub2_10546
			.method16666(-974815545 * client.anInt11256, 77251080);
		    class525_sub15.aClass525_Sub38_Sub2_10546.method16665
			(2032864281 * (Class581
				       .aClass656_Sub1_Sub3_Sub1_Sub1_7705
				       .anInt11964),
			 (short) 1274);
		    class525_sub15.aClass525_Sub38_Sub2_10546.method16696
			(Class181.method3127(1112713399) ? 1 : 0,
			 (short) -1172);
		    class525_sub15.aClass525_Sub38_Sub2_10546.method16674
			(Class462.anInt5096 * 1477024315, (byte) 0);
		    class525_sub15.aClass525_Sub38_Sub2_10546.method16666
			(441068731 * client.anInt11298, -886368274);
		    client.aClass96_11085.method1794(class525_sub15,
						     (short) 4944);
		}
		if (57 == i_5_ || i_5_ == 1007)
		    Class584.method9644(i_6_, i_4_, i_3_,
					class525_sub16_sub16.aString11868,
					83647200);
		if (59 == i_5_) {
		    client.anInt11205 = -1929236215 * i;
		    client.anInt11099 = i_1_ * -1724369371;
		    client.anInt11208 = 847244709;
		    client.anInt11139 = 0;
		    Class525_Sub15 class525_sub15
			= Class16.method767(Class412.aClass412_4377,
					    client.aClass96_11085.aClass6_1169,
					    1977859884);
		    class525_sub15.aClass525_Sub38_Sub2_10546.method16665
			(i_3_ + -1227002079 * class600.anInt7858,
			 (short) 1274);
		    class525_sub15.aClass525_Sub38_Sub2_10546.method16665
			(i_4_ + class600.anInt7860 * 1429253007, (short) 1274);
		    class525_sub15.aClass525_Sub38_Sub2_10546.method16665
			(441068731 * client.anInt11298, (short) 1274);
		    class525_sub15.aClass525_Sub38_Sub2_10546.method16665
			(client.anInt11256 * -974815545, (short) 1274);
		    class525_sub15.aClass525_Sub38_Sub2_10546.method16605
			(1477024315 * Class462.anInt5096, -264673013);
		    client.aClass96_11085.method1794(class525_sub15,
						     (short) 29016);
		    Class301.method5404(i_3_, i_4_, -1584762741);
		}
		if (client.aBool11358)
		    Class382.method6429(1771493886);
		if (Class609.aClass259_8008 != null
		    && 0 == client.anInt11209 * -550698805)
		    Class649.method10708(Class609.aClass259_8008, (byte) 0);
	    }
	}
    }
    
    static final void method2012(Class683 class683, int i) {
	class683.anInt8644 -= -1723845246;
	String string
	    = ((String)
	       class683.anObjectArray8636[class683.anInt8644 * 1373599041]);
	String string_10_ = (String) (class683.anObjectArray8636
				      [1373599041 * class683.anInt8644 + 1]);
	int i_11_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = string.indexOf(string_10_, i_11_);
    }
    
    static final void method2013(int i) {
	Class317_Sub1.aClass259Array10104 = null;
	Class636.method10474(-750203937 * client.anInt11260, 0, 0,
			     Class434.anInt4827 * -1445589163,
			     Class696_Sub47.anInt11032 * -1883654023, 0, 0, -1,
			     615169755);
	if (null != Class317_Sub1.aClass259Array10104) {
	    Class184.method3613(Class317_Sub1.aClass259Array10104, -1412584499,
				0, 0, -1445589163 * Class434.anInt4827,
				Class696_Sub47.anInt11032 * -1883654023,
				Class390_Sub2.anInt10228 * 847934687,
				-1567886685 * Class320.anInt3533,
				((client.aClass259_11272
				  == Class25.aClass259_245)
				 ? -1
				 : (-583674725
				    * client.aClass259_11272.anInt2765)),
				true, 1869886959);
	    Class317_Sub1.aClass259Array10104 = null;
	}
    }
    
    static final void method2014(Class683 class683, byte i) {
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub4_10728,
	     (class683.anIntArray8661
	      [(class683.anInt8662 -= 1552651121) * 501271953]) == 1 ? 1 : 0,
	     (byte) -125);
	Class650.method10715(-1758466106);
	Class424.method6769(-1852050786);
	Class559.method9402(1739904449);
	client.aBool11084 = false;
    }
    
    static final void method2015(Class683 class683, int i) {
	int i_12_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_12_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_12_ >> 16];
	Class493.method8000(class259, class245, class683, -280552415);
    }
    
    static RSBuffer method2016(int i) {
	RSBuffer class525_sub38 = new RSBuffer(518);
	Class40_Sub14.anIntArray11046 = new int[4];
	Class40_Sub14.anIntArray11046[0] = (int) (Math.random() * 9.9999999E7);
	Class40_Sub14.anIntArray11046[1] = (int) (Math.random() * 9.9999999E7);
	Class40_Sub14.anIntArray11046[2]
	    = (int) (Class70.aLong743 * -6553867095034074165L >> 32);
	Class40_Sub14.anIntArray11046[3]
	    = (int) (-6553867095034074165L * Class70.aLong743
		     & 0xffffffffffffffffL);
	class525_sub38.method16735(10, -1232194058);
	class525_sub38.method16605(Class40_Sub14.anIntArray11046[0],
				   -368532177);
	class525_sub38.method16605(Class40_Sub14.anIntArray11046[1],
				   -973831790);
	class525_sub38.method16605(Class40_Sub14.anIntArray11046[2],
				   -1928558374);
	class525_sub38.method16605(Class40_Sub14.anIntArray11046[3],
				   -1086544244);
	return class525_sub38;
    }
}
