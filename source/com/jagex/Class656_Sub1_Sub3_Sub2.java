/* Class656_Sub1_Sub3_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class656_Sub1_Sub3_Sub2 extends Class656_Sub1_Sub3
    implements Interface62
{
    Class179 aClass179_12031;
    boolean aBool12032;
    Class525_Sub16_Sub17 aClass525_Sub16_Sub17_12033;
    Class553 aClass553_12034;
    Class40_Sub11 aClass40_Sub11_12035;
    byte aByte12036;
    byte aByte12037;
    int anInt12038;
    boolean aBool12039;
    boolean aBool12040;
    boolean aBool12041;
    boolean aBool12042;
    
    public Class553 method16955(Class182 class182) {
	Class446 class446 = method10818().aClass446_4807;
	if (null == aClass553_12034)
	    aClass553_12034
		= Class103.method1893((int) class446.aFloat4895,
				      (int) class446.aFloat4896,
				      (int) class446.aFloat4897,
				      method18699(class182, 0, -693270615),
				      -650409126);
	return aClass553_12034;
    }
    
    boolean method16913(int i) {
	if (null != aClass179_12031)
	    return !aClass179_12031.method2977();
	return true;
    }
    
    boolean method16932() {
	if (aClass179_12031 != null)
	    return aClass179_12031.method3017();
	return false;
    }
    
    public int method16909(byte i) {
	return aClass179_12031 != null ? aClass179_12031.method2960() : 0;
    }
    
    boolean method16930() {
	if (aClass179_12031 != null)
	    return aClass179_12031.method3017();
	return false;
    }
    
    Class20 method18697(Class182 class182, int i, boolean bool, int i_0_) {
	ObjectDefinitions class602
	    = (ObjectDefinitions) aClass40_Sub11_12035.method76(2031792897 * anInt12038,
						       1690508150);
	Class161 class161;
	Class161 class161_1_;
	if (aBool12041) {
	    class161 = aClass546_10872.aClass161Array7249[aByte10870];
	    class161_1_ = aClass546_10872.aClass161Array7215[0];
	} else {
	    class161 = aClass546_10872.aClass161Array7215[aByte10870];
	    if (aByte10870 < 3)
		class161_1_
		    = aClass546_10872.aClass161Array7215[aByte10870 + 1];
	    else
		class161_1_ = null;
	}
	Class446 class446 = method10818().aClass446_4807;
	return (class602.method9919
		(class182, i,
		 (aByte12036 != -1214990409 * Class608.aClass608_7997.anInt7995
		  ? (int) aByte12036
		  : Class608.aClass608_7996.anInt7995 * -1214990409),
		 (aByte12036 == -1214990409 * Class608.aClass608_7997.anInt7995
		  ? (int) (aByte12037 + 4) : aByte12037),
		 class161, class161_1_, (int) class446.aFloat4895,
		 (int) class446.aFloat4896, (int) class446.aFloat4897, bool,
		 null, 1922515693));
    }
    
    public void method395(int i) {
	if (null != aClass179_12031)
	    aClass179_12031.method2929();
    }
    
    Class567 method16917(Class182 class182, int i) {
	if (aClass179_12031 == null)
	    return null;
	Class444 class444 = method10826();
	Class567 class567 = Class293.method5303(aBool12039, (short) -21157);
	Class443 class443
	    = (((ObjectDefinitions)
		aClass40_Sub11_12035.method76(anInt12038 * 2031792897,
					      620587155))
	       .aClass443_7920);
	if (null != class443) {
	    aClass179_12031.method2953(class444, null, 0);
	    class182.method3371(class444, aClass211Array10869[0], class443);
	} else
	    aClass179_12031.method2953(class444, aClass211Array10869[0], 0);
	return class567;
    }
    
    void method16918(Class182 class182, int i) {
	/* empty */
    }
    
    boolean method16910(Class182 class182, int i, int i_2_, byte i_3_) {
	Class443 class443
	    = (((ObjectDefinitions)
		aClass40_Sub11_12035.method76(anInt12038 * 2031792897,
					      -645685773))
	       .aClass443_7920);
	if (class443 != null)
	    return class182.method3414(i, i_2_, method10826(), class443,
				       (byte) -11);
	Class179 class179 = method18699(class182, 131072, 1945263574);
	if (class179 != null) {
	    Class444 class444 = method10826();
	    return class179.method2954(i, i_2_, class444, false, 0);
	}
	return false;
    }
    
    boolean method16912(int i) {
	return aBool12040;
    }
    
    void method16915(Class182 class182, Class656_Sub1 class656_sub1, int i,
		     int i_4_, int i_5_, boolean bool, int i_6_) {
	if (class656_sub1 instanceof Class656_Sub1_Sub5_Sub2) {
	    Class656_Sub1_Sub5_Sub2 class656_sub1_sub5_sub2
		= (Class656_Sub1_Sub5_Sub2) class656_sub1;
	    if (aClass179_12031 != null
		&& null != class656_sub1_sub5_sub2.aClass179_12086)
		aClass179_12031.method3019((class656_sub1_sub5_sub2
					    .aClass179_12086),
					   i, i_4_, i_5_, bool);
	} else if (class656_sub1 instanceof Class656_Sub1_Sub3_Sub2) {
	    Class656_Sub1_Sub3_Sub2 class656_sub1_sub3_sub2_7_
		= (Class656_Sub1_Sub3_Sub2) class656_sub1;
	    if (aClass179_12031 != null
		&& null != class656_sub1_sub3_sub2_7_.aClass179_12031)
		aClass179_12031.method3019((class656_sub1_sub3_sub2_7_
					    .aClass179_12031),
					   i, i_4_, i_5_, bool);
	}
    }
    
    void method16916(int i) {
	aBool12040 = false;
	if (aClass179_12031 != null)
	    aClass179_12031
		.method3010(aClass179_12031.method2928() & ~0x10000);
    }
    
    public int method392() {
	return aByte12037;
    }
    
    public int method72(int i) {
	return aByte12036;
    }
    
    boolean method16914(int i) {
	if (aClass179_12031 != null)
	    return aClass179_12031.method3017();
	return false;
    }
    
    boolean method16939(Class182 class182, int i, int i_8_) {
	Class443 class443
	    = (((ObjectDefinitions)
		aClass40_Sub11_12035.method76(anInt12038 * 2031792897,
					      490542719))
	       .aClass443_7920);
	if (class443 != null)
	    return class182.method3414(i, i_8_, method10826(), class443,
				       (byte) -126);
	Class179 class179 = method18699(class182, 131072, 1257493798);
	if (class179 != null) {
	    Class444 class444 = method10826();
	    return class179.method2954(i, i_8_, class444, false, 0);
	}
	return false;
    }
    
    public void method200() {
	if (null != aClass179_12031)
	    aClass179_12031.method2929();
    }
    
    public boolean method396(int i) {
	return aBool12032;
    }
    
    public void method404(Class182 class182, short i) {
	Object object = null;
	Class525_Sub16_Sub17 class525_sub16_sub17;
	if (null == aClass525_Sub16_Sub17_12033 && aBool12032) {
	    Class20 class20 = method18697(class182, 262144, true, 439925726);
	    class525_sub16_sub17
		= (Class525_Sub16_Sub17) (class20 != null ? class20.anObject208
					  : null);
	} else {
	    class525_sub16_sub17 = aClass525_Sub16_Sub17_12033;
	    aClass525_Sub16_Sub17_12033 = null;
	}
	Class446 class446 = method10818().aClass446_4807;
	if (null != class525_sub16_sub17)
	    aClass546_10872.method8984(class525_sub16_sub17, aByte10870,
				       (int) class446.aFloat4895,
				       (int) class446.aFloat4897, null,
				       (short) 3224);
    }
    
    boolean method16933() {
	if (aClass179_12031 != null)
	    return aClass179_12031.method3017();
	return false;
    }
    
    public int method71() {
	return 2031792897 * anInt12038;
    }
    
    public int method77() {
	return 2031792897 * anInt12038;
    }
    
    Class179 method18698(Class182 class182, int i) {
	if (aClass179_12031 != null
	    && class182.method3321(aClass179_12031.method2928(), i) == 0)
	    return aClass179_12031;
	Class20 class20 = method18697(class182, i, false, 1736568648);
	if (null != class20)
	    return (Class179) class20.anObject207;
	return null;
    }
    
    public int method83() {
	return 2031792897 * anInt12038;
    }
    
    public int method399() {
	return aByte12036;
    }
    
    public int method400() {
	return aByte12036;
    }
    
    void method16938(Class182 class182) {
	/* empty */
    }
    
    public int method402() {
	return aByte12037;
    }
    
    public void method353() {
	if (null != aClass179_12031)
	    aClass179_12031.method2929();
    }
    
    public int method401() {
	return aByte12037;
    }
    
    public Class656_Sub1_Sub3_Sub2
	(Class546 class546, Class182 class182, Class40_Sub11 class40_sub11,
     ObjectDefinitions class602, int i, int i_9_, int i_10_, int i_11_, int i_12_,
     boolean bool, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_,
     int i_18_, boolean bool_19_, boolean bool_20_) {
	super(class546, i, i_9_, i_10_, i_11_, i_12_, i_13_, i_14_, i_15_,
	      i_16_, 1 == 1596797987 * class602.anInt7921,
	      Class335.method5860(i_17_, i_18_, 729897327));
	aClass40_Sub11_12035 = class40_sub11;
	anInt12038 = class602.anInt7894 * 948135895;
	aByte10870 = (byte) i_9_;
	aBool12041 = bool;
	aByte12036 = (byte) i_17_;
	aByte12037 = (byte) i_18_;
	aBool12039 = 1700857535 * class602.anInt7888 != 0 && !bool;
	aBool12040 = bool_19_;
	aBool12032
	    = (class182.method3345() && class602.aBool7926 && !aBool12041
	       && Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub15_10715
		      .method17108(2102771190) != 0);
	aBool12042 = bool_20_;
	int i_21_ = 2048;
	if (aBool12040)
	    i_21_ |= 0x10000;
	if (class602.aBool7937)
	    i_21_ |= 0x80000;
	Class20 class20 = method18697(class182, i_21_, aBool12032, 1668785758);
	if (null != class20) {
	    aClass179_12031 = (Class179) class20.anObject207;
	    aClass525_Sub16_Sub17_12033
		= (Class525_Sub16_Sub17) class20.anObject208;
	    if (aBool12040 || class602.aBool7937) {
		aClass179_12031
		    = aClass179_12031.method2926((byte) 0, i_21_, false);
		if (class602.aBool7937) {
		    Class518 class518
			= client.aClass507_11137.method8354((byte) 110);
		    aClass179_12031.method2974(1718565115 * class518.anInt7062,
					       460484831 * class518.anInt7060,
					       2040007593 * class518.anInt7061,
					       (-1037372749
						* class518.anInt7059));
		}
	    }
	}
	method16961(1, -16711936);
    }
    
    public boolean method289() {
	return aBool12032;
    }
    
    public boolean method405() {
	return aBool12042;
    }
    
    public boolean method403() {
	return aBool12042;
    }
    
    public boolean method398() {
	return aBool12042;
    }
    
    public void method407(Class182 class182) {
	Object object = null;
	Class525_Sub16_Sub17 class525_sub16_sub17;
	if (null == aClass525_Sub16_Sub17_12033 && aBool12032) {
	    Class20 class20 = method18697(class182, 262144, true, 1658586170);
	    class525_sub16_sub17
		= (Class525_Sub16_Sub17) (class20 != null ? class20.anObject208
					  : null);
	} else {
	    class525_sub16_sub17 = aClass525_Sub16_Sub17_12033;
	    aClass525_Sub16_Sub17_12033 = null;
	}
	Class446 class446 = method10818().aClass446_4807;
	if (null != class525_sub16_sub17)
	    aClass546_10872.method8984(class525_sub16_sub17, aByte10870,
				       (int) class446.aFloat4895,
				       (int) class446.aFloat4897, null,
				       (short) -3963);
    }
    
    public Class553 method16919(Class182 class182, short i) {
	Class446 class446 = method10818().aClass446_4807;
	if (null == aClass553_12034)
	    aClass553_12034
		= Class103.method1893((int) class446.aFloat4895,
				      (int) class446.aFloat4896,
				      (int) class446.aFloat4897,
				      method18699(class182, 0, 620130637),
				      -650409126);
	return aClass553_12034;
    }
    
    public void method409(Class182 class182) {
	Object object = null;
	Class525_Sub16_Sub17 class525_sub16_sub17;
	if (null == aClass525_Sub16_Sub17_12033 && aBool12032) {
	    Class20 class20 = method18697(class182, 262144, true, -319104534);
	    class525_sub16_sub17
		= (Class525_Sub16_Sub17) (class20 != null ? class20.anObject208
					  : null);
	} else {
	    class525_sub16_sub17 = aClass525_Sub16_Sub17_12033;
	    aClass525_Sub16_Sub17_12033 = null;
	}
	Class446 class446 = method10818().aClass446_4807;
	if (null != class525_sub16_sub17)
	    aClass546_10872.method8984(class525_sub16_sub17, aByte10870,
				       (int) class446.aFloat4895,
				       (int) class446.aFloat4897, null,
				       (short) -29107);
    }
    
    public void method410(Class182 class182) {
	Object object = null;
	Class525_Sub16_Sub17 class525_sub16_sub17;
	if (null == aClass525_Sub16_Sub17_12033 && aBool12032) {
	    Class20 class20 = method18697(class182, 262144, true, -2043797465);
	    class525_sub16_sub17
		= (Class525_Sub16_Sub17) (class20 != null ? class20.anObject208
					  : null);
	} else {
	    class525_sub16_sub17 = aClass525_Sub16_Sub17_12033;
	    aClass525_Sub16_Sub17_12033 = null;
	}
	Class446 class446 = method10818().aClass446_4807;
	if (null != class525_sub16_sub17)
	    aClass546_10872.method8984(class525_sub16_sub17, aByte10870,
				       (int) class446.aFloat4895,
				       (int) class446.aFloat4897, null,
				       (short) -5254);
    }
    
    Class179 method18699(Class182 class182, int i, int i_22_) {
	if (aClass179_12031 != null
	    && class182.method3321(aClass179_12031.method2928(), i) == 0)
	    return aClass179_12031;
	Class20 class20 = method18697(class182, i, false, -1767821079);
	if (null != class20)
	    return (Class179) class20.anObject207;
	return null;
    }
    
    public void method412(Class182 class182) {
	Object object = null;
	Class525_Sub16_Sub17 class525_sub16_sub17;
	if (aClass525_Sub16_Sub17_12033 == null && aBool12032) {
	    Class20 class20 = method18697(class182, 262144, true, 1196097272);
	    class525_sub16_sub17
		= (Class525_Sub16_Sub17) (null != class20 ? class20.anObject208
					  : null);
	} else {
	    class525_sub16_sub17 = aClass525_Sub16_Sub17_12033;
	    aClass525_Sub16_Sub17_12033 = null;
	}
	Class446 class446 = method10818().aClass446_4807;
	if (null != class525_sub16_sub17)
	    aClass546_10872.method9039(class525_sub16_sub17, aByte10870,
				       (int) class446.aFloat4895,
				       (int) class446.aFloat4897, null,
				       1961630129);
    }
    
    public void method397(Class182 class182) {
	Object object = null;
	Class525_Sub16_Sub17 class525_sub16_sub17;
	if (aClass525_Sub16_Sub17_12033 == null && aBool12032) {
	    Class20 class20 = method18697(class182, 262144, true, -1424857918);
	    class525_sub16_sub17
		= (Class525_Sub16_Sub17) (null != class20 ? class20.anObject208
					  : null);
	} else {
	    class525_sub16_sub17 = aClass525_Sub16_Sub17_12033;
	    aClass525_Sub16_Sub17_12033 = null;
	}
	Class446 class446 = method10818().aClass446_4807;
	if (null != class525_sub16_sub17)
	    aClass546_10872.method9039(class525_sub16_sub17, aByte10870,
				       (int) class446.aFloat4895,
				       (int) class446.aFloat4897, null,
				       1070348016);
    }
    
    boolean method16934() {
	if (aClass179_12031 != null)
	    return aClass179_12031.method3017();
	return false;
    }
    
    boolean method16940(Class182 class182, int i, int i_23_) {
	Class443 class443
	    = (((ObjectDefinitions)
		aClass40_Sub11_12035.method76(anInt12038 * 2031792897,
					      2036261880))
	       .aClass443_7920);
	if (class443 != null)
	    return class182.method3414(i, i_23_, method10826(), class443,
				       (byte) -70);
	Class179 class179 = method18699(class182, 131072, 1642901638);
	if (class179 != null) {
	    Class444 class444 = method10826();
	    return class179.method2954(i, i_23_, class444, false, 0);
	}
	return false;
    }
    
    public int method413(int i) {
	return aByte12037;
    }
    
    boolean method16931() {
	if (aClass179_12031 != null)
	    return aClass179_12031.method3017();
	return false;
    }
    
    boolean method16944() {
	return aBool12040;
    }
    
    public boolean method394(byte i) {
	return aBool12042;
    }
    
    void method16951() {
	aBool12040 = false;
	if (aClass179_12031 != null)
	    aClass179_12031
		.method3010(aClass179_12031.method2928() & ~0x10000);
    }
    
    public int method16935() {
	return aClass179_12031 != null ? aClass179_12031.method2960() : 0;
    }
    
    void method16963(Class182 class182) {
	/* empty */
    }
    
    boolean method16929() {
	if (aClass179_12031 != null)
	    return aClass179_12031.method3017();
	return false;
    }
    
    public int method406(byte i) {
	return 2031792897 * anInt12038;
    }
    
    public void method408(Class182 class182) {
	Object object = null;
	Class525_Sub16_Sub17 class525_sub16_sub17;
	if (null == aClass525_Sub16_Sub17_12033 && aBool12032) {
	    Class20 class20 = method18697(class182, 262144, true, 899510575);
	    class525_sub16_sub17
		= (Class525_Sub16_Sub17) (class20 != null ? class20.anObject208
					  : null);
	} else {
	    class525_sub16_sub17 = aClass525_Sub16_Sub17_12033;
	    aClass525_Sub16_Sub17_12033 = null;
	}
	Class446 class446 = method10818().aClass446_4807;
	if (null != class525_sub16_sub17)
	    aClass546_10872.method8984(class525_sub16_sub17, aByte10870,
				       (int) class446.aFloat4895,
				       (int) class446.aFloat4897, null,
				       (short) 29059);
    }
    
    boolean method16965(Class182 class182, int i, int i_24_) {
	Class443 class443
	    = (((ObjectDefinitions)
		aClass40_Sub11_12035.method76(anInt12038 * 2031792897,
					      589863982))
	       .aClass443_7920);
	if (class443 != null)
	    return class182.method3414(i, i_24_, method10826(), class443,
				       (byte) -41);
	Class179 class179 = method18699(class182, 131072, -1559320492);
	if (class179 != null) {
	    Class444 class444 = method10826();
	    return class179.method2954(i, i_24_, class444, false, 0);
	}
	return false;
    }
    
    boolean method16957() {
	return aBool12040;
    }
    
    boolean method16943() {
	return aBool12040;
    }
    
    public int method16927() {
	return aClass179_12031 != null ? aClass179_12031.method2960() : 0;
    }
    
    boolean method16945() {
	return aBool12040;
    }
    
    void method16968(Class182 class182, Class656_Sub1 class656_sub1, int i,
		     int i_25_, int i_26_, boolean bool) {
	if (class656_sub1 instanceof Class656_Sub1_Sub5_Sub2) {
	    Class656_Sub1_Sub5_Sub2 class656_sub1_sub5_sub2
		= (Class656_Sub1_Sub5_Sub2) class656_sub1;
	    if (aClass179_12031 != null
		&& null != class656_sub1_sub5_sub2.aClass179_12086)
		aClass179_12031.method3019((class656_sub1_sub5_sub2
					    .aClass179_12086),
					   i, i_25_, i_26_, bool);
	} else if (class656_sub1 instanceof Class656_Sub1_Sub3_Sub2) {
	    Class656_Sub1_Sub3_Sub2 class656_sub1_sub3_sub2_27_
		= (Class656_Sub1_Sub3_Sub2) class656_sub1;
	    if (aClass179_12031 != null
		&& null != class656_sub1_sub3_sub2_27_.aClass179_12031)
		aClass179_12031.method3019((class656_sub1_sub3_sub2_27_
					    .aClass179_12031),
					   i, i_25_, i_26_, bool);
	}
    }
    
    public void method411(Class182 class182) {
	Object object = null;
	Class525_Sub16_Sub17 class525_sub16_sub17;
	if (aClass525_Sub16_Sub17_12033 == null && aBool12032) {
	    Class20 class20 = method18697(class182, 262144, true, -845812758);
	    class525_sub16_sub17
		= (Class525_Sub16_Sub17) (null != class20 ? class20.anObject208
					  : null);
	} else {
	    class525_sub16_sub17 = aClass525_Sub16_Sub17_12033;
	    aClass525_Sub16_Sub17_12033 = null;
	}
	Class446 class446 = method10818().aClass446_4807;
	if (null != class525_sub16_sub17)
	    aClass546_10872.method9039(class525_sub16_sub17, aByte10870,
				       (int) class446.aFloat4895,
				       (int) class446.aFloat4897, null,
				       444103790);
    }
    
    boolean method16948() {
	if (null != aClass179_12031)
	    return !aClass179_12031.method2977();
	return true;
    }
    
    boolean method16949() {
	if (null != aClass179_12031)
	    return !aClass179_12031.method2977();
	return true;
    }
    
    boolean method16950() {
	if (null != aClass179_12031)
	    return !aClass179_12031.method2977();
	return true;
    }
    
    public void method393(Class182 class182, int i) {
	Object object = null;
	Class525_Sub16_Sub17 class525_sub16_sub17;
	if (aClass525_Sub16_Sub17_12033 == null && aBool12032) {
	    Class20 class20 = method18697(class182, 262144, true, 1081436381);
	    class525_sub16_sub17
		= (Class525_Sub16_Sub17) (null != class20 ? class20.anObject208
					  : null);
	} else {
	    class525_sub16_sub17 = aClass525_Sub16_Sub17_12033;
	    aClass525_Sub16_Sub17_12033 = null;
	}
	Class446 class446 = method10818().aClass446_4807;
	if (null != class525_sub16_sub17)
	    aClass546_10872.method9039(class525_sub16_sub17, aByte10870,
				       (int) class446.aFloat4895,
				       (int) class446.aFloat4897, null,
				       1203284827);
    }
    
    public Class553 method16946(Class182 class182) {
	Class446 class446 = method10818().aClass446_4807;
	if (null == aClass553_12034)
	    aClass553_12034
		= Class103.method1893((int) class446.aFloat4895,
				      (int) class446.aFloat4896,
				      (int) class446.aFloat4897,
				      method18699(class182, 0, 1813173303),
				      -650409126);
	return aClass553_12034;
    }
    
    public Class553 method16953(Class182 class182) {
	Class446 class446 = method10818().aClass446_4807;
	if (null == aClass553_12034)
	    aClass553_12034
		= Class103.method1893((int) class446.aFloat4895,
				      (int) class446.aFloat4896,
				      (int) class446.aFloat4897,
				      method18699(class182, 0, 1270817792),
				      -650409126);
	return aClass553_12034;
    }
    
    public Class553 method16954(Class182 class182) {
	Class446 class446 = method10818().aClass446_4807;
	if (null == aClass553_12034)
	    aClass553_12034
		= Class103.method1893((int) class446.aFloat4895,
				      (int) class446.aFloat4896,
				      (int) class446.aFloat4897,
				      method18699(class182, 0, -200416668),
				      -650409126);
	return aClass553_12034;
    }
    
    Class20 method18700(Class182 class182, int i, boolean bool) {
	ObjectDefinitions class602
	    = (ObjectDefinitions) aClass40_Sub11_12035.method76(2031792897 * anInt12038,
						       2017869789);
	Class161 class161;
	Class161 class161_28_;
	if (aBool12041) {
	    class161 = aClass546_10872.aClass161Array7249[aByte10870];
	    class161_28_ = aClass546_10872.aClass161Array7215[0];
	} else {
	    class161 = aClass546_10872.aClass161Array7215[aByte10870];
	    if (aByte10870 < 3)
		class161_28_
		    = aClass546_10872.aClass161Array7215[aByte10870 + 1];
	    else
		class161_28_ = null;
	}
	Class446 class446 = method10818().aClass446_4807;
	return (class602.method9919
		(class182, i,
		 (aByte12036 != -1214990409 * Class608.aClass608_7997.anInt7995
		  ? (int) aByte12036
		  : Class608.aClass608_7996.anInt7995 * -1214990409),
		 (aByte12036 == -1214990409 * Class608.aClass608_7997.anInt7995
		  ? (int) (aByte12037 + 4) : aByte12037),
		 class161, class161_28_, (int) class446.aFloat4895,
		 (int) class446.aFloat4896, (int) class446.aFloat4897, bool,
		 null, 1690352293));
    }
    
    Class567 method16921(Class182 class182) {
	if (aClass179_12031 == null)
	    return null;
	Class444 class444 = method10826();
	Class567 class567 = Class293.method5303(aBool12039, (short) -32167);
	Class443 class443
	    = (((ObjectDefinitions)
		aClass40_Sub11_12035.method76(anInt12038 * 2031792897,
					      1959306593))
	       .aClass443_7920);
	if (null != class443) {
	    aClass179_12031.method2953(class444, null, 0);
	    class182.method3371(class444, aClass211Array10869[0], class443);
	} else
	    aClass179_12031.method2953(class444, aClass211Array10869[0], 0);
	return class567;
    }
    
    static byte method18701(int i, int i_29_) {
	if (Class608.aClass608_7980.anInt7995 * -1214990409 != i)
	    return (byte) 0;
	if (0 == (i_29_ & 0x1))
	    return (byte) 1;
	return (byte) 2;
    }
    
    public int method18702(int i) {
	return aClass179_12031 != null ? aClass179_12031.method2956() / 4 : 15;
    }
    
    Class179 method18703(Class182 class182, int i) {
	if (aClass179_12031 != null
	    && class182.method3321(aClass179_12031.method2928(), i) == 0)
	    return aClass179_12031;
	Class20 class20 = method18697(class182, i, false, -1052216671);
	if (null != class20)
	    return (Class179) class20.anObject207;
	return null;
    }
    
    Class20 method18704(Class182 class182, int i, boolean bool) {
	ObjectDefinitions class602
	    = (ObjectDefinitions) aClass40_Sub11_12035.method76(2031792897 * anInt12038,
						       -1309994923);
	Class161 class161;
	Class161 class161_30_;
	if (aBool12041) {
	    class161 = aClass546_10872.aClass161Array7249[aByte10870];
	    class161_30_ = aClass546_10872.aClass161Array7215[0];
	} else {
	    class161 = aClass546_10872.aClass161Array7215[aByte10870];
	    if (aByte10870 < 3)
		class161_30_
		    = aClass546_10872.aClass161Array7215[aByte10870 + 1];
	    else
		class161_30_ = null;
	}
	Class446 class446 = method10818().aClass446_4807;
	return (class602.method9919
		(class182, i,
		 (aByte12036 != -1214990409 * Class608.aClass608_7997.anInt7995
		  ? (int) aByte12036
		  : Class608.aClass608_7996.anInt7995 * -1214990409),
		 (aByte12036 == -1214990409 * Class608.aClass608_7997.anInt7995
		  ? (int) (aByte12037 + 4) : aByte12037),
		 class161, class161_30_, (int) class446.aFloat4895,
		 (int) class446.aFloat4896, (int) class446.aFloat4897, bool,
		 null, 1869288951));
    }
    
    boolean method16964() {
	if (null != aClass179_12031)
	    return !aClass179_12031.method2977();
	return true;
    }
    
    static final void method18705(Class259 class259, Class245 class245,
				  Class683 class683, int i) {
	class259.anInt2630 = 1977828130;
	class259.aClass288_2769 = null;
	class259.anInt2631
	    = (class683.anIntArray8661
	       [(class683.anInt8662 -= 1552651121) * 501271953]) * -1938518325;
	if (1534974651 * class259.anInt2576 == -1 && !class245.aBool2428)
	    Class689.method14096(1984678839 * class259.anInt2588, -2120211180);
    }
    
    static final void method18706(Class683 class683, int i) {
	int i_31_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_31_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_31_ >> 16];
	Class642.method10593(class259, class245, class683, -208210301);
    }
}
