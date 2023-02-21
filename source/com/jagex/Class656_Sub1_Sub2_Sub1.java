/* Class656_Sub1_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class656_Sub1_Sub2_Sub1 extends Class656_Sub1_Sub2
{
    public int anInt12209;
    int anInt12210;
    public int anInt12211;
    public int anInt12212 = -148790743;
    int anInt12213;
    int anInt12214;
    public int anInt12215;
    public Class444 aClass444_12216;
    public int anInt12217 = 1149496885;
    public Class444 aClass444_12218;
    public int anInt12219;
    public Class444 aClass444_12220;
    boolean aBool12221;
    public int anInt12222;
    int anInt12223;
    int anInt12224;
    static Class444 aClass444_12225 = new Class444();
    
    void method18897() {
	anInt12213 = (32 + (int) (Math.random() * 4.0)) * 578726779;
	anInt12223 = (3 + (int) (Math.random() * 2.0)) * -354512795;
	anInt12224 = (16 + (int) (Math.random() * 3.0)) * 1446663671;
	if (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub4_10728
		.method16985(-1197031179)
	    == 1)
	    anInt12214 = (int) (Math.random() * 10.0) * 1150351857;
	else
	    anInt12214 = (int) (Math.random() * 20.0) * 1150351857;
    }
    
    void method18898(int i) {
	anInt12213 = (32 + (int) (Math.random() * 4.0)) * 578726779;
	anInt12223 = (3 + (int) (Math.random() * 2.0)) * -354512795;
	anInt12224 = (16 + (int) (Math.random() * 3.0)) * 1446663671;
	if (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub4_10728
		.method16985(460866085)
	    == 1)
	    anInt12214 = (int) (Math.random() * 10.0) * 1150351857;
	else
	    anInt12214 = (int) (Math.random() * 20.0) * 1150351857;
    }
    
    void method16938(Class182 class182) {
	/* empty */
    }
    
    public Class553 method16953(Class182 class182) {
	return null;
    }
    
    public Class553 method16946(Class182 class182) {
	return null;
    }
    
    public int method16909(byte i) {
	return -10;
    }
    
    Class567 method16917(Class182 class182, int i) {
	Class446 class446 = Class446.method7209(method10818().aClass446_4807);
	Class560 class560
	    = aClass546_10872.method8989(aByte10867,
					 (int) class446.aFloat4895 >> 9,
					 (int) class446.aFloat4897 >> 9,
					 430838776);
	Class656_Sub1_Sub1 class656_sub1_sub1
	    = aClass546_10872.method8974(aByte10867,
					 (int) class446.aFloat4895 >> 9,
					 (int) class446.aFloat4897 >> 9,
					 (byte) -48);
	int i_0_ = 0;
	for (/**/; class560 != null; class560 = class560.aClass560_7546) {
	    if (class560.aClass656_Sub1_Sub3_7547.aBool11927
		&& (class560.aClass656_Sub1_Sub3_7547.method16909((byte) 120)
		    < i_0_))
		i_0_
		    = class560.aClass656_Sub1_Sub3_7547.method16909((byte) 30);
	}
	if (null != class656_sub1_sub1
	    && class656_sub1_sub1.aShort11836 > -i_0_)
	    i_0_ = -class656_sub1_sub1.aShort11836;
	if (anInt12219 * 1047858977 != i_0_) {
	    class446.aFloat4896 += (float) (i_0_ - 1047858977 * anInt12219);
	    method10823(class446);
	    anInt12219 = 430650593 * i_0_;
	}
	Class444 class444 = class182.method3225();
	class444.method7133();
	if (0 == 1047858977 * anInt12219) {
	    boolean bool = false;
	    boolean bool_1_ = false;
	    boolean bool_2_ = false;
	    Class161 class161 = aClass546_10872.aClass161Array7226[aByte10870];
	    int i_3_ = anInt12210 * -354794303 << 1;
	    int i_4_ = i_3_;
	    int i_5_ = -i_3_ / 2;
	    int i_6_ = -i_4_ / 2;
	    int i_7_ = class161.method2619(i_5_ + (int) class446.aFloat4895,
					   (int) class446.aFloat4897 + i_6_,
					   -583061336);
	    int i_8_ = i_3_ / 2;
	    int i_9_ = -i_4_ / 2;
	    int i_10_ = class161.method2619((int) class446.aFloat4895 + i_8_,
					    (int) class446.aFloat4897 + i_9_,
					    1727315592);
	    int i_11_ = -i_3_ / 2;
	    int i_12_ = i_4_ / 2;
	    int i_13_ = class161.method2619((int) class446.aFloat4895 + i_11_,
					    i_12_ + (int) class446.aFloat4897,
					    -332365741);
	    int i_14_ = i_3_ / 2;
	    int i_15_ = i_4_ / 2;
	    int i_16_ = class161.method2619(i_14_ + (int) class446.aFloat4895,
					    (int) class446.aFloat4897 + i_15_,
					    588304534);
	    int i_17_ = i_7_ < i_10_ ? i_7_ : i_10_;
	    int i_18_ = i_13_ < i_16_ ? i_13_ : i_16_;
	    int i_19_ = i_10_ < i_16_ ? i_10_ : i_16_;
	    int i_20_ = i_7_ < i_13_ ? i_7_ : i_13_;
	    if (i_4_ != 0) {
		int i_21_ = ((int) (Math.atan2((double) (i_17_ - i_18_),
					       (double) i_4_)
				    * 2607.5945876176133)
			     & 0x3fff);
		if (0 != i_21_)
		    class444.method7142(1.0F, 0.0F, 0.0F,
					Class436.method7071(i_21_));
	    }
	    if (0 != i_3_) {
		int i_22_ = ((int) (Math.atan2((double) (i_20_ - i_19_),
					       (double) i_3_)
				    * 2607.5945876176133)
			     & 0x3fff);
		if (0 != i_22_)
		    class444.method7142(0.0F, 0.0F, 1.0F,
					Class436.method7071(-i_22_));
	    }
	    int i_23_ = i_16_ + i_7_;
	    if (i_13_ + i_10_ < i_23_)
		i_23_ = i_10_ + i_13_;
	    i_23_ = (i_23_ >> 1) - (int) class446.aFloat4896;
	    if (i_23_ != 0)
		class444.method7147(0.0F, (float) i_23_, 0.0F);
	}
	class446.method7260();
	Class446 class446_24_ = method10818().aClass446_4807;
	class444.method7147(class446_24_.aFloat4895,
			    class446_24_.aFloat4896 - 10.0F,
			    class446_24_.aFloat4897);
	Class567 class567 = Class293.method5303(true, (short) -3582);
	aBool12221 = false;
	anInt12210 = 0;
	if (-1 != 597265379 * anInt12217) {
	    Class179 class179
		= (((Class8)
		    Class313_Sub2.aClass40_Sub22_10106
			.method76(597265379 * anInt12217, -1241046395))
		       .method616
		   (class182, 526336, anInt12215 * 1906509579, null, null,
		    anInt12213 * 1409186739, anInt12223 * 1231659373,
		    1561525191 * anInt12224, -774449391 * anInt12214,
		    -1926691506));
	    if (class179 != null) {
		if (null == aClass444_12218)
		    aClass444_12225.method7133();
		else
		    aClass444_12225.method7154(aClass444_12218);
		aClass444_12225.method7148(class444);
		class179.method2953(aClass444_12225, aClass211Array10869[2],
				    0);
		aBool12221 |= class179.method3017();
		anInt12210 = class179.method2957() * 1483754305;
	    }
	}
	if (-1 != 1490609639 * anInt12212) {
	    Class179 class179
		= (((Class8)
		    Class313_Sub2.aClass40_Sub22_10106
			.method76(anInt12212 * 1490609639, -963209147))
		       .method616
		   (class182, 526336, -1785966649 * anInt12209, null, null,
		    1409186739 * anInt12213, 1231659373 * anInt12223,
		    anInt12224 * 1561525191, anInt12214 * -774449391,
		    -2021003369));
	    if (class179 != null) {
		if (aClass444_12220 == null)
		    aClass444_12225.method7133();
		else
		    aClass444_12225.method7154(aClass444_12220);
		aClass444_12225.method7148(class444);
		class179.method2953(aClass444_12225, aClass211Array10869[1],
				    0);
		aBool12221 |= class179.method3017();
		if (class179.method2957() > anInt12210 * -354794303)
		    anInt12210 = class179.method2957() * 1483754305;
	    }
	}
	Class179 class179
	    = (((Class8) Class313_Sub2.aClass40_Sub22_10106
			     .method76(anInt12222 * 266184859, 1119698522))
		   .method616
	       (class182, 526336, anInt12211 * 947719271, null, null,
		1409186739 * anInt12213, anInt12223 * 1231659373,
		1561525191 * anInt12224, anInt12214 * -774449391,
		-1936802990));
	if (null != class179) {
	    if (aClass444_12216 == null)
		aClass444_12225.method7133();
	    else
		aClass444_12225.method7154(aClass444_12216);
	    aClass444_12225.method7148(class444);
	    class179.method2953(aClass444_12225, aClass211Array10869[0], 0);
	    aBool12221 |= class179.method3017();
	    if (class179.method2957() > -354794303 * anInt12210)
		anInt12210 = class179.method2957() * 1483754305;
	}
	return class567;
    }
    
    public Class553 method16919(Class182 class182, short i) {
	return null;
    }
    
    int method16911(int i) {
	Class8 class8
	    = (Class8) Class313_Sub2.aClass40_Sub22_10106
			   .method76(266184859 * anInt12222, -1139844508);
	int i_25_ = class8.anInt129 * 1485991643;
	if (1490609639 * anInt12212 != -1) {
	    Class8 class8_26_
		= (Class8) Class313_Sub2.aClass40_Sub22_10106
			       .method76(1490609639 * anInt12212, -1531868405);
	    if (1485991643 * class8_26_.anInt129 > i_25_)
		i_25_ = class8_26_.anInt129 * 1485991643;
	}
	if (-1 != anInt12217 * 597265379) {
	    Class8 class8_27_
		= (Class8) Class313_Sub2.aClass40_Sub22_10106
			       .method76(anInt12217 * 597265379, 1782389308);
	    if (1485991643 * class8_27_.anInt129 > i_25_)
		i_25_ = 1485991643 * class8_27_.anInt129;
	}
	return i_25_;
    }
    
    boolean method16910(Class182 class182, int i, int i_28_, byte i_29_) {
	Class444 class444 = class182.method3225();
	class444.method7131(method10818());
	class444.method7147(0.0F, -10.0F, 0.0F);
	Class179 class179
	    = (((Class8) Class313_Sub2.aClass40_Sub22_10106
			     .method76(266184859 * anInt12222, -720601826))
		   .method616
	       (class182, 131072, 947719271 * anInt12211, null, null, 0, 0, 0,
		0, -2144895648));
	if (class179 != null) {
	    if (aClass444_12216 == null)
		aClass444_12225.method7133();
	    else
		aClass444_12225.method7154(aClass444_12216);
	    aClass444_12225.method7148(class444);
	    if (class179.method2954(i, i_28_, aClass444_12225, true, 0))
		return true;
	}
	if (anInt12212 * 1490609639 != -1) {
	    class179 = (((Class8)
			 Class313_Sub2.aClass40_Sub22_10106
			     .method76(1490609639 * anInt12212, -175442886))
			    .method616
			(class182, 131072, anInt12209 * -1785966649, null,
			 null, 0, 0, 0, 0, -2107773633));
	    if (null != class179) {
		if (aClass444_12220 == null)
		    aClass444_12225.method7133();
		else
		    aClass444_12225.method7154(aClass444_12220);
		aClass444_12225.method7148(class444);
		if (class179.method2954(i, i_28_, aClass444_12225, true, 0))
		    return true;
	    }
	}
	if (anInt12217 * 597265379 != -1) {
	    class179
		= (((Class8) Class313_Sub2.aClass40_Sub22_10106
				 .method76(597265379 * anInt12217, 1502547855))
		       .method616
		   (class182, 131072, 1906509579 * anInt12215, null, null, 0,
		    0, 0, 0, -2067533792));
	    if (null != class179) {
		if (aClass444_12218 == null)
		    aClass444_12225.method7133();
		else
		    aClass444_12225.method7154(aClass444_12218);
		aClass444_12225.method7148(class444);
		if (class179.method2954(i, i_28_, aClass444_12225, true, 0))
		    return true;
	    }
	}
	return false;
    }
    
    void method16918(Class182 class182, int i) {
	/* empty */
    }
    
    boolean method16914(int i) {
	return aBool12221;
    }
    
    boolean method16934() {
	return aBool12221;
    }
    
    boolean method16965(Class182 class182, int i, int i_30_) {
	Class444 class444 = class182.method3225();
	class444.method7131(method10818());
	class444.method7147(0.0F, -10.0F, 0.0F);
	Class179 class179
	    = (((Class8) Class313_Sub2.aClass40_Sub22_10106
			     .method76(266184859 * anInt12222, 582784858))
		   .method616
	       (class182, 131072, 947719271 * anInt12211, null, null, 0, 0, 0,
		0, -1992708518));
	if (class179 != null) {
	    if (aClass444_12216 == null)
		aClass444_12225.method7133();
	    else
		aClass444_12225.method7154(aClass444_12216);
	    aClass444_12225.method7148(class444);
	    if (class179.method2954(i, i_30_, aClass444_12225, true, 0))
		return true;
	}
	if (anInt12212 * 1490609639 != -1) {
	    class179 = (((Class8)
			 Class313_Sub2.aClass40_Sub22_10106
			     .method76(1490609639 * anInt12212, 1502398810))
			    .method616
			(class182, 131072, anInt12209 * -1785966649, null,
			 null, 0, 0, 0, 0, -2040806172));
	    if (null != class179) {
		if (aClass444_12220 == null)
		    aClass444_12225.method7133();
		else
		    aClass444_12225.method7154(aClass444_12220);
		aClass444_12225.method7148(class444);
		if (class179.method2954(i, i_30_, aClass444_12225, true, 0))
		    return true;
	    }
	}
	if (anInt12217 * 597265379 != -1) {
	    class179 = (((Class8)
			 Class313_Sub2.aClass40_Sub22_10106
			     .method76(597265379 * anInt12217, -1809381007))
			    .method616
			(class182, 131072, 1906509579 * anInt12215, null, null,
			 0, 0, 0, 0, -2047601199));
	    if (null != class179) {
		if (aClass444_12218 == null)
		    aClass444_12225.method7133();
		else
		    aClass444_12225.method7154(aClass444_12218);
		aClass444_12225.method7148(class444);
		if (class179.method2954(i, i_30_, aClass444_12225, true, 0))
		    return true;
	    }
	}
	return false;
    }
    
    boolean method16930() {
	return aBool12221;
    }
    
    boolean method16931() {
	return aBool12221;
    }
    
    boolean method16932() {
	return aBool12221;
    }
    
    boolean method16933() {
	return aBool12221;
    }
    
    public int method16927() {
	return -10;
    }
    
    void method16963(Class182 class182) {
	/* empty */
    }
    
    public int method16975() {
	return anInt12219 * 1047858977 - method16909((byte) 113);
    }
    
    public int method16935() {
	return -10;
    }
    
    public Class656_Sub1_Sub2_Sub1(Class546 class546, int i, int i_31_,
				   int i_32_, int i_33_, int i_34_) {
	super(class546, i, i_31_, i_32_, i_33_, i_34_);
	aClass444_12216 = null;
	aClass444_12220 = null;
	aClass444_12218 = null;
	anInt12219 = 0;
	anInt12210 = 0;
	aBool12221 = false;
	method16961(3, -16711936);
	method18898(786316014);
    }
    
    boolean method16939(Class182 class182, int i, int i_35_) {
	Class444 class444 = class182.method3225();
	class444.method7131(method10818());
	class444.method7147(0.0F, -10.0F, 0.0F);
	Class179 class179
	    = (((Class8) Class313_Sub2.aClass40_Sub22_10106
			     .method76(266184859 * anInt12222, 9671464))
		   .method616
	       (class182, 131072, 947719271 * anInt12211, null, null, 0, 0, 0,
		0, -2080136401));
	if (class179 != null) {
	    if (aClass444_12216 == null)
		aClass444_12225.method7133();
	    else
		aClass444_12225.method7154(aClass444_12216);
	    aClass444_12225.method7148(class444);
	    if (class179.method2954(i, i_35_, aClass444_12225, true, 0))
		return true;
	}
	if (anInt12212 * 1490609639 != -1) {
	    class179 = (((Class8)
			 Class313_Sub2.aClass40_Sub22_10106
			     .method76(1490609639 * anInt12212, 1248532950))
			    .method616
			(class182, 131072, anInt12209 * -1785966649, null,
			 null, 0, 0, 0, 0, -1927724817));
	    if (null != class179) {
		if (aClass444_12220 == null)
		    aClass444_12225.method7133();
		else
		    aClass444_12225.method7154(aClass444_12220);
		aClass444_12225.method7148(class444);
		if (class179.method2954(i, i_35_, aClass444_12225, true, 0))
		    return true;
	    }
	}
	if (anInt12217 * 597265379 != -1) {
	    class179
		= (((Class8) Class313_Sub2.aClass40_Sub22_10106
				 .method76(597265379 * anInt12217, 188292277))
		       .method616
		   (class182, 131072, 1906509579 * anInt12215, null, null, 0,
		    0, 0, 0, -2038267861));
	    if (null != class179) {
		if (aClass444_12218 == null)
		    aClass444_12225.method7133();
		else
		    aClass444_12225.method7154(aClass444_12218);
		aClass444_12225.method7148(class444);
		if (class179.method2954(i, i_35_, aClass444_12225, true, 0))
		    return true;
	    }
	}
	return false;
    }
    
    boolean method16940(Class182 class182, int i, int i_36_) {
	Class444 class444 = class182.method3225();
	class444.method7131(method10818());
	class444.method7147(0.0F, -10.0F, 0.0F);
	Class179 class179
	    = (((Class8) Class313_Sub2.aClass40_Sub22_10106
			     .method76(266184859 * anInt12222, 944830209))
		   .method616
	       (class182, 131072, 947719271 * anInt12211, null, null, 0, 0, 0,
		0, -1967187345));
	if (class179 != null) {
	    if (aClass444_12216 == null)
		aClass444_12225.method7133();
	    else
		aClass444_12225.method7154(aClass444_12216);
	    aClass444_12225.method7148(class444);
	    if (class179.method2954(i, i_36_, aClass444_12225, true, 0))
		return true;
	}
	if (anInt12212 * 1490609639 != -1) {
	    class179 = (((Class8)
			 Class313_Sub2.aClass40_Sub22_10106
			     .method76(1490609639 * anInt12212, 1019565834))
			    .method616
			(class182, 131072, anInt12209 * -1785966649, null,
			 null, 0, 0, 0, 0, -1960480734));
	    if (null != class179) {
		if (aClass444_12220 == null)
		    aClass444_12225.method7133();
		else
		    aClass444_12225.method7154(aClass444_12220);
		aClass444_12225.method7148(class444);
		if (class179.method2954(i, i_36_, aClass444_12225, true, 0))
		    return true;
	    }
	}
	if (anInt12217 * 597265379 != -1) {
	    class179 = (((Class8)
			 Class313_Sub2.aClass40_Sub22_10106
			     .method76(597265379 * anInt12217, -1424585288))
			    .method616
			(class182, 131072, 1906509579 * anInt12215, null, null,
			 0, 0, 0, 0, -2009447136));
	    if (null != class179) {
		if (aClass444_12218 == null)
		    aClass444_12225.method7133();
		else
		    aClass444_12225.method7154(aClass444_12218);
		aClass444_12225.method7148(class444);
		if (class179.method2954(i, i_36_, aClass444_12225, true, 0))
		    return true;
	    }
	}
	return false;
    }
    
    boolean method16948() {
	return false;
    }
    
    boolean method16949() {
	return false;
    }
    
    boolean method16950() {
	return false;
    }
    
    public int method16936(int i) {
	return anInt12219 * 1047858977 - method16909((byte) 9);
    }
    
    boolean method16964() {
	return false;
    }
    
    public Class553 method16955(Class182 class182) {
	return null;
    }
    
    public Class553 method16954(Class182 class182) {
	return null;
    }
    
    public static Class444 method18899() {
	Class444 class444 = new Class444();
	class444.method7141(0.0F, 1.0F, 0.0F,
			    (float) (Math.random() * 3.141592653589793 * 2.0));
	float f = (float) (0.5 + 0.5 * Math.random()) * 256.0F;
	class444.method7147(f - 128.0F, 0.0F, 0.0F);
	class444.method7142(0.0F, 1.0F, 0.0F,
			    (float) (Math.random() * 3.141592653589793 * 2.0));
	return class444;
    }
    
    Class567 method16921(Class182 class182) {
	Class446 class446 = Class446.method7209(method10818().aClass446_4807);
	Class560 class560
	    = aClass546_10872.method8989(aByte10867,
					 (int) class446.aFloat4895 >> 9,
					 (int) class446.aFloat4897 >> 9,
					 -1821764701);
	Class656_Sub1_Sub1 class656_sub1_sub1
	    = aClass546_10872.method8974(aByte10867,
					 (int) class446.aFloat4895 >> 9,
					 (int) class446.aFloat4897 >> 9,
					 (byte) -7);
	int i = 0;
	for (/**/; class560 != null; class560 = class560.aClass560_7546) {
	    if (class560.aClass656_Sub1_Sub3_7547.aBool11927
		&& (class560.aClass656_Sub1_Sub3_7547.method16909((byte) 122)
		    < i))
		i = class560.aClass656_Sub1_Sub3_7547.method16909((byte) 44);
	}
	if (null != class656_sub1_sub1 && class656_sub1_sub1.aShort11836 > -i)
	    i = -class656_sub1_sub1.aShort11836;
	if (anInt12219 * 1047858977 != i) {
	    class446.aFloat4896 += (float) (i - 1047858977 * anInt12219);
	    method10823(class446);
	    anInt12219 = 430650593 * i;
	}
	Class444 class444 = class182.method3225();
	class444.method7133();
	if (0 == 1047858977 * anInt12219) {
	    boolean bool = false;
	    boolean bool_37_ = false;
	    boolean bool_38_ = false;
	    Class161 class161 = aClass546_10872.aClass161Array7226[aByte10870];
	    int i_39_ = anInt12210 * -354794303 << 1;
	    int i_40_ = i_39_;
	    int i_41_ = -i_39_ / 2;
	    int i_42_ = -i_40_ / 2;
	    int i_43_ = class161.method2619(i_41_ + (int) class446.aFloat4895,
					    (int) class446.aFloat4897 + i_42_,
					    -2049173297);
	    int i_44_ = i_39_ / 2;
	    int i_45_ = -i_40_ / 2;
	    int i_46_ = class161.method2619((int) class446.aFloat4895 + i_44_,
					    (int) class446.aFloat4897 + i_45_,
					    1397901510);
	    int i_47_ = -i_39_ / 2;
	    int i_48_ = i_40_ / 2;
	    int i_49_ = class161.method2619((int) class446.aFloat4895 + i_47_,
					    i_48_ + (int) class446.aFloat4897,
					    1118852017);
	    int i_50_ = i_39_ / 2;
	    int i_51_ = i_40_ / 2;
	    int i_52_ = class161.method2619(i_50_ + (int) class446.aFloat4895,
					    (int) class446.aFloat4897 + i_51_,
					    -646860118);
	    int i_53_ = i_43_ < i_46_ ? i_43_ : i_46_;
	    int i_54_ = i_49_ < i_52_ ? i_49_ : i_52_;
	    int i_55_ = i_46_ < i_52_ ? i_46_ : i_52_;
	    int i_56_ = i_43_ < i_49_ ? i_43_ : i_49_;
	    if (i_40_ != 0) {
		int i_57_ = ((int) (Math.atan2((double) (i_53_ - i_54_),
					       (double) i_40_)
				    * 2607.5945876176133)
			     & 0x3fff);
		if (0 != i_57_)
		    class444.method7142(1.0F, 0.0F, 0.0F,
					Class436.method7071(i_57_));
	    }
	    if (0 != i_39_) {
		int i_58_ = ((int) (Math.atan2((double) (i_56_ - i_55_),
					       (double) i_39_)
				    * 2607.5945876176133)
			     & 0x3fff);
		if (0 != i_58_)
		    class444.method7142(0.0F, 0.0F, 1.0F,
					Class436.method7071(-i_58_));
	    }
	    int i_59_ = i_52_ + i_43_;
	    if (i_49_ + i_46_ < i_59_)
		i_59_ = i_46_ + i_49_;
	    i_59_ = (i_59_ >> 1) - (int) class446.aFloat4896;
	    if (i_59_ != 0)
		class444.method7147(0.0F, (float) i_59_, 0.0F);
	}
	class446.method7260();
	Class446 class446_60_ = method10818().aClass446_4807;
	class444.method7147(class446_60_.aFloat4895,
			    class446_60_.aFloat4896 - 10.0F,
			    class446_60_.aFloat4897);
	Class567 class567 = Class293.method5303(true, (short) 1451);
	aBool12221 = false;
	anInt12210 = 0;
	if (-1 != 597265379 * anInt12217) {
	    Class179 class179
		= (((Class8) Class313_Sub2.aClass40_Sub22_10106
				 .method76(597265379 * anInt12217, 1431933957))
		       .method616
		   (class182, 526336, anInt12215 * 1906509579, null, null,
		    anInt12213 * 1409186739, anInt12223 * 1231659373,
		    1561525191 * anInt12224, -774449391 * anInt12214,
		    -1931750446));
	    if (class179 != null) {
		if (null == aClass444_12218)
		    aClass444_12225.method7133();
		else
		    aClass444_12225.method7154(aClass444_12218);
		aClass444_12225.method7148(class444);
		class179.method2953(aClass444_12225, aClass211Array10869[2],
				    0);
		aBool12221 |= class179.method3017();
		anInt12210 = class179.method2957() * 1483754305;
	    }
	}
	if (-1 != 1490609639 * anInt12212) {
	    Class179 class179
		= (((Class8) Class313_Sub2.aClass40_Sub22_10106
				 .method76(anInt12212 * 1490609639, 935125060))
		       .method616
		   (class182, 526336, -1785966649 * anInt12209, null, null,
		    1409186739 * anInt12213, 1231659373 * anInt12223,
		    anInt12224 * 1561525191, anInt12214 * -774449391,
		    -2107298607));
	    if (class179 != null) {
		if (aClass444_12220 == null)
		    aClass444_12225.method7133();
		else
		    aClass444_12225.method7154(aClass444_12220);
		aClass444_12225.method7148(class444);
		class179.method2953(aClass444_12225, aClass211Array10869[1],
				    0);
		aBool12221 |= class179.method3017();
		if (class179.method2957() > anInt12210 * -354794303)
		    anInt12210 = class179.method2957() * 1483754305;
	    }
	}
	Class179 class179
	    = (((Class8) Class313_Sub2.aClass40_Sub22_10106
			     .method76(anInt12222 * 266184859, 1123901865))
		   .method616
	       (class182, 526336, anInt12211 * 947719271, null, null,
		1409186739 * anInt12213, anInt12223 * 1231659373,
		1561525191 * anInt12224, anInt12214 * -774449391,
		-2089764283));
	if (null != class179) {
	    if (aClass444_12216 == null)
		aClass444_12225.method7133();
	    else
		aClass444_12225.method7154(aClass444_12216);
	    aClass444_12225.method7148(class444);
	    class179.method2953(aClass444_12225, aClass211Array10869[0], 0);
	    aBool12221 |= class179.method3017();
	    if (class179.method2957() > -354794303 * anInt12210)
		anInt12210 = class179.method2957() * 1483754305;
	}
	return class567;
    }
    
    boolean method16913(int i) {
	return false;
    }
    
    void method18900() {
	anInt12213 = (32 + (int) (Math.random() * 4.0)) * 578726779;
	anInt12223 = (3 + (int) (Math.random() * 2.0)) * -354512795;
	anInt12224 = (16 + (int) (Math.random() * 3.0)) * 1446663671;
	if (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub4_10728
		.method16985(-1469982576)
	    == 1)
	    anInt12214 = (int) (Math.random() * 10.0) * 1150351857;
	else
	    anInt12214 = (int) (Math.random() * 20.0) * 1150351857;
    }
    
    void method18901() {
	anInt12213 = (32 + (int) (Math.random() * 4.0)) * 578726779;
	anInt12223 = (3 + (int) (Math.random() * 2.0)) * -354512795;
	anInt12224 = (16 + (int) (Math.random() * 3.0)) * 1446663671;
	if (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub4_10728
		.method16985(1553374102)
	    == 1)
	    anInt12214 = (int) (Math.random() * 10.0) * 1150351857;
	else
	    anInt12214 = (int) (Math.random() * 20.0) * 1150351857;
    }
    
    boolean method16929() {
	return aBool12221;
    }
    
    int method16960() {
	Class8 class8
	    = (Class8) Class313_Sub2.aClass40_Sub22_10106
			   .method76(266184859 * anInt12222, 463142783);
	int i = class8.anInt129 * 1485991643;
	if (1490609639 * anInt12212 != -1) {
	    Class8 class8_61_
		= (Class8) Class313_Sub2.aClass40_Sub22_10106
			       .method76(1490609639 * anInt12212, 2005687316);
	    if (1485991643 * class8_61_.anInt129 > i)
		i = class8_61_.anInt129 * 1485991643;
	}
	if (-1 != anInt12217 * 597265379) {
	    Class8 class8_62_
		= (Class8) Class313_Sub2.aClass40_Sub22_10106
			       .method76(anInt12217 * 597265379, -403788261);
	    if (1485991643 * class8_62_.anInt129 > i)
		i = 1485991643 * class8_62_.anInt129;
	}
	return i;
    }
}
