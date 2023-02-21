/* Class532 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Canvas;

public class Class532
{
    Class689 aClass689_7149;
    int anInt7150;
    Class656_Sub1 aClass656_Sub1_7151;
    Class633 aClass633_7152;
    Class40_Sub11 aClass40_Sub11_7153;
    int anInt7154;
    byte aByte7155;
    Class179 aClass179_7156;
    Class689 aClass689_7157;
    boolean aBool7158 = false;
    int anInt7159;
    int anInt7160 = 978295007;
    int anInt7161 = 0;
    boolean aBool7162 = false;
    boolean aBool7163;
    Class525_Sub16_Sub17 aClass525_Sub16_Sub17_7164;
    boolean aBool7165 = false;
    boolean[] aBoolArray7166;
    int anInt7167;
    Class604 aClass604_7168;
    public static Canvas aCanvas7169;
    public static Class111 aClass111_7170;
    
    int method8803() {
	return 1128829579 * anInt7161;
    }
    
    public void method8804(int i, int i_0_, short i_1_) {
	aClass689_7149 = null;
	if (i_0_ > 0) {
	    aClass689_7149 = new Class689_Sub2(aClass656_Sub1_7151, false);
	    aClass689_7149.method14082(i, i_0_, 1, false, -909486910);
	} else {
	    aBool7162 = true;
	    method8814(false, i, 1, 0, (byte) 0);
	}
    }
    
    int method8805(int i) {
	return 1128829579 * anInt7161;
    }
    
    void method8806(Class604 class604, int i) {
	aClass604_7168 = class604;
	aClass179_7156 = null;
    }
    
    int method8807(byte i) {
	return -method8805(1774441449);
    }
    
    Class532(Class182 class182, Class40_Sub11 class40_sub11, Class602 class602,
	     int i, int i_2_, int i_3_, Class656_Sub1 class656_sub1,
	     boolean bool, int i_4_, int i_5_) {
	aClass40_Sub11_7153 = class40_sub11;
	anInt7150 = 751757651 * class602.anInt7894;
	anInt7167 = -1605321629 * i;
	anInt7154 = i_2_ * 872927805;
	aClass656_Sub1_7151 = class656_sub1;
	aBool7162 = i_4_ != -1;
	aByte7155 = (byte) i_3_;
	aBool7158 = bool;
	aBool7163 = class182.method3345() && class602.aBool7926 && !aBool7158;
	aClass689_7157 = new Class689_Sub2(class656_sub1, false);
	method8814(false, i_4_, 1, aBool7162 ? i_5_ : 0, (byte) -59);
    }
    
    final Class179 method8808(Class182 class182, int i, boolean bool,
			      boolean bool_6_, int i_7_) {
	Class602 class602
	    = (Class602) aClass40_Sub11_7153.method76(-434636307 * anInt7150,
						      -1268325169);
	if (null != class602.anIntArray7923)
	    class602
		= class602.method9909(aClass111_7170,
				      (4 == client.anInt11145 * 1874190559
				       ? (Interface18) (Class201
							.anInterface18_2214)
				       : aClass111_7170),
				      -1751395405);
	if (class602 == null) {
	    method8812(class182, 733380782);
	    anInt7160 = 978295007;
	    return null;
	}
	if (!aBool7162
	    && 1156889815 * class602.anInt7894 != 498457825 * anInt7160) {
	    method8814(true, -1, 0, 0, (byte) 0);
	    aBool7165 = false;
	    aClass179_7156 = null;
	}
	method8831(aClass656_Sub1_7151, -135878684);
	if (bool_6_)
	    bool_6_ = bool_6_ & (aBool7163 & !aBool7165
				 & Class198_Sub13.aClass525_Sub30_9973
				       .aClass696_Sub15_10715
				       .method17108(1947100829) != 0);
	if (bool && !bool_6_) {
	    anInt7160 = class602.anInt7894 * -1571366729;
	    return null;
	}
	Class446 class446 = aClass656_Sub1_7151.method10818().aClass446_4807;
	Class546 class546 = client.aClass507_11137.method8358((byte) 17);
	if (bool_6_) {
	    class546.method9039(aClass525_Sub16_Sub17_7164, aByte7155,
				(int) class446.aFloat4895,
				(int) class446.aFloat4897, aBoolArray7166,
				1999719583);
	    aBool7165 = false;
	}
	Class161 class161 = class546.aClass161Array7226[aByte7155];
	Class161 class161_8_;
	if (aBool7158)
	    class161_8_ = class546.aClass161Array7215[0];
	else
	    class161_8_
		= (aByte7155 < 3 ? class546.aClass161Array7226[aByte7155 + 1]
		   : null);
	Class179 class179 = null;
	if (aClass689_7157.method14021(-1333063804)) {
	    if (bool_6_)
		i |= 0x40000;
	    class179
		= (class602.method9907
		   (class182, i,
		    11 != 1886365003 * anInt7167 ? anInt7167 * 1886365003 : 10,
		    (11 == anInt7167 * 1886365003 ? anInt7154 * 287036693 + 4
		     : 287036693 * anInt7154),
		    class161, class161_8_, (int) class446.aFloat4895,
		    class161.method2619((int) class446.aFloat4895,
					(int) class446.aFloat4897, -220309649),
		    (int) class446.aFloat4897, aClass689_7157, aClass604_7168,
		    -1180137423));
	    if (class179 != null) {
		if (bool_6_) {
		    if (null == aBoolArray7166)
			aBoolArray7166 = new boolean[4];
		    aClass525_Sub16_Sub17_7164
			= class179.method2955(aClass525_Sub16_Sub17_7164);
		    class546.method8984(aClass525_Sub16_Sub17_7164, aByte7155,
					(int) class446.aFloat4895,
					(int) class446.aFloat4897,
					aBoolArray7166, (short) -28432);
		    aBool7165 = true;
		}
		anInt7161 = class179.method2960() * 835568931;
		class179.method2957();
	    } else {
		aBoolArray7166 = null;
		aClass525_Sub16_Sub17_7164 = null;
		anInt7161 = 0;
	    }
	    aClass179_7156 = null;
	} else if (null == aClass179_7156
		   || (aClass179_7156.method2928() & i) != i
		   || (1156889815 * class602.anInt7894
		       != anInt7160 * 498457825)) {
	    if (null != aClass179_7156)
		i |= aClass179_7156.method2928();
	    Class20 class20
		= (class602.method9919
		   (class182, i,
		    11 != anInt7167 * 1886365003 ? 1886365003 * anInt7167 : 10,
		    (11 == anInt7167 * 1886365003 ? 4 + anInt7154 * 287036693
		     : anInt7154 * 287036693),
		    class161, class161_8_, (int) class446.aFloat4895,
		    class161.method2619((int) class446.aFloat4895,
					(int) class446.aFloat4897, 1860027246),
		    (int) class446.aFloat4897, bool_6_, aClass604_7168,
		    2075942148));
	    if (class20 != null) {
		aClass179_7156 = class179 = (Class179) class20.anObject207;
		if (bool_6_) {
		    aClass525_Sub16_Sub17_7164
			= (Class525_Sub16_Sub17) class20.anObject208;
		    aBoolArray7166 = null;
		    class546.method8984(aClass525_Sub16_Sub17_7164, aByte7155,
					(int) class446.aFloat4895,
					(int) class446.aFloat4897, null,
					(short) 12260);
		    aBool7165 = true;
		}
		anInt7161 = class179.method2960() * 835568931;
		class179.method2957();
	    } else {
		aBoolArray7166 = null;
		aClass525_Sub16_Sub17_7164 = null;
		aClass179_7156 = null;
		anInt7161 = 0;
	    }
	} else
	    class179 = aClass179_7156;
	anInt7160 = class602.anInt7894 * -1571366729;
	return class179;
    }
    
    void method8809(Class604 class604) {
	aClass604_7168 = class604;
	aClass179_7156 = null;
    }
    
    boolean method8810(int i) {
	return aBool7163;
    }
    
    Class602 method8811() {
	return (Class602) aClass40_Sub11_7153.method76(-434636307 * anInt7150,
						       -1379194027);
    }
    
    void method8812(Class182 class182, int i) {
	if (null != aClass525_Sub16_Sub17_7164) {
	    Class446 class446
		= aClass656_Sub1_7151.method10818().aClass446_4807;
	    client.aClass507_11137.method8358((byte) 59).method9039
		(aClass525_Sub16_Sub17_7164, aByte7155,
		 (int) class446.aFloat4895, (int) class446.aFloat4897,
		 aBoolArray7166, 1667058352);
	    aBoolArray7166 = null;
	    aClass525_Sub16_Sub17_7164 = null;
	}
    }
    
    void method8813(Class182 class182, int i) {
	method8808(class182, 262144, true, true, 262038567);
    }
    
    void method8814(boolean bool, int i, int i_9_, int i_10_, byte i_11_) {
	int i_12_ = i;
	boolean bool_13_ = false;
	if (-1 == i_12_) {
	    Class602 class602
		= ((Class602)
		   aClass40_Sub11_7153.method76(-434636307 * anInt7150,
						1207398690));
	    Class602 class602_14_ = class602;
	    if (null != class602.anIntArray7923)
		class602 = (class602.method9909
			    (aClass111_7170,
			     (4 == client.anInt11145 * 1874190559
			      ? (Interface18) Class201.anInterface18_2214
			      : aClass111_7170),
			     -1673962431));
	    if (class602 == null)
		return;
	    if (class602_14_ == class602)
		class602_14_ = null;
	    if (class602.method9956(-1884857926)) {
		if (!class602.aBool7897 || Class198_Sub13
					       .aClass525_Sub30_9973
					       .aClass696_Sub36_10699
					       .method17294(-494153090) == 1) {
		    if (bool && aClass689_7157.method14021(161045229)
			&& class602.method9917(aClass689_7157
						   .method14048(-1927509677),
					       -2095819240))
			return;
		    if (class602.anInt7894 * 1156889815
			!= 498457825 * anInt7160)
			bool_13_ = class602.aBool7909;
		    i_12_ = class602.method9915(1046444406);
		    if (class602.method9914(1403593260))
			i_9_ = 0;
		    else
			i_9_ = 1;
		}
	    } else if (null != class602_14_
		       && class602_14_.method9956(-1122018235)
		       && (!class602_14_.aBool7897
			   || Class198_Sub13.aClass525_Sub30_9973
				  .aClass696_Sub36_10699
				  .method17294(706732240) == 1)) {
		if (bool && aClass689_7157.method14021(-1045444642)
		    && class602_14_.method9917(aClass689_7157
						   .method14048(374532763),
					       -2075737023))
		    return;
		if (498457825 * anInt7160 != class602.anInt7894 * 1156889815)
		    bool_13_ = class602_14_.aBool7909;
		i_12_ = class602_14_.method9915(1046444406);
		if (class602_14_.method9914(-772010927))
		    i_9_ = 0;
		else
		    i_9_ = 1;
	    }
	}
	if (-1 == i_12_)
	    aClass689_7157.method14026(-1, false, 16711680);
	else {
	    aClass689_7157.method14082(i_12_, i_10_, i_9_, bool_13_,
				       -1696617732);
	    anInt7159 = client.anInt11083 * -98994841;
	    aBool7165 = false;
	    aClass179_7156 = null;
	}
    }
    
    public void method8815(int i, int i_15_) {
	aClass689_7149 = null;
	if (i_15_ > 0) {
	    aClass689_7149 = new Class689_Sub2(aClass656_Sub1_7151, false);
	    aClass689_7149.method14082(i, i_15_, 1, false, -891584676);
	} else {
	    aBool7162 = true;
	    method8814(false, i, 1, 0, (byte) -74);
	}
    }
    
    void method8816(Class182 class182, Class179 class179, Class444 class444,
		    int i, int i_16_, int i_17_, int i_18_, boolean bool) {
	Class184[] class184s = class179.method2979();
	Class154[] class154s = class179.method2980();
	if ((null == aClass633_7152 || aClass633_7152.aBool8234)
	    && (class184s != null || class154s != null)) {
	    Class602 class602
		= ((Class602)
		   aClass40_Sub11_7153.method76(anInt7150 * -434636307,
						1929988173));
	    if (class602.anIntArray7923 != null)
		class602 = (class602.method9909
			    (aClass111_7170,
			     (4 == 1874190559 * client.anInt11145
			      ? (Interface18) Class201.anInterface18_2214
			      : aClass111_7170),
			     -1995545249));
	    if (null != class602)
		aClass633_7152 = Class633.method10348(client.anInt11083, true);
	}
	if (aClass633_7152 != null) {
	    class179.method2978(class444);
	    if (bool)
		aClass633_7152.method10336(class182, (long) client.anInt11083,
					   class184s, class154s, false);
	    else
		aClass633_7152.method10335((long) client.anInt11083);
	    aClass633_7152.method10341(aByte7155, i, i_16_, i_17_, i_18_);
	}
    }
    
    void method8817(Class604 class604) {
	aClass604_7168 = class604;
	aClass179_7156 = null;
    }
    
    void method8818(boolean bool, int i, int i_19_, int i_20_) {
	int i_21_ = i;
	boolean bool_22_ = false;
	if (-1 == i_21_) {
	    Class602 class602
		= ((Class602)
		   aClass40_Sub11_7153.method76(-434636307 * anInt7150,
						578394813));
	    Class602 class602_23_ = class602;
	    if (null != class602.anIntArray7923)
		class602 = (class602.method9909
			    (aClass111_7170,
			     (4 == client.anInt11145 * 1874190559
			      ? (Interface18) Class201.anInterface18_2214
			      : aClass111_7170),
			     -1990375145));
	    if (class602 == null)
		return;
	    if (class602_23_ == class602)
		class602_23_ = null;
	    if (class602.method9956(-1869994413)) {
		if (!class602.aBool7897 || Class198_Sub13
					       .aClass525_Sub30_9973
					       .aClass696_Sub36_10699
					       .method17294(1404574456) == 1) {
		    if (bool && aClass689_7157.method14021(-1169434497)
			&& class602.method9917(aClass689_7157
						   .method14048(-436317201),
					       -2095359181))
			return;
		    if (class602.anInt7894 * 1156889815
			!= 498457825 * anInt7160)
			bool_22_ = class602.aBool7909;
		    i_21_ = class602.method9915(1046444406);
		    if (class602.method9914(688986026))
			i_19_ = 0;
		    else
			i_19_ = 1;
		}
	    } else if (null != class602_23_
		       && class602_23_.method9956(-1010523527)
		       && (!class602_23_.aBool7897
			   || Class198_Sub13.aClass525_Sub30_9973
				  .aClass696_Sub36_10699
				  .method17294(591300082) == 1)) {
		if (bool && aClass689_7157.method14021(-645668944)
		    && class602_23_.method9917(aClass689_7157
						   .method14048(-1302461521),
					       -2074044166))
		    return;
		if (498457825 * anInt7160 != class602.anInt7894 * 1156889815)
		    bool_22_ = class602_23_.aBool7909;
		i_21_ = class602_23_.method9915(1046444406);
		if (class602_23_.method9914(1834192050))
		    i_19_ = 0;
		else
		    i_19_ = 1;
	    }
	}
	if (-1 == i_21_)
	    aClass689_7157.method14026(-1, false, 16711680);
	else {
	    aClass689_7157.method14082(i_21_, i_20_, i_19_, bool_22_,
				       1174380242);
	    anInt7159 = client.anInt11083 * -98994841;
	    aBool7165 = false;
	    aClass179_7156 = null;
	}
    }
    
    void method8819(Class182 class182) {
	if (null != aClass525_Sub16_Sub17_7164) {
	    Class446 class446
		= aClass656_Sub1_7151.method10818().aClass446_4807;
	    client.aClass507_11137.method8358((byte) 77).method9039
		(aClass525_Sub16_Sub17_7164, aByte7155,
		 (int) class446.aFloat4895, (int) class446.aFloat4897,
		 aBoolArray7166, 1204434774);
	    aBoolArray7166 = null;
	    aClass525_Sub16_Sub17_7164 = null;
	}
    }
    
    int method8820() {
	return -method8805(-290709051);
    }
    
    int method8821() {
	return -method8805(-138834874);
    }
    
    Class602 method8822() {
	return (Class602) aClass40_Sub11_7153.method76(-434636307 * anInt7150,
						       -1280132571);
    }
    
    void method8823(Class656_Sub1 class656_sub1) {
	if (aClass689_7149 != null && aClass689_7149.method14021(423416169)) {
	    aClass689_7149.method14041((client.anInt11083
					- anInt7159 * 1057216087),
				       1935614986);
	    if (aClass689_7149.method14039(-773243017))
		aClass689_7149.method14068(-1, (byte) 7);
	    if (!aClass689_7149.method14030(858264343)) {
		aClass689_7157 = aClass689_7149;
		aBool7162 = true;
		anInt7159 = -98994841 * client.anInt11083;
		return;
	    }
	}
	if (aClass689_7157.method14021(240677553)) {
	    if (aClass689_7157.method14041((client.anInt11083
					    - 1057216087 * anInt7159),
					   2091948120)) {
		if (Class198_Sub13.aClass525_Sub30_9973
			.aClass696_Sub15_10715.method17108(1569052121)
		    == 2)
		    aBool7165 = false;
		if (aClass689_7157.method14039(-1111257112)) {
		    aClass689_7157.method14068(-1, (byte) -7);
		    aBool7162 = false;
		    method8814(false, -1, 0, 0, (byte) -88);
		}
	    }
	} else
	    method8814(false, -1, 0, 0, (byte) -109);
	anInt7159 = client.anInt11083 * -98994841;
    }
    
    Class602 method8824() {
	return (Class602) aClass40_Sub11_7153.method76(-434636307 * anInt7150,
						       -366823366);
    }
    
    void method8825(Class604 class604) {
	aClass604_7168 = class604;
	aClass179_7156 = null;
    }
    
    void method8826(Class182 class182, Class179 class179, Class444 class444,
		    int i, int i_24_, int i_25_, int i_26_, boolean bool) {
	Class184[] class184s = class179.method2979();
	Class154[] class154s = class179.method2980();
	if ((null == aClass633_7152 || aClass633_7152.aBool8234)
	    && (class184s != null || class154s != null)) {
	    Class602 class602
		= ((Class602)
		   aClass40_Sub11_7153.method76(anInt7150 * -434636307,
						1943359578));
	    if (class602.anIntArray7923 != null)
		class602 = (class602.method9909
			    (aClass111_7170,
			     (4 == 1874190559 * client.anInt11145
			      ? (Interface18) Class201.anInterface18_2214
			      : aClass111_7170),
			     -1445683648));
	    if (null != class602)
		aClass633_7152 = Class633.method10348(client.anInt11083, true);
	}
	if (aClass633_7152 != null) {
	    class179.method2978(class444);
	    if (bool)
		aClass633_7152.method10336(class182, (long) client.anInt11083,
					   class184s, class154s, false);
	    else
		aClass633_7152.method10335((long) client.anInt11083);
	    aClass633_7152.method10341(aByte7155, i, i_24_, i_25_, i_26_);
	}
    }
    
    void method8827(Class182 class182, Class179 class179, Class444 class444,
		    int i, int i_27_, int i_28_, int i_29_, boolean bool) {
	Class184[] class184s = class179.method2979();
	Class154[] class154s = class179.method2980();
	if ((null == aClass633_7152 || aClass633_7152.aBool8234)
	    && (class184s != null || class154s != null)) {
	    Class602 class602
		= ((Class602)
		   aClass40_Sub11_7153.method76(anInt7150 * -434636307,
						1021864769));
	    if (class602.anIntArray7923 != null)
		class602 = (class602.method9909
			    (aClass111_7170,
			     (4 == 1874190559 * client.anInt11145
			      ? (Interface18) Class201.anInterface18_2214
			      : aClass111_7170),
			     -1445276677));
	    if (null != class602)
		aClass633_7152 = Class633.method10348(client.anInt11083, true);
	}
	if (aClass633_7152 != null) {
	    class179.method2978(class444);
	    if (bool)
		aClass633_7152.method10336(class182, (long) client.anInt11083,
					   class184s, class154s, false);
	    else
		aClass633_7152.method10335((long) client.anInt11083);
	    aClass633_7152.method10341(aByte7155, i, i_27_, i_28_, i_29_);
	}
    }
    
    void method8828(Class182 class182) {
	method8808(class182, 262144, true, true, 429962075);
    }
    
    void method8829(Class182 class182, Class179 class179, Class444 class444,
		    int i, int i_30_, int i_31_, int i_32_, boolean bool,
		    byte i_33_) {
	Class184[] class184s = class179.method2979();
	Class154[] class154s = class179.method2980();
	if ((null == aClass633_7152 || aClass633_7152.aBool8234)
	    && (class184s != null || class154s != null)) {
	    Class602 class602
		= ((Class602)
		   aClass40_Sub11_7153.method76(anInt7150 * -434636307,
						-908482784));
	    if (class602.anIntArray7923 != null)
		class602 = (class602.method9909
			    (aClass111_7170,
			     (4 == 1874190559 * client.anInt11145
			      ? (Interface18) Class201.anInterface18_2214
			      : aClass111_7170),
			     -1981589611));
	    if (null != class602)
		aClass633_7152 = Class633.method10348(client.anInt11083, true);
	}
	if (aClass633_7152 != null) {
	    class179.method2978(class444);
	    if (bool)
		aClass633_7152.method10336(class182, (long) client.anInt11083,
					   class184s, class154s, false);
	    else
		aClass633_7152.method10335((long) client.anInt11083);
	    aClass633_7152.method10341(aByte7155, i, i_30_, i_31_, i_32_);
	}
    }
    
    void method8830(Class182 class182) {
	if (null != aClass525_Sub16_Sub17_7164) {
	    Class446 class446
		= aClass656_Sub1_7151.method10818().aClass446_4807;
	    client.aClass507_11137.method8358((byte) 104).method9039
		(aClass525_Sub16_Sub17_7164, aByte7155,
		 (int) class446.aFloat4895, (int) class446.aFloat4897,
		 aBoolArray7166, 1504045140);
	    aBoolArray7166 = null;
	    aClass525_Sub16_Sub17_7164 = null;
	}
    }
    
    void method8831(Class656_Sub1 class656_sub1, int i) {
	if (aClass689_7149 != null && aClass689_7149.method14021(-887593047)) {
	    aClass689_7149.method14041((client.anInt11083
					- anInt7159 * 1057216087),
				       1921700265);
	    if (aClass689_7149.method14039(-249416980))
		aClass689_7149.method14068(-1, (byte) -41);
	    if (!aClass689_7149.method14030(-1920257893)) {
		aClass689_7157 = aClass689_7149;
		aBool7162 = true;
		anInt7159 = -98994841 * client.anInt11083;
		return;
	    }
	}
	if (aClass689_7157.method14021(635924002)) {
	    if (aClass689_7157.method14041((client.anInt11083
					    - 1057216087 * anInt7159),
					   1993967125)) {
		if (Class198_Sub13.aClass525_Sub30_9973
			.aClass696_Sub15_10715.method17108(900535813)
		    == 2)
		    aBool7165 = false;
		if (aClass689_7157.method14039(-1133277974)) {
		    aClass689_7157.method14068(-1, (byte) -76);
		    aBool7162 = false;
		    method8814(false, -1, 0, 0, (byte) -36);
		}
	    }
	} else
	    method8814(false, -1, 0, 0, (byte) -19);
	anInt7159 = client.anInt11083 * -98994841;
    }
    
    void method8832(Class182 class182) {
	if (null != aClass525_Sub16_Sub17_7164) {
	    Class446 class446
		= aClass656_Sub1_7151.method10818().aClass446_4807;
	    client.aClass507_11137.method8358((byte) 58).method9039
		(aClass525_Sub16_Sub17_7164, aByte7155,
		 (int) class446.aFloat4895, (int) class446.aFloat4897,
		 aBoolArray7166, 878103772);
	    aBoolArray7166 = null;
	    aClass525_Sub16_Sub17_7164 = null;
	}
    }
    
    Class602 method8833(byte i) {
	return (Class602) aClass40_Sub11_7153.method76(-434636307 * anInt7150,
						       796395478);
    }
    
    void method8834(Class182 class182) {
	if (null != aClass525_Sub16_Sub17_7164) {
	    Class446 class446
		= aClass656_Sub1_7151.method10818().aClass446_4807;
	    client.aClass507_11137.method8358((byte) 100).method9039
		(aClass525_Sub16_Sub17_7164, aByte7155,
		 (int) class446.aFloat4895, (int) class446.aFloat4897,
		 aBoolArray7166, 1159313245);
	    aBoolArray7166 = null;
	    aClass525_Sub16_Sub17_7164 = null;
	}
    }
    
    void method8835(boolean bool, int i, int i_34_, int i_35_) {
	int i_36_ = i;
	boolean bool_37_ = false;
	if (-1 == i_36_) {
	    Class602 class602
		= ((Class602)
		   aClass40_Sub11_7153.method76(-434636307 * anInt7150,
						-1602119221));
	    Class602 class602_38_ = class602;
	    if (null != class602.anIntArray7923)
		class602 = (class602.method9909
			    (aClass111_7170,
			     (4 == client.anInt11145 * 1874190559
			      ? (Interface18) Class201.anInterface18_2214
			      : aClass111_7170),
			     -1959734924));
	    if (class602 == null)
		return;
	    if (class602_38_ == class602)
		class602_38_ = null;
	    if (class602.method9956(-1569866937)) {
		if (!class602.aBool7897 || Class198_Sub13
					       .aClass525_Sub30_9973
					       .aClass696_Sub36_10699
					       .method17294(1174494806) == 1) {
		    if (bool && aClass689_7157.method14021(-983067434)
			&& class602.method9917(aClass689_7157
						   .method14048(-1453018396),
					       -2068388813))
			return;
		    if (class602.anInt7894 * 1156889815
			!= 498457825 * anInt7160)
			bool_37_ = class602.aBool7909;
		    i_36_ = class602.method9915(1046444406);
		    if (class602.method9914(1534830819))
			i_34_ = 0;
		    else
			i_34_ = 1;
		}
	    } else if (null != class602_38_
		       && class602_38_.method9956(-1015303114)
		       && (!class602_38_.aBool7897
			   || Class198_Sub13.aClass525_Sub30_9973
				  .aClass696_Sub36_10699
				  .method17294(484846412) == 1)) {
		if (bool && aClass689_7157.method14021(-901868649)
		    && class602_38_.method9917(aClass689_7157
						   .method14048(-144184907),
					       -2077013746))
		    return;
		if (498457825 * anInt7160 != class602.anInt7894 * 1156889815)
		    bool_37_ = class602_38_.aBool7909;
		i_36_ = class602_38_.method9915(1046444406);
		if (class602_38_.method9914(1761744162))
		    i_34_ = 0;
		else
		    i_34_ = 1;
	    }
	}
	if (-1 == i_36_)
	    aClass689_7157.method14026(-1, false, 16711680);
	else {
	    aClass689_7157.method14082(i_36_, i_35_, i_34_, bool_37_,
				       -2144581508);
	    anInt7159 = client.anInt11083 * -98994841;
	    aBool7165 = false;
	    aClass179_7156 = null;
	}
    }
    
    void method8836(boolean bool, int i, int i_39_, int i_40_) {
	int i_41_ = i;
	boolean bool_42_ = false;
	if (-1 == i_41_) {
	    Class602 class602
		= ((Class602)
		   aClass40_Sub11_7153.method76(-434636307 * anInt7150,
						466670430));
	    Class602 class602_43_ = class602;
	    if (null != class602.anIntArray7923)
		class602 = (class602.method9909
			    (aClass111_7170,
			     (4 == client.anInt11145 * 1874190559
			      ? (Interface18) Class201.anInterface18_2214
			      : aClass111_7170),
			     -1643074426));
	    if (class602 == null)
		return;
	    if (class602_43_ == class602)
		class602_43_ = null;
	    if (class602.method9956(-2002959890)) {
		if (!class602.aBool7897 || Class198_Sub13
					       .aClass525_Sub30_9973
					       .aClass696_Sub36_10699
					       .method17294(2001695032) == 1) {
		    if (bool && aClass689_7157.method14021(-1747462809)
			&& class602.method9917(aClass689_7157
						   .method14048(396866088),
					       -2119231665))
			return;
		    if (class602.anInt7894 * 1156889815
			!= 498457825 * anInt7160)
			bool_42_ = class602.aBool7909;
		    i_41_ = class602.method9915(1046444406);
		    if (class602.method9914(-1974739223))
			i_39_ = 0;
		    else
			i_39_ = 1;
		}
	    } else if (null != class602_43_
		       && class602_43_.method9956(-1189735573)
		       && (!class602_43_.aBool7897
			   || Class198_Sub13.aClass525_Sub30_9973
				  .aClass696_Sub36_10699
				  .method17294(-33983489) == 1)) {
		if (bool && aClass689_7157.method14021(1157109850)
		    && class602_43_.method9917(aClass689_7157
						   .method14048(651304151),
					       -2058905060))
		    return;
		if (498457825 * anInt7160 != class602.anInt7894 * 1156889815)
		    bool_42_ = class602_43_.aBool7909;
		i_41_ = class602_43_.method9915(1046444406);
		if (class602_43_.method9914(1243551039))
		    i_39_ = 0;
		else
		    i_39_ = 1;
	    }
	}
	if (-1 == i_41_)
	    aClass689_7157.method14026(-1, false, 16711680);
	else {
	    aClass689_7157.method14082(i_41_, i_40_, i_39_, bool_42_,
				       2062170250);
	    anInt7159 = client.anInt11083 * -98994841;
	    aBool7165 = false;
	    aClass179_7156 = null;
	}
    }
    
    void method8837(boolean bool, int i, int i_44_, int i_45_) {
	int i_46_ = i;
	boolean bool_47_ = false;
	if (-1 == i_46_) {
	    Class602 class602
		= ((Class602)
		   aClass40_Sub11_7153.method76(-434636307 * anInt7150,
						589586673));
	    Class602 class602_48_ = class602;
	    if (null != class602.anIntArray7923)
		class602 = (class602.method9909
			    (aClass111_7170,
			     (4 == client.anInt11145 * 1874190559
			      ? (Interface18) Class201.anInterface18_2214
			      : aClass111_7170),
			     -1970592729));
	    if (class602 == null)
		return;
	    if (class602_48_ == class602)
		class602_48_ = null;
	    if (class602.method9956(-1595509423)) {
		if (!class602.aBool7897 || Class198_Sub13
					       .aClass525_Sub30_9973
					       .aClass696_Sub36_10699
					       .method17294(973075280) == 1) {
		    if (bool && aClass689_7157.method14021(605407112)
			&& class602.method9917(aClass689_7157
						   .method14048(-487567968),
					       -2119313977))
			return;
		    if (class602.anInt7894 * 1156889815
			!= 498457825 * anInt7160)
			bool_47_ = class602.aBool7909;
		    i_46_ = class602.method9915(1046444406);
		    if (class602.method9914(-1916215389))
			i_44_ = 0;
		    else
			i_44_ = 1;
		}
	    } else if (null != class602_48_
		       && class602_48_.method9956(-1697150987)
		       && (!class602_48_.aBool7897
			   || Class198_Sub13.aClass525_Sub30_9973
				  .aClass696_Sub36_10699
				  .method17294(723119504) == 1)) {
		if (bool && aClass689_7157.method14021(1701803962)
		    && class602_48_.method9917(aClass689_7157
						   .method14048(-1078541339),
					       -2063233098))
		    return;
		if (498457825 * anInt7160 != class602.anInt7894 * 1156889815)
		    bool_47_ = class602_48_.aBool7909;
		i_46_ = class602_48_.method9915(1046444406);
		if (class602_48_.method9914(1750213131))
		    i_44_ = 0;
		else
		    i_44_ = 1;
	    }
	}
	if (-1 == i_46_)
	    aClass689_7157.method14026(-1, false, 16711680);
	else {
	    aClass689_7157.method14082(i_46_, i_45_, i_44_, bool_47_,
				       -1645851791);
	    anInt7159 = client.anInt11083 * -98994841;
	    aBool7165 = false;
	    aClass179_7156 = null;
	}
    }
    
    static final void method8838(Class656_Sub1 class656_sub1, int i,
				 boolean bool, boolean bool_49_, int i_50_) {
	int i_51_;
	int i_52_;
	if (class656_sub1 instanceof Class656_Sub1_Sub3
	    && class656_sub1 instanceof Interface62) {
	    Class656_Sub1_Sub3 class656_sub1_sub3
		= (Class656_Sub1_Sub3) class656_sub1;
	    int i_53_ = (1 + (class656_sub1_sub3.aShort11924
			      - class656_sub1_sub3.aShort11923)
			 << 9);
	    int i_54_ = (1 + (class656_sub1_sub3.aShort11930
			      - class656_sub1_sub3.aShort11925)
			 << 9);
	    i_51_ = i_53_ / 2 + (class656_sub1_sub3.aShort11923 << 9);
	    i_52_ = i_54_ / 2 + (class656_sub1_sub3.aShort11925 << 9);
	} else {
	    Class446 class446 = class656_sub1.method10818().aClass446_4807;
	    i_51_ = (int) class446.aFloat4895;
	    i_52_ = (int) class446.aFloat4897;
	}
	Class585.method9663(class656_sub1.aByte10867, i_51_, i_52_, 0, i, bool,
			    bool_49_, 1798517427);
    }
    
    static final void method8839(Class683 class683, int i) {
	int i_55_
	    = ((client.anIntArrayArrayArray11188
		[(class683.anIntArray8661
		  [(class683.anInt8662 -= 1552651121) * 501271953])]).length
	       >> 1);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = i_55_;
    }
}
