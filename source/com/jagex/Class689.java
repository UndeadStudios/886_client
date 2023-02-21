/* Class689 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class689
{
    static Class40_Sub8 aClass40_Sub8_8720;
    int anInt8721;
    boolean aBool8722;
    Class194 aClass194_8723;
    int anInt8724;
    int anInt8725;
    int anInt8726;
    public static final int anInt8727 = 0;
    int anInt8728;
    boolean aBool8729 = false;
    boolean aBool8730 = false;
    public static final int anInt8731 = 2;
    public static final int anInt8732 = 1;
    int anInt8733;
    Class691 aClass691_8734;
    Class691 aClass691_8735;
    static int[] anIntArray8736;
    
    public final int method14019(int i) {
	return anInt8725 * 1203028525;
    }
    
    public final void method14020(Class689 class689_0_, int i) {
	aClass194_8723 = class689_0_.aClass194_8723;
	aBool8729 = class689_0_.aBool8729;
	aBool8730 = class689_0_.aBool8730;
	anInt8725 = class689_0_.anInt8725 * 1;
	anInt8721 = class689_0_.anInt8721 * 1;
	anInt8733 = class689_0_.anInt8733 * 1;
	anInt8728 = 1 * class689_0_.anInt8728;
	anInt8724 = class689_0_.anInt8724 * 1;
	method14045(-1389867987);
    }
    
    public final boolean method14021(int i) {
	return null != aClass194_8723;
    }
    
    public static void method14022(Class40_Sub8 class40_sub8) {
	aClass40_Sub8_8720 = class40_sub8;
    }
    
    public final Class194 method14023() {
	return aClass194_8723;
    }
    
    final void method14024() {
	aClass691_8734.method14104((byte) 43);
	if (aBool8730)
	    aClass691_8735.method14104((byte) 39);
    }
    
    public final void method14025(int i, int i_1_, short i_2_) {
	method14082(i, i_1_, 0, false, -236994588);
    }
    
    public final void method14026(int i, boolean bool, int i_3_) {
	method14082(i, 0, 0, bool, -54129788);
    }
    
    public final void method14027(int i, boolean bool, boolean bool_4_,
				  int i_5_) {
	method14029(i, 0, 0, bool, bool_4_, 2098509974);
    }
    
    public final Class194 method14028() {
	return aClass194_8723;
    }
    
    final void method14029(int i, int i_6_, int i_7_, boolean bool,
			   boolean bool_8_, int i_9_) {
	if (i != method14048(-1429661382)) {
	    if (-1 != i) {
		if (aClass194_8723 != null
		    && i == aClass194_8723.anInt2153 * 1232563165) {
		    if (aClass194_8723.anInt2154 * -871006613 == 0)
			return;
		} else {
		    aClass194_8723
			= (Class194) aClass40_Sub8_8720.method76(i, 377806961);
		    if (null == aClass194_8723
			|| null == aClass194_8723.anIntArray2159) {
			aClass194_8723 = null;
			return;
		    }
		}
		anInt8721 = 0;
		anInt8725 = 1628888485 * i_6_;
		anInt8726 = 2021587297 * i_7_;
		aBool8722 = bool_8_;
		if (bool) {
		    anInt8733 = ((int) (Math.random()
					* (double) (aClass194_8723
						    .anIntArray2159).length)
				 * -452282149);
		    anInt8724
			= ((int) (Math.random()
				  * (double) (aClass194_8723.anIntArray2156
					      [anInt8733 * -685079725]))
			   * -877515481);
		} else {
		    anInt8733 = 0;
		    anInt8724 = 0;
		}
		anInt8728 = -1039820139 + anInt8733 * 1163746639;
		if (-737058627 * anInt8728 < 0
		    || (anInt8728 * -737058627
			>= aClass194_8723.anIntArray2159.length))
		    anInt8728 = 1039820139;
		if (anInt8725 * 1203028525 == 0)
		    method14079(aClass194_8723, anInt8733 * -685079725,
				-277022528);
		aBool8729 = false;
	    } else
		aClass194_8723 = null;
	    method14045(-1389867987);
	}
    }
    
    public final boolean method14030(int i) {
	return 0 != anInt8725 * 1203028525;
    }
    
    final void method14031() {
	aClass691_8734.method14104((byte) 106);
	if (aBool8730)
	    aClass691_8735.method14104((byte) 37);
    }
    
    public final void method14032(int i, short i_10_) {
	anInt8725 = i * 1628888485;
    }
    
    public final int method14033(int i) {
	if (method14044(1083704353)) {
	    int i_11_ = 0;
	    if (method14044(-327589816)) {
		i_11_ |= -1721487139 * aClass691_8734.anInt8746;
		if (aBool8730 && null != aClass194_8723.anIntArray2171)
		    i_11_ |= -1721487139 * aClass691_8735.anInt8746;
	    }
	    return i_11_;
	}
	return 0;
    }
    
    public final void method14034(Class179 class179, int i, int i_12_) {
	if (aClass194_8723 != null) {
	    if (aClass194_8723.anIntArray2159 != null
		&& method14044(-1459003932)) {
		class179.method2941(aClass691_8734.aClass525_Sub16_Sub18_8748,
				    1740761095 * aClass691_8734.anInt8744,
				    aClass691_8734.aClass525_Sub16_Sub18_8747,
				    aClass691_8734.anInt8745 * -1589968357,
				    anInt8724 * 1733587607,
				    (aClass194_8723.anIntArray2156
				     [anInt8733 * -685079725]),
				    i, aClass194_8723.aBool2169);
		if (aBool8730 && aClass194_8723.anIntArray2171 != null
		    && aClass691_8735.aBool8743)
		    class179.method2941
			(aClass691_8735.aClass525_Sub16_Sub18_8748,
			 aClass691_8735.anInt8744 * 1740761095,
			 aClass691_8735.aClass525_Sub16_Sub18_8747,
			 -1589968357 * aClass691_8735.anInt8745,
			 anInt8724 * 1733587607,
			 aClass194_8723.anIntArray2156[anInt8733 * -685079725],
			 i, aClass194_8723.aBool2169);
	    }
	}
    }
    
    public final void method14035(Class179 class179, int i, int i_13_,
				  int i_14_) {
	if (aClass194_8723.anIntArray2159 != null && method14044(1261041017)) {
	    class179.method3041(aClass691_8734.aClass525_Sub16_Sub18_8748,
				1740761095 * aClass691_8734.anInt8744,
				aClass691_8734.aClass525_Sub16_Sub18_8747,
				-1589968357 * aClass691_8734.anInt8745,
				1733587607 * anInt8724,
				(aClass194_8723.anIntArray2156
				 [-685079725 * anInt8733]),
				i, i_13_, aClass194_8723.aBool2169, null);
	    if (aBool8730 && null != aClass194_8723.anIntArray2171
		&& aClass691_8735.aBool8743)
		class179.method3041(aClass691_8735.aClass525_Sub16_Sub18_8748,
				    aClass691_8735.anInt8744 * 1740761095,
				    aClass691_8735.aClass525_Sub16_Sub18_8747,
				    aClass691_8735.anInt8745 * -1589968357,
				    anInt8724 * 1733587607,
				    (aClass194_8723.anIntArray2156
				     [anInt8733 * -685079725]),
				    i, i_13_, aClass194_8723.aBool2169, null);
	}
    }
    
    public final void method14036(Class179 class179, byte i) {
	if (aClass194_8723.anIntArray2159 != null
	    && method14044(-2089877127)) {
	    class179.method2944(aClass691_8734.aClass525_Sub16_Sub18_8748,
				aClass691_8734.anInt8744 * 1740761095);
	    if (aBool8730 && aClass194_8723.anIntArray2171 != null
		&& aClass691_8735.aBool8743)
		class179.method2944(aClass691_8735.aClass525_Sub16_Sub18_8748,
				    1740761095 * aClass691_8735.anInt8744);
	}
    }
    
    public final void method14037(Class179 class179, int i) {
	if (aClass194_8723 != null) {
	    if (aClass194_8723.anIntArray2159 != null
		&& method14044(1148362114)) {
		class179.method2941(aClass691_8734.aClass525_Sub16_Sub18_8748,
				    1740761095 * aClass691_8734.anInt8744,
				    aClass691_8734.aClass525_Sub16_Sub18_8747,
				    aClass691_8734.anInt8745 * -1589968357,
				    anInt8724 * 1733587607,
				    (aClass194_8723.anIntArray2156
				     [anInt8733 * -685079725]),
				    i, aClass194_8723.aBool2169);
		if (aBool8730 && aClass194_8723.anIntArray2171 != null
		    && aClass691_8735.aBool8743)
		    class179.method2941
			(aClass691_8735.aClass525_Sub16_Sub18_8748,
			 aClass691_8735.anInt8744 * 1740761095,
			 aClass691_8735.aClass525_Sub16_Sub18_8747,
			 -1589968357 * aClass691_8735.anInt8745,
			 anInt8724 * 1733587607,
			 aClass194_8723.anIntArray2156[anInt8733 * -685079725],
			 i, aClass194_8723.aBool2169);
	    }
	}
    }
    
    public final void method14038(byte i) {
	anInt8721 = 0;
    }
    
    public final boolean method14039(int i) {
	return aBool8729;
    }
    
    public final void method14040(int i, byte i_15_) {
	anInt8733 = 0;
	anInt8728 = ((aClass194_8723.anIntArray2159.length > 1 ? 1 : -1)
		     * -1039820139);
	anInt8724 = 0;
	aBool8729 = false;
	anInt8725 = 1628888485 * i;
	anInt8721 = 0;
	if (aClass194_8723 != null & null != aClass194_8723.anIntArray2159) {
	    method14079(aClass194_8723, -685079725 * anInt8733, 291620998);
	    method14045(-1389867987);
	}
    }
    
    public final boolean method14041(int i, int i_16_) {
	if (aClass194_8723 == null || 0 == i)
	    return false;
	if (anInt8725 * 1203028525 > 0) {
	    if (anInt8725 * 1203028525 > i) {
		anInt8725 -= i * 1628888485;
		return false;
	    }
	    i -= anInt8725 * 1203028525;
	    anInt8725 = 0;
	    method14079(aClass194_8723, -685079725 * anInt8733, 284703303);
	}
	i += anInt8724 * 1733587607;
	boolean bool = aClass194_8723.aBool2163 | Class194.aBool2174;
	if (i > 100 && 815451139 * aClass194_8723.anInt2168 > 0) {
	    int i_17_;
	    for (i_17_ = (aClass194_8723.anIntArray2159.length
			  - aClass194_8723.anInt2168 * 815451139);
		 (anInt8733 * -685079725 < i_17_
		  && i > (aClass194_8723.anIntArray2156
			  [anInt8733 * -685079725]));
		 anInt8733 += -452282149)
		i -= aClass194_8723.anIntArray2156[-685079725 * anInt8733];
	    if (anInt8733 * -685079725 >= i_17_) {
		int i_18_ = 0;
		for (int i_19_ = i_17_;
		     i_19_ < aClass194_8723.anIntArray2159.length; i_19_++)
		    i_18_ += aClass194_8723.anIntArray2156[i_19_];
		if (0 == anInt8726 * -1329370463)
		    anInt8721 += i / i_18_ * -799486215;
		i %= i_18_;
	    }
	    anInt8728 = -1039820139 + 1163746639 * anInt8733;
	    if (anInt8728 * -737058627
		>= aClass194_8723.anIntArray2159.length) {
		if (815451139 * aClass194_8723.anInt2168 == -1 && aBool8722)
		    anInt8728 = 0;
		else
		    anInt8728 -= -1428059201 * aClass194_8723.anInt2168;
		if (anInt8728 * -737058627 < 0
		    || (anInt8728 * -737058627
			>= aClass194_8723.anIntArray2159.length))
		    anInt8728 = 1039820139;
	    }
	    bool = true;
	}
	while (i > aClass194_8723.anIntArray2156[-685079725 * anInt8733]) {
	    bool = true;
	    i -= (aClass194_8723.anIntArray2156
		  [(anInt8733 += -452282149) * -685079725 - 1]);
	    if (-685079725 * anInt8733
		>= aClass194_8723.anIntArray2159.length) {
		if (-1 != aClass194_8723.anInt2168 * 815451139
		    && -1329370463 * anInt8726 != 2) {
		    anInt8733 -= aClass194_8723.anInt2168 * 2116857489;
		    if (anInt8726 * -1329370463 == 0)
			anInt8721 += -799486215;
		}
		if ((125080393 * anInt8721
		     >= aClass194_8723.anInt2165 * -1588364395)
		    || anInt8733 * -685079725 < 0
		    || (anInt8733 * -685079725
			>= aClass194_8723.anIntArray2159.length)) {
		    aBool8729 = true;
		    break;
		}
	    }
	    method14079(aClass194_8723, anInt8733 * -685079725, 1244412943);
	    anInt8728 = -1039820139 + anInt8733 * 1163746639;
	    if (anInt8728 * -737058627
		>= aClass194_8723.anIntArray2159.length) {
		if (aClass194_8723.anInt2168 * 815451139 == -1 && aBool8722)
		    anInt8728 = 0;
		else
		    anInt8728 -= -1428059201 * aClass194_8723.anInt2168;
		if (-737058627 * anInt8728 < 0
		    || (-737058627 * anInt8728
			>= aClass194_8723.anIntArray2159.length))
		    anInt8728 = 1039820139;
	    }
	}
	anInt8724 = -877515481 * i;
	if (bool)
	    method14045(-1389867987);
	return bool;
    }
    
    public final void method14042(int i, int i_20_, int i_21_, boolean bool) {
	method14029(i, i_20_, i_21_, bool, false, 1572809815);
    }
    
    public final int method14043() {
	return (null != aClass194_8723 ? 1232563165 * aClass194_8723.anInt2153
		: -1);
    }
    
    final boolean method14044(int i) {
	if (aClass194_8723 != null) {
	    boolean bool
		= aClass691_8734.method14102(aClass40_Sub8_8720,
					     aClass194_8723,
					     -685079725 * anInt8733,
					     anInt8728 * -737058627,
					     aClass194_8723.anIntArray2159,
					     1648964190);
	    if (bool && aBool8730 && aClass194_8723.anIntArray2171 != null)
		aClass691_8735.method14102(aClass40_Sub8_8720, aClass194_8723,
					   -685079725 * anInt8733,
					   -737058627 * anInt8728,
					   aClass194_8723.anIntArray2171,
					   1648964190);
	    return bool;
	}
	return false;
    }
    
    final void method14045(int i) {
	aClass691_8734.method14104((byte) 101);
	if (aBool8730)
	    aClass691_8735.method14104((byte) 12);
    }
    
    void method14046(Class194 class194, int i) {
	/* empty */
    }
    
    void method14047(Class194 class194, int i) {
	/* empty */
    }
    
    public final int method14048(int i) {
	return (null != aClass194_8723 ? 1232563165 * aClass194_8723.anInt2153
		: -1);
    }
    
    public static void method14049(Class40_Sub8 class40_sub8) {
	aClass40_Sub8_8720 = class40_sub8;
    }
    
    public final void method14050(Class689 class689_22_) {
	aClass194_8723 = class689_22_.aClass194_8723;
	aBool8729 = class689_22_.aBool8729;
	aBool8730 = class689_22_.aBool8730;
	anInt8725 = class689_22_.anInt8725 * 1;
	anInt8721 = class689_22_.anInt8721 * 1;
	anInt8733 = class689_22_.anInt8733 * 1;
	anInt8728 = 1 * class689_22_.anInt8728;
	anInt8724 = class689_22_.anInt8724 * 1;
	method14045(-1389867987);
    }
    
    public final boolean method14051() {
	return null != aClass194_8723;
    }
    
    public final Class194 method14052() {
	return aClass194_8723;
    }
    
    public final Class194 method14053() {
	return aClass194_8723;
    }
    
    public final int method14054() {
	return (null != aClass194_8723 ? 1232563165 * aClass194_8723.anInt2153
		: -1);
    }
    
    public final void method14055(int i) {
	method14082(i, 0, 0, false, 1253459555);
    }
    
    public final Class194 method14056() {
	return aClass194_8723;
    }
    
    public final void method14057(int i, int i_23_) {
	method14082(i, i_23_, 0, false, -2026298100);
    }
    
    public final Class194 method14058(int i) {
	return aClass194_8723;
    }
    
    public final int method14059() {
	return (null != aClass194_8723 ? 1232563165 * aClass194_8723.anInt2153
		: -1);
    }
    
    public final void method14060() {
	method14040(0, (byte) 1);
    }
    
    public final boolean method14061() {
	return aBool8729;
    }
    
    public final void method14062(int i, boolean bool) {
	method14082(i, 0, 0, bool, -616567303);
    }
    
    public final void method14063(int i, boolean bool, boolean bool_24_) {
	method14029(i, 0, 0, bool, bool_24_, 1659097721);
    }
    
    public final boolean method14064(int i, byte i_25_) {
	if (null == aClass194_8723 | (i -= 1203028525 * anInt8725) <= 0)
	    return false;
	return (aClass194_8723.aBool2163
		| (i + 1733587607 * anInt8724
		   > aClass194_8723.anIntArray2156[-685079725 * anInt8733]));
    }
    
    public final void method14065(int i, boolean bool, boolean bool_26_) {
	method14029(i, 0, 0, bool, bool_26_, 2060269971);
    }
    
    public final void method14066(int i) {
	anInt8725 = i * 1628888485;
    }
    
    public static final void method14067(Class179 class179, Class689 class689,
					 Class689 class689_27_) {
	if (class689.method14044(-78599870)
	    && class689_27_.method14044(-989795670)) {
	    Class194 class194 = class689.aClass194_8723;
	    Class194 class194_28_ = class689_27_.aClass194_8723;
	    class179.method2951
		(class689.aClass691_8734.aClass525_Sub16_Sub18_8748,
		 class689.aClass691_8734.anInt8744 * 1740761095,
		 class689.aClass691_8734.aClass525_Sub16_Sub18_8747,
		 class689.aClass691_8734.anInt8745 * -1589968357,
		 1733587607 * class689.anInt8724,
		 class194.anIntArray2156[class689.anInt8733 * -685079725],
		 class689_27_.aClass691_8734.aClass525_Sub16_Sub18_8748,
		 1740761095 * class689_27_.aClass691_8734.anInt8744,
		 class689_27_.aClass691_8734.aClass525_Sub16_Sub18_8747,
		 -1589968357 * class689_27_.aClass691_8734.anInt8745,
		 class689_27_.anInt8724 * 1733587607,
		 (class194_28_.anIntArray2156
		  [class689_27_.anInt8733 * -685079725]),
		 (class194.aClass210_2158 != null
		  ? class194.aClass210_2158.aBoolArray2262 : null),
		 class194.aBool2169 | class194_28_.aBool2169);
	}
    }
    
    public final void method14068(int i, byte i_29_) {
	method14082(i, 0, 0, false, 964115709);
    }
    
    public final int method14069() {
	return anInt8725 * 1203028525;
    }
    
    public final int method14070() {
	return anInt8725 * 1203028525;
    }
    
    public final void method14071(int i) {
	method14040(0, (byte) 1);
    }
    
    public final void method14072(Class179 class179) {
	if (aClass194_8723.anIntArray2159 != null
	    && method14044(-1224715572)) {
	    class179.method2944(aClass691_8734.aClass525_Sub16_Sub18_8748,
				aClass691_8734.anInt8744 * 1740761095);
	    if (aBool8730 && aClass194_8723.anIntArray2171 != null
		&& aClass691_8735.aBool8743)
		class179.method2944(aClass691_8735.aClass525_Sub16_Sub18_8748,
				    1740761095 * aClass691_8735.anInt8744);
	}
    }
    
    public final void method14073(int i) {
	anInt8725 = i * 1628888485;
    }
    
    public final void method14074(int i) {
	anInt8725 = i * 1628888485;
    }
    
    public final boolean method14075() {
	return 0 != anInt8725 * 1203028525;
    }
    
    public final void method14076(Class179 class179, int i, int i_30_) {
	if (aClass194_8723.anIntArray2159 != null && method14044(1053138178)) {
	    class179.method3041(aClass691_8734.aClass525_Sub16_Sub18_8748,
				1740761095 * aClass691_8734.anInt8744,
				aClass691_8734.aClass525_Sub16_Sub18_8747,
				-1589968357 * aClass691_8734.anInt8745,
				1733587607 * anInt8724,
				(aClass194_8723.anIntArray2156
				 [-685079725 * anInt8733]),
				i, i_30_, aClass194_8723.aBool2169, null);
	    if (aBool8730 && null != aClass194_8723.anIntArray2171
		&& aClass691_8735.aBool8743)
		class179.method3041(aClass691_8735.aClass525_Sub16_Sub18_8748,
				    aClass691_8735.anInt8744 * 1740761095,
				    aClass691_8735.aClass525_Sub16_Sub18_8747,
				    aClass691_8735.anInt8745 * -1589968357,
				    anInt8724 * 1733587607,
				    (aClass194_8723.anIntArray2156
				     [anInt8733 * -685079725]),
				    i, i_30_, aClass194_8723.aBool2169, null);
	}
    }
    
    public final void method14077(Class179 class179, int i, int i_31_) {
	if (aClass194_8723.anIntArray2159 != null && method14044(1793897736)) {
	    class179.method3041(aClass691_8734.aClass525_Sub16_Sub18_8748,
				1740761095 * aClass691_8734.anInt8744,
				aClass691_8734.aClass525_Sub16_Sub18_8747,
				-1589968357 * aClass691_8734.anInt8745,
				1733587607 * anInt8724,
				(aClass194_8723.anIntArray2156
				 [-685079725 * anInt8733]),
				i, i_31_, aClass194_8723.aBool2169, null);
	    if (aBool8730 && null != aClass194_8723.anIntArray2171
		&& aClass691_8735.aBool8743)
		class179.method3041(aClass691_8735.aClass525_Sub16_Sub18_8748,
				    aClass691_8735.anInt8744 * 1740761095,
				    aClass691_8735.aClass525_Sub16_Sub18_8747,
				    aClass691_8735.anInt8745 * -1589968357,
				    anInt8724 * 1733587607,
				    (aClass194_8723.anIntArray2156
				     [anInt8733 * -685079725]),
				    i, i_31_, aClass194_8723.aBool2169, null);
	}
    }
    
    public final void method14078(Class179 class179) {
	if (aClass194_8723.anIntArray2159 != null && method14044(447035601)) {
	    class179.method2944(aClass691_8734.aClass525_Sub16_Sub18_8748,
				aClass691_8734.anInt8744 * 1740761095);
	    if (aBool8730 && aClass194_8723.anIntArray2171 != null
		&& aClass691_8735.aBool8743)
		class179.method2944(aClass691_8735.aClass525_Sub16_Sub18_8748,
				    1740761095 * aClass691_8735.anInt8744);
	}
    }
    
    void method14079(Class194 class194, int i, int i_32_) {
	/* empty */
    }
    
    public final int method14080() {
	return anInt8725 * 1203028525;
    }
    
    public final void method14081(int i, boolean bool, boolean bool_33_) {
	method14029(i, 0, 0, bool, bool_33_, 1742889955);
    }
    
    public final void method14082(int i, int i_34_, int i_35_, boolean bool,
				  int i_36_) {
	method14029(i, i_34_, i_35_, bool, false, 1585640916);
    }
    
    public final void method14083() {
	anInt8721 = 0;
    }
    
    public final void method14084() {
	method14040(0, (byte) 1);
    }
    
    public final boolean method14085() {
	return aBool8729;
    }
    
    public final void method14086(int i) {
	anInt8733 = 0;
	anInt8728 = ((aClass194_8723.anIntArray2159.length > 1 ? 1 : -1)
		     * -1039820139);
	anInt8724 = 0;
	aBool8729 = false;
	anInt8725 = 1628888485 * i;
	anInt8721 = 0;
	if (aClass194_8723 != null & null != aClass194_8723.anIntArray2159) {
	    method14079(aClass194_8723, -685079725 * anInt8733, 1187193203);
	    method14045(-1389867987);
	}
    }
    
    public final boolean method14087(int i) {
	if (aClass194_8723 == null || 0 == i)
	    return false;
	if (anInt8725 * 1203028525 > 0) {
	    if (anInt8725 * 1203028525 > i) {
		anInt8725 -= i * 1628888485;
		return false;
	    }
	    i -= anInt8725 * 1203028525;
	    anInt8725 = 0;
	    method14079(aClass194_8723, -685079725 * anInt8733, -1906328441);
	}
	i += anInt8724 * 1733587607;
	boolean bool = aClass194_8723.aBool2163 | Class194.aBool2174;
	if (i > 100 && 815451139 * aClass194_8723.anInt2168 > 0) {
	    int i_37_;
	    for (i_37_ = (aClass194_8723.anIntArray2159.length
			  - aClass194_8723.anInt2168 * 815451139);
		 (anInt8733 * -685079725 < i_37_
		  && i > (aClass194_8723.anIntArray2156
			  [anInt8733 * -685079725]));
		 anInt8733 += -452282149)
		i -= aClass194_8723.anIntArray2156[-685079725 * anInt8733];
	    if (anInt8733 * -685079725 >= i_37_) {
		int i_38_ = 0;
		for (int i_39_ = i_37_;
		     i_39_ < aClass194_8723.anIntArray2159.length; i_39_++)
		    i_38_ += aClass194_8723.anIntArray2156[i_39_];
		if (0 == anInt8726 * -1329370463)
		    anInt8721 += i / i_38_ * -799486215;
		i %= i_38_;
	    }
	    anInt8728 = -1039820139 + 1163746639 * anInt8733;
	    if (anInt8728 * -737058627
		>= aClass194_8723.anIntArray2159.length) {
		if (815451139 * aClass194_8723.anInt2168 == -1 && aBool8722)
		    anInt8728 = 0;
		else
		    anInt8728 -= -1428059201 * aClass194_8723.anInt2168;
		if (anInt8728 * -737058627 < 0
		    || (anInt8728 * -737058627
			>= aClass194_8723.anIntArray2159.length))
		    anInt8728 = 1039820139;
	    }
	    bool = true;
	}
	while (i > aClass194_8723.anIntArray2156[-685079725 * anInt8733]) {
	    bool = true;
	    i -= (aClass194_8723.anIntArray2156
		  [(anInt8733 += -452282149) * -685079725 - 1]);
	    if (-685079725 * anInt8733
		>= aClass194_8723.anIntArray2159.length) {
		if (-1 != aClass194_8723.anInt2168 * 815451139
		    && -1329370463 * anInt8726 != 2) {
		    anInt8733 -= aClass194_8723.anInt2168 * 2116857489;
		    if (anInt8726 * -1329370463 == 0)
			anInt8721 += -799486215;
		}
		if ((125080393 * anInt8721
		     >= aClass194_8723.anInt2165 * -1588364395)
		    || anInt8733 * -685079725 < 0
		    || (anInt8733 * -685079725
			>= aClass194_8723.anIntArray2159.length)) {
		    aBool8729 = true;
		    break;
		}
	    }
	    method14079(aClass194_8723, anInt8733 * -685079725, -1878862071);
	    anInt8728 = -1039820139 + anInt8733 * 1163746639;
	    if (anInt8728 * -737058627
		>= aClass194_8723.anIntArray2159.length) {
		if (aClass194_8723.anInt2168 * 815451139 == -1 && aBool8722)
		    anInt8728 = 0;
		else
		    anInt8728 -= -1428059201 * aClass194_8723.anInt2168;
		if (-737058627 * anInt8728 < 0
		    || (-737058627 * anInt8728
			>= aClass194_8723.anIntArray2159.length))
		    anInt8728 = 1039820139;
	    }
	}
	anInt8724 = -877515481 * i;
	if (bool)
	    method14045(-1389867987);
	return bool;
    }
    
    public final boolean method14088(int i) {
	if (null == aClass194_8723 | (i -= 1203028525 * anInt8725) <= 0)
	    return false;
	return (aClass194_8723.aBool2163
		| (i + 1733587607 * anInt8724
		   > aClass194_8723.anIntArray2156[-685079725 * anInt8733]));
    }
    
    public final boolean method14089(int i) {
	if (null == aClass194_8723 | (i -= 1203028525 * anInt8725) <= 0)
	    return false;
	return (aClass194_8723.aBool2163
		| (i + 1733587607 * anInt8724
		   > aClass194_8723.anIntArray2156[-685079725 * anInt8733]));
    }
    
    public final boolean method14090(int i) {
	if (null == aClass194_8723 | (i -= 1203028525 * anInt8725) <= 0)
	    return false;
	return (aClass194_8723.aBool2163
		| (i + 1733587607 * anInt8724
		   > aClass194_8723.anIntArray2156[-685079725 * anInt8733]));
    }
    
    final void method14091(int i, int i_40_, int i_41_, boolean bool,
			   boolean bool_42_) {
	if (i != method14048(-1905916585)) {
	    if (-1 != i) {
		if (aClass194_8723 != null
		    && i == aClass194_8723.anInt2153 * 1232563165) {
		    if (aClass194_8723.anInt2154 * -871006613 == 0)
			return;
		} else {
		    aClass194_8723
			= (Class194) aClass40_Sub8_8720.method76(i,
								 -236731536);
		    if (null == aClass194_8723
			|| null == aClass194_8723.anIntArray2159) {
			aClass194_8723 = null;
			return;
		    }
		}
		anInt8721 = 0;
		anInt8725 = 1628888485 * i_40_;
		anInt8726 = 2021587297 * i_41_;
		aBool8722 = bool_42_;
		if (bool) {
		    anInt8733 = ((int) (Math.random()
					* (double) (aClass194_8723
						    .anIntArray2159).length)
				 * -452282149);
		    anInt8724
			= ((int) (Math.random()
				  * (double) (aClass194_8723.anIntArray2156
					      [anInt8733 * -685079725]))
			   * -877515481);
		} else {
		    anInt8733 = 0;
		    anInt8724 = 0;
		}
		anInt8728 = -1039820139 + anInt8733 * 1163746639;
		if (-737058627 * anInt8728 < 0
		    || (anInt8728 * -737058627
			>= aClass194_8723.anIntArray2159.length))
		    anInt8728 = 1039820139;
		if (anInt8725 * 1203028525 == 0)
		    method14079(aClass194_8723, anInt8733 * -685079725,
				475177312);
		aBool8729 = false;
	    } else
		aClass194_8723 = null;
	    method14045(-1389867987);
	}
    }
    
    public final boolean method14092(int i) {
	if (null == aClass194_8723 | (i -= 1203028525 * anInt8725) <= 0)
	    return false;
	return (aClass194_8723.aBool2163
		| (i + 1733587607 * anInt8724
		   > aClass194_8723.anIntArray2156[-685079725 * anInt8733]));
    }
    
    public final boolean method14093(int i) {
	if (null == aClass194_8723 | (i -= 1203028525 * anInt8725) <= 0)
	    return false;
	return (aClass194_8723.aBool2163
		| (i + 1733587607 * anInt8724
		   > aClass194_8723.anIntArray2156[-685079725 * anInt8733]));
    }
    
    Class689(boolean bool) {
	anInt8726 = 0;
	aBool8722 = false;
	aBool8730 = bool;
	aClass691_8734 = new Class691();
	if (aBool8730)
	    aClass691_8735 = new Class691();
	else
	    aClass691_8735 = null;
    }
    
    static final void method14094(short i) {
	for (int i_43_ = 0; i_43_ < client.anInt11216 * 1111866889; i_43_++) {
	    int i_44_ = client.anIntArray11125[i_43_];
	    Class525_Sub19 class525_sub19
		= ((Class525_Sub19)
		   client.aClass10_11121.method684((long) i_44_));
	    if (class525_sub19 != null) {
		Class656_Sub1_Sub3_Sub1_Sub2 class656_sub1_sub3_sub1_sub2
		    = ((Class656_Sub1_Sub3_Sub1_Sub2)
		       class525_sub19.anObject10571);
		Class26.method900(class656_sub1_sub3_sub1_sub2, false,
				  1737691764);
	    }
	}
    }
    
    static String method14095(Class259 class259, short i) {
	if (client.method17531(class259).method16132(1610913226) == 0)
	    return null;
	if (null == class259.aString2694
	    || class259.aString2694.trim().length() == 0) {
	    if (client.aBool11363)
		return "Hidden-use";
	    return null;
	}
	return class259.aString2694;
    }
    
    public static void method14096(int i, int i_45_) {
	Class525_Sub16_Sub10 class525_sub16_sub10
	    = Class465.method7671(4, (long) i);
	class525_sub16_sub10.method18350((byte) 30);
    }
}
