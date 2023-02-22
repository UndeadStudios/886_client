/* Class213 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.net.MalformedURLException;
import java.net.URL;

class Class213 implements Interface43
{
    Class217 this$0;
    
    public float method323(int i) {
	return ((float) Class198_Sub13.aClass525_Sub30_9973
			    .aClass696_Sub45_10729.method17416(1912742736)
		/ 255.0F);
    }
    
    Class213(Class217 class217) {
	this$0 = class217;
    }
    
    public float method324() {
	return ((float) Class198_Sub13.aClass525_Sub30_9973
			    .aClass696_Sub45_10729.method17416(942877875)
		/ 255.0F);
    }
    
    public static void method3937(int i) {
	Class644.aClass199_8336.method3772(-1661342341);
    }
    
    static final void method3938(Class683 class683, int i) {
	class683.anInt8662 -= -1189665054;
	int i_0_ = class683.anIntArray8661[class683.anInt8662 * 501271953];
	int i_1_ = class683.anIntArray8661[1 + class683.anInt8662 * 501271953];
	ItemDefinitions class8
	    = ((ItemDefinitions)
	       Class313_Sub2.aClass40_Sub22_10106.method76(i_0_, -1790877643));
	if (i_1_ >= 1 && i_1_ <= 5 && class8.aStringArray84[i_1_ - 1] != null)
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= class8.aStringArray84[i_1_ - 1];
	else
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= "";
    }
    
    static final void method3939(Class683 class683, int i) {
	int i_2_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_2_, -695254952);
	Class302.method5408(class259, class683, 807271430);
    }
    
    static final void method3940(int i) {
	Class649.method10708(client.aClass259_11271, (byte) 0);
	Class55.anInt567 += 1146992735;
	if (!client.aBool11281 || !client.aBool11324) {
	    if (Class55.anInt567 * 1952097183 > 1) {
		client.aClass259_11271 = null;
		client.aClass259_11272 = null;
	    }
	} else {
	    int i_3_ = Class509.aClass569_5662.method9498(1652441842);
	    int i_4_ = Class509.aClass569_5662.method9499(501271953);
	    i_3_ -= client.anInt11198 * -216770093;
	    i_4_ -= client.anInt11057 * 1056729841;
	    if (i_3_ < -1077069491 * client.anInt11277)
		i_3_ = client.anInt11277 * -1077069491;
	    if (-1694810043 * client.aClass259_11271.anInt2602 + i_3_
		> (client.anInt11277 * -1077069491
		   + 215080695 * client.anInt11279))
		i_3_ = (client.anInt11279 * 215080695
			+ -1077069491 * client.anInt11277
			- client.aClass259_11271.anInt2602 * -1694810043);
	    if (i_4_ < 955332869 * client.anInt11068)
		i_4_ = client.anInt11068 * 955332869;
	    if (i_4_ + client.aClass259_11271.anInt2598 * 2054207119
		> (client.anInt11329 * -90696845
		   + client.anInt11068 * 955332869))
		i_4_ = (-90696845 * client.anInt11329
			+ client.anInt11068 * 955332869
			- client.aClass259_11271.anInt2598 * 2054207119);
	    int i_5_;
	    int i_6_;
	    if (client.aClass259_11272 == Class25.aClass259_245) {
		i_5_ = i_3_;
		i_6_ = i_4_;
	    } else {
		i_5_ = (1693654607 * client.aClass259_11272.anInt2612
			+ (i_3_ - -1077069491 * client.anInt11277));
		i_6_ = (client.aClass259_11272.anInt2613 * 1059112359
			+ (i_4_ - client.anInt11068 * 955332869));
	    }
	    if (!Class509.aClass569_5662.method9497(1068990098)) {
		if (client.aBool11284) {
		    Class382.method6429(1771493886);
		    if (client.aClass259_11271.anObjectArray2708 != null) {
			Class525_Sub32 class525_sub32 = new Class525_Sub32();
			class525_sub32.aClass259_10736
			    = client.aClass259_11271;
			class525_sub32.anInt10737 = i_5_ * 808999679;
			class525_sub32.anInt10738 = -1292642187 * i_6_;
			Class259 class259
			    = client.method17532(client.aClass259_11271);
			Class259 class259_7_ = client.aClass259_11275;
			boolean bool = false;
			for (/**/;
			     (class259_7_ != null
			      && -1 != class259_7_.anInt2606 * -1549235523
			      && null != class259);
			     class259_7_
				 = (Class162.aClass245Array1764
				    [1984678839 * class259_7_.anInt2588 >> 16]
				    .aClass259Array2426
				    [(class259_7_.anInt2606 * -1549235523
				      & 0xffff)])) {
			    if (class259.anInt2588 * 1984678839
				== class259_7_.anInt2588 * 1984678839) {
				bool = true;
				break;
			    }
			}
			if (null != class259_7_ && null != class259
			    && class259 != Class25.aClass259_245 && !bool)
			    class525_sub32.aClass259_10735
				= Class25.aClass259_245;
			else
			    class525_sub32.aClass259_10735
				= client.aClass259_11275;
			class525_sub32.anObjectArray10740
			    = client.aClass259_11271.anObjectArray2708;
			Class241.method4435(class525_sub32, 601895127);
		    }
		    if (client.aClass259_11275 != null
			&& client.method17532(client.aClass259_11271) != null)
			Class88.method1664(client.aClass259_11271,
					   client.aClass259_11275, 1599600998);
		} else if ((client.anInt11250 * -189083155 == 1
			    || Class50.method1132(1163138504))
			   && Class61.anInt658 * -628070459 > 2)
		    Class660.method10928((client.anInt11198 * -216770093
					  + 1772650083 * client.anInt11282),
					 (1056729841 * client.anInt11057
					  + client.anInt11283 * -1610308107),
					 -412512389);
		else if (Class95.method1740(-379729))
		    Class660.method10928((client.anInt11282 * 1772650083
					  + -216770093 * client.anInt11198),
					 (client.anInt11057 * 1056729841
					  + -1610308107 * client.anInt11283),
					 -412512389);
		client.aClass259_11271 = null;
		client.aClass259_11272 = null;
	    } else {
		if (Class55.anInt567 * 1952097183
		    > 452159247 * client.aClass259_11271.anInt2573) {
		    int i_8_ = i_3_ - client.anInt11282 * 1772650083;
		    int i_9_ = i_4_ - -1610308107 * client.anInt11283;
		    if (i_8_ > client.aClass259_11271.anInt2768 * -1830384115
			|| i_8_ < -(-1830384115
				    * client.aClass259_11271.anInt2768)
			|| (i_9_
			    > -1830384115 * client.aClass259_11271.anInt2768)
			|| i_9_ < -(client.aClass259_11271.anInt2768
				    * -1830384115))
			client.aBool11284 = true;
		}
		if (null != client.aClass259_11271.anObjectArray2738
		    && client.aBool11284) {
		    Class525_Sub32 class525_sub32 = new Class525_Sub32();
		    class525_sub32.aClass259_10736 = client.aClass259_11271;
		    class525_sub32.anInt10737 = 808999679 * i_5_;
		    class525_sub32.anInt10738 = -1292642187 * i_6_;
		    class525_sub32.anObjectArray10740
			= client.aClass259_11271.anObjectArray2738;
		    Class241.method4435(class525_sub32, 1452502481);
		}
	    }
	}
    }
    
    static boolean method3941(String string, byte i) {
	if (string == null)
	    return false;
	try {
	    new URL(string);
	} catch (MalformedURLException malformedurlexception) {
	    return false;
	}
	return true;
    }
    
    public static int method3942(Class525_Sub16_Sub16 class525_sub16_sub16,
				 byte i) {
	if (Class61.aBool670)
	    return 6;
	if (class525_sub16_sub16 == null)
	    return 0;
	int i_10_ = class525_sub16_sub16.anInt11861 * 91103913;
	if (Class390_Sub3.method15878(i_10_, (byte) 39))
	    return 1;
	if (Class264.method4790(i_10_, -1588079578))
	    return 2;
	if (Class36.method977(i_10_, 1935638624))
	    return 3;
	if (Class468.method7708(i_10_, (byte) 99))
	    return 4;
	if (Class113.method2010(i_10_, (byte) -77))
	    return 7;
	if (i_10_ == 16)
	    return 8;
	return 5;
    }
}
