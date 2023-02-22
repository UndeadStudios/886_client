/* Class656_Sub1_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class656_Sub1_Sub1_Sub1 extends Class656_Sub1_Sub1
    implements Interface62
{
    Class40_Sub11 aClass40_Sub11_12049;
    Class179 aClass179_12050;
    Class553 aClass553_12051;
    Class525_Sub16_Sub17 aClass525_Sub16_Sub17_12052;
    int anInt12053;
    byte aByte12054;
    boolean aBool12055;
    boolean aBool12056;
    boolean aBool12057;
    boolean aBool12058;
    
    boolean method16934() {
	if (null != aClass179_12050)
	    return aClass179_12050.method3017();
	return false;
    }
    
    public Class656_Sub1_Sub1_Sub1
	(Class546 class546, Class182 class182, Class40_Sub11 class40_sub11,
     ObjectDefinitions class602, int i, int i_0_, int i_1_, int i_2_, int i_3_,
     boolean bool, int i_4_, boolean bool_5_) {
	super(class546, i_1_, i_2_, i_3_, i, i_0_,
	      class602.anInt7922 * -384855147);
	aClass40_Sub11_12049 = class40_sub11;
	anInt12053 = 1635689463 * class602.anInt7894;
	aBool12055 = bool;
	aByte12054 = (byte) i_4_;
	aBool12056 = 0 != class602.anInt7888 * 1700857535 && !bool;
	aBool12057 = bool_5_;
	aBool12058
	    = (class182.method3345() && class602.aBool7926 && !aBool12055
	       && Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub15_10715
		      .method17108(405682085) != 0);
	int i_6_ = 2048;
	if (aBool12057)
	    i_6_ |= 0x10000;
	if (class602.aBool7937)
	    i_6_ |= 0x80000;
	Class20 class20 = method18714(class182, i_6_, aBool12058, -2069749352);
	if (class20 != null) {
	    aClass179_12050 = (Class179) class20.anObject207;
	    aClass525_Sub16_Sub17_12052
		= (Class525_Sub16_Sub17) class20.anObject208;
	    if (aBool12057 || class602.aBool7937) {
		aClass179_12050
		    = aClass179_12050.method2926((byte) 0, i_6_, false);
		if (class602.aBool7937) {
		    Class518 class518
			= client.aClass507_11137.method8354((byte) 5);
		    aClass179_12050.method2974(1718565115 * class518.anInt7062,
					       class518.anInt7060 * 460484831,
					       2040007593 * class518.anInt7061,
					       (-1037372749
						* class518.anInt7059));
		}
	    }
	}
	method16961(1, -16711936);
    }
    
    boolean method16914(int i) {
	if (null != aClass179_12050)
	    return aClass179_12050.method3017();
	return false;
    }
    
    public int method16909(byte i) {
	return null != aClass179_12050 ? aClass179_12050.method2960() : 0;
    }
    
    public int method401() {
	return aByte12054;
    }
    
    public void method407(Class182 class182) {
	Object object = null;
	Class525_Sub16_Sub17 class525_sub16_sub17;
	if (null == aClass525_Sub16_Sub17_12052 && aBool12058) {
	    Class20 class20 = method18714(class182, 262144, true, -1946658342);
	    class525_sub16_sub17
		= (Class525_Sub16_Sub17) (null != class20 ? class20.anObject208
					  : null);
	} else {
	    class525_sub16_sub17 = aClass525_Sub16_Sub17_12052;
	    aClass525_Sub16_Sub17_12052 = null;
	}
	Class446 class446 = method10818().aClass446_4807;
	if (null != class525_sub16_sub17)
	    aClass546_10872.method8984(class525_sub16_sub17, aByte10870,
				       (int) class446.aFloat4895,
				       (int) class446.aFloat4897, null,
				       (short) 8854);
    }
    
    public Class553 method16919(Class182 class182, short i) {
	Class446 class446 = method10818().aClass446_4807;
	if (aClass553_12051 == null)
	    aClass553_12051
		= Class103.method1893((int) class446.aFloat4895,
				      (int) class446.aFloat4896,
				      (int) class446.aFloat4897,
				      method18713(class182, 0, (byte) 1),
				      -650409126);
	return aClass553_12051;
    }
    
    Class567 method16917(Class182 class182, int i) {
	if (aClass179_12050 == null)
	    return null;
	Class444 class444 = method10826();
	Class567 class567 = Class293.method5303(aBool12056, (short) 2849);
	Class443 class443
	    = (((ObjectDefinitions)
		aClass40_Sub11_12049.method76(anInt12053 * -915360223,
					      187723101))
	       .aClass443_7920);
	if (null != class443) {
	    aClass179_12050.method2953(class444, null, 0);
	    class182.method3371(class444, aClass211Array10869[0], class443);
	} else
	    aClass179_12050.method2953(class444, aClass211Array10869[0], 0);
	return class567;
    }
    
    Class179 method18713(Class182 class182, int i, byte i_7_) {
	if (aClass179_12050 != null
	    && class182.method3321(aClass179_12050.method2928(), i) == 0)
	    return aClass179_12050;
	Class20 class20 = method18714(class182, i, false, -1947683280);
	if (class20 != null)
	    return (Class179) class20.anObject207;
	return null;
    }
    
    boolean method16910(Class182 class182, int i, int i_8_, byte i_9_) {
	Class443 class443
	    = (((ObjectDefinitions)
		aClass40_Sub11_12049.method76(-915360223 * anInt12053,
					      1824322303))
	       .aClass443_7920);
	if (class443 != null)
	    return class182.method3414(i, i_8_, method10826(), class443,
				       (byte) -72);
	Class179 class179 = method18713(class182, 131072, (byte) 1);
	if (null != class179) {
	    Class444 class444 = method10826();
	    return class179.method2954(i, i_8_, class444, false, 0);
	}
	return false;
    }
    
    boolean method16912(int i) {
	return aBool12057;
    }
    
    void method16915(Class182 class182, Class656_Sub1 class656_sub1, int i,
		     int i_10_, int i_11_, boolean bool, int i_12_) {
	if (class656_sub1 instanceof Class656_Sub1_Sub1_Sub1) {
	    Class656_Sub1_Sub1_Sub1 class656_sub1_sub1_sub1_13_
		= (Class656_Sub1_Sub1_Sub1) class656_sub1;
	    if (aClass179_12050 != null
		&& class656_sub1_sub1_sub1_13_.aClass179_12050 != null)
		aClass179_12050.method3019((class656_sub1_sub1_sub1_13_
					    .aClass179_12050),
					   i, i_10_, i_11_, bool);
	}
    }
    
    public int method413(int i) {
	return aByte12054;
    }
    
    public int method406(byte i) {
	return anInt12053 * -915360223;
    }
    
    public int method72(int i) {
	return -1214990409 * Class608.aClass608_7998.anInt7995;
    }
    
    public int method392() {
	return aByte12054;
    }
    
    public int method77() {
	return anInt12053 * -915360223;
    }
    
    Class20 method18714(Class182 class182, int i, boolean bool, int i_14_) {
	ObjectDefinitions class602
	    = (ObjectDefinitions) aClass40_Sub11_12049.method76(anInt12053 * -915360223,
						       -1587476660);
	Class161 class161;
	Class161 class161_15_;
	if (aBool12055) {
	    class161 = aClass546_10872.aClass161Array7249[aByte10870];
	    class161_15_ = aClass546_10872.aClass161Array7215[0];
	} else {
	    class161 = aClass546_10872.aClass161Array7215[aByte10870];
	    if (aByte10870 < 3)
		class161_15_
		    = aClass546_10872.aClass161Array7215[aByte10870 + 1];
	    else
		class161_15_ = null;
	}
	Class446 class446 = method10818().aClass446_4807;
	return class602.method9919(class182, i,
				   (-1214990409
				    * Class608.aClass608_7998.anInt7995),
				   aByte12054, class161, class161_15_,
				   (int) class446.aFloat4895,
				   (int) class446.aFloat4896,
				   (int) class446.aFloat4897, bool, null,
				   1968545084);
    }
    
    public boolean method396(int i) {
	return aBool12058;
    }
    
    public void method404(Class182 class182, short i) {
	Object object = null;
	Class525_Sub16_Sub17 class525_sub16_sub17;
	if (null == aClass525_Sub16_Sub17_12052 && aBool12058) {
	    Class20 class20 = method18714(class182, 262144, true, -1978341983);
	    class525_sub16_sub17
		= (Class525_Sub16_Sub17) (null != class20 ? class20.anObject208
					  : null);
	} else {
	    class525_sub16_sub17 = aClass525_Sub16_Sub17_12052;
	    aClass525_Sub16_Sub17_12052 = null;
	}
	Class446 class446 = method10818().aClass446_4807;
	if (null != class525_sub16_sub17)
	    aClass546_10872.method8984(class525_sub16_sub17, aByte10870,
				       (int) class446.aFloat4895,
				       (int) class446.aFloat4897, null,
				       (short) 604);
    }
    
    boolean method16913(int i) {
	if (aClass179_12050 != null)
	    return !aClass179_12050.method2977();
	return true;
    }
    
    public void method412(Class182 class182) {
	Object object = null;
	Class525_Sub16_Sub17 class525_sub16_sub17;
	if (aClass525_Sub16_Sub17_12052 == null && aBool12058) {
	    Class20 class20 = method18714(class182, 262144, true, -2078637351);
	    class525_sub16_sub17
		= (Class525_Sub16_Sub17) (null != class20 ? class20.anObject208
					  : null);
	} else {
	    class525_sub16_sub17 = aClass525_Sub16_Sub17_12052;
	    aClass525_Sub16_Sub17_12052 = null;
	}
	Class446 class446 = method10818().aClass446_4807;
	if (class525_sub16_sub17 != null)
	    aClass546_10872.method9039(class525_sub16_sub17, aByte10870,
				       (int) class446.aFloat4895,
				       (int) class446.aFloat4897, null,
				       1260252907);
    }
    
    public int method71() {
	return anInt12053 * -915360223;
    }
    
    public int method83() {
	return anInt12053 * -915360223;
    }
    
    public int method399() {
	return -1214990409 * Class608.aClass608_7998.anInt7995;
    }
    
    public int method400() {
	return -1214990409 * Class608.aClass608_7998.anInt7995;
    }
    
    boolean method16964() {
	if (aClass179_12050 != null)
	    return !aClass179_12050.method2977();
	return true;
    }
    
    public void method200() {
	if (null != aClass179_12050)
	    aClass179_12050.method2929();
    }
    
    public boolean method403() {
	return true;
    }
    
    boolean method16949() {
	if (aClass179_12050 != null)
	    return !aClass179_12050.method2977();
	return true;
    }
    
    Class179 method18715(Class182 class182, int i) {
	if (aClass179_12050 != null
	    && class182.method3321(aClass179_12050.method2928(), i) == 0)
	    return aClass179_12050;
	Class20 class20 = method18714(class182, i, false, -2102448265);
	if (class20 != null)
	    return (Class179) class20.anObject207;
	return null;
    }
    
    public boolean method289() {
	return aBool12058;
    }
    
    public boolean method405() {
	return true;
    }
    
    public void method409(Class182 class182) {
	Object object = null;
	Class525_Sub16_Sub17 class525_sub16_sub17;
	if (null == aClass525_Sub16_Sub17_12052 && aBool12058) {
	    Class20 class20 = method18714(class182, 262144, true, -1823321851);
	    class525_sub16_sub17
		= (Class525_Sub16_Sub17) (null != class20 ? class20.anObject208
					  : null);
	} else {
	    class525_sub16_sub17 = aClass525_Sub16_Sub17_12052;
	    aClass525_Sub16_Sub17_12052 = null;
	}
	Class446 class446 = method10818().aClass446_4807;
	if (null != class525_sub16_sub17)
	    aClass546_10872.method8984(class525_sub16_sub17, aByte10870,
				       (int) class446.aFloat4895,
				       (int) class446.aFloat4897, null,
				       (short) 14699);
    }
    
    public boolean method398() {
	return true;
    }
    
    boolean method16930() {
	if (null != aClass179_12050)
	    return aClass179_12050.method3017();
	return false;
    }
    
    public void method408(Class182 class182) {
	Object object = null;
	Class525_Sub16_Sub17 class525_sub16_sub17;
	if (null == aClass525_Sub16_Sub17_12052 && aBool12058) {
	    Class20 class20 = method18714(class182, 262144, true, -1874020763);
	    class525_sub16_sub17
		= (Class525_Sub16_Sub17) (null != class20 ? class20.anObject208
					  : null);
	} else {
	    class525_sub16_sub17 = aClass525_Sub16_Sub17_12052;
	    aClass525_Sub16_Sub17_12052 = null;
	}
	Class446 class446 = method10818().aClass446_4807;
	if (null != class525_sub16_sub17)
	    aClass546_10872.method8984(class525_sub16_sub17, aByte10870,
				       (int) class446.aFloat4895,
				       (int) class446.aFloat4897, null,
				       (short) 17718);
    }
    
    void method16918(Class182 class182, int i) {
	/* empty */
    }
    
    public void method395(int i) {
	if (null != aClass179_12050)
	    aClass179_12050.method2929();
    }
    
    public void method411(Class182 class182) {
	Object object = null;
	Class525_Sub16_Sub17 class525_sub16_sub17;
	if (aClass525_Sub16_Sub17_12052 == null && aBool12058) {
	    Class20 class20 = method18714(class182, 262144, true, -2036281863);
	    class525_sub16_sub17
		= (Class525_Sub16_Sub17) (null != class20 ? class20.anObject208
					  : null);
	} else {
	    class525_sub16_sub17 = aClass525_Sub16_Sub17_12052;
	    aClass525_Sub16_Sub17_12052 = null;
	}
	Class446 class446 = method10818().aClass446_4807;
	if (class525_sub16_sub17 != null)
	    aClass546_10872.method9039(class525_sub16_sub17, aByte10870,
				       (int) class446.aFloat4895,
				       (int) class446.aFloat4897, null,
				       1915148124);
    }
    
    public Class553 method16946(Class182 class182) {
	Class446 class446 = method10818().aClass446_4807;
	if (aClass553_12051 == null)
	    aClass553_12051
		= Class103.method1893((int) class446.aFloat4895,
				      (int) class446.aFloat4896,
				      (int) class446.aFloat4897,
				      method18713(class182, 0, (byte) 1),
				      -650409126);
	return aClass553_12051;
    }
    
    public void method397(Class182 class182) {
	Object object = null;
	Class525_Sub16_Sub17 class525_sub16_sub17;
	if (aClass525_Sub16_Sub17_12052 == null && aBool12058) {
	    Class20 class20 = method18714(class182, 262144, true, -1832869633);
	    class525_sub16_sub17
		= (Class525_Sub16_Sub17) (null != class20 ? class20.anObject208
					  : null);
	} else {
	    class525_sub16_sub17 = aClass525_Sub16_Sub17_12052;
	    aClass525_Sub16_Sub17_12052 = null;
	}
	Class446 class446 = method10818().aClass446_4807;
	if (class525_sub16_sub17 != null)
	    aClass546_10872.method9039(class525_sub16_sub17, aByte10870,
				       (int) class446.aFloat4895,
				       (int) class446.aFloat4897, null,
				       946638526);
    }
    
    public boolean method394(byte i) {
	return true;
    }
    
    boolean method16929() {
	if (null != aClass179_12050)
	    return aClass179_12050.method3017();
	return false;
    }
    
    public void method353() {
	if (null != aClass179_12050)
	    aClass179_12050.method2929();
    }
    
    boolean method16931() {
	if (null != aClass179_12050)
	    return aClass179_12050.method3017();
	return false;
    }
    
    boolean method16932() {
	if (null != aClass179_12050)
	    return aClass179_12050.method3017();
	return false;
    }
    
    boolean method16933() {
	if (null != aClass179_12050)
	    return aClass179_12050.method3017();
	return false;
    }
    
    public int method16927() {
	return null != aClass179_12050 ? aClass179_12050.method2960() : 0;
    }
    
    public int method16935() {
	return null != aClass179_12050 ? aClass179_12050.method2960() : 0;
    }
    
    void method16963(Class182 class182) {
	/* empty */
    }
    
    void method16938(Class182 class182) {
	/* empty */
    }
    
    boolean method16939(Class182 class182, int i, int i_16_) {
	Class443 class443
	    = (((ObjectDefinitions)
		aClass40_Sub11_12049.method76(-915360223 * anInt12053,
					      -5984537))
	       .aClass443_7920);
	if (class443 != null)
	    return class182.method3414(i, i_16_, method10826(), class443,
				       (byte) -37);
	Class179 class179 = method18713(class182, 131072, (byte) 1);
	if (null != class179) {
	    Class444 class444 = method10826();
	    return class179.method2954(i, i_16_, class444, false, 0);
	}
	return false;
    }
    
    boolean method16940(Class182 class182, int i, int i_17_) {
	Class443 class443
	    = (((ObjectDefinitions)
		aClass40_Sub11_12049.method76(-915360223 * anInt12053,
					      1008188894))
	       .aClass443_7920);
	if (class443 != null)
	    return class182.method3414(i, i_17_, method10826(), class443,
				       (byte) -58);
	Class179 class179 = method18713(class182, 131072, (byte) 1);
	if (null != class179) {
	    Class444 class444 = method10826();
	    return class179.method2954(i, i_17_, class444, false, 0);
	}
	return false;
    }
    
    public void method410(Class182 class182) {
	Object object = null;
	Class525_Sub16_Sub17 class525_sub16_sub17;
	if (null == aClass525_Sub16_Sub17_12052 && aBool12058) {
	    Class20 class20 = method18714(class182, 262144, true, -1924939778);
	    class525_sub16_sub17
		= (Class525_Sub16_Sub17) (null != class20 ? class20.anObject208
					  : null);
	} else {
	    class525_sub16_sub17 = aClass525_Sub16_Sub17_12052;
	    aClass525_Sub16_Sub17_12052 = null;
	}
	Class446 class446 = method10818().aClass446_4807;
	if (null != class525_sub16_sub17)
	    aClass546_10872.method8984(class525_sub16_sub17, aByte10870,
				       (int) class446.aFloat4895,
				       (int) class446.aFloat4897, null,
				       (short) -10833);
    }
    
    boolean method16957() {
	return aBool12057;
    }
    
    boolean method16943() {
	return aBool12057;
    }
    
    boolean method16944() {
	return aBool12057;
    }
    
    boolean method16945() {
	return aBool12057;
    }
    
    void method16968(Class182 class182, Class656_Sub1 class656_sub1, int i,
		     int i_18_, int i_19_, boolean bool) {
	if (class656_sub1 instanceof Class656_Sub1_Sub1_Sub1) {
	    Class656_Sub1_Sub1_Sub1 class656_sub1_sub1_sub1_20_
		= (Class656_Sub1_Sub1_Sub1) class656_sub1;
	    if (aClass179_12050 != null
		&& class656_sub1_sub1_sub1_20_.aClass179_12050 != null)
		aClass179_12050.method3019((class656_sub1_sub1_sub1_20_
					    .aClass179_12050),
					   i, i_18_, i_19_, bool);
	}
    }
    
    void method16951() {
	aBool12057 = false;
	if (aClass179_12050 != null)
	    aClass179_12050
		.method3010(aClass179_12050.method2928() & ~0x10000);
    }
    
    boolean method16948() {
	if (aClass179_12050 != null)
	    return !aClass179_12050.method2977();
	return true;
    }
    
    void method16916(int i) {
	aBool12057 = false;
	if (aClass179_12050 != null)
	    aClass179_12050
		.method3010(aClass179_12050.method2928() & ~0x10000);
    }
    
    boolean method16950() {
	if (aClass179_12050 != null)
	    return !aClass179_12050.method2977();
	return true;
    }
    
    public Class553 method16953(Class182 class182) {
	Class446 class446 = method10818().aClass446_4807;
	if (aClass553_12051 == null)
	    aClass553_12051
		= Class103.method1893((int) class446.aFloat4895,
				      (int) class446.aFloat4896,
				      (int) class446.aFloat4897,
				      method18713(class182, 0, (byte) 1),
				      -650409126);
	return aClass553_12051;
    }
    
    public void method393(Class182 class182, int i) {
	Object object = null;
	Class525_Sub16_Sub17 class525_sub16_sub17;
	if (aClass525_Sub16_Sub17_12052 == null && aBool12058) {
	    Class20 class20 = method18714(class182, 262144, true, -2095945177);
	    class525_sub16_sub17
		= (Class525_Sub16_Sub17) (null != class20 ? class20.anObject208
					  : null);
	} else {
	    class525_sub16_sub17 = aClass525_Sub16_Sub17_12052;
	    aClass525_Sub16_Sub17_12052 = null;
	}
	Class446 class446 = method10818().aClass446_4807;
	if (class525_sub16_sub17 != null)
	    aClass546_10872.method9039(class525_sub16_sub17, aByte10870,
				       (int) class446.aFloat4895,
				       (int) class446.aFloat4897, null,
				       2042979879);
    }
    
    boolean method16965(Class182 class182, int i, int i_21_) {
	Class443 class443
	    = (((ObjectDefinitions)
		aClass40_Sub11_12049.method76(-915360223 * anInt12053,
					      1774031655))
	       .aClass443_7920);
	if (class443 != null)
	    return class182.method3414(i, i_21_, method10826(), class443,
				       (byte) -21);
	Class179 class179 = method18713(class182, 131072, (byte) 1);
	if (null != class179) {
	    Class444 class444 = method10826();
	    return class179.method2954(i, i_21_, class444, false, 0);
	}
	return false;
    }
    
    public Class553 method16954(Class182 class182) {
	Class446 class446 = method10818().aClass446_4807;
	if (aClass553_12051 == null)
	    aClass553_12051
		= Class103.method1893((int) class446.aFloat4895,
				      (int) class446.aFloat4896,
				      (int) class446.aFloat4897,
				      method18713(class182, 0, (byte) 1),
				      -650409126);
	return aClass553_12051;
    }
    
    public Class553 method16955(Class182 class182) {
	Class446 class446 = method10818().aClass446_4807;
	if (aClass553_12051 == null)
	    aClass553_12051
		= Class103.method1893((int) class446.aFloat4895,
				      (int) class446.aFloat4896,
				      (int) class446.aFloat4897,
				      method18713(class182, 0, (byte) 1),
				      -650409126);
	return aClass553_12051;
    }
    
    Class567 method16921(Class182 class182) {
	if (aClass179_12050 == null)
	    return null;
	Class444 class444 = method10826();
	Class567 class567 = Class293.method5303(aBool12056, (short) -14416);
	Class443 class443
	    = (((ObjectDefinitions)
		aClass40_Sub11_12049.method76(anInt12053 * -915360223,
					      1775684067))
	       .aClass443_7920);
	if (null != class443) {
	    aClass179_12050.method2953(class444, null, 0);
	    class182.method3371(class444, aClass211Array10869[0], class443);
	} else
	    aClass179_12050.method2953(class444, aClass211Array10869[0], 0);
	return class567;
    }
    
    Class179 method18716(Class182 class182, int i) {
	if (aClass179_12050 != null
	    && class182.method3321(aClass179_12050.method2928(), i) == 0)
	    return aClass179_12050;
	Class20 class20 = method18714(class182, i, false, -1774974617);
	if (class20 != null)
	    return (Class179) class20.anObject207;
	return null;
    }
    
    public int method402() {
	return aByte12054;
    }
    
    public static char method18717(byte i, int i_22_) {
	int i_23_ = i & 0xff;
	if (i_23_ == 0)
	    throw new IllegalArgumentException(new StringBuilder().append
						   ("").append
						   (Integer.toString(i_23_,
								     16))
						   .toString());
	if (i_23_ >= 128 && i_23_ < 160) {
	    int i_24_ = Class664.aCharArray8555[i_23_ - 128];
	    if (0 == i_24_)
		i_24_ = 63;
	    i_23_ = i_24_;
	}
	return (char) i_23_;
    }
    
    static final void method18718(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	int i_25_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	i_25_--;
	if (class259.aStringArray2701 == null
	    || i_25_ >= class259.aStringArray2701.length
	    || null == class259.aStringArray2701[i_25_])
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= "";
	else
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= class259.aStringArray2701[i_25_];
    }
}
