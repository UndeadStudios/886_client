/* Class656_Sub1_Sub3_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class656_Sub1_Sub3_Sub5 extends Class656_Sub1_Sub3
{
    int anInt12170;
    int anInt12171;
    public int anInt12172;
    public int anInt12173;
    public int anInt12174;
    double aDouble12175;
    double aDouble12176;
    int anInt12177;
    Class689 aClass689_12178;
    int anInt12179;
    boolean aBool12180;
    boolean aBool12181 = false;
    public int anInt12182;
    int anInt12183;
    int anInt12184;
    double aDouble12185;
    double aDouble12186;
    double aDouble12187;
    int anInt12188;
    boolean aBool12189;
    Class633 aClass633_12190;
    int anInt12191;
    
    public void method18856() {
	if (null != aClass633_12190)
	    aClass633_12190.method10373();
    }
    
    boolean method16933() {
	return aBool12189;
    }
    
    final boolean method16943() {
	return false;
    }
    
    public int method16909(byte i) {
	return 1969694819 * anInt12179;
    }
    
    public final void method18857(int i, int i_0_, int i_1_, int i_2_,
				  short i_3_) {
	Class446 class446 = Class446.method7209(method10818().aClass446_4807);
	if (!aBool12181) {
	    float f = (float) i - class446.aFloat4895;
	    float f_4_ = (float) i_0_ - class446.aFloat4897;
	    float f_5_ = (float) Math.sqrt((double) (f_4_ * f_4_ + f * f));
	    if (0.0F != f_5_) {
		class446.aFloat4895
		    += f * (float) (anInt12188 * 1755515799) / f_5_;
		class446.aFloat4897
		    += f_4_ * (float) (1755515799 * anInt12188) / f_5_;
	    }
	    if (aBool12180)
		class446.aFloat4896
		    = (float) (Class335.method5855((int) class446.aFloat4895,
						   (int) class446.aFloat4897,
						   aByte10867, 2020563229)
			       - -2034584083 * anInt12171);
	    method10823(class446);
	}
	double d = (double) (1 + -1258016991 * anInt12174 - i_2_);
	aDouble12176 = (double) ((float) i - class446.aFloat4895) / d;
	aDouble12187 = (double) ((float) i_0_ - class446.aFloat4897) / d;
	aDouble12186 = Math.sqrt(aDouble12176 * aDouble12176
				 + aDouble12187 * aDouble12187);
	if (-1 != anInt12170 * -1860283811) {
	    if (!aBool12181)
		aDouble12185 = -aDouble12186 * Math.tan((double) (-1860283811
								  * anInt12170)
							* 0.02454369);
	    aDouble12175 = 2.0 * ((double) ((float) i_1_ - class446.aFloat4896)
				  - aDouble12185 * d) / (d * d);
	} else
	    aDouble12185 = (double) ((float) i_1_ - class446.aFloat4896) / d;
	class446.method7260();
    }
    
    public Class553 method16919(Class182 class182, short i) {
	return null;
    }
    
    public Class656_Sub1_Sub3_Sub5
	(Class546 class546, int i, int i_6_, int i_7_, int i_8_, int i_9_,
	 int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_,
	 int i_16_, int i_17_, boolean bool, int i_18_, int i_19_) {
	super(class546, i_6_, i_7_, i_8_,
	      Class335.method5855(i_8_, i_9_, i_6_, 2020563229) - i_10_, i_9_,
	      i_8_ >> 9, i_8_ >> 9, i_9_ >> 9, i_9_ >> 9, false, (byte) 0);
	anInt12179 = 0;
	aBool12189 = false;
	anInt12191 = 0;
	anInt12183 = -1207869383 * i;
	anInt12173 = i_11_ * -127029523;
	anInt12174 = i_12_ * -1826351903;
	anInt12170 = i_13_ * 308220405;
	anInt12188 = i_14_ * 1001923623;
	anInt12177 = i_15_ * 1759694731;
	anInt12182 = i_16_ * -108170397;
	anInt12171 = i_10_ * 1129312229;
	anInt12172 = i_17_ * -1206038181;
	aBool12180 = bool;
	aBool12181 = false;
	anInt12184 = i_18_ * -1090014747;
	anInt12191 = -2044444379 * i_19_;
	int i_20_
	    = (((Class674)
		Class574.aClass40_Sub20_7645.method76(anInt12183 * 20221449,
						      -1407959032)).anInt8596
	       * 1700860103);
	aClass689_12178 = new Class689_Sub2(this, false);
	aClass689_12178.method14068(i_20_, (byte) -99);
	method16961(1, -16711936);
    }
    
    public void method18858(int i) {
	if (!aBool12181) {
	    if (0 != -2035490781 * anInt12177) {
		Class656_Sub1_Sub3_Sub1 class656_sub1_sub3_sub1 = null;
		if (4 == 1874190559 * client.anInt11145)
		    class656_sub1_sub3_sub1
			= Class201.aClass205Array2202
			      [-2035490781 * anInt12177 - 1]
			      .method3864(479311111);
		else if (-2035490781 * anInt12177 < 0) {
		    int i_21_ = -(-2035490781 * anInt12177) - 1;
		    if (client.anInt11053 * 615376671 == i_21_)
			class656_sub1_sub3_sub1
			    = Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705;
		    else
			class656_sub1_sub3_sub1
			    = (client.aClass656_Sub1_Sub3_Sub1_Sub1Array11384
			       [i_21_]);
		} else {
		    int i_22_ = anInt12177 * -2035490781 - 1;
		    Class525_Sub19 class525_sub19
			= ((Class525_Sub19)
			   client.aClass10_11121.method684((long) i_22_));
		    if (class525_sub19 != null)
			class656_sub1_sub3_sub1
			    = ((Class656_Sub1_Sub3_Sub1)
			       class525_sub19.anObject10571);
		}
		if (class656_sub1_sub3_sub1 != null) {
		    Class446 class446
			= class656_sub1_sub3_sub1.method10818().aClass446_4807;
		    method10824(class446.aFloat4895,
				(float) ((Class335.method5855
					  ((int) class446.aFloat4895,
					   (int) class446.aFloat4897,
					   aByte10867, 2020563229))
					 - anInt12171 * -2034584083),
				class446.aFloat4897);
		    if (628499437 * anInt12184 >= 0) {
			Class586 class586
			    = class656_sub1_sub3_sub1.method18633((byte) -64);
			int i_23_ = 0;
			int i_24_ = 0;
			if (class586.anIntArrayArray7755 != null
			    && null != (class586.anIntArrayArray7755
					[628499437 * anInt12184])) {
			    i_23_ += (class586.anIntArrayArray7755
				      [anInt12184 * 628499437][0]);
			    i_24_ += (class586.anIntArrayArray7755
				      [628499437 * anInt12184][2]);
			}
			if (null != class586.anIntArrayArray7728
			    && null != (class586.anIntArrayArray7728
					[628499437 * anInt12184])) {
			    i_23_ += (class586.anIntArrayArray7728
				      [628499437 * anInt12184][0]);
			    i_24_ += (class586.anIntArrayArray7728
				      [628499437 * anInt12184][2]);
			}
			if (i_23_ != 0 || i_24_ != 0) {
			    int i_25_ = class656_sub1_sub3_sub1
					    .aClass64_11992
					    .method1393((short) 25343);
			    int i_26_ = i_25_;
			    if (null != class656_sub1_sub3_sub1.anIntArray12008
				&& -1 != (class656_sub1_sub3_sub1
					  .anIntArray12008
					  [anInt12184 * 628499437]))
				i_26_
				    = (class656_sub1_sub3_sub1.anIntArray12008
				       [628499437 * anInt12184]);
			    int i_27_ = i_26_ - i_25_ & 0x3fff;
			    int i_28_ = Class436.anIntArray4831[i_27_];
			    int i_29_ = Class436.anIntArray4838[i_27_];
			    int i_30_ = i_23_ * i_29_ + i_24_ * i_28_ >> 14;
			    i_24_ = i_29_ * i_24_ - i_23_ * i_28_ >> 14;
			    i_23_ = i_30_;
			    Class446 class446_31_
				= Class446.method7209(method10818()
						      .aClass446_4807);
			    class446_31_.aFloat4895 += (float) i_23_;
			    class446_31_.aFloat4897 += (float) i_24_;
			    method10823(class446_31_);
			    class446_31_.method7260();
			}
		    }
		}
	    }
	}
    }
    
    public final void method18859(int i, int i_32_) {
	aBool12181 = true;
	Class428 class428 = new Class428(method10818());
	class428.aClass446_4807.aFloat4895 += (double) i * aDouble12176;
	class428.aClass446_4807.aFloat4897 += (double) i * aDouble12187;
	if (aBool12180)
	    class428.aClass446_4807.aFloat4896
		= (float) (Class335.method5855((int) (class428.aClass446_4807
						      .aFloat4895),
					       (int) (class428.aClass446_4807
						      .aFloat4897),
					       aByte10867, 2020563229)
			   - anInt12171 * -2034584083);
	else if (-1 != -1860283811 * anInt12170) {
	    class428.aClass446_4807.aFloat4896
		+= ((double) i * ((double) i * (0.5 * aDouble12175))
		    + (double) i * aDouble12185);
	    aDouble12185 += aDouble12175 * (double) i;
	} else
	    class428.aClass446_4807.aFloat4896 += (double) i * aDouble12185;
	class428.aClass429_4808.method6811(1.0F, 0.0F, 0.0F,
					   (float) Math.atan2(aDouble12185,
							      aDouble12186));
	Class429 class429 = Class429.method6864();
	class429.method6811(0.0F, 1.0F, 0.0F,
			    ((float) Math.atan2(aDouble12176, aDouble12187)
			     - 3.1415927F));
	class428.aClass429_4808.method6822(class429);
	class429.method6805();
	method10825(class428);
	if (aClass689_12178.method14041(1, 1975919092)
	    && aClass689_12178.method14039(-717072578))
	    aClass689_12178.method14071(-431250528);
    }
    
    Class179 method18860(Class182 class182, int i, int i_33_) {
	Class674 class674
	    = ((Class674)
	       Class574.aClass40_Sub20_7645.method76(20221449 * anInt12183,
						     -1805655579));
	return class674.method11100(class182, i, aClass689_12178, (byte) 2,
				    -1224209122);
    }
    
    Class567 method16917(Class182 class182, int i) {
	Class179 class179 = method18860(class182, 2048, -1991516466);
	if (class179 == null)
	    return null;
	Class444 class444 = method10826();
	method18861(class182, class179, class444, -1211865457);
	Class567 class567 = Class293.method5303(false, (short) -14976);
	class179.method2953(class444, aClass211Array10869[0], 0);
	if (null != aClass633_12190) {
	    Class185 class185 = aClass633_12190.method10350();
	    class182.method3412(class185);
	}
	aBool12189 = class179.method3017();
	class179.method2957();
	anInt12179 = class179.method2960() * 1695324491;
	return class567;
    }
    
    void method16918(Class182 class182, int i) {
	Class179 class179 = method18860(class182, 0, -950664208);
	if (null != class179) {
	    Class444 class444 = method10826();
	    anInt12179 = class179.method2960() * 1695324491;
	    class179.method2957();
	    method18861(class182, class179, class444, -1592424744);
	}
    }
    
    void method18557(int i) {
	Class446 class446 = method10818().aClass446_4807;
	aShort11923 = aShort11924
	    = (short) (int) (class446.aFloat4895 / 512.0F);
	aShort11925 = aShort11930
	    = (short) (int) (class446.aFloat4897 / 512.0F);
    }
    
    void method18861(Class182 class182, Class179 class179, Class444 class444,
		     int i) {
	class179.method2978(class444);
	Class184[] class184s = class179.method2979();
	MagnetConfig[] class154s = class179.method2980();
	if ((aClass633_12190 == null || aClass633_12190.aBool8234)
	    && (null != class184s || null != class154s))
	    aClass633_12190 = Class633.method10348(client.anInt11083, true);
	if (null != aClass633_12190) {
	    aClass633_12190.method10336(class182, (long) client.anInt11083,
					class184s, class154s, false);
	    aClass633_12190.method10341(aByte10867, aShort11923, aShort11924,
					aShort11925, aShort11930);
	}
    }
    
    public void method18862(byte i) {
	if (null != aClass633_12190)
	    aClass633_12190.method10373();
    }
    
    public void method18863() {
	if (!aBool12181) {
	    if (0 != -2035490781 * anInt12177) {
		Class656_Sub1_Sub3_Sub1 class656_sub1_sub3_sub1 = null;
		if (4 == 1874190559 * client.anInt11145)
		    class656_sub1_sub3_sub1
			= Class201.aClass205Array2202
			      [-2035490781 * anInt12177 - 1]
			      .method3864(1602380732);
		else if (-2035490781 * anInt12177 < 0) {
		    int i = -(-2035490781 * anInt12177) - 1;
		    if (client.anInt11053 * 615376671 == i)
			class656_sub1_sub3_sub1
			    = Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705;
		    else
			class656_sub1_sub3_sub1
			    = (client.aClass656_Sub1_Sub3_Sub1_Sub1Array11384
			       [i]);
		} else {
		    int i = anInt12177 * -2035490781 - 1;
		    Class525_Sub19 class525_sub19
			= ((Class525_Sub19)
			   client.aClass10_11121.method684((long) i));
		    if (class525_sub19 != null)
			class656_sub1_sub3_sub1
			    = ((Class656_Sub1_Sub3_Sub1)
			       class525_sub19.anObject10571);
		}
		if (class656_sub1_sub3_sub1 != null) {
		    Class446 class446
			= class656_sub1_sub3_sub1.method10818().aClass446_4807;
		    method10824(class446.aFloat4895,
				(float) ((Class335.method5855
					  ((int) class446.aFloat4895,
					   (int) class446.aFloat4897,
					   aByte10867, 2020563229))
					 - anInt12171 * -2034584083),
				class446.aFloat4897);
		    if (628499437 * anInt12184 >= 0) {
			Class586 class586
			    = class656_sub1_sub3_sub1.method18633((byte) -119);
			int i = 0;
			int i_34_ = 0;
			if (class586.anIntArrayArray7755 != null
			    && null != (class586.anIntArrayArray7755
					[628499437 * anInt12184])) {
			    i += (class586.anIntArrayArray7755
				  [anInt12184 * 628499437][0]);
			    i_34_ += (class586.anIntArrayArray7755
				      [628499437 * anInt12184][2]);
			}
			if (null != class586.anIntArrayArray7728
			    && null != (class586.anIntArrayArray7728
					[628499437 * anInt12184])) {
			    i += (class586.anIntArrayArray7728
				  [628499437 * anInt12184][0]);
			    i_34_ += (class586.anIntArrayArray7728
				      [628499437 * anInt12184][2]);
			}
			if (i != 0 || i_34_ != 0) {
			    int i_35_ = class656_sub1_sub3_sub1
					    .aClass64_11992
					    .method1393((short) 18563);
			    int i_36_ = i_35_;
			    if (null != class656_sub1_sub3_sub1.anIntArray12008
				&& -1 != (class656_sub1_sub3_sub1
					  .anIntArray12008
					  [anInt12184 * 628499437]))
				i_36_
				    = (class656_sub1_sub3_sub1.anIntArray12008
				       [628499437 * anInt12184]);
			    int i_37_ = i_36_ - i_35_ & 0x3fff;
			    int i_38_ = Class436.anIntArray4831[i_37_];
			    int i_39_ = Class436.anIntArray4838[i_37_];
			    int i_40_ = i * i_39_ + i_34_ * i_38_ >> 14;
			    i_34_ = i_39_ * i_34_ - i * i_38_ >> 14;
			    i = i_40_;
			    Class446 class446_41_
				= Class446.method7209(method10818()
						      .aClass446_4807);
			    class446_41_.aFloat4895 += (float) i;
			    class446_41_.aFloat4897 += (float) i_34_;
			    method10823(class446_41_);
			    class446_41_.method7260();
			}
		    }
		}
	    }
	}
    }
    
    void method18558() {
	Class446 class446 = method10818().aClass446_4807;
	aShort11923 = aShort11924
	    = (short) (int) (class446.aFloat4895 / 512.0F);
	aShort11925 = aShort11930
	    = (short) (int) (class446.aFloat4897 / 512.0F);
    }
    
    public int method18864(int i) {
	return -1680870739 * anInt12191;
    }
    
    final void method16916(int i) {
	throw new IllegalStateException();
    }
    
    boolean method16934() {
	return aBool12189;
    }
    
    final boolean method16945() {
	return false;
    }
    
    boolean method16930() {
	return aBool12189;
    }
    
    boolean method16914(int i) {
	return aBool12189;
    }
    
    boolean method16932() {
	return aBool12189;
    }
    
    public void method18865() {
	if (null != aClass633_12190)
	    aClass633_12190.method10373();
    }
    
    public int method16927() {
	return 1969694819 * anInt12179;
    }
    
    void method18866(Class182 class182, Class179 class179, Class444 class444) {
	class179.method2978(class444);
	Class184[] class184s = class179.method2979();
	MagnetConfig[] class154s = class179.method2980();
	if ((aClass633_12190 == null || aClass633_12190.aBool8234)
	    && (null != class184s || null != class154s))
	    aClass633_12190 = Class633.method10348(client.anInt11083, true);
	if (null != aClass633_12190) {
	    aClass633_12190.method10336(class182, (long) client.anInt11083,
					class184s, class154s, false);
	    aClass633_12190.method10341(aByte10867, aShort11923, aShort11924,
					aShort11925, aShort11930);
	}
    }
    
    void method16963(Class182 class182) {
	Class179 class179 = method18860(class182, 0, -606548556);
	if (null != class179) {
	    Class444 class444 = method10826();
	    anInt12179 = class179.method2960() * 1695324491;
	    class179.method2957();
	    method18861(class182, class179, class444, -2008096638);
	}
    }
    
    public int method16935() {
	return 1969694819 * anInt12179;
    }
    
    boolean method16939(Class182 class182, int i, int i_42_) {
	return false;
    }
    
    final boolean method16912(int i) {
	return false;
    }
    
    boolean method16910(Class182 class182, int i, int i_43_, byte i_44_) {
	return false;
    }
    
    final boolean method16957() {
	return false;
    }
    
    public void method18867() {
	if (null != aClass633_12190)
	    aClass633_12190.method10373();
    }
    
    final boolean method16944() {
	return false;
    }
    
    public final void method18868(int i) {
	aBool12181 = true;
	Class428 class428 = new Class428(method10818());
	class428.aClass446_4807.aFloat4895 += (double) i * aDouble12176;
	class428.aClass446_4807.aFloat4897 += (double) i * aDouble12187;
	if (aBool12180)
	    class428.aClass446_4807.aFloat4896
		= (float) (Class335.method5855((int) (class428.aClass446_4807
						      .aFloat4895),
					       (int) (class428.aClass446_4807
						      .aFloat4897),
					       aByte10867, 2020563229)
			   - anInt12171 * -2034584083);
	else if (-1 != -1860283811 * anInt12170) {
	    class428.aClass446_4807.aFloat4896
		+= ((double) i * ((double) i * (0.5 * aDouble12175))
		    + (double) i * aDouble12185);
	    aDouble12185 += aDouble12175 * (double) i;
	} else
	    class428.aClass446_4807.aFloat4896 += (double) i * aDouble12185;
	class428.aClass429_4808.method6811(1.0F, 0.0F, 0.0F,
					   (float) Math.atan2(aDouble12185,
							      aDouble12186));
	Class429 class429 = Class429.method6864();
	class429.method6811(0.0F, 1.0F, 0.0F,
			    ((float) Math.atan2(aDouble12176, aDouble12187)
			     - 3.1415927F));
	class428.aClass429_4808.method6822(class429);
	class429.method6805();
	method10825(class428);
	if (aClass689_12178.method14041(1, 1936944927)
	    && aClass689_12178.method14039(-1182109550))
	    aClass689_12178.method14071(-431250528);
    }
    
    final void method16968(Class182 class182, Class656_Sub1 class656_sub1,
			   int i, int i_45_, int i_46_, boolean bool) {
	throw new IllegalStateException();
    }
    
    final void method16951() {
	throw new IllegalStateException();
    }
    
    boolean method16948() {
	return false;
    }
    
    boolean method16949() {
	return false;
    }
    
    boolean method16965(Class182 class182, int i, int i_47_) {
	return false;
    }
    
    boolean method16964() {
	return false;
    }
    
    boolean method16950() {
	return false;
    }
    
    public Class553 method16946(Class182 class182) {
	return null;
    }
    
    public Class553 method16953(Class182 class182) {
	return null;
    }
    
    public Class553 method16954(Class182 class182) {
	return null;
    }
    
    public Class553 method16955(Class182 class182) {
	return null;
    }
    
    Class567 method16921(Class182 class182) {
	Class179 class179 = method18860(class182, 2048, -1870458545);
	if (class179 == null)
	    return null;
	Class444 class444 = method10826();
	method18861(class182, class179, class444, -1898611119);
	Class567 class567 = Class293.method5303(false, (short) -13899);
	class179.method2953(class444, aClass211Array10869[0], 0);
	if (null != aClass633_12190) {
	    Class185 class185 = aClass633_12190.method10350();
	    class182.method3412(class185);
	}
	aBool12189 = class179.method3017();
	class179.method2957();
	anInt12179 = class179.method2960() * 1695324491;
	return class567;
    }
    
    public int method18869() {
	return -1680870739 * anInt12191;
    }
    
    public int method18870() {
	return -1680870739 * anInt12191;
    }
    
    public final void method18871(int i, int i_48_, int i_49_, int i_50_) {
	Class446 class446 = Class446.method7209(method10818().aClass446_4807);
	if (!aBool12181) {
	    float f = (float) i - class446.aFloat4895;
	    float f_51_ = (float) i_48_ - class446.aFloat4897;
	    float f_52_ = (float) Math.sqrt((double) (f_51_ * f_51_ + f * f));
	    if (0.0F != f_52_) {
		class446.aFloat4895
		    += f * (float) (anInt12188 * 1755515799) / f_52_;
		class446.aFloat4897
		    += f_51_ * (float) (1755515799 * anInt12188) / f_52_;
	    }
	    if (aBool12180)
		class446.aFloat4896
		    = (float) (Class335.method5855((int) class446.aFloat4895,
						   (int) class446.aFloat4897,
						   aByte10867, 2020563229)
			       - -2034584083 * anInt12171);
	    method10823(class446);
	}
	double d = (double) (1 + -1258016991 * anInt12174 - i_50_);
	aDouble12176 = (double) ((float) i - class446.aFloat4895) / d;
	aDouble12187 = (double) ((float) i_48_ - class446.aFloat4897) / d;
	aDouble12186 = Math.sqrt(aDouble12176 * aDouble12176
				 + aDouble12187 * aDouble12187);
	if (-1 != anInt12170 * -1860283811) {
	    if (!aBool12181)
		aDouble12185 = -aDouble12186 * Math.tan((double) (-1860283811
								  * anInt12170)
							* 0.02454369);
	    aDouble12175
		= 2.0 * ((double) ((float) i_49_ - class446.aFloat4896)
			 - aDouble12185 * d) / (d * d);
	} else
	    aDouble12185 = (double) ((float) i_49_ - class446.aFloat4896) / d;
	class446.method7260();
    }
    
    public final void method18872(int i, int i_53_, int i_54_, int i_55_) {
	Class446 class446 = Class446.method7209(method10818().aClass446_4807);
	if (!aBool12181) {
	    float f = (float) i - class446.aFloat4895;
	    float f_56_ = (float) i_53_ - class446.aFloat4897;
	    float f_57_ = (float) Math.sqrt((double) (f_56_ * f_56_ + f * f));
	    if (0.0F != f_57_) {
		class446.aFloat4895
		    += f * (float) (anInt12188 * 1755515799) / f_57_;
		class446.aFloat4897
		    += f_56_ * (float) (1755515799 * anInt12188) / f_57_;
	    }
	    if (aBool12180)
		class446.aFloat4896
		    = (float) (Class335.method5855((int) class446.aFloat4895,
						   (int) class446.aFloat4897,
						   aByte10867, 2020563229)
			       - -2034584083 * anInt12171);
	    method10823(class446);
	}
	double d = (double) (1 + -1258016991 * anInt12174 - i_55_);
	aDouble12176 = (double) ((float) i - class446.aFloat4895) / d;
	aDouble12187 = (double) ((float) i_53_ - class446.aFloat4897) / d;
	aDouble12186 = Math.sqrt(aDouble12176 * aDouble12176
				 + aDouble12187 * aDouble12187);
	if (-1 != anInt12170 * -1860283811) {
	    if (!aBool12181)
		aDouble12185 = -aDouble12186 * Math.tan((double) (-1860283811
								  * anInt12170)
							* 0.02454369);
	    aDouble12175
		= 2.0 * ((double) ((float) i_54_ - class446.aFloat4896)
			 - aDouble12185 * d) / (d * d);
	} else
	    aDouble12185 = (double) ((float) i_54_ - class446.aFloat4896) / d;
	class446.method7260();
    }
    
    public final void method18873(int i, int i_58_, int i_59_, int i_60_) {
	Class446 class446 = Class446.method7209(method10818().aClass446_4807);
	if (!aBool12181) {
	    float f = (float) i - class446.aFloat4895;
	    float f_61_ = (float) i_58_ - class446.aFloat4897;
	    float f_62_ = (float) Math.sqrt((double) (f_61_ * f_61_ + f * f));
	    if (0.0F != f_62_) {
		class446.aFloat4895
		    += f * (float) (anInt12188 * 1755515799) / f_62_;
		class446.aFloat4897
		    += f_61_ * (float) (1755515799 * anInt12188) / f_62_;
	    }
	    if (aBool12180)
		class446.aFloat4896
		    = (float) (Class335.method5855((int) class446.aFloat4895,
						   (int) class446.aFloat4897,
						   aByte10867, 2020563229)
			       - -2034584083 * anInt12171);
	    method10823(class446);
	}
	double d = (double) (1 + -1258016991 * anInt12174 - i_60_);
	aDouble12176 = (double) ((float) i - class446.aFloat4895) / d;
	aDouble12187 = (double) ((float) i_58_ - class446.aFloat4897) / d;
	aDouble12186 = Math.sqrt(aDouble12176 * aDouble12176
				 + aDouble12187 * aDouble12187);
	if (-1 != anInt12170 * -1860283811) {
	    if (!aBool12181)
		aDouble12185 = -aDouble12186 * Math.tan((double) (-1860283811
								  * anInt12170)
							* 0.02454369);
	    aDouble12175
		= 2.0 * ((double) ((float) i_59_ - class446.aFloat4896)
			 - aDouble12185 * d) / (d * d);
	} else
	    aDouble12185 = (double) ((float) i_59_ - class446.aFloat4896) / d;
	class446.method7260();
    }
    
    public void method18874() {
	if (!aBool12181) {
	    if (0 != -2035490781 * anInt12177) {
		Class656_Sub1_Sub3_Sub1 class656_sub1_sub3_sub1 = null;
		if (4 == 1874190559 * client.anInt11145)
		    class656_sub1_sub3_sub1
			= Class201.aClass205Array2202
			      [-2035490781 * anInt12177 - 1]
			      .method3864(1133178950);
		else if (-2035490781 * anInt12177 < 0) {
		    int i = -(-2035490781 * anInt12177) - 1;
		    if (client.anInt11053 * 615376671 == i)
			class656_sub1_sub3_sub1
			    = Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705;
		    else
			class656_sub1_sub3_sub1
			    = (client.aClass656_Sub1_Sub3_Sub1_Sub1Array11384
			       [i]);
		} else {
		    int i = anInt12177 * -2035490781 - 1;
		    Class525_Sub19 class525_sub19
			= ((Class525_Sub19)
			   client.aClass10_11121.method684((long) i));
		    if (class525_sub19 != null)
			class656_sub1_sub3_sub1
			    = ((Class656_Sub1_Sub3_Sub1)
			       class525_sub19.anObject10571);
		}
		if (class656_sub1_sub3_sub1 != null) {
		    Class446 class446
			= class656_sub1_sub3_sub1.method10818().aClass446_4807;
		    method10824(class446.aFloat4895,
				(float) ((Class335.method5855
					  ((int) class446.aFloat4895,
					   (int) class446.aFloat4897,
					   aByte10867, 2020563229))
					 - anInt12171 * -2034584083),
				class446.aFloat4897);
		    if (628499437 * anInt12184 >= 0) {
			Class586 class586
			    = class656_sub1_sub3_sub1.method18633((byte) -101);
			int i = 0;
			int i_63_ = 0;
			if (class586.anIntArrayArray7755 != null
			    && null != (class586.anIntArrayArray7755
					[628499437 * anInt12184])) {
			    i += (class586.anIntArrayArray7755
				  [anInt12184 * 628499437][0]);
			    i_63_ += (class586.anIntArrayArray7755
				      [628499437 * anInt12184][2]);
			}
			if (null != class586.anIntArrayArray7728
			    && null != (class586.anIntArrayArray7728
					[628499437 * anInt12184])) {
			    i += (class586.anIntArrayArray7728
				  [628499437 * anInt12184][0]);
			    i_63_ += (class586.anIntArrayArray7728
				      [628499437 * anInt12184][2]);
			}
			if (i != 0 || i_63_ != 0) {
			    int i_64_ = class656_sub1_sub3_sub1
					    .aClass64_11992
					    .method1393((short) 27838);
			    int i_65_ = i_64_;
			    if (null != class656_sub1_sub3_sub1.anIntArray12008
				&& -1 != (class656_sub1_sub3_sub1
					  .anIntArray12008
					  [anInt12184 * 628499437]))
				i_65_
				    = (class656_sub1_sub3_sub1.anIntArray12008
				       [628499437 * anInt12184]);
			    int i_66_ = i_65_ - i_64_ & 0x3fff;
			    int i_67_ = Class436.anIntArray4831[i_66_];
			    int i_68_ = Class436.anIntArray4838[i_66_];
			    int i_69_ = i * i_68_ + i_63_ * i_67_ >> 14;
			    i_63_ = i_68_ * i_63_ - i * i_67_ >> 14;
			    i = i_69_;
			    Class446 class446_70_
				= Class446.method7209(method10818()
						      .aClass446_4807);
			    class446_70_.aFloat4895 += (float) i;
			    class446_70_.aFloat4897 += (float) i_63_;
			    method10823(class446_70_);
			    class446_70_.method7260();
			}
		    }
		}
	    }
	}
    }
    
    boolean method16913(int i) {
	return false;
    }
    
    public void method18875() {
	if (!aBool12181) {
	    if (0 != -2035490781 * anInt12177) {
		Class656_Sub1_Sub3_Sub1 class656_sub1_sub3_sub1 = null;
		if (4 == 1874190559 * client.anInt11145)
		    class656_sub1_sub3_sub1
			= Class201.aClass205Array2202
			      [-2035490781 * anInt12177 - 1]
			      .method3864(-1283470955);
		else if (-2035490781 * anInt12177 < 0) {
		    int i = -(-2035490781 * anInt12177) - 1;
		    if (client.anInt11053 * 615376671 == i)
			class656_sub1_sub3_sub1
			    = Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705;
		    else
			class656_sub1_sub3_sub1
			    = (client.aClass656_Sub1_Sub3_Sub1_Sub1Array11384
			       [i]);
		} else {
		    int i = anInt12177 * -2035490781 - 1;
		    Class525_Sub19 class525_sub19
			= ((Class525_Sub19)
			   client.aClass10_11121.method684((long) i));
		    if (class525_sub19 != null)
			class656_sub1_sub3_sub1
			    = ((Class656_Sub1_Sub3_Sub1)
			       class525_sub19.anObject10571);
		}
		if (class656_sub1_sub3_sub1 != null) {
		    Class446 class446
			= class656_sub1_sub3_sub1.method10818().aClass446_4807;
		    method10824(class446.aFloat4895,
				(float) ((Class335.method5855
					  ((int) class446.aFloat4895,
					   (int) class446.aFloat4897,
					   aByte10867, 2020563229))
					 - anInt12171 * -2034584083),
				class446.aFloat4897);
		    if (628499437 * anInt12184 >= 0) {
			Class586 class586
			    = class656_sub1_sub3_sub1.method18633((byte) -83);
			int i = 0;
			int i_71_ = 0;
			if (class586.anIntArrayArray7755 != null
			    && null != (class586.anIntArrayArray7755
					[628499437 * anInt12184])) {
			    i += (class586.anIntArrayArray7755
				  [anInt12184 * 628499437][0]);
			    i_71_ += (class586.anIntArrayArray7755
				      [628499437 * anInt12184][2]);
			}
			if (null != class586.anIntArrayArray7728
			    && null != (class586.anIntArrayArray7728
					[628499437 * anInt12184])) {
			    i += (class586.anIntArrayArray7728
				  [628499437 * anInt12184][0]);
			    i_71_ += (class586.anIntArrayArray7728
				      [628499437 * anInt12184][2]);
			}
			if (i != 0 || i_71_ != 0) {
			    int i_72_ = class656_sub1_sub3_sub1
					    .aClass64_11992
					    .method1393((short) 25945);
			    int i_73_ = i_72_;
			    if (null != class656_sub1_sub3_sub1.anIntArray12008
				&& -1 != (class656_sub1_sub3_sub1
					  .anIntArray12008
					  [anInt12184 * 628499437]))
				i_73_
				    = (class656_sub1_sub3_sub1.anIntArray12008
				       [628499437 * anInt12184]);
			    int i_74_ = i_73_ - i_72_ & 0x3fff;
			    int i_75_ = Class436.anIntArray4831[i_74_];
			    int i_76_ = Class436.anIntArray4838[i_74_];
			    int i_77_ = i * i_76_ + i_71_ * i_75_ >> 14;
			    i_71_ = i_76_ * i_71_ - i * i_75_ >> 14;
			    i = i_77_;
			    Class446 class446_78_
				= Class446.method7209(method10818()
						      .aClass446_4807);
			    class446_78_.aFloat4895 += (float) i;
			    class446_78_.aFloat4897 += (float) i_71_;
			    method10823(class446_78_);
			    class446_78_.method7260();
			}
		    }
		}
	    }
	}
    }
    
    public void method18876() {
	if (!aBool12181) {
	    if (0 != -2035490781 * anInt12177) {
		Class656_Sub1_Sub3_Sub1 class656_sub1_sub3_sub1 = null;
		if (4 == 1874190559 * client.anInt11145)
		    class656_sub1_sub3_sub1
			= Class201.aClass205Array2202
			      [-2035490781 * anInt12177 - 1]
			      .method3864(538896454);
		else if (-2035490781 * anInt12177 < 0) {
		    int i = -(-2035490781 * anInt12177) - 1;
		    if (client.anInt11053 * 615376671 == i)
			class656_sub1_sub3_sub1
			    = Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705;
		    else
			class656_sub1_sub3_sub1
			    = (client.aClass656_Sub1_Sub3_Sub1_Sub1Array11384
			       [i]);
		} else {
		    int i = anInt12177 * -2035490781 - 1;
		    Class525_Sub19 class525_sub19
			= ((Class525_Sub19)
			   client.aClass10_11121.method684((long) i));
		    if (class525_sub19 != null)
			class656_sub1_sub3_sub1
			    = ((Class656_Sub1_Sub3_Sub1)
			       class525_sub19.anObject10571);
		}
		if (class656_sub1_sub3_sub1 != null) {
		    Class446 class446
			= class656_sub1_sub3_sub1.method10818().aClass446_4807;
		    method10824(class446.aFloat4895,
				(float) ((Class335.method5855
					  ((int) class446.aFloat4895,
					   (int) class446.aFloat4897,
					   aByte10867, 2020563229))
					 - anInt12171 * -2034584083),
				class446.aFloat4897);
		    if (628499437 * anInt12184 >= 0) {
			Class586 class586
			    = class656_sub1_sub3_sub1.method18633((byte) -106);
			int i = 0;
			int i_79_ = 0;
			if (class586.anIntArrayArray7755 != null
			    && null != (class586.anIntArrayArray7755
					[628499437 * anInt12184])) {
			    i += (class586.anIntArrayArray7755
				  [anInt12184 * 628499437][0]);
			    i_79_ += (class586.anIntArrayArray7755
				      [628499437 * anInt12184][2]);
			}
			if (null != class586.anIntArrayArray7728
			    && null != (class586.anIntArrayArray7728
					[628499437 * anInt12184])) {
			    i += (class586.anIntArrayArray7728
				  [628499437 * anInt12184][0]);
			    i_79_ += (class586.anIntArrayArray7728
				      [628499437 * anInt12184][2]);
			}
			if (i != 0 || i_79_ != 0) {
			    int i_80_ = class656_sub1_sub3_sub1
					    .aClass64_11992
					    .method1393((short) 13492);
			    int i_81_ = i_80_;
			    if (null != class656_sub1_sub3_sub1.anIntArray12008
				&& -1 != (class656_sub1_sub3_sub1
					  .anIntArray12008
					  [anInt12184 * 628499437]))
				i_81_
				    = (class656_sub1_sub3_sub1.anIntArray12008
				       [628499437 * anInt12184]);
			    int i_82_ = i_81_ - i_80_ & 0x3fff;
			    int i_83_ = Class436.anIntArray4831[i_82_];
			    int i_84_ = Class436.anIntArray4838[i_82_];
			    int i_85_ = i * i_84_ + i_79_ * i_83_ >> 14;
			    i_79_ = i_84_ * i_79_ - i * i_83_ >> 14;
			    i = i_85_;
			    Class446 class446_86_
				= Class446.method7209(method10818()
						      .aClass446_4807);
			    class446_86_.aFloat4895 += (float) i;
			    class446_86_.aFloat4897 += (float) i_79_;
			    method10823(class446_86_);
			    class446_86_.method7260();
			}
		    }
		}
	    }
	}
    }
    
    void method16938(Class182 class182) {
	Class179 class179 = method18860(class182, 0, -904311325);
	if (null != class179) {
	    Class444 class444 = method10826();
	    anInt12179 = class179.method2960() * 1695324491;
	    class179.method2957();
	    method18861(class182, class179, class444, -1023924523);
	}
    }
    
    final void method16915(Class182 class182, Class656_Sub1 class656_sub1,
			   int i, int i_87_, int i_88_, boolean bool,
			   int i_89_) {
	throw new IllegalStateException();
    }
    
    boolean method16940(Class182 class182, int i, int i_90_) {
	return false;
    }
    
    boolean method16931() {
	return aBool12189;
    }
    
    public void method18877() {
	if (null != aClass633_12190)
	    aClass633_12190.method10373();
    }
    
    public void method18878() {
	if (null != aClass633_12190)
	    aClass633_12190.method10373();
    }
    
    boolean method16929() {
	return aBool12189;
    }
    
    public void method18879() {
	if (null != aClass633_12190)
	    aClass633_12190.method10373();
    }
    
    public final void method18880(int i) {
	aBool12181 = true;
	Class428 class428 = new Class428(method10818());
	class428.aClass446_4807.aFloat4895 += (double) i * aDouble12176;
	class428.aClass446_4807.aFloat4897 += (double) i * aDouble12187;
	if (aBool12180)
	    class428.aClass446_4807.aFloat4896
		= (float) (Class335.method5855((int) (class428.aClass446_4807
						      .aFloat4895),
					       (int) (class428.aClass446_4807
						      .aFloat4897),
					       aByte10867, 2020563229)
			   - anInt12171 * -2034584083);
	else if (-1 != -1860283811 * anInt12170) {
	    class428.aClass446_4807.aFloat4896
		+= ((double) i * ((double) i * (0.5 * aDouble12175))
		    + (double) i * aDouble12185);
	    aDouble12185 += aDouble12175 * (double) i;
	} else
	    class428.aClass446_4807.aFloat4896 += (double) i * aDouble12185;
	class428.aClass429_4808.method6811(1.0F, 0.0F, 0.0F,
					   (float) Math.atan2(aDouble12185,
							      aDouble12186));
	Class429 class429 = Class429.method6864();
	class429.method6811(0.0F, 1.0F, 0.0F,
			    ((float) Math.atan2(aDouble12176, aDouble12187)
			     - 3.1415927F));
	class428.aClass429_4808.method6822(class429);
	class429.method6805();
	method10825(class428);
	if (aClass689_12178.method14041(1, 2059674209)
	    && aClass689_12178.method14039(-1066731843))
	    aClass689_12178.method14071(-431250528);
    }
}
