/* Class656_Sub1_Sub3_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class656_Sub1_Sub3_Sub4 extends Class656_Sub1_Sub3
{
    int anInt12162;
    Class633 aClass633_12163;
    Class689 aClass689_12164;
    int anInt12165;
    int anInt12166;
    boolean aBool12167;
    int anInt12168 = 0;
    
    final void method16915(Class182 class182, Class656_Sub1 class656_sub1,
			   int i, int i_0_, int i_1_, boolean bool, int i_2_) {
	throw new IllegalStateException();
    }
    
    boolean method16933() {
	return aBool12167;
    }
    
    boolean method16914(int i) {
	return aBool12167;
    }
    
    public int method16909(byte i) {
	return anInt12165 * -250498789;
    }
    
    public Class553 method16919(Class182 class182, short i) {
	return null;
    }
    
    boolean method16913(int i) {
	return false;
    }
    
    public int method18833() {
	return anInt12162 * -2113629351;
    }
    
    public final boolean method18834(byte i) {
	return (aClass689_12164 != null
		&& !aClass689_12164.method14030(-1067563755));
    }
    
    public final boolean method18835(byte i) {
	return (aClass689_12164 == null
		|| aClass689_12164.method14039(-1294511230));
    }
    
    public Class656_Sub1_Sub3_Sub4
	(Class546 class546, int i, int i_3_, int i_4_, int i_5_, int i_6_,
	 int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_,
	 int i_13_, boolean bool, int i_14_) {
	super(class546, i_4_, i_5_, i_6_, i_7_, i_8_, i_9_, i_10_, i_11_,
	      i_12_, false, (byte) 0);
	anInt12165 = 0;
	aBool12167 = true;
	anInt12162 = 0;
	anInt12166 = i * 2120068835;
	anInt12168 = -1396445015 * i_13_;
	anInt12162 = 1295811817 * i_14_;
	Class674 class674
	    = ((Class674)
	       Class574.aClass40_Sub20_7645.method76(anInt12166 * 2105476811,
						     589888329));
	int i_15_ = class674.anInt8596 * 1700860103;
	if (i_15_ != -1) {
	    aClass689_12164 = new Class689_Sub2(this, false);
	    int i_16_ = class674.aBool8608 ? 0 : 2;
	    if (bool)
		i_16_ = 1;
	    aClass689_12164.method14082(i_15_, i_3_, i_16_, false, -95525730);
	}
	method16961(1, -16711936);
    }
    
    Class567 method16917(Class182 class182, int i) {
	Class179 class179
	    = method18850(class182,
			  0x800 | (0 != -2130201703 * anInt12168 ? 5 : 0),
			  anInt12166 * 2105476811, (byte) 1);
	if (class179 == null)
	    return null;
	Class444 class444 = method10826();
	method18838(class182, class179, class444, 703466568);
	Class567 class567 = Class293.method5303(false, (short) 7286);
	class179.method2953(class444, aClass211Array10869[0], 0);
	if (null != aClass633_12163) {
	    Class185 class185 = aClass633_12163.method10350();
	    class182.method3412(class185);
	}
	aBool12167 = class179.method3017();
	anInt12165 = class179.method2960() * 1822966035;
	class179.method2957();
	return class567;
    }
    
    public void method18836(int i) {
	if (aClass633_12163 != null)
	    aClass633_12163.method10373();
    }
    
    boolean method16910(Class182 class182, int i, int i_17_, byte i_18_) {
	return false;
    }
    
    public final void method18837(int i) {
	if (aClass689_12164 != null
	    && !aClass689_12164.method14039(-2027457638))
	    aClass689_12164.method14041(i, 1953608358);
    }
    
    void method18838(Class182 class182, Class179 class179, Class444 class444,
		     int i) {
	class179.method2978(class444);
	Class184[] class184s = class179.method2979();
	MagnetConfig[] class154s = class179.method2980();
	if ((null == aClass633_12163 || aClass633_12163.aBool8234)
	    && (class184s != null || class154s != null))
	    aClass633_12163 = Class633.method10348(client.anInt11083, true);
	if (aClass633_12163 != null) {
	    aClass633_12163.method10336(class182, (long) client.anInt11083,
					class184s, class154s, false);
	    aClass633_12163.method10341(aByte10867, aShort11923, aShort11924,
					aShort11925, aShort11930);
	}
    }
    
    final boolean method16912(int i) {
	return false;
    }
    
    Class179 method18839(Class182 class182, int i, int i_19_) {
	Class674 class674
	    = ((Class674)
	       Class574.aClass40_Sub20_7645.method76(i_19_, -257746010));
	Class161 class161 = aClass546_10872.aClass161Array7215[aByte10867];
	Class161 class161_20_
	    = (aByte10870 < 3
	       ? aClass546_10872.aClass161Array7215[1 + aByte10870] : null);
	Class446 class446 = method10818().aClass446_4807;
	return ((null != aClass689_12164
		 && !aClass689_12164.method14039(-845338994))
		? class674.method11099(class182, i, 1033684992 * anInt12168,
				       class161, class161_20_,
				       (int) class446.aFloat4895,
				       (int) class446.aFloat4896,
				       (int) class446.aFloat4897,
				       aClass689_12164, (byte) 2, -1185238456)
		: class674.method11099(class182, i, anInt12168 * 1033684992,
				       class161, class161_20_,
				       (int) class446.aFloat4895,
				       (int) class446.aFloat4896,
				       (int) class446.aFloat4897, null,
				       (byte) 2, -1396849748));
    }
    
    public int method18840(int i) {
	return anInt12162 * -2113629351;
    }
    
    boolean method16934() {
	return aBool12167;
    }
    
    boolean method16929() {
	return aBool12167;
    }
    
    boolean method16930() {
	return aBool12167;
    }
    
    boolean method16931() {
	return aBool12167;
    }
    
    public int method18841() {
	return anInt12162 * -2113629351;
    }
    
    final boolean method16944() {
	return false;
    }
    
    public int method16927() {
	return anInt12165 * -250498789;
    }
    
    public int method16935() {
	return anInt12165 * -250498789;
    }
    
    void method16963(Class182 class182) {
	Class179 class179
	    = method18850(class182, 0, 2105476811 * anInt12166, (byte) 1);
	if (class179 != null)
	    method18838(class182, class179, method10826(), -1345689232);
    }
    
    void method16938(Class182 class182) {
	Class179 class179
	    = method18850(class182, 0, 2105476811 * anInt12166, (byte) 1);
	if (class179 != null)
	    method18838(class182, class179, method10826(), -661865929);
    }
    
    boolean method16939(Class182 class182, int i, int i_21_) {
	return false;
    }
    
    boolean method16940(Class182 class182, int i, int i_22_) {
	return false;
    }
    
    Class179 method18842(Class182 class182, int i, int i_23_) {
	Class674 class674
	    = ((Class674)
	       Class574.aClass40_Sub20_7645.method76(i_23_, -749629725));
	Class161 class161 = aClass546_10872.aClass161Array7215[aByte10867];
	Class161 class161_24_
	    = (aByte10870 < 3
	       ? aClass546_10872.aClass161Array7215[1 + aByte10870] : null);
	Class446 class446 = method10818().aClass446_4807;
	return ((null != aClass689_12164
		 && !aClass689_12164.method14039(-1538715227))
		? class674.method11099(class182, i, 1033684992 * anInt12168,
				       class161, class161_24_,
				       (int) class446.aFloat4895,
				       (int) class446.aFloat4896,
				       (int) class446.aFloat4897,
				       aClass689_12164, (byte) 2, 1826314997)
		: class674.method11099(class182, i, anInt12168 * 1033684992,
				       class161, class161_24_,
				       (int) class446.aFloat4895,
				       (int) class446.aFloat4896,
				       (int) class446.aFloat4897, null,
				       (byte) 2, 832782768));
    }
    
    final boolean method16957() {
	return false;
    }
    
    final boolean method16943() {
	return false;
    }
    
    boolean method16948() {
	return false;
    }
    
    final boolean method16945() {
	return false;
    }
    
    final void method16968(Class182 class182, Class656_Sub1 class656_sub1,
			   int i, int i_25_, int i_26_, boolean bool) {
	throw new IllegalStateException();
    }
    
    final void method16951() {
	throw new IllegalStateException();
    }
    
    void method16918(Class182 class182, int i) {
	Class179 class179
	    = method18850(class182, 0, 2105476811 * anInt12166, (byte) 1);
	if (class179 != null)
	    method18838(class182, class179, method10826(), 911256365);
    }
    
    public final void method18843(int i, int i_27_) {
	if (aClass689_12164 != null
	    && !aClass689_12164.method14039(-291087649))
	    aClass689_12164.method14041(i, 1948221501);
    }
    
    boolean method16950() {
	return false;
    }
    
    boolean method16964() {
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
    
    final void method16916(int i) {
	throw new IllegalStateException();
    }
    
    Class567 method16921(Class182 class182) {
	Class179 class179
	    = method18850(class182,
			  0x800 | (0 != -2130201703 * anInt12168 ? 5 : 0),
			  anInt12166 * 2105476811, (byte) 1);
	if (class179 == null)
	    return null;
	Class444 class444 = method10826();
	method18838(class182, class179, class444, 895236309);
	Class567 class567 = Class293.method5303(false, (short) -12147);
	class179.method2953(class444, aClass211Array10869[0], 0);
	if (null != aClass633_12163) {
	    Class185 class185 = aClass633_12163.method10350();
	    class182.method3412(class185);
	}
	aBool12167 = class179.method3017();
	anInt12165 = class179.method2960() * 1822966035;
	class179.method2957();
	return class567;
    }
    
    public Class553 method16955(Class182 class182) {
	return null;
    }
    
    boolean method16965(Class182 class182, int i, int i_28_) {
	return false;
    }
    
    public int method18844() {
	return anInt12162 * -2113629351;
    }
    
    boolean method16932() {
	return aBool12167;
    }
    
    public final void method18845(int i) {
	if (aClass689_12164 != null
	    && !aClass689_12164.method14039(-307721044))
	    aClass689_12164.method14041(i, 2137331458);
    }
    
    public final void method18846(int i) {
	if (aClass689_12164 != null
	    && !aClass689_12164.method14039(-1125617526))
	    aClass689_12164.method14041(i, 1954202651);
    }
    
    public final boolean method18847() {
	return (aClass689_12164 != null
		&& !aClass689_12164.method14030(-2092699779));
    }
    
    public final boolean method18848() {
	return (aClass689_12164 != null
		&& !aClass689_12164.method14030(-379188836));
    }
    
    public final boolean method18849() {
	return (aClass689_12164 == null
		|| aClass689_12164.method14039(-221671024));
    }
    
    boolean method16949() {
	return false;
    }
    
    Class179 method18850(Class182 class182, int i, int i_29_, byte i_30_) {
	Class674 class674
	    = ((Class674)
	       Class574.aClass40_Sub20_7645.method76(i_29_, -756370409));
	Class161 class161 = aClass546_10872.aClass161Array7215[aByte10867];
	Class161 class161_31_
	    = (aByte10870 < 3
	       ? aClass546_10872.aClass161Array7215[1 + aByte10870] : null);
	Class446 class446 = method10818().aClass446_4807;
	return ((null != aClass689_12164
		 && !aClass689_12164.method14039(-1432326276))
		? class674.method11099(class182, i, 1033684992 * anInt12168,
				       class161, class161_31_,
				       (int) class446.aFloat4895,
				       (int) class446.aFloat4896,
				       (int) class446.aFloat4897,
				       aClass689_12164, (byte) 2, 1437294974)
		: class674.method11099(class182, i, anInt12168 * 1033684992,
				       class161, class161_31_,
				       (int) class446.aFloat4895,
				       (int) class446.aFloat4896,
				       (int) class446.aFloat4897, null,
				       (byte) 2, -2122251115));
    }
    
    void method18851(Class182 class182, Class179 class179, Class444 class444) {
	class179.method2978(class444);
	Class184[] class184s = class179.method2979();
	MagnetConfig[] class154s = class179.method2980();
	if ((null == aClass633_12163 || aClass633_12163.aBool8234)
	    && (class184s != null || class154s != null))
	    aClass633_12163 = Class633.method10348(client.anInt11083, true);
	if (aClass633_12163 != null) {
	    aClass633_12163.method10336(class182, (long) client.anInt11083,
					class184s, class154s, false);
	    aClass633_12163.method10341(aByte10867, aShort11923, aShort11924,
					aShort11925, aShort11930);
	}
    }
    
    void method18852(Class182 class182, Class179 class179, Class444 class444) {
	class179.method2978(class444);
	Class184[] class184s = class179.method2979();
	MagnetConfig[] class154s = class179.method2980();
	if ((null == aClass633_12163 || aClass633_12163.aBool8234)
	    && (class184s != null || class154s != null))
	    aClass633_12163 = Class633.method10348(client.anInt11083, true);
	if (aClass633_12163 != null) {
	    aClass633_12163.method10336(class182, (long) client.anInt11083,
					class184s, class154s, false);
	    aClass633_12163.method10341(aByte10867, aShort11923, aShort11924,
					aShort11925, aShort11930);
	}
    }
    
    public void method18853() {
	if (aClass633_12163 != null)
	    aClass633_12163.method10373();
    }
    
    public void method18854() {
	if (aClass633_12163 != null)
	    aClass633_12163.method10373();
    }
    
    public void method18855() {
	if (aClass633_12163 != null)
	    aClass633_12163.method10373();
    }
}
