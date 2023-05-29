/* Class217 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Class217
{
    Class200 aClass200_2284;
    int anInt2285;
    static final int anInt2286 = 16384;
    static final int anInt2287 = 8192;
    static final int anInt2288 = 0;
    static final int anInt2289 = 4096;
    static final int anInt2290 = 4096;
    boolean aBool2291;
    List aList2292 = new ArrayList();
    static final int anInt2293 = 8192;
    HashMap aHashMap2294;
    HashMap aHashMap2295;
    List aList2296;
    static final int anInt2297 = 16384;
    Class200 aClass200_2298;
    Class200 aClass200_2299;
    int anInt2300;
    List aList2301 = new ArrayList();
    Interface57 anInterface57_2302;
    Class446 aClass446_2303;
    Class488 aClass488_2304;
    Class488 aClass488_2305;
    boolean aBool2306;
    int anInt2307;
    int anInt2308;
    Interface57 anInterface57_2309;
    boolean aBool2310;
    Interface57 anInterface57_2311;
    Interface57 anInterface57_2312;
    HashMap aHashMap2313;
    static Class7 aClass7_2314;
    
    public void method4022(int i) {
	Iterator iterator = aList2301.iterator();
	while (iterator.hasNext()) {
	    Class488 class488 = (Class488) iterator.next();
	    if (class488.method7910(-1571199578) == Class204.aClass204_2234) {
		class488.method7916(500, (byte) -42);
		if (class488.method7897((byte) 77).method439(-439715451)
		    == 1991744917 * anInt2285) {
		    method4052(1991744917 * anInt2285, 1393920352);
		    break;
		}
	    }
	}
	aClass488_2304 = null;
	anInt2285 = -406439357;
    }
    
    List method4023(byte i) {
	return aList2296;
    }
    
    Class200 method4024(int i) {
	return aClass200_2284;
    }
    
    Class200 method4025(int i) {
	return aClass200_2298;
    }
    
    public void method4026(Class488 class488, int i) {
	class488.method7943(this, -571908081);
	aList2301.add(class488);
    }
    
    public Class217() {
	aHashMap2294 = new HashMap();
	aHashMap2295 = new HashMap();
	aList2296 = new ArrayList();
	aHashMap2313 = new HashMap();
	aClass488_2305 = null;
	aBool2306 = false;
	anInterface57_2302 = new Class203(this);
	anInterface57_2311 = new Class209(this);
	anInterface57_2312 = new Class226(this);
	anInterface57_2309 = new Class196(this);
    }
    
    public void method4027(int i, int i_0_, byte i_1_) {
	if (!aBool2291) {
	    anInt2300 = i * -2058858799;
	    aClass200_2284 = new Class200(i_0_, 100);
	    aClass200_2298 = new Class200(10);
	    aClass200_2284.method3783(new Class192(this), (byte) 110);
	    Class657 class657 = new Class657(Class380.aClass380_3923);
	    if (class657.aClass380_8438 == Class380.aClass380_3923)
		Class661.aClass372_8473 = new Class372_Sub2(class657);
	    else if (class657.aClass380_8438 == Class380.aClass380_3924)
		Class661.aClass372_8473 = new Class372_Sub1(class657);
	    else
		throw new RuntimeException();
	    method4034(1734858213);
	    anInt2285 = -406439357;
	    aBool2291 = true;
	}
    }
    
    public void method4028(int i) {
	if (aBool2291) {
	    Class333.method5824((short) 4786);
	    if (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705 != null
		&& (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705.method10818()
		    != null)) {
		if (null == aClass446_2303)
		    aClass446_2303 = new Class446();
		aClass446_2303.aFloat4895
		    = (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705.method10818
		       ().aClass446_4807.aFloat4895);
		aClass446_2303.aFloat4896 = 0.0F;
		aClass446_2303.aFloat4897
		    = (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705.method10818
		       ().aClass446_4807.aFloat4897);
	    }
	    Iterator iterator = aHashMap2294.values().iterator();
	    while (iterator.hasNext()) {
		Interface69 interface69 = (Interface69) iterator.next();
		interface69.method211(321908456);
	    }
	    iterator = aHashMap2295.values().iterator();
	    while (iterator.hasNext()) {
		Interface69 interface69 = (Interface69) iterator.next();
		interface69.method211(2117862717);
	    }
	    iterator = aList2296.iterator();
	    while (iterator.hasNext()) {
		Interface69 interface69 = (Interface69) iterator.next();
		if (interface69.method474((byte) -29))
		    aHashMap2295.remove
			(Integer.valueOf(interface69.method439(-41766616)));
		else
		    aHashMap2294.remove
			(Integer.valueOf(interface69.method439(467532454)));
	    }
	    aList2296.clear();
	    if (null != aClass488_2305
		&& (aClass488_2305.method7879((byte) 30)
		    == Class482.aClass482_5226)
		&& !aBool2306 && null != client.aClass96_11085.aClass6_1169
		&& Class265.method4801(1777895575 * client.anInt11075,
				       -838919154)) {
		Class525_Sub15 class525_sub15
		    = Class16.method767(Class412.aClass412_4344,
					client.aClass96_11085.aClass6_1169,
					1977859884);
		class525_sub15.aClass525_Sub38_Sub2_10546.method16605
		    (aClass488_2305.method7897((byte) 13)
			 .method439(-898104842),
		     -1363367750);
		client.aClass96_11085.method1794(class525_sub15, (short) 1744);
		aBool2306 = true;
	    }
	    iterator = aList2292.iterator();
	    while (iterator.hasNext()) {
		Class488 class488 = (Class488) iterator.next();
		class488.method7896(-626519675);
		class488.method7878((byte) 32);
		Class482 class482 = class488.method7879((byte) 119);
		if (class488.method7881(131593686) == this) {
		    if (class482 == Class482.aClass482_5229
			|| Class482.aClass482_5224 == class482) {
			if ((class488.method7910(-1571199578)
			     == Class204.aClass204_2234)
			    || (class488.method7910(-1571199578)
				== Class204.aClass204_2235)) {
			    if (aClass488_2305 == class488) {
				aBool2306 = false;
				aClass488_2305 = null;
				class488.method7871(1898293137);
				aList2301.remove(class488);
			    } else {
				int i_2_ = class488.method7897((byte) 103)
					       .method439(146872298);
				boolean bool
				    = method4037(Class208.aClass208_2251
						     .method3907((short) 2404),
						 (byte) 37) > 0.0F;
				if (!aBool2310 && bool) {
				    if (anInt2285 * 1991744917 == i_2_) {
					method4052(i_2_, 1568150845);
					anInt2285 = -406439357;
				    }
				    class488.method7871(1852713623);
				    aList2301.remove(class488);
				} else if (i_2_ == -2080866315 * anInt2308) {
				    anInt2308 = 80415651;
				    aBool2310 = false;
				    class488.method7871(1928306291);
				    aList2301.remove(class488);
				    Iterator iterator_3_
					= aList2292.iterator();
				    while (iterator_3_.hasNext()) {
					Class488 class488_4_
					    = (Class488) iterator_3_.next();
					if (class488_4_.method7910(-1571199578)
					    == Class204.aClass204_2234) {
					    int i_5_
						= class488_4_.method7897
						      ((byte) 73)
						      .method439(904632274);
					    if ((i_5_ == 1991744917 * anInt2285
						 && (class488_4_
							 .method7879((byte) 52)
						     == (Class482
							 .aClass482_5229)))
						|| (class488_4_
							.method7879((byte) 94)
						    == Class482.aClass482_5228)
						|| (class488_4_
							.method7879((byte) 49)
						    == Class482.aClass482_5225)
						|| (class488_4_
							.method7879((byte) 88)
						    == (Class482
							.aClass482_5226))) {
						if (class488_4_
							.method7879((byte) 7)
						    == Class482.aClass482_5229)
						    class488_4_.method7891
							((byte) -63);
						else
						    class488_4_.method7928
							(-867125261);
						break;
					    }
					}
				    }
				} else if (bool) {
				    if (!aBool2310
					|| 1991744917 * anInt2285 != i_2_) {
					class488.method7871(2031819101);
					aList2301.remove(class488);
				    }
				    if (false == aBool2310
					&& i_2_ == 1991744917 * anInt2285) {
					anInt2285 = -406439357;
					aClass488_2304 = null;
				    }
				}
			    }
			} else {
			    Iterator iterator_6_
				= aHashMap2313.keySet().iterator();
			    while (iterator_6_.hasNext()) {
				int i_7_ = ((Integer) iterator_6_.next())
					       .intValue();
				Class222 class222
				    = ((Class222)
				       aHashMap2313
					   .get(Integer.valueOf(i_7_)));
				if (class222.method4227((byte) -73)
					.contains(class488)) {
				    class222.method4221(class488, (byte) 17);
				    break;
				}
			    }
			    class488.method7871(1861611754);
			    aList2301.remove(class488);
			}
		    } else if ((class488.method7879((byte) 59)
				!= Class482.aClass482_5223)
			       && (class488.method7884((byte) 31)
				   == Class208.aClass208_2251
					  .method3907((short) 10549))) {
			boolean bool
			    = (method4037(Class208.aClass208_2251
					      .method3907((short) 23057),
					  (byte) 30)
			       > 1.0E-4F);
			if (!bool)
			    class488.method7916(150, (byte) -37);
		    }
		}
	    }
	}
    }
    
    List method4029(int i) {
	return aList2301;
    }
    
    Class446 method4030(int i) {
	return aClass446_2303;
    }
    
    public void method4031(int i, int i_8_) {
	Class222 class222 = (Class222) aHashMap2313.get(Integer.valueOf(i));
	if (null != class222) {
	    List list = class222.method4227((byte) -28);
	    Iterator iterator = list.iterator();
	    while (iterator.hasNext()) {
		Class488 class488 = (Class488) iterator.next();
		if (!class488.method7939(-95613780))
		    class488.method7928(-156259243);
	    }
	}
    }
    
    public void method4032(int i, int i_9_, int i_10_) {
	int i_11_ = Class197.aClass197_2181.method3748((byte) -33);
	if (Class208.method3909(i, 987611529) == null
	    && (i_11_ == i_9_
		|| Class208.method3909(i_9_, 395568861) != null)) {
	    float f = 1.5258789E-5F * (float) i_10_;
	    Class251.method4511(i, i_11_ == i_9_ ? -1 : i_9_, f, null,
				2006950132);
	}
    }
    
    public void method4033(int i, byte i_12_) {
	Class222 class222 = (Class222) aHashMap2313.get(Integer.valueOf(i));
	if (class222 != null) {
	    List list = class222.method4227((byte) -77);
	    Iterator iterator = list.iterator();
	    while (iterator.hasNext()) {
		Class488 class488 = (Class488) iterator.next();
		class488.method7872((byte) 1);
	    }
	}
    }
    
    void method4034(int i) {
	Class189 class189 = new Class189(this);
	Class235 class235 = new Class235(this);
	Class213 class213 = new Class213(this);
	Class223 class223 = new Class223(this);
	Class220 class220 = new Class220(this);
	Class251.method4511(Class197.aClass197_2182.method3748((byte) 90),
			    Class197.aClass197_2181.method3748((byte) -20),
			    0.2F, class189, 182711604);
	Class251.method4511(Class197.aClass197_2183.method3748((byte) 7),
			    Class197.aClass197_2181.method3748((byte) -8),
			    1.0F, class235, -1049618904);
	Class251.method4511(Class197.aClass197_2184.method3748((byte) -58),
			    Class197.aClass197_2181.method3748((byte) -37),
			    1.0F, class213, 1616759992);
	Class251.method4511(Class197.aClass197_2185.method3748((byte) 14),
			    Class197.aClass197_2181.method3748((byte) -67),
			    0.8F, class223, 1792681635);
	Class251.method4511(Class197.aClass197_2186.method3748((byte) -15),
			    Class197.aClass197_2181.method3748((byte) -22),
			    1.0F, class220, 313527039);
	Class251.method4511(Class208.aClass208_2251.method3907((short) -8299),
			    Class197.aClass197_2183.method3748((byte) 50),
			    1.0F, null, -819734016);
	Class251.method4511(Class208.aClass208_2252.method3907((short) -26928),
			    Class197.aClass197_2186.method3748((byte) 52),
			    1.0F, null, -1233794253);
	Class251.method4511(Class208.aClass208_2250.method3907((short) -9313),
			    Class197.aClass197_2182.method3748((byte) -66),
			    1.0F, null, 750317905);
	Class251.method4511(Class208.aClass208_2253.method3907((short) -7551),
			    Class197.aClass197_2182.method3748((byte) -46),
			    1.0F, null, 140111809);
	Class251.method4511(Class208.aClass208_2260.method3907((short) -8154),
			    Class197.aClass197_2182.method3748((byte) -23),
			    1.0F, null, 203856628);
	Class251.method4511(Class208.aClass208_2255.method3907((short) -3679),
			    Class197.aClass197_2182.method3748((byte) 20),
			    1.0F, null, -1679674963);
	Class251.method4511(Class208.aClass208_2256.method3907((short) 7201),
			    Class197.aClass197_2182.method3748((byte) -78),
			    1.0F, null, -570566042);
	Class251.method4511(Class208.aClass208_2257.method3907((short) 27218),
			    Class197.aClass197_2185.method3748((byte) -51),
			    1.0F, null, -1554393889);
	Class251.method4511(Class208.aClass208_2254.method3907((short) -23890),
			    Class208.aClass208_2257.method3907((short) 1381),
			    1.0F, null, 52600079);
	Class251.method4511(Class208.aClass208_2259.method3907((short) 17439),
			    Class208.aClass208_2257.method3907((short) -4712),
			    1.0F, null, 2098286964);
	Class208.method3909
	    (Class208.aClass208_2251.method3907((short) 14898), 1906731308)
	    .method6489(0.75F, -1154700593);
    }
    
    public void method4035(int i, int i_13_, int i_14_, byte i_15_) {
	int i_16_ = Class197.aClass197_2181.method3748((byte) -69);
	if (Class208.method3909(i, 1073342190) == null
	    && (i_16_ == i_13_
		|| Class208.method3909(i_13_, 1576755021) != null)) {
	    float f = 1.5258789E-5F * (float) i_14_;
	    Class251.method4511(i, i_16_ == i_13_ ? -1 : i_13_, f, null,
				-159036396);
	}
    }
    
    public void method4036() {
	Iterator iterator = aList2301.iterator();
	while (iterator.hasNext()) {
	    Class488 class488 = (Class488) iterator.next();
	    if (class488.method7910(-1571199578) == Class204.aClass204_2234) {
		class488.method7916(500, (byte) -74);
		if (class488.method7897((byte) 45).method439(835950428)
		    == 1991744917 * anInt2285) {
		    method4052(1991744917 * anInt2285, -626471864);
		    break;
		}
	    }
	}
	aClass488_2304 = null;
	anInt2285 = -406439357;
    }
    
    float method4037(int i, byte i_17_) {
	Class393 class393 = Class208.method3909(i, 1350184228);
	float f = 1.0F;
	for (/**/; class393 != null;
	     class393 = class393.method6499(-289738176))
	    f *= class393.method6501((byte) 0);
	return f;
    }
    
    public void method4038(int i, byte i_18_) {
	Iterator iterator = aList2301.iterator();
	while (iterator.hasNext()) {
	    Class488 class488 = (Class488) iterator.next();
	    int i_19_ = class488.method7884((byte) 99);
	    boolean bool = Class505.method8321(i_19_, i, (byte) 3);
	    if (bool)
		class488.method7916(50, (byte) -101);
	}
    }
    
    void method4039(int[] is, int i) {
	if (aBool2291 && null != is) {
	    int[] is_20_ = is;
	    for (int i_21_ = 0; i_21_ < is_20_.length; i_21_++) {
		int i_22_ = is_20_[i_21_];
		method4044(i_22_, (byte) -108);
	    }
	}
    }
    
    float method4040(int i) {
	Class393 class393 = Class208.method3909(i, 438883603);
	float f = 1.0F;
	for (/**/; class393 != null; class393 = class393.method6499(887168885))
	    f *= class393.method6501((byte) 0);
	return f;
    }
    
    Interface69 method4041(int i, boolean bool, int i_23_) {
	if (!aBool2291)
	    return null;
	Interface69 interface69
	    = (Interface69) (bool ? aClass200_2298.method3785((long) i)
			     : aClass200_2284.method3785((long) i));
	if (null == interface69) {
	    if (bool)
		interface69
		    = (Interface69) aHashMap2295.get(Integer.valueOf(i));
	    else
		interface69
		    = (Interface69) aHashMap2294.get(Integer.valueOf(i));
	}
	return interface69;
    }
    
    Interface69 method4042(int i, boolean bool, int i_24_) {
	if (!aBool2291)
	    return null;
	Interface69 interface69 = method4041(i, bool, -872744087);
	if (null == interface69) {
	    Class215 class215 = new Class215(this);
	    interface69 = Class648.method10702((bool ? Class263.idx_40
						: Class307.idx_14),
					       i, class215, bool,
					       aClass200_2299, -742141910);
	    if (bool)
		aHashMap2295.put(Integer.valueOf(i), interface69);
	    else
		aHashMap2294.put(Integer.valueOf(i), interface69);
	}
	return interface69;
    }
    
    public void method4043(int i, int i_25_, int i_26_) {
	Class393 class393 = Class208.method3909(i, 1728402124);
	if (class393 != null) {
	    float f = (float) i_25_ * 1.5258789E-5F;
	    class393.method6489(f, -1154700593);
	}
    }
    
    public void method4044(int i, byte i_27_) {
	if (aBool2291 && i >= 0)
	    method4042(i, false, 2040155571);
    }
    
    boolean method4045(Class446 class446, Class446 class446_28_, float f,
		       int i) {
	Class446 class446_29_ = Class446.method7225(class446_28_, class446);
	if (class446_29_.method7230() >= f)
	    return false;
	return true;
    }
    
    public Class488 method4046
	(Class204 class204, Object object, int i, int i_30_, int i_31_,
	 int i_32_, Class195 class195, float f, float f_33_, Class446 class446,
	 int i_34_, int i_35_, boolean bool, int i_36_) {
	if (!aBool2291)
	    return null;
	if (null == object)
	    return null;
	i_31_ = Math.max(0, Math.min(i_31_, 255));
	i_35_ = Math.max(0, i_35_);
	if (class195 != Class195.aClass195_2177
	    && !method4045(aClass446_2303, class446, f_33_, -1662533101))
	    return null;
	if (i_35_ <= 0)
	    i_35_ = 255;
	float f_37_ = (float) i_31_ / 255.0F;
	float f_38_ = (float) i_35_ / 255.0F;
	Interface69 interface69 = method4042(i, bool, 2043493154);
	Class488 class488 = method4104(interface69, (byte) -32);
	if (class488 == null)
	    return null;
	class488.method7943(object, -1707329138);
	class488.method7953(i_32_, -1420476193);
	if (class195 != Class195.aClass195_2177) {
	    class488.method7915(true, 1741233698);
	    class488.method7875(class446, 1867057024);
	    class488.method7888(f, 1902501193);
	    class488.method7893(f_33_, 1710728388);
	    if (Class195.aClass195_2176 == class195)
		class488.method7877(anInterface57_2311, (byte) 43);
	    else if (class195 == Class195.aClass195_2179)
		class488.method7877(anInterface57_2309, (byte) -24);
	    else if (class195 == Class195.aClass195_2180)
		class488.method7877(anInterface57_2302, (byte) 35);
	    else if (Class195.aClass195_2178 == class195)
		class488.method7877(anInterface57_2312, (byte) -98);
	    else
		class488.method7915(false, 1583430854);
	}
	class488.method7957(f_37_, 0, (byte) -25);
	class488.method7898(i_30_ > 1 || i_30_ < 0,
			    i_30_ > 0 ? i_30_ - 1 : i_30_, -198436007);
	class488.method7941(f_38_, 511148013);
	class488.method7882(class204, (byte) 0);
	return class488;
    }
    
    public void method4047(Class204 class204, int i, int i_39_, int i_40_,
			   int i_41_, Class195 class195, float f, float f_42_,
			   Class446 class446, int i_43_, int i_44_, int i_45_,
			   int i_46_) {
	if (aBool2291) {
	    Class488 class488 = method4046(class204, this, i, i_39_, i_40_,
					   i_41_, class195, f, f_42_, class446,
					   i_43_, i_44_, false, 364099725);
	    if (class488 != null) {
		if (i_45_ == 0)
		    class488.method7928(-1130227832);
		else
		    class488.method7894(i_45_, false, (byte) 72);
		method4026(class488, 1262919863);
	    }
	}
    }
    
    public void method4048(int i, int i_47_, byte i_48_) {
	if (anInt2285 * 1991744917 != i) {
	    if (null != aClass488_2305) {
		aClass488_2305.method7916(0, (byte) -113);
		method4026(aClass488_2305, 569275598);
		aClass488_2305 = null;
	    }
	    Class488 class488
		= method4046(Class204.aClass204_2234, this, i, 0, i_47_,
			     Class208.aClass208_2251
				 .method3907((short) -16851),
			     Class195.aClass195_2177, 0.0F, 0.0F, null, 0, 255,
			     true, 1070087727);
	    if (null != class488) {
		class488.method7872((byte) 1);
		aClass488_2305 = class488;
	    }
	    aBool2306 = false;
	}
    }
    
    public int method4049(int i) {
	return 1991744917 * anInt2285;
    }
    
    public void method4050(int i, int i_49_) {
	anInt2307 = i * 681988639;
    }
    
    public void method4051(int i, int i_50_, int i_51_) {
	int i_52_ = Class197.aClass197_2181.method3748((byte) -37);
	if (Class208.method3909(i, 1408137165) == null
	    && (i_52_ == i_50_
		|| Class208.method3909(i_50_, 276657621) != null)) {
	    float f = 1.5258789E-5F * (float) i_51_;
	    Class251.method4511(i, i_52_ == i_50_ ? -1 : i_50_, f, null,
				1984581538);
	}
    }
    
    void method4052(int i, int i_53_) {
	if (null != client.aClass96_11085.aClass6_1169
	    && Class265.method4801(client.anInt11075 * 1777895575,
				   -92241382)) {
	    Class525_Sub15 class525_sub15
		= Class16.method767(Class412.aClass412_4289,
				    client.aClass96_11085.aClass6_1169,
				    1977859884);
	    class525_sub15.aClass525_Sub38_Sub2_10546.method16605(i,
								  -244980944);
	    client.aClass96_11085.method1794(class525_sub15, (short) 22865);
	}
    }
    
    public void method4053(int i, int i_54_) {
	method4054(i, 255, 564519426);
    }
    
    public void method4054(int i, int i_55_, int i_56_) {
	method4089(i, i_55_, false, 0, 0, 0, 0, 0, 672668579);
    }
    
    public void method4055(int i, int i_57_, int i_58_) {
	int i_59_ = Class197.aClass197_2181.method3748((byte) -35);
	if (Class208.method3909(i, 1642213656) == null
	    && (i_59_ == i_57_
		|| Class208.method3909(i_57_, 1772278724) != null)) {
	    float f = 1.5258789E-5F * (float) i_58_;
	    Class251.method4511(i, i_59_ == i_57_ ? -1 : i_57_, f, null,
				-592007169);
	}
    }
    
    List method4056() {
	return aList2301;
    }
    
    public void method4057(int i) {
	Class222 class222 = (Class222) aHashMap2313.get(Integer.valueOf(i));
	if (class222 != null) {
	    List list = class222.method4227((byte) 46);
	    Iterator iterator = list.iterator();
	    while (iterator.hasNext()) {
		Class488 class488 = (Class488) iterator.next();
		class488.method7916(50, (byte) -123);
	    }
	}
    }
    
    public void method4058(byte i) {
	Class228.method4353(-1619479754);
    }
    
    public void method4059(AnimationDefinition class194, int i,
                           Class656_Sub1 class656_sub1, short i_60_) {
	if (class194 != null && class194.anIntArrayArray2160 != null
	    && i < class194.anIntArrayArray2160.length
	    && class194.anIntArrayArray2160[i] != null
	    && (class656_sub1.aByte10867
		== Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705.aByte10867)
	    && class656_sub1.method16928(-831625800)) {
	    int i_61_ = class194.anIntArrayArray2160[i][0];
	    int i_62_ = i_61_ >> 8;
	    int i_63_ = i_61_ >> 5 & 0x7;
	    int i_64_ = i_61_ & 0x1f;
	    if (class194.anIntArrayArray2160[i].length > 1) {
		int i_65_ = (int) (Math.random()
				   * (double) (class194.anIntArrayArray2160
					       [i]).length);
		if (i_65_ > 0)
		    i_62_ = class194.anIntArrayArray2160[i][i_65_];
	    }
	    int i_66_ = 256;
	    if (class194.anIntArray2172 != null
		&& null != class194.anIntArray2173)
		i_66_ = ((int) (Math.random()
				* (double) (class194.anIntArray2173[i]
					    - class194.anIntArray2172[i]))
			 + class194.anIntArray2172[i]);
	    int i_67_ = (null == class194.anIntArray2151 ? 255
			 : class194.anIntArray2151[i]);
	    if (0 == i_64_) {
		if (class656_sub1
		    == Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705)
		    method4047(Class204.aClass204_2229, i_62_, i_63_, i_67_,
			       Class208.aClass208_2253
				   .method3907((short) 12901),
			       Class195.aClass195_2177, 0.0F, 0.0F, null,
			       class656_sub1.aByte10867, i_66_, 0, 2139132745);
	    } else {
		if (class656_sub1
		    == Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705) {
		    if (Class198_Sub13.aClass525_Sub30_9973
			    .aClass696_Sub45_10710.method17416(1357231222)
			== 0)
			return;
		} else if (Class198_Sub13.aClass525_Sub30_9973
			       .aClass696_Sub45_10726.method17416(1941105392)
			   == 0)
		    return;
		if (class194.anInt2175 * 1559086561 != -1) {
		    int i_68_ = 0;
		    if (class656_sub1 instanceof Class656_Sub1_Sub3_Sub1)
			i_68_ = ((Class656_Sub1_Sub3_Sub1) class656_sub1)
				    .method18600(2099051862);
		    else if (class656_sub1 instanceof Class656_Sub1_Sub3_Sub4)
			i_68_ = ((Class656_Sub1_Sub3_Sub4) class656_sub1)
				    .method18840(903351852);
		    else if (class656_sub1 instanceof Class656_Sub1_Sub3_Sub5)
			i_68_ = ((Class656_Sub1_Sub3_Sub5) class656_sub1)
				    .method18864(-29818572);
		    if (i_68_ != 0
			&& i_68_ != Class581
					.aClass656_Sub1_Sub3_Sub1_Sub1_7705
					.method18600(199836115)
			&& i_68_ != -398479907 * client.anInt11071) {
			i_67_ = class194.anInt2175 * 1559086561 * i_67_ / 100;
			if (i_67_ < 0)
			    i_67_ = 0;
			else if (i_67_ > 255)
			    i_67_ = 255;
		    }
		}
		Class446 class446 = class656_sub1.method10818().aClass446_4807;
		int i_69_ = (int) class446.aFloat4895 - 256 >> 9;
		int i_70_ = (int) class446.aFloat4897 - 256 >> 9;
		Class446 class446_71_
		    = new Class446((float) (i_69_ << 9), 0.0F,
				   (float) (i_70_ << 9));
		int i_72_ = class656_sub1.aByte10867 << 24;
		method4047(Class204.aClass204_2230, i_62_, i_63_, i_67_,
			   Class208.aClass208_2260.method3907((short) -5085),
			   ((class656_sub1
			     != Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705)
			    ? Class195.aClass195_2180
			    : Class195.aClass195_2177),
			   0.0F, (float) (i_64_ << 9), class446_71_, i_72_,
			   i_66_, 0, 2124141224);
	    }
	}
    }
    
    public void method4060(AnimationDefinition class194, int i, int i_73_) {
	if (null != class194 && null != class194.anIntArrayArray2160
	    && i < class194.anIntArrayArray2160.length
	    && null != class194.anIntArrayArray2160[i]) {
	    int i_74_ = class194.anIntArrayArray2160[i][0];
	    int i_75_ = i_74_ >> 8;
	    int i_76_ = i_74_ >> 5 & 0x7;
	    if (class194.anIntArrayArray2160[i].length > 1) {
		int i_77_ = (int) (Math.random()
				   * (double) (class194.anIntArrayArray2160
					       [i]).length);
		if (i_77_ > 0)
		    i_75_ = class194.anIntArrayArray2160[i][i_77_];
	    }
	    int i_78_ = 256;
	    if (null != class194.anIntArray2172
		&& class194.anIntArray2173 != null)
		i_78_ = (int) ((double) class194.anIntArray2172[i]
			       + (Math.random()
				  * (double) (class194.anIntArray2173[i]
					      - class194.anIntArray2172[i])));
	    int i_79_ = (class194.anIntArray2151 == null ? 255
			 : class194.anIntArray2151[i]);
	    method4047(Class204.aClass204_2226, i_75_, i_76_, i_79_,
		       Class208.aClass208_2260.method3907((short) 14076),
		       Class195.aClass195_2177, 0.0F, 0.0F, null, 0, i_78_, 0,
		       2097155695);
	}
    }
    
    List method4061() {
	return aList2301;
    }
    
    List method4062() {
	return aList2301;
    }
    
    public void method4063(int i) {
	Iterator iterator = aList2301.iterator();
	while (iterator.hasNext()) {
	    Class488 class488 = (Class488) iterator.next();
	    int i_80_ = class488.method7884((byte) 13);
	    boolean bool = Class505.method8321(i_80_, i, (byte) 3);
	    if (bool)
		class488.method7916(50, (byte) -69);
	}
    }
    
    public void method4064(int i, int i_81_) {
	Class393 class393 = Class208.method3909(i, 1490481172);
	if (class393 != null) {
	    float f = (float) i_81_ * 1.5258789E-5F;
	    class393.method6489(f, -1154700593);
	}
    }
    
    Class200 method4065() {
	return aClass200_2284;
    }
    
    Class200 method4066() {
	return aClass200_2298;
    }
    
    Class200 method4067() {
	return aClass200_2298;
    }
    
    Class200 method4068() {
	return aClass200_2298;
    }
    
    Interface69 method4069(int i, boolean bool) {
	if (!aBool2291)
	    return null;
	Interface69 interface69
	    = (Interface69) (bool ? aClass200_2298.method3785((long) i)
			     : aClass200_2284.method3785((long) i));
	if (null == interface69) {
	    if (bool)
		interface69
		    = (Interface69) aHashMap2295.get(Integer.valueOf(i));
	    else
		interface69
		    = (Interface69) aHashMap2294.get(Integer.valueOf(i));
	}
	return interface69;
    }
    
    Class446 method4070() {
	return aClass446_2303;
    }
    
    void method4071(int i) {
	if (null != client.aClass96_11085.aClass6_1169
	    && Class265.method4801(client.anInt11075 * 1777895575,
				   1612581902)) {
	    Class525_Sub15 class525_sub15
		= Class16.method767(Class412.aClass412_4289,
				    client.aClass96_11085.aClass6_1169,
				    1977859884);
	    class525_sub15.aClass525_Sub38_Sub2_10546.method16605(i,
								  -1627194498);
	    client.aClass96_11085.method1794(class525_sub15, (short) 16663);
	}
    }
    
    public void method4072(int i, int i_82_) {
	if (!aBool2291) {
	    anInt2300 = i * -2058858799;
	    aClass200_2284 = new Class200(i_82_, 100);
	    aClass200_2298 = new Class200(10);
	    aClass200_2284.method3783(new Class192(this), (byte) -39);
	    Class657 class657 = new Class657(Class380.aClass380_3923);
	    if (class657.aClass380_8438 == Class380.aClass380_3923)
		Class661.aClass372_8473 = new Class372_Sub2(class657);
	    else if (class657.aClass380_8438 == Class380.aClass380_3924)
		Class661.aClass372_8473 = new Class372_Sub1(class657);
	    else
		throw new RuntimeException();
	    method4034(1645468320);
	    anInt2285 = -406439357;
	    aBool2291 = true;
	}
    }
    
    public void method4073(int i, int i_83_) {
	if (!aBool2291) {
	    anInt2300 = i * -2058858799;
	    aClass200_2284 = new Class200(i_83_, 100);
	    aClass200_2298 = new Class200(10);
	    aClass200_2284.method3783(new Class192(this), (byte) -1);
	    Class657 class657 = new Class657(Class380.aClass380_3923);
	    if (class657.aClass380_8438 == Class380.aClass380_3923)
		Class661.aClass372_8473 = new Class372_Sub2(class657);
	    else if (class657.aClass380_8438 == Class380.aClass380_3924)
		Class661.aClass372_8473 = new Class372_Sub1(class657);
	    else
		throw new RuntimeException();
	    method4034(1529372802);
	    anInt2285 = -406439357;
	    aBool2291 = true;
	}
    }
    
    void method4074() {
	Class189 class189 = new Class189(this);
	Class235 class235 = new Class235(this);
	Class213 class213 = new Class213(this);
	Class223 class223 = new Class223(this);
	Class220 class220 = new Class220(this);
	Class251.method4511(Class197.aClass197_2182.method3748((byte) -107),
			    Class197.aClass197_2181.method3748((byte) 86),
			    0.2F, class189, -30588400);
	Class251.method4511(Class197.aClass197_2183.method3748((byte) -30),
			    Class197.aClass197_2181.method3748((byte) 101),
			    1.0F, class235, -1353602262);
	Class251.method4511(Class197.aClass197_2184.method3748((byte) -59),
			    Class197.aClass197_2181.method3748((byte) 90),
			    1.0F, class213, 1519642409);
	Class251.method4511(Class197.aClass197_2185.method3748((byte) -5),
			    Class197.aClass197_2181.method3748((byte) -21),
			    0.8F, class223, -2038770593);
	Class251.method4511(Class197.aClass197_2186.method3748((byte) -14),
			    Class197.aClass197_2181.method3748((byte) -49),
			    1.0F, class220, 1898811227);
	Class251.method4511(Class208.aClass208_2251.method3907((short) -13846),
			    Class197.aClass197_2183.method3748((byte) 74),
			    1.0F, null, 1597579504);
	Class251.method4511(Class208.aClass208_2252.method3907((short) -6379),
			    Class197.aClass197_2186.method3748((byte) 77),
			    1.0F, null, -526306121);
	Class251.method4511(Class208.aClass208_2250.method3907((short) 14679),
			    Class197.aClass197_2182.method3748((byte) -11),
			    1.0F, null, -997470440);
	Class251.method4511(Class208.aClass208_2253.method3907((short) -27817),
			    Class197.aClass197_2182.method3748((byte) 43),
			    1.0F, null, -1610899692);
	Class251.method4511(Class208.aClass208_2260.method3907((short) 4070),
			    Class197.aClass197_2182.method3748((byte) 6), 1.0F,
			    null, 723334365);
	Class251.method4511(Class208.aClass208_2255.method3907((short) 3769),
			    Class197.aClass197_2182.method3748((byte) -95),
			    1.0F, null, 1027890014);
	Class251.method4511(Class208.aClass208_2256.method3907((short) 5093),
			    Class197.aClass197_2182.method3748((byte) -46),
			    1.0F, null, 1812287459);
	Class251.method4511(Class208.aClass208_2257.method3907((short) -2782),
			    Class197.aClass197_2185.method3748((byte) 30),
			    1.0F, null, -18294811);
	Class251.method4511(Class208.aClass208_2254.method3907((short) 15544),
			    Class208.aClass208_2257.method3907((short) -21191),
			    1.0F, null, -2032958918);
	Class251.method4511(Class208.aClass208_2259.method3907((short) 14961),
			    Class208.aClass208_2257.method3907((short) -6068),
			    1.0F, null, -384109138);
	Class208.method3909
	    (Class208.aClass208_2251.method3907((short) -10588), 53629689)
	    .method6489(0.75F, -1154700593);
    }
    
    public void method4075() {
	if (aBool2291) {
	    Class333.method5824((short) -23964);
	    if (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705 != null
		&& (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705.method10818()
		    != null)) {
		if (null == aClass446_2303)
		    aClass446_2303 = new Class446();
		aClass446_2303.aFloat4895
		    = (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705.method10818
		       ().aClass446_4807.aFloat4895);
		aClass446_2303.aFloat4896 = 0.0F;
		aClass446_2303.aFloat4897
		    = (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705.method10818
		       ().aClass446_4807.aFloat4897);
	    }
	    Iterator iterator = aHashMap2294.values().iterator();
	    while (iterator.hasNext()) {
		Interface69 interface69 = (Interface69) iterator.next();
		interface69.method211(-1092460241);
	    }
	    iterator = aHashMap2295.values().iterator();
	    while (iterator.hasNext()) {
		Interface69 interface69 = (Interface69) iterator.next();
		interface69.method211(-1257410029);
	    }
	    iterator = aList2296.iterator();
	    while (iterator.hasNext()) {
		Interface69 interface69 = (Interface69) iterator.next();
		if (interface69.method474((byte) -18))
		    aHashMap2295.remove
			(Integer.valueOf(interface69.method439(-1177463119)));
		else
		    aHashMap2294.remove
			(Integer.valueOf(interface69.method439(-861815)));
	    }
	    aList2296.clear();
	    if (null != aClass488_2305
		&& (aClass488_2305.method7879((byte) 34)
		    == Class482.aClass482_5226)
		&& !aBool2306 && null != client.aClass96_11085.aClass6_1169
		&& Class265.method4801(1777895575 * client.anInt11075,
				       1403546156)) {
		Class525_Sub15 class525_sub15
		    = Class16.method767(Class412.aClass412_4344,
					client.aClass96_11085.aClass6_1169,
					1977859884);
		class525_sub15.aClass525_Sub38_Sub2_10546.method16605
		    (aClass488_2305.method7897((byte) 83)
			 .method439(-1411156118),
		     -833258042);
		client.aClass96_11085.method1794(class525_sub15,
						 (short) 23496);
		aBool2306 = true;
	    }
	    iterator = aList2292.iterator();
	    while (iterator.hasNext()) {
		Class488 class488 = (Class488) iterator.next();
		class488.method7896(-465227840);
		class488.method7878((byte) 3);
		Class482 class482 = class488.method7879((byte) 91);
		if (class488.method7881(-1562832576) == this) {
		    if (class482 == Class482.aClass482_5229
			|| Class482.aClass482_5224 == class482) {
			if ((class488.method7910(-1571199578)
			     == Class204.aClass204_2234)
			    || (class488.method7910(-1571199578)
				== Class204.aClass204_2235)) {
			    if (aClass488_2305 == class488) {
				aBool2306 = false;
				aClass488_2305 = null;
				class488.method7871(1880354955);
				aList2301.remove(class488);
			    } else {
				int i = class488.method7897((byte) 32)
					    .method439(25756060);
				boolean bool
				    = (method4037((Class208.aClass208_2251
						       .method3907
						   ((short) -3310)),
						  (byte) 23)
				       > 0.0F);
				if (!aBool2310 && bool) {
				    if (anInt2285 * 1991744917 == i) {
					method4052(i, 1600604614);
					anInt2285 = -406439357;
				    }
				    class488.method7871(1900142577);
				    aList2301.remove(class488);
				} else if (i == -2080866315 * anInt2308) {
				    anInt2308 = 80415651;
				    aBool2310 = false;
				    class488.method7871(1900159193);
				    aList2301.remove(class488);
				    Iterator iterator_84_
					= aList2292.iterator();
				    while (iterator_84_.hasNext()) {
					Class488 class488_85_
					    = (Class488) iterator_84_.next();
					if (class488_85_
						.method7910(-1571199578)
					    == Class204.aClass204_2234) {
					    int i_86_
						= class488_85_.method7897
						      ((byte) 9)
						      .method439(-1013879216);
					    if (((i_86_
						  == 1991744917 * anInt2285)
						 && (class488_85_
							 .method7879((byte) 83)
						     == (Class482
							 .aClass482_5229)))
						|| (class488_85_
							.method7879((byte) 19)
						    == Class482.aClass482_5228)
						|| (class488_85_
							.method7879((byte) 62)
						    == Class482.aClass482_5225)
						|| (class488_85_
							.method7879((byte) 68)
						    == (Class482
							.aClass482_5226))) {
						if (class488_85_
							.method7879((byte) 40)
						    == Class482.aClass482_5229)
						    class488_85_.method7891
							((byte) 106);
						else
						    class488_85_.method7928
							(-274774053);
						break;
					    }
					}
				    }
				} else if (bool) {
				    if (!aBool2310
					|| 1991744917 * anInt2285 != i) {
					class488.method7871(1921058648);
					aList2301.remove(class488);
				    }
				    if (false == aBool2310
					&& i == 1991744917 * anInt2285) {
					anInt2285 = -406439357;
					aClass488_2304 = null;
				    }
				}
			    }
			} else {
			    Iterator iterator_87_
				= aHashMap2313.keySet().iterator();
			    while (iterator_87_.hasNext()) {
				int i = ((Integer) iterator_87_.next())
					    .intValue();
				Class222 class222
				    = ((Class222)
				       aHashMap2313.get(Integer.valueOf(i)));
				if (class222.method4227((byte) -25)
					.contains(class488)) {
				    class222.method4221(class488, (byte) 17);
				    break;
				}
			    }
			    class488.method7871(2129310696);
			    aList2301.remove(class488);
			}
		    } else if ((class488.method7879((byte) 93)
				!= Class482.aClass482_5223)
			       && (class488.method7884((byte) 92)
				   == Class208.aClass208_2251
					  .method3907((short) -2164))) {
			boolean bool
			    = (method4037(Class208.aClass208_2251
					      .method3907((short) 3418),
					  (byte) 60)
			       > 1.0E-4F);
			if (!bool)
			    class488.method7916(150, (byte) -87);
		    }
		}
	    }
	}
    }
    
    public void method4076() {
	Class228.method4353(342946672);
    }
    
    public void method4077(int i, int i_88_) {
	if (!aBool2291) {
	    anInt2300 = i * -2058858799;
	    aClass200_2284 = new Class200(i_88_, 100);
	    aClass200_2298 = new Class200(10);
	    aClass200_2284.method3783(new Class192(this), (byte) -19);
	    Class657 class657 = new Class657(Class380.aClass380_3923);
	    if (class657.aClass380_8438 == Class380.aClass380_3923)
		Class661.aClass372_8473 = new Class372_Sub2(class657);
	    else if (class657.aClass380_8438 == Class380.aClass380_3924)
		Class661.aClass372_8473 = new Class372_Sub1(class657);
	    else
		throw new RuntimeException();
	    method4034(1516861242);
	    anInt2285 = -406439357;
	    aBool2291 = true;
	}
    }
    
    public void method4078(Class488 class488, int i, int i_89_) {
	if (null != class488) {
	    Class222 class222
		= (Class222) aHashMap2313.get(Integer.valueOf(i));
	    if (class222 == null) {
		class222 = new Class222(this);
		aHashMap2313.put(Integer.valueOf(i), class222);
	    }
	    if (!class222.method4220(class488, 416108748)) {
		class488.method7894(i_89_, true, (byte) 77);
		class222.method4224(class488, 120921471);
	    }
	}
    }
    
    public void method4079(int i) {
	Class222 class222 = (Class222) aHashMap2313.get(Integer.valueOf(i));
	if (class222 != null) {
	    List list = class222.method4227((byte) 45);
	    Iterator iterator = list.iterator();
	    while (iterator.hasNext()) {
		Class488 class488 = (Class488) iterator.next();
		class488.method7916(50, (byte) -2);
	    }
	}
    }
    
    public Class488 method4080
	(Class204 class204, Object object, int i, int i_90_, int i_91_,
	 int i_92_, Class195 class195, float f, float f_93_, Class446 class446,
	 int i_94_, int i_95_, boolean bool) {
	if (!aBool2291)
	    return null;
	if (null == object)
	    return null;
	i_91_ = Math.max(0, Math.min(i_91_, 255));
	i_95_ = Math.max(0, i_95_);
	if (class195 != Class195.aClass195_2177
	    && !method4045(aClass446_2303, class446, f_93_, -1959998466))
	    return null;
	if (i_95_ <= 0)
	    i_95_ = 255;
	float f_96_ = (float) i_91_ / 255.0F;
	float f_97_ = (float) i_95_ / 255.0F;
	Interface69 interface69 = method4042(i, bool, 2130877739);
	Class488 class488 = method4104(interface69, (byte) 58);
	if (class488 == null)
	    return null;
	class488.method7943(object, -1756212194);
	class488.method7953(i_92_, -1215948866);
	if (class195 != Class195.aClass195_2177) {
	    class488.method7915(true, 2130626957);
	    class488.method7875(class446, -1026375429);
	    class488.method7888(f, 1359804599);
	    class488.method7893(f_93_, 757206405);
	    if (Class195.aClass195_2176 == class195)
		class488.method7877(anInterface57_2311, (byte) 16);
	    else if (class195 == Class195.aClass195_2179)
		class488.method7877(anInterface57_2309, (byte) 69);
	    else if (class195 == Class195.aClass195_2180)
		class488.method7877(anInterface57_2302, (byte) 11);
	    else if (Class195.aClass195_2178 == class195)
		class488.method7877(anInterface57_2312, (byte) 117);
	    else
		class488.method7915(false, 1828304342);
	}
	class488.method7957(f_96_, 0, (byte) -60);
	class488.method7898(i_90_ > 1 || i_90_ < 0,
			    i_90_ > 0 ? i_90_ - 1 : i_90_, 622433290);
	class488.method7941(f_97_, 2086526029);
	class488.method7882(class204, (byte) 0);
	return class488;
    }
    
    public void method4081(int i) {
	Class222 class222 = (Class222) aHashMap2313.get(Integer.valueOf(i));
	if (class222 != null) {
	    List list = class222.method4227((byte) 8);
	    Iterator iterator = list.iterator();
	    while (iterator.hasNext()) {
		Class488 class488 = (Class488) iterator.next();
		class488.method7916(50, (byte) -71);
	    }
	}
    }
    
    public void method4082(Class488 class488, int i, int i_98_) {
	if (null != class488) {
	    Class222 class222
		= (Class222) aHashMap2313.get(Integer.valueOf(i));
	    if (class222 == null) {
		class222 = new Class222(this);
		aHashMap2313.put(Integer.valueOf(i), class222);
	    }
	    if (!class222.method4220(class488, 19100332)) {
		class488.method7894(i_98_, true, (byte) 65);
		class222.method4224(class488, -847990908);
	    }
	}
    }
    
    List method4083() {
	return aList2296;
    }
    
    public void method4084(int i) {
	Class222 class222 = (Class222) aHashMap2313.get(Integer.valueOf(i));
	if (class222 != null) {
	    List list = class222.method4227((byte) -12);
	    Iterator iterator = list.iterator();
	    while (iterator.hasNext()) {
		Class488 class488 = (Class488) iterator.next();
		class488.method7916(50, (byte) -12);
	    }
	}
    }
    
    Class488 method4085(int i) {
	Iterator iterator = aList2301.iterator();
	while (iterator.hasNext()) {
	    Class488 class488 = (Class488) iterator.next();
	    if (class488.method7910(-1571199578) == Class204.aClass204_2234
		&& class488.method7879((byte) 9) == Class482.aClass482_5227)
		return class488;
	}
	return null;
    }
    
    Interface69 method4086(int i, boolean bool) {
	if (!aBool2291)
	    return null;
	Interface69 interface69
	    = (Interface69) (bool ? aClass200_2298.method3785((long) i)
			     : aClass200_2284.method3785((long) i));
	if (null == interface69) {
	    if (bool)
		interface69
		    = (Interface69) aHashMap2295.get(Integer.valueOf(i));
	    else
		interface69
		    = (Interface69) aHashMap2294.get(Integer.valueOf(i));
	}
	return interface69;
    }
    
    void method4087() {
	Class189 class189 = new Class189(this);
	Class235 class235 = new Class235(this);
	Class213 class213 = new Class213(this);
	Class223 class223 = new Class223(this);
	Class220 class220 = new Class220(this);
	Class251.method4511(Class197.aClass197_2182.method3748((byte) 29),
			    Class197.aClass197_2181.method3748((byte) -36),
			    0.2F, class189, -1914094457);
	Class251.method4511(Class197.aClass197_2183.method3748((byte) -26),
			    Class197.aClass197_2181.method3748((byte) 24),
			    1.0F, class235, -402764559);
	Class251.method4511(Class197.aClass197_2184.method3748((byte) -95),
			    Class197.aClass197_2181.method3748((byte) -37),
			    1.0F, class213, 490544873);
	Class251.method4511(Class197.aClass197_2185.method3748((byte) -44),
			    Class197.aClass197_2181.method3748((byte) -12),
			    0.8F, class223, 435985074);
	Class251.method4511(Class197.aClass197_2186.method3748((byte) -48),
			    Class197.aClass197_2181.method3748((byte) 62),
			    1.0F, class220, 384784741);
	Class251.method4511(Class208.aClass208_2251.method3907((short) 19881),
			    Class197.aClass197_2183.method3748((byte) 41),
			    1.0F, null, -1666584585);
	Class251.method4511(Class208.aClass208_2252.method3907((short) 9205),
			    Class197.aClass197_2186.method3748((byte) 34),
			    1.0F, null, -1361725592);
	Class251.method4511(Class208.aClass208_2250.method3907((short) 2650),
			    Class197.aClass197_2182.method3748((byte) -61),
			    1.0F, null, 2105997135);
	Class251.method4511(Class208.aClass208_2253.method3907((short) 6379),
			    Class197.aClass197_2182.method3748((byte) 76),
			    1.0F, null, 1819126994);
	Class251.method4511(Class208.aClass208_2260.method3907((short) 9149),
			    Class197.aClass197_2182.method3748((byte) 46),
			    1.0F, null, 374146368);
	Class251.method4511(Class208.aClass208_2255.method3907((short) -7019),
			    Class197.aClass197_2182.method3748((byte) -7),
			    1.0F, null, -201963445);
	Class251.method4511(Class208.aClass208_2256.method3907((short) 23747),
			    Class197.aClass197_2182.method3748((byte) -10),
			    1.0F, null, -1442211035);
	Class251.method4511(Class208.aClass208_2257.method3907((short) -19260),
			    Class197.aClass197_2185.method3748((byte) 44),
			    1.0F, null, -673908083);
	Class251.method4511(Class208.aClass208_2254.method3907((short) 8037),
			    Class208.aClass208_2257.method3907((short) -16172),
			    1.0F, null, 893208303);
	Class251.method4511(Class208.aClass208_2259.method3907((short) 4243),
			    Class208.aClass208_2257.method3907((short) 900),
			    1.0F, null, 1476231864);
	Class208.method3909
	    (Class208.aClass208_2251.method3907((short) -835), 91807097)
	    .method6489(0.75F, -1154700593);
    }
    
    public void method4088(int i, int i_99_) {
	if (aBool2291 && (!aBool2310 || -2080866315 * anInt2308 != i)) {
	    if (aBool2310 && -2080866315 * anInt2308 != i) {
		Iterator iterator = aList2292.iterator();
		while (iterator.hasNext()) {
		    Class488 class488 = (Class488) iterator.next();
		    if (class488.method7910(-1571199578)
			== Class204.aClass204_2235) {
			class488.method7871(2051051215);
			aList2301.remove(class488);
			aBool2310 = false;
			break;
		    }
		}
	    }
	    if (i_99_ != 0 && i != -1) {
		if (!aBool2310 && aClass488_2304 != null)
		    aClass488_2304.method7935(1350618175);
		Class488 class488
		    = method4046(Class204.aClass204_2235, this, i, 0, i_99_,
				 Class208.aClass208_2251
				     .method3907((short) 9423),
				 Class195.aClass195_2177, 0.0F, 0.0F, null, 0,
				 255, true, 1128708361);
		if (class488 != null) {
		    class488.method7928(-1049512667);
		    method4026(class488, 1673717921);
		    aBool2310 = true;
		    anInt2308 = i * -80415651;
		}
	    }
	}
    }
    
    public void method4089(int i, int i_100_, boolean bool, int i_101_,
			   int i_102_, int i_103_, int i_104_, int i_105_,
			   int i_106_) {
	if (aBool2291 && i != 1991744917 * anInt2285) {
	    if (aBool2310 && null != aClass488_2304
		&& i != anInt2285 * 1991744917) {
		aClass488_2304.method7891((byte) 81);
		aClass488_2304.method7871(2022291835);
		aList2301.remove(aClass488_2304);
	    }
	    Class488 class488 = method4085(608829018);
	    if (class488 != null
		&& class488.method7897((byte) 26).method439(199872415) == i) {
		aClass488_2304 = class488;
		anInt2285
		    = (class488.method7897((byte) 55).method439(205132712)
		       * 406439357);
	    } else {
		boolean bool_107_ = false;
		if (anInt2285 * 1991744917 >= 0) {
		    Iterator iterator = aList2301.iterator();
		    while (iterator.hasNext()) {
			Class488 class488_108_ = (Class488) iterator.next();
			if (class488_108_.method7910(-1571199578)
			    == Class204.aClass204_2234) {
			    class488_108_.method7916(2000, (byte) -1);
			    bool_107_ = true;
			}
		    }
		}
		aClass488_2304 = null;
		anInt2285 = -406439357;
		Class488 class488_109_ = null;
		if (aClass488_2305 != null
		    && aClass488_2305.method7897((byte) 19) != null
		    && aClass488_2305.method7897((byte) 14)
			   .method439(338496299) == i
		    && (aClass488_2305.method7879((byte) 62)
			== Class482.aClass482_5226)) {
		    class488_109_ = aClass488_2305;
		    aClass488_2305 = null;
		    aBool2306 = false;
		}
		if (null == class488_109_) {
		    if (bool) {
			float f = (float) i_104_;
			float f_110_ = (float) i_105_;
			Class446 class446 = new Class446((float) i_102_, 0.0F,
							 (float) i_103_);
			class488_109_
			    = method4046(Class204.aClass204_2234, this, i, 0,
					 bool_107_ ? 0 : i_100_,
					 (i == anInt2307 * -401036833
					  ? Class197.aClass197_2184
						.method3748((byte) 0)
					  : Class208.aClass208_2251
						.method3907((short) -8486)),
					 Class195.aClass195_2178, f, f_110_,
					 class446, i_101_, 255, true,
					 2006053857);
		    } else
			class488_109_
			    = method4046(Class204.aClass204_2234, this, i, 0,
					 bool_107_ ? 0 : i_100_,
					 (anInt2307 * -401036833 == i
					  ? Class197.aClass197_2184
						.method3748((byte) -113)
					  : Class208.aClass208_2251
						.method3907((short) 19893)),
					 Class195.aClass195_2177, 0.0F, 0.0F,
					 null, 0, 255, true, -715062990);
		}
		if (class488_109_ != null) {
		    if (bool_107_) {
			float f = (float) i_100_ / 255.0F;
			class488_109_.method7957(f, 2000, (byte) -109);
		    }
		    class488_109_.method7928(-188807874);
		    method4026(class488_109_, -1350161504);
		    aClass488_2304 = class488_109_;
		    anInt2285 = 406439357 * i;
		    if (aBool2310)
			aClass488_2304.method7935(1350618175);
		    if (client.aClass96_11085.aClass6_1169 != null
			&& Class265.method4801(client.anInt11075 * 1777895575,
					       1541432338)) {
			Class525_Sub15 class525_sub15
			    = Class16.method767(Class412.aClass412_4344,
						(client.aClass96_11085
						 .aClass6_1169),
						1977859884);
			class525_sub15.aClass525_Sub38_Sub2_10546
			    .method16605(anInt2285 * 1991744917, -1406188490);
			client.aClass96_11085.method1794(class525_sub15,
							 (short) 18518);
		    }
		}
	    }
	}
    }
    
    public void method4090(int i, int i_111_) {
	method4089(i, i_111_, false, 0, 0, 0, 0, 0, -1106263352);
    }
    
    public void method4091(int i, int i_112_, int i_113_) {
	int i_114_ = Class197.aClass197_2181.method3748((byte) 39);
	if (Class208.method3909(i, -249300266) == null
	    && (i_114_ == i_112_
		|| Class208.method3909(i_112_, 470729999) != null)) {
	    float f = 1.5258789E-5F * (float) i_113_;
	    Class251.method4511(i, i_114_ == i_112_ ? -1 : i_112_, f, null,
				104310310);
	}
    }
    
    public void method4092(int i, int i_115_) {
	Class393 class393 = Class208.method3909(i, 688727528);
	if (class393 != null) {
	    float f = (float) i_115_ * 1.5258789E-5F;
	    class393.method6489(f, -1154700593);
	}
    }
    
    public void method4093(Class488 class488) {
	class488.method7943(this, -505989058);
	aList2301.add(class488);
    }
    
    public void method4094(int i, int i_116_, short i_117_) {
	if (aBool2291 && (!aBool2310 || -2080866315 * anInt2308 != i)) {
	    if (aBool2310 && -2080866315 * anInt2308 != i) {
		Iterator iterator = aList2292.iterator();
		while (iterator.hasNext()) {
		    Class488 class488 = (Class488) iterator.next();
		    if (class488.method7910(-1571199578)
			== Class204.aClass204_2235) {
			class488.method7871(1829350873);
			aList2301.remove(class488);
			aBool2310 = false;
			break;
		    }
		}
	    }
	    if (i_116_ != 0 && i != -1) {
		if (!aBool2310 && aClass488_2304 != null)
		    aClass488_2304.method7935(1350618175);
		Class488 class488
		    = method4046(Class204.aClass204_2235, this, i, 0, i_116_,
				 Class208.aClass208_2251
				     .method3907((short) -10408),
				 Class195.aClass195_2177, 0.0F, 0.0F, null, 0,
				 255, true, 1419191040);
		if (class488 != null) {
		    class488.method7928(-263061637);
		    method4026(class488, -1534194931);
		    aBool2310 = true;
		    anInt2308 = i * -80415651;
		}
	    }
	}
    }
    
    public void method4095(Class488 class488, int i, int i_118_, byte i_119_) {
	if (null != class488) {
	    Class222 class222
		= (Class222) aHashMap2313.get(Integer.valueOf(i));
	    if (class222 == null) {
		class222 = new Class222(this);
		aHashMap2313.put(Integer.valueOf(i), class222);
	    }
	    if (!class222.method4220(class488, 264122736)) {
		class488.method7894(i_118_, true, (byte) 60);
		class222.method4224(class488, 1523191015);
	    }
	}
    }
    
    public void method4096(int i) {
	Iterator iterator = aList2301.iterator();
	while (iterator.hasNext()) {
	    Class488 class488 = (Class488) iterator.next();
	    int i_120_ = class488.method7884((byte) 46);
	    boolean bool = Class505.method8321(i_120_, i, (byte) 3);
	    if (bool)
		class488.method7916(50, (byte) -91);
	}
    }
    
    public void method4097(int i) {
	Class222 class222 = (Class222) aHashMap2313.get(Integer.valueOf(i));
	if (class222 != null) {
	    List list = class222.method4227((byte) 10);
	    Iterator iterator = list.iterator();
	    while (iterator.hasNext()) {
		Class488 class488 = (Class488) iterator.next();
		class488.method7872((byte) 1);
	    }
	}
    }
    
    public void method4098(int i, int i_121_) {
	Class222 class222 = (Class222) aHashMap2313.get(Integer.valueOf(i));
	if (class222 != null) {
	    List list = class222.method4227((byte) 43);
	    Iterator iterator = list.iterator();
	    while (iterator.hasNext()) {
		Class488 class488 = (Class488) iterator.next();
		class488.method7916(50, (byte) -48);
	    }
	}
    }
    
    public int method4099(byte i) {
	return anInt2307 * -401036833;
    }
    
    void method4100(int[] is) {
	if (aBool2291 && null != is) {
	    int[] is_122_ = is;
	    for (int i = 0; i < is_122_.length; i++) {
		int i_123_ = is_122_[i];
		method4044(i_123_, (byte) -60);
	    }
	}
    }
    
    void method4101(int[] is) {
	if (aBool2291 && null != is) {
	    int[] is_124_ = is;
	    for (int i = 0; i < is_124_.length; i++) {
		int i_125_ = is_124_[i];
		method4044(i_125_, (byte) -124);
	    }
	}
    }
    
    public void method4102(int i) {
	if (aBool2291 && i >= 0)
	    method4042(i, false, 1967247854);
    }
    
    public void method4103(int i) {
	Class222 class222 = (Class222) aHashMap2313.get(Integer.valueOf(i));
	if (class222 != null) {
	    List list = class222.method4227((byte) -13);
	    Iterator iterator = list.iterator();
	    while (iterator.hasNext()) {
		Class488 class488 = (Class488) iterator.next();
		class488.method7872((byte) 1);
	    }
	}
    }
    
    Class488 method4104(Interface69 interface69, byte i) {
	if (!aBool2291)
	    return null;
	int i_126_ = 0;
	Iterator iterator = aList2292.iterator();
	while (iterator.hasNext()) {
	    Class488 class488 = (Class488) iterator.next();
	    i_126_++;
	    if (class488.method7879((byte) 109) == Class482.aClass482_5232) {
		class488.method7870(interface69, -494745849);
		return class488;
	    }
	}
	if (i_126_ >= anInt2300 * -310851023)
	    return null;
	Class488 class488 = interface69.method434((byte) 5);
	aList2292.add(class488);
	return class488;
    }
    
    Interface69 method4105(int i, boolean bool) {
	if (!aBool2291)
	    return null;
	Interface69 interface69
	    = (Interface69) (bool ? aClass200_2298.method3785((long) i)
			     : aClass200_2284.method3785((long) i));
	if (null == interface69) {
	    if (bool)
		interface69
		    = (Interface69) aHashMap2295.get(Integer.valueOf(i));
	    else
		interface69
		    = (Interface69) aHashMap2294.get(Integer.valueOf(i));
	}
	return interface69;
    }
    
    Interface69 method4106(int i, boolean bool) {
	if (!aBool2291)
	    return null;
	Interface69 interface69
	    = (Interface69) (bool ? aClass200_2298.method3785((long) i)
			     : aClass200_2284.method3785((long) i));
	if (null == interface69) {
	    if (bool)
		interface69
		    = (Interface69) aHashMap2295.get(Integer.valueOf(i));
	    else
		interface69
		    = (Interface69) aHashMap2294.get(Integer.valueOf(i));
	}
	return interface69;
    }
    
    public void method4107(int i) {
	Iterator iterator = aList2301.iterator();
	while (iterator.hasNext()) {
	    Class488 class488 = (Class488) iterator.next();
	    int i_127_ = class488.method7884((byte) 63);
	    boolean bool = Class505.method8321(i_127_, i, (byte) 3);
	    if (bool)
		class488.method7916(50, (byte) -19);
	}
    }
    
    Interface69 method4108(int i, boolean bool) {
	if (!aBool2291)
	    return null;
	Interface69 interface69 = method4041(i, bool, -872744087);
	if (null == interface69) {
	    Class215 class215 = new Class215(this);
	    interface69 = Class648.method10702((bool ? Class263.idx_40
						: Class307.idx_14),
					       i, class215, bool,
					       aClass200_2299, -1623762451);
	    if (bool)
		aHashMap2295.put(Integer.valueOf(i), interface69);
	    else
		aHashMap2294.put(Integer.valueOf(i), interface69);
	}
	return interface69;
    }
    
    Class488 method4109(Interface69 interface69) {
	if (!aBool2291)
	    return null;
	int i = 0;
	Iterator iterator = aList2292.iterator();
	while (iterator.hasNext()) {
	    Class488 class488 = (Class488) iterator.next();
	    i++;
	    if (class488.method7879((byte) 18) == Class482.aClass482_5232) {
		class488.method7870(interface69, -666055978);
		return class488;
	    }
	}
	if (i >= anInt2300 * -310851023)
	    return null;
	Class488 class488 = interface69.method434((byte) 5);
	aList2292.add(class488);
	return class488;
    }
    
    public Class488 method4110
	(Class204 class204, Object object, int i, int i_128_, int i_129_,
	 int i_130_, Class195 class195, float f, float f_131_,
	 Class446 class446, int i_132_, int i_133_, boolean bool) {
	if (!aBool2291)
	    return null;
	if (null == object)
	    return null;
	i_129_ = Math.max(0, Math.min(i_129_, 255));
	i_133_ = Math.max(0, i_133_);
	if (class195 != Class195.aClass195_2177
	    && !method4045(aClass446_2303, class446, f_131_, -2118445760))
	    return null;
	if (i_133_ <= 0)
	    i_133_ = 255;
	float f_134_ = (float) i_129_ / 255.0F;
	float f_135_ = (float) i_133_ / 255.0F;
	Interface69 interface69 = method4042(i, bool, 1963444770);
	Class488 class488 = method4104(interface69, (byte) -47);
	if (class488 == null)
	    return null;
	class488.method7943(object, -947553381);
	class488.method7953(i_130_, -1809872165);
	if (class195 != Class195.aClass195_2177) {
	    class488.method7915(true, 461570940);
	    class488.method7875(class446, -899168452);
	    class488.method7888(f, 1320909158);
	    class488.method7893(f_131_, 1131052114);
	    if (Class195.aClass195_2176 == class195)
		class488.method7877(anInterface57_2311, (byte) -2);
	    else if (class195 == Class195.aClass195_2179)
		class488.method7877(anInterface57_2309, (byte) 118);
	    else if (class195 == Class195.aClass195_2180)
		class488.method7877(anInterface57_2302, (byte) -39);
	    else if (Class195.aClass195_2178 == class195)
		class488.method7877(anInterface57_2312, (byte) 78);
	    else
		class488.method7915(false, 362522174);
	}
	class488.method7957(f_134_, 0, (byte) -30);
	class488.method7898(i_128_ > 1 || i_128_ < 0,
			    i_128_ > 0 ? i_128_ - 1 : i_128_, 970934966);
	class488.method7941(f_135_, 1714476650);
	class488.method7882(class204, (byte) 0);
	return class488;
    }
    
    public void method4111(Class488 class488) {
	class488.method7943(this, -2107137912);
	aList2301.add(class488);
    }
    
    public void method4112(Class488 class488) {
	class488.method7943(this, -60088838);
	aList2301.add(class488);
    }
    
    boolean method4113(Class446 class446, Class446 class446_136_, float f) {
	Class446 class446_137_ = Class446.method7225(class446_136_, class446);
	if (class446_137_.method7230() >= f)
	    return false;
	return true;
    }
    
    public void method4114(int i) {
	if (aBool2291 && i >= 0)
	    method4042(i, false, 2034167744);
    }
    
    public Class488 method4115
	(Class204 class204, Object object, int i, int i_138_, int i_139_,
	 int i_140_, Class195 class195, float f, float f_141_,
	 Class446 class446, int i_142_, int i_143_, boolean bool) {
	if (!aBool2291)
	    return null;
	if (null == object)
	    return null;
	i_139_ = Math.max(0, Math.min(i_139_, 255));
	i_143_ = Math.max(0, i_143_);
	if (class195 != Class195.aClass195_2177
	    && !method4045(aClass446_2303, class446, f_141_, -1668093270))
	    return null;
	if (i_143_ <= 0)
	    i_143_ = 255;
	float f_144_ = (float) i_139_ / 255.0F;
	float f_145_ = (float) i_143_ / 255.0F;
	Interface69 interface69 = method4042(i, bool, 1992181121);
	Class488 class488 = method4104(interface69, (byte) 24);
	if (class488 == null)
	    return null;
	class488.method7943(object, -1353213003);
	class488.method7953(i_140_, -1217977743);
	if (class195 != Class195.aClass195_2177) {
	    class488.method7915(true, 2048955877);
	    class488.method7875(class446, -258690578);
	    class488.method7888(f, 1902085076);
	    class488.method7893(f_141_, 1149258929);
	    if (Class195.aClass195_2176 == class195)
		class488.method7877(anInterface57_2311, (byte) 16);
	    else if (class195 == Class195.aClass195_2179)
		class488.method7877(anInterface57_2309, (byte) -15);
	    else if (class195 == Class195.aClass195_2180)
		class488.method7877(anInterface57_2302, (byte) 57);
	    else if (Class195.aClass195_2178 == class195)
		class488.method7877(anInterface57_2312, (byte) -36);
	    else
		class488.method7915(false, 807489109);
	}
	class488.method7957(f_144_, 0, (byte) -29);
	class488.method7898(i_138_ > 1 || i_138_ < 0,
			    i_138_ > 0 ? i_138_ - 1 : i_138_, -91794671);
	class488.method7941(f_145_, 1084863577);
	class488.method7882(class204, (byte) 0);
	return class488;
    }
    
    public Class488 method4116
	(Class204 class204, Object object, int i, int i_146_, int i_147_,
	 int i_148_, Class195 class195, float f, float f_149_,
	 Class446 class446, int i_150_, int i_151_, boolean bool) {
	if (!aBool2291)
	    return null;
	if (null == object)
	    return null;
	i_147_ = Math.max(0, Math.min(i_147_, 255));
	i_151_ = Math.max(0, i_151_);
	if (class195 != Class195.aClass195_2177
	    && !method4045(aClass446_2303, class446, f_149_, -1467012010))
	    return null;
	if (i_151_ <= 0)
	    i_151_ = 255;
	float f_152_ = (float) i_147_ / 255.0F;
	float f_153_ = (float) i_151_ / 255.0F;
	Interface69 interface69 = method4042(i, bool, 1941394727);
	Class488 class488 = method4104(interface69, (byte) -62);
	if (class488 == null)
	    return null;
	class488.method7943(object, -749269329);
	class488.method7953(i_148_, -1898062546);
	if (class195 != Class195.aClass195_2177) {
	    class488.method7915(true, 418623473);
	    class488.method7875(class446, -1972396925);
	    class488.method7888(f, 1608542900);
	    class488.method7893(f_149_, -1171957577);
	    if (Class195.aClass195_2176 == class195)
		class488.method7877(anInterface57_2311, (byte) 1);
	    else if (class195 == Class195.aClass195_2179)
		class488.method7877(anInterface57_2309, (byte) 9);
	    else if (class195 == Class195.aClass195_2180)
		class488.method7877(anInterface57_2302, (byte) -100);
	    else if (Class195.aClass195_2178 == class195)
		class488.method7877(anInterface57_2312, (byte) 95);
	    else
		class488.method7915(false, 1587234007);
	}
	class488.method7957(f_152_, 0, (byte) -100);
	class488.method7898(i_146_ > 1 || i_146_ < 0,
			    i_146_ > 0 ? i_146_ - 1 : i_146_, 748548393);
	class488.method7941(f_153_, 1158354628);
	class488.method7882(class204, (byte) 0);
	return class488;
    }
    
    float method4117(int i) {
	Class393 class393 = Class208.method3909(i, 1278179343);
	float f = 1.0F;
	for (/**/; class393 != null; class393 = class393.method6499(981298188))
	    f *= class393.method6501((byte) 0);
	return f;
    }
    
    public void method4118(Class204 class204, int i, int i_154_, int i_155_,
			   int i_156_, Class195 class195, float f,
			   float f_157_, Class446 class446, int i_158_,
			   int i_159_, int i_160_) {
	if (aBool2291) {
	    Class488 class488
		= method4046(class204, this, i, i_154_, i_155_, i_156_,
			     class195, f, f_157_, class446, i_158_, i_159_,
			     false, 482858762);
	    if (class488 != null) {
		if (i_160_ == 0)
		    class488.method7928(-1956062978);
		else
		    class488.method7894(i_160_, false, (byte) 91);
		method4026(class488, 404427059);
	    }
	}
    }
    
    public void method4119(int i, int i_161_) {
	if (anInt2285 * 1991744917 != i) {
	    if (null != aClass488_2305) {
		aClass488_2305.method7916(0, (byte) -90);
		method4026(aClass488_2305, 478799414);
		aClass488_2305 = null;
	    }
	    Class488 class488
		= method4046(Class204.aClass204_2234, this, i, 0, i_161_,
			     Class208.aClass208_2251.method3907((short) 20841),
			     Class195.aClass195_2177, 0.0F, 0.0F, null, 0, 255,
			     true, 74798684);
	    if (null != class488) {
		class488.method7872((byte) 1);
		aClass488_2305 = class488;
	    }
	    aBool2306 = false;
	}
    }
    
    public void method4120(int i) {
	anInt2307 = i * 681988639;
    }
    
    public void method4121(int i, int i_162_) {
	if (!aBool2291) {
	    anInt2300 = i * -2058858799;
	    aClass200_2284 = new Class200(i_162_, 100);
	    aClass200_2298 = new Class200(10);
	    aClass200_2284.method3783(new Class192(this), (byte) 55);
	    Class657 class657 = new Class657(Class380.aClass380_3923);
	    if (class657.aClass380_8438 == Class380.aClass380_3923)
		Class661.aClass372_8473 = new Class372_Sub2(class657);
	    else if (class657.aClass380_8438 == Class380.aClass380_3924)
		Class661.aClass372_8473 = new Class372_Sub1(class657);
	    else
		throw new RuntimeException();
	    method4034(1974323663);
	    anInt2285 = -406439357;
	    aBool2291 = true;
	}
    }
    
    public void method4122(int i) {
	anInt2307 = i * 681988639;
    }
    
    public int method4123() {
	return anInt2307 * -401036833;
    }
    
    public int method4124() {
	return anInt2307 * -401036833;
    }
    
    public int method4125() {
	return anInt2307 * -401036833;
    }
    
    public int method4126() {
	return anInt2307 * -401036833;
    }
    
    void method4127(int i) {
	if (null != client.aClass96_11085.aClass6_1169
	    && Class265.method4801(client.anInt11075 * 1777895575,
				   1968860419)) {
	    Class525_Sub15 class525_sub15
		= Class16.method767(Class412.aClass412_4289,
				    client.aClass96_11085.aClass6_1169,
				    1977859884);
	    class525_sub15.aClass525_Sub38_Sub2_10546.method16605(i,
								  -822658331);
	    client.aClass96_11085.method1794(class525_sub15, (short) 29458);
	}
    }
    
    public void method4128(int i) {
	Iterator iterator = aList2301.iterator();
	while (iterator.hasNext()) {
	    Class488 class488 = (Class488) iterator.next();
	    int i_163_ = class488.method7884((byte) 54);
	    boolean bool = Class505.method8321(i_163_, i, (byte) 3);
	    if (bool)
		class488.method7916(50, (byte) -110);
	}
    }
    
    Class488 method4129() {
	Iterator iterator = aList2301.iterator();
	while (iterator.hasNext()) {
	    Class488 class488 = (Class488) iterator.next();
	    if (class488.method7910(-1571199578) == Class204.aClass204_2234
		&& class488.method7879((byte) 59) == Class482.aClass482_5227)
		return class488;
	}
	return null;
    }
    
    public void method4130(int i, int i_164_, boolean bool, int i_165_,
			   int i_166_, int i_167_, int i_168_, int i_169_) {
	if (aBool2291 && i != 1991744917 * anInt2285) {
	    if (aBool2310 && null != aClass488_2304
		&& i != anInt2285 * 1991744917) {
		aClass488_2304.method7891((byte) 75);
		aClass488_2304.method7871(2074539932);
		aList2301.remove(aClass488_2304);
	    }
	    Class488 class488 = method4085(754275640);
	    if (class488 != null
		&& class488.method7897((byte) 114).method439(560836502) == i) {
		aClass488_2304 = class488;
		anInt2285
		    = (class488.method7897((byte) 123).method439(806960619)
		       * 406439357);
	    } else {
		boolean bool_170_ = false;
		if (anInt2285 * 1991744917 >= 0) {
		    Iterator iterator = aList2301.iterator();
		    while (iterator.hasNext()) {
			Class488 class488_171_ = (Class488) iterator.next();
			if (class488_171_.method7910(-1571199578)
			    == Class204.aClass204_2234) {
			    class488_171_.method7916(2000, (byte) -79);
			    bool_170_ = true;
			}
		    }
		}
		aClass488_2304 = null;
		anInt2285 = -406439357;
		Class488 class488_172_ = null;
		if (aClass488_2305 != null
		    && aClass488_2305.method7897((byte) 98) != null
		    && aClass488_2305.method7897((byte) 30)
			   .method439(-275754354) == i
		    && (aClass488_2305.method7879((byte) 32)
			== Class482.aClass482_5226)) {
		    class488_172_ = aClass488_2305;
		    aClass488_2305 = null;
		    aBool2306 = false;
		}
		if (null == class488_172_) {
		    if (bool) {
			float f = (float) i_168_;
			float f_173_ = (float) i_169_;
			Class446 class446 = new Class446((float) i_166_, 0.0F,
							 (float) i_167_);
			class488_172_
			    = method4046(Class204.aClass204_2234, this, i, 0,
					 bool_170_ ? 0 : i_164_,
					 (i == anInt2307 * -401036833
					  ? Class197.aClass197_2184
						.method3748((byte) -1)
					  : Class208.aClass208_2251
						.method3907((short) -1943)),
					 Class195.aClass195_2178, f, f_173_,
					 class446, i_165_, 255, true,
					 81327918);
		    } else
			class488_172_
			    = method4046(Class204.aClass204_2234, this, i, 0,
					 bool_170_ ? 0 : i_164_,
					 (anInt2307 * -401036833 == i
					  ? Class197.aClass197_2184
						.method3748((byte) 68)
					  : Class208.aClass208_2251
						.method3907((short) -29385)),
					 Class195.aClass195_2177, 0.0F, 0.0F,
					 null, 0, 255, true, 1506165970);
		}
		if (class488_172_ != null) {
		    if (bool_170_) {
			float f = (float) i_164_ / 255.0F;
			class488_172_.method7957(f, 2000, (byte) -60);
		    }
		    class488_172_.method7928(-1067678550);
		    method4026(class488_172_, 1202796894);
		    aClass488_2304 = class488_172_;
		    anInt2285 = 406439357 * i;
		    if (aBool2310)
			aClass488_2304.method7935(1350618175);
		    if (client.aClass96_11085.aClass6_1169 != null
			&& Class265.method4801(client.anInt11075 * 1777895575,
					       1589915367)) {
			Class525_Sub15 class525_sub15
			    = Class16.method767(Class412.aClass412_4344,
						(client.aClass96_11085
						 .aClass6_1169),
						1977859884);
			class525_sub15.aClass525_Sub38_Sub2_10546
			    .method16605(anInt2285 * 1991744917, -1649219877);
			client.aClass96_11085.method1794(class525_sub15,
							 (short) 27494);
		    }
		}
	    }
	}
    }
    
    public void method4131(int i, int i_174_, boolean bool, int i_175_,
			   int i_176_, int i_177_, int i_178_, int i_179_) {
	if (aBool2291 && i != 1991744917 * anInt2285) {
	    if (aBool2310 && null != aClass488_2304
		&& i != anInt2285 * 1991744917) {
		aClass488_2304.method7891((byte) -70);
		aClass488_2304.method7871(2010772339);
		aList2301.remove(aClass488_2304);
	    }
	    Class488 class488 = method4085(206988850);
	    if (class488 != null
		&& class488.method7897((byte) 36).method439(427145639) == i) {
		aClass488_2304 = class488;
		anInt2285
		    = (class488.method7897((byte) 42).method439(-1029409152)
		       * 406439357);
	    } else {
		boolean bool_180_ = false;
		if (anInt2285 * 1991744917 >= 0) {
		    Iterator iterator = aList2301.iterator();
		    while (iterator.hasNext()) {
			Class488 class488_181_ = (Class488) iterator.next();
			if (class488_181_.method7910(-1571199578)
			    == Class204.aClass204_2234) {
			    class488_181_.method7916(2000, (byte) -66);
			    bool_180_ = true;
			}
		    }
		}
		aClass488_2304 = null;
		anInt2285 = -406439357;
		Class488 class488_182_ = null;
		if (aClass488_2305 != null
		    && aClass488_2305.method7897((byte) 36) != null
		    && aClass488_2305.method7897((byte) 58)
			   .method439(-817562011) == i
		    && (aClass488_2305.method7879((byte) 21)
			== Class482.aClass482_5226)) {
		    class488_182_ = aClass488_2305;
		    aClass488_2305 = null;
		    aBool2306 = false;
		}
		if (null == class488_182_) {
		    if (bool) {
			float f = (float) i_178_;
			float f_183_ = (float) i_179_;
			Class446 class446 = new Class446((float) i_176_, 0.0F,
							 (float) i_177_);
			class488_182_
			    = method4046(Class204.aClass204_2234, this, i, 0,
					 bool_180_ ? 0 : i_174_,
					 (i == anInt2307 * -401036833
					  ? Class197.aClass197_2184
						.method3748((byte) 110)
					  : Class208.aClass208_2251
						.method3907((short) 6450)),
					 Class195.aClass195_2178, f, f_183_,
					 class446, i_175_, 255, true,
					 1278316612);
		    } else
			class488_182_
			    = method4046(Class204.aClass204_2234, this, i, 0,
					 bool_180_ ? 0 : i_174_,
					 (anInt2307 * -401036833 == i
					  ? Class197.aClass197_2184
						.method3748((byte) 1)
					  : Class208.aClass208_2251
						.method3907((short) 12271)),
					 Class195.aClass195_2177, 0.0F, 0.0F,
					 null, 0, 255, true, -822683041);
		}
		if (class488_182_ != null) {
		    if (bool_180_) {
			float f = (float) i_174_ / 255.0F;
			class488_182_.method7957(f, 2000, (byte) -17);
		    }
		    class488_182_.method7928(-1190960888);
		    method4026(class488_182_, 1802807265);
		    aClass488_2304 = class488_182_;
		    anInt2285 = 406439357 * i;
		    if (aBool2310)
			aClass488_2304.method7935(1350618175);
		    if (client.aClass96_11085.aClass6_1169 != null
			&& Class265.method4801(client.anInt11075 * 1777895575,
					       -1783400220)) {
			Class525_Sub15 class525_sub15
			    = Class16.method767(Class412.aClass412_4344,
						(client.aClass96_11085
						 .aClass6_1169),
						1977859884);
			class525_sub15.aClass525_Sub38_Sub2_10546
			    .method16605(anInt2285 * 1991744917, -1193660435);
			client.aClass96_11085.method1794(class525_sub15,
							 (short) 30537);
		    }
		}
	    }
	}
    }
    
    Class488 method4132() {
	Iterator iterator = aList2301.iterator();
	while (iterator.hasNext()) {
	    Class488 class488 = (Class488) iterator.next();
	    if (class488.method7910(-1571199578) == Class204.aClass204_2234
		&& class488.method7879((byte) 96) == Class482.aClass482_5227)
		return class488;
	}
	return null;
    }
    
    public void method4133(int i, int i_184_) {
	if (aBool2291 && (!aBool2310 || -2080866315 * anInt2308 != i)) {
	    if (aBool2310 && -2080866315 * anInt2308 != i) {
		Iterator iterator = aList2292.iterator();
		while (iterator.hasNext()) {
		    Class488 class488 = (Class488) iterator.next();
		    if (class488.method7910(-1571199578)
			== Class204.aClass204_2235) {
			class488.method7871(1970682976);
			aList2301.remove(class488);
			aBool2310 = false;
			break;
		    }
		}
	    }
	    if (i_184_ != 0 && i != -1) {
		if (!aBool2310 && aClass488_2304 != null)
		    aClass488_2304.method7935(1350618175);
		Class488 class488
		    = method4046(Class204.aClass204_2235, this, i, 0, i_184_,
				 Class208.aClass208_2251
				     .method3907((short) 22480),
				 Class195.aClass195_2177, 0.0F, 0.0F, null, 0,
				 255, true, -769730056);
		if (class488 != null) {
		    class488.method7928(-1633674721);
		    method4026(class488, 1376274823);
		    aBool2310 = true;
		    anInt2308 = i * -80415651;
		}
	    }
	}
    }
    
    public void method4134() {
	Iterator iterator = aList2301.iterator();
	while (iterator.hasNext()) {
	    Class488 class488 = (Class488) iterator.next();
	    if (class488.method7910(-1571199578) == Class204.aClass204_2234) {
		class488.method7916(500, (byte) -27);
		if (class488.method7897((byte) 6).method439(-1958516086)
		    == 1991744917 * anInt2285) {
		    method4052(1991744917 * anInt2285, -1054701696);
		    break;
		}
	    }
	}
	aClass488_2304 = null;
	anInt2285 = -406439357;
    }
    
    Class446 method4135() {
	return aClass446_2303;
    }
    
    void method4136() {
	Class189 class189 = new Class189(this);
	Class235 class235 = new Class235(this);
	Class213 class213 = new Class213(this);
	Class223 class223 = new Class223(this);
	Class220 class220 = new Class220(this);
	Class251.method4511(Class197.aClass197_2182.method3748((byte) 33),
			    Class197.aClass197_2181.method3748((byte) 97),
			    0.2F, class189, 1157975089);
	Class251.method4511(Class197.aClass197_2183.method3748((byte) -51),
			    Class197.aClass197_2181.method3748((byte) 41),
			    1.0F, class235, 1522884290);
	Class251.method4511(Class197.aClass197_2184.method3748((byte) 111),
			    Class197.aClass197_2181.method3748((byte) -47),
			    1.0F, class213, -1013132510);
	Class251.method4511(Class197.aClass197_2185.method3748((byte) -15),
			    Class197.aClass197_2181.method3748((byte) -23),
			    0.8F, class223, 730657155);
	Class251.method4511(Class197.aClass197_2186.method3748((byte) 34),
			    Class197.aClass197_2181.method3748((byte) -76),
			    1.0F, class220, 1306985797);
	Class251.method4511(Class208.aClass208_2251.method3907((short) 5639),
			    Class197.aClass197_2183.method3748((byte) -25),
			    1.0F, null, -763653902);
	Class251.method4511(Class208.aClass208_2252.method3907((short) 7441),
			    Class197.aClass197_2186.method3748((byte) -85),
			    1.0F, null, 1135487616);
	Class251.method4511(Class208.aClass208_2250.method3907((short) 9353),
			    Class197.aClass197_2182.method3748((byte) 28),
			    1.0F, null, 1483057676);
	Class251.method4511(Class208.aClass208_2253.method3907((short) -26590),
			    Class197.aClass197_2182.method3748((byte) 122),
			    1.0F, null, -1173179854);
	Class251.method4511(Class208.aClass208_2260.method3907((short) -2591),
			    Class197.aClass197_2182.method3748((byte) -24),
			    1.0F, null, 920698381);
	Class251.method4511(Class208.aClass208_2255.method3907((short) 2319),
			    Class197.aClass197_2182.method3748((byte) 105),
			    1.0F, null, -1374614003);
	Class251.method4511(Class208.aClass208_2256.method3907((short) 19825),
			    Class197.aClass197_2182.method3748((byte) 119),
			    1.0F, null, -1716108856);
	Class251.method4511(Class208.aClass208_2257.method3907((short) -18559),
			    Class197.aClass197_2185.method3748((byte) -2),
			    1.0F, null, 1465412059);
	Class251.method4511(Class208.aClass208_2254.method3907((short) -25653),
			    Class208.aClass208_2257.method3907((short) 10331),
			    1.0F, null, -366796296);
	Class251.method4511(Class208.aClass208_2259.method3907((short) -29130),
			    Class208.aClass208_2257.method3907((short) 14613),
			    1.0F, null, -1635577771);
	Class208.method3909
	    (Class208.aClass208_2251.method3907((short) -15857), 302192948)
	    .method6489(0.75F, -1154700593);
    }
    
    public void method4137(int i, int i_185_) {
	if (aBool2291 && (!aBool2310 || -2080866315 * anInt2308 != i)) {
	    if (aBool2310 && -2080866315 * anInt2308 != i) {
		Iterator iterator = aList2292.iterator();
		while (iterator.hasNext()) {
		    Class488 class488 = (Class488) iterator.next();
		    if (class488.method7910(-1571199578)
			== Class204.aClass204_2235) {
			class488.method7871(2086229073);
			aList2301.remove(class488);
			aBool2310 = false;
			break;
		    }
		}
	    }
	    if (i_185_ != 0 && i != -1) {
		if (!aBool2310 && aClass488_2304 != null)
		    aClass488_2304.method7935(1350618175);
		Class488 class488
		    = method4046(Class204.aClass204_2235, this, i, 0, i_185_,
				 Class208.aClass208_2251
				     .method3907((short) 1323),
				 Class195.aClass195_2177, 0.0F, 0.0F, null, 0,
				 255, true, -38449981);
		if (class488 != null) {
		    class488.method7928(-754264911);
		    method4026(class488, -244456167);
		    aBool2310 = true;
		    anInt2308 = i * -80415651;
		}
	    }
	}
    }
    
    public void method4138(int i) {
	anInt2307 = i * 681988639;
    }
    
    public void method4139(AnimationDefinition class194, int i) {
	if (null != class194 && null != class194.anIntArrayArray2160
	    && i < class194.anIntArrayArray2160.length
	    && null != class194.anIntArrayArray2160[i]) {
	    int i_186_ = class194.anIntArrayArray2160[i][0];
	    int i_187_ = i_186_ >> 8;
	    int i_188_ = i_186_ >> 5 & 0x7;
	    if (class194.anIntArrayArray2160[i].length > 1) {
		int i_189_ = (int) (Math.random()
				    * (double) (class194.anIntArrayArray2160
						[i]).length);
		if (i_189_ > 0)
		    i_187_ = class194.anIntArrayArray2160[i][i_189_];
	    }
	    int i_190_ = 256;
	    if (null != class194.anIntArray2172
		&& class194.anIntArray2173 != null)
		i_190_ = (int) ((double) class194.anIntArray2172[i]
				+ (Math.random()
				   * (double) (class194.anIntArray2173[i]
					       - class194.anIntArray2172[i])));
	    int i_191_ = (class194.anIntArray2151 == null ? 255
			  : class194.anIntArray2151[i]);
	    method4047(Class204.aClass204_2226, i_187_, i_188_, i_191_,
		       Class208.aClass208_2260.method3907((short) 11628),
		       Class195.aClass195_2177, 0.0F, 0.0F, null, 0, i_190_, 0,
		       2143693963);
	}
    }
    
    public void method4140(AnimationDefinition class194, int i) {
	if (null != class194 && null != class194.anIntArrayArray2160
	    && i < class194.anIntArrayArray2160.length
	    && null != class194.anIntArrayArray2160[i]) {
	    int i_192_ = class194.anIntArrayArray2160[i][0];
	    int i_193_ = i_192_ >> 8;
	    int i_194_ = i_192_ >> 5 & 0x7;
	    if (class194.anIntArrayArray2160[i].length > 1) {
		int i_195_ = (int) (Math.random()
				    * (double) (class194.anIntArrayArray2160
						[i]).length);
		if (i_195_ > 0)
		    i_193_ = class194.anIntArrayArray2160[i][i_195_];
	    }
	    int i_196_ = 256;
	    if (null != class194.anIntArray2172
		&& class194.anIntArray2173 != null)
		i_196_ = (int) ((double) class194.anIntArray2172[i]
				+ (Math.random()
				   * (double) (class194.anIntArray2173[i]
					       - class194.anIntArray2172[i])));
	    int i_197_ = (class194.anIntArray2151 == null ? 255
			  : class194.anIntArray2151[i]);
	    method4047(Class204.aClass204_2226, i_193_, i_194_, i_197_,
		       Class208.aClass208_2260.method3907((short) -18492),
		       Class195.aClass195_2177, 0.0F, 0.0F, null, 0, i_196_, 0,
		       2102908166);
	}
    }
    
    public static void method4141(Class68 class68, int i) {
	Class390.method6471(new Class582(class68), -1616256857);
    }
    
    static final void method4142(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class385.method6438(class259, class245, class683, 530643764);
    }
    
    static final void method4143(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = class259.aBool2607 ? 1 : 0;
    }
    
    static final void method4144(Class683 class683, byte i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = 100;
    }
    
    static final void method4145(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class183.method3600(class259, class245, true, 1, class683,
			    -1533958979);
    }
    
    public static void method4146(int i, boolean bool, byte i_198_) {
	Class198_Sub17.method15659
	    (i, Class53.aClass53_475.method1169(Class21.aClass666_213,
						1552651121), bool, 1750167083);
    }
    
    static final void method4147(int i) {
	Class696_Sub14.method17093(Class501.aClass182_5564, (byte) 20);
	if (Class677.anInt8619 * -1335910809 != 1805644061 * client.anInt11065)
	    Class559.method9401((byte) -83);
    }
    
    static final void method4148(int i) {
	Class525_Sub38_Sub2 class525_sub38_sub2
	    = client.aClass96_11085.aClass525_Sub38_Sub2_1168;
	class525_sub38_sub2.method18495(-1082113888);
	int i_199_ = class525_sub38_sub2.method18496(8, 578733530);
	if (i_199_ < 1111866889 * client.anInt11216) {
	    for (int i_200_ = i_199_; i_200_ < client.anInt11216 * 1111866889;
		 i_200_++)
		client.anIntArray11130
		    [(client.anInt11151 += 424841119) * -1613312929 - 1]
		    = client.anIntArray11125[i_200_];
	}
	if (i_199_ > 1111866889 * client.anInt11216)
	    throw new RuntimeException();
	client.anInt11216 = 0;
	for (int i_201_ = 0; i_201_ < i_199_; i_201_++) {
	    int i_202_ = client.anIntArray11125[i_201_];
	    Class656_Sub1_Sub3_Sub1_Sub2 class656_sub1_sub3_sub1_sub2
		= ((Class656_Sub1_Sub3_Sub1_Sub2)
		   (((Class525_Sub19)
		     client.aClass10_11121.method684((long) i_202_))
		    .anObject10571));
	    int i_203_ = class525_sub38_sub2.method18496(1, 578733530);
	    if (0 == i_203_) {
		client.anIntArray11125
		    [(client.anInt11216 += -639684551) * 1111866889 - 1]
		    = i_202_;
		class656_sub1_sub3_sub1_sub2.anInt12006
		    = -1954352425 * client.anInt11227;
	    } else {
		int i_204_ = class525_sub38_sub2.method18496(2, 578733530);
		if (0 == i_204_) {
		    client.anIntArray11125
			[(client.anInt11216 += -639684551) * 1111866889 - 1]
			= i_202_;
		    class656_sub1_sub3_sub1_sub2.anInt12006
			= -1954352425 * client.anInt11227;
		    client.anIntArray11297
			[(client.anInt11126 += 831656353) * 1311380065 - 1]
			= i_202_;
		} else if (i_204_ == 1) {
		    client.anIntArray11125
			[(client.anInt11216 += -639684551) * 1111866889 - 1]
			= i_202_;
		    class656_sub1_sub3_sub1_sub2.anInt12006
			= client.anInt11227 * -1954352425;
		    Class682 class682
			= ((Class682)
			   Class539.method8888(Class413
						   .method6684(-1837801095),
					       class525_sub38_sub2
						   .method18496(3, 578733530),
					       -1954189007));
		    class656_sub1_sub3_sub1_sub2.method18944(class682,
							     (Class684
							      .aClass684_8668
							      .aByte8666),
							     -2138307231);
		    int i_205_ = class525_sub38_sub2.method18496(1, 578733530);
		    if (i_205_ == 1)
			client.anIntArray11297
			    [(client.anInt11126 += 831656353) * 1311380065 - 1]
			    = i_202_;
		} else if (i_204_ == 2) {
		    client.anIntArray11125
			[(client.anInt11216 += -639684551) * 1111866889 - 1]
			= i_202_;
		    class656_sub1_sub3_sub1_sub2.anInt12006
			= -1954352425 * client.anInt11227;
		    if (class525_sub38_sub2.method18496(1, 578733530) == 1) {
			Class682 class682
			    = ((Class682)
			       (Class539.method8888
				(Class413.method6684(-298628547),
				 class525_sub38_sub2.method18496(3, 578733530),
				 2080294979)));
			class656_sub1_sub3_sub1_sub2.method18944
			    (class682, Class684.aClass684_8669.aByte8666,
			     -1079412805);
			Class682 class682_206_
			    = ((Class682)
			       (Class539.method8888
				(Class413.method6684(-2088330095),
				 class525_sub38_sub2.method18496(3, 578733530),
				 2021779782)));
			class656_sub1_sub3_sub1_sub2.method18944
			    (class682_206_, Class684.aClass684_8669.aByte8666,
			     -449608246);
		    } else {
			Class682 class682
			    = ((Class682)
			       (Class539.method8888
				(Class413.method6684(1619191616),
				 class525_sub38_sub2.method18496(3, 578733530),
				 -1078680584)));
			class656_sub1_sub3_sub1_sub2.method18944
			    (class682, Class684.aClass684_8667.aByte8666,
			     -649887612);
		    }
		    int i_207_ = class525_sub38_sub2.method18496(1, 578733530);
		    if (i_207_ == 1)
			client.anIntArray11297
			    [(client.anInt11126 += 831656353) * 1311380065 - 1]
			    = i_202_;
		} else if (i_204_ == 3)
		    client.anIntArray11130
			[(client.anInt11151 += 424841119) * -1613312929 - 1]
			= i_202_;
	    }
	}
    }
    
    static final void method4149(int i, int i_208_, int i_209_, boolean bool,
				 int i_210_) {
	if (Class165.method2667(i, null, -1843430361))
	    Class235.method4403((Class162.aClass245Array1764[i]
				 .aClass259Array2426),
				-1, i_208_, i_209_, bool, -38308315);
    }
    
    static final void method4150(Class683 class683, int i) {
	int i_211_ = (class683.anIntArray8661
		      [(class683.anInt8662 -= 1552651121) * 501271953]);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub12_10698
		  .method14167(i_211_, (byte) -76);
    }
}
