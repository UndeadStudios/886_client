/* Class511 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class511
{
    abstract long method8507();
    
    public static Class511 method8508() {
	Class511_Sub1 class511_sub1;
	try {
	    class511_sub1 = new Class511_Sub1();
	} catch (Throwable throwable) {
	    return new Class511_Sub2();
	}
	return class511_sub1;
    }
    
    abstract void method8509(int i);
    
    abstract long method8510(int i);
    
    final int method8511(long l) {
	long l_0_ = method8510(-2125193903);
	if (l_0_ > 0L)
	    Class229.method4381(l_0_);
	return method8519(l);
    }
    
    abstract long method8512(byte i);
    
    public static Class511 method8513() {
	Class511_Sub1 class511_sub1;
	try {
	    class511_sub1 = new Class511_Sub1();
	} catch (Throwable throwable) {
	    return new Class511_Sub2();
	}
	return class511_sub1;
    }
    
    abstract long method8514();
    
    abstract long method8515();
    
    abstract long method8516();
    
    public static Class511 method8517() {
	Class511_Sub1 class511_sub1;
	try {
	    class511_sub1 = new Class511_Sub1();
	} catch (Throwable throwable) {
	    return new Class511_Sub2();
	}
	return class511_sub1;
    }
    
    Class511() {
	/* empty */
    }
    
    abstract int method8518(long l);
    
    abstract int method8519(long l);
    
    abstract int method8520(long l);
    
    abstract void method8521();
    
    final int method8522(long l) {
	long l_1_ = method8510(-2113537651);
	if (l_1_ > 0L)
	    Class229.method4381(l_1_);
	return method8519(l);
    }
    
    final int method8523(long l) {
	long l_2_ = method8510(-2141015898);
	if (l_2_ > 0L)
	    Class229.method4381(l_2_);
	return method8519(l);
    }
    
    public static void method8524(boolean bool, boolean bool_3_, byte i) {
	if (bool) {
	    Class639.anInt8317 -= -1740306889;
	    if (0 == 57118599 * Class639.anInt8317)
		Class381.anIntArray3929 = null;
	}
	if (bool_3_) {
	    Class639.anInt8318 -= -114268357;
	    if (0 == 1742199283 * Class639.anInt8318)
		Class642.anIntArray8324 = null;
	}
    }
    
    static final void method8525(Class683 class683, byte i) {
	int i_4_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_4_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_4_ >> 16];
	Class407.method6635(class259, class245, class683, -781303770);
    }
    
    static final void method8526(Class259 class259, Class245 class245,
				 Class683 class683, short i) {
	String string
	    = (String) (class683.anObjectArray8636
			[(class683.anInt8644 -= 1285561025) * 1373599041]);
	if (Class558.method9375(string, class683, (byte) 3) != null)
	    string = string.substring(0, string.length() - 1);
	class259.anObjectArray2616
	    = Class656_Sub1_Sub5_Sub1.method18727(string, class683,
						  -1040479835);
	class259.aBool2695 = true;
    }
    
    static final void method8527(Class683 class683, int i) {
	Class666.anInt8572 = 0;
    }
    
    static final void method8528(Class683 class683, byte i) {
	Class626.method10259(-2055935949);
    }
    
    public static Class2 method8529(ItemDefinitions class8,
                                    RSBuffer class525_sub38, int i) {
	return Class175_Sub2.method15603(class8, class525_sub38, 2, -24762962);
    }
    
    static final void method8530(Class683 class683, short i) {
	int i_5_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = class683.aClass353_8652.aByteArray3772[i_5_];
    }
    
    public static int method8531(Class429 class429, int i) {
	Class446 class446 = Class446.method7208(0.0F, 0.0F, 1.0F);
	class446.method7239(class429);
	double d
	    = 1.5707963267948966 - Math.acos((double) class446.aFloat4896);
	class446.method7260();
	if (d < 0.0)
	    d = 3.141592653589793 + (d + 3.141592653589793);
	return (int) (d / 6.283185307179586 * 16384.0) & 0x3fff;
    }
}
