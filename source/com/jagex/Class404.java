/* Class404 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.HashMap;
import java.util.Map;

public class Class404 implements Interface4
{
    JS5 aClass458_4140;
    JS5 aClass458_4141;
    Class182 aClass182_4142;
    Class200 aClass200_4143;
    Class200 aClass200_4144 = new Class200(20);
    Class200 aClass200_4145;
    int[] anIntArray4146;
    Map aMap4147;
    public static Class525_Sub25 aClass525_Sub25_4148;
    static int anInt4149;
    
    public int method35(int i, int i_0_) {
	Class157[] class157s = method34(aClass182_4142, i, 1122007968);
	if (null != class157s)
	    return class157s[0].method12();
	return 0;
    }
    
    public void method6574() {
	aClass200_4143.method3809((byte) 121);
	aClass200_4144.method3809((byte) 99);
	if (null != aClass200_4145)
	    aClass200_4145.method3809((byte) 28);
    }
    
    public void method6575(int i) {
	aMap4147 = null;
    }
    
    Class7 method6576(Interface50 interface50, int i, boolean bool,
		      boolean bool_1_) {
	if (-1 == i)
	    return null;
	if (null != anIntArray4146) {
	    for (int i_2_ = 0; i_2_ < anIntArray4146.length; i_2_++) {
		if (i == anIntArray4146[i_2_])
		    return ((Class7)
			    (((Class20) aMap4147.get(Integer.valueOf(i_2_)))
			     .anObject208));
	    }
	}
	if (bool_1_)
	    aClass458_4140.method7506(i, -475411889);
	Class7 class7 = (Class7) aClass200_4143.method3785((long) i);
	if (class7 != null)
	    return class7;
	class7 = Class293.method5306(aClass458_4141, i, this, -145692916);
	if (null == class7)
	    return null;
	if (bool)
	    aClass200_4143.method3788(class7, (long) i);
	return class7;
    }
    
    public int method6577(boolean bool, int i) {
	if (null == anIntArray4146)
	    return 0;
	if (!bool && null != aMap4147)
	    return 2 * anIntArray4146.length;
	int i_3_ = 0;
	for (int i_4_ = 0; i_4_ < anIntArray4146.length; i_4_++) {
	    int i_5_ = anIntArray4146[i_4_];
	    if (aClass458_4140.method7506(i_5_, 934555393))
		i_3_++;
	    if (aClass458_4141.method7506(i_5_, 2128542460))
		i_3_++;
	}
	return i_3_;
    }
    
    public Object method6578(Interface50 interface50, int i, boolean bool,
			     boolean bool_6_, int i_7_) {
	if (i == -1)
	    return null;
	if (null != anIntArray4146) {
	    for (int i_8_ = 0; i_8_ < anIntArray4146.length; i_8_++) {
		if (anIntArray4146[i_8_] == i)
		    return (((Class20) aMap4147.get(Integer.valueOf(i_8_)))
			    .anObject207);
	    }
	}
	Object object
	    = aClass200_4144.method3785((long) (i << 1 | (bool_6_ ? 1 : 0)));
	if (null != object)
	    return object;
	byte[] is = aClass458_4140.getTextureData(i, 1652903302);
	if (null == is)
	    return null;
	Class7 class7 = method6579(interface50, i, bool, false, 2106170057);
	if (null == class7)
	    return null;
	object = interface50.method344(is, class7, bool_6_, (byte) 100);
	aClass200_4144.method3788(object, (long) (i << 1 | (bool_6_ ? 1 : 0)));
	return object;
    }
    
    Class7 method6579(Interface50 interface50, int i, boolean bool,
		      boolean bool_9_, int i_10_) {
	if (-1 == i)
	    return null;
	if (null != anIntArray4146) {
	    for (int i_11_ = 0; i_11_ < anIntArray4146.length; i_11_++) {
		if (i == anIntArray4146[i_11_])
		    return ((Class7)
			    (((Class20) aMap4147.get(Integer.valueOf(i_11_)))
			     .anObject208));
	    }
	}
	if (bool_9_)
	    aClass458_4140.method7506(i, -846555207);
	Class7 class7 = (Class7) aClass200_4143.method3785((long) i);
	if (class7 != null)
	    return class7;
	class7 = Class293.method5306(aClass458_4141, i, this, -1369808186);
	if (null == class7)
	    return null;
	if (bool)
	    aClass200_4143.method3788(class7, (long) i);
	return class7;
    }
    
    public Class7 method6580(Interface50 interface50, int i, int i_12_) {
	return method6579(interface50, i, true, true, 2089590869);
    }
    
    public void method6581(Interface50 interface50, byte i) {
	aMap4147 = new HashMap(anIntArray4146.length);
	for (int i_13_ = 0; i_13_ < anIntArray4146.length; i_13_++) {
	    int i_14_ = anIntArray4146[i_13_];
	    Class7 class7 = Class293.method5306(aClass458_4141, i_14_, this,
						-1856077243);
	    byte[] is = aClass458_4140.getTextureData(i_14_, 1356985944);
	    Object object = interface50.method344(is, class7, true, (byte) 96);
	    aMap4147.put(Integer.valueOf(i_13_), new Class20(object, class7));
	}
    }
    
    public void method6582(int i) {
	aClass200_4143.method3791((byte) 20);
	aClass200_4144.method3791((byte) 37);
	if (null != aClass200_4145)
	    aClass200_4145.method3791((byte) -35);
    }
    
    public void method6583(int i, byte i_15_) {
	aClass200_4143.method3805(i, 1964747148);
	aClass200_4144.method3805(i, 1879313673);
	if (null != aClass200_4145)
	    aClass200_4145.method3805(i, 1887946601);
    }
    
    public void method6584(byte i) {
	aClass200_4143.method3809((byte) 88);
	aClass200_4144.method3809((byte) 72);
	if (null != aClass200_4145)
	    aClass200_4145.method3809((byte) 74);
    }
    
    public Class157[] method34(Class182 class182, int i, int i_16_) {
	if (null == aClass200_4145)
	    return null;
	if (null != class182) {
	    if (aClass182_4142 != class182)
		aClass200_4145.method3791((byte) 29);
	    aClass182_4142 = class182;
	} else
	    class182 = aClass182_4142;
	if (class182 != null) {
	    Class157[] class157s
		= (Class157[]) aClass200_4145.method3785((long) i);
	    if (class157s == null) {
		Class173[] class173s
		    = Class187.method3674(aClass458_4140, i, 0);
		if (class173s != null && class173s.length > 0) {
		    class157s = new Class157[class173s.length];
		    for (int i_17_ = 0; i_17_ < class173s.length; i_17_++)
			class157s[i_17_]
			    = class182.method3216(class173s[i_17_], true);
		    aClass200_4145.method3788(class157s, (long) i);
		}
	    }
	    return class157s;
	}
	return null;
    }
    
    public int method6585() {
	if (null == anIntArray4146)
	    return 0;
	return anIntArray4146.length * 2;
    }
    
    public void method6586(Interface50 interface50) {
	aMap4147 = new HashMap(anIntArray4146.length);
	for (int i = 0; i < anIntArray4146.length; i++) {
	    int i_18_ = anIntArray4146[i];
	    Class7 class7
		= Class293.method5306(aClass458_4141, i_18_, this, -991930416);
	    byte[] is = aClass458_4140.getTextureData(i_18_, 1249398968);
	    Object object = interface50.method344(is, class7, true, (byte) 90);
	    aMap4147.put(Integer.valueOf(i), new Class20(object, class7));
	}
    }
    
    public void method6587() {
	aClass200_4143.method3809((byte) 12);
	aClass200_4144.method3809((byte) 12);
	if (null != aClass200_4145)
	    aClass200_4145.method3809((byte) 127);
    }
    
    public Class404(Class182 class182, JS5 class458,
                    JS5 class458_19_, int[] is) {
	aClass200_4143 = new Class200(20);
	aClass182_4142 = null;
	aMap4147 = null;
	aClass182_4142 = class182;
	aClass458_4140 = class458;
	aClass458_4141 = class458_19_;
	anIntArray4146 = is;
	aClass200_4145 = new Class200(20);
    }
    
    public int method6588() {
	return method6577(false, -1975649207);
    }
    
    public void method6589() {
	aMap4147 = null;
    }
    
    public int method6590() {
	if (null == anIntArray4146)
	    return 0;
	return anIntArray4146.length * 2;
    }
    
    public int method6591() {
	if (null == anIntArray4146)
	    return 0;
	return anIntArray4146.length * 2;
    }
    
    public Object method6592(Interface50 interface50, int i, boolean bool,
			     boolean bool_20_) {
	if (i == -1)
	    return null;
	if (null != anIntArray4146) {
	    for (int i_21_ = 0; i_21_ < anIntArray4146.length; i_21_++) {
		if (anIntArray4146[i_21_] == i)
		    return (((Class20) aMap4147.get(Integer.valueOf(i_21_)))
			    .anObject207);
	    }
	}
	Object object
	    = aClass200_4144.method3785((long) (i << 1 | (bool_20_ ? 1 : 0)));
	if (null != object)
	    return object;
	byte[] is = aClass458_4140.getTextureData(i, 2116062708);
	if (null == is)
	    return null;
	Class7 class7 = method6579(interface50, i, bool, false, 2099678025);
	if (null == class7)
	    return null;
	object = interface50.method344(is, class7, bool_20_, (byte) 72);
	aClass200_4144.method3788(object,
				  (long) (i << 1 | (bool_20_ ? 1 : 0)));
	return object;
    }
    
    public Class7 method6593(Interface50 interface50, int i) {
	return method6579(interface50, i, true, true, 2142442045);
    }
    
    public void method6594() {
	aMap4147 = null;
    }
    
    public int method6595(int i) {
	if (null == anIntArray4146)
	    return 0;
	return anIntArray4146.length * 2;
    }
    
    public void method6596(int i) {
	aClass200_4143.method3805(i, 1997652514);
	aClass200_4144.method3805(i, 1869143353);
	if (null != aClass200_4145)
	    aClass200_4145.method3805(i, 2040734321);
    }
    
    public void method6597() {
	aClass200_4143.method3791((byte) -16);
	aClass200_4144.method3791((byte) -78);
	if (null != aClass200_4145)
	    aClass200_4145.method3791((byte) -34);
    }
    
    public void method6598() {
	aClass200_4143.method3791((byte) -8);
	aClass200_4144.method3791((byte) 90);
	if (null != aClass200_4145)
	    aClass200_4145.method3791((byte) 27);
    }
    
    Class7 method6599(Interface50 interface50, int i, boolean bool,
		      boolean bool_22_) {
	if (-1 == i)
	    return null;
	if (null != anIntArray4146) {
	    for (int i_23_ = 0; i_23_ < anIntArray4146.length; i_23_++) {
		if (i == anIntArray4146[i_23_])
		    return ((Class7)
			    (((Class20) aMap4147.get(Integer.valueOf(i_23_)))
			     .anObject208));
	    }
	}
	if (bool_22_)
	    aClass458_4140.method7506(i, 890216990);
	Class7 class7 = (Class7) aClass200_4143.method3785((long) i);
	if (class7 != null)
	    return class7;
	class7 = Class293.method5306(aClass458_4141, i, this, -1780912052);
	if (null == class7)
	    return null;
	if (bool)
	    aClass200_4143.method3788(class7, (long) i);
	return class7;
    }
    
    public void method6600(int i) {
	aClass200_4143.method3805(i, 1865472878);
	aClass200_4144.method3805(i, 2022265753);
	if (null != aClass200_4145)
	    aClass200_4145.method3805(i, 2062237651);
    }
    
    public void method6601() {
	aClass200_4143.method3809((byte) 60);
	aClass200_4144.method3809((byte) 44);
	if (null != aClass200_4145)
	    aClass200_4145.method3809((byte) 66);
    }
    
    public int method6602(int i) {
	return method6577(false, -1158077805);
    }
    
    Class7 method6603(Interface50 interface50, int i, boolean bool,
		      boolean bool_24_) {
	if (-1 == i)
	    return null;
	if (null != anIntArray4146) {
	    for (int i_25_ = 0; i_25_ < anIntArray4146.length; i_25_++) {
		if (i == anIntArray4146[i_25_])
		    return ((Class7)
			    (((Class20) aMap4147.get(Integer.valueOf(i_25_)))
			     .anObject208));
	    }
	}
	if (bool_24_)
	    aClass458_4140.method7506(i, -1668404883);
	Class7 class7 = (Class7) aClass200_4143.method3785((long) i);
	if (class7 != null)
	    return class7;
	class7 = Class293.method5306(aClass458_4141, i, this, -1378728356);
	if (null == class7)
	    return null;
	if (bool)
	    aClass200_4143.method3788(class7, (long) i);
	return class7;
    }
    
    public void method6604() {
	aClass200_4143.method3809((byte) 70);
	aClass200_4144.method3809((byte) 125);
	if (null != aClass200_4145)
	    aClass200_4145.method3809((byte) 36);
    }
    
    public Class157[] method37(Class182 class182, int i) {
	if (null == aClass200_4145)
	    return null;
	if (null != class182) {
	    if (aClass182_4142 != class182)
		aClass200_4145.method3791((byte) 69);
	    aClass182_4142 = class182;
	} else
	    class182 = aClass182_4142;
	if (class182 != null) {
	    Class157[] class157s
		= (Class157[]) aClass200_4145.method3785((long) i);
	    if (class157s == null) {
		Class173[] class173s
		    = Class187.method3674(aClass458_4140, i, 0);
		if (class173s != null && class173s.length > 0) {
		    class157s = new Class157[class173s.length];
		    for (int i_26_ = 0; i_26_ < class173s.length; i_26_++)
			class157s[i_26_]
			    = class182.method3216(class173s[i_26_], true);
		    aClass200_4145.method3788(class157s, (long) i);
		}
	    }
	    return class157s;
	}
	return null;
    }
    
    public Class157[] method36(Class182 class182, int i) {
	if (null == aClass200_4145)
	    return null;
	if (null != class182) {
	    if (aClass182_4142 != class182)
		aClass200_4145.method3791((byte) 5);
	    aClass182_4142 = class182;
	} else
	    class182 = aClass182_4142;
	if (class182 != null) {
	    Class157[] class157s
		= (Class157[]) aClass200_4145.method3785((long) i);
	    if (class157s == null) {
		Class173[] class173s
		    = Class187.method3674(aClass458_4140, i, 0);
		if (class173s != null && class173s.length > 0) {
		    class157s = new Class157[class173s.length];
		    for (int i_27_ = 0; i_27_ < class173s.length; i_27_++)
			class157s[i_27_]
			    = class182.method3216(class173s[i_27_], true);
		    aClass200_4145.method3788(class157s, (long) i);
		}
	    }
	    return class157s;
	}
	return null;
    }
    
    static final void method6605(Class683 class683, int i) {
	int i_28_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_28_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_28_ >> 16];
	Class183.method3600(class259, class245, true, 2, class683, 1305537711);
    }
    
    public static int method6606(RSBuffer class525_sub38, String string,
								 byte i) {
	int i_29_ = class525_sub38.index * -1133521593;
	byte[] is = Class225.method4255(string, -889208431);
	class525_sub38.method16829(is.length, 463468448);
	class525_sub38.index
	    += Class268.aClass279_2817.method5150(is, 0, is.length,
						  (class525_sub38
						   .buffer),
						  (class525_sub38.index
						   * -1133521593),
						  1930794952) * 339428471;
	return class525_sub38.index * -1133521593 - i_29_;
    }
    
    static final void method6607(Class683 class683, int i) {
	class683.anInt8662 -= 362986067;
	int i_30_ = class683.anIntArray8661[class683.anInt8662 * 501271953];
	int i_31_
	    = class683.anIntArray8661[class683.anInt8662 * 501271953 + 1];
	int i_32_
	    = class683.anIntArray8661[501271953 * class683.anInt8662 + 2];
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class242.method4446(i_30_, i_31_, i_32_, -1790013731);
    }
    
    static final void method6608(Class259[] class259s, int i, int i_33_) {
	for (int i_34_ = 0; i_34_ < class259s.length; i_34_++) {
	    Class259 class259 = class259s[i_34_];
	    if (class259 != null) {
		if (2010235789 * class259.anInt2590 == 0) {
		    if (null != class259.aClass259Array2755)
			method6608(class259.aClass259Array2755, i, 175724625);
		    Class525_Sub33 class525_sub33
			= ((Class525_Sub33)
			   (client.aClass10_11261.method684
			    ((long) (1984678839 * class259.anInt2588))));
		    if (class525_sub33 != null)
			Class180.method3121((class525_sub33.anInt10745
					     * 922288809),
					    i, (byte) 55);
		}
		if (i == 0 && null != class259.anObjectArray2561) {
		    Class525_Sub32 class525_sub32 = new Class525_Sub32();
		    class525_sub32.aClass259_10736 = class259;
		    class525_sub32.anObjectArray10740
			= class259.anObjectArray2561;
		    Class241.method4435(class525_sub32, 827118489);
		}
		if (1 == i && class259.anObjectArray2733 != null) {
		    if (class259.anInt2576 * 1534974651 >= 0) {
			Class259 class259_35_
			    = Class43.method1069((1984678839
						  * class259.anInt2588),
						 -695254952);
			if (null == class259_35_
			    || null == class259_35_.aClass259Array2655
			    || (class259.anInt2576 * 1534974651
				>= class259_35_.aClass259Array2655.length)
			    || class259 != (class259_35_.aClass259Array2655
					    [1534974651 * class259.anInt2576]))
			    continue;
		    }
		    Class525_Sub32 class525_sub32 = new Class525_Sub32();
		    class525_sub32.aClass259_10736 = class259;
		    class525_sub32.anObjectArray10740
			= class259.anObjectArray2733;
		    Class241.method4435(class525_sub32, 887368282);
		}
	    }
	}
    }
    
    public static Class305 method6609(int i, int i_36_) {
	Class305[] class305s = Class711.method14448((byte) 0);
	for (int i_37_ = 0; i_37_ < class305s.length; i_37_++) {
	    Class305 class305 = class305s[i_37_];
	    if (-1555827231 * class305.anInt3413 == i)
		return class305;
	}
	return null;
    }
}
