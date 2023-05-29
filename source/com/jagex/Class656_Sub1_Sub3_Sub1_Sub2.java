/* Class656_Sub1_Sub3_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class656_Sub1_Sub3_Sub1_Sub2 extends Class656_Sub1_Sub3_Sub1
{
    public NPCDefinitions aClass299_12255;
    public int anInt12256;
    public int anInt12257;
    public Class288 aClass288_12258;
    public static int anInt12259 = 1465576967;
    public int anInt12260;
    int anInt12261;
    public Class310 aClass310_12262;
    int[] anIntArray12263;
    public String aString12264;
    int[] anIntArray12265;
    public int anInt12266 = -1593949769;
    int anInt12267;
    int anInt12268;
    public static int anInt12269 = -1582968257;
    int anInt12270;
    public int anInt12271;
    boolean aBool12272;
    
    public void method18939(int i, int i_0_, int i_1_) {
	anIntArray12265[i] = i_0_;
	anIntArray12263[i] = i_1_;
    }
    
    public Class656_Sub1_Sub3_Sub1_Sub2(Class546 class546, int i) {
	super(class546, i, Class293.aClass106_Sub1_Sub2_3239);
	anInt12257 = 1238434123;
	anInt12256 = -486599261;
	anIntArray12265 = new int[6];
	anIntArray12263 = new int[6];
	method18941(1188101670);
    }
    
    public void method18940(int i) {
	anInt12005 = 1187239215;
	anInt12004 = 212795429 * client.anInt11083;
    }
    
    void method18941(int i) {
	anInt12267 = (32 + (int) (Math.random() * 4.0)) * -449310067;
	anInt12268 = (3 + (int) (Math.random() * 2.0)) * 352279247;
	anInt12261 = (16 + (int) (Math.random() * 3.0)) * -171899915;
	if (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub4_10728
		.method16985(-1626843548)
	    == 1)
	    anInt12270 = (int) (Math.random() * 6.0) * -1031875647;
	else
	    anInt12270 = (int) (Math.random() * 12.0) * -1031875647;
    }
    
    public void method18942(NPCDefinitions class299, int i) {
	method18943(class299, true, true, true, 1372227433);
    }
    
    public void method18943(NPCDefinitions class299, boolean bool, boolean bool_2_,
							boolean bool_3_, int i) {
	if (aClass299_12255 != class299 && Class61.aBool670
	    && Class385.method6443(anInt11964 * 2032864281, -1761587277))
	    Class219.method4200((byte) 49);
	aClass299_12255 = class299;
	if (null != aClass299_12255) {
	    if (bool)
		aString12264 = aClass299_12255.aString3290;
	    if (bool_2_)
		anInt12260 = aClass299_12255.anInt3311 * 1093076055;
	    if (bool_3_)
		aClass310_12262 = null;
	}
	if (aClass633_12022 != null)
	    aClass633_12022.method10330();
    }
    
    public Class553 method16919(Class182 class182, short i) {
	return null;
    }
    
    public boolean method18679() {
	return HashTable.aClass631_1641.aBool8174;
    }
    
    void method16963(Class182 class182) {
	if (null != aClass299_12255
	    && (aBool12023 || method18947(class182, 0, (byte) -111))) {
	    Class444 class444 = class182.method3225();
	    class444.method7154(method10826());
	    class444.method7147(0.0F, -5.0F, 0.0F);
	    method18601(class182, aClass179Array12010, class444, aBool12023,
			-551014366);
	    for (int i = 0; i < aClass179Array12010.length; i++)
		aClass179Array12010[i] = null;
	}
    }
    
    public final void method18944(Class682 class682, int i, int i_4_) {
	int i_5_ = anIntArray12014[0];
	int i_6_ = anIntArray12017[0];
	switch (-1785760645 * class682.anInt8635) {
	case 2:
	    i_5_++;
	    i_6_++;
	    break;
	case 3:
	    i_6_++;
	    break;
	case 1:
	    i_5_--;
	    i_6_--;
	    break;
	case 4:
	    i_5_++;
	    break;
	case 0:
	    i_5_--;
	    break;
	case 7:
	    i_5_++;
	    i_6_--;
	    break;
	case 6:
	    i_6_--;
	    break;
	case 5:
	    i_5_--;
	    i_6_++;
	    break;
	}
	if (aClass689_11987.method14021(-772128472)
	    && (aClass689_11987.method14058(565543433).walkingPrecedence * -764414887
		== 1)) {
	    anIntArray11985 = null;
	    aClass689_11987.method14068(-1, (byte) 7);
	}
	for (int i_7_ = 0; i_7_ < aClass540Array12029.length; i_7_++) {
	    if (1420286373 * aClass540Array12029[i_7_].anInt7182 != -1) {
		Class674 class674
		    = ((Class674)
		       (Class574.aClass40_Sub20_7645.method76
			(1420286373 * aClass540Array12029[i_7_].anInt7182,
			 810939517)));
		if (class674.aBool8608 && -1 != class674.anInt8596 * 1700860103
		    && (((AnimationDefinition)
			 Class685.aClass40_Sub8_8691.method76(((class674
								.anInt8596)
							       * 1700860103),
							      -435092704))
			.walkingPrecedence) * -764414887 == 1) {
		    aClass540Array12029[i_7_].aClass689_7183
			.method14068(-1, (byte) -75);
		    aClass540Array12029[i_7_].anInt7182 = -637232685;
		}
	    }
	}
	if (anInt12015 * -2046237799 < anIntArray12014.length - 1)
	    anInt12015 += -901267287;
	for (int i_8_ = anInt12015 * -2046237799; i_8_ > 0; i_8_--) {
	    anIntArray12014[i_8_] = anIntArray12014[i_8_ - 1];
	    anIntArray12017[i_8_] = anIntArray12017[i_8_ - 1];
	    aByteArray12007[i_8_] = aByteArray12007[i_8_ - 1];
	}
	anIntArray12014[0] = i_5_;
	anIntArray12017[0] = i_6_;
	aByteArray12007[0] = (byte) i;
    }
    
    public void method18945(int i, int i_9_, int i_10_, boolean bool,
			    int i_11_, int i_12_) {
	aByte10867 = aByte10870 = (byte) i;
	if (client.aClass507_11137.method8360(1949808229)
		.method7774(i_9_, i_10_, 1409374300))
	    aByte10870++;
	if (aClass689_11987.method14021(-1186386395)
	    && (aClass689_11987.method14058(84081620).walkingPrecedence * -764414887
		== 1)) {
	    anIntArray11985 = null;
	    aClass689_11987.method14068(-1, (byte) -30);
	}
	for (int i_13_ = 0; i_13_ < aClass540Array12029.length; i_13_++) {
	    if (-1 != 1420286373 * aClass540Array12029[i_13_].anInt7182) {
		Class674 class674
		    = ((Class674)
		       (Class574.aClass40_Sub20_7645.method76
			(aClass540Array12029[i_13_].anInt7182 * 1420286373,
			 289871523)));
		if (class674.aBool8608 && -1 != class674.anInt8596 * 1700860103
		    && (((AnimationDefinition)
			 Class685.aClass40_Sub8_8691.method76((1700860103
							       * (class674
								  .anInt8596)),
							      -1258909981))
			.walkingPrecedence) * -764414887 == 1) {
		    aClass540Array12029[i_13_].aClass689_7183
			.method14068(-1, (byte) -90);
		    aClass540Array12029[i_13_].anInt7182 = -637232685;
		}
	    }
	}
	if (!bool) {
	    int i_14_ = i_9_ - anIntArray12014[0];
	    int i_15_ = i_10_ - anIntArray12017[0];
	    if (i_14_ >= -8 && i_14_ <= 8 && i_15_ >= -8 && i_15_ <= 8) {
		if (-2046237799 * anInt12015 < anIntArray12014.length - 1)
		    anInt12015 += -901267287;
		for (int i_16_ = anInt12015 * -2046237799; i_16_ > 0;
		     i_16_--) {
		    anIntArray12014[i_16_] = anIntArray12014[i_16_ - 1];
		    anIntArray12017[i_16_] = anIntArray12017[i_16_ - 1];
		    aByteArray12007[i_16_] = aByteArray12007[i_16_ - 1];
		}
		anIntArray12014[0] = i_9_;
		anIntArray12017[0] = i_10_;
		aByteArray12007[0] = Class684.aClass684_8668.aByte8666;
		return;
	    }
	}
	anInt12015 = 0;
	anInt11970 = 0;
	anInt12019 = 0;
	anIntArray12014[0] = i_9_;
	anIntArray12017[0] = i_10_;
	Class446 class446 = Class446.method7209(method10818().aClass446_4807);
	class446.aFloat4895
	    = (float) ((i_11_ << 8) + (anIntArray12014[0] << 9));
	class446.aFloat4897
	    = (float) ((i_11_ << 8) + (anIntArray12017[0] << 9));
	method10823(class446);
	class446.method7260();
	if (null != aClass633_12022)
	    aClass633_12022.method10330();
    }
    
    public Class307 method175() {
	return Class307.aClass307_3415;
    }
    
    int method18626(byte i) {
	if (749025781 * anInt12256 != -1)
	    return 749025781 * anInt12256;
	if (null != aClass299_12255.anIntArray3323) {
	    NPCDefinitions class299
		= aClass299_12255.method5386(Class532.aClass111_7170,
					     Class532.aClass111_7170,
					     2147350453);
	    if (class299 != null && -1 != 386089707 * class299.anInt3295)
		return class299.anInt3295 * 386089707;
	}
	return 386089707 * aClass299_12255.anInt3295;
    }
    
    public int method18613(int i) {
	if (null != aClass299_12255.anIntArray3323) {
	    NPCDefinitions class299
		= aClass299_12255.method5386(Class532.aClass111_7170,
					     Class532.aClass111_7170,
					     2138264080);
	    if (null != class299 && -1 != class299.anInt3288 * 1932570145)
		return 1932570145 * class299.anInt3288;
	}
	return aClass299_12255.anInt3288 * 1932570145;
    }
    
    public int method16936(int i) {
	if (aClass299_12255.anIntArray3323 != null) {
	    NPCDefinitions class299
		= aClass299_12255.method5386(Class532.aClass111_7170,
					     Class532.aClass111_7170,
					     2115919001);
	    if (null != class299 && -38618711 * class299.anInt3338 != -1)
		return class299.anInt3338 * -38618711;
	}
	return (-38618711 * aClass299_12255.anInt3338 != -1
		? -38618711 * aClass299_12255.anInt3338
		: super.method16936(-1600209314));
    }
    
    boolean method18946(int i) {
	return aBool12272 || aClass299_12255.aBool3326;
    }
    
    int method16911(int i) {
	if (aClass299_12255 == null)
	    return 0;
	return 976681435 * aClass299_12255.anInt3355;
    }
    
    boolean method16910(Class182 class182, int i, int i_17_, byte i_18_) {
	if (aClass299_12255 == null)
	    return false;
	if (null != aClass299_12255.aClass443_3352)
	    return class182.method3414(i, i_17_, method10826(),
				       aClass299_12255.aClass443_3352,
				       (byte) -29);
	if (!method18947(class182, 131072, (byte) 8))
	    return false;
	Class444 class444 = method10826();
	boolean bool = false;
	for (int i_19_ = 0; i_19_ < aClass179Array12010.length; i_19_++) {
	    if (aClass179Array12010[i_19_] != null
		&& aClass179Array12010[i_19_].aBool1917) {
		boolean bool_20_;
	    while_27_:
		do {
		    do {
			if (976681435 * aClass299_12255.anInt3355 <= 0) {
			    if (aClass299_12255.anInt3351 * -1168520027
				== -1) {
				if (aClass299_12255.anInt3291 * 1035256919
				    != 1)
				    break;
			    } else if (-1168520027 * aClass299_12255.anInt3351
				       != 1)
				break;
			}
			bool_20_ = true;
			break while_27_;
		    } while (false);
		    bool_20_ = false;
		} while (false);
		boolean bool_21_ = bool_20_;
		boolean bool_22_
		    = aClass179Array12010[i_19_].method2954(i, i_17_, class444,
							    bool_21_,
							    (976681435
							     * (aClass299_12255
								.anInt3355)));
		if (bool_22_) {
		    bool = true;
		    break;
		}
	    }
	}
	for (int i_23_ = 0; i_23_ < aClass179Array12010.length; i_23_++)
	    aClass179Array12010[i_23_] = null;
	return bool;
    }
    
    final boolean method16912(int i) {
	return false;
    }
    
    final void method16915(Class182 class182, Class656_Sub1 class656_sub1,
			   int i, int i_24_, int i_25_, boolean bool,
			   int i_26_) {
	throw new IllegalStateException();
    }
    
    final void method16916(int i) {
	throw new IllegalStateException();
    }
    
    boolean method18947(Class182 class182, int i, byte i_27_) {
	int i_28_ = i;
	Class586 class586 = method18633((byte) -123);
	Class689 class689 = ((aClass689_11987.method14021(1956593215)
			      && !aClass689_11987.method14030(-1167908590))
			     ? aClass689_11987 : null);
	Class689_Sub1 class689_sub1
	    = ((aClass689_Sub1_11986.method14021(317513080)
		&& (!aClass689_Sub1_11986.aBool11017 || null == class689))
	       ? aClass689_Sub1_11986 : null);
	int i_29_ = class586.anInt7751 * 174151703;
	int i_30_ = class586.anInt7752 * -429863361;
	if (0 != i_29_ || 0 != i_30_ || 0 != class586.anInt7748 * 1307034469
	    || 1272709361 * class586.anInt7767 != 0)
	    i |= 0x7;
	boolean bool
	    = (aByte11979 != 0 && client.anInt11083 >= 1656114695 * anInt11981
	       && client.anInt11083 < anInt11999 * 59570639);
	if (bool)
	    i |= 0x80000;
	boolean bool_31_ = false;
	if (583548209 * anInt12005 != 0) {
	    NPCDefinitions class299
		= (null != aClass299_12255.anIntArray3323
		   ? aClass299_12255.method5386(Class532.aClass111_7170,
						Class532.aClass111_7170,
						2098427121)
		   : aClass299_12255);
	    if (null == class299
		|| client.anInt11083 >= (1898135825 * class299.anInt3292
					 + anInt12004 * -1744495699))
		anInt12005 = 0;
	    else {
		anInt12005
		    = (-247989295
		       * (255 - ((client.anInt11083 - anInt12004 * -1744495699)
				 * 255 / (1898135825 * class299.anInt3292))));
		bool_31_ = true;
	    }
	}
	if (bool_31_)
	    i |= 0x100;
	int i_32_ = aClass64_11992.method1393((short) 10595);
	Class179 class179
	    = (aClass179Array12010[0]
	       = aClass299_12255.method5372(class182, i,
					    Class227.aClass40_Sub1_2345,
					    Class532.aClass111_7170,
					    Class532.aClass111_7170, class689,
					    class689_sub1,
					    aClass689_Sub2_Sub1Array11998,
					    anIntArray12008, i_32_,
					    aClass288_12258,
					    method18626((byte) 4), false,
					    (byte) 47));
	if (class179 == null)
	    return false;
	anInt12025 = class179.method2960() * -411987203;
	anInt11988 = class179.method2964() * -1125261377;
	class179.method2957();
	method18672(class179, -1249510832);
	if (i_29_ != 0 || 0 != i_30_) {
	    method18612(i_32_, i_29_, i_30_, 1056489539 * class586.anInt7753,
			-1802986919 * class586.anInt7754, 278222475);
	    if (0 != anInt11971 * -2009365071)
		aClass179Array12010[0].method2932(-2009365071 * anInt11971);
	    if (anInt11972 * 1295175615 != 0)
		aClass179Array12010[0].method2933(anInt11972 * 1295175615);
	    if (0 != anInt11973 * -827965183)
		aClass179Array12010[0].method2934(0, -827965183 * anInt11973,
						  0);
	} else
	    method18612(i_32_, method18608((byte) 38) << 9,
			method18608((byte) 108) << 9, 0, 0, -1183984071);
	if (bool)
	    class179.method2974(aByte12000, aByte12001, aByte12002,
				aByte11979 & 0xff);
	if (bool_31_)
	    class179.method2972((byte) (anInt12005 * 583548209), null);
	method18611(class182, class586, i_28_, i_29_, i_30_, i_32_,
		    (short) 8192);
	return true;
    }
    
    public int method18948(int i, int i_33_) {
	return anIntArray12263[i];
    }
    
    public void method18949(int i, int i_34_, int i_35_, int i_36_) {
	anIntArray12265[i] = i_34_;
	anIntArray12263[i] = i_35_;
    }
    
    public boolean method18643(byte i) {
	return HashTable.aClass631_1641.aBool8174;
    }
    
    void method16918(Class182 class182, int i) {
	if (null != aClass299_12255
	    && (aBool12023 || method18947(class182, 0, (byte) 50))) {
	    Class444 class444 = class182.method3225();
	    class444.method7154(method10826());
	    class444.method7147(0.0F, -5.0F, 0.0F);
	    method18601(class182, aClass179Array12010, class444, aBool12023,
			1041600634);
	    for (int i_37_ = 0; i_37_ < aClass179Array12010.length; i_37_++)
		aClass179Array12010[i_37_] = null;
	}
    }
    
    public void method18950(String string, int i, int i_38_, int i_39_) {
	int i_40_ = (Class424.method6768(1684836768)
		     * (HashTable.aClass631_1641.anInt8187 * 166193699));
	method18617(string, i, i_38_, i_40_, -1778278627);
    }
    
    public int method18600(int i) {
	return 1 + anInt11964 * 2032864281;
    }
    
    public boolean method16923() {
	if (null != aClass299_12255.anIntArray3323
	    && (aClass299_12255.method5386(Class532.aClass111_7170,
					   Class532.aClass111_7170, 2121602880)
		== null))
	    return false;
	return true;
    }
    
    public int method72(int i) {
	return 2032864281 * anInt11964;
    }
    
    public Class525_Sub28 method171(int i) {
	Class600 class600 = client.aClass507_11137.method8350(1537290584);
	return (Class514.method8554
		(aByte10867,
		 ((int) method10818().aClass446_4807.aFloat4895
		  + class600.anInt7858 * -1159839232),
		 -(int) method10818().aClass446_4807.aFloat4896,
		 ((int) method10818().aClass446_4807.aFloat4897
		  + class600.anInt7860 * 1633099264),
		 962961380));
    }
    
    public Class429 method173(int i) {
	Class429 class429 = Class429.method6864();
	class429.method6821(Class436.method7071(aClass64_11992.anInt694
						* 2030157131),
			    0.0F, 0.0F);
	return class429;
    }
    
    public void method18951(NPCDefinitions class299, boolean bool, boolean bool_41_,
							boolean bool_42_) {
	if (aClass299_12255 != class299 && Class61.aBool670
	    && Class385.method6443(anInt11964 * 2032864281, -1761587277))
	    Class219.method4200((byte) 7);
	aClass299_12255 = class299;
	if (null != aClass299_12255) {
	    if (bool)
		aString12264 = aClass299_12255.aString3290;
	    if (bool_41_)
		anInt12260 = aClass299_12255.anInt3311 * 1093076055;
	    if (bool_42_)
		aClass310_12262 = null;
	}
	if (aClass633_12022 != null)
	    aClass633_12022.method10330();
    }
    
    public boolean method16928(int i) {
	if (null != aClass299_12255.anIntArray3323
	    && (aClass299_12255.method5386(Class532.aClass111_7170,
					   Class532.aClass111_7170, 2100524065)
		== null))
	    return false;
	return true;
    }
    
    final void method16968(Class182 class182, Class656_Sub1 class656_sub1,
			   int i, int i_43_, int i_44_, boolean bool) {
	throw new IllegalStateException();
    }
    
    Class567 method16917(Class182 class182, int i) {
	if (null == aClass299_12255
	    || !method18947(class182, 526336, (byte) 43))
	    return null;
	Class444 class444 = method10826();
	Class428 class428 = method10818();
	Class444 class444_45_ = class182.method3225();
	int i_46_ = aClass64_11992.method1393((short) 25583);
	Class547 class547
	    = (aClass546_10872.aClass547ArrayArrayArray7263[aByte10867]
	       [(int) class428.aClass446_4807.aFloat4895 >> 9]
	       [(int) class428.aClass446_4807.aFloat4897 >> 9]);
	if (null != class547 && null != class547.aClass656_Sub1_Sub1_7264) {
	    int i_47_ = (2037461243 * anInt11994
			 - class547.aClass656_Sub1_Sub1_7264.aShort11836);
	    anInt11994 = (int) ((float) (anInt11994 * 2037461243)
				- (float) i_47_ / 10.0F) * 1656838707;
	} else
	    anInt11994 = 1656838707 * (int) ((float) (2037461243 * anInt11994)
					     - (float) (anInt11994
							* 2037461243) / 10.0F);
	class444_45_.method7154(class444);
	class444_45_.method7147(0.0F, (float) (-20 - anInt11994 * 2037461243),
				0.0F);
	Class586 class586 = method18633((byte) -58);
	NPCDefinitions class299
	    = (aClass299_12255.anIntArray3323 != null
	       ? aClass299_12255.method5386(Class532.aClass111_7170,
					    Class532.aClass111_7170,
					    2123853668)
	       : aClass299_12255);
	boolean bool = class299.aClass443_3352 != null;
	aBool11976 = false;
	Class567 class567 = null;
	if (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub17_10676
		.method17123(-1781866207) == 1
	    && class299.aBool3328 && class586.aBool7727) {
	    Class689 class689 = ((aClass689_11987.method14021(1123301737)
				  && aClass689_11987.method14030(557958198))
				 ? aClass689_11987 : null);
	    Class689_Sub1 class689_sub1
		= ((aClass689_Sub1_11986.method14021(1437656534)
		    && (!aClass689_Sub1_11986.aBool11017 || class689 == null))
		   ? aClass689_Sub1_11986 : null);
	    short i_48_ = HashTable.aClass631_1641.aShort8179;
	    byte i_49_ = HashTable.aClass631_1641.aByte8180;
	    if (aClass299_12255.aShort3296 > -1) {
		i_48_ = aClass299_12255.aShort3296;
		i_49_ = aClass299_12255.aByte3341;
	    }
	    Class179 class179;
	    if (i_48_ > -1
		&& Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub4_10728
		       .method16985(-345840028) == 1)
		class179
		    = Class262.method4781(class182, i_46_,
					  -2009365071 * anInt11971,
					  1295175615 * anInt11972,
					  -827965183 * anInt11973,
					  aClass179Array12010[0], i_48_, i_49_,
					  (class689_sub1 != null
					   ? (Class689) class689_sub1
					   : class689),
					  2102195283);
	    else
		class179
		    = Class75.method1553(class182, i_46_,
					 -2009365071 * anInt11971,
					 1295175615 * anInt11972,
					 anInt11973 * -827965183,
					 (aClass299_12255.anInt3291
					  * 1035256919),
					 aClass179Array12010[0],
					 aClass299_12255.aShort3329 & 0xffff,
					 aClass299_12255.aShort3330 & 0xffff,
					 aClass299_12255.aByte3331 & 0xff,
					 aClass299_12255.aByte3332 & 0xff,
					 (class689_sub1 != null
					  ? (Class689) class689_sub1
					  : class689),
					 2035142557);
	    if (null != class179) {
		class567 = Class293.method5303(method18946(-915619267),
					       (short) -12315);
		aBool11976 = true;
		class182.method3235(false);
		if (bool)
		    class179.method2953(class444_45_, null, 0);
		else {
		    if (null == aClass211Array10869
			|| (aClass211Array10869.length
			    < aClass179Array12010.length + 1))
			method16961(1 + aClass179Array12010.length, -16711936);
		    class179.method2953(class444_45_,
					(aClass211Array10869
					 [aClass179Array12010.length]),
					0);
		}
		class182.method3235(true);
	    }
	}
	if (bool) {
	    if (aClass211Array10869 == null || aClass211Array10869.length > 1)
		method16961(1, -16711936);
	    class182.method3371(class444_45_, aClass211Array10869[0],
				class299.aClass443_3352);
	} else if (aClass211Array10869 == null
		   || aClass211Array10869.length < aClass179Array12010.length)
	    method16961(aClass179Array12010.length, -16711936);
	if (class567 == null)
	    class567
		= Class293.method5303(method18946(-915619267), (short) -14240);
	method18601(class182, aClass179Array12010, class444_45_, false,
		    499380118);
	for (int i_50_ = 0; i_50_ < aClass179Array12010.length; i_50_++) {
	    if (null != aClass179Array12010[i_50_]) {
		if (aClass299_12255.aBool3297)
		    aClass179Array12010[i_50_].method2974
			(anInt12267 * 271515717, anInt12268 * -268342225,
			 anInt12261 * 921784413, anInt12270 * 48970817);
		if (bool)
		    aClass179Array12010[i_50_].method2953(class444_45_, null,
							  0);
		else
		    aClass179Array12010[i_50_].method2953(class444_45_,
							  (aClass211Array10869
							   [i_50_]),
							  0);
	    } else if (!bool)
		aClass211Array10869[i_50_].aBool2265 = false;
	}
	if (null != aClass633_12022) {
	    Class185 class185 = aClass633_12022.method10350();
	    class182.method3412(class185);
	}
	for (int i_51_ = 0; i_51_ < aClass179Array12010.length; i_51_++) {
	    if (null != aClass179Array12010[i_51_])
		aBool11976 |= aClass179Array12010[i_51_].method3017();
	    aClass179Array12010[i_51_] = null;
	}
	anInt11963 = client.anInt11267 * 217032817;
	return class567;
    }
    
    public int method18952(int i) {
	return anIntArray12265[i];
    }
    
    public void method18953(int i, int i_52_, int i_53_, boolean bool,
			    int i_54_) {
	aByte10867 = aByte10870 = (byte) i;
	if (client.aClass507_11137.method8360(1392398554)
		.method7774(i_52_, i_53_, 772812932))
	    aByte10870++;
	if (aClass689_11987.method14021(338190935)
	    && (aClass689_11987.method14058(1309067025).walkingPrecedence * -764414887
		== 1)) {
	    anIntArray11985 = null;
	    aClass689_11987.method14068(-1, (byte) -64);
	}
	for (int i_55_ = 0; i_55_ < aClass540Array12029.length; i_55_++) {
	    if (-1 != 1420286373 * aClass540Array12029[i_55_].anInt7182) {
		Class674 class674
		    = ((Class674)
		       (Class574.aClass40_Sub20_7645.method76
			(aClass540Array12029[i_55_].anInt7182 * 1420286373,
			 -104322299)));
		if (class674.aBool8608 && -1 != class674.anInt8596 * 1700860103
		    && (((AnimationDefinition)
			 Class685.aClass40_Sub8_8691.method76((1700860103
							       * (class674
								  .anInt8596)),
							      1055249450))
			.walkingPrecedence) * -764414887 == 1) {
		    aClass540Array12029[i_55_].aClass689_7183
			.method14068(-1, (byte) -96);
		    aClass540Array12029[i_55_].anInt7182 = -637232685;
		}
	    }
	}
	if (!bool) {
	    int i_56_ = i_52_ - anIntArray12014[0];
	    int i_57_ = i_53_ - anIntArray12017[0];
	    if (i_56_ >= -8 && i_56_ <= 8 && i_57_ >= -8 && i_57_ <= 8) {
		if (-2046237799 * anInt12015 < anIntArray12014.length - 1)
		    anInt12015 += -901267287;
		for (int i_58_ = anInt12015 * -2046237799; i_58_ > 0;
		     i_58_--) {
		    anIntArray12014[i_58_] = anIntArray12014[i_58_ - 1];
		    anIntArray12017[i_58_] = anIntArray12017[i_58_ - 1];
		    aByteArray12007[i_58_] = aByteArray12007[i_58_ - 1];
		}
		anIntArray12014[0] = i_52_;
		anIntArray12017[0] = i_53_;
		aByteArray12007[0] = Class684.aClass684_8668.aByte8666;
		return;
	    }
	}
	anInt12015 = 0;
	anInt11970 = 0;
	anInt12019 = 0;
	anIntArray12014[0] = i_52_;
	anIntArray12017[0] = i_53_;
	Class446 class446 = Class446.method7209(method10818().aClass446_4807);
	class446.aFloat4895
	    = (float) ((i_54_ << 8) + (anIntArray12014[0] << 9));
	class446.aFloat4897
	    = (float) ((i_54_ << 8) + (anIntArray12017[0] << 9));
	method10823(class446);
	class446.method7260();
	if (null != aClass633_12022)
	    aClass633_12022.method10330();
    }
    
    public Class553 method16954(Class182 class182) {
	return null;
    }
    
    public int method71() {
	return 2032864281 * anInt11964;
    }
    
    public int method83() {
	return 2032864281 * anInt11964;
    }
    
    boolean method16965(Class182 class182, int i, int i_59_) {
	if (aClass299_12255 == null)
	    return false;
	if (null != aClass299_12255.aClass443_3352)
	    return class182.method3414(i, i_59_, method10826(),
				       aClass299_12255.aClass443_3352,
				       (byte) -80);
	if (!method18947(class182, 131072, (byte) 11))
	    return false;
	Class444 class444 = method10826();
	boolean bool = false;
	for (int i_60_ = 0; i_60_ < aClass179Array12010.length; i_60_++) {
	    if (aClass179Array12010[i_60_] != null
		&& aClass179Array12010[i_60_].aBool1917) {
		boolean bool_61_;
	    while_28_:
		do {
		    do {
			if (976681435 * aClass299_12255.anInt3355 <= 0) {
			    if (aClass299_12255.anInt3351 * -1168520027
				== -1) {
				if (aClass299_12255.anInt3291 * 1035256919
				    != 1)
				    break;
			    } else if (-1168520027 * aClass299_12255.anInt3351
				       != 1)
				break;
			}
			bool_61_ = true;
			break while_28_;
		    } while (false);
		    bool_61_ = false;
		} while (false);
		boolean bool_62_ = bool_61_;
		boolean bool_63_
		    = aClass179Array12010[i_60_].method2954(i, i_59_, class444,
							    bool_62_,
							    (976681435
							     * (aClass299_12255
								.anInt3355)));
		if (bool_63_) {
		    bool = true;
		    break;
		}
	    }
	}
	for (int i_64_ = 0; i_64_ < aClass179Array12010.length; i_64_++)
	    aClass179Array12010[i_64_] = null;
	return bool;
    }
    
    public Class525_Sub28 method178() {
	Class600 class600 = client.aClass507_11137.method8350(1945199249);
	return (Class514.method8554
		(aByte10867,
		 ((int) method10818().aClass446_4807.aFloat4895
		  + class600.anInt7858 * -1159839232),
		 -(int) method10818().aClass446_4807.aFloat4896,
		 ((int) method10818().aClass446_4807.aFloat4897
		  + class600.anInt7860 * 1633099264),
		 962745216));
    }
    
    public Class525_Sub28 method179() {
	Class600 class600 = client.aClass507_11137.method8350(1185580437);
	return (Class514.method8554
		(aByte10867,
		 ((int) method10818().aClass446_4807.aFloat4895
		  + class600.anInt7858 * -1159839232),
		 -(int) method10818().aClass446_4807.aFloat4896,
		 ((int) method10818().aClass446_4807.aFloat4897
		  + class600.anInt7860 * 1633099264),
		 1441563947));
    }
    
    public Class307 method174() {
	return Class307.aClass307_3415;
    }
    
    public Class429 method181() {
	Class429 class429 = Class429.method6864();
	class429.method6821(Class436.method7071(aClass64_11992.anInt694
						* 2030157131),
			    0.0F, 0.0F);
	return class429;
    }
    
    public Class429 method182() {
	Class429 class429 = Class429.method6864();
	class429.method6821(Class436.method7071(aClass64_11992.anInt694
						* 2030157131),
			    0.0F, 0.0F);
	return class429;
    }
    
    public Class429 method183() {
	Class429 class429 = Class429.method6864();
	class429.method6821(Class436.method7071(aClass64_11992.anInt694
						* 2030157131),
			    0.0F, 0.0F);
	return class429;
    }
    
    public final boolean method18954(int i) {
	if (null == aClass299_12255)
	    return false;
	return true;
    }
    
    public Class446 method185() {
	return Class446.method7207();
    }
    
    public int method77() {
	return 2032864281 * anInt11964;
    }
    
    public int method8() {
	return 2032864281 * anInt11964;
    }
    
    void method16938(Class182 class182) {
	if (null != aClass299_12255
	    && (aBool12023 || method18947(class182, 0, (byte) -6))) {
	    Class444 class444 = class182.method3225();
	    class444.method7154(method10826());
	    class444.method7147(0.0F, -5.0F, 0.0F);
	    method18601(class182, aClass179Array12010, class444, aBool12023,
			1547629099);
	    for (int i = 0; i < aClass179Array12010.length; i++)
		aClass179Array12010[i] = null;
	}
    }
    
    public void method18955(String string, int i, int i_65_) {
	int i_66_ = (Class424.method6768(1684836768)
		     * (HashTable.aClass631_1641.anInt8187 * 166193699));
	method18617(string, i, i_65_, i_66_, -1778278627);
    }
    
    boolean method16940(Class182 class182, int i, int i_67_) {
	if (aClass299_12255 == null)
	    return false;
	if (null != aClass299_12255.aClass443_3352)
	    return class182.method3414(i, i_67_, method10826(),
				       aClass299_12255.aClass443_3352,
				       (byte) -4);
	if (!method18947(class182, 131072, (byte) -63))
	    return false;
	Class444 class444 = method10826();
	boolean bool = false;
	for (int i_68_ = 0; i_68_ < aClass179Array12010.length; i_68_++) {
	    if (aClass179Array12010[i_68_] != null
		&& aClass179Array12010[i_68_].aBool1917) {
		boolean bool_69_;
	    while_29_:
		do {
		    do {
			if (976681435 * aClass299_12255.anInt3355 <= 0) {
			    if (aClass299_12255.anInt3351 * -1168520027
				== -1) {
				if (aClass299_12255.anInt3291 * 1035256919
				    != 1)
				    break;
			    } else if (-1168520027 * aClass299_12255.anInt3351
				       != 1)
				break;
			}
			bool_69_ = true;
			break while_29_;
		    } while (false);
		    bool_69_ = false;
		} while (false);
		boolean bool_70_ = bool_69_;
		boolean bool_71_
		    = aClass179Array12010[i_68_].method2954(i, i_67_, class444,
							    bool_70_,
							    (976681435
							     * (aClass299_12255
								.anInt3355)));
		if (bool_71_) {
		    bool = true;
		    break;
		}
	    }
	}
	for (int i_72_ = 0; i_72_ < aClass179Array12010.length; i_72_++)
	    aClass179Array12010[i_72_] = null;
	return bool;
    }
    
    boolean method18956(Class182 class182, int i) {
	int i_73_ = i;
	Class586 class586 = method18633((byte) -78);
	Class689 class689 = ((aClass689_11987.method14021(1437817329)
			      && !aClass689_11987.method14030(1929745576))
			     ? aClass689_11987 : null);
	Class689_Sub1 class689_sub1
	    = ((aClass689_Sub1_11986.method14021(1225221308)
		&& (!aClass689_Sub1_11986.aBool11017 || null == class689))
	       ? aClass689_Sub1_11986 : null);
	int i_74_ = class586.anInt7751 * 174151703;
	int i_75_ = class586.anInt7752 * -429863361;
	if (0 != i_74_ || 0 != i_75_ || 0 != class586.anInt7748 * 1307034469
	    || 1272709361 * class586.anInt7767 != 0)
	    i |= 0x7;
	boolean bool
	    = (aByte11979 != 0 && client.anInt11083 >= 1656114695 * anInt11981
	       && client.anInt11083 < anInt11999 * 59570639);
	if (bool)
	    i |= 0x80000;
	boolean bool_76_ = false;
	if (583548209 * anInt12005 != 0) {
	    NPCDefinitions class299
		= (null != aClass299_12255.anIntArray3323
		   ? aClass299_12255.method5386(Class532.aClass111_7170,
						Class532.aClass111_7170,
						2125405983)
		   : aClass299_12255);
	    if (null == class299
		|| client.anInt11083 >= (1898135825 * class299.anInt3292
					 + anInt12004 * -1744495699))
		anInt12005 = 0;
	    else {
		anInt12005
		    = (-247989295
		       * (255 - ((client.anInt11083 - anInt12004 * -1744495699)
				 * 255 / (1898135825 * class299.anInt3292))));
		bool_76_ = true;
	    }
	}
	if (bool_76_)
	    i |= 0x100;
	int i_77_ = aClass64_11992.method1393((short) 11049);
	Class179 class179
	    = (aClass179Array12010[0]
	       = aClass299_12255.method5372(class182, i,
					    Class227.aClass40_Sub1_2345,
					    Class532.aClass111_7170,
					    Class532.aClass111_7170, class689,
					    class689_sub1,
					    aClass689_Sub2_Sub1Array11998,
					    anIntArray12008, i_77_,
					    aClass288_12258,
					    method18626((byte) 4), false,
					    (byte) 103));
	if (class179 == null)
	    return false;
	anInt12025 = class179.method2960() * -411987203;
	anInt11988 = class179.method2964() * -1125261377;
	class179.method2957();
	method18672(class179, -1304080978);
	if (i_74_ != 0 || 0 != i_75_) {
	    method18612(i_77_, i_74_, i_75_, 1056489539 * class586.anInt7753,
			-1802986919 * class586.anInt7754, 1549832876);
	    if (0 != anInt11971 * -2009365071)
		aClass179Array12010[0].method2932(-2009365071 * anInt11971);
	    if (anInt11972 * 1295175615 != 0)
		aClass179Array12010[0].method2933(anInt11972 * 1295175615);
	    if (0 != anInt11973 * -827965183)
		aClass179Array12010[0].method2934(0, -827965183 * anInt11973,
						  0);
	} else
	    method18612(i_77_, method18608((byte) 64) << 9,
			method18608((byte) 74) << 9, 0, 0, -1279377887);
	if (bool)
	    class179.method2974(aByte12000, aByte12001, aByte12002,
				aByte11979 & 0xff);
	if (bool_76_)
	    class179.method2972((byte) (anInt12005 * 583548209), null);
	method18611(class182, class586, i_73_, i_74_, i_75_, i_77_,
		    (short) 8192);
	return true;
    }
    
    final boolean method16957() {
	return false;
    }
    
    final boolean method16943() {
	return false;
    }
    
    final boolean method16944() {
	return false;
    }
    
    final boolean method16945() {
	return false;
    }
    
    public Class446 method184() {
	return Class446.method7207();
    }
    
    final void method16951() {
	throw new IllegalStateException();
    }
    
    public int method18957(int i) {
	return anIntArray12263[i];
    }
    
    int method18674() {
	if (749025781 * anInt12256 != -1)
	    return 749025781 * anInt12256;
	if (null != aClass299_12255.anIntArray3323) {
	    NPCDefinitions class299
		= aClass299_12255.method5386(Class532.aClass111_7170,
					     Class532.aClass111_7170,
					     2101844846);
	    if (class299 != null && -1 != 386089707 * class299.anInt3295)
		return class299.anInt3295 * 386089707;
	}
	return 386089707 * aClass299_12255.anInt3295;
    }
    
    public void method18958(NPCDefinitions class299) {
	method18943(class299, true, true, true, 1477700673);
    }
    
    public boolean method18678() {
	return HashTable.aClass631_1641.aBool8174;
    }
    
    public int method18677() {
	if (null != aClass299_12255.anIntArray3323) {
	    NPCDefinitions class299
		= aClass299_12255.method5386(Class532.aClass111_7170,
					     Class532.aClass111_7170,
					     2116747878);
	    if (null != class299 && -1 != class299.anInt3288 * 1932570145)
		return 1932570145 * class299.anInt3288;
	}
	return aClass299_12255.anInt3288 * 1932570145;
    }
    
    public Class307 method180(int i) {
	return Class307.aClass307_3415;
    }
    
    public Class524 method18616(int i) {
	if (null != aClass524_11975 && aClass524_11975.aString7109 == null)
	    return null;
	return aClass524_11975;
    }
    
    public int method18693() {
	return 1 + anInt11964 * 2032864281;
    }
    
    public Class553 method16946(Class182 class182) {
	return null;
    }
    
    public Class553 method16953(Class182 class182) {
	return null;
    }
    
    public Class656_Sub1_Sub3_Sub1_Sub2(Class546 class546) {
	super(class546, Class293.aClass106_Sub1_Sub2_3239);
	anInt12257 = 1238434123;
	anInt12256 = -486599261;
	anIntArray12265 = new int[6];
	anIntArray12263 = new int[6];
	method18941(1791093682);
    }
    
    public Class553 method16955(Class182 class182) {
	return null;
    }
    
    Class567 method16921(Class182 class182) {
	if (null == aClass299_12255
	    || !method18947(class182, 526336, (byte) -46))
	    return null;
	Class444 class444 = method10826();
	Class428 class428 = method10818();
	Class444 class444_78_ = class182.method3225();
	int i = aClass64_11992.method1393((short) 4671);
	Class547 class547
	    = (aClass546_10872.aClass547ArrayArrayArray7263[aByte10867]
	       [(int) class428.aClass446_4807.aFloat4895 >> 9]
	       [(int) class428.aClass446_4807.aFloat4897 >> 9]);
	if (null != class547 && null != class547.aClass656_Sub1_Sub1_7264) {
	    int i_79_ = (2037461243 * anInt11994
			 - class547.aClass656_Sub1_Sub1_7264.aShort11836);
	    anInt11994 = (int) ((float) (anInt11994 * 2037461243)
				- (float) i_79_ / 10.0F) * 1656838707;
	} else
	    anInt11994 = 1656838707 * (int) ((float) (2037461243 * anInt11994)
					     - (float) (anInt11994
							* 2037461243) / 10.0F);
	class444_78_.method7154(class444);
	class444_78_.method7147(0.0F, (float) (-20 - anInt11994 * 2037461243),
				0.0F);
	Class586 class586 = method18633((byte) -35);
	NPCDefinitions class299
	    = (aClass299_12255.anIntArray3323 != null
	       ? aClass299_12255.method5386(Class532.aClass111_7170,
					    Class532.aClass111_7170,
					    2107396796)
	       : aClass299_12255);
	boolean bool = class299.aClass443_3352 != null;
	aBool11976 = false;
	Class567 class567 = null;
	if (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub17_10676
		.method17123(-124515082) == 1
	    && class299.aBool3328 && class586.aBool7727) {
	    Class689 class689 = ((aClass689_11987.method14021(-1935700932)
				  && aClass689_11987.method14030(1938971551))
				 ? aClass689_11987 : null);
	    Class689_Sub1 class689_sub1
		= ((aClass689_Sub1_11986.method14021(-1478942223)
		    && (!aClass689_Sub1_11986.aBool11017 || class689 == null))
		   ? aClass689_Sub1_11986 : null);
	    short i_80_ = HashTable.aClass631_1641.aShort8179;
	    byte i_81_ = HashTable.aClass631_1641.aByte8180;
	    if (aClass299_12255.aShort3296 > -1) {
		i_80_ = aClass299_12255.aShort3296;
		i_81_ = aClass299_12255.aByte3341;
	    }
	    Class179 class179;
	    if (i_80_ > -1
		&& Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub4_10728
		       .method16985(2060914763) == 1)
		class179
		    = Class262.method4781(class182, i,
					  -2009365071 * anInt11971,
					  1295175615 * anInt11972,
					  -827965183 * anInt11973,
					  aClass179Array12010[0], i_80_, i_81_,
					  (class689_sub1 != null
					   ? (Class689) class689_sub1
					   : class689),
					  1964997953);
	    else
		class179
		    = Class75.method1553(class182, i, -2009365071 * anInt11971,
					 1295175615 * anInt11972,
					 anInt11973 * -827965183,
					 (aClass299_12255.anInt3291
					  * 1035256919),
					 aClass179Array12010[0],
					 aClass299_12255.aShort3329 & 0xffff,
					 aClass299_12255.aShort3330 & 0xffff,
					 aClass299_12255.aByte3331 & 0xff,
					 aClass299_12255.aByte3332 & 0xff,
					 (class689_sub1 != null
					  ? (Class689) class689_sub1
					  : class689),
					 2083702268);
	    if (null != class179) {
		class567 = Class293.method5303(method18946(-915619267),
					       (short) -30755);
		aBool11976 = true;
		class182.method3235(false);
		if (bool)
		    class179.method2953(class444_78_, null, 0);
		else {
		    if (null == aClass211Array10869
			|| (aClass211Array10869.length
			    < aClass179Array12010.length + 1))
			method16961(1 + aClass179Array12010.length, -16711936);
		    class179.method2953(class444_78_,
					(aClass211Array10869
					 [aClass179Array12010.length]),
					0);
		}
		class182.method3235(true);
	    }
	}
	if (bool) {
	    if (aClass211Array10869 == null || aClass211Array10869.length > 1)
		method16961(1, -16711936);
	    class182.method3371(class444_78_, aClass211Array10869[0],
				class299.aClass443_3352);
	} else if (aClass211Array10869 == null
		   || aClass211Array10869.length < aClass179Array12010.length)
	    method16961(aClass179Array12010.length, -16711936);
	if (class567 == null)
	    class567
		= Class293.method5303(method18946(-915619267), (short) -26748);
	method18601(class182, aClass179Array12010, class444_78_, false,
		    -225036153);
	for (int i_82_ = 0; i_82_ < aClass179Array12010.length; i_82_++) {
	    if (null != aClass179Array12010[i_82_]) {
		if (aClass299_12255.aBool3297)
		    aClass179Array12010[i_82_].method2974
			(anInt12267 * 271515717, anInt12268 * -268342225,
			 anInt12261 * 921784413, anInt12270 * 48970817);
		if (bool)
		    aClass179Array12010[i_82_].method2953(class444_78_, null,
							  0);
		else
		    aClass179Array12010[i_82_].method2953(class444_78_,
							  (aClass211Array10869
							   [i_82_]),
							  0);
	    } else if (!bool)
		aClass211Array10869[i_82_].aBool2265 = false;
	}
	if (null != aClass633_12022) {
	    Class185 class185 = aClass633_12022.method10350();
	    class182.method3412(class185);
	}
	for (int i_83_ = 0; i_83_ < aClass179Array12010.length; i_83_++) {
	    if (null != aClass179Array12010[i_83_])
		aBool11976 |= aClass179Array12010[i_83_].method3017();
	    aClass179Array12010[i_83_] = null;
	}
	anInt11963 = client.anInt11267 * 217032817;
	return class567;
    }
    
    int method16960() {
	if (aClass299_12255 == null)
	    return 0;
	return 976681435 * aClass299_12255.anInt3355;
    }
    
    void method18959() {
	anInt12267 = (32 + (int) (Math.random() * 4.0)) * -449310067;
	anInt12268 = (3 + (int) (Math.random() * 2.0)) * 352279247;
	anInt12261 = (16 + (int) (Math.random() * 3.0)) * -171899915;
	if (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub4_10728
		.method16985(1848180383)
	    == 1)
	    anInt12270 = (int) (Math.random() * 6.0) * -1031875647;
	else
	    anInt12270 = (int) (Math.random() * 12.0) * -1031875647;
    }
    
    void method18960() {
	anInt12267 = (32 + (int) (Math.random() * 4.0)) * -449310067;
	anInt12268 = (3 + (int) (Math.random() * 2.0)) * 352279247;
	anInt12261 = (16 + (int) (Math.random() * 3.0)) * -171899915;
	if (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub4_10728
		.method16985(-1103817144)
	    == 1)
	    anInt12270 = (int) (Math.random() * 6.0) * -1031875647;
	else
	    anInt12270 = (int) (Math.random() * 12.0) * -1031875647;
    }
    
    void method18961() {
	anInt12267 = (32 + (int) (Math.random() * 4.0)) * -449310067;
	anInt12268 = (3 + (int) (Math.random() * 2.0)) * 352279247;
	anInt12261 = (16 + (int) (Math.random() * 3.0)) * -171899915;
	if (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub4_10728
		.method16985(-559574361)
	    == 1)
	    anInt12270 = (int) (Math.random() * 6.0) * -1031875647;
	else
	    anInt12270 = (int) (Math.random() * 12.0) * -1031875647;
    }
    
    boolean method16939(Class182 class182, int i, int i_84_) {
	if (aClass299_12255 == null)
	    return false;
	if (null != aClass299_12255.aClass443_3352)
	    return class182.method3414(i, i_84_, method10826(),
				       aClass299_12255.aClass443_3352,
				       (byte) -35);
	if (!method18947(class182, 131072, (byte) 14))
	    return false;
	Class444 class444 = method10826();
	boolean bool = false;
	for (int i_85_ = 0; i_85_ < aClass179Array12010.length; i_85_++) {
	    if (aClass179Array12010[i_85_] != null
		&& aClass179Array12010[i_85_].aBool1917) {
		boolean bool_86_;
	    while_30_:
		do {
		    do {
			if (976681435 * aClass299_12255.anInt3355 <= 0) {
			    if (aClass299_12255.anInt3351 * -1168520027
				== -1) {
				if (aClass299_12255.anInt3291 * 1035256919
				    != 1)
				    break;
			    } else if (-1168520027 * aClass299_12255.anInt3351
				       != 1)
				break;
			}
			bool_86_ = true;
			break while_30_;
		    } while (false);
		    bool_86_ = false;
		} while (false);
		boolean bool_87_ = bool_86_;
		boolean bool_88_
		    = aClass179Array12010[i_85_].method2954(i, i_84_, class444,
							    bool_87_,
							    (976681435
							     * (aClass299_12255
								.anInt3355)));
		if (bool_88_) {
		    bool = true;
		    break;
		}
	    }
	}
	for (int i_89_ = 0; i_89_ < aClass179Array12010.length; i_89_++)
	    aClass179Array12010[i_89_] = null;
	return bool;
    }
    
    public boolean method16969() {
	if (null != aClass299_12255.anIntArray3323
	    && (aClass299_12255.method5386(Class532.aClass111_7170,
					   Class532.aClass111_7170, 2101455348)
		== null))
	    return false;
	return true;
    }
    
    public void method18962(NPCDefinitions class299, boolean bool, boolean bool_90_,
							boolean bool_91_) {
	if (aClass299_12255 != class299 && Class61.aBool670
	    && Class385.method6443(anInt11964 * 2032864281, -1761587277))
	    Class219.method4200((byte) 114);
	aClass299_12255 = class299;
	if (null != aClass299_12255) {
	    if (bool)
		aString12264 = aClass299_12255.aString3290;
	    if (bool_90_)
		anInt12260 = aClass299_12255.anInt3311 * 1093076055;
	    if (bool_91_)
		aClass310_12262 = null;
	}
	if (aClass633_12022 != null)
	    aClass633_12022.method10330();
    }
    
    public void method18963(NPCDefinitions class299, boolean bool, boolean bool_92_,
							boolean bool_93_) {
	if (aClass299_12255 != class299 && Class61.aBool670
	    && Class385.method6443(anInt11964 * 2032864281, -1761587277))
	    Class219.method4200((byte) -1);
	aClass299_12255 = class299;
	if (null != aClass299_12255) {
	    if (bool)
		aString12264 = aClass299_12255.aString3290;
	    if (bool_92_)
		anInt12260 = aClass299_12255.anInt3311 * 1093076055;
	    if (bool_93_)
		aClass310_12262 = null;
	}
	if (aClass633_12022 != null)
	    aClass633_12022.method10330();
    }
    
    public int method18964(int i, int i_94_) {
	return anIntArray12265[i];
    }
    
    public Class524 method18635() {
	if (null != aClass524_11975 && aClass524_11975.aString7109 == null)
	    return null;
	return aClass524_11975;
    }
    
    public final void method18965(Class682 class682, int i) {
	int i_95_ = anIntArray12014[0];
	int i_96_ = anIntArray12017[0];
	switch (-1785760645 * class682.anInt8635) {
	case 2:
	    i_95_++;
	    i_96_++;
	    break;
	case 3:
	    i_96_++;
	    break;
	case 1:
	    i_95_--;
	    i_96_--;
	    break;
	case 4:
	    i_95_++;
	    break;
	case 0:
	    i_95_--;
	    break;
	case 7:
	    i_95_++;
	    i_96_--;
	    break;
	case 6:
	    i_96_--;
	    break;
	case 5:
	    i_95_--;
	    i_96_++;
	    break;
	}
	if (aClass689_11987.method14021(838105195)
	    && (aClass689_11987.method14058(404092601).walkingPrecedence * -764414887
		== 1)) {
	    anIntArray11985 = null;
	    aClass689_11987.method14068(-1, (byte) -29);
	}
	for (int i_97_ = 0; i_97_ < aClass540Array12029.length; i_97_++) {
	    if (1420286373 * aClass540Array12029[i_97_].anInt7182 != -1) {
		Class674 class674
		    = ((Class674)
		       (Class574.aClass40_Sub20_7645.method76
			(1420286373 * aClass540Array12029[i_97_].anInt7182,
			 622398067)));
		if (class674.aBool8608 && -1 != class674.anInt8596 * 1700860103
		    && (((AnimationDefinition)
			 Class685.aClass40_Sub8_8691.method76(((class674
								.anInt8596)
							       * 1700860103),
							      -1140973148))
			.walkingPrecedence) * -764414887 == 1) {
		    aClass540Array12029[i_97_].aClass689_7183
			.method14068(-1, (byte) -9);
		    aClass540Array12029[i_97_].anInt7182 = -637232685;
		}
	    }
	}
	if (anInt12015 * -2046237799 < anIntArray12014.length - 1)
	    anInt12015 += -901267287;
	for (int i_98_ = anInt12015 * -2046237799; i_98_ > 0; i_98_--) {
	    anIntArray12014[i_98_] = anIntArray12014[i_98_ - 1];
	    anIntArray12017[i_98_] = anIntArray12017[i_98_ - 1];
	    aByteArray12007[i_98_] = aByteArray12007[i_98_ - 1];
	}
	anIntArray12014[0] = i_95_;
	anIntArray12017[0] = i_96_;
	aByteArray12007[0] = (byte) i;
    }
    
    public final void method18966(Class682 class682, int i) {
	int i_99_ = anIntArray12014[0];
	int i_100_ = anIntArray12017[0];
	switch (-1785760645 * class682.anInt8635) {
	case 2:
	    i_99_++;
	    i_100_++;
	    break;
	case 3:
	    i_100_++;
	    break;
	case 1:
	    i_99_--;
	    i_100_--;
	    break;
	case 4:
	    i_99_++;
	    break;
	case 0:
	    i_99_--;
	    break;
	case 7:
	    i_99_++;
	    i_100_--;
	    break;
	case 6:
	    i_100_--;
	    break;
	case 5:
	    i_99_--;
	    i_100_++;
	    break;
	}
	if (aClass689_11987.method14021(-1333637615)
	    && (aClass689_11987.method14058(-1170395771).walkingPrecedence * -764414887
		== 1)) {
	    anIntArray11985 = null;
	    aClass689_11987.method14068(-1, (byte) -92);
	}
	for (int i_101_ = 0; i_101_ < aClass540Array12029.length; i_101_++) {
	    if (1420286373 * aClass540Array12029[i_101_].anInt7182 != -1) {
		Class674 class674
		    = ((Class674)
		       (Class574.aClass40_Sub20_7645.method76
			(1420286373 * aClass540Array12029[i_101_].anInt7182,
			 -1430244470)));
		if (class674.aBool8608 && -1 != class674.anInt8596 * 1700860103
		    && (((AnimationDefinition)
			 Class685.aClass40_Sub8_8691.method76(((class674
								.anInt8596)
							       * 1700860103),
							      2107555493))
			.walkingPrecedence) * -764414887 == 1) {
		    aClass540Array12029[i_101_].aClass689_7183
			.method14068(-1, (byte) -12);
		    aClass540Array12029[i_101_].anInt7182 = -637232685;
		}
	    }
	}
	if (anInt12015 * -2046237799 < anIntArray12014.length - 1)
	    anInt12015 += -901267287;
	for (int i_102_ = anInt12015 * -2046237799; i_102_ > 0; i_102_--) {
	    anIntArray12014[i_102_] = anIntArray12014[i_102_ - 1];
	    anIntArray12017[i_102_] = anIntArray12017[i_102_ - 1];
	    aByteArray12007[i_102_] = aByteArray12007[i_102_ - 1];
	}
	anIntArray12014[0] = i_99_;
	anIntArray12017[0] = i_100_;
	aByteArray12007[0] = (byte) i;
    }
    
    public void method18967(int i, int i_103_, int i_104_, boolean bool,
			    int i_105_) {
	aByte10867 = aByte10870 = (byte) i;
	if (client.aClass507_11137.method8360(1949385010)
		.method7774(i_103_, i_104_, 550378848))
	    aByte10870++;
	if (aClass689_11987.method14021(1167880851)
	    && (aClass689_11987.method14058(-530932718).walkingPrecedence * -764414887
		== 1)) {
	    anIntArray11985 = null;
	    aClass689_11987.method14068(-1, (byte) -89);
	}
	for (int i_106_ = 0; i_106_ < aClass540Array12029.length; i_106_++) {
	    if (-1 != 1420286373 * aClass540Array12029[i_106_].anInt7182) {
		Class674 class674
		    = ((Class674)
		       (Class574.aClass40_Sub20_7645.method76
			(aClass540Array12029[i_106_].anInt7182 * 1420286373,
			 242444241)));
		if (class674.aBool8608 && -1 != class674.anInt8596 * 1700860103
		    && (((AnimationDefinition)
			 Class685.aClass40_Sub8_8691.method76((1700860103
							       * (class674
								  .anInt8596)),
							      -731438314))
			.walkingPrecedence) * -764414887 == 1) {
		    aClass540Array12029[i_106_].aClass689_7183
			.method14068(-1, (byte) 8);
		    aClass540Array12029[i_106_].anInt7182 = -637232685;
		}
	    }
	}
	if (!bool) {
	    int i_107_ = i_103_ - anIntArray12014[0];
	    int i_108_ = i_104_ - anIntArray12017[0];
	    if (i_107_ >= -8 && i_107_ <= 8 && i_108_ >= -8 && i_108_ <= 8) {
		if (-2046237799 * anInt12015 < anIntArray12014.length - 1)
		    anInt12015 += -901267287;
		for (int i_109_ = anInt12015 * -2046237799; i_109_ > 0;
		     i_109_--) {
		    anIntArray12014[i_109_] = anIntArray12014[i_109_ - 1];
		    anIntArray12017[i_109_] = anIntArray12017[i_109_ - 1];
		    aByteArray12007[i_109_] = aByteArray12007[i_109_ - 1];
		}
		anIntArray12014[0] = i_103_;
		anIntArray12017[0] = i_104_;
		aByteArray12007[0] = Class684.aClass684_8668.aByte8666;
		return;
	    }
	}
	anInt12015 = 0;
	anInt11970 = 0;
	anInt12019 = 0;
	anIntArray12014[0] = i_103_;
	anIntArray12017[0] = i_104_;
	Class446 class446 = Class446.method7209(method10818().aClass446_4807);
	class446.aFloat4895
	    = (float) ((i_105_ << 8) + (anIntArray12014[0] << 9));
	class446.aFloat4897
	    = (float) ((i_105_ << 8) + (anIntArray12017[0] << 9));
	method10823(class446);
	class446.method7260();
	if (null != aClass633_12022)
	    aClass633_12022.method10330();
    }
    
    public void method18968(String string, int i, int i_110_) {
	int i_111_ = (Class424.method6768(1684836768)
		      * (HashTable.aClass631_1641.anInt8187 * 166193699));
	method18617(string, i, i_110_, i_111_, -1778278627);
    }
    
    public final boolean method18969() {
	if (null == aClass299_12255)
	    return false;
	return true;
    }
    
    boolean method18970(Class182 class182, int i) {
	int i_112_ = i;
	Class586 class586 = method18633((byte) -120);
	Class689 class689 = ((aClass689_11987.method14021(-295511501)
			      && !aClass689_11987.method14030(-1711863756))
			     ? aClass689_11987 : null);
	Class689_Sub1 class689_sub1
	    = ((aClass689_Sub1_11986.method14021(1927395259)
		&& (!aClass689_Sub1_11986.aBool11017 || null == class689))
	       ? aClass689_Sub1_11986 : null);
	int i_113_ = class586.anInt7751 * 174151703;
	int i_114_ = class586.anInt7752 * -429863361;
	if (0 != i_113_ || 0 != i_114_ || 0 != class586.anInt7748 * 1307034469
	    || 1272709361 * class586.anInt7767 != 0)
	    i |= 0x7;
	boolean bool
	    = (aByte11979 != 0 && client.anInt11083 >= 1656114695 * anInt11981
	       && client.anInt11083 < anInt11999 * 59570639);
	if (bool)
	    i |= 0x80000;
	boolean bool_115_ = false;
	if (583548209 * anInt12005 != 0) {
	    NPCDefinitions class299
		= (null != aClass299_12255.anIntArray3323
		   ? aClass299_12255.method5386(Class532.aClass111_7170,
						Class532.aClass111_7170,
						2144190923)
		   : aClass299_12255);
	    if (null == class299
		|| client.anInt11083 >= (1898135825 * class299.anInt3292
					 + anInt12004 * -1744495699))
		anInt12005 = 0;
	    else {
		anInt12005
		    = (-247989295
		       * (255 - ((client.anInt11083 - anInt12004 * -1744495699)
				 * 255 / (1898135825 * class299.anInt3292))));
		bool_115_ = true;
	    }
	}
	if (bool_115_)
	    i |= 0x100;
	int i_116_ = aClass64_11992.method1393((short) 22355);
	Class179 class179
	    = (aClass179Array12010[0]
	       = aClass299_12255.method5372(class182, i,
					    Class227.aClass40_Sub1_2345,
					    Class532.aClass111_7170,
					    Class532.aClass111_7170, class689,
					    class689_sub1,
					    aClass689_Sub2_Sub1Array11998,
					    anIntArray12008, i_116_,
					    aClass288_12258,
					    method18626((byte) 4), false,
					    (byte) 89));
	if (class179 == null)
	    return false;
	anInt12025 = class179.method2960() * -411987203;
	anInt11988 = class179.method2964() * -1125261377;
	class179.method2957();
	method18672(class179, -248496772);
	if (i_113_ != 0 || 0 != i_114_) {
	    method18612(i_116_, i_113_, i_114_,
			1056489539 * class586.anInt7753,
			-1802986919 * class586.anInt7754, 1763506616);
	    if (0 != anInt11971 * -2009365071)
		aClass179Array12010[0].method2932(-2009365071 * anInt11971);
	    if (anInt11972 * 1295175615 != 0)
		aClass179Array12010[0].method2933(anInt11972 * 1295175615);
	    if (0 != anInt11973 * -827965183)
		aClass179Array12010[0].method2934(0, -827965183 * anInt11973,
						  0);
	} else
	    method18612(i_116_, method18608((byte) 19) << 9,
			method18608((byte) 73) << 9, 0, 0, -769632322);
	if (bool)
	    class179.method2974(aByte12000, aByte12001, aByte12002,
				aByte11979 & 0xff);
	if (bool_115_)
	    class179.method2972((byte) (anInt12005 * 583548209), null);
	method18611(class182, class586, i_112_, i_113_, i_114_, i_116_,
		    (short) 8192);
	return true;
    }
    
    public Class525_Sub28 method177() {
	Class600 class600 = client.aClass507_11137.method8350(-328390997);
	return (Class514.method8554
		(aByte10867,
		 ((int) method10818().aClass446_4807.aFloat4895
		  + class600.anInt7858 * -1159839232),
		 -(int) method10818().aClass446_4807.aFloat4896,
		 ((int) method10818().aClass446_4807.aFloat4897
		  + class600.anInt7860 * 1633099264),
		 1023124041));
    }
    
    public int method18971(int i) {
	return anIntArray12263[i];
    }
    
    int method18675() {
	if (749025781 * anInt12256 != -1)
	    return 749025781 * anInt12256;
	if (null != aClass299_12255.anIntArray3323) {
	    NPCDefinitions class299
		= aClass299_12255.method5386(Class532.aClass111_7170,
					     Class532.aClass111_7170,
					     2121890622);
	    if (class299 != null && -1 != 386089707 * class299.anInt3295)
		return class299.anInt3295 * 386089707;
	}
	return 386089707 * aClass299_12255.anInt3295;
    }
    
    public Class429 method176() {
	Class429 class429 = Class429.method6864();
	class429.method6821(Class436.method7071(aClass64_11992.anInt694
						* 2030157131),
			    0.0F, 0.0F);
	return class429;
    }
    
    public Class524 method18641() {
	if (null != aClass524_11975 && aClass524_11975.aString7109 == null)
	    return null;
	return aClass524_11975;
    }
    
    public boolean method16970() {
	if (null != aClass299_12255.anIntArray3323
	    && (aClass299_12255.method5386(Class532.aClass111_7170,
					   Class532.aClass111_7170, 2130240932)
		== null))
	    return false;
	return true;
    }
    
    public boolean method16966() {
	if (null != aClass299_12255.anIntArray3323
	    && (aClass299_12255.method5386(Class532.aClass111_7170,
					   Class532.aClass111_7170, 2095389998)
		== null))
	    return false;
	return true;
    }
    
    public boolean method16967() {
	if (null != aClass299_12255.anIntArray3323
	    && (aClass299_12255.method5386(Class532.aClass111_7170,
					   Class532.aClass111_7170, 2131372447)
		== null))
	    return false;
	return true;
    }
    
    public Class446 method172(int i) {
	return Class446.method7207();
    }
    
    public int method16975() {
	if (aClass299_12255.anIntArray3323 != null) {
	    NPCDefinitions class299
		= aClass299_12255.method5386(Class532.aClass111_7170,
					     Class532.aClass111_7170,
					     2102699602);
	    if (null != class299 && -38618711 * class299.anInt3338 != -1)
		return class299.anInt3338 * -38618711;
	}
	return (-38618711 * aClass299_12255.anInt3338 != -1
		? -38618711 * aClass299_12255.anInt3338
		: super.method16936(-601670010));
    }
}
