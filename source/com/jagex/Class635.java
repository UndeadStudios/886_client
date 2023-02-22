/* Class635 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class635
{
    Class618 aClass618_8245;
    static Class174 aClass174_8246;
    float aFloat8247;
    int anInt8248 = 0;
    Class618[][] aClass618ArrayArray8249;
    JS5 aClass458_8250;
    int anInt8251 = -587115815;
    float aFloat8252;
    Class645 aClass645_8253;
    static int anInt8254;
    Class618 aClass618_8255;
    boolean aBool8256;
    public static int anInt8257 = -1119316793;
    Class618 aClass618_8258;
    float[] aFloatArray8259;
    Class446 aClass446_8260;
    Class200 aClass200_8261;
    Class200 aClass200_8262;
    Class200 aClass200_8263;
    Class618 aClass618_8264;
    boolean aBool8265;
    int[] anIntArray8266;
    Class182 aClass182_8267;
    boolean aBool8268;
    float aFloat8269;
    long aLong8270 = 0L;
    Class618 aClass618_8271;
    float aFloat8272;
    float aFloat8273;
    public static Class40_Sub6 aClass40_Sub6_8274;
    
    void method10381() {
	aBool8268 = false;
	aFloat8269 = 1.0F;
	aFloat8247 = 0.0F;
	aFloat8252 = 1.0F;
	aFloat8272 = 0.0F;
	aFloat8273 = 1.0F;
    }
    
    public void method10382(Class507 class507, int i) {
	Class618 class618 = method10395(class507, (byte) 16);
	if (aClass645_8253 != null) {
	    aClass618_8258.method10118(class618, 2023172676);
	    aClass618_8258.method10126(this, aClass645_8253, (byte) 18);
	    method10436(aClass618_8258, aClass645_8253.method10641((byte) 90),
			-998972686);
	} else
	    method10436(class618, -1902531337 * anInt8254, -631831595);
	method10422((byte) -1);
	method10399(-77827517);
	method10401((short) 8704);
    }
    
    public void method10383(Class635 class635_0_) {
	aClass618_8255.method10118(class635_0_.aClass618_8255, 50454160);
	aClass618_8245.method10118(class635_0_.aClass618_8245, 1024952757);
	aClass618_8271.method10118(class635_0_.aClass618_8271, 568327317);
	aLong8270 = 1L * class635_0_.aLong8270;
	anInt8248 = class635_0_.anInt8248 * 1;
	anInt8251 = class635_0_.anInt8251 * 1;
    }
    
    public void method10384(Class507 class507, Class645 class645, int i,
			    short i_1_) {
	aClass645_8253 = class645;
	Class618 class618 = method10395(class507, (byte) 16);
	if (null != aClass645_8253) {
	    if (aClass618_8258 == null)
		aClass618_8258 = new Class618();
	    aClass618_8258.method10118(class618, 1973499585);
	    aClass618_8258.method10126(this, aClass645_8253, (byte) -9);
	    method10436(aClass618_8258, i, 453580071);
	} else {
	    method10436(class618, i, -1678964355);
	    aClass618_8258 = null;
	}
    }
    
    public Class645 method10385(int i) {
	return aClass645_8253;
    }
    
    public Class618 method10386(byte i) {
	return aClass618_8255;
    }
    
    public void method10387() {
	for (int i = 0; i < aClass618ArrayArray8249.length; i++) {
	    for (int i_2_ = 0; i_2_ < aClass618ArrayArray8249[i].length;
		 i_2_++)
		aClass618ArrayArray8249[i][i_2_] = aClass618_8264;
	}
    }
    
    public void method10388(int i) {
	aClass200_8261.method3791((byte) -27);
	aClass200_8262.method3791((byte) 26);
	aClass200_8263.method3791((byte) -32);
    }
    
    Class515 method10389(int i, int i_3_, int i_4_, int i_5_) {
	long l = (((long) i_3_ & 0xffffL) << 48 | ((long) i_4_ & 0xffffL) << 32
		  | ((long) i_5_ & 0xffffL) << 16 | (long) i & 0xffffL);
	Class515 class515 = (Class515) aClass200_8262.method3785(l);
	if (null == class515) {
	    class515
		= Class325.method5740(i, i_3_, i_4_, i_5_,
				      Class658.aClass40_Sub3_8457,
				      Class539.aClass40_Sub4_7181, -110540327);
	    aClass200_8262.method3788(class515, l);
	}
	return class515;
    }
    
    Class515 method10390(int i, int i_6_, int i_7_, int i_8_, int i_9_) {
	long l = (((long) i_6_ & 0xffffL) << 48 | ((long) i_7_ & 0xffffL) << 32
		  | ((long) i_8_ & 0xffffL) << 16 | (long) i & 0xffffL);
	Class515 class515 = (Class515) aClass200_8262.method3785(l);
	if (null == class515) {
	    class515
		= Class325.method5740(i, i_6_, i_7_, i_8_,
				      Class658.aClass40_Sub3_8457,
				      Class539.aClass40_Sub4_7181, 1010045568);
	    aClass200_8262.method3788(class515, l);
	}
	return class515;
    }
    
    Class169 method10391(int i, byte i_10_) {
	Class169 class169 = (Class169) aClass200_8263.method3785((long) i);
	if (null != class169)
	    return class169;
	Class173 class173 = Class187.method3668(aClass458_8250, i);
	if (class173 != null && class173.method2772() == 256
	    && class173.method2765() == 16) {
	    int[] is = class173.method2778(false);
	    class169 = aClass182_8267.method3253(is);
	    if (null != class169)
		aClass200_8263.method3788(class169, (long) i);
	}
	return class169;
    }
    
    public void method10392(int i, int i_11_, Class618 class618, int i_12_) {
	aClass618ArrayArray8249[i][i_11_] = class618;
    }
    
    public void method10393(byte i) {
	for (int i_13_ = 0; i_13_ < aClass618ArrayArray8249.length; i_13_++) {
	    for (int i_14_ = 0; i_14_ < aClass618ArrayArray8249[i_13_].length;
		 i_14_++)
		aClass618ArrayArray8249[i_13_][i_14_] = aClass618_8264;
	}
    }
    
    public void method10394(int i, int i_15_, int i_16_) {
	Class618 class618 = aClass618ArrayArray8249[i][i_15_];
	if (class618 != null)
	    aClass446_8260.method7216(class618.aClass446_8069);
	method10399(-77827517);
    }
    
    Class618 method10395(Class507 class507, byte i) {
	Object object = null;
	int i_17_ = -1;
	int i_18_ = -1;
	if (Class350_Sub1.method15842(client.anInt11075 * 1777895575,
				      1358342766)
	    || Class34.method960(1777895575 * client.anInt11075, (byte) 43)) {
	    i_17_ = -469853907 * Class477.anInt5200 >> 12;
	    i_18_ = Class475.anInt5179 * -1889707729 >> 12;
	} else {
	    if (null != Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705) {
		i_17_ = (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
			 .anIntArray12014[0]) >> 3;
		i_18_ = (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
			 .anIntArray12017[0]) >> 3;
	    }
	    if (i_17_ < 0 || i_17_ >= class507.method8412(1795783533) >> 3
		|| i_18_ < 0
		|| i_18_ >= class507.method8352((byte) -16) >> 3) {
		i_17_ = class507.method8412(1463100537) >> 4;
		i_18_ = class507.method8352((byte) -55) >> 4;
	    }
	}
	Class618 class618 = aClass618ArrayArray8249[i_17_][i_18_];
	if (null == class618)
	    class618 = aClass618_8264;
	return class618;
    }
    
    public void method10396() {
	aBool8256 = true;
    }
    
    void method10397() {
	aClass182_8267.method3351((0.7F
				   + ((float) Class198_Sub13
						  .aClass525_Sub30_9973
						  .aClass696_Sub13_10681
						  .method17081(-1330797542)
				      * 0.1F)
				   + client.aClass507_11137
					 .method8355(1617496821))
				  * aClass618_8255.aFloat8066);
	aClass182_8267.method3307(aClass618_8255.anInt8067 * -1643509609,
				  aClass618_8255.aFloat8074,
				  aClass618_8255.aFloat8082,
				  (float) ((int) aClass446_8260.aFloat4895
					   << 2),
				  (float) ((int) aClass446_8260.aFloat4896
					   << 2),
				  (float) ((int) aClass446_8260.aFloat4897
					   << 2));
	aClass182_8267.method3247(aClass618_8255.aClass174_8072);
    }
    
    public void method10398(int i) {
	aBool8256 = true;
    }
    
    void method10399(int i) {
	aClass182_8267.method3351((0.7F
				   + (float) Class198_Sub13
						 .aClass525_Sub30_9973
						 .aClass696_Sub13_10681
						 .method17081(901124316) * 0.1F
				   + client.aClass507_11137
					 .method8355(-1967799072))
				  * aClass618_8255.aFloat8066);
	aClass182_8267.method3307(aClass618_8255.anInt8067 * -1643509609,
				  aClass618_8255.aFloat8074,
				  aClass618_8255.aFloat8082,
				  (float) ((int) aClass446_8260.aFloat4895
					   << 2),
				  (float) ((int) aClass446_8260.aFloat4896
					   << 2),
				  (float) ((int) aClass446_8260.aFloat4897
					   << 2));
	aClass182_8267.method3247(aClass618_8255.aClass174_8072);
    }
    
    public void method10400(Class635 class635_19_, int i) {
	aClass618_8255.method10118(class635_19_.aClass618_8255, 538524347);
	aClass618_8245.method10118(class635_19_.aClass618_8245, 1709840559);
	aClass618_8271.method10118(class635_19_.aClass618_8271, 559051281);
	aLong8270 = 1L * class635_19_.aLong8270;
	anInt8248 = class635_19_.anInt8248 * 1;
	anInt8251 = class635_19_.anInt8251 * 1;
    }
    
    public void method10401(short i) {
	int i_20_ = 0;
	int i_21_
	    = i_20_ + (aClass618_8255.anInt8071 * -2036201037 + 256 << 2);
	aClass182_8267.method3140(1494025451 * aClass618_8255.anInt8070,
				  (Class198_Sub13.aClass525_Sub30_9973
				       .aClass696_Sub8_10671
				       .method17043(-1244022845) == 1
				   ? i_21_ : -1),
				  0);
    }
    
    void method10402(int i) {
	aClass182_8267.method3259(aClass618_8255.aFloat8075,
				  aClass618_8255.aFloat8076,
				  aClass618_8255.aFloat8068, 1428027087);
    }
    
    void method10403(int i) {
	if (aClass182_8267.method3254()) {
	    if (aBool8268)
		aClass182_8267.method3221(aFloat8269, aFloat8247, aFloat8252,
					  aFloat8272, aFloat8273);
	    else
		aClass182_8267.method3221(aClass618_8255.aFloat8077,
					  aClass618_8255.aFloat8078,
					  aClass618_8255.aFloat8079,
					  aClass618_8255.aFloat8080,
					  aClass618_8255.aFloat8081);
	}
    }
    
    void method10404(byte i) {
	aBool8268 = false;
	aFloat8269 = 1.0F;
	aFloat8247 = 0.0F;
	aFloat8252 = 1.0F;
	aFloat8272 = 0.0F;
	aFloat8273 = 1.0F;
    }
    
    void method10405(byte i) {
	if (aClass182_8267.method3313()) {
	    Class169 class169 = null;
	    Class169 class169_22_ = null;
	    Class169 class169_23_ = null;
	    if (aBool8265) {
		if (anIntArray8266[0] > -1)
		    class169 = method10391(anIntArray8266[0], (byte) 2);
		if (anIntArray8266[1] > -1)
		    class169_22_ = method10391(anIntArray8266[1], (byte) 2);
		if (anIntArray8266[2] > -1)
		    class169_23_ = method10391(anIntArray8266[2], (byte) 2);
		aClass182_8267.method3326(class169, aFloatArray8259[0],
					  class169_22_, aFloatArray8259[1],
					  class169_23_, aFloatArray8259[2]);
	    } else {
		if (aClass618_8255.anIntArray8065[0] > -1)
		    class169 = method10391(aClass618_8255.anIntArray8065[0],
					   (byte) 2);
		if (aClass618_8255.anIntArray8065[1] > -1)
		    class169_22_
			= method10391(aClass618_8255.anIntArray8065[1],
				      (byte) 2);
		if (aClass618_8255.anIntArray8065[2] > -1)
		    class169_23_
			= method10391(aClass618_8255.anIntArray8065[2],
				      (byte) 2);
		aClass182_8267.method3326(class169,
					  aClass618_8255.aFloatArray8073[0],
					  class169_22_,
					  aClass618_8255.aFloatArray8073[1],
					  class169_23_,
					  aClass618_8255.aFloatArray8073[2]);
	    }
	}
    }
    
    void method10406(int i) {
	aBool8265 = false;
	int[] is = anIntArray8266;
	int[] is_24_ = anIntArray8266;
	anIntArray8266[2] = -1;
	is_24_[1] = -1;
	is[0] = -1;
	float[] fs = aFloatArray8259;
	float[] fs_25_ = aFloatArray8259;
	aFloatArray8259[2] = 0.0F;
	fs_25_[1] = 0.0F;
	fs[0] = 0.0F;
    }
    
    public void method10407() {
	int i = 0;
	int i_26_ = i + (aClass618_8255.anInt8071 * -2036201037 + 256 << 2);
	aClass182_8267.method3140(1494025451 * aClass618_8255.anInt8070,
				  (Class198_Sub13.aClass525_Sub30_9973
				       .aClass696_Sub8_10671
				       .method17043(-440122446) == 1
				   ? i_26_ : -1),
				  0);
    }
    
    public void method10408(int i, int i_27_) {
	Class618 class618 = aClass618ArrayArray8249[i][i_27_];
	if (class618 != null)
	    aClass446_8260.method7216(class618.aClass446_8069);
	method10399(-77827517);
    }
    
    public void method10409(Class507 class507) {
	Class618 class618 = method10395(class507, (byte) 16);
	if (aClass645_8253 != null) {
	    aClass618_8258.method10118(class618, 1611080328);
	    aClass618_8258.method10126(this, aClass645_8253, (byte) -66);
	    method10436(aClass618_8258, aClass645_8253.method10641((byte) 13),
			482167091);
	} else
	    method10436(class618, -1902531337 * anInt8254, -1114915121);
	method10422((byte) -1);
	method10399(-77827517);
	method10401((short) 8704);
    }
    
    public void method10410(Class635 class635_28_) {
	aClass618_8255.method10118(class635_28_.aClass618_8255, 1413180167);
	aClass618_8245.method10118(class635_28_.aClass618_8245, 1456561621);
	aClass618_8271.method10118(class635_28_.aClass618_8271, 361186248);
	aLong8270 = 1L * class635_28_.aLong8270;
	anInt8248 = class635_28_.anInt8248 * 1;
	anInt8251 = class635_28_.anInt8251 * 1;
    }
    
    public void method10411(Class507 class507, Class645 class645, int i) {
	aClass645_8253 = class645;
	Class618 class618 = method10395(class507, (byte) 16);
	if (null != aClass645_8253) {
	    if (aClass618_8258 == null)
		aClass618_8258 = new Class618();
	    aClass618_8258.method10118(class618, 148447689);
	    aClass618_8258.method10126(this, aClass645_8253, (byte) 20);
	    method10436(aClass618_8258, i, 690053932);
	} else {
	    method10436(class618, i, 1138024866);
	    aClass618_8258 = null;
	}
    }
    
    public void method10412(Class507 class507, Class645 class645, int i) {
	aClass645_8253 = class645;
	Class618 class618 = method10395(class507, (byte) 16);
	if (null != aClass645_8253) {
	    if (aClass618_8258 == null)
		aClass618_8258 = new Class618();
	    aClass618_8258.method10118(class618, 796965100);
	    aClass618_8258.method10126(this, aClass645_8253, (byte) -93);
	    method10436(aClass618_8258, i, -1379919562);
	} else {
	    method10436(class618, i, -1892933216);
	    aClass618_8258 = null;
	}
    }
    
    Class515 method10413(int i, int i_29_, int i_30_, int i_31_) {
	long l
	    = (((long) i_29_ & 0xffffL) << 48 | ((long) i_30_ & 0xffffL) << 32
	       | ((long) i_31_ & 0xffffL) << 16 | (long) i & 0xffffL);
	Class515 class515 = (Class515) aClass200_8262.method3785(l);
	if (null == class515) {
	    class515
		= Class325.method5740(i, i_29_, i_30_, i_31_,
				      Class658.aClass40_Sub3_8457,
				      Class539.aClass40_Sub4_7181, -402125503);
	    aClass200_8262.method3788(class515, l);
	}
	return class515;
    }
    
    void method10414() {
	if (-1262488937 * anInt8251 >= 0) {
	    long l = Class251.method4508((byte) 8);
	    anInt8251 -= 587115815L * (l - aLong8270 * 8976116774373457583L);
	    if (anInt8251 * -1262488937 > 0)
		aClass618_8255.method10119(aClass182_8267, aClass618_8245,
					   aClass618_8271,
					   ((float) (1934051277 * anInt8248
						     - anInt8251 * -1262488937)
					    / (float) (anInt8248
						       * 1934051277)),
					   -1329370463);
	    else {
		aClass618_8255.method10118(aClass618_8271, 1167881302);
		if (aClass618_8255.aClass515_8083 != null)
		    aClass618_8255.aClass515_8083.method8558((byte) -85);
		anInt8251 = -587115815;
	    }
	    aLong8270 = -7759287231852079025L * l;
	}
    }
    
    public Class645 method10415() {
	return aClass645_8253;
    }
    
    public Class645 method10416() {
	return aClass645_8253;
    }
    
    public Class645 method10417() {
	return aClass645_8253;
    }
    
    public void method10418(Class635 class635_32_) {
	aClass618_8255.method10118(class635_32_.aClass618_8255, 1344332826);
	aClass618_8245.method10118(class635_32_.aClass618_8245, 196826783);
	aClass618_8271.method10118(class635_32_.aClass618_8271, 899490297);
	aLong8270 = 1L * class635_32_.aLong8270;
	anInt8248 = class635_32_.anInt8248 * 1;
	anInt8251 = class635_32_.anInt8251 * 1;
    }
    
    public Class645 method10419() {
	return aClass645_8253;
    }
    
    public void method10420() {
	aBool8256 = true;
    }
    
    public Class618 method10421() {
	return aClass618_8255;
    }
    
    void method10422(byte i) {
	if (-1262488937 * anInt8251 >= 0) {
	    long l = Class251.method4508((byte) 8);
	    anInt8251 -= 587115815L * (l - aLong8270 * 8976116774373457583L);
	    if (anInt8251 * -1262488937 > 0)
		aClass618_8255.method10119(aClass182_8267, aClass618_8245,
					   aClass618_8271,
					   ((float) (1934051277 * anInt8248
						     - anInt8251 * -1262488937)
					    / (float) (anInt8248
						       * 1934051277)),
					   -1329370463);
	    else {
		aClass618_8255.method10118(aClass618_8271, 835337743);
		if (aClass618_8255.aClass515_8083 != null)
		    aClass618_8255.aClass515_8083.method8558((byte) -28);
		anInt8251 = -587115815;
	    }
	    aLong8270 = -7759287231852079025L * l;
	}
    }
    
    public void method10423(int i, int i_33_) {
	Class618 class618 = aClass618ArrayArray8249[i][i_33_];
	if (class618 != null)
	    aClass446_8260.method7216(class618.aClass446_8069);
	method10399(-77827517);
    }
    
    public void method10424(Class507 class507) {
	Class618 class618 = method10395(class507, (byte) 16);
	if (aClass645_8253 != null) {
	    aClass618_8258.method10118(class618, 1552300104);
	    aClass618_8258.method10126(this, aClass645_8253, (byte) 15);
	    method10436(aClass618_8258, aClass645_8253.method10641((byte) 86),
			106671879);
	} else
	    method10436(class618, -1902531337 * anInt8254, -909784191);
	method10422((byte) -1);
	method10399(-77827517);
	method10401((short) 8704);
    }
    
    public void method10425() {
	aClass200_8261.method3791((byte) -29);
	aClass200_8262.method3791((byte) 114);
	aClass200_8263.method3791((byte) 93);
    }
    
    Class174 method10426(int i) {
	Class174 class174 = (Class174) aClass200_8261.method3785((long) i);
	if (class174 != null)
	    return class174;
	class174 = aClass182_8267.method3245(i);
	aClass200_8261.method3788(class174, (long) i);
	return class174;
    }
    
    public void method10427() {
	aClass182_8267.method3351((0.7F
				   + ((float) Class198_Sub13
						  .aClass525_Sub30_9973
						  .aClass696_Sub13_10681
						  .method17081(-263058851)
				      * 0.1F)
				   + client.aClass507_11137
					 .method8355(-1718957230))
				  * 1.1523438F);
	aClass182_8267.method3307(16777215, 0.69921875F, 1.2F, -200.0F,
				  -240.0F, -200.0F);
	aClass182_8267.method3140(13156520, -1, 0);
	aClass182_8267.method3247(aClass174_8246);
    }
    
    public void method10428() {
	aClass182_8267.method3351((0.7F
				   + ((float) Class198_Sub13
						  .aClass525_Sub30_9973
						  .aClass696_Sub13_10681
						  .method17081(-1511310574)
				      * 0.1F)
				   + client.aClass507_11137
					 .method8355(1974397593))
				  * 1.1523438F);
	aClass182_8267.method3307(16777215, 0.69921875F, 1.2F, -200.0F,
				  -240.0F, -200.0F);
	aClass182_8267.method3140(13156520, -1, 0);
	aClass182_8267.method3247(aClass174_8246);
    }
    
    Class515 method10429(int i, int i_34_, int i_35_, int i_36_) {
	long l
	    = (((long) i_34_ & 0xffffL) << 48 | ((long) i_35_ & 0xffffL) << 32
	       | ((long) i_36_ & 0xffffL) << 16 | (long) i & 0xffffL);
	Class515 class515 = (Class515) aClass200_8262.method3785(l);
	if (null == class515) {
	    class515
		= Class325.method5740(i, i_34_, i_35_, i_36_,
				      Class658.aClass40_Sub3_8457,
				      Class539.aClass40_Sub4_7181, 589205607);
	    aClass200_8262.method3788(class515, l);
	}
	return class515;
    }
    
    Class515 method10430(int i, int i_37_, int i_38_, int i_39_) {
	long l
	    = (((long) i_37_ & 0xffffL) << 48 | ((long) i_38_ & 0xffffL) << 32
	       | ((long) i_39_ & 0xffffL) << 16 | (long) i & 0xffffL);
	Class515 class515 = (Class515) aClass200_8262.method3785(l);
	if (null == class515) {
	    class515
		= Class325.method5740(i, i_37_, i_38_, i_39_,
				      Class658.aClass40_Sub3_8457,
				      Class539.aClass40_Sub4_7181, 1856064582);
	    aClass200_8262.method3788(class515, l);
	}
	return class515;
    }
    
    Class169 method10431(int i) {
	Class169 class169 = (Class169) aClass200_8263.method3785((long) i);
	if (null != class169)
	    return class169;
	Class173 class173 = Class187.method3668(aClass458_8250, i);
	if (class173 != null && class173.method2772() == 256
	    && class173.method2765() == 16) {
	    int[] is = class173.method2778(false);
	    class169 = aClass182_8267.method3253(is);
	    if (null != class169)
		aClass200_8263.method3788(class169, (long) i);
	}
	return class169;
    }
    
    void method10432() {
	aBool8265 = false;
	int[] is = anIntArray8266;
	int[] is_40_ = anIntArray8266;
	anIntArray8266[2] = -1;
	is_40_[1] = -1;
	is[0] = -1;
	float[] fs = aFloatArray8259;
	float[] fs_41_ = aFloatArray8259;
	aFloatArray8259[2] = 0.0F;
	fs_41_[1] = 0.0F;
	fs[0] = 0.0F;
    }
    
    public void method10433() {
	for (int i = 0; i < aClass618ArrayArray8249.length; i++) {
	    for (int i_42_ = 0; i_42_ < aClass618ArrayArray8249[i].length;
		 i_42_++)
		aClass618ArrayArray8249[i][i_42_] = aClass618_8264;
	}
    }
    
    public Class645 method10434() {
	return aClass645_8253;
    }
    
    public void method10435(Class507 class507, short i) {
	Class618 class618 = method10395(class507, (byte) 16);
	if (null != aClass645_8253) {
	    aClass618_8258.method10118(class618, 1274776810);
	    aClass618_8258.method10126(this, aClass645_8253, (byte) -99);
	    method10436(aClass618_8258, aClass645_8253.method10641((byte) 116),
			-536341779);
	} else
	    method10436(class618, anInt8254 * -1902531337, -220704639);
	method10422((byte) -1);
	method10402(-406188353);
	method10403(2037479452);
	method10405((byte) -15);
    }
    
    public Class635(Class182 class182, JS5 class458, int i, int i_43_) {
	aBool8256 = false;
	aClass446_8260 = new Class446(-50.0F, -60.0F, -50.0F);
	aClass200_8261 = new Class200(9);
	aClass200_8262 = new Class200(9);
	aClass200_8263 = new Class200(9);
	aBool8265 = false;
	anIntArray8266 = new int[] { -1, -1, -1 };
	aFloatArray8259 = new float[] { 0.0F, 0.0F, 0.0F };
	aBool8268 = false;
	aClass182_8267 = class182;
	aClass458_8250 = class458;
	aClass618ArrayArray8249 = new Class618[i][i_43_];
	if (-1 != -1487400183 * anInt8257)
	    aClass174_8246 = method10448(anInt8257 * -1487400183, -1635175412);
	Class678.aClass515_8621 = null;
	aClass618_8264 = new Class618();
	aClass618_8255 = new Class618();
	aClass618_8245 = new Class618();
	aClass618_8271 = new Class618();
	method10398(455068843);
	method10406(632024826);
	method10404((byte) -1);
    }
    
    void method10436(Class618 class618, int i, int i_44_) {
	if (aBool8256) {
	    aBool8256 = false;
	    i = 0;
	}
	if (!aClass618_8271.method10125(class618, (byte) 2)) {
	    aClass618_8271.method10118(class618, 1835340820);
	    aLong8270 = Class251.method4508((byte) 8) * -7759287231852079025L;
	    anInt8248 = (anInt8251 = i * 587115815) * 420542451;
	    if (0 != 1934051277 * anInt8248) {
		aClass618_8245.method10118(aClass618_8255, 1885941924);
		if (aClass618_8255.aClass515_8083 != null) {
		    if (aClass618_8255.aClass515_8083.method8559((byte) -68))
			aClass618_8255.aClass515_8083
			    = aClass618_8245.aClass515_8083
			    = aClass618_8255.aClass515_8083
				  .method8560(368271267);
		    if (aClass618_8255.aClass515_8083 != null
			&& (aClass618_8271.aClass515_8083
			    != aClass618_8255.aClass515_8083))
			aClass618_8255.aClass515_8083.method8593
			    (aClass618_8271.aClass515_8083, (byte) 2);
		}
	    }
	}
    }
    
    public void method10437() {
	for (int i = 0; i < aClass618ArrayArray8249.length; i++) {
	    for (int i_45_ = 0; i_45_ < aClass618ArrayArray8249[i].length;
		 i_45_++)
		aClass618ArrayArray8249[i][i_45_] = aClass618_8264;
	}
    }
    
    public void method10438(int i, int i_46_) {
	Class618 class618 = aClass618ArrayArray8249[i][i_46_];
	if (class618 != null)
	    aClass446_8260.method7216(class618.aClass446_8069);
	method10399(-77827517);
    }
    
    public void method10439(int i, int i_47_) {
	Class618 class618 = aClass618ArrayArray8249[i][i_47_];
	if (class618 != null)
	    aClass446_8260.method7216(class618.aClass446_8069);
	method10399(-77827517);
    }
    
    Class618 method10440(Class507 class507) {
	Object object = null;
	int i = -1;
	int i_48_ = -1;
	if (Class350_Sub1.method15842(client.anInt11075 * 1777895575,
				      145300377)
	    || Class34.method960(1777895575 * client.anInt11075, (byte) 102)) {
	    i = -469853907 * Class477.anInt5200 >> 12;
	    i_48_ = Class475.anInt5179 * -1889707729 >> 12;
	} else {
	    if (null != Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705) {
		i = (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
		     .anIntArray12014[0]) >> 3;
		i_48_ = (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
			 .anIntArray12017[0]) >> 3;
	    }
	    if (i < 0 || i >= class507.method8412(2046189285) >> 3 || i_48_ < 0
		|| i_48_ >= class507.method8352((byte) -46) >> 3) {
		i = class507.method8412(1946604495) >> 4;
		i_48_ = class507.method8352((byte) -36) >> 4;
	    }
	}
	Class618 class618 = aClass618ArrayArray8249[i][i_48_];
	if (null == class618)
	    class618 = aClass618_8264;
	return class618;
    }
    
    void method10441(Class618 class618, int i) {
	if (aBool8256) {
	    aBool8256 = false;
	    i = 0;
	}
	if (!aClass618_8271.method10125(class618, (byte) 2)) {
	    aClass618_8271.method10118(class618, 2008404015);
	    aLong8270 = Class251.method4508((byte) 8) * -7759287231852079025L;
	    anInt8248 = (anInt8251 = i * 587115815) * 420542451;
	    if (0 != 1934051277 * anInt8248) {
		aClass618_8245.method10118(aClass618_8255, 822870714);
		if (aClass618_8255.aClass515_8083 != null) {
		    if (aClass618_8255.aClass515_8083.method8559((byte) 8))
			aClass618_8255.aClass515_8083
			    = aClass618_8245.aClass515_8083
			    = aClass618_8255.aClass515_8083
				  .method8560(9911955);
		    if (aClass618_8255.aClass515_8083 != null
			&& (aClass618_8271.aClass515_8083
			    != aClass618_8255.aClass515_8083))
			aClass618_8255.aClass515_8083.method8593
			    (aClass618_8271.aClass515_8083, (byte) 2);
		}
	    }
	}
    }
    
    void method10442() {
	if (-1262488937 * anInt8251 >= 0) {
	    long l = Class251.method4508((byte) 8);
	    anInt8251 -= 587115815L * (l - aLong8270 * 8976116774373457583L);
	    if (anInt8251 * -1262488937 > 0)
		aClass618_8255.method10119(aClass182_8267, aClass618_8245,
					   aClass618_8271,
					   ((float) (1934051277 * anInt8248
						     - anInt8251 * -1262488937)
					    / (float) (anInt8248
						       * 1934051277)),
					   -1329370463);
	    else {
		aClass618_8255.method10118(aClass618_8271, 528292780);
		if (aClass618_8255.aClass515_8083 != null)
		    aClass618_8255.aClass515_8083.method8558((byte) -14);
		anInt8251 = -587115815;
	    }
	    aLong8270 = -7759287231852079025L * l;
	}
    }
    
    void method10443() {
	if (-1262488937 * anInt8251 >= 0) {
	    long l = Class251.method4508((byte) 8);
	    anInt8251 -= 587115815L * (l - aLong8270 * 8976116774373457583L);
	    if (anInt8251 * -1262488937 > 0)
		aClass618_8255.method10119(aClass182_8267, aClass618_8245,
					   aClass618_8271,
					   ((float) (1934051277 * anInt8248
						     - anInt8251 * -1262488937)
					    / (float) (anInt8248
						       * 1934051277)),
					   -1329370463);
	    else {
		aClass618_8255.method10118(aClass618_8271, 2136263134);
		if (aClass618_8255.aClass515_8083 != null)
		    aClass618_8255.aClass515_8083.method8558((byte) 102);
		anInt8251 = -587115815;
	    }
	    aLong8270 = -7759287231852079025L * l;
	}
    }
    
    void method10444() {
	if (-1262488937 * anInt8251 >= 0) {
	    long l = Class251.method4508((byte) 8);
	    anInt8251 -= 587115815L * (l - aLong8270 * 8976116774373457583L);
	    if (anInt8251 * -1262488937 > 0)
		aClass618_8255.method10119(aClass182_8267, aClass618_8245,
					   aClass618_8271,
					   ((float) (1934051277 * anInt8248
						     - anInt8251 * -1262488937)
					    / (float) (anInt8248
						       * 1934051277)),
					   -1329370463);
	    else {
		aClass618_8255.method10118(aClass618_8271, 857635820);
		if (aClass618_8255.aClass515_8083 != null)
		    aClass618_8255.aClass515_8083.method8558((byte) -21);
		anInt8251 = -587115815;
	    }
	    aLong8270 = -7759287231852079025L * l;
	}
    }
    
    public void method10445(float f, float f_49_, float f_50_, int i,
			    int i_51_, int i_52_, int i_53_, int i_54_,
			    int i_55_) {
	aClass182_8267.method3351((0.7F
				   + ((float) Class198_Sub13
						  .aClass525_Sub30_9973
						  .aClass696_Sub13_10681
						  .method17081(-1520767681)
				      * 0.1F)
				   + client.aClass507_11137
					 .method8355(1789927796)) * f);
	aClass182_8267.method3307(i, f_49_, f_50_, (float) (i_51_ << 2),
				  (float) (i_52_ << 2), (float) (i_53_ << 2));
	aClass182_8267.method3247(method10448(i_54_, -1926092021));
    }
    
    void method10446() {
	if (-1262488937 * anInt8251 >= 0) {
	    long l = Class251.method4508((byte) 8);
	    anInt8251 -= 587115815L * (l - aLong8270 * 8976116774373457583L);
	    if (anInt8251 * -1262488937 > 0)
		aClass618_8255.method10119(aClass182_8267, aClass618_8245,
					   aClass618_8271,
					   ((float) (1934051277 * anInt8248
						     - anInt8251 * -1262488937)
					    / (float) (anInt8248
						       * 1934051277)),
					   -1329370463);
	    else {
		aClass618_8255.method10118(aClass618_8271, 303519678);
		if (aClass618_8255.aClass515_8083 != null)
		    aClass618_8255.aClass515_8083.method8558((byte) 39);
		anInt8251 = -587115815;
	    }
	    aLong8270 = -7759287231852079025L * l;
	}
    }
    
    public void method10447(int i) {
	aClass182_8267.method3351((0.7F
				   + (float) Class198_Sub13
						 .aClass525_Sub30_9973
						 .aClass696_Sub13_10681
						 .method17081(-38460539) * 0.1F
				   + client.aClass507_11137
					 .method8355(29298609)) * 1.1523438F);
	aClass182_8267.method3307(16777215, 0.69921875F, 1.2F, -200.0F,
				  -240.0F, -200.0F);
	aClass182_8267.method3140(13156520, -1, 0);
	aClass182_8267.method3247(aClass174_8246);
    }
    
    Class174 method10448(int i, int i_56_) {
	Class174 class174 = (Class174) aClass200_8261.method3785((long) i);
	if (class174 != null)
	    return class174;
	class174 = aClass182_8267.method3245(i);
	aClass200_8261.method3788(class174, (long) i);
	return class174;
    }
    
    public void method10449() {
	aBool8256 = true;
    }
    
    Class169 method10450(int i) {
	Class169 class169 = (Class169) aClass200_8263.method3785((long) i);
	if (null != class169)
	    return class169;
	Class173 class173 = Class187.method3668(aClass458_8250, i);
	if (class173 != null && class173.method2772() == 256
	    && class173.method2765() == 16) {
	    int[] is = class173.method2778(false);
	    class169 = aClass182_8267.method3253(is);
	    if (null != class169)
		aClass200_8263.method3788(class169, (long) i);
	}
	return class169;
    }
    
    void method10451() {
	aClass182_8267.method3351((0.7F
				   + ((float) Class198_Sub13
						  .aClass525_Sub30_9973
						  .aClass696_Sub13_10681
						  .method17081(-1491711604)
				      * 0.1F)
				   + client.aClass507_11137
					 .method8355(1538468469))
				  * aClass618_8255.aFloat8066);
	aClass182_8267.method3307(aClass618_8255.anInt8067 * -1643509609,
				  aClass618_8255.aFloat8074,
				  aClass618_8255.aFloat8082,
				  (float) ((int) aClass446_8260.aFloat4895
					   << 2),
				  (float) ((int) aClass446_8260.aFloat4896
					   << 2),
				  (float) ((int) aClass446_8260.aFloat4897
					   << 2));
	aClass182_8267.method3247(aClass618_8255.aClass174_8072);
    }
    
    public void method10452(float f, float f_57_, float f_58_, int i,
			    int i_59_, int i_60_, int i_61_, int i_62_) {
	aClass182_8267.method3351((0.7F
				   + ((float) Class198_Sub13
						  .aClass525_Sub30_9973
						  .aClass696_Sub13_10681
						  .method17081(-1873870504)
				      * 0.1F)
				   + client.aClass507_11137
					 .method8355(176470683)) * f);
	aClass182_8267.method3307(i, f_57_, f_58_, (float) (i_59_ << 2),
				  (float) (i_60_ << 2), (float) (i_61_ << 2));
	aClass182_8267.method3247(method10448(i_62_, -1544681623));
    }
    
    public void method10453(int i, int i_63_) {
	Class618 class618 = aClass618ArrayArray8249[i][i_63_];
	if (class618 != null)
	    aClass446_8260.method7216(class618.aClass446_8069);
	method10399(-77827517);
    }
    
    void method10454() {
	aClass182_8267.method3259(aClass618_8255.aFloat8075,
				  aClass618_8255.aFloat8076,
				  aClass618_8255.aFloat8068, -365287437);
    }
    
    void method10455() {
	aClass182_8267.method3259(aClass618_8255.aFloat8075,
				  aClass618_8255.aFloat8076,
				  aClass618_8255.aFloat8068, 1077685810);
    }
    
    void method10456() {
	if (aClass182_8267.method3254()) {
	    if (aBool8268)
		aClass182_8267.method3221(aFloat8269, aFloat8247, aFloat8252,
					  aFloat8272, aFloat8273);
	    else
		aClass182_8267.method3221(aClass618_8255.aFloat8077,
					  aClass618_8255.aFloat8078,
					  aClass618_8255.aFloat8079,
					  aClass618_8255.aFloat8080,
					  aClass618_8255.aFloat8081);
	}
    }
    
    void method10457() {
	if (aClass182_8267.method3254()) {
	    if (aBool8268)
		aClass182_8267.method3221(aFloat8269, aFloat8247, aFloat8252,
					  aFloat8272, aFloat8273);
	    else
		aClass182_8267.method3221(aClass618_8255.aFloat8077,
					  aClass618_8255.aFloat8078,
					  aClass618_8255.aFloat8079,
					  aClass618_8255.aFloat8080,
					  aClass618_8255.aFloat8081);
	}
    }
    
    void method10458() {
	aBool8268 = false;
	aFloat8269 = 1.0F;
	aFloat8247 = 0.0F;
	aFloat8252 = 1.0F;
	aFloat8272 = 0.0F;
	aFloat8273 = 1.0F;
    }
    
    void method10459() {
	aBool8268 = false;
	aFloat8269 = 1.0F;
	aFloat8247 = 0.0F;
	aFloat8252 = 1.0F;
	aFloat8272 = 0.0F;
	aFloat8273 = 1.0F;
    }
    
    static {
	anInt8254 = 1688290022;
    }
    
    void method10460() {
	if (aClass182_8267.method3313()) {
	    Class169 class169 = null;
	    Class169 class169_64_ = null;
	    Class169 class169_65_ = null;
	    if (aBool8265) {
		if (anIntArray8266[0] > -1)
		    class169 = method10391(anIntArray8266[0], (byte) 2);
		if (anIntArray8266[1] > -1)
		    class169_64_ = method10391(anIntArray8266[1], (byte) 2);
		if (anIntArray8266[2] > -1)
		    class169_65_ = method10391(anIntArray8266[2], (byte) 2);
		aClass182_8267.method3326(class169, aFloatArray8259[0],
					  class169_64_, aFloatArray8259[1],
					  class169_65_, aFloatArray8259[2]);
	    } else {
		if (aClass618_8255.anIntArray8065[0] > -1)
		    class169 = method10391(aClass618_8255.anIntArray8065[0],
					   (byte) 2);
		if (aClass618_8255.anIntArray8065[1] > -1)
		    class169_64_
			= method10391(aClass618_8255.anIntArray8065[1],
				      (byte) 2);
		if (aClass618_8255.anIntArray8065[2] > -1)
		    class169_65_
			= method10391(aClass618_8255.anIntArray8065[2],
				      (byte) 2);
		aClass182_8267.method3326(class169,
					  aClass618_8255.aFloatArray8073[0],
					  class169_64_,
					  aClass618_8255.aFloatArray8073[1],
					  class169_65_,
					  aClass618_8255.aFloatArray8073[2]);
	    }
	}
    }
    
    public void method10461(Class507 class507, Class645 class645, int i) {
	aClass645_8253 = class645;
	Class618 class618 = method10395(class507, (byte) 16);
	if (null != aClass645_8253) {
	    if (aClass618_8258 == null)
		aClass618_8258 = new Class618();
	    aClass618_8258.method10118(class618, 1597271384);
	    aClass618_8258.method10126(this, aClass645_8253, (byte) -54);
	    method10436(aClass618_8258, i, -1595500666);
	} else {
	    method10436(class618, i, -1983793730);
	    aClass618_8258 = null;
	}
    }
    
    public Class618 method10462() {
	return aClass618_8255;
    }
    
    public Class645 method10463() {
	return aClass645_8253;
    }
    
    static final void method10464(Class683 class683, int i) {
	int i_66_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_66_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_66_ >> 16];
	Class609.method10012(class259, class245, class683, -2060647196);
    }
    
    static final void method10465(Class683 class683, int i) {
	int i_67_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	int i_68_ = i_67_ >> 14 & 0x3fff;
	int i_69_ = i_67_ & 0x3fff;
	Class600 class600 = client.aClass507_11137.method8350(1221157289);
	i_68_ -= class600.anInt7858 * -1227002079;
	if (i_68_ < 0)
	    i_68_ = 0;
	else if (i_68_ >= client.aClass507_11137.method8412(846731568))
	    i_68_ = client.aClass507_11137.method8412(1197900438);
	i_69_ -= 1429253007 * class600.anInt7860;
	if (i_69_ < 0)
	    i_69_ = 0;
	else if (i_69_ >= client.aClass507_11137.method8352((byte) -52))
	    i_69_ = client.aClass507_11137.method8352((byte) -101);
	client.anInt11174 = 963088687 * (256 + (i_68_ << 9));
	client.anInt11112 = -285088765 * ((i_69_ << 9) + 256);
	Class700.anInt8779 = 445996838;
	Class648.anInt8363 = -1945230309;
	Class198_Sub3.anInt9911 = 56698409;
	client.aBool11364 = true;
    }
    
    static final void method10466(Class683 class683, int i) {
	int i_70_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	class683.anInt8644 -= -1723845246;
	String string
	    = ((String)
	       class683.anObjectArray8636[1373599041 * class683.anInt8644]);
	String string_71_ = (String) (class683.anObjectArray8636
				      [class683.anInt8644 * 1373599041 + 1]);
	if (string.length() <= 500 && string_71_.length() <= 500)
	    Class64.method1406(i_70_, string, string_71_, 1008177208);
    }
    
    static final void method10467(Class683 class683, short i) {
	class683.anInt8662 -= 1552651121;
    }
    
    static final void method10468(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	if (-1 == class679.aClass259_8623.anInt2576 * 1534974651) {
	    if (class683.aBool8665)
		throw new RuntimeException("");
	    throw new RuntimeException("");
	}
	Class259 class259 = class679.method11188(-1818714362);
	class259.aClass259Array2655[(1534974651
				     * class679.aClass259_8623.anInt2576)]
	    = null;
	Class649.method10708(class259, (byte) 0);
    }
}
