/* Class656_Sub1_Sub3_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class656_Sub1_Sub3_Sub1_Sub1 extends Class656_Sub1_Sub3_Sub1
{
    String aString12230;
    public String aString12231;
    public int anInt12232;
    String aString12233;
    public int anInt12234;
    public byte aByte12235 = 0;
    public int[] anIntArray12236;
    public int[] anIntArray12237;
    public int anInt12238;
    public int anInt12239;
    public int anInt12240;
    public String aString12241;
    public int anInt12242;
    public boolean aBool12243;
    public int anInt12244;
    public int anInt12245;
    public Class637 aClass637_12246;
    public int anInt12247;
    public int anInt12248;
    public int anInt12249;
    public int anInt12250;
    int anInt12251;
    public Class243 aClass243_12252;
    public Class627 aClass627_12253;
    public boolean aBool12254;
    
    public void method18902(String string, int i, int i_0_) {
	method18617(string, i, i_0_,
		    (Class424.method6768(1684836768)
		     * (-940740541 * Class138.aClass631_1641.anInt8210)),
		    -1778278627);
    }
    
    public int method77() {
	return anInt11964 * 2032864281;
    }
    
    public Class656_Sub1_Sub3_Sub1_Sub1(Class546 class546, int i) {
	super(class546, i, Class109.aClass106_Sub1_Sub1_1323);
	anIntArray12236 = new int[8];
	anIntArray12237 = new int[8];
	anInt12232 = 0;
	anInt12234 = 0;
	anInt12240 = 962715729;
	anInt12239 = 0;
	anInt12242 = 1066304989;
	aBool12243 = false;
	anInt12244 = 0;
	anInt12247 = 1527284055;
	anInt12245 = 5812387;
	anInt12238 = -1254477683;
	anInt12248 = 1550973943;
	anInt12249 = 0;
	anInt12250 = -34204833;
	aClass243_12252 = Class243.aClass243_2417;
	aClass627_12253 = Class627.aClass627_8153;
	aBool12254 = false;
	method18912((byte) -125);
    }
    
    public final void method18903(RSBuffer class525_sub38, byte i) {
	class525_sub38.index = 0;
	int i_1_ = class525_sub38.readUnsignedByte(461923198);
	byte i_2_ = (byte) (i_1_ & 0x1);
	boolean bool = 0 != (i_1_ & 0x4);
	int i_3_ = super.method18608((byte) 43);
	method18607((i_1_ >> 3 & 0x7) + 1, 133251852);
	boolean bool_4_ = 0 != (i_1_ & 0x40);
	boolean bool_5_ = 0 != (i_1_ & 0x80);
	Class446 class446 = Class446.method7209(method10818().aClass446_4807);
	class446.aFloat4895 += (float) (method18608((byte) 27) - i_3_ << 8);
	class446.aFloat4897 += (float) (method18608((byte) 24) - i_3_ << 8);
	method10823(class446);
	class446.method7260();
	if (bool_4_)
	    aString12230 = class525_sub38.method16637(-85973121);
	else
	    aString12230 = null;
	if (bool_5_)
	    aString12233 = class525_sub38.method16637(-1648114478);
	else
	    aString12233 = null;
	aClass627_12253
	    = ((Class627)
	       Class539.method8888(Class627.method10269(-1683151307),
				   class525_sub38.readByte(-1150098071),
				   -1386025701));
	if (Class176.aClass685_1884 == Class685.aClass685_8686
	    && 619753713 * client.anInt11231 >= 2)
	    aClass627_12253 = Class627.aClass627_8153;
	method18926(class525_sub38, i_2_, 1726327997);
	aString12241 = class525_sub38.readString((byte) -41);
	aString12231 = aString12241;
	if (this == Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705)
	    RuntimeException_Sub4.aString12140 = aString12241;
	anInt12232 = class525_sub38.readUnsignedByte(1079500951) * 1800335339;
	if (bool) {
	    anInt12239 = class525_sub38.readUnsignedShort((byte) 79) * 171939349;
	    if (anInt12239 * 325617981 == 65535)
		anInt12239 = -171939349;
	    anInt12234 = -1396996145 * anInt12232;
	    anInt12240 = 962715729;
	} else {
	    anInt12239 = 0;
	    anInt12234 = class525_sub38.readUnsignedByte(1893487886) * -1979585531;
	    anInt12240 = class525_sub38.readUnsignedByte(1024808539) * -962715729;
	    if (anInt12240 * -1799579825 == 255)
		anInt12240 = 962715729;
	}
	int i_6_ = anInt12249 * -1464774485;
	anInt12249 = class525_sub38.readUnsignedByte(1217230485) * -1408226813;
	if (anInt12249 * -1464774485 != 0) {
	    int i_7_ = anInt12247 * -1422129767;
	    int i_8_ = 2100329717 * anInt12245;
	    int i_9_ = 2025647547 * anInt12238;
	    int i_10_ = anInt12248 * 1428343353;
	    int i_11_ = anInt12250 * -1288202655;
	    anInt12247 = class525_sub38.readUnsignedShort((byte) 63) * -1527284055;
	    anInt12245 = class525_sub38.readUnsignedShort((byte) 37) * -5812387;
	    anInt12238 = class525_sub38.readUnsignedShort((byte) 4) * 1254477683;
	    anInt12248 = class525_sub38.readUnsignedShort((byte) 78) * -1550973943;
	    anInt12250 = class525_sub38.readUnsignedByte(1180773046) * -1718121055;
	    if (i_6_ != -1464774485 * anInt12249
		|| i_7_ != -1422129767 * anInt12247
		|| anInt12245 * 2100329717 != i_8_
		|| anInt12238 * 2025647547 != i_9_
		|| 1428343353 * anInt12248 != i_10_
		|| -1288202655 * anInt12250 != i_11_)
		Class513.method8550(this, 433154622);
	} else
	    Class406.method6615(this, 405863800);
    }
    
    public void method18904(RSBuffer class525_sub38, int i) {
	class525_sub38.index = 0;
	int i_12_ = class525_sub38.readUnsignedByte(758111468);
	for (int i_13_ = 0; i_13_ < anIntArray12236.length; i_13_++) {
	    if ((i_12_ & 1 << i_13_) != 0) {
		int i_14_ = class525_sub38.readUnsignedByte(1569915434);
		int i_15_ = class525_sub38.readUnsignedShort((byte) 18);
		anIntArray12236[i_13_] = i_14_;
		anIntArray12237[i_13_] = i_15_;
	    } else {
		anIntArray12236[i_13_] = -1;
		anIntArray12237[i_13_] = -1;
	    }
	}
    }
    
    public Class656_Sub1_Sub3_Sub1_Sub1(Class546 class546) {
	super(class546, Class109.aClass106_Sub1_Sub1_1323);
	anIntArray12236 = new int[8];
	anIntArray12237 = new int[8];
	anInt12232 = 0;
	anInt12234 = 0;
	anInt12240 = 962715729;
	anInt12239 = 0;
	anInt12242 = 1066304989;
	aBool12243 = false;
	anInt12244 = 0;
	anInt12247 = 1527284055;
	anInt12245 = 5812387;
	anInt12238 = -1254477683;
	anInt12248 = 1550973943;
	anInt12249 = 0;
	anInt12250 = -34204833;
	aClass243_12252 = Class243.aClass243_2417;
	aClass627_12253 = Class627.aClass627_8153;
	aBool12254 = false;
	method18912((byte) -97);
    }
    
    public Class553 method16919(Class182 class182, short i) {
	return null;
    }
    
    public Class525_Sub28 method179() {
	Class600 class600 = client.aClass507_11137.method8350(812836064);
	return (Class514.method8554
		(aByte10867,
		 ((int) method10818().aClass446_4807.aFloat4895
		  + class600.anInt7858 * -1159839232),
		 -(int) method10818().aClass446_4807.aFloat4896,
		 ((int) method10818().aClass446_4807.aFloat4897
		  + class600.anInt7860 * 1633099264),
		 1049155756));
    }
    
    void method16918(Class182 class182, int i) {
	if (aClass637_12246 != null
	    && (aBool12023 || method18906(class182, 0, (byte) -102))) {
	    Class444 class444 = class182.method3225();
	    class444.method7131(method10818());
	    class444.method7147(0.0F, -5.0F, 0.0F);
	    method18601(class182, aClass179Array12010, class444, aBool12023,
			2080733425);
	    for (int i_16_ = 0; i_16_ < aClass179Array12010.length; i_16_++)
		aClass179Array12010[i_16_] = null;
	}
    }
    
    void method18905(Class182 class182, Class444 class444, Class179 class179,
		     long l, long l_17_, int i, long l_18_) {
	long l_19_ = l_17_ * l_17_ + l * l;
	if (l_19_ >= 262144L && l_19_ <= l_18_) {
	    int i_20_
		= ((int) ((Math.atan2((double) l, (double) l_17_)
			   * 2607.5945876176133)
			  - (double) aClass64_11992.method1393((short) 5178))
		   & 0x3fff);
	    Class179 class179_21_
		= Class313_Sub2.method15734(class182, i_20_,
					    anInt11971 * -2009365071,
					    anInt11972 * 1295175615,
					    -827965183 * anInt11973, i,
					    (byte) -30);
	    if (class179_21_ != null) {
		class182.method3235(false);
		class179_21_.method2953(class444, null, 0);
		class182.method3235(true);
	    }
	}
    }
    
    boolean method18906(Class182 class182, int i, byte i_22_) {
	int i_23_ = i;
	Class586 class586 = method18633((byte) -107);
	Class689 class689 = ((aClass689_11987.method14021(-1475998132)
			      && !aClass689_11987.method14030(-1513919586))
			     ? aClass689_11987 : null);
	Class689_Sub1 class689_sub1
	    = ((aClass689_Sub1_11986.method14021(-1115958814) && !aBool12243
		&& (!aClass689_Sub1_11986.aBool11017 || null == class689))
	       ? aClass689_Sub1_11986 : null);
	int i_24_ = class586.anInt7751 * 174151703;
	int i_25_ = class586.anInt7752 * -429863361;
	if (i_24_ != 0 || i_25_ != 0 || 1307034469 * class586.anInt7748 != 0
	    || class586.anInt7767 * 1272709361 != 0)
	    i |= 0x7;
	int i_26_ = aClass64_11992.method1393((short) 9360);
	boolean bool
	    = (0 != aByte11979 && client.anInt11083 >= 1656114695 * anInt11981
	       && client.anInt11083 < anInt11999 * 59570639);
	if (bool)
	    i |= 0x80000;
	Class179 class179
	    = (aClass179Array12010[0]
	       = (aClass637_12246.method10482
		  (class182, i, Class227.aClass40_Sub1_2345,
		   Class38.aClass40_Sub9_328, Class168_Sub1.aClass40_Sub7_9112,
		   Class313_Sub2.aClass40_Sub22_10106, Class532.aClass111_7170,
		   Class532.aClass111_7170, class689, class689_sub1,
		   aClass689_Sub2_Sub1Array11998, anIntArray12008, i_26_, true,
		   Class664.aClass634_8557, 16711935)));
	int i_27_ = Class480.method7821((short) 202);
	if (-855455283 * Class503.anInt5590 < 96 && i_27_ > 50)
	    WorldTile.method1431(531453588);
	if (Class176.aClass685_1884 != Class685.aClass685_8686 && i_27_ < 50) {
	    int i_28_;
	    for (i_28_ = 50 - i_27_; i_28_ > client.anInt11082 * -397199891;
		 client.anInt11082 += -401903643)
		Class329.aByteArrayArray3591[-397199891 * client.anInt11082]
		    = new byte[102400];
	    while (i_28_ < -397199891 * client.anInt11082) {
		client.anInt11082 -= -401903643;
		Class329.aByteArrayArray3591[client.anInt11082 * -397199891]
		    = null;
	    }
	} else if (Class685.aClass685_8686 != Class176.aClass685_1884) {
	    Class329.aByteArrayArray3591 = new byte[50][];
	    client.anInt11082 = 0;
	}
	if (null == class179)
	    return false;
	anInt12025 = class179.method2960() * -411987203;
	anInt11988 = class179.method2964() * -1125261377;
	class179.method2957();
	method18672(class179, 376863521);
	if (0 != i_24_ || i_25_ != 0) {
	    method18612(i_26_, i_24_, i_25_, class586.anInt7753 * 1056489539,
			class586.anInt7754 * -1802986919, -2124782429);
	    if (anInt11971 * -2009365071 != 0)
		class179.method2932(-2009365071 * anInt11971);
	    if (0 != 1295175615 * anInt11972)
		class179.method2933(anInt11972 * 1295175615);
	    if (-827965183 * anInt11973 != 0)
		class179.method2934(0, -827965183 * anInt11973, 0);
	} else
	    method18612(i_26_, method18608((byte) 40) << 9,
			method18608((byte) 72) << 9, 0, 0, -2140394856);
	if (bool)
	    class179.method2974(aByte12000, aByte12001, aByte12002,
				aByte11979 & 0xff);
	if (!aBool12243)
	    method18611(class182, class586, i_23_, i_24_, i_25_, i_26_,
			(short) 8192);
	return true;
    }
    
    public String method18907(boolean bool, int i) {
	String string = "";
	if (null != aString12230)
	    string = aString12230;
	if (bool)
	    string = new StringBuilder().append(string).append
			 (aString12241).toString();
	else
	    string = new StringBuilder().append(string).append
			 (aString12231).toString();
	if (aString12233 != null)
	    string = new StringBuilder().append(string).append
			 (aString12233).toString();
	return string;
    }
    
    public String method18908(boolean bool, byte i) {
	if (bool)
	    return aString12241;
	return aString12231;
    }
    
    public final void method18909(int i, int i_29_, byte i_30_, short i_31_) {
	if (aClass689_11987.method14021(1876001888)
	    && (aClass689_11987.method14058(-740785641).walkingPrecedence * -764414887
		== 1)) {
	    anIntArray11985 = null;
	    aClass689_11987.method14068(-1, (byte) -116);
	}
	for (int i_32_ = 0; i_32_ < aClass540Array12029.length; i_32_++) {
	    if (1420286373 * aClass540Array12029[i_32_].anInt7182 != -1) {
		Class674 class674
		    = ((Class674)
		       (Class574.aClass40_Sub20_7645.method76
			(1420286373 * aClass540Array12029[i_32_].anInt7182,
			 1200957056)));
		if (class674.aBool8608 && -1 != class674.anInt8596 * 1700860103
		    && (((AnimationDefinition)
			 Class685.aClass40_Sub8_8691.method76(((class674
								.anInt8596)
							       * 1700860103),
							      -1324635057))
			.walkingPrecedence) * -764414887 == 1) {
		    aClass540Array12029[i_32_].aClass689_7183
			.method14068(-1, (byte) -128);
		    aClass540Array12029[i_32_].anInt7182 = -637232685;
		}
	    }
	}
	anInt12242 = 1066304989;
	if (i < 0 || i >= client.aClass507_11137.method8412(2031492790)
	    || i_29_ < 0
	    || i_29_ >= client.aClass507_11137.method8352((byte) -125))
	    method18910(i, i_29_, -1893439795);
	else if (anIntArray12014[0] < 0
		 || (anIntArray12014[0]
		     >= client.aClass507_11137.method8412(2049112975))
		 || anIntArray12017[0] < 0
		 || (anIntArray12017[0]
		     >= client.aClass507_11137.method8352((byte) -110)))
	    method18910(i, i_29_, 618732797);
	else
	    method18911(i, i_29_, i_30_, -2090356427);
    }
    
    public void method18910(int i, int i_33_, int i_34_) {
	anInt12015 = 0;
	anInt11970 = 0;
	anInt12019 = 0;
	anIntArray12014[0] = i;
	anIntArray12017[0] = i_33_;
	int i_35_ = method18608((byte) 50);
	Class446 class446 = Class446.method7209(method10818().aClass446_4807);
	class446.aFloat4895 = (float) (anIntArray12014[0] * 512 + i_35_ * 256);
	class446.aFloat4897 = (float) (512 * anIntArray12017[0] + 256 * i_35_);
	method10823(class446);
	class446.method7260();
	if (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705 == this)
	    client.aClass507_11137.method8361((byte) 23)
		.method10398(1432920333);
	if (null != aClass633_12022)
	    aClass633_12022.method10330();
    }
    
    final void method18911(int i, int i_36_, byte i_37_, int i_38_) {
	if (-2046237799 * anInt12015 < anIntArray12014.length - 1)
	    anInt12015 += -901267287;
	for (int i_39_ = anInt12015 * -2046237799; i_39_ > 0; i_39_--) {
	    anIntArray12014[i_39_] = anIntArray12014[i_39_ - 1];
	    anIntArray12017[i_39_] = anIntArray12017[i_39_ - 1];
	    aByteArray12007[i_39_] = aByteArray12007[i_39_ - 1];
	}
	anIntArray12014[0] = i;
	anIntArray12017[0] = i_36_;
	aByteArray12007[0] = i_37_;
    }
    
    void method18912(byte i) {
	for (int i_40_ = 0; i_40_ < anIntArray12236.length; i_40_++)
	    anIntArray12236[i_40_] = -1;
	for (int i_41_ = 0; i_41_ < anIntArray12237.length; i_41_++)
	    anIntArray12237[i_41_] = -1;
    }
    
    boolean method16940(Class182 class182, int i, int i_42_) {
	if (null == aClass637_12246
	    || !method18906(class182, 131072, (byte) -26))
	    return false;
	Class444 class444 = method10826();
	boolean bool = false;
	for (int i_43_ = 0; i_43_ < aClass179Array12010.length; i_43_++) {
	    if (aClass179Array12010[i_43_] != null
		&& aClass179Array12010[i_43_].aBool1917
		&& aClass179Array12010[i_43_].method2954(i, i_42_, class444,
							 true, 0)) {
		bool = true;
		break;
	    }
	}
	for (int i_44_ = 0; i_44_ < aClass179Array12010.length; i_44_++)
	    aClass179Array12010[i_44_] = null;
	return bool;
    }
    
    int method18626(byte i) {
	return anInt12251 * -1760056561;
    }
    
    public int method18613(int i) {
	return -1;
    }
    
    boolean method16910(Class182 class182, int i, int i_45_, byte i_46_) {
	if (null == aClass637_12246
	    || !method18906(class182, 131072, (byte) -108))
	    return false;
	Class444 class444 = method10826();
	boolean bool = false;
	for (int i_47_ = 0; i_47_ < aClass179Array12010.length; i_47_++) {
	    if (aClass179Array12010[i_47_] != null
		&& aClass179Array12010[i_47_].aBool1917
		&& aClass179Array12010[i_47_].method2954(i, i_45_, class444,
							 true, 0)) {
		bool = true;
		break;
	    }
	}
	for (int i_48_ = 0; i_48_ < aClass179Array12010.length; i_48_++)
	    aClass179Array12010[i_48_] = null;
	return bool;
    }
    
    final boolean method16912(int i) {
	return false;
    }
    
    final void method16915(Class182 class182, Class656_Sub1 class656_sub1,
			   int i, int i_49_, int i_50_, boolean bool,
			   int i_51_) {
	throw new IllegalStateException();
    }
    
    final void method16916(int i) {
	throw new IllegalStateException();
    }
    
    public String method18913(boolean bool) {
	if (bool)
	    return aString12241;
	return aString12231;
    }
    
    public void method18914(String string, int i, int i_52_, int i_53_) {
	method18617(string, i, i_52_,
		    (Class424.method6768(1684836768)
		     * (-940740541 * Class138.aClass631_1641.anInt8210)),
		    -1778278627);
    }
    
    void method18915() {
	for (int i = 0; i < anIntArray12236.length; i++)
	    anIntArray12236[i] = -1;
	for (int i = 0; i < anIntArray12237.length; i++)
	    anIntArray12237[i] = -1;
    }
    
    final boolean method16943() {
	return false;
    }
    
    public int method72(int i) {
	return anInt11964 * 2032864281;
    }
    
    public Class525_Sub28 method171(int i) {
	Class600 class600 = client.aClass507_11137.method8350(-1588062876);
	return (Class514.method8554
		(aByte10867,
		 ((int) method10818().aClass446_4807.aFloat4895
		  + class600.anInt7858 * -1159839232),
		 -(int) method10818().aClass446_4807.aFloat4896,
		 ((int) method10818().aClass446_4807.aFloat4897
		  + class600.anInt7860 * 1633099264),
		 799699677));
    }
    
    public Class429 method173(int i) {
	Class429 class429 = Class429.method6864();
	class429.method6821(Class436.method7071(2030157131
						* aClass64_11992.anInt694),
			    0.0F, 0.0F);
	return class429;
    }
    
    public Class446 method172(int i) {
	return Class446.method7207();
    }
    
    public int method18600(int i) {
	return -(2032864281 * anInt11964) - 1;
    }
    
    public final void method18916(int i, int i_54_, byte i_55_) {
	if (aClass689_11987.method14021(-32324512)
	    && (aClass689_11987.method14058(-820382496).walkingPrecedence * -764414887
		== 1)) {
	    anIntArray11985 = null;
	    aClass689_11987.method14068(-1, (byte) -2);
	}
	for (int i_56_ = 0; i_56_ < aClass540Array12029.length; i_56_++) {
	    if (1420286373 * aClass540Array12029[i_56_].anInt7182 != -1) {
		Class674 class674
		    = ((Class674)
		       (Class574.aClass40_Sub20_7645.method76
			(1420286373 * aClass540Array12029[i_56_].anInt7182,
			 -1854599138)));
		if (class674.aBool8608 && -1 != class674.anInt8596 * 1700860103
		    && (((AnimationDefinition)
			 Class685.aClass40_Sub8_8691.method76(((class674
								.anInt8596)
							       * 1700860103),
							      956557309))
			.walkingPrecedence) * -764414887 == 1) {
		    aClass540Array12029[i_56_].aClass689_7183
			.method14068(-1, (byte) -29);
		    aClass540Array12029[i_56_].anInt7182 = -637232685;
		}
	    }
	}
	anInt12242 = 1066304989;
	if (i < 0 || i >= client.aClass507_11137.method8412(1451656060)
	    || i_54_ < 0
	    || i_54_ >= client.aClass507_11137.method8352((byte) -107))
	    method18910(i, i_54_, 926793334);
	else if (anIntArray12014[0] < 0
		 || (anIntArray12014[0]
		     >= client.aClass507_11137.method8412(1059662818))
		 || anIntArray12017[0] < 0
		 || (anIntArray12017[0]
		     >= client.aClass507_11137.method8352((byte) -34)))
	    method18910(i, i_54_, -283530374);
	else
	    method18911(i, i_54_, i_55_, -1650191016);
    }
    
    public Class307 method175() {
	return Class307.aClass307_3416;
    }
    
    public int method8() {
	return anInt11964 * 2032864281;
    }
    
    public Class446 method184() {
	return Class446.method7207();
    }
    
    void method16938(Class182 class182) {
	if (aClass637_12246 != null
	    && (aBool12023 || method18906(class182, 0, (byte) -105))) {
	    Class444 class444 = class182.method3225();
	    class444.method7131(method10818());
	    class444.method7147(0.0F, -5.0F, 0.0F);
	    method18601(class182, aClass179Array12010, class444, aBool12023,
			330356959);
	    for (int i = 0; i < aClass179Array12010.length; i++)
		aClass179Array12010[i] = null;
	}
    }
    
    public int method83() {
	return anInt11964 * 2032864281;
    }
    
    public Class525_Sub28 method177() {
	Class600 class600 = client.aClass507_11137.method8350(-904082533);
	return (Class514.method8554
		(aByte10867,
		 ((int) method10818().aClass446_4807.aFloat4895
		  + class600.anInt7858 * -1159839232),
		 -(int) method10818().aClass446_4807.aFloat4896,
		 ((int) method10818().aClass446_4807.aFloat4897
		  + class600.anInt7860 * 1633099264),
		 698301548));
    }
    
    public Class525_Sub28 method178() {
	Class600 class600 = client.aClass507_11137.method8350(-770462720);
	return (Class514.method8554
		(aByte10867,
		 ((int) method10818().aClass446_4807.aFloat4895
		  + class600.anInt7858 * -1159839232),
		 -(int) method10818().aClass446_4807.aFloat4896,
		 ((int) method10818().aClass446_4807.aFloat4897
		  + class600.anInt7860 * 1633099264),
		 2142611031));
    }
    
    public boolean method18643(byte i) {
	return Class138.aClass631_1641.aBool8189;
    }
    
    public Class429 method176() {
	Class429 class429 = Class429.method6864();
	class429.method6821(Class436.method7071(2030157131
						* aClass64_11992.anInt694),
			    0.0F, 0.0F);
	return class429;
    }
    
    int method18674() {
	return anInt12251 * -1760056561;
    }
    
    public Class429 method182() {
	Class429 class429 = Class429.method6864();
	class429.method6821(Class436.method7071(2030157131
						* aClass64_11992.anInt694),
			    0.0F, 0.0F);
	return class429;
    }
    
    void method18917(Class182 class182, Class444 class444, Class179 class179,
		     long l, long l_57_, int i, long l_58_) {
	long l_59_ = l_57_ * l_57_ + l * l;
	if (l_59_ >= 262144L && l_59_ <= l_58_) {
	    int i_60_
		= ((int) ((Math.atan2((double) l, (double) l_57_)
			   * 2607.5945876176133)
			  - (double) aClass64_11992.method1393((short) 25068))
		   & 0x3fff);
	    Class179 class179_61_
		= Class313_Sub2.method15734(class182, i_60_,
					    anInt11971 * -2009365071,
					    anInt11972 * 1295175615,
					    -827965183 * anInt11973, i,
					    (byte) -123);
	    if (class179_61_ != null) {
		class182.method3235(false);
		class179_61_.method2953(class444, null, 0);
		class182.method3235(true);
	    }
	}
    }
    
    public int method71() {
	return anInt11964 * 2032864281;
    }
    
    public Class446 method185() {
	return Class446.method7207();
    }
    
    void method16963(Class182 class182) {
	if (aClass637_12246 != null
	    && (aBool12023 || method18906(class182, 0, (byte) -101))) {
	    Class444 class444 = class182.method3225();
	    class444.method7131(method10818());
	    class444.method7147(0.0F, -5.0F, 0.0F);
	    method18601(class182, aClass179Array12010, class444, aBool12023,
			-1103158625);
	    for (int i = 0; i < aClass179Array12010.length; i++)
		aClass179Array12010[i] = null;
	}
    }
    
    void method18918(Class182 class182, Class444 class444, Class179 class179,
		     long l, long l_62_, int i, long l_63_) {
	long l_64_ = l_62_ * l_62_ + l * l;
	if (l_64_ >= 262144L && l_64_ <= l_63_) {
	    int i_65_
		= ((int) ((Math.atan2((double) l, (double) l_62_)
			   * 2607.5945876176133)
			  - (double) aClass64_11992.method1393((short) 30574))
		   & 0x3fff);
	    Class179 class179_66_
		= Class313_Sub2.method15734(class182, i_65_,
					    anInt11971 * -2009365071,
					    anInt11972 * 1295175615,
					    -827965183 * anInt11973, i,
					    (byte) -35);
	    if (class179_66_ != null) {
		class182.method3235(false);
		class179_66_.method2953(class444, null, 0);
		class182.method3235(true);
	    }
	}
    }
    
    boolean method16939(Class182 class182, int i, int i_67_) {
	if (null == aClass637_12246
	    || !method18906(class182, 131072, (byte) -43))
	    return false;
	Class444 class444 = method10826();
	boolean bool = false;
	for (int i_68_ = 0; i_68_ < aClass179Array12010.length; i_68_++) {
	    if (aClass179Array12010[i_68_] != null
		&& aClass179Array12010[i_68_].aBool1917
		&& aClass179Array12010[i_68_].method2954(i, i_67_, class444,
							 true, 0)) {
		bool = true;
		break;
	    }
	}
	for (int i_69_ = 0; i_69_ < aClass179Array12010.length; i_69_++)
	    aClass179Array12010[i_69_] = null;
	return bool;
    }
    
    public Class429 method181() {
	Class429 class429 = Class429.method6864();
	class429.method6821(Class436.method7071(2030157131
						* aClass64_11992.anInt694),
			    0.0F, 0.0F);
	return class429;
    }
    
    boolean method16965(Class182 class182, int i, int i_70_) {
	if (null == aClass637_12246
	    || !method18906(class182, 131072, (byte) -74))
	    return false;
	Class444 class444 = method10826();
	boolean bool = false;
	for (int i_71_ = 0; i_71_ < aClass179Array12010.length; i_71_++) {
	    if (aClass179Array12010[i_71_] != null
		&& aClass179Array12010[i_71_].aBool1917
		&& aClass179Array12010[i_71_].method2954(i, i_70_, class444,
							 true, 0)) {
		bool = true;
		break;
	    }
	}
	for (int i_72_ = 0; i_72_ < aClass179Array12010.length; i_72_++)
	    aClass179Array12010[i_72_] = null;
	return bool;
    }
    
    final boolean method16957() {
	return false;
    }
    
    public Class429 method183() {
	Class429 class429 = Class429.method6864();
	class429.method6821(Class436.method7071(2030157131
						* aClass64_11992.anInt694),
			    0.0F, 0.0F);
	return class429;
    }
    
    public int method18677() {
	return -1;
    }
    
    final boolean method16945() {
	return false;
    }
    
    final boolean method16944() {
	return false;
    }
    
    public Class307 method174() {
	return Class307.aClass307_3416;
    }
    
    public int method18662() {
	if (null != aClass637_12246
	    && -1172437919 * aClass637_12246.anInt8300 != -1)
	    return (((NPCDefinitions) (Class168_Sub1.aClass40_Sub7_9112.method76
				 (-1172437919 * aClass637_12246.anInt8300,
				  -576068277))).anInt3291
		    * 1035256919);
	return super.method18608((byte) 122);
    }
    
    public int method18693() {
	return -(2032864281 * anInt11964) - 1;
    }
    
    int method18675() {
	return anInt12251 * -1760056561;
    }
    
    public final boolean method18919(byte i) {
	if (aClass637_12246 == null)
	    return false;
	return true;
    }
    
    public String method18920(boolean bool) {
	String string = "";
	if (null != aString12230)
	    string = aString12230;
	if (bool)
	    string = new StringBuilder().append(string).append
			 (aString12241).toString();
	else
	    string = new StringBuilder().append(string).append
			 (aString12231).toString();
	if (aString12233 != null)
	    string = new StringBuilder().append(string).append
			 (aString12233).toString();
	return string;
    }
    
    public boolean method18678() {
	return Class138.aClass631_1641.aBool8189;
    }
    
    public boolean method18679() {
	return Class138.aClass631_1641.aBool8189;
    }
    
    public Class524 method18635() {
	if (aClass524_11975 != null) {
	    if (null == aClass524_11975.aString7109)
		return null;
	    if (-664017801 * client.anInt11332 == 0
		|| -664017801 * client.anInt11332 == 3
		|| (1 == client.anInt11332 * -664017801
		    && Class666.method11024(aString12231, 596945279)))
		return aClass524_11975;
	}
	return null;
    }
    
    public Class524 method18641() {
	if (aClass524_11975 != null) {
	    if (null == aClass524_11975.aString7109)
		return null;
	    if (-664017801 * client.anInt11332 == 0
		|| -664017801 * client.anInt11332 == 3
		|| (1 == client.anInt11332 * -664017801
		    && Class666.method11024(aString12231, 596945279)))
		return aClass524_11975;
	}
	return null;
    }
    
    public String method18921(boolean bool) {
	String string = "";
	if (null != aString12230)
	    string = aString12230;
	if (bool)
	    string = new StringBuilder().append(string).append
			 (aString12241).toString();
	else
	    string = new StringBuilder().append(string).append
			 (aString12231).toString();
	if (aString12233 != null)
	    string = new StringBuilder().append(string).append
			 (aString12233).toString();
	return string;
    }
    
    public Class553 method16946(Class182 class182) {
	return null;
    }
    
    public Class553 method16953(Class182 class182) {
	return null;
    }
    
    public int method18663() {
	if (null != aClass637_12246
	    && -1172437919 * aClass637_12246.anInt8300 != -1)
	    return (((NPCDefinitions) (Class168_Sub1.aClass40_Sub7_9112.method76
				 (-1172437919 * aClass637_12246.anInt8300,
				  336723336))).anInt3291
		    * 1035256919);
	return super.method18608((byte) 69);
    }
    
    public Class553 method16955(Class182 class182) {
	return null;
    }
    
    final void method16951() {
	throw new IllegalStateException();
    }
    
    public void method18922(RSBuffer class525_sub38, byte i) {
	aByte12235 = i;
	int i_73_ = -1;
	anInt12244 = 0;
	int[] is = new int[Class664.aClass634_8557.anIntArray8244.length];
	Class2[] class2s
	    = new Class2[Class664.aClass634_8557.anIntArray8244.length];
	ItemDefinitions[] class8s
	    = new ItemDefinitions[Class664.aClass634_8557.anIntArray8244.length];
	for (int i_74_ = 0;
	     i_74_ < Class664.aClass634_8557.anIntArray8244.length; i_74_++) {
	    if (1 != Class664.aClass634_8557.anIntArray8244[i_74_]) {
		int i_75_ = class525_sub38.readUnsignedByte(1954152408);
		if (i_75_ == 0)
		    is[i_74_] = 0;
		else {
		    int i_76_ = class525_sub38.readUnsignedByte(1371665660);
		    int i_77_ = (i_75_ << 8) + i_76_;
		    if (0 == i_74_ && i_77_ == 65535) {
			i_73_ = class525_sub38.readBigSmart(-2043778683);
			anInt12244 = (class525_sub38.readUnsignedByte(945989641)
				      * 1742874197);
			break;
		    }
		    if (i_77_ >= 16384) {
			i_77_ -= 16384;
			is[i_74_] = i_77_ | 0x40000000;
			class8s[i_74_]
			    = (ItemDefinitions) Class313_Sub2.aClass40_Sub22_10106
					   .method76(i_77_, -2066562272);
			int i_78_ = 714429443 * class8s[i_74_].anInt88;
			if (i_78_ != 0)
			    anInt12244 = i_78_ * 1742874197;
		    } else
			is[i_74_] = i_77_ - 256 | ~0x7fffffff;
		}
	    }
	}
	if (i_73_ == -1) {
	    int i_79_ = class525_sub38.readUnsignedShort((byte) 31);
	    int i_80_ = 0;
	    for (int i_81_ = 0;
		 i_81_ < Class664.aClass634_8557.anIntArray8244.length;
		 i_81_++) {
		if (Class664.aClass634_8557.anIntArray8244[i_81_] == 0) {
		    if (0 != (i_79_ & 1 << i_80_))
			class2s[i_81_]
			    = Class511.method8529(class8s[i_81_],
						  class525_sub38, -510852952);
		    i_80_++;
		}
	    }
	}
	int[] is_82_ = new int[10];
	for (int i_83_ = 0; i_83_ < 10; i_83_++) {
	    int i_84_ = class525_sub38.readUnsignedByte(184640483);
	    if (Class525_Sub6.aShortArrayArrayArray10485.length < 1
		|| i_84_ < 0
		|| i_84_ >= (Class525_Sub6.aShortArrayArrayArray10485[i_83_]
			     [0]).length)
		i_84_ = 0;
	    is_82_[i_83_] = i_84_;
	}
	int[] is_85_ = new int[10];
	for (int i_86_ = 0; i_86_ < 10; i_86_++) {
	    int i_87_ = class525_sub38.readUnsignedByte(519777003);
	    if (Class522_Sub1.aShortArrayArrayArray10395.length < 1
		|| i_87_ < 0
		|| i_87_ >= (Class522_Sub1.aShortArrayArrayArray10395[i_86_]
			     [0]).length)
		i_87_ = 0;
	    is_85_[i_86_] = i_87_;
	}
	anInt12251 = class525_sub38.readUnsignedShort((byte) 104) * -1942494225;
	if (null == aClass637_12246)
	    aClass637_12246 = new Class637();
	int i_88_ = -1172437919 * aClass637_12246.anInt8300;
	int[] is_89_ = aClass637_12246.anIntArray8301;
	aClass637_12246.method10476(method18626((byte) 4), is, class2s, is_82_,
				    is_85_, 1 == aByte12235, i_73_,
				    -1565310829);
	if (i_88_ != i_73_) {
	    Class446 class446
		= Class446.method7209(method10818().aClass446_4807);
	    class446.aFloat4895 = (float) ((anIntArray12014[0] << 9)
					   + (method18608((byte) 42) << 8));
	    class446.aFloat4897 = (float) ((anIntArray12017[0] << 9)
					   + (method18608((byte) 106) << 8));
	    method10823(class446);
	    class446.method7260();
	}
	if (615376671 * client.anInt11053 == anInt11964 * 2032864281
	    && is_89_ != null) {
	    for (int i_90_ = 0; i_90_ < is_82_.length; i_90_++) {
		if (is_89_[i_90_] != is_82_[i_90_]) {
		    Class313_Sub2.aClass40_Sub22_10106
			.method17505((short) 255);
		    break;
		}
	    }
	}
	if (aClass633_12022 != null)
	    aClass633_12022.method10330();
	if (aClass689_Sub1_11986.method14021(46645719)
	    && aClass689_Sub1_11986.aBool11017) {
	    Class586 class586 = method18633((byte) -32);
	    if (!class586.method9666(aClass689_Sub1_11986
					 .method14048(-32915949),
				     852939004)) {
		aClass689_Sub1_11986.method14068(-1, (byte) -72);
		aClass689_Sub1_11986.aBool11017 = false;
	    }
	}
    }
    
    Class567 method16921(Class182 class182) {
	if (null == aClass637_12246
	    || !method18906(class182, 2048, (byte) -70))
	    return null;
	Class444 class444 = class182.method3225();
	Class444 class444_91_ = method10826();
	Class428 class428 = method10818();
	int i = aClass64_11992.method1393((short) 4600);
	Class547 class547
	    = (aClass546_10872.aClass547ArrayArrayArray7263[aByte10867]
	       [(int) class428.aClass446_4807.aFloat4895 >> 9]
	       [(int) class428.aClass446_4807.aFloat4897 >> 9]);
	if (null != class547 && null != class547.aClass656_Sub1_Sub1_7264) {
	    int i_92_ = (anInt11994 * 2037461243
			 - class547.aClass656_Sub1_Sub1_7264.aShort11836);
	    anInt11994 = 1656838707 * (int) ((float) (anInt11994 * 2037461243)
					     - (float) i_92_ / 10.0F);
	} else
	    anInt11994 = ((int) ((float) (anInt11994 * 2037461243)
				 - (float) (anInt11994 * 2037461243) / 10.0F)
			  * 1656838707);
	class444.method7154(class444_91_);
	class444.method7147(0.0F, (float) (-20 - 2037461243 * anInt11994),
			    0.0F);
	Class567 class567 = null;
	aBool11976 = false;
	if (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub17_10676
		.method17123(-337573215)
	    == 1) {
	    Class586 class586 = method18633((byte) -4);
	    if (class586.aBool7727
		&& (-1172437919 * aClass637_12246.anInt8300 == -1
		    || ((NPCDefinitions) (Class168_Sub1.aClass40_Sub7_9112.method76
				    (aClass637_12246.anInt8300 * -1172437919,
				     1646354621))).aBool3328)) {
		Class689 class689
		    = ((aClass689_11987.method14021(1751899853)
			&& aClass689_11987.method14030(-1182913662))
		       ? aClass689_11987 : null);
		Class689_Sub1 class689_sub1
		    = ((aClass689_Sub1_11986.method14021(334676730)
			&& (!aClass689_Sub1_11986.aBool11017
			    || null == class689))
		       ? aClass689_Sub1_11986 : null);
		short i_93_ = Class138.aClass631_1641.aShort8179;
		byte i_94_ = Class138.aClass631_1641.aByte8180;
		if (-1 != aClass637_12246.anInt8300 * -1172437919) {
		    i_93_ = ((NPCDefinitions)
			     (Class168_Sub1.aClass40_Sub7_9112.method76
			      (aClass637_12246.anInt8300 * -1172437919,
			       -959429251))).aShort3296;
		    i_94_ = ((NPCDefinitions)
			     (Class168_Sub1.aClass40_Sub7_9112.method76
			      (aClass637_12246.anInt8300 * -1172437919,
			       -383213732))).aByte3341;
		}
		Object object = null;
		Class179 class179;
		if (i_93_ > -1
		    && Class198_Sub13.aClass525_Sub30_9973
			   .aClass696_Sub4_10728.method16985(-216238084) == 1)
		    class179 = Class262.method4781(class182, i,
						   anInt11971 * -2009365071,
						   1295175615 * anInt11972,
						   anInt11973 * -827965183,
						   aClass179Array12010[0],
						   i_93_, i_94_,
						   (null != class689_sub1
						    ? (Class689) class689_sub1
						    : class689),
						   1865120651);
		else
		    class179 = Class75.method1553(class182, i,
						  anInt11971 * -2009365071,
						  1295175615 * anInt11972,
						  anInt11973 * -827965183, 1,
						  aClass179Array12010[0], 0, 0,
						  160, 240,
						  (class689_sub1 != null
						   ? (Class689) class689_sub1
						   : class689),
						  2125889198);
		if (class179 != null) {
		    if (null == aClass211Array10869
			|| (aClass211Array10869.length
			    < 1 + aClass179Array12010.length))
			method16961(1 + aClass179Array12010.length, -16711936);
		    class567 = Class293.method5303(true, (short) -26578);
		    aBool11976 = true;
		    class182.method3235(false);
		    class179.method2953(class444,
					(aClass211Array10869
					 [aClass179Array12010.length]),
					0);
		    class182.method3235(true);
		}
	    }
	}
	if (this == Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705) {
	    for (int i_95_ = client.aClass109Array11089.length - 1; i_95_ >= 0;
		 i_95_--) {
		Class109 class109 = client.aClass109Array11089[i_95_];
		if (null != class109 && -1 != 946650107 * class109.anInt1318) {
		    if (class109.anInt1316 * 309020347 == 1) {
			Class525_Sub19 class525_sub19
			    = ((Class525_Sub19)
			       (client.aClass10_11121.method684
				((long) (-110098703 * class109.anInt1319))));
			if (class525_sub19 != null) {
			    Class656_Sub1_Sub3_Sub1_Sub2 class656_sub1_sub3_sub1_sub2
				= ((Class656_Sub1_Sub3_Sub1_Sub2)
				   class525_sub19.anObject10571);
			    Class446 class446
				= (Class446.method7225
				   ((class656_sub1_sub3_sub1_sub2.method10818()
				     .aClass446_4807),
				    Class581
					.aClass656_Sub1_Sub3_Sub1_Sub1_7705
					.method10818().aClass446_4807));
			    int i_96_ = (int) class446.aFloat4895;
			    int i_97_ = (int) class446.aFloat4897;
			    method18905(class182, class444,
					aClass179Array12010[0], (long) i_96_,
					(long) i_97_,
					946650107 * class109.anInt1318,
					92160000L);
			}
		    }
		    if (class109.anInt1316 * 309020347 == 2) {
			Class446 class446
			    = (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
				   .method10818
			       ().aClass446_4807);
			long l = (long) (class109.anInt1313 * 644912697
					 - (int) class446.aFloat4895);
			long l_98_ = (long) (1703881669 * class109.anInt1314
					     - (int) class446.aFloat4897);
			long l_99_
			    = (long) (class109.anInt1315 * 114116079 << 9);
			l_99_ *= l_99_;
			method18905(class182, class444, aClass179Array12010[0],
				    l, l_98_, 946650107 * class109.anInt1318,
				    l_99_);
		    }
		    if (class109.anInt1316 * 309020347 == 10
			&& class109.anInt1319 * -110098703 >= 0
			&& (-110098703 * class109.anInt1319
			    < (client
			       .aClass656_Sub1_Sub3_Sub1_Sub1Array11384).length)) {
			Class656_Sub1_Sub3_Sub1_Sub1 class656_sub1_sub3_sub1_sub1_100_
			    = (client.aClass656_Sub1_Sub3_Sub1_Sub1Array11384
			       [class109.anInt1319 * -110098703]);
			if (null != class656_sub1_sub3_sub1_sub1_100_) {
			    Class446 class446
				= (Class446.method7225
				   (class656_sub1_sub3_sub1_sub1_100_
					.method10818().aClass446_4807,
				    Class581
					.aClass656_Sub1_Sub3_Sub1_Sub1_7705
					.method10818().aClass446_4807));
			    int i_101_ = (int) class446.aFloat4895;
			    int i_102_ = (int) class446.aFloat4897;
			    method18905(class182, class444,
					aClass179Array12010[0], (long) i_101_,
					(long) i_102_,
					class109.anInt1318 * 946650107,
					92160000L);
			}
		    }
		}
	    }
	}
	class444.method7154(class444_91_);
	class444.method7147(0.0F, (float) (-5 - anInt11994 * 2037461243),
			    0.0F);
	if (null == aClass211Array10869
	    || aClass211Array10869.length < aClass179Array12010.length)
	    method16961(aClass179Array12010.length, -16711936);
	if (class567 == null)
	    class567 = Class293.method5303(true, (short) -25829);
	method18601(class182, aClass179Array12010, class444, false, 102312251);
	for (int i_103_ = 0; i_103_ < aClass179Array12010.length; i_103_++) {
	    if (aClass179Array12010[i_103_] != null)
		aClass179Array12010[i_103_].method2953
		    (class444, aClass211Array10869[i_103_],
		     (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705 == this ? 1
		      : 0));
	    else
		aClass211Array10869[i_103_].aBool2265 = false;
	}
	if (aClass633_12022 != null) {
	    Class185 class185 = aClass633_12022.method10350();
	    class182.method3412(class185);
	}
	for (int i_104_ = 0; i_104_ < aClass179Array12010.length; i_104_++) {
	    if (aClass179Array12010[i_104_] != null)
		aBool11976 |= aClass179Array12010[i_104_].method3017();
	    aClass179Array12010[i_104_] = null;
	}
	anInt11963 = client.anInt11267 * 217032817;
	return class567;
    }
    
    public void method18923(RSBuffer class525_sub38, byte i) {
	aByte12235 = i;
	int i_105_ = -1;
	anInt12244 = 0;
	int[] is = new int[Class664.aClass634_8557.anIntArray8244.length];
	Class2[] class2s
	    = new Class2[Class664.aClass634_8557.anIntArray8244.length];
	ItemDefinitions[] class8s
	    = new ItemDefinitions[Class664.aClass634_8557.anIntArray8244.length];
	for (int i_106_ = 0;
	     i_106_ < Class664.aClass634_8557.anIntArray8244.length;
	     i_106_++) {
	    if (1 != Class664.aClass634_8557.anIntArray8244[i_106_]) {
		int i_107_ = class525_sub38.readUnsignedByte(1136251464);
		if (i_107_ == 0)
		    is[i_106_] = 0;
		else {
		    int i_108_ = class525_sub38.readUnsignedByte(1971498375);
		    int i_109_ = (i_107_ << 8) + i_108_;
		    if (0 == i_106_ && i_109_ == 65535) {
			i_105_ = class525_sub38.readBigSmart(-2043778683);
			anInt12244 = (class525_sub38.readUnsignedByte(1907164463)
				      * 1742874197);
			break;
		    }
		    if (i_109_ >= 16384) {
			i_109_ -= 16384;
			is[i_106_] = i_109_ | 0x40000000;
			class8s[i_106_]
			    = (ItemDefinitions) Class313_Sub2.aClass40_Sub22_10106
					   .method76(i_109_, 2078046189);
			int i_110_ = 714429443 * class8s[i_106_].anInt88;
			if (i_110_ != 0)
			    anInt12244 = i_110_ * 1742874197;
		    } else
			is[i_106_] = i_109_ - 256 | ~0x7fffffff;
		}
	    }
	}
	if (i_105_ == -1) {
	    int i_111_ = class525_sub38.readUnsignedShort((byte) 38);
	    int i_112_ = 0;
	    for (int i_113_ = 0;
		 i_113_ < Class664.aClass634_8557.anIntArray8244.length;
		 i_113_++) {
		if (Class664.aClass634_8557.anIntArray8244[i_113_] == 0) {
		    if (0 != (i_111_ & 1 << i_112_))
			class2s[i_113_]
			    = Class511.method8529(class8s[i_113_],
						  class525_sub38, -510852952);
		    i_112_++;
		}
	    }
	}
	int[] is_114_ = new int[10];
	for (int i_115_ = 0; i_115_ < 10; i_115_++) {
	    int i_116_ = class525_sub38.readUnsignedByte(354920090);
	    if (Class525_Sub6.aShortArrayArrayArray10485.length < 1
		|| i_116_ < 0
		|| i_116_ >= (Class525_Sub6.aShortArrayArrayArray10485[i_115_]
			      [0]).length)
		i_116_ = 0;
	    is_114_[i_115_] = i_116_;
	}
	int[] is_117_ = new int[10];
	for (int i_118_ = 0; i_118_ < 10; i_118_++) {
	    int i_119_ = class525_sub38.readUnsignedByte(94636854);
	    if (Class522_Sub1.aShortArrayArrayArray10395.length < 1
		|| i_119_ < 0
		|| i_119_ >= (Class522_Sub1.aShortArrayArrayArray10395[i_118_]
			      [0]).length)
		i_119_ = 0;
	    is_117_[i_118_] = i_119_;
	}
	anInt12251 = class525_sub38.readUnsignedShort((byte) 14) * -1942494225;
	if (null == aClass637_12246)
	    aClass637_12246 = new Class637();
	int i_120_ = -1172437919 * aClass637_12246.anInt8300;
	int[] is_121_ = aClass637_12246.anIntArray8301;
	aClass637_12246.method10476(method18626((byte) 4), is, class2s,
				    is_114_, is_117_, 1 == aByte12235, i_105_,
				    -1876281057);
	if (i_120_ != i_105_) {
	    Class446 class446
		= Class446.method7209(method10818().aClass446_4807);
	    class446.aFloat4895 = (float) ((anIntArray12014[0] << 9)
					   + (method18608((byte) 50) << 8));
	    class446.aFloat4897 = (float) ((anIntArray12017[0] << 9)
					   + (method18608((byte) 58) << 8));
	    method10823(class446);
	    class446.method7260();
	}
	if (615376671 * client.anInt11053 == anInt11964 * 2032864281
	    && is_121_ != null) {
	    for (int i_122_ = 0; i_122_ < is_114_.length; i_122_++) {
		if (is_121_[i_122_] != is_114_[i_122_]) {
		    Class313_Sub2.aClass40_Sub22_10106
			.method17505((short) 255);
		    break;
		}
	    }
	}
	if (aClass633_12022 != null)
	    aClass633_12022.method10330();
	if (aClass689_Sub1_11986.method14021(-807019486)
	    && aClass689_Sub1_11986.aBool11017) {
	    Class586 class586 = method18633((byte) -101);
	    if (!class586.method9666(aClass689_Sub1_11986
					 .method14048(138587742),
				     -363990986)) {
		aClass689_Sub1_11986.method14068(-1, (byte) -89);
		aClass689_Sub1_11986.aBool11017 = false;
	    }
	}
    }
    
    public final void method18924(RSBuffer class525_sub38) {
	class525_sub38.index = 0;
	int i = class525_sub38.readUnsignedByte(1113407431);
	byte i_123_ = (byte) (i & 0x1);
	boolean bool = 0 != (i & 0x4);
	int i_124_ = super.method18608((byte) 55);
	method18607((i >> 3 & 0x7) + 1, 133251852);
	boolean bool_125_ = 0 != (i & 0x40);
	boolean bool_126_ = 0 != (i & 0x80);
	Class446 class446 = Class446.method7209(method10818().aClass446_4807);
	class446.aFloat4895 += (float) (method18608((byte) 40) - i_124_ << 8);
	class446.aFloat4897 += (float) (method18608((byte) 108) - i_124_ << 8);
	method10823(class446);
	class446.method7260();
	if (bool_125_)
	    aString12230 = class525_sub38.method16637(1485608657);
	else
	    aString12230 = null;
	if (bool_126_)
	    aString12233 = class525_sub38.method16637(972000915);
	else
	    aString12233 = null;
	aClass627_12253
	    = ((Class627)
	       Class539.method8888(Class627.method10269(-1728973767),
				   class525_sub38.readByte(-1150098071),
				   1544510318));
	if (Class176.aClass685_1884 == Class685.aClass685_8686
	    && 619753713 * client.anInt11231 >= 2)
	    aClass627_12253 = Class627.aClass627_8153;
	method18926(class525_sub38, i_123_, 489205734);
	aString12241 = class525_sub38.readString((byte) -41);
	aString12231 = aString12241;
	if (this == Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705)
	    RuntimeException_Sub4.aString12140 = aString12241;
	anInt12232 = class525_sub38.readUnsignedByte(658120836) * 1800335339;
	if (bool) {
	    anInt12239 = class525_sub38.readUnsignedShort((byte) 48) * 171939349;
	    if (anInt12239 * 325617981 == 65535)
		anInt12239 = -171939349;
	    anInt12234 = -1396996145 * anInt12232;
	    anInt12240 = 962715729;
	} else {
	    anInt12239 = 0;
	    anInt12234 = class525_sub38.readUnsignedByte(979878638) * -1979585531;
	    anInt12240 = class525_sub38.readUnsignedByte(432128979) * -962715729;
	    if (anInt12240 * -1799579825 == 255)
		anInt12240 = 962715729;
	}
	int i_127_ = anInt12249 * -1464774485;
	anInt12249 = class525_sub38.readUnsignedByte(1947873704) * -1408226813;
	if (anInt12249 * -1464774485 != 0) {
	    int i_128_ = anInt12247 * -1422129767;
	    int i_129_ = 2100329717 * anInt12245;
	    int i_130_ = 2025647547 * anInt12238;
	    int i_131_ = anInt12248 * 1428343353;
	    int i_132_ = anInt12250 * -1288202655;
	    anInt12247 = class525_sub38.readUnsignedShort((byte) 114) * -1527284055;
	    anInt12245 = class525_sub38.readUnsignedShort((byte) 76) * -5812387;
	    anInt12238 = class525_sub38.readUnsignedShort((byte) 4) * 1254477683;
	    anInt12248 = class525_sub38.readUnsignedShort((byte) 80) * -1550973943;
	    anInt12250 = class525_sub38.readUnsignedByte(257257941) * -1718121055;
	    if (i_127_ != -1464774485 * anInt12249
		|| i_128_ != -1422129767 * anInt12247
		|| anInt12245 * 2100329717 != i_129_
		|| anInt12238 * 2025647547 != i_130_
		|| 1428343353 * anInt12248 != i_131_
		|| -1288202655 * anInt12250 != i_132_)
		Class513.method8550(this, 82199883);
	} else
	    Class406.method6615(this, 271677319);
    }
    
    public void method18925(RSBuffer class525_sub38) {
	class525_sub38.index = 0;
	int i = class525_sub38.readUnsignedByte(1485708193);
	for (int i_133_ = 0; i_133_ < anIntArray12236.length; i_133_++) {
	    if ((i & 1 << i_133_) != 0) {
		int i_134_ = class525_sub38.readUnsignedByte(1759256946);
		int i_135_ = class525_sub38.readUnsignedShort((byte) 63);
		anIntArray12236[i_133_] = i_134_;
		anIntArray12237[i_133_] = i_135_;
	    } else {
		anIntArray12236[i_133_] = -1;
		anIntArray12237[i_133_] = -1;
	    }
	}
    }
    
    final void method16968(Class182 class182, Class656_Sub1 class656_sub1,
			   int i, int i_136_, int i_137_, boolean bool) {
	throw new IllegalStateException();
    }
    
    Class567 method16917(Class182 class182, int i) {
	if (null == aClass637_12246
	    || !method18906(class182, 2048, (byte) -96))
	    return null;
	Class444 class444 = class182.method3225();
	Class444 class444_138_ = method10826();
	Class428 class428 = method10818();
	int i_139_ = aClass64_11992.method1393((short) 7982);
	Class547 class547
	    = (aClass546_10872.aClass547ArrayArrayArray7263[aByte10867]
	       [(int) class428.aClass446_4807.aFloat4895 >> 9]
	       [(int) class428.aClass446_4807.aFloat4897 >> 9]);
	if (null != class547 && null != class547.aClass656_Sub1_Sub1_7264) {
	    int i_140_ = (anInt11994 * 2037461243
			  - class547.aClass656_Sub1_Sub1_7264.aShort11836);
	    anInt11994 = 1656838707 * (int) ((float) (anInt11994 * 2037461243)
					     - (float) i_140_ / 10.0F);
	} else
	    anInt11994 = ((int) ((float) (anInt11994 * 2037461243)
				 - (float) (anInt11994 * 2037461243) / 10.0F)
			  * 1656838707);
	class444.method7154(class444_138_);
	class444.method7147(0.0F, (float) (-20 - 2037461243 * anInt11994),
			    0.0F);
	Class567 class567 = null;
	aBool11976 = false;
	if (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub17_10676
		.method17123(-665330778)
	    == 1) {
	    Class586 class586 = method18633((byte) -68);
	    if (class586.aBool7727
		&& (-1172437919 * aClass637_12246.anInt8300 == -1
		    || ((NPCDefinitions) (Class168_Sub1.aClass40_Sub7_9112.method76
				    (aClass637_12246.anInt8300 * -1172437919,
				     -723644919))).aBool3328)) {
		Class689 class689 = ((aClass689_11987.method14021(-1033211033)
				      && aClass689_11987.method14030(21492432))
				     ? aClass689_11987 : null);
		Class689_Sub1 class689_sub1
		    = ((aClass689_Sub1_11986.method14021(258859254)
			&& (!aClass689_Sub1_11986.aBool11017
			    || null == class689))
		       ? aClass689_Sub1_11986 : null);
		short i_141_ = Class138.aClass631_1641.aShort8179;
		byte i_142_ = Class138.aClass631_1641.aByte8180;
		if (-1 != aClass637_12246.anInt8300 * -1172437919) {
		    i_141_ = ((NPCDefinitions)
			      (Class168_Sub1.aClass40_Sub7_9112.method76
			       (aClass637_12246.anInt8300 * -1172437919,
				-1520189941))).aShort3296;
		    i_142_ = ((NPCDefinitions)
			      (Class168_Sub1.aClass40_Sub7_9112.method76
			       (aClass637_12246.anInt8300 * -1172437919,
				1148732011))).aByte3341;
		}
		Object object = null;
		Class179 class179;
		if (i_141_ > -1
		    && Class198_Sub13.aClass525_Sub30_9973
			   .aClass696_Sub4_10728.method16985(-613970650) == 1)
		    class179 = Class262.method4781(class182, i_139_,
						   anInt11971 * -2009365071,
						   1295175615 * anInt11972,
						   anInt11973 * -827965183,
						   aClass179Array12010[0],
						   i_141_, i_142_,
						   (null != class689_sub1
						    ? (Class689) class689_sub1
						    : class689),
						   2118839934);
		else
		    class179 = Class75.method1553(class182, i_139_,
						  anInt11971 * -2009365071,
						  1295175615 * anInt11972,
						  anInt11973 * -827965183, 1,
						  aClass179Array12010[0], 0, 0,
						  160, 240,
						  (class689_sub1 != null
						   ? (Class689) class689_sub1
						   : class689),
						  1768681829);
		if (class179 != null) {
		    if (null == aClass211Array10869
			|| (aClass211Array10869.length
			    < 1 + aClass179Array12010.length))
			method16961(1 + aClass179Array12010.length, -16711936);
		    class567 = Class293.method5303(true, (short) -7196);
		    aBool11976 = true;
		    class182.method3235(false);
		    class179.method2953(class444,
					(aClass211Array10869
					 [aClass179Array12010.length]),
					0);
		    class182.method3235(true);
		}
	    }
	}
	if (this == Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705) {
	    for (int i_143_ = client.aClass109Array11089.length - 1;
		 i_143_ >= 0; i_143_--) {
		Class109 class109 = client.aClass109Array11089[i_143_];
		if (null != class109 && -1 != 946650107 * class109.anInt1318) {
		    if (class109.anInt1316 * 309020347 == 1) {
			Class525_Sub19 class525_sub19
			    = ((Class525_Sub19)
			       (client.aClass10_11121.method684
				((long) (-110098703 * class109.anInt1319))));
			if (class525_sub19 != null) {
			    Class656_Sub1_Sub3_Sub1_Sub2 class656_sub1_sub3_sub1_sub2
				= ((Class656_Sub1_Sub3_Sub1_Sub2)
				   class525_sub19.anObject10571);
			    Class446 class446
				= (Class446.method7225
				   ((class656_sub1_sub3_sub1_sub2.method10818()
				     .aClass446_4807),
				    Class581
					.aClass656_Sub1_Sub3_Sub1_Sub1_7705
					.method10818().aClass446_4807));
			    int i_144_ = (int) class446.aFloat4895;
			    int i_145_ = (int) class446.aFloat4897;
			    method18905(class182, class444,
					aClass179Array12010[0], (long) i_144_,
					(long) i_145_,
					946650107 * class109.anInt1318,
					92160000L);
			}
		    }
		    if (class109.anInt1316 * 309020347 == 2) {
			Class446 class446
			    = (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
				   .method10818
			       ().aClass446_4807);
			long l = (long) (class109.anInt1313 * 644912697
					 - (int) class446.aFloat4895);
			long l_146_ = (long) (1703881669 * class109.anInt1314
					      - (int) class446.aFloat4897);
			long l_147_
			    = (long) (class109.anInt1315 * 114116079 << 9);
			l_147_ *= l_147_;
			method18905(class182, class444, aClass179Array12010[0],
				    l, l_146_, 946650107 * class109.anInt1318,
				    l_147_);
		    }
		    if (class109.anInt1316 * 309020347 == 10
			&& class109.anInt1319 * -110098703 >= 0
			&& (-110098703 * class109.anInt1319
			    < (client
			       .aClass656_Sub1_Sub3_Sub1_Sub1Array11384).length)) {
			Class656_Sub1_Sub3_Sub1_Sub1 class656_sub1_sub3_sub1_sub1_148_
			    = (client.aClass656_Sub1_Sub3_Sub1_Sub1Array11384
			       [class109.anInt1319 * -110098703]);
			if (null != class656_sub1_sub3_sub1_sub1_148_) {
			    Class446 class446
				= (Class446.method7225
				   (class656_sub1_sub3_sub1_sub1_148_
					.method10818().aClass446_4807,
				    Class581
					.aClass656_Sub1_Sub3_Sub1_Sub1_7705
					.method10818().aClass446_4807));
			    int i_149_ = (int) class446.aFloat4895;
			    int i_150_ = (int) class446.aFloat4897;
			    method18905(class182, class444,
					aClass179Array12010[0], (long) i_149_,
					(long) i_150_,
					class109.anInt1318 * 946650107,
					92160000L);
			}
		    }
		}
	    }
	}
	class444.method7154(class444_138_);
	class444.method7147(0.0F, (float) (-5 - anInt11994 * 2037461243),
			    0.0F);
	if (null == aClass211Array10869
	    || aClass211Array10869.length < aClass179Array12010.length)
	    method16961(aClass179Array12010.length, -16711936);
	if (class567 == null)
	    class567 = Class293.method5303(true, (short) -17396);
	method18601(class182, aClass179Array12010, class444, false,
		    1776715035);
	for (int i_151_ = 0; i_151_ < aClass179Array12010.length; i_151_++) {
	    if (aClass179Array12010[i_151_] != null)
		aClass179Array12010[i_151_].method2953
		    (class444, aClass211Array10869[i_151_],
		     (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705 == this ? 1
		      : 0));
	    else
		aClass211Array10869[i_151_].aBool2265 = false;
	}
	if (aClass633_12022 != null) {
	    Class185 class185 = aClass633_12022.method10350();
	    class182.method3412(class185);
	}
	for (int i_152_ = 0; i_152_ < aClass179Array12010.length; i_152_++) {
	    if (aClass179Array12010[i_152_] != null)
		aBool11976 |= aClass179Array12010[i_152_].method3017();
	    aClass179Array12010[i_152_] = null;
	}
	anInt11963 = client.anInt11267 * 217032817;
	return class567;
    }
    
    public void method18926(RSBuffer class525_sub38, byte i,
							int i_153_) {
	aByte12235 = i;
	int i_154_ = -1;
	anInt12244 = 0;
	int[] is = new int[Class664.aClass634_8557.anIntArray8244.length];
	Class2[] class2s
	    = new Class2[Class664.aClass634_8557.anIntArray8244.length];
	ItemDefinitions[] class8s
	    = new ItemDefinitions[Class664.aClass634_8557.anIntArray8244.length];
	for (int i_155_ = 0;
	     i_155_ < Class664.aClass634_8557.anIntArray8244.length;
	     i_155_++) {
	    if (1 != Class664.aClass634_8557.anIntArray8244[i_155_]) {
		int i_156_ = class525_sub38.readUnsignedByte(878418760);
		if (i_156_ == 0)
		    is[i_155_] = 0;
		else {
		    int i_157_ = class525_sub38.readUnsignedByte(1785836845);
		    int i_158_ = (i_156_ << 8) + i_157_;
		    if (0 == i_155_ && i_158_ == 65535) {
			i_154_ = class525_sub38.readBigSmart(-2043778683);
			anInt12244 = (class525_sub38.readUnsignedByte(15063757)
				      * 1742874197);
			break;
		    }
		    if (i_158_ >= 16384) {
			i_158_ -= 16384;
			is[i_155_] = i_158_ | 0x40000000;
			class8s[i_155_]
			    = (ItemDefinitions) Class313_Sub2.aClass40_Sub22_10106
					   .method76(i_158_, 1197641058);
			int i_159_ = 714429443 * class8s[i_155_].anInt88;
			if (i_159_ != 0)
			    anInt12244 = i_159_ * 1742874197;
		    } else
			is[i_155_] = i_158_ - 256 | ~0x7fffffff;
		}
	    }
	}
	if (i_154_ == -1) {
	    int i_160_ = class525_sub38.readUnsignedShort((byte) 93);
	    int i_161_ = 0;
	    for (int i_162_ = 0;
		 i_162_ < Class664.aClass634_8557.anIntArray8244.length;
		 i_162_++) {
		if (Class664.aClass634_8557.anIntArray8244[i_162_] == 0) {
		    if (0 != (i_160_ & 1 << i_161_))
			class2s[i_162_]
			    = Class511.method8529(class8s[i_162_],
						  class525_sub38, -510852952);
		    i_161_++;
		}
	    }
	}
	int[] is_163_ = new int[10];
	for (int i_164_ = 0; i_164_ < 10; i_164_++) {
	    int i_165_ = class525_sub38.readUnsignedByte(1267555949);
	    if (Class525_Sub6.aShortArrayArrayArray10485.length < 1
		|| i_165_ < 0
		|| i_165_ >= (Class525_Sub6.aShortArrayArrayArray10485[i_164_]
			      [0]).length)
		i_165_ = 0;
	    is_163_[i_164_] = i_165_;
	}
	int[] is_166_ = new int[10];
	for (int i_167_ = 0; i_167_ < 10; i_167_++) {
	    int i_168_ = class525_sub38.readUnsignedByte(733958979);
	    if (Class522_Sub1.aShortArrayArrayArray10395.length < 1
		|| i_168_ < 0
		|| i_168_ >= (Class522_Sub1.aShortArrayArrayArray10395[i_167_]
			      [0]).length)
		i_168_ = 0;
	    is_166_[i_167_] = i_168_;
	}
	anInt12251 = class525_sub38.readUnsignedShort((byte) 110) * -1942494225;
	if (null == aClass637_12246)
	    aClass637_12246 = new Class637();
	int i_169_ = -1172437919 * aClass637_12246.anInt8300;
	int[] is_170_ = aClass637_12246.anIntArray8301;
	aClass637_12246.method10476(method18626((byte) 4), is, class2s,
				    is_163_, is_166_, 1 == aByte12235, i_154_,
				    -1433580485);
	if (i_169_ != i_154_) {
	    Class446 class446
		= Class446.method7209(method10818().aClass446_4807);
	    class446.aFloat4895 = (float) ((anIntArray12014[0] << 9)
					   + (method18608((byte) 75) << 8));
	    class446.aFloat4897 = (float) ((anIntArray12017[0] << 9)
					   + (method18608((byte) 37) << 8));
	    method10823(class446);
	    class446.method7260();
	}
	if (615376671 * client.anInt11053 == anInt11964 * 2032864281
	    && is_170_ != null) {
	    for (int i_171_ = 0; i_171_ < is_163_.length; i_171_++) {
		if (is_170_[i_171_] != is_163_[i_171_]) {
		    Class313_Sub2.aClass40_Sub22_10106
			.method17505((short) 255);
		    break;
		}
	    }
	}
	if (aClass633_12022 != null)
	    aClass633_12022.method10330();
	if (aClass689_Sub1_11986.method14021(1528625878)
	    && aClass689_Sub1_11986.aBool11017) {
	    Class586 class586 = method18633((byte) -40);
	    if (!class586.method9666(aClass689_Sub1_11986
					 .method14048(645674815),
				     172614210)) {
		aClass689_Sub1_11986.method14068(-1, (byte) -35);
		aClass689_Sub1_11986.aBool11017 = false;
	    }
	}
    }
    
    boolean method18927(Class182 class182, int i) {
	int i_172_ = i;
	Class586 class586 = method18633((byte) -113);
	Class689 class689 = ((aClass689_11987.method14021(95398885)
			      && !aClass689_11987.method14030(-359656274))
			     ? aClass689_11987 : null);
	Class689_Sub1 class689_sub1
	    = ((aClass689_Sub1_11986.method14021(-1915157279) && !aBool12243
		&& (!aClass689_Sub1_11986.aBool11017 || null == class689))
	       ? aClass689_Sub1_11986 : null);
	int i_173_ = class586.anInt7751 * 174151703;
	int i_174_ = class586.anInt7752 * -429863361;
	if (i_173_ != 0 || i_174_ != 0 || 1307034469 * class586.anInt7748 != 0
	    || class586.anInt7767 * 1272709361 != 0)
	    i |= 0x7;
	int i_175_ = aClass64_11992.method1393((short) 31580);
	boolean bool
	    = (0 != aByte11979 && client.anInt11083 >= 1656114695 * anInt11981
	       && client.anInt11083 < anInt11999 * 59570639);
	if (bool)
	    i |= 0x80000;
	Class179 class179
	    = (aClass179Array12010[0]
	       = (aClass637_12246.method10482
		  (class182, i, Class227.aClass40_Sub1_2345,
		   Class38.aClass40_Sub9_328, Class168_Sub1.aClass40_Sub7_9112,
		   Class313_Sub2.aClass40_Sub22_10106, Class532.aClass111_7170,
		   Class532.aClass111_7170, class689, class689_sub1,
		   aClass689_Sub2_Sub1Array11998, anIntArray12008, i_175_,
		   true, Class664.aClass634_8557, 16711935)));
	int i_176_ = Class480.method7821((short) 202);
	if (-855455283 * Class503.anInt5590 < 96 && i_176_ > 50)
	    WorldTile.method1431(162095416);
	if (Class176.aClass685_1884 != Class685.aClass685_8686
	    && i_176_ < 50) {
	    int i_177_;
	    for (i_177_ = 50 - i_176_; i_177_ > client.anInt11082 * -397199891;
		 client.anInt11082 += -401903643)
		Class329.aByteArrayArray3591[-397199891 * client.anInt11082]
		    = new byte[102400];
	    while (i_177_ < -397199891 * client.anInt11082) {
		client.anInt11082 -= -401903643;
		Class329.aByteArrayArray3591[client.anInt11082 * -397199891]
		    = null;
	    }
	} else if (Class685.aClass685_8686 != Class176.aClass685_1884) {
	    Class329.aByteArrayArray3591 = new byte[50][];
	    client.anInt11082 = 0;
	}
	if (null == class179)
	    return false;
	anInt12025 = class179.method2960() * -411987203;
	anInt11988 = class179.method2964() * -1125261377;
	class179.method2957();
	method18672(class179, -926832033);
	if (0 != i_173_ || i_174_ != 0) {
	    method18612(i_175_, i_173_, i_174_,
			class586.anInt7753 * 1056489539,
			class586.anInt7754 * -1802986919, 1752577684);
	    if (anInt11971 * -2009365071 != 0)
		class179.method2932(-2009365071 * anInt11971);
	    if (0 != 1295175615 * anInt11972)
		class179.method2933(anInt11972 * 1295175615);
	    if (-827965183 * anInt11973 != 0)
		class179.method2934(0, -827965183 * anInt11973, 0);
	} else
	    method18612(i_175_, method18608((byte) 43) << 9,
			method18608((byte) 85) << 9, 0, 0, -1653971363);
	if (bool)
	    class179.method2974(aByte12000, aByte12001, aByte12002,
				aByte11979 & 0xff);
	if (!aBool12243)
	    method18611(class182, class586, i_172_, i_173_, i_174_, i_175_,
			(short) 8192);
	return true;
    }
    
    public String method18928(boolean bool) {
	String string = "";
	if (null != aString12230)
	    string = aString12230;
	if (bool)
	    string = new StringBuilder().append(string).append
			 (aString12241).toString();
	else
	    string = new StringBuilder().append(string).append
			 (aString12231).toString();
	if (aString12233 != null)
	    string = new StringBuilder().append(string).append
			 (aString12233).toString();
	return string;
    }
    
    public Class524 method18616(int i) {
	if (aClass524_11975 != null) {
	    if (null == aClass524_11975.aString7109)
		return null;
	    if (-664017801 * client.anInt11332 == 0
		|| -664017801 * client.anInt11332 == 3
		|| (1 == client.anInt11332 * -664017801
		    && Class666.method11024(aString12231, 596945279)))
		return aClass524_11975;
	}
	return null;
    }
    
    public void method18929(RSBuffer class525_sub38, byte i) {
	aByte12235 = i;
	int i_178_ = -1;
	anInt12244 = 0;
	int[] is = new int[Class664.aClass634_8557.anIntArray8244.length];
	Class2[] class2s
	    = new Class2[Class664.aClass634_8557.anIntArray8244.length];
	ItemDefinitions[] class8s
	    = new ItemDefinitions[Class664.aClass634_8557.anIntArray8244.length];
	for (int i_179_ = 0;
	     i_179_ < Class664.aClass634_8557.anIntArray8244.length;
	     i_179_++) {
	    if (1 != Class664.aClass634_8557.anIntArray8244[i_179_]) {
		int i_180_ = class525_sub38.readUnsignedByte(1916262932);
		if (i_180_ == 0)
		    is[i_179_] = 0;
		else {
		    int i_181_ = class525_sub38.readUnsignedByte(315406375);
		    int i_182_ = (i_180_ << 8) + i_181_;
		    if (0 == i_179_ && i_182_ == 65535) {
			i_178_ = class525_sub38.readBigSmart(-2043778683);
			anInt12244 = (class525_sub38.readUnsignedByte(1661204942)
				      * 1742874197);
			break;
		    }
		    if (i_182_ >= 16384) {
			i_182_ -= 16384;
			is[i_179_] = i_182_ | 0x40000000;
			class8s[i_179_]
			    = (ItemDefinitions) Class313_Sub2.aClass40_Sub22_10106
					   .method76(i_182_, 639568842);
			int i_183_ = 714429443 * class8s[i_179_].anInt88;
			if (i_183_ != 0)
			    anInt12244 = i_183_ * 1742874197;
		    } else
			is[i_179_] = i_182_ - 256 | ~0x7fffffff;
		}
	    }
	}
	if (i_178_ == -1) {
	    int i_184_ = class525_sub38.readUnsignedShort((byte) 106);
	    int i_185_ = 0;
	    for (int i_186_ = 0;
		 i_186_ < Class664.aClass634_8557.anIntArray8244.length;
		 i_186_++) {
		if (Class664.aClass634_8557.anIntArray8244[i_186_] == 0) {
		    if (0 != (i_184_ & 1 << i_185_))
			class2s[i_186_]
			    = Class511.method8529(class8s[i_186_],
						  class525_sub38, -510852952);
		    i_185_++;
		}
	    }
	}
	int[] is_187_ = new int[10];
	for (int i_188_ = 0; i_188_ < 10; i_188_++) {
	    int i_189_ = class525_sub38.readUnsignedByte(487648723);
	    if (Class525_Sub6.aShortArrayArrayArray10485.length < 1
		|| i_189_ < 0
		|| i_189_ >= (Class525_Sub6.aShortArrayArrayArray10485[i_188_]
			      [0]).length)
		i_189_ = 0;
	    is_187_[i_188_] = i_189_;
	}
	int[] is_190_ = new int[10];
	for (int i_191_ = 0; i_191_ < 10; i_191_++) {
	    int i_192_ = class525_sub38.readUnsignedByte(1632338678);
	    if (Class522_Sub1.aShortArrayArrayArray10395.length < 1
		|| i_192_ < 0
		|| i_192_ >= (Class522_Sub1.aShortArrayArrayArray10395[i_191_]
			      [0]).length)
		i_192_ = 0;
	    is_190_[i_191_] = i_192_;
	}
	anInt12251 = class525_sub38.readUnsignedShort((byte) 76) * -1942494225;
	if (null == aClass637_12246)
	    aClass637_12246 = new Class637();
	int i_193_ = -1172437919 * aClass637_12246.anInt8300;
	int[] is_194_ = aClass637_12246.anIntArray8301;
	aClass637_12246.method10476(method18626((byte) 4), is, class2s,
				    is_187_, is_190_, 1 == aByte12235, i_178_,
				    -2145829260);
	if (i_193_ != i_178_) {
	    Class446 class446
		= Class446.method7209(method10818().aClass446_4807);
	    class446.aFloat4895 = (float) ((anIntArray12014[0] << 9)
					   + (method18608((byte) 50) << 8));
	    class446.aFloat4897 = (float) ((anIntArray12017[0] << 9)
					   + (method18608((byte) 84) << 8));
	    method10823(class446);
	    class446.method7260();
	}
	if (615376671 * client.anInt11053 == anInt11964 * 2032864281
	    && is_194_ != null) {
	    for (int i_195_ = 0; i_195_ < is_187_.length; i_195_++) {
		if (is_194_[i_195_] != is_187_[i_195_]) {
		    Class313_Sub2.aClass40_Sub22_10106
			.method17505((short) 255);
		    break;
		}
	    }
	}
	if (aClass633_12022 != null)
	    aClass633_12022.method10330();
	if (aClass689_Sub1_11986.method14021(2077387848)
	    && aClass689_Sub1_11986.aBool11017) {
	    Class586 class586 = method18633((byte) -104);
	    if (!class586.method9666(aClass689_Sub1_11986
					 .method14048(-2070744261),
				     1218670399)) {
		aClass689_Sub1_11986.method14068(-1, (byte) -76);
		aClass689_Sub1_11986.aBool11017 = false;
	    }
	}
    }
    
    public String method18930(boolean bool) {
	if (bool)
	    return aString12241;
	return aString12231;
    }
    
    public String method18931(boolean bool) {
	if (bool)
	    return aString12241;
	return aString12231;
    }
    
    public Class553 method16954(Class182 class182) {
	return null;
    }
    
    public Class307 method180(int i) {
	return Class307.aClass307_3416;
    }
    
    public void method18932(int i, int i_196_) {
	anInt12015 = 0;
	anInt11970 = 0;
	anInt12019 = 0;
	anIntArray12014[0] = i;
	anIntArray12017[0] = i_196_;
	int i_197_ = method18608((byte) 80);
	Class446 class446 = Class446.method7209(method10818().aClass446_4807);
	class446.aFloat4895
	    = (float) (anIntArray12014[0] * 512 + i_197_ * 256);
	class446.aFloat4897
	    = (float) (512 * anIntArray12017[0] + 256 * i_197_);
	method10823(class446);
	class446.method7260();
	if (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705 == this)
	    client.aClass507_11137.method8361((byte) 97)
		.method10398(1852870633);
	if (null != aClass633_12022)
	    aClass633_12022.method10330();
    }
    
    final void method18933(int i, int i_198_, byte i_199_) {
	if (-2046237799 * anInt12015 < anIntArray12014.length - 1)
	    anInt12015 += -901267287;
	for (int i_200_ = anInt12015 * -2046237799; i_200_ > 0; i_200_--) {
	    anIntArray12014[i_200_] = anIntArray12014[i_200_ - 1];
	    anIntArray12017[i_200_] = anIntArray12017[i_200_ - 1];
	    aByteArray12007[i_200_] = aByteArray12007[i_200_ - 1];
	}
	anIntArray12014[0] = i;
	anIntArray12017[0] = i_198_;
	aByteArray12007[0] = i_199_;
    }
    
    final void method18934(int i, int i_201_, byte i_202_) {
	if (-2046237799 * anInt12015 < anIntArray12014.length - 1)
	    anInt12015 += -901267287;
	for (int i_203_ = anInt12015 * -2046237799; i_203_ > 0; i_203_--) {
	    anIntArray12014[i_203_] = anIntArray12014[i_203_ - 1];
	    anIntArray12017[i_203_] = anIntArray12017[i_203_ - 1];
	    aByteArray12007[i_203_] = aByteArray12007[i_203_ - 1];
	}
	anIntArray12014[0] = i;
	anIntArray12017[0] = i_201_;
	aByteArray12007[0] = i_202_;
    }
    
    final void method18935(int i, int i_204_, byte i_205_) {
	if (-2046237799 * anInt12015 < anIntArray12014.length - 1)
	    anInt12015 += -901267287;
	for (int i_206_ = anInt12015 * -2046237799; i_206_ > 0; i_206_--) {
	    anIntArray12014[i_206_] = anIntArray12014[i_206_ - 1];
	    anIntArray12017[i_206_] = anIntArray12017[i_206_ - 1];
	    aByteArray12007[i_206_] = aByteArray12007[i_206_ - 1];
	}
	anIntArray12014[0] = i;
	anIntArray12017[0] = i_204_;
	aByteArray12007[0] = i_205_;
    }
    
    public int method18608(byte i) {
	if (null != aClass637_12246
	    && -1172437919 * aClass637_12246.anInt8300 != -1)
	    return (((NPCDefinitions) (Class168_Sub1.aClass40_Sub7_9112.method76
				 (-1172437919 * aClass637_12246.anInt8300,
				  -257952682))).anInt3291
		    * 1035256919);
	return super.method18608((byte) 48);
    }
    
    public final boolean method18936() {
	if (aClass637_12246 == null)
	    return false;
	return true;
    }
    
    public final boolean method18937() {
	if (aClass637_12246 == null)
	    return false;
	return true;
    }
    
    public void method18938(String string, int i, int i_207_) {
	method18617(string, i, i_207_,
		    (Class424.method6768(1684836768)
		     * (-940740541 * Class138.aClass631_1641.anInt8210)),
		    -1778278627);
    }
}
