/* Class656_Sub1_Sub4_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class656_Sub1_Sub4_Sub2 extends Class656_Sub1_Sub4
    implements Interface62
{
    Class553 aClass553_12096;
    Class179 aClass179_12097;
    byte aByte12098;
    boolean aBool12099;
    int anInt12100;
    byte aByte12101;
    Class40_Sub11 aClass40_Sub11_12102;
    boolean aBool12103;
    Class525_Sub16_Sub17 aClass525_Sub16_Sub17_12104;
    boolean aBool12105;
    
    boolean method16914(int i) {
	if (null != aClass179_12097)
	    return aClass179_12097.method3017();
	return false;
    }
    
    boolean method16913(int i) {
	if (null != aClass179_12097)
	    return !aClass179_12097.method2977();
	return true;
    }
    
    public int method392() {
	return aByte12098;
    }
    
    public int method402() {
	return aByte12098;
    }
    
    public void method409(Class182 class182) {
	Object object = null;
	Class525_Sub16_Sub17 class525_sub16_sub17;
	if (null == aClass525_Sub16_Sub17_12104 && aBool12105) {
	    Class20 class20 = method18754(class182, 262144, true, (byte) 11);
	    class525_sub16_sub17
		= (Class525_Sub16_Sub17) (class20 != null ? class20.anObject208
					  : null);
	} else {
	    class525_sub16_sub17 = aClass525_Sub16_Sub17_12104;
	    aClass525_Sub16_Sub17_12104 = null;
	}
	Class446 class446 = method10818().aClass446_4807;
	if (null != class525_sub16_sub17)
	    aClass546_10872.method8984(class525_sub16_sub17, aByte10870,
				       (int) class446.aFloat4895,
				       (int) class446.aFloat4897, null,
				       (short) -2866);
    }
    
    boolean method16932() {
	if (null != aClass179_12097)
	    return aClass179_12097.method3017();
	return false;
    }
    
    public Class553 method16919(Class182 class182, short i) {
	Class446 class446 = method10818().aClass446_4807;
	if (null == aClass553_12096)
	    aClass553_12096
		= Class103.method1893((int) class446.aFloat4895,
				      (int) class446.aFloat4896,
				      (int) class446.aFloat4897,
				      method18751(class182, 0, -1030157593),
				      -650409126);
	return aClass553_12096;
    }
    
    Class567 method16917(Class182 class182, int i) {
	if (null == aClass179_12097)
	    return null;
	Class444 class444 = class182.method3225();
	class444.method7154(method10826());
	class444.method7147((float) aShort11942, 0.0F, (float) aShort11939);
	Class567 class567 = Class293.method5303(aBool12099, (short) -9887);
	Class443 class443
	    = (((ObjectDefinitions)
		aClass40_Sub11_12102.method76(anInt12100 * -1747297249,
					      -1593990401))
	       .aClass443_7920);
	if (null != class443) {
	    aClass179_12097.method2953(class444, null, 0);
	    class182.method3371(class444, aClass211Array10869[0], class443);
	} else
	    aClass179_12097.method2953(class444, aClass211Array10869[0], 0);
	return class567;
    }
    
    void method16918(Class182 class182, int i) {
	/* empty */
    }
    
    boolean method16910(Class182 class182, int i, int i_0_, byte i_1_) {
	Class443 class443
	    = (((ObjectDefinitions)
		aClass40_Sub11_12102.method76(anInt12100 * -1747297249,
					      -1897107193))
	       .aClass443_7920);
	if (null != class443)
	    return class182.method3414(i, i_0_, method10826(), class443,
				       (byte) -35);
	Class179 class179 = method18751(class182, 131072, -705230692);
	if (null != class179) {
	    Class444 class444 = method10826();
	    return class179.method2954(i, i_0_, class444, false, 0);
	}
	return false;
    }
    
    Class179 method18751(Class182 class182, int i, int i_2_) {
	if (null != aClass179_12097
	    && class182.method3321(aClass179_12097.method2928(), i) == 0)
	    return aClass179_12097;
	Class20 class20 = method18754(class182, i, false, (byte) 56);
	if (null != class20)
	    return (Class179) class20.anObject207;
	return null;
    }
    
    public int method72(int i) {
	return aByte12101;
    }
    
    public int method413(int i) {
	return aByte12098;
    }
    
    public void method395(int i) {
	if (aClass179_12097 != null)
	    aClass179_12097.method2929();
    }
    
    public boolean method394(byte i) {
	return true;
    }
    
    public boolean method396(int i) {
	return aBool12105;
    }
    
    public void method404(Class182 class182, short i) {
	Object object = null;
	Class525_Sub16_Sub17 class525_sub16_sub17;
	if (null == aClass525_Sub16_Sub17_12104 && aBool12105) {
	    Class20 class20 = method18754(class182, 262144, true, (byte) 86);
	    class525_sub16_sub17
		= (Class525_Sub16_Sub17) (class20 != null ? class20.anObject208
					  : null);
	} else {
	    class525_sub16_sub17 = aClass525_Sub16_Sub17_12104;
	    aClass525_Sub16_Sub17_12104 = null;
	}
	Class446 class446 = method10818().aClass446_4807;
	if (null != class525_sub16_sub17)
	    aClass546_10872.method8984(class525_sub16_sub17, aByte10870,
				       (int) class446.aFloat4895,
				       (int) class446.aFloat4897, null,
				       (short) -15752);
    }
    
    public int method406(byte i) {
	return -1747297249 * anInt12100;
    }
    
    public int method77() {
	return -1747297249 * anInt12100;
    }
    
    public void method353() {
	if (aClass179_12097 != null)
	    aClass179_12097.method2929();
    }
    
    public int method83() {
	return -1747297249 * anInt12100;
    }
    
    public int method399() {
	return aByte12101;
    }
    
    public boolean method289() {
	return aBool12105;
    }
    
    public Class553 method16954(Class182 class182) {
	Class446 class446 = method10818().aClass446_4807;
	if (null == aClass553_12096)
	    aClass553_12096
		= Class103.method1893((int) class446.aFloat4895,
				      (int) class446.aFloat4896,
				      (int) class446.aFloat4897,
				      method18751(class182, 0, 213042089),
				      -650409126);
	return aClass553_12096;
    }
    
    Class179 method18752(Class182 class182, int i) {
	if (null != aClass179_12097
	    && class182.method3321(aClass179_12097.method2928(), i) == 0)
	    return aClass179_12097;
	Class20 class20 = method18754(class182, i, false, (byte) 124);
	if (null != class20)
	    return (Class179) class20.anObject207;
	return null;
    }
    
    public Class656_Sub1_Sub4_Sub2
	(Class546 class546, Class182 class182, Class40_Sub11 class40_sub11,
     ObjectDefinitions class602, int i, int i_3_, int i_4_, int i_5_, int i_6_,
     boolean bool, int i_7_, int i_8_, int i_9_, int i_10_) {
	super(class546, i_4_, i_5_, i_6_, i, i_3_, i_7_, i_8_);
	aClass40_Sub11_12102 = class40_sub11;
	anInt12100 = class602.anInt7894 * 826312777;
	aBool12103 = bool;
	aByte12098 = (byte) i_10_;
	aByte12101 = (byte) i_9_;
	aBool12099 = 0 != class602.anInt7888 * 1700857535 && !bool;
	aBool12105
	    = (class182.method3345() && class602.aBool7926 && !aBool12103
	       && Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub15_10715
		      .method17108(995209411) != 0);
	int i_11_ = 2048;
	if (class602.aBool7937)
	    i_11_ |= 0x80000;
	Class20 class20 = method18754(class182, i_11_, aBool12105, (byte) 116);
	if (class20 != null) {
	    aClass179_12097 = (Class179) class20.anObject207;
	    aClass525_Sub16_Sub17_12104
		= (Class525_Sub16_Sub17) class20.anObject208;
	    if (class602.aBool7937) {
		aClass179_12097
		    = aClass179_12097.method2926((byte) 0, i_11_, false);
		if (class602.aBool7937) {
		    Class518 class518
			= client.aClass507_11137.method8354((byte) 109);
		    aClass179_12097.method2974(class518.anInt7062 * 1718565115,
					       460484831 * class518.anInt7060,
					       class518.anInt7061 * 2040007593,
					       (-1037372749
						* class518.anInt7059));
		}
	    }
	}
	method16961(1, -16711936);
    }
    
    public int method16927() {
	return null != aClass179_12097 ? aClass179_12097.method2960() : 0;
    }
    
    public void method200() {
	if (aClass179_12097 != null)
	    aClass179_12097.method2929();
    }
    
    void method16938(Class182 class182) {
	/* empty */
    }
    
    public boolean method405() {
	return true;
    }
    
    Class179 method18753(Class182 class182, int i) {
	if (null != aClass179_12097
	    && class182.method3321(aClass179_12097.method2928(), i) == 0)
	    return aClass179_12097;
	Class20 class20 = method18754(class182, i, false, (byte) 29);
	if (null != class20)
	    return (Class179) class20.anObject207;
	return null;
    }
    
    public boolean method398() {
	return true;
    }
    
    public boolean method403() {
	return true;
    }
    
    public void method408(Class182 class182) {
	Object object = null;
	Class525_Sub16_Sub17 class525_sub16_sub17;
	if (null == aClass525_Sub16_Sub17_12104 && aBool12105) {
	    Class20 class20 = method18754(class182, 262144, true, (byte) 76);
	    class525_sub16_sub17
		= (Class525_Sub16_Sub17) (class20 != null ? class20.anObject208
					  : null);
	} else {
	    class525_sub16_sub17 = aClass525_Sub16_Sub17_12104;
	    aClass525_Sub16_Sub17_12104 = null;
	}
	Class446 class446 = method10818().aClass446_4807;
	if (null != class525_sub16_sub17)
	    aClass546_10872.method8984(class525_sub16_sub17, aByte10870,
				       (int) class446.aFloat4895,
				       (int) class446.aFloat4897, null,
				       (short) -8419);
    }
    
    boolean method16933() {
	if (null != aClass179_12097)
	    return aClass179_12097.method3017();
	return false;
    }
    
    public void method410(Class182 class182) {
	Object object = null;
	Class525_Sub16_Sub17 class525_sub16_sub17;
	if (null == aClass525_Sub16_Sub17_12104 && aBool12105) {
	    Class20 class20 = method18754(class182, 262144, true, (byte) 49);
	    class525_sub16_sub17
		= (Class525_Sub16_Sub17) (class20 != null ? class20.anObject208
					  : null);
	} else {
	    class525_sub16_sub17 = aClass525_Sub16_Sub17_12104;
	    aClass525_Sub16_Sub17_12104 = null;
	}
	Class446 class446 = method10818().aClass446_4807;
	if (null != class525_sub16_sub17)
	    aClass546_10872.method8984(class525_sub16_sub17, aByte10870,
				       (int) class446.aFloat4895,
				       (int) class446.aFloat4897, null,
				       (short) -6415);
    }
    
    public int method400() {
	return aByte12101;
    }
    
    public Class553 method16946(Class182 class182) {
	Class446 class446 = method10818().aClass446_4807;
	if (null == aClass553_12096)
	    aClass553_12096
		= Class103.method1893((int) class446.aFloat4895,
				      (int) class446.aFloat4896,
				      (int) class446.aFloat4897,
				      method18751(class182, 0, -284109796),
				      -650409126);
	return aClass553_12096;
    }
    
    public void method397(Class182 class182) {
	Object object = null;
	Class525_Sub16_Sub17 class525_sub16_sub17;
	if (null == aClass525_Sub16_Sub17_12104 && aBool12105) {
	    Class20 class20 = method18754(class182, 262144, true, (byte) 38);
	    class525_sub16_sub17
		= (Class525_Sub16_Sub17) (class20 != null ? class20.anObject208
					  : null);
	} else {
	    class525_sub16_sub17 = aClass525_Sub16_Sub17_12104;
	    aClass525_Sub16_Sub17_12104 = null;
	}
	Class446 class446 = method10818().aClass446_4807;
	if (class525_sub16_sub17 != null)
	    aClass546_10872.method9039(class525_sub16_sub17, aByte10870,
				       (int) class446.aFloat4895,
				       (int) class446.aFloat4897, null,
				       599202178);
    }
    
    boolean method16934() {
	if (null != aClass179_12097)
	    return aClass179_12097.method3017();
	return false;
    }
    
    boolean method16929() {
	if (null != aClass179_12097)
	    return aClass179_12097.method3017();
	return false;
    }
    
    boolean method16930() {
	if (null != aClass179_12097)
	    return aClass179_12097.method3017();
	return false;
    }
    
    boolean method16931() {
	if (null != aClass179_12097)
	    return aClass179_12097.method3017();
	return false;
    }
    
    public int method71() {
	return -1747297249 * anInt12100;
    }
    
    boolean method16950() {
	if (null != aClass179_12097)
	    return !aClass179_12097.method2977();
	return true;
    }
    
    Class20 method18754(Class182 class182, int i, boolean bool, byte i_12_) {
	ObjectDefinitions class602
	    = ((ObjectDefinitions)
	       aClass40_Sub11_12102.method76(-1747297249 * anInt12100,
					     -87640480));
	Class161 class161;
	Class161 class161_13_;
	if (aBool12103) {
	    class161 = aClass546_10872.aClass161Array7249[aByte10870];
	    class161_13_ = aClass546_10872.aClass161Array7215[0];
	} else {
	    class161 = aClass546_10872.aClass161Array7215[aByte10870];
	    if (aByte10870 < 3)
		class161_13_
		    = aClass546_10872.aClass161Array7215[aByte10870 + 1];
	    else
		class161_13_ = null;
	}
	Class446 class446 = method10818().aClass446_4807;
	return class602.method9919(class182, i, aByte12101, aByte12098,
				   class161, class161_13_,
				   (int) class446.aFloat4895,
				   (int) class446.aFloat4896,
				   (int) class446.aFloat4897, bool, null,
				   2033572611);
    }
    
    public int method16935() {
	return null != aClass179_12097 ? aClass179_12097.method2960() : 0;
    }
    
    void method16963(Class182 class182) {
	/* empty */
    }
    
    public void method411(Class182 class182) {
	Object object = null;
	Class525_Sub16_Sub17 class525_sub16_sub17;
	if (null == aClass525_Sub16_Sub17_12104 && aBool12105) {
	    Class20 class20 = method18754(class182, 262144, true, (byte) 126);
	    class525_sub16_sub17
		= (Class525_Sub16_Sub17) (class20 != null ? class20.anObject208
					  : null);
	} else {
	    class525_sub16_sub17 = aClass525_Sub16_Sub17_12104;
	    aClass525_Sub16_Sub17_12104 = null;
	}
	Class446 class446 = method10818().aClass446_4807;
	if (class525_sub16_sub17 != null)
	    aClass546_10872.method9039(class525_sub16_sub17, aByte10870,
				       (int) class446.aFloat4895,
				       (int) class446.aFloat4897, null,
				       2061900448);
    }
    
    boolean method16939(Class182 class182, int i, int i_14_) {
	Class443 class443
	    = (((ObjectDefinitions)
		aClass40_Sub11_12102.method76(anInt12100 * -1747297249,
					      -963842747))
	       .aClass443_7920);
	if (null != class443)
	    return class182.method3414(i, i_14_, method10826(), class443,
				       (byte) -75);
	Class179 class179 = method18751(class182, 131072, 169094301);
	if (null != class179) {
	    Class444 class444 = method10826();
	    return class179.method2954(i, i_14_, class444, false, 0);
	}
	return false;
    }
    
    boolean method16940(Class182 class182, int i, int i_15_) {
	Class443 class443
	    = (((ObjectDefinitions)
		aClass40_Sub11_12102.method76(anInt12100 * -1747297249,
					      990760410))
	       .aClass443_7920);
	if (null != class443)
	    return class182.method3414(i, i_15_, method10826(), class443,
				       (byte) -17);
	Class179 class179 = method18751(class182, 131072, -1773628761);
	if (null != class179) {
	    Class444 class444 = method10826();
	    return class179.method2954(i, i_15_, class444, false, 0);
	}
	return false;
    }
    
    public void method412(Class182 class182) {
	Object object = null;
	Class525_Sub16_Sub17 class525_sub16_sub17;
	if (null == aClass525_Sub16_Sub17_12104 && aBool12105) {
	    Class20 class20 = method18754(class182, 262144, true, (byte) 33);
	    class525_sub16_sub17
		= (Class525_Sub16_Sub17) (class20 != null ? class20.anObject208
					  : null);
	} else {
	    class525_sub16_sub17 = aClass525_Sub16_Sub17_12104;
	    aClass525_Sub16_Sub17_12104 = null;
	}
	Class446 class446 = method10818().aClass446_4807;
	if (class525_sub16_sub17 != null)
	    aClass546_10872.method9039(class525_sub16_sub17, aByte10870,
				       (int) class446.aFloat4895,
				       (int) class446.aFloat4897, null,
				       2110729950);
    }
    
    boolean method16948() {
	if (null != aClass179_12097)
	    return !aClass179_12097.method2977();
	return true;
    }
    
    boolean method16949() {
	if (null != aClass179_12097)
	    return !aClass179_12097.method2977();
	return true;
    }
    
    public void method407(Class182 class182) {
	Object object = null;
	Class525_Sub16_Sub17 class525_sub16_sub17;
	if (null == aClass525_Sub16_Sub17_12104 && aBool12105) {
	    Class20 class20 = method18754(class182, 262144, true, (byte) 6);
	    class525_sub16_sub17
		= (Class525_Sub16_Sub17) (class20 != null ? class20.anObject208
					  : null);
	} else {
	    class525_sub16_sub17 = aClass525_Sub16_Sub17_12104;
	    aClass525_Sub16_Sub17_12104 = null;
	}
	Class446 class446 = method10818().aClass446_4807;
	if (null != class525_sub16_sub17)
	    aClass546_10872.method8984(class525_sub16_sub17, aByte10870,
				       (int) class446.aFloat4895,
				       (int) class446.aFloat4897, null,
				       (short) 20388);
    }
    
    boolean method16964() {
	if (null != aClass179_12097)
	    return !aClass179_12097.method2977();
	return true;
    }
    
    public void method393(Class182 class182, int i) {
	Object object = null;
	Class525_Sub16_Sub17 class525_sub16_sub17;
	if (null == aClass525_Sub16_Sub17_12104 && aBool12105) {
	    Class20 class20 = method18754(class182, 262144, true, (byte) 20);
	    class525_sub16_sub17
		= (Class525_Sub16_Sub17) (class20 != null ? class20.anObject208
					  : null);
	} else {
	    class525_sub16_sub17 = aClass525_Sub16_Sub17_12104;
	    aClass525_Sub16_Sub17_12104 = null;
	}
	Class446 class446 = method10818().aClass446_4807;
	if (class525_sub16_sub17 != null)
	    aClass546_10872.method9039(class525_sub16_sub17, aByte10870,
				       (int) class446.aFloat4895,
				       (int) class446.aFloat4897, null,
				       1291618040);
    }
    
    public Class553 method16953(Class182 class182) {
	Class446 class446 = method10818().aClass446_4807;
	if (null == aClass553_12096)
	    aClass553_12096
		= Class103.method1893((int) class446.aFloat4895,
				      (int) class446.aFloat4896,
				      (int) class446.aFloat4897,
				      method18751(class182, 0, 694096497),
				      -650409126);
	return aClass553_12096;
    }
    
    public Class553 method16955(Class182 class182) {
	Class446 class446 = method10818().aClass446_4807;
	if (null == aClass553_12096)
	    aClass553_12096
		= Class103.method1893((int) class446.aFloat4895,
				      (int) class446.aFloat4896,
				      (int) class446.aFloat4897,
				      method18751(class182, 0, 1050225701),
				      -650409126);
	return aClass553_12096;
    }
    
    public int method401() {
	return aByte12098;
    }
    
    Class567 method16921(Class182 class182) {
	if (null == aClass179_12097)
	    return null;
	Class444 class444 = class182.method3225();
	class444.method7154(method10826());
	class444.method7147((float) aShort11942, 0.0F, (float) aShort11939);
	Class567 class567 = Class293.method5303(aBool12099, (short) -3717);
	Class443 class443
	    = (((ObjectDefinitions)
		aClass40_Sub11_12102.method76(anInt12100 * -1747297249,
					      -1155909169))
	       .aClass443_7920);
	if (null != class443) {
	    aClass179_12097.method2953(class444, null, 0);
	    class182.method3371(class444, aClass211Array10869[0], class443);
	} else
	    aClass179_12097.method2953(class444, aClass211Array10869[0], 0);
	return class567;
    }
    
    Class179 method18755(Class182 class182, int i) {
	if (null != aClass179_12097
	    && class182.method3321(aClass179_12097.method2928(), i) == 0)
	    return aClass179_12097;
	Class20 class20 = method18754(class182, i, false, (byte) 5);
	if (null != class20)
	    return (Class179) class20.anObject207;
	return null;
    }
    
    boolean method16965(Class182 class182, int i, int i_16_) {
	Class443 class443
	    = (((ObjectDefinitions)
		aClass40_Sub11_12102.method76(anInt12100 * -1747297249,
					      -731592141))
	       .aClass443_7920);
	if (null != class443)
	    return class182.method3414(i, i_16_, method10826(), class443,
				       (byte) -31);
	Class179 class179 = method18751(class182, 131072, -1947303825);
	if (null != class179) {
	    Class444 class444 = method10826();
	    return class179.method2954(i, i_16_, class444, false, 0);
	}
	return false;
    }
    
    public int method16909(byte i) {
	return null != aClass179_12097 ? aClass179_12097.method2960() : 0;
    }
    
    static final void method18756(Class683 class683, int i) {
	class683.anInt8662 -= -1189665054;
	int i_17_ = class683.anIntArray8661[class683.anInt8662 * 501271953];
	int i_18_
	    = class683.anIntArray8661[501271953 * class683.anInt8662 + 1];
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = AnimationSkin.method3922(i_17_, i_18_, true, -1179952119);
    }
    
    static final void method18757(Class683 class683, int i) {
	if (null != Class404.aClass525_Sub25_4148) {
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= 1;
	    class683.aClass525_Sub25_8653 = Class404.aClass525_Sub25_4148;
	} else
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= 0;
    }
}
