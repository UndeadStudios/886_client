/* Class625 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class625
{
    long aLong8130;
    Class382 aClass382_8131;
    Class633 aClass633_8132;
    int anInt8133;
    Class708 aClass708_8134;
    int anInt8135;
    int anInt8136;
    boolean aBool8137;
    Class636 aClass636_8138;
    int anInt8139;
    int anInt8140 = 0;
    int anInt8141;
    int anInt8142;
    int anInt8143;
    int anInt8144;
    Class184 aClass184_8145;
    Class636 aClass636_8146;
    boolean aBool8147;
    boolean aBool8148;
    
    Class625(Class182 class182, Class184 class184, Class633 class633, long l) {
	aBool8137 = false;
	aClass636_8138 = new Class636();
	aClass636_8146 = new Class636();
	aBool8147 = false;
	aBool8148 = false;
	aClass184_8145 = class184;
	aClass633_8132 = class633;
	aLong8130 = -7554884988867431485L * l;
	aClass382_8131 = aClass184_8145.method3603(class182.anInterface48_1946,
						   (short) -23289);
	if (!class182.method3145()
	    && 1664798015 * aClass382_8131.anInt3973 != -1)
	    aClass382_8131
		= class182.anInterface48_1946.method340(((aClass382_8131
							  .anInt3973)
							 * 1664798015),
							2116345368);
	aClass708_8134 = new Class708();
	anInt8140 = (int) ((double) (anInt8140 * 524983249)
			   + Math.random() * 64.0) * -1646682831;
	method10252(1185393224);
	aClass636_8146.anInt8280 = 1 * aClass636_8138.anInt8280;
	aClass636_8146.anInt8276 = aClass636_8138.anInt8276 * 1;
	aClass636_8146.anInt8279 = 1 * aClass636_8138.anInt8279;
	aClass636_8146.anInt8277 = aClass636_8138.anInt8277 * 1;
	aClass636_8146.anInt8275 = 1 * aClass636_8138.anInt8275;
	aClass636_8146.anInt8283 = 1 * aClass636_8138.anInt8283;
	aClass636_8146.anInt8281 = aClass636_8138.anInt8281 * 1;
	aClass636_8146.anInt8282 = 1 * aClass636_8138.anInt8282;
	aClass636_8146.anInt8278 = aClass636_8138.anInt8278 * 1;
    }
    
    void method10242(Class546 class546, Class182 class182, long l) {
	for (Class531_Sub5_Sub1_Sub1 class531_sub5_sub1_sub1
		 = ((Class531_Sub5_Sub1_Sub1)
		    aClass708_8134.method14328(813736419));
	     class531_sub5_sub1_sub1 != null;
	     class531_sub5_sub1_sub1 = ((Class531_Sub5_Sub1_Sub1)
					aClass708_8134.method14337(725462609)))
	    class531_sub5_sub1_sub1.method18774(class546, class182, l);
    }
    
    void method10243(Class182 class182, long l, int i, boolean bool,
		     int i_0_) {
	if (aBool8137)
	    bool = false;
	else if (1206403205 * Class616.anInt8047
		 < aClass382_8131.anInt3971 * 2094183313)
	    bool = false;
	else if (Class616.anInt8055 * 729885067
		 > Class181.anIntArray1925[Class616.anInt8047 * 1206403205])
	    bool = false;
	else if (aBool8147)
	    bool = false;
	else if (aClass382_8131.anInt3970 * -736734443 != -1) {
	    int i_1_ = (int) (l - -46995223780141845L * aLong8130);
	    if (!aClass382_8131.aBool3968
		&& i_1_ > aClass382_8131.anInt3970 * -736734443)
		bool = false;
	    else
		i_1_ %= -736734443 * aClass382_8131.anInt3970;
	    if (!aClass382_8131.aBool4005
		&& i_1_ < aClass382_8131.anInt3985 * -1676158601)
		bool = false;
	    if (aClass382_8131.aBool4005
		&& i_1_ >= aClass382_8131.anInt3985 * -1676158601)
		bool = false;
	}
	anInt8135 = 0;
	for (Class531_Sub5_Sub1_Sub1 class531_sub5_sub1_sub1
		 = ((Class531_Sub5_Sub1_Sub1)
		    aClass708_8134.method14328(-1047818113));
	     null != class531_sub5_sub1_sub1;
	     class531_sub5_sub1_sub1
		 = ((Class531_Sub5_Sub1_Sub1)
		    aClass708_8134.method14337(2135017541))) {
	    class531_sub5_sub1_sub1.method18783(l, i);
	    anInt8135 += -644469701;
	}
	if (bool) {
	    int i_2_ = ((aClass636_8138.anInt8277 * 1470838697
			 + 1884912401 * aClass636_8138.anInt8280
			 + -666977237 * aClass636_8138.anInt8281)
			/ 3);
	    int i_3_ = ((aClass636_8138.anInt8282 * -641045269
			 + (aClass636_8138.anInt8275 * 1301556211
			    + 782985373 * aClass636_8138.anInt8276))
			/ 3);
	    int i_4_ = ((aClass636_8138.anInt8283 * -454136693
			 + 1861600415 * aClass636_8138.anInt8279
			 + 86535875 * aClass636_8138.anInt8278)
			/ 3);
	    if (1290098051 * aClass636_8138.anInt8284 != i_2_
		|| i_3_ != -793531135 * aClass636_8138.anInt8285
		|| i_4_ != aClass636_8138.anInt8286 * -1950313275
		|| !aBool8148) {
		aClass636_8138.anInt8284 = i_2_ * -1487118037;
		aClass636_8138.anInt8285 = 490033921 * i_3_;
		aClass636_8138.anInt8286 = 1506920973 * i_4_;
		int i_5_ = (aClass636_8138.anInt8277 * 1470838697
			    - aClass636_8138.anInt8280 * 1884912401);
		int i_6_ = (aClass636_8138.anInt8275 * 1301556211
			    - 782985373 * aClass636_8138.anInt8276);
		int i_7_ = (aClass636_8138.anInt8283 * -454136693
			    - 1861600415 * aClass636_8138.anInt8279);
		int i_8_ = (-666977237 * aClass636_8138.anInt8281
			    - aClass636_8138.anInt8280 * 1884912401);
		int i_9_ = (aClass636_8138.anInt8282 * -641045269
			    - 782985373 * aClass636_8138.anInt8276);
		int i_10_ = (86535875 * aClass636_8138.anInt8278
			     - aClass636_8138.anInt8279 * 1861600415);
		anInt8144 = (i_6_ * i_10_ - i_7_ * i_9_) * -1947535165;
		anInt8141 = (i_7_ * i_8_ - i_10_ * i_5_) * 1142756623;
		for (anInt8133 = -762275271 * (i_9_ * i_5_ - i_8_ * i_6_);
		     (anInt8144 * 553220075 > 32767
		      || 1749498351 * anInt8141 > 32767
		      || -1303432183 * anInt8133 > 32767
		      || anInt8144 * 553220075 < -32767
		      || 1749498351 * anInt8141 < -32767
		      || -1303432183 * anInt8133 < -32767);
		     anInt8133 = -762275271 * (anInt8133 * -1303432183 >> 1)) {
		    anInt8144 = (553220075 * anInt8144 >> 1) * -1947535165;
		    anInt8141 = 1142756623 * (1749498351 * anInt8141 >> 1);
		}
		int i_11_
		    = (int) Math.sqrt((double) ((anInt8141 * 1749498351
						 * (1749498351 * anInt8141))
						+ (anInt8144 * 553220075
						   * (anInt8144 * 553220075))
						+ (anInt8133 * -1303432183
						   * (anInt8133
						      * -1303432183))));
		if (i_11_ <= 0)
		    i_11_ = 1;
		anInt8144 = -1947535165 * (-1694758891 * anInt8144 / i_11_);
		anInt8141 = 883967505 * anInt8141 / i_11_ * 1142756623;
		anInt8133 = -762275271 * (-407548937 * anInt8133 / i_11_);
		if (aClass382_8131.aShort3935 > 0
		    || aClass382_8131.aShort3952 > 0) {
		    int i_12_
			= (int) (Math.atan2((double) (-1303432183 * anInt8133),
					    (double) (553220075 * anInt8144))
				 * 2607.5945876176133);
		    int i_13_
			= (int) ((Math.atan2
				  ((double) (anInt8141 * 1749498351),
				   Math.sqrt((double) ((anInt8133 * -1303432183
							* (anInt8133
							   * -1303432183))
						       + (553220075 * anInt8144
							  * (553220075
							     * anInt8144))))))
				 * 2607.5945876176133);
		    anInt8136 = -1425679993 * (aClass382_8131.aShort3935
					       - aClass382_8131.aShort3934);
		    anInt8143
			= (i_12_ + aClass382_8131.aShort3934
			   - (1364237367 * anInt8136 >> 1)) * -1736761375;
		    anInt8142 = 1787163843 * (aClass382_8131.aShort3952
					      - aClass382_8131.aShort3979);
		    anInt8139 = (i_13_ + aClass382_8131.aShort3979
				 - (anInt8142 * -160605205 >> 1)) * 1350920903;
		}
		aBool8148 = true;
	    }
	    anInt8140
		+= ((int) ((double) i
			   * ((double) (aClass382_8131.anInt3957 * -1240512763)
			      + (Math.random()
				 * (double) ((aClass382_8131.anInt3958
					      * 1637212199)
					     - (-1240512763
						* aClass382_8131.anInt3957)))))
		    * -1646682831);
	    if (524983249 * anInt8140 > 63) {
		int i_14_ = 524983249 * anInt8140 >> 6;
		anInt8140 = (anInt8140 * 524983249 & 0x3f) * -1646682831;
		int i_15_ = (i << 8) / i_14_;
		int i_16_ = 0;
		int i_17_ = 0;
		while (i_17_ < i_14_) {
		    int i_18_;
		    int i_19_;
		    int i_20_;
		    if (aClass382_8131.aShort3935 > 0
			|| aClass382_8131.aShort3952 > 0) {
			int i_21_ = (-917674975 * anInt8143
				     + (int) ((double) (1364237367 * anInt8136)
					      * Math.random()));
			i_21_ &= 0x3fff;
			int i_22_ = Class436.anIntArray4831[i_21_];
			int i_23_ = Class436.anIntArray4838[i_21_];
			int i_24_ = (anInt8139 * -1086310665
				     + (int) ((double) (-160605205 * anInt8142)
					      * Math.random()));
			i_24_ &= 0x1fff;
			int i_25_ = Class436.anIntArray4831[i_24_];
			int i_26_ = Class436.anIntArray4838[i_24_];
			int i_27_ = 13;
			i_18_ = i_25_ * i_23_ >> i_27_;
			i_19_ = -1 * (i_26_ << 1);
			i_20_ = i_22_ * i_25_ >> i_27_;
		    } else {
			i_18_ = 553220075 * anInt8144;
			i_19_ = 1749498351 * anInt8141;
			i_20_ = -1303432183 * anInt8133;
		    }
		    float f = (float) Math.random();
		    float f_28_ = (float) Math.random();
		    if (f_28_ + f > 1.0F) {
			f = 1.0F - f;
			f_28_ = 1.0F - f_28_;
		    }
		    float f_29_ = 1.0F - (f + f_28_);
		    int i_30_
			= (int) (f_28_ * (float) (aClass636_8138.anInt8277
						  * 1470838697)
				 + (float) (1884912401
					    * aClass636_8138.anInt8280) * f
				 + f_29_ * (float) (aClass636_8138.anInt8281
						    * -666977237));
		    int i_31_
			= (int) (f_29_ * (float) (aClass636_8138.anInt8282
						  * -641045269)
				 + ((f_28_
				     * (float) (1301556211
						* aClass636_8138.anInt8275))
				    + f * (float) (782985373 * (aClass636_8138
								.anInt8276))));
		    int i_32_
			= (int) ((float) (-454136693
					  * aClass636_8138.anInt8283) * f_28_
				 + f * (float) (1861600415
						* aClass636_8138.anInt8279)
				 + f_29_ * (float) (aClass636_8138.anInt8278
						    * 86535875));
		    int i_33_
			= (aClass382_8131.anInt3955 * 1359494079
			   + (int) (Math.random()
				    * (double) ((aClass382_8131.anInt3936
						 * -839402619)
						- 1359494079 * (aClass382_8131
								.anInt3955))));
		    int i_34_
			= (aClass382_8131.anInt4003 * -853933795
			   + (int) (Math.random()
				    * (double) ((-1303510863
						 * aClass382_8131.anInt3956)
						- -853933795 * (aClass382_8131
								.anInt4003))));
		    int i_35_
			= (1265076673 * aClass382_8131.anInt3944
			   + (int) (Math.random()
				    * (double) ((-435269687
						 * aClass382_8131.anInt3945)
						- (aClass382_8131.anInt3944
						   * 1265076673))));
		    int i_36_ = 301554815 * aClass382_8131.anInt3974;
		    if (aClass382_8131.anInt4007 * 301796303 != 0) {
			if (0 == aClass382_8131.anInt3976 * 805064229)
			    i_36_
				+= (int) (Math.random()
					  * (double) ((aClass382_8131.anInt4007
						       * 301796303)
						      + 1));
			else
			    i_36_
				+= ((int) (Math.random()
					   * (double) ((aClass382_8131
							.anInt3976) * 805064229
						       + 1))
				    * (aClass382_8131.anInt4007 * 301796303
				       / (aClass382_8131.anInt3976
					  * 805064229)));
		    }
		    int i_37_ = aClass382_8131.anInt3977 * -1641964721;
		    if (0 != aClass382_8131.anInt3960 * 1860039837)
			i_37_ += (int) (Math.random()
					* (double) (1 + (1860039837
							 * (aClass382_8131
							    .anInt3960))));
		    int i_38_;
		    if (aClass382_8131.aBool3946) {
			double d = Math.random();
			i_38_
			    = ((int) (d * (double) (-450873139
						    * aClass382_8131.anInt3987)
				      + (double) (aClass382_8131.anInt3938
						  * -938833209)) << 16
			       | (int) ((double) (-126812375
						  * aClass382_8131.anInt3989)
					+ d * (double) (-549280689
							* (aClass382_8131
							   .anInt3990))) << 8
			       | (int) (((double) (365666185
						   * aClass382_8131.anInt3993)
					 * d)
					+ (double) (568027381 * (aClass382_8131
								 .anInt3940)))
			       | ((int) ((double) (-939104763
						   * aClass382_8131.anInt3994)
					 + (Math.random()
					    * (double) (2069526479
							* (aClass382_8131
							   .anInt3954))))
				  << 24));
		    } else
			i_38_
			    = ((int) ((double) (aClass382_8131.anInt3938
						* -938833209)
				      + (Math.random()
					 * (double) (aClass382_8131.anInt3987
						     * -450873139))) << 16
			       | (int) ((double) (-126812375
						  * aClass382_8131.anInt3989)
					+ (Math.random()
					   * (double) (-549280689
						       * (aClass382_8131
							  .anInt3990)))) << 8
			       | (int) ((double) (568027381
						  * aClass382_8131.anInt3940)
					+ (Math.random()
					   * (double) (365666185
						       * (aClass382_8131
							  .anInt3993))))
			       | ((int) ((double) (-939104763
						   * aClass382_8131.anInt3994)
					 + (Math.random()
					    * (double) (2069526479
							* (aClass382_8131
							   .anInt3954))))
				  << 24));
		    int i_39_ = aClass382_8131.anInt3949 * 1861854689;
		    if (!class182.method3145() && !aClass382_8131.aBool3991)
			i_39_ = -1;
		    Class531_Sub5_Sub1_Sub1 class531_sub5_sub1_sub1;
		    if (Class616.anInt8048 * -1916807703
			!= Class616.anInt8043 * -533660013) {
			class531_sub5_sub1_sub1
			    = (Class261.aClass531_Sub5_Sub1_Sub1Array2790
			       [Class616.anInt8043 * -533660013]);
			Class616.anInt8043
			    = ((-533660013 * Class616.anInt8043 + 1 & 0x3ff)
			       * -1431318629);
			class531_sub5_sub1_sub1.method18773
			    (this, i_30_, i_31_, i_32_, i_18_, i_19_, i_20_,
			     i_33_, i_34_, i_38_, i_35_, i_36_, i_37_, i_39_,
			     aClass382_8131.aBool3972,
			     aClass382_8131.aBool3980);
		    } else
			class531_sub5_sub1_sub1
			    = (new Class531_Sub5_Sub1_Sub1
			       (this, i_30_, i_31_, i_32_, i_18_, i_19_, i_20_,
				i_33_, i_34_, i_38_, i_35_, i_36_, i_37_,
				i_39_, aClass382_8131.aBool3972,
				aClass382_8131.aBool3980));
		    if (i_16_ > 256)
			class531_sub5_sub1_sub1.method18783(l, i_16_ >> 8);
		    anInt8135 += -644469701;
		    i_17_++;
		    i_16_ += i_15_;
		}
	    }
	}
	if (!aClass636_8138.method10469(aClass636_8146, 440972322)) {
	    Class636 class636 = aClass636_8146;
	    aClass636_8146 = aClass636_8138;
	    aClass636_8138 = class636;
	    aClass636_8138.anInt8280 = aClass184_8145.anInt2077 * -1684560573;
	    aClass636_8138.anInt8276 = aClass184_8145.anInt2063 * 1561155507;
	    aClass636_8138.anInt8279 = 1240252571 * aClass184_8145.anInt2072;
	    aClass636_8138.anInt8277 = aClass184_8145.anInt2073 * -2128497919;
	    aClass636_8138.anInt8275 = aClass184_8145.anInt2074 * 1786269643;
	    aClass636_8138.anInt8283 = -1750773321 * aClass184_8145.anInt2075;
	    aClass636_8138.anInt8281 = aClass184_8145.anInt2071 * 415930005;
	    aClass636_8138.anInt8282 = aClass184_8145.anInt2067 * 1060546105;
	    aClass636_8138.anInt8278 = -1699190081 * aClass184_8145.anInt2078;
	    aClass636_8138.anInt8284 = 1 * aClass636_8146.anInt8284;
	    aClass636_8138.anInt8285 = aClass636_8146.anInt8285 * 1;
	    aClass636_8138.anInt8286 = 1 * aClass636_8146.anInt8286;
	}
	Class616.anInt8042 += anInt8135 * 176683551;
    }
    
    void method10244(Class182 class182, long l, int i, boolean bool) {
	if (aBool8137)
	    bool = false;
	else if (1206403205 * Class616.anInt8047
		 < aClass382_8131.anInt3971 * 2094183313)
	    bool = false;
	else if (Class616.anInt8055 * 729885067
		 > Class181.anIntArray1925[Class616.anInt8047 * 1206403205])
	    bool = false;
	else if (aBool8147)
	    bool = false;
	else if (aClass382_8131.anInt3970 * -736734443 != -1) {
	    int i_40_ = (int) (l - -46995223780141845L * aLong8130);
	    if (!aClass382_8131.aBool3968
		&& i_40_ > aClass382_8131.anInt3970 * -736734443)
		bool = false;
	    else
		i_40_ %= -736734443 * aClass382_8131.anInt3970;
	    if (!aClass382_8131.aBool4005
		&& i_40_ < aClass382_8131.anInt3985 * -1676158601)
		bool = false;
	    if (aClass382_8131.aBool4005
		&& i_40_ >= aClass382_8131.anInt3985 * -1676158601)
		bool = false;
	}
	anInt8135 = 0;
	for (Class531_Sub5_Sub1_Sub1 class531_sub5_sub1_sub1
		 = ((Class531_Sub5_Sub1_Sub1)
		    aClass708_8134.method14328(-1206444210));
	     null != class531_sub5_sub1_sub1;
	     class531_sub5_sub1_sub1
		 = ((Class531_Sub5_Sub1_Sub1)
		    aClass708_8134.method14337(-812809821))) {
	    class531_sub5_sub1_sub1.method18783(l, i);
	    anInt8135 += -644469701;
	}
	if (bool) {
	    int i_41_ = ((aClass636_8138.anInt8277 * 1470838697
			  + 1884912401 * aClass636_8138.anInt8280
			  + -666977237 * aClass636_8138.anInt8281)
			 / 3);
	    int i_42_ = ((aClass636_8138.anInt8282 * -641045269
			  + (aClass636_8138.anInt8275 * 1301556211
			     + 782985373 * aClass636_8138.anInt8276))
			 / 3);
	    int i_43_ = ((aClass636_8138.anInt8283 * -454136693
			  + 1861600415 * aClass636_8138.anInt8279
			  + 86535875 * aClass636_8138.anInt8278)
			 / 3);
	    if (1290098051 * aClass636_8138.anInt8284 != i_41_
		|| i_42_ != -793531135 * aClass636_8138.anInt8285
		|| i_43_ != aClass636_8138.anInt8286 * -1950313275
		|| !aBool8148) {
		aClass636_8138.anInt8284 = i_41_ * -1487118037;
		aClass636_8138.anInt8285 = 490033921 * i_42_;
		aClass636_8138.anInt8286 = 1506920973 * i_43_;
		int i_44_ = (aClass636_8138.anInt8277 * 1470838697
			     - aClass636_8138.anInt8280 * 1884912401);
		int i_45_ = (aClass636_8138.anInt8275 * 1301556211
			     - 782985373 * aClass636_8138.anInt8276);
		int i_46_ = (aClass636_8138.anInt8283 * -454136693
			     - 1861600415 * aClass636_8138.anInt8279);
		int i_47_ = (-666977237 * aClass636_8138.anInt8281
			     - aClass636_8138.anInt8280 * 1884912401);
		int i_48_ = (aClass636_8138.anInt8282 * -641045269
			     - 782985373 * aClass636_8138.anInt8276);
		int i_49_ = (86535875 * aClass636_8138.anInt8278
			     - aClass636_8138.anInt8279 * 1861600415);
		anInt8144 = (i_45_ * i_49_ - i_46_ * i_48_) * -1947535165;
		anInt8141 = (i_46_ * i_47_ - i_49_ * i_44_) * 1142756623;
		for (anInt8133 = -762275271 * (i_48_ * i_44_ - i_47_ * i_45_);
		     (anInt8144 * 553220075 > 32767
		      || 1749498351 * anInt8141 > 32767
		      || -1303432183 * anInt8133 > 32767
		      || anInt8144 * 553220075 < -32767
		      || 1749498351 * anInt8141 < -32767
		      || -1303432183 * anInt8133 < -32767);
		     anInt8133 = -762275271 * (anInt8133 * -1303432183 >> 1)) {
		    anInt8144 = (553220075 * anInt8144 >> 1) * -1947535165;
		    anInt8141 = 1142756623 * (1749498351 * anInt8141 >> 1);
		}
		int i_50_
		    = (int) Math.sqrt((double) ((anInt8141 * 1749498351
						 * (1749498351 * anInt8141))
						+ (anInt8144 * 553220075
						   * (anInt8144 * 553220075))
						+ (anInt8133 * -1303432183
						   * (anInt8133
						      * -1303432183))));
		if (i_50_ <= 0)
		    i_50_ = 1;
		anInt8144 = -1947535165 * (-1694758891 * anInt8144 / i_50_);
		anInt8141 = 883967505 * anInt8141 / i_50_ * 1142756623;
		anInt8133 = -762275271 * (-407548937 * anInt8133 / i_50_);
		if (aClass382_8131.aShort3935 > 0
		    || aClass382_8131.aShort3952 > 0) {
		    int i_51_
			= (int) (Math.atan2((double) (-1303432183 * anInt8133),
					    (double) (553220075 * anInt8144))
				 * 2607.5945876176133);
		    int i_52_
			= (int) ((Math.atan2
				  ((double) (anInt8141 * 1749498351),
				   Math.sqrt((double) ((anInt8133 * -1303432183
							* (anInt8133
							   * -1303432183))
						       + (553220075 * anInt8144
							  * (553220075
							     * anInt8144))))))
				 * 2607.5945876176133);
		    anInt8136 = -1425679993 * (aClass382_8131.aShort3935
					       - aClass382_8131.aShort3934);
		    anInt8143
			= (i_51_ + aClass382_8131.aShort3934
			   - (1364237367 * anInt8136 >> 1)) * -1736761375;
		    anInt8142 = 1787163843 * (aClass382_8131.aShort3952
					      - aClass382_8131.aShort3979);
		    anInt8139 = (i_52_ + aClass382_8131.aShort3979
				 - (anInt8142 * -160605205 >> 1)) * 1350920903;
		}
		aBool8148 = true;
	    }
	    anInt8140
		+= ((int) ((double) i
			   * ((double) (aClass382_8131.anInt3957 * -1240512763)
			      + (Math.random()
				 * (double) ((aClass382_8131.anInt3958
					      * 1637212199)
					     - (-1240512763
						* aClass382_8131.anInt3957)))))
		    * -1646682831);
	    if (524983249 * anInt8140 > 63) {
		int i_53_ = 524983249 * anInt8140 >> 6;
		anInt8140 = (anInt8140 * 524983249 & 0x3f) * -1646682831;
		int i_54_ = (i << 8) / i_53_;
		int i_55_ = 0;
		int i_56_ = 0;
		while (i_56_ < i_53_) {
		    int i_57_;
		    int i_58_;
		    int i_59_;
		    if (aClass382_8131.aShort3935 > 0
			|| aClass382_8131.aShort3952 > 0) {
			int i_60_ = (-917674975 * anInt8143
				     + (int) ((double) (1364237367 * anInt8136)
					      * Math.random()));
			i_60_ &= 0x3fff;
			int i_61_ = Class436.anIntArray4831[i_60_];
			int i_62_ = Class436.anIntArray4838[i_60_];
			int i_63_ = (anInt8139 * -1086310665
				     + (int) ((double) (-160605205 * anInt8142)
					      * Math.random()));
			i_63_ &= 0x1fff;
			int i_64_ = Class436.anIntArray4831[i_63_];
			int i_65_ = Class436.anIntArray4838[i_63_];
			int i_66_ = 13;
			i_57_ = i_64_ * i_62_ >> i_66_;
			i_58_ = -1 * (i_65_ << 1);
			i_59_ = i_61_ * i_64_ >> i_66_;
		    } else {
			i_57_ = 553220075 * anInt8144;
			i_58_ = 1749498351 * anInt8141;
			i_59_ = -1303432183 * anInt8133;
		    }
		    float f = (float) Math.random();
		    float f_67_ = (float) Math.random();
		    if (f_67_ + f > 1.0F) {
			f = 1.0F - f;
			f_67_ = 1.0F - f_67_;
		    }
		    float f_68_ = 1.0F - (f + f_67_);
		    int i_69_
			= (int) (f_67_ * (float) (aClass636_8138.anInt8277
						  * 1470838697)
				 + (float) (1884912401
					    * aClass636_8138.anInt8280) * f
				 + f_68_ * (float) (aClass636_8138.anInt8281
						    * -666977237));
		    int i_70_
			= (int) (f_68_ * (float) (aClass636_8138.anInt8282
						  * -641045269)
				 + ((f_67_
				     * (float) (1301556211
						* aClass636_8138.anInt8275))
				    + f * (float) (782985373 * (aClass636_8138
								.anInt8276))));
		    int i_71_
			= (int) ((float) (-454136693
					  * aClass636_8138.anInt8283) * f_67_
				 + f * (float) (1861600415
						* aClass636_8138.anInt8279)
				 + f_68_ * (float) (aClass636_8138.anInt8278
						    * 86535875));
		    int i_72_
			= (aClass382_8131.anInt3955 * 1359494079
			   + (int) (Math.random()
				    * (double) ((aClass382_8131.anInt3936
						 * -839402619)
						- 1359494079 * (aClass382_8131
								.anInt3955))));
		    int i_73_
			= (aClass382_8131.anInt4003 * -853933795
			   + (int) (Math.random()
				    * (double) ((-1303510863
						 * aClass382_8131.anInt3956)
						- -853933795 * (aClass382_8131
								.anInt4003))));
		    int i_74_
			= (1265076673 * aClass382_8131.anInt3944
			   + (int) (Math.random()
				    * (double) ((-435269687
						 * aClass382_8131.anInt3945)
						- (aClass382_8131.anInt3944
						   * 1265076673))));
		    int i_75_ = 301554815 * aClass382_8131.anInt3974;
		    if (aClass382_8131.anInt4007 * 301796303 != 0) {
			if (0 == aClass382_8131.anInt3976 * 805064229)
			    i_75_
				+= (int) (Math.random()
					  * (double) ((aClass382_8131.anInt4007
						       * 301796303)
						      + 1));
			else
			    i_75_
				+= ((int) (Math.random()
					   * (double) ((aClass382_8131
							.anInt3976) * 805064229
						       + 1))
				    * (aClass382_8131.anInt4007 * 301796303
				       / (aClass382_8131.anInt3976
					  * 805064229)));
		    }
		    int i_76_ = aClass382_8131.anInt3977 * -1641964721;
		    if (0 != aClass382_8131.anInt3960 * 1860039837)
			i_76_ += (int) (Math.random()
					* (double) (1 + (1860039837
							 * (aClass382_8131
							    .anInt3960))));
		    int i_77_;
		    if (aClass382_8131.aBool3946) {
			double d = Math.random();
			i_77_
			    = ((int) (d * (double) (-450873139
						    * aClass382_8131.anInt3987)
				      + (double) (aClass382_8131.anInt3938
						  * -938833209)) << 16
			       | (int) ((double) (-126812375
						  * aClass382_8131.anInt3989)
					+ d * (double) (-549280689
							* (aClass382_8131
							   .anInt3990))) << 8
			       | (int) (((double) (365666185
						   * aClass382_8131.anInt3993)
					 * d)
					+ (double) (568027381 * (aClass382_8131
								 .anInt3940)))
			       | ((int) ((double) (-939104763
						   * aClass382_8131.anInt3994)
					 + (Math.random()
					    * (double) (2069526479
							* (aClass382_8131
							   .anInt3954))))
				  << 24));
		    } else
			i_77_
			    = ((int) ((double) (aClass382_8131.anInt3938
						* -938833209)
				      + (Math.random()
					 * (double) (aClass382_8131.anInt3987
						     * -450873139))) << 16
			       | (int) ((double) (-126812375
						  * aClass382_8131.anInt3989)
					+ (Math.random()
					   * (double) (-549280689
						       * (aClass382_8131
							  .anInt3990)))) << 8
			       | (int) ((double) (568027381
						  * aClass382_8131.anInt3940)
					+ (Math.random()
					   * (double) (365666185
						       * (aClass382_8131
							  .anInt3993))))
			       | ((int) ((double) (-939104763
						   * aClass382_8131.anInt3994)
					 + (Math.random()
					    * (double) (2069526479
							* (aClass382_8131
							   .anInt3954))))
				  << 24));
		    int i_78_ = aClass382_8131.anInt3949 * 1861854689;
		    if (!class182.method3145() && !aClass382_8131.aBool3991)
			i_78_ = -1;
		    Class531_Sub5_Sub1_Sub1 class531_sub5_sub1_sub1;
		    if (Class616.anInt8048 * -1916807703
			!= Class616.anInt8043 * -533660013) {
			class531_sub5_sub1_sub1
			    = (Class261.aClass531_Sub5_Sub1_Sub1Array2790
			       [Class616.anInt8043 * -533660013]);
			Class616.anInt8043
			    = ((-533660013 * Class616.anInt8043 + 1 & 0x3ff)
			       * -1431318629);
			class531_sub5_sub1_sub1.method18773
			    (this, i_69_, i_70_, i_71_, i_57_, i_58_, i_59_,
			     i_72_, i_73_, i_77_, i_74_, i_75_, i_76_, i_78_,
			     aClass382_8131.aBool3972,
			     aClass382_8131.aBool3980);
		    } else
			class531_sub5_sub1_sub1
			    = (new Class531_Sub5_Sub1_Sub1
			       (this, i_69_, i_70_, i_71_, i_57_, i_58_, i_59_,
				i_72_, i_73_, i_77_, i_74_, i_75_, i_76_,
				i_78_, aClass382_8131.aBool3972,
				aClass382_8131.aBool3980));
		    if (i_55_ > 256)
			class531_sub5_sub1_sub1.method18783(l, i_55_ >> 8);
		    anInt8135 += -644469701;
		    i_56_++;
		    i_55_ += i_54_;
		}
	    }
	}
	if (!aClass636_8138.method10469(aClass636_8146, 440972322)) {
	    Class636 class636 = aClass636_8146;
	    aClass636_8146 = aClass636_8138;
	    aClass636_8138 = class636;
	    aClass636_8138.anInt8280 = aClass184_8145.anInt2077 * -1684560573;
	    aClass636_8138.anInt8276 = aClass184_8145.anInt2063 * 1561155507;
	    aClass636_8138.anInt8279 = 1240252571 * aClass184_8145.anInt2072;
	    aClass636_8138.anInt8277 = aClass184_8145.anInt2073 * -2128497919;
	    aClass636_8138.anInt8275 = aClass184_8145.anInt2074 * 1786269643;
	    aClass636_8138.anInt8283 = -1750773321 * aClass184_8145.anInt2075;
	    aClass636_8138.anInt8281 = aClass184_8145.anInt2071 * 415930005;
	    aClass636_8138.anInt8282 = aClass184_8145.anInt2067 * 1060546105;
	    aClass636_8138.anInt8278 = -1699190081 * aClass184_8145.anInt2078;
	    aClass636_8138.anInt8284 = 1 * aClass636_8146.anInt8284;
	    aClass636_8138.anInt8285 = aClass636_8146.anInt8285 * 1;
	    aClass636_8138.anInt8286 = 1 * aClass636_8146.anInt8286;
	}
	Class616.anInt8042 += anInt8135 * 176683551;
    }
    
    void method10245() {
	aClass636_8138.anInt8280 = aClass184_8145.anInt2077 * -1684560573;
	aClass636_8138.anInt8276 = 1561155507 * aClass184_8145.anInt2063;
	aClass636_8138.anInt8279 = aClass184_8145.anInt2072 * 1240252571;
	aClass636_8138.anInt8277 = aClass184_8145.anInt2073 * -2128497919;
	aClass636_8138.anInt8275 = 1786269643 * aClass184_8145.anInt2074;
	aClass636_8138.anInt8283 = aClass184_8145.anInt2075 * -1750773321;
	aClass636_8138.anInt8281 = aClass184_8145.anInt2071 * 415930005;
	aClass636_8138.anInt8282 = aClass184_8145.anInt2067 * 1060546105;
	aClass636_8138.anInt8278 = aClass184_8145.anInt2078 * -1699190081;
	if ((aClass636_8138.anInt8280 * 1884912401
	     == 1470838697 * aClass636_8138.anInt8277)
	    && (1470838697 * aClass636_8138.anInt8277
		== -666977237 * aClass636_8138.anInt8281)
	    && (1301556211 * aClass636_8138.anInt8275
		== 782985373 * aClass636_8138.anInt8276)
	    && (-641045269 * aClass636_8138.anInt8282
		== 1301556211 * aClass636_8138.anInt8275)
	    && (aClass636_8138.anInt8283 * -454136693
		== 1861600415 * aClass636_8138.anInt8279)
	    && (86535875 * aClass636_8138.anInt8278
		== aClass636_8138.anInt8283 * -454136693))
	    aBool8147 = true;
	else if (aBool8147) {
	    aBool8147 = false;
	    aClass636_8146.anInt8280 = aClass636_8138.anInt8280 * 1;
	    aClass636_8146.anInt8276 = aClass636_8138.anInt8276 * 1;
	    aClass636_8146.anInt8279 = aClass636_8138.anInt8279 * 1;
	    aClass636_8146.anInt8277 = aClass636_8138.anInt8277 * 1;
	    aClass636_8146.anInt8275 = 1 * aClass636_8138.anInt8275;
	    aClass636_8146.anInt8283 = 1 * aClass636_8138.anInt8283;
	    aClass636_8146.anInt8281 = aClass636_8138.anInt8281 * 1;
	    aClass636_8146.anInt8282 = aClass636_8138.anInt8282 * 1;
	    aClass636_8146.anInt8278 = 1 * aClass636_8138.anInt8278;
	}
    }
    
    void method10246() {
	aClass636_8138.anInt8280 = aClass184_8145.anInt2077 * -1684560573;
	aClass636_8138.anInt8276 = 1561155507 * aClass184_8145.anInt2063;
	aClass636_8138.anInt8279 = aClass184_8145.anInt2072 * 1240252571;
	aClass636_8138.anInt8277 = aClass184_8145.anInt2073 * -2128497919;
	aClass636_8138.anInt8275 = 1786269643 * aClass184_8145.anInt2074;
	aClass636_8138.anInt8283 = aClass184_8145.anInt2075 * -1750773321;
	aClass636_8138.anInt8281 = aClass184_8145.anInt2071 * 415930005;
	aClass636_8138.anInt8282 = aClass184_8145.anInt2067 * 1060546105;
	aClass636_8138.anInt8278 = aClass184_8145.anInt2078 * -1699190081;
	if ((aClass636_8138.anInt8280 * 1884912401
	     == 1470838697 * aClass636_8138.anInt8277)
	    && (1470838697 * aClass636_8138.anInt8277
		== -666977237 * aClass636_8138.anInt8281)
	    && (1301556211 * aClass636_8138.anInt8275
		== 782985373 * aClass636_8138.anInt8276)
	    && (-641045269 * aClass636_8138.anInt8282
		== 1301556211 * aClass636_8138.anInt8275)
	    && (aClass636_8138.anInt8283 * -454136693
		== 1861600415 * aClass636_8138.anInt8279)
	    && (86535875 * aClass636_8138.anInt8278
		== aClass636_8138.anInt8283 * -454136693))
	    aBool8147 = true;
	else if (aBool8147) {
	    aBool8147 = false;
	    aClass636_8146.anInt8280 = aClass636_8138.anInt8280 * 1;
	    aClass636_8146.anInt8276 = aClass636_8138.anInt8276 * 1;
	    aClass636_8146.anInt8279 = aClass636_8138.anInt8279 * 1;
	    aClass636_8146.anInt8277 = aClass636_8138.anInt8277 * 1;
	    aClass636_8146.anInt8275 = 1 * aClass636_8138.anInt8275;
	    aClass636_8146.anInt8283 = 1 * aClass636_8138.anInt8283;
	    aClass636_8146.anInt8281 = aClass636_8138.anInt8281 * 1;
	    aClass636_8146.anInt8282 = aClass636_8138.anInt8282 * 1;
	    aClass636_8146.anInt8278 = 1 * aClass636_8138.anInt8278;
	}
    }
    
    void method10247() {
	aClass636_8138.anInt8280 = aClass184_8145.anInt2077 * -1684560573;
	aClass636_8138.anInt8276 = 1561155507 * aClass184_8145.anInt2063;
	aClass636_8138.anInt8279 = aClass184_8145.anInt2072 * 1240252571;
	aClass636_8138.anInt8277 = aClass184_8145.anInt2073 * -2128497919;
	aClass636_8138.anInt8275 = 1786269643 * aClass184_8145.anInt2074;
	aClass636_8138.anInt8283 = aClass184_8145.anInt2075 * -1750773321;
	aClass636_8138.anInt8281 = aClass184_8145.anInt2071 * 415930005;
	aClass636_8138.anInt8282 = aClass184_8145.anInt2067 * 1060546105;
	aClass636_8138.anInt8278 = aClass184_8145.anInt2078 * -1699190081;
	if ((aClass636_8138.anInt8280 * 1884912401
	     == 1470838697 * aClass636_8138.anInt8277)
	    && (1470838697 * aClass636_8138.anInt8277
		== -666977237 * aClass636_8138.anInt8281)
	    && (1301556211 * aClass636_8138.anInt8275
		== 782985373 * aClass636_8138.anInt8276)
	    && (-641045269 * aClass636_8138.anInt8282
		== 1301556211 * aClass636_8138.anInt8275)
	    && (aClass636_8138.anInt8283 * -454136693
		== 1861600415 * aClass636_8138.anInt8279)
	    && (86535875 * aClass636_8138.anInt8278
		== aClass636_8138.anInt8283 * -454136693))
	    aBool8147 = true;
	else if (aBool8147) {
	    aBool8147 = false;
	    aClass636_8146.anInt8280 = aClass636_8138.anInt8280 * 1;
	    aClass636_8146.anInt8276 = aClass636_8138.anInt8276 * 1;
	    aClass636_8146.anInt8279 = aClass636_8138.anInt8279 * 1;
	    aClass636_8146.anInt8277 = aClass636_8138.anInt8277 * 1;
	    aClass636_8146.anInt8275 = 1 * aClass636_8138.anInt8275;
	    aClass636_8146.anInt8283 = 1 * aClass636_8138.anInt8283;
	    aClass636_8146.anInt8281 = aClass636_8138.anInt8281 * 1;
	    aClass636_8146.anInt8282 = aClass636_8138.anInt8282 * 1;
	    aClass636_8146.anInt8278 = 1 * aClass636_8138.anInt8278;
	}
    }
    
    void method10248() {
	aClass636_8138.anInt8280 = aClass184_8145.anInt2077 * -1684560573;
	aClass636_8138.anInt8276 = 1561155507 * aClass184_8145.anInt2063;
	aClass636_8138.anInt8279 = aClass184_8145.anInt2072 * 1240252571;
	aClass636_8138.anInt8277 = aClass184_8145.anInt2073 * -2128497919;
	aClass636_8138.anInt8275 = 1786269643 * aClass184_8145.anInt2074;
	aClass636_8138.anInt8283 = aClass184_8145.anInt2075 * -1750773321;
	aClass636_8138.anInt8281 = aClass184_8145.anInt2071 * 415930005;
	aClass636_8138.anInt8282 = aClass184_8145.anInt2067 * 1060546105;
	aClass636_8138.anInt8278 = aClass184_8145.anInt2078 * -1699190081;
	if ((aClass636_8138.anInt8280 * 1884912401
	     == 1470838697 * aClass636_8138.anInt8277)
	    && (1470838697 * aClass636_8138.anInt8277
		== -666977237 * aClass636_8138.anInt8281)
	    && (1301556211 * aClass636_8138.anInt8275
		== 782985373 * aClass636_8138.anInt8276)
	    && (-641045269 * aClass636_8138.anInt8282
		== 1301556211 * aClass636_8138.anInt8275)
	    && (aClass636_8138.anInt8283 * -454136693
		== 1861600415 * aClass636_8138.anInt8279)
	    && (86535875 * aClass636_8138.anInt8278
		== aClass636_8138.anInt8283 * -454136693))
	    aBool8147 = true;
	else if (aBool8147) {
	    aBool8147 = false;
	    aClass636_8146.anInt8280 = aClass636_8138.anInt8280 * 1;
	    aClass636_8146.anInt8276 = aClass636_8138.anInt8276 * 1;
	    aClass636_8146.anInt8279 = aClass636_8138.anInt8279 * 1;
	    aClass636_8146.anInt8277 = aClass636_8138.anInt8277 * 1;
	    aClass636_8146.anInt8275 = 1 * aClass636_8138.anInt8275;
	    aClass636_8146.anInt8283 = 1 * aClass636_8138.anInt8283;
	    aClass636_8146.anInt8281 = aClass636_8138.anInt8281 * 1;
	    aClass636_8146.anInt8282 = aClass636_8138.anInt8282 * 1;
	    aClass636_8146.anInt8278 = 1 * aClass636_8138.anInt8278;
	}
    }
    
    void method10249(Class182 class182, long l, int i, boolean bool) {
	if (aBool8137)
	    bool = false;
	else if (1206403205 * Class616.anInt8047
		 < aClass382_8131.anInt3971 * 2094183313)
	    bool = false;
	else if (Class616.anInt8055 * 729885067
		 > Class181.anIntArray1925[Class616.anInt8047 * 1206403205])
	    bool = false;
	else if (aBool8147)
	    bool = false;
	else if (aClass382_8131.anInt3970 * -736734443 != -1) {
	    int i_79_ = (int) (l - -46995223780141845L * aLong8130);
	    if (!aClass382_8131.aBool3968
		&& i_79_ > aClass382_8131.anInt3970 * -736734443)
		bool = false;
	    else
		i_79_ %= -736734443 * aClass382_8131.anInt3970;
	    if (!aClass382_8131.aBool4005
		&& i_79_ < aClass382_8131.anInt3985 * -1676158601)
		bool = false;
	    if (aClass382_8131.aBool4005
		&& i_79_ >= aClass382_8131.anInt3985 * -1676158601)
		bool = false;
	}
	anInt8135 = 0;
	for (Class531_Sub5_Sub1_Sub1 class531_sub5_sub1_sub1
		 = ((Class531_Sub5_Sub1_Sub1)
		    aClass708_8134.method14328(-1352636689));
	     null != class531_sub5_sub1_sub1;
	     class531_sub5_sub1_sub1
		 = ((Class531_Sub5_Sub1_Sub1)
		    aClass708_8134.method14337(1407023133))) {
	    class531_sub5_sub1_sub1.method18783(l, i);
	    anInt8135 += -644469701;
	}
	if (bool) {
	    int i_80_ = ((aClass636_8138.anInt8277 * 1470838697
			  + 1884912401 * aClass636_8138.anInt8280
			  + -666977237 * aClass636_8138.anInt8281)
			 / 3);
	    int i_81_ = ((aClass636_8138.anInt8282 * -641045269
			  + (aClass636_8138.anInt8275 * 1301556211
			     + 782985373 * aClass636_8138.anInt8276))
			 / 3);
	    int i_82_ = ((aClass636_8138.anInt8283 * -454136693
			  + 1861600415 * aClass636_8138.anInt8279
			  + 86535875 * aClass636_8138.anInt8278)
			 / 3);
	    if (1290098051 * aClass636_8138.anInt8284 != i_80_
		|| i_81_ != -793531135 * aClass636_8138.anInt8285
		|| i_82_ != aClass636_8138.anInt8286 * -1950313275
		|| !aBool8148) {
		aClass636_8138.anInt8284 = i_80_ * -1487118037;
		aClass636_8138.anInt8285 = 490033921 * i_81_;
		aClass636_8138.anInt8286 = 1506920973 * i_82_;
		int i_83_ = (aClass636_8138.anInt8277 * 1470838697
			     - aClass636_8138.anInt8280 * 1884912401);
		int i_84_ = (aClass636_8138.anInt8275 * 1301556211
			     - 782985373 * aClass636_8138.anInt8276);
		int i_85_ = (aClass636_8138.anInt8283 * -454136693
			     - 1861600415 * aClass636_8138.anInt8279);
		int i_86_ = (-666977237 * aClass636_8138.anInt8281
			     - aClass636_8138.anInt8280 * 1884912401);
		int i_87_ = (aClass636_8138.anInt8282 * -641045269
			     - 782985373 * aClass636_8138.anInt8276);
		int i_88_ = (86535875 * aClass636_8138.anInt8278
			     - aClass636_8138.anInt8279 * 1861600415);
		anInt8144 = (i_84_ * i_88_ - i_85_ * i_87_) * -1947535165;
		anInt8141 = (i_85_ * i_86_ - i_88_ * i_83_) * 1142756623;
		for (anInt8133 = -762275271 * (i_87_ * i_83_ - i_86_ * i_84_);
		     (anInt8144 * 553220075 > 32767
		      || 1749498351 * anInt8141 > 32767
		      || -1303432183 * anInt8133 > 32767
		      || anInt8144 * 553220075 < -32767
		      || 1749498351 * anInt8141 < -32767
		      || -1303432183 * anInt8133 < -32767);
		     anInt8133 = -762275271 * (anInt8133 * -1303432183 >> 1)) {
		    anInt8144 = (553220075 * anInt8144 >> 1) * -1947535165;
		    anInt8141 = 1142756623 * (1749498351 * anInt8141 >> 1);
		}
		int i_89_
		    = (int) Math.sqrt((double) ((anInt8141 * 1749498351
						 * (1749498351 * anInt8141))
						+ (anInt8144 * 553220075
						   * (anInt8144 * 553220075))
						+ (anInt8133 * -1303432183
						   * (anInt8133
						      * -1303432183))));
		if (i_89_ <= 0)
		    i_89_ = 1;
		anInt8144 = -1947535165 * (-1694758891 * anInt8144 / i_89_);
		anInt8141 = 883967505 * anInt8141 / i_89_ * 1142756623;
		anInt8133 = -762275271 * (-407548937 * anInt8133 / i_89_);
		if (aClass382_8131.aShort3935 > 0
		    || aClass382_8131.aShort3952 > 0) {
		    int i_90_
			= (int) (Math.atan2((double) (-1303432183 * anInt8133),
					    (double) (553220075 * anInt8144))
				 * 2607.5945876176133);
		    int i_91_
			= (int) ((Math.atan2
				  ((double) (anInt8141 * 1749498351),
				   Math.sqrt((double) ((anInt8133 * -1303432183
							* (anInt8133
							   * -1303432183))
						       + (553220075 * anInt8144
							  * (553220075
							     * anInt8144))))))
				 * 2607.5945876176133);
		    anInt8136 = -1425679993 * (aClass382_8131.aShort3935
					       - aClass382_8131.aShort3934);
		    anInt8143
			= (i_90_ + aClass382_8131.aShort3934
			   - (1364237367 * anInt8136 >> 1)) * -1736761375;
		    anInt8142 = 1787163843 * (aClass382_8131.aShort3952
					      - aClass382_8131.aShort3979);
		    anInt8139 = (i_91_ + aClass382_8131.aShort3979
				 - (anInt8142 * -160605205 >> 1)) * 1350920903;
		}
		aBool8148 = true;
	    }
	    anInt8140
		+= ((int) ((double) i
			   * ((double) (aClass382_8131.anInt3957 * -1240512763)
			      + (Math.random()
				 * (double) ((aClass382_8131.anInt3958
					      * 1637212199)
					     - (-1240512763
						* aClass382_8131.anInt3957)))))
		    * -1646682831);
	    if (524983249 * anInt8140 > 63) {
		int i_92_ = 524983249 * anInt8140 >> 6;
		anInt8140 = (anInt8140 * 524983249 & 0x3f) * -1646682831;
		int i_93_ = (i << 8) / i_92_;
		int i_94_ = 0;
		int i_95_ = 0;
		while (i_95_ < i_92_) {
		    int i_96_;
		    int i_97_;
		    int i_98_;
		    if (aClass382_8131.aShort3935 > 0
			|| aClass382_8131.aShort3952 > 0) {
			int i_99_ = (-917674975 * anInt8143
				     + (int) ((double) (1364237367 * anInt8136)
					      * Math.random()));
			i_99_ &= 0x3fff;
			int i_100_ = Class436.anIntArray4831[i_99_];
			int i_101_ = Class436.anIntArray4838[i_99_];
			int i_102_
			    = (anInt8139 * -1086310665
			       + (int) ((double) (-160605205 * anInt8142)
					* Math.random()));
			i_102_ &= 0x1fff;
			int i_103_ = Class436.anIntArray4831[i_102_];
			int i_104_ = Class436.anIntArray4838[i_102_];
			int i_105_ = 13;
			i_96_ = i_103_ * i_101_ >> i_105_;
			i_97_ = -1 * (i_104_ << 1);
			i_98_ = i_100_ * i_103_ >> i_105_;
		    } else {
			i_96_ = 553220075 * anInt8144;
			i_97_ = 1749498351 * anInt8141;
			i_98_ = -1303432183 * anInt8133;
		    }
		    float f = (float) Math.random();
		    float f_106_ = (float) Math.random();
		    if (f_106_ + f > 1.0F) {
			f = 1.0F - f;
			f_106_ = 1.0F - f_106_;
		    }
		    float f_107_ = 1.0F - (f + f_106_);
		    int i_108_
			= (int) (f_106_ * (float) (aClass636_8138.anInt8277
						   * 1470838697)
				 + (float) (1884912401
					    * aClass636_8138.anInt8280) * f
				 + f_107_ * (float) (aClass636_8138.anInt8281
						     * -666977237));
		    int i_109_
			= (int) (f_107_ * (float) (aClass636_8138.anInt8282
						   * -641045269)
				 + ((f_106_
				     * (float) (1301556211
						* aClass636_8138.anInt8275))
				    + f * (float) (782985373 * (aClass636_8138
								.anInt8276))));
		    int i_110_
			= (int) ((float) (-454136693
					  * aClass636_8138.anInt8283) * f_106_
				 + f * (float) (1861600415
						* aClass636_8138.anInt8279)
				 + f_107_ * (float) (aClass636_8138.anInt8278
						     * 86535875));
		    int i_111_
			= (aClass382_8131.anInt3955 * 1359494079
			   + (int) (Math.random()
				    * (double) ((aClass382_8131.anInt3936
						 * -839402619)
						- 1359494079 * (aClass382_8131
								.anInt3955))));
		    int i_112_
			= (aClass382_8131.anInt4003 * -853933795
			   + (int) (Math.random()
				    * (double) ((-1303510863
						 * aClass382_8131.anInt3956)
						- -853933795 * (aClass382_8131
								.anInt4003))));
		    int i_113_
			= (1265076673 * aClass382_8131.anInt3944
			   + (int) (Math.random()
				    * (double) ((-435269687
						 * aClass382_8131.anInt3945)
						- (aClass382_8131.anInt3944
						   * 1265076673))));
		    int i_114_ = 301554815 * aClass382_8131.anInt3974;
		    if (aClass382_8131.anInt4007 * 301796303 != 0) {
			if (0 == aClass382_8131.anInt3976 * 805064229)
			    i_114_
				+= (int) (Math.random()
					  * (double) ((aClass382_8131.anInt4007
						       * 301796303)
						      + 1));
			else
			    i_114_
				+= ((int) (Math.random()
					   * (double) ((aClass382_8131
							.anInt3976) * 805064229
						       + 1))
				    * (aClass382_8131.anInt4007 * 301796303
				       / (aClass382_8131.anInt3976
					  * 805064229)));
		    }
		    int i_115_ = aClass382_8131.anInt3977 * -1641964721;
		    if (0 != aClass382_8131.anInt3960 * 1860039837)
			i_115_ += (int) (Math.random()
					 * (double) (1 + (1860039837
							  * (aClass382_8131
							     .anInt3960))));
		    int i_116_;
		    if (aClass382_8131.aBool3946) {
			double d = Math.random();
			i_116_
			    = ((int) (d * (double) (-450873139
						    * aClass382_8131.anInt3987)
				      + (double) (aClass382_8131.anInt3938
						  * -938833209)) << 16
			       | (int) ((double) (-126812375
						  * aClass382_8131.anInt3989)
					+ d * (double) (-549280689
							* (aClass382_8131
							   .anInt3990))) << 8
			       | (int) (((double) (365666185
						   * aClass382_8131.anInt3993)
					 * d)
					+ (double) (568027381 * (aClass382_8131
								 .anInt3940)))
			       | ((int) ((double) (-939104763
						   * aClass382_8131.anInt3994)
					 + (Math.random()
					    * (double) (2069526479
							* (aClass382_8131
							   .anInt3954))))
				  << 24));
		    } else
			i_116_
			    = ((int) ((double) (aClass382_8131.anInt3938
						* -938833209)
				      + (Math.random()
					 * (double) (aClass382_8131.anInt3987
						     * -450873139))) << 16
			       | (int) ((double) (-126812375
						  * aClass382_8131.anInt3989)
					+ (Math.random()
					   * (double) (-549280689
						       * (aClass382_8131
							  .anInt3990)))) << 8
			       | (int) ((double) (568027381
						  * aClass382_8131.anInt3940)
					+ (Math.random()
					   * (double) (365666185
						       * (aClass382_8131
							  .anInt3993))))
			       | ((int) ((double) (-939104763
						   * aClass382_8131.anInt3994)
					 + (Math.random()
					    * (double) (2069526479
							* (aClass382_8131
							   .anInt3954))))
				  << 24));
		    int i_117_ = aClass382_8131.anInt3949 * 1861854689;
		    if (!class182.method3145() && !aClass382_8131.aBool3991)
			i_117_ = -1;
		    Class531_Sub5_Sub1_Sub1 class531_sub5_sub1_sub1;
		    if (Class616.anInt8048 * -1916807703
			!= Class616.anInt8043 * -533660013) {
			class531_sub5_sub1_sub1
			    = (Class261.aClass531_Sub5_Sub1_Sub1Array2790
			       [Class616.anInt8043 * -533660013]);
			Class616.anInt8043
			    = ((-533660013 * Class616.anInt8043 + 1 & 0x3ff)
			       * -1431318629);
			class531_sub5_sub1_sub1.method18773
			    (this, i_108_, i_109_, i_110_, i_96_, i_97_, i_98_,
			     i_111_, i_112_, i_116_, i_113_, i_114_, i_115_,
			     i_117_, aClass382_8131.aBool3972,
			     aClass382_8131.aBool3980);
		    } else
			class531_sub5_sub1_sub1
			    = (new Class531_Sub5_Sub1_Sub1
			       (this, i_108_, i_109_, i_110_, i_96_, i_97_,
				i_98_, i_111_, i_112_, i_116_, i_113_, i_114_,
				i_115_, i_117_, aClass382_8131.aBool3972,
				aClass382_8131.aBool3980));
		    if (i_94_ > 256)
			class531_sub5_sub1_sub1.method18783(l, i_94_ >> 8);
		    anInt8135 += -644469701;
		    i_95_++;
		    i_94_ += i_93_;
		}
	    }
	}
	if (!aClass636_8138.method10469(aClass636_8146, 440972322)) {
	    Class636 class636 = aClass636_8146;
	    aClass636_8146 = aClass636_8138;
	    aClass636_8138 = class636;
	    aClass636_8138.anInt8280 = aClass184_8145.anInt2077 * -1684560573;
	    aClass636_8138.anInt8276 = aClass184_8145.anInt2063 * 1561155507;
	    aClass636_8138.anInt8279 = 1240252571 * aClass184_8145.anInt2072;
	    aClass636_8138.anInt8277 = aClass184_8145.anInt2073 * -2128497919;
	    aClass636_8138.anInt8275 = aClass184_8145.anInt2074 * 1786269643;
	    aClass636_8138.anInt8283 = -1750773321 * aClass184_8145.anInt2075;
	    aClass636_8138.anInt8281 = aClass184_8145.anInt2071 * 415930005;
	    aClass636_8138.anInt8282 = aClass184_8145.anInt2067 * 1060546105;
	    aClass636_8138.anInt8278 = -1699190081 * aClass184_8145.anInt2078;
	    aClass636_8138.anInt8284 = 1 * aClass636_8146.anInt8284;
	    aClass636_8138.anInt8285 = aClass636_8146.anInt8285 * 1;
	    aClass636_8138.anInt8286 = 1 * aClass636_8146.anInt8286;
	}
	Class616.anInt8042 += anInt8135 * 176683551;
    }
    
    void method10250(Class546 class546, Class182 class182, long l) {
	for (Class531_Sub5_Sub1_Sub1 class531_sub5_sub1_sub1
		 = ((Class531_Sub5_Sub1_Sub1)
		    aClass708_8134.method14328(1518667));
	     class531_sub5_sub1_sub1 != null;
	     class531_sub5_sub1_sub1 = ((Class531_Sub5_Sub1_Sub1)
					aClass708_8134.method14337(10799767)))
	    class531_sub5_sub1_sub1.method18774(class546, class182, l);
    }
    
    void method10251(Class546 class546, Class182 class182, long l) {
	for (Class531_Sub5_Sub1_Sub1 class531_sub5_sub1_sub1
		 = ((Class531_Sub5_Sub1_Sub1)
		    aClass708_8134.method14328(-1405988105));
	     class531_sub5_sub1_sub1 != null;
	     class531_sub5_sub1_sub1
		 = ((Class531_Sub5_Sub1_Sub1)
		    aClass708_8134.method14337(-2042950800)))
	    class531_sub5_sub1_sub1.method18774(class546, class182, l);
    }
    
    void method10252(int i) {
	aClass636_8138.anInt8280 = aClass184_8145.anInt2077 * -1684560573;
	aClass636_8138.anInt8276 = 1561155507 * aClass184_8145.anInt2063;
	aClass636_8138.anInt8279 = aClass184_8145.anInt2072 * 1240252571;
	aClass636_8138.anInt8277 = aClass184_8145.anInt2073 * -2128497919;
	aClass636_8138.anInt8275 = 1786269643 * aClass184_8145.anInt2074;
	aClass636_8138.anInt8283 = aClass184_8145.anInt2075 * -1750773321;
	aClass636_8138.anInt8281 = aClass184_8145.anInt2071 * 415930005;
	aClass636_8138.anInt8282 = aClass184_8145.anInt2067 * 1060546105;
	aClass636_8138.anInt8278 = aClass184_8145.anInt2078 * -1699190081;
	if ((aClass636_8138.anInt8280 * 1884912401
	     == 1470838697 * aClass636_8138.anInt8277)
	    && (1470838697 * aClass636_8138.anInt8277
		== -666977237 * aClass636_8138.anInt8281)
	    && (1301556211 * aClass636_8138.anInt8275
		== 782985373 * aClass636_8138.anInt8276)
	    && (-641045269 * aClass636_8138.anInt8282
		== 1301556211 * aClass636_8138.anInt8275)
	    && (aClass636_8138.anInt8283 * -454136693
		== 1861600415 * aClass636_8138.anInt8279)
	    && (86535875 * aClass636_8138.anInt8278
		== aClass636_8138.anInt8283 * -454136693))
	    aBool8147 = true;
	else if (aBool8147) {
	    aBool8147 = false;
	    aClass636_8146.anInt8280 = aClass636_8138.anInt8280 * 1;
	    aClass636_8146.anInt8276 = aClass636_8138.anInt8276 * 1;
	    aClass636_8146.anInt8279 = aClass636_8138.anInt8279 * 1;
	    aClass636_8146.anInt8277 = aClass636_8138.anInt8277 * 1;
	    aClass636_8146.anInt8275 = 1 * aClass636_8138.anInt8275;
	    aClass636_8146.anInt8283 = 1 * aClass636_8138.anInt8283;
	    aClass636_8146.anInt8281 = aClass636_8138.anInt8281 * 1;
	    aClass636_8146.anInt8282 = aClass636_8138.anInt8282 * 1;
	    aClass636_8146.anInt8278 = 1 * aClass636_8138.anInt8278;
	}
    }
    
    void method10253(Class546 class546, Class182 class182, long l) {
	for (Class531_Sub5_Sub1_Sub1 class531_sub5_sub1_sub1
		 = ((Class531_Sub5_Sub1_Sub1)
		    aClass708_8134.method14328(-1174227854));
	     class531_sub5_sub1_sub1 != null;
	     class531_sub5_sub1_sub1
		 = ((Class531_Sub5_Sub1_Sub1)
		    aClass708_8134.method14337(-1535797806)))
	    class531_sub5_sub1_sub1.method18774(class546, class182, l);
    }
    
    void method10254(Class546 class546, Class182 class182, long l) {
	for (Class531_Sub5_Sub1_Sub1 class531_sub5_sub1_sub1
		 = ((Class531_Sub5_Sub1_Sub1)
		    aClass708_8134.method14328(-1792155909));
	     class531_sub5_sub1_sub1 != null;
	     class531_sub5_sub1_sub1
		 = ((Class531_Sub5_Sub1_Sub1)
		    aClass708_8134.method14337(-236425638)))
	    class531_sub5_sub1_sub1.method18774(class546, class182, l);
    }
    
    static final void method10255(Class683 class683, int i) {
	int i_118_ = (class683.anIntArray8661
		      [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_118_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_118_ >> 16];
	Class75.method1555(class259, class245, class683, (short) -21105);
    }
    
    static final void method10256(Class259 class259, Class683 class683,
				  int i) {
	Class7 class7
	    = class259.method4683(Class7.aClass404_53,
				  client.anInterface50_11252, 2030157131);
	int i_119_ = (class683.anIntArray8661
		      [(class683.anInt8662 -= 1552651121) * 501271953]);
	int i_120_ = (class683.anIntArray8661
		      [(class683.anInt8662 -= 1552651121) * 501271953]);
	int i_121_
	    = class7.method602(class259.aString2667,
			       -1694810043 * class259.anInt2602,
			       class259.anInt2668 * 672478219, i_120_, i_119_,
			       Class229.aClass157Array2364, (byte) -40);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = i_121_;
    }
    
    static final void method10257(Class683 class683, short i) {
	class683.anInt8662 -= 1552651121;
    }
    
    static void method10258(int i, int i_122_, int i_123_) {
	Class525_Sub16_Sub10 class525_sub16_sub10
	    = Class465.method7671(12, (long) i);
	class525_sub16_sub10.method18361((byte) 106);
	class525_sub16_sub10.anInt11817 = -1179952119 * i_122_;
    }
}
