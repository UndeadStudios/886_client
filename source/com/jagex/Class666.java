/* Class666 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Locale;

public class Class666 implements Interface76
{
    public static Class666 aClass666_8559;
    public static Class666 aClass666_8560;
    public static Class666 aClass666_8561;
    public static Class666 aClass666_8562
	= new Class666("EN", "en", "English", Class685.aClass685_8686, 0,
		       "GB");
    static Class666 aClass666_8563;
    public static Class666 aClass666_8564;
    Locale aLocale8565;
    String aString8566;
    public static final int anInt8567 = 7;
    public static Class666 aClass666_8568;
    public int anInt8569;
    String aString8570;
    static Class666[] aClass666Array8571;
    public static int anInt8572;
    
    static final long method11002(byte i) {
	return (((long) ((Class686.anInt8694 += -106085795) * -821059083 - 1)
		 << 32)
		| 0xffffffffL);
    }
    
    public static Class666[] method11003() {
	return new Class666[] { aClass666_8562, aClass666_8568, aClass666_8563,
				aClass666_8564, aClass666_8560, aClass666_8561,
				aClass666_8559 };
    }
    
    public int method57() {
	return anInt8569 * 1553960475;
    }
    
    public int method80() {
	return anInt8569 * 1553960475;
    }
    
    public Locale method11004(int i) {
	return aLocale8565;
    }
    
    public static Class666 method11005(int i, int i_0_) {
	if (i < 0 || i >= aClass666Array8571.length)
	    return null;
	return aClass666Array8571[i];
    }
    
    public String toString() {
	return method11013(65280).toLowerCase(Locale.ENGLISH);
    }
    
    static {
	aClass666_8560 = new Class666("DE", "de", "German",
				      Class685.aClass685_8686, 1, "DE");
	aClass666_8561 = new Class666("FR", "fr", "French",
				      Class685.aClass685_8686, 2, "FR");
	aClass666_8559 = new Class666("PT", "pt", "Portuguese",
				      Class685.aClass685_8686, 3, "BR");
	aClass666_8563 = new Class666("NL", "nl", "Dutch",
				      Class685.aClass685_8677, 4, "NL");
	aClass666_8564 = new Class666("ES", "es", "Spanish",
				      Class685.aClass685_8677, 5, "ES");
	aClass666_8568
	    = new Class666("ES_MX", "es-mx", "Spanish (Latin American)",
			   Class685.aClass685_8686, 6, "MX");
	Class666[] class666s = method11022((short) -24616);
	aClass666Array8571 = new Class666[class666s.length];
	Class666[] class666s_1_ = class666s;
	for (int i = 0; i < class666s_1_.length; i++) {
	    Class666 class666 = class666s_1_[i];
	    if (null != aClass666Array8571[class666.anInt8569 * 1553960475])
		throw new IllegalStateException();
	    aClass666Array8571[class666.anInt8569 * 1553960475] = class666;
	}
    }
    
    static final void method11006(Class683 class683, byte i) {
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub5_10685,
	     (class683.anIntArray8661
	      [(class683.anInt8662 -= 1552651121) * 501271953]) == 1 ? 1 : 0,
	     (byte) -115);
	Class650.method10715(-1758466106);
	client.aBool11084 = false;
    }
    
    public int method75() {
	return anInt8569 * 1553960475;
    }
    
    public String method11007() {
	return method11013(65280).toLowerCase(Locale.ENGLISH);
    }
    
    public String method11008() {
	return method11013(65280).toLowerCase(Locale.ENGLISH);
    }
    
    Class666(String string, String string_2_, String string_3_,
	     Class685 class685, int i, String string_4_) {
	aString8566 = string;
	aString8570 = string_2_;
	anInt8569 = i * -911172589;
	if (null != string_4_)
	    aLocale8565 = new Locale(string_2_.substring(0, 2), string_4_);
	else
	    aLocale8565 = new Locale(string_2_.substring(0, 2));
    }
    
    public static Class666[] method11009() {
	return new Class666[] { aClass666_8562, aClass666_8568, aClass666_8563,
				aClass666_8564, aClass666_8560, aClass666_8561,
				aClass666_8559 };
    }
    
    public static Class666[] method11010() {
	return new Class666[] { aClass666_8562, aClass666_8568, aClass666_8563,
				aClass666_8564, aClass666_8560, aClass666_8561,
				aClass666_8559 };
    }
    
    public static Class666[] method11011() {
	return new Class666[] { aClass666_8562, aClass666_8568, aClass666_8563,
				aClass666_8564, aClass666_8560, aClass666_8561,
				aClass666_8559 };
    }
    
    public String method11012() {
	return method11013(65280).toLowerCase(Locale.ENGLISH);
    }
    
    String method11013(int i) {
	return aString8570;
    }
    
    String method11014() {
	return aString8570;
    }
    
    public Locale method11015() {
	return aLocale8565;
    }
    
    public static void method11016(String string, boolean bool,
				   Class182 class182, Class175 class175,
				   Class7 class7, int i) {
	boolean bool_5_
	    = !Class659.aBool8458 || Class200.method3828(-1448412734);
	if (bool_5_) {
	    if (Class659.aBool8458 && bool_5_) {
		class7 = Class525_Sub16_Sub3.aClass7_11414;
		class175
		    = class182.method3223(class7,
					  Class112.aClass173_Sub2Array1384,
					  true);
		int i_6_ = class7.method566(string, 250, null, 805534933);
		int i_7_ = class7.method594(string, 250,
					    1938404803 * class7.anInt46, null,
					    -2140140289);
		int i_8_ = EmitterConfig.aClass173_11726.method2772();
		int i_9_ = i_8_ + 4;
		i_6_ += 2 * i_9_;
		i_7_ += i_9_ * 2;
		if (i_6_ < Class112.anInt1380 * -274209143)
		    i_6_ = Class112.anInt1380 * -274209143;
		if (i_7_ < -517021759 * Class27.anInt281)
		    i_7_ = Class27.anInt281 * -517021759;
		int i_10_
		    = (Class112.aClass395_1381.method6521(i_6_,
							  (client.anInt11223
							   * -1202561691),
							  (byte) -123)
		       + -394385325 * Class112.anInt1382);
		int i_11_
		    = (Class112.aClass396_1378.method6529(i_7_,
							  (-1167554197
							   * (client
							      .anInt11224)),
							  (byte) 100)
		       + Class381.anInt3926 * 2058718641);
		class182.method3216(Class496.aClass173_5542, false).method2485
		    (i_10_ + Class112.aClass173_1383.method2772(),
		     i_11_ + Class112.aClass173_1383.method2765(),
		     i_6_ - Class112.aClass173_1383.method2772() * 2,
		     i_7_ - Class112.aClass173_1383.method2765() * 2, 1, -1,
		     0);
		class182.method3216(Class112.aClass173_1383, true)
		    .method2518(i_10_, i_11_);
		Class112.aClass173_1383.method2773();
		class182.method3216(Class112.aClass173_1383, true)
		    .method2518(i_6_ + i_10_ - i_8_, i_11_);
		Class112.aClass173_1383.method2776();
		class182.method3216(Class112.aClass173_1383, true)
		    .method2518(i_10_ + i_6_ - i_8_, i_7_ + i_11_ - i_8_);
		Class112.aClass173_1383.method2773();
		class182.method3216(Class112.aClass173_1383, true)
		    .method2518(i_10_, i_11_ + i_7_ - i_8_);
		Class112.aClass173_1383.method2776();
		class182.method3216
		    (EmitterConfig.aClass173_11726, true).method2478
		    (i_10_, i_11_ + Class112.aClass173_1383.method2765(), i_8_,
		     i_7_ - Class112.aClass173_1383.method2765() * 2);
		EmitterConfig.aClass173_11726.method2777();
		class182.method3216
		    (EmitterConfig.aClass173_11726, true).method2478
		    (i_10_ + Class112.aClass173_1383.method2772(), i_11_,
		     i_6_ - Class112.aClass173_1383.method2772() * 2, i_8_);
		EmitterConfig.aClass173_11726.method2777();
		class182.method3216
		    (EmitterConfig.aClass173_11726, true).method2478
		    (i_6_ + i_10_ - i_8_,
		     i_11_ + Class112.aClass173_1383.method2765(), i_8_,
		     i_7_ - Class112.aClass173_1383.method2765() * 2);
		EmitterConfig.aClass173_11726.method2777();
		class182.method3216
		    (EmitterConfig.aClass173_11726, true).method2478
		    (i_10_ + Class112.aClass173_1383.method2772(),
		     i_11_ + i_7_ - i_8_,
		     i_6_ - Class112.aClass173_1383.method2772() * 2, i_8_);
		EmitterConfig.aClass173_11726.method2777();
		class175.method2839(string, i_10_ + i_9_, i_9_ + i_11_,
				    i_6_ - 2 * i_9_, i_7_ - 2 * i_9_,
				    (Class630.anInt8164 * -1509707719
				     | ~0xffffff),
				    -1, 1, 1, 0, null, null, null, 0, 0,
				    -1544407342);
		Class198_Sub19_Sub1.method18196(i_10_, i_11_, i_6_, i_7_,
						870295436);
	    } else {
		int i_12_ = class7.method566(string, 250, null, 805534933);
		int i_13_
		    = class7.method596(string, 250, null, 1555849540) * 13;
		int i_14_ = 4;
		int i_15_ = i_14_ + 6;
		int i_16_ = i_14_ + 6;
		class182.method3151(i_15_ - i_14_, i_16_ - i_14_,
				    i_14_ + i_12_ + i_14_,
				    i_14_ + i_13_ + i_14_, -16777216, 0);
		class182.method3195(i_15_ - i_14_, i_16_ - i_14_,
				    i_14_ + (i_14_ + i_12_),
				    i_14_ + i_13_ + i_14_, -1, 0);
		class175.method2839(string, i_15_, i_16_, i_12_, i_13_, -1, -1,
				    1, 1, 0, null, null, null, 0, 0,
				    -1268391332);
		Class198_Sub19_Sub1.method18196(i_15_ - i_14_, i_16_ - i_14_,
						i_14_ + i_12_ + i_14_,
						i_14_ + (i_14_ + i_13_),
						870295436);
	    }
	    if (bool) {
		try {
		    class182.method3218();
		    class182.method3357(65535);
		} catch (Exception_Sub4 exception_sub4) {
		    /* empty */
		}
	    }
	}
    }
    
    public Locale method11017() {
	return aLocale8565;
    }
    
    public static Class666 method11018(int i) {
	if (i < 0 || i >= aClass666Array8571.length)
	    return null;
	return aClass666Array8571[i];
    }
    
    public Locale method11019() {
	return aLocale8565;
    }
    
    public static Class666 method11020(int i) {
	if (i < 0 || i >= aClass666Array8571.length)
	    return null;
	return aClass666Array8571[i];
    }
    
    public static Class666[] method11021() {
	return new Class666[] { aClass666_8562, aClass666_8568, aClass666_8563,
				aClass666_8564, aClass666_8560, aClass666_8561,
				aClass666_8559 };
    }
    
    public static Class666[] method11022(short i) {
	return new Class666[] { aClass666_8562, aClass666_8568, aClass666_8563,
				aClass666_8564, aClass666_8560, aClass666_8561,
				aClass666_8559 };
    }
    
    public static Class666 method11023(int i) {
	if (i < 0 || i >= aClass666Array8571.length)
	    return null;
	return aClass666Array8571[i];
    }
    
    public static boolean method11024(String string, int i) {
	if (string == null)
	    return false;
	for (int i_17_ = 0; i_17_ < -883281325 * client.anInt11204; i_17_++) {
	    if (string.equalsIgnoreCase(client.aClass66Array11356[i_17_]
					.aString708))
		return true;
	}
	if (string.equalsIgnoreCase(Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
				    .aString12231))
	    return true;
	return false;
    }
    
    static final void method11025(Class683 class683, short i) {
	String string
	    = (String) (class683.anObjectArray8636
			[(class683.anInt8644 -= 1285561025) * 1373599041]);
	class683.anInt8662 -= 362986067;
	int i_18_ = class683.anIntArray8661[501271953 * class683.anInt8662];
	int i_19_
	    = class683.anIntArray8661[class683.anInt8662 * 501271953 + 1];
	int i_20_
	    = class683.anIntArray8661[class683.anInt8662 * 501271953 + 2];
	Class7 class7
	    = Class7.aClass404_53.method6580(client.anInterface50_11252, i_19_,
					     -89058118);
	String string_21_
	    = class7.method568(string, i_18_, Class229.aClass157Array2364,
			       i_20_, (byte) -71);
	class683.anObjectArray8636
	    [(class683.anInt8644 += 1285561025) * 1373599041 - 1]
	    = string_21_ != null ? string_21_ : "";
    }
}
