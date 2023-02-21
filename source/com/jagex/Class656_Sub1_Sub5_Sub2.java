/* Class656_Sub1_Sub5_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class656_Sub1_Sub5_Sub2 extends Class656_Sub1_Sub5
    implements Interface62
{
    static int[] anIntArray12083 = { 1, 2, 4, 8 };
    static int[] anIntArray12084 = { 16, 32, 64, 128 };
    boolean aBool12085;
    Class179 aClass179_12086;
    Class40_Sub11 aClass40_Sub11_12087;
    Class553 aClass553_12088;
    int anInt12089;
    byte aByte12090;
    byte aByte12091;
    boolean aBool12092;
    boolean aBool12093;
    Class525_Sub16_Sub17 aClass525_Sub16_Sub17_12094;
    boolean aBool12095;
    
    boolean method16957() {
	return aBool12085;
    }
    
    boolean method16931() {
	if (null != aClass179_12086)
	    return aClass179_12086.method3017();
	return false;
    }
    
    boolean method16914(int i) {
	if (null != aClass179_12086)
	    return aClass179_12086.method3017();
	return false;
    }
    
    boolean method16950() {
	if (null != aClass179_12086)
	    return !aClass179_12086.method2977();
	return true;
    }
    
    Class179 method18742(Class182 class182, int i, int i_0_) {
	if (null != aClass179_12086
	    && class182.method3321(aClass179_12086.method2928(), i) == 0)
	    return aClass179_12086;
	Class20 class20 = method18744(class182, i, false, -1607498334);
	if (null != class20)
	    return (Class179) class20.anObject207;
	return null;
    }
    
    public boolean method396(int i) {
	return aBool12095;
    }
    
    public Class553 method16919(Class182 class182, short i) {
	Class446 class446 = method10818().aClass446_4807;
	if (null == aClass553_12088)
	    aClass553_12088
		= Class103.method1893((int) class446.aFloat4895,
				      (int) class446.aFloat4896,
				      (int) class446.aFloat4897,
				      method18742(class182, 0, 329442965),
				      -650409126);
	return aClass553_12088;
    }
    
    Class567 method16917(Class182 class182, int i) {
	if (aClass179_12086 == null)
	    return null;
	Class444 class444 = method10826();
	Class567 class567 = Class293.method5303(aBool12093, (short) 469);
	Class443 class443
	    = (((Class602)
		aClass40_Sub11_12087.method76(-1418628989 * anInt12089,
					      -653201702))
	       .aClass443_7920);
	if (null != class443) {
	    aClass179_12086.method2953(class444, null, 0);
	    class182.method3371(class444, aClass211Array10869[0], class443);
	} else
	    aClass179_12086.method2953(class444, aClass211Array10869[0], 0);
	return class567;
    }
    
    void method16918(Class182 class182, int i) {
	/* empty */
    }
    
    boolean method16910(Class182 class182, int i, int i_1_, byte i_2_) {
	Class443 class443
	    = (((Class602)
		aClass40_Sub11_12087.method76(-1418628989 * anInt12089,
					      1148757617))
	       .aClass443_7920);
	if (null != class443)
	    return class182.method3414(i, i_1_, method10826(), class443,
				       (byte) -93);
	Class179 class179 = method18742(class182, 131072, 383238078);
	if (null != class179) {
	    Class444 class444 = method10826();
	    return class179.method2954(i, i_1_, class444, false, 0);
	}
	return false;
    }
    
    boolean method16912(int i) {
	return aBool12085;
    }
    
    void method16915(Class182 class182, Class656_Sub1 class656_sub1, int i,
		     int i_3_, int i_4_, boolean bool, int i_5_) {
	if (class656_sub1 instanceof Class656_Sub1_Sub5_Sub2) {
	    Class656_Sub1_Sub5_Sub2 class656_sub1_sub5_sub2_6_
		= (Class656_Sub1_Sub5_Sub2) class656_sub1;
	    if (aClass179_12086 != null
		&& null != class656_sub1_sub5_sub2_6_.aClass179_12086)
		aClass179_12086.method3019((class656_sub1_sub5_sub2_6_
					    .aClass179_12086),
					   i, i_3_, i_4_, bool);
	} else if (class656_sub1 instanceof Class656_Sub1_Sub3_Sub2) {
	    Class656_Sub1_Sub3_Sub2 class656_sub1_sub3_sub2
		= (Class656_Sub1_Sub3_Sub2) class656_sub1;
	    if (null != aClass179_12086
		&& class656_sub1_sub3_sub2.aClass179_12031 != null)
		aClass179_12086.method3019((class656_sub1_sub3_sub2
					    .aClass179_12031),
					   i, i_3_, i_4_, bool);
	}
    }
    
    Class20 method18743(Class182 class182, int i, boolean bool) {
	Class602 class602
	    = ((Class602)
	       aClass40_Sub11_12087.method76(-1418628989 * anInt12089,
					     495645074));
	Class161 class161;
	Class161 class161_7_;
	if (aBool12092) {
	    class161 = aClass546_10872.aClass161Array7249[aByte10870];
	    class161_7_ = aClass546_10872.aClass161Array7215[0];
	} else {
	    class161 = aClass546_10872.aClass161Array7215[aByte10870];
	    if (aByte10870 < 3)
		class161_7_
		    = aClass546_10872.aClass161Array7215[aByte10870 + 1];
	    else
		class161_7_ = null;
	}
	Class446 class446 = method10818().aClass446_4807;
	return class602.method9919(class182, i, aByte12091, aByte12090,
				   class161, class161_7_,
				   (int) class446.aFloat4895,
				   (int) class446.aFloat4896,
				   (int) class446.aFloat4897, bool, null,
				   2104288860);
    }
    
    public int method406(byte i) {
	return anInt12089 * -1418628989;
    }
    
    public int method72(int i) {
	return aByte12091;
    }
    
    public void method408(Class182 class182) {
	Object object = null;
	Class525_Sub16_Sub17 class525_sub16_sub17;
	if (aClass525_Sub16_Sub17_12094 == null && aBool12095) {
	    Class20 class20 = method18744(class182, 262144, true, 1608048216);
	    class525_sub16_sub17
		= (Class525_Sub16_Sub17) (null != class20 ? class20.anObject208
					  : null);
	} else {
	    class525_sub16_sub17 = aClass525_Sub16_Sub17_12094;
	    aClass525_Sub16_Sub17_12094 = null;
	}
	Class446 class446 = method10818().aClass446_4807;
	if (null != class525_sub16_sub17)
	    aClass546_10872.method8984(class525_sub16_sub17, aByte10870,
				       (int) class446.aFloat4895,
				       (int) class446.aFloat4897, null,
				       (short) 18958);
    }
    
    public void method395(int i) {
	if (null != aClass179_12086)
	    aClass179_12086.method2929();
    }
    
    public boolean method394(byte i) {
	return true;
    }
    
    public void method410(Class182 class182) {
	Object object = null;
	Class525_Sub16_Sub17 class525_sub16_sub17;
	if (aClass525_Sub16_Sub17_12094 == null && aBool12095) {
	    Class20 class20 = method18744(class182, 262144, true, 1563380725);
	    class525_sub16_sub17
		= (Class525_Sub16_Sub17) (null != class20 ? class20.anObject208
					  : null);
	} else {
	    class525_sub16_sub17 = aClass525_Sub16_Sub17_12094;
	    aClass525_Sub16_Sub17_12094 = null;
	}
	Class446 class446 = method10818().aClass446_4807;
	if (null != class525_sub16_sub17)
	    aClass546_10872.method8984(class525_sub16_sub17, aByte10870,
				       (int) class446.aFloat4895,
				       (int) class446.aFloat4897, null,
				       (short) -29032);
    }
    
    public void method404(Class182 class182, short i) {
	Object object = null;
	Class525_Sub16_Sub17 class525_sub16_sub17;
	if (aClass525_Sub16_Sub17_12094 == null && aBool12095) {
	    Class20 class20 = method18744(class182, 262144, true, -104122002);
	    class525_sub16_sub17
		= (Class525_Sub16_Sub17) (null != class20 ? class20.anObject208
					  : null);
	} else {
	    class525_sub16_sub17 = aClass525_Sub16_Sub17_12094;
	    aClass525_Sub16_Sub17_12094 = null;
	}
	Class446 class446 = method10818().aClass446_4807;
	if (null != class525_sub16_sub17)
	    aClass546_10872.method8984(class525_sub16_sub17, aByte10870,
				       (int) class446.aFloat4895,
				       (int) class446.aFloat4897, null,
				       (short) 4830);
    }
    
    public void method407(Class182 class182) {
	Object object = null;
	Class525_Sub16_Sub17 class525_sub16_sub17;
	if (aClass525_Sub16_Sub17_12094 == null && aBool12095) {
	    Class20 class20 = method18744(class182, 262144, true, -552928950);
	    class525_sub16_sub17
		= (Class525_Sub16_Sub17) (null != class20 ? class20.anObject208
					  : null);
	} else {
	    class525_sub16_sub17 = aClass525_Sub16_Sub17_12094;
	    aClass525_Sub16_Sub17_12094 = null;
	}
	Class446 class446 = method10818().aClass446_4807;
	if (null != class525_sub16_sub17)
	    aClass546_10872.method8984(class525_sub16_sub17, aByte10870,
				       (int) class446.aFloat4895,
				       (int) class446.aFloat4897, null,
				       (short) 6355);
    }
    
    public Class656_Sub1_Sub5_Sub2
	(Class546 class546, Class182 class182, Class40_Sub11 class40_sub11,
	 Class602 class602, int i, int i_8_, int i_9_, int i_10_, int i_11_,
	 boolean bool, int i_12_, int i_13_, boolean bool_14_) {
	super(class546, i_9_, i_10_, i_11_, i, i_8_,
	      Class252.method4514(i_12_, i_13_, (byte) 0));
	aClass40_Sub11_12087 = class40_sub11;
	anInt12089 = class602.anInt7894 * -187913699;
	aBool12092 = bool;
	aByte12091 = (byte) i_12_;
	aByte12090 = (byte) i_13_;
	aBool12093 = 1700857535 * class602.anInt7888 != 0 && !bool;
	aBool12085 = bool_14_;
	aBool12095
	    = (class182.method3345() && class602.aBool7926 && !aBool12092
	       && Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub15_10715
		      .method17108(1102631134) != 0);
	int i_15_ = 2048;
	if (aBool12085)
	    i_15_ |= 0x10000;
	if (class602.aBool7937)
	    i_15_ |= 0x80000;
	Class20 class20 = method18744(class182, i_15_, aBool12095, 558770063);
	if (null != class20) {
	    aClass179_12086 = (Class179) class20.anObject207;
	    aClass525_Sub16_Sub17_12094
		= (Class525_Sub16_Sub17) class20.anObject208;
	    if (aBool12085 || class602.aBool7937) {
		aClass179_12086
		    = aClass179_12086.method2926((byte) 0, i_15_, false);
		if (class602.aBool7937) {
		    Class518 class518
			= client.aClass507_11137.method8354((byte) 11);
		    aClass179_12086.method2974(1718565115 * class518.anInt7062,
					       class518.anInt7060 * 460484831,
					       class518.anInt7061 * 2040007593,
					       (class518.anInt7059
						* -1037372749));
		}
	    }
	}
	method16961(1, -16711936);
    }
    
    public int method77() {
	return anInt12089 * -1418628989;
    }
    
    boolean method16944() {
	return aBool12085;
    }
    
    public int method83() {
	return anInt12089 * -1418628989;
    }
    
    public boolean method289() {
	return aBool12095;
    }
    
    public boolean method403() {
	return true;
    }
    
    public int method401() {
	return aByte12090;
    }
    
    public int method402() {
	return aByte12090;
    }
    
    public int method392() {
	return aByte12090;
    }
    
    public void method353() {
	if (null != aClass179_12086)
	    aClass179_12086.method2929();
    }
    
    public void method200() {
	if (null != aClass179_12086)
	    aClass179_12086.method2929();
    }
    
    boolean method16945() {
	return aBool12085;
    }
    
    public boolean method405() {
	return true;
    }
    
    public int method71() {
	return anInt12089 * -1418628989;
    }
    
    public int method399() {
	return aByte12091;
    }
    
    Class20 method18744(Class182 class182, int i, boolean bool, int i_16_) {
	Class602 class602
	    = ((Class602)
	       aClass40_Sub11_12087.method76(-1418628989 * anInt12089,
					     -596598438));
	Class161 class161;
	Class161 class161_17_;
	if (aBool12092) {
	    class161 = aClass546_10872.aClass161Array7249[aByte10870];
	    class161_17_ = aClass546_10872.aClass161Array7215[0];
	} else {
	    class161 = aClass546_10872.aClass161Array7215[aByte10870];
	    if (aByte10870 < 3)
		class161_17_
		    = aClass546_10872.aClass161Array7215[aByte10870 + 1];
	    else
		class161_17_ = null;
	}
	Class446 class446 = method10818().aClass446_4807;
	return class602.method9919(class182, i, aByte12091, aByte12090,
				   class161, class161_17_,
				   (int) class446.aFloat4895,
				   (int) class446.aFloat4896,
				   (int) class446.aFloat4897, bool, null,
				   2071251671);
    }
    
    public void method409(Class182 class182) {
	Object object = null;
	Class525_Sub16_Sub17 class525_sub16_sub17;
	if (aClass525_Sub16_Sub17_12094 == null && aBool12095) {
	    Class20 class20 = method18744(class182, 262144, true, -945118842);
	    class525_sub16_sub17
		= (Class525_Sub16_Sub17) (null != class20 ? class20.anObject208
					  : null);
	} else {
	    class525_sub16_sub17 = aClass525_Sub16_Sub17_12094;
	    aClass525_Sub16_Sub17_12094 = null;
	}
	Class446 class446 = method10818().aClass446_4807;
	if (null != class525_sub16_sub17)
	    aClass546_10872.method8984(class525_sub16_sub17, aByte10870,
				       (int) class446.aFloat4895,
				       (int) class446.aFloat4897, null,
				       (short) 12019);
    }
    
    boolean method16949() {
	if (null != aClass179_12086)
	    return !aClass179_12086.method2977();
	return true;
    }
    
    boolean method16964() {
	if (null != aClass179_12086)
	    return !aClass179_12086.method2977();
	return true;
    }
    
    public void method412(Class182 class182) {
	Object object = null;
	Class525_Sub16_Sub17 class525_sub16_sub17;
	if (null == aClass525_Sub16_Sub17_12094 && aBool12095) {
	    Class20 class20 = method18744(class182, 262144, true, -386008487);
	    class525_sub16_sub17
		= (Class525_Sub16_Sub17) (null != class20 ? class20.anObject208
					  : null);
	} else {
	    class525_sub16_sub17 = aClass525_Sub16_Sub17_12094;
	    aClass525_Sub16_Sub17_12094 = null;
	}
	Class446 class446 = method10818().aClass446_4807;
	if (class525_sub16_sub17 != null)
	    aClass546_10872.method9039(class525_sub16_sub17, aByte10870,
				       (int) class446.aFloat4895,
				       (int) class446.aFloat4897, null,
				       901667682);
    }
    
    public void method397(Class182 class182) {
	Object object = null;
	Class525_Sub16_Sub17 class525_sub16_sub17;
	if (null == aClass525_Sub16_Sub17_12094 && aBool12095) {
	    Class20 class20 = method18744(class182, 262144, true, -1981836918);
	    class525_sub16_sub17
		= (Class525_Sub16_Sub17) (null != class20 ? class20.anObject208
					  : null);
	} else {
	    class525_sub16_sub17 = aClass525_Sub16_Sub17_12094;
	    aClass525_Sub16_Sub17_12094 = null;
	}
	Class446 class446 = method10818().aClass446_4807;
	if (class525_sub16_sub17 != null)
	    aClass546_10872.method9039(class525_sub16_sub17, aByte10870,
				       (int) class446.aFloat4895,
				       (int) class446.aFloat4897, null,
				       755628160);
    }
    
    boolean method16934() {
	if (null != aClass179_12086)
	    return aClass179_12086.method3017();
	return false;
    }
    
    boolean method16929() {
	if (null != aClass179_12086)
	    return aClass179_12086.method3017();
	return false;
    }
    
    public boolean method398() {
	return true;
    }
    
    public int method16909(byte i) {
	return aClass179_12086 != null ? aClass179_12086.method2960() : 0;
    }
    
    boolean method16930() {
	if (null != aClass179_12086)
	    return aClass179_12086.method3017();
	return false;
    }
    
    boolean method16933() {
	if (null != aClass179_12086)
	    return aClass179_12086.method3017();
	return false;
    }
    
    public int method16927() {
	return aClass179_12086 != null ? aClass179_12086.method2960() : 0;
    }
    
    public int method16935() {
	return aClass179_12086 != null ? aClass179_12086.method2960() : 0;
    }
    
    void method16963(Class182 class182) {
	/* empty */
    }
    
    public void method393(Class182 class182, int i) {
	Object object = null;
	Class525_Sub16_Sub17 class525_sub16_sub17;
	if (null == aClass525_Sub16_Sub17_12094 && aBool12095) {
	    Class20 class20 = method18744(class182, 262144, true, -2036210759);
	    class525_sub16_sub17
		= (Class525_Sub16_Sub17) (null != class20 ? class20.anObject208
					  : null);
	} else {
	    class525_sub16_sub17 = aClass525_Sub16_Sub17_12094;
	    aClass525_Sub16_Sub17_12094 = null;
	}
	Class446 class446 = method10818().aClass446_4807;
	if (class525_sub16_sub17 != null)
	    aClass546_10872.method9039(class525_sub16_sub17, aByte10870,
				       (int) class446.aFloat4895,
				       (int) class446.aFloat4897, null,
				       825469486);
    }
    
    boolean method16939(Class182 class182, int i, int i_18_) {
	Class443 class443
	    = (((Class602)
		aClass40_Sub11_12087.method76(-1418628989 * anInt12089,
					      618277492))
	       .aClass443_7920);
	if (null != class443)
	    return class182.method3414(i, i_18_, method10826(), class443,
				       (byte) -55);
	Class179 class179 = method18742(class182, 131072, 1927592785);
	if (null != class179) {
	    Class444 class444 = method10826();
	    return class179.method2954(i, i_18_, class444, false, 0);
	}
	return false;
    }
    
    void method16938(Class182 class182) {
	/* empty */
    }
    
    boolean method16965(Class182 class182, int i, int i_19_) {
	Class443 class443
	    = (((Class602)
		aClass40_Sub11_12087.method76(-1418628989 * anInt12089,
					      364068147))
	       .aClass443_7920);
	if (null != class443)
	    return class182.method3414(i, i_19_, method10826(), class443,
				       (byte) -106);
	Class179 class179 = method18742(class182, 131072, 1279060470);
	if (null != class179) {
	    Class444 class444 = method10826();
	    return class179.method2954(i, i_19_, class444, false, 0);
	}
	return false;
    }
    
    public void method411(Class182 class182) {
	Object object = null;
	Class525_Sub16_Sub17 class525_sub16_sub17;
	if (null == aClass525_Sub16_Sub17_12094 && aBool12095) {
	    Class20 class20 = method18744(class182, 262144, true, -304954066);
	    class525_sub16_sub17
		= (Class525_Sub16_Sub17) (null != class20 ? class20.anObject208
					  : null);
	} else {
	    class525_sub16_sub17 = aClass525_Sub16_Sub17_12094;
	    aClass525_Sub16_Sub17_12094 = null;
	}
	Class446 class446 = method10818().aClass446_4807;
	if (class525_sub16_sub17 != null)
	    aClass546_10872.method9039(class525_sub16_sub17, aByte10870,
				       (int) class446.aFloat4895,
				       (int) class446.aFloat4897, null,
				       1733360054);
    }
    
    boolean method16943() {
	return aBool12085;
    }
    
    boolean method16913(int i) {
	if (null != aClass179_12086)
	    return !aClass179_12086.method2977();
	return true;
    }
    
    public Class553 method16955(Class182 class182) {
	Class446 class446 = method10818().aClass446_4807;
	if (null == aClass553_12088)
	    aClass553_12088
		= Class103.method1893((int) class446.aFloat4895,
				      (int) class446.aFloat4896,
				      (int) class446.aFloat4897,
				      method18742(class182, 0, -1081878421),
				      -650409126);
	return aClass553_12088;
    }
    
    boolean method16932() {
	if (null != aClass179_12086)
	    return aClass179_12086.method3017();
	return false;
    }
    
    void method16951() {
	aBool12085 = false;
	if (aClass179_12086 != null)
	    aClass179_12086
		.method3010(aClass179_12086.method2928() & ~0x10000);
    }
    
    boolean method16948() {
	if (null != aClass179_12086)
	    return !aClass179_12086.method2977();
	return true;
    }
    
    public int method400() {
	return aByte12091;
    }
    
    Class179 method18745(Class182 class182, int i) {
	if (null != aClass179_12086
	    && class182.method3321(aClass179_12086.method2928(), i) == 0)
	    return aClass179_12086;
	Class20 class20 = method18744(class182, i, false, -1641139542);
	if (null != class20)
	    return (Class179) class20.anObject207;
	return null;
    }
    
    void method16968(Class182 class182, Class656_Sub1 class656_sub1, int i,
		     int i_20_, int i_21_, boolean bool) {
	if (class656_sub1 instanceof Class656_Sub1_Sub5_Sub2) {
	    Class656_Sub1_Sub5_Sub2 class656_sub1_sub5_sub2_22_
		= (Class656_Sub1_Sub5_Sub2) class656_sub1;
	    if (aClass179_12086 != null
		&& null != class656_sub1_sub5_sub2_22_.aClass179_12086)
		aClass179_12086.method3019((class656_sub1_sub5_sub2_22_
					    .aClass179_12086),
					   i, i_20_, i_21_, bool);
	} else if (class656_sub1 instanceof Class656_Sub1_Sub3_Sub2) {
	    Class656_Sub1_Sub3_Sub2 class656_sub1_sub3_sub2
		= (Class656_Sub1_Sub3_Sub2) class656_sub1;
	    if (null != aClass179_12086
		&& class656_sub1_sub3_sub2.aClass179_12031 != null)
		aClass179_12086.method3019((class656_sub1_sub3_sub2
					    .aClass179_12031),
					   i, i_20_, i_21_, bool);
	}
    }
    
    public Class553 method16946(Class182 class182) {
	Class446 class446 = method10818().aClass446_4807;
	if (null == aClass553_12088)
	    aClass553_12088
		= Class103.method1893((int) class446.aFloat4895,
				      (int) class446.aFloat4896,
				      (int) class446.aFloat4897,
				      method18742(class182, 0, -446477550),
				      -650409126);
	return aClass553_12088;
    }
    
    public Class553 method16953(Class182 class182) {
	Class446 class446 = method10818().aClass446_4807;
	if (null == aClass553_12088)
	    aClass553_12088
		= Class103.method1893((int) class446.aFloat4895,
				      (int) class446.aFloat4896,
				      (int) class446.aFloat4897,
				      method18742(class182, 0, -228296093),
				      -650409126);
	return aClass553_12088;
    }
    
    public Class553 method16954(Class182 class182) {
	Class446 class446 = method10818().aClass446_4807;
	if (null == aClass553_12088)
	    aClass553_12088
		= Class103.method1893((int) class446.aFloat4895,
				      (int) class446.aFloat4896,
				      (int) class446.aFloat4897,
				      method18742(class182, 0, -215050969),
				      -650409126);
	return aClass553_12088;
    }
    
    public int method413(int i) {
	return aByte12090;
    }
    
    Class567 method16921(Class182 class182) {
	if (aClass179_12086 == null)
	    return null;
	Class444 class444 = method10826();
	Class567 class567 = Class293.method5303(aBool12093, (short) -9237);
	Class443 class443
	    = (((Class602)
		aClass40_Sub11_12087.method76(-1418628989 * anInt12089,
					      1979256127))
	       .aClass443_7920);
	if (null != class443) {
	    aClass179_12086.method2953(class444, null, 0);
	    class182.method3371(class444, aClass211Array10869[0], class443);
	} else
	    aClass179_12086.method2953(class444, aClass211Array10869[0], 0);
	return class567;
    }
    
    static int method18746(int i, int i_23_) {
	if (-1214990409 * Class608.aClass608_7988.anInt7995 == i
	    || i == -1214990409 * Class608.aClass608_7979.anInt7995)
	    return anIntArray12084[i_23_ & 0x3];
	return anIntArray12083[i_23_ & 0x3];
    }
    
    void method16916(int i) {
	aBool12085 = false;
	if (aClass179_12086 != null)
	    aClass179_12086
		.method3010(aClass179_12086.method2928() & ~0x10000);
    }
    
    Class20 method18747(Class182 class182, int i, boolean bool) {
	Class602 class602
	    = ((Class602)
	       aClass40_Sub11_12087.method76(-1418628989 * anInt12089,
					     -119405743));
	Class161 class161;
	Class161 class161_24_;
	if (aBool12092) {
	    class161 = aClass546_10872.aClass161Array7249[aByte10870];
	    class161_24_ = aClass546_10872.aClass161Array7215[0];
	} else {
	    class161 = aClass546_10872.aClass161Array7215[aByte10870];
	    if (aByte10870 < 3)
		class161_24_
		    = aClass546_10872.aClass161Array7215[aByte10870 + 1];
	    else
		class161_24_ = null;
	}
	Class446 class446 = method10818().aClass446_4807;
	return class602.method9919(class182, i, aByte12091, aByte12090,
				   class161, class161_24_,
				   (int) class446.aFloat4895,
				   (int) class446.aFloat4896,
				   (int) class446.aFloat4897, bool, null,
				   1739423085);
    }
    
    boolean method16940(Class182 class182, int i, int i_25_) {
	Class443 class443
	    = (((Class602)
		aClass40_Sub11_12087.method76(-1418628989 * anInt12089,
					      1616566874))
	       .aClass443_7920);
	if (null != class443)
	    return class182.method3414(i, i_25_, method10826(), class443,
				       (byte) -65);
	Class179 class179 = method18742(class182, 131072, 689526728);
	if (null != class179) {
	    Class444 class444 = method10826();
	    return class179.method2954(i, i_25_, class444, false, 0);
	}
	return false;
    }
    
    Class20 method18748(Class182 class182, int i, boolean bool) {
	Class602 class602
	    = ((Class602)
	       aClass40_Sub11_12087.method76(-1418628989 * anInt12089,
					     236803653));
	Class161 class161;
	Class161 class161_26_;
	if (aBool12092) {
	    class161 = aClass546_10872.aClass161Array7249[aByte10870];
	    class161_26_ = aClass546_10872.aClass161Array7215[0];
	} else {
	    class161 = aClass546_10872.aClass161Array7215[aByte10870];
	    if (aByte10870 < 3)
		class161_26_
		    = aClass546_10872.aClass161Array7215[aByte10870 + 1];
	    else
		class161_26_ = null;
	}
	Class446 class446 = method10818().aClass446_4807;
	return class602.method9919(class182, i, aByte12091, aByte12090,
				   class161, class161_26_,
				   (int) class446.aFloat4895,
				   (int) class446.aFloat4896,
				   (int) class446.aFloat4897, bool, null,
				   2129685780);
    }
    
    Class20 method18749(Class182 class182, int i, boolean bool) {
	Class602 class602
	    = ((Class602)
	       aClass40_Sub11_12087.method76(-1418628989 * anInt12089,
					     -756789201));
	Class161 class161;
	Class161 class161_27_;
	if (aBool12092) {
	    class161 = aClass546_10872.aClass161Array7249[aByte10870];
	    class161_27_ = aClass546_10872.aClass161Array7215[0];
	} else {
	    class161 = aClass546_10872.aClass161Array7215[aByte10870];
	    if (aByte10870 < 3)
		class161_27_
		    = aClass546_10872.aClass161Array7215[aByte10870 + 1];
	    else
		class161_27_ = null;
	}
	Class446 class446 = method10818().aClass446_4807;
	return class602.method9919(class182, i, aByte12091, aByte12090,
				   class161, class161_27_,
				   (int) class446.aFloat4895,
				   (int) class446.aFloat4896,
				   (int) class446.aFloat4897, bool, null,
				   1619973708);
    }
    
    static final void method18750(Class683 class683, short i) {
	Class556_Sub1.aBool10639
	    = (class683.anIntArray8661
	       [(class683.anInt8662 -= 1552651121) * 501271953]) == 1;
    }
}
