/* Class328 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import com.jagex.twitchtv.TwitchEventResult;

public class Class328
{
    static boolean aBool3576;
    static JS5 aClass458_3577;
    static Class303[] aClass303Array3578;
    static Class91 aClass91_3579;
    static int anInt3580 = 2105692701;
    static Thread aThread3581;
    static long aLong3582;
    static Class303 aClass303_3583;
    static final String aString3584 = " - ";
    static Interface32[] anInterface32Array3585;
    static int anInt3586;
    
    static void method5770() {
	Class42 class42
	    = Class182.method3594("2", client.aClass668_11090.aString8579,
				  false, -1175326764);
	Class309.aClass144_Sub1_3465.method14627(class42, (byte) -4);
    }
    
    static {
	aBool3576 = false;
	anInt3586 = -509070375;
    }
    
    public static void method5771() {
	aBool3576 = true;
	Class108.aString1309 = Class70.aString777;
	Class525_Sub21.aString10584 = Class70.aString789;
	Class156.method2465(false, 377054942);
	Class392.method6481(-2082361499);
	aClass303Array3578 = null;
	Class442.aClass459_4866 = null;
	Class441.method7119(10, -261677915);
    }
    
    public static void method5772() {
	aBool3576 = true;
	Class108.aString1309 = Class70.aString777;
	Class525_Sub21.aString10584 = Class70.aString789;
	Class156.method2465(false, -1998098602);
	Class392.method6481(-1519565886);
	aClass303Array3578 = null;
	Class442.aClass459_4866 = null;
	Class441.method7119(10, -602017636);
    }
    
    public static void method5773() {
	aBool3576 = true;
	Class108.aString1309 = Class70.aString777;
	Class525_Sub21.aString10584 = Class70.aString789;
	Class156.method2465(false, 895482081);
	Class392.method6481(-1700386884);
	aClass303Array3578 = null;
	Class442.aClass459_4866 = null;
	Class441.method7119(10, 989933966);
    }
    
    public static void method5774() {
	if (aClass303Array3578 == null) {
	    aClass303Array3578 = Class303.method5412(-2028893513);
	    aClass303_3583 = aClass303Array3578[0];
	    aLong3582 = Class251.method4508((byte) 8) * -1072739247410761927L;
	}
	if (Class159.aClass295_1755 == null)
	    Class97.method1821(-582357193);
	Class303 class303 = aClass303_3583;
	int i = SunDefinition.method5447((byte) -95);
	if (class303 == aClass303_3583) {
	    Class220.aString2331
		= aClass303_3583.aClass53_3391
		      .method1169(Class21.aClass666_213, 1552651121);
	    Class198_Sub19.aString9992 = Class220.aString2331;
	    if (aClass303_3583.aBool3405)
		Class168_Sub2.anInt9885
		    = ((aClass303_3583.anInt3403 * 1113563215
			- 1474421939 * aClass303_3583.anInt3385) * i / 100
		       + 1474421939 * aClass303_3583.anInt3385) * -1040104935;
	    if (aClass303_3583.aBool3404)
		Class198_Sub19.aString9992
		    = new StringBuilder().append
			  (Class198_Sub19.aString9992).append
			  (" - ").append
			  (893450793 * Class168_Sub2.anInt9885).append
			  ("%").toString();
	} else if (aClass303_3583 == Class303.aClass303_3388) {
	    Class159.aClass295_1755 = null;
	    Class441.method7119(1, -2041002744);
	    if (aBool3576) {
		aBool3576 = false;
		Class350.method6154(Class108.aString1309,
				    Class525_Sub21.aString10584, "", false,
				    (byte) 0);
	    }
	} else {
	    Class220.aString2331
		= class303.aClass53_3401.method1169(Class21.aClass666_213,
						    1552651121);
	    Class198_Sub19.aString9992 = Class220.aString2331;
	    if (aClass303_3583.aBool3404)
		Class198_Sub19.aString9992
		    = new StringBuilder().append
			  (Class198_Sub19.aString9992).append
			  (" - ").append
			  (class303.anInt3403 * 1113563215).append
			  ("%").toString();
	    Class168_Sub2.anInt9885 = -1594227273 * class303.anInt3403;
	    if (aClass303_3583.aBool3405 || class303.aBool3405)
		aLong3582
		    = Class251.method4508((byte) 8) * -1072739247410761927L;
	}
	if (Class159.aClass295_1755 != null) {
	    Class159.aClass295_1755.method5341((-4466893964599619831L
						* aLong3582),
					       Class220.aString2331,
					       Class198_Sub19.aString9992,
					       (893450793
						* Class168_Sub2.anInt9885),
					       aClass303_3583, -80136654);
	    if (null != anInterface32Array3585) {
		for (int i_0_ = 720830411 * anInt3580 + 1;
		     i_0_ < anInterface32Array3585.length; i_0_++) {
		    if ((anInterface32Array3585[i_0_].method202(-1318175184)
			 >= 100)
			&& i_0_ - 1 == anInt3580 * 720830411
			&& 10 != 1777895575 * client.anInt11075
			&& Class159.aClass295_1755.method5318((byte) 9)) {
			try {
			    anInterface32Array3585[i_0_].method19(802909552);
			} catch (Exception exception) {
			    anInterface32Array3585 = null;
			    break;
			}
			Class159.aClass295_1755.method5319
			    (anInterface32Array3585[i_0_], -979524524);
			anInt3580 += -2105692701;
			if ((720830411 * anInt3580
			     >= anInterface32Array3585.length - 1)
			    && anInterface32Array3585.length > 1)
			    anInt3580 = (aClass91_3579.method1695(-527910033)
					 ? 0 : -1) * -2105692701;
		    }
		}
	    }
	}
    }
    
    public static boolean method5775() {
	return aBool3576;
    }
    
    static void method5776(byte[] is) {
	RSBuffer class525_sub38 = new RSBuffer(is);
	for (;;) {
	    int i = class525_sub38.readUnsignedByte(589379765);
	    if (i == 0)
		break;
	    if (1 == i) {
		int i_1_ = class525_sub38.readUnsignedShort((byte) 117);
		Class40_Sub20.aClass217_11050.method4050(i_1_, 1545685408);
	    }
	}
    }
    
    static void method5777() {
	if (null != aClass303_3583) {
	    Class159.aClass295_1755 = new Class295();
	    Class159.aClass295_1755.method5341
		(-4466893964599619831L * aLong3582,
		 aClass303_3583.aClass53_3391.method1169(Class21.aClass666_213,
							 1552651121),
		 aClass303_3583.aClass53_3391.method1169(Class21.aClass666_213,
							 1552651121),
		 aClass303_3583.anInt3385 * 1474421939, aClass303_3583,
		 -80136654);
	    aThread3581 = new Thread(Class159.aClass295_1755, "");
	    aThread3581.start();
	}
    }
    
    static void method5778() {
	if (null != aClass303_3583) {
	    Class159.aClass295_1755 = new Class295();
	    Class159.aClass295_1755.method5341
		(-4466893964599619831L * aLong3582,
		 aClass303_3583.aClass53_3391.method1169(Class21.aClass666_213,
							 1552651121),
		 aClass303_3583.aClass53_3391.method1169(Class21.aClass666_213,
							 1552651121),
		 aClass303_3583.anInt3385 * 1474421939, aClass303_3583,
		 -80136654);
	    aThread3581 = new Thread(Class159.aClass295_1755, "");
	    aThread3581.start();
	}
    }
    
    static void method5779() {
	if (null != aClass303_3583) {
	    Class159.aClass295_1755 = new Class295();
	    Class159.aClass295_1755.method5341
		(-4466893964599619831L * aLong3582,
		 aClass303_3583.aClass53_3391.method1169(Class21.aClass666_213,
							 1552651121),
		 aClass303_3583.aClass53_3391.method1169(Class21.aClass666_213,
							 1552651121),
		 aClass303_3583.anInt3385 * 1474421939, aClass303_3583,
		 -80136654);
	    aThread3581 = new Thread(Class159.aClass295_1755, "");
	    aThread3581.start();
	}
    }
    
    static void method5780() {
	Class42 class42
	    = Class182.method3594("2", client.aClass668_11090.aString8579,
				  false, 1729583016);
	Class309.aClass144_Sub1_3465.method14627(class42, (byte) -18);
    }
    
    public static void method5781(boolean bool) {
	if (null == Class159.aClass295_1755)
	    Class97.method1821(-582357193);
	if (bool)
	    Class159.aClass295_1755.method5317(1695898547);
    }
    
    public static void method5782() {
	if (anInterface32Array3585 != null) {
	    Interface32[] interface32s = anInterface32Array3585;
	    for (int i = 0; i < interface32s.length; i++) {
		Interface32 interface32 = interface32s[i];
		interface32.method19(1360809268);
	    }
	}
    }
    
    public static void method5783() {
	if (anInterface32Array3585 != null) {
	    Interface32[] interface32s = anInterface32Array3585;
	    for (int i = 0; i < interface32s.length; i++) {
		Interface32 interface32 = interface32s[i];
		interface32.method19(-1329074517);
	    }
	}
    }
    
    public static boolean method5784() {
	return aBool3576;
    }
    
    static int method5785() {
	int i = aClass303_3583.anInt3399 * -631431271;
	if (i < aClass303Array3578.length - 1)
	    aClass303_3583 = aClass303Array3578[1 + i];
	return 100;
    }
    
    static int method5786() {
	int i = aClass303_3583.anInt3399 * -631431271;
	if (i < aClass303Array3578.length - 1)
	    aClass303_3583 = aClass303Array3578[1 + i];
	return 100;
    }
    
    static int method5787() {
	int i = aClass303_3583.anInt3399 * -631431271;
	if (i < aClass303Array3578.length - 1)
	    aClass303_3583 = aClass303Array3578[1 + i];
	return 100;
    }
    
    static void method5788() {
	if (null != aClass303_3583) {
	    Class159.aClass295_1755 = new Class295();
	    Class159.aClass295_1755.method5341
		(-4466893964599619831L * aLong3582,
		 aClass303_3583.aClass53_3391.method1169(Class21.aClass666_213,
							 1552651121),
		 aClass303_3583.aClass53_3391.method1169(Class21.aClass666_213,
							 1552651121),
		 aClass303_3583.anInt3385 * 1474421939, aClass303_3583,
		 -80136654);
	    aThread3581 = new Thread(Class159.aClass295_1755, "");
	    aThread3581.start();
	}
    }
    
    Class328() throws Throwable {
	throw new Error();
    }
    
    static int method5789() {
	if (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub29_10722
		.method17240(1661128862)
	    == 0) {
	    for (int i = 0; i < 1230768119 * client.anInt11102; i++) {
		if ((client.anInterface64Array11103[i].method420((byte) 88)
		     == 's')
		    || (client.anInterface64Array11103[i].method420((byte) 42)
			== 'S')) {
		    Class198_Sub13.aClass525_Sub30_9973.method16502
			((Class198_Sub13.aClass525_Sub30_9973
			  .aClass696_Sub29_10722),
			 1, (byte) -20);
		    client.aBool11333 = true;
		    Class217.method4141(Class68.aClass68_732, -1931988731);
		    break;
		}
	    }
	}
	if (aClass303_3583 == Class303.aClass303_3386) {
	    if (Class442.aClass459_4866 == null)
		Class442.aClass459_4866
		    = new Class459(Class94.aClass463_912,
				   Class198_Sub17.aClass470_9982,
				   Class526.aClass466_7131,
				   Class38.aBigInteger325,
				   Class38.aBigInteger327);
	    if (!Class442.aClass459_4866.method7572((byte) 102))
		return 0;
	    Class6.method557(0, null, true, (short) -19912);
	    Class302.aBool3380 = !Class696_Sub38.method17317((byte) -24);
	    aClass458_3577
		= Class600.method9890((Class302.aBool3380
				       ? Class56.aClass56_580
				       : Class56.aClass56_595),
				      false, 1, true, true, (byte) 1);
	    Class653.aClass458_8393
		= Class600.method9890(Class56.aClass56_587, false, 1, true,
				      true, (byte) 1);
	    Class276.aClass458_2875
		= Class600.method9890(Class56.aClass56_577, false, 1, true,
				      true, (byte) 1);
	    Class18.aClass458_204
		= Class600.method9890(Class56.aClass56_591, true, 1, true,
				      true, (byte) 1);
	}
	if (Class303.aClass303_3382 == aClass303_3583) {
	    boolean bool = Class653.aClass458_8393.method7481((short) -12588);
	    boolean bool_2_ = Class18.aClass458_204.method7481((short) -28991);
	    int i = Class652_Sub2.aClass454_Sub1Array10916
			[Class56.aClass56_587.method1202(1286247967)]
			.method16000((byte) 1);
	    i = i + Class652_Sub2.aClass454_Sub1Array10916
			[(Class302.aBool3380
			  ? Class56.aClass56_580.method1202(684268856)
			  : Class56.aClass56_595.method1202(2105452205))]
			.method16000((byte) 1);
	    i += Class652_Sub2.aClass454_Sub1Array10916
		     [Class56.aClass56_577.method1202(1132679474)]
		     .method16000((byte) 1);
	    i = i + (bool_2_ ? 100
		     : Class18.aClass458_204.method7483((byte) 4));
	    i = i + (bool ? 100
		     : Class653.aClass458_8393.method7483((byte) 46));
	    if (i != 500)
		return i / 5;
	    Class138.aClass631_1641 = new Class631(Class18.aClass458_204);
	    Class287.method5259(Class138.aClass631_1641, 1255184789);
	    int i_3_ = Class198_Sub13.aClass525_Sub30_9973
			   .aClass696_Sub38_10721.method17314(825788668);
	    aClass91_3579
		= new Class91(client.aClass668_11090, Class21.aClass666_213,
			      Class653.aClass458_8393);
	    Class73[] class73s = aClass91_3579.method1692(i_3_, -54022543);
	    if (0 == class73s.length)
		class73s = aClass91_3579.method1692(0, 628345146);
	    Class315 class315
		= new Class315(aClass458_3577, Class276.aClass458_2875);
	    if (class73s.length > 0) {
		anInterface32Array3585 = new Interface32[class73s.length];
		for (int i_4_ = 0; i_4_ < anInterface32Array3585.length;
		     i_4_++)
		    anInterface32Array3585[i_4_]
			= new Class293(aClass91_3579.method1690(((class73s
								  [i_4_]
								  .anInt819)
								 * -51016315),
								304193221),
				       class73s[i_4_].anInt817 * 1859675235,
				       -189436045 * class73s[i_4_].anInt818,
				       class315);
	    }
	}
	if (aClass303_3583 == Class303.aClass303_3383)
	    Class7.aClass404_53
		= new Class404(Class501.aClass182_5564, aClass458_3577,
			       Class276.aClass458_2875,
			       Class525_Sub42.method16882((short) -16043));
	if (Class303.aClass303_3393 == aClass303_3583) {
	    int i = Class7.aClass404_53.method6602(248115685);
	    int i_5_ = Class7.aClass404_53.method6595(-1591047126);
	    if (i < i_5_)
		return i * 100 / i_5_;
	}
	if (aClass303_3583 == Class303.aClass303_3398) {
	    if (null != anInterface32Array3585
		&& anInterface32Array3585.length > 0) {
		if (anInterface32Array3585[0].method202(-1318175184) < 100)
		    return 0;
		if (anInterface32Array3585.length > 1
		    && aClass91_3579.method1695(-527910033)
		    && anInterface32Array3585[1].method202(-1318175184) < 100)
		    return 0;
	    }
	    Class7.aClass404_53.method6581(client.anInterface50_11252,
					   (byte) 75);
	    Class495.method8130(Class501.aClass182_5564, 534531211);
	    Class441.method7119(5, -2005200573);
	}
	if (aClass303_3583 == Class303.aClass303_3402) {
	    Class462.aClass458_5095
		= Class600.method9890(Class56.idx_8, false, 1, false,
				      true, (byte) 1);
	    Class163_Sub2.aClass458_8988
		= Class600.method9890(Class56.idx_0, false, 1, false,
				      true, (byte) 1);
	    Class629.aClass458_8162
		= Class600.method9890(Class56.idx_1, false, 1, false,
				      true, (byte) 1);
	    Class316.aClass458_3497
		= Class600.method9890(Class56.idx_2, false, 1, true,
				      true, (byte) 1);
	    Class555.aClass458_7460
		= Class600.method9890(Class56.aClass56_581, false, 1, true,
				      true, (byte) 1);
	    Class175_Sub4.aClass458_9940
		= Class600.method9890(Class56.idx_3, false, 1, true,
				      true, (byte) 1);
	    Class322.aClass458_3549
		= Class600.method9890(Class56.idx_5, true, 1, false,
				      true, (byte) 1);
	    WorldTile.aClass458_705
		= Class600.method9890(Class56.idx_7, false, 1, false,
				      true, (byte) 1);
	    Class198_Sub19.aClass458_9994
		= Class600.method9890(Class56.aClass56_594, true, 1, false,
				      true, (byte) 1);
	    Class113.aClass458_1390
		= Class600.method9890(Class56.aClass56_603, true, 1, false,
				      true, (byte) 1);
	    Class110.aClass458_1370
		= Class600.method9890(Class56.aClass56_612, false, 1, false,
				      true, (byte) 1);
	    Class112.aClass458_1386
		= Class600.method9890(Class56.aClass56_583, false, 1, true,
				      true, (byte) 1);
	    Class307.aClass458_3417
		= Class600.method9890(Class56.aClass56_593, true, 1, false,
				      false, (byte) 1);
	    Class263.aClass458_2801
		= Class600.method9890(Class56.aClass56_599, true, 1, false,
				      false, (byte) 1);
	    Class27.aClass458_282
		= Class600.method9890(Class56.aClass56_579, false, 1, true,
				      true, (byte) 1);
	    Class138.aClass458_1640
		= Class600.method9890(Class56.aClass56_575, false, 1, true,
				      true, (byte) 1);
	    Class47.aClass458_363
		= Class600.method9890(Class56.aClass56_578, false, 1, true,
				      true, (byte) 1);
	    Class198_Sub2.aClass458_9905
		= Class600.method9890(Class56.aClass56_585, false, 1, true,
				      true, (byte) 1);
	    Class297.aClass458_3274
		= Class600.method9890(Class56.aClass56_573, false, 1, true,
				      true, (byte) 1);
	    Class220.aClass458_2330
		= Class600.method9890(Class56.aClass56_584, false, 1, true,
				      true, (byte) 1);
	    Class350_Sub2.aClass458_10224
		= Class600.method9890(Class56.aClass56_608, false, 1, true,
				      true, (byte) 1);
	    ItemDefinitions.aClass458_136
		= Class600.method9890(Class56.aClass56_586, true, 1, false,
				      false, (byte) 1);
	    Class597.aClass458_7845
		= Class600.method9890(Class56.aClass56_600, true, 1, false,
				      true, (byte) 1);
	    Class174.aClass458_1862
		= Class600.method9890(Class56.aClass56_590, false, 1, true,
				      true, (byte) 1);
	    Class427.aClass458_4806
		= Class600.method9890(Class56.aClass56_588, false, 1, true,
				      true, (byte) 1);
	    Class40_Sub22.aClass458_11051
		= Class600.method9890(Class56.aClass56_589, true, 1, true,
				      true, (byte) 1);
	    BillBoardDefinitions.aClass458_5605
		= Class600.method9890(Class56.aClass56_572, false, 1, true,
				      true, (byte) 1);
	    Class198_Sub15.aClass458_9976
		= Class600.method9890(Class56.aClass56_592, false, 1, true,
				      true, (byte) 1);
	    Class656_Sub1_Sub3_Sub3.aClass458_12048
		= Class600.method9890(Class56.aClass56_598, true, 1, false,
				      true, (byte) 1);
	    Class566.aClass458_7604
		= Class600.method9890(Class56.aClass56_576, true, 1, false,
				      true, (byte) 1);
	    Class17_Sub1.aClass458_11027
		= Class600.method9890(Class56.aClass56_596, true, 1, true,
				      true, (byte) 1);
	}
	if (aClass303_3583 == Class303.aClass303_3387) {
	    int i = 0;
	    int i_6_ = 0;
	    for (int i_7_ = 0;
		 i_7_ < Class652_Sub2.aClass454_Sub1Array10916.length;
		 i_7_++) {
		if (null != Class652_Sub2.aClass454_Sub1Array10916[i_7_]) {
		    i += Class652_Sub2.aClass454_Sub1Array10916[i_7_]
			     .method16000((byte) 1);
		    i_6_++;
		}
	    }
	    if (i_6_ > 0)
		i /= i_6_;
	    if (100 != i) {
		if (anInt3586 * 1817240471 < 0)
		    anInt3586 = 509070375 * i;
		return ((i - anInt3586 * 1817240471) * 100
			/ (100 - anInt3586 * 1817240471));
	    }
	    Class632.method10322(Class138.aClass631_1641, (byte) 96);
	    Class7.aClass404_53
		= new Class404(Class501.aClass182_5564,
			       Class462.aClass458_5095,
			       Class276.aClass458_2875,
			       Class525_Sub42.method16882((short) -387));
	}
	if (aClass303_3583 == Class303.aClass303_3381) {
	    byte[] is
		= Class18.aClass458_204.getTextureData((Class638.aClass638_8309
						    .anInt8316) * 2028004077,
						   1323652692);
	    if (is == null)
		return 0;
	    Class40_Sub20.aClass217_11050 = new Class217();
	    Class40_Sub20.aClass217_11050.method4027(50, 7340032, (byte) 10);
	    Class704_Sub2.method17395(is, (byte) 15);
	    Class441.method7119(19, -1510320924);
	}
	if (Class303.aClass303_3389 == aClass303_3583
	    && null == Class312_Sub1.aClass544_10064) {
	    Class312_Sub1.aClass544_10064
		= new Class544(Class566.aClass458_7604);
	    Class603.method9980(Class312_Sub1.aClass544_10064, (short) -31647);
	}
	if (aClass303_3583 == Class303.aClass303_3390) {
	    int i = Class313.method5643(1298049481);
	    if (i < 100)
		return i;
	    Class601.method9900
		(Class18.aClass458_204.getTextureData(2028004077 * (Class638
								.aClass638_8308
								.anInt8316),
						  1817821036),
		 -706574078);
	    Class198_Sub18.aShortArrayArray9988
		= Class138.aClass631_1641.aShortArrayArray8182;
	    Class525_Sub6.aShortArrayArrayArray10485
		= Class138.aClass631_1641.aShortArrayArrayArray8183;
	    Class477.aShortArrayArray5199
		= Class138.aClass631_1641.aShortArrayArray8184;
	    Class522_Sub1.aShortArrayArrayArray10395
		= Class138.aClass631_1641.aShortArrayArrayArray8186;
	    if (-1085475287 * Class138.aClass631_1641.anInt8190 != -1
		&& -1 != Class138.aClass631_1641.anInt8209 * -1544174753) {
		client.anInt11223
		    = Class138.aClass631_1641.anInt8190 * -1267057803;
		client.anInt11224
		    = -1878792483 * Class138.aClass631_1641.anInt8209;
	    }
	    Class664.aClass634_8557 = new Class634(Class18.aClass458_204);
	    Class91.aClass629_903 = new Class629(Class18.aClass458_204);
	    Class525_Sub22_Sub1.aClass632_11646
		= new Class632(Class18.aClass458_204);
	    Class685.aClass630_8692 = new Class630(Class18.aClass458_204);
	    Class556.aClass623_7468 = new Class623(Class18.aClass458_204);
	}
	if (Class303.aClass303_3384 == aClass303_3583) {
	    if (1728284569 * Class138.aClass631_1641.anInt8175 != -1
		&& !WorldTile.aClass458_705.method7478((Class138.aClass631_1641
						      .anInt8175) * 1728284569,
						     0, (short) 22953))
		return 99;
	    Class166.aClass180_1835
		= new Class180(Class40_Sub22.aClass458_11051);
	    Class411.anInterface24_4255
		= new Class172_Sub1(Class198_Sub19.aClass458_9994,
				    Class113.aClass458_1390);
	    client.aClass40_Sub16_11201
		= new Class40_Sub16(client.aClass668_11090,
				    Class21.aClass666_213,
				    Class316.aClass458_3497);
	    Class227.aClass40_Sub1_2345
		= new Class40_Sub1(client.aClass668_11090,
				   Class21.aClass666_213,
				   Class316.aClass458_3497);
	    Class635.aClass40_Sub6_8274
		= new Class40_Sub6(client.aClass668_11090,
				   Class21.aClass666_213,
				   Class316.aClass458_3497,
				   Class462.aClass458_5095);
	    Class486.aClass40_5240
		= new Class40(client.aClass668_11090, Class21.aClass666_213,
			      Class316.aClass458_3497, Class663.aClass663_8516,
			      64, new Class45(com.jagex.Class14.class));
	    Class685.aClass40_8690
		= new Class40(client.aClass668_11090, Class21.aClass666_213,
			      Class316.aClass458_3497, Class663.aClass663_8515,
			      16, new Class45(com.jagex.Class82.class));
	    Class525_Sub22.aClass40_Sub15_10585
		= new Class40_Sub15(client.aClass668_11090,
				    Class21.aClass666_213,
				    Class138.aClass458_1640);
	    Class232.aClass40_Sub18_2368
		= new Class40_Sub18(client.aClass668_11090,
				    Class21.aClass666_213,
				    Class316.aClass458_3497);
	    Class198_Sub17.aClass40_Sub14_9981
		= new Class40_Sub14(client.aClass668_11090,
				    Class21.aClass666_213,
				    Class316.aClass458_3497);
	    Class83.aClass40_Sub12_852
		= new Class40_Sub12(client.aClass668_11090,
				    Class21.aClass666_213,
				    Class316.aClass458_3497,
				    Class462.aClass458_5095);
	    Class566.aClass40_Sub5_7605
		= new Class40_Sub5(client.aClass668_11090,
				   Class21.aClass666_213,
				   Class316.aClass458_3497,
				   Class462.aClass458_5095);
	    Class38.aClass40_Sub9_328
		= new Class40_Sub9(client.aClass668_11090,
				   Class21.aClass666_213,
				   Class316.aClass458_3497,
				   WorldTile.aClass458_705);
	    Class612.aClass40_Sub19_8026
		= new Class40_Sub19(client.aClass668_11090,
				    Class21.aClass666_213,
				    Class316.aClass458_3497);
	    client.aClass40_Sub21_11118
		= new Class40_Sub21(client.aClass668_11090,
				    Class21.aClass666_213,
				    Class316.aClass458_3497);
	    Class642.aClass40_Sub11_8327
		= new Class40_Sub11(client.aClass668_11090,
				    Class21.aClass666_213, true,
				    Class27.aClass458_282,
				    WorldTile.aClass458_705);
	    client.aClass507_11137.method8398(Class642.aClass40_Sub11_8327,
					      1804784598);
	    Class45.aClass500_349.method8178
		(new Class40_Sub11(client.aClass668_11090,
				   Class21.aClass666_213, true,
				   Class27.aClass458_282,
				   WorldTile.aClass458_705),
		 -813407495);
	    Class698.aClass40_Sub2_8770
		= new Class40_Sub2(client.aClass668_11090,
				   Class21.aClass666_213,
				   Class316.aClass458_3497,
				   Class462.aClass458_5095);
	    Class568.aClass40_Sub17_7627
		= new Class40_Sub17(client.aClass668_11090,
				    Class21.aClass666_213,
				    Class316.aClass458_3497,
				    Class462.aClass458_5095);
	    Class168_Sub1.aClass40_Sub7_9112
		= new Class40_Sub7(client.aClass668_11090,
				   Class21.aClass666_213, true,
				   Class47.aClass458_363,
				   WorldTile.aClass458_705);
	    Class313_Sub2.aClass40_Sub22_10106
		= new Class40_Sub22(client.aClass668_11090,
				    Class21.aClass666_213, true,
				    client.aClass40_Sub16_11201,
				    Class198_Sub2.aClass458_9905,
				    WorldTile.aClass458_705);
	    Class249.aClass47_Sub1_2445
		= new Class47_Sub1(client.aClass668_11090,
				   Class21.aClass666_213,
				   Class316.aClass458_3497, true);
	    Class163_Sub2.aClass40_Sub13_8989
		= new Class40_Sub13(client.aClass668_11090,
				    Class21.aClass666_213,
				    Class316.aClass458_3497);
	    Class685.aClass40_Sub8_8691
		= new Class40_Sub8(client.aClass668_11090,
				   Class21.aClass666_213,
				   Class297.aClass458_3274,
				   Class163_Sub2.aClass458_8988,
				   Class629.aClass458_8162,
				   Class163_Sub2.aClass40_Sub13_8989);
	    Class658.aClass40_Sub3_8457
		= new Class40_Sub3(client.aClass668_11090,
				   Class21.aClass666_213,
				   Class316.aClass458_3497);
	    Class539.aClass40_Sub4_7181
		= new Class40_Sub4(client.aClass668_11090,
				   Class21.aClass666_213,
				   Class316.aClass458_3497);
	    Class574.aClass40_Sub20_7645
		= new Class40_Sub20(client.aClass668_11090,
				    Class21.aClass666_213,
				    Class220.aClass458_2330,
				    WorldTile.aClass458_705);
	    Class397.aClass47_Sub2_4113
		= new Class47_Sub2(client.aClass668_11090,
				   Class21.aClass666_213,
				   Class350_Sub2.aClass458_10224, true);
	    Class198_Sub4.aClass106_Sub1_Sub2_9917
		= new Class106_Sub1_Sub2(client.aClass668_11090,
					 Class453.aClass453_4940,
					 Class21.aClass666_213,
					 Class316.aClass458_3497);
	    Class109.aClass106_Sub1_Sub1_1323
		= new Class106_Sub1_Sub1(client.aClass668_11090,
					 Class453.aClass453_4939,
					 Class21.aClass666_213,
					 Class316.aClass458_3497);
	    Class293.aClass106_Sub1_Sub2_3239
		= new Class106_Sub1_Sub2(client.aClass668_11090,
					 Class453.aClass453_4943,
					 Class21.aClass666_213,
					 Class316.aClass458_3497);
	    Class711.aClass106_Sub1_Sub2_8869
		= new Class106_Sub1_Sub2(client.aClass668_11090,
					 Class453.aClass453_4944,
					 Class21.aClass666_213,
					 Class316.aClass458_3497);
	    Class535.aClass106_Sub1_Sub2_7176
		= new Class106_Sub1_Sub2(client.aClass668_11090,
					 Class453.aClass453_4945,
					 Class21.aClass666_213,
					 Class316.aClass458_3497);
	    Class198_Sub20.aClass106_Sub1_Sub2_9998
		= new Class106_Sub1_Sub2(client.aClass668_11090,
					 Class453.aClass453_4947,
					 Class21.aClass666_213,
					 Class316.aClass458_3497);
	    Class234.aClass106_Sub1_Sub2_2373
		= new Class106_Sub1_Sub2(client.aClass668_11090,
					 Class453.aClass453_4948,
					 Class21.aClass666_213,
					 Class316.aClass458_3497);
	    Class144_Sub1.aMap9140
		= Class390.method6474((new Class106_Sub1[]
				       { (Class198_Sub4
					  .aClass106_Sub1_Sub2_9917),
					 Class109.aClass106_Sub1_Sub1_1323,
					 Class293.aClass106_Sub1_Sub2_3239,
					 Class711.aClass106_Sub1_Sub2_8869,
					 Class535.aClass106_Sub1_Sub2_7176,
					 (Class198_Sub20
					  .aClass106_Sub1_Sub2_9998),
					 Class234.aClass106_Sub1_Sub2_2373 }),
				      2146282279);
	    Class575.aClass40_Sub10_7647
		= new Class40_Sub10(client.aClass668_11090,
				    Class21.aClass666_213,
				    Class316.aClass458_3497,
				    Class144_Sub1.aMap9140);
	    Class607.anInterface20_7975 = new Class306();
	    Class648.method10704(Class175_Sub4.aClass458_9940,
				 WorldTile.aClass458_705,
				 Class462.aClass458_5095,
				 Class276.aClass458_2875, 575540221);
	    Class628.aClass385_8157
		= new Class385(Class198_Sub15.aClass458_9976);
	    Class450.aClass400_4926 = new Class400(BillBoardDefinitions.aClass458_5605);
	    Class263.aClass402_2799 = new Class402(BillBoardDefinitions.aClass458_5605);
	    Class562.aClass471_7557
		= new Class471(Class21.aClass666_213, Class174.aClass458_1862,
			       Class427.aClass458_4806);
	    Class215.aClass58_2283
		= new ConfigEntry(Class21.aClass666_213, Class174.aClass458_1862,
			      Class427.aClass458_4806, new Class386());
	    Class532.aClass111_7170
		= new Class111(Class109.aClass106_Sub1_Sub1_1323,
			       Class575.aClass40_Sub10_7647,
			       Class91.aClass629_903.method10288(1759280971));
	    Class424.method6769(-1852050786);
	    Class46.method1093(Class685.aClass40_Sub8_8691, 65535);
	    Class198_Sub14.method15653(Class263.aClass402_2799,
				       Class450.aClass400_4926, -1573360652);
	    Class164.method2664(WorldTile.aClass458_705, Class166.aClass180_1835,
				Class411.anInterface24_4255, (byte) 6);
	    Class279 class279
		= new Class279(Class110.aClass458_1370
				   .method7495("huffman", "", -1956758433));
	    Class493.method7998(class279, 1521963474);
	    Class19.aClass511_206 = Class567.method9490(-318625428);
	    Class31.aClass525_Sub36_305 = new Class525_Sub36(true);
	}
	if (Class303.aClass303_3392 == aClass303_3583) {
	    int i = (Class451.method7339(Class462.aClass458_5095, -2145124450)
		     + Class7.aClass404_53.method6577(true, -1762126306));
	    int i_8_ = (Class87.method1659(-1094580820)
			+ Class7.aClass404_53.method6595(-1591047126));
	    if (i < i_8_)
		return i * 100 / i_8_;
	}
	if (Class303.aClass303_3400 == aClass303_3583)
	    Class556.method9244(ItemDefinitions.aClass458_136, Class597.aClass458_7845,
				Class232.aClass40_Sub18_2368,
				Class198_Sub17.aClass40_Sub14_9981,
				client.aClass507_11137.method8362((byte) -1),
				Class698.aClass40_Sub2_8770,
				Class568.aClass40_Sub17_7627,
				Class532.aClass111_7170,
				Class532.aClass111_7170);
	if (Class303.aClass303_3394 == aClass303_3583) {
	    Class309.aClass144_Sub1_3465
		= new Class144_Sub1(Class198_Sub4.aClass106_Sub1_Sub2_9917);
	    Class407.method6637((byte) 0);
	    Class424.aClass52_4742 = Class238.method4416((byte) -45);
	    Class322.aClass458_3549.method7547(false, true, 1941269953);
	    Class462.aClass458_5095.method7547(true, true, 372302277);
	    Class276.aClass458_2875.method7547(true, true, -1194597593);
	    Class110.aClass458_1370.method7547(true, true, 1284747132);
	    client.aBool11199 = true;
	}
	if (aClass303_3583 == Class303.aClass303_3395
	    && -1 != 1089481059 * Class138.aClass631_1641.anInt8176) {
	    if (!Class165.method2667((Class138.aClass631_1641.anInt8176
				      * 1089481059),
				     null, -887020116))
		return 0;
	    boolean bool = true;
	    for (int i = 0;
		 i < (Class162.aClass245Array1764
		      [Class138.aClass631_1641.anInt8176 * 1089481059]
		      .aClass259Array2426).length;
		 i++) {
		Class259 class259
		    = (Class162.aClass245Array1764
		       [1089481059 * Class138.aClass631_1641.anInt8176]
		       .aClass259Array2426[i]);
		if (5 == 2010235789 * class259.anInt2590
		    && class259.anInt2621 * 1940882535 != -1
		    && !Class462.aClass458_5095.method7478((class259.anInt2621
							    * 1940882535),
							   0, (short) 28706))
		    bool = false;
	    }
	    if (!bool)
		return 0;
	}
	if (Class303.aClass303_3396 == aClass303_3583)
	    Class335.method5858(true, (byte) -8);
	if (Class303.aClass303_3397 == aClass303_3583) {
	    Class159.aClass295_1755.method5346((byte) 1);
	    try {
		aThread3581.join();
	    } catch (InterruptedException interruptedexception) {
		return 0;
	    }
	    Class159.aClass295_1755 = null;
	    aThread3581 = null;
	    aClass458_3577 = null;
	    Class653.aClass458_8393 = null;
	    aClass91_3579 = null;
	    anInterface32Array3585 = null;
	    EmitterConfig.aMap11727.remove(Class56.aClass56_587);
	    EmitterConfig.aMap11727.remove(Class56.aClass56_595);
	    EmitterConfig.aMap11727.remove(Class56.aClass56_580);
	    Class519.method8661((byte) 0);
	    client.aBool11063
		= Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub29_10722
		      .method17240(761541356) == 1;
	    Class198_Sub13.aClass525_Sub30_9973.method16502
		(Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub29_10722, 1,
		 (byte) -112);
	    if (client.aBool11063)
		Class198_Sub13.aClass525_Sub30_9973.method16502
		    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub20_10701,
		     0, (byte) -76);
	    else if ((Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub20_10701
		      .aBool10927)
		     && (-1113722213 * Class31.aClass525_Sub36_305.anInt10806
			 < 512)
		     && (Class31.aClass525_Sub36_305.anInt10806 * -1113722213
			 != 0))
		Class198_Sub13.aClass525_Sub30_9973.method16502
		    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub20_10701,
		     0, (byte) -106);
	    Class650.method10715(-1758466106);
	    if (client.aBool11063) {
		Class217.method4146(0, false, (byte) -12);
		if (!client.aBool11333)
		    Class217.method4141(Class68.aClass68_723, -1983701058);
	    } else {
		Class217.method4146(Class198_Sub13.aClass525_Sub30_9973
					.aClass696_Sub20_10701
					.method17160(2133038378),
				    false, (byte) 13);
		if (Class198_Sub13.aClass525_Sub30_9973
			.aClass696_Sub20_10701.method17160(731528316)
		    == 0)
		    Class217.method4141(Class68.aClass68_727, -1950228438);
	    }
	    Class332_Sub1.method15672(Class198_Sub13.aClass525_Sub30_9973
					  .aClass696_Sub41_10704
					  .method17337(538039486),
				      -1, -1, false, (byte) -75);
	    Class7.aClass404_53.method6581(client.anInterface50_11252,
					   (byte) 102);
	    Class495.method8130(Class501.aClass182_5564, 534531211);
	    Class62.method1376(Class501.aClass182_5564,
			       Class462.aClass458_5095, (short) 12220);
	}
	return Class241.method4438(649075906);
    }
    
    static int method5790() {
	if (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub29_10722
		.method17240(225460079)
	    == 0) {
	    for (int i = 0; i < 1230768119 * client.anInt11102; i++) {
		if ((client.anInterface64Array11103[i].method420((byte) 20)
		     == 's')
		    || (client.anInterface64Array11103[i].method420((byte) 75)
			== 'S')) {
		    Class198_Sub13.aClass525_Sub30_9973.method16502
			((Class198_Sub13.aClass525_Sub30_9973
			  .aClass696_Sub29_10722),
			 1, (byte) -116);
		    client.aBool11333 = true;
		    Class217.method4141(Class68.aClass68_732, -2014496730);
		    break;
		}
	    }
	}
	if (aClass303_3583 == Class303.aClass303_3386) {
	    if (Class442.aClass459_4866 == null)
		Class442.aClass459_4866
		    = new Class459(Class94.aClass463_912,
				   Class198_Sub17.aClass470_9982,
				   Class526.aClass466_7131,
				   Class38.aBigInteger325,
				   Class38.aBigInteger327);
	    if (!Class442.aClass459_4866.method7572((byte) 30))
		return 0;
	    Class6.method557(0, null, true, (short) -344);
	    Class302.aBool3380 = !Class696_Sub38.method17317((byte) -7);
	    aClass458_3577
		= Class600.method9890((Class302.aBool3380
				       ? Class56.aClass56_580
				       : Class56.aClass56_595),
				      false, 1, true, true, (byte) 1);
	    Class653.aClass458_8393
		= Class600.method9890(Class56.aClass56_587, false, 1, true,
				      true, (byte) 1);
	    Class276.aClass458_2875
		= Class600.method9890(Class56.aClass56_577, false, 1, true,
				      true, (byte) 1);
	    Class18.aClass458_204
		= Class600.method9890(Class56.aClass56_591, true, 1, true,
				      true, (byte) 1);
	}
	if (Class303.aClass303_3382 == aClass303_3583) {
	    boolean bool = Class653.aClass458_8393.method7481((short) -7010);
	    boolean bool_9_ = Class18.aClass458_204.method7481((short) -17258);
	    int i = Class652_Sub2.aClass454_Sub1Array10916
			[Class56.aClass56_587.method1202(199529573)]
			.method16000((byte) 1);
	    i = i + Class652_Sub2.aClass454_Sub1Array10916
			[(Class302.aBool3380
			  ? Class56.aClass56_580.method1202(816362855)
			  : Class56.aClass56_595.method1202(1922621384))]
			.method16000((byte) 1);
	    i += Class652_Sub2.aClass454_Sub1Array10916
		     [Class56.aClass56_577.method1202(1065285642)]
		     .method16000((byte) 1);
	    i = i + (bool_9_ ? 100
		     : Class18.aClass458_204.method7483((byte) 67));
	    i = i + (bool ? 100
		     : Class653.aClass458_8393.method7483((byte) 70));
	    if (i != 500)
		return i / 5;
	    Class138.aClass631_1641 = new Class631(Class18.aClass458_204);
	    Class287.method5259(Class138.aClass631_1641, -379546056);
	    int i_10_ = Class198_Sub13.aClass525_Sub30_9973
			    .aClass696_Sub38_10721.method17314(1433915238);
	    aClass91_3579
		= new Class91(client.aClass668_11090, Class21.aClass666_213,
			      Class653.aClass458_8393);
	    Class73[] class73s = aClass91_3579.method1692(i_10_, -1114205405);
	    if (0 == class73s.length)
		class73s = aClass91_3579.method1692(0, -2085148379);
	    Class315 class315
		= new Class315(aClass458_3577, Class276.aClass458_2875);
	    if (class73s.length > 0) {
		anInterface32Array3585 = new Interface32[class73s.length];
		for (int i_11_ = 0; i_11_ < anInterface32Array3585.length;
		     i_11_++)
		    anInterface32Array3585[i_11_]
			= new Class293(aClass91_3579.method1690(((class73s
								  [i_11_]
								  .anInt819)
								 * -51016315),
								304193221),
				       class73s[i_11_].anInt817 * 1859675235,
				       -189436045 * class73s[i_11_].anInt818,
				       class315);
	    }
	}
	if (aClass303_3583 == Class303.aClass303_3383)
	    Class7.aClass404_53
		= new Class404(Class501.aClass182_5564, aClass458_3577,
			       Class276.aClass458_2875,
			       Class525_Sub42.method16882((short) -2780));
	if (Class303.aClass303_3393 == aClass303_3583) {
	    int i = Class7.aClass404_53.method6602(248115685);
	    int i_12_ = Class7.aClass404_53.method6595(-1591047126);
	    if (i < i_12_)
		return i * 100 / i_12_;
	}
	if (aClass303_3583 == Class303.aClass303_3398) {
	    if (null != anInterface32Array3585
		&& anInterface32Array3585.length > 0) {
		if (anInterface32Array3585[0].method202(-1318175184) < 100)
		    return 0;
		if (anInterface32Array3585.length > 1
		    && aClass91_3579.method1695(-527910033)
		    && anInterface32Array3585[1].method202(-1318175184) < 100)
		    return 0;
	    }
	    Class7.aClass404_53.method6581(client.anInterface50_11252,
					   (byte) 60);
	    Class495.method8130(Class501.aClass182_5564, 534531211);
	    Class441.method7119(5, 1432862172);
	}
	if (aClass303_3583 == Class303.aClass303_3402) {
	    Class462.aClass458_5095
		= Class600.method9890(Class56.idx_8, false, 1, false,
				      true, (byte) 1);
	    Class163_Sub2.aClass458_8988
		= Class600.method9890(Class56.idx_0, false, 1, false,
				      true, (byte) 1);
	    Class629.aClass458_8162
		= Class600.method9890(Class56.idx_1, false, 1, false,
				      true, (byte) 1);
	    Class316.aClass458_3497
		= Class600.method9890(Class56.idx_2, false, 1, true,
				      true, (byte) 1);
	    Class555.aClass458_7460
		= Class600.method9890(Class56.aClass56_581, false, 1, true,
				      true, (byte) 1);
	    Class175_Sub4.aClass458_9940
		= Class600.method9890(Class56.idx_3, false, 1, true,
				      true, (byte) 1);
	    Class322.aClass458_3549
		= Class600.method9890(Class56.idx_5, true, 1, false,
				      true, (byte) 1);
	    WorldTile.aClass458_705
		= Class600.method9890(Class56.idx_7, false, 1, false,
				      true, (byte) 1);
	    Class198_Sub19.aClass458_9994
		= Class600.method9890(Class56.aClass56_594, true, 1, false,
				      true, (byte) 1);
	    Class113.aClass458_1390
		= Class600.method9890(Class56.aClass56_603, true, 1, false,
				      true, (byte) 1);
	    Class110.aClass458_1370
		= Class600.method9890(Class56.aClass56_612, false, 1, false,
				      true, (byte) 1);
	    Class112.aClass458_1386
		= Class600.method9890(Class56.aClass56_583, false, 1, true,
				      true, (byte) 1);
	    Class307.aClass458_3417
		= Class600.method9890(Class56.aClass56_593, true, 1, false,
				      false, (byte) 1);
	    Class263.aClass458_2801
		= Class600.method9890(Class56.aClass56_599, true, 1, false,
				      false, (byte) 1);
	    Class27.aClass458_282
		= Class600.method9890(Class56.aClass56_579, false, 1, true,
				      true, (byte) 1);
	    Class138.aClass458_1640
		= Class600.method9890(Class56.aClass56_575, false, 1, true,
				      true, (byte) 1);
	    Class47.aClass458_363
		= Class600.method9890(Class56.aClass56_578, false, 1, true,
				      true, (byte) 1);
	    Class198_Sub2.aClass458_9905
		= Class600.method9890(Class56.aClass56_585, false, 1, true,
				      true, (byte) 1);
	    Class297.aClass458_3274
		= Class600.method9890(Class56.aClass56_573, false, 1, true,
				      true, (byte) 1);
	    Class220.aClass458_2330
		= Class600.method9890(Class56.aClass56_584, false, 1, true,
				      true, (byte) 1);
	    Class350_Sub2.aClass458_10224
		= Class600.method9890(Class56.aClass56_608, false, 1, true,
				      true, (byte) 1);
	    ItemDefinitions.aClass458_136
		= Class600.method9890(Class56.aClass56_586, true, 1, false,
				      false, (byte) 1);
	    Class597.aClass458_7845
		= Class600.method9890(Class56.aClass56_600, true, 1, false,
				      true, (byte) 1);
	    Class174.aClass458_1862
		= Class600.method9890(Class56.aClass56_590, false, 1, true,
				      true, (byte) 1);
	    Class427.aClass458_4806
		= Class600.method9890(Class56.aClass56_588, false, 1, true,
				      true, (byte) 1);
	    Class40_Sub22.aClass458_11051
		= Class600.method9890(Class56.aClass56_589, true, 1, true,
				      true, (byte) 1);
	    BillBoardDefinitions.aClass458_5605
		= Class600.method9890(Class56.aClass56_572, false, 1, true,
				      true, (byte) 1);
	    Class198_Sub15.aClass458_9976
		= Class600.method9890(Class56.aClass56_592, false, 1, true,
				      true, (byte) 1);
	    Class656_Sub1_Sub3_Sub3.aClass458_12048
		= Class600.method9890(Class56.aClass56_598, true, 1, false,
				      true, (byte) 1);
	    Class566.aClass458_7604
		= Class600.method9890(Class56.aClass56_576, true, 1, false,
				      true, (byte) 1);
	    Class17_Sub1.aClass458_11027
		= Class600.method9890(Class56.aClass56_596, true, 1, true,
				      true, (byte) 1);
	}
	if (aClass303_3583 == Class303.aClass303_3387) {
	    int i = 0;
	    int i_13_ = 0;
	    for (int i_14_ = 0;
		 i_14_ < Class652_Sub2.aClass454_Sub1Array10916.length;
		 i_14_++) {
		if (null != Class652_Sub2.aClass454_Sub1Array10916[i_14_]) {
		    i += Class652_Sub2.aClass454_Sub1Array10916[i_14_]
			     .method16000((byte) 1);
		    i_13_++;
		}
	    }
	    if (i_13_ > 0)
		i /= i_13_;
	    if (100 != i) {
		if (anInt3586 * 1817240471 < 0)
		    anInt3586 = 509070375 * i;
		return ((i - anInt3586 * 1817240471) * 100
			/ (100 - anInt3586 * 1817240471));
	    }
	    Class632.method10322(Class138.aClass631_1641, (byte) 96);
	    Class7.aClass404_53
		= new Class404(Class501.aClass182_5564,
			       Class462.aClass458_5095,
			       Class276.aClass458_2875,
			       Class525_Sub42.method16882((short) -1624));
	}
	if (aClass303_3583 == Class303.aClass303_3381) {
	    byte[] is
		= Class18.aClass458_204.getTextureData((Class638.aClass638_8309
						    .anInt8316) * 2028004077,
						   1347272729);
	    if (is == null)
		return 0;
	    Class40_Sub20.aClass217_11050 = new Class217();
	    Class40_Sub20.aClass217_11050.method4027(50, 7340032, (byte) 61);
	    Class704_Sub2.method17395(is, (byte) 15);
	    Class441.method7119(19, -1307067864);
	}
	if (Class303.aClass303_3389 == aClass303_3583
	    && null == Class312_Sub1.aClass544_10064) {
	    Class312_Sub1.aClass544_10064
		= new Class544(Class566.aClass458_7604);
	    Class603.method9980(Class312_Sub1.aClass544_10064, (short) -12797);
	}
	if (aClass303_3583 == Class303.aClass303_3390) {
	    int i = Class313.method5643(1298049481);
	    if (i < 100)
		return i;
	    Class601.method9900
		(Class18.aClass458_204.getTextureData(2028004077 * (Class638
								.aClass638_8308
								.anInt8316),
						  1338864283),
		 -1264329548);
	    Class198_Sub18.aShortArrayArray9988
		= Class138.aClass631_1641.aShortArrayArray8182;
	    Class525_Sub6.aShortArrayArrayArray10485
		= Class138.aClass631_1641.aShortArrayArrayArray8183;
	    Class477.aShortArrayArray5199
		= Class138.aClass631_1641.aShortArrayArray8184;
	    Class522_Sub1.aShortArrayArrayArray10395
		= Class138.aClass631_1641.aShortArrayArrayArray8186;
	    if (-1085475287 * Class138.aClass631_1641.anInt8190 != -1
		&& -1 != Class138.aClass631_1641.anInt8209 * -1544174753) {
		client.anInt11223
		    = Class138.aClass631_1641.anInt8190 * -1267057803;
		client.anInt11224
		    = -1878792483 * Class138.aClass631_1641.anInt8209;
	    }
	    Class664.aClass634_8557 = new Class634(Class18.aClass458_204);
	    Class91.aClass629_903 = new Class629(Class18.aClass458_204);
	    Class525_Sub22_Sub1.aClass632_11646
		= new Class632(Class18.aClass458_204);
	    Class685.aClass630_8692 = new Class630(Class18.aClass458_204);
	    Class556.aClass623_7468 = new Class623(Class18.aClass458_204);
	}
	if (Class303.aClass303_3384 == aClass303_3583) {
	    if (1728284569 * Class138.aClass631_1641.anInt8175 != -1
		&& !WorldTile.aClass458_705.method7478((Class138.aClass631_1641
						      .anInt8175) * 1728284569,
						     0, (short) 11321))
		return 99;
	    Class166.aClass180_1835
		= new Class180(Class40_Sub22.aClass458_11051);
	    Class411.anInterface24_4255
		= new Class172_Sub1(Class198_Sub19.aClass458_9994,
				    Class113.aClass458_1390);
	    client.aClass40_Sub16_11201
		= new Class40_Sub16(client.aClass668_11090,
				    Class21.aClass666_213,
				    Class316.aClass458_3497);
	    Class227.aClass40_Sub1_2345
		= new Class40_Sub1(client.aClass668_11090,
				   Class21.aClass666_213,
				   Class316.aClass458_3497);
	    Class635.aClass40_Sub6_8274
		= new Class40_Sub6(client.aClass668_11090,
				   Class21.aClass666_213,
				   Class316.aClass458_3497,
				   Class462.aClass458_5095);
	    Class486.aClass40_5240
		= new Class40(client.aClass668_11090, Class21.aClass666_213,
			      Class316.aClass458_3497, Class663.aClass663_8516,
			      64, new Class45(com.jagex.Class14.class));
	    Class685.aClass40_8690
		= new Class40(client.aClass668_11090, Class21.aClass666_213,
			      Class316.aClass458_3497, Class663.aClass663_8515,
			      16, new Class45(com.jagex.Class82.class));
	    Class525_Sub22.aClass40_Sub15_10585
		= new Class40_Sub15(client.aClass668_11090,
				    Class21.aClass666_213,
				    Class138.aClass458_1640);
	    Class232.aClass40_Sub18_2368
		= new Class40_Sub18(client.aClass668_11090,
				    Class21.aClass666_213,
				    Class316.aClass458_3497);
	    Class198_Sub17.aClass40_Sub14_9981
		= new Class40_Sub14(client.aClass668_11090,
				    Class21.aClass666_213,
				    Class316.aClass458_3497);
	    Class83.aClass40_Sub12_852
		= new Class40_Sub12(client.aClass668_11090,
				    Class21.aClass666_213,
				    Class316.aClass458_3497,
				    Class462.aClass458_5095);
	    Class566.aClass40_Sub5_7605
		= new Class40_Sub5(client.aClass668_11090,
				   Class21.aClass666_213,
				   Class316.aClass458_3497,
				   Class462.aClass458_5095);
	    Class38.aClass40_Sub9_328
		= new Class40_Sub9(client.aClass668_11090,
				   Class21.aClass666_213,
				   Class316.aClass458_3497,
				   WorldTile.aClass458_705);
	    Class612.aClass40_Sub19_8026
		= new Class40_Sub19(client.aClass668_11090,
				    Class21.aClass666_213,
				    Class316.aClass458_3497);
	    client.aClass40_Sub21_11118
		= new Class40_Sub21(client.aClass668_11090,
				    Class21.aClass666_213,
				    Class316.aClass458_3497);
	    Class642.aClass40_Sub11_8327
		= new Class40_Sub11(client.aClass668_11090,
				    Class21.aClass666_213, true,
				    Class27.aClass458_282,
				    WorldTile.aClass458_705);
	    client.aClass507_11137.method8398(Class642.aClass40_Sub11_8327,
					      1804784598);
	    Class45.aClass500_349.method8178
		(new Class40_Sub11(client.aClass668_11090,
				   Class21.aClass666_213, true,
				   Class27.aClass458_282,
				   WorldTile.aClass458_705),
		 234804442);
	    Class698.aClass40_Sub2_8770
		= new Class40_Sub2(client.aClass668_11090,
				   Class21.aClass666_213,
				   Class316.aClass458_3497,
				   Class462.aClass458_5095);
	    Class568.aClass40_Sub17_7627
		= new Class40_Sub17(client.aClass668_11090,
				    Class21.aClass666_213,
				    Class316.aClass458_3497,
				    Class462.aClass458_5095);
	    Class168_Sub1.aClass40_Sub7_9112
		= new Class40_Sub7(client.aClass668_11090,
				   Class21.aClass666_213, true,
				   Class47.aClass458_363,
				   WorldTile.aClass458_705);
	    Class313_Sub2.aClass40_Sub22_10106
		= new Class40_Sub22(client.aClass668_11090,
				    Class21.aClass666_213, true,
				    client.aClass40_Sub16_11201,
				    Class198_Sub2.aClass458_9905,
				    WorldTile.aClass458_705);
	    Class249.aClass47_Sub1_2445
		= new Class47_Sub1(client.aClass668_11090,
				   Class21.aClass666_213,
				   Class316.aClass458_3497, true);
	    Class163_Sub2.aClass40_Sub13_8989
		= new Class40_Sub13(client.aClass668_11090,
				    Class21.aClass666_213,
				    Class316.aClass458_3497);
	    Class685.aClass40_Sub8_8691
		= new Class40_Sub8(client.aClass668_11090,
				   Class21.aClass666_213,
				   Class297.aClass458_3274,
				   Class163_Sub2.aClass458_8988,
				   Class629.aClass458_8162,
				   Class163_Sub2.aClass40_Sub13_8989);
	    Class658.aClass40_Sub3_8457
		= new Class40_Sub3(client.aClass668_11090,
				   Class21.aClass666_213,
				   Class316.aClass458_3497);
	    Class539.aClass40_Sub4_7181
		= new Class40_Sub4(client.aClass668_11090,
				   Class21.aClass666_213,
				   Class316.aClass458_3497);
	    Class574.aClass40_Sub20_7645
		= new Class40_Sub20(client.aClass668_11090,
				    Class21.aClass666_213,
				    Class220.aClass458_2330,
				    WorldTile.aClass458_705);
	    Class397.aClass47_Sub2_4113
		= new Class47_Sub2(client.aClass668_11090,
				   Class21.aClass666_213,
				   Class350_Sub2.aClass458_10224, true);
	    Class198_Sub4.aClass106_Sub1_Sub2_9917
		= new Class106_Sub1_Sub2(client.aClass668_11090,
					 Class453.aClass453_4940,
					 Class21.aClass666_213,
					 Class316.aClass458_3497);
	    Class109.aClass106_Sub1_Sub1_1323
		= new Class106_Sub1_Sub1(client.aClass668_11090,
					 Class453.aClass453_4939,
					 Class21.aClass666_213,
					 Class316.aClass458_3497);
	    Class293.aClass106_Sub1_Sub2_3239
		= new Class106_Sub1_Sub2(client.aClass668_11090,
					 Class453.aClass453_4943,
					 Class21.aClass666_213,
					 Class316.aClass458_3497);
	    Class711.aClass106_Sub1_Sub2_8869
		= new Class106_Sub1_Sub2(client.aClass668_11090,
					 Class453.aClass453_4944,
					 Class21.aClass666_213,
					 Class316.aClass458_3497);
	    Class535.aClass106_Sub1_Sub2_7176
		= new Class106_Sub1_Sub2(client.aClass668_11090,
					 Class453.aClass453_4945,
					 Class21.aClass666_213,
					 Class316.aClass458_3497);
	    Class198_Sub20.aClass106_Sub1_Sub2_9998
		= new Class106_Sub1_Sub2(client.aClass668_11090,
					 Class453.aClass453_4947,
					 Class21.aClass666_213,
					 Class316.aClass458_3497);
	    Class234.aClass106_Sub1_Sub2_2373
		= new Class106_Sub1_Sub2(client.aClass668_11090,
					 Class453.aClass453_4948,
					 Class21.aClass666_213,
					 Class316.aClass458_3497);
	    Class144_Sub1.aMap9140
		= Class390.method6474((new Class106_Sub1[]
				       { (Class198_Sub4
					  .aClass106_Sub1_Sub2_9917),
					 Class109.aClass106_Sub1_Sub1_1323,
					 Class293.aClass106_Sub1_Sub2_3239,
					 Class711.aClass106_Sub1_Sub2_8869,
					 Class535.aClass106_Sub1_Sub2_7176,
					 (Class198_Sub20
					  .aClass106_Sub1_Sub2_9998),
					 Class234.aClass106_Sub1_Sub2_2373 }),
				      2144782241);
	    Class575.aClass40_Sub10_7647
		= new Class40_Sub10(client.aClass668_11090,
				    Class21.aClass666_213,
				    Class316.aClass458_3497,
				    Class144_Sub1.aMap9140);
	    Class607.anInterface20_7975 = new Class306();
	    Class648.method10704(Class175_Sub4.aClass458_9940,
				 WorldTile.aClass458_705,
				 Class462.aClass458_5095,
				 Class276.aClass458_2875, -364098747);
	    Class628.aClass385_8157
		= new Class385(Class198_Sub15.aClass458_9976);
	    Class450.aClass400_4926 = new Class400(BillBoardDefinitions.aClass458_5605);
	    Class263.aClass402_2799 = new Class402(BillBoardDefinitions.aClass458_5605);
	    Class562.aClass471_7557
		= new Class471(Class21.aClass666_213, Class174.aClass458_1862,
			       Class427.aClass458_4806);
	    Class215.aClass58_2283
		= new ConfigEntry(Class21.aClass666_213, Class174.aClass458_1862,
			      Class427.aClass458_4806, new Class386());
	    Class532.aClass111_7170
		= new Class111(Class109.aClass106_Sub1_Sub1_1323,
			       Class575.aClass40_Sub10_7647,
			       Class91.aClass629_903.method10288(458441909));
	    Class424.method6769(-1852050786);
	    Class46.method1093(Class685.aClass40_Sub8_8691, 65535);
	    Class198_Sub14.method15653(Class263.aClass402_2799,
				       Class450.aClass400_4926, -1573360652);
	    Class164.method2664(WorldTile.aClass458_705, Class166.aClass180_1835,
				Class411.anInterface24_4255, (byte) 6);
	    Class279 class279
		= new Class279(Class110.aClass458_1370
				   .method7495("huffman", "", -741548377));
	    Class493.method7998(class279, 1195476304);
	    Class19.aClass511_206 = Class567.method9490(-56056945);
	    Class31.aClass525_Sub36_305 = new Class525_Sub36(true);
	}
	if (Class303.aClass303_3392 == aClass303_3583) {
	    int i = (Class451.method7339(Class462.aClass458_5095, -1120461594)
		     + Class7.aClass404_53.method6577(true, -819114217));
	    int i_15_ = (Class87.method1659(1441331571)
			 + Class7.aClass404_53.method6595(-1591047126));
	    if (i < i_15_)
		return i * 100 / i_15_;
	}
	if (Class303.aClass303_3400 == aClass303_3583)
	    Class556.method9244(ItemDefinitions.aClass458_136, Class597.aClass458_7845,
				Class232.aClass40_Sub18_2368,
				Class198_Sub17.aClass40_Sub14_9981,
				client.aClass507_11137.method8362((byte) -1),
				Class698.aClass40_Sub2_8770,
				Class568.aClass40_Sub17_7627,
				Class532.aClass111_7170,
				Class532.aClass111_7170);
	if (Class303.aClass303_3394 == aClass303_3583) {
	    Class309.aClass144_Sub1_3465
		= new Class144_Sub1(Class198_Sub4.aClass106_Sub1_Sub2_9917);
	    Class407.method6637((byte) 0);
	    Class424.aClass52_4742 = Class238.method4416((byte) -61);
	    Class322.aClass458_3549.method7547(false, true, -616033246);
	    Class462.aClass458_5095.method7547(true, true, 2046405976);
	    Class276.aClass458_2875.method7547(true, true, 1180225824);
	    Class110.aClass458_1370.method7547(true, true, -424635008);
	    client.aBool11199 = true;
	}
	if (aClass303_3583 == Class303.aClass303_3395
	    && -1 != 1089481059 * Class138.aClass631_1641.anInt8176) {
	    if (!Class165.method2667((Class138.aClass631_1641.anInt8176
				      * 1089481059),
				     null, 1605165985))
		return 0;
	    boolean bool = true;
	    for (int i = 0;
		 i < (Class162.aClass245Array1764
		      [Class138.aClass631_1641.anInt8176 * 1089481059]
		      .aClass259Array2426).length;
		 i++) {
		Class259 class259
		    = (Class162.aClass245Array1764
		       [1089481059 * Class138.aClass631_1641.anInt8176]
		       .aClass259Array2426[i]);
		if (5 == 2010235789 * class259.anInt2590
		    && class259.anInt2621 * 1940882535 != -1
		    && !Class462.aClass458_5095.method7478((class259.anInt2621
							    * 1940882535),
							   0, (short) 21932))
		    bool = false;
	    }
	    if (!bool)
		return 0;
	}
	if (Class303.aClass303_3396 == aClass303_3583)
	    Class335.method5858(true, (byte) -115);
	if (Class303.aClass303_3397 == aClass303_3583) {
	    Class159.aClass295_1755.method5346((byte) 1);
	    try {
		aThread3581.join();
	    } catch (InterruptedException interruptedexception) {
		return 0;
	    }
	    Class159.aClass295_1755 = null;
	    aThread3581 = null;
	    aClass458_3577 = null;
	    Class653.aClass458_8393 = null;
	    aClass91_3579 = null;
	    anInterface32Array3585 = null;
	    EmitterConfig.aMap11727.remove(Class56.aClass56_587);
	    EmitterConfig.aMap11727.remove(Class56.aClass56_595);
	    EmitterConfig.aMap11727.remove(Class56.aClass56_580);
	    Class519.method8661((byte) 0);
	    client.aBool11063
		= Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub29_10722
		      .method17240(-1007996945) == 1;
	    Class198_Sub13.aClass525_Sub30_9973.method16502
		(Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub29_10722, 1,
		 (byte) -80);
	    if (client.aBool11063)
		Class198_Sub13.aClass525_Sub30_9973.method16502
		    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub20_10701,
		     0, (byte) -82);
	    else if ((Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub20_10701
		      .aBool10927)
		     && (-1113722213 * Class31.aClass525_Sub36_305.anInt10806
			 < 512)
		     && (Class31.aClass525_Sub36_305.anInt10806 * -1113722213
			 != 0))
		Class198_Sub13.aClass525_Sub30_9973.method16502
		    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub20_10701,
		     0, (byte) -21);
	    Class650.method10715(-1758466106);
	    if (client.aBool11063) {
		Class217.method4146(0, false, (byte) -7);
		if (!client.aBool11333)
		    Class217.method4141(Class68.aClass68_723, -2032311314);
	    } else {
		Class217.method4146(Class198_Sub13.aClass525_Sub30_9973
					.aClass696_Sub20_10701
					.method17160(-513214274),
				    false, (byte) 3);
		if (Class198_Sub13.aClass525_Sub30_9973
			.aClass696_Sub20_10701.method17160(-1189247287)
		    == 0)
		    Class217.method4141(Class68.aClass68_727, -1924585487);
	    }
	    Class332_Sub1.method15672(Class198_Sub13.aClass525_Sub30_9973
					  .aClass696_Sub41_10704
					  .method17337(822413085),
				      -1, -1, false, (byte) -36);
	    Class7.aClass404_53.method6581(client.anInterface50_11252,
					   (byte) 59);
	    Class495.method8130(Class501.aClass182_5564, 534531211);
	    Class62.method1376(Class501.aClass182_5564,
			       Class462.aClass458_5095, (short) -18722);
	}
	return Class241.method4438(92462132);
    }
    
    static int method5791() {
	if (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub29_10722
		.method17240(-947513758)
	    == 0) {
	    for (int i = 0; i < 1230768119 * client.anInt11102; i++) {
		if ((client.anInterface64Array11103[i].method420((byte) 36)
		     == 's')
		    || (client.anInterface64Array11103[i].method420((byte) 94)
			== 'S')) {
		    Class198_Sub13.aClass525_Sub30_9973.method16502
			((Class198_Sub13.aClass525_Sub30_9973
			  .aClass696_Sub29_10722),
			 1, (byte) -36);
		    client.aBool11333 = true;
		    Class217.method4141(Class68.aClass68_732, -1925068492);
		    break;
		}
	    }
	}
	if (aClass303_3583 == Class303.aClass303_3386) {
	    if (Class442.aClass459_4866 == null)
		Class442.aClass459_4866
		    = new Class459(Class94.aClass463_912,
				   Class198_Sub17.aClass470_9982,
				   Class526.aClass466_7131,
				   Class38.aBigInteger325,
				   Class38.aBigInteger327);
	    if (!Class442.aClass459_4866.method7572((byte) 28))
		return 0;
	    Class6.method557(0, null, true, (short) -25209);
	    Class302.aBool3380 = !Class696_Sub38.method17317((byte) 10);
	    aClass458_3577
		= Class600.method9890((Class302.aBool3380
				       ? Class56.aClass56_580
				       : Class56.aClass56_595),
				      false, 1, true, true, (byte) 1);
	    Class653.aClass458_8393
		= Class600.method9890(Class56.aClass56_587, false, 1, true,
				      true, (byte) 1);
	    Class276.aClass458_2875
		= Class600.method9890(Class56.aClass56_577, false, 1, true,
				      true, (byte) 1);
	    Class18.aClass458_204
		= Class600.method9890(Class56.aClass56_591, true, 1, true,
				      true, (byte) 1);
	}
	if (Class303.aClass303_3382 == aClass303_3583) {
	    boolean bool = Class653.aClass458_8393.method7481((short) 9316);
	    boolean bool_16_ = Class18.aClass458_204.method7481((short) 21431);
	    int i = Class652_Sub2.aClass454_Sub1Array10916
			[Class56.aClass56_587.method1202(1593371075)]
			.method16000((byte) 1);
	    i = i + Class652_Sub2.aClass454_Sub1Array10916
			[(Class302.aBool3380
			  ? Class56.aClass56_580.method1202(1285763522)
			  : Class56.aClass56_595.method1202(1306738162))]
			.method16000((byte) 1);
	    i += Class652_Sub2.aClass454_Sub1Array10916
		     [Class56.aClass56_577.method1202(1218649209)]
		     .method16000((byte) 1);
	    i = i + (bool_16_ ? 100
		     : Class18.aClass458_204.method7483((byte) 96));
	    i = i + (bool ? 100
		     : Class653.aClass458_8393.method7483((byte) 7));
	    if (i != 500)
		return i / 5;
	    Class138.aClass631_1641 = new Class631(Class18.aClass458_204);
	    Class287.method5259(Class138.aClass631_1641, 1607839506);
	    int i_17_ = Class198_Sub13.aClass525_Sub30_9973
			    .aClass696_Sub38_10721.method17314(860970548);
	    aClass91_3579
		= new Class91(client.aClass668_11090, Class21.aClass666_213,
			      Class653.aClass458_8393);
	    Class73[] class73s = aClass91_3579.method1692(i_17_, 1662918528);
	    if (0 == class73s.length)
		class73s = aClass91_3579.method1692(0, -1127407482);
	    Class315 class315
		= new Class315(aClass458_3577, Class276.aClass458_2875);
	    if (class73s.length > 0) {
		anInterface32Array3585 = new Interface32[class73s.length];
		for (int i_18_ = 0; i_18_ < anInterface32Array3585.length;
		     i_18_++)
		    anInterface32Array3585[i_18_]
			= new Class293(aClass91_3579.method1690(((class73s
								  [i_18_]
								  .anInt819)
								 * -51016315),
								304193221),
				       class73s[i_18_].anInt817 * 1859675235,
				       -189436045 * class73s[i_18_].anInt818,
				       class315);
	    }
	}
	if (aClass303_3583 == Class303.aClass303_3383)
	    Class7.aClass404_53
		= new Class404(Class501.aClass182_5564, aClass458_3577,
			       Class276.aClass458_2875,
			       Class525_Sub42.method16882((short) 12572));
	if (Class303.aClass303_3393 == aClass303_3583) {
	    int i = Class7.aClass404_53.method6602(248115685);
	    int i_19_ = Class7.aClass404_53.method6595(-1591047126);
	    if (i < i_19_)
		return i * 100 / i_19_;
	}
	if (aClass303_3583 == Class303.aClass303_3398) {
	    if (null != anInterface32Array3585
		&& anInterface32Array3585.length > 0) {
		if (anInterface32Array3585[0].method202(-1318175184) < 100)
		    return 0;
		if (anInterface32Array3585.length > 1
		    && aClass91_3579.method1695(-527910033)
		    && anInterface32Array3585[1].method202(-1318175184) < 100)
		    return 0;
	    }
	    Class7.aClass404_53.method6581(client.anInterface50_11252,
					   (byte) 30);
	    Class495.method8130(Class501.aClass182_5564, 534531211);
	    Class441.method7119(5, -1014422887);
	}
	if (aClass303_3583 == Class303.aClass303_3402) {
	    Class462.aClass458_5095
		= Class600.method9890(Class56.idx_8, false, 1, false,
				      true, (byte) 1);
	    Class163_Sub2.aClass458_8988
		= Class600.method9890(Class56.idx_0, false, 1, false,
				      true, (byte) 1);
	    Class629.aClass458_8162
		= Class600.method9890(Class56.idx_1, false, 1, false,
				      true, (byte) 1);
	    Class316.aClass458_3497
		= Class600.method9890(Class56.idx_2, false, 1, true,
				      true, (byte) 1);
	    Class555.aClass458_7460
		= Class600.method9890(Class56.aClass56_581, false, 1, true,
				      true, (byte) 1);
	    Class175_Sub4.aClass458_9940
		= Class600.method9890(Class56.idx_3, false, 1, true,
				      true, (byte) 1);
	    Class322.aClass458_3549
		= Class600.method9890(Class56.idx_5, true, 1, false,
				      true, (byte) 1);
	    WorldTile.aClass458_705
		= Class600.method9890(Class56.idx_7, false, 1, false,
				      true, (byte) 1);
	    Class198_Sub19.aClass458_9994
		= Class600.method9890(Class56.aClass56_594, true, 1, false,
				      true, (byte) 1);
	    Class113.aClass458_1390
		= Class600.method9890(Class56.aClass56_603, true, 1, false,
				      true, (byte) 1);
	    Class110.aClass458_1370
		= Class600.method9890(Class56.aClass56_612, false, 1, false,
				      true, (byte) 1);
	    Class112.aClass458_1386
		= Class600.method9890(Class56.aClass56_583, false, 1, true,
				      true, (byte) 1);
	    Class307.aClass458_3417
		= Class600.method9890(Class56.aClass56_593, true, 1, false,
				      false, (byte) 1);
	    Class263.aClass458_2801
		= Class600.method9890(Class56.aClass56_599, true, 1, false,
				      false, (byte) 1);
	    Class27.aClass458_282
		= Class600.method9890(Class56.aClass56_579, false, 1, true,
				      true, (byte) 1);
	    Class138.aClass458_1640
		= Class600.method9890(Class56.aClass56_575, false, 1, true,
				      true, (byte) 1);
	    Class47.aClass458_363
		= Class600.method9890(Class56.aClass56_578, false, 1, true,
				      true, (byte) 1);
	    Class198_Sub2.aClass458_9905
		= Class600.method9890(Class56.aClass56_585, false, 1, true,
				      true, (byte) 1);
	    Class297.aClass458_3274
		= Class600.method9890(Class56.aClass56_573, false, 1, true,
				      true, (byte) 1);
	    Class220.aClass458_2330
		= Class600.method9890(Class56.aClass56_584, false, 1, true,
				      true, (byte) 1);
	    Class350_Sub2.aClass458_10224
		= Class600.method9890(Class56.aClass56_608, false, 1, true,
				      true, (byte) 1);
	    ItemDefinitions.aClass458_136
		= Class600.method9890(Class56.aClass56_586, true, 1, false,
				      false, (byte) 1);
	    Class597.aClass458_7845
		= Class600.method9890(Class56.aClass56_600, true, 1, false,
				      true, (byte) 1);
	    Class174.aClass458_1862
		= Class600.method9890(Class56.aClass56_590, false, 1, true,
				      true, (byte) 1);
	    Class427.aClass458_4806
		= Class600.method9890(Class56.aClass56_588, false, 1, true,
				      true, (byte) 1);
	    Class40_Sub22.aClass458_11051
		= Class600.method9890(Class56.aClass56_589, true, 1, true,
				      true, (byte) 1);
	    BillBoardDefinitions.aClass458_5605
		= Class600.method9890(Class56.aClass56_572, false, 1, true,
				      true, (byte) 1);
	    Class198_Sub15.aClass458_9976
		= Class600.method9890(Class56.aClass56_592, false, 1, true,
				      true, (byte) 1);
	    Class656_Sub1_Sub3_Sub3.aClass458_12048
		= Class600.method9890(Class56.aClass56_598, true, 1, false,
				      true, (byte) 1);
	    Class566.aClass458_7604
		= Class600.method9890(Class56.aClass56_576, true, 1, false,
				      true, (byte) 1);
	    Class17_Sub1.aClass458_11027
		= Class600.method9890(Class56.aClass56_596, true, 1, true,
				      true, (byte) 1);
	}
	if (aClass303_3583 == Class303.aClass303_3387) {
	    int i = 0;
	    int i_20_ = 0;
	    for (int i_21_ = 0;
		 i_21_ < Class652_Sub2.aClass454_Sub1Array10916.length;
		 i_21_++) {
		if (null != Class652_Sub2.aClass454_Sub1Array10916[i_21_]) {
		    i += Class652_Sub2.aClass454_Sub1Array10916[i_21_]
			     .method16000((byte) 1);
		    i_20_++;
		}
	    }
	    if (i_20_ > 0)
		i /= i_20_;
	    if (100 != i) {
		if (anInt3586 * 1817240471 < 0)
		    anInt3586 = 509070375 * i;
		return ((i - anInt3586 * 1817240471) * 100
			/ (100 - anInt3586 * 1817240471));
	    }
	    Class632.method10322(Class138.aClass631_1641, (byte) 96);
	    Class7.aClass404_53
		= new Class404(Class501.aClass182_5564,
			       Class462.aClass458_5095,
			       Class276.aClass458_2875,
			       Class525_Sub42.method16882((short) 18429));
	}
	if (aClass303_3583 == Class303.aClass303_3381) {
	    byte[] is
		= Class18.aClass458_204.getTextureData((Class638.aClass638_8309
						    .anInt8316) * 2028004077,
						   1847342746);
	    if (is == null)
		return 0;
	    Class40_Sub20.aClass217_11050 = new Class217();
	    Class40_Sub20.aClass217_11050.method4027(50, 7340032, (byte) 56);
	    Class704_Sub2.method17395(is, (byte) 15);
	    Class441.method7119(19, -1538745845);
	}
	if (Class303.aClass303_3389 == aClass303_3583
	    && null == Class312_Sub1.aClass544_10064) {
	    Class312_Sub1.aClass544_10064
		= new Class544(Class566.aClass458_7604);
	    Class603.method9980(Class312_Sub1.aClass544_10064, (short) 387);
	}
	if (aClass303_3583 == Class303.aClass303_3390) {
	    int i = Class313.method5643(1298049481);
	    if (i < 100)
		return i;
	    Class601.method9900
		(Class18.aClass458_204.getTextureData(2028004077 * (Class638
								.aClass638_8308
								.anInt8316),
						  1230591315),
		 -1440816535);
	    Class198_Sub18.aShortArrayArray9988
		= Class138.aClass631_1641.aShortArrayArray8182;
	    Class525_Sub6.aShortArrayArrayArray10485
		= Class138.aClass631_1641.aShortArrayArrayArray8183;
	    Class477.aShortArrayArray5199
		= Class138.aClass631_1641.aShortArrayArray8184;
	    Class522_Sub1.aShortArrayArrayArray10395
		= Class138.aClass631_1641.aShortArrayArrayArray8186;
	    if (-1085475287 * Class138.aClass631_1641.anInt8190 != -1
		&& -1 != Class138.aClass631_1641.anInt8209 * -1544174753) {
		client.anInt11223
		    = Class138.aClass631_1641.anInt8190 * -1267057803;
		client.anInt11224
		    = -1878792483 * Class138.aClass631_1641.anInt8209;
	    }
	    Class664.aClass634_8557 = new Class634(Class18.aClass458_204);
	    Class91.aClass629_903 = new Class629(Class18.aClass458_204);
	    Class525_Sub22_Sub1.aClass632_11646
		= new Class632(Class18.aClass458_204);
	    Class685.aClass630_8692 = new Class630(Class18.aClass458_204);
	    Class556.aClass623_7468 = new Class623(Class18.aClass458_204);
	}
	if (Class303.aClass303_3384 == aClass303_3583) {
	    if (1728284569 * Class138.aClass631_1641.anInt8175 != -1
		&& !WorldTile.aClass458_705.method7478((Class138.aClass631_1641
						      .anInt8175) * 1728284569,
						     0, (short) 10283))
		return 99;
	    Class166.aClass180_1835
		= new Class180(Class40_Sub22.aClass458_11051);
	    Class411.anInterface24_4255
		= new Class172_Sub1(Class198_Sub19.aClass458_9994,
				    Class113.aClass458_1390);
	    client.aClass40_Sub16_11201
		= new Class40_Sub16(client.aClass668_11090,
				    Class21.aClass666_213,
				    Class316.aClass458_3497);
	    Class227.aClass40_Sub1_2345
		= new Class40_Sub1(client.aClass668_11090,
				   Class21.aClass666_213,
				   Class316.aClass458_3497);
	    Class635.aClass40_Sub6_8274
		= new Class40_Sub6(client.aClass668_11090,
				   Class21.aClass666_213,
				   Class316.aClass458_3497,
				   Class462.aClass458_5095);
	    Class486.aClass40_5240
		= new Class40(client.aClass668_11090, Class21.aClass666_213,
			      Class316.aClass458_3497, Class663.aClass663_8516,
			      64, new Class45(com.jagex.Class14.class));
	    Class685.aClass40_8690
		= new Class40(client.aClass668_11090, Class21.aClass666_213,
			      Class316.aClass458_3497, Class663.aClass663_8515,
			      16, new Class45(com.jagex.Class82.class));
	    Class525_Sub22.aClass40_Sub15_10585
		= new Class40_Sub15(client.aClass668_11090,
				    Class21.aClass666_213,
				    Class138.aClass458_1640);
	    Class232.aClass40_Sub18_2368
		= new Class40_Sub18(client.aClass668_11090,
				    Class21.aClass666_213,
				    Class316.aClass458_3497);
	    Class198_Sub17.aClass40_Sub14_9981
		= new Class40_Sub14(client.aClass668_11090,
				    Class21.aClass666_213,
				    Class316.aClass458_3497);
	    Class83.aClass40_Sub12_852
		= new Class40_Sub12(client.aClass668_11090,
				    Class21.aClass666_213,
				    Class316.aClass458_3497,
				    Class462.aClass458_5095);
	    Class566.aClass40_Sub5_7605
		= new Class40_Sub5(client.aClass668_11090,
				   Class21.aClass666_213,
				   Class316.aClass458_3497,
				   Class462.aClass458_5095);
	    Class38.aClass40_Sub9_328
		= new Class40_Sub9(client.aClass668_11090,
				   Class21.aClass666_213,
				   Class316.aClass458_3497,
				   WorldTile.aClass458_705);
	    Class612.aClass40_Sub19_8026
		= new Class40_Sub19(client.aClass668_11090,
				    Class21.aClass666_213,
				    Class316.aClass458_3497);
	    client.aClass40_Sub21_11118
		= new Class40_Sub21(client.aClass668_11090,
				    Class21.aClass666_213,
				    Class316.aClass458_3497);
	    Class642.aClass40_Sub11_8327
		= new Class40_Sub11(client.aClass668_11090,
				    Class21.aClass666_213, true,
				    Class27.aClass458_282,
				    WorldTile.aClass458_705);
	    client.aClass507_11137.method8398(Class642.aClass40_Sub11_8327,
					      1804784598);
	    Class45.aClass500_349.method8178
		(new Class40_Sub11(client.aClass668_11090,
				   Class21.aClass666_213, true,
				   Class27.aClass458_282,
				   WorldTile.aClass458_705),
		 670623084);
	    Class698.aClass40_Sub2_8770
		= new Class40_Sub2(client.aClass668_11090,
				   Class21.aClass666_213,
				   Class316.aClass458_3497,
				   Class462.aClass458_5095);
	    Class568.aClass40_Sub17_7627
		= new Class40_Sub17(client.aClass668_11090,
				    Class21.aClass666_213,
				    Class316.aClass458_3497,
				    Class462.aClass458_5095);
	    Class168_Sub1.aClass40_Sub7_9112
		= new Class40_Sub7(client.aClass668_11090,
				   Class21.aClass666_213, true,
				   Class47.aClass458_363,
				   WorldTile.aClass458_705);
	    Class313_Sub2.aClass40_Sub22_10106
		= new Class40_Sub22(client.aClass668_11090,
				    Class21.aClass666_213, true,
				    client.aClass40_Sub16_11201,
				    Class198_Sub2.aClass458_9905,
				    WorldTile.aClass458_705);
	    Class249.aClass47_Sub1_2445
		= new Class47_Sub1(client.aClass668_11090,
				   Class21.aClass666_213,
				   Class316.aClass458_3497, true);
	    Class163_Sub2.aClass40_Sub13_8989
		= new Class40_Sub13(client.aClass668_11090,
				    Class21.aClass666_213,
				    Class316.aClass458_3497);
	    Class685.aClass40_Sub8_8691
		= new Class40_Sub8(client.aClass668_11090,
				   Class21.aClass666_213,
				   Class297.aClass458_3274,
				   Class163_Sub2.aClass458_8988,
				   Class629.aClass458_8162,
				   Class163_Sub2.aClass40_Sub13_8989);
	    Class658.aClass40_Sub3_8457
		= new Class40_Sub3(client.aClass668_11090,
				   Class21.aClass666_213,
				   Class316.aClass458_3497);
	    Class539.aClass40_Sub4_7181
		= new Class40_Sub4(client.aClass668_11090,
				   Class21.aClass666_213,
				   Class316.aClass458_3497);
	    Class574.aClass40_Sub20_7645
		= new Class40_Sub20(client.aClass668_11090,
				    Class21.aClass666_213,
				    Class220.aClass458_2330,
				    WorldTile.aClass458_705);
	    Class397.aClass47_Sub2_4113
		= new Class47_Sub2(client.aClass668_11090,
				   Class21.aClass666_213,
				   Class350_Sub2.aClass458_10224, true);
	    Class198_Sub4.aClass106_Sub1_Sub2_9917
		= new Class106_Sub1_Sub2(client.aClass668_11090,
					 Class453.aClass453_4940,
					 Class21.aClass666_213,
					 Class316.aClass458_3497);
	    Class109.aClass106_Sub1_Sub1_1323
		= new Class106_Sub1_Sub1(client.aClass668_11090,
					 Class453.aClass453_4939,
					 Class21.aClass666_213,
					 Class316.aClass458_3497);
	    Class293.aClass106_Sub1_Sub2_3239
		= new Class106_Sub1_Sub2(client.aClass668_11090,
					 Class453.aClass453_4943,
					 Class21.aClass666_213,
					 Class316.aClass458_3497);
	    Class711.aClass106_Sub1_Sub2_8869
		= new Class106_Sub1_Sub2(client.aClass668_11090,
					 Class453.aClass453_4944,
					 Class21.aClass666_213,
					 Class316.aClass458_3497);
	    Class535.aClass106_Sub1_Sub2_7176
		= new Class106_Sub1_Sub2(client.aClass668_11090,
					 Class453.aClass453_4945,
					 Class21.aClass666_213,
					 Class316.aClass458_3497);
	    Class198_Sub20.aClass106_Sub1_Sub2_9998
		= new Class106_Sub1_Sub2(client.aClass668_11090,
					 Class453.aClass453_4947,
					 Class21.aClass666_213,
					 Class316.aClass458_3497);
	    Class234.aClass106_Sub1_Sub2_2373
		= new Class106_Sub1_Sub2(client.aClass668_11090,
					 Class453.aClass453_4948,
					 Class21.aClass666_213,
					 Class316.aClass458_3497);
	    Class144_Sub1.aMap9140
		= Class390.method6474((new Class106_Sub1[]
				       { (Class198_Sub4
					  .aClass106_Sub1_Sub2_9917),
					 Class109.aClass106_Sub1_Sub1_1323,
					 Class293.aClass106_Sub1_Sub2_3239,
					 Class711.aClass106_Sub1_Sub2_8869,
					 Class535.aClass106_Sub1_Sub2_7176,
					 (Class198_Sub20
					  .aClass106_Sub1_Sub2_9998),
					 Class234.aClass106_Sub1_Sub2_2373 }),
				      2144899446);
	    Class575.aClass40_Sub10_7647
		= new Class40_Sub10(client.aClass668_11090,
				    Class21.aClass666_213,
				    Class316.aClass458_3497,
				    Class144_Sub1.aMap9140);
	    Class607.anInterface20_7975 = new Class306();
	    Class648.method10704(Class175_Sub4.aClass458_9940,
				 WorldTile.aClass458_705,
				 Class462.aClass458_5095,
				 Class276.aClass458_2875, 732703645);
	    Class628.aClass385_8157
		= new Class385(Class198_Sub15.aClass458_9976);
	    Class450.aClass400_4926 = new Class400(BillBoardDefinitions.aClass458_5605);
	    Class263.aClass402_2799 = new Class402(BillBoardDefinitions.aClass458_5605);
	    Class562.aClass471_7557
		= new Class471(Class21.aClass666_213, Class174.aClass458_1862,
			       Class427.aClass458_4806);
	    Class215.aClass58_2283
		= new ConfigEntry(Class21.aClass666_213, Class174.aClass458_1862,
			      Class427.aClass458_4806, new Class386());
	    Class532.aClass111_7170
		= new Class111(Class109.aClass106_Sub1_Sub1_1323,
			       Class575.aClass40_Sub10_7647,
			       Class91.aClass629_903.method10288(1744135554));
	    Class424.method6769(-1852050786);
	    Class46.method1093(Class685.aClass40_Sub8_8691, 65535);
	    Class198_Sub14.method15653(Class263.aClass402_2799,
				       Class450.aClass400_4926, -1573360652);
	    Class164.method2664(WorldTile.aClass458_705, Class166.aClass180_1835,
				Class411.anInterface24_4255, (byte) 6);
	    Class279 class279
		= new Class279(Class110.aClass458_1370
				   .method7495("huffman", "", -274909631));
	    Class493.method7998(class279, -390000135);
	    Class19.aClass511_206 = Class567.method9490(-80488365);
	    Class31.aClass525_Sub36_305 = new Class525_Sub36(true);
	}
	if (Class303.aClass303_3392 == aClass303_3583) {
	    int i = (Class451.method7339(Class462.aClass458_5095, -411066087)
		     + Class7.aClass404_53.method6577(true, -1421490166));
	    int i_22_ = (Class87.method1659(940824348)
			 + Class7.aClass404_53.method6595(-1591047126));
	    if (i < i_22_)
		return i * 100 / i_22_;
	}
	if (Class303.aClass303_3400 == aClass303_3583)
	    Class556.method9244(ItemDefinitions.aClass458_136, Class597.aClass458_7845,
				Class232.aClass40_Sub18_2368,
				Class198_Sub17.aClass40_Sub14_9981,
				client.aClass507_11137.method8362((byte) -1),
				Class698.aClass40_Sub2_8770,
				Class568.aClass40_Sub17_7627,
				Class532.aClass111_7170,
				Class532.aClass111_7170);
	if (Class303.aClass303_3394 == aClass303_3583) {
	    Class309.aClass144_Sub1_3465
		= new Class144_Sub1(Class198_Sub4.aClass106_Sub1_Sub2_9917);
	    Class407.method6637((byte) 0);
	    Class424.aClass52_4742 = Class238.method4416((byte) -26);
	    Class322.aClass458_3549.method7547(false, true, -303480867);
	    Class462.aClass458_5095.method7547(true, true, -1815475703);
	    Class276.aClass458_2875.method7547(true, true, -1148108701);
	    Class110.aClass458_1370.method7547(true, true, -745231790);
	    client.aBool11199 = true;
	}
	if (aClass303_3583 == Class303.aClass303_3395
	    && -1 != 1089481059 * Class138.aClass631_1641.anInt8176) {
	    if (!Class165.method2667((Class138.aClass631_1641.anInt8176
				      * 1089481059),
				     null, -616517521))
		return 0;
	    boolean bool = true;
	    for (int i = 0;
		 i < (Class162.aClass245Array1764
		      [Class138.aClass631_1641.anInt8176 * 1089481059]
		      .aClass259Array2426).length;
		 i++) {
		Class259 class259
		    = (Class162.aClass245Array1764
		       [1089481059 * Class138.aClass631_1641.anInt8176]
		       .aClass259Array2426[i]);
		if (5 == 2010235789 * class259.anInt2590
		    && class259.anInt2621 * 1940882535 != -1
		    && !Class462.aClass458_5095.method7478((class259.anInt2621
							    * 1940882535),
							   0, (short) 13117))
		    bool = false;
	    }
	    if (!bool)
		return 0;
	}
	if (Class303.aClass303_3396 == aClass303_3583)
	    Class335.method5858(true, (byte) -92);
	if (Class303.aClass303_3397 == aClass303_3583) {
	    Class159.aClass295_1755.method5346((byte) 1);
	    try {
		aThread3581.join();
	    } catch (InterruptedException interruptedexception) {
		return 0;
	    }
	    Class159.aClass295_1755 = null;
	    aThread3581 = null;
	    aClass458_3577 = null;
	    Class653.aClass458_8393 = null;
	    aClass91_3579 = null;
	    anInterface32Array3585 = null;
	    EmitterConfig.aMap11727.remove(Class56.aClass56_587);
	    EmitterConfig.aMap11727.remove(Class56.aClass56_595);
	    EmitterConfig.aMap11727.remove(Class56.aClass56_580);
	    Class519.method8661((byte) 0);
	    client.aBool11063
		= Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub29_10722
		      .method17240(-98571762) == 1;
	    Class198_Sub13.aClass525_Sub30_9973.method16502
		(Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub29_10722, 1,
		 (byte) -123);
	    if (client.aBool11063)
		Class198_Sub13.aClass525_Sub30_9973.method16502
		    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub20_10701,
		     0, (byte) -121);
	    else if ((Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub20_10701
		      .aBool10927)
		     && (-1113722213 * Class31.aClass525_Sub36_305.anInt10806
			 < 512)
		     && (Class31.aClass525_Sub36_305.anInt10806 * -1113722213
			 != 0))
		Class198_Sub13.aClass525_Sub30_9973.method16502
		    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub20_10701,
		     0, (byte) -76);
	    Class650.method10715(-1758466106);
	    if (client.aBool11063) {
		Class217.method4146(0, false, (byte) -68);
		if (!client.aBool11333)
		    Class217.method4141(Class68.aClass68_723, -1961167942);
	    } else {
		Class217.method4146(Class198_Sub13.aClass525_Sub30_9973
					.aClass696_Sub20_10701
					.method17160(1325923454),
				    false, (byte) -20);
		if (Class198_Sub13.aClass525_Sub30_9973
			.aClass696_Sub20_10701.method17160(-773605204)
		    == 0)
		    Class217.method4141(Class68.aClass68_727, -1948469285);
	    }
	    Class332_Sub1.method15672(Class198_Sub13.aClass525_Sub30_9973
					  .aClass696_Sub41_10704
					  .method17337(1554222175),
				      -1, -1, false, (byte) 61);
	    Class7.aClass404_53.method6581(client.anInterface50_11252,
					   (byte) 12);
	    Class495.method8130(Class501.aClass182_5564, 534531211);
	    Class62.method1376(Class501.aClass182_5564,
			       Class462.aClass458_5095, (short) 12122);
	}
	return Class241.method4438(-806100577);
    }
    
    public static int method5792() {
	return Class159.aClass295_1755.method5315((short) 999);
    }
    
    static int method5793() {
	if (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub29_10722
		.method17240(-961027699)
	    == 0) {
	    for (int i = 0; i < 1230768119 * client.anInt11102; i++) {
		if ((client.anInterface64Array11103[i].method420((byte) 20)
		     == 's')
		    || (client.anInterface64Array11103[i].method420((byte) 43)
			== 'S')) {
		    Class198_Sub13.aClass525_Sub30_9973.method16502
			((Class198_Sub13.aClass525_Sub30_9973
			  .aClass696_Sub29_10722),
			 1, (byte) -61);
		    client.aBool11333 = true;
		    Class217.method4141(Class68.aClass68_732, -1963545288);
		    break;
		}
	    }
	}
	if (aClass303_3583 == Class303.aClass303_3386) {
	    if (Class442.aClass459_4866 == null)
		Class442.aClass459_4866
		    = new Class459(Class94.aClass463_912,
				   Class198_Sub17.aClass470_9982,
				   Class526.aClass466_7131,
				   Class38.aBigInteger325,
				   Class38.aBigInteger327);
	    if (!Class442.aClass459_4866.method7572((byte) 126))
		return 0;
	    Class6.method557(0, null, true, (short) -13950);
	    Class302.aBool3380 = !Class696_Sub38.method17317((byte) 3);
	    aClass458_3577
		= Class600.method9890((Class302.aBool3380
				       ? Class56.aClass56_580
				       : Class56.aClass56_595),
				      false, 1, true, true, (byte) 1);
	    Class653.aClass458_8393
		= Class600.method9890(Class56.aClass56_587, false, 1, true,
				      true, (byte) 1);
	    Class276.aClass458_2875
		= Class600.method9890(Class56.aClass56_577, false, 1, true,
				      true, (byte) 1);
	    Class18.aClass458_204
		= Class600.method9890(Class56.aClass56_591, true, 1, true,
				      true, (byte) 1);
	}
	if (Class303.aClass303_3382 == aClass303_3583) {
	    boolean bool = Class653.aClass458_8393.method7481((short) 6915);
	    boolean bool_23_
		= Class18.aClass458_204.method7481((short) -11857);
	    int i = Class652_Sub2.aClass454_Sub1Array10916
			[Class56.aClass56_587.method1202(1524258971)]
			.method16000((byte) 1);
	    i = i + Class652_Sub2.aClass454_Sub1Array10916
			[(Class302.aBool3380
			  ? Class56.aClass56_580.method1202(887736729)
			  : Class56.aClass56_595.method1202(423474748))]
			.method16000((byte) 1);
	    i += Class652_Sub2.aClass454_Sub1Array10916
		     [Class56.aClass56_577.method1202(2034885614)]
		     .method16000((byte) 1);
	    i = i + (bool_23_ ? 100
		     : Class18.aClass458_204.method7483((byte) 42));
	    i = i + (bool ? 100
		     : Class653.aClass458_8393.method7483((byte) 116));
	    if (i != 500)
		return i / 5;
	    Class138.aClass631_1641 = new Class631(Class18.aClass458_204);
	    Class287.method5259(Class138.aClass631_1641, 977982594);
	    int i_24_ = Class198_Sub13.aClass525_Sub30_9973
			    .aClass696_Sub38_10721.method17314(319277833);
	    aClass91_3579
		= new Class91(client.aClass668_11090, Class21.aClass666_213,
			      Class653.aClass458_8393);
	    Class73[] class73s = aClass91_3579.method1692(i_24_, -843096655);
	    if (0 == class73s.length)
		class73s = aClass91_3579.method1692(0, 1821927724);
	    Class315 class315
		= new Class315(aClass458_3577, Class276.aClass458_2875);
	    if (class73s.length > 0) {
		anInterface32Array3585 = new Interface32[class73s.length];
		for (int i_25_ = 0; i_25_ < anInterface32Array3585.length;
		     i_25_++)
		    anInterface32Array3585[i_25_]
			= new Class293(aClass91_3579.method1690(((class73s
								  [i_25_]
								  .anInt819)
								 * -51016315),
								304193221),
				       class73s[i_25_].anInt817 * 1859675235,
				       -189436045 * class73s[i_25_].anInt818,
				       class315);
	    }
	}
	if (aClass303_3583 == Class303.aClass303_3383)
	    Class7.aClass404_53
		= new Class404(Class501.aClass182_5564, aClass458_3577,
			       Class276.aClass458_2875,
			       Class525_Sub42.method16882((short) -15435));
	if (Class303.aClass303_3393 == aClass303_3583) {
	    int i = Class7.aClass404_53.method6602(248115685);
	    int i_26_ = Class7.aClass404_53.method6595(-1591047126);
	    if (i < i_26_)
		return i * 100 / i_26_;
	}
	if (aClass303_3583 == Class303.aClass303_3398) {
	    if (null != anInterface32Array3585
		&& anInterface32Array3585.length > 0) {
		if (anInterface32Array3585[0].method202(-1318175184) < 100)
		    return 0;
		if (anInterface32Array3585.length > 1
		    && aClass91_3579.method1695(-527910033)
		    && anInterface32Array3585[1].method202(-1318175184) < 100)
		    return 0;
	    }
	    Class7.aClass404_53.method6581(client.anInterface50_11252,
					   (byte) 56);
	    Class495.method8130(Class501.aClass182_5564, 534531211);
	    Class441.method7119(5, 447190026);
	}
	if (aClass303_3583 == Class303.aClass303_3402) {
	    Class462.aClass458_5095
		= Class600.method9890(Class56.idx_8, false, 1, false,
				      true, (byte) 1);
	    Class163_Sub2.aClass458_8988
		= Class600.method9890(Class56.idx_0, false, 1, false,
				      true, (byte) 1);
	    Class629.aClass458_8162
		= Class600.method9890(Class56.idx_1, false, 1, false,
				      true, (byte) 1);
	    Class316.aClass458_3497
		= Class600.method9890(Class56.idx_2, false, 1, true,
				      true, (byte) 1);
	    Class555.aClass458_7460
		= Class600.method9890(Class56.aClass56_581, false, 1, true,
				      true, (byte) 1);
	    Class175_Sub4.aClass458_9940
		= Class600.method9890(Class56.idx_3, false, 1, true,
				      true, (byte) 1);
	    Class322.aClass458_3549
		= Class600.method9890(Class56.idx_5, true, 1, false,
				      true, (byte) 1);
	    WorldTile.aClass458_705
		= Class600.method9890(Class56.idx_7, false, 1, false,
				      true, (byte) 1);
	    Class198_Sub19.aClass458_9994
		= Class600.method9890(Class56.aClass56_594, true, 1, false,
				      true, (byte) 1);
	    Class113.aClass458_1390
		= Class600.method9890(Class56.aClass56_603, true, 1, false,
				      true, (byte) 1);
	    Class110.aClass458_1370
		= Class600.method9890(Class56.aClass56_612, false, 1, false,
				      true, (byte) 1);
	    Class112.aClass458_1386
		= Class600.method9890(Class56.aClass56_583, false, 1, true,
				      true, (byte) 1);
	    Class307.aClass458_3417
		= Class600.method9890(Class56.aClass56_593, true, 1, false,
				      false, (byte) 1);
	    Class263.aClass458_2801
		= Class600.method9890(Class56.aClass56_599, true, 1, false,
				      false, (byte) 1);
	    Class27.aClass458_282
		= Class600.method9890(Class56.aClass56_579, false, 1, true,
				      true, (byte) 1);
	    Class138.aClass458_1640
		= Class600.method9890(Class56.aClass56_575, false, 1, true,
				      true, (byte) 1);
	    Class47.aClass458_363
		= Class600.method9890(Class56.aClass56_578, false, 1, true,
				      true, (byte) 1);
	    Class198_Sub2.aClass458_9905
		= Class600.method9890(Class56.aClass56_585, false, 1, true,
				      true, (byte) 1);
	    Class297.aClass458_3274
		= Class600.method9890(Class56.aClass56_573, false, 1, true,
				      true, (byte) 1);
	    Class220.aClass458_2330
		= Class600.method9890(Class56.aClass56_584, false, 1, true,
				      true, (byte) 1);
	    Class350_Sub2.aClass458_10224
		= Class600.method9890(Class56.aClass56_608, false, 1, true,
				      true, (byte) 1);
	    ItemDefinitions.aClass458_136
		= Class600.method9890(Class56.aClass56_586, true, 1, false,
				      false, (byte) 1);
	    Class597.aClass458_7845
		= Class600.method9890(Class56.aClass56_600, true, 1, false,
				      true, (byte) 1);
	    Class174.aClass458_1862
		= Class600.method9890(Class56.aClass56_590, false, 1, true,
				      true, (byte) 1);
	    Class427.aClass458_4806
		= Class600.method9890(Class56.aClass56_588, false, 1, true,
				      true, (byte) 1);
	    Class40_Sub22.aClass458_11051
		= Class600.method9890(Class56.aClass56_589, true, 1, true,
				      true, (byte) 1);
	    BillBoardDefinitions.aClass458_5605
		= Class600.method9890(Class56.aClass56_572, false, 1, true,
				      true, (byte) 1);
	    Class198_Sub15.aClass458_9976
		= Class600.method9890(Class56.aClass56_592, false, 1, true,
				      true, (byte) 1);
	    Class656_Sub1_Sub3_Sub3.aClass458_12048
		= Class600.method9890(Class56.aClass56_598, true, 1, false,
				      true, (byte) 1);
	    Class566.aClass458_7604
		= Class600.method9890(Class56.aClass56_576, true, 1, false,
				      true, (byte) 1);
	    Class17_Sub1.aClass458_11027
		= Class600.method9890(Class56.aClass56_596, true, 1, true,
				      true, (byte) 1);
	}
	if (aClass303_3583 == Class303.aClass303_3387) {
	    int i = 0;
	    int i_27_ = 0;
	    for (int i_28_ = 0;
		 i_28_ < Class652_Sub2.aClass454_Sub1Array10916.length;
		 i_28_++) {
		if (null != Class652_Sub2.aClass454_Sub1Array10916[i_28_]) {
		    i += Class652_Sub2.aClass454_Sub1Array10916[i_28_]
			     .method16000((byte) 1);
		    i_27_++;
		}
	    }
	    if (i_27_ > 0)
		i /= i_27_;
	    if (100 != i) {
		if (anInt3586 * 1817240471 < 0)
		    anInt3586 = 509070375 * i;
		return ((i - anInt3586 * 1817240471) * 100
			/ (100 - anInt3586 * 1817240471));
	    }
	    Class632.method10322(Class138.aClass631_1641, (byte) 96);
	    Class7.aClass404_53
		= new Class404(Class501.aClass182_5564,
			       Class462.aClass458_5095,
			       Class276.aClass458_2875,
			       Class525_Sub42.method16882((short) 1122));
	}
	if (aClass303_3583 == Class303.aClass303_3381) {
	    byte[] is
		= Class18.aClass458_204.getTextureData((Class638.aClass638_8309
						    .anInt8316) * 2028004077,
						   2004622064);
	    if (is == null)
		return 0;
	    Class40_Sub20.aClass217_11050 = new Class217();
	    Class40_Sub20.aClass217_11050.method4027(50, 7340032, (byte) 70);
	    Class704_Sub2.method17395(is, (byte) 15);
	    Class441.method7119(19, -504795705);
	}
	if (Class303.aClass303_3389 == aClass303_3583
	    && null == Class312_Sub1.aClass544_10064) {
	    Class312_Sub1.aClass544_10064
		= new Class544(Class566.aClass458_7604);
	    Class603.method9980(Class312_Sub1.aClass544_10064, (short) 15105);
	}
	if (aClass303_3583 == Class303.aClass303_3390) {
	    int i = Class313.method5643(1298049481);
	    if (i < 100)
		return i;
	    Class601.method9900
		(Class18.aClass458_204.getTextureData(2028004077 * (Class638
								.aClass638_8308
								.anInt8316),
						  1752501080),
		 -961432541);
	    Class198_Sub18.aShortArrayArray9988
		= Class138.aClass631_1641.aShortArrayArray8182;
	    Class525_Sub6.aShortArrayArrayArray10485
		= Class138.aClass631_1641.aShortArrayArrayArray8183;
	    Class477.aShortArrayArray5199
		= Class138.aClass631_1641.aShortArrayArray8184;
	    Class522_Sub1.aShortArrayArrayArray10395
		= Class138.aClass631_1641.aShortArrayArrayArray8186;
	    if (-1085475287 * Class138.aClass631_1641.anInt8190 != -1
		&& -1 != Class138.aClass631_1641.anInt8209 * -1544174753) {
		client.anInt11223
		    = Class138.aClass631_1641.anInt8190 * -1267057803;
		client.anInt11224
		    = -1878792483 * Class138.aClass631_1641.anInt8209;
	    }
	    Class664.aClass634_8557 = new Class634(Class18.aClass458_204);
	    Class91.aClass629_903 = new Class629(Class18.aClass458_204);
	    Class525_Sub22_Sub1.aClass632_11646
		= new Class632(Class18.aClass458_204);
	    Class685.aClass630_8692 = new Class630(Class18.aClass458_204);
	    Class556.aClass623_7468 = new Class623(Class18.aClass458_204);
	}
	if (Class303.aClass303_3384 == aClass303_3583) {
	    if (1728284569 * Class138.aClass631_1641.anInt8175 != -1
		&& !WorldTile.aClass458_705.method7478((Class138.aClass631_1641
						      .anInt8175) * 1728284569,
						     0, (short) 28875))
		return 99;
	    Class166.aClass180_1835
		= new Class180(Class40_Sub22.aClass458_11051);
	    Class411.anInterface24_4255
		= new Class172_Sub1(Class198_Sub19.aClass458_9994,
				    Class113.aClass458_1390);
	    client.aClass40_Sub16_11201
		= new Class40_Sub16(client.aClass668_11090,
				    Class21.aClass666_213,
				    Class316.aClass458_3497);
	    Class227.aClass40_Sub1_2345
		= new Class40_Sub1(client.aClass668_11090,
				   Class21.aClass666_213,
				   Class316.aClass458_3497);
	    Class635.aClass40_Sub6_8274
		= new Class40_Sub6(client.aClass668_11090,
				   Class21.aClass666_213,
				   Class316.aClass458_3497,
				   Class462.aClass458_5095);
	    Class486.aClass40_5240
		= new Class40(client.aClass668_11090, Class21.aClass666_213,
			      Class316.aClass458_3497, Class663.aClass663_8516,
			      64, new Class45(com.jagex.Class14.class));
	    Class685.aClass40_8690
		= new Class40(client.aClass668_11090, Class21.aClass666_213,
			      Class316.aClass458_3497, Class663.aClass663_8515,
			      16, new Class45(com.jagex.Class82.class));
	    Class525_Sub22.aClass40_Sub15_10585
		= new Class40_Sub15(client.aClass668_11090,
				    Class21.aClass666_213,
				    Class138.aClass458_1640);
	    Class232.aClass40_Sub18_2368
		= new Class40_Sub18(client.aClass668_11090,
				    Class21.aClass666_213,
				    Class316.aClass458_3497);
	    Class198_Sub17.aClass40_Sub14_9981
		= new Class40_Sub14(client.aClass668_11090,
				    Class21.aClass666_213,
				    Class316.aClass458_3497);
	    Class83.aClass40_Sub12_852
		= new Class40_Sub12(client.aClass668_11090,
				    Class21.aClass666_213,
				    Class316.aClass458_3497,
				    Class462.aClass458_5095);
	    Class566.aClass40_Sub5_7605
		= new Class40_Sub5(client.aClass668_11090,
				   Class21.aClass666_213,
				   Class316.aClass458_3497,
				   Class462.aClass458_5095);
	    Class38.aClass40_Sub9_328
		= new Class40_Sub9(client.aClass668_11090,
				   Class21.aClass666_213,
				   Class316.aClass458_3497,
				   WorldTile.aClass458_705);
	    Class612.aClass40_Sub19_8026
		= new Class40_Sub19(client.aClass668_11090,
				    Class21.aClass666_213,
				    Class316.aClass458_3497);
	    client.aClass40_Sub21_11118
		= new Class40_Sub21(client.aClass668_11090,
				    Class21.aClass666_213,
				    Class316.aClass458_3497);
	    Class642.aClass40_Sub11_8327
		= new Class40_Sub11(client.aClass668_11090,
				    Class21.aClass666_213, true,
				    Class27.aClass458_282,
				    WorldTile.aClass458_705);
	    client.aClass507_11137.method8398(Class642.aClass40_Sub11_8327,
					      1804784598);
	    Class45.aClass500_349.method8178
		(new Class40_Sub11(client.aClass668_11090,
				   Class21.aClass666_213, true,
				   Class27.aClass458_282,
				   WorldTile.aClass458_705),
		 1806922813);
	    Class698.aClass40_Sub2_8770
		= new Class40_Sub2(client.aClass668_11090,
				   Class21.aClass666_213,
				   Class316.aClass458_3497,
				   Class462.aClass458_5095);
	    Class568.aClass40_Sub17_7627
		= new Class40_Sub17(client.aClass668_11090,
				    Class21.aClass666_213,
				    Class316.aClass458_3497,
				    Class462.aClass458_5095);
	    Class168_Sub1.aClass40_Sub7_9112
		= new Class40_Sub7(client.aClass668_11090,
				   Class21.aClass666_213, true,
				   Class47.aClass458_363,
				   WorldTile.aClass458_705);
	    Class313_Sub2.aClass40_Sub22_10106
		= new Class40_Sub22(client.aClass668_11090,
				    Class21.aClass666_213, true,
				    client.aClass40_Sub16_11201,
				    Class198_Sub2.aClass458_9905,
				    WorldTile.aClass458_705);
	    Class249.aClass47_Sub1_2445
		= new Class47_Sub1(client.aClass668_11090,
				   Class21.aClass666_213,
				   Class316.aClass458_3497, true);
	    Class163_Sub2.aClass40_Sub13_8989
		= new Class40_Sub13(client.aClass668_11090,
				    Class21.aClass666_213,
				    Class316.aClass458_3497);
	    Class685.aClass40_Sub8_8691
		= new Class40_Sub8(client.aClass668_11090,
				   Class21.aClass666_213,
				   Class297.aClass458_3274,
				   Class163_Sub2.aClass458_8988,
				   Class629.aClass458_8162,
				   Class163_Sub2.aClass40_Sub13_8989);
	    Class658.aClass40_Sub3_8457
		= new Class40_Sub3(client.aClass668_11090,
				   Class21.aClass666_213,
				   Class316.aClass458_3497);
	    Class539.aClass40_Sub4_7181
		= new Class40_Sub4(client.aClass668_11090,
				   Class21.aClass666_213,
				   Class316.aClass458_3497);
	    Class574.aClass40_Sub20_7645
		= new Class40_Sub20(client.aClass668_11090,
				    Class21.aClass666_213,
				    Class220.aClass458_2330,
				    WorldTile.aClass458_705);
	    Class397.aClass47_Sub2_4113
		= new Class47_Sub2(client.aClass668_11090,
				   Class21.aClass666_213,
				   Class350_Sub2.aClass458_10224, true);
	    Class198_Sub4.aClass106_Sub1_Sub2_9917
		= new Class106_Sub1_Sub2(client.aClass668_11090,
					 Class453.aClass453_4940,
					 Class21.aClass666_213,
					 Class316.aClass458_3497);
	    Class109.aClass106_Sub1_Sub1_1323
		= new Class106_Sub1_Sub1(client.aClass668_11090,
					 Class453.aClass453_4939,
					 Class21.aClass666_213,
					 Class316.aClass458_3497);
	    Class293.aClass106_Sub1_Sub2_3239
		= new Class106_Sub1_Sub2(client.aClass668_11090,
					 Class453.aClass453_4943,
					 Class21.aClass666_213,
					 Class316.aClass458_3497);
	    Class711.aClass106_Sub1_Sub2_8869
		= new Class106_Sub1_Sub2(client.aClass668_11090,
					 Class453.aClass453_4944,
					 Class21.aClass666_213,
					 Class316.aClass458_3497);
	    Class535.aClass106_Sub1_Sub2_7176
		= new Class106_Sub1_Sub2(client.aClass668_11090,
					 Class453.aClass453_4945,
					 Class21.aClass666_213,
					 Class316.aClass458_3497);
	    Class198_Sub20.aClass106_Sub1_Sub2_9998
		= new Class106_Sub1_Sub2(client.aClass668_11090,
					 Class453.aClass453_4947,
					 Class21.aClass666_213,
					 Class316.aClass458_3497);
	    Class234.aClass106_Sub1_Sub2_2373
		= new Class106_Sub1_Sub2(client.aClass668_11090,
					 Class453.aClass453_4948,
					 Class21.aClass666_213,
					 Class316.aClass458_3497);
	    Class144_Sub1.aMap9140
		= Class390.method6474((new Class106_Sub1[]
				       { (Class198_Sub4
					  .aClass106_Sub1_Sub2_9917),
					 Class109.aClass106_Sub1_Sub1_1323,
					 Class293.aClass106_Sub1_Sub2_3239,
					 Class711.aClass106_Sub1_Sub2_8869,
					 Class535.aClass106_Sub1_Sub2_7176,
					 (Class198_Sub20
					  .aClass106_Sub1_Sub2_9998),
					 Class234.aClass106_Sub1_Sub2_2373 }),
				      2092017132);
	    Class575.aClass40_Sub10_7647
		= new Class40_Sub10(client.aClass668_11090,
				    Class21.aClass666_213,
				    Class316.aClass458_3497,
				    Class144_Sub1.aMap9140);
	    Class607.anInterface20_7975 = new Class306();
	    Class648.method10704(Class175_Sub4.aClass458_9940,
				 WorldTile.aClass458_705,
				 Class462.aClass458_5095,
				 Class276.aClass458_2875, -1527967873);
	    Class628.aClass385_8157
		= new Class385(Class198_Sub15.aClass458_9976);
	    Class450.aClass400_4926 = new Class400(BillBoardDefinitions.aClass458_5605);
	    Class263.aClass402_2799 = new Class402(BillBoardDefinitions.aClass458_5605);
	    Class562.aClass471_7557
		= new Class471(Class21.aClass666_213, Class174.aClass458_1862,
			       Class427.aClass458_4806);
	    Class215.aClass58_2283
		= new ConfigEntry(Class21.aClass666_213, Class174.aClass458_1862,
			      Class427.aClass458_4806, new Class386());
	    Class532.aClass111_7170
		= new Class111(Class109.aClass106_Sub1_Sub1_1323,
			       Class575.aClass40_Sub10_7647,
			       Class91.aClass629_903.method10288(842443380));
	    Class424.method6769(-1852050786);
	    Class46.method1093(Class685.aClass40_Sub8_8691, 65535);
	    Class198_Sub14.method15653(Class263.aClass402_2799,
				       Class450.aClass400_4926, -1573360652);
	    Class164.method2664(WorldTile.aClass458_705, Class166.aClass180_1835,
				Class411.anInterface24_4255, (byte) 6);
	    Class279 class279
		= new Class279(Class110.aClass458_1370
				   .method7495("huffman", "", 52918887));
	    Class493.method7998(class279, 640005347);
	    Class19.aClass511_206 = Class567.method9490(-1307181653);
	    Class31.aClass525_Sub36_305 = new Class525_Sub36(true);
	}
	if (Class303.aClass303_3392 == aClass303_3583) {
	    int i = (Class451.method7339(Class462.aClass458_5095, 1284478666)
		     + Class7.aClass404_53.method6577(true, -1104736468));
	    int i_29_ = (Class87.method1659(-285303566)
			 + Class7.aClass404_53.method6595(-1591047126));
	    if (i < i_29_)
		return i * 100 / i_29_;
	}
	if (Class303.aClass303_3400 == aClass303_3583)
	    Class556.method9244(ItemDefinitions.aClass458_136, Class597.aClass458_7845,
				Class232.aClass40_Sub18_2368,
				Class198_Sub17.aClass40_Sub14_9981,
				client.aClass507_11137.method8362((byte) -1),
				Class698.aClass40_Sub2_8770,
				Class568.aClass40_Sub17_7627,
				Class532.aClass111_7170,
				Class532.aClass111_7170);
	if (Class303.aClass303_3394 == aClass303_3583) {
	    Class309.aClass144_Sub1_3465
		= new Class144_Sub1(Class198_Sub4.aClass106_Sub1_Sub2_9917);
	    Class407.method6637((byte) 0);
	    Class424.aClass52_4742 = Class238.method4416((byte) -18);
	    Class322.aClass458_3549.method7547(false, true, -339282746);
	    Class462.aClass458_5095.method7547(true, true, -983425620);
	    Class276.aClass458_2875.method7547(true, true, 1475367472);
	    Class110.aClass458_1370.method7547(true, true, 67995484);
	    client.aBool11199 = true;
	}
	if (aClass303_3583 == Class303.aClass303_3395
	    && -1 != 1089481059 * Class138.aClass631_1641.anInt8176) {
	    if (!Class165.method2667((Class138.aClass631_1641.anInt8176
				      * 1089481059),
				     null, -270125361))
		return 0;
	    boolean bool = true;
	    for (int i = 0;
		 i < (Class162.aClass245Array1764
		      [Class138.aClass631_1641.anInt8176 * 1089481059]
		      .aClass259Array2426).length;
		 i++) {
		Class259 class259
		    = (Class162.aClass245Array1764
		       [1089481059 * Class138.aClass631_1641.anInt8176]
		       .aClass259Array2426[i]);
		if (5 == 2010235789 * class259.anInt2590
		    && class259.anInt2621 * 1940882535 != -1
		    && !Class462.aClass458_5095.method7478((class259.anInt2621
							    * 1940882535),
							   0, (short) 11213))
		    bool = false;
	    }
	    if (!bool)
		return 0;
	}
	if (Class303.aClass303_3396 == aClass303_3583)
	    Class335.method5858(true, (byte) -11);
	if (Class303.aClass303_3397 == aClass303_3583) {
	    Class159.aClass295_1755.method5346((byte) 1);
	    try {
		aThread3581.join();
	    } catch (InterruptedException interruptedexception) {
		return 0;
	    }
	    Class159.aClass295_1755 = null;
	    aThread3581 = null;
	    aClass458_3577 = null;
	    Class653.aClass458_8393 = null;
	    aClass91_3579 = null;
	    anInterface32Array3585 = null;
	    EmitterConfig.aMap11727.remove(Class56.aClass56_587);
	    EmitterConfig.aMap11727.remove(Class56.aClass56_595);
	    EmitterConfig.aMap11727.remove(Class56.aClass56_580);
	    Class519.method8661((byte) 0);
	    client.aBool11063
		= Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub29_10722
		      .method17240(-744250186) == 1;
	    Class198_Sub13.aClass525_Sub30_9973.method16502
		(Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub29_10722, 1,
		 (byte) -41);
	    if (client.aBool11063)
		Class198_Sub13.aClass525_Sub30_9973.method16502
		    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub20_10701,
		     0, (byte) -57);
	    else if ((Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub20_10701
		      .aBool10927)
		     && (-1113722213 * Class31.aClass525_Sub36_305.anInt10806
			 < 512)
		     && (Class31.aClass525_Sub36_305.anInt10806 * -1113722213
			 != 0))
		Class198_Sub13.aClass525_Sub30_9973.method16502
		    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub20_10701,
		     0, (byte) -69);
	    Class650.method10715(-1758466106);
	    if (client.aBool11063) {
		Class217.method4146(0, false, (byte) 14);
		if (!client.aBool11333)
		    Class217.method4141(Class68.aClass68_723, -2006607849);
	    } else {
		Class217.method4146(Class198_Sub13.aClass525_Sub30_9973
					.aClass696_Sub20_10701
					.method17160(1602141251),
				    false, (byte) 8);
		if (Class198_Sub13.aClass525_Sub30_9973
			.aClass696_Sub20_10701.method17160(-1509359887)
		    == 0)
		    Class217.method4141(Class68.aClass68_727, -2114412015);
	    }
	    Class332_Sub1.method15672(Class198_Sub13.aClass525_Sub30_9973
					  .aClass696_Sub41_10704
					  .method17337(-26810017),
				      -1, -1, false, (byte) 21);
	    Class7.aClass404_53.method6581(client.anInterface50_11252,
					   (byte) 8);
	    Class495.method8130(Class501.aClass182_5564, 534531211);
	    Class62.method1376(Class501.aClass182_5564,
			       Class462.aClass458_5095, (short) 7922);
	}
	return Class241.method4438(1151809541);
    }
    
    public static void method5794() {
	if (Class159.aClass295_1755 != null)
	    Class159.aClass295_1755.method5346((byte) 1);
	if (aThread3581 != null) {
	    for (;;) {
		try {
		    aThread3581.join();
		    break;
		} catch (InterruptedException interruptedexception) {
		    /* empty */
		}
	    }
	}
    }
    
    static void method5795(int i, int i_30_, int i_31_) {
	TwitchEventResult twitcheventresult = new TwitchEventResult(i, i_30_);
	Class591 class591 = twitcheventresult.method6641();
	if (class591 != null)
	    Class50.method1128(class591.method80(), twitcheventresult,
			       (byte) 22);
    }
    
    public static void method5796(Class259 class259, int i, int i_32_,
				  short i_33_) {
	if (class259 != null) {
	    if (class259.anObjectArray2611 != null) {
		Class525_Sub32 class525_sub32 = new Class525_Sub32();
		class525_sub32.aClass259_10736 = class259;
		class525_sub32.anObjectArray10740 = class259.anObjectArray2611;
		Class241.method4435(class525_sub32, 702243019);
	    }
	    client.aBool11358 = true;
	    Class462.anInt5096 = 11092149 * class259.anInt2588;
	    client.anInt11256 = class259.anInt2576 * 1503797357;
	    Class30.anInt299 = -333082947 * i;
	    Class434.anInt4828 = 1167714309 * i_32_;
	    client.anInt11298 = -233005961 * class259.anInt2740;
	    Class316.anInt3496 = 1354567469 * class259.anInt2608;
	    client.anInt11373 = -1891449277 * class259.anInt2706;
	    Class649.method10708(class259, (byte) 0);
	}
    }
    
    static Class7 method5797(byte i) {
	Class7 class7;
	if (Class61.aBool645) {
	    if (Class586.aClass175_7771 != null
		&& null != Class217.aClass7_2314)
		class7 = Class217.aClass7_2314;
	    else
		class7 = Class525_Sub24.aClass7_10595;
	} else
	    class7 = Class525_Sub24.aClass7_10595;
	Class61.anInt648
	    = class7.anInt49 * 366998079 + class7.anInt51 * 1259183857;
	return class7;
    }
}
